package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class I_Ol {
    private static short[] IIIO = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
    private static short[] III0;
    private static int[] Illo;
    public static Random var_java_util_Random_III;
    public static boolean I1l1;
    public static boolean var_boolean_III;

    public static void IIl1() {
        III0 = new short[91];
        Illo = new int[91];
        for (int i = 0; i <= 90; ++i) {
            I_Ol.III0[i] = IIIO[90 - i];
            I_Ol.Illo[i] = III0[i] == 0 ? Integer.MAX_VALUE : (IIIO[i] << 10) / III0[i];
        }
    }

    public static final int IIll(int n) {
        if ((n = I_Ol.IIl_(n)) >= 0 && n < 90) {
            return IIIO[n];
        }
        if (n >= 90 && n < 180) {
            return IIIO[180 - n];
        }
        return n >= 180 && n < 270 ? -IIIO[n - 180] : -IIIO[360 - n];
    }

    public static final int IIl1(int n) {
        if ((n = I_Ol.IIl_(n)) >= 0 && n < 90) {
            return III0[n];
        }
        if (n >= 90 && n < 180) {
            return -III0[180 - n];
        }
        return n >= 180 && n < 270 ? -III0[n - 180] : III0[360 - n];
    }

    public static final int III1(int n, int n2) {
        int n3;
        if (n == 0) {
            n3 = n2 > 0 ? 90 : 270;
        } else {
            int n4;
            block7: {
                n4 = Math.abs((n2 << 10) / n);
                for (int i = 0; i <= 90; ++i) {
                    if (Illo[i] < n4) {
                        continue;
                    }
                    n3 = i;
                    break block7;
                }
                n3 = 0;
            }
            n4 = n3;
            if (n2 >= 0 && n < 0) {
                n4 = 180 - n3;
            }
            if (n2 < 0 && n < 0) {
                n4 += 180;
            }
            if (n2 >= 0 || n < 0) {
                return n4;
            }
            n3 = 360 - n4;
        }
        return n3;
    }

    public static final int IIl_(int n) {
        if (n >= 360) {
            n -= 360;
        }
        if (n < 0) {
            n += 360;
        }
        return n;
    }

    public static void II(IO1l iO1l) {
        IO1I.III_.II(iO1l, I_Ol.Il0l("\u35d0\u35ba\u3594\u3673\u3644\u366e\u362e\u36e3\u36c5\u36be\u369b\u3767\u374b\u372a\u3700\u37f6\u379e\u37e2", 13747) + I_0_.I1, 3, 55, 0);
        IO1I.III_.II(iO1l, I_Ol.Il0l("\u35d0\u35ba\u3594\u3673\u3644\u366e\u3620\u36ed\u36db\u36f7\u36c9", 13747) + I_0_.IlO, 3, 75, 0);
    }

    public static void IOlI() {
        long l = IO10.IIII();
        if (I_0_.I1I - l > 5000L) {
            I_0_.II().Io_O();
        }
        if (I_0_.I1I1 - l > 5000L) {
            I_0_.II().Io_0();
        }
    }

    public static String IIIo(String string) {
        if (IO10.l_lI != 7) {
            return string;
        }
        if (Ilol.Ilol_II() != null && Ilol.Ilol_II().var_IOlI_II != null && Ilol.Ilol_II().var_IOlI_II.II01 >= 10) {
            return string;
        }
        if (string.indexOf(I_Ol.Il0l("\u35f4\u35bd\u3599\u3671\u3641", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f4\u35bd\u3599\u3671\u3641", 13747), I_Ol.Il0l("\u35fb\u35b3\u359f\u3677\u3640", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f4\u3526\u3599\u3671\u3641", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f4\u3526\u3599\u3671\u3641", 13747), I_Ol.Il0l("\u35fb\u35b3\u359f\u3677\u3640", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f1\u35a7\u359f\u367d\u364e", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f1\u35a7\u359f\u367d\u364e", 13747), I_Ol.Il0l("\u35fe\u35b3\u3593\u3665\u3641", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f1\u35a7\u359f\u367d\u364e\u3620", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f1\u35a7\u359f\u367d\u364e\u3620", 13747), I_Ol.Il0l("\u35fe\u35b3\u3593\u3665\u3641", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f1\u35a7\u359f\u3630\u3642\u362f", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f1\u35a7\u359f\u3630\u3642\u362f", 13747), I_Ol.Il0l("\u35fe\u35b3\u3593\u3665\u3641", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u34a3\u2b7f\u3584\u3630\u365b\u3626\u28ca\u36e2", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u34a3\u2b7f\u3584\u3630\u365b\u3626\u28ca\u36e2", 13747), I_Ol.Il0l("\u35f0\u3530\u3588\u3630\u365b\u3626\u28ca\u36e2", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fe\u35b3\u3593\u3665", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fe\u35b3\u3593\u3665", 13747), I_Ol.Il0l("\u35f1\u35a7\u359c\u3671", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fe\u35b3\u35d1\u3672\u379f", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fe\u35b3\u35d1\u3672\u379f", 13747), I_Ol.Il0l("\u35f1\u35a7\u359c\u3671", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35eb\u35b3\u3588\u3674\u364e", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35eb\u35b3\u3588\u3674\u364e", 13747), I_Ol.Il0l("\u35f7\u35b3\u3582\u3671\u3656", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35eb\u35b3\u3588\u3630\u364b\u362f", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35eb\u35b3\u3588\u3630\u364b\u362f", 13747), I_Ol.Il0l("\u35f7\u35b3\u3582\u3671\u3656", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fd\u35b3\u359c\u28af\u364c", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fd\u35b3\u359c\u28af\u364c", 13747), I_Ol.Il0l("\u35fe\u35b7\u3592\u3674\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fd\u35b3\u35d1\u367d\u2890\u362d", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fd\u35b3\u35d1\u367d\u2890\u362d", 13747), I_Ol.Il0l("\u35fe\u35b7\u3592\u3674\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fd\u35b3\u359c\u3675\u3644", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fd\u35b3\u359c\u3675\u3644", 13747), I_Ol.Il0l("\u35fe\u35b7\u3592\u3674\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e1\u2b01\u359f\u3677\u360f\u363a\u3605\u282b\u36c5", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e1\u2b01\u359f\u3677\u360f\u363a\u3605\u282b\u36c5", 13747), I_Ol.Il0l("\u35e1\u2b01\u359f\u3677\u360f\u375f\u28c8\u36f8", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f8\u35b3\u359c\u3675", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f8\u35b3\u359c\u3675", 13747), I_Ol.Il0l("\u35fe\u35b7\u359a\u3671", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e5\u35b7\u3596\u3675\u365b\u362f", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e5\u35b7\u3596\u3675\u365b\u362f", 13747), I_Ol.Il0l("\u35e7\u35b3\u3596\u3675\u3659\u362b", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f8\u35b3\u359a\u3671\u3643\u3621\u3619", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f8\u35b3\u359a\u3671\u3643\u3621\u3619", 13747), I_Ol.Il0l("\u35ff\u35bd\u3585\u367b\u364e\u3625\u360c", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f1\u35a0\u359e\u367c\u3656", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f1\u35a0\u359e\u367c\u3656", 13747), I_Ol.Il0l("\u35ff\u35ab\u3593\u3662\u3640", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363c\u28be\u36e2\u36cc", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363c\u28be\u36e2\u36cc", 13747), I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363a\u3605\u282b\u36c5", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35dd\u35b5\u2b3c\u3673\u360f\u363c\u28be\u36e2\u36cc", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35dd\u35b5\u2b3c\u3673\u360f\u363c\u28be\u36e2\u36cc", 13747), I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363a\u3605\u282b\u36c5", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e1\u35b3\u3595\u3679\u364c", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e1\u35b3\u3595\u3679\u364c", 13747), I_Ol.Il0l("\u35f7\u35bb\u3592\u3662\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e1\u35b3\u35d1\u3674\u3646\u362d", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e1\u35b3\u35d1\u3674\u3646\u362d", 13747), I_Ol.Il0l("\u35f7\u35bb\u3592\u3662\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e1\u35b3\u35d1\u3701\u36c2\u362d", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e1\u35b3\u35d1\u3701\u36c2\u362d", 13747), I_Ol.Il0l("\u35f7\u35bb\u3592\u3662\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f0\u35b3\u3595\u3679\u364c", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f0\u35b3\u3595\u3679\u364c", 13747), I_Ol.Il0l("\u35f7\u35bb\u3592\u3673\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f0\u35b3\u35d1\u3674\u3646\u362d", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f0\u35b3\u35d1\u3674\u3646\u362d", 13747), I_Ol.Il0l("\u35f7\u35bb\u3592\u3673\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f0\u35b3\u35d1\u3701\u36c2\u362d", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f0\u35b3\u35d1\u3701\u36c2\u362d", 13747), I_Ol.Il0l("\u35f7\u35bb\u3592\u3673\u364e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e2\u35a7\u3588\u3630\u3643\u36ad\u3602", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e2\u35a7\u3588\u3630\u3643\u36ad\u3602", 13747), I_Ol.Il0l("\u35ff\u3531\u359e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35c2\u35a7\u3588\u3630\u3643\u36ad\u3602", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35c2\u35a7\u3588\u3630\u3643\u36ad\u3602", 13747), I_Ol.Il0l("\u35df\u3531\u359e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e2\u35a7\u3588\u365c\u36cc\u3621", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e2\u35a7\u3588\u3630\u3663\u36ad\u3602", 13747), I_Ol.Il0l("\u35ff\u3531\u359e", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e0\u35b3\u359f\u3664\u364e", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e0\u35b3\u359f\u3664\u364e", 13747), I_Ol.Il0l("\u35e7\u35b3\u3582\u3671\u3641", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fb\u2b73\u3585\u3630\u3662\u36a3\u3619", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fb\u2b73\u3585\u3630\u3662\u36a3\u3619", 13747), I_Ol.Il0l("\u35fb\u2b73\u3585\u3630\u366b\u28f5", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fb\u2b73\u3585\u3630\u3642\u36a3\u3619", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fb\u2b73\u3585\u3630\u3642\u36a3\u3619", 13747), I_Ol.Il0l("\u35fb\u2b73\u3585\u3630\u364b\u28f5", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e7\u3532\u3584\u3630\u364d\u28ed\u3614\u36ac\u36c9\u2869\u3690", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e7\u3532\u3584\u3630\u364d\u28ed\u3614\u36ac\u36c9\u2869\u3690", 13747), I_Ol.Il0l("\u35e7\u3532\u3584\u3630\u365b\u36ae\u3618", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e6\u35a0\u359e\u367e", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e6\u35a0\u359e\u367e", 13747), I_Ol.Il0l("\u35fc\u35bc\u3583\u3665", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e6\u35f2\u3583\u367f\u3641", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e6\u35f2\u3583\u367f\u3641", 13747), I_Ol.Il0l("\u35fc\u35bc\u3583\u3665", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e6\u35a0\u3505\u367e", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e6\u35a0\u3505\u367e", 13747), I_Ol.Il0l("\u35fc\u35bc\u3583\u3665", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u361c\u28be\u36e2\u36cc", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u361c\u28be\u36e2\u36cc", 13747), I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363a\u3605\u282b\u36c5", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363c\u28be\u36e2\u36cc", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363c\u28be\u36e2\u36cc", 13747), I_Ol.Il0l("\u35fd\u35b5\u2b3c\u3673\u360f\u363a\u3605\u282b\u36c5", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f5\u35bb\u3595\u3675", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f5\u35bb\u3595\u3675", 13747), I_Ol.Il0l("\u35f7\u35b7\u3597\u3679", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e5\u35b7\u3596\u3675\u365b\u362f", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e5\u35b7\u3596\u3675\u365b\u362f", 13747), I_Ol.Il0l("\u35e7\u35b3\u3596\u3675\u3659\u362b", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fe\u35bd\u359e\u3662\u3646", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fe\u35bd\u359e\u3662\u3646", 13747), I_Ol.Il0l("\u35e1\u35bb\u359c\u367f\u3640", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f2\u35a0\u3584", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f2\u35a0\u3584", 13747), I_Ol.Il0l("\u35e6\u35a0\u3590", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f8\u35b3\u359c\u3675\u3645\u3621\u3606\u36e3", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f8\u35b3\u359c\u3675\u3645\u3621\u3606\u36e3", 13747), I_Ol.Il0l("\u35f8\u35bd\u359b\u367f\u3642\u362b\u3606\u36ed", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35d8\u35b3\u359c\u3675\u3645\u3621\u3606\u36e3", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35d8\u35b3\u359c\u3675\u3645\u3621\u3606\u36e3", 13747), I_Ol.Il0l("\u35d8\u35bd\u359b\u367f\u3642\u362b\u3606\u36ed", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f8\u35b3\u359c\u3675", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f8\u35b3\u359c\u3675", 13747), I_Ol.Il0l("\u35fe\u35b7\u359a\u3671", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35d8\u35b3\u359c\u3675", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35d8\u35b3\u359c\u3675", 13747), I_Ol.Il0l("\u35de\u35b7\u359a\u3671", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fe\u35b3\u3582\u3675\u3641\u3625\u3602", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fe\u35b3\u3582\u3675\u3641\u3625\u3602", 13747), I_Ol.Il0l("\u35f8\u35bd\u3582\u3675\u3641\u3623\u360c", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e7\u35ba\u3510\u3679\u360f\u360a\u37dd\u372d\u36c5\u36ad\u36c9\u3740\u2986\u3766\u3736\u37e5\u37cd", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e7\u35ba\u3510\u3679\u360f\u360a\u37dd\u372d\u36c5\u36ad\u36c9\u3740\u2986\u3766\u3736\u37e5\u37cd", 13747), I_Ol.Il0l("\u35fb\u2b73\u35d1\u3654\u379f\u37ef\u3603\u36eb", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e0\u35bd\u359d\u3671\u365d\u366e\u360b\u36e0\u36ca\u36b8\u368c", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e0\u35bd\u359d\u3671\u365d\u366e\u360b\u36e0\u36ca\u36b8\u368c", 13747), I_Ol.Il0l("\u35e0\u35bd\u359d\u3671\u365d", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35e2\u35a7\u2b52\u3630\u364c\u28e9\u3618\u36ac\u36c0\u3620\u3687\u3760\u3707\u372d\u370d\u37ed", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35e2\u35a7\u2b52\u3630\u364c\u28e9\u3618\u36ac\u36c0\u3620\u3687\u3760\u3707\u372d\u370d\u37ed", 13747), I_Ol.Il0l("\u35e2\u35a7\u2b52\u3630\u364c\u28e9\u3618", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f4\u35b7\u359f\u367b\u3646\u3663\u3629\u36ed\u36c6\u36ab", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f4\u35b7\u359f\u367b\u3646\u3663\u3629\u36ed\u36c6\u36ab", 13747), I_Ol.Il0l("\u35f7\u35b3\u359c\u3671", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35f4\u35b7\u359f\u367b\u3646\u3663\u3629\u36ed\u36c6\u36ab", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35f4\u35b7\u359f\u367b\u3646\u3663\u3629\u36ed\u36c6\u36ab", 13747), I_Ol.Il0l("\u35f7\u35b3\u359c\u3671", 13747));
        }
        if (string.indexOf(I_Ol.Il0l("\u35fe\u35b3\u359a\u3671\u3641\u3625\u3602\u36ff\u36ca\u36ba\u3699\u3767", 13747)) != -1) {
            string = I_Ol.IIII(string, I_Ol.Il0l("\u35fe\u35b3\u359a\u3671\u3641\u3625\u3602\u36ff\u36ca\u36ba\u3699\u3767", 13747), I_Ol.Il0l("\u35fc\u35a2\u3581\u3671\u365c\u3621\u3606\u36e2\u36ca\u36a1\u3688\u3765", 13747));
        }
        return string;
    }

    public static String IIII(String string, String string2, String string3) {
        StringBuffer stringBuffer = new StringBuffer();
        int n = string.indexOf(string2);
        int n2 = 0;
        int n3 = string2.length();
        while (n != -1) {
            stringBuffer.append(string.substring(n2, n)).append(string3);
            n2 = n + n3;
            n = string.indexOf(string2, n2);
        }
        stringBuffer.append(string.substring(n2, string.length()));
        return stringBuffer.toString();
    }

    public static int IIlO(int n) {
        return var_java_util_Random_III.nextInt(n);
    }

    public static int III_(int n, int n2) {
        return n == n2 ? n : n + var_java_util_Random_III.nextInt(n2 - n);
    }

    public static int IIl0(int n) {
        int n2 = 0;
        while (n2 == 0) {
            n2 = var_java_util_Random_III.nextInt() % n;
        }
        return n2;
    }

    public static int IIIl(int n, int n2) {
        n += var_java_util_Random_III.nextInt(n2 - n);
        int n3 = 2;
        if (var_java_util_Random_III.nextInt(n3) == 0) {
            n = -n;
        }
        return n;
    }

    public static int II(int n, int n2, int n3, int n4) {
        return I_Ol.IIlo((n - n3) * (n - n3) + (n2 - n4) * (n2 - n4));
    }

    public static int IIIO(int n, int n2) {
        return I_Ol.IIlo(n * n + n2 * n2);
    }

    public static int IIlo(int n) {
        int n2;
        if (n <= 0) {
            return 0;
        }
        int n3 = (n + 1) / 2;
        while (Math.abs((n2 = n3) - (n3 = n3 / 2 + n / (n3 * 2))) > 1) {
        }
        return n3;
    }

    public static int III0(int n, int n2) {
        n2 = 1;
        for (int i = 0; i < 2; ++i) {
            n2 *= n;
        }
        return n2;
    }

    public static int II1(int n) {
        return n > 0 ? n : -n;
    }

    public static boolean II(int n, int n2, int n3, int n4, int n5, int n6) {
        return n5 >= n && n5 <= n + n3 && n6 >= n2 && n6 <= n2 + n4;
    }

    public static void II_l(String string) {
    }

    public static void II__(String string) {
    }

    public static String[] II(String string, String string2, int n) {
        String[] stringArray;
        int n2 = string.indexOf(string2);
        if (n2 >= 0) {
            stringArray = I_Ol.II(string.substring(n2 + string2.length()), string2, n + 1);
        } else {
            stringArray = new String[n + 1];
            n2 = string.length();
        }
        stringArray[n] = string.substring(0, n2);
        return stringArray;
    }

    public static String III1(long l) {
        String string;
        if (l >= 1000000000L) {
            String string2 = IO11.I1o0;
            long l2 = l % 1000000000L / 100000000L;
            string = String.valueOf(l /= 1000000000L);
            string = l2 > 0L ? string + I_Ol.Il0l("\u359f", 13747) + l2 + string2 : string + string2;
        } else if (l >= 1000000L) {
            String string3 = IO11.I1oo;
            long l3 = l % 1000000L / 100000L;
            string = String.valueOf(l /= 1000000L);
            string = l3 > 0L ? string + I_Ol.Il0l("\u359f", 13747) + l3 + string3 : string + string3;
        } else {
            string = String.valueOf(l);
        }
        return string;
    }

    public static String III_(long l) {
        String string;
        if (l >= 1000000000L) {
            String string2 = IO11.I1o0;
            long l2 = l % 1000000000L / 10000000L;
            string = String.valueOf(l /= 1000000000L);
            if (l2 >= 10L) {
                if (l2 % 10L == 0L) {
                    l2 /= 10L;
                }
                string = string + I_Ol.Il0l("\u359f", 13747) + l2 + string2;
            } else {
                string = l2 > 0L ? string + I_Ol.Il0l("\u359f\u35e2", 13747) + l2 + string2 : string + string2;
            }
        } else if (l >= 1000000L) {
            String string3 = IO11.I1oo;
            long l3 = l % 1000000L / 10000L;
            string = String.valueOf(l /= 1000000L);
            if (l3 >= 10L) {
                if (l3 % 10L == 0L) {
                    l3 /= 10L;
                }
                string = string + I_Ol.Il0l("\u359f", 13747) + l3 + string3;
            } else {
                string = l3 > 0L ? string + I_Ol.Il0l("\u359f\u35e2", 13747) + l3 + string3 : string + string3;
            }
        } else if (l >= 10000L) {
            String string4 = I_Ol.Il0l("\u35d8", 13747);
            long l4 = l % 1000L / 10L;
            string = String.valueOf(l /= 1000L);
            if (l4 >= 10L) {
                if (l4 % 10L == 0L) {
                    l4 /= 10L;
                }
                string = string + I_Ol.Il0l("\u359f", 13747) + l4 + string4;
            } else {
                string = l4 > 0L ? string + I_Ol.Il0l("\u359f\u35e2", 13747) + l4 + string4 : string + string4;
            }
        } else {
            string = String.valueOf(l);
        }
        return string;
    }

    static {
        String[] stringArray = new String[]{I_Ol.Il0l("\u358f\u35b1\u359e\u367c\u3640\u363c\u3650\u36af\u36cd\u36ac\u36d9\u3738\u3717\u3776\u3703\u37e2\u379d\u3799\u37c1\u3820\u3853\u3871\u381a\u3823\u38d8\u38fb\u388d\u38d8\u3937\u396b\u3969\u395b\u39f0\u39dd\u39bd\u399f\u3a7d\u3a10", 13747), I_Ol.Il0l("\u358f\u35b1\u359e\u367c\u3640\u363c\u3650\u36af\u36cd\u36ac\u36d9\u3738\u3717\u3776\u3703\u37e2\u379d\u3799\u37ad\u384f\u3858\u3861\u380e\u3839\u38c8\u38e9\u3890\u38b7\u3959\u396b\u3969\u395b\u39f0\u39dd\u39bd\u399f\u3a7d\u3a10", 13747), I_Ol.Il0l("\u358f\u35b1\u359e\u367c\u3640\u363c\u3650\u36af\u36cd\u36ac\u368f\u376e\u3717\u3776\u3703\u37e2\u379d\u3799\u37ad\u384f\u3858\u3861\u380e\u3839\u38c8\u38e9\u3890\u38b7\u3959\u396b\u3969\u395b\u39f0\u39dd\u39bd\u399f\u3a7d\u3a10", 13747), I_Ol.Il0l("\u358f\u35b1\u359e\u367c\u3640\u363c\u3650\u36af\u36cd\u36ac\u36d9\u3738\u3717\u3776\u3703\u37e2\u379d\u3799\u37ad\u384f\u3858\u3861\u3810\u3833\u38d9\u38f3\u3895\u38bd\u3937\u396b\u3969\u395b\u39f0\u39dd\u39bd\u399f\u3a7d\u3a10", 13747), ""};
        var_java_util_Random_III = new Random();
        new I_lO("");
    }

    private static /* synthetic */ String Il0l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

