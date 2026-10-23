/*
 * Decompiled with CFR 0.152.
 */
public class Il10 {
    private static int IIII(int n, int n2, int n3, int n4) {
        int n5 = Math.abs(n - n3);
        int n6 = Math.abs(n2 - n4);
        int n7 = 10;
        int n8 = 14;
        int n9 = Math.min(n5, n6);
        return n7 * (n5 + n6) + (n8 - 2 * n7) * n9;
    }

    public static Il_l.II II(IIII iIII, IIII iIII2) {
        if (!Il10.III(iIII.I1, iIII.I1I) && (iIII = Il10.II(iIII.I1, iIII.I1I)) == null) {
            return null;
        }
        if (!Il10.III(iIII2.I1, iIII2.I1I) && (iIII2 = Il10.II(iIII2.I1, iIII2.I1I)) == null) {
            return null;
        }
        IIIl iIIl = new IIIl(new III(null));
        Il_l.III1 iII1 = new Il_l.III1();
        Il_l.III1 iII12 = new Il_l.III1();
        IIII iIII3 = new IIII(iIII.I1, iIII.I1I);
        iIII3.I1l0 = 0;
        iIII3.I1lo = Il10.IIII(iIII.I1, iIII.I1I, iIII2.I1, iIII2.I1I);
        iIIl.III(iIII3);
        iII12.II(new Integer(iIII3.hashCode()), iIII3);
        int[] nArray = new int[]{0, 1, 0, -1, 1, 1, -1, -1};
        int[] nArray2 = new int[]{-1, 0, 1, 0, -1, 1, -1, 1};
        int[] nArray3 = new int[]{10, 10, 10, 10, 14, 14, 14, 14};
        while (!iIIl.II1_()) {
            IIII iIII4 = (IIII)iIIl.II();
            iII12.III(new Integer(iIII4.hashCode()));
            if (iIII4.I1 == iIII2.I1 && iIII4.I1I == iIII2.I1I) {
                return Il10.II(iIII4);
            }
            iII1.II(new Integer(iIII4.hashCode()), iIII4);
            for (int i = 0; i < 8; ++i) {
                Object object;
                Integer n;
                int n2 = iIII4.I1 + nArray[i];
                int n3 = iIII4.I1I + nArray2[i];
                if (n2 < 0 || n3 < 0 || n2 >= IOlO.l10_ || n3 >= IOlO.l10O || !Il10.III(n2, n3) || i >= 4 && (!Il10.III(iIII4.I1 + nArray[i], iIII4.I1I) || !Il10.III(iIII4.I1, iIII4.I1I + nArray2[i])) || iII1.IIII(n = new Integer(n2 * 10000 + n3))) continue;
                int n4 = iIII4.I1l0 + nArray3[i];
                IIII iIII5 = (IIII)iII12.II(n);
                if (iIII5 == null) {
                    object = new IIII(n2, n3);
                    ((IIII)object).I1l0 = n4;
                    ((IIII)object).I1lo = Il10.IIII(n2, n3, iIII2.I1, iIII2.I1I);
                    ((IIII)object).II = iIII4;
                    iIIl.III(object);
                    iII12.II(n, object);
                    continue;
                }
                if (n4 >= iIII5.I1l0) continue;
                iIII5.I1l0 = n4;
                iIII5.II = iIII4;
                iIIl.I_1O();
                object = iII12.IIIl();
                for (int j = 0; j < ((Il_l.II)object).IIlO(); ++j) {
                    iIIl.III(((Il_l.II)object).II(j));
                }
            }
        }
        return null;
    }

    private static Il_l.II II(IIII iIII) {
        Il_l.II iI = new Il_l.II();
        IIII iIII2 = iIII;
        while (iIII2 != null) {
            iI.III(0, new IIII(iIII2.I1, iIII2.I1I));
            iIII2 = iIII2.II;
        }
        return iI;
    }

    private static boolean III(int n, int n2) {
        int n3;
        if (n < 0 || n2 < 0 || n >= IOlO.l10_ || n2 >= IOlO.l10O) {
            return false;
        }
        int n4 = IOlO.IIIo(n, n2);
        if (n4 != 0) {
            return false;
        }
        if (n2 > 0 && (n3 = IOlO.IIIo(n, n2 - 1)) != 0) {
            return false;
        }
        int[] nArray = new int[]{-1, 1, 0, 0};
        int[] nArray2 = new int[]{0, 0, -1, 1};
        int[] nArray3 = new int[]{4, 8, 64, 8192, 8200, 8196, 8204};
        for (int i = 0; i < 4; ++i) {
            int n5 = n + nArray[i];
            int n6 = n2 + nArray2[i];
            if (n5 < 0 || n6 < 0 || n5 >= IOlO.l10_ || n6 >= IOlO.l10O) continue;
            int n7 = IOlO.IIIo(n5, n6);
            for (int j = 0; j < nArray3.length; ++j) {
                if (n7 != nArray3[j]) continue;
                return false;
            }
        }
        return true;
    }

    private static IIII II(int n, int n2) {
        for (int i = 1; i <= 5; ++i) {
            for (int j = -i; j <= i; ++j) {
                for (int k = -i; k <= i; ++k) {
                    int n3;
                    int n4;
                    if (Math.abs(j) != i && Math.abs(k) != i || !Il10.III(n4 = n + j, n3 = n2 + k)) continue;
                    return new IIII(n4, n3);
                }
            }
        }
        return null;
    }

    public static class IIII {
        public int I1;
        public int I1I;
        public int I1l0;
        public int I1lo;
        public IIII II;

        public IIII(int n, int n2) {
            this.I1 = n;
            this.I1I = n2;
            this.I1l0 = 0;
            this.I1lo = 0;
            this.II = null;
        }

        public IIII(int n, int n2, int n3, int n4, IIII iIII) {
            this.I1 = n;
            this.I1I = n2;
            this.I1l0 = n3;
            this.I1lo = n4;
            this.II = iIII;
        }

        public int IIl_() {
            return this.I1l0 + this.I1lo;
        }

        public boolean equals(Object object) {
            if (!(object instanceof IIII)) {
                return false;
            }
            IIII iIII = (IIII)object;
            return this.I1 == iIII.I1 && this.I1I == iIII.I1I;
        }

        public int hashCode() {
            return this.I1 * 10000 + this.I1I;
        }
    }

    static class IIIl {
        private Il_l.II IIl = new Il_l.II();
        private II II;

        IIIl(II iI) {
            this.II = iI;
        }

        void III(Object object) {
            this.IIl.III(object);
        }

        Object II() {
            if (this.IIl.II1_()) {
                return null;
            }
            int n = 0;
            for (int i = 1; i < this.IIl.IIlO(); ++i) {
                if (this.II.II(this.IIl.II(i), this.IIl.II(n)) >= 0) continue;
                n = i;
            }
            return this.IIl.III(n);
        }

        boolean II1_() {
            return this.IIl.II1_();
        }

        void I_1O() {
            this.IIl.I_1O();
        }
    }

    static class III
    implements II {
        private III() {
        }

        @Override
        public int II(Object object, Object object2) {
            int n;
            IIII iIII = (IIII)object;
            IIII iIII2 = (IIII)object2;
            int n2 = iIII.IIl_();
            if (n2 < (n = iIII2.IIl_())) {
                return -1;
            }
            if (n2 > n) {
                return 1;
            }
            if (iIII.I1lo < iIII2.I1lo) {
                return -1;
            }
            if (iIII.I1lo > iIII2.I1lo) {
                return 1;
            }
            return 0;
        }

        /* synthetic */ III(Il1o il1o) {
            this();
        }
    }

    static interface II {
        public int II(Object var1, Object var2);
    }
}

