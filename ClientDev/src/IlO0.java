package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IlO0 {
    private static int[] IIOI;
    private static int[] IIOl;
    private static int[] IIO1;

    public static void II_O(int n) {
        Integer n2 = new Integer(IOlO.l1oI);
        if (!IlOO.III1.IIII(n2)) {
            return;
        }
        IlO1 ilO1 = null;
        IlO1 ilO12 = null;
        Il_l.II iI = (Il_l.II)IlOO.III1.II(n2);
        for (int i = 0; i < iI.IIlO(); ++i) {
            IlO1 ilO13 = (IlO1)iI.II(i);
            if (ilO13.I_1O != n) continue;
            if (ilO13.I_10 != -1 || ilO13.Il0O) {
                ilO1 = ilO13;
                break;
            }
            if (ilO13.I_10 != -1 || ilO13.I_1o != -1 || ilO13.Il0O) continue;
            ilO12 = ilO13;
        }
        if (ilO1 != null) {
            ilO1.I_ol();
        } else if (ilO12 != null) {
            ilO12.I_ol();
        }
    }

    public static void IOI_() {
        IlO0.II_0(0);
    }

    public static void IOIO() {
        IlO0.II_0(2);
    }

    public static void IOI0() {
        IlO0.II_0(1);
    }

    private static void II_0(int n) {
        if (IlOO.IIlO(IOlO.l1oI)) {
            IlO0.II_o(n);
            return;
        }
        IlO0.IOIo();
        int n2 = 0;
        int n3 = 0;
        switch (n) {
            case 0: {
                if (IIOI[0] != 0 && IIOI[1] != 0) {
                    n2 = IIOI[0];
                    n3 = IIOI[1];
                    break;
                }
                n2 = 60;
                n3 = IlO0.III1(60);
                break;
            }
            case 1: {
                if (IIO1[0] != 0 && IIO1[1] != 0) {
                    n2 = IIO1[0];
                    n3 = IIO1[1];
                    break;
                }
                n2 = IOlO.l100 - 60;
                n3 = IlO0.III1(IOlO.l100 - 60);
                break;
            }
            case 2: {
                if (IIOl[0] != 0 && IIOl[1] != 0) {
                    n2 = IIOl[0];
                    n3 = IIOl[1];
                    break;
                }
                n2 = IOlO.l100 / 2;
                n3 = IlO0.III1(IOlO.l100 / 2);
            }
        }
        Il_0.III1(n2, n3);
        if (IOlO.l1oI != 7 && IOlO.l1oI != 14 && IOlO.l1oI != 0) {
            I_0_.II().Io_o();
        } else {
            I_0_.II().IoO0();
        }
    }

    private static void IOIo() {
        IlO0.IOl();
        int n = IOlO.IlI_.size();
        if (n == 2) {
            IO1 iO1 = (IO1)IOlO.IlI_.elementAt(0);
            IO1 iO12 = (IO1)IOlO.IlI_.elementAt(1);
            if (iO1.IIoI < 60 && iO12.IIoI < 60 || iO1.II0o > IOlO.l100 - 60 && iO12.II0o > IOlO.l100 - 60) {
                IlO0.IIOI[0] = iO1.II0o + 15;
                IlO0.IIOI[1] = iO1.IIol;
                IlO0.IIO1[0] = iO12.IIoI - 15;
                IlO0.IIO1[1] = iO12.IIol;
            } else if (iO1.IIoI < iO12.IIoI) {
                IlO0.IIOI[0] = iO1.II0o + 15;
                IlO0.IIOI[1] = iO1.IIol;
                IlO0.IIO1[0] = iO12.IIoI - 15;
                IlO0.IIO1[1] = iO12.IIol;
            } else {
                IlO0.IIOI[0] = iO12.II0o + 15;
                IlO0.IIOI[1] = iO12.IIol;
                IlO0.IIO1[0] = iO1.IIoI - 15;
                IlO0.IIO1[1] = iO1.IIol;
            }
            return;
        }
        for (int i = 0; i < n; ++i) {
            IO1 iO1 = (IO1)IOlO.IlI_.elementAt(i);
            if (iO1.IIoI < 60) {
                IlO0.IIOI[0] = iO1.II0o + 15;
                IlO0.IIOI[1] = iO1.IIol;
                continue;
            }
            if (iO1.II0o > IOlO.l100 - 60) {
                IlO0.IIO1[0] = iO1.IIoI - 15;
                IlO0.IIO1[1] = iO1.IIol;
                continue;
            }
            IlO0.IIOl[0] = iO1.II0o + 15;
            IlO0.IIOl[1] = iO1.IIol;
        }
    }

    private static void IOl() {
        IIOI = new int[2];
        IIOl = new int[2];
        IIO1 = new int[2];
    }

    public static int III1(int n) {
        int n2 = 50;
        for (int i = 0; i < 30; ++i) {
            if (!IOlO.boolean_IIIl(n, n2 += 24, 2)) continue;
            if (n2 % 24 == 0) break;
            n2 -= n2 % 24;
            break;
        }
        return n2;
    }

    private static void II_o(int n) {
        block0 : switch (n) {
            case 0: {
                Il_0.III1(60, IlO0.III1(60));
                break;
            }
            case 1: {
                Il_0.III1(IOlO.l100 - 60, IlO0.III1(IOlO.l100 - 60));
                break;
            }
            case 2: {
                for (int i = 0; i < I1_I.var_I_lO_IIOI.size(); ++i) {
                    I_11 i_11 = (I_11)I1_I.var_I_lO_IIOI.elementAt(i);
                    if (i_11.var_I_1__II.lll0 < 30 || i_11.var_I_1__II.lll0 > 36) continue;
                    Ilol.Ilol_II().var_I_11_II = i_11;
                    Il_0.III1(i_11.I_o_, i_11.I_oO - 3);
                    break block0;
                }
                break;
            }
        }
    }
}

