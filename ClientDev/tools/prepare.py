#!/usr/bin/env python3
"""Prepare an editable Java ME workbench without changing the forensic ClientSRC copy.

The compiled archive contains default-package classes referenced by a packaged
MIDlet. Moving those classes into 'main' is a deliberate *experimental*
source-layout normalization, not a claim of binary compatibility.
"""
from __future__ import annotations

import re
from collections import Counter
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
SRC = ROOT / "ClientDev" / "src"
REPORTS = ROOT / "ClientDev" / "reports"
MANIFEST = ROOT / "ClientSRC" / "resources" / "META-INF" / "MANIFEST.MF"
NETWORK_SYMBOLS = {
    "Connector.open": r"\bConnector\.open\s*\(",
    "SocketConnection": r"\bSocketConnection\b",
    "StreamConnection": r"\bStreamConnection\b",
    "DataInputStream": r"\bDataInputStream\b",
    "DataOutputStream": r"\bDataOutputStream\b",
    "readByte": r"\.readByte\s*\(",
    "readUnsignedByte": r"\.readUnsignedByte\s*\(",
    "readShort": r"\.readShort\s*\(",
    "readInt": r"\.readInt\s*\(",
    "readUTF": r"\.readUTF\s*\(",
    "writeByte": r"\.writeByte\s*\(",
    "writeShort": r"\.writeShort\s*\(",
    "writeInt": r"\.writeInt\s*\(",
    "writeUTF": r"\.writeUTF\s*\(",
    "flush": r"\.flush\s*\(",
}
IMPORT_PATTERN = re.compile(r"(?m)^\s*import\s+([\w.]+)\s*;")
CASE_PATTERN = re.compile(r"\bcase\s+(-?\d+)\s*:")


def main() -> None:
    REPORTS.mkdir(parents=True, exist_ok=True)
    paths = sorted(SRC.rglob("*.java"))
    if len(paths) < 200:
        raise SystemExit("Unexpectedly few Java sources; refusing incomplete report")
    pkg_added = []
    imports = Counter()
    scores = []
    errors = Counter()
    handler_cases = []
    all_classes = {}
    for path in paths:
        body = path.read_text(encoding="utf-8")
        rel = path.relative_to(SRC).as_posix()
        if path.parent == SRC and not re.search(r"(?m)^\s*package\s+\w+", body):
            body = "package main;\n\n" + body
            path.write_text(body, encoding="utf-8")
            pkg_added.append(rel)
        for i in IMPORT_PATTERN.findall(body):
            imports[i.split(".")[0]] += 1
        found = {label: len(re.findall(pattern, body)) for label, pattern in NETWORK_SYMBOLS.items()}
        relevant = {k: v for k, v in found.items() if v}
        score = sum(v for k, v in relevant.items() if k not in {"DataInputStream", "DataOutputStream", "flush"})
        if relevant:
            scores.append((score, rel, relevant))
        for cls in re.findall(r"Could not load the following classes:([\s\S]*?)\*/", body):
            for candidate in re.findall(r"\*\s+([a-zA-Z_$][\w.$]+)", cls):
                errors[candidate] += 1
        if "Duplicate member names" in body:
            errors["[CFR duplicate member warnings]"] += 1
        cases = sorted(set(int(n) for n in CASE_PATTERN.findall(body)))
        if len(cases) >= 8:
            handler_cases.append((len(cases), rel, cases))
        all_classes[rel] = body

    lines = [
        "# Phân tích mã nguồn Client NRO",
        "",
        f"- Java được dịch ngược: **{len(paths)}** file",
        f"- Class mặc định được tạm đặt vào package `main`: **{len(pkg_added)}**",
        "- Package được điều chỉnh **chỉ trong ClientDev**, không sửa ClientSRC.",
        "- Tên class/phương thức obfuscate được giữ nguyên để tránh phá vỡ liên kết.",
        "- Bản này vẫn cần kiểm tra biên dịch và runtime, không phải source gốc.",
        "",
        "## Phụ thuộc import (theo tiền tố)",
        "",
        "| Namespace | Số import |",
        "|---|---:|",
    ]
    for k, v in imports.most_common(18):
        lines.append(f"| `{k}` | {v} |")
    lines += ["", "## Cảnh báo trong output của decompiler", ""]
    for k, v in errors.most_common(20):
        lines.append(f"- `{k}`: {v} occurrence(s)")
    (REPORTS / "source-audit.md").write_text("\n".join(lines) + "\n", encoding="utf-8")

    proto = [
        "# Phân tích giao thức mạng Client NRO (đợt 1)",
        "",
        "Tài liệu dựa trên dấu hiệu tĩnh của Java được dịch ngược; **chưa kiểm chứng bằng gói tin thực tế**.",
        "Không ghi địa chỉ máy chủ, token hoặc khóa vào báo cáo.",
        "",
        "## Mốc khởi tạo",
        "",
        "- `main/GameMidlet.java`: MIDlet entry point (theo manifest trong JAR).",
        "- `nrolite/DataDownloader.java`: luồng tải tài nguyên; không mặc định coi đây là socket game.",
        "",
        "## Các class cần đọc trước khi sửa giao thức",
        "",
        "| Class | Chỉ dấu I/O tìm thấy |",
        "|---|---|",
    ]
    for _, rel, found in sorted(scores, key=lambda x: (-x[0], x[1]))[:35]:
        markers = ", ".join(f"{k} ({v})" for k, v in sorted(found.items()))
        proto.append(f"| `{rel}` | {markers} |")
    proto += [
        "",
        "## Dấu hiệu xử lý command (switch/case)",
        "",
        "Các số bên dưới là **nhãn case** trong code, không mặc định là opcode mạng.",
        "",
        "| Class | Số nhãn case phân biệt | Giá trị nhỏ nhất | Giá trị lớn nhất |",
        "|---|---:|---:|---:|",
    ]
    for n, rel, arr in sorted(handler_cases, key=lambda x: -x[0])[:20]:
        proto.append(f"| `{rel}` | {n} | {min(arr)} | {max(arr)} |")
    proto += [
        "",
        "## Chưa xác minh",
        "",
        "- Handshake, thuật toán mã hóa packet, chiều dài packet, mã command, mapping server response.",
        "- IP/port, danh sách server, và khả năng kết nối với `Server/Server.jar`.",
        "- Cần đọc mã của lớp đọc/ghi socket và kiểm tra một session thử nghiệm được phép.",
        "",
        "## Nguyên tắc cải tiến",
        "",
        "- Phân tách rõ NetTransport, PacketCodec, CommandRouter và GameState trước khi đổi protocol.",
        "- Đặt timeout, giới hạn kích thước packet và validate dữ liệu trên server.",
        "- Chưa đổi tên hàng loạt class obfuscate; chỉ chuyển dần khi có test.",
    ]
    (REPORTS / "protocol-analysis.md").write_text("\n".join(proto) + "\n", encoding="utf-8")
    entry = MANIFEST.read_text(encoding="utf-8", errors="replace")
    midlet = re.search(r"(?m)^MIDlet-1:\s*(.*)$", entry)
    (REPORTS / "architecture.md").write_text(
        "# Kiến trúc ClientDev\n\n"
        f"Original MIDlet: `{midlet.group(1).strip() if midlet else 'unresolved'}`\n\n"
        "## Thư mục\n\n"
        "- `ClientSRC/src`: mã decompile lần đầu, giữ nguyên để đối chiếu.\n"
        "- `ClientDev/src`: bản CFR có xử lý duplicate members + gộp default package (thử nghiệm).\n"
        "- `ClientSRC/resources`: tài nguyên JAR sử dụng lại khi build.\n"
        "- `ClientDev/build.sh`: thử biên dịch với MIDP 2.0 / CLDC 1.1 API.\n"
        "- `ClientDev/reports`: các báo cáo tĩnh và kết quả compile.\n\n"
        "## Lưu ý giới hạn\n\n"
        "Các class mặc định từ bytecode được đưa vào package `main` để cho phép "
        "tham chiếu từ `main.GameMidlet`. Đây là thay đổi tên nhị phân, "
        "có thể ảnh hưởng reflection, tài nguyên và kết nối; không thể coi là "
        "bản thay thế cho file JAR ban đầu nếu chưa thử nghiệm.\n"
        "Không chạy client chưa được audit với tài khoản/dữ liệu nhạy cảm.\n",
        encoding="utf-8",
    )
    print(f"Audited {len(paths)} Java files; normalized package on {len(pkg_added)} files")
    print("Network candidates:", [rel for _, rel, _ in sorted(scores, reverse=True)[:8]])


if __name__ == "__main__":
    main()
