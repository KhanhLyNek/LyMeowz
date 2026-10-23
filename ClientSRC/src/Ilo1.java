/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ilo1
extends I1l1
implements I1_1 {
    public int II0I = 100;
    public int I_O0;
    public int I_Oo;
    public String[] IIIO;
    public int IIO;
    public int IIOI;
    public int IIOl;
    public int IIlI;
    public I_11 III;
    private static long Il_O;
    private static long Il_0;
    private int I1_o;
    private String[] III0;
    public I1Il IIII;
    public I1Il IIIl;
    public I1Il III1;
    public static Ilo1 III;
    public static Ilo1 IIII;
    private static String II0_;
    private static I_11 IIII;
    public byte II1l = 0;
    public byte II11 = 0;
    public static I_O_ II;
    private static boolean I_1_;
    private int I1O_;
    private static int I1OO;
    private int I1O0;
    public static int IIIl;
    private int I1Oo = 0;
    private int I10 = 0;
    private int I10I = 0;
    private Image II1I;
    public int III1;
    public boolean I_1O = false;
    public static int II0l;
    private int I10l = 0;
    private int I101 = 0;

    public static void II(String string, I_11 i_11) {
        II0_ = string;
        IIII = i_11;
        if (III == null) {
            Ilo1.III(II0_, 100000, IIII);
            II0_ = null;
            IIII = null;
        }
    }

    public static void II(String string, int n, I_11 i_11) {
        I1_I.II.IIII(string, 0);
    }

    public static void III(String string, int n, I_11 i_11) {
        I1_I.II.IIII(string, 0);
    }

    public static Ilo1 II(String string, int n, I_11 i_11) {
        I_Ol.II__(Ilo1.IIoI("\ud877\ud811\ud830\ud8b3\ud8e2\ud89e\ud8a0", 55350));
        I_Ol.II__(Ilol.II().II != null ? Ilo1.IIoI("\ud817\ud83b\ud801\ud8ff\ud8de", 55350) : Ilo1.IIoI("\ud858\ud820\ud818\ud8ff", 55350));
        I1OO = 10;
        Ilo1 ilo1 = new Ilo1();
        new Ilo1().II0I = II.IIl - 30 - (II.II.IOol ? II.II.I_Oo : 0);
        if (ilo1.II0I > 320) {
            ilo1.II0I = 320;
        }
        if (string.length() < 10) {
            ilo1.II0I = 64;
        }
        if (II.IIl == 128) {
            ilo1.II0I = 128;
        }
        ilo1.IIIO = IO1I.IIl0.II(string, ilo1.II0I - 10);
        ilo1.I_O0 = n;
        ilo1.III = i_11;
        Ilol.II = ilo1;
        ilo1.IIOl = 15 - ilo1.I_Oo + ilo1.IIIO.length * 12 + 10;
        if (ilo1.IIOl > II.IIlI - 80) {
            ilo1.IIOl = II.IIlI - 80;
        }
        I1l1.II1_.addElement(ilo1);
        I_1_ = false;
        if (i_11 != null && i_11.IOI_ == 5) {
            I_1_ = true;
            I1_I.II.IIII("", 1);
        }
        Il_O = Il_0 = IO10.IIII();
        return ilo1;
    }

    public static Ilo1 II(String string, int n, I_11 i_11, int n2) {
        I_Ol.II__(Ilo1.IIoI("\ud877\ud811\ud830\ud8b3\ud8e2\ud89e\ud8a0", 55350));
        I_Ol.II__(Ilol.II().II != null ? Ilo1.IIoI("\ud817\ud83b\ud801\ud8ff\ud8de", 55350) : Ilo1.IIoI("\ud858\ud820\ud818\ud8ff", 55350));
        I1OO = 10;
        Ilo1 ilo1 = new Ilo1();
        new Ilo1().II0I = II.IIl - 30 - (II.II.IOol ? II.II.I_Oo : 0);
        if (ilo1.II0I > 320) {
            ilo1.II0I = 320;
        }
        if (string.length() < 10) {
            ilo1.II0I = 64;
        }
        if (II.IIl == 128) {
            ilo1.II0I = 128;
        }
        ilo1.IIIO = IO1I.IIl0.II(string, ilo1.II0I - 10);
        ilo1.I_O0 = 100000;
        ilo1.III = i_11;
        ilo1.I1O_ = 5820;
        Ilol.II = ilo1;
        ilo1.IIOl = 15 - ilo1.I_Oo + ilo1.IIIO.length * 12 + 10;
        if (ilo1.IIOl > II.IIlI - 80) {
            ilo1.IIOl = II.IIlI - 80;
        }
        I1l1.II1_.addElement(ilo1);
        I_1_ = false;
        if (i_11 != null && i_11.IOI_ == 5) {
            I_1_ = true;
            I1_I.II.IIII("", 1);
        }
        ilo1.IIOl += 15;
        Il_O = Il_0 = IO10.IIII();
        return ilo1;
    }

    @Override
    public void IIlO() {
        if (II != null) {
            I1_I.II.IO0 = false;
            II.IOlI();
        } else {
            I1_I.II.IO0 = true;
        }
        if (II.II.IOol) {
            this.III1 = 0;
            this.IIO = II.IIl / 2 - this.II0I / 2 - 1;
            this.IIOI = II.II.I_0 - this.IIOl;
        } else {
            this.III1 = 0;
            if (I1_I.II().IIl == null && I1_I.II().IIIo == null && I1_I.II().III0 == null && this.IIII == null && this.IIIl == null) {
                this.IIO = II.IIl / 2 - this.II0I / 2 - 1;
                this.IIOI = II.IIlI - 5 - this.IIOl;
            } else {
                this.III1 = 5;
                this.IIO = II.IIl / 2 - this.II0I / 2 - 1;
                this.IIOI = II.IIlI - 20 - this.IIOl;
            }
        }
        if (this.I_O0 > 0) {
            --this.I_O0;
        }
        if (I1OO > 0) {
            --I1OO;
        } else {
            I1_I.II.III.IIO = 0;
            for (int i = 0; i < I1_I.II.III.IIOO.size(); ++i) {
                if (((I1O0)I1_I.II.III.IIOO.elementAt((int)i)).I_O0 == 70) continue;
                ((I1O0)I1_I.II.III.IIOO.elementAt((int)i)).I_O0 = 10;
            }
        }
        if (this.I_Oo > 1) {
            --this.I_Oo;
        }
        if (this.III != null && Ilol.II != null && Ilol.II != this || this.III != null && Ilol.II == null || this.I_O0 <= 0) {
            I1l1.II10.removeElement(this);
            I1l1.II1_.removeElement(this);
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        if (!I1_I.II().I1_1 || !I1_I.II().IO1I) {
            II.II(iO1l);
            int n = this.IIO;
            int n2 = this.IIOI;
            int n3 = this.II0I + 2;
            int n4 = this.IIOl;
            if (n > 0 && n2 > 0 || II.II.I_10) {
                int n5;
                int n6;
                I__O.II(iO1l, n, n2, n3, n4, 0xFFFFFF, false);
                if (this.III != null) {
                    n6 = II.IIIO % 10 > 2 ? 0 : 1;
                    I_oo.IIII(iO1l, this.III.IO_l, this.IIO + 14, this.IIOI + n6, 0, IOII.l1OO);
                }
                if (this.I1O_ != 0) {
                    n6 = II.IIIO % 10 > 2 ? 0 : 1;
                    I_oo.IIII(iO1l, this.I1O_, this.IIO + n3 / 2, this.IIOI + this.IIOl - 15 + n6, 0, IOII.IIOI);
                }
                if (II != null) {
                    iO1l.IIIO(n, n2, n3, n4 - 16);
                    iO1l.IIl0(0, -Ilo1.II.I_0);
                }
                int n7 = 0;
                int n8 = 0;
                if (this.I_1O) {
                    n7 = iO1l.IIO1();
                    n8 = iO1l.IIO_();
                    iO1l.IIIO(n, n2 + 1, n3, n4 - 17);
                    iO1l.IIl0(0, -II0l);
                }
                int n9 = -1;
                for (n5 = 0; n5 < this.IIIO.length; ++n5) {
                    int n10;
                    String[] stringArray;
                    if (this.IIIO[n5].startsWith(Ilo1.IIoI("\ud81b\ud878", 55350))) {
                        iO1l.Illl(0);
                        iO1l.III_(n + 10, this.IIOI + this.I_Oo + n5 * 12 + 6, n3 - 20, 1);
                        continue;
                    }
                    IO1I iO1I = IO1I.IIlI;
                    int n11 = 2;
                    String string = this.IIIO[n5];
                    if (this.IIIO[n5].startsWith(Ilo1.IIoI("\ud84a", 55350))) {
                        stringArray = I_Ol.II(this.IIIO[n5], Ilo1.IIoI("\ud84a", 55350), 0);
                        if (stringArray.length == 3) {
                            string = stringArray[2];
                        }
                        if (stringArray.length == 4) {
                            string = stringArray[3];
                            n11 = Integer.parseInt(stringArray[2]);
                        }
                        n9 = n10 = Integer.parseInt(stringArray[1]);
                    } else {
                        n10 = n9;
                    }
                    switch (n10) {
                        case -1: {
                            iO1I = IO1I.IIlI;
                            break;
                        }
                        case 0: {
                            iO1I = IO1I.III_;
                            break;
                        }
                        case 1: {
                            iO1I = IO1I.III0;
                            break;
                        }
                        case 2: {
                            iO1I = IO1I.III;
                            break;
                        }
                        case 3: {
                            iO1I = IO1I.IIl0;
                            break;
                        }
                        case 4: {
                            iO1I = IO1I.II1;
                            break;
                        }
                        case 5: {
                            iO1I = IO1I.IIlo;
                        }
                        default: {
                            break;
                        }
                        case 7: {
                            iO1I = IO1I.II;
                            break;
                        }
                        case 8: {
                            iO1I = IO1I.IIIl;
                            break;
                        }
                        case 9: {
                            iO1I = IO1I.IIIl;
                            break;
                        }
                        case 10: {
                            iO1I = IO1I.IIlO;
                        }
                    }
                    if (this.IIIO[n5].startsWith(Ilo1.IIoI("\ud80a", 55350))) {
                        stringArray = I_Ol.II(I_Ol.II(this.IIIO[n5], Ilo1.IIoI("\ud80a", 55350), 0)[1], Ilo1.IIoI("\ud808", 55350), 1);
                        if (this.I1O0 == 0) {
                            this.I1O0 = Integer.parseInt(stringArray[1]);
                        } else {
                            Il_O = IO10.IIII();
                            if (Il_O - Il_0 >= 1000L) {
                                Il_0 = Il_O;
                                --this.I1O0;
                            }
                        }
                        string = this.I1O0 + Ilo1.IIoI("\ud816", 55350) + stringArray[2];
                        iO1I.II(iO1l, string, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + n5 * 12 - this.III1 + 12, n11);
                        continue;
                    }
                    if (n11 == 2) {
                        iO1I.II(iO1l, string, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + n5 * 12 - this.III1 + 12, n11);
                    }
                    if (n11 != 1) continue;
                    iO1I.II(iO1l, string, this.IIO + this.II0I - 5, this.IIOI + this.I_Oo + n5 * 12 - this.III1 + 12, n11);
                }
                if (this.I_1O) {
                    II.II(iO1l);
                    iO1l.IIl0(n7, n8);
                }
                if (this.II11 > 4) {
                    this.I10 = (this.II11 + 1) / 2;
                    this.I1Oo = this.II11 - this.I10;
                    for (n5 = 0; n5 < this.I10; ++n5) {
                        iO1l.II(I_1o.Il00, n + n3 / 2 - this.I10 * 20 / 2 + n5 * 20 + IO1l.II(I_1o.Il00), n2 + n4 - 17, 3);
                    }
                    for (n5 = 0; n5 < this.I1Oo; ++n5) {
                        iO1l.II(I_1o.Il00, n + n3 / 2 - this.I1Oo * 20 / 2 + n5 * 20 + IO1l.II(I_1o.Il00), n2 + n4 - 8, 3);
                    }
                    if (this.II1l > 0) {
                        this.II1I = I_1o.Il0O;
                        if (this.II1l < this.I10) {
                            for (n5 = 0; n5 < this.II1l; ++n5) {
                                iO1l.II(this.II1I, n + n3 / 2 - this.I10 * 20 / 2 + n5 * 20 + IO1l.II(this.II1I), n2 + n4 - 17, 3);
                            }
                        } else {
                            this.I10I = this.II1l - this.I10;
                            for (n5 = 0; n5 < this.I10; ++n5) {
                                iO1l.II(this.II1I, n + n3 / 2 - this.I10 * 20 / 2 + n5 * 20 + IO1l.II(this.II1I), n2 + n4 - 17, 3);
                            }
                            for (n5 = 0; n5 < this.I10I; ++n5) {
                                if (n5 + this.I10 >= IIIl) {
                                    this.II1I = I_1o.Il0o;
                                }
                                iO1l.II(this.II1I, n + n3 / 2 - this.I1Oo * 20 / 2 + n5 * 20 + IO1l.II(this.II1I), n2 + n4 - 8, 3);
                            }
                        }
                    }
                } else {
                    for (n5 = 0; n5 < this.II11; ++n5) {
                        iO1l.II(I_1o.Il00, n + n3 / 2 - this.II11 * 20 / 2 + n5 * 20 + IO1l.II(I_1o.Il00), n2 + n4 - 13, 3);
                    }
                    if (this.II1l > 0) {
                        for (n5 = 0; n5 < this.II1l; ++n5) {
                            iO1l.II(I_1o.Il0O, n + n3 / 2 - this.II11 * 20 / 2 + n5 * 20 + IO1l.II(I_1o.Il0O), n2 + n4 - 13, 3);
                        }
                    }
                }
                iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
                iO1l.IIIO(0, 0, II.IIl, II.IIlI);
                if (this.IIII != null) {
                    I_10.II(iO1l, null, this.IIII, null);
                }
                if (this.IIIl != null) {
                    I_10.II(iO1l, this.IIIl, null, this.III1);
                }
            }
        }
    }

    public void II(IO1l iO1l, int n) {
        int n2 = this.IIO;
        int n3 = this.IIOI;
        int n4 = this.II0I;
        int n5 = iO1l.IIO1();
        int n6 = iO1l.IIO_();
        iO1l.IIl0(0, -n);
        if (n2 > 0 && n3 > 0 || II.II.I_10) {
            n = -1;
            for (n3 = 0; n3 < this.IIIO.length; ++n3) {
                int n7;
                String[] stringArray;
                if (this.IIIO[n3].startsWith(Ilo1.IIoI("\ud81b\ud878", 55350))) {
                    iO1l.Illl(0xFFFFFF);
                    iO1l.III_(n2 + 10, this.IIOI + this.I_Oo + n3 * 12 - 6, n4 - 20, 1);
                    continue;
                }
                IO1I iO1I = IO1I.II1I;
                int n8 = 2;
                String string = this.IIIO[n3];
                if (this.IIIO[n3].startsWith(Ilo1.IIoI("\ud84a", 55350))) {
                    stringArray = I_Ol.II(this.IIIO[n3], Ilo1.IIoI("\ud84a", 55350), 0);
                    if (stringArray.length == 3) {
                        string = stringArray[2];
                    }
                    if (stringArray.length == 4) {
                        string = stringArray[3];
                        n8 = Integer.parseInt(stringArray[2]);
                    }
                    n = n7 = Integer.parseInt(stringArray[1]);
                } else {
                    n7 = n;
                }
                switch (n7) {
                    case -1: {
                        iO1I = IO1I.II1I;
                        break;
                    }
                    case 0: {
                        iO1I = IO1I.IIII;
                        break;
                    }
                    case 1: {
                        iO1I = IO1I.III0;
                        break;
                    }
                    case 2: {
                        iO1I = IO1I.II;
                    }
                }
                if (this.IIIO[n3].startsWith(Ilo1.IIoI("\ud80a", 55350))) {
                    stringArray = I_Ol.II(I_Ol.II(this.IIIO[n3], Ilo1.IIoI("\ud80a", 55350), 0)[1], Ilo1.IIoI("\ud808", 55350), 1);
                    if (this.I1O0 == 0) {
                        this.I1O0 = Integer.parseInt(stringArray[1]);
                    } else {
                        Il_O = IO10.IIII();
                        if (Il_O - Il_0 >= 1000L) {
                            Il_0 = Il_O;
                            --this.I1O0;
                        }
                    }
                    string = this.I1O0 + Ilo1.IIoI("\ud816", 55350) + stringArray[2];
                    iO1I.II(iO1l, string, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + n3 * 12 - this.III1, n8);
                    continue;
                }
                if (n8 == 2) {
                    iO1I.II(iO1l, string, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + n3 * 12 - this.III1, n8);
                }
                if (n8 != 1) continue;
                iO1I.II(iO1l, string, this.IIO + this.II0I - 5, this.IIOI + this.I_Oo + n3 * 12 - this.III1, n8);
            }
            II.II(iO1l);
            iO1l.IIl0(n5, n6);
        }
    }

    private void IIO(int n) {
        if ((II0l += n * 12) < 0) {
            II0l = 0;
        }
        if (II0l > this.IIlI) {
            II0l = this.IIlI;
        }
    }

    public void IOlI() {
        if (this.I_1O) {
            if (II.II[8]) {
                II.II[8] = false;
                this.IIO(1);
            }
            if (II.II[2]) {
                II.II[2] = false;
                this.IIO(-1);
            }
            if (II.II(this.IIO, 0, this.II0I + 2, this.IIOl)) {
                if (II.IIl) {
                    if (this.I101 == 0) {
                        this.I101 = II.III;
                    }
                    this.I10l = this.I101 - II.III;
                    if (this.I10l != 0) {
                        II0l += this.I10l;
                        this.I101 = II.III;
                    }
                    if (II0l < 0) {
                        II0l = 0;
                    }
                    if (II0l > this.IIlI) {
                        II0l = this.IIlI;
                    }
                } else {
                    this.I101 = 0;
                    this.I101 = 0;
                }
            }
        }
        if (II != null) {
            I_O_ i_O_;
            if (II.IIIl) {
                II.II();
            }
            if (II.IIII[2]) {
                i_O_ = II;
                i_O_.I_O0 -= 12;
                if (Ilo1.II.I_O0 < 0) {
                    Ilo1.II.I_O0 = 0;
                }
            }
            if (II.IIII[8]) {
                II.II[8] = false;
                i_O_ = II;
                i_O_.I_O0 += 12;
                if (Ilo1.II.I_O0 > Ilo1.II.IIO0) {
                    Ilo1.II.I_O0 = Ilo1.II.IIO0;
                }
            }
        }
        if (II.II[5] || IO1_.II(II.II.III0)) {
            II.II[5] = false;
            IO1_.l_l = -1;
            if (this.IIII != null) {
                this.IIII.I0lO();
            } else if (this.IIIl != null) {
                this.IIIl.I0lO();
            } else if (this.III1 != null) {
                this.III1.I0lO();
            }
        }
        if (II == null || !Ilo1.II.I__I) {
            if (this.IIIl != null && (II.II[12] || II.II[5] || IO1_.II(this.IIIl))) {
                II.II[12] = false;
                II.II[5] = false;
                II.III0 = false;
                II.IIIo = false;
                this.IIIl.I0lO();
                IO1_.l_l = -1;
            }
            if (this.III1 != null && (II.II[13] || IO1_.II(this.III1))) {
                II.II[13] = false;
                II.III0 = false;
                II.IIIo = false;
                this.III1.I0lO();
                IO1_.l_l = -1;
            }
        }
    }

    @Override
    public void II(int n, Object object) {
        if (n == 1000) {
            try {
                GameMidlet.II.platformRequest((String)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            GameMidlet.II.notifyDestroyed();
            II.III_();
        }
        if (n == 1001) {
            II = null;
            Ilol.II = null;
            IIII = null;
            I1_I.II.IO0 = true;
            Ilol.I10 = false;
            if (I_1_) {
                I1_I.II.III.IIO = 0;
                I1_I.II.III.II.I_O0 = 10;
            }
        }
        if (n == 8000) {
            if (I1OO > 0) {
                return;
            }
            int n2 = Ilo1.III.I1_o;
            if (++n2 >= Ilo1.III.III0.length) {
                Ilol.II = null;
                III = null;
                I1_I.II.IO0 = true;
                Ilol.I10 = false;
                if (II0_ != null) {
                    Ilo1.III(II0_, 100000, IIII);
                    II0_ = null;
                    IIII = null;
                    return;
                }
                if (I_1_) {
                    I1_I.II.III.IIO = 0;
                    for (n = 0; n < I1_I.II.III.IIOO.size(); ++n) {
                        if (((I1O0)I1_I.II.III.IIOO.elementAt((int)n)).I_O0 != 10000000) continue;
                        ((I1O0)I1_I.II.III.IIOO.elementAt((int)n)).I_O0 = 10;
                    }
                }
                return;
            }
            Ilo1 ilo1 = Ilo1.II(Ilo1.III.III0[n2], Ilo1.III.I_O0, Ilo1.III.III);
            Ilo1.II(Ilo1.III.III0[n2], Ilo1.III.I_O0, Ilo1.III.III).I1_o = n2;
            ilo1.III0 = Ilo1.III.III0;
            ilo1.IIII = Ilo1.III.IIII;
            III = ilo1;
        }
    }

    static {
        IIIl = 7;
    }

    private static /* synthetic */ String IIoI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

