/*
 * Decompiled with CFR 0.152.
 */
public final class I100 {
    public int lIoI;
    public byte II0I;
    public I10o II;

    public I100() {
    }

    public I100(int n, int n2) {
        if (n == 22) {
            n = 6;
            n2 *= 1000;
        }
        if (n == 23) {
            n = 7;
            n2 *= 1000;
        }
        this.lIoI = n2;
        this.II = I1_I.II().II[n];
    }

    public String IIl() {
        return I_1l.III(this.II.II1o, I100.Il1l("\u8946", 35173), String.valueOf(this.lIoI));
    }

    public String IIlI() {
        return I_1l.III(this.II.II1o, I100.Il1l("\u8941", 35173), "");
    }

    private static /* synthetic */ String Il1l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

