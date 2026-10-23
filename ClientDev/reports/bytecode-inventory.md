# Bytecode inventory của LyMeowz.jar

Phân tích chỉ đọc header của các file `.class`; **không chạy** JAR.
- SHA-256: `8b59d65dbc41b0c2b3f1ce83fb88d17aad4821fd9edfb0af65bd4e51a03417b3`
- Class entries: **351**
- Class không nằm trong package (JAR root): **348**
- Class có ký hiệu class lồng (`$`): **44**
- Chữ ký JAR đã tìm thấy: **0**

## Phiên bản classfile
| Major | Minor | Java SE tương ứng (tham khảo) | Class |
|---:|---:|---|---:|
| 52 | 0 | Java 8 | 351 |

## Class quan trọng

| Đường dẫn | Classfile major.minor |
|---|---|
| `I1I1.class` | `52.0` |
| `IO0.class` | `52.0` |
| `IOo_.class` | `52.0` |
| `main/GameMidlet.class` | `52.0` |
| `nrolite/DataDownloader.class` | `52.0` |

## Kết luận kỹ thuật

- `MANIFEST.MF` khai báo MIDP 2.0 và CLDC 1.1, nhưng manifest không tự chứng minh JAR chạy được trên mọi JVM/J2ME emulator.
- Major version 52 là bytecode Java 8; Java ME/CLDC cổ điển thường cần toolchain và preverifier riêng.
- Phải dùng đúng classfile level/runtime phù hợp với đối tượng triển khai; **javac --release 8** chỉ là phép thử cú pháp và phụ thuộc, không phải build MIDlet đã preverify.
- Có thể phát triển tính năng bằng module Java độc lập, kết nối qua API đã kiểm thử, trong khi giữ nguyên binary gốc để đối chiếu.
- Không khẳng định file JAR hiện tại có thể chạy trên Nokia/J2ME hoặc Android cho tới khi test bằng runtime tương ứng.
