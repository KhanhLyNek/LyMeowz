package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I1oO
extends Ilol {
    private static I1l0 var_I1l0_IIII;
    private static I1l0 IIIl;
    private int I_00 = 0;
    private int I_0;
    private boolean IOoI;
    private I1ll var_I1ll_IIII;
    private Ilol IIl_;
    private int IIlI;
    private int IIO1;
    private Ilol[] III1;
    private int[] IIoI;
    private int var_int_IIO0;
    private int[] IIOO = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    private int[] var_int_arr_IIO0 = new int[]{0, 0, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 10, 10};
    private int[] I1l = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12};
    private int[] I1lI = new int[]{13, 13, 14, 14, 15, 15, 16, 16};
    private int[][] III_ = new int[][]{this.IIOO, this.var_int_arr_IIO0, this.I1l, this.I1lI};
    private byte II0O = (byte)-1;
    private int I_0o;
    private int lIo0;

    public void IIII(int n) {
        this.var_I1ll_IIII = new I1ll(105, this.I_o_, this.I_oO + 20, 2, 1, -1);
        I1lI.III(this.var_I1ll_IIII);
        this.IIl_ = n == Ilol.Ilol_II().IOI_ ? Ilol.Ilol_II() : I1_I.Ilol_II(n);
    }

    @Override
    public void IIII(int[] nArray) {
        if (this.II0O == 0) {
            if (this.I_00 == 11) {
                this.IOoI = true;
                I1lI.III(new I1ll(19, this.I_o_, this.I_oO + 20, 2, 1, -1));
            }
            if (this.I_00 >= nArray.length - 1) {
                this.II0O = (byte)2;
                return;
            }
        }
        if (this.II0O == 1 && this.I_00 == nArray.length - 1) {
            this.II0O = (byte)3;
            this.I_oO -= 15;
        } else {
            ++this.I_00;
            if (this.I_00 > nArray.length - 1) {
                this.I_00 = 0;
            }
            this.I_0o = nArray[this.I_00];
        }
    }

    public I1oO() {
        var_I1l0_IIII = null;
        var_I1l0_IIII = new I1l0();
        String string = I1oO.Il10("\u8ace\u8b78", 35553) + IO1l.l_I0 + I1oO.Il10("\u8ace\u8b65\u8b79\u8b58\u8b38\u8b1f\u8bef\u8bde\u8bb8\u8b8c\u8c76\u8c19", 35553) + 102 + I1oO.Il10("\u8ace\u8b64\u8b7e\u8b4a\u8b3c", 35553);
        try {
            var_I1l0_IIII.II_(string);
            I1oO.var_I1l0_IIII.II01 = IO10.IIIl(I1oO.Il10("\u8ace\u8b65\u8b79\u8b58\u8b38\u8b1f\u8bef\u8bde\u8bb8\u8b8c\u8c76\u8c19\u8c64\u8c44\u8ca1\u8c9d\u8cb8\u8c9d\u8d68\u8d00\u8d3d\u8d02\u8dec", 35553));
        }
        catch (Exception exception) {
            // empty catch block
        }
        IIIl = null;
        IIIl = new I1l0();
        string = I1oO.Il10("\u8ace\u8b78", 35553) + IO1l.l_I0 + I1oO.Il10("\u8ace\u8b65\u8b79\u8b58\u8b38\u8b1f\u8bef\u8bde\u8bb8\u8b8c\u8c76\u8c19", 35553) + 103 + I1oO.Il10("\u8ace\u8b64\u8b7e\u8b4a\u8b3c", 35553);
        try {
            IIIl.II_(string);
            I1oO.IIIl.II01 = IO10.IIIl(I1oO.Il10("\u8ace\u8b65\u8b79\u8b58\u8b38\u8b1f\u8bef\u8bde\u8bb8\u8b8c\u8c76\u8c19\u8c64\u8c44\u8ca0\u8c9d\u8cb8\u8c9d\u8d68\u8d00\u8d3d\u8d02\u8dec", 35553));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void II(byte by, short s, short s2, Ilol[] ilolArray, int[] nArray) {
        this.II0O = by;
        this.IIlI = s;
        this.IIO1 = s2;
        this.I_0 = this.IOI1;
        this.IOI1 = this.IIlI > this.I_o_ ? 1 : -1;
        this.III1 = ilolArray;
        this.IIoI = nArray;
    }

    @Override
    public void IIl1() {
        I1ll i1ll;
        if (this.IIl_ != null) {
            if (this.var_I1ll_IIII.IIO >= 30) {
                i1ll = this.var_I1ll_IIII;
                i1ll.IIOI += (this.I_o_ - this.var_I1ll_IIII.IIOI) / 4;
                i1ll = this.var_I1ll_IIII;
                i1ll.IIOl += (this.I_oO - this.var_I1ll_IIII.IIOl) / 4;
                this.IIl_.I_o_ = this.var_I1ll_IIII.IIOI;
                this.IIl_.I_oO = this.var_I1ll_IIII.IIOl;
                this.IIl_.I1oO = true;
            } else {
                this.var_I1ll_IIII.IIO_ = this.var_I1ll_IIII.IIOI > this.IIl_.I_o_ ? 1 : 0;
                i1ll = this.var_I1ll_IIII;
                i1ll.IIOI += (this.IIl_.I_o_ - this.var_I1ll_IIII.IIOI) / 3;
                i1ll = this.var_I1ll_IIII;
                i1ll.IIOl += (this.IIl_.I_oO - this.var_I1ll_IIII.IIOl) / 3;
            }
        }
        if (this.II0O == -1) {
            this.IIl1();
        } else {
            if (this.II0O == 0 && this.IOoI && II.var_int_IIIO % 2 == 0) {
                this.var_int_IIO0 += this.IIlI > this.I_o_ ? 30 : -30;
                i1ll = new I1ll(103, this.I_o_ + this.var_int_IIO0, this.I_oO + 20, 2, 1, -1);
                new I1ll(103, this.I_o_ + this.var_int_IIO0, this.I_oO + 20, 2, 1, -1).IIO_ = this.IIlI > this.I_o_ ? 0 : 1;
                I1lI.III(i1ll);
                if (this.IOI1 == 1 && this.I_o_ + this.var_int_IIO0 >= this.IIlI || this.IOI1 == -1 && this.I_o_ + this.var_int_IIO0 <= this.IIlI) {
                    this.IOoI = false;
                    this.II0O = (byte)-1;
                    this.var_int_IIO0 = 0;
                    this.I_00 = 0;
                    this.IOI1 = this.I_0;
                    for (int i = 0; i < this.III1.length; ++i) {
                        this.III1[i].II(this.IIoI[i], 0, false, false);
                    }
                }
            }
            if (this.II0O == 3) {
                this.IIlI = this.III1[this.lIo0].I_o_;
                this.IIO1 = this.III1[this.lIo0].I_oO;
                this.I_o_ += (this.IIlI - this.I_o_) / 3;
                this.I_oO += (this.IIO1 - this.I_oO) / 3;
                if (II.var_int_IIIO % 5 == 0) {
                    I1lI.III(new I1ll(19, this.I_o_, this.I_oO, 2, 1, -1));
                }
                if (I_Ol.II1(this.I_o_ - this.IIlI) <= 20 && I_Ol.II1(this.I_oO - this.IIO1) <= 20) {
                    this.I_o_ = this.IIlI;
                    this.I_oO = this.IIO1;
                    this.III1[this.lIo0].II(this.IIoI[this.lIo0], 0, false, false);
                    ++this.lIo0;
                    if (this.lIo0 == this.III1.length) {
                        this.II0O = (byte)-1;
                        this.lIo0 = 0;
                    }
                }
            }
        }
    }

    @Override
    public void II(IO1l iO1l) {
        if (this.II0O == -1) {
            this.II(iO1l);
        } else {
            this.II1I(iO1l);
            iO1l.IIl0(0, II.II10);
            this.IIII(this.III_[this.II0O]);
            if (this.II0O != 0 && this.II0O != 1) {
                IIIl.II(iO1l, this.I_0o, this.I_o_, this.I_oO + this.IOo1, this.IOI1 == 1 ? 0 : 1, 2);
            } else {
                var_I1l0_IIII.II(iO1l, this.I_0o, this.I_o_, this.I_oO + this.IOo1, this.IOI1 == 1 ? 0 : 1, 2);
            }
            iO1l.IIl0(0, -II.II10);
        }
    }

    private static /* synthetic */ String Il10(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

