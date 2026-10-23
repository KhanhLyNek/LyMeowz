package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I111 {
    private I_lO II_I = new I_lO(I111.Ill("\ua799\ua79d\ua87c\ua85c\ua83b\ua803\ua8d3\ua8db\ua8b0\ua8d3\ua944\ua954\ua933\ua92a\ua9e8\ua9cb\ua989\ua985\uaa6e", 42972));
    private I11o var_I11o_IIlI;
    private byte[] var_byte_arr_IIl = new byte[10];
    private byte[] var_byte_arr_IIlI = new byte[10];
    private int var_int_IIlI = 0;
    private int IIO1 = 0;
    private int IIO_ = 0;
    private int IoII = 0;
    private int IIO0;
    private int IIOo;
    private int II0;
    private int var_int_II;
    private int var_int_III;
    private int IIII;
    private int var_int_IIIl;
    private int III1;
    private int III_;
    public int II0I;
    private int II0l;
    private int Iol;
    private int var_int_IIl;
    private int I1;
    private int I1I;
    private int Ioll;
    private int I1__;
    private int I1_O;
    private int I1_0;
    private int I1_o;
    private int I1O;
    private int I1OI;
    private short II_;
    private long IlOO;
    public boolean I1l1;
    private boolean I_Ol;
    private Ilol var_Ilol_IIl;
    private I___[] var_I____arr_II;
    private I___ var_I____III;
    public static short[][] var_short_arr_arr_IIIl;
    private int I10;
    private int I10I;
    private int IIl_;
    private int I10l;
    private int I101;
    private int[] Il_l;
    private int[] Il_1;
    private int[] Il__;
    private int[] Il_O;
    private static int[][] var_int_arr_arr_IIIl;
    private int[] Il_0;
    private int I1oI;
    private int I1ol;
    private int I1o1;
    private I11o[] var_I11o_arr_II;

    public static Image II(int n) {
        if (n < 0) {
            return null;
        }
        String string = I111.Ill("\ua7f3\ua79e\ua835\ua85c\ua807", 42972) + n + I111.Ill("\ua7f2\ua78b\ua874\ua85e", 42972);
        Image image = null;
        try {
            image = IO10.IIII(string);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return image;
    }

    public I111(int n, int n2, int n3, Ilol ilol, I___ i___, int n4, short s, short s2) {
        byte[] byArray = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
        byArray = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
        byArray = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
        this.I1oI = 0;
        this.II0l = 0;
        this.I1O = 0;
        this.IIO1 = n;
        this.IIO_ = n2;
        this.var_int_IIlI = n3;
        this.var_Ilol_IIl = ilol;
        if (ilol.II1I(1265)) {
            if (this.IIO1 != 21 && this.IIO1 != 22 && this.IIO1 != 23) {
                if (this.IIO1 != 18 && this.IIO1 != 19 && this.IIO1 != 20) {
                    Ilol ilol2 = this.var_Ilol_IIl;
                    ilol2.I_o_ += 15 * this.var_Ilol_IIl.IOI1;
                } else {
                    Ilol ilol3 = this.var_Ilol_IIl;
                    ilol3.I_o_ += -15 * this.var_Ilol_IIl.IOI1;
                }
            } else {
                Ilol ilol4 = this.var_Ilol_IIl;
                ilol4.I_o_ += 10 * this.var_Ilol_IIl.IOI1;
            }
        }
        this.var_int_II = this.var_Ilol_IIl.I_o_;
        this.var_int_III = this.var_Ilol_IIl.I_oO;
        this.III1 = this.var_Ilol_IIl.IOI1;
        this.III_ = this.III1 == -1 ? 2 : 0;
        this.var_I____III = i___;
        this.II0I = n4;
        this.IlOO = IO10.IIII();
        this.II_ = s;
        this.IoII = s2;
        this.I_Ol = false;
        this.I1l1 = false;
        this.II0 = 4;
        this.IOl_();
        this.IOlI();
    }

    public I111(int n, int n2, int n3, int n4, int n5, int n6, int n7, short s, I___[] i___Array) {
        byte[] byArray = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
        byArray = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
        byArray = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
        this.I1oI = 0;
        this.II0l = 0;
        this.I1O = 0;
        this.IIO1 = n;
        this.IIO_ = n2;
        this.var_int_IIlI = n3;
        this.var_int_II = n4;
        this.var_int_III = n5;
        this.II0I = n6;
        this.III1 = n7;
        this.III_ = n7 == -1 ? 2 : 0;
        this.IlOO = IO10.IIII();
        this.II_ = s;
        this.I_Ol = false;
        this.I1l1 = false;
        this.II0 = 4;
        if (i___Array != null) {
            this.var_I____arr_II = new I___[i___Array.length];
            for (n = 0; n < this.var_I____arr_II.length; ++n) {
                this.var_I____arr_II[n] = i___Array[n];
            }
        }
        this.IOl_();
        this.IOlI();
    }

    private void IOlI() {
        try {
            int n = this.var_int_III;
            int n2 = this.var_int_II;
            try {
                I_Ol.IIlO(3);
            }
            catch (Exception exception) {
                I_Ol.II_l(I111.Ill("\ua799\ua7a9\ua848\ua819\ua82b\ua812\ua8e2\ua8e6\ua8bb\ua886\ua97c\ua955\ua903\ua904\ua9e7\ua9c1\ua9a0\ua9b4\uaa4f\uaa67\uaa0c\uaa5d\uaaa6", 42972) + exception.toString());
            }
            switch (this.IIO1) {
                case 0: 
                case 1: 
                case 2: {
                    n = this.IIO1;
                    switch (n) {
                        case 0: {
                            this.var_I11o_IIlI = new I11o(4);
                            break;
                        }
                        case 1: {
                            this.var_I11o_IIlI = new I11o(5);
                            break;
                        }
                        case 2: {
                            this.var_I11o_IIlI = new I11o(6);
                        }
                    }
                    this.IIO0 = 100;
                    this.I1_O = II.var_int_IIlI / 3 + 10;
                    this.I1 = 10;
                    this.Ioll = 0;
                    this.I_Ol = false;
                    return;
                }
                case 3: {
                    this.III();
                    return;
                }
                case 9: {
                    this.I1oI = this.IIO_;
                    this.I1I = this.var_int_II * 1000;
                    this.Ioll = this.var_int_III * 1000;
                    this.IIO0 = I_Ol.III_(4, 6);
                    this.I1_0 = 5;
                    this.I1ol = 10;
                    this.I1o1 = 20;
                    this.II(this.I1_0, this.I1ol, this.I1o1, 0);
                    return;
                }
                case 10: 
                case 11: {
                    this.IO11();
                }
                default: {
                    return;
                }
                case 16: 
                case 17: {
                    if (this.IIO1 == 17) {
                        this.var_int_II += this.III1 == 0 ? 0 : -this.var_I11o_arr_II[0].II0I;
                        this.var_int_III -= this.var_I11o_arr_II[0].I_O0 / 2;
                    }
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    this.var_byte_arr_IIl = null;
                    this.II0 = 3;
                    if (this.IIO1 == 18) {
                        if (this.IIO_ == 0) {
                            this.var_byte_arr_IIl = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
                            break;
                        }
                        this.var_byte_arr_IIl = new byte[]{3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6};
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    if (this.var_Ilol_IIl != null) {
                        if (this.IIO1 == 21) {
                            this.var_int_II = this.var_Ilol_IIl.I_o_ - 3 * this.var_Ilol_IIl.IOI1;
                            this.var_int_III = this.var_Ilol_IIl.I_oO;
                            break;
                        }
                        if (this.IIO1 == 22) {
                            this.var_int_II = this.var_Ilol_IIl.I_o_ + 20 * this.var_Ilol_IIl.IOI1;
                            this.var_int_III = this.var_Ilol_IIl.I_oO - 4;
                            break;
                        }
                        if (this.IIO1 == 23) {
                            this.var_int_II = this.var_Ilol_IIl.I_o_;
                            this.var_int_III = this.var_Ilol_IIl.I_oO - 50;
                            break;
                        }
                        this.var_int_II = this.var_Ilol_IIl.I_o_;
                        this.var_int_III = this.var_Ilol_IIl.I_oO;
                    }
                    return;
                }
                case 24: {
                    this.IIII = this.var_I11o_arr_II[0].II0I;
                    this.var_int_IIIl = this.var_I11o_arr_II[0].I_O0;
                    this.I1_0 = I_Ol.II1(this.var_int_II - this.var_I____III.I_O0);
                    this.var_byte_arr_IIl = new byte[]{0, 0, 0, 1, 1, 1};
                    this.I_Ol = false;
                    return;
                }
                case 25: {
                    this.IIII();
                    return;
                }
                case 26: {
                    this.var_byte_arr_IIl = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
                    this.I_Ol = false;
                    this.IIOo = 10;
                    this.I1I = this.var_int_II;
                    this.Ioll = this.var_int_III + 12;
                    this.I1OI = 25;
                    this.I1_O = 19;
                    if (this.IIO_ == 1) {
                        this.I1_O = 21;
                    } else if (this.IIO_ == 2) {
                        this.I1_O = 31;
                    }
                    this.var_int_IIIl = this.var_I11o_arr_II[1].I_O0 + 50 - this.I1_O;
                    this.I1 = 1;
                    this.I1__ = 1;
                    this.var_int_III = this.Ioll - this.var_int_IIIl;
                    this.I10 = 90;
                    this.I1_0 = 1;
                    this.IIl_ = 25;
                    this.I10I = 25;
                    this.I101 = 1;
                    if (this.var_I____arr_II != null && this.var_I____arr_II.length > 0) {
                        this.I101 = this.var_I____arr_II.length;
                    }
                    this.I10l = 360 / this.I101;
                    this.Il_l = new int[this.I101];
                    this.Il_1 = new int[this.I101];
                    this.Il__ = new int[this.I101];
                    this.Il_O = new int[this.I101];
                    I1_I.II(16, 0, this.var_int_IIlI, this.I1I, this.Ioll, 1, 0, (short)-1, null);
                    return;
                }
            }
        }
        catch (Exception exception) {
            I_Ol.II_l(I111.Ill("\ua799\ua7a9\ua848\ua819\ua83b\ua805\ua8f3\ua8d4\ua8a0\ua896\ua94d\ua974\ua936\ua909\ua9eb\ua9ce\ua9b8\ua9d1\uaa2a", 42972) + exception.toString());
            this.I1l1 = true;
        }
    }

    public void IIl1() {
        try {
            ++this.II0l;
            switch (this.IIO1) {
                case 0: 
                case 1: 
                case 2: {
                    this.var_int_II = II.var_int_IIll;
                    this.var_int_III = this.Ioll;
                    if (this.II0l > this.IIO0) {
                        this.I1l1 = true;
                    }
                    ++this.I1;
                    if (this.I1 > 15) {
                        this.I1 = 15;
                    }
                    if (this.Ioll + this.I1 >= this.I1_O) {
                        this.Ioll = this.I1_O;
                        if (!this.I_Ol) {
                            this.I_Ol = true;
                            if (this.IIO_ != -1) {
                                I1_I.II(this.IIO_, 0, 0, this.var_int_II, this.var_int_III, this.II0I, 0, (short)-1, null);
                            }
                        }
                        return;
                    }
                    this.Ioll += this.I1;
                    break;
                }
                case 3: {
                    I111 i111 = this;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I___ i___ = (I___)i111.II_I.elementAt(i);
                        i___.IIl1();
                        if (i___.var_int_IIO1 - i___.IIO_ <= i___.IIl_.I_Oo * 3 - 1) continue;
                        i___.var_int_IIO1 = 0;
                        if (i111.IIO_ != 0) continue;
                        i___.IIO_ = I_Ol.IIlO(10);
                        int n = 1;
                        if (i % 2 == 0) {
                            n = -1;
                        }
                        i___.I_O0 = i111.var_int_II + I_Ol.IIlO(var_short_arr_arr_IIIl[5][0] / 2) * n;
                        i___.I_Oo = i111.var_int_III - I_Ol.IIlO(var_short_arr_arr_IIIl[5][1] / 2);
                    }
                    if (i111.II0l >= i111.IIO0) {
                        i111.I1l1 = true;
                    }
                    return;
                }
                case 9: {
                    I111 i111 = this;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I1o1 i1o1;
                        I1o1 i1o12 = i1o1 = (I1o1)i111.II_I.elementAt(i);
                        I1o1 i1o13 = i1o1;
                        i1o13.II0I += i1o12.IIO;
                        i1o12.I_Oo += i1o12.IIO;
                        i1o12.I_O0 += i1o12.IIOI;
                        i1o12.I_0 += i1o12.IIOI;
                        ++i1o12.IIOl;
                        if (i111.II0l < i111.IIO0) continue;
                        i111.II_I.removeElement(i1o1);
                        --i;
                    }
                    if (i111.II0l >= i111.IIO0) {
                        if (II.var_long_II - i111.IlOO >= (long)i111.II_) {
                            i111.II_I.removeAllElements();
                            i111.I1l1 = true;
                            break;
                        }
                        i111.IIO0 = I_Ol.III_(4, 6);
                        i111.II0l = 0;
                        i111.II(i111.I1_0, i111.I1ol, i111.I1o1, 0);
                    }
                    return;
                }
                case 10: 
                case 11: {
                    I111 i111 = this;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I___ i___ = (I___)i111.II_I.elementAt(i);
                        i___.IIl1();
                        if (i___.I_Oo >= i111.I1_o) continue;
                        i111.II_I.removeElementAt(i);
                        --i;
                    }
                    if (i111.II0l >= i111.IIO0) {
                        i111.I1l1 = true;
                    }
                }
                default: {
                    return;
                }
                case 16: 
                case 17: {
                    if (this.II_ > 0) {
                        if (II.var_long_II - this.IlOO >= (long)this.II_) {
                            this.I1l1 = true;
                            break;
                        }
                    } else if (this.II0l >= this.var_I11o_arr_II[0].I_Oo * this.II0) {
                        this.I1l1 = true;
                    }
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    if (this.var_Ilol_IIl != null) {
                        this.var_int_II = this.var_Ilol_IIl.I_o_;
                        this.var_int_III = this.var_Ilol_IIl.I_oO + 13;
                    }
                    if (this.II_ > 0) {
                        if (II.var_long_II - this.IlOO >= (long)this.II_) {
                            this.I1l1 = true;
                            break;
                        }
                    } else if (this.var_byte_arr_IIl != null) {
                        if (this.II0l > this.var_byte_arr_IIl.length) {
                            this.I1l1 = true;
                            break;
                        }
                    } else if (this.II0l >= this.var_I11o_arr_II[0].I_Oo * this.II0) {
                        this.I1l1 = true;
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    if (this.var_Ilol_IIl != null) {
                        if (this.IIO1 == 21) {
                            this.var_int_II = this.var_Ilol_IIl.I_o_ - 3 * this.var_Ilol_IIl.IOI1;
                            this.var_int_III = this.var_Ilol_IIl.I_oO;
                        } else if (this.IIO1 == 22) {
                            this.var_int_II = this.var_Ilol_IIl.I_o_ + 20 * this.var_Ilol_IIl.IOI1;
                            this.var_int_III = this.var_Ilol_IIl.I_oO - 4;
                        } else if (this.IIO1 == 23) {
                            this.var_int_II = this.var_Ilol_IIl.I_o_;
                            this.var_int_III = this.var_Ilol_IIl.I_oO - 50;
                        } else {
                            this.var_int_II = this.var_Ilol_IIl.I_o_;
                            this.var_int_III = this.var_Ilol_IIl.I_oO;
                        }
                    }
                    if (this.II_ > 0) {
                        if (II.var_long_II - this.IlOO >= (long)this.II_) {
                            this.I1l1 = true;
                            break;
                        }
                    } else if (this.II0l >= this.var_I11o_arr_II[0].I_Oo * this.II0) {
                        this.I1l1 = true;
                    }
                    return;
                }
                case 24: {
                    ++this.var_int_IIl;
                    this.IIII += 20;
                    if (this.IIII > this.I1_0) {
                        this.IIII = this.I1_0;
                    }
                    this.var_int_II = this.var_Ilol_IIl.I_o_ + 10;
                    this.var_int_III = this.var_Ilol_IIl.I_oO - 3;
                    if (this.III1 == -1) {
                        this.var_int_II = this.var_Ilol_IIl.I_o_ - this.IIII - 10;
                    }
                    if (!this.I_Ol && II.var_long_II - this.IlOO >= (long)this.II_) {
                        this.II0l = 0;
                        this.var_byte_arr_IIl = new byte[]{2, 2, 2, 3, 3, 3};
                        this.I_Ol = true;
                    }
                    if (this.II0l > this.var_byte_arr_IIl.length - 1) {
                        if (this.I_Ol) {
                            this.I1l1 = true;
                            break;
                        }
                        this.II0l = 0;
                    }
                    return;
                }
                case 25: {
                    I111 i111 = this;
                    int n = 0;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I___ i___ = (I___)i111.II_I.elementAt(i);
                        if (!i___.IIl && II.var_long_II - i111.IlOO >= (long)(i * i111.IIOo)) {
                            i___.IIl = true;
                            I1_I.II(17, 0, i111.var_int_IIlI, i111.var_Ilol_IIl.I_o_, i111.var_Ilol_IIl.I_oO - 3, 2, i111.III_, (short)-1, null);
                            i111.II_I.size();
                        }
                        if (i___.IIl && !i___.I__I) {
                            ++i___.var_int_IIO1;
                            if (!i___.I01o) {
                                if (i___.var_int_IIO1 < 10 && i == i111.II_I.size() - 1 && i111.var_Ilol_IIl != null && !IOlO.boolean_IIIl(i111.var_Ilol_IIl.I_o_ - (i111.var_Ilol_IIl.IO1_ + 1) * i111.var_Ilol_IIl.IOI1, i111.var_Ilol_IIl.I_oO, i111.var_Ilol_IIl.IOI1 == 1 ? 8 : 4)) {
                                    Ilol ilol = i111.var_Ilol_IIl;
                                    ilol.I_o_ -= i111.var_Ilol_IIl.IOI1;
                                }
                                int n2 = i___.IIlI;
                                int n3 = i___.IIOl;
                                int n4 = n3 - i___.I_O0;
                                int n5 = n2 - i___.I_Oo;
                                if (n4 > 1) {
                                    n4 = I_Ol.III1(n4, n5);
                                    i___.IoII = i___.IIlI(n4);
                                }
                                if (I_Ol.II1(i___.IIO) > 0 && I_Ol.II1(i___.I_O0 - n3) >= I_Ol.II1(i___.IIO)) {
                                    i___.I_O0 += i___.IIO;
                                } else {
                                    i___.I_O0 = n3;
                                    i___.IIO = 0;
                                }
                                if (I_Ol.II1(i___.IIOI) > 0 && I_Ol.II1(i___.I_Oo - n2) >= I_Ol.II1(i___.IIOI)) {
                                    i___.I_Oo += i___.IIOI;
                                } else {
                                    i___.I_Oo = n2;
                                    i___.IIOI = 0;
                                }
                                if (i___.I_O0 == i___.IIOl) {
                                    i___.I01o = true;
                                    i___.var_int_IIO1 = 0;
                                }
                            }
                            if (i___.I01o && i___.var_int_IIO1 >= i111.II0 * i___.var_I11o_IIlO.I_Oo) {
                                i___.I__I = true;
                            }
                        }
                        if (!i___.I__I) continue;
                        ++n;
                    }
                    if (n == i111.II_I.size()) {
                        i111.I1l1 = true;
                    }
                    return;
                }
                case 26: {
                    if (this.I1O == 0) {
                        ++this.Iol;
                        if (this.Iol > this.var_byte_arr_IIl.length - 1) {
                            this.Iol = this.var_byte_arr_IIl.length - 1;
                        }
                        if (this.II0l == this.IIOo + 4) {
                            I1_I.II(16, 1, this.var_int_IIlI, this.var_int_II, this.var_int_III, 3, 0, (short)2945, null);
                        }
                        if (this.II0l > this.IIOo + 4) {
                            --this.I10;
                            if (this.I10 < 0) {
                                this.I10 = 0;
                                this.II0l = 0;
                                this.var_int_IIl = 0;
                                this.var_byte_arr_IIlI = new byte[]{1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 2};
                                boolean bl = true;
                                I111 i111 = this;
                                if (this.var_I____arr_II != null) {
                                    for (int i = 0; i < i111.var_I____arr_II.length; ++i) {
                                        Object object;
                                        if (i111.var_I____arr_II[i] == null) continue;
                                        if (i111.var_I____arr_II[i].var_byte_IIO1 == 0) {
                                            object = I1_I.I_I__II(i111.var_I____arr_II[i].IIO0);
                                            if (object == null) continue;
                                            ((I_I_)object).I0I0 = true;
                                            continue;
                                        }
                                        object = i111.var_I____arr_II[i];
                                        Ilol ilol = Ilol.Ilol_II().IOI_ == ((I___)object).IIO0 ? Ilol.Ilol_II() : I1_I.Ilol_II(i111.var_I____arr_II[i].IIO0);
                                        if (ilol == null) continue;
                                        ilol.I100 = true;
                                    }
                                }
                                this.I1O = 1;
                            } else {
                                if (this.I1_0 < 40) {
                                    this.I1_0 += 2;
                                }
                                this.I10I = this.IIl_;
                                this.I10I -= this.I1_0;
                                if (this.I10I >= 360) {
                                    this.I10I -= 360;
                                }
                                if (this.I10I < 0) {
                                    this.I10I += 360;
                                }
                                this.IIl_ = this.I10I;
                                I111 i111 = this;
                                int n = 0;
                                while (true) {
                                    if (n >= i111.Il_1.length) {
                                        this.IIlI(true);
                                        break;
                                    }
                                    if (i111.I10I >= 360) {
                                        i111.I10I -= 360;
                                    }
                                    if (i111.I10I < 0) {
                                        i111.I10I += 360;
                                    }
                                    i111.Il_1[n] = I_Ol.II1(i111.I10 * I_Ol.IIll(i111.I10I) / 1024);
                                    i111.Il_l[n] = I_Ol.II1(i111.I10 * I_Ol.IIl1(i111.I10I) / 1024);
                                    if (i111.I10I < 90) {
                                        i111.Il__[n] = i111.var_int_II + i111.Il_l[n];
                                        i111.Il_O[n] = i111.var_int_III - i111.Il_1[n];
                                    } else if (i111.I10I >= 90 && i111.I10I < 180) {
                                        i111.Il__[n] = i111.var_int_II - i111.Il_l[n];
                                        i111.Il_O[n] = i111.var_int_III - i111.Il_1[n];
                                    } else if (i111.I10I >= 180 && i111.I10I < 270) {
                                        i111.Il__[n] = i111.var_int_II - i111.Il_l[n];
                                        i111.Il_O[n] = i111.var_int_III + i111.Il_1[n];
                                    } else {
                                        i111.Il__[n] = i111.var_int_II + i111.Il_l[n];
                                        i111.Il_O[n] = i111.var_int_III + i111.Il_1[n];
                                    }
                                    i111.I10I -= i111.I10l;
                                    ++n;
                                }
                            }
                            return;
                        }
                    } else if (this.I1O == 1) {
                        ++this.var_int_IIl;
                        if (this.var_int_IIl > this.var_byte_arr_IIlI.length - 1) {
                            this.var_int_IIl = this.var_byte_arr_IIlI.length - 1;
                            if (II.var_int_IIIO % 2 == 0) {
                                ++this.I1__;
                            }
                            this.I1 += this.I1__;
                            if (this.I1 >= this.var_int_IIIl - this.var_I11o_arr_II[0].I_O0 - this.I1OI + this.I1_O) {
                                this.I1 = this.var_int_IIIl - this.var_I11o_arr_II[0].I_O0 - this.I1OI + this.I1_O;
                                this.II0l = 0;
                                this.var_int_IIl = 0;
                                this.I1O = 2;
                                this.var_byte_arr_IIlI = new byte[]{3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
                                return;
                            }
                        }
                    } else if (this.I1O == 2) {
                        ++this.var_int_IIl;
                        if (this.var_int_IIl > this.var_byte_arr_IIlI.length - 1) {
                            this.I1O = 3;
                            this.Iol = 0;
                            this.var_byte_arr_IIl = new byte[]{2, 2, 1, 1, 0, 0, 3, 3, 3, 0, 0, 0, 4, 4, 4, 0, 0};
                            return;
                        }
                    } else if (this.I1O == 3) {
                        ++this.Iol;
                        if (this.Iol > this.var_byte_arr_IIl.length - 1) {
                            this.Iol = 0;
                            this.I1O = 4;
                            this.var_byte_arr_IIl = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 4, 4};
                            return;
                        }
                    } else {
                        ++this.Iol;
                        if (this.Iol > this.var_byte_arr_IIl.length - 1) {
                            this.Iol = 0;
                        }
                        if (II.var_long_II - this.IlOO >= (long)this.II_) {
                            I1_I.II(16, 0, this.var_int_IIlI, this.I1I, this.Ioll, 1, 0, (short)-1, null);
                            this.IIlI(false);
                            this.I1l1 = true;
                        }
                    }
                    return;
                }
            }
        }
        catch (Exception exception) {
            I_Ol.II_l(I111.Ill("\ua799\ua7a9\ua848\ua819\ua82d\ua807\ua8f2\ua8d4\ua8a0\ua896\ua928\ua911", 42972) + exception.toString());
            this.I1l1 = true;
        }
    }

    public void II(IO1l iO1l) {
        try {
            if (this.I1l1 || this.II0l < 0) {
                return;
            }
            switch (this.IIO1) {
                case 0: 
                case 1: 
                case 2: {
                    if (this.var_I11o_IIlI != null) {
                        this.var_I11o_IIlI.II(this.II0l / 5 % this.var_I11o_IIlI.I_Oo, this.var_int_II, this.var_int_III, 0, 33, iO1l);
                    }
                    return;
                }
                case 3: {
                    IO1l iO1l2 = iO1l;
                    I111 i111 = this;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I___ i___ = (I___)i111.II_I.elementAt(i);
                        if (i___.var_int_IIO1 - i___.IIO_ < 0 || i___.IIl_ == null) continue;
                        i___.IIl_.II((i___.var_int_IIO1 - i___.IIO_) / 3 % i___.IIl_.I_Oo, i___.I_O0, i___.I_Oo, 0, 3, iO1l2);
                    }
                    return;
                }
                case 9: {
                    IO1l iO1l3 = iO1l;
                    I111 i111 = this;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I1o1 i1o1 = (I1o1)i111.II_I.elementAt(i);
                        if (i1o1 == null) continue;
                        int n = 0;
                        if (i / 2 < i111.Il_0.length) {
                            n = i111.Il_0[i / 2];
                        }
                        iO1l3.Illl(n);
                        iO1l3.IIII(i1o1.II0I / 1000, i1o1.I_O0 / 1000, i1o1.I_Oo / 1000, i1o1.I_0 / 1000);
                        if (!i1o1.IOOO) continue;
                        iO1l3.IIII(i1o1.II0I / 1000 + 1, i1o1.I_O0 / 1000, i1o1.I_Oo / 1000 + 1, i1o1.I_0 / 1000);
                    }
                    return;
                }
                case 10: 
                case 11: {
                    IO1l iO1l4 = iO1l;
                    I111 i111 = this;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I___ i___ = (I___)i111.II_I.elementAt(i);
                        if (i111.var_I11o_IIlI == null) continue;
                        i111.var_I11o_IIlI.II(i___.IoII, i___.I_O0, i___.I_Oo, 0, 3, iO1l4);
                    }
                }
                default: {
                    return;
                }
                case 16: {
                    if (this.IIO_ == 0) {
                        this.II(iO1l, 33);
                        return;
                    }
                    this.II(iO1l, 3);
                    return;
                }
                case 17: {
                    this.II(iO1l, 0);
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    boolean bl = true;
                    if (this.var_I11o_arr_II[0] != null) {
                        if (this.var_byte_arr_IIl != null) {
                            this.var_I11o_arr_II[0].II(this.var_byte_arr_IIl[this.II0l % this.var_byte_arr_IIl.length], this.var_int_II, this.var_int_III, this.III_, 33, iO1l);
                            break;
                        }
                        this.var_I11o_arr_II[0].II(this.II0l / this.II0 % this.var_I11o_arr_II[0].I_Oo, this.var_int_II, this.var_int_III, this.III_, 33, iO1l);
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    boolean bl = true;
                    if (this.var_I11o_arr_II[0] != null) {
                        this.var_I11o_arr_II[0].II(this.II0l / this.II0 % this.var_I11o_arr_II[0].I_Oo, this.var_int_II, this.var_int_III, this.III_, 3, iO1l);
                    }
                    return;
                }
                case 24: {
                    if (this.var_I11o_arr_II != null) {
                        iO1l.IIIO(this.var_int_II, this.var_int_III - this.var_int_IIIl / 2, this.IIII, this.var_int_IIIl);
                        I11o i11o = this.var_I11o_arr_II[0];
                        I11o i11o2 = this.var_I11o_arr_II[1];
                        I11o i11o3 = this.var_I11o_arr_II[2];
                        byte by = this.var_byte_arr_IIl[this.II0l];
                        int n = this.I1_0;
                        int n2 = this.var_int_III;
                        int n3 = this.var_int_II;
                        byte by2 = by;
                        I11o i11o4 = i11o3;
                        I11o i11o5 = i11o2;
                        I11o i11o6 = i11o;
                        IO1l iO1l5 = iO1l;
                        int n4 = n;
                        boolean bl = false;
                        if (i11o != null && i11o3 != null) {
                            bl = true;
                            n4 = n - (i11o.II0I + i11o3.II0I);
                        }
                        if (n4 > 0) {
                            int n5 = n4 / i11o2.II0I;
                            if (n4 % i11o2.II0I > 0) {
                                ++n5;
                            }
                            if (this.III1 == -1) {
                                for (n4 = 0; n4 < n5; ++n4) {
                                    int n6 = n4 == n5 - 1 ? (bl ? n3 + i11o4.II0I : n3 + n - i11o5.II0I) : (bl ? n3 + i11o4.II0I + i11o5.II0I + n4 * i11o5.II0I : n3 + n4 * i11o5.II0I);
                                    i11o5.II(by2, n6, n2 - i11o5.I_O0 / 2, 2, 0, iO1l5);
                                }
                            } else {
                                for (n4 = 0; n4 < n5; ++n4) {
                                    int n7 = n4 == n5 - 1 ? (bl ? n3 + n - (i11o5.II0I + i11o4.II0I) : n3 + n - i11o5.II0I) : (bl ? n3 + n4 * i11o5.II0I + i11o6.II0I : n3 + n4 * i11o5.II0I);
                                    i11o5.II(by2, n7, n2 - i11o5.I_O0 / 2, 0, 0, iO1l5);
                                }
                            }
                        }
                        if (this.III1 == -1) {
                            if (i11o6 != null) {
                                i11o6.II(by2, n3 + n - i11o6.II0I, n2 - i11o6.I_O0 / 2, 2, 0, iO1l5);
                            }
                            if (i11o4 != null) {
                                i11o4.II(by2, n3, n2 - i11o4.I_O0 / 2, 2, 0, iO1l5);
                            }
                        } else {
                            if (i11o6 != null) {
                                i11o6.II(by2, n3, n2 - i11o6.I_O0 / 2, 0, 0, iO1l5);
                            }
                            if (i11o4 != null) {
                                i11o4.II(by2, n3 + n - i11o4.II0I - 1, n2 - i11o4.I_O0 / 2, 0, 0, iO1l5);
                            }
                        }
                        if (this.III1 == -1 && this.var_I11o_arr_II[0] != null) {
                            this.var_I11o_arr_II[0].II(this.var_byte_arr_IIl[this.II0l], this.var_int_II + this.IIII - this.var_I11o_arr_II[0].II0I, this.var_int_III - this.var_I11o_arr_II[0].I_O0 / 2 - 1, 2, 0, iO1l);
                        }
                    }
                    return;
                }
                case 25: {
                    IO1l iO1l6 = iO1l;
                    I111 i111 = this;
                    for (int i = 0; i < i111.II_I.size(); ++i) {
                        I___ i___ = (I___)i111.II_I.elementAt(i);
                        if (!i___.IIl || i___.I__I) continue;
                        if (!i___.I01o) {
                            i___.II(iO1l6, i___.IIl_, 3, false);
                        }
                        if (!i___.I01o) continue;
                        i___.var_I11o_IIlO.II(i___.var_int_IIO1 / i111.II0 % i___.var_I11o_IIlO.I_Oo, i___.I_O0, i___.I_Oo, i111.III_, 3, iO1l6);
                    }
                    return;
                }
                case 26: {
                    if (this.var_I11o_arr_II != null) {
                        if (this.var_byte_arr_IIl != null) {
                            this.var_I11o_arr_II[0].II(this.var_byte_arr_IIl[this.Iol], this.I1I, this.Ioll, 0, 33, iO1l);
                        }
                        if (this.I1O == 1 || this.I1O == 2) {
                            int n = 33;
                            int n8 = this.I1OI;
                            if (this.var_byte_arr_IIlI[this.var_int_IIl] == 0 || this.var_byte_arr_IIlI[this.var_int_IIl] == 1) {
                                n = 3;
                                n8 = 0;
                            }
                            this.var_I11o_arr_II[1].II(this.var_byte_arr_IIlI[this.var_int_IIl], this.var_int_II, this.var_int_III + n8 + this.I1, 0, n, iO1l);
                        }
                    }
                    return;
                }
            }
        }
        catch (Exception exception) {
            I_Ol.II_l(exception.toString());
            this.I1l1 = true;
        }
    }

    private void III() {
        int n = I_Ol.III_(3, 5);
        this.IIO0 = 90;
        for (int i = 0; i < n; ++i) {
            I___ i___ = new I___();
            new I___().I_O0 = this.var_int_II + I_Ol.IIl0(4);
            i___.I_Oo = this.var_int_III + I_Ol.IIl0(5);
            if (this.IIO_ == 0) {
                i___.IIO_ = I_Ol.IIlO(10);
                int n2 = 1;
                if (i % 2 == 0) {
                    n2 = -1;
                }
                i___.I_O0 = this.var_int_II + I_Ol.IIlO(var_short_arr_arr_IIIl[5][0] / 2) * n2;
                i___.I_Oo = this.var_int_III - I_Ol.IIlO(var_short_arr_arr_IIIl[5][1] / 2);
                i___.IIl_ = new I11o(7);
            }
            this.II_I.addElement(i___);
        }
    }

    private void IIII() {
        this.var_int_II = this.var_Ilol_IIl.I_o_ + 20 * this.var_Ilol_IIl.IOI1;
        this.IIOo = this.II_ / 15;
        if (this.var_I____III != null) {
            for (int i = 0; i < 15; ++i) {
                int n;
                I___ i___ = new I___();
                new I___().IIl_ = this.var_I11o_arr_II[0];
                i___.var_I11o_IIlO = this.var_I11o_arr_II[2];
                i___.I_O0 = this.var_int_II;
                i___.I_Oo = this.var_int_III;
                if (this.var_I____III != null) {
                    i___.IIOl = this.var_I____III.I_O0;
                    i___.IIlI = this.var_I____III.I_Oo;
                    if (this.IoII > 0) {
                        i___.IIOl += I_Ol.IIIl(0, this.IoII);
                        i___.IIlI += I_Ol.IIIl(0, this.IoII);
                    }
                }
                this.I1_0 = I_Ol.III_(9, 12);
                if (i == 14) {
                    i___.IIl_ = this.var_I11o_arr_II[1];
                    i___.var_I11o_IIlO = this.var_I11o_arr_II[3];
                    i___.IIOl = this.var_I____III.I_O0;
                    i___.IIlI = this.var_I____III.I_Oo;
                    this.I1_0 = 9;
                }
                i___.IIl = false;
                i___.I01o = false;
                i___.I__I = false;
                i___.I_0 = n = this.I1_0;
                n = i___.IIOl - i___.I_O0;
                int n2 = i___.IIlI - i___.I_Oo;
                int n3 = I_Ol.III1(n, n2);
                i___.IoII = i___.IIlI(n3);
                int n4 = I_Ol.IIIO(n, n2) / i___.I_0;
                if (n4 == 0) {
                    n4 = 1;
                }
                n3 = n / n4;
                int n5 = n2 / n4;
                if (n3 == 0 && n < n4) {
                    int n6 = n3 = n < 0 ? -1 : 1;
                }
                if (n5 == 0 && n2 < n4) {
                    int n7 = n5 = n2 < 0 ? -1 : 1;
                }
                if (I_Ol.II1(n3) > I_Ol.II1(n)) {
                    n3 = n;
                }
                if (I_Ol.II1(n5) > I_Ol.II1(n2)) {
                    n5 = n2;
                }
                i___.IIO = n3;
                i___.IIOI = n5;
                this.II_I.addElement(i___);
            }
        } else {
            this.I1l1 = true;
        }
    }

    private void II(int n, int n2, int n3, int n4) {
        if (this.II0l == -1) {
            this.II_I.removeAllElements();
        }
        this.Il_0 = new int[4];
        if (n3 <= n2) {
            n3 = n2 + 1;
        }
        for (n4 = 0; n4 < 4; ++n4) {
            this.Il_0[n4] = I_Ol.IIlO(2) == 0 ? var_int_arr_arr_IIIl[this.I1oI][I_Ol.IIlO(3)] : var_int_arr_arr_IIIl[this.I1oI][2];
        }
        for (n4 = 0; n4 < 4; ++n4) {
            I1o1 i1o1 = new I1o1();
            int n5 = 45 + n4 * 45 - 5;
            int n6 = 5 + n4 * 45;
            if (n5 <= n6) {
                n5 = n6 + 1;
            }
            int n7 = I_Ol.III_(n2, n3);
            int n8 = I_Ol.III_(n, n + 3);
            n6 = I_Ol.III_(n6, n5);
            n5 = I_Ol.III_(13, 23);
            boolean bl = I_Ol.IIlO(4) == 0;
            n6 = I_Ol.IIl_(n6 % 360);
            i1o1.II(this.I1I - I_Ol.IIll(n6) * (n7 + n5), this.Ioll - I_Ol.IIl1(n6) * (n7 + n5), this.I1I - I_Ol.IIll(n6) * n5, this.Ioll - I_Ol.IIl1(n6) * n5, I_Ol.IIll(n6) * n8, I_Ol.IIl1(n6) * n8, bl);
            this.II_I.addElement(i1o1);
            i1o1 = new I1o1();
            n6 = I_Ol.IIl_((n6 + 180 + I_Ol.IIIl(2, 5)) % 360);
            i1o1.II(this.I1I - I_Ol.IIll(n6) * (n7 + n5), this.Ioll - I_Ol.IIl1(n6) * (n7 + n5), this.I1I - I_Ol.IIll(n6) * n5, this.Ioll - I_Ol.IIl1(n6) * n5, I_Ol.IIll(n6) * n8, I_Ol.IIl1(n6) * n8, bl);
            this.II_I.addElement(i1o1);
        }
    }

    private void IO11() {
        this.var_I11o_IIlI = new I11o(8);
        this.IIO0 = I_Ol.III_(23, 27);
        int n = I_Ol.III_(1, 3);
        this.I1_o = this.var_int_III - 40;
        for (int i = 0; i < n; ++i) {
            I___ i___ = new I___();
            new I___().I_O0 = this.var_int_II + I_Ol.IIIl(0, 20);
            i___.I_Oo = this.var_int_III + I_Ol.IIl0(7);
            i___.IoII = this.IIO1 == 10 ? I_Ol.III_(0, this.var_I11o_IIlI.I_Oo - 2) : (this.IIO1 == 11 ? I_Ol.III_(2, this.var_I11o_IIlI.I_Oo) : I_Ol.III_(0, this.var_I11o_IIlI.I_Oo));
            I_Ol.IIlO(2);
            i___.IIOI = -I_Ol.III_(1, 4);
            this.II_I.addElement(i___);
        }
    }

    private void IIlI(boolean bl) {
        if (this.var_I____arr_II != null) {
            for (int i = 0; i < this.var_I____arr_II.length; ++i) {
                Object object;
                if (this.var_I____arr_II[i] == null) continue;
                if (this.var_I____arr_II[i].var_byte_IIO1 == 0) {
                    object = I1_I.I_I__II(this.var_I____arr_II[i].IIO0);
                    if (object == null) continue;
                    ((I_I_)object).I_O_ = bl;
                    ((I_I_)object).I0I0 = false;
                    ((I_I_)object).I10I = this.Il__[i];
                    ((I_I_)object).IIl_ = this.Il_O[i];
                    continue;
                }
                object = this.var_I____arr_II[i];
                Ilol ilol = Ilol.Ilol_II().IOI_ == ((I___)object).IIO0 ? Ilol.Ilol_II() : I1_I.Ilol_II(this.var_I____arr_II[i].IIO0);
                if (ilol == null) continue;
                ilol.I_11 = bl;
                ilol.I100 = false;
                ilol.I000 = this.Il__[i];
                ilol.I00o = this.Il_O[i];
            }
        }
    }

    private void IOl_() {
        int n;
        int n2 = 0;
        int[] nArray = null;
        int[] nArray2 = null;
        switch (this.IIO1) {
            case 16: {
                n2 = 26;
                if (this.IIO_ == 0) {
                    nArray = new int[]{7};
                    nArray2 = new int[]{28};
                }
                if (this.IIO_ != 1) break;
                nArray = new int[]{2};
                nArray2 = new int[]{23};
                break;
            }
            case 17: {
                n2 = 25;
                nArray = new int[]{2};
                nArray2 = new int[]{16};
                break;
            }
            case 18: {
                n2 = 24;
                nArray = new int[1];
                nArray2 = new int[]{9};
                break;
            }
            case 19: {
                n2 = 25;
                nArray = new int[1];
                nArray2 = new int[]{14};
                break;
            }
            case 20: {
                n2 = 26;
                nArray = new int[1];
                nArray2 = new int[]{21};
                break;
            }
            case 21: {
                n2 = 24;
                nArray = new int[]{1};
                nArray2 = new int[]{10};
                break;
            }
            case 22: {
                n2 = 25;
                nArray = new int[]{1};
                nArray2 = new int[]{15};
                break;
            }
            case 23: {
                n2 = 26;
                nArray = new int[]{1};
                nArray2 = new int[]{22};
                break;
            }
            case 24: {
                n2 = 24;
                nArray = new int[]{2, 3, 4};
                nArray2 = new int[]{11, 12, 13};
                break;
            }
            case 25: {
                n2 = 25;
                nArray = new int[]{3, 4, 5, 6};
                nArray2 = new int[]{17, 18, 19, 20};
                break;
            }
            case 26: {
                n2 = 26;
                n = 0;
                int n3 = 0;
                if (this.IIO_ == 0) {
                    n = 4;
                    n3 = 25;
                } else if (this.IIO_ == 1) {
                    n = 5;
                    n3 = 26;
                } else if (this.IIO_ == 2) {
                    n = 6;
                    n3 = 27;
                }
                nArray = new int[]{n, 3};
                nArray2 = new int[]{n3, 24};
            }
        }
        if (nArray != null && nArray2 != null) {
            this.var_I11o_arr_II = new I11o[nArray.length];
            for (n = 0; n < nArray.length; ++n) {
                I11o i11o = IO10.II(I111.Ill("\ua78f\ua790\ua873\ua855\ua834\ua804\ua8c9", 42972) + n2 + I111.Ill("\ua783", 42972) + this.var_int_IIlI + I111.Ill("\ua783", 42972) + nArray[n]);
                if (i11o == null) {
                    i11o = new I11o(nArray2[n]);
                }
                if (i11o == null) continue;
                this.var_I11o_arr_II[n] = i11o;
            }
        }
    }

    private void II(IO1l iO1l, int n) {
        this.var_I11o_arr_II[0].II(this.II0l / this.II0 % this.var_I11o_arr_II[0].I_Oo, this.var_int_II, this.var_int_III, this.III1, n, iO1l);
    }

    static {
        var_short_arr_arr_IIIl = new short[][]{{68, 264, 4}, {30, 120, 4}, {66, 280, 4}, {0, 0, 1}, {111, 68, 2}, {90, 68, 2}, {125, 68, 2}, {47, 282, 6}, {10, 40, 4}, {92, 525, 7}, {62, 372, 6}, {80, 352, 4}, {80, 352, 4}, {80, 352, 4}, {72, 240, 3}, {20, 42, 3}, {65, 160, 4}, {50, 300, 6}, {84, 168, 2}, {90, 540, 6}, {180, 900, 6}, {62, 186, 3}, {34, 80, 4}, {140, 560, 4}, {64, 600, 6}, {36, 200, 5}, {35, 200, 5}, {50, 250, 5}, {50, 240, 6}};
        var_int_arr_arr_IIIl = new int[][]{{16310304, 16298056, 0xFFFFFF}, {7045120, 12643960, 0xFFFFFF}, {2407423, 11987199, 0xFFFFFF}};
    }

    private static /* synthetic */ String Ill(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

