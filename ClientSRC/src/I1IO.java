/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class I1IO
extends IO1_
implements I1_1 {
    public static I1IO II;
    private Il00[] II;
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
    private int II;
    private int III;
    private int IIII;
    private int IIIl;
    private int III1;
    private int III_;
    private int II0l = 0;
    private int Iol = 0;
    private int IIl;
    private int I1;
    private int[] Il1l;
    private int[] Il11;
    private int[] Il1_;
    private int[] Il1O;
    private short[] III1;
    private long IlOl;
    private long IlO1;
    private boolean I__O;
    private boolean I__0;
    private boolean I_1_;
    private short II1_;
    private static int I1OO;
    private static int[] Il10;
    private static I11o IIIo;
    private static I11o IIl;
    private static Image II1;
    private static Image II1I;
    private byte[] III0 = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
    private byte[] IIIo = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};

    public I1IO() {
        int[] nArray = new int[2];
        Il10 = nArray;
        nArray[0] = 16;
        I1OO = II.IIlI - 41;
        I1IO.Il10[1] = II.IIl - 40;
        Image image = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4da\uc481\uc4cc\uc532\uc54b\uc534\uc51e", 50274));
        IIIo = new I11o(image, 30, 30);
        image = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4da\uc481\uc4cd\uc532\uc54b\uc534\uc51e", 50274));
        IIl = new I11o(image, 68, 65);
        image = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4da\uc481\uc4cf\uc532\uc54b\uc534\uc51e", 50274));
        new I11o(image, 66, 70);
        II1I = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4d1\uc4ab\uc489\uc52e\uc515\uc52a\uc517\uc5ff", 50274));
        II1 = IO10.IIII(I1IO.IlII("\uc44d\uc4e4\uc48f\uc4d1\uc4ab\uc489\uc52f\uc515\uc52a\uc517\uc5ff", 50274));
        this.IIII = 230;
        this.II = II.IIll - this.IIII / 2;
        this.IIIl = 40;
        this.III = -this.IIIl;
    }

    public static I1IO II() {
        if (II == null) {
            II = new I1IO();
        }
        return II;
    }

    public void II(short[] sArray, byte by, int n, short s) {
        if (sArray != null && sArray.length > 0) {
            int n2;
            this.IoII = Ilol.II().I_oO - 10;
            this.IIO = II.IIl1 / 3 + 10;
            if (this.IIO > 50) {
                this.IIO = 50;
            }
            this.IIOI = 360;
            I1_I.Io1 = I1_I.Io_ / 2;
            this.IIOl = I1_I.Io1I + II.IIl1 / 3 + 30;
            this.IIO_ = 175;
            this.IIlI = 0;
            this.IIO1 = 360 / this.IIO_;
            this.Il1l = new int[this.IIO_];
            this.Il11 = new int[this.IIO_];
            this.Il1_ = new int[this.IIO_];
            this.Il1O = new int[this.IIO_];
            I1IO i1IO = this;
            if (!II.II) {
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
            this.II = new Il00[sArray.length];
            for (n2 = 0; n2 < this.II.length; ++n2) {
                this.II[n2] = new Il00();
                this.II[n2].IIO1 = sArray[n2];
                this.II[n2].IIO = n2 * 25;
                this.II[n2].I_0 = -999;
                this.II[n2].IIOl = I_Ol.III_(2, 5);
                this.II[n2].IIlI = I_Ol.III_(-1, 2);
                Il00 il00 = this.II[n2];
                this.II[n2].IIII = new Ilol();
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
            this.IlOl = II.II + (long)I_Ol.III_(1000, 2000);
            this.II1O = 0;
            this.IIO0 = -1;
            this.IIOo = -1;
            this.II10 = by;
            this.III1 = n;
            this.III_ = 0;
            Ilol.II().III(470, 408, 1);
            Ilol.II().IOI1 = 2;
            Ilol.II().IOIl = 1;
            this.II0l = 0;
            this.Iol = 0;
            this.IIl = 0;
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
    public void IIlO() {
        try {
            Il00 il00;
            int n;
            this.III_ = this.III1 * this.III();
            this.IOlO();
            I1_I.II().IIlO();
            if (this.IlOl - II.II > 0L) {
                for (int i = 0; i < this.II.length; ++i) {
                    Il00 il002 = this.II[i];
                    il002.IIO += 2;
                    if (this.II[i].IIO >= this.IIO_) {
                        this.II[i].IIO = 0;
                    }
                    this.II[i].II0I = this.Il1_[this.II[i].IIO];
                    this.II[i].I_O0 = this.Il1O[this.II[i].IIO];
                }
                return;
            }
            if (this.II1O == 0) {
                this.II1O = 1;
            }
            if (this.II1O == 1) {
                for (n = 0; n < this.II.length; ++n) {
                    if (this.II[n].I_0 == -999 || this.II[n].I1lI) continue;
                    if (this.II[n].I_O0 < this.II[n].I_0) {
                        if (this.II[n].IIOI < 0) {
                            this.II[n].IIOI = 0;
                        }
                        if (this.II[n].I_O0 + this.II[n].IIOI > this.II[n].I_0) {
                            this.II[n].I_O0 = this.II[n].I_0;
                        } else {
                            il00 = this.II[n];
                            il00.I_O0 += this.II[n].IIOI;
                        }
                        ++this.II[n].IIOI;
                    } else {
                        if (this.II[n].IIOI > 0) {
                            this.II[n].IIOI = 0;
                        }
                        il00 = this.II[n];
                        il00.I_O0 += this.II[n].IIOI;
                        --this.II[n].IIOI;
                    }
                    if (this.II[n].I_O0 != this.II[n].I_0) continue;
                    I1lI.III(new I1ll(19, this.II[n].II0I - 5, this.II[n].I_O0 + 25, 2, 1, -1));
                    IO.II();
                    this.II[n].I1lI = true;
                    if (this.I__0) continue;
                    this.I__0 = true;
                }
            }
            if (this.II1O == 2) {
                for (n = 0; n < this.II.length; ++n) {
                    if (this.II[n].I1lI) continue;
                    if (this.II[n].I_O0 > -10) {
                        if (this.II[n].IIOI > 0) {
                            this.II[n].IIOI = 0;
                        }
                        il00 = this.II[n];
                        il00.I_O0 += this.II[n].IIOI;
                        --this.II[n].IIOI;
                        il00 = this.II[n];
                        il00.II0I += this.II[n].IIOl * this.II[n].IIlI;
                        il00 = this.II[n];
                        il00.IIOl -= 3;
                    }
                    if (this.II[n].I_O0 != -10) continue;
                    this.II[n].I1l = false;
                }
                ++this.II0l;
                if (this.II0l > this.III0.length - 1) {
                    this.II0l = this.III0.length - 1;
                    this.I__O = true;
                    IO.II();
                    if (!this.I_1_ && this.IlO1 - II.II < 0L) {
                        I_0_.II().IIIl((byte)2, (byte)(this.II() + this.III()));
                        this.I_1_ = true;
                    }
                }
                Ilol.II().IO10 = this.III0[this.II0l];
                ++this.Iol;
                if (this.Iol > 5) {
                    this.Iol = 0;
                }
                this.IIl = this.IIIo[this.Iol];
            }
            if (this.II1O == 3) {
                if (this.Iol <= 5) {
                    this.Iol = 5;
                }
                ++this.Iol;
                if (this.Iol > this.IIIo.length - 1) {
                    this.Iol = this.IIIo.length - 1;
                    this.II1O = (byte)4;
                    this.I__O = false;
                    n = 0;
                    for (int i = 0; i < this.II.length; ++i) {
                        if (!this.II[i].I1lI || this.II[i].I1ll) continue;
                        this.II[i].IIO1 = this.III1[n];
                        this.II[i].I1ll = true;
                        ++n;
                    }
                }
                this.IIl = this.IIIo[this.Iol];
            }
            if (this.II1O == 4) {
                for (n = 0; n < this.II.length; ++n) {
                    if (!this.II[n].I1l) continue;
                    this.II[n].I_Oo = Ilol.II().I_o_;
                }
                this.II1O = (byte)5;
            }
            if (this.II1O == 5) {
                ++this.I1;
                if (this.III < II.IIl1 / 3) {
                    this.III = this.III + this.I1 > II.IIl1 / 3 ? II.IIl1 / 3 : (this.III += this.I1);
                }
                for (n = 0; n < this.II.length; ++n) {
                    if (!this.II[n].I1l) continue;
                    if (this.II[n].II0I < this.II[n].I_Oo) {
                        if (this.II[n].IIOl < 0) {
                            this.II[n].IIOl = 0;
                        }
                        if (this.II[n].II0I + this.II[n].IIOl > this.II[n].I_Oo) {
                            this.II[n].II0I = this.II[n].I_Oo;
                        } else {
                            il00 = this.II[n];
                            il00.II0I += this.II[n].IIOl;
                        }
                        ++this.II[n].IIOl;
                    } else {
                        if (this.II[n].IIOl > 0) {
                            this.II[n].IIOl = 0;
                        }
                        il00 = this.II[n];
                        il00.II0I += this.II[n].IIOl;
                        --this.II[n].IIOl;
                    }
                    if (this.II[n].II0I != this.II[n].I_Oo) continue;
                    this.II[n].I1l = false;
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
            if (II.IIIl && !Ilo_.II().I_10 && !II.II.IOol) {
                int n;
                I1IO i1IO = this;
                if (this.II1O == 1 && II.III0) {
                    for (n = 0; n < i1IO.II.length; ++n) {
                        if (!II.II(i1IO.II[n].II0I - 20 - I1_I.Io1, i1IO.II[n].I_O0 - 10 - I1_I.Io1I, 30, 30) || !II.III0 || !II.IIIo) continue;
                        i1IO.II(n);
                    }
                }
                if (II.III0) {
                    for (n = 0; n < Il10.length; ++n) {
                        if (!II.II(Il10[n], I1OO, 36, 36) || !II.III0 || !II.IIIo) continue;
                        i1IO.IIII(n);
                    }
                }
            }
            for (int i = 1; i < 8; ++i) {
                if (!II.II[i]) continue;
                II.II[i] = false;
                this.II(i - 1);
            }
            if (II.II[12]) {
                II.II[12] = false;
                this.IIII(0);
            }
            if (II.II[13]) {
                II.II[13] = false;
                this.IIII(1);
            }
            II.IIIl();
        }
    }

    private void II(int n) {
        if (!this.II[n].I1lI) {
            long l;
            IO.II();
            long l2 = l = this.II10 == 0 ? Ilol.II().Il11 : (long)Ilol.II().II10();
            if (this.II() >= this.II0 && l < (long)(this.III_ + this.III1)) {
                String string = IO11.Il01 + I1IO.IlII("\uc442", 50274) + (this.II10 == 0 ? IO11.I_1_ : IO11.I_1O);
                I1_I.II.IIII(string, 0);
            } else {
                this.IIO0 = n;
                this.II[this.IIO0].I_0 = this.IoII + I_Ol.III_(-3, 3);
            }
        }
    }

    private void IIII(int n) {
        this.IIOo = n;
        if (n == 0) {
            if (this.II1O < 2) {
                if (this.II() + this.III() > 0) {
                    this.II1O = (byte)2;
                    IO.II();
                    Ilol.II().II(I1_I.II[13], 0);
                    this.IlO1 = II.II + (long)I_Ol.III_(2000, 3000);
                    return;
                }
            } else if (this.III == II.IIl1 / 3) {
                I_0_.II().IIIl(this.II10, (byte)0);
                return;
            }
        } else {
            I1_I.II().IO1l = false;
            I1_I.II().I0l_();
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        try {
            int n;
            int n2;
            I1_I.II().III_(iO1l);
            iO1l.IIl0(-I1_I.Io1, -I1_I.Io1I);
            iO1l.IIl0(0, II.II10);
            for (n2 = 0; n2 < this.II.length; ++n2) {
                if (!this.II[n2].I1l || this.II[n2].I_O0 <= this.II[n2].I_0 - 20) continue;
                iO1l.II(IOlO.IIlI, this.II[n2].II0I, this.II[n2].I_0 + 7, 3);
            }
            for (n2 = 0; n2 < this.II.length; ++n2) {
                if (!this.II[n2].I1l) continue;
                I_oo.IIII(iO1l, this.II[n2].IIO1, this.II[n2].II0I, this.II[n2].I_O0, 0, 3);
            }
            if (this.I__O) {
                if (IIIo != null) {
                    n2 = Ilol.II().I_o_ - I1IO.IIIo.II0I - 28;
                    for (n = 0; n < II.IIl / I1IO.IIIo.II0I + 1; ++n) {
                        IIIo.II(this.IIl, n2 - n * (I1IO.IIIo.II0I - 1), Ilol.II().I_oO - I1IO.IIIo.I_O0 / 2 - 12 + 2, 0, 0, iO1l);
                    }
                }
                if (IIl != null) {
                    n2 = Ilol.II().I_o_ - I1IO.IIl.II0I - 10;
                    IIl.II(this.IIl, n2 - 5, Ilol.II().I_oO - I1IO.IIl.I_O0 / 2 - 12, 0, 0, iO1l);
                }
            }
            I1_I.II1I(iO1l);
            n = II.IIl - 240;
            iO1l.Illl(13524492);
            iO1l.III_(n, 0, 240, 15);
            iO1l.II(I_1o.IloI, n + 11, 8, 3);
            iO1l.II(I_1o.Ilo1, n + 90, 7, 3);
            IO1I.IIl_.II(iO1l, Ilol.II().IIO, n + 24, 2, 0, IO1I.IIlO);
            IO1I.IIl_.II(iO1l, Ilol.II().IIOI, n + 100, 2, 0, IO1I.IIlO);
            iO1l.II(I_1o.Ilo_, n + 150, 8, 3);
            IO1I.IIl_.II(iO1l, Ilol.II().IIOl, n + 160, 2, 0, IO1I.IIlO);
            iO1l.II(I_1o.Ilol, n + 200, 8, 3);
            IO1I.IIl_.II(iO1l, String.valueOf(this.II0), n + 210, 2, 0, IO1I.IIlO);
            if (this.II1O < 4) {
                n = II.IIl - 140;
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
                IO1I.IIl0.II(iO1l, I1IO.IlII("\uc44f", 50274) + this.II(), n + 90, 17, 0, IO1I.IIlO);
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
                I_10.IIII(this.II, this.III, this.IIII, this.IIIl, iO1l);
                n2 = II.IIll - this.III1.length * 30 / 2;
                for (n = 0; n < this.III1.length; ++n) {
                    I_oo.IIII(iO1l, this.III1[n], n2 + 5 + n * 30, this.III + 10, 0, 0);
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
        this.III1 = sArray;
    }

    @Override
    public void I0l_() {
        I1_I.I_1o = true;
        I1_I.II().IO1l = true;
        super.I0l_();
    }

    private byte II() {
        byte by = 0;
        for (int i = 0; i < this.II.length; ++i) {
            if (!this.II[i].I1lI) continue;
            by = (byte)(by + 1);
        }
        if (by > this.II0) {
            by = (byte)this.II0;
        }
        return by;
    }

    private byte III() {
        byte by = 0;
        for (int i = 0; i < this.II.length; ++i) {
            if (!this.II[i].I1lI) continue;
            by = (byte)(by + 1);
        }
        if ((by = (byte)(by - this.II())) <= 0) {
            by = 0;
        }
        return by;
    }

    private void IOlO() {
        for (int i = 0; i < Ilol.II().II.length; ++i) {
            if (Ilol.II().II[i] == null || Ilol.II().II[i].II.II__ != this.II1_) continue;
            this.II0 = Ilol.II().II[i].I1l1;
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

