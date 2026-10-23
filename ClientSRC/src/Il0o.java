/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Il0o {
    public int II0I;
    public int I_O0;
    public short IIII;
    public int I_0;
    public int IIO;
    public int IIOI;
    public int IIOl;
    public byte III;
    public int[] II0o;
    public int[] IIo;
    public static I_l_ III = new I_l_(Il0o.II0O("\u6dda\u6dbf\u6d96\u6e5e\u6e4a\u6e39\u6e4d\u6ece\u6ecc\u6e83\u6e9d\u6f6d\u6f4a", 28083));
    public static I_lO III0 = new I_lO(Il0o.II0O("\u6dc5\u6d99\u6d94\u6e69\u6e61\u6e2b\u6e1a\u6eff", 28083));
    public static I_lO IIIo = new I_lO(Il0o.II0O("\u6dc5\u6d99\u6d94\u6e69\u6e63\u6e2f\u6e1e\u6ef8", 28083));
    public static byte[] IIII;
    private int II = 0;
    private int III = 0;
    private static int[] IIo0;

    public static void IIl1() {
        III.clear();
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
            if (this.IIII != IIo0[i]) continue;
            return true;
        }
        return false;
    }

    public void II(IO1l iO1l) {
        if (!(Ilol.I10I || this.IIII == 279 && I1_I.II().lIOI >= 110)) {
            int n = I1_I.Io1;
            int n2 = I1_I.Io1I;
            Image image = (Image)III.get(String.valueOf(this.IIII));
            if (image != null) {
                if (this.IIII == 96) {
                    return;
                }
                if (this.III == 4) {
                    this.II = -n / 2 + 100;
                }
                if (this.IIII == 28 && this.III == 3) {
                    this.II = -n / 3 + 200;
                }
                if ((this.IIII == 67 || this.IIII == 68 || this.IIII == 69 || this.IIII == 70) && this.III == 3) {
                    this.II = -n / 3 + 200;
                }
                if (this.II() && this.III < 4) {
                    this.II = -(n >> 4) + 50;
                    this.III = (n2 >> 5) - 15;
                }
                int n3 = this.I_0 + this.IIOI + this.II;
                int n4 = this.IIO + this.IIOl + this.III;
                if (this.I_0 + this.IIOI + image.getWidth() + this.II >= n && this.I_0 + this.IIOI + this.II <= n + II.IIl && this.IIO + this.IIOl + this.III + image.getHeight() >= n2 && this.IIO + this.IIOl + this.III <= n2 + II.IIlI) {
                    iO1l.II(image, 0, 0, IO1l.II(image), IO1l.III(image), this.I_O0, this.I_0 + this.IIOI + this.II, this.IIO + this.IIOl + this.III, 0);
                    if (this.IIII == 11 && IOlO.l1oI != 122) {
                        iO1l.IIIO(n3, n4 + 24, 48, 14);
                        for (int i = 0; i < 2; ++i) {
                            iO1l.II(IOlO.IIO_, 0, (II.IIIO % 8 >> 2) * 24, 24, 24, 0, n3 + i * 24, n4 + 24, 0);
                        }
                        iO1l.IIIO(I1_I.Io1, I1_I.Io1I, I1_I.I_0, I1_I.IIO);
                    }
                }
                if (IOlO.Ill1() && this.IIII > 137 && this.IIII != 156 && this.IIII != 159 && this.IIII != 157 && this.IIII != 165 && this.IIII != 167 && this.IIII != 168 && this.IIII != 169 && this.IIII != 170 && this.IIII != 238 && IOlO.l100 - (this.I_0 + this.IIOI + this.II) >= n && IOlO.l100 - (this.I_0 + this.IIOI + this.II + image.getWidth()) <= n + II.IIl && this.IIO + this.IIOl + this.III + image.getHeight() >= n2 && this.IIO + this.IIOl + this.III <= n2 + II.IIlI && (this.IIII < 241 || this.IIII >= 266)) {
                    iO1l.II(image, 0, 0, IO1l.II(image), IO1l.III(image), 2, IOlO.l100 - (this.I_0 + this.IIOI + this.II) - IO1l.II(image), this.IIO + this.IIOl + this.III, 0);
                }
            }
        }
    }

    static {
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

