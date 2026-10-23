package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I_0I
extends I1l1 {
    private I1lO IIIO;
    private int I_O0;
    private int I_Oo;
    private int I_0;
    private short IIO1 = 0;
    private long I1II = 0L;

    public static void II(int n, int n2, int n3, int n4) {
        I_0I i_0I = new I_0I();
        new I_0I().IIIO = I1_I.var_I1lO_arr_II[n - 1];
        i_0I.I_Oo = n2;
        i_0I.I_0 = n3;
        i_0I.IIO1 = (short)2;
        I1l1.II11.addElement(i_0I);
    }

    @Override
    public void III_(IO1l iO1l) {
        if (IO1l.l_I0 == 1) {
            ++I1_I.IoOO;
        }
        if (I1_I.IoOO < 8) {
            int n = this.I_Oo + this.IIIO.II[this.I_O0].II0I;
            int n2 = this.I_0 + this.IIIO.II[this.I_O0].I_O0;
            I_oo.IIII(iO1l, this.IIIO.II[this.I_O0].I_Oo, n, n2, 0, 3);
        }
    }

    @Override
    public void IIlO() {
        ++this.I_O0;
        if (this.I_O0 >= this.IIIO.II.length) {
            this.IIO1 = (short)(this.IIO1 - 1);
            if (this.IIO1 <= 0) {
                I1l1.II11.removeElement(this);
                return;
            }
            this.I_O0 = 0;
        }
    }
}

