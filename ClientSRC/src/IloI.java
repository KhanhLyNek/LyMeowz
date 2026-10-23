/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class IloI
extends I_I_
implements I1_O {
    private static Image III0 = IO10.IIII(IloI.II0o("\u5e76\u5e15\u5ef6\u5edf\u5ebb\u5ebd\u5f7e\u5f53\u5f36\u5f15\u5fa0\u5fdd\u5fa5\u5f8d\u606f\u6045\u603e\u602a\u60ee\u60c1\u60eb\u6094\u616d\u6145", 24153));
    private static I1l0 III;
    public int II0I;
    public int I_O0;
    private int I_01;
    private int I_0_;
    private boolean II1;
    private int I_0O;
    private boolean I1IO = true;
    private int I_o;
    private int I_oI;
    private boolean I1l_;
    private int I_o1;
    private int IIIo;
    private Ilol[] IIII;
    private int[] II0l;
    private byte IIIl;
    private int[] II0_ = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
    private int[] IIoo;
    private int[] Il;
    private int[] IlI;
    private int[] IlII;
    private boolean IIl_;

    @Override
    public void II(short s) {
        this.IOo0 = true;
        this.IIO_ = s;
    }

    @Override
    public void IOll() {
        this.IOo0 = false;
    }

    public IloI(int n, short s, short s2, int n2, int n3, int n4) {
        int[] nArray = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        nArray = new int[]{1, 1, 2, 2, 3, 3, 2};
        this.IIoo = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9};
        this.Il = new int[]{0, 0, 0, 10, 10, 10, 11, 11, 11, 12, 12, 12};
        nArray = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
        this.IlI = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        this.IlII = new int[]{6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        byte[] byArray = new byte[]{-1, 1};
        this.lll = n;
        this.II0I = this.I1 = s + 20;
        short s3 = s2;
        this.I1I = s3;
        this.I_O0 = s3;
        this.llI0 = s2;
        this.llIl = n3;
        this.llI1 = n4;
        this.I1ll = 72;
        this.I100 = 100;
        this.I00l();
        III = null;
        III = new I1l0();
        String string = IloI.II0o("\u5e76\u5e00", 24153) + IO1l.l_I0 + IloI.II0o("\u5e76\u5e1d\u5ef1\u5ed0\u5eb0\u5e97\u5f67\u5f56\u5f30\u5f04\u5fee\u5f81", 24153) + 109 + IloI.II0o("\u5e76\u5e1c\u5ef6\u5ec2\u5eb4", 24153);
        try {
            III.II_(string);
            IloI.III.II01 = IO10.IIIl(IloI.II0o("\u5e76\u5e1d\u5ef1\u5ed0\u5eb0\u5e97\u5f67\u5f56\u5f30\u5f04\u5fee\u5f81\u5ffc\u5fdc\u6032\u6005\u6020\u6005\u60e0\u6088\u60b5\u608a\u6164", 24153));
        }
        catch (Exception exception) {
            I_0_.II().II0o(this.I1ll);
        }
        this.Iol = IloI.III.IIOI;
        this.IIl = IloI.III.IIOl;
        this.status = 2;
    }

    @Override
    public void IIIl(int[] nArray) {
        ++this.I_o;
        if (this.I_o > nArray.length - 1) {
            this.I_o = 0;
        }
        this.I_oI = nArray[this.I_o];
    }

    @Override
    public void IOl1() {
    }

    @Override
    public void IIlO() {
        if (this.IIO()) {
            IloI iloI = this;
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
                while (iloI.II1 && iloI.I_0O < 10) {
                    ++iloI.I_0O;
                    iloI.I_0_ += 24;
                    if (!IOlO.IIIl(iloI.I_01, iloI.I_0_, 2)) continue;
                    if (iloI.I_0_ % 24 == 0) break;
                    iloI.I_0_ -= iloI.I_0_ % 24;
                    break;
                }
            }
            switch (this.status) {
                case 0: 
                case 1: {
                    this.IIIl(this.II0_);
                    if (II.IIIO % 5 == 0) {
                        I_0.III(167, I_Ol.III_(this.I1 - 25, this.I1 + 25), I_Ol.III_(this.I1I - 50 + 20, this.I1I - 50 + 40), 1);
                    }
                    if (this.I1 == this.II0I && this.I1I == this.I_O0) break;
                    this.I1 += (this.II0I - this.I1) / 4;
                    this.I1I += (this.I_O0 - this.I1I) / 4;
                    break;
                }
                case 2: {
                    this.IIIl(this.II0_);
                    if (this.I1 != this.II0I || this.I1I != this.I_O0) {
                        this.I1 += (this.II0I - this.I1) / 4;
                        this.I1I += (this.I_O0 - this.I1I) / 4;
                    }
                    return;
                }
                case 3: {
                    this.IOl_();
                    return;
                }
                case 4: {
                    this.llIo = 0;
                    if (this.I1l_) {
                        this.I1 = this.II0I;
                        this.I_o1 += 2;
                        this.I1I += this.I_o1;
                        this.IIIl(this.IlII);
                        if (this.I1I > this.llI0) {
                            this.I1I = this.llI0;
                            this.I1l_ = false;
                            this.I_o1 = 0;
                            this.status = 2;
                            I1_I.lII1 = 10;
                            this.IIl_ = true;
                        }
                    }
                    return;
                }
                case 5: {
                    this.llIo = 0;
                    return;
                }
                case 6: {
                    this.llIo = 0;
                    ++((I_I_)this).IIII;
                    this.I1I += ((I_I_)this).IIII;
                    if (this.I1I < this.llI0) break;
                    this.I1I = this.llI0;
                    ((I_I_)this).IIII = 0;
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
        ((I_I_)this).IIII = 0;
        ((I_I_)this).IIIl = 0;
        this.status = 3;
        this.I_o = 0;
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
    final boolean II_0() {
        return this.I1ll >= 58 && this.I1ll <= 65 || this.I1ll == 67 || this.I1ll == 68;
    }

    public void II(Ilol[] ilolArray, int[] nArray, byte by) {
        this.status = 3;
        this.IIII = ilolArray;
        this.II0l = nArray;
        this.IIIl = by;
        this.I_o = 0;
    }

    @Override
    public void IOl_() {
        int n;
        if (this.IIIl == 0) {
            if (this.I_o == this.IIoo.length - 1) {
                this.status = 2;
            }
            this.llI_ = this.I1 < this.IIII[0].I_o_ ? 1 : -1;
            this.IIIl(this.IIoo);
            this.I1 += (this.IIII[0].I_o_ - this.I1) / 4;
            this.I1I += (this.IIII[0].I_oO - this.I1I) / 4;
            this.II0I = this.I1;
            if (this.I_o == 8) {
                for (n = 0; n < this.IIII.length; ++n) {
                    this.IIII[n].II(this.II0l[n], 0, false, false);
                    I_0.III(102, this.IIII[n].I_o_, this.IIII[n].I_oO, 1);
                }
            }
        }
        if (this.IIIl == 1) {
            if (this.I_o == this.Il.length - 1) {
                this.status = 2;
            }
            this.llI_ = this.I1 < this.IIII[0].I_o_ ? 1 : -1;
            this.IIIl(this.Il);
            if (this.I_o == 8) {
                for (n = 0; n < this.IIII.length; ++n) {
                    I_lI.II(this.I1 + (this.llI_ == 1 ? 45 : -45), this.I1I - 25, true, this.II0l[n], 0, this.IIII[n], 24);
                }
            }
        }
        if (this.IIIl == 2) {
            if (this.I_o == this.IlI.length - 1) {
                this.status = 2;
            }
            this.llI_ = this.I1 < this.IIII[0].I_o_ ? 1 : -1;
            this.IIIl(this.IlI);
            this.I1 += (this.IIII[0].I_o_ - this.I1) / 4;
            this.II0I = this.I1;
            this.I_O0 = this.I1I;
            if (this.I_o == 12) {
                for (n = 0; n < this.IIII.length; ++n) {
                    this.IIII[n].II(this.II0l[n], 0, false, false);
                    I_0.III(102, this.IIII[n].I_o_, this.IIII[n].I_oO, 1);
                }
            }
        }
    }

    @Override
    public void IOlO() {
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
        if (III != null && !this.I0I0) {
            if (this.I_O_) {
                if (!this.IOo0) {
                    III.II(iO1l, this.I_oI, this.I10I, ((I_I_)this).IIl_, this.llI_ == 1 ? 0 : 1, 2);
                } else {
                    I_oo.IIII(iO1l, this.IIO_, this.I10I, ((I_I_)this).IIl_, this.llI_ == 1 ? 0 : 2, 33);
                }
            } else {
                if (this.I1IO && this.status != 0) {
                    iO1l.II(III0, this.I_01, this.llI0, 3);
                    iO1l.IIIO(I1_I.Io1, I1_I.Io1I - II.II10, I1_I.I_0, I1_I.IIO + 2 * II.II10);
                }
                iO1l.IIl0(0, II.II10);
                if (!this.IOo0) {
                    III.II(iO1l, this.I_oI, this.I1, this.I1I, this.llI_ == 1 ? 0 : 1, 2);
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
                if (this.IIl_) {
                    ++this.IIIo;
                    I1lI.III(new I1ll(this.IIIl == 2 ? 19 : 22, this.I1 + this.IIIo * 50, this.I1I + 25, 2, 1, -1));
                    I1lI.III(new I1ll(this.IIIl == 2 ? 19 : 22, this.I1 - this.IIIo * 50, this.I1I + 25, 2, 1, -1));
                    if (this.IIIo == 50) {
                        this.IIIo = 0;
                        this.IIl_ = false;
                    }
                }
            }
        }
    }

    @Override
    public void IOl0() {
        this.llIl = 0;
        this.llIl = 0;
        this.status = 1;
        ((I_I_)this).IIII = -3;
        ((I_I_)this).IIIl = -this.llI_;
        this.III1 = 0;
    }

    @Override
    public void IIII(I_I_ i_I_) {
        this.IIlO = null;
        ((I_I_)this).IIII = 0;
        ((I_I_)this).IIIl = 0;
        this.status = 3;
        this.I_o = 0;
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
    public final int IIlo() {
        return this.I1;
    }

    @Override
    public final int II1() {
        return this.I1I - 50;
    }

    @Override
    public final int II1I() {
        return 40;
    }

    @Override
    public final int II1l() {
        return 50;
    }

    @Override
    public void IOlo() {
        if (this.status == 5) {
            this.status = 2;
            this.III1 = 0;
            ((I_I_)this).IIIl = 0;
            ((I_I_)this).IIII = 0;
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

    static {
        IO10.IIII(IloI.II0o("\u5e76\u5e15\u5ef6\u5edf\u5ebb\u5ebd\u5f7e\u5f53\u5f36\u5f15\u5fa0\u5fc3\u5fb4\u5fb8\u606e\u6052\u603d\u601d\u60f5\u60c3\u60f7\u6080\u616e\u614d\u6123\u6128\u612f\u61b0\u61cd\u61b2\u619c", 24153));
    }

    private static /* synthetic */ String II0o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

