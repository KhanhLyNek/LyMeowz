#!/usr/bin/env bash
# Cross-platform launcher smoke test (no real NRO binary or network listeners).
set -euo pipefail
REPO="$(cd "$(dirname "$0")/../.." && pwd)"
TMP="$(mktemp -d)"
cleanup() {
  if [[ -f "$HOME/nro-local/run/server.pid" ]]; then
    pid="$(cat "$HOME/nro-local/run/server.pid" 2>/dev/null || true)"
    if [[ "$pid" =~ ^[0-9]+$ ]]; then kill "$pid" 2>/dev/null || true; fi
  fi
  rm -rf "$TMP"
}
trap cleanup EXIT
export HOME="$TMP/home"
export PREFIX="$TMP/prefix"
mkdir -p "$HOME" "$PREFIX/bin"
bash "$REPO/Termux/install.sh" --skip-packages
export PATH="$PREFIX/bin:$PATH"
command -v nro_get_server >/dev/null
nroctl help | grep -q nro_get_server

# No NRO server JAR is included, so startup MUST fail transparently.
set +e
nro_on >"$TMP/missing.log" 2>&1
status=$?
set -e
if [[ "$status" == 0 ]] || ! grep -q 'Thiếu.*Server.jar' "$TMP/missing.log"; then
  cat "$TMP/missing.log"
  echo "FAIL: no-server case did not fail closed" >&2
  exit 1
fi
echo "PASS: missing Server.jar is reported and not falsely launched"

# Make an inert archive with a valid manifest for testing ONLY.
mkdir -p "$TMP/fixture"
echo "offline" >"$TMP/fixture/payload.txt"
printf 'Manifest-Version: 1.0\nMain-Class: dev.example.OfflineOnly\n\n' > "$TMP/manifest.mf"
jar cfm "$HOME/nro-local/server/Server.jar" "$TMP/manifest.mf" -C "$TMP/fixture" .
cat > "$TMP/mockjava" <<'MOCK'
#!/usr/bin/env bash
echo "MOCK JAVA STARTED"
trap 'exit 0' TERM INT
while :; do sleep 1; done
MOCK
chmod +x "$TMP/mockjava"
export NRO_JAVA_BIN="$TMP/mockjava"
nro_on > "$TMP/start.log" 2>&1
grep -q 'Đã tạo tiến trình server' "$TMP/start.log"
nro_status > "$TMP/status.log"
grep -q 'đang chạy' "$TMP/status.log"
grep -q 'MOCK JAVA STARTED' "$HOME/nro-local/logs/server.log"
nro_off > "$TMP/off.log"
grep -q 'SIGTERM' "$TMP/off.log"
echo "PASS: nro_on/status/off with inert test archive and mock runtime"

# No actual MariaDB is started, and no external service is stopped.
nro_db_off > "$TMP/db-off.log"
grep -q 'không dừng service khác' "$TMP/db-off.log"
echo "PASS: db-off refuses to stop processes not launched by this manager"
