#!/usr/bin/env python3
"""Static audit comparing recovered Java produced by two independent decompilers.

This NEVER edits original ClientSRC/ or ClientDev/src/ and never executes LyMeowz.jar.
"""
from __future__ import annotations
import re
import sys
from collections import Counter
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
BASE = ROOT / "ClientDev" / "src"
ALT = Path(sys.argv[1]).resolve()
LOG = Path(sys.argv[2]).resolve()
OUTPUT = ROOT / "ClientDev" / "reports" / "decompiler-comparison.md"


def read_stats(folder: Path):
    classes = sorted(folder.rglob("*.java"))
    info = {}
    for path in classes:
        txt = path.read_text(encoding="utf-8", errors="replace")
        info[path.name] = {
            "gotos": len(re.findall(r"\*\*\s+GOTO\b", txt)),
            "goto_labels": len(re.findall(r"(?m)^\s*lbl\d+:\s*$", txt)),
            "todo": len(re.findall(r"(?i)(could not decompile|couldn't be decompiled|could not be decompiled|decompilation failed)", txt)),
            "bytes": len(txt.encode("utf-8")),
        }
    return info


def main():
    primary, alt = read_stats(BASE), read_stats(ALT)
    errs = Counter()
    details = []
    data = LOG.read_text(encoding="utf-8", errors="replace") if LOG.exists() else ""
    for ln in data.splitlines():
        m = re.search(r"([^/\\\s]+\.java):(\d+): error: (.*)$", ln)
        if m:
            message = m.group(3)
            if "expected" in message or "illegal" in message or "not a statement" in message:
                cat = "syntax"
            elif "cannot find symbol" in message:
                cat = "missing symbol"
            elif "already defined" in message:
                cat = "duplicate symbol"
            elif "does not exist" in message:
                cat = "missing package"
            else:
                cat = "other"
            errs[cat] += 1
            if len(details) < 12:
                details.append(f"- `{m.group(1)}:{m.group(2)}` — {cat}")

    all_keys = sorted(set(primary) | set(alt))
    noteworthy = []
    for name in all_keys:
        a, b = primary.get(name), alt.get(name)
        if a and b and (a["gotos"] != b["gotos"] or a["todo"] != b["todo"]):
            noteworthy.append((a["gotos"] - b["gotos"], name, a["gotos"], b["gotos"], a["todo"], b["todo"]))
    noteworthy.sort(reverse=True)
    candidate = alt.get("I1I1.java")
    base = primary.get("I1I1.java")
    rows = [
        "# So sánh trình dịch ngược: CFR 0.152 và Vineflower 1.12.0",
        "",
        "Đây là **thử nghiệm khôi phục SRC**, không chứng minh tính tương đương bytecode hay khả năng chạy game.",
        "",
        "| Chỉ số | CFR (ClientDev/src) | Vineflower (thử nghiệm) |",
        "|---|---:|---:|",
        f"| Số file .java | {len(primary)} | {len(alt)} |",
        f"| Số câu lệnh `** GOTO` không hợp lệ | {sum(x['gotos'] for x in primary.values())} | {sum(x['gotos'] for x in alt.values())} |",
        f"| Số dấu hiệu lỗi dịch ngược | {sum(x['todo'] for x in primary.values())} | {sum(x['todo'] for x in alt.values())} |",
        f"| `I1I1.java` — `** GOTO` | {base['gotos'] if base else 'missing'} | {candidate['gotos'] if candidate else 'missing'} |",
        "",
        "## Kiểm tra cú pháp trên toàn bộ Vineflower candidate",
        "",
        f"- Kết quả javac: **{'PASS' if 'COMPILER_EXIT_CODE=0' in data else 'FAIL or not run'}**",
        f"- Số chẩn đoán javac: **{sum(errs.values())}** (giới hạn -Xmaxerrs)",
        "",
        "| Loại lỗi | Số lượng |",
        "|---|---:|",
    ]
    for k, v in errs.most_common():
        rows.append(f"| {k} | {v} |")
    rows += ["", "Một số vị trí lỗi (không đưa source/host/token vào report):"]
    rows += details or ["- Chưa có chẩn đoán javac."]
    rows += [
        "",
        "## Những file cải thiện rõ về lỗi điều khiển luồng",
        "",
        "| Class | CFR GOTO | Vineflower GOTO | CFR dấu lỗi | Vineflower dấu lỗi |",
        "|---|---:|---:|---:|---:|",
    ]
    for _, name, a, b, ac, bc in noteworthy[:30]:
        rows.append(f"| `{name}` | {a} | {b} | {ac} | {bc} |")
    rows += [
        "",
        "## Kết luận",
        "",
        "- **Không gộp** Java Vineflower đè lên CFR tự động; tên method/field có thể lệch nhau.",
        "- Nếu file Vineflower tốt hơn, có thể thay theo nhóm class liên quan hoặc xây phiên bản đồng bộ sau khi đối chiếu.",
        "- Lỗi compiler của toàn dự án còn liên quan tới Java ME, obfuscation, class nằm khác package, và cú pháp bytecode khó khôi phục.",
        "- Chỉ xác nhận client hoạt động sau khi build thành công và test trong MIDP emulator với server thử nghiệm được cho phép.",
    ]
    OUTPUT.parent.mkdir(parents=True, exist_ok=True)
    OUTPUT.write_text("\n".join(rows) + "\n", encoding="utf-8")
    print(f"CFR_FILES={len(primary)} VINE_FILES={len(alt)}")
    print(f"CFR_GOTOS={sum(x['gotos'] for x in primary.values())} VINE_GOTOS={sum(x['gotos'] for x in alt.values())}")
    print(f"REPORT={OUTPUT}")


if __name__ == "__main__":
    main()
