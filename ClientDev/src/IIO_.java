package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IIO_
extends IIII {
    private static IIO_ var_IIO__II;
    private IlI0 var_IlI0_II = new IlI0();
    public boolean IlIO = false;
    public boolean IlI0 = false;
    private int II0o;
    private int Il_0;
    private int Il_o;
    private int IIo_;
    private int IIoO;
    private int IlO;
    private int IIoI;
    private boolean IlIo;
    private boolean Ill;
    private static final int IlOI = 10;
    private static final String IIlo = "521,1523,1524";

    public static IIO_ IIO__II() {
        if (var_IIO__II == null) {
            var_IIO__II = new IIO_();
        }
        return var_IIO__II;
    }

    public static IIO_ III() {
        return IIO_.IIO__II();
    }

    private IIO_() {
    }

    @Override
    protected void II1l() {
        this.II0();
        this.var_IlI0_II.II(new IIOO(this, 750L));
        this.void_IIlo();
    }

    @Override
    protected void II11() {
        this.var_IlI0_II.I_1O();
    }

    @Override
    protected void II1_() {
        this.var_IlI0_II.IIlO();
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    private void IIO_() {
        boolean bl;
        boolean bl2 = this.IlI0 && this.IIl1() && !this.boolean_IIl_();
        boolean bl3 = bl = this.IlIO && this.IIlI();
        if (bl2 || bl) {
            this.Il_0 = IOlO.l1oI;
            this.Il_o = IOlO.l1ol;
            this.IIo_ = Ilol.Ilol_II().I_o_;
            this.IIoO = Ilol.Ilol_II().I_oO;
            this.Il0l();
            this.II0o = bl2 ? 1 : 3;
        }
    }

    private void IlO0() {
        Ilol ilol = Ilol.Ilol_II();
        if (ilol != null) {
            int n = ilol.IOIO + 21;
            if (IOlO.l1oI != n) {
                if (!IlO_.II_O()) {
                    IlO_.II_l(n);
                }
            } else {
                this.II0o = 2;
            }
        }
    }

    private void IlOo() {
        int n;
        int n2 = this.III1();
        if (this.III(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, n2, n = 336) > 15) {
            Il_0.III1(n2, n);
        } else if (II.var_I_1o_II != null && II.var_I_1o_II.I_10) {
            if (this.boolean_IIl_()) {
                this.II0o = this.IlIO ? 3 : 5;
            } else {
                for (int i = Ilol.Ilol_II().var_I101_arr_II.length - 1; i >= 0; --i) {
                    I101 i101 = Ilol.Ilol_II().var_I101_arr_II[i];
                    if (i101 == null || !this.II(i101)) continue;
                    I_0_.II().III((byte)1, (byte)i);
                    return;
                }
                this.II0o = this.IlIO ? 3 : 5;
            }
        } else {
            I_0_.II().IIoI(3);
        }
    }

    private void Il0() {
        Ilol ilol = Ilol.Ilol_II();
        if (ilol != null) {
            int n = ilol.IOIO + 24;
            if (IOlO.l1oI != n) {
                if (!IlO_.II_O()) {
                    IlO_.II_l(n);
                }
            } else {
                this.II0o = 4;
            }
        }
    }

    private void Il0I() {
        int n;
        I_1o i_1o = II.var_I_1o_II;
        int n2 = this.III_();
        if (this.III(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, n2, n = 336) > 15) {
            Il_0.III1(n2, n);
        } else if (i_1o != null && i_1o.I_10) {
            if (II.var_I1l_II != null) {
                if (this.IlO >= 0) {
                    I_0_.II().II((byte)1, (byte)1, (short)this.IlO);
                }
                II.III_();
            } else {
                int n3;
                int n4 = n3 = this.IlO >= 0 ? this.IlO : Ilol.Ilol_II().var_I101_arr_II.length - 1;
                while (n3 >= 0) {
                    I101 i101 = Ilol.Ilol_II().var_I101_arr_II[n3];
                    if (i101 != null && !this.III(i101)) {
                        I_0_.II().II((byte)0, (byte)1, (short)n3);
                        this.IIoI = n3 == this.IlO ? ++this.IIoI : 0;
                        this.IlO = this.IIoI >= 5 ? n3 - 1 : n3;
                        return;
                    }
                    --n3;
                }
                if (II.var_I_1o_II != null) {
                    II.var_I_1o_II.I__o();
                }
                this.IlO = -1;
                this.IIoI = 0;
                this.II0o = 5;
            }
        } else {
            I_0_.II().IIoI(16);
            I_0_.II().II((short)16, (byte)0);
        }
    }

    private void IIOo() {
        if (IOlO.l1oI != this.Il_0) {
            if (!IlO_.II_O()) {
                IlO_.II_l(this.Il_0);
            }
        } else if (IOlO.l1ol != this.Il_o) {
            I_0_.II().II0O(this.Il_o);
        } else if (this.III(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, this.IIo_, this.IIoO) > 12) {
            Il_0.III1(this.IIo_, this.IIoO);
        } else {
            this.Il01();
            this.II0();
        }
    }

    private void II0() {
        this.II0o = 0;
        this.IlO = -1;
        this.IIoI = 0;
        this.Il_0 = -1;
        this.Il_o = 0;
        this.IIo_ = 0;
        this.IIoO = 0;
    }

    private boolean IIl1() {
        if (Ilol.Ilol_II().var_I101_arr_II == null) {
            return false;
        }
        for (int i = 0; i < Ilol.Ilol_II().var_I101_arr_II.length; ++i) {
            I101 i101 = Ilol.Ilol_II().var_I101_arr_II[i];
            if (i101 == null || !this.II(i101)) continue;
            return true;
        }
        return false;
    }

    private boolean IIlI() {
        if (Ilol.Ilol_II().var_I101_arr_II == null) {
            return false;
        }
        int n = 0;
        for (int i = 0; i < Ilol.Ilol_II().var_I101_arr_II.length; ++i) {
            if (Ilol.Ilol_II().var_I101_arr_II[i] != null) continue;
            ++n;
        }
        return n == 0;
    }

    private boolean boolean_IIl_() {
        try {
            if (Ilol.Ilol_II().var_I101_arr_III == null) {
                return false;
            }
            if (II.var_I_1o_II == null) {
                return false;
            }
            return II.var_I_1o_II.ll_o >= Ilol.Ilol_II().var_I101_arr_III.length;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private boolean II(I101 i101) {
        if (i101 != null && i101.var_I1o_II != null) {
            if (i101.var_I1o_II.II0l > 4) {
                return false;
            }
            if (i101.var_I1o_II.II0_ > 10) {
                return true;
            }
            String string = i101.var_I1o_II.II1o.toLowerCase();
            if (Il_o.boolean_II(string, IIO_.IIl_("\uac65\uac58\ub2e8\uac00", 44049)) || Il_o.boolean_II(string, IIO_.IIl_("\uac79\ub2d7\uac36\uac4e\uace9\uacc5\ub20c\uac9e", 44049)) || Il_o.boolean_II(string, IIO_.IIl_("\uac65\uac58\uac26\uac84\uace3\uac8c\uacb8\ub203", 44049))) {
                return true;
            }
            if (i101.var_I100_arr_III != null) {
                for (int i = 0; i < i101.var_I100_arr_III.length; ++i) {
                    if (i101.var_I100_arr_III[i] == null) continue;
                    int n = i101.var_I100_arr_III[i].II.I1l;
                    String string2 = i101.var_I100_arr_III[i].II.II1o;
                    if (n >= 127 && n <= 135 || n >= 34 && n <= 36 || n == 107) {
                        return true;
                    }
                    if (string2 == null || !string2.startsWith(IIO_.IIl_("\uac35", 44049))) continue;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean III(I101 i101) {
        if (i101 != null && i101.var_I1o_II != null) {
            if (this.II(i101)) {
                return true;
            }
            if (this.IIIO(i101.var_I1o_II.II__)) {
                return true;
            }
            byte by = i101.var_I1o_II.II0l;
            return by == 23 || by == 24 || by == 11 || by == 5 || by == 14 || by == 12 || by == 29 || by == 32 || by == 27 || by == 6;
        }
        return true;
    }

    private boolean IIIO(int n) {
        try {
            String[] stringArray = Il_o.java_lang_String_arr_II(IIO_.IIl_("\uac24\uac02\uac7e\uac42\uacbc\uac99\uacf9\uacd9\uad25\uad19\uad72\uad54\uadb1", 44049), ',');
            for (int i = 0; i < stringArray.length; ++i) {
                if (Integer.parseInt(stringArray[i].trim()) != n) continue;
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    private void Il0l() {
        try {
            this.IlIo = II0l.II0l_III().boolean_IIIl();
            if (this.IlIo) {
                II0l.II0l_III().void_II1();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            this.Ill = IIo_.III().boolean_IIIl();
            if (this.Ill) {
                IIo_.III().void_II1();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void Il01() {
        try {
            if (this.IlIo) {
                II0l.II0l_III().void_IIlo();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (this.Ill) {
                IIo_.III().void_IIlo();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.IlIo = false;
        this.Ill = false;
    }

    private int III1() {
        if (Ilol.Ilol_II().IOIO == 0) {
            return 85;
        }
        return Ilol.Ilol_II().IOIO == 2 ? 94 : 638;
    }

    private int III_() {
        if (IOlO.l1oI == 24) {
            return 389;
        }
        return IOlO.l1oI == 25 ? 508 : 511;
    }

    private int III(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n - n3;
        if (n6 < 0) {
            n6 = -n6;
        }
        if ((n5 = n2 - n4) < 0) {
            n5 = -n5;
        }
        return (int)Math.sqrt(n6 * n6 + n5 * n5);
    }

    public boolean IIIO() {
        return this.II0o > 0;
    }

    static /* synthetic */ int int_II(IIO_ iIO_) {
        return iIO_.II0o;
    }

    static /* synthetic */ void void_II(IIO_ iIO_) {
        iIO_.IIO_();
    }

    static /* synthetic */ void III(IIO_ iIO_) {
        iIO_.IlO0();
    }

    static /* synthetic */ void IIII(IIO_ iIO_) {
        iIO_.IlOo();
    }

    static /* synthetic */ void IIIl(IIO_ iIO_) {
        iIO_.Il0();
    }

    static /* synthetic */ void III1(IIO_ iIO_) {
        iIO_.Il0I();
    }

    static /* synthetic */ void III_(IIO_ iIO_) {
        iIO_.IIOo();
    }

    private static /* synthetic */ String IIl_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

