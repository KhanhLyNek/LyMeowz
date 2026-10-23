package main;

/*
 * Decompiled with CFR 0.152.
 */
public abstract class IllO
implements Ill0 {
    protected String II1_ = "";
    protected String II1O = "";
    protected Il_l.II IIl = new Il_l.II();
    protected I1_1 var_I1_1_II;
    private static Ill0 var_Ill0_II;

    @Override
    public void I__0() {
        this.I_O();
    }

    @Override
    public void I__o() {
        this.IIl.I_1O();
    }

    @Override
    public String java_lang_String_III() {
        return this.II1_;
    }

    @Override
    public void void_II(I1_1 i1_1) {
        this.var_I1_1_II = i1_1;
    }

    @Override
    public void IIlI(int n) {
        if (n >= 0 && n < this.IIl.IIlO()) {
            Illo illo = (Illo)this.IIl.II(n);
            if (illo.IlOo && this.var_I1_1_II != null) {
                this.var_I1_1_II.II(illo.I1l, illo.II);
            }
        }
    }

    public static void III_(IO1l iO1l) {
        iO1l.IIIO(II.var_I_1o_II.llO_, II.var_I_1o_II.llOO, II.var_I_1o_II.llO0, II.var_I_1o_II.llOo);
        iO1l.IIl0(0, -II.var_I_1o_II.Io1I);
        IllO illO = (IllO)IllO.II();
        if (illO != null) {
            for (int i = 0; i < illO.IIl.IIlO(); ++i) {
                Illo illo = (Illo)illO.IIl.II(i);
                int n = II.var_I_1o_II.llO_;
                int n2 = II.var_I_1o_II.llOO + i * 24;
                int n3 = II.var_I_1o_II.llO0 - 1;
                int n4 = 23;
                if (n2 - II.var_I_1o_II.Io1I > II.var_I_1o_II.llOO + II.var_I_1o_II.llOo || n2 - II.var_I_1o_II.Io1I < II.var_I_1o_II.llOO - 24) continue;
                iO1l.Illl(i == II.var_I_1o_II.ll0l ? 16383818 : 15196114);
                iO1l.III_(n, n2, n3, n4);
                IO1I.III_.II(iO1l, illo.II1_, n + 5, n2 + 5, 0);
                if (illo.II10 == null || illo.II10.length() <= 0) continue;
                int n5 = IO1I.III_.IIII(illo.II10);
                IO1I.III_.II(iO1l, illo.II10, n + n3 - n5 - 5, n2 + 5, 0);
            }
            II.var_I_1o_II.II1o(iO1l);
        }
    }

    private void I_O() {
        if (II.var_I_1o_II.var_java_lang_String_arr_arr_IIIl == null || II.var_I_1o_II.IIII == null) {
            II.var_I_1o_II.IoI();
        }
        II.var_I_1o_II.llO = this.IIl.IIlO();
        II.var_I_1o_II.ll11 = 24;
        II.var_I_1o_II.ll0l = II.var_boolean_IIIl ? -1 : 0;
        II.var_I_1o_II.Io_I = this.IIl.IIlO() * 24 - II.var_I_1o_II.llOo;
        if (II.var_I_1o_II.Io_I < 0) {
            II.var_I_1o_II.Io_I = 0;
        }
        if (II.var_I_1o_II.Io1I < 0) {
            II.var_I_1o_II.Io1o = 0;
            II.var_I_1o_II.Io1I = 0;
        }
        if (II.var_I_1o_II.Io1I > II.var_I_1o_II.Io_I) {
            II.var_I_1o_II.Io1I = II.var_I_1o_II.Io1o = II.var_I_1o_II.Io_I;
        }
        II.var_I_1o_II.IoI_ = 27;
        II.var_I_1o_II.IIOo(0);
    }

    protected IllO II(String string, String string2, int n, Object object, boolean bl) {
        this.IIl.void_III(new Illo(string, string2, n, object, bl));
        return this;
    }

    protected void I_OI() {
        this.IIl.I_1O();
    }

    protected static void II(Ill0 ill0) {
        var_Ill0_II = ill0;
    }

    protected static Ill0 II() {
        return var_Ill0_II;
    }

    public static String IIII() {
        IllO illO = (IllO)var_Ill0_II;
        return illO != null && illO.II1_.length() > 0 ? illO.II1_ : IllO.II_l("\u4db2\u4e65\u4e6b\u4e4a\u4e34\u4e12\u4efc\u4ec9", 19937);
    }

    public static String IIIl() {
        IllO illO = (IllO)var_Ill0_II;
        return illO != null ? illO.II1O : "";
    }

    private static /* synthetic */ String II_l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

