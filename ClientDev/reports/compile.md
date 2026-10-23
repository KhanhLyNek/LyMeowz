# Java ME build probe

- Sources: **260**
- Target: **Java 8 compiler language level** with MicroEmulator MIDP 2.0 / CLDC 1.1 API stubs
- Result: **FAIL (exit 1)**
- Captured compiler diagnostics: **270** (javac -Xmaxerrs 300)

## Error classes

| Category | Count |
|---|---:|
| illegal syntax | 122 |
| syntax | 115 |
| invalid statement | 31 |
| other javac error | 2 |

## Representative locations (no source content)

- `I1I1.java:353` — illegal syntax
- `I1I1.java:353` — illegal syntax
- `I1I1.java:353` — syntax
- `I1I1.java:358` — illegal syntax
- `I1I1.java:358` — illegal syntax
- `I1I1.java:358` — syntax
- `I1I1.java:359` — syntax
- `I1I1.java:369` — illegal syntax
- `I1I1.java:369` — illegal syntax
- `I1I1.java:369` — syntax
- `I1I1.java:370` — syntax
- `I1I1.java:374` — illegal syntax
- `I1I1.java:374` — illegal syntax
- `I1I1.java:374` — syntax
- `I1I1.java:374` — invalid statement
- `I1I1.java:374` — syntax
- `I1I1.java:375` — illegal syntax
- `I1I1.java:375` — illegal syntax
- `I1I1.java:375` — syntax
- `I1I1.java:375` — invalid statement
- `I1I1.java:375` — syntax
- `I1I1.java:382` — illegal syntax
- `I1I1.java:382` — illegal syntax
- `I1I1.java:382` — syntax
- `I1I1.java:383` — syntax
- `I1I1.java:968` — illegal syntax
- `I1I1.java:968` — illegal syntax
- `I1I1.java:968` — illegal syntax
- `I1I1.java:1013` — illegal syntax
- `I1I1.java:1013` — illegal syntax
- `I1I1.java:1013` — syntax
- `I1I1.java:1014` — syntax
- `I1I1.java:1480` — illegal syntax
- `I1I1.java:1480` — illegal syntax
- `I1I1.java:1480` — syntax
- `I1I1.java:1481` — syntax
- `I1I1.java:1482` — illegal syntax
- `I1I1.java:1482` — illegal syntax
- `I1I1.java:1482` — syntax
- `I1I1.java:1490` — illegal syntax
- `I1I1.java:1490` — illegal syntax
- `I1I1.java:1490` — syntax
- `I1I1.java:1491` — syntax
- `I1I1.java:2077` — illegal syntax
- `I1I1.java:2077` — illegal syntax
- `I1I1.java:2077` — syntax
- `I1I1.java:2082` — illegal syntax
- `I1I1.java:2082` — illegal syntax
- `I1I1.java:2082` — syntax
- `I1I1.java:2083` — syntax
- `I1I1.java:2086` — illegal syntax
- `I1I1.java:2086` — illegal syntax
- `I1I1.java:2086` — syntax
- `I1I1.java:2091` — illegal syntax
- `I1I1.java:2091` — illegal syntax
- `I1I1.java:2091` — syntax
- `I1I1.java:2092` — syntax
- `I1I1.java:2634` — illegal syntax
- `I1I1.java:2634` — illegal syntax
- `I1I1.java:2634` — syntax

## Next actions

- Audit the first duplicate/illegal member errors and rerun CFR with alternative flags.
- Investigate missing packages and incompatible references before code renaming.
- A successful javac check is only compilation, not verification on a real Java ME runtime.
