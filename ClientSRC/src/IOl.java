/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IOl
implements I1_1 {
    int II0I;
    private int III;
    int I_O0;
    private int IIII;
    I1Il IIOO;
    I1Il III_;
    private int IIIl = 24;
    public int IIO = 0;
    private int III1 = 50;
    public static I_O_ III1;
    public int IIOl;
    public int IIlI;
    public int IIO1;
    public int IIO_;
    public boolean I1lI;
    public boolean I1ll;
    public String Ill_;
    private I_lO II1I = new I_lO(IOl.I1Il("\u487d\u4863\u483d\u480d\u48ea\u48d5", 18443));
    int II0;
    int II;

    public void IIlI(boolean bl) {
        Ilol.II();
        this.I1lI = true;
        this.I1ll = false;
        if (this.I1ll) {
            this.I_O0 = 170;
            this.IIII = 118;
            this.II0I = II.IIl / 2 - this.I_O0 / 2;
            this.III = II.IIlI / 2 - this.IIII / 2;
        } else {
            this.I_O0 = 170;
            this.IIII = 170;
            this.II0I = II.IIl / 2 - this.I_O0 / 2;
            this.III = II.IIlI / 2 - this.IIII / 2;
            if (II.IIlI < 240) {
                this.III -= 10;
            }
        }
        this.IIlI = this.II0I;
        this.IIOl = 0;
        this.IIO = Iloo.IIlo.size();
        if (II.IIIl) {
            this.IIOO.I1 = this.II0I;
            this.IIOO.I1I = this.III + this.IIII + 5;
            this.III_.I1 = this.II0I + this.I_O0 - 68;
            this.III_.I1I = this.III + this.IIII + 5;
        }
        III1 = new I_O_();
        III1.II(this.IIO, this.IIIl, this.II0I, this.III + this.III1, this.I_O0, this.IIII - this.III1, true, 1);
    }

    private void IIl1() {
        this.IIOl = this.II0I + this.I_O0;
    }

    public IOl() {
        this.IIOO = new I1Il(IO11.I_lO, this, 1, null);
        this.III_ = new I1Il(IO11.I_I, this, 2, null);
    }

    public void II(IO1l iO1l) {
        iO1l.IIl0(-this.IIlI, 0);
        I__O.II(iO1l, this.II0I, this.III - 17, this.I_O0, this.IIII + 17, -1, true);
        IO1I.III_.II(iO1l, IO11.IO00, this.II0I + this.I_O0 / 2, this.III - 7, 2);
        if (this.II >= 0 && this.II <= Iloo.IIlo.size() - 1) {
            Iloo iloo = (Iloo)Iloo.IIlo.elementAt(this.II);
            if (iloo.IIIl != null) {
                Ilol.II().II(iO1l, iloo.IIIl, II.IIl / 2, this.III + 45, 1, false);
            }
        }
        Ilol.II().II(iO1l, II.IIl / 2, this.III + 45, 1, Ilol.II().IO10, false);
        iO1l.IIIO(this.II0I, this.III + this.III1, this.I_O0, this.IIII - this.III1 - 10);
        if (III1 != null) {
            iO1l.IIl0(0, -IOl.III1.I_0);
        }
        for (int i = 0; i < this.IIO; ++i) {
            int n = this.II0I + 10;
            int n2 = this.III + i * this.IIIl + this.III1;
            if (n2 + this.IIIl - (III1 != null ? IOl.III1.I_0 : 0) < this.III + this.III1 || n2 - (III1 != null ? IOl.III1.I_0 : 0) > this.III + this.III1 + this.IIII) continue;
            Iloo iloo = (Iloo)Iloo.IIlo.elementAt(i);
            IO1I iO1I = IO1I.IIlO;
            if (i == this.II) {
                iO1I = IO1I.IIlo;
            }
            if (iloo.II1o != null) {
                iO1I.II(iO1l, iloo.II1o, n + 20, n2, 0);
            }
            if (iloo.IoI1 > 0) {
                iO1I.II(iO1l, iloo.IoI1 + IOl.I1Il("\u482b", 18443) + IO11.I_1_, n + this.I_O0 - 20, n2, 1);
            } else if (iloo.IO_ > 0) {
                iO1I.II(iO1l, iloo.IO_ + IOl.I1Il("\u482b", 18443) + IO11.I_1O, n + this.I_O0 - 20, n2, 1);
            }
            if (iloo.IIIl == null) continue;
            I_oo.IIII(iO1l, iloo.IIIl[0], n, n2, 0, 0);
        }
        iO1l.IIl0(0, -iO1l.IIO_());
        iO1l.IIIO(0, 0, II.IIl, II.IIlI);
        I_10.II(iO1l, this.IIOO, null, this.III_);
    }

    @Override
    public void II(int n, Object object) {
        if (n == 2) {
            this.IIl1();
        }
        if (n == 1 && !this.I1ll && this.II >= 0) {
            this.IIl1();
            if (Ilol.II().II == null) {
                I_0_.II().II((byte)2, (byte)((Iloo)Iloo.IIlo.elementAt((int)this.II)).IoIl, this.Ill_);
                return;
            }
            I_0_.II().II((byte)4, (byte)((Iloo)Iloo.IIlo.elementAt((int)this.II)).IoIl, "");
        }
    }

    private static /* synthetic */ String I1Il(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

