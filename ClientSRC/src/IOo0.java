/*
 * Decompiled with CFR 0.152.
 */
final class IOo0 {
    static final int _1oO = 32;
    static final int _1o0 = 40;
    static final int _1oo = 41;
    static final int __ = 42;
    static final int __I = -1;
    private final IO0 II1_;
    private final IOo_ II11;
    private long IOoo;
    private long I0;
    private long I0I;
    private long I0II;
    private long IO_;
    private int __II;
    private int __Il;

    IOo0(IO0 iO0, IOo_ iOo_) {
        this.II1_ = iO0;
        this.II11 = iOo_;
    }

    private static long IIIl() {
        return System.currentTimeMillis();
    }

    boolean Ilo1() {
        long l = IOo0.IIIl();
        return l < this.IOoo || l < this.I0 || l < this.I0I || l < this.I0II;
    }

    boolean Ilo_() {
        return this.Ilo1() || IOo0.IIIl() < this.IO_;
    }

    private void IIIo(int n, int n2, int n3) {
        this.II11.II(new IO0o(-124).II(n).II(0).II(n2).IIII(this.II1_.II.I1l).IIII(n3));
    }

    private void IIII(int n, long l) {
        this.II11.II(new IO0o(-106).III(n).III((int)(l / 1000L)));
    }

    boolean II1O(int n, int n2) {
        if (this.II1_.II.llIl <= 0) {
            return false;
        }
        if (this.II1_.II.IIo(116) > 0) {
            return false;
        }
        this.IOoo = IOo0.IIIl() + (long)n;
        this.__II = n2;
        this.IIIo(1, 40, n2);
        return true;
    }

    void II0_(int n, int n2) {
        if (this.II1_.II.llIl <= 0) {
            return;
        }
        this.IOoo = IOo0.IIIl() + (long)n;
        this.__II = n2;
        this.IIIo(1, 40, n2);
        this.IIII(3779, n);
    }

    void II0O(int n, int n2) {
        if (this.II1_.II.llIl <= 0) {
            return;
        }
        this.I0 = IOo0.IIIl() + (long)n;
        this.IIIo(1, 41, n2);
        this.IIII(3782, n);
    }

    void II00(int n, int n2) {
        if (this.II1_.II.llIl <= 0) {
            return;
        }
        this.I0I = IOo0.IIIl() + (long)n;
        this.__Il = n2;
        this.IIIo(1, 32, n2);
    }

    void II0o(int n, int n2) {
        if (this.II1_.II.llIl <= 0) {
            return;
        }
        this.I0II = IOo0.IIIl() + (long)n;
        this.IIIo(1, 42, n2);
        this.IIII(4392, n);
        this.II1_.ll__();
    }

    void I11_(int n) {
        if (this.II1_.II.llIl <= 0) {
            return;
        }
        this.IO_ = IOo0.IIIl() + (long)n;
        this.IIII(4133, n);
        this.II1_.ll__();
    }

    int[] III_() {
        long l = IOo0.IIIl();
        if (l < this.I0II) {
            return new int[]{454, 455, 456};
        }
        if (l < this.IO_) {
            return new int[]{412, 413, 414};
        }
        return null;
    }

    void III1(long l) {
        if (this.IOoo != 0L && l >= this.IOoo) {
            this.IOoo = 0L;
            this.IIIo(0, 40, this.__II);
        }
        if (this.I0 != 0L && l >= this.I0) {
            this.I0 = 0L;
            this.IIIo(0, 41, 0);
        }
        if (this.I0I != 0L && l >= this.I0I) {
            this.I0I = 0L;
            this.IIIo(0, 32, this.__Il);
        }
        if (this.I0II != 0L && l >= this.I0II) {
            this.I0II = 0L;
            this.IIIo(0, 42, 0);
            this.II1_.ll__();
        }
        if (this.IO_ != 0L && l >= this.IO_) {
            this.IO_ = 0L;
            this.II1_.ll__();
        }
    }

    void I_1O() {
        boolean bl;
        boolean bl2 = bl = this.I0II != 0L || this.IO_ != 0L;
        if (this.IOoo != 0L) {
            this.IIIo(0, 40, this.__II);
        }
        if (this.I0 != 0L) {
            this.IIIo(0, 41, 0);
        }
        if (this.I0I != 0L) {
            this.IIIo(0, 32, this.__Il);
        }
        if (this.I0II != 0L) {
            this.IIIo(0, 42, 0);
        }
        this.IO_ = 0L;
        this.I0II = 0L;
        this.I0I = 0L;
        this.I0 = 0L;
        this.IOoo = 0L;
        if (bl) {
            this.II1_.ll__();
        }
    }
}

