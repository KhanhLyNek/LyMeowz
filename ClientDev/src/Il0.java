package main;

/*
 * Decompiled with CFR 0.152.
 */
public class Il0 {
    public static String III(int n) {
        String string;
        switch (n) {
            case 129: {
                string = IOlO.II11[n] + Il0.II0l("\u9697\u96e4\u96c6\u971e\u9768", 38583) + n + Il0.II0l("\u96ea", 38583);
                break;
            }
            case 113: {
                string = Il0.II0l("\u96e4\u96bf\u961f\u9761\u9713\u973a\u89d0\u97fe\u97c8\u97c4\u97b6", 38583) + n + Il0.II0l("\u96ea", 38583);
                break;
            }
            default: {
                string = IOlO.II11[n] + Il0.II0l("\u96bd\u968d", 38583) + n + Il0.II0l("\u96ea", 38583);
            }
        }
        return string;
    }

    public static void IOI_() {
        IlO0.IOI_();
    }

    public static void IOIO() {
        IlO0.IOIO();
    }

    public static void IOI0() {
        IlO0.IOI0();
    }

    private static /* synthetic */ String II0l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

