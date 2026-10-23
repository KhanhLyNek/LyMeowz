/*
 * Decompiled with CFR 0.152.
 */
public final class I__l {
    private Ilol II1l;
    private I1Io III;
    private I_lO II_I = new I_lO(I__l.IlOO("\u2ff7\u2fe4\u2ffe\u2f8c\u2fa9\u304f", 12161));
    private int IIO;
    private int IIOI;
    private int IIOl;
    private int IIlI;
    private int IIO1;
    private int IIO_;
    private int IoII;
    private int IIO0 = 0;
    private int IIOo = 0;
    private boolean IIl = false;
    private boolean I01o = true;
    public I_ol IIII;

    public I__l(Ilol ilol, int n, I_ol i_ol, int n2, int n3) {
        this.IIII = i_ol;
        this.II1l = ilol;
        this.III = I1_I.II[n];
        this.IIlI = this.III.IIO1;
        this.IIO1 = n2;
        this.IIO_ = n3;
        I1_O i1_O = ilol.IIII == null ? ilol.IIIl : ilol.IIII;
        this.IIO = n = I_Ol.III1(((I1_O)i1_O).IIlo() - n2, ((I1_O)i1_O).II1() - n3);
        this.IIOI = this.IIlI * I_Ol.IIl1(n) >> 10;
        this.IIOl = this.IIlI * I_Ol.IIll(n) >> 10;
    }

    public void IIl1() {
        if (this.I01o) {
            if (this.II1l.IIII == null && this.II1l.IIIl == null) {
                this.IOlI();
            } else {
                int n;
                I1_O i1_O = this.II1l.IIII == null ? this.II1l.IIIl : this.II1l.IIII;
                for (n = 0; n < this.III.II10; ++n) {
                    if (this.III.III_.length > 0) {
                        this.II_I.addElement(new I_o0(this.IIO1, this.IIO_));
                    }
                    int n2 = this.II1l.IIlo() > ((I1_O)i1_O).IIlo() ? 10 : -10;
                    this.IIO0 = ((I1_O)i1_O).IIlo() + n2 - this.IIO1;
                    this.IIOo = ((I1_O)i1_O).II1() - ((I1_O)i1_O).II1I() / 2 - this.IIO_;
                    ++this.IoII;
                    if (I_Ol.II1(this.IIO0) < 20 && I_Ol.II1(this.IIOo) < 20) {
                        if (this.II1l.IIIl != null && this.II1l.IIIl.I1_) {
                            this.II1l.IIIl.II(this.II1l.IIIl.II10, 0, this.II1l.IIIl.I11_, this.II1l.IIIl.I111);
                        }
                        this.IOlI();
                        return;
                    }
                    n2 = I_Ol.III1(this.IIO0, this.IIOo);
                    if (Math.abs(n2 - this.IIO) < 90 || this.IIO0 * this.IIO0 + this.IIOo * this.IIOo > 4096) {
                        this.IIO = Math.abs(n2 - this.IIO) < 15 ? n2 : ((n2 - this.IIO < 0 || n2 - this.IIO >= 180) && n2 - this.IIO >= -180 ? I_Ol.IIl_(this.IIO - 15) : I_Ol.IIl_(this.IIO + 15));
                    }
                    if (this.IIlI < 8192) {
                        this.IIlI += 1024;
                    }
                    this.IIOI = this.IIlI * I_Ol.IIl1(this.IIO) >> 10;
                    this.IIOl = this.IIlI * I_Ol.IIll(this.IIO) >> 10;
                    this.IIO0 += this.IIOI;
                    n2 = this.IIO0 >> 10;
                    this.IIO1 += n2;
                    this.IIO0 &= 0x3FF;
                    this.IIOo += this.IIOl;
                    n2 = this.IIOo >> 10;
                    this.IIO_ += n2;
                    this.IIOo &= 0x3FF;
                }
                for (n = 0; n < this.II_I.size(); ++n) {
                    I_o0 i_o0 = (I_o0)this.II_I.elementAt(n);
                    ++i_o0.II0I;
                    if (i_o0.II0I < this.III.III_.length) continue;
                    this.II_I.removeElementAt(n);
                }
            }
        }
    }

    private void IOlI() {
        I_Ol.II__(I__l.IlOO("\u2fc4\u2fee\u2ffb\u2ffe\u2fb0\u3059\u301a", 12161));
        if (!this.II1l.I1oI && this.IIO1 >= I1_I.Io1 && this.IIO1 <= I1_I.Io1 + II.IIl) {
            IO.II();
        }
        this.II1l.IOoI();
        if (this.II1l.I1oI) {
            this.II1l.I1oI = false;
            if (this.II1l.I10l && this.II1l.I1_ && this.II1l.IOIl != 14 && this.II1l.IOIl != 5) {
                this.II1l.I10l = false;
            }
            I1_I.II().IIl(this.IIO1, this.IIO_);
        }
        this.II1l.II = null;
        this.II1l.I1o = false;
        this.II1l.II = null;
        this.II1l.III = null;
    }

    public void II(IO1l iO1l) {
        if (this.I01o) {
            int n;
            I_o0 i_o0;
            int n2;
            int n3 = I_lI.III0(360 - this.IIO);
            byte by = I_lI.IIl_[n3];
            n3 = I_lI.I11I[n3];
            for (n2 = this.II_I.size() / 2; n2 < this.II_I.size(); ++n2) {
                i_o0 = (I_o0)this.II_I.elementAt(n2);
                I_oo.IIII(iO1l, this.III.IIIO[i_o0.II0I], i_o0.I_O0, i_o0.I_Oo, 0, 3);
            }
            n2 = II.IIIO % this.III.IIII.length;
            I_oo.IIII(iO1l, this.III.IIII[n2][by], this.IIO1, this.IIO_, n3, 3);
            for (n = 0; n < this.II_I.size(); ++n) {
                i_o0 = (I_o0)this.II_I.elementAt(n);
                I_oo.IIII(iO1l, this.III.III_[i_o0.II0I], i_o0.I_O0, i_o0.I_Oo, 0, 3);
            }
            I_oo.IIII(iO1l, this.III.III[n2][by], this.IIO1, this.IIO_, n3, 3);
            for (n = 0; n < this.II_I.size(); ++n) {
                i_o0 = (I_o0)this.II_I.elementAt(n);
                if (I_Ol.II1(I_lI.III.nextInt(100)) >= this.III.II1O) continue;
                I_oo.IIII(iO1l, II.IIIO % 2 == 0 ? this.III.III0[i_o0.II0I] : this.III.IIIo[i_o0.II0I], i_o0.I_O0, i_o0.I_Oo, 0, 3);
            }
            iO1l.Illl(0xFF0000);
        }
    }

    private static /* synthetic */ String IlOO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

