package main;

/*
 * Decompiled with CFR 0.152.
 */
final class IO_ {
    static final int l__0 = 1;
    static final int l__o = 2;
    static final int l_O = 3;
    static final int l_OI = 4;
    static final int l_Ol = 5;
    static final int l_O1 = 6;
    static final int l_O_ = 7;
    static final int l_OO = 8;
    static final int l_O0 = 9;
    static final int l_Oo = 10;
    static final int l_0 = 11;
    static final int l_0I = 12;
    static final int l_0l = 13;
    static final int l_01 = 14;
    static final int l_0_ = 15;
    static final int l_0O = 16;
    static final int l_00 = 17;
    static final int l_0o = 18;
    static final int l_o = 19;
    static final int l_oI = 20;
    static final int l_ol = 21;
    static final Object[][] var_java_lang_Object_arr_arr_III;
    static final Object[][] IIII;
    static final boolean I00O = true;
    private final IO0 var_IO0_III;
    private final IOo_ var_IOo__III;
    private long I1Io;

    IO_(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_III = iO0;
        this.var_IOo__III = iOo_;
    }

    static Object[] II(int n) {
        for (int i = 0; i < var_java_lang_Object_arr_arr_III.length; ++i) {
            if ((Integer)var_java_lang_Object_arr_arr_III[i][0] != n) continue;
            return var_java_lang_Object_arr_arr_III[i];
        }
        return null;
    }

    static Object[] III(int n) {
        for (int i = 0; i < var_java_lang_Object_arr_arr_III.length; ++i) {
            if ((Integer)var_java_lang_Object_arr_arr_III[i][1] != n) continue;
            return var_java_lang_Object_arr_arr_III[i];
        }
        return null;
    }

    private static Object[] IIII(int n) {
        for (int i = 0; i < IIII.length; ++i) {
            if ((Integer)IIII[i][0] != n) continue;
            return IIII[i];
        }
        return null;
    }

    static int int_II(IOol iOol, int n) {
        int n2 = 0;
        for (int i = 0; i < iOol.II1l.size(); ++i) {
            Object[] objectArray;
            long[] lArray = (long[])iOol.II1l.elementAt(i);
            if (lArray[2] == 0L || (objectArray = IO_.II((int)lArray[0])) == null) continue;
            int[][] nArray = (int[][])objectArray[3];
            for (int j = 0; j < nArray.length; ++j) {
                if (nArray[j][0] != n) continue;
                n2 += nArray[j][1];
            }
        }
        return n2;
    }

    private static boolean boolean_II(IOol iOol, int n) {
        for (int i = 0; i < iOol.II1l.size(); ++i) {
            if (((long[])iOol.II1l.elementAt(i))[0] != (long)n) continue;
            return true;
        }
        return false;
    }

    void IIlo(int n, int n2) {
        Object[] objectArray = IO_.IIII(n);
        if (objectArray == null || n2 <= 0) {
            return;
        }
        IOol iOol = this.var_IO0_III.var_IOol_II;
        int n3 = (Integer)objectArray[2];
        iOol.I__I[n] = Math.min(n3, iOol.I__I[n] + n2);
    }

    int II11(int n) {
        IOol iOol = this.var_IO0_III.var_IOol_II;
        for (int i = 0; i < IIII.length; ++i) {
            int n2;
            if ((Integer)IIII[i][3] != n) continue;
            int n3 = (Integer)IIII[i][0];
            int n4 = iOol.I__I[n3];
            return n4 >= (n2 = ((Integer)IIII[i][2]).intValue()) ? 100 : (int)((long)n4 * 100L / (long)n2);
        }
        return 0;
    }

    private void II1(int n, int n2) {
        IOol iOol = this.var_IO0_III.var_IOol_II;
        for (int i = 0; i < iOol.II1l.size(); ++i) {
            ((long[])iOol.II1l.elementAt((int)i))[2] = 0L;
        }
        long[] lArray = new long[]{n, System.currentTimeMillis() + (long)n2 * 86400000L, 1L};
        iOol.II1l.addElement(lArray);
        iOol.II1l.addElement(lArray);
    }

    void IIO1(String string) {
        if (string.equals(IO_.I1l_("\udb0d\udb38\udbc1\udbe9\udb8f\udbbb", 56142)) || string.equals(IO_.I1l_("\udb0d\udb22\udbc3\udbe7\udb8f\udbbb", 56142)) || string.equals(IO_.I1l_("\udb0c\udb21\udbcd\udbe8\udb81\udbb6\udc4f\udc68\udc0d\udc30", 56142)) || string.equals(IO_.I1l_("\udb16\udb28\udbc2\udbf4\udb88\udba6\udc57\udc6f\udc13\udc2b\udcc3", 56142)) || string.equals(IO_.I1l_("\udb1d\udb24\udbc9\udbfe\udb95\udbab\udc47\udc78\udc0e\udc30\udcca\udce4", 56142)) || string.equals(IO_.I1l_("\udb0c\udb2c\udbce\udbf2", 56142)) || string.startsWith(IO_.I1l_("\udb16\udb28\udbc2\udbf4\udb89\udba6\udc46", 56142))) {
            this.IIlo(3, 1);
        }
        if (string.equals(IO_.I1l_("\udb0d\udb22\udbc3\udbe7\udb8f\udbbb", 56142))) {
            this.IIlo(19, 1);
        }
    }

    void III1(long l) {
        int n;
        IOol iOol = this.var_IO0_III.var_IOol_II;
        if (iOol == null) {
            return;
        }
        boolean bl = false;
        for (n = iOol.II1l.size() - 1; n >= 0; --n) {
            long[] lArray = (long[])iOol.II1l.elementAt(n);
            if (l >= lArray[1]) {
                iOol.II1l.removeElementAt(n);
                bl = true;
                continue;
            }
            if (lArray[2] == 0L) continue;
            iOol._1OO = (int)lArray[0];
        }
        for (n = 0; n < IIII.length; ++n) {
            int n2 = (Integer)IIII[n][0];
            int n3 = (Integer)IIII[n][2];
            int n4 = (Integer)IIII[n][3];
            if (iOol.I__I[n2] < n3) continue;
            if (IO_.boolean_II(iOol, n4)) {
                return;
            }
            this.II1(n4, 30);
            iOol.I__I[n2] = 0;
            iOol._1OO = n4;
            Object[] objectArray = IO_.II(n4);
            this.var_IO0_III.IIIl.IIol(IO_.I1l_("\udb0c\uc5cc\udbe2\udb8b\udadb\udb0a\udc28\udc49\udc2e\uc2c8\udcea\udc83\uddd3\udd51\uc3e3\udd7c\udd1e\udd39\udd1d\uddf5\uddd2\uddf9\udd90\ude7e\uc0f1\ude20\ude54", 56142) + (objectArray == null ? IO_.I1l_("\udb23\uc5b6\udbe5", 56142) : objectArray[2]));
            bl = true;
        }
        if (iOol._1OO != -1 && l - this.I1Io >= 10000L) {
            this.I1Io = l;
            this.var_IOo__III.II(new IO0o(24).II(2).IIII(iOol.I1l).II(5).III(iOol._1OO));
            this.var_IO0_III.ll_0();
        }
        if (bl) {
            this.var_IO0_III.ll_0();
            this.var_IO0_III.I__O();
        }
    }

    void II1I(int n, int n2) {
        int n3;
        IOol iOol = this.var_IO0_III.var_IOol_II;
        Object[] objectArray = IO_.III(n2);
        int n4 = n3 = objectArray == null ? -1 : (Integer)objectArray[0];
        if (n == 0) {
            if (this.II11(n3) < 100) {
                this.var_IO0_III.IIIl.IIol(IO_.I1l_("\udb0c\uc5cc\udbe2\udb8b\udba9\udb81\uddb8\udc46\udc66\udc08\uc25b\udc83\udca9\udc89\uddf3\udd7e\udd1e\udd39\udd1d\uddf5\uddd2\uddf9\udd90\ude7e\uc0f1\ude20\ude54\udefd\ude52\udea8", 56142));
                return;
            }
            if (IO_.boolean_II(iOol, n3)) {
                this.var_IO0_III.IIIl.IIol(IO_.I1l_("\udb0c\uc5cc\udbe2\udb8b\udadb\udb0a\udc28\udc54\uc299\udc45\udcec\uc24c\udcb7\udcc1\udd64\udd7e\udd50\udd35\udd5c\uddf3\uddd3\uc31e\udd8d\ude37\ude58\udeb5\ude0d\udeb3\udec0\uc002\ude99", 56142));
                return;
            }
            this.II1(n3, 30);
            iOol._1OO = n3;
            this.var_IO0_III.IIIl.IIol(IO_.I1l_("\udb0c\uc5cc\udbe2\udb8b\udadb\udb0a\udc28\udc49\udc2e\uc2c8\udcea\udc83\uddd3\udd51\uc3e3\udd7c\udd1e\udd39\udd1d\uddf5\uddd2\uddf9\udd90\ude7e\uc0f1\ude20\ude54", 56142) + (objectArray == null ? IO_.I1l_("\udb25\udb05\udb78\udbc5\udbad\udbc9\udc7a\udcd2", 56142) : objectArray[2]));
            this.var_IO0_III.ll_0();
            this.var_IO0_III.I__O();
            return;
        }
        long l = System.currentTimeMillis();
        if (iOol.IOol - l > 0L) {
            this.var_IO0_III.IIIl.IIol(IO_.I1l_("\udb18\udb18\udbe5\udb8b\udba6\udb1b\udc66\udc40\udc66\udd74\uc267\udcca\udce2", 56142) + (iOol.IOol - l) / 1000L + IO_.I1l_("\udb6e\udb0a\udbe5\udb49\udbb3\udbc9\udc66\uc2c8\udc27", 56142));
            return;
        }
        if (iOol._1OO == n3) {
            this.var_IO0_III.IIIl.IIol(IO_.I1l_("\udb0a\udb0c\udbe2\udbc3\udbea\udb81\udc61\uc2e0\udc33\udc45\udd95\udcc2\udcac\udc86\udd20\udc0e\udc8e\uc3be\udd1f\uddbb\uddc9\uc336\uddd8\ude73\uc0d3\ude3b\ude13\udebf\ude92\udeb9\ude13\udf76\udf0e\udf2e\udf04\uc146\udfc4\udfe9\udf8c\ue066\ue048\ue02d\ue044\ue0eb\ue0cb\ufe06\ue095\ue0df\ue175\ue155\ue1bd\ue118", 56142));
            iOol.IOol = l + 3000L;
            return;
        }
        for (int i = 0; i < iOol.II1l.size(); ++i) {
            long[] lArray = (long[])iOol.II1l.elementAt(i);
            lArray[2] = lArray[0] == (long)n3 ? 1L : 0L;
        }
        iOol._1OO = n3;
        IOO.III iII = IOO.IOO$III_II(n2);
        this.var_IO0_III.IIIl.IIol(IO_.I1l_("\uda5e\udb8e\udbac\udaba\uc51f\udb80\udc28\udc43\udc27\udc0b\udcec\udc83\udcaa\udc88\uc3c7\udd6a\udd1e\udd2e\udd1d\uddf5\udddd\uddf9", 56142) + (iII == null ? "" : iII.II1o));
        iOol.IOol = l + 3000L;
        this.var_IO0_III.ll_0();
        this.var_IO0_III.IIIl.l1Ol();
        this.var_IO0_III.I__O();
    }

    static {
        var_java_lang_Object_arr_arr_III = new Object[][]{{218, 1289, IO_.I1l_("\uda5e\uc5cc\udbe5\udb8b\udbad\udb80\udc69\udc07\udc2b\uc2be\udced\udc83\udcac\udc89\uddfa", 56142), new int[][]{{50, 15}, {93, 30}}}, {219, 1290, IO_.I1l_("\udb1a\udb1f\udb75\udbc6\udbea\uda59\uc2d3\udc44\udc66\udc17\uc257\udccd\udca5", 56142), new int[][]{{77, 6}, {93, 30}}}, {220, 1291, IO_.I1l_("\udb1a\udb1f\udb75\udbc6\udbea\udb9a\udd0b\udc49\udc66\udc07\udceb\udcd0\udcb1", 56142), new int[][]{{50, 5}, {93, 30}}}, {221, 1292, IO_.I1l_("\udb1a\udb05\udb6d\udbc5\udba2\udbc9\udd19\uc28a\udc36\udc45\udd95\uc270\udce2\udcca\udd37", 56142), new int[][]{{77, 10}, {103, 10}, {93, 30}}}, {222, 1293, IO_.I1l_("\udb0d\udb0c\udbe3\udb8b\udbbe\udb81\uc2ef\udc07\udc35\udc0c\udc6e\udcd6\udce2\udc89\uc3a1\udd71\udd59", 56142), new int[][]{{77, 8}, {93, 30}}}, {223, 1294, IO_.I1l_("\udb00\udb99\udbe2\udbcc\udbea\udb8d\udcea\udc49\udc66\udc06\udcec\udda0\udcaf\udcc1\udd63\udd77\uc3f7", 56142), new int[][]{{77, 5}, {103, 5}, {93, 30}}}, {224, 1295, IO_.I1l_("\udb9a\udb03\udbeb\udb8b\udbbe\udb81\uc2af\udc49\udc66\udc13\udce1\udc83\udca1\udc89\udd61\udd76", 56142), new int[][]{{108, 3}, {93, 30}}}, {225, 1296, IO_.I1l_("\udb0c\uc5a6\udbac\udbc6\udb39\udb8a\udc28\udc54\uc2e7\udc06\udcec\udc83\udcb6\udc1b\udd69", 56142), new int[][]{{108, 5}, {77, 5}, {103, 5}, {93, 30}}}, {228, 1299, IO_.I1l_("\udb08\udb0c\udbe2\udb8b\udba9\uc500\udc66\udc40", 56142), new int[][]{{50, 3}, {77, 3}, {103, 3}, {93, 30}}}, {242, 1392, IO_.I1l_("\udb09\udb98\udbac\udaba\uc56d\udb9c\udc28\udc53\udc34\uc2de", 56142), new int[][]{{77, 10}, {103, 10}, {5, 10}, {93, 30}}}, {243, 1393, IO_.I1l_("\udb09\udb98\udbac\udaba\uc56d\udb9c\udc28\udc53\udc34\uc2de", 56142), new int[][]{{77, 10}, {103, 10}, {5, 10}, {93, 30}}}, {240, 1394, IO_.I1l_("\udb09\udb98\udbac\udaba\uc56d\udb9c\udc28\udc53\udc34\uc2de", 56142), new int[][]{{77, 10}, {103, 10}, {5, 10}, {93, 30}}}, {247, 1457, IO_.I1l_("\udb16\udb40\udbe1\udbca\udbb9", 56142), new int[][]{{50, 12}, {77, 12}, {103, 12}, {93, 30}}}, {253, 1514, IO_.I1l_("\udb0b\udb00\udbac\udbd3\udba3\udb87\udc60\udc0b\udc66\udc00\udce9\udc83\uddd3\uc258\udd70", 56142), new int[][]{{50, 11}, {77, 11}, {103, 11}, {117, 5}, {93, 30}}}, {256, 1790, IO_.I1l_("\udb03\uc5d4\udbac\udbf9\uc519\udb87\udc6f", 56142), new int[][]{{50, 13}, {77, 13}, {5, 7}, {93, 30}}}, {226, 1297, IO_.I1l_("\udb05\udb22\udbc0", 56142), new int[][]{{50, 10}, {77, 10}, {103, 10}, {93, 30}}}, {255, 1817, IO_.I1l_("\udb03\udb94\udbed\udb8b\udadb\udb1d\udc66\udc40\udc66\udc0e\udcec\udc57\udcac\udc86\udd20\udd73\uc39f\udd33\udd14", 56142), new int[][]{{50, 10}, {77, 10}, {103, 10}, {106, 0}, {93, 30}}}, {254, 1673, IO_.I1l_("\udb1a\udb0c\udbf5\udb8b\udba4\udb81\udc69\udc49\udc2e\udc45\udcec\udd02\udcac\udcc1\udd6e\uddfc\udd51", 56142), new int[][]{{77, 5}, {236, 20}, {101, 10}, {93, 7}}}, {506, 1844, IO_.I1l_("\udb0d\udb05\udbe5\uc514\udba4\udbc9\udc6a\udc4e\udc28\udc0d\udca4\udcd0\udca3\udc8e\udd20\udc0e\udd5b\udd33", 56142), new int[][]{{10, 77}, {50, 10}, {103, 10}, {93, 30}}}};
        IIII = new Object[][]{{1, IO_.I1l_("\udb00\uc5cc\udbfc\udb8b\udb9e\udb04\udc6b\udc4f\udc66\udc09\udcf1\uc25a\udce2\udcd0\udd20\udd4b\udd4c\udd34\uc3bb\uddee\udd9a\udd8d\udd8a\ude78\ude58\ude32\ude54\udedd\uded5\ude31\ude89", 56142), 1000000, 218}, {2, IO_.I1l_("\udae1\uc5b6\udbef\udb8b\udb98\uc53a\udc66\udc40\udc66\udc31\udcec\uc204\udcac\udcc1\udd31\udd3f\udd6d\udd3c\udd13\uddbb\udde2\udde8\uddc8\ude27\ude16\ude19\uc0d3\udefd", 56142), 100, 219}, {3, IO_.I1l_("\udb06\uc5cc\udbac\udbec\uc52f\udb8a\udc28\udc64\udc33\udc08\udce6\udcc6\udcb0\udccd\udd20\udd5d\udd52\udd3c\udd1f\uddf0\udd9a\udd9e\udd97\ude7c\ude43\ude79\ude54\uded0\udedd\udebe\ude9c\udf6a\udf5c\udf61\udf4c\udfd3\udf40\udfa7\udfc8\ue02f\ue006\ue076\ue054\ue0b3\ue082\ue08d\ufe47\ue091\ue13e\ue114", 56142), 300, 220}, {4, IO_.I1l_("\uda5e\uc5c0\udbfc\udb8b\udbff\udbc9\udc5c\udc55\udc27\udc0b\udce3\udc83\udc80\uc22a\udd20\udd34\udd09\udd7d\udd28\udde9\uddd5\uddb7\udd9f\ude37\ude78\ude32\ude94\udeea", 56142), 5, 221}, {5, IO_.I1l_("\udb1a\udb02\udbfc\udb8b\udbfb\udbc9\udd18\uc286\udc2f\udc45\udccc\uc27a\udcab\udcc1\udd56\uddea\udd1e\udc4d\udd9c\uddf2\udd9a\udd8a\udd91\udefd\ude43\ude75\ude3c\uc032\udedc\udeb6", 56142), 1, 222}, {6, IO_.I1l_("\udb06\udb02\udb6c\udbc5\udbea\udbbd\udc60\udcc7\udc28\udc0d\udca4\udc92\udcf2\udcc1\udd4e\udd77\udd57\uc39a\udd11\uddbb\uddec\uc33c\uddd8\ude44\ude5f\udebf\ude01\udeb3\udef9\udeb9\ude03\udf2f\udf7a\uc1ec\udf05\udfab\udfe8\udf3b\udfc8\ue04a\ufeff\ue02b\ue003", 56142), 10, 223}, {7, IO_.I1l_("\uda5e\udb8c\udbe2\udbc3\udbea\udbab\uc2a9\udc4e\udc6a\udc45\udccc\udccc\uc275\udc82\udd20\udd5c\udd56\udd32\udd5c\uddc3\udc0a\udc78\udd96\ude70\ude16\ude06\ude87\udefa\ude92\udee3\udec0\udf2f\udf62\uc1ea\udf02", 56142), 20, 1286}, {8, IO_.I1l_("\udb06\udb02\udb6c\udbc5\udbea\udbbd\udc60\udcc7\udc28\udc0d\udca4\udced\udcaa\udc88\uc3c7\udd72\udd1e\udd0b\uc399\uddbb\udd8f\uddf9\uddb4\uc0b0\ude58\ude75\ude37\udefb\udedd\udef1\udea8\udf66\udf40\udf2f\udf0d\udfff\udfc5\udfe9\udfa6\ue1b7\ufefd\ue026", 56142), 5, 1287}, {9, IO_.I1l_("\udb00\udb05\uc53b\udbdf\udbea\udaf9\uc2db\udc07\udc12\udc17\udceb\udccd\udca5\udcc1\udd4e\udd78\uddde\udd24\udd5c\uddae\udd8a\udde9\uddd8\ude5b\uc091\ude3b", 56142), 500, 224}, {10, IO_.I1l_("\udb1a\udb04\udb66\udbde\udbea\udb8d\udc61\uc2e0\udc32\udc45\udcb7\udc93\udce2\udca3\udd6f\udd6c\udd4d\udd7d\udc7e\uddf5\udd9a\udd8d\udd8a\uc0ce\ude5b", 56142), 30, 225}, {11, IO_.I1l_("\udb1a\udb04\udb66\udbde\udbea\udbad\udc61\uc2e0\udc32\udc45\udcb7\udc93\udce2\udca3\udd6f\udd6c\udd4d\udd7d\uc3a2\uddbb\uddfe\udc78", 56142), 30, 1300}, {12, IO_.I1l_("\udb03\uc5b2\udbac\udbf9\uda7a\uda48\udc66\udc40\udc66\udc22\uc253\udc83\udc81\uc244\udd70\udd3f\udd0f\udd6f", 56142), 10, 240}, {13, IO_.I1l_("\udb03\uc5b2\udbac\udbf9\uda7a\uda48\udc66\udc40\udc66\udc22\uc253\udc83\udc81\uc244\udd70\udd3f\udd0f\udd6f", 56142), 20, 242}, {14, IO_.I1l_("\udb03\uc5b2\udbac\udbf9\uda7a\uda48\udc66\udc40\udc66\udc22\uc253\udc83\udc81\uc244\udd70\udd3f\udd0f\udd6f", 56142), 30, 243}, {15, IO_.I1l_("\uda5e\uc5cc\udbf8\udb8b\udbff\udbd9\udc38\udc07\udd56\udc0c\uc247\udcce\udce2\udcb2\uc3f1\udd3f\udd75\udd34\uc3bb\uddf5", 56142), 500, 247}, {16, IO_.I1l_("\udb00\uc5cc\udbfc\udb8b\udbbe\udb04\udc6b\udc4f\udc66\udc09\udded\udcda\udce2\udcd3\udd20\udd6b\udd4c\udd34\uc3bb\uddee\udd9a\uddad\udd8a\ude78\ude58\ude32\ude54\udefd\uded5\ude31\ude89", 56142), 2000000, 253}, {17, IO_.I1l_("\udb1d\uc5b2\udbac\udbc3\uc525\udb9c\udc28\udc10\udc66\udc17\uc257\udccd\udca5\udcc1\udd6e\udd77\uddd3\udd7d\udd0a\udcb2\uddd4\uddb1\uddd8\ude61\ude5f\uc090\ude1a", 56142), 7, 256}, {18, IO_.I1l_("\udb08\udb0c\udbe2\udb8b\udba9\uc500\udc66\udc40\udc66\udc2e\udccb\udcef", 56142), 1, 226}, {19, IO_.I1l_("\udb06\uc5cc\udbac\udb9a\udbfa\udbd9\udc28\udc4b\uc2e1\udc0b\udca4\udcc1\udcad\udc92\udd73\udd3f\udd5d\udd32\udd13\uddf7\udddf\uddab", 56142), 100, 255}, {20, IO_.I1l_("\udb0c\uc5c8\udbe1\udb8b\udba2\uc53a\udc61\udc07\udc35\udc0c\udcea\udccb\udce2\udc8f\udd67\udd7e\udd47\udd7d\udd4d\uddbb\uddd4\uddbe\uc335\ude74\ude16\ude64\ude44\udea3\ude82\udef1\ude9c\uc1a8\udf40", 56142), 1000, 254}, {21, IO_.I1l_("\udb1a\udb05\udbf9\udb8b\udbbe\udb81\uc2a5\udc57\udc66\udd74\uc263\udc83\udcf5\udcc1\udd76\udd76\uddd4\udd33\udd5c\uddf5\udddd\uc314\udd9b\ude37\ude44\uc086\ude1a\udef4\ude92\udea2\ude91\udf60\udf0e\ude5c\udf09\udfe5\udf8a\uded8\uc12b\ue027\ue055\ufe9a\ue044\ue0eb\ufe4d\ue0b4\ue0c0\ue09b\ue17f\ue153\ue134\ue15b\ue1f2\ue1d0\uff1f\ue182\ue236\ue25b\ue2b4\ue20a", 56142), 7, 506}};
    }

    private static /* synthetic */ String I1l_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

