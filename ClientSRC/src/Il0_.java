/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Il0_
extends I_I_
implements I1_O {
    private static Image III0 = IO10.IIII(Il0_.II01("\u205a\u20f9\u20d2\u20bb\u209f\u2159\u2142\u212f\u210a\u21e9\u2184\u21b9\u2181\u2269\u2243\u2229\u2212\u22c6\u22ca\u22a5\u22cf\u2370\u2371\u2359", 8309));
    private static I1l0 II;
    public int I_0I;
    public int I_0l;
    private int I_01;
    private int I_0_;
    private boolean II1;
    private int I_0O;
    private boolean I1IO = true;
    private int I_00;
    private int I_0o;
    private Ilol[] II;
    private int[] II0;
    private byte II;
    private int[] II0I = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
    private int[] II0l = new int[]{0, 0, 0, 2, 2, 2, 3, 3, 3, 4, 4, 4};
    private int[] II01 = new int[]{0, 0, 0, 4, 4, 4, 5, 5, 5, 6, 6, 6};
    private int[] II0_ = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11};

    @Override
    public void II(short s) {
        this.IOo0 = true;
        this.IIO_ = s;
    }

    @Override
    public void IOll() {
        this.IOo0 = false;
    }

    public Il0_(int n, short s, short s2, int n2, int n3, int n4) {
        int[] nArray = new int[]{1, 1, 7, 7};
        byte[] byArray = new byte[]{-1, 1};
        this.lll = n;
        this.I1 = s + 20;
        this.I1I = s2;
        this.I_0I = this.I1;
        this.I_0l = this.I1I;
        this.llI1 = n4;
        this.llIl = n3;
        this.I1ll = 71;
        this.I100 = 100;
        this.I00l();
        II = null;
        II = new I1l0();
        String string = Il0_.II01("\u205a\u20ec", 8309) + IO1l.l_I0 + Il0_.II01("\u205a\u20f1\u20d5\u20b4\u2094\u2173\u215b\u212a\u210c\u21f8\u21ca\u21e5", 8309) + 108 + Il0_.II01("\u205a\u20f0\u20d2\u20a6\u2090", 8309);
        try {
            II.II_(string);
            Il0_.II.II01 = IO10.IIIl(Il0_.II01("\u205a\u20f1\u20d5\u20b4\u2094\u2173\u215b\u212a\u210c\u21f8\u21ca\u21e5\u21d8\u2238\u221f\u2269\u220c\u22e9\u22c4\u22ec\u2291\u236e\u2378", 8309));
        }
        catch (Exception exception) {
            I_0_.II().II0o(this.I1ll);
        }
        this.Iol = Il0_.II.IIOI;
        this.IIl = Il0_.II.IIOl;
        this.status = 2;
    }

    public void IIII(int[] nArray) {
        ++this.I_00;
        if (this.I_00 > nArray.length - 1) {
            this.I_00 = 0;
        }
        this.I_0o = nArray[this.I_00];
    }

    @Override
    public void IOl1() {
    }

    @Override
    public void IIlO() {
        if (this.IIO()) {
            Il0_ il0_ = this;
            byte by = IOlO.IlI0;
            this.I_01 = this.I1;
            this.I_0O = 0;
            if (this.I_0_ > 0 && !IOlO.IIIl(this.I_01, this.I_0_, 2)) {
                if (IOlO.IIIo(this.I_01 / by, this.I_0_ / by) == 0) {
                    this.II1 = true;
                } else if (IOlO.IIIo(this.I_01 / by, this.I_0_ / by) != 0 && !IOlO.IIIl(this.I_01, this.I_0_, 2)) {
                    this.I_01 = this.I1;
                    this.I_0_ = this.I1I;
                    this.II1 = false;
                }
                while (il0_.II1 && il0_.I_0O < 10) {
                    ++il0_.I_0O;
                    il0_.I_0_ += 24;
                    if (!IOlO.IIIl(il0_.I_01, il0_.I_0_, 2)) continue;
                    if (il0_.I_0_ % 24 == 0) break;
                    il0_.I_0_ -= il0_.I_0_ % 24;
                    break;
                }
            }
            switch (this.status) {
                case 0: 
                case 1: {
                    this.IIII(this.II0I);
                    if (II.IIIO % 5 == 0) {
                        I_0.III(167, I_Ol.III_(this.I1 - 20, this.I1 + 20), I_Ol.III_(this.I1I - 40 + 20, this.I1I - 40 + 40), 1);
                    }
                    if (this.I1 == this.I_0I && this.I1I == this.I_0l) break;
                    this.I1 += (this.I_0I - this.I1) / 4;
                    this.I1I += (this.I_0l - this.I1I) / 4;
                    break;
                }
                case 2: {
                    this.IIII(this.II0I);
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
                    return;
                }
            }
        }
    }

    @Override
    public void IIII() {
    }

    @Override
    public void IIIl(Ilol ilol) {
        this.IIlO = ilol;
        this.IIII = 0;
        this.IIIl = 0;
        this.status = 3;
        this.I_00 = 0;
        this.llI_ = ilol.I_o_ > this.I1 ? 1 : -1;
        int n = ilol.I_o_;
        int n2 = ilol.I_oO;
        if (I_Ol.II1(n - this.I1) < this.Iol << 1 && I_Ol.II1(n2 - this.I1I) < this.IIl << 1) {
            this.I1 = this.I1 < n ? n - this.Iol : n + this.Iol;
            this.III1 = 0;
        } else {
            this.III1 = 1;
        }
    }

    @Override
    boolean II_0() {
        return this.I1ll >= 58 && this.I1ll <= 65 || this.I1ll == 67 || this.I1ll == 68;
    }

    public void II(Ilol[] ilolArray, int[] nArray, byte by) {
        this.II = ilolArray;
        this.II0 = nArray;
        this.II = by;
        this.status = 3;
    }

    @Override
    public void IOl_() {
        int n;
        if (this.II == 3) {
            if (this.I_00 == this.II01.length - 1) {
                this.status = 2;
            }
            this.llI_ = this.I1 < this.II[0].I_o_ ? 1 : -1;
            this.IIII(this.II01);
            this.I1 += (this.II[0].I_o_ - this.I1) / 4;
            this.I1I += (this.II[0].I_oO - this.I1I) / 4;
            this.I_0I = this.I1;
            if (this.I_00 == 8) {
                for (n = 0; n < this.II.length; ++n) {
                    this.II[n].II(this.II0[n], 0, false, false);
                    I_0.III(102, this.II[n].I_o_, this.II[n].I_oO, 1);
                }
            }
        }
        if (this.II == 4) {
            if (this.I_00 == this.II0_.length - 1) {
                this.status = 2;
            }
            this.llI_ = this.I1 < this.II[0].I_o_ ? 1 : -1;
            this.IIII(this.II0_);
            if (this.I_00 == 8) {
                for (n = 0; n < this.II.length; ++n) {
                    this.II[n].II(this.II0[n], 0, false, false);
                    I_0.III(102, this.II[n].I_o_, this.II[n].I_oO, 1);
                }
            }
        }
    }

    @Override
    public void IOlO() {
        this.IIII(this.II0l);
        this.I1 += this.I1 < this.I_0I ? 2 : -2;
        this.I1I = this.I_0l;
        int n = this.llI_ = this.I1 < this.I_0I ? 1 : -1;
        if (I_Ol.II1(this.I1 - this.I_0I) <= 1) {
            this.I1 = this.I_0I;
            this.status = 2;
        }
    }

    @Override
    public boolean II_o() {
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
    public boolean IIO() {
        return this.status != 0;
    }

    @Override
    public boolean IIOI() {
        return this.I0Il || this.II0o > 0;
    }

    @Override
    public void II(IO1l iO1l) {
        if (II != null && !this.I0I0) {
            if (this.I_O_) {
                if (!this.IOo0) {
                    II.II(iO1l, this.I_0o, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 1, 2);
                } else {
                    I_oo.IIII(iO1l, this.IIO_, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 2, 33);
                }
            } else {
                if (this.I1IO && this.status != 0) {
                    iO1l.II(III0, this.I_01, this.llI0, 3);
                    iO1l.IIIO(I1_I.Io1, I1_I.Io1I - II.II10, I1_I.I_0, I1_I.IIO + 2 * II.II10);
                }
                iO1l.IIl0(0, II.II10);
                if (!this.IOo0) {
                    II.II(iO1l, this.I_0o, this.I1, this.I1I, this.llI_ == 1 ? 0 : 1, 2);
                } else {
                    I_oo.IIII(iO1l, this.IIO_, this.I1, this.I1I - 9, this.llI_ == 1 ? 0 : 2, 33);
                }
                iO1l.IIl0(0, -II.II10);
                int n = IO1l.II(this.Il0I);
                int n2 = IO1l.III(this.Il0I);
                int n3 = n;
                int n4 = this.I1 - n;
                int n5 = this.I1I - this.IIl - 5;
                int n6 = (n << 1) * this.I10o / 100;
                if (n6 > n) {
                    if ((n6 -= n) <= 0) {
                        n6 = 0;
                    }
                } else {
                    n3 = n6;
                    n6 = 0;
                }
                iO1l.II(I1_I.Il1_, n4, n5, 20);
                iO1l.II(I1_I.Il1_, n4 + n, n5, 20);
                iO1l.II(this.Il0I, 0, 0, n3, n2, 0, n4, n5, 20);
                iO1l.II(this.Il0I, 0, 0, n6, n2, 0, n4 + n, n5, 20);
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
        this.I_00 = 0;
        this.llI_ = i_I_.I1 > this.I1 ? 1 : -1;
        int n = i_I_.I1;
        int n2 = i_I_.I1I;
        if (I_Ol.II1(n - this.I1) < this.Iol << 1 && I_Ol.II1(n2 - this.I1I) < this.IIl << 1) {
            this.I1 = this.I1 < n ? n - this.Iol : n + this.Iol;
            this.III1 = 0;
        } else {
            this.III1 = 1;
        }
    }

    @Override
    public int IIlo() {
        return this.I1;
    }

    @Override
    public int II1() {
        return this.I1I - 40;
    }

    @Override
    public int II1I() {
        return 40;
    }

    @Override
    public int II1l() {
        return 40;
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
    public boolean IIOl() {
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

    public void III(short s) {
        this.I_0I = s;
        this.status = 5;
    }

    static {
        IO10.IIII(Il0_.II01("\u205a\u20f9\u20d2\u20bb\u209f\u2159\u2142\u212f\u210a\u21e9\u2184\u21a7\u2190\u225c\u2242\u223e\u2211\u22f1\u22d1\u22a7\u22d3\u2364\u2372\u2351\u233f\u2334\u23cb\u2394\u23a9\u2396\u2470", 8309));
    }

    private static /* synthetic */ String II01(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

