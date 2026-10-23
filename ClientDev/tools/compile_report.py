#!/usr/bin/env python3
"""Make a safe, concise diagnostic summary (no source lines or endpoints)."""
import re
import sys
from collections import Counter
from pathlib import Path


def main() -> None:
    logfile, status, count, dest = sys.argv[1:5]
    lines = Path(logfile).read_text(encoding="utf-8", errors="replace").splitlines()
    status = int(status)
    pattern = re.compile(r"^(.*?\.java):(\d+): error: (.*)$")
    matches = []
    for line in lines:
        m = pattern.match(line)
        if m:
            source = Path(m.group(1)).name
            detail = m.group(3).strip()
            # Only retain a controlled error category, never literal source lines.
            if "cannot find symbol" in detail:
                category = "cannot find symbol"
            elif "already defined" in detail:
                category = "duplicate member"
            elif "incompatible types" in detail:
                category = "incompatible types"
            elif "does not exist" in detail:
                category = "missing package"
            elif "cannot be accessed" in detail or "has private access" in detail:
                category = "visibility issue"
            elif "reference to" in detail and "is ambiguous" in detail:
                category = "ambiguous reference"
            elif "';' expected" in detail:
                category = "syntax"
            elif "not a statement" in detail:
                category = "invalid statement"
            elif "illegal" in detail:
                category = "illegal syntax"
            else:
                category = "other javac error"
            matches.append((source, m.group(2), category))
    types = Counter(x[2] for x in matches)
    text = [
        "# Java ME build probe",
        "",
        f"- Sources: **{count}**",
        "- Target: **Java 8 compiler language level** with MicroEmulator MIDP 2.0 / CLDC 1.1 API stubs",
        f"- Result: **{'PASS' if status == 0 else 'FAIL (exit '+str(status)+')'}**",
        f"- Captured compiler diagnostics: **{len(matches)}** (javac -Xmaxerrs 300)",
        "",
        "## Error classes",
        "",
        "| Category | Count |",
        "|---|---:|",
    ]
    text.extend(f"| {cat} | {num} |" for cat, num in types.most_common())
    text += ["", "## Representative locations (no source content)", ""]
    for src, lineno, category in matches[:60]:
        text.append(f"- `{src}:{lineno}` — {category}")
    if status != 0:
        text += [
            "",
            "## Next actions",
            "",
            "- Audit the first duplicate/illegal member errors and rerun CFR with alternative flags.",
            "- Investigate missing packages and incompatible references before code renaming.",
            "- A successful javac check is only compilation, not verification on a real Java ME runtime.",
        ]
    else:
        text += [
            "",
            "Successful javac compilation does not prove the client starts or connects.",
            "Runtime/compatibility testing is still required.",
        ]
    path = Path(dest)
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text("\n".join(text) + "\n", encoding="utf-8")


if __name__ == "__main__":
    main()
