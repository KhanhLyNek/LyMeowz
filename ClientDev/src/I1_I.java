package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class I1_I
extends IO1_
implements I1__ {
    private boolean I_O1;
    private long var_long_Il0;
    private long var_long_Il0I;
    public static boolean I_1o = false;
    public static boolean I1l1 = false;
    public static I1_I var_I1_I_II;
    public static int var_int_I_0;
    public static int var_int_IIO;
    public static int var_int_IIOI;
    private static int Iol1;
    private static int Iol_;
    public static int var_int_IIOl;
    private static int IolO;
    private static int Iol0;
    private static int Iolo;
    public static int var_int_IIlI;
    public static int var_int_IIO1;
    public static int Io1;
    public static int Io1I;
    private static int Io1l;
    private static int Io11;
    private static int Io1_;
    private static int Io1O;
    public static int Io10;
    public static int Io1o;
    public static int Io_;
    private static int Io_I;
    public static int Io_l;
    public static int Io_1;
    public static int Io__;
    public static int Io_O;
    public I1Il var_I1Il_IIlI;
    public static int Io_0;
    public static I_ol[] var_I_ol_arr_II;
    public static Il01[] var_Il01_arr_II;
    public static I1Io[] var_I1Io_arr_II;
    public static I_O1[] var_I_O1_arr_II;
    public static I1lO[] var_I1lO_arr_II;
    public static int Ioll;
    public static I_lO var_I_lO_II_l;
    public static I_lO var_I_lO_II_1;
    public static I_lO var_I_lO_II__;
    public static I_lO var_I_lO_II_O;
    public static I_lO var_I_lO_II_0;
    private static I_lO var_I_lO_II_o;
    public static I_lO var_I_lO_IIO;
    public static I_lO var_I_lO_IIOI;
    public static I_lO var_I_lO_IIOl;
    public static I_l0[] var_I_l0_arr_II;
    private static int Io_o;
    public static int I1OO;
    private static int IoO;
    public I_oI[] var_I_oI_arr_II;
    private static I_O_ var_I_O__III;
    private static I_O_ var_I_O__IIII;
    public static int I1Oo;
    public static boolean I_O_;
    private static boolean I_OO;
    private static boolean I_O0;
    private static boolean I_Oo;
    private static boolean var_boolean_I_0;
    private static boolean I_0I;
    private static boolean I_Il;
    public static boolean I_0l;
    public static boolean I_01;
    private static boolean I_0_;
    private static boolean I_0O;
    private static boolean I_00;
    private static boolean I_0o;
    private static boolean I_o;
    private static boolean I_oI;
    private static boolean I_ol;
    private static boolean I_o1;
    private static boolean I_o_;
    private static boolean I_l_;
    private static boolean I_oO;
    private static boolean I_l0;
    private static boolean I_o0;
    private static boolean I_oo;
    private static boolean IO;
    private static boolean IOI;
    private static boolean I_lo;
    private static boolean I_1;
    private static boolean IOII;
    private static boolean IOIl;
    private static boolean I_1I;
    private static boolean I_11;
    private static boolean IOI1;
    private static boolean IOI_;
    private static boolean IOIO;
    private static boolean IOI0;
    private static boolean IOIo;
    private static boolean IOl;
    private static boolean IOlI;
    private static boolean IOll;
    public static Ilol var_Ilol_IIlI;
    public static long[] var_long_arr_IIIl;
    private int IoOI = 0;
    public int[] IlOI;
    public int[] var_int_arr_Il_1;
    public int[] IlOl;
    public int[] var_int_arr_Il_O;
    public int[] IlO1;
    public int[] var_int_arr_Il_0;
    public String[] var_java_lang_String_arr_IIl1;
    public String[] IIl_;
    public int I1o1 = 0;
    public int IoOl = 0;
    private int IoO1 = -1;
    private boolean IOl1;
    public static int[] IlO_;
    public static int[] IlOO;
    public static Image III0;
    public static Image II0O;
    public static Image III_;
    public static Image II00;
    public static Image II0o;
    public static Image IIo;
    public static Image IIoI;
    public static byte II1o;
    public static byte II_;
    public static byte II_I;
    public static byte var_byte_II_l;
    public static byte var_byte_II_1;
    public static byte var_byte_II__;
    public static byte var_byte_II_O;
    public static byte var_byte_II_0;
    private static Image IIol;
    private static Image IIo1;
    public static Image IIo_;
    private static Image IIoO;
    private static Image IIo0;
    public static Image IIoo;
    public static Image Il;
    private static Image var_javax_microedition_lcdui_Image_IlI;
    private static Image var_javax_microedition_lcdui_Image_IlII;
    private static Image var_javax_microedition_lcdui_Image_IlIl;
    private static Image IlI1;
    private static Image IlI_;
    private static Image IlIO;
    public static Image IlI0;
    public static Image IlIo;
    public static Image Ill;
    public static Image IllI;
    public static Image var_javax_microedition_lcdui_Image_III;
    public static Image Illl;
    public static byte var_byte_II_o;
    public static I1Oo var_I1Oo_II;
    public static I1Oo var_I1Oo_III;
    private static Image Ill1;
    private static Image Ill_;
    private static Image IllO;
    public static Image Ill0;
    private static Image Illo;
    private static Image Il1;
    public static Image Il1I;
    public static Image Il1l;
    public static Image Il11;
    public static Image Il1_;
    public static Image Il1O;
    public I_I_ var_I_I__IIIO;
    public I1o0 var_I1o0_II;
    private int IoO_;
    public static int IoOO;
    private static III var_III_II;
    public static int IoO0;
    public static I_0o[] var_I_0o_arr_III;
    public static I_0o[] var_I_0o_arr_IIII;
    public I1Il var_I1Il_IIll;
    private static int IoOo;
    public static long var_long_Il0l;
    public boolean IOl_;
    private boolean IOlO;
    private int Io0;
    private int Io0I;
    private int Io0l;
    private int IOoI;
    private int Io01;
    private boolean I10O;
    public long var_long_Il01;
    boolean IOl0;
    private boolean I10o;
    private int IOol;
    private int IOo_;
    private int IOoO;
    private int IOo0;
    public static boolean IOlo;
    private long var_long_Il0_;
    private long var_long_Il0O;
    public int Io0_;
    int Io0O;
    public boolean IO1;
    public boolean IO1I;
    private static Image Il10;
    public boolean IO1l = false;
    public boolean IO11 = false;
    public boolean IO1_ = false;
    public boolean IO1O = false;
    public int Io00 = 0;
    public int Io0o;
    public int Ioo;
    private boolean IO10 = false;
    private int I0Io;
    private int I0l;
    private int I0lI;
    private int I0ll;
    public boolean I1_1;
    private boolean IO1o;
    public int IooI;
    public int Iool;
    public int Ioo1;
    public int Ioo_;
    public int IooO;
    private static int I0l_;
    public static boolean IO_;
    public static boolean IO_I;
    public static boolean IO_l;
    private int Ioo0;
    private int I0l0 = 0;
    private int I0lo = -1;
    private I_0o var_I_0o_III;
    public String var_java_lang_String_IlI;
    private boolean IO_1;
    private int Iooo;
    private int lI = -1;
    private static long var_long_Il00;
    private static long var_long_Il0o;
    private static long var_long_Ilo;
    private static long var_long_IloI;
    private static int lII;
    private int lIII = 0;
    public static int lIIl;
    public static Image Il1o;
    public static Image Il_;
    public int[] IlO0;
    public static Image Il_I;
    public String var_java_lang_String_IlII;
    private static int I011;
    public static boolean IO__;
    public static int lII1;
    private static int[] IlOo;
    private static int[] var_int_arr_Il0;
    public static I_lO var_I_lO_IIO1;
    private int I01_ = 0;
    public static Image var_javax_microedition_lcdui_Image_Il_l;
    private static int lII_;
    public static int lIIO;
    public static int lII0;
    public static int lIIo;
    public static int lIl;
    public static int lIlI;
    public static int lIll;
    private static int lIl1;
    private static int lIl_;
    private static int[] var_int_arr_Il0I;
    private static int[] var_int_arr_Il0l;
    private static int lIlO;
    private static int lIl0;
    public int lIlo;
    public int lI1;
    public boolean IO_O;
    public int lI1I;
    public int lI1l;
    public boolean IO_0;
    private long var_long_Ilol;
    private long var_long_Ilo1;
    private int lI11;
    public static String[] IIlO;
    public static int[] var_int_arr_Il01;
    public static int[] var_int_arr_Il0_;
    private static int[] var_int_arr_Il0O;
    private static int[] var_int_arr_Il00;
    private static int[] var_int_arr_Il0o;
    public static int[] var_int_arr_Ilo;
    public static int[] var_int_arr_IloI;
    private static int[] var_int_arr_Ilol;
    private static int[] var_int_arr_Ilo1;
    private static int[] Ilo_;
    private static int[] IloO;
    private static int[] Ilo0;
    private static int[] Iloo;
    private static Image[] var_javax_microedition_lcdui_Image_arr_IIIO;
    private static int lI1_;
    private static int I00l;
    private static long var_long_Il_l;
    private int lI1O;
    public static int lI10;
    public static int lI1o;
    public static int lI_;
    public static int lI_I;
    private static int lI_l;
    private static int lI_1;
    private static int I001;
    private static int lI__;
    private I1Il var_I1Il_IIl1;
    public static boolean IO_o;
    public static boolean IOO;
    public I__0 var_I__0_II;
    private static Vector var_java_util_Vector_IIIl;
    public boolean IOOI;
    private int[] I1;
    private int[] I1I;
    private int[] I1II;
    private int[] I1Il;
    private int[] I1I1;
    private int lI_O;
    private String II0l;
    private int lI_0;
    private int lI_o;
    private int lIO;
    private boolean IOOl;
    public byte var_byte_IIO;
    public boolean IOO1;
    public int lIOI;
    public static boolean IOO_;
    public static byte var_byte_IIOI;
    public static byte var_byte_IIOl;
    private String var_java_lang_String_IlIl;
    private String[] IIl0;
    public I10o[] var_I10o_arr_II;
    private static Image var_javax_microedition_lcdui_Image_Il_1;
    public static I10 var_I10_II;
    private static I11o var_I11o_IIll;
    private static I11o var_I11o_IIl1;
    private static Image Il__;
    private static Image var_javax_microedition_lcdui_Image_Il_O;
    private static Image var_javax_microedition_lcdui_Image_Il_0;
    private static Image Il_o;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIl1() {
        FilterInputStream filterInputStream = null;
        try {
            filterInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1_I.IllI("\u8335\u83c8\u83e6\u83a8\u8396\u8464\u8441", 33659))));
            int n = ((DataInputStream)filterInputStream).readShort();
            var_I_O1_arr_II = new I_O1[n];
            for (int i = 0; i < n; ++i) {
                byte by = ((DataInputStream)filterInputStream).readByte();
                I1_I.var_I_O1_arr_II[i] = new I_O1(by);
                for (int j = 0; j < I1_I.var_I_O1_arr_II[i].II.length; ++j) {
                    I1_I.var_I_O1_arr_II[i].II[j] = new I__();
                    I1_I.var_I_O1_arr_II[i].II[j].II1o = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_O1_arr_II[i].II[j].IIO_ = ((DataInputStream)filterInputStream).readByte();
                    I1_I.var_I_O1_arr_II[i].II[j].II1O = ((DataInputStream)filterInputStream).readByte();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            try {
                filterInputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        I_oo.IIl_();
    }

    public static void II(Image image, Image image2, Image image3, float f, float f2, int n, float f3, IO1l iO1l) {
        n = iO1l.IIOO();
        int n2 = iO1l.IIO0();
        int n3 = iO1l.IIOo();
        int n4 = iO1l.II0();
        iO1l.IIIO((int)f, (int)f2, (int)f3, 13);
        for (int i = 0; i < 4; ++i) {
            iO1l.II(image2, f + (float)((i + 1) * 15), f2, 0);
        }
        iO1l.II(image, f, f2, 0);
        iO1l.II(image2, f + 100.0f - 30.0f, f2, 0);
        iO1l.II(image3, f + 100.0f - 15.0f, f2, 0);
        iO1l.IIIO(n, n2, n3, n4);
    }

    public static boolean IIo() {
        return IOlO.l1oI >= 53 && IOlO.l1oI <= 62;
    }

    public static boolean IIoI() {
        return IOlO.l1oI >= 63;
    }

    @Override
    public void I0l_() {
        I_0l.I0_l = false;
        if (Il0O.IIO1()) {
            IO.II();
        }
        I1o_.IO0_ = false;
        Ilol.var_boolean_I10I = false;
        if (!I_1o) {
            I_0_.II().Io0();
        }
        if (IOlO.II() && I1I0.I1l1) {
            I1I0.I1l1 = false;
            this.IIl = null;
        }
        I1_I.var_I1Oo_II.IO0 = true;
        I1_I.var_I1Oo_III.IO0 = true;
        I1l1 = true;
        this.IoO_ = 0;
        I_1o = false;
        super.I0l_();
    }

    public static void I0lo() {
        IOl1.IlI1.removeAllElements();
        var_I_lO_II_O.removeAllElements();
        var_I_lO_II_0.removeAllElements();
        I1l1.II1_.removeAllElements();
        I1l1.II1o.removeAllElements();
        I1l1.II10.removeAllElements();
        I1l1.II_.removeAllElements();
        I1l1.II11.removeAllElements();
        var_I_lO_II_o.removeAllElements();
        var_I_lO_IIO.removeAllElements();
        var_I_lO_IIOI.removeAllElements();
        Ilol.Ilol_II().var_I_lO_IIlO.removeAllElements();
    }

    public void II(byte[] byArray) {
        I_Ol.II__(I1_I.IllI("\u833c\u83df\u83ed\u83f8\u83b8\u8458\u8466\u8417\u8421\u84d7\u84f4\u849e\u84bc\u8545\u8564\u8500\u8527\u85ab", 33659));
        var_I_0o_arr_IIII = new I_0o[10];
        if (byArray == null) {
            I_Ol.II__(I1_I.IllI("\u8315\u83ef\u83d5\u83b4", 33659));
            I_Ol.II__(I1_I.IllI("\u8337\u83d5\u83f8\u839c\u83d7\u8452\u8470\u8412\u8432\u84c7\u84fd\u8484\u84cf\u8541\u8563\u851f\u8528\u85d8\u85ec\u858d\u85a9\u8626\u8676\u860f\u862a\u86ce\u86ed", 33659));
            for (int i = 0; i < var_I_0o_arr_IIII.length && i < Ilol.Ilol_II().var_I_lO_IIlI.size(); ++i) {
                I_0o i_0o;
                I1_I.var_I_0o_arr_IIII[i] = i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(i);
            }
            I1_I.IOo();
        } else {
            block1: for (int i = 0; i < byArray.length; ++i) {
                for (int j = 0; j < Ilol.Ilol_II().var_I_lO_IIlI.size(); ++j) {
                    I_0o i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(j);
                    if (i_0o.II.IlIO != byArray[i]) continue;
                    I1_I.var_I_0o_arr_IIII[i] = i_0o;
                    continue block1;
                }
            }
        }
    }

    public void III(byte[] byArray) {
        I_Ol.II__(I1_I.IllI("\u833c\u83df\u83ed\u83f8\u83bc\u8453\u846c\u8407\u8438\u84db\u84fd\u849c\u84ce", 33659));
        var_I_0o_arr_III = new I_0o[10];
        if (byArray == null) {
            I_Ol.II__(I1_I.IllI("\u8337\u83d5\u83f8\u839c\u83d7\u8452\u8470\u8412\u8432\u84c7\u84fd\u8484\u84cf\u8545\u8568\u8515\u854b\u85d9\u85e2\u8581\u85ab\u864a", 33659));
            for (int i = 0; i < var_I_0o_arr_III.length && i < Ilol.Ilol_II().var_I_lO_IIlI.size(); ++i) {
                I_0o i_0o;
                I1_I.var_I_0o_arr_III[i] = i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(i);
            }
            I1_I.IO1_();
        } else {
            block1: for (int i = 0; i < byArray.length; ++i) {
                for (int j = 0; j < Ilol.Ilol_II().var_I_lO_IIlI.size(); ++j) {
                    I_0o i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(j);
                    if (i_0o.II.IlIO != byArray[i]) continue;
                    I1_I.var_I_0o_arr_III[i] = i_0o;
                    continue block1;
                }
            }
        }
    }

    public void IIII(byte[] byArray) {
        I_Ol.II__(I1_I.IllI("\u833c\u83df\u83ed\u83f8\u83b4\u8443\u8467\u8406\u8436\u84dc\u84e5\u8483\u84a4\u8547\u8561\u8500\u854a", 33659));
        if (byArray != null && byArray.length != 0) {
            for (int i = 0; i < Ilol.Ilol_II().var_I_lO_IIlI.size(); ++i) {
                I_0o i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(i);
                if (i_0o.II.IlIO != byArray[0]) continue;
                Ilol.Ilol_II().var_I_0o_II = i_0o;
                break;
            }
        } else if (Ilol.Ilol_II().var_I_lO_IIlI.size() > 0) {
            Ilol.Ilol_II().var_I_0o_II = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(0);
        }
        if (Ilol.Ilol_II().var_I_0o_II != null) {
            I_0_.II().IIo(Ilol.Ilol_II().var_I_0o_II.II.IlIO);
            Ilol.Ilol_II();
        }
    }

    protected static void II(I_o1 i_o1) {
        I_Ol.II__(I1_I.IllI("\u833f\u83d5\u8399\u838b\u83b2\u8442\u8415\u841b\u843d\u84c1\u84f2\u8482\u84aa\u854b\u8563\u856c\u8538\u85c1\u85e0\u8584\u85ab", 33659));
        I_0o i_0o = Ilol.Ilol_II().II(i_o1);
        I_lO i_lO = new I_lO("");
        for (int i = 0; i < (II.var_boolean_IIIl ? 10 : 5); ++i) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = i_0o;
            objectArray2[1] = String.valueOf(i);
            I1Il i1Il = new I1Il(IO11.IOIO + (i + 1), 11120, objectArray2);
            if (var_I_0o_arr_IIII[i] != null) {
                i1Il.I_1o = true;
            }
            i_lO.addElement(i1Il);
        }
        II.var_I_II_II.II(i_lO);
    }

    protected static void III(I_o1 i_o1) {
        I_Ol.II__(I1_I.IllI("\u833f\u83d5\u8399\u838b\u83b2\u8442\u8415\u841f\u8436\u84cb\u8491\u8483\u84a4\u8547\u8561\u8500", 33659));
        I_0o i_0o = Ilol.Ilol_II().II(i_o1);
        String[] stringArray = IOI0.III_ ? IO11.var_java_lang_String_arr_II0I : IO11.var_java_lang_String_arr_II0l;
        I_lO i_lO = new I_lO("");
        for (int i = 0; i < (II.var_boolean_IIIl ? 10 : 5); ++i) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = i_0o;
            objectArray2[1] = String.valueOf(i);
            i_lO.addElement(new I1Il(stringArray[i], 11121, objectArray2));
        }
        II.var_I_II_II.II(i_lO);
    }

    private static void IOo() {
        byte[] byArray = new byte[var_I_0o_arr_IIII.length];
        for (int i = 0; i < var_I_0o_arr_IIII.length; ++i) {
            byArray[i] = var_I_0o_arr_IIII[i] == null ? -1 : I1_I.var_I_0o_arr_IIII[i].II.IlIO;
        }
        I_0_.II().II(byArray);
    }

    private static void IO1_() {
        byte[] byArray = new byte[var_I_0o_arr_III.length];
        for (int i = 0; i < var_I_0o_arr_III.length; ++i) {
            byArray[i] = var_I_0o_arr_III[i] == null ? -1 : I1_I.var_I_0o_arr_III[i].II.IlIO;
        }
        I_0_.II().II(byArray);
    }

    public static boolean II_o() {
        for (int i = Ilol.Ilol_II().var_I101_arr_II.length - 1; i >= 0; --i) {
            if (Ilol.Ilol_II().var_I101_arr_II[i] != null) continue;
            return false;
        }
        return true;
    }

    public static void II(String[] stringArray, I_11 i_11) {
        I_lO i_lO = new I_lO("");
        for (int i = 0; i < stringArray.length; ++i) {
            i_lO.addElement(new I1Il(stringArray[i], 11057, i_11));
        }
        II.var_I_II_II.II(i_lO);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void I01() {
        FilterInputStream filterInputStream = null;
        try {
            filterInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1_I.IllI("\u8335\u83c8\u83e6\u83bd\u8391\u8470\u8450\u8437\u8407", 33659))));
            int n = ((DataInputStream)filterInputStream).readShort();
            var_I1lO_arr_II = new I1lO[n];
            for (int i = 0; i < n; ++i) {
                I1_I.var_I1lO_arr_II[i] = new I1lO();
                ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1lO_arr_II[i].II = new I1lo[((DataInputStream)filterInputStream).readByte()];
                for (int j = 0; j < I1_I.var_I1lO_arr_II[i].II.length; ++j) {
                    I1_I.var_I1lO_arr_II[i].II[j] = new I1lo();
                    I1_I.var_I1lO_arr_II[i].II[j].I_Oo = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I1lO_arr_II[i].II[j].II0I = ((DataInputStream)filterInputStream).readByte();
                    I1_I.var_I1lO_arr_II[i].II[j].I_O0 = ((DataInputStream)filterInputStream).readByte();
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            try {
                filterInputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static void I01I() {
        FilterInputStream filterInputStream = null;
        try {
            filterInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1_I.IllI("\u8335\u83c8\u83e6\u83b9\u8385\u8464\u845a\u8423", 33659))));
            int n = ((DataInputStream)filterInputStream).readShort();
            var_Il01_arr_II = new Il01[n];
            for (int i = 0; i < n; ++i) {
                I1_I.var_Il01_arr_II[i] = new Il01();
                ((DataInputStream)filterInputStream).readShort();
                I1_I.var_Il01_arr_II[i].IIOo[0] = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_Il01_arr_II[i].IIOo[1] = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_Il01_arr_II[i].IIOo[2] = ((DataInputStream)filterInputStream).readShort();
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            try {
                filterInputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void I01l() {
        FilterInputStream filterInputStream = null;
        try {
            filterInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1_I.IllI("\u8335\u83c8\u83e6\u83bc\u8396\u8464\u8441", 33659))));
            int n = ((DataInputStream)filterInputStream).readShort();
            var_I1Io_arr_II = new I1Io[n];
            for (int i = 0; i < n; ++i) {
                int n2;
                int n3;
                int n4;
                I1_I.var_I1Io_arr_II[i] = new I1Io();
                ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].II10 = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].IIO1 = ((DataInputStream)filterInputStream).readShort() << 8;
                I1_I.var_I1Io_arr_II[i].II1O = ((DataInputStream)filterInputStream).readShort();
                int n5 = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].III_ = new short[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    I1_I.var_I1Io_arr_II[i].III_[n4] = ((DataInputStream)filterInputStream).readShort();
                }
                n5 = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].IIIO = new short[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    I1_I.var_I1Io_arr_II[i].IIIO[n4] = ((DataInputStream)filterInputStream).readShort();
                }
                n5 = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].III0 = new short[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    I1_I.var_I1Io_arr_II[i].III0[n4] = ((DataInputStream)filterInputStream).readShort();
                }
                n5 = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].IIIo = new short[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    I1_I.var_I1Io_arr_II[i].IIIo[n4] = ((DataInputStream)filterInputStream).readShort();
                }
                n5 = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].III = new short[n5][];
                for (n4 = 0; n4 < n5; ++n4) {
                    n3 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I1Io_arr_II[i].III[n4] = new short[n3];
                    for (n2 = 0; n2 < n3; ++n2) {
                        I1_I.var_I1Io_arr_II[i].III[n4][n2] = ((DataInputStream)filterInputStream).readShort();
                    }
                }
                n5 = ((DataInputStream)filterInputStream).readShort();
                I1_I.var_I1Io_arr_II[i].IIII = new short[n5][];
                for (n4 = 0; n4 < n5; ++n4) {
                    n3 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I1Io_arr_II[i].IIII[n4] = new short[n3];
                    for (n2 = 0; n2 < n3; ++n2) {
                        I1_I.var_I1Io_arr_II[i].IIII[n4][n2] = ((DataInputStream)filterInputStream).readShort();
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            try {
                filterInputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void I011() {
        FilterInputStream filterInputStream = null;
        try {
            filterInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1_I.IllI("\u8335\u83c8\u83e6\u83ab\u839c\u847f\u8459\u8438", 33659))));
            int n = ((DataInputStream)filterInputStream).readShort();
            var_I_ol_arr_II = new I_ol[I_o_.IIIO.size()];
            for (int i = 0; i < n; ++i) {
                int n2;
                short s = ((DataInputStream)filterInputStream).readShort();
                if (s == 1111) {
                    s = (short)(n - 1);
                }
                I1_I.var_I_ol_arr_II[s] = new I_ol();
                I1_I.var_I_ol_arr_II[s].II0I = s;
                I1_I.var_I_ol_arr_II[s].I_O0 = ((DataInputStream)filterInputStream).readShort();
                if (I1_I.var_I_ol_arr_II[s].I_O0 <= 0) {
                    I1_I.var_I_ol_arr_II[s].I_O0 = 80;
                }
                ((DataInputStream)filterInputStream).readByte();
                I1_I.var_I_ol_arr_II[s].II = new I_o[((DataInputStream)filterInputStream).readByte()];
                for (n2 = 0; n2 < I1_I.var_I_ol_arr_II[s].II.length; ++n2) {
                    I1_I.var_I_ol_arr_II[s].II[n2] = new I_o();
                    I1_I.var_I_ol_arr_II[s].II[n2].II0I = ((DataInputStream)filterInputStream).readByte();
                    I1_I.var_I_ol_arr_II[s].II[n2].I_O0 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].I_Oo = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].I_0 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIO = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIOI = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIOl = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIlI = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIO1 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIO_ = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IoII = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIO0 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].II[n2].IIOo = ((DataInputStream)filterInputStream).readShort();
                }
                I1_I.var_I_ol_arr_II[s].III = new I_o[((DataInputStream)filterInputStream).readByte()];
                for (n2 = 0; n2 < I1_I.var_I_ol_arr_II[s].III.length; ++n2) {
                    I1_I.var_I_ol_arr_II[s].III[n2] = new I_o();
                    I1_I.var_I_ol_arr_II[s].III[n2].II0I = ((DataInputStream)filterInputStream).readByte();
                    I1_I.var_I_ol_arr_II[s].III[n2].I_O0 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].I_Oo = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].I_0 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIO = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIOI = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIOl = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIlI = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIO1 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIO_ = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IoII = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIO0 = ((DataInputStream)filterInputStream).readShort();
                    I1_I.var_I_ol_arr_II[s].III[n2].IIOo = ((DataInputStream)filterInputStream).readShort();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            try {
                filterInputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        I_Ol.II__(I1_I.IllI("\u8329\u83df\u83f8\u839c\u83d7\u8445\u847e\u841d\u843f\u84de\u8491\u8494\u84a0\u8540\u8568", 33659));
    }

    public static I1_I I1_I_II() {
        if (var_I1_I_II == null) {
            var_I1_I_II = new I1_I();
        }
        return var_I1_I_II;
    }

    public static void I01_() {
        var_I1_I_II = null;
    }

    public void I01O() {
        if (var_javax_microedition_lcdui_Image_arr_IIIO == null) {
            var_javax_microedition_lcdui_Image_arr_IIIO = new Image[3];
            for (int i = 0; i < 3; ++i) {
                I1_I.var_javax_microedition_lcdui_Image_arr_IIIO[i] = IO10.IIII(I1_I.IllI("\u8354\u83ff\u8396\u83ab\u8387", 33659) + i + I1_I.IllI("\u8355\u83ea\u83d7\u83bf", 33659));
            }
        }
        var_int_arr_Ilo1 = new int[2];
        Ilo_ = new int[2];
        IloO = new int[2];
        Ilo0 = new int[2];
        Iloo = new int[2];
        I1_I.IloO[1] = -1;
        I1_I.IloO[0] = -1;
        this.lI1O = 84;
        var_long_Il_l = 66L;
        I00l = 59;
        lI1_ = 61;
    }

    public I1_I() {
        int[] nArray = new int[]{-1, -1};
        this.IOOI = false;
        this.var_java_lang_String_IlIl = "";
        new I1Il("", 11021);
        this.var_I1Il_IIll = new I1Il(I1_I.IllI("\u835b\u83ba", 33659), 11000);
        this.var_I1Il_IIlI = new I1Il("", 11001);
        this.var_I1Il_IIll.IIO1 = IIo_;
        this.var_I1Il_IIll.IoII = IO1l.II(this.var_I1Il_IIll.IIO1) + 20;
        this.var_I1Il_IIll.I__ = false;
        this.var_I1Il_IIlI.IIO1 = IIoO;
        if (II.var_boolean_IIIl) {
            this.var_I1Il_IIll.I1 = 0;
            this.var_I1Il_IIll.I1I = 50;
            this.var_I1Il_IIlI = null;
        } else {
            this.var_I1Il_IIll.I1 = 0;
            this.var_I1Il_IIll.I1I = var_int_IIO - 30;
            this.var_I1Il_IIlI.I1 = var_int_I_0 - 32;
            this.var_I1Il_IIlI.I1I = var_int_IIO - 32;
        }
        this.IIl = this.var_I1Il_IIlI;
        lIIl = 1;
        if (II.var_boolean_IIIl) {
            I_0l = true;
        }
    }

    public static void IIlI(int n, int n2) {
        boolean bl;
        I_1o i_1o;
        var_int_I_0 = II.var_int_IIl;
        var_int_IIlI = 39;
        var_int_IIO = II.var_int_IIlI;
        Iolo = II.var_int_IIlI / 6;
        if (Iolo < 48) {
            Iolo = 48;
        }
        var_int_IIOI = var_int_I_0 >> 1;
        Iol0 = var_int_IIO >> 1;
        IolO = var_int_IIO - 120;
        var_int_IIOl = (var_int_IIO << 1) / 3;
        var_int_IIO1 = var_int_I_0 / 6;
        Iol1 = var_int_I_0 / IOlO.IlI0 + 2;
        Iol_ = var_int_IIO / IOlO.IlI0 + 2;
        if (var_int_I_0 % 24 != 0) {
            ++Iol1;
        }
        Io_ = (IOlO.l10_ - 1) * IOlO.IlI0 - var_int_I_0;
        Io_I = (IOlO.l10O - 1) * IOlO.IlI0 - var_int_IIO;
        if (n == -1 && n2 == -1) {
            Io1 = Io10 = Ilol.Ilol_II().I_o_ - var_int_IIOI + var_int_IIO1 * Ilol.Ilol_II().IOI1;
            Io1I = Io1o = Ilol.Ilol_II().I_oO - var_int_IIOl - 1;
        } else {
            Io1 = Io10 = n - IolO + var_int_IIO1 * Ilol.Ilol_II().IOI1;
            Io1I = Io1o = n2 - var_int_IIOl - 1;
        }
        if (Io1 < 24) {
            Io10 = 24;
            Io1 = 24;
        }
        if (Io1 > Io_) {
            Io1 = Io10 = Io_;
        }
        if (Io1I < 0) {
            Io1o = 0;
            Io1I = 0;
        }
        if (Io1I > Io_I) {
            Io1I = Io1o = Io_I;
        }
        if ((Io_l = Io1 / IOlO.IlI0 - 1) < 0) {
            Io_l = 0;
        }
        Io_1 = Io1I / IOlO.IlI0;
        Io__ = Io_l + Iol1;
        Io_O = Io_1 + Iol_;
        if (Io_1 < 0) {
            Io_1 = 0;
        }
        if (Io_O > IOlO.l10O - 1) {
            Io_O = IOlO.l10O - 1;
        }
        if ((IOlO.I1OI = Io__ - Io_l << 2) > IOlO.l10_) {
            IOlO.I1OI = IOlO.l10_;
        }
        if ((IOlO.I1Ol = Io_O - Io_1 << 2) > IOlO.l10O) {
            IOlO.I1Ol = IOlO.l10O;
        }
        if ((IOlO.I1_O = (Ilol.Ilol_II().I_o_ - 2 * var_int_I_0) / IOlO.IlI0) < 0) {
            IOlO.I1_O = 0;
        }
        if ((IOlO.I1_0 = IOlO.I1_O + IOlO.I1OI) > IOlO.l10_) {
            IOlO.I1_0 = IOlO.l10_;
        }
        if ((IOlO.I1_o = (Ilol.Ilol_II().I_oO - 2 * var_int_IIO) / IOlO.IlI0) < 0) {
            IOlO.I1_o = 0;
        }
        if ((IOlO.I1O = IOlO.I1_o + IOlO.I1Ol) > IOlO.l10O) {
            IOlO.I1O = IOlO.l10O;
        }
        Ilo_.II().var_I1___II = var_I1_I_II;
        Ilo_.II().var_IOI0_II.I_O0 = II.var_int_IIlI - 35 - Ilo_.II().var_IOI0_II.l10I;
        Ilo_.II().IIl1();
        if (II.var_boolean_IIIl) {
            lII_ = var_int_IIO - 88;
            lIIO = var_int_I_0 - 40;
            lII0 = 2;
            if (II.var_int_IIl <= 240) {
                lIIO = var_int_I_0 - 35;
                lII0 = 5;
            }
            lIIo = var_int_I_0 - 55;
            lIl = lII_ + 35;
            lIl1 = var_int_I_0 - 37;
            lIl_ = lII_ - 1;
            if (II.var_int_IIl >= 450) {
                lIl_ -= 12;
                lIll -= 7;
                lIIo -= 10;
                lIl -= 5;
                lIl1 -= 10;
            }
        }
        I1_I.I010();
        int n3 = I011 = II.var_int_IIl > 200 ? 40 : 30;
        if (I_O1.III(I1_I.IllI("\u830d\u83f3\u83dc\u83af\u8394\u847e\u8454\u8420", 33659)) == -1) {
            i_1o = II.var_I_1o_II;
            bl = true;
        } else {
            i_1o = II.var_I_1o_II;
            bl = I_O1.III(I1_I.IllI("\u830d\u83f3\u83dc\u83af\u8394\u847e\u8454\u8420", 33659)) == 1;
        }
        i_1o.I01_ = bl;
    }

    public static void I010() {
        int n;
        I_0o[] i_0oArray = null;
        i_0oArray = II.var_boolean_IIIl ? var_I_0o_arr_IIII : var_I_0o_arr_III;
        var_int_arr_Il0I = new int[i_0oArray.length];
        var_int_arr_Il0l = new int[i_0oArray.length];
        IoOo = 30;
        if (II.var_int_IIl <= 320) {
            lIl0 = var_int_IIO - IoOo - 6;
            lIlO = var_int_IIOI - i_0oArray.length * IoOo / 2 - 25;
        } else {
            IoOo = 40;
            lIlO = 10;
            lIl0 = II.var_int_IIlI - IoOo + 7;
        }
        for (n = 0; n < var_int_arr_Il0I.length; ++n) {
            I1_I.var_int_arr_Il0I[n] = n * IoOo;
            I1_I.var_int_arr_Il0l[n] = lIl0;
            if (var_int_arr_Il0I.length <= 5 || n < var_int_arr_Il0I.length / 2) continue;
            I1_I.var_int_arr_Il0I[n] = (n - var_int_arr_Il0I.length / 2) * IoOo;
            I1_I.var_int_arr_Il0l[n] = lIl0 - 32;
        }
        lIlI = i_0oArray.length * IoOo;
        lIll = lIl0;
        if (II.var_boolean_IIIl) {
            lIlO = 17;
            lIl0 = II.var_int_IIlI - 40;
            if (I1_I.var_III_II.II1o && IoO0 == 1) {
                lIlI = i_0oArray.length * IoOo;
                lIll = lIl0;
            } else {
                lIlI = II.var_int_IIl - 45;
                lIll = II.var_int_IIlI - 45;
            }
            if (IoO0 != 0) {
                lIl1 = lIIo = II.var_int_IIl - 45;
                if (I1_I.var_III_II.II_) {
                    lIlO = I1_I.var_III_II.II0I + 20;
                    IoOo = 35;
                    lIlI = lIIo - 45;
                } else if (I1_I.var_III_II.var_boolean_III) {
                    lIlI = lIIo - 45;
                }
                lIl = II.var_int_IIlI - 45;
                lIl_ = lIl - 45;
            }
            for (n = 0; n < var_int_arr_Il0I.length; ++n) {
                I1_I.var_int_arr_Il0I[n] = n * IoOo;
                I1_I.var_int_arr_Il0l[n] = lIl0;
                if (var_int_arr_Il0I.length <= 5 || n < var_int_arr_Il0I.length / 2) continue;
                I1_I.var_int_arr_Il0I[n] = (n - var_int_arr_Il0I.length / 2) * IoOo;
                I1_I.var_int_arr_Il0l[n] = lIl0 - 32;
            }
        }
    }

    public void II(String string, int n, int n2) {
        I1I i1I = new I1I();
        new I1I().I_O0 = n2;
        i1I.II0I = n;
        this.III(string, new I1Il(IO11.I_I_, 12002, i1I), new I1Il(IO11.I_IO, 12003, i1I));
    }

    private void IOoI() {
        I_lO i_lO;
        this.Io0_ = 0;
        II.III1();
        if (Ilol.Ilol_II().var_Ilol_IIIl.IOI_ >= 0 && Ilol.Ilol_II().IOI_ >= 0 && (i_lO = II.var_I_1o_II.IIo).size() <= 0) {
            if (Ilol.Ilol_II().var_IOlI_II != null && Ilol.Ilol_II().var_IOlI_II.II01 > 1) {
                i_lO.addElement(new I1Il(IO11.IO11, 11112, Ilol.Ilol_II().var_Ilol_IIIl));
                i_lO.addElement(new I1Il(IO11.I0II, 11113, Ilol.Ilol_II().var_Ilol_IIIl));
            }
            if (Ilol.Ilol_II().var_Ilo0_II != null && Ilol.Ilol_II().var_byte_III_ < 2 && Ilol.Ilol_II().var_Ilol_IIIl.IO1I == -1) {
                i_lO.addElement(new I1Il(IO11.var_java_lang_String_arr_II0[4], 110391));
            }
            if (Ilol.Ilol_II().var_Ilol_IIIl.IOIl != 14 && Ilol.Ilol_II().var_Ilol_IIIl.IOIl != 5) {
                if (Ilol.Ilol_II().var_IOlI_II != null && Ilol.Ilol_II().var_IOlI_II.II01 >= 14) {
                    i_lO.addElement(new I1Il(IO11.var_java_lang_String_arr_II0[0], 2003));
                }
            } else {
                Ilol.Ilol_II();
            }
            if (Ilol.Ilol_II().var_Ilo0_II != null && Ilol.Ilol_II().var_Ilo0_II.II0I == Ilol.Ilol_II().var_Ilol_IIIl.IO1I && Ilol.Ilol_II().var_Ilol_IIIl.IOIl != 14 && Ilol.Ilol_II().var_IOlI_II != null && Ilol.Ilol_II().var_IOlI_II.II01 >= 14) {
                i_lO.addElement(new I1Il(IO11.var_java_lang_String_arr_II0[1], 2004));
            }
            for (I_o1 i_o1 : Ilol.Ilol_II().var_I_l0_II.II) {
                I_0o i_0o = Ilol.Ilol_II().II(i_o1);
                if (i_0o == null || !i_o1.IlIO() || i_0o.l1__ <= 0) continue;
                i_lO.addElement(new I1Il(i_o1.II1o, 12004, i_0o));
            }
        }
    }

    public static boolean IIIl(I_I_ i_I_) {
        if (i_I_ == null) {
            return false;
        }
        if (Ilol.Ilol_II().var_byte_III0 == 5) {
            return true;
        }
        if (Ilol.Ilol_II().II01() && !i_I_.I0I1) {
            return false;
        }
        if (Ilol.Ilol_II().var_I_I__IIIl != null && i_I_.equals(Ilol.Ilol_II().var_I_I__IIIl)) {
            return false;
        }
        Ilol ilol = I1_I.Ilol_II(i_I_.lll);
        if (ilol == null) {
            return true;
        }
        return ilol.var_byte_III0 == 5 ? true : Ilol.Ilol_II().IIIO(ilol);
    }

    private boolean II0I() {
        if (Ilol.Ilol_II().var_I_0o_II != null && (Ilol.Ilol_II().var_I_0o_II.II.l1Ol != 1 && Ilol.Ilol_II().IOl1 < Ilol.Ilol_II().var_I_0o_II.l1O || Ilol.Ilol_II().var_I_0o_II.II.l1Ol == 1 && Ilol.Ilol_II().IOl1 < Ilol.Ilol_II().IO1 * Ilol.Ilol_II().var_I_0o_II.l1O / 100)) {
            var_I1Oo_II.IIII(IO11.I__I, 0);
            this.Io0_ = 0;
            return false;
        }
        if (Ilol.Ilol_II().var_I_0o_II == null || Ilol.Ilol_II().var_I_0o_II.II.l1OI > 0 && Ilol.Ilol_II().var_I_0o_II.l1__ == 0) {
            II.II(IO11.I10_);
            return false;
        }
        return true;
    }

    public void I01o() {
        II.var_I_II_II.IOol = false;
        Ilo_ ilo_ = Ilo_.II();
        ilo_.var_IOI0_II.IIOl("");
        ilo_.I_10 = false;
        Ilo_.II().III0 = null;
        this.IOl1 = false;
        this.I1o1 = 0;
        IoO = 0;
        Io_o = 0;
        this.IoO1 = -1;
        I1OO = -1;
        this.IoOl = 0;
        this.I1o1 = 0;
        if (Ilol.Ilol_II().IOl_ > 0 && Ilol.Ilol_II().IOIl != 14 && Ilol.Ilol_II().IOIl != 5) {
            I_0l = true;
        } else {
            if (Ilol.Ilol_II().I_I_) {
                ((IO1_)this).III0 = this.var_I1Il_IIl1 = new I1Il(IO11.var_java_lang_String_arr_II0_[0], 11038);
                Ilol.Ilol_II().IOl_ = 0;
            }
            I_0l = false;
        }
        I_O_ i_O_ = var_I_O__IIII;
        var_I_O__IIII.II0I = 0;
        i_O_.I_O0 = 0;
        i_O_.I_Oo = 0;
        i_O_.I_0 = 0;
        i_O_.IIO = 0;
        i_O_.IIOI = 0;
        i_O_.IIOl = 0;
        i_O_.var_int_IIlI = 0;
        i_O_.IoII = 0;
        i_O_.IIO0 = 0;
        i_O_.IIO1 = 0;
        i_O_.IIO_ = 0;
    }

    @Override
    public void IIO1(int n) {
        super.IIO1(n);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void I_Il() {
        block219: {
            block230: {
                block238: {
                    block239: {
                        block237: {
                            block236: {
                                block232: {
                                    block234: {
                                        block233: {
                                            block235: {
                                                block231: {
                                                    block229: {
                                                        block228: {
                                                            block227: {
                                                                block220: {
                                                                    block226: {
                                                                        block225: {
                                                                            block221: {
                                                                                block224: {
                                                                                    block223: {
                                                                                        block222: {
                                                                                            if (I1I1.I___ || Ilol.Ilol_II().I11 || Ilol.Ilol_II().I_1I || I1OO.I1l1) break block219;
                                                                                            if (!II.var_boolean_IIIl || Ilo_.II().I_10 || II.var_I_II_II.IOol || this.IIoO()) break block220;
                                                                                            IlI.III().I_lO();
                                                                                            IIol.I_Il();
                                                                                            IlI.III().I_1();
                                                                                            IIo1.III().I_I1();
                                                                                            IO1_.l_l = -1;
                                                                                            if (!II.var_boolean_III1) break block221;
                                                                                            if (!II.II(0, 0, 60, 50) || !II.var_boolean_III0 || !II.var_boolean_IIIo) break block222;
                                                                                            IlI.III().I_l0();
                                                                                            if (Ilol.Ilol_II().var_I1Il_II != null) {
                                                                                                Ilol.Ilol_II().var_I1Il_II.I0lO();
                                                                                            }
                                                                                            Ilol.Ilol_II().var_I_ll_II = null;
                                                                                            II.IIlI();
                                                                                            this.IO_1 = true;
                                                                                            this.Iooo = 5;
                                                                                            break block220;
                                                                                        }
                                                                                        if (IOlO.IllI() || !II.II(I1_I.lIIO, I1_I.lII0, 34, 34)) break block223;
                                                                                        IO1_.l_l = 15;
                                                                                        II.var_boolean_II1 = false;
                                                                                        this.IOl_ = false;
                                                                                        Ilo_.II().II00 = IO11.I_Io;
                                                                                        if (!II.var_boolean_III0 || !II.var_boolean_IIIo) break block223;
                                                                                        Ilo_.II().II1o("");
                                                                                        IO.II();
                                                                                        Ilol.Ilol_II().var_I_ll_II = null;
                                                                                        II.IIlI();
                                                                                        break block220;
                                                                                    }
                                                                                    if (Ilol.Ilol_II().var_I1Il_II == null || !II.II(Ilol.Ilol_II().var_I1Il_II.I1 - 17, Ilol.Ilol_II().var_I1Il_II.I1I - 17, 34, 34)) break block224;
                                                                                    IO1_.l_l = 20;
                                                                                    II.var_boolean_II1 = false;
                                                                                    this.IOl_ = false;
                                                                                    if (!II.var_boolean_III0 || !II.var_boolean_IIIo) break block224;
                                                                                    II.IIlI();
                                                                                    Ilol.Ilol_II().var_I1Il_II.I0lO();
                                                                                    break block220;
                                                                                }
                                                                                if (I1_I.IoO0 != 0 && Ilol.Ilol_II().IOIl != 14) {
                                                                                    if (II.II(I1_I.lIIo, I1_I.lIl, 40, 40)) {
                                                                                        IO1_.l_l = 5;
                                                                                        if (II.var_boolean_IIIo) {
                                                                                            II.var_boolean_arr_II[5] = true;
                                                                                            II.var_boolean_IIIo = false;
                                                                                            II.var_boolean_II1 = false;
                                                                                            II.var_boolean_III0 = false;
                                                                                        }
                                                                                    }
                                                                                    I1_I.var_III_II.IIl1();
                                                                                    if (II.II(I1_I.lIl1, I1_I.lIl_, 34, 34)) {
                                                                                        IO1_.l_l = 13;
                                                                                        II.var_boolean_II1 = false;
                                                                                        this.IOl_ = false;
                                                                                        if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                                                                                            Ilol.Ilol_II().IOo_();
                                                                                            II.var_boolean_IIIo = false;
                                                                                            II.var_boolean_II1 = false;
                                                                                            II.var_boolean_III0 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (!(I1_I.IoO0 != 0 ? II.II(I1_I.lIlI, I1_I.lIll, 34, 34) == false : II.II(I1_I.lIlI, I1_I.lIll, 40, 40) == false)) {
                                                                                    if (Ilol.Ilol_II().IOIl != 14 && this.var_I_I__IIIO == null) {
                                                                                        IO1_.l_l = 10;
                                                                                        II.var_boolean_II1 = false;
                                                                                        this.IOl_ = false;
                                                                                        if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                                                                                            II.var_boolean_arr_II[10] = true;
                                                                                            II.var_boolean_IIIo = false;
                                                                                            II.var_boolean_II1 = false;
                                                                                            II.var_boolean_III0 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (this.var_I_I__IIIO == null) break block225;
                                                                            var8_1 = this;
                                                                            if (!this.IIoO()) {
                                                                                for (var3_4 = 0; var3_4 < var8_1.var_java_lang_String_IlI.length(); ++var3_4) {
                                                                                    var8_1.IlO0[var3_4] = -1;
                                                                                    if (!II.var_boolean_III1 || !II.II(var4_7 = (II.var_int_IIl - var8_1.var_java_lang_String_IlI.length() * I1_I.I011) / 2, var9_10 = II.var_int_IIlI - 40, var6_8 = var8_1.var_java_lang_String_IlI.length() * I1_I.I011, var1_5 = I1_I.I011)) continue;
                                                                                    var1_5 = (II.var_int_II - var4_7) / I1_I.I011;
                                                                                    if (var3_4 == var1_5) {
                                                                                        var8_1.IlO0[var3_4] = 1;
                                                                                    }
                                                                                    if (!II.var_boolean_III0 || !II.var_boolean_IIIo || var3_4 != var1_5) continue;
                                                                                    var7_9 = var8_1.var_java_lang_String_IlII.toCharArray();
                                                                                    var2_6 = new I_lO("");
                                                                                    for (var4_7 = 0; var4_7 < var7_9.length; ++var4_7) {
                                                                                        var2_6.addElement(String.valueOf(var7_9[var4_7]));
                                                                                    }
                                                                                    var2_6.removeElementAt(0);
                                                                                    var2_6.insertElementAt(String.valueOf(var8_1.var_java_lang_String_IlI.charAt(var3_4)), var2_6.size());
                                                                                    var8_1.var_java_lang_String_IlII = "";
                                                                                    for (var4_7 = 0; var4_7 < var2_6.size(); ++var4_7) {
                                                                                        var8_1.var_java_lang_String_IlII = var8_1.var_java_lang_String_IlII + ((String)var2_6.elementAt(var4_7)).toUpperCase();
                                                                                    }
                                                                                    I_0_.II().II(var8_1.var_java_lang_String_IlI.charAt(var3_4));
                                                                                }
                                                                            }
                                                                            break block226;
                                                                        }
                                                                        if (!I1_I.I_0l) break block226;
                                                                        if (this.IIol()) break block220;
                                                                        this.lI = -1;
                                                                        var8_2 = false;
                                                                        if (I1_I.var_I_0o_arr_IIII.length > 5 && (II.II(I1_I.lIlO + I1_I.var_int_arr_Il0I[0] - I1_I.IoOo / 2 + 12, I1_I.var_int_arr_Il0l[0] - I1_I.IoOo / 2 + 12, 5 * I1_I.IoOo, I1_I.IoOo) || II.II(I1_I.lIlO + I1_I.var_int_arr_Il0I[5] - I1_I.IoOo / 2 + 12, I1_I.var_int_arr_Il0l[5] - I1_I.IoOo / 2 + 12, 5 * I1_I.IoOo, I1_I.IoOo))) {
                                                                            var8_2 = true;
                                                                        }
                                                                        if (var8_2 || II.II(I1_I.lIlO + I1_I.var_int_arr_Il0I[0] - I1_I.IoOo / 2 + 12, I1_I.var_int_arr_Il0l[0] - I1_I.IoOo / 2 + 12, 5 * I1_I.IoOo, I1_I.IoOo) || !II.var_boolean_III1 && II.II(I1_I.lIlO + I1_I.var_int_arr_Il0I[0] - I1_I.IoOo / 2 + 12, I1_I.var_int_arr_Il0l[0] - I1_I.IoOo / 2 + 12, I1_I.IoOo, I1_I.var_I_0o_arr_IIII.length * I1_I.IoOo)) {
                                                                            II.var_boolean_II1 = false;
                                                                            this.IOl_ = false;
                                                                            var5_12 = (II.var_int_III1 - (I1_I.lIlO + I1_I.var_int_arr_Il0I[0] - I1_I.IoOo / 2 + 12)) / I1_I.IoOo;
                                                                            if (var8_2 && II.var_int_III_ < I1_I.var_int_arr_Il0l[0]) {
                                                                                var5_12 += 5;
                                                                            }
                                                                            this.lI = var5_12;
                                                                            if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                                                                                II.var_boolean_IIIo = false;
                                                                                II.var_boolean_II1 = false;
                                                                                II.var_boolean_III0 = false;
                                                                                this.I0lo = var5_12;
                                                                                if (this.I0lo > I1_I.var_I_0o_arr_IIII.length - 1) {
                                                                                    this.I0lo = I1_I.var_I_0o_arr_IIII.length - 1;
                                                                                }
                                                                                if ((var9_11 = I1_I.var_I_0o_arr_IIII[this.I0lo]) != null) {
                                                                                    this.II(var9_11, true);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (II.var_boolean_IIIo) {
                                                                        if (II.var_boolean_arr_IIII[1] || II.var_boolean_arr_IIII[2] || II.var_boolean_arr_IIII[3] || II.var_boolean_arr_IIII[4] || II.var_boolean_arr_IIII[6]) {
                                                                            II.var_boolean_IIIo = false;
                                                                        }
                                                                        II.var_boolean_arr_IIII[1] = false;
                                                                        II.var_boolean_arr_IIII[2] = false;
                                                                        II.var_boolean_arr_IIII[3] = false;
                                                                        II.var_boolean_arr_IIII[4] = false;
                                                                        II.var_boolean_arr_IIII[6] = false;
                                                                    }
                                                                }
                                                                var8_3 = System.currentTimeMillis();
                                                                if (II.var_boolean_arr_II[2] || II.var_boolean_arr_II[4] || II.var_boolean_arr_II[6] || II.var_boolean_arr_II[1] || II.var_boolean_arr_II[3]) {
                                                                    this.Io0_ = 0;
                                                                    I1_I.IO_ = false;
                                                                    II0l.II0l_III().Iloo();
                                                                }
                                                                if (II.var_boolean_arr_II[5]) {
                                                                    if (this.Io0_ == 0) {
                                                                        if (!(var8_3 - this.var_long_Il0_ >= 800L || Ilol.Ilol_II().var_I_0o_II != null && (Ilol.Ilol_II().var_I_0o_II.II.l1Ol != 1 && Ilol.Ilol_II().IOl1 < Ilol.Ilol_II().var_I_0o_II.l1O || Ilol.Ilol_II().var_I_0o_II.II.l1Ol == 1 && Ilol.Ilol_II().IOl1 < Ilol.Ilol_II().IO1 * Ilol.Ilol_II().var_I_0o_II.l1O / 100) || Ilol.Ilol_II().var_I_0o_II == null || Ilol.Ilol_II().var_I_0o_II.II.l1OI > 0 && Ilol.Ilol_II().var_I_0o_II.l1__ == 0 || Ilol.Ilol_II().var_I_I__IIII == null && (Ilol.Ilol_II().var_Ilol_IIIl == null || !Ilol.Ilol_II().IIIO(Ilol.Ilol_II().var_Ilol_IIIl)))) {
                                                                            this.Io0_ = 10;
                                                                            II.var_boolean_arr_II[5] = false;
                                                                        }
                                                                    } else {
                                                                        this.Io0_ = 0;
                                                                        II.var_boolean_arr_II[6] = false;
                                                                        II.var_boolean_arr_II[4] = false;
                                                                    }
                                                                    this.var_long_Il0_ = var8_3;
                                                                }
                                                                if (II.var_int_IIIO % 5 != 0 || this.Io0_ <= 0 || Ilol.Ilol_II().var_I_ll_II != null) break block227;
                                                                if (Ilol.Ilol_II().var_I_0o_II != null && (Ilol.Ilol_II().var_I_0o_II.II.IlI0() || Ilol.Ilol_II().var_I_0o_II.I0Ol)) break block228;
                                                                if ((Ilol.Ilol_II().var_I_I__IIII == null || Ilol.Ilol_II().var_I_I__IIII.status == 1 || Ilol.Ilol_II().var_I_I__IIII.status == 0 || Ilol.Ilol_II().var_Ilol_IIIl != null) && (Ilol.Ilol_II().var_Ilol_IIIl == null || !Ilol.Ilol_II().IIIO(Ilol.Ilol_II().var_Ilol_IIIl))) break block227;
                                                                if (Ilol.Ilol_II().var_I_0o_II.I0Ol) break block228;
                                                                this.II(false, true);
                                                            }
                                                            if (this.Io0_ > 1) {
                                                                --this.Io0_;
                                                            }
                                                        }
                                                        if (Ilo1.var_Ilo1_III != null) {
                                                            var10_13 = Ilo1.var_Ilo1_III.var_I1Il_IIII;
                                                            if ((II.var_boolean_arr_II[5] || IO1_.II(var10_13)) && var10_13 != null) {
                                                                II.var_boolean_IIIo = false;
                                                                II.var_boolean_arr_II[5] = false;
                                                                IO1_.l_l = -1;
                                                                if (var10_13 != null) {
                                                                    var10_13.I0lO();
                                                                }
                                                            }
                                                        } else if (!Ilo_.II().I_10) {
                                                            if ((II.var_boolean_arr_II[12] || IO1_.II(II.var_IO1__II.IIIo)) && this.IIIo != null) {
                                                                II.var_boolean_IIIo = false;
                                                                II.var_boolean_III0 = false;
                                                                II.var_boolean_arr_II[12] = false;
                                                                IO1_.l_l = -1;
                                                                if (this.IIIo != null) {
                                                                    this.IIIo.I0lO();
                                                                }
                                                            }
                                                            if ((II.var_boolean_arr_II[13] || IO1_.II(II.var_IO1__II.IIl)) && this.IIl != null) {
                                                                II.var_boolean_IIIo = false;
                                                                II.var_boolean_III0 = false;
                                                                II.var_boolean_arr_II[13] = false;
                                                                IO1_.l_l = -1;
                                                                if (this.IIl != null) {
                                                                    this.IIl.I0lO();
                                                                }
                                                            }
                                                            if ((II.var_boolean_arr_II[5] || IO1_.II(II.var_IO1__II.III0)) && this.III0 != null) {
                                                                II.var_boolean_IIIo = false;
                                                                II.var_boolean_arr_II[5] = false;
                                                                IO1_.l_l = -1;
                                                                if (this.III0 != null) {
                                                                    this.III0.I0lO();
                                                                }
                                                            }
                                                        } else {
                                                            if (Ilo_.II().III_ != null && (II.var_boolean_arr_II[12] || IO1_.II(Ilo_.II().III_)) && Ilo_.II().III_ != null) {
                                                                Ilo_.II().III_.I0lO();
                                                            }
                                                            if (Ilo_.II().IIIO != null && (II.var_boolean_arr_II[13] || IO1_.II(Ilo_.II().IIIO)) && Ilo_.II().IIIO != null) {
                                                                Ilo_.II().IIIO.I0lO();
                                                            }
                                                            if (Ilo_.II().III0 != null && (II.var_boolean_arr_II[5] || IO1_.II(Ilo_.II().III0)) && Ilo_.II().III0 != null) {
                                                                Ilo_.II().III0.I0lO();
                                                            }
                                                        }
                                                        if (Ilol.Ilol_II().var_I_ll_II != null) {
                                                            for (var1_5 = 0; var1_5 < II.var_boolean_arr_II.length; ++var1_5) {
                                                                if (!II.var_boolean_arr_II[var1_5]) continue;
                                                                Ilol.Ilol_II().var_I_ll_II = null;
                                                                break;
                                                            }
                                                        }
                                                        if (!Ilo_.II().I_10 || II.II_ == 0) break block229;
                                                        Ilo_.II().keyPressed(II.II_);
                                                        II.II_ = 0;
                                                        break block219;
                                                    }
                                                    if (II.var_I_II_II.IOol || Ilol.var_boolean_I10) break block219;
                                                    if (II.var_boolean_arr_II[10]) {
                                                        II.var_boolean_arr_II[10] = false;
                                                        this.I0_();
                                                        II.IIIl();
                                                    }
                                                    if (II.var_boolean_arr_II[11] && this.var_I_I__IIIO == null) {
                                                        if (this.var_I__0_II != null) {
                                                            this.var_I__0_II.II_l.I0lO();
                                                        } else if (I1_I.var_I1Oo_III.var_I1O__III.II != null && I1_I.var_I1Oo_III.var_I1O__III.II.IIll != null) {
                                                            II.var_I_1o_II.I0o_();
                                                            II.var_I_1o_II.I__0();
                                                        }
                                                        II.var_boolean_arr_II[11] = false;
                                                        II.IIIl();
                                                    }
                                                    if (II.II_ != 0 && IOI0.III_ && II.II_ == 32) {
                                                        this.I0_();
                                                        II.II_ = 0;
                                                        II.IIIl();
                                                    }
                                                    if (II.II_ != 0 && this.var_I_I__IIIO == null && IOI0.III_ && II.II_ == 121) {
                                                        if (this.var_I__0_II != null) {
                                                            this.var_I__0_II.II_l.I0lO();
                                                            II.II_ = 0;
                                                            II.IIIl();
                                                        } else if (I1_I.var_I1Oo_III.var_I1O__III.II != null && I1_I.var_I1Oo_III.var_I1O__III.II.IIll != null) {
                                                            II.var_I_1o_II.I0o_();
                                                            II.var_I_1o_II.I__0();
                                                            II.II_ = 0;
                                                            II.IIIl();
                                                        }
                                                    }
                                                    if (II.var_boolean_arr_II[10] && this.var_I_I__IIIO == null) {
                                                        II.var_boolean_arr_II[10] = false;
                                                        var10_14 = true;
                                                        I1_I.var_I1Oo_III.IIOl = 10;
                                                        II.IIIl();
                                                    }
                                                    if (!I1_I.var_III_II.II() && I1_I.IoO0 != 1) {
                                                        Ilol.Ilol_II().I11o = true;
                                                        if (II.var_boolean_II1) {
                                                            II.var_boolean_II1 = false;
                                                            this.IOl_ = true;
                                                            this.Io01 = 0;
                                                            this.Io0 = this.Io0l = II.var_int_II;
                                                            this.Io0I = this.IOoI = II.var_int_III;
                                                        }
                                                        if (this.IOl_) {
                                                            var11_16 = II.var_int_II - this.Io0;
                                                            var5_12 = II.var_int_III - this.Io0I;
                                                            if (!(this.IOlO || I_Ol.II1(II.var_int_II - this.Io0l) <= 15 && I_Ol.II1(II.var_int_III - this.IOoI) <= 15)) {
                                                                this.IOlO = true;
                                                            }
                                                            this.Io0 = II.var_int_II;
                                                            this.Io0I = II.var_int_III;
                                                            ++this.Io01;
                                                            if (this.IOlO) {
                                                                Ilol.Ilol_II().I11o = false;
                                                                I1_I.Io1I -= var5_12;
                                                                if ((I1_I.Io1 -= var11_16) < 24 && (var12_17 = (24 - I1_I.Io1) / 3) != 0) {
                                                                    I1_I.Io1 += var11_16 - var11_16 / var12_17;
                                                                }
                                                                if (I1_I.Io1 < 24) {
                                                                    I1_I.Io1 = 24;
                                                                }
                                                                if (I1_I.Io1 > I1_I.Io_ && (var12_17 = (I1_I.Io1 - I1_I.Io_) / 3) != 0) {
                                                                    I1_I.Io1 += var11_16 - var11_16 / var12_17;
                                                                }
                                                                if (I1_I.Io1 > I1_I.Io_) {
                                                                    I1_I.Io1 = I1_I.Io_;
                                                                }
                                                                if (I1_I.Io1I < 0 && (var12_17 = (0 - I1_I.Io1I) / 3) != 0) {
                                                                    I1_I.Io1I += var5_12 - var5_12 / var12_17;
                                                                }
                                                                if (I1_I.Io1I < 0) {
                                                                    I1_I.Io1I = 0;
                                                                }
                                                                if (I1_I.Io1I > I1_I.Io_I) {
                                                                    I1_I.Io1I = I1_I.Io_I;
                                                                }
                                                                I1_I.Io10 = I1_I.Io1;
                                                                I1_I.Io1o = I1_I.Io1I;
                                                            }
                                                        }
                                                        if (this.IOl_ && II.var_boolean_IIIo) {
                                                            this.IOl_ = false;
                                                            this.IOlO = false;
                                                            if (I_Ol.II1(II.var_int_II - this.Io0l) > 15 || I_Ol.II1(II.var_int_III - this.IOoI) > 15) {
                                                                II.var_boolean_IIIo = false;
                                                            }
                                                        }
                                                    }
                                                    if (Ilol.Ilol_II().I1ol || this.IIol()) break block230;
                                                    if (this.var_I__0_II == null || this.var_I__0_II.II_l == null || !this.var_I__0_II.II_l.II0o()) break block231;
                                                    this.var_I__0_II.II_l.I0lO();
                                                    break block230;
                                                }
                                                var12_17 = this.var_I_I__IIIO != null && II.II(var11_16 = (II.var_int_IIl - 5 * I1_I.I011) / 2, var4_7 = II.var_int_IIlI - 40, var3_4 = 5 * I1_I.I011, var6_8 = I1_I.I011) != false ? 1 : 0;
                                                if (var12_17 != 0) break block230;
                                                var8_3 = System.currentTimeMillis();
                                                if (this.var_long_Il01 != 0L) {
                                                    this.var_long_Il01 = 0L;
                                                    II.var_boolean_II1 = false;
                                                    if (!this.I10O) {
                                                        var11_16 = II.var_int_II + this.IOoO;
                                                        var3_4 = II.var_int_III + this.IOo0;
                                                        if (!this.IIIl(var11_16, var3_4) && !this.IIII(var11_16, var3_4)) {
                                                            this.IIll(var11_16, var3_4);
                                                        }
                                                        II.var_boolean_IIIo = false;
                                                        this.I_O1 = true;
                                                        this.var_long_Il0 = IO10.IIII();
                                                    }
                                                }
                                                if (!this.I_O1) break block232;
                                                this.var_long_Il0I = IO10.IIII();
                                                if (this.var_long_Il0I - this.var_long_Il0 >= 300L || !II.var_boolean_IIIo) break block232;
                                                this.I_O1 = false;
                                                var11_16 = II.var_int_II + this.IOoO;
                                                var3_4 = II.var_int_III + this.IOo0;
                                                Ilol.Ilol_II();
                                                var13_21 = this.II(var11_16, var3_4);
                                                if (var13_21 == null) break block233;
                                                if (var13_21 instanceof I_I_ && !I1_I.IIIl((I_I_)var13_21)) break block234;
                                                if (this.II(var13_21) || !var13_21.equals(Ilol.Ilol_II().var_I_11_II) && this.var_I_I__IIIO != null) break block232;
                                                if (!Ilol.Ilol_II().II01() || Ilol.Ilol_II().var_Ilol_IIIl == null || var13_21.equals(Ilol.Ilol_II().var_Ilol_IIIl) || var13_21.equals(Ilol.Ilol_II().var_Ilol_IIIl.var_I_I__IIIl) || !(var13_21 instanceof Ilol)) break block235;
                                                var14_25 = (Ilol)var13_21;
                                                if (var14_25.var_byte_III0 != 5 && !var14_25.II01()) break block234;
                                            }
                                            if (IOlO.l1oI == 51 && var13_21.equals(Ilol.Ilol_II().var_I_11_II)) break block234;
                                            this.IIII(var13_21);
                                            break block232;
                                        }
                                        if (this.IIIl(var11_16, var3_4) || this.IIII(var11_16, var3_4)) break block232;
                                    }
                                    this.IIll(var11_16, var3_4);
                                }
                                if (!II.var_boolean_IIIo) break block230;
                                var11_16 = II.var_int_II + I1_I.Io1;
                                var3_4 = II.var_int_III + I1_I.Io1I;
                                Ilol.Ilol_II();
                                var14_25 = this.II(var11_16, var3_4);
                                if (var14_25 == null) ** GOTO lbl342
                                if (!Ilol.Ilol_II().II01() || Ilol.Ilol_II().var_Ilol_IIIl == null || var14_25.equals(Ilol.Ilol_II().var_Ilol_IIIl) || var14_25.equals(Ilol.Ilol_II().var_Ilol_IIIl.var_I_I__IIIl) || !(var14_25 instanceof Ilol)) break block236;
                                var15_26 = (Ilol)var14_25;
                                if (var15_26.var_byte_III0 == 5 || var15_26.II01()) break block236;
                                this.IIll(var11_16, var3_4);
                                ** GOTO lbl342
                            }
                            if (Ilol.Ilol_II().var_I_I__IIII != var14_25 && Ilol.Ilol_II().var_I10__II != var14_25) break block237;
                            this.IIII(var14_25);
                            var13_22 = true;
                            break block238;
                        }
                        if (IOlO.l1oI != 51 || !var14_25.equals(Ilol.Ilol_II().var_I_11_II)) break block239;
                        this.IIll(var11_16, var3_4);
                        ** GOTO lbl342
                    }
                    if (Ilol.Ilol_II().var_I_ol_II != null || Ilol.Ilol_II().var_Il0l_II != null || Ilol.Ilol_II().var_I__l_II != null || Ilol.Ilol_II().I_o_arr_II() != null) {
                        var13_22 = false;
                    } else {
                        Ilol.Ilol_II().III1(var14_25);
                        var14_25.IOlo();
lbl342:
                        // 4 sources

                        var13_22 = false;
                    }
                }
                this.I10O = var13_22;
                this.var_long_Il01 = var8_3;
                this.IOoO = I1_I.Io1;
                this.IOo0 = I1_I.Io1I;
                II.var_boolean_IIIo = false;
            }
            if (Ilol.Ilol_II().var_I1Il_II != null && Ilol.Ilol_II().var_I1Il_II.II0o()) {
                Ilol.Ilol_II().var_I1Il_II.I0lO();
            }
            if (Ilol.Ilol_II().var_I_ol_II == null) {
                if (Ilol.Ilol_II().IOIl == 1) {
                    if (II.var_boolean_arr_II[5]) {
                        II.var_boolean_arr_II[5] = false;
                        this.II(false, false);
                    } else if (II.var_boolean_arr_IIII[2]) {
                        if (!Ilol.Ilol_II().I10l) {
                            var10_15 = false;
                            if (Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 != 0 || Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o != 0) {
                                I_0_.II().IoO();
                            }
                            Ilol.Ilol_II().I_oo = -10;
                            Ilol.Ilol_II().I_o0 = 0;
                            Ilol.Ilol_II().IOIl = 3;
                            Ilol.Ilol_II().IO = 0;
                        }
                    } else if (II.var_boolean_arr_IIII[4]) {
                        I1_I.IO_ = false;
                        Ilol.Ilol_II().I1_I = false;
                        if (Ilol.Ilol_II().IOI1 == 1) {
                            Ilol.Ilol_II().IOI1 = -1;
                        } else if (!Ilol.Ilol_II().I10l) {
                            if (Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 != 0) {
                                I_0_.II().IoO();
                            }
                            Ilol.Ilol_II().IOIl = 2;
                            Ilol.Ilol_II().I_o0 = -Ilol.Ilol_II().IOIo;
                        }
                        Ilol.Ilol_II().I_IO = false;
                    } else if (II.var_boolean_arr_IIII[6]) {
                        I1_I.IO_ = false;
                        Ilol.Ilol_II().I1_I = false;
                        if (Ilol.Ilol_II().IOI1 == -1) {
                            Ilol.Ilol_II().IOI1 = 1;
                        } else if (!Ilol.Ilol_II().I10l) {
                            if (Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 != 0) {
                                I_0_.II().IoO();
                            }
                            Ilol.Ilol_II().IOIl = 2;
                            Ilol.Ilol_II().I_o0 = Ilol.Ilol_II().IOIo;
                        }
                        Ilol.Ilol_II().I_IO = false;
                    }
                } else if (Ilol.Ilol_II().IOIl == 2) {
                    if (II.var_boolean_arr_II[5]) {
                        II.var_boolean_arr_II[5] = false;
                        this.II(false, true);
                    } else if (!II.var_boolean_arr_IIII[2]) {
                        if (II.var_boolean_arr_IIII[4]) {
                            I1_I.IO_ = false;
                            if (Ilol.Ilol_II().IOI1 == 1) {
                                Ilol.Ilol_II().IOI1 = -1;
                            } else {
                                var12_18 = Ilol.Ilol_II();
                                var13_23 = -Ilol.Ilol_II().IOIo;
                                Ilol.Ilol_II();
                                var12_18.I_o0 = var13_23;
                            }
                        } else if (II.var_boolean_arr_IIII[6]) {
                            I1_I.IO_ = false;
                            if (Ilol.Ilol_II().IOI1 == -1) {
                                Ilol.Ilol_II().IOI1 = 1;
                            } else {
                                var12_19 = Ilol.Ilol_II();
                                var13_24 = Ilol.Ilol_II().IOIo;
                                Ilol.Ilol_II();
                                var12_19.I_o0 = var13_24;
                            }
                        }
                    } else {
                        if (Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 != 0 || Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o != 0) {
                            I_0_.II().IoO();
                        }
                        Ilol.Ilol_II().I_oo = -10;
                        Ilol.Ilol_II().IOIl = 3;
                        Ilol.Ilol_II().IO = 0;
                    }
                } else if (Ilol.Ilol_II().IOIl == 3) {
                    I1_I.IO_ = false;
                    if (II.var_boolean_arr_II[5]) {
                        II.var_boolean_arr_II[5] = false;
                        this.II(false, true);
                    }
                    if (!(II.var_boolean_arr_IIII[4] || II.var_boolean_arr_IIII[1] && this.var_I_I__IIIO == null)) {
                        if (II.var_boolean_arr_IIII[6] || II.var_boolean_arr_IIII[3] && this.var_I_I__IIIO == null) {
                            if (Ilol.Ilol_II().IOI1 == -1) {
                                Ilol.Ilol_II().IOI1 = 1;
                            } else {
                                Ilol.Ilol_II().I_o0 = Ilol.Ilol_II().IOIo;
                            }
                        }
                    } else if (Ilol.Ilol_II().IOI1 == 1) {
                        Ilol.Ilol_II().IOI1 = -1;
                    } else {
                        Ilol.Ilol_II().I_o0 = -Ilol.Ilol_II().IOIo;
                    }
                    if ((II.var_boolean_arr_IIII[2] || (II.var_boolean_arr_IIII[1] || II.var_boolean_arr_IIII[3]) && this.var_I_I__IIIO == null) && Ilol.Ilol_II().I110 && Ilol.Ilol_II().IOl1 > 0 && Ilol.Ilol_II().IO < 8 && Ilol.Ilol_II().I_oo > -4) {
                        ++Ilol.Ilol_II().IO;
                        Ilol.Ilol_II().I_oo = -7;
                    }
                } else if (Ilol.Ilol_II().IOIl == 4) {
                    if (II.var_boolean_arr_II[5]) {
                        II.var_boolean_arr_II[5] = false;
                        this.II(false, true);
                    }
                    if (II.var_boolean_arr_IIII[2] && Ilol.Ilol_II().IOl1 > 0 && Ilol.Ilol_II().I110) {
                        I1_I.IO_ = false;
                        if (!(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 == 0 && Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o == 0 || I_Ol.II1(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00) <= 96 && I_Ol.II1(Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o) <= 24)) {
                            I_0_.II().IoO();
                        }
                        Ilol.Ilol_II().I_oo = -10;
                        Ilol.Ilol_II().IOIl = 3;
                        Ilol.Ilol_II().IO = 0;
                    }
                    if (II.var_boolean_arr_IIII[4]) {
                        I1_I.IO_ = false;
                        if (Ilol.Ilol_II().IOI1 == 1) {
                            Ilol.Ilol_II().IOI1 = -1;
                        } else {
                            ++Ilol.Ilol_II().IO;
                            Ilol.Ilol_II().I_o0 = -Ilol.Ilol_II().IOIo;
                            if (Ilol.Ilol_II().IO > 5 && Ilol.Ilol_II().I_oo > 6) {
                                Ilol.Ilol_II().IOIl = 10;
                                Ilol.Ilol_II().IO = 0;
                                Ilol.Ilol_II().I_oo = 0;
                            }
                        }
                    } else if (II.var_boolean_arr_IIII[6]) {
                        I1_I.IO_ = false;
                        if (Ilol.Ilol_II().IOI1 == -1) {
                            Ilol.Ilol_II().IOI1 = 1;
                        } else {
                            ++Ilol.Ilol_II().IO;
                            Ilol.Ilol_II().I_o0 = Ilol.Ilol_II().IOIo;
                            if (Ilol.Ilol_II().IO > 5 && Ilol.Ilol_II().I_oo > 6) {
                                Ilol.Ilol_II().IOIl = 10;
                                Ilol.Ilol_II().IO = 0;
                                Ilol.Ilol_II().I_oo = 0;
                            }
                        }
                    }
                } else if (Ilol.Ilol_II().IOIl == 10) {
                    if (II.var_boolean_arr_II[5]) {
                        II.var_boolean_arr_II[5] = false;
                        this.II(false, true);
                    }
                    if (Ilol.Ilol_II().I110 && Ilol.Ilol_II().IOl1 > 0) {
                        if (!II.var_boolean_arr_IIII[2]) {
                            if (II.var_boolean_arr_IIII[4]) {
                                I1_I.IO_ = false;
                                if (Ilol.Ilol_II().IOI1 == 1) {
                                    Ilol.Ilol_II().IOI1 = -1;
                                } else {
                                    Ilol.Ilol_II().I_o0 = -(Ilol.Ilol_II().IOIo + 1);
                                }
                            } else if (II.var_boolean_arr_IIII[6]) {
                                if (Ilol.Ilol_II().IOI1 == -1) {
                                    Ilol.Ilol_II().IOI1 = 1;
                                } else {
                                    Ilol.Ilol_II().I_o0 = Ilol.Ilol_II().IOIo + 1;
                                }
                            }
                        } else {
                            I1_I.IO_ = false;
                            if (!(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 == 0 && Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o == 0 || I_Ol.II1(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00) <= 96 && I_Ol.II1(Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o) <= 24)) {
                                I_0_.II().IoO();
                            }
                            Ilol.Ilol_II().I_oo = -10;
                            Ilol.Ilol_II().IOIl = 3;
                            Ilol.Ilol_II().IO = 0;
                        }
                    }
                } else if (Ilol.Ilol_II().IOIl == 7) {
                    if (II.var_boolean_arr_II[5]) {
                        II.var_boolean_arr_II[5] = false;
                    }
                    if (II.var_boolean_arr_IIII[4]) {
                        I1_I.IO_ = false;
                        if (Ilol.Ilol_II().IOI1 == 1) {
                            Ilol.Ilol_II().IOI1 = -1;
                        } else {
                            Ilol.Ilol_II().I_o0 = -Ilol.Ilol_II().IOIo + 2;
                        }
                    } else if (II.var_boolean_arr_IIII[6]) {
                        I1_I.IO_ = false;
                        if (Ilol.Ilol_II().IOI1 == -1) {
                            Ilol.Ilol_II().IOI1 = 1;
                        } else {
                            Ilol.Ilol_II().I_o0 = Ilol.Ilol_II().IOIo - 2;
                        }
                    }
                }
                if (II.var_boolean_arr_II[8] && II.II_ != 56) {
                    II.var_boolean_arr_II[8] = false;
                    Ilol.Ilol_II().IOo = 0;
                }
                if (II.var_boolean_arr_II[10]) {
                    II.var_boolean_arr_II[10] = false;
                    this.I0_();
                }
                if (II.II_ != 0) {
                    if (this.var_I_I__IIIO == null) {
                        if (IOI0.III_) {
                            if (II.II_ == 113) {
                                if (I1_I.var_I_0o_arr_III[0] != null) {
                                    this.II(I1_I.var_I_0o_arr_III[0], true);
                                }
                            } else if (II.II_ == 119) {
                                if (I1_I.var_I_0o_arr_III[1] != null) {
                                    this.II(I1_I.var_I_0o_arr_III[1], true);
                                }
                            } else if (II.II_ == 101) {
                                if (I1_I.var_I_0o_arr_III[2] != null) {
                                    this.II(I1_I.var_I_0o_arr_III[2], true);
                                }
                            } else if (II.II_ == 114) {
                                if (I1_I.var_I_0o_arr_III[3] != null) {
                                    this.II(I1_I.var_I_0o_arr_III[3], true);
                                }
                            } else if (II.II_ == 116) {
                                if (I1_I.var_I_0o_arr_III[4] != null) {
                                    this.II(I1_I.var_I_0o_arr_III[4], true);
                                }
                            } else if (II.II_ != 50 && II.II_ != 53) {
                                Ilo_.II().II(II.II_, this, "");
                            }
                        } else if (!II.var_boolean_III) {
                            Ilo_.II().II(II.II_, this, "");
                        } else if (II.II_ == 55) {
                            if (I1_I.var_I_0o_arr_III[0] != null) {
                                this.II(I1_I.var_I_0o_arr_III[0], true);
                            }
                        } else if (II.II_ == 56) {
                            if (I1_I.var_I_0o_arr_III[1] != null) {
                                this.II(I1_I.var_I_0o_arr_III[1], true);
                            }
                        } else if (II.II_ == 57) {
                            if (I1_I.var_I_0o_arr_III[2] != null) {
                                this.II(I1_I.var_I_0o_arr_III[2], true);
                            }
                        } else if (II.II_ == 49) {
                            if (I1_I.var_I_0o_arr_III[3] != null) {
                                this.II(I1_I.var_I_0o_arr_III[3], true);
                            }
                        } else if (II.II_ == 51) {
                            if (I1_I.var_I_0o_arr_III[4] != null) {
                                this.II(I1_I.var_I_0o_arr_III[4], true);
                            }
                        } else if (II.II_ == 48) {
                            Ilo_.II().II1o("");
                        } else if (!IlI.III().III0(II.II_)) {
                            // empty if block
                        }
                    } else {
                        var7_9 = this.var_java_lang_String_IlII.toCharArray();
                        var2_6 = new I_lO("");
                        for (var11_16 = 0; var11_16 < var7_9.length; ++var11_16) {
                            var2_6.addElement(String.valueOf(var7_9[var11_16]));
                        }
                        var2_6.removeElementAt(0);
                        var12_20 = String.valueOf((char)II.II_);
                        if (var12_20.equals("") || var12_20 == null || var12_20.equals(I1_I.IllI("\u8371", 33659))) {
                            var12_20 = I1_I.IllI("\u8356", 33659);
                        }
                        var2_6.insertElementAt(var12_20, var2_6.size());
                        this.var_java_lang_String_IlII = "";
                        for (var1_5 = 0; var1_5 < var2_6.size(); ++var1_5) {
                            this.var_java_lang_String_IlII = this.var_java_lang_String_IlII + ((String)var2_6.elementAt(var1_5)).toUpperCase();
                        }
                        I_0_.II().II((char)II.II_);
                    }
                    II.II_ = 0;
                }
                II.IIIl();
            }
        }
    }

    private I1_O II(int n, int n2) {
        I1_O i1_O = null;
        int n3 = 0;
        I_lO[] i_lOArray = new I_lO[]{var_I_lO_IIO, var_I_lO_IIOI, var_I_lO_II_0, var_I_lO_II_O};
        for (int i = 0; i < i_lOArray.length; ++i) {
            for (int j = 0; j < i_lOArray[i].size(); ++j) {
                int n4;
                I1_O i1_O2 = (I1_O)i_lOArray[i].elementAt(j);
                if (i1_O2.IIOl()) continue;
                if (i1_O2 instanceof I_I_) {
                    I_I_ i_I_ = (I_I_)i1_O2;
                    if (i_I_.I0I1 && i_I_.equals(Ilol.Ilol_II().var_I_I__IIIl)) continue;
                }
                int n5 = i1_O2.IIlo();
                int n6 = i1_O2.II1();
                int n7 = i1_O2.II1l();
                if (!I1_I.II(n, n2, n5 - n7 / 2 - 30, n6 - (n4 = i1_O2.II1I()) - 30, n7 + 60, n4 + 60)) continue;
                if (i1_O == null) {
                    i1_O = i1_O2;
                    n3 = I_Ol.II1(n - n5) + I_Ol.II1(n2 - n6);
                    if (i != 1) continue;
                    return i1_O2;
                }
                if ((n5 = I_Ol.II1(n - n5) + I_Ol.II1(n2 - n6)) >= n3) continue;
                i1_O = i1_O2;
                n3 = n5;
            }
        }
        return i1_O;
    }

    private static boolean II(int n, int n2, int n3, int n4, int n5, int n6) {
        return n >= n3 && n <= n3 + n5 && n2 >= n4 && n2 <= n4 + n6;
    }

    private boolean II(I1_O i1_O) {
        int n;
        if (i1_O == null) {
            return false;
        }
        int n2 = i1_O.II1();
        if (n2 < (n = Ilol.Ilol_II().I_oO)) {
            while (n2 < n) {
                if (!IOlO.boolean_IIIl(Ilol.Ilol_II().I_o_, n -= 5, 8192)) continue;
                this.Io0_ = 0;
                Ilol.Ilol_II();
                Ilol.Ilol_II().var_I_ll_II = null;
                return true;
            }
        }
        return false;
    }

    public void IIII(I1_O i1_O) {
        if ((i1_O.equals(Ilol.Ilol_II().var_I_11_II) || this.var_I_I__IIIO == null) && !this.II(i1_O)) {
            boolean bl = false;
            if (i1_O != null && this.I01_ <= 0) {
                this.I01_ = 10;
                int n = i1_O.IIlo();
                int n2 = (n = I_Ol.II1(Ilol.Ilol_II().I_o_ - n)) <= 80 ? 1 : (n > 80 && n <= 200 ? 2 : (n > 200 && n <= 400 ? 3 : 4));
                if (i1_O.equals(Ilol.Ilol_II().var_I_I__IIII) || i1_O.equals(Ilol.Ilol_II().var_Ilol_IIIl) && Ilol.Ilol_II().IIIO(Ilol.Ilol_II().var_Ilol_IIIl)) {
                    I_0.III(135, i1_O.IIlo(), i1_O.II1(), n2);
                } else if (i1_O.equals(Ilol.Ilol_II().var_I_11_II) || i1_O.equals(Ilol.Ilol_II().var_I10__II) || i1_O.equals(Ilol.Ilol_II().var_Ilol_IIIl)) {
                    I_0.III(136, i1_O.IIlo(), i1_O.II1(), n2);
                }
            }
            Ilol.Ilol_II();
            Ilol.Ilol_II().var_I_ll_II = null;
            Ilol.Ilol_II().I_oo = 0;
            Ilol.Ilol_II().I_o0 = 0;
            i1_O.IOlo();
            this.Io0_ = 10;
            if (i1_O instanceof I_I_) {
                II0l.II0l_III().Ilo0();
            }
            this.II(false, true);
            this.IOol = i1_O.IIlo();
            this.IOo_ = i1_O.II1();
            this.I10o = false;
            this.IOl0 = true;
        }
    }

    private boolean IIII(int n, int n2) {
        int n3;
        int n4;
        if (this.equals(var_I1Oo_III) && I1_I.I1_I_II().var_I__0_II != null) {
            return false;
        }
        if (I1_I.var_I1Oo_III.var_I1O__III.II != null && I1_I.var_I1Oo_III.var_I1O__III.II.IIll != null && I1_I.II(n - Io1, n2 - Io1I, n4 = I_Ol.II1(I1_I.var_I1Oo_III.Io1) + I1_I.var_I1Oo_III.var_I1O__III.IIOl - 40, n3 = I_Ol.II1(I1_I.var_I1Oo_III.Io1I) + I1_I.var_I1Oo_III.var_I1O__III.IIlI, 200, I1_I.var_I1Oo_III.var_I1O__III.IIO_)) {
            boolean bl = true;
            I1_I.var_I1Oo_III.IIOl = 10;
            return true;
        }
        return false;
    }

    private boolean IIIl(int n, int n2) {
        for (int i = 0; i < I__O.IlI.size(); ++i) {
            I__O i__O = (I__O)I__O.IlI.elementAt(i);
            if (!I1_I.II(n, n2, i__O.I_o_, i__O.I_oO, i__O.IO1l, i__O.IO11)) continue;
            if (i__O.I_oO <= 24 && IOlO.Illl() && Ilol.Ilol_II().var_byte_III0 != 0) {
                return false;
            }
            if (!i__O.I0_I) continue;
            i__O.IIO(10);
            return true;
        }
        return false;
    }

    private void IIll(int n, int n2) {
        if (!var_III_II.III()) {
            Ilol.Ilol_II();
            if (n < IOlO.l100 && n > IOlO.l100 - 32) {
                Ilol.Ilol_II().var_I_ll_II = new I_ll(IOlO.l100, n2);
            } else if (n < 32 && n > 0) {
                Ilol.Ilol_II().var_I_ll_II = new I_ll(0, n2);
            } else {
                this.IOol = n;
                this.IOo_ = n2;
                this.I10o = false;
                Ilol.Ilol_II().IOo = 0;
                int n3 = n = Ilol.Ilol_II().I110 && Ilol.Ilol_II().IOl1 > 0 ? 0 : 1000;
                if (this.IOo_ <= Ilol.Ilol_II().I_oO || I_Ol.II1(this.IOol - Ilol.Ilol_II().I_o_) >= 12) {
                    for (n2 = 0; n2 < n + 60 && this.IOo_ + n2 < IOlO.l10o - 24; n2 += 24) {
                        if (!IOlO.boolean_IIIl(this.IOol, this.IOo_ + n2, 2)) continue;
                        this.IOo_ = IOlO.int_II1I(this.IOo_ + n2);
                        this.I10o = true;
                        break;
                    }
                    for (n2 = 0; n2 < n + 40; n2 += 24) {
                        if (!IOlO.boolean_IIIl(this.IOol, this.IOo_ - n2, 2)) continue;
                        this.IOo_ = IOlO.int_II1I(this.IOo_ - n2);
                        this.I10o = true;
                        break;
                    }
                    this.IOl0 = true;
                    Ilol.Ilol_II().IOo = 0;
                    if (!this.I10o && this.IOo_ < Ilol.Ilol_II().I_oO - 50) {
                        Ilol.Ilol_II().IOo = 20;
                    }
                    this.Io0_ = 0;
                    if (Ilol.Ilol_II().I_IO) {
                        Ilol.Ilol_II().I0II();
                    }
                    Ilol.Ilol_II().var_I_ll_II = new I_ll(this.IOol, this.IOo_);
                    Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().var_I_ll_II.lI0 > 0 ? -1 : 1;
                    Ilol.Ilol_II().var_I1Il_III = null;
                    IO_ = false;
                    II0l.II0l_III().Iloo();
                }
            }
        }
    }

    public void I0_() {
        long l;
        if (!Ilol.Ilol_II().I_l0 && !Ilol.Ilol_II().I_l1 && Ilol.Ilol_II().I0OI <= 0 && (l = System.currentTimeMillis()) - this.var_long_Il0O >= 10000L) {
            if (!Ilol.Ilol_II().II0_()) {
                var_I1Oo_II.IIII(IO11.I10O, 0);
            } else {
                I_0.II(11, Ilol.Ilol_II(), 5);
                I_0.II(104, Ilol.Ilol_II(), 4);
                this.var_long_Il0O = l;
                IO.II();
            }
        }
    }

    public void IIl(int n, int n2) {
        if (!this.IO10) {
            IO.II();
            I_Ol.II__(I1_I.IllI("\u833a\u83d9\u83ed\u8391\u83a1\u8453\u8415\u8407\u8426\u84c2\u84f4\u8482\u84cf\u855e\u8562\u851b\u852e\u85d8", 33659));
            this.IO10 = true;
            this.I0Io = 0;
            this.I0ll = 0;
            this.I0l = n - Io1;
            this.I0lI = n2 - Io1I;
        }
    }

    public void IIll(boolean bl) {
        this.I1_1 = true;
        this.IO1I = true;
        this.IO1o = true;
        if (bl) {
            I1lI.III(new I1ll(20, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - 77, 2, 8, 1));
        }
    }

    public void I0_I() {
        this.I1_1 = false;
        this.IO1I = true;
        this.IO1o = false;
    }

    public void I0_l() {
        this.IO1l = true;
        this.IooI = IO1l.II(0.4f, 0, II.var_int_arr_IIIo[II.var_int_arr_IIIo.length - 1]);
    }

    public void IIl1(int n, int n2) {
        I_Ol.II__(I1_I.IllI("\u832d\u83df\u8399\u838a\u83b8\u8458\u8472\u8474\u8427\u84da\u84f0\u849e\u84cf\u8541\u850d\u851a\u8522\u85aa\u85fd\u859a\u85ae\u8626\u865d\u8679\u8643", 33659) + n + I1_I.IllI("\u835b\u83e3\u8384", 33659) + n2);
        this.I0_l();
        this.IO1O = true;
        I1lI.III(new I1ll(this.IO11 ? 25 : 17, n, n2 - 77, 2, -1, 1));
    }

    /*
     * Unable to fully structure code
     */
    private void II(boolean var1_1, boolean var2_2) {
        block38: {
            block42: {
                block44: {
                    block48: {
                        block67: {
                            block72: {
                                block71: {
                                    block70: {
                                        block69: {
                                            block68: {
                                                block61: {
                                                    block64: {
                                                        block63: {
                                                            block65: {
                                                                block66: {
                                                                    block62: {
                                                                        block52: {
                                                                            block60: {
                                                                                block59: {
                                                                                    block58: {
                                                                                        block57: {
                                                                                            block56: {
                                                                                                block55: {
                                                                                                    block54: {
                                                                                                        block53: {
                                                                                                            block51: {
                                                                                                                block50: {
                                                                                                                    block49: {
                                                                                                                        block47: {
                                                                                                                            block46: {
                                                                                                                                block45: {
                                                                                                                                    block43: {
                                                                                                                                        block41: {
                                                                                                                                            block40: {
                                                                                                                                                block39: {
                                                                                                                                                    block37: {
                                                                                                                                                        if (Ilol.Ilol_II().var_Ilol_IIIl == null || Ilol.Ilol_II().var_Ilol_IIIl.I_oO < Ilol.Ilol_II().I_oO + 48 || !IOlO.boolean_IIIl(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, 2)) break block37;
                                                                                                                                                        this.Io0_ = 0;
                                                                                                                                                        Ilol.Ilol_II().var_I_ll_II = null;
                                                                                                                                                        Ilol.var_boolean_I10 = false;
                                                                                                                                                        Ilol.Ilol_II().I10l = false;
                                                                                                                                                        break block38;
                                                                                                                                                    }
                                                                                                                                                    I_Ol.II__(I1_I.IllI("\u831f\u83f5\u8399\u83be\u839e\u8464\u8450", 33659));
                                                                                                                                                    ++I1_I.I0l_;
                                                                                                                                                    var3_3 = Ilol.Ilol_II().IO1_III();
                                                                                                                                                    var4_4 = Ilol.Ilol_II().IO1_IIII();
                                                                                                                                                    if (var2_2 || var3_3 == null || Ilol.Ilol_II().var_I_I__IIII != null && (Ilol.Ilol_II().var_I_I__IIII == null || Ilol.Ilol_II().var_I_I__IIII.I1ll != 0)) break block39;
                                                                                                                                                    var3_3.III.II_I.I0lO();
                                                                                                                                                    break block38;
                                                                                                                                                }
                                                                                                                                                if (var2_2 || var4_4 == null || Ilol.Ilol_II().var_I_I__IIII != null && (Ilol.Ilol_II().var_I_I__IIII == null || Ilol.Ilol_II().var_I_I__IIII.I1ll != 0)) break block40;
                                                                                                                                                var4_4.III.II_I.I0lO();
                                                                                                                                                break block38;
                                                                                                                                            }
                                                                                                                                            if (IOlO.l1oI == 51 && Ilol.Ilol_II().var_I_11_II != null || Ilol.Ilol_II().IOIl == 14) break block38;
                                                                                                                                            Ilol.Ilol_II().I_oo = 0;
                                                                                                                                            Ilol.Ilol_II().I_o0 = 0;
                                                                                                                                            if (!Ilol.Ilol_II().IIOO() || !Ilol.Ilol_II().II00()) break block41;
                                                                                                                                            if (this.II0I()) {
                                                                                                                                                Ilol.Ilol_II();
                                                                                                                                                Ilol.Ilol_II();
                                                                                                                                                Ilol.IO0o();
                                                                                                                                            }
                                                                                                                                            break block42;
                                                                                                                                        }
                                                                                                                                        if (!this.II(Ilol.Ilol_II().var_Ilol_IIIl)) break block43;
                                                                                                                                        var5_5 = false;
                                                                                                                                        break block44;
                                                                                                                                    }
                                                                                                                                    if (!this.II(Ilol.Ilol_II().var_I_I__IIII)) break block45;
                                                                                                                                    var5_5 = false;
                                                                                                                                    break block44;
                                                                                                                                }
                                                                                                                                if (!this.II(Ilol.Ilol_II().var_I_11_II)) break block46;
                                                                                                                                var5_5 = false;
                                                                                                                                break block44;
                                                                                                                            }
                                                                                                                            if (!Ilo_.II().I_10) break block47;
                                                                                                                            var5_5 = false;
                                                                                                                            break block44;
                                                                                                                        }
                                                                                                                        if (I1OO.I1l1) break block48;
                                                                                                                        Ilol.Ilol_II();
                                                                                                                        if (Ilol.var_boolean_I10) break block48;
                                                                                                                        if (Ilol.Ilol_II().var_I_0o_II == null || Ilol.Ilol_II().var_I_0o_II.II.IlIO != 6 || Ilol.Ilol_II().var_I10__II == null) break block49;
                                                                                                                        this.IOol();
                                                                                                                        var5_5 = false;
                                                                                                                        break block44;
                                                                                                                    }
                                                                                                                    if (Ilol.Ilol_II().var_I_0o_II == null || Ilol.Ilol_II().var_I_0o_II.II.IoI_ != 2 || Ilol.Ilol_II().var_I_11_II != null || Ilol.Ilol_II().var_I_0o_II.II.IlIO == 6) break block50;
                                                                                                                    var5_5 = this.II0I();
                                                                                                                    break block44;
                                                                                                                }
                                                                                                                if (Ilol.Ilol_II().var_I_ol_II == null && (Ilol.Ilol_II().var_I_I__IIII != null || Ilol.Ilol_II().var_I_11_II != null || Ilol.Ilol_II().var_Ilol_IIIl != null || Ilol.Ilol_II().var_I10__II != null)) break block51;
                                                                                                                var5_5 = false;
                                                                                                                break block44;
                                                                                                            }
                                                                                                            if (Ilol.Ilol_II().var_I_I__IIII == null) break block52;
                                                                                                            if (Ilol.Ilol_II().var_I_I__IIII.Il() && Ilol.Ilol_II().var_I_I__IIII.status == 4) {
                                                                                                                Ilol.Ilol_II().var_I_I__IIII = null;
                                                                                                                Ilol.Ilol_II().var_I_ll_II = null;
                                                                                                            }
                                                                                                            I1_I.IO_ = true;
                                                                                                            if (I1_I.IIIl(Ilol.Ilol_II().var_I_I__IIII)) break block53;
                                                                                                            var5_5 = false;
                                                                                                            break block44;
                                                                                                        }
                                                                                                        if (this.var_I_I__IIIO == null) break block54;
                                                                                                        var5_5 = false;
                                                                                                        break block44;
                                                                                                    }
                                                                                                    if (Ilol.Ilol_II().var_I_0o_II != null) break block55;
                                                                                                    var5_5 = false;
                                                                                                    break block44;
                                                                                                }
                                                                                                if (!Ilol.Ilol_II().IIOO()) break block56;
                                                                                                var5_5 = false;
                                                                                                break block44;
                                                                                            }
                                                                                            var6_6 = -1;
                                                                                            var8_9 = I_Ol.II1(Ilol.Ilol_II().I_o_ - I1_I.Io1) * IO1l.l_I0;
                                                                                            if (Ilol.Ilol_II().var_Ilol_IIIl != null) {
                                                                                                var6_6 = I_Ol.II1(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().var_Ilol_IIIl.I_o_) * IO1l.l_I0;
                                                                                            } else if (Ilol.Ilol_II().var_I_I__IIII != null) {
                                                                                                var6_6 = I_Ol.II1(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().var_I_I__IIII.I1) * IO1l.l_I0;
                                                                                            }
                                                                                            if (Ilol.Ilol_II().var_I_I__IIII.status != 1 && Ilol.Ilol_II().var_I_I__IIII.status != 0 && Ilol.Ilol_II().var_I_0o_II.II.IoI_ != 4 && var6_6 != -1 && var6_6 <= var8_9) break block57;
                                                                                            if (Ilol.Ilol_II().var_I_0o_II.II.IoI_ == 4) {
                                                                                                Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().var_I_I__IIII.I1 < Ilol.Ilol_II().I_o_ ? -1 : 1;
                                                                                                this.II(Ilol.Ilol_II().var_I_0o_II, true);
                                                                                            }
                                                                                            var5_5 = false;
                                                                                            break block44;
                                                                                        }
                                                                                        if (this.II0I()) break block58;
                                                                                        var5_5 = false;
                                                                                        break block44;
                                                                                    }
                                                                                    Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().I_o_ < Ilol.Ilol_II().var_I_I__IIII.IIlo() ? 1 : -1;
                                                                                    var7_11 = Math.abs(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().var_I_I__IIII.IIlo());
                                                                                    var8_9 = Math.abs(Ilol.Ilol_II().I_oO - Ilol.Ilol_II().var_I_I__IIII.II1());
                                                                                    Ilol.Ilol_II().I_o0 = 0;
                                                                                    if (var7_11 <= Ilol.Ilol_II().var_I_0o_II.l1_0 && var8_9 <= Ilol.Ilol_II().var_I_0o_II.l1_o) break block59;
                                                                                    var12_15 = false;
                                                                                    if (Ilol.Ilol_II().var_I_I__IIII instanceof Ilo || Ilol.Ilol_II().var_I_I__IIII instanceof IloI) {
                                                                                        var12_15 = true;
                                                                                    }
                                                                                    var6_6 = (Ilol.Ilol_II().var_I_0o_II.l1_0 - (var12_15 != false ? 50 : 20)) * (Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_I_I__IIII.IIlo() ? 1 : -1);
                                                                                    if (var7_11 <= Ilol.Ilol_II().var_I_0o_II.l1_0) {
                                                                                        var6_6 = 0;
                                                                                    }
                                                                                    Ilol.Ilol_II().var_I_ll_II = new I_ll(Ilol.Ilol_II().var_I_I__IIII.IIlo() + var6_6, Ilol.Ilol_II().var_I_I__IIII.II1());
                                                                                    Ilol.Ilol_II().var_I1Il_III = new I1Il((String)null, null, 8002, null);
                                                                                    II.III1();
                                                                                    II.IIIl();
                                                                                    var5_5 = false;
                                                                                    break block44;
                                                                                }
                                                                                if (Ilol.Ilol_II().var_I_0o_II.II.IlIO == 20) ** GOTO lbl-1000
                                                                                if (var8_9 <= var7_11 || I_Ol.II1(Ilol.Ilol_II().I_oO - Ilol.Ilol_II().var_I_I__IIII.II1()) <= 30 || Ilol.Ilol_II().var_I_I__IIII.I_Io_II().II0l != 4) break block60;
                                                                                Ilol.Ilol_II().var_I_ll_II = new I_ll(Ilol.Ilol_II().I_o_ + Ilol.Ilol_II().IOI1, Ilol.Ilol_II().var_I_I__IIII.II1());
                                                                                Ilol.Ilol_II().var_I1Il_III = new I1Il((String)null, null, 8002, null);
                                                                                II.III1();
                                                                                II.IIIl();
                                                                                var5_5 = false;
                                                                                break block44;
                                                                            }
                                                                            var10_16 = 20;
                                                                            var2_2 = false;
                                                                            if (Ilol.Ilol_II().var_I_I__IIII instanceof Ilo || Ilol.Ilol_II().var_I_I__IIII instanceof IloI) {
                                                                                var2_2 = true;
                                                                            }
                                                                            if (Ilol.Ilol_II().var_I_0o_II.l1_0 > 100) {
                                                                                var10_16 = 60;
                                                                                if (var7_11 < 20) {
                                                                                    Ilol.Ilol_II().II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, 10);
                                                                                }
                                                                            }
                                                                            I_Ol.II__(I1_I.IllI("\u831f\u83ee\u8384\u83f8", 33659) + var10_16);
                                                                            var9_18 = false;
                                                                            if ((IOlO.IIl(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO + 3) & 2) == 2) {
                                                                                v0 = var11_20 = Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_I_I__IIII.IIlo() ? 1 : -1;
                                                                                if ((IOlO.IIl(Ilol.Ilol_II().var_I_I__IIII.IIlo() + var10_16 * var11_20, Ilol.Ilol_II().I_oO + 3) & 2) != 2) {
                                                                                    var9_18 = true;
                                                                                }
                                                                            }
                                                                            if (var7_11 <= var10_16 && !var9_18) {
                                                                                if (Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_I_I__IIII.IIlo()) {
                                                                                    Ilol.Ilol_II().I_o_ = Ilol.Ilol_II().var_I_I__IIII.IIlo() + var10_16 + (var2_2 != false ? 30 : 0);
                                                                                    Ilol.Ilol_II().IOI1 = -1;
                                                                                } else {
                                                                                    Ilol.Ilol_II().I_o_ = Ilol.Ilol_II().var_I_I__IIII.IIlo() - var10_16 - (var2_2 != false ? 30 : 0);
                                                                                    Ilol.Ilol_II().IOI1 = 1;
                                                                                }
                                                                                I_0_.II().IoO();
                                                                            }
                                                                            II.III1();
                                                                            II.IIIl();
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        if (Ilol.Ilol_II().var_I_11_II == null) break block61;
                                                                        if (!Ilol.Ilol_II().var_I_11_II.IOIo) break block62;
                                                                        var5_5 = false;
                                                                        break block44;
                                                                    }
                                                                    Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().I_o_ < Ilol.Ilol_II().var_I_11_II.I_o_ ? 1 : -1;
                                                                    Ilol.Ilol_II().var_I_11_II.IOI1 = Ilol.Ilol_II().I_o_ < Ilol.Ilol_II().var_I_11_II.I_o_ ? -1 : 1;
                                                                    var6_7 = Math.abs(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().var_I_11_II.I_o_);
                                                                    if (Math.abs(Ilol.Ilol_II().I_oO - Ilol.Ilol_II().var_I_11_II.I_oO) > 40) {
                                                                        Ilol.Ilol_II().I_oO = Ilol.Ilol_II().var_I_11_II.I_oO - 40;
                                                                    }
                                                                    if (var6_7 >= 60) break block63;
                                                                    II.III1();
                                                                    II.IIIl();
                                                                    if (this.IoOI != 0) break block64;
                                                                    if (Ilol.Ilol_II().var_IOlI_II == null || Ilol.Ilol_II().var_IOlI_II.II01 != 0) break block65;
                                                                    if (Ilol.Ilol_II().var_IOlI_II.l10l >= 4 || Ilol.Ilol_II().var_I_11_II.var_I_1__II.lll0 != 4) break block66;
                                                                    var5_5 = false;
                                                                    break block44;
                                                                }
                                                                if (Ilol.Ilol_II().var_IOlI_II.l10l >= 3 || Ilol.Ilol_II().var_I_11_II.var_I_1__II.lll0 != 3) break block65;
                                                                var5_5 = false;
                                                                break block44;
                                                            }
                                                            this.IoOI = 50;
                                                            I1OO.IIl1();
                                                            I_0_.II().IoO();
                                                            I_0_.II().IIoI(Ilol.Ilol_II().var_I_11_II.var_I_1__II.lll0);
                                                            break block64;
                                                        }
                                                        var7_12 = (20 + I_Ol.var_java_util_Random_III.nextInt(20)) * (Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_I_11_II.I_o_ ? 1 : -1);
                                                        Ilol.Ilol_II().var_I_ll_II = new I_ll(Ilol.Ilol_II().var_I_11_II.I_o_ + var7_12, Ilol.Ilol_II().I_oO);
                                                        Ilol.Ilol_II().var_I1Il_III = new I1Il((String)null, null, 8002, null);
                                                        II.III1();
                                                        II.IIIl();
                                                    }
                                                    var5_5 = false;
                                                    break block44;
                                                }
                                                if (Ilol.Ilol_II().var_Ilol_IIIl == null) break block67;
                                                if (this.var_I_I__IIIO == null) break block68;
                                                var5_5 = false;
                                                break block44;
                                            }
                                            Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().I_o_ < Ilol.Ilol_II().var_Ilol_IIIl.I_o_ ? 1 : -1;
                                            var6_8 = Math.abs(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().var_Ilol_IIIl.I_o_);
                                            var8_10 = Math.abs(Ilol.Ilol_II().I_oO - Ilol.Ilol_II().var_Ilol_IIIl.I_oO);
                                            if (Ilol.Ilol_II().IIIO(Ilol.Ilol_II().var_Ilol_IIIl) || Ilol.Ilol_II().IIOo()) break block69;
                                            if (var6_8 < 60 && var8_10 < 40) {
                                                Ilol.Ilol_II();
                                                this.IOoI();
                                                if (!II.var_boolean_IIIl && Ilol.Ilol_II().var_Ilol_IIIl.IOI_ >= 0 && IOlO.l1oI != 51 && IOlO.l1oI != 52 && this.var_I__0_II == null) {
                                                    II.var_I_1o_II.III_(Ilol.Ilol_II().var_Ilol_IIIl);
                                                    II.var_I_1o_II.I__0();
                                                    I_0_.II().II01(Ilol.Ilol_II().var_Ilol_IIIl.IOI_);
                                                    I_0_.II().IlI0(Ilol.Ilol_II().var_Ilol_IIIl.IOI_);
                                                }
                                            } else {
                                                var7_13 = (20 + I_Ol.var_java_util_Random_III.nextInt(20)) * (Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_Ilol_IIIl.I_o_ ? 1 : -1);
                                                Ilol.Ilol_II().var_I_ll_II = new I_ll(Ilol.Ilol_II().var_Ilol_IIIl.I_o_ + var7_13, Ilol.Ilol_II().var_Ilol_IIIl.I_oO);
                                                Ilol.Ilol_II().var_I1Il_III = new I1Il((String)null, null, 8002, null);
                                                II.III1();
                                                II.IIIl();
                                            }
                                            var5_5 = false;
                                            break block44;
                                        }
                                        if (Ilol.Ilol_II().var_I_0o_II != null) break block70;
                                        var5_5 = false;
                                        break block44;
                                    }
                                    if (this.II0I()) break block71;
                                    var5_5 = false;
                                    break block44;
                                }
                                Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().I_o_ < Ilol.Ilol_II().var_Ilol_IIIl.I_o_ ? 1 : -1;
                                Ilol.Ilol_II().I_o0 = 0;
                                if (var6_8 <= Ilol.Ilol_II().var_I_0o_II.l1_0 && var8_10 <= Ilol.Ilol_II().var_I_0o_II.l1_o) break block72;
                                var7_14 = (Ilol.Ilol_II().var_I_0o_II.l1_0 - 20) * (Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_Ilol_IIIl.I_o_ ? 1 : -1);
                                if (var6_8 <= Ilol.Ilol_II().var_I_0o_II.l1_0) {
                                    var7_14 = 0;
                                }
                                Ilol.Ilol_II().var_I_ll_II = new I_ll(Ilol.Ilol_II().var_Ilol_IIIl.I_o_ + var7_14, Ilol.Ilol_II().var_Ilol_IIIl.I_oO);
                                Ilol.Ilol_II().var_I1Il_III = new I1Il((String)null, null, 8002, null);
                                II.III1();
                                II.IIIl();
                                var5_5 = false;
                                break block44;
                            }
                            if (Ilol.Ilol_II().var_I_0o_II.II.IlIO == 20) ** GOTO lbl-1000
                            var10_17 = 20;
                            if (Ilol.Ilol_II().var_I_0o_II.l1_0 > 60) {
                                var10_17 = 60;
                                if (var6_8 < 20) {
                                    Ilol.Ilol_II().II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, 10);
                                }
                            }
                            var9_19 = false;
                            if ((IOlO.IIl(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO + 3) & 2) == 2) {
                                v1 = var11_21 = Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_Ilol_IIIl.I_o_ ? 1 : -1;
                                if ((IOlO.IIl(Ilol.Ilol_II().var_Ilol_IIIl.I_o_ + var10_17 * var11_21, Ilol.Ilol_II().I_oO + 3) & 2) != 2) {
                                    var9_19 = true;
                                }
                            }
                            if (var6_8 <= var10_17 && !var9_19) {
                                if (Ilol.Ilol_II().I_o_ > Ilol.Ilol_II().var_Ilol_IIIl.I_o_) {
                                    Ilol.Ilol_II().I_o_ = Ilol.Ilol_II().var_Ilol_IIIl.I_o_ + var10_17;
                                    Ilol.Ilol_II().IOI1 = -1;
                                } else {
                                    Ilol.Ilol_II().I_o_ = Ilol.Ilol_II().var_Ilol_IIIl.I_o_ - var10_17;
                                    Ilol.Ilol_II().IOI1 = 1;
                                }
                                I_0_.II().IoO();
                            }
                            II.III1();
                            II.IIIl();
                            ** GOTO lbl-1000
                        }
                        if (Ilol.Ilol_II().var_I10__II != null) {
                            this.IOol();
                            var5_5 = false;
                        } else lbl-1000:
                        // 5 sources

                        {
                            var5_5 = true;
                        }
                        break block44;
                    }
                    var5_5 = false;
                }
                if (var5_5) {
                    if (Ilol.Ilol_II().II0() && Ilol.Ilol_II().II00()) {
                        if (this.II0I()) {
                            Ilol.Ilol_II();
                            Ilol.Ilol_II().IOo();
                        } else {
                            Ilol.Ilol_II().IO1_();
                        }
                    } else {
                        var1_1 = IOlO.boolean_IIIl(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, 2);
                        Ilol.Ilol_II().II(I1_I.var_I_ol_arr_II[Ilol.Ilol_II().var_I_0o_II.II0I], var1_1 != false ? 0 : 1);
                        if (var1_1) {
                            Ilol.Ilol_II().IOo = 20;
                        }
                        Ilol.Ilol_II();
                    }
                }
            }
            if (Ilol.Ilol_II().IIOo()) {
                this.Io0_ = 0;
            }
        }
    }

    private void IOol() {
        if (Ilol.Ilol_II().var_I10__II != null) {
            Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().I_o_ < Ilol.Ilol_II().var_I10__II.I1 ? 1 : -1;
            int n = Math.abs(Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().var_I10__II.I1);
            int n2 = Math.abs(Ilol.Ilol_II().I_oO - Ilol.Ilol_II().var_I10__II.I1I);
            if (n <= 40 && n2 < 40) {
                II.III1();
                II.IIIl();
                if (Ilol.Ilol_II().var_I10__II.II.II__ != 673) {
                    I_0_.II().IIo1(Ilol.Ilol_II().var_I10__II.lI0l);
                    return;
                }
                I_11 i_11 = new I_11(5, 0, -100, 100, 5, I1_I.var_I1Oo_II.III1[Ilol.Ilol_II().IOIO][2]);
                I_Ol.II__(Ilol.Ilol_II().var_I_11_II != null ? I1_I.IllI("\u835a\u83f4\u83cc\u83b4\u839b", 33659) : I1_I.IllI("\u8315\u83ef\u83d5\u83b4", 33659));
                String string = IO11.I1Ol;
                String[] stringArray = new String[]{IO11.I_I_, IO11.I_IO};
                I_Ol.II__(Ilol.Ilol_II().var_I_11_II != null ? I1_I.IllI("\u835a\u83f4\u83cc\u83b4\u839b", 33659) : I1_I.IllI("\u8315\u83ef\u83d5\u83b4", 33659));
                i_11.lIo0 = 673;
                I1_I.I1_I_II();
                I1_I.II(stringArray, i_11);
                Ilo1.II(string, 100000, i_11, 5820);
                return;
            }
            Ilol.Ilol_II().var_I_ll_II = new I_ll(Ilol.Ilol_II().var_I10__II.I1, Ilol.Ilol_II().var_I10__II.I1I);
            Ilol.Ilol_II().var_I1Il_III = new I1Il((String)null, null, 8002, null);
            II.III1();
            II.IIIl();
        }
    }

    public boolean IIol() {
        return Ilol.Ilol_II().I1ol || Ilol.Ilol_II().I1oI || Ilol.Ilol_II().I1o1 || Ilol.Ilol_II().I_I1 || this.IO10;
    }

    public void II(I_0o i_0o, boolean bl) {
        if (!Ilol.Ilol_II().I1o && !this.IIol() && Ilol.Ilol_II().var_IOlI_II.II01 > 1) {
            Ilol.Ilol_II().var_I_0o_II = i_0o;
            if (this.var_I_0o_III != i_0o && this.var_I_0o_III != null) {
                I_0_.II().IIo(i_0o.II.IlIO);
                this.I01o();
                this.var_I_0o_III = i_0o;
                this.I0lo = -1;
                I1_I.I1_I_II().Io0_ = 0;
            } else if (Ilol.Ilol_II().IIO0()) {
                I_Ol.II__(I1_I.IllI("\u8345\u83a4\u8387\u83ad\u8384\u8473\u8415\u8427\u8418\u84fb\u84dd\u84bc\u84cf\u857d\u855d\u8529\u8508\u85b0\u8589", 33659) + i_0o.II.IlIO);
                Ilol.Ilol_II().IIII(i_0o.II.IlIO);
                this.I01o();
                this.var_I_0o_III = i_0o;
                this.I0lo = -1;
                I1_I.I1_I_II().Io0_ = 0;
            } else if (Ilol.Ilol_II().IIOO()) {
                I_Ol.II__(I1_I.IllI("\u830e\u83e9\u83dc\u83f8\u8384\u847d\u845c\u8438\u841f\u84b2\u84df\u84bf\u849b\u852e\u854b\u8523\u8508\u85ff\u85da", 33659));
                this.III(i_0o);
                this.var_I_0o_III = i_0o;
            } else {
                this.I0lo = -1;
                if (i_0o != null) {
                    I_Ol.II__(I1_I.IllI("\u8314\u83f4\u83d5\u83a1\u83d7\u8465\u8450\u8438\u8416\u84f1\u84c5\u84f0\u849c\u8565\u8544\u8520\u8507", 33659));
                    if (this.var_I_0o_III != i_0o) {
                        I_0_.II().IIo(i_0o.II.IlIO);
                        this.I01o();
                    }
                    if (Ilol.Ilol_II().var_Ilol_IIIl == null && Ilol.Ilol_II().IIOo()) {
                        I_Ol.II__(I1_I.IllI("\u8309\u83ff\u83cd\u83ad\u8385\u8478\u8415\u843b\u8453\u84f6\u84d0\u84a9", 33659));
                        return;
                    }
                    if (Ilol.Ilol_II().II00()) {
                        this.II(true, true);
                    }
                    this.var_I_0o_III = i_0o;
                }
            }
        }
    }

    private void III(I_0o i_0o, boolean bl) {
        if (IOlO.l1oI != 112 && IOlO.l1oI != 113 || Ilol.Ilol_II().var_byte_III0 != 0) {
            if (Ilol.Ilol_II().IIOO()) {
                this.III(i_0o);
            } else {
                this.I0lo = -1;
                if (i_0o != null) {
                    I_0_.II().IIo(i_0o.II.IlIO);
                    this.I01o();
                    Ilol.Ilol_II().var_I_0o_II = i_0o;
                    this.II(bl, true);
                }
            }
        }
    }

    private void III(I_0o i_0o) {
        if ((IOlO.l1oI != 112 && IOlO.l1oI != 113 || Ilol.Ilol_II().var_byte_III0 != 0) && this.II0I()) {
            this.I0lo = -1;
            if (i_0o != null) {
                I_0_.II().IIo(i_0o.II.IlIO);
                this.I01o();
                Ilol.Ilol_II().var_I_0o_II = i_0o;
                Ilol.Ilol_II();
                Ilol.IO0o();
                Ilol.Ilol_II();
                this.Io0_ = 0;
            }
        }
    }

    public static void I0_1() {
        for (int i = 0; i < Ilol.Ilol_II().var_I_lO_IIlI.size() - 1; ++i) {
            I_0o i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(i);
            for (int j = i + 1; j < Ilol.Ilol_II().var_I_lO_IIlI.size(); ++j) {
                I_0o i_0o2 = (I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt(j);
                if (i_0o2.II.IlIO >= i_0o.II.IlIO) continue;
                I_0o i_0o3 = i_0o2;
                i_0o2 = i_0o;
                i_0o = i_0o3;
                Ilol.Ilol_II().var_I_lO_IIlI.setElementAt(i_0o3, i);
                Ilol.Ilol_II().var_I_lO_IIlI.setElementAt(i_0o2, j);
            }
        }
    }

    @Override
    public void void_IIlO() {
        int n;
        int n2;
        if (II.var_int_IIIO % 100 == 0 && IOlO.l1oI == 137) {
            lII1 = 30;
        }
        I1_I i1_I = this;
        if (this.lI_0 != 0) {
            var_long_IloI = System.currentTimeMillis();
            if (var_long_IloI - var_long_Ilo > 1000L) {
                var_long_Ilo = System.currentTimeMillis();
                ++lII;
            }
            if (lII > 20) {
                for (n2 = 0; n2 < i1_I.I1.length; ++n2) {
                    i1_I.I1I[n2] = i1_I.I1[n2];
                }
                --i1_I.lI_0;
                if (i1_I.lI_0 == 0) {
                    i1_I.var_java_lang_String_IlIl = "";
                    var_I1Oo_II.IIII(i1_I.II0l, 0);
                    lII = 0;
                }
            } else if (this.lI_O > this.I1.length - 1) {
                --this.lI_0;
                if (this.lI_0 == 0) {
                    this.var_java_lang_String_IlIl = "";
                    var_I1Oo_II.IIII(this.II0l, 0);
                }
            } else {
                if (this.lI_O < this.I1I.length) {
                    if (this.I1II[this.lI_O] == 15) {
                        if (this.I1I[this.lI_O] == this.I1[this.lI_O] - 1) {
                            this.I1I1[this.lI_O] = 10;
                        }
                        if (this.I1I[this.lI_O] == this.I1[this.lI_O]) {
                            this.I1II[this.lI_O] = -1;
                            ++this.lI_O;
                        }
                    } else if (II.var_int_IIIO % 5 == 0) {
                        int n3 = this.lI_O;
                        int n4 = this.I1II[n3];
                        this.I1II[n3] = n4 + 1;
                        n = n4;
                    }
                }
                for (n2 = 0; n2 < i1_I.I1.length; ++n2) {
                    if (i1_I.I1II[n2] == -1) continue;
                    int n5 = n2;
                    i1_I.I1Il[n5] = i1_I.I1Il[n5] + 1;
                    if (i1_I.I1Il[n2] <= i1_I.I1II[n2] + i1_I.I1I1[n2]) continue;
                    i1_I.I1Il[n2] = 0;
                    int n6 = n2;
                    int n7 = i1_I.I1I[n6];
                    i1_I.I1I[n6] = n7 + 1;
                    n = n7;
                    if (i1_I.I1I[n2] < 10) continue;
                    i1_I.I1I[n2] = 0;
                }
            }
        }
        ++this.IoO_;
        if (this.IoO_ == 100) {
            this.IoO_ = 0;
        }
        try {
            int[] nArray;
            int n8;
            if (I1o_.IO0_) {
                I1o_.IO0_ = false;
            }
            if (I1Oo == 1) {
                var_long_Il00 = System.currentTimeMillis();
            }
            if (I1Oo == 100) {
                I1Oo = 0;
                var_long_Il0o = System.currentTimeMillis();
                n8 = (int)(var_long_Il0o - var_long_Il00) / 1000;
                I_0_.II().II00(n8);
            }
            if (Ioll > 0 && --Ioll == 0) {
                I1I1.I___ = false;
            }
            if (!I_1o) {
                if (Io1 != Io10 || Io1I != Io1o) {
                    Io1_ = Io10 - Io1 << 2;
                    Io1O = Io1o - Io1I << 2;
                    Io1l &= 0xF;
                    Io1I += (Io11 += Io1O) >> 4;
                    Io11 &= 0xF;
                    if ((Io1 += (Io1l += Io1_) >> 4) < 24) {
                        Io1 = 24;
                    }
                    if (Io1 > Io_) {
                        Io1 = Io_;
                    }
                    if (Io1I < 0) {
                        Io1I = 0;
                    }
                    if (Io1I > Io_I) {
                        Io1I = Io_I;
                    }
                }
                if ((Io_l = Io1 / IOlO.IlI0 - 1) < 0) {
                    Io_l = 0;
                }
                Io_1 = Io1I / IOlO.IlI0;
                Io__ = Io_l + Iol1;
                Io_O = Io_1 + Iol_;
                if (Io_1 < 0) {
                    Io_1 = 0;
                }
                if (Io_O > IOlO.l10O - 1) {
                    Io_O = IOlO.l10O - 1;
                }
                if ((IOlO.I1_O = (Ilol.Ilol_II().I_o_ - 2 * var_int_I_0) / IOlO.IlI0) < 0) {
                    IOlO.I1_O = 0;
                }
                if ((IOlO.I1_0 = IOlO.I1_O + IOlO.I1OI) > IOlO.l10_) {
                    IOlO.I1_0 = IOlO.l10_;
                    IOlO.I1_O = IOlO.I1_0 - IOlO.I1OI;
                }
                if ((IOlO.I1_o = (Ilol.Ilol_II().I_oO - 2 * var_int_IIO) / IOlO.IlI0) < 0) {
                    IOlO.I1_o = 0;
                }
                if ((IOlO.I1O = IOlO.I1_o + IOlO.I1Ol) > IOlO.l10O) {
                    IOlO.I1O = IOlO.l10O;
                    IOlO.I1_o = IOlO.I1O - IOlO.I1Ol;
                }
                var_I_O__IIII.IOlI();
                var_I_O__III.IOlI();
            }
            Ilo_.II().III();
            for (n8 = 0; n8 < var_I_lO_II_O.size(); ++n8) {
                ((Ilol)var_I_lO_II_O.elementAt(n8)).IIl1();
            }
            for (n8 = 0; n8 < IOl1.IlI1.size(); ++n8) {
                ((IOl1)IOl1.IlI1.elementAt(n8)).IIl1();
            }
            Ilol.Ilol_II().IIl1();
            if (Ilol.Ilol_II().IOIl == 1 && II.var_int_IIIO % 100 == 0) {
                System.gc();
            }
            if (this.var_I__0_II != null) {
                this.var_I__0_II.IIl1();
            }
            I1lI.IIl1();
            for (n8 = 0; n8 < var_I_lO_IIO.size(); ++n8) {
                ((I_I_)var_I_lO_IIO.elementAt(n8)).IIlO();
            }
            for (n8 = 0; n8 < var_I_lO_IIOI.size(); ++n8) {
                ((I_11)var_I_lO_IIOI.elementAt(n8)).IIl1();
            }
            this.I0l0 = var_I_0o_arr_IIII.length;
            for (n8 = var_I_0o_arr_IIII.length - 1; n8 >= 0; --n8) {
                if (var_I_0o_arr_IIII[n8] != null) {
                    this.I0l0 = n8 + 1;
                    break;
                }
                --this.I0l0;
            }
            if (this.I0l0 == 1 && II.var_boolean_IIIl) {
                lIlO = -200;
            } else if (lIlO < 0) {
                I1_I.I010();
            }
            II.II_II().IIIo();
            for (n8 = 0; n8 < 5; ++n8) {
                if (var_int_arr_Ilo[n8] == -1) continue;
                if (var_int_arr_Ilo[n8] > var_int_arr_Il0O[n8]) {
                    int n9 = n8;
                    var_int_arr_Ilol[n9] = var_int_arr_Ilol[n9] + 1;
                    if (var_int_arr_Ilol[n8] != 25) continue;
                    I1_I.var_int_arr_Ilol[n8] = 0;
                    I1_I.var_int_arr_Ilo[n8] = -1;
                    I1_I.var_int_arr_Il0O[n8] = 0;
                    I1_I.var_int_arr_Il00[n8] = 0;
                    I1_I.var_int_arr_Il01[n8] = 0;
                    continue;
                }
                nArray = var_int_arr_Ilo;
                int n10 = n8;
                nArray[n10] = nArray[n10] + I_Ol.II1(var_int_arr_Il0o[n8]);
                nArray = var_int_arr_Il01;
                int n11 = n8;
                nArray[n11] = nArray[n11] + var_int_arr_Il00[n8];
                nArray = var_int_arr_Il0_;
                int n12 = n8;
                nArray[n12] = nArray[n12] + var_int_arr_Il0o[n8];
            }
            I__O.IOlI();
            for (n8 = 0; n8 < 2; ++n8) {
                if (IloO[n8] == -1) continue;
                int n13 = n8;
                int n14 = IloO[n13];
                IloO[n13] = n14 + 1;
                n = n14;
                nArray = var_int_arr_Ilo1;
                int n15 = n8;
                nArray[n15] = nArray[n15] + (Iloo[n8] << 2);
                int n16 = n8;
                int n17 = Ilo_[n16];
                Ilo_[n16] = n17 - 1;
                n = n17;
                if (IloO[n8] >= 6) {
                    I1_I.IloO[n8] = -1;
                    continue;
                }
                I1_I.Ilo0[n8] = (IloO[n8] >> 1) % 3;
            }
            if (lI_l != lI_1) {
                lI__ = lI_1 - lI_l << 2;
                lI_l += (I001 += lI__) >> 4;
                I001 &= 0xF;
            }
            if (Math.abs(lI_1 - lI_l) < 15 && lI_l < 0) {
                lI_1 = 0;
            }
            if (Math.abs(lI_1 - lI_l) < 15 && lI_l > 0) {
                lI_1 = 0;
            }
            if (this.I01_ > 0) {
                --this.I01_;
            }
            if (this.IOl0) {
                this.IOl0 = false;
                I1_O i1_O = this.II(this.IOol, this.IOo_);
                if (i1_O == null || i1_O != null && i1_O.equals(Ilol.Ilol_II().var_I_11_II) && IOlO.l1oI == 51) {
                    I_0.III(134, this.IOol, this.IOo_ + II.II10 / 2, 3);
                }
            }
            for (n8 = 0; n8 < var_I_lO_II_0.size(); ++n8) {
                ((I10_)var_I_lO_II_0.elementAt(n8)).IIl1();
            }
            for (n8 = I1l1.II1O.size() - 1; n8 >= 0; --n8) {
                I1l1.II1_.removeElement(I1l1.II1O.elementAt(n8));
                I1l1.II1O.removeElementAt(n8);
            }
            for (n8 = 0; n8 < I1l1.II1_.size(); ++n8) {
                ((I1l1)I1l1.II1_.elementAt(n8)).IIlO();
            }
            for (n8 = 0; n8 < I1l1.II10.size(); ++n8) {
                ((I1l1)I1l1.II10.elementAt(n8)).IIlO();
            }
            for (n8 = 0; n8 < I1l1.II1o.size(); ++n8) {
                ((I1l1)I1l1.II1o.elementAt(n8)).IIlO();
            }
            for (n8 = 0; n8 < I1l1.II_.size(); ++n8) {
                ((I1l1)I1l1.II_.elementAt(n8)).IIlO();
            }
            for (n8 = 0; n8 < I1l1.II11.size(); ++n8) {
                ((I1l1)I1l1.II11.elementAt(n8)).IIlO();
            }
            Il0O.III();
            var_I1Oo_II.IIlO();
            var_I1Oo_III.IIlO();
            if (var_Ilol_IIlI != null && !var_Ilol_IIlI.equals(Ilol.Ilol_II())) {
                var_Ilol_IIlI.IIl1();
            }
            ++this.lIII;
            if (this.lIII > 3) {
                this.lIII = 0;
            }
            if (this.IO_0) {
                ++this.lI1l;
                if (this.lI1l == 20) {
                    this.lI1l = 0;
                    this.IO_0 = false;
                }
            } else if (this.lI1I > Ilol.Ilol_II().IOl_) {
                n2 = this.lI1I - Ilol.Ilol_II().IOl_ >> 1;
                if (n2 <= 0) {
                    n2 = 1;
                }
                this.lI1I -= n2;
            } else {
                this.lI1I = Ilol.Ilol_II().IOl_;
            }
            if (this.IO_O) {
                ++this.lI1;
                if (this.lI1 == 20) {
                    this.lI1 = 0;
                    this.IO_O = false;
                }
            } else if (this.lIlo > Ilol.Ilol_II().IOl1) {
                n2 = this.lIlo - Ilol.Ilol_II().IOl1 >> 1;
                if (n2 <= 0) {
                    n2 = 1;
                }
                this.lIlo -= n2;
            } else {
                this.lIlo = Ilol.Ilol_II().IOl1;
            }
            if (this.IoOI > 0) {
                --this.IoOI;
            }
            if (this.IO1_) {
                ++this.Io00;
                boolean bl = false;
                for (int i = 0; i < I1lI.IIIO.size(); ++i) {
                    if (((I1ll)I1lI.IIIO.elementAt((int)i)).II0I != 20) continue;
                    bl = true;
                }
                if (this.Io00 > 3 && !bl || this.Io00 > 240) {
                    this.IO1_ = false;
                    this.IIl1(this.Io0o, this.Ioo);
                }
            }
            if (this.IIo1() || this.IO1O) {
                while (this.Ioo1 - 100 < Io1I) {
                    --Io1I;
                }
            }
            for (n8 = 0; n8 < Ilol.var_java_util_Vector_II.size(); ++n8) {
                ((I1ol)Ilol.var_java_util_Vector_II.elementAt(n8)).IIlO();
            }
            for (n8 = 0; n8 < var_I_lO_IIO1.size(); ++n8) {
                ((I1ol)var_I_lO_IIO1.elementAt(n8)).IIlO();
            }
            if (this.IOOl) {
                this.lI_o -= 2;
                if (this.lI_o < -this.lIO) {
                    this.lI_o = II.var_int_IIl;
                    var_java_util_Vector_IIIl.removeElementAt(0);
                    if (var_java_util_Vector_IIIl.size() == 0) {
                        this.IOOI = false;
                        this.IOOl = false;
                    } else {
                        this.lIO = IO1I.IIII.IIII((String)var_java_util_Vector_IIIl.elementAt(0));
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (II.var_int_IIIO % 4000 == 1000) {
            I1O1.II(I1O1.III1, 10);
        }
        I11.IIl1();
    }

    public final boolean IIo1() {
        return this.IO1o;
    }

    private static void III(IO1l iO1l) {
        if (!IIoo.II1l()) {
            int n;
            for (n = 0; n < I1l1.II1_.size(); ++n) {
                I1l1 i1l1 = (I1l1)I1l1.II1_.elementAt(n);
                if (i1l1 == null || i1l1 instanceof Ilo1) continue;
                i1l1.III_(iO1l);
            }
            if (!II.var_boolean_II) {
                for (n = 0; n < I1l1.II1o.size(); ++n) {
                    ((I1l1)I1l1.II1o.elementAt(n)).III_(iO1l);
                }
            }
            for (n = 0; n < I1l1.II10.size(); ++n) {
                ((I1l1)I1l1.II10.elementAt(n)).III_(iO1l);
            }
        }
    }

    public static void III(IO1l iO1l, int n) {
        if (!IIoo.II1l()) {
            int n2;
            for (n2 = 0; n2 < IOlO.IlIO.size(); ++n2) {
                Il0o il0o = (Il0o)IOlO.IlIO.elementAt(n2);
                if (il0o.var_short_IIII == -1 || il0o.var_byte_III != n) continue;
                il0o.II(iO1l);
            }
            if (IOlO.l1oI == 48 && n == 3 && II.var_int_arr_II != null && II.var_int_arr_II[0] != 0) {
                for (n2 = 0; n2 < IOlO.l100 / II.var_int_arr_II[0] + 1; ++n2) {
                    iO1l.II(II.var_javax_microedition_lcdui_Image_arr_II[0], n2 * II.var_int_arr_II[0], IOlO.l10o - II.var_int_arr_III[0] - 70, 0);
                }
            }
        }
    }

    public static void IIIl(IO1l iO1l) {
        if (!II.var_boolean_II) {
            iO1l.II(Il10, 0, 0, II.var_int_IIl, II.var_int_IIlI);
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        IoOO = 0;
        if (IO__) {
            int n;
            int n2;
            Object object;
            I_11 i_11;
            Ilol ilol;
            int n3;
            int n4;
            if (this.IO1 || this.IO1I && Ilo1.var_Ilo1_III == null) {
                ++this.Io0O;
                if (this.Io0O < 30 && this.Io0O >= 0 && II.var_int_IIIO % 4 == 0 || this.Io0O >= 30 && this.Io0O <= 50 && II.var_int_IIIO % 3 == 0 || this.Io0O > 50) {
                    // empty if block
                }
            }
            II.III1(iO1l);
            if (IO10.l_lI == 5) {
                if (Il_o != null) {
                    iO1l.Illl(0xFFFFFF);
                    iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
                    iO1l.II(Il_o, II.var_int_IIl / 2, II.var_int_IIlI / 2, 3);
                } else {
                    n4 = IOlO.l1o1 % 2 == 0 ? 2 : 1;
                    Il_o = IO10.IIII(I1_I.IllI("\u8354\u83f8\u83de\u83f7\u8395\u8471\u846a\u843d\u841c\u84e1\u84ee", 33659) + n4 + I1_I.IllI("\u8355\u83ea\u83d7\u83bf", 33659));
                }
            }
            if ((this.IO1l || this.IOOI) && IOlO.l1o1 != 3) {
                I1_I.IIIl(iO1l);
            }
            if (lII1 > 0) {
                iO1l.IIl0(-Io1 + IlOo[lII1 % IlOo.length], -Io1I + var_int_arr_Il0[lII1 % var_int_arr_Il0.length]);
                --lII1;
            } else {
                iO1l.IIl0(-Io1, -Io1I);
            }
            if (this.IO10) {
                n4 = II.var_int_IIIO % 3 == 0 ? 3 : -3;
                iO1l.IIl0(n4, 0);
            }
            Il0O.II1I(iO1l);
            I1lI.II(iO1l);
            if (!IIoo.II1l()) {
                IOlO.IIIo(iO1l);
                IOlO.IIo(iO1l);
            }
            if (!IIoo.II1l()) {
                for (n3 = 0; n3 < var_I_lO_II_O.size(); ++n3) {
                    ilol = (Ilol)var_I_lO_II_O.elementAt(n3);
                    if (!ilol.I1oO || IOlO.l1oI != 128) continue;
                    ilol.IIII(iO1l, ilol.I_o_, ilol.I_oO, 0);
                }
            }
            if (Ilol.Ilol_II().I1oO && IOlO.l1oI == 128) {
                Ilol.Ilol_II().IIII(iO1l, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, 0);
            }
            I1_I.III(iO1l, 2);
            if (Ilol.Ilol_II().var_I1Il_II != null && II.var_boolean_IIIl && !IIoo.III(this, iO1l)) {
                if (IO1_.l_l == 20) {
                    iO1l.II(IIo1, Ilol.Ilol_II().var_I1Il_II.I1 + Io1, Ilol.Ilol_II().var_I1Il_II.I1I + Io1I, 3);
                } else {
                    iO1l.II(IIol, Ilol.Ilol_II().var_I1Il_II.I1 + Io1, Ilol.Ilol_II().var_I1Il_II.I1I + Io1I, 3);
                }
            }
            Il0O.II1l(iO1l);
            I11.II.II(iO1l);
            for (n3 = 0; n3 < I1l1.II_.size(); ++n3) {
                ((I1l1)I1l1.II_.elementAt(n3)).III_(iO1l);
            }
            for (n3 = 0; n3 < IOl1.IlI1.size(); ++n3) {
                ((IOl1)IOl1.IlI1.elementAt(n3)).II(iO1l);
            }
            if (!IIoo.II1l()) {
                for (n3 = 0; n3 < var_I_lO_IIOI.size(); ++n3) {
                    i_11 = (I_11)var_I_lO_IIOI.elementAt(n3);
                    if (i_11.IOl_ <= 0) continue;
                    i_11.II1I(iO1l);
                }
            }
            for (n3 = 0; n3 < var_I_lO_IIOI.size(); ++n3) {
                ((I_11)var_I_lO_IIOI.elementAt(n3)).II(iO1l);
            }
            iO1l.IIl0(0, II.II10);
            if (!IIoo.II1l()) {
                for (n3 = 0; n3 < var_I_lO_II_O.size(); ++n3) {
                    ilol = null;
                    try {
                        ilol = (Ilol)var_I_lO_II_O.elementAt(n3);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (ilol == null || II.var_I_1o_II.I_10 && II.var_I_1o_II.IlIl() || !ilol.I1__) continue;
                    ilol.II1I(iO1l);
                }
            }
            if (!IIoo.II1l()) {
                Ilol.Ilol_II().II1I(iO1l);
                I1lI.IIIl(iO1l);
            } else {
                IIoo.IIIo(iO1l);
            }
            for (n3 = 0; n3 < var_I_lO_IIO.size(); ++n3) {
                ((I_I_)var_I_lO_IIO.elementAt(n3)).II(iO1l);
            }
            for (n3 = 0; n3 < IOl1.IlI1.size(); ++n3) {
                ((IOl1)IOl1.IlI1.elementAt(n3)).IIIl(iO1l);
            }
            for (n3 = 0; n3 < var_I_lO_II_O.size(); ++n3) {
                ilol = null;
                try {
                    ilol = (Ilol)var_I_lO_II_O.elementAt(n3);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (ilol == null || II.var_I_1o_II.I_10 && II.var_I_1o_II.IlIl()) continue;
                ilol.II(iO1l);
            }
            Ilol.Ilol_II().II(iO1l);
            if (Ilol.Ilol_II().var_I_ol_II != null && Ilol.Ilol_II().I_o_arr_II() != null && Ilol.Ilol_II().I0I0 < Ilol.Ilol_II().I_o_arr_II().length) {
                Ilol.Ilol_II().III(iO1l);
                Ilol.Ilol_II().IIIl(iO1l);
            }
            for (n3 = 0; n3 < var_I_lO_II_O.size(); ++n3) {
                ilol = null;
                try {
                    ilol = (Ilol)var_I_lO_II_O.elementAt(n3);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (ilol == null || II.var_I_1o_II.I_10 && II.var_I_1o_II.IlIl() || ilol.var_I_ol_II == null || ilol.I_o_arr_II() == null || ilol.I0I0 >= ilol.I_o_arr_II().length) continue;
                ilol.III(iO1l);
                ilol.IIIl(iO1l);
            }
            for (n3 = 0; n3 < var_I_lO_II_0.size(); ++n3) {
                ((I10_)var_I_lO_II_0.elementAt(n3)).III_(iO1l);
            }
            iO1l.IIl0(0, -II.II10);
            I1_I.II1_(iO1l);
            I1_I.III(iO1l);
            I1_I.III(iO1l, 3);
            for (n3 = 0; n3 < var_I_lO_IIOI.size(); ++n3) {
                ((I_11)var_I_lO_IIOI.elementAt(n3)).IIII(iO1l);
            }
            I1lI.II1I(iO1l);
            for (n3 = 0; n3 < var_I_lO_IIOI.size(); ++n3) {
                i_11 = (I_11)var_I_lO_IIOI.elementAt(n3);
                if (i_11 == null || i_11.var_I_1__II == null) continue;
                ((I1O_)((Object)i_11.var_I_1__II)).III(iO1l, i_11.I_o_, i_11.I_oO - i_11.IO11 - II.II10, i_11.IOI1);
            }
            for (n3 = 0; n3 < var_I_lO_II_O.size(); ++n3) {
                ilol = null;
                try {
                    ilol = (Ilol)var_I_lO_II_O.elementAt(n3);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (ilol == null || ilol.var_I1O__II == null) continue;
                ilol.var_I1O__II.III(iO1l, ilol.I_o_, ilol.I_oO - ilol.IO11, ilol.IOI1);
            }
            for (n3 = 0; n3 < var_I_lO_IIO.size(); ++n3) {
                object = (I_I_)var_I_lO_IIO.elementAt(n3);
                if (object == null || ((I_I_)object).var_I1O__II == null) continue;
                ((I_I_)object).var_I1O__II.III(iO1l, ((I_I_)object).I1, ((I_I_)object).I1I - 50, ((I_I_)object).llI_);
            }
            if (Ilol.Ilol_II().var_I1O__II != null) {
                Ilol.Ilol_II().var_I1O__II.III(iO1l, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11, Ilol.Ilol_II().IOI1);
            }
            I11.IIII.II(iO1l);
            I11.III.II(iO1l);
            Il0O.III(iO1l);
            if (!IIoo.II1l()) {
                for (n4 = 0; n4 < IOlO.IlIO.size(); ++n4) {
                    object = (Il0o)IOlO.IlIO.elementAt(n4);
                    if (((Il0o)object).var_short_IIII == -1 || ((Il0o)object).var_byte_III <= 3) continue;
                    ((Il0o)object).II(iO1l);
                }
            }
            I__O.II(iO1l);
            if (IOlO.l1oI == 120) {
                if (this.var_byte_IIO != 100) {
                    n4 = this.var_byte_IIO * IO1l.II(Il1) / 100;
                    iO1l.II(Il1, IOlO.l100 / 2 - IO1l.II(Il1) / 2, 220, 0);
                    iO1l.IIIO(IOlO.l100 / 2 - IO1l.II(Il1) / 2, 220, n4, 10);
                    iO1l.II(IllO, IOlO.l100 / 2 - IO1l.II(Il1) / 2, 220, 0);
                    iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
                }
                if (this.IOO1) {
                    ++this.lIOI;
                    if (II.var_int_IIIO % 3 == 0) {
                        I1lI.III(new I1ll(19, I_Ol.III_(IOlO.l100 / 2 - 50, IOlO.l100 / 2 + 50), 340, 2, 1, -1));
                    }
                    if (II.var_int_IIIO % 15 == 0) {
                        I1lI.III(new I1ll(18, I_Ol.III_(IOlO.l100 / 2 - 5, IOlO.l100 / 2 + 5), I_Ol.III_(300, 320), 2, 1, -1));
                    }
                    if (this.lIOI == 100) {
                        this.IIl(IOlO.l100 / 2, 300);
                    }
                    if (this.lIOI == 110) {
                        this.lIOI = 0;
                        this.IOO1 = false;
                    }
                }
            }
            Il0O.II(iO1l);
            boolean bl = true;
            for (n3 = 0; n3 < Il0O.var_I_lO_IIIO.size(); ++n3) {
                if (((Il0O)Il0O.var_I_lO_IIIO.elementAt((int)n3)).I_O0 != 0) continue;
                bl = false;
                break;
            }
            if (IO1l.l_I0 <= 1) {
                bl = false;
            }
            if (bl && !this.IO1l) {
                n2 = IOlO.l100 / (IO1l.II(IOlO.var_javax_microedition_lcdui_Image_IIl_) + 50);
                if (n2 <= 0) {
                    n2 = 1;
                }
                if (IOlO.l1o != 28) {
                    for (n3 = 0; n3 < n2; ++n3) {
                        n = 100 + n3 * (IO1l.II(IOlO.var_javax_microedition_lcdui_Image_IIl_) + 50) - Io1 / 2;
                        if (n + (n4 = IO1l.II(IOlO.var_javax_microedition_lcdui_Image_IIl_)) < Io1 || n > Io1 + II.var_int_IIl || -20 + IO1l.III(IOlO.var_javax_microedition_lcdui_Image_IIl_) < Io1I || -20 > Io1I + II.var_int_IIlI) continue;
                        iO1l.II(IOlO.var_javax_microedition_lcdui_Image_IIl_, 100 + n3 * (IO1l.II(IOlO.var_javax_microedition_lcdui_Image_IIl_) + 50) - Io1 / 2, -20, 0);
                    }
                }
            }
            IO10.II(iO1l);
            I1_I.II1l(iO1l);
            if (!I_1o && lIIl == 1 && !II.var_I_1o_II.I_10) {
                this.II1(iO1l);
            }
            I1_I.II1I(iO1l);
            I1_I.II1O(iO1l);
            if (!I_1o) {
                Object object2;
                int n5;
                Object object3;
                iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
                if ((IOlO.l1oI == 128 || IOlO.l1oI == 127) && var_byte_IIOI != 0) {
                    iO1l.Illl(0);
                    iO1l.III_(3, 88, 54, 8);
                    iO1l.Illl(0xFF0000);
                    iO1l.IIIO(5, 90, var_byte_IIOI, 4);
                    iO1l.III_(5, 90, 50, 4);
                    iO1l.IIIO(0, 0, 3000, 3000);
                    IO1I.IIII.II(iO1l, I1_I.IllI("\u8336\u83fb\u83db\u83ad", 33659), 30, 98, 2, IO1I.III_);
                }
                if (Ilol.Ilol_II().I_lI) {
                    ++Ilol.Ilol_II().I0O1;
                    if (II.var_int_IIIO % 3 == 0) {
                        iO1l.Illl(0xFFFFFF);
                        iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
                    }
                    if (Ilol.Ilol_II().I0O1 >= 100) {
                        Ilol.Ilol_II().I0I0();
                    }
                }
                for (n3 = 0; n3 < var_I_lO_II_O.size(); ++n3) {
                    object3 = null;
                    try {
                        object3 = (Ilol)var_I_lO_II_O.elementAt(n3);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (object3 == null || !((Ilol)object3).I_lI || !Ilol.III_((Ilol)object3)) continue;
                    ++((Ilol)object3).I0O1;
                    if (II.var_int_IIIO % 3 == 0) {
                        iO1l.Illl(0xFFFFFF);
                        iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
                    }
                    if (((Ilol)object3).I0O1 < 100) continue;
                    ((Ilol)object3).I0I0();
                }
                IlI.III().III_(iO1l);
                I1_I.II1I(iO1l);
                this.II11(iO1l);
                I1_I.II1I(iO1l);
                if (II.var_boolean_IIIl && II.var_boolean_III1 && !this.IIoO()) {
                    I1_I.II1I(iO1l);
                    if (!(IOlO.IllI() || this.IIo_() || IIoo.IIII(this, iO1l))) {
                        if (IO1_.l_l == 15) {
                            iO1l.II(IIo1, lIIO + 17, lII0 + 17, 3);
                        } else {
                            iO1l.II(IIol, lIIO + 17, lII0 + 17, 3);
                        }
                    }
                }
                I1_I.II1I(iO1l);
                if (var_java_util_Vector_IIIl.size() != 0 && IOO_) {
                    iO1l.IIIO(0, II.var_int_IIlI - 13, II.var_int_IIl, 15);
                    iO1l.III(0, II.var_int_IIlI - 13, II.var_int_IIl, 15, 0);
                    object3 = (String)var_java_util_Vector_IIIl.elementAt(0);
                    IO1I.III1.II(iO1l, (String)object3, this.lI_o, II.var_int_IIlI - 12, 0);
                }
                if (!II.var_I_1o_II.I_10 && II.var_I1l_II == null && Ilo1.var_Ilo1_III == null && Ilo1.var_Ilo1_IIII == null && II.var_IO1__II.equals(var_I1_I_II)) {
                    super.III_(iO1l);
                }
                I1_I.II1I(iO1l);
                n2 = 100 + (Ilol.var_java_util_Vector_II.size() != 0 ? var_I_lO_IIO1.size() * 12 : 0);
                if (Ilol.Ilol_II().var_Ilo0_II != null) {
                    n = 0;
                    int n6 = 0;
                    n4 = (II.var_int_IIlI - 100 - 60) / 12;
                    for (n3 = 0; n3 < var_I_lO_II_O.size(); ++n3) {
                        Ilol ilol2 = (Ilol)var_I_lO_II_O.elementAt(n3);
                        if (ilol2.IO1I == -1 || ilol2.IO1I != Ilol.Ilol_II().var_Ilo0_II.II0I) continue;
                        if (ilol2.II0I() && ilol2.I_o_ < Ilol.Ilol_II().I_o_) {
                            n5 = n4;
                            if (Ilol.var_java_util_Vector_II.size() != 0) {
                                n5 = n4 - var_I_lO_IIO1.size();
                            }
                            if (n > n5) continue;
                            IO1I.II1.II(iO1l, ilol2.IIO1, 20, n2 - 12 + n * 12, 0, IO1I.IIlO);
                            ilol2.III(iO1l, 10, n2 + n * 12 - 5);
                            ++n;
                            continue;
                        }
                        if (!ilol2.II0I() || ilol2.I_o_ <= Ilol.Ilol_II().I_o_ || n6 > n4) continue;
                        IO1I.II1.II(iO1l, ilol2.IIO1, II.var_int_IIl - 25, n2 - 12 + n6 * 12, 1, IO1I.IIlO);
                        ilol2.III(iO1l, II.var_int_IIl - 15, n2 + n6 * 12 - 5);
                        ++n6;
                    }
                }
                Ilo_.II().II(iO1l);
                if (IOlo && !II.var_I_1o_II.I_10 && II.var_int_IIIO % 4 == 0) {
                    iO1l.II(I10_.IlOI, this.var_I1Il_IIll.I1 + 15, this.var_I1Il_IIll.I1I + 30, 33);
                }
                if (this.IO10) {
                    this.I0ll += 5;
                    if (this.I0Io >= 0) {
                        this.I0Io += this.I0ll;
                    }
                    if (this.I0Io < 0) {
                        --this.I0Io;
                        if (this.I0Io == -20) {
                            this.IO10 = false;
                            this.I0Io = 0;
                            this.I0ll = 0;
                        }
                    } else if ((this.I0l - this.I0Io > 0 || this.I0Io < IOlO.l100) && this.I0Io > 0) {
                        iO1l.Illl(0xFFFFFF);
                        if (!II.var_boolean_II && IO10.l_lI != 3 && IO10.l_lI != 5) {
                            iO1l.II(this.I0l - this.I0Io, this.I0lI - this.I0Io, 2 * this.I0Io, 2 * this.I0Io, 0, 360);
                        } else {
                            iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
                        }
                    } else {
                        this.I0Io = -1;
                    }
                }
                for (n3 = 0; n3 < Ilol.var_java_util_Vector_II.size(); ++n3) {
                    I1ol i1ol = (I1ol)Ilol.var_java_util_Vector_II.elementAt(n3);
                    int n7 = this.var_I1Il_IIll.I1 + 32 + n3 * 24;
                    n5 = 1;
                    I_oo.IIII(iO1l, i1ol.II_o, n7, 55, 0, 3);
                    object2 = i1ol.I_Oo + I1_I.IllI("\u835c", 33659);
                    if (i1ol.I_Oo == 0) {
                        object2 = i1ol.I_O0 + I1_I.IllI("\u8308", 33659);
                    }
                    IO1I.IIII.II(iO1l, (String)object2, n7, 70, 2, IO1I.III_);
                }
                for (n3 = 0; n3 < var_I_lO_IIO1.size(); ++n3) {
                    ((I1ol)var_I_lO_IIO1.elementAt(n3)).IIIl(iO1l, this.var_I1Il_IIll.I1 + (Ilol.var_java_util_Vector_II.size() != 0 ? 5 : 25), (Ilol.var_java_util_Vector_II.size() != 0 ? 90 : 45) + n3 * 12);
                }
                this.IIII(iO1l);
                if (IO11.IllI == 1) {
                    long l = IO10.IIII() - var_long_Il0l;
                    IO1I iO1I = IO1I.IIII;
                    object2 = Calendar.getInstance();
                    ((Calendar)object2).setTime(new Date(l + 25200000L));
                    n2 = ((Calendar)object2).get(11);
                    n = ((Calendar)object2).get(12);
                    iO1I.II(iO1l, n2 + I1_I.IllI("\u8313", 33659) + n + I1_I.IllI("\u8316", 33659), 10, II.var_int_IIlI - 65, 0, IO1I.III_);
                }
                if (!this.var_java_lang_String_IlIl.equals("")) {
                    for (n3 = 0; n3 < this.IIl0.length; ++n3) {
                        IO1I.IIII.II(iO1l, this.IIl0[n3], 5, 85 + n3 * 18, 0, IO1I.III_);
                    }
                }
            }
            if ((n = II.var_int_IIll) > 200) {
                n = 200;
            }
            I1_I.III(iO1l, 0 + II.var_int_IIl / 2, 0, n);
            I11.IIIl.II(iO1l);
        }
    }

    private void IIII(IO1l iO1l) {
        if (this.lI_0 != 0) {
            String string = "";
            for (int i = 0; i < this.I1.length; ++i) {
                string = string + this.I1I[i] + I1_I.IllI("\u835b", 33659);
            }
            I__O.II(iO1l, 20, 45, 95, 35, 0xFFFFFF, false);
            IO1I.III_.II(iO1l, IO11.Il0O, 68, 50, 2);
            IO1I.III_.II(iO1l, string, 68, 65, 2);
        }
    }

    public static I_11 II(short s) {
        for (int i = 0; i < var_I_lO_IIOI.size(); ++i) {
            I_11 i_11 = (I_11)var_I_lO_IIOI.elementAt(i);
            if (i_11.var_I_1__II.lll0 != s) continue;
            return i_11;
        }
        return null;
    }

    public static Ilol Ilol_II(int n) {
        for (int i = 0; i < var_I_lO_II_O.size(); ++i) {
            Ilol ilol = (Ilol)var_I_lO_II_O.elementAt(i);
            if (ilol.IOI_ != n) continue;
            return ilol;
        }
        return null;
    }

    public static I_I_ I_I__II(int n) {
        for (int i = 0; i < var_I_lO_IIO.size(); ++i) {
            I_I_ i_I_ = (I_I_)var_I_lO_IIO.elementAt(i);
            if (i_I_.lll != n) continue;
            return i_I_;
        }
        return null;
    }

    public static I_I_ II(byte by) {
        return (I_I_)var_I_lO_IIO.elementAt(by);
    }

    public static I_11 I_11_II() {
        for (int i = 0; i < var_I_lO_IIOI.size(); ++i) {
            I_11 i_11 = (I_11)var_I_lO_IIOI.elementAt(i);
            if (i_11.var_I_1__II.lll0 != I1_I.IIII()) continue;
            return i_11;
        }
        return null;
    }

    private static void II1l(IO1l iO1l) {
        try {
            byte by;
            if (Ilo1.var_Ilo1_III == null && (by = I1_I.IIII()) != -1) {
                int n;
                I_11 i_11 = null;
                for (n = 0; n < var_I_lO_IIOI.size(); ++n) {
                    I_11 i_112 = (I_11)var_I_lO_IIOI.elementAt(n);
                    if (i_112.var_I_1__II.lll0 != by) continue;
                    if (i_11 == null) {
                        i_11 = i_112;
                        continue;
                    }
                    if (I_Ol.II1(i_112.I_o_ - Ilol.Ilol_II().I_o_) >= I_Ol.II1(i_11.I_o_ - Ilol.Ilol_II().I_o_)) continue;
                    i_11 = i_112;
                }
                if (i_11 != null && i_11.IOIl != 15 && (i_11.I_o_ <= Io1 || i_11.I_o_ >= Io1 + var_int_I_0 || i_11.I_oO <= Io1I || i_11.I_oO >= Io1I + var_int_IIO) && II.var_int_IIIO % 10 >= 5) {
                    n = i_11.I_o_ - Ilol.Ilol_II().I_o_;
                    int n2 = i_11.I_oO - Ilol.Ilol_II().I_oO;
                    int n3 = 0;
                    int n4 = 0;
                    int n5 = 0;
                    if (n > 0 && n2 >= 0) {
                        if (I_Ol.II1(n) >= I_Ol.II1(n2)) {
                            n3 = var_int_I_0 - 10;
                            n4 = var_int_IIO / 2 + 30;
                            if (II.var_boolean_IIIl) {
                                n4 = var_int_IIO / 2 + 10;
                            }
                            n5 = 0;
                        } else {
                            n3 = var_int_I_0 / 2;
                            n4 = var_int_IIO - 10;
                            n5 = 5;
                        }
                    } else if (n >= 0 && n2 < 0) {
                        if (I_Ol.II1(n) >= I_Ol.II1(n2)) {
                            n3 = var_int_I_0 - 10;
                            n4 = var_int_IIO / 2 + 30;
                            if (II.var_boolean_IIIl) {
                                n4 = var_int_IIO / 2 + 10;
                            }
                            n5 = 0;
                        } else {
                            n3 = var_int_I_0 / 2;
                            n4 = 10;
                            n5 = 6;
                        }
                    }
                    if (n < 0 && n2 >= 0) {
                        if (I_Ol.II1(n) >= I_Ol.II1(n2)) {
                            n3 = 10;
                            n4 = var_int_IIO / 2 + 30;
                            if (II.var_boolean_IIIl) {
                                n4 = var_int_IIO / 2 + 10;
                            }
                            n5 = 3;
                        } else {
                            n3 = var_int_I_0 / 2;
                            n4 = var_int_IIO - 10;
                            n5 = 5;
                        }
                    } else if (n <= 0 && n2 < 0) {
                        if (I_Ol.II1(n) >= I_Ol.II1(n2)) {
                            n3 = 10;
                            n4 = var_int_IIO / 2 + 30;
                            if (II.var_boolean_IIIl) {
                                n4 = var_int_IIO / 2 + 10;
                            }
                            n5 = 3;
                        } else {
                            n3 = var_int_I_0 / 2;
                            n4 = 10;
                            n5 = 6;
                        }
                    }
                    I1_I.II1I(iO1l);
                    iO1l.II(var_javax_microedition_lcdui_Image_Il_l, 0, 0, 13, 16, n5, n3, n4, IOII.IIOI);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void II1I(IO1l iO1l) {
        iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        iO1l.IIIO(0, -200, II.var_int_IIl, 200 + II.var_int_IIlI);
    }

    private void III(IO1l iO1l, Ilol ilol) {
        int n = (int)((long)ilol.IOl_ * var_long_Il_l / (long)ilol.IOlo);
        int n2 = ilol.IOl1 * I00l;
        int n3 = (int)((long)this.lI1I * var_long_Il_l / (long)ilol.IOlo);
        int n4 = this.lIlo * I00l;
        iO1l.IIIO(II.var_int_IIl / 2 + 58 - IO1l.II(Ill1), 0, 95, 100);
        iO1l.III(Ill1, 0, 0, IO1l.II(Ill1), IO1l.III(Ill1), 2, II.var_int_IIl / 2 + 60, 0, 24);
        iO1l.IIIO((int)((long)(II.var_int_IIl / 2 + 60 - 83) - var_long_Il_l + var_long_Il_l - (long)n3), 5, n3, 10);
        iO1l.II(Il1, II.var_int_IIl / 2 + 60 - 83, 5, 24);
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
        iO1l.IIIO((int)((long)(II.var_int_IIl / 2 + 60 - 83) - var_long_Il_l + var_long_Il_l - (long)n), 5, n, 10);
        iO1l.II(IllO, II.var_int_IIl / 2 + 60 - 83, 5, 24);
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
        iO1l.IIIO((int)((long)(II.var_int_IIl / 2 + 60 - 83 - I00l) + var_long_Il_l - (long)n4), 20, n4, 6);
        iO1l.II(Il1I, II.var_int_IIl / 2 + 60 - 83, 20, 24);
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
        iO1l.IIIO((int)((long)(II.var_int_IIl / 2 + 60 - 83 - I00l) + var_long_Il_l - (long)n2), 20, n2, 6);
        iO1l.II(Ill0, II.var_int_IIl / 2 + 60 - 83, 20, 24);
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
    }

    private void II(IO1l iO1l, boolean bl, Ilol ilol) {
        if (ilol != null) {
            int n;
            int n2;
            int n3;
            if (ilol.IOI_ == Ilol.Ilol_II().IOI_) {
                n3 = (int)((long)this.lI1I * var_long_Il_l / (long)ilol.IOlo);
                n2 = this.lIlo * I00l / ilol.IO1;
                n = (int)((long)ilol.IOl_ * var_long_Il_l / (long)ilol.IOlo);
            } else {
                n3 = (int)((long)ilol.I0OO * var_long_Il_l / (long)ilol.IOlo);
                n2 = ilol.I0O_ * I00l / 100;
                n = (int)((long)ilol.IOl_ * var_long_Il_l / (long)ilol.IOlo);
            }
            if (Ilol.Ilol_II().var_short_IIl > 0) {
                int n4 = Ilol.Ilol_II().var_short_III0 * lI1_ / Ilol.Ilol_II().var_short_IIIo;
                iO1l.II(Ill_, 58, 29, 0);
                iO1l.IIIO(83, 31, n4, 10);
                iO1l.II(Illo, 83, 31, 0);
                iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, Ilol.Ilol_II().IIOO + I1_I.IllI("\u8341", 33659) + Ilol.Ilol_II().var_short_III0 + I1_I.IllI("\u8354", 33659) + Ilol.Ilol_II().var_short_IIIo, 115, 29, 2);
            }
            if (ilol.IOI_ != Ilol.Ilol_II().IOI_) {
                iO1l.IIIO(IO1l.II(Ill1) - 95, 0, 95, 100);
            }
            iO1l.II(Ill1, 0, 0, 0);
            iO1l.IIIO(83, 5, n3, 10);
            iO1l.II(Il1, 83, 5, 0);
            iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
            iO1l.IIIO(83, 5, n, 10);
            iO1l.II(IllO, 83, 5, 0);
            iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
            iO1l.IIIO(83, 20, n2, 6);
            iO1l.II(Il1I, 83, 20, 0);
            iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
            iO1l.IIIO(83, 20, n2, 6);
            iO1l.II(Ill0, 83, 20, 0);
            iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
            if (Ilol.Ilol_II().IOl1 == 0 && II.var_int_IIIO % 10 > 5) {
                iO1l.IIIO(83, 20, 2, 6);
                iO1l.II(Il1I, 83, 20, 0);
                iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
            }
            String string = Il_o.III(Ilol.Ilol_II().IOl_);
            IO1I.var_IO1I_II1I.II(iO1l, string, 87, 5, 0, IO1I.IIlI);
            String string2 = Il_o.III(Ilol.Ilol_II().IOl1);
            IO1I.var_IO1I_II1I.II(iO1l, string2, 87, 18, 0, IO1I.IIlI);
        }
    }

    public void I0__() {
        this.var_long_Ilol = this.var_long_Ilo1 = System.currentTimeMillis();
        this.lI11 = 180;
    }

    private static Ilol IIIl() {
        for (int i = 0; i < var_I_lO_II_O.size(); ++i) {
            Ilol ilol = (Ilol)var_I_lO_II_O.elementAt(i);
            if (ilol.var_byte_III0 == 0) continue;
            return ilol;
        }
        return null;
    }

    private Ilol III1() {
        for (int i = 0; i < var_I_lO_II_O.size(); ++i) {
            Ilol ilol = (Ilol)var_I_lO_II_O.elementAt(i);
            if (ilol.var_byte_III0 == 0 || ilol == I1_I.IIIl()) continue;
            return ilol;
        }
        return null;
    }

    public static void IIO_(int n) {
        for (int i = 0; i < var_I_lO_II_O.size(); ++i) {
            if (((Ilol)I1_I.var_I_lO_II_O.elementAt((int)i)).IOI_ != n) continue;
            var_I_lO_II_O.removeElementAt(i);
            --i;
        }
    }

    private void II1(IO1l iO1l) {
        if (!Ilol.var_boolean_I10I) {
            I1_I.II1I(iO1l);
            if (IIoo.II(this, iO1l)) {
                return;
            }
            if (IOlO.l1oI == 130 && I1_I.IIIl() != null && this.III1() != null) {
                iO1l.IIl0(II.var_int_IIl / 2 - 62, 0);
                this.II(iO1l, true, I1_I.IIIl());
                iO1l.IIl0(-(II.var_int_IIl / 2 - 65), 0);
                this.III(iO1l, this.III1());
                I1_I.IIIl().IIII(iO1l, 137, 25, 0);
                this.III1().IIII(iO1l, II.var_int_IIl - 15 - 122, 25, 2);
            } else if (this.IIo_() && Ilol.Ilol_II().var_Ilol_IIIl != null) {
                iO1l.IIl0(II.var_int_IIl / 2 - 62, 0);
                this.II(iO1l, true, Ilol.Ilol_II().var_Ilol_IIIl);
                iO1l.IIl0(-(II.var_int_IIl / 2 - 65), 0);
                this.III(iO1l, Ilol.Ilol_II());
                Ilol.Ilol_II().IIII(iO1l, 137, 25, 0);
                Ilol.Ilol_II().var_Ilol_IIIl.IIII(iO1l, II.var_int_IIl - 15 - 122, 25, 2);
            } else if (I1_I.II0_() && II.var_int_IIl <= 320) {
                Ilol ilol = Ilol.Ilol_II();
                boolean bl = true;
                bl = true;
                iO1l.II(var_javax_microedition_lcdui_Image_Il_0, 1, 1, 0);
                int n = var_javax_microedition_lcdui_Image_Il_1.getWidth();
                int n2 = var_javax_microedition_lcdui_Image_Il_1.getHeight() / 2;
                int n3 = ilol.IOl_ * n / ilol.IOlo;
                if (n3 <= 0) {
                    n3 = 1;
                } else if (n3 > n) {
                    n3 = n;
                }
                iO1l.II(var_javax_microedition_lcdui_Image_Il_1, 0, n2, n3, n2, 0, 4, 20, 0);
                n3 = ilol.IOl1 * n / ilol.IO1;
                if (n3 <= 0) {
                    n3 = 1;
                } else if (n3 > n) {
                    n3 = n;
                }
                iO1l.II(var_javax_microedition_lcdui_Image_Il_1, 0, 0, n3, n2, 0, 4, 26, 0);
                n3 = 1 + var_javax_microedition_lcdui_Image_Il_0.getWidth() / 2 + 1;
                IO1I.IIl1.II(iO1l, ilol.IIO1, n3, 5, 2);
                if (ilol.var_I_I__IIII != null) {
                    if (ilol.var_I_I__IIII.I_Io_II() != null) {
                        IO1I.IIl1.II(iO1l, ilol.var_I_I__IIII.I_Io_II().II1o, n3, 33, 2);
                    }
                } else if (ilol.var_I_11_II != null) {
                    IO1I.IIl1.II(iO1l, ilol.var_I_11_II.var_I_1__II.II1o, n3, 33, 2);
                } else if (ilol.var_Ilol_IIIl != null) {
                    IO1I.IIl1.II(iO1l, ilol.var_Ilol_IIIl.IIO1, n3, 33, 2);
                }
            } else {
                this.II(iO1l, true, Ilol.Ilol_II());
                if (Ilol.Ilol_II().IO1_III() == null && Ilol.Ilol_II().IO1_IIII() == null) {
                    if (Ilol.Ilol_II().var_I_I__IIII != null) {
                        if (Ilol.Ilol_II().var_I_I__IIII.I_Io_II() != null) {
                            int n = this.lI1O / 2;
                            IO1I.IIl1.II(iO1l, Ilol.Ilol_II().var_I_I__IIII.I_Io_II().II1o, n, 9, 2);
                        }
                        if (Ilol.Ilol_II().var_I_I__IIII.I1ll != 0) {
                            IO1I.IIl1.II(iO1l, I_1l.IIIl(Ilol.Ilol_II().var_I_I__IIII.llIl), this.lI1O / 2, 22, 2);
                        }
                    } else if (Ilol.Ilol_II().var_I_11_II != null) {
                        int n = this.lI1O / 2;
                        IO1I.IIl1.II(iO1l, Ilol.Ilol_II().var_I_11_II.var_I_1__II.II1o, n, 9, 2);
                        if (Ilol.Ilol_II().var_I_11_II.var_I_1__II.lll0 == 4) {
                            IO1I.IIl1.II(iO1l, I1_I.I1_I_II().var_I1o0_II.lIoo + I1_I.IllI("\u8354", 33659) + I1_I.I1_I_II().var_I1o0_II.ll, this.lI1O / 2, 22, 2);
                        }
                    } else if (Ilol.Ilol_II().var_Ilol_IIIl != null) {
                        int n = this.lI1O / 2;
                        IO1I.IIl1.II(iO1l, Ilol.Ilol_II().var_Ilol_IIIl.IIO1, n, 9, 2);
                        IO1I.IIl1.II(iO1l, I_1l.IIIl(Ilol.Ilol_II().var_Ilol_IIIl.IOl_), this.lI1O / 2, 22, 2);
                    } else {
                        int n = this.lI1O / 2;
                        IO1I.IIl1.II(iO1l, Ilol.Ilol_II().IIO1, n, 9, 2);
                        IO1I.IIl1.II(iO1l, I_1l.IIIl(Ilol.Ilol_II().Illo), this.lI1O / 2, 22, 2);
                    }
                } else {
                    IO1I.IIl1.II(iO1l, IO11.I_l0, this.lI1O / 2, 8, 2);
                }
            }
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
            if (this.IIo_() && this.lI11 > 0) {
                this.var_long_Ilol = System.currentTimeMillis();
                if (this.var_long_Ilol - this.var_long_Ilo1 >= 1000L) {
                    this.var_long_Ilo1 = System.currentTimeMillis();
                    --this.lI11;
                }
                IO1I.IIII.II(iO1l, String.valueOf(this.lI11), II.var_int_IIl / 2, 13, 2, IO1I.III_);
            }
            if (this.IO_1) {
                iO1l.II(I10_.IlOI, 40, 35, 33);
                --this.Iooo;
                if (this.Iooo < 0) {
                    this.Iooo = 0;
                    this.IO_1 = false;
                }
            }
        }
    }

    public final boolean IIo_() {
        return IOlO.Ill() && (Ilol.Ilol_II().var_byte_III0 != 0 || IOlO.l1oI == 130 && I1_I.IIIl() != null && this.III1() != null);
    }

    public void IIOO(int n) {
        if (Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 != 0 || Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o != 0) {
            I_0_.II().IoO();
        }
        Ilol.Ilol_II().I_oo = -10;
        Ilol.Ilol_II().I_o0 = n;
        Ilol.Ilol_II().IOIl = 3;
        Ilol.Ilol_II().IO = 0;
    }

    private void II11(IO1l iO1l) {
        if (this.var_I_I__IIIO != null) {
            IO1l iO1l2 = iO1l;
            I1_I i1_I = this;
            I_IO.III(iO1l, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO);
            iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
            if (!II.var_I_II_II.IOol && !II.var_I_1o_II.I_10 && Ilo1.var_Ilo1_III == null && II.var_boolean_IIIl) {
                for (int i = 0; i < i1_I.var_java_lang_String_IlI.length(); ++i) {
                    int n = (II.var_int_IIl - i1_I.var_java_lang_String_IlI.length() * I011) / 2 + i * I011 + I011 / 2;
                    if (i1_I.IlO0[i] == -1) {
                        iO1l2.II(Il1o, n, II.var_int_IIlI - 25, 3);
                        IO1I.III_.II(iO1l2, String.valueOf(i1_I.var_java_lang_String_IlI.charAt(i)), n, II.var_int_IIlI - 30, 2);
                        continue;
                    }
                    iO1l2.II(Il_, n, II.var_int_IIlI - 25, 3);
                    IO1I.IIIO.II(iO1l2, String.valueOf(i1_I.var_java_lang_String_IlI.charAt(i)), n, II.var_int_IIlI - 30, 2);
                }
            }
        } else if (!(II.var_I1l_II != null || Ilo1.var_Ilo1_III != null || II.var_I_II_II.IOol || II.var_I_1o_II.I_10 || Ilol.Ilol_II().var_IOlI_II.II01 == 0 || Ilo_.II().I_10 || II.var_IO1__II == I_l.II)) {
            long l = IO10.IIII() - this.var_long_Il0O;
            int n = 0;
            if (l < 10000L) {
                n = (int)(l * 20L / 10000L);
            }
            if (!II.var_boolean_IIIl) {
                if (!IIoo.II(iO1l, lIlO + lIlI - 1, lIll - 1, IO1_.l_l == 10)) {
                    iO1l.II(IO1_.l_l == 10 ? Il : IIoo, lIlO + lIlI - 1, lIll - 1, 0);
                }
                I_oo.IIII(iO1l, 542, lIlO + lIlI + 3, lIll + 3, 0, 0);
                IO1I.II10.II(iO1l, "" + Io_0, lIlO + lIlI + 22, lIll + 15, 1);
                if (l < 10000L) {
                    iO1l.Illl(2721889);
                    n = (int)(l * 20L / 10000L);
                    iO1l.III_(lIlO + lIlI + 3, lIll + 3 + n, 20, 20 - n);
                }
            } else if (Ilol.Ilol_II().IOIl != 14) {
                if (I1_I.var_III_II.II1o) {
                    if (IoO0 != 1) {
                        iO1l.Illl(0x939090);
                        iO1l.III_(lIlI + 9, lIll + 10, 22, 20);
                        iO1l.Illl(0xFFFFFF);
                        iO1l.III_(lIlI + 9, lIll + 10 + (n != 0 ? 20 - n : 0), 22, n != 0 ? n : 20);
                        if (!IIoo.II1l()) {
                            iO1l.II(IO1_.l_l == 10 ? var_javax_microedition_lcdui_Image_IlII : var_javax_microedition_lcdui_Image_IlI, lIlI, lIll, 0);
                        }
                        IO1I.IIl0.II(iO1l, "" + Io_0, lIlI + 20, lIll + 15, 2);
                    } else if (IoO0 == 1) {
                        if (!IIoo.II(iO1l, lIlO + lIlI - 1, lIll - 1, IO1_.l_l == 10)) {
                            iO1l.II(IO1_.l_l == 10 ? Il : IIoo, lIlO + lIlI - 1, lIll - 1, 0);
                        }
                        I_oo.IIII(iO1l, 542, lIlO + lIlI + 3, lIll + 3, 0, 0);
                        IO1I.II10.II(iO1l, "" + Io_0, lIlO + lIlI + 22, lIll + 13, 1);
                        if (l < 10000L) {
                            iO1l.Illl(2721889);
                            n = (int)(l * 20L / 10000L);
                            iO1l.III_(lIlO + lIlI + 3, lIll + 3 + n, 20, 20 - n);
                        }
                    }
                } else if (IoO0 != 1) {
                    iO1l.Illl(0x939090);
                    iO1l.III_(lIlI + 9, lIll + 10 - 6, 22, 20);
                    iO1l.Illl(0xFFFFFF);
                    iO1l.III_(lIlI + 9, lIll + 10 + (n != 0 ? 20 - n : 0) - 6, 22, n != 0 ? n : 20);
                    if (!IIoo.II1l()) {
                        iO1l.II(IO1_.l_l == 10 ? var_javax_microedition_lcdui_Image_IlII : var_javax_microedition_lcdui_Image_IlI, lIlI, lIll - 6, 0);
                    }
                    IO1I.IIl0.II(iO1l, "" + Io_0, lIlI + 20, lIll + 15 - 6, 2);
                } else {
                    iO1l.Illl(0x939090);
                    iO1l.III_(lIlI + 10, lIll + 10 - 6, 20, 18);
                    iO1l.Illl(0xFFFFFF);
                    iO1l.III_(lIlI + 10, lIll + 10 + (n != 0 ? 20 - n : 0) - 6, 20, n != 0 ? n : 18);
                    iO1l.II(IO1_.l_l == 10 ? IlI1 : var_javax_microedition_lcdui_Image_IlIl, lIlI + 20, lIll + 20 - 6, 3);
                    IO1I.IIl0.II(iO1l, "" + Io_0, lIlI + 20, lIll + 15 - 6, 2);
                }
            }
            if (I_0l) {
                I_0o[] i_0oArray;
                I_0o[] i_0oArray2 = i_0oArray = II.var_boolean_IIIl ? var_I_0o_arr_IIII : var_I_0o_arr_III;
                if (!II.var_boolean_IIIl) {
                    iO1l.Illl(11152401);
                    iO1l.III_(lIlO + lIlI + 2, lIll - 10 + 6, 20, 10);
                    IO1I.var_IO1I_II1I.II(iO1l, I1_I.IllI("\u8351", 33659), lIlO + lIlI + 12, lIll - 8 + 6, 2);
                }
                int n2 = II.var_boolean_IIIl ? this.I0l0 : i_0oArray.length;
                for (int i = 0; i < n2; ++i) {
                    float f;
                    String[] stringArray;
                    if (!II.var_boolean_IIIl) {
                        String[] stringArray2;
                        if (IOI0.III_) {
                            String[] stringArray3 = new String[5];
                            stringArray3[0] = I1_I.IllI("\u832a", 33659);
                            stringArray3[1] = I1_I.IllI("\u832c", 33659);
                            stringArray3[2] = I1_I.IllI("\u833e", 33659);
                            stringArray3[3] = I1_I.IllI("\u8329", 33659);
                            stringArray2 = stringArray3;
                            stringArray3[4] = I1_I.IllI("\u832f", 33659);
                        } else {
                            String[] stringArray4 = new String[5];
                            stringArray4[0] = I1_I.IllI("\u834c", 33659);
                            stringArray4[1] = I1_I.IllI("\u8343", 33659);
                            stringArray4[2] = I1_I.IllI("\u8342", 33659);
                            stringArray4[3] = I1_I.IllI("\u834a", 33659);
                            stringArray2 = stringArray4;
                            stringArray4[4] = I1_I.IllI("\u8348", 33659);
                        }
                        stringArray = stringArray2;
                        iO1l.Illl(11152401);
                        iO1l.III_(lIlO + var_int_arr_Il0I[i] + 2, var_int_arr_Il0l[i] - 10 + 8, 20, 10);
                        IO1I.var_IO1I_II1I.II(iO1l, stringArray[i], lIlO + var_int_arr_Il0I[i] + 12, var_int_arr_Il0l[i] - 10 + 6, 2);
                    }
                    if ((stringArray = i_0oArray[i]) != Ilol.Ilol_II().var_I_0o_II && !IIoo.II(iO1l, lIlO + var_int_arr_Il0I[i] - 1, var_int_arr_Il0l[i] - 1, false)) {
                        iO1l.II(IIoo, lIlO + var_int_arr_Il0I[i] - 1, var_int_arr_Il0l[i] - 1, 0);
                    }
                    if (stringArray == null) continue;
                    if (stringArray == Ilol.Ilol_II().var_I_0o_II) {
                        if (!IIoo.II(iO1l, lIlO + var_int_arr_Il0I[i] - 1, var_int_arr_Il0l[i] - 1, true)) {
                            iO1l.II(Il, lIlO + var_int_arr_Il0I[i] - 1, var_int_arr_Il0l[i] - 1, 0);
                        }
                        if (II.var_boolean_IIIl) {
                            iO1l.II(I_I_.Il0, 0, 12, 9, 6, 0, lIlO + var_int_arr_Il0I[i] + 8, var_int_arr_Il0l[i] - 7, 0);
                        }
                    }
                    int n3 = lIlO + var_int_arr_Il0I[i] + 13;
                    int n4 = var_int_arr_Il0l[i] + 13;
                    I_oo.IIII(iO1l, stringArray.II.l1O1, n3, n4, 0, IOII.IIOI);
                    long l2 = System.currentTimeMillis() - stringArray.I1IO;
                    if (l2 < (long)stringArray.l1_O) {
                        iO1l.Illl(2721889);
                        if (stringArray.I0Ol && II.var_int_IIIO % 6 > 2) {
                            iO1l.Illl(876862);
                        }
                        int n5 = (int)(l2 * 20L / (long)stringArray.l1_O);
                        iO1l.III_(n3 - 10, n4 - 10 + n5, 20, 20 - n5);
                    } else {
                        stringArray.I0Ol = false;
                    }
                    if (i == this.I0lo && II.var_int_IIIO % 10 > 5 || i == this.lI) {
                        iO1l.II(I10_.IlOI, lIlO + var_int_arr_Il0I[i] + 13, var_int_arr_Il0l[i] + 14, 3);
                    }
                    if (!((f = (float)((long)stringArray.l1_O - l2) / 1000.0f) > 0.0f)) continue;
                    int n6 = (int)(f * 10.0f);
                    String string = n6 / 10 + I1_I.IllI("\u8355", 33659) + n6 % 10;
                    IO1I.var_IO1I_II1I.II(iO1l, string, n3, n4 - 5, 2, IO1I.IIlI);
                }
            }
            if (IoO0 != 0 && Ilol.Ilol_II().IOIl != 14) {
                iO1l.II(IO1_.l_l == 5 ? IlIO : IlI_, lIIo + 20, lIl + 20, 3);
                var_III_II.II(iO1l);
                iO1l.II(IO1_.l_l == 13 ? IIo0 : IIoO, lIl1 + 20, lIl_ + 20, 3);
            }
        }
    }

    public static void II(String string, int n, int n2, int n3, int n4, int n5) {
        int n6;
        n3 = -1;
        for (n6 = 0; n6 < 5; ++n6) {
            if (var_int_arr_Ilo[n6] != -1) continue;
            n3 = n6;
            break;
        }
        if (n3 != -1) {
            I1_I.var_int_arr_IloI[n3] = n5;
            I1_I.IIlO[n3] = string;
            I1_I.var_int_arr_Il01[n3] = n;
            I1_I.var_int_arr_Il0_[n3] = n2;
            I1_I.var_int_arr_Il00[n3] = 0;
            I1_I.var_int_arr_Il0o[n3] = n4 < 0 ? -5 : 5;
            I1_I.var_int_arr_Ilo[n3] = 0;
            I1_I.var_int_arr_Ilol[n3] = 0;
            I1_I.var_int_arr_Il0O[n3] = 10;
            for (n6 = 0; n6 < 5; ++n6) {
                if (var_int_arr_Ilo[n6] == -1 || n3 == n6 || var_int_arr_Il0o[n3] >= 0 || I_Ol.II1(var_int_arr_Il01[n3] - var_int_arr_Il01[n6]) > 20 || var_int_arr_Il0O[n3] != var_int_arr_Il0O[n6]) continue;
                int[] nArray = var_int_arr_Il0O;
                int n7 = n3;
                nArray[n7] = nArray[n7] + 10;
            }
        }
    }

    public static final boolean IIII(int n, int n2, int n3) {
        int n4;
        int n5 = n4 = IloO[0] == -1 ? 0 : 1;
        if (IloO[n4] != -1) {
            return false;
        }
        I1_I.IloO[n4] = 0;
        I1_I.Iloo[n4] = n3;
        I1_I.var_int_arr_Ilo1[n4] = n;
        I1_I.Ilo_[n4] = n2;
        return true;
    }

    private static void II1_(IO1l iO1l) {
        for (int i = 0; i < 2; ++i) {
            if (IloO[i] == -1) continue;
            if (Iloo[i] == 1) {
                iO1l.II(var_javax_microedition_lcdui_Image_arr_IIIO[Ilo0[i]], var_int_arr_Ilo1[i], Ilo_[i], 3);
                continue;
            }
            iO1l.II(var_javax_microedition_lcdui_Image_arr_IIIO[Ilo0[i]], 0, 0, IO1l.II(var_javax_microedition_lcdui_Image_arr_IIIO[Ilo0[i]]), IO1l.III(var_javax_microedition_lcdui_Image_arr_IIIO[Ilo0[i]]), 2, var_int_arr_Ilo1[i], Ilo_[i], 3);
        }
    }

    private boolean IIoO() {
        if (!II.var_boolean_III1 && II.var_IO1__II == I1_I.I1_I_II()) {
            return true;
        }
        if (!II.var_boolean_IIIl) {
            return true;
        }
        if (Ilo_.II().I_10) {
            return true;
        }
        if (I1OO.I_1o) {
            return true;
        }
        return II.var_I1l_II != null || Ilo1.var_Ilo1_III != null || II.var_I_II_II.IOol || II.var_I_1o_II.I_10;
    }

    public static void IIl_(int n, int n2) {
        if (II.var_int_IIl == 128 || II.var_int_IIlI <= 208) {
            n = 126;
            n2 = 160;
        }
        lI_ = n;
        lI_I = n2;
        lI1o = var_int_IIOI - n / 2;
        lI10 = Iol0 - n2 / 2;
        if (II.var_boolean_IIIl) {
            if (II.var_int_IIlI <= 240) {
                lI10 -= 10;
            }
            if (II.var_boolean_IIIl && !II.var_boolean_III_ && II.var_IO1__II instanceof I1_I) {
                lI_ = 310;
                lI1o = var_int_I_0 / 2 - lI_ / 2;
            }
        }
        if (lI10 < -10) {
            lI10 = -10;
        }
        if (II.var_int_IIlI > 208 && lI10 < 0) {
            lI10 = 0;
        }
        if (II.var_int_IIlI == 208 && lI10 < 10) {
            lI10 = 10;
        }
    }

    public static void I0_O() {
        IOlO.IO11();
    }

    public static int II_() {
        int n = Ilol.Ilol_II().var_IOlI_II == null ? -1 : IlOO[Ilol.Ilol_II().var_IOlI_II.l10l];
        return n;
    }

    public static byte IIII() {
        byte by = 0;
        if (Ilol.Ilol_II().var_IOlI_II == null) {
            by = -1;
        } else {
            int n = IlO_.length;
            if (Ilol.Ilol_II().var_IOlI_II.l10l <= n - 1) {
                by = (byte)IlO_[Ilol.Ilol_II().var_IOlI_II.l10l];
            }
        }
        return by;
    }

    @Override
    public void II(String string, String string2) {
        Ilo_.II().I_10 = false;
        if (string2.equals(IO11.IO1_)) {
            if (I1_I.var_I1Oo_III.IIlI != Ilol.Ilol_II().IOI_) {
                I_0_.II().III1(string, I1_I.var_I1Oo_III.IIlI);
            }
        } else if (!string.equals("")) {
            if (string.equals(I1_I.IllI("\u830b\u83f3\u83d7\u83bf\u83b6\u8454\u8476\u8410", 33659))) {
                I_0_.II().Io_O();
                I_0_.II().Io_0();
                boolean bl = IOO = !IOO;
            }
            if (string.equals(I1_I.IllI("\u8312\u83f9\u83d6\u83b6", 33659))) {
                boolean bl = I_Ol.I1l1 = !I_Ol.I1l1;
            }
            if (string.equals(I1_I.IllI("\u8319\u83f3\u83de", 33659))) {
                I_Ol.var_boolean_III = !I_Ol.var_boolean_III;
            }
            I_0_.II().II_1(string);
        }
    }

    @Override
    public void Illl() {
    }

    public void IIl_(I_Il i_Il) {
        I1OO.I__o();
        try {
            this.IlOI = new int[i_Il.java_io_DataInputStream_II().readByte()];
            this.var_int_arr_Il_1 = new int[this.IlOI.length];
            this.IlOl = new int[this.IlOI.length];
            this.var_int_arr_Il_O = new int[this.IlOI.length];
            this.IlO1 = new int[this.IlOI.length];
            this.var_java_lang_String_arr_IIl1 = new String[this.IlOI.length];
            this.var_int_arr_Il_0 = new int[this.IlOI.length];
            this.IIl_ = new String[this.IlOI.length];
            for (int i = 0; i < this.IlOI.length; ++i) {
                this.IlOI[i] = i_Il.java_io_DataInputStream_II().readByte();
                this.var_int_arr_Il_1[i] = i_Il.java_io_DataInputStream_II().readByte();
                this.IlOl[i] = i_Il.java_io_DataInputStream_II().readByte();
                this.var_int_arr_Il_O[i] = i_Il.java_io_DataInputStream_II().readByte();
                if (i_Il.java_io_DataInputStream_II().readByte() != 1) continue;
                this.var_java_lang_String_arr_IIl1[i] = i_Il.java_io_DataInputStream_II().readUTF();
                this.IlO1[i] = i_Il.java_io_DataInputStream_II().readInt();
                this.IIl_[i] = i_Il.java_io_DataInputStream_II().readUTF();
                this.var_int_arr_Il_0[i] = i_Il.java_io_DataInputStream_II().readInt();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        II.var_I_1o_II.IoII();
        II.var_I_1o_II.I__0();
    }

    private void III(String string, I1Il i1Il, I1Il i1Il2) {
        this.var_I__0_II = new I__0();
        this.var_I__0_II.IIII(string, i1Il, i1Il2);
    }

    public void II(int n, String string, byte by) {
        Ilol ilol = I1_I.Ilol_II(n);
        if (ilol != null) {
            if (by == 3) {
                this.III(string, new I1Il(IO11.I_lI, 2000, ilol), new I1Il(IO11.I_I, 2009, ilol));
            }
            if (by == 4) {
                this.III(string, new I1Il(IO11.I_lI, 2005, ilol), new I1Il(IO11.I_I, 2009, ilol));
            }
        }
    }

    public void IIO0(int n) {
        Ilol ilol = I1_I.Ilol_II(n);
        if (ilol != null) {
            this.III(ilol.IIO1 + IO11.I001, new I1Il(IO11.I_I_, 11114, ilol), new I1Il(IO11.I_IO, 2009, ilol));
        }
    }

    public static void II(int n, byte by) {
        if (var_I_lO_IIOl.size() == 0) {
            I_0_.II().IIII((byte)2, by);
            I_Ol.II__(I1_I.IllI("\u831c\u83ff\u83cd\u839e\u839b\u8477\u8452\u8465", 33659));
        } else if (n == Ilol.Ilol_II().IOI_) {
            I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84d8\u84a3\u8482\u856b", 33659));
            Ilol.Ilol_II();
            if (Ilol.boolean_II(by)) {
                I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84c5\u84a2\u849a\u856b", 33659));
                for (int i = 0; i < var_I_lO_IIOl.size(); ++i) {
                    I_1O i_1O = (I_1O)var_I_lO_IIOl.elementAt(i);
                    if (i_1O == null || i_1O.IIO1 != by) continue;
                    I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84d2\u84b6\u8483\u856f\u854a\u8571\u8556", 33659));
                    Ilol.Ilol_II().IO0_ = i_1O.I_O0;
                }
                return;
            }
            Ilol.Ilol_II();
            if (!Ilol.boolean_II(by)) {
                I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84d7\u84b1\u8483\u857d\u8548", 33659));
                I_0_.II().IIII((byte)2, by);
                return;
            }
        } else {
            I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84df\u84bf\u849b\u852e\u8540\u8529", 33659));
            if (I1_I.Ilol_II(n) != null) {
                I1_I.Ilol_II(n);
                if (Ilol.boolean_II(by)) {
                    I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84c5\u84a2\u849a\u856b", 33659));
                    for (int i = 0; i < var_I_lO_IIOl.size(); ++i) {
                        I_1O i_1O = (I_1O)var_I_lO_IIOl.elementAt(i);
                        if (i_1O == null || i_1O.IIO1 != by) continue;
                        I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84d2\u84b6\u8483\u856f\u854a\u8571\u8556", 33659));
                        I1_I.Ilol_II((int)n).IO0_ = i_1O.I_O0;
                    }
                    return;
                }
                I1_I.Ilol_II(n);
                if (!Ilol.boolean_II(by)) {
                    I_Ol.II__(I1_I.IllI("\u8316\u83e3\u8399\u83bb\u8391\u847a\u8454\u8433\u8449\u84b2\u84d7\u84b1\u8483\u857d\u8548", 33659));
                    I_0_.II().IIII((byte)2, by);
                }
            }
        }
    }

    public void IIII(int n, Object object) {
        I_Ol.II__(I1_I.IllI("\u832b\u83df\u83eb\u839e\u83b8\u8444\u8478\u8474\u8424\u84db\u84e5\u8498\u84cf\u8547\u8569\u856c\u852c\u85eb\u85c4\u85ad\u85b4\u8665\u8657\u8664\u865e\u86a2", 33659) + n);
        switch (n) {
            case 1: {
                II.III_();
                return;
            }
            case 2: {
                II.var_I_II_II.IOol = false;
                return;
            }
            case 2000: {
                this.var_I__0_II = null;
                if ((Ilol)object == null) {
                    I_0_.II().II((byte)1, (byte)3, -1);
                    return;
                }
                I_0_.II().II((byte)1, (byte)3, ((Ilol)object).IOI_);
                I_0_.II().IoO();
                return;
            }
            case 2001: {
                II.III_();
                return;
            }
            case 2003: {
                II.III_();
                I1OO.IIl1();
                I_0_.II().II((byte)0, (byte)3, Ilol.Ilol_II().var_Ilol_IIIl.IOI_);
                return;
            }
            case 2004: {
                II.III_();
                I_0_.II().II((byte)0, (byte)4, Ilol.Ilol_II().var_Ilol_IIIl.IOI_);
                return;
            }
            case 2005: {
                II.III_();
                this.var_I__0_II = null;
                if ((Ilol)object == null) {
                    I_0_.II().II((byte)1, (byte)4, -1);
                    return;
                }
                I_0_.II().II((byte)1, (byte)4, ((Ilol)object).IOI_);
                return;
            }
            case 2006: {
                II.III_();
                I_0_.II().II((byte)2, (byte)4, Ilol.Ilol_II().var_Ilol_IIIl.IOI_);
                return;
            }
            case 2007: {
                II.III_();
            }
            case 12006: {
                GameMidlet.II.IIll();
                break;
            }
            case 2009: {
                this.var_I__0_II = null;
                return;
            }
            case 8002: {
                this.II(false, true);
                II.III1();
                II.IIIl();
                return;
            }
            case 11000: {
                II.var_I_1o_II.IoI();
                II.var_I_1o_II.I__0();
                return;
            }
            case 11001: {
                Ilol.Ilol_II().IOo_();
                return;
            }
            case 11002: {
                II.var_I_1o_II.I__o();
                return;
            }
            case 11038: {
                I_lO i_lO = new I_lO("");
                i_lO.addElement(new I1Il(IO11.var_java_lang_String_arr_II0_[1], 110381));
                i_lO.addElement(new I1Il(IO11.var_java_lang_String_arr_II0_[2], 110382));
                i_lO.addElement(new I1Il(IO11.var_java_lang_String_arr_II0_[3], 110383));
                II.var_I_II_II.II(i_lO);
                return;
            }
            case 11057: {
                I1l1.II10.removeAllElements();
                I1l1.II1_.removeAllElements();
                I_11 i_11 = (I_11)object;
                if (i_11.lIo0 == 0) {
                    I_0_.II().II((short)i_11.var_I_1__II.lll0, (byte)II.var_I_II_II.llII);
                    return;
                }
                if (II.var_I_II_II.llII != 0) break;
                I_0_.II().IIo1(i_11.lIo0);
                return;
            }
            case 11059: {
                I_0o i_0o = var_I_0o_arr_IIII[this.I0lo];
                this.III(i_0o, false);
                ((IO1_)this).III0 = null;
                return;
            }
            case 11067: {
                if (IOlO.l1ol != 0) {
                    I_0_.II().II0O(0);
                    I1OO.IIl1();
                    return;
                }
                var_I1Oo_II.IIII(IO11.I100, 0);
                return;
            }
            case 11111: {
                if (Ilol.Ilol_II().var_Ilol_IIIl == null) {
                    return;
                }
                I1OO.IIl1();
                if (II.var_I_1o_II.IIo.size() <= 0) {
                    Ilol.Ilol_II();
                    this.IOoI();
                }
                II.var_I_1o_II.III_(Ilol.Ilol_II().var_Ilol_IIIl);
                II.var_I_1o_II.I__0();
                I_0_.II().II01(Ilol.Ilol_II().var_Ilol_IIIl.IOI_);
                I_0_.II().IlI0(Ilol.Ilol_II().var_Ilol_IIIl.IOI_);
                return;
            }
            case 11112: {
                Ilol ilol = (Ilol)object;
                I_0_.II().III((byte)1, ilol.IOI_);
                return;
            }
            case 11113: {
                Ilol ilol = (Ilol)object;
                if (ilol == null) break;
                I_0_.II().II((byte)0, ilol.IOI_, (byte)-1, -1);
                return;
            }
            case 11114: {
                this.var_I__0_II = null;
                Ilol ilol = (Ilol)object;
                if (ilol == null) {
                    return;
                }
                I_0_.II().II((byte)1, ilol.IOI_, (byte)-1, -1);
                return;
            }
            case 11115: {
                if (Ilol.Ilol_II().var_Ilol_IIIl == null) {
                    return;
                }
                I1OO.IIl1();
                I_0_.II().II(Ilol.Ilol_II().var_Ilol_IIIl.IOI_, (short)Ilol.Ilol_II().var_Ilol_IIIl.var_int_I10);
                return;
            }
            case 11120: {
                Object[] objectArray = (Object[])object;
                I_0o i_0o = (I_0o)objectArray[0];
                n = Integer.parseInt((String)objectArray[1]);
                for (int i = 0; i < var_I_0o_arr_IIII.length; ++i) {
                    if (var_I_0o_arr_IIII[i] != i_0o) continue;
                    I1_I.var_I_0o_arr_IIII[i] = null;
                }
                I1_I.var_I_0o_arr_IIII[n] = i_0o;
                I1_I.IOo();
                return;
            }
            case 11121: {
                Object[] objectArray = (Object[])object;
                I_0o i_0o = (I_0o)objectArray[0];
                int n2 = Integer.parseInt((String)objectArray[1]);
                for (int i = 0; i < var_I_0o_arr_III.length; ++i) {
                    if (var_I_0o_arr_III[i] != i_0o) continue;
                    I1_I.var_I_0o_arr_III[i] = null;
                }
                I1_I.var_I_0o_arr_III[n2] = i_0o;
                I1_I.IO1_();
                return;
            }
            case 12000: {
                I_0_.II().II((byte)1, (byte)-1, (String)null);
                return;
            }
            case 12001: {
                II.III_();
                return;
            }
            case 12002: {
                II.III_();
                I1I i1I = (I1I)object;
                I_0_.II().II((byte)1, -1, i1I.II0I, i1I.I_O0);
                this.var_I__0_II = null;
                return;
            }
            case 12003: {
                I1I i1I = (I1I)object;
                II.III_();
                I_0_.II().II((byte)2, -1, i1I.II0I, i1I.I_O0);
                this.var_I__0_II = null;
                return;
            }
            case 12004: {
                I_0o i_0o = (I_0o)object;
                this.III(i_0o, true);
                Ilol.Ilol_II();
                return;
            }
            case 12005: {
                if (II.var_I_01_II == null) {
                    II.var_I_01_II = new I_01();
                }
                II.var_I_01_II.I0l_();
                II.III_();
                return;
            }
            case 110001: {
                II.var_I_1o_II.IoI();
                II.var_I_1o_II.I__0();
                return;
            }
            case 110004: {
                II.var_I_II_II.IOol = false;
                return;
            }
            case 110382: {
                I_0_.II().IoOl();
                return;
            }
            case 110383: {
                I_0_.II().IoO1();
                return;
            }
            case 110391: {
                I_0_.II().II((byte)0, Ilol.Ilol_II().var_Ilol_IIIl.IOI_, -1, -1);
                return;
            }
            case 888351: {
                I_0_.II().IIIo((byte)5);
                II.III_();
                return;
            }
        }
    }

    public void IIIl(String string, String string2) {
        this.I1 = new int[string.length()];
        this.I1I = new int[string.length()];
        this.I1II = new int[string.length()];
        this.I1Il = new int[string.length()];
        this.I1I1 = new int[string.length()];
        for (int i = 0; i < string.length(); ++i) {
            this.I1[i] = Short.parseShort(string.substring(i, i + 1));
            this.I1I[i] = I_Ol.III_(0, 11);
            this.I1II[i] = 1;
            this.I1I1[i] = 0;
        }
        this.lI_0 = 100;
        this.lI_O = 0;
        this.II0l = string2;
        var_long_Ilo = var_long_IloI = IO10.IIII();
    }

    public void II_I(String string) {
        if (!this.IOOl) {
            this.lIO = IO1I.III1.IIII(string);
            this.lI_o = II.var_int_IIl;
            this.IOOl = true;
        }
        if (string.startsWith(I1_I.IllI("\u835a", 33659))) {
            string = string.substring(1, string.length());
            this.IOOI = true;
        }
        if (string.startsWith(I1_I.IllI("\u8339\u83d5\u83ea\u838b", 33659))) {
            try {
                if (IIol.III_ == null) {
                    IIol.III_ = new Il_l.II();
                }
                IIol iIol = new IIol(string);
                if (iIol.II1 != null && iIol.Il0O != -1) {
                    IIol.III_.void_III(iIol);
                    while (IIol.III_.IIlO() > 4) {
                        IIol.III_.III(0);
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        var_java_util_Vector_IIIl.addElement(string);
    }

    public void II_l(String string) {
        this.var_java_lang_String_IlIl = string;
        this.IIl0 = IO1I.IIlI.II(this.var_java_lang_String_IlIl, 500);
    }

    private static boolean II0_() {
        return IOlO.III() && I1_I.var_I10_II.II0I == 0;
    }

    private static void III(IO1l iO1l, int n, int n2, int n3) {
        if (var_I10_II != null && !I_1o && lIIl == 1 && !II.var_I_1o_II.I_10 && I1_I.II0_()) {
            int n4;
            int n5;
            int n6;
            if (n3 < I1_I.var_I11o_IIl1.II0I + (I1_I.var_I11o_IIll.II0I << 2)) {
                n3 = I1_I.var_I11o_IIl1.II0I + (I1_I.var_I11o_IIll.II0I << 2);
            }
            if (n > II.var_int_IIl - n3 / 2) {
                n = II.var_int_IIl - n3 / 2;
            }
            if (n < IO1l.II(var_javax_microedition_lcdui_Image_Il_0) + n3 / 2 + 10) {
                n = IO1l.II(var_javax_microedition_lcdui_Image_Il_0) + n3 / 2 + 10;
            }
            n2 = I1_I.var_I11o_IIll.I_O0;
            int n7 = n2 + 0 + IO1l.III(var_javax_microedition_lcdui_Image_Il_O) / 2 + 2;
            int n8 = I1_I.var_I11o_IIl1.II0I;
            int n9 = n3 / 2 - n8 / 2;
            n3 = n - n3 / 2;
            int n10 = n + n8 / 2;
            int n11 = n9 - I1_I.var_I11o_IIll.II0I;
            int n12 = n11 / I1_I.var_I11o_IIll.II0I;
            if (n11 % I1_I.var_I11o_IIll.II0I > 0) {
                ++n12;
            }
            for (n6 = 0; n6 < n12; ++n6) {
                if (n6 < n12 - 1) {
                    var_I11o_IIll.II(1, n3 + I1_I.var_I11o_IIll.II0I + n6 * I1_I.var_I11o_IIll.II0I, 3, 0, 0, iO1l);
                } else {
                    var_I11o_IIll.II(1, n3 + n11, 3, 0, 0, iO1l);
                }
                if (n6 < n12 - 1) {
                    var_I11o_IIll.II(1, n10 + n6 * I1_I.var_I11o_IIll.II0I, 3, 0, 0, iO1l);
                    continue;
                }
                var_I11o_IIll.II(1, n10 + n11 - I1_I.var_I11o_IIll.II0I, 3, 0, 0, iO1l);
            }
            var_I11o_IIll.II(0, n3, 3, 2, 0, iO1l);
            var_I11o_IIll.II(0, n10 + n11, 3, 0, 0, iO1l);
            if (I1_I.var_I10_II.I_Oo > 0) {
                n5 = 2;
                n4 = 3;
                if (I1_I.var_I10_II.IIO == 4) {
                    n5 = 4;
                    n4 = 5;
                }
                if ((n6 = I1_I.var_I10_II.I_Oo * n9 / I1_I.var_I10_II.I_O0) < 0) {
                    n6 = 0;
                }
                if (n6 > n9) {
                    n6 = n9;
                }
                iO1l.IIIO(n3 + n9 - n6, 3, n6, n2);
                for (n6 = 0; n6 < n12; ++n6) {
                    if (n6 < n12 - 1) {
                        var_I11o_IIll.II(n4, n3 + I1_I.var_I11o_IIll.II0I + n6 * I1_I.var_I11o_IIll.II0I, 3, 0, 0, iO1l);
                        continue;
                    }
                    var_I11o_IIll.II(n4, n3 + n11, 3, 0, 0, iO1l);
                }
                var_I11o_IIll.II(n5, n3, 3, 2, 0, iO1l);
                II.II(iO1l);
            }
            if (I1_I.var_I10_II.I_0 > 0) {
                n5 = 2;
                n4 = 3;
                if (I1_I.var_I10_II.IIOI == 4) {
                    n5 = 4;
                    n4 = 5;
                }
                if ((n6 = I1_I.var_I10_II.I_0 * n9 / I1_I.var_I10_II.I_O0) < 0) {
                    n6 = 0;
                }
                if (n6 > n9) {
                    n6 = n9;
                }
                iO1l.IIIO(n10, 3, n6, n2);
                for (n6 = 0; n6 < n12; ++n6) {
                    if (n6 < n12 - 1) {
                        var_I11o_IIll.II(n4, n10 + n6 * I1_I.var_I11o_IIll.II0I, 3, 0, 0, iO1l);
                        continue;
                    }
                    var_I11o_IIll.II(n4, n10 + n11 - I1_I.var_I11o_IIll.II0I, 3, 0, 0, iO1l);
                }
                var_I11o_IIll.II(n5, n10 + n11, 3, 0, 0, iO1l);
                II.II(iO1l);
            }
            var_I11o_IIl1.II(0, n - n8 / 2, 0, 0, 0, iO1l);
            String string = IO10.II(I1_I.var_I10_II.IlO0, I1_I.var_I10_II.II_l, true, false);
            IO1I.IIIl.II(iO1l, string, n + 1, 0 + I1_I.var_I11o_IIl1.I_O0 / 2 - IO1I.IIIO.IIOl() / 2, 2);
            I_1o.II(I1_I.var_I10_II.IIO, 1).III(iO1l, I1_I.var_I10_II.IlI1, n - 5, n7 + 5, 1, IO1I.III_);
            I_1o.II(I1_I.var_I10_II.IIOI, 1).III(iO1l, I1_I.var_I10_II.IlI_, n + 5, n7 + 5, 0, IO1I.III_);
            if (I1_I.var_I10_II.II0I != 0) {
                int n13 = 0 + n2 / 2 - 2;
                IO1I.II_I.II(iO1l, "" + I1_I.var_I10_II.I_Oo, n3 + n9 / 2, n13, 2);
                IO1I.II_I.II(iO1l, "" + I1_I.var_I10_II.I_0, n10 + n9 / 2, n13, 2);
            }
            iO1l.II(Il__, n, 0 + I1_I.var_I11o_IIl1.I_O0 + 2, 3);
            if (I1_I.var_I10_II.II0I == 0) {
                I1_I.II(iO1l, I1_I.var_I10_II.IIOl, I1_I.var_I10_II.IIlI, n - 13, I1_I.var_I10_II.IIO1, n + 13, n7);
            }
        }
    }

    private static void II(IO1l iO1l, int n, int n2, int n3, int n4, int n5, int n6) {
        if (var_javax_microedition_lcdui_Image_Il_O != null) {
            int n7;
            int n8;
            int n9 = IO1l.III(var_javax_microedition_lcdui_Image_Il_O) / 2;
            for (n8 = 0; n8 < n; ++n8) {
                n7 = 0;
                if (n8 < n2) {
                    n7 = 1;
                }
                iO1l.II(var_javax_microedition_lcdui_Image_Il_O, 0, n7 * n9, IO1l.II(var_javax_microedition_lcdui_Image_Il_O), n9, 0, n3 - n8 * (n9 + 1), n6, 3);
            }
            for (n8 = 0; n8 < n; ++n8) {
                n7 = 0;
                if (n8 < n4) {
                    n7 = 1;
                }
                iO1l.II(var_javax_microedition_lcdui_Image_Il_O, 0, n7 * n9, IO1l.II(var_javax_microedition_lcdui_Image_Il_O), n9, 0, n5 + n8 * (n9 + 1), n6, 3);
            }
        }
    }

    public static void II(int n, int n2, int n3, int n4, int n5, int n6, int n7, short s, I___[] i___Array) {
        I1_I.II(new I111(n, n2, n3, n4, n5, n6, n7, s, i___Array));
    }

    public static void II(int n, int n2, int n3, Ilol ilol, I___ i___, int n4, short s, short s2) {
        I1_I.II(new I111(n, n2, n3, ilol.Ilol_IIII(), i___, n4, s, s2));
    }

    private static void II(I111 i111) {
        if (i111.II0I == 0) {
            I11.II(i111);
        } else if (i111.II0I == 1) {
            I11.III(i111);
        } else if (i111.II0I == 2) {
            I11.IIII(i111);
        } else {
            I11.IIIl(i111);
        }
    }

    private static void II1O(IO1l iO1l) {
        iO1l.Illl(0x808080);
        iO1l.III_(0, II.var_int_IIlI - 2, II.var_int_IIl, 2);
        int n = (int)(Ilol.Ilol_II().Il1 * (long)II.var_int_IIl / 10000L);
        iO1l.Illl(0xFFFFFF);
        iO1l.III_(0, II.var_int_IIlI - 2, n, 2);
        iO1l.Illl(0);
        n = II.var_int_IIl / 10;
        for (int i = 1; i < 10; ++i) {
            iO1l.III_(i * n, II.var_int_IIlI - 2, 1, 2);
        }
    }

    static {
        var_I_lO_II_l = new I_lO(I1_I.IllI("\u830d\u83d9\u83d5\u83b9\u8399", 33659));
        new I_lO(I1_I.IllI("\u830d\u83ca\u83cd\u8395\u8396\u8466", 33659));
        var_I_lO_II_1 = new I_lO(I1_I.IllI("\u830d\u83dc\u83cb\u83b1\u8392\u8478\u8451", 33659));
        var_I_lO_II__ = new I_lO(I1_I.IllI("\u830d\u83df\u83d7\u83bd\u839a\u847f\u8450\u8427", 33659));
        var_I_lO_II_O = new I_lO(I1_I.IllI("\u830d\u83d9\u83d1\u83b9\u8385\u845f\u845b\u8419\u8412\u84e2", 33659));
        var_I_lO_II_0 = new I_lO(I1_I.IllI("\u830d\u83d3\u83cd\u83bd\u839a\u845b\u8454\u8424", 33659));
        var_I_lO_II_o = new I_lO(I1_I.IllI("\u830d\u83d7\u83d6\u83ba\u83b6\u8462\u8441\u8435\u8410\u84f9", 33659));
        new I_lO(I1_I.IllI("\u830d\u83c9\u83dc\u83ac", 33659));
        var_I_lO_IIO = new I_lO(I1_I.IllI("\u830d\u83d7\u83d6\u83ba", 33659));
        var_I_lO_IIOI = new I_lO(I1_I.IllI("\u830d\u83d4\u83c9\u83bb", 33659));
        var_I_lO_IIOl = new I_lO(I1_I.IllI("\u830d\u83dc\u83d5\u83b9\u8390", 33659));
        Io_o = 0;
        I1OO = -1;
        IoO = 0;
        var_I_O__III = new I_O_();
        var_I_O__IIII = new I_O_();
        new I_lO(I1_I.IllI("\u830d\u83d3\u83cd\u83bd\u839a\u8443\u8445\u8413\u8401\u84f3\u84d5\u84b5", 33659));
        I_O_ = false;
        I_OO = false;
        I_O0 = false;
        I_Oo = false;
        var_boolean_I_0 = false;
        I_0I = false;
        I_Il = false;
        I_0l = false;
        I_01 = false;
        I_0_ = false;
        I_0O = false;
        I_00 = false;
        I_0o = false;
        I_o = false;
        I_oI = false;
        I_ol = false;
        I_o1 = false;
        I_o_ = false;
        I_l_ = false;
        I_oO = false;
        I_l0 = false;
        I_o0 = false;
        I_oo = false;
        IO = false;
        IOI = false;
        I_lo = false;
        I_1 = false;
        IOII = false;
        IOIl = false;
        I_1I = false;
        I_11 = false;
        IOI1 = false;
        IOI_ = false;
        IOIO = false;
        IOI0 = false;
        IOIo = false;
        IOl = false;
        IOlI = false;
        IOll = false;
        III0 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8656\u8630\u8602\u86f6\u868f\u86b0\u86b1\u8699", 33659));
        II0O = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8649\u862d\u860d\u86e7\u86e2\u86af\u86b3\u8691\u876f\u870e\u876b\u8754\u87e9\u87d6\u87b0", 33659));
        III_ = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8649\u862d\u860d\u86e7\u86e2\u86af\u86b3\u8691\u876f\u870e\u876a\u8754\u87e9\u87d6\u87b0", 33659));
        II00 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8649\u862d\u860d\u86e7\u86e2\u86af\u86b3\u8691\u876f\u870e\u8769\u8754\u87e9\u87d6\u87b0", 33659));
        II0o = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8649\u862d\u860d\u86e7\u86e2\u86af\u86b3\u8691\u876f\u870c\u876b\u8754\u87e9\u87d6\u87b0", 33659));
        IIo = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8649\u862d\u860d\u86e7\u86e2\u86af\u86b3\u8691\u876f\u870c\u876a\u8754\u87e9\u87d6\u87b0", 33659));
        IIoI = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8649\u862d\u860d\u86e7\u86e2\u86af\u86b3\u8691\u876f\u870c\u8769\u8754\u87e9\u87d6\u87b0", 33659));
        var_byte_II_o = 0;
        var_I1Oo_II = new I1Oo();
        var_I1Oo_III = new I1Oo();
        var_III_II = new III();
        IoO0 = 0;
        var_I11o_IIll = new I11o(IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84b9\u84b0\u857e\u855b\u8529\u8534\u85e8\u85c8\u85ba\u85b8\u8636\u860b\u8634\u860d\u86e5", 33659)), 6, 15);
        var_I11o_IIl1 = new I11o(IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84b9\u84b0\u857e\u855b\u8529\u8534\u85e8\u85c8\u85ba\u85b8\u8637\u860b\u8634\u860d\u86e5", 33659)), 38, 21);
        Il__ = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84b9\u84b0\u8578\u855e\u8562\u851b\u85e4\u85ce", 33659));
        var_javax_microedition_lcdui_Image_Il_O = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84b9\u84b0\u856d\u8545\u852d\u8519\u85e6\u85c0\u85ae\u8582\u8628\u8655\u862a\u8604", 33659));
        var_javax_microedition_lcdui_Image_Il_1 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84b9\u84b0\u8566\u855d\u8562\u851b\u85e4\u85ce", 33659));
        var_javax_microedition_lcdui_Image_Il_0 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84b9\u84b0\u8565\u8545\u8539\u8505\u85ed\u8587\u85b8\u8589\u8661", 33659));
        IlI0 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8647\u8630\u860d\u86ee\u868f\u86b0\u86b1\u8699", 33659));
        IlIo = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8647\u8630\u860d\u86ee\u86c7\u86ee\u86af\u8690\u877a", 33659));
        Ill = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8647\u8630\u860d\u86ee\u8693\u86ee\u86af\u8690\u877a", 33659));
        IllI = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8647\u8630\u860d\u86ee\u86c7\u86f2\u86f1\u868e\u8773\u875b", 33659));
        Ill1 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8655\u8625\u860d\u86e7\u86cd\u86ee\u86af\u8690\u877a", 33659));
        Ill_ = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84a0\u848e\u8560\u8548\u8520\u8559\u85a4\u85d9\u85a6\u8580", 33659));
        IllO = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u866d\u8614\u864d\u86f2\u86cf\u86a7", 33659));
        Illo = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u8483\u84bf\u8520\u855d\u8522\u850c", 33659));
        Il1 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u864d\u8634\u862f\u86ed\u86d2\u86b4\u86f1\u868e\u8773\u875b", 33659));
        Il1I = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8648\u8634\u862f\u86ed\u86d2\u86b4\u86f1\u868e\u8773\u875b", 33659));
        Ill0 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8668\u8614\u864d\u86f2\u86cf\u86a7", 33659));
        IIoo = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8656\u862f\u860a\u86ee\u86cd\u86ee\u86af\u8690\u877a", 33659));
        Il = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8656\u862f\u860a\u86ee\u86cd\u86f2\u86f1\u868e\u8773\u875b", 33659));
        IIo_ = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8648\u8621\u860d\u86f7\u868f\u86b0\u86b1\u8699", 33659));
        IIoO = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8643\u862b\u8600\u86f7\u86d2\u86ee\u86af\u8690\u877a", 33659));
        Il1l = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84a4\u8482\u8523\u8549\u8523\u8545\u85fa\u85c7\u85af", 33659));
        Il11 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84a4\u8482\u8523\u855b\u852d\u8505\u85ed\u8587\u85b8\u8589\u8661", 33659));
        Il1_ = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84a4\u8482\u8523\u8555\u852d\u8506\u85a4\u85d9\u85a6\u8580", 33659));
        Il1O = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84a4\u8482\u8523\u8555\u852d\u8505\u85e2\u8587\u85b8\u8589\u8661", 33659));
        if (II.var_boolean_IIIl) {
            IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8644\u8636\u8611\u86ed\u86d6\u86ee\u86af\u8690\u877a", 33659));
            IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8644\u8636\u8611\u86ed\u86d6\u86f2\u86f1\u868e\u8773\u875b", 33659));
            IIol = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8646\u862c\u8602\u86f6\u868f\u86b0\u86b1\u8699", 33659));
            IIo1 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8646\u862c\u8602\u86f6\u8693\u86ee\u86af\u8690\u877a", 33659));
            IIo0 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8643\u862b\u8600\u86f7\u86d2\u86f2\u86f1\u868e\u8773\u875b", 33659));
            var_javax_microedition_lcdui_Image_IlI = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8675\u8621\u8602\u86b2\u868f\u86b0\u86b1\u8699", 33659));
            var_javax_microedition_lcdui_Image_IlII = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8675\u8621\u8602\u86b3\u868f\u86b0\u86b1\u8699", 33659));
            var_javax_microedition_lcdui_Image_III = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8644\u862a\u8602\u86ee\u86ce\u86a7\u86ee\u86d0\u876d\u8752\u873c", 33659));
            Illl = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8644\u862a\u8602\u86ee\u86ce\u86a7\u86ed\u86d0\u876d\u8752\u873c", 33659));
            var_javax_microedition_lcdui_Image_IlIl = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8675\u8621\u8602\u86b0\u868f\u86b0\u86b1\u8699", 33659));
            IlI1 = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8675\u8621\u8602\u86b1\u868f\u86b0\u86b1\u8699", 33659));
            IlI_ = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8643\u862d\u8611\u86e7\u86c3\u86b4\u86b1\u86ce\u8733\u874c\u8735\u871d", 33659));
            IlIO = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8643\u862d\u8611\u86e7\u86c3\u86b4\u86b1\u86cf\u8733\u874c\u8735\u871d", 33659));
        }
        IoO0 = I_O1.III(I1_I.IllI("\u831a\u83f4\u83d8\u83b4\u8398\u8471", 33659)) == 1 ? 1 : 0;
        var_III_II = new III();
        byte[] byArray = I_O1.II(I1_I.IllI("\u8335\u83c8\u83dd\u83b9\u8383\u8477\u8463\u8431\u8401\u84e1\u84d8\u84bf\u8481", 33659));
        byte[] byArray2 = I_O1.II(I1_I.IllI("\u8335\u83c8\u83d4\u83b9\u8387\u8440\u8450\u8426\u8400\u84fb\u84de\u84be", 33659));
        byte[] byArray3 = I_O1.II(I1_I.IllI("\u8335\u83c8\u83ca\u83b3\u839e\u847a\u8459\u8402\u8416\u84e0\u84c2\u84b9\u8480\u8560", 33659));
        byte[] byArray4 = I_O1.II(I1_I.IllI("\u8335\u83c8\u83d0\u83ac\u8392\u847b\u8463\u8431\u8401\u84e1\u84d8\u84bf\u8481", 33659));
        if (byArray != null) {
            II1o = byArray[0];
        }
        if (byArray2 != null) {
            II_ = byArray2[0];
        }
        if (byArray3 != null) {
            II_I = byArray3[0];
        }
        if (byArray4 != null) {
            var_byte_II_l = byArray4[0];
        }
        var_I_0o_arr_III = new I_0o[10];
        var_I_0o_arr_IIII = new I_0o[10];
        Il10 = IO10.IIII(I1_I.IllI("\u8354\u83f8\u83de\u83f7\u8383\u8464\u8454\u843a\u8400\u84bc\u84c1\u84be\u8488", 33659));
        I0l_ = 0;
        Il1o = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u864b\u8631\u8617\u86ac\u86d1\u86ae\u86b8", 33659));
        Il_ = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u864b\u8631\u8617\u86c4\u868f\u86b0\u86b1\u8699", 33659));
        IO__ = true;
        IlOo = new int[]{1, -1, 1, -1};
        var_int_arr_Il0 = new int[]{1, -1, -1, 1};
        var_I_lO_IIO1 = new I_lO("");
        var_javax_microedition_lcdui_Image_Il_l = IO10.IIII(I1_I.IllI("\u8354\u83f7\u83d8\u83b1\u8399\u845f\u8458\u8435\u8414\u84f7\u849e\u84bd\u8496\u855a\u8548\u8534\u851f\u85ff\u85db\u85ad\u85d5\u8662\u8644\u8636\u8611\u86ed\u86d6\u86f3\u86f1\u868e\u8773\u875b", 33659));
        var_int_arr_Il01 = new int[5];
        var_int_arr_Il0_ = new int[5];
        var_int_arr_Il00 = new int[5];
        var_int_arr_Il0o = new int[5];
        var_int_arr_Ilo = new int[5];
        IIlO = new String[5];
        var_int_arr_Il0O = new int[5];
        var_int_arr_Ilol = new int[5];
        var_int_arr_IloI = new int[8];
        for (int i = 0; i < 5; ++i) {
            I1_I.var_int_arr_Ilo[i] = -1;
        }
        lI_ = 140;
        lI_I = 160;
        IO_o = false;
        IOO = false;
        var_java_util_Vector_IIIl = new Vector();
    }

    private static /* synthetic */ String IllI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

