#!/usr/bin/env python3
"""Extract non-class resources from LyMeowz.jar and report decompilation results.

This script does not execute code from the input JAR.
"""
from __future__ import annotations

import hashlib
import shutil
import zipfile
from pathlib import Path, PurePosixPath

ROOT = Path(__file__).resolve().parents[2]
JAR = ROOT / "LyMeowz.jar"
OUTPUT = ROOT / "ClientSRC"
SRC = OUTPUT / "src"
RESOURCES = OUTPUT / "resources"


def main() -> None:
    if not JAR.is_file():
        raise SystemExit("Missing LyMeowz.jar")
    OUTPUT.mkdir(parents=True, exist_ok=True)
    RESOURCES.mkdir(parents=True, exist_ok=True)
    sha256 = hashlib.sha256(JAR.read_bytes()).hexdigest()
    (OUTPUT / "SOURCE_SHA256.txt").write_text(
        f"{sha256}  LyMeowz.jar\n", encoding="utf-8"
    )

    classes = resources = 0
    with zipfile.ZipFile(JAR) as jar:
        for item in jar.infolist():
            name = item.filename.replace("\\", "/")
            rel = PurePosixPath(name)
            if (
                item.is_dir()
                or rel.is_absolute()
                or ".." in rel.parts
                or not rel.parts
                or item.file_size > 64 * 1024 * 1024
            ):
                continue
            if name.lower().endswith(".class"):
                classes += 1
                continue
            if name.upper().startswith("META-INF/") and name.upper().endswith(
                (".SF", ".RSA", ".DSA")
            ):
                continue
            destination = RESOURCES.joinpath(*rel.parts)
            destination.parent.mkdir(parents=True, exist_ok=True)
            with jar.open(item) as source, destination.open("wb") as target:
                shutil.copyfileobj(source, target)
            resources += 1

    java_files = sum(1 for _ in SRC.rglob("*.java"))
    report = f"""# ClientSRC (reconstructed from LyMeowz.jar)

This folder is generated from the existing root-level `LyMeowz.jar`
using CFR 0.152 on GitHub Actions.

* Original archive: `LyMeowz.jar`
* Original JAR SHA-256: `{sha256}`
* Class entries found: **{classes}**
* Decompiled Java files: **{java_files}**
* Extracted non-class resource files: **{resources}**

## Layout

* `src/`: Decompiled Java source from compiled classes (best effort).
* `resources/`: Non-class resources unpacked from the JAR.
* `SOURCE_SHA256.txt`: SHA-256 of the exact input JAR.

## Limitations

Decompiler output is **not the original SRC**. Original formatting,
comments, local variable names, and some control flow may be lost.
Obfuscated classes will not regain meaningful names automatically.
This is a starting point and may require fixes before it compiles.
The accompanying `Server/Server.jar` is **not** decompiled here.
Check your rights to use and redistribute this reconstructed source.

Generation performed by `.github/workflows/decompile-lymeowz.yml`.
"""
    (OUTPUT / "README.md").write_text(report, encoding="utf-8")
    print(
        f"SHA256={sha256} class_entries={classes} "
        f"java_files={java_files} resource_files={resources}"
    )
    if classes == 0 or java_files == 0:
        raise SystemExit("Decompilation produced no Java files")


if __name__ == "__main__":
    main()
