/*
 * Decompiled with CFR 0.152.
 */
final class I0IO {
    private final IO0 II1o;
    private final IOo_ II10;
    private static final int[][] II_O = new int[][]{{555, 556, 562, 563, 561}, {557, 558, 564, 565, 561}, {559, 560, 566, 567, 561}};
    private static final int[][][] III_ = new int[][][]{new int[][]{{47, 700}, {21, 15}}, new int[][]{{22, 65}, {27, 10000}, {21, 15}}, new int[][]{{0, 3200}, {21, 17}}, new int[][]{{23, 40}, {28, 10000}, {21, 14}}, new int[][]{{14, 16}, {21, 18}}};
    private static final int[][] II_0 = new int[][]{{700, 65, 3200, 40}, {600, 55, 3000, 60}, {800, 60, 3500, 50}};
    static final int __l_ = 8701;
    static final int __lO = 8702;

    I0IO(IO0 iO0, IOo_ iOo_) {
        this.II1o = iO0;
        this.II10 = iOo_;
    }

    private static int IIl_(int n, int n2) {
        return n + (int)(Math.random() * (double)(n2 - n + 1));
    }

    private static int III(int[] nArray) {
        return nArray[(int)(Math.random() * (double)nArray.length)];
    }

    private static boolean Illl(int n) {
        return Math.random() * 100.0 < (double)n;
    }

    private void II(IO0l iO0l, int n, int n2) {
        int[][] nArray = III_[n2];
        for (int i = 0; i < nArray.length; ++i) {
            int n3 = nArray[i][1];
            if (n2 == 0) {
                n3 = II_0[n][0];
            } else {
                if (n2 == 1) {
                    iO0l.III(22, (int)Math.round((double)II_0[n][1] * (0.9 + Math.random() * 0.2)));
                    iO0l.III(27, (int)Math.round(10000.0 * (0.9 + Math.random() * 0.2)));
                    iO0l.III(21, (int)Math.round(15.0 * (0.9 + Math.random() * 0.2)));
                    return;
                }
                if (n2 == 2) {
                    n3 = II_0[n][2];
                } else if (n2 == 3) {
                    iO0l.III(23, (int)Math.round((double)II_0[n][3] * (0.9 + Math.random() * 0.2)));
                    iO0l.III(28, (int)Math.round(10000.0 * (0.9 + Math.random() * 0.2)));
                    iO0l.III(21, (int)Math.round(14.0 * (0.9 + Math.random() * 0.2)));
                    return;
                }
            }
            if (nArray[i][0] == 21) {
                n3 = nArray[i][1];
            }
            iO0l.III(nArray[i][0], (int)Math.round((double)n3 * (0.9 + Math.random() * 0.2)));
        }
    }

    private void III(IO0l iO0l, int n) {
        switch (n) {
            case 0: {
                iO0l.III(50, 12).III(77, 7).III(103, 12).III(101, 101).III(30, 0);
                break;
            }
            case 1: {
                iO0l.III(50, I0IO.IIl_(15, 30)).III(103, I0IO.IIl_(10, 20)).III(30, 0);
                break;
            }
            case 2: {
                iO0l.III(50, I0IO.IIl_(15, 30)).III(30, 0);
                break;
            }
            case 3: {
                iO0l.III(77, I0IO.IIl_(15, 25)).III(103, I0IO.IIl_(15, 25)).III(30, 0);
                break;
            }
            default: {
                iO0l.III(50, I0IO.IIl_(1, 10)).III(77, I0IO.IIl_(1, 10)).III(30, 0);
            }
        }
    }

    private void II(IO0l iO0l, int n, int n2, boolean bl, int n3, int n4) {
        iO0l.III(50, I0IO.IIl_(n, n2)).III(77, I0IO.IIl_(n, n2)).III(103, I0IO.IIl_(n, n2));
        if (bl) {
            iO0l.III(210, I0IO.IIl_(0, 2));
        }
        if (I0IO.Illl(n4)) {
            return;
        }
        iO0l.III(93, I0IO.IIl_(1, n3));
    }

    private int IIo_() {
        return this.II1o.IIIl.IlII();
    }

    private boolean II(int n, IO0l iO0l, String string) {
        this.II1o.IIIl.IIOo(n, 1);
        this.II1o.IIIl.III0(iO0l);
        this.II1o.IIIl.l1_l();
        IOO.III iII = IOO.II(iO0l.I1l);
        this.II1o.IIIl.IIol((string == null ? I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e6d\u5e4a\u40ec\u5e0e\u5e5f\u5f8f\u5f0d\u403f\u5e98\u5f3a", 23943) : string) + (iII == null ? I0IO.I1oI("\u5df1\u430b\u5db1\u5dc4\u5e73\u5e4a\u40e8\u5e0d", 23943) : iII.II1o));
        this.II1o.I__O();
        return true;
    }

    private boolean Ill1(int n) {
        if (this.IIo_() < n) {
            this.II1o.IIIl.IIol(n <= 1 ? I0IO.I1oI("\u5dcf\u5d46\u5dab\u5d8c\u5e23\u5e56\u5e33\u5e01\u5e11\u5ef9\u5e9d\u5eb7\u5e93\u5fee\u5f57\u5f3f\u5f57\u5e87\u4152\u5ff4\u5f90\u607a\u7ee6\u6070\u601b\u60fc\u7e7c\u60a2\u608c", 23943) : I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e73\u5e4a\u40e2\u5e09\u5e5f\u5efd\u5e4e\u5efc\u5e16\u5f6e\u5f19\u5f36\u5f1f\u4133\u5fc1\u5ff4", 23943) + n + I0IO.I1oI("\u5da7\u5d52\u5de5\u5d90\u5e71\u40f3\u5e2f\u5e07\u5e5f\u5ef6\u5e5d\u5eb2\u5e93\u5f3a\u5f4d\u5f2a\u5f16\u5ff8\u5fd2", 23943));
            return true;
        }
        return false;
    }

    boolean III1(int n, int n2, int n3) {
        if (n != 21 || n2 != 8701 && n2 != 8702) {
            return false;
        }
        IOol iOol = this.II1o.II;
        if (n2 == 8701) {
            if (n3 != 0) {
                return true;
            }
            if (this.II1o.II.II__(1505) < 99) {
                this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e60\u5e4a\u5ff1\u5e01\u5e5f\u5efd\u5e4e\u5efc\u5fea\u41fd\u5f19\u5f61\u5f4e\u5fb6\u5ff2\u5fbd\u4156\u606b\u6011\u601d\u608f\u60fb", 23943));
                return true;
            }
            if (this.IIo_() < 1) {
                this.II1o.IIIl.IIol(I0IO.I1oI("\u5dcf\u5d46\u5dab\u5d8c\u5e23\u5e56\u5e33\u5e01\u5e11\u5ef9\u5e9d\u5eb7\u5e93\u5fee\u5f57\u5f3f\u5f57\u5e87\u4152\u5ff4\u5f90\u607a\u7ee6\u6070\u601b\u60fc\u7e7c\u60a2\u608c", 23943));
                return true;
            }
            this.II1o.II.II_l(1505, 99);
            this.II1o.IIIl.III0(new IO0l(1506, 1));
            this.II1o.IIIl.l1_l();
            this.II1o.I__O();
            return true;
        }
        if (n3 > 1) {
            return true;
        }
        if (this.II1o.II.II__(1507) < 5) {
            this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e60\u5e4a\u5ff1\u5e01\u5e5f\u5f8f\u405a\u5efc\u5ece\u5f3a\u5f6a\u5f37\u5f14\u5ff9\u5fd9\u5fb5\u5fdd", 23943));
            return true;
        }
        if (this.II1o.II.II__(1508) < 30) {
            this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e60\u5e4a\u5ff1\u5e01\u5e5f\u5f8f\u405a\u5efc\u5ec8\u5f2a\u5f19\u5f10\u5f18\u5ff7\u5f95\u5f9c\u4120\u607c\u6056\u6070\u6028\u60e7\u7e08\u60b5\u60c5", 23943));
            return true;
        }
        if (this.II1o.II.II__(1509) < 1) {
            this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e60\u5e4a\u5ff1\u5e01\u5e5f\u5f8f\u405a\u5efc\u5eca\u5f3a\u5f77\u5ef9\u5f57\u5fc2\u5fc7\u5fb5\u5f9d\u6075\u6011\u6004\u601d\u6063\u6083", 23943));
            return true;
        }
        if (this.II1o.II.II__(1506) < 1) {
            this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e60\u5e4a\u5ff1\u5e01\u5e5f\u5f8f\u405a\u5efc\u5eca\u5f3a\u5f71\u4181\u5f07\u5fb6\u5ea5\u4125\u5f9d\u6075\u6011\u6001\u601a\u606e\u6083", 23943));
            return true;
        }
        if (this.IIo_() < 1) {
            this.II1o.IIIl.IIol(I0IO.I1oI("\u5dcf\u5d46\u5dab\u5d8c\u5e23\u5e56\u5e33\u5e01\u5e11\u5ef9\u5e9d\u5eb7\u5e93\u5fee\u5f57\u5f3f\u5f57\u5e87\u4152\u5ff4\u5f90\u607a\u7ee6\u6070\u601b\u60fc\u7e7c\u60a2\u608c", 23943));
            return true;
        }
        this.II1o.II.II_l(1507, 5);
        this.II1o.II.II_l(1508, 30);
        this.II1o.II.II_l(1506, 1);
        if (n3 == 1) {
            this.II1o.II.II_l(1509, 1);
        }
        this.II1o.IIIl.III0(new IO0l(n3 == 0 ? 1510 : 1511, 1));
        this.II1o.IIIl.l1_l();
        this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e6d\u5e4a\u40ec\u5e0e\u5e5f\u5f8f\u5f0d\u403f\u5e98\u5f3a\u5f48\u5f2d\u5f97", 23943));
        this.II1o.I__O();
        return true;
    }

    boolean IIII(int n, IO0l iO0l) {
        IOol iOol = this.II1o.II;
        switch (iO0l.I1l) {
            case 1775: {
                if (this.Ill1(1)) {
                    return true;
                }
                int n2 = Math.max(0, Math.min(2, iOol.lOlI));
                int n3 = (int)(Math.random() * 5.0);
                IO0l iO0l2 = new IO0l(II_O[n2][n3], 1);
                this.II(iO0l2, n2, n3);
                iO0l2.III(30, 1);
                return this.II(n, iO0l2, null);
            }
            case 1776: {
                if (this.Ill1(2)) {
                    return true;
                }
                IO0l iO0l3 = new IO0l(I0IO.Illl(50) ? 1772 : 1773, 1);
                iO0l3.III(103, I0IO.IIl_(7, 10)).III(50, I0IO.IIl_(7, 10)).III(77, I0IO.IIl_(7, 10)).III(14, I0IO.IIl_(7, 10));
                if (!I0IO.Illl(1)) {
                    iO0l3.III(93, I0IO.IIl_(1, 15));
                }
                iO0l3.III(30, 0);
                return this.II(n, iO0l3, null);
            }
            case 1777: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l4 = new IO0l(I0IO.III(new int[]{1761, 1731, 1732}), 1);
                this.II(iO0l4, 20, 25, true, 15, 1);
                return this.II(n, iO0l4, null);
            }
            case 1591: 
            case 1592: 
            case 1594: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l5 = new IO0l(I0IO.III(new int[]{1588, 1589, 1595, 1587, 1593, 1590}), 1);
                this.II(iO0l5, 20, 25, true, 15, 1);
                return this.II(n, iO0l5, null);
            }
            case 1840: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l6 = new IO0l(I0IO.III(new int[]{1588, 1589, 1595, 1587, 1593, 1590}), 1);
                this.II(iO0l6, 20, 25, true, 15, 1);
                iO0l6.III(30, 0);
                return this.II(n, iO0l6, null);
            }
            case 1757: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l7 = new IO0l(1741 + I0IO.IIl_(0, 5), 1);
                iO0l7.III(103, I0IO.IIl_(20, 25)).III(50, I0IO.IIl_(20, 25)).III(77, I0IO.IIl_(20, 25)).III(210, I0IO.IIl_(0, 2));
                if (!I0IO.Illl(1)) {
                    iO0l7.III(93, I0IO.IIl_(1, 15));
                }
                iO0l7.III(30, 0);
                return this.II(n, iO0l7, null);
            }
            case 1821: {
                if (this.Ill1(5)) {
                    return true;
                }
                IO0l iO0l8 = new IO0l(I0IO.IIl_(1765, 1771), 1);
                iO0l8.III(50, I0IO.IIl_(10, 18)).III(5, I0IO.IIl_(5, 10)).III(14, I0IO.IIl_(5, 10));
                if (!I0IO.Illl(1)) {
                    iO0l8.III(93, I0IO.IIl_(1, 15));
                }
                iO0l8.III(30, I0IO.IIl_(0, 1));
                return this.II(n, iO0l8, null);
            }
            case 1569: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l9 = new IO0l(I0IO.IIl_(618, 626), 1);
                iO0l9.III(50, I0IO.IIl_(10, 15)).III(77, I0IO.IIl_(10, 15)).III(103, I0IO.IIl_(10, 15)).III(210, 2).III(30, 0);
                if (I0IO.Illl(95)) {
                    iO0l9.III(93, 15);
                }
                return this.II(n, iO0l9, null);
            }
            case 1608: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l10 = new IO0l(I0IO.III(new int[]{1807, 1599, 1600, 1601, 1602}), 1);
                iO0l10.III(50, I0IO.IIl_(10, 18)).III(77, I0IO.IIl_(10, 18)).III(103, I0IO.IIl_(10, 18)).III(210, I0IO.IIl_(1, 2));
                if (!I0IO.Illl(1)) {
                    iO0l10.III(93, I0IO.IIl_(1, 7));
                }
                iO0l10.III(30, I0IO.IIl_(0, 1));
                return this.II(n, iO0l10, null);
            }
            case 1863: 
            case 1864: 
            case 1866: 
            case 1867: 
            case 1868: {
                int[] nArray;
                if (this.Ill1(1)) {
                    return true;
                }
                if (iO0l.I1l == 1863) {
                    int[] nArray2 = new int[5];
                    nArray2[0] = 1862;
                    nArray2[1] = 1469;
                    nArray2[2] = 1470;
                    nArray2[3] = 1471;
                    nArray = nArray2;
                    nArray2[4] = 1539;
                } else if (iO0l.I1l == 1868) {
                    int[] nArray3 = new int[9];
                    nArray3[0] = 754;
                    nArray3[1] = 755;
                    nArray3[2] = 756;
                    nArray3[3] = 846;
                    nArray3[4] = 847;
                    nArray3[5] = 848;
                    nArray3[6] = 941;
                    nArray3[7] = 946;
                    nArray = nArray3;
                    nArray3[8] = 947;
                } else if (iO0l.I1l == 1867) {
                    int[] nArray4 = new int[4];
                    nArray4[0] = 1202;
                    nArray4[1] = 942;
                    nArray4[2] = 943;
                    nArray = nArray4;
                    nArray4[3] = 944;
                } else {
                    int[] nArray5 = new int[7];
                    nArray5[0] = 1477;
                    nArray5[1] = 1478;
                    nArray5[2] = 1479;
                    nArray5[3] = 1483;
                    nArray5[4] = 1484;
                    nArray5[5] = 1485;
                    nArray = nArray5;
                    nArray5[6] = 1486;
                }
                int[] nArray6 = nArray;
                int n4 = (int)(Math.random() * (double)nArray6.length);
                IO0l iO0l11 = new IO0l(nArray6[n4], 1);
                this.III(iO0l11, Math.min(n4, 4));
                if (I0IO.Illl(99)) {
                    iO0l11.III(93, 15);
                }
                return this.II(n, iO0l11, iO0l.I1l == 1863 ? I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e6d\u5e4a\u40ec\u5e0e\u5e5f\u5f8f\u5f0d\u403f\u5e98\u5f3a\u5f11\u5f1b\u5f16\u5fe6\u5fc6\u5fa1\u5f9f\u6077\u6011\u6004\u7ed0\u60fa\u6084\u60ec", 23943) : null);
            }
            case 1865: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l12 = new IO0l(I0IO.III(new int[]{1074, 1075, 1076, 1077, 1078, 1079, 1080, 1081, 1082, 1083, 841, 840, 1204}), 1);
                return this.II(n, iO0l12, null);
            }
            case 736: {
                IO0l iO0l13;
                if (this.Ill1(2)) {
                    return true;
                }
                int n5 = I0IO.IIl_(1, 100);
                if (n5 <= 50) {
                    iO0l13 = new IO0l(I0IO.III(new int[]{20, 19, 18}), 1);
                } else if (n5 <= 70) {
                    iO0l13 = new IO0l(77, I0IO.IIl_(1, 2));
                } else if (n5 <= 80) {
                    iO0l13 = new IO0l(987, 1).III(30, 1);
                } else if (n5 <= 90) {
                    iO0l13 = new IO0l(795, 1).III(89, 1).III(30, 1);
                    if (I0IO.Illl(95)) {
                        iO0l13.III(93, I0IO.IIl_(1, 3));
                    }
                } else if (n5 <= 95) {
                    iO0l13 = new IO0l(954, 1).III(77, I0IO.IIl_(5, 9)).III(103, I0IO.IIl_(5, 9)).III(147, I0IO.IIl_(5, 9));
                    if (I0IO.Illl(1)) {
                        ((int[])iO0l13.IIl.elementAt((int)((int)(Math.random() * (double)(iO0l13.IIl.size() - 1)))))[1] = 10;
                    }
                    iO0l13.III(30, 1);
                    if (I0IO.Illl(99)) {
                        iO0l13.III(93, I0IO.IIl_(1, 3));
                    }
                } else {
                    iO0l13 = new IO0l(680, 1).III(76, 1).III(77, 24).III(103, 25).III(147, 24);
                    if (I0IO.Illl(99)) {
                        iO0l13.III(93, I0IO.IIl_(1, 3));
                    }
                }
                return this.II(n, iO0l13, I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5f12\u5ec1\u5e61\u5e0e\u5e17\u4033\u5ed3\u5efc\u5fea\u5eaa\u41da\u5f3b\u5f57", 23943));
            }
            case 1505: {
                this.II1o.II.IIII(21, 8701, I0IO.I1oI("\u5dfb\u5d97\u5db9\u5da3\u5ef0\u5e4b\u5e61\u5e28\u40a6\u5eee\u5e9d\u5fcd\u400a\u5f74\u5f5e\u5f78\u5f06\u5fe3\u5f55\u5fde\u5f8f\u6020\u604d\u6017\u6006\u7e2b\u60d4\u60ec\u6086\u61ea\u615c\u6168", 23943) + this.II1o.II.II__(1505) + I0IO.I1oI("\u5da8\u5d9f\u5dfc\u5dee\u5e7f\u5e10\u5e3d\u5e27\u5e16\u5e7f\u5e9d\u5eaa\u5e1b\u5f74\u5f5e\u5f78\u5f45\u5fb8\u5f85\u5fe4\u5fc3\u603c\u6001\u6060\u605f", 23943), new String[]{I0IO.I1oI("\u5c97\u4375\u5dab\u5d83\u5e23\u5edf", 23943), I0IO.I1oI("\u5c97\u5d55\u5dab\u5d83", 23943)});
                return true;
            }
            case 1506: 
            case 1507: 
            case 1508: 
            case 1509: {
                this.II1o.II.IIII(21, 8702, I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e6e\u5e57\u4090\u5e0e\u5e5f\u5ef9\u5e4e\u5eb5\u5edb\u5f76\u5f56\u41f9\u5f1e\u5fb6\u5fdb\u5f34\u5f9c", 23943), new String[]{I0IO.I1oI("\u5dc0\u5d55\u5dac\u5dc4\u5e4b\u40fb\u5e31\u5e40\u5e0e\u5eeb\u5e5d\u5efc\u5e95\u5f72\u4180\u5f78\u5f19\u5ffe\u5f55\u5fba\u5f94", 23943), I0IO.I1oI("\u5dc0\u5d55\u5dac\u5dc4\u5e4b\u40fb\u5e31\u5e40\u5e0e\u5eeb\u5e5d\u5efc\u5e98\u5f72\u41f0\u5f36\u5f1f\u5fb6\u5fd6\u5fbc\u5f86", 23943), I0IO.I1oI("\u5dd3\u434d\u5de5\u5d87\u5e6b\u40f3\u5e28", 23943)});
                return true;
            }
            case 726: {
                this.II1o.II.l1oO();
                return true;
            }
            case 1787: {
                this.II1o.II.II_o(164, 870);
                return true;
            }
            case 1575: 
            case 1576: {
                boolean bl;
                boolean bl2 = bl = iO0l.I1l == 1576;
                if (bl && this.Ill1(1)) {
                    return true;
                }
                long l = bl ? (long)I0IO.IIl_(500000, 2000000) : (long)I0IO.IIl_(5000, 20000);
                iOol.Il11 = Math.min(iOol.Il11 + l, 99999999999L);
                this.II1o.IIIl.IIOo(n, 1);
                if (bl) {
                    this.II1o.IIIl.III0(new IO0l(I0IO.Illl(50) ? 1867 : 1868, 1));
                    this.II1o.IIIl.l1_l();
                }
                this.II1o.IIIl.l1_();
                this.II1o.IIIl.IIol(I0IO.I1oI("\u5dd7\u5dce\u5d24\u5d8b\u5e23\u5e40\u5eb5\u5e0e\u5e18\u5ebe\u5ed3\u4009\u5eda\u5f3a\u5f7b\u41f9\u5f19\u5fb6\u5fdb\u5fbc\u415e\u607c\u6011\u6141\u61df\u7e6d\u60ce\u60ec", 23943) + l + I0IO.I1oI("\u5da7\u5dd0\u5d25\u5d8a\u5e64", 23943));
                this.II1o.I__O();
                return true;
            }
            case 648: {
                if (this.Ill1(1)) {
                    return true;
                }
                if (I0IO.Illl(6)) {
                    int n6 = I0IO.IIl_(10, 20);
                    iOol.lOoO += n6;
                    this.II1o.IIIl.IIOo(n, 1);
                    this.II1o.IIIl.l1_();
                    this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e6d\u5e4a\u40ec\u5e0e\u5e5f\u5f8f\u5f0d\u403f\u5e98\u5f3a", 23943) + n6 + I0IO.I1oI("\u5da7\u5de8\u5da2\u4329\u5e60", 23943));
                    return true;
                }
                int[] nArray = new int[]{I0IO.IIl_(441, 445), I0IO.IIl_(381, 384), I0IO.IIl_(17, 20), I0IO.IIl_(925, 931), I0IO.IIl_(1066, 1070), 533, 380};
                int n7 = I0IO.III(nArray);
                IO0l iO0l14 = new IO0l(n7, 1);
                if (n7 >= 441 && n7 <= 445) {
                    int[] nArray7 = IOoI.IIII(n7);
                    iO0l14.III(nArray7[0], nArray7[1]);
                    iO0l14.lo0I = I0IO.IIl_(1, 5);
                } else if (n7 >= 381 && n7 <= 384 || n7 >= 1066 && n7 <= 1070) {
                    iO0l14.lo0I = I0IO.IIl_(1, 5);
                }
                return this.II(n, iO0l14, null);
            }
            case 1171: {
                if (this.Ill1(1)) {
                    return true;
                }
                IO0l iO0l15 = new IO0l(1158 + I0IO.IIl_(0, 6), 1);
                iO0l15.III(50, 11).III(77, 13).III(103, 13).III(I0IO.III(new int[]{94, 97, 108}), I0IO.IIl_(3, 5));
                if (I0IO.Illl(98)) {
                    iO0l15.III(93, I0IO.IIl_(1, 3));
                } else {
                    iO0l15.III(73, 0);
                }
                return this.II(n, iO0l15, null);
            }
            case 1170: {
                if (this.Ill1(1)) {
                    return true;
                }
                int n8 = Math.max(0, Math.min(2, iOol.lOlI));
                int n9 = I0IO.IIl_(0, 3);
                int n10 = n9 == 0 ? 746 : (n9 == 1 ? (new int[]{1155, 1157, 1156})[n8] : (n9 == 2 ? (new int[]{1018, 1019, 1020})[n8] : 1087 + I0IO.IIl_(0, 4)));
                IO0l iO0l16 = new IO0l(n10, 1);
                if (n10 == 746) {
                    if (I0IO.Illl(1)) {
                        iO0l16.III(73, 0);
                    } else {
                        iO0l16.III(93, I0IO.IIl_(7, 30));
                    }
                } else {
                    int n11 = n10 >= 1087 && n10 <= 1091 ? 22 : 23;
                    int n12 = n10 >= 1087 && n10 <= 1091 ? 21 : 23;
                    iO0l16.III(50, n11).III(77, n12).III(103, n12);
                    if (I0IO.Illl(95)) {
                        iO0l16.III(93, I0IO.IIl_(1, 3));
                    } else {
                        iO0l16.III(73, 0);
                    }
                }
                return this.II(n, iO0l16, null);
            }
            case 1560: {
                int n13;
                int n14;
                if (this.Ill1(1)) {
                    return true;
                }
                int n15 = -1;
                for (n14 = 0; n14 < iOol.III.length; ++n14) {
                    if (iOol.III[n14].I1l != 1561 || iOol.III[n14].lo0I <= 0) continue;
                    n15 = n14;
                    break;
                }
                if (n15 < 0) {
                    this.II1o.IIIl.IIol(I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e68\u5e4a\u5eb5\u5e0e\u5e18\u5ebe\u5ede\u5e2f\u5edb\u5f79\u5f51\u5fb4\u5f16\u5fb6\u5fde\u5fbc\u5f9c\u60f3\u6011\u6026\u608f\u60e0\u60ca", 23943));
                    return true;
                }
                n14 = I0IO.IIl_(0, 100);
                int n16 = n14 < 85 ? 17 + I0IO.IIl_(0, 3) : (n14 < 95 ? 16 : I0IO.IIl_(14, 15));
                this.II1o.IIIl.IIOo(n15, 1);
                int n17 = n13 = iOol.III[n] == iO0l ? n : -1;
                if (n13 < 0) {
                    for (int i = 0; i < iOol.III.length; ++i) {
                        if (iOol.III[i] != iO0l) continue;
                        n13 = i;
                        break;
                    }
                }
                if (n13 < 0) {
                    return true;
                }
                return this.II(n13, new IO0l(n16, 1), I0IO.I1oI("\u5dc5\u4307\u5dab\u5dc4\u5e75\u40c9\u5e20\u5e40\u5e11\u5ef6\u4010\u5eb2\u5edb\u5e0b\u5e89\u41bb\u5f14\u5fb6", 23943));
            }
        }
        return false;
    }

    private static /* synthetic */ String I1oI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

