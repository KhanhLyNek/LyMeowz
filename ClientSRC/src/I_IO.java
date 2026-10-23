/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I_IO {
    private static Image Il0l = IO10.IIII(I_IO.Il_1("\u9882\u98a1\u988a\u9963\u9947\u9901\u990a\u99e7\u99c2\u99a1\u99cc\u9a6f\u9a58\u9a14\u9a3a\u9a06\u9ae9\u9ac9\u9aa9\u9a9f\u9b2b\u9b5c\u9b3a\u9b19\u9bf7\u9bf7\u9bb2\u9b82\u9c72\u9c58\u9c2e\u9c40\u9cfd\u9cc2\u9cac", 39085));
    private static int I_0;
    private static int IIO;
    private static int IIOI;
    private static int IIOl;
    private static int IIlI;
    private static int IIO1;
    private static int IIO_;
    private static int IoII;
    public static boolean I0l1;
    private static int IIO0;
    private static int IIOo;
    private static int II0;
    private static int II;
    public static boolean I0l_;

    public static void III(IO1l iO1l, int n, int n2) {
        if (IIIl.II_1 && IlI.III().II_1) {
            IIIl.II_1 = false;
            new Thread(new I_I0()).start();
        }
        if (!I0l_) {
            if (II.IIIO % 3 == 0) {
                if (Ilol.II().IOI1 == 1) {
                    IIlI = n - 20 - I1_I.Io1;
                }
                if (Ilol.II().IOI1 == -1) {
                    IIlI = n + 20 - I1_I.Io1;
                }
            }
            I_0 = Ilol.II().I_oO - 40 - I1_I.Io1I;
        } else {
            if (++IIO0 == 5) {
                I0l_ = false;
                IIO0 = 0;
            }
            IIlI = n - I1_I.Io1;
            I_0 = n2 - I1_I.Io1I;
        }
        II = IIO1 > n - I1_I.Io1 ? -1 : 1;
        iO1l.II(I1_I.Il_I, IIO1, IIO - 40, 3);
        I__O.II(iO1l, IIO1 - 25, IIO - 70, 50, 20, 0xFFFFFF, false);
        int n3 = IIO - 65;
        IO1I.III_.II(iO1l, I1_I.II().IlII, IIO1, n3, 2);
        if (I0l1) {
            I0l1 = false;
            I1lI.III(new I1ll(18, IIO1 + I1_I.Io1, IIO + I1_I.Io1I, 2, 10, -1));
            I1_I.II().IIIO = null;
            IIlI = -I1_I.Io1;
            I_0 = -I1_I.Io1I;
        }
        iO1l.II(Il0l, 0, II0 * 40, 40, 40, II == 1 ? 0 : 2, IIO1, IIO + 3 + (II.IIIO % 10 > 5 ? 1 : 0), 3);
        if (IIO != I_0) {
            IIOl = I_0 - IIO << 2;
            IIO += (IIOI += IIOl) >> 4;
            IIOI &= 0xF;
        }
        if (IIO1 != IIlI) {
            IoII = IIlI - IIO1 << 2;
            IIO1 += (IIO_ += IoII) >> 4;
            IIO_ &= 0xF;
        }
        if (++IIOo == 5) {
            IIOo = 0;
            if (++II0 > 2) {
                II0 = 0;
            }
        }
    }

    static {
        IIO0 = 0;
    }

    private static /* synthetic */ String Il_1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

