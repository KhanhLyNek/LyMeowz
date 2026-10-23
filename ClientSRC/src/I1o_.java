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
public final class I1o_
extends IO1_
implements I1_1 {
    public IOI0 IIIl;
    public IOI0 III1;
    public static boolean IO0_ = false;
    private int lIo1;
    private int lIo_;
    private int IIII;
    private int IIIl;
    private boolean IO0O = false;
    private boolean IO00 = false;
    private I1Il IIlO;
    private I1Il IIl0;
    private I1Il IIlo;
    private I1Il II1;
    private I1Il II1I;
    public static boolean II_;
    public static boolean IO0o;
    public static boolean III1;
    public static boolean III_;
    public static boolean IOOO;
    public static String Illl;
    public static Image IlOO;
    public static short IIO;
    public static long IlOI;
    public static long Il1O;
    private int Ioll;
    private I1Il II1l;
    private int I1_O;
    private int lIoO = II.IIl1 - 30;
    private int I1_o;
    private int I1O = -1;
    public static boolean IOo;
    private int I1OI = 2;
    private int I1Ol = 0;
    private int I1O1 = -40;
    private int I1O_ = 1;
    private I1Il II11;

    @Override
    public void I0l_() {
        IO.II();
        this.IIIl.Il_0 = true;
        this.III1.Il_0 = false;
        if (II.IIIl) {
            this.IIIl.Il_0 = false;
        }
        II.III(0);
        super.I0l_();
    }

    public I1o_() {
        int n;
        byte by = (byte)(System.currentTimeMillis() % 9L);
        IOlO.l1o1 = by;
        if (by == 5 || IOlO.l1o1 == 6) {
            IOlO.l1o1 = 4;
        }
        I1_I.IIlI(-1, -1);
        I1_I.Io1 = 100;
        I1_I.Io1I = 200;
        this.IIIl = II.IIlI > 200 ? II.IIl1 - 80 : II.IIl1 - 65;
        this.IIII = -50;
        this.lIo_ = n = II.IIl >= 200 ? 160 : 140;
        this.Ioll = II.IIl1 - IO1_.ll11 - 5;
        if (II.IIlI <= 160) {
            this.Ioll = 20;
        }
        this.IIIl = new IOI0();
        this.IIIl.I_O0 = II.IIl1 - IO1_.ll11 - 9;
        this.IIIl.l10 = this.lIo_;
        this.IIIl.l10I = IO1_.ll11 + 2;
        this.IIIl.Il_0 = true;
        this.IIIl.Ill(0);
        this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + I1o_.Il1O("\udf5b", 57204)) + IO11.I11_;
        this.III1 = new IOI0();
        this.III1.I_O0 = II.IIl1 - 4;
        this.III1.Ill(2);
        this.III1.l10 = this.lIo_;
        this.III1.l10I = IO1_.ll11 + 2;
        this.Ioll += 35;
        this.IO0O = true;
        n = I_O1.III(I1o_.Il1O("\udf17\udffb\udfd7\udfb2\udf9b", 57204));
        if (n == 1) {
            this.IO0O = true;
        } else if (n == 2) {
            this.IO0O = false;
        }
        this.IIIl.IIOl(I_O1.IIl(I1o_.Il1O("\udf15\udff0\udfd1", 57204)));
        this.III1.IIOl(I_O1.IIl(I1o_.Il1O("\udf04\udff2\udfc1\udfa2", 57204)));
        this.IIIl.IIOl(null);
        this.III1.IIOl(null);
        if (this.II11 == null) {
            this.II11 = new I1Il(I1o_.Il1O("\udf33\uc15e\udfdb\udff1\udf98\ue060\ue05a\ue021\ue005\ue0e5\ue0cf", 57204), this, 13, null);
            this.II11.I1 = II.IIl - 75;
            this.II11.I1I = IO10.l_lI == 1 && !II.IIIl ? II.IIlI - 20 : 8;
        }
        this.lIo1 = 0;
        this.IIlO = new I1Il(II.IIl > 200 ? IO11.I1_o : IO11.I1O, II.II, 888393, null);
        new I1Il(IO11.I_ll, this, 2001, null);
        this.IIlo = new I1Il(IO11.I1OI, this, 2002, null);
        this.II1I = new I1Il(IO11.I_l_, this, 10021, null);
        this.IIIo = this.II1 = new I1Il(IO11.I_, this, 2003, null);
        if (II.IIIl) {
            this.IIlO.I1 = II.IIl / 2 + 8;
            this.II1.I1 = II.IIl / 2 - IO1_.l_Io - 8;
            if (II.IIlI >= 200) {
                this.IIlO.I1I = this.lIoO + 110;
                this.II1.I1I = this.lIoO + 110;
            }
            this.II1I.I1 = II.IIl / 2 + 3;
            this.II1I.I1I = this.lIoO + 110;
            this.IIlo.I1 = II.IIl / 2 - 84;
            this.IIlo.I1I = this.II1.I1I;
        }
        this.I1_o = 170;
        int n2 = 184;
        if (184 >= II.IIl) {
            n2 = 152;
        }
        this.I1_O = II.IIl / 2 - n2 / 2;
        this.lIoO = II.IIl1 - 30;
        this.IIIl.II0I = this.I1_O + 10;
        this.IIIl.I_O0 = this.lIoO + 20;
        this.II1l = new I1Il(IO11.I_lI, this, 2008, null);
        this.II1l.I1 = II.IIl / 2 - 84;
        this.II1l.I1I = this.IIlO.I1I;
        this.IIl0 = new I1Il(IO11.I1lO, this, 1003, null);
        this.IIl0.I1 = II.IIl / 2 + 3;
        this.IIl0.I1I = this.IIlO.I1I;
        this.III0 = this.II1l;
        this.IIIo = this.IIl0;
    }

    public void I0OI() {
        I_Ol.II__(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfd0\ue06e\ue041\ue070\ue04c", 57204) + I_O1.IIl(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I));
        String string = I_O1.IIl(I1o_.Il1O("\udf15\udff0\udfd1", 57204));
        String string2 = I_O1.IIl(I1o_.Il1O("\udf04\udff2\udfc1\udfa2", 57204));
        IOo = (string == null || string.equals("")) && I_O1.IIl(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I) != null && !I_O1.IIl(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I).equals("");
        I_Ol.II__(I1o_.Il1O("\udf1d\udfe0\udffe\udfbe\udf97\ue066\ue040\ue06d\ue05e\ue0b6\ue08a", 57204) + IOo);
        if ((string == null || string.equals("")) && IOo) {
            string = I_O1.IIl(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I);
            string2 = I1o_.Il1O("\udf15", 57204);
        }
        I_Ol.II__(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfd0\ue032\ue00e", 57204) + string + I1o_.Il1O("\udf54\udfe3\udfd3\udfa2\udf83\ue032\ue00e", 57204) + string2);
        if (string != null && string2 != null && !string.equals("")) {
            if (string2.equals("")) {
                this.lIo1 = 1;
                this.IIIl.Il_0 = false;
                this.III1.Il_0 = true;
                if (!II.IIIl) {
                    this.IIl = this.III1.IIII;
                }
            } else {
                if (!I_0O.II().IlI_()) {
                    II.II();
                }
                I_0_.II().II(string, string2, I1o_.Il1O("\udf45\udfbd\udf82\udfff\udfc2", 57204), (byte)(IOo ? 1 : 0));
                I_Ol.II__(this.getClass().getName() + I1o_.Il1O("\udf54\udff7\udfdd\udf9d\udf9f\ue068\ue047\ue023\ue04c\ue0b6", 57204) + string);
                if (I_0O.II().I0O) {
                    II.IIIO();
                } else {
                    II.II(IO11.Ilo1);
                }
                this.lIo1 = 0;
                if (!IOo) {
                    this.I0O1();
                }
                II.IIIO = IO10.IIII() + 30000L;
            }
        }
    }

    public void I0Ol() {
        if (this.IO0O) {
            I_O1.IIIl(I1o_.Il1O("\udf17\udffb\udfd7\udfb2\udf9b", 57204), 1);
            I_O1.III1(I1o_.Il1O("\udf15\udff0\udfd1", 57204), this.IIIl.IIl1().toLowerCase().trim());
            I_O1.III1(I1o_.Il1O("\udf04\udff2\udfc1\udfa2", 57204), this.III1.IIl1().toLowerCase().trim());
        } else {
            I_O1.IIIl(I1o_.Il1O("\udf17\udffb\udfd7\udfb2\udf9b", 57204), 2);
            I_O1.III1(I1o_.Il1O("\udf15\udff0\udfd1", 57204), "");
            I_O1.III1(I1o_.Il1O("\udf04\udff2\udfc1\udfa2", 57204), "");
        }
    }

    @Override
    public void IIlO() {
        if (IIO > 0) {
            II.IIIO();
            Il1O = System.currentTimeMillis();
            if (Il1O - IlOI >= 1000L) {
                if ((IIO = (short)(IIO - 1)) == 0) {
                    II.II.I0OI();
                }
                IlOI = Il1O;
            }
        }
        if (IOo && !this.IO00) {
            this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + I1o_.Il1O("\udf5b", 57204)) + IO11.I11_;
            this.III1.II1o = IO11.I1l0;
            this.IIIl.I0O_ = false;
            this.III1.I0O_ = false;
            this.IIIl.IIlO();
            this.III1.IIlO();
        } else {
            this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + I1o_.Il1O("\udf5b", 57204)) + IO11.I11_;
            this.III1.II1o = IO11.I1l0;
            this.IIIl.IIlO();
            this.III1.IIlO();
        }
        for (int i = 0; i < I1l1.II1_.size(); ++i) {
            ((I1l1)I1l1.II1_.elementAt(i)).IIlO();
        }
        if (!(!II_ || IO0o || IOOO || III1 || III_)) {
            II_ = false;
            System.gc();
            I_0_.II().IoOo();
        }
        if (++I1_I.Io1 > II.IIl * 3 + 100) {
            I1_I.Io1 = 100;
        }
        if (Ilo1.III == null) {
            if (this.IIIl != this.IIII) {
                this.IIII += this.IIIl - this.IIII >> 1;
            }
            if (this.I1Ol >= 0) {
                this.I1O1 += this.I1O_ * this.I1Ol;
                this.I1Ol += this.I1O_ * this.I1OI;
                if (this.I1Ol <= 0) {
                    this.I1O_ = -this.I1O_;
                }
                if (this.I1O1 > 0) {
                    this.I1O_ = -this.I1O_;
                    this.I1Ol -= 2 * this.I1OI;
                }
            }
            if (this.I1O >= 0 && II.IIIO % 100 == 0) {
                ++this.I1O;
                if (this.I1O >= IO11.II0O.length) {
                    this.I1O = 0;
                }
                if (II.II == II.II && II.II.I_1o) {
                    II.II.II10(IO11.II0O[this.I1O]);
                }
            }
            if (IOo && !this.IO00) {
                this.IIIl.I0O_ = false;
                this.III1.I0O_ = false;
                this.IIIl.IIlO();
                this.III1.IIlO();
            } else {
                this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + I1o_.Il1O("\udf5b", 57204)) + IO11.I11_;
                this.III1.II1o = IO11.I1l0;
                this.IIIl.IIlO();
                this.III1.IIlO();
            }
            if (II.IIIl) {
                if (this.IO00) {
                    this.III0 = this.IIlo;
                    this.IIIo = this.II1I;
                } else {
                    this.III0 = this.II1l;
                    this.IIIo = this.IIl0;
                }
            } else if (this.IO00) {
                this.III0 = this.IIlo;
                this.IIIo = this.II1I;
            } else {
                this.III0 = this.II1l;
                this.IIIo = this.IIl0;
            }
        }
    }

    @Override
    public void IIO1(int n) {
        if (this.IIIl.Il_0) {
            this.IIIl.II1o(n);
        } else if (this.III1.Il_0) {
            this.III1.II1o(n);
        }
        super.IIO1(n);
    }

    @Override
    public void III_(IO1l iO1l) {
        II.III1(iO1l);
        int n = this.IIIl.I_O0 - 50;
        if (II.IIlI <= 220) {
            n += 5;
        }
        IO1I.II1I.II(iO1l, I1o_.Il1O("\udf02\udfa2\udf9c\udfe1\udfde\ue03d", 57204), II.IIl - 2, 17, 1, IO1I.IIlO);
        if (IO10.l_lI == 1 && !II.IIIl) {
            IO1I.II1I.II(iO1l, I_0l.IlI1, II.IIl - 2, II.IIlI - 15, 1, IO1I.IIlO);
        } else {
            IO1I.II1I.II(iO1l, I_0l.IlI1, II.IIl - 2, 2, 1, IO1I.IIlO);
        }
        if (Ilo1.III == null && Ilo1.IIII == null) {
            if (II.II == null) {
                int n2 = II.IIl >= 200 ? 180 : 160;
                I__O.II(iO1l, this.I1_O, this.lIoO - 10, n2, 105, -1, true);
                if (II.IIlI > 160 && IlOO != null) {
                    iO1l.II(IlOO, II.IIll, n, 3);
                }
                int n3 = 184;
                if (184 >= II.IIl) {
                    n3 = 152;
                }
                this.I1_O = II.IIl / 2 - n3 / 2;
                this.IIIl.II0I = this.I1_O + 10;
                this.IIIl.I_O0 = this.lIoO + 20;
                this.III1.II0I = this.I1_O + 10;
                this.III1.I_O0 = this.lIoO + 55;
                this.IIIl.III_(iO1l);
                this.III1.III_(iO1l);
                if (II.IIl < 176) {
                    IO1I.IIIO.II(iO1l, IO11.I11O + I1o_.Il1O("\udf4e", 57204), this.IIIl.II0I - 35, this.IIIl.I_O0 + 7, 0);
                    IO1I.IIIO.II(iO1l, IO11.I110 + I1o_.Il1O("\udf4e", 57204), this.III1.II0I - 35, this.III1.I_O0 + 7, 0);
                    IO1I.IIIO.II(iO1l, IO11.I101 + I1o_.Il1O("\udf4e\udfb3", 57204) + Illl, II.IIl / 2, this.III1.I_O0 + 32, 2);
                }
            }
            super.III_(iO1l);
        }
    }

    @Override
    public void I_Il() {
        if (II.IIIl && this.II11 != null && this.II11.II0o()) {
            this.II11.I0lO();
        }
        if (!IO0_) {
            if (!II.IIIl) {
                this.IIl = this.IIIl.Il_0 ? this.IIIl.IIII : this.III1.IIII;
            }
            if (II.II[2]) {
                --this.lIo1;
                if (this.lIo1 < 0) {
                    this.lIo1 = 1;
                }
            } else if (II.II[8]) {
                ++this.lIo1;
                if (this.lIo1 > 1) {
                    this.lIo1 = 1;
                }
            }
            if (II.II[2] || II.II[8]) {
                II.IIIl();
                if (!IOo || this.IO00) {
                    if (this.lIo1 == 1) {
                        this.IIIl.Il_0 = false;
                        this.III1.Il_0 = true;
                    } else if (this.lIo1 == 0) {
                        this.IIIl.Il_0 = true;
                        this.III1.Il_0 = false;
                    } else {
                        this.IIIl.Il_0 = false;
                        this.III1.Il_0 = false;
                    }
                }
            }
            if (II.IIIl) {
                if (this.IO00) {
                    this.III0 = this.IIlo;
                    this.IIIo = this.II1I;
                } else {
                    this.III0 = this.II1l;
                    this.IIIo = this.IIl0;
                }
            } else if (this.IO00) {
                this.III0 = this.IIlo;
                this.IIIo = this.II1I;
            } else {
                this.III0 = this.II1l;
                this.IIIo = this.IIl0;
            }
            if (II.IIIo && (!IOo || this.IO00)) {
                if (II.II(this.IIIl.II0I, this.IIIl.I_O0, this.IIIl.l10, this.IIIl.l10I)) {
                    this.lIo1 = 0;
                } else if (II.II(this.III1.II0I, this.III1.I_O0, this.III1.l10, this.III1.l10I)) {
                    this.lIo1 = 1;
                }
            }
            super.I_Il();
            II.IIIl();
        }
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 13: {
                switch (IO10.l_lI) {
                    case 1: {
                        IO10.IOlI();
                        return;
                    }
                    default: {
                        return;
                    }
                    case 3: 
                    case 5: {
                        return;
                    }
                    case 6: 
                }
                return;
            }
            case 1000: {
                try {
                    GameMidlet.II.platformRequest((String)object);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                II.III_();
                return;
            }
            case 1001: {
                II.III_();
                this.IO00 = false;
                return;
            }
            case 1002: {
                II.IIIO();
                String string = I_O1.IIl(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I);
                if (string != null && !string.equals("")) {
                    I1o_ i1o_ = II.II;
                    IOo = true;
                    II.II();
                    I_0_.II().Io__();
                    I_0_.II().II(string, "", I1o_.Il1O("\udf45\udfbd\udf82\udfff\udfc2", 57204), (byte)1);
                    return;
                }
                I_0_.II().IIO("");
                return;
            }
            case 1003: {
                II.II(IO11.I11o);
                return;
            }
            case 1004: {
                I_0l.Io1O();
                II.II.I0l_();
                return;
            }
            case 1005: {
                try {
                    GameMidlet.II.platformRequest(I1o_.Il1O("\udf1c\udfe7\udfc6\udfa1\udfca\ue020\ue001\ue023\ue00b\ue0e4\ue0c9\ue0bb\ue087\ue169\ue141\ue12a\ue10a\ue1ef\ue1cb\ue1af\ue185\ue1d1\ue27d\ue252\ue231", 57204));
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.IO0O) {
                    this.IO0O = false;
                    return;
                }
                this.IO0O = true;
                return;
            }
            case 2002: {
                I1o_ i1o_ = this;
                if (this.IIIl.IIl1().equals("")) {
                    II.II(IO11.IlO);
                    break;
                }
                this.IIIl.IIl1().toCharArray();
                if (this.III1.IIl1().equals("")) {
                    II.II(IO11.I1Io);
                    break;
                }
                if (this.IIIl.IIl1().length() >= 5) {
                    boolean bl;
                    String string = null;
                    if (IO11.IllI == 2) {
                        if (this.IIIl.IIl1().indexOf(I1o_.Il1O("\udf34", 57204)) == -1 || this.IIIl.IIl1().indexOf(I1o_.Il1O("\udf5a", 57204)) == -1) {
                            string = IO11.I1ll;
                        }
                        bl = false;
                    } else {
                        try {
                            Long.parseLong(i1o_.IIIl.IIl1());
                            if (i1o_.IIIl.IIl1().length() < 8 || i1o_.IIIl.IIl1().length() > 12 || !i1o_.IIIl.IIl1().startsWith(I1o_.Il1O("\udf44", 57204)) && !i1o_.IIIl.IIl1().startsWith(I1o_.Il1O("\udf4c\udfa7", 57204))) {
                                string = IO11.I1lI;
                            }
                            bl = true;
                        }
                        catch (Exception exception) {
                            if (this.IIIl.IIl1().indexOf(I1o_.Il1O("\udf34", 57204)) == -1 || this.IIIl.IIl1().indexOf(I1o_.Il1O("\udf5a", 57204)) == -1) {
                                string = IO11.I1ll;
                            }
                            bl = false;
                        }
                    }
                    if (string != null) {
                        II.II(string);
                    } else {
                        II.II.II(IO11.I11l + (bl ? IO11.I111 + I1o_.Il1O("\udf4e\udfb3", 57204) : IO11.I11_ + I1o_.Il1O("\udf4e\udfb3", 57204)) + this.IIIl.IIl1() + I1o_.Il1O("\udf7e", 57204) + IO11.I1l0 + I1o_.Il1O("\udf4e\udfb3", 57204) + this.III1.IIl1(), new I1Il(IO11.I_l1, this, 4000, null), null, new I1Il(IO11.I_IO, II.II, 8882, null));
                    }
                    return;
                }
                II.II(IO11.I1l);
                break;
            }
            case 2003: {
                I_lO i_lO = new I_lO(I1o_.Il1O("\udf02\udfde\udfd7\udfbf\udf85\ue02f\ue062\ue022\ue00b\ue0e2\ue0c4", 57204));
                i_lO.addElement(new I1Il(IO11.I1l1, this, 2004, null));
                if (!IOo) {
                    i_lO.addElement(new I1Il(IO11.I1l_, this, 1004, null));
                }
                i_lO.addElement(new I1Il(IO11.I1lO, this, 1003, null));
                i_lO.addElement(new I1Il(IO11.I10l, this, 1005, null));
                if (I_O1.III(I1o_.Il1O("\udf18\udffc\udfc5\udf96\udf82\ue06e\ue05e\ue025\ue005\ue0e8", 57204)) == 1) {
                    i_lO.addElement(new I1Il(IO11.I_OO, this, 10041, null));
                } else {
                    i_lO.addElement(new I1Il(IO11.I_O0, this, 10042, null));
                }
                i_lO.addElement(new I1Il(IO11.I_I0, II.II, 8885, null));
                II.II.II(i_lO);
                return;
            }
            case 2004: {
                this.III_();
                return;
            }
            case 2008: {
                I_O1.III1(I1o_.Il1O("\udf15\udff0\udfd1", 57204), this.IIIl.IIl1().trim());
                I_O1.III1(I1o_.Il1O("\udf04\udff2\udfc1\udfa2", 57204), this.III1.IIl1().trim());
                if (I_0l.I0_O) {
                    II.II.I0l_();
                    return;
                }
                II.II.Io_l();
                return;
            }
            case 4000: {
                String string = this.IIIl.IIl1();
                II.III(IO11.I1O_);
                II.II();
                II.III(IO11.Ilo0);
                I_0_ i_0_ = I_0_.II();
                String string2 = this.III1.IIl1();
                String string3 = I_O1.IIl(I1o_.Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I);
                I_O1.IIl(I1o_.Il1O("\udf04\udff2\udfc1\udfa2\udfb1\ue060", 57204));
                i_0_.II(string, string2, string3, I1o_.Il1O("\udf45\udfbd\udf82\udfff\udfc2", 57204));
                I_O1.III1(I1o_.Il1O("\udf15\udff0\udfd1", 57204), string);
                I_O1.III1(I1o_.Il1O("\udf04\udff2\udfc1\udfa2", 57204), this.III1.IIl1());
                break;
            }
            case 10021: {
                this.I0O1();
                return;
            }
            case 10041: {
                I_O1.IIIl(I1o_.Il1O("\udf18\udffc\udfc5\udf96\udf82\ue06e\ue05e\ue025\ue005\ue0e8", 57204), 0);
                II.II(IO11.IO1, 8885, null);
                return;
            }
            case 10042: {
                I_O1.IIIl(I1o_.Il1O("\udf18\udffc\udfc5\udf96\udf82\ue06e\ue05e\ue025\ue005\ue0e8", 57204), 1);
                II.II(IO11.IO1, 8885, null);
                return;
            }
        }
    }

    private void I0O1() {
        if (IOo) {
            this.I0OI();
        } else {
            this.IO00 = false;
            this.III1.Il_0 = false;
            this.IIIl.Il_0 = true;
            this.IIIo = this.II1;
        }
    }

    public void III_() {
        II.III_();
        II.II(IO11.Ioo);
        this.IO00 = true;
        this.III1.Il_0 = false;
        this.IIIl.Il_0 = true;
    }

    public static void I0O_() {
        II.IIIO = IO10.IIII() + 30000L;
        I_0l.IoII = 0;
        I1o_ i1o_ = II.II;
        if (IOo) {
            II.II(IO11.Io0o, new I1Il(IO11.I_I_, II.II, 10019, null), new I1Il(IO11.I_IO, II.II, 10020, null));
        } else {
            II.II(II.II);
        }
    }

    static {
        IOo = false;
        int[] nArray = new int[]{0, 8, 2, 6, 9};
    }

    private static /* synthetic */ String Il1O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

