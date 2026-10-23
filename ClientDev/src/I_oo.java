package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class I_oo {
    public static int[][] IIlo;
    public static Image[] IIl;
    public static I_oO[] II;
    public static I_lO II_I;
    private static Image IIO1;
    public static byte[] IIII;
    private static int IIlI;
    public static short II0l;

    public static void Io0O() {
        if (IIl == null) {
            IIl = new Image[]{IO10.III(I_oo.Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd2\uee2f\uee50\uee51\uee39", 60650)), IO10.III(I_oo.Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd3\uee2f\uee50\uee51\uee39", 60650)), IO10.III(I_oo.Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd0\uee2f\uee50\uee51\uee39", 60650)), IO10.III(I_oo.Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd1\uee2f\uee50\uee51\uee39", 60650))};
            System.gc();
        }
    }

    public static void Io00() {
        System.gc();
        IIO1 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
    }

    public I_oo() {
        I_oo.Io0o();
    }

    public static void IIl_() {
        new I_oo();
    }

    private static void Io0o() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I_oo.Ilo_("\ueca4\ued5b\ued77\ued2e\ued0b\uede4\uedc3\ueda6", 60650))));
            int n = dataInputStream.readShort();
            IIlo = new int[n][5];
            for (int i = 0; i < n; ++i) {
                I_oo.IIlo[i][0] = dataInputStream.readUnsignedByte();
                I_oo.IIlo[i][1] = dataInputStream.readShort();
                I_oo.IIlo[i][2] = dataInputStream.readShort();
                I_oo.IIlo[i][3] = dataInputStream.readShort();
                I_oo.IIlo[i][4] = dataInputStream.readShort();
                if (i >= 84 && i <= 90 || i >= 372 && i <= 384 || i >= 371 && i <= 377 || IIlo[i][1] < 256 && IIlo[i][3] < 256 && IIlo[i][2] < 256 && IIlo[i][4] < 256) continue;
                I_oo.IIlo[i] = null;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void IlIo(int n) {
        Image image = IO10.IIII(I_oo.Ilo_("\uecc5\ued5a\ued45\ued26\ued0a\uede9\ueded\uedae\ued83\uee66\uee45\uee10\uee0d\uee10\ueefd\ueed7\ueeb6", 60650) + n + I_oo.Ilo_("\uecc4\ued79\ued46\ued20", 60650));
        if (image != null) {
            I_oo.II[n] = new I_oO(image, n);
        } else {
            boolean bl = false;
            byte[] byArray = I_O1.II(IO1l.l_I0 + I_oo.Ilo_("\uecb9\ued64\ued49\ued2b\ued0a", 60650) + n);
            if (byArray != null) {
                if (IIII != null && byArray.length % 127 != IIII[n]) {
                    bl = true;
                }
                if (!bl) {
                    Image image2 = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
                    if (image2 != null) {
                        I_oo.II[n] = new I_oO(image2, n);
                    } else {
                        bl = true;
                    }
                }
            } else {
                bl = true;
            }
            if (bl) {
                I_oo.II[n] = new I_oO(IIO1, n);
                I_0_.II().IIoo(n);
            }
        }
    }

    public static void III(IO1l iO1l, int n, int n2, int n3, int n4, int n5) {
        I_oo.IIII(iO1l, n, n2, n3, 0, n5);
    }

    public static void IIII(IO1l iO1l, int n, int n2, int n3, int n4, int n5) {
        try {
            if (IIl == null) {
                I_oO i_oO = II[n];
                if (i_oO == null) {
                    I_oo.IlIo(n);
                    return;
                }
                iO1l.II(i_oO.I1I1, 0, 0, IO1l.II(i_oO.I1I1), IO1l.III(i_oO.I1I1), n4, n2, n3, n5);
                return;
            }
            if (IIlo != null) {
                if (n < IIlo.length && IIlo[n] != null && IIlo[n][1] < 256 && IIlo[n][3] < 256 && IIlo[n][2] < 256 && IIlo[n][4] < 256) {
                    if (IIlo[n][0] != 4 && IIl[IIlo[n][0]] != null) {
                        iO1l.II(IIl[IIlo[n][0]], IIlo[n][1], IIlo[n][2], IIlo[n][3], IIlo[n][4], n4, n2, n3, n5);
                        return;
                    }
                    I_oO i_oO = II[n];
                    if (i_oO == null) {
                        I_oo.IlIo(n);
                        return;
                    }
                    i_oO.II(iO1l, n4, n2, n3, n5);
                    return;
                }
                I_oO i_oO = II[n];
                if (i_oO == null) {
                    I_oo.IlIo(n);
                    return;
                }
                i_oO.II(iO1l, n4, n2, n3, n5);
                return;
            }
            if (II.var_IO1__II != I1_I.I1_I_II()) {
                I_oO i_oO = II[n];
                if (i_oO == null) {
                    I_oo.IlIo(n);
                    return;
                }
                i_oO.II(iO1l, n4, n2, n3, n5);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void II(IO1l iO1l, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        try {
            if (IIl == null) {
                I_oO i_oO = II[n];
                if (i_oO == null) {
                    I_oo.IlIo(n);
                    return;
                }
                iO1l.II(i_oO.I1I1, 0, n2 * n5, n5, n6, n7, n3, n4, n8);
                return;
            }
            if (IIlo != null) {
                if (n < IIlo.length && IIlo[n] != null && IIlo[n][1] < 256 && IIlo[n][3] < 256 && IIlo[n][2] < 256 && IIlo[n][4] < 256) {
                    if (IIlo[n][0] != 4 && IIl[IIlo[n][0]] != null) {
                        iO1l.II(IIl[IIlo[n][0]], 0, n2 * n5, n5, n6, n7, n3, n4, n8);
                        return;
                    }
                    I_oO i_oO = II[n];
                    if (i_oO == null) {
                        I_oo.IlIo(n);
                        return;
                    }
                    i_oO.II(iO1l, n7, n2, n3, n4, n5, n6, n8);
                    return;
                }
                I_oO i_oO = II[n];
                if (i_oO == null) {
                    I_oo.IlIo(n);
                    return;
                }
                i_oO.II(iO1l, n7, n2, n3, n4, n5, n6, n8);
                return;
            }
            if (II.var_IO1__II != I1_I.I1_I_II()) {
                I_oO i_oO = II[n];
                if (i_oO == null) {
                    I_oo.IlIo(n);
                    return;
                }
                i_oO.II(iO1l, n7, n2, n3, n4, n5, n6, n8);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void IIlO() {
        int n = 0;
        if (II.var_int_IIIO % 1000 == 0) {
            for (int i = 0; i < II.length; ++i) {
                if (II[i] == null) continue;
                ++n;
                I_oO i_oO = II[i];
                ++i_oO.I_0;
                if (i_oO.I_0 - i_oO.I_Oo > 1 && !Ilol.Ilol_II().IIl0(i_oO.I_O0)) {
                    I_oo.II[i_oO.I_O0] = null;
                }
                ++IIlI;
            }
            if (n > 200 && II.var_boolean_II) {
                II = new I_oO[II0l];
            }
        }
    }

    static {
        II_I = new I_lO(I_oo.Ilo_("\uec9c\ued42\ued4d\ued3e\ued15", 60650));
        IIO1 = null;
    }

    private static /* synthetic */ String Ilo_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

