package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I101 {
    public I100[] var_I100_arr_III;
    public I1o var_I1o_II;
    public I_lO var_I_lO_IIOo;
    public int lIO1;
    public int IoIO;
    public boolean IO0I;
    public int lIO_;
    public int I1l1;
    public int IIO1;
    public long Iloo;
    public boolean I1lI;
    public int lIOO;
    public int var_int_IIOo;
    public int II0;
    public int var_int_II;
    public int var_int_III;
    public int IIII;
    public int lIO0;
    public int III1;
    public int III_;
    public short II_1 = (short)-1;
    public byte IIO0 = (byte)-1;
    public int IIl;
    public boolean IIlI;
    public boolean IIll = false;
    public String IlIO = "";
    public int lIOo;
    public byte var_byte_IIOo;
    public boolean IO0l;
    public int I1_o = -1;
    public int I1O = -1;
    public int I1OI = -1;
    public int I1Ol = -1;
    public String IlI0 = "";
    public String IlIo;
    public String Ill;

    public I101() {
        int[] nArray = new int[]{0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 0x331100, 4199680, 5052928, 0x320033, 0x3C0033, 4587571, 5046280, 0x66000A, 0x334400};
        int[][] nArrayArray = new int[][]{{18687, 16869, 15052, 13235, 11161, 9344}, {45824, 39168, 32768, 26112, 19712, 13056}, {0xFF7F00, 15037184, 0xCC6600, 11753728, 10046464, 0x804000}, {13500671, 12058853, 10682572, 9371827, 7995545, 0x660080}, {16711705, 15007767, 13369364, 11730962, 0x99000F, 0x80000D}};
        nArray = new int[]{2, 1, 1, 1, 1, 1};
    }

    public void IIl1() {
        this.lIOo = II.var_I_1o_II.III(this);
    }

    public final boolean II11(int n) {
        for (int i = 0; i < this.var_I100_arr_III.length; ++i) {
            I100 i100 = this.var_I100_arr_III[i];
            if (i100 == null || i100.II.I1l != n) continue;
            return true;
        }
        return false;
    }

    public final boolean IIo0() {
        return this.var_I1o_II.II0l >= 0 && this.var_I1o_II.II0l < 6 || this.var_I1o_II.II0l == 32 || this.var_I1o_II.II0l == 35 || this.var_I1o_II.II0l == 11 || this.var_I1o_II.II0l == 23;
    }

    public void II(int n, int n2, int n3, int n4) {
        this.I1_o = n;
        this.I1O = n2;
        this.I1OI = n3;
        this.I1Ol = n4;
    }

    public String IIIo() {
        int n;
        String string = this.var_I1o_II.II1o;
        if (this.var_I100_arr_III != null) {
            for (n = 0; n < this.var_I100_arr_III.length; ++n) {
                if (this.var_I100_arr_III[n].II.I1l != 72) continue;
                string = string + I101.Il1("\u7220\u7244\u7215", 29184) + this.var_I100_arr_III[n].lIoI + I101.Il1("\u725d", 29184);
                break;
            }
        }
        if (this.var_I100_arr_III != null) {
            for (n = 0; n < this.var_I100_arr_III.length; ++n) {
                String string2;
                if (this.var_I100_arr_III[n].II.II1o.startsWith(I101.Il1("\u7224", 29184))) {
                    string2 = this.var_I100_arr_III[n].IIlI();
                    if (this.var_I100_arr_III[n].lIoI == 1) {
                        string = string + I101.Il1("\u720a", 29184) + string2;
                    }
                    if (this.var_I100_arr_III[n].lIoI != 0) continue;
                    string = string + I101.Il1("\u720a", 29184) + string2;
                    continue;
                }
                string2 = this.var_I100_arr_III[n].IIl();
                if (string2.equals("") || this.var_I100_arr_III[n].II.I1l == 72) continue;
                string = string + I101.Il1("\u720a", 29184) + string2;
            }
        }
        if (this.var_I1o_II.lIol > 1) {
            string = string + I101.Il1("\u720a", 29184) + IO11.I_oo + I101.Il1("\u723a\u723f", 29184) + this.var_I1o_II.lIol;
        }
        return string + I101.Il1("\u720a", 29184) + this.var_I1o_II.IllI;
    }

    private static /* synthetic */ String Il1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

