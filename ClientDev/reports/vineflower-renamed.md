# Vineflower rename-members=1 compilation experiment

Alternative decompilation directly from original LyMeowz.jar, not from CFR output.

- Java files: **315**
- Invalid GOTO markers: **0**
- javac status: **FAIL (exit 4)**
- Captured javac errors: **1000** (up to 1000)
- Duplicate-name errors: **260**

| Category | Count |
|---|---:|
| missing symbol | 683 |
| duplicate members | 260 |
| other | 53 |
| type mismatch | 4 |

This experiment does not establish MIDP runtime compatibility or preserve original obfuscated binary class names.
The output is kept separate so dependency names and resource loading can be checked before replacement.
