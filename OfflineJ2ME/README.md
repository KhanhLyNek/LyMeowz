# LyMeowz Offline J2ME (Phase 1)

Source of a standalone Java ME MIDlet ported gradually from LyMeowz data. **This is a demo, not the original full client.**

- No network socket, no MySQL, no Termux, no background server. Actions call `LocalGameService` functions.
- CLDC 1.1 / MIDP 2.0 JAR/JAD. MIDlet main class: `game.OfflineMidlet`.
- 2/4/6/8: move; 5: attack demo monster; #: NPC menu; *: RMS save; 0: exit.
- Map transitions use menu data from `Server/resources/KhanhDTK/menunpc.txt`. Supports Earth (24), Namek (25), Xayda (26).
- All three maps currently draw the **same temporary ASCII grid**. The combat/reward code is illustrative and is **not reconstructed from Server.jar**.
- Java source is new and self-contained, but only the known fields/menus of the repo have been ported. Original game server logic is NOT included.

## Build

Run `sh build.sh` in this directory using **JDK 21** on Linux/CI. It compiles source against **test-only Java ME API stubs** (excluded from the final JAR), rewrites Java 8 bytecode to legacy Java 1.1 version 45 + StackMap, creates JAR/JAD, and runs PC logic tests.

Output: `dist/LyMeowz-Offline-J2ME.jar` and `dist/LyMeowz-Offline-J2ME.jad`.

**Caution:** Bytecode translation and tests on Java SE do not replace validation with the official Wireless Toolkit preverifier or testing in J2ME Loader. Actual runtime compatibility is still unverified.
