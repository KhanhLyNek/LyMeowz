package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class Il0o {
    public int II0I;
    public int I_O0;
    public short var_short_IIII;
    public int I_0;
    public int IIO;
    public int IIOI;
    public int IIOl;
    public byte var_byte_III;
    public int[] II0o;
    public int[] IIo;
    public static I_l_ var_I_l__III;
    public static I_lO III0;
    public static I_lO IIIo;
    public static byte[] var_byte_arr_IIII;
    private int II = 0;
    private int var_int_III = 0;
    private static int[] IIo0;

    public static void IIl1() {
        var_I_l__III.clear();
        III0.removeAllElements();
        IIIo.removeAllElements();
    }

    public static boolean IIIO(String string) {
        for (int i = 0; i < III0.size(); ++i) {
            if (!((String)III0.elementAt(i)).equals(string)) continue;
            return true;
        }
        return false;
    }

    private boolean II() {
        for (int i = 0; i < IIo0.length; ++i) {
            if (this.var_short_IIII != IIo0[i]) continue;
            return true;
        }
        return false;
    }

    public void II(IO1l iO1l) {
        if (!(Ilol.var_boolean_I10I || this.var_short_IIII == 279 && I1_I.I1_I_II().lIOI >= 110)) {
            int n = I1_I.Io1;
            int n2 = I1_I.Io1I;
            Image image = (Image)var_I_l__III.get(String.valueOf(this.var_short_IIII));
            if (image != null) {
                if (this.var_short_IIII == 96) {
                    return;
                }
                if (this.var_byte_III == 4) {
                    this.II = -n / 2 + 100;
                }
                if (this.var_short_IIII == 28 && this.var_byte_III == 3) {
                    this.II = -n / 3 + 200;
                }
                if ((this.var_short_IIII == 67 || this.var_short_IIII == 68 || this.var_short_IIII == 69 || this.var_short_IIII == 70) && this.var_byte_III == 3) {
                    this.II = -n / 3 + 200;
                }
                if (this.II() && this.var_byte_III < 4) {
                    this.II = -(n >> 4) + 50;
                    this.var_int_III = (n2 >> 5) - 15;
                }
                int n3 = this.I_0 + this.IIOI + this.II;
                int n4 = this.IIO + this.IIOl + this.var_int_III;
                if (this.I_0 + this.IIOI + image.getWidth() + this.II >= n && this.I_0 + this.IIOI + this.II <= n + II.var_int_IIl && this.IIO + this.IIOl + this.var_int_III + image.getHeight() >= n2 && this.IIO + this.IIOl + this.var_int_III <= n2 + II.var_int_IIlI) {
                    iO1l.II(image, 0, 0, IO1l.II(image), IO1l.III(image), this.I_O0, this.I_0 + this.IIOI + this.II, this.IIO + this.IIOl + this.var_int_III, 0);
                    if (this.var_short_IIII == 11 && IOlO.l1oI != 122) {
                        iO1l.IIIO(n3, n4 + 24, 48, 14);
                        for (int i = 0; i < 2; ++i) {
                            iO1l.II(IOlO.IIO_, 0, (II.var_int_IIIO % 8 >> 2) * 24, 24, 24, 0, n3 + i * 24, n4 + 24, 0);
                        }
                        iO1l.IIIO(I1_I.Io1, I1_I.Io1I, I1_I.var_int_I_0, I1_I.var_int_IIO);
                    }
                }
                if (IOlO.Ill1() && this.var_short_IIII > 137 && this.var_short_IIII != 156 && this.var_short_IIII != 159 && this.var_short_IIII != 157 && this.var_short_IIII != 165 && this.var_short_IIII != 167 && this.var_short_IIII != 168 && this.var_short_IIII != 169 && this.var_short_IIII != 170 && this.var_short_IIII != 238 && IOlO.l100 - (this.I_0 + this.IIOI + this.II) >= n && IOlO.l100 - (this.I_0 + this.IIOI + this.II + image.getWidth()) <= n + II.var_int_IIl && this.IIO + this.IIOl + this.var_int_III + image.getHeight() >= n2 && this.IIO + this.IIOl + this.var_int_III <= n2 + II.var_int_IIlI && (this.var_short_IIII < 241 || this.var_short_IIII >= 266)) {
                    iO1l.II(image, 0, 0, IO1l.II(image), IO1l.III(image), 2, IOlO.l100 - (this.I_0 + this.IIOI + this.II) - IO1l.II(image), this.IIO + this.IIOl + this.var_int_III, 0);
                }
            }
        }
    }

    static {
        var_I_l__III = new I_l_(Il0o.II0O("\u6dda\u6dbf\u6d96\u6e5e\u6e4a\u6e39\u6e4d\u6ece\u6ecc\u6e83\u6e9d\u6f6d\u6f4a", 28083));
        III0 = new I_lO(Il0o.II0O("\u6dc5\u6d99\u6d94\u6e69\u6e61\u6e2b\u6e1a\u6eff", 28083));
        IIIo = new I_lO(Il0o.II0O("\u6dc5\u6d99\u6d94\u6e69\u6e63\u6e2f\u6e1e\u6ef8", 28083));
        IIo0 = new int[]{79, 80, 81, 85, 86, 90, 91, 92, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108};
    }

    private static /* synthetic */ String II0O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

