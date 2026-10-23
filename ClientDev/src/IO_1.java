package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

final class IO_1 {
    static final int lO0l = 1800000;
    static final int lO01 = 60000;
    static final int lO0_ = 7001;
    static final int lO0O = 7002;
    static final int lO00 = 7003;
    private static final int lO0o = 1600000001;
    private static final int lOo = 457;
    private static final String[] Il11 = new String[]{IO_1.I1lo("\u22b9\u2379\u23c4\u2321\u2309\u23ad\u23cf\u2338\u23ca\u246b\u2449\u2429\u2401\u24a5\u24cc\u3a1a\u248b\u2521\u2543\u2456\u2530\u251a\u25bc\u24aa\u246a\u3b1a\u267b\u261b\u2676\u2617\u26fd\u380c\u26a6\u26d1\u2601\u2746\u398f\u2718\u27ac\u27dd\u3911\u2780\u2828\u284b\u28ab\u280b\u28ec\u2883\u28a1\u2880\u296e\u2977\u291e\u2931\u299c\u29bb\u29c2\u29b6\u2996\u2a70\u2a18", 8946), IO_1.I1lo("\u22bf\u2364\u3de1\u2321\u234e\u23fb\u234c\u23a4\u23ca\u245d\u245a\u3ae6\u240f\u24a5\u25b4\u3a1a\u2481\u2521\u256e\u2557\u25bd\u2513\u25bc\u255a\u25e5\u25d9\u2654\u3896\u263f\u2655\u26fc\u387c\u26bb\u26d1\u277b\u2747\u27a7\u2702\u27ac\u27c7\u2727\u2787\u2860\u2807\u2825\u2804\u28ea\u28cb\u28e2\u3644\u2979\u2933\u291e\u284c\u3797\u29f5\u29dd\u29f9\u2990\u34d8\u2a5f\u2a75\u2a00\u2af2\u2a9c", 8946), IO_1.I1lo("\u22b5\u2378\u23d1\u236f\u230d\u3d2e\u238c\u23bf\u2313\u2470\u2408\u242f\u2492\u24e8\u2488\u24e3\u248e\u25ec\u254e\u2557\u257e\u251e\u25fd\u25d5\u25b2\u25d9\u266c\u265f\u26bb\u2616\u26fc\u2693\u26a6\u2699\u27fc\u270f\u272d\u2705\u27e3\u278b\u27bb\u279c\u2869\u2809", 8946)};
    static final String lIll = "1) Tr\u1ea1i \u0111\u1ed9c nh\u00e3n l\u00e0 n\u01a1i c\u00e1c ng\u01b0\u01a1i kh\u00f4ng n\u00ean v\u00e0o v\u00ec nh\u1eefng t\u01b0\u1edbng t\u00e1 r\u1ea5t m\u1ea1nh. Hahaha\b2) Trong tr\u1ea1i \u0111\u1ed9c nh\u00e3n, m\u1ed7i v\u1ecb t\u01b0\u1edbng \u0111\u1ec1u gi\u1eef ng\u1ecdc r\u1ed3ng t\u1eeb 4 sao \u0111\u1ebfn 6 sao, t\u00f9y l\u00fac\n3) N\u1ebfu ng\u01b0\u01a1i th\u00edch ch\u1ebft th\u00ec c\u1ee9 vi\u1ec7c v\u00e0o. Nh\u01b0ng ta ch\u1ec9 cho v\u00e0o m\u1ed7i ng\u00e0y m\u1ed9t l\u1ea7n th\u00f4i, \u0111\u1ec3 ng\u01b0\u01a1i kh\u1ecfi ph\u1ea3i ch\u1ebft nhi\u1ec1u, hahaha.\b4) C\u00e1c v\u1ecb t\u01b0\u1edbng trong tr\u1ea1i r\u1ea5t m\u1ea1nh nh\u00e9, c\u00e1c ng\u01b0\u01a1i kh\u00f4ng \u0111\u01a1n gi\u1ea3n c\u00f3 th\u1ec3 \u0111\u00e1nh b\u1ea1i h\u1ecd b\u1eb1ng c\u00e1ch b\u00ecnh th\u01b0\u1eddng nh\u01b0 \u0111\u00e1nh qu\u00e1i \u0111\u01b0\u1ee3c \u0111\u00e2u\n5) Mu\u1ed1n v\u00e0o, ng\u01b0\u01a1i ph\u1ea3i gia nh\u1eadp bang h\u1ed9i \u0111\u01b0\u1ee3c h\u01a1n 1 ng\u00e0y. Kh\u00f4ng th\u00ec ph\u1ea3i bi\u1ebft \u0111i\u1ec1u v\u1edbi l\u00ednh canh.\b6) M\u1ed7i l\u1ea7n v\u00e0o, ng\u01b0\u01a1i ch\u1ec9 c\u00f3 30 ph\u00fat \u0111\u1ec3 \u0111\u00e1nh. Sau 30 ph\u00fat m\u00e0 ng\u01b0\u01a1i v\u1eabn kh\u00f4ng th\u1eafng, ta s\u1ebd cho m\u00e1y bay ch\u1edf ng\u01b0\u01a1i v\u1ec1 nh\u00e0.";
    private final IO0 var_IO0_III1;
    private final IOo_ var_IOo__III1;
    private final Random III_ = new Random();
    boolean IolO;
    boolean Iol0;
    boolean Iolo;
    long I1O1;
    long I1O_;
    private final boolean[][] var_boolean_arr_arr_II = new boolean[70][];
    private final int[][] II1O = new int[70][];
    private final long[][] var_long_arr_arr_II = new long[70][];
    private final Vector[] var_java_util_Vector_arr_II = new Vector[70];
    private int lOoI;
    private boolean Io1;
    private boolean Io1I;
    private int lOol;
    private boolean Io1l;
    private long I1OO;
    private static final long I1O0 = 72000000L;

    IO_1(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_III1 = iO0;
        this.var_IOo__III1 = iOo_;
    }

    static boolean II_1(int n) {
        return n >= 53 && n <= 62;
    }

    boolean Il1I() {
        return this.IolO;
    }

    private static long II(long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private boolean Il1l() {
        long l = this.var_IO0_III1.var_IOol_II.IO0;
        if (l == 0L) {
            return false;
        }
        long l2 = IO0I.IIIl();
        if (l2 - l < 72000000L) {
            return true;
        }
        return l >= IO_1.II(l2);
    }

    private int II0l() {
        return (int)((System.currentTimeMillis() / 1000L - (long)this.var_IO0_III1.var_IOol_II._lOo) / 86400L);
    }

    private static String III(long l, int n) {
        int n2 = (int)Math.max(0L, ((long)n - (System.currentTimeMillis() - l)) / 1000L);
        return n2 > 60 ? n2 / 60 + IO_1.I1lo("\u22d2\u2361\u2358\u23b5\u231a", 8946) : n2 + IO_1.I1lo("\u22d2\u2376\u2359\u23ad\u2317", 8946);
    }

    private void lI() {
        int n;
        if (!this.IolO) {
            this.var_IOo__III1.II(new IO0o(65).II(0).II("").III(0));
            return;
        }
        int n2 = n = this.Iolo ? (int)((60000L - (System.currentTimeMillis() - this.I1O_)) / 1000L) : (int)((1800000L - (System.currentTimeMillis() - this.I1O1)) / 1000L);
        if (n < 0) {
            n = 0;
        }
        this.var_IOo__III1.II(new IO0o(65).II(0).II(IO_1.I1lo("\u22a6\u2363\u3d91\u2326\u234e\u229c\u3d75\u23a8\u23ca\u2467\u2440\u24a4\u2408\u24bf", 8946)).III(n));
    }

    void lII() {
        boolean bl;
        IOol iOol = this.var_IO0_III1.var_IOol_II;
        IO00 iO00 = this.var_IO0_III1.var_IO00_II;
        boolean bl2 = bl = this.Io1 || this.Io1I;
        if (this.IolO) {
            iO00.IIII(25, 7001, IO_1.I1lo("\u22b0\u2370\u235e\u2328\u234e\u23e5\u3d75\u23a2\u23ca\u246a\u3acf\u2426\u2446\u24eb\u24c3\u2573\u2543\u2568\u2500\u242e\u253f\u2513\u25fb\u259b\u24cb\u2518\u2676\u265f\u2676\u2601\u26e6\u3812\u26bb\u26d1\u2601\u39f6\u272d\u274d\u27e2\u27c3\u2729\u2787\u2802\u2873\u282e\u36b8\u28ed\u2883\u28a5\u2888\u2961\u2971\u291e\u293e\u298e\u29f5\u299a\u29b5\u3759\u2a7e\u2a16\u2a39\u2a94\u2ab3", 8946) + IO_1.III(this.I1O1, 1800000) + IO_1.I1lo("\u22dc\u2331\u237e\u2328\u22de\u222c\u23c5\u23eb\u2389\u24fa\u2408\u242a\u2413\u3a54\u24ca\u24e3\u2496\u2569\u2541\u2552\u257e\u251a\u25f5\u25da\u25fa\u2592\u2670\u26c3\u2638\u2612\u26ab", 8946), new String[]{IO_1.I1lo("\u22a6\u2379\u2351\u2322\u234e\u23ea\u23c5\u23aa", 8946), IO_1.I1lo("\u22b9\u2379\u23c4\u2321\u2309", 8946), IO_1.I1lo("\u22ba\u22a1\u3deb\u2321\u2309\u2387\u23c8\u3d60\u2384\u2403\u245c\u242f\u248c\u24e8", 8946)});
            return;
        }
        if (!this.Io1 && this.Il1l()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(iOol.IO0);
            String string = (calendar.get(11) < 10 ? IO_1.I1lo("\u22c2", 8946) : "") + calendar.get(11) + IO_1.I1lo("\u22c8", 8946) + (calendar.get(12) < 10 ? IO_1.I1lo("\u22c2", 8946) : "") + calendar.get(12);
            iO00.IIII(25, 7002, IO_1.I1lo("\u22ba\u23e5\u235d\u236f\u2300\u23ec\u23d5\u23eb\u2384\u246e\u2598\u25e6\u240f\u24a5\u25b5\u2420\u24c2\u2577\u25c0\u2550\u257e\u2529\u25ee\u3b1a\u25b3\u25d9\u2708\u38ee\u2635\u2655\u26da\u26db\u2631\u269f\u2730\u271e\u276e\u2701\u392b\u27c5\u27ea\u279b\u36db\u284e\u2866\u284d\u28e8\u2859\u28a1\u28c1", 8946) + string + IO_1.I1lo("\u22db\u233d\u2310\u225e\u3d85\u23e3\u23cb\u23eb\u2382\u24fb\u2446\u2420\u2446\u24eb\u2444\u24aa\u24c2\u256f\u3be9\u251f\u2536\u251c\u25e5\u259b\u25be\u2503\u2671\u2617\u2622\u261c\u3855\u26dd\u26f2\u2685\u2778\u27c5\u2723\u274d\u27e0\u390c\u27a4\u27c9\u2866\u36c8\u2827\u284b\u288e\u28e0\u2831\u28c1\u2974\u29ff\u2957\u297d\u2908\u29f3\u2956\u29f9\u299b\u2a7f\u34eb\u2a75\u2b65\u342c\u2adc\u2af1\u2a9e\u2b68\u2bce\u2b34\u2b4c\u2be6\u2bcb\u2ba0\u2bc8\u2c6a\u2cc6\u2c65\u2c12\u2c63\u2ccd\u2ce1\u2c94\u2c96\u33a1\u2d4d\u2d72", 8946), new String[]{IO_1.I1lo("\u22bd\u235a", 8946), IO_1.I1lo("\u22ba\u22a1\u3deb\u2321\u2309\u2387\u23c8\u3d60\u2384\u2403\u245c\u242f\u248c\u24e8", 8946)});
            return;
        }
        if (!(bl || iOol._lOO != 0 && this.II0l() >= 1)) {
            this.lOol = 1 + this.III_.nextInt(5);
            String string = iOol._lOO == 0 ? IO_1.I1lo("\u22a4\u23f2\u235e\u2328\u234e\u23e1\u23cd\u23a2\u23ca\u2462\u2440\u24b3\u2408\u24e2\u2484\u24a1\u2483\u256f\u2547\u251f\u2536\u3ba4\u25f5\u2597\u25fa\u258d\u2670\u2652\u2639\u2655\u26f8\u26c6\u387f\u2685\u2730\u2743\u27ae\u274d\u27e7\u27c3\u273e\u2787\u286f\u2807\u2957\u29d5\u3667\u28c0\u28e2\u2897\u29e0\u2970\u2910", 8946) : IO_1.I1lo("\u22bf\u3dca\u2359\u236f\u2318\u236d\u23c3\u23eb\u2388\u2468\u2446\u2420\u2446\u24e6\u24cc\u2573\u2483\u2521\u2431\u3bd8\u257e\u254c\u25bc\u25d5\u25bd\u2519\u2661\u261b\u2676\u2616\u26fc\u2703\u26b3\u26d1\u2601\u39c8\u276e\u2719\u263c\u278b\u27a9\u2708\u286b\u284f\u2868", 8946);
            iO00.IIII(25, 7003, string + IO_1.I1lo("\u22f8\u235f\u2358\u22ff\u2300\u23ea\u2382\u23e5\u23c4\u2429\u2400\u2429\u240e\u2469\u24ca\u24e3\u2493\u2574\u2541\u2551\u2536\u255d\u25ee\u3b68\u25b3\u25d9\u2670\u3896\u2676\u2612\u26fd\u387e\u26bc\u2696\u2739\u270f\u2720\u39d2\u27f9\u278b\u27a4\u278e\u29b8\u2986\u282f\u2845\u28e6\u28ca\u367d\u2895\u2920\u280e\u2957\u379c\u2909\u29b7\u299a\u28c8\u2848\u2a76\u2a16\u2a27\u2a1d\u2a79\u2adc\u2ab6\u2ad0\u2b7b\u2b4f\u2b6d", 8946) + this.lOol + IO_1.I1lo("\u22d2\u2365\u2358\u3d80\u2307\u23ad\u23da\u232b\u2384\u246e\u2404\u2467\u2412\u24e4\u2484\u24a0\u248d\u2568\u2500\u2551\u2536\u24cd\u25bc\u25d0\u25b2\u250d\u2676\u2650\u2676\u2601\u26fc\u3816\u26ab\u26d1\u277e\u2748\u26fe\u26cc\u27e5\u278b\u27a6\u3952\u2866\u2807\u2830\u2885\u28eb\u288f\u28e2\u288a\u2968\u37d0\u2957\u297d\u290c\u29f3\u3719\u29b0\u29d8\u2a7c\u2a5e\u2a34\u2a1d\u2ab3\u2ad0\u2a30\u2a9f\u2b2f\u2b4c\u2b2c\u2b02\u2bec\u2b8a\u2ba1\u3531\u2c6e\u2c06\u2c29\u2c84\u2cee\u2c82\u2ca6\u2c0c\u2cdf\u2d7d\u2d55\u2d33\u2d5b\u2df7\u337e\u2dac\u2dd9\u2e1c\u2e78\u2eb4\u2e53\u2efc\u2ed9\u300b\u2ecf\u2e1f\u31c6\u2f22\u2f0c\u2faa\u2eb8\u310b\u2fc7\u306a\u2efc\u3064\u3000\u30ea\u30d4\u30b9\u2e18\u3090\u313d\u3152\u31bb\u3103\u31b9\u31ca\u31b6\u31da\u3235\u325f\u323b\u3286\u32ff\u32d7\u32ef\u329a\u3365\u33c0\u336b\u327b\u2d62\u33c6\u33a0\u33c6\u3471\u3456\u34a2\u3401\u34e9\u3480\u34cb\u34bf\u34d3", 8946), new String[]{IO_1.I1lo("\u23e2\u23eb\u2344\u236f\u2302\u237e\u23d8\u23c1\u23c2", 8946) + this.lOol + IO_1.I1lo("\u22d2\u2365\u2358\u3d80\u2307\u23ad\u23da\u232b\u2384\u246e\u2401", 8946), IO_1.I1lo("\u22b9\u2379\u23c4\u2321\u2309", 8946), IO_1.I1lo("\u22ba\u22a1\u3deb\u2321\u2309\u2387\u23c8\u3d60\u2384\u2403\u245c\u242f\u248c\u24e8", 8946)});
            return;
        }
        iO00.IIII(25, 7001, IO_1.I1lo("\u22ba\u23e5\u235d\u236f\u2300\u23ec\u23d5\u23eb\u2388\u2468\u2446\u2420\u2446\u24ed\u3a7d\u24aa\u24c2\u2562\u3bc7\u255e\u257e\u2513\u25fb\u240b\u247b\u2590\u2638\u2654\u263e\u27c5\u26f5\u2693\u26a4\u2611\u277f\u270f\u273a\u271f\u392d\u27c2\u27ea\u2785\u36af\u2849\u2866\u280b\u2864\u28cc\u28ec\u28c1\u294e\u2978\u288e\u28fc\u2915\u29bb\u29d9\u292a\u29d8\u2a7a\u2a43\u3484\u2a1a\u2ab3\u2ac4\u2a31\u2a9f\u2b05\u2b45\u2b25\u2b98\u2be5\u2bcd\u2bf6\u2be2\u2d17\u32e5\u2c65\u2c12\u2c63\u2ccd\u2ced\u2cc0\u2c8b\u2d7f\u2d1d\u2d37\u2d13\u2def\u2dc0\u2d32\u2d99\u2e36\u2e5b\u2e33\u2fc3\u2f33\u2ed8\u2ef0\u2e81\u2fe4\u2f43\u2f6c\u2f08\u2f79\u2f89\u2ffb\u2fca\u3032\u3005\u302a\u3004\u3132\u2e7c\u30a9\u30ff\u309d\u31e4\u3152\u313c\u315a\u31fb\u31d9\u31b9\u3191\u3235\u3325\u323a\u3252\u32f2\u3249\u32a1\u3289\u3323", 8946), new String[]{IO_1.I1lo("\u22a4\u23f1\u235f\u2345\u2346\u23e0\u23c5\u3d0e\u2384\u2429\u2458\u242f\u248b\u24ac", 8946), IO_1.I1lo("\u22b9\u2379\u23c4\u2321\u2309", 8946), IO_1.I1lo("\u22ba\u22a1\u3deb\u2321\u2309\u2387\u23c8\u3d60\u2384\u2403\u245c\u242f\u248c\u24e8", 8946)});
    }

    boolean III_(int n, int n2) {
        if (n == 7001) {
            if (n2 == 0) {
                this.lII_();
            } else if (n2 == 2) {
                this.var_IO0_III1.var_IO00_II.III1(25, IO_1.I1lo("\u22c3\u2338\u2310\u231b\u231c\u3d2c\u23c5\u23eb\u22fb\u3ad0\u244b\u2467\u2408\u24ed\u2447\u24ad\u24c2\u256d\u25c0\u251f\u2530\u24dc\u25f5\u259b\u25b9\u2518\u267b\u2617\u2638\u2612\u2724\u2712\u26bb\u26d1\u277b\u2747\u27ba\u2703\u27eb\u278b\u27a4\u2703\u2866\u2807\u2830\u2885\u28eb\u2883\u28b4\u280d\u2920\u2971\u2956\u37b2\u2912\u29fc\u299a\u29ad\u2848\u34cc\u2a58\u2a32\u2a54\u2ae7\u2a53\u2af1\u2a82\u35aa\u2b5a\u2b6d\u2b01\u352a\u2bc4\u2ba1\u2bc6\u2c27\u2c6e\u2c24\u2c0c\u2ce2\u2cca\u2ca0\u2ce8\u2ccd\u2d37\u2d1d\u2d08\u2d09\u2df5\u2dd7\u2dbf\u2dd7\u2e62\u2e47\u30f5\u2e1a\u2eb2\u2fa0\u3009\u2e8c\u2f2e\u2f43\u2f24\u2f88\u2fe4\u2f85\u2fe8\u2f8a\u2ed1\u304c\u3064\u3015\u2e49\u3081\u30b4\u316f\u2e25\u3173\u315b\u317b\u306b\u2f58\u31cd\u31f7\u3191\u327c\u2cdb\u3273\u321c\u32f6\u2c7d\u32ac\u32ce\u337f\u2dff\u3325\u330d\u33a9\u33dc\u2d2c\u33c6\u3431\u3404\u3430\u3403\u34ee\u3480\u35ae\u2a61\u3493\u353c\u350d\u357a\u350a\u35f9\u35d8\u35fa\u35d5\u3660\u36ca\u362b\u3651\u36fc\u3655\u36ad\u36e7\u373f\u3702\u376a\u3727\u2937\u37d2\u37e6\u378b\u3863\u3993\u39e3\u3808\u38a0\u38eb\u38d6\u3830\u389f\u3973\u391a\u393a\u3910\u2728\u39c2\u39f5\u3980\u3a7b\u3ade\u3a71\u3a13\u2466\u3a8e\u3abb\u3a85\u25cc\u3b49\u3b69\u3b1e\u3b67\u3bc9\u3beb\u3bc4\u3c4d\u3c4a\u3df1\u3c0e\u3c18\u3cbe\u3cc9\u3cbd\u3cdb\u3d79\u3d51\u2391\u3d57\u3df5\u3ddd\u3dbb\u3dd3\u3e64\u3ed1\u3e3f\u3e4f\u3ee3\u207a\u3ea5\u3ecb\u3f64\u3f4e\u3fa8\u3f1e\u3fa6\u3fc8\u211d\u3f97\u4022\u404d\u5ee7\u4031\u405e\u40e9\u40d4\u402f\u4093\u4135\u4118\u4046\u5fb5\u41b5\u41da\u41b4\u4042\u43b0\u4259\u426f\u4205\u42e5\u5c63\u42a2\u42ca\u4379\u4340\u5de4\u430f\u43a5\u43c7\u43ab\u5d5d\u4475\u4400\u4451\u4436\u4414\u5a5d\u44ce\u44f6\u44d9\u4570\u4556\u453e\u4514\u45fc\u45d2\u45fc\u45f9\u4624\u4606\u466e\u462e\u466d\u46c8\u46ea\u469f\u59c3\u4707\u4732\u46d5\u595f\u47cd\u47a5\u47c1\u4874\u486d\u4851\u4833\u481b\u48bb\u48ce\u48ab\u5659\u497e\u4916\u4927\u57d1\u49e7\u4992\u49bc\u5751\u4a61\u4a46\u4a6d\u4a02\u4ae3\u4a43\u4ae5\u4ac8\u4b64\u4bc7\u4b26\u4b44\u4bed\u4bc5\u4a71\u4a41\u4b96\u4c3e\u4c56\u4c34\u4c8f\u4cf4\u4cde\u4cf8\u4de6\u4cb7\u4d5b\u4d74\u4d14\u4dfb\u5312\u4dbe\u4dcf\u4e6d\u4ede\u4e6c\u4e1f\u4ee2\u506a\u4ee8\u4ff6\u4fe7\u4f4b\u4f2c\u4f43\u4fe0\u5100\u4fa9\u4fff\u4f96\u4ed0\u501c\u5039\u4ecb\u50f7\u50df\u50f7\u5095\u51f4\u5157\u513b\u5152\u51f3\u515c\u51a1\u5186\u522d\u5258\u5223\u53da\u4c54\u52c6\u52a0\u52c6\u536b\u534c\u52f3\u5342\u5290\u5341\u53d1\u53b6\u53dd\u546d\u544e\u54bb\u5410\u54b8\u55a6\u5566\u4a16\u5577\u5513\u5443\u5593\u55e5\u55a5\u55fb\u55c4\u562c\u5666\u563f\u48b8\u56e6\u5687\u56b0\u5605\u576b\u570f\u5762\u570f\u57e7\u562f\u561f\u57b4\u57dc\u586b\u5852\u46fa\u5811\u58b7\u58d1\u58bc\u5895\u5933\u595c\u5939\u47dd\u59ff\u598e\u59af\u598d\u5a65\u5a4d\u5a69\u5a00\u445e\u5acf\u5ae5\u5bf5\u5ab3\u45c1\u5b22\u5b40\u5b17\u5a3f\u5bd3\u5bfc\u5bca\u5c3a\u5c57\u5c3f\u5c97\u5cef\u5c9b\u5cf4\u5cb8\u5d7a\u5dc5\u5d3e\u5d08\u5dae\u5dd9\u5da4\u5d07\u5e2a\u5e59\u5e20\u40c4\u5eef\u5e85\u5ea6\u5e8a\u41bd\u5f55\u5f60\u5e4e\u5f17\u415c\u5fc9\u5ffb\u5f8c\u7ec2\u6051\u6077\u601a\u6078\u60da\u60bb\u60d2\u6172\u6151\u6121\u6106\u61a3\u61a4\u61fd\u61c3\u6229\u6265\u7c90\u620f\u62a5\u62c8\u7c64\u628c\u6321\u6356\u63df\u6331\u6351\u63bc\u63d5\u63bd\u6249\u65b9\u645e\u6476\u6416\u64fc\u7a7a\u64f2\u6492\u65e3\u650f\u657d\u655d\u65ac\u65db\u65a2\u6513\u667c\u6607\u6757\u78a6\u66a4\u67b2\u6623\u668f\u6768\u6731\u671e\u670e\u671d\u67ee\u679a\u67ea\u67c8\u6837\u6846\u683d\u688e\u68e7\u6892\u68bc\u6810\u692f\u6940\u692a\u68dc\u682a\u69c3\u69e9\u699e\u74ac\u6a48\u6a65\u6a0f\u6aeb\u6a56\u6aaf\u6a87\u6adf\u6b6a\u6b55\u75f3\u6b15\u6bfd\u6b95\u6bf8\u6b83\u6c77\u6c15\u6c27\u72ce\u6cb2\u6cd2\u6cb8\u6c80\u6d2e\u6d40\u6dad\u6d12\u6daa\u6dcb\u6da9\u6d9e\u6e26\u6e46\u6e2c\u70bc\u6ea2\u6ecf\u6ea7\u6f6f\u6f5f\u6f74\u6f1c\u6f2d\u71bb\u6fb9\u6fd6\u6fbf\u6f16\u703b", 8946));
            }
            return true;
        }
        if (n == 7002) {
            if (n2 == 1) {
                this.var_IO0_III1.var_IO00_II.III1(25, IO_1.I1lo("\u22c3\u2338\u2310\u231b\u231c\u3d2c\u23c5\u23eb\u22fb\u3ad0\u244b\u2467\u2408\u24ed\u2447\u24ad\u24c2\u256d\u25c0\u251f\u2530\u24dc\u25f5\u259b\u25b9\u2518\u267b\u2617\u2638\u2612\u2724\u2712\u26bb\u26d1\u277b\u2747\u27ba\u2703\u27eb\u278b\u27a4\u2703\u2866\u2807\u2830\u2885\u28eb\u2883\u28b4\u280d\u2920\u2971\u2956\u37b2\u2912\u29fc\u299a\u29ad\u2848\u34cc\u2a58\u2a32\u2a54\u2ae7\u2a53\u2af1\u2a82\u35aa\u2b5a\u2b6d\u2b01\u352a\u2bc4\u2ba1\u2bc6\u2c27\u2c6e\u2c24\u2c0c\u2ce2\u2cca\u2ca0\u2ce8\u2ccd\u2d37\u2d1d\u2d08\u2d09\u2df5\u2dd7\u2dbf\u2dd7\u2e62\u2e47\u30f5\u2e1a\u2eb2\u2fa0\u3009\u2e8c\u2f2e\u2f43\u2f24\u2f88\u2fe4\u2f85\u2fe8\u2f8a\u2ed1\u304c\u3064\u3015\u2e49\u3081\u30b4\u316f\u2e25\u3173\u315b\u317b\u306b\u2f58\u31cd\u31f7\u3191\u327c\u2cdb\u3273\u321c\u32f6\u2c7d\u32ac\u32ce\u337f\u2dff\u3325\u330d\u33a9\u33dc\u2d2c\u33c6\u3431\u3404\u3430\u3403\u34ee\u3480\u35ae\u2a61\u3493\u353c\u350d\u357a\u350a\u35f9\u35d8\u35fa\u35d5\u3660\u36ca\u362b\u3651\u36fc\u3655\u36ad\u36e7\u373f\u3702\u376a\u3727\u2937\u37d2\u37e6\u378b\u3863\u3993\u39e3\u3808\u38a0\u38eb\u38d6\u3830\u389f\u3973\u391a\u393a\u3910\u2728\u39c2\u39f5\u3980\u3a7b\u3ade\u3a71\u3a13\u2466\u3a8e\u3abb\u3a85\u25cc\u3b49\u3b69\u3b1e\u3b67\u3bc9\u3beb\u3bc4\u3c4d\u3c4a\u3df1\u3c0e\u3c18\u3cbe\u3cc9\u3cbd\u3cdb\u3d79\u3d51\u2391\u3d57\u3df5\u3ddd\u3dbb\u3dd3\u3e64\u3ed1\u3e3f\u3e4f\u3ee3\u207a\u3ea5\u3ecb\u3f64\u3f4e\u3fa8\u3f1e\u3fa6\u3fc8\u211d\u3f97\u4022\u404d\u5ee7\u4031\u405e\u40e9\u40d4\u402f\u4093\u4135\u4118\u4046\u5fb5\u41b5\u41da\u41b4\u4042\u43b0\u4259\u426f\u4205\u42e5\u5c63\u42a2\u42ca\u4379\u4340\u5de4\u430f\u43a5\u43c7\u43ab\u5d5d\u4475\u4400\u4451\u4436\u4414\u5a5d\u44ce\u44f6\u44d9\u4570\u4556\u453e\u4514\u45fc\u45d2\u45fc\u45f9\u4624\u4606\u466e\u462e\u466d\u46c8\u46ea\u469f\u59c3\u4707\u4732\u46d5\u595f\u47cd\u47a5\u47c1\u4874\u486d\u4851\u4833\u481b\u48bb\u48ce\u48ab\u5659\u497e\u4916\u4927\u57d1\u49e7\u4992\u49bc\u5751\u4a61\u4a46\u4a6d\u4a02\u4ae3\u4a43\u4ae5\u4ac8\u4b64\u4bc7\u4b26\u4b44\u4bed\u4bc5\u4a71\u4a41\u4b96\u4c3e\u4c56\u4c34\u4c8f\u4cf4\u4cde\u4cf8\u4de6\u4cb7\u4d5b\u4d74\u4d14\u4dfb\u5312\u4dbe\u4dcf\u4e6d\u4ede\u4e6c\u4e1f\u4ee2\u506a\u4ee8\u4ff6\u4fe7\u4f4b\u4f2c\u4f43\u4fe0\u5100\u4fa9\u4fff\u4f96\u4ed0\u501c\u5039\u4ecb\u50f7\u50df\u50f7\u5095\u51f4\u5157\u513b\u5152\u51f3\u515c\u51a1\u5186\u522d\u5258\u5223\u53da\u4c54\u52c6\u52a0\u52c6\u536b\u534c\u52f3\u5342\u5290\u5341\u53d1\u53b6\u53dd\u546d\u544e\u54bb\u5410\u54b8\u55a6\u5566\u4a16\u5577\u5513\u5443\u5593\u55e5\u55a5\u55fb\u55c4\u562c\u5666\u563f\u48b8\u56e6\u5687\u56b0\u5605\u576b\u570f\u5762\u570f\u57e7\u562f\u561f\u57b4\u57dc\u586b\u5852\u46fa\u5811\u58b7\u58d1\u58bc\u5895\u5933\u595c\u5939\u47dd\u59ff\u598e\u59af\u598d\u5a65\u5a4d\u5a69\u5a00\u445e\u5acf\u5ae5\u5bf5\u5ab3\u45c1\u5b22\u5b40\u5b17\u5a3f\u5bd3\u5bfc\u5bca\u5c3a\u5c57\u5c3f\u5c97\u5cef\u5c9b\u5cf4\u5cb8\u5d7a\u5dc5\u5d3e\u5d08\u5dae\u5dd9\u5da4\u5d07\u5e2a\u5e59\u5e20\u40c4\u5eef\u5e85\u5ea6\u5e8a\u41bd\u5f55\u5f60\u5e4e\u5f17\u415c\u5fc9\u5ffb\u5f8c\u7ec2\u6051\u6077\u601a\u6078\u60da\u60bb\u60d2\u6172\u6151\u6121\u6106\u61a3\u61a4\u61fd\u61c3\u6229\u6265\u7c90\u620f\u62a5\u62c8\u7c64\u628c\u6321\u6356\u63df\u6331\u6351\u63bc\u63d5\u63bd\u6249\u65b9\u645e\u6476\u6416\u64fc\u7a7a\u64f2\u6492\u65e3\u650f\u657d\u655d\u65ac\u65db\u65a2\u6513\u667c\u6607\u6757\u78a6\u66a4\u67b2\u6623\u668f\u6768\u6731\u671e\u670e\u671d\u67ee\u679a\u67ea\u67c8\u6837\u6846\u683d\u688e\u68e7\u6892\u68bc\u6810\u692f\u6940\u692a\u68dc\u682a\u69c3\u69e9\u699e\u74ac\u6a48\u6a65\u6a0f\u6aeb\u6a56\u6aaf\u6a87\u6adf\u6b6a\u6b55\u75f3\u6b15\u6bfd\u6b95\u6bf8\u6b83\u6c77\u6c15\u6c27\u72ce\u6cb2\u6cd2\u6cb8\u6c80\u6d2e\u6d40\u6dad\u6d12\u6daa\u6dcb\u6da9\u6d9e\u6e26\u6e46\u6e2c\u70bc\u6ea2\u6ecf\u6ea7\u6f6f\u6f5f\u6f74\u6f1c\u6f2d\u71bb\u6fb9\u6fd6\u6fbf\u6f16\u703b", 8946));
            }
            return true;
        }
        if (n == 7003) {
            if (n2 == 0) {
                this.lIII();
            } else if (n2 == 2) {
                this.var_IO0_III1.var_IO00_II.III1(25, IO_1.I1lo("\u22c3\u2338\u2310\u231b\u231c\u3d2c\u23c5\u23eb\u22fb\u3ad0\u244b\u2467\u2408\u24ed\u2447\u24ad\u24c2\u256d\u25c0\u251f\u2530\u24dc\u25f5\u259b\u25b9\u2518\u267b\u2617\u2638\u2612\u2724\u2712\u26bb\u26d1\u277b\u2747\u27ba\u2703\u27eb\u278b\u27a4\u2703\u2866\u2807\u2830\u2885\u28eb\u2883\u28b4\u280d\u2920\u2971\u2956\u37b2\u2912\u29fc\u299a\u29ad\u2848\u34cc\u2a58\u2a32\u2a54\u2ae7\u2a53\u2af1\u2a82\u35aa\u2b5a\u2b6d\u2b01\u352a\u2bc4\u2ba1\u2bc6\u2c27\u2c6e\u2c24\u2c0c\u2ce2\u2cca\u2ca0\u2ce8\u2ccd\u2d37\u2d1d\u2d08\u2d09\u2df5\u2dd7\u2dbf\u2dd7\u2e62\u2e47\u30f5\u2e1a\u2eb2\u2fa0\u3009\u2e8c\u2f2e\u2f43\u2f24\u2f88\u2fe4\u2f85\u2fe8\u2f8a\u2ed1\u304c\u3064\u3015\u2e49\u3081\u30b4\u316f\u2e25\u3173\u315b\u317b\u306b\u2f58\u31cd\u31f7\u3191\u327c\u2cdb\u3273\u321c\u32f6\u2c7d\u32ac\u32ce\u337f\u2dff\u3325\u330d\u33a9\u33dc\u2d2c\u33c6\u3431\u3404\u3430\u3403\u34ee\u3480\u35ae\u2a61\u3493\u353c\u350d\u357a\u350a\u35f9\u35d8\u35fa\u35d5\u3660\u36ca\u362b\u3651\u36fc\u3655\u36ad\u36e7\u373f\u3702\u376a\u3727\u2937\u37d2\u37e6\u378b\u3863\u3993\u39e3\u3808\u38a0\u38eb\u38d6\u3830\u389f\u3973\u391a\u393a\u3910\u2728\u39c2\u39f5\u3980\u3a7b\u3ade\u3a71\u3a13\u2466\u3a8e\u3abb\u3a85\u25cc\u3b49\u3b69\u3b1e\u3b67\u3bc9\u3beb\u3bc4\u3c4d\u3c4a\u3df1\u3c0e\u3c18\u3cbe\u3cc9\u3cbd\u3cdb\u3d79\u3d51\u2391\u3d57\u3df5\u3ddd\u3dbb\u3dd3\u3e64\u3ed1\u3e3f\u3e4f\u3ee3\u207a\u3ea5\u3ecb\u3f64\u3f4e\u3fa8\u3f1e\u3fa6\u3fc8\u211d\u3f97\u4022\u404d\u5ee7\u4031\u405e\u40e9\u40d4\u402f\u4093\u4135\u4118\u4046\u5fb5\u41b5\u41da\u41b4\u4042\u43b0\u4259\u426f\u4205\u42e5\u5c63\u42a2\u42ca\u4379\u4340\u5de4\u430f\u43a5\u43c7\u43ab\u5d5d\u4475\u4400\u4451\u4436\u4414\u5a5d\u44ce\u44f6\u44d9\u4570\u4556\u453e\u4514\u45fc\u45d2\u45fc\u45f9\u4624\u4606\u466e\u462e\u466d\u46c8\u46ea\u469f\u59c3\u4707\u4732\u46d5\u595f\u47cd\u47a5\u47c1\u4874\u486d\u4851\u4833\u481b\u48bb\u48ce\u48ab\u5659\u497e\u4916\u4927\u57d1\u49e7\u4992\u49bc\u5751\u4a61\u4a46\u4a6d\u4a02\u4ae3\u4a43\u4ae5\u4ac8\u4b64\u4bc7\u4b26\u4b44\u4bed\u4bc5\u4a71\u4a41\u4b96\u4c3e\u4c56\u4c34\u4c8f\u4cf4\u4cde\u4cf8\u4de6\u4cb7\u4d5b\u4d74\u4d14\u4dfb\u5312\u4dbe\u4dcf\u4e6d\u4ede\u4e6c\u4e1f\u4ee2\u506a\u4ee8\u4ff6\u4fe7\u4f4b\u4f2c\u4f43\u4fe0\u5100\u4fa9\u4fff\u4f96\u4ed0\u501c\u5039\u4ecb\u50f7\u50df\u50f7\u5095\u51f4\u5157\u513b\u5152\u51f3\u515c\u51a1\u5186\u522d\u5258\u5223\u53da\u4c54\u52c6\u52a0\u52c6\u536b\u534c\u52f3\u5342\u5290\u5341\u53d1\u53b6\u53dd\u546d\u544e\u54bb\u5410\u54b8\u55a6\u5566\u4a16\u5577\u5513\u5443\u5593\u55e5\u55a5\u55fb\u55c4\u562c\u5666\u563f\u48b8\u56e6\u5687\u56b0\u5605\u576b\u570f\u5762\u570f\u57e7\u562f\u561f\u57b4\u57dc\u586b\u5852\u46fa\u5811\u58b7\u58d1\u58bc\u5895\u5933\u595c\u5939\u47dd\u59ff\u598e\u59af\u598d\u5a65\u5a4d\u5a69\u5a00\u445e\u5acf\u5ae5\u5bf5\u5ab3\u45c1\u5b22\u5b40\u5b17\u5a3f\u5bd3\u5bfc\u5bca\u5c3a\u5c57\u5c3f\u5c97\u5cef\u5c9b\u5cf4\u5cb8\u5d7a\u5dc5\u5d3e\u5d08\u5dae\u5dd9\u5da4\u5d07\u5e2a\u5e59\u5e20\u40c4\u5eef\u5e85\u5ea6\u5e8a\u41bd\u5f55\u5f60\u5e4e\u5f17\u415c\u5fc9\u5ffb\u5f8c\u7ec2\u6051\u6077\u601a\u6078\u60da\u60bb\u60d2\u6172\u6151\u6121\u6106\u61a3\u61a4\u61fd\u61c3\u6229\u6265\u7c90\u620f\u62a5\u62c8\u7c64\u628c\u6321\u6356\u63df\u6331\u6351\u63bc\u63d5\u63bd\u6249\u65b9\u645e\u6476\u6416\u64fc\u7a7a\u64f2\u6492\u65e3\u650f\u657d\u655d\u65ac\u65db\u65a2\u6513\u667c\u6607\u6757\u78a6\u66a4\u67b2\u6623\u668f\u6768\u6731\u671e\u670e\u671d\u67ee\u679a\u67ea\u67c8\u6837\u6846\u683d\u688e\u68e7\u6892\u68bc\u6810\u692f\u6940\u692a\u68dc\u682a\u69c3\u69e9\u699e\u74ac\u6a48\u6a65\u6a0f\u6aeb\u6a56\u6aaf\u6a87\u6adf\u6b6a\u6b55\u75f3\u6b15\u6bfd\u6b95\u6bf8\u6b83\u6c77\u6c15\u6c27\u72ce\u6cb2\u6cd2\u6cb8\u6c80\u6d2e\u6d40\u6dad\u6d12\u6daa\u6dcb\u6da9\u6d9e\u6e26\u6e46\u6e2c\u70bc\u6ea2\u6ecf\u6ea7\u6f6f\u6f5f\u6f74\u6f1c\u6f2d\u71bb\u6fb9\u6fd6\u6fbf\u6f16\u703b", 8946));
            }
            return true;
        }
        return false;
    }

    private void lIII() {
        if (this.II10(457) < this.lOol) {
            this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22bc\u2376\u2280\u22ee\u2307\u23ad\u23c7\u23a3\u231e\u2467\u244f\u2467\u2577\u3a62\u2484", 8946) + this.lOol + IO_1.I1lo("\u22d2\u2365\u2358\u3d80\u2307\u23ad\u23da\u232b\u2384\u246e\u2408\u2556\u3aa5\u24a5\u25b5\u2439\u2496\u2521\u254c\u25cc\u252a", 8946));
            return;
        }
        this.II1O(457, this.lOol);
        this.var_IO0_III1.IIIl.l1_l();
        this.Io1I = true;
        this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22be\u23fc\u235e\u2327\u234e\u23ee\u23cd\u23a5\u2382\u2429\u2539\u24a4\u2446\u24eb\u24cc\u3a6e\u248c\u2521", 8946) + this.lOol + IO_1.I1lo("\u22d2\u2365\u2358\u3d80\u2307\u23ad\u23da\u232b\u2384\u246e\u2404\u2467\u240a\u3a32\u24ca\u24a4\u24c2\u256d\u3b9d\u251f\u244f\u3bbe\u25bc\u25d5\u25bd\u2449\u27b9\u265e\u2676\u2619\u382f\u26dd\u26f2\u2687\u27f0\u2740\u276e\u2739\u27fe\u390a\u27a3\u27c9\u2918\u36fe\u2825\u2845\u28ca\u28cb\u2821\u288f\u2920\u2972\u37e7\u2929\u295c\u29f6\u2956\u29b7\u2990\u2a3b\u2a16\u2a64\u2a54\u2aff\u2b02\u3432\u2a84\u2b2f\u2b4a\u2b38\u2b15\u2bab\u2bc4\u2ba1\u354d\u2c73", 8946));
        this.lII();
    }

    private int II10(int n) {
        int n2 = 0;
        IO0l[] iO0lArray = this.var_IO0_III1.var_IOol_II.var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            n2 += iO0lArray[i].lo0I;
        }
        return n2;
    }

    private void II1O(int n, int n2) {
        IO0l[] iO0lArray = this.var_IO0_III1.var_IOol_II.var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length && n2 > 0; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            if (iO0lArray[i].lo0I > n2) {
                iO0lArray[i].lo0I -= n2;
                n2 = 0;
                continue;
            }
            n2 -= iO0lArray[i].lo0I;
            iO0lArray[i] = new IO0l();
        }
    }

    void lIIl() {
        this.Io1 = !this.Io1;
        this.var_IO0_III1.IIIl.IIol(this.Io1 ? IO_1.I1lo("\u22a9\u2356\u237d\u2312\u234e\u229d\u234f\u23eb\u2388\u3ac6\u2408\u2556\u240f\u3a44\u24d1\u24e3\u2489\u2568\u3be7\u2551\u257e\u251f\u25fd\u25d5\u25bd\u25d9\u2670\u38ee\u263f\u265a\u26a5\u2693\u26be\u3856\u277e\u270f\u2723\u39ba\u27e5\u278b\u27a4\u278e\u28e8\u285e\u2866\u280e\u28ec\u28ca\u28e2\u2897\u29e0\u2970\u291e\u2909\u290e\u373a\u29d3\u29f9\u28e8\u34ce\u2a55\u2a75\u2a3a\u2afb\u2a51\u2abf", 8946) : IO_1.I1lo("\u22a9\u2356\u237d\u2312\u234e\u229d\u234f\u23eb\u2381\u2461\u24dc\u242e\u2446\u24f5\u24cc\u3a26\u2481\u2521\u2431\u2556\u3b9f\u2508\u25bc\u25d0\u25b3\u3b3e\u2676\u2617\u2620\u2695\u26fb\u2693\u2686\u2683\u39b1\u2746\u276e\u267d\u3955\u27c8\u27ea\u27a7\u2860\u28c4\u2828", 8946));
    }

    void lII1() {
        this.var_IO0_III1.var_IOol_II.IO0 = 0L;
        this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22a9\u2356\u237d\u2312\u234e\u229d\u234f\u23eb\u2398\u246c\u245b\u2422\u2412\u24a5\u24c8\u2573\u3a01\u2575\u2500\u242e\u2537\u255d\u25d8\u25d4\u25bb\u2597\u2670\u2617\u2602\u2607\u3835\u26da\u26f2\u2699\u27e4\u2742\u276e\u2703\u27ed\u27d2\u27e6\u27c9\u286b\u28d4\u2866\u2811\u28ec\u3660\u28e2\u2897\u29e0\u2970\u291e\u2931\u37dd\u29f2\u299a\u29b7\u299f\u2a76\u2a4f", 8946));
    }

    private void Ill0(int n) {
        I0Io.II iI = I0Io.II(n);
        I0Io.IIII iIII = null;
        if (iI != null && iI.var_I0Io$IIII_arr_II != null) {
            for (int i = 0; i < iI.var_I0Io$IIII_arr_II.length; ++i) {
                if (iI.var_I0Io$IIII_arr_II[i].I1l != 25) continue;
                iIII = iI.var_I0Io$IIII_arr_II[i];
                break;
            }
        }
        if (iIII == null) {
            this.Io1l = false;
            return;
        }
        if (!this.Io1l) {
            this.Io1l = true;
            int[] nArray = this.II();
            this.var_IOo__III1.II(new IO0o(-5).IIII(1600000001).IIII(-1).II(0).II(false).II(0).II(0).II(0).III(nArray[0]).II(IO_1.I1lo("\u22b1\u23e3\u2310\u230b\u2301\u23ec\u23c2\u23a3\u23ca\u245d\u245a\u3ae6\u240f", 8946)).IIII(999999).IIII(999999).III(nArray[1]).III(nArray[2]).II(-1).II(-1).III(iIII.I1 + 35).III(iIII.I1I).III(0).III(0).II(0).II(0).II(0).III(-1).II(0).II(0).III(-1).II(-1).III(-1));
            this.I1OO = System.currentTimeMillis() + 3000L;
        }
    }

    private int[] II() {
        Vector vector = I0I1.II();
        for (int i = 0; i < 40 && vector.size() > 0; ++i) {
            Integer n = (Integer)vector.elementAt(this.III_.nextInt(vector.size()));
            IOO.III iII = IOO.IOO$III_II(n);
            if (iII == null || iII.IoI_ != 5 || iII.lOlI != 0 && iII.lOlI != 3) continue;
            return I0I1.III_(n);
        }
        return new int[]{0, 0, 0};
    }

    void Ioo1() {
        this.Io1l = false;
    }

    private void lII_() {
        boolean bl;
        IOol iOol = this.var_IO0_III1.var_IOol_II;
        boolean bl2 = bl = this.Io1 || this.Io1I;
        if (!bl && iOol._lOO == 0) {
            this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22b9\u2379\u23c4\u2321\u2309\u23ad\u23d8\u23a3\u3d29\u2429\u245c\u242f\u3a97\u24e6\u2484\u24ab\u248b\u3bc6\u254e", 8946));
            return;
        }
        if (!this.IolO && !this.Io1 && this.Il1l()) {
            this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22a4\u2364\u2359\u236f\u2302\u237f\u23c2\u23ac\u23ca\u246a\u2440\u3a9a\u2446\u2594\u3a1b\u24ad\u24c2\u256f\u2547\u25df\u2527\u255d\u25f1\u25da\u25b3", 8946));
            return;
        }
        if (!bl && this.II0l() < 1) {
            return;
        }
        if (iOol.llIl <= 0) {
            this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22b9\u2379\u23c4\u2321\u2309\u23ad\u23d8\u23a3\u3d29\u2429\u245c\u242f\u3a97\u24e6\u2484\u24ab\u248b\u3bc6\u254e", 8946));
            return;
        }
        if (!this.IolO) {
            this.IolO = true;
            this.Iol0 = false;
            this.Iolo = false;
            this.I1O1 = System.currentTimeMillis();
            iOol.IO0 = IO0I.IIIl();
            for (int i = 53; i <= 62; ++i) {
                I0Io.II iI = I0Io.II(i);
                int n = iI == null || iI.III == null ? 0 : iI.III.length;
                this.var_boolean_arr_arr_II[i] = new boolean[n];
                this.II1O[i] = new int[n];
                this.var_long_arr_arr_II[i] = new long[n];
                for (int j = 0; j < n; ++j) {
                    this.II1O[i][j] = iI.III[j].l0o1;
                }
                this.var_java_util_Vector_arr_II[i] = new Vector();
            }
            this.lIIO();
            this.var_IO0_III1.I__O();
        }
        this.Io1I = false;
        iOol.lO1 = 0;
        this.var_IO0_III1.III_(53, 60, 100);
    }

    private void lIIO() {
        IOol iOol = this.var_IO0_III1.var_IOol_II;
        IO_I iO_I = this.var_IO0_III1.IIIl.var_IO_I_II;
        iO_I.Iool();
        long l = (long)iOol.Illo() / 20L;
        long l2 = (long)iOol.Il1I() * 50L;
        IO_I.III iII = iO_I.II(-4, IO_1.I1lo("\u22a6\u2343\u2365\u2301\u2329\u23d2\u23f9\u2392\u23b5\u245d\u247a\u2406\u2428\u24c2", 8946), IO_1.I1lo("\u22a6\u2363\u2345\u2321\u2309\u23ad\u23d9\u2336\u23ca\u245d\u245a\u3ae8\u2408\u24e2", 8946), new int[]{141, 142, 143, -1, -1, -1}, IO_1.II(l, 1.0), IO_1.III(l2, 1.0), 59, 198, 456, new String[]{IO_1.I1lo("\u228e\u233c\u2301\u2333\u2336\u23e8\u23c1\u23eb\u2387\u2460\u2408\u2423\u249f\u24eb\u24c3\u24e3\u2481\u25e0\u2543\u2557\u257e\u2513\u257c\u25d4\u25fa\u2591\u38b9\u2617\u2747\u27c5\u3877\u26d0\u26f2\u2685\u2771", 8946), IO_1.I1lo("\u228e\u233c\u2301\u2333\u2326\u23ec\u238c\u23a3\u238b\u2429\u2440\u2426", 8946), IO_1.I1lo("\u228e\u233c\u2301\u2333\u232c\u23f8\u23c0\u23a4\u2384\u2429\u2539\u24a5\u2413\u24a5\u24d0\u24aa\u2408\u2574\u2500\u255b\u2537\u3bba\u25e8\u259b\u25b2\u3b46\u266c\u2617\u2634\u38b8\u26fa\u2693\u26b1\u2699\u27ea\u2741\u2729\u274d\u27ef\u27c3\u27a5\u27c9\u287c\u2846", 8946)}, IO_1.II(false, false));
        iII.lO_o = 755;
        iII.lOO = 1060;
        iII.lOOI = 20;
        IO_I.III iII2 = iO_I.II(-6, IO_1.I1lo("\u22a6\u2343\u2365\u2301\u2329\u23d2\u23f9\u2392\u23b5\u2451\u2469\u2409\u242e\u24da\u24e8\u248c", 8946), IO_1.I1lo("\u22a6\u2363\u2345\u2321\u2309\u23ad\u23d9\u2336\u23ca\u2451\u2449\u2429\u240e\u24a5\u24e8\u2562", 8946), new int[]{135, 136, 137, -1, -1, -1}, IO_1.II(l, 1.1), IO_1.III(l2, 1.1), 62, 1210, 384, new String[]{IO_1.I1lo("\u228e\u233c\u2301\u2333\u2336\u23e8\u23c1\u23eb\u2389\u24e8\u244b\u2467\u2408\u24e2\u2514\u2562\u248b\u2521\u254d\u3b9e\u2530\u2515\u25bc\u24aa\u3b65\u2597\u2638\u2726\u26b4\u2600", 8946), IO_1.I1lo("\u228e\u233c\u2301\u2333\u2326\u23e8\u238c\u23a3\u238f\u2429\u2440\u2422", 8946)}, IO_1.II(true, false));
        iII2.Iol = true;
        iII2.lOOI = 20;
        IO_I.III iII3 = iO_I.II(-5, IO_1.I1lo("\u22a6\u2343\u2365\u2301\u2329\u23d2\u23f9\u2392\u23b5\u245d\u2460\u2402\u2436", 8946), IO_1.I1lo("\u22a6\u2363\u2345\u2321\u2309\u23ad\u23d9\u2336\u23ca\u245d\u2440\u24ae\u2416", 8946), new int[]{129, 130, 131, -1, -1, -1}, IO_1.II(l, 2.3), IO_1.III(l2, 1.15), 55, 884, 312, new String[]{IO_1.I1lo("\u228e\u233c\u2301\u2333\u2320\u3d32\u23d9\u23eb\u2388\u3ac4\u2446\u2467\u240b\u24ec\u2484\u24ae\u2497\u3bd0\u254e\u251f\u2532\u2597\u25f2\u259b\u25ae\u2590\u38a7\u2647\u2676\u2601\u3833\u26dd\u26b5\u26d1\u277c\u3988\u273b\u274d\u27f8\u27d9\u2720\u2787", 8946), IO_1.I1lo("\u228e\u233c\u2301\u2333\u233e\u23e5\u3d0f\u23a2\u23ca\u246b\u2598\u3a9c\u2405\u24a5\u24d5\u24b6\u2483\u2521\u2558\u25de\u253d\u255d\u25ff\u25d3\u3b65\u258d\u2638\u2654\u38b1\u2614\u26b4\u26c7\u26b3\u26d1\u2601\u27cc", 8946)}, IO_1.II(false, true));
        iII3.lO_o = 640;
        iII3.lOO = 980;
        iII3.lOOI = 20;
        IO_I.III iII4 = iO_I.II(-7, IO_1.I1lo("\u22bc\u2358\u237e\u2305\u232f\u23d2\u23ed\u2384\u23b5\u245d\u2461\u240a", 8946), IO_1.I1lo("\u22bc\u2378\u235e\u2325\u230f\u23ad\u236d\u23a4\u23ca\u245d\u24c5\u242a", 8946), new int[]{123, 124, 125, -1, -1, -1}, IO_1.II(l, 1.2), IO_1.III(l2, 1.2), 54, 190, 312, new String[]{IO_1.I1lo("\u228e\u233c\u2301\u2333\u233a\u23ec\u238c\u23b8\u3d57\u2429\u2450\u24ae\u2446\u24fd\u2445\u24a0\u24c2\u256f\u2547\u248f\u24ff\u2514\u25bc\u25c9\u25bb\u25d9\u266c\u265f\u26b6\u261b\u26fc\u2693\u26a6\u2683\u2613\u2742\u276e\u2700\u392f\u27c5\u27a2", 8946), IO_1.I1lo("\u228e\u233c\u2301\u2333\u2326\u23ec\u238c\u23a3\u238b\u2429\u2440\u2426", 8946)}, IO_1.II(false, false));
        iII4.lOOI = 30;
        int[] nArray = new int[]{-8, -18, -19, -20};
        for (int i = 0; i < 4; ++i) {
            IO_I.III iII5 = iO_I.II(nArray[i], IO_1.I1lo("\u22a0\u235e\u2372\u2300\u233a\u23d2\u23fa\u238e\u23b5\u245a\u2461", 8946), IO_1.I1lo("\u22a0\u23e5\u2352\u3d9e\u231a\u23ad\u23fa\u3d0c\u23ca\u245a\u2501\u2467\u2456", 8946) + i, new int[]{138, 139, 140, -1, -1, -1}, IO_1.II(l, 1.3), IO_1.III(l2, 1.3), 57, 300, 312, new String[0], IO_1.II(false, false));
            iII5.Iol = true;
            iII5.Ioll = true;
            iII5.lOOI = 20;
        }
    }

    private static int II(long l, double d) {
        return (int)Math.min(200000000L, (long)((double)l * d));
    }

    private static int III(long l, double d) {
        return (int)Math.min(2000000000L, (long)((double)l * d));
    }

    private static int[][] II(boolean bl, boolean bl2) {
        int[][] nArrayArray = new int[][]{{2, 3, -1}, {2, 6, -1}, {0, 7, -1}, {0, 1, -1}, {4, 5, -1}, {1, 6, -1}, {1, 5, -1}, {1, 4, -1}, {1, 3, -1}, {1, 2, -1}, {1, 1, -1}, {1, 7, bl2 ? 1000 : -1}, {5, 1, -1}, {5, 2, -1}, {5, 3, -1}, {5, 4, -1}, {5, 5, -1}, {5, 6, -1}, {5, 7, -1}, {3, 1, -1}, {3, 5, -1}, {3, 6, -1}};
        Vector<int[]> vector = new Vector<int[]>();
        for (int i = 0; i < nArrayArray.length; ++i) {
            if (bl2 && nArrayArray[i][0] == 1 && nArrayArray[i][1] != 7) continue;
            vector.addElement(nArrayArray[i]);
        }
        if (bl) {
            vector.addElement(new int[]{6, 7, 60000});
        }
        int[][] nArrayArray2 = new int[vector.size()][];
        vector.copyInto((Object[])nArrayArray2);
        return nArrayArray2;
    }

    int II1o(int n) {
        return (int)Math.min(Integer.MAX_VALUE, (long)this.var_IO0_III1.var_IOol_II.Il1I() * (long)n);
    }

    int II_(int n) {
        return (int)Math.min(Integer.MAX_VALUE, (long)this.var_IO0_III1.var_IOol_II.Illo() / (long)Math.max(1, n));
    }

    boolean IIIO(int n, int n2) {
        return this.IolO && n >= 53 && n <= 62 && this.var_boolean_arr_arr_II[n] != null && n2 < this.var_boolean_arr_arr_II[n].length && this.var_boolean_arr_arr_II[n][n2];
    }

    void II10(int n, int n2) {
        if (!this.IolO || this.var_boolean_arr_arr_II[n] == null || n2 >= this.var_boolean_arr_arr_II[n].length) {
            return;
        }
        this.var_boolean_arr_arr_II[n][n2] = true;
        if (this.var_long_arr_arr_II[n] != null && n2 < this.var_long_arr_arr_II[n].length) {
            this.var_long_arr_arr_II[n][n2] = System.currentTimeMillis();
        }
        this.lII0();
    }

    boolean Il11() {
        if (!this.IolO || this.var_boolean_arr_arr_II[59] == null) {
            return false;
        }
        for (int i = 0; i < this.var_boolean_arr_arr_II[59].length; ++i) {
            if (this.II1O[59][i] != 22 || this.var_boolean_arr_arr_II[59][i]) continue;
            return true;
        }
        return false;
    }

    boolean Il1_() {
        return this.IolO && this.var_IO0_III1.IIIl.var_IO_I_II.IllO();
    }

    boolean II__(int n) {
        if (!this.IolO || this.var_boolean_arr_arr_II[59] == null || n >= this.var_boolean_arr_arr_II[59].length || this.II1O[59] == null || this.II1O[59][n] != 22) {
            return false;
        }
        return this.Il1_() && System.currentTimeMillis() - this.var_long_arr_arr_II[59][n] >= 10000L;
    }

    void II1o(int n, int n2) {
        if (!this.IolO || this.var_boolean_arr_arr_II[n] == null || n2 >= this.var_boolean_arr_arr_II[n].length) {
            return;
        }
        this.var_boolean_arr_arr_II[n][n2] = false;
    }

    void II_I(IO_I.III iII) {
        this.lII0();
    }

    private void lII0() {
        if (!this.IolO || this.Iol0) {
            return;
        }
        for (int i = 53; i <= 62; ++i) {
            if (this.var_boolean_arr_arr_II[i] == null) {
                return;
            }
            for (int j = 0; j < this.var_boolean_arr_arr_II[i].length; ++j) {
                if (this.var_boolean_arr_arr_II[i][j]) continue;
                return;
            }
        }
        if (this.var_IO0_III1.IIIl.var_IO_I_II.Ill_()) {
            return;
        }
        this.Iol0 = true;
        this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22bf\u2370\u2345\u236f\u227f\u23e4\u238c\u23bf\u2306\u2464\u2408\u2557\u3abf\u24e6\u2484\u248d\u248a\u25e2\u254e", 8946));
    }

    void II_l(IO_I.III iII) {
        int n = this.III_.nextInt(2) == 0 ? 4 : 6;
        int n2 = Math.max(1, iII.lllI / 10);
        int n3 = Math.max(1, iII.lOlO / 10);
        for (int i = 0; i < n; ++i) {
            int n4 = Math.max(60, iII.I1 + this.III_.nextInt(401) - 200);
            int[] nArray = new int[]{123, 124, 125, -1, -1, -1};
            String[] stringArray = new String[]{IO_1.I1lo("\u228e\u233c\u2301\u2333\u233a\u23ec\u238c\u23b8\u3d57\u2429\u2450\u24ae\u2446\u24fd\u2445\u24a0\u24c2\u256f\u2547\u248f\u24ff\u2514\u25bc\u25c9\u25bb\u25d9\u266c\u265f\u26b6\u261b\u26fc\u2693\u26a6\u2683\u2613\u2742\u276e\u2700\u392f\u27c5\u27a2", 8946), IO_1.I1lo("\u228e\u233c\u2301\u2333\u2326\u23ec\u238c\u23a3\u238b\u2429\u2440\u2426", 8946)};
            this.var_IO0_III1.IIIl.var_IO_I_II.II((int)(-9 - i), (String)IO_1.I1lo((String)"\u22bc\u2358\u237e\u2305\u232f\u23d2\u23ef\u2387\u23a5\u2447\u246d", (int)8946), (String)IO_1.I1lo((String)"\u22bc\u2378\u235e\u2325\u230f\u23ad\u236d\u23a4\u23ca\u245d\u24c5\u242a", (int)8946), (int[])nArray, (int)n2, (int)n3, (int)54, (int)n4, (int)iII.I1I, (String[])stringArray, (int[][])IO_1.II((boolean)false, (boolean)false)).lOOI = 20;
        }
    }

    void lIIo() {
        if (!this.IolO || this.var_IO0_III1.var_IOol_II.lOlo != 57) {
            return;
        }
        IO00 iO00 = this.var_IO0_III1.var_IO00_II;
        if (!this.Iol0) {
            iO00.III1(26, IO_1.I1lo("\u22b0\u3ddc\u235e\u236f\u2303\u23e4\u238c\u22da\u3d01\u2467\u244f\u2467\u240e\u2477\u24ca\u24a4\u24c2\u2575\u2548\u2550\u25bf\u2509\u25bc\u25d0\u25b2\u3b36\u2671\u2617\u2638\u27d4\u26fd\u2693\u27c3\u2613\u2769", 8946));
            return;
        }
        iO00.III1(26, IO_1.I1lo("\u22a6\u2370\u2310\u232c\u2306\u3d46\u23d9\u23eb\u239e\u2461\u245d\u2426\u244a\u24a5\u24ca\u24ab\u2552\u256f\u2547\u251f\u253d\u259c\u25ff\u259b\u25b4\u259e\u27a8\u2796\u263f\u2655\u2785\u3858\u26bc\u2696\u2730\u274c\u27bd\u274d\u27e1\u27c4\u27a4\u278e\u2828\u284b\u36e3\u281c\u28a4\u29b2\u2972\u3602\u2963\u293f\u2950\u293a\u37b1\u29f8\u299a\u29ba\u371f\u2a76\u2a16\u2a27\u2a15\u2a99\u2ac6\u2ab0\u2ad0\u2a1e\u2bcd\u2b6d\u2b0b\u2be2\u350f\u2bbc\u2bc8\u2c69\u2c41\u3288\u2c07\u2ca3\u2c96\u2ce1\u2c93\u2c9e\u2d71\u2d1d\u2d2a\u2d9b\u2dba\u2d88\u2df8\u2ce6\u30c7\u2e5b\u2e33\u2e53\u2efc\u2ed6\u301d\u2e8c\u2f2e\u2f1a\u2f6c\u2f18\u2feb\u2fc6\u2fe8\u2f93\u3074\u304a\u302a\u3004\u30a2\u30c5\u30af\u30be\u3090\u3175\u311c\u312f\u3108\u2f38\u31d1\u31f7\u3198\u32f5\u324d\u327d\u325c\u32bf\u32ba\u328c\u320f\u336e\u330c\u3325\u330d\u3239\u3209\u33ae\u33c6\u3466\u344c\u2a8a\u3442\u34e2\u3453\u349f\u34ef\u34dd\u356c\u3553\u35a0\u350d\u35b8\u34a6\u35bf\u35d5\u3660\u36df\u363f\u365d\u36b0\u37be\u281f\u36cd\u376f\u37ca\u3729\u3749\u37e6\u37c0\u3676\u3644\u386d\u3803\u3836\u388d\u38ed\u38bf\u38cc\u38bc\u38dc\u3973\u395b\u3931\u3919\u39ff\u39d7", 8946));
        if (!this.Iolo) {
            this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u22a6\u2363\u3d91\u2326\u234e\u229d\u3d75\u23a8\u23ca\u2447\u2440\u24a4\u2408\u24a5\u25b5\u2420\u24c2\u2563\u3beb\u251f\u252a\u2514\u2576\u25ce\u25fa\u259d\u2671\u38f0\u2622\u2659\u26b4\u26d1\u3873\u269f\u2730\u274c\u27bd\u274d\u27bd\u278b\u27ba\u2781\u28f2\u2853\u2866\u2974\u3647\u2883\u28b6\u280d\u296d\u293f\u2955\u2934\u37c3\u29f6\u299a\u29af\u2991\u2afd\u2a58\u2a75\u2a1a\u2af4\u347f\u2ab2\u2ad0\u2b3b\u2b0e\u2b3e\u2b0d\u2be4\u2b8a\u2bbd\u2b9a\u2db7\u32fd\u2c26\u2c44\u2ce8\u2cca\u2ca8\u2cc0\u2c8f\u2d76\u2d54\u2d7c\u2d0f\u2df2\u2dcc\u2da1\u3336\u2e78\u2e15\u2f45\u30cc\u2efc\u2e91\u2fc1\u2e1c\u2f60", 8946));
            this.Iolo = true;
            this.I1O_ = System.currentTimeMillis();
            this.lIl();
            this.lI();
            this.Illo(57);
        }
    }

    private void lIl() {
        int n = 53 + this.III_.nextInt(10);
        for (int i = 53; i <= 62; ++i) {
            int n2;
            this.var_java_util_Vector_arr_II[i] = new Vector();
            I0Io.II iI = I0Io.II(i);
            int n3 = Integer.MAX_VALUE;
            int n4 = Integer.MIN_VALUE;
            if (iI != null && iI.III != null) {
                for (n2 = 0; n2 < iI.III.length; ++n2) {
                    if (iI.III[n2].I1 < n3) {
                        n3 = iI.III[n2].I1;
                    }
                    if (iI.III[n2].I1 <= n4) continue;
                    n4 = iI.III[n2].I1;
                }
            }
            n2 = 1 + this.III_.nextInt(3);
            for (int j = 0; j < n2; ++j) {
                int[] nArray = this.II(iI, n3, n4);
                this.var_java_util_Vector_arr_II[i].addElement(new int[]{18 + this.III_.nextInt(3), nArray[0], nArray[1], 1});
            }
            if (i != n) continue;
            int[] nArray = this.II(iI, n3, n4);
            this.var_java_util_Vector_arr_II[i].addElement(new int[]{17, nArray[0], nArray[1], 1});
        }
    }

    private int[] II(I0Io.II iI, int n, int n2) {
        if (iI != null && iI.III != null && iI.III.length > 0 && n2 > n) {
            int n3 = Math.max(60, n + this.III_.nextInt(n2 - n + 1));
            return new int[]{n3, IO_1.II(iI, n3)};
        }
        if (iI != null && iI.III != null && iI.III.length > 0) {
            I0Io.III iII = iI.III[this.III_.nextInt(iI.III.length)];
            return new int[]{Math.max(60, iII.I1), iII.I1I};
        }
        return new int[]{100 + this.III_.nextInt(500), 312};
    }

    private static int II(I0Io.II iI, int n) {
        int n2 = iI.III[0].I1I;
        int n3 = Math.abs(iI.III[0].I1 - n);
        for (int i = 1; i < iI.III.length; ++i) {
            int n4 = Math.abs(iI.III[i].I1 - n);
            if (n4 >= n3) continue;
            n3 = n4;
            n2 = iI.III[i].I1I;
        }
        return n2;
    }

    private void Illo(int n) {
        if (!this.IolO || !this.Iolo || this.var_java_util_Vector_arr_II[n] == null) {
            return;
        }
        long l = this.I1O_ + 60000L;
        for (int i = 0; i < this.var_java_util_Vector_arr_II[n].size(); ++i) {
            int[] nArray = (int[])this.var_java_util_Vector_arr_II[n].elementAt(i);
            if (nArray[3] != 1) continue;
            this.var_IO0_III1.IIIl.II(nArray[0], nArray[1], nArray[2], l);
        }
    }

    void III1(int n, int n2, int n3) {
        if (!this.IolO || !this.Iolo) {
            return;
        }
        int n4 = this.var_IO0_III1.var_IOol_II.lOlo;
        if (n4 < 53 || n4 > 62 || this.var_java_util_Vector_arr_II[n4] == null) {
            return;
        }
        for (int i = 0; i < this.var_java_util_Vector_arr_II[n4].size(); ++i) {
            int[] nArray = (int[])this.var_java_util_Vector_arr_II[n4].elementAt(i);
            if (nArray[3] != 1 || nArray[0] != n || nArray[1] != n2 || nArray[2] != n3) continue;
            nArray[3] = 0;
            if (n == 17) {
                this.lIl1();
            }
            return;
        }
    }

    void lIlI() {
        int n = this.var_IO0_III1.var_IOol_II.lOlo;
        if (this.IolO && IO_1.II_1(n)) {
            this.lI();
            this.Illo(n);
        }
        this.Ill0(n);
    }

    void III1(long l) {
        IOol iOol = this.var_IO0_III1.var_IOol_II;
        if (iOol == null) {
            return;
        }
        if (this.Io1l && l >= this.I1OO) {
            this.var_IOo__III1.II(new IO0o(44).IIII(1600000001).II(Il11[this.III_.nextInt(Il11.length)]));
            this.I1OO = l + 20000L + (long)this.III_.nextInt(30000);
        }
        if (!this.IolO) {
            if (IO_1.II_1(iOol.lOlo)) {
                this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u23e2\u23f2\u2310\u2327\u3dd1\u23f9\u238c\u23bf\u2382\u3ad4\u2441\u2467\u2401\u24ec\u24c5\u24ad\u24ce\u2521\u2542\u3b9e\u2530\u255d\u25ef\u3b06\u25fa\u24e8\u27a8\u38d4\u2635\u2655\u2785\u2703\u26b3\u26d1\u2766\u39ee\u276e\u2703\u27e4\u274b", 8946));
                this.var_IO0_III1.IlOl(21 + iOol.lOlI);
            }
            return;
        }
        if (!this.Iolo && l - this.I1O1 >= 1800000L || this.Iolo && l - this.I1O_ >= 60000L) {
            this.lIl1();
        }
    }

    void lIll() {
        if (!this.IolO) {
            return;
        }
        IOol iOol = this.var_IO0_III1.var_IOol_II;
        this.var_IO0_III1.IIIl.var_IO_I_II.II((long)iOol.Illo() / 20L, (long)iOol.Il1I() * 50L);
    }

    private void lIl1() {
        IOol iOol = this.var_IO0_III1.var_IOol_II;
        this.IolO = false;
        this.Iol0 = false;
        this.Iolo = false;
        this.Io1I = false;
        this.var_IO0_III1.IIIl.var_IO_I_II.Iool();
        this.var_IOo__III1.II(new IO0o(65).II(0).II("").III(0));
        if (IO_1.II_1(iOol.lOlo)) {
            this.var_IO0_III1.IIIl.IIol(IO_1.I1lo("\u23e2\u23f2\u2310\u2327\u3dd1\u23f9\u238c\u23bf\u2382\u3ad4\u2441\u2467\u2401\u24ec\u24c5\u24ad\u24ce\u2521\u2542\u3b9e\u2530\u255d\u25ef\u3b06\u25fa\u24e8\u27a8\u38d4\u2635\u2655\u2785\u2703\u26b3\u26d1\u2766\u39ee\u276e\u2703\u27e4\u274b", 8946));
            this.var_IO0_III1.IlOl(21 + iOol.lOlI);
        }
    }

    private static /* synthetic */ String I1lo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

