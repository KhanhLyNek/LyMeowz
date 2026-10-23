#!/usr/bin/env bash
# Offline runtime smoke tests. Never invoke the real game's startApp/login.
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/../.." && pwd)"
cd "$ROOT"
bash ClientDev/overlay/build.sh
DEV=ClientDev/overlay
BUILD="$DEV/.build"
TEST="$BUILD/smoke"
LIB="$TEST/lib"
mkdir -p "$TEST/classes" "$TEST/fixture-original" "$TEST/patched/main" "$TEST/runner" "$LIB"
for artifact in cldcapi11 midpapi20; do
  if [ ! -s "$LIB/$artifact.jar" ]; then
    curl --fail --location --retry 3 --silent --show-error \
      "https://repo.maven.apache.org/maven2/org/microemu/$artifact/2.0.4/$artifact-2.0.4.jar" \
      -o "$LIB/$artifact.jar"
  fi
done

echo "TEST 1: link actual patched GameMidlet without running it"
javac --release 8 -encoding UTF-8 -d "$TEST/classes" \
  "$DEV/src/test/java/dev/lymeowz/build/ClientLinkSmokeTest.java"
java -cp "$TEST/classes" dev.lymeowz.build.ClientLinkSmokeTest \
  "$DEV/dist/LyMeowz-ClientDev-Overlay.jar" \
  "$LIB/cldcapi11.jar" "$LIB/midpapi20.jar" \
  "[ClientDev] Bytecode overlay loaded"

echo "TEST 2: execute hook only in a synthetic offline fixture"
javac --release 8 -encoding UTF-8 -d "$TEST/fixture-original" \
  "$DEV/src/test/fixture/main/GameMidlet.java"
jar cf "$TEST/fixture.jar" -C "$TEST/fixture-original" .
java -cp "$BUILD/asm-9.7.1.jar:$BUILD/tools" dev.lymeowz.build.PatchMidlet \
  "$TEST/fixture.jar" "$TEST/patched/main/GameMidlet.class"
javac --release 8 -encoding UTF-8 -d "$TEST/runner" \
  -cp "$TEST/patched:$BUILD/hook" \
  "$DEV/src/test/java/dev/lymeowz/build/FixtureRunner.java"
java -cp "$TEST/patched:$BUILD/hook:$TEST/runner" dev.lymeowz.build.FixtureRunner

echo "PASS: actual JAR linked, extension invoked independently, synthetic startup test passed"
echo "NOTE: actual NRO startApp / networking / gameplay never executed"
