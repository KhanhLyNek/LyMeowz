# Phân tích giao thức mạng Client NRO (đợt 1)

Tài liệu dựa trên dấu hiệu tĩnh của Java được dịch ngược; **chưa kiểm chứng bằng gói tin thực tế**.
Không ghi địa chỉ máy chủ, token hoặc khóa vào báo cáo.

## Mốc khởi tạo

- `main/GameMidlet.java`: MIDlet entry point (theo manifest trong JAR).
- `nrolite/DataDownloader.java`: luồng tải tài nguyên; không mặc định coi đây là socket game.

## Các class cần đọc trước khi sửa giao thức

| Class | Chỉ dấu I/O tìm thấy |
|---|---|
| `I1I1.java` | DataInputStream (14), readByte (273), readInt (166), readShort (278), readUTF (135), readUnsignedByte (76), writeByte (3), writeInt (2), writeShort (1), writeUTF (1) |
| `IOol.java` | DataInputStream (4), DataOutputStream (4), readInt (90), readUTF (3), writeInt (90), writeUTF (3) |
| `I_0_.java` | writeByte (81), writeInt (40), writeShort (27), writeUTF (35) |
| `I1_I.java` | DataInputStream (73), readByte (17), readInt (2), readShort (56), readUTF (2) |
| `IOO.java` | DataInputStream (4), readByte (18), readInt (3), readShort (30), readUTF (6), readUnsignedByte (1) |
| `I1l0.java` | DataInputStream (12), readByte (12), readShort (18), readUnsignedByte (12) |
| `IO0.java` | DataInputStream (10), readByte (22), readInt (3), readShort (10), readUTF (6), readUnsignedByte (1) |
| `I0Io.java` | DataInputStream (3), readByte (15), readInt (1), readShort (16), readUTF (4) |
| `IO_I.java` | DataInputStream (4), readByte (11), readInt (6), readShort (2), readUTF (5) |
| `IO_O.java` | DataInputStream (6), readByte (7), readInt (5), readShort (2), readUTF (5), readUnsignedByte (2) |
| `IOo1.java` | DataInputStream (4), readByte (6), readInt (2), readShort (11), readUTF (2) |
| `I_0l.java` | DataInputStream (3), DataOutputStream (11), readByte (4), readShort (1), readUTF (2), writeByte (8), writeShort (2), writeUTF (4) |
| `IOoI.java` | DataInputStream (13), readByte (12), readInt (1), readShort (6), readUTF (1) |
| `I1I_.java` | readByte (7), readInt (3), readShort (7) |
| `Ill_.java` | DataInputStream (3), DataOutputStream (3), flush (1), readInt (4), readUTF (4), writeInt (4), writeUTF (4) |
| `I_I1.java` | readByte (9), readInt (1), readUTF (1) |
| `I0I1.java` | DataInputStream (3), readByte (1), readShort (8), readUTF (1) |
| `I0Il.java` | DataInputStream (3), readByte (2), readShort (3), readUTF (4) |
| `IOo_.java` | DataInputStream (5), DataOutputStream (3), flush (1), readByte (2), writeByte (4), writeShort (1) |
| `I1Ol.java` | DataInputStream (3), DataOutputStream (3), readByte (1), readShort (1), readUTF (1), writeByte (1), writeShort (1), writeUTF (1) |
| `IO_0.java` | DataInputStream (4), readByte (3), readShort (2), readUTF (1) |
| `IOoo.java` | DataInputStream (4), DataOutputStream (4), readInt (3), writeInt (3) |
| `I_0O.java` | DataInputStream (2), DataOutputStream (3), flush (1), writeByte (4), writeShort (2) |
| `I_oo.java` | DataInputStream (3), readShort (5), readUnsignedByte (1) |
| `IO1I.java` | DataInputStream (7), readShort (5) |
| `IO1O.java` | Connector.open (1), DataInputStream (2), DataOutputStream (2), SocketConnection (4) |
| `I1I0.java` | DataInputStream (5), readShort (4) |
| `IO0O.java` | DataInputStream (3), readByte (3), readUTF (1) |
| `IO0o.java` | DataOutputStream (3), writeByte (1), writeInt (1), writeShort (1), writeUTF (1) |
| `I0l1.java` | DataInputStream (3), DataOutputStream (3), SocketConnection (3) |
| `I0l_.java` | SocketConnection (3) |
| `I1O1.java` | DataOutputStream (3), writeByte (2) |
| `IOo.java` | DataInputStream (2), readByte (1), readUTF (1) |
| `IOoO.java` | DataInputStream (2), readByte (1), readShort (1) |
| `I_1l.java` | DataInputStream (2), readInt (2) |

## Dấu hiệu xử lý command (switch/case)

Các số bên dưới là **nhãn case** trong code, không mặc định là opcode mạng.

| Class | Số nhãn case phân biệt | Giá trị nhỏ nhất | Giá trị lớn nhất |
|---|---:|---:|---:|
| `I1I1.java` | 152 | -112 | 127 |
| `IO0.java` | 121 | -127 | 154 |
| `II.java` | 83 | -39 | 888397 |
| `IOOo.java` | 76 | 892 | 1879 |
| `IOoI.java` | 71 | 0 | 1823 |
| `I0I.java` | 53 | 0 | 2905 |
| `IO00.java` | 45 | 0 | 83 |
| `I1_I.java` | 38 | 1 | 888351 |
| `I0II.java` | 37 | 0 | 2705 |
| `I0IO.java` | 35 | 0 | 1868 |
| `IlI.java` | 34 | 1 | 300 |
| `IOoO.java` | 32 | 987 | 1794 |
| `IOo.java` | 30 | 0 | 1795 |
| `I_1o.java` | 29 | -1 | 27 |
| `IO_0.java` | 23 | 100 | 997 |
| `I1o_.java` | 21 | 1 | 10042 |
| `I111.java` | 18 | 0 | 26 |
| `IO_I.java` | 17 | 0 | 26 |
| `Il0O.java` | 16 | 0 | 15 |
| `I_OI.java` | 15 | 1000 | 10042 |

## Chưa xác minh

- Handshake, thuật toán mã hóa packet, chiều dài packet, mã command, mapping server response.
- IP/port, danh sách server, và khả năng kết nối với `Server/Server.jar`.
- Cần đọc mã của lớp đọc/ghi socket và kiểm tra một session thử nghiệm được phép.

## Nguyên tắc cải tiến

- Phân tách rõ NetTransport, PacketCodec, CommandRouter và GameState trước khi đổi protocol.
- Đặt timeout, giới hạn kích thước packet và validate dữ liệu trên server.
- Chưa đổi tên hàng loạt class obfuscate; chỉ chuyển dần khi có test.
