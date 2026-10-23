/*
 * Decompiled with CFR 0.152.
 */
public final class PSTPatch {
    private PSTPatch() {
    }

    public static int boss(int n, int n2, int n3, int n4) {
        int n5 = n > 0 ? n : Math.max(0, n2);
        return PSTPatch.scaled(n5, n4);
    }

    public static int monster(IOoI.III iII, int n, int n2) {
        long l = 0L;
        if (iII != null) {
            l = iII._l_O;
            if (l <= 0L) {
                long l2 = iII.II == null ? 5L : (long)iII.II.l0o;
                l = (long)iII._l__ * l2 / 100L;
            }
            if (iII.IooO) {
                l = Math.min(Integer.MAX_VALUE, l * 2L);
            }
        }
        int n3 = l > 0L ? (int)Math.min(Integer.MAX_VALUE, l) : Math.max(0, n);
        return PSTPatch.scaled(n3, n2);
    }

    public static int scaled(int n, int n2) {
        if (n <= 0 || n2 <= 0) {
            return 0;
        }
        return (int)Math.min(Integer.MAX_VALUE, (long)n * (long)n2 / 100L);
    }
}

