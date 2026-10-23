package main;

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
import main.GameMidlet;

public final class IOlO {
    public static int l10_;
    public static int l10O;
    public static int l100;
    public static int l10o;
    public static int l1o;
    private static int I1O_;
    public static int[] IIO;
    public static int[] I1ol;
    private static Image[] IIll;
    private static Image I1Io;
    private static Image I1l;
    public static Image IIO_;
    private static Image IIlo;
    private static Image var_javax_microedition_lcdui_Image_II1;
    public static byte IlI0;
    private static int var_int_IIl_;
    private static int I10l;
    private static int I101;
    private static int IIOO;
    public static boolean I00l;
    public static String Il_O;
    public static int l1oI;
    public static int IIOo;
    public static int l1ol;
    public static int l1o1;
    public static int l1o_;
    public static int l1oO;
    public static byte IlIo;
    public static byte Ill;
    public static I_lO IlI_;
    public static I_lO II1l;
    public static I_lO IlIO;
    public static String[] II11;
    public static Image IIlI;
    private static int[] Il_1;
    public static int[][] var_int_arr_arr_II1;
    public static int[][][] III;
    public static Image var_javax_microedition_lcdui_Image_IIl_;
    public static int I1_O;
    public static int I1_0;
    public static int I1_o;
    public static int I1O;
    public static int I1OI;
    public static int I1Ol;
    public static int I1O1;

    public static boolean Ill() {
        return l1oI == 51 || l1oI == 103 || l1oI == 112 || l1oI == 113 || l1oI == 129 || l1oI == 130;
    }

    public static boolean II() {
        return l1oI == 39 || l1oI == 40 || l1oI == 41;
    }

    public static boolean III() {
        return I1_I.var_I10_II != null && l1oI == I1_I.var_I10_II.II_I;
    }

    public static Il0o II(int n) {
        for (int i = 0; i < II1l.size(); ++i) {
            Il0o il0o = (Il0o)II1l.elementAt(i);
            if (il0o.II0I != n) continue;
            return il0o;
        }
        return null;
    }

    public static boolean IllI() {
        for (int i = 0; i < Il_1.length; ++i) {
            if (l1oI != Il_1[i]) continue;
            return true;
        }
        return false;
    }

    public static boolean boolean_II1I(int n) {
        if (n != 156 && n != 330 && n != 345 && n != 334) {
            if (l1oI != 54 && l1oI != 55 && l1oI != 56 && l1oI != 57 && l1oI != 58 && l1oI != 59 && l1oI != 103) {
                int n2 = 0;
                for (int i = 0; i < IlIO.size(); ++i) {
                    if (((Il0o)IOlO.IlIO.elementAt((int)i)).II0I != n) continue;
                    ++n2;
                }
                return n2 > 2;
            }
            return false;
        }
        return false;
    }

    public static void IO11() {
        if (I1Io == null) {
            I1Io = IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7b1\ua864\ua850\ua826\ua810\ua8ae\ua8d7\ua8cb\ua8b8\ua8d3\ua96c\ua955\ua93d", 42920));
        }
        if (I1l == null) {
            I1l = IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7b1\ua864\ua850\ua826\ua810\ua8ae\ua8d4\ua8c8\ua8aa\ua89b\ua932\ua94b\ua934\ua91e", 42920));
        }
        if (IIO_ == null) {
            IIO_ = IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7b1\ua864\ua850\ua826\ua810\ua8ae\ua8d7\ua8cb\ua8ad\ua8d3\ua96c\ua955\ua93d", 42920));
        }
        if (IIlo == null) {
            IIlo = IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7b1\ua864\ua850\ua826\ua810\ua8ae\ua8d7\ua8cb\ua8ad\ua8b3\ua932\ua94b\ua934\ua91e", 42920));
        }
        if (var_javax_microedition_lcdui_Image_II1 == null) {
            var_javax_microedition_lcdui_Image_II1 = IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7b1\ua864\ua850\ua826\ua810\ua8ae\ua8d7\ua8cb\ua8ad\ua8b3\ua92e\ua915\ua92a\ua917\ua9ff", 42920));
        }
        System.gc();
    }

    public static void IIII(int n) {
        l10o = l10O * IlI0;
        l100 = l10_ * IlI0;
        --n;
        try {
            for (int i = 0; i < l10_ * l10O; ++i) {
                block3: for (int j = 0; j < var_int_arr_arr_II1[n].length; ++j) {
                    int[] nArray = III[n][j];
                    int n2 = var_int_arr_arr_II1[n][j];
                    int[] nArray2 = nArray;
                    int n3 = i;
                    for (int k = 0; k < nArray2.length; ++k) {
                        if (IIO[n3] != nArray2[k]) continue;
                        int[] nArray3 = I1ol;
                        int n4 = n3;
                        nArray3[n4] = nArray3[n4] | n2;
                        continue block3;
                    }
                }
            }
        }
        catch (Exception exception) {
            System.out.println(IOlO.I1I_("\ua7ed\ua7b5\ua794\ua86a\ua856\ua863\ua82e\ua8ee\ua8c1\ua8db\ua8fe\ua8b0\ua97d\ua94b", 42920));
            exception.printStackTrace();
            GameMidlet.II.IIll();
        }
    }

    public static boolean Illl() {
        return l1oI == 45 || l1oI == 46 || l1oI == 48;
    }

    public static boolean Ill1() {
        return I00l || l1oI == 45 || l1oI == 46 || l1oI == 48 || l1oI == 51 || l1oI == 52 || l1oI == 103 || l1oI == 112 || l1oI == 113 || l1oI == 115 || l1oI == 117 || l1oI == 118 || l1oI == 119 || l1oI == 120 || l1oI == 121 || l1oI == 125 || l1oI == 129 || l1oI == 130;
    }

    public static void IIIl(IO1l iO1l, int n, int n2, int n3) {
        try {
            if (IIll == null) {
                return;
            }
            if (IIll.length != 1) {
                iO1l.II(IIll[n], n2 * IlI0, n3 * IlI0, 0);
                return;
            }
            iO1l.II(IIll[0], 0, n * IlI0, IlI0, IlI0, 0, n2 * IlI0, n3 * IlI0, 0);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void II(IO1l iO1l, int n, int n2, int n3, int n4) {
        try {
            if (IIll != null) {
                if (IIll.length == 1) {
                    iO1l.II(IIll[0], 0, n * 24, 24, 24, 0, n2, n3, 0);
                } else {
                    iO1l.II(IIll[n], n2, n3, 0);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void IIo(IO1l iO1l) {
        try {
            int n;
            int n2;
            int n3;
            if (Ilol.var_boolean_I10I) {
                return;
            }
            I1_I.I1_I_II();
            I1_I.III(iO1l, 1);
            for (n3 = I1_I.Io_l; n3 < I1_I.Io__; ++n3) {
                for (n2 = I1_I.Io_1; n2 < I1_I.Io_O; ++n2) {
                    if (n3 == 0 || n3 == l10_ - 1) continue;
                    n = IIO[n2 * l10_ + n3] - 1;
                    if ((IOlO.IIIo(n3, n2) & 0x100) == 256) continue;
                    if ((IOlO.IIIo(n3, n2) & 0x20) == 32) {
                        iO1l.II(I1Io, 0, 24 * (II.var_int_IIIO % 8 >> 1), 24, 24, 0, n3 * IlI0, n2 * IlI0, 0);
                        continue;
                    }
                    if ((IOlO.IIIo(n3, n2) & 0x80) == 128) {
                        iO1l.II(I1l, 0, 24 * (II.var_int_IIIO % 8 >> 1), 24, 24, 0, n3 * IlI0, n2 * IlI0, 0);
                        continue;
                    }
                    if (l1o == 13 && n != -1) continue;
                    if (l1o == 2 && (IOlO.IIIo(n3, n2) & 0x200) == 512 && n != -1) {
                        IOlO.II(iO1l, n, n3 * IlI0, n2 * IlI0, 24);
                        IOlO.II(iO1l, n, n3 * IlI0, n2 * IlI0 + 1, 24);
                    }
                    if ((IOlO.IIIo(n3, n2) & 0x10) == 16) {
                        var_int_IIl_ = n3 * IlI0 - I1_I.Io1;
                        I10l = var_int_IIl_ - I1_I.var_int_IIOI;
                        IIOO = (IlI0 - 2) * I10l / IlI0;
                        I101 = IIOO + I1_I.var_int_IIOI;
                        IOlO.II(iO1l, n, I101 + I1_I.Io1, n2 * IlI0, 24);
                        continue;
                    }
                    if ((IOlO.IIIo(n3, n2) & 0x200) == 512) {
                        if (n == -1) continue;
                        IOlO.II(iO1l, n, n3 * IlI0, n2 * IlI0, 24);
                        IOlO.II(iO1l, n, n3 * IlI0, n2 * IlI0 + 1, 24);
                        continue;
                    }
                    if (n == -1) continue;
                    IOlO.IIIl(iO1l, n, n3, n2);
                }
            }
            if (I1_I.Io1 < 24) {
                for (n3 = I1_I.Io_1; n3 < I1_I.Io_O; ++n3) {
                    n2 = IIO[n3 * l10_ + 1] - 1;
                    if (n2 == -1) continue;
                    IOlO.IIIl(iO1l, n2, 0, n3);
                }
            }
            if (I1_I.Io1 > I1_I.Io_) {
                n3 = l10_ - 2;
                for (n2 = I1_I.Io_1; n2 < I1_I.Io_O; ++n2) {
                    n = IIO[n2 * l10_ + n3] - 1;
                    if (n == -1) continue;
                    IOlO.IIIl(iO1l, n, n3 + 1, n2);
                }
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean boolean_IIO() {
        return l1oI != 54 && l1oI != 55 && l1oI != 56 && l1oI != 57 && l1oI != 138 && l1oI != 167;
    }

    public static void IIIo(IO1l iO1l) {
        if (!II.var_boolean_II) {
            try {
                for (int i = I1_I.Io_l; i < I1_I.Io__; ++i) {
                    for (int j = I1_I.Io_1; j < I1_I.Io_O; ++j) {
                        if ((IOlO.IIIo(i, j) & 0x40) != 64) continue;
                        Image image = l1o == 5 ? IIlo : (l1o == 8 ? var_javax_microedition_lcdui_Image_II1 : IIO_);
                        if (!IOlO.boolean_IIO()) {
                            iO1l.II(image, 0, 0, 24, 24, 0, i * IlI0, j * IlI0 - 1, 0);
                            iO1l.II(image, 0, 0, 24, 24, 0, i * IlI0, j * IlI0 - 3, 0);
                        }
                        iO1l.II(image, 0, (II.var_int_IIIO % 8 >> 2) * 24, 24, 24, 0, i * IlI0, j * IlI0 - 12, 0);
                        if (I1O1 != 0 || !IOlO.boolean_IIO()) continue;
                        I1O1 = j * IlI0 - 12;
                        int n = 0xFFFFFF;
                        if (II.II1O == 2) {
                            n = 10871287;
                        } else if (II.II1O == 4) {
                            n = 8111470;
                        } else if (II.II1O == 7) {
                            n = 5693125;
                        } else if (II.II1O == 19) {
                            n = 0xFF0000;
                        }
                        Il0O.III0(n, I1O1 + 15);
                    }
                }
                Il0O.IIIl(iO1l);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static void IllI(int n) throws IOException {
        InputStream inputStream = I11O.II(IOlO.I1I_("\ua787\ua7aa\ua79f\ua868\ua845\ua833\ua84d", 42920) + n);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        l10_ = (char)dataInputStream.read();
        l10O = (char)dataInputStream.read();
        IIO = new int[dataInputStream.available()];
        for (int i = 0; i < l10_ * l10O; ++i) {
            IOlO.IIO[i] = (char)dataInputStream.read();
        }
        I1ol = new int[IIO.length];
    }

    public static final int IIIo(int n, int n2) {
        try {
            return I1ol[n2 * l10_ + n];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final int IIl(int n, int n2) {
        try {
            return I1ol[n2 / IlI0 * l10_ + n / IlI0];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final boolean boolean_IIIl(int n, int n2, int n3) {
        try {
            return (I1ol[n2 / IlI0 * l10_ + n / IlI0] & n3) == n3;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void III(int n, int n2, int n3) {
        int n4;
        int[] nArray = I1ol;
        int n5 = n4 = n2 / IlI0 * l10_ + n / IlI0;
        nArray[n5] = nArray[n5] | 0x200;
    }

    public static void void_IIIl(int n, int n2, int n3) {
        int n4;
        int[] nArray = I1ol;
        int n5 = n4 = n2 / IlI0 * l10_ + n / IlI0;
        nArray[n5] = nArray[n5] & 0xFFFFFDFF;
    }

    public static final int int_II1I(int n) {
        return n / IlI0 * IlI0;
    }

    public static final int II1l(int n) {
        return n / IlI0 * IlI0;
    }

    public static void IO_() {
        System.gc();
        if (I1O_ != l1o) {
            if (IO10.l_lI != 5 && IO10.l_lI != 3 && IO10.l_lI != 8) {
                if (IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7c9", 42920) + l1o + IOlO.I1I_("\ua78c\ua7f6\ua7c8\ua875\ua84a\ua824", 42920)) != null) {
                    I_O1.II_O(IOlO.I1I_("\ua7d0", 42920) + IO1l.l_I0 + IOlO.I1I_("\ua7dc", 42920) + l1o);
                    IIll = new Image[100];
                    for (int i = 0; i < IIll.length; ++i) {
                        IOlO.IIll[i] = IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7c9", 42920) + l1o + IOlO.I1I_("\ua78c", 42920) + (i + 1) + IOlO.I1I_("\ua786\ua7b7\ua788\ua862", 42920));
                    }
                } else {
                    Image image = IO10.III(IOlO.I1I_("\ua787\ua7b3\ua7c9", 42920) + l1o + IOlO.I1I_("\ua786\ua7b7\ua788\ua862", 42920));
                    if (image != null) {
                        Image[] imageArray = new Image[1];
                        IIll = imageArray;
                        imageArray[0] = image;
                    }
                }
            } else if (IO1l.l_I0 == 1) {
                Image[] imageArray = new Image[1];
                IIll = imageArray;
                imageArray[0] = IO10.IIIl(IOlO.I1I_("\ua787\ua7b3\ua7c9", 42920) + l1o + IOlO.I1I_("\ua786\ua7b7\ua788\ua862", 42920));
            } else {
                IIll = new Image[100];
                for (int i = 0; i < IIll.length; ++i) {
                    IOlO.IIll[i] = IO10.IIIl(IOlO.I1I_("\ua787\ua7b3\ua7c9", 42920) + l1o + IOlO.I1I_("\ua787", 42920) + (i + 1) + IOlO.I1I_("\ua786\ua7b7\ua788\ua862", 42920));
                }
            }
            I1O_ = l1o;
        }
    }

    public static IO1 IIIl() {
        for (int i = 0; i < IlI_.size(); ++i) {
            int n = Ilol.Ilol_II().I_o_;
            int n2 = Ilol.Ilol_II().I_oO;
            IO1 iO1 = (IO1)IlI_.elementAt(i);
            if (n < iO1.II0o || n > iO1.IIoI || n2 < iO1.IIo || n2 > iO1.IIol) continue;
            return iO1;
        }
        return null;
    }

    public static int int_IIO() {
        return l100;
    }

    public static int IIOI() {
        return l10o;
    }

    static {
        I1O_ = -1;
        IlI0 = (byte)24;
        I00l = false;
        Il_O = "";
        IIOo = -1;
        l1oO = -1;
        Ill = (byte)-1;
        IlI_ = new I_lO(IOlO.I1I_("\ua7de\ua780\ua7a9", 42920));
        II1l = new I_lO(IOlO.I1I_("\ua7de\ua78e\ua792\ua860\ua849\ua801\ua805", 42920));
        IlIO = new I_lO(IOlO.I1I_("\ua7de\ua784\ua793\ua877\ua856\ua80a\ua816\ua8e4\ua8cd", 42920));
        IIlI = IO10.IIII(IOlO.I1I_("\ua787\ua7aa\ua787\ua86c\ua84a\ua80a\ua80f\ua8e0\ua8c7\ua8da\ua8f1\ua890\ua965\ua96f\ua93f\ua901\ua9ec\ua9c2\ua9a4\ua990\uaa26\uaa57\uaa30\uaa1e\uaafe\uaac8\uaae0\uaa9d\uab62\uab4c", 42920));
        new I_lO(IOlO.I1I_("\ua7de\ua788\ua784\ua86f\ua841\ua820\ua816", 42920));
        Il_1 = new int[]{21, 22, 23, 39, 40, 41};
        int[] nArray = new int[]{21, 22, 23, 24, 25, 26};
        nArray = new int[]{0, 7, 14};
        var_javax_microedition_lcdui_Image_IIl_ = IO10.IIII(IOlO.I1I_("\ua787\ua7a5\ua781\ua82a\ua848\ua82a\ua805\ua8e9\ua8d4\ua891\ua8ae\ua893\ua97b", 42920));
        nArray = new int[]{5257738, 8807192};
        I1O1 = 0;
    }

    private static /* synthetic */ String I1I_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

