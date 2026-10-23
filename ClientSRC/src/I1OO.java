/*
 * Decompiled with CFR 0.152.
 */
public final class I1OO {
    public static boolean I_1o;
    private static String II0o;
    private static String IIo;
    private static int IIO;
    public static boolean I1l1;

    public static void II(String string, String string2, int n) {
        if (string != null) {
            I_1o = true;
            II0o = string;
            IIo = string2;
            IIO = n;
        }
    }

    public static void IIl1() {
        I1OO.II(IO11.I1O1, null, 1000);
        I1l1 = true;
    }

    public static void II(IO1l iO1l) {
        if (I_1o && (!I1l1 || IIO <= 4990)) {
            I_10.II(II.IIll - 75, 10, 150, 55, iO1l);
            if (I1l1) {
                II.II(II.IIll - IO1I.II1l.IIII(II0o) / 2 - 10, 38, iO1l);
                IO1I.II1l.II(iO1l, II0o, II.IIll + 5, 31, 2);
            } else if (IIo != null) {
                IO1I.II1l.II(iO1l, II0o, II.IIll, 23, 2);
                IO1I.IIl1.II(iO1l, IIo, II.IIll, 40, 2);
            } else {
                IO1I.II1l.II(iO1l, II0o, II.IIll, 31, 2);
            }
        }
    }

    public static void IOlI() {
        if (IIO > 0 && --IIO == 0) {
            I1OO.I__o();
        }
    }

    public static void I__o() {
        II0o = "";
        IIo = null;
        I1l1 = false;
        IIO = 0;
        I_1o = false;
    }
}

