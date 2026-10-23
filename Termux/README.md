# Chạy thử NRO server localhost bằng Termux (Android)

Bộ script này cung cấp các lệnh:
`nro_on`, `nro_off`, `nro_status`, `nro_logs`,
`nro_doctor`, `nro_db_on`, `nro_db_off`, `nro_db_import`.

**Trạng thái:** công cụ khởi động và quản lý tiến trình; **không phải**
server NRO và không tạo database NRO. Nhánh này **không có `Server.jar`**
hay file SQL. Bạn phải có server JAR và SQL hợp pháp của chính mình,
cùng cấu hình khớp với `127.0.0.1`.

## Bước 1 — Cài Termux

Ưu tiên [Termux F-Droid](https://f-droid.org/packages/com.termux/)
hoặc [GitHub chính thức](https://github.com/termux/termux-app/releases).
Không trộn APK/plug-in từ nhiều nguồn vì khác chữ ký.

Trong Termux:

```bash
pkg update && pkg upgrade -y
pkg install git -y
git clone --depth 1 --single-branch --branch termux/nro-local \
  --filter=blob:none --sparse \
  https://github.com/KhanhLyNek/LyMeowz.git ~/lymeowz-termux
cd ~/lymeowz-termux
git sparse-checkout set Termux
bash Termux/install.sh
```

**Nếu mạng/GitHub không hỗ trợ sparse clone**, tải trực tiếp folder
`Termux/` hoặc clone bình thường **chỉ khi đủ dung lượng**.
Script tự cài OpenJDK 17, MariaDB, unzip và công cụ chẩn đoán;
không tự cài server Java nào.

## Bước 2 — Chép server JAR vào bộ nhớ riêng của Termux

Nếu `Server.jar` có trong Download:

```bash
termux-setup-storage
cp ~/storage/downloads/Server.jar ~/nro-local/server/Server.jar
nro_doctor
```

Thêm thư mục `config`, `data`, `lib`, `resources`… **nếu**
server cụ thể của bạn yêu cầu. Giữ cấu trúc thư mục gốc để
`Server.jar` đọc được file theo đường dẫn tương đối.
Không chạy JAR từ `/sdcard` vì giới hạn quyền thực thi Android.

Nếu JAR không khai báo `Main-Class`, kiểm tra entry point bằng
`unzip -p ~/nro-local/server/Server.jar META-INF/MANIFEST.MF`;
sau đó điền `NRO_MAIN_CLASS` trong
`~/.config/nro-termux/config.env`, **chỉ khi đã xác minh**.

## Bước 3 — MariaDB local (chỉ nếu server dùng SQL)

```bash
nro_db_on
```

MariaDB được yêu cầu bind vào `127.0.0.1:3306`.
Nên chạy `mariadb-secure-installation` và tạo tài khoản DB riêng
mật khẩu mạnh trước khi kết nối NRO; package Termux có thể khởi tạo
root với chính sách xác thực tùy phiên bản.
**Không mở `3306` ra LAN/Internet.**

Sau khi có file SQL thử nghiệm (ví dụ ở Download), nhập:

```bash
nro_db_import ~/storage/downloads/nro.sql
```

`nro_db_import` tạo database `nro_local` nếu thiếu rồi
import toàn bộ SQL vào đó; **chỉ chạy với bản sao DB thử nghiệm**
vì SQL có thể ghi đè dữ liệu. Bạn vẫn phải chỉnh cấu hình trong
server để dùng đúng database, host, user/password do bạn tạo.
Không có SQL thì không thể đảm bảo server vào game được.

## Bước 4 — Gõ lệnh tắt

```bash
nro_on
nro_status
nro_logs
# Ctrl+C thoát chế độ xem log, không tắt server
nro_off
nro_db_off
```

Server chạy nền, PID riêng ở `~/nro-local/run`, log ở
`~/nro-local/logs/server.log`. Không có server JAR, JAR hỏng,
không có Main-Class (trừ khi thiết lập trong config), hoặc Java
thoát ngay thì `nro_on` báo lỗi, **không thông báo thành công giả**.

## Localhost và giới hạn an toàn

`127.0.0.1` chỉ liên quan cùng thiết bị Android; trình giả lập
Java ME/client cũng phải thật sự kết nối đến `127.0.0.1` với cổng
mà server đang mở. IP/port nhúng trong client `LyMeowz.jar`
không tự động đổi thành localhost.

**Rất quan trọng:** `NRO_GAME_PORT=14445` hiện là **giá trị dự kiến
tham khảo từ client**, **không tự động cấu hình socket trong Server.jar**.
Nếu Java server hard-code `0.0.0.0`, script không thể bắt buộc chỉ
bind localhost. `nro_on` sẽ dừng tiến trình nếu công cụ `ss` nhìn
thấy listener wildcard trên cổng dự kiến; nếu Android chặn đọc socket
hoặc port khác, script **không thể chứng minh** server local-only.
Hãy tự cấu hình `bind-address=127.0.0.1` trong server và kiểm tra
bằng `ss -ltn`, không kết nối Wi-Fi công cộng khi chưa xác minh.

Termux/Android có thể tạm dừng hoặc đóng ứng dụng chạy nền;
tắt tối ưu pin cho Termux khi thử nghiệm, không giả định server sẽ
chạy liên tục khi tắt màn hình.

## Cách xử lý lỗi

- `Server.jar THIẾU`: phải cung cấp server đúng phiên bản, không phải client JAR.
- `no main manifest attribute`: đặt `NRO_MAIN_CLASS` theo entry point đã xác minh.
- `ClassNotFound`/`NoClassDefFoundError`: thiếu dependency/server resources.
- `Access denied`/`Communications link failure`: thiếu database, SQL hoặc sai tài khoản DB.
- `Address already in use`: port đang bị một ứng dụng khác chiếm.
- `java.lang.OutOfMemoryError`: hạ/tăng `NRO_HEAP_MB` phù hợp RAM máy.
- Xem log với `nro_logs`, chỉnh cấu hình với `nano ~/.config/nro-termux/config.env`.

Các script không chạy client hay server tự động lúc cài, không tự
kết nối game server từ Internet và không tự tải JAR không rõ nguồn gốc.
