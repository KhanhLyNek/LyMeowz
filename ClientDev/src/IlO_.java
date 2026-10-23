package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IlO_
extends IIII
implements I1_1 {
    private static IlO_ II;
    public static boolean Ilol;
    public static boolean Ilo1;
    public static boolean Ilo_;
    private static boolean IloO;
    public static int I__O;
    public static long IllI;
    public static boolean Ilo0;
    public static int I__0;
    public static boolean Iloo;
    public static long Illl;
    private static long Ill1;
    private static long Ill_;
    private static long IllO;
    private static boolean I1;
    private static boolean I1I;
    private static boolean I1II;
    private static long Ill0;
    private static int[] II1_;
    private static int[] II1O;
    private static final int I__o = 1000;
    private static final int I_O = 2000;
    private static final int I_OI = 3000;
    private static final int I_Ol = 4000;
    private static final int I_O1 = 5000;
    private static final int I_O_ = 6000;
    private static boolean I1Il;

    public static IlO_ IlO__II() {
        if (II == null) {
            II = new IlO_();
        }
        return II;
    }

    public static IlO_ III() {
        return IlO_.IlO__II();
    }

    @Override
    protected void II1l() {
        IlOO.IOI();
        this.void_IIlo();
    }

    @Override
    protected void II11() {
        IlO_.I_o0();
    }

    @Override
    protected void II1_() {
        if (Ilol.Ilol_II().I_I_) {
            Ill1 = System.currentTimeMillis() + 1000L;
        }
        boolean bl = false;
        if (Ilol && IlOO.IIl1(IOlO.l1oI)) {
            bl = IlO_.II_l();
        }
        if (IOlO.l1oI == I__0) {
            IlO_.I_o0();
            return;
        }
        if (!Ilo0) {
            return;
        }
        if (bl) {
            return;
        }
        if (System.currentTimeMillis() - Ill1 <= 100L) {
            return;
        }
        if (System.currentTimeMillis() - Illl < (long)I__O) {
            return;
        }
        Illl = System.currentTimeMillis();
        boolean bl2 = true;
        if (IlOO.IIl_(I__0)) {
            if (Ilol.Ilol_II().var_IOlI_II.II01 <= 24) {
                IlO_.I_o0();
                return;
            }
            bl2 = IlO_.II_1();
        }
        if (bl2) {
            IlO_.II_(I__0);
        }
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
        IlO_.I_o0();
    }

    private static boolean II_l() {
        for (int i = 0; i < I1_I.var_I_lO_II_0.size(); ++i) {
            I10_ i10_ = (I10_)I1_I.var_I_lO_II_0.elementAt(i);
            if (i10_.IoIO != Ilol.Ilol_II().IOI_ && i10_.IoIO != -1 || i10_.II.II__ != 74) continue;
            Ilol.Ilol_II().var_I10__II = i10_;
            if (System.currentTimeMillis() - Ill1 <= 600L) continue;
            Ill1 = System.currentTimeMillis();
            I_0_.II().IIo1(Ilol.Ilol_II().var_I10__II.lI0l);
            return true;
        }
        return false;
    }

    private static boolean II_1() {
        if (I1_I.II((short)38) == null) {
            switch (IOlO.l1oI) {
                case 27: {
                    IlO_.II_(28);
                    I1Il = false;
                    return false;
                }
                case 28: {
                    if (I1Il) {
                        IlO_.II_(27);
                    } else {
                        IlO_.II_(29);
                    }
                    return false;
                }
                case 29: {
                    I1Il = true;
                    IlO_.II_(28);
                    return false;
                }
            }
        } else {
            I1Il = false;
        }
        return true;
    }

    public static void II_(int n) {
        try {
            if (I__0 == 160 && !I1) {
                if (!I1ol.II1_(992)) {
                    IlO_.I_o0();
                    return;
                }
                I1 = true;
                IllO = System.currentTimeMillis();
                Il_1.IIIl(992);
                return;
            }
            int[] nArray = IlOo.II(n);
            if (nArray == null) {
                IlO_.II_I(n);
                return;
            }
            if (Ilo1 && IlO_.boolean_II(nArray)) {
                return;
            }
            if (IOlO.l1oI != nArray[0] || Ilol.I1Oo || I1I1.I___) {
                return;
            }
            if (!IlO_.II__()) {
                IlO_.I_o0();
                return;
            }
            if (!I1 || System.currentTimeMillis() - IllO >= 500L) {
                if (I1 && IOlO.l1oI == 160) {
                    I1 = false;
                }
                IlO0.II_O(nArray[1]);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean boolean_II(int[] nArray) {
        int n;
        if (!I1I && nArray.length > 4) {
            for (n = 0; n < Ilol.Ilol_II().var_I101_arr_II.length; ++n) {
                I101 i101 = Ilol.Ilol_II().var_I101_arr_II[n];
                if (i101 == null) continue;
                if (IloO && i101.var_I1o_II.II__ == 194) {
                    I1I = true;
                    I1II = false;
                    Ill0 = System.currentTimeMillis();
                    II.var_I_1o_II.II11 = null;
                    I_0_.II().II((byte)0, (byte)1, (byte)-1, i101.var_I1o_II.II__);
                    return true;
                }
                if (!Ilo_ || i101.var_I1o_II.II__ != 193 || i101.I1l1 <= 1) continue;
                I1I = true;
                I1II = false;
                Ill0 = System.currentTimeMillis();
                II.var_I_1o_II.II11 = null;
                I_0_.II().II((byte)0, (byte)1, (byte)-1, i101.var_I1o_II.II__);
                return true;
            }
        }
        if (I1I && !I1II && System.currentTimeMillis() - Ill0 < IllI) {
            return true;
        }
        if (I1I && !I1II && II.var_I_1o_II.II11 == null) {
            I1I = false;
            I1II = true;
            return true;
        }
        if (I1I && !I1II) {
            for (n = nArray.length - 1; n >= 1; --n) {
                for (int i = 0; i < II.var_I_1o_II.II11.length; ++i) {
                    if (II.var_I_1o_II.II11[i].indexOf(IOlO.II11[nArray[n]]) < 0) continue;
                    I1II = true;
                    I_0_.II().IlI1(i);
                    return true;
                }
            }
            I1II = true;
        }
        return false;
    }

    private static boolean II__() {
        if (Ilol.Ilol_II().var_Ilo0_II == null) {
            int n;
            boolean bl = false;
            for (n = 0; n < IlOO.II_o.length; ++n) {
                if (I__0 != IlOO.II_o[n]) continue;
                bl = true;
                break;
            }
            if (!bl) {
                for (n = 0; n < IlOO.II_0.length; ++n) {
                    if (I__0 != IlOO.II_0[n]) continue;
                    bl = true;
                    break;
                }
            }
            if (!bl && I__0 >= 53 && I__0 <= 62) {
                bl = true;
            }
            return !bl;
        }
        return true;
    }

    private static void II_I(int n) {
        long l = System.currentTimeMillis();
        if (l - Ill_ >= 1000L) {
            String string = IlOo.IIIl(n);
            Ill_ = l;
            Iloo = true;
        }
    }

    public static void II_l(int n) {
        Ilo0 = true;
        I__0 = n;
    }

    public static void I_o0() {
        Ilo0 = false;
        I1I = false;
        I1II = false;
        Iloo = false;
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 3000: {
                IlO_.I_oo();
                break;
            }
            case 4000: {
                if (!(object instanceof int[])) break;
                IlO_.void_II((int[])object);
                break;
            }
            case 5000: {
                IlO_.IO();
                break;
            }
            case 6000: {
                IlI.III().I_1l();
                break;
            }
            default: {
                if (n >= 1000 && n < 1100) {
                    IlO_.II_1(n - 1000);
                    break;
                }
                if (n < 2000 || n >= 3000) break;
                IlO_.II__(n - 2000);
            }
        }
    }

    public static void I_oo() {
        try {
            Il1_.II().Il1__III().II(IlO_.IIOo("\u8033\u80e4\u80c4\u80a0\u80ce\u8140\u814d\u813b", 32882)).Il1__II(IlO_.III());
            for (int i = 0; i < IlOO.II1I.IIlO(); ++i) {
                IlOO.II iI = (IlOO.II)IlOO.II1I.II(i);
                Il1_.II().II(iI.II1o, "", 1000 + i, iI.IIO);
            }
            Il1_.II().II(IlO_.IIOo("\u8023\u80e4\u80d1\u80b6\u80ce\u8161\u9f8d\u8122", 32882), "", 6000, null);
            Il1_.II().I__0();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void void_II(int[] nArray) {
        int n;
        if (nArray == null) {
            return;
        }
        II1O = nArray;
        Il1_.II().Il1__III().II(IlO_.IIOo("\u8031\u80f9\u9e7d\u80a1\u80ce\u8140\u814d\u813b", 32882)).Il1__II(IlO_.III());
        Il_l.II iI = new Il_l.II();
        int n2 = 0;
        for (n = 0; n < nArray.length; ++n) {
            int n3 = nArray[n];
            if (Ilol.Ilol_II().IOIO == 0 && (n3 == 22 || n3 == 23) || Ilol.Ilol_II().IOIO == 1 && (n3 == 21 || n3 == 23) || Ilol.Ilol_II().IOIO == 2 && (n3 == 21 || n3 == 22)) continue;
            String string = IOlO.II11 != null && n3 >= 0 && n3 < IOlO.II11.length && IOlO.II11[n3] != null ? IOlO.II11[n3] : IlO_.IIOo("\u803f\u80f0\u80c0\u80ef", 32882) + n3;
            Il1_.II().II(string, "", 2000 + n2, new Integer(n3));
            iI.void_III(new Integer(n3));
            ++n2;
        }
        Il1_.II().II(IlO_.IIOo("\u8023\u80e4\u80d1\u80b6\u80ce\u8161\u9f8d\u8122", 32882), "", 3000, null);
        II1_ = new int[iI.IIlO()];
        for (n = 0; n < iI.IIlO(); ++n) {
            IlO_.II1_[n] = (Integer)iI.II(n);
        }
        Il1_.II().I__0();
    }

    public static void II_1(int n) {
        if (n >= 0 && n < IlOO.II1I.IIlO()) {
            IlOO.II iI = (IlOO.II)IlOO.II1I.II(n);
            if (IlOO.boolean_III(iI.IIO)) {
                IlO_.IO();
                II.var_I_1o_II.I__o();
            } else {
                IlO_.void_II(iI.IIO);
            }
        }
    }

    public static void II__(int n) {
        if (II1_ != null && n >= 0 && n < II1_.length) {
            IlO_.II_l(II1_[n]);
            II.var_I_1o_II.I__o();
        }
    }

    public static void IO() {
        try {
            int n = Ilol.Ilol_II().IOIO;
            int n2 = 21 + n;
            if (IOlO.l1oI != n2) {
                IlO_.II_l(n2);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static boolean II_O() {
        return Ilo0;
    }

    static {
        Ilol = true;
        Ilo1 = true;
        Ilo_ = false;
        IloO = true;
        I__O = 500;
        IllI = 500L;
        Ilo0 = false;
        I__0 = -1;
        Iloo = false;
        Illl = 0L;
        Ill1 = 0L;
        Ill_ = 0L;
        IllO = 0L;
        I1 = false;
        I1I = false;
        I1II = false;
        Ill0 = 0L;
        II1_ = null;
        II1O = null;
        I1Il = false;
    }

    private static /* synthetic */ String IIOo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

