package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IIo
extends IIII {
    private static IIo var_IIo_II;
    public static boolean IIO_;
    private static boolean Il11;
    public static boolean IlII;
    public static boolean Il1_;
    public static boolean Il1O;
    private static boolean Il10;
    private static boolean Il1o;
    private static boolean Il_;
    private static long II1o;
    private static long II0l;
    private static long II01;
    private static long II0_;
    private static long IIIo;
    private static long II0O;
    private static long II00;
    private static int IlO0;
    private static int IlOo;
    private static int Il0;
    private static int Il0I;
    private static int Il0l;
    private static int Il01;
    private static I_I_ var_I_I__II;
    private static long IIOO;
    private static int IlO_;
    private static long IIO0;
    private static Il_l.II III1;
    private static long IIOo;
    private static int IlOO;
    private static final int[] II1I;
    private IlI0 var_IlI0_II = new IlI0();

    private IIo() {
    }

    public static IIo IIo_II() {
        if (var_IIo_II == null) {
            var_IIo_II = new IIo();
        }
        return var_IIo_II;
    }

    public static IIo III() {
        return IIo.IIo_II();
    }

    @Override
    protected void II1l() {
        this.void_IIlo();
    }

    @Override
    protected void II11() {
        this.var_IlI0_II.I_1O();
    }

    @Override
    protected void II1O() {
        IIo.I1l();
    }

    @Override
    protected void II10() {
        this.var_IlI0_II.I_1O();
    }

    private static void III(long l) {
        II00 = IlOl.IIII() + l;
    }

    @Override
    protected void II1_() {
        if (IIO_) {
            try {
                long l = IlOl.IIII();
                if (l < II00) {
                    return;
                }
                this.var_IlI0_II.IIlO();
                Il_I.III().IIlO();
                if (II.var_int_IIIO % 100 == 0) {
                    IIo.Ilo_();
                }
                if (Il01 > 0) {
                    return;
                }
                if (Ilol.Ilol_II().var_IOlI_II.II01 > 10) {
                    I1_I.var_I1Oo_II.IIII(IIo.IIlo("\u8e47\u8e41\u8ead\u8e02\u8eab\u8ede\u8ea1\u8e08\u8f69\u8f4e\u8f64", 36367), 0);
                    IIO_ = false;
                    return;
                }
                if (IIo.boolean_IIlo()) {
                    return;
                }
                IIo.I1lI();
                IIo.I1ll();
                IIo.I1l1();
                IIo.I1l_();
                if ((Ilol.Ilol_II().I_I_ || Ilol.Ilol_II().IOl_ <= 0) && II.var_int_IIIO % 100 == 0) {
                    I_0_.II().IoOl();
                }
                if (IOlO.l1oI == Ilol.Ilol_II().IOIO + 21) {
                    IIo.I1lO();
                }
                if (!Il1_ && !IlII && IIo.boolean_II(500L) && Ilol.Ilol_II().IOl_ > 1 && !Il_1.IIlI() && Ilol.Ilol_II().var_IOlI_II.II01 <= 11) {
                    IIo.I11_();
                }
                if (Ilol.Ilol_II().var_IOlI_II.II01 > 3 && Ilol.Ilol_II().var_IOlI_II.II01 <= 11) {
                    IIo.I1lo();
                }
                if (!IlO_.II_O() && !Il1_ && Ilol.Ilol_II().IOl_ > 1 && !Il_1.IIlI() && Ilol.Ilol_II().var_IOlI_II.II01 <= 11 && IIo.boolean_IIlO()) {
                    if (IIo.boolean_IIl0() && !IIo.boolean_II1()) {
                        IIo.I11();
                    }
                    if (Il1o) {
                        IIo.I_I();
                    } else if (Il_) {
                        IIo.I_II();
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static boolean boolean_II(long l) {
        return IlOl.II(IIIo, l);
    }

    private static boolean boolean_IIlO() {
        if (Ilol.Ilol_II().var_IOlI_II.II01 != 10) {
            return true;
        }
        return I1_I.Io_0 >= 7 || IIo.boolean_IIl0();
    }

    private static void I1Io() {
        IIIo = IlOl.IIII();
    }

    private static void III0(int n) {
        if (IIo.boolean_II(1000L)) {
            IIo.IIIo(n);
            IIo.III(500L);
            I_0_.II().IIoI(n);
            IIo.I1Io();
        }
    }

    private static void IIIo(int n) {
        try {
            int n2;
            I_11 i_11 = IIo.II(n);
            if (i_11 != null && (n2 = I_Ol.II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, i_11.I_o_, i_11.I_oO)) > 50) {
                Il_0.III1(i_11.I_o_, i_11.I_oO - 3);
                IIo.III(200L);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static I_11 II(int n) {
        for (int i = 0; i < I1_I.var_I_lO_IIOI.size(); ++i) {
            I_11 i_11 = (I_11)I1_I.var_I_lO_IIOI.elementAt(i);
            if (i_11.var_I_1__II.lll0 != n) continue;
            return i_11;
        }
        return null;
    }

    private static void I1l() {
        IlII = false;
        Il1_ = false;
        var_I_I__II = null;
        IlO_ = -1;
        IIOO = 0L;
        IIO0 = -1L;
        IIIo = 0L;
        II0O = 0L;
        Il1o = false;
        Il_ = false;
        Il10 = true;
        II00 = 0L;
    }

    public static boolean boolean_IIl0() {
        return Il11;
    }

    public static void III(boolean bl) {
        if (bl != Il11) {
            Il11 = bl;
        }
    }

    private static void I1lI() {
        if (!(Ilol.Ilol_II().I_I_ && Ilol.Ilol_II().IOl_ <= 0 || II.var_int_IIIO % 200 != 0)) {
            IIo.IIIl(396);
            Il_0.I_oI();
            IIo.I1l0();
        }
    }

    private static void I1ll() {
        int n = I1_I.var_I_lO_IIO.size();
        for (int i = 0; i < n; ++i) {
            I_I_ i_I_ = (I_I_)I1_I.var_I_lO_IIO.elementAt(i);
            i_I_.IOoo = true;
        }
    }

    private static void I1l1() {
        boolean bl;
        boolean bl2 = bl = I1_I.Io_0 <= 0 && (Ilol.Ilol_II().IOl1 < 15 || Ilol.Ilol_II().IOl_ < 15);
        if (bl) {
            if (!Il1_) {
                Il1_ = true;
            }
            IIo.III(false);
            Il1o = false;
            Il_ = false;
            if (IOlO.l1oI != Ilol.Ilol_II().IOIO + 21 && !IlO_.II_O()) {
                IlO_.II_l(Ilol.Ilol_II().IOIO + 21);
            }
        } else if (Il1_ && I1_I.Io_0 > 0) {
            Il1_ = false;
        }
    }

    private static void I1l_() {
        boolean bl;
        boolean bl2 = bl = !(Ilol.Ilol_II().IOl1 >= IlO0 && Ilol.Ilol_II().IOl_ >= IlOo || Il1_ || IOlO.l1oI == Ilol.Ilol_II().IOIO + 21 && Ilol.Ilol_II().var_IOlI_II.II01 >= 3 || !IlOl.II(II0l, 2000L) || Il0l > 0 && I1_I.Io_0 < Il0l);
        if (bl) {
            II0l = IlOl.IIII();
            I1_I.I1_I_II().I0_();
        }
    }

    private static void I1lO() {
        if (!Il1_ && Il0l > 0 && I1_I.Io_0 < Il0l) {
            Il1_ = true;
        }
        if (I1_I.var_I_lO_II_0.size() > 0) {
            I10_ i10_ = (I10_)I1_I.var_I_lO_II_0.elementAt(0);
            if (IlOl.II(II1o, 550L)) {
                II1o = IlOl.IIII();
                I_0_.II().IIo1(i10_.lI0l);
            }
        }
        if (Il0l <= 0) {
            if (I1_I.I1_I_II().var_I1o0_II.lIoo == 0 || Ilol.Ilol_II().IOIO == 1 && I1_I.Io_0 >= 30 || Ilol.Ilol_II().IOIO != 1 && I1_I.Io_0 >= 20) {
                Il1_ = false;
            }
        } else if (I1_I.Io_0 >= Il0l) {
            Il1_ = false;
        }
        if (Ilol.Ilol_II().var_IOlI_II.II01 >= 2 && I1_I.I1_I_II().var_I1o0_II.lIoo > 0 && (Ilol.Ilol_II().IOIO == 1 && I1_I.Io_0 < 30 || Ilol.Ilol_II().IOIO != 1 && I1_I.Io_0 < 20) && !I1_I.I1_I_II().var_I1o0_II.IO0 && II.var_int_IIIO % 30 == 0) {
            I_0_.II().IIoI(4);
            IIo.III(100L);
            I_0_.II().II((short)4, (byte)0);
            IIo.III(1000L);
        }
        if (Ilol.Ilol_II().Il11 >= 5000L && I1_I.I1_I_II().var_I1o0_II.ll == 5 && I1_I.I1_I_II().var_I1o0_II != null && !I1_I.I1_I_II().var_I1o0_II.IO0) {
            I_0_.II().IIoI(4);
            IIo.III(100L);
            I_0_.II().II((short)4, (byte)1);
            IIo.III(100L);
            I_0_.II().II((short)5, (byte)0);
            Il1_ = false;
            IIo.III(20000L);
        }
        if (II.var_I_II_II.IOol) {
            II.var_I_II_II.I0OO();
        }
    }

    private static void IIIl(int n) {
        if (IIo.boolean_II(500L)) {
            for (int i = Ilol.Ilol_II().var_I101_arr_II.length - 1; i >= 0; --i) {
                I101 i101 = Ilol.Ilol_II().var_I101_arr_II[i];
                if (i101 == null || i101.var_I1o_II.II__ != n || II.var_int_IIIO % 60 != 0) continue;
                I_0_.II().II((byte)0, (byte)1, (byte)i101.lIO_, (short)-1);
                IIo.I1Io();
                break;
            }
        }
    }

    private static void I1l0() {
        if (System.currentTimeMillis() - II0_ >= 2000L) {
            try {
                for (int i = Ilol.Ilol_II().var_I101_arr_II.length - 1; i >= 0; --i) {
                    I101 i101 = Ilol.Ilol_II().var_I101_arr_II[i];
                    if (i101 == null) continue;
                    for (int j = 0; j < II1I.length; ++j) {
                        if (i101.var_I1o_II.II__ != II1I[j]) continue;
                        I_0_.II().III((byte)4, (byte)i);
                        II0_ = System.currentTimeMillis();
                        return;
                    }
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static void II(I_I_ i_I_) {
        try {
            if (i_I_ == null) {
                return;
            }
            if (IlO_ != i_I_.lll) {
                IlO_ = i_I_.lll;
                IIOO = System.currentTimeMillis();
                IIO0 = i_I_.llIl;
                return;
            }
            long l = System.currentTimeMillis() - IIOO;
            if (l > 15000L) {
                if ((double)i_I_.llIl >= (double)IIO0 * 0.9) {
                    III1.void_III(new Integer(i_I_.lll));
                    IIOo = System.currentTimeMillis();
                    Ilol.Ilol_II().var_I_I__IIII = null;
                    var_I_I__II = null;
                    IlO_ = -1;
                    IIOO = 0L;
                    IIO0 = -1L;
                    Il_I.III().II0();
                }
            } else {
                IIO0 = i_I_.llIl;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean boolean_III(I_I_ i_I_) {
        for (int i = 0; i < III1.IIlO(); ++i) {
            Integer n = (Integer)III1.II(i);
            if (n != i_I_.lll) continue;
            return true;
        }
        return false;
    }

    private static void Ilo_() {
        try {
            if (IlOO != IOlO.l1oI) {
                III1.I_1O();
                IlOO = IOlO.l1oI;
                IIOo = 0L;
                return;
            }
            if (III1.IIlO() > 0 && IlOl.II(IIOo, 30000L)) {
                III1.I_1O();
                IIOo = 0L;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean boolean_IIlo() {
        try {
            if (!II.var_I_II_II.IOol) {
                return false;
            }
            for (int i = 0; i < II.var_I_II_II.II0.size(); ++i) {
                String string;
                I1Il i1Il = (I1Il)II.var_I_II_II.II0.elementAt(i);
                String string2 = string = i1Il.IIoO == null ? "" : i1Il.IIoO.toLowerCase();
                if (!Il_o.boolean_II(string, IIo.IIlo("\u8e61\u8e46\u90e0\u8e02\u8eab\u8edb\u8ebc\u8e08", 36367))) continue;
                int n = i;
                new Thread(new IIoI(n)).start();
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    private static void I1lo() {
        if (IlOl.II(II01, 1000L)) {
            II01 = IlOl.IIII();
            if ((Ilol.Ilol_II().I0_O < 400 || Ilol.Ilol_II().I0__ >= 40 && Ilol.Ilol_II().I0_O < 500) && Ilol.Ilol_II().Il1I > (long)(Ilol.Ilol_II().I0_O + 1000)) {
                I_0_.II().IIlO(0, 1);
            } else if (Ilol.Ilol_II().I0_0 < 300 && Ilol.Ilol_II().I0__ >= 25 && Ilol.Ilol_II().Il1I > (long)(Ilol.Ilol_II().I0_0 + 1000)) {
                I_0_.II().IIlO(1, 1);
            } else if (Ilol.Ilol_II().I0__ < 70 && Ilol.Ilol_II().Il1I > (long)Ilol.Ilol_II().I0__ * 100L) {
                I_0_.II().IIlO(2, 1);
            }
        }
    }

    private static boolean boolean_II1() {
        if (I1_I.var_I_lO_II_0.size() == 0) {
            IlII = false;
            return false;
        }
        boolean bl = false;
        for (int i = I1_I.var_I_lO_II_0.size() - 1; i >= 0; --i) {
            I10_ i10_ = (I10_)I1_I.var_I_lO_II_0.elementAt(i);
            if (i10_ == null) continue;
            int n = I_Ol.II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, i10_.I1, i10_.I1I);
            if (i10_.IoIO == Ilol.Ilol_II().IOI_ || i10_.IoIO == -1 && n <= 60 || i10_.II.II__ == 74) {
                bl = true;
            }
            if (IIo.boolean_III(i10_)) {
                I1_I.var_I_lO_II_0.removeElementAt(i);
                continue;
            }
            if (!IlOl.II(II1o, 550L)) continue;
            if (i10_.IoIO == Ilol.Ilol_II().IOI_) {
                IIo.II(i10_, n);
                continue;
            }
            if ((i10_.IoIO != -1 || n > 60) && i10_.II.II__ != 74) continue;
            IIo.void_III(i10_);
        }
        if (!bl) {
            IlII = false;
        }
        return bl;
    }

    private static boolean boolean_III(I10_ i10_) {
        short s = i10_.II.II__;
        return s >= 828 && s <= 842 || s == 859 || s == 362 || s >= 353 && s <= 360;
    }

    private static void II(I10_ i10_, int n) {
        IlII = true;
        Ilol.Ilol_II().var_I_I__IIII = null;
        if (n > 60 && n < 100) {
            Ilol.Ilol_II().var_I_ll_II = new I_ll(i10_.I1, i10_.I1I);
        }
        if (n >= 100) {
            Il_0.III1(i10_.I1, i10_.I1I);
        }
        I_0_.II().IIo1(i10_.lI0l);
        II1o = IlOl.IIII();
    }

    private static void void_III(I10_ i10_) {
        IlII = true;
        Ilol.Ilol_II().var_I_I__IIII = null;
        I_0_.II().IIo1(i10_.lI0l);
        II1o = IlOl.IIII();
    }

    private static void I11() {
        I_I_ i_I_;
        I_0o i_0o = Ilol.Ilol_II().var_I_0o_II;
        if (!IlII && IlOl.II(i_0o.I1IO, (long)i_0o.l1_O + 100L) && (i_I_ = IIo.I_I__IIII()) != null) {
            int n;
            if (var_I_I__II != i_I_) {
                var_I_I__II = i_I_;
                IlO_ = -1;
                Il_I.III().II0();
            }
            if ((n = Il_O.II(Ilol.Ilol_II(), i_I_)) > 50) {
                IIo.void_III(i_I_);
            } else if (n < 50) {
                IIo.II(i_I_, i_0o);
            }
        }
    }

    private static void void_III(I_I_ i_I_) {
        if (Il_0.II_()) {
            Il_0.III1(i_I_.I1, i_I_.I1I);
        } else if (!Il_I.III().II1O()) {
            Il10.IIII iIII = new Il10.IIII(Ilol.Ilol_II().I_o_ / 24, Ilol.Ilol_II().I_oO / 24);
            Il10.IIII iIII2 = new Il10.IIII(i_I_.I1 / 24, i_I_.I1I / 24);
            Il_I.III().II(iIII, iIII2);
        }
    }

    private static void II(I_I_ i_I_, I_0o i_0o) {
        IIo.II(i_I_);
        Il_I.III().II0();
        i_0o.I1IO = IlOl.IIII();
        Ilol.Ilol_II().var_I_I__IIII = i_I_;
        I_lO i_lO = new I_lO("");
        i_lO.addElement(i_I_);
        I_0_.II().II(i_lO, new I_lO(""), -1);
    }

    private static I_I_ I_I__IIII() {
        I_I_ i_I_ = null;
        int n = Integer.MAX_VALUE;
        Il10.IIII iIII = new Il10.IIII(Ilol.Ilol_II().I_o_ / 24, Ilol.Ilol_II().I_oO / 24);
        for (int i = 0; i < I1_I.var_I_lO_IIO.size(); ++i) {
            int n2;
            Il10.IIII iIII2;
            Il_l.II iI;
            I_I_ i_I_2 = (I_I_)I1_I.var_I_lO_IIO.elementAt(i);
            if (!IIo.IIII(i_I_2) || (iI = Il10.II(iIII, iIII2 = new Il10.IIII(i_I_2.I1 / 24, i_I_2.I1I / 24))) == null || (n2 = iI.IIlO()) >= n) continue;
            n = n2;
            i_I_ = i_I_2;
        }
        return i_I_;
    }

    private static boolean IIII(I_I_ i_I_) {
        return i_I_.status != 0 && i_I_.status != 1 && i_I_.llIl > 0 && !i_I_.I0I1 && i_I_.llI1 <= Il0I && i_I_.llI1 >= Il0 && !IIo.boolean_III(i_I_);
    }

    private static void IIl(int n) {
        IlOo = 15;
        IlO0 = 15;
        if (Il1O && II.var_I_II_II.IOol && IOlO.l1oI == Ilol.Ilol_II().IOIO + 42) {
            II.var_I_II_II.I0OO();
        }
        if (!Il1O) {
            IIo.I11I();
        } else if (IOlO.l1oI != 9 && IOlO.l1oI != 3 && IOlO.l1oI != 17) {
            if (!IlO_.II_O()) {
                IIo.I111();
            }
        } else {
            Il0I = n;
            Il0 = 0;
            IIo.III(true);
        }
    }

    private static void I11I() {
        if (IOlO.l1oI != Ilol.Ilol_II().IOIO + 42) {
            if (!IlO_.II_O()) {
                IIo.III(false);
                IlO_.II_l(Ilol.Ilol_II().IOIO + 42);
            }
        } else {
            I_11 i_11 = (I_11)I1_I.var_I_lO_IIOI.elementAt(0);
            Il_0.II1o(i_11.I_o_);
            if (I_Ol.II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, i_11.I_o_, i_11.I_oO) <= 50) {
                IIo.I11l();
            }
        }
    }

    private static void I11l() {
        if (!II.var_I_II_II.IOol) {
            I_0_.II().IIoI(21);
        } else {
            I1Il i1Il = (I1Il)II.var_I_II_II.II0.elementAt(0);
            if (Il_o.int_II(i1Il.IIoO.replace('\n', ' '), IIo.IIlo("\u8e5b\u8e46\u8ffd\u90b3\u8ee5\u8ecd\u8ee9\u8eaa\u8ffe\u8f47\u8f65\u8f55\u8feb\u8f82\u8faf\u8f87\u9154\u906b\u901d\u9032\u9013\u90f3\u9053\u90b6", 36367)) != -1) {
                I_0_.II().II((short)21, (byte)0);
            }
            Il1O = true;
        }
    }

    private static void I111() {
        IIo.III(false);
        int n = IIo.IIIo();
        IlO_.II_l(n);
    }

    private static int IIIo() {
        switch (Ilol.Ilol_II().IOIO) {
            case 0: {
                return 3;
            }
            case 1: {
                return 9;
            }
            case 2: {
                return 17;
            }
        }
        return 3;
    }

    private static void I11_() {
        short s = Ilol.Ilol_II().var_IOlI_II.II01;
        switch (s) {
            case 0: {
                IIo.I11O();
                break;
            }
            case 1: {
                IIo.I1_1();
                break;
            }
            case 2: {
                IIo.I1_o();
                break;
            }
            case 3: {
                IIo.I1Ol();
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                IIo.I1OO();
                break;
            }
            case 7: {
                IIo.I10();
                break;
            }
            case 8: {
                IIo.I101();
                break;
            }
            case 9: {
                IIo.I100();
                break;
            }
            case 10: {
                IIo.I1o_();
            }
        }
    }

    private static void I11O() {
        if (IOlO.l1oI >= 39 && IOlO.l1oI <= 41) {
            IO1 iO1 = (IO1)IOlO.IlI_.elementAt(0);
            Il_0.III1(iO1.IIoI - 20, iO1.IIol);
        } else if (IOlO.l1oI >= 21 && IOlO.l1oI <= 23) {
            IIo.I110();
        }
    }

    private static void I110() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (n == 2) {
            IIo.I11o();
        } else if (n == 3) {
            IIo.I1_();
        } else if (n == 4) {
            IIo.I1_I();
        } else if (n == 5) {
            IIo.I1_l();
        }
    }

    private static void I11o() {
        int n = IIo.IIl();
        IIo.III0(n);
    }

    private static int IIl() {
        switch (Ilol.Ilol_II().IOIO) {
            case 0: {
                return 0;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
        }
        return 0;
    }

    private static void I1_() {
        int n = Ilol.Ilol_II().IOIO;
        int n2 = 0;
        int n3 = 336;
        if (n == 0) {
            n2 = 85;
        } else if (n == 1) {
            n2 = 638;
        } else if (n == 2) {
            n2 = 94;
        }
        if (Math.abs(Ilol.Ilol_II().I_o_ - n2) <= 10 && Math.abs(Ilol.Ilol_II().I_oO - n3) <= 10) {
            I_0_.II().III((byte)0, (byte)0);
        } else {
            Il_0.III1(n2, n3);
        }
    }

    private static void I1_I() {
        Il_1.II10(4);
        IIo.III(100L);
        I_0_.II().IIoI(4);
        IIo.III(200L);
        I_0_.II().II((short)4, (byte)0);
        IIo.III(300L);
    }

    private static void I1_l() {
        if (II.var_I_II_II.IOol) {
            II.var_I_II_II.I0OO();
        }
        IIo.III(300L);
        IIo.I11o();
    }

    private static void I1_1() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (n == 0) {
            IIo.I1__();
        } else if (n == 1) {
            IIo.I1_O();
        }
    }

    private static void I1__() {
        Ilol.Ilol_II().var_I_11_II = null;
        if (IOlO.l1oI >= 21 && IOlO.l1oI <= 23) {
            if (!IlO_.II_O()) {
                IlO_.II_l(Ilol.Ilol_II().IOIO * 7);
            }
        } else if (IOlO.l1oI == Ilol.Ilol_II().IOIO * 7) {
            IIo.III(true);
        }
    }

    private static void I1_O() {
        IIo.III(false);
        IIo.I1_0();
        int n = Ilol.Ilol_II().IOIO + 21;
        if (!IlO_.II_O() && IOlO.l1oI != n) {
            IlO_.II_l(n);
        } else if (IOlO.l1oI == n) {
            IIo.III(300L);
            IIo.I11o();
        }
    }

    private static void I1_0() {
        Ilol.Ilol_II().var_I_I__IIII = null;
        Ilol.Ilol_II().var_I10__II = null;
        Ilol.Ilol_II().var_Ilol_IIIl = null;
    }

    private static void I1_o() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (n == 0) {
            IIo.I1O();
        } else if (n == 1) {
            IIo.I1OI();
        }
    }

    private static void I1O() {
        int n = Ilol.Ilol_II().IOIO * 7 + 1;
        if (IOlO.l1oI != n) {
            if (!IlO_.II_O()) {
                IIo.III(false);
                IlO_.II_l(n);
            }
        } else if (!IIo.boolean_IIl0()) {
            IIo.III(true);
        }
    }

    private static void I1OI() {
        Ilol.Ilol_II().var_I_I__IIII = null;
        IIo.III(false);
        int n = Ilol.Ilol_II().IOIO + 21;
        if (IOlO.l1oI != n) {
            if (!IlO_.II_O()) {
                IlO_.II_l(n);
            }
        } else {
            IIo.III(300L);
            IIo.I11o();
        }
    }

    private static void I1Ol() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (n == 0) {
            I_0_.II().IIlO(2, 1);
        } else if (n == 1) {
            IIo.I1O1();
        } else if (n == 2) {
            IIo.I1O_();
        }
    }

    private static void I1O1() {
        int n = Ilol.Ilol_II().IOIO + 42;
        if (IOlO.l1oI == n) {
            I_0_.II().IIo1(-1);
        } else if (!IlO_.II_O()) {
            IlO_.II_l(n);
        }
    }

    private static void I1O_() {
        int n = Ilol.Ilol_II().IOIO + 21;
        if (IOlO.l1oI != n) {
            if (!IlO_.II_O()) {
                IlO_.II_l(n);
            }
        } else {
            IIo.III(300L);
            IIo.I11o();
        }
    }

    private static void I1OO() {
        IlOo = 30;
        IlO0 = 15;
        Il0I = 500;
        Il0 = 499;
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (n < 3) {
            IIo.I1O0();
        } else {
            IIo.I1Oo();
        }
    }

    private static void I1O0() {
        int n = IIo.IIlI();
        if (IOlO.l1oI == n) {
            IIo.III(true);
        } else {
            IIo.III(false);
            if (!IlO_.II_O()) {
                IlO_.II_l(n);
            }
        }
    }

    private static int IIlI() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        int n2 = Ilol.Ilol_II().IOIO;
        if (n == 0) {
            return 2 + n2 * 7;
        }
        if (n == 1) {
            return n2 == 0 ? 9 : 2;
        }
        if (n == 2) {
            return n2 == 2 ? 9 : 16;
        }
        return 2 + n2 * 7;
    }

    private static void I1Oo() {
        IIo.III(false);
        Il0I = Integer.MAX_VALUE;
        Il0 = 0;
        IIo.I1O_();
    }

    private static void I10() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (Ilol.Ilol_II().Illo > 85000L && n != 0) {
            if (n == 1) {
                IIo.I10I();
            } else if (n == 2) {
                IIo.I10l();
            } else if (n == 3) {
                IIo.I1O_();
            }
        } else {
            IIo.IIl(200);
        }
    }

    private static void I10I() {
        if (IOlO.l1oI != 3 && IOlO.l1oI != 11 && IOlO.l1oI != 17) {
            if (!IlO_.II_O()) {
                IIo.III(false);
                int n = IIo.IIIo();
                if (Ilol.Ilol_II().IOIO == 1) {
                    n = 11;
                }
                IlO_.II_l(n);
            }
        } else {
            IlOo = 45;
            IlO0 = 15;
            Il0I = 600;
            Il0 = 599;
            IIo.III(true);
        }
    }

    private static void I10l() {
        IIo.III(false);
        Il0I = Integer.MAX_VALUE;
        Il0 = 0;
        int n = Ilol.Ilol_II().IOIO * 7;
        if (IOlO.l1oI == n) {
            IIo.III0(Ilol.Ilol_II().IOIO + 7);
        } else if (!IlO_.II_O()) {
            IlO_.II_l(n);
        }
    }

    private static void I101() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (Ilol.Ilol_II().Illo > 140000L && n != 0) {
            if (n == 1) {
                IIo.I10_();
            } else if (n == 2) {
                IIo.I1O_();
            } else if (n == 3) {
                IIo.I10O();
            }
        } else {
            IIo.IIl(500);
        }
    }

    private static void I10_() {
        IlOo = 60;
        IlO0 = 15;
        int n = IIo.IIll();
        if (!IlO_.II_O() && IOlO.l1oI != n) {
            IlO_.II_l(n);
        }
        if (IOlO.l1oI == 12 || IOlO.l1oI == 18 || IOlO.l1oI == 4) {
            Il0I = 1000;
            Il0 = 999;
            IIo.III(true);
        }
    }

    private static int IIll() {
        switch (Ilol.Ilol_II().IOIO) {
            case 0: {
                return 12;
            }
            case 1: {
                return 18;
            }
            case 2: {
                return 4;
            }
        }
        return 12;
    }

    private static void I10O() {
        if (IOlO.l1oI != 47 && !IlO_.II_O()) {
            IlO_.II_l(47);
        }
    }

    private static void I100() {
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (n <= 1) {
            IIo.I10o();
        } else if (n == 2) {
            IIo.I1o();
        } else if (n == 3) {
            IIo.I1oI();
        }
    }

    private static void I10o() {
        if (IOlO.l1oI == 47) {
            IIo.III0(17);
        } else if (!IlO_.II_O()) {
            IlO_.II_l(47);
        }
    }

    private static void I1o() {
        if (IOlO.l1oI != 47) {
            if (!IlO_.II_O()) {
                IlO_.II_l(47);
            }
        } else {
            IIo.I1ol();
        }
    }

    private static void I1oI() {
        if (IOlO.l1oI == 46) {
            IIo.I1o1();
        } else if (IOlO.l1oI == 47) {
            IIo.I1ol();
        } else if (!IlO_.II_O()) {
            IlO_.II_l(47);
        }
    }

    private static void I1ol() {
        if (Math.abs(Ilol.Ilol_II().I_o_ - 600) >= 20) {
            Il_0.III1(600, 336);
        } else if (Ilol.Ilol_II().var_I_ll_II == null || Ilol.Ilol_II().var_I_ll_II.lI0 != 600 && Ilol.Ilol_II().var_I_ll_II.lI0I != 10) {
            Ilol.Ilol_II().var_I_ll_II = new I_ll(600, 10);
        }
    }

    private static void I1o1() {
        if (II.var_I_II_II.IOol && II.var_I_II_II.II0.size() == 1) {
            I_0_.II().II((short)18, (byte)0);
            II.var_I_II_II.I0OO();
        } else {
            Il_1.II10(18);
            I1_I.II((short)18);
            IIo.III(300L);
            I_0_.II().IIoI(18);
        }
    }

    private static void I1o_() {
        Il1o = false;
        Il_ = false;
        Il0l = Ilol.Ilol_II().var_IOlI_II.l10l > 1 ? 0 : 7;
        int n = Ilol.Ilol_II().var_IOlI_II.l10l;
        if (n == 0) {
            IIo.I1oO();
        } else if (n == 1) {
            IIo.I1o0();
        } else if (n == 2) {
            IIo.I1oo();
        } else if (n == 3) {
            IIo.I1O_();
        }
    }

    private static void I1oO() {
        if (IOlO.l1oI == 46) {
            boolean bl = IIo.IIII(IIo.IIlo("\u8e44\u8e4f\u8e3f\u8e05\u8ee5", 36367));
            if (!bl) {
                I_0_.II().IIoI(18);
                IIo.III(500L);
                I_0_.II().II((short)18, (byte)3);
                IIo.III(100L);
                I_0_.II().II((short)18, (byte)0);
                II.var_I_II_II.I0OO();
                Ilol.var_Ilo1_II = null;
                IIo.III(3000L);
            } else {
                Il1o = true;
            }
        } else {
            IIo.I_();
        }
    }

    private static void I1o0() {
        if (IOlO.l1oI == 46) {
            if (Ilol.Ilol_II().var_I_ll_II == null || Ilol.Ilol_II().var_I_ll_II.lI0 != 576 && Ilol.Ilol_II().var_I_ll_II.lI0I != 552) {
                Ilol.Ilol_II().var_I_ll_II = new I_ll(576, 552);
            }
            Il10 = true;
        } else if (IOlO.l1oI == 47) {
            if (Il10 && (Ilol.Ilol_II().I_o_ != 371 || Ilol.Ilol_II().I_oO != 336)) {
                Il10 = false;
                Il_0.III1(371, 336);
                IIo.III(500L);
            }
            Il_ = true;
        } else {
            Il10 = true;
            if (!IlO_.II_O()) {
                IlO_.II_l(47);
            }
        }
    }

    private static void I1oo() {
        if (IOlO.l1oI == 47) {
            IIo.III0(17);
        } else if (!IlO_.II_O()) {
            IlO_.II_l(47);
        }
    }

    private static void I_() {
        if (IOlO.l1oI == 47) {
            IIo.I1ol();
        } else if (!IlO_.II_O()) {
            IlO_.II_l(47);
        }
    }

    private static boolean IIII(String string) {
        for (int i = 0; i < I1_I.var_I_lO_II_O.size(); ++i) {
            Ilol ilol = (Ilol)I1_I.var_I_lO_II_O.elementAt(i);
            if (!string.equals(ilol.IIO1) || ilol.var_byte_III0 != 3) continue;
            return true;
        }
        return false;
    }

    private static void I_I() {
        IlOo = 200;
        IlO0 = 20;
        I_0o i_0o = Ilol.Ilol_II().var_I_0o_II;
        if (!IlII && IlOl.II(i_0o.I1IO, (long)i_0o.l1_O + 100L)) {
            int n;
            if (Ilol.Ilol_II().IOl_ > 0 && !Ilol.Ilol_II().I_I_ && (n = Ilol.Ilol_II().IOl_ * 100 / Ilol.Ilol_II().IOlo) <= 60 && I1_I.Io_0 > 0 && IlOl.II(II0O, 2000L)) {
                II0O = IlOl.IIII();
                I1_I.I1_I_II().I0_();
            }
            for (n = 0; n < I1_I.var_I_lO_II_O.size(); ++n) {
                Ilol ilol = (Ilol)I1_I.var_I_lO_II_O.elementAt(n);
                if (!IIo.IIlo("\u8e44\u8e4f\u8e3f\u8e05\u8ee5", 36367).equals(ilol.IIO1) || ilol.var_byte_III0 != 3) continue;
                Il_1.II((I1_O)ilol);
                int n2 = I_Ol.II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, ilol.I_o_, ilol.I_oO);
                if (n2 > 50) break;
                i_0o.I1IO = IlOl.IIII();
                Ilol.Ilol_II().var_Ilol_IIIl = ilol;
                I_lO i_lO = new I_lO("");
                i_lO.addElement(ilol);
                I_0_.II().II(new I_lO(""), i_lO, -1);
                break;
            }
        }
    }

    private static void I_II() {
        IlOo = 350;
        IlO0 = 20;
        I_0o i_0o = Ilol.Ilol_II().var_I_0o_II;
        if (!IlII && IlOl.II(i_0o.I1IO, (long)i_0o.l1_O + 100L)) {
            int n;
            if (Ilol.Ilol_II().IOl_ > 0 && !Ilol.Ilol_II().I_I_ && (n = Ilol.Ilol_II().IOl_ * 100 / Ilol.Ilol_II().IOlo) <= 80 && I1_I.Io_0 > 0 && IlOl.II(II0O, 2000L)) {
                II0O = IlOl.IIII();
                I1_I.I1_I_II().I0_();
            }
            for (n = 0; n < I1_I.var_I_lO_II_O.size(); ++n) {
                Ilol ilol = (Ilol)I1_I.var_I_lO_II_O.elementAt(n);
                if (!IIo.IIlo("\u8e5b\u8ece\u8e38\u8e4c\u8edb\u9009\u8eb0\u8ec8\u8f57\u9185\u8f3c", 36367).equals(ilol.IIO1) || ilol.var_byte_III0 != 3) continue;
                Il_1.II((I1_O)ilol);
                int n2 = I_Ol.II(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, ilol.I_o_, ilol.I_oO);
                if (n2 > 50) break;
                i_0o.I1IO = IlOl.IIII();
                Ilol.Ilol_II().var_Ilol_IIIl = ilol;
                I_lO i_lO = new I_lO("");
                i_lO.addElement(ilol);
                I_0_.II().II(new I_lO(""), i_lO, -1);
                break;
            }
        }
    }

    static {
        Il10 = true;
        II0_ = 0L;
        IIIo = 0L;
        II0O = 0L;
        II00 = 0L;
        IlO0 = 15;
        IlOo = 15;
        Il0I = Integer.MAX_VALUE;
        Il01 = 0;
        var_I_I__II = null;
        IIOO = 0L;
        IlO_ = -1;
        IIO0 = -1L;
        III1 = new Il_l.II();
        IIOo = 0L;
        IlOO = -1;
        II1I = new int[]{227, 228, 229};
    }

    private static /* synthetic */ String IIlo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

