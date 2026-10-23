#!/usr/bin/env python3
"""Inspect client JAR class versions without loading or running any bytecode."""
from __future__ import annotations
import collections
import hashlib
import struct
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
JAR = ROOT / "LyMeowz.jar"
OUT = ROOT / "ClientDev/reports/bytecode-inventory.md"
KNOWN = {45: "Java 1.1", 46: "Java 1.2", 47: "Java 1.3", 48: "Java 1.4",
         49: "Java 5", 50: "Java 6", 51: "Java 7", 52: "Java 8",
         53: "Java 9", 54: "Java 10", 55: "Java 11", 61: "Java 17",
         65: "Java 21", 66: "Java 22"}
versions = collections.Counter()
by_major = collections.defaultdict(list)
classes = 0
top_level = 0
nested = 0
sample = {}
signatures = 0
with zipfile.ZipFile(JAR) as z:
    for item in z.infolist():
        p = item.filename
        if p.upper().startswith("META-INF/") and p.upper().endswith((".SF", ".RSA", ".DSA")):
            signatures += 1
        if not p.endswith(".class") or item.is_dir():
            continue
        with z.open(item) as f:
            head = f.read(8)
        if len(head) != 8 or head[:4] != b"\xca\xfe\xba\xbe":
            raise ValueError(f"Invalid .class magic: {p}")
        minor, major = struct.unpack(">HH", head[4:8])
        classes += 1
        if "/" not in p:
            top_level += 1
        if "$" in p:
            nested += 1
        versions[(major, minor)] += 1
        by_major[major].append(p)
        if p in {"main/GameMidlet.class", "I1I1.class", "IOo_.class",
                 "IO0.class", "nrolite/DataDownloader.class"}:
            sample[p] = (major, minor)

lines = [
    "# Bytecode inventory của LyMeowz.jar", "",
    "Phân tích chỉ đọc header của các file `.class`; **không chạy** JAR.",
    f"- SHA-256: `{hashlib.sha256(JAR.read_bytes()).hexdigest()}`",
    f"- Class entries: **{classes}**",
    f"- Class không nằm trong package (JAR root): **{top_level}**",
    f"- Class có ký hiệu class lồng (`$`): **{nested}**",
    f"- Chữ ký JAR đã tìm thấy: **{signatures}**",
    "",
    "## Phiên bản classfile",
    "| Major | Minor | Java SE tương ứng (tham khảo) | Class |",
    "|---:|---:|---|---:|",
]
for (major, minor), count in sorted(versions.items()):
    lines.append(f"| {major} | {minor} | {KNOWN.get(major, 'Không rõ')} | {count} |")
lines += [
    "", "## Class quan trọng", "",
    "| Đường dẫn | Classfile major.minor |",
    "|---|---|",
]
for p, (major, minor) in sorted(sample.items()):
    lines.append(f"| `{p}` | `{major}.{minor}` |")
lines += [
    "", "## Kết luận kỹ thuật", "",
    "- `MANIFEST.MF` khai báo MIDP 2.0 và CLDC 1.1, nhưng manifest không tự chứng minh JAR chạy được trên mọi JVM/J2ME emulator.",
    "- Major version 52 là bytecode Java 8; Java ME/CLDC cổ điển thường cần toolchain và preverifier riêng.",
    "- Phải dùng đúng classfile level/runtime phù hợp với đối tượng triển khai; **javac --release 8** chỉ là phép thử cú pháp và phụ thuộc, không phải build MIDlet đã preverify.",
    "- Có thể phát triển tính năng bằng module Java độc lập, kết nối qua API đã kiểm thử, trong khi giữ nguyên binary gốc để đối chiếu.",
    "- Không khẳng định file JAR hiện tại có thể chạy trên Nokia/J2ME hoặc Android cho tới khi test bằng runtime tương ứng.",
]
OUT.parent.mkdir(parents=True, exist_ok=True)
OUT.write_text("\n".join(lines) + "\n", encoding="utf-8")
print("Classfile histogram:", dict(versions))
print("Wrote", OUT)
