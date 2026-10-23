package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IlI
extends IIII
implements I1_1,
I1__ {
    private static Il var_Il_II;
    private static IlI var_IlI_II;
    public boolean II_1 = false;
    private IlI0 var_IlI0_II = new IlI0();
    public int I1 = 0;
    public int I1I = 0;
    private int I1II = 0;
    private long IIo = 1000L;
    private int I1Il = 0;
    private int I1I1;
    public int I1I_ = 20;
    public int I1IO = 5;
    public boolean Il_0;
    public I_lO III_ = new I_lO("");
    public boolean Il_o = false;
    private boolean IlO = false;
    public boolean IlOI = false;
    private Ilol var_Ilol_II = null;
    private I_I_ III = null;
    public int I1I0 = 0;
    public boolean IlOl;
    public boolean IlO1;
    public boolean IlO_ = false;
    public boolean IlOO;
    public int I1Io = 500;
    private long IIoI = 0L;
    public static String II1l;
    private static final long IIol = 1100L;
    private static long IIo1;

    public static IlI IlI_II() {
        if (var_IlI_II == null) {
            var_IlI_II = new IlI();
        }
        return var_IlI_II;
    }

    public static IlI III() {
        return IlI.IlI_II();
    }

    private IlI() {
        var_Il_II = new Il();
    }

    @Override
    protected void II1l() {
        this.IIOI();
        I1_I.var_I1Oo_II.IIII(IlI.II10("\u32df\u32de\u32b4\u32cf\u336c\u3354\u336c\u3326\u33eb\u33cd\u33e9", 12946), 0);
        this.var_IlI0_II.II(new IlII(this, 100L));
        this.var_IlI0_II.II(new IlIl(this, 0L));
        this.var_IlI0_II.II(new IlI1(this, 100L));
        this.var_IlI0_II.II(new IlI_(this, 1000L));
        this.void_IIlo();
    }

    @Override
    protected void II11() {
        this.IIOl();
        this.var_IlI0_II.I_1O();
    }

    @Override
    protected void II1_() {
        Ilol ilol = Ilol.Ilol_II();
        if (ilol != null) {
            this.var_IlI0_II.IIlO();
            this.I_l_();
            ilol.IOIo = this.I1IO;
        }
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    private void I_ll() {
        if (I1_I.var_I_lO_II_O != null) {
            this.III_.removeAllElements();
            for (int i = 0; i < I1_I.var_I_lO_II_O.size(); ++i) {
                Ilol ilol = (Ilol)I1_I.var_I_lO_II_O.elementAt(i);
                if (ilol.IIO1 == null || ilol.IIO1.equals("") || ilol.I_ || ilol.I_I || ilol.IIO1.startsWith(IlI.II10("\u32b1", 12946)) || ilol.IIO1.startsWith(IlI.II10("\u32b6", 12946)) || ilol.IIO1.equals(IlI.II10("\u32c6\u32c3\u2c1d\u3281\u3369\u330d\u3338\u338b\u33e3", 12946))) continue;
                this.III_.addElement(ilol);
            }
        }
    }

    private void I_l1() {
        Ilol ilol = Ilol.Ilol_II();
        if (ilol != null) {
            long l = System.currentTimeMillis();
            if (ilol.var_byte_IIl == 0) {
                if (l - this.IIoI > 1100L) {
                    I_0_.II().IIII((byte)1, (byte)8);
                    this.IIoI = l;
                }
            } else if (ilol.IOl_ > 0 && !ilol.I_I_) {
                if (l - this.IIoI > (long)this.I1Io) {
                    I_lO i_lO = new I_lO("");
                    i_lO.addElement(ilol);
                    I_0_.II().II(new I_lO(""), i_lO, -1);
                    this.IIoI = l;
                }
            } else {
                this.IlOO = false;
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u32c6\u2c40\u32f0\u329c\u33ef\u3359\u336c\u327a\u3369\u3389\u33bc\u2d16\u3426\u3451\u2aeb\u3417\u34a2\u34ca\u34a8\u34b6\u34de\u3576\u3555\u2b9c\u350e\u35b9\u35cb\u2b3e\u3595\u3634", 12946), 0);
            }
        }
    }

    public void I_l_() {
        this.IIl1();
    }

    public void III_(IO1l iO1l) {
        try {
            Object object;
            int n;
            int n2;
            Ilol ilol = Ilol.Ilol_II();
            if (ilol == null) {
                return;
            }
            int n3 = this.IIl1();
            IO1I.IIl_.II(iO1l, "" + n3, 0, 0, 0, IO1I.IIlI);
            IIo1.III().III0(iO1l);
            II_O.III().III_(iO1l);
            if (this.Il_0) {
                --this.I1I0;
                if (this.I1I0 <= 0) {
                    this.Il_0 = false;
                }
                n2 = II.var_int_IIl - I1_I.IIo_.getWidth() - 10;
                n = II.var_int_IIlI / 2 + 25;
                iO1l.II(I10_.IlOI, n2 - 10, n - 10, 0);
            }
            IIol.IIIO(iO1l);
            if (!IIo1.Il_l && IOlO.l1oI >= 0 && IOlO.l1oI < IOlO.II11.length) {
                object = IlI.II10("\u32c9", 12946) + IOlO.l1oI + IlI.II10("\u32cf\u3291", 12946) + IOlO.II11[IOlO.l1oI] + IlI.II10("\u32b2\u32ea\u329b", 12946) + IOlO.l1ol + IlI.II10("\u32cf", 12946);
                IO1I.IIII.II(iO1l, (String)object, 10, 80, 0, IO1I.III_);
                long l = IO10.IIII();
                long l2 = (l / 1000L / 60L / 60L + 7L) % 24L;
                long l3 = l / 1000L / 60L % 60L;
                String string = String.format(IlI.II10("\u32b7\u3281\u32e2\u328b\u3334\u3308\u337c\u3359\u33ee", 12946), l2, l3);
                long l4 = (l - IIo1) / 1000L / 60L;
                long l5 = l4 / 60L;
                long l6 = l4 % 60L;
                String string2 = l5 + IlI.II10("\u32fa", 12946) + l6 + IlI.II10("\u32ff", 12946);
                String string3 = IlI.II10("\u32c6\u32d8\u32bd\u328a\u3334\u330d", 12946) + string + IlI.II10("\u32b2\u32e4\u32a0\u32d5\u332e", 12946) + string2;
                IO1I.var_IO1I_II1I.II(iO1l, string3, 10, 90, 0, IO1I.IIlI);
                long l7 = Runtime.getRuntime().freeMemory() / 1024L / 1024L;
                long l8 = Runtime.getRuntime().totalMemory() / 1024L / 1024L;
                long l9 = l8 - l7;
                String string4 = IlI.II10("\u32ca\u328b\u32f0", 12946) + ilol.I_o_ + IlI.II10("\u32b2\u329c\u32f0\u32b6\u3334\u330d", 12946) + ilol.I_oO + IlI.II10("\u32b2\u32e3\u32b1\u3282\u3334\u330d", 12946) + l9 + IlI.II10("\u32df\u32d3", 12946);
                IO1I.var_IO1I_II1I.II(iO1l, string4, 10, 100, 0, IO1I.IIlI);
            }
            if (this.Il_o) {
                this.IIll(iO1l);
            }
            if (this.IlOI && (this.var_Ilol_II != null || this.III != null)) {
                iO1l.Illl(0xFF0000);
                if (this.var_Ilol_II != null) {
                    iO1l.IIII(Ilol.Ilol_II().I_o_ - I1_I.Io1, Ilol.Ilol_II().I_oO - I1_I.Io1I, this.var_Ilol_II.I_o_ - I1_I.Io1, this.var_Ilol_II.I_oO - I1_I.Io1I);
                } else if (this.III != null) {
                    iO1l.IIII(Ilol.Ilol_II().I_o_ - I1_I.Io1, Ilol.Ilol_II().I_oO - I1_I.Io1I, this.III.I1 - I1_I.Io1, this.III.I1I - I1_I.Io1I);
                }
            }
            if (!(II.var_I_II_II.IOol || Ilo_.II().I_10 || II.var_I_1o_II.I_10)) {
                boolean bl;
                if (!Ilol.Ilol_II().I_I_ && I1_I.lIIl == 1 && Ilol.Ilol_II().var_IOlI_II.II01 > 1) {
                    Il11.IIlo(iO1l);
                }
                n2 = II.var_int_IIl - I1_I.IIo_.getWidth();
                n = II.var_int_IIlI - 125;
                iO1l.II(I1_I.IIo_, 0, 0, I1_I.IIo_.getWidth(), I1_I.IIo_.getHeight(), 2, n2, n, 0);
                boolean bl2 = bl = II.II(n2, n, I1_I.IIo_.getWidth(), I1_I.IIo_.getHeight()) && II.var_boolean_IIIO;
                if (bl) {
                    iO1l.II(I10_.IlOI, n2 - 5, n, 0);
                }
            }
            if (!((object = Ilol.Ilol_II().var_Ilol_IIIl) == null || ((Ilol)object).I_ || ((Ilol)object).I_I || ((Ilol)object).IIO1 == null || ((Ilol)object).IIO1.equals("") || ((Ilol)object).IIO1.startsWith(IlI.II10("\u32b1", 12946)) || ((Ilol)object).IIO1.startsWith(IlI.II10("\u32b6", 12946)) || ((Ilol)object).IIO1.equals(IlI.II10("\u32c6\u32c3\u2c1d\u3281\u3369\u330d\u3338\u338b\u33e3", 12946)))) {
                this.II(iO1l, (Ilol)object);
            }
            if (this.IlOl || this.IlO1) {
                this.IIl(iO1l);
            }
            if (this.IlO && !this.IlOl && !this.IlO1) {
                this.IIlI(iO1l);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void IIl(IO1l iO1l) {
        int n;
        int n2 = 160;
        int n3 = 10;
        int n4 = 10;
        if (this.IlO1) {
            n = 10;
            this.II(iO1l, Ilol.Ilol_II(), IlI.II10("\u32bf\u329c\u32f0\u32bc\u32a1\u330d\u331c\u3323\u2d6e\u3389\u33e5\u33ca", 12946), n + n3, n2, n4, true);
        }
        if (this.IlOl) {
            if (II.var_int_IIIO % 15 == 0) {
                I_0_.II().Io0I();
            }
            n = this.IlO1 ? 125 : 10;
            this.II(iO1l, Ilol.Ilol_III(), IlI.II10("\u32bf\u329c\u32f0\u33ff\u2dc8\u330d\u3318\u2d87\u33aa\u3384\u33e5", 12946), n + n3, n2, n4, false);
        }
    }

    private void II(IO1l iO1l, Ilol ilol, String string, int n, int n2, int n3, boolean bl) {
        int n4 = n2;
        IO1I.II.II(iO1l, string, n, n4, 0, IO1I.III_);
        this.II(iO1l, IlI.II10("\u32c1\u32fc\u32ea\u32cf", 12946) + I_1l.IIIl(ilol.Illo), n, n4 += n3);
        this.II(iO1l, IlI.II10("\u32c6\u32ff\u32ea\u32cf", 12946) + I_1l.IIIl(ilol.Il1I), n, n4 += n3);
        int n5 = this.II(ilol.IOl_, ilol.IOlo);
        this.II(iO1l, IlI.II10("\u32da\u32e1\u32ea\u32cf", 12946) + I_1l.IIIl(ilol.IOl_) + IlI.II10("\u32ba", 12946) + n5 + IlI.II10("\u32b7\u3298", 12946), n, n4 += n3);
        int n6 = this.II(ilol.IOl1, ilol.IO1);
        this.II(iO1l, IlI.II10("\u32d9\u32f8\u32ea\u32cf", 12946) + I_1l.IIIl(ilol.IOl1) + IlI.II10("\u32ba", 12946) + n6 + IlI.II10("\u32b7\u3298", 12946), n, n4 += n3);
        this.II(iO1l, IlI.II10("\u32c1\u32f5\u32ea\u32cf", 12946) + I_1l.IIIl(ilol.IOl), n, n4 += n3);
        n4 += n3;
        if (bl) {
            this.II(iO1l, IlI.II10("\u32c4\u3251\u32be\u3288\u3334\u330d", 12946) + I_1l.IIIl(ilol.Il11), n, n4);
            n4 += n3;
            if (II0l.II0l_III().IllO) {
                this.II(iO1l, n, n4);
            }
        } else {
            this.II(iO1l, IlI.II10("\u32d5\u32d8\u3231\u329f\u3334\u330d", 12946) + I_1l.IIIl(ilol.IOlI), n, n4);
        }
    }

    private void II(IO1l iO1l, String string, int n, int n2) {
        IO1I.var_IO1I_II1I.II(iO1l, string, n, n2, 0, IO1I.IIlI);
    }

    private void II(IO1l iO1l, int n, int n2) {
        long l = II0l.II0l_III().long_II();
        long l2 = II0l.II0l_III().long_III();
        long l3 = l2 > 0L ? l * 3600000L / l2 : 0L;
        String string = this.java_lang_String_II(l3);
        String string2 = IlI.II10("\u32d5\u32de\u32bc\u328b\u335a\u335f\u332d\u3302\u33e4\u3393\u33e8\u33cc", 12946) + I_1l.IIIl(l) + IlI.II10("\u32b2\u3291", 12946) + string;
        this.II(iO1l, string2, n, n2);
    }

    private String java_lang_String_II(long l) {
        if (l >= 1000000L) {
            return l / 1000000L + IlI.II10("\u32df\u329e\u32b8", 12946);
        }
        return l / 1000L + IlI.II10("\u32d9\u329e\u32b8", 12946);
    }

    private void IIlI(IO1l iO1l) {
        Ilol ilol = Ilol.Ilol_II();
        if (ilol != null && ilol.var_I101_arr_II != null && ilol.var_I101_arr_III != null && ilol.var_I101_arr_IIII != null) {
            int n = 10;
            int n2 = 135;
            int n3 = 10;
            int[] nArray = new int[5];
            int[] nArray2 = new int[5];
            int[] nArray3 = new int[5];
            int[] nArray4 = new int[5];
            int[] nArray5 = new int[5];
            IlI.II(Ilol.Ilol_II().var_I101_arr_II, nArray, nArray2, nArray3, nArray4, nArray5);
            IlI.II(Ilol.Ilol_II().var_I101_arr_III, nArray, nArray2, nArray3, nArray4, nArray5);
            IlI.II(Ilol.Ilol_II().var_I101_arr_IIII, nArray, nArray2, nArray3, nArray4, nArray5);
            IO1I.II.II(iO1l, IlI.II10("\u32bf\u329c\u32f0\u32bb\u3346\u33f9\u3302\u332c\u33aa\u33fd\u3381\u33a9\u3426\u3476\u340f\u342b\u34a2\u348c\u34ed", 12946), n, n2, 0, IO1I.III_);
            int n4 = n2 + n3 + 2;
            if (Ilol.Ilol_II().III0().equals(IlI.II10("\u32c6\u33a1", 12946))) {
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32c1\u32de\u32be\u3288\u3361\u3346\u3339\u3351\u33aa\u33f2", 12946) + nArray[0] + IlI.II10("\u32be\u3291", 12946) + nArray[1] + IlI.II10("\u32be\u3291", 12946) + nArray[2] + IlI.II10("\u32be\u3291", 12946) + nArray[3] + IlI.II10("\u32be\u3291", 12946) + nArray[4] + IlI.II10("\u32cf", 12946), n, n4, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d9\u32d0\u32b9\u3280\u3365\u3348\u3322\u3351\u33aa\u33f2", 12946) + nArray2[0] + IlI.II10("\u32be\u3291", 12946) + nArray2[1] + IlI.II10("\u32be\u3291", 12946) + nArray2[2] + IlI.II10("\u32be\u3291", 12946) + nArray2[3] + IlI.II10("\u32be\u3291", 12946) + nArray2[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32c6\u32d4\u32be\u329c\u3366\u3344\u3322\u3303\u33eb\u33c7\u33f2\u33c7\u345d", 12946) + nArray3[0] + IlI.II10("\u32be\u3291", 12946) + nArray3[1] + IlI.II10("\u32be\u3291", 12946) + nArray3[2] + IlI.II10("\u32be\u3291", 12946) + nArray3[3] + IlI.II10("\u32be\u3291", 12946) + nArray3[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d5\u32de\u32b8\u328e\u3360\u3317\u336c\u3330", 12946) + nArray4[0] + IlI.II10("\u32be\u3291", 12946) + nArray4[1] + IlI.II10("\u32be\u3291", 12946) + nArray4[2] + IlI.II10("\u32be\u3291", 12946) + nArray4[3] + IlI.II10("\u32be\u3291", 12946) + nArray4[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d9\u32d8\u32a2\u3286\u3360\u3317\u336c\u3330", 12946) + nArray5[0] + IlI.II10("\u32be\u3291", 12946) + nArray5[1] + IlI.II10("\u32be\u3291", 12946) + nArray5[2] + IlI.II10("\u32be\u3291", 12946) + nArray5[3] + IlI.II10("\u32be\u3291", 12946) + nArray5[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
            } else if (Ilol.Ilol_II().III0().equals(IlI.II10("\u32ca\u32f5", 12946))) {
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d9\u32d0\u32bb\u328e\u3362\u3342\u3338\u3351\u33aa\u33f2", 12946) + nArray[0] + IlI.II10("\u32be\u3291", 12946) + nArray[1] + IlI.II10("\u32be\u3291", 12946) + nArray[2] + IlI.II10("\u32be\u3291", 12946) + nArray[3] + IlI.II10("\u32be\u3291", 12946) + nArray[4] + IlI.II10("\u32cf", 12946), n, n4, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d1\u32d0\u32f0\u33ff\u33e3\u334e\u3376\u334b\u33d1", 12946) + nArray2[0] + IlI.II10("\u32be\u3291", 12946) + nArray2[1] + IlI.II10("\u32be\u3291", 12946) + nArray2[2] + IlI.II10("\u32be\u3291", 12946) + nArray2[3] + IlI.II10("\u32be\u3291", 12946) + nArray2[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d1\u32d0\u33c1\u3286\u336d\u330d\u3301\u3351\u33aa\u33f2", 12946) + nArray3[0] + IlI.II10("\u32be\u3291", 12946) + nArray3[1] + IlI.II10("\u32be\u3291", 12946) + nArray3[2] + IlI.II10("\u32be\u3291", 12946) + nArray3[3] + IlI.II10("\u32be\u3291", 12946) + nArray3[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d5\u32de\u32b8\u328e\u3360\u3317\u336c\u3330", 12946) + nArray4[0] + IlI.II10("\u32be\u3291", 12946) + nArray4[1] + IlI.II10("\u32be\u3291", 12946) + nArray4[2] + IlI.II10("\u32be\u3291", 12946) + nArray4[3] + IlI.II10("\u32be\u3291", 12946) + nArray4[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32dc\u32d0\u32a0\u329f\u336f\u3317\u336c\u3330", 12946) + nArray5[0] + IlI.II10("\u32be\u3291", 12946) + nArray5[1] + IlI.II10("\u32be\u3291", 12946) + nArray5[2] + IlI.II10("\u32be\u3291", 12946) + nArray5[3] + IlI.II10("\u32be\u3291", 12946) + nArray5[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
            } else {
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32c2\u32d8\u32b3\u3280\u3362\u3342\u3376\u334b\u33d1", 12946) + nArray[0] + IlI.II10("\u32be\u3291", 12946) + nArray[1] + IlI.II10("\u32be\u3291", 12946) + nArray[2] + IlI.II10("\u32be\u3291", 12946) + nArray[3] + IlI.II10("\u32be\u3291", 12946) + nArray[4] + IlI.II10("\u32cf", 12946), n, n4, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d6\u32d0\u32b9\u3282\u336f\u3342\u3376\u334b\u33d1", 12946) + nArray2[0] + IlI.II10("\u32be\u3291", 12946) + nArray2[1] + IlI.II10("\u32be\u3291", 12946) + nArray2[2] + IlI.II10("\u32be\u3291", 12946) + nArray2[3] + IlI.II10("\u32be\u3291", 12946) + nArray2[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u2c42\u32d2\u32f0\u329b\u3367\u33c7\u3339\u3351\u33aa\u33f2", 12946) + nArray3[0] + IlI.II10("\u32be\u3291", 12946) + nArray3[1] + IlI.II10("\u32be\u3291", 12946) + nArray3[2] + IlI.II10("\u32be\u3291", 12946) + nArray3[3] + IlI.II10("\u32be\u3291", 12946) + nArray3[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32d5\u32de\u32b8\u328e\u3360\u3317\u336c\u3330", 12946) + nArray4[0] + IlI.II10("\u32be\u3291", 12946) + nArray4[1] + IlI.II10("\u32be\u3291", 12946) + nArray4[2] + IlI.II10("\u32be\u3291", 12946) + nArray4[3] + IlI.II10("\u32be\u3291", 12946) + nArray4[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
                IO1I.var_IO1I_II1I.II(iO1l, IlI.II10("\u32dc\u32d0\u32b9\u3283\u3334\u330d\u3317", 12946) + nArray5[0] + IlI.II10("\u32be\u3291", 12946) + nArray5[1] + IlI.II10("\u32be\u3291", 12946) + nArray5[2] + IlI.II10("\u32be\u3291", 12946) + nArray5[3] + IlI.II10("\u32be\u3291", 12946) + nArray5[4] + IlI.II10("\u32cf", 12946), n, n4 += n3, 0, IO1I.IIlI);
            }
        }
    }

    private static void II(I101[] i101Array, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5) {
        if (Ilol.Ilol_II().III0().equals(IlI.II10("\u32c6\u33a1", 12946))) {
            for (int i = 0; i < i101Array.length; ++i) {
                I101 i101 = i101Array[i];
                try {
                    if (i101 == null || i101.var_I100_arr_III[1] == null || i101.var_I100_arr_III[2] == null || i101.var_I1o_II.II0l > 4) continue;
                    if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335d\u33d9\u3322\u330c\u337e\u33c2\u33bd", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335d\u33d9\u3322\u330c\u337e\u33c2\u33bd", 12946))) {
                        if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335a\u3345\u2deb\u3305\u33aa\u33ff\u32a1\u33c7\u3452\u3457\u2aa1", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335a\u3345\u2deb\u3305\u33aa\u33ff\u32a1\u33c7\u3452\u3457\u2aa1", 12946))) {
                            if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335a\u3345\u33a6\u3305", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335a\u3345\u33a6\u3305", 12946))) {
                                if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3349\u3342\u3324\u330a\u33e4", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3349\u3342\u3324\u330a\u33e4", 12946))) {
                                    if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3345\u3344\u333e\u3302\u33e4", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3345\u3344\u333e\u3302\u33e4", 12946))) continue;
                                    IlI.II(nArray5, i101);
                                    continue;
                                }
                                IlI.II(nArray4, i101);
                                continue;
                            }
                            IlI.II(nArray3, i101);
                            continue;
                        }
                        IlI.II(nArray2, i101);
                        continue;
                    }
                    IlI.II(nArray, i101);
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        } else if (Ilol.Ilol_II().III0().equals(IlI.II10("\u32ca\u32f5", 12946))) {
            for (int i = 0; i < i101Array.length; ++i) {
                I101 i101 = i101Array[i];
                try {
                    if (i101 == null || i101.var_I100_arr_III[1] == null || i101.var_I100_arr_III[2] == null || i101.var_I1o_II.II0l > 4) continue;
                    if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3345\u334c\u3327\u330a\u33f8\u33c6\u33bc", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3345\u334c\u3327\u330a\u33f8\u33c6\u33bc", 12946))) {
                        if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u334d\u334c\u336c\u327b\u3367\u33ca", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u334d\u334c\u336c\u327b\u3367\u33ca", 12946))) {
                            if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u334d\u334c\u325d\u3302\u33e9\u3389\u3385", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u334d\u334c\u325d\u3302\u33e9\u3389\u3385", 12946))) {
                                if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3349\u3342\u3324\u330a\u33e4", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3349\u3342\u3324\u330a\u33e4", 12946))) {
                                    if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3340\u334c\u333c\u331b\u33eb", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3340\u334c\u333c\u331b\u33eb", 12946))) continue;
                                    IlI.II(nArray5, i101);
                                    continue;
                                }
                                IlI.II(nArray4, i101);
                                continue;
                            }
                            IlI.II(nArray3, i101);
                            continue;
                        }
                        IlI.II(nArray2, i101);
                        continue;
                    }
                    IlI.II(nArray, i101);
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        } else {
            for (int i = 0; i < i101Array.length; ++i) {
                I101 i101 = i101Array[i];
                try {
                    if (i101 == null || i101.var_I100_arr_III[1] == null || i101.var_I100_arr_III[2] == null || i101.var_I1o_II.II0l > 4) continue;
                    if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335e\u3344\u332f\u3304\u33e6\u33c6", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335e\u3344\u332f\u3304\u33e6\u33c6", 12946))) {
                        if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335e\u3344\u3327\u3300\u33e5\u33db\u33a7\u33c7\u3442\u3444\u342d\u340e\u34e3\u34ce", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u335e\u3344\u3327\u3300\u33e5\u33db\u33a7\u33c7\u3442\u3444\u342d\u340e\u34e3\u34ce", 12946))) {
                            if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u2dde\u334e\u336c\u331f\u33e3\u3343\u33bd", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u2dde\u334e\u336c\u331f\u33e3\u3343\u33bd", 12946))) {
                                if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3349\u3342\u3324\u330a\u33e4", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3349\u3342\u3324\u330a\u33e4", 12946))) {
                                    if (!i101.var_I100_arr_III[1].II.II1o.startsWith(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u3340\u334c\u3325\u3307\u33aa\u33ca\u33a0\u338e\u2ab9\u344b\u3464\u3401\u34eb\u34cf\u34a8", 12946)) && !i101.var_I100_arr_III[2].II.II1o.startsWith(IlI.II10("\u32dc\u32d0\u32b9\u3283\u332e\u334e\u3324\u3302\u2d35\u33c7\u33e8\u3385\u346f\u344b\u342c", 12946))) continue;
                                    IlI.II(nArray5, i101);
                                    continue;
                                }
                                IlI.II(nArray4, i101);
                                continue;
                            }
                            IlI.II(nArray3, i101);
                            continue;
                        }
                        IlI.II(nArray2, i101);
                        continue;
                    }
                    IlI.II(nArray, i101);
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    private static void II(int[] nArray, I101 i101) {
        byte by = i101.var_I1o_II.II0l;
        nArray[by] = nArray[by] + 1;
    }

    private int II(int n, int n2) {
        return n2 == 0 ? 0 : n * 100 / n2;
    }

    public int IIl1() {
        ++this.I1II;
        long l = IO10.IIII();
        long l2 = l - this.IIo;
        if (l2 >= 500L) {
            this.I1Il = (int)((double)this.I1II * 1000.0 / (double)l2 + 0.5);
            this.I1II = 0;
            this.IIo = l;
        }
        return this.I1Il;
    }

    private void II(IO1l iO1l, Ilol ilol) {
        if (this.Il_o) {
            String string = ilol.IIO1 + IlI.II10("\u32b2\u32ea", 12946) + I_1l.IIIl(ilol.IOl_) + IlI.II10("\u32bd", 12946) + I_1l.IIIl(ilol.IOlo) + IlI.II10("\u32cf", 12946);
            IO1I.IIl0.II(iO1l, string, II.var_int_IIl / 2, 43, 2, IO1I.IIlI);
            int n = 60;
            int n2 = 10;
            if (ilol.I1_O) {
                IO1I.IIl0.II(iO1l, IlI.II10("\u32d0\u2c7a\u32f0\u32bb\u334a\u3365\u331f\u3351\u33aa", 12946) + ilol.IOO + IlI.II10("\u32b2\u32d6\u32b9\u320d\u3377", 12946), II.var_int_IIl / 2, n, 2, IO1I.IIlI);
                n += n2;
            }
            if (ilol.IOIl == 3) {
                IO1I.IIl0.II(iO1l, IlI.II10("\u3382\u32d0\u32be\u3288\u332e\u3346\u3325\u3305\u33e2\u3389\u33ab\u3313\u3468\u3442", 12946), II.var_int_IIl / 2, n, 2, IO1I.IIlI);
                n += n2;
            }
            if (ilol.I_I0) {
                IO1I.IIl0.II(iO1l, IlI.II10("\u3382\u32d0\u32be\u3288\u332e\u3346\u3324\u3302\u3360\u33c7\u33e8\u3389\u3505\u344b\u3423\u3443\u34ee\u3511\u2a23\u34b1\u3499", 12946), II.var_int_IIl / 2, n, 2, IO1I.IIlI);
                n += n2;
            }
            if (ilol.var_byte_IIlo == 1) {
                IO1I.IIl0.II(iO1l, IlI.II10("\u3382\u32d0\u32be\u3288\u332e\u334f\u3325\u2dd4\u33e4\u3389\u33a3\u338f\u2acf", 12946), II.var_int_IIl / 2, n, 2, IO1I.IIlI);
                n += n2;
            }
            if (ilol.I_lO) {
                IO1I.IIl0.II(iO1l, IlI.II10("\u32d0\u2c7a\u32f0\u329b\u3366\u33d9\u3325\u334b\u33e7\u33c0\u3322\u3389", 12946), II.var_int_IIl / 2, n, 2, IO1I.IIlI);
                n += n2;
            }
            if (ilol.I0OI != 0) {
                IO1I.IIl0.II(iO1l, IlI.II10("\u32d0\u2c7a\u32f0\u329b\u337c\u33de\u3325", 12946), II.var_int_IIl / 2, n, 2, IO1I.IIlI);
                n += n2;
            }
            if (ilol.I_l1) {
                IO1I.IIl0.II(iO1l, IlI.II10("\u32d0\u2c7a\u32f0\u328c\u3366\u3342\u33ad\u3305\u33ed", 12946), II.var_int_IIl / 2, n, 2, IO1I.IIlI);
                int n3 = n + n2;
            }
        }
    }

    public void II(IO1l iO1l, Ilol ilol, int n, int n2) {
        if (ilol.var_byte_IIl != 0 && ilol.var_byte_IIl != -1) {
            int n3 = II.var_int_IIl - 21;
            I_oo.IIII(iO1l, ilol.IO0_, n3, n, 0, 0);
        }
    }

    public boolean III0(int n) {
        if (II.II_ == Il__.II().I1__) {
            IIO0.III().Illl = !IIO0.III().Illl;
            I1_I.var_I1Oo_II.IIII(IlI.II10("\u32c6\u2c40\u32f0\u33ff\u33ef\u3343\u3324\u3351\u33aa", 12946) + (IIO0.III().Illl ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)), 0);
            return true;
        }
        if (II.II_ == Il__.II().I1OO) {
            Il0.IOI_();
            return true;
        }
        if (II.II_ == Il__.II().I1Oo) {
            Il0.IOI0();
            return true;
        }
        if (II.II_ == Il__.II().I1O0) {
            Il0.IOIO();
            return true;
        }
        if (II.II_ == Il__.II().I1oI) {
            this.I_1l();
            II.var_I_1o_II.I__0();
            return true;
        }
        if (II.II_ == Il__.II().I10) {
            I_0_.II().IoOI();
            return true;
        }
        if (II.II_ == Il__.II().I10O) {
            Il_1.IIIl(521);
            return true;
        }
        if (II.II_ == Il__.II().IIl_) {
            II.var_I_1o_II.IoI();
            II.var_I_1o_II.I__0();
            return true;
        }
        if (II.II_ == Il__.II().I1o1) {
            if (Ilol.Ilol_II().var_byte_IIl == 0) {
                I_0_.II().IIII((byte)1, (byte)8);
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u3382\u3252\u32f0\u3288\u2de3\u3344\u336c\u3312\u3360\u33dc\u33e8\u3384\u2aa1\u3450\u3464\u3401\u2a2f\u34d5\u34e0\u34bc\u2a23\u353d\u342d\u353e\u3514", 12946), 0);
            } else {
                I_0_.II().IIII((byte)1, (byte)0);
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u3382\u3252\u32f0\u3288\u2de3\u3344\u336c\u3312\u3360\u33dc\u33e8\u3384\u2aa1\u3450\u3464\u3417\u2a2d\u34d5\u34e0\u34bc\u2a23", 12946), 0);
            }
            return true;
        }
        if (II.II_ == Il__.II().I1O_) {
            IlI.III().I_l0();
            return true;
        }
        if (II.II_ == Il__.II().I1Ol) {
            if (Ilol.Ilol_II().var_Ilol_IIIl == null) {
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u32c4\u32c4\u32b9\u32cf\u3342\u33df\u3322\u330c\u33aa\u33ea\u33a0\u2d2a\u3468\u3405\u3409\u2a86\u34e1\u3481\u3494\u34b6\u3414\u3568\u351d", 12946), 0);
            } else {
                I_0_.II().II((byte)0, Ilol.Ilol_II().var_Ilol_IIIl.IOI_, (byte)-1, -1);
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u3382\u3252\u32f0\u32a8\u2de3\u3344\u336c\u3327\u2d57\u33c0\u33e8\u33aa\u2adb\u344c\u3464\u3424\u34eb\u34c0\u34af\u34ff\u34ba\u2bd6\u355f\u3533\u355a\u3489\u2b07\u35b9\u35cc\u3635", 12946) + Ilol.Ilol_II().var_Ilol_IIIl.IIO1, 0);
            }
            return true;
        }
        if (II.II_ == Il__.II().I1OI) {
            byte by = Il_1.II(new short[]{1884, 921, 454});
            if (by == -1) {
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u32d9\u32d9\u3224\u3281\u3369\u330d\u3338\u3387\u33e7\u3389\u33bc\u338f\u2aa3\u345c\u3464\u3401\u3476\u34cf\u34a7\u34ff\u348a\u357c\u3555", 12946), 0);
            } else {
                I_0_.II().II((byte)0, (byte)1, by, (short)-1);
            }
            return true;
        }
        if (II.II_ == Il__.II().I1_O) {
            I_0_.II().III((byte)0, -1);
            return true;
        }
        if (II.II_ == Il__.II().I1_0) {
            byte by = Il_1.II(new short[]{194, 193});
            if (by == -1) {
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u32d9\u32d9\u3224\u3281\u3369\u330d\u3338\u3387\u33e7\u3389\u33bc\u338f\u2aa3\u345c\u3464\u3400\u34e3\u34d1\u34b3\u34aa\u3492\u3578", 12946), 0);
            } else {
                I_0_.II().II((byte)0, (byte)1, by, (short)-1);
            }
            return true;
        }
        return true;
    }

    public void I_lO() {
        if (this.Il_o) {
            int n = 150;
            int n2 = 157;
            int n3 = 9;
            int n4 = II.var_int_IIl - n2;
            int n5 = this.III_.size();
            for (int i = 0; i < n5; ++i) {
                Ilol ilol = (Ilol)this.III_.elementAt(i);
                if (ilol == null) continue;
                if (II.II(n4, n + 2, n2 - 5, n3)) {
                    Ilol ilol2 = Ilol.Ilol_II();
                    if (ilol2.var_Ilol_IIIl != null && ilol2.var_Ilol_IIIl == ilol) {
                        Il_0.III1(ilol.I_o_, ilol.I_oO);
                        ilol2.var_I_ll_II = null;
                    } else {
                        ilol2.var_I_I__IIII = null;
                        ilol2.var_I_11_II = null;
                        ilol2.var_I10__II = null;
                        ilol2.var_Ilol_IIIl = ilol;
                    }
                    IO.II();
                    II.IIlI();
                    break;
                }
                n += n3 + 2;
            }
        }
    }

    public void IIll(IO1l iO1l) {
        if (this.Il_o) {
            int n = 150;
            int n2 = 9;
            int n3 = II.var_int_IIl - 5;
            int n4 = this.III_.size();
            Ilol ilol = Ilol.Ilol_II();
            Ilol ilol2 = ilol.var_Ilol_IIIl;
            int n5 = ilol.I_o_ - I1_I.Io1;
            int n6 = ilol.I_oO - I1_I.Io1I;
            boolean bl = Il_1.II1o();
            for (int i = 0; i < n4; ++i) {
                Ilol ilol3 = (Ilol)this.III_.elementAt(i);
                if (ilol3 == null || ilol3.IIO1 == null || ilol3.IIO1.equals("") || ilol3.I_ || ilol3.I_I || ilol3.IIO1.startsWith(IlI.II10("\u32b1", 12946)) || ilol3.IIO1.startsWith(IlI.II10("\u32b6", 12946)) || ilol3.IIO1.equals(IlI.II10("\u32c6\u32c3\u2c1d\u3281\u3369\u330d\u3338\u338b\u33e3", 12946))) continue;
                boolean bl2 = Il_1.II(ilol3);
                boolean bl3 = ilol3.var_byte_IIl != 0 && ilol3.var_byte_IIl != -1;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(i + 1).append(IlI.II10("\u32bc\u3291", 12946)).append(ilol3.IIO1).append(IlI.II10("\u32b2\u32ea", 12946)).append(I_1l.IIIl(ilol3.IOl_));
                if (!bl2) {
                    stringBuffer.append(IlI.II10("\u32b2\u329c\u32f0", 12946)).append(ilol3.III0());
                }
                if (bl3) {
                    stringBuffer.append(IlI.II10("\u32b2\u3291\u32f0\u32cf\u332e", 12946));
                }
                stringBuffer.append(IlI.II10("\u32cf", 12946));
                String string = stringBuffer.toString();
                int n7 = ilol3.I_o_ - I1_I.Io1;
                int n8 = ilol3.I_oO - I1_I.Io1I;
                if (ilol2 != null && ilol2.IIO1.equals(ilol3.IIO1)) {
                    iO1l.Illl(0xD80000);
                    iO1l.IIII(n5, n6, n7, n8);
                    IO1I.IIl0.II(iO1l, string, n3, n, 1, IO1I.IIlI);
                    if (bl3) {
                        this.II(iO1l, ilol3, n, i);
                    }
                } else if (bl2) {
                    iO1l.Illl(16383818);
                    iO1l.IIII(n5, n6, n7, n8);
                    IO1I.IIl_.II(iO1l, string, n3, n, 1, IO1I.IIlI);
                    if (bl3) {
                        this.II(iO1l, ilol3, n, i);
                    }
                } else if (ilol3.IOlo > 100000000 && ilol3.IOl_ > 0 && bl) {
                    IO1I.IIl0.II(iO1l, string, n3, n, 1);
                    if (bl3) {
                        this.II(iO1l, ilol3, n, i);
                    }
                } else {
                    IO1I.var_IO1I_II1I.II(iO1l, string, n3, n, 1, IO1I.IIlI);
                    if (bl3) {
                        this.II(iO1l, ilol3, n, i);
                    }
                }
                n += n2 + 2;
            }
        }
    }

    public void I_l0() {
        if (!(IIoo.II1l() || Ilol.Ilol_II().var_Ilol_IIIl == null && Ilol.Ilol_II().var_I_I__IIII == null)) {
            boolean bl = this.IlOI = !this.IlOI;
            if (this.IlOI) {
                this.var_Ilol_II = Ilol.Ilol_II().var_Ilol_IIIl;
                this.III = Ilol.Ilol_II().var_I_I__IIII;
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u32d9\u32d9\u3223\u328e\u332e\u3340\u2da9\u3308\u33aa\u33dd\u33a1\u330d\u3473\u341f\u3464\u3421\u2a2f\u34d5", 12946), 0);
            } else {
                this.var_Ilol_II = null;
                this.III = null;
                Ilol.Ilol_II().var_Ilol_IIIl = null;
                Ilol.Ilol_II().var_I_I__IIII = null;
                Ilol.Ilol_II().var_I_11_II = null;
                Ilol.Ilol_II().var_I10__II = null;
                I1_I.var_I1Oo_II.IIII(IlI.II10("\u32d9\u32d9\u3223\u328e\u332e\u3340\u2da9\u3308\u33aa\u33dd\u33a1\u330d\u3473\u341f\u3464\u3437\u2a2d\u34d5", 12946), 0);
            }
        }
    }

    private void I_lo() {
        Ilol ilol;
        if (this.IlOI && (ilol = Ilol.Ilol_II()) != null) {
            I1_O i1_O;
            int n;
            boolean bl;
            if (this.var_Ilol_II != null) {
                bl = false;
                for (n = 0; n < I1_I.var_I_lO_II_O.size(); ++n) {
                    i1_O = (Ilol)I1_I.var_I_lO_II_O.elementAt(n);
                    if (i1_O != this.var_Ilol_II || i1_O.IOl_ <= 0 || i1_O.I_I_) continue;
                    bl = true;
                    break;
                }
                if (bl) {
                    Ilol.Ilol_II().var_Ilol_IIIl = this.var_Ilol_II;
                    Ilol.Ilol_II().var_I_I__IIII = null;
                    Ilol.Ilol_II().var_I_11_II = null;
                    Ilol.Ilol_II().var_I10__II = null;
                    return;
                }
            }
            if (this.III != null) {
                bl = false;
                for (n = 0; n < I1_I.var_I_lO_IIO.size(); ++n) {
                    i1_O = (I_I_)I1_I.var_I_lO_IIO.elementAt(n);
                    if (i1_O != this.III || ((I_I_)i1_O).llIl <= 0) continue;
                    bl = true;
                    break;
                }
                if (bl) {
                    Ilol.Ilol_II().var_I_I__IIII = this.III;
                    Ilol.Ilol_II().var_Ilol_IIIl = null;
                    Ilol.Ilol_II().var_I_11_II = null;
                    Ilol.Ilol_II().var_I10__II = null;
                    return;
                }
            }
            this.IlOI = false;
            this.var_Ilol_II = null;
            this.III = null;
            I1_I.var_I1Oo_II.IIII(IlI.II10("\u32d9\u32d9\u3223\u328e\u332e\u3340\u2da9\u3308\u33aa\u33dd\u33a1\u330d\u3473\u341f\u3464\u3437\u2a2d\u34d5", 12946), 0);
        }
    }

    public void I_1() {
        Il11.I_01();
        int n = II.var_int_IIl - I1_I.IIo_.getWidth();
        int n2 = II.var_int_IIlI - 125;
        if (II.II(n, n2, I1_I.IIo_.getWidth(), I1_I.IIo_.getHeight()) && II.var_boolean_III0 && II.var_boolean_IIIo) {
            this.I_1l();
            II.var_I_1o_II.I__0();
            II.IIlI();
        }
    }

    private void I_1I() {
        if (I1_I.var_I_lO_II_O != null) {
            for (int i = I1_I.var_I_lO_II_O.size() - 1; i >= 0; --i) {
                Ilol ilol;
                Object e = I1_I.var_I_lO_II_O.elementAt(i);
                if (!(e instanceof Ilol) || (ilol = (Ilol)e) == null || ilol == Ilol.Ilol_II() || ilol.IOI_ == Ilol.Ilol_II().IOI_ * -1 || ilol.I0Il == 31) continue;
                boolean bl = false;
                if (IIol.IIIO.IIlO() > 0) {
                    bl = !IIol.IIIl(ilol.IIO1);
                } else if (ilol.var_byte_III0 != 5) {
                    bl = true;
                }
                if (!bl) continue;
                I1_I.var_I_lO_II_O.removeElementAt(i);
            }
        }
    }

    public void I_1l() {
        Il1_.II().Il1__III().II(IlI.II10("\u32df\u32d0\u32b9\u3281\u332e\u3360\u3323\u330f", 12946)).II(IlI.II10("\u32d6\u2c7a\u32b3\u3287\u332e\u334e\u3324\u331e\u33f3\u2d6a\u33a6", 12946), "", 1, null).II(IlI.II10("\u32d0\u32de\u32a3\u329c", 12946), "", 2, null).II(IlI.II10("\u32d9\u2c48\u32f0\u3281\u320d\u3343\u332b", 12946), "", 3, null).II(IlI.II10("\u3382\u2c1c\u32a5\u32cf\u337a\u3345\u2deb\u3305", 12946), "", 4, null).II(IlI.II10("\u32c6\u2c40\u32f0\u3281\u3366\u2d9a\u3338", 12946), "", 5, null).II(IlI.II10("\u32c6\u3251\u32be\u32cf\u337d\u33cc\u3338", 12946), "", 6, null).II(IlI.II10("\u32d1\u32d9\u32b1\u329b", 12946), "", 7, null).II(IlI.II10("\u32c6\u32d8\u2c11\u3282\u332e\u3343\u324f\u3305\u33ed", 12946), "", 8, null).II(IlI.II10("\u32d1\u3251\u32b9\u32cf\u321f\u2d9a\u3338", 12946), "", 9, null).II(IlI.II10("\u32c6\u32d9\u323a\u3282", 12946), "", 10, null).Il1__II(this).I__0();
    }

    public void I_11() {
        Il1_.II().Il1__III().II(IlI.II10("\u32df\u32d4\u32be\u329a\u332e\u337d\u333e\u3304", 12946)).II(IlI.II10("\u32de\u32de\u32b7\u3286\u3360", 12946), "", 20, null).II(IlI.II10("\u32c7\u32c1\u32f0\u33fe\u2dc9", 12946), "", 21, null).II(IlI.II10("\u32c6\u2c40\u32f0\u329c\u33ef\u3359", 12946), "", 22, null).II(IlI.II10("\u32d3\u32c4\u32a4\u3280\u332e\u3344\u3338\u330e\u33e7", 12946), "", 23, null).II(IlI.II10("\u32c1\u32fa\u3298", 12946), "", 24, null).II(IlI.II10("\u32c1\u32d4\u32a4\u32cf\u321f\u2dfe", 12946), "", 25, null).II(IlI.II10("\u32d3\u32c4\u32a4\u3280\u332e\u3343\u3329\u331c\u33cb\u33ca\u33ab\u3388\u3473\u344b\u3430", 12946), IIo.IIO_ ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 26, null).II(IlI.II10("\u32c3\u32c4\u32b1\u3296\u332e\u3341\u2ded\u3302", 12946), "", 300, null).Il1__II(this).I__0();
    }

    public void I_1_() {
        Il1_.II().Il1__III().II(IlI.II10("\u32c1\u32d4\u32a4\u329b\u3367\u3343\u332b", 12946)).II(IlI.II10("\u32c6\u2c60\u32b3\u32cf\u321f\u2df4\u336c\u330c\u33eb\u33c4\u33ad", 12946), IlI.II10("\u32c9", 12946) + this.I1I_ + IlI.II10("\u32ff\u32c2\u328d", 12946), 30, null).II(IlI.II10("\u32c6\u2c60\u32b3\u32cf\u321f\u2df4\u336c\u3308\u33e2\u2d08\u33b1", 12946), IlI.II10("\u32c9", 12946) + this.I1IO + IlI.II10("\u32e1\u32ec", 12946), 31, null).II(IlI.II10("\u32d6\u32d4\u32bc\u328e\u3377\u330d\u3314\u3306\u33eb\u33d9", 12946), IlI.II10("\u32c9", 12946) + IlO_.I__O + IlI.II10("\u32ff\u32c2\u328d", 12946), 32, null).II(IlI.II10("\u32d6\u32d4\u32bc\u328e\u3377\u330d\u3339\u3318\u33ef\u3389\u33ab\u3386\u3476\u3456\u3431\u340f\u34e7", 12946), IlI.II10("\u32c9", 12946) + IlO_.IllI + IlI.II10("\u32ff\u32c2\u328d", 12946), 33, null).II(IlI.II10("\u32d5\u32d8\u2c73\u3286\u332e\u336e\u332d\u331b\u33e9\u33c1\u33a9", 12946), this.II_1 ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 34, null).II(IlI.II10("\u3382\u2c62\u32f0\u3287\u3361\u2d8c\u336c\u331f\u33e2\u2d0c\u33b8", 12946), IIoo.II1l() ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 35, null).II(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u32d9\u2d20\u3426\u3451\u2aa9", 12946), this.IlOl ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 36, null).II(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u33bb\u3257\u3426\u3455\u342c\u2a86", 12946), this.IlO1 ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 37, null).II(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u332e\u338a\u33e5\u3389\u33aa\u3388\u3475\u3456", 12946), IIol.Il_I ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 38, null).II(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u33b8\u338b\u3467\u345c\u3421\u3411", 12946), this.Il_o ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 39, null).II(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u339b\u33ac\u344e", 12946), this.IlO ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 40, null).II(IlI.II10("\u32d1\u32d0\u32a0\u329c\u337b\u3341\u3329\u334b\u33e8\u33c8\u33b1", 12946), IlO_.Ilo_ ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 41, null).II(IlI.II10("\u3390\u32df\u32f0\u33fe\u33f7\u330d\u332b\u338b", 12946), IlO_.Ilol ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 42, null).II(IlI.II10("\u32ca\u32de\u3231\u32cf\u3360\u334a\u32fc\u2db6\u33e3", 12946), this.IlO_ ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946), 43, null).II(IlI.II10("\u32d9\u32d4\u32a9\u32cf\u334d\u334c\u333c\u3308\u33e2\u33c8", 12946), "", 44, null).II(IlI.II10("\u32c3\u32c4\u32b1\u3296\u332e\u3341\u2ded\u3302", 12946), "", 99, null).Il1__II(this).I__0();
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                IlO_.I_oo();
                break;
            }
            case 2: {
                III_.III().II_I();
                break;
            }
            case 3: {
                IIO0.III().II_I();
                break;
            }
            case 4: {
                II1I.III().II_I();
                break;
            }
            case 5: {
                II_O.III().II_I();
                break;
            }
            case 6: {
                II0l.II0l_III().II_I();
                break;
            }
            case 7: {
                IIl1.III().II_I();
                break;
            }
            case 8: {
                IIO.III().II_I();
                break;
            }
            case 9: {
                this.I_1_();
                break;
            }
            case 10: {
                this.I_11();
                break;
            }
            case 20: {
                IIlo.III().II_I();
                break;
            }
            case 21: {
                II10.III().II_I();
                break;
            }
            case 22: {
                this.IlOO = true;
                this.IIIl(IlI.II10("\u32d9\u32d8\u32bc\u3283\u332e\u3359\u2def\u3305\u33aa\u33dd\u33a0\u3305\u3468", 12946));
                break;
            }
            case 23: {
                IIlO.III().II_I();
                break;
            }
            case 24: {
                IIOl.III().II_I();
                break;
            }
            case 25: {
                Il1I.III().II_I();
                break;
            }
            case 26: {
                IIo.IIO_ = !IIo.IIO_;
                this.IIIl(IlI.II10("\u32d3\u32c4\u32a4\u3280\u332e\u3343\u3329\u331c\u33cb\u33ca\u33ab\u3388\u3473\u344b\u3430\u3459\u34a2", 12946) + (IIo.IIO_ ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.I_11();
                break;
            }
            case 30: {
                this.III(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3359\u2d9d\u3308\u33aa\u32b8\u2d11\u33c7\u3461\u3444\u3429\u3406\u34a2\u3489\u34f5\u34f2\u34cf\u352d\u350c\u3536\u3509\u35b0", 12946), IlI.II10("\u32d5\u32d0\u32bd\u328a\u332e\u337e\u333c\u330e\u33ef\u33cd", 12946));
                break;
            }
            case 31: {
                this.III(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3359\u2d9d\u3308\u33aa\u32b8\u2d11\u33c7\u3465\u344d\u2ae5\u341a\u34a2\u3489\u34f1\u34f2\u34cc\u352d\u3515", 12946), IlI.II10("\u32df\u32de\u32a6\u328a\u332e\u337e\u333c\u330e\u33ef\u33cd", 12946));
                break;
            }
            case 32: {
                this.III(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3349\u3329\u3307\u33eb\u33d0\u33e8\u33bf\u346b\u3444\u3434\u3443\u34aa\u3494\u34f0\u34ef\u34d3\u352e\u350c\u356b\u354a\u35f4\u35cb\u35fe", 12946), IlI.II10("\u32d6\u32d4\u32bc\u328e\u3377\u330d\u3314\u3306\u33eb\u33d9", 12946));
                break;
            }
            case 33: {
                this.III(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3349\u3329\u3307\u33eb\u33d0\u33e8\u3384\u3467\u3455\u3437\u3416\u34ee\u34c4\u34e0\u34f7\u34cb\u352d\u350c\u3576\u3549\u35a9\u3588\u35e7\u359b\u3666\u361d", 12946), IlI.II10("\u32d6\u32d4\u32bc\u328e\u3377\u330d\u330f\u330a\u33fa\u33da\u33bd\u338b\u3463", 12946));
                break;
            }
            case 34: {
                this.II_1 = !this.II_1;
                this.IIIl(IlI.II10("\u32d5\u32d8\u2c73\u3286\u332e\u336e\u332d\u331b\u33e9\u33c1\u33a9\u33dd\u3426", 12946) + (this.II_1 ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 35: {
                IIoo.IIIl(!IIoo.II1l());
                this.IIIl(IlI.II10("\u3382\u2c62\u32f0\u3287\u3361\u2d8c\u336c\u331f\u33e2\u2d0c\u33b8\u33dd\u3426", 12946) + (IIoo.II1l() ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 36: {
                this.IlOl = !this.IlOl;
                this.IIIl(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u32d9\u2d20\u3426\u3451\u2aa9\u3459\u34a2", 12946) + (this.IlOl ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 37: {
                this.IlO1 = !this.IlO1;
                this.IIIl(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u33bb\u3257\u3426\u3455\u342c\u2a86\u34b8\u3481", 12946) + (this.IlO1 ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 38: {
                IIol.Il_I = !IIol.Il_I;
                this.IIIl(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u332e\u338a\u33e5\u3389\u33aa\u3388\u3475\u3456\u347e\u3443", 12946) + (IIol.Il_I ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 39: {
                this.Il_o = !this.Il_o;
                this.IIIl(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u33b8\u338b\u3467\u345c\u3421\u3411\u34b8\u3481", 12946) + (this.Il_o ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 40: {
                this.IlO = !this.IlO;
                this.IIIl(IlI.II10("\u32c6\u32d9\u3224\u3281\u3369\u330d\u3338\u3302\u33e4\u3389\u339b\u33ac\u344e\u341f\u3464", 12946) + (this.IlO ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 41: {
                IlO_.Ilo_ = !IlO_.Ilo_;
                this.IIIl(IlI.II10("\u32d1\u32d0\u32a0\u329c\u337b\u3341\u3329\u334b\u33e8\u33c8\u33b1\u33dd\u3426", 12946) + (IlO_.Ilo_ ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 42: {
                IlO_.Ilol = !IlO_.Ilol;
                this.IIIl(IlI.II10("\u3390\u32df\u32f0\u33fe\u33f7\u330d\u332b\u338b\u33b0\u3389", 12946) + (IlO_.Ilol ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 43: {
                this.IlO_ = !this.IlO_;
                this.IIIl(IlI.II10("\u32ca\u32de\u3231\u32cf\u3360\u334a\u32fc\u2db6\u33e3\u3393\u33e8", 12946) + (this.IlO_ ? IlI.II10("\u32d0\u2c1c\u32a4", 12946) : IlI.II10("\u32c6\u2c1e\u32a4", 12946)));
                this.IIOl();
                this.I_1_();
                break;
            }
            case 44: {
                var_Il_II.I_lI();
                break;
            }
            case 99: {
                this.I_1l();
                break;
            }
            case 300: {
                this.I_1l();
            }
        }
    }

    @Override
    public void II(String string, String string2) {
        String string3 = Ilo_.II().var_IOI0_II.java_lang_String_IIl1();
        if (string3 != null && !string3.equals("") && string != null && !string.equals("")) {
            String string4 = Ilo_.II().II00;
            if (string4.equals(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3359\u2d9d\u3308\u33aa\u32b8\u2d11\u33c7\u3461\u3444\u3429\u3406\u34a2\u3489\u34f5\u34f2\u34cf\u352d\u350c\u3536\u3509\u35b0", 12946))) {
                this.II1(string3);
            } else if (string4.equals(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3359\u2d9d\u3308\u33aa\u32b8\u2d11\u33c7\u3465\u344d\u2ae5\u341a\u34a2\u3489\u34f1\u34f2\u34cc\u352d\u3515", 12946))) {
                this.II1I(string3);
            } else if (string4.equals(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3349\u3329\u3307\u33eb\u33d0\u33e8\u33bf\u346b\u3444\u3434\u3443\u34aa\u3494\u34f0\u34ef\u34d3\u352e\u350c\u356b\u354a\u35f4\u35cb\u35fe", 12946))) {
                this.II1l(string3);
            } else if (string4.equals(IlI.II10("\u32dc\u32d9\u2c7d\u329f\u332e\u3349\u3329\u3307\u33eb\u33d0\u33e8\u3384\u3467\u3455\u3437\u3416\u34ee\u34c4\u34e0\u34f7\u34cb\u352d\u350c\u3576\u3549\u35a9\u3588\u35e7\u359b\u3666\u361d", 12946))) {
                this.II11(string3);
            }
        } else {
            this.Illl();
        }
    }

    @Override
    public void Illl() {
        Ilo_.II().I_10 = false;
        this.I_1_();
        II.var_I_1o_II.I__0();
    }

    private void II1(String string) {
        try {
            int n = Integer.parseInt(string);
            if (n < 5) {
                n = 5;
            }
            if (n > 100) {
                n = 100;
            }
            this.I1I_ = n;
            this.IIIl(IlI.II10("\u32c6\u2c60\u32b3\u32cf\u321f\u2df4\u336c\u330c\u33eb\u33c4\u33ad\u33dd\u3426", 12946) + this.I1I_ + IlI.II10("\u32ff\u32c2", 12946));
            this.IIOl();
        }
        catch (NumberFormatException numberFormatException) {
            this.IIIl(IlI.II10("\u32d5\u32d8\u3231\u32cf\u337a\u335f\u2d87\u334b\u33e1\u33c1\u333c\u3389\u3461\u3405\u342c\u2a80\u34f2\u3481\u34ac\u2a18", 12946));
        }
        this.Illl();
    }

    private void II1I(String string) {
        try {
            int n = Integer.parseInt(string);
            if (n < 1) {
                n = 1;
            }
            if (n > 20) {
                n = 20;
            }
            this.I1IO = n;
            this.IIIl(IlI.II10("\u32c6\u2c60\u32b3\u32cf\u321f\u2df4\u336c\u3308\u33e2\u2d08\u33b1\u33dd\u3426", 12946) + this.I1IO);
            this.IIOl();
        }
        catch (NumberFormatException numberFormatException) {
            this.IIIl(IlI.II10("\u32d5\u32d8\u3231\u32cf\u337a\u335f\u2d87\u334b\u33e1\u33c1\u333c\u3389\u3461\u3405\u342c\u2a80\u34f2\u3481\u34ac\u2a18", 12946));
        }
        this.Illl();
    }

    private void II1l(String string) {
        try {
            int n = Integer.parseInt(string);
            if (n < 500) {
                n = 500;
            }
            if (n > 3000) {
                n = 3000;
            }
            IlO_.I__O = n;
            this.IIIl(IlI.II10("\u32d6\u32d4\u32bc\u328e\u3377\u330d\u3314\u3306\u33eb\u33d9\u33f2\u33c7", 12946) + IlO_.I__O + IlI.II10("\u32ff\u32c2", 12946));
            this.IIOl();
        }
        catch (NumberFormatException numberFormatException) {
            this.IIIl(IlI.II10("\u32d5\u32d8\u3231\u32cf\u337a\u335f\u2d87\u334b\u33e1\u33c1\u333c\u3389\u3461\u3405\u342c\u2a80\u34f2\u3481\u34ac\u2a18", 12946));
        }
        this.Illl();
    }

    private void II11(String string) {
        try {
            long l = Long.parseLong(string);
            if (l < 500L) {
                l = 500L;
            }
            if (l > 5000L) {
                l = 5000L;
            }
            IlO_.IllI = l;
            this.IIIl(IlI.II10("\u32d6\u32d4\u32bc\u328e\u3377\u330d\u332f\u330a\u33fa\u33da\u33bd\u338b\u3463\u341f\u3464", 12946) + IlO_.IllI + IlI.II10("\u32ff\u32c2", 12946));
            this.IIOl();
        }
        catch (NumberFormatException numberFormatException) {
            this.IIIl(IlI.II10("\u32d5\u32d8\u3231\u32cf\u337a\u335f\u2d87\u334b\u33e1\u33c1\u333c\u3389\u3461\u3405\u342c\u2a80\u34f2\u3481\u34ac\u2a18", 12946));
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

    private void IIOI() {
        this.I1I_ = IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33cd\u33c8\u33a5\u3382\u3455\u3455\u3421\u3406\u34e6", 12946), 20);
        if (this.I1I_ < 5) {
            this.I1I_ = 5;
        }
        if (this.I1I_ > 100) {
            this.I1I_ = 100;
        }
        this.I1IO = IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33c7\u33c6\u33be\u3382\u3455\u3455\u3421\u3406\u34e6", 12946), 5);
        if (this.I1IO < 1) {
            this.I1IO = 1;
        }
        if (this.I1IO > 20) {
            this.I1IO = 20;
        }
        if ((IlO_.I__O = IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33ce\u33cc\u33a4\u3386\u347f\u347d\u3429\u3402\u34f2", 12946), 500)) < 500) {
            IlO_.I__O = 500;
        }
        if (IlO_.I__O > 3000) {
            IlO_.I__O = 3000;
        }
        if ((IlO_.IllI = IlIO.long_II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33ce\u33cc\u33a4\u3386\u347f\u3470\u3437\u3406\u34c1\u34c0\u34b0\u34ac\u348b\u3571\u3559", 12946), 500L)) < 500L) {
            IlO_.IllI = 500L;
        }
        if (IlO_.IllI > 5000L) {
            IlO_.IllI = 5000L;
        }
        this.I1I1 = IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33cd\u33db\u33a9\u3397\u346e\u344c\u3427\u3410", 12946), 5);
        if (this.I1I1 < 1) {
            this.I1I1 = 1;
        }
        if (this.I1I1 > 5) {
            this.I1I1 = 5;
        }
        this.IlOl = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33de\u33fd\u338c\u33b3", 12946), false);
        this.IlO1 = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33de\u33fd\u339b\u33b7", 12946), false);
        this.Il_o = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d9\u33c1\u33a7\u3390\u3445\u344d\u3425\u3411\u34f1\u34e8\u34ae\u3492\u349f\u356d", 12946), false);
        this.II_1 = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33c1\u33c1\u33a7\u3386", 12946), false);
        this.IlO_ = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d2\u33c6\u33a9\u33a9\u3461\u3450\u342b\u340a", 12946), false);
        IlO_.Ilo_ = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33df\u33da\u33ad\u33a9\u3469\u3457\u3429\u3402\u34ee\u34e2\u34a1\u34af\u348d\u3568\u3550\u353e", 12946), true);
        IlO_.Ilol = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33cf\u33c8\u33bc\u33a4\u346e\u344c\u3427\u3408\u34e7\u34cf", 12946), true);
        IIol.Il_I = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d9\u33c1\u33a7\u3390\u3444\u344a\u3437\u3410", 12946), false);
        this.IlO = IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d9\u33c1\u33a7\u3390\u3455\u346e\u340c", 12946), false);
    }

    private void IIOl() {
        IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33cd\u33c8\u33a5\u3382\u3455\u3455\u3421\u3406\u34e6", 12946), this.I1I_);
        IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33c7\u33c6\u33be\u3382\u3455\u3455\u3421\u3406\u34e6", 12946), this.I1IO);
        IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33ce\u33cc\u33a4\u3386\u347f\u347d\u3429\u3402\u34f2", 12946), IlO_.I__O);
        IlIO.void_II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33ce\u33cc\u33a4\u3386\u347f\u3470\u3437\u3406\u34c1\u34c0\u34b0\u34ac\u348b\u3571\u3559", 12946), IlO_.IllI);
        IlIO.III(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33cd\u33db\u33a9\u3397\u346e\u344c\u3427\u3410", 12946), this.I1I1);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33de\u33fd\u338c\u33b3", 12946), this.IlOl);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33de\u33fd\u339b\u33b7", 12946), this.IlO1);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d9\u33c1\u33a7\u3390\u3445\u344d\u3425\u3411\u34f1\u34e8\u34ae\u3492\u349f\u356d", 12946), this.Il_o);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33c1\u33c1\u33a7\u3386", 12946), this.II_1);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d2\u33c6\u33a9\u33a9\u3461\u3450\u342b\u340a", 12946), this.IlO_);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33df\u33da\u33ad\u33a9\u3469\u3457\u3429\u3402\u34ee\u34e2\u34a1\u34af\u348d\u3568\u3550\u353e", 12946), IlO_.Ilo_);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33cf\u33c8\u33bc\u33a4\u346e\u344c\u3427\u3408\u34e7\u34cf", 12946), IlO_.Ilol);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d9\u33c1\u33a7\u3390\u3444\u344a\u3437\u3410", 12946), IIol.Il_I);
        IlIO.II(IlI.II10("\u32df\u32d0\u32b9\u3281\u3343\u3342\u3328\u3345\u33d9\u33c1\u33a7\u3390\u3455\u346e\u340c", 12946), this.IlO);
    }

    static /* synthetic */ void II(IlI ilI) {
        ilI.I_1I();
    }

    static /* synthetic */ void III(IlI ilI) {
        ilI.I_l1();
    }

    static /* synthetic */ void IIII(IlI ilI) {
        ilI.I_ll();
    }

    static /* synthetic */ void IIIl(IlI ilI) {
        ilI.I_lo();
    }

    static {
        IIo1 = IO10.IIII();
    }

    private static /* synthetic */ String II10(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

