# Phân tích mã nguồn Client NRO

- Java được dịch ngược: **260** file
- Class mặc định được tạm đặt vào package `main`: **257**
- Package được điều chỉnh **chỉ trong ClientDev**, không sửa ClientSRC.
- Tên class/phương thức obfuscate được giữ nguyên để tránh phá vỡ liên kết.
- Bản này vẫn cần kiểm tra biên dịch và runtime, không phải source gốc.

## Phụ thuộc import (theo tiền tố)

| Namespace | Số import |
|---|---:|
| `java` | 217 |
| `javax` | 128 |
| `main` | 24 |
| `nrolite` | 15 |

## Cảnh báo trong output của decompiler

- `javax.microedition.lcdui.Image`: 42 occurrence(s)
- `javax.microedition.lcdui.Displayable`: 10 occurrence(s)
- `javax.microedition.midlet.MIDlet`: 10 occurrence(s)
- `javax.microedition.lcdui.Command`: 9 occurrence(s)
- `javax.microedition.lcdui.CommandListener`: 9 occurrence(s)
- `javax.microedition.lcdui.Display`: 9 occurrence(s)
- `javax.microedition.lcdui.Form`: 7 occurrence(s)
- `javax.microedition.lcdui.Item`: 7 occurrence(s)
- `javax.microedition.lcdui.TextField`: 7 occurrence(s)
- `javax.microedition.io.SocketConnection`: 3 occurrence(s)
- `javax.microedition.rms.RecordStore`: 3 occurrence(s)
- `javax.microedition.lcdui.Graphics`: 2 occurrence(s)
- `javax.microedition.io.Connector`: 2 occurrence(s)
- `javax.microedition.lcdui.TextBox`: 2 occurrence(s)
- `javax.microedition.rms.RecordStoreNotFoundException`: 2 occurrence(s)
- `javax.microedition.io.HttpConnection`: 1 occurrence(s)
- `javax.microedition.io.ConnectionNotFoundException`: 1 occurrence(s)
- `javax.microedition.lcdui.Canvas`: 1 occurrence(s)
- `nrolite.GmHandler`: 1 occurrence(s)
- `javax.microedition.rms.RecordStoreException`: 1 occurrence(s)
