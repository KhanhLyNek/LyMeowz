#!/usr/bin/env python3
"""Safe compiler diagnostic summary for isolated I1I1.java source recovery.

Does not reproduce source expressions or private endpoints in the report.
"""
from __future__ import annotations
import re
import sys
from collections import Counter
from pathlib import Path

OUTPUT = Path(sys.argv[1])
RESULTS = [(sys.argv[i], Path(sys.argv[i+1]), sys.argv[i+2]) for i in range(2, len(sys.argv), 3)]
CATEGORIES = [
    ("duplicate members", lambda m: "already defined" in m or "variable " in m and "defined" in m),
    ("illegal syntax", lambda m: "illegal" in m or "expected" in m or "not a statement" in m),
    ("missing reference", lambda m: "cannot find symbol" in m or "does not exist" in m),
    ("type mismatch", lambda m: "incompatible types" in m),
    ("visibility", lambda m: "private access" in m or "not public" in m),
    ("other compiler errors", lambda m: True),
]
rows = [
    "# Isolated compilation of I1I1.java",
    "",
    "Test uses the original JAR as a **classpath dependency**, not as executable code.",
    "It does not require all 260 recovered classes to compile.",
    "",
    "| Recovered source | Compiler passed | Diagnostic count | Syntax | Duplicate members | Missing reference | Type mismatch | Other |",
    "|---|---|---:|---:|---:|---:|---:|---:|",
]
notes = []
for title, path, code in RESULTS:
    text = path.read_text(encoding="utf-8", errors="replace")
    counts = Counter()
    first = []
    for line in text.splitlines():
        m = re.search(r"\.java:(\d+): error: (.+)$", line)
        if not m:
            continue
        msg = m.group(2)
        category = next(k for k, cb in CATEGORIES if cb(msg))
        counts[category] += 1
        if len(first) < 12:
            first.append(f"`I1I1.java:{m.group(1)}` [{category}]")
    rows.append(
        f"| {title} | {'YES' if code == '0' else 'NO'} | {sum(counts.values())} | "
        f"{counts['illegal syntax']} | {counts['duplicate members']} | "
        f"{counts['missing reference']} | {counts['type mismatch']} | "
        f"{counts['other compiler errors']} |"
    )
    notes.append((title, first))
rows += ["", "## Representative error locations", ""]
for title, locations in notes:
    rows.append(f"**{title}:** " + (", ".join(locations) if locations else "No compiler errors"))
rows += [
    "",
    "## Interpretation",
    "",
    "- **Procyon removing `** GOTO` does not prove syntactically valid Java.**",
    "- A single class may have duplicate field names, obfuscation artifacts, or invalid `null` placeholders.",
    "- A classpath-backed isolated compile is more informative than blindly splicing files across decompilers.",
    "- Only consider integrating changes after matching dependent member names and testing a consistent compilation.",
]
OUTPUT.parent.mkdir(parents=True, exist_ok=True)
OUTPUT.write_text("\n".join(rows) + "\n", encoding="utf-8")
print("Isolated comparison report generated", OUTPUT)
