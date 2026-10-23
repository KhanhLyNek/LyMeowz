/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Il0l {
    public int II0I = 0;
    public int I_O0;
    public int I_Oo;
    private int I_0;
    private int IIO;
    private int IIOI;
    private int IIOl;
    private int IIlI;
    private int IIO1;
    private Ilol III;
    private Il01 II = null;
    private static byte[] III = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
    private static int[] IIOO = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
    private static int[] IIO0 = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};

    public Il0l(Ilol ilol, Il01 il01) {
        this.III = ilol;
        this.II = il01;
    }

    public void IIl1() {
        if (this.III.IIII != null || this.III.IIIl != null) {
            if (this.III.IIII != null) {
                this.I_0 = this.III.IIII.I1;
                this.IIO = this.III.IIII.I1I - this.III.IIII.IIl / 4;
            } else if (this.III.IIIl != null) {
                this.I_0 = this.III.IIIl.I_o_;
                this.IIO = this.III.IIIl.I_oO - this.III.IIIl.IO11 / 4;
            }
            int n = this.I_0 - this.I_O0;
            int n2 = this.IIO - this.I_Oo;
            int n3 = 4;
            if (n + n2 < 60) {
                n3 = 3;
            } else if (n + n2 < 30) {
                n3 = 2;
            }
            if (this.I_O0 != this.I_0) {
                if (n > 0 && n < 5) {
                    this.I_O0 = this.I_0;
                } else if (n < 0 && n > -5) {
                    this.I_O0 = this.I_0;
                } else {
                    this.IIOI = this.I_0 - this.I_O0 << 2;
                    this.IIlI += this.IIOI;
                    this.I_O0 += this.IIlI >> n3;
                    this.IIlI &= 0xF;
                }
            }
            if (this.I_Oo != this.IIO) {
                if (n2 > 0 && n2 < 5) {
                    this.I_Oo = this.IIO;
                } else if (n2 < 0 && n2 > -5) {
                    this.I_Oo = this.IIO;
                } else {
                    this.IIOl = this.IIO - this.I_Oo << 2;
                    this.IIO1 += this.IIOl;
                    this.I_Oo += this.IIO1 >> n3;
                    this.IIO1 &= 0xF;
                }
            }
            n = 0;
            n2 = 0;
            int n4 = 0;
            int n5 = 0;
            if (this.III.IIII != null) {
                n = this.I_0 - this.III.IIII.Iol / 4;
                n4 = this.I_0 + this.III.IIII.Iol / 4;
                n2 = this.IIO - this.III.IIII.IIl / 4;
                n5 = this.IIO + this.III.IIII.IIl / 4;
            } else if (this.III.IIIl != null) {
                n = this.I_0 - this.III.IIIl.IO1l / 4;
                n4 = this.I_0 + this.III.IIIl.IO1l / 4;
                n2 = this.IIO - this.III.IIIl.IO11 / 4;
                n5 = this.IIO + this.III.IIIl.IO11 / 4;
            }
            if (this.II0I > 0) {
                --this.II0I;
            }
            if (this.II0I != 0 && (this.I_O0 < n || this.I_O0 > n4 || this.I_Oo < n2 || this.I_Oo > n5)) {
                return;
            }
        }
        this.IOlI();
    }

    private void IOlI() {
        this.III.II = null;
        this.IIO1 = 0;
        this.IIlI = 0;
        this.IIOl = 0;
        this.IIOI = 0;
        this.IIO = 0;
        this.I_0 = 0;
        this.I_Oo = 0;
        this.I_O0 = 0;
        this.III.IOoI();
    }

    public void II(IO1l iO1l) {
        int n;
        int n2 = this.I_0 - this.I_O0;
        int n3 = this.IIO - this.I_Oo;
        n2 = I_Ol.III1(n2, -n3);
        n3 = 0;
        while (true) {
            if (n3 >= IIOO.length - 1) {
                n = 0;
                break;
            }
            if (n2 >= IIOO[n3] && n2 <= IIOO[n3 + 1]) {
                n = n3 >= 16 ? 0 : n3;
                break;
            }
            ++n3;
        }
        I_oo.IIII(iO1l, this.II.IIOo[III[n]], this.I_O0, this.I_Oo, IIO0[n], 3);
    }
}

