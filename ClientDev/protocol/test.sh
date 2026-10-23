#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/../.."
ROOT="$(pwd)"
OUT="$ROOT/ClientDev/.build/protocol-tests"
mkdir -p "$OUT"
javac --release 8 -encoding UTF-8 -Xlint:-options -d "$OUT" \
  ClientDev/protocol/src/dev/lymeowz/net/PacketFraming.java \
  ClientDev/protocol/test/dev/lymeowz/net/PacketFramingTest.java
java -ea -cp "$OUT" dev.lymeowz.net.PacketFramingTest
