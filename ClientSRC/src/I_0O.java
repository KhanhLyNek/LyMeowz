/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class I_0O
implements I1_o {
    private static I_0O IIII = new I_0O();
    private static I_0O IIIl = new I_0O();
    private DataOutputStream III;
    public DataInputStream III;
    public I1_0 II;
    public boolean I0_o = true;
    private IO1O II;
    public boolean I0O;
    public boolean I0OI;
    private final I_O0 II;
    private Thread II = new I_O0(this);
    public Thread III;
    public Thread IIII;
    public int IIlI;
    public int IIO1;
    boolean I1l;
    public byte[] II1 = null;
    private byte IlI_;
    private byte IIO0;
    long IlOI;
    public String Ill_ = "";
    private long I1I_ = 0L;
    public static boolean IIl;
    private static int I1;

    public static I_0O II() {
        return IIII;
    }

    public static I_0O III() {
        return IIIl;
    }

    public void III() {
        I_O0.II(this.II).removeAllElements();
    }

    public final boolean IlI_() {
        return this.I0O && this.II != null && this.II.II != null && this.III != null;
    }

    public void II(I1_0 i1_0) {
        this.II = i1_0;
    }

    public void IIIO(String string, int n) {
        System.out.println(I_0O.IloI("\u5aa8\u5b65\u5b47\u5b26\u5b02\u5be5\u5bd1\u5be4\u5b97\u5c6d\u5c01\u5c7a\u5c7f\u5c17\u5ced\u5c9c\u5ce6\u5cda", 23275) + string + I_0O.IloI("\u5ac6\u5b27\u5b09\u5b38\u5b08\u5bf4\u5bd1\u5be4\u5bde\u5c22", 23275) + n);
        if (!this.I0O && !this.I0OI && IO10.IIII() >= this.I1I_) {
            this.I1I_ = IO10.IIII() + 50L;
            if (this.I0_o) {
                I_0l.III_ = -1;
            }
            this.I1l = false;
            this.Io0_();
            this.II = new Thread(new I_00(this, string, n));
            this.II.start();
        }
    }

    @Override
    public void IIlO(I_Il i_Il) {
        ++I1;
        this.II.IIl_(i_Il);
    }

    private synchronized void IIl0(I_Il i_Il) {
        byte[] byArray = i_Il.II();
        try {
            byte by;
            if (this.I1l) {
                by = this.II(i_Il.II00);
                this.III.writeByte(by);
            } else {
                this.III.writeByte(i_Il.II00);
            }
            if (byArray != null) {
                int n;
                int n2 = byArray.length;
                if (this.I1l) {
                    n = this.II((byte)(n2 >> 8));
                    this.III.writeByte(n);
                    by = this.II((byte)n2);
                    this.III.writeByte(by);
                } else {
                    this.III.writeShort(n2);
                }
                if (this.I1l) {
                    for (n = 0; n < byArray.length; ++n) {
                        byArray[n] = this.II(byArray[n]);
                    }
                }
                this.III.write(byArray);
                this.IIlI += 5 + byArray.length;
            } else {
                this.III.writeShort(0);
                this.IIlI += 5;
            }
            this.III.flush();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private byte II(byte by) {
        byte[] byArray = this.II1;
        byte by2 = this.IIO0;
        this.IIO0 = (byte)(by2 + 1);
        by = (byte)(byArray[by2] & 0xFF ^ by & 0xFF);
        if (this.IIO0 >= this.II1.length) {
            this.IIO0 = (byte)(this.IIO0 % this.II1.length);
        }
        return by;
    }

    public void close() {
        this.Io0_();
    }

    private void Io0_() {
        this.II1 = null;
        this.IlI_ = 0;
        this.IIO0 = 0;
        try {
            this.I0O = false;
            this.I0OI = false;
            if (this.II != null && this.II.II != null) {
                this.II.IIl1();
            }
            this.II = null;
            if (this.III != null) {
                this.III.close();
            }
            this.III = null;
            if (this.III != null) {
                this.III.close();
            }
            this.III = null;
            if (this.IIII != null) {
                this.IIII.interrupt();
            }
            this.IIII = null;
            if (this.III != null) {
                this.III.interrupt();
            }
            this.III = null;
            if (this.I0_o) {
                I_0l.III_ = 0;
            }
            System.gc();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static IO1O II(I_0O i_0O) {
        return i_0O.II;
    }

    static void II(I_0O i_0O, IO1O iO1O) {
        i_0O.II = iO1O;
    }

    static void II(I_0O i_0O, DataOutputStream dataOutputStream) {
        i_0O.III = dataOutputStream;
    }

    static I_O0 II(I_0O i_0O) {
        return i_0O.II;
    }

    static void II(I_0O i_0O, I_Il i_Il) {
        i_0O.IIl0(i_Il);
    }

    static void II(I_0O i_0O) {
        i_0O.Io0_();
    }

    static byte II(I_0O i_0O, byte by) {
        byte[] byArray = i_0O.II1;
        byte by2 = i_0O.IlI_;
        i_0O.IlI_ = (byte)(by2 + 1);
        by = (byte)(byArray[by2] & 0xFF ^ by & 0xFF);
        if (i_0O.IlI_ >= i_0O.II1.length) {
            i_0O.IlI_ = (byte)(i_0O.IlI_ % i_0O.II1.length);
        }
        return by;
    }

    private static /* synthetic */ String IloI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

