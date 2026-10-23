/*
 * Decompiled with CFR 0.152.
 */
public final class IOl_ {
    private static int II0I;
    private static int I_O0;
    private static int I_Oo;
    private static boolean II_;
    private static String Ill1;

    public static void II0() {
        II0I = 0;
        I_O0 = 0;
        II_ = false;
    }

    public static void II(IO1l iO1l, String string, int n, int n2, int n3, int n4, IO1I iO1I) {
        if (I_Oo != iO1I.IIII(string) || !Ill1.equals(string)) {
            Ill1 = string;
            II0I = 0;
            I_Oo = iO1I.IIII(string);
            II_ = false;
            I_O0 = 0;
        }
        iO1l.IIIO(n, n2, n3, n4);
        if (I_Oo > n3) {
            iO1I.II(iO1l, string, n - II0I, n2, 0);
        } else {
            iO1I.II(iO1l, string, n + n3 / 2, n2, 2);
        }
        II.II(iO1l);
        if (I_Oo > n3) {
            if (!II_) {
                if (++I_O0 > 50 && ++II0I >= I_Oo) {
                    I_O0 = 0;
                    II0I = -n3 + 30;
                    II_ = true;
                    return;
                }
            } else {
                if (II0I < 0) {
                    int n5 = n3 + II0I >> 1;
                    II0I += n5;
                }
                if (II0I > 0) {
                    II0I = 0;
                }
                if (II0I == 0 && ++I_O0 == 50) {
                    I_O0 = 0;
                    II_ = false;
                }
            }
        }
    }

    static {
        Ill1 = "";
    }
}

