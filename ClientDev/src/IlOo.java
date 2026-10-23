package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IlOo {
    public static int[] II(int n) {
        Object object;
        int n2;
        int[] nArray;
        boolean bl;
        Il_l.II iI = new Il_l.II();
        Il_l.III_ iII_ = new Il_l.III_();
        Il_l.III1 iII1 = new Il_l.III1();
        int[] nArray2 = new int[]{IOlO.l1oI};
        iII_.void_III(new II(nArray2));
        iII1.II(new Integer(IOlO.l1oI), Boolean.TRUE);
        long l = Ilol.Ilol_II().Illo;
        boolean bl2 = bl = Ilol.Ilol_II().var_IOlI_II.II01 > 30;
        while (!iII_.II1_()) {
            II iI2 = (II)iII_.IIIl();
            nArray = iI2.IIO_;
            n2 = nArray[nArray.length - 1];
            if (n2 == n) {
                if (!IlOo.II(nArray, l, bl)) continue;
                iI.void_III(nArray);
                continue;
            }
            object = new Integer(n2);
            if (!IlOO.III1.IIII(object)) continue;
            Il_l.II iI3 = (Il_l.II)IlOO.III1.II(object);
            for (int i = 0; i < iI3.IIlO(); ++i) {
                int[] nArray3;
                IlO1 ilO1 = (IlO1)iI3.II(i);
                int n3 = ilO1.I_1O;
                Integer n4 = new Integer(n3);
                if (n2 == 19 && n3 == 109 && !bl) {
                    if (iII1.IIII(n4)) continue;
                    iII1.II(n4, Boolean.TRUE);
                    nArray3 = IlOo.II(nArray, n3);
                    iII_.void_III(new II(nArray3));
                    continue;
                }
                if (iII1.IIII(n4) || !bl && n3 >= 105 && n3 <= 110) continue;
                iII1.II(n4, Boolean.TRUE);
                nArray3 = IlOo.II(nArray, n3);
                iII_.void_III(new II(nArray3));
            }
        }
        int n5 = Integer.MAX_VALUE;
        nArray = null;
        for (n2 = 0; n2 < iI.IIlO(); ++n2) {
            object = (int[])iI.II(n2);
            if (((int[])object).length >= n5) continue;
            n5 = ((int[])object).length;
            nArray = object;
        }
        return nArray;
    }

    private static boolean II(int[] nArray, long l, boolean bl) {
        if (IlOo.IIII(nArray)) {
            return false;
        }
        if (!bl && IlOo.IIIl(nArray)) {
            return false;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            if (n != 155 && n >= 153 && n <= 159 && l < 4000000000L) {
                return false;
            }
            if ((n == 155 || n == 166) && l < 60000000000L) {
                return false;
            }
            for (int j = 0; j < IlOO.II_l.length; ++j) {
                if (Ilol.Ilol_II().var_IOlI_II.II01 > 24 || n != IlOO.II_l[j]) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean IIII(int[] nArray) {
        for (int i = 1; i < nArray.length - 1; ++i) {
            if (nArray[i] != 102 || nArray[i + 1] != 24 || nArray[i - 1] != 27 && nArray[i - 1] != 28 && nArray[i - 1] != 29) continue;
            return true;
        }
        return false;
    }

    private static boolean IIIl(int[] nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] < 105 || nArray[i] > 110) continue;
            return true;
        }
        return false;
    }

    private static int[] II(int[] nArray, int n) {
        int[] nArray2 = new int[nArray.length + 1];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        nArray2[nArray.length] = n;
        return nArray2;
    }

    public static String IIIl(int n) {
        long l = Ilol.Ilol_II().Illo;
        boolean bl = false;
        String string = "";
        if (n == 154 && l < 40000000000L) {
            string = IlOo.II0I("\u2576\u25a4\u2518\u25ac\u25c8\u3b6d\u259c\u2628\u2654\u38af\u2606\u26a4\u26ce\u3863\u268f\u2768\u273f\u274a\u398c\u2715\u27bb\u27ce\u27b1\u2791\u36d4\u2843\u2875\u2817\u28fb\u28dd\u28f1\u289d\u296e\u295e\u296d\u295d\u29be\u299e\u29f3\u29c8\u2a33\u2a16\u2a69\u2a54\u2ab3\u2a92\u2aed\u2ad0\u2acf\u2b2e\u2b11\u2b6c\u2b4b\u2baa\u2b97", 9519);
            bl = true;
        } else if (n == 155 && l < 60000000000L) {
            string = IlOo.II0I("\u2576\u25a4\u2518\u25ac\u25c8\u3b6d\u259c\u2628\u2654\u38af\u2606\u26a4\u26ce\u3863\u268f\u2768\u273f\u274a\u398c\u2715\u27bb\u27ce\u27b1\u2791\u36d4\u2843\u2875\u2817\u28fb\u28dd\u28f1\u289d\u296e\u295e\u296d\u295d\u29be\u299f\u29f3\u29c8\u2a31\u2a16\u2a69\u2a54\u2ab3\u2a92\u2aed\u2ad0\u2acf\u2b2e\u2b11\u2b6c\u2b4b\u2baa\u2b97", 9519);
            bl = true;
        } else if (n == 166 && l < 60000000000L) {
            string = IlOo.II0I("\u2576\u25a4\u2518\u25ac\u25c8\u3b6d\u259c\u2628\u2654\u38af\u2606\u26a4\u26ce\u3863\u268f\u2768\u273f\u274a\u398c\u2715\u27bb\u27ce\u27b1\u2791\u36d4\u2843\u2875\u2817\u28fb\u28dd\u28f1\u289d\u296e\u295e\u296d\u295d\u29bd\u299c\u29f3\u29c8\u2a31\u2a16\u2a69\u2a54\u2ab3\u2a92\u2aed\u2ad0\u2acf\u2b2e\u2b11\u2b6c\u2b4b\u2baa\u2b97", 9519);
            bl = true;
        } else if (n >= 153 && n <= 159 && n != 155 && l < 40000000000L) {
            string = IlOo.II0I("\u2576\u25a4\u2518\u25ac\u25c8\u3b6d\u259c\u2628\u2654\u38af\u2606\u26a4\u26ce\u3863\u268f\u2768\u273f\u274a\u398c\u2715\u27bb\u27ce\u27b1\u2791\u36d4\u2843\u2875\u2817\u28fb\u28dd\u28f1\u289d\u296e\u295e\u296d", 9519) + n + IlOo.II0I("\u2515\u256e\u2559\u25bc\u2587\u25fa\u25d9\u2638\u260b\u2676\u2655\u26b4\u268f\u26f2\u26d1\u2730\u2731", 9519);
            bl = true;
        }
        if (!bl && IlOO.IIl_(n) && Ilol.Ilol_II().var_IOlI_II.II01 <= 24) {
            string = IlOo.II0I("\u2567\u25ad\u2514\u25ac\u25c3\u25a5\u2509\u2666\u2607\u2632\u260d\u2664\u26cd\u26aa\u26c1\u276e\u2777\u2757\u399a\u2711\u27bb\u27cc\u393c\u27d8\u2906\u36f5\u2875\u2802\u2873\u28dd\u28f1\u289d\u296e\u295e\u296d", 9519) + n + IlOo.II0I("\u2501", 9519);
            bl = true;
        }
        if (!bl) {
            int n2;
            boolean bl2 = false;
            for (n2 = 0; n2 < IlOO.II_o.length; ++n2) {
                if (n != IlOO.II_o[n2]) continue;
                bl2 = true;
                break;
            }
            if (!bl2) {
                for (n2 = 0; n2 < IlOO.II_0.length; ++n2) {
                    if (n != IlOO.II_0[n2]) continue;
                    bl2 = true;
                    break;
                }
            }
            if (!bl2 && n >= 53 && n <= 62) {
                bl2 = true;
            }
            if (bl2 && Ilol.Ilol_II().var_Ilo0_II == null) {
                string = IlOo.II0I("\u256c\u3be9\u2503\u25ac\u25c8\u2539\u25c9\u266a\u2646\u2628\u2602\u26a4\u26cb\u381b\u2688\u2720\u260e\u39fd\u277d\u270a\u277b\u27d5\u27f9\u2795\u2876\u2846\u2875", 9519) + n + IlOo.II0I("\u2501", 9519);
                bl = true;
            }
        }
        if (!bl && n == 160 && !I1ol.II1_(992)) {
            string = IlOo.II0I("\u2564\u2526\u2599\u25e2\u25cc\u25ea\u258a\u26fb\u2607\u2608\u260d\u382f\u26cd\u26e2\u2695\u2768\u39c2\u2757\u277d\u2717\u27f3\u274e\u27b7\u279f\u2836", 9519);
            bl = true;
        }
        if (!bl) {
            string = IlOo.II0I("\u2564\u2526\u2599\u25e2\u25cc\u25ea\u259d\u2660\u38e4\u2666\u2611\u2668\u26ce\u26e2\u2695\u2768\u39ba\u2747\u277d\u266d\u262b\u3967\u27b7\u279f\u2837\u2927\u283c\u2854\u28e7\u3659\u28f1\u289d\u296e\u295e\u296d", 9519) + IOlO.l1oI + IlOo.II0I("\u250f\u245f\u3bd2\u25e2\u258b\u25a7\u2588\u2678\u2607", 9519) + n + IlOo.II0I("\u2501", 9519);
        }
        return string;
    }

    private static /* synthetic */ String II0I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    static class II {
        int[] IIO_;

        II(int[] nArray) {
            this.IIO_ = nArray;
        }
    }
}

