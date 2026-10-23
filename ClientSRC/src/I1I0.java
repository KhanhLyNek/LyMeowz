/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class I1I0
extends IO1_
implements I1_1 {
    public static I1I0 II;
    public static boolean I1l1;
    private static IOI0 III;
    private static int IolI;
    private static int IIO;
    private static int IIOI;
    private static int[][] IIII;
    private static int[] II00;
    private static int[] II0o;
    private int[] IIo = new int[]{0, 4, 8};
    private int IoII = 168;
    private int IIO0 = 350;
    private int IIOo = 45;
    private int II0;
    private int II;

    public static I1I0 II() {
        if (II == null) {
            II = new I1I0();
        }
        return II;
    }

    private static void II(byte[] byArray) throws IOException {
        for (int i = 0; i < byArray.length; ++i) {
            InputStream inputStream = I11O.II(I1I0.IlIl("\u726c\u720f\u72f8\u72cd\u72de\u72ae\u72d2", 29251) + byArray[i]);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            I_.I1ll[i] = (char)dataInputStream.read();
            I_.I1l1[i] = (char)dataInputStream.read();
            I_.IIIO[i] = new int[dataInputStream.available()];
            for (int j = 0; j < I_.I1ll[i] * I_.I1l1[i]; ++j) {
                I_.IIIO[i][j] = dataInputStream.read();
            }
            I_.III0[i] = new int[I_.IIIO[i].length];
        }
    }

    @Override
    public void I0l_() {
        I1o_.IO0_ = false;
        II.II.IOol = false;
        II.III_();
        super.I0l_();
        IolI = I_Ol.III_(0, 3);
        IIO = I_Ol.III_(0, 3);
        this.I0l0();
        Ilol.I10I = false;
        if (III != null) {
            I1I0.III.II1o = IO11.I1_0;
        }
        I_0l.IoII = 0;
    }

    private void I0l0() {
        IOlO.IIO = new int[I_.IIIO[IolI].length];
        for (int i = 0; i < I_.IIIO[IolI].length; ++i) {
            IOlO.IIO[i] = I_.IIIO[IolI][i];
        }
        IOlO.I1ol = I_.III0[IolI];
        IOlO.l10o = I_.Ill0[IolI];
        IOlO.l100 = I_.IlO[IolI];
        IOlO.l1o = I_.IlO[IolI];
        IOlO.l10_ = I_.I1ll[IolI];
        IOlO.l10O = I_.I1l1[IolI];
        IOlO.l1o = this.IIo[IolI] + 1;
        IOlO.IO_();
        II.III(this.IIo[IolI]);
        I1_I.IIlI(this.IoII, this.IIO0);
    }

    public I1I0() {
        try {
            if (!II.II) {
                byte[] byArray = new byte[]{39, 40, 41};
                if (!II.II) {
                    try {
                        for (int i = 0; i < byArray.length; ++i) {
                            InputStream inputStream = I11O.II(I1I0.IlIl("\u726c\u720f\u72f8\u72cd\u72de\u72ae\u72d2\u7371\u735a\u732a\u732d\u73f9\u73d5\u73ba\u7390", 29251) + byArray[i]);
                            DataInputStream dataInputStream = new DataInputStream(inputStream);
                            int n = dataInputStream.readShort();
                            I_.II[i] = new I_lO(I1I0.IlIl("\u720e\u7203\u72f1\u72f4\u72da\u72b3\u728d\u7370\u735a\u732e\u731c\u73b6\u73c1\u7395\u7380\u7466\u7441\u741b\u7405\u74f5\u74c2\u7495\u748c\u7551\u750b", 29251));
                            for (int j = 0; j < n; ++j) {
                                short s = dataInputStream.readShort();
                                short s2 = dataInputStream.readShort();
                                short s3 = dataInputStream.readShort();
                                if (IOlO.II(s) == null) continue;
                                Il0o il0o = IOlO.II(s);
                                Il0o il0o2 = new Il0o();
                                new Il0o().II0I = s;
                                il0o2.IIII = il0o.IIII;
                                il0o2.IIOI = il0o.IIOI;
                                il0o2.IIOl = il0o.IIOl;
                                il0o2.I_0 = s2 * IOlO.IlI0;
                                il0o2.IIO = s3 * IOlO.IlI0;
                                il0o2.III = il0o.III;
                                I_.II[i].addElement(il0o2);
                                if (!Il0o.III.containsKey(String.valueOf(il0o2.IIII))) {
                                    Image image;
                                    try {
                                        image = IO10.IIII(I1I0.IlIl("\u726c\u720f\u72e0\u72d0\u72fd\u72bf\u729e\u7377\u737c\u7328\u7316\u73ed\u73d9\u73b2\u73da", 29251) + il0o2.IIII + I1I0.IlIl("\u726d\u7212\u72ef\u72c7", 29251));
                                        Il0o.III.put(String.valueOf(il0o2.IIII), image);
                                    }
                                    catch (Exception exception) {
                                        image = IO10.IIIl(I1I0.IlIl("\u726c\u720f\u72e0\u72d0\u72fd\u72bf\u729e\u7377\u737c\u7328\u7316\u73ed\u73d9\u73b2\u73da", 29251) + il0o2.IIII + I1I0.IlIl("\u726d\u7212\u72ef\u72c7", 29251));
                                        if (image == null) {
                                            image = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                            I_0_.II().III1(il0o2.IIII);
                                        }
                                        Il0o.III.put(String.valueOf(il0o2.IIII), image);
                                    }
                                    Il0o.IIIo.addElement(String.valueOf(il0o2.IIII));
                                }
                                if (Il0o.IIIO(String.valueOf(il0o2.IIII))) continue;
                                Il0o.III0.addElement(String.valueOf(il0o2.IIII));
                            }
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
            I1I0.II(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (II.IIl <= 200) {
            I1_I.IIl_(128, 100);
            I1_I.lI1o = (II.IIl - 128) / 2;
            I1_I.lI10 = 10;
            this.IIO0 += 15;
            this.IIOo -= 15;
        }
        IolI = 1;
        III = new IOI0();
        new IOI0().l10 = II.II.IIIl.l10;
        if (II.IIl < 200) {
            I1I0.III.l10 = 60;
        }
        I1I0.III.l10I = 26;
        if (II.IIl < 200) {
            I1I0.III.II0I = I1_I.lI1o + 45;
            I1I0.III.I_O0 = I1_I.lI10 + 12;
        } else {
            I1I0.III.II0I = II.IIl / 2 - I1I0.III.l10 / 2;
            I1I0.III.I_O0 = 35;
        }
        if (!II.IIIl) {
            I1I0.III.Il_0 = true;
        }
        III.Ill(0);
        I1I0.III.II1o = IO11.I1_0;
        if (III.IIl1().equals(I1I0.IlIl("\u7203", 29251))) {
            III.IIOl(II.II.IIIl.IIl1().substring(0, II.II.IIIl.IIl1().indexOf(I1I0.IlIl("\u7203", 29251))));
        }
        IolI = 1;
        IIO = 0;
        this.III0 = new I1Il(IO11.I_1, this, 8000, null);
        this.IIIo = new I1Il(IO11.I_1I, this, 8001, null);
        if (!II.IIIl) {
            this.IIl = I1I0.III.IIII;
        }
    }

    @Override
    public void IIO1(int n) {
        III.II1o(n);
    }

    @Override
    public void IIlO() {
        ++this.II0;
        if (this.II0 > 30) {
            this.II0 = 0;
        }
        this.II = this.II0 % 15 < 5 ? 0 : 1;
        III.IIlO();
        if (IIOI != 0) {
            I1I0.III.Il_0 = false;
        }
    }

    @Override
    public void I_Il() {
        if (II.II[2] && --IIOI < 0) {
            IIOI = IO11.IIO0.length - 1;
        }
        if (II.II[8] && ++IIOI >= IO11.IIO0.length) {
            IIOI = 0;
        }
        if (IIOI == 0) {
            if (!II.IIIl) {
                this.IIl = I1I0.III.IIII;
            }
            III.IIlO();
        }
        if (IIOI == 1) {
            if (II.II[4]) {
                if (--IolI < 0) {
                    IolI = IO11.IIOo.length - 1;
                }
                this.I0l0();
            }
            if (II.II[6]) {
                if (++IolI > IO11.IIOo.length - 1) {
                    IolI = 0;
                }
                this.I0l0();
            }
            this.IIl = null;
        }
        if (IIOI == 2) {
            if (II.II[4] && --IIO < 0) {
                IIO = IO11.II1[0].length - 1;
            }
            if (II.II[6] && ++IIO > IO11.II1[0].length - 1) {
                IIO = 0;
            }
            this.IIl = null;
        }
        if (II.IIIo) {
            int n;
            int n2 = 110;
            int n3 = 60;
            if (II.IIl > II.IIlI) {
                n2 = 100;
                n3 = 40;
            }
            if (II.II(II.IIl / 2 - 117, 15, 234, 80)) {
                IIOI = 0;
                I1I0.III.Il_0 = true;
            }
            if (II.II(II.IIl / 2 - 117, n2 - 30, 234, n3 + 5)) {
                IIOI = 1;
                n = IolI;
                IolI = (II.II - (II.IIl / 2 - 117)) / 78;
                if (IolI < 0) {
                    IolI = 0;
                }
                if (IolI > IO11.IIOo.length - 1) {
                    IolI = IO11.IIOo.length - 1;
                }
                if (n != IolI) {
                    this.I0l0();
                }
            }
            if (II.II(II.IIl / 2 - 117, n2 - 30 + n3 + 5, 234, 65)) {
                IIOI = 2;
                n = IIO;
                IIO = (II.II - (II.IIl / 2 - 117)) / 78;
                if (IIO < 0) {
                    IIO = 0;
                }
                if (IIO > IO11.II1[0].length - 1) {
                    IIO = IO11.II1[0].length - 1;
                }
                if (n != IIOI) {
                    this.I0l0();
                }
            }
        }
        super.I_Il();
        II.III1();
        II.IIIl();
    }

    @Override
    public void III_(IO1l iO1l) {
        if (!Ilol.I10I) {
            int n;
            int n2;
            II.III1(iO1l);
            iO1l.IIl0(-I1_I.Io1, -I1_I.Io1I);
            if (!II.II) {
                for (n2 = 0; n2 < I_.II[IolI].size(); ++n2) {
                    Il0o il0o = (Il0o)I_.II[IolI].elementAt(n2);
                    if (il0o.IIII == -1 || il0o.III != 1) continue;
                    il0o.II(iO1l);
                }
            }
            if (IO10.l_lI == 5) {
                II.IIIl(iO1l);
            } else {
                IOlO.IIo(iO1l);
            }
            int n3 = 30;
            if (II.IIl == 128) {
                n3 = 20;
            }
            int n4 = IIII[IolI][IIO];
            int n5 = II00[IolI];
            int n6 = II0o[IolI];
            iO1l.II(IOlO.IIlI, this.IoII, this.IIO0 + this.IIOo, 3);
            I_O1 i_O1 = I1_I.II[n4];
            I_O1 i_O12 = I1_I.II[n5];
            I_O1 i_O13 = I1_I.II[n6];
            I_oo.IIII(iO1l, i_O1.II[Ilol.II[this.II][0][0]].II1o, this.IoII + Ilol.II[this.II][0][1] + i_O1.II[Ilol.II[this.II][0][0]].IIO_, this.IIO0 - Ilol.II[this.II][0][2] + i_O1.II[Ilol.II[this.II][0][0]].II1O + this.IIOo, 0, 0);
            I_oo.IIII(iO1l, i_O12.II[Ilol.II[this.II][1][0]].II1o, this.IoII + Ilol.II[this.II][1][1] + i_O12.II[Ilol.II[this.II][1][0]].IIO_, this.IIO0 - Ilol.II[this.II][1][2] + i_O12.II[Ilol.II[this.II][1][0]].II1O + this.IIOo, 0, 0);
            I_oo.IIII(iO1l, i_O13.II[Ilol.II[this.II][2][0]].II1o, this.IoII + Ilol.II[this.II][2][1] + i_O13.II[Ilol.II[this.II][2][0]].IIO_, this.IIO0 - Ilol.II[this.II][2][2] + i_O13.II[Ilol.II[this.II][2][0]].II1O + this.IIOo, 0, 0);
            if (!II.II) {
                for (n = 0; n < I_.II[IolI].size(); ++n) {
                    Il0o il0o = (Il0o)I_.II[IolI].elementAt(n);
                    if (il0o.IIII == -1 || il0o.III != 3) continue;
                    il0o.II(iO1l);
                }
            }
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
            if (II.IIl < 200) {
                I_10.III(I1_I.lI1o, I1_I.lI10, I1_I.lI_, I1_I.lI_I, iO1l);
                I_oo.IIII(iO1l, i_O1.II[Ilol.II[0][0][0]].II1o, II.IIl / 2 + Ilol.II[0][0][1] + i_O1.II[Ilol.II[0][0][0]].IIO_, I1_I.lI10 + 30 + n3 * 3 - Ilol.II[0][0][2] + i_O1.II[Ilol.II[0][0][0]].II1O + this.IIOo, 0, 0);
                I_oo.IIII(iO1l, i_O12.II[Ilol.II[0][1][0]].II1o, II.IIl / 2 + Ilol.II[0][1][1] + i_O12.II[Ilol.II[0][1][0]].IIO_, I1_I.lI10 + 30 + n3 * 3 - Ilol.II[0][1][2] + i_O12.II[Ilol.II[0][1][0]].II1O + this.IIOo, 0, 0);
                I_oo.IIII(iO1l, i_O13.II[Ilol.II[0][2][0]].II1o, II.IIl / 2 + Ilol.II[0][2][1] + i_O13.II[Ilol.II[0][2][0]].IIO_, I1_I.lI10 + 30 + n3 * 3 - Ilol.II[0][2][2] + i_O13.II[Ilol.II[0][2][0]].II1O + this.IIOo, 0, 0);
                for (n = 0; n < IO11.IIO0.length; ++n) {
                    if (IIOI == n) {
                        iO1l.II(I1_I.Il_l, 0, 0, 13, 16, 2, I1_I.lI1o + 10 + (II.IIIO % 7 > 3 ? 1 : 0), I1_I.lI10 + 35 + n * n3, IOII.IIOI);
                        iO1l.II(I1_I.Il_l, 0, 0, 13, 16, 0, I1_I.lI1o + I1_I.lI_ - 10 - (II.IIIO % 7 > 3 ? 1 : 0), I1_I.lI10 + 35 + n * n3, IOII.IIOI);
                    }
                    IO1I.III_.II(iO1l, IO11.IIO0[n], I1_I.lI1o + 20, I1_I.lI10 + 30 + n * n3, 0);
                }
                IO1I.III_.II(iO1l, IO11.IIOo[IolI], I1_I.lI1o + 70, I1_I.lI10 + 30 + n3 * 1, 0);
                IO1I.III_.II(iO1l, IO11.II1[IolI][IIO], I1_I.lI1o + 55, I1_I.lI10 + 30 + n3 * 2, 0);
            } else {
                int n7 = 110;
                int n8 = 60;
                if (II.IIl > II.IIlI) {
                    n7 = 100;
                    n8 = 45;
                }
                for (n2 = 0; n2 < 3; ++n2) {
                    if (n2 != IolI) {
                        iO1l.II(I1_I.IlI0, II.IIl / 2 - 78 + n2 * 78, n7, 3);
                    } else {
                        if (IIOI == 1) {
                            iO1l.II(I1_I.Il_l, 0, 0, 13, 16, 4, II.IIl / 2 - 78 + n2 * 78, n7 - 20 + (II.IIIO % 7 > 3 ? 1 : 0), IOII.IIOI);
                        }
                        iO1l.II(I1_I.IlIo, II.IIl / 2 - 78 + n2 * 78, n7, 3);
                    }
                    IO1I.III_.II(iO1l, IO11.IIOo[n2], II.IIl / 2 - 78 + n2 * 78, n7 - 5, 2);
                }
                for (n2 = 0; n2 < 3; ++n2) {
                    if (n2 != IIO) {
                        iO1l.II(I1_I.IlI0, II.IIl / 2 - 78 + n2 * 78, n7 + n8, 3);
                    } else {
                        if (IIOI == 2) {
                            iO1l.II(I1_I.Il_l, 0, 0, 13, 16, 4, II.IIl / 2 - 78 + n2 * 78, n7 + n8 - 20 + (II.IIIO % 7 > 3 ? 1 : 0), IOII.IIOI);
                        }
                        iO1l.II(I1_I.IlIo, II.IIl / 2 - 78 + n2 * 78, n7 + n8, 3);
                    }
                    IO1I.III_.II(iO1l, IO11.II1[IolI][n2], II.IIl / 2 - 78 + n2 * 78, n7 + n8 - 5, 2);
                }
                if (IIOI == 0) {
                    iO1l.II(I1_I.Il_l, 0, 0, 13, 16, 4, II.IIl / 2, 20 + (II.IIIO % 7 > 3 ? 1 : 0), IOII.IIOI);
                }
            }
            III.III_(iO1l);
            iO1l.IIIO(0, 0, II.IIl, II.IIlI);
            IO1I.IIII.II(iO1l, IO11.I101 + I1I0.IlIl("\u7263", 29251) + I1o_.Illl, 5, 5, 0, IO1I.III_);
            super.III_(iO1l);
        }
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 8000: {
                if (III.IIl1().equals("")) {
                    II.II(IO11.I1_l);
                    return;
                }
                if (III.IIl1().length() < 5) {
                    II.II(IO11.I1_1);
                    return;
                }
                if (III.IIl1().length() > 15) {
                    II.II(IO11.I1__);
                    return;
                }
                I1OO.IIl1();
                I_0_.II().II(III.IIl1(), IolI, IIII[IolI][IIO]);
                return;
            }
            case 8001: {
                I1o_ i1o_ = II.II;
                if (I1o_.IOo) {
                    II.II(IO11.Io0o, new I1Il(IO11.I_I_, this, 10019, null), new I1Il(IO11.I_IO, this, 10020, null));
                    return;
                }
                I_0O.II().close();
                II.II.I0l_();
                return;
            }
            case 10019: {
                I_0O.II().close();
                II.III_();
                II.II.I0l_();
            }
            default: {
                return;
            }
            case 10020: 
        }
        II.III_();
    }

    static {
        I1l1 = false;
        IIII = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
        II00 = new int[]{2, 13, 8};
        II0o = new int[]{1, 12, 7};
    }

    private static /* synthetic */ String IlIl(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

