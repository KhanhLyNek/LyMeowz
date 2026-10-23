# Kiến trúc ClientDev

Original MIDlet: `LyMeowz,/icon.png,main.GameMidlet`

## Thư mục

- `ClientSRC/src`: mã decompile lần đầu, giữ nguyên để đối chiếu.
- `ClientDev/src`: bản CFR có xử lý duplicate members + gộp default package (thử nghiệm).
- `ClientSRC/resources`: tài nguyên JAR sử dụng lại khi build.
- `ClientDev/build.sh`: thử biên dịch với MIDP 2.0 / CLDC 1.1 API.
- `ClientDev/reports`: các báo cáo tĩnh và kết quả compile.

## Lưu ý giới hạn

Các class mặc định từ bytecode được đưa vào package `main` để cho phép tham chiếu từ `main.GameMidlet`. Đây là thay đổi tên nhị phân, có thể ảnh hưởng reflection, tài nguyên và kết nối; không thể coi là bản thay thế cho file JAR ban đầu nếu chưa thử nghiệm.
Không chạy client chưa được audit với tài khoản/dữ liệu nhạy cảm.
