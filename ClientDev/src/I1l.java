package main;

/*
 * Decompiled with CFR 0.152.
 */
public abstract class I1l {
    public I1Il IIIo;
    public I1Il III0;
    public I1Il IIl;

    public void II(IO1l iO1l) {
        iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
        I_10.II(iO1l, this.IIIo, this.III0, this.IIl);
    }

    public void IIO(int n) {
        switch (n) {
            case -39: 
            case -2: {
                II.var_boolean_arr_IIII[8] = true;
                II.var_boolean_arr_II[8] = true;
                return;
            }
            case -38: 
            case -1: {
                II.var_boolean_arr_IIII[2] = true;
                II.var_boolean_arr_II[2] = true;
                return;
            }
            case -27: {
                return;
            }
            case -22: 
            case -7: {
                II.var_boolean_arr_IIII[13] = true;
                II.var_boolean_arr_II[13] = true;
                return;
            }
            case -21: 
            case -6: {
                II.var_boolean_arr_IIII[12] = true;
                II.var_boolean_arr_II[12] = true;
                return;
            }
            case -5: 
            case 10: {
                II.var_boolean_arr_IIII[5] = true;
                II.var_boolean_arr_II[5] = true;
                return;
            }
        }
    }

    public void IIl1() {
        if (this.III0 != null && (II.var_boolean_arr_II[5] || IO1_.II(this.III0))) {
            II.var_boolean_arr_II[5] = false;
            II.var_boolean_III0 = false;
            IO1_.l_l = -1;
            II.var_boolean_IIIo = false;
            if (this.III0 != null) {
                this.III0.I0lO();
            }
            IO1_.l_l = -1;
        }
        if (this.IIIo != null && (II.var_boolean_arr_II[12] || IO1_.II(this.IIIo))) {
            II.var_boolean_arr_II[12] = false;
            II.var_boolean_III0 = false;
            IO1_.l_l = -1;
            II.var_boolean_IIIo = false;
            if (this.IIIo != null) {
                this.IIIo.I0lO();
            }
            IO1_.l_l = -1;
        }
        if (this.IIl != null && (II.var_boolean_arr_II[13] || IO1_.II(this.IIl))) {
            II.var_boolean_arr_II[13] = false;
            II.var_boolean_III0 = false;
            II.var_boolean_IIIo = false;
            IO1_.l_l = -1;
            if (this.IIl != null) {
                this.IIl.I0lO();
            }
            IO1_.l_l = -1;
        }
        II.IIIl();
        II.III1();
    }
}

