#!/usr/bin/env bash
# Build an editable Java8 overlay on the original LyMeowz client binary.
# No source decompilation, no running client, no server connections.
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/../.." && pwd)"
cd "$ROOT"

sha256sum --check ClientSRC/SOURCE_SHA256.txt

DEV=ClientDev/overlay
BUILD="$DEV/.build"
DIST="$DEV/dist"
ASM="$BUILD/asm-9.7.1.jar"
mkdir -p "$BUILD/tools" "$BUILD/hook" "$BUILD/patch" "$DIST"

if [ ! -s "$ASM" ]; then
  curl --fail --location --retry 3 --silent --show-error \
    https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7.1/asm-9.7.1.jar \
    -o "$ASM"
fi
test "$(stat -c%s "$ASM")" -gt 100000

javac --release 8 -encoding UTF-8 -cp "$ASM" -d "$BUILD/tools" \
  "$DEV/src/main/java/dev/lymeowz/build/PatchMidlet.java"
javac --release 8 -encoding UTF-8 -d "$BUILD/hook" \
  "$DEV/src/main/java/dev/lymeowz/client/BuildHook.java"

java -cp "$ASM:$BUILD/tools" dev.lymeowz.build.PatchMidlet \
  LyMeowz.jar "$BUILD/patch/GameMidlet.class"

python3 "$DEV/tools/assemble.py" \
  LyMeowz.jar \
  "$BUILD/patch/GameMidlet.class" \
  "$BUILD/hook/dev/lymeowz/client/BuildHook.class" \
  "$DIST/LyMeowz-ClientDev-Overlay.jar"

unzip -t "$DIST/LyMeowz-ClientDev-Overlay.jar" >/dev/null
javap -classpath "$DIST/LyMeowz-ClientDev-Overlay.jar" -c -p main.GameMidlet \
  > "$BUILD/GameMidlet-javap.txt"
if ! grep -F "BuildHook.announce:()V" "$BUILD/GameMidlet-javap.txt" >/dev/null; then
  echo "ERROR: startup hook not visible in rebuilt MIDlet" >&2
  exit 1
fi

echo "PASS: compiled overlay, verified class injection and archive integrity"
echo "Artifact: $DIST/LyMeowz-ClientDev-Overlay.jar"
