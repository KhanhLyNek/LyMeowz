package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I___ {
    public byte var_byte_IIO1;
    public int I_O0;
    public int I_Oo;
    public int I_0;
    public int IIO;
    public int IIOI;
    public int IIOl;
    public int IIlI;
    public int var_int_IIO1;
    public int IIO_;
    public int IoII;
    public int IIO0;
    public boolean I__I = false;
    public boolean IIl = false;
    public boolean I01o = false;
    public I11o IIl_;
    public I11o var_I11o_IIlO;
    private byte[] var_byte_arr_IIlO = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
    public byte[] IIl0 = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
    public byte[] IIlo = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};

    public void IIl1() {
        ++this.var_int_IIO1;
        this.I_O0 += this.IIO;
        this.I_Oo += this.IIOI;
    }

    public final int IIlI(int n) {
        int n2;
        if (n > 15 && n <= 345) {
            if ((n = (n - 15) / 15 + 1) > 24) {
                n = 24;
            }
            n2 = this.var_byte_arr_IIlO[n];
        } else {
            n2 = 12;
        }
        return n2;
    }

    public void II(IO1l iO1l, I11o i11o, int n, boolean bl) {
        if (i11o != null) {
            n = i11o.I_Oo / 3;
            if (n <= 0) {
                n = 1;
            }
            int n2 = i11o.I_Oo > 3 ? (this.var_int_IIO1 / 3 % 2 == 0 ? 0 : 3) : this.var_int_IIO1 % n;
            n = n * this.IIl0[this.IoII] + n2;
            if (i11o.I_Oo < 3) {
                n = this.var_int_IIO1 / 3 % i11o.I_Oo;
            }
            i11o.II(n, this.I_O0, this.I_Oo, this.IIlo[this.IoII], 3, iO1l);
        }
    }
}

