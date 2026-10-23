#!/usr/bin/env python3
"""Repackage the original JAR, changing only the MIDlet class and adding one hook.

No game class is loaded or executed. Performs a byte-for-byte comparison of
all unmodified ZIP members, refusing duplicate paths or signed input archives.
"""
from __future__ import annotations

import hashlib
import os
import sys
import zipfile
from pathlib import Path

MIDLET = "main/GameMidlet.class"
HOOK = "dev/lymeowz/client/BuildHook.class"


def sha256(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def main() -> None:
    if len(sys.argv) != 5:
        raise SystemExit("Usage: assemble.py original.jar patched-midlet.class BuildHook.class result.jar")
    source_path, patched_path, hook_path, output_path = map(Path, sys.argv[1:])
    patched = patched_path.read_bytes()
    hook = hook_path.read_bytes()
    out = output_path
    out.parent.mkdir(parents=True, exist_ok=True)
    if out.resolve() == source_path.resolve():
        raise SystemExit("Never overwrite original LyMeowz.jar")
    if not patched.startswith(b"\xca\xfe\xba\xbe") or not hook.startswith(b"\xca\xfe\xba\xbe"):
        raise SystemExit("Invalid classfile magic")
    with zipfile.ZipFile(source_path, "r") as old:
        if old.testzip() is not None:
            raise SystemExit("Input JAR ZIP failed CRC verification")
        entries = old.infolist()
        names = [item.filename for item in entries]
        if len(names) != len(set(names)):
            raise SystemExit("Refusing original archive with duplicate ZIP names")
        if MIDLET not in names or HOOK in names:
            raise SystemExit("Input archive is missing target or already contains hook")
        signatures = [p for p in names if p.upper().startswith("META-INF/") and
                      p.upper().endswith((".SF", ".RSA", ".DSA", ".EC"))]
        if signatures:
            raise SystemExit("Refusing to rewrite signed game archive")
        if any(p.startswith("/") or ".." in p.split("/") for p in names):
            raise SystemExit("Unsafe ZIP entry name")
        original_midlet = old.read(MIDLET)
        if patched == original_midlet:
            raise SystemExit("MIDlet class was not changed")
        with zipfile.ZipFile(out, "w") as target:
            target.comment = old.comment
            for entry in entries:
                content = patched if entry.filename == MIDLET else old.read(entry)
                target.writestr(entry, content)
            target.writestr(HOOK, hook, compress_type=zipfile.ZIP_DEFLATED)

    with zipfile.ZipFile(source_path) as old, zipfile.ZipFile(out) as new:
        original_names = set(old.namelist())
        new_names = set(new.namelist())
        if new_names != original_names | {HOOK}:
            raise SystemExit("Output archive entry mismatch")
        changed = [p for p in sorted(original_names) if old.read(p) != new.read(p)]
        if changed != [MIDLET]:
            raise SystemExit("Unexpected modified original entries: " + str(changed[:10]))
        if new.read(HOOK) != hook:
            raise SystemExit("Injected hook differs from compiled class")
        for p in ("META-INF/MANIFEST.MF", MIDLET, HOOK):
            if p not in new_names:
                raise SystemExit("Missing required item: " + p)
        assert len([p for p in original_names if p.endswith(".class")]) == 351
        assert len([p for p in new_names if p.endswith(".class")]) == 352
        print("PASS: unchanged original ZIP resources and 350 original classes")
        print("PASS: changed class: " + MIDLET)
        print("PASS: added class: " + HOOK)
        print("Original SHA256:", sha256(source_path.read_bytes()))
        print("Overlay SHA256:", sha256(out.read_bytes()))
        print("Overlay class count: 352")


if __name__ == "__main__":
    main()
