package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I_0
extends I1l1 {
    private I1lO IIIO;
    private int I_O0;
    private int I_Oo;
    private int I_0;
    private Ilol II11;
    private I_I_ IIl;
    private short II1O = 0;
    private long Ilo_ = 0L;
    private int IIO1;

    public static void III(int n, int n2, int n3, int n4) {
        I_0 i_0 = new I_0();
        new I_0().IIIO = I1_I.var_I1lO_arr_II[n - 1];
        i_0.I_Oo = n2;
        i_0.I_0 = n3;
        i_0.II1O = (short)n4;
        I1l1.II1_.addElement(i_0);
    }

    public static void II(int n, int n2, int n3, int n4, int n5) {
        I_0 i_0 = new I_0();
        new I_0().IIIO = I1_I.var_I1lO_arr_II[n - 1];
        i_0.I_Oo = n2;
        i_0.I_0 = n3;
        i_0.II1O = 1;
        i_0.IIO1 = n5;
        I1l1.II1_.addElement(i_0);
    }

    public static void II(int n, I_I_ i_I_, int n2) {
        I_0 i_0 = new I_0();
        new I_0().IIIO = I1_I.var_I1lO_arr_II[n - 1];
        i_0.IIl = i_I_;
        i_0.II1O = 1;
        I1l1.II1_.addElement(i_0);
    }

    public static void II(int n, Ilol ilol, int n2) {
        I_0 i_0 = new I_0();
        new I_0().IIIO = I1_I.var_I1lO_arr_II[n - 1];
        i_0.II11 = ilol;
        i_0.II1O = (short)n2;
        I1l1.II1_.addElement(i_0);
    }

    @Override
    public void III_(IO1l iO1l) {
        if (IO1l.l_I0 == 1) {
            ++I1_I.IoOO;
        }
        if (I1_I.IoOO < 11) {
            int n;
            int n2;
            if (this.II11 != null) {
                this.I_Oo = this.II11.I_o_;
                this.I_0 = this.II11.I_oO + II.II10;
            }
            if (this.IIl != null) {
                this.I_Oo = this.IIl.I1;
                this.I_0 = this.IIl.I1I + II.II10;
            }
            if (II.boolean_II(n2 = this.I_Oo + this.IIIO.II[this.I_O0].II0I, n = this.I_0 + this.IIIO.II[this.I_O0].I_O0)) {
                I_oo.IIII(iO1l, this.IIIO.II[this.I_O0].I_Oo, n2, n, this.IIO1, 3);
            }
        }
    }

    @Override
    public void IIlO() {
        ++this.I_O0;
        if (this.I_O0 >= this.IIIO.II.length) {
            this.II1O = (short)(this.II1O - 1);
            if (this.II1O <= 0) {
                I1l1.II1_.removeElement(this);
            } else {
                this.I_O0 = 0;
            }
        }
        if (II.var_int_IIIO % 11 == 0 && this.II11 != null && this.II11 != Ilol.Ilol_II() && !I1_I.var_I_lO_II_O.contains(this.II11)) {
            I1l1.II1_.removeElement(this);
        }
    }
}

