/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.SocketConnection
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.SocketConnection;

public final class I0l1
implements SocketConnection {
    private final I0l IIII;
    private final I0l IIIl;
    private volatile boolean lIIl;

    I0l1(I0l i0l, I0l i0l2) {
        this.IIII = i0l;
        this.IIIl = i0l2;
    }

    public DataInputStream openDataInputStream() throws IOException {
        return new DataInputStream(this.IIIl.II());
    }

    public InputStream openInputStream() throws IOException {
        return this.IIIl.II();
    }

    public DataOutputStream openDataOutputStream() throws IOException {
        return new DataOutputStream(this.IIII.II());
    }

    public OutputStream openOutputStream() throws IOException {
        return this.IIII.II();
    }

    public void close() throws IOException {
        this.lIIl = true;
        this.IIII.close();
        this.IIIl.close();
    }

    public boolean I1() {
        return this.lIIl;
    }

    public String getAddress() {
        return I0l1.I1oO("\u16e9\u16c5\u1721\u171b\u1764\u175d\u17a2\u179f\u17e1", 5848);
    }

    public String getLocalAddress() {
        return I0l1.I1oO("\u16e9\u16c5\u1721\u171b\u1764\u175d\u17a2\u179f\u17e1", 5848);
    }

    public int getLocalPort() {
        return 14445;
    }

    public int getPort() {
        return 14445;
    }

    public int getSocketOption(byte by) {
        return 0;
    }

    public void setSocketOption(byte by, int n) {
    }

    private static /* synthetic */ String I1oO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

