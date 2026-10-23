package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I1IO
extends IO1_
implements I1_1 {
    public static I1IO var_I1IO_II;
    private Il00[] var_Il00_arr_II;
    private byte II1O = 0;
    private byte II10;
    private int IIO;
    private int IIOI;
    private int IIOl;
    private int IIlI;
    private int IIO1;
    private int IIO_;
    private int IoII;
    private int IIO0;
    private int IIOo;
    private int II0;
    private int var_int_II;
    private int III;
    private int IIII;
    private int IIIl;
    private int var_int_III1;
    private int III_;
    private int II0l = 0;
    private int Iol = 0;
    private int var_int_IIl;
    private int I1;
    private int[] Il1l;
    private int[] Il11;
    private int[] Il1_;
    private int[] Il1O;
    private short[] var_short_arr_III1;
    private long IlOl;
    private long IlO1;
    private boolean I__O;
    private boolean I__0;
    private boolean I_1_;
    private short II1_;
    private static int I1OO;
    private static int[] Il10;
    private static I11o var_I11o_IIIo;
    private static I11o var_I11o_IIl;
    private static Image II1;
    private static Image II1I;
    private byte[] III0 = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
    private byte[] var_byte_arr_IIIo = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};

    public I1IO() {
        int[] nArray = new int[2];
        Il10 = nArray;
        nArray[0] = 16;
        I1OO = II.var_int_IIlI - 41;
        I1IO.Il10[1] = II.var_int_IIl - 40;
        Image image = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4da\uc481\uc4cc\uc532\uc54b\uc534\uc51e", 50274));
        var_I11o_IIIo = new I11o(image, 30, 30);
        image = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4da\uc481\uc4cd\uc532\uc54b\uc534\uc51e", 50274));
        var_I11o_IIl = new I11o(image, 68, 65);
        image = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4da\uc481\uc4cf\uc532\uc54b\uc534\uc51e", 50274));
        new I11o(image, 66, 70);
        II1I = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4d1\uc4ab\uc489\uc52e\uc515\uc52a\uc517\uc5ff", 50274));
        II1 = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4d1\uc4ab\uc489\uc52f\uc515\uc52a\uc517\uc5ff", 50274));
        this.IIII = 230;
        this.var_int_II = II.var_int_IIll - this.IIII / 2;
        this.IIIl = 40;
        this.III = -this.IIIl;
    }

    public static I1IO I1IO_II() {
        if (var_I1IO_II == null) {
            var_I1IO_II = new I1IO();
        }
        return var_I1IO_II;
    }

    public void II(short[] sArray, byte by, int n, short s) {
        if (sArray != null && sArray.length > 0) {
            int n2;
            this.IoII = Ilol.Ilol_II().I_oO - 10;
            this.IIO = II.var_int_IIl1 / 3 + 10;
            if (this.IIO > 50) {
                this.IIO = 50;
            }
            this.IIOI = 360;
            I1_I.Io1 = I1_I.Io_ / 2;
            this.IIOl = I1_I.Io1I + II.var_int_IIl1 / 3 + 30;
            this.IIO_ = 175;
            this.IIlI = 0;
            this.IIO1 = 360 / this.IIO_;
            this.Il1l = new int[this.IIO_];
            this.Il11 = new int[this.IIO_];
            this.Il1_ = new int[this.IIO_];
            this.Il1O = new int[this.IIO_];
            I1IO i1IO = this;
            if (!II.var_boolean_II) {
                for (n2 = 0; n2 < i1IO.Il11.length; ++n2) {
                    i1IO.Il11[n2] = I_Ol.II1(i1IO.IIO * I_Ol.IIll(i1IO.IIlI) / 1024);
                    i1IO.Il1l[n2] = I_Ol.II1(i1IO.IIO * I_Ol.IIl1(i1IO.IIlI) / 1024);
                    if (i1IO.IIlI < 90) {
                        i1IO.Il1_[n2] = i1IO.IIOI + i1IO.Il1l[n2];
                        i1IO.Il1O[n2] = i1IO.IIOl - i1IO.Il11[n2];
                    } else if (i1IO.IIlI >= 90 && i1IO.IIlI < 180) {
                        i1IO.Il1_[n2] = i1IO.IIOI - i1IO.Il1l[n2];
                        i1IO.Il1O[n2] = i1IO.IIOl - i1IO.Il11[n2];
                    } else if (i1IO.IIlI >= 180 && i1IO.IIlI < 270) {
                        i1IO.Il1_[n2] = i1IO.IIOI - i1IO.Il1l[n2];
                        i1IO.Il1O[n2] = i1IO.IIOl + i1IO.Il11[n2];
                    } else {
                        i1IO.Il1_[n2] = i1IO.IIOI + i1IO.Il1l[n2];
                        i1IO.Il1O[n2] = i1IO.IIOl + i1IO.Il11[n2];
                    }
                    i1IO.IIlI += i1IO.IIO1;
                }
            }
            this.var_Il00_arr_II = new Il00[sArray.length];
            for (n2 = 0; n2 < this.var_Il00_arr_II.length; ++n2) {
                this.var_Il00_arr_II[n2] = new Il00();
                this.var_Il00_arr_II[n2].IIO1 = sArray[n2];
                this.var_Il00_arr_II[n2].IIO = n2 * 25;
                this.var_Il00_arr_II[n2].I_0 = -999;
                this.var_Il00_arr_II[n2].IIOl = I_Ol.III_(2, 5);
                this.var_Il00_arr_II[n2].IIlI = I_Ol.III_(-1, 2);
                Il00 il00 = this.var_Il00_arr_II[n2];
                this.var_Il00_arr_II[n2].IIII = new Ilol();
                il00.IIII.IOI_ = I_Ol.III_(-999, -800);
                il00.IIII.I0 = -1;
                il00.IIII.I0II = -1;
                il00.IIII.I0I = -1;
                il00.IIII.I0Il = -1;
                il00.IIII.IIO1 = "";
                il00.IIII.IOlo = 20;
                il00.IIII.IOl_ = 20;
            }
            this.I__0 = false;
            this.I__O = false;
            this.I_1_ = false;
            this.IlOl = II.var_long_II + (long)I_Ol.III_(1000, 2000);
            this.II1O = 0;
            this.IIO0 = -1;
            this.IIOo = -1;
            this.II10 = by;
            this.var_int_III1 = n;
            this.III_ = 0;
            Ilol.Ilol_II().III(470, 408, 1);
            Ilol.Ilol_II().IOI1 = 2;
            Ilol.Ilol_II().IOIl = 1;
            this.II0l = 0;
            this.Iol = 0;
            this.var_int_IIl = 0;
            this.I1 = 0;
            this.III = -this.IIIl;
            this.II1_ = s;
            this.II0 = 0;
            this.IOlO();
            this.I0l_();
            IO.II();
        }
    }

    @Override
    public void II(int n, Object object) {
    }

    @Override
    public void void_IIlO() {
        try {
            Il00 il00;
            int n;
            this.III_ = this.var_int_III1 * this.III();
            this.IOlO();
            I1_I.I1_I_II().void_IIlO();
            if (this.IlOl - II.var_long_II > 0L) {
                for (int i = 0; i < this.var_Il00_arr_II.length; ++i) {
                    Il00 il002 = this.var_Il00_arr_II[i];
                    il002.IIO += 2;
                    if (this.var_Il00_arr_II[i].IIO >= this.IIO_) {
                        this.var_Il00_arr_II[i].IIO = 0;
                    }
                    this.var_Il00_arr_II[i].II0I = this.Il1_[this.var_Il00_arr_II[i].IIO];
                    this.var_Il00_arr_II[i].I_O0 = this.Il1O[this.var_Il00_arr_II[i].IIO];
                }
                return;
            }
            if (this.II1O == 0) {
                this.II1O = 1;
            }
            if (this.II1O == 1) {
                for (n = 0; n < this.var_Il00_arr_II.length; ++n) {
                    if (this.var_Il00_arr_II[n].I_0 == -999 || this.var_Il00_arr_II[n].I1lI) continue;
                    if (this.var_Il00_arr_II[n].I_O0 < this.var_Il00_arr_II[n].I_0) {
                        if (this.var_Il00_arr_II[n].IIOI < 0) {
                            this.var_Il00_arr_II[n].IIOI = 0;
                        }
                        if (this.var_Il00_arr_II[n].I_O0 + this.var_Il00_arr_II[n].IIOI > this.var_Il00_arr_II[n].I_0) {
                            this.var_Il00_arr_II[n].I_O0 = this.var_Il00_arr_II[n].I_0;
                        } else {
                            il00 = this.var_Il00_arr_II[n];
                            il00.I_O0 += this.var_Il00_arr_II[n].IIOI;
                        }
                        ++this.var_Il00_arr_II[n].IIOI;
                    } else {
                        if (this.var_Il00_arr_II[n].IIOI > 0) {
                            this.var_Il00_arr_II[n].IIOI = 0;
                        }
                        il00 = this.var_Il00_arr_II[n];
                        il00.I_O0 += this.var_Il00_arr_II[n].IIOI;
                        --this.var_Il00_arr_II[n].IIOI;
                    }
                    if (this.var_Il00_arr_II[n].I_O0 != this.var_Il00_arr_II[n].I_0) continue;
                    I1lI.III(new I1ll(19, this.var_Il00_arr_II[n].II0I - 5, this.var_Il00_arr_II[n].I_O0 + 25, 2, 1, -1));
                    IO.II();
                    this.var_Il00_arr_II[n].I1lI = true;
                    if (this.I__0) continue;
                    this.I__0 = true;
                }
            }
            if (this.II1O == 2) {
                for (n = 0; n < this.var_Il00_arr_II.length; ++n) {
                    if (this.var_Il00_arr_II[n].I1lI) continue;
                    if (this.var_Il00_arr_II[n].I_O0 > -10) {
                        if (this.var_Il00_arr_II[n].IIOI > 0) {
                            this.var_Il00_arr_II[n].IIOI = 0;
                        }
                        il00 = this.var_Il00_arr_II[n];
                        il00.I_O0 += this.var_Il00_arr_II[n].IIOI;
                        --this.var_Il00_arr_II[n].IIOI;
                        il00 = this.var_Il00_arr_II[n];
                        il00.II0I += this.var_Il00_arr_II[n].IIOl * this.var_Il00_arr_II[n].IIlI;
                        il00 = this.var_Il00_arr_II[n];
                        il00.IIOl -= 3;
                    }
                    if (this.var_Il00_arr_II[n].I_O0 != -10) continue;
                    this.var_Il00_arr_II[n].I1l = false;
                }
                ++this.II0l;
                if (this.II0l > this.III0.length - 1) {
                    this.II0l = this.III0.length - 1;
                    this.I__O = true;
                    IO.II();
                    if (!this.I_1_ && this.IlO1 - II.var_long_II < 0L) {
                        I_0_.II().IIIl((byte)2, (byte)(this.byte_II() + this.III()));
                        this.I_1_ = true;
                    }
                }
                Ilol.Ilol_II().IO10 = this.III0[this.II0l];
                ++this.Iol;
                if (this.Iol > 5) {
                    this.Iol = 0;
                }
                this.var_int_IIl = this.var_byte_arr_IIIo[this.Iol];
            }
            if (this.II1O == 3) {
                if (this.Iol <= 5) {
                    this.Iol = 5;
                }
                ++this.Iol;
                if (this.Iol > this.var_byte_arr_IIIo.length - 1) {
                    this.Iol = this.var_byte_arr_IIIo.length - 1;
                    this.II1O = (byte)4;
                    this.I__O = false;
                    n = 0;
                    for (int i = 0; i < this.var_Il00_arr_II.length; ++i) {
                        if (!this.var_Il00_arr_II[i].I1lI || this.var_Il00_arr_II[i].I1ll) continue;
                        this.var_Il00_arr_II[i].IIO1 = this.var_short_arr_III1[n];
                        this.var_Il00_arr_II[i].I1ll = true;
                        ++n;
                    }
                }
                this.var_int_IIl = this.var_byte_arr_IIIo[this.Iol];
            }
            if (this.II1O == 4) {
                for (n = 0; n < this.var_Il00_arr_II.length; ++n) {
                    if (!this.var_Il00_arr_II[n].I1l) continue;
                    this.var_Il00_arr_II[n].I_Oo = Ilol.Ilol_II().I_o_;
                }
                this.II1O = (byte)5;
            }
            if (this.II1O == 5) {
                ++this.I1;
                if (this.III < II.var_int_IIl1 / 3) {
                    this.III = this.III + this.I1 > II.var_int_IIl1 / 3 ? II.var_int_IIl1 / 3 : (this.III += this.I1);
                }
                for (n = 0; n < this.var_Il00_arr_II.length; ++n) {
                    if (!this.var_Il00_arr_II[n].I1l) continue;
                    if (this.var_Il00_arr_II[n].II0I < this.var_Il00_arr_II[n].I_Oo) {
                        if (this.var_Il00_arr_II[n].IIOl < 0) {
                            this.var_Il00_arr_II[n].IIOl = 0;
                        }
                        if (this.var_Il00_arr_II[n].II0I + this.var_Il00_arr_II[n].IIOl > this.var_Il00_arr_II[n].I_Oo) {
                            this.var_Il00_arr_II[n].II0I = this.var_Il00_arr_II[n].I_Oo;
                        } else {
                            il00 = this.var_Il00_arr_II[n];
                            il00.II0I += this.var_Il00_arr_II[n].IIOl;
                        }
                        ++this.var_Il00_arr_II[n].IIOl;
                    } else {
                        if (this.var_Il00_arr_II[n].IIOl > 0) {
                            this.var_Il00_arr_II[n].IIOl = 0;
                        }
                        il00 = this.var_Il00_arr_II[n];
                        il00.II0I += this.var_Il00_arr_II[n].IIOl;
                        --this.var_Il00_arr_II[n].IIOl;
                    }
                    if (this.var_Il00_arr_II[n].II0I != this.var_Il00_arr_II[n].I_Oo) continue;
                    this.var_Il00_arr_II[n].I1l = false;
                }
                return;
            }
        }
        catch (Exception exception) {
            System.out.println(I1IO.IlII("\uc44f\uc4f4\uc4d0\uc4db\uc4f3\uc4d0\uc572\uc54e\uc536\uc515\uc5a2\uc597", 50274) + exception.toString());
        }
    }

    @Override
    public void I_Il() {
        if (!I1OO.I1l1) {
            if (II.var_boolean_IIIl && !Ilo_.II().I_10 && !II.var_I_II_II.IOol) {
                int n;
                I1IO i1IO = this;
                if (this.II1O == 1 && II.var_boolean_III0) {
                    for (n = 0; n < i1IO.var_Il00_arr_II.length; ++n) {
                        if (!II.II(i1IO.var_Il00_arr_II[n].II0I - 20 - I1_I.Io1, i1IO.var_Il00_arr_II[n].I_O0 - 10 - I1_I.Io1I, 30, 30) || !II.var_boolean_III0 || !II.var_boolean_IIIo) continue;
                        i1IO.II(n);
                    }
                }
                if (II.var_boolean_III0) {
                    for (n = 0; n < Il10.length; ++n) {
                        if (!II.II(Il10[n], I1OO, 36, 36) || !II.var_boolean_III0 || !II.var_boolean_IIIo) continue;
                        i1IO.IIII(n);
                    }
                }
            }
            for (int i = 1; i < 8; ++i) {
                if (!II.var_boolean_arr_II[i]) continue;
                II.var_boolean_arr_II[i] = false;
                this.II(i - 1);
            }
            if (II.var_boolean_arr_II[12]) {
                II.var_boolean_arr_II[12] = false;
                this.IIII(0);
            }
            if (II.var_boolean_arr_II[13]) {
                II.var_boolean_arr_II[13] = false;
                this.IIII(1);
            }
            II.IIIl();
        }
    }

    private void II(int n) {
        if (!this.var_Il00_arr_II[n].I1lI) {
            long l;
            IO.II();
            long l2 = l = this.II10 == 0 ? Ilol.Ilol_II().Il11 : (long)Ilol.Ilol_II().II10();
            if (this.byte_II() >= this.II0 && l < (long)(this.III_ + this.var_int_III1)) {
                String string = IO11.Il01 + I1IO.IlII("\uc442", 50274) + (this.II10 == 0 ? IO11.I_1_ : IO11.I_1O);
                I1_I.var_I1Oo_II.IIII(string, 0);
            } else {
                this.IIO0 = n;
                this.var_Il00_arr_II[this.IIO0].I_0 = this.IoII + I_Ol.III_(-3, 3);
            }
        }
    }

    private void IIII(int n) {
        this.IIOo = n;
        if (n == 0) {
            if (this.II1O < 2) {
                if (this.byte_II() + this.III() > 0) {
                    this.II1O = (byte)2;
                    IO.II();
                    Ilol.Ilol_II().II(I1_I.var_I_ol_arr_II[13], 0);
                    this.IlO1 = II.var_long_II + (long)I_Ol.III_(2000, 3000);
                    return;
                }
            } else if (this.III == II.var_int_IIl1 / 3) {
                I_0_.II().IIIl(this.II10, (byte)0);
                return;
            }
        } else {
            I1_I.I1_I_II().IO1l = false;
            I1_I.I1_I_II().I0l_();
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        try {
            int n;
            int n2;
            I1_I.I1_I_II().III_(iO1l);
            iO1l.IIl0(-I1_I.Io1, -I1_I.Io1I);
            iO1l.IIl0(0, II.II10);
            for (n2 = 0; n2 < this.var_Il00_arr_II.length; ++n2) {
                if (!this.var_Il00_arr_II[n2].I1l || this.var_Il00_arr_II[n2].I_O0 <= this.var_Il00_arr_II[n2].I_0 - 20) continue;
                iO1l.II(IOlO.IIlI, this.var_Il00_arr_II[n2].II0I, this.var_Il00_arr_II[n2].I_0 + 7, 3);
            }
            for (n2 = 0; n2 < this.var_Il00_arr_II.length; ++n2) {
                if (!this.var_Il00_arr_II[n2].I1l) continue;
                I_oo.IIII(iO1l, this.var_Il00_arr_II[n2].IIO1, this.var_Il00_arr_II[n2].II0I, this.var_Il00_arr_II[n2].I_O0, 0, 3);
            }
            if (this.I__O) {
                if (var_I11o_IIIo != null) {
                    n2 = Ilol.Ilol_II().I_o_ - I1IO.var_I11o_IIIo.II0I - 28;
                    for (n = 0; n < II.var_int_IIl / I1IO.var_I11o_IIIo.II0I + 1; ++n) {
                        var_I11o_IIIo.II(this.var_int_IIl, n2 - n * (I1IO.var_I11o_IIIo.II0I - 1), Ilol.Ilol_II().I_oO - I1IO.var_I11o_IIIo.I_O0 / 2 - 12 + 2, 0, 0, iO1l);
                    }
                }
                if (var_I11o_IIl != null) {
                    n2 = Ilol.Ilol_II().I_o_ - I1IO.var_I11o_IIl.II0I - 10;
                    var_I11o_IIl.II(this.var_int_IIl, n2 - 5, Ilol.Ilol_II().I_oO - I1IO.var_I11o_IIl.I_O0 / 2 - 12, 0, 0, iO1l);
                }
            }
            I1_I.II1I(iO1l);
            n = II.var_int_IIl - 240;
            iO1l.Illl(13524492);
            iO1l.III_(n, 0, 240, 15);
            iO1l.II(I_1o.IloI, n + 11, 8, 3);
            iO1l.II(I_1o.Ilo1, n + 90, 7, 3);
            IO1I.IIl_.II(iO1l, Ilol.Ilol_II().var_java_lang_String_IIO, n + 24, 2, 0, IO1I.IIlO);
            IO1I.IIl_.II(iO1l, Ilol.Ilol_II().var_java_lang_String_IIOI, n + 100, 2, 0, IO1I.IIlO);
            iO1l.II(I_1o.Ilo_, n + 150, 8, 3);
            IO1I.IIl_.II(iO1l, Ilol.Ilol_II().var_java_lang_String_IIOl, n + 160, 2, 0, IO1I.IIlO);
            iO1l.II(I_1o.Ilol, n + 200, 8, 3);
            IO1I.IIl_.II(iO1l, String.valueOf(this.II0), n + 210, 2, 0, IO1I.IIlO);
            if (this.II1O < 4) {
                n = II.var_int_IIl - 140;
                iO1l.Illl(11837316);
                iO1l.III_(n, 15, 140, 15);
                if (this.II10 == 0) {
                    iO1l.II(I_1o.IloI, n + 21, 23, 3);
                } else {
                    iO1l.II(I_1o.Ilo_, n + 21, 22, 3);
                    iO1l.II(I_1o.Ilo1, n + 18, 22, 3);
                }
                IO1I.IIl0.II(iO1l, I1IO.IlII("\uc44f", 50274) + this.III_, n + 30, 17, 0, IO1I.IIlO);
                iO1l.II(I_1o.Ilol, n + 80, 22, 3);
                IO1I.IIl0.II(iO1l, I1IO.IlII("\uc44f", 50274) + this.byte_II(), n + 90, 17, 0, IO1I.IIlO);
            }
            iO1l.II(I1_I.IIoo, Il10[0], I1OO, 0);
            if (this.IIOo == 0) {
                iO1l.II(I1_I.Il, Il10[0], I1OO, 0);
            }
            if (this.II1O < 3) {
                I_oo.IIII(iO1l, 540, Il10[0] + 14, I1OO + 14, 0, IOII.IIOI);
            } else {
                iO1l.II(II1I, Il10[0] + 14 - 10, I1OO + 14 - 10, 0);
            }
            iO1l.II(I1_I.IIoo, Il10[1], I1OO, 0);
            if (this.IIOo == 1) {
                iO1l.II(I1_I.Il, Il10[1], I1OO, 0);
            }
            iO1l.II(II1, Il10[1] + 14 - 10, I1OO + 14 - 10, 0);
            if (this.II1O > 3) {
                I_10.IIII(this.var_int_II, this.III, this.IIII, this.IIIl, iO1l);
                n2 = II.var_int_IIll - this.var_short_arr_III1.length * 30 / 2;
                for (n = 0; n < this.var_short_arr_III1.length; ++n) {
                    I_oo.IIII(iO1l, this.var_short_arr_III1[n], n2 + 5 + n * 30, this.III + 10, 0, 0);
                }
                return;
            }
        }
        catch (Exception exception) {
            System.out.println(I1IO.IlII("\uc44f\uc4f1\uc4c1\uc4d6\uc4b0\uc489\uc531\uc516\uc534\uc50c\uc5f4\uc5db\uc5ec\uc5d5", 50274) + exception.toString());
        }
    }

    public void II(short[] sArray) {
        this.II1O = (byte)3;
        this.var_short_arr_III1 = sArray;
    }

    @Override
    public void I0l_() {
        I1_I.I_1o = true;
        I1_I.I1_I_II().IO1l = true;
        super.I0l_();
    }

    private byte byte_II() {
        byte by = 0;
        for (int i = 0; i < this.var_Il00_arr_II.length; ++i) {
            if (!this.var_Il00_arr_II[i].I1lI) continue;
            by = (byte)(by + 1);
        }
        if (by > this.II0) {
            by = (byte)this.II0;
        }
        return by;
    }

    private byte III() {
        byte by = 0;
        for (int i = 0; i < this.var_Il00_arr_II.length; ++i) {
            if (!this.var_Il00_arr_II[i].I1lI) continue;
            by = (byte)(by + 1);
        }
        if ((by = (byte)(by - this.byte_II())) <= 0) {
            by = 0;
        }
        return by;
    }

    private void IOlO() {
        for (int i = 0; i < Ilol.Ilol_II().var_I101_arr_II.length; ++i) {
            if (Ilol.Ilol_II().var_I101_arr_II[i] == null || Ilol.Ilol_II().var_I101_arr_II[i].var_I1o_II.II__ != this.II1_) continue;
            this.II0 = Ilol.Ilol_II().var_I101_arr_II[i].I1l1;
            return;
        }
    }

    private static /* synthetic */ String IlII(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

