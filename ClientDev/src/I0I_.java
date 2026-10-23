package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;

public final class I0I_ {
    static final int __l1 = 10;
    static final int[] I_o = new int[]{13, 60, 61, 62, 63, 64, 65, 352, 523, 595};
    static final int[] I_oI = new int[]{100, 500, 2, 4, 8, 16, 32, 64, 128, 256};
    static final int[][] II_1 = new int[][]{{0, 0, 10, 5}, {0, 1, 40, 10}, {0, 16, 40, 100}, {6, 22, 0, 1}, {13, 21, 0, 10}, {27, 18, 0, 20}, {55, 13, 0, 50}, {69, 10, 0, 100}, {104, 4, 0, 300}, {0, 0, 0, 0}};
    static final int[][] II__ = new int[][]{{84, 85, 86, 87, 88, 89, 90, 90, 90, 90}, {371, 372, 373, 374, 375, 376, 377, 377, 377, 377}, {378, 379, 380, 381, 382, 383, 384, 384, 384, 384}};
    static final int[] I_ol = new int[]{348, 372, 348};
    static final int[] I_o1 = new int[]{20, 50, 120, 300, 800, 1500, 3000, 6000, 7500, 10000};
    static final int[] I_o_ = new int[]{1, 2, 5, 7, 9, 12, 15, 20, 25, 30};
    static final int[][][] III1 = new int[][][]{new int[][]{{19, 22}, {-1, 16}, {3, 10}, {19, 8}, {9, 0}}, new int[][]{{-1, 27}, {22, 35}, {15, 24}, {0, 17}, {-1, 7}, {26, 5}, {5, 0}}, new int[][]{{25, 41}, {-1, 40}, {25, 34}, {3, 32}, {25, 23}, {10, 19}, {2, 12}, {17, 10}, {4, 5}}, new int[][]{{3, 44}, {21, 49}, {25, 39}, {4, 30}, {29, 25}, {0, 18}, {21, 15}, {14, 39}, {18, 25}, {4, 7}, {15, 0}}, new int[][]{{21, 58}, {0, 56}, {18, 48}, {10, 0}, {25, 38}, {0, 26}, {14, 28}, {25, 16}, {1, 14}, {22, 7}, {10, 14}, {28, 23}, {15, 16}}, new int[][]{{25, 63}, {0, 66}, {21, 52}, {3, 55}, {14, 60}, {3, 45}, {22, 43}, {10, 35}, {22, 28}, {3, 28}, {18, 17}, {3, 14}, {17, 6}, {11, 22}, {6, 1}}, new int[][]{{32, 86}, {5, 77}, {25, 77}, {8, 89}, {29, 68}, {4, 63}, {18, 61}, {33, 53}, {8, 48}, {26, 39}, {11, 36}, {33, 23}, {18, 25}, {4, 20}, {26, 12}, {12, 7}, {19, 0}}, new int[][]{{32, 86}, {5, 77}, {25, 77}, {8, 89}, {29, 68}, {4, 63}, {18, 61}, {33, 53}, {8, 48}, {26, 39}, {11, 36}, {33, 23}, {18, 25}, {4, 20}, {26, 12}, {12, 7}, {19, 0}, {19, 0}, {19, 0}}, new int[][]{{32, 86}, {5, 77}, {25, 77}, {8, 89}, {29, 68}, {4, 63}, {18, 61}, {33, 53}, {8, 48}, {26, 39}, {11, 36}, {33, 23}, {18, 25}, {4, 20}, {26, 12}, {12, 7}, {19, 0}, {19, 0}, {19, 0}, {19, 0}, {19, 0}}, new int[][]{{32, 86}, {5, 77}, {25, 77}, {8, 89}, {29, 68}, {4, 63}, {18, 61}, {33, 53}, {8, 48}, {26, 39}, {11, 36}, {33, 23}, {18, 25}, {4, 20}, {26, 12}, {12, 7}, {19, 0}, {19, 0}, {19, 0}, {19, 0}, {19, 0}, {19, 0}, {19, 0}}};
    private final IO0 II10;
    private final IOo_ II1O;

    I0I_(IO0 iO0, IOo_ iOo_) {
        this.II10 = iO0;
        this.II1O = iOo_;
    }

    private IOol II() {
        return this.II10.var_IOol_II;
    }

    static int IIo0(int n) {
        return (n - 1) * 2 + 5;
    }

    static int IIoo(int n) {
        return n * 60;
    }

    private static int[][] III(int n) {
        return III1[n - 1 < III1.length ? n - 1 : III1.length - 1];
    }

    void IIlO() {
        IOol iOol = this.II();
        long l = System.currentTimeMillis();
        if (!iOol.lI) {
            int n;
            int n2;
            if (iOol._11o < I0I_.IIo0(iOol._110) && (n2 = (n = (int)((l - iOol.IO00) / 1000L)) / I0I_.IIoo(iOol._110)) > 0) {
                iOol._11o += n2;
                if (iOol._11o >= I0I_.IIo0(iOol._110)) {
                    iOol._11o = I0I_.IIo0(iOol._110);
                    iOol.IO00 = l;
                } else {
                    iOol.IO00 += (long)n2 * (long)I0I_.IIoo(iOol._110) * 1000L;
                }
            }
        } else if (l - iOol.IO0o >= I0I_.IIIl(iOol._110)) {
            if (iOol._110 < 10) {
                ++iOol._110;
            }
            iOol.lI = false;
            iOol.IO00 = l;
        }
    }

    static long IIIl(int n) {
        int[] nArray = II_1[n - 1];
        return (long)nArray[0] * 86400000L + (long)nArray[1] * 3600000L + (long)nArray[2] * 60000L;
    }

    private int IlO1() {
        IOol iOol = this.II();
        long l = iOol.IO00 + (long)I0I_.IIoo(iOol._110) * 1000L;
        int n = (int)((l - System.currentTimeMillis()) / 1000L);
        return n < 0 ? 0 : n;
    }

    private int IlO_() {
        IOol iOol = this.II();
        long l = iOol.IO0o + I0I_.IIIl(iOol._110) - System.currentTimeMillis();
        return (int)(l / 1000L < 0L ? 0L : l / 1000L);
    }

    void I___() {
        this.IIlO();
        IOol iOol = this.II();
        int n = iOol._110;
        int[][] nArray = I0I_.III(n);
        IO0o iO0o = new IO0o(-34).II(0).III(II__[iOol.lOlI][n - 1]).II(I0I_.I1o("\uc6e1\ud6bd\uc85a\uc86e\uc819\uc8e4\ud60c\uc8a4\uc8c9\uc96b\ud782\uc936\uc945", 51185) + n).III(I_ol[iOol.lOlI]).III(336).II(n);
        iO0o.III(iOol._11o).III(I0I_.IIo0(n)).II(I0I_.I1o("\uc6e1\uc871\uc841\uc829\uc84d\uc8e7\ud614\uc8be\uc8c9\uc960\ud786\uc932\uc96f\uc9c7\uc941\uc9bb\uc9c1\uca6c\ud4c4\uca50\uca7d\uca0f\ucaf2\ucad4\ucab1\ucad8\ucb79\ucb5e\ucb3c\ud5b5\ucbe6\ucb92\ucbb9\ud551\ucc7b\ucc0e\ucc25\ucdcd\ucce5", 51185));
        iO0o.IIII(iOol.lI ? this.IlO_() : this.IlO1());
        iO0o.II(nArray.length);
        for (int i = 0; i < nArray.length; ++i) {
            iO0o.II(nArray[i][0]).II(nArray[i][1]);
        }
        iO0o.II(iOol.lI);
        this.II1O.II(iO0o);
    }

    private String II1l() {
        IOol iOol = this.II();
        int[] nArray = II_1[iOol._110 - 1];
        String string = I0I_.I1o("\uc7bf\uc8f2\uc841\uc829\uc84d\uc8ef\ud60e\uc8ba\uc8e3", 51185);
        if (nArray[0] != 0) {
            string = string + nArray[0] + I0I_.I1o("\uc795", 51185);
        }
        if (nArray[1] != 0) {
            string = string + nArray[1] + I0I_.I1o("\uc799", 51185);
        }
        if (nArray[2] != 0) {
            string = string + nArray[2] + I0I_.I1o("\uc7d6", 51185);
        }
        string = string + I0I_.I1o("\uc7fb", 51185) + nArray[3] + (iOol._110 <= 3 ? I0I_.I1o("\uc7d1\uc87b", 51185) : I0I_.I1o("\uc7d1\uc844\uc85d", 51185)) + I0I_.I1o("\uc7fb\uc866\uc8cf\uc820\uc80a", 51185);
        return string;
    }

    private boolean Ilo0() {
        return this.II()._110 < 10 && this.II()._lOI != 0;
    }

    void l_I() {
        this.IIlO();
        IOol iOol = this.II();
        IO0o iO0o = new IO0o(-34).II(1);
        if (!iOol.lI) {
            iO0o.II(I0I_.I1o("\uc7a5\uc878\uc85a\uc844\uc805\uc8e3\ud60a\uc8a9\uc881", 51185));
            if (this.Ilo0()) {
                iO0o.II(this.II1l());
            }
            if (iOol._11o < I0I_.IIo0(iOol._110)) {
                iO0o.II(I0I_.I1o("\uc7ba\ud6af\uc85b\uc86e\uc805\ud62d\uc8df\uc8c0\uc887\uc960\uc946\uc928\uc90d\uc98e", 51185) + I_o_[iOol._110 - 1] + I0I_.I1o("\uc7d1\uc87e\uc848\ud683\uc80e", 51185));
            }
        } else {
            iO0o.II(I0I_.I1o("\uc7bf\uc8f2\uc841\uc829\uc84d\uc8ef\ud60e\uc8ba\uc8e3\uc966\uc94f\uc927\uc90b\uc9ec\uc9a9", 51185) + I_o1[iOol._110 - 1] + I0I_.I1o("\uc7d1\uc87e\uc848\ud683\uc80e", 51185));
            int[] nArray = II_1[iOol._110 - 1];
            iO0o.II(I0I_.I1o("\uc7b9\ud6f7\uc856\uc844\uc803\uc86e\uc8c5\uc8ad\uc8c9\uc96b\ud782\uc936\uc96f\uc9ec\ud770\uc9ab\uc9c1", 51185) + nArray[3] / 2 + (iOol._110 <= 3 ? I0I_.I1o("\uc7d1\uc87b", 51185) : I0I_.I1o("\uc7d1\uc844\uc85d", 51185)) + I0I_.I1o("\uc7fb\uc866\uc8cf\uc820\uc80a", 51185));
        }
        this.II1O.II(iO0o);
    }

    void I11O(int n) {
        this.IIlO();
        IOol iOol = this.II();
        if (!iOol.lI) {
            int n2;
            boolean bl = this.Ilo0();
            int n3 = n2 = bl ? 2 : 1;
            if (n == 0) {
                this.II10.IIIl.l1oI();
                this.l_II();
            } else if (n == 1 && bl) {
                this.l_Il();
            } else if (n == n2 && iOol._11o < I0I_.IIo0(iOol._110)) {
                this.l_I_();
            }
        } else if (n == 0) {
            this.l_IO();
        } else if (n == 1) {
            this.l_I1();
        }
    }

    void l_II() {
        Object object;
        IOol iOol = this.II();
        this.IIlO();
        if (iOol._11o <= 0) {
            this.II10.IIIl.IIol(I0I_.I1o("\uc7b2\uc8f2\uc856\uc86e\uc80e\uc8e4\uc91b\uc8ab\uc8c9\uc96b\uc9d4\uc966\uc90d\ud725\uc9d7\uc9e2\uc8f0\ud4ad\uca6a\uca1e\uca33\uca9c\ucaf4", 51185));
            return;
        }
        int n = iOol._110;
        int n2 = 0;
        while (iOol._11o > 0 && this.II10.IIIl.III0((IO0l)(object = new IO0l(I_o[n - 1], 1).III(n - 1 > 1 ? 2 : 48, I_oI[n - 1])))) {
            --iOol._11o;
            ++n2;
        }
        if (n2 == 0) {
            this.II10.IIIl.IIol(I0I_.I1o("\uc7b9\uc8f0\uc841\uc826\uc84d\uc8f8\uc8d9\uc8ab\uc887\uc96f\uc907\uc92d\uc90d\uc970\uc9cd\uc9a5\uc9c1\uca63\ucaed\uca50\uca7d\uca1f\ucaf3\ud46d\ucaf9\uca8c\ucb65\ud5e7\ucb3b\ucb13", 51185));
            return;
        }
        iOol.IO00 = System.currentTimeMillis();
        this.II10.IIIl.l1_l();
        this.II1O.II(new IO0o(-34).II(2).III(iOol._11o).IIII(this.IlO1()));
        object = IOO.IOO$III_II(I_o[n - 1]);
        this.II10.IIIl.IIol(I0I_.I1o("\uc7b3\ud6b1\uc841\uc86e\uc81b\ud667\uc8ca\uc8ea\uc89d\uc960\uc952\uc966\uc90d\uc9eb\ud702\uc9a1\uc989\uca20\ucb0e\ucb8e\ud4be\uca1f\ucabb", 51185) + n2 + I0I_.I1o("\uc7d1\uc878\ud68e\uc83a\uc84d", 51185) + (object == null ? I0I_.I1o("\uc6e0\ud6bd\uc85a", 51185) : ((IOO.III)object).II1o));
        this.II10.I__O();
    }

    private long III0() {
        IOol iOol = this.II();
        int n = II_1[iOol._110 - 1][3];
        return (long)n * (iOol._110 <= 3 ? 1000L : 1000000L);
    }

    void l_Il() {
        IOol iOol = this.II();
        long l = this.III0();
        if (iOol.Il11 < l) {
            this.II10.IIIl.IIol(I0I_.I1o("\uc7b3\ud6b1\uc841\uc86e\uc806\uc8e4\uc85f\uc8a4\uc88e\uc928\uc836\ud7a1\uc945\uc9f2\uc943\uc9ac\uc986\uca20\ucb0e\ud4fd\uca7d\uca12\uca79\ucad4\ucabe\ucad8\ucb74\ud593\ucb25\ucb58\ucbb3\ucbd1\ucb23\ucb9e\ucc2f\ucc5a\ucc25\ucc05\ud234\uccdf\ucce9", 51185) + (l - iOol.Il11) + I0I_.I1o("\uc7d1\uc866\uc8cf\uc820\uc80a\uc8ac\uc8c5\ud625\uc888", 51185));
            return;
        }
        iOol.Il11 -= l;
        iOol.lI = true;
        iOol.IO0o = System.currentTimeMillis();
        this.II10.IIIl.l1_();
        this.I___();
        this.II10.I__O();
    }

    void l_I1() {
        IOol iOol = this.II();
        iOol.Il11 += this.III0() / 2L;
        iOol.lI = false;
        iOol.IO00 = System.currentTimeMillis();
        this.II10.IIIl.l1_();
        this.I___();
        this.II10.I__O();
    }

    void l_I_() {
        IOol iOol = this.II();
        int n = I_o_[iOol._110 - 1];
        if (iOol.lOoO < n) {
            this.II10.IIIl.IIol(I0I_.I1o("\uc7b3\ud6b1\uc841\uc86e\uc806\uc8e4\uc85f\uc8a4\uc88e\uc928\uc836\ud7a1\uc945\uc9ea\uc9c4\ud70f\uc982\uca20\ucb0e\ud4fd\uca7d\uca17\ud424\ucace\ucaf9\uca90\ud5b6\ucb42\ucb75\ucb1a\ucbfb\ucbd3\ucbbf\ucb98\ucc23\ucc0e\ucc2e\ucc9e\ucce5\ucc8a\uccbd\ucc80\ucd6e\ud399\ucd30\ucd44", 51185) + (n - iOol.lOoO) + I0I_.I1o("\uc7d1\uc87e\uc848\ud683\uc80e\uc8a2", 51185));
            return;
        }
        iOol.lOoO -= n;
        iOol._11o = I0I_.IIo0(iOol._110);
        this.II10.IIIl.l1_();
        this.I___();
        this.II10.I__O();
    }

    void l_IO() {
        IOol iOol = this.II();
        int n = I_o1[iOol._110 - 1];
        if (iOol._110 >= 10 || iOol.lOoO < n) {
            this.II10.IIIl.IIol(I0I_.I1o("\uc7b3\ud6b1\uc841\uc86e\uc806\uc8e4\uc85f\uc8a4\uc88e\uc928\uc836\ud7a1\uc945\uc9ea\uc9c4\ud70f\uc982\uca20\ucb0e\ud4fd\uca7d\uca12\uca79\ucad4\ucabe\ucad8\ucb74\ud593\ucb25\ucb54\ucbfd\ucbda\ucbb0\ucb9e\ucc67\ucc0e\ucc25\ucc03\ud23c\uccc9\ucce9\ucc8b\ucde5\ucd5f\ucd65\ucc75\ucd60\ucd82\uccd0\ud341\ucd8b\uce3e\uce5e\ud0f9\uce0b\uceba\ucecd\ud009\uce9e\ucf36\uce24\ucf35\ucf5d", 51185));
            return;
        }
        iOol.lOoO -= n;
        ++iOol._110;
        iOol.lI = false;
        iOol.IO00 = System.currentTimeMillis();
        this.II10.IIIl.l1_();
        this.I___();
        this.II10.IIIl.IIol(I0I_.I1o("\uc7bf\uc8f2\uc841\uc829\uc84d\uc8ef\ud60e\uc8ba\uc8c9\uc966\uc94f\uc927\uc90b\uc9ec\uc983\uc9b6\uc989\ucae0\uca71\uca56\uca7d\uca1f\uca6f\ucad4\ucabe\ucad9\ucb37\ucb74\ud5f4\ucb1a\ucbb3\ucaa3\ucb32\ucbd0\ucc62\ud28b\ucc39\ucc4c", 51185) + n + I0I_.I1o("\uc7d1\uc87e\uc848\ud683\uc80e\uc8a2", 51185));
        this.II10.I__O();
    }

    void II(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        if (by == 1) {
            this.l_I();
        } else if (by == 2) {
            this.I___();
        }
    }

    private static /* synthetic */ String I1o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

