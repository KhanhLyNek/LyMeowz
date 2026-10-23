package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IO1_ {
    public I1Il IIIo;
    public I1Il III0;
    public I1Il IIl;
    public static int ll11;
    public static int l_Io;
    public static int llo_;
    public static int l_l;

    public void I0l_() {
        II.IIIl();
        II.III1();
        II.var_IO1__II = this;
        II.var_II_II.setFullScreenMode(true);
    }

    public void IIO1(int n) {
    }

    public void void_IIlO() {
    }

    public void I_Il() {
        if (II.var_boolean_arr_II[5] || IO1_.II(II.var_IO1__II.III0)) {
            II.var_boolean_arr_II[5] = false;
            l_l = -1;
            II.var_boolean_IIIo = false;
            if (this.III0 != null) {
                this.III0.I0lO();
            }
        }
        if (II.var_boolean_arr_II[12] || IO1_.II(II.var_IO1__II.IIIo)) {
            II.var_boolean_arr_II[12] = false;
            l_l = -1;
            II.var_boolean_IIIo = false;
            if (Ilo_.II().I_10) {
                if (Ilo_.II().III_ != null) {
                    Ilo_.II().III_.I0lO();
                }
            } else if (this.IIIo != null) {
                this.IIIo.I0lO();
            }
        }
        if (II.var_boolean_arr_II[13] || IO1_.II(II.var_IO1__II.IIl)) {
            II.var_boolean_arr_II[13] = false;
            l_l = -1;
            II.var_boolean_IIIo = false;
            if (Ilo_.II().I_10) {
                if (Ilo_.II().IIIO != null) {
                    Ilo_.II().IIIO.I0lO();
                    return;
                }
            } else if (this.IIl != null) {
                this.IIl.I0lO();
            }
        }
    }

    public static boolean II(I1Il i1Il) {
        if (i1Il == null) {
            return false;
        }
        if (i1Il.I1 >= 0 && i1Il.I1I != 0) {
            return i1Il.II0o();
        }
        if (II.var_I1l_II != null) {
            if (II.var_I1l_II.III0 != null && II.II(II.var_int_IIl - l_Io >> 1, II.var_int_IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 1;
                if (i1Il == II.var_I1l_II.III0 && II.var_boolean_III0 && II.var_boolean_IIIo) {
                    return true;
                }
            }
            if (II.var_I1l_II.IIIo != null && II.II(0, II.var_int_IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 0;
                if (i1Il == II.var_I1l_II.IIIo && II.var_boolean_III0 && II.var_boolean_IIIo) {
                    return true;
                }
            }
            if (II.var_I1l_II.IIl != null && II.II(II.var_int_IIl - l_Io, II.var_int_IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 2;
                if ((i1Il == II.var_I1l_II.IIl || i1Il == Ilo_.II().IIIO) && II.var_boolean_III0 && II.var_boolean_IIIo) {
                    return true;
                }
            }
        } else {
            if (i1Il == II.var_IO1__II.IIIo && II.II(0, II.var_int_IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 0;
                if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                    return true;
                }
            }
            if (i1Il == II.var_IO1__II.IIl && II.II(II.var_int_IIl - l_Io, II.var_int_IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 2;
                if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                    return true;
                }
            }
            if ((i1Il == II.var_IO1__II.III0 || Ilo1.var_Ilo1_III != null) && II.II(II.var_int_IIl - l_Io >> 1, II.var_int_IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 1;
                if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                    return true;
                }
            }
        }
        return false;
    }

    public void III_(IO1l iO1l) {
        iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI + 1);
        if (!Ilo_.II().I_10 && II.var_I1l_II == null && !II.var_I_II_II.IOol) {
            I_10.II(iO1l, this.IIIo, this.III0, this.IIl);
        }
    }

    static {
        l_Io = 68;
        llo_ = 26;
        l_l = -1;
    }
}

