/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;

public final class I_Oo
extends IO1_
implements I1_1 {
    private static I_Oo II;
    private final IOI0 IIlO = new IOI0();
    private final IOI0 IIl0 = new IOI0();
    private final IOI0 IIlo = new IOI0();
    private final I1Il IIOI;
    private final I1Il IIOl;
    private int l11O;
    private int l110;
    private int l11o;
    private int l1_;

    private I_Oo() {
        this.IIlO.Ill(0);
        this.IIl0.Ill(0);
        this.IIlo.Ill(1);
        this.IIlO.l10I = IO1_.ll11 + 2;
        this.IIl0.l10I = IO1_.ll11 + 2;
        this.IIlo.l10I = IO1_.ll11 + 2;
        this.IIlO.II1o = IO11.I101;
        this.IIl0.II1o = I_Oo.Il0O("\u3875\u3833\u3808\u38ee", 14397);
        this.IIlo.II1o = I_Oo.Il0O("\u386d\u3833\u3809\u38ee", 14397);
        this.IIOI = new I1Il(IO11.I_lI, this, 7001, null);
        this.IIOl = new I1Il(IO11.I_l_, this, 7002, null);
        this.III0 = this.IIOI;
        this.IIIo = this.IIOl;
        this.l11O = 0;
        this.Io11();
    }

    public static I_Oo II() {
        if (II == null) {
            II = new I_Oo();
        }
        return II;
    }

    public void I__0() {
        this.Io1l();
        this.Io11();
        this.l11O = 0;
        this.II0l(0);
        super.I0l_();
    }

    @Override
    public void I0l_() {
        this.Io11();
        super.I0l_();
    }

    private void Io1l() {
        int n = I_0l.l1_I;
        String string = "";
        String string2 = "";
        int n2 = 14445;
        if (I_0l.II1I != null && I_0l.II1l != null && I_0l.III0 != null && n >= 0 && n < I_0l.II1I.length) {
            string = I_0l.II1I[n];
            string2 = I_0l.II1l[n];
            n2 = I_0l.III0[n];
        }
        this.IIlO.IIOl(string);
        this.IIl0.IIOl(string2);
        this.IIlo.IIOl(String.valueOf(n2));
    }

    private void Io11() {
        this.l1_ = II.IIl >= 200 ? 180 : 160;
        this.l110 = II.IIl / 2 - this.l1_ / 2;
        this.l11o = II.IIl1 - 70;
        if (II.IIlI <= 160) {
            this.l11o = 20;
        }
        int n = this.l1_ - 20;
        int n2 = this.l110 + 10;
        this.IIlO.l10 = n;
        this.IIl0.l10 = n;
        this.IIlo.l10 = n;
        this.IIlO.II0I = n2;
        this.IIlO.I_O0 = this.l11o + 20;
        this.IIl0.II0I = n2;
        this.IIl0.I_O0 = this.IIlO.I_O0 + 35;
        this.IIlo.II0I = n2;
        this.IIlo.I_O0 = this.IIl0.I_O0 + 35;
        this.IIOI.I1 = II.IIl / 2 - 84;
        this.IIOI.I1I = this.IIlo.I_O0 + 60;
        this.IIOl.I1 = II.IIl / 2 + 3;
        this.IIOl.I1I = this.IIOI.I1I;
    }

    @Override
    public void IIlO() {
        this.IIlO.IIlO();
        this.IIl0.IIlO();
        this.IIlo.IIlO();
        super.IIlO();
        ++I1_I.Io1;
    }

    @Override
    public void III_(IO1l iO1l) {
        II.III1(iO1l);
        I__O.II(iO1l, this.l110, this.l11o - 10, this.l1_, 150, -1, true);
        this.IIlO.III_(iO1l);
        this.IIl0.III_(iO1l);
        this.IIlo.III_(iO1l);
        super.III_(iO1l);
    }

    @Override
    public void I_Il() {
        if (II.IIIl) {
            if (this.IIOI.II0o()) {
                this.IIOI.I0lO();
                return;
            }
            if (this.IIOl.II0o()) {
                this.IIOl.I0lO();
                return;
            }
            if (II.IIIo) {
                if (II.II(this.IIlO.II0I, this.IIlO.I_O0, this.IIlO.l10, this.IIlO.l10I)) {
                    this.II0l(0);
                    II.IIIo = false;
                } else if (II.II(this.IIl0.II0I, this.IIl0.I_O0, this.IIl0.l10, this.IIl0.l10I)) {
                    this.II0l(1);
                    II.IIIo = false;
                } else if (II.II(this.IIlo.II0I, this.IIlo.I_O0, this.IIlo.l10, this.IIlo.l10I)) {
                    this.II0l(2);
                    II.IIIo = false;
                }
            }
        }
        if (II.II[2]) {
            II.II[2] = false;
            this.II0I(-1);
        } else if (II.II[8]) {
            II.II[8] = false;
            this.II0I(1);
        }
        super.I_Il();
    }

    private void II0I(int n) {
        int n2 = this.l11O + n;
        if (n2 < 0) {
            n2 = 2;
        } else if (n2 > 2) {
            n2 = 0;
        }
        this.II0l(n2);
    }

    private void II0l(int n) {
        this.l11O = n;
        this.IIlO.Il_0 = n == 0;
        this.IIl0.Il_0 = n == 1;
        this.IIlo.Il_0 = n == 2;
    }

    @Override
    public void IIO1(int n) {
        if (this.IIlO.Il_0) {
            this.IIlO.II1o(n);
        } else if (this.IIl0.Il_0) {
            this.IIl0.II1o(n);
        } else if (this.IIlo.Il_0) {
            this.IIlo.II1o(n);
        }
        super.IIO1(n);
    }

    @Override
    public void II(int n, Object object) {
        if (n == 7002) {
            II.II.I0l_();
        } else if (n == 7001) {
            this.IIOl();
        }
    }

    private void IIOl() {
        short s;
        int n = I_0l.l1_I;
        String string = this.IIIl(this.IIlO.IIl1());
        String string2 = this.IIIl(this.IIl0.IIl1());
        String string3 = this.IIIl(this.IIlo.IIl1());
        if (string2.length() == 0) {
            II.II(IO11.Ilo1);
            return;
        }
        short s2 = 14445;
        if (I_0l.III0 != null && n >= 0 && n < I_0l.III0.length) {
            s2 = I_0l.III0[n];
        }
        if ((s = this.II(string3, s2)) <= 0) {
            II.II(IO11.Ilo1);
            return;
        }
        if (string.length() == 0 && I_0l.II1I != null && n >= 0 && n < I_0l.II1I.length) {
            string = I_0l.II1I[n];
        }
        I_0l.II(string, string2, s);
        GameMidlet.III = string2;
        GameMidlet.II_0 = s;
        I1o_.Illl = string;
        if (n >= 0) {
            I_O1.IIIl(I_Oo.Il0O("\u384e\u382a\u3808\u38ff\u38d5\u38bd\u3894\u3962", 14397), n);
        }
        II.III_();
        GameMidlet.II.IIll();
    }

    private String IIIl(String string) {
        return string == null ? "" : string.trim();
    }

    private short II(String string, short s) {
        if (string != null && string.length() != 0) {
            try {
                int n = Integer.parseInt(string);
                if (n > 0 && n <= 65535) {
                    return (short)n;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return s;
        }
        return s;
    }

    private static /* synthetic */ String Il0O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

