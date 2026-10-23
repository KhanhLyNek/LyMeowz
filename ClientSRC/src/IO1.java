/*
 * Decompiled with CFR 0.152.
 */
public final class IO1
implements I1_1 {
    public short II0o;
    public short IIo;
    public short IIoI;
    public short IIol;
    public boolean I001;
    public boolean I00_;
    public I__O III;
    public int l10l;
    public int l_I;

    public IO1(short s, short s2, short s3, short s4, boolean bl, boolean bl2, String string) {
        this.II0o = s;
        this.IIo = s2;
        this.IIoI = s3;
        this.IIol = s4;
        string = I_Ol.IIIo(string);
        this.I001 = bl;
        this.I00_ = bl2;
        if (!((IOlO.l1oI == 21 || IOlO.l1oI == 22 || IOlO.l1oI == 23) && this.II0o >= 0 && this.II0o <= 24 || (IOlO.l1oI == 0 && Ilol.II().IOIO != 0 || IOlO.l1oI == 7 && Ilol.II().IOIO != 1 || IOlO.l1oI == 14 && Ilol.II().IOIO != 2) && bl2)) {
            if (!IOlO.Illl() && IOlO.l1oI != 47) {
                if (!bl && !bl2) {
                    this.III = new I__O(string, s, s2 - 24);
                    this.III.II_I = new I1Il((String)null, this, 1, this);
                    this.III.I0_ = true;
                    this.III.I0_I = false;
                    I__O.II(this.III);
                } else {
                    if (IOlO.II()) {
                        this.III = new I__O(string, s, s2 - 16);
                    } else {
                        int n = s + (s3 - s) / 2;
                        this.III = new I__O(string, n, s2 - (s2 != 0 ? 16 : -32));
                    }
                    this.III.II_I = new I1Il((String)null, this, 2, this);
                    this.III.I0_ = true;
                    this.III.I0_I = false;
                    I__O.II(this.III);
                }
                IOlO.IlI_.addElement(this);
            } else if (s2 <= 150 || !IOlO.Illl()) {
                this.III = new I__O(string, s + (s3 - s) / 2, s4 - (s > 100 ? 24 : 48));
                this.III.II_I = new I1Il((String)null, this, 1, this);
                this.III.I0_ = true;
                this.III.I0_I = false;
                I__O.II(this.III);
                IOlO.IlI_.addElement(this);
            }
        }
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                n = (this.II0o + this.IIoI) / 2;
                int n2 = this.IIol;
                if (this.IIol > this.IIo + 24) {
                    n2 = (this.IIo + this.IIol) / 2;
                }
                I1_I.II().Io0_ = 0;
                Ilol.II().II = new I_ll(n, n2);
                Ilol.II().IOI1 = Ilol.II().I_o_ - Ilol.II().II.lI0 > 0 ? -1 : 1;
                I_0_.II().IoO();
                return;
            }
            case 2: {
                I1_I.II().Io0_ = 0;
                if (Ilol.II().III() != null) {
                    I_0_.II().IoO();
                    I1OO.IIl1();
                    I_0_.II().IoO0();
                    Ilol.I1Oo = true;
                    return;
                }
                if (Ilol.II().IIII() != null) {
                    I_0_.II().IoO();
                    I_0_.II().Io_o();
                    Ilol.I10 = true;
                    Ilol.I1Oo = true;
                    II.III1();
                    II.IIIl();
                    I1OO.IIl1();
                    return;
                }
                n = (this.II0o + this.IIoI) / 2;
                short s = this.IIol;
                Ilol.II().II = new I_ll(n, s);
                Ilol.II().IOI1 = Ilol.II().I_o_ - Ilol.II().II.lI0 > 0 ? -1 : 1;
                Ilol.II().III = new I1Il((String)null, this, 2, null);
            }
        }
    }

    public IO1(int n, int n2) {
        this.l_I = n;
        this.l10l = n2;
    }
}

