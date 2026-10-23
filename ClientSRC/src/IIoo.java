/*
 * Decompiled with CFR 0.152.
 */
public final class IIoo {
    private static IIoo II;
    private static boolean II_I;

    public static IIoo II() {
        if (II == null) {
            II = new IIoo();
        }
        return II;
    }

    public static void IIl_() {
        boolean bl = II_I = I_O1.III(IIoo.II1_("\u44fe\u44dd\u44b5\u44af\u457d\u454b\u4529\u4519\u45e8\u45cf\u458e\u459a\u4666\u4656\u462d\u460d\u46e0\u46d1", 17555)) == 1;
        if (II_I && !II.II) {
            II.II = true;
        }
    }

    public static boolean II1l() {
        return II_I;
    }

    public static void IIIl(boolean bl) {
        if (II_I != bl) {
            II_I = bl;
            II.II = bl ? true : I_O1.III(IIoo.II1_("\u44ff\u44dd\u44a6\u44b7\u457d\u454f\u453d\u4504\u45e2\u45c9", 17555)) != 0;
            I_O1.IIIl(IIoo.II1_("\u44fe\u44dd\u44b5\u44af\u457d\u454b\u4529\u4519\u45e8\u45cf\u458e\u459a\u4666\u4656\u462d\u460d\u46e0\u46d1", 17555), bl ? 1 : 0);
        }
    }

    public static boolean II(Ilol ilol, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        if (ilol == null) {
            return true;
        }
        if (!ilol.I_ && !ilol.I_I) {
            if (ilol.IOl_ > 0 && !ilol.I100) {
                if (!(ilol.IIO1 == null || Il_o.III1(ilol.IIO1) || ilol.IIO1.equals(IIoo.II1_("\u44c7\u44c0\u5a1c\u449e\u4568\u450e\u4539\u458c\u45e2", 17555)) || ilol.IIO1.startsWith(IIoo.II1_("\u44b0", 17555)))) {
                    boolean bl;
                    iO1l.Illl(0xFFFF00);
                    int n = ilol.IO1_ + 5;
                    int n2 = ilol.IO1O + 5;
                    int n3 = ilol.I_o_ - n / 2;
                    int n4 = ilol.I_oO - n2;
                    iO1l.III1(n3 - 1, n4, n, n2);
                    boolean bl2 = ilol == Ilol.II();
                    boolean bl3 = Il_1.II(ilol);
                    boolean bl4 = bl = ilol == Ilol.II().IIIl;
                    if (bl2) {
                        if (ilol.IIl != 0 && ilol.IIl != -1) {
                            int n5 = IO1I.II1.IIII(ilol.IIO1);
                            int n6 = 12;
                            int n7 = IO1I.II1.IIII(IIoo.II1_("\u44c8\u44ef", 17555));
                            int n8 = n7 + n6 + n5 + 5;
                            int n9 = ilol.I_o_ - n8 / 2;
                            IO1I.II1.II(iO1l, IIoo.II1_("\u44c8", 17555), n9, ilol.I_oO - (ilol.IO1O + 20), 0);
                            int n10 = n9 + IO1I.II1.IIII(IIoo.II1_("\u44c8", 17555)) + 2;
                            int n11 = ilol.I_oO - (ilol.IO1O + 20);
                            I_oo.IIII(iO1l, ilol.IO0_, n10, n11, 0, 0);
                            int n12 = n10 + n6 + 2;
                            IO1I.II1.II(iO1l, IIoo.II1_("\u44ce", 17555), n12, ilol.I_oO - (ilol.IO1O + 20), 0);
                            int n13 = n12 + IO1I.II1.IIII(IIoo.II1_("\u44ce", 17555)) + 5;
                            IO1I.II1.II(iO1l, ilol.IIO1, n13, ilol.I_oO - (ilol.IO1O + 20), 0);
                        } else {
                            IO1I.II1.II(iO1l, ilol.IIO1, ilol.I_o_, ilol.I_oO - (ilol.IO1O + 20), 2);
                        }
                    } else if (bl3) {
                        if (ilol.IIl != 0 && ilol.IIl != -1) {
                            int n14 = IO1I.IIl0.IIII(ilol.IIO1);
                            int n15 = 12;
                            int n16 = IO1I.IIl0.IIII(IIoo.II1_("\u44c8\u44ef", 17555));
                            int n17 = n16 + n15 + n14 + 5;
                            int n18 = ilol.I_o_ - n17 / 2;
                            IO1I.IIl0.II(iO1l, IIoo.II1_("\u44c8", 17555), n18, ilol.I_oO - (ilol.IO1O + 20), 0);
                            int n19 = n18 + IO1I.IIl0.IIII(IIoo.II1_("\u44c8", 17555)) + 2;
                            int n20 = ilol.I_oO - (ilol.IO1O + 20);
                            I_oo.IIII(iO1l, ilol.IO0_, n19, n20, 0, 0);
                            int n21 = n19 + n15 + 2;
                            IO1I.IIl0.II(iO1l, IIoo.II1_("\u44ce", 17555), n21, ilol.I_oO - (ilol.IO1O + 20), 0);
                            int n22 = n21 + IO1I.IIl0.IIII(IIoo.II1_("\u44ce", 17555)) + 5;
                            IO1I.IIl0.II(iO1l, ilol.IIO1, n22, ilol.I_oO - (ilol.IO1O + 20), 0);
                        } else {
                            IO1I.IIl0.II(iO1l, ilol.IIO1, ilol.I_o_, ilol.I_oO - (ilol.IO1O + 20), 2);
                        }
                    } else if (bl) {
                        if (ilol.IIl != 0 && ilol.IIl != -1) {
                            int n23 = IO1I.IIl0.IIII(ilol.IIO1);
                            int n24 = 12;
                            int n25 = IO1I.IIl0.IIII(IIoo.II1_("\u44c8\u44ef", 17555));
                            int n26 = n25 + n24 + n23 + 5;
                            int n27 = ilol.I_o_ - n26 / 2;
                            IO1I.IIl0.II(iO1l, IIoo.II1_("\u44c8", 17555), n27, ilol.I_oO - (ilol.IO1O + 20), 0);
                            int n28 = n27 + IO1I.IIl0.IIII(IIoo.II1_("\u44c8", 17555)) + 2;
                            int n29 = ilol.I_oO - (ilol.IO1O + 20);
                            I_oo.IIII(iO1l, ilol.IO0_, n28, n29, 0, 0);
                            int n30 = n28 + n24 + 2;
                            IO1I.IIl0.II(iO1l, IIoo.II1_("\u44ce", 17555), n30, ilol.I_oO - (ilol.IO1O + 20), 0);
                            int n31 = n30 + IO1I.IIl0.IIII(IIoo.II1_("\u44ce", 17555)) + 5;
                            IO1I.IIl0.II(iO1l, ilol.IIO1, n31, ilol.I_oO - (ilol.IO1O + 20), 0);
                        } else {
                            IO1I.IIl0.II(iO1l, ilol.IIO1, ilol.I_o_, ilol.I_oO - (ilol.IO1O + 20), 2);
                        }
                    } else if (ilol.IIl != 0 && ilol.IIl != -1) {
                        int n32 = IO1I.IIl0.IIII(ilol.IIO1);
                        int n33 = 12;
                        int n34 = IO1I.IIl0.IIII(IIoo.II1_("\u44c8\u44ef", 17555));
                        int n35 = n34 + n33 + n32 + 5;
                        int n36 = ilol.I_o_ - n35 / 2;
                        IO1I.IIl0.II(iO1l, IIoo.II1_("\u44c8", 17555), n36, ilol.I_oO - (ilol.IO1O + 20), 0);
                        int n37 = n36 + IO1I.IIl0.IIII(IIoo.II1_("\u44c8", 17555)) + 2;
                        int n38 = ilol.I_oO - (ilol.IO1O + 20);
                        I_oo.IIII(iO1l, ilol.IO0_, n37, n38, 0, 0);
                        int n39 = n37 + n33 + 2;
                        IO1I.IIl0.II(iO1l, IIoo.II1_("\u44ce", 17555), n39, ilol.I_oO - (ilol.IO1O + 20), 0);
                        int n40 = n39 + IO1I.IIl0.IIII(IIoo.II1_("\u44ce", 17555)) + 5;
                        IO1I.IIl0.II(iO1l, ilol.IIO1, n40, ilol.I_oO - (ilol.IO1O + 20), 0);
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean II(I_11 i_11, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        if (i_11 == null) {
            return true;
        }
        if (i_11.IOIl == 15) {
            return true;
        }
        int n = i_11.IO11;
        if (Ilol.II().II == i_11 && Ilo1.III == null) {
            iO1l.II(I_I_.Il0, 0, 0, 9, 6, 0, i_11.I_o_, i_11.I_oO - n - 7, 33);
        }
        return true;
    }

    public static boolean II(I_I_ i_I_, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        if (i_I_.llIl > 0 && i_I_.status != 0 && i_I_.status != 1) {
            iO1l.Illl(0x808080);
            int n = i_I_.Iol * 2 / 3;
            int n2 = i_I_.IIl * 2 / 3;
            int n3 = i_I_.I1 - n / 2;
            int n4 = i_I_.I1I - i_I_.IIl + (i_I_.IIl - n2);
            iO1l.III1(n3 - 1, n4, n, n2);
            boolean bl = i_I_ == Ilol.II().IIII;
            String string = IIoo.II1_("\u44c6\u44dc\u44ba\u449e\u4560\u4559\u4523", 17555);
            if (I_I_.II != null && i_I_.I1ll >= 0 && i_I_.I1ll < I_I_.II.length && I_I_.II[i_I_.I1ll] != null && I_I_.II[i_I_.I1ll].II1o != null) {
                string = I_I_.II[i_I_.I1ll].II1o;
            }
            if (bl) {
                IO1I.II1I.II(iO1l, string, i_I_.I1, i_I_.I1I - i_I_.IIl - 5, 2);
            } else {
                IO1I.II1I.II(iO1l, string, i_I_.I1, i_I_.I1I - i_I_.IIl - 5, 2);
            }
            return true;
        }
        return true;
    }

    public static boolean II(I1o0 i1o0, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        if (i1o0 != null && i1o0.II0I != 0) {
            int n = I_oo.IIlo[i1o0.II0I][4];
            if (Ilol.II().II == i1o0) {
                iO1l.II(I_I_.Il0, 0, 0, 9, 6, 0, i1o0.I_o_, i1o0.I_oO - n - 1, 33);
                if (i1o0.Ill1 != null) {
                    IO1I.IIII.II(iO1l, i1o0.Ill1, i1o0.I_o_, i1o0.I_oO - n - 20, IO1I.l_I1, IO1I.IIlO);
                }
            } else if (i1o0.Ill1 != null) {
                IO1I.IIII.II(iO1l, i1o0.Ill1, i1o0.I_o_, i1o0.I_oO - n - 17, IO1I.l_I1, IO1I.IIlO);
            }
            return true;
        }
        return true;
    }

    public static boolean II(I10_ i10_, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        if (i10_ != null && i10_.II != null) {
            iO1l.II(IOlO.IIlI, i10_.I1 + 3, i10_.I1I, 33);
            String string = String.valueOf(i10_.II.II__);
            IO1I.IIII.II(iO1l, string, i10_.I1, i10_.I1I - 5, IO1I.l_I1, IO1I.IIlO);
            if (Ilol.II().II != null && Ilol.II().II == i10_) {
                iO1l.II(I_I_.Il0, 0, 24, 9, 6, 0, i10_.I1, i10_.I1I - 17, 3);
            }
            return true;
        }
        return true;
    }

    public static void IIIo(IO1l iO1l) {
        try {
            int n;
            int n2;
            int n3;
            int n4;
            if (Ilol.I10I) {
                return;
            }
            if (IOlO.IIO == null || IOlO.l10_ <= 0) {
                return;
            }
            iO1l.Illl(0);
            I1_I.III(iO1l, 1);
            int n5 = I1_I.II_0.size();
            for (n4 = 0; n4 < n5; ++n4) {
                ((I10_)I1_I.II_0.elementAt(n4)).III_(iO1l);
            }
            n4 = IOlO.IlI0;
            int n6 = IOlO.IIO.length;
            for (n3 = I1_I.Io_l; n3 < I1_I.Io__; ++n3) {
                for (n2 = I1_I.Io_1; n2 < I1_I.Io_O; ++n2) {
                    n = n2 * IOlO.l10_ + n3;
                    if (n < 0 || n >= n6 || IOlO.IIO[n] == 0 || (IOlO.IIIl(n3 * 24, (n2 + 1) * 24, 2) || IOlO.IIIl(n3 * 24, (n2 + 2) * 24, 2)) && !IOlO.IIIl(n3 * 24, n2 * 24, 2)) continue;
                    if (n3 > 0) {
                        iO1l.III1(n3 * n4, n2 * n4 + 8 - 12, 24, 24);
                        continue;
                    }
                    iO1l.III_(n3 * n4, n2 * 8 - 12, 24, 24);
                }
            }
            if (I1_I.Io1 < 24) {
                for (n3 = I1_I.Io_1; n3 < I1_I.Io_O; ++n3) {
                    n2 = n3 * IOlO.l10_ + 1;
                    if (n2 < 0 || n2 >= n6 || (n = IOlO.IIO[n2] - 1) == -1) continue;
                    IOlO.IIIl(iO1l, n, 0, n3);
                }
            }
            if (I1_I.Io1 > I1_I.Io_) {
                n3 = IOlO.l10_ - 2;
                for (n2 = I1_I.Io_1; n2 < I1_I.Io_O; ++n2) {
                    int n7;
                    n = n2 * IOlO.l10_ + n3;
                    if (n < 0 || n >= n6 || (n7 = IOlO.IIO[n] - 1) == -1) continue;
                    IOlO.IIIl(iO1l, n7, n3 + 1, n2);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static boolean II(I1_I i1_I, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        String string = Il_o.III(Ilol.II().IOl_);
        IO1I.IIII.II(iO1l, string, 10, 5, 0, IO1I.III_);
        String string2 = Il_o.III(Ilol.II().IOl1);
        IO1I.IIII.II(iO1l, string2, 10, 18, 0, IO1I.III_);
        return true;
    }

    public static boolean III(I1_I i1_I, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        int n = Ilol.II().II.I1 + I1_I.Io1;
        int n2 = Ilol.II().II.I1I + I1_I.Io1I;
        int n3 = 20;
        iO1l.Illl(16753920);
        iO1l.III1(n - n3 / 2, n2 - n3 / 2, n3, n3);
        return true;
    }

    public static boolean IIII(I1_I i1_I, IO1l iO1l) {
        if (!II_I) {
            return false;
        }
        int n = I1_I.lIIO + 17;
        int n2 = I1_I.lII0 + 17;
        int n3 = 30;
        iO1l.Illl(16753920);
        iO1l.III1(n - n3 / 2, n2 - n3 / 2, n3, n3);
        return true;
    }

    public static boolean II(IO1l iO1l, int n, int n2, boolean bl) {
        return II_I;
    }

    public void II(IO1l iO1l, I101 i101, int n, int n2) {
        if (this.IIII(i101)) {
            String string = this.II(i101);
            IO1I.IIlo.II(iO1l, string, n - IO1I.IIlo.IIII(string), n2, 0);
        }
    }

    public String II(I101 i101) {
        if (i101 != null && this.IIII(i101) && i101.II.II0l != 5 && (i101.II.II0l <= 5 || i101.II.II0l == 32)) {
            I100[] i100Array = i101.III;
            String string = "";
            boolean bl = true;
            for (int i = 0; i < i100Array.length; ++i) {
                I100 i100 = i100Array[i];
                int n = i100.II.I1l;
                int n2 = i100.lIoI;
                String string2 = "";
                switch (n) {
                    case 50: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44e1\u45c1", 17555);
                        break;
                    }
                    case 77: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44fa\u4481", 17555);
                        break;
                    }
                    case 80: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44fa\u4481\u44df\u453c\u451e\u453e", 17555);
                        break;
                    }
                    case 81: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44f9\u4498\u44df\u453c\u451e\u453e", 17555);
                        break;
                    }
                    case 94: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44f3\u4495", 17555);
                        break;
                    }
                    case 95: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44fa\u449c", 17555);
                        break;
                    }
                    case 96: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44fa\u449a", 17555);
                        break;
                    }
                    case 97: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44e2\u4482\u44a4", 17555);
                        break;
                    }
                    case 100: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44f1\u449e\u44b9\u4541", 17555);
                        break;
                    }
                    case 101: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44f7\u4489\u44a0", 17555);
                        break;
                    }
                    case 103: {
                        string2 = n2 + IIoo.II1_("\u44b6\u44f9\u4498", 17555);
                    }
                }
                if (string2.equals("")) continue;
                if (!bl) {
                    string = string + IIoo.II1_("\u44bf\u4492", 17555);
                }
                string = string + string2;
                bl = false;
            }
            return string;
        }
        return "";
    }

    private boolean IIII(I101 i101) {
        if (i101 == null) {
            return false;
        }
        if (i101.III == null) {
            return false;
        }
        I100[] i100Array = i101.III;
        block5: for (int i = 0; i < i100Array.length; ++i) {
            switch (i100Array[i].II.I1l) {
                case 50: 
                case 77: {
                    return true;
                }
                default: {
                    continue block5;
                }
                case 78: 
                case 79: 
                case 80: 
                case 81: {
                    return true;
                }
                case 94: 
                case 95: 
                case 96: 
                case 97: 
                case 100: 
                case 101: 
                case 103: 
                case 104: 
            }
            return true;
        }
        return false;
    }

    public static String III(I101 i101) {
        String string = IIoo.II1_("\u44c8", 17555) + i101.II.II__ + IIoo.II1_("\u44ce\u4492", 17555) + i101.II.II1o + IIoo.II1_("\u44b3", 17555);
        return string;
    }

    private static /* synthetic */ String II1_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

