/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class IO10 {
    public static boolean I_1o = false;
    public static boolean I1l1 = false;
    public static boolean III = false;
    private static Image IlOO = IO10.IIII(IO10.I1ll("\u82fb\u829e\u8373\u8358\u833e\u8326\u83e3\u83cc\u83ab\u838e\u8425\u844b\u8424\u8406\u84e5\u84ce\u84ea\u8493\u856c\u8546", 33492));
    public static int l_lI = 1;
    public static byte Illl = 0;
    public static byte Ill1 = 0;
    public static byte II1_ = (byte)5;
    public static String IIo_;
    public static boolean I1_l;

    public static void IIl1() {
        Ill1 = 0;
    }

    public static int III1(Image image) {
        if (image == null) {
            return 0;
        }
        return l_lI == 5 ? image.getWidth() : image.getWidth();
    }

    public static int III_(Image image) {
        if (image == null) {
            return 0;
        }
        return l_lI == 5 ? image.getHeight() : image.getWidth();
    }

    public static String II(long l, int n, boolean bl, boolean bl2) {
        long l2 = (l + (long)(n * 1000) - System.currentTimeMillis()) / 1000L;
        return l2 <= 0L ? "" : String.valueOf(l2);
    }

    public static String IIIO(long l) {
        String string = "" + l;
        boolean bl = false;
        try {
            int n;
            String string2;
            if (l < 0L) {
                bl = true;
                l = -l;
                string = "" + l;
            }
            if (l >= 1000000000L) {
                string2 = IO10.I1ll("\u82b6", 33492);
                n = ("" + (l /= 1000000000L)).length();
            } else if (l >= 1000000L) {
                string2 = IO10.I1ll("\u82b9", 33492);
                n = ("" + (l /= 1000000L)).length();
            } else {
                if (l < 1000L) {
                    if (bl) {
                        return IO10.I1ll("\u82f9", 33492) + string;
                    }
                    return string;
                }
                string2 = IO10.I1ll("\u82bf", 33492);
                n = ("" + (l /= 1000L)).length();
            }
            int n2 = Integer.parseInt(string.substring(n, 2));
            string = n2 == 0 ? string.substring(0, n) + string2 : (n2 % 10 == 0 ? string.substring(0, n) + IO10.I1ll("\u82f8", 33492) + string.substring(n, 1) + string2 : string.substring(0, n) + IO10.I1ll("\u82f8", 33492) + string.substring(n, 2) + string2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return bl ? IO10.I1ll("\u82f9", 33492) + string : string;
    }

    public static void IOlI() {
        try {
            GameMidlet.II.platformRequest(I_0l.IlI1);
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            connectionNotFoundException.printStackTrace();
        }
    }

    public static void III(IO1l iO1l, int n, int n2, int n3) {
        n3 = n3 / IO1l.II(IlOO) + 1;
        for (int i = 0; i < n3; ++i) {
            iO1l.II(IlOO, n + i * IO1l.II(IlOO), n2, 0);
        }
    }

    public static void III() {
        while (I1I1.I___) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public static void IIlI(boolean bl) {
        if (II.II.equals(IOI.II)) {
            if (I_0l.IIl != null) {
                if (!I_0l.IIl[0]) {
                    I_0l.IIl[0] = true;
                    I_0l.l1_I = 0;
                    int n = IO10.IIOo();
                    if (n == -1) {
                        n = I_0l.l1_I;
                    }
                    GameMidlet.III = I_0l.II1l[n];
                    I_O1.IIIl(IO10.I1ll("\u82a7\u8285\u8361\u8354\u833c\u830a\u83ed\u83d9", 33492), n);
                    II.II();
                } else if (!I_0l.IIl[2]) {
                    I_0l.IIl[2] = true;
                    I_0l.l1_I = 2;
                    int n = IO10.IIOo();
                    if (n == -1) {
                        n = I_0l.l1_I;
                    }
                    GameMidlet.III = I_0l.II1l[n];
                    I_O1.IIIl(IO10.I1ll("\u82a7\u8285\u8361\u8354\u833c\u830a\u83ed\u83d9", 33492), n);
                    II.II();
                } else if (I_O1.II(IO10.I1ll("\u829d\u829e\u8373\u8356\u8335\u833c\u83e1\u83d8\u83be\u8388\u846f", 33492)) == null) {
                    II.II(IO11.I1O0, 8885, null);
                } else {
                    II.II(IO11.I1Oo, 9000, null);
                }
            } else if (I_O1.II(IO10.I1ll("\u829d\u829e\u8373\u8356\u8335\u833c\u83e1\u83d8\u83be\u8388\u846f", 33492)) == null) {
                II.II(IO11.I1O0, 8885, null);
            } else {
                II.II(IO11.I1Oo, 9000, null);
            }
        } else {
            I_0O.II().III();
            I_0O.III().III();
            I_0l.I0_l = false;
            if (I1I1.I__1) {
                II.II(IO11.I1O0, 8885, null);
            } else {
                I1o_.IO0_ = false;
                if (II.II != null) {
                    II.II.IIl();
                } else {
                    II.II = new I1o_();
                }
                I1o_.Illl = I_0l.II1I[I_0l.l1_I];
                if (II.II != II.II) {
                    I_Ol.II__(IO10.I1ll("\u82e9\u82ce\u832f\u830c\u836d\u8352\u83b3\u8390\u83f1\u83d6\u8437\u8417\u8468\u8455\u84a6\u84d3\u7b39\u848c\u8522\u856e\u852e\u853c\u8511\u85f3\u85d2\u85be\u8599\u866d\u867e\u8636\u861f\u86f9", 33492));
                    I_0l.IoII = 0;
                } else {
                    II.III_();
                    I_0l.I0_O = true;
                    II.II.I0l_();
                }
                Ilol.I10I = false;
                if (bl) {
                    I_0l.III_ = 0;
                }
            }
        }
    }

    public static void III_(boolean bl) {
        I_0O.II().III();
        I_0O.III().III();
        if (I1I1.I__1) {
            II.II.IIl();
            II.II(IO11.I1O0, 8885, null);
        } else {
            if (II.II != II.II) {
                II.II(IO11.Ilo1);
            } else {
                II.III_();
            }
            Ilol.I10I = false;
            if (bl) {
                I_0l.III_ = 0;
            }
            II.II.IIl();
        }
    }

    public static Image III(String string) {
        String string2 = IO10.I1ll("\u82fb\u828b", 33492) + IO1l.l_I0 + string;
        Image image = I1OI.II(string);
        if (image == null) {
            String[] stringArray = I_Ol.II(I_Ol.II(string2, IO10.I1ll("\u82fa", 33492), 0)[0], IO10.I1ll("\u82fb", 33492), 0);
            byte[] byArray = I_O1.II(IO10.I1ll("\u82ac", 33492) + IO1l.l_I0 + stringArray[stringArray.length - 1]);
            if (byArray != null) {
                image = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            }
        }
        return image;
    }

    public static Image IIII(String string) {
        Image image = null;
        try {
            image = I1OI.II(string);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return image;
    }

    public static Image IIIl(String string) {
        string = IO10.I1ll("\u82fb\u828b", 33492) + IO1l.l_I0 + string;
        Image image = null;
        try {
            image = Image.createImage((String)string);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return image;
    }

    public static void II(IO1l iO1l) {
        for (int i = 0; i < 5; ++i) {
            if (I1_I.Ilo[i] == -1 || !II.II(I1_I.Il01[i], I1_I.Il0_[i])) continue;
            if (I1_I.IloI[i] == 0) {
                IO1I.II_.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2);
                continue;
            }
            if (I1_I.IloI[i] == 1) {
                IO1I.II_l.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2);
                continue;
            }
            if (I1_I.IloI[i] == 2) {
                IO1I.II_1.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2);
                continue;
            }
            if (I1_I.IloI[i] == 3) {
                IO1I.II_l.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2, IO1I.II_1);
                continue;
            }
            if (I1_I.IloI[i] == 8) {
                IO1I.II1.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2, IO1I.III_);
                continue;
            }
            if (I1_I.IloI[i] == 4) {
                IO1I.II1I.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2, IO1I.IIlO);
                continue;
            }
            if (I1_I.IloI[i] == 5) {
                IO1I.II__.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2);
                continue;
            }
            if (I1_I.IloI[i] == 6) {
                IO1I.II_l.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2, IO1I.II_);
                continue;
            }
            if (I1_I.IloI[i] == 7) {
                IO1I.IIII.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2, IO1I.III_);
                continue;
            }
            if (I1_I.IloI[i] == 9) {
                IO1I.IIl0.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2, IO1I.III_);
                continue;
            }
            if (I1_I.IloI[i] != 10) continue;
            IO1I.IIll.III(iO1l, I1_I.IIlO[i], I1_I.Il01[i], I1_I.Il0_[i], 2, IO1I.III_);
        }
    }

    public static long IIII() {
        return System.currentTimeMillis();
    }

    public static I11o II(String string) {
        I11o i11o = null;
        I1oo i1oo = null;
        i1oo = I1O1.II(string, I1O1.III1);
        if (i1oo.II01 != null) {
            int n = i1oo.II01.getHeight() / i1oo.II10;
            if (n <= 0) {
                n = 1;
            }
            i11o = new I11o(i1oo.II01, i1oo.II01.getWidth(), n);
        }
        return i11o;
    }

    public static int IIOo() {
        String[] stringArray = I_Ol.II(I_0l.IIo_.trim(), IO10.I1ll("\u82f8", 33492), 0);
        for (int i = 0; i < stringArray.length - 2; ++i) {
            I_Ol.II(stringArray[i].trim(), IO10.I1ll("\u82ee", 33492), 0);
        }
        return -1;
    }

    static {
        I1_l = false;
    }

    private static /* synthetic */ String I1ll(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

