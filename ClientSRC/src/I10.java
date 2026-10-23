/*
 * Decompiled with CFR 0.152.
 */
public final class I10 {
    public int II0I;
    public int I_O0;
    public int I_Oo;
    public int I_0;
    public int IIO;
    public int IIOI;
    public int IIOl = 1;
    public int IIlI;
    public int IIO1;
    public String IlI1;
    public String IlI_;
    public short II_I;
    public short II_l;
    public long IlO0;

    public I10(int n, short s, String string, String string2, int n2, short s2) {
        new I_lO(I10.Ill0("\u4395\u4467\u4442\u4409\u4431\u4418\u44f2\u449c\u44b8\u4492\u4570\u455d\u4539\u4502\u45e7\u45c1\u45bc\u459c\u4676", 17379));
        this.II0I = n;
        this.II_I = s;
        this.IlI1 = string;
        this.IlI_ = string2;
        this.II_l = s2;
        this.IlO0 = II.II;
        this.I_O0 = n2;
        if (this.I_O0 <= 0) {
            this.I_O0 = 1;
        }
        this.I_Oo = 0;
        this.I_0 = 0;
        this.IIO = 4;
        this.IIOI = 6;
    }

    public void II(int n, int n2, int n3) {
        this.II0I = n;
        this.IIlI = n2;
        this.IIO1 = n3;
    }

    private static /* synthetic */ String Ill0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

