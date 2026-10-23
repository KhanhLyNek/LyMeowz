package main;

/*
 * Decompiled with CFR 0.152.
 */
public class Il_ {
    private static Il_ II;
    private static final int I11 = 24;
    private static final int I11I = 5;
    private Il_l.II IIl0 = null;
    private int I11l = 0;
    private int I111 = 0;
    private int I11_ = 0;

    private Il_() {
    }

    public static Il_ II() {
        if (II == null) {
            II = new Il_();
        }
        return II;
    }

    public static Il_ III() {
        return Il_.II();
    }

    public void II(Il10.IIII iIII, Il10.IIII iIII2) {
        Il_l.II iI = Il10.II(iIII, iIII2);
        if (iI != null && iI.IIlO() > 0) {
            this.IIl0 = this.II(iI);
            this.I11l = 0;
            this.I111 = iIII2.I1 * IOlO.IlI0 + 24;
            this.I11_ = iIII2.I1I * IOlO.IlI0 + 24;
        } else {
            this.II0();
        }
    }

    public void IIlO() {
        if (this.IIl0 == null || Ilol.Ilol_II() == null) {
            return;
        }
        if (this.I11l >= this.IIl0.IIlO()) {
            this.II0();
            return;
        }
        byte by = IOlO.IlI0;
        int n = Ilol.Ilol_II().I_o_;
        int n2 = Ilol.Ilol_II().I_oO;
        Il10.IIII iIII = (Il10.IIII)this.IIl0.II(this.I11l);
        int n3 = iIII.I1 * by + 24;
        int n4 = iIII.I1I * by + 24;
        Ilol.Ilol_II().var_I_ll_II = new I_ll(n3, n4);
        int n5 = Il_O.II(n, n2, n3, n4);
        if (n5 <= by) {
            ++this.I11l;
        }
    }

    private Il_l.II II(Il_l.II iI) {
        if (iI == null || iI.IIlO() <= 2) {
            return iI;
        }
        Il_l.II iI2 = new Il_l.II();
        iI2.void_III(iI.II(0));
        for (int i = 1; i < iI.IIlO() - 1; ++i) {
            Il10.IIII iIII = (Il10.IIII)iI2.II(iI2.IIlO() - 1);
            Il10.IIII iIII2 = (Il10.IIII)iI.II(i);
            Il10.IIII iIII3 = (Il10.IIII)iI.II(i + 1);
            int n = Math.abs(iIII2.I1 - iIII.I1) + Math.abs(iIII2.I1I - iIII.I1I);
            if (this.II(iIII, iIII2, iIII3) && n <= 5) continue;
            iI2.void_III(iIII2);
        }
        iI2.void_III(iI.II(iI.IIlO() - 1));
        return iI2;
    }

    private boolean II(Il10.IIII iIII, Il10.IIII iIII2, Il10.IIII iIII3) {
        int n = (iIII2.I1 - iIII.I1) * (iIII3.I1I - iIII.I1I) - (iIII2.I1I - iIII.I1I) * (iIII3.I1 - iIII.I1);
        return n == 0;
    }

    public void II0() {
        this.IIl0 = null;
        this.I11l = 0;
        this.I111 = 0;
        this.I11_ = 0;
    }

    public boolean II1O() {
        return this.IIl0 != null && this.I11l < this.IIl0.IIlO();
    }
}

