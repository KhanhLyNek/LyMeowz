package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class LyForgeFast {
    private static boolean fast;

    private LyForgeFast() {
    }

    public static boolean enabled() {
        return fast;
    }

    public static String[] withToggle(String[] stringArray) {
        if (stringArray == null) {
            return new String[]{fast ? "\u00c9p nhanh: B\u1eacT" : "\u00c9p nhanh: T\u1eaeT"};
        }
        String[] stringArray2 = new String[stringArray.length + 1];
        System.arraycopy(stringArray, 0, stringArray2, 0, stringArray.length);
        stringArray2[stringArray.length] = fast ? "\u00c9p nhanh: B\u1eacT" : "\u00c9p nhanh: T\u1eaeT";
        return stringArray2;
    }

    public static boolean click(int n, int n2) {
        if (n == 5100 && n2 == 3) {
            fast = !fast;
            return true;
        }
        return false;
    }

    public static String status() {
        return fast ? "\u00c9p nhanh \u0111\u00e3 B\u1eacT. M\u1edf l\u1ea1i menu \u0111\u1ec3 xem tr\u1ea1ng th\u00e1i." : "\u00c9p nhanh \u0111\u00e3 T\u1eaeT. M\u1edf l\u1ea1i menu \u0111\u1ec3 xem tr\u1ea1ng th\u00e1i.";
    }
}

