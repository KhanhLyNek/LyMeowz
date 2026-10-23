package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class IloO
extends IO1_
implements I1_1 {
    private I1Il[] var_I1Il_arr_II;
    public static I__1[] var_I__1_arr_II;
    private int I_Oo;
    private int[] Ill0 = new int[]{II.var_int_IIl / 2 - 100, II.var_int_IIl / 2 - 100};
    private int IIO = 0;
    private int[] Illo = new int[2];
    private int[] II0O = new int[]{II.var_int_IIl / 2 - 150, II.var_int_IIlI / 2 - 100, 300, 200};
    private int IIlI = -35;
    private int IIO1 = -35;

    @Override
    public void I0l_() {
        I_0l.I0_l = false;
        Ilol.var_boolean_I10I = false;
        I1o_.IO0_ = false;
        I_0l.I1ll = false;
        I1_I.I1_I_II().IIl1();
        super.I0l_();
    }

    @Override
    public void void_IIlO() {
        int n;
        this.I_Oo = II.var_int_IIIO % 10 > 2 ? 1 : 0;
        for (n = 0; n < this.var_I1Il_arr_II.length; ++n) {
            if (!this.var_I1Il_arr_II[n].II0o()) continue;
            this.var_I1Il_arr_II[n].I0lO();
        }
        for (n = 0; n < this.Ill0.length; ++n) {
            if (!II.II(this.Ill0[n] + this.IIO1, this.Illo[n] + this.IIlI, this.II0O[2], 60) || !II.var_boolean_IIIO) continue;
            this.IIO = n;
            break;
        }
        super.void_IIlO();
    }

    @Override
    public void III_(IO1l iO1l) {
        II.III1(iO1l);
        try {
            int n;
            I__O.II(iO1l, this.II0O[0] - 10, this.II0O[1], this.II0O[2] + 20, this.II0O[3], 0xFFFFFF, true);
            if (this.var_I1Il_arr_II != null) {
                for (n = 0; n < this.var_I1Il_arr_II.length; ++n) {
                    this.var_I1Il_arr_II[n].II(iO1l);
                }
            }
            if (var_I__1_arr_II != null) {
                for (n = 0; n < var_I__1_arr_II.length; ++n) {
                    I__O.II(iO1l, this.Ill0[n] - 20, this.Illo[n] + this.IIlI, this.II0O[2], 60, 0xFFFFFF, false);
                    I_O1 i_O1 = I1_I.var_I_O1_arr_II[IloO.var_I__1_arr_II[n].IIII];
                    I_O1 i_O12 = I1_I.var_I_O1_arr_II[IloO.var_I__1_arr_II[n].IIO1];
                    I_O1 i_O13 = I1_I.var_I_O1_arr_II[IloO.var_I__1_arr_II[n].IIOl];
                    I_oo.IIII(iO1l, i_O1.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][0][0]].II1o, this.Ill0[n] + Ilol.var_int_arr_arr_arr_II[this.I_Oo][0][1] + i_O1.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][0][0]].IIO_, this.Illo[n] - Ilol.var_int_arr_arr_arr_II[this.I_Oo][0][2] + i_O1.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][0][0]].II1O, 0, 0);
                    I_oo.IIII(iO1l, i_O12.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][1][0]].II1o, this.Ill0[n] + Ilol.var_int_arr_arr_arr_II[this.I_Oo][1][1] + i_O12.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][1][0]].IIO_, this.Illo[n] - Ilol.var_int_arr_arr_arr_II[this.I_Oo][1][2] + i_O12.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][1][0]].II1O, 0, 0);
                    I_oo.IIII(iO1l, i_O13.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][2][0]].II1o, this.Ill0[n] + Ilol.var_int_arr_arr_arr_II[this.I_Oo][2][1] + i_O13.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][2][0]].IIO_, this.Illo[n] - Ilol.var_int_arr_arr_arr_II[this.I_Oo][2][2] + i_O13.II[Ilol.var_int_arr_arr_arr_II[this.I_Oo][2][0]].II1O, 0, 0);
                    if (this.IIO == n) {
                        IO1I.IIIl.II(iO1l, IloO.var_I__1_arr_II[n].Il, this.Ill0[n] + this.II0O[2] - 25, this.Illo[n] + this.IIlI, 1);
                        IO1I.IIIl.II(iO1l, IO11.IOOl + IloO.IIo1("\u5994", 22964) + I_Ol.III_(IloO.var_I__1_arr_II[n].I1II), this.Ill0[n] + this.II0O[2] - 25, this.Illo[n] + this.IIlI + IO1I.IIIl.IIOl(), 1);
                        continue;
                    }
                    IO1I.III_.II(iO1l, IloO.var_I__1_arr_II[n].Il, this.Ill0[n] + this.II0O[2] - 25, this.Illo[n] + this.IIlI, 1);
                    IO1I.III_.II(iO1l, IO11.IOOl + IloO.IIo1("\u5994", 22964) + I_Ol.III_(IloO.var_I__1_arr_II[n].I1II), this.Ill0[n] + this.II0O[2] - 25, this.Illo[n] + this.IIlI + IO1I.III_.IIOl(), 1);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        super.III_(iO1l);
    }

    public void III(byte n) {
        this.Ill0 = new int[n];
        this.Illo = new int[n];
        for (int i = 0; i < n; ++i) {
            this.Ill0[i] = this.II0O[0] + 20;
            this.Illo[i] = i * 70 + this.II0O[1] + 50;
        }
        this.var_I1Il_arr_II = new I1Il[2];
        this.var_I1Il_arr_II[1] = new I1Il(IloO.IIo1("\u59e2\u5933\u599d\u5a31\u5a57\u5a2e\u5a03\u5ae8", 22964), this, 1, null, this.II0O[0] + this.II0O[2] - 80 - 80, this.II0O[1] + this.II0O[3] - 30);
        this.var_I1Il_arr_II[0] = new I1Il(IloO.IIo1("\u59e0\u59a1\u472f\u5a31\u5a42\u5a2e", 22964), this, 2, null, this.II0O[0] + this.II0O[2] - 80, this.II0O[1] + this.II0O[3] - 30);
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                if (this.IIO == -1) break;
                II.IIIO();
                I_0_.II().IlIl(IloO.var_I__1_arr_II[this.IIO].II0I);
                return;
            }
            case 2: {
                II.II(II.var_I_0l_II);
            }
        }
    }

    private static /* synthetic */ String IIo1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

