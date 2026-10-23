package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class IOl1 {
    public static I_lO IlI1 = new I_lO(IOl1.I1I1("\u1837\u1834\u181a\u18f2\u18d8\u18ac\u1894\u1968\u194d", 6209));
    public int var_int_I1;
    public int I1I;
    private int IIOI;
    public int IoI_;
    public boolean I0OO;
    public int l101;
    public int I1l;
    private int IIO_;
    private int IoII;
    private static Image[] IIlI = new Image[5];
    private static Image var_javax_microedition_lcdui_Image_I1;
    public boolean I0O0;
    public boolean I0Oo;
    private boolean I__l = false;
    public boolean I_OI;
    private boolean I00;
    private int IIIl;
    private int III1 = 1;
    private int III_;
    private int II0l;
    private boolean I0_0;
    private boolean I00I;
    public Ilol II1_;

    public IOl1(int n, int n2, int n3, int n4, int n5, boolean bl, int n6) {
        this.var_int_I1 = n;
        this.I1I = 5;
        this.l101 = n2;
        I_Ol.II__(IOl1.I1I1("\u1815\u1825\u1833\u18db\u18ed\u1893\u18a9\u194e\u1919\u1920\u194a\u19b6", 6209) + n + IOl1.I1I1("\u1861\u1819\u1842\u18be", 6209) + n2 + IOl1.I1I1("\u1861\u1814\u1806\u18ee\u18d8\u18e1\u18db", 6209) + n5);
        this.IIOI = n3;
        this.IoI_ = n5;
        this.I0OO = bl;
        this.IIO_ = n4;
        this.IoII = n6;
        this.IIIl = 0;
        n2 = 0;
        while (n2 < 100) {
            ++n2;
            this.l101 += 12;
            if (!IOlO.boolean_IIIl(n, this.l101, 2)) continue;
            if (this.l101 % 24 == 0) break;
            this.l101 -= this.l101 % 24;
            break;
        }
        I_Ol.II__(IOl1.I1I1("\u1818\u1852\u1842\u18be", 6209) + this.l101 + IOl1.I1I1("\u186c\u184d\u1852\u18b3\u1890\u18f1\u18d6\u1937\u1914\u1975\u195a\u19bb\u1998\u19f9\u19de\u1a3f\u1a1c\u1a7d\u1a42\u1aa3\u1a80\u1ae1\u1ac6\u1b27\u1b04\u1b65\u1b4a\u1bab\u1b88\u1be9\u1bce\u1c2f\u1c0c\u1c6d\u1c72\u1c53\u1cb0\u1c91\u1cf6\u1cd7\u1d34\u1d15\u1d7a\u1d5b\u1db8\u1d99\u1dfe\u1ddf\u1e3c\u1e1d\u1e62\u1e43\u1ea0\u1e81\u1ee6\u1ec7\u1f24\u1f05\u1f6a\u1f4b\u1fa8\u1f89", 6209));
        this.I0Oo = true;
        this.I0O0 = false;
        if (this.IoII > 2) {
            this.l101 += 4;
            if (IIlI[3] == null) {
                IOl1.IIlI[3] = IO10.IIIl(IOl1.I1I1("\u186e\u180d\u181e\u18f7\u18d3\u1895\u1896\u197b\u195e\u193d\u1958\u19fb\u19cc\u1980\u1996\u1a6a\u1a45\u1a25\u1a1d\u1aeb\u1a9f\u1aa8\u1a86\u1b6b\u1b50\u1b2a\u1b06\u1bff\u1b91\u1ba5\u1bcd\u1c72\u1c4f\u1c27", 6209));
            }
            if (IIlI[4] == null) {
                IOl1.IIlI[4] = IO10.IIIl(IOl1.I1I1("\u186e\u180d\u181e\u18f7\u18d3\u1895\u1896\u197b\u195e\u193d\u1958\u19fb\u19cc\u1980\u1996\u1a6a\u1a45\u1a25\u1a1d\u1aeb\u1a9f\u1aa8\u1a86\u1b6b\u1b50\u1b2a\u1b06\u1bff\u1b91\u1ba6\u1bcd\u1c72\u1c4f\u1c27", 6209));
            }
            if (var_javax_microedition_lcdui_Image_I1 == null) {
                var_javax_microedition_lcdui_Image_I1 = IO10.IIIl(IOl1.I1I1("\u186e\u180d\u181e\u18f7\u18d3\u1895\u1896\u197b\u195e\u193d\u1958\u19fe\u19da\u19b8\u1996\u1a3c\u1a41\u1a3e\u1a08", 6209));
            }
        } else if (IIlI[n6] == null) {
            IOl1.IIlI[n6] = IO10.IIII(IOl1.I1I1("\u186e\u180d\u181e\u18f7\u18d3\u1895\u1896\u197b\u195e\u193d\u1958\u19fb\u19cc\u1980\u1996\u1a6a\u1a45\u1a25\u1a1d\u1aeb\u1a9f\u1aa8\u1a86\u1b6b\u1b50\u1b2a\u1b06\u1bff", 6209) + (n6 + 1) + IOl1.I1I1("\u186f\u1810\u1811\u18f9", 6209));
        }
        if (n > I1_I.Io1 && n < I1_I.Io1 + II.var_int_IIl && this.l101 > 100) {
            IO.II();
            IO.II();
            this.I__l = true;
            IO.II();
        }
    }

    public static void II(IOl1 iOl1) {
        IlI1.addElement(iOl1);
    }

    public void II(IO1l iO1l) {
        if (this.IoII > 2 && this.I0_0) {
            iO1l.II(var_javax_microedition_lcdui_Image_I1, this.var_int_I1, this.l101 + 20, IOII.I_Oo);
        }
    }

    public void IIIl(IO1l iO1l) {
        if (!Ilol.var_boolean_I10I && this.var_int_I1 >= I1_I.Io1 && this.var_int_I1 <= I1_I.Io1 + II.var_int_IIl) {
            I_O1 i_O1 = I1_I.var_I_O1_arr_II[this.IIOI];
            int n = 0;
            int n2 = 0;
            if (this.IoII == 0) {
                n = 15;
                n2 = 40;
            }
            if (this.IoII == 1) {
                n = 7;
                n2 = 55;
            }
            if (this.IoII == 2) {
                n = 18;
                n2 = 52;
            }
            if (this.I00 && this.IoII < 3) {
                I_oo.IIII(iO1l, i_O1.II[Ilol.var_int_arr_arr_arr_II[0][0][0]].II1o, this.var_int_I1 + (this.IIO_ == 1 ? n : -n), this.I1I - n2, this.IIO_ == 1 ? 0 : 2, IOII.II0I);
            }
            if (this.IoII < 3) {
                iO1l.II(IIlI[this.IoII], 0, 0, IO1l.II(IIlI[this.IoII]), IO1l.III(IIlI[this.IoII]), this.IIO_ == 1 ? 2 : 0, this.var_int_I1, this.I1I, IOII.I_Oo);
            } else if (this.I0Oo) {
                if (this.IIIl > 10) {
                    iO1l.II(IIlI[4], 0, 0, IO1l.II(IIlI[4]), IO1l.III(IIlI[4]), this.IIO_ == 1 ? 2 : 0, this.IIO_ == 1 ? this.var_int_I1 - 11 : this.var_int_I1 + 11, this.I1I + 2, IOII.I_Oo);
                } else {
                    iO1l.II(IIlI[3], 0, 0, IO1l.II(IIlI[3]), IO1l.III(IIlI[3]), this.IIO_ == 1 ? 2 : 0, this.var_int_I1, this.I1I, IOII.I_Oo);
                }
            } else if (this.IIIl < 20) {
                iO1l.II(IIlI[4], 0, 0, IO1l.II(IIlI[4]), IO1l.III(IIlI[4]), this.IIO_ == 1 ? 2 : 0, this.IIO_ == 1 ? this.var_int_I1 - 11 : this.var_int_I1 + 11, this.I1I + 2, IOII.I_Oo);
            } else {
                iO1l.II(IIlI[3], 0, 0, IO1l.II(IIlI[3]), IO1l.III(IIlI[3]), this.IIO_ == 1 ? 2 : 0, this.var_int_I1, this.I1I, IOII.I_Oo);
            }
        }
    }

    public void IIl1() {
        Il_1.II(this);
        if (this.IoII > 2 && this.I_OI && this.I1I != -80) {
            if (this.I0Oo && this.IIIl == 0) {
                if (II.var_int_IIIO % 3 == 0) {
                    I_0.II(1, this.var_int_I1, this.I1I, 1, 0);
                }
            } else if (this.I0O0 && II.var_int_IIIO % 3 == 0) {
                I_0.II(1, this.var_int_I1, this.I1I + 16, 1, 1);
            }
        }
        ++this.III_;
        if (this.III_ > 3) {
            this.III_ = 0;
        }
        if (this.I0Oo) {
            this.I_OI = true;
            boolean bl = this.I00 = this.IoI_ != 0;
            if (this.IoII < 3) {
                int n = this.l101 - this.I1I >> 3;
                if (n <= 0) {
                    n = 1;
                    this.I_OI = false;
                }
                this.I1I += n;
            } else {
                if (II.var_int_IIIO % 2 == 0) {
                    ++this.III1;
                }
                if (this.l101 - this.I1I < this.III1) {
                    this.I1I = this.l101;
                    this.I_OI = false;
                } else {
                    this.I1I += this.III1;
                }
            }
            if (this.I0OO && this.IoI_ == 1 && Ilol.Ilol_II().I11) {
                Ilol.Ilol_II().I_o_ = this.var_int_I1;
                Ilol.Ilol_II().I_oO = this.I1I - 30;
                Ilol.Ilol_II().IOIl = 4;
                I1_I.Io10 = this.var_int_I1 - I1_I.var_int_IIOI;
                I1_I.Io1o = this.I1I - I1_I.var_int_IIOl - 1;
                I1_I.var_I1Oo_II.IO0 = false;
            }
            if (I1_I.Ilol_II(this.I1l) != null && !this.I0OO && this.IoI_ == 1 && I1_I.Ilol_II((int)this.I1l).I11) {
                I1_I.Ilol_II((int)this.I1l).I_o_ = this.var_int_I1;
                I1_I.Ilol_II((int)this.I1l).I_oO = this.I1I - 30;
                I1_I.Ilol_II((int)this.I1l).IOIl = 4;
            }
            if (I_Ol.II1(this.I1I - this.l101) < 50 && IOlO.boolean_IIIl(this.var_int_I1, this.I1I, 2)) {
                this.I0_0 = true;
                if (this.IoII < 3) {
                    IO.II();
                    if (this.I1I % 24 != 0) {
                        this.I1I -= this.I1I % 24;
                    }
                    ++this.IIIl;
                    if (this.IIIl > 10) {
                        this.IIIl = 0;
                        this.I0Oo = false;
                        this.I0O0 = true;
                        this.I_OI = false;
                    }
                    if (this.IoI_ == 1) {
                        if (this.I0OO) {
                            Ilol.Ilol_II().I11 = false;
                        } else if (I1_I.Ilol_II(this.I1l) != null) {
                            I1_I.Ilol_II((int)this.I1l).I11 = false;
                        }
                        this.I00 = false;
                    }
                } else {
                    this.I1I = this.l101;
                    if (!this.I00I) {
                        I_0.II(92, this.var_int_I1 + 4, this.I1I + 14, 1, 0);
                        I1_I.lII1 = 10;
                        this.I00I = true;
                    }
                    ++this.IIIl;
                    if (this.IIIl > 30) {
                        this.IIIl = 0;
                        this.I0Oo = false;
                        this.I0O0 = true;
                        this.I_OI = false;
                    }
                    if (this.IoI_ == 1) {
                        if (this.I0OO) {
                            Ilol.Ilol_II().I11 = false;
                        } else if (I1_I.Ilol_II(this.I1l) != null) {
                            I1_I.Ilol_II((int)this.I1l).I11 = false;
                        }
                        this.I00 = false;
                    }
                }
            }
        } else if (this.I0O0) {
            ++this.IIIl;
            if (this.IIIl > 30) {
                int n = this.l101 + 24 - this.I1I >> 3;
                if (n > 30) {
                    n = 30;
                }
                this.I1I -= n;
                this.I_OI = true;
            } else {
                if (this.IIIl == 14 && this.I__l) {
                    IO.II();
                }
                if (this.IIIl > 0 && this.IoI_ == 0) {
                    if (this.I0OO) {
                        Ilol.Ilol_II().I11 = false;
                        if (Ilol.Ilol_II().IOIl != 14) {
                            Ilol.Ilol_II().IOIl = 3;
                        }
                        Ilol.Ilol_II().I_oo = -3;
                    } else if (I1_I.Ilol_II(this.I1l) != null) {
                        I1_I.Ilol_II((int)this.I1l).I11 = false;
                        if (I1_I.Ilol_II((int)this.I1l).IOIl != 14) {
                            I1_I.Ilol_II((int)this.I1l).IOIl = 3;
                        }
                        I1_I.Ilol_II((int)this.I1l).I_oo = -3;
                    }
                    this.I00 = false;
                }
                if (this.IIIl > 12 && this.IoI_ == 0) {
                    if (this.I0OO) {
                        Ilol.Ilol_II().I11 = true;
                    } else if (I1_I.Ilol_II(this.I1l) != null) {
                        I1_I.Ilol_II((int)this.I1l).I_o_ = this.var_int_I1;
                        I1_I.Ilol_II((int)this.I1l).I_oO = this.I1I;
                        I1_I.Ilol_II((int)this.I1l).I11 = true;
                    }
                    this.I00 = true;
                }
            }
            if (this.I0OO) {
                if (this.IoI_ == 0) {
                    I1_I.Io10 = this.var_int_I1 - I1_I.var_int_IIOI;
                    I1_I.Io1o = this.I1I - I1_I.var_int_IIOl - 1;
                }
                if (this.IoI_ == 1) {
                    I1_I.var_I1Oo_II.IO0 = true;
                }
            }
            if (this.I1I <= -80) {
                if (this.I0OO && this.IoI_ == 0) {
                    I1I1.I___ = false;
                    Ilol.I1Oo = true;
                }
                if (!this.I0OO && this.II1_ != null && this.IoI_ == 0) {
                    I1_I.var_I_lO_II_O.removeElement(this.II1_);
                }
                if (this.IoII < 3) {
                    IlI1.removeElement(this);
                } else {
                    this.I1I = -80;
                    ++this.II0l;
                    if (this.II0l > 80) {
                        this.II0l = 0;
                        IlI1.removeElement(this);
                    }
                }
            }
        }
        if (this.I_OI && this.IoII < 3 && I_Ol.II1(this.I1I - this.l101) <= 50 && II.var_int_IIIO % 5 == 0) {
            I1lI.III(new I1ll(19, this.var_int_I1, this.l101 + 20, 2, 1, -1));
        }
    }

    private static /* synthetic */ String I1I1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

