/*
 * Decompiled with CFR 0.152.
 */
public class Il_I {
    private static Il_I II;
    private static final long Il = 30L;
    private static final int I11O = 3;
    private static final int I110 = 24;
    private Il_l.II IIlo = null;
    private int I11o = 0;
    private long IlI = 0L;

    private Il_I() {
    }

    public static Il_I II() {
        if (II == null) {
            II = new Il_I();
        }
        return II;
    }

    public static Il_I III() {
        return Il_I.II();
    }

    public void II(Il10.IIII iIII, Il10.IIII iIII2) {
        this.IIlo = Il10.II(iIII, iIII2);
        if (this.IIlo != null) {
            this.I11o = 0;
            this.IlI = IO10.IIII();
        }
    }

    public void IIlO() {
        if (this.IIlo == null) {
            return;
        }
        if (IO10.IIII() - this.IlI < 30L) {
            return;
        }
        if (this.I11o >= this.IIlo.IIlO()) {
            this.II0();
            return;
        }
        int n = this.I11o + 3;
        if (n > this.IIlo.IIlO() - 1) {
            n = this.IIlo.IIlO() - 1;
        }
        Il10.IIII iIII = (Il10.IIII)this.IIlo.II(n);
        this.IIIl(iIII.I1, iIII.I1I);
        this.I11o += 3;
        this.IlI = IO10.IIII();
    }

    private void IIIl(int n, int n2) {
        try {
            int n3 = n * 24;
            int n4 = n2 * 24 + 24;
            Ilol ilol = Ilol.II();
            if (ilol != null) {
                ilol.II = null;
                ilol.I_o_ = n3;
                ilol.I_oO = n4;
                I_0_ i_0_ = I_0_.II();
                if (i_0_ != null) {
                    i_0_.IoO();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void II0() {
        this.IIlo = null;
        this.I11o = 0;
        this.IlI = 0L;
    }

    public boolean II1O() {
        return this.IIlo != null && this.I11o < this.IIlo.IIlO();
    }
}

