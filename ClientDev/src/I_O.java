package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I_O
extends IO1_ {
    private static I_O var_I_O_II;
    private static boolean I1_l;
    private static I11o var_I11o_IIl0;
    private static I11o IIlo;
    public static I11o II1;
    private static Image II1o;
    private static Image I1;
    private static Image II_;
    private static Image IlO;
    private static Image Iloo;
    private static Image IlO0;
    private static Image IlOo;
    private static Image I1I;
    private static Image I1II;
    private static Image I1Il;
    private static Image var_javax_microedition_lcdui_Image_IIIo;
    private static Image IIl;
    private static Image IIlI;
    private static Image IIll;
    private static Image[] var_javax_microedition_lcdui_Image_arr_IIIo;
    private static int I1__;
    private static int I1_O;
    private static int I1_0;
    private static int I1_o;
    private static int I1O;
    private static int I1OI;
    public static int I_O0;
    public static int I_Oo;
    public static int I_0;
    private static int I1Ol;
    public static int IIO;
    private static int I1O1;
    private static int[] var_int_arr_I101;
    private static int[] var_int_arr_I10_;
    private static int[][] IIlO;
    private static int[][] var_int_arr_arr_IIl0;
    private static int[] I10O;
    private int I10I;
    private int[] var_int_arr_I100;
    private int I10l;
    private int var_int_I101;
    private int IIOO = 0;
    public static I_lO IlII;
    public static I_lO IlIl;
    private static int var_int_I10_;
    private I10I var_I10I_II;
    private int var_int_I100 = 0;
    private int I10o = 0;
    private int I1o;
    private int I1oI;
    private int I1ol;

    public static I_O II() {
        if (var_I_O_II == null) {
            var_I_O_II = new I_O();
        }
        return var_I_O_II;
    }

    public I_O() {
        I1_l = true;
        Image image = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u8298\u82e0\u829d\u8362\u834c", 33207));
        Image image2 = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a3\u8281\u82be\u8283\u836b", 33207));
        Image image3 = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a2\u829c\u82e0\u829d\u8362\u834c", 33207));
        var_I11o_IIl0 = new I11o(image, 28, 28);
        IIlo = new I11o(image2, 30, 30);
        II1 = new I11o(image3, 11, 11);
        II1o = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a0\u8281\u82be\u8283\u836b", 33207));
        II_ = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u8281\u82be\u8283\u836b", 33207));
        IlO = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a2\u8281\u82be\u8283\u836b", 33207));
        I1 = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u8298\u82e0\u829d\u8362\u834c", 33207));
        Iloo = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a4\u8281\u82be\u8283\u836b", 33207));
        IlO0 = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a5\u8281\u82be\u8283\u836b", 33207));
        IlOo = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a6\u8281\u82be\u8283\u836b", 33207));
        var_javax_microedition_lcdui_Image_arr_IIIo = new Image[7];
        for (int i = 0; i < 7; ++i) {
            I_O.var_javax_microedition_lcdui_Image_arr_IIIo[i] = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e", 33207) + (i + 7) + I_O.Il0("\u8199\u81a6\u819b\u8273", 33207));
        }
        I1I = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u829b\u82e0\u829d\u8362\u834c", 33207));
        I1II = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u829a\u82e0\u829d\u8362\u834c", 33207));
        I1Il = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u8299\u82e0\u829d\u8362\u834c", 33207));
        I1 = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u8297\u82e0\u829d\u8362\u834c", 33207));
        IIl = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a1\u8296\u82e0\u829d\u8362\u834c", 33207));
        IIlI = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a2\u829f\u82e0\u829d\u8362\u834c", 33207));
        IIll = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a2\u829e\u82e0\u829d\u8362\u834c", 33207));
        var_javax_microedition_lcdui_Image_IIIo = IO10.IIII(I_O.Il0("\u8198\u81a4\u8194\u8270\u8252\u8220\u825e\u82a2\u829d\u82e0\u829d\u8362\u834c", 33207));
        I1_0 = 200;
        I1_o = 219;
        I1__ = II.var_int_IIll - (I1_0 + 40) / 2;
        I1_O = II.var_int_IIl1 - I1_o / 2;
        I_O0 = I1__ + I1_0 - 81;
        I_Oo = I1_O + 29;
        I_0 = 120;
        IIO = 80;
        IIlO = new int[][]{{I1__ + 34, I1_O + I1_o - 42}, {I1__ + I1_0 / 2 - Iloo.getWidth() / 2, I1_O + I1_o / 2 + 33}, {I1__ + I1_0 - 41, I1_O + I1_o - 42}};
        var_int_arr_arr_IIl0 = new int[][]{{I1__ + 25, I1_O + I1_o - 82}, {I1__ + 57, I1_O + I1_o - 62}, {I1__ + I1_0 / 2 - 14, I1_O + I1_o - 102}, {I1__ + I1_0 - 57 - 28, I1_O + I1_o - 62}, {I1__ + I1_0 - 25 - 28, I1_O + I1_o - 82}};
        this.var_int_arr_I100 = new int[2];
        this.I10I = 0;
        I1O = I1__ + 73;
        I1OI = I1_O + I1_o / 2 + 5;
        I1O1 = I1_O + I1_o - 22;
        var_int_arr_I101 = new int[]{I1__ + I1_0 / 2 - 8 - 80, I1__ + I1_0 / 2 - 8, I1__ + I1_0 / 2 - 8 + 80};
        var_int_arr_I10_ = new int[3];
        this.I1oI = I_Oo + 10 + 70;
        this.I1ol = 0;
        IlII = new I_lO("");
        IlIl = new I_lO("");
        this.I10l = 1;
        this.var_int_I101 = 2;
    }

    public void II(I_lO i_lO, int n, int n2) {
        IlII = i_lO;
        var_int_I10_ = n;
        this.I10l = 1;
        this.IIOO = 2;
        this.IOl_();
        I1_l = true;
        I_O.IO11();
        this.var_int_I101 = I1_l ? i_lO.size() / 5 + (i_lO.size() % 5 > 0 ? 1 : 0) : IlIl.size() / 5 + (IlIl.size() % 5 > 0 ? 1 : 0);
    }

    public static void III0(int n, int n2) {
        var_int_I10_ = n;
    }

    public static void IO11() {
        IlIl = new I_lO("");
        for (int i = 0; i < IlII.size(); ++i) {
            I10I i10I = (I10I)IlII.elementAt(i);
            if (i10I == null || i10I.IIOO != 1) continue;
            IlIl.addElement(i10I);
        }
    }

    private void IOl_() {
        I_lO i_lO = IlIl;
        if (I1_l) {
            i_lO = IlII;
        }
        if (this.I10l < 1) {
            this.I10l = 1;
        }
        int n = (this.I10l - 1) * 5;
        int n2 = n + 5;
        for (int i = n; i < n2; ++i) {
            if (i < 0 || i >= i_lO.size()) {
                I_O.I10O[i - n] = -1;
                continue;
            }
            I10I i10I = (I10I)i_lO.elementAt(i);
            if (i10I == null) continue;
            I_O.I10O[i - n] = i10I.IIO;
        }
        IO.II();
    }

    @Override
    public void void_IIlO() {
        try {
            if (IIO < 80 && (IIO += 4) > 80) {
                IIO = 80;
            }
            this.var_I10I_II = I10I.II(IlIl, I10O[this.IIOO]);
            if (I1_l) {
                this.var_I10I_II = I10I.II(IlII, I10O[this.IIOO]);
            }
            I1_I.I1_I_II().void_IIlO();
            if (II.var_int_IIIO % 10 < 6) {
                if (II.var_int_IIIO % 2 == 0) {
                    --this.I10I;
                }
            } else {
                this.I10I = 0;
            }
            if (this.var_I10I_II != null) {
                int n = this.var_I10I_II.IIO_ * 100 / this.var_I10I_II.II1O;
                this.I1ol = n * IIl.getHeight() / 100;
                n = var_int_I10_ * 100 / IlII.size();
                this.I1o = n * IIll.getWidth() / 100;
                return;
            }
        }
        catch (Exception exception) {
            System.out.println(I_O.Il0("\u819a\u81a3\u8185\u8270\u821e\u8220\u8210\u82f4\u82ce\u829d\u828e\u837e\u8306\u8324\u831c\u83e4\u83cb\u83fc\u83c5", 33207) + exception.toString());
        }
    }

    @Override
    public void I_Il() {
        if (!I1OO.I1l1) {
            if (II.var_boolean_IIIl && !Ilo_.II().I_10 && !II.var_I_II_II.IOol) {
                I_O i_O = this;
                if (!II.var_boolean_III0) {
                    I_O.var_int_arr_I10_[0] = 0;
                    I_O.var_int_arr_I10_[1] = 0;
                    I_O.var_int_arr_I10_[2] = 0;
                    this.var_int_arr_I100[0] = 0;
                    this.var_int_arr_I100[1] = 0;
                } else {
                    int n;
                    for (n = 0; n < 5; ++n) {
                        if (!II.II(var_int_arr_arr_IIl0[n][0], var_int_arr_arr_IIl0[n][1], 30, 30) || !II.var_boolean_III0 || !II.var_boolean_IIIo || n == i_O.IIOO) continue;
                        i_O.IIOO = n;
                        IIO = 0;
                    }
                    if (II.II(IIlO[0][0] - 5, IIlO[0][1] - 5, 20, 20)) {
                        if (II.var_boolean_IIIO) {
                            i_O.var_int_arr_I100[0] = 1;
                        }
                        if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                            i_O.IIII(0);
                            i_O.var_int_arr_I100[0] = 0;
                        }
                    }
                    if (II.II(IIlO[2][0] - 5, IIlO[2][1] - 5, 20, 20)) {
                        if (II.var_boolean_IIIO) {
                            i_O.var_int_arr_I100[1] = 1;
                        }
                        if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                            i_O.IIII(1);
                            i_O.var_int_arr_I100[1] = 0;
                        }
                    }
                    for (n = 0; n < var_int_arr_I101.length; ++n) {
                        if (!II.II(var_int_arr_I101[n] - 5, I1O1 - 5, 20, 20)) continue;
                        if (II.var_boolean_IIIO) {
                            I_O.var_int_arr_I10_[n] = 1;
                        }
                        if (!II.var_boolean_III0 || !II.var_boolean_IIIo) continue;
                        i_O.II(n);
                        I_O.var_int_arr_I10_[n] = 0;
                    }
                }
                if (II.II(I_O0, 0, I_0, I_Oo + IIO)) {
                    if (II.var_boolean_IIl) {
                        if (i_O.I10o == 0) {
                            i_O.I10o = II.var_int_III;
                        }
                        i_O.var_int_I100 = i_O.I10o - II.var_int_III;
                        if (i_O.var_int_I100 != 0) {
                            I1Ol += i_O.var_int_I100;
                            i_O.I10o = II.var_int_III;
                        }
                        if (I1Ol < 0) {
                            I1Ol = 0;
                        }
                        if (I1Ol > i_O.var_I10I_II.IIIl.IIlI) {
                            I1Ol = i_O.var_I10I_II.IIIl.IIlI;
                        }
                    } else {
                        i_O.I10o = 0;
                        i_O.I10o = 0;
                    }
                }
            }
            if (II.var_boolean_arr_II[8]) {
                II.var_boolean_arr_II[8] = false;
                this.IIOI(1);
            }
            if (II.var_boolean_arr_II[2]) {
                II.var_boolean_arr_II[2] = false;
                this.IIOI(-1);
            }
            if (II.var_boolean_arr_II[4]) {
                II.var_boolean_arr_II[4] = false;
                this.IIOl(1);
            }
            if (II.var_boolean_arr_II[6]) {
                II.var_boolean_arr_II[6] = false;
                this.IIOl(0);
            }
            if (II.var_boolean_arr_II[12]) {
                II.var_boolean_arr_II[12] = false;
                this.II(0);
            }
            if (II.var_boolean_arr_II[5]) {
                II.var_boolean_arr_II[5] = false;
                this.II(1);
            }
            if (II.var_boolean_arr_II[13]) {
                this.II(2);
            }
            II.IIIl();
        }
    }

    private void II(int n) {
        if (n == 0) {
            I1_l = !I1_l;
            this.I10l = 1;
            this.IIOO = 0;
            this.var_int_I101 = I1_l ? IlII.size() / 5 + (IlII.size() % 5 > 0 ? 1 : 0) : IlIl.size() / 5 + (IlIl.size() % 5 > 0 ? 1 : 0);
            this.IOl_();
            IIO = 0;
        } else if (n == 1) {
            if (this.var_I10I_II != null) {
                I_0_.II().IIl(1, this.var_I10I_II.IIO);
            }
        } else if (n == 2) {
            I1_I.I1_I_II().I0l_();
        }
        IO.II();
    }

    private void IIII(int n) {
        this.var_int_I101 = I1_l ? IlII.size() / 5 + (IlII.size() % 5 > 0 ? 1 : 0) : IlIl.size() / 5 + (IlIl.size() % 5 > 0 ? 1 : 0);
        if (this.var_int_I101 < 1) {
            this.var_int_I101 = 1;
        }
        int n2 = this.I10l;
        if (n == 0) {
            if (this.I10l == 1) {
                return;
            }
            if (--n2 <= 0) {
                n2 = 1;
            }
        } else {
            if (this.I10l == this.var_int_I101) {
                return;
            }
            if (++n2 > this.var_int_I101) {
                n2 = this.var_int_I101;
            }
            if (n2 < 1) {
                n2 = 1;
            }
        }
        if (n2 != this.I10l) {
            this.I10l = n2;
            this.IOl_();
        }
    }

    private void IIOI(int n) {
        if ((I1Ol += n * 12) < 0) {
            I1Ol = 0;
        }
        if (I1Ol > this.var_I10I_II.IIIl.IIlI) {
            I1Ol = this.var_I10I_II.IIIl.IIlI;
        }
    }

    private void IIOl(int n) {
        int n2 = this.IIOO;
        int n3 = this.I10l;
        n2 = n == 0 ? ++n2 : --n2;
        if (n2 >= I10O.length) {
            if (this.I10l < this.var_int_I101) {
                n2 = 0;
                ++n3;
            } else {
                n2 = I10O.length - 1;
            }
        }
        if (n2 < 0) {
            if (this.I10l > 1) {
                n2 = I10O.length - 1;
                --n3;
            } else {
                n2 = 0;
            }
        }
        if (n2 != this.IIOO) {
            this.IIOO = n2;
            I1Ol = 0;
            IIO = 0;
        }
        if (n3 != this.I10l) {
            this.I10l = n3;
            this.IOl_();
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        try {
            Object object;
            int n;
            int n2;
            int n3;
            I1_I.I1_I_II().III_(iO1l);
            iO1l.IIl0(-I1_I.Io1, -I1_I.Io1I);
            iO1l.IIl0(0, II.II10);
            I1_I.II1I(iO1l);
            iO1l.II(II1o, I1__, I1_O, 0);
            iO1l.II(IIlI, I1__ + I1_0 / 2 - IO10.III1(IIlI) / 2, I1_O - IO10.III_(IIlI) / 2 - 2, 0);
            iO1l.IIIO(I1__ + I1_0 / 2 - IO10.III1(IIlI) / 2 + 13, I1_O - IO10.III_(IIlI) / 2 + 3, this.I1o, IO10.III_(IIlI));
            iO1l.II(IIll, I1__ + I1_0 / 2 - IO10.III1(IIlI) / 2 + 13, I1_O - IO10.III_(IIlI) / 2 + 3, 0);
            I1_I.II1I(iO1l);
            iO1l.II(I1Il, var_int_arr_I101[0], I1O1 + var_int_arr_I10_[0], 0);
            iO1l.II(IlOo, var_int_arr_I101[1], I1O1 + var_int_arr_I10_[1], 0);
            iO1l.II(I1II, var_int_arr_I101[2], I1O1 + var_int_arr_I10_[2], 0);
            if (I1_l) {
                iO1l.II(I1I, 0, 0, 17, 17, 0, var_int_arr_I101[1], I1O1 + var_int_arr_I10_[1], 0);
            } else {
                iO1l.II(I1I, 0, 0, 17, 17, 1, var_int_arr_I101[1], I1O1 + var_int_arr_I10_[1], 0);
            }
            if (this.var_I10I_II != null) {
                iO1l.IIIO(I1__ + 30, I1_O + 13, I1_0 - 60, I1_o / 2);
                I10I i10I = this.var_I10I_II;
                n3 = I1OI;
                n2 = I1O;
                ++i10I.III;
                if (i10I.III > i10I.Il1.length - 1) {
                    i10I.III = 0;
                }
                n = 0;
                if (i10I.II10 == 0 && i10I.III0 != null && I_I_.var_I_Io_arr_II[i10I.III0.I1ll] != null) {
                    if (I_I_.var_I_Io_arr_II[i10I.III0.I1ll].II != null) {
                        I_I_.var_I_Io_arr_II[i10I.III0.I1ll].II.II(iO1l, i10I.Il1[i10I.III], n2, n3, 0, 0);
                        n = 1;
                    } else if (i10I.Ilo0 - II.var_long_II < 0L) {
                        i10I.Ilo0 = II.var_long_II + 1500L;
                        i10I.III0.I00();
                    }
                } else if (i10I.II10 != 0 && i10I.IIl1 != null) {
                    i10I.IIl1.II(iO1l, n2, n3, 1, i10I.Il1[i10I.III], true);
                    n = 1;
                }
                if (n == 0 && i10I.lIOl >= 0 && (object = IO10.II(I_O.Il0("\u81d6\u81a3\u8187\u8275\u826c", 33207) + i10I.lIOl)) != null) {
                    ((I11o)object).II(II.var_int_IIIO / 4 % ((I11o)object).I_Oo, n2, n3, 0, 33, iO1l);
                    n = 1;
                }
                if (n == 0) {
                    I_oo.IIII(iO1l, i10I.IIOl, n2, n3, 0, IOII.IIOI);
                }
                I1_I.II1I(iO1l);
                IO1I.IIIl.II(iO1l, (this.var_I10I_II.IIIo > 0 ? I_O.Il0("\u81fb\u81a0\u81db", 33207) + this.var_I10I_II.IIIo + I_O.Il0("\u8197", 33207) : "") + this.var_I10I_II.IIo_, I1__ + I1_0 / 2, I1_O + 15, 2);
                IO1I.var_IO1I_II1I.II(iO1l, I_O.Il0("\u81d9\u81b9\u81db", 33207) + this.var_I10I_II.IIOI, I1__ + 30, I_Oo - 2, 0);
                iO1l.II(var_javax_microedition_lcdui_Image_IIIo, I1__ + 36, I_Oo + 10, 0);
                iO1l.IIIO(I1__ + 36, this.I1oI - this.I1ol, 7, this.I1ol);
                iO1l.II(IIl, I1__ + 36, I_Oo + 10, 0);
                I1_I.II1I(iO1l);
                iO1l.II(var_javax_microedition_lcdui_Image_arr_IIIo[this.var_I10I_II.IIO1], I1__ + 39 - 5 + 14, I_Oo + 12, 0);
            }
            iO1l.IIIO(I_O0, I_Oo, I_0 + 5, IIO + 8);
            if (this.var_I10I_II != null) {
                iO1l.II(I1, I_O0, I_Oo, 0);
            }
            I1_I.II1I(iO1l);
            iO1l.IIIO(I_O0, I_Oo + 1, I_0, IIO + 5);
            if (this.var_I10I_II != null && this.var_I10I_II.IIIl != null) {
                if (this.var_I10I_II.IIIl.IIIO == null) {
                    return;
                }
                this.var_I10I_II.IIIl.II(iO1l, I1Ol);
            }
            I1_I.II1I(iO1l);
            if (!I1_l && IlIl.size() > 5 || I1_l) {
                if (this.I10l > 1) {
                    iO1l.II(II_, IIlO[0][0], IIlO[0][1] + this.var_int_arr_I100[0], 0);
                }
                if (this.I10l < this.var_int_I101) {
                    iO1l.II(IlO, IIlO[2][0], IIlO[2][1] + this.var_int_arr_I100[1], 0);
                }
            }
            for (int i = 0; i < I10O.length; ++i) {
                n3 = 0;
                n2 = 0;
                n = 0;
                if (i == this.IIOO) {
                    n3 = this.I10I;
                    n2 = -10;
                    n = 1;
                    iO1l.II(Iloo, var_int_arr_arr_IIl0[i][0] + 10, var_int_arr_arr_IIl0[i][1] + this.I10I + 29 + -10, 0);
                }
                object = I10I.II(IlIl, I10O[i]);
                if (I1_l) {
                    object = I10I.II(IlII, I10O[i]);
                }
                if (object != null) {
                    var_I11o_IIl0.II(((I10I)object).IIO1, var_int_arr_arr_IIl0[i][0], var_int_arr_arr_IIl0[i][1] + n3 + n2, 0, 0, iO1l);
                    I_oo.IIII(iO1l, ((I10I)object).IIOl, var_int_arr_arr_IIl0[i][0] + 14, var_int_arr_arr_IIl0[i][1] + 14 + n3 + n2, 0, IOII.IIOI);
                    ((I10I)object).III(iO1l, var_int_arr_arr_IIl0[i][0], var_int_arr_arr_IIl0[i][1] + n3 + n2);
                    if (((I10I)object).IIIo == 0) {
                        iO1l.II(IlO0, var_int_arr_arr_IIl0[i][0], var_int_arr_arr_IIl0[i][1] + n3 + n2, 0);
                    }
                    if (i == this.IIOO) {
                        var_I11o_IIl0.II(7, var_int_arr_arr_IIl0[i][0], var_int_arr_arr_IIl0[i][1] + n3 + n2, 0, 0, iO1l);
                    }
                    if (((I10I)object).IIOO != 1) continue;
                    var_I11o_IIl0.II(8, var_int_arr_arr_IIl0[i][0], var_int_arr_arr_IIl0[i][1] + n3 + n2, 0, 0, iO1l);
                    continue;
                }
                IIlo.II(n, var_int_arr_arr_IIl0[i][0] - 1, var_int_arr_arr_IIl0[i][1] - 1 + n3 + n2, 0, 0, iO1l);
            }
        }
        catch (Exception exception) {
            System.out.println(I_O.Il0("\u819a\u81a6\u8194\u827d\u825d\u8226\u825c\u82e2\u82ce\u82aa\u828c\u835f\u8348\u8338\u8344\u83e6\u83d2\u83aa\u8389\u843e\u8403", 33207) + exception.toString());
        }
    }

    @Override
    public void I0l_() {
        I1_I.I_1o = true;
        super.I0l_();
    }

    static {
        var_int_arr_I101 = new int[0];
        var_int_arr_I10_ = new int[0];
        I10O = new int[]{-2, -1, 0, 1, 2};
    }

    private static /* synthetic */ String Il0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

