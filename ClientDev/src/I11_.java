package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.Vector;

public final class I11_ {
    private static Random var_java_util_Random_III;
    private static Vector var_java_util_Vector_III;
    private static int I_Oo;
    private static int I_0;
    private static int IIO;
    private static int IIOI;
    private static int IIOl;
    private static int IIlI;
    private static int IIO1;
    private static float IIII;
    private static int[] IIoI;
    private static int[] Il_o;
    private static boolean I__I;
    private static long IlO0;
    private static long IlOo;

    public static void II(IO1l iO1l) {
        int n;
        if (I__I) {
            I11_.Il_o[2] = Il_o[1];
            I11_.IIoI[2] = IIoI[1];
            I11_.Il_o[1] = Il_o[0];
            I11_.IIoI[1] = IIoI[0];
            I11_.Il_o[0] = I_0;
            I11_.IIoI[0] = I_Oo;
            I_Oo = (int)(Math.cos((double)IIO * Math.PI / 180.0) * (double)IIO1 * (double)IIlI) + IIOI;
            I_0 = (int)((double)IIO1 * Math.sin((double)IIO * Math.PI / 180.0) * (double)IIlI - (double)(0.0f * (float)IIlI * (float)IIlI / 2.0f));
            if (System.currentTimeMillis() - IlO0 >= IlOo) {
                ++IIlI;
                IlO0 = System.currentTimeMillis();
            }
        }
        if (IIlI > 32 && I__I) {
            I__I = false;
            var_java_util_Vector_III.removeAllElements();
            var_java_util_Vector_III.addElement(new I11O(I_Ol.III_(50, II.var_int_IIl - 50), I_Ol.III_(II.var_int_IIlI - 100, II.var_int_IIlI), 5, 72));
        }
        iO1l.Illl(0);
        iO1l.III_(0, 0, 0, 0);
        iO1l.Illl(0xFF0000);
        for (n = 0; n < var_java_util_Vector_III.size(); ++n) {
            I11O i11O = (I11O)var_java_util_Vector_III.elementAt(n);
            IO1l iO1l2 = iO1l;
            I11O i11O2 = i11O;
            for (int i = 0; i < i11O2.var_java_util_Vector_IIII.size(); ++i) {
                I1I_ i1I_ = (I1I_)i11O2.var_java_util_Vector_IIII.elementAt(i);
                if (i1I_.IIOI < -200) {
                    i11O2.var_java_util_Vector_IIII.removeElementAt(i);
                }
                IO1l iO1l3 = iO1l2;
                I1I_.III(iO1l2, i1I_.II0I - i1I_.IIO, i1I_.I_O0 - i1I_.IIOI, i1I_.IIO_);
                for (int j = 0; j < 2; ++j) {
                    I1I_.III(iO1l3, i1I_.II0I - i1I_.Il1[j], i1I_.I_O0 - i1I_.Il1I[j], i1I_.IIO_);
                }
                if (!i1I_.IIl || System.currentTimeMillis() - i1I_.IlOI < i1I_.Il1O) continue;
                ++i1I_.IIO1;
                i1I_.IlOI = System.currentTimeMillis();
                i1I_.Il1[1] = i1I_.Il1[0];
                i1I_.Il1I[1] = i1I_.Il1I[0];
                i1I_.Il1[0] = i1I_.IIO;
                i1I_.Il1I[0] = i1I_.IIOI;
                i1I_.IIO = (int)(Math.cos((double)i1I_.IIlI * Math.PI / 180.0) * (double)i1I_.I_Oo * (double)i1I_.IIO1) + i1I_.I_0;
                i1I_.IIOI = (int)((double)i1I_.I_Oo * Math.sin((double)i1I_.IIlI * Math.PI / 180.0) * (double)i1I_.IIO1 - (double)(i1I_.III * (float)i1I_.IIO1 * (float)i1I_.IIO1 / 2.0f)) + i1I_.IIOl;
            }
        }
        if (!I__I) {
            n = -(Math.abs(var_java_util_Random_III.nextInt() % 3) + 5);
            if (n == -5 && !I__I) {
                IIOI = 0;
                IIO = 80;
                I__I = true;
                I11_.IIl1();
                return;
            }
            if (n == -7 && !I__I) {
                IIO = 60;
                IIOI = 0;
                I__I = true;
                I11_.IIl1();
                return;
            }
            if (n == -6 && !I__I) {
                IIO = 120;
                IIOI = 0;
                I__I = true;
                I11_.IIl1();
            }
        }
    }

    private static void IIl1() {
        IIOl = 0;
        IIO1 = 16;
        IIlI = 0;
        IIII = 0.0f;
        for (int i = 0; i < 3; ++i) {
            I11_.Il_o[i] = 0;
            I11_.IIoI[i] = IIOI;
        }
        I__I = true;
    }

    static {
        var_java_util_Random_III = new Random();
        var_java_util_Vector_III = new Vector();
        IIoI = new int[3];
        Il_o = new int[3];
        I__I = false;
        IlO0 = 0L;
        IlOo = 150L;
    }
}

