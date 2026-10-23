package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I_10 {
    private static int ll1l = 15787715;
    private static Image[] III0 = new Image[6];
    public static int II0I;
    private static int I_0;

    public I_10() {
        int[] nArray = new int[]{15970400, -844109861, 0x225544, 16374659, 15906669, 12931125, 3108954};
    }

    public static void II(IO1l iO1l, I1Il i1Il, I1Il i1Il2, I1Il i1Il3) {
        IO1I iO1I = IO1I.III_;
        if (i1Il != null && (I_0 = iO1I.IIII(i1Il.IIoO)) > 0) {
            if (i1Il.I1 >= 0 && i1Il.I1I > 0) {
                i1Il.II(iO1l);
            } else {
                iO1l.II(IO1_.l_l == 0 ? I1_I.IlIo : I1_I.IlI0, 1, II.var_int_IIlI - IO1_.llo_ - 1, 0);
                iO1I.II(iO1l, i1Il.IIoO, 35, II.var_int_IIlI - IO1_.llo_ + 3 + 3, 2);
            }
        }
        if (i1Il2 != null && (I_0 = iO1I.IIII(i1Il2.IIoO)) > 0) {
            if (i1Il2.I1 > 0 && i1Il2.I1I > 0) {
                i1Il2.II(iO1l);
            } else {
                iO1l.II(IO1_.l_l == 1 ? I1_I.IlIo : I1_I.IlI0, II.var_int_IIll - 35, II.var_int_IIlI - IO1_.llo_ - 1, 0);
                iO1I.II(iO1l, i1Il2.IIoO, II.var_int_IIll, II.var_int_IIlI - IO1_.llo_ + 3 + 3, 2);
            }
        }
        if (i1Il3 != null && (I_0 = iO1I.IIII(i1Il3.IIoO)) > 0) {
            if (i1Il3.I1 > 0 && i1Il3.I1I > 0) {
                i1Il3.II(iO1l);
                return;
            }
            iO1l.II(IO1_.l_l == 2 ? I1_I.IlIo : I1_I.IlI0, II.var_int_IIl - 71, II.var_int_IIlI - IO1_.llo_ - 1, 0);
            iO1I.II(iO1l, i1Il3.IIoO, II.var_int_IIl - 35, II.var_int_IIlI - IO1_.llo_ + 3 + 3, 2);
        }
    }

    public void II(IO1l iO1l, int n, int n2, int n3, int n4, String[] stringArray) {
        I_10.III(n, n2, n3, 69, iO1l);
        n2 = n2 + 20 - IO1I.II1l.IIOl();
        n4 = 0;
        while (n4 < stringArray.length) {
            IO1I.II1l.II(iO1l, stringArray[n4], n + n3 / 2, n2, 2);
            ++n4;
            n2 += IO1I.II1l.IIOl();
        }
    }

    public static void II(int n, int n2, int n3, int n4, IO1l iO1l) {
        iO1l.Illl(9340251);
        iO1l.III1(n + 18, n2, (n3 - 36) / 2 - 32, n4);
        iO1l.III1(n + 18 + (n3 - 36) / 2 + 32, n2, (n3 - 36) / 2 - 22, n4);
        iO1l.III1(n, n2 + 8, n3, n4 - 17);
        iO1l.Illl(ll1l);
        iO1l.III_(n + 18, n2 + 3, (n3 - 36) / 2 - 32, n4 - 4);
        iO1l.III_(n + 18 + (n3 - 36) / 2 + 31, n2 + 3, (n3 - 38) / 2 - 22, n4 - 4);
        iO1l.III_(n + 1, n2 + 6, n3 - 1, n4 - 11);
        iO1l.Illl(14667919);
        iO1l.III_(n + 18, n2 + 1, (n3 - 36) / 2 - 32, 2);
        iO1l.III_(n + 18 + (n3 - 36) / 2 + 32, n2 + 1, (n3 - 36) / 2 - 12, 2);
        iO1l.III_(n + 18, n2 + n4 - 2, (n3 - 36) / 2 - 31, 2);
        iO1l.III_(n + 18 + (n3 - 36) / 2 + 32, n2 + n4 - 2, (n3 - 36) / 2 - 31, 2);
        iO1l.III_(n + 1, n2 + 11, 2, n4 - 18);
        iO1l.III_(n + n3 - 2, n2 + 11, 2, n4 - 18);
        iO1l.II(III0[0], n - 3, n2 - 2, 20);
        iO1l.II(III0[2], n + n3 + 3, n2 - 2, IOII.l1O_);
        iO1l.II(III0[1], n - 3, n2 + n4 + 3, IOII.l1OO);
        iO1l.II(III0[3], n + n3 + 4, n2 + n4 + 2, IOII.l1O0);
        iO1l.II(III0[4], n + n3 / 2, n2, IOII.II0I);
        iO1l.II(III0[5], n + n3 / 2, n2 + n4 + 1, IOII.I_Oo);
    }

    public static void III(int n, int n2, int n3, int n4, IO1l iO1l) {
        iO1l.Illl(13524492);
        iO1l.III1(n + 6, n2, n3 - 12, n4);
        iO1l.III1(n, n2 + 6, n3, n4 - 12);
        iO1l.III1(n + 7, n2 + 1, n3 - 14, n4 - 2);
        iO1l.III1(n + 1, n2 + 7, n3 - 2, n4 - 14);
        iO1l.Illl(14338484);
        iO1l.III_(n + 8, n2 + 2, n3 - 16, n4 - 3);
        iO1l.III_(n + 2, n2 + 8, n3 - 3, n4 - 14);
        iO1l.II(II.var_javax_microedition_lcdui_Image_arr_IIIl[2], n, n2, 20);
        iO1l.II(II.var_javax_microedition_lcdui_Image_arr_IIIl[2], 0, 0, 16, 16, 2, n + n3 + 1, n2, IOII.l1O_);
        iO1l.II(II.var_javax_microedition_lcdui_Image_arr_IIIl[2], 0, 0, 16, 16, 1, n, n2 + n4 + 1, IOII.l1OO);
        iO1l.II(II.var_javax_microedition_lcdui_Image_arr_IIIl[2], 0, 0, 16, 16, 3, n + n3 + 1, n2 + n4 + 1, IOII.l1O0);
    }

    public static void IIII(int n, int n2, int n3, int n4, IO1l iO1l) {
        iO1l.Illl(0x664400);
        iO1l.III_(n, n2, n3, n4);
        iO1l.Illl(14338484);
        iO1l.III_(n + 1, n2 + 1, n3 - 2, n4 - 2);
    }

    static {
        for (int i = 0; i < III0.length; ++i) {
            I_10.III0[i] = IO10.IIII(I_10.IlO1("\u1661\u1600\u16ed\u16c2\u16a4\u16a0\u1765\u1746\u1721\u1700\u17ab\u17ce\u17bb\u17b5\u1865\u1867\u184a\u1828\u180e\u18fe\u1888\u18bd\u189f\u1978\u1955", 5710) + (i + 1) + I_10.IlO1("\u1660\u161d\u16e2\u16cc", 5710));
        }
        II0I = 24;
        I_0 = 0;
        IO10.IIII(I_10.IlO1("\u1661\u1600\u16ed\u16c2\u16a4\u16a0\u1765\u1746\u1721\u1700\u17ab\u17ce\u17bb\u17b5\u1865\u1867\u184a\u1828\u180e\u18fe\u1888\u18bd\u189b\u197f\u1953\u1936\u191f\u19bd\u19c2\u19bf\u1997", 5710));
    }

    private static /* synthetic */ String IlO1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

