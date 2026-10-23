package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

final class I0I0 {
    static final int __l0 = 56;
    private static final int __lo = 1229;
    private static final int __1 = 0;
    private static final int __1I = 6;
    private final IO0 II_;
    private final IO00 IIII;
    private final Random IIlo = new Random();

    I0I0(IO0 iO0, IO00 iO00) {
        this.II_ = iO0;
        this.IIII = iO00;
    }

    private IOol II() {
        return this.II_.var_IOol_II;
    }

    private int IlOO() {
        int n = this.II().lOlI;
        return n == 0 ? 24 : (n == 1 ? 26 : 25);
    }

    private int IlO0() {
        IOol iOol = this.II();
        int n = this.IlOO();
        for (int i = 0; i < iOol.I__l.length; ++i) {
            IOO.IIIO iIIO = IOO.IOO$IIIO_II(iOol.I__l[i]);
            if (iIIO == null || iIIO.lO0I != n) continue;
            return iIIO.l1__;
        }
        return 0;
    }

    private int IlOl() {
        int n = 0;
        IO0l[] iO0lArray = this.II().var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != 1229) continue;
            n += iO0lArray[i].lo0I;
        }
        return n;
    }

    private int IlOo() {
        IO0l[] iO0lArray = this.II().var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != 1229) continue;
            return i;
        }
        return -1;
    }

    private void I110(int n) {
        IO0l[] iO0lArray = this.II().var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length && n > 0; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != 1229) continue;
            if (iO0lArray[i].lo0I > n) {
                iO0lArray[i].lo0I -= n;
                n = 0;
                continue;
            }
            n -= iO0lArray[i].lo0I;
            iO0lArray[i] = new IO0l();
        }
    }

    private boolean Iloo() {
        IO0l[] iO0lArray = this.II().II;
        for (int i = 0; i < 5; ++i) {
            if (iO0lArray[i] != null && !iO0lArray[i].II1_() && iO0lArray[i].I1l >= 650 && iO0lArray[i].I1l <= 662) continue;
            return false;
        }
        return true;
    }

    void IooI() {
        this.IIII.II(0, I0I0.I1ol("\u2f3c\u2fef\u314b\u2fe5\u2ef5\u30e2\u304c\u3029\u3040\u3009\u2e45\u30d4\u30fc\u308f\u317b\u3119\u3120\u3112\u31fb\u3195\u31ba\u3113\u327d\u321f\u325a\u3221\u32e9\u331d\u336d\u3282\u332a\u334a\u33ba\u3309\u33a6\u3394\u33e4\u338f\u35b2\u2ac2\u3434\u347f\u3410\u2a72\u34dd\u34fb\u3499\u34b8\u3518\u353a\u3596\u35bb", 12136), new String[]{I0I0.I1ol("\u2f26\u2f74\u2fcf\u2fcf\u2f87\u306b\u3057\u3038\u2ea7\u3011", 12136), I0I0.I1ol("\u2f20\u314a\u2fc5\u2fcf\u2f90\u3076\u305b\u2e86\u3014\u305f\u30f5\u2e44", 12136), I0I0.I1ol("\u2f3c\u2fe8\u2fd6\u2fe5\u2fd5\u3033\u3012", 12136), I0I0.I1ol("\u2f33\u2fcb\u2ff0\u2fff", 12136) + (this.II()._11I + 1) + I0I0.I1ol("\u2f35", 12136)});
    }

    void II__(int n, int n2) {
        if (n == 0) {
            boolean bl;
            if (n2 == 0) {
                this.IIII.II(5, I0I0.I1ol("\u2f3c\u2fe6\u2f86\u2fb6\u3159\u3023\u3045\u3028\u309a\u300f\u30be\u30d3\u30bb\u314b\u30bb\u3150\u3178\u3114\u31fe\u2f0a\u31f4\u3187\u2cb3\u325e\u3270\u321b\u32fc\u32cc\u32a2\u328c\u332a\u334b\u2d83\u3347\u33f2\u33cd\u33ad\u3309\u346c\u3401\u3433\u2ab6", 12136), new String[]{I0I0.I1ol("\u2f3b\u2fef\u2fc9\u2fb5\u2fc4\u3077\u304a\u3028\u308a\u3011\u30be\u30ce\u2e35", 12136), I0I0.I1ol("\u2f2b\u2fef\u3119\u2fe5\u2f90\u2ea2\u304d", 12136), I0I0.I1ol("\u2f3c\u316c\u2f86\u2fa6\u2f8c\u2ed2\u304b", 12136)});
                return;
            }
            if (n2 == 2) {
                this.IIII.II0_(I0I0.I1ol("\u2f3c\u2fc8\u2ff6\u2fe5\u2fd5\u3033\u3012\u3061\u3037\u3017\u30f7\u30ce\u30d6\u30ca\u3134\u3119", 12136) + this.II().II1o + I0I0.I1ol("\u2f48\u2faa\u2f86\u2f89\u2fb2\u3039", 12136) + this.II()._11I + (this.II()._11l > 0 ? I0I0.I1ol("\u2f48\u2faf", 12136) + this.II()._11l / 1000 + I0I0.I1ol("\u2f1b\u2fae", 12136) : ""));
                return;
            }
            if (n2 == 3) {
                if (!this.II_.IIIl.var_IO_I_II.Ill0()) {
                    this.II_.IIIl.IIol(I0I0.I1ol("\u2e78\u2fe6\u2fc8\u2fa2\u2fc4\u3060\u30d1\u3061\u300e\u3018\u312e\u2e60\u30b5\u30db\u3176\u314c\u3121\u2fb0\u31f8\u3195\u31a0\u2f5e\u3262", 12136));
                }
                return;
            }
            if (n2 != 1) {
                return;
            }
            int n3 = this.IlO0();
            boolean bl2 = bl = n3 == 0;
            String string = this.II().lOlI == 0 ? I0I0.I1ol("\u2f3b\u2ff2\u2fd6\u2fa0\u2f96\u3023\u3049\u3020\u300d\u301a\u30f4\u30d2\u30b7\u3094", 12136) : (this.II().lOlI == 1 ? I0I0.I1ol("\u2f25\u2fe6\u2f86\u2fb5\u2f8c\u306c\u304c\u3026\u3040\u301d\u30ff", 12136) : I0I0.I1ol("\u2f2b\u2fe6\u2f86\u2ed4\u2f09\u3060\u3002\u302d\u3009\u3095\u30f0\u309d\u30b4\u3094\u31fa\u3157\u3178\u3114\u31fe\u3005\u2f0b\u319d\u3275", 12136));
            int n4 = bl ? 9999 : 999;
            this.IIII.II(6, I0I0.I1ol("\u2f14\u2fb6\u2fda\u2f91\u2f85\u3023\u3051\u2efc\u3040\u301b\u2e3f\u30c4\u30fc\u3095\u317d\u3089\u30f9\u311e\u31b6\u31c1\u31a1\u318a\u2cd5\u3245\u3270\u3204\u2c77\u328d", 12136) + string + I0I0.I1ol("\u2f48", 12136) + (bl ? 1 : n3 + 1) + I0I0.I1ol("\u2f62\u2ffb\u2f91\u2fb9\u2fa6\u30ee\u3002\u302a\u308d\u300f\u30be\u30c9\u30a9\u3082\u2fdd\u314d\u3178\u311c\u2f6f\u318f\u31f4", 12136) + this.IlOl() + I0I0.I1ol("\u2f47", 12136) + n4 + I0I0.I1ol("\u2f62\u2ffb\u2f94\u2fb9\u2fa3\u306a\u30c3\u3061\u3016\u309f\u30f0\u30da\u30e6\u30db\u312b\u3109\u3176\u3147\u31a6\u3185\u31fa\u31c3\u3222\u3201\u325a\u3213\u32bc\u32d1\u328b\u3282\u33eb\u3309\u3326\u3300\u2d4b\u33c6\u33fe\u33c3\u343b\u3418", 12136), new String[]{I0I0.I1ol("\u2e78\u3154\u2fc8\u2fa2\u2fc4\u30fe", 12136), I0I0.I1ol("\u2f3c\u316c\u2f86\u2fa6\u2f8c\u2ed2\u304b", 12136)});
        } else if (n == 5) {
            if (n2 == 0) {
                this.IIII.II0O(I0I0.I1ol("\u2f3c\u2fcf\u2fef\u2f80\u2faa\u305c\u3071\u3014", 12136));
            } else if (n2 == 1) {
                if (!this.Iloo()) {
                    this.IIII.II(22, I0I0.I1ol("\u2f26\u2fe0\u2e16\u2e64\u2f8d\u3023\u304a\u30a2\u3019\u305f\u30ea\u30cf\u30bd\u3095\u317d\u3119\u313a\u2fbc\u31b6\u30a4\u2f33\u31d3\u3227\u3211\u323d\u329c\u32e0\u328d\u32b8\u3299\u336b\u3347\u332f\u3347\u33e4\u2d6e\u33e4\u33ab\u2ae5\u3458\u3460\u341b\u3417\u2a5a\u34c8\u34fb\u3488\u2bca\u3551\u3577\u3502\u35f4\u3594\u35bd\u3501\u3678\u3610\u362c\u3606\u36f8\u36d5\u280c\u3684\u3729\u375c\u372e\u29d9\u37f5\u378a", 12136), new String[]{I0I0.I1ol("\u2f27\u2fcc", 12136)});
                } else {
                    this.II_.var_IO_0_II.Il11(515);
                }
            }
        } else if (n == 6 && n2 == 0) {
            this.l_I0();
        }
    }

    private void III1(int n, boolean bl) {
        IOo_ iOo_ = this.II_.IIl1;
        iOo_.II(new IO0o(-81).II(0).II(I0I0.I1ol("\u2f3b\u2fec\u2fcf\u2fa9\u2f88\u3023\u301b", 12136)).II(I0I0.I1ol("\u2f06\u2ff2\u2fca\u2fa9", 12136)).III(56));
        int n2 = this.IlOo();
        iOo_.II(new IO0o(-81).II(1).II(1).II(n2 < 0 ? 0 : n2));
        if (bl) {
            iOo_.II(new IO0o(-81).II(7).III(n));
        } else {
            iOo_.II(new IO0o(-81).II(8));
        }
    }

    private void l_I0() {
        IOol iOol = this.II();
        if (this.IlOl() == 0) {
            return;
        }
        if (iOol.Il11 < 10000000L || iOol.lOoO < 99 || iOol.IO_l < 60000000000L) {
            this.II_.IIIl.IIol(I0I0.I1ol("\u2f2a\u3126\u2fc8\u2fe5\u2f8f\u306b\u30d6\u302f\u3007\u305f\u318f\u2e5a\u30fc\u31ea\u3173\u2ff8\u312d\u3157\u31fd\u31dc\u2f13\u319d\u3232\u3259\u2c9d\u320c\u32ae\u32d9\u32b9\u3292\u2dcd\u335d\u3368\u330c\u2d7f\u3384", 12136));
            return;
        }
        int n = this.IlO0();
        int n2 = iOol.lOlI == 0 ? 11162 : (iOol.lOlI == 1 ? 11194 : 11193);
        IOo_ iOo_ = this.II_.IIl1;
        if (n == 0) {
            if (this.IlOl() < 9999) {
                int n3 = 9999 - this.IlOl();
                this.II_.IIIl.IIol(I0I0.I1ol("\u2f26\u2fe0\u2e16\u2e64\u2f8d\u3023\u3041\u30b3\u300e\u305f\u30ea\u30d5\u30b5\u2e44\u316f\u3119", 12136) + n3 + I0I0.I1ol("\u2f48\u2fe5\u2f4b\u2fe5\u2f8f\u30ee\u3052\u3061\u300e\u2e90\u30ff\u3093\u30d6\u30b3\u31f9\u3140\u3178\u3103\u317a\u31d8\u31f4\u30e2\u2cf5\u3211\u3222\u2cbc\u32e7\u328d\u33dd\u2c54\u3364\u3309\u332f\u2dd0\u33f6\u3385\u33b0\u3382\u342c", 12136));
                return;
            }
            this.III1(n2, true);
            this.II_.IIIl.II11(this.IlOO(), 1);
            this.I110(9999);
            iOo_.II(new IO0o(124).III(56).II(I0I0.I1ol("\u2f2b\u2fef\u2f5c\u2fa6\u2fc4\u306e\u2ec9\u302f\u3007\u305f\u30fd\u30d2\u30b2\u30db\u3174\u3151\u31b1\u3156", 12136)));
            this.II_.IIIl.IIol(I0I0.I1ol("\u2f20\u314a\u2fc5\u2fe5\u2f97\u3068\u304b\u302d\u300c\u305f\u30ea\u30d5\u303c\u3095\u3172\u3119\u313b\u3183\u31f8\u31d2\u31f5", 12136));
        } else {
            if (this.IlOl() < 999) {
                int n4 = 999 - this.IlOl();
                this.II_.IIIl.IIol(I0I0.I1ol("\u2f26\u2fe0\u2e16\u2e64\u2f8d\u3023\u3041\u30b3\u300e\u305f\u30ea\u30d5\u30b5\u2e44\u316f\u3119", 12136) + n4 + I0I0.I1ol("\u2f48\u2fe5\u2f4b\u2fe5\u2f8f\u30ee\u3052\u3061\u300e\u2e90\u30ff\u3093\u30d6\u30b3\u31f9\u3140\u3178\u3103\u317a\u31d8\u31f4\u30e2\u2cf5\u3211\u3222\u2cbc\u32e7\u328d\u33dd\u2c54\u3364\u3309\u332f\u2dd0\u33f6\u3385\u33b0\u3382\u342c", 12136));
                return;
            }
            if (n >= 9) {
                iOo_.II(new IO0o(124).III(56).II(I0I0.I1ol("\u2f3b\u2fec\u2fcf\u2fa9\u2f88\u3023\u3041\u2ea6\u3001\u305f\u30f0\u30da\u316c\u315a\u3173\u3119\u3049\u3194\u31b6\u30a4\u2f75\u3187\u3232\u3252\u2cf5\u321f\u32ae\u32d9\u2c1d\u3282\u332a\u3238\u3329\u3349", 12136)));
                return;
            }
            boolean bl = this.IIlo.nextInt(30) < 1;
            this.III1(bl ? n2 : 15313, bl);
            if (bl) {
                this.II_.IIIl.II11(this.IlOO(), n + 1);
            }
            this.I110(bl ? 999 : 99);
            iOo_.II(new IO0o(124).III(56).II(bl ? I0I0.I1ol("\u2f2b\u2fef\u2f5c\u2fa6\u2fc4\u306e\u2ec9\u302f\u3007\u305f\u30fd\u30d2\u30b2\u30db\u3174\u3151\u31b1\u3156", 12136) : I0I0.I1ol("\u2f26\u2fe0\u2fd3\u2fe5\u2f80\u2ed2\u3056\u3060", 12136)));
            this.II_.IIIl.IIol(bl ? I0I0.I1ol("\u2f26\u2f65\u2fc8\u2fa2\u2fc4\u3070\u3049\u3028\u300c\u3013\u30be\u30c9\u30b4\u301b\u3174\u3151\u3178\u3114\u3162\u31db\u31b3\u31d2", 12136) : I0I0.I1ol("\u2f3c\u2e37\u2f86\u2fa6\u2f8c\u2ea6\u3056\u3061\u300b\u3096\u30f3\u309c", 12136));
        }
        iOol.Il11 -= 10000000L;
        iOol.lOoO -= 99;
        this.II_.IIIl.l1_l();
        this.II_.IIIl.l1_();
        this.II_.I__O();
    }

    private static /* synthetic */ String I1ol(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

