/*
 * Decompiled with CFR 0.152.
 */
public final class IO {
    public static boolean I_1o = false;
    private static IO II;
    public static float IIIl;
    public static int I_Oo;
    public static int I_0;
    public static int IIO;
    public static int IIOI;
    public static int IIOl;
    public static int IIlI;
    public static int IIO1;
    public static int IIO_;
    public static int IoII;

    public static IO II() {
        if (II == null) {
            II = new IO();
        }
        return II;
    }

    public void IOlI() {
        if (Ilol.I_lo) {
            I_O1.IIIl(IO.IloO("\u5317\u53ee\u53ec\u53ba\u5393\u5477\u544c\u5416\u5403\u54e7\u54d5", 21374), 0);
            Ilol.I_lo = false;
        } else {
            I_O1.IIIl(IO.IloO("\u5317\u53ee\u53ec\u53ba\u5393\u5477\u544c\u5416\u5403\u54e7\u54d5", 21374), 1);
            Ilol.I_lo = true;
        }
        IO.IOlO();
    }

    public void III() {
        if (!II.IIIl) {
            if (I1_I.IOO_ = !I1_I.IOO_) {
                I_O1.IIIl(IO.IloO("\u530d\u53f8\u53ce\u53ad\u539f\u546b\u545b\u543f\u5417\u54e1", 21374), 0);
            } else {
                I_O1.IIIl(IO.IloO("\u530d\u53f8\u53ce\u53ad\u539f\u546b\u545b\u543f\u5417\u54e1", 21374), 1);
            }
            IO.IOlO();
        } else {
            if (I1_I.IoO0 == 0) {
                I1_I.IoO0 = 1;
                I_O1.IIIl(IO.IloO("\u531f\u53f3\u53dd\u53b7\u5395\u547e", 21374), I1_I.IoO0);
                I1_I.I010();
            } else {
                I1_I.IoO0 = 0;
                I_O1.IIIl(IO.IloO("\u531f\u53f3\u53dd\u53b7\u5395\u547e", 21374), I1_I.IoO0);
                I1_I.I010();
            }
            IO.IOlO();
        }
    }

    public void IIII() {
        if (II.II) {
            I_O1.IIIl(IO.IloO("\u5312\u53f2\u53cb\u539c\u5388\u5478\u5448\u543f\u541f\u54f6", 21374), 0);
            II.II(IO11.IO1, 8885, null);
        } else {
            I_O1.IIIl(IO.IloO("\u5312\u53f2\u53cb\u539c\u5388\u5478\u5448\u543f\u541f\u54f6", 21374), 1);
            II.II(IO11.IO1, 8885, null);
        }
        IO.IOlO();
    }

    public void IO11() {
        if (Ilol.I_1) {
            I_O1.IIIl(IO.IloO("\u5317\u53ee\u53ec\u53ba\u5393\u5477\u544c\u5416\u5403\u54e7\u54d5\u54e1", 21374), 0);
            Ilol.I_1 = false;
        } else {
            I_O1.IIIl(IO.IloO("\u5317\u53ee\u53ec\u53ba\u5393\u5477\u544c\u5416\u5403\u54e7\u54d5\u54e1", 21374), 1);
            Ilol.I_1 = true;
        }
        IO.IOlO();
    }

    public static void IOl_() {
        I1o_ i1o_ = II.II;
        if (I1o_.IOo && Ilol.II().II != null && Ilol.II().II.II01 >= 2) {
            I_1o.II1O = new String[]{IO11.Il0l, IO11.I_O1, IO11.I_Ol, IO11.I_OI, IO11.I10, IO11.I_O, IO11.I1_I, IO11.I_O_, IO11.I1I0, IO11.IloO};
            if (Ilol.II().I101) {
                I_1o.II1O = new String[]{IO11.Il0l, IO11.I_O1, IO11.I_Ol, IO11.Ilol, IO11.I_OI, IO11.I10, IO11.I_O, IO11.I1_I, IO11.I_O_, IO11.I1I0, IO11.IloO};
            }
        } else {
            I_1o.II1O = new String[]{IO11.Il0l, IO11.I_O1, IO11.I_Ol, IO11.I_OI, IO11.I10, IO11.I_O, IO11.I1_I, IO11.I_O_, IO11.I1I0};
            if (Ilol.II().I101) {
                I_1o.II1O = new String[]{IO11.Il0l, IO11.I_O1, IO11.I_Ol, IO11.Ilol, IO11.I_OI, IO11.I10, IO11.I_O, IO11.I1_I, IO11.I_O_, IO11.I1I0};
            }
        }
        if (I_1o) {
            String[] stringArray = new String[I_1o.II1O.length + 1];
            for (int i = 0; i < I_1o.II1O.length; ++i) {
                stringArray[i] = I_1o.II1O[i];
            }
            stringArray[I_1o.II1O.length] = IO11.IlOO;
            I_1o.II1O = stringArray;
        }
    }

    public static void IOlO() {
        String string;
        String string2 = IO.IloO("\u5325\u53e5\u53e1\u53fb\u53da\u5439", 21374);
        String string3 = IO.IloO("\u5325\u53bd\u539c\u5386\u53da\u5439\u5418", 21374);
        String string4 = string = I1_I.IoO0 == 0 ? string3 + IO11.II0_ : string2 + IO11.Ilo_;
        if (!II.IIIl) {
            string = !I1_I.IOO_ ? string3 + IO11.I_Oo : string2 + IO11.I_Oo;
        }
        I_1o.II10 = new String[]{Ilol.I_lo ? string3 + IO11.I_01 : string2 + IO11.I_01, Ilol.I_1 ? string3 + IO11.I_0_ : string2 + IO11.I_0_, II.II1I ? string2 + IO11.Io__ : string3 + IO11.Io__, II.II ? string2 + IO11.IlIO : string3 + IO11.IlIO, string};
    }

    public static void IO_() {
        I_0O.II().close();
        II.II.I__o();
        II.II.III_();
        II.II.I0l_();
    }

    static {
        IIIl = 0.5f;
        I_Oo = 30;
        I_0 = 31;
        IIO = 32;
        IIOI = 33;
        IIOl = 34;
        IIlI = 35;
        IIO1 = 36;
        IIO_ = 37;
        IoII = 38;
    }

    private static /* synthetic */ String IloO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

