package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I_o_ {
    public static I_l_ IIIO = new I_l_(I_o_.Ilo1("\ud2e8\ud28e\ud2b7\ud352\ud376\ud315", 53950));

    public static void IIII(I_0o i_0o) {
        IIIO.put(new Short(i_0o.II0I), i_0o);
    }

    public static I_0o II(short s) {
        return (I_0o)IIIO.get(new Short(s));
    }

    private static /* synthetic */ String Ilo1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

