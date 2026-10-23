package main;

/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;

public final class I_OI
extends IO1_
implements I1_1 {
    private IOI0 IIIl;
    private IOI0 IIIO;
    private IOI0 III0;
    private IOI0 IIIo;
    private IOI0 var_IOI0_IIl;
    private IOI0 IIlI;
    private IOI0 IIll;
    private IOI0 IIl1;
    private IOI0 IIl_;
    private static boolean IO0_ = false;
    private int IoII;
    private int IIO0;
    private int IIOo;
    private boolean var_boolean_IIl = false;
    private boolean I01o = false;
    private I1Il II__;
    private I1Il II_O;
    private I1Il II_0;
    private I1Il II;
    private I1Il II_o;
    private int II0l;
    private I1Il IIO;
    private int var_int_IIl;
    private int I1 = 130;
    private int I1I;
    private int Ioll = -1;
    private boolean I_O = false;
    private int I1_O = 2;
    private int I1_0 = 0;
    private int I1_o = -40;
    private int I1O = 1;

    @Override
    public void I0l_() {
        System.out.println(I_OI.Il0I("\u35aa\u3672\u3645\u3675\u3607\u36e4\u36db\u36a5\u3693\u3767", 13816));
        IO.II();
        this.IIIl.Il_0 = true;
        this.IIIO.Il_0 = false;
        if (II.var_boolean_IIIl) {
            this.IIIl.Il_0 = false;
        }
        super.I0l_();
    }

    public I_OI(byte by) {
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        IOlO.l1o1 = by2;
        if (by2 == 5 || IOlO.l1o1 == 6) {
            IOlO.l1o1 = 4;
        }
        I1_I.IIlI(-1, -1);
        I1_I.Io1 = 100;
        I1_I.Io1I = 200;
        this.IIOo = II.var_int_IIlI > 200 ? II.var_int_IIl1 - 80 : II.var_int_IIl1 - 65;
        this.IIO0 = -50;
        this.II0l = II.var_int_IIl1 - IO1_.ll11 - 5;
        if (II.var_int_IIlI <= 160) {
            this.II0l = 20;
        }
        this.IIl_ = new IOI0();
        this.IIl_.Ill(1);
        this.IIl_.l10 = 220;
        this.IIl_.l10I = IO1_.ll11 + 2;
        this.IIl_.II1o = I_OI.Il0I("\u35ab\u28c6\u3616\u3744\u361d\u2854\u36dc\u36f1\u3684\u3767\u3741\u29ec\u3705\u37a4\u378a\u36d8\u2923\u3866\u3806\u3826\u380c\u264a\u3882\u38a4\u388d\u389e\u3977\u3951", 13816);
        this.IIl_.IIOl(I_OI.Il0I("\u35c8\u3626\u3604\u3666\u3640\u36a6\u3684\u36e6\u36c8\u3736\u371e", 13816));
        this.IIIl = new IOI0();
        this.IIIl.l10 = 220;
        this.IIIl.l10I = IO1_.ll11 + 2;
        this.IIIl.Il_0 = true;
        this.IIIl.II1o = I_OI.Il0I("\u35b0\u28da\u3616\u3623\u3694\u36b3\u36c6\u363b\u369e", 13816);
        this.IIIl.IIOl(I_OI.Il0I("\u35b6\u3670\u3643\u362c\u28b1\u36fd\u3692\u3687\u37f3\u3761\u370e\u370c", 13816));
        this.IIIl.Ill(0);
        this.IIIO = new IOI0();
        this.IIIO.Ill(1);
        this.IIIO.l10 = 70;
        this.IIIO.l10I = IO1_.ll11 + 2;
        this.IIIO.II1o = I_OI.Il0I("\u35b6\u3670\u36d6\u362c\u3654\u36e0\u36db\u36bf\u3698", 13816);
        this.IIIO.IIOl(I_OI.Il0I("\u35c8\u3626", 13816));
        this.III0 = new IOI0();
        this.III0.Ill(1);
        this.III0.l10 = 70;
        this.III0.l10I = IO1_.ll11 + 2;
        this.III0.II1o = I_OI.Il0I("\u35ac\u367f\u36d7\u363b\u3613\u36b3\u36c1\u36b8\u369e\u3767", 13816);
        this.III0.IIOl(I_OI.Il0I("\u35c8\u3626", 13816));
        this.IIIo = new IOI0();
        this.IIIo.Ill(1);
        this.IIIo.l10 = 70;
        this.IIIo.l10I = IO1_.ll11 + 2;
        this.IIIo.II1o = I_OI.Il0I("\u35b6\u3714\u365b\u3675\u3607\u36fa\u36dc\u36b9", 13816);
        this.IIIo.IIOl(I_OI.Il0I("\u35c9\u362e\u360e\u3665", 13816));
        this.var_IOI0_IIl = new IOI0();
        this.var_IOI0_IIl.Ill(0);
        this.var_IOI0_IIl.l10 = 220;
        this.var_IOI0_IIl.l10I = IO1_.ll11 + 2;
        this.var_IOI0_IIl.II1o = I_OI.Il0I("\u34e8\u28dc\u3657\u3675\u3617\u36fb\u287b\u36f1\u37e1\u360c\u3740\u372a\u374c\u37e0\u3757\u37e9\u379c\u386f\u3996\u2698\u380a\u38e4\u3882\u38b5\u3892\u3805", 13816);
        this.var_IOI0_IIl.IIOl(I_OI.Il0I("\u35c9\u3625\u3605\u3675\u3765\u3723\u286f\u36bf\u3697\u372f\u375d\u299c\u374c\u37ba\u3786\u37e9\u37b9\u3872\u268b\u382b\u3844\u38b2\u388e\u38e1\u38b4\u38af\u3930\u3975\u391f\u3936", 13816));
        this.IIlI = new IOI0();
        this.IIlI.Ill(1);
        this.IIlI.l10 = 220;
        this.IIlI.l10I = IO1_.ll11 + 2;
        this.IIlI.II1o = I_OI.Il0I("\u35ab\u28c6\u3616\u3616\u361c\u287a\u36dc\u36b6\u36d0\u3762\u3747\u3723\u3704\u37ab\u37c4\u37a1\u370a\u3869\u3806\u3821\u3886\u38ed\u3882\u38a9\u388f\u2648\u397d\u391d\u392f\u27aa\u39ba\u39d1\u2701\u39d7\u3a75\u3a5d\u3a3d\u24cc\u3ae7", 13816);
        this.IIlI.IIOl(I_OI.Il0I("\u35c9\u3625\u3605\u3661\u3641\u36a5\u3685\u36e9\u36c9", 13816));
        this.IIll = new IOI0();
        this.IIll.Ill(1);
        this.IIll.l10 = 220;
        this.IIll.l10I = IO1_.ll11 + 2;
        this.IIll.II1o = I_OI.Il0I("\u35b6\u3670\u36d6\u362c\u3654\u36f0\u2817\u36a1", 13816);
        this.IIll.IIOl(I_OI.Il0I("\u35c8\u3626\u3619\u3665\u3645\u36bc\u3683\u36e8\u36c9\u373f", 13816));
        this.IIl1 = new IOI0();
        this.IIl1.Ill(0);
        this.IIl1.l10 = 220;
        this.IIl1.l10I = IO1_.ll11 + 2;
        this.IIl1.II1o = I_OI.Il0I("\u35b6\u37b6\u365f\u3675\u3617\u2836\u36c2", 13816);
        this.IIl1.IIOl(I_OI.Il0I("\u35ac\u3647\u3618\u361d\u3637\u36de", 13816));
        this.II0l += 35;
        this.var_boolean_IIl = true;
        this.IoII = 0;
        this.II__ = new I1Il(II.var_int_IIl > 200 ? IO11.I1_o : IO11.I1O, II.var_II_II, 888393, null);
        new I1Il(IO11.I_ll, this, 2001, null);
        this.II_0 = new I1Il(IO11.I1OI, this, 2002, null);
        this.II_o = new I1Il(IO11.I_l_, this, 10021, null);
        ((IO1_)this).IIIo = this.II = new I1Il(IO11.I_, this, 2003, null);
        if (II.var_boolean_IIIl) {
            this.II__.I1 = II.var_int_IIl / 2 - 100;
            this.II.I1 = II.var_int_IIl / 2 - IO1_.l_Io - 8;
            if (II.var_int_IIlI >= 200) {
                this.II__.I1I = II.var_int_IIlI / 2 - 40;
                this.II.I1I = this.I1 + 110;
            }
            this.II_o.I1 = II.var_int_IIl / 2 + 3;
            this.II_o.I1I = this.I1 + 110;
            this.II_0.I1 = II.var_int_IIl / 2 - 84;
            this.II_0.I1I = this.II.I1I;
        }
        this.I1I = 170;
        int n = 184;
        if (184 >= II.var_int_IIl) {
            n = 152;
        }
        this.var_int_IIl = II.var_int_IIl / 2 - n / 2;
        this.I1 = 5;
        this.IIIl.II0I = this.var_int_IIl + 10;
        this.IIIl.I_O0 = this.I1 + 20;
        this.IIO = new I1Il(IO11.I_lI, this, 2008, null);
        this.IIO.I1 = 260;
        this.IIO.I1I = II.var_int_IIlI - 60;
        this.II_O = new I1Il(I_OI.Il0I("\u35ac\u367f\u3659\u36b4\u3600", 13816), this, 1003, null);
        this.II_O.I1 = 260;
        this.II_O.I1I = II.var_int_IIlI - 30;
        if (II.var_int_IIl < 250) {
            this.IIO.I1 = II.var_int_IIl / 2 - 80;
            this.II_O.I1 = II.var_int_IIl / 2 + 10;
            this.II_O.I1I = this.IIO.I1I = II.var_int_IIlI - 25;
        }
        ((IO1_)this).III0 = this.IIO;
        ((IO1_)this).IIIo = this.II_O;
    }

    @Override
    public void void_IIlO() {
        this.IIIl.IIlO();
        this.IIIO.IIlO();
        this.III0.IIlO();
        this.IIIo.IIlO();
        this.var_IOI0_IIl.IIlO();
        this.IIlI.IIlO();
        this.IIl1.IIlO();
        this.IIl_.IIlO();
        this.IIll.IIlO();
        for (int i = 0; i < I1l1.II1_.size(); ++i) {
            ((I1l1)I1l1.II1_.elementAt(i)).IIlO();
        }
        if (++I1_I.Io1 > II.var_int_IIl * 3 + 100) {
            I1_I.Io1 = 100;
        }
        if (Ilo1.var_Ilo1_III == null) {
            if (this.IIOo != this.IIO0) {
                this.IIO0 += this.IIOo - this.IIO0 >> 1;
            }
            if (this.I1_0 >= 0) {
                this.I1_o += this.I1O * this.I1_0;
                this.I1_0 += this.I1O * this.I1_O;
                if (this.I1_0 <= 0) {
                    this.I1O = -this.I1O;
                }
                if (this.I1_o > 0) {
                    this.I1O = -this.I1O;
                    this.I1_0 -= 2 * this.I1_O;
                }
            }
            if (this.Ioll >= 0 && II.var_int_IIIO % 100 == 0) {
                ++this.Ioll;
                if (this.Ioll >= IO11.II0O.length) {
                    this.Ioll = 0;
                }
                if (II.var_I1l_II == II.var_I_l1_II && II.var_I_l1_II.I_1o) {
                    II.var_I_l1_II.II10(IO11.II0O[this.Ioll]);
                }
            }
            if (II.var_boolean_IIIl) {
                if (this.I01o) {
                    ((IO1_)this).III0 = this.II_0;
                    ((IO1_)this).IIIo = this.II_o;
                } else {
                    ((IO1_)this).III0 = this.IIO;
                    ((IO1_)this).IIIo = this.II_O;
                }
            } else if (this.I01o) {
                ((IO1_)this).III0 = this.II_0;
                ((IO1_)this).IIIo = this.II_o;
            } else {
                ((IO1_)this).III0 = this.IIO;
                ((IO1_)this).IIIo = this.II_O;
            }
        }
    }

    @Override
    public void IIO1(int n) {
        if (this.IIIl.Il_0) {
            this.IIIl.II1o(n);
        } else if (this.IIIO.Il_0) {
            this.IIIO.II1o(n);
        }
        super.IIO1(n);
    }

    @Override
    public void III_(IO1l iO1l) {
        II.III1(iO1l);
        if (Ilo1.var_Ilo1_III == null && Ilo1.var_Ilo1_IIII == null) {
            if (II.var_I1l_II == null) {
                this.var_int_IIl = 5;
                if (II.var_int_IIl < 260) {
                    this.var_int_IIl = (II.var_int_IIl - 240) / 2;
                }
                this.I1 = (II.var_int_IIlI - 233) / 2;
                I__O.II(iO1l, this.var_int_IIl, this.I1, 240, 233, -1, true);
                this.IIl_.II0I = this.var_int_IIl + 10;
                this.IIl_.I_O0 = this.I1 + 15;
                this.IIIl.II0I = this.IIl_.II0I;
                this.IIIl.I_O0 = this.IIl_.I_O0 + 30;
                this.IIIO.II0I = this.var_int_IIl + 10;
                this.IIIO.I_O0 = this.IIIl.I_O0 + 30;
                this.III0.II0I = this.IIIO.II0I + 75;
                this.III0.I_O0 = this.IIIO.I_O0;
                this.IIIo.II0I = this.III0.II0I + 75;
                this.IIIo.I_O0 = this.III0.I_O0;
                this.var_IOI0_IIl.II0I = this.IIIl.II0I;
                this.var_IOI0_IIl.I_O0 = this.IIIO.I_O0 + 30;
                this.IIlI.II0I = this.IIIl.II0I;
                this.IIlI.I_O0 = this.var_IOI0_IIl.I_O0 + 30;
                this.IIll.II0I = this.IIIl.II0I;
                this.IIll.I_O0 = this.IIlI.I_O0 + 30;
                this.IIl1.II0I = this.IIIl.II0I;
                this.IIl1.I_O0 = this.IIll.I_O0 + 30;
                this.IIIl.III_(iO1l);
                this.IIIO.III_(iO1l);
                this.III0.III_(iO1l);
                this.IIIo.III_(iO1l);
                this.var_IOI0_IIl.III_(iO1l);
                this.IIlI.III_(iO1l);
                this.IIll.III_(iO1l);
                this.IIl1.III_(iO1l);
                this.IIl_.III_(iO1l);
                if (II.var_int_IIl < 176) {
                    IO1I.IIIO.II(iO1l, IO11.I11O + I_OI.Il0I("\u35c2", 13816), this.IIIl.II0I - 35, this.IIIl.I_O0 + 7, 0);
                    IO1I.IIIO.II(iO1l, IO11.I110 + I_OI.Il0I("\u35c2", 13816), this.IIIO.II0I - 35, this.IIIO.I_O0 + 7, 0);
                    IO1I.IIIO.II(iO1l, IO11.I101 + I_OI.Il0I("\u35c2\u3637", 13816) + null, II.var_int_IIl / 2, this.IIIO.I_O0 + 32, 2);
                }
            }
            String string = I_OI.Il0I("\u35c9\u3639\u3606\u367b\u3646", 13816);
            iO1l.Illl(II.var_int_IIl_);
            iO1l.III_(II.var_int_IIl - 40, 4, 36, 11);
            IO1I.IIlO.II(iO1l, string, II.var_int_IIl - 22, 4, 2);
            II.II(iO1l);
            if (II.var_I1l_II == null) {
                if (II.var_int_IIl > 250) {
                    IO1I.IIII.II(iO1l, I_OI.Il0I("\u35bc\u37a7\u28ed\u363c\u3654\u36a2\u368a\u36f1\u3684\u377a\u29fb\u3724", 13816), 260, 10, 0, IO1I.III_);
                    IO1I.IIII.II(iO1l, I_OI.Il0I("\u359b\u367f\u28ff\u3675\u3617\u3660\u3692\u36a5\u3698\u29cc\u370e\u372e\u3704\u362a\u37c3", 13816), 260, 25, 0, IO1I.III_);
                    IO1I.IIII.II(iO1l, I_OI.Il0I("\u35c9\u362f\u3606\u3625\u3654\u36a2\u3692\u36bf\u3697\u37ef\u3757", 13816), 260, 40, 0, IO1I.III_);
                } else {
                    IO1I.IIII.II(iO1l, I_OI.Il0I("\u35bc\u37a7\u28ed\u363c\u3654\u36a2\u368a\u36f1\u3684\u377a\u29fb\u3724\u374c\u37e8\u37c2\u2900\u37c8\u3864\u38d5\u3865\u3810\u38eb\u2661\u38e1\u3883\u3897\u38bf\u3954", 13816), II.var_int_IIl / 2, 5, 2, IO1I.III_);
                    IO1I.IIII.II(iO1l, I_OI.Il0I("\u35c9\u362f\u3606\u3625\u3654\u36a2\u3692\u36bf\u3697\u37ef\u3757", 13816), II.var_int_IIl / 2, 15, 2, IO1I.III_);
                }
            }
            super.III_(iO1l);
        }
    }

    @Override
    public void I_Il() {
        if (!II.var_boolean_IIIl) {
            ((IO1_)this).IIl = this.IIIl.Il_0 ? this.IIIl.IIII : this.IIIO.IIII;
        }
        if (II.var_boolean_arr_II[2]) {
            --this.IoII;
            if (this.IoII < 0) {
                this.IoII = 1;
            }
        } else if (II.var_boolean_arr_II[8]) {
            ++this.IoII;
            if (this.IoII > 1) {
                this.IoII = 1;
            }
        }
        if (II.var_boolean_arr_II[2] || II.var_boolean_arr_II[8]) {
            II.IIIl();
            if (this.IoII == 1) {
                this.IIIl.Il_0 = false;
                this.IIIO.Il_0 = true;
            } else if (this.IoII == 0) {
                this.IIIl.Il_0 = true;
                this.IIIO.Il_0 = false;
            } else {
                this.IIIl.Il_0 = false;
                this.IIIO.Il_0 = false;
            }
        }
        if (II.var_boolean_IIIl) {
            if (this.I01o) {
                ((IO1_)this).III0 = this.II_0;
                ((IO1_)this).IIIo = this.II_o;
            } else {
                ((IO1_)this).III0 = this.IIO;
                ((IO1_)this).IIIo = this.II_O;
            }
        } else if (this.I01o) {
            ((IO1_)this).III0 = this.II_0;
            ((IO1_)this).IIIo = this.II_o;
        } else {
            ((IO1_)this).III0 = this.IIO;
            ((IO1_)this).IIIo = this.II_O;
        }
        if (II.var_boolean_IIIo) {
            if (II.II(this.IIIl.II0I, this.IIIl.I_O0, this.IIIl.l10, this.IIIl.l10I)) {
                this.IoII = 0;
            } else if (II.II(this.IIIO.II0I, this.IIIO.I_O0, this.IIIO.l10, this.IIIO.l10I)) {
                this.IoII = 1;
            }
        }
        super.I_Il();
        II.IIIl();
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1000: {
                try {
                    GameMidlet.II.platformRequest((String)object);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                II.III_();
                return;
            }
            case 1001: {
                II.III_();
                this.I01o = false;
                return;
            }
            case 1002: {
                return;
            }
            case 1003: {
                II.var_I_0l_II.I0l_();
                I_0O.II().close();
                return;
            }
            case 1004: {
                I_0l.Io1O();
                II.var_I_0l_II.I0l_();
                return;
            }
            case 1005: {
                try {
                    GameMidlet.II.platformRequest(I_OI.Il0I("\u3590\u3663\u3642\u3625\u364e\u36bc\u369d\u36bf\u3697\u3760\u374d\u373f\u3703\u37e5\u37cd\u37a6\u3786\u386b\u384f\u382b\u3801\u38ad\u38c1\u38ae\u388d", 13816));
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.var_boolean_IIl) {
                    this.var_boolean_IIl = false;
                    return;
                }
                this.var_boolean_IIl = true;
                return;
            }
            case 2002: {
                I_OI i_OI = this;
                if (this.IIIl.java_lang_String_IIl1().equals("")) {
                    II.II(IO11.IlO);
                    break;
                }
                this.IIIl.java_lang_String_IIl1().toCharArray();
                if (this.IIIO.java_lang_String_IIl1().equals("")) {
                    II.II(IO11.I1Io);
                    break;
                }
                if (this.IIIl.java_lang_String_IIl1().length() >= 5) {
                    boolean bl;
                    String string = null;
                    if (IO11.IllI == 2) {
                        if (this.IIIl.java_lang_String_IIl1().indexOf(I_OI.Il0I("\u35b8", 13816)) == -1 || this.IIIl.java_lang_String_IIl1().indexOf(I_OI.Il0I("\u35d6", 13816)) == -1) {
                            string = IO11.I1ll;
                        }
                        bl = false;
                    } else {
                        try {
                            Long.parseLong(i_OI.IIIl.java_lang_String_IIl1());
                            if (i_OI.IIIl.java_lang_String_IIl1().length() < 8 || i_OI.IIIl.java_lang_String_IIl1().length() > 12 || !i_OI.IIIl.java_lang_String_IIl1().startsWith(I_OI.Il0I("\u35c8", 13816)) && !i_OI.IIIl.java_lang_String_IIl1().startsWith(I_OI.Il0I("\u35c0\u3623", 13816))) {
                                string = IO11.I1lI;
                            }
                            bl = true;
                        }
                        catch (Exception exception) {
                            if (this.IIIl.java_lang_String_IIl1().indexOf(I_OI.Il0I("\u35b8", 13816)) == -1 || this.IIIl.java_lang_String_IIl1().indexOf(I_OI.Il0I("\u35d6", 13816)) == -1) {
                                string = IO11.I1ll;
                            }
                            bl = false;
                        }
                    }
                    if (string != null) {
                        II.II(string);
                    } else {
                        II.var_I_l1_II.II(IO11.I11l + (bl ? IO11.I111 + I_OI.Il0I("\u35c2\u3637", 13816) : IO11.I11_ + I_OI.Il0I("\u35c2\u3637", 13816)) + this.IIIl.java_lang_String_IIl1() + I_OI.Il0I("\u35f2", 13816) + IO11.I1l0 + I_OI.Il0I("\u35c2\u3637", 13816) + this.IIIO.java_lang_String_IIl1(), new I1Il(IO11.I_l1, this, 4000, null), null, new I1Il(IO11.I_IO, II.var_II_II, 8882, null));
                    }
                    II.var_I1l_II = II.var_I_l1_II;
                    return;
                }
                II.II(IO11.I1l);
                break;
            }
            case 2003: {
                I_lO i_lO = new I_lO(I_OI.Il0I("\u358e\u365a\u3653\u363b\u3601\u36b3\u36fe\u36be\u3697\u3766\u3740", 13816));
                i_lO.addElement(new I1Il(IO11.I1l1, this, 2004, null));
                i_lO.addElement(new I1Il(IO11.I1l_, this, 1004, null));
                i_lO.addElement(new I1Il(IO11.I1lO, this, 1003, null));
                i_lO.addElement(new I1Il(IO11.I10l, this, 1005, null));
                if (I_O1.III(I_OI.Il0I("\u3594\u3678\u3641\u3612\u3606\u36f2\u36c2\u36b9\u3699\u376c", 13816)) == 1) {
                    i_lO.addElement(new I1Il(IO11.I_OO, this, 10041, null));
                } else {
                    i_lO.addElement(new I1Il(IO11.I_O0, this, 10042, null));
                }
                i_lO.addElement(new I1Il(IO11.I_I0, II.var_II_II, 8885, null));
                II.var_I_II_II.II(i_lO);
                return;
            }
            case 2004: {
                II.III_();
                II.II(IO11.Ioo);
                this.I01o = true;
                this.IIIO.Il_0 = false;
                this.IIIl.Il_0 = true;
                return;
            }
            case 2008: {
                if (this.IIIO.java_lang_String_IIl1().equals("") || this.III0.java_lang_String_IIl1().equals("") || this.IIIo.java_lang_String_IIl1().equals("") || this.var_IOI0_IIl.java_lang_String_IIl1().equals("") || this.IIlI.java_lang_String_IIl1().equals("") || this.IIll.java_lang_String_IIl1().equals("") || this.IIl1.java_lang_String_IIl1().equals("") || this.IIl_.java_lang_String_IIl1().equals("") || this.IIIl.java_lang_String_IIl1().equals("")) {
                    II.II(I_OI.Il0I("\u35ae\u3662\u365f\u3675\u3618\u3661\u36dc\u36b6\u36d0\u361e\u3747\u298c\u3702\u37ab\u36bb\u296e\u3791\u3827\u3937\u26a2\u3844\u38f7\u38ca\u3835\u388e\u3898\u393e\u3949\u3935\u3915", 13816));
                    return;
                }
                II.II(IO11.I1O1);
                I_0_.II().II(this.IIIO.java_lang_String_IIl1(), this.III0.java_lang_String_IIl1(), this.IIIo.java_lang_String_IIl1(), this.var_IOI0_IIl.java_lang_String_IIl1(), this.IIlI.java_lang_String_IIl1(), this.IIll.java_lang_String_IIl1(), this.IIl1.java_lang_String_IIl1(), this.IIl_.java_lang_String_IIl1(), this.IIIl.java_lang_String_IIl1());
            }
            default: {
                break;
            }
            case 10021: {
                this.I01o = false;
                this.IIIO.Il_0 = false;
                this.IIIl.Il_0 = true;
                ((IO1_)this).IIIo = this.II;
                return;
            }
            case 10041: {
                return;
            }
            case 10042: {
                return;
            }
        }
    }

    static {
        int[] nArray = new int[]{0, 8, 2, 6, 9};
    }

    private static /* synthetic */ String Il0I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

