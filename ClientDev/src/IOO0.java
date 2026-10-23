package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

final class IOO0 {
    static final String lI1l = "HALLOWEEN";
    static final String lI11 = "CHRISTMAS";
    static final String lI1_ = "HUNG_VUONG";
    static final String lI1O = "TRUNG_THU";
    static final String lI10 = "LUNAR_NEW_YEAR";
    static final String lI1o = "INTERNATIONAL_WOMANS_DAY";
    private static final Object[][] III1 = new Object[][]{{IOO0.I1_l("\u5ecd\u5ef5\u5ef1\u5e9f\u5eaf\u5f43\u5f75\u5f1f\u5f2e\u5fc7\u5fee\u5f93\u5fb4\u6046", 24193), 1, 20, 2, 25}, {IOO0.I1_l("\u5ec8\u5eee\u5eeb\u5e9b\u5eaf\u5f52\u5f7a\u5f0e\u5f30\u5fd7\u5ff9\u5f97\u5fb9\u604b\u6064\u601d\u603c\u60d1\u60e1\u609d\u60b2\u6148\u616a\u6113", 24193), 3, 1, 3, 10}, {IOO0.I1_l("\u5ec9\u5ef5\u5ef1\u5e99\u5ea2\u5f4a\u5f6e\u5f15\u5f37\u5fdf", 24193), 4, 1, 4, 25}, {IOO0.I1_l("\u5ed5\u5ef2\u5eea\u5e90\u5eba\u5f43\u5f6f\u5f12\u5f2c", 24193), 9, 15, 10, 5}, {IOO0.I1_l("\u5ec9\u5ee1\u5ef3\u5e92\u5eb2\u5f4b\u5f7e\u5f1f\u5f37", 24193), 10, 20, 11, 5}, {IOO0.I1_l("\u5ec2\u5ee8\u5eed\u5e97\u5eae\u5f48\u5f76\u5f1b\u5f2a", 24193), 12, 15, 1, 5}};
    static final String[] IlO = new String[]{IOO0.I1_l("\u5ecd\u5ef5\u5ef1\u5e9f\u5eaf\u5f43\u5f75\u5f1f\u5f2e\u5fc7\u5fee\u5f93\u5fb4\u6046", 24193), IOO0.I1_l("\u5ec8\u5eee\u5eeb\u5e9b\u5eaf\u5f52\u5f7a\u5f0e\u5f30\u5fd7\u5ff9\u5f97\u5fb9\u604b\u6064\u601d\u603c\u60d1\u60e1\u609d\u60b2\u6148\u616a\u6113", 24193), IOO0.I1_l("\u5ec9\u5ef5\u5ef1\u5e99\u5ea2\u5f4a\u5f6e\u5f15\u5f37\u5fdf", 24193), IOO0.I1_l("\u5ed5\u5ef2\u5eea\u5e90\u5eba\u5f43\u5f6f\u5f12\u5f2c", 24193), IOO0.I1_l("\u5ec9\u5ee1\u5ef3\u5e92\u5eb2\u5f4b\u5f7e\u5f1f\u5f37", 24193), IOO0.I1_l("\u5ec2\u5ee8\u5eed\u5e97\u5eae\u5f48\u5f76\u5f1b\u5f2a", 24193)};
    private static String lI_ = "";
    private static boolean Io__;
    static final int lo1o = 8401;
    static final int lo_ = 8402;
    static final int lo_I = 8403;
    private final IO0 var_IO0_IIlI;
    private final IOo_ var_IOo__IIlI;
    private final Random IIl = new Random();
    private String lI_I;
    private long I1oO;
    static final int lo_l = 901;
    static final int lo_1 = 1348;
    static final int lo__ = 1355;
    static final int lo_O = 1354;
    static final int lo_0 = 1356;
    private static final int[] I_lI;

    IOO0(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_IIlI = iO0;
        this.var_IOo__IIlI = iOo_;
    }

    static String IIlo() {
        return lI_;
    }

    static boolean IIl(String string) {
        return lI_.equals(string);
    }

    static String IIlO(String string) {
        if (string.equals(IOO0.I1_l("\u5ec9\u5ee1\u5ef3\u5e92\u5eb2\u5f4b\u5f7e\u5f1f\u5f37", 24193))) {
            return IOO0.I1_l("\u5ec9\u5ec1\u5ed3\u5eb2\u5e92\u5f6b\u5f5e\u5f3f\u5f17", 24193);
        }
        if (string.equals(IOO0.I1_l("\u5ec2\u5ee8\u5eed\u5e97\u5eae\u5f48\u5f76\u5f1b\u5f2a", 24193))) {
            return IOO0.I1_l("\u5ec6\u5ec9\u5e5e\u5eb0\u5e9a\u5f3c\u5f48\u5f33\u5f17\u5ff0", 24193);
        }
        if (string.equals(IOO0.I1_l("\u5ec9\u5ef5\u5ef1\u5e99\u5ea2\u5f4a\u5f6e\u5f15\u5f37\u5fdf", 24193))) {
            return IOO0.I1_l("\u5ec6\u5ec9\u4068\u5efe\u5e89\u41c9\u5f1b\u5f12\u5f80\u5ff6\u5fd0\u5ff6\u5fa3\u61a4\u6192\u603c\u6016", 24193);
        }
        if (string.equals(IOO0.I1_l("\u5ed5\u5ef2\u5eea\u5e90\u5eba\u5f43\u5f6f\u5f12\u5f2c", 24193))) {
            return IOO0.I1_l("\u5ed5\u5ed2\u5eca\u5eb0\u5e9a\u5f3c\u5f4f\u5f32\u5f0c", 24193);
        }
        if (string.equals(IOO0.I1_l("\u5ecd\u5ef5\u5ef1\u5e9f\u5eaf\u5f43\u5f75\u5f1f\u5f2e\u5fc7\u5fee\u5f93\u5fb4\u6046", 24193))) {
            return IOO0.I1_l("\u5ed5\u401f\u5ecb\u5efe\u5eb3\u5f7b\u5f4e\u5f23\u5f93\u5ff6\u5f97\u5ec6\u5f14\u607a", 24193);
        }
        if (string.equals(IOO0.I1_l("\u5ec8\u5eee\u5eeb\u5e9b\u5eaf\u5f52\u5f7a\u5f0e\u5f30\u5fd7\u5ff9\u5f97\u5fb9\u604b\u6064\u601d\u603c\u60d1\u60e1\u609d\u60b2\u6148\u616a\u6113", 24193))) {
            return IOO0.I1_l("\u5ed0\u5ed5\u406e\u5ebd\u5edd\u5f68\u4184\u5f7a\u5f09\u5ff0\u4152\u5ff6\u5f9b\u7efb\u6013\u606a\u605e\u60a3", 24193);
        }
        return "";
    }

    static String IIII(int n, int n2) {
        int n3 = n * 100 + n2;
        for (int i = 0; i < III1.length; ++i) {
            boolean bl;
            int n4;
            Object[] objectArray = III1[i];
            int n5 = (Integer)objectArray[1] * 100 + (Integer)objectArray[2];
            boolean bl2 = n5 <= (n4 = (Integer)objectArray[3] * 100 + (Integer)objectArray[4]) ? n3 >= n5 && n3 <= n4 : (bl = n3 >= n5 || n3 <= n4);
            if (!bl) continue;
            return (String)objectArray[0];
        }
        return "";
    }

    static String IIl(long l) {
        String string = null;
        try {
            string = System.getProperty(IOO0.I1_l("\u5eef\u5ed2\u5ed0\u5eb2\u5e94\u5f68\u5f5e\u5f74\u5f1c\u5fee\u5fd2\u5fb8\u5f81", 24193));
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (string != null && string.length() > 0 && !string.equalsIgnoreCase(IOO0.I1_l("\u5ec0\u5ef5\u5eeb\u5e91", 24193))) {
            Io__ = true;
            if (string.equalsIgnoreCase(IOO0.I1_l("\u5ecf\u5eef\u5ef1\u5e9b", 24193))) {
                return "";
            }
            for (int i = 0; i < IlO.length; ++i) {
                if (!IlO[i].equalsIgnoreCase(string)) continue;
                return IlO[i];
            }
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        return IOO0.IIII(calendar.get(2) + 1, calendar.get(5));
    }

    void III1(long l) {
        if (l < this.I1oO) {
            return;
        }
        this.I1oO = l + 30000L;
        String string = IOO0.IIl(l);
        if (this.lI_I != null && this.lI_I.equals(string)) {
            return;
        }
        String string2 = this.lI_I;
        this.lI_I = string;
        lI_ = string;
        this.var_IO0_IIlI.IIIl.II(string2 == null ? "" : string2, string, string2 != null);
    }

    int II__(int n) {
        int n2 = 0;
        IOol iOol = this.var_IO0_IIlI.var_IOol_II;
        for (int i = 0; i < iOol.var_IO0l_arr_III.length; ++i) {
            if (iOol.var_IO0l_arr_III[i].II1_() || iOol.var_IO0l_arr_III[i].I1l != n) continue;
            n2 += iOol.var_IO0l_arr_III[i].lo0I;
        }
        return n2;
    }

    void II_l(int n, int n2) {
        IOol iOol = this.var_IO0_IIlI.var_IOol_II;
        for (int i = 0; i < iOol.var_IO0l_arr_III.length && n2 > 0; ++i) {
            IO0l iO0l = iOol.var_IO0l_arr_III[i];
            if (iO0l.II1_() || iO0l.I1l != n) continue;
            if (iO0l.lo0I > n2) {
                iO0l.lo0I -= n2;
                n2 = 0;
                continue;
            }
            n2 -= iO0l.lo0I;
            iOol.var_IO0l_arr_III[i] = new IO0l();
        }
    }

    void ll1() {
        boolean bl = this.Il_();
        this.var_IO0_IIlI.var_IO00_II.IIII(21, 8401, IOO0.I1_l("\u5ec9\u5ec1\u5ed3\u5eb2\u5e92\u5f6b\u5f5e\u5f3f\u5f17\u5fb8\u5fc1\u5fa3\u5f9c\u6034\u6045\u7ee9\u607b\u60c4\u60ce\u60ee\u608e\u61ff\u610b\u613e\u6101\u7f4b\u6187\u61a1\u618c\u62fe\u6253\u6262\u6206\u626c\u62bf\u62dd\u62b5\u6293\u633b\u6359\u6336\u6316\u63a8", 24193), new String[]{IOO0.I1_l("\u5ecd\u5e40\u5ed2\u5ed4\u5e95\u41c5\u5f4b\u5f7a\u5f12\u4121\u5fd8\u5ff6\u5f98\u6075\u6039\u6023\u6004\u7e67", 24193), IOO0.I1_l("\u5ecd\u5e40\u5ed2\u5ed4\u5e85\u5f2d\u5f0b\u5f7a\u5f11\u4141\u5fc7\u5ff6\u5f9e\u7ead\u605c\u6058\u601c\u60f1\u608f\u60bf\u6098\u7ffb", 24193), bl ? IOO0.I1_l("\u5f2e\u407b\u5edc\u5ed4\u5e90\u5f75\u41fe\u5f34\u5f59\u5fe8\u5fdf\u5f3b", 24193) : IOO0.I1_l("\u5f2e\u407b\u5edc\u5efe\u5e9f\u41ad\u5f55\u5f3d\u5f73\u5fad\u5f87\u5ff6\u5f9b\u6073\u7efe\u6031", 24193)});
    }

    private boolean Il_() {
        IOol iOol = this.var_IO0_IIlI.var_IOol_II;
        int n = IO0I.IIol();
        if (iOol._1O0 != n) {
            iOol._1O0 = n;
            iOol._1Oo = 1;
        }
        return iOol._1Oo > 0;
    }

    private String IIIo(int n) {
        int n2 = this.II__(901);
        int n3 = this.II__(1355);
        int n4 = this.II__(1354);
        return IOO0.I1_l("\u5ec9\u4079\u5ecf\u5efe\u5eb6\u41a5\u5f54\u5f7a\u5f34\u5ff9\u5f97\u5f87\u5f80\u7ee3", 24193) + (n > 1 ? IOO0.I1_l("\u5ea1\u5ed8", 24193) + n : "") + IOO0.I1_l("\u5e8b\u5eeb\u4006\u5eb1\u5edd\u5f7e\u5fdb\u5f34\u5f59\u5fec\u5fd6\u5faf\u5fd5", 24193) + n2 + IOO0.I1_l("\u5eae", 24193) + 99 * n + IOO0.I1_l("\u5e8b\u5ee7\u5ed6\u4011\u5edd\u5e0d\u41ca\u5f34\u5f1e\u5fb8\u5fdc\u416f\u5f9a\u6034\u6047\u6020\u6090\u60f9\u608f\u60ac\u6000\u612c", 24193) + n3 + IOO0.I1_l("\u5eae", 24193) + n + IOO0.I1_l("\u5e8b\u5ee7\u5ed6\u407b\u5e84\u5f3c\u5f4f\u5f28\u5f18\u5ff6\u5fd0\u5ff6\u5f81\u6066\u60de\u6072\u6039\u60f1\u60c3\u60a2\u6082\u617b\u614e\u612f\u6107\u61a8", 24193) + n4 + IOO0.I1_l("\u5eae", 24193) + 3 * n;
    }

    private boolean II0l(int n) {
        return this.II__(901) >= 99 * n && this.II__(1355) >= n && this.II__(1354) >= 3 * n;
    }

    boolean IIl_(int n, int n2) {
        if (n == 8401) {
            if (n2 == 0 || n2 == 1) {
                int n3;
                int n4 = n3 = n2 == 0 ? 1 : 10;
                if (!this.II0l(n3)) {
                    this.var_IO0_IIlI.var_IO00_II.IIII(21, 0, this.IIIo(n3), new String[]{IOO0.I1_l("\u5ed5\u404b\u5e9f\u5ebd\u5e95\u41cd\u5f52", 24193)});
                } else {
                    this.var_IO0_IIlI.var_IO00_II.IIII(21, n3 == 1 ? 8402 : 8403, this.IIIo(n3), new String[]{IOO0.I1_l("\u5f91\u4073\u5ed1\u5eb9\u5edd\u5fe1", 24193), IOO0.I1_l("\u5ed5\u404b\u5e9f\u5ebd\u5e95\u41cd\u5f52", 24193)});
                }
            } else if (n2 == 2) {
                this.ll1I();
            }
            return true;
        }
        if (n == 8402 || n == 8403) {
            if (n2 == 0) {
                this.IlOI(n == 8402 ? 1 : 10);
            }
            return true;
        }
        return false;
    }

    private void IlOI(int n) {
        IOol iOol = this.var_IO0_IIlI.var_IOol_II;
        if (!this.II0l(n)) {
            this.var_IO0_IIlI.IIIl.IIol(IOO0.I1_l("\u5ec3\u4001\u5ed1\u5efe\u5e96\u5f74\u5fcf\u5f34\u5f1e\u5fb8\u5ea6\u4131\u5fd5\u607a\u6054\u6027\u6008\u607a\u60c1\u60ee\u6081\u6165\u7fec\u613f\u6149\u6099\u7f64\u61e6\u6191\u7ca5\u624c\u6262\u6229\u7c59\u62ef\u629e\u6296\u7c45\u6374\u631a\u6314\u6319\u63b7\u63e7\u63a0\u7d03\u6432", 24193));
            return;
        }
        if (this.var_IO0_IIlI.IIIl.IlII() < n) {
            this.var_IO0_IIlI.IIIl.IIol(IOO0.I1_l("\u5ec9\u5e40\u5ed1\u5eb6\u5edd\u5f68\u5f49\u5f3b\u5f17\u5fff\u5f97\u5fbd\u5f9d\u60e0\u605d\u6035\u6051\u6181\u7e48\u60ee\u608e\u6164\u7ffc\u616a\u611d\u61fa\u7f76\u61a8\u6182", 24193));
            return;
        }
        this.II_l(901, 99 * n);
        this.II_l(1355, n);
        this.II_l(1354, 3 * n);
        for (int i = 0; i < n; ++i) {
            IO0l iO0l = new IO0l(1356, 1);
            iO0l.III(87, 1);
            iO0l.III(93, 35);
            iO0l.III(174, 2025);
            this.var_IO0_IIlI.IIIl.III0(iO0l);
        }
        this.var_IO0_IIlI.IIIl.l1_l();
        this.var_IO0_IIlI.IIIl.IIol(IOO0.I1_l("\u5ec3\u4001\u5ed1\u5efe\u5e93\u5f74\u4196\u5f34\u5f59\u5e89\u5e07\u4135\u5f96\u6034\u607b\u7e8b\u6001\u60b0\u60e4\u7e77\u6082\u612c\u6166\u612b\u6149\u61d9\u61d2\u7f31", 24193) + (n > 1 ? IOO0.I1_l("\u5ea1\u5ed8", 24193) + n : ""));
        this.var_IO0_IIlI.I__O();
    }

    private void ll1I() {
        IOol iOol = this.var_IO0_IIlI.var_IOol_II;
        boolean bl = this.Il_();
        if (!bl && iOol.lOoO < 50) {
            this.var_IO0_IIlI.IIIl.IIol(IOO0.I1_l("\u5eca\u5ec8\u5e4b\u5eb0\u5e9a\u5f3c\u5e2a\u41bd\u5f59\u5fad\u5f87\u5ff6\u5f9b\u6073\u7efe\u6031\u6051\u6181\u7e6c\u60ee\u615d\u7fd7\u6148\u616b", 24193));
            return;
        }
        if (this.var_IO0_IIlI.IIIl.IlII() <= 0) {
            this.var_IO0_IIlI.IIIl.IIol(IOO0.I1_l("\u5ed5\u5e5a\u5ed6\u5efe\u5fec\u41cf\u5f1b\u5e4b\u41de\u5fe1\u5f96\u5ff6\u5fbd\u60f7\u604a\u6072\u6015\u7e5d\u60c1\u60ee\u61fc\u7fdf\u610b\u6138\u7fba\u61e1\u6187\u6076\u7f3e\u6267\u6203\u622e\u7cc0\u62e9\u62b1", 24193));
            return;
        }
        if (bl) {
            --iOol._1Oo;
        } else {
            iOol.lOoO -= 50;
        }
        int n = I_lI[this.IIl.nextInt(I_lI.length)];
        int n2 = n == 1731 || n == 1732 ? 30 : 15;
        IO0l iO0l = new IO0l(n, 1);
        iO0l.III(50, 5 + this.IIl.nextInt(n2 - 4));
        iO0l.III(77, 5 + this.IIl.nextInt(n2 - 4));
        iO0l.III(103, 5 + this.IIl.nextInt(n2 - 4));
        this.var_IO0_IIlI.IIIl.III0(iO0l);
        this.var_IO0_IIlI.IIIl.l1_l();
        this.var_IO0_IIlI.IIIl.l1_();
        IOO.III iII = IOO.IOO$III_II(n);
        this.var_IO0_IIlI.IIIl.IIol((bl ? IOO0.I1_l("\u5f2e\u407b\u5edc\u5efe\u5e90\u5f75\u41fe\u5f34\u5f59\u5fe8\u5fdf\u5f3b\u5fd5\u6060\u605b\u60b2\u601f\u60f8\u608f\u60ad\u6019\u6162\u614c\u616b", 24193) : IOO0.I1_l("\u5f2e\u407b\u5edc\u5efe\u5e89\u5f74\u5fdb\u5f34\u5f11\u5fb8\u5fd4\u5f22\u5f9b\u6073\u6013\u607f\u6044\u60a0\u608f\u60a0\u608a\u7fc1\u6148", 24193)) + IOO0.I1_l("\u5e8b\u5ee2\u401e\u5eb0\u5edd\u5f72\u5f53\u41f7\u5f17\u5fb8\u5ea6\u5e66\u4116\u6077\u6009\u6072", 24193) + (iII == null ? "" + n : iII.II1o));
        this.var_IO0_IIlI.I__O();
    }

    static {
        I_lI = new int[]{1702, 1721, 1724, 1727, 1731, 1732};
    }

    private static /* synthetic */ String I1_l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

