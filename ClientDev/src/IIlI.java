package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IIlI
extends IIII {
    private static IIlI var_IIlI_II;
    private IlI0 var_IlI0_II = new IlI0();
    public boolean IIOI = false;
    private int II0o;
    private int IIo;
    private int IIoI;
    private int IIol;
    private int II0O;
    private int IIo1;
    private int IIo_;
    private int IIoO;
    private boolean IIOl;
    private boolean IIO1;
    private static final short var_short_II = 4387;
    private static final int IIo0 = 5;
    private static final int IIoo = 39;
    private static final int Il = 0;
    private static final int IlI = 6;
    private static final int IlII = 30;

    private IIlI() {
    }

    public static IIlI IIlI_II() {
        if (var_IIlI_II == null) {
            var_IIlI_II = new IIlI();
        }
        return var_IIlI_II;
    }

    public static IIlI IIlI_III() {
        return IIlI.IIlI_II();
    }

    @Override
    protected void II1l() {
        this.II0();
        this.var_IlI0_II.II(new IIll(this, 700L));
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
        int n = this.int_II();
        if (n > 0) {
            this.II0O = IOlO.l1oI;
            this.IIo1 = IOlO.l1ol;
            this.IIo_ = Ilol.Ilol_II().I_o_;
            this.IIoO = Ilol.Ilol_II().I_oO;
            this.II0I();
            this.IIo = n;
            this.IIoI = 0;
            this.II0o = 1;
        }
    }

    private void IIOO() {
        if (IOlO.l1oI != 5) {
            if (!IlO_.II_O()) {
                IlO_.II_l(5);
            }
        } else {
            this.II0o = 2;
        }
    }

    private void IIO0() {
        if (this.IIo <= 0) {
            this.II0o = 3;
            return;
        }
        if (!this.III(this.IIo)) {
            this.II0o = 3;
            return;
        }
        if (II.var_int_IIIO - this.IIol < 30) {
            return;
        }
        I_1o i_1o = II.var_I_1o_II;
        if (i_1o == null || !i_1o.I_10) {
            I_0_.II().IIoI(39);
            I_0_.II().II((short)39, (byte)0);
        }
        I_0_.II().II((byte)1, this.IIo, 1);
        this.IIol = II.var_int_IIIO;
        ++this.IIoI;
        if (this.IIoI >= 6) {
            this.II0o = 3;
        }
    }

    private void IIOo() {
        if (IOlO.l1oI != this.II0O) {
            if (!IlO_.II_O()) {
                IlO_.II_l(this.II0O);
            }
            return;
        }
        if (IOlO.l1ol != this.IIo1) {
            I_0_.II().II0O(this.IIo1);
            return;
        }
        if (this.II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, this.IIo_, this.IIoO) > 12) {
            Il_0.III1(this.IIo_, this.IIoO);
            return;
        }
        this.II0l();
        this.II0();
    }

    private void II0() {
        this.II0o = 0;
        this.IIo = -1;
        this.IIoI = 0;
        this.IIol = -99999;
        this.II0O = -1;
        this.IIo1 = 0;
        this.IIo_ = 0;
        this.IIoO = 0;
    }

    private void II0I() {
        try {
            this.IIOl = II0l.II0l_III().boolean_IIIl();
            if (this.IIOl) {
                II0l.II0l_III().void_II1();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            this.IIO1 = IIo_.III().boolean_IIIl();
            if (this.IIO1) {
                IIo_.III().void_II1();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void II0l() {
        try {
            if (this.IIOl) {
                II0l.II0l_III().void_IIlo();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (this.IIO1) {
                IIo_.III().void_IIlo();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.IIOl = false;
        this.IIO1 = false;
    }

    private int int_II() {
        if (!this.IIOI) {
            return -1;
        }
        Ilol ilol = Ilol.Ilol_II();
        if (ilol == null) {
            return -1;
        }
        if (this.int_III() > 0) {
            return -1;
        }
        if (I1ol.II1_(4387)) {
            return -1;
        }
        boolean bl = this.II(521);
        if (!bl) {
            return 521;
        }
        int n = ilol.II10();
        if (n >= 22) {
            return 1524;
        }
        if (n >= 9) {
            return 1523;
        }
        if (n >= 1) {
            return 521;
        }
        return -1;
    }

    private boolean II(int n) {
        try {
            I101[] i101Array = Ilol.Ilol_II().var_I101_arr_II;
            if (i101Array == null) {
                return false;
            }
            for (int i = 0; i < i101Array.length; ++i) {
                I101 i101 = i101Array[i];
                if (i101 == null || i101.var_I1o_II == null || i101.var_I1o_II.II__ != n) continue;
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    private boolean III(int n) {
        if (n != 521 && n != 1523 && n != 1524) {
            return false;
        }
        return this.int_III() <= 0 && !I1ol.II1_(4387);
    }

    private int int_III() {
        try {
            I101[] i101Array = Ilol.Ilol_II().var_I101_arr_II;
            if (i101Array == null) {
                return 0;
            }
            for (int i = 0; i < i101Array.length; ++i) {
                I101 i101 = i101Array[i];
                if (i101 == null || i101.var_I1o_II == null || i101.var_I1o_II.II__ != 521) continue;
                if (i101.var_I100_arr_III != null && i101.var_I100_arr_III.length > 0 && i101.var_I100_arr_III[0] != null) {
                    return i101.var_I100_arr_III[0].lIoI;
                }
                return 0;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return 0;
    }

    private int II(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n - n3;
        if (n6 < 0) {
            n6 = -n6;
        }
        if ((n5 = n2 - n4) < 0) {
            n5 = -n5;
        }
        return n6 == 0 && n5 == 0 ? 0 : (int)Math.sqrt(n6 * n6 + n5 * n5);
    }

    public boolean IIIO() {
        return this.II0o > 0;
    }

    static /* synthetic */ int int_II(IIlI iIlI) {
        return iIlI.II0o;
    }

    static /* synthetic */ void void_II(IIlI iIlI) {
        iIlI.IIO_();
    }

    static /* synthetic */ void III(IIlI iIlI) {
        iIlI.IIOO();
    }

    static /* synthetic */ void IIII(IIlI iIlI) {
        iIlI.IIO0();
    }

    static /* synthetic */ void IIIl(IIlI iIlI) {
        iIlI.IIOo();
    }
}

