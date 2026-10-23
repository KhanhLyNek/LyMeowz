/*
 * Decompiled with CFR 0.152.
 */
public class Il_1 {
    public static void IIIl(int n) {
        try {
            I101[] i101Array = Ilol.II().II;
            for (int i = 0; i < i101Array.length; ++i) {
                I101 i101 = i101Array[i];
                if (i101 == null || i101.II.II__ != n) continue;
                I_0_.II().II((byte)0, (byte)1, (byte)i101.lIO_, (short)-1);
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void II1O(int n) {
        try {
            if (I1_I.II_0 == null) {
                return;
            }
            for (int i = I1_I.II_0.size() - 1; i >= 0; --i) {
                I10_ i10_ = (I10_)I1_I.II_0.elementAt(i);
                if (i10_ == null || i10_.II == null || i10_.II.II__ != n) continue;
                Il_0.III1(i10_.I1, i10_.I1I);
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static boolean II(IOl1 iOl1) {
        if (iOl1.I0OO) {
            if (iOl1.IoI_ == 0) {
                I1I1.I___ = false;
                Ilol.I1Oo = true;
                IOl1.IlI1.removeElement(iOl1);
            } else {
                if (Ilol.II().I11) {
                    Ilol.II().I_oO = iOl1.I1I = iOl1.l101;
                }
                Ilol.II().I11 = false;
            }
        } else {
            Ilol ilol = I1_I.II(iOl1.I1l);
            if (ilol != null) {
                if (iOl1.IoI_ == 0) {
                    if (iOl1.I0Oo) {
                        iOl1.I1I = iOl1.l101;
                    }
                } else {
                    if (ilol.I11) {
                        ilol.I_oO = iOl1.I1I = iOl1.l101;
                    }
                    ilol.I11 = false;
                }
            }
        }
        IOl1.IlI1.removeElement(iOl1);
        return true;
    }

    public static byte II(short[] sArray) {
        Ilol ilol = Ilol.II();
        byte by = ilol.II.length;
        for (byte by2 = 0; by2 < by; by2 = (byte)((byte)(by2 + 1))) {
            I101 i101 = ilol.II[by2];
            if (i101 == null) continue;
            for (int i = 0; i < sArray.length; ++i) {
                if (i101.II.II__ != sArray[i]) continue;
                return by2;
            }
        }
        return -1;
    }

    public static boolean IIll(int n) {
        I101[] i101Array = Ilol.II().II;
        for (int i = 0; i < i101Array.length; ++i) {
            I101 i101 = i101Array[i];
            if (i101 == null || i101.II.II__ != n) continue;
            return true;
        }
        return false;
    }

    public static boolean IIlI() {
        I101[] i101Array = Ilol.II().II;
        for (int i = 0; i < i101Array.length; ++i) {
            if (i101Array[i] != null) continue;
            return false;
        }
        return true;
    }

    public static boolean II10() {
        I101[] i101Array = Ilol.II().III;
        for (int i = 0; i < i101Array.length; ++i) {
            if (i101Array[i] != null) continue;
            return false;
        }
        return true;
    }

    public static boolean II(Ilol ilol) {
        if (ilol != null && !Il_o.III1(ilol.IIO1)) {
            if (!ilol.I_ && !ilol.I_I) {
                String string = ilol.IIO1;
                if (!(string.equals(Il_1.IIOl("\uc567\uc520\udbbc\uc5fe\uc5c8\uc5ee\uc599\uc6ec\uc642", 50483)) || string.startsWith(Il_1.IIOl("\uc510", 50483)) || string.startsWith(Il_1.IIOl("\uc517", 50483)))) {
                    char c = string.charAt(0);
                    return Character.isUpperCase(c);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean II1o() {
        return IOlO.l1oI >= 85 && IOlO.l1oI <= 91;
    }

    public static void II(I1_O i1_O) {
        I1_I.II().IIII(i1_O);
    }

    public static void I_0o() {
        I1I1.IIII((byte)0);
        I_0_.II().Io0();
        Ilol.I10I = false;
    }

    public static void II10(int n) {
        try {
            for (int i = 0; i < I1_I.IIOI.size(); ++i) {
                I_11 i_11 = (I_11)I1_I.IIOI.elementAt(i);
                if (i_11.II.lll0 != n) continue;
                Ilol.II().II = i_11;
                Il_0.III1(i_11.I_o_, i_11.I_oO - 3);
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static int III(String string, int n) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n;
        }
    }

    private static /* synthetic */ String IIOl(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

