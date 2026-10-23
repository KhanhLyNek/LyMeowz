package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I1Oo {
    public int[][] III1 = new int[3][];
    public I1O_ var_I1O__III = new I1O_();
    private int IIO_;
    private int IoII;
    private int IIO0;
    private int IIOo;
    public int Io1I;
    private int II0;
    private int II;
    private int var_int_III;
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
        if (!(this.equals(I1_I.var_I1Oo_III) && I1_I.I1_I_II().IIo_() || this.equals(I1_I.var_I1Oo_III) && I1_I.I1_I_II().var_I__0_II != null || !I1_I.IO__ || II.var_IO1__II != I1_I.I1_I_II() && II.var_IO1__II != I1IO.I1IO_II() || Ilo1.var_Ilo1_IIII != null || !this.IO0 || Ilol.I1Oo || II.var_I_1o_II.I_10 && this.equals(I1_I.var_I1Oo_III))) {
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
            iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
            if (this.var_I1O__III != null) {
                this.var_I1O__III.III(iO1l, this.Io1, this.Io1I, this.IIO_);
            }
            if (this.var_I1O__III.II != null && this.var_I1O__III.II.IIll == null && this.III1 != null) {
                I_oo.IIII(iO1l, this.III1[Ilol.Ilol_II().IOIO][this.IoII], this.Io1, this.Io1I + 3 + (II.var_int_IIIO % 10 > 5 ? 1 : 0), this.IIO_ == 1 ? 0 : 2, IOII.IIOI);
            }
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        }
    }

    public void IIlO() {
        if (this.var_I1O__III != null && this.var_I1O__III.IIOO != null && this.var_I1O__III.IIOO.size() == 0 && this.Io1I != -40) {
            --this.var_I1O__III.IIOI;
            if (this.var_I1O__III.IIOI <= 0) {
                this.Io1I = -40;
                this.var_I1O__III.IIO = 0;
                this.var_I1O__III.IIOO.removeAllElements();
                this.var_I1O__III.IIIO = null;
                this.var_I1O__III.IIOI = 200;
            }
        }
        if ((!this.equals(I1_I.var_I1Oo_III) || I1_I.I1_I_II().var_I__0_II == null) && this.IO0) {
            if (this.Io1I != this.IIOo) {
                this.II = this.IIOo - this.Io1I << 2;
                this.II0 += this.II;
                this.Io1I += this.II0 >> 4;
                this.II0 &= 0xF;
            }
            if (this.Io1 != this.var_int_III) {
                this.IIIl = this.var_int_III - this.Io1 << 2;
                this.IIII += this.IIIl;
                this.Io1 += this.IIII >> 4;
                this.IIII &= 0xF;
            }
            ++this.IIO0;
            if (this.IIO0 == 5) {
                this.IIO0 = 0;
                this.IoII = this.IoII == 0 ? 1 : 0;
            }
            if (this.var_I1O__III != null && (this.var_I1O__III == null || this.var_I1O__III.II != null)) {
                if (!this.IOOo) {
                    if (this.IIOl > 0) {
                        --this.IIOl;
                        if (this.IIOl == 0) {
                            II.var_I_1o_II.I0o_();
                            II.var_I_1o_II.I__0();
                        }
                    }
                    if (II.var_int_IIIO % 3 == 0) {
                        if (Ilol.Ilol_II().IOI1 == 1) {
                            this.var_int_III = Ilol.Ilol_II().I_o_ - 20 - I1_I.Io1;
                        }
                        if (Ilol.Ilol_II().IOI1 == -1) {
                            this.var_int_III = Ilol.Ilol_II().I_o_ + 20 - I1_I.Io1;
                        }
                        if (this.var_int_III <= 24) {
                            this.var_int_III += this.var_I1O__III.I_Oo / 2;
                        }
                        if (this.var_int_III >= II.var_int_IIl - 24) {
                            this.var_int_III -= this.var_I1O__III.I_Oo / 2;
                        }
                        this.IIOo = Ilol.Ilol_II().I_oO - 40 - I1_I.Io1I;
                        if (this.var_I1O__III.IIIO != null && this.IIOo < (this.var_I1O__III.IIIO.length + 1) * 12 + 10) {
                            this.IIOo = (this.var_I1O__III.IIIO.length + 1) * 12 + 10;
                        }
                        if (this.var_I1O__III.II.IIll != null) {
                            if (II.var_int_IIl - 50 > 155 + this.var_I1O__III.IIO1) {
                                this.var_int_III = II.var_int_IIl - 60 - this.var_I1O__III.IIO1 / 2;
                                this.IIOo = this.var_I1O__III.IIO_ + 10;
                            } else {
                                this.var_int_III = II.var_int_IIl - 20 - this.var_I1O__III.IIO1 / 2;
                                this.IIOo = 45 + this.var_I1O__III.IIO_;
                                if (II.var_int_IIl > II.var_int_IIlI || II.var_int_IIl < 220) {
                                    this.var_int_III = II.var_int_IIl - 20 - this.var_I1O__III.IIO1 / 2;
                                    this.IIOo = this.var_I1O__III.IIO_ + 10;
                                }
                            }
                        }
                    }
                    this.IIO_ = this.Io1 > Ilol.Ilol_II().I_o_ - I1_I.Io1 ? -1 : 1;
                }
                if (this.var_I1O__III.II != null) {
                    if (this.var_I1O__III.IIOO.size() > 1) {
                        if (this.var_I1O__III.II.IIOI == 0) {
                            ++this.var_I1O__III.IIO;
                            if (this.var_I1O__III.IIO >= this.var_I1O__III.II.I_O0) {
                                I1O0 i1O0;
                                this.var_I1O__III.IIO = 0;
                                this.var_I1O__III.IIOO.removeElementAt(0);
                                this.var_I1O__III.II = i1O0 = (I1O0)this.var_I1O__III.IIOO.firstElement();
                                this.var_I1O__III.III();
                                return;
                            }
                        } else {
                            this.var_I1O__III.II.IloO = System.currentTimeMillis();
                            if (this.var_I1O__III.II.IloO - this.var_I1O__III.II.Ilo_ >= 1000L) {
                                this.var_I1O__III.II.Ilo_ = System.currentTimeMillis();
                                --this.var_I1O__III.II.IIOI;
                            }
                            if (this.var_I1O__III.II.IIOI == 0) {
                                I1O0 i1O0;
                                this.var_I1O__III.IIOO.removeElementAt(0);
                                if (this.var_I1O__III.IIOO.size() == 0) {
                                    return;
                                }
                                this.var_I1O__III.II = i1O0 = (I1O0)this.var_I1O__III.IIOO.firstElement();
                                this.var_I1O__III.III();
                                return;
                            }
                        }
                    } else if (this.var_I1O__III.IIOO.size() == 1) {
                        if (this.var_I1O__III.II.IIOI == 0) {
                            ++this.var_I1O__III.IIO;
                            if (this.var_I1O__III.IIO >= this.var_I1O__III.II.I_O0) {
                                this.IOOo = true;
                            }
                            if (this.var_I1O__III.IIO == this.var_I1O__III.II.I_O0) {
                                this.IIOo = -40;
                                this.var_int_III = Ilol.Ilol_II().I_o_ - I1_I.Io1 + (Ilol.Ilol_II().IOI1 == 1 ? -20 : 20);
                            }
                            if (this.var_I1O__III.IIO >= this.var_I1O__III.II.I_O0 + 20) {
                                this.var_I1O__III.IIO = 0;
                                this.var_I1O__III.IIOO.removeAllElements();
                                this.var_I1O__III.IIIO = null;
                                return;
                            }
                        } else {
                            this.var_I1O__III.II.IloO = System.currentTimeMillis();
                            if (this.var_I1O__III.II.IloO - this.var_I1O__III.II.Ilo_ >= 1000L) {
                                this.var_I1O__III.II.Ilo_ = System.currentTimeMillis();
                                --this.var_I1O__III.II.IIOI;
                            }
                            if (this.var_I1O__III.II.IIOI == 0) {
                                this.IOOo = true;
                                this.IIOo = -40;
                                this.var_int_III = Ilol.Ilol_II().I_o_ - I1_I.Io1 + (Ilol.Ilol_II().IOI1 == 1 ? -20 : 20);
                                this.var_I1O__III.IIO = 0;
                                this.var_I1O__III.IIOO.removeAllElements();
                                this.var_I1O__III.IIIO = null;
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
        this.var_I1O__III.II(string, 3, ilol, bl);
        this.IOOo = false;
    }

    public void IIII(String string, int n) {
        string = I_Ol.IIIo(string);
        if (this.var_I1O__III.IIOO.size() <= 0 || !string.equals(((I1O0)this.var_I1O__III.IIOO.lastElement()).IIoo)) {
            if (this.var_I1O__III.IIOO.size() > 10) {
                for (int i = 0; i < 5; ++i) {
                    this.var_I1O__III.IIOO.removeElementAt(0);
                }
            }
            this.var_I1O__III.II(string, n, null, false);
            if (this.var_I1O__III.IIOO.size() == 1) {
                this.Io1I = 0;
                this.Io1 = Ilol.Ilol_II().I_o_ - I1_I.Io1 + (Ilol.Ilol_II().IOI1 == 1 ? -20 : 20);
            }
            this.IOOo = false;
        }
    }
}

