# Giao thức packet LyMeowz — kết quả kiểm chứng tĩnh

Nguồn đối chiếu: `ClientSRC/src/IOo_.java` trong nhánh `client-src/workbench`,
đặc biệt các phương thức `run()`, `III(int, DataInputStream)` và
`II(IO0o)`. Đây là kết quả phân tích **mã dịch ngược**, không phải capture
mạng hay mô tả đầy đủ giao thức server.

## Server -> Client (trong vòng đọc IOo_.run)

```text
+---------+----------------------+--------------------+
| cmd i8  | payloadLength u16 BE | payload [length]   |
+---------+----------------------+--------------------+
```

- `readByte()` lấy command có dấu (-128..127).
- `readUnsignedShort()` lấy độ dài (0..65535) theo big-endian.
- `readFully(byte[length])` lấy nội dung rồi chuyển tới hàm dispatch.
- Command `-27` đi qua nhánh phản hồi đặc biệt.
- Command `-74` đọc một byte điều khiển; các command khác đi vào
  `IO0.II(command, DataInputStream)`.

## Client -> Server (IOo_.II(IO0o))

```text
Regular: cmd i8 | payloadLength u16 BE | payload
Special: cmd i8 | len_lo+128 u8 | len_mid+128 u8 | len_hi+128 u8 | payload
```

- Với các command `-32, -66, -74, 11, -67, -87, 66, 12`,
  client ghi độ dài 24 bit **little endian**, nhưng mỗi byte của
  độ dài được trừ 128 trước khi ghi (mod 256).
- Với các command còn lại, client dùng độ dài `writeShort(length)`.
- Sau header, client ghi payload và gọi `flush()`.

Ví dụ cho command `-74`, payload 3 byte `01 02 FF`:
```text
B6 83 80 80 01 02 FF
^^ ^^^^^^^^ ^^^^^^^^
cmd length=3 payload
```

## Code độc lập đã kiểm thử

- `src/dev/lymeowz/net/PacketFraming.java`: encode gói client,
  decode gói server, và decode gói client để dùng trong test server.
- `test/dev/lymeowz/net/PacketFramingTest.java`: round-trip, kiểm tra
  extended length, giới hạn packet và dữ liệu bị cắt.
- `test.sh`: biên dịch độc lập trên JVM dùng Java 8 language level.

```bash
bash ClientDev/protocol/test.sh
```

## Những gì chưa làm

Chưa có mã giải mã nội dung message, mã login, chứng minh tương thích với
server, xử lý socket production, hoặc test NRO trên emulator. Các hằng
`-27/-74` hiện chỉ là đường đi điều khiển nhìn thấy trong code, **chưa**
được tuyên bố là một handshake hoàn chỉnh. Không nên kết nối tài khoản thật
vào bản client dịch ngược khi chưa audit.

**Quan trọng:** `PacketFraming` là module độc lập dùng `java.io`
thông thường để kiểm chứng công thức. Nó chưa được gọi bởi client obfuscate.
Muốn port sang thiết bị Java ME cần đối chiếu thư viện CLDC và test runtime.
