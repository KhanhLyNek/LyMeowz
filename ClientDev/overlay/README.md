# LyMeowz Java 8 bytecode overlay — first working build path

This folder is an **experimental development strategy** for the existing
`LyMeowz.jar`. It does **not** claim to have reconstructed or compiled all
original client source. No need to fix 260–315 decompiled Java files before
iterating on small client features.

## What the overlay does

1. Verify SHA256 of the original JAR against `ClientSRC/SOURCE_SHA256.txt`.
2. Compile a Java 8 class `dev.lymeowz.client.BuildHook`.
3. Use ASM 9.7.1 to inject exactly one call to
   `BuildHook.announce()` at the start of
   `main.GameMidlet.startApp()V`.
4. Repackage the original archive, changing only
   `main/GameMidlet.class` and adding one class.
5. Verify all **other** original ZIP entries remain byte-identical
   and the new archive contains 352 class entries.

The injected method prints a static startup message only. It does not read
credentials, open sockets, log personal information, or touch game state.

## Build

JDK 17/21, Bash, Python 3 and curl are required.

```bash
bash ClientDev/overlay/build.sh
```

Output:
`ClientDev/overlay/dist/LyMeowz-ClientDev-Overlay.jar`

A GitHub Actions workflow builds and uploads it as an artifact; that verifies
packaging and bytecode inspection only, **not** launch or multiplayer behavior.

## Technical limitations

- **All original classfiles have major version 52.0 (Java 8)** although
  the JAR manifest advertises MIDP 2.0/CLDC 1.1. This build retains the
  same runtime requirement and is not guaranteed to run on legacy J2ME.
- This is not a decompiled-source full rebuild and not proof that a working
  NRO client can be distributed to users.
- Does not alter IP address, account authentication, or networking.
- `ClientSRC/` is preserved unchanged. Changes to the original client
  binary must be tested in an authorized runtime and checked for licensing.
- For future features, keep the hook small and add separate Java classes;
  avoid renaming obfuscated game classes until the protocol and runtime
  compatibility have automated tests.

## Next integration milestones

1. Run the rebuilt JAR on a Java 8-capable MIDP-compatible runtime and verify
   the one-time startup log without using a production account.
2. Establish separate, permissioned test server and collect **non-sensitive**
   handshake compatibility checks.
3. Only after runtime validation, build a UI or protocol extension through the
   controlled `BuildHook`; retain bytecode/reference tests.

Alternative source recoveries (CFR, Vineflower, Procyon) remain under
`ClientDev/src`, `ClientDev/VineflowerSRC` and recovery directories.

## Offline smoke tests (verified on GitHub Actions)

Run:

```bash
bash ClientDev/overlay/smoke.sh
```

Verified by [offline smoke workflow](https://github.com/KhanhLyNek/LyMeowz/actions/runs/39940981442):

- **PASS:** load actual patched `main.GameMidlet` without initialization.
- **PASS:** resolve representative original client network/data classes
  `IOo_`, `IO0`, `IO1O`, `I1I1` and `nrolite.DataDownloader`.
- **PASS:** read the embedded `META-INF/MANIFEST.MF` and `icon.png`.
- **PASS:** load and execute `BuildHook.announce()` from the built JAR.
- **PASS:** synthetic offline `GameMidlet.startApp()` fixture executes the
  injected hook exactly once **before** its harmless original print.

**This does not execute the actual NRO `GameMidlet.startApp()`.** The tests
deliberately avoid game initialization, HTTP downloads, sockets, account
credentials and production servers. The synthetic fixture is separate from
and not a substitute for testing real login, graphics or multiplayer.

After this checkpoint, the next engineering step is a **network-isolated
headless runtime harness** and explicit resource/packet interoperability tests
against a test server controlled by the repo owner.
