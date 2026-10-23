package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I1II
extends IO1_
implements I1_1 {
    public static I1II var_I1II_II;
    public IOI0[] var_IOI0_arr_II;
    private int I_Oo;
    private int I_0;
    private int IIO;
    private int IIOI;
    private String[] IIlI;
    private String IIo_;
    private Ilo_ var_Ilo__II;
    private int IIO_;
    private int IoII;

    public static I1II II() {
        if (var_I1II_II == null) {
            var_I1II_II = new I1II();
        }
        return var_I1II_II;
    }

    @Override
    public void I0l_() {
        if (IO10.l_lI == 5 && this.var_IOI0_arr_II.length == 1 || IO10.l_lI == 3 && this.var_IOI0_arr_II.length == 1) {
            this.var_Ilo__II = new Ilo_();
            this.var_Ilo__II.II00 = this.IIo_;
            this.var_Ilo__II.var_IOI0_II.II1o = this.var_IOI0_arr_II[0].IIoI;
            this.var_Ilo__II.II0O = "";
            this.var_Ilo__II.I_10 = true;
            this.var_Ilo__II.var_IOI0_II.Ill(0);
            if (II.var_boolean_IIIl) {
                return;
            }
        } else {
            this.IIO_ = 0;
            super.I0l_();
        }
    }

    public void III(int n, String string) {
        this.IoII = n;
        I1II i1II = this;
        this.IIo_ = string;
        this.IIO = II.var_int_IIl - 20;
        if (this.IIO > 320) {
            this.IIO = 320;
        }
        I_Ol.II__(I1II.IIo0("\uac20\uac1a\uace6\uacdd\uacb5\uacd2\uad2e", 44116) + string);
        this.IIlI = IO1I.III_.II(string, this.IIO - 20);
        this.I_Oo = (II.var_int_IIl - this.IIO) / 2;
        this.var_IOI0_arr_II = new IOI0[this.IoII];
        this.IIOI = this.var_IOI0_arr_II.length * 35 + (this.IIlI.length - 1) * 20 + 40;
        this.I_0 = II.var_int_IIlI - this.IIOI - 40 - (this.IIlI.length - 1) * 20;
        for (int i = 0; i < i1II.var_IOI0_arr_II.length; ++i) {
            i1II.var_IOI0_arr_II[i] = new IOI0();
            i1II.var_IOI0_arr_II[i].II1o = "";
            i1II.var_IOI0_arr_II[i].II0I = i1II.I_Oo + 10;
            i1II.var_IOI0_arr_II[i].I_O0 = i1II.I_0 + 35 + (i1II.IIlI.length - 1) * 20 + i * 35;
            i1II.var_IOI0_arr_II[i].l10 = i1II.IIO - 20;
            i1II.var_IOI0_arr_II[i].l10I = IO1_.ll11 + 2;
            i1II.var_IOI0_arr_II[0].Il_0 = !II.var_boolean_IIIl;
            if (II.var_boolean_IIIl) continue;
            i1II.IIl = i1II.var_IOI0_arr_II[0].IIII;
        }
        i1II.IIIo = new I1Il(IO11.I_I, i1II, 1, null);
        i1II.III0 = new I1Il(IO11.I_lI, i1II, 2, null);
        if (II.var_boolean_IIIl) {
            i1II.III0.I1 = II.var_int_IIl / 2 + 18;
            i1II.IIIo.I1 = II.var_int_IIl / 2 - 85;
            i1II.III0.I1I = i1II.IIIo.I1I = i1II.I_0 + i1II.IIOI + 5;
        }
        this.I0l_();
    }

    @Override
    public void III_(IO1l iO1l) {
        int n;
        I1_I.I1_I_II().III_(iO1l);
        I__O.II(iO1l, this.I_Oo, this.I_0, this.IIO, this.IIOI, -1, true);
        for (n = 0; n < this.IIlI.length; ++n) {
            IO1I.IIIO.II(iO1l, this.IIlI[n], II.var_int_IIl / 2, this.I_0 + 15 + n * 20, 2);
        }
        for (n = 0; n < this.var_IOI0_arr_II.length; ++n) {
            this.var_IOI0_arr_II[n].III_(iO1l);
        }
        super.III_(iO1l);
    }

    @Override
    public void void_IIlO() {
        I1_I.I1_I_II().void_IIlO();
        for (int i = 0; i < this.var_IOI0_arr_II.length; ++i) {
            this.var_IOI0_arr_II[i].IIlO();
        }
    }

    @Override
    public void IIO1(int n) {
        for (int i = 0; i < this.var_IOI0_arr_II.length; ++i) {
            if (!this.var_IOI0_arr_II[i].Il_0) continue;
            this.var_IOI0_arr_II[i].II1o(n);
            break;
        }
        super.IIO1(n);
    }

    @Override
    public void I_Il() {
        if (II.var_boolean_arr_II[2]) {
            --this.IIO_;
            if (this.IIO_ < 0) {
                this.IIO_ = this.var_IOI0_arr_II.length - 1;
            }
        } else if (II.var_boolean_arr_II[8]) {
            ++this.IIO_;
            if (this.IIO_ > this.var_IOI0_arr_II.length - 1) {
                this.IIO_ = 0;
            }
        }
        if (II.var_boolean_arr_II[2] || II.var_boolean_arr_II[8]) {
            II.IIIl();
            for (int i = 0; i < this.var_IOI0_arr_II.length; ++i) {
                if (this.IIO_ == i) {
                    this.var_IOI0_arr_II[i].Il_0 = true;
                    if (!II.var_boolean_IIIl) {
                        this.IIl = this.var_IOI0_arr_II[i].IIII;
                    }
                } else {
                    this.var_IOI0_arr_II[i].Il_0 = false;
                }
                if (!II.var_boolean_IIIo || !II.II(this.var_IOI0_arr_II[i].II0I, this.var_IOI0_arr_II[i].I_O0, this.var_IOI0_arr_II[i].l10, this.var_IOI0_arr_II[i].l10I)) continue;
                this.IIO_ = i;
                break;
            }
        }
        super.I_Il();
        II.IIIl();
    }

    @Override
    public void II(int n, Object object) {
        if (n == 1) {
            I1_I.var_I1_I_II.I0l_();
            var_I1II_II = null;
        }
        if (n == 2) {
            if (IO10.l_lI == 5 && this.var_IOI0_arr_II.length == 1 || IO10.l_lI == 3 && this.var_IOI0_arr_II.length == 1) {
                if (this.var_Ilo__II.var_IOI0_II.java_lang_String_IIl1() != null && !this.var_Ilo__II.var_IOI0_II.java_lang_String_IIl1().equals("")) {
                    this.var_IOI0_arr_II[0].IIOl(this.var_Ilo__II.var_IOI0_II.java_lang_String_IIl1());
                    I_0_.II().II(this.var_IOI0_arr_II);
                    I1_I.var_I1_I_II.I0l_();
                    return;
                }
                II.II(IO11.lII_);
                return;
            }
            n = 0;
            while (true) {
                if (n >= this.var_IOI0_arr_II.length) {
                    I_0_.II().II(this.var_IOI0_arr_II);
                    I1_I.var_I1_I_II.I0l_();
                    break;
                }
                if (this.var_IOI0_arr_II[n].java_lang_String_IIl1() == null || this.var_IOI0_arr_II[n].java_lang_String_IIl1().equals("")) {
                    II.II(IO11.lII_);
                    return;
                }
                ++n;
            }
        }
    }

    private static /* synthetic */ String IIo0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

