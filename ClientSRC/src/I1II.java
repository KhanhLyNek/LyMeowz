/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class I1II
extends IO1_
implements I1_1 {
    public static I1II II;
    public IOI0[] II;
    private int I_Oo;
    private int I_0;
    private int IIO;
    private int IIOI;
    private String[] IIlI;
    private String IIo_;
    private Ilo_ II;
    private int IIO_;
    private int IoII;

    public static I1II II() {
        if (II == null) {
            II = new I1II();
        }
        return II;
    }

    @Override
    public void I0l_() {
        if (IO10.l_lI == 5 && this.II.length == 1 || IO10.l_lI == 3 && this.II.length == 1) {
            this.II = new Ilo_();
            this.II.II00 = this.IIo_;
            this.II.II.II1o = this.II[0].IIoI;
            this.II.II0O = "";
            this.II.I_10 = true;
            this.II.II.Ill(0);
            if (II.IIIl) {
                return;
            }
        } else {
            this.IIO_ = 0;
            super.I0l_();
        }
    }

    public void III(int n, String string) {
        this.IoII = n;
        I1II i1II = this;
        this.IIo_ = string;
        this.IIO = II.IIl - 20;
        if (this.IIO > 320) {
            this.IIO = 320;
        }
        I_Ol.II__(I1II.IIo0("\uac20\uac1a\uace6\uacdd\uacb5\uacd2\uad2e", 44116) + string);
        this.IIlI = IO1I.III_.II(string, this.IIO - 20);
        this.I_Oo = (II.IIl - this.IIO) / 2;
        this.II = new IOI0[this.IoII];
        this.IIOI = this.II.length * 35 + (this.IIlI.length - 1) * 20 + 40;
        this.I_0 = II.IIlI - this.IIOI - 40 - (this.IIlI.length - 1) * 20;
        for (int i = 0; i < i1II.II.length; ++i) {
            i1II.II[i] = new IOI0();
            i1II.II[i].II1o = "";
            i1II.II[i].II0I = i1II.I_Oo + 10;
            i1II.II[i].I_O0 = i1II.I_0 + 35 + (i1II.IIlI.length - 1) * 20 + i * 35;
            i1II.II[i].l10 = i1II.IIO - 20;
            i1II.II[i].l10I = IO1_.ll11 + 2;
            i1II.II[0].Il_0 = !II.IIIl;
            if (II.IIIl) continue;
            i1II.IIl = i1II.II[0].IIII;
        }
        i1II.IIIo = new I1Il(IO11.I_I, i1II, 1, null);
        i1II.III0 = new I1Il(IO11.I_lI, i1II, 2, null);
        if (II.IIIl) {
            i1II.III0.I1 = II.IIl / 2 + 18;
            i1II.IIIo.I1 = II.IIl / 2 - 85;
            i1II.III0.I1I = i1II.IIIo.I1I = i1II.I_0 + i1II.IIOI + 5;
        }
        this.I0l_();
    }

    @Override
    public void III_(IO1l iO1l) {
        int n;
        I1_I.II().III_(iO1l);
        I__O.II(iO1l, this.I_Oo, this.I_0, this.IIO, this.IIOI, -1, true);
        for (n = 0; n < this.IIlI.length; ++n) {
            IO1I.IIIO.II(iO1l, this.IIlI[n], II.IIl / 2, this.I_0 + 15 + n * 20, 2);
        }
        for (n = 0; n < this.II.length; ++n) {
            this.II[n].III_(iO1l);
        }
        super.III_(iO1l);
    }

    @Override
    public void IIlO() {
        I1_I.II().IIlO();
        for (int i = 0; i < this.II.length; ++i) {
            this.II[i].IIlO();
        }
    }

    @Override
    public void IIO1(int n) {
        for (int i = 0; i < this.II.length; ++i) {
            if (!this.II[i].Il_0) continue;
            this.II[i].II1o(n);
            break;
        }
        super.IIO1(n);
    }

    @Override
    public void I_Il() {
        if (II.II[2]) {
            --this.IIO_;
            if (this.IIO_ < 0) {
                this.IIO_ = this.II.length - 1;
            }
        } else if (II.II[8]) {
            ++this.IIO_;
            if (this.IIO_ > this.II.length - 1) {
                this.IIO_ = 0;
            }
        }
        if (II.II[2] || II.II[8]) {
            II.IIIl();
            for (int i = 0; i < this.II.length; ++i) {
                if (this.IIO_ == i) {
                    this.II[i].Il_0 = true;
                    if (!II.IIIl) {
                        this.IIl = this.II[i].IIII;
                    }
                } else {
                    this.II[i].Il_0 = false;
                }
                if (!II.IIIo || !II.II(this.II[i].II0I, this.II[i].I_O0, this.II[i].l10, this.II[i].l10I)) continue;
                this.IIO_ = i;
                break;
            }
        }
        super.I_Il();
        II.IIIl();
    }

    @Override
    public void II(int n, Object object) {
        if (n == 1) {
            I1_I.II.I0l_();
            II = null;
        }
        if (n == 2) {
            if (IO10.l_lI == 5 && this.II.length == 1 || IO10.l_lI == 3 && this.II.length == 1) {
                if (this.II.II.IIl1() != null && !this.II.II.IIl1().equals("")) {
                    this.II[0].IIOl(this.II.II.IIl1());
                    I_0_.II().II(this.II);
                    I1_I.II.I0l_();
                    return;
                }
                II.II(IO11.lII_);
                return;
            }
            n = 0;
            while (true) {
                if (n >= this.II.length) {
                    I_0_.II().II(this.II);
                    I1_I.II.I0l_();
                    break;
                }
                if (this.II[n].IIl1() == null || this.II[n].IIl1().equals("")) {
                    II.II(IO11.lII_);
                    return;
                }
                ++n;
            }
        }
    }

    private static /* synthetic */ String IIo0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

