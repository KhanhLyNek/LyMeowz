package main;

/*
 * Decompiled with CFR 0.152.
 */
public class Il_0 {
    public static void III1(int n, int n2) {
        try {
            Ilol ilol = Ilol.Ilol_II();
            ilol.var_I_ll_II = null;
            ilol.I_o_ = n;
            ilol.I_oO = n2;
            I_0_.II().IoO();
            if (!Il_0.II_()) {
                ilol.I_o_ = n;
                ilol.I_oO = n2 + 1;
                I_0_.II().IoO();
                ilol.I_o_ = n;
                ilol.I_oO = n2;
                I_0_.II().IoO();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void III(I1_O i1_O) {
        Il_0.III1(i1_O.IIlo(), i1_O.II1());
    }

    public static void II1o(int n) {
        Il_0.III1(n, Il_0.IIIl(n));
    }

    public static int IIIl(int n) {
        int n2 = 50;
        for (int i = 0; i < 30; ++i) {
            if (!IOlO.boolean_IIIl(n, n2 += 24, 2)) continue;
            if (n2 % 24 == 0) break;
            n2 -= n2 % 24;
            break;
        }
        return n2;
    }

    public static void III_(int n, int n2) {
        Ilol.Ilol_II().var_I_ll_II = new I_ll(n, n2);
    }

    public static void I_o() {
        Ilol ilol = Ilol.Ilol_II();
        if (ilol.var_I_ll_II != null) {
            ilol.var_I_ll_II = null;
            ilol.var_I1Il_III = null;
        }
    }

    public static boolean II1O() {
        return Ilol.Ilol_II().var_I_ll_II != null;
    }

    public static boolean II_() {
        return I1ol.II1_(4387);
    }

    public static void I_oI() {
        if (!I1ol.II1_(4387) && !Il_0.II_()) {
            I101[] i101Array = Ilol.Ilol_II().var_I101_arr_II;
            for (int i = 0; i < i101Array.length; ++i) {
                I101 i101 = i101Array[i];
                if (i101 == null || i101.var_I1o_II.II__ != 521) continue;
                I_0_.II().II((byte)0, (byte)1, (byte)i, (short)-1);
                return;
            }
        }
    }

    public static boolean II_I() {
        I101[] i101Array = Ilol.Ilol_II().var_I101_arr_II;
        for (int i = 0; i < i101Array.length; ++i) {
            I101 i101 = i101Array[i];
            if (i101 == null || i101.var_I1o_II.II__ != 521) continue;
            return true;
        }
        return false;
    }
}

