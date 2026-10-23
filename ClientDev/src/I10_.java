package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I10_
implements I1_O {
    public int I1;
    public int I1I;
    private int lI0;
    private int lI0I;
    private int IIO1;
    private int IIO_;
    public int IoIO;
    public int lI0l;
    public I1o II;
    private byte II0;
    private int lI01;
    private int lI0_;
    private int lI0O;
    private int lI00;
    private int lI0o;
    private int lIo;
    private int[] I1I_;
    private int[] I1IO;
    private int[] I1I0;
    private int[] I1Io;
    private int Iol;
    private int IIl;
    public static Image IlOI = IO10.IIII(I10_.Il1I("\u6d0f\u6d52\u6d3f\u6d14\u6df2\u6df2\u6db7\u6d98\u6e7f\u6e52\u6e79\u6e18\u6eed\u6ee7\u6eb7\u6e89\u6f64\u6f5a\u6f3c\u6f08\u6fbe\u6fcf\u6fac\u6f85\u7069\u7055\u7023\u704b\u70f4\u70cd\u70a5", 27936));
    private static Image IlOl = IO10.IIII(I10_.Il1I("\u6d0f\u6d52\u6d3f\u6d14\u6df2\u6df2\u6db7\u6d98\u6e7f\u6e52\u6e79\u6e18\u6eed\u6ee7\u6eb7\u6e89\u6f64\u6f5a\u6f3c\u6f08\u6fbe\u6fcf\u6fa3\u6f9d\u706d\u704a\u7027\u7010\u70f6\u70c2\u70f3\u70cf\u7170\u7171\u7159", 27936));
    private static Image IlO1 = IO10.IIII(I10_.Il1I("\u6d0f\u6d52\u6d3f\u6d14\u6df2\u6df2\u6db7\u6d98\u6e7f\u6e52\u6e79\u6e18\u6eed\u6ee7\u6eb7\u6e89\u6f64\u6f5a\u6f3c\u6f08\u6fbe\u6fcf\u6fa3\u6f9d\u706d\u704a\u7027\u7010\u70f6\u70c2\u70f0\u70cf\u7170\u7171\u7159", 27936));
    private static Image IlO_ = IO10.IIII(I10_.Il1I("\u6d0f\u6d52\u6d3f\u6d14\u6df2\u6df2\u6db7\u6d98\u6e7f\u6e52\u6e79\u6e18\u6eed\u6ee7\u6eb7\u6e89\u6f64\u6f5a\u6f3c\u6f08\u6fbe\u6fcf\u6fa3\u6f9d\u706d\u704a\u7027\u7010\u70f6\u70c2\u70f1\u70cf\u7170\u7171\u7159", 27936));

    public I10_(short s, short s2, int n, int n2, int n3, int n4) {
        this.lI0l = s;
        this.II = I1oI.II(s2);
        this.I1 = n3;
        this.I1I = n2;
        this.lI0 = n3;
        this.lI0I = n4;
        this.IIO1 = n3 - n >> 2;
        this.IIO_ = 5;
    }

    public I10_(int n, short s, short s2, int n2, int n3, short s3) {
        this.lI0l = s;
        this.II = I1oI.II(s2);
        this.I1 = this.lI0 = n2;
        this.I1I = this.lI0I = n3;
        this.II0 = 1;
        this.IoIO = n;
        if (this.IIoo()) {
            this.lI01 = s3;
            this.lI0_ = this.I1;
            this.lI0O = this.I1I;
            this.lIo = 120;
            this.lI00 = 0;
            if (!II.var_boolean_II) {
                this.lI0o = 360 / this.lIo;
                this.I1I_ = new int[this.lIo];
                this.I1IO = new int[this.lIo];
                this.I1I0 = new int[this.lIo];
                this.I1Io = new int[this.lIo];
                this.I0O();
            }
        }
    }

    public void III0(int n, int n2) {
        this.lI0 = n;
        this.lI0I = n2;
        this.IIO1 = n - this.I1 >> 2;
        this.IIO_ = n2 - this.I1I >> 2;
        this.II0 = (byte)2;
    }

    public void IIl1() {
        if (this.II0 == 2 && this.I1 == this.lI0 && this.I1I == this.lI0I) {
            I1_I.var_I_lO_II_0.removeElement(this);
            if (Ilol.Ilol_II().var_I10__II != null && Ilol.Ilol_II().var_I10__II.equals(this)) {
                Ilol.Ilol_II().var_I10__II = null;
            }
        } else {
            if (this.II0 <= 0) {
                this.II0 = (byte)(this.II0 - 4);
                if (this.II0 < -12) {
                    this.I1I -= 12;
                    this.II0 = 1;
                }
            } else {
                if (this.IIO1 == 0) {
                    this.I1 = this.lI0;
                }
                if (this.IIO_ == 0) {
                    this.I1I = this.lI0I;
                }
                if (this.I1 != this.lI0) {
                    this.I1 += this.IIO1;
                    if (this.IIO1 > 0 && this.I1 > this.lI0 || this.IIO1 < 0 && this.I1 < this.lI0) {
                        this.I1 = this.lI0;
                    }
                }
                if (this.I1I != this.lI0I) {
                    this.I1I += this.IIO_;
                    if (this.IIO_ > 0 && this.I1I > this.lI0I || this.IIO_ < 0 && this.I1I < this.lI0I) {
                        this.I1I = this.lI0I;
                    }
                }
            }
            if (this.IIoo()) {
                ++this.Iol;
                ++this.IIl;
                if (this.IIl >= 40) {
                    this.IIl = 0;
                }
                if (this.Iol >= this.lIo) {
                    this.Iol = 0;
                }
                if (this.Iol % 10 == 0 && !II.var_boolean_II) {
                    I_0.III(114, this.I1 - 5, this.I1I - 30, 1);
                }
            }
        }
    }

    public void III_(IO1l iO1l) {
        if (!IIoo.II(this, iO1l)) {
            if (this.IIoo()) {
                iO1l.II(IOlO.IIlI, this.I1 + 3, this.I1I, 3);
                if (this.II0 <= 0) {
                    if (this.IIl < 10) {
                        iO1l.II(IlOl, this.I1, this.I1I + this.II0 + 3, 33);
                    } else {
                        iO1l.II(IlO1, this.I1, this.I1I + this.II0 + 3, 33);
                    }
                } else if (this.IIl < 10) {
                    iO1l.II(IlOl, this.I1, this.I1I + 3, 33);
                } else {
                    iO1l.II(IlO1, this.I1, this.I1I + 3, 33);
                }
                IO1l iO1l2 = iO1l;
                I10_ i10_ = this;
                if (!II.var_boolean_II) {
                    for (int i = 0; i < i10_.I1IO.length; ++i) {
                        if (i10_.Iol != i) continue;
                        if (i10_.IIl <= 20) {
                            iO1l2.II(IlO_, i10_.I1I0[i], i10_.I1Io[i] + 3, 33);
                            continue;
                        }
                        I_oo.IIII(iO1l2, i10_.II.II_O, i10_.I1I0[i], i10_.I1Io[i] + 3, 0, 33);
                    }
                }
            } else if (!this.IIoo()) {
                if (II.var_int_IIIO % 4 == 0) {
                    iO1l.II(IlOI, this.I1, this.I1I + this.II0 + 13, 33);
                }
                if (this.II0 <= 0) {
                    I_oo.IIII(iO1l, this.II.II_O, this.I1, this.I1I + this.II0 + 3, 0, 33);
                } else {
                    I_oo.IIII(iO1l, this.II.II_O, this.I1, this.I1I + 3, 0, 33);
                }
                if (Ilol.Ilol_II().var_I10__II != null && Ilol.Ilol_II().var_I10__II.equals(this) && this.II0 != 2) {
                    iO1l.II(I_I_.Il0, 0, 24, 9, 6, 0, this.I1, this.I1I - 17, 3);
                }
            }
        }
    }

    private boolean IIoo() {
        boolean bl = this.II.II0l == 22;
        return bl;
    }

    private void I0O() {
        if (!II.var_boolean_II) {
            for (int i = 0; i < this.I1IO.length; ++i) {
                this.I1IO[i] = I_Ol.II1(this.lI01 * I_Ol.IIll(this.lI00) / 1024);
                this.I1I_[i] = I_Ol.II1(this.lI01 * I_Ol.IIl1(this.lI00) / 1024);
                if (this.lI00 < 90) {
                    this.I1I0[i] = this.lI0_ + this.I1I_[i];
                    this.I1Io[i] = this.lI0O - this.I1IO[i];
                } else if (this.lI00 >= 90 && this.lI00 < 180) {
                    this.I1I0[i] = this.lI0_ - this.I1I_[i];
                    this.I1Io[i] = this.lI0O - this.I1IO[i];
                } else if (this.lI00 >= 180 && this.lI00 < 270) {
                    this.I1I0[i] = this.lI0_ - this.I1I_[i];
                    this.I1Io[i] = this.lI0O + this.I1IO[i];
                } else {
                    this.I1I0[i] = this.lI0_ + this.I1I_[i];
                    this.I1Io[i] = this.lI0O + this.I1IO[i];
                }
                this.lI00 += this.lI0o;
            }
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
        return 20;
    }

    @Override
    public final int II1l() {
        return 20;
    }

    @Override
    public void IOlo() {
    }

    @Override
    public final boolean IIOl() {
        return false;
    }

    private static /* synthetic */ String Il1I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

