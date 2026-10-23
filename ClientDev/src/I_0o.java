package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I_0o {
    public I_o1 II;
    public short II0I;
    public int l1__;
    public long I1;
    public int l1_O;
    public long I1IO;
    public int l1_0;
    public int l1_o;
    public int l1O;
    public boolean I0Ol = false;
    public short IIO;
    public String Il_;
    public short II_l;

    public final String IIll() {
        if (this.l1_O % 1000 == 0) {
            return String.valueOf(this.l1_O / 1000);
        }
        int n = this.l1_O % 1000;
        return this.l1_O / 1000 + I_0o.Ilol("\udcfd", 56531) + (n % 100 == 0 ? n / 100 : n / 10);
    }

    private static /* synthetic */ String Ilol(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

