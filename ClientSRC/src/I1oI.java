/*
 * Decompiled with CFR 0.152.
 */
public final class I1oI {
    public static I_l_ III_ = new I_l_(I1oI.Il11("\ub490\ub56c\ub552\ub53b\ub555\ub5e0\ub5d6\ub5bf\ub581\ub67c\ub64e\ub63a\ub608", 46329));

    public static void II(I1o i1o) {
        III_.put(new Short(i1o.II__), i1o);
    }

    public static I1o II(short s) {
        return (I1o)III_.get(new Short(s));
    }

    private static /* synthetic */ String Il11(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

