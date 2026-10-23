package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IIO0
extends IIII
implements I1_1,
I1__ {
    private static IIO0 var_IIO0_II;
    private final IlI0 IIIl = new IlI0();
    public boolean IllI;
    public boolean Illl;
    public boolean[] III1 = new boolean[10];
    private long[] var_long_arr_II = new long[10];
    private long[] III = new long[10];
    private boolean Ill1 = false;
    private int IlOl;
    private boolean Ill_ = false;
    private boolean[] III_ = new boolean[10];
    private long II_1 = 0L;
    private long II__ = 0L;
    private long II_O = 0L;
    private long[] IIII = new long[10];
    private static final long II_0 = 5000L;
    private static final long II_o = 2600L;
    private static final long IIO = 11000L;
    private static final long IIOI = 150L;

    private IIO0() {
    }

    public static IIO0 IIO0_II() {
        if (var_IIO0_II == null) {
            var_IIO0_II = new IIO0();
        }
        return var_IIO0_II;
    }

    public static IIO0 III() {
        return IIO0.IIO0_II();
    }

    @Override
    protected void II1l() {
        this.IIOI();
        this.IIIl.II(new IIOo(this, 100L));
        this.IIIl.II(new II0(this, 1000L));
        this.IIIl.II(new II0I(this, 0L));
        this.void_IIlo();
    }

    @Override
    protected void II11() {
        this.IIOl();
        this.IIIl.I_1O();
    }

    @Override
    protected void II1_() {
        this.IIIl.IIlO();
        if (!Ilol.Ilol_II().I_I_) {
            for (int i = 0; i < I1_I.var_I_0o_arr_III.length; ++i) {
                if (!this.III1[i]) continue;
                this.IIIO(i);
            }
        }
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    private void IIOI() {
        this.IllI = IlIO.III(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda65\uda3b\uda07\udaf3\udac3\udab1", 55582), false);
        this.Ill1 = IlIO.III(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9b9\ud982\uda62\uda5a\uda17\uda1b\udaf3\udadf\udab7\uda8a\udb48\udb42\udb2f\udb1e\udbf9", 55582), false);
        this.Ill_ = IlIO.III(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ba\ud998\uda78\uda52\uda20\uda12\udafb", 55582), false);
        for (int i = 0; i < 10; ++i) {
            this.III1[i] = IlIO.III(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda66\uda3f\uda1a\udafe\udadd", 55582) + i, false);
            this.var_long_arr_II[i] = IlIO.II(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ac\ud99e\uda7b\uda50\uda07\uda18\udafb\udadd\udabc", 55582) + i, 500);
            this.III_[i] = IlIO.III(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9be\ud985\uda79\uda4f\uda31\uda1d", 55582) + i, false);
        }
    }

    private void IIOl() {
        IlIO.II(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda65\uda3b\uda07\udaf3\udac3\udab1", 55582), this.IllI);
        IlIO.II(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9b9\ud982\uda62\uda5a\uda17\uda1b\udaf3\udadf\udab7\uda8a\udb48\udb42\udb2f\udb1e\udbf9", 55582), this.Ill1);
        IlIO.II(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ba\ud998\uda78\uda52\uda20\uda12\udafb", 55582), this.Ill_);
        for (int i = 0; i < 10; ++i) {
            IlIO.II(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda66\uda3f\uda1a\udafe\udadd", 55582) + i, this.III1[i]);
            IlIO.III(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ac\ud99e\uda7b\uda50\uda07\uda18\udafb\udadd\udabc", 55582) + i, (int)this.var_long_arr_II[i]);
            IlIO.II(IIO0.IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9be\ud985\uda79\uda4f\uda31\uda1d", 55582) + i, this.III_[i]);
        }
    }

    private void Il0_() {
        for (int i = 0; i < I1_I.var_I_0o_arr_III.length; ++i) {
            if (!this.III_[i] || I1_I.var_I_0o_arr_III[i] == null) continue;
            I1_I.var_I_0o_arr_III[i].l1_O = 0;
            I1_I.var_I_0o_arr_III[i].l1O = 0;
        }
    }

    private void IIIl(String string) {
        I1_I.var_I1Oo_II.IIII(string, 0);
    }

    private void Il0O() {
        if (this.IllI && !Ilol.Ilol_II().I11l) {
            for (int i = 0; i < Ilol.Ilol_II().var_I101_arr_II.length; ++i) {
                I101 i101 = Ilol.Ilol_II().var_I101_arr_II[i];
                if (i101 == null || i101.var_I1o_II.II__ != 454 && i101.var_I1o_II.II__ != 921 && i101.var_I1o_II.II__ != 1884) continue;
                I_0_.II().II((byte)0, (byte)1, (byte)i101.lIO_, (short)-1);
                break;
            }
        }
    }

    private void Il00() {
        long l;
        if (this.Ill1 && (l = IO10.IIII()) - this.II_1 >= 5000L) {
            this.II_1 = l;
            Ilol.Ilol_II().IOo_();
        }
    }

    public int IIIO() {
        short s = -1;
        I101[] i101Array = Ilol.Ilol_II().var_I101_arr_II;
        for (int i = 0; i < i101Array.length; ++i) {
            I101 i101 = i101Array[i];
            if (i101 == null) continue;
            short s2 = i101.var_I1o_II.II__;
            if (s2 == 1884) {
                return 1884;
            }
            if (s2 != 454 && s2 != 921 || s2 <= s) continue;
            s = s2;
        }
        return s;
    }

    private void Il0o() {
        if (this.Ill_) {
            if (!Ilol.Ilol_II().I_I_ && this.IIIO() != -1) {
                long l;
                long l2 = IO10.IIII();
                long l3 = l = Ilol.Ilol_II().I11l ? 11000L : 2600L;
                if (l2 - this.II__ >= l) {
                    this.II__ = l2;
                    int n = this.I101_II((int)this.IIIO()).lIO_;
                    I_0_.II().II((byte)0, (byte)1, (byte)n, (short)-1);
                    Ilol.Ilol_II().I11l = !Ilol.Ilol_II().I11l;
                }
            } else {
                this.Ill_ = false;
            }
        }
    }

    public I101 I101_II(int n) {
        for (int i = 0; i < Ilol.Ilol_II().var_I101_arr_II.length; ++i) {
            if (Ilol.Ilol_II().var_I101_arr_II[i] == null || Ilol.Ilol_II().var_I101_arr_II[i].var_I1o_II.II__ != n) continue;
            return Ilol.Ilol_II().var_I101_arr_II[i];
        }
        return null;
    }

    @Override
    public void II(String string, String string2) {
        String string3 = Ilo_.II().var_IOI0_II.java_lang_String_IIl1();
        if (string3 != null && !Il_o.boolean_III1(string3) && string != null && !Il_o.boolean_III1(string)) {
            if (Ilo_.II().II00.equals(IIO0.IIlO("\ud950\ud955\uc7f1\ud90b\ud9ba\ud9dd\ud9bd\ud99b\uda77\uda4c\uda74\uda5b\udaa3\uda81\udae0\udac2\udb3f\udb1d\udb7c\udb5b\udbba\udbc4\udbbb\udbce", 55582))) {
                this.IIl0(string3);
            }
        } else {
            Ilo_.II().I_10 = false;
        }
    }

    private void IIl0(String string) {
        try {
            long l = Long.parseLong(string);
            if (l < 100L) {
                l = 100L;
            }
            if (l > 10000L) {
                l = 10000L;
            }
            this.var_long_arr_II[this.IlOl] = l;
            this.III1[this.IlOl] = true;
            this.IIIl(IIO0.IIlO("\ud95f\ud948\ud928\ud914\ud9ba", 55582) + this.java_lang_String_II(this.IlOl) + IIO0.IIlO("\ud924\ud91d", 55582) + l + IIO0.IIlO("\ud973\ud94e", 55582));
            this.IIOl();
        }
        catch (Exception exception) {
            this.IIIl(IIO0.IIlO("\ud959\ud954\ud9bd\ud95b\ud9ee\ud9cb\uc713\ud9d7\uda7d\uda5d\udaa0\uda1d\udaf5\uda91\udab8\uc40c\udb7e\udb0d\udb20\uc5ac", 55582));
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

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                this.Illl = !this.Illl;
                this.IIIl(IIO0.IIlO("\ud94a\uc7cc\ud97c\ud86a\ud97b\ud9d7\ud9b0\ud9cd\uda36", 55582) + (this.Illl ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582)));
                this.II_I();
                break;
            }
            case 2: {
                this.Ilo();
                break;
            }
            case 3: {
                this.III_((Integer)object);
                break;
            }
            case 4: {
                int n2 = (Integer)object;
                boolean bl = this.III1[n2] = !this.III1[n2];
                if (this.III1[n2] && this.var_long_arr_II[n2] <= 0L) {
                    this.var_long_arr_II[n2] = 500L;
                }
                this.IIIl(IIO0.IIlO("\ud95f\ud948\ud928\ud914\ud9ba", 55582) + this.java_lang_String_II(n2) + IIO0.IIlO("\ud924\ud91d", 55582) + (this.III1[n2] ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582)));
                this.IIOl();
                this.III_(n2);
                break;
            }
            case 5: {
                this.III(IIO0.IIlO("\ud950\ud955\uc7f1\ud90b\ud9ba\ud9dd\ud9bd\ud99b\uda77\uda4c\uda74\uda5b\udaa3\uda81\udae0\udac2\udb3f\udb1d\udb7c\udb5b\udbba\udbc4\udbbb\udbce", 55582), IIO0.IIlO("\ud95a\ud958\ud930\ud91a\ud9e3", 55582));
                this.IlOl = (Integer)object;
                break;
            }
            case 6: {
                int n3 = (Integer)object;
                boolean bl = this.III_[n3] = !this.III_[n3];
                if (this.III_[n3] && I1_I.var_I_0o_arr_III[n3] != null) {
                    I1_I.var_I_0o_arr_III[n3].l1_O = 0;
                    I1_I.var_I_0o_arr_III[n3].l1O = 0;
                    this.IIIl(IIO0.IIlO("\ud80e\ud9ce\ud932\ud91c\ud9ba\ud9db\ud8db\ud999\uda71\uda15", 55582) + this.java_lang_String_II(n3) + IIO0.IIlO("\ud924\ud91d\ud91e\uc7d6\ud9ee", 55582));
                } else {
                    this.IIIl(IIO0.IIlO("\ud80e\ud9ce\ud932\ud91c\ud9ba\ud9db\ud8db\ud999\uda71\uda15", 55582) + this.java_lang_String_II(n3) + IIO0.IIlO("\ud924\ud91d\ud908\uc7d4\ud9ee", 55582));
                }
                this.IIOl();
                this.III_(n3);
                break;
            }
            case 7: {
                this.Ill1 = !this.Ill1;
                this.IIIl(IIO0.IIlO("\ud94a\uc7cc\ud97c\ud86a\uc74f\ud9d0\ud9f8\ud99a\uc4f3\uda56\uda74\uda07\udafb\uda5b\udaa5\udad5\udb2e", 55582) + (this.Ill1 ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582)));
                this.IIOl();
                this.II_I();
                break;
            }
            case 8: {
                this.Ill_ = !this.Ill_;
                this.IIIl(IIO0.IIlO("\ud95a\ud9c4\ud932\ud91c\ud9ba\ud9db\ud92c\ud999\uda71\uda15\uda20\uda12\udafb\uda8b\udaf0", 55582) + (this.Ill_ ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582)));
                this.IIOl();
                this.II_I();
                break;
            }
            case 9: {
                if (!this.Ill_) {
                    this.IllI = !this.IllI;
                    this.IIIl(IIO0.IIlO("\ud94a\uc7cc\ud97c\ud913\uc779\ud9c9\ud9f8\ud983\uda7e\uc4f6\uda6e\uda53", 55582) + (this.IllI ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582)));
                    this.IIOl();
                } else {
                    this.IIIl(IIO0.IIlO("\ud956\ud9de\ud925\ud95b\ud9ee\uc716\ud9ac\ud9d7\uda72\udacc\uda3a\uda14\udab2\udad3\uda24\uda81\udb69\udb0d\udb38\udb0a\udbe3", 55582));
                }
                this.II_I();
                break;
            }
            case 99: {
                this.Ilo();
                break;
            }
            case 200: {
                IlI.III().I_1l();
                break;
            }
            case 999: {
                this.II_I();
            }
        }
    }

    public void II_I() {
        Il1_.II().Il1__III().II(IIO0.IIlO("\ud95f\ud948\ud928\ud914\ud9ba\ud9ea\ud9b3\ud99e\uda7a\uda59", 55582)).II(IIO0.IIlO("\ud94a\uc7cc\ud97c\ud86a\ud97b\ud9d7\ud9b0", 55582), this.Illl ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582), 1, null).II(I1_I.var_I_0o_arr_III.length + IIO0.IIlO("\ud93e\ud956\uc7a5\ud95b\ud9f4\ud8ba\ud9b6\ud990", 55582), "", 2, null).II(IIO0.IIlO("\ud94a\uc7cc\ud97c\ud86a\uc74f\ud9d0\ud9f8\ud99a\uc4f3\uda56\uda74\uda07\udafb\uda5b\udaa5", 55582), this.Ill1 ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582), 7, null).II(IIO0.IIlO("\ud95a\ud9c4\ud932\ud91c\ud9ba\ud9e9\ud9b7\ud983\uda77\uda47\uda35", 55582), this.Ill_ ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582), 8, null).II(IIO0.IIlO("\ud94a\uc7cc\ud97c\ud913\uc779\ud9c9\ud9f8\ud983\uda7e\uc4f6", 55582), this.IllI ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582), 9, null).II(IIO0.IIlO("\ud94f\ud948\ud93d\ud902\ud9ba\ud9d5\uc779\ud99e", 55582), "", 200, null).Il1__II(this).I__0();
    }

    private void Ilo() {
        Il1_ il1_ = Il1_.II().Il1__III().II(IIO0.IIlO("\ud95d\ud955\uc791\ud915\ud9ba\ud9d2\uc721\ud9d7\uda78\udb36\uda3a\uda14", 55582));
        for (int i = 0; i < I1_I.var_I_0o_arr_III.length; ++i) {
            String string = this.java_lang_String_II(i);
            il1_.II(string + IIO0.IIlO("\ud93e\ud966", 55582) + (i + 1) + IIO0.IIlO("\ud943", 55582), "", 3, new Integer(i));
        }
        il1_.II(IIO0.IIlO("\ud94f\ud948\ud93d\ud902\ud9ba\ud9d5\uc779\ud99e", 55582), "", 999, null).Il1__II(this).I__0();
    }

    private void III_(int n) {
        String string = this.III1[n] ? IIO0.IIlO("\ud95c\uc790\ud928\ud95b\ud9c1", 55582) + this.var_long_arr_II[n] + IIO0.IIlO("\ud973\ud94e\ud901", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582);
        String string2 = this.III_[n] ? IIO0.IIlO("\ud95c\uc790\ud928", 55582) : IIO0.IIlO("\ud94a\uc792\ud928", 55582);
        Il1_.II().Il1__III().II(this.java_lang_String_II(n)).II(IIO0.IIlO("\ud94d\uc7d0\ud97c\ud91f\uc77f\ud9d7\ud9bf", 55582), string, 4, new Integer(n)).II(IIO0.IIlO("\ud950\ud955\uc7f1\ud90b\ud9ba\ud9dd\ud9bd\ud99b\uda77\uda4c", 55582), "", 5, new Integer(n)).II(IIO0.IIlO("\ud80e\ud9ce\ud932\ud91c\ud9ba\ud9db\ud8db\ud999\uda71\uda15\uda27\uda18\udafb\udadd\udabc", 55582), string2, 6, new Integer(n)).II(IIO0.IIlO("\ud94f\ud948\ud93d\ud902\ud9ba\ud9d5\uc779\ud99e", 55582), "", 99, null).Il1__II(this).I__0();
    }

    private String java_lang_String_II(int n) {
        if (n >= 0 && n < I1_I.var_I_0o_arr_III.length) {
            return I1_I.var_I_0o_arr_III[n] != null ? I1_I.var_I_0o_arr_III[n].II.II1o : IIO0.IIlO("\ud94a\ud94f\uc78d\ud915\ud9fd", 55582);
        }
        return IIO0.IIlO("\ud94a\ud94f\uc78d\ud915\ud9fd", 55582);
    }

    @Override
    public void Illl() {
        Ilo_ ilo_ = Ilo_.II();
        ilo_.II00 = IIO0.IIlO("\ud95d\ud955\ud93d\ud90f", 55582);
        ilo_.var_IOI0_II.II1o = IIO0.IIlO("\ud97d\ud955\ud93d\ud90f", 55582);
        ilo_.var_IOI0_II.IIOl("");
        ilo_.I_10 = false;
        ilo_.var_I1___II = I1_I.I1_I_II();
        ilo_.III0 = null;
        this.III_(this.IlOl);
        II.var_I_1o_II.I__0();
    }

    public void IloI() {
        I_0o i_0o;
        Ilol ilol = Ilol.Ilol_II();
        if (!(ilol == null || ilol.I_I_ || ilol.IOl_ <= 0 || ilol.IOIl == 14 || ilol.IOIl == 5 || (i_0o = ilol.var_I_0o_II) == null || i_0o.II == null || i_0o.II.IoI_ == 3 || i_0o.II.IlIO == 10 || i_0o.II.IlIO == 11 || i_0o.I0Ol && !II.var_I_1o_II.I_10)) {
            int n = this.III0();
            long l = this.long_II(i_0o);
            long l2 = IO10.IIII();
            if (l2 - this.IIII[n] >= l) {
                if (I1_I.IIIl(ilol.var_I_I__IIII)) {
                    this.IIII[n] = l2;
                    this.Ilo1();
                    i_0o.I1IO = l2;
                } else if (ilol.var_Ilol_IIIl != null && this.III1(ilol.var_Ilol_IIIl) && (double)Math.abs(ilol.var_Ilol_IIIl.I_o_ - ilol.I_o_) < (double)ilol.var_I_0o_II.l1_0 * 1.7) {
                    this.IIII[n] = l2;
                    this.Ilol();
                    i_0o.I1IO = l2;
                }
            }
        }
    }

    private void IIIO(int n) {
        if (IOlO.l1oI == 21 || IOlO.l1oI == 22 || IOlO.l1oI == 23) {
            return;
        }
        if (n >= I1_I.var_I_0o_arr_III.length) {
            n = I1_I.var_I_0o_arr_III.length - 1;
        }
        if (n < 0) {
            n = 0;
        }
        if (I1_I.var_I_0o_arr_III[n] == null || I1_I.var_I_0o_arr_III[n].I0Ol) {
            return;
        }
        if (I1_I.var_I_0o_arr_III[n].l1_O == 0 && this.var_long_arr_II[n] <= 0L) {
            this.var_long_arr_II[n] = 500L;
        } else if (this.boolean_II(I1_I.var_I_0o_arr_III[n]) && !I1_I.I1_I_II().IIol()) {
            long l = IO10.IIII();
            if (l - this.II_O < 150L) {
                return;
            }
            if (this.var_long_arr_II[n] == -1L && II.var_int_IIIO % 20 == 0) {
                I1_I.I1_I_II().II(I1_I.var_I_0o_arr_III[n], true);
                this.III[n] = 0L;
            } else if (l - this.III[n] >= this.var_long_arr_II[n]) {
                this.III[n] = l;
                this.II_O = l;
                I1_I.I1_I_II().II(I1_I.var_I_0o_arr_III[n], true);
            }
        }
    }

    public boolean III1(Ilol ilol) {
        if (IOlO.l1oI == 113) {
            if (ilol != null && Ilol.Ilol_II().var_I_0o_II != null) {
                return ilol.var_byte_III0 == 5 || ilol.var_byte_III0 == 3;
            }
            return false;
        }
        if (ilol != null && Ilol.Ilol_II().var_I_0o_II != null) {
            if (!(ilol.IOIl != 14 && ilol.IOIl != 5 && Ilol.Ilol_II().var_I_0o_II.II.IoI_ != 2 && (Ilol.Ilol_II().var_byte_IIl == 8 && ilol.var_byte_IIl != 0 || Ilol.Ilol_II().var_byte_IIl != 0 && ilol.var_byte_IIl == 8 || Ilol.Ilol_II().var_byte_IIl != ilol.var_byte_IIl && Ilol.Ilol_II().var_byte_IIl != 0 && ilol.var_byte_IIl != 0 || ilol.var_byte_III0 == 3 && Ilol.Ilol_II().var_byte_III0 == 3 || Ilol.Ilol_II().var_byte_III0 == 5 || ilol.var_byte_III0 == 5 || Ilol.Ilol_II().var_byte_III0 == 1 && ilol.var_byte_III0 == 1 || Ilol.Ilol_II().var_byte_III0 == 4 && ilol.var_byte_III0 == 4))) {
                if (Ilol.Ilol_II().var_I_0o_II.II.IoI_ == 2) {
                    return ilol.var_byte_III0 != 5;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean boolean_II(I_0o i_0o) {
        if (i_0o.II.l1Ol == 2) {
            return true;
        }
        if (i_0o.II.l1Ol != 1) {
            return Ilol.Ilol_II().IOl1 >= i_0o.l1O;
        }
        return Ilol.Ilol_II().IOl1 >= i_0o.l1O * Ilol.Ilol_II().IO1 / 100;
    }

    private void Ilol() {
        try {
            I_lO i_lO = new I_lO("");
            i_lO.addElement(Ilol.Ilol_II().var_Ilol_IIIl);
            I_0_.II().II(new I_lO(""), i_lO, 2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void Ilo1() {
        try {
            I_lO i_lO = new I_lO("");
            i_lO.addElement(Ilol.Ilol_II().var_I_I__IIII);
            I_0_.II().II(i_lO, new I_lO(""), 1);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private long long_II(I_0o i_0o) {
        byte by = i_0o.II.IlIO;
        return by != 20 && by != 22 && by != 7 && by != 18 && by != 23 ? (long)i_0o.l1_O + 100L : (long)i_0o.l1_O + 500L;
    }

    private int III0() {
        for (int i = 0; i < I1_I.var_I_0o_arr_III.length; ++i) {
            if (I1_I.var_I_0o_arr_III[i] != Ilol.Ilol_II().var_I_0o_II) continue;
            return i;
        }
        return 0;
    }

    static /* synthetic */ void II(IIO0 iIO0) {
        iIO0.Il00();
    }

    static /* synthetic */ void III(IIO0 iIO0) {
        iIO0.Il0_();
    }

    static /* synthetic */ void IIII(IIO0 iIO0) {
        iIO0.Il0o();
    }

    static /* synthetic */ void IIIl(IIO0 iIO0) {
        iIO0.Il0O();
    }

    private static /* synthetic */ String IIlO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

