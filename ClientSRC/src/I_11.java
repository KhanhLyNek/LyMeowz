/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I_11
extends Ilol {
    public I_1_ II;
    public static I_1_[] II;
    public boolean IOIo;
    private int lllO;
    private int I_O0;
    public static boolean IOl;
    private static int I_Oo;
    public int[] I111;
    private int I_0;
    private long IlO;
    private long I1II;
    public int lIo0;

    public I_11(int n, int n2, int n3, int n4, int n5, int n6) {
        this.I1__ = true;
        this.IO_l = n6;
        I_Ol.II__(I_11.IlOl("\u80d3\u80ac\u8098\u813a\u8158\u812e\u8116\u81e2\u81d4\u81a6\u81ce\u8232", 32957) + this.IO_l);
        this.I_o_ = n3;
        this.I_oO = n4;
        this.I010 = n3;
        this.I01o = n4;
        this.IOIl = n2;
        if (n != -1) {
            this.II = II[n5];
        }
        if (n5 == 23 || n5 == 42) {
            this.IO11 = 45;
        }
        if (n5 == 51) {
            this.I1__ = false;
            this.lllO = n2;
            I_Ol.II__(I_11.IlOl("\u80d9\u80a9\u809a\u8152\u8158\u812d\u8157\u81ab\u8195", 32957) + n2);
        }
        if (this.II != null) {
            if (this.II.II1o == null) {
                this.II.II1o = "";
            }
            this.II.II1o = I_Ol.IIIo(this.II.II1o);
        }
    }

    public void II(byte by, int n) {
        this.lllO = by;
        this.IlO = this.I1II = System.currentTimeMillis();
        this.I_0 = n;
        I_Ol.II__(I_11.IlOl("\u80d4\u80b2\u80db\u8168\u8158\u8178\u8104\u81f3\u81d6\u81bb\u819d\u8276\u820c\u8270", 32957) + this.I_0);
    }

    public static void I00O() {
        for (int i = 0; i < I1_I.IIOI.size(); ++i) {
            I_11 i_11 = (I_11)I1_I.IIOI.elementAt(i);
            ((I_11)I1_I.IIOI.elementAt(i)).III = null;
            i_11.I0IO = -1;
        }
    }

    @Override
    public void IIl1() {
        block10: {
            block13: {
                block11: {
                    block12: {
                        if (this.II.lll0 == 51) {
                            this.I1II = System.currentTimeMillis();
                            if (this.I1II - this.IlO >= 1000L) {
                                --this.I_0;
                                this.IlO = this.I1II;
                                if (this.I_0 < 0) {
                                    this.I_0 = 0;
                                }
                            }
                        }
                        if (this.I1__) {
                            this.IOol();
                        }
                        if (this.III != null) break block10;
                        byte[] byArray = new byte[]{-1, 9, 9, 10, 10, 11, 11};
                        if (Ilol.II().IOI0 < 9 || Ilol.II().IOI0 > 10 || Ilol.II().II.II0I <= 0 || byArray[Ilol.II().II.II0I] != this.II.lll0) break block11;
                        if (Ilol.II().II != null) break block12;
                        this.III = I1_I.II[57];
                        break block13;
                    }
                    if (Ilol.II().II == null || Ilol.II().II.l10l + 1 != Ilol.II().II.IIO1.length) break block10;
                    this.III = I1_I.II[62];
                    break block13;
                }
                I1_I.II();
                byte by = I1_I.IIII();
                if (Ilol.II().II == null && by == this.II.lll0) break block13;
                if (Ilol.II().II == null || by != this.II.lll0) break block10;
                int n = Ilol.II().II.l10l + 1;
                int n2 = Ilol.II().II.IIO1.length;
                this.III = I1_I.II[98];
            }
            this.I0IO = 0;
        }
        super.IIl1();
        if (IOlO.l1oI == 51) {
            this.IOI1 = this.I_o_ > Ilol.II().I_o_ ? -1 : 1;
            if (this.II.lll0 % 2 == 0) {
                if (this.IO10 == 1) {
                    this.IO10 = 0;
                    return;
                }
                this.IO10 = 1;
            }
        }
    }

    @Override
    public void II(IO1l iO1l) {
        if (!IIoo.II(this, iO1l) && !Ilol.I10I && !this.IOIo && this.II0l() && this.IOIl != 15) {
            if (this.III0 != 0) {
                super.II(iO1l);
            } else if (this.II != null) {
                if (this.II.lll0 != 4 && this.II.lll0 != 51 && this.II.lll0 != 50) {
                    iO1l.II(IOlO.IIlI, this.I_o_, this.I_oO, 3);
                }
                if (this.II.lll0 == 3) {
                    I_oo.IIII(iO1l, 265, this.I_o_, this.I_oO, 0, 33);
                    if (Ilol.II().II != null && Ilol.II().II.equals(this) && Ilo1.III == null) {
                        iO1l.II(I_I_.Il0, 0, 0, 9, 6, 0, this.I_o_, this.I_oO - this.IO11 + 4, 33);
                    }
                    this.I_O0 = 60;
                } else if (this.II.lll0 != 4) {
                    if (this.II.lll0 != 50 && this.II.lll0 != 51) {
                        if (this.II.lll0 == 6) {
                            I_oo.IIII(iO1l, 545, this.I_o_, this.I_oO + 5, 0, 33);
                            if (Ilol.II().II != null && Ilol.II().II.equals(this) && Ilo1.III == null) {
                                iO1l.II(I_I_.Il0, 0, 0, 9, 6, 0, this.I_o_, this.I_oO - this.IO11 - 9, 33);
                            }
                            IO1I.IIII.II(iO1l, String.valueOf(IOlO.l1ol), this.I_o_, this.I_oO - this.IO11 + 19 - IO1I.IIlI.IIOl(), 2);
                        } else {
                            int n = this.II.lllo;
                            int n2 = this.II.ll1I;
                            int n3 = this.II.ll1;
                            I_O1 i_O1 = I1_I.II[n];
                            I_O1 i_O12 = I1_I.II[n2];
                            I_O1 i_O13 = I1_I.II[n3];
                            if (this.IOI1 == 1) {
                                I_oo.IIII(iO1l, i_O1.II[Ilol.II[this.IO10][0][0]].II1o, this.I_o_ + Ilol.II[this.IO10][0][1] + i_O1.II[Ilol.II[this.IO10][0][0]].IIO_, this.I_oO - Ilol.II[this.IO10][0][2] + i_O1.II[Ilol.II[this.IO10][0][0]].II1O, 0, 0);
                                I_oo.IIII(iO1l, i_O12.II[Ilol.II[this.IO10][1][0]].II1o, this.I_o_ + Ilol.II[this.IO10][1][1] + i_O12.II[Ilol.II[this.IO10][1][0]].IIO_, this.I_oO - Ilol.II[this.IO10][1][2] + i_O12.II[Ilol.II[this.IO10][1][0]].II1O, 0, 0);
                                I_oo.IIII(iO1l, i_O13.II[Ilol.II[this.IO10][2][0]].II1o, this.I_o_ + Ilol.II[this.IO10][2][1] + i_O13.II[Ilol.II[this.IO10][2][0]].IIO_, this.I_oO - Ilol.II[this.IO10][2][2] + i_O13.II[Ilol.II[this.IO10][2][0]].II1O, 0, 0);
                            } else {
                                I_oo.IIII(iO1l, i_O1.II[Ilol.II[this.IO10][0][0]].II1o, this.I_o_ - Ilol.II[this.IO10][0][1] - i_O1.II[Ilol.II[this.IO10][0][0]].IIO_, this.I_oO - Ilol.II[this.IO10][0][2] + i_O1.II[Ilol.II[this.IO10][0][0]].II1O, 2, 24);
                                I_oo.IIII(iO1l, i_O12.II[Ilol.II[this.IO10][1][0]].II1o, this.I_o_ - Ilol.II[this.IO10][1][1] - i_O12.II[Ilol.II[this.IO10][1][0]].IIO_, this.I_oO - Ilol.II[this.IO10][1][2] + i_O12.II[Ilol.II[this.IO10][1][0]].II1O, 2, 24);
                                I_oo.IIII(iO1l, i_O13.II[Ilol.II[this.IO10][2][0]].II1o, this.I_o_ - Ilol.II[this.IO10][2][1] - i_O13.II[Ilol.II[this.IO10][2][0]].IIO_, this.I_oO - Ilol.II[this.IO10][2][2] + i_O13.II[Ilol.II[this.IO10][2][0]].II1O, 2, 24);
                            }
                            if (IOlO.l1oI != 51) {
                                int n4 = 15;
                                if (this.II.lll0 == 47) {
                                    n4 = 47;
                                }
                                if (Ilol.II().II != null && Ilol.II().II.equals(this) && Ilo1.III == null) {
                                    int n5 = 0;
                                    int n6 = 0;
                                    if (Ilol.II().II.II.lll0 == 28 || Ilol.II().II.II.lll0 == 41) {
                                        n5 = 3;
                                        n6 = -12;
                                    }
                                    iO1l.II(I_I_.Il0, 0, 0, 9, 6, 0, this.I_o_ + n5, this.I_oO - this.IO11 - (n4 - 8) + n6, 33);
                                }
                            }
                            this.I_O0 = 65;
                        }
                    } else if (this.I111 != null) {
                        if (this.II.lll0 == 50 && IOl) {
                            ++I_Oo;
                            if (II.IIIO % 3 == 0) {
                                I1lI.III(new I1ll(19, this.I_o_ + I_Ol.III_(-50, 50), this.I_oO, 2, 1, -1));
                            }
                            if (II.IIIO % 15 == 0) {
                                I1lI.III(new I1ll(18, this.I_o_ + I_Ol.III_(-5, 5), this.I_oO + I_Ol.III_(-90, 0), 2, 1, -1));
                            }
                            if (I_Oo == 100) {
                                I1_I.II().IIl(this.I_o_, this.I_oO);
                            }
                            if (I_Oo == 110) {
                                IOl = false;
                                this.II.lll0 = 4;
                            }
                        }
                        int n = 0;
                        if (I_oo.II[this.I111[this.lllO]] != null && I_oo.II[this.I111[this.lllO]].I1I1 != null) {
                            n = IO1l.III(I_oo.II[this.I111[this.lllO]].I1I1);
                        }
                        I_oo.IIII(iO1l, this.I111[this.lllO], this.I_o_ + I_Ol.III_(-1, 1), this.I_oO, 0, 33);
                        if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                            if (Ilo1.III == null) {
                                iO1l.II(I_I_.Il0, 0, 0, 9, 6, 0, this.I_o_, this.I_oO - this.IO11 - 9 + 16 - n, 33);
                            }
                            IO1I.IIII.II(iO1l, I_1l.III_(this.I_0), this.I_o_, this.I_oO - this.IO11 - 16 - IO1I.IIlI.IIOl() - 20 - n + 16, 2, IO1I.III_);
                        } else {
                            IO1I.IIII.II(iO1l, I_1l.III_(this.I_0), this.I_o_, this.I_oO - this.IO11 - 8 - IO1I.IIlI.IIOl() - 20 - n + 16, 2, IO1I.III_);
                        }
                    }
                }
                if (this.I0IO >= 0 && this.III != null && this.III0 == 0) {
                    I_oo.IIII(iO1l, this.III.II[this.I0IO].I_Oo, this.I_o_ + this.III.II[this.I0IO].II0I, this.I_oO + this.III.II[this.I0IO].I_O0 - this.I_O0, 0, 3);
                    if (II.IIIO % 2 == 0) {
                        ++this.I0IO;
                        if (this.I0IO >= this.III.II.length) {
                            this.I0IO = 0;
                        }
                    }
                }
            }
        }
    }

    public void IIII(IO1l iO1l) {
        if (!Ilol.I10I && !this.IOIo && this.II0l() && this.IOIl != 15 && this.II != null) {
            if (this.II.lll0 == 3) {
                if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                    IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_, this.I_oO - this.IO11 - IO1I.IIlI.IIOl() - 5, 2, IO1I.IIlO);
                } else {
                    IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_, this.I_oO - this.IO11 - 3 - IO1I.IIlI.IIOl(), 2, IO1I.IIlO);
                }
                this.I_O0 = 60;
            } else if (this.II.lll0 != 4) {
                if (this.II.lll0 != 50 && this.II.lll0 != 51) {
                    if (this.II.lll0 == 6) {
                        if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                            IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_, this.I_oO - this.IO11 - IO1I.IIlI.IIOl() - 16, 2, IO1I.IIlO);
                            return;
                        }
                        IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_, this.I_oO - this.IO11 - 8 - IO1I.IIlI.IIOl(), 2, IO1I.IIlO);
                        return;
                    }
                    if (IOlO.l1oI != 51) {
                        int n = 15;
                        if (this.II.lll0 == 47) {
                            n = 47;
                        }
                        if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                            if (IOlO.l1oI != 113) {
                                int n2 = 0;
                                int n3 = 0;
                                if (Ilol.II().II.II.lll0 == 28 || Ilol.II().II.II.lll0 == 41) {
                                    n2 = 3;
                                    n3 = -12;
                                }
                                IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_ + n2, this.I_oO - this.IO11 - IO1I.IIlI.IIOl() - n + n3, 2, IO1I.IIlO);
                            }
                        } else {
                            n = 8;
                            if (this.II.lll0 == 47) {
                                n = 40;
                            }
                            if (IOlO.l1oI != 113) {
                                int n4 = 0;
                                int n5 = 0;
                                if (this.II.lll0 == 28 || this.II.lll0 == 41) {
                                    n4 = 3;
                                    n5 = -12;
                                }
                                IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_ + n4, this.I_oO - this.IO11 - n - IO1I.IIlI.IIOl() + n5, 2, IO1I.IIlO);
                            }
                        }
                    }
                    this.I_O0 = 65;
                } else if (this.I111 != null) {
                    int n = 0;
                    if (I_oo.II[this.I111[this.lllO]] != null && I_oo.II[this.I111[this.lllO]].I1I1 != null) {
                        n = IO1l.III(I_oo.II[this.I111[this.lllO]].I1I1);
                    }
                    if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                        IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_, this.I_oO - this.IO11 - IO1I.IIlI.IIOl() - n, 2, IO1I.IIlO);
                        return;
                    }
                    IO1I.IIl_.II(iO1l, this.II.II1o, this.I_o_, this.I_oO - this.IO11 - 8 - IO1I.IIlI.IIOl() - n + 16, 2, IO1I.IIlO);
                    return;
                }
            }
        }
    }

    @Override
    public void I__o() {
        this.IOIl = 15;
        Ilol.II = null;
    }

    static {
        int[] nArray = new int[]{1, -1, 1, -1};
        nArray = new int[]{1, -1, -1, 1};
    }

    private static /* synthetic */ String IlOl(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

