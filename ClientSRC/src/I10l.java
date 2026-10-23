/*
 * Decompiled with CFR 0.152.
 */
public final class I10l
extends I1l {
    private String[] IIlo;
    public IOI0 IIII;
    private int IIOI = 40;

    public I10l() {
        if (II.IIl <= 176) {
            this.IIOI = 10;
        }
        this.IIII = new IOI0();
        this.IIII.II0I = this.IIOI + 10;
        this.IIII.I_O0 = II.IIlI - IO1_.ll11 - 43;
        this.IIII.l10 = II.IIl - 2 * (this.IIOI + 10);
        this.IIII.l10I = IO1_.ll11 + 2;
        this.IIII.Il_0 = true;
        this.IIl = this.IIII.IIII;
    }

    public void II(String string, I1Il i1Il, int n) {
        this.IIII.IIOl("");
        this.IIII.Ill(n);
        this.IIlo = IO1I.II1l.II(string, II.IIl - (this.IIOI << 1));
        this.IIIo = new I1Il(IO11.I_I, II.II(), 8882, null);
        this.III0 = i1Il;
        II.II = this;
    }

    @Override
    public void II(IO1l iO1l) {
        II.II.II(iO1l, this.IIOI, II.IIlI - 77 - IO1_.llo_, II.IIl - (this.IIOI << 1), 69, this.IIlo);
        this.IIII.III_(iO1l);
        super.II(iO1l);
    }

    @Override
    public void IIO(int n) {
        this.IIII.II1o(n);
        super.IIO(n);
    }

    @Override
    public void IIl1() {
        this.IIII.IIlO();
        super.IIl1();
    }
}

