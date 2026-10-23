package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IIo1 {
    public static IIo1 II;
    public int Il00 = 70;
    public static boolean Il_l;
    public int Il0o = 10;

    public static IIo1 II() {
        if (II == null) {
            II = new IIo1();
        }
        return II;
    }

    public static IIo1 III() {
        return IIo1.II();
    }

    public void I_I1() {
        if (II.II(160, 0, 30, 20) && II.var_boolean_III0 && II.var_boolean_IIIo) {
            Il_l = !Il_l;
            this.I_IO();
            II.IIlI();
        }
    }

    public void III0(IO1l iO1l) {
        if (Il_l) {
            IO1I.II.II(iO1l, IIo1.II1l("\u694b\u6977\u6913", 26888), 165, 3, 0, IO1I.III_);
        } else {
            IO1I.III.II(iO1l, IIo1.II1l("\u694b\u6977\u6913", 26888), 165, 3, 0, IO1I.III_);
        }
        if (Il_l) {
            IO1I.var_IO1I_II1I.II(iO1l, IIo1.II1l("\u6818\u69c4\u6966\u6907\u7729\u69d7\u69e2\u6982\u6a68\u74f6\u6a5d\u6a7d\u6a12\u6b98\u6ad4\u6abe\u6ad8\u6b63\u6b44\u6b30\u6b1b\u6bb3\u6bd5\u6bb0\u6b9d\u6c6a\u6c02\u6c6d\u6c0b\u6ce2\u7209\u6ca4\u6cc8\u6d44\u6d76\u6d10", 26888), this.Il0o, 80, 0, IO1I.IIlI);
            IO1I.var_IO1I_II1I.II(iO1l, IIo1.II1l("\u77ad\u6949\u6966\u6909\u7723\u69cd\u69e2\u698f\u74ed\u6a7e\u6a1e\u6b4c\u74bf\u6abb\u6ace\u7476\u6a8c", 26888), this.Il0o, 90, 0, IO1I.IIlI);
        }
    }

    public static void I_I_() {
        try {
            Il_l = IlIO.III(IIo1.II1l("\u694b\u6957\u6933\u692c\u69f7\u69f0\u69b2\u6984\u6a65\u6a7b", 26888), false);
        }
        catch (Exception exception) {
            System.err.println(IIo1.II1l("\u6953\u6964\u6936\u6910\u69d9\u6983\u698e\u698e\u6a61\u6a7b\u6a1e\u6a38\u6a0e\u6ae9\u6ad5\u6aab\u6ac2\u6b37", 26888) + exception.getMessage());
        }
    }

    private void I_IO() {
        IlIO.II(IIo1.II1l("\u694b\u6957\u6933\u692c\u69f7\u69f0\u69b2\u6984\u6a65\u6a7b", 26888), Il_l);
    }

    static {
        Il_l = false;
    }

    private static /* synthetic */ String II1l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

