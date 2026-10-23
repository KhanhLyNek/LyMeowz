/*
 * Decompiled with CFR 0.152.
 */
public final class I__0
implements I1_1 {
    public I1Il II_l;
    private I1Il II_1;
    private String[] IIll;
    private int I_0;
    private int IIO;
    private int IIOI = 120;
    private int IIOl;
    private int IIlI;
    private long IloO;
    private long Iloo;

    public void IIII(String string, I1Il i1Il, I1Il i1Il2) {
        this.IIll = new String[]{string};
        this.IIOl = 29;
        this.II_l = i1Il;
        this.II_1 = i1Il2;
        this.II_l.IIO1 = this.II_1.IIO1 = I1_I.Il1o;
        this.II_l.IIO_ = this.II_1.IIO_ = I1_I.Il_;
        this.II_l.IoII = IO1l.II(i1Il.IIO1);
        this.II_1.IoII = IO1l.II(i1Il.IIO1);
        this.II_l.IIO0 = IO1l.III(i1Il.IIO1);
        this.II_1.IIO0 = IO1l.III(i1Il.IIO1);
        this.IloO = System.currentTimeMillis();
        this.IIlI = this.IIll[0].length() / 3;
        if (this.IIlI < 15) {
            this.IIlI = 15;
        }
        IOl_.II0();
    }

    public void III_(IO1l iO1l) {
        I__O.II(iO1l, this.I_0, this.IIO, this.IIOI, this.IIOl + (!II.IIIl ? 10 : 0), 0xFFFFFF, false);
        if (this.IIll != null) {
            IOl_.II(iO1l, this.IIll[0], this.I_0 + 5, this.IIO + this.IIOl / 2 - (II.IIIl ? 4 : 6), this.IIOI - 10, this.IIOl, IO1I.IIlI);
            if (II.IIIl) {
                this.II_l.II(iO1l);
                IO1I.IIl_.II(iO1l, String.valueOf(this.IIlI), this.II_l.I1 + this.II_l.IoII / 2, this.II_l.I1I + this.II_l.IIO0 + 5, 2, IO1I.IIlO);
                return;
            }
            if (IOI0.III_) {
                IO1I.III.II(iO1l, IO11.IOl0 + this.IIlI + I__0.IlOo("\ud413", 54330), this.I_0 + this.IIOI / 2, this.IIO + this.IIOl, 2);
                return;
            }
            IO1I.III.II(iO1l, IO11.IOlo + this.IIlI + I__0.IlOo("\ud413", 54330), this.I_0 + this.IIOI / 2, this.IIO + this.IIOl, 2);
        }
    }

    public void IIl1() {
        if (this.IIll != null) {
            this.I_0 = II.IIl - 5 - this.IIOI;
            this.IIO = 45;
            if (II.IIl - 50 > 155 + this.IIOI) {
                this.I_0 = II.IIl - 55 - this.IIOI;
                this.IIO = 5;
            }
            this.II_l.I1 = this.I_0 - 35;
            this.II_l.I1I = this.IIO;
            this.Iloo = System.currentTimeMillis();
            I_Ol.II__(I__0.IlOo("\ud459\ud42c\ud40a\ud4e5\ud496\ud4f8\ud4d4\ud57f\ud553\ud522\ud504\ud5b2\ud58e", 54330) + (this.Iloo - this.IloO));
            if (this.Iloo - this.IloO >= 1000L) {
                this.IloO = System.currentTimeMillis();
                --this.IIlI;
            }
            if (this.IIlI == 0) {
                I1_I.II().II = null;
            }
        }
    }

    @Override
    public void II(int n, Object object) {
    }

    private static /* synthetic */ String IlOo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

