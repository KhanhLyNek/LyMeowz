/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class IOOO {
    static final int lo1l = 1800000;
    static final int lo11 = 1;
    static final int lo1_ = 2;
    static final int lo1O = 3;
    static final int lo10 = 4;
    private final IO0 IIl;
    private final IOo_ IIl;
    private final IOoI IIII;
    private int IoI_;
    private int lOl_;
    private long I1O1;
    private boolean Io_I;
    private boolean Io_l;
    private boolean Io_1;
    private long I1o1;
    private long I1o_;
    private final HashSet<Integer> II = new HashSet();

    IOOO(IO0 iO0, IOo_ iOo_, IOoI iOoI) {
        this.IIl = iO0;
        this.IIl = iOo_;
        this.IIII = iOoI;
    }

    boolean Il1I() {
        return this.IoI_ != 0;
    }

    int II00() {
        return this.IoI_;
    }

    int II0o() {
        return this.lOl_;
    }

    static boolean IIO1(int n) {
        return n >= 147 && n <= 152 || n == 143 || n == 144 || n >= 135 && n <= 138 || n == 127 || n == 128;
    }

    synchronized boolean IIl1(int n, int n2) {
        int n3;
        if (this.Il1I()) {
            this.IIl.IIIl.IIol(IOOO.I1_I("\ud2c5\ud395\ud47d\ud455\ud471\ud404\ud4fd\ud4c1\ud4a3\ud48b\ud52b\ud55a\ud521\ud59b\ud5a7\ud5c4\ucb66\ud58a\ud623\ud649\ud629\ud681\ud61c", 54229));
            return false;
        }
        if (n2 < 1 || n2 > 110) {
            this.IIl.IIIl.IIol(IOOO.I1_I("\ud396\ucd51\ud463\ud412\ud460\ud45d\ud4be\ud49f\ud4fd", 54229));
            return false;
        }
        switch (n) {
            case 1: {
                n3 = 147;
                break;
            }
            case 2: {
                n3 = 143;
                break;
            }
            case 3: {
                int n4 = -1;
                for (int i = 0; i < this.IIl.II.III.length; ++i) {
                    if (this.IIl.II.III[i].I1l != 611 || this.IIl.II.III[i].lo0I <= 0) continue;
                    n4 = i;
                    break;
                }
                if (n4 < 0) {
                    this.IIl.IIIl.IIol(IOOO.I1_I("\ud39e\ud39c\ud4e7\ud45c\ud436\ud450\ud4fb\ud442\ud4a0\ud4cc\ud57f\ud542\ucbec\ud511\ud5a7\ud5c4\ucb66\ud58a\ud623\ud733\uc892\ud640\ud614\ud6f6\ud6d2\ud6fc\ud699\ud7fb\ud74c", 54229));
                    return false;
                }
                --this.IIl.II.III[n4].lo0I;
                if (this.IIl.II.III[n4].lo0I <= 0) {
                    this.IIl.II.III[n4] = new IO0l();
                }
                this.IIII.l1_l();
                n3 = 135;
                break;
            }
            case 4: {
                n3 = 127;
                break;
            }
            default: {
                return false;
            }
        }
        if (I0Io.II(n3) == null) {
            this.IIl.IIIl.IIol(IOOO.I1_I("\ud39e\ud39c\ud4e7\ud45c\ud436\ud450\ud4ec\ud45d\ud4ed\ud481\ud56a\ud55a\ud569\ud506\ud567\ud5df", 54229));
            return false;
        }
        if (!this.IIl.II01(n3)) {
            return false;
        }
        this.IoI_ = n;
        this.lOl_ = n2;
        this.I1O1 = System.currentTimeMillis();
        this.Io_I = false;
        this.Io_l = false;
        this.Io_1 = false;
        this.I1o1 = 0L;
        this.I1o_ = 0L;
        this.II.clear();
        this.IIl.II(new IO0o(-65).IIII(this.IIl.II.I1l).II(1));
        this.IIl.III_(n3, 100 + (int)(Math.random() * 200.0), 336);
        this.IIII.II00(IOOO.I1_I("\ud383\ud314\ud47c\ud412", 54229) + this.IIl0() + IOOO.I1_I("\ud3f5\ud397\ucab6\ud442\ud471", 54229) + n2);
        this.lI();
        return true;
    }

    private void lI() {
        if (this.IoI_ != 3) {
            return;
        }
        long l = System.currentTimeMillis();
        long l2 = this.I1o1 > 0L ? 60000L - (l - this.I1o1) : 1800000L - (l - this.I1O1);
        int n = (int)Math.max(1L, Math.min(l2 / 1000L, 32000L));
        this.IIl.II(new IO0o(65).II(1).II(IOOO.I1_I("\ud39d\ud395\ud47d\ud455\ud471\ud41b\ud4e7\ud4c1\ud4ed\ud48e\ud5ea\ud55f\ud573", 54229)).III(n));
    }

    private void lI1() {
        boolean bl = this.IoI_ == 3;
        IOol iOol = this.IIl.II;
        this.close();
        if (iOol != null) {
            this.IIl.II.II_o(bl ? 5 : 21 + iOol.lOlI, -1);
        }
    }

    private String IIl0() {
        return this.IoI_ == 1 ? IOOO.I1_I("\ud39e\ud39c\ud4fe\ud412\ud416\ud411\ud4fc\ud48e\ud485\uca0b\ud572\ud50a\ud50d\ud501\ucb40\ud5d2", 54229) : (this.IoI_ == 2 ? IOOO.I1_I("\ud396\ud39b\ud47d\ud412\ud541\ud5c0\uca52\ud4c0\ud4aa\ud4cc\ud559\ucb85\ud527\ud548\ud497\ucb7f\ud5a6", 54229) : (this.IoI_ == 3 ? IOOO.I1_I("\ud397\ucd57\ud47d\ud412\ud541\ucaa3\ud4af\ud4e5\ud4a5\ud483\ud52b\ud568\ud5a8\ud51d", 54229) : IOOO.I1_I("\ud398\ud395\ud471\ud582\ud471\ud441\ud4bb\ud4c6", 54229)));
    }

    boolean IIO_(int n) {
        return (this.IoI_ == 1 || this.IoI_ == 2 || this.IoI_ == 3) && IOOO.IIO1(n);
    }

    synchronized void II10(int n, int n2) {
        this.II.add(n * 1000 + n2);
    }

    boolean IIIO(int n, int n2) {
        return this.IIO_(n) && this.II.contains(n * 1000 + n2);
    }

    int[] II(int n, int n2, int n3) {
        if (!this.IIO_(n)) {
            return null;
        }
        long[] lArray = this.II(n, n2, n3);
        return new int[]{(int)lArray[0], this.IIIO(n, n2) ? 0 : (int)lArray[0]};
    }

    void IlO(int n) {
        if (!this.Il1I()) {
            return;
        }
        this.lI();
        IOoI.III[] iIIArray = this.IIII.II();
        for (int i = 0; i < iIIArray.length; ++i) {
            IOoI.III iII = iIIArray[i];
            if (iII.III != null) continue;
            long[] lArray = this.II(n, i, iII.l0o1);
            iII._l__ = iII.lOlO = (int)lArray[0];
            iII._l_O = (int)lArray[1];
            iII.Ioo_ = false;
            iII.IooO = false;
            iII.IO1o = Long.MAX_VALUE;
            if (this.IIIO(n, i)) {
                iII.IoOo = true;
                iII.llIl = 0;
                if (iII.l0o1 == 71) {
                    this.IIl.II(new IO0o(102).II(7));
                    continue;
                }
                if (iII.l0o1 != 72) continue;
                this.IIl.II(new IO0o(102).II(6));
                continue;
            }
            iII.IoOo = false;
            iII.llIl = iII.lOlO;
            if (iII.l0o1 == 71 || iII.l0o1 == 72) continue;
            this.IIl.II(new IO0o(-13).II(iII._l_1).II(iII.l0o1).II(0).IIII(iII.llIl));
        }
    }

    private static boolean IIOO(int n) {
        return n >= 135 && n <= 138;
    }

    private boolean IIO0(int n) {
        I0Io.II iI = I0Io.II(n);
        if (iI == null) {
            return true;
        }
        for (int i = 0; i < iI.III.length; ++i) {
            if (this.II.contains(n * 1000 + i)) continue;
            return false;
        }
        return true;
    }

    private boolean IIOo(int n) {
        IO_I.III iII;
        if (!this.IIO0(n)) {
            return false;
        }
        return n != 137 || (iII = this.IIl.IIIl.II.II(IOOO.I1_I("\ud381\ud3a1\ud44b\ud47e\ud40e\ud432\ud4cb\ud4e5\ud48f", 54229))) != null && iII.llIl <= 0;
    }

    boolean II0(int n) {
        if (this.IoI_ != 3 || this.IIl.II == null) {
            return false;
        }
        if (!IOOO.IIOO(this.IIl.II.lOlo) || !IOOO.IIOO(n)) {
            return false;
        }
        return !this.IIOo(n) && !this.IIOo(this.IIl.II.lOlo);
    }

    private boolean Il10() {
        int n = 0;
        for (int i = 135; i <= 138; ++i) {
            I0Io.II iI = I0Io.II(i);
            if (iI == null) continue;
            n += iI.III.length;
        }
        return this.II.size() >= n;
    }

    private long[] II(int n, int n2, int n3) {
        double d;
        double d2;
        boolean bl;
        IOol iOol = this.IIl.II;
        double d3 = (double)this.lOl_ / 50.0;
        int n4 = Math.max(1, n3);
        double d4 = (double)iOol.Il1I() * (double)n4 * d3;
        double d5 = (double)iOol.Illo() / (double)n4 * d3;
        if (this.IoI_ == 1) {
            bl = n == 147 && n2 == 0 || n == 149 && n2 == 7 || n == 151 && n2 == 0 || n == 152 && (n2 == 0 || n2 == 33);
            d2 = bl ? d5 * 10.0 : d5;
            d = bl ? d4 * 893.3333333333334 : d4;
        } else if (this.IoI_ == 2) {
            bl = n2 == 5;
            d2 = bl ? d5 * 120.0 : d5;
            d = bl ? d4 * 120.0 : d4;
        } else if (this.IoI_ == 3) {
            boolean bl2;
            bl = n >= 135 && n <= 137;
            boolean bl3 = bl2 = n == 135 && (n2 == 5 || n2 == 10) || n == 136 && n2 == 5 || n == 137 && n2 == 5;
            if (bl) {
                d2 = bl2 ? d5 * 30.0 : d5;
                d = d4;
            } else {
                d2 = d5 * 7.75;
                d = d4 * 33.07786947183796;
            }
        } else {
            d2 = d5;
            d = d4;
        }
        long l = (long)Math.min(2.147483647E9, Math.max(1.0, d));
        long l2 = (long)Math.min(2.147483647E9, Math.max(1.0, d2));
        return new long[]{l, l2};
    }

    private boolean Il1o() {
        IOoI.III[] iIIArray = this.IIII.II();
        if (iIIArray.length == 0) {
            return false;
        }
        int n = 0;
        for (int i = 0; i < iIIArray.length; ++i) {
            if (iIIArray[i].III != null) continue;
            ++n;
            if (iIIArray[i].IoOo) continue;
            return false;
        }
        return n > 0;
    }

    void III1(long l) {
        if (!this.Il1I()) {
            return;
        }
        IOol iOol = this.IIl.II;
        if (iOol == null) {
            return;
        }
        if (!IOOO.IIO1(iOol.lOlo)) {
            this.close();
            return;
        }
        long l2 = 1800000L - (l - this.I1O1);
        if (l2 <= 0L || this.I1o1 > 0L && l - this.I1o1 >= 60000L) {
            this.IIII.II00(l2 <= 0L ? IOOO.I1_I("\ud39d\ucd4b\ud467\ud412\ud425\ud418\uca52\ud4c7\ud4ed\ud48b\ud562\ud54b\ud527\ud548", 54229) + this.IIl0() : IOOO.I1_I("\ud39d\ud395\ud47d\ud455\ud471\ud561\ud46c\ud48e\ud4be\uca41\ud57b\ud506\ud569\ud50a\ucb26\ud5c8\ud5e5\ud4f5\ud7b3\uc8c1\ud622\ud640\ud76e\ud72e\ud6dc\ud6fc\ud68d\uc9db\ud719\ud649\uc9d4\ud7f9\ud795\ud79f\ud792\ud87f\ud854", 54229));
            this.lI1();
            return;
        }
        if (this.IoI_ == 3) {
            if (this.I1o1 == 0L && l2 <= 60000L) {
                this.I1o1 = l;
                this.I1o_ = 0L;
                this.lI();
            }
            if (this.I1o1 > 0L && l - this.I1o_ >= 10000L) {
                this.I1o_ = l;
                this.IIII.II00(IOOO.I1_I("\ud396\ud315\ud47a\ud412\ud439\ud411\ud4e1\ud4c9\ud4ed\ud482\ud5eb\ud553\ud569\ud51b\ucb28\ud5d6\ud5e5\ud597\uc8ae\ud652\ud661\ud612\uc8ac\ud6f7\ud691\ud6fc\ud698\ud772\ud7c3\ud736\ud710\ud7b6\ud7c1\ud7b5\ud7d3\ud862\ud859\uc6f3\ud806\ud8ae\ud8df\uc611\ud882\ud92a\ud942\ud920\uc7a8\ud9ef\ud985\ud8d5\ud901\uda7b\uda01", 54229) + Math.max(1L, (60000L - (l - this.I1o1) + 999L) / 1000L) + IOOO.I1_I("\ud3f5\ud393\ud47a\ud4d0\ud428\ud450\ud4e1\uca41\ud4ac", 54229));
            }
        } else if (l2 <= 60000L && !this.Io_1) {
            this.Io_1 = true;
            this.IIII.II00(IOOO.I1_I("\ud385\ud39c\ud4e0\ud412\ud433\ucad3\ud4e1\ud48e\ud4a6\uca53\ud57f\ud50a\ud53d\ud500\ud57d\ud5c5\ud5e5\ud597\ud662\ud657\ud661\ud656\ud64f\ud6be\ud6da\ud6b5\ud619\ud763\ud719\ud736\uc998\ud7f7", 54229));
        }
        if (this.IoI_ == 4) {
            return;
        }
        if (this.Io_I) {
            if (this.IoI_ == 1 && !this.Io_l) {
                IO_I.III iII = this.IIl.IIIl.II.II(IOOO.I1_I("\ud391\ud3a6\ud44c\ud47e\ud408\ud433\ud4c7\ud4eb\ud488\ud4b3\ud55b\ud568", 54229));
                if (iII != null && iII.llIl <= 0) {
                    this.Io_l = true;
                    this.lllo();
                }
            } else {
                String string = this.IoI_ == 1 ? IOOO.I1_I("\ud39d\ud3b5\ud447\ud471\ud419\ud439\ud4d6\ud4ef\ud48e\ud4a7\ud554\ud57a\ud50b", 54229) : (this.IoI_ == 2 ? IOOO.I1_I("\ud396\ud3b5\ud457\ud47b\ud412\ud438\ud4d0\ud4fe\ud48f", 54229) : IOOO.I1_I("\ud381\ud3a1\ud44b\ud47e\ud40e\ud432\ud4cb\ud4e5\ud48f", 54229));
                IO_I.III iII = this.IIl.IIIl.II.II(string);
                if (iII != null && iII.llIl <= 0) {
                    if (this.IoI_ == 3) {
                        if (this.I1o1 == 0L && this.Il10()) {
                            this.IIII.II00(this.IIl0() + IOOO.I1_I("\ud3f5\ud39c\ud47c\ud4d2\ud43f\ud450\ud4fb\ud4c6\ud42d\ud482\ud563\ud50a\ud52a\ucbcd\ud5f7\ud586", 54229) + this.lOl_ + IOOO.I1_I("\ud3f4", 54229));
                            this.I1o1 = l;
                            this.I1o_ = 0L;
                            this.lI();
                        }
                    } else {
                        this.IIII.II00(this.IIl0() + IOOO.I1_I("\ud3f5\ud39c\ud47c\ud4d2\ud43f\ud450\ud4fb\ud4c6\ud42d\ud482\ud563\ud50a\ud52a\ucbcd\ud5f7\ud586", 54229) + this.lOl_ + IOOO.I1_I("\ud3f4", 54229));
                        this.lI1();
                    }
                }
            }
            return;
        }
        if (this.IoI_ == 3) {
            if (iOol.lOlo == 137 && this.IIO0(137)) {
                this.lll0();
            }
            return;
        }
        if (!this.II0I(iOol.lOlo)) {
            return;
        }
        IOoI.III[] iIIArray = this.IIII.II();
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < iIIArray.length; ++i) {
            if (iIIArray[i].III != null) continue;
            ++n;
            if (iIIArray[i].IoOo) continue;
            ++n2;
        }
        if (n > 0 && n2 > 0) {
            return;
        }
        this.lll0();
    }

    private boolean II0I(int n) {
        return this.IoI_ == 1 && n == 148 || this.IoI_ == 2 && n == 144 || this.IoI_ == 3 && n == 137;
    }

    private void lll0() {
        if (this.Io_I) {
            return;
        }
        this.Io_I = true;
        IOol iOol = this.IIl.II;
        IO_I iO_I = this.IIl.IIIl.II;
        if (this.IoI_ == 1) {
            int n = (int)Math.min((long)this.lOl_ * 1000L, 200000000L);
            int n2 = (int)Math.min(1000000L + (long)this.lOl_ * 15000000L, 2000000000L);
            n = 10000 + n;
            n2 = Math.min(n2, 2000000000);
            iO_I.II(IOOO.I1_I("\ud391\ud3a6\ud44c\ud47e\ud408\ud433\ud4c7\ud4eb\ud488\ud4b3\ud55b\ud568", 54229), -2080, IOOO.I1_I("\ud391\ud386\ud433\ud47e\ud428\ud413\ud4e7\ud4cb\ud4a8", 54229), new int[]{742, 743, 744, -1, -1, -1}, n, n2, 148, iOol.I1 + 200, iOol.I1I, new String[]{IOOO.I1_I("\ud3a9\ud3d9\ud422\ud44e\ud405\ud411\ud4af\ud5bf\uca2e\ud485\ud52b\ud549\ud5a8\ud50b\ud5a7\ud5c8\ud5a2\ud454\ud7a2\ud64b\ud661\ud60d\ud69c\ud6f7", 54229), IOOO.I1_I("\ud3a9\ud3d9\ud422\ud44e\ud413\ucabd\ud4e1\ud48e\ud4b5\ud48d\ud572\ud54e\ud528\ud548\ud5e4\ud547\ud5a6\ud5c4\ud66d\ud645\ud7f1\ud7c1\ud616\ud6be\ud6d0\ud6bd\ud68e\ud73a\ud628\uc999\ud719\ud7b6\ud7c1\uc90d\ud79a\ud832\ud920\ud839", 54229)}, IOOO.II(2));
            this.IIII.II00(IOOO.I1_I("\ud391\ud386\ud433\ud47e\ud428\ud413\ud4e7\ud4cb\ud4a8\ud4cc\ud573\ud55f\ucbec\ud51c\ud5a7\ud5ce\ud5ac\ucb23\ud66d\ud603", 54229));
        } else if (this.IoI_ == 2) {
            int n;
            int n3 = (int)Math.min(200000L * (long)this.lOl_, 200000000L);
            int n4 = (int)Math.min(2000000L * (long)this.lOl_, 2000000000L);
            for (n = 6; n >= 1; --n) {
                iO_I.II(IOOO.I1_I("\ud386\ud3b5\ud45a\ud46d", 54229) + n, -170 - n, IOOO.I1_I("\ud386\ucd25\ud433", 54229) + n, new int[]{642, 643, 644, -1, -1, -1}, 10000 + n3, 500000 + n4, 144, iOol.I1 + 60 * n, iOol.I1I, new String[0], IOOO.II(4));
            }
            n = (int)Math.min((long)n3 * 5L, 200000000L);
            int n5 = (int)Math.min((long)n4 * 5L, 2000000000L);
            iO_I.II(IOOO.I1_I("\ud39b\ud3b5\ud457\ud47b\ud412\ud42f\ud4df\ud4ec", 54229), -160, IOOO.I1_I("\ud39b\ud395\ud502\ud4df\ud432", 54229), new int[]{648, 649, 650, -1, -1, -1}, 10000 + n, 500000 + n5, 144, iOol.I1 + 300, iOol.I1I, new String[0], IOOO.II(4));
            int n6 = (int)Math.min((long)n * 10L, 200000000L);
            int n7 = (int)Math.min((long)n5 * 10L, 2000000000L);
            iO_I.II(IOOO.I1_I("\ud396\ud3b5\ud457\ud47b\ud412\ud438\ud4d0\ud4fe\ud48f", 54229), -150, IOOO.I1_I("\ud396\ud395\ud502\ud4df\ud432\ud418", 54229), new int[]{645, 646, 647, -1, -1, -1}, 10000 + n6, 500000 + n7, 144, iOol.I1 + 400, iOol.I1I, new String[]{IOOO.I1_I("\ud3a9\ud3d9\ud422\ud44e\ud407\ud559\ud4e1\ud4c6\ud4ed\ud48e\ud562\ucbed\ud53d\ud548\ud5e4\ud5ce\ud53f\ud5c4\ud66e\ud6c2\ud638\ud640\ud611\ud6f6\ud654\ud6f0\ud6db\ud754\ud758\ud778\ud666\ud77b\ud7d6", 54229)}, IOOO.II(new int[][]{{4, 7}, {3, 1}, {5, 1}, {1, 4}}));
            this.IIII.II00(IOOO.I1_I("\ud39b\ud39c\ud4e0\ud45f\ud471\ud428\ud4ee\ud4d7\ud4a9\ud48d\ud52b\ud552\ud53c\ucbcd\ud5f3\ud586\ud5ad\ud58d\uc8c4\ud64c\ud660", 54229));
        } else if (this.IoI_ == 3) {
            int n = (int)Math.min(200000L * (long)this.lOl_, 200000000L);
            int n8 = (int)Math.min(20000000L * (long)this.lOl_, 2000000000L);
            iO_I.II(IOOO.I1_I("\ud381\ud3a1\ud44b\ud47e\ud40e\ud432\ud4cb\ud4e5\ud48f", 54229), -600, IOOO.I1_I("\ud381\ud386\ud466\ud45c\ud436\ud450\ud475\ud4d7\ud4ed\ud4b4\ud56a\ud544\ud521\ud548\ud5cb\ud407", 54229), new int[]{135, 136, 137, -1, -1, -1}, n, n8, 137, 198, 456, new String[]{IOOO.I1_I("\ud3a9\ud3d9\ud422\ud44e\ud412\ud491\ud4ec\ud48e\ud4a3\ud48b\ud4bb\ud48b\ud520\ud548\ud5f3\ucb7d\ud5ac\ud5c4\ud670\uc8f3\ud661\ud612\uc8ac\ud6f7\ud69d\ud6b1\uc820\ud773\ud719\ud73f\uc9c0\ud7e6\ud795\ud7a4\ud79b\uc6b1\ud858\ud870\ud81b\ud8ef", 54229)}, IOOO.II(2));
            this.IIII.II00(IOOO.I1_I("\ud381\ud386\ud466\ud45c\ud436\ud450\ud4fa\ud453\ud4ed\ud4b4\ud56a\ud544\ud521\ud548\ud5cb\ud407\ud5e5\ud59c\ud676\uc887\ud635\ud640\ud617\ud6f7\uc87a\ud6b2\ud6da", 54229));
        }
    }

    private void lllo() {
        IO_I.III iII = this.IIl.IIIl.II.II(IOOO.I1_I("\ud391\ud3a6\ud44c\ud47e\ud408\ud433\ud4c7\ud4eb\ud488\ud4b3\ud55b\ud568", 54229));
        int n = (int)Math.min((long)(iII == null ? 10000 : iII.lllI) * 3L / 2L, 200000000L);
        int n2 = (int)Math.min((long)(iII == null ? 1000000 : iII.lOlO) * 3L / 2L, 2000000000L);
        this.IIl.IIIl.II.II(IOOO.I1_I("\ud39d\ud3b5\ud447\ud471\ud419\ud439\ud4d6\ud4ef\ud48e\ud4a7\ud554\ud57a\ud50b", 54229), -2070, IOOO.I1_I("\ud39d\ud395\ud467\ud451\ud439\ud419\ud4f6\ud4cf\ud4ae\ud487", 54229), new int[]{639, 640, 641, -1, -1, -1}, n, n2, 148, this.IIl.II.I1 + 200, this.IIl.II.I1I, new String[]{IOOO.I1_I("\ud3a9\ud3d9\ud422\ud44e\ud412\ud491\ud4ec\ud48e\ud4a3\ud48b\ud4bb\ud48b\ud520\ud548\ud5e3\ud547\ud5a8\ud5c4\ud66b\uc883\ud661\ud613\ud7cf\ud6be\ud6cd\ud6b4\uc81e\ud73a\ud74d\ud739", 54229), IOOO.I1_I("\ud3a9\ud3d9\ud422\ud44e\ud405\ud411\ud4af\ud4dd\uca70\ud4cc\ud57f\ud543\ud5a3\ud51d\ud5a7\ud5c2\ud5ac\ucb23\ud677\ud602\ud629\uc8df\ud60b\ud6be\ud6de\ud63d\ud698\ud73a\ud757\ud73f\ud6c7\ud637\ud7dc", 54229)}, IOOO.II(2));
        this.IIII.II00(IOOO.I1_I("\ud39d\ud395\ud467\ud451\ud439\ud419\ud4f6\ud4cf\ud4ae\ud487\ud52b\ud552\ud53c\ucbcd\ud5f3\ud586\ud5ad\ud58d\uc8c4\ud64c\ud660", 54229));
    }

    private static int[][] II(int n) {
        return new int[][]{{n, 1, 1000}, {n, 2, 1000}, {n, 3, 1000}, {n, 4, 1000}, {n, 5, 1000}, {n, 6, 1000}, {n, 7, 1000}};
    }

    private static int[][] II(int[][] nArray) {
        int[][] nArray2 = new int[nArray.length][3];
        for (int i = 0; i < nArray.length; ++i) {
            nArray2[i][0] = nArray[i][0];
            nArray2[i][1] = nArray[i][1];
            nArray2[i][2] = 1000;
        }
        return nArray2;
    }

    private void close() {
        if (this.IoI_ == 1) {
            this.IIl.IIIl.II.IIOO(IOOO.I1_I("\ud391\ud3a6\ud44c\ud47e\ud408\ud433\ud4c7\ud4eb\ud488\ud4b3\ud55b\ud568", 54229));
            this.IIl.IIIl.II.IIOO(IOOO.I1_I("\ud39d\ud3b5\ud447\ud471\ud419\ud439\ud4d6\ud4ef\ud48e\ud4a7\ud554\ud57a\ud50b", 54229));
        } else if (this.IoI_ == 2) {
            for (int i = 1; i <= 6; ++i) {
                this.IIl.IIIl.II.IIOO(IOOO.I1_I("\ud386\ud3b5\ud45a\ud46d", 54229) + i);
            }
            this.IIl.IIIl.II.IIOO(IOOO.I1_I("\ud39b\ud3b5\ud457\ud47b\ud412\ud42f\ud4df\ud4ec", 54229));
            this.IIl.IIIl.II.IIOO(IOOO.I1_I("\ud396\ud3b5\ud457\ud47b\ud412\ud438\ud4d0\ud4fe\ud48f", 54229));
        } else if (this.IoI_ == 3) {
            this.IIl.IIIl.II.IIOO(IOOO.I1_I("\ud381\ud3a1\ud44b\ud47e\ud40e\ud432\ud4cb\ud4e5\ud48f", 54229));
            this.IIl.II(new IO0o(65).II(1).II("").III(0));
        }
        this.IoI_ = 0;
    }

    private static /* synthetic */ String I1_I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

