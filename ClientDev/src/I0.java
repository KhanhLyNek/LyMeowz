package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

final class I0 {
    static final int __I0 = 146;
    static final int __Io = 8601;
    static final int __l = 8602;
    static final int __lI = 8603;
    private static final long I0I_ = 900000L;
    private final IO0 II1O;
    private final IOo_ II1_;
    private final IOoI III1;
    private boolean lIIO;
    private boolean lII0;
    private boolean lIIo;
    private long I0IO;
    private long I0I0;
    private long I0Io;
    private long I0l;
    private long I0lI;
    private IO_I.III IIIl;

    I0(IO0 iO0, IOo_ iOo_, IOoI iOoI) {
        this.II1O = iO0;
        this.II1_ = iOo_;
        this.III1 = iOoI;
    }

    boolean Il1I() {
        return this.lIIO;
    }

    static boolean III0(long l) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        return calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6);
    }

    boolean IloO() {
        IOol iOol = this.II1O.var_IOol_II;
        return iOol.lII && !I0.III0(iOol.IOo1);
    }

    void l1oO() {
        IOol iOol = this.II1O.var_IOol_II;
        if (iOol.lII && !I0.III0(iOol.IOo1)) {
            this.II1O.IIIl.IIol(I0.I10l("\u6b5b\u6bd1\u6b28\u6b50\u6be8\u7519\u6bbd\u6bcc\u6c7f\u6c42\u72ee\u6c06\u6ca7\u6ccb\u6c2d\u6c8b\u6d23\u6d69\u6d20\u6d12\u6d16\u6df0\u6d9d\u6ccd\u7338\u6e3a\u6e4a\u70b5\u6e57\u6ef2\u7050\u6eba\u6e94", 27411));
            return;
        }
        if (iOol.lII) {
            iOol.lII = false;
        }
        this.II1O.var_IO00_II.IIII(18, 8601, I0.I10l("\u6a03\u6bd0\u6b28\u6b50\u6bec\u6bc6\u6b20\u6b82\u6c63\u6c0a\u6c25\u6c88\u6ca7\u6cc2\u7260\u6c91\u6d23\u6d4a\u6d28\u73a7\u6d0a\u6dbe\u6dcf\u6db5\u6d11\u6e74\u6e5e\u6e78\u6e14\u7071\u6ed4\u6efa\u6edd\u6f3c\u6f3b\u6e40\u71ce\u6fe7\u6f8d\u6f81\u6f8a\u702a\u707f\u71f8\u71c6\u70e8\u70c2\u70e4\u70b3\u71f6\u7142\u71b4\u7133\u718a\u7197\u70ac\u7128\u71da\u7275\u72d8\u7277\u721b\u6c4c\u72c0\u72f3\u7286\u73fb\u735e\u736f\u731f\u73f8\u6d5b\u73eb\u738e\u6ae6\u7408\u7556\u6abf\u74ec\u7484\u74af\u6a33\u7575\u7500\u7551\u7539\u74cd\u6b41\u75d2\u75f6\u75d9\u7675\u68ee\u7622\u7655\u76ff\u6808\u76f2\u77e0\u69b1\u7746\u776e\u770a\u77e5\u77ca\u77a4\u77c9\u78e9\u7844\u784c\u7806\u7877\u7883\u78b1\u6608\u7963\u793f\u7953\u67fc\u7912\u79f3\u799a\u79af\u790c\u7a37\u7b27\u649e\u7a17\u7afb\u7a92\u7aa7\u7a10\u7b2f\u7b42\u7bbf\u7b02\u7bec\u7b8a\u7bbd\u7b80\u7c66\u7c4b\u7c65\u7c0f\u7ceb\u7c56\u7caf\u7c87\u7cdf\u7c0f\u7ddc\u7d25\u7d55\u7db4\u7d97\u7dd2\u7ce7\u60c7\u7e5c\u7e74\u7e03\u7efa\u7e42\u7ef0\u7e99\u61d5\u7f44\u7f6c\u7f03\u6125\u7fc7\u7fe8\u7f8c\u806e\u80d1\u802a\u8004\u80a2\u80d1\u80a8\u9e7c\u8097\u813d\u8158\u9f9e\u8170\u81da\u81d7\u81b9\u81d6\u8276\u82c7\u8273\u8211\u82f9\u9c1f\u82ac\u82ce\u836e\u8344\u9de4\u8304\u83a9\u83c5\u83b2\u9d37\u846b\u8404\u8437\u848e\u84ec\u8480\u84d7\u9a71\u8493\u853c\u8550\u8532\u858d\u85f6\u85d0\u85e9", 27411), new String[]{I0.I10l("\u6a03\u75e1\u6b3f\u6b17\u6baf\u6b53", 27411), I0.I10l("\u6b47\u75d9\u6b71\u6b13\u6be7\u757f\u6ba4", 27411)});
    }

    boolean IIl_(int n, int n2) {
        if (n == 8601) {
            if (n2 == 0) {
                this.l1o0();
            }
            return true;
        }
        if (n == 8602) {
            if (n2 == 0) {
                this.lIIO = false;
                this.II1O.III_(46, 300 + (int)(Math.random() * 100.0), 408);
            }
            return true;
        }
        if (n == 8603) {
            this.l_();
            return true;
        }
        return false;
    }

    private void l1o0() {
        if (this.lIIO) {
            return;
        }
        if (I0Io.II(146) == null) {
            this.II1O.IIIl.IIol(I0.I10l("\u6b58\u6b5a\u6ba5\u6b1e\u6be8\u6b8e\u6bb9\u6b84\u72c8\u6c0a\u6d58\u72d7\u6ce9\u6c86\u6cab\u6d45\u6d6a\u6d02\u6d2f\u6d80\u6d06", 27411));
            return;
        }
        if (!this.II1O.II01(146)) {
            return;
        }
        this.lIIO = true;
        this.lII0 = false;
        this.lIIo = false;
        this.IIIl = null;
        this.I0I0 = 0L;
        this.I0Io = 0L;
        this.I0l = 0L;
        this.I0IO = System.currentTimeMillis() + 900000L;
        this.II1_.II(new IO0o(-65).IIII(this.II1O.var_IOol_II.I1l).II(1));
        this.II1O.III_(146, 70, 336);
    }

    int II1o(int n) {
        long l = Math.max(1L, (long)this.II1O.var_IOol_II.Il1I() / 2L);
        return (int)Math.min(Integer.MAX_VALUE, n == 26 ? l * 3L / 2L : (n == 25 ? l * 2L : l));
    }

    int II_(int n) {
        long l = Math.max(1L, (long)this.II1O.var_IOol_II.Illo() / 2L);
        return (int)Math.min(Integer.MAX_VALUE, n == 26 ? l * 3L / 2L : (n == 25 ? l * 2L : l));
    }

    boolean Il10() {
        if (!this.lIIo) {
            return false;
        }
        IOoI.III[] iIIArray = this.II1O.IIIl.IOoI$III_arr_II();
        int n = 0;
        for (int i = 0; i < iIIArray.length; ++i) {
            if (iIIArray[i].III != null) continue;
            ++n;
            if (iIIArray[i].IoOo) continue;
            return false;
        }
        return n > 0;
    }

    void l1oo() {
        this.lIIo = true;
    }

    void III1(long l) {
        IOol iOol = this.II1O.var_IOol_II;
        if (iOol == null) {
            return;
        }
        if (!this.lIIO) {
            if (iOol.lOlo != 146 || iOol.lII) {
                // empty if block
            }
            return;
        }
        if (iOol.lOlo != 146) {
            this.II0();
            return;
        }
        if (l >= this.I0IO) {
            this.II1O.IIIl.IIol(I0.I10l("\u6b5b\u758d\u6b25\u6b50\u6bfb\u6bc6\u7510\u6b85\u6c2b\u6c4d\u6c20\u6c09\u6ce9\u6c87", 27411));
            this.II0();
            this.II1O.var_IO00_II.II_o(iOol.lOlI + 21, -1);
            return;
        }
        if (iOol.lII && this.I0l != 0L) {
            if (iOol.llIl > 0 && l - this.I0l > 3500L && l - this.I0lI > 10000L) {
                this.I0lI = l;
                this.II1O.var_IO00_II.IIII(18, 8602, I0.I10l("\u6a03\u75f1\u6b71\u6b04\u6b7b\u6bc7\u6bed\u6afd\u6dbb\u6c4b\u6c69\u6c0b\u722a\u6cd3\u6ce5\u6c92\u73c2", 27411), new String[]{I0.I10l("\u6a03\u75e1\u6b3f\u6b17\u6baf\u6b53", 27411), I0.I10l("\u6b47\u75d9\u6b71\u6b13\u6be7\u757f\u6ba4", 27411)});
            }
            return;
        }
        IO_I iO_I = this.II1O.IIIl.var_IO_I_II;
        if (this.IIIl == null) {
            if (this.lIIo && iOol.llIl > 0 && this.Il10()) {
                long l2 = Math.min((long)iOol.Il1I(), 200000000L);
                long l3 = Math.min((long)iOol.Illo() * 5L, Integer.MAX_VALUE);
                this.IIIl = iO_I.II((int)l2, (int)l3, Math.min(1000, iOol.I1 + 150));
                this.I0I0 = l;
            }
            return;
        }
        if (this.IIIl.IoI_) {
            if (this.I0Io != 0L && l - this.I0Io >= 3000L) {
                this.I0Io = 0L;
                iO_I.IIlo(this.IIIl);
                iOol.lII = true;
                iOol.IOo1 = System.currentTimeMillis();
                this.I0l = l;
                this.I0IO = l + 60000L;
                iO_I.IIlO(this.IIIl);
                this.II1O.IIIl.l1OO();
                this.II1O.I__O();
            }
            return;
        }
        if (!this.lII0) {
            if (l - this.I0I0 >= 5000L && this.IIIl.status >= 3) {
                this.lII0 = true;
                IOoI.III[] iIIArray = this.II1O.IIIl.IOoI$III_arr_II();
                for (int i = 0; i < iIIArray.length; ++i) {
                    IOoI.III iII = iIIArray[i];
                    if (iII.III != null) continue;
                    iII.lOlO = iII.llIl = this.II1o(iII.l0o1);
                    iII._l__ = iII.llIl;
                    iII._l_O = this.II_(iII.l0o1);
                    iII.IoOo = false;
                    iII.Ioo_ = false;
                    iII.IooO = false;
                    this.II1_.II(new IO0o(-13).II(iII._l_1).II(iII.l0o1).II(0).IIII(iII.llIl));
                }
                iO_I.void_II(this.IIIl, I0.I10l("\u6b50\u6bd3\u6b32\u6b50\u6bec\u6bc1\u6ba3\u6bcc\u6c68\u72cd\u6c28\u6c48\u6cf3\u6cc7\u6ce5\u6c8c\u6de0\u6d5b\u6d61\u6d14\u6d16\u6d74\u6dc8\u6dfc\u6d9f\u6e73\u70fe\u6e2c\u6e57\u6ef8\u6e46\u6efa", 27411));
            }
            return;
        }
        if (this.IIIl.IoI1) {
            if (this.Il10() && iOol.llIl > 0) {
                iO_I.IIl_(this.IIIl);
            }
            return;
        }
        if (iOol.llIl > 0 && this.IIIl.lllI >= iOol.llIl) {
            this.II_O(this.IIIl);
        }
    }

    void II_O(IO_I.III iII) {
        if (iII.IoI_) {
            return;
        }
        iII.IoI_ = true;
        iII.IoI1 = true;
        this.I0Io = System.currentTimeMillis();
        this.II1O.IIIl.var_IO_I_II.IIl0(iII);
    }

    private void II0() {
        if (this.IIIl != null) {
            this.II1O.IIIl.var_IO_I_II.IIlO(this.IIIl);
        }
        this.IIIl = null;
        this.lIIO = false;
        this.lII0 = false;
        this.lIIo = false;
    }

    void ll0O() {
        this.II1O.var_IO00_II.IIII(18, 8603, I0.I10l("\u6b5b\u6bd1\u6b28\u6b50\u6bed\u6b42\u6ba3\u6b84\u6c2b\u6c5e\u6d60\u6c06\u6cef\u6c88\u6ceb\u6c8a\u6d64\u6d4a\u6d24\u6d40\u6d0b\u6dff\u6d9d\u6db2\u6d08\u6e73\u6e19\u6f49\u6e94\u6e9c\u6ef8\u6ebd\u6ed3\u6f71\u6f59\u6ee0\u6f0e\u6fae\u6ebc\u712b\u6fcb\u7079\u6ec0\u702b\u7047\u70ee\u6e04\u70e4\u708b\u6fad\u714f\u7160\u704e\u719c\u71e8\u719d\u71d1\u71ae\u7271\u72cc\u723e\u7256\u7384\u7304\u6c30\u7291\u7331\u7342\u6d9c\u7307\u73a3\u7382\u73e5\u7389\u7461\u6af5\u7467\u7412\u7468\u74ae\u7497\u7483\u7521\u7553\u6b82\u757e\u751e\u75f4\u75d4\u75fa\u7594\u7671\u7617\u7623\u68a4\u76fa\u76d4\u76f2\u7685\u7778\u775a\u699f\u770e\u77a2\u77a1\u779e\u7781\u787d\u66f6\u7825\u7845\u78a3\u78f7\u79c1\u788f\u7967\u793f\u7952\u67ac\u791f\u79bb\u79c9\u79b0\u7912\u7a62\u7a16\u7a21\u7a1c\u6434\u7adc\u7af1\u7a84\u7b67\u65c9\u7b34\u7b4b", 27411), new String[]{I0.I10l("\u6a03\u75e1\u6b3f\u6b17\u6baf\u6b53", 27411)});
    }

    private void l_() {
        IOol iOol = this.II1O.var_IOol_II;
        if (!this.IloO()) {
            return;
        }
        if (!this.II1O.IIIl.Il00()) {
            this.II1O.IIIl.IIol(I0.I10l("\u6b5b\u6bd2\u6b3f\u6b18\u6baf\u6bda\u6bbf\u6b8d\u6c65\u6c4d\u6c69\u6d79\u6c64\u6c86\u6dd4\u7243\u6d7a\u6d0e\u6d61\u6d03\u73d8\u6df0\u6d9d\u6db1\u7322\u6e6e\u6e19\u6eac\u6e57\u6ee2\u6ec7\u7005\u6e9d\u6f75\u6f11\u6f24\u6f1d\u6fe1\u6fc3\u6fab\u6fcb\u7062\u70c9\u7026\u700f\u70a6\u70d1\u70b6\u7082\u716c\u7146", 27411));
            return;
        }
        int n = iOol.IO_l < 1000000000L ? 727 : 728;
        IO0l iO0l = new IO0l(n, 1);
        iO0l.III(30, 0).III(93, 1);
        this.II1O.IIIl.III0(iO0l);
        this.II1O.IIIl.l1_l();
        iOol.lII = false;
        this.II1O.I__O();
        IOO.III iII = IOO.IOO$III_II(n);
        this.II1O.IIIl.IIol(I0.I10l("\u6b51\u7593\u6b3f\u6b50\u6be1\u6bc6\u7560\u6b82\u6c2b\u6d3b\u6df9\u728b\u6ce4\u6c86", 27411) + (iII == null ? I0.I10l("\u6b65\u759f\u6b25\u6b50\u6bff\u6bc6\u7564\u6b81", 27411) : iII.II1o));
    }

    private static /* synthetic */ String I10l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

