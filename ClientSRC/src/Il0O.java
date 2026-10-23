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
public final class Il0O {
    public static I_lO IIIO = new I_lO(Il0O.II0_("\ua9af\ua9ba\uaa50\uaa16\uaa10\uaa12\uaaf5\uaad7\uaab2\uaa84", 43481));
    private int[] II0O;
    private int[] II00;
    private int[] II0o;
    private int[] IIo;
    private static int[] IIoI;
    private int IIO0;
    private int IIOo;
    private int II0;
    private int II;
    private int III;
    private int IIII;
    private int IIIl;
    private int III1;
    private int III_;
    private boolean I1I0;
    private static Image IIIo;
    private static Image IIl;
    private static Image IIlI;
    private static Image IIll;
    private static Image IIl1;
    private static Image IIl_;
    private static Image IIlO;
    private static Image IIl0;
    private int[] IIol;
    private int I1O;
    public int I_O0;
    private boolean[] IIIO;
    private int[] IIo1;
    private int[] IIo_;
    private boolean[] III0;
    private int I1OO;
    private int I1O0;
    private static int I1Oo;
    private static Image IIlo;
    private static Image II1;
    private static Image II1I;
    private static Image II1l;
    public static short IIII;
    private static Image II11;
    public static boolean II_;
    private static boolean I1Io;
    public static int IIO;
    private static Image II1_;
    private static Image II1O;
    private static int I100;
    private static int I10o;
    public static int IIOI;
    private static int I1o;
    private int[] IIoO = new int[]{0, 1, 2, 1, 0, 0};
    private int[] IIII;

    public static void IIl1() {
        IOlO.I1O1 = 0;
    }

    public static boolean IIO1() {
        for (int i = 0; i < IIIO.size(); ++i) {
            Il0O il0O = (Il0O)IIIO.elementAt(i);
            if (il0O.I_O0 != 0 && il0O.I_O0 != 12) continue;
            return true;
        }
        return false;
    }

    private Il0O(int n) {
        this.I_O0 = n;
        switch (this.I_O0) {
            case 0: 
            case 12: {
                if (IIIo == null) {
                    IIIo = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa38\uaa01\uaaf2\uaa9c\uaaa1\uaa9e\uab68", 43481));
                }
                if (IIl == null) {
                    IIl = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa38\uaa01\uaaf2\uaa83\uaaff\uaa80\uab61\uab49", 43481));
                }
                if (IIlI == null) {
                    IIlI = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa38\uaa01\uaaf2\uaa80\uaaff\uaa80\uab61\uab49", 43481));
                }
                this.I1O = I_Ol.III_(II.IIl / 3, II.IIl / 2);
                this.II0O = new int[this.I1O];
                this.II00 = new int[this.I1O];
                this.II0o = new int[this.I1O];
                this.IIo = new int[this.I1O];
                this.IIol = new int[this.I1O];
                this.IIo_ = new int[this.I1O];
                this.IIo1 = new int[this.I1O];
                this.IIIO = new boolean[this.I1O];
                this.III0 = new boolean[this.I1O];
                for (int i = 0; i < this.I1O; ++i) {
                    this.II00[i] = I_Ol.III_(-10, II.IIlI + 100) + I1_I.Io1I;
                    this.II0O[i] = I_Ol.III_(-10, II.IIl + 300) + I1_I.Io1;
                    this.IIo_[i] = I_Ol.III_(0, 1);
                    this.II0o[i] = -12;
                    this.IIo[i] = 12;
                    this.IIol[i] = I_Ol.III_(1, 3);
                    this.IIIO[i] = false;
                    if (this.IIol[i] == 2 && i % 2 == 0) {
                        this.IIIO[i] = true;
                    }
                    this.III0[i] = false;
                    this.IIo1[i] = I_Ol.III_(1, 2);
                }
                return;
            }
            case 1: 
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 11: 
            case 15: {
                if (this.I_O0 == 1) {
                    IIl1 = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa39\uaa15\uaaf0\uaad3\uaaa8\uaade\uab7f\uab40\uab2a", 43481));
                    I1Oo = 10;
                }
                if (this.I_O0 == 2) {
                    IIl1 = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa39\uaa15\uaaf0\uaad3\uaaa8\uaac2\uab21\uab5e\uab23\uab0b", 43481));
                    I1Oo = 18;
                }
                if (this.I_O0 == 5) {
                    IIl1 = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa39\uaa15\uaaf0\uaad3\uaaa8\uaac3\uab21\uab5e\uab23\uab0b", 43481));
                    I1Oo = 14;
                }
                if (this.I_O0 == 6) {
                    IIl1 = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa39\uaa15\uaaf0\uaad3\uaaa8\uaac4\uab21\uab5e\uab23\uab0b", 43481));
                    I1Oo = 14;
                }
                if (this.I_O0 == 7) {
                    IIl1 = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa39\uaa15\uaaf0\uaad3\uaaa8\uaac5\uab21\uab5e\uab23\uab0b", 43481));
                    I1Oo = 12;
                }
                if (this.I_O0 == 11) {
                    IIl1 = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa21\uaa01\uaaea\uaad7\uaaa5\uaade\uab7f\uab40\uab2a", 43481));
                }
                if (this.I_O0 == 15) {
                    if (I_oo.II[11120] == null) {
                        I_oo.IlIo(11120);
                    }
                    I1Oo = 16;
                }
                this.I1O = I_Ol.III_(15, 25);
                if (this.I_O0 == 11) {
                    this.I1O = 100;
                }
                this.II0O = new int[this.I1O];
                this.II00 = new int[this.I1O];
                this.II0o = new int[this.I1O];
                this.IIo = new int[this.I1O];
                this.IIo_ = new int[this.I1O];
                this.IIo1 = new int[this.I1O];
                this.III0 = new boolean[this.I1O];
                for (int i = 0; i < this.I1O; ++i) {
                    this.II0O[i] = I_Ol.III_(-10, IOlO.l100 + 10);
                    this.II00[i] = I_Ol.III_(0, IOlO.l10o);
                    this.IIo1[i] = I_Ol.III_(0, 1);
                    this.IIo_[i] = I_Ol.III_(0, 1);
                    this.II0o[i] = I_Ol.III_(-3, 3);
                    this.IIo[i] = I_Ol.III_(1, 4);
                    if (this.I_O0 == 11) {
                        this.IIo1[i] = I_Ol.III_(0, 2);
                        this.II0o[i] = I_Ol.II1(I_Ol.III_(1, 3));
                        this.IIo[i] = I_Ol.II1(I_Ol.III_(1, 3));
                    }
                    if (this.I_O0 != 15) continue;
                    this.IIo1[i] = I_Ol.III_(0, 2);
                    this.II0o[i] = I_Ol.II1(I_Ol.III_(1, 3));
                    this.IIo[i] = I_Ol.II1(I_Ol.III_(1, 3));
                }
                return;
            }
            case 3: {
                II.IIlO = true;
                return;
            }
            case 4: {
                this.I1O = I_Ol.III_(5, 10);
                if (IIll == null) {
                    IIll = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa26\uaa15\uaafc\uaa9c\uaaa1\uaa9e\uab68", 43481));
                }
                this.II0O = new int[this.I1O];
                this.II00 = new int[this.I1O];
                this.IIo1 = new int[this.I1O];
                this.IIo_ = new int[this.I1O];
                this.IIII = new int[this.I1O];
                for (int i = 0; i < this.I1O; ++i) {
                    this.II0O[i] = I_Ol.III_(0, II.IIl);
                    this.II00[i] = I_Ol.III_(0, 50);
                    this.IIII[i] = i % 2 == 0 ? 0 : (i % 3 == 0 ? 1 : (i % 4 == 0 ? 2 : 3));
                    this.IIo_[i] = I_Ol.III_(0, 10);
                }
                return;
            }
            case 8: {
                this.III1 = I_Ol.III_(100, 300);
                if (IIl_ == null) {
                    IIl_ = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa26\uaa1c\uaafa\uaac2\uaaff\uaa80\uab61\uab49", 43481));
                }
                if (IIlO == null) {
                    IIlO = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa33\uaa1d\uaae1\uaad7\uaae0\uaade\uab7f\uab40\uab2a", 43481));
                }
                if (IIl0 == null) {
                    IIl0 = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa33\uaa1d\uaae1\uaad7\uaae3\uaade\uab7f\uab40\uab2a", 43481));
                }
                this.I1I0 = false;
                this.IO11();
                return;
            }
            case 9: {
                if (II1I == null) {
                    II1I = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa36\uaa1c\uaaf2\uaadf\uaafc\uaa84\uab7d\uab41\uab23\uab5d\uaba5\uabda\uaba7\uab8f", 43481));
                }
                if (II1l == null) {
                    II1l = IO10.III(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa36\uaa1c\uaaf2\uaadf\uaafc\uaa84\uab7d\uab41\uab23\uab5e\uaba5\uabda\uaba7\uab8f", 43481));
                }
                this.IIO0 = 20;
                this.II0O = new int[this.IIO0];
                this.II00 = new int[this.IIO0];
                IIoI = new int[this.IIO0];
                this.II0o = new int[this.IIO0];
                for (int i = 0; i < this.IIO0; ++i) {
                    this.II0O[i] = I_Ol.II1(I_Ol.III_(0, II.IIl));
                    this.II00[i] = I_Ol.II1(I_Ol.III_(10, 80));
                    Il0O.IIoI[i] = I_Ol.II1(I_Ol.III_(1, 3));
                    this.II0o[i] = IIoI[i];
                }
                return;
            }
            case 10: {
                this.IIO0 = 30;
                this.II0O = new int[this.IIO0];
                this.II00 = new int[this.IIO0];
                IIoI = new int[this.IIO0];
                this.II0o = new int[this.IIO0];
                n = 0;
                for (int i = 0; i < this.IIO0; ++i) {
                    this.II0O[i] = I_Ol.II1(I_Ol.III_(0, II.IIl)) + I1_I.Io1;
                    if (++n > this.IIO0 / 2) {
                        this.II00[i] = I_Ol.II1(I_Ol.III_(20, 60));
                        Il0O.IIoI[i] = 10;
                    } else {
                        this.II00[i] = I_Ol.II1(I_Ol.III_(0, 20));
                        Il0O.IIoI[i] = 7;
                    }
                    this.II0o[i] = IIoI[i] / 2 - 2;
                }
                return;
            }
            case 13: {
                if (I_Ol.II1(I_Ol.III_(0, 2)) != 0) break;
                I1Io = I_Ol.II1(I_Ol.III_(0, 2)) == 0;
                IIO = I_Ol.II1(I_Ol.III_(2, 5));
                Il0O.IIII();
                return;
            }
            case 14: {
                if (I_Ol.II1(I_Ol.III_(0, 2)) != 0) break;
                II_ = true;
                Il0O.IIII();
            }
        }
    }

    private static void IIII() {
        if (IO10.l_lI == 1) {
            II1_ = null;
            II1O = null;
        } else if (II.II) {
            II1_ = null;
            II1O = null;
        } else {
            if (IIO > 0) {
                if (II1_ == null) {
                    II1_ = IO10.IIII(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa33\uaa1b\uaaf4\uaa83\uaaff\uaa80\uab61\uab49", 43481));
                    I100 = II1_.getWidth();
                }
            } else {
                II1_ = null;
            }
            if (!II_) {
                II1O = null;
            } else {
                if (II1O == null) {
                    II1O = IO10.IIII(Il0O.II0_("\ua9f6\ua99a\uaa70\uaa19\uaa33\uaa1b\uaaf4\uaa82\uaaff\uaa80\uab61\uab49", 43481));
                }
                I1o = 287;
            }
        }
    }

    private static void II1(IO1l iO1l) {
        if (IO10.l_lI != 1 && !II.II && IIO != 0 && II1_ != null) {
            for (int i = 0; i < IIO; ++i) {
                iO1l.II(II1_, (float)II.IIII[i], (float)II.IIIl[i], 3);
            }
        }
    }

    public static void II(IO1l iO1l) {
        if (IO10.l_lI != 1 && !II.II && II_ && II1O != null) {
            for (int i = I10o; i < IOlO.l100; i += I1o) {
                if (i < I1_I.Io1 - I1o) continue;
                iO1l.II(II1O, (float)i, (float)IIOI, 0);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void IO11() {
        block5: {
            block6: {
                block4: {
                    var1_1 = I1_I.Io1;
                    var2_2 = I1_I.Io1I;
                    this.II = I_Ol.III_(1, 3);
                    this.I1I0 = false;
                    this.III_ = I_Ol.III_(3, 5);
                    if (this.II != 1) break block4;
                    this.IIOo = -50;
                    this.II0 = I_Ol.III_(var2_2, II.IIlI - 100 + var2_2);
                    var3_3 = this;
                    var4_4 = 0;
                    break block5;
                }
                if (this.II != 2) break block6;
                this.IIOo = IOlO.l100 + 50;
                this.II0 = I_Ol.III_(var2_2, II.IIlI - 100 + var2_2);
                var3_3 = this;
                ** GOTO lbl-1000
            }
            if (this.II == 3) {
                this.IIOo = I_Ol.III_(var1_1 + 50, II.IIl - 50 + var1_1);
                this.II0 = -50;
                var1_1 = I_Ol.III_(0, 2);
                this.III = var1_1 == 0 ? 0 : 2;
                return;
            }
            if (this.II != 4) {
                return;
            }
            this.IIOo = I_Ol.III_(var1_1 + 50, II.IIl - 50 + var1_1);
            this.II0 = IOlO.l10o + 50;
            var1_1 = I_Ol.III_(0, 2);
            var3_3 = this;
            if (var1_1 == 0) {
                var4_4 = 0;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = 2;
            }
        }
        var3_3.III = var4_4;
    }

    public static void IIO(int n) {
        if (!II.II) {
            Il0O il0O = new Il0O(n);
            IIIO.addElement(il0O);
        }
    }

    public static void III0(int n, int n2) {
        Il0O il0O = new Il0O(10);
        new Il0O(10).I1O0 = n;
        il0O.I1OO = n2;
        IIIO.addElement(il0O);
    }

    public static void IIIl(IO1l iO1l) {
        for (int i = 0; i < IIIO.size(); ++i) {
            int n;
            Il0O il0O = (Il0O)IIIO.elementAt(i);
            IO1l iO1l2 = iO1l;
            Il0O il0O2 = il0O;
            if (il0O.I_O0 != 10) continue;
            iO1l.Illl(il0O.I1O0);
            for (n = 0; n < il0O2.IIO0; ++n) {
                iO1l2.II(n < il0O2.IIO0 / 2 ? II1 : IIlo, il0O2.II0O[n], il0O2.II00[n] + il0O2.I1OO, 0);
            }
            if (IIII != 0 && II11 == null) {
                II11 = I_oo.II[Il0O.IIII].I1I1;
            }
            if (II11 == null) continue;
            for (n = 0; n < il0O2.IIO0 / 2; ++n) {
                iO1l2.II(II11, il0O2.II0O[n], il0O2.II00[n] + il0O2.I1OO, 0);
            }
        }
    }

    public static void II1I(IO1l iO1l) {
        block4: for (int i = 0; i < IIIO.size(); ++i) {
            Il0O il0O = (Il0O)IIIO.elementAt(i);
            switch (il0O.I_O0) {
                case 8: {
                    int n;
                    iO1l.II(IIl_, 0, 0, IIl_.getWidth(), IIl_.getHeight(), il0O.III, il0O.IIOo, il0O.II0, 3);
                    if (il0O.II != 1 && il0O.II != 2) {
                        n = il0O.III == 0 ? 11 : -11;
                        iO1l.II(IIl0, 0, il0O.IIII * 18, 8, 18, il0O.III, il0O.IIOo + n, il0O.II0 + 22, 3);
                        continue block4;
                    }
                    n = il0O.III == 0 ? -25 : 25;
                    iO1l.II(IIlO, 0, il0O.IIII << 3, 20, 8, il0O.III, il0O.IIOo + n, il0O.II0 + 5, 3);
                    continue block4;
                }
                case 13: {
                    if (!I1Io) continue block4;
                    Il0O.II1(iO1l);
                }
            }
        }
    }

    public static void III(IO1l iO1l) {
        block9: for (int i = 0; i < IIIO.size(); ++i) {
            Il0O il0O = (Il0O)IIIO.elementAt(i);
            IO1l iO1l2 = iO1l;
            Il0O il0O2 = il0O;
            try {
                switch (il0O2.I_O0) {
                    case 0: 
                    case 12: {
                        for (int j = 0; j < il0O2.I1O; ++j) {
                            if (il0O2.IIol[j] != 2 || il0O2.II0O[j] < I1_I.Io1 || il0O2.II0O[j] > II.IIl + I1_I.Io1 || il0O2.II00[j] < I1_I.Io1I || il0O2.II00[j] > II.IIlI + I1_I.Io1I) continue;
                            if (il0O2.III0[j]) {
                                iO1l2.II(IIIo, 0, 10 * il0O2.IIo1[j], 13, 10, 0, il0O2.II0O[j], il0O2.II00[j] - 10, 0);
                                continue;
                            }
                            iO1l2.II(IIl, il0O2.II0O[j], il0O2.II00[j], 0);
                        }
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 11: 
                    case 15: {
                        if (il0O2.I_O0 == 15) {
                            if (I_oo.II[11120] != null && I_oo.II[11120].I1I1 != null) {
                                IIl1 = I_oo.II[11120].I1I1;
                            }
                            if (IIl1 == null) break;
                        }
                        Image image = IIl1;
                        try {
                            for (int j = 0; j < il0O2.I1O; ++j) {
                                if (j % 3 != 0 || il0O2.II0O[j] < I1_I.Io1 || il0O2.II0O[j] > II.IIl + I1_I.Io1 || il0O2.II00[j] < I1_I.Io1I || il0O2.II00[j] > II.IIlI + I1_I.Io1I || image == null) continue;
                                iO1l2.II(image, 0, I1Oo * il0O2.IIo1[j], image.getWidth(), I1Oo, 0, il0O2.II0O[j], il0O2.II00[j], 0);
                            }
                            continue block9;
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    default: {
                        break;
                    }
                    case 13: {
                        if (I1Io) continue block9;
                        Il0O.II1(iO1l2);
                        break;
                    }
                }
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static void IIII(IO1l iO1l) {
        for (int i = 0; i < IIIO.size(); ++i) {
            int n;
            Il0O il0O = (Il0O)IIIO.elementAt(i);
            IO1l iO1l2 = iO1l;
            Il0O il0O2 = il0O;
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
            if (il0O.I_O0 == 4) {
                for (n = 0; n < il0O2.I1O; ++n) {
                    iO1l2.II(IIll, 0, 16 * il0O2.IIo1[n], 16, 16, 0, il0O2.II0O[n], il0O2.II00[n], 0);
                }
            }
            if (il0O2.I_O0 != 9) continue;
            iO1l2.Illl(0xFFFFFF);
            for (n = 0; n < il0O2.IIO0; ++n) {
                iO1l2.II(IIoI[n] == 1 ? II1I : II1l, il0O2.II0O[n], il0O2.II00[n], 3);
            }
        }
    }

    public static void II1l(IO1l iO1l) {
        block6: for (int i = 0; i < IIIO.size(); ++i) {
            Il0O il0O = (Il0O)IIIO.elementAt(i);
            IO1l iO1l2 = iO1l;
            Il0O il0O2 = il0O;
            switch (il0O.I_O0) {
                case 0: {
                    iO1l.Illl(10742731);
                    for (int j = 0; j < il0O2.I1O; ++j) {
                        if (il0O2.IIol[j] == 2 || il0O2.II0O[j] < I1_I.Io1 || il0O2.II0O[j] > II.IIl + I1_I.Io1 || il0O2.II00[j] < I1_I.Io1I || il0O2.II00[j] > II.IIlI + I1_I.Io1I) continue;
                        iO1l2.II(IIlI, il0O2.II0O[j], il0O2.II00[j], 0);
                    }
                    continue block6;
                }
                case 1: 
                case 2: 
                case 5: 
                case 6: 
                case 7: 
                case 11: 
                case 15: {
                    if (il0O.I_O0 == 15) {
                        if (I_oo.II[11120] != null && I_oo.II[11120].I1I1 != null) {
                            IIl1 = I_oo.II[11120].I1I1;
                        }
                        if (IIl1 == null) continue block6;
                    }
                    Image image = IIl1;
                    iO1l2 = iO1l;
                    il0O2 = il0O;
                    try {
                        for (int j = 0; j < il0O2.I1O; ++j) {
                            if (j % 3 == 0 || il0O2.II0O[j] < I1_I.Io1 || il0O2.II0O[j] > II.IIl + I1_I.Io1 || il0O2.II00[j] < I1_I.Io1I || il0O2.II00[j] > II.IIlI + I1_I.Io1I || image == null) continue;
                            iO1l2.II(image, 0, I1Oo * il0O2.IIo1[j], image.getWidth(), I1Oo, 0, il0O2.II0O[j], il0O2.II00[j], 0);
                        }
                        continue block6;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
            }
        }
    }

    public static void III() {
        block12: for (int i = 0; i < IIIO.size(); ++i) {
            Il0O il0O = (Il0O)IIIO.elementAt(i);
            try {
                switch (il0O.I_O0) {
                    case 0: 
                    case 12: {
                        int n8;
                        int[] nArray;
                        int n2;
                        for (n2 = 0; n2 < il0O.I1O; ++n2) {
                            if (n2 % 3 != 0 && il0O.I_O0 != 12 && IOlO.IIIl(il0O.II0O[n2], il0O.II00[n2] - II.II10, 2)) {
                                il0O.III0[n2] = true;
                            }
                            if (n2 % 3 == 0 && il0O.II00[n2] > II.IIlI + I1_I.Io1I) {
                                il0O.II0O[n2] = I_Ol.III_(-10, II.IIl + 300) + I1_I.Io1;
                                il0O.II00[n2] = I_Ol.III_(-100, 0) + I1_I.Io1I;
                            }
                            if (!il0O.III0[n2]) {
                                nArray = il0O.II00;
                                int n3 = n2;
                                nArray[n3] = nArray[n3] + il0O.IIo[n2];
                                nArray = il0O.II0O;
                                int n4 = n2;
                                nArray[n4] = nArray[n4] + il0O.II0o[n2];
                            }
                            if (!il0O.III0[n2]) continue;
                            int n5 = n2;
                            il0O.IIo_[n5] = il0O.IIo_[n5] + 1;
                            if (il0O.IIo_[n2] <= 2) continue;
                            int n6 = n2;
                            int n7 = il0O.IIo1[n6];
                            il0O.IIo1[n6] = n7 + 1;
                            n8 = n7;
                            il0O.IIo_[n2] = 0;
                            if (il0O.IIo1[n2] <= 1) continue;
                            il0O.IIo1[n2] = 0;
                            il0O.III0[n2] = false;
                            il0O.II0O[n2] = I_Ol.III_(-10, II.IIl + 300) + I1_I.Io1;
                            il0O.II00[n2] = I_Ol.III_(-100, 0) + I1_I.Io1I;
                        }
                        continue block12;
                    }
                    case 1: 
                    case 2: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 11: 
                    case 15: {
                        int n;
                        int n8;
                        int[] nArray;
                        int n2;
                        for (n2 = 0; n2 < il0O.I1O; ++n2) {
                            if (n2 % 3 != 0 && IOlO.IIIl(il0O.II0O[n2], il0O.II00[n2] + (IOlO.l1o == 15 ? 10 : 0), 2)) {
                                il0O.III0[n2] = true;
                            }
                            if (n2 % 3 == 0 && il0O.II00[n2] > IOlO.l10o) {
                                il0O.II0O[n2] = I_Ol.III_(-10, IOlO.l100 + 50);
                                il0O.II00[n2] = I_Ol.III_(-50, 0);
                            }
                            if (il0O.III0[n2]) {
                                int n9 = n2;
                                il0O.IIo_[n9] = il0O.IIo_[n9] + 1;
                                if (il0O.IIo_[n2] != 100) continue;
                                il0O.IIo_[n2] = 0;
                                il0O.II0O[n2] = I_Ol.III_(-10, IOlO.l100 + 50);
                                il0O.II00[n2] = I_Ol.III_(-50, 0);
                                il0O.III0[n2] = false;
                                continue;
                            }
                            for (n = 0; n < IOl1.IlI1.size(); ++n) {
                                IOl1 iOl1 = (IOl1)IOl1.IlI1.elementAt(n);
                                if (iOl1 == null || !iOl1.I_OI || il0O.II0O[n2] >= iOl1.I1 + 80 || il0O.II0O[n2] <= iOl1.I1 - 80 || il0O.II00[n2] >= iOl1.I1I + 80 || il0O.II00[n2] <= iOl1.I1I - 80) continue;
                                nArray = il0O.II0O;
                                int n10 = n2;
                                nArray[n10] = nArray[n10] + (il0O.II0O[n2] < iOl1.I1 ? -10 : 10);
                            }
                            nArray = il0O.II00;
                            int n11 = n2;
                            nArray[n11] = nArray[n11] + il0O.IIo[n2];
                            nArray = il0O.II0O;
                            int n12 = n2;
                            nArray[n12] = nArray[n12] + il0O.II0o[n2];
                            int n13 = n2;
                            il0O.IIo_[n13] = il0O.IIo_[n13] + 1;
                            if (il0O.IIo_[n2] <= (il0O.I_O0 != 2 ? 2 : 4)) continue;
                            if (il0O.I_O0 != 11 && il0O.I_O0 != 15) {
                                int n14 = n2;
                                int n15 = il0O.IIo1[n14];
                                il0O.IIo1[n14] = n15 + 1;
                                n8 = n15;
                            }
                            il0O.IIo_[n2] = 0;
                            if (il0O.IIo1[n2] <= 3) continue;
                            il0O.IIo1[n2] = 0;
                        }
                    }
                    default: {
                        break;
                    }
                    case 4: {
                        int n8;
                        int n2;
                        for (n2 = 0; n2 < il0O.I1O; ++n2) {
                            int n = n2;
                            il0O.IIo_[n] = il0O.IIo_[n] + 1;
                            if (il0O.IIo_[n2] <= 10) continue;
                            int n16 = n2;
                            int n17 = il0O.IIII[n16];
                            il0O.IIII[n16] = n17 + 1;
                            n8 = n17;
                            il0O.IIo_[n2] = 0;
                            if (il0O.IIII[n2] > 5) {
                                il0O.IIII[n2] = 0;
                            }
                            il0O.IIo1[n2] = il0O.IIoO[il0O.IIII[n2]];
                        }
                        continue block12;
                    }
                    case 8: {
                        ++il0O.IIIl;
                        if (il0O.IIIl == 3) {
                            il0O.IIIl = 0;
                            ++il0O.IIII;
                            if (il0O.IIII > 1) {
                                il0O.IIII = 0;
                            }
                        }
                        if (II.IIIO % il0O.III1 == 0) {
                            il0O.I1I0 = true;
                        }
                        if (!il0O.I1I0) continue block12;
                        if (il0O.II == 1) {
                            il0O.IIOo += il0O.III_;
                            if (il0O.IIOo <= IOlO.l100 + 50) continue block12;
                            il0O.IO11();
                            break;
                        }
                        if (il0O.II == 2) {
                            il0O.IIOo -= il0O.III_;
                            if (il0O.IIOo >= -50) continue block12;
                            il0O.IO11();
                            break;
                        }
                        if (il0O.II == 3) {
                            il0O.II0 += il0O.III_;
                            if (il0O.II0 <= IOlO.l10o + 50) continue block12;
                            il0O.IO11();
                            break;
                        }
                        if (il0O.II != 4) continue block12;
                        il0O.II0 -= il0O.III_;
                        if (il0O.II0 >= -50) continue block12;
                        il0O.IO11();
                        break;
                    }
                    case 9: {
                        int[] nArray;
                        int n2;
                        for (n2 = 0; n2 < il0O.IIO0; ++n2) {
                            nArray = il0O.II0O;
                            int n = n2;
                            nArray[n] = nArray[n] - il0O.II0o[n2];
                            if (il0O.II0O[n2] >= -il0O.II0o[n2]) continue;
                            Il0O.IIoI[n2] = I_Ol.II1(I_Ol.III_(1, 3));
                            il0O.II0o[n2] = IIoI[n2];
                            il0O.II0O[n2] = II.IIl + il0O.II0o[n2];
                        }
                        continue block12;
                    }
                    case 10: {
                        int[] nArray;
                        int n2;
                        for (n2 = 0; n2 < il0O.IIO0; ++n2) {
                            nArray = il0O.II0O;
                            int n = n2;
                            nArray[n] = nArray[n] - il0O.II0o[n2];
                            if (il0O.II0O[n2] >= -il0O.II0o[n2] + I1_I.Io1) continue;
                            il0O.II0O[n2] = II.IIl + il0O.II0o[n2] + I1_I.Io1;
                        }
                        continue block12;
                    }
                    case 13: {
                        int n;
                        int[] nArray;
                        int n2;
                        if (IO10.l_lI == 1 || II.II || IIO <= 0) continue block12;
                        int n18 = II.II == I1_I.II() ? IOlO.l100 : I1_I.Io1 + II.IIl;
                        for (n2 = 0; n2 < IIO; ++n2) {
                            n = n2 + 1;
                            nArray = II.IIII;
                            int n19 = n2;
                            nArray[n19] = nArray[n19] - n;
                            if (II.IIII[n2] >= -I100) continue;
                            II.IIII[n2] = n18 + 100;
                        }
                        continue block12;
                    }
                    case 14: {
                        if (IO10.l_lI == 1 || II.II || !II_ || --I10o >= -I1o) continue block12;
                        I10o = 0;
                    }
                }
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    static {
        I1Oo = 16;
        IIlo = IO10.IIII(Il0O.II0_("\ua9f6\ua995\uaa76\uaa5f\uaa3b\uaa3d\uaafe\uaad3\uaab6\uaa95\uab20\uab43\uab34\uab38\uabee\uabd2\uabbd\uab9d\uac75\uac43\uac77\uac00\uacf4\uacc3\uacb5\uac85\uac8d\uad2f\uad13\uad2c\uad15\uadfd", 43481));
        II1 = IO10.IIII(Il0O.II0_("\ua9f6\ua995\uaa76\uaa5f\uaa3b\uaa3d\uaafe\uaad3\uaab6\uaa95\uab20\uab43\uab34\uab38\uabee\uabd2\uabbd\uab9d\uac75\uac43\uac77\uac00\uacf4\uacc3\uacb5\uac85\uac8d\uad2c\uad13\uad2c\uad15\uadfd", 43481));
        II11 = null;
    }

    private static /* synthetic */ String II0_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

