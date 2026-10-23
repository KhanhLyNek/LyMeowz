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
public final class I_II {
    public boolean IOol;
    public I_lO II0;
    public int llII;
    public int I_Oo;
    public int I_0;
    private int IIOl;
    private int IIlI;
    private static int[] II0o;
    private static int IIO_;
    private static int IoII;
    private static int IIO0;
    private static int IIOo;
    private I1Il II1_ = new I1Il(IO11.I_lO, 0);
    private I1Il II1O = new I1Il(IO11.I_I, 0, II.IIl - 71, II.IIlI - IO1_.llo_ + 1);
    private I1Il II10 = null;
    private static Image IlO0;
    private static Image IlOo;
    private boolean I__o;
    public int IIO;
    private int III_;
    private int II0l;
    private int Iol;
    private int[] Il_ = new int[3];
    private boolean IIlI;
    private boolean IIll;
    private int Ioll;
    private int I1__;
    private boolean IOo1;
    private boolean IOo_;
    private int I1_o;
    private int I1O;
    private boolean IOoO;
    private boolean[] IIIo;

    public void II(I_lO i_lO, int n) {
        this.II(i_lO);
        this.I__o = true;
    }

    public void II(I_lO i_lO, int n, int n2) {
        this.II(i_lO);
        this.I_Oo = n;
        this.I_0 = n2;
        while (this.I_0 + this.IIlI > II.IIlI) {
            this.I_0 -= 2;
        }
    }

    public void II(I_lO i_lO) {
        if (!this.IOol) {
            int n;
            this.IOoO = false;
            this.IOo1 = false;
            this.IOo_ = false;
            this.IIO = 0;
            if (i_lO.size() == 1) {
                this.llII = 0;
                I1Il i1Il = (I1Il)i_lO.elementAt(0);
                if (i1Il != null && i1Il.IIoO.equals(IO11.IOl)) {
                    i1Il.I0lO();
                    this.IOol = false;
                    I1OO.IIl1();
                    return;
                }
            }
            IO.II();
            this.IIIo = new boolean[i_lO.size()];
            for (n = 0; n < this.IIIo.length; ++n) {
                this.IIIo[n] = false;
            }
            this.I__o = false;
            Ilo1.III = null;
            I1l1.II1_.removeAllElements();
            I1l1.II10.removeAllElements();
            I1OO.I__o();
            if (i_lO.size() != 0) {
                this.II0 = i_lO;
                this.IIOl = 60;
                this.IIlI = 60;
                for (n = 0; n < i_lO.size(); ++n) {
                    I1Il i1Il = (I1Il)i_lO.elementAt(n);
                    ((I1Il)i_lO.elementAt(n)).I__ = false;
                    IO1I.IIl_.IIII(i1Il.IIoO);
                    i1Il.IIll = IO1I.IIl_.II(i1Il.IIoO, this.IIOl - 10);
                }
                II0o = new int[i_lO.size()];
                this.I_Oo = (II.IIl - i_lO.size() * this.IIOl) / 2;
                if (this.I_Oo <= 0) {
                    this.I_Oo = 1;
                }
                this.I_0 = II.IIlI - this.IIlI - (I_10.II0I + 1) - 1;
                if (II.IIIl) {
                    this.I_0 -= 3;
                }
                this.I_0 += 27;
                for (n = 0; n < II0o.length; ++n) {
                    I_II.II0o[n] = II.IIlI;
                }
                this.IOol = true;
                this.llII = 0;
                IIO0 = this.II0.size() * this.IIOl - II.IIl;
                if (IIO0 < 0) {
                    IIO0 = 0;
                }
                IIO_ = 0;
                IoII = 0;
                IIOo = 50;
                this.III_ = i_lO.size() * this.IIOl - 1;
                if (this.III_ > II.IIl - 2) {
                    this.III_ = II.IIl - 2;
                }
                if (II.IIIl) {
                    this.llII = -1;
                }
            }
        }
    }

    public final void I0OO() {
        this.IOoO = false;
        this.IOol = false;
        I1OO.I__o();
        if (this.IOo_) {
            II.II.III1 = null;
            Ilol.II = null;
            if (II.III != null && II.III.III1 != null) {
                II.III.III1 = null;
            }
        } else if (this.IOo1) {
            I1Il i1Il;
            II.II.III1 = null;
            if (II.III != null && II.III.III1 != null) {
                II.III.III1 = null;
            }
            if (this.llII >= 0 && (i1Il = (I1Il)this.II0.elementAt(this.llII)) != null) {
                IO.II();
                i1Il.I0lO();
            }
        }
    }

    public final void I0O0() {
        I1Il i1Il;
        if (II.II.llII >= 0 && (i1Il = (I1Il)II.II.II0.elementAt(II.II.llII)) != null) {
            i1Il.I0lO();
        }
    }

    private boolean III() {
        return !this.IOoO && II0o[II0o.length - 1] > this.I_0 || this.IOoO && II0o[II0o.length - 1] < II.IIlI;
    }

    public void IIl1() {
        if (!(I1_I.II().I1_1 && I1_I.II().IO1I || !this.IOol || this.III())) {
            boolean bl = false;
            if (!II.II[2] && !II.II[4]) {
                if (!II.II[8] && !II.II[6]) {
                    if (II.II[5]) {
                        this.Ioll = 2;
                    } else if (II.II[12] && !I1_I.II().IIo1()) {
                        if (this.III()) {
                            return;
                        }
                        if (this.II1_.IIO <= 0) {
                            this.Ioll = 2;
                        }
                        IO.II();
                    } else if (!I1_I.II().IIo1() && !this.I__o && (II.II[13] || IO1_.II(this.II1O))) {
                        if (this.III()) {
                            return;
                        }
                        if (!this.IOo_) {
                            this.IOo_ = true;
                        }
                        this.IOoO = true;
                        IO.II();
                    }
                } else {
                    bl = true;
                    ++this.llII;
                    if (this.llII > this.II0.size() - 1) {
                        this.llII = 0;
                    }
                }
            } else {
                bl = true;
                --this.llII;
                if (this.llII < 0) {
                    this.llII = this.II0.size() - 1;
                }
            }
            if (bl) {
                IIO_ = this.llII * this.IIOl + this.IIOl - II.IIl / 2;
                if (IIO_ > IIO0) {
                    IIO_ = IIO0;
                }
                if (IIO_ < 0) {
                    IIO_ = 0;
                }
                if (this.llII == this.II0.size() - 1 || this.llII == 0) {
                    IoII = IIO_;
                }
            }
            bl = true;
            if (II.II.III1 != null && II.II.III1.I_1O) {
                if (!II.II(II.II.III1.IIO, 0, II.II.III1.II0I + 2, II.II.III1.IIOl)) {
                    bl = true;
                } else {
                    bl = false;
                    II.II.III1.IOlI();
                }
            }
            if (!this.I__o && II.IIIo && !II.III(this.I_Oo, this.I_0, this.III_, this.IIlI) && !this.IIlI && !I1_I.II().IIo1() && bl) {
                if (!this.III()) {
                    this.Iol = 0;
                    this.II0l = 0;
                    this.IIlI = false;
                    II.IIlI();
                    this.IOoO = true;
                    this.IOo_ = true;
                    IO.II();
                }
            } else {
                int n;
                int n2;
                if (II.IIIO) {
                    if (!this.IIlI && II.III(this.I_Oo, this.I_0, this.III_, this.IIlI)) {
                        for (n2 = 0; n2 < this.Il_.length; ++n2) {
                            this.Il_[0] = II.II;
                        }
                        this.Iol = II.II;
                        this.IIlI = true;
                        this.IIll = this.I1__ != 0;
                        this.I1__ = 0;
                    } else if (this.IIlI) {
                        ++this.II0l;
                        if (this.II0l > 5 && this.Iol == II.II && !this.IIll) {
                            this.Iol = -1000;
                            this.llII = (IIO_ + II.II - this.I_Oo) / this.IIOl;
                        }
                        if ((n2 = II.II - this.Il_[0]) != 0 && this.llII != -1) {
                            this.llII = -1;
                        }
                        for (n = this.Il_.length - 1; n > 0; --n) {
                            this.Il_[n] = this.Il_[n - 1];
                        }
                        this.Il_[0] = II.II;
                        if ((IIO_ -= n2) < 0) {
                            IIO_ = 0;
                        }
                        if (IIO_ > IIO0) {
                            IIO_ = IIO0;
                        }
                        if (IoII < 0 || IoII > IIO0) {
                            n2 /= 2;
                        }
                        IoII -= n2;
                    }
                }
                if (II.IIIo && this.IIlI) {
                    n2 = II.II - this.Il_[0];
                    II.IIIo = false;
                    if (I_Ol.II1(n2) < 20 && I_Ol.II1(II.II - this.Iol) < 20 && !this.IIll) {
                        this.I1__ = 0;
                        IIO_ = IoII;
                        this.Iol = -1000;
                        this.llII = (IIO_ + II.II - this.I_Oo) / this.IIOl;
                        this.II0l = 0;
                        this.Ioll = 10;
                    } else if (this.llII != -1 && this.II0l > 5) {
                        this.II0l = 0;
                        this.Ioll = 1;
                    } else if (this.llII == -1 && !this.IIll) {
                        if (IoII < 0) {
                            IIO_ = 0;
                        } else if (IoII > IIO0) {
                            IIO_ = IIO0;
                        } else {
                            n = II.II - this.Il_[0] + (this.Il_[0] - this.Il_[1]) + (this.Il_[1] - this.Il_[2]);
                            int n3 = n > 10 ? 10 : (n < -10 ? -10 : 0);
                            this.I1__ = -n3 * 100;
                        }
                    }
                    this.IIlI = false;
                    this.II0l = 0;
                    II.IIIo = false;
                }
                II.IIIl();
                II.III1();
            }
        }
    }

    public void II(IO1l iO1l) {
        if (!I1_I.II().I1_1 || !I1_I.II().IO1I) {
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
            iO1l.IIl0(-IoII, 0);
            for (int i = 0; i < this.II0.size(); ++i) {
                if (i == this.llII) {
                    iO1l.II(IlOo, this.I_Oo + i * this.IIOl + 1, II0o[i] + 1, 0);
                } else {
                    iO1l.II(IlO0, this.I_Oo + i * this.IIOl + 1, II0o[i] + 1, 0);
                }
                I1Il i1Il = (I1Il)this.II0.elementAt(i);
                String[] stringArray = i1Il.IIll;
                if (i1Il.IIll == null) {
                    stringArray = new String[]{((I1Il)this.II0.elementAt((int)i)).IIoO};
                }
                int n = II0o[i] + (this.IIlI - stringArray.length * 14) / 2 + 1;
                for (int j = 0; j < stringArray.length; ++j) {
                    if (i == this.llII) {
                        IO1I.IIIO.II(iO1l, stringArray[j], this.I_Oo + i * this.IIOl + this.IIOl / 2, n + j * 14, 2);
                        continue;
                    }
                    if (i1Il.I_1o) {
                        IO1I.II.II(iO1l, stringArray[j], this.I_Oo + i * this.IIOl + this.IIOl / 2, n + j * 14, 2);
                        continue;
                    }
                    IO1I.III_.II(iO1l, stringArray[j], this.I_Oo + i * this.IIOl + this.IIOl / 2, n + j * 14, 2);
                }
            }
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        }
    }

    public void IOlI() {
        I1Il i1Il;
        if (this.I1__ != 0 && !this.IIlI) {
            if ((IIO_ += this.I1__ / 100) < 0) {
                IIO_ = 0;
            } else if (IIO_ > IIO0) {
                IIO_ = IIO0;
            } else {
                IoII = IIO_;
            }
            this.I1__ = this.I1__ * 9 / 10;
            if (this.I1__ < 100 && this.I1__ > -100) {
                this.I1__ = 0;
            }
        }
        if (IoII != IIO_ && !this.IIlI) {
            this.I1_o = IIO_ - IoII << 2;
            this.I1O += this.I1_o;
            IoII += this.I1O >> 4;
            this.I1O &= 0xF;
        }
        if (!this.IOoO) {
            ++this.IIO;
            for (int i = 0; i < II0o.length; ++i) {
                if (II0o[i] <= this.I_0) continue;
                int n = II0o[i] - this.I_0 >> 1;
                if (n <= 0) {
                    n = 1;
                }
                if (this.IIO <= i) continue;
                int[] nArray = II0o;
                int n2 = i;
                nArray[n2] = nArray[n2] - n;
            }
            if (II0o[II0o.length - 1] <= this.I_0) {
                this.IIO = 0;
            }
        } else {
            ++this.IIO;
            for (int i = 0; i < II0o.length; ++i) {
                if (II0o[i] >= II.IIlI) continue;
                int n = (II.IIlI - II0o[i] >> 1) + 2;
                if (n <= 0) {
                    n = 1;
                }
                if (this.IIO <= i) continue;
                int[] nArray = II0o;
                int n3 = i;
                nArray[n3] = nArray[n3] + n;
            }
            if (II0o[II0o.length - 1] >= II.IIlI) {
                this.IIO = 0;
                this.IOoO = false;
                this.IOol = false;
                I1OO.I__o();
                if (this.IOo_) {
                    II.II.III1 = null;
                    Ilol.II = null;
                    if (II.III != null && II.III.III1 != null) {
                        II.III.III1 = null;
                    }
                } else if (this.IOo1) {
                    II.II.III1 = null;
                    if (II.III != null && II.III.III1 != null) {
                        II.III.III1 = null;
                    }
                    if (this.llII >= 0 && (i1Il = (I1Il)this.II0.elementAt(this.llII)) != null) {
                        IO.II();
                        i1Il.I0lO();
                    }
                }
            }
        }
        if (IIOo != 0 && (IIOo >>= 1) < 0) {
            IIOo = 0;
        }
        if (!this.III() && this.Ioll > 0) {
            --this.Ioll;
            if (this.Ioll == 0) {
                if (this.llII >= 0 && !this.IIIo[this.llII]) {
                    this.IOoO = true;
                    this.IOo1 = true;
                    II.II.III1 = null;
                    return;
                }
                I1OO.I__o();
                if (this.llII >= 0 && (i1Il = (I1Il)this.II0.elementAt(this.llII)) != null) {
                    i1Il.I0lO();
                }
            }
        }
    }

    static {
        IlO0 = IO10.IIII(I_II.Il_("\u14bc\u14df\u14b0\u1499\u1561\u1567\u1520\u150d\u15ec\u15cf\u15e6\u1585\u167e\u1672\u1620\u161c\u16f7\u16d7\u16b3\u1685\u16cd\u177a\u175f\u1728\u1736\u17ff\u17d7\u17ad\u17c6\u1838\u1845\u183a\u1814", 5267));
        IlOo = IO10.IIII(I_II.Il_("\u14bc\u14df\u14b0\u1499\u1561\u1567\u1520\u150d\u15ec\u15cf\u15e6\u1585\u167e\u1672\u1620\u161c\u16f7\u16d7\u16b3\u1685\u16cd\u177a\u175f\u1728\u1736\u17ff\u17d7\u17ad\u17c5\u1838\u1845\u183a\u1814", 5267));
    }

    private static /* synthetic */ String Il_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

