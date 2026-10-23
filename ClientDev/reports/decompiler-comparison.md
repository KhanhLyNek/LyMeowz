# So sánh trình dịch ngược: CFR 0.152 và Vineflower 1.12.0

Đây là **thử nghiệm khôi phục SRC**, không chứng minh tính tương đương bytecode hay khả năng chạy game.

| Chỉ số | CFR (ClientDev/src) | Vineflower (thử nghiệm) |
|---|---:|---:|
| Số file .java | 260 | 307 |
| Số câu lệnh `** GOTO` không hợp lệ | 58 | 0 |
| Số dấu hiệu lỗi dịch ngược | 2 | 0 |
| `I1I1.java` — `** GOTO` | 25 | 0 |

## Kiểm tra cú pháp trên toàn bộ Vineflower candidate

- Kết quả javac: **FAIL or not run**
- Số chẩn đoán javac: **300** (giới hạn -Xmaxerrs)

| Loại lỗi | Số lượng |
|---|---:|
| duplicate symbol | 297 |
| missing symbol | 3 |

Một số vị trí lỗi (không đưa source/host/token vào report):
- `IOoI.java:8` — missing symbol
- `IO_I.java:2756` — duplicate symbol
- `IO_I.java:2759` — duplicate symbol
- `IO_I.java:2782` — duplicate symbol
- `IO_I.java:2786` — duplicate symbol
- `IO_I.java:2787` — duplicate symbol
- `IO_I.java:2791` — duplicate symbol
- `IOO.java:12` — duplicate symbol
- `IOO.java:13` — duplicate symbol
- `IOO.java:15` — duplicate symbol
- `IOO.java:16` — duplicate symbol
- `IOO.java:297` — duplicate symbol

## Những file cải thiện rõ về lỗi điều khiển luồng

| Class | CFR GOTO | Vineflower GOTO | CFR dấu lỗi | Vineflower dấu lỗi |
|---|---:|---:|---:|---:|
| `I1I1.java` | 25 | 0 | 0 | 0 |
| `I_1o.java` | 21 | 0 | 0 | 0 |
| `I1_I.java` | 7 | 0 | 0 | 0 |
| `Ilol.java` | 3 | 0 | 0 | 0 |
| `Il0O.java` | 1 | 0 | 0 | 0 |
| `II.java` | 1 | 0 | 0 | 0 |
| `IOoI.java` | 0 | 0 | 1 | 0 |
| `I1I_.java` | 0 | 0 | 1 | 0 |

## Kết luận

- **Không gộp** Java Vineflower đè lên CFR tự động; tên method/field có thể lệch nhau.
- Nếu file Vineflower tốt hơn, có thể thay theo nhóm class liên quan hoặc xây phiên bản đồng bộ sau khi đối chiếu.
- Lỗi compiler của toàn dự án còn liên quan tới Java ME, obfuscation, class nằm khác package, và cú pháp bytecode khó khôi phục.
- Chỉ xác nhận client hoạt động sau khi build thành công và test trong MIDP emulator với server thử nghiệm được cho phép.
