package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I_l1
extends I1l {
    private String[] IIlo;
    public boolean I_1o;
    private int IIOI;
    private int IIOl = 35;
    private long Ilo_ = -1L;

    public I_l1() {
        if (II.var_int_IIl <= 176) {
            this.IIOl = 10;
        }
        if (II.var_int_IIl > 320) {
            this.IIOl = 80;
        }
    }

    public void IOlI() {
        this.II(IO11.I1O1, null, null, null);
        II.var_I1l_II = this;
        this.Ilo_ = IO10.IIII() + 5000L;
    }

    public void III() {
        II.var_I1l_II = this;
        this.Ilo_ = -1L;
    }

    public void II10(String string) {
        this.IIlo = IO1I.II1l.II(string, II.var_int_IIl - ((this.IIOl << 1) + 20));
        this.IIOI = 80;
        if (this.IIlo.length >= 5) {
            this.IIOI = this.IIlo.length * IO1I.II1l.IIOl() + 20;
        }
    }

    public void II(String string, I1Il i1Il, I1Il i1Il2, I1Il i1Il3) {
        this.IIlo = IO1I.II1l.II(string, II.var_int_IIl - ((this.IIOl << 1) + 20));
        this.IIIo = i1Il;
        this.III0 = i1Il2;
        this.IIl = i1Il3;
        this.IIOI = 80;
        if (this.IIlo.length >= 5) {
            this.IIOI = this.IIlo.length * IO1I.II1l.IIOl() + 20;
        }
        if (II.var_boolean_IIIl) {
            if (i1Il != null) {
                this.IIIo.I1 = II.var_int_IIl / 2 - 68 - 5;
                this.IIIo.I1I = II.var_int_IIlI - 50;
            }
            if (i1Il3 != null) {
                this.IIl.I1 = II.var_int_IIl / 2 + 5;
                this.IIl.I1I = II.var_int_IIlI - 50;
            }
            if (i1Il2 != null) {
                this.III0.I1 = II.var_int_IIl / 2 - 35;
                this.III0.I1I = II.var_int_IIlI - 50;
            }
        }
        this.I_1o = false;
        this.Ilo_ = -1L;
    }

    @Override
    public void II(IO1l iO1l) {
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
        if (!I1o_.IO0_) {
            int n = II.var_int_IIlI - this.IIOI - 38;
            int n2 = II.var_int_IIl - (this.IIOl << 1);
            I_10.II(this.IIOl, n, n2, this.IIOI, iO1l);
            n = n + (this.IIOI - this.IIlo.length * IO1I.II1l.IIOl()) / 2 - 2;
            if (this.I_1o) {
                II.II(II.var_int_IIll, (n += 8) - 12, iO1l);
            }
            n2 = 0;
            while (n2 < this.IIlo.length) {
                IO1I.III_.II(iO1l, this.IIlo[n2], II.var_int_IIll, n, 2);
                ++n2;
                n += IO1I.II1l.IIOl();
            }
            super.II(iO1l);
        }
    }

    @Override
    public void IIl1() {
        super.IIl1();
        if (this.Ilo_ != -1L && IO10.IIII() > this.Ilo_) {
            II.III_();
        }
    }
}

