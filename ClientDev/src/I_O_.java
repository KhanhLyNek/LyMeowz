package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I_O_ {
    public int II0I;
    public int I_O0;
    public int I_Oo;
    public int I_0;
    public int IIO;
    public int IIOI;
    public int IIOl;
    public int var_int_IIlI;
    private int III;
    private int IIII;
    public int IIO1;
    public int IIO_;
    public int IoII;
    public int IIO0;
    private int IIIl;
    private int III1;
    private int[] I10o = new int[3];
    public boolean I__I;
    private boolean I1I0;
    private int Iol;
    public int II0;
    public int II;
    private int IIl;
    private boolean var_boolean_IIlI = true;

    public final I_OO II() {
        if (this.var_boolean_IIlI) {
            int n;
            boolean bl = false;
            I_O_ i_O_ = this;
            int n2 = this.III;
            int n3 = this.IIII;
            int n4 = this.IIO1;
            int n5 = this.IIO_;
            if (II.var_boolean_IIIO) {
                if (!this.I__I && II.III(n2, n3, n4, n5)) {
                    for (n4 = 0; n4 < i_O_.I10o.length; ++n4) {
                        i_O_.I10o[0] = II.var_int_III;
                    }
                    i_O_.III1 = II.var_int_III;
                    i_O_.I__I = true;
                    i_O_.II0 = -1;
                    i_O_.I1I0 = i_O_.Iol != 0;
                    i_O_.Iol = 0;
                } else if (this.I__I) {
                    ++this.IIIl;
                    if (this.IIIl > 5 && this.III1 == II.var_int_III && !this.I1I0) {
                        this.III1 = -1000;
                        if (this.IIl > 1) {
                            n4 = (this.I_O0 + II.var_int_III - n3) / this.II;
                            n = (this.II0I + II.var_int_II - n2) / this.II;
                            this.II0 = n4 * this.IIl + n;
                        } else {
                            this.II0 = (this.I_O0 + II.var_int_III - n3) / this.II;
                        }
                    }
                    if ((n4 = II.var_int_III - this.I10o[0]) != 0 && this.II0 != -1) {
                        this.II0 = -1;
                    }
                    for (n = this.I10o.length - 1; n > 0; --n) {
                        i_O_.I10o[n] = i_O_.I10o[n - 1];
                    }
                    i_O_.I10o[0] = II.var_int_III;
                    i_O_.I_O0 -= n4;
                    if (i_O_.I_O0 < 0) {
                        i_O_.I_O0 = 0;
                    }
                    if (i_O_.I_O0 > i_O_.IIO0) {
                        i_O_.I_O0 = i_O_.IIO0;
                    }
                    if (i_O_.I_0 < 0 || i_O_.I_0 > i_O_.IIO0) {
                        n4 /= 2;
                    }
                    i_O_.I_0 -= n4;
                }
            }
            boolean bl2 = false;
            if (II.var_boolean_IIIo && i_O_.I__I) {
                n = II.var_int_III - i_O_.I10o[0];
                II.var_boolean_IIIo = false;
                if (I_Ol.II1(n) < 20 && I_Ol.II1(II.var_int_III - i_O_.III1) < 20 && !i_O_.I1I0) {
                    i_O_.Iol = 0;
                    i_O_.I_O0 = i_O_.I_0;
                    i_O_.III1 = -1000;
                    if (i_O_.IIl > 1) {
                        n = (i_O_.I_O0 + II.var_int_III - n3) / i_O_.II;
                        n2 = (i_O_.II0I + II.var_int_II - n2) / i_O_.II;
                        i_O_.II0 = n * i_O_.IIl + n2;
                    } else {
                        i_O_.II0 = (i_O_.I_O0 + II.var_int_III - n3) / i_O_.II;
                    }
                    i_O_.IIIl = 0;
                    bl2 = true;
                } else if (i_O_.II0 != -1 && i_O_.IIIl > 5) {
                    i_O_.IIIl = 0;
                    bl2 = true;
                } else if (i_O_.II0 == -1 && !i_O_.I1I0) {
                    if (i_O_.I_0 < 0) {
                        i_O_.I_O0 = 0;
                    } else if (i_O_.I_0 > i_O_.IIO0) {
                        i_O_.I_O0 = i_O_.IIO0;
                    } else {
                        n = II.var_int_III - i_O_.I10o[0] + (i_O_.I10o[0] - i_O_.I10o[1]) + (i_O_.I10o[1] - i_O_.I10o[2]);
                        int n6 = n > 10 ? 10 : (n < -10 ? -10 : 0);
                        i_O_.Iol = -n6 * 100;
                    }
                }
                i_O_.I__I = false;
                i_O_.IIIl = 0;
                II.var_boolean_IIIo = false;
            }
            I_OO i_OO = new I_OO();
            new I_OO().I_O0 = i_O_.II0;
            i_OO.III = bl2;
            i_OO.I_1o = i_O_.I__I;
            return i_OO;
        }
        I_O_ i_O_ = this;
        int n = this.III;
        int n7 = this.IIII;
        int n8 = this.IIO1;
        int n9 = this.IIO_;
        if (II.var_boolean_IIIO) {
            if (!this.I__I && II.III(n, n7, n8, n9)) {
                for (int i = 0; i < i_O_.I10o.length; ++i) {
                    i_O_.I10o[0] = II.var_int_II;
                }
                i_O_.III1 = II.var_int_II;
                i_O_.I__I = true;
                i_O_.II0 = -1;
                i_O_.I1I0 = i_O_.Iol != 0;
                i_O_.Iol = 0;
            } else if (this.I__I) {
                int n10;
                ++this.IIIl;
                if (this.IIIl > 5 && this.III1 == II.var_int_II && !this.I1I0) {
                    this.III1 = -1000;
                    this.II0 = (this.II0I + II.var_int_II - n) / this.II;
                }
                if ((n10 = II.var_int_II - this.I10o[0]) != 0 && this.II0 != -1) {
                    this.II0 = -1;
                }
                for (n9 = this.I10o.length - 1; n9 > 0; --n9) {
                    i_O_.I10o[n9] = i_O_.I10o[n9 - 1];
                }
                i_O_.I10o[0] = II.var_int_II;
                i_O_.II0I -= n10;
                if (i_O_.II0I < 0) {
                    i_O_.II0I = 0;
                }
                if (i_O_.II0I > i_O_.IoII) {
                    i_O_.II0I = i_O_.IoII;
                }
                if (i_O_.I_Oo < 0 || i_O_.I_Oo > i_O_.IoII) {
                    n10 /= 2;
                }
                i_O_.I_Oo -= n10;
            }
        }
        boolean bl = false;
        if (II.var_boolean_IIIo && i_O_.I__I) {
            n9 = II.var_int_II - i_O_.I10o[0];
            II.var_boolean_IIIo = false;
            if (I_Ol.II1(n9) < 20 && I_Ol.II1(II.var_int_II - i_O_.III1) < 20 && !i_O_.I1I0) {
                i_O_.Iol = 0;
                i_O_.II0I = i_O_.I_Oo;
                i_O_.III1 = -1000;
                i_O_.II0 = (i_O_.II0I + II.var_int_II - n) / i_O_.II;
                i_O_.IIIl = 0;
                bl = true;
            } else if (i_O_.II0 != -1 && i_O_.IIIl > 5) {
                i_O_.IIIl = 0;
                bl = true;
            } else if (i_O_.II0 == -1 && !i_O_.I1I0) {
                if (i_O_.I_Oo < 0) {
                    i_O_.II0I = 0;
                } else if (i_O_.I_Oo > i_O_.IoII) {
                    i_O_.II0I = i_O_.IoII;
                } else {
                    n = II.var_int_II - i_O_.I10o[0] + (i_O_.I10o[0] - i_O_.I10o[1]) + (i_O_.I10o[1] - i_O_.I10o[2]);
                    int n11 = n > 10 ? 10 : (n < -10 ? -10 : 0);
                    i_O_.Iol = -n11 * 100;
                }
            }
            i_O_.I__I = false;
            i_O_.IIIl = 0;
            II.var_boolean_IIIo = false;
        }
        I_OO i_OO = new I_OO();
        new I_OO().I_O0 = i_O_.II0;
        i_OO.III = bl;
        i_OO.I_1o = i_O_.I__I;
        return i_OO;
    }

    public void IOlI() {
        if (this.Iol != 0 && !this.I__I) {
            if (this.var_boolean_IIlI) {
                this.I_O0 += this.Iol / 100;
                if (this.I_O0 < 0) {
                    this.I_O0 = 0;
                } else if (this.I_O0 > this.IIO0) {
                    this.I_O0 = this.IIO0;
                } else {
                    this.I_0 = this.I_O0;
                }
            } else {
                this.II0I += this.Iol / 100;
                if (this.II0I < 0) {
                    this.II0I = 0;
                } else if (this.II0I > this.IoII) {
                    this.II0I = this.IoII;
                } else {
                    this.I_Oo = this.II0I;
                }
            }
            this.Iol = this.Iol * 9 / 10;
            if (this.Iol < 100 && this.Iol > -100) {
                this.Iol = 0;
            }
        }
        if (this.I_Oo != this.II0I && !this.I__I) {
            this.IIO = this.II0I - this.I_Oo << 2;
            this.IIOl += this.IIO;
            this.I_Oo += this.IIOl >> 4;
            this.IIOl &= 0xF;
        }
        if (this.I_0 != this.I_O0 && !this.I__I) {
            this.IIOI = this.I_O0 - this.I_0 << 2;
            this.var_int_IIlI += this.IIOI;
            this.I_0 += this.var_int_IIlI >> 4;
            this.var_int_IIlI &= 0xF;
        }
    }

    public void II(int n, int n2, int n3, int n4, int n5, int n6, boolean bl, int n7) {
        this.III = n3;
        this.IIII = n4;
        this.II = n2;
        this.IIO1 = n5;
        this.IIO_ = n6;
        this.var_boolean_IIlI = true;
        this.IIl = 1;
        this.IIO0 = n * n2 - n6;
        if (this.IIO0 < 0) {
            this.IIO0 = 0;
        }
        if (this.IoII < 0) {
            this.IoII = 0;
        }
    }

    public void IIO(int n) {
        if (this.var_boolean_IIlI) {
            this.I_O0 = n -= (this.IIO_ - this.II) / 2;
            if (this.I_O0 < 0) {
                this.I_O0 = 0;
            }
            if (this.I_O0 > this.IIO0) {
                this.I_O0 = this.IIO0;
                return;
            }
        } else {
            this.II0I = n -= (this.IIO1 - this.II) / 2;
            if (this.II0I < 0) {
                this.II0I = 0;
            }
            if (this.II0I > this.IoII) {
                this.II0I = this.IoII;
            }
        }
    }
}

