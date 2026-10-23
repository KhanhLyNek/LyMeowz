/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I_1I
extends I_I_
implements I1_O {
    private static Image III0 = IO10.IIII(I_1I.IlO("\u4031\u4050\u403d\u4012\u40f4\u40f0\u40b5\u4096\u4171\u4150\u417b\u4100\u41fa\u41d0\u41b4\u4180\u4279\u426f\u4225\u420c\u42a4\u42d9\u42a6\u4280", 16414));
    public int I_0I;
    public int I_0l;
    private int lll_;
    private int I_01;
    private boolean I0I_ = true;
    private int IO1I;
    private int I_0O;
    private Ilol[] III_;
    private int[] I11l;
    private byte IIo1;
    private int llll;
    private int I_o1 = -1;
    private int IIIo = -1;
    private int I_ol = -1;
    private int[][] IIl;

    @Override
    public void II(short s) {
        this.IOo0 = true;
        this.IIO_ = s;
    }

    @Override
    public void IOll() {
        this.IOo0 = false;
    }

    public I_1I(int n, short s, short s2, int n2, int n3, int n4) {
        byte[] byArray = new byte[]{-1, 1};
        this.IIl = new int[][]{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
        this.lll = n;
        this.I1 = this.llIO = s + 20;
        short s3 = s2;
        this.llI0 = s3;
        this.I1I = s3;
        this.I_0I = this.I1;
        this.I_0l = this.I1I;
        this.llI1 = n4;
        this.llIl = n3;
        this.I1ll = n2;
        this.I100 = 100;
        this.I00l();
        if (I_I_.II[this.I1ll].II == null) {
            I_0_.II().II0o(this.I1ll);
        }
        this.status = 2;
        this.IIl = null;
    }

    @Override
    public void IIIl(int[] nArray) {
        ++this.IO1I;
        if (this.IO1I > nArray.length - 1) {
            this.IO1I = 0;
        }
        this.I_0O = nArray[this.IO1I];
    }

    @Override
    public void IOl1() {
    }

    @Override
    public void IIlO() {
        if (this.IIl == null && I_I_.II[this.I1ll].II != null) {
            this.IOo();
        }
        if (this.IIl != null && this.IIO()) {
            I_1I i_1I = this;
            int n = 0;
            this.lll_ = this.I1;
            if (IOlO.IIIl(this.I1, this.I1I, 2)) {
                this.I_01 = this.I1I;
            } else {
                this.I_01 = this.I1I;
                while (n < 30) {
                    ++n;
                    i_1I.I_01 += 24;
                    if (!IOlO.IIIl(i_1I.lll_, i_1I.I_01, 2)) continue;
                    if (i_1I.I_01 % 24 == 0) break;
                    i_1I.I_01 -= i_1I.I_01 % 24;
                    break;
                }
            }
            switch (this.status) {
                case 0: 
                case 1: {
                    ++this.IO1I;
                    if (this.IO1I > this.IIl[13].length - 1) {
                        this.IO1I = this.IIl[13].length - 1;
                    }
                    this.I_0O = this.IIl[13][this.IO1I];
                    if (this.I1 == this.I_0I && this.I1I == this.I_0l) break;
                    this.I1 += (this.I_0I - this.I1) / 4;
                    this.I1I += (this.I_0l - this.I1I) / 4;
                    break;
                }
                case 2: {
                    this.IIIl(this.IIl[0]);
                    if (this.I1 != this.I_0I || this.I1I != this.I_0l) {
                        this.I1 += (this.I_0I - this.I1) / 4;
                        this.I1I += (this.I_0l - this.I1I) / 4;
                    }
                    return;
                }
                case 3: {
                    this.IOl_();
                    return;
                }
                default: {
                    break;
                }
                case 5: {
                    this.llIo = 0;
                    this.IOlO();
                    return;
                }
                case 6: {
                    this.llIo = 0;
                    ++this.IIII;
                    this.I1I += this.IIII;
                    if (this.I1I < this.llI0) break;
                    this.I1I = this.llI0;
                    this.IIII = 0;
                    this.status = 5;
                    return;
                }
                case 7: {
                    super.IIlO();
                    return;
                }
            }
        }
    }

    @Override
    public void IIIl(Ilol ilol) {
        this.IIlO = ilol;
        this.IIII = 0;
        this.IIIl = 0;
        this.status = 3;
        this.IO1I = 0;
        int n = ilol.I_o_;
        int n2 = ilol.I_oO;
        if (I_Ol.II1(n - this.I1) < this.Iol << 1 && I_Ol.II1(n2 - this.I1I) < ((I_I_)this).IIl << 1) {
            this.I1 = this.I1 < n ? n - this.Iol : n + this.Iol;
            this.III1 = 0;
        } else {
            this.III1 = 1;
        }
    }

    public void I001() {
        this.status = 4;
    }

    public void II(Ilol[] ilolArray, int[] nArray, byte by, byte by2) {
        this.III_ = ilolArray;
        this.I11l = nArray;
        this.IIo1 = by;
        this.llI_ = by2;
        this.status = 3;
        if (this.I1 != this.I_0I || this.I1I != this.I_0l) {
            this.I1 += (this.I_0I - this.I1) / 4;
            this.I1I += (this.I_0l - this.I1I) / 4;
        }
    }

    @Override
    public void IOl_() {
        if (this.IO1I == this.IIl[this.IIo1 + 1].length - 1) {
            this.status = 2;
        }
        this.IIIl(this.IIl[this.IIo1 + 1]);
        if (this.IO1I == this.IIl[15][this.IIo1 - 1]) {
            for (int i = 0; i < this.III_.length; ++i) {
                this.III_[i].II(this.I11l[i], 0, false, false);
                I_0.III(this.IIl[16][this.IIo1 - 1], this.III_[i].I_o_, this.III_[i].I_oO, 1);
            }
        }
    }

    @Override
    public void IOlO() {
        int n;
        this.IIIl(this.IIl[1]);
        int n2 = n = I_I_.II[this.I1ll].IIoI;
        if (I_Ol.II1(this.I1 - this.I_0I) < n) {
            n2 = I_Ol.II1(this.I1 - this.I_0I);
        }
        this.I1 += this.I1 < this.I_0I ? n2 : -n2;
        this.I1I = this.I_0l;
        if (this.I1 < this.I_0I) {
            this.llI_ = 1;
        } else if (this.I1 > this.I_0I) {
            this.llI_ = -1;
        }
        if (I_Ol.II1(this.I1 - this.I_0I) <= 1) {
            this.I1 = this.I_0I;
            this.status = 2;
        }
    }

    @Override
    public final boolean II_o() {
        if (this.I1 < I1_I.Io1) {
            return false;
        }
        if (this.I1 > I1_I.Io1 + I1_I.I_0) {
            return false;
        }
        if (this.I1I < I1_I.Io1I) {
            return false;
        }
        if (this.I1I > I1_I.Io1I + I1_I.IIO + 30) {
            return false;
        }
        return this.status != 0;
    }

    @Override
    public final boolean IIO() {
        return this.status != 0;
    }

    @Override
    public final boolean IIOI() {
        return this.I0Il || this.II0o > 0;
    }

    @Override
    public void II(IO1l iO1l) {
        if (I_I_.II[this.I1ll].II != null && !this.I0I0) {
            if (this.I_O_) {
                if (!this.IOo0) {
                    I_I_.II[this.I1ll].II.II(iO1l, this.I_0O, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 1, 2);
                } else {
                    I_oo.IIII(iO1l, this.IIO_, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 2, 33);
                }
            } else {
                int n;
                if (this.I0I_) {
                    n = IOlO.IlI0;
                    if ((IOlO.l1oI < 114 || IOlO.l1oI > 120) && IOlO.l1oI != 127 && IOlO.l1oI != 128) {
                        if (IOlO.IIIl(this.lll_ + n / 2, this.I_01 + 1, 4)) {
                            iO1l.IIIO(this.lll_ / n * n, (this.I_01 - 30) / n * n, n, 100);
                        } else if (IOlO.IIIo((this.lll_ - n / 2) / n, (this.I_01 + 1) / n) == 0) {
                            iO1l.IIIO(this.lll_ / n * n, (this.I_01 - 30) / n * n, 100, 100);
                        } else if (IOlO.IIIo((this.lll_ + n / 2) / n, (this.I_01 + 1) / n) == 0) {
                            iO1l.IIIO(this.lll_ / n * n, (this.I_01 - 30) / n * n, n, 100);
                        } else if (IOlO.IIIl(this.lll_ - n / 2, this.I_01 + 1, 8)) {
                            iO1l.IIIO(this.lll_ / 24 * n, (this.I_01 - 30) / n * n, n, 100);
                        }
                    }
                    iO1l.II(III0, this.lll_, this.I_01 - 5, 3);
                    iO1l.IIIO(I1_I.Io1, I1_I.Io1I - II.II10, I1_I.I_0, I1_I.IIO + 2 * II.II10);
                }
                iO1l.IIl0(0, II.II10);
                if (!this.IOo0) {
                    if (this.I_ol == -1) {
                        this.I_ol = this.I1I;
                    }
                    if (IOlO.IIIl(this.I1 + 33, this.I1I, 4)) {
                        this.IIIo = IOlO.II1l(this.I1 + 33) - 33;
                        this.I_o1 = IOlO.II1l(this.I1 + 33);
                        if (this.I1 > this.IIIo && this.I1 < this.I_o1 && this.I_o1 != -1) {
                            this.I1 = this.IIIo;
                        }
                    }
                    if (this.I1I < this.I_ol && this.I_ol != -1) {
                        this.I_ol = this.I1I;
                        this.I1 += 33;
                    }
                    if (this.I1I > this.I_ol) {
                        this.I_ol = this.I1I;
                        this.I1 -= 33;
                    }
                    I_I_.II[this.I1ll].II.II(iO1l, this.I_0O, this.I1, this.I1I, this.llI_ == 1 ? 0 : 1, 2);
                } else {
                    I_oo.IIII(iO1l, this.IIO_, this.I1, this.I1I - 9, this.llI_ == 1 ? 0 : 2, 33);
                }
                iO1l.IIl0(0, -II.II10);
                if (this.llIl > 0) {
                    int n2;
                    n = IO1l.II(this.Il0I);
                    int n3 = IO1l.III(this.Il0I);
                    int n4 = n;
                    int n5 = this.I1 - n;
                    int n6 = this.I1I - ((I_I_)this).IIl - 5;
                    int n7 = n2 = (n << 1) * this.I10o / 100;
                    if (this.I1o >= this.I10o) {
                        int n8;
                        int n9 = this.I1o;
                        if (II.IIIO % 6 > 3) {
                            int n10;
                            n8 = n10 = this.llll;
                            this.llll = n10 + 1;
                        } else {
                            n8 = this.llll;
                        }
                        this.I1o = n9 - n8;
                        n7 = n * this.I1o / 100;
                        if (this.I1o <= 0) {
                            this.I1o = 0;
                        }
                        if (this.I1o < this.I10o) {
                            this.I1o = this.I10o;
                        }
                        if (this.llll >= 3) {
                            this.llll = 3;
                        }
                    }
                    if (n2 > n) {
                        if ((n2 -= n) <= 0) {
                            n2 = 0;
                        }
                    } else {
                        n4 = n2;
                        n2 = 0;
                    }
                    iO1l.II(I1_I.Il1_, n5, n6, 20);
                    iO1l.II(I1_I.Il1_, n5 + n, n6, 20);
                    iO1l.Illl(0xFFFFFF);
                    iO1l.III_(n5, n6, n7, 2);
                    iO1l.II(this.Il0I, 0, 0, n4, n3, 0, n5, n6, 20);
                    iO1l.II(this.Il0I, 0, 0, n2, n3, 0, n5 + n, n6, 20);
                }
            }
        }
    }

    @Override
    public void IOl0() {
        this.llIl = 0;
        this.llIl = 0;
        this.status = 1;
        this.IIII = -3;
        this.IIIl = -this.llI_;
        this.III1 = 0;
    }

    @Override
    public void IIII(I_I_ i_I_) {
        this.IIlO = null;
        this.IIII = 0;
        this.IIIl = 0;
        this.status = 3;
        this.IO1I = 0;
        int n = i_I_.I1;
        int n2 = i_I_.I1I;
        if (I_Ol.II1(n - this.I1) < this.Iol << 1 && I_Ol.II1(n2 - this.I1I) < ((I_I_)this).IIl << 1) {
            this.I1 = this.I1 < n ? n - this.Iol : n + this.Iol;
            this.III1 = 0;
        } else {
            this.III1 = 1;
        }
    }

    @Override
    public final int IIlo() {
        return this.I1;
    }

    @Override
    public final int II1() {
        return this.I1I;
    }

    @Override
    public final int II1I() {
        return ((I_I_)this).IIl;
    }

    @Override
    public final int II1l() {
        return this.Iol;
    }

    @Override
    public void IOlo() {
        if (this.status == 5) {
            this.status = 2;
            this.III1 = 0;
            this.IIIl = 0;
            this.IIII = 0;
        }
    }

    @Override
    public final boolean IIOl() {
        return this.status == 0 || this.status == 1;
    }

    @Override
    public void IO1() {
        if (this.IIO_ != 0) {
            this.IIO_ = 0;
        }
    }

    @Override
    public void IO1I() {
    }

    @Override
    public void IO1l() {
    }

    public void IIII(short s, short s2) {
        if (s2 != -1) {
            if (I_Ol.II(this.I1, this.I1I, this.I_0I, this.I_0l) > 100) {
                this.I1 = s;
                this.I1I = s2;
                this.status = 2;
            } else {
                this.I_0I = s;
                this.I_0l = s2;
                this.status = 5;
            }
        } else {
            this.I_0I = s;
            this.status = 5;
        }
    }

    @Override
    public void IOo() {
        try {
            this.IIl = (int[][])I1I1.IIIl.get(String.valueOf(this.I1ll));
            this.Iol = I_I_.II[this.I1ll].II.IIOI;
            ((I_I_)this).IIl = I_I_.II[this.I1ll].II.IIOl;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void I00_() {
        this.status = 0;
    }

    static {
        IO10.IIII(I_1I.IlO("\u4031\u4050\u403d\u4012\u40f4\u40f0\u40b5\u4096\u4171\u4150\u417b\u411e\u41eb\u41e5\u41b5\u4197\u427a\u4258\u423e\u420e\u42b8\u42cd\u42a5\u4288\u4364\u436d\u4314\u434d\u43f2\u43cf\u43a7", 16414));
    }

    private static /* synthetic */ String IlO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

