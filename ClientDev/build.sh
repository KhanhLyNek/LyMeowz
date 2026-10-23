#!/usr/bin/env bash
# Build/probe recovered LyMeowz MIDP/CLDC client with reproducible API stubs.
# Usage: bash ClientDev/build.sh [--probe]
# --probe writes a report and returns 0 even when javac rejects recovered code.
set -euo pipefail
cd "$(dirname "$0")/.."
ROOT="$(pwd)"
DEV="$ROOT/ClientDev"
LIB="$DEV/.lib"
OUT="$DEV/.build"
REPORT="$DEV/reports"
mkdir -p "$LIB" "$OUT/classes" "$REPORT" "$DEV/dist"
MODE="${1:-}"
BASE="https://repo.maven.apache.org/maven2/org/microemu"
for artifact in cldcapi11 midpapi20; do
  JAR="$LIB/${artifact}-2.0.4.jar"
  if [ ! -s "$JAR" ]; then
    curl --fail --location --retry 3 --silent --show-error \
      "$BASE/$artifact/2.0.4/${artifact}-2.0.4.jar" -o "$JAR"
  fi
done
find "$DEV/src" -type f -name '*.java' -print | sort > "$OUT/sources.txt"
COUNT="$(wc -l < "$OUT/sources.txt")"
if [ "$COUNT" -lt 200 ]; then
  echo "Expected at least 200 Java files, found $COUNT" >&2
  exit 2
fi
set +e
javac --release 8 -encoding UTF-8 -Xmaxerrs 300 \
  -cp "$LIB/cldcapi11-2.0.4.jar:$LIB/midpapi20-2.0.4.jar" \
  -d "$OUT/classes" @"$OUT/sources.txt" > "$OUT/javac.log" 2>&1
RESULT="$?"
set -e
python3 "$DEV/tools/compile_report.py" "$OUT/javac.log" "$RESULT" "$COUNT" "$REPORT/compile.md"
if [ "$RESULT" -eq 0 ]; then
  mkdir -p "$OUT/resources"
  cp -a "$ROOT/ClientSRC/resources/." "$OUT/resources/"
  rm -f "$OUT/resources/META-INF/MANIFEST.MF"
  jar cfm "$DEV/dist/LyMeowz-Rebuilt.jar" \
    "$ROOT/ClientSRC/resources/META-INF/MANIFEST.MF" \
    -C "$OUT/classes" . -C "$OUT/resources" .
  echo "Build succeeded: ClientDev/dist/LyMeowz-Rebuilt.jar"
  exit 0
fi
echo "Compile not yet successful, see ClientDev/reports/compile.md"
if [ "$MODE" = "--probe" ]; then
  exit 0
fi
exit "$RESULT"
