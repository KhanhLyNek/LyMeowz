package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class I_lI
extends I1l1 {
    private int I_0;
    private I1Io II;
    public static Random III = new Random(System.currentTimeMillis());
    private int IIOI;
    private int IIOl;
    private int IIlI;
    private int IIO1;
    private int IIO_;
    private int IoII;
    private boolean I1ll = false;
    private int IIOo;
    private int II0;
    private Ilol IIlo;
    private I_lO II0_ = new I_lO(I_lI.Il_O("\ube49\ube1a\ube1c\ubeee\ubecf\ubea9", 48703));
    private int IIII = 0;
    private int IIIl = 0;
    private static int[] I11 = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
    public static final int[] I11I = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
    public static final byte[] IIl_ = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};

    public static void II(int n, int n2, boolean bl, int n3, int n4, Ilol ilol, int n5) {
        I1l1.II1_.addElement(new I_lI(n, n2, bl, n3, n4, ilol, n5));
    }

    private I_lI(int n, int n2, boolean bl, int n3, int n4, Ilol ilol, int n5) {
        int n6;
        this.II = I1_I.var_I1Io_arr_II[n5];
        this.IIO1 = n;
        this.IIO_ = n2;
        this.IIOo = n3;
        this.II0 = n4;
        this.IIlo = ilol;
        this.I_0 = this.II.IIO1;
        this.IIOI = n6 = I_Ol.III1(ilol.I_o_ - n, ilol.I_oO - n2);
        this.IIOl = this.I_0 * I_Ol.IIl1(n6) >> 10;
        this.IIlI = this.I_0 * I_Ol.IIll(n6) >> 10;
        if (n >= I1_I.Io1 && n <= I1_I.Io1 + II.var_int_IIl) {
            IO.II();
        }
    }

    @Override
    public void IIlO() {
        int n;
        for (n = 0; n < this.II.II10; ++n) {
            if (this.II.III_.length > 0) {
                this.II0_.addElement(new I_o0(this.IIO1, this.IIO_));
            }
            this.IIII = (this.IIlo != null ? this.IIlo.I_o_ : 0) - this.IIO1;
            this.IIIl = (this.IIlo != null ? this.IIlo.I_oO : 0) - 10 - this.IIO_;
            int n2 = 60;
            if (IOlO.l1oI == 0) {
                n2 = 600;
            }
            ++this.IoII;
            if (this.IIlo != null && (this.IIlo.IOIl == 5 || this.IIlo.IOIl == 14) || this.IIlo == null) {
                this.IIO1 += ((this.IIlo != null ? this.IIlo.I_o_ : 0) - this.IIO1) / 2;
                this.IIO_ += ((this.IIlo != null ? this.IIlo.I_oO : 0) - this.IIO_) / 2;
            }
            if (I_Ol.II1(this.IIII) < 16 && I_Ol.II1(this.IIIl) < 16 || this.IoII > n2) {
                if (this.IIlo != null && this.IIlo.IOI_ >= 0 && this.II0 != -1) {
                    if (this.II0 != -100) {
                        this.IIlo.II(this.IIOo, this.II0, false, true);
                    } else {
                        I_0.II(80, this.IIlo, 1);
                    }
                }
                I1l1.II1_.removeElement(this);
                if (this.II0 != -100) {
                    I_0.II(81, this.IIlo, 1);
                    if (this.IIO1 >= I1_I.Io1 && this.IIO1 <= I1_I.Io1 + II.var_int_IIl) {
                        IO.II();
                    }
                }
                return;
            }
            int n3 = I_Ol.III1(this.IIII, this.IIIl);
            if (Math.abs(n3 - this.IIOI) < 90 || this.IIII * this.IIII + this.IIIl * this.IIIl > 4096) {
                this.IIOI = Math.abs(n3 - this.IIOI) < 15 ? n3 : ((n3 - this.IIOI < 0 || n3 - this.IIOI >= 180) && n3 - this.IIOI >= -180 ? I_Ol.IIl_(this.IIOI - 15) : I_Ol.IIl_(this.IIOI + 15));
            }
            if (this.I_0 < 8192) {
                this.I_0 += 1024;
            }
            this.IIOl = this.I_0 * I_Ol.IIl1(this.IIOI) >> 10;
            this.IIlI = this.I_0 * I_Ol.IIll(this.IIOI) >> 10;
            this.IIII += this.IIOl;
            n3 = this.IIII >> 10;
            this.IIO1 += n3;
            this.IIII &= 0x3FF;
            this.IIIl += this.IIlI;
            n3 = this.IIIl >> 10;
            this.IIO_ += n3;
            this.IIIl &= 0x3FF;
        }
        for (n = 0; n < this.II0_.size(); ++n) {
            I_o0 i_o0 = (I_o0)this.II0_.elementAt(n);
            ++i_o0.II0I;
            if (i_o0.II0I < this.II.III_.length) continue;
            this.II0_.removeElementAt(n);
        }
    }

    public static int III0(int n) {
        for (int i = 0; i < I11.length - 1; ++i) {
            if (n < I11[i] || n > I11[i + 1]) continue;
            if (i >= 16) {
                return 0;
            }
            return i;
        }
        return 0;
    }

    @Override
    public void III_(IO1l iO1l) {
        int n;
        I_o0 i_o0;
        int n2;
        int n3 = I_lI.III0(360 - this.IIOI);
        byte by = IIl_[n3];
        n3 = I11I[n3];
        for (n2 = this.II0_.size() / 2; n2 < this.II0_.size(); ++n2) {
            i_o0 = (I_o0)this.II0_.elementAt(n2);
            I_oo.IIII(iO1l, this.II.IIIO[i_o0.II0I], i_o0.I_O0, i_o0.I_Oo, 0, 3);
        }
        n2 = II.var_int_IIIO % this.II.IIII.length;
        I_oo.IIII(iO1l, this.II.IIII[n2][by], this.IIO1, this.IIO_, n3, 3);
        for (n = 0; n < this.II0_.size(); ++n) {
            i_o0 = (I_o0)this.II0_.elementAt(n);
            I_oo.IIII(iO1l, this.II.III_[i_o0.II0I], i_o0.I_O0, i_o0.I_Oo, 0, 3);
        }
        I_oo.IIII(iO1l, this.II.III[n2][by], this.IIO1, this.IIO_, n3, 3);
        for (n = 0; n < this.II0_.size(); ++n) {
            i_o0 = (I_o0)this.II0_.elementAt(n);
            if (I_Ol.II1(III.nextInt(100)) >= this.II.II1O) continue;
            I_oo.IIII(iO1l, II.var_int_IIIO % 2 == 0 ? this.II.III0[i_o0.II0I] : this.II.IIIo[i_o0.II0I], i_o0.I_O0, i_o0.I_Oo, 0, 3);
        }
    }

    private static /* synthetic */ String Il_O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

