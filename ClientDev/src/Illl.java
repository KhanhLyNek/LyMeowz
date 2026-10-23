package main;

/*
 * Decompiled with CFR 0.152.
 */
public class Illl {
    private static Illl var_Illl_II;
    private Il_l.II IIIo = new Il_l.II();
    private Il_l.III1 IIII = new Il_l.III1();
    private Il_l.III1 IIIl = new Il_l.III1();
    private IlIo var_IlIo_II = new IlIo();

    private Illl() {
    }

    public static Illl Illl_II() {
        if (var_Illl_II == null) {
            var_Illl_II = new Illl();
        }
        return var_Illl_II;
    }

    public static void I__I() {
        Illl illl = Illl.Illl_II();
        illl.II(IIo_.III());
        illl.II(IlO_.III());
        illl.II(III_.III());
        illl.II(IIl1.III());
        illl.II(IIO0.III());
        illl.II(II0l.II0l_III());
        illl.II(II10.III());
        illl.II(II1I.III());
        illl.II(II_O.III());
        illl.II(IIlO.III());
        illl.II(Il1I.III());
        illl.II(IIlI.IIlI_III());
        illl.II(IIO_.III());
        illl.II(IIOl.III());
        illl.II(IIo.III());
        illl.II(IlI.III());
        Il1O.Il1O_III();
        IIoo.IIl_();
        IIo1.I_I_();
    }

    public void II(Ill ill) {
        try {
            ill.void_IIl_();
            this.IIIo.void_III(ill);
            this.IIII.II(ill.getClass(), ill);
            this.IIIl.II(ill.java_lang_String_II(), ill);
            this.var_IlIo_II.II(Illl.II_("\u29b2\u2991\u2a79\u2a49\u2a37\u2a1f\u2aa3\u2aca\u2ab2\u2a91\u2b7c\u2b47\u2b27\u2b17\u2be3\u2bd5\u2bab", 10719), ill);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void void_II(Class clazz) {
        Ill ill = (Ill)this.IIII.II(clazz);
        if (ill != null) {
            ill.void_IIl0();
            this.IIIo.boolean_II(ill);
            this.IIII.III(clazz);
            this.IIIl.III(ill.java_lang_String_II());
            this.var_IlIo_II.II(Illl.II_("\u29b2\u2991\u2a79\u2a49\u2a37\u2a1f\u2aa3\u2acd\u2ab9\u2a84\u2b70\u2b53\u2b3a\u2b01\u2be5\u2bd5\u2bbd\u2b8b\u2c69", 10719), ill);
        }
    }

    public void I__l() {
        for (int i = 0; i < this.IIIo.IIlO(); ++i) {
            Ill ill = (Ill)this.IIIo.II(i);
            try {
                if (!ill.boolean_IIII()) continue;
                ill.void_IIlO();
                continue;
            }
            catch (Exception exception) {
                System.err.println(Illl.II_("\u2984\u29b3\u2a72\u2a58\u2a16\u2a1b\u2af7\u2ad9\u2ab0\u2a93\u2b67\u2b69\u2b73\u2b27\u2be1\u2bd4\u2bae\u2b9a\u2c68\u2c0c\u2c2e\u2c18\u2cfb\u2cc7\u2cb5\u2cdc\u2d25", 10719) + ill.java_lang_String_II());
                exception.printStackTrace();
            }
        }
    }

    public void I__1() {
        int n;
        Il_l.II iI = new Il_l.II();
        for (n = 0; n < this.IIIo.IIlO(); ++n) {
            iI.void_III(this.IIIo.II(n));
        }
        for (n = 0; n < iI.IIlO(); ++n) {
            Ill ill = (Ill)iI.II(n);
            try {
                ill.void_IIl0();
                continue;
            }
            catch (Exception exception) {
                System.err.println(Illl.II_("\u2984\u29b3\u2a72\u2a58\u2a16\u2a1b\u2af7\u2ad9\u2ab0\u2a93\u2b67\u2b69\u2b73\u2b36\u2bf8\u2bc3\u2bbf\u2b81\u2c7e\u2c49\u2c6b\u2c0f\u2cfb\u2cda\u2ca8\u2c94\u2d3f\u2d04", 10719) + ill.java_lang_String_II());
                exception.printStackTrace();
            }
        }
        this.IIIo.I_1O();
        this.IIII.I_1O();
        this.IIIl.I_1O();
    }

    public Ill II(String string) {
        return (Ill)this.IIIl.II(string);
    }

    public Ill Ill_II(Class clazz) {
        return (Ill)this.IIII.II(clazz);
    }

    public Il_l.II Il_l$II_II() {
        Il_l.II iI = new Il_l.II();
        for (int i = 0; i < this.IIIo.IIlO(); ++i) {
            iI.void_III(this.IIIo.II(i));
        }
        return iI;
    }

    public IlIo IlIo_II() {
        return this.var_IlIo_II;
    }

    private static /* synthetic */ String II_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

