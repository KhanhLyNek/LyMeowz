package main;

/*
 * Decompiled with CFR 0.152.
 */
import nrolite.DataDownloader;

public final class IOOl
extends IO1_ {
    private int I_00 = 0;
    private volatile boolean Io10 = false;
    private final boolean Io1o;

    public IOOl() {
        this(false);
    }

    public IOOl(boolean bl) {
        this.Io1o = bl;
        this.I_1o();
    }

    private void IIOo() {
        if (II.var_I_0l_II == null) {
            II.var_I_0l_II = new I_0l();
        }
        II.var_I_0l_II.I0l_();
    }

    public void I_1o() {
        DataDownloader.startDownload(new IOO1(this));
    }

    @Override
    public void void_IIlO() {
        ++this.I_00;
        if (this.Io10) {
            IOI.Ioo();
            new IOI().I0l_();
            return;
        }
        if (DataDownloader.status == -1) {
            if (this.Io1o) {
                int n = Math.min(II.var_int_IIl - 20, 260);
                int n2 = 135;
                int n3 = (II.var_int_IIlI - n2) / 2;
                int n4 = II.var_int_IIl / 2;
                if (II.var_boolean_IIIo && II.II(n4 + 5, n3 + 98, 80, 22)) {
                    II.var_boolean_IIIo = false;
                    this.IIOo();
                } else if (II.var_boolean_IIIo && II.II(n4 - 85, n3 + 98, 80, 22) || II.var_boolean_arr_II[5]) {
                    II.var_boolean_IIIo = false;
                    II.var_boolean_arr_II[5] = false;
                    this.I_1o();
                } else if (II.var_boolean_arr_II[13]) {
                    II.var_boolean_arr_II[13] = false;
                    this.IIOo();
                }
            } else if (II.var_boolean_IIIo || II.var_boolean_arr_II[5]) {
                II.var_boolean_IIIo = false;
                II.var_boolean_arr_II[5] = false;
                this.I_1o();
            }
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        String string;
        iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI + 1);
        iO1l.Illl(659229);
        iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
        int n = Math.min(II.var_int_IIl - 20, 260);
        int n2 = 135;
        int n3 = (II.var_int_IIl - n) / 2;
        int n4 = (II.var_int_IIlI - n2) / 2;
        iO1l.Illl(0x131D33);
        iO1l.III_(n3, n4, n, n2);
        iO1l.Illl(2768486);
        iO1l.III1(n3, n4, n, n2);
        iO1l.Illl(1713988);
        iO1l.III1(n3 + 1, n4 + 1, n - 2, n2 - 2);
        String string2 = IOOl.I11o("\u46bb\u4753\u59ff\u4711\u4751\u47c2\u597d\u4780\u47aa\u482c\u4864\u480c\u482f\u48c4\u48ee\u4888\u48a0", 18165);
        if (IO1I.IIIl != null) {
            IO1I.IIIl.II(iO1l, string2, II.var_int_IIl / 2, n4 + 10, 2);
        }
        int n5 = DataDownloader.status;
        int n6 = 0;
        int n7 = 15381256;
        if (n5 == 1) {
            string = IOOl.I11o("\u47e5\u4775\u475d\u4735\u4751\u47fb\u5910\u47ba\u47cd\u4862\u56fa\u4823", 18165) + this.java_lang_String_IIlO();
            n6 = 0;
        } else if (n5 == 2) {
            n6 = DataDownloader.percent;
            string = IOOl.I11o("\u47e5\u4775\u475d\u4735\u4751\u47e4\u590c\u47a7\u47d7\u482c", 18165) + n6 + IOOl.I11o("\u46d0", 18165);
            n7 = 16347926;
        } else if (n5 == 3) {
            n6 = DataDownloader.unzipPercent;
            string = IOOl.I11o("\u47e5\u4775\u475d\u4735\u4751\u47f7\u47c6\u596d\u4784\u482c\u4845\u48a3\u4807\u48b2\u4887", 18165) + n6 + IOOl.I11o("\u46d0", 18165);
            n7 = 2278750;
        } else if (n5 == 4) {
            n6 = 100;
            string = IOOl.I11o("\u46bd\u477b\u47d3\u473c\u4751\u47e4\u590a\u47ba\u47cc\u482c\u493b\u482b\u4807\u48ef\u4887\u48b0\u4805\u496b\u4903\u4925\u4900\u49ed\u49fa\u4990\u49f3\u49d2", 18165);
            n7 = 1096065;
        } else {
            string = IOOl.I11o("\u46b9\u59c3\u475a\u4772\u4705\u5933\u47c6\u47ee\u4789\u56e3\u480b\u4826\u4800\u564f\u48d2\u48e7", 18165);
            n7 = 0xEF4444;
        }
        if (IO1I.IIII != null) {
            IO1I.IIII.II(iO1l, string, II.var_int_IIl / 2, n4 + 32, 2);
        }
        int n8 = n - 30;
        int n9 = 14;
        int n10 = n3 + 15;
        int n11 = n4 + 54;
        iO1l.Illl(988970);
        iO1l.III_(n10, n11, n8, n9);
        iO1l.Illl(3359061);
        iO1l.III1(n10, n11, n8, n9);
        if (n6 > 0) {
            int n12 = n8 * n6 / 100;
            if (n12 > n8) {
                n12 = n8;
            }
            iO1l.Illl(n7);
            iO1l.III_(n10 + 1, n11 + 1, n12 - 1, n9 - 2);
        }
        if (n5 == 2) {
            long l = DataDownloader.downloadedBytes * 10L / 0x100000L;
            long l2 = DataDownloader.totalBytes * 10L / 0x100000L;
            String string3 = l / 10L + IOOl.I11o("\u46db", 18165) + l % 10L + IOOl.I11o("\u46d5\u4759\u4771\u4772\u475e\u47b0", 18165) + l2 / 10L + IOOl.I11o("\u46db", 18165) + l2 % 10L + IOOl.I11o("\u46d5\u4759\u4771\u4772\u4759", 18165) + DataDownloader.speedKBps + IOOl.I11o("\u46d5\u475f\u4771\u477d\u4702\u47b9", 18165);
            if (IO1I.var_IO1I_II1I != null) {
                IO1I.var_IO1I_II1I.II(iO1l, string3, II.var_int_IIl / 2, n4 + 74, 2);
            }
        } else if (n5 == 3) {
            String string4 = DataDownloader.unzipCount + IOOl.I11o("\u46d5\u473b\u4713", 18165) + DataDownloader.unzipTotal + IOOl.I11o("\u46d5\u4760\u59f4\u4722\u4751\u47e4\u47c6\u47a0", 18165);
            if (IO1I.var_IO1I_II1I != null) {
                IO1I.var_IO1I_II1I.II(iO1l, string4, II.var_int_IIl / 2, n4 + 74, 2);
            }
        } else if (n5 == -1 && IO1I.IIl0 != null) {
            IO1I.IIl0.II(iO1l, DataDownloader.errorMessage, II.var_int_IIl / 2, n4 + 74, 2);
        }
        if (n5 == -1) {
            int n13 = 80;
            int n14 = 22;
            int n15 = this.Io1o ? II.var_int_IIl / 2 - 85 : (II.var_int_IIl - n13) / 2;
            int n16 = n4 + 98;
            iO1l.Illl(14251782);
            iO1l.III_(n15, n16, n13, n14);
            iO1l.Illl(16707722);
            iO1l.III1(n15, n16, n13, n14);
            if (IO1I.IIII != null) {
                IO1I.IIII.II(iO1l, IOOl.I11o("\u46a1\u477c\u59de\u4772\u471d\u5931\u47c6", 18165), n15 + n13 / 2, n16 + 5, 2);
            }
            if (this.Io1o) {
                int n17 = II.var_int_IIl / 2 + 5;
                iO1l.Illl(4674921);
                iO1l.III_(n17, n16, n13, n14);
                iO1l.Illl(13358561);
                iO1l.III1(n17, n16, n13, n14);
                if (IO1I.IIII != null) {
                    IO1I.IIII.II(iO1l, IOOl.I11o("\u46a4\u4761\u4752\u472b\u4751\u47fc\u590e\u47a7", 18165), n17 + n13 / 2, n16 + 5, 2);
                }
            }
        } else if (IO1I.IIlO != null) {
            IO1I.IIlO.II(iO1l, IOOl.I11o("\u46a3\u4761\u475a\u4772\u471d\u4762\u47c1\u47a9\u47cd\u486b\u4842\u56a5\u4849\u48e3\u5618\u48b2\u48c5\u496a\u57f2\u492b\u4941\u49ed\u573e\u49d0\u49ba\u49dc\u4a70\u4a52\u4a30\u4a58\u4ae3\u5415\u4abc\u4ada\u4b3d\u4b1c", 18165), II.var_int_IIl / 2, n4 + 104, 2);
        }
    }

    private String java_lang_String_IIlO() {
        int n = this.I_00 / 8 % 4;
        if (n == 1) {
            return IOOl.I11o("\u46db", 18165);
        }
        if (n == 2) {
            return IOOl.I11o("\u46db\u473a", 18165);
        }
        if (n == 3) {
            return IOOl.I11o("\u46db\u473a\u471d", 18165);
        }
        return "";
    }

    static /* synthetic */ boolean II(IOOl iOOl, boolean bl) {
        iOOl.Io10 = bl;
        return iOOl.Io10;
    }

    private static /* synthetic */ String I11o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

