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
public class I_I_
implements I1_O {
    public static I_Io[] II;
    boolean IOo0;
    short IIO_;
    public boolean III1;
    public boolean III_ = false;
    public int IIlI;
    public long IloO;
    public int IIO_;
    public int llIl;
    public int llI1;
    public int I1;
    public int I1I;
    public int llI_ = 1;
    private int II0I;
    public int status;
    public int IIII;
    public int IIIl;
    public int III1;
    public int llIO;
    public int llI0;
    public int Iol;
    public int IIl;
    public int llIo;
    public int lll;
    public boolean IOoo;
    public I1O_ II;
    public boolean I0;
    public boolean I0I;
    private boolean I0II;
    private I_lO II0I;
    public int I1ll;
    public Ilol IIlO;
    public int lllI;
    public int I1OI;
    public int lIOO;
    public byte II0o;
    public boolean I0Il;
    public boolean I0I1;
    public static I_lO II0l;
    public static I_lO II01;
    public boolean I_O_ = false;
    public int I10I;
    public int IIl_;
    public int I010;
    public int I01o;
    private boolean I11_;
    private int I_01;
    private boolean I0I_ = true;
    private int IO1I;
    private int I_0O;
    public static Image Il0;
    private boolean I1IO;
    private int I_o;
    private int I_oI;
    private int llll;
    public int I10_;
    public boolean I0IO = true;
    private int[] II0I = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
    private int[] I1l_ = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
    private int[] I1lO = new int[]{1, 1, 2, 2, 3, 3, 2};
    private int[] I1l0 = new int[]{4, 5, 6};
    private int[] I1lo = new int[]{7, 8, 9};
    private int[] II0_ = new int[1];
    public int I100 = 24;
    public int I10o = 100;
    public int I1o = 100;
    public Image Il0I;
    private int lll1 = 0;
    public boolean I0I0 = false;
    public Ilol IIl0;
    public boolean I0Io;
    private I_I_ IIIo;
    private int IIl0;
    public boolean I0l;
    public boolean I0lI;
    private int[][] IIIo;
    private boolean I0ll;

    public void II_1(String string) {
        if (this.II == null) {
            this.II = new I1O_();
        }
        this.II.II(string, 0, null, false);
    }

    public final boolean Il() {
        return this instanceof Il0_ || this instanceof IloI || this instanceof Ilo || this instanceof I_1I;
    }

    public I_I_() {
        byte[] byArray = new byte[]{-1, 1};
        this.I0Io = false;
        this.IIIo = new int[][]{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
        this.I0ll = true;
    }

    public void I00() {
        if (I_I_.II[this.I1ll].II == null) {
            I_I_.II[this.I1ll].II = new I1l0();
            String string = I_I_.Il_l("\u315b\u31de\u31dd\u31b3\u31df", 12660) + this.I1ll;
            if (I_I_.class.getResourceAsStream(string) != null) {
                I_I_.II[this.I1ll].II.II10(string + I_I_.Il_l("\u315b\u31f7\u31d3\u31a5\u3191", 12660));
                I_I_.II[this.I1ll].II.II01 = IO10.IIII(string + I_I_.Il_l("\u315b\u31fa\u31df\u31b6\u31de\u327f\u3240\u322a", 12660));
            } else {
                I_0_.II().II0o(this.I1ll);
            }
            if (II0l.size() > 15) {
                I_I_.II[Integer.parseInt((String)((String)I_I_.II0l.elementAt((int)0)))].II = null;
                II0l.removeElementAt(0);
            }
            II0l.addElement(String.valueOf(this.I1ll));
        } else {
            this.Iol = I_I_.II[this.I1ll].II.IIOI;
            this.IIl = I_I_.II[this.I1ll].II.IIOl;
        }
    }

    public void II(short s) {
        this.IOo0 = true;
        this.IIO_ = s;
    }

    public void IOll() {
        this.IOo0 = false;
    }

    public I_I_(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n2, int n3, int n4, byte by, int n5, short s, short s2, byte by2, byte by3) {
        byte[] byArray = new byte[]{-1, 1};
        this.I0Io = bl;
        this.IIIo = new int[][]{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
        this.I0ll = bl3;
        this.IOoo = bl2;
        this.I0 = bl4;
        this.I0I = bl5;
        this.lIOO = n3;
        this.lll = n;
        this.I1ll = n2;
        this.llIl = n4;
        short s3 = s;
        this.I1 = s3;
        this.llIO = s3;
        short s4 = s2;
        this.I1I = s4;
        this.llI0 = s4;
        this.status = by2;
        if (n2 != 70) {
            I_I_.I00I();
            this.I00();
        }
        if (!I_I_.IIIO(String.valueOf(n2))) {
            II01.addElement(String.valueOf(n2));
        }
        this.llI1 = n5;
        this.II0o = by3;
        this.I00l();
        this.I0II = false;
        this.I010 = s;
        this.I01o = s2;
        if (this.IlI()) {
            this.II0I = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
            this.I1l_ = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
            this.I1lO = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
            this.I1l0 = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
            this.I1lo = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
        } else if (this.IlII()) {
            this.II0I = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
            this.I1l_ = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3};
            this.I1lO = new int[]{1, 1, 2, 2, 1, 1, 3, 3};
            this.I1l0 = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6};
            this.I1lo = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9};
        } else if (this.II_0()) {
            this.II0I = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
            this.I1l_ = new int[]{2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 3, 3, 2, 2, 4, 4};
            this.I1lO = new int[]{2, 2, 3, 3, 2, 2, 4, 4};
            this.I1l0 = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
            this.I1lo = new int[]{5, 12, 13, 14};
        } else {
            this.II0I = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
            this.I1l_ = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
            this.I1lO = new int[]{1, 1, 2, 2, 3, 3, 2};
            this.I1l0 = new int[]{4, 5, 6};
            this.I1lo = new int[]{7, 8, 9};
        }
        I_Ol.II__(I_I_.Il_l("\u3139\u31dc\u31f0\u31f1\u31b9\u324b\u3213\u326d", 12660) + n);
    }

    private static boolean IIIO(String string) {
        for (int i = 0; i < II01.size(); ++i) {
            if (!((String)II01.elementAt(i)).equals(string)) continue;
            return true;
        }
        return false;
    }

    private static void I00I() {
        int n;
        int n2 = 0;
        for (n = 0; n < II.length; ++n) {
            if (I_I_.II[n].II == null) continue;
            ++n2;
        }
        if (n2 >= 10) {
            for (n = 0; n < II.length; ++n) {
                if (I_I_.II[n].II == null || n2 <= 5) continue;
                I_I_.II[n].II = null;
            }
        }
    }

    public void IIIl(int[] nArray) {
        if (this.IO1I > nArray.length - 1) {
            this.IO1I = 0;
        }
        this.I_0O = nArray[this.IO1I];
        ++this.IO1I;
    }

    public void IOl1() {
        if (this.I10_ == 0 && II.IIIO % 25 == 0) {
            I_0.II(114, this, 1);
        }
        if (this.I10_ == 1 && II.IIIO % 4 == 0) {
            I_0.II(132, this, 1);
        }
        if (this.I10_ == 2 && II.IIIO % 7 == 0) {
            I_0.II(131, this, 1);
        }
    }

    public void IIlO() {
        if (this.II != null) {
            this.II.IOlI();
        }
        if (!this.I_O_) {
            int n;
            this.IOo();
            if (this.I0l && II.IIIO % 5 == 0) {
                I_0.III(113, this.I1, this.I1I, 1);
            }
            if (this.I0lI && II.IIIO % 10 == 0) {
                I1lI.III(new I1ll(41, this.I1, this.I1I, 3, 1, 1));
            }
            if (!II.II && this.status != 1 && this.status != 0 && !II.II && II.IIIO % (15 + (this.lll << 1)) == 0) {
                Ilol ilol;
                for (n = 0; n < I1_I.II_O.size(); ++n) {
                    ilol = (Ilol)I1_I.II_O.elementAt(n);
                    if (ilol == null || !ilol.I1ol || ilol.IO10 != 32) continue;
                    Ilol ilol2 = new Ilol();
                    new Ilol().I_o_ = ilol.I_o_;
                    ilol2.I_oO = ilol.I_oO - ilol.IO11;
                    if (ilol.IOIO != 0) continue;
                    I_lI.II(this.I1 + this.llI_ * this.Iol, this.I1I, this.IIOI(), -100, -100, ilol2, 25);
                }
                if (Ilol.II().I1ol && Ilol.II().IO10 == 32) {
                    ilol = new Ilol();
                    new Ilol().I_o_ = Ilol.II().I_o_;
                    ilol.I_oO = Ilol.II().I_oO - Ilol.II().IO11;
                    if (Ilol.II().IOIO == 0) {
                        I_lI.II(this.I1 + this.llI_ * this.Iol, this.I1I, this.IIOI(), -100, -100, ilol, 25);
                    }
                }
            }
            if (this.IIO_ != 0 && II.IIIO % 5 == 0) {
                I1lI.III(new I1ll(this.IIO_, this.I1, this.I1I + 24, 3, 5, 1));
            }
            if (this.III_) {
                long l;
                if (II.IIIO % 5 == 0) {
                    I_0.III(113, this.I1, this.I1I, 1);
                }
                if ((l = System.currentTimeMillis()) - this.IloO >= 1000L) {
                    --this.IIlI;
                    this.IloO = l;
                    if (this.IIlI < 0) {
                        this.III_ = false;
                        this.IIlI = 0;
                    }
                }
                this.I_0O = this.II0I() ? this.II0_[II.IIIO % this.II0_.length] : (this.IlI() ? this.I1l0[II.IIIO % this.I1l0.length] : (this.IlII() ? (II.IIIO % 20 > 5 ? 11 : 10) : (this.II_0() ? (II.IIIO % 20 > 5 ? 1 : 15) : (II.IIIO % 20 > 5 ? 11 : 10))));
            }
            if (this.IIO()) {
                if (this.I0I_) {
                    I_I_ i_I_ = this;
                    byte by = IOlO.IlI0;
                    this.I010 = this.I1;
                    this.I_01 = 0;
                    if (this.I01o > 0 && !IOlO.IIIl(this.I010, this.I01o, 2)) {
                        if (IOlO.IIIo(this.I010 / by, this.I01o / by) == 0) {
                            this.I11_ = true;
                        } else if (IOlO.IIIo(this.I010 / by, this.I01o / by) != 0 && !IOlO.IIIl(this.I010, this.I01o, 2)) {
                            this.I010 = this.I1;
                            this.I01o = this.I1I;
                            this.I11_ = false;
                        }
                        while (i_I_.I11_ && i_I_.I_01 < 10) {
                            ++i_I_.I_01;
                            i_I_.I01o += 24;
                            if (!IOlO.IIIl(i_I_.I010, i_I_.I01o, 2)) continue;
                            if (i_I_.I01o % 24 == 0) break;
                            i_I_.I01o %= 24;
                            break;
                        }
                    }
                }
                if (this.II0I != null || I_I_.II[this.I1ll].IIo == 0) {
                    if (this.status != 3 && this.I0IO) {
                        if (this.IIlO != null) {
                            this.IIlO.II(this.lllI, this.I1OI, false, true);
                        } else if (this.IIIo != null) {
                            this.IIIo.IIII();
                        }
                        this.I0IO = false;
                    }
                    if (this.II0o > 0) {
                        this.IOl1();
                    }
                    switch (this.status) {
                        case 1: {
                            this.IOoo = false;
                            this.I0 = false;
                            this.I0I = false;
                            this.I1I += this.IIII;
                            if (II.IIIO % 2 == 0) {
                                if (this.IIIl > 1) {
                                    --this.IIIl;
                                } else if (this.IIIl < -1) {
                                    ++this.IIIl;
                                }
                            }
                            this.I1 += this.IIIl;
                            this.I_0O = this.II0I() ? this.II0_[II.IIIO % this.II0_.length] : (this.IlI() ? this.I1l0[II.IIIO % this.I1l0.length] : (!this.IlII() && this.II_0() ? 15 : 11));
                            if (this.I0II) {
                                this.I0II = false;
                                if (this.I0I1) {
                                    for (n = 0; n < I1_I.IIO.size(); ++n) {
                                        if (((I_I_)I1_I.IIO.elementAt((int)n)).lll != this.lll) continue;
                                        I1_I.IIO.removeElementAt(n);
                                    }
                                }
                                this.IIII = 0;
                                this.IIIl = 0;
                                this.I1 = this.llIO;
                                this.I1I = this.llI0;
                                this.llIl = this.II().llIl;
                                this.status = 0;
                                this.llIo = 0;
                                return;
                            }
                            if ((IOlO.IIl(this.I1, this.I1I) & 2) == 2) {
                                int n2 = this.IIII = this.IIII > 4 ? -4 : -this.IIII;
                                if (this.III1 == 0) {
                                    this.III1 = 16;
                                }
                            } else {
                                ++this.IIII;
                            }
                            if (this.III1 <= 0) break;
                            --this.III1;
                            if (this.III1 != 0) break;
                            this.I0II = true;
                            return;
                        }
                        case 2: {
                            if (this.IIO_ != 0) {
                                return;
                            }
                            if (this.III_) {
                                return;
                            }
                            if (this.I0l) {
                                return;
                            }
                            if (this.I0lI) {
                                return;
                            }
                            this.llIo = 0;
                            this.IIIl(this.II0I);
                            switch (I_I_.II[this.I1ll].II0l) {
                                case 0: 
                                case 1: 
                                case 2: 
                                case 3: {
                                    ++this.IIII;
                                    if (this.IIII <= 10 + this.lll % 10 || this.IIlO != null && I_Ol.II1(this.IIlO.I_o_ - this.I1) <= 80 || this.IIIo != null && I_Ol.II1(this.IIIo.I1 - this.I1) <= 80) break;
                                    this.status = 5;
                                    break;
                                }
                                case 4: 
                                case 5: {
                                    ++this.IIII;
                                    if (this.IIII <= this.lll % 3 || this.IIlO != null && I_Ol.II1(this.IIlO.I_o_ - this.I1) <= 80 || this.IIIo != null && I_Ol.II1(this.IIIo.I1 - this.I1) <= 80) break;
                                    this.status = 5;
                                }
                            }
                            if (!this.IOoo) {
                                if (this.IIlO != null && II.IIIO % (10 + this.IIII % 20) == 0) {
                                    this.llI_ = this.IIlO.I_o_ > this.I1 ? 1 : -1;
                                } else if (this.IIIo != null && II.IIIO % (10 + this.IIII % 20) == 0) {
                                    this.llI_ = this.IIIo.I1 > this.I1 ? 1 : -1;
                                }
                            }
                            if (this.IIl0 > 0) {
                                --this.IIl0;
                                this.status = 2;
                            }
                            return;
                        }
                        case 3: {
                            if (this.IIO_ != 0) {
                                return;
                            }
                            if (this.I0l) {
                                return;
                            }
                            if (this.I0lI) {
                                return;
                            }
                            if (this.III_) {
                                return;
                            }
                            this.IOl_();
                            return;
                        }
                        case 4: {
                            if (this.IIO_ != 0) {
                                return;
                            }
                            if (this.I0l) {
                                return;
                            }
                            if (this.I0lI) {
                                return;
                            }
                            if (this.III_) {
                                return;
                            }
                            this.llIo = 0;
                            ++this.IIII;
                            if (this.IIII <= 40 + this.lll % 5) break;
                            this.I1I -= 2;
                            this.status = 5;
                            this.IIII = 0;
                            return;
                        }
                        case 5: {
                            if (this.IIO_ != 0) {
                                return;
                            }
                            if (this.I0l) {
                                return;
                            }
                            if (this.I0lI) {
                                return;
                            }
                            if (this.III_) {
                                if (I_I_.II[this.I1ll].II0l == 4) {
                                    ++this.llll;
                                    ++this.I_o;
                                    this.I_oI += !this.I1IO ? 1 : -1;
                                    if (this.I_o == 10) {
                                        this.I_o = 0;
                                        this.I1IO = !this.I1IO;
                                    }
                                }
                                return;
                            }
                            this.llIo = 0;
                            this.IOlO();
                            return;
                        }
                        case 6: {
                            this.llIo = 0;
                            ++this.IIII;
                            this.I1I += this.IIII;
                            if (this.I1I < this.llI0) break;
                            this.I1I = this.llI0;
                            this.IIII = 0;
                            this.status = 5;
                            return;
                        }
                        case 7: {
                            if (!this.I0IO && II.IIIO % 4 == 0) {
                                this.I_0O = this.II0I() ? this.II0_[II.IIIO % this.II0_.length] : (this.IlI() ? this.I1l0[II.IIIO % this.I1l0.length] : (this.IlII() ? (this.I_0O != 10 ? 10 : 11) : (this.II_0() ? (this.I_0O != 1 ? 1 : 15) : (this.I_0O != 10 ? 10 : 11))));
                            }
                            --this.llIo;
                            if (this.llIo <= 0 && (this.II0I() || this.IlI() || this.IlII() && this.I_0O == 11 || this.II_0() && this.I_0O == 15 || this.I1ll < 58 && this.I_0O == 11)) {
                                if (!(this.IIl0 != null && this.I0Io || this.llIl == 0)) {
                                    this.status = 5;
                                    if (this.IIl0 != null) {
                                        this.llI_ = -this.IIl0.IOI1;
                                        if (I_Ol.II1(this.I1 - this.IIl0.I_o_) < 24) {
                                            this.status = 2;
                                        }
                                    }
                                    this.III1 = 0;
                                    this.IIIl = 0;
                                    this.IIII = 0;
                                    this.llIo = 0;
                                } else {
                                    this.status = 1;
                                    this.IIIl = this.IIl0.IOI1 << 1;
                                    this.IIII = -3;
                                    this.III1 = 0;
                                }
                                this.IIl0 = null;
                                return;
                            }
                            if (I_I_.II[this.I1ll].II0l == 0 || this.IIl0 == null) break;
                            int n3 = -this.IIl0.IOI1 << 1;
                            if (this.I1 <= this.llIO - I_I_.II[this.I1ll].IIo || this.I1 >= this.llIO + I_I_.II[this.I1ll].IIo) break;
                            this.I1 -= n3;
                        }
                    }
                }
            }
        }
    }

    public void IIII() {
        if (!II0l.III().IllO && !IIo.IIO_ && this.llIl > 0 && this.status != 3 && this.status != 7) {
            this.llIo = 4;
            this.status = 7;
            if (this.II().II0l != 0 && I_Ol.II1(this.I1 - this.llIO) < 30) {
                this.I1 -= 10 * this.llI_;
            }
        }
    }

    public static Ilo II() {
        for (int i = 0; i < I1_I.IIO.size(); ++i) {
            I_I_ i_I_ = (I_I_)I1_I.IIO.elementAt(i);
            if (!(i_I_ instanceof Ilo)) continue;
            return (Ilo)i_I_;
        }
        return null;
    }

    public static IloI II() {
        for (int i = 0; i < I1_I.IIO.size(); ++i) {
            I_I_ i_I_ = (I_I_)I1_I.IIO.elementAt(i);
            if (!(i_I_ instanceof IloI)) continue;
            return (IloI)i_I_;
        }
        return null;
    }

    public static Il0_ II() {
        for (int i = 0; i < I1_I.IIO.size(); ++i) {
            I_I_ i_I_ = (I_I_)I1_I.IIO.elementAt(i);
            if (!(i_I_ instanceof Il0_)) continue;
            return (Il0_)i_I_;
        }
        return null;
    }

    public static I_1I II(byte by) {
        I_I_ i_I_ = (I_I_)I1_I.IIO.elementAt(by);
        return i_I_ instanceof I_1I ? (I_1I)i_I_ : null;
    }

    public void IIIl(Ilol ilol) {
        this.I0IO = true;
        this.IIIo = null;
        this.IIlO = ilol;
        this.IIII = 0;
        this.IIIl = 0;
        this.status = 3;
        this.IO1I = 0;
        if (!this.IOoo) {
            this.llI_ = ilol.I_o_ > this.I1 ? 1 : -1;
        }
        int n = ilol.I_o_;
        int n2 = ilol.I_oO;
        this.III1 = I_Ol.II1(n - this.I1) < this.Iol << 1 && I_Ol.II1(n2 - this.I1I) < this.IIl << 1 ? 0 : 1;
    }

    boolean II_0() {
        return this.I1ll >= 58 && this.I1ll <= 65 || this.I1ll == 67 || this.I1ll == 68;
    }

    private boolean IlI() {
        return this.I1ll == 76;
    }

    private boolean IlII() {
        return this.I1ll >= 73 && !this.IlI();
    }

    public void IOl_() {
        int[] nArray;
        int[] nArray2 = nArray = this.III1 == 0 ? this.I1l0 : this.I1lo;
        if (this.IO1I < nArray.length) {
            this.IIIl(nArray);
            if (this.I1 >= I1_I.Io1 && this.I1 <= I1_I.Io1 + II.IIl && this.III1 == 0 && II.IIIO % 2 == 0) {
                IO.II();
            }
        }
        if (this.IIII == 0) {
            int n;
            int n2 = this.IIlO != null ? this.IIlO.I_o_ : this.IIIo.I1;
            int n3 = n = this.IIlO != null ? this.IIlO.I_oO : this.IIIo.I1I;
            if (!this.IlII()) {
                if (this.I1 > this.llIO + I_I_.II[this.I1ll].IIo) {
                    this.IIII = 1;
                }
                if (this.I1 < this.llIO - I_I_.II[this.I1ll].IIo) {
                    this.IIII = 1;
                }
            }
            if (!(I_I_.II[this.I1ll].II0l != 4 && I_I_.II[this.I1ll].II0l != 5 || this.IOoo)) {
                this.I1I += (n - this.I1I) / 20;
            }
            ++this.IIIl;
            if (this.IIIl > nArray.length - 1 || this.IIII == 1) {
                this.IIII = 1;
                if (this.III1 == 0) {
                    if (this.IIlO != null) {
                        this.IIlO.II(this.lllI, this.I1OI, false, true);
                    } else {
                        this.IIIo.IIII();
                    }
                    this.I0IO = false;
                } else {
                    if (this.IIlO != null) {
                        I_lI.II(this.I1 + this.llI_ * this.Iol, this.I1I, this.IIOI(), this.lllI, this.I1OI, this.IIlO, this.II().IIol);
                    } else {
                        Ilol ilol = new Ilol();
                        new Ilol().I_o_ = this.IIIo.I1;
                        ilol.I_oO = this.IIIo.I1I;
                        ilol.IOI_ = -100;
                        I_lI.II(this.I1 + this.llI_ * this.Iol, this.I1I, this.IIOI(), this.lllI, this.I1OI, ilol, this.II().IIol);
                    }
                    this.I0IO = false;
                }
            }
            if (!this.IOoo) {
                this.llI_ = this.I1 < n2 ? 1 : -1;
            }
        } else if (this.IIII == 1 && this.IO1I == nArray.length) {
            this.status = 2;
            this.IIII = 0;
            this.IIIl = 0;
            this.IO1I = 0;
        }
        if (this.IO1I == 5 && this.IIlO != null && this.IIlO.IOI_ == Ilol.II().IOI_) {
            if (this.I1ll == 88 && this.III1 != 0) {
                I1_I.lII1 = 2;
            }
            if (this.I1ll == 89) {
                I1_I.lII1 = 2;
            }
        }
    }

    public void IOlO() {
        try {
            if (II0l.III().IllO || IIo.IIO_) {
                return;
            }
            if (this.I0Io) {
                this.status = 1;
                this.IIIl = this.IIl0.IOI1 << 3;
                this.IIII = -5;
                this.III1 = 0;
            }
            if (this.I0) {
                return;
            }
            if (this.IOoo || this.I0I) {
                this.IIIl(this.II0I);
                return;
            }
            switch (I_I_.II[this.I1ll].II0l) {
                case 0: {
                    if (!this.IlI()) {
                        this.I_0O = 0;
                        return;
                    }
                    this.I_0O = this.II0I[II.IIIO % this.II0I.length];
                    break;
                }
                case 1: 
                case 2: 
                case 3: {
                    byte by = I_I_.II[this.I1ll].IIoI;
                    if (by == 1) {
                        if (II.IIIO % 2 == 1) {
                            return;
                        }
                    } else if (by > 2) {
                        by = (byte)(by + this.lll % 2);
                    } else if (II.IIIO % 2 == 1) {
                        by = (byte)(by - 1);
                    }
                    this.I1 += by * this.llI_;
                    if (this.I1 > this.llIO + I_I_.II[this.I1ll].IIo) {
                        this.llI_ = -1;
                    } else if (this.I1 < this.llIO - I_I_.II[this.I1ll].IIo) {
                        this.llI_ = 1;
                    }
                    if (I_Ol.II1(this.I1 - Ilol.II().I_o_) < 40 && I_Ol.II1(this.I1 - this.llIO) < I_I_.II[this.I1ll].IIo) {
                        int n = this.llI_ = this.I1 > Ilol.II().I_o_ ? -1 : 1;
                        if (I_Ol.II1(this.I1 - Ilol.II().I_o_) < 20) {
                            this.I1 -= this.llI_ * 10;
                        }
                        this.status = 2;
                        this.IIl0 = 20;
                    }
                    this.IIIl(this.Iol > 30 ? this.I1l_ : this.I1lO);
                    return;
                }
                case 4: {
                    byte by = (byte)(I_I_.II[this.I1ll].IIoI + this.lll % 2);
                    this.I1 += by * this.llI_;
                    if (II.IIIO % 10 > 2) {
                        this.I1I += by * this.II0I;
                    }
                    if (this.I1 > this.llIO + I_I_.II[this.I1ll].IIo) {
                        this.llI_ = -1;
                        this.status = 2;
                        this.IIl0 = II.IIIO % 20 + 20;
                        this.IIII = 0;
                    } else if (this.I1 < this.llIO - I_I_.II[this.I1ll].IIo) {
                        this.llI_ = 1;
                        this.status = 2;
                        this.IIl0 = II.IIIO % 20 + 20;
                        this.IIII = 0;
                    }
                    if (this.I1I > this.llI0 + 24) {
                        this.II0I = -1;
                    } else if (this.I1I < this.llI0 - (20 + II.IIIO % 10)) {
                        this.II0I = 1;
                    }
                    this.IIIl(this.I1l_);
                    return;
                }
                case 5: {
                    byte by = (byte)(I_I_.II[this.I1ll].IIoI + this.lll % 2);
                    this.I1 += by * this.llI_;
                    by = (byte)(by + (II.IIIO + this.lll) % 2);
                    if (II.IIIO % 10 > 2) {
                        this.I1I += by * this.II0I;
                    }
                    if (this.I1 > this.llIO + I_I_.II[this.I1ll].IIo) {
                        this.llI_ = -1;
                        this.status = 2;
                        this.IIl0 = II.IIIO % 20 + 20;
                        this.IIII = 0;
                    } else if (this.I1 < this.llIO - I_I_.II[this.I1ll].IIo) {
                        this.llI_ = 1;
                        this.status = 2;
                        this.IIl0 = II.IIIO % 20 + 20;
                        this.IIII = 0;
                    }
                    if (this.I1I > this.llI0 + 24) {
                        this.II0I = -1;
                    } else if (this.I1I < this.llI0 - (20 + II.IIIO % 10)) {
                        this.II0I = 1;
                    }
                    if (!IOlO.IIIl(this.I1, this.I1I, 2)) break;
                    if (II.IIIO % 10 > 5) {
                        this.I1I = IOlO.II1I(this.I1I);
                        this.status = 4;
                        this.IIII = 0;
                        this.II0I = -1;
                        return;
                    }
                    this.II0I = -1;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public final I_Io II() {
        return II[this.I1ll];
    }

    public boolean II_o() {
        if (this.I1 < I1_I.Io1) {
            return false;
        }
        if (this.I1 > I1_I.Io1 + I1_I.I_0) {
            return false;
        }
        if (this.I1I < I1_I.Io1I) {
            return false;
        }
        if (this.I1I > I1_I.Io1I + I1_I.IIO + 30) {
            return false;
        }
        if (II[this.I1ll] == null) {
            return false;
        }
        if (I_I_.II[this.I1ll].II == null) {
            return false;
        }
        if (I_I_.II[this.I1ll].II.II01 == null) {
            return false;
        }
        return this.status != 0;
    }

    public boolean IIO() {
        if (II[this.I1ll] == null) {
            return false;
        }
        if (I_I_.II[this.I1ll].II == null) {
            return false;
        }
        return this.status != 0;
    }

    public boolean IIOI() {
        return this.I0Il || this.II0o > 0;
    }

    public void I00l() {
        int n = this.I10o = this.llI1 <= 0 ? 0 : (int)((long)this.llIl * 100L / (long)this.llI1);
        if (this.I10o > 100) {
            this.I10o = 100;
        }
        if (this.I10o < 0) {
            this.I10o = 0;
        }
        if (this.I10o >= 100) {
            this.I1o = this.I10o;
        }
        this.lll1 = 0;
        this.Il0I = this.I10o < 30 ? I1_I.Il1l : (this.I10o < 60 ? I1_I.Il11 : I1_I.Il1O);
    }

    public void II(IO1l iO1l) {
        if (!IIoo.II(this, iO1l) && !this.I0I0) {
            if (this.I_O_) {
                if (!this.IOo0) {
                    I_I_.II[this.I1ll].II.II(iO1l, this.I_0O, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 1, 2);
                } else {
                    I_oo.IIII(iO1l, this.IIO_, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 2, 33);
                }
            } else {
                int n;
                if (this.I0I_ && this.status != 0) {
                    n = IOlO.IlI0;
                    if (IOlO.IIIl(this.I010 + n / 2, this.I01o + 1, 4)) {
                        iO1l.IIIO(this.I010 / n * n, (this.I01o - 30) / n * n, n, 100);
                    } else if (IOlO.IIIo((this.I010 - n / 2) / n, (this.I01o + 1) / n) == 0) {
                        iO1l.IIIO(this.I010 / n * n, (this.I01o - 30) / n * n, 100, 100);
                    } else if (IOlO.IIIo((this.I010 + n / 2) / n, (this.I01o + 1) / n) == 0) {
                        iO1l.IIIO(this.I010 / n * n, (this.I01o - 30) / n * n, n, 100);
                    } else if (IOlO.IIIl(this.I010 - n / 2, this.I01o + 1, 8)) {
                        iO1l.IIIO(this.I010 / 24 * n, (this.I01o - 30) / n * n, n, 100);
                    }
                    iO1l.II(IOlO.IIlI, this.I010, this.I01o, 3);
                    iO1l.IIIO(I1_I.Io1, I1_I.Io1I - II.II10, I1_I.I_0, I1_I.IIO + 2 * II.II10);
                }
                if (this.II_o() && (this.status != 1 || this.III1 <= 0 || II.IIIO % 3 != 0)) {
                    iO1l.IIl0(0, II.II10);
                    if (!this.IOo0) {
                        I_I_.II[this.I1ll].II.II(iO1l, this.I_0O, this.I1, this.I1I + this.I_oI, this.llI_ == 1 ? 0 : 1, 2);
                    } else {
                        I_oo.IIII(iO1l, this.IIO_, this.I1, this.I1I + this.I_oI - 9, this.llI_ == 1 ? 0 : 2, 33);
                    }
                    iO1l.IIl0(0, -II.II10);
                    if (Ilol.II().IIII != null && Ilol.II().IIII.equals(this) && this.status != 1 && this.llIl > 0 && this.Il0I != null) {
                        int n2;
                        n = IO1l.II(this.Il0I);
                        int n3 = IO1l.III(this.Il0I);
                        int n4 = n2 = n * this.I10o / 100;
                        if (this.I1o >= this.I10o) {
                            int n5;
                            int n6 = this.I1o;
                            if (II.IIIO % 6 > 3) {
                                int n7;
                                n5 = n7 = this.lll1;
                                this.lll1 = n7 + 1;
                            } else {
                                n5 = this.lll1;
                            }
                            this.I1o = n6 - n5;
                            n4 = n * this.I1o / 100;
                            if (this.I1o <= 0) {
                                this.I1o = 0;
                            }
                            if (this.I1o < this.I10o) {
                                this.I1o = this.I10o;
                            }
                            if (this.lll1 >= 3) {
                                this.lll1 = 3;
                            }
                        }
                        iO1l.II(I1_I.Il1_, this.I1 - (n >> 1), this.I1I - this.IIl - 5, 20);
                        iO1l.Illl(0xFFFFFF);
                        iO1l.III_(this.I1 - (n >> 1), this.I1I - this.IIl - 5, n4, 2);
                        iO1l.II(this.Il0I, 0, 0, n2, n3, 0, this.I1 - (n >> 1), this.I1I - this.IIl - 5, 20);
                    }
                }
            }
        }
    }

    public void IOl0() {
        this.llIl = 0;
        this.I0Io = true;
        this.llIl = 0;
        this.status = 1;
        this.IIII = -3;
        this.IIIl = -this.llI_;
        this.III1 = 0;
    }

    public void IIII(I_I_ i_I_) {
        this.IIIo = i_I_;
        this.I0IO = true;
        this.IIlO = null;
        this.IIII = 0;
        this.IIIl = 0;
        this.status = 3;
        this.IO1I = 0;
        if (!this.IOoo) {
            this.llI_ = i_I_.I1 > this.I1 ? 1 : -1;
        }
        int n = i_I_.I1;
        int n2 = i_I_.I1I;
        if (I_Ol.II1(n - this.I1) < this.Iol << 1 && I_Ol.II1(n2 - this.I1I) < this.IIl << 1) {
            this.I1 = this.I1 < n ? n - this.Iol : n + this.Iol;
            this.III1 = 0;
        } else {
            this.III1 = 1;
        }
    }

    @Override
    public int IIlo() {
        return this.I1;
    }

    @Override
    public int II1() {
        return this.I1I;
    }

    @Override
    public int II1I() {
        return this.IIl;
    }

    @Override
    public int II1l() {
        return this.Iol;
    }

    @Override
    public void IOlo() {
        if (this.status == 5) {
            this.status = 2;
            this.III1 = 0;
            this.IIIl = 0;
            this.IIII = 0;
            this.IIl0 = 50;
        }
    }

    @Override
    public boolean IIOl() {
        return this.status == 0 || this.status == 1;
    }

    public void IO1() {
        if (this.IIO_ != 0) {
            this.IIO_ = 0;
        }
    }

    public void IO1I() {
        this.I0l = false;
    }

    public void IO1l() {
        this.I0lI = false;
    }

    public void IOo() {
        if (this.I0ll && this.II0I() && I_I_.II[this.I1ll].II != null) {
            this.IIIo = (int[][])I1I1.IIIl.get(String.valueOf(this.I1ll));
            this.II0I = this.IIIo[0];
            this.I1l_ = this.IIIo[1];
            this.I1lO = this.IIIo[2];
            this.I1l0 = this.IIIo[3];
            this.I1lo = this.IIIo[4];
            this.II0_ = this.IIIo[5];
            this.I0ll = false;
        }
    }

    private boolean II0I() {
        return I_I_.II[this.I1ll].II != null && I_I_.II[this.I1ll].II.IIO == 2;
    }

    static {
        II0l = new I_lO(I_I_.Il_l("\u3118\u31f2\u31c1\u31a5\u31bd\u3260\u324c", 12660));
        II01 = new I_lO(I_I_.Il_l("\u311a\u31f6\u31c5\u319c\u319f\u326d", 12660));
        Il0 = IO10.IIII(I_I_.Il_l("\u315b\u31fe\u31d3\u31b8\u319e\u3246\u3243\u322c\u320b\u32ee\u3285\u32a4\u3291\u3353\u3343\u333d\u3310\u33f6\u33d0\u33a4\u33d2\u339b\u3473\u3452\u343e\u3433\u34ca\u3497\u34a8\u3499\u3571", 12660));
    }

    private static /* synthetic */ String Il_l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

