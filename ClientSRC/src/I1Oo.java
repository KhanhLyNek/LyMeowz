/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class I1Oo {
    public int[][] III1 = new int[3][];
    public I1O_ III;
    private int IIO_;
    private int IoII;
    private int IIO0;
    private int IIOo;
    public int Io1I;
    private int II0;
    private int II;
    private int III = new I1O_();
    public int Io1;
    private int IIII;
    private int IIIl;
    public boolean IOOo;
    public boolean IO0 = true;
    public int IIOl;
    public int IIlI;
    public I1Il IIl_;

    public I1Oo() {
        for (int i = 0; i < this.III1.length; ++i) {
            this.III1[i] = new int[3];
        }
    }

    public void II(IO1l iO1l) {
        if (!(this.equals(I1_I.III) && I1_I.II().IIo_() || this.equals(I1_I.III) && I1_I.II().II != null || !I1_I.IO__ || II.II != I1_I.II() && II.II != I1IO.II() || Ilo1.IIII != null || !this.IO0 || Ilol.I1Oo || II.II.I_10 && this.equals(I1_I.III))) {
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
            iO1l.IIIO(0, 0, II.IIl, II.IIlI);
            if (this.III != null) {
                this.III.III(iO1l, this.Io1, this.Io1I, this.IIO_);
            }
            if (this.III.II != null && this.III.II.IIll == null && this.III1 != null) {
                I_oo.IIII(iO1l, this.III1[Ilol.II().IOIO][this.IoII], this.Io1, this.Io1I + 3 + (II.IIIO % 10 > 5 ? 1 : 0), this.IIO_ == 1 ? 0 : 2, IOII.IIOI);
            }
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        }
    }

    public void IIlO() {
        if (this.III != null && this.III.IIOO != null && this.III.IIOO.size() == 0 && this.Io1I != -40) {
            --this.III.IIOI;
            if (this.III.IIOI <= 0) {
                this.Io1I = -40;
                this.III.IIO = 0;
                this.III.IIOO.removeAllElements();
                this.III.IIIO = null;
                this.III.IIOI = 200;
            }
        }
        if ((!this.equals(I1_I.III) || I1_I.II().II == null) && this.IO0) {
            if (this.Io1I != this.IIOo) {
                this.II = this.IIOo - this.Io1I << 2;
                this.II0 += this.II;
                this.Io1I += this.II0 >> 4;
                this.II0 &= 0xF;
            }
            if (this.Io1 != this.III) {
                this.IIIl = this.III - this.Io1 << 2;
                this.IIII += this.IIIl;
                this.Io1 += this.IIII >> 4;
                this.IIII &= 0xF;
            }
            ++this.IIO0;
            if (this.IIO0 == 5) {
                this.IIO0 = 0;
                this.IoII = this.IoII == 0 ? 1 : 0;
            }
            if (this.III != null && (this.III == null || this.III.II != null)) {
                if (!this.IOOo) {
                    if (this.IIOl > 0) {
                        --this.IIOl;
                        if (this.IIOl == 0) {
                            II.II.I0o_();
                            II.II.I__0();
                        }
                    }
                    if (II.IIIO % 3 == 0) {
                        if (Ilol.II().IOI1 == 1) {
                            this.III = Ilol.II().I_o_ - 20 - I1_I.Io1;
                        }
                        if (Ilol.II().IOI1 == -1) {
                            this.III = Ilol.II().I_o_ + 20 - I1_I.Io1;
                        }
                        if (this.III <= 24) {
                            this.III += this.III.I_Oo / 2;
                        }
                        if (this.III >= II.IIl - 24) {
                            this.III -= this.III.I_Oo / 2;
                        }
                        this.IIOo = Ilol.II().I_oO - 40 - I1_I.Io1I;
                        if (this.III.IIIO != null && this.IIOo < (this.III.IIIO.length + 1) * 12 + 10) {
                            this.IIOo = (this.III.IIIO.length + 1) * 12 + 10;
                        }
                        if (this.III.II.IIll != null) {
                            if (II.IIl - 50 > 155 + this.III.IIO1) {
                                this.III = II.IIl - 60 - this.III.IIO1 / 2;
                                this.IIOo = this.III.IIO_ + 10;
                            } else {
                                this.III = II.IIl - 20 - this.III.IIO1 / 2;
                                this.IIOo = 45 + this.III.IIO_;
                                if (II.IIl > II.IIlI || II.IIl < 220) {
                                    this.III = II.IIl - 20 - this.III.IIO1 / 2;
                                    this.IIOo = this.III.IIO_ + 10;
                                }
                            }
                        }
                    }
                    this.IIO_ = this.Io1 > Ilol.II().I_o_ - I1_I.Io1 ? -1 : 1;
                }
                if (this.III.II != null) {
                    if (this.III.IIOO.size() > 1) {
                        if (this.III.II.IIOI == 0) {
                            ++this.III.IIO;
                            if (this.III.IIO >= this.III.II.I_O0) {
                                I1O0 i1O0;
                                this.III.IIO = 0;
                                this.III.IIOO.removeElementAt(0);
                                this.III.II = i1O0 = (I1O0)this.III.IIOO.firstElement();
                                this.III.III();
                                return;
                            }
                        } else {
                            this.III.II.IloO = System.currentTimeMillis();
                            if (this.III.II.IloO - this.III.II.Ilo_ >= 1000L) {
                                this.III.II.Ilo_ = System.currentTimeMillis();
                                --this.III.II.IIOI;
                            }
                            if (this.III.II.IIOI == 0) {
                                I1O0 i1O0;
                                this.III.IIOO.removeElementAt(0);
                                if (this.III.IIOO.size() == 0) {
                                    return;
                                }
                                this.III.II = i1O0 = (I1O0)this.III.IIOO.firstElement();
                                this.III.III();
                                return;
                            }
                        }
                    } else if (this.III.IIOO.size() == 1) {
                        if (this.III.II.IIOI == 0) {
                            ++this.III.IIO;
                            if (this.III.IIO >= this.III.II.I_O0) {
                                this.IOOo = true;
                            }
                            if (this.III.IIO == this.III.II.I_O0) {
                                this.IIOo = -40;
                                this.III = Ilol.II().I_o_ - I1_I.Io1 + (Ilol.II().IOI1 == 1 ? -20 : 20);
                            }
                            if (this.III.IIO >= this.III.II.I_O0 + 20) {
                                this.III.IIO = 0;
                                this.III.IIOO.removeAllElements();
                                this.III.IIIO = null;
                                return;
                            }
                        } else {
                            this.III.II.IloO = System.currentTimeMillis();
                            if (this.III.II.IloO - this.III.II.Ilo_ >= 1000L) {
                                this.III.II.Ilo_ = System.currentTimeMillis();
                                --this.III.II.IIOI;
                            }
                            if (this.III.II.IIOI == 0) {
                                this.IOOo = true;
                                this.IIOo = -40;
                                this.III = Ilol.II().I_o_ - I1_I.Io1 + (Ilol.II().IOI1 == 1 ? -20 : 20);
                                this.III.IIO = 0;
                                this.III.IIOO.removeAllElements();
                                this.III.IIIO = null;
                                this.IIl_ = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public void II(String string, Ilol ilol, boolean bl) {
        this.IIlI = ilol.IOI_;
        this.III.II(string, 3, ilol, bl);
        this.IOOo = false;
    }

    public void IIII(String string, int n) {
        string = I_Ol.IIIo(string);
        if (this.III.IIOO.size() <= 0 || !string.equals(((I1O0)this.III.IIOO.lastElement()).IIoo)) {
            if (this.III.IIOO.size() > 10) {
                for (int i = 0; i < 5; ++i) {
                    this.III.IIOO.removeElementAt(0);
                }
            }
            this.III.II(string, n, null, false);
            if (this.III.IIOO.size() == 1) {
                this.Io1I = 0;
                this.Io1 = Ilol.II().I_o_ - I1_I.Io1 + (Ilol.II().IOI1 == 1 ? -20 : 20);
            }
            this.IOOo = false;
        }
    }
}

