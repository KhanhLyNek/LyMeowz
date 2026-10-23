package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Random;

final class IO_o {
    static final int l0O_ = 10;
    static final int l0OO = 5;
    static final int[] I_I0 = new int[]{5000, 20000, 50000, 200000, 25};
    static final String[] Il_ = new String[]{IO_o.I111("\u2ea0\u3026", 11972), IO_o.I111("\u2ea6\u2e0f\u2f6c\u2f49\u2f60\u2f2b\u2f16\u2e2d\u3161\u2fb5\u2f9d", 11972), IO_o.I111("\u2eaf\u2e8b\u2ff1", 11972), IO_o.I111("\u2eb6\u3046\u2f76\u2f01\u2f2b\u2f37\u2f8d", 11972), IO_o.I111("\u2fd5\u3028\u2f63\u2f01\u2f2e\u2f38\u319b\u2ffe", 11972)};
    static final int l0O0 = 8301;
    static final int l0Oo = 8302;
    static final int l00 = 8310;
    static final int l00I = 8311;
    static final int l00l = 8312;
    static final int l001 = 8313;
    static final String[] Il_I = new String[]{IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u301e\u2e72\u30da\u30b4\u30d2\u317d\u315f\u3121\u3109", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303b\u2e95\u30fb\u3094\u30bf\u3000\u3178", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u31c2\u2e57\u3165", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u301e\u2e72\u30da\u30b4\u30d2\u317d\u315f\u3121\u3109\u31ad\u31c1\u2f72", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303b\u2e95\u30fb\u3094\u30bf\u3000\u3178\u3110\u3122\u2fd7", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u31c2\u2e57\u3165\u3110\u3122\u2fd7", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3023\u301e\u2e24\u30da\u30f3\u309e\u2fa0\u315e\u316f\u310c\u31ec\u31d5", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3027\u301e\u30fc\u3094\u30bf\u309d\u317f\u3157", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u30b1\u3093\u3168", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3023\u301e\u2e24\u30da\u30f3\u309e\u2fa0\u315e\u316f\u3103\u2f34", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3027\u301e\u30fc\u3094\u30bf\u309d\u317f\u3157\u316f\u3103\u2f34", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u30b1\u3093\u3168\u3110\u3122\u2fd7", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303f\u3013\u30fa\u3094\u30a1\u2e19\u317f\u3157", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303f\u3013\u30fa\u3094\u30b7\u3093\u3131\u3148\u312e\u3100\u31e5", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303f\u3013\u30fa\u3094\u30ab\u3093\u3168\u3154\u312e", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u2e86\u3015\u30b5\u30d9\u3163\u2e11\u317f\u3110\u3127\u2fbd\u31e3", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u2e86\u3015\u30b5\u30c7\u3039\u309c", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303f\u3013\u30fa\u3094\u30ab\u3093\u3168\u3154\u312e\u314e\u31e0\u2f15", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u301e\u3061\u30da\u30b4\u30d2\u3165\u2f87\u312c", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u31c2\u2e55\u3164\u3110\u313b\u3101", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u31c2\u2e39\u3170\u3110\u3121\u3109\u2f68\u31cf", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303f\u3013\u30fa\u3094\u30a1\u2e19\u317f\u3157\u316f\u3103\u2f34", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303f\u3013\u30fa\u3094\u30ab\u3093\u317f\u3158\u316f\u3103\u2f34", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3036\u301a\u30fc\u30d1\u30bd", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3023\u3017\u30f8\u30d6\u30bc\u3087\u3163\u3159\u3121\u310b", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3033\u3004\u30e0\u30d9", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3036\u301d\u30fe\u30c1\u30be\u3093\u317f", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3039\u3017\u30e5\u30c4\u30b2", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3024\u3019\u30f9\u30d0\u30ba\u3097\u3163", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3036\u3006\u30e5\u30c1\u30bf\u3097", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3025\u3017\u30e6\u30c4\u30b1\u3097\u3163\u3142\u3136", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3023\u301e\u2e24\u30da\u30f3\u309e\u2fa0\u315e\u316f\u3116\u31ec\u31c2\u31a3", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u31c2\u2e55\u3164\u3110\u3121\u3106\u2f40\u31c2", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u31c2\u2e55\u3164\u3110\u3139\u318e\u31e3\u31cb", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u30b7\u3093\u3131\u3144\u31a2\u3103", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u30b4\u309b\u31f1", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3034\u3097\u30b5\u30c7\u2e76\u3087", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3033\u31d7\u30fc\u3094\u30b7\u3093\u3131\u3148\u312e\u3100\u31e5", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3026\u3003\u2e62\u3094\u30b0\u309a\u3178\u315d", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303b\u309b\u30fb\u30dc\u30f3\u31e3\u2fb6\u3145\u316f\u311a\u31ff\u2f61\u31a8", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303b\u309b\u30fb\u30dc\u30f3\u3086\u3170\u3159\u316f\u310a\u316d\u31c5", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303b\u309b\u30fb\u30dc\u30f3\u3084\u3078\u3110\u313b\u311c\u2f68", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u301e\u2e5c\u3094\u30bf\u3006\u317f\u3157\u316f\u307f\u31e8\u31c2", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u301e\u2e5c\u3094\u30b4\u309b\u31f0\u3140\u316f\u311d\u2f22\u31d8", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u301e\u2e5c\u3094\u30bf\u3006\u317f\u3157\u316f\u307f\u2f42", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u301e\u2e5c\u3094\u30bf\u3006\u317f\u3157\u316f\u3118\u316d\u31c2\u31ac", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31fa", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31f9", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31f8", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31ff", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31fe", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31fd", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31fc", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u302f\u309c\u30fb\u3094\u30b0\u309d\u317f\u3110\u312c\u2fcb\u31fd\u318c\u31f3", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3023\u3017\u30fc\u3094\u30a7\u301f\u317c", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3036\u3014\u30fa", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u303c\u3017\u30f1\u30db", 11972), IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb\u2fdf\u3028\u3018\u3033\u3017\u30b5\u30cc\u30b2\u309c\u3179", 11972), IO_o.I111("\u2e8a\u2e8b\u31b5\u2f55\u2f60\u2f7a\u2f4f\u2fbd\u2fca\u2f3b\u2f94\u307e", 11972)};
    static final int[] I_Io = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16, 17, 18, 13, 14, 15, 31, 32, 33, 19, 20, 21, 25, 26, 27, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, -1};
    private static final int[][][] IIII = new int[][][]{new int[][]{{1, 20}, {20, 100}, {100, 500}, {500, 2000}, {2000, 5000}}, new int[][]{{1, 5}, {5, 20}, {20, 100}, {100, 500}, {500, 1000}}, new int[][]{{1000, 3000}, {3000, 20000}, {20000, 100000}, {100000, 10000000}, {10000000, 100000000}}};
    private final IO0 var_IO0_III0;
    private final IOo_ var_IOo__III0;
    private final Random var_java_util_Random_III0 = new Random();
    private static final long I10l = 72000000L;

    IO_o(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_III0 = iO0;
        this.var_IOo__III0 = iOo_;
    }

    private static int IIOl(int n) {
        return n >= 58 ? 2 : (n >= 24 ? 1 : 0);
    }

    private static boolean III(long l) {
        if (l == 0L) {
            return true;
        }
        long l2 = IO0I.IIIl();
        if (l2 - l < 72000000L) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l < calendar.getTimeInMillis();
    }

    private static String IIIo(long l) {
        return IO0O.IIIo(l);
    }

    private String II(boolean bl, int n, int n2) {
        if (n < 0) {
            return IO_o.I111("\u2e8c\u2e8a\u31c5\u2f4f\u2f60\u2f2b\u31df\u2ff4\u2f9c\u2fb0\u2f92\u30ed\u3056\u3030\u3056\u30f6\u3047\u30f3\u309c\u3179\u3159\u2f88\u3103\u31ad\u31da\u2f2e\u31ca\u3267\u32c8\u3228", 11972);
        }
        String string = Il_I[n];
        if (bl && string.startsWith(IO_o.I111("\u2e90\u2e8a\u2fe8\u2f54\u2f60\u2f3b\u2f17\u315a\u2fc8\u2ffb", 11972))) {
            string = IO_o.I111("\u2e8c\u3042\u2f22", 11972) + string.substring(10);
        }
        return string.replace(IO_o.I111("\u2ee1\u2ed2", 11972), String.valueOf(n2));
    }

    private static int IIll(int n, int n2) {
        return n >= n2 ? 100 : (int)((long)n * 100L / (long)n2);
    }

    void llIl() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        this.llI1();
        if (iOol._1_ >= 0) {
            String string = IO_o.I111("\u2e8a\u2e8b\u2f6b\u31e6\u2f2d\u2f7f\u2f08\u3178\u2f9c\u2fb3\u2f93\u2ede\u3056\u3077\u3002\u2e34\u30dd\u30e9\u30d2", 11972) + this.II(false, iOol._1_, iOol._1_l) + IO_o.I111("\u2ee4\u2ecb", 11972) + Il_[iOol._1_1] + IO_o.I111("\u2eed\u2ee9\u2f4a\u2f48\u3187\u2f31\u2f5e\u2fe9\u311d\u2fb2\u2fda\u3108\u30db\u3077\u301e\u30fa\u3054\u30bd\u30d2\u3165\u3158\u31af\u3100\u31e5\u3196\u31eb", 11972) + iOol._1_I + IO_o.I111("\u2eeb", 11972) + iOol._1_l + IO_o.I111("\u2ee4\u2ecb", 11972) + IO_o.IIll(iOol._1_I, iOol._1_l) + IO_o.I111("\u2ee1\u2eca\u2f08\u2f72\u3191\u2f7f\u2f10\u2ff5\u2fd5\u311c\u2f97\u3039\u304e\u2eb2\u3056\u30f6\u3046\u30bd\u30d2\u317d\u2f91\u3126\u314e\u31f9\u31de\u31a4\u3184\u326e\u3208\u3229\u3201\u3265\u32dd\u32f9\u32c2", 11972) + iOol._1__ + IO_o.I111("\u2eeb", 11972) + 10;
            this.var_IO0_III0.var_IO00_II.IIII(17, 8302, string, new String[]{IO_o.I111("\u2e90\u2e91\u31a1\u2f01\u2f2e\u2f37\u2f17\u315a\u2fd1\u2fd1\u2f8c\u2efc", 11972), IO_o.I111("\u2e8c\u3004\u2f7b\u2f01\u2f2e\u2f37\u2f17\u315a\u2fd1\u2fd1\u2f8c\u2efc", 11972)});
        } else {
            this.var_IO0_III0.var_IO00_II.IIII(17, 8301, IO_o.I111("\u2e90\u2e17\u2f6b\u2f01\u2f23\u2fac\u2f5e\u2feb\u2f5c\u2fb2\u2fda\u3077\u3050\u303e\u2eb1\u30f8\u3094\u30a5\u2e17\u3131\u3144\u3127\u310b\u31e2\u318c\u31a8\u2f4f\u3279\u3208\u3225\u2ccb\u32e6\u3288\u32e3\u3291\u2de8\u3343\u331f\u333d\u2dd0\u33e9\u339b\u33b9\u330a\u3438\u3443\u343e\u2ab6\u34b4\u34df\u3432\u349c\u3530\u343e\u34fe\u2b8e\u35ef\u358b\u35a9\u3508\u3661\u3607\u3628\u3685\u36eb\u369c", 11972), new String[]{IO_o.I111("\u2e80\u3026", 11972), IO_o.I111("\u2e86\u2e0f\u2f6c\u2f49\u2f60\u2f2b\u2f16\u2e2d\u3161\u2fb5\u2f9d", 11972), IO_o.I111("\u2e8f\u2e8b\u2ff1", 11972), IO_o.I111("\u2e90\u3008\u2f22\u2f42\u2f28\u318e\u2f17", 11972)});
        }
    }

    private void llI1() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (IO_o.III(iOol.IOo)) {
            iOol._1__ = 10;
            iOol.IOo = IO0I.IIIl();
        }
    }

    boolean III0(int n, int n2) {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (n == 8301) {
            if (n2 >= 0 && n2 <= 2) {
                this.Il_I(n2);
            }
            return true;
        }
        if (n == 8302) {
            if (iOol._1_ < 0) {
                return true;
            }
            if (n2 == 0) {
                this.llIO();
            } else if (n2 == 1) {
                this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e86\u3042\u2f6c\u2f01\u2f36\u31b4\u2f1f\u2fbd\u2fd4\u313c\u2f83\u3039\u305a\u2e98\u3056\u30fb\u30dc\u30ba\u2e35\u317c\u3110\u3139\u2f8b\u31ad", 11972) + this.II(false, iOol._1_, iOol._1_l));
                this.llI_();
                this.var_IO0_III0.I__O();
            }
            return true;
        }
        return false;
    }

    private void llI_() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        iOol._1_ = -1;
        iOol._1_I = 0;
        iOol._1_l = 0;
        iOol._1_1 = 0;
        iOol._1_O = 0;
    }

    private void Il_I(int n) {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        this.llI1();
        if (iOol._1__ <= 0) {
            this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e86\u3042\u2f6c\u2f01\u2e51\u2fbc\u2f5e\u2ff3\u2fd4\u3176\u2f94\u3039\u3050\u2ee8\u3002\u30b5\u30da\u30bb\u309b\u2fd6\u315d\u316f\u3118\u2f68\u318c\u31a3\u311e\u3264\u3208\u3229\u3207\u32fc\u328a\u32e3\u32aa\u33e2\u3359\u331f\u333d\u3315\u2d41\u339b\u33ae\u2d22\u3471\u3417\u3438\u3412\u3474\u34ca\u34f2\u349c\u3571\u3546\u356e\u351f\u2b5f\u35c2\u35ea\u3587\u3660\u288a\u3628\u3645\u36f0\u36ca\u287d\u3691", 11972));
            return;
        }
        this.llI_();
        iOol._1_ = this.var_java_util_Random_III0.nextInt(Il_I.length);
        int[] nArray = IIII[IO_o.IIOl(iOol._1_)][n];
        iOol._1_l = nArray[0] + this.var_java_util_Random_III0.nextInt(nArray[1] - nArray[0] + 1);
        --iOol._1__;
        iOol._1_1 = n;
        iOol.IOo = IO0I.IIIl();
        this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e86\u3042\u2f6c\u2f01\u2f2e\u2f37\u31d3\u2ff3\u2f9c\u2eca\u2e4a\u2efa\u305b\u3077\u3018\u30fd\u30dd\u2e14\u309f\u3131\u3146\u2faa\u3154\u31ad", 11972) + this.II(false, iOol._1_, iOol._1_l));
        this.var_IO0_III0.I__O();
    }

    private void llIO() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (iOol._1_I < iOol._1_l) {
            this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e86\u3042\u2f6c\u2f01\u2f23\u2f37\u2ece\u2ffc\u2f9c\u2fb3\u2f95\u30f9\u3056\u3077\u3002\u30fd\u3054\u30bd\u309a\u3131\u315e\u3127\u3107\u2f4a\u31c1\u31eb\u319c\u2cec", 11972));
            return;
        }
        if (this.var_IO0_III0.IIIl.IlII() <= 1) {
            this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e8c\u2e03\u2f6c\u2f49\u2f60\u2f2b\u2f0c\u2ffc\u2fd2\u2fbc\u2fda\u3072\u3050\u30a3\u3018\u30f2\u3094\u31c2\u2e15\u3131\u3153\u3127\u2fb9\u31ad\u31d8\u31b9\u2f3b\u3267\u324f\u3269", 11972));
            return;
        }
        int n = I_I0[iOol._1_1];
        this.var_IO0_III0.var_IO__II.IIlo(6, 3);
        iOol.Il11 += (long)n;
        this.var_IO0_III0.IIIl.l1_l();
        this.var_IO0_III0.IIIl.l1_();
        this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e86\u3042\u2f6c\u2f01\u2f2e\u2f37\u31d3\u2ff3\u2f9c\u2eca\u2e4a\u2efa\u305b\u3077", 11972) + IO_o.IIIo(n) + IO_o.I111("\u2ee4\u2e95\u2fe2\u2f4f\u2f27", 11972));
        this.llI_();
        this.var_IO0_III0.I__O();
    }

    private boolean IIIo(int n, int n2) {
        return (n & 1 << n2 / 10) != 0;
    }

    private int II(boolean bl, int n, int n2, int n3, String string) {
        int n4 = IO_o.IIll(n, n2);
        if (n4 != 100) {
            for (int i = 90; i >= 0; i -= 10) {
                if (this.IIIo(n3, i) || n4 < i) continue;
                n3 |= 1 << i / 10;
                this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e8a\u2e8b\u2f6b\u31e6\u2f2d\u2f7f\u2f08\u3178\u2f86\u2ffb", 11972) + string + IO_o.I111("\u2ee4\u2ff2\u2fe1\u2f01\u2f28\u2f30\u2f9e\u2ff3\u2f9c\u2faf\u2f92\u30f9\u3056\u303f\u304c\u30b5", 11972) + n + IO_o.I111("\u2eeb", 11972) + n2 + IO_o.I111("\u2ee4\u2ecb", 11972) + n4 + IO_o.I111("\u2ee1\u2eca", 11972));
                break;
            }
        } else {
            this.var_IO0_III0.IIIl.IIol(bl ? IO_o.I111("\u2e90\u2e8a\u31bd\u2f51\u2f60\u2f2b\u2f16\u2ff8\u2fd3\u2ffb\u2f92\u30fa\u3041\u3077\u3000\u2e54\u3094\u3091\u3093\u317f\u3157\u316f\u3106\u2f54\u31c5\u31eb\u3188\u32e8\u3247\u3267\u3205\u3264\u32cb\u32ed", 11972) : IO_o.I111("\u2e87\u2e8b\u2ff8\u2f42\u2f60\u2f32\u3195\u2ff3\u2fdb\u2ffb\u2f98\u2eb8\u3056\u3077\u3167\u3076\u3094\u30bb\u309d\u31f1\u315e\u316f\u311a\u31e5\u314c\u31a5\u3182\u3229\u3246\u322f\u320f\u2c42\u32c9\u32e3\u3294\u2de4\u330c\u331f\u333c\u339f\u33e5\u339b\u33bd\u3390\u2ac5\u3417\u343e\u3496\u34ed\u3493\u34a3\u3484\u3571\u3556\u356e\u351b\u2b4d\u358b\u3588\u351b\u3628\u366a\u289f\u360b\u36e3\u3683\u36b6\u3693\u29a3\u373f\u3750\u3735\u3715\u295c\u37d7\u37f9\u378e\u26f2\u3818", 11972));
        }
        return n3;
    }

    void Il_l(int n) {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (iOol._1_ >= 0 && I_Io[iOol._1_] == n) {
            ++iOol._1_I;
            iOol._1_O = this.II(false, iOol._1_I, iOol._1_l, iOol._1_O, this.II(false, iOol._1_, iOol._1_l));
        }
        if (iOol._1_0 >= 0 && I_Io[iOol._1_0] == n) {
            ++iOol._1_o;
            iOol._1O1 = this.II(true, iOol._1_o, iOol._1O, iOol._1O1, this.II(true, iOol._1_0, iOol._1O));
        }
    }

    void Il_1(int n) {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (iOol._1_ == 58) {
            iOol._1_I += n;
            iOol._1_O = this.II(false, iOol._1_I, iOol._1_l, iOol._1_O, this.II(false, iOol._1_, iOol._1_l));
        }
        if (iOol._1_0 == 58) {
            iOol._1_o += n;
            iOol._1O1 = this.II(true, iOol._1_o, iOol._1O, iOol._1O1, this.II(true, iOol._1_0, iOol._1O));
        }
    }

    void llI0() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (iOol._lOO != 0) {
            this.llIo();
            this.var_IO0_III0.var_IO00_II.IIII(10, 8310, IO_o.I111("\u2e90\u2e17\u2f6b\u2f01\u2f23\u2fac\u2f5e\u2fe9\u2fd4\u3118\u2fda\u307e\u3051\u30ad\u3006\u30b5\u30d3\u303f\u30d2\u3172\u3158\u3120\u314e\u31ef\u31cd\u31a5\u318d\u3229\u3240\u2c9e\u320f\u32a5\u32c7\u2c24\u3283\u3321\u3342\u2d9e\u3330\u335d\u33a3", 11972), new String[]{IO_o.I111("\u2e87\u2e8b\u31eb\u2f42\u2f60\u2f31\u2e7d\u2ff3\u2fdb\u2fd1\u2f98\u3078\u3056\u3030\u3056\u30fd\u2e6d\u30ba", 11972), IO_o.I111("\u2e8a\u2e8b\u2f6b\u31e6\u2f2d\u2f7f\u2f08\u3178\u2f9c\u2f99\u2f9b\u3077\u305f\u305d\u302d", 11972) + iOol._1Ol + IO_o.I111("\u2eeb", 11972) + 5 + IO_o.I111("\u2e99", 11972), IO_o.I111("\u2fd4\u3040\u2f6d\u2f01\u2f0b\u2f3e\u2f13\u2ff8", 11972), IO_o.I111("\u2e90\u3008\u2f22\u2f42\u2f28\u318e\u2f17", 11972)});
        } else {
            this.var_IO0_III0.var_IO00_II.IIII(10, 8310, IO_o.I111("\u2e90\u2e17\u2f6b\u2f01\u2f23\u2fac\u2f5e\u2fe9\u2fd4\u3118\u2fda\u307e\u3051\u30ad\u3006\u30b5\u30d3\u303f\u30d2\u3172\u3158\u3120\u314e\u31ef\u31cd\u31a5\u318d\u3229\u3240\u2c9e\u320f\u32a5\u32c7\u2c24\u3283\u3321\u3342\u2d9e\u3330\u335d\u33a3", 11972), new String[]{IO_o.I111("\u2fd4\u3040\u2f6d\u2f01\u2f0b\u2f3e\u2f13\u2ff8", 11972), IO_o.I111("\u2e90\u3008\u2f22\u2f42\u2f28\u318e\u2f17", 11972)});
        }
    }

    private void llIo() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (IO_o.III(iOol.IOoI)) {
            iOol._1Ol = 5;
            iOol.IOoI = IO0I.IIIl();
        }
    }

    private void lll() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        this.llIo();
        if (iOol._1_0 >= 0) {
            if (iOol._1_o >= iOol._1O) {
                this.var_IO0_III0.var_IO00_II.IIII(10, 8312, IO_o.I111("\u2e8a\u2e8b\u2f6b\u31e6\u2f2d\u2f7f\u2f08\u3178\u2f9c\u2eca\u2f19\u3039\u3050\u3038\u3096\u30fb\u3094\u30a7\u309a\u31f1\u315e\u3127\u3142\u31ad\u31c4\u3128\u3193\u3229\u3246\u322f\u2ccb\u32eb\u3284", 11972) + (iOol._1OI + 1) * 10 + IO_o.I111("\u2ee4\u2e80\u2f63\u2f51\u2f33\u2f2a\u2f12\u2ff8\u2f9c\u2fb9\u2f9b\u3077\u305f", 11972), new String[]{IO_o.I111("\u2e8a\u2e8b\u31af\u2f4f\u2f4a\u2f2b\u2f16\u2e2d\u3163\u2fb5\u2f9d", 11972), IO_o.I111("\u2fd4\u2e10\u2f6c\u2f46", 11972)});
                return;
            }
            this.var_IO0_III0.var_IO00_II.IIII(10, 8312, IO_o.I111("\u2e8a\u2e8b\u2f6b\u31e6\u2f2d\u2f7f\u2f08\u3178\u2f9c\u2fb3\u2f93\u2ede\u3056\u3077\u3002\u2e34\u30dd\u30e9\u30d2", 11972) + this.II(true, iOol._1_0, iOol._1O) + IO_o.I111("\u2eea\u2ec3\u2e12\u2fc2\u2f60\u2f37\u31df\u2fbd\u2ead\u2e6b\u3119\u307a\u3018", 11972) + iOol._1_o, new String[]{IO_o.I111("\u2e8b\u2ea8", 11972), IO_o.I111("\u2e8c\u3004\u2f7b\u2f01\u2f22\u3190\u2f74\u2fd3\u2fd4\u2fb2\u313d\u3074\u3018\u3021\u2e93\u309f\u30da\u3033\u308b", 11972)});
            return;
        }
        if (iOol._1Ol <= 0) {
            this.var_IO0_III0.var_IO00_II.IIII(10, 8312, IO_o.I111("\u2fd4\u2e00\u2f22\u2f49\u31ff\u2f2b\u2f5e\u2ff3\u2fd4\u2fb2\u313d\u3074\u3018\u3021\u2e93\u30b5\u30d7\u30bb\u309d\u3131\u3158\u31bb\u3103\u31ad\u31c2\u31aa\u3193\u3225\u3208\u322f\u3285\u32fc\u3284\u32a0\u328a\u2ddc\u3300\u322e\u2de1\u3313\u33bc\u33d5\u33bd\u3319\u3461\u3417\u343b\u3414\u34fd", 11972), new String[]{IO_o.I111("\u2e8b\u2ea8", 11972), IO_o.I111("\u2e90\u3008\u2f22\u2f42\u2f28\u318e\u2f17", 11972)});
            return;
        }
        int n = this.var_java_util_Random_III0.nextInt(5);
        iOol._1_0 = this.var_java_util_Random_III0.nextInt(Il_I.length);
        int[] nArray = IIII[IO_o.IIOl(iOol._1_0)][n];
        iOol._1O = nArray[0] + this.var_java_util_Random_III0.nextInt(nArray[1] - nArray[0] + 1);
        iOol._1OI = n;
        iOol._1_o = 0;
        iOol._1O1 = 0;
        iOol.IOoI = IO0I.IIIl();
        this.var_IO0_III0.I__O();
        this.var_IO0_III0.var_IO00_II.IIII(10, 8312, IO_o.I111("\u2e8a\u2e8b\u2f6b\u31e6\u2f2d\u2f7f\u2f08\u3178\u2f9c\u2fb3\u2f93\u2ede\u3056\u3077\u3002\u2e34\u30dd\u30e9\u30d2", 11972) + this.II(true, iOol._1_0, iOol._1O) + IO_o.I111("\u2eea\u2ec3\u2e12\u2fc2\u2f60\u2f37\u31df\u2fbd\u2ead\u2e6b\u3119\u307a\u3018", 11972) + iOol._1_o, new String[]{IO_o.I111("\u2e8b\u2ea8", 11972), IO_o.I111("\u2e8c\u3004\u2f7b\u2f01\u2f22\u3190\u2f74\u2fd3\u2fd4\u2fb2\u313d\u3074\u3018\u3021\u2e93\u309f\u30da\u3033\u308b", 11972)});
    }

    private void lllI() {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        iOol._1_0 = -1;
        iOol._1_o = 0;
        iOol._1O = 0;
        iOol._1OI = 0;
        iOol._1O1 = 0;
    }

    boolean IIl(int n, int n2) {
        IOol iOol = this.var_IO0_III0.var_IOol_II;
        if (n == 8310) {
            if (iOol._lOO == 0) {
                if (n2 == 0) {
                    this.var_IO0_III0.var_IO00_II.Ilo(5);
                }
                return true;
            }
            if (n2 == 0) {
                this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e87\u2e8b\u31eb\u2f42\u2f60\u2f31\u2e7d\u2ff3\u2fdb\u2ffb\u2f98\u3078\u3056\u3030\u3056\u30fd\u2e6d\u30ba\u30d2\u3139\u3021\u2f9a\u3107\u31ad\u31d8\u3121\u3184\u3229\u325e\u322e\u2cd9\u32f1\u3284\u32b7\u2c4d\u3375\u330c\u331f\u3330\u339f\u33f2\u33dc\u33fa\u339a\u2abd\u3447\u3476\u3417\u34f5\u34dd\u34b5\u34d8\u3530\u354c\u3526\u34dd\u35ed\u358b\u34db\u3459\u28eb\u3644\u3666\u360d\u2853\u3683\u36b6\u3693\u29e3\u373f\u29e1\u377d\u371e\u2938\u37d4\u37f9\u3797\u3871\u3850\u3839\u381d\u38fd\u38d7", 11972));
            } else if (n2 == 1) {
                this.lll();
            } else if (n2 == 2) {
                this.var_IO0_III0.var_IO00_II.Ilo(5);
            }
            return true;
        }
        if (n == 8312) {
            if (iOol._1_0 < 0) {
                return true;
            }
            if (n2 == 0) {
                if (iOol._1_o >= iOol._1O) {
                    int n3 = (iOol._1OI + 1) * 10;
                    --iOol._1Ol;
                    this.lllI();
                    iOol._l0I += n3;
                    iOol._l0 += n3;
                    this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2e86\u3042\u2f6c\u2f01\u2f36\u31b4\u2f1f\u2fbd\u2fd2\u2fb3\u3157\u3077\u3018\u3146\u31c6\u2e76\u30d7\u30f3", 11972) + IO_o.IIIo(n3) + IO_o.I111("\u2ee4\u2e80\u2f63\u2f51\u2f33\u2f2a\u2f12\u2ff8\u2f9c\u2fb9\u2f9b\u3077\u305f\u3079", 11972));
                    this.var_IO0_III0.I__O();
                }
            } else if (n2 == 1 && iOol._1_o < iOol._1O) {
                this.var_IO0_III0.var_IO00_II.IIII(10, 8313, IO_o.I111("\u2e86\u3042\u2f6c\u2f01\u2f23\u2fac\u2f5e\u2ffe\u2fd4\u3174\u2f99\u3039\u3055\u3022\u2ea7\u30fb\u3094\u30bb\u2e15\u3168\u3110\u3121\u3106\u31e4\u2f6b\u31a6\u31ca\u327f\u2ccd\u3267\u3208\u3265\u32dd\u32fc\u32e8\u334f\u2d9f\u334a\u337e\u3315\u2d7b\u33c2\u33fa\u3397\u3470\u345e\u2a91\u3418\u34b4\u34c5\u2a37\u34d1\u3572\u2b8e\u3520\u354d\u35ff\u2b16\u35ea\u3584\u28ad\u3653\u3666\u3654\u36a4\u36cf\u3772\u2802\u3774\u373f\u3750\u3735\u3715\u295c\u37d7\u37f9\u378e\u26f2\u3816\u3821\u3806\u38fc\u38dc\u38b6\u38d0\u3961\u3949\u39ad\u3915\u39a5", 11972), new String[]{IO_o.I111("\u2fd4\u3030\u2f6c\u2f46\u2f60\u2fa2", 11972), IO_o.I111("\u2e90\u3008\u2f22\u2f42\u2f28\u318e\u2f17", 11972)});
            }
            return true;
        }
        if (n == 8313) {
            if (iOol._1_0 >= 0 && n2 == 0 && iOol._1_o < iOol._1O) {
                this.var_IO0_III0.IIIl.IIol(IO_o.I111("\u2fd4\u2e00\u2f22\u2f49\u31a7\u2f26\u2f5e\u2ff3\u2fd4\u2fb2\u313d\u3074\u3018\u3021\u2e93\u30b5\u30d6\u30b2\u309c\u3176\u311e", 11972));
                --iOol._1Ol;
                this.lllI();
                this.var_IO0_III0.I__O();
            }
            return true;
        }
        return false;
    }

    private static /* synthetic */ String I111(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

