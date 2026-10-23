package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class Ilo_
implements I1_1 {
    private static Ilo_ var_Ilo__II;
    public IOI0 var_IOI0_II;
    public boolean I_10 = false;
    public I1__ var_I1___II;
    private long Il_o = 0L;
    public I1Il III_;
    public I1Il IIIO;
    public I1Il III0 = null;
    private int I1;
    private int I1I;
    private int IIl;
    private int IIlI;
    public String II0O;
    public String II00 = IO11.I_Io + Ilo_.IIol("\u57d9", 22521);

    public void IIl1() {
        this.III_ = new I1Il(IO11.I_lI, this, 8000, null, 1, II.var_int_IIlI - IO1_.llo_ + 1);
        this.IIIO = new I1Il(IO11.I_II, this, 8001, null, II.var_int_IIl - 70, II.var_int_IIlI - IO1_.llo_ + 1);
        this.III0 = null;
        this.IIl = this.var_IOI0_II.l10 + 28;
        this.IIlI = this.var_IOI0_II.l10I + 26;
        this.I1 = II.var_int_IIl / 2 - this.IIl / 2;
        this.I1I = this.var_IOI0_II.I_O0 - 18;
        if (this.IIl > 320) {
            this.IIl = 320;
        }
        this.III_.I1 = this.I1;
        this.IIIO.I1 = this.I1 + this.IIl - 68;
        if (II.var_boolean_IIIl) {
            IOI0 iOI0 = this.var_IOI0_II;
            iOI0.I_O0 -= 5;
            this.I1I -= 20;
            this.IIlI += 30;
            this.III_.I1 = II.var_int_IIl / 2 - 68 - 5;
            this.IIIO.I1 = II.var_int_IIl / 2 + 5;
            this.III_.I1I = II.var_int_IIlI - 30;
            this.IIIO.I1I = II.var_int_IIlI - 30;
        }
    }

    public void keyPressed(int n) {
        if (this.I_10) {
            this.var_IOI0_II.II1o(n);
        }
        this.IIIO.IIoO = this.var_IOI0_II.java_lang_String_IIl1().equals("") ? IO11.I_I : IO11.I_II;
    }

    public static Ilo_ II() {
        return var_Ilo__II == null ? (var_Ilo__II = new Ilo_()) : var_Ilo__II;
    }

    public Ilo_() {
        this.var_IOI0_II = new IOI0();
        this.var_IOI0_II.II1o = IO11.I_Io;
        this.var_IOI0_II.l10 = II.var_int_IIl - 32;
        if (this.var_IOI0_II.l10 > 250) {
            this.var_IOI0_II.l10 = 250;
        }
        this.var_IOI0_II.l10I = IO1_.ll11 + 2;
        this.var_IOI0_II.II0I = II.var_int_IIl / 2 - this.var_IOI0_II.l10 / 2;
        this.var_IOI0_II.Il_0 = true;
        this.var_IOI0_II.II(80);
    }

    public void II(int n, I1__ i1__, String string) {
        this.IIIO.IIoO = IO11.I_I;
        this.II0O = string;
        this.var_IOI0_II.II1o(n);
        if (!this.var_IOI0_II.java_lang_String_IIl1().equals("") && II.var_I1l_II == null) {
            this.var_I1___II = i1__;
            this.I_10 = true;
        }
    }

    public void II1o(String string) {
        this.IIIO.IIoO = IO11.I_I;
        this.II0O = string;
        if (II.var_I1l_II == null) {
            this.I_10 = true;
            if (II.var_boolean_IIIl) {
                this.var_IOI0_II.void_IIl1();
            }
        }
    }

    public void III() {
        if (this.I_10) {
            if (IO10.l_lI != 5 && IO10.l_lI != 3) {
                this.var_IOI0_II.IIlO();
            }
            if (this.var_IOI0_II.IOOO) {
                this.var_IOI0_II.IOOO = false;
                this.var_I1___II.II(this.var_IOI0_II.java_lang_String_IIl1(), this.II0O);
                this.var_IOI0_II.IIOl("");
                this.IIIO.IIoO = IO11.I_I;
            }
        }
    }

    public void II(IO1l iO1l) {
        if (this.I_10 && IO10.l_lI != 5 && IO10.l_lI != 3) {
            I__O.II(iO1l, this.I1, this.I1I, this.IIl, this.IIlI, -1, true);
            IO1I.IIIO.II(iO1l, this.II00 + this.II0O, this.var_IOI0_II.II0I, this.var_IOI0_II.I_O0 - (II.var_boolean_IIIl ? 17 : 12), 0);
            I_10.II(iO1l, this.III_, this.III0, this.IIIO);
            this.var_IOI0_II.III_(iO1l);
        }
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 8000: {
                I_Ol.II__(Ilo_.IIol("\u5789\u587d\u5845\u5830\u581a\u58e6\u58de\u58f2\u5892\u5978\u594e\u593a\u594d\u59bd", 22521));
                if (this.var_I1___II == null) break;
                long l = System.currentTimeMillis();
                if (l - this.Il_o < 1000L) {
                    return;
                }
                this.Il_o = l;
                this.var_I1___II.II(this.var_IOI0_II.java_lang_String_IIl1(), this.II0O);
                this.var_IOI0_II.IIOl("");
                this.IIIO.IIoO = IO11.I_I;
                return;
            }
            case 8001: {
                I_Ol.II__(Ilo_.IIol("\u5789\u587d\u5845\u5830\u581a\u58e6\u58de\u58f2\u5892\u5978\u594e\u593a\u594d\u59be", 22521));
                if (this.var_IOI0_II.java_lang_String_IIl1().equals("")) {
                    this.I_10 = false;
                    this.var_I1___II.Illl();
                }
                this.var_IOI0_II.IOlI();
            }
        }
    }

    private static /* synthetic */ String IIol(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

