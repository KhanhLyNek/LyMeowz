# Isolated compilation of I1I1.java

Test uses the original JAR as a **classpath dependency**, not as executable code.
It does not require all 260 recovered classes to compile.

| Recovered source | Compiler passed | Diagnostic count | Syntax | Duplicate members | Missing reference | Type mismatch | Other |
|---|---|---:|---:|---:|---:|---:|---:|
| CFR original | NO | 107 | 106 | 0 | 0 | 0 | 1 |
| Procyon | NO | 500 | 0 | 3 | 19 | 19 | 412 |

## Representative error locations

**CFR original:** `I1I1.java:354` [illegal syntax], `I1I1.java:354` [illegal syntax], `I1I1.java:354` [illegal syntax], `I1I1.java:359` [illegal syntax], `I1I1.java:359` [illegal syntax], `I1I1.java:359` [illegal syntax], `I1I1.java:360` [illegal syntax], `I1I1.java:370` [illegal syntax], `I1I1.java:370` [illegal syntax], `I1I1.java:370` [illegal syntax], `I1I1.java:371` [illegal syntax], `I1I1.java:375` [illegal syntax]
**Procyon:** `I1I1.java:15` [duplicate members], `I1I1.java:17` [duplicate members], `I1I1.java:5187` [duplicate members], `I1I1.java:22` [other compiler errors], `I1I1.java:22` [other compiler errors], `I1I1.java:23` [other compiler errors], `I1I1.java:23` [type mismatch], `I1I1.java:25` [other compiler errors], `I1I1.java:35` [visibility], `I1I1.java:35` [type mismatch], `I1I1.java:39` [visibility], `I1I1.java:51` [other compiler errors]

## Interpretation

- **Procyon removing `** GOTO` does not prove syntactically valid Java.**
- A single class may have duplicate field names, obfuscation artifacts, or invalid `null` placeholders.
- A classpath-backed isolated compile is more informative than blindly splicing files across decompilers.
- Only consider integrating changes after matching dependent member names and testing a consistent compilation.
