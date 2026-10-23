package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IIo_
extends IIII
implements I1_1,
I1__ {
    private static IIo_ var_IIo__II;
    private IlI0 var_IlI0_II = new IlI0();
    private boolean Il_1;
    private boolean Il__;
    private boolean Il_O;
    private int Ilo = -1;
    private int IloI = -1;
    private int Ilol;
    private int Ilo1;
    private int Ilo_ = -1;
    private int IloO = 0;
    private int Ilo0;
    private int Iloo;
    private int IllO = 0;

    private IIo_() {
    }

    public static IIo_ IIo__II() {
        if (var_IIo__II == null) {
            var_IIo__II = new IIo_();
        }
        return var_IIo__II;
    }

    public static IIo_ III() {
        return IIo_.IIo__II();
    }

    @Override
    protected void II1l() {
        this.IIOI();
        this.var_IlI0_II.II(new IIoO(this, 3000L));
        this.var_IlI0_II.II(new IIo0(this, 2000L));
        this.void_IIlo();
    }

    @Override
    protected void II11() {
        this.IIOl();
        this.var_IlI0_II.I_1O();
    }

    @Override
    protected void II1_() {
        this.var_IlI0_II.IIlO();
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    public boolean boolean_II1I() {
        if (this.IllO <= 0) {
            return false;
        }
        Ilol ilol = Ilol.Ilol_II();
        if (ilol == null || ilol.IO1 <= 0) {
            return false;
        }
        return ilol.IOl1 < ilol.IO1 * this.IllO / 100;
    }

    public void II_I() {
        String string = this.Il_1 ? this.III(this.Ilo) : IIo_.II11("\u7b04\u65c0\u7bfa", 31568);
        String string2 = this.Il_1 && this.Il__ ? IIo_.II11("\u7b0b", 31568) + this.Ilol + IIo_.II11("\u7b7d", 31568) + this.Ilo1 + IIo_.II11("\u7b0d", 31568) : IIo_.II11("\u7b04\u65c0\u7bfa", 31568);
        String string3 = this.Il_O ? IIo_.II11("\u7b0b", 31568) + this.Ilo_ + IIo_.II11("\u7b70", 31568) + this.IloO + IIo_.II11("\u7b70", 31568) + this.Ilo0 + IIo_.II11("\u7b70", 31568) + this.Iloo + IIo_.II11("\u7b0d", 31568) : IIo_.II11("\u7b04\u65c0\u7bfa", 31568);
        Il1_.II().Il1__III().II(IIo_.II11("\u7b17\u7b00\u7bec\u7bcc\u7baf\u7b80", 31568)).II(IIo_.II11("\u7b17\u7b00\u7bec\u7bcc\u7baf\u7b80", 31568), string, 1, null).II(IIo_.II11("\u7b17\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c2a\u7c5d\u6285\u7c06\u7ca6\u7db4\u621d", 31568), string2, 2, null).II(IIo_.II11("\u7b04\u7b96\u7bf7\u7b8d\u7baf\u7b83\u62c3\u7c47\u7c20", 31568), string3, 3, null).II(IIo_.II11("\u7b06\u65ae\u7bae\u7bc3\u7ba4\u7b0b\u7c2a\u7c42\u7c20\u7c0e\u7ca6\u7ce8\u7c94\u7cc3\u7d66\u7c91\u639b\u7d36", 31568), IIo_.II11("\u7b0b", 31568) + this.IllO + IIo_.II11("\u7b75\u7b32", 31568), 4, null).II(IIo_.II11("\u7b01\u7b1a\u7bef\u7bd4\u7bec\u7b87\u62ab\u7c40", 31568), "", 99, null).Il1__II(this).I__0();
    }

    private void III(Ilol ilol) {
        if (IOlO.l1oI != this.Ilo) {
            IlO_.II_l(this.Ilo);
            return;
        }
        if (IOlO.l1ol != this.IloI) {
            I_0_.II().II0O(this.IloI);
            return;
        }
        if (this.Il__ && (ilol.I_o_ != this.Ilol || ilol.I_oO != this.Ilo1)) {
            Il_0.III1(this.Ilol, this.Ilo1);
        }
    }

    private void IIII(Ilol ilol) {
        int n = 21 + ilol.IOIO;
        if (IOlO.l1oI != n && !IlO_.II_O()) {
            IlO_.II_l(n);
        }
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                this.I_I0();
                break;
            }
            case 2: {
                this.I_Io();
                break;
            }
            case 3: {
                this.I_l();
                break;
            }
            case 4: {
                this.III(IIo_.II11("\u7b1e\u7b07\u6523\u7bdd\u7bec\u7bce\u7c47\u7c79\u7c68\u7c11\u6247\u7c85\u7caa\u7c8b\u7de2\u7d01\u7d68\u7d6f\u7d53\u7da4\u7d85\u7df2", 31568), IIo_.II11("\u7b75\u7b22\u7bde", 31568));
                break;
            }
            case 99: {
                II0l.II0l_III().II_I();
            }
        }
    }

    private void I_I0() {
        if (!this.Il_1) {
            this.Il_1 = true;
            this.IIII(false);
            String string = this.III(this.Ilo);
            this.IIIl(IIo_.II11("\u7b17\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c30\u7c09\u7c0a\u62ca\u7cf2\u7c85\u7c9f", 31568) + string + IIo_.II11("\u7b70\u7b42\u7bae\u7be6\u7ba4\u7b9e\u7c2a", 31568) + this.IloI + IIo_.II11("\u7b0d", 31568));
        } else {
            this.Il_1 = false;
            this.Il__ = false;
            this.IIIl(IIo_.II11("\u7b17\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c30\u7c09\u7c1c\u62c8\u7cf2", 31568));
        }
        this.IIOl();
        this.II_I();
    }

    private void I_Io() {
        if (!this.Il__) {
            this.Il_1 = true;
            this.Il__ = true;
            this.IIII(true);
            this.IIIl(IIo_.II11("\u7b17\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c2a\u7c5d\u6285\u7c06\u7ca6\u7db4\u621d\u7cd9\u7d22\u7d63\u63ed\u7d2b\u7d5e\u7dc6", 31568) + this.Ilol + IIo_.II11("\u7b7d", 31568) + this.Ilo1 + IIo_.II11("\u7b0d", 31568));
        } else {
            this.Il_1 = false;
            this.Il__ = false;
            this.IIIl(IIo_.II11("\u7b17\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c2a\u7c5d\u6285\u7c06\u7ca6\u7db4\u621d\u7cd9\u7d22\u7d75\u63ef\u7d2b", 31568));
        }
        this.IIOl();
        this.II_I();
    }

    private void I_l() {
        if (!this.Il_O) {
            this.III(IIo_.II11("\u7b1e\u7b07\u6523\u7bdd\u7bec\u7ba2\u7c4e\u7c09\u7c03\u7c0f\u7cf3\u7c85\u7c9c\u7cc3\u7d5b\u7d01\u7d68\u7d1c\u7d9f\u7dfe\u7dd4\u7dfb\u7d94\u7e71\u7e59\u7e22\u7e56\u7ef1\u6011\u7ea6\u7ed2\u7f72\u7fd1\u7f2c\u7f06\u7fa4", 31568), IIo_.II11("\u7b19\u7b2b\u7bae\u7be6\u7ba4\u7b9e\u7c2a\u7c71\u7c68\u7c3e", 31568));
        } else {
            this.Il_O = false;
            this.Ilo_ = -1;
            this.IloO = 0;
            this.Ilo0 = 0;
            this.Iloo = 0;
            this.IIIl(IIo_.II11("\u7a40\u7b8c\u7bae\u7bd9\u6563\u7b9f\u7c2a\u7c6a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cc3\u7d45\u7d4e\u7d22\u7d3e\u7d1d\u7df6", 31568));
            this.IIOl();
            this.II_I();
        }
    }

    private void IIII(boolean bl) {
        if (this.Il_O) {
            this.Ilo = this.Ilo_;
            this.IloI = this.IloO;
            if (bl) {
                this.Ilol = this.Ilo0;
                this.Ilo1 = this.Iloo;
            }
        } else {
            Ilol ilol;
            this.Ilo = IOlO.l1oI;
            this.IloI = IOlO.l1ol;
            if (bl && (ilol = Ilol.Ilol_II()) != null) {
                this.Ilol = ilol.I_o_;
                this.Ilo1 = ilol.I_oO;
            }
        }
    }

    @Override
    public void II(String string, String string2) {
        String string3 = Ilo_.II().var_IOI0_II.java_lang_String_IIl1();
        if (Il_o.boolean_III1(string3)) {
            this.Illl();
            return;
        }
        String string4 = Ilo_.II().II00;
        if (string4.equals(IIo_.II11("\u7b1e\u7b07\u6523\u7bdd\u7bec\u7bce\u7c47\u7c79\u7c68\u7c11\u6247\u7c85\u7caa\u7c8b\u7de2\u7d01\u7d68\u7d6f\u7d53\u7da4\u7d85\u7df2", 31568))) {
            this.IIl(string3);
        } else if (string4.equals(IIo_.II11("\u7b1e\u7b07\u6523\u7bdd\u7bec\u7ba2\u7c4e\u7c09\u7c03\u7c0f\u7cf3\u7c85\u7c9c\u7cc3\u7d5b\u7d01\u7d68\u7d1c\u7d9f\u7dfe\u7dd4\u7dfb\u7d94\u7e71\u7e59\u7e22\u7e56\u7ef1\u6011\u7ea6\u7ed2\u7f72\u7fd1\u7f2c\u7f06\u7fa4", 31568))) {
            this.IIlo(string3);
        }
    }

    @Override
    public void Illl() {
        Ilo_ ilo_ = Ilo_.II();
        ilo_.II00 = IIo_.II11("\u7b13\u7b07\u7bef\u7bd9", 31568);
        ilo_.var_IOI0_II.II1o = IIo_.II11("\u7b33\u7b07\u7bef\u7bd9", 31568);
        ilo_.var_IOI0_II.IIOl("");
        ilo_.I_10 = false;
        ilo_.var_I1___II = I1_I.I1_I_II();
        ilo_.III0 = null;
        this.II_I();
        II.var_I_1o_II.I__0();
    }

    private void IIl(String string) {
        try {
            int n = Integer.parseInt(string);
            this.IllO = Math.max(0, Math.min(99, n));
            this.IIIl(IIo_.II11("\u7b06\u65ae\u7bae\u7bc3\u7ba4\u7b0b\u7c2a\u7c42\u7c20\u7c0e\u7ca6\u7ce8\u7c94\u7cc3\u7d66\u7c91\u639b\u7d36\u7d44\u7dbd", 31568) + this.IllO + IIo_.II11("\u7b75", 31568));
            this.IIOl();
        }
        catch (NumberFormatException numberFormatException) {
            this.IIIl(IIo_.II11("\u7b17\u7b06\u7b6f\u7b8d\u7bb8\u7b99\u62c1\u7c09\u7c23\u7c0f\u7c72\u7ccb\u7ca3\u7cc3\u7d6a\u63c2\u7d30\u7d7f\u7d12\u635a", 31568));
        }
        this.Illl();
    }

    private void IIlo(String string) {
        try {
            String string2 = string.trim();
            String[] stringArray = Il_o.java_lang_String_arr_II(string2, ' ');
            if (stringArray.length != 4) {
                this.IIIl(IIo_.II11("\u7b03\u7b0e\u7be7\u7b8d\u7add\u6520\u7c64\u7c41\u7c68\u7c03\u6227\u7ccb\u7ca3\u7cc2\u7d22\u7d6f\u7d28\u63f2\u7d0e\u7da7\u7d9c\u7d92\u7dbe\u7e39\u7e73\u7e3f\u7e03\u7eb5\u7eec\u7ef3\u7eab", 31568));
                this.Illl();
                return;
            }
            int n = Integer.parseInt(stringArray[0]);
            int n2 = Integer.parseInt(stringArray[1]);
            int n3 = Integer.parseInt(stringArray[2]);
            int n4 = Integer.parseInt(stringArray[3]);
            this.Il_O = true;
            this.Ilo_ = n;
            this.IloO = n2;
            this.Ilo0 = n3;
            this.Iloo = n4;
            this.IIIl(IIo_.II11("\u7a40\u7b8c\u7bae\u7bc1\u7a7c\u7b9e\u7c2a\u7c6a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cd9\u7d22\u7d7a\u7d09\u7d1b\u7d44", 31568) + n + IIo_.II11("\u7b70\u7b24\u7be6\u7bd8\u7bf6", 31568) + n2 + IIo_.II11("\u7b70\u7b37\u7bb4", 31568) + n3 + IIo_.II11("\u7b70\u7b36\u7bb4", 31568) + n4 + IIo_.II11("\u7b0d", 31568));
            this.IIOl();
        }
        catch (NumberFormatException numberFormatException) {
            this.IIIl(IIo_.II11("\u7b17\u7b06\u7b6f\u7b8d\u7bb8\u7b99\u62c1\u7c09\u7c23\u7c0f\u7c72\u7ccb\u7ca3\u7cc3\u7d6a\u63c2\u7d30\u7d7f\u7d12\u635a\u7d9d\u7dfb\u7db4\u7e71\u6095\u7e27\u7e56\u7ee6\u6065", 31568));
        }
        this.Illl();
    }

    private void III(String string, String string2) {
        II.var_I_1o_II.I__o();
        Ilo_.II().II00 = string;
        Ilo_.II().var_IOI0_II.II1o = string2;
        Ilo_.II().II1o("");
        Ilo_.II().var_I1___II = this;
    }

    private void IIIl(String string) {
        I1_I.var_I1Oo_II.IIII(string, 0);
    }

    private String III(int n) {
        if (n >= 0 && n < IOlO.II11.length) {
            return IOlO.II11[n];
        }
        return IIo_.II11("\u7b19\u7b2b\u7bb4", 31568) + n;
    }

    private void IIOI() {
        this.Il_1 = IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4c\u7c26\u7c06\u7ce4\u7cc9\u7ca1\u7c87", 31568), false);
        this.Il__ = IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c5c\u7c3b\u7c02\u7cc5\u7cca\u7cab\u7c91\u7d66\u7d52", 31568), false);
        this.Il_O = IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c41\u7c29\u7c14\u7cc5\u7cd0\u7cb7\u7c97\u7d6d\u7d4c", 31568), false);
        this.Ilo = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c44\u7c29\u7c17\u7ccf\u7ce1", 31568), -1);
        this.IloI = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c53\u7c27\u7c09\u7ce3\u7cec\u7c80", 31568), -1);
        this.Ilol = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c51", 31568), 0);
        this.Ilo1 = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c50", 31568), 0);
        this.Ilo_ = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cae\u7d63\u7d51\u7d09\u7d1b", 31568), -1);
        this.IloO = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cb9\u7d6d\u7d4f\u7d25\u7d16\u7d3a", 31568), 0);
        this.Ilo0 = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cbb", 31568), 0);
        this.Iloo = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cba", 31568), 0);
        this.IllO = IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c44\u7c21\u7c09\u7ccb\u7cf5", 31568), 0);
        this.IllO = Math.max(0, Math.min(99, this.IllO));
    }

    private void IIOl() {
        IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4c\u7c26\u7c06\u7ce4\u7cc9\u7ca1\u7c87", 31568), this.Il_1);
        IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c5c\u7c3b\u7c02\u7cc5\u7cca\u7cab\u7c91\u7d66\u7d52", 31568), this.Il__);
        IlIO.II(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c41\u7c29\u7c14\u7cc5\u7cd0\u7cb7\u7c97\u7d6d\u7d4c", 31568), this.Il_O);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c44\u7c29\u7c17\u7ccf\u7ce1", 31568), this.Ilo);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c53\u7c27\u7c09\u7ce3\u7cec\u7c80", 31568), this.IloI);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c51", 31568), this.Ilol);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c50", 31568), this.Ilo1);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cae\u7d63\u7d51\u7d09\u7d1b", 31568), this.Ilo_);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cb9\u7d6d\u7d4f\u7d25\u7d16\u7d3a", 31568), this.IloO);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cbb", 31568), this.Ilo0);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c4a\u7c3d\u7c14\u7cf2\u7cca\u7ca9\u7cba", 31568), this.Iloo);
        IlIO.III(IIo_.II11("\u7b37\u7b00\u7bec\u7bcc\u7baf\u7b80\u7c24\u7c44\u7c21\u7c09\u7ccb\u7cf5", 31568), this.IllO);
    }

    static /* synthetic */ boolean II(IIo_ iIo_) {
        return iIo_.Il_1;
    }

    static /* synthetic */ boolean III(IIo_ iIo_) {
        return iIo_.Il__;
    }

    static /* synthetic */ void II(IIo_ iIo_, Ilol ilol) {
        iIo_.IIII(ilol);
    }

    static /* synthetic */ void III(IIo_ iIo_, Ilol ilol) {
        iIo_.III(ilol);
    }

    private static /* synthetic */ String II11(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

