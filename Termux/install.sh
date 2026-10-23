#!/usr/bin/env bash
# Install local command aliases in Termux; do not download/execute arbitrary game binaries.
set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
if [[ "${1:-}" != "--skip-packages" ]]; then
  if ! command -v pkg >/dev/null 2>&1; then
    echo "Install package này cần Termux trên Android. Để chạy CI: --skip-packages" >&2
    exit 1
  fi
  echo "Installing Termux requirements: Java 17, MariaDB, git, curl, unzip, iproute2..."
  pkg update -y
  pkg install -y openjdk-17 mariadb git curl unzip iproute2 procps coreutils
fi

TARGET_PREFIX="${PREFIX:-$HOME/.local}"
BINDIR="$TARGET_PREFIX/bin"
CFG_DIR="$HOME/.config/nro-termux"
NRO_DIR="$HOME/nro-local"
mkdir -p "$BINDIR" "$CFG_DIR" "$NRO_DIR/server" "$NRO_DIR/logs" "$NRO_DIR/run"
chmod 700 "$CFG_DIR" "$NRO_DIR" "$NRO_DIR/logs" "$NRO_DIR/run"
if [[ ! -e "$CFG_DIR/config.env" ]]; then
  cp "$ROOT/config.env.example" "$CFG_DIR/config.env"
fi
chmod 600 "$CFG_DIR/config.env"

# Keep existing normal files intact; replace only previous symlinks.
if [[ -e "$BINDIR/nroctl" && ! -L "$BINDIR/nroctl" ]]; then
  echo "Đã có $BINDIR/nroctl; dừng để tránh ghi đè file cá nhân." >&2
  exit 1
fi
cp "$ROOT/nroctl" "$BINDIR/nroctl.tmp.$$"
chmod 755 "$BINDIR/nroctl.tmp.$$"
mv -f "$BINDIR/nroctl.tmp.$$" "$BINDIR/nroctl"
for command in nro_get_server nro_on nro_off nro_status nro_logs nro_doctor nro_db_on nro_db_off nro_db_import; do
  if [[ -e "$BINDIR/$command" && ! -L "$BINDIR/$command" ]]; then
    echo "Đã có $BINDIR/$command; không ghi đè file hiện tại." >&2
    continue
  fi
  ln -sfn "$BINDIR/nroctl" "$BINDIR/$command"
done
echo
echo "Cài lệnh Termux xong. Nếu command not found, mở Termux lại."
echo "Tải hoặc chép JAR server của bạn vào: $NRO_DIR/server/Server.jar"
echo "Config riêng: $CFG_DIR/config.env"
echo "Lệnh gõ: nro_doctor; nro_get_server; nro_db_on; nro_on; nro_status; nro_logs; nro_off"
echo "Lưu ý: repo LyMeowz này KHÔNG chứa Server.jar hoặc database NRO."
