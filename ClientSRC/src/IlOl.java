/*
 * Decompiled with CFR 0.152.
 */
public class IlOl {
    public static long IIII() {
        return IO10.IIII();
    }

    public static boolean II(long l, long l2) {
        return IlOl.IIII() - l >= l2;
    }

    public static void IIIl(long l) {
        try {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static String IIII(long l) {
        long l2 = l / 1000L;
        long l3 = l2 / 60L;
        long l4 = l3 / 60L;
        String string = String.valueOf(l4);
        String string2 = String.valueOf(l3 % 60L);
        String string3 = String.valueOf(l2 % 60L);
        if (string2.length() == 1) {
            string2 = IlOl.IIOO("\u3770", 14144) + string2;
        }
        if (string3.length() == 1) {
            string3 = IlOl.IIOO("\u3770", 14144) + string3;
        }
        return string + IlOl.IIOO("\u377a", 14144) + string2 + IlOl.IIOO("\u377a", 14144) + string3;
    }

    private static /* synthetic */ String IIOO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

