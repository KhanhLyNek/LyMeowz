package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IlO1 {
    public int I_1O;
    public int I_10;
    public int I_1o;
    public String II_1;
    public int I__;
    public int I__I;
    public String II__;
    public String II_O;
    public boolean Il0O;
    public int I1;
    public int I1I;
    private boolean Il00;
    private long IlIl;
    private IO1 II;
    private boolean Il0o;
    private long IlI1;
    private boolean Ilo;
    private long IlI_;
    private int I__l;
    private int I__1 = 0;
    private long IlIO = 0L;
    private long IlI0 = 300L;
    private int I___ = 0;
    private long IlIo = 0L;
    private static final long Ill = 200L;
    private boolean IloI = false;

    public IlO1(int n, int n2, int n3, int n4, int n5, boolean bl, int n6, int n7) {
        this.I_1O = n;
        this.I_10 = n2;
        this.I_1o = n3;
        this.I__ = n4;
        this.I__I = n5;
        this.Il0O = bl;
        this.I1 = n6;
        this.I1I = n7;
        this.Ilo = false;
        this.IlI_ = 0L;
        this.I__l = 0;
        this.II_1 = null;
        this.II__ = null;
        this.II_O = null;
        this.I___ = 0;
        this.IlIo = 0L;
        this.IloI = false;
    }

    public IlO1(int n, int n2, String string, String string2, String string3, boolean bl, int n3, int n4) {
        this.I_1O = n;
        this.I_10 = n2;
        this.I_1o = -1;
        this.I__ = -1;
        this.I__I = -1;
        this.II_1 = string;
        this.II__ = string2;
        this.II_O = string3;
        this.Il0O = bl;
        this.I1 = n3;
        this.I1I = n4;
        this.Ilo = false;
        this.IlI_ = 0L;
        this.I__l = 0;
        this.I___ = 0;
        this.IlIo = 0L;
        this.IloI = false;
    }

    public IlO1(int n, int n2, String string, boolean bl, int n3, int n4) {
        this(n, n2, string, null, null, bl, n3, n4);
    }

    public void I_ol() {
        if (!this.Il0O) {
            if (this.I_1o == -1 && this.I_10 == -1) {
                IO1 iO1 = this.II();
                if (iO1 != null) {
                    this.II(iO1);
                }
            } else {
                if (this.I_10 == -1 || this.I_1o == -1 && (this.II_1 == null || this.II_1.length() == 0)) {
                    return;
                }
                if (!this.Il0o) {
                    Il_1.II10(this.I_10);
                    this.Il0o = true;
                    this.IlI1 = System.currentTimeMillis();
                    this.IloI = false;
                    this.I___ = 0;
                } else {
                    if (System.currentTimeMillis() - this.IlI1 < 50L) {
                        return;
                    }
                    if (!this.IloI) {
                        I_0_.II().IIoI(this.I_10);
                        this.IloI = true;
                        this.IlIo = System.currentTimeMillis();
                        return;
                    }
                    if (System.currentTimeMillis() - this.IlIo < 200L) {
                        return;
                    }
                    if (this.II_1 != null && this.II_1.length() > 0) {
                        this.I_o1();
                    } else {
                        boolean bl = Ilol.Ilol_II().var_IOlI_II.II01 > 30;
                        int n = this.I_1o;
                        if (IOlO.l1oI == 19 && this.I_1O == 68 && Ilol.Ilol_II().var_IOlI_II.II01 == 23) {
                            n = 0;
                        }
                        if (IOlO.l1oI == 19 && this.I_1O == 109 && !bl) {
                            n = 1;
                        }
                        I_0_.II().II((short)this.I_10, (byte)n);
                        if (this.I__ != -1) {
                            I_0_.II().II((short)this.I_10, (byte)this.I__);
                            if (this.I__I != -1) {
                                I_0_.II().II((short)this.I_10, (byte)this.I__I);
                            }
                        }
                        this.Il0o = false;
                        this.IloI = false;
                    }
                }
            }
        } else if (this.I1 != -1 && this.I1I != -1) {
            Ilol.Ilol_II().var_I_ll_II = new I_ll(this.I1, this.I1I);
        }
    }

    private void I_o1() {
        long l = System.currentTimeMillis();
        if (l - this.IlIo >= 10000L) {
            I_0_.II().II((short)this.I_10, (byte)0);
            II.var_I_II_II.I0OO();
            Ilol.var_Ilo1_II = null;
            this.I_o_();
            return;
        }
        switch (this.I___) {
            case 0: {
                if (!this.III_(this.II_1)) break;
                ++this.I___;
                this.IlIo = l;
                if (this.II__ != null && this.II__.length() != 0) break;
                this.I_o_();
                break;
            }
            case 1: {
                if (this.II__ != null && this.II__.length() > 0) {
                    if (!this.III_(this.II__)) break;
                    ++this.I___;
                    this.IlIo = l;
                    if (this.II_O != null && this.II_O.length() != 0) break;
                    this.I_o_();
                    break;
                }
                this.I_o_();
                break;
            }
            case 2: {
                if (this.II_O != null && this.II_O.length() > 0) {
                    this.III_(this.II_O);
                }
                this.I_o_();
            }
        }
    }

    private boolean III_(String string) {
        if (string == null || string.length() == 0) {
            return false;
        }
        if (II.var_I_II_II == null || II.var_I_II_II.II0 == null) {
            return false;
        }
        String string2 = this.III1(this.III0(string)).trim();
        for (int i = 0; i < II.var_I_II_II.II0.size(); ++i) {
            try {
                String string3;
                I1Il i1Il = (I1Il)II.var_I_II_II.II0.elementAt(i);
                if (i1Il == null || i1Il.IIoO == null || !(string3 = this.III1(this.III0(i1Il.IIoO)).trim()).equals(string2) && string3.indexOf(string2) < 0) continue;
                I_0_.II().II((short)this.I_10, (byte)i);
                II.var_I_II_II.I0OO();
                Ilol.var_Ilo1_II = null;
                return true;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return false;
    }

    private String III1(String string) {
        if (string == null) {
            return "";
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            if (cArray[i] < 'A' || cArray[i] > 'Z') continue;
            cArray[i] = (char)(cArray[i] + 32);
        }
        return new String(cArray);
    }

    private String III0(String string) {
        if (string == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == '\r') continue;
            if (c == '\n') {
                stringBuffer.append(' ');
                continue;
            }
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    private void I_o_() {
        this.I___ = 0;
        this.IlIo = 0L;
        this.Il0o = false;
        this.IloI = false;
    }

    public IO1 II() {
        for (int i = 0; i < IOlO.IlI_.size(); ++i) {
            IO1 iO1 = (IO1)IOlO.IlI_.elementAt(i);
            if (!this.III_().equals(this.II(iO1.III))) continue;
            return iO1;
        }
        return null;
    }

    public String III_() {
        return IOlO.II11[this.I_1O];
    }

    public String II(I__O i__O) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < i__O.II_O.length; ++i) {
            stringBuffer.append(i__O.II_O[i]);
            stringBuffer.append(IlO1.IIO0("\u16d5", 5877));
        }
        return stringBuffer.toString().trim();
    }

    public void II(IO1 iO1) {
        if (!this.Il00) {
            this.Il00 = true;
            this.IlIl = System.currentTimeMillis();
            this.II = iO1;
            this.Ilo = false;
            this.IlI_ = 0L;
            this.I__l = 0;
            this.I__1 = 0;
            this.IlIO = 0L;
        } else {
            if (System.currentTimeMillis() - this.IlIl < 50L || this.Ilo && System.currentTimeMillis() - this.IlI_ < 50L) {
                return;
            }
            if (IOlO.l1oI == 166 && this.I_1O == 155) {
                IlO0.IOI_();
                this.I_oO();
                return;
            }
            int n = iO1.IIoI < 60 ? 15 : (iO1.II0o <= IOlO.l100 - 60 ? (iO1.II0o + iO1.IIoI) / 2 : IOlO.l100 - 15);
            short s = iO1.IIol;
            if (n == -1 || s == -1) {
                this.I_oO();
                return;
            }
            int n2 = Math.abs(Ilol.Ilol_II().I_o_ - n);
            int n3 = Math.abs(Ilol.Ilol_II().I_oO - s);
            boolean bl = iO1.IIoI >= 60 && iO1.II0o <= IOlO.l100 - 60;
            int n4 = n;
            short s2 = s;
            int n5 = bl ? n : n + (Ilol.Ilol_II().I_o_ < n ? -20 : 20);
            short s3 = s;
            int n6 = Ilol.Ilol_II().IOI1 = Ilol.Ilol_II().I_o_ < n ? 1 : -1;
            if (n2 > 30 || n3 > 30) {
                this.IIIO(n5, s3);
            } else if (!bl) {
                if (Ilol.Ilol_II().var_I_ll_II == null && System.currentTimeMillis() - this.IlIO >= this.IlI0) {
                    Ilol.Ilol_II().var_I_ll_II = new I_ll(n4 - (Ilol.Ilol_II().I_o_ < n ? -15 : 15), s2);
                    ++this.I__1;
                }
                if (this.I__1 >= 5 && Ilol.Ilol_II().var_I_ll_II == null) {
                    this.II(Ilol.Ilol_II().IOI1, true);
                    this.I__1 = 0;
                    this.IlIO = System.currentTimeMillis();
                }
                if (Ilol.Ilol_II().var_I_ll_II == null) {
                    this.IlIO = System.currentTimeMillis();
                }
            } else if (Ilol.Ilol_II().var_I_ll_II == null) {
                if (iO1.I00_) {
                    I_0_.II().IoO0();
                } else {
                    I_0_.II().Io_o();
                }
                this.I_oO();
            }
        }
    }

    private void II(int n, boolean bl) {
        if (bl) {
            if (!Ilol.Ilol_II().I10l) {
                switch (n) {
                    case 0: {
                        I1_I.I1_I_II().IIOO(0);
                        break;
                    }
                    case -1: {
                        Ilol.Ilol_II().IOI1 = -1;
                        I1_I.I1_I_II().IIOO(-4);
                        break;
                    }
                    case 1: {
                        Ilol.Ilol_II().IOI1 = 1;
                        I1_I.I1_I_II().IIOO(4);
                    }
                }
            }
            return;
        }
        switch (n) {
            case -1: {
                if (Ilol.Ilol_II().IOI1 == 1) {
                    Ilol.Ilol_II().IOI1 = -1;
                }
                if (!Ilol.Ilol_II().I10l) {
                    if (Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 != 0) {
                        I_0_.II().IoO();
                    }
                    Ilol.Ilol_II().IOIl = 2;
                    Ilol.Ilol_II().I_o0 = -Ilol.Ilol_II().IOIo;
                }
                Ilol.Ilol_II().I_IO = false;
                break;
            }
            case 1: {
                if (Ilol.Ilol_II().IOI1 == -1) {
                    Ilol.Ilol_II().IOI1 = 1;
                }
                if (!Ilol.Ilol_II().I10l) {
                    if (Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00 != 0) {
                        I_0_.II().IoO();
                    }
                    Ilol.Ilol_II().IOIl = 2;
                    Ilol.Ilol_II().I_o0 = Ilol.Ilol_II().IOIo;
                }
                Ilol.Ilol_II().I_IO = false;
            }
        }
    }

    private void IIIO(int n, int n2) {
        Il_0.III1(n, n2);
        this.Ilo = true;
        this.IlIl = this.IlI_ = System.currentTimeMillis();
        ++this.I__l;
    }

    private void I_oO() {
        this.Il00 = false;
        this.II = null;
        this.Ilo = false;
        this.IlI_ = 0L;
        this.I__l = 0;
        this.I___ = 0;
        this.IlIo = 0L;
        this.IloI = false;
    }

    private static /* synthetic */ String IIO0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

