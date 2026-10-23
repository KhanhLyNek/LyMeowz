package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

final class IO0I {
    static final boolean Io_O = true;
    private static final long I1o0 = 3000L;
    private static final long I1oo = 5000L;
    private static final double II = 1.3;
    private static final double III = 0.7;
    private static final int loO0 = 3;
    private static final long I_ = 120000L;
    private static volatile long I_I;
    private final Random IIll = new Random();
    private final long I_II = this.IIll.nextLong() | 1L;
    private final long I_Il = this.IIll.nextLong();
    private long I_I1;
    private long I_I_;
    private long I_IO;
    private boolean Io_0;
    private long I_I0;
    private static final long I_Io = -7046029254386353131L;
    private static final long I_l;
    private long I_lI;
    private long I_ll;
    private long I_l1;
    private long I_l_;
    private int loOo;
    private int lo0;
    private boolean Io_o;
    private long I_lO;

    IO0I() {
    }

    static long IIIl() {
        return System.currentTimeMillis() + I_I;
    }

    static int IIol() {
        return (int)(IO0I.IIIl() / 86400000L);
    }

    static boolean boolean_IIII(long l) {
        long l2 = System.currentTimeMillis();
        I_I = 0L;
        if (l > l2 + 120000L) {
            I_I = l - l2;
            return true;
        }
        return false;
    }

    private long III(long l) {
        return (l + this.I_Il) * -7046029254386353131L ^ this.I_II;
    }

    private long long_IIII(long l) {
        return (l ^ this.I_II) * I_l - this.I_Il;
    }

    synchronized void II(IOol iOol) {
        this.I_I1 = this.III(iOol.Il11);
        this.I_I_ = this.III(iOol.lOoO);
        this.I_IO = this.III(iOol._lO);
        this.Io_0 = true;
        this.I_I0 = 0L;
    }

    private int II(IOol iOol, long l) {
        if (!this.Io_0) {
            return 0;
        }
        long l2 = this.long_IIII(this.I_I1);
        long l3 = this.long_IIII(this.I_I_);
        long l4 = this.long_IIII(this.I_IO);
        if (iOol.Il11 == l2 && (long)iOol.lOoO == l3 && (long)iOol._lO == l4) {
            this.I_I0 = 0L;
            return 0;
        }
        if (this.I_I0 == 0L) {
            this.I_I0 = l;
            return 0;
        }
        if (l - this.I_I0 < 3000L) {
            return 0;
        }
        System.out.println(IO0I.I1_O("\u99d3\u99cb\u99af\u9991\u9a61\u9a7e\u9a62\u9a00\u9aee\u9aeb\u9ad7\u9abe\u9a94\u9b7e\u9b5b\u9b2d\u9b42\u9bb7\u9bc2\u9bbc\u9b91\u9c7d\u9c12\u9c33\u9c19\u9caf\u9cca\u9ca2\u9c85\u9d2b\u9d44\u9d2e\u9d07\u9de6\u9dcf\u9de5\u9d88\u9e76\u9e4d\u9e2f\u9e07\u9e5f\u9efd\u9ed5\u9eb3\u9edb\u9f6a\u9f51\u9f3d\u9f07\u9fac\u9f95\u9fa2\u9f92\ua07c\ua056\ua070", 39304) + iOol.Il11 + IO0I.I1_O("\u99a5\u9999", 39304) + l2 + IO0I.I1_O("\u99a4\u9987\u99a8\u9982\u9a6b\u9a40\u9a62", 39304) + iOol.lOoO + IO0I.I1_O("\u99a5\u9999", 39304) + l3 + IO0I.I1_O("\u99a4\u9987\u99a8\u9982\u9a6b\u9a40\u9a62\u9a19\u9ae1\u9af1\u9ad6\u9afd", 39304) + iOol._lO + IO0I.I1_O("\u99a5\u9999", 39304) + l4);
        iOol.Il11 = l2;
        iOol.lOoO = (int)l3;
        iOol._lO = (int)l4;
        this.I_I0 = 0L;
        return 1;
    }

    boolean Il_l() {
        return this.Io_o;
    }

    private void II(IOoI iOoI, long l, long l2) {
        if (this.I_ll == 0L) {
            this.I_lI = l;
            this.I_ll = l2;
            this.I_l1 = l;
            this.I_l_ = l2;
            return;
        }
        long l3 = (l2 - this.I_ll) / 1000000L;
        long l4 = l - this.I_lI;
        this.I_lI = l;
        this.I_ll = l2;
        if (l4 - l3 > 60000L) {
            I_I -= l4 - l3;
            this.I_l1 = l;
            this.I_l_ = l2;
            return;
        }
        if (l3 - l4 > 60000L) {
            I_I += l3 - l4;
            this.I_l1 = l;
            this.I_l_ = l2;
            return;
        }
        long l5 = (l2 - this.I_l_) / 1000000L;
        if (l5 < 5000L) {
            return;
        }
        long l6 = l - this.I_l1;
        this.I_l1 = l;
        this.I_l_ = l2;
        double d = (double)l6 / (double)l5;
        if (d > 1.3 || d < 0.7) {
            this.lo0 = 0;
            if (++this.loOo >= 3) {
                if (!this.Io_o) {
                    System.out.println(IO0I.I1_O("\u99d3\u99cb\u99af\u9991\u9a61\u9a7e\u9a62\u9a00\u9aee\u9aeb\u9ad7\u9abe\u9a94\u9b7e\u9b5b\u9b2d\u9b42\u9bb7\u9bd8\u9bb2\u9b9c\u9c7a\u9c12\u9c25\u9c11\u9ce1\u9cc9\u9ced\u9c98\u9d64\u9d49\u9d69\u9d0f\u9de6\u9dcb\u9da0\u9dc8\u9e23\u9e56\u9e28\u9e40\u9e13\u9efb\u9e9d", 39304) + d);
                }
                this.Io_o = true;
            }
        } else {
            this.loOo = 0;
            if (this.Io_o && ++this.lo0 >= 2) {
                this.Io_o = false;
                this.lo0 = 0;
            }
        }
        if (this.Io_o && l - this.I_lO > 10000L) {
            this.I_lO = l;
            iOoI.IIol(IO0I.I1_O("\u99d8\u99cf\u9927\u9991\u9a24\u9a4b\u9a2b\u84a6\u9aee\u9abf\u9aca\u9bde\u9a92\u9b7c\u9b1a\u9b2d\u85a9\u9bf4\u9b96\u9bb2\u9b95\u9c7e\u9c57\u9c7f\u9c50\u9cc7\u9c4d\u9cb4\u9ccc\u9d7f\u8385\u9d3d\u9d48\u9de4\u9d52\u9dab\u9d83\u9e23\u9e41\u80a4\u9e40\u9e0b\u9f9d\u9ed3\u9ebb\u9edb\u9f6e\u81e8\u9f3b\u9f5b\u9fb6\u9fd2\u9fb5\u9f9e\ua077\ua011\ua024\ubece\ua0e3\ua08d\ua0a8\ube00\ua164\ua14e\ua168\ua104\ua1ee\ua1ca\ua1e4\ua0f2\ubcbd\ua24f\ua260\ua234\ua216\ua2f4\ua29c\ua2b9\ua216\ua377\ua350\ua377\ua302\ua3fd\ua204\ubd0e\ua39c\ua476\ua41e", 39304));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean II(IOoI iOoI, IOol iOol, boolean bl) {
        long l = System.currentTimeMillis();
        long l2 = System.nanoTime();
        IO0I iO0I = this;
        synchronized (iO0I) {
            if (!bl) {
                this.II(iOoI, l, l2);
            }
            if (!bl && this.II(iOol, l) == 1) {
                iOoI.IIol(IO0I.I1_O("\u99d8\u99cf\u9927\u9991\u9a24\u9a4b\u9a2b\u84a6\u9aee\u9abf\u9aca\u9ab5\u9a9d\u9b62\u9b1a\u9a48\u85ad\u9bfe\u9b96\u9ba3\u9b14\u9c7d\u9c55\u9c7e\u9c1e\u9ce8\u8263\u9cae\u9ccc\u9d69\u838f\u9d3d\u9d48\u9df3\u9dce\u9c75\u8339\u9e6d\u9e45\u9e6d\u9e40\u9f6e\u9e7d\u9e9d\u9eb7\u9e93\u9fee\u9f50\u9f78\u9f07\u9ffe\u8150\u9fb7\u9fdd", 39304));
                iOoI.l1_();
            }
        }
        return !this.Io_o;
    }

    static {
        long l = -7046029254386353131L;
        for (int i = 0; i < 6; ++i) {
            l *= 2L - -7046029254386353131L * l;
        }
        I_l = l;
    }

    private static /* synthetic */ String I1_O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

