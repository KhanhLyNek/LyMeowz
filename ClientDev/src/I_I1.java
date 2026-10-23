package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import main.GameMidlet;

final class I_I1
implements Runnable {
    private I_0O II;

    I_I1(I_0O i_0O) {
        this.II = i_0O;
    }

    @Override
    public void run() {
        block4: while (true) {
            try {
                while (this.II.IlI_()) {
                    I_Il i_Il;
                    int n;
                    I_0O i_0O;
                    int n2;
                    int n3;
                    byte[] byArray;
                    int n4;
                    I_I1 i_I1 = this;
                    byte by2 = this.II.var_java_io_DataInputStream_III.readByte();
                    if (this.II.I1l) {
                        by2 = I_0O.II(this.II, by2);
                    }
                    if (by2 != -32 && by2 != -66 && by2 != 11 && by2 != -67 && by2 != -74 && by2 != -87 && by2 != 66) {
                        if (this.II.I1l) {
                            byte by = this.II.var_java_io_DataInputStream_III.readByte();
                            byte by3 = this.II.var_java_io_DataInputStream_III.readByte();
                            n4 = (I_0O.II(this.II, by) & 0xFF) << 8 | I_0O.II(this.II, by3) & 0xFF;
                        } else {
                            n4 = this.II.var_java_io_DataInputStream_III.readUnsignedShort();
                        }
                        byArray = new byte[n4];
                        n3 = 0;
                        n2 = 0;
                        while (n3 != -1 && n2 < n4) {
                            n3 = i_I1.II.var_java_io_DataInputStream_III.read(byArray, n2, n4 - n2);
                            if (n3 <= 0) continue;
                            i_0O = i_I1.II;
                            i_0O.IIO1 += (n2 += n3) + 5;
                            n = I_0O.II().IIO1 + I_0O.II().IIlI;
                            i_I1.II.Ill_ = n / 1024 + I_I1.Il_I("\u3086", 12456) + n % 1024 / 102 + I_I1.Il_I("\u30e3\u30a5", 12456);
                        }
                        if (i_I1.II.I1l) {
                            for (n = 0; n < byArray.length; ++n) {
                                byArray[n] = I_0O.II(i_I1.II, byArray[n]);
                            }
                        }
                        i_Il = new I_Il(by2, byArray);
                    } else {
                        i_I1 = this;
                        n4 = I_0O.II(this.II, this.II.var_java_io_DataInputStream_III.readByte()) + 128;
                        int n5 = I_0O.II(this.II, this.II.var_java_io_DataInputStream_III.readByte()) + 128;
                        byArray = new byte[n4 += (I_0O.II(this.II, this.II.var_java_io_DataInputStream_III.readByte()) + 128 << 8) + n5 << 8];
                        n3 = 0;
                        n2 = 0;
                        while (n3 != -1 && n2 < n4) {
                            n3 = i_I1.II.var_java_io_DataInputStream_III.read(byArray, n2, n4 - n2);
                            if (n3 <= 0) continue;
                            i_0O = i_I1.II;
                            i_0O.IIO1 += (n2 += n3) + 5;
                            n = I_0O.II().IIO1 + I_0O.II().IIlI;
                            i_I1.II.Ill_ = n / 1024 + I_I1.Il_I("\u3086", 12456) + n % 1024 / 102 + I_I1.Il_I("\u30e3\u30a5", 12456);
                        }
                        if (i_I1.II.I1l) {
                            for (n = 0; n < byArray.length; ++n) {
                                byArray[n] = I_0O.II(i_I1.II, byArray[n]);
                            }
                        }
                        i_Il = new I_Il(by2, byArray);
                    }
                    I_Il i_Il2 = i_Il;
                    if (i_Il == null) break block4;
                    try {
                        if (i_Il2.II00 == -27) {
                            this.IIl_(i_Il2);
                            continue block4;
                        }
                        this.II.var_I1_0_II.III(i_Il2);
                        continue block4;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                break;
            }
            catch (Exception exception) {
                // empty catch block
                break;
            }
        }
        if (this.II.I0O) {
            if (this.II.var_I1_0_II != null) {
                if (System.currentTimeMillis() - this.II.IlOI > 500L) {
                    this.II.var_I1_0_II.IIl(this.II.I0_o);
                } else {
                    this.II.var_I1_0_II.IIIo(this.II.I0_o);
                }
            }
            if (I_0O.IO1O_II(this.II) != null) {
                I_0O.void_II(this.II);
            }
        }
    }

    private void IIl_(I_Il i_Il) throws IOException {
        int n;
        int n2 = i_Il.java_io_DataInputStream_II().readByte();
        this.II.II1 = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.II.II1[n] = i_Il.java_io_DataInputStream_II().readByte();
        }
        for (n = 0; n < this.II.II1.length - 1; ++n) {
            byte[] byArray = this.II.II1;
            int n3 = n + 1;
            byArray[n3] = (byte)(byArray[n3] ^ this.II.II1[n]);
        }
        this.II.I1l = true;
        GameMidlet.IIII = i_Il.java_io_DataInputStream_II().readUTF();
        GameMidlet.II_o = i_Il.java_io_DataInputStream_II().readInt();
        GameMidlet.II1O = i_Il.java_io_DataInputStream_II().readByte() != 0;
        System.out.println(I_I1.Il_I("\u30c1\u30b4\u30c6\u3166\u314b\u312d\u310c\u31e4\u31c3\u31cb\u31aa\u31dd\u322e\u3206\u327a", 12456) + GameMidlet.II1O);
        if (this.II.I0_o && GameMidlet.II1O) {
            II.III();
        }
    }

    private static /* synthetic */ String Il_I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

