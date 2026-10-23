/*
 * Decompiled with CFR 0.152.
 */
public final class I1ol {
    public short II_o;
    public int I_O0 = 0;
    public int I_Oo;
    private long I1;
    private long IlO;
    private boolean III1;
    private int IIOl;
    private int IIlI;
    private boolean I1_l;
    private boolean I1l;
    private String IlI_;
    private int IIO0 = 100;

    public I1ol(short s, int n) {
        this.II_o = s;
        this.I_Oo = n / 60;
        this.I_O0 = n % 60;
        this.IIOl = n;
        this.IIlI = n;
        this.I1 = this.IlO = System.currentTimeMillis();
        this.III1 = s == 14;
    }

    public I1ol() {
    }

    public static boolean II1_(int n) {
        for (int i = 0; i < Ilol.II.size(); ++i) {
            if (((I1ol)Ilol.II.elementAt((int)i)).II_o != n) continue;
            return true;
        }
        return false;
    }

    public static boolean II1O(int n) {
        for (int i = 0; i < I1_I.IIO1.size(); ++i) {
            if (((I1ol)I1_I.IIO1.elementAt((int)i)).II_o != n) continue;
            return true;
        }
        return false;
    }

    public static I1ol II(int n) {
        for (int i = 0; i < Ilol.II.size(); ++i) {
            I1ol i1ol = (I1ol)Ilol.II.elementAt(i);
            if (i1ol.II_o != n) continue;
            return i1ol;
        }
        return null;
    }

    public static I1ol III(int n) {
        for (int i = 0; i < I1_I.IIO1.size(); ++i) {
            I1ol i1ol = (I1ol)I1_I.IIO1.elementAt(i);
            if (i1ol.II_o != n) continue;
            return i1ol;
        }
        return null;
    }

    public void II(byte by, String string, int n) {
        this.I1l = n == -1;
        this.I1_l = true;
        this.I_Oo = n / 60;
        this.I_O0 = n % 60;
        this.II_o = by;
        this.IIOl = n;
        this.IIlI = n;
        this.IlI_ = string;
        this.I1 = this.IlO = System.currentTimeMillis();
        this.III1 = this.II_o == 14;
    }

    public void III(int n, boolean bl) {
        this.I_Oo = n / 60;
        this.I_O0 = n % 60;
        this.IIOl = n;
        this.IIlI = n;
        this.I1_l = false;
        this.I1 = this.IlO = System.currentTimeMillis();
    }

    public void IIIl(IO1l iO1l, int n, int n2) {
        if (this.III1) {
            if (Ilol.II() != null) {
                n = II.IIl / 2 - 40;
                n2 = II.IIlI - 80;
                iO1l.Illl(0x808080);
                iO1l.III_(n, n2, 80, 2);
                iO1l.Illl(0xFFFFFF);
                if (this.IIO0 > 0) {
                    iO1l.III_(n, n2, 80 * this.IIO0 / 100, 2);
                    return;
                }
            }
        } else {
            String string = this.I_Oo + I1ol.Il1_("\u9691", 38582);
            if (this.I_Oo <= 0) {
                string = this.I_O0 + I1ol.Il1_("\u96c5", 38582);
            }
            if (this.I_Oo < 0) {
                string = "";
            }
            if (this.I1l) {
                string = "";
            }
            IO1I.IIII.II(iO1l, this.IlI_ + I1ol.Il1_("\u9696", 38582) + string, n, n2, 0, IO1I.III_);
        }
    }

    public void IIlO() {
        this.I1 = System.currentTimeMillis();
        if (this.I1 - this.IlO >= 1000L) {
            this.IlO = System.currentTimeMillis();
            --this.I_O0;
            --this.IIlI;
            if (this.I_O0 <= 0) {
                this.I_O0 = 60;
                --this.I_Oo;
            }
            if (this.IIOl > 0) {
                this.IIO0 = this.IIlI * 100 / this.IIOl;
            }
        }
        if (this.I_Oo < 0 && !this.I1_l) {
            Ilol.II.removeElement(this);
        }
        if (this.I_Oo < 0 && this.I1_l && !this.I1l) {
            I1_I.IIO1.removeElement(this);
        }
    }

    private static /* synthetic */ String Il1_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

