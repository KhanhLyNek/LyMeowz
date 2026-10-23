/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IO00 {
    private final IO0 IIl0;
    private final IOo_ IIl0;
    private int l0ol = -1;
    private int _I_I;
    private Vector IIl_ = new Vector();
    private static final int[] I_1 = new int[]{10, 20, 40, 80, 160, 320, 640, 1280};
    private final IO01 II;
    private final I0I0 II;
    private boolean IoOI;
    private final Vector IIlO = new Vector();
    private int _I_l;
    private static final String lI__ = "20 n\u0103m tr\u01b0\u1edbc b\u1ecdn Android s\u00e1t th\u1ee7 \u0111\u00e3 \u0111\u00e1nh b\u1ea1i nh\u00f3m b\u1ea3o v\u1ec7 tr\u00e1i \u0111\u1ea5t c\u1ee7a S\u00f4ngoku v\u00e0 Ca\u0111\u00edc, P\u00f4c\u00f4l\u00f4 ...\nRi\u00eang S\u00f4ngoku v\u00ec b\u1ec7nh tim n\u00ean \u0111\u00e3 ch\u1ebft tr\u01b0\u1edbc \u0111\u00f3 n\u00ean kh\u00f4ng th\u1ec3 tham gia tr\u1eadn \u0111\u00e1nh...\nT\u1eeb \u0111\u00f3 \u0111\u1ebfn nay b\u1ecdn ch\u00fang t\u00e0n ph\u00e1 Tr\u00e1i \u0110\u1ea5t kh\u00f4ng h\u1ec1 th\u01b0\u01a1ng ti\u1ebfc\nCh\u00e1u v\u00e0 m\u1eb9 may m\u1eafn s\u1ed1ng s\u00f3t nh\u1edd l\u1ea9n tr\u1ed1n t\u1ea1i t\u1ea7n h\u1ea7m c\u1ee7a c\u00f4ng ty Capsule...\nCh\u00e1u tuy c\u0169ng l\u00e0 si\u00eau xayda nh\u01b0ng c\u0169ng kh\u00f4ng th\u1ec3 l\u00e0m g\u00ec \u0111\u01b0\u1ee3c b\u1ecdn Android s\u00e1t th\u1ee7...\nCh\u1ec9 c\u00f3 S\u00f4ngoku m\u1edbi c\u00f3 th\u1ec3 \u0111\u00e1nh b\u1ea1i b\u1ecdn ch\u00fang\nm\u1eb9 ch\u00e1u \u0111\u00e3 ch\u1ebf t\u1ea1o th\u00e0nh c\u00f4ng c\u1ed7 m\u00e1y th\u1eddi gian\nv\u00e0 ch\u00e1u quay v\u1ec1 qu\u00e1 kh\u1ee9 \u0111\u1ec3 c\u1ee9u S\u00f4ngoku...\n";
    private static final String lI_O = "\u0110\u1ea1i h\u1ed9i v\u00f5 thu\u1eadt li\u00ean v\u0169 tr\u1ee5\bl\u00e0 n\u01a1i quy t\u1ee5 c\u00e1c cao th\u1ee7 t\u1eeb kh\u1eafp c\u00e1c V\u0169 Tr\u1ee5\b\u0110\u01b0\u1ee3c t\u1ed5 ch\u1ee9c h\u00e0ng ng\u00e0y t\u1ea1i c\u00e1c th\u1eddi \u0111i\u1ec3m nh\u01b0 sau:\nTh\u1ee9 2: 6h, Th\u1ee9 3: 13h, Th\u1ee9 4: 15h\bTh\u1ee9 5: 17h, Th\u1ee9 6: 18h, Th\u1ee9 7: 12h, Ch\u1ee7 Nh\u1eadt 10h\bV\u1edbi c\u00e1c ph\u1ea7n th\u01b0\u1edfng v\u00f4 c\u00f9ng h\u1ea5p d\u1eabn nh\u01b0 sau\nTop 10: 1 phi\u1ebfu gi\u1ea3m gi\u00e1, 1 capsule V\u00e0ng\bTop 1: t\u1eb7ng th\u00eam 1 Ra\u0111a c\u1ea5p 13\bPh\u1ea7n th\u01b0\u1edfng \u0111\u01b0\u1ee3c trao t\u1ea1i v\u0169 tr\u1ee5 c\u1ee7a chi\u1ebfn binh\b\u0110\u1ebfn g\u1eb7p Whis t\u1ea1i v\u0169 tr\u1ee5 c\u1ee7a ng\u01b0\u01a1i \u0111\u1ec3 nh\u1eadn th\u01b0\u1edfng";

    IO00(IO0 iO0, IOo_ iOo_) {
        this.IIl0 = iO0;
        this.IIl0 = iOo_;
        this.II = new IO01(iO0, this);
        this.II = new I0I0(iO0, this);
    }

    private void II(int n, int n2, String string, String[] stringArray) {
        stringArray = KamePetPatch.decorate(stringArray, n, n2);
        this.l0ol = n;
        this._I_I = n2;
        IOO.IIIl iIIl = IOO.II(n);
        IO0o iO0o = new IO0o(32).III(n).II(string).II(stringArray.length);
        for (int i = 0; i < stringArray.length; ++i) {
            iO0o.II(stringArray[i]);
        }
        if (n != 5 && n != 24) {
            iO0o.III(iIIl == null ? 1139 : iIIl.IO_l);
        }
        this.IIl0.II(iO0o);
    }

    void III(int n, int n2, String string, String[] stringArray) {
        this.II(n, n2, string, stringArray);
    }

    void ll0_() {
        this.II(5, 1655, IO00.I1OI("\u7134\u7178\u71c3\u71f9\u719b\u727f\u6cfb\u723b\u7254\u72fe\u6c6b\u72a5\u72d0\u7362\u73dd\u7323\u734c\u73fa\u73df\u7329", 29052), new String[]{IO00.I1OI("\u71bd\u71f4", 29052), IO00.I1OI("\u712d\u71ee\u6f1d\u71b7", 29052), IO00.I1OI("\u713b\u7098\u71d4\u71be", 29052), IO00.I1OI("\u713b\u71f2\u715a\u71a0", 29052), IO00.I1OI("\u712e\u71fa\u71de\u71b8", 29052)});
    }

    private void ll0O() {
        if (this.IIl0.II.IloO()) {
            this.IIl0.II.ll0O();
            return;
        }
        int n = this.IIl0.II._lO_;
        String string = IO00.I1OI("\u706c\u7098\u71d4\u71be\u71d8\u727c\u72cb\u725f\u7200\u6c3e\u72c2\u72db\u7284\u6dfe\u730e\u725c\u6db5\u73e5\u73cd", 29052);
        if (n == 0) {
            this.II(18, 0, IO00.I1OI("\u7131\u71ee\u6f6b\u71b7\u71d8\u7274\u725e\u723c\u6ccb\u72fd\u7292\u72a5\u7298\u6da0\u7340\u732a\u734c\u73df\u734a\u73bc\u73c8\u7457\u6a85\u743c\u7444\u74d3\u6a01\u74b8\u74c0\u748f\u7576\u6b9e\u7535\u755b\u748b\u7558\u75b6\u759f\u7636\u7657\u68f5\u761a\u76b2\u77a0\u7760\u680c\u776d\u770d\u7738\u770a\u77aa\u76b8\u772b", 29052), new String[]{string, IO00.I1OI("\u7132\u71f3\u71d3\u6f1e\u7195\u7237\u7240\u6cb0", 29052), IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u737a\u7325\u6dcb\u73e5\u738a\u7384\u7300\u7468", 29052), IO00.I1OI("\u7128\u71f3\u715b\u71ba\u7190\u7237\u7327\u6cf0\u7201\u7299\u72e6\u72b9\u6c57\u7361\u730e\u7300\u7384\u73e4", 29052)});
        } else if (n == 1) {
            this.II(18, 0, IO00.I1OI("\u7128\u6f70\u719a\u71be\u7191\u6cca\u7216\u720c\u7215\u72f9\u72db\u72a3\u7204\u732f\u735d\u6df0\u734c\u73e7\u73df\u73b0\u6d2f\u7469\u7406\u7431\u6ac9\u74f3\u7482\u74a2\u7419\u7491\u7579\u751d\u7532\u751c\u742a\u7418\u75b1\u75d9\u7636\u766c\u7635\u7619\u76fb\u76c3\u7624\u76cf\u761f\u77ce\u776c\u771f\u6961\u77c7\u77af\u77c7\u786a\u78cf\u782a\u7843\u7993\u7843\u78b9\u78ff\u788a\u67b0\u794c\u797b\u7916\u79ec\u79c1\u6710\u7998\u7a35\u7a42\u7ab3\u7a52\u7af3\u7a52\u7ab6\u7ace\u7b6a\u7b45\u6596\u7b4a\u7be1\u6507\u7ba9\u7bc6\u7c68\u6285\u7c2d\u7c0a\u7ca1\u7cc8\u7d1e\u7cb0\u7cdd\u7d68\u7d5a\u7d7a\u7c68\u633d\u7dce", 29052), new String[]{string, IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u7377\u732c\u7306\u73e2\u73d8\u733d", 29052), IO00.I1OI("\u7128\u71f3\u715b\u71ba\u7190\u7237\u7327\u6cf0\u7201\u7299\u72eb\u72b0\u729a\u7366\u735c\u73b9", 29052)});
        } else {
            this.II(18, 0, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u7190\u72f4\u724f\u7275\u7216\u72f2\u72cb\u72f1\u7284\u7367\u734b\u7322\u734c\u73e8\u7348\u73b0\u73c8\u7440\u6a8b\u743c\u7444\u74cd\u74ca\u7571\u74c0\u7422\u753e\u7549\u752e\u7591\u75f4\u7599\u74c9\u6b3e\u7678\u765d\u7674\u7607\u76fa\u7650\u76a0\u76cf\u761f\u69ee\u776c\u767a\u6935\u77c7\u77e8\u77b3\u786e\u6682\u782a\u7843\u7992\u78c8\u6607\u78b1\u78de\u797a\u678b\u792b\u795a\u79cd\u79d0\u7867\u6715\u7a7b\u7a53\u7a73\u7b63\u642e\u7aba\u7a8c\u7a81\u7b63\u7b0c\u7b39\u65cf\u7bfd\u7b88\u7bbf\u650f\u7c6b\u7c43\u7c63\u7d73\u7c60\u7cce\u7cd8\u7cfe\u7dec\u63df\u7d1b\u7d36\u7d99\u7df5\u7d97\u7cc7\u6332\u7e34\u7e47\u60bf\u7e51\u7e64\u7ec1\u7ea9\u7ecd\u61a9\u7f52\u7f64", 29052), new String[]{string, IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u737a\u7325\u6dcb\u73e5\u738a\u7384\u7300\u7468", 29052), IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u7377\u732c\u7306\u73e2\u73d8\u733d", 29052)});
        }
    }

    private void Il0o(int n) {
        if (this.IIl0.II.IIl_(this._I_I, n)) {
            return;
        }
        int n2 = this.IIl0.II._lO_;
        String[] stringArray = new String[]{IO00.I1OI("\u706c\u6f48\u71d4\u71be\u71d8\u72ea\u723c\u7239\u7201\u72ea\u6c75\u72bf\u72d0\u737b\u6d83\u733d", 29052), IO00.I1OI("\u7137\u71f3\u714e\u71b7\u719f\u721d\u7327\u6c86\u721a\u72f4\u7292\u722c", 29052)};
        String[] stringArray2 = new String[]{IO00.I1OI("\u706c\u6f48\u71d4\u71be\u71d8\u72ea\u723c\u7232\u721d\u72f2\u72dd\u72f1\u73e1\u6daa\u735b", 29052), IO00.I1OI("\u7137\u71f3\u714e\u71b7\u719f\u721d\u7327\u6c86\u721a\u72f4\u7292\u722c", 29052)};
        if (this._I_I == 0) {
            if (n == 0) {
                this.llo0();
                return;
            }
            if (n2 == 0) {
                if (n == 1) {
                    this.III_(18, IO00.I1OI("\u7152\u71b5\u7194", 29052));
                } else if (n == 2) {
                    this.II(18, 2002, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u719b\u72e4\u7216\u7236\u721c\u6c3c\u72d1\u72f1\u729d\u737a\u6dff\u7323\u734c\u73ff\u6d07\u73b9\u73c8\u746b\u7453\u743c\u6aa3\u74ed\u7482\u74fe\u74ea\u74ab\u6bb3\u754d\u757c\u7517\u75ef\u75c0\u6b1f\u7599\u7636\u7643\u688f\u761a\u76b2\u76c5\u76b1\u76cf\u777d\u6990\u776c\u771f\u7689\u77c7\u77af\u77c7\u7834\u7815\u7864\u7810\u666b\u78c2\u78e0\u78b2\u6629\u7974\u791c\u792b\u7912\u7963\u79cc", 29052), stringArray);
                } else if (n == 3) {
                    this.II(18, 2003, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u719b\u72e4\u7216\u7236\u721c\u6c3c\u72d1\u72f1\u729d\u737a\u6dff\u7323\u734c\u73ff\u73c2\u7328\u738b\u746f\u7406\u7554\u6ac1\u74f6\u7482\u74fe\u74ea\u74b1\u6ba1\u7548\u757c\u750f\u75f2\u6b16\u75b6\u7590\u7636\u7641\u7635\u7653\u76e1\u680c\u76f0\u77fe\u76be\u69ce\u772f\u774b\u77fe\u6904\u77b8\u77c7\u786a\u7850\u783d\u66a4\u78ec\u7881\u78b6\u6604\u7897\u793d\u7965\u793a\u7910\u79f0\u79ca\u7923\u79da\u7a35\u7a40\u7b50\u7a1c\u7af6\u7a90\u7afb\u7ade\u7b2d\u7b5f\u65a2\u7b09\u7ba9\u7bc5\u6566\u7b88\u7c6d\u7c04\u7c2e\u62b5\u7ce8\u7c80\u7ccf\u7cb6\u7c07\u7d68", 29052), stringArray2);
                }
            } else if (n2 == 1) {
                if (n == 1) {
                    this.II(18, 2002, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u719b\u72e4\u7216\u7236\u721c\u6c3c\u72d1\u72f1\u729d\u737a\u6dff\u7323\u734c\u73ff\u6d07\u73b9\u73c8\u746b\u7453\u743c\u6aa3\u74ed\u7482\u74fe\u74ea\u74ab\u6bb3\u754d\u757c\u7517\u75ef\u75c0\u6b1f\u7599\u7636\u7643\u688f\u761a\u76b2\u76e8\u76b1\u7685\u7767\u775f\u77b8\u774b\u77f9\u6914\u77e8\u7793\u7905\u784b\u7823\u7843\u78b6\u7891\u78e0\u78ac\u6617\u797e\u791c\u7936\u67ad\u79f0\u7998\u79a7\u799e\u7aef\u7a40", 29052), stringArray);
                } else if (n == 2) {
                    this.II(18, 2003, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u719b\u72e4\u7216\u7236\u721c\u6c3c\u72d1\u72f1\u729d\u737a\u6dff\u7323\u734c\u73ff\u73c2\u7328\u738b\u746f\u7406\u7554\u6ac1\u74f6\u7482\u74fe\u74ea\u74b1\u6ba1\u7548\u757c\u750f\u75f2\u6b16\u75b6\u7590\u7636\u7724\u77e4\u6890\u76f1\u7691\u7689\u768e\u7764\u7744\u773e\u779f\u77a6\u7789\u77ab\u7788\u7868\u7805\u7837\u66de\u78a2\u79b0\u7970\u663c\u789d\u793d\u7954\u6796\u7919\u79b9\u79ce\u7922\u79d6\u7a63\u64ef\u7a3a\u7a52\u7aff\u7ad7\u7b7f\u6433\u7b64\u7b0c\u7b26\u65cb\u7be7\u7bc0\u7be7\u7b8e\u7da4\u7c4a\u7c63\u7d73\u6242\u7c80\u7ccb\u7ddd\u7c93\u7d7b\u7d1b\u7c4b\u63c6\u7df6\u7d97\u7dee\u7dc5\u7e34\u7e40\u60bb\u7e12\u7eb0\u7ec2\u606f\u7e83\u7f64\u7f0b\u7f27\u61be\u7fe1\u7f87\u7fb6\u7f8d\u80fe\u8057", 29052), stringArray2);
                }
            } else if (n == 1) {
                this.II(18, 2002, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u719b\u72e4\u7216\u7236\u721c\u6c3c\u72d1\u72f1\u729d\u737a\u6dff\u7323\u734c\u73ff\u6d07\u73b9\u73c8\u746b\u7453\u743c\u6aa3\u74ed\u7482\u74fe\u74ea\u74ab\u6bb3\u754d\u757c\u7517\u75ef\u75c0\u6b1f\u7599\u7636\u7643\u688f\u761a\u76b2\u76c5\u76b1\u76cf\u777d\u6990\u776c\u771f\u7689\u77c7\u77af\u77c7\u7834\u7815\u7864\u7810\u666b\u78c2\u78e0\u78b2\u6629\u7974\u791c\u792b\u7912\u7963\u79cc", 29052), stringArray);
            } else if (n == 2) {
                this.II(18, 2003, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u719b\u72e4\u7216\u7236\u721c\u6c3c\u72d1\u72f1\u729d\u737a\u6dff\u7323\u734c\u73ff\u6d07\u73b9\u73c8\u746b\u7453\u743c\u6aa3\u74ed\u7482\u74fe\u74ea\u74ab\u6bb3\u754d\u757c\u7517\u75ef\u75c0\u6b1f\u7599\u7636\u7643\u688f\u761a\u76b2\u76e8\u76b1\u7685\u7767\u775f\u77b8\u774b\u77f9\u6914\u77e8\u7793\u7905\u784b\u7823\u7843\u78b6\u7891\u78e0\u78ac\u6617\u797e\u791c\u7936\u67ad\u79f0\u7998\u79a7\u799e\u7aef\u7a40", 29052), stringArray);
            }
        } else if (this._I_I == 2002) {
            if (n == 0) {
                this.IIII(n2 == 1 ? IO00.I1OI("\u7125\u71da\u71f0\u7190\u71aa\u7258", 29052) : IO00.I1OI("\u7137\u71da\u71e8\u7190\u71b6", 29052), false);
            }
        } else if (this._I_I == 2003 && n == 0) {
            this.IIII(n2 == 0 ? IO00.I1OI("\u7137\u71da\u71e8\u7190\u71b6", 29052) : IO00.I1OI("\u7125\u71da\u71f0\u7190\u71aa\u7258", 29052), n2 < 2);
        }
    }

    private void IIII(String string, boolean bl) {
        if (!this.IIl0.IIIl.II.IIIl(string, bl)) {
            this.IIl0.IIIl.IIol(IO00.I1OI("\u706c\u71fa\u71d4\u71be\u71d8\u7274\u72c5\u7275\u721a\u72f4\u7302\u6c0c\u7299\u732f\u7342\u7338\u7315\u6d4c\u73c4\u73e9\u739c\u6aaa\u7456", 29052));
        }
    }

    void ll00() {
        this.II(5, 100, IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u719b\u72e4\u7216\u7236\u721c\u6c3c\u72d1\u72f1\u7293\u7367\u6d81\u7323\u734c\u73f9\u6d77\u73a0\u73c8\u7465\u7447\u742b\u7403\u74a3\u74ca\u6a18\u7489\u74df\u7575\u7555\u75a8\u7515\u75fd\u7586", 29052), new String[]{IO00.I1OI("\u7133\u71d0", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
    }

    void III1(int n, String string) {
        this.III_(n, string);
    }

    void IIII(int n, int n2, String string, String[] stringArray) {
        this.II(n, n2, string, stringArray);
    }

    private void III_(int n, String string) {
        IOO.IIIl iIIl = IOO.II(n);
        this.IIl0.II(new IO0o(38).III(n).II(string).III(iIIl == null ? 1139 : iIIl.IO_l));
    }

    void ll0o() {
        this.II(5, 0, IO00.I1OI("\u7132\u6f42\u71d3\u71f9\u718c\u6cb6\u725f\u7275\u7218\u7273\u7292\u72bc\u6c29\u737b\u730e\u7326\u6d95\u73ab\u73c4\u72ca\u7386\u7460\u7406\u7427\u6aaf\u74a3\u75b3\u6a18\u748e\u7498\u753e\u7555\u6b8b\u755b\u75ee\u75cb\u6b3b\u75d7\u7707\u6882\u7637\u7653\u76f0\u76d8\u6817\u769b\u7704\u776f\u69ed\u7705\u77aa\u77ca\u773b\u77c7\u786b\u7850\u6695\u780d\u78a2\u78cc\u661f\u78ff\u7896\u7972\u678b\u7938\u795a\u79ed\u79d0\u79b6\u798f\u7a35\u7b25\u6486\u7a1b\u7ab1\u7ade\u6416\u7a87\u7b2d\u7b58\u65ea\u7b03\u7ba9\u7bc3\u7baf\u7b12\u7c6b\u7c43\u7c7c", 29052), new String[]{IO00.I1OI("\u7124\u71fe\u71d7\u71d3\u718c\u6cb2\u7242\u7275\u7217\u6c30\u72b8\u729f\u6c29\u7366\u730e\u7319\u6dcd\u73e2", 29052), IO00.I1OI("\u7131\u6f44\u71b0\u7197\u6f21\u727e\u7216\u7201\u6cd5\u72fa", 29052), IO00.I1OI("\u7131\u6f44\u719a\u718f\u71b1\u7247", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
    }

    void llo() {
        IOol iOol = this.IIl0.II;
        IOO.II iI = IOO.II(iOol._lo0);
        if (iI == null) {
            iI = IOO.II(0);
        }
        if (iI == null) {
            return;
        }
        this.IIl0.II(new IO0o(112).II(0).III(iI.lOo0).II(IO00.II(iI, iOol._loo, iOol._1)));
    }

    private static String IIIl(String string, String string2, String string3) {
        int n;
        while ((n = string.indexOf(string2)) >= 0) {
            string = string.substring(0, n) + string3 + string.substring(n + string2.length());
        }
        return string;
    }

    private static String II(IOO.II iI, int n, int n2) {
        String string = iI.II1o;
        if (iI.I1l == 0) {
            return string;
        }
        string = IO00.IIIl(string, IO00.I1OI("\u710c\u71ab\u719f\u71f9\u70e9\u6ca8\u7258\u7275\u7204\u72a2", 29052), IO00.I1OI("\u710c\u71ab", 29052));
        string = IO00.IIIl(string, IO00.I1OI("\u710c\u71a9\u719f\u71f9\u70e9\u6ca8\u7258\u7275\u7204\u72a0", 29052), IO00.I1OI("\u710c\u71aa", 29052));
        string = IO00.IIIl(string, IO00.I1OI("\u710c\u71ab", 29052), String.valueOf(n));
        string = IO00.IIIl(string, IO00.I1OI("\u710c\u71aa", 29052), String.valueOf(n2));
        return string + IO00.I1OI("\u715c\u71c0", 29052) + iI.l00_ + IO00.I1OI("\u715c\u708a\u6f05\u71b7\u71d8", 29052) + iI.l00O + IO00.I1OI("\u7121", 29052);
    }

    private void lloI() {
        Vector vector = IOO.III(this.IIl0.II.lOlI);
        IO0o iO0o = new IO0o(112).II(1).II(1).II(IO00.I1OI("\u7132\u6f42\u71d3\u71f9\u718c\u6cb6\u725f", 29052)).II(vector.size());
        for (int i = 0; i < vector.size(); ++i) {
            IOO.II iI = (IOO.II)vector.elementAt(i);
            String string = IO00.IIIl(IO00.IIIl(IO00.IIIl(IO00.IIIl(iI.II1o, IO00.I1OI("\u710c\u71ab", 29052), String.valueOf(iI.l00_)), IO00.I1OI("\u710c\u71aa", 29052), String.valueOf(iI.l00O)), IO00.I1OI("\u710c\u71a9", 29052), String.valueOf(iI.l000)), IO00.I1OI("\u710c\u71a8", 29052), String.valueOf(iI.l00o));
            iO0o.III(iI.lOo0).II(string);
        }
        this.IIl0.II(iO0o);
    }

    private void llol() {
        IOol iOol = this.IIl0.II;
        Vector vector = IOO.III(iOol.lOlI);
        if (vector.size() == 0) {
            return;
        }
        IOO.II iI = (IOO.II)vector.elementAt((int)(Math.random() * (double)vector.size()));
        iOol._lo0 = iI.I1l;
        iOol._loo = iI.l00_ + (int)(Math.random() * (double)(iI.l00O - iI.l00_ + 1));
        iOol._1 = iI.l000 + (int)(Math.random() * (double)(iI.l00o - iI.l000 + 1));
        String string = IO00.II(iI, iOol._loo, iOol._1);
        int n = string.indexOf(IO00.I1OI("\u715c\u71c0", 29052));
        this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u7196\u727f\u6c9b\u723b\u7254\u7382\u7302\u6c32\u7293\u732f\u7360\u6d94\u7305\u73ab\u73de\u6d68\u7381\u743d\u742c", 29052) + (n >= 0 ? string.substring(0, n) : string));
        this.llo();
        this.IIl0.ll_0();
        this.IIl0.I__O();
    }

    private void II11(boolean bl) {
        IOol iOol = this.IIl0.II;
        if (iOol.IO_l < 10000000000L) {
            this.IIl0.IIIl.IIol(IO00.I1OI("\u7125\u7171\u71cf\u71f9\u719b\u6cb0\u7243\u7275\u7207\u6c7a\u72d1\u72f1\u729d\u6dae\u7340\u7325\u734c\u73ff\u6d7b\u73a0\u73c8\u7473\u744e\u742c\u6aa7\u74f6\u7482\u74f0\u74d0\u74df\u756a\u6bca", 29052));
            return;
        }
        if (bl) {
            if (iOol.lOoO < 100) {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u7193\u727f\u72c2\u723b\u7213\u72b3\u72d1\u7222\u72d0\u721e\u6dc9\u736d\u7302\u73ec\u6d67\u73aa\u73c4\u7427\u7445\u74b7\u740a\u74a3\u74d6\u74a9\u7489\u6a40\u756b\u751d", 29052) + (100 - iOol.lOoO) + IO00.I1OI("\u715c\u71f5\u71dd\u6f14\u719b\u7237\u7258\u6cba\u7215", 29052));
                return;
            }
            iOol.lOoO -= 100;
            iOol._1I = 0;
        } else {
            long l = (long)I_1[iOol._1I] * 1000000L;
            if (iOol.Il11 < l) {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u7193\u727f\u72c2\u723b\u7213\u72b3\u73a3\u6c36\u72d0\u7379\u73ce\u7323\u730b\u73a7\u738a\u73aa\u731a\u7469\u7406\u7431\u740c\u74ea\u6a1d\u74b4\u74c0", 29052) + (l - iOol.Il11) + IO00.I1OI("\u715c\u71ed\u715a\u71b7\u719f\u7237\u7258\u6cba\u7215", 29052));
                return;
            }
            iOol.Il11 -= l;
            if (iOol._1I < I_1.length - 1) {
                ++iOol._1I;
            }
        }
        this.IIl0.IIIl.l1_();
        this.llol();
    }

    void II(int n, String string, String[] stringArray) {
        this.II(56, n, string, stringArray);
    }

    void III(int n, String string, String[] stringArray) {
        this.II(13, n, string, stringArray);
    }

    void II01(String string) {
        this.III_(13, string);
    }

    private boolean IIll(int n) {
        int n2;
        IOol iOol = this.IIl0.II;
        for (n2 = 0; n2 < iOol.III.length; ++n2) {
            if (iOol.III[n2].II1_() || iOol.III[n2].I1l != n) continue;
            return true;
        }
        for (n2 = 0; n2 < iOol.IIII.length; ++n2) {
            if (iOol.IIII[n2].II1_() || iOol.IIII[n2].I1l != n) continue;
            return true;
        }
        return false;
    }

    private static int IIol() {
        return IO0I.IIol();
    }

    private void llo1() {
        IOol iOol = this.IIl0.II;
        if (iOol._1l_ == IO00.IIol()) {
            this.IIl0.IIIl.IIol(IO00.I1OI("\u7134\u716f\u71d7\u71f9\u7196\u7276\u724f\u7275\u7216\u6c32\u72dc\u72f1\u73e1\u73ec\u730e\u7323\u7304\u6d26\u73c4\u73e9\u738a\u74fe\u7447\u7465\u7409\u74ea\u6a67\u74af\u74c0\u748f\u7576\u75d0\u757c\u7509\u6b49\u75d0\u75f9\u75d6\u7637", 29052));
            return;
        }
        int n = 213 + (int)(Math.random() * 7.0);
        iOol._1l_ = IO00.IIol();
        iOol.II1_(n, 60);
        IOO.III iII = IOO.II(n);
        this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u718e\u6cfc\u7257\u7275\u721a\u72fb\u6c1f\u72bf\u72d0\u737b\u7346\u72fd\u6db3\u73e5\u73cd\u73e9", 29052) + (iII == null ? IO00.I1OI("\u711e\u7162\u71db", 29052) : iII.II1o) + (IOol.I_10.length > 0 && !iOol.IlI0(n) ? IO00.I1OI("\u715c\u71b3\u71d9\u71b1\u7048\u7276\u7216\u723d\u6ca3\u72b3\u72c6\u72a3\u6c13\u7326", 29052) : ""));
        this.IIl0.I__O();
    }

    private void llo_() {
        IOol iOol = this.IIl0.II;
        if (iOol._1l1 == IO00.IIol()) {
            this.IIl0.IIIl.IIol(IO00.I1OI("\u7134\u716f\u71d7\u71f9\u7196\u7276\u724f\u7275\u7217\u72fc\u72dc\u72f1\u73e1\u73ec\u730e\u7323\u7304\u6d26\u73c4\u73e9\u7399\u7472\u74c6\u7465\u7416\u6a50\u74cb\u74ed\u74c0\u7492\u757f\u7554\u757c\u750a\u75ef\u75d8\u75a1\u75d7\u767a\u6894\u763d\u7653\u76fc\u76d9\u7639\u76ce", 29052));
            return;
        }
        int n = 500 + (int)(Math.random() * 9322.0);
        int n2 = 1 + (int)(Math.random() * 10.0);
        if (!this.IIl0.IIIl.III0(new IO0l(457, n2).III(30, 0))) {
            this.IIl0.IIIl.IIol(IO00.I1OI("\u7134\u717b\u71d4\u71b1\u71d8\u7263\u7244\u7234\u721a\u72f4\u7292\u72ba\u7298\u73fb\u7340\u732a\u734c\u73e8\u7358\u73a7\u73c8\u7464\u744e\u6a92\u7444\u74f7\u74d0\u6a10\u748e\u7498\u753f", 29052));
            return;
        }
        iOol._1l1 = IO00.IIol();
        iOol.lOoO += n;
        this.IIl0.IIIl.l1_l();
        this.IIl0.IIIl.l1_();
        this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u7196\u727f\u6c9b\u723b\u7254\u7382\u7302\u6c32\u7293\u732f", 29052) + n + IO00.I1OI("\u715c\u71f5\u71dd\u6f14\u719b\u7237\u7240\u72b5\u7254", 29052) + n2 + IO00.I1OI("\u715c\u71ef\u71d2\u6f16\u7191\u7237\u7240\u72b5\u721a\u72f4", 29052));
        this.IIl0.I__O();
    }

    void Ilo(int n) {
        this.II_o(n, -1);
    }

    void II_o(int n, int n2) {
        if (I0Io.II(n) == null) {
            this.IIl0.IIIl.IIol(IO00.I1OI("\u7137\u71f3\u714e\u71b7\u719f\u7237\u7242\u723d\u6cb7\u72b3\u73a3\u6c6e\u729e\u732f\u7340\u72ec\u7305\u73ab\u73c4\u7329\u7391", 29052));
            return;
        }
        if (!this.IIl0.II01(n)) {
            return;
        }
        this.IIl0.II(new IO0o(-65).IIII(this.IIl0.II.I1l).II(1));
        this.IIl0.III_(n, n2 < 0 ? 100 + (int)(Math.random() * 400.0) : n2, 5);
    }

    void lloO() {
        if (this._I_l == 60) {
            this._I_l = 0;
            this.II_o(102, 60 + (int)(Math.random() * 140.0));
        } else {
            this._I_l = 0;
        }
    }

    static String IIlI(long l) {
        String string;
        double d;
        if (l >= 1000000000L) {
            d = (double)l / 1.0E9;
            string = IO00.I1OI("\u715c\u71cf\u6f4d", 29052);
        } else if (l >= 1000000L) {
            d = (double)l / 1000000.0;
            string = IO00.I1OI("\u715c\u71cf\u71c8", 29052);
        } else if (l >= 1000L) {
            d = (double)l / 1000.0;
            string = IO00.I1OI("\u715c\u71f0", 29052);
        } else {
            return String.valueOf(l);
        }
        long l2 = Math.round(d * 10.0);
        return (l2 % 10L == 0L ? String.valueOf(l2 / 10L) : l2 / 10L + IO00.I1OI("\u7150", 29052) + l2 % 10L) + string;
    }

    void II(String string, String[] stringArray, int n) {
        this.II(this.IIl0.II.II01(), n, string, stringArray);
    }

    void II0_(String string) {
        this.III_(56, string);
    }

    void II0O(String string) {
        this.IIIO(56, string);
    }

    private void llo0() {
        this.IIl0.IIIl.IIol(IO00.I1OI("\u713f\u71f3\u6f53\u71ba\u71d8\u7279\u7335\u723b\u7213\u72b3\u72dc\u7231\u7289\u732f\u734d\u7325\u72dc\u73ea\u738a\u72d8\u7258\u6ae4\u7445\u7465\u740c\u6a54\u7482\u74b5\u7492\u6a1c\u753e\u6be2\u757c\u7519\u6b39\u75d7\u75f8\u7598\u7670\u7653\u7638\u761a\u76fc\u76d4", 29052));
    }

    boolean II00(int n) {
        IOol iOol = this.IIl0.II;
        switch (n) {
            case 10: 
            case 11: 
            case 12: {
                String[] stringArray;
                String string;
                if (n == 10 && iOol.lOlo == 153) {
                    this.IIl0.II.llI0();
                    return true;
                }
                if (n == 10 && iOol.lOlo == 84) {
                    this.II(10, 0, IO00.I1OI("\u7128\u717b\u71cf\u71f9\u71ae\u737e\u7216\u7201\u7206\u6c76\u7292\u72b2\u6c17\u736e\u730e\u7339\u730d\u73ab\u73c9\u733a\u73c8\u7473\u744e\u6a86\u7444\u7592\u7512\u74a0\u74c0\u749c\u6bb3\u7548\u757c\u746a\u6b25\u75d7\u75f8\u759f\u76f6\u765b\u763c\u7653\u76e6\u76d8\u76be\u7687\u772e\u7746\u7724\u778a\u77e9\u7789\u77ab\u778f\u66cf\u7805\u7830\u7811\u78ed\u78cf\u78a7\u78ff\u78cd\u793d\u795b\u7932\u7998\u79e0\u7996\u79f7\u79b5\u64b8\u7a41\u7a73\u7a1f\u7ae4\u6461\u7aa1\u7ace\u7a1c\u7b45\u7b6b\u7a7b\u7b6b\u7bdd\u7bf8", 29052), new String[]{iOol.lOlI == 0 ? IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71ac\u7265\u72d7\u723c\u7254\u7383\u6c17\u72a5", 29052) : (iOol.lOlI == 1 ? IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b6\u7276\u725b\u6cea\u7217", 29052) : IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71a0\u7276\u724f\u7231\u7215", 29052))});
                    return true;
                }
                if (iOol._lOI == 7) {
                    this.III_(n, IO00.I1OI("\u7134\u7178\u71c3\u71f9\u7194\u72fd\u7258\u7275\u7365\u7323\u6c6f\u72bf\u7297\u732f\u734d\u6da4\u7319\u73ab\u72bb\u6d20\u7389\u7427\u7444\u74ac\u7444\u74ed\u74ca\u7421\u74c0\u748b\u75ea\u7554\u7556\u7538\u75f2\u6b16\u75bb\u75d7\u7674\u76d7\u762d\u7653\u76f5\u76d8\u680d\u76cf\u7760\u77de\u776c\u767a\u77eb\u77c7\u77af\u77c7\u7875\u66c6\u7864\u780b\u7861\u78c8\u78e0\u78b3\u6651\u7970\u791c\u7929\u67a9\u79f0", 29052));
                    return true;
                }
                int n2 = iOol.lOlo;
                if (n == 12 && n2 == 19) {
                    int n3 = iOol._lOI;
                    boolean bl = n3 == 19 && iOol._lOl <= 2;
                    String string2 = IO00.I1OI("\u706c\u6f42\u71d3\u71f9\u7189\u7262\u72d4\u723b\u7254\u72f0\u6c55\u72b0\u72d0\u7349\u7347\u7329\u7309\u73ab\u72bb\u73a8\u7386\u7460\u7406\u6a9a\u7444\u74d7\u74ca\u74b4\u748e\u7498\u753e\u7551\u7435\u7515\u75fd\u7599\u7596\u7596\u7666\u7645\u7635\u765f\u76b2\u76c5\u76b1\u76cf\u777d\u6990\u776c\u767a\u763a\u77c8\u77e8\u7789\u7861\u7995\u79e5\u780a\u78a2\u79b0\u667f\u78b1\u78de\u780c\u79cf", 29052);
                    if (bl) {
                        String[] stringArray2 = new String[]{IO00.I1OI("\u7137\u71ee\u71d1\u71ac", 29052), IO00.I1OI("\u7131\u6f36\u71ca\u71f9\u70e9\u6cb0\u7243\u7275\u7365\u72fa\u72dc\u72b9", 29052), IO00.I1OI("\u712e\u71fa\u71d7\u71bb\u7197", 29052)};
                        this.II(12, 21, string2, new String[]{IO00.I1OI("\u706c\u6f24\u71d4\u71f9\u719b\u727f\u6ce1\u725f", 29052) + stringArray2[iOol._lOl] + IO00.I1OI("\u7176\u71b3\u718f\u71e9\u71d6\u7227\u7206\u7265\u725a\u72a3\u7282\u72e1\u72d0\u7379\u73ce\u7323\u730b\u73a2", 29052), IO00.I1OI("\u706c\u6f24\u71d4\u71f9\u71bb\u7278\u725a\u7231", 29052), IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b6\u7276\u7246\u7225\u7215", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    } else {
                        this.II(12, 20, string2, new String[]{IO00.I1OI("\u706c\u6f24\u71d4\u71f9\u71bb\u7278\u725a\u7231", 29052), IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b6\u7276\u7246\u7225\u7215", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    }
                    return true;
                }
                if (n == 12 && n2 == 68) {
                    this.II(12, 22, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u725b\u7220\u6ca5\u72fd\u7292\u72a7\u6c31\u732f\u737a\u7325\u738c\u73e5\u73c2\u73e9\u73b8\u746f\u6af7\u7465\u7432\u74e6\u74c5\u74a4\u7494\u749e", 29052), new String[]{IO00.I1OI("\u706c\u6f48\u71d4\u71be\u71d8\u72ea", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    return true;
                }
                String string3 = string = n == 12 ? IO00.I1OI("\u7128\u717b\u71cf\u71f9\u718e\u737e\u7216\u7221\u7206\u6c76\u7292\u7289\u7291\u7376\u734a\u732c\u734c\u73f8\u6d47\u73e9\u738c\u6ae2\u7448\u7422\u7444\u74e0\u7456\u74af\u7487\u74df\u7570\u755a\u7534\u6bbc\u75ba\u75d4\u6b03\u759e\u7636\u765b\u763c\u68d6\u76e6\u769d\u76f0\u768c\u77fd\u770d\u7738\u7703\u6949\u7789\u76d9\u7657\u7867\u7805\u782a\u7804\u7932\u7900\u78a9\u78ff\u79ef\u7974\u791c\u7939\u67df\u79ed\u7998\u79bc\u6705\u7a35\u7b25\u7ab1\u7a07\u7abd\u7a90\u7aac\u7a86\u65c4\u7b0c\u7b28\u65cd\u7be7\u7b88\u7bb3\u7b94\u62a6\u7c04\u7c37\u7c0b\u6240\u7cce\u7c9f\u7cb2\u7c1d\u7d3c\u7c2a\u7cea\u639a\u7dfb\u7d99", 29052) : IO00.I1OI("\u7128\u717b\u71cf\u71f9\u71ae\u737e\u7216\u7201\u7206\u6c76\u7292\u72b2\u6c17\u736e\u730e\u7339\u730d\u73ab\u73c9\u733a\u73c8\u7473\u744e\u6a86\u7444\u7592\u7512\u74a0\u74c0\u749c\u6bb3\u7548\u757c\u746a\u6b25\u75d7\u75f8\u759f\u76f6\u765b\u763c\u7653\u76e6\u76d8\u76be\u7687\u772e\u7746\u7724\u778a\u77e9\u7789\u77ab\u778f\u66cf\u7805\u7830\u7811\u78ed\u78cf\u78a7\u78ff\u78cd\u793d\u795b\u7932\u7998\u79e0\u7996\u79f7\u79b5\u64b8\u7a41\u7a73\u7a1f\u7ae4\u6461\u7aa1\u7ace\u7a1c\u7b45\u7b6b\u7a7b\u7b6b\u7bdd\u7bf8", 29052);
                if (n == 11) {
                    String[] stringArray3 = new String[3];
                    stringArray3[0] = IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71ac\u7265\u72d7\u723c\u7254\u7383\u6c17\u72a5", 29052);
                    stringArray3[1] = IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71a0\u7276\u724f\u7231\u7215", 29052);
                    stringArray = stringArray3;
                    stringArray3[2] = IO00.I1OI("\u712f\u71f2\u7150\u71ac\u71d8\u7263\u725e\u6c9e", 29052);
                } else if (n == 12) {
                    String[] stringArray4 = new String[3];
                    stringArray4[0] = IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71ac\u7265\u72d7\u723c\u7254\u7383\u6c17\u72a5", 29052);
                    stringArray4[1] = IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b6\u7276\u725b\u6cea\u7217", 29052);
                    stringArray = stringArray4;
                    stringArray4[2] = IO00.I1OI("\u712f\u71f2\u7150\u71ac\u71d8\u7263\u725e\u6c9e", 29052);
                } else {
                    String[] stringArray5 = new String[3];
                    stringArray5[0] = IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b6\u7276\u725b\u6cea\u7217", 29052);
                    stringArray5[1] = IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71a0\u7276\u724f\u7231\u7215", 29052);
                    stringArray = stringArray5;
                    stringArray5[2] = IO00.I1OI("\u712f\u71f2\u7150\u71ac\u71d8\u7263\u725e\u6c9e", 29052);
                }
                String[] stringArray6 = stringArray;
                this.II(n, 0, string, stringArray6);
                return true;
            }
            case 38: {
                if (iOol._lOI < 20) {
                    this.IIl0.IIIl.IIol(IO00.I1OI("\u7137\u71f3\u714e\u71b7\u719f\u7237\u7242\u723d\u6cb7\u72b3\u72c6\u72b9\u6c01\u736c\u730e\u7325\u7305\u6d4c\u73c4", 29052));
                    return true;
                }
                if (iOol.lOlo == 102) {
                    this.II(38, 1, IO00.I1OI("\u713f\u71f3\u715a\u71b6\u71d8\u7274\u725e\u72af\u7258\u72b3\u72d1\u72b9\u7211\u737a\u730e\u732e\u739f\u73ab\u73de\u73a1\u6d2b\u7427\u7441\u742c\u749e\u74f3\u7482\u74a6\u740c\u74c0", 29052), new String[]{IO00.I1OI("\u7137\u6f58\u71b0\u719a\u7190\u7262\u724f\u6c92\u721a", 29052), IO00.I1OI("\u712d\u71ee\u71db\u71a0\u71d8\u7261\u6cf7\u725f\u7225\u72e6\u7253\u72f1\u729b\u7367\u6dc7", 29052)});
                } else {
                    this.II(38, 0, IO00.I1OI("\u713f\u71f3\u715a\u71b6\u71d8\u7274\u725e\u72af\u7258\u72b3\u72d1\u72b9\u7211\u737a\u730e\u732e\u739f\u73ab\u73de\u73a1\u6d2b\u7427\u7441\u742c\u749e\u74f3\u7482\u74a6\u740c\u74c0", 29052), new String[]{IO00.I1OI("\u7137\u6f58\u71b0\u719a\u7190\u7262\u724f\u6c92\u721a", 29052), IO00.I1OI("\u706c\u71f2\u719a\u70c8\u6f47\u7279\u723c\u7201\u73c4\u7332\u72dc\u72b6\u72d0\u7363\u734f\u7324", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                }
                return true;
            }
            case 37: {
                if (iOol.lOlo == 102) {
                    this.II(37, 0, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7242\u72b9\u7219\u72b3\u72c6\u72b0\u72d0\u736c\u73dd\u736d\u731a\u73e2\u6d6d\u73aa\u73c8\u7460\u74ca\u747a", 29052), new String[]{IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232", 29052)});
                } else {
                    this.II(37, 0, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7242\u72b9\u7219\u72b3\u72c6\u72b0\u72d0\u736c\u73dd\u736d\u731a\u73e2\u6d6d\u73aa\u73c8\u7460\u74ca\u747a", 29052), new String[]{IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232", 29052), IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                }
                return true;
            }
            case 45: {
                if (iOol.lOlo == 50) {
                    this.II(45, 0, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b3\u7276\u725f\u723a", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 52) {
                    this.II(45, 0, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else {
                    return false;
                }
                return true;
            }
            case 53: {
                if (iOol.lOlo == 19) {
                    this.II(53, 0, IO00.I1OI("\u71bd\u71f8\u719a\u71a8\u718d\u6ce0\u7216\u7221\u7206\u72e6\u72cb\u6c10\u729e\u732f\u735a\u7325\u7319\u73f2\u6d15\u73bd\u73c8\u744f\u744f\u7437\u7411\u74e7\u74c7\u74a6\u7481\u748d\u7570\u7537\u744d\u7598\u75ba\u75cd\u75b0\u7598\u76f7\u7641\u7674\u7618\u76fa\u687e\u76b9\u76cf\u777e\u7745\u7723\u7705\u77ed\u7789\u696d\u7789\u7826\u784b\u7823\u7883\u78ec\u7881\u78ae\u79dc\u7893\u7917\u7974\u79b8\u7903\u79b9\u79df\u79be\u790c\u7a65\u7a14\u7a27\u7a86\u7af8\u7a90\u7aac\u7a86\u65b2\u7b0c\u7b25\u7b0d\u6578\u7b88\u7ba9\u7b15", 29052), new String[]{IO00.I1OI("\u7133\u71d0", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 126) {
                    this.II(53, 0, IO00.I1OI("\u7128\u716f\u71d3\u71f9\u718b\u6caa\u7216\u7344\u73c4\u72f2\u7292\u72b3\u6c51\u7361\u730e\u733b\u6dad", 29052), new String[]{IO00.I1OI("\u7133\u71d0", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else {
                    return false;
                }
                return true;
            }
            case 15: {
                if (iOol.lOlI != 2) {
                    this.III_(15, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u7190\u72f4\u724f\u7275\u7202\u6c52\u7292\u72b9\u7210\u7361\u7346\u736d\u7318\u73e2\u73c4\u73a1\u73c8\u7464\u6ac1\u7424\u7444\u74ee\u744e\u74af\u7488\u74df\u7573\u75dd\u757c\u750f\u75f2\u6b7a\u75f8\u759f\u767f\u68f2\u763a", 29052));
                    return true;
                }
                this.II(15, 0, IO00.I1OI("\u713f\u71f3\u715a\u71b6\u71d8\u7274\u7259\u723b\u7258\u72b3\u72c6\u72b0\u72d0\u737d\u6d8b\u7339\u734c\u73fd\u73df\u73a0\u73c8\u746c\u744e\u742c\u7444\u74e4\u6a15\u74b1\u74c0\u75ee\u74ae\u6bde\u753f\u755b\u75f9\u75d6\u75b6\u75fd\u7655\u765a\u763a\u7653\u76ff\u76c4\u6801\u7681\u772e\u7741\u77ac\u7706\u77aa\u77ce\u7724\u77c7\u7868\u78c5\u782b\u7843\u78bd", 29052), new String[]{IO00.I1OI("\u7132\u71f3\u71d3\u6f1e\u7195\u7237\u7240\u6cb0", 29052), IO00.I1OI("\u7134\u6f56\u71d9\u71d3\u71b3\u6cee\u7216\u723b\u7377\u72fd\u72d5", 29052)});
                return true;
            }
            case 50: {
                this.IIl0.II.l1lI();
                return true;
            }
            case 7: {
                if (iOol.lOlI != 0) {
                    this.III_(7, IO00.I1OI("\u7124\u71f2\u71d4\u71f9\u7194\u6cc0\u725f\u7275\u7217\u7323\u72dc\u72b6\u72dc\u732f\u734d\u7325\u6da7\u73ab\u73c9\u73a1\u6d21\u7427\u7444\u74a4\u740a\u74a3\u75b3\u6a12\u74c0\u749c\u7576\u7552\u757c\u7515\u75fd\u7409\u6b05\u759e\u7636\u7661\u7626\u7692\u76fb\u7691\u77c0\u684a\u777a", 29052));
                    return true;
                }
                this.II(7, 0, IO00.I1OI("\u713f\u6f36\u71cf\u71f9\u719b\u6cb0\u7258\u7275\u7200\u72e1\u72d3\u72bf\u7297\u732f\u734c\u6d86\u734c\u73ec\u7346\u73e9\u738b\u6aee\u7406\u7554\u6adb\u74ed\u7482\u74a2\u7488\u6a28\u753e\u7549\u75a8\u7512\u75ba\u75d7\u75b0\u751e", 29052), new String[]{IO00.I1OI("\u713f\u6f76\u71db\u71d3\u7190\u72f7\u7258\u7232", 29052)});
                return true;
            }
            case 9: {
                if (iOol.lOlI != 2) {
                    this.III_(9, IO00.I1OI("\u712a\u6f5a\u719a\u71b1\u7118\u7279\u725e\u7275\u7200\u72fa\u72dc\u72b9\u72d0\u7367\u6d8f\u736d\u727d\u6d38\u73c4\u73ae\u73c8\u7464\u6ac1\u7424\u7444\u74ed\u74c5\u7571\u7541\u7496\u753e\u7550\u75bc\u755b\u75f7\u75cc\u75b9\u75d7\u7707\u68e6\u7674\u7610\u766b\u76d8\u76f0\u7681\u7766\u77c4\u7762\u774b\u77de\u6908\u77a1\u77c7\u7917\u78c7\u783d\u7843\u78f6\u78c0\u78e0\u78bc\u7896\u67d4\u791c\u7939\u799b\u79f7\u7998\u78c6\u6725\u7a35\u7a57\u7a3b\u7a1d\u7ab1\u7ade\u7aa8\u7b5e\u65d0\u7b45\u7b6b\u7b32\u7be8\u7bd1\u7ba3\u7b87\u7c25\u7c50\u7c2b\u7c96\u7ce8", 29052));
                    return true;
                }
                this.II(9, 0, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7255\u6cf2\u721a\u72b3\u72c6\u72a3\u7291\u7361\u7349\u736d\u730e\u6d40\u738a\u73ae\u7304\u7427\u7445\u6aac\u7444\u7592\u6a1d\u74af\u74c0\u749c\u7576\u6bea\u757c\u750f\u75fb\u7599\u75b6\u759f\u76ff", 29052), new String[]{IO00.I1OI("\u713f\u6f76\u71db\u71d3\u7190\u72f7\u7258\u7232", 29052)});
                return true;
            }
            case 20: {
                if (iOol.lOlo != 48) {
                    return false;
                }
                this.II(20, 0, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u7195\u6cb6\u7258\u723d\u7254\u72fd\u72da\u6c74\u7284\u732f\u735e\u7325\u7381\u73ea\u738a\u73ab\u6d47\u7464\u7406\u7433\u750d\u74a3\u74d6\u74b3\u6a05\u74df\u7570\u75dd\u7525\u755b\u75e8\u6b6a\u75b1\u75d7\u7707\u6890\u762d\u7679\u76fc\u76d9\u7760\u7681\u7769\u770d\u7722\u770c\u77e5\u7749\u77a1\u77c7\u7870\u794c\u7864\u7817\u78f0\u6644\u78e0\u78bd\u789f\u7972\u791c\u7937\u791b\u79b9\u79d3\u79be\u7997\u7a35\u7a42\u64f8\u7a1c\u7ab1\u7ad3\u7a3c\u7ace\u7b63\u7b44\u65a4\u7b04\u7bee\u7b88\u7bac\u655d\u7c25\u7c49\u62e2\u7c0c\u7ce9\u7c80\u7cd7\u7d7f\u7c93\u7d3c\u7d55\u7d32\u7d95\u7ded\u7dbd\u7db5\u7d9a\u7e7a\u7e13\u7e31\u60d6\u7efe\u7e8f\u7ebe\u7e85\u61af\u7f42\u7f6a\u7f1d\u6125\u7fd7\u7fe6\u7f89\u8071\u805a\u9e85\u800f\u80a0\u818e\u9e7d\u80fd\u8091\u9fba\u8154\u8131\u8158\u81ff\u8017\u81bb\u81d4\u827d\u9cdd\u8230", 29052), new String[]{IO00.I1OI("\u706c\u7098\u71d4\u71be\u71d8\u727c\u72cb\u725f\u7200\u6c3e\u72c2\u72db\u7284\u6dfe\u730e\u725c\u6db5\u73e5\u73cd", 29052), IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u736c\u7338\u730e\u73e9\u73c6\u73ac\u739b", 29052), IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u737a\u7325\u6dcb\u73e5\u738a\u739f\u7281\u7427\u7472\u7437\u6a81", 29052), IO00.I1OI("\u7138\u71f2\u719a\u71ba\u7190\u7262\u724f\u6c96\u721a", 29052)});
                return true;
            }
            case 0: 
            case 1: 
            case 2: {
                this.II(n, 0, n == 0 ? IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u7190\u72f4\u724f\u7275\u7217\u72fb\u73b1\u72bc\u72d0\u736c\u7346\u6d84\u734c\u73e7\u73df\u73b0\u6d2f\u7469\u7406\u7431\u6ac9\u74f3\u7482\u75d0\u6a23\u74df\u756a\u754f\u6b83\u755b\u75ee\u75d1\u7538\u7599\u767e\u7615\u7637\u761b\u76fb\u680e\u76be\u76cf\u776c\u7744\u7722\u7703\u77aa\u77c4\u6969\u7789\u786e\u7805\u782a\u780b\u6627\u78d5\u78ec\u78d5\u789c\u67be\u7953\u797b\u790c\u675e\u7998\u7983\u7984\u7af4\u7a5d\u7a73\u7b62\u6434\u7ac4\u7aef\u7a85\u7b65\u65e3\u7b22\u7b4a\u7beb\u6565\u7ba9\u7bc6\u7c5d\u7c45\u7c3a\u7c06\u7ce0\u7c80\u7cc9\u7c3e\u7cdd\u7d5a\u7d52\u7d3e\u7d1c\u7db6", 29052) : (n == 1 ? IO00.I1OI("\u7134\u717b\u71d4\u71b1\u71d8\u7263\u725f\u723b\u721c\u72b3\u72fc\u72b0\u729d\u6db0\u734d\u736d\u727d\u73ea\u73c4\u73ae\u73c8\u7460\u6a91\u7435\u7444\u74ed\u74c5\u74b4\u7499\u74df\u7576\u7554\u6b9f\u7516\u75b6\u75b3\u75bb\u7598\u7678\u7615\u763c\u7690\u76eb\u7691\u76bc\u769a\u7777\u69ea\u7722\u774b\u77fe\u6904\u77b8\u77c7\u7872\u784d\u66e9\u7817\u78a2\u78c2\u78a8\u79dc\u7893\u793d\u795f\u7933\u67b3\u79b9\u78a9\u6714\u79d6\u7a77\u6497\u7a3c\u7a52\u7ae7\u6477\u7aef\u7a9f\u7b78\u7bc6\u7b6b\u7b02\u7a39\u7a09\u7ba9\u7b81\u7c2b", 29052) : IO00.I1OI("\u7132\u71fc\u700a\u6f04\u7191\u7237\u726e\u7234\u720d\u72f7\u72d3\u72f1\u7293\u7367\u73d4\u7323\u730b\u73ab\u73de\u73a8\u73c8\u7474\u744f\u742b\u740c\u74a3\u74d0\u74a0\u74c0\u75ee\u6bdd\u751d\u753f\u7513\u75f3\u6b06\u75b6\u75d7\u7707\u6890\u7621\u765f\u7698\u76d2\u76bf\u7681\u772e\u7745\u77af\u7712\u77aa\u77db\u7720\u7789\u7826\u7849\u7831\u781a\u6645\u78cf\u78e0\u79ce\u663d\u793d\u7948\u7929\u67a5\u79b9\u79d6\u793d\u7998\u7a35\u7a59\u64f2\u7a1c\u7af9\u7a90\u7aa2\u6453\u7b2d\u7b44\u7aea\u7b04\u7ba7", 29052)), new String[]{IO00.I1OI("\u7132\u71f3\u6f17\u71b7\u71d8\u7266\u7243\u72b5\u727e\u72fb\u7252\u72bf\u7297\u732f\u7340\u732a\u738c\u73f2", 29052), this.IIl0.IIIl.II.Il1() ? IO00.I1OI("\u7128\u6f34\u71ce\u71d3\u719a\u7278\u7242\u7226", 29052) : IO00.I1OI("\u713e\u6f36\u71ce\u71d3\u719a\u7278\u7242\u7226", 29052), IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                return true;
            }
            case 8: {
                if (iOol.lOlI != 1) {
                    this.III_(8, IO00.I1OI("\u7124\u71f2\u71d4\u71f9\u7194\u6cc0\u725f\u7275\u7215\u72fd\u72da\u72fd\u72d0\u736a\u7343\u736d\u730f\u73e3\u6d63\u73e9\u738a\u74e6\u7448\u7465\u7575\u6a50\u7482\u74a2\u7488\u7490\u753e\u7559\u75be\u7515\u75ba\u75cd\u6b01\u7594\u7636\u767b\u7635\u761e\u682d\u76d2", 29052));
                    return true;
                }
                this.II(8, 0, IO00.I1OI("\u713d\u71f5\u71d2\u71f9\u719b\u6cb0\u7258\u7275\u7200\u72e1\u72d3\u72bf\u7297\u732f\u734c\u6d86\u734c\u73ec\u7346\u73e9\u738b\u6aee\u7406\u7554\u6adb\u74ed\u7482\u74a2\u7488\u6a28\u753e\u7558\u7531\u755b\u75f4\u75d1\u7531", 29052), new String[]{IO00.I1OI("\u713f\u6f76\u71db\u71d3\u7190\u72f7\u7258\u7232", 29052)});
                return true;
            }
            case 14: {
                if (iOol.lOlI != 1) {
                    this.III_(14, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u7190\u72f4\u724f\u7275\u7202\u6c52\u7292\u72b9\u7210\u7361\u7346\u736d\u7318\u73e2\u73c4\u73a1\u73c8\u7464\u6ac1\u7424\u7444\u74ee\u744e\u74af\u7488\u74df\u7573\u75dd\u757c\u750f\u75f2\u6b7a\u75f8\u759f\u767f\u68f2\u763a", 29052));
                    return true;
                }
                this.II(14, 0, IO00.I1OI("\u713f\u71f3\u715a\u71b6\u71d8\u7274\u7259\u723b\u7258\u72b3\u72c6\u72b0\u72d0\u737d\u6d8b\u7339\u734c\u73fd\u73df\u73a0\u73c8\u746c\u744e\u742c\u7444\u74e4\u6a15\u74b1\u74c0\u75ee\u74ae\u6bde\u753f\u755b\u75f9\u75d6\u75b6\u75fd\u7655\u765a\u763a\u7653\u76ff\u76c4\u6801\u7681\u772e\u7741\u77ac\u7706\u77aa\u77ce\u7724\u77c7\u7868\u78c5\u782b\u7843\u78bd", 29052), new String[]{IO00.I1OI("\u7132\u71f3\u71d3\u6f1e\u7195\u7237\u7240\u6cb0", 29052), IO00.I1OI("\u7134\u6f56\u71d9\u71d3\u71b3\u6cee\u7216\u723b\u7377\u72fd\u72d5", 29052)});
                return true;
            }
            case 16: {
                this.IIIO(16, IO00.I1OI("\u7129\u71c9\u71f5\u7197", 29052));
                return true;
            }
            case 17: {
                if (iOol.lOlo != 47 && iOol.lOlo != 84) {
                    return true;
                }
                this.II(17, 0, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u725b\u7220\u6ca5\u72fd\u7292\u72b2\u7203\u732f\u735a\u7325\u7386\u73e6\u738a\u73a7\u738f\u6aca\u7445\u7465\u7410\u74eb\u744e\u74e1\u7483\u7497\u6bd5\u7548\u757c\u7510\u75f2\u754a\u75f8\u759b\u76f6\u7658\u7674\u7605\u7672\u76d8\u76f0\u7681\u7766\u7744\u698b\u7706\u77aa\u77df\u692d\u77c7\u7875\u6698\u7864\u7972\u7932\u6642\u78a3\u78ff\u7890\u797a\u67f1\u7938\u795a\u79ed\u79d0\u7867\u6729\u7a7b\u7a53", 29052), new String[]{IO00.I1OI("\u7132\u71f3\u71d3\u6f1e\u7195\u7237\u7240\u6cb0\u727e\u72fb\u7252\u72bf\u7297\u732f\u7340\u732a\u738c\u73f2", 29052), IO00.I1OI("\u7132\u71f3\u71d3\u6f1e\u7195\u7237\u7240\u6cb0\u727e\u72e7\u72da\u7231\u729e\u7367\u730e\u7339\u7381\u73e8\u73c2", 29052), IO00.I1OI("\u706c\u71f2\u6f79\u71b4\u71d8\u7273\u7257\u723b\u721c", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                return true;
            }
            case 18: {
                if (iOol.lOlo != 46) {
                    return true;
                }
                this.ll0O();
                return true;
            }
            case 19: {
                if (iOol.lOlo == 45) {
                    this.II(19, 0, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u70e9\u72f4\u7216\u7238\u6cd5\u72fd\u72da\u72f1\u7298\u72ae\u7340\u736d\u7318\u73ea\u7386\u73e9\u739c\u7466\u7406\u7436\u6ad9\u74a3\u74c1\u74a9\u6a29\u74df\u740f\u748d\u6b81\u7515\u75fd\u7599\u75bb\u759f\u7679\u7615\u7637\u761c\u76fc\u7691\u77c1\u6850\u7760\u770d\u7707\u770a\u77e3\u77c6\u77c2\u76f6\u66c5\u7805\u7823\u66d4\u78f2\u7881\u78b4\u78b7\u6659\u7973\u791c\u790d\u7813\u79b9\u79ec\u79a5\u6713\u7a35\u7a64\u7a3b\u7bc2\u7b30\u7ade\u7aa8\u7ace\u7b4f\u6583\u7b28\u7b60\u7bc7\u7bcf\u7b27\u7b8f\u7c25\u7c48\u7ca3\u7c42\u7cf5\u7cc8\u6218\u7cb0\u7cdd\u7d7f\u7d5a\u7d33\u7d59\u7de9\u7dc2\u6375\u7d9b\u7e34\u7e45\u7f3b\u7e51\u7ee4\u7edd\u602b\u7ecd\u7f62\u7fcb\u7f33\u7f45\u7fa8\u7fcf\u7f25\u7f9c\u8024\u8057\u802a\u8004\u80ef\u80bf\u80d0\u80ba\u801c\u8172\u811a\u9ffc\u8101\u81b7\u81de\u9f18\u8197\u8233\u8244\u82a4\u8250\u82ec\u825a\u82a3\u828b\u8325", 29052), new String[]{IO00.I1OI("\u706c\u7098\u71d4\u71be\u71d8\u727c\u72cb\u725f\u7200\u6c3e\u72c2\u72db\u7284\u6dfe\u730e\u725c\u6db5\u73e5\u73cd", 29052), IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u7363\u733f\u7342\u73db\u735e\u7399\u731c", 29052), IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u7299\u72c4\u6c0a\u7299\u7305\u737a\u7325\u72dc\u6d68\u73c4\u73ae\u73c8\u7517\u6a99", 29052), IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b3\u7276\u725f\u723a", 29052), IO00.I1OI("\u712d\u71ee\u71db\u71a0\u71d8\u7279\u7251\u6c98\u7217\u7299\u72ff\u72b0\u7289\u732f\u7343\u6de2\u7302", 29052)});
                } else if (iOol.lOlo == 141) {
                    this.II(19, 2, IO00.I1OI("\u7134\u7178\u71c3\u71f9\u7196\u6cb8\u725b\u7275\u7218\u6c36\u72cb\u72f1\u7284\u736e\u7357\u736d\u7318\u73ea\u738a\u73a4\u7389\u7472\u7407", 29052), new String[]{IO00.I1OI("\u710a\u6f5a\u71b0\u71ad\u7190\u6cb0\u7258\u7275\u7365\u72fa\u6c75\u72bf", 29052)});
                }
                return true;
            }
            case 54: {
                return this.IIl0.II.II00(54);
            }
            case 25: {
                this.IIl0.II.lII();
                return true;
            }
            case 26: {
                this.IIl0.II.lIIo();
                return true;
            }
            case 22: {
                if (iOol.lOlo == 113) {
                    this.II(22, 0, IO00.I1OI("\u706c\u6f3a\u71d3\u71f9\u7190\u6cce\u725f\u7275\u7202\u7266\u7292\u72a5\u7298\u737a\u6d83\u7339\u734c\u73d8\u73c3\u7323\u739d\u7427\u746e\u6ae4\u740a\u74e4\u74a8\u74a5\u7489\u6a3a\u7570\u751d\u752e\u751a\u75ba\u758b\u75ec\u75d8\u7621\u7615\u763f\u68b0\u76b2\u76d2\u6873\u76cf\u7760\u774a\u77ac\u7712\u77aa\u77c5\u690d\u77c7\u7870\u78c5\u7864\u7800\u78ea\u6646\u78e0\u78b1\u7896\u67b0\u7948\u7951\u7932\u797a\u79c1\u79f7\u7982\u7a7d\u7a5d\u7a73\u7b63\u6434\u7ac5\u7aef\u7a80\u7b6a\u7b4d\u7b32\u7b4a\u7a98\u656b\u7be7\u7b8d\u7c6d\u6297\u7c2d\u7c05\u7ca1\u7db1\u6274\u7cb0\u7c95\u7d3c\u7c2a\u63e9\u7d17\u7dff\u7d97\u7db5\u6350\u7e64\u7e13\u7e31\u6096\u7ef1\u7e8f\u7ea3\u7e01\u7f62\u7f43\u7f6a\u7f07\u7fe0\u7f4e", 29052), new String[]{IO00.I1OI("\u7128\u71f4\u71ca\u71f9\u71c9\u7227\u7206\u725f\u7237\u72f2\u72dd\u72f1\u72a4\u7367\u6dc9", 29052), IO00.I1OI("\u7134\u702b\u6f61\u71b7\u719f\u721d\u7252\u6cfe\u721a\u7299\u72c6\u72b9\u721a\u7362", 29052), IO00.I1OI("\u7128\u71f3\u71d3\u71f9\u70e9\u6cb2\u7243", 29052), IO00.I1OI("\u70d3\u71ee\u719a\u71ad\u7191\u72fd\u7258\u725f\u7365\u6c36\u72c7\u72f1\u729e\u7368\u734f\u7334", 29052), IO00.I1OI("\u712a\u6f5a\u71b0\u70c9\u6f59\u727e\u7216\u721d\u6cad\u72fa\u72b8\u7287\u7205\u732f\u737a\u7325\u7319\u6d26\u73de", 29052)});
                } else {
                    this.II(22, 1, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                }
                return true;
            }
            case 28: {
                this.II(28, 0, IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232\u7254\u72f0\u72da\u722b\u729e\u7368\u730e\u7339\u7398\u73e2\u738a\u73aa\u7380\u7472\u745f\u74af\u740a\u74a3\u74cf\u74b4\u7481\u74df\u757c\u75dc\u7532\u755b\u75f2\u7559\u75b6\u7590\u7636\u765d\u763d\u68b4\u76e7\u769d\u76f0\u7687\u77ee\u7743\u772b\u774b\u769b\u6970\u77ab\u77cb\u7826\u7846\u66e7\u780e\u78a2\u7900\u78ae\u78ff\u789c\u67bc\u7952\u797b\u786b\u797a\u7998\u79b0\u799e\u7afc\u7a14\u7a27\u7a1a\u7b92\u7add\u7ae1", 29052), new String[]{IO00.I1OI("\u7134\u702b\u6f61\u71b7\u719f\u721d\u7252\u6cfe\u721a\u7299\u72c6\u72b9\u721a\u7362", 29052), IO00.I1OI("\u7131\u71ee\u71db\u71f9\u719a\u72f6\u7258\u725f\u723f\u726e\u7292\u72b6\u6c1d\u7366", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                return true;
            }
            case 42: {
                this.II(42, 0, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u7195\u7262\u6ce7\u723b\u7254\u72fd\u7250\u72bf\u7297\u732f\u7349\u7324\u6db7\u73e2\u738a\u73a1\u6d49\u7469\u7406\u7436\u6a8d\u74e0\u7482\u74ac\u6a41\u7491\u7576\u751d\u753f\u7513\u75f5\u7599\u75ba\u6b54\u7678\u7615\u7620\u761b\u7670\u76df\u76f0\u7687\u776f\u7754\u776c\u767a\u694d\u7789\u77bc\u690a\u7839", 29052), new String[]{IO00.I1OI("\u713e\u6f38\u71d4\u71f9\u718c\u727f\u72d4\u723b", 29052), IO00.I1OI("\u706c\u6f5c\u719a\u71ad\u6f15", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                return true;
            }
            case 43: {
                if (iOol.lOlo != 50 && iOol.lOlo != 116) {
                    return true;
                }
                this.II(43, 0, IO00.I1OI("\u7128\u6f36\u71ca\u71f9\u7194\u7262\u724f\u6c92\u721a\u72b3\u72c4\u6c0a\u7299\u732f\u737a\u6d98\u734c\u73f8\u721a\u73e9\u73a3\u7466\u744f\u742a\u7444\u74f0\u6a1f\u74e1\u7494\u75fc\u7570\u755a\u757c\u7508\u6b73\u75da\u75f8\u759a\u68b7\u765b\u763c\u7653\u76ff\u6866\u76b9\u76cf\u777e\u7745\u77b6\u771f\u77a6\u7789\u77ab\u7714\u7826\u7851\u782c\u66a0\u78a2\u78d5\u79c3\u78b1\u7899\u793d\u795b\u7932\u67d9\u79f4\u7998\u79a3\u790f\u7a6c\u7a14\u7a25\u7a92\u7afe\u7a90\u7aa4\u7a86\u65ae\u7b0c\u7b25\u7a69\u7be7\u7bcf\u7be7\u7af7\u7ce4\u7c4a\u7c2b\u7c42\u7cf0\u7cd5\u7c5e\u7cb7\u7cdd\u7d7f\u63dc\u7d3b\u7d59\u7dfb\u7dd8\u7db8", 29052), new String[]{IO00.I1OI("\u706c\u7098\u71d4\u71be\u71d8\u727c\u72cb\u725f\u7200\u6c3e\u72c2\u72db\u7284\u6dfe\u730e\u725c\u6db5\u73e5\u73cd", 29052), IO00.I1OI("\u706c\u6f48\u71d4\u71be\u71d8\u72ea\u723c\u7239\u7201\u72ea\u6c75\u72bf\u72d0\u737b\u6d83\u733d", 29052), IO00.I1OI("\u7132\u7179\u71d4\u71be\u71f2\u7250\u725f\u6c8e\u721d\u72b3\u72da\u6c70\u729e\u7305\u737d\u6da4\u730f\u73ab\u73c7\u6d68\u7386\u746f", 29052), IO00.I1OI("\u7137\u71f3\u714e\u71b7\u719f\u721d\u7327\u6c86\u721a\u72f4\u7292\u722c", 29052)});
                return true;
            }
            case 44: {
                if (iOol.lOlo == 50) {
                    this.II(44, 0, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b3\u7276\u725f\u723a", 29052), IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u7190\u72f7\u7258\u723d\u7254\u72e7\u72db\u72bf\u7298\u7305\u736c\u7324\u7300\u73e7", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 154) {
                    this.II(44, 1, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u7190\u72f7\u7258\u723d\u7254\u72e7\u72db\u72bf\u7298\u7305\u7340\u732a\u6d89\u73e8\u738a\u73bd\u7311", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 155) {
                    this.II(44, 2, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u712d\u71ee\u71db\u71a0\u71d8\u7261\u6cf7", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 52) {
                    this.II(44, 3, IO00.I1OI("\u713e\u7179\u71c3\u71f9\u719f\u727e\u6ceb\u7275\u7200\u7267\u72db\u72f1\u7283\u6db2\u730e\u732f\u7381\u73ab\u73c7\u6d64\u739c\u7429\u7408\u746b\u746e\u7592\u74d7\u6a14\u7489\u74df\u756a\u7555\u7539\u7514\u75ba\u758b\u75f8\u7583\u76fc\u765b\u7674\u7762\u6841\u7691\u76a4\u682c\u7720\u7703\u7762\u7761\u77db\u77dc\u7735\u77c7\u7870\u66ee\u7864\u780d\u7862\u78ce\u78e0\u78b2\u788b\u67cc\u7952\u797b\u786b\u79f0\u7998\u79a3\u799e\u7a70\u7a5b\u7a73\u7a06\u7af9\u7a5c\u7aef\u7a96\u7b64\u7b42\u7b6b\u7b07\u6554\u7bc1\u7be7\u7bc7", 29052), new String[]{IO00.I1OI("\u7133\u71d0", 29052), IO00.I1OI("\u713e\u7177\u71d4\u71b1\u71d8\u727f\u72cc\u7221\u7254\u72fd\u73b1\u72bf\u7297\u732f\u7342\u72fd\u6d8f\u73e5\u73cd", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 165) {
                    this.II(44, 5, IO00.I1OI("\u7131\u71fa\u71cf\u71f9\u7190\u72ed\u7242\u7275\u721a\u7390\u72dc\u72b6\u72d0\u7363\u729e\u6dae\u7302\u73ec\u738a\u73bd\u7308\u7427\u74c7\u7426\u7444\u74f7\u74d0\u74ae\u748e\u7498\u753e\u7553\u753b\u74cb\u6b47\u75d0\u75f8\u7594\u68bb\u7640\u7674\u68d6\u76eb\u7691\u76f8\u76ab\u77f7\u7743\u772b\u774b\u77fe\u6958\u77e8\u76f6\u66df\u784b\u7823\u7843\u78ee\u78d4\u78b9\u6618\u7890\u793d\u7948\u67f6\u790a\u79b0", 29052), new String[]{IO00.I1OI("\u712a\u6f5a\u719a\u71b7\u7190\u72f7", 29052), IO00.I1OI("\u713e\u7162\u71db\u71f9\u7190\u6cc0\u723c\u7221\u7206\u6c70", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (IO0_.II0O(iOol.lOlo)) {
                    this.IIl0.II.llOo();
                } else {
                    return true;
                }
                return true;
            }
            case 46: {
                if (IO0_.II0O(iOol.lOlo)) {
                    this.IIl0.II.ll0();
                }
                return true;
            }
            case 55: {
                if (iOol.lOlo == 154) {
                    this.II(55, 0, IO00.I1OI("\u7152\u71b5\u7194", 29052), new String[]{IO00.I1OI("\u712a\u6f5a\u71b0\u71ad\u7190\u72f6\u7258\u723d\u7254\u7382\u6c79\u72b0\u72fa\u7344\u734f\u7324\u7303", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 48) {
                    this.II(55, 10, IO00.I1OI("\u713f\u71f3\u700a\u71b8\u71d8\u7263\u6ced\u723c\u7254\u72f4\u72db\u6c0c\u72d0\u737b\u7346\u7324\u734c\u729a\u6d0f\u73bc\u73c4\u7427\u745e\u7420\u7409\u74a3\u74ca\u7571\u6a3b\u7491\u7579\u751d\u7538\u6bd0\u75f4\u7599\u74c9\u6b34\u7636\u7657\u763d\u68cc\u76e6\u7691\u76a4\u7687\u77e4\u7740\u776c\u7708\u77e2\u77c0\u77e8\u7793\u786f\u669a\u7830", 29052), new String[]{IO00.I1OI("\u7132\u7168\u71d3\u71d3\u719b\u727f\u7243\u722c\u6cb3\u72fd", 29052), IO00.I1OI("\u7134\u702b\u6f61\u71b7\u719f\u721d\u7252\u6cfe\u721a\u7299\u72c6\u72b9\u721a\u7362", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                }
                return true;
            }
            case 63: {
                if (iOol.lOlo == 24) {
                    this.II(63, 0, IO00.I1OI("\u713b\u716f\u719a\u718d\u7112\u7279\u721a\u7275\u7237\u72f2\u72de\u723c\u7293\u7367\u730e\u733b\u738c\u73ab\u73e7\u73a6\u7386\u7466\u744d\u7424\u7444\u7592\u74c3\u74af\u7487\u74df\u7579\u6b8a\u752c\u755b\u75f9\u75d1\u75ad\u758e\u68d1\u765b\u7674\u68ac\u76b2\u76d9\u7630\u7681\u7766\u770d\u7738\u7702\u77e4\u77c1\u77c2\u77b7\u7869\u7851\u7825\u7816\u78e4\u78c4\u78b5\u78d5\u78b6\u79fe\u7945\u797b\u786b\u6726\u79d6\u79f7\u78e7\u7ae6\u7a14\u7a3d\u7a15\u7af0\u7ac9", 29052), new String[]{IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71a8\u7278\u7242\u7234\u7201\u72f5\u72d7\u72a4", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else if (iOol.lOlo == 139) {
                    this.II(63, 1, IO00.I1OI("\u7128\u717b\u71cf\u71f9\u71ae\u737e\u7216\u7201\u7206\u6c76\u7292\u72b2\u6c17\u736e\u730e\u7339\u730d\u73ab\u73c9\u733a\u73c8\u7473\u744e\u6a86\u7444\u7592\u7512\u74a0\u74c0\u749c\u6bb3\u7548\u757c\u746a\u6b25\u75d7\u75f8\u759f\u76f6\u765b\u763c\u7653\u76e6\u76d8\u76be\u7687\u772e\u7746\u7724\u778a\u77e9\u7789\u77ab\u778f\u66cf\u7805\u7830\u7811\u78ed\u78cf\u78a7\u78ff\u78cd\u793d\u795b\u7932\u7998\u79e0\u7996\u79dd\u79b5\u64b8\u7a41\u7a73\u7a1f\u7ae4\u6461\u7aa1\u7ace\u7a1c\u7b45\u7b6b\u7a7b\u7b6b\u7bdd\u7bf8", 29052), new String[]{IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71ac\u7265\u72d7\u723c\u7254\u7383\u6c17\u72a5", 29052), IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71b6\u7276\u725b\u6cea\u7217", 29052), IO00.I1OI("\u706c\u6f24\u71d4\u71d3\u71a0\u7276\u724f\u7231\u7215", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                }
                return true;
            }
            case 60: {
                if (iOol.lOlo == 80) {
                    this.II(60, 0, IO00.I1OI("\u7128\u71fa\u719a\u71b4\u6f23\u727e\u7216\u723d\u6cd5\u72b3\u72f4\u72b8\u7294\u736a\u7302\u736d\u7302\u73e3\u721a\u73a7\u738f\u7427\u7448\u74b6\u7444\u7592\u7441\u74e1\u748b\u6a34\u756e\u751d\u744d\u759b\u75f5\u7599\u75e9\u75d7\u7675\u76d4\u763d\u7653\u76fe\u6866\u76da\u76a7\u77ee\u7743\u7724\u774b\u77fe\u77c0\u77a6\u778f\u7826\u784b\u78a4\u781a\u78a2\u78d2\u666f\u78af\u78de\u7973\u67e9\u797b\u790e\u79ec\u79d6\u79b0\u79d6\u7a67\u64e7\u7a3a\u7a78\u7adc\u7ad1\u7aba\u7ace\u7b61\u7a9c\u65a8\u7b04\u7ba9\u7bdc\u7baf\u7b12\u7c6c", 29052), new String[]{IO00.I1OI("\u713f\u71f3\u71cf\u6f0a\u7196", 29052)});
                } else if (iOol.lOlo == 131) {
                    this.II(60, 1, IO00.I1OI("\u706c\u7179\u71c3\u71f9\u7194\u72f7\u7216\u7344\u7296\u72e6\u728d\u72f1\u72a8\u7360\u7340\u732a\u734c\u73e8\u73c7\u73a7\u739a", 29052), new String[]{IO00.I1OI("\u713e\u7168\u719a\u71ad\u7199\u726e", 29052), IO00.I1OI("\u712a\u6f5a\u719a\u71ba\u7190\u6cc0\u7216\u7236\u731d", 29052)});
                }
                return true;
            }
            case 47: {
                this.II(47, 0, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7327\u7234\u721a\u72f4\u7292\u72bc\u7285\u6dde\u7340\u736d\u7318\u7367\u73c7\u73e9\u7385\u6aa4\u7448\u742d\u7444\u74f5\u6a43\u74e1\u7496\u741f\u753e\u7550\u6bff\u7515\u75f2\u7599\u75b0\u6b24\u7678\u7615\u7636\u7687\u76fc\u76d6\u76f0\u769b\u776f\u7744\u776c\u773b\u77e5\u77db\u77a9\u7793\u7867\u7805\u7830\u7811\u78ed\u78cf\u78a7\u78ff\u788a\u796f\u7949\u7922\u67bb\u79f7\u7998\u79a3\u799e\u7a60\u7a4d\u64ec\u7a06\u7abd\u7a90\u7abb\u7a8f\u7b2d\u7b5f\u65f6\u7b4a\u7a98\u7a18\u7ba6\u7bc6\u7c6b\u7c43\u7df3\u7dc3\u7ce8\u7c80\u7dae\u6261\u7c93\u7d3c\u7c2a\u7da9\u7d59\u7da7", 29052), new String[]{IO00.I1OI("\u7137\u71f3\u71d3\u7133\u718d\u7237\u7255\u723d\u721d\u6c2c\u72dc\u72db\u72b2\u7360\u735d\u733e", 29052), IO00.I1OI("\u706c\u71f2\u6f79\u71b4\u71d8\u7273\u7257\u723b\u721c\u7299\u7299\u72e0\u72d0\u734c\u734f\u733d\u731f\u73fe\u73c6\u73ac\u73e2\u7445\u7447\u742b\u7403", 29052), IO00.I1OI("\u7133\u71d0", 29052), IO00.I1OI("\u713f\u6f76\u71db\u71f9\u71b0\u72f7\u7258\u7232\u727e\u72d1\u72d3\u72bf\u7297\u732f\u7346\u6d94\u7305", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                return true;
            }
            case 67: {
                if (iOol.lOlo != 0) {
                    return true;
                }
                this.II(67, 0, IO00.I1OI("\u7128\u71f3\u700a\u6f3a\u7196\u7270\u7216\u7345\u6ccb\u72b3\u72c4\u6c3a\u7291\u732f\u735e\u7325\u738d\u73ff\u738a\u73a1\u7381\u6ac0\u7448\u7465\u7416\u74e2\u7482\u74f0\u74c0\u7493\u7571\u6b9c\u7535\u755b\u75f1\u75d1\u7535\u75d7\u7707\u7654\u763a\u7614\u76b2\u7653\u76bd\u76cf\u777a\u7745\u69eb\u7706\u7780\u77c1\u692f\u779e\u7826\u7841\u782d\u66a4\u78f6\u7881\u78ad\u6612\u7897\u793d\u7951\u67fc\u7917\u79b9\u79cb\u6706\u7998\u7a72\u7a14\u7a27\u7a00\u7a7b\u7ade\u7aef\u7aba\u7b7f\u7bcd\u7b22\u7b4a\u7a99\u650d\u7bb3\u7bca\u7c0f\u7c4a\u7cb0\u7c42\u7d90\u7d10\u625c\u7cbd\u7cdd\u7d7b\u63f6\u7d33\u7d59\u7df4\u7d57\u7df6\u7db1\u7e71\u7e40\u7e26\u7e03\u7eff\u7ec1\u7eee\u7eaa\u7f6d\u7f58\u7f64\u7f63\u7fdc\u7fc6\u7fe6\u7f96\u9eb9\u8003\u8153\u81d1\u80e1\u80bf\u80dd\u803c\u809f\u813b\u8159\u9ff4\u810d\u81b7\u80a7\u9f6a\u819a\u8233\u825c\u83f0\u8219\u82af\u9c0b\u82b4\u82c0\u832b\u8349\u83a8\u830b\u83a7\u83c5\u9d68\u8391\u8423\u8533\u84a2\u8440\u840c\u9a2b\u84d3\u84fc\u8488\u85fa\u8557\u853f\u8557\u85f5\u85dd\u8464\u8592\u862d", 29052), new String[]{IO00.I1OI("\u7128\u71f3\u714e\u71b7\u719f\u7237\u7242\u723c\u721a\u7299\u72f1\u72b9\u7299\u732f\u735a\u7324\u6dd3\u73ff", 29052), IO00.I1OI("\u7128\u71f4\u71ca\u71f9\u71c9\u7227\u7206\u725f\u7236\u72f2\u72dc\u72b6\u72d0\u7367\u6df7\u7324", 29052), IO00.I1OI("\u7133\u71d0", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                return true;
            }
            case 83: {
                if (iOol.lOlo == 20) {
                    this.II(83, 0, IO00.I1OI("\u7132\u7098\u71d7\u71f9\u71cf\u7223\u7206\u7279\u7254\u72e7\u72d3\u72f1\u7284\u73e3\u7343\u736d\u7318\u73e3\u6d0f\u73b0\u73c8\u746c\u74cb\u7465\u7417\u74ea\u74cc\u74a9\u74c0\u748b\u756c\u75c4\u7532\u751c\u75ba\u75da\u6b3f\u7596\u7636\u767e\u763d\u761d\u76f5\u7691\u7684\u769a\u7768\u774b\u7720\u770e\u77a6\u77a3\u77bb\u7786\u7873\u7805\u7955\u7890\u78a2\u78d5\u78a1\u78ff\u79ef\u79fe\u791c\u7935\u791d\u79f1\u79d1\u793d\u7998\u7a35\u7a57\u64ba\u7a07\u7ab1\u7ac6\u7a2f\u7ace\u7b6e\u7b44\u65f4\u7b4a\u7bfd\u6509\u7ba8\u7bc6\u7c77\u7c45\u7c63\u7c09\u7c6c\u7c80\u7ccc\u7cb7\u7c93\u7d74\u7d1b\u7d2e\u7d0b\u7d61\u7dd9\u7db1\u7dd5\u7e56\u7e52\u7e30\u7e08\u7ebe\u7ea5\u7e8c\u7e8c\u7f6e\u7f52\u7f6a\u7f0a\u7f7b\u7f87\u7fad\u7f8d\u9ea7\u8003\u802c\u8162\u80ee\u80f8\u809e\u80bf\u801d\u8176\u811a\u812f\u8198\u81f8\u8196\u81b6\u8055\u8233\u8246\u8239\u9cb3\u82af\u82cd\u9c2a\u828d\u832b\u8344\u832e\u82d8\u9d5a\u83cf\u83e5\u838f\u846b\u84c3\u8422\u844c\u8475\u84f5\u84d4\u9a1f\u8496\u853a\u854a\u8537\u8596\u85e2\u8595\u85a7\u9b1a\u8671\u8611\u863d\u98ce\u86e0\u86c5\u86ec\u8688\u99ed\u8748\u8768\u870f\u994b\u8785\u87b2\u8703\u8822\u884d\u88a0\u8832\u885e\u88eb\u88d5\u961c\u8899\u8939\u894c\u893f\u8913\u89fa\u8994\u892e\u89d2\u8a72\u94d7\u8a2e\u8a4e\u8af9\u8acd\u8ae5\u8ae0\u8b7d\u8b5d\u8b3e\u8b46\u8beb\u8bcc\u8baa\u8b08\u8c6f\u8c00\u8c4b\u8c3f\u8c5d\u8d8d\u8c58\u8cfa\u8c94\u93bd\u8d43\u8d76\u8d1e\u8dfd\u9370\u8dbf\u8dd1\u8e63\u8e40\u8eaf\u8e19\u8eac\u8ec5\u8e39\u8ec9\u8f60\u8f48\u8fa6\u8f0b\u8fa4\u8fd7\u8fad\u8f01\u906e\u9031\u9010\u9073\u9076\u90f5\u90dd\u9169\u9159\u917e\u9116\u9136\u9187\u91b3\u91c6\u91b9\u8f33\u922f\u9249\u9224\u9296\u92fb\u928a\u92bd\u9289\u9327\u9345\u932d\u8ddb\u93a3\u93cc\u93a6\u8d11\u93df\u9470\u94ce\u947c\u9410\u94f2\u944d\u94b6\u9490\u9536\u950a", 29052), new String[]{IO00.I1OI("\u706c\u71f2\u719a\u718d\u7190\u72e3\u725f", 29052), IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                }
                return true;
            }
            case 82: {
                this.II(82, 0, IO00.I1OI("\u712a\u717b\u71d4\u71be\u71d8\u7275\u6c97\u7236\u7254\u72f0\u72da\u7233\u7285\u732f\u734c\u73ac\u7319\u73ab\u73cd\u7325\u73c8\u7464\u6acf\u7465\u741d\u7469\u74cc\u74e1\u7494\u741d\u7573\u751d\u753b\u7512\u75fb\u75d6\u75f8\u759f\u68a9\u7641\u7674\u7610\u76fa\u76de\u76f0\u769b\u77fa\u7744", 29052), new String[]{IO00.I1OI("\u7131\u6f44\u719a\u71ab\u7048\u73b6\u7258\u7232", 29052), IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7274\u6c93\u7225\u727e\u72e1\u7302\u7370\u729e\u7368", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                return true;
            }
            case 13: {
                this.II.IooI();
                return true;
            }
            case 56: {
                if (iOol.lOlo != 154) {
                    return false;
                }
                this.II.IooI();
                return true;
            }
            case 39: {
                boolean bl = this.IIll(459);
                this.IIl_ = new Vector();
                Vector vector = new Vector();
                this.II(vector, IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232", 29052), IO00.I1OI("\u712f\u71da\u71f4\u718d\u71b9", 29052));
                if (bl) {
                    this.II(vector, IO00.I1OI("\u713b\u71f2\u6f19\u71b4\u71d8\u7270\u725f\u72b4\u727e\u72ab\u7282\u72f4", 29052), IO00.I1OI("\u712f\u71da\u71f4\u718d\u71b9\u7248\u7271\u721c\u7235\u72de\u72ed\u7296\u72b9\u734e\u7371\u737c", 29052));
                }
                this.II(vector, IO00.I1OI("\u7131\u6f44\u719a\u71ab\u6f21\u7279\u7251\u725f\u723c\u7273\u72dc\u72b9\u72d0\u737b\u735c\u732c\u7302\u73ec\u73a0\u739b\u7258\u75a6\u7448\u7422\u7444\u7592\u6a71", 29052), IO00.I1OI("\u712f\u71da\u71f4\u718d\u71b9\u7248\u727b\u721a\u722b\u72c1\u72fd\u729f\u72b7\u7350\u7366\u730c\u7322\u73c3\u73f5\u739d\u73ba\u7446\u7468\u7402", 29052));
                this.II(vector, IO00.I1OI("\u7132\u71f3\u6f17\u71a9\u71d8\u727a\u72d5\u725f\u7205\u72e6\u7252\u72f1\u7284\u6db8\u7340\u732a", 29052), null);
                this.II(vector, IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232\u727e\u72db\u6c13\u72bf\u72d0\u737c\u6dc3\u736d\u7308\u6d6e\u73c4\u73ae", 29052), IO00.I1OI("\u712f\u71da\u71f4\u718d\u71b9\u7248\u727e\u7214\u723a\u72cc\u72e1\u7284\u72af\u734b\u737b\u7303\u732b", 29052));
                this.II(vector, IO00.I1OI("\u7128\u71f2\u6f7d\u71b4\u71f2\u725f\u6ced\u7221\u7254\u72e7\u7241\u72b2", 29052), IO00.I1OI("\u712f\u71da\u71f4\u718d\u71b9\u7248\u727e\u7210\u7235\u72d7", 29052));
                this.II(vector, IO00.I1OI("\u7138\u71fa\u71d4\u71b1\u71f2\u727f\u725f\u6c92\u7201", 29052), IO00.I1OI("\u712f\u71da\u71f4\u718d\u71b9\u7248\u7272\u7214\u723a\u72db\u72ed\u7299\u72b9\u734a\u737b", 29052));
                SantaShopPatch.appendMenu(vector, this.IIl_);
                Object[] objectArray = new String[vector.size()];
                vector.copyInto(objectArray);
                this.II(39, 0, IO00.I1OI("\u7124\u71f2\u71d4\u71f9\u719b\u727f\u72d6\u723a\u7258\u72b3\u72c6\u72b0\u72d0\u736c\u73dd\u736d\u7301\u6d52\u73de\u73e9\u739b\u6ad6\u7406\u7433\u6ac9\u74f7\u7482\u74b1\u7488\u6a56\u7573\u751d\u744d\u6bcc\u75f9\u7599\u75ba\u759e\u68d1\u7641\u7674\u7610\u683f\u76c4\u76f0\u768c\u77fd\u770d\u7721\u771e\u695b\u77c7\u77e8\u779f\u7863\u7848\u7864\u7808\u78ea\u7855\u78ae\u78b8\u78c1", 29052), (String[])objectArray);
                return true;
            }
            case 21: {
                if (iOol.lOlo != 5) {
                    this.IoOI = iOol._1l_ != IO00.IIol();
                    boolean bl = this.IIll(454) || this.IIll(1816) || this.IIll(921);
                    this.IIlO.removeAllElements();
                    Vector<String> vector = new Vector<String>();
                    if (this.IoOI) {
                        vector.addElement(IO00.I1OI("\u7128\u71f3\u700a\u6f06\u7196\u7270\u723c\u7217\u728d\u72f2\u7292\u72e0\u7298\u7305\u7340\u732a\u6dc7\u73fe\u738a\u73a7\u7380\u746e\u74cc\u742b", 29052));
                        this.IIlO.addElement(IO00.I1OI("\u711b\u71f2\u71dc\u71ad", 29052));
                    }
                    vector.addElement(IO00.I1OI("\u712f\u717a\u71d9\u71b1\u71f2\u7243\u7243\u722c\u6cb3\u72e7\u7292\u729a\u6c09", 29052));
                    this.IIlO.addElement(IO00.I1OI("\u710f\u71fa\u71d9\u71b1", 29052));
                    vector.addElement(IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232\u727e\u72d1\u724b\u72b0", 29052));
                    this.IIlO.addElement(IO00.I1OI("\u711e\u71ee\u71db", 29052));
                    vector.addElement(IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7274\u6c93\u7225\u727e\u72c5\u6c1f\u72a5\u72d0\u737f\u7346\u6de4\u7301", 29052));
                    this.IIlO.addElement(IO00.I1OI("\u7112\u71f8", 29052));
                    if (bl) {
                        vector.addElement(this.IIll(921) ? IO00.I1OI("\u7131\u6f44\u719a\u71ba\u7190\u6cde\u7216\u7226\u6ca5\u7299\u72f0\u7225\u729e\u7368\u730e\u7339\u730d\u73e2\u73a0\u7399\u7387\u7475\u7447\u7431\u7405\u74a3\u74c1\u6a64\u7490\u74f5\u752c", 29052) : IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7274\u6c93\u7225\u727e\u72d1\u7246\u72bf\u7297\u732f\u735a\u732c\u7305\u7381\u73fa\u73a6\u739a\u7466\u7452\u7424", 29052));
                        this.IIlO.addElement(IO00.I1OI("\u711e\u71ef\u7188", 29052));
                        vector.addElement(this.IIll(1816) ? IO00.I1OI("\u7131\u6f44\u719a\u71ba\u7190\u6cde\u7216\u7226\u6ca5\u7299\u72f0\u7225\u729e\u7368\u730e\u7339\u730d\u73e2\u73a0\u7399\u7387\u7475\u7447\u7431\u7405\u74a3\u74c1\u6a64\u7490\u74f5\u752d", 29052) : IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7274\u6c93\u7225\u727e\u72d1\u7246\u72bf\u7297\u732f\u735a\u732c\u7305\u7381\u73fa\u73a6\u739a\u7466\u7452\u7424\u7444\u74e0\u6a07\u74b1\u74ea\u74cc", 29052));
                        this.IIlO.addElement(IO00.I1OI("\u711e\u71ef\u7189", 29052));
                    }
                    vector.addElement(IO00.I1OI("\u7130\u717b\u71d7\u71f9\u7188\u727f\u72df\u7225\u727e\u72dd\u72da\u6c7c\u7280\u732f\u723f\u73ac", 29052));
                    this.IIlO.addElement(IO00.I1OI("\u7118\u71fa", 29052));
                    vector.addElement(IO00.I1OI("\u7132\u71f3\u6f17\u71a9\u71f2\u7259\u7251\u6c98\u7217\u72b3\u72e0\u6c02\u729e\u7368", 29052));
                    this.IIlO.addElement(IO00.I1OI("\u7112\u71fc\u71d5\u71ba", 29052));
                    Object[] objectArray = new String[vector.size()];
                    vector.copyInto(objectArray);
                    this.II(21, 10, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7242\u72b9\u7219\u72b3\u72c6\u72b0\u72d0\u736c\u73dd\u736d\u731a\u73e2\u6d6d\u73aa\u73c8\u7460\u74ca\u747a", 29052), (String[])objectArray);
                    return true;
                }
                if (IOO0.IIl(IO00.I1OI("\u7134\u71da\u71f6\u7195\u71b7\u7240\u7273\u7210\u723a", 29052))) {
                    this.II(21, 30, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7242\u72b9\u7219\u72b3\u72c6\u72b0\u72d0\u736c\u73dd\u736d\u731a\u73e2\u6d6d\u73aa\u73c8\u7460\u74ca\u747a", 29052), new String[]{IO00.I1OI("\u712f\u6f6a\u719a\u71b2\u7191\u6cd0\u7258\u725f\u723c\u72f2\u72de\u72bd\u729f\u7378\u734b\u7328\u7302", 29052), IO00.I1OI("\u7137\u71f2\u6f79\u71b4\u71d8\u7263\u7244\u7234\u727e\u72d4\u72db\u72b0\u729f\u732f\u734a\u6d86\u730f\u73e3\u73a0\u73f8\u73c8\u7469\u7441\u6a88\u7407", 29052), IO00.I1OI("\u713f\u71f3\u6f53\u71ba\u71d8\u7279\u7335\u723b\u7213\u7299\u72e2\u72b9\u7291\u732f\u7342\u73a7", 29052), IO00.I1OI("\u713f\u71f3\u71cf\u71a0\u6f3b\u7279\u7216\u723d\u7287\u72f2\u72b8\u7285\u7282\u736e\u7340\u732a\u734c\u73e9\u6d61", 29052), IO00.I1OI("\u712a\u716e\u719a\u70c8\u7118\u727e\u723c\u7206\u721d\u72fd\u72da\u72f1\u7284\u6de2", 29052), IO00.I1OI("\u712c\u71f3\u7158\u71b7\u71d8\u7265\u72d5\u725f\u7220\u72e1\u72d3\u72bf\u7297\u732f\u734c\u6d86\u7366\u73c0\u7347\u73aa\u7380\u7427\u744e\u742a\u6ac5\u74f7", 29052), IO00.I1OI("\u7128\u717a\u71d3\u71f9\u718c\u6cb6\u7259\u725f\u7237\u72f2\u72c2\u72a2\u7285\u7363\u734b\u7347\u7327\u7366\u73c9\u73a1\u73c8\u746f\u7449\u6ae4\u7410", 29052)});
                    return true;
                }
                this.II(21, 0, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7242\u72b9\u7219\u72b3\u72c6\u72b0\u72d0\u736c\u73dd\u736d\u731a\u73e2\u6d6d\u73aa\u73c8\u7460\u74ca\u747a", 29052), new String[]{IO00.I1OI("\u7137\u71f2\u6f79\u71b4\u71d8\u7263\u7244\u7234\u727e\u72d4\u72db\u72b0\u729f\u732f\u734a\u6d86\u730f\u73e3\u73a0\u73f8\u73c8\u7469\u7441\u6a88\u7407", 29052), IO00.I1OI("\u713f\u71f3\u6f53\u71ba\u71d8\u7279\u7335\u723b\u7213\u7299\u72e2\u72b9\u7291\u732f\u7342\u73a7", 29052), IO00.I1OI("\u713f\u71f3\u71cf\u71a0\u6f3b\u7279\u7216\u723d\u7287\u72f2\u72b8\u7285\u7282\u736e\u7340\u732a\u734c\u73e9\u6d61", 29052), IO00.I1OI("\u712a\u716e\u719a\u70c8\u7118\u727e\u723c\u7206\u721d\u72fd\u72da\u72f1\u7284\u6de2", 29052), IO00.I1OI("\u712c\u71f3\u7158\u71b7\u71d8\u7265\u72d5\u725f\u7220\u72e1\u72d3\u72bf\u7297\u732f\u734c\u6d86\u7366\u73c0\u7347\u73aa\u7380\u7427\u744e\u742a\u6ac5\u74f7", 29052), IO00.I1OI("\u7128\u717a\u71d3\u71f9\u718c\u6cb6\u7259\u725f\u7237\u72f2\u72c2\u72a2\u7285\u7363\u734b\u7347\u7327\u7366\u73c9\u73a1\u73c8\u746f\u7449\u6ae4\u7410", 29052)});
                return true;
            }
        }
        return false;
    }

    private boolean Il_O() {
        IO0l iO0l;
        int n;
        IOol iOol = this.IIl0.II;
        for (n = 0; n < 5; ++n) {
            IOO.III iII;
            iO0l = iOol.II[n];
            IOO.III iII2 = iII = iO0l == null || iO0l.II1_() ? null : IOO.II(iO0l.I1l);
            if (iII != null && iII.lOl_ == 13) continue;
            return false;
        }
        for (n = 0; n < iOol.III.length; ++n) {
            iO0l = iOol.III[n];
            if (iO0l.II1_() || iO0l.I1l < 663 || iO0l.I1l > 667 || iO0l.lo0I < 99) continue;
            return true;
        }
        return false;
    }

    private void IIO(int n, int n2) {
        if (n == 0) {
            if (n2 == 0) {
                this.IIl0.III_(50, 318, 336);
            }
            return;
        }
        if (n == 10) {
            if (n2 == 0) {
                if (this.Il_O()) {
                    this.II(55, 100, IO00.I1OI("\u706c\u7168\u71d3\u71f9\u719a\u6cf2\u7258\u7232\u7254\u72e2\u72c7\u7230\u72de\u7321\u7300\u736d\u7302\u73ec\u721a\u7268\u7381\u7427\u744b\u7424\u740a\u74e4\u7482\u74a2\u7488\u7490\u753e\u7549\u753d\u755b\u75a3\u7580\u75f8\u7587\u767e\u6892\u763a\u7653\u7783\u6862\u76f0\u77ec\u7760\u7727\u7738\u770a\u77aa\u77da\u6975\u77c7\u7865\u784d\u782b\u7843\u78ef\u6678\u78b4\u78ff\u7893\u79ee\u7952\u797b\u786b\u674a\u7998\u799f\u6711\u7a6c\u7a14\u7a17\u7a1b\u6456\u7ac4\u7ae1\u7ae4\u7b43\u6593\u7b3e\u7b4a\u7bfd\u7b4a\u7baa\u7bc6\u7c71\u7c56\u62e2\u7c0c\u7ce6\u7c80\u7ccb\u7cbf\u7cdd\u7d6a\u7d4e\u7d33\u7d59\u7df6\u7dd0\u7c66\u7c54\u7e7d\u7e13\u7e31\u7e82\u7eb0\u7edb\u7ea6\u602e\u7f2c\u7f45\u7f22\u61c4\u7fe6\u7f87\u7fb2\u7f97\u8065\u804d\u8025\u8041\u80e2\u9e54\u809e\u80a9\u81ff\u8175\u815d\u8179\u8069\u9f28\u81d8\u81f5\u81c5\u8226\u8217", 29052), new String[]{IO00.I1OI("\u7133\u71d0", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                } else {
                    this.II(55, 101, IO00.I1OI("\u7132\u71fc\u700a\u7078\u7191\u7237\u7242\u7227\u7215\u72fd\u72d5\u72f1\u7292\u6dc4\u730e\u725c\u6d8b\u73ab\u73c8\u6d10\u73c8\u7432\u7406\u7428\u7497\u74ed\u7482\u74b5\u7492\u749e\u7570\u755a\u757c\u7519\u6b51\u7599\u758c\u759f\u68b1\u765b\u765e\u7605\u7672\u7691\u76bd\u768e\u7760\u774a\u776c\u7752\u77b3\u7789\u77b8\u778f\u66a1\u784b\u7864\u7972\u6651\u7881\u79c3\u78b1\u78de\u7969\u67e7\u7932\u795a\u7888\u795a\u79ae\u79d8\u7a3b\u7a1a\u7a59\u7a00\u6442\u7ad9\u7aef\u7a9a\u7b6c\u7b0c\u7b25\u7b99\u7be0\u7b88\u7ba4\u7b8e\u7c70\u7c5d\u6284\u7c0c\u7ca1\u7cd4\u7cd6\u6261\u7c8d\u7d32", 29052), new String[]{IO00.I1OI("\u7133\u71d0", 29052)});
                }
            } else if (n2 == 1) {
                this.III_(55, IO00.I1OI("\u706c\u6f3a\u71d3\u71f9\u7190\u6cce\u725f\u7275\u7202\u7266\u7292\u72a5\u7298\u737a\u6d83\u7339\u734c\u73e7\u73c3\u7323\u7386\u7427\u7450\u752c\u7444\u74f7\u74d0\u6a24\u74e8\u7493\u75fe\u751d\u7532\u74da\u75f3\u7599\u75a9\u7582\u766f\u7615\u7620\u6896\u76b2\u76d2\u7631\u768c\u772e\u774e\u772d\u7704\u77aa\u77dd\u77a0\u6900\u7826\u7851\u66af\u7843\u78e9\u78c9\u666f\u78af\u78de\u797e\u79dd\u7938\u795a\u79cf\u78d1\u79f7\u79a2\u7a67\u64d1\u7a5b\u7b62\u7b21\u6453\u7aac\u7ace\u7b79\u65f9\u7b6b\u7b09\u7be1\u6541\u7ba4\u7bc6\u7c6d\u7cc4\u7c2d\u7c05\u7ca1\u7cce\u7cd8\u7c3e\u7c84\u7d3c\u7d4f\u63fb\u7d10\u7db8\u7dd4\u7d37\u7d96\u7e34\u7e47\u7e3a\u60ac\u7ef9\u7e8f\u7fdf\u7e84\u61cf\u7f46\u7f6a\u7f07\u7fe0\u7e17\u7fe6\u7f96\u8065\u8056\u8078\u806b\u80d4\u80f7\u9e57\u80fd\u80ce\u8121\u811a\u816f\u8110\u81bb\u8196\u8181\u819c\u9cfa\u8212\u8262\u824a\u82af\u829f\u82fe\u8284\u8327\u830a\u831d\u8300\u9d6e\u8386\u83f1\u83de\u8423\u8413\u8474\u8408\u8477\u84ca\u84d5\u9a35\u84db\u852f\u8503\u8578\u8546\u85a1\u85dd\u85f8\u85d3\u8646\u8659\u98b9\u864f\u86b8\u8697\u86ec\u86da\u8732\u8741\u8764\u8747\u87d2\u87cd\u992d\u87c3\u8835\u881b\u8860\u886e\u884c\u88f5\u8890\u88fb\u88b9\u8971\u97df\u8977\u8938\u89fd\u9719\u89a7\u89d2\u8a20\u8a00\u8a27\u8a66\u8adb\u9477\u8aa2\u8aca\u8b6a\u8bc9\u8b24\u8b46\u8bf5\u8bcc\u9564\u8b8c\u8c21\u8c54\u8c57\u8dee\u92a2\u8cf2\u8cdc\u8cfa\u8c8f\u8dec\u8d17\u8d35\u8d8c\u8dfa\u8dd4\u8df2\u8d99\u90b5\u8e5f\u8e6e\u8e09\u9027\u8ec5\u8eea\u8e87\u8f60\u8e97\u8f66\u8f16\u8fe5\u8fd6\u8fc8\u8fb5\u906f\u906f\u901e\u906c\u904c\u90a1\u909a\u90e8\u90d8\u9167\u915e\u913c\u8fcb\u91e6\u9192\u91b6\u9199\u8cac\u9243\u926d\u920b\u92e2\u924b\u92e5\u92c8\u9336\u9306\u9326\u9305\u93f3\u93d1\u93b4\u938c\u939a\u943e\u946b\u94bc\u9415\u94fd\u94b1\u948c\u9498\u9566\u9515\u9565\u9549\u95b2\u95c5\u8b67\u9581\u9669\u960d\u9638\u9603\u9660\u96c4\u96e8\u96d6\u9726\u9777\u9725\u9672\u97e3\u9781\u97a3\u897a\u978e\u983d\u980d\u9868\u9872\u98c9\u98d0\u8670\u9898\u9935\u9940\u993b\u98c2\u874e\u99de\u99a8\u99ce\u9b1c\u9b9c\u84a8\u9a09\u9aa9\u9adc\u9ab5\u9a87\u9b6a\u9b04\u9b37\u85c3\u9be8\u9b80\u9bc9\u9ab7\u9bdd\u9c68\u9c49\u82bf\u9c59\u9cfb\u8250\u9cb7\u9cd5\u9d77\u9d5b\u9d3b\u83ce\u9dfe\u9d8f\u9dac\u9d84\u9e62\u9e43\u9e42\u9f79\u8037\u9ec9\u9ee6\u9e82\u81b3\u9f53\u9f62\u9f36\u9fe8\u9ff6\u9fcd\u9ffd\u9f88\ubeba\ua053\ua079\ua00e\ua1fe\ua096\ua0a1\ua086\ubff6\ua112\ua132\ubf97\ua1ee\ua18e\ua1a3\ua18b\ua3bb\ua38b\ua220\ua248\ua396\ubc65\ua2e5\ua28a\ua36b\ubd8f\ua32f\ua340\ua30b\ua3f6\ua20d\ubd03\ua395\ua47d", 29052));
            }
            return;
        }
        if (n == 100 && n2 == 0 && this.Il_O()) {
            this.IIIO(55, IO00.I1OI("\u713e\u71d2\u71f6\u7195", 29052));
        }
    }

    private static long III1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    private void IloI(int n) {
        IOol iOol = this.IIl0.II;
        if (n == 0) {
            if (iOol._lOO == 0) {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u7193\u727f\u72c2\u723b\u7213\u72b3\u72d1\u7222\u72d0\u737b\u735c\u7322\u7302\u73ec\u738a\u73ab\u7389\u7469\u7441\u7465\u740c\u6a5a\u74cb\u74e0", 29052));
                return;
            }
            if (this.IIl0.IIIl.Il0()) {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u713b\u6f3e\u71cf\u71f9\u71ac\u73a7\u6ced\u723b\u7213\u72b3\u72f1\u7361\u6c2b\u737f\u730e\u725c\u738f\u73ab\u73d2\u73bc\u6d4d\u7473\u7406\u742d\u740d\u6a44\u74cc\u74e0", 29052));
            } else {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u713b\u6f3e\u71cf\u71f9\u71ac\u73a7\u6ced\u723b\u7213\u72b3\u72f1\u7361\u6c2b\u737f\u730e\u725c\u738f\u73ab\u73d2\u73bc\u6d4d\u7473\u7406\u742d\u740d\u6a44\u74cc\u74e0", 29052));
            }
        } else if (n == 1) {
            if (iOol._lOO == 0) {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u719b\u6cb0\u7258\u7275\u7213\u72fa\u72d3\u72f1\u729e\u7367\u6d83\u733d\u734c\u73e9\u73cb\u73a7\u738f\u7427\u744e\u6a9c\u740d\u74a3\u75b3\u6a02\u74c0\u75ee\u7577\u6bfe\u7531\u755b\u75fe\u75d8\u75b6\u759f\u7638", 29052));
                return;
            }
            if (iOol.IO0I != 0L && iOol.IO0I >= IO00.III1()) {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u70e9\u72f4\u7216\u723b\u721c\u6c3e\u72dc\u72f1\u72b3\u736e\u735e\u733e\u7319\u73e7\u73cf\u73e9\u73aa\u7466\u7448\u7422\u7444\u74eb\u7456\u74ac\u74c0\u7491\u757f\u7544\u757c\u7509\u6b49\u75d0\u75f6", 29052));
                return;
            }
            iOol.IO0I = System.currentTimeMillis();
            ++iOol._l0I;
            ++iOol._l0;
            this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u70e9\u72f4\u7216\u7344\u721d\u6c50\u72df\u72f1\u7294\u736e\u7340\u7325\u734c\u73fd\u734a\u73e9\u7386\u746f\u6a8b\u742b\u7444\u7592\u7512\u6a22\u7483\u74df\u752f\u751d\u751f\u751a\u75ea\u75ca\u75ad\u759b\u7673\u7615\u7616\u7612\u76fc\u76d6\u76fe", 29052));
            this.IIl0.I__O();
        } else if (n == 2) {
            if (iOol.IO_l < 40000000000L) {
                this.IIl0.IIIl.IIol(IO00.I1OI("\u7137\u71d3\u716e\u7197\u71bf\u7237\u7326\u6cb3\u7254\u72c0\u6c5a\u7292\u72d0\u7342\u6d8e\u7303\u7324", 29052));
                return;
            }
            if (!this.IIl0.II01(156)) {
                return;
            }
            this.IIl0.III_(156, 100 + (int)(Math.random() * 21.0) - 10, 336);
        } else if (n == 3) {
            this.IIIO(47, IO00.I1OI("\u712f\u71d3\u71f5\u7189\u71a7\u7254\u727a\u7214\u723a", 29052));
        }
    }

    private void II(Vector vector, String string, String string2) {
        vector.addElement(string);
        this.IIl_.addElement(string2 == null ? "" : string2);
    }

    private void IIIO(int n, String string) {
        if (SantaShopPatch.handleRoot(this, this.IIl0, n, string)) {
            return;
        }
        Vector vector = IOO.IIII(n);
        for (int i = 0; i < vector.size(); ++i) {
            IOO.III1 iII1 = (IOO.III1)vector.elementAt(i);
            if (!string.equals(iII1.lIlO)) continue;
            int n2 = 0;
            for (int j = 0; j < iII1.II.length; ++j) {
                n2 += iII1.II[j].II.length;
            }
            if (n2 == 0) break;
            this.IIl0.II.II(iII1);
            return;
        }
        this.IIl0.IIIl.IIol(IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232\u7254\u72fd\u7252\u72a8\u72d0\u7367\u7347\u6d8a\u7302\u73ab\u73c9\u73a1\u7258\u7466\u7406\u7426\u7497\u74a3\u74ca\u7421\u748e\u7498", 29052));
    }

    boolean IIl_(int n, int n2) {
        if (LyForgeFast.click(this._I_I, n2)) {
            this.IIl0.IIIl.IIol(LyForgeFast.status());
            return true;
        }
        if (KamePetPatch.dispatch(this, this.IIl0, n, this._I_I, n2)) {
            return true;
        }
        if (n != this.l0ol || n != 5 && n != 24 && n != 13 && n != 39 && n != 21 && n != 10 && n != 11 && n != 12 && n != 38 && n != 37 && n != 45 && n != 53 && n != 15 && n != 7 && n != 9 && n != 20 && n != 0 && n != 1 && n != 2 && n != 8 && n != 14 && n != 16 && n != 17 && n != 18 && n != 19 && n != 22 && n != 25 && n != 28 && n != 46 && n != 55 && n != 63 && n != 60 && n != 47 && n != 42 && n != 43 && n != 44 && n != 56 && n != 67 && n != 82 && n != 83 && n != 54 && n != 50) {
            return false;
        }
        if (this.IIl0.II.III1(n, this._I_I, n2)) {
            return true;
        }
        if (n == 24) {
            return this.IIl0.II.IIll(this._I_I, n2);
        }
        if (n == 50) {
            return this.IIl0.II.II1(this._I_I, n2);
        }
        switch (n) {
            case 5: {
                if (this.IIl0.II.IIlI(this._I_I, n2)) {
                    return true;
                }
                if (this.IIl0.II.IIlI(this._I_I, n2)) {
                    return true;
                }
                if (this.IIl0.II.IIlI(this._I_I, n2)) {
                    return true;
                }
                if (this._I_I == 100) {
                    if (n2 == 0) {
                        this.IIl0.II.lI1();
                    }
                    return true;
                }
                if (this._I_I == 1655) {
                    this.IIl0.IIIl.I1Io(n2);
                    return true;
                }
                if (this._I_I == 0) {
                    if (n2 == 0) {
                        this.lloI();
                    } else if (n2 == 1) {
                        this.II(5, 1, IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u7195\u7262\u6ce7\u723b\u7254\u7382\u6c67\u72b8\u72d0\u7341\u6df7\u7324\u734c\u73df\u6d0b\u73a0\u73c8\u746c\u744e\u74a4\u7407\u7489\u74d4\u6a1a\u7489\u74df\u7579\u7554\u75bd\u755b\u75f6\u7559\u75f8", 29052) + I_1[this.IIl0.II._1I] + IO00.I1OI("\u715c\u71cf\u71c8\u71f9\u718e\u72f7\u7258\u7232\u7254\u72ac", 29052), new String[]{IO00.I1OI("\u7131\u6f44\u71b0\u7197\u6f21\u727e\u7216\u7201\u6cd5\u72fa", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    } else if (n2 == 2) {
                        this.II(5, 2, IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u719b\u72e4\u7216\u7238\u7201\u6c42\u72dc\u72f1\u729d\u6dd0\u730e\u7303\u6db5\u73e2\u738a\u739d\u6d49\u746e\u742c\u7433\u6abf\u74ea\u7482\u74a6\u7489\u741e\u753e\u7551\u75bc\u755b\u75ab\u7589\u75e8\u75d7\u7678\u7652\u6899\u7610\u76b2\u76c7\u7630\u76e5\u777a\u77cc\u7725\u774b\u77e6\u6904\u77b8\u77c7\u7861\u784c\u78a5\u7843\u78f4\u7841\u78ae\u78b8\u78de\u796c\u7949\u793a\u7903\u79b9\u79d4\u6776\u799f\u7a35\u7a56\u7a32\u7a1c\u7ab1\u7ba1\u6468\u7a9b\u7b2d\u7b47\u7b23\u7b9e\u7be7\u7bcf\u7bf8", 29052), new String[]{IO00.I1OI("\u7131\u6f44\u71b0\u7197\u6f21\u727e\u7216\u7203\u723d\u72c3", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    }
                } else if (n2 == 0) {
                    this.II11(this._I_I == 2);
                }
                return true;
            }
            case 10: 
            case 11: 
            case 12: {
                int n3;
                if (n == 10 && (this._I_I == 8310 || this._I_I == 8312 || this._I_I == 8313)) {
                    return this.IIl0.II.IIl(this._I_I, n2);
                }
                if (n == 10 && this.IIl0.II.lOlo == 84) {
                    this.II_o(this.IIl0.II.lOlI + 24, -1);
                    return true;
                }
                if (n == 12 && this._I_I >= 20) {
                    int n4;
                    if (this._I_I == 22) {
                        if (n2 == 0) {
                            this.II_o(19, 1100);
                        }
                        return true;
                    }
                    int n5 = n4 = this._I_I == 21 ? n2 - 1 : n2;
                    if (this._I_I == 21 && n2 == 0) {
                        this.IIl0.IIIl.IIol(IO00.I1OI("\u713f\u71f3\u6f05\u71ad\u71d8\u7265\u6ce5\u723c\u7254\u72f1\u72d3\u72ff\u72de\u7321", 29052));
                        return true;
                    }
                    if (n4 == 0) {
                        this.II_o(109, 295);
                    } else if (n4 == 1) {
                        this.II_o(68, 90);
                    }
                    return true;
                }
                if (n == 11) {
                    n3 = n2 == 0 ? 24 : (n2 == 1 ? 26 : (n2 == 2 ? 84 : -1));
                } else if (n == 12) {
                    n3 = n2 == 0 ? 24 : (n2 == 1 ? 25 : (n2 == 2 ? 84 : -1));
                } else {
                    int n6 = n2 == 0 ? 25 : (n2 == 1 ? 26 : (n3 = n2 == 2 ? 84 : -1));
                }
                if (n3 > 0) {
                    this.II_o(n3, -1);
                }
                return true;
            }
            case 38: {
                if (n2 == 0) {
                    this.III_(38, IO00.I1OI("\u714e\u71ab\u719a\u71b7\u70fb\u727a\u7216\u7221\u7206\u7323\u6c69\u72b2\u72d0\u736d\u6de3\u7323\u734c\u73ca\u73c4\u73ad\u739a\u7468\u744f\u7421\u7444\u74f0\u7443\u74b5\u74c0\u748b\u7576\u6bda\u757c\u746a\u7579\u7599\u74c9\u7516\u7678\u765d\u7674\u7611\u6833\u76d8\u76f0\u7681\u7766\u77de\u7721\u774b\u77e8\u690a\u77a7\u77c7\u7870\u66e2\u7864\u7817\u78f0\u7840\u78a9\u78ff\u79ef\u67b8\u7948\u797b\u7919\u677e\u79d9\u79f7\u79a5\u7ae1\u7a5a\u7a34\u7a1d\u7afa\u7ac5\u7aef\u7a98\u7bed\u7b0c\u7b08\u7b0b\u7a98\u7b45\u7ba4\u7bca\u7c25\u7c74\u7cb7\u7c01\u7c75\u7ccc\u7c4b\u7cfe\u7cd3\u7d32\u7d15\u7d50\u7d2b\u7df1\u7d5d\u7db8\u7d92\u7e34\u7e60\u7ea6\u7e1f\u7ef7\u7ec0\u7ea5\u7e98\u7f2c\u7f5d\u7fa6\u7f49\u7fea\u6160\u7fa8\u7f8d\u8024\u8057\u802b\u800c\u80a0\u80f1\u8054\u80b3\u80dc\u800a\u81d9\u8179\u811b\u81ff\u9f09\u81a1\u81d4\u8267\u8240\u83e1\u9cab\u82ec\u828e\u83dc\u821f\u832b\u8344\u83a3\u8306\u83a7\u83cd\u83ad\u8310\u846d\u8445\u8461\u8414\u8417\u9a5d\u849d\u84a8\u8493\u857b\u8554\u8578\u8510\u85ff\u85d4\u85f4\u8587\u8660\u989c\u863e\u864f\u879f\u864c\u86a2\u8683\u8724\u8707\u8766\u876d\u87d2\u994e\u87e4\u86f2\u88f1\u8801\u8951\u96e0\u8810\u88bd\u88d2\u88ba\u8883\u8939\u895a\u979a\u8918\u89b5\u89d7\u89bb\u8908\u8a7f\u8a57\u8a6f\u8a1a\u8a6d\u8ac2\u8aeb\u8a9a\u8b61\u8bc9\u8b67\u8b32\u8bf7\u8b45\u8baa\u8bc2\u8d11\u9285\u8c4b\u8c7e\u8c16\u8cf4\u8c4f\u8cb4\u8c9e\u8d38\u8d5f\u9397\u8d55\u8de0\u8ddb\u8c62\u8c50\u8e7e\u8e48\u8e6e\u8e19\u8ee5\u9014\u8ea9\u8ee3\u8f4b\u8f4f\u8fa7\u8f10\u8fa4\u8fd5\u8f22\u8fc1\u906d\u8ea6\u901e\u9030\u901d\u90e2\u909a\u90b4\u8e57\u9179\u9116\u9126\u8fa5\u91fd\u91d5\u91f1\u9183\u92fc\u925a\u926d\u9202\u92e3\u8c77\u92e9\u9284\u8dae\u9348\u9365\u9310\u93f1\u8d73\u93af\u93c0\u938b\u8abf\u9454\u947c\u940f\u8a3d\u94d7\u94f8\u949f\u8bb1\u9558\u9574\u9510\u8b75\u95d0\u95f0\u958c\u96fa\u9643\u962b\u964b\u96fe\u96d0\u96e8\u96a4\u9767\u9755\u9737\u9716\u97ee\u97c4\u97ee\u97f1\u97d0\u9817\u987f\u9833\u989b\u98ec\u9898\u98a3\u9883\u996c\u9914\u9930\u981b\u99ff\u99d7\u99ef\u9982\u9aed\u9a0c\u9a38\u9a03\u9a63\u9add\u9ae7\u9a9e\u9b64\u9b5d\u9b27\u9b03\u9ba1\u9bce\u9bd7\u9a6e\u9b93\u9c7b\u9c1b\u9c39\u9d10\u9cf6\u9cd0\u9cf6\u9c9e\u9d7c\u9dc7\u9d3c\u9d16\u9db0\u9ddb\u9da6\u832e\u9e2c\u9e47\u9eaa\u9e04\u9ea8\u9ec0\u9e2a\u9ec5\u9e15\u9e93\u81a1\u9f02\u9fa0\u9ffd\u8173\u9fb3\u9fdc\ua05a\ua054\ua03d\ua00a\ua0f8\ua0df\ua0b1\ua0d4\ua160\ua1d3\ua125\ua150\ua1fb\ua1c6\ubf2a\ua1c2\ua225\ua204\ua243\ua22b\ua2ef\ubc6f\ua2e5\ua287\ua3f0\ua302\ua312\ua394\ua311\ua3f9\ua3d2\ua3b7\ua38e\ua43a\ua454\uba83\ua41e\ua4b6\ua4d6\ua427\ua4d3\ua566\ua559\ubb93\ua54f\ua49f\ua54c\ua5a2\ua583\ua62a\ua64b\ub8e9\ua60e\ua6a6\ua6c7\ub809\ua68d\ua722\ua742\ua728\ua7a5\ua710\ua7fa\ua7b6\ua7b6\ub943\ua839\ua85b\ua83f\ua897\ua8e0\ua894\ua9c2\ua811\ua931\ua953\ua927\ub7d1\ua9ad\ua9d8\ub76a\ua985\uaa29\uaa5c\uaa2f\uaa86\uaaeb\uaacc\uaae3\uaa81\uabf5\uab4e\uab58\uab7e\uab1e\ub54b\uab9b\uabb7\uab18\uac61\uac17\uac22\uac1d\ub249\uacda\uacf2\uac96\uad79\uad4e\uad20\uad67\uadfa\uad4b\uadea\uad8a\uae60\uaec6\uae33\uae45\uaef5\uaed6\uaea3\uae98\uaf20\uaf69\ub1ff\uaf7d\uaf0d\uafee\uaf5b\uaff9\uaf93\ub07f\uaedf\ub075\ub165\uae50\ub092\ub0b2\uae19\ub17a\ub10e\ub11e\ub198\ub1e5\ub1cd\ub1a6\ub183\ub272\ub208\ub26b\ub24a\ub289", 29052));
                } else if (n2 == 1) {
                    if (this.IIl0.II._lOI < 20) {
                        return true;
                    }
                    if (this._I_I == 1) {
                        this.II_o(24, -1);
                    } else if (this._I_l == 0) {
                        this._I_l = 60;
                        this.IIl0.II(new IO0o(-65).IIII(this.IIl0.II.I1l).II(1));
                        this.IIl0.II(new IO0o(-105).III(60).II(0));
                    }
                } else if (this._I_I == 0) {
                    this.IIl0.IIIl.IIol(IO00.I1OI("\u7137\u71f3\u714e\u71b7\u719f\u7237\u7242\u723d\u6cb7\u72b3\u72c6\u72b9\u6c01\u736c\u730e\u7325\u7305\u6d4c\u73c4", 29052));
                }
                return true;
            }
            case 37: {
                if (n2 == 0) {
                    this.IIIO(37, this.IIl0.II.lOlo == 102 ? IO00.I1OI("\u713e\u71ce\u71f4\u7194\u71b9\u7248\u7270\u7200\u7220\u72c6\u72e0\u7294", 29052) : IO00.I1OI("\u7137\u71da\u71e8\u7190\u71b6", 29052));
                }
                return true;
            }
            case 45: {
                if (n2 == 0 && this.IIl0.II.lOlo == 50) {
                    this.IIl0.III_(48, 354, 240);
                }
                return true;
            }
            case 53: {
                if (n2 == 0) {
                    if (this.IIl0.II.lOlo == 19) {
                        this.IIl0.III_(126, 200 + (int)(Math.random() * 200.0) - 100, 360);
                    } else if (this.IIl0.II.lOlo == 126) {
                        this.IIl0.III_(19, 1000 + (int)(Math.random() * 200.0) - 100, 360);
                    }
                }
                return true;
            }
            case 15: {
                if (n2 == 0) {
                    this.III_(15, this.IIl0.IIIl.II1I());
                } else if (n2 == 1) {
                    this.IIl0.II.l1o_();
                }
                return true;
            }
            case 7: 
            case 9: {
                if (n2 == 0) {
                    this.IIIO(n, n == 7 ? IO00.I1OI("\u713e\u71ce\u71f4\u7194\u71b9", 29052) : IO00.I1OI("\u713d\u71cb\u71ea\u718c\u71b4\u7252", 29052));
                }
                return true;
            }
            case 20: {
                if (this._I_I == 0) {
                    if (n2 == 3) {
                        this.II(20, 1, IO00.I1OI("\u7128\u71fa\u719a\u71aa\u6f45\u7237\u7327\u73e5\u7215\u72b3\u72d1\u72be\u729e\u732f\u723f\u7324", 29052), new String[]{IO00.I1OI("\u712a\u6f5a\u71b0\u71ad\u7190\u6cb0\u7258\u7275\u7365\u72fa\u6c75\u72bf", 29052), IO00.I1OI("\u7128\u71f3\u715b\u71b7\u7190\u7237\u7327\u6c9e\u7215\u7299\u72f9\u72b0\u7299\u7360", 29052), IO00.I1OI("\u713f\u71f4\u71d4\u71d3\u70e9\u73a7\u6ceb\u723b\u7213\u7299\u72c0\u6c7e\u729e\u732f\u723f\u6d94\u730f", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    } else {
                        this.llo0();
                    }
                } else if (this._I_I == 1) {
                    if (n2 == 0) {
                        this.II_o(45, 354);
                    } else if (n2 == 1) {
                        this.IIl0.III_(50, 318, 336);
                    } else if (n2 == 2) {
                        this.llo0();
                    }
                }
                return true;
            }
            case 0: 
            case 1: 
            case 2: {
                if (n2 == 0 && this._I_I == 0) {
                    this.llo_();
                } else if (n2 == 1 && this._I_I == 0) {
                    this.IIl0.IIIl.II.Ioo0();
                }
                return true;
            }
            case 8: {
                if (n2 == 0) {
                    if (this.IIl0.II.lOlI == 1) {
                        this.IIIO(8, IO00.I1OI("\u7138\u71de\u71f4\u719d\u71bd", 29052));
                    } else {
                        this.III_(8, IO00.I1OI("\u7124\u71f2\u71d4\u71f9\u7194\u6cc0\u725f\u7275\u7215\u72fd\u72da\u72fd\u72d0\u736a\u7343\u736d\u730f\u73e3\u6d63\u73e9\u738a\u74e6\u7448\u7465\u7575\u6a50\u7482\u74a2\u7488\u7490\u753e\u7559\u75be\u7515\u75ba\u75cd\u6b01\u7594\u7636\u767b\u7635\u761e\u682d\u76d2", 29052));
                    }
                }
                return true;
            }
            case 14: {
                if (n2 == 0) {
                    this.III_(14, this.IIl0.IIIl.II1I());
                } else if (n2 == 1) {
                    this.IIl0.II.l1o_();
                }
                return true;
            }
            case 17: {
                if (this._I_I == 8301 || this._I_I == 8302) {
                    return this.IIl0.II.III0(this._I_I, n2);
                }
                if (n2 == 0) {
                    this.IIl0.II.llIl();
                } else if (n2 == 1) {
                    this.IIl0.II.IooI();
                } else if (n2 == 2) {
                    this.IIl0.IIIl.IIol(IO00.I1OI("\u713f\u71f3\u6f53\u71ba\u71d8\u7279\u7335\u723b\u7213\u72b3\u72d1\u72b9\u6c39\u732f\u734d\u73be\u734c\u73ff\u73c2\u6d0a\u73c8\u7473\u744e\u6ab4\u7407\u74a3\u74ca\u74a8\u6a27\u7491\u753e\u7556\u7534\u7512\u75ba\u75da\u752b\u75d7\u7665\u68c4\u7674\u7618\u76fb\u6876\u76be\u76cf\u776a\u7744\u6989\u7705\u77aa\u77db\u77a9", 29052));
                }
                return true;
            }
            case 18: {
                this.Il0o(n2);
                return true;
            }
            case 19: {
                if (this._I_I == 2) {
                    this.IIl0.IIIl.IIol(IO00.I1OI("\u713f\u71f3\u700a\u71b8\u71d8\u727f\u6c97\u7275\u721c\u6c2c\u72c6\u72f1\u73e1\u6dde\u7347\u736d\u7318\u73e3\u6d4d", 29052));
                    return true;
                }
                if (this.IIl0.II.III1(19, this._I_I, n2)) {
                    return true;
                }
                if (n2 == 3) {
                    this.II_o(48, 354);
                } else if (n2 == 4) {
                    this.IIl0.II.ll0I();
                } else if (n2 <= 4) {
                    this.llo0();
                }
                return true;
            }
            case 22: {
                if (this._I_I == 0) {
                    this.llo0();
                }
                return true;
            }
            case 54: {
                return this.IIl0.II.III1(54, this._I_I, n2);
            }
            case 25: {
                if (!this.IIl0.II.III_(this._I_I, n2)) {
                    // empty if block
                }
                return true;
            }
            case 28: {
                if (n2 == 0) {
                    this.III_(28, IO00.I1OI("\u713f\u6f76\u71db\u71f9\u7190\u72f7\u7258\u7232\u7254\u72f0\u72da\u72a4\u7289\u73e5\u7340\u736d\u7302\u73e3\u6d07\u73a7\u73c8\u746c\u74db\u7465\u7403\u6a6e\u74cb\u74e1\u748d\u748a\u757f\u751d\u753e\u759a\u75f4\u7599\u75ae\u6b5a\u7662\u7615\u7624\u761b\u683b\u76dc\u76da\u76ac\u7766\u69e4\u776c\u771d\u6951\u77c0\u77e8\u77d2\u7826\u784b\u7823\u66ae\u78e1\u78ab\u7887\u78b6\u781f\u793d\u7948\u7929\u67b1\u79b9\u79d3\u792a\u79d6\u7a72\u64d9\u7a3a\u7a52\u7aa0\u7a80\u7aa4\u7ac3\u7b3f\u7b1c\u7b7b\u7b3e\u7bfb\u7b88\u7bb1\u7b06\u7c6b\u7c43\u7c63\u7c0a\u7cee\u6217\u7cdc\u7cfe\u7ccf\u7d31\u7d09\u7d31\u7d59\u7df6\u7dd0\u631b\u7d96", 29052));
                } else if (n2 == 1) {
                    this.llo0();
                }
                return true;
            }
            case 42: 
            case 43: {
                IOol iOol = this.IIl0.II;
                if (n == 43 && this._I_I == 0) {
                    if (n2 == 2) {
                        this.II(43, 10, IO00.I1OI("\u713f\u71f4\u71d4\u71f9\u7195\u7262\u6ce7\u723b\u7254\u72fd\u7250\u72bf\u7297\u732f\u7349\u7324\u6db7\u73e2\u738a\u73a1\u6d49\u7469\u7406\u7436\u6a8d\u74e0\u7482\u74ac\u6a41\u7491\u7576\u751d\u753f\u7513\u75f5\u7599\u75ba\u6b54\u7678\u7615\u7620\u761b\u7670\u76df\u76f0\u7687\u776f\u7754\u776c\u767a\u694d\u7789\u77bc\u690a\u7839", 29052), new String[]{IO00.I1OI("\u713e\u6f38\u71d4\u71f9\u718c\u727f\u72d4\u723b", 29052), IO00.I1OI("\u706c\u6f5c\u719a\u71ad\u6f15", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    } else if (n2 < 2) {
                        this.llo0();
                    }
                    return true;
                }
                if (this._I_I == 0 || this._I_I == 10) {
                    if (n2 == 0) {
                        if (iOol._11_ < 5) {
                            this.II(n, 11, IO00.I1OI("\u7128\u71fa\u719a\u71aa\u6f45\u7237\u7242\u7227\u7201\u72ea\u6c73\u72bf\u72d0\u7361\u722d\u7323\u730b\u73ab\u73c6\u7279\u6d0b\u7469\u7441\u7465\u7403\u74ea\u7458\u74b1\u74c0\u749c\u7571\u7553\u757c\u7516\u6b45\u7599\u75bf\u759e\u68cd\u765c\u7674\u761b\u6833\u76df\u76f0\u769c\u69e7\u774e\u776c\u7706\u692b\u77c7\u77a0\u77c7\u7865\u66c2\u7825\u7843\u78e0\u6602\u78ae\u78ff\u788a\u7975\u79de\u7935\u795a\u79f5\u7952\u79b9\u79d6", 29052) + IO00.IIlI(iOol.III_()), new String[]{IO00.I1OI("\u7132\u7179\u71d4\u71be\u71f2\u7270\u725f\u6c8e\u721d\u72b3\u72da\u6c70\u729e\u7305\u735d\u6da4\u730f\u73ab\u73c7\u6d68\u7386\u746f", 29052), IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7279\u7251\u7234\u720d\u7299", 29052) + IO00.IIlI(50000000L) + IO00.I1OI("\u715c\u71ed\u715a\u71b7\u719f", 29052), IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                        } else {
                            this.II(n, 99, IO00.I1OI("\u712f\u6f72\u71d9\u71f9\u7195\u6cb6\u7258\u723d\u7254\u72f0\u6c55\u72b0\u72d0\u736c\u7341\u7323\u734c\u729a\u7349\u73e9\u72f9\u6aa6\u7452\u7465\u7410\u6a58\u74cb\u74e1\u7487\u7496\u6bc5\u7554\u757c\u7513\u6b3b\u75d7\u75f8\u759f\u767f\u68f2\u763a\u7653\u76e6\u6810\u76b9", 29052), new String[]{IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                        }
                    } else if (n2 == 1) {
                        if (iOol.III == null) {
                            this.IIl0.IIIl.IIol(IO00.I1OI("\u7137\u71f3\u714e\u71b7\u719f\u7237\u7242\u723d\u6cb7\u72b3\u72c6\u72b9\u6c01\u736c\u730e\u7325\u7305\u6d4c\u73c4", 29052));
                        } else if (n == 43) {
                            this.IIl0.II.IlO_();
                        } else if (this.IIl0.II.IlOO()) {
                            this.II(n, 99, IO00.I1OI("\u712f\u6f72\u71d9\u71f9\u7195\u6cb6\u7258\u723d\u7254\u72f0\u6c55\u72b0\u72d0\u721e\u6de9\u736d\u730f\u73e4\u73c4\u73e9\u72f9\u74e4\u7406\u7554\u6ac5\u74f7\u7482\u74b5\u6a3b\u7496\u753e\u755a\u7535\u6ba0\u75f3\u7599\u75b0\u6b56\u7678\u7615\u763c\u761a\u6855\u76df\u76f0\u769b\u69af\u7744", 29052), new String[]{IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                        } else {
                            this.II(n, 12, IO00.I1OI("\u7128\u71fa\u719a\u71aa\u6f45\u7237\u7242\u7227\u7201\u72ea\u6c73\u72bf\u72d0\u7361\u722d\u7323\u730b\u73ab\u73c6\u7279\u6d0b\u7469\u7441\u7465\u7403\u74ea\u7458\u74b1\u74c0\u749c\u7571\u7553\u757c\u7516\u6b45\u7599\u75bf\u759e\u68cd\u765c\u7674\u761b\u6833\u76df\u76f0\u769c\u69e7\u774e\u776c\u7706\u692b\u77c7\u77a0\u77c7\u7865\u66c2\u7825\u7843\u7993\u6666\u78e0\u78ab\u6613\u793d\u7950\u79b1\u7914\u79b9", 29052) + IO00.IIlI(this.IIl0.II.III_()), new String[]{IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7279\u7251\u7234\u720d\u7299", 29052) + IO00.IIlI(50000000L) + IO00.I1OI("\u715c\u71f5\u71dd\u6f14\u719b", 29052), IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                        }
                    }
                } else if (this._I_I == 12) {
                    if (n2 == 0) {
                        this.IIl0.II.IlO_();
                    }
                } else if (this._I_I == 11) {
                    if (iOol._11_ >= 5) {
                        this.IIl0.IIIl.IIol(IO00.I1OI("\u713b\u71f2\u6f61\u71b0\u71d8\u727f\u6c97\u723b\u7254\u72e0\u6c5b\u72b2\u72d0\u7362\u6d8f\u7323\u7304\u73ab\u73c9\u6d2e\u7389\u7427\u7444\u6ae4\u740a\u74a3\u75b3\u7422\u74c0\u75ee\u6bbf\u7549\u757c\u750f\u6b41\u75d0\u75f8\u759a\u68ff\u7656\u7674\u7607\u6843\u76d8\u76f0\u77fe\u776f\u770d\u7724\u7702\u694d\u77c7\u77e8\u7793\u66a7\u784c", 29052));
                        return true;
                    }
                    if (n2 == 0) {
                        if (iOol.IO0O == 0L && iOol.IO_l >= iOol.IIIO()) {
                            iOol.IO0O = System.currentTimeMillis() + 8640000L;
                            this.IIl0.IIIl.l1OI();
                            this.IIl0.I__O();
                        } else {
                            this.IIl0.IIIl.IIol(IO00.I1OI("\u712f\u6f72\u71d9\u71f9\u7195\u6cb6\u7258\u723d\u7254\u72f0\u6c55\u72b0\u72d0\u736d\u6d8f\u7323\u734c\u73e0\u73c2\u733d\u7386\u7460\u7406\u7554\u6a83\u74a3\u75b3\u6a02\u74c0\u748b\u7576\u6bcc\u753f\u755b\u75f2\u75d0\u6b1f\u7599", 29052));
                        }
                    } else if (n2 == 1) {
                        if (iOol.Il11 >= 50000000L) {
                            ++iOol._11_;
                            iOol.Il11 -= 50000000L;
                            this.IIl0.IIIl.IIol(IO00.I1OI("\u713b\u71f2\u6f61\u71b0\u71d8\u727f\u6c97\u723b\u7254\u72e0\u6c5b\u72b2\u72d0\u7362\u6d8f\u7323\u7304\u73ab\u73c9\u6d2e\u7389\u7427\u7444\u6ae4\u740a\u74a3\u75b3\u7422\u74c0\u75ee\u74ae\u6bde\u753f\u755b\u75ee\u74ba\u75b6\u7590\u7636\u7659\u76be\u761d\u76b2\u7680\u76f0\u768d\u69a3\u774e", 29052));
                            this.IIl0.IIIl.l1_();
                            this.IIl0.ll_0();
                            this.IIl0.IIIl.l1O0();
                            this.IIl0.I__O();
                        } else {
                            this.IIl0.IIIl.IIol(IO00.I1OI("\u713e\u6f3a\u71d4\u71f9\u7193\u727f\u72c2\u723b\u7213\u72b3\u73a3\u6c36\u72d0\u7379\u73ce\u7323\u730b\u73ab\u72bb\u6d0a\u73c8\u746a\u6af9\u7469\u7444\u74e0\u7450\u74af\u74c0\u748b\u7576\u7554\u6be3\u750e\u75ba", 29052) + IO00.IIlI(50000000L - iOol.Il11) + IO00.I1OI("\u715c\u71ed\u715a\u71b7\u719f", 29052));
                        }
                    }
                }
                return true;
            }
            case 44: {
                if (this._I_I == 0) {
                    if (n2 == 0) {
                        this.IIl0.III_(48, 354, 240);
                    } else if (n2 == 1) {
                        if (I0Io.II(154) != null) {
                            this.IIl0.III_(154, 200, 312);
                        } else {
                            this.llo0();
                        }
                    }
                } else if (this._I_I == 1) {
                    if (n2 == 0) {
                        if (I0Io.II(155) != null) {
                            this.IIl0.III_(155, 111, 792);
                        } else {
                            this.llo0();
                        }
                    }
                } else if (this._I_I == 2) {
                    if (n2 == 0) {
                        this.IIl0.III_(154, 200, 312);
                    }
                } else if (this._I_I == 3) {
                    if (n2 == 0) {
                        this.IIl0.II.llOO();
                    } else if (n2 == 1) {
                        this.II(44, 4, IO00.I1OI("\u713f\u71fa\u71de\u71b0\u719b\u7237\u7327\u72b6\u7254\u72f1\u6c79\u72f1\u7280\u7367\u73d7\u736d\u7318\u73e3\u6d4d\u73b0\u73c8\u7445\u7447\u7427\u740d\u74e7\u74cb\u74e1\u7494\u7497\u75ea\u7554\u757c\u7516\u75f3\u7553\u75b6\u75fd\u767e\u76d6\u762d\u7653\u76ff\u76d0\u76be\u7688\u772e\u774f\u77a0\u7705\u77e2\u7789\u77a0\u771d\u7872\u7805\u782a\u7960\u78ec\u78c6\u78e0\u78b3\u794e\u67fe\u7952\u793c\u795a\u7888\u6707\u79b9\u79d6\u7b04\u7ad6\u7a2a\u7a78\u7af9\u7a4a\u7abb\u7ace\u7b6e\u658d\u7b25\u7b4a\u7be7\u7aab\u7ba9\u7b81\u7c25\u7c48\u7df3\u6281\u7cef\u7cc7\u7c9f\u7caa\u7c1d\u7d3c\u7dda\u7d39\u7d59\u7dec\u7dc5\u7db9\u7d9b\u7e73\u7e13\u7e31\u60dc\u7ee5\u7e8f\u606b\u7e94", 29052), new String[]{IO00.I1OI("\u7133\u71f0", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    }
                } else if (this._I_I == 4) {
                    if (n2 == 0) {
                        this.IIl0.II.lO1 = 0;
                        this.IIl0.III_(165, 100 + (int)(Math.random() * 400.0), 312);
                    }
                } else if (this._I_I == 5) {
                    if (n2 == 0) {
                        this.IIl0.IlOl(21 + this.IIl0.II.lOlI);
                    } else if (n2 == 1) {
                        this.II(44, 8, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72de\u7231\u729d\u732f\u735e\u7325\u7385\u73fb\u738a\u73ae\u7381\u74fd\u7456\u7465\u740a\u74e4\u7512\u7560\u7489\u74f5\u7576\u75c7\u7528\u755b\u75f4\u75d1\u75b9\u7599\u767e\u7615\u763c\u77d2\u76fc\u7691\u76b7\u684a\u777e\u770d\u765d\u779f\u77e3\u7789\u77a6\u76e4\u7868\u7842\u7864\u780f\u7932\u6642\u78ae\u78b8\u78de\u7969\u79dc\u797b\u799b\u79fa\u79b2\u79a3\u7984\u7a7a\u7a5a\u7a34\u7a52\u7aa0\u7a80\u7aef\u7a9e\u7b65\u7bd6\u7b3f\u7b46\u7ba9\u7bdc\u6516\u7b8f\u7c25\u7d35\u7c22\u7c42\u7cb7\u7c90\u7c9f\u7cae\u7c95\u7de6\u7d4f", 29052), new String[]{IO00.I1OI("\u706c\u6f48\u71d4\u71be\u71d8\u72ea\u723c\u7260\u7254\u72fd\u72d5\u6c1c\u7293", 29052), IO00.I1OI("\u7128\u6f70\u719a\u71ba\u7190\u6cc6\u725f", 29052)});
                    }
                } else if (this._I_I == 8) {
                    if (n2 == 0) {
                        this.IIl0.IIIl.l111();
                    }
                } else if (!this.IIl0.II.III1(44, this._I_I, n2)) {
                    this.llo0();
                }
                return true;
            }
            case 46: {
                this.IIl0.II.III1(46, this._I_I, n2);
                return true;
            }
            case 55: {
                this.IIO(this._I_I, n2);
                return true;
            }
            case 63: {
                if (this._I_I == 0) {
                    if (n2 == 0) {
                        this.II_o(139, 60 + (int)(Math.random() * 140.0));
                    }
                } else if (this._I_I == 1) {
                    if (n2 == 0) {
                        this.II_o(24, -1);
                    } else if (n2 == 1) {
                        this.II_o(25, -1);
                    } else if (n2 == 2) {
                        this.II_o(26, -1);
                    }
                }
                return true;
            }
            case 60: {
                if (this._I_I == 0) {
                    if (n2 == 0) {
                        this.II_o(131, 870);
                    }
                } else if (this._I_I == 1 && n2 == 1) {
                    this.II_o(80, 870);
                }
                return true;
            }
            case 47: {
                this.IloI(n2);
                return true;
            }
            case 67: 
            case 82: {
                if (n == 82 && n2 == 2) {
                    return true;
                }
                if (n == 67 && n2 == 3) {
                    return true;
                }
                this.llo0();
                return true;
            }
            case 83: {
                if (n2 == 0) {
                    boolean bl;
                    Calendar calendar = Calendar.getInstance();
                    int n7 = calendar.get(11);
                    int n8 = calendar.get(12);
                    int n9 = calendar.get(7);
                    boolean bl2 = bl = (n7 > 13 || n7 == 13 && n8 >= 30) && n7 < 23;
                    if (bl && (n9 == 4 || n9 == 1) && I0Io.II(179) != null) {
                        this.IIl0.III_(179, 145, 240);
                    } else {
                        this.IIl0.IIIl.IIol(IO00.I1OI("\u713f\u71f3\u6f73\u71f9\u719b\u72e4\u7216\u7221\u721c\u6c50\u7292\u72a7\u7210\u7360\u730e\u7321\u7396\u73e8\u738a\u73f8\u73db\u746f\u7415\u7475\u7444\u7592\u6a1d\u74af\u74c0\u74cd\u752d\u7555\u757c\u750d\u757a\u75d6\u75f8\u75a3\u767e\u68dc\u7674\u7647\u76b2\u76c7\u7630\u76cf\u774d\u7745\u69ab\u774b\u77e4\u77c1\u6965\u7793\u7828", 29052));
                    }
                }
                return true;
            }
            case 13: {
                if (this._I_I != 21) {
                    this.II.II__(this._I_I, n2);
                }
                return true;
            }
            case 56: {
                this.II.II__(this._I_I, n2);
                return true;
            }
            case 39: {
                if (n2 < 0 || n2 >= this.IIl_.size()) {
                    return true;
                }
                String string = (String)this.IIl_.elementAt(n2);
                if (string.length() == 0) {
                    this.llo0();
                } else {
                    this.IIIO(39, string);
                }
                return true;
            }
            case 21: {
                if (this.IIl0.II.IIl_(this._I_I, n2)) {
                    return true;
                }
                if (this._I_I == 30) {
                    if (n2 == 0) {
                        this.IIl0.II.ll1();
                        return true;
                    }
                    this._I_I = 0;
                    --n2;
                }
                if (this._I_I == 5100 || this._I_I == 5101) {
                    if (this._I_I == 5100 && n2 == 0) {
                        this.IIl0.II.I_1o();
                    } else if (this._I_I == 5100 && (n2 == 1 || n2 == 2)) {
                        this.IIl0.II.Il1o(n2 == 1 ? 10 : 100);
                    }
                    return true;
                }
                if (this._I_I == 5102) {
                    if (n2 == 0) {
                        this.IIl0.II.lI0I();
                    }
                    return true;
                }
                if (this._I_I == 5103) {
                    this.IIl0.II.Il10(n2);
                    return true;
                }
                if (this._I_I == 12) {
                    switch (n2) {
                        case 0: {
                            this.IIl0.II.lI0();
                            break;
                        }
                        case 1: {
                            this.IIl0.II.lI0l();
                            break;
                        }
                        case 2: {
                            this.IIl0.II.Il11(104);
                            break;
                        }
                        case 3: {
                            this.IIl0.II.Il11(105);
                            break;
                        }
                        case 4: {
                            this.IIl0.II.Il11(106);
                            break;
                        }
                        case 5: {
                            this.IIl0.II.Il11(107);
                            break;
                        }
                        case 6: {
                            this.IIl0.II.Il11(108);
                            break;
                        }
                    }
                    return true;
                }
                if (this._I_I >= 10) {
                    if (this._I_I == 10) {
                        String string;
                        String string2 = string = n2 >= 0 && n2 < this.IIlO.size() ? (String)this.IIlO.elementAt(n2) : "";
                        if (string.equals(IO00.I1OI("\u711b\u71f2\u71dc\u71ad", 29052))) {
                            this.llo1();
                        } else if (string.equals(IO00.I1OI("\u710f\u71fa\u71d9\u71b1", 29052))) {
                            this.II(21, 12, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u706c\u7168\u71d4\u71be\u71d8\u7263\u725e\u72b5\u721a\u72fb\u72b8\u7282\u7211\u736c\u7346\u736d\u730f\u72e2", 29052), IO00.I1OI("\u706c\u6f4e\u71d3\u71f9\u71ab\u72f6\u7255\u723d\u727e\u72c7\u72c7\u72a8\u6c37\u737b\u730e\u7326\u6d95", 29052), IO00.I1OI("\u713b\u71f2\u715b\u71b4\u71d8\u7306\u6cfd\u723b\u721c\u7299\u72e1\u7230\u7293\u7367", 29052), IO00.I1OI("\u7128\u6f32\u71c3\u71d3\u71ab\u72f6\u7255\u723d", 29052), IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7274\u6c93\u7225\u727e\u72c0\u7253\u72b2\u7298\u7305\u737a\u7338\u7315\u6d4c\u73de\u73e9\u7383\u6afe", 29052), IO00.I1OI("\u7134\u6f48\u71d3\u71f9\u7188\u727f\u6cd3\u7236\u727e\u72c0\u7253\u72b2\u7298", 29052), IO00.I1OI("\u712c\u71f3\u7158\u71b7\u71d8\u7265\u72d5\u725f\u7227\u7272\u72d1\u72b9", 29052)});
                        } else if (string.equals(IO00.I1OI("\u7112\u71f8", 29052))) {
                            this.IIl0.II.Il11(510);
                        } else if (string.equals(IO00.I1OI("\u711e\u71ef\u7188", 29052))) {
                            this.IIl0.II.Il11(this.IIll(921) ? 517 : 511);
                        } else if (string.equals(IO00.I1OI("\u711e\u71ef\u7189", 29052))) {
                            this.IIl0.II.Il11(this.IIll(1816) ? 519 : 518);
                        } else if (string.equals(IO00.I1OI("\u7118\u71fa", 29052))) {
                            this.IIl0.II.Il11(512);
                        } else if (string.equals(IO00.I1OI("\u7112\u71fc\u71d5\u71ba", 29052))) {
                            this.IIl0.II.Il11(513);
                        } else if (string.equals(IO00.I1OI("\u711e\u71ee\u71db", 29052))) {
                            this.II(21, 11, IO00.I1OI("\u713e\u7162\u71db\u71f9\u719b\u6cf0\u7257\u7275\u7200\u72f2\u7292\u72a3\u6c55\u737b\u730e\u7321\u6d8f\u73e2\u738a\u73a1\u6d49\u746e\u740a\u7465\u740a\u74eb\u744e\u74af\u74c0\u7491\u7579\u748d\u74fd\u7512\u75ba\u75c0\u6b67\u7582\u7636\u7724\u7621\u68a2\u76fb\u7691\u76a4\u7687\u69b1\u770d\u7722\u778b\u77f3\u7785\u77e8\u7784\u786e\u668a\u7827\u7843\u78ef\u78d4\u6611\u78b1\u78de\u7970\u7949\u793a\u795a\u79fb\u7941\u79b6\u79d6\u7b04\u64f7\u7a73\u7a1f\u6430\u7ade\u7aa7\u7ace\u7b60\u6591\u7b6b\u7b8a\u7ba5\u7b88\u7baa\u7b93\u7c64\u7c04\u7c28\u7c0a\u7c75\u7cce\u7cd8\u7cfe\u7c89\u7d7d\u7d1b\u7d38\u7d98\u7df6\u7d97\u7db5\u7d9d\u7e7b\u7e1f\u7e72\u7e09\u7e70\u7ec6\u7eee\u7e9f\u61df\u7f42\u7f6a\u7f05\u6129\u7fce\u7fe6\u7f91\u806c\u80ce\u8021\u8009\u80a0\u80fc\u80d6\u80b2\u80dc\u8176\u81da\u8179\u8100\u81f2\u81db\u81fb", 29052), new String[]{IO00.I1OI("\u713e\u7162\u71db\u71d3\u71c9\u7237\u7251\u723c\u6ca9", 29052), IO00.I1OI("\u713e\u7162\u71db\u71d3\u71c0\u7237\u7251\u723c\u6ca9", 29052), IO00.I1OI("\u713e\u7162\u71db\u71d3\u71c9\u7237\u7242\u723d\u7295\u72fd\u72d5", 29052), IO00.I1OI("\u706c\u7168\u71d4\u71be", 29052)});
                        } else {
                            this.llo0();
                        }
                    } else if (this._I_I == 11) {
                        if (n2 == 0) {
                            this.IIIO(21, IO00.I1OI("\u713e\u71ce\u71fb\u7186\u71c9\u725f", 29052));
                        } else if (n2 == 1) {
                            this.IIIO(21, IO00.I1OI("\u713e\u71ce\u71fb\u7186\u71c0\u725f", 29052));
                        } else if (n2 == 2) {
                            this.IIIO(21, IO00.I1OI("\u713e\u71ce\u71fb\u7186\u71c9\u725a", 29052));
                        }
                    }
                    return true;
                }
                if (this._I_I == 1) {
                    int[] nArray = new int[]{500, 501, 100, 101, 102, 103};
                    if (n2 >= 0 && n2 < nArray.length) {
                        this.IIl0.II.Il11(nArray[n2]);
                    }
                    return true;
                }
                if (this._I_I == 2) {
                    if (n2 == 0) {
                        this.IIl0.II.Il11(994);
                    } else if (n2 == 1) {
                        this.IIl0.II.Il11(995);
                    }
                    return true;
                }
                if (this._I_I == 0) {
                    if (n2 == 4) {
                        this.IIl0.II.Il11(996);
                    } else if (n2 == 5) {
                        this.IIl0.II.Il11(997);
                    } else if (n2 == 1) {
                        this.II(21, 1, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u71b5\u71eb\u719a\u71aa\u7199\u7278\u723c\u7221\u7206\u72f2\u72dc\u72b6\u72d0\u736d\u6de5", 29052), IO00.I1OI("\u712c\u71f3\u71db\u71f9\u7194\u72fd\u723c\u723d\u7287\u72f2\u72b8\u72a5\u7282\u736e\u7340\u732a\u734c\u73e9\u6d61", 29052), IO00.I1OI("\u7132\u7179\u71d4\u71be\u71d8\u7274\u6c93\u7225\u727e\u72c0\u72d3\u72be\u72d0\u737f\u7346\u732c\u734c\u73e7\u7340", 29052), IO00.I1OI("\u706c\u717a\u71d4\u71b1\u71d8\u7275\u72c5\u723b\u7213\u7299\u72e1\u72b0\u729f\u732f\u735e\u7325\u730d\u73ab\u73c6\u7323", 29052), IO00.I1OI("\u713f\u702b\u6f67\u71b7\u719f\u7237\u725e\u72a6\u7215\u7299\u72de\u6c06\u72d0\u737c\u734f\u7322\u7366\u73fb\u73c2\u73a8\u73c8\u746b\u74cc", 29052), IO00.I1OI("\u7128\u6f3a\u71d5\u71f9\u70e9\u72f6\u723c\u721d\u7211\u72fe\u72d3\u72a5\u7299\u737b\u734b", 29052)});
                    } else if (n2 == 2) {
                        this.II(21, 2, IO00.I1OI("\u7128\u71fa\u719a\u71ba\u710b\u7237\u7242\u723d\u6cb7\u72b3\u72d5\u72b8\u720a\u737f\u730e\u732a\u7380\u73ab\u73c9\u73a1\u7387\u7427\u7448\u7422\u75d4\u7522\u74cb\u74e1\u74df", 29052), new String[]{IO00.I1OI("\u713f\u71f3\u71cf\u71a0\u6f3b\u7279\u7216\u723d\u7287\u72f2\u72b8\u7287\u7210\u7361\u7349", 29052), IO00.I1OI("\u713f\u71f3\u71cf\u71a0\u6f3b\u7279\u7216\u723d\u7287\u72f2\u72b8\u729f\u7297\u6dc2\u734d", 29052)});
                    } else {
                        this.llo0();
                    }
                } else {
                    this.llo0();
                }
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ String I1OI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

