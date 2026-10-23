/*
 * Decompiled with CFR 0.152.
 */
public final class I1_l {
    public static int II0I;
    public static int I_O0;
    public static int I_Oo;
    public static int I_0;
    public static boolean I_OI;
    public static boolean III1;
    public static boolean III_;
    public static boolean IOOO;
    public static boolean I1_l;
    public static boolean I1l;
    public static int IoII;
    public static boolean I1ll;
    public static boolean I__I;

    public static boolean III1(int n, int n2) {
        return Ilol.II().II != null && Ilol.II().II.II01 == n && Ilol.II().II.l10l == 0;
    }

    public static void I0_0() {
        if (II.II.I_10) {
            I1_l = false;
        }
        if (I1_I.II() != null) {
            II0I = I1_I.II().I_o_;
            I_O0 = I1_I.II().I_oO;
            IoII = 0;
            I1l = true;
            I_Oo = II.IIIl ? 1 : 0;
        }
    }

    public static void IIO(int n) {
        if (!II.II.I_10 && I__O.IlI.size() - 1 >= n) {
            I__O i__O = (I__O)I__O.IlI.elementAt(n);
            II0I = i__O.I_o_ + i__O.l111 / 2;
            I_O0 = i__O.I_oO + 30;
            I1_l = !i__O.I1lI && i__O.I0_I;
            I_Oo = 0;
            I1l = true;
            IoII = 0;
            if (!II.IIIl) {
                I1_l = false;
            }
        }
    }

    public static void I0_o() {
        int n;
        I_Oo = 1;
        if (II.II.I_10) {
            I1_l = false;
        }
        boolean bl = false;
        for (n = 0; n < I1_I.IIO.size(); ++n) {
            if (!((I_I_)I1_I.IIO.elementAt((int)n)).III1) continue;
            bl = true;
            break;
        }
        for (n = 0; n < I1_I.IIO.size(); ++n) {
            I_I_ i_I_ = (I_I_)I1_I.IIO.elementAt(n);
            if (i_I_.III1) {
                II0I = i_I_.I1;
                I_O0 = i_I_.I1I + 5;
                I1l = true;
                if (i_I_.status != 0) break;
                i_I_.III1 = false;
                return;
            }
            if (bl) continue;
            if (i_I_.status != 0) {
                i_I_.III1 = true;
                return;
            }
            i_I_.III1 = false;
        }
    }

    public static boolean III() {
        if (II.II.I_10) {
            I1_l = false;
        }
        for (int i = 0; i < I1_I.II_0.size(); ++i) {
            I10_ i10_ = (I10_)I1_I.II_0.elementAt(i);
            if (i10_.IoIO != Ilol.II().IOI_ || i10_.II.II__ != 73) continue;
            I_Oo = 1;
            II0I = i10_.I1;
            I_O0 = i10_.I1I + 5;
            I1l = true;
            return true;
        }
        return false;
    }
}

