/*
 * Decompiled with CFR 0.152.
 */
public class IlIo {
    private Il_l.III1 III = new Il_l.III1();

    public void II(String string, II iI) {
        Il_l.II iI2 = (Il_l.II)this.III.II(string);
        if (iI2 == null) {
            iI2 = new Il_l.II();
            this.III.II(string, iI2);
        }
        iI2.III(iI);
    }

    public void III(String string, II iI) {
        Il_l.II iI2 = (Il_l.II)this.III.II(string);
        if (iI2 != null) {
            iI2.II(iI);
        }
    }

    public void II(String string, Object object) {
        Il_l.II iI = (Il_l.II)this.III.II(string);
        if (iI != null) {
            int n;
            Il_l.II iI2 = new Il_l.II();
            for (n = 0; n < iI.IIlO(); ++n) {
                iI2.III(iI.II(n));
            }
            for (n = 0; n < iI2.IIlO(); ++n) {
                II iI3 = (II)iI2.II(n);
                try {
                    iI3.II(object);
                    continue;
                }
                catch (Exception exception) {
                    System.err.println(IlIo.II1o("\u492b\u49ca\u49d8\u49a8\u4982\u4a7f\u4a68\u4a3c\u4a1b\u4ada\u4a86\u4a80\u4a96\u4b71\u4b4d\u4b33\u4b40\u4b17\u4bff\u4bd3\u4bb8\u4b97\u4c73\u4c57\u4c3f\u4c57\u4cf3\u4cc3\u4cb1\u4c9d\u4d66\u4d0b\u4d70", 18800) + string);
                    exception.printStackTrace();
                }
            }
        }
    }

    public void II1_(String string) {
        this.III.III(string);
    }

    public void I_10() {
        this.III.I_1O();
    }

    private static /* synthetic */ String II1o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    public static interface II {
        public void II(Object var1);
    }
}

