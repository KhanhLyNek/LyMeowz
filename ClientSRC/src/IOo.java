/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class IOo {
    static final int _I__ = 0;
    static final int _I_O = 1;
    static final int _I_0 = 2;
    static final int _I_o = 3;
    static final int _IO = 4;
    static final int _IOI = 5;
    private static final int _IOl = 300;
    private static final int _IO1 = 50;
    private static final int[][] II_I = new int[][]{{285, 286, 287}, {288, 289, 290}, {282, 283, 284}, {304, 305, 303}};
    private final IO0 IIlo;
    private final IOo_ IIlo;
    private final Random IIlO = new Random();
    private boolean Iol_;
    private boolean I0oI;
    private int loOl;
    private int loO1;
    private long I1_0;
    private long I_1O;
    private long I_10;
    private long I_1o;
    private long I__;
    private long I__I;
    private long I__l;
    private long I__1;
    private long[] IIIo = new long[6];
    private IOoI.III III;
    private boolean IoOl;
    private boolean IoO1;
    private IO_I.III IIII;
    static final String[] IlO_ = new String[]{IOo.I1Ol("\u940f\u8bf9\u957d\u9508\u8b76", 38175), IOo.I1Ol("\u9552\u955f\u953f\u94cc", 38175), IOo.I1Ol("\u954a\u954b\u953f", 38175), IOo.I1Ol("\u9554\u9557\u9539\u955c\u95d9\u95df\u95bc\u958a", 38175), IOo.I1Ol("\u9554\u9557\u9539\u955c\u95d1\u95d3\u95ab\u959d\u9679", 38175)};
    static final String[] IlOO = new String[]{IOo.I1Ol("\u9547\u9557\u9533\u955c\u95f3\u9559\u95a0\u95d8\u9663\u965e\u9620\u9654\u96fd\u96da\u887c\u969e\u972f\u975a\u972c\u9703\u97ab\u97c6\u9729\u9785\u9827\u9937\u8682\u9844\u98f7\u864f", 38175), IOo.I1Ol("\u9550\u955f\u957d\u9513\u95fa\u959a\u95b6\u9599\u9639\u9618\u967b", 38175), IOo.I1Ol("\u9547\u9557\u9533\u955c\u95f3\u9559\u95a0\u95d8\u9663\u965e\u9620\u9654\u96fd\u96da\u887c\u969e\u972f\u975a\u972c\u9703\u97ab\u97c6\u9729\u9785\u9827\u9937\u8682\u9844\u98f7\u864f", 38175), IOo.I1Ol("\u9557\u95dd\u9524\u955c\u95f3\u8b59\u95a9\u95d8\u9663\u96d7\u9636\u9654\u96e5\u8869\u96b8\u96d0\u977b\u974f\u9761\u974c\u97c0\u97cb\u97a2\u9789\u9875\u9849\u9831\u9845", 38175), IOo.I1Ol("\u9547\u9557\u9533\u955c\u95f3\u9559\u95a0\u95d8\u9663\u965e\u9620\u9654\u96fd\u96da\u887c\u969e\u972f\u975a\u972c\u9703\u97ab\u97c6\u9729\u9785\u9827\u9937\u8682\u9844\u98f7\u864f", 38175)};
    private long I___;
    private String lI_0;
    private static final short[][] III1 = new short[][]{{380, 381, 382}, {383, 384, 385}, {391, 392, 393}, {870, 871, 872}, {873, 874, 875}, {867, 868, 869}, {1876, 1879, 1880}, {1771, 1774, 1775}, {1766, 1769, 1770}};
    private long I__O;
    private long[] IIl = new long[0];
    private long[] IIlI = new long[0];
    private long I__0;
    private int _IO_;
    private long I__o;
    private static final String[] IlO0 = new String[]{IOo.I1Ol("\u954b\u955f\u957d\u951f\u95f3\u9557\u95b7\u9590\u9637\u965a\u96b5\u9654\u96e7\u96da\u886e\u96d0\u9768\u9747\u8996\u9705", 38175), IOo.I1Ol("\u954b\u955f\u957d\u951f\u95f3\u9557\u95b7\u9590\u9637\u965a\u96b5\u9654\u96f0\u9646\u96bf\u9697\u972f\u9742\u97a0", 38175), IOo.I1Ol("\u9557\u95dd\u9524\u955c\u95f8\u95d2\u95b0\u9512\u967a\u9616\u963b\u9613\u9723\u8853\u96bf\u9697\u972f\u9758\u89f6\u974c\u969a\u8913\u97b9\u97c8\u9864\u86c1\u9824\u9844\u98f7\u98c3\u98e0\u98c0\u98b7\u87ff\u9954\u997c\u9918\u99f5\u99d7\u99f8\u9999\u9a71\u9b85\u8489\u9a1a", 38175), IOo.I1Ol("\u954c\u8bd7\u953e\u955c\u95f6\u8b1b\u95b7\u9590\u9637\u9642\u963a\u9654\u96ff\u8869\u96bf\u96d0\u9761\u899f\u9720\u974c\u97ff\u97d8\u97a6\u9786\u9860\u9806\u9826\u99c5\u98a3\u98d6\u98a9\u8623\u98df\u997c\u8798\u9928\u995b\u99ee\u8754", 38175), IOo.I1Ol("\u954b\u955f\u957d\u950f\u8b26\u959a\u94c8\u959d\u967a\u9616\u9636\u9680\u96fd\u96d5\u96f1\u969c\u97e2\u970e\u9739\u89b7\u97e2\u978a\u97bd\u9787\u98e7\u9848\u9865\u9806\u865a\u9882\u98b7\u9989\u98df\u996a\u994f\u87b9\u995b\u99f4\u9959\u99a1", 38175)};
    private static final int _IOO = 2000;
    private boolean IoO_;
    private long I_O;
    private int _IO0;
    private int _IOo;
    private int _I0;
    private int _I0I;
    private IOO.IIIO II;
    private int _I0l;
    private long I_OI;
    private boolean IoOO;
    private long I_Ol;
    private long I_O1;
    private boolean IoO0;
    private int _I01;
    private long I_O_;
    private long I_OO;
    private boolean IoOo;
    private long I_O0;
    private boolean Io0;
    private boolean Io0I;
    static final long I_Oo = 432000000L;
    static final int _I0_ = 1000000000;
    static final int _I0O = 50000000;

    IOo(IO0 iO0, IOo_ iOo_) {
        this.IIlo = iO0;
        this.IIlo = iOo_;
    }

    private IOol II() {
        return this.IIlo.II;
    }

    private IOol III() {
        return this.IIlo.II == null ? null : this.IIlo.II.III;
    }

    private int IIoO() {
        return -this.IIlo.II.I1l;
    }

    void Ilol(int n) {
        this.IIIO(0, n, -1);
    }

    void IIIO(int n, int n2, int n3) {
        IOol iOol = this.II();
        if (iOol.III != null) {
            if (iOol._10 != 0) {
                this.l1II();
            }
            for (int i = 0; i < iOol.III.II.length; ++i) {
                if (iOol.III.II[i].II1_() || !this.IIlo.IIIl.III0(iOol.III.II[i])) continue;
                iOol.III.II[i] = new IO0l();
            }
            this.IIlo.IIIl.l1_l();
            this.I__o();
        }
        this.lloo();
        IOol iOol2 = new IOol();
        iOol2.II1o = IOo.I1Ol("\u953b", 38175) + IlO_[n];
        iOol2.lOlI = n2;
        iOol2.IO_l = n == 0 ? 2000L : (n == 1 ? 1500000L : 40000000000L);
        iOol2.IO_1 = 0L;
        iOol2._l0_ = 1000;
        iOol2._l0O = 1000;
        if (n >= 2) {
            iOol2._l00 = 400000;
            iOol2._l0o = 400000;
            iOol2._lo = 20000;
        } else {
            iOol2._l00 = (40 + this.IIlO.nextInt(66)) * 20;
            iOol2._l0o = (40 + this.IIlO.nextInt(66)) * 20;
            iOol2._lo = n == 1 ? 50 + this.IIlO.nextInt(71) : 20 + this.IIlO.nextInt(26);
        }
        iOol2._lol = 9 + this.IIlO.nextInt(42);
        iOol2._lo1 = this.IIlO.nextInt(3);
        iOol2.I__l = new int[]{-1, -1, -1, -1, -1};
        iOol2.I__l[0] = IOo.IIO0(this.IIlO.nextInt(3) * 2);
        if (n3 >= 0) {
            iOol2._11_ = n3;
        }
        if (n >= 2 && iOol2._11_ < 5) {
            iOol2._11_ = 5;
        }
        iOol2.llIl = iOol2.Illo();
        iOol2._loI = iOol2.Il1();
        iOol.III = iOol2;
        iOol._10I = 0;
        iOol._10l = n;
        this.loOl = iOol.I1 + this.IIlO.nextInt(21) - 10;
        this.loO1 = iOol.I1I;
        this.l1();
        if (this.Iol_) {
            this.I__0();
        }
        this.II(1000L, IlOO[n]);
        this.IIlo.I__O();
    }

    private void lloo() {
        this.IoOo = false;
        this.Io0 = false;
        this.III = null;
        this.IoOO = false;
        this.IoO_ = false;
        this.IoO0 = false;
        this.IIl = new long[0];
        this.IIlI = new long[0];
        this.IIIo = new long[6];
    }

    int II00() {
        IOol iOol = this.II();
        return iOol == null || iOol.III == null ? 0 : iOol._10l;
    }

    private static int IIO0(int n) {
        IOO.IIIO iIIO = IOO.II(n, 1);
        return iIIO == null ? -1 : iIIO.I1l;
    }

    private void II(long l, String string) {
        this.I___ = System.currentTimeMillis() + l;
        this.lI_0 = string;
    }

    void II_1(String string) {
        if (this.II() == null || this.III() == null || !this.I0oI) {
            return;
        }
        this.IIlo.II(new IO0o(44).IIII(this.IIoO()).II(string));
    }

    void l1() {
        this.IIlo.II(new IO0o(-107).II(this.III() == null ? 0 : 1));
    }

    void II__(IO_I.III iII) {
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol == null || iOol2 == null || !this.I0oI || this.IoOo || iOol.llIl <= 0 || iOol2.llIl <= 0) {
            return;
        }
        if (iOol._10I != 1 && iOol._10I != 2) {
            return;
        }
        if (this.IIII == iII) {
            return;
        }
        this.IIII = iII;
        this.II_1(iII.II1o + IOo.I1Ol("\u9533\u951e\u9530\u9515\u95bb\u94ab\u953a\u95d8\u967b\u96d6\u9638\u9654\u96e7\u96d3\u96f1\u969e\u89da\u9747\u976d\u970b\u97e2\u8907\u97a7\u97c8\u9875\u86f5\u982c\u9845", 38175));
    }

    private int[] IIII() {
        IOol iOol = this.III();
        int n = iOol.lOlI;
        if (iOol._lo_ > 0) {
            int[] nArray = new int[]{192, 195, 196, 199, 197, 200, 198};
            return new int[]{nArray[Math.min(iOol._lo_, nArray.length) - 1], 193, 194};
        }
        int n2 = this.II00();
        if (n2 >= 1) {
            int[][] nArrayArray = new int[][]{{297, 298, 299}, {946, 947, 948}, {1422, 1423, 1424}, {876, 877, 878}};
            if (!this.Io0 || n2 >= 3) {
                return nArrayArray[n2 - 1];
            }
            int[] nArray = this.II(iOol);
            return new int[]{nArray[0], nArrayArray[n2 - 1][1], nArrayArray[n2 - 1][2]};
        }
        return this.II(iOol);
    }

    private int[] II(IOol iOol) {
        int[] nArray;
        int n;
        int n2;
        int n3;
        int n4 = iOol.lOlI;
        if (iOol.IO_l < 1500000L) {
            n3 = II_I[n4][0];
            n2 = II_I[n4][1];
            n = II_I[n4][2];
        } else {
            n3 = II_I[3][n4];
            n2 = n4 == 1 ? 59 : 57;
            n = n4 == 1 ? 60 : 58;
        }
        int[] nArray2 = nArray = iOol.II[5].II1_() ? null : I0I1.III_(iOol.II[5].I1l);
        if (nArray != null && nArray[0] != -1) {
            n3 = nArray[0];
        }
        if (nArray != null && nArray[1] != -1) {
            n2 = nArray[1];
        } else if (!iOol.II[0].II1_() && I0I1.IIoO(iOol.II[0].I1l) != -1) {
            n2 = I0I1.IIoO(iOol.II[0].I1l);
        }
        if (nArray != null && nArray[2] != -1) {
            n = nArray[2];
        } else if (!iOol.II[1].II1_() && I0I1.IIoO(iOol.II[1].I1l) != -1) {
            n = I0I1.IIoO(iOol.II[1].I1l);
        }
        return new int[]{n3, n2, n};
    }

    private int IIo0() {
        switch (this.II00()) {
            case 1: {
                return 297;
            }
            case 2: {
                return 946;
            }
            case 3: {
                return 1422;
            }
            case 4: {
                return 876;
            }
        }
        return II_I[3][this.III().lOlI];
    }

    static boolean IIo(int n) {
        I0Io.II iI = I0Io.II(n);
        return iI != null && iI.IoI_ == 1;
    }

    private boolean Il_0() {
        return this.II().lOlo == 21 + this.II().lOlI;
    }

    private boolean Il_o() {
        IOol iOol = this.II();
        if (iOol == null || iOol.III == null || !this.Iol_ || IOo.IIo(iOol.lOlo)) {
            return false;
        }
        int n = iOol._10I;
        if (n == 4) {
            return false;
        }
        if (n == 3) {
            return System.currentTimeMillis() < this.I__1 || this.Il_0();
        }
        return true;
    }

    private void I__0() {
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol2 == null) {
            return;
        }
        int[] nArray = this.IIII();
        int n = Math.max(1, iOol2.Illo());
        this.IIlo.II(new IO0o(-5).IIII(this.IIoO()).IIII(-1).II(0).II(false).II(0).II(iOol2.lOlI).II(iOol2.lOlI).III(nArray[0]).II(iOol2.II1o).IIII(Math.max(1, iOol2.llIl)).IIII(n).III(nArray[1]).III(nArray[2]).II(-1).II(-1).III(this.loOl).III(this.loO1).III(0).III(0).II(0).II(0).II(0).III(-1).II(0).II(0).III(-1).II(-1).III(-1));
        this.I0oI = true;
    }

    private void I__o() {
        if (!this.I0oI) {
            return;
        }
        this.IIlo.II(new IO0o(-6).IIII(this.IIoO()));
        this.I0oI = false;
    }

    private void l1I() {
        this.I__o();
        if (this.Il_o()) {
            this.I__0();
        }
    }

    void Ioo1() {
        this.Iol_ = false;
        this.I0oI = false;
        this.III = null;
        this.IIII = null;
        this.IoO0 = false;
        this.IoOO = false;
        this.IoO_ = false;
        this.IIl = new long[0];
        this.IIlI = new long[0];
    }

    void lIlI() {
        this.Iol_ = true;
        IOol iOol = this.II();
        this.l1l();
        if (iOol == null || iOol.III == null) {
            return;
        }
        if (this.IoOo) {
            return;
        }
        if (iOol._10I == 3 && !this.Il_0()) {
            return;
        }
        this.loOl = iOol.I1 + this.IIlO.nextInt(21) - 10;
        this.loO1 = iOol.I1I;
        if (iOol._10I == 3) {
            this.loOl = 250;
            this.loO1 = 336;
        }
        if (this.Il_o()) {
            this.I__0();
        }
    }

    private void IIOI(int n, int n2) {
        this.loOl = n;
        this.loO1 = n2;
        if (this.I0oI) {
            this.IIlo.II(new IO0o(-7).IIII(this.IIoO()).III(this.loOl).III(this.loO1));
        }
    }

    private int III1(int n, int n2, int n3, int n4) {
        double d = n - n3;
        double d2 = n2 - n4;
        return (int)Math.sqrt(d * d + d2 * d2);
    }

    private void Ilo1(int n) {
        IOol iOol = this.II();
        int n2 = iOol.I1;
        int n3 = iOol.I1I;
        int n4 = this.loOl - n2;
        if (this.III1(n2, n3, this.loOl, this.loO1) >= n || n4 < 50) {
            int n5;
            int n6 = n5 = n4 < 0 ? n2 - 50 : n2 + 50;
            if (n5 != this.loOl || n3 != this.loO1) {
                this.IIOI(n5, n3);
            }
        }
    }

    void ll11() {
        IOol iOol = this.II();
        if (iOol == null || iOol.III == null || !this.I0oI) {
            return;
        }
        switch (iOol._10I) {
            case 2: {
                if (this.III != null && !this.III.IoOo && this.III1(this.loOl, this.loO1, iOol.I1, iOol.I1I) <= 1000) break;
            }
            case 0: 
            case 1: {
                this.Ilo1(500);
                break;
            }
        }
    }

    private String IIlI(int n) {
        if (this.II00() == 4) {
            switch (n) {
                case 0: {
                    return IOo.I1Ol("\u9553\u9457\u957d\u951f\u95f4\u95d4\u95f9\u9596\u9670\u9786\u8888\u961d\u96b3\u96d9\u96b9\u9604\u9761\u9749\u976d\u967d\u896c\u978a\u97bd\u9658\u9827\u9845\u98a4\u9807\u98eb\u9882\u99d0\u8623\u98df\u9970\u99ce\u9935\u995b\u99f9\u99d1\u99ad\u998e\u84d1\u9a5b\u9a74\u9a05\u8449\u9ad8\u9af0\u9a9b\u9b6f", 38175);
                }
                case 1: {
                    return IOo.I1Ol("\u954b\u955f\u957d\u950f\u8b26\u959a\u95ba\u9590\u9678\u9616\u963b\u9613\u9723\u886f\u96b8\u96d0\u976d\u9747\u89f2\u9718\u97ab\u97d9\u8920\u978b\u9827\u984b\u86e4\u980a\u98eb\u9882\u98a2\u8607\u989e\u993e\u9950\u8785\u990f\u99ba\u99cf\u8713\u99d7\u9a62\u9a5d\u84f3\u9a1d\u9ab2\u9add\u9a30\u9acf\u9b60\u9b45\u9afc\u9b4b\u9bfe\u9bc1\u8577\u9bc7\u9c68\u9cc5\u9c2b\u9c43\u9ca3", 38175);
                }
                case 2: {
                    return IOo.I1Ol("\u954b\u955f\u957d\u950f\u8b26\u959a\u95ad\u9590\u88c6\u9658\u9632\u9654\u96e7\u96c0\u881a\u96d0\u9779\u9647\u976d\u9718\u97f9\u894f", 38175);
                }
                case 3: {
                    return IOo.I1Ol("\u9554\u9556\u95a9\u9512\u95fc\u959a\u95b5\u9515\u9637\u9658\u96b5\u961b\u96b3\u96c6\u96b0\u96d0\u9763\u898f\u9724\u974c\u97f9\u97df\u97a7\u97c8\u9874\u86c5\u9865\u9806\u864e\u98cc\u98e1\u9883\u9890\u9970\u991d\u9932\u991c\u982a\u8764\u99b1\u99d7\u9a65\u9a54\u9a3b", 38175);
                }
                case 5: {
                    return IOo.I1Ol("\u9553\u9457\u957d\u951f\u957a\u95d9\u95f9\u9596\u9670\u9786\u97f4\u961d\u96b3\u96de\u9631\u969d\u972f\u975a\u972c\u974c\u97ff\u97c2\u896c\u9791\u9827\u9937\u9824\u9811\u98a3\u98d0\u8612\u9889\u98df\u87bb\u9944\u997c\u9913\u99fb\u99d1\u99b9", 38175);
                }
            }
            return IOo.I1Ol("\u954c\u8bd7\u953e\u955c\u95f6\u8b1b\u95b7\u9590\u9637\u9655\u88b2\u9615\u96b3\u96c6\u96b0\u96d0\u9763\u97ce\u976d\u9707\u97e3\u975e\u97a7\u978f\u9827\u9845\u98b6\u9844\u98e4\u98cb\u861a\u9889\u98df\u9976\u879c\u9932", 38175);
        }
        switch (n) {
            case 0: {
                return IOo.I1Ol("\u9550\u9555\u957d\u951f\u95f4\u95d4\u95f9\u958c\u967f\u9653\u963a\u9654\u96e0\u9702\u96f1\u9680\u9767\u89cb", 38175);
            }
            case 1: {
                return IOo.I1Ol("\u9550\u9555\u957d\u951f\u95f4\u95d4\u95f9\u958b\u88aa\u9616\u9637\u88d7\u96fc\u9692\u96a7\u8837\u972f\u975d\u96fd\u974c\u97fb\u97c2\u892c", 38175);
            }
            case 2: {
                return IOo.I1Ol("\u9550\u9555\u957d\u950f\u942b\u959a\u95a9\u9590\u88f2\u9616\u9744\u88b7\u96b3\u96d1\u96be\u969e\u972f\u9742\u9722\u974c\u97e8\u97c2\u97a6", 38175);
            }
            case 3: {
                return IOo.I1Ol("\u9550\u9575\u957d\u951f\u95f4\u95d4\u95f9\u958e\u88d6\u961a\u9675\u9616\u96fa\u96d0\u96b8\u96d0\u977c\u969e\u976d\u971c\u97e3\u894f", 38175);
            }
            case 5: {
                return IOo.I1Ol("\u955b\u9553\u957d\u950f\u942b\u959a\u95a9\u9590\u88f2", 38175);
            }
        }
        return IOo.I1Ol("\u954c\u948e\u957d\u950c\u95f3\u8b5f\u95f9\u9459\u967e\u9616\u9636\u961b\u96fd\u9692\u96bd\u961a\u9761\u970e\u972e\u89c9\u97fb\u978a\u97bb\u893b\u986e", 38175);
    }

    void Ilo_(int n) {
        IOol iOol = this.II();
        if (iOol == null || iOol.III == null) {
            return;
        }
        if (n < 0 || n > 5) {
            return;
        }
        if (iOol._10 != 0 || this.IoOo && n == 4 || System.currentTimeMillis() < this.I__1) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9554\u9556\u95a9\u9512\u95fc\u959a\u95ad\u9590\u88d4\u9616\u9621\u961c\u8862\u96d1\u96f1\u9698\u9766\u89e9\u9723", 38175));
            return;
        }
        if (n == 5) {
            if (iOol.lOlI != 1) {
                return;
            }
            this.II_1(this.IIlI(n));
            this.IIlo.II(new IO0o(125).II(4).IIII(iOol.I1l));
            long l = iOol.III.IO_l;
            this.I__o();
            long l2 = iOol.IIIO();
            long l3 = Math.min(l, Math.max(0L, l2 - iOol.IO_l));
            iOol.IO_l += l3;
            iOol.IO_1 += l3;
            iOol.III = null;
            iOol._10I = 0;
            this.l1();
            this.IIlo.ll_0();
            this.IIlo.I__O();
            return;
        }
        this.II_1(this.IIlI(n));
        if (n == 4) {
            this.Ilo0(4);
            return;
        }
        if (n == 3) {
            this.I__1 = System.currentTimeMillis() + 2000L;
            iOol._10I = 3;
        } else {
            iOol._10I = n;
            if (!this.I0oI && this.Il_o()) {
                this.loOl = iOol.I1;
                this.loO1 = iOol.I1I;
                this.I__0();
            }
        }
        this.IIlo.I__O();
    }

    int[] IIIl() {
        int n;
        boolean bl;
        IOol iOol = this.II();
        if (iOol == null || iOol._10 == 0 || iOol.III == null) {
            return null;
        }
        IO0l iO0l = iOol.II[5];
        IO0l iO0l2 = iOol.III.II[5];
        boolean bl2 = !iO0l.II1_() && (iO0l.I1l == 1693 || iO0l.I1l == 1553);
        boolean bl3 = bl = !iO0l2.II1_() && (iO0l2.I1l == 1693 || iO0l2.I1l == 1553);
        if (bl2 && bl && iO0l.I1l != iO0l2.I1l) {
            return new int[]{1578, 1581, 1582};
        }
        if (iOol.Ilo()) {
            return new int[]{2100, 2101, 2102};
        }
        int n2 = iOol.lOlI;
        switch (iOol._10) {
            case 4: {
                n = n2 == 1 ? 2 : 0;
                break;
            }
            case 6: {
                n = n2 == 1 ? 2 : 1;
                break;
            }
            case 8: {
                n = 3 + n2;
                break;
            }
            case 9: {
                n = 6 + n2;
                break;
            }
            default: {
                return null;
            }
        }
        return new int[]{III1[n][0], III1[n][1], III1[n][2]};
    }

    private void IloO(int n) {
        this.IIlo.II(new IO0o(125).II(n).IIII(this.II().I1l));
    }

    void Ilo0(int n) {
        IOol iOol = this.II();
        long l = System.currentTimeMillis();
        if (this.IoOo || iOol.III == null) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9546\u95d4\u9528\u955c\u95f8\u8b1d\u95ac\u95d8\u9667\u965e\u88f6\u961d\u96b3\u96d1\u9622\u96d0\u961e\u89e9\u976d\u9718\u8966\u978a\u97bf\u9708\u9827\u9937\u8682\u9844\u98f7\u864f\u98e1\u9883\u980d\u9970\u991d\u992f\u87aa\u99f4\u99de", 38175));
            return;
        }
        if (l - this.I__O < 5000L) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9549\u954b\u9534\u955c\u95f7\u9548\u95b7\u959f\u9637\u9727\u88b6\u961d\u96b3", 38175) + (5000L - (l - this.I__O) + 999L) / 1000L + IOo.I1Ol("\u953f\u9559\u9534\u959e\u95e2\u959a\u95b7\u8b17\u9676", 38175));
            return;
        }
        if (n == 4) {
            iOol.IOo_ = l;
            this.IIlo.II(new IO0o(-106).III(iOol.lOlI == 1 ? 3901 : 3790).III(600));
        }
        iOol._10 = n;
        iOol._10I = 4;
        this.III = null;
        this.l1Io();
        this.IoOO = false;
        this.I__o();
        this.IloO(n);
        this.IIlo.ll__();
        iOol.llIl = iOol.Illo();
        iOol._loI = iOol.Il1();
        this.IIlo.ll_0();
        this.IIlo.IIIl.l1O0();
        this.IIlo.I__O();
    }

    void l1II() {
        IOol iOol = this.II();
        if (iOol._10 == 0) {
            return;
        }
        iOol._10 = 0;
        iOol._10I = 1;
        this.IloO(0);
        this.IIlo.ll__();
        iOol.llIl = Math.min(iOol.llIl, iOol.Illo());
        iOol._loI = Math.min(iOol._loI, iOol.Il1());
        this.IIlo.ll_0();
        this.IIlo.IIIl.l1O0();
        this.I__O = System.currentTimeMillis();
        this.loOl = iOol.I1 + this.IIlO.nextInt(21) - 10;
        this.loO1 = iOol.I1I;
        if (this.Iol_ && this.Il_o()) {
            this.I__0();
        }
        this.IIlo.I__O();
    }

    void Iloo(int n) {
        IOol iOol = this.II();
        if (iOol.III == null || iOol._10 == 4) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9554\u9556\u95a9\u9512\u95fc\u959a\u95ad\u9590\u88d4\u9616\u9621\u961c\u8862\u96d1\u96f1\u9698\u9766\u89e9\u9723", 38175));
            return;
        }
        if (iOol._10 == 0) {
            this.Ilo0(n == 454 ? 6 : (n == 921 ? 8 : 9));
        } else {
            this.l1II();
        }
    }

    void III1(long l) {
        Object object;
        IOol iOol = this.II();
        if (iOol == null || iOol.III == null || !this.Iol_) {
            return;
        }
        if (this.lI_0 != null && l >= this.I___) {
            object = this.lI_0;
            this.lI_0 = null;
            if (!this.I0oI && this.Il_o()) {
                this.I__0();
            }
            this.II_1((String)object);
        }
        if (l - this.I1_0 < 250L) {
            return;
        }
        this.I1_0 = l;
        object = iOol.III;
        if (iOol._10 == 4 && l - iOol.IOo_ >= 600000L) {
            this.l1II();
            return;
        }
        if (iOol._10 != 0) {
            return;
        }
        if (this.IoOo) {
            if (l - this.I_O0 >= 120000L) {
                this.Il1o();
            }
            return;
        }
        if (((IOol)object).llIl <= 0) {
            ((IOol)object).llIl = ((IOol)object).Illo();
        }
        if (iOol.IO_o == 0L) {
            iOol.IO_o = l;
        }
        if (iOol.IOO == 0L) {
            iOol.IOO = (long)(30 + this.IIlO.nextInt(31)) * 60000L;
        }
        if (!iOol.Iooo && !IOo.IIo(iOol.lOlo) && l - iOol.IO_o >= iOol.IOO) {
            iOol.Iooo = true;
        }
        this.IIIo(l);
        this.l1Il();
        if (l - this.I_10 > 30000L) {
            this.I_10 = l;
            ((IOol)object).llIl = Math.min(((IOol)object).Illo(), ((IOol)object).llIl + ((IOol)object).Il__());
            ((IOol)object)._loI = Math.min(((IOol)object).Il1(), ((IOol)object)._loI + ((IOol)object).Il_O());
        }
        if (iOol._10I == 3) {
            if (this.I0oI && l >= this.I__1 && !this.Il_0()) {
                this.I__o();
                return;
            }
            if (this.Il_0() && this.I0oI && l - this.I__l > 5000L) {
                this.I__l = l;
                this.IoO1 = !this.IoO1;
                int[][] nArrayArray = new int[][]{{250, 200}, {500, 452}, {250, 200}};
                this.IIOI(nArrayArray[iOol.lOlI][this.IoO1 ? 1 : 0], 336);
                this.II_1(IOo.I1Ol("\u9553\u95de\u957d\u9518\u95f4\u959a\u95bb\u8b59\u9679\u9616\u963e\u961c\u9667\u96dc\u96b6\u96d0\u976c\u9746\u96ec\u9705\u97ab\u96bb\u891a\u97c8\u9916\u8683\u983c\u9844\u98e1\u8603\u98af\u98c0\u865e\u993f", 38175));
            }
            if (l < this.I__1 && this.I0oI) {
                this.II(l, 2);
            }
            return;
        }
        if (!this.I0oI) {
            if (this.Il_o()) {
                this.loOl = iOol.I1;
                this.loO1 = iOol.I1I;
                this.I__0();
            }
            return;
        }
        this.IIll(l);
        this.IIl1(l);
        if (this.IoOo) {
            return;
        }
        if (iOol.llIl <= 0) {
            return;
        }
        switch (iOol._10I) {
            case 0: {
                this.Ilo1(60);
                break;
            }
            case 1: 
            case 2: {
                this.II(l, iOol._10I);
                break;
            }
        }
    }

    private void IIIo(long l) {
        if (l - this.I_1O < 1000L) {
            return;
        }
        this.I_1O = l;
        IOol iOol = this.III();
        boolean bl = false;
        int n = iOol.IlI_();
        if (iOol._l00 > n) {
            iOol._l00 = n;
            bl = true;
        }
        if (iOol._l0o > n) {
            iOol._l0o = n;
            bl = true;
        }
        if (iOol._lo > iOol.IlIO()) {
            iOol._lo = iOol.IlIO();
            bl = true;
        }
        if (iOol._lol > iOol.IlI0()) {
            iOol._lol = iOol.IlI0();
            bl = true;
        }
        if (iOol._lo1 > iOol.IlIo()) {
            iOol._lo1 = iOol.IlIo();
            bl = true;
        }
        block6: for (int i = 0; i < 20; ++i) {
            switch (this.IIlO.nextInt(5)) {
                case 0: {
                    long l2 = iOol._l00 + 1000;
                    if (iOol._l00 + 20 > iOol.IlI_() || iOol.IO_1 < l2) continue block6;
                    iOol.IO_1 -= l2;
                    iOol._l00 += 20;
                    bl = true;
                    continue block6;
                }
                case 1: {
                    long l2 = iOol._l0o + 1000;
                    if (iOol._l0o + 20 > iOol.IlI_() || iOol.IO_1 < l2) continue block6;
                    iOol.IO_1 -= l2;
                    iOol._l0o += 20;
                    bl = true;
                    continue block6;
                }
                case 2: {
                    long l2 = (long)iOol._lo * 100L;
                    if (iOol._lo + 1 > iOol.IlIO() || iOol.IO_1 < l2) continue block6;
                    iOol.IO_1 -= l2;
                    ++iOol._lo;
                    bl = true;
                    continue block6;
                }
                case 3: {
                    long l2 = (long)(iOol._lol + 5) * 100000L;
                    if (iOol._lol + 1 > iOol.IlI0() || iOol.IO_1 < l2) continue block6;
                    iOol.IO_1 -= l2;
                    ++iOol._lol;
                    bl = true;
                    continue block6;
                }
                default: {
                    long l2 = 50000000L;
                    for (int j = 0; j < iOol._lo1 && (l2 *= 5L) <= 800000000000000000L; ++j) {
                    }
                    if (iOol._lo1 + 1 > iOol.IlIo() || iOol.IO_1 < l2) continue block6;
                    iOol.IO_1 -= l2;
                    ++iOol._lo1;
                    bl = true;
                    continue block6;
                }
            }
        }
        if (bl) {
            iOol.llIl = Math.min(iOol.llIl, iOol.Illo());
            iOol._loI = Math.min(iOol._loI, iOol.Il1());
        }
    }

    private int IIoo() {
        IOol iOol = this.III();
        int n = 0;
        for (int i = 0; i < iOol.I__l.length; ++i) {
            if (iOol.I__l[i] == -1) continue;
            ++n;
        }
        return n;
    }

    private void l1Il() {
        IOol iOol = this.III();
        switch (this.IIoo()) {
            case 1: {
                if (iOol.IO_l < 150000000L) break;
                this.l1I1();
                break;
            }
            case 2: {
                if (iOol.IO_l < 1500000000L) break;
                this.l1I_();
                break;
            }
            case 3: {
                if (iOol.IO_l < 20000000000L) break;
                this.l1IO();
                break;
            }
            case 4: {
                if (this.II00() < 2 || iOol.IO_l < 40000000000L) break;
                this.l1I0();
                break;
            }
        }
    }

    private void III(int n, int n2, String string) {
        IOol iOol = this.III();
        int n3 = IOo.IIO0(n2);
        if (n3 == -1) {
            return;
        }
        iOol.I__l[n] = n3;
        this.IIlo.I__O();
    }

    private void l1I1() {
        int[] nArray = new int[]{1, 3, 5};
        int[] nArray2 = new int[]{33, 33, 34};
        int n = this.IIlO.nextInt(100);
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < 3; ++i) {
            if (n >= (n2 += nArray2[i])) continue;
            n3 = i;
            break;
        }
        this.III(1, nArray[n3], "");
    }

    private void l1I_() {
        int[] nArray = new int[]{6, 8, 9};
        int[] nArray2 = new int[]{30, 40, 30};
        int n = this.IIlO.nextInt(100);
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < 3; ++i) {
            if (n >= (n2 += nArray2[i])) continue;
            n3 = i;
            break;
        }
        this.III(2, nArray[n3], "");
    }

    private void l1IO() {
        int n = this.IIlO.nextInt(100);
        this.III(3, n < 10 ? 13 : (n < 80 ? 12 : 19), "");
    }

    private void l1I0() {
        IOol iOol = this.III();
        this.III(4, iOol.lOlI == 0 ? 24 : (iOol.lOlI == 1 ? 26 : 25), "");
    }

    private IOoI.III III() {
        IOoI.III[] iIIArray = this.IIlo.IIIl.II();
        if (iIIArray == null) {
            return null;
        }
        int n = 300;
        IOoI.III iII = null;
        for (int i = 0; i < iIIArray.length; ++i) {
            int n2;
            IOoI.III iII2 = iIIArray[i];
            if (iII2.IoOo || iII2.III != null || iII2.l0o1 == 117 || (n2 = this.III1(this.loOl, this.loO1, iII2.I1, iII2.I1I)) > n) continue;
            n = n2;
            iII = iII2;
        }
        return iII;
    }

    private IOO.IIIO II(int n) {
        IOol iOol = this.III();
        if (n < 0 || n >= iOol.I__l.length || iOol.I__l[n] == -1) {
            return null;
        }
        return IOO.II(iOol.I__l[n]);
    }

    private int II(IOO.IIIO iIIO) {
        IOol iOol = this.III();
        return iIIO.loII == 0 ? iIIO.loI : (iIIO.loII == 1 ? Math.max(1, iOol.Il1() * iIIO.loI / 100) : iOol._loI);
    }

    private boolean II(int n, IOO.IIIO iIIO, long l) {
        int n2 = n == 1 ? 1000 : iIIO.loIl;
        return l - this.IIIo[n] >= (long)n2;
    }

    private void II(int n, IOO.IIIO iIIO, IOoI.III iII, long l) {
        boolean bl;
        IOol iOol = this.III();
        this.IIIo[n] = l;
        iOol._loI -= this.II(iIIO);
        if (iOol._loI < 0) {
            iOol._loI = 0;
        }
        if (iIIO.lO0I == 9) {
            iOol.llIl = Math.max(1, iOol.llIl - iOol.Illo() / 10);
        }
        int n2 = iOol.Il1I() * iIIO.lo / 100;
        if (this.II().IlI0(522)) {
            n2 *= 2;
        }
        n2 += n2 * (this.IIlO.nextInt(21) - 10) / 100;
        n2 = iOol.IIoI(n2);
        boolean bl2 = bl = this.IIlO.nextInt(100) < iOol.Il1l();
        if (bl) {
            n2 *= 2;
            n2 += n2 * iOol.Il11() / 100;
        }
        if (n2 < 1) {
            n2 = 1;
        }
        if (++iOol._1II >= (this.II().IlI0(522) ? 5 : 2)) {
            iOol._1II = 0;
            if (iOol._l0_ > 0) {
                --iOol._l0_;
            }
        }
        this.III(iII._l_1, l);
        this.IIlo.II(new IO0o(54).IIII(this.IIoO()).II(iIIO.I1l & 0xFF).II(iII._l_1));
        this.IIlo.IIIl.II(iII._l_1, n2, bl, iOol);
    }

    private void III(int n, long l) {
        if (this.IIl.length <= n) {
            this.IIl = IOo.II(this.IIl, n + 1);
            this.IIlI = IOo.II(this.IIlI, n + 1);
        }
        this.IIl[n] = l;
    }

    private static long[] II(long[] lArray, int n) {
        long[] lArray2 = new long[Math.max(n, 64)];
        System.arraycopy(lArray, 0, lArray2, 0, lArray.length);
        return lArray2;
    }

    private void II(long l, int n) {
        int n2;
        IOoI.III iII;
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol.Iooo && !iOol.IlI0(522)) {
            if (l - this.I__0 >= 10000L) {
                this.I__0 = l;
                this.II_1(this.II00() == 4 ? IOo.I1Ol("\u954c\u955f\u9532\u955c\u95f5\u95dd\u9469\u9459\u967e\u9616\u963e\u961c\u9667\u96dc\u96b6\u96d0\u961e\u97cf\u9723\u9704\u97ab\u96bb\u97a0\u97d7", 38175) : IOo.I1Ol("\u954c\u955f\u9532\u955c\u95e8\u940a\u95f9\u9588\u967f\u88d3\u9675\u961f\u96fb\u9646\u96bf\u9697\u972f\u963f\u97ac\u9702\u97e3\u978a\u96d8\u9781\u9838", 38175));
            }
            return;
        }
        if (iOol2._l0_ <= 0) {
            this.IIlO(l);
            return;
        }
        if (this.III1(l) || this.III_(l) || this.IIIl(l)) {
            return;
        }
        if (this.IIII != null) {
            if (!this.IIlo.IIIl.II.III(this.IIII)) {
                this.IIII = null;
            } else {
                this.II(l, n, this.IIII);
                return;
            }
        }
        this.III = iII = this.III();
        if (iII != null && this.II00() == 4) {
            this.IIl(l);
        }
        if (iII == null) {
            this.IoOl = true;
            if (l - this.I__ > this.I__I) {
                int n3 = this.loOl - iOol.I1 <= 0 ? -1 : 1;
                this.IIOI(iOol.I1 + (n3 == -1 ? 50 : -50), iOol.I1I);
                this.I__ = l;
                this.I__I = 5000 + this.IIlO.nextInt(3000);
                this.IoOl = false;
            }
            return;
        }
        int n4 = this.III1(this.loOl, this.loO1, iII.I1, iII.I1I);
        int n5 = n == 1 ? 60 : 20;
        IOO.IIIO iIIO = this.II(0);
        IOO.IIIO iIIO2 = this.II(1);
        IOO.IIIO iIIO3 = this.II(2);
        if (iIIO3 != null && iIIO3.lO0I == 9 && this.II(2, iIIO3, l) && this.II(iIIO3) <= iOol2._loI && iOol2.llIl > iOol2.Illo() / 5) {
            this.IIOI(iII.I1 + this.IIlO.nextInt(41) - 20, iII.I1I);
            this.II(2, iIIO3, iII, l);
            return;
        }
        boolean bl = n4 > 50 && iIIO2 != null;
        IOO.IIIO iIIO4 = bl ? iIIO2 : iIIO;
        int n6 = n2 = bl ? 1 : 0;
        if (iIIO4 == null || !this.II(n2, iIIO4, l)) {
            return;
        }
        if (this.II(iIIO4) > iOol2._loI) {
            this.IIlO(l);
            return;
        }
        if (!bl) {
            this.IIOI(iII.I1 + this.IIlO.nextInt(n5 * 2 + 1) - n5, iII.I1I);
        }
        this.II(n2, iIIO4, iII, l);
    }

    private void II(long l, int n, IO_I.III iII) {
        int n2;
        IOol iOol = this.III();
        int n3 = this.III1(this.loOl, this.loO1, iII.I1, iII.I1I);
        int n4 = n == 1 ? 60 : 20;
        IOO.IIIO iIIO = this.II(0);
        IOO.IIIO iIIO2 = this.II(1);
        IOO.IIIO iIIO3 = this.II(2);
        if (iIIO3 != null && iIIO3.lO0I == 9 && this.II(2, iIIO3, l) && this.II(iIIO3) <= iOol._loI && iOol.llIl > iOol.Illo() / 5) {
            this.IIOI(iII.I1 + this.IIlO.nextInt(41) - 20, iII.I1I);
            this.II(2, iIIO3, iII, l);
            return;
        }
        boolean bl = n3 > 50 && iIIO2 != null;
        IOO.IIIO iIIO4 = bl ? iIIO2 : iIIO;
        int n5 = n2 = bl ? 1 : 0;
        if (iIIO4 == null || !this.II(n2, iIIO4, l)) {
            return;
        }
        if (this.II(iIIO4) > iOol._loI) {
            this.IIlO(l);
            return;
        }
        if (!bl) {
            this.IIOI(iII.I1 + this.IIlO.nextInt(n4 * 2 + 1) - n4, iII.I1I);
        }
        this.II(n2, iIIO4, iII, l);
    }

    private void II(int n, IOO.IIIO iIIO, IO_I.III iII, long l) {
        boolean bl;
        IOol iOol = this.III();
        this.IIIo[n] = l;
        iOol._loI -= this.II(iIIO);
        if (iOol._loI < 0) {
            iOol._loI = 0;
        }
        if (iIIO.lO0I == 9) {
            iOol.llIl = Math.max(1, iOol.llIl - iOol.Illo() / 10);
        }
        int n2 = iOol.Il1I() * iIIO.lo / 100;
        if (this.II().IlI0(522)) {
            n2 *= 2;
        }
        n2 += n2 * (this.IIlO.nextInt(21) - 10) / 100;
        boolean bl2 = bl = this.IIlO.nextInt(100) < iOol.Il1l();
        if (bl) {
            n2 *= 2;
            n2 += n2 * iOol.Il11() / 100;
        }
        if (n2 < 1) {
            n2 = 1;
        }
        if (++iOol._1II >= (this.II().IlI0(522) ? 5 : 2)) {
            iOol._1II = 0;
            if (iOol._l0_ > 0) {
                --iOol._l0_;
            }
        }
        this.IIlo.IIIl.II.II(iII, n2, bl, iIIO, this.IIoO());
    }

    private void IIl(long l) {
        if (l - this.I__o < (long)(this._IO_ == 0 ? 15000 : 1500)) {
            return;
        }
        this.I__o = l;
        this.IIlo.II(new IO0o(44).IIII(this.IIoO()).II(IlO0[this._IO_]));
        this._IO_ = (this._IO_ + 1) % IlO0.length;
    }

    private boolean IIIl(long l) {
        IOol iOol = this.III();
        if (this.IoO_) {
            int n;
            Object object;
            int n2;
            if (l < this.I_O) {
                return true;
            }
            this.IoO_ = false;
            IOO.IIIO iIIO = this.II;
            Vector<Object> vector = new Vector<Object>();
            IOoI.III[] iIIArray = this.IIlo.IIIl.II();
            for (n2 = 0; iIIArray != null && n2 < iIIArray.length; ++n2) {
                object = iIIArray[n2];
                if (((IOoI.III)object).IoOo || ((IOoI.III)object).III != null || ((IOoI.III)object).l0o1 == 117) continue;
                int n3 = this._IO0 < 0 ? (((IOoI.III)object).I1 < this._IOo ? 1 : 0) : (n = ((IOoI.III)object).I1 > this._IOo ? 1 : 0);
                if (n == 0 || Math.abs(((IOoI.III)object).I1 - this._IOo) > this._I0I || Math.abs(((IOoI.III)object).I1I - this._I0) > 120) continue;
                vector.addElement(object);
            }
            n2 = this._IOo + (this._IO0 < 0 ? -this._I0I : this._I0I);
            object = new IO0o(-45).II(21).IIII(this.IIoO()).III(iIIO.lO0I).III(n2).III(this._I0).III(2000).III(120).II(0).II(vector.size());
            for (n = 0; n < vector.size(); ++n) {
                ((IO0o)object).II(0).II(((IOoI.III)vector.elementAt((int)n))._l_1);
            }
            ((IO0o)object).II(-1);
            this.IIlo.II((IO0o)object);
            if (iIIO.lO0I != 26) {
                for (n = 0; n < vector.size(); ++n) {
                    IOoI.III iII = (IOoI.III)vector.elementAt(n);
                    int n4 = iOol.IIoI(iOol.Il1I() * Math.max(100, iIIO.lo) / 100);
                    if (n4 < 1) {
                        n4 = 1;
                    }
                    this.III(iII._l_1, l);
                    this.IIlo.IIIl.II(iII._l_1, n4, false, iOol);
                }
            } else {
                for (n = 0; n < vector.size(); ++n) {
                    IOoI.III iII = (IOoI.III)vector.elementAt(n);
                    int n5 = iOol.IIoI(iOol.Il1I() * Math.max(100, iIIO.lo) / 100);
                    this.III(iII._l_1, l);
                    this.IIlo.IIIl.II(iII._l_1, Math.max(1, n5), false, iOol);
                }
            }
            return true;
        }
        IOO.IIIO iIIO = this.II(4);
        if (iIIO == null || !this.II(4, iIIO, l) || this.II(iIIO) > iOol._loI) {
            return false;
        }
        IOoI.III iII = this.III();
        if (iII == null) {
            return false;
        }
        this.IIIo[4] = l;
        iOol._loI -= this.II(iIIO);
        this.II = iIIO;
        this._IO0 = this.loOl > iII.I1 ? -1 : 1;
        this._IOo = this.loOl;
        this._I0 = this.loO1;
        this._I0I = 300 + iIIO.l1__ * 40;
        this.I_O = l + 2000L;
        this.IoO_ = true;
        int n = iIIO.lO0I == 24 ? 1 : (iIIO.lO0I == 25 ? 2 : 3);
        this.IIlo.II(new IO0o(-45).II(20).IIII(this.IIoO()).III(iIIO.lO0I).II(n).II(this._IO0).III(2000).II(0).II(0).II(-1));
        return true;
    }

    private boolean III1(long l) {
        IOol iOol = this.III();
        IOO.IIIO iIIO = this.II(2);
        if (iIIO == null) {
            return false;
        }
        if (iIIO.lO0I == 6) {
            if (!this.II(2, iIIO, l) || this.II(iIIO) > iOol._loI) {
                return false;
            }
            int n = 120 + iIIO.l1__ * 30;
            int n2 = iIIO.l1__ + 2;
            Vector<IOoI.III> vector = new Vector<IOoI.III>();
            IOoI.III[] iIIArray = this.IIlo.IIIl.II();
            for (int i = 0; i < iIIArray.length; ++i) {
                IOoI.III iII = iIIArray[i];
                if (iII.IoOo || iII.III != null || Math.abs(iII.I1 - this.loOl) > n || Math.abs(iII.I1I - this.loO1) > n) continue;
                vector.addElement(iII);
            }
            if (vector.size() == 0) {
                return false;
            }
            this.IIIo[2] = l;
            iOol._loI -= this.II(iIIO);
            IO0o iO0o = new IO0o(-45).II(0).IIII(this.IIoO()).III(iIIO.I1l).II(vector.size());
            for (int i = 0; i < vector.size(); ++i) {
                IOoI.III iII = (IOoI.III)vector.elementAt(i);
                iII.I110 = l + (long)n2 * 1000L;
                iO0o.II(iII._l_1).II(n2);
            }
            iO0o.II(0);
            this.IIlo.II(iO0o);
            this.II_1(IOo.I1Ol("\u955d\u8b9b\u9529\u955c\u95f5\u95dd\u8b04\u95d8\u9674\u965e\u97e5\u9615\u96b3\u9646\u96bf\u9697\u972f\u9749\u9724\u978c", 38175));
            return true;
        }
        if (iIIO.lO0I == 8) {
            boolean bl;
            if (this.IoOO) {
                if (l >= this.I_OI) {
                    this.I_OI = l + 1000L;
                    int n = iIIO.l1__ + 3;
                    iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + iOol.Illo() / 100 * n);
                    iOol._loI = Math.min(iOol.Il1(), iOol._loI + iOol.Il1() / 100 * n);
                    if (++this._I0l >= 3 + this.IIlO.nextInt(3) || iOol.llIl >= iOol.Illo() && iOol._loI >= iOol.Il1()) {
                        this.IoOO = false;
                        this.IIlo.II(new IO0o(-45).II(3).IIII(this.IIoO()).III(-1));
                    }
                }
                return true;
            }
            boolean bl2 = bl = iOol.llIl * 100 / Math.max(1, iOol.Illo()) <= 20 || iOol._loI * 100 / Math.max(1, iOol.Il1()) <= 20;
            if (bl && this.II(2, iIIO, l) && this.II(iIIO) <= iOol._loI) {
                this.IIIo[2] = l;
                iOol._loI -= this.II(iIIO);
                this.IoOO = true;
                this._I0l = 0;
                this.I_OI = l + 1000L;
                this.IIlo.II(new IO0o(-45).II(1).IIII(this.IIoO()).III(iIIO.I1l));
                return true;
            }
        }
        return false;
    }

    private boolean III_(long l) {
        IOol iOol = this.III();
        IOO.IIIO iIIO = this.II(3);
        if (iIIO == null) {
            return false;
        }
        if (iIIO.lO0I == 13) {
            if (iOol._lo_ > 0 || !this.II(3, iIIO, l) || this.II(iIIO) > iOol._loI) {
                return false;
            }
            this.IIIo[3] = l;
            iOol._loI -= this.II(iIIO);
            iOol._lo_ = Math.max(1, iIIO.l1__);
            this.I_Ol = l + (long)(iOol._lo_ + 5) * 10000L;
            this.IIlo.II(new IO0o(-45).II(6).IIII(this.IIoO()).III(iIIO.I1l));
            iOol.llIl = Math.min(iOol.Illo(), iOol.llIl * 2);
            this.l1I();
            return true;
        }
        if (iIIO.lO0I == 19) {
            if (iOol.Ioo0 || !this.II(3, iIIO, l) || this.II(iIIO) > iOol._loI) {
                return false;
            }
            this.IIIo[3] = l;
            iOol._loI -= this.II(iIIO);
            iOol.Ioo0 = true;
            this.I_O1 = l + (long)(iIIO.l1__ + 2) * 5000L;
            this.IIlo.II(new IO0o(-124).II(1).II(0).II(33).IIII(this.IIoO()).IIII(this.IIoO()));
            return true;
        }
        if (iIIO.lO0I == 12) {
            if (this.IoO0 || !this.II(3, iIIO, l) || this.II(iIIO) > iOol._loI) {
                return false;
            }
            this.IIIo[3] = l;
            iOol._loI -= this.II(iIIO);
            int n = Math.max(1, Math.min(8, iIIO.l1__));
            int n2 = (new int[]{8, 11, 32, 25, 43, 49, 50, 96})[n - 1];
            this._I01 = (int)((long)iOol.Illo() * (long)(new int[]{30, 40, 50, 60, 70, 80, 90, 100})[n - 1] / 100L);
            this.IoO0 = true;
            this.I_O_ = l + (long)(n + 5) * 20000L;
            this.I_OO = l + 2500L;
            this.IIlo.II(new IO0o(-95).II(0).IIII(this.IIoO()).III(n2).IIII(this._I01));
            return true;
        }
        return false;
    }

    private void l1Io() {
        if (!this.IoO0) {
            return;
        }
        this.IoO0 = false;
        this.IIlo.II(new IO0o(-95).II(6).IIII(this.IIoO()));
        this.IIlo.II(new IO0o(-95).II(7).IIII(this.IIoO()));
    }

    private void IIlI(long l) {
        if (!this.IoO0) {
            return;
        }
        if (l >= this.I_O_ || !this.I0oI) {
            this.l1Io();
            return;
        }
        if (l < this.I_OO) {
            return;
        }
        this.I_OO = l + 2500L;
        IOoI.III[] iIIArray = this.IIlo.IIIl.II();
        int n = -1;
        int n2 = 0x40000000;
        for (int i = 0; i < iIIArray.length; ++i) {
            IOoI.III iII = iIIArray[i];
            if (iII.IoOo || iII.l0o1 == 0 || iII.III != null || iII.l0o1 == 117) continue;
            int n3 = Math.abs(iII.I1 - this.loOl) + Math.abs(iII.I1I - this.loO1) * 2;
            if (Math.abs(iII.I1 - this.loOl) > 300 || Math.abs(iII.I1I - this.loO1) > 160 || n3 >= n2) continue;
            n2 = n3;
            n = i;
        }
        if (n < 0) {
            return;
        }
        this.IIlo.II(new IO0o(-95).II(1).IIII(this.IIoO()).II(n));
        this.III(n, l);
        this.IIlo.IIIl.II(n, Math.max(1, this.III().Il1I()), false, this.III());
    }

    private void IIll(long l) {
        IOol iOol = this.III();
        if (iOol._lo_ > 0 && l >= this.I_Ol) {
            iOol._lo_ = 0;
            iOol.llIl = Math.min(iOol.llIl, iOol.Illo());
            this.IIlo.II(new IO0o(-90).II(-1).IIII(this.IIoO()));
            this.l1I();
        }
        if (iOol.Ioo0 && l >= this.I_O1) {
            iOol.Ioo0 = false;
        }
        this.IIlI(l);
    }

    private void IIl1(long l) {
        IOol iOol = this.III();
        IOoI.III[] iIIArray = this.IIlo.IIIl.II();
        if (iIIArray == null) {
            return;
        }
        for (int i = 0; i < iIIArray.length; ++i) {
            int n;
            IOoI.III iII = iIIArray[i];
            if (iII.IoOo || iII.III != null || iII.l0o1 == 0 || iII.l0o1 == 117 || l < iII.I110 || i >= this.IIl.length || l - this.IIl[i] > 6000L || l - this.IIlI[i] < 2000L || Math.abs(iII.I1 - this.loOl) > 300 || Math.abs(iII.I1I - this.loO1) > 200) continue;
            this.IIlI[i] = l;
            if (this.IIlO.nextInt(2) == 0) continue;
            int n2 = iII._l_O > 0 ? iII._l_O : (n = iII._l__ * (iII.II == null ? 5 : iII.II.l0o) / 100);
            if (iII.IooO) {
                n *= 2;
            }
            if (this.II().IlI0(522)) {
                n /= 2;
            }
            if (this.IIlO.nextInt(100) < iOol.Il10()) {
                n = 0;
            } else {
                n -= n / 100 * iOol.Il1O();
                if ((n -= iOol.Il1_()) < 1) {
                    n = 1;
                }
                if (iOol.Ioo0) {
                    n = 1;
                }
                if (n > iOol.Illo() * 35 / 100) {
                    n = Math.max(1, iOol.Illo() * 35 / 100);
                }
            }
            iOol.llIl -= n;
            if (iOol.llIl < 0) {
                iOol.llIl = 0;
            }
            this.IIlo.II(new IO0o(-10).II(iII._l_1).IIII(this.IIoO()).IIII(iOol.llIl).IIII(iOol._loI));
            int n3 = iOol.Il1o();
            if (n3 > 0 && n3 > 0 && !iII.IoOo) {
                int n4 = PSTPatch.monster(iII, n, n3);
                if (n4 >= iII.llIl) {
                    n4 = iII.llIl - 1;
                }
                if (n4 > 0) {
                    iII.llIl -= n4;
                    this.IIlo.II(new IO0o(-9).II(iII._l_1).IIII(iII.llIl).IIII(n4).II(false).II(36));
                }
            }
            if (iOol.llIl > 0) continue;
            this.IIl_(l);
            return;
        }
    }

    private void IIl_(long l) {
        this.IoOo = true;
        this.I_O0 = l;
        this.III = null;
        this.IoOO = false;
        this.l1Io();
        this.III()._lo_ = 0;
        this.III().Ioo0 = false;
        this.I__o();
        this.IIlo.IIIl.IIol(IOo.I1Ol("\u940f\u8bf9\u957d\u9508\u8b76\u959a\u94c8\u951b\u9637\u9654\u889e\u9654\u9782\u9653\u96bf\u9698\u972f\u974c\u89ec\u9705\u97a7\u978a\u97ba\u8955\u9827\u984e\u8696\u980d\u98a3\u98d1\u98a8\u988e\u9897\u993e\u994e\u993d\u990e\u99ba\u998b\u99f8\u9987\u9a7e\u9acf\u9a20", 38175));
    }

    private void Il1o() {
        IOol iOol = this.III();
        this.IoOo = false;
        iOol.llIl = iOol.Illo();
        iOol._loI = iOol.Il1();
        IOol iOol2 = this.II();
        this.loOl = iOol2.I1 + this.IIlO.nextInt(21) - 10;
        this.loO1 = iOol2.I1I;
        if (this.Il_o()) {
            this.I__0();
            this.II_1(IOo.I1Ol("\u954c\u948e\u957d\u950c\u95f3\u8b5f\u95f9\u9459\u967e\u9616\u9636\u961b\u96fd\u9692\u97c0\u9612\u9776\u970e\u9723\u9784", 38175));
        }
    }

    private void IIlO(long l) {
        if (l - this.I_1o < 10000L) {
            return;
        }
        this.I_1o = l;
        this.II_1(IOo.I1Ol("\u954c\u948e\u957d\u950c\u95f3\u8b5f\u95f9\u9459\u967e\u9616\u9636\u961c\u96fc\u9692\u96b2\u969f\u9761\u970e\u965c\u89c1\u97fe\u978a\u97bd\u9780\u86a0\u9848", 38175));
        this.IIlo.IIIl.l1O_();
    }

    void IIOl(int n, int n2) {
        IOol iOol = this.II();
        if (iOol == null || iOol.III == null || !this.I0oI) {
            return;
        }
        IOol iOol2 = iOol.III;
        iOol2._l0_ = Math.min(iOol2._l0O, iOol2._l0_ + 100 * n2);
        iOol2.llIl = Math.min(iOol2.Illo(), iOol2.llIl + n);
        iOol2._loI = Math.min(iOol2.Il1(), iOol2._loI + n);
        this.II_1(IOo.I1Ol("\u955c\u95df\u9530\u955c\u943a\u95d4\u95f9\u958b\u97a7\u9616\u9625\u961c\u8876", 38175));
    }

    void IIl0(long l) {
        int n;
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol2 == null) {
            return;
        }
        if (iOol2.IO_l >= iOol2.IIIO()) {
            return;
        }
        if (iOol.IlI0(522)) {
            l *= 2L;
        }
        if ((n = iOol.IIo(160)) > 0) {
            l += l * (long)n / 100L;
        }
        l = iOol2.III0(l);
        if (iOol2.IO_l >= 60000000000L) {
            l -= l * 80L / 100L;
        }
        if (l <= 0L) {
            return;
        }
        iOol2.IO_l += l;
        iOol2.IO_1 += l;
        long l2 = iOol.III_((long)((double)l * 0.5));
        long l3 = iOol.IIIO();
        if (iOol.IO_l >= l3) {
            return;
        }
        if (iOol.IO_l + l2 > l3) {
            l2 = l3 - iOol.IO_l;
        }
        iOol.IO_l += l2;
        iOol.IO_1 += l2;
        long l4 = l2 + this.IIlo.IIIl.III1(l2);
        if (l4 > 0L) {
            this.IIlo.II(new IO0o(-3).II(2).IIII((int)Math.min(Integer.MAX_VALUE, l4)));
        }
        this.IIlo.IIIl.l100();
    }

    private static String II(IOol iOol) {
        String[] stringArray = new String[]{IOo.I1Ol("\u954b\u954c\u95bc\u9515\u95bb\u94aa\u8b7c\u958c", 38175), IOo.I1Ol("\u9551\u955f\u9530\u8bc3\u95f8", 38175), IOo.I1Ol("\u9547\u955f\u9524\u9518\u95fa", 38175)};
        String string = stringArray[iOol.lOlI];
        String string2 = iOol.lOlI == 0 ? IOo.I1Ol("\u9571\u9556\u95bf\u9512", 38175) : string;
        String[] stringArray2 = new String[]{IOo.I1Ol("\u954b\u95dc\u9533\u955c\u95ef\u95d2\u8b3e", 38175), IOo.I1Ol("\u954b\u8b93\u952d\u955c\u95e8\u8b4b\u95f9\u958b\u97b6\u9616\u9636\u88d1\u96e3", 38175), IOo.I1Ol("\u954b\u8b93\u952d\u955c\u95e8\u8b4b\u95f9\u958c\u9665\u9643\u963b\u9613\u96b3\u96d1\u8874\u9680", 38175), IOo.I1Ol("\u954b\u8b93\u952d\u955c\u95e8\u8b4b\u95f9\u959b\u9676\u9659\u9675\u9617\u8836\u96c2", 38175), IOo.I1Ol("\u954b\u95dc\u9533\u955c\u95f9\u95d3\u95b7\u9590", 38175), IOo.I1Ol("\u955c\u9556\u9534\u8bc3\u95f5\u959a\u95bb\u9591\u9679\u965e", 38175), IOo.I1Ol("\u955c\u9556\u9534\u8bc3\u95f5\u959a\u95bb\u9591\u9679\u965e\u9675\u9617\u96f2\u96dd\u96f1\u9693\u89aa\u975e", 38175), IOo.I1Ol("\u9549\u8bf9\u957d\u951e\u95f2\u95d4\u95b1", 38175), IOo.I1Ol("\u9549\u8bf9\u957d\u951e\u95f2\u95d4\u95b1\u95d8\u967f\u9659\u96b5\u961a\u96f4\u9692\u96b6\u9699\u976e", 38175), IOo.I1Ol("\u954c\u9557\u95b7\u9509\u95bb", 38175) + string2 + IOo.I1Ol("\u953f\u955d\u8bf8\u950c\u95bb\u958b", 38175), IOo.I1Ol("\u954c\u9557\u95b7\u9509\u95bb", 38175) + string2 + IOo.I1Ol("\u953f\u955d\u8bf8\u950c\u95bb\u9588", 38175), IOo.I1Ol("\u954c\u9557\u95b7\u9509\u95bb", 38175) + string2 + IOo.I1Ol("\u953f\u955d\u8bf8\u950c\u95bb\u9589", 38175), IOo.I1Ol("\u954c\u9557\u95b7\u9509\u95bb", 38175) + string2 + IOo.I1Ol("\u953f\u955d\u8bf8\u950c\u95bb\u958e", 38175), IOo.I1Ol("\u954b\u9556\u8bfa\u9512\u95bb", 38175) + string + IOo.I1Ol("\u953f\u955d\u8bf8\u950c\u95bb\u958b", 38175), IOo.I1Ol("\u954b\u9556\u8bfa\u9512\u95bb", 38175) + string + IOo.I1Ol("\u953f\u955d\u8bf8\u950c\u95bb\u9588", 38175), IOo.I1Ol("\u954b\u9556\u8bfa\u9512\u95bb", 38175) + string + IOo.I1Ol("\u953f\u955d\u8bf8\u950c\u95bb\u9589", 38175), IOo.I1Ol("\u9558\u9557\u8b86\u9515\u95bb\u95ec\u9469\u9459\u9679\u9651\u9675\u9620\u96fb\u8815\u96bf\u96d0\u976c\u898b\u973d\u974c\u97ba", 38175), IOo.I1Ol("\u9558\u9557\u8b86\u9515\u95bb\u95ec\u9469\u9459\u9679\u9651\u9675\u9620\u96fb\u8815\u96bf\u96d0\u976c\u898b\u973d\u974c\u97b9", 38175), IOo.I1Ol("\u9558\u9557\u8b86\u9515\u95bb\u95ec\u9469\u9459\u9679\u9651\u9675\u9620\u96fb\u8815\u96bf\u96d0\u976c\u898b\u973d\u974c\u97b8", 38175), IOo.I1Ol("\u954b\u9556\u9534\u9596\u95f5\u959a\u94c8\u8b59\u9678", 38175), IOo.I1Ol("\u9574\u8b85\u957d\u9514\u94f2\u95c3\u95f9\u959c\u967e\u88f1\u9621\u9654\u96e5\u97db\u96f1\u9684\u977d\u89cb", 38175), IOo.I1Ol("\u9569\u95ca\u957d\u946d\u8b50\u95d9\u95b1\u95d8\u9706\u9657\u9675\u9613\u96fa\u8869\u96b8", 38175)};
        int n = iOol.II0o();
        return stringArray2[Math.min(n, stringArray2.length - 1)];
    }

    void ll_() {
        int n;
        String[] stringArray;
        int n2;
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol == null || iOol2 == null) {
            return;
        }
        int n3 = this.II00() >= 2 ? 9 : 7;
        IO0o iO0o = new IO0o(-107).II(2).III(this.IIo0()).II(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            stringArray = iOol2.II[n2];
            if (stringArray.II1_()) {
                iO0o.III(-1);
                continue;
            }
            iO0o.III(stringArray.I1l).IIII(stringArray.lo0I).II("").II("");
            if (stringArray.IIl.size() == 0) {
                iO0o.II(1).II(73).III(0);
                continue;
            }
            iO0o.II(stringArray.IIl.size());
            for (n = 0; n < stringArray.IIl.size(); ++n) {
                int[] nArray = (int[])stringArray.IIl.elementAt(n);
                iO0o.II(nArray[0]).III(nArray[1]);
            }
        }
        iO0o.IIII(iOol2.llIl).IIII(iOol2.Illo()).IIII(iOol2._loI).IIII(iOol2.Il1()).IIII(iOol2.Il1I()).II(iOol2.II1o).II(IOo.II(iOol2)).II(iOol2.IO_l).II(iOol2.IO_1);
        iO0o.II(iOol._10I).III(iOol2._l0_).III(iOol2._l0O).II(iOol2.Il1l()).III(iOol2.Il1_());
        n2 = this.II00() >= 2 ? 5 : 4;
        iO0o.II(n2);
        stringArray = new String[]{"", IOo.I1Ol("\u955c\u8b99\u9533\u955c\u948a\u8b1b\u95ad\u95d8\u9664\u88df\u9636\u9654\u96fe\u8813\u96bf\u9698\u972f\u971f\u9778\u975c\u97ff\u97d8\u97e9\u96f9\u86c4\u9806\u9828\u86bb", 38175), IOo.I1Ol("\u955c\u8b99\u9533\u955c\u948a\u8b1b\u95ad\u95d8\u9664\u88df\u9636\u9654\u96fe\u8813\u96bf\u9698\u972f\u971f\u9739\u899b\u97be\u978a\u96d8\u892b\u9827\u984b\u869a", 38175), IOo.I1Ol("\u955c\u8b99\u9533\u955c\u948a\u8b1b\u95ad\u95d8\u9664\u88df\u9636\u9654\u96fe\u8813\u96bf\u9698\u972f\u971c\u977d\u9718\u897c\u978a\u96d8\u892b\u9827\u984b\u869a", 38175), IOo.I1Ol("\u955c\u8b99\u9533\u955c\u948a\u8b1b\u95ad\u95d8\u9664\u88df\u9636\u9654\u96fe\u8813\u96bf\u9698\u972f\u971a\u977d\u9718\u897c\u978a\u96d8\u892b\u9827\u984b\u869a", 38175)};
        for (n = 0; n < n2; ++n) {
            if (iOol2.I__l[n] != -1) {
                iO0o.III(iOol2.I__l[n]);
                continue;
            }
            iO0o.III(-1).II(stringArray[n]);
        }
        this.IIlo.II(iO0o);
    }

    private IO0l II(IOol iOol, IO0l iO0l) {
        Object object;
        int n;
        IOO.III iII = IOO.II(iO0l.I1l);
        if (iII == null) {
            return iO0l;
        }
        switch (iII.IoI_) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 11: 
            case 23: 
            case 24: 
            case 25: 
            case 27: 
            case 32: {
                break;
            }
            default: {
                this.IIlo.IIIl.II0o(IOo.I1Ol("\u954b\u954c\u953c\u9512\u95fc\u959a\u95bb\u8b33\u9637\u965d\u963d\u9680\u96fd\u96d5\u96f1\u9680\u9767\u97d7\u976d\u9704\u8968\u97da\u97e8\u97d9", 38175));
                return iO0l;
            }
        }
        if (iII.lOlI < 3 && iII.lOlI != iOol.lOlI) {
            this.IIlo.IIIl.II0o(IOo.I1Ol("\u954b\u954c\u953c\u9512\u95fc\u959a\u95bb\u8b33\u9637\u965d\u963d\u9680\u96fd\u96d5\u96f1\u9680\u9767\u97d7\u976d\u9704\u8968\u97da\u97e8", 38175));
            return iO0l;
        }
        if (!(iO0l.I1l != 691 && iO0l.I1l != 692 && iO0l.I1l != 693 || iOol.II[0].II1_() && iOol.II[5].II1_())) {
            this.IIlo.IIIl.II0o(IOo.I1Ol("\u9549\u954b\u9534\u955c\u95f7\u9548\u95b7\u959f\u9637\u9655\u888a\u961d\u96b3\u9653\u96be\u96d0\u961e\u89ed\u976d\u970f\u9778\u978a\u97bd\u9780\u86c4\u9806\u9836\u8689\u98a3\u98c6\u8624\u988e\u9898\u993e\u994c\u9929\u87dc\u99f4\u9999\u98c9\u999e\u9a36\u9a57\u9a3d\u84b0\u9afc", 38175));
            return iO0l;
        }
        long l = iII.I101;
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            object = (int[])iO0l.IIl.elementAt(n);
            if (object[0] != 21) continue;
            l = (long)object[1] * 1000000000L;
            break;
        }
        if (iOol.IO_l < l) {
            this.IIlo.IIIl.II0o(IOo.I1Ol("\u954c\u8bd7\u953e\u955c\u95f6\u8b1b\u95b7\u9590\u9637\u965d\u963d\u9680\u96fd\u96d5\u96f1\u97e1\u89e8\u970e\u9734\u9786\u97fe\u978a\u97aa\u894f\u9872\u9807", 38175));
            return iO0l;
        }
        if (iO0l.I1l == 544 || iO0l.I1l == 545 || iO0l.I1l == 546) {
            this.IIlo.IIIl.II0o(IOo.I1Ol("\u940f\u8bf9\u957d\u9508\u8b76\u959a\u95b2\u9590\u96e3\u9658\u9632\u9654\u96e7\u96da\u8812\u96d0\u977c\u89c3\u976d\u9708\u896e\u97c4\u97ae\u97c8\u9864\u8685\u982c\u9844\u98f7\u98d0\u98a0\u988e\u9898\u993e\u9953\u99bc\u9902\u99bb", 38175));
            return iO0l;
        }
        this.IIlo.IIIl.III(iO0l);
        this.IIlo.IIIl.IIII(iO0l);
        switch (iII.IoI_) {
            case 32: {
                n = 6;
                break;
            }
            case 11: 
            case 25: {
                if (this.II00() < 2) {
                    this.IIlo.IIIl.II0o(IOo.I1Ol("\u955c\u9556\u8b94\u955c\u948a\u8b7d\u95f9\u958c\u88fa\u9616\u9623\u961d\u96e3\u9692\u96bc\u882b\u9766\u970e\u973e\u8981\u97ab\u97ce\u892c\u9786\u9860\u9806\u9954\u99d4\u8660\u98c1\u98e1\u9896\u8652\u996a\u991d\u992c\u9913\u8733\u99d4\u99f8\u9999\u9af6\u9a4c\u9a75", 38175));
                    return iO0l;
                }
                n = iII.IoI_ == 11 ? 7 : 8;
                break;
            }
            case 23: 
            case 24: 
            case 27: {
                this.IIlo.IIIl.II0o(IOo.I1Ol("\u940f\u8bf9\u957d\u9508\u8b76\u959a\u95b2\u9590\u96e3\u9658\u9632\u9654\u96e7\u96da\u8812\u96d0\u977c\u89c3\u976d\u9708\u896e\u97c4\u97ae\u97c8\u9871\u868b\u9831\u9844\u98f3\u98ca\u8668\u988d\u98df\u9970\u99dd\u9925\u995a", 38175));
                return iO0l;
            }
            default: {
                n = iII.IoI_;
            }
        }
        object = iOol.II[n];
        iOol.II[n] = iO0l;
        return object;
    }

    void I1(int n) {
        IO0l iO0l;
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol2 == null || iOol2.IO_l < 1500000L) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u940f\u8bf9\u957d\u9508\u8b76\u959a\u95a9\u9590\u88b4\u965f\u9675\u9765\u8832\u96c6\u96f1\u96c1\u977b\u975c\u9778\u974c\u97f8\u8943\u97aa\u97c8\u986a\u8687\u982b\u980c\u98a3\u98cf\u861a\u9889\u98df\u997d\u99ce\u997c\u990f\u99f2\u877a\u99f8\u999a\u84a1\u9a56", 38175));
            return;
        }
        if (n < 0 || n >= iOol.III.length) {
            return;
        }
        IO0l iO0l2 = iOol.III[n];
        if (iO0l2.II1_()) {
            return;
        }
        iOol.III[n] = iO0l = this.II(iOol2, iO0l2);
        this.II1_(iO0l != iO0l2);
    }

    void I1I(int n) {
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol2 == null || n < 0 || n >= (this.II00() >= 2 ? 9 : 7)) {
            return;
        }
        IO0l iO0l = iOol2.II[n];
        if (iO0l.II1_()) {
            return;
        }
        if (!this.IIlo.IIIl.III0(iO0l)) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9557\u95de\u9533\u9514\u95bb\u95ce\u95ab\u9599\u9679\u9651\u9675\u961f\u96fb\u9646\u96bf\u9697\u972f\u974d\u97bf\u9702\u97ab\u97c9\u97a1\u893f\u9827\u9852\u9837\u86b5\u98ed\u98c5", 38175));
            return;
        }
        iOol2.II[n] = new IO0l();
        this.II1_(true);
    }

    private void II1_(boolean bl) {
        IOol iOol = this.III();
        this.IIlo.IIIl.l1_l();
        this.IIlo.IIIl.l1_1();
        if (bl) {
            iOol.llIl = Math.min(iOol.llIl, iOol.Illo());
            iOol._loI = Math.min(iOol._loI, iOol.Il1());
            this.IIlo.ll_0();
            this.ll_();
        }
        this.l1I();
        this.IIlo.I__O();
    }

    private static boolean II(IO0l iO0l, int n, int n2) {
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            if (nArray[0] != n || nArray[1] < n2) continue;
            return true;
        }
        return false;
    }

    boolean II(int n, IO0l iO0l) {
        IOol iOol = this.II();
        switch (iO0l.I1l) {
            case 400: {
                if (iOol.III == null) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f8\u95d2\u9469\u9599\u9637\u9655\u96a6\u9654\u9782\u8875\u96f1\u9684\u89e2", 38175));
                    return true;
                }
                this.Io0I = true;
                this.IIlo.II(new IO0o(-125).II(IOo.I1Ol("\u940f\u8b89\u9529\u955c\u95ef\u9550\u95b7\u95d8\u9674\u965e\u963a\u9654\u9782\u8875\u96f1\u9684\u89e2", 38175)).II(1).II(IOo.I1Ol("\u954b\u95d4\u9533\u955c\u95f6\u8b61\u95b0\u95d8\u963f\u9642\u8884\u961d\u96b3\u97a3\u96b0\u96d0\u973e\u971e\u976d\u9707\u9776\u978a\u97bd\u8919\u982e", 38175)).II(1));
                return true;
            }
            case 568: {
                if (iOol.lIII) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u948a\u9559\u95f9\u959b\u96e4\u9616\u9624\u9601\u8830\u9692\u96a5\u9682\u89e6\u9740\u972a\u974c\u97e5\u9740\u97a7\u97c8\u986c\u984e\u98b1\u980a\u98e4\u9882\u98b5\u9888\u863c\u993e\u994e\u87b1\u995b\u99fe\u875c\u99b6\u9990", 38175));
                    return true;
                }
                iOol.lIII = true;
                iOol.IOoO = System.currentTimeMillis();
                iOol.IOo0 = 432000000L;
                this.IIlo.IIIl.IIOo(n, 1);
                this.l1l();
                return true;
            }
            case 401: {
                if (iOol.III == null) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u9554\u9556\u95a9\u9512\u95fc\u959a\u95ad\u9590\u88d4\u9616\u9621\u961c\u8862\u96d1\u96f1\u9698\u9766\u89e9\u9723", 38175));
                    return true;
                }
                this.IIlo.IIIl.IIOo(n, 1);
                this.IIIO(0, (iOol.III.lOlI + 1) % 3, iOol.III._11_);
                return true;
            }
            case 402: 
            case 403: 
            case 404: 
            case 759: {
                IOO.IIIO iIIO;
                if (iOol.III == null) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u9554\u9556\u95a9\u9512\u95fc\u959a\u95ad\u9590\u88d4\u9616\u9621\u961c\u8862\u96d1\u96f1\u9698\u9766\u89e9\u9723", 38175));
                    return true;
                }
                int n2 = iO0l.I1l == 759 ? 3 : iO0l.I1l - 402;
                IOO.IIIO iIIO2 = this.II(n2);
                IOO.IIIO iIIO3 = iIIO = iIIO2 == null || iIIO2.l1__ + 1 > 7 ? null : IOO.II(iIIO2.lO0I, iIIO2.l1__ + 1);
                if (iIIO == null) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u9554\u9556\u95a9\u9512\u95fc\u959a\u95ad\u9590\u88d4\u9616\u9621\u961c\u8862\u96d1\u96f1\u9698\u9766\u89e9\u9723", 38175));
                    return true;
                }
                iOol.III.I__l[n2] = iIIO.I1l;
                this.II_1(IOo.I1Ol("\u955c\u95df\u9530\u955c\u943a\u95d4\u95f9\u958b\u97a7\u9616\u9625\u961c\u8876", 38175));
                this.IIlo.IIIl.IIOo(n, 1);
                this.IIlo.I__O();
                return true;
            }
            case 1758: 
            case 1759: 
            case 1760: {
                if (iOol.III == null) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u9551\u9559\u94ed\u94dd\u95f2\u959a\u95b5\u9518\u967a\u9616\u9632\u9698\u96b3\u96d1\u9622\u96d0\u961e\u89e9\u976d\u9718\u8966\u9795", 38175));
                    return true;
                }
                int n3 = iO0l.I1l - 1757;
                if (iOol.III.I__l[n3] == -1) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u95d2\u954a\u957d\u9512\u95f3\u8b1f\u95ad\u95d8\u9706\u88f1\u9675\u9600\u887e\u9692\u96bf\u9697\u96bf\u968f\u9724\u974c\u97fb\u97c2\u896a\u9781\u9827\u9845\u98b6\u9844\u98e0\u98ca\u98a8\u980a\u988a\u993e", 38175) + (n3 + 1) + IOo.I1Ol("\u953f\u955d\u9535\u8b95\u95ba", 38175));
                    return true;
                }
                this.IIlo.IIIl.IIOo(n, 1);
                if (n3 == 1) {
                    this.l1I1();
                } else if (n3 == 2) {
                    this.l1I_();
                } else {
                    this.l1IO();
                }
                return true;
            }
            case 1795: {
                if (!IOo.II(iO0l, 250, 3000)) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u955c\u8b99\u9533\u955c\u9576\u95ce\u95f9\u9596\u967f\u8893\u9621\u9654\u96a0\u9682\u96e1\u96c0\u972f\u975d\u89a4\u970f\u97ab\u97c7\u8968\u9786\u986f\u9806\u980e\u980d\u98ef\u98cb\u98b2\u98c0\u99ee\u87dd\u991d\u9931\u87a4\u99bb", 38175));
                    return true;
                }
                if (iOol.III == null || iOol._10l != 1 || iOol.III.IO_l < 40000000000L) {
                    this.IIlo.IIIl.IIol(IOo.I1Ol("\u955c\u8b99\u9533\u955c\u95f8\u9549\u95f9\u94e9\u88d0\u9616\u9618\u9615\u96f1\u9702\u96f1\u97e1\u89ae\u975a\u976d\u9758\u97bb\u978a\u97bd\u891f\u9827\u9855\u86ac\u9807\u98a3\u98cf\u8660\u988e\u9897\u993e\u982c\u879f\u995b\u99ee\u99d1\u8729\u9994\u9a36\u9a5d\u9a3d\u84b4\u9afc\u9a90", 38175));
                    return true;
                }
                this.IIlo.II.III(5, 1200, IOo.I1Ol("\u9551\u9559\u94ed\u94dd\u95f2\u959a\u95b4\u958d\u88c6\u9658\u9675\u9607\u884c\u9692\u96b9\u881f\u977a\u970e\u965c\u89ab\u97ab\u97c4\u9729\u9787\u9838", 38175), new String[]{IOo.I1Ol("\u954a\u954b\u953f\u951e", 38175), IOo.I1Ol("\u9554\u9557\u9539\u955c\u95d9\u95df\u95bc\u958a", 38175), IOo.I1Ol("\u9554\u9557\u9539\u955c\u95d1\u95d3\u95ab\u959d\u9679", 38175), IOo.I1Ol("\u954b\u8bd5\u957d\u951f\u95f3\u8b6b\u95b0", 38175)});
                return true;
            }
        }
        return false;
    }

    boolean IIlI(int n, int n2) {
        if (n != 1200) {
            return false;
        }
        IOol iOol = this.II();
        if (n2 < 0 || n2 > 2) {
            return true;
        }
        int n3 = -1;
        for (int i = 0; i < iOol.III.length; ++i) {
            if (iOol.III[i].I1l != 1795 || !IOo.II(iOol.III[i], 250, 3000)) continue;
            n3 = i;
            break;
        }
        if (n3 < 0 || iOol.III == null || iOol._10l != 1 || iOol.III.IO_l < 40000000000L) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u955c\u8b99\u9533\u955c\u95f8\u9549\u95f9\u94e9\u88d0\u9616\u9618\u9615\u96f1\u9702\u96f1\u97e1\u89ae\u975a\u976d\u9758\u97bb\u978a\u97bd\u891f\u9827\u9855\u86ac\u9807\u98a3\u98cf\u8660\u988e\u9897\u993e\u982c\u879f\u995b\u99ee\u99d1\u8729\u9994\u9a36\u9a5d\u9a3d\u84b4\u9afc\u9a90", 38175));
            return true;
        }
        this.IIlo.IIIl.IIOo(n3, 1);
        this.IIIO(2 + n2, iOol.lOlI, iOol.III._11_);
        this.IIlo.IIIl.IIol(IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u948a\u9559\u95f9\u9596\u967f\u889b\u963b\u9654\u9782\u9702\u8832\u9693\u972f\u963f\u898a\u974c\u97ff\u8947\u97e9\u9785\u86dc\u984f\u9864", 38175));
        return true;
    }

    boolean IlO() {
        IOol iOol = this.II();
        if (iOol.III == null) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9551\u9559\u94ed\u94dd\u95f2\u959a\u95b5\u9518\u967a\u9616\u9632\u9698\u96b3\u96d1\u9622\u96d0\u961e\u89e9\u976d\u9718\u8966\u9795", 38175));
            return false;
        }
        if (iOol.III.I__l[1] == -1) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u95d2\u954a\u957d\u9512\u95f3\u8b1f\u95ad\u95d8\u9706\u88f1\u9675\u9600\u887e\u9692\u96bf\u9697\u96bf\u968f\u9724\u974c\u97fb\u97c2\u896a\u9781\u9827\u9845\u98b6\u9844\u98e0\u98ca\u98a8\u980a\u988a\u993e\u990f\u997c\u9918\u99f2\u8750\u99f9", 38175));
            return false;
        }
        this.l1I1();
        if (iOol.III.I__l[2] != -1) {
            this.l1I_();
        }
        return true;
    }

    boolean IlOI() {
        int[] nArray;
        int n;
        IOol iOol = this.II();
        if (iOol.III == null) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9551\u9559\u94ed\u94dd\u95f2\u959a\u94c8\u951a\u9662\u9616\u9636\u9687\u96b3\u97a3\u8816\u96d0\u977b\u89c3", 38175));
            return false;
        }
        IO0l iO0l = iOol.III.II[2];
        if (iO0l == null || iO0l.II1_()) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u940f\u8bf9\u957d\u9512\u95fc\u940a\u9478\u9591\u9637\u965e\u963c\u88b3\u96fd\u9692\u96a5\u8851\u9766\u970e\u972e\u979f\u97ab\u96bb\u97ac\u9787\u9827\u9841\u9946\u980a\u98e4\u9882\u99d0\u9802\u988a", 38175));
            return false;
        }
        int n2 = 0;
        int n3 = -1;
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            nArray = (int[])iO0l.IIl.elementAt(n);
            if (nArray[0] != 72) continue;
            n2 = nArray[1];
            n3 = n;
            break;
        }
        if (n2 >= 7) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9558\u943d\u9533\u951b\u95bb\u95ce\u95b8\u9581\u9637\u9655\u88b2\u9615\u96b3\u97a3\u8816\u96d0\u9761\u9749\u96fd\u96cd\u97e2\u978a\u96d8\u970b\u9827\u9937\u86e4\u9810\u98a3\u98c1\u8664\u9890\u98df\u996a\u87ec\u9935\u995b\u988b\u99d8", 38175));
            return false;
        }
        if (n3 >= 0) {
            int[] nArray2 = (int[])iO0l.IIl.elementAt(n3);
            nArray2[1] = nArray2[1] + 1;
        } else {
            iO0l.III(72, 1);
        }
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            nArray = (int[])iO0l.IIl.elementAt(n);
            if (nArray[0] != 0) continue;
            nArray[1] = nArray[1] + nArray[1] * 10 / 100;
            break;
        }
        iOol.III.llIl = Math.min(iOol.III.llIl, iOol.III.Illo());
        this.IIlo.ll_0();
        return true;
    }

    boolean IlOl() {
        IOol iOol = this.III();
        int n = this.II00();
        if (iOol == null || n != 1 && n != 2 && n != 4) {
            return false;
        }
        this.Io0 = !this.Io0;
        this.l1I();
        this.II_1(n == 1 ? IOo.I1Ol("\u955d\u8bef\u957d\u9531\u957b\u95c3\u95f9\u95b4\u96f7\u9616\u9617\u97c4\u96b3\u96fc\u9639\u96d0\u972e\u970f\u976d\u972e\u963b\u9784\u97e7\u97aa\u99b7\u9808\u986b\u9826\u9933\u988c\u98ef\u98ad\u989e\u9930\u9913\u9912\u9913\u9978\u99d7\u99f6\u99d9\u9a54\u9b85\u9a7a\u9a5d\u9abc\u9a9f", 38175) : (n == 2 ? IOo.I1Ol("\u954b\u955f\u9532\u955c\u95f7\u955a\u95f9\u958c\u967f\u8891\u963b", 38175) : IOo.I1Ol("\u9557\u8bdf\u9534\u955c\u95f5\u95d2\u953b\u9596\u9637\u965a\u963a\u88d5\u96fa\u9692\u96a5\u9698\u89aa\u975e\u976d\u9707\u9762\u97c7\u97e8\u97c8\u984f\u98c5\u983c\u9844\u98e0\u98ca\u98a8\u980a\u9892\u993e\u9953\u993b\u98cb\u877b\u99d7\u99bf\u99d7\u9a60\u848e\u9a74\u9b62\u842b\u9ac1\u9af0\u9a8c\u85e9\u9b4c\u9b6c\u9b1f\u9beb\u9b88", 38175)));
        return true;
    }

    boolean IlO1() {
        return this.Io0I;
    }

    void IIl_(DataInputStream dataInputStream) throws IOException {
        int n;
        int n2 = dataInputStream.readByte();
        String[] stringArray = new String[n2];
        for (int i = 0; i < n2; ++i) {
            stringArray[i] = dataInputStream.readUTF();
        }
        this.Io0I = false;
        IOol iOol = this.II();
        if (iOol == null || iOol.III == null || n2 < 1) {
            return;
        }
        String string = stringArray[0].trim();
        int n3 = -1;
        for (n = 0; n < iOol.III.length; ++n) {
            if (iOol.III[n].I1l != 400 || iOol.III[n].lo0I <= 0) continue;
            n3 = n;
            break;
        }
        if (n3 < 0) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f8\u8b1d\u95b7\u95d8\u9663\u965e\u88ee\u9654\u9782\u8805\u96a5\u96d0\u977b\u97c4\u9723\u974c\u969a\u896d\u97e9\u979c\u86ea\u980a\u9865\u9809\u98f6\u98c3\u98e1\u9894\u865e\u9977\u991d\u990f\u991a\u99f4\u99cd\u99b9", 38175));
            return;
        }
        if (string.length() == 0) {
            return;
        }
        for (n = 0; n < string.length(); ++n) {
            if (Character.isLetterOrDigit(string.charAt(n))) continue;
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u954b\u95d4\u9533\u955c\u95f0\u95d2\u952d\u9596\u9670\u9616\u9744\u97c4\u8870\u96d1\u96f1\u9693\u9767\u89c7\u972c\u974c\u97e0\u9757\u97e9\u979c\u86f6\u9806\u9954\u86d3\u98e0\u9882\u98a3\u9889\u8638\u996a", 38175));
            return;
        }
        if (string.length() > 10) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u954b\u95d4\u9533\u955c\u95ea\u95cf\u9538\u95d8\u9673\u96d6\u963c", 38175));
            return;
        }
        iOol.III.II1o = IOo.I1Ol("\u953b", 38175) + string.toLowerCase();
        this.IIlo.IIIl.IIOo(n3, 1);
        this.I__o();
        if (this.Il_o()) {
            this.I__0();
        }
        this.II(1000L, IOo.I1Ol("\u955c\u8b9d\u9530\u955c\u943a\u95d4\u95f9\u958b\u97a7\u9616\u9625\u961c\u8876\u9692\u97c0\u9613\u972f\u963f\u89fa\u9718\u97ab\u97c9\u97a1\u9787\u9827\u9845\u982a\u980a\u98a3\u98d6\u982b\u988e\u98df", 38175) + string);
        this.IIlo.I__O();
    }

    int Il() {
        IOol iOol = this.II();
        long l = (iOol.IOoO + iOol.IOo0 - System.currentTimeMillis()) / 1000L;
        return l > 0L ? (int)l : 0;
    }

    void l1l() {
        int n;
        IOol iOol = this.II();
        if (iOol == null || !iOol.lIII || !this.Il_0()) {
            return;
        }
        int n2 = this.Il();
        long l = Math.max(1L, iOol.IOo0 / 1000L);
        int n3 = n = n2 == 0 ? 4 : (int)Math.min(3L, (l - (long)n2) * 4L / l);
        if (n < 0) {
            n = 0;
        }
        this.IIlo.II(new IO0o(-122).III(50).II(5).III(4664).III(4665).III(4666).III(4667).III(4668).II(n).IIII(n2));
    }

    private void IIII(int n, String string, String[] stringArray) {
        this.IIlo.II.III(50, n, string, stringArray);
    }

    void l1lI() {
        IOol iOol = this.II();
        if (!iOol.lIII || !this.Il_0()) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f8\u95d2\u9469\u9599\u9637\u9655\u96a6\u9654\u96e7\u96c0\u8838\u969e\u9768\u970e\u9700\u970d\u97ab\u97e8\u9679\u97c9", 38175));
            return;
        }
        this.l1l();
        if (this.Il() != 0) {
            this.IIII(500, IOo.I1Ol("\u955d\u948e\u957d\u951e\u942b\u959a\u95bb\u9448\u9639\u9618\u967b", 38175), new String[]{IOo.I1Ol("\u9557\u8bd9\u9524\u955c\u95f9\u8b75\u95d3\u958c\u9665\u88df\u963b\u9613", 38175), IOo.I1Ol("\u8bbb\u954e\u957d\u9512\u95f3\u95db\u95b7\u9590\u961d", 38175) + IO00.IIlI(1000000000L) + IOo.I1Ol("\u953f\u9548\u95bd\u9512\u95fc", 38175), IOo.I1Ol("\u940f\u95cd\u9533\u951b", 38175)});
        } else {
            this.IIII(501, IOo.I1Ol("\u955d\u948e\u957d\u951e\u942b\u959a\u95bb\u9448\u9639\u9618\u967b", 38175), new String[]{IOo.I1Ol("\u9551\u8be1", 38175), IOo.I1Ol("\u9557\u8bd9\u9524\u955c\u95f9\u8b75\u95d3\u958c\u9665\u88df\u963b\u9613", 38175), IOo.I1Ol("\u940f\u95cd\u9533\u951b", 38175)});
        }
    }

    boolean II1(int n, int n2) {
        IOol iOol = this.II();
        if (n < 500 || n > 503) {
            return false;
        }
        if (!iOol.lIII || !this.Il_0()) {
            return true;
        }
        switch (n) {
            case 500: {
                if (n2 == 0) {
                    this.IIII(503, IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f8\u9549\u95f9\u959b\u967f\u8899\u9636\u9654\u96f0\u96da\u887e\u969e\u972f\u9743\u9738\u89bd\u97e5\u978a\u97a1\u890f\u987e\u9806\u9827\u86ab\u98a3\u98d6\u98b3\u8609\u9891\u9979\u991d\u9911\u991a\u99f8\u9809\u99e7", 38175), new String[]{IOo.I1Ol("\u940f\u8bed\u9533\u951b\u95bb\u9547", 38175), IOo.I1Ol("\u954b\u8bd5\u957d\u951f\u95f3\u8b6b\u95b0", 38175)});
                    break;
                }
                if (n2 != 1) break;
                if (iOol.Il11 >= 1000000000L) {
                    iOol.Il11 -= 1000000000L;
                    iOol.IOo0 = 0L;
                    this.IIlo.IIIl.l1_();
                    this.l1l();
                    this.IIlo.I__O();
                    break;
                }
                this.IIlo.IIIl.IIol(IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f0\u95d2\u952d\u9596\u9670\u9616\u9744\u8893\u96b3\u96c4\u9631\u969e\u9768\u970e\u965c\u89af\u97ab\u97de\u97a1\u8919\u9864\u9806\u982d\u980d\u8644\u98cc\u98ed\u98c0\u989c\u99ec\u9953\u997c\u990f\u99f2\u99d0\u8767\u9982\u9a36", 38175) + IO00.IIlI(1000000000L - iOol.Il11) + IOo.I1Ol("\u953f\u9548\u95bd\u9512\u95fc", 38175));
                break;
            }
            case 501: {
                if (n2 == 0) {
                    this.IIII(502, IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f8\u9549\u95f9\u959b\u967f\u8899\u9636\u9654\u96f0\u96da\u887e\u969e\u972f\u974d\u9725\u9703\u97ab\u97de\u97bb\u8901\u9869\u9841\u9865\u980a\u865c\u989d\u98cb\u99f0\u8638\u993e\u9949\u87b1\u995b\u99f9\u875e\u99b9\u99d7\u9a74\u8494\u9a3a\u9a53\u9ae1\u840c\u9af0\u9bfe\u9abe\u85ce\u9b2f\u9b4b\u9bfe\u9bc1\u9ba9\u9b9e\u9c26\u9c51\u9c2c\u82dc\u9ca2\u9cc3\u8271\u9cb1\u9c99\u9d3d\u9c2d\u839c\u9d5a\u9dd4\u9dd9\u9db5\u9c46", 38175), new String[]{IOo.I1Ol("\u940f\u8bf9\u957d\u9511\u95fa\u95d8\u9469\u95f2\u9643\u9644\u96b4\u961d\u96b3\u97a2\u8874\u9684", 38175), IOo.I1Ol("\u940f\u8bf9\u957d\u9511\u95fa\u95d8\u9469\u95f2\u9659\u9657\u9638\u88cb\u96f0", 38175), IOo.I1Ol("\u940f\u8bf9\u957d\u9511\u95fa\u95d8\u9469\u95f2\u964f\u9657\u962c\u9610\u96f2", 38175), IOo.I1Ol("\u954b\u8bd5\u957d\u951f\u95f3\u8b6b\u95b0", 38175)});
                    break;
                }
                if (n2 != 1) break;
                this.IIII(503, IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f8\u9549\u95f9\u959b\u967f\u8899\u9636\u9654\u96f0\u96da\u887e\u969e\u972f\u9743\u9738\u89bd\u97e5\u978a\u97a1\u890f\u987e\u9806\u9827\u86ab\u98a3\u98d6\u98b3\u8609\u9891\u9979\u991d\u9911\u991a\u99f8\u9809\u99e7", 38175), new String[]{IOo.I1Ol("\u940f\u8bed\u9533\u951b\u95bb\u9547", 38175), IOo.I1Ol("\u954b\u8bd5\u957d\u951f\u95f3\u8b6b\u95b0", 38175)});
                break;
            }
            case 502: {
                if (n2 < 0 || n2 > 2 || this.Il() != 0) break;
                iOol.lIII = false;
                this.IIlo.II(new IO0o(-117).II(101));
                this.IIIO(1, n2, iOol.III != null ? iOol.III._11_ : -1);
                break;
            }
            case 503: {
                if (n2 != 0) break;
                iOol.lIII = false;
                this.IIlo.I__O();
                this.IIlo.IIIl.IIol(IOo.I1Ol("\u940f\u95dd\u957d\u9514\u8b7c\u95c3\u95f9\u959a\u88d8\u9616\u9621\u9606\u887a\u96dc\u96b6\u96d0\u9742\u974f\u972f\u96dc", 38175));
                break;
            }
        }
        return true;
    }

    boolean IlO_() {
        IOol iOol = this.II();
        IOol iOol2 = this.III();
        if (iOol2 == null) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9554\u9556\u95a9\u9512\u95fc\u959a\u95ad\u9590\u88d4\u9616\u9621\u961c\u8862\u96d1\u96f1\u9698\u9766\u89e9\u9723", 38175));
            return false;
        }
        if (iOol2._11_ >= 5) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u9558\u9557\u8b86\u9515\u95bb\u95d2\u8b78\u9596\u9637\u9645\u88bc\u9617\u96b3\u96df\u8870\u969e\u9767\u970e\u972e\u898b\u97ea\u978a\u96d8\u892f\u9827\u9852\u86a8\u9844\u9992\u9841\u98e1\u99f1\u865e\u996a\u991d\u9928\u87a0\u99f3\u9999\u99b5\u871e\u9a75\u9a15\u9a20\u84a2\u9afb\u9a91\u9bc1\u9a8e\u9b2e\u9b45\u9b25\u85ac\u9be4\u9b89\u9bbc\u8546\u9c6f", 38175));
            return false;
        }
        if (iOol.Il11 < 50000000L) {
            this.IIlo.IIIl.IIol(IOo.I1Ol("\u955d\u8b9f\u9533\u955c\u95f0\u95d2\u952d\u9596\u9670\u9616\u9744\u8893\u96b3\u96c4\u9631\u969e\u9768\u970e\u965c\u89af\u97ab\u97c7\u8916\u97c4\u9827\u9845\u98b7\u980a\u98a3\u98d6\u98a9\u9889\u8640\u996b\u991d", 38175) + IO00.IIlI(50000000L - iOol.Il11) + IOo.I1Ol("\u953f\u9548\u95bd\u9512\u95fc", 38175));
            return false;
        }
        ++iOol2._11_;
        iOol.Il11 -= 50000000L;
        this.IIlo.IIIl.IIol(IOo.I1Ol("\u9558\u9557\u8b86\u9515\u95bb\u95d2\u8b78\u9596\u9637\u9645\u88bc\u9617\u96b3\u96df\u8870\u969e\u9767\u970e\u972e\u898b\u97ea\u978a\u96d8\u892f\u9827\u9852\u86a8\u9844\u9992\u9841\u98e1\u99f1\u994f\u87fd\u995e\u997c\u990f\u9899\u99d7\u99bf\u99d7\u9a7a\u9adf\u9a3a\u9a53\u9aa3\u9a91\u9ab2\u8442\u9b6d", 38175));
        this.IIlo.IIIl.l1_();
        this.ll_();
        this.IIlo.I__O();
        return true;
    }

    long III_() {
        IOol iOol = this.III();
        return iOol == null ? 0L : iOol.III_();
    }

    boolean IlOO() {
        IOol iOol = this.III();
        return iOol == null || iOol._11_ >= 5;
    }

    private static /* synthetic */ String I1Ol(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

