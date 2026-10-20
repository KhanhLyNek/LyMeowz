#!/bin/sh
set -eu
cd "$(dirname "$0")"
mkdir -p build/classes build/cldc dist
# Tests/stubs are compile-time stand-ins for Java ME APIs. They are NOT packed in the JAR.
javac --release 8 -Xlint:-options -encoding UTF-8 -d build/classes $(find src tests/stubs -name '*.java')
JFLAGS='--add-exports java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED --add-exports java.base/jdk.internal.org.objectweb.asm.commons=ALL-UNNAMED'
javac $JFLAGS -d build/classes tools/ConvertCLDC.java
java $JFLAGS -cp build/classes ConvertCLDC build/classes build/cldc
mkdir -p build/cldc/data/maps build/cldc/data/npc
cp data/maps/1.txt build/cldc/data/maps/1.txt
# The real NPC-menu data is already in this GitHub repository.
cp ../Server/resources/KhanhDTK/menunpc.txt build/cldc/data/npc/menunpc.txt
jar cfm dist/LyMeowz-Offline-J2ME.jar MANIFEST.MF -C build/cldc .
bytes=$(wc -c < dist/LyMeowz-Offline-J2ME.jar | tr -d ' ')
cat > dist/LyMeowz-Offline-J2ME.jad <<EOF
MIDlet-1: LyMeowz Offline, , game.OfflineMidlet
MIDlet-Name: LyMeowz Offline
MIDlet-Version: 0.2.0
MIDlet-Vendor: LyMeowz
MicroEdition-Configuration: CLDC-1.1
MicroEdition-Profile: MIDP-2.0
MIDlet-Jar-URL: LyMeowz-Offline-J2ME.jar
MIDlet-Jar-Size: $bytes
EOF
javac --release 8 -Xlint:-options -encoding UTF-8 -cp build/cldc:build/classes -d build/classes tests/OfflineLogicTest.java
java -cp build/cldc:build/classes OfflineLogicTest
echo "Built dist/LyMeowz-Offline-J2ME.jar ($bytes bytes)"
