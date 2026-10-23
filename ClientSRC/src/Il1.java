/*
 * Decompiled with CFR 0.152.
 */
class Il1
implements I1_1 {
    private int I1l;
    private String II1o;

    public Il1(int n, String string) {
        this.I1l = n;
        this.II1o = string;
    }

    @Override
    public void II(int n, Object object) {
        if (this.II1o.equals(Il1.II_1("\u160a\u16ed\u16d8\u169f\u169a\u176a\u174a\u172d\u171b\u17f3", 5759))) {
            this.I_O1();
        } else if (this.II1o.equals(Il1.II_1("\u160a\u16ed\u16d8\u168c\u1694\u1768\u1758\u172c\u1716", 5759))) {
            this.I_Ol();
        } else if (this.II1o.equals(Il1.II_1("\u1612\u16fb\u16d3\u16a9\u16a1\u1775\u1757\u173d", 5759))) {
            Il1.I_O_();
        } else if (this.II1o.equals(Il1.II_1("\u160c\u16ea\u16d2\u16ac", 5759))) {
            this.I_OO();
        } else if (this.II1o.equals(Il1.II_1("\u1613\u16f1\u16dc\u16b8\u16b6\u177b\u1749\u1714\u1712\u17f0\u17c1", 5759))) {
            Il1.IIll(0);
        } else if (this.II1o.equals(Il1.II_1("\u1613\u16f1\u16dc\u16b8\u16b6\u177b\u1749\u170a\u171e\u17f1\u17dd\u17a0", 5759))) {
            Il1.IIll(1);
        } else if (this.II1o.equals(Il1.II_1("\u1613\u16f1\u16dc\u16b8\u16b6\u177b\u1749\u171b\u1712\u17f8\u17c1\u17b1\u1781", 5759))) {
            Il1.IIll(2);
        }
    }

    private void I_Ol() {
        byte by = Il1.II(new short[]{1884, 921, 454});
        if (by == -1) {
            I1_I.II.IIII(Il1.II_1("\u1634\u16f6\u1649\u16b2\u169c\u173a\u174d\u17b4\u171a\u17b6\u17c1\u17bc\u0956\u186b\u1811\u1832\u189b\u18e0\u18ca\u18ec\u189f\u196b\u1940", 5759), 0);
        } else {
            I_0_.II().II((byte)0, (byte)1, by, (short)-1);
        }
    }

    private void I_O1() {
        byte by = Il1.II(new short[]{194, 193});
        if (by == -1) {
            I1_I.II.IIII(Il1.II_1("\u1634\u16f6\u1649\u16b2\u169c\u173a\u174d\u17b4\u171a\u17b6\u17c1\u17bc\u0956\u186b\u1811\u1833\u180e\u18fe\u18de\u18b9\u1887\u196f", 5759), 0);
        } else {
            I_0_.II().II((byte)0, (byte)1, by, (short)-1);
        }
    }

    private static byte II(short[] sArray) {
        Ilol ilol = Ilol.II();
        for (byte by = 0; by < ilol.II.length; by = (byte)((byte)(by + 1))) {
            I101 i101 = ilol.II[by];
            if (i101 == null) continue;
            for (int i = 0; i < sArray.length; ++i) {
                short s = sArray[i];
                if (i101.II.II__ != s) continue;
                return by;
            }
        }
        return -1;
    }

    public static void IIll(int n) {
        switch (n) {
            case 0: {
                Il0.IOI_();
                break;
            }
            case 1: {
                Il0.IOI0();
                break;
            }
            case 2: {
                Il0.IOIO();
            }
        }
    }

    private static void I_O_() {
        I_0_.II().IoOI();
    }

    private void I_OO() {
        IlO_.I_o0();
    }

    private static /* synthetic */ String II_1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

