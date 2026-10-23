package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class I0l {
    private final byte[] II1I;
    private int IIIl;
    private int IIl;
    private int I1_;
    private boolean lIIl;
    private String II1o = I0l.I1o_("\u1932\u1917\u19e4\u19d5\u19da", 6467);
    private long I0ll;

    public I0l(int n) {
        this.II1I = new byte[n];
    }

    public I0l(int n, String string) {
        this.II1I = new byte[n];
        this.II1o = string;
    }

    public synchronized void write(byte[] byArray, int n, int n2) throws IOException {
        while (n2 > 0) {
            if (this.I1_ == this.II1I.length && !this.lIIl) {
                long l = System.currentTimeMillis();
                while (this.I1_ == this.II1I.length && !this.lIIl) {
                    try {
                        this.wait(200L);
                    }
                    catch (InterruptedException interruptedException) {
                        throw new IOException(I0l.I1o_("\u192a\u190c\u19f5\u19c5\u19cd\u19ac\u1988\u1a6c\u1a4f\u1a3f\u1a1d", 6467));
                    }
                    long l2 = System.currentTimeMillis() - l;
                    if (l2 < 1000L || System.currentTimeMillis() - this.I0ll < 2000L) continue;
                    this.I0ll = System.currentTimeMillis();
                    System.out.println(I0l.I1o_("\u1918\u190e\u19e8\u19d4\u19da\u1983\u19a6", 6467) + this.II1o + I0l.I1o_("\u191e\u1942\u19e2\u19c1\u19d1\u19b6\u19dd\u1a7e\u1a5a\u1a35\u1a43\u1ab8\u1adf\u1ab7\u1a9b\u1b73\u1b13\u1b36\u1b1e\u1bf9\u1b8f\u1baa\u1b8c\u1c75\u1c07\u1c6a\u1c0d\u1ce9\u1c87\u1ca5\u1c8d\u1d6b\u1d03", 6467) + l2 + I0l.I1o_("\u192e\u1911\u19a1\u1988\u19dd\u19bb\u1993\u1a3c\u1a5f\u1a35\u1a1a\u1ab8\u1adc\u1abe\u1a9a\u1b7a\u1b54\u1b72\u1b1a\u1bf9\u1bdf\u1be1\u1b8f\u1c65\u1c0b\u1c3e\u1c1b\u1ced\u1cc8\u1cef\u1cc5\u1d29\u1d03\u1d2c\u1d06\u1de8\u1df6\u1d9e\u1db3\u1d9b\u1e74\u1e1a\u1e3d\u1e19\u1eee\u1e96\u1eb9\u1e95\u1f33\u1f5c\u1f36\u1f05\u1ff6\u1fcb\u1fa3\u1fcc\u2065\u2042\u2028\u2006\u20a7\u20c1\u20ac\u2085\u2177\u2102\u212d\u2101\u2118", 6467));
                }
            }
            if (this.lIIl) {
                throw new IOException(I0l.I1o_("\u1932\u1917\u19e4\u19d5\u19da\u19fe\u199e\u1a70\u1a54\u1a29\u1a1c\u1afc", 6467));
            }
            int n3 = Math.min(n2, this.II1I.length - this.I1_);
            n3 = Math.min(n3, this.II1I.length - this.IIl);
            System.arraycopy(byArray, n, this.II1I, this.IIl, n3);
            this.IIl = (this.IIl + n3) % this.II1I.length;
            this.I1_ += n3;
            n += n3;
            n2 -= n3;
            this.notifyAll();
        }
    }

    public synchronized int read(byte[] byArray, int n, int n2) throws IOException {
        if (n2 == 0) {
            return 0;
        }
        while (this.I1_ == 0) {
            if (this.lIIl) {
                return -1;
            }
            try {
                this.wait();
            }
            catch (InterruptedException interruptedException) {
                throw new IOException(I0l.I1o_("\u192a\u190c\u19f5\u19c5\u19cd\u19ac\u1988\u1a6c\u1a4f\u1a3f\u1a1d", 6467));
            }
        }
        int n3 = Math.min(n2, this.I1_);
        n3 = Math.min(n3, this.II1I.length - this.IIIl);
        System.arraycopy(this.II1I, this.IIIl, byArray, n, n3);
        this.IIIl = (this.IIIl + n3) % this.II1I.length;
        this.I1_ -= n3;
        this.notifyAll();
        return n3;
    }

    public synchronized int available() {
        return this.I1_;
    }

    public synchronized void close() {
        this.lIIl = true;
        this.notifyAll();
    }

    public synchronized boolean I1() {
        return this.lIIl;
    }

    public InputStream java_io_InputStream_II() {
        return new I0lI(this);
    }

    public OutputStream java_io_OutputStream_II() {
        return new I0ll(this);
    }

    private static /* synthetic */ String I1o_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

