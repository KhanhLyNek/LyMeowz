package main;

/*
 * Decompiled with CFR 0.152.
 */
public class Il11 {
    public int I1;
    public int I1I;
    public String II_I;
    public int I1lO = -1;
    public Il1 var_Il1_II;
    private boolean Il_0;
    private boolean Il01;
    public static boolean Il0_ = true;
    public static Il11 var_Il11_II;
    public static Il11 III;
    public static Il11 IIII;
    public static Il11 IIIl;
    public static Il11 III1;
    public static Il11 III_;
    public static Il11 IIIO;

    public Il11(String string, int n, Il1 il1) {
        this.II_I = string;
        this.I1lO = n;
        this.var_Il1_II = il1;
        this.Il01 = false;
    }

    public void IIl1(IO1l iO1l) {
        if (this != III1 && this != III_ && this != IIIO) {
            if (this == IIIl) {
                this.IIlO(iO1l);
            } else {
                this.IIl0(iO1l);
            }
        } else {
            this.IIl_(iO1l);
        }
    }

    private void IIl_(IO1l iO1l) {
        if (I1_I.var_javax_microedition_lcdui_Image_Il_l != null) {
            int n = I1_I.var_javax_microedition_lcdui_Image_Il_l.getWidth();
            int n2 = I1_I.var_javax_microedition_lcdui_Image_Il_l.getHeight();
            if (this == III_) {
                iO1l.II(I1_I.var_javax_microedition_lcdui_Image_Il_l, 0, 0, n, n2, 0, this.I1, this.I1I, 0);
            } else if (this == IIIO) {
                iO1l.II(I1_I.var_javax_microedition_lcdui_Image_Il_l, 0, 0, n, n2, 5, this.I1, this.I1I, 0);
            } else if (this == III1) {
                iO1l.II(I1_I.var_javax_microedition_lcdui_Image_Il_l, 0, 0, n, n2, 3, this.I1, this.I1I, 0);
            }
            if (this.Il01 && I10_.IlOI != null) {
                iO1l.II(I10_.IlOI, this.I1 - 7, this.I1I - 5, 0);
            }
        }
    }

    private void IIlO(IO1l iO1l) {
        if (IlO_.II_O()) {
            IO1I.IIII.II(iO1l, Il11.II_O("\u978f\u96df\u96b3\u969b\u973b\u975e\u9730\u9758\u97f4\u97de\u97a0\u978d\u86d0\u985c", 38559), II.var_int_IIl / 2 - 35, II.var_int_IIlI / 2 - 20, 0, IO1I.III_);
            iO1l.II(this.Il01 ? I1_I.IllI : I1_I.Ill, this.I1, this.I1I, 0);
            if (!this.II_I.equals("")) {
                int n = I1_I.Ill.getWidth();
                int n2 = I1_I.Ill.getHeight();
                IO1I.III_.II(iO1l, this.II_I, this.I1 + 1 + n / 2, this.I1I + n2 / 2 - 6, 3);
            }
        }
    }

    private void IIl0(IO1l iO1l) {
        if (I1_I.IoO0 == 0) {
            if (!IIoo.II1l()) {
                iO1l.II(this.Il_0 ? I1_I.Il_ : I1_I.Il1o, this.I1, this.I1I, 0);
            }
            if (!this.II_I.equals("")) {
                int n = I1_I.Il1o.getWidth();
                int n2 = I1_I.Il1o.getHeight();
                IO1I.III_.II(iO1l, this.II_I, this.I1 + 1 + n / 2, this.I1I + n2 / 2 - I1_I.Il1o.getHeight() / 2 + 10, 3);
            }
            if (this.I1lO != -1) {
                I_oo.IIII(iO1l, this.I1lO, this.I1 + I1_I.Il1o.getWidth() / 2, this.I1I + I1_I.Il1o.getHeight() / 2, 0, 3);
            }
        }
    }

    public boolean II11() {
        int n;
        int n2;
        this.Il_0 = false;
        if (this != III1 && this != III_ && this != IIIO) {
            if (this == IIIl) {
                n2 = I1_I.Ill.getWidth();
                n = I1_I.IlIo.getHeight();
            } else {
                n2 = I1_I.Il1o.getWidth();
                n = I1_I.Il1o.getHeight();
            }
        } else {
            if (I1_I.var_javax_microedition_lcdui_Image_Il_l == null) {
                return false;
            }
            n2 = I1_I.var_javax_microedition_lcdui_Image_Il_l.getWidth() + 10;
            n = I1_I.var_javax_microedition_lcdui_Image_Il_l.getHeight() + 10;
        }
        if (II.II(this.I1 - 5, this.I1I - 5, n2, n)) {
            if (II.var_boolean_IIIO) {
                this.Il_0 = true;
                this.Il01 = true;
            }
            if (II.var_boolean_III0 && II.var_boolean_IIIo) {
                Ilol.Ilol_II().var_I_ll_II = null;
                this.Il01 = false;
                return true;
            }
        } else {
            this.Il01 = false;
        }
        return false;
    }

    public void I_0l() {
        II.IIlI();
        this.var_Il1_II.II(0, null);
    }

    public static void I_01() {
        if (IIIl.II11()) {
            IIIl.I_0l();
        }
        if (III1.II11()) {
            III1.I_0l();
        }
        if (III_.II11()) {
            III_.I_0l();
        }
        if (IIIO.II11()) {
            IIIO.I_0l();
        }
        if (Il0_ && !Ilol.Ilol_II().I_I_ && I1_I.lIIl == 1 && I1_I.IoO0 == 0) {
            if (var_Il11_II.II11()) {
                var_Il11_II.I_0l();
            }
            if (III.II11()) {
                III.I_0l();
            }
            if (IIII.II11()) {
                IIII.I_0l();
            }
        }
    }

    public static void IIlo(IO1l iO1l) {
        if (Il0_) {
            int n = I1_I.Il1o.getWidth();
            int n2 = I1_I.Il1o.getHeight();
            Il11.var_Il11_II.I1 = I1_I.lIIo + 48 - n;
            Il11.var_Il11_II.I1I = I1_I.lIl - 2 - n2;
            var_Il11_II.IIl1(iO1l);
            Il11.III.I1 = I1_I.lIIo + 12 - n;
            Il11.III.I1I = I1_I.lIl + 12 - n2;
            III.IIl1(iO1l);
            Il11.IIII.I1 = I1_I.lIIo - n;
            Il11.IIII.I1I = I1_I.lIl + 47 - n2;
            IIII.IIl1(iO1l);
            Il11.IIIl.I1 = II.var_int_IIl / 2 - 15;
            Il11.IIIl.I1I = II.var_int_IIlI / 2 - 5;
            IIIl.IIl1(iO1l);
            Il11.III1.I1 = n - 22;
            Il11.III1.I1I = n2 + 82;
            III1.IIl1(iO1l);
            Il11.IIIO.I1 = n + 6;
            Il11.IIIO.I1I = n2 + 85;
            IIIO.IIl1(iO1l);
            Il11.III_.I1 = n + 38;
            Il11.III_.I1I = n2 + 82;
            III_.IIl1(iO1l);
        }
    }

    static {
        var_Il11_II = new Il11("", 1088, new Il1(0, Il11.II_O("\u96ea\u96cd\u96b8\u96bf\u977a\u974a\u972a\u970d\u97fb\u97d3", 38559)));
        III = new Il11("", 7993, new Il1(1, Il11.II_O("\u96ea\u96cd\u96b8\u96ac\u9774\u9748\u9738\u970c\u97f6", 38559)));
        IIII = new Il11(Il11.II_O("\u96d4\u96d6\u96a8", 38559), -1, new Il1(2, Il11.II_O("\u96f2\u96db\u96b3\u9689\u9741\u9755\u9737\u971d", 38559)));
        IIIl = new Il11(Il11.II_O("\u96db\u8855\u96b3\u969b", 38559), -1, new Il1(3, Il11.II_O("\u96ec\u96ca\u96b2\u968c", 38559)));
        III1 = new Il11("", -1, new Il1(4, Il11.II_O("\u96f3\u96d1\u96bc\u9698\u9756\u975b\u9729\u9734\u97f2\u97d0\u97a1", 38559)));
        III_ = new Il11("", -1, new Il1(5, Il11.II_O("\u96f3\u96d1\u96bc\u9698\u9756\u975b\u9729\u972a\u97fe\u97d1\u97bd\u9780", 38559)));
        IIIO = new Il11("", -1, new Il1(6, Il11.II_O("\u96f3\u96d1\u96bc\u9698\u9756\u975b\u9729\u973b\u97f2\u97d8\u97a1\u9791\u9861", 38559)));
    }

    private static /* synthetic */ String II_O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

