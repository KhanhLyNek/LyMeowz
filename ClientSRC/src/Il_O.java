/*
 * Decompiled with CFR 0.152.
 */
public class Il_O {
    public static int II(int n, int n2, int n3, int n4) {
        int n5 = n3 - n;
        int n6 = n4 - n2;
        return (int)Math.sqrt(n5 * n5 + n6 * n6);
    }

    public static int II(I1_O i1_O, I1_O i1_O2) {
        return I_Ol.II(i1_O.IIlo(), i1_O.II1(), i1_O2.IIlo(), i1_O2.II1());
    }

    public static int IIIl(int n, int n2, int n3, int n4) {
        return Il_O.IIII(n3 - n) + Il_O.IIII(n4 - n2);
    }

    public static int II(int n, int n2, int n3) {
        if (n < n2) {
            return n2;
        }
        return n > n3 ? n3 : n;
    }

    public static float II(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static double II(double d, double d2, double d3) {
        d3 = Math.max(0.0, Math.min(1.0, d3));
        return d + (d2 - d) * d3;
    }

    public static boolean III(int n, int n2, int n3) {
        return n >= n2 && n <= n3;
    }

    public static int III(int n, int n2) {
        return n < n2 ? n : n2;
    }

    public static int IIII(int n, int n2) {
        return n > n2 ? n : n2;
    }

    public static int IIII(int n) {
        return n < 0 ? -n : n;
    }
}

