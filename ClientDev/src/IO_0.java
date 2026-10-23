package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import nrolite.Res;

public final class IO_0 {
    static final int lOoo = 510;
    static final int l0 = 511;
    static final int l0I = 512;
    static final int l0II = 513;
    static final int l0Il = 517;
    static final int l0I1 = 518;
    static final int l0I_ = 519;
    static final int l0IO = 104;
    static final int l0I0 = 105;
    static final int l0Io = 106;
    static final int l0l = 107;
    static final int l0lI = 108;
    static final int l0ll = 515;
    static final int l0l1 = 500;
    static final int l0l_ = 501;
    static final int l0lO = 994;
    static final int l0l0 = 995;
    static final int l0lo = 996;
    static final int l01 = 997;
    static final int l01I = 100;
    static final int l01l = 101;
    static final int l011 = 102;
    static final int l01_ = 103;
    static final int l01O = 5102;
    static final int l010 = 5103;
    static final int l01o = 21;
    static final int l0_ = 5100;
    static final int l0_I = 5101;
    private static final int l0_l = 8;
    private final IO0 var_IO0_IIIO;
    private final IOo_ var_IOo__IIIO;
    private final Random var_java_util_Random_IIIO = new Random();
    private int IoI_;
    private int l0_1 = 21;
    private int[] I_Il = new int[0];
    private int lOo_;
    private int l0__;
    private int l0_O;
    private float III1;
    private static Hashtable var_java_util_Hashtable_IIIO;
    private static final int[] I_I1;
    private static final int[] I_I_;
    private static final String[] Il10;
    private static final int[] I_IO;
    private static final String[] Il1o;
    private long I1Oo;
    private static final int l0_0 = 200000000;
    private static final int l0_o = 10;
    private static final int l0O = 100000000;
    private static final int l0OI = 50000000;
    private static final int l0Ol = 500000000;
    private static final long I10 = 2000000000L;
    private static final int l0O1 = 5000;
    private static final long I10I = 2000000000L;

    int II01() {
        return this.l0_1;
    }

    IO_0(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_IIIO = iO0;
        this.var_IOo__IIIO = iOo_;
    }

    private IOol IOol_II() {
        return this.var_IO0_IIIO.var_IOol_II;
    }

    void Il11(int n) {
        this.IoI_ = n;
        this.l0_1 = n == 515 ? 56 : 21;
        this.I_Il = new int[0];
        String[] stringArray = IO_0.java_lang_String_arr_II(n);
        IO0o iO0o = new IO0o(-81).II(0);
        iO0o.II(stringArray[0]);
        iO0o.II(stringArray[1]);
        iO0o.III(this.l0_1);
        this.var_IOo__IIIO.II(iO0o);
    }

    private static String[] java_lang_String_arr_II(int n) {
        switch (n) {
            case 500: {
                return new String[]{IO_0.I11l("\u4b75\u4b3d\u55b9\u4bfd\u4b92\u4ba5\u4b82\u4c6e\u4c40\u4c2a\u4c4c\u4ce9\u5261\u4cc3\u4cc0\u4dc6\u4d49\u4d69\u4d44\u4df2\u4dd7\u5366\u4d8e\u4dd3\u4e3e\u4e5a\u4f5f\u4e15\u4efd\u4e95\u4ef8\u4e90\u4f7f\u4fd5\u4f2d\u4f53\u4ffa\u4fde\u5167\u4f8c\u502e\u505f\u502d\u517a\u50eb\u5080\u50e8\u5084\u51f5\u5105\u51b0\u5143\u5093\u4f16\u51b4\u51ff\u518d\u527c\u5253\u527b\u520a\u52f1\u52d9\u52f7\u529a\u53ff\u533e\u5310\u531a\u4d5c\u53de\u53ef\u5382\u5462\u4a8d\u5422\u544a\u54fa\u54c9\u54a8\u54c6\u5575\u554c\u5522\u5542\u55ed\u554a\u55b5\u558d\u559c\u5669\u561b\u574b\u568a\u56b8\u56d4\u56be\u4838\u577a\u5713\u5775\u573f\u5772\u57c1\u57a9\u57cd\u586f\u468e\u583a\u584e", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4df7\u4dd0\u4da0\u4d8e\u4d98\u4e3e\u4e5f\u5097\u4e5b\u4ef9\u505e\u4eb9\u4ed7\u4f78\u4f52\u4ee4\u4ed2\u4ffb\u4fbb\u4fa4\u4f9d\u4ed1\u500d\u5020\u5081\u50e4\u5089\u50a5\u4e46\u5168\u514d\u5164\u510e\u4f3f", 19254)};
            }
            case 501: {
                return new String[]{IO_0.I11l("\u4b75\u4b3d\u55b9\u4bfd\u4b92\u4ba5\u4b82\u4c6e\u4c40\u4c2a\u4c4c\u4ce9\u5261\u4cc3\u4cc0\u4dc6\u4d49\u4d69\u4d44\u4df2\u4dd7\u5366\u4d8e\u4dd3\u4e3e\u4e5a\u4f5f\u4e15\u4efd\u4e95\u4ef8\u4e90\u4f7f\u4fd5\u4f2d\u4f53\u4ffa\u4fde\u5167\u4f8c\u502e\u505f\u502d\u517a\u50eb\u5080\u50c2\u50b4\u5167\u5150\u5164\u5072\u5171\u5181\u51a3\u51b7\u4f33\u5273\u521c\u527c\u5234\u527b\u52d6\u52b0\u52d6\u5376\u4d91\u5323\u5355", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4df7\u4dd0\u4da0\u4d8e\u4d98\u4e3e\u4e5f\u5097\u4e5b\u4ef9\u505e\u4eb9\u4ed7\u4f78\u4f52\u4ee4\u4ed2\u4ffb\u4fbb\u4fa4\u4f9d\u4ed1\u500d\u5038\u5003\u506a\u50c7\u50a0\u50c7\u5172\u5157\u5125\u510d\u51e5\u5181\u51a2\u4f14\u51de\u526d\u5254\u523a\u525a\u52f5\u5252", 19254)};
            }
            case 994: 
            case 995: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dd6\u4db3\u4d81\u4d91\u4e79\u4e1d\u4e3e\u50b0\u4eba\u4ede\u5009\u4e94\u4f1c\u4f1d\u4f95\u4f1c\u4fbe\u4fc0\u4fa5\u5148\u5060\u5001\u502b\u5168\u50e4\u50ce\u50e4\u5080\u516f\u51c5\u513d\u5143\u51ea\u51ce\u4f77\u51bc\u51de\u526f\u525d\u523f\u521b\u52b0\u52b2\u52a3\u4c1d\u5335\u5357\u4df6\u5302\u53ca\u539b\u53fb\u53b3\u542d\u5458\u5439\u4ab5\u54a9\u54c4\u542d\u5488\u550f\u5567\u552b\u4baf\u55ef\u5580\u55cb\u55b7\u4b42\u566c\u561b\u562e\u560b\u56f9\u56d9\u56b1\u56d5\u5776\u49f8\u5772\u571c\u494b\u57c6\u57c4\u578e\u5864\u599b\u582b\u5849\u58e6\u5845\u58a8\u5882\u5924\u5940\u47e7\u5911\u59a0\u59fc\u4719\u59b3\u59dc\u5a75\u5a52\u44f4\u5a08\u5ab7\u5ac2\u5abd\u4437\u5b19\u5b41\u5b30\u5b05\u5baf\u5abf\u5b3e\u5bcc\u5c68\u5c42\u4284\u5c06\u5ca7\u5c81\u5c8b\u5c06\u5d6d\u5d45\u5d61\u5d03\u43da\u5dee\u5d9a", 19254), IO_0.I11l("\u4b7a\u4ae5\u4b01\u4bb3\u4b4f\u4bf1\u4b84\u4c7d\u4c4f\u4c23\u4c0b\u4cab\u4cc8\u5202\u4cc8\u4d6a\u53fd\u4d2c\u4d6e\u4df3\u4dca\u5362\u4d89\u4ddf\u4e76\u4f9c\u4e32\u4e5b\u4eee\u4ecb\u4eb9\u4e99\u4f71\u4f15\u4f36\u51b8\u4fb2\u4fd6\u5101\u4f8c\u5004\u501c\u506c\u5009\u4e27\u50ca", 19254)};
            }
            case 996: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dca\u4da0\u4d99\u4ddf\u4e70\u4e55\u4e35\u50ba\u4eef\u4eb3\u4e8c\u4e85\u4f77\u4f5b\u4f33\u4f53\u4ff0\u517a\u4ff0\u4f84\u50e3\u504e\u5024\u504b\u50e2\u50c6\u4e69\u5093\u5126\u5146\u4fe3\u510d\u51a2\u51d3\u5123\u51d5\u51ad\u527c\u5249\u527b\u536b\u526a\u5298\u52b4\u529e\u4dd8\u535a\u5373\u5355\u53c1\u53d8\u532d\u5380\u542d\u545e\u54a8\u544d", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d77\u4d4e\u4da7\u4d0a\u4da3\u4dd0\u4d22\u4dc0\u4d8b\u4e76\u4edd\u4e32\u4e13\u4e90\u4ed2\u4eb0\u4e98\u4ff7\u4f5b\u4f33\u4f53\u4fe6\u4f50\u4fb9\u4fcf\u506d\u5045\u4ef3\u504b\u50e9\u50c1\u50a7\u50c7\u5168\u5142\u50f4\u50c2\u51eb", 19254)};
            }
            case 997: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4d91\u4de1\u4d8b\u4d97\u4e71\u4edc\u4e32\u4e1c\u4eba\u4ecd\u4e39\u4e9e\u4f36\u4f56\u4f3c\u51cc\u4f98\u4ff2\u4fb8\u5122\u5060\u500d\u507d\u504b\u50c9\u50c8\u50b8\u5094\u5173\u5149\u5121\u5143\u51f4\u4f40\u51ca\u518c\u519f\u5268\u521c\u534a\u5289\u52b9\u52db\u52bf\u4c3b\u537b\u5314\u5374\u5326\u5370\u53d9\u53ef\u539a\u4aac\u5443\u546c", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d73\u4dc7\u4d2c\u4d44\u4df7\u5303\u4dae\u4dc0\u4d8b\u4e76\u4edd\u4e32\u4e13\u4eba\u4e88\u4ef8\u4e81\u4f7f\u4fdf\u4f3a\u4f79\u4fd1\u4fd0\u4fa0\u4f9c\u507b\u5041\u5029\u504b\u50e1\u5044\u50ab\u508f\u5126\u514d\u512b\u4fc2\u51f6\u5181\u51b4\u4f2e\u51de\u527e\u5254\u4c96\u5214", 19254)};
            }
            case 100: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4cb3\u4d20\u4dc0\u4db7\u4e7b\u4e50\u4e3d\u4e0f\u4ef3\u4ecd\u4ebd\u4efd\u4f55\u4f5d\u5199\u4f1d\u4fb2\u4fdd\u4fbf\u514e\u5067\u500d\u503f\u500a\u50e5\u5089\u50b8\u508f\u5167\u5105\u5128\u5189\u51a2\u5189\u51a3\u4f7a\u518e\u523d\u520d\u5272\u5270\u52ca\u52d9\u52a2\u52d6\u5204\u53c7\u5373\u5311\u53f9\u4d7d\u53a1\u53ce\u542a\u5462\u54a9\u5404\u54ee\u5488\u54a4\u4a43\u5575\u5503", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d69\u4dc4\u4d2b\u4d03\u4da3\u4dc1\u5364\u4d90\u4ddf\u4e4d\u4e5c\u4e33\u4e5b\u4eca\u4ed1\u4eb9\u4ed7\u4f5a\u4fdf\u4f5e\u4f07\u4ffa\u4f51\u4fbe\u4f87\u502e\u504e\u4ee9\u501b\u50aa\u509b", 19254)};
            }
            case 101: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dce\u4dae\u5341\u4d96\u4e3e\u4e4e\u4e3d\u4e14\u4eba\u4ec9\u4eb0\u4e96\u4f36\u4f59\u4fbe\u4f53\u4ff1\u5114\u4fa0\u4fcf\u503c\u500d\u502f\u5098\u50aa\u50dd\u4e23\u50c7\u5134\u5105\u5132\u510a\u5168\u51cf\u51e0\u51ab\u518c\u4cc2\u521c\u5237\u5290\u52f7\u52b2\u5294\u529e\u4dd8\u535a\u5373\u5343\u53b1\u52a1\u532e\u53ce\u5460\u54cc\u5422\u5460\u54da\u54c9\u54b2\u54c6\u5414\u55d7\u5563\u5501\u55e9\u4b6d\u55d1\u55fe\u55da\u570c\u56da\u5634\u5611\u56b8\u56d5\u5625\u569b\u5773\u5714", 19254), IO_0.I11l("\u4a26\u4bb4\u4b1a\u4bfb\u4b92\u4bb3\u4b03\u4c61\u4c49\u4c47\u4c3f\u4cea\u4cc5\u4ce9\u4c98\u4d6f\u4d47\u4d65\u4d08\u4d69\u4d82\u4da2\u5345\u4d8f\u4e3e\u4e0f", 19254)};
            }
            case 102: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dd6\u4db3\u4d81\u4d91\u4e79\u4e1d\u4e3e\u50b0\u4eba\u4eda\u4e2b\u4ed7\u4fc2\u4f15\u4f27\u4f12\u4ffd\u4f91\u4fa4\u4f87\u4ee7\u500d\u5074\u504b\u50fe\u50db\u4e17\u50c7\u516a\u51cf\u512a\u5143\u51e1\u51c9\u5070\u51be\u51de\u527e\u538c\u4c86\u5214\u52fe\u5298\u52bf\u5205\u5374\u533e\u5310\u531a\u4d5c\u53de\u53ef\u52ff\u54ec\u540c\u5403\u540f\u54e4\u54c9\u54b3\u548f\u5571\u5541\u5549\u5521\u55e9\u4b6d\u55d1\u55fe\u5599\u56e5\u5652\u567a\u5768\u487d\u56d4\u56dc\u56a6\u5775\u5746\u5772\u5660\u5763\u578f\u57ad\u5785\u46c1\u5845\u586a\u584e\u58cb\u5917\u461b\u588b\u5963\u5903\u592a\u5992\u59e1\u59b8", 19254), IO_0.I11l("\u4b75\u4ae5\u55a9\u4bfd\u4bd5\u4bf1\u4b98\u4cfc\u4c4f\u4c47\u4cb8\u4cab\u4cf9\u4ca8\u4c87\u4d27\u4d76\u4d2d\u4d05\u4da3\u4dee\u4d2b", 19254)};
            }
            case 103: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4d97\u4de1\u4d93\u4d9e\u4e71\u4e1d\u4e2c\u4e13\u4efb\u4e99\u4eb4\u4e1d\u4f36\u4f56\u51f1\u4f03\u4fb2\u4f80\u4ff0\u4f8c\u50f7\u5043\u502b\u504b\u50e7\u5049\u50bd\u50ed\u5145\u514d\u4f89\u510d\u51a2\u5186\u5194\u4f7e\u5191\u523d\u532d\u52ba\u525a\u52d1\u52dd\u52ba\u5297\u5361\u535d\u5327\u5317\u53b6", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d73\u5387\u4d2a\u4d44\u4c92\u4d43\u4de1\u4d88\u4d9a\u4e73\u4e5c\u4e28\u4e12\u4eee\u4edc", 19254)};
            }
            case 511: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dc0\u4d35\u4d8e\u4d98\u4e3e\u4e49\u4e3d\u4e12\u4eba\u4ee9\u4eb7\u4e85\u4f77\u4f41\u4f35\u4f79\u4fd1\u4fd9\u511d\u4f81\u502e\u5040\u4eef\u5005\u50e2\u5089\u50aa\u5013\u5168\u5142\u5164\u5117\u51e3\u51c8\u51e0\u50ce\u4f3d\u523d\u5252\u52b9\u5214\u52fe\u5298\u52b4\u4c53\u5365\u5318\u5373\u5321\u4d40\u5390\u53a3\u525e\u4aee\u5442\u542c\u544a\u54b0\u5491\u54fe\u54df\u5525\u5547\u55a2\u550b\u558b\u55f3\u55de\u55ab\u55dd\u570d\u56c8\u567a\u561a\u56f0\u487a\u56b8\u56d5\u5733\u577d\u57b0\u571f\u57f7\u578f\u57ad\u4948\u587c\u580c", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4de1\u4d56\u4daf\u4d87\u4ddf\u4e6a\u4e5c\u4e35\u4e5b\u4eca\u4ed6\u4eaa\u4e96\u4f62\u4f54\u4f74\u4f10\u5175\u4fd0\u4ff0\u4f81\u5069\u519d\u51ed\u5002\u5080\u50dd\u50a0\u5007\u5168\u514d\u5164\u5100\u4f27\u51d1\u51e0\u51ed", 19254)};
            }
            case 518: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4de0\u4d35\u4d8e\u4d98\u4e3e\u4e49\u4e3d\u4e12\u4eba\u4ee9\u4eb7\u4e85\u4f77\u4f41\u4f35\u4f53\u4ff1\u5114\u4fa0\u4fcf\u503c\u500d\u515d\u4ea8\u50aa\u50c7\u502a\u5089\u5161\u5105\u5127\u4fc6\u51f2\u51ab\u5199\u5135\u518b\u523d\u525f\u4cfc\u520f\u52a3\u5298\u52e5\u52c6\u533b\u5304\u5363\u5342\u53b1\u53fd\u4d6c\u5380\u5465\u540c\u5429\u549e\u54e7\u54cf\u54e7\u5492\u5564\u554d\u5563\u5501\u4b24\u55d0\u559f\u55ed\u55f7\u564f\u565a\u562f\u5659\u5789\u5644\u56f6\u5696\u577c\u49fe\u573c\u5751\u57b7\u57e1\u572c\u5783\u586b\u580b\u5829\u46cc\u58f8\u5880", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4de1\u4d56\u4daf\u4d87\u4ddf\u4e6a\u4e5c\u4e35\u4e5b\u4eca\u4ed6\u4eaa\u4e96\u4f62\u4f54\u4f74\u4f10\u5175\u4fd0\u4ff0\u4f81\u5069\u519d\u51ed\u5002\u5080\u50dd\u50a0\u5007\u5168\u514d\u5164\u5100\u4f27\u51d1\u51e0\u51ec", 19254)};
            }
            case 517: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dc0\u4d35\u4d8e\u4d98\u4e3e\u4e49\u4e3d\u4e12\u4eba\u4ee9\u4eb7\u4e85\u4f77\u4f41\u4f35\u4f79\u4fd1\u4fd9\u511d\u4f81\u502e\u5040\u4eef\u5005\u50e2\u5089\u50a0\u4e34\u5168\u5105\u5134\u510c\u51f0\u51c0\u51b4\u51be\u51de\u526e\u4ced\u527b\u5216\u5329\u4c5b\u52b9\u5291\u5335\u530d\u536a\u5378\u53f2\u5351\u53a6\u53ce\u547b\u54cc\u546b\u557b\u5468\u5488\u54bf\u5487\u556b\u554c\u5563\u550e\u55e0\u55cd\u559f\u54cf\u4b3e\u563c\u5655\u56b8\u5617\u56ff\u5697\u56b5\u4850\u5764\u571d\u5758\u5722\u57f1\u57da\u57ee\u56fc\u58ff\u580b\u5829\u5801\u4645\u58c9\u58e6\u58c2\u594a\u59c1\u592c\u5906\u59a0\u59fc\u471b\u59ad\u59dc\u5a78\u5a52\u4490\u5a58\u5ae4\u4467\u5af2", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4de1\u4d56\u4daf\u4d87\u4ddf\u4e6a\u4e5c\u4e35\u4e5b\u4eca\u4ed6\u4eaa\u4e96\u4f62\u4f54\u4f74\u4f10\u5137\u4fc1\u4ff0\u4fdd\u502e\u504e\u4eab\u500a\u50aa\u50c7\u50af\u5157\u50a7\u514c\u514e\u5100\u5171\u5181\u51f1\u51ff\u519d\u5275\u4cf5\u527b\u5209\u4c48\u5298\u52b9\u5291\u4dbe\u5341\u5373\u531c\u53f9\u53d9\u5325\u5380", 19254)};
            }
            case 519: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dc0\u4d35\u4d8e\u4d98\u4e3e\u4e49\u4e3d\u4e12\u4eba\u4ee9\u4eb7\u4e85\u4f77\u4f41\u4f35\u4f79\u4fd1\u4fd9\u511d\u4f81\u502e\u5040\u4eef\u5005\u50e2\u5089\u50a0\u4e34\u5168\u5105\u5134\u510c\u51f0\u51c0\u51b4\u51be\u51de\u526e\u4ced\u527b\u5216\u5329\u4c5b\u52b9\u5291\u5335\u5305\u536a\u534b\u539b\u53d3\u532e\u5387\u542d\u545a\u54ab\u544a\u54bb\u5488\u55d6\u5407\u5525\u555c\u5522\u550c\u55e9\u5580\u55d3\u55bf\u5590\u563c\u572a\u4899\u5659\u56f6\u5655\u56b8\u5692\u5734\u5750\u49f7\u5701\u57be\u57a5\u579d\u578c\u5879\u580b\u595b\u589a\u58a8\u58c4\u58ae\u4628\u596a\u5903\u5965\u592f\u5962\u59f1\u59d9\u59fd\u599f\u44be\u5a4a\u5a79\u5a1b\u5aff\u447f\u5af5\u5a87\u45c2\u5b15", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4de1\u4d56\u4daf\u4d87\u4ddf\u4e6a\u4e5c\u4e35\u4e5b\u4eca\u4ed6\u4eaa\u4e96\u4f62\u4f54\u4f74\u4f10\u5137\u4fc1\u4ff0\u4fdc\u502e\u504e\u4eab\u500a\u50aa\u50c7\u50af\u5157\u50a7\u514c\u514e\u5100\u5171\u5181\u51f2\u51ff\u519d\u5275\u4cf5\u527b\u5209\u4c48\u5298\u52b9\u5291\u4dbe\u5341\u5373\u531c\u53f9\u53d9\u5325\u5380", 19254)};
            }
            case 512: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4d93\u4df1\u4dc0\u4d92\u50bd\u4e53\u4e34\u4e5b\u4f8b\u4e58\u4ef8\u4e81\u51f3\u4f5b\u4f5e\u4f30\u4ffa\u517c\u4fbe\u4fcf\u503f\u500d\u502e\u5087\u50e4\u50c1\u50e8\u5089\u50b6\u4ffe\u5127\u5143\u51f2\u51c9\u5129\u51af\u51f4\u5235\u5251\u522e\u521b\u52b9\u52cc\u4c76\u529f\u5335\u5361\u5321\u531d\u53ff\u5390\u4d10\u53ce\u5479\u545e\u4aea\u5407\u54a9\u54dc\u5427\u5493\u5525\u5552\u542a\u5542\u55f5\u55d2\u4b5a\u55f7\u55f7\u564f\u565a\u562f\u5659\u5789\u5644\u56f6\u5696\u577c\u49fe\u573c\u5751\u57b7\u57e3\u572e\u5780\u582c\u585b\u5822\u5880\u58f8\u5880", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4db2\u4d92\u4de1\u4d8d\u535c\u4e70\u4e55\u4e7c\u4f6a\u4e7b\u4e99\u4eae\u5012\u4f78\u4f3f\u4f20\u4f01\u514d\u4f91\u4fa4\u4f87\u50ee\u5043\u5024\u504b\u50bb\u5089\u51d9\u5006\u5126\u514b\u51a6\u510d\u51e5\u5181\u51a3\u4f7a\u518e", 19254)};
            }
            case 513: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4d95\u4de1\u4d96\u4d96\u4ef4\u4e53\u4e7c\u4e15\u4efd\u5074\u4ebb\u4ed7\u4f75\u4fcc\u4f3a\u4f14\u4fb2\u4fc2\u4fb1\u4f80\u5004\u507e\u502d\u501e\u50aa\u51b8\u503b\u50c7\u5165\u514d\u4f89\u510d\u51a2\u5186\u518c\u513f\u5193\u523d\u524c\u5233\u5293\u52e9\u529f", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d64\u4d4e\u4d2a\u4d44\u4db4\u4d82\u4db7\u4d89\u4d15\u4e70\u4e1d\u4e12\u4e1c\u5057\u4eda\u4ef8\u4ea5\u51c5\u4f5b\u4f33\u4f79\u4fe6\u4fd9\u4f30\u4f81\u5066\u500d\u507d\u504b\u50fc\u50c0\u5022\u5089\u5126\u516b\u5123\u4fae\u51e1\u5181\u5192\u4f0c\u5190\u527a\u521c\u5238\u4cdf\u52e9\u5298\u52b4\u5297\u537a", 19254)};
            }
            case 515: {
                return new String[]{IO_0.I11l("\u4b40\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4d93\u4de1\u4d83\u4d0b\u4e70\u4e5a\u4e7c\u4e0f\u4ef2\u5050\u4ebb\u4ed7\u4f60\u4fd5\u4f74\u4f10\u4f66\u4fdf\u4fb7\u4fcf\u507a\u5045\u4ea5\u5008\u50aa\u50ff\u50a1\u5097\u510c\u514e\u51ac\u510e\u51a2\u5190\u51e0\u50ce\u511f\u523d\u5252\u52b9\u5214\u52fe\u5294\u52f7\u52c7\u5335\u5225\u53b2\u5352\u53fc\u53d1\u53b6\u53ce\u5460\u4a83\u5425\u5460\u54a9\u54de\u5427\u54c6\u553c\u551d\u557a\u5542\u55ec\u4b03\u55d1\u55b6\u55dd\u5668\u5653\u5633\u5693\u56f6\u5697\u56a5\u481c\u571e\u5713\u5706\u5710\u57b0\u57dc\u4973\u57cd\u586f\u5843\u5825\u5849\u58fa\u58c6\u58e6\u59f4\u47d7\u5903\u5936\u5909\u59e9\u5975\u59d0\u59fd\u598f\u44f2\u5a1a\u5a2d\u4493\u5ab7\u5a86\u5af8\u5ac5\u5b26\u5b17\u5b71\u5b13\u5be7\u4567\u5bed\u5b9f\u42da\u5c20\u5c1a\u5c09\u5cf2\u5c86\u5dd4\u5c17\u5d23\u5d41\u5d29\u43ad\u5d11\u5dbe\u5d9a\u5d92\u5d19\u5e74\u5e5e\u5e78\u5e34\u4033\u5ec5\u5ef3", 19254), IO_0.I11l("\u4b75\u4b3d\u55cb\u4bb3\u4bc6\u5570\u4b9f\u4c05\u4c5a\u4c3f\u4c0d\u4ce5\u4ccd\u4ce9\u4c8a\u53cc\u4d06\u4d31\u4d0c\u4dea\u4d48\u4daf\u4dc0\u4d8c\u50f7", 19254)};
            }
            case 104: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4cc8\u4d64\u4d4e\u5388\u4d0a\u4d89\u4d93\u4de1\u4d93\u4d1e\u4e7d\u4e55\u4e7c\u4e18\u503d\u4ed7\u4ef8\u4e90\u4f7f\u4fd4\u4f39\u4f53\u4e83\u517a\u4fbe\u4f87", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d60\u4d4f\u4da4\u4d09\u4da3\u4cb3\u530a\u4d8e\u4d97\u4e3e\u4e4e\u4ebd\u4e18\u4ef2\u4e99\u4fc9\u4e04\u4f36\u4f56\u4f3c\u4f1c\u4fb2\u4fdf\u4fb7\u4e5f\u51af\u5044", 19254)};
            }
            case 105: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4cc8\u4d64\u4d4e\u5388\u4d0a\u4d89\u4d93\u4de1\u4d93\u4d1e\u4e7d\u4e55\u4e7c\u4e18\u503d\u4ed7\u4ef8\u4e83\u51bf\u4f4c", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d73\u538f\u4d3c\u4d44\u4df0\u4d43\u4da2\u4d88\u4ddf\u4f0f\u4ece\u4e7c\u4e18\u4ef2\u4ed6\u4ef8\u4e99\u4f71\u4e85\u4ef5\u4f1a", 19254)};
            }
            case 106: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4cc8\u4d64\u4d4e\u5388\u4d0a\u4d89\u4df1\u4d20\u4d83\u4d97\u4e3e\u4e69\u4e29\u4e02\u505d\u4ecd\u4ef8\u4ebc\u51ef\u4f15\u4f65\u4f53\u4ff1\u5116\u4fbe\u4fcf\u5060\u50cf\u5022\u500c\u50aa\u50ca\u4e6d\u5097\u5126\u5153\u51a4\u5143\u51b3\u5191\u51e0\u5194\u5112\u5270\u521c\u5239\u4cdf\u52f4\u5298\u52b0\u529f\u4db0\u534d", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d69\u4dc4\u4d2b\u4d03\u4da3\u4dc1\u5364\u4d90\u4ddf\u4e4d\u4edc\u4e3f\u4e13\u4eba\u4eed\u4ead\u4e8e\u51d1\u4f41\u4f74\u4f38\u516b\u4f91\u4fb3\u4f87\u5061\u500d\u5022\u500c\u513a\u5108\u50a1", 19254)};
            }
            case 107: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4cc8\u4d64\u4d4e\u5388\u4d0a\u4d89\u4de1\u4d20\u4d83\u4ddf\u4e4d\u4edc\u4e3f\u4e13\u4eba\u4eed\u4ead\u4e8e\u51d1\u4f41\u4f74\u4f38\u516b\u4f91\u4fb3\u5148\u5060\u500d\u503c\u5003\u4e6f\u50ca\u50e8\u508f\u4fd5\u514c", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d77\u4d4e\u53a0\u4d07\u4da3\u4dca\u5312\u4d89\u4ddf\u4e6d\u4edc\u4e3f\u4e13\u4eba\u4eda\u4eb0\u4e98\u4f36\u4f5b\u4f33\u4ec3\u4e33\u4fd8", 19254)};
            }
            case 108: {
                return new String[]{IO_0.I11l("\u4b60\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4cc8\u4d64\u4d4e\u5388\u4d0a\u4d89\u4d93\u4de1\u4d93\u4d1e\u4e7d\u4e55\u4e7c\u4e18\u503d\u4ed7\u4ef8\u4e87\u4f7e\u4fd7\u4f3a\u4f53\u4fe0\u4f52", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4ce2\u4d77\u4d4e\u4da7\u4d0a\u4da3\u4dd0\u4d22\u4dc0\u4d8c\u4eff\u4e5e\u4e34\u4e5b\u4f8b\u4e4a\u4ef8\u4e94\u4f7e\u4f5a\u4f74\u4f1d\u4ff5\u4e01\u4e71\u4f86", 19254)};
            }
        }
        return new String[]{IO_0.I11l("\u4b40\u4bb5\u4b1b\u4bb3\u4bda\u4b31\u4b9e\u4c67\u4c0e\u4c39\u4c1e\u4cea\u4cc4\u4cae\u4ce2\u4d44\u4d4e\u5388\u4d0a\u4da3\u4dd6\u4db3\u4d81\u4d91\u4e79\u4e1d\u4e3e\u50b0\u4e90\u4e91\u4e19\u4e98\u4f3a\u4f15\u4f25\u4f06\u5135\u4fdf\u4ffc\u4fcf\u5069\u512e\u5022\u500c\u50a6\u5089\u50af\u508e\u51e6\u515c\u5164\u510b\u51ed\u4f16\u51a3\u51ff\u518c\u527c\u532d\u523a\u5253\u5293\u52fb\u52bf\u4c3b\u537b\u5314\u533f\u531d\u4d30\u53d9\u53ef\u52ff\u54ec\u540c\u555a\u4aa9\u54a9\u54c6\u5425\u5488\u5562\u5504\u5520\u4bc7\u55f1\u55aa\u55ec\u55bf\u5588\u563c\u572a\u56a9\u5659\u56fb\u56df\u481b\u569b\u5734\u5714\u571c\u5793\u57fe\u57c8\u57ee\u578e\u46a9\u585b\u586d", 19254), IO_0.I11l("\u4b62\u4b34\u4b54\u4be0\u550f\u4bf1\u4b80\u4c67\u4cd7\u4c6d\u4c1c\u4ce3\u4c43\u4cb9\u4cc8\u4d64\u4d4e\u4d2a\u4d44\u4df7\u4dd0\u4da0\u4d8e\u4d98\u4e3e\u4e5f\u5097\u4e5b\u4ef9\u505e\u4eb9\u4ed7\u4f78\u4f52\u4ee4\u4ed2\u4ffb\u4f91\u4fa4\u4f9d\u4ed1\u500d\u5020\u5081\u50e4\u5089\u50a5\u4e46\u5168\u514d\u5164\u510e\u4f3f", 19254)};
    }

    void III1(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readByte();
        byte by = dataInputStream.readByte();
        int[] nArray = new int[Math.max(by, 0)];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = dataInputStream.readByte();
        }
        if (this.IoI_ == 0) {
            return;
        }
        this.I_Il = nArray;
        this.lI1_();
    }

    private IO0l IO0l_II(int n) {
        IOol iOol = this.IOol_II();
        if (n < 0 || n >= iOol.var_IO0l_arr_III.length) {
            return null;
        }
        IO0l iO0l = iOol.var_IO0l_arr_III[n];
        return iO0l == null || iO0l.II1_() ? null : iO0l;
    }

    private void II(String string, String[] stringArray, boolean bl) {
        this.var_IO0_IIIO.var_IO00_II.II(string, stringArray, bl ? 5100 : 5101);
    }

    private static int int_II(IO0l iO0l) {
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        return iII == null ? -1 : iII.IoI_;
    }

    private static boolean boolean_II(IO0l iO0l, IO0l iO0l2) {
        if (iO0l == null || iO0l2 == null) {
            return false;
        }
        int n = IO_0.int_II(iO0l);
        return n == 0 && iO0l2.I1l == 223 || n == 1 && iO0l2.I1l == 222 || n == 2 && iO0l2.I1l == 224 || n == 3 && iO0l2.I1l == 221 || n == 4 && iO0l2.I1l == 220;
    }

    private static int int_II(IO0l iO0l, int n) {
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            if (nArray[0] != n) continue;
            return i;
        }
        return -1;
    }

    private static boolean boolean_II_0(int n) {
        return n == 47 || n == 6 || n == 0 || n == 7 || n == 14 || n == 22 || n == 23;
    }

    private static String III(int n, int n2) {
        int n3;
        Object object;
        if (var_java_util_Hashtable_IIIO == null) {
            var_java_util_Hashtable_IIIO = new Hashtable();
            try {
                object = Res.read(IO_0.I11l("\u4b59\u4b25\u4b00\u4bfd\u4bd3\u4bbc\u4b95\u4c7c\u4c00\u4c2f\u4c05\u4ce5", 19254));
                if (object != null) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
                    int n4 = dataInputStream.readShort();
                    for (int i = 0; i < n4; ++i) {
                        short s = dataInputStream.readShort();
                        var_java_util_Hashtable_IIIO.put(new Integer(s), dataInputStream.readUTF());
                    }
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if ((object = (String)var_java_util_Hashtable_IIIO.get(new Integer(n))) == null) {
            object = IO_0.I11l("\u4b15", 19254);
        }
        return (n3 = ((String)object).indexOf(35)) < 0 ? object : ((String)object).substring(0, n3) + n2 + ((String)object).substring(n3 + 1);
    }

    private static int II_l(int n) {
        int[] nArray = new int[]{3, 7, 11, 17, 23, 35, 50, 70};
        return n >= 0 && n < nArray.length ? nArray[n] : 0;
    }

    private static int II_1(int n) {
        int[] nArray = new int[8];
        nArray[0] = 1;
        nArray[1] = 1;
        nArray[2] = 1;
        nArray[3] = 1;
        nArray[4] = 1;
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        int[] nArray2 = nArray;
        return n >= 0 && n < nArray2.length ? nArray2[n] : 0;
    }

    private static float float_II(int n) {
        return 100.0f;
    }

    private IO0l[] II(String[] stringArray) {
        IO0l iO0l = null;
        IO0l iO0l2 = null;
        IO0l iO0l3 = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l4 = this.IO0l_II(this.I_Il[i]);
            if (iO0l4 == null) continue;
            if (this.I_Il.length == 3 && iO0l4.I1l == 987) {
                iO0l3 = iO0l4;
                ++n3;
                continue;
            }
            int n4 = IO_0.int_II(iO0l4);
            if (n4 >= 0 && n4 < 5) {
                iO0l = iO0l4;
                ++n;
                continue;
            }
            if (n4 != 14) continue;
            iO0l2 = iO0l4;
            ++n2;
        }
        if (n < 1) {
            stringArray[0] = IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4ae1\u52dc\u4c0e\u4c23\u4c8e\u4ce5\u4ccd\u4ce9\u4c8b\u53a2\u4d56", 19254);
            return null;
        }
        if (n2 < 1) {
            stringArray[0] = IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4ae1\u4cee\u4c0e\u4c23\u4c8e\u4ce5\u4ccd\u4ce9\u4c8b\u53a2\u4d56", 19254);
            return null;
        }
        if (this.I_Il.length == 3 && n3 < 1) {
            stringArray[0] = IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4ae1\u52dc\u4c0e\u4c23\u4c8e\u4ce5\u4ccd\u4ce9\u4c8b\u53a2\u4d56", 19254);
            return null;
        }
        if (n != 1 || n2 != 1) {
            stringArray[0] = IO_0.I11l("\u4b7e\u4bb6\u4b0d\u4bb3\u4bd1\u4bb9\u553d\u4c61\u4c0e\u4c7c\u4c4c\u4cff\u4cd8\u4ca8\u4c86\u4d60\u4d06\u4d27\u53af\u4da3\u4dd4\u4d21\u4dc0\u4dce\u4e3e\u4e51\u4e33\u50da\u4ef3\u4e99\u4fc9\u4e16\u4f36\u4f5b\u4fb6\u4f1d\u4ff5\u4f91\u4fb3\u514a\u507e", 19254);
            return null;
        }
        return new IO0l[]{iO0l, iO0l2, iO0l3};
    }

    private void lI1I() {
        String string;
        int[] nArray;
        int n;
        int n2;
        String[] stringArray = new String[]{IO_0.I11l("\u4a26\u4ba6\u4b1a\u4bf4", 19254)};
        if (this.I_Il.length < 2 || this.I_Il.length > 3) {
            this.II(this.I_Il.length > 3 ? IO_0.I11l("\u4b75\u55f0\u4b00\u4bb3\u4aa3\u4bb8\u4bd0\u4c6c\u4c41\u4c23\u4c4c\u4cff\u4ccb\u4ce9\u4c83\u4d6f\u4dd2\u4d2b\u4d03\u4da3\u4dd6\u4da9\u4d08\u4d92", 19254) : IO_0.I11l("\u4b7e\u4bb6\u4b0d\u4bb3\u4bd1\u4bb9\u553d\u4c61\u4c0e\u4c7c\u4c4c\u4cff\u4cd8\u4ca8\u4c86\u4d60\u4d06\u4d27\u53af\u4da3\u4dd4\u4d21\u4dc0\u4dce\u4e3e\u4e51\u4e33\u50da\u4ef3\u4e99\u4fc9\u4e16\u4f36\u4f5b\u4fb6\u4f1d\u4ff5\u4f91\u4fb3\u514a\u507e", 19254), stringArray, false);
            return;
        }
        String[] stringArray2 = new String[1];
        IO0l[] iO0lArray = this.II(stringArray2);
        if (iO0lArray == null) {
            this.II(stringArray2[0], stringArray, false);
            return;
        }
        IO0l iO0l = iO0lArray[0];
        IO0l iO0l2 = iO0lArray[1];
        IO0l iO0l3 = iO0lArray[2];
        if (!IO_0.boolean_II(iO0l, iO0l2)) {
            this.II(IO_0.I11l("\u4b7e\u4bb6\u4b0d\u4bb3\u4bd1\u4bb9\u553d\u4c61\u4c0e\u4c7c\u4c4c\u4cff\u4cd8\u4ca8\u4c86\u4d60\u4d06\u4d27\u53af\u4da3\u4dd4\u4d21\u4dc0\u4dce\u4e3e\u4e51\u4e33\u50da\u4ef3\u4e99\u4fc9\u4e16\u4f36\u4f5b\u4fb6\u4f1d\u4ff5\u4f91\u4fb3\u514a\u507e", 19254), stringArray, false);
            return;
        }
        int n3 = IO_0.int_II(iO0l, 72);
        int n4 = n2 = n3 < 0 ? 0 : ((int[])iO0l.IIl.elementAt(n3))[1];
        if (n2 >= 8) {
            this.II(IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c2e\u528b\u4cea\u4c8a\u4ca7\u4c8f\u4cb7\u4c87\u4d2c\u4d44\u4c92\u4d41\u4de1\u4cf1\u535e\u4e6a\u4e1d\u4e3f\u50de\u4eea\u4e99\u4eac\u5026\u4f7f\u4f15\u4e45\u4f12", 19254), stringArray, false);
            return;
        }
        this.lOo_ = IO_0.II_1(n2);
        this.III1 = IO_0.float_II(n2);
        this.l0__ = IO_0.II_l(n2);
        this.l0_O = 1;
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        IOO.III iII2 = IOO.IOO$III_II(iO0l2.I1l);
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bdb\u4bdb\u5516\u4b9e\u4c2f\u4c5a\u52ec\u4c05\u4cab", 19254) + iII.II1o + IO_0.I11l("\u4b16\u4b7d\u4b5f", 19254) + n2 + IO_0.I11l("\u4b1f\u4b5f\u4b08\u4ba3\u4bce", 19254));
        int n5 = -1;
        int n6 = 0;
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            nArray = (int[])iO0l.IIl.elementAt(n);
            if (nArray[0] == 72) continue;
            stringBuffer.append(IO_0.III(nArray[0], nArray[1])).append('\n');
        }
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            nArray = (int[])iO0l.IIl.elementAt(n);
            if (!IO_0.boolean_II_0(nArray[0])) continue;
            n5 = nArray[0];
            n6 = nArray[1] + nArray[1] * 10 / 100;
            break;
        }
        if (n5 < 0) {
            this.II(IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c23\u4c8c\u4cf2\u4c8a\u4ca2\u4c80\u4df3\u4d48\u4d22\u4d44\u4df7\u4dca\u5302\u4dc0\u4d91\u4efc\u4e53\u4e3b\u4e5b\u4ef9\u501c\u4ea8", 19254), stringArray, false);
            return;
        }
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc0\u4bd3\u4ba4\u4bd0\u4c64\u4c46\u4c24\u4c4c\u4ce5\u4c48\u4ca7\u4c8f\u4d27\u4d45\u53e0\u4d14\u4da3\u4d8a\u4dea", 19254) + (n2 + 1) + IO_0.I11l("\u4b1f\u4b5f\u4b08\u4ba4\u4bce", 19254)).append(IO_0.III(n5, n6));
        stringBuffer.append(IO_0.I11l("\u4b3c\u4b29\u4b43\u4bef\u4be6\u5518\u4bd0\u4c63\u52e9\u4c6d\u4c18\u4ce3\u4c4a\u4ca7\u4c80\u4d27\u4d45\u4db1\u4d0a\u4de4\u4d98\u4de1", 19254) + this.III1 + IO_0.I11l("\u4b13\u4b5f", 19254));
        stringBuffer.append(this.l0__ > iO0l2.lo0I ? IO_0.I11l("\u4b4a\u4b62\u4b08", 19254) : IO_0.I11l("\u4b4a\u4b64\u4b08", 19254)).append(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3", 19254) + this.l0__ + IO_0.I11l("\u4b16", 19254) + iII2.II1o + IO_0.I11l("\u4b3c", 19254));
        stringBuffer.append((long)this.lOo_ > this.IOol_II().Il11 ? IO_0.I11l("\u4b4a\u4b62\u4b08", 19254) : IO_0.I11l("\u4b4a\u4b64\u4b08", 19254)).append(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3", 19254) + IO00.IIlI(this.lOo_) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254));
        String string2 = string = this.I_Il.length == 3 && iO0l3 != null ? IO_0.I11l("\u4b3c\u4b16\u55d3\u4bfd\u4b92\u4ba5\u5521\u4c61\u4c0e", 19254) + this.l0_O + IO_0.I11l("\u4b16\u4a44\u4b95\u4bb3\u4bd0\u5572\u4b9f\u4c2f\u4c58\u528a", 19254) : "";
        if (!(n2 != 2 && n2 != 4 && n2 != 6 || this.I_Il.length == 3 && iO0l3 != null)) {
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b1b\u55cb\u4be6\u4b92\u4ba5\u4b98\u52aa\u4c5a\u4c6d\u4c0e\u522a\u4cc3\u4ce9\u4c9b\u53ba\u4d06\u4d37\u53bf\u4df7\u4d82\u4db9\u4d95\u532e\u4e70\u4e5a\u4e7c\u4e53\u4eb1", 19254) + (n2 - 1) + IO_0.I11l("\u4b1f", 19254));
        }
        if (this.l0__ > iO0l2.lo0I) {
            this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bc6\u4bb9\u4b99\u52b0\u4c5b\u4c47", 19254) + (this.l0__ - iO0l2.lo0I) + IO_0.I11l("\u4b16", 19254) + iII2.II1o}, false);
        } else if ((long)this.lOo_ > this.IOol_II().Il11) {
            this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bc6\u4bb9\u4b99\u52b0\u4c5b\u4c47", 19254) + IO00.IIlI((long)this.lOo_ - this.IOol_II().Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254)}, false);
        } else if (this.I_Il.length == 3 && iO0l3 != null && iO0l3.lo0I < this.l0_O) {
            this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bc6\u4bb9\u4b99\u52b0\u4c5b\u4c47", 19254) + (this.l0_O - iO0l3.lo0I) + IO_0.I11l("\u4b16\u4a44\u4b95\u4bb3\u4bd0\u5572\u4b9f\u4c2f\u4c58\u528a", 19254)}, false);
        } else {
            this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24", 19254) + IO00.IIlI(this.lOo_) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254) + string, IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
        }
    }

    private void lI1l() {
        String string;
        boolean bl;
        boolean bl2;
        int n;
        if (this.I_Il.length < 2 || this.I_Il.length > 3) {
            return;
        }
        String[] stringArray = new String[1];
        IO0l[] iO0lArray = this.II(stringArray);
        if (iO0lArray == null) {
            return;
        }
        IO0l iO0l = iO0lArray[0];
        IO0l iO0l2 = iO0lArray[1];
        IO0l iO0l3 = iO0lArray[2];
        if (!IO_0.boolean_II(iO0l, iO0l2)) {
            return;
        }
        IOol iOol = this.IOol_II();
        int n2 = IO_0.int_II(iO0l, 72);
        int n3 = n = n2 < 0 ? 0 : ((int[])iO0l.IIl.elementAt(n2))[1];
        if (n >= 8) {
            return;
        }
        int n4 = IO_0.II_l(n);
        int n5 = IO_0.II_1(n);
        float f = IO_0.float_II(n);
        if (iOol.Il11 < (long)n5) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        if (iO0l2.lo0I < n4) {
            return;
        }
        boolean bl3 = bl2 = this.I_Il.length == 3 && iO0l3 != null;
        if (this.I_Il.length == 3 && (iO0l3 == null || iO0l3.lo0I < 1)) {
            return;
        }
        int n6 = -1;
        int n7 = -1;
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int n8 = ((int[])iO0l.IIl.elementAt(i))[0];
            if (IO_0.boolean_II_0(n8)) {
                n6 = i;
                continue;
            }
            if (n8 != 27 && n8 != 28) continue;
            n7 = i;
        }
        if (n6 < 0) {
            return;
        }
        iOol.Il11 -= (long)n5;
        int[] nArray = (int[])iO0l.IIl.elementAt(n6);
        int[] nArray2 = n7 < 0 ? null : (int[])iO0l.IIl.elementAt(n7);
        boolean bl4 = bl = this.var_java_util_Random_IIIO.nextFloat() * 100.0f < f;
        if (bl) {
            int n9;
            nArray[1] = nArray[1] + Math.max(nArray[1] * 10 / 100, 1);
            if (nArray2 != null) {
                nArray2[1] = nArray2[1] + Math.max(nArray2[1] * 10 / 100, 1);
            }
            if ((n9 = IO_0.int_II(iO0l, 72)) < 0) {
                iO0l.III(72, 1);
            } else {
                int[] nArray3 = (int[])iO0l.IIl.elementAt(n9);
                nArray3[1] = nArray3[1] + 1;
            }
            this.var_IOo__IIIO.II(new IO0o(-81).II(2));
            string = IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bbc\u551b\u4c61\u4c49\u4c6d\u4c0f\u4ce4\u4cc4\u4ce9\u4c86\u4d6f\u4dcf", 19254);
        } else {
            if (!(n != 2 && n != 4 && n != 6 || bl2)) {
                int n10;
                int n11;
                nArray[1] = nArray[1] - Math.max(nArray[1] * 11 / 100, 1);
                if (nArray2 != null) {
                    nArray2[1] = nArray2[1] - Math.max(nArray2[1] * 11 / 100, 1);
                }
                if ((n11 = IO_0.int_II(iO0l, 72)) >= 0) {
                    int[] nArray4 = (int[])iO0l.IIl.elementAt(n11);
                    nArray4[1] = nArray4[1] - 1;
                }
                if ((n10 = IO_0.int_II(iO0l, 209)) < 0) {
                    iO0l.III(209, 1);
                } else {
                    int[] nArray5 = (int[])iO0l.IIl.elementAt(n10);
                    nArray5[1] = nArray5[1] + 1;
                }
            }
            this.var_IOo__IIIO.II(new IO0o(-81).II(3));
            String[] stringArray2 = new String[]{IO_0.I11l("\u4b7a\u55f2\u4b1a\u4bb3\u4bdc\u4b31\u4b89\u4c2f\u4c56\u4c38\u4c05\u4cab\u4cde\u4ca1\u4c1c\u4d6e\u4d0a\u4d65\u4c75\u532e\u4dd2\u4de1\u4d94\u4d96\u50a1\u4e4d\u4e7c\u4f6a\u4ef3\u4e98", 19254), IO_0.I11l("\u4b75\u4bb5\u4b1a\u4bf4\u4b92\u4bb2\u4b91\u4c76\u4c02\u4c6d\u4c0f\u4c6b\u4cc4\u4cae\u4cc8\u4d77\u4d4e\u53e6\u4d0d\u4da3\u4cb3\u536c\u4d90\u4dde", 19254), IO_0.I11l("\u4b74\u4bb9\u4b1a\u4bfb\u4b92\u4ba5\u4ad9\u4c61\u4c46\u4c61\u4c4c\u4ce8\u4cc2\u4d79\u4c89\u4d27\u4d4a\u4daf\u4d0a\u4da3\u4dd6\u4da9\u4d0c\u4ddf\u4e73\u4e5c\u4e35\u4e5b\u4ef6\u4e53\u4eb6\u4ed6", 19254), IO_0.I11l("\u4b62\u4b3d\u55d1\u4be7\u4b92\u4bb3\u5551\u4c66\u4c0e\u4c21\u4c8c\u4cab\u4cc7\u5270\u4cc8\u4d73\u4d4e\u4da5\u4d0a\u4deb\u4d82\u4da2\u4d14\u4d91\u4e79\u4e1c", 19254), IO_0.I11l("\u4b7a\u55f4\u4b1d\u4bb3\u4bca\u551a\u4b84\u4c23\u4c0e\u4c23\u4c04\u4c69\u4cc4\u4ce9\u4c98\u4d6f\u538f\u4d28\u4d44\u4c92\u4dc3\u4daf\u4d87\u4ddf\u4e70\u4e5a\u50bb\u4e5b\u4e7a\u4e86", 19254), IO_0.I11l("\u4a26\u55f8\u4b04\u4bb3\u4bc6\u4bb9\u554f\u4c2f\u4c40\u4cad\u4c15\u4cab\u4cde\u4ca1\u4c04\u4d27\u4d56\u4d2d\u4d85\u4da3\u4dd1\u5362\u4d8e\u4ddf\u4e6d\u50e6\u4e31\u4e5b\u4eee\u4ed1\u4e2c\u4e9e\u4f37", 19254), IO_0.I11l("\u4b77\u4b3c\u4b54\u4a82\u4b41\u4bf1\u4b97\u52c2\u4c47\u4c6d\u4c18\u4ce3\u520d\u4cb0\u4cc8\u4c16\u53ff\u4d65\u4d07\u4deb\u4c12\u4da0\u4ddf", 19254)};
            string = stringArray2[this.var_java_util_Random_IIIO.nextInt(stringArray2.length)];
        }
        this.var_IOo__IIIO.II(new IO0o(124).III(21).II(string));
        if (bl2) {
            this.void_II(iO0l3, 1);
        }
        this.void_II(iO0l2, n4);
        this.var_IO0_IIIO.IIIl.l1_l();
        this.var_IO0_IIIO.IIIl.l1_();
        this.lI11();
        this.var_IO0_IIIO.I__O();
    }

    private void lI11() {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 0; i < this.I_Il.length; ++i) {
            if (this.IO0l_II(this.I_Il[i]) == null) continue;
            vector.addElement(new Integer(this.I_Il[i]));
        }
        IO0o iO0o = new IO0o(-81).II(1).II(vector.size());
        for (int i = 0; i < vector.size(); ++i) {
            iO0o.II((Integer)vector.elementAt(i));
        }
        this.var_IOo__IIIO.II(iO0o);
        this.I_Il = new int[0];
    }

    private void void_II(IO0l iO0l, int n) {
        int[] nArray = iO0l.III();
        if (nArray != null) {
            nArray[1] = nArray[1] - n;
            iO0l.lo0I = nArray[1] > 0 ? 1 : 0;
        } else {
            iO0l.lo0I -= n;
        }
        if (iO0l.lo0I <= 0) {
            IOol iOol = this.IOol_II();
            for (int i = 0; i < iOol.var_IO0l_arr_III.length; ++i) {
                if (iOol.var_IO0l_arr_III[i] != iO0l) continue;
                iOol.var_IO0l_arr_III[i] = new IO0l();
                break;
            }
        }
    }

    private void lI1_() {
        switch (this.IoI_) {
            case 510: {
                this.lI1I();
                break;
            }
            case 511: {
                this.lI10();
                break;
            }
            case 518: {
                this.lI_();
                break;
            }
            case 517: {
                this.Il1_(2);
                break;
            }
            case 519: {
                this.Il1_(3);
                break;
            }
            case 512: {
                this.lI_l();
                break;
            }
            case 513: {
                this.lI__();
                break;
            }
            case 104: {
                this.lI_0();
                break;
            }
            case 105: {
                this.lIO();
                break;
            }
            case 106: {
                this.lIOl();
                break;
            }
            case 107: {
                this.lIO_();
                break;
            }
            case 108: {
                this.lIO0();
                break;
            }
            case 515: {
                this.lI01();
                break;
            }
            case 500: {
                this.lI0_();
                break;
            }
            case 501: {
                this.lI00();
                break;
            }
            case 994: {
                this.IIl0(false);
                break;
            }
            case 995: {
                this.IIl0(true);
                break;
            }
            case 996: {
                this.lIoo();
                break;
            }
            case 997: {
                this.llI();
                break;
            }
            case 100: {
                this.lI0o();
                break;
            }
            case 101: {
                this.lIoI();
                break;
            }
            case 102: {
                this.lIoO();
                break;
            }
            case 103: {
                this.lIo1();
                break;
            }
        }
    }

    void I_1o() {
        switch (this.IoI_) {
            case 510: {
                this.lI1l();
                break;
            }
            case 511: {
                this.lI1o();
                break;
            }
            case 518: {
                this.lI_I();
                break;
            }
            case 517: {
                this.Il1O(2);
                break;
            }
            case 519: {
                this.Il1O(3);
                break;
            }
            case 512: {
                this.lI_1();
                break;
            }
            case 513: {
                this.lI_O();
                break;
            }
            case 104: {
                this.lI_o();
                break;
            }
            case 105: {
                this.lIOI();
                break;
            }
            case 106: {
                this.lIO1();
                break;
            }
            case 107: {
                this.lIOO();
                break;
            }
            case 108: {
                this.lIOo();
                break;
            }
            case 500: {
                this.lI0O();
                break;
            }
            case 501: {
                this.Il_(1);
                break;
            }
            case 994: {
                this.IIlo(false);
                break;
            }
            case 995: {
                this.IIlo(true);
                break;
            }
            case 996: {
                this.ll();
                break;
            }
            case 997: {
                this.llII();
                break;
            }
            case 100: {
                this.lIo();
                break;
            }
            case 101: {
                this.lIol();
                break;
            }
            case 102: {
                this.lIo0();
                break;
            }
            case 103: {
                this.lIo_();
                break;
            }
        }
    }

    private int II0_() {
        int n = 0;
        for (int i = 0; i < this.I_Il.length; ++i) {
            if (this.IO0l_II(this.I_Il[i]) == null) continue;
            ++n;
        }
        return n;
    }

    private IO0l IO0l_III(int n) {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || iO0l.I1l != n) continue;
            return iO0l;
        }
        return null;
    }

    private IO0l IO0l_II() {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || !IO_0.boolean_II_o(iO0l.I1l)) continue;
            return iO0l;
        }
        return null;
    }

    private static boolean boolean_II_o(int n) {
        for (int i = 0; i < I_I1.length; ++i) {
            if (I_I1[i] != n) continue;
            return true;
        }
        return false;
    }

    private int II__(int n) {
        int n2 = 0;
        IO0l[] iO0lArray = this.IOol_II().var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            n2 += iO0lArray[i].IIo1();
        }
        return n2;
    }

    private boolean boolean_IIO(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        for (n2 = 0; n2 < iOol.var_IO0l_arr_III.length; ++n2) {
            if (iOol.var_IO0l_arr_III[n2].II1_() || iOol.var_IO0l_arr_III[n2].I1l != n) continue;
            return true;
        }
        for (n2 = 0; n2 < iOol.IIII.length; ++n2) {
            if (iOol.IIII[n2].II1_() || iOol.IIII[n2].I1l != n) continue;
            return true;
        }
        return false;
    }

    private int II0O() {
        int n = 0;
        IO0l[] iO0lArray = this.IOol_II().var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (!iO0lArray[i].II1_()) continue;
            ++n;
        }
        return n;
    }

    private void II_(int n, int n2) {
        IO0l[] iO0lArray = this.IOol_II().var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length && n2 > 0; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            int[] nArray = iO0lArray[i].III();
            if (nArray != null) {
                if (nArray[1] > n2) {
                    nArray[1] = nArray[1] - n2;
                    n2 = 0;
                    continue;
                }
                n2 -= nArray[1];
                iO0lArray[i] = new IO0l();
                continue;
            }
            if (iO0lArray[i].lo0I > n2) {
                iO0lArray[i].lo0I -= n2;
                n2 = 0;
                continue;
            }
            n2 -= iO0lArray[i].lo0I;
            iO0lArray[i] = new IO0l();
        }
    }

    private static String III0(int n) {
        IOO.III iII = IOO.IOO$III_II(n);
        return iII == null ? IO_0.I11l("\u4b15", 19254) + n : iII.II1o;
    }

    private static int III(IO0l iO0l, int n) {
        int n2 = IO_0.int_II(iO0l, n);
        return n2 < 0 ? 0 : ((int[])iO0l.IIl.elementAt(n2))[1];
    }

    private static String II(boolean bl, String string) {
        return (bl ? IO_0.I11l("\u4b4a\u4b67\u4b08", 19254) : IO_0.I11l("\u4b4a\u4b62\u4b08", 19254)) + string + IO_0.I11l("\u4b3c", 19254);
    }

    private int IIlI(int n, int n2) {
        return n + this.var_java_util_Random_IIIO.nextInt(n2 - n + 1);
    }

    private void IIlO(boolean bl) {
        if (LyForgeFast.enabled()) {
            return;
        }
        this.var_IOo__IIIO.II(new IO0o(-81).II(bl ? 2 : 3));
    }

    private void II_1(String string) {
        this.var_IOo__IIIO.II(new IO0o(124).III(this.l0_1).II(string));
    }

    private void lI1O() {
        this.var_IO0_IIIO.IIIl.l1_l();
        this.var_IO0_IIIO.IIIl.l1_();
        this.lI11();
        this.var_IO0_IIIO.I__O();
    }

    private void III1(int[] nArray) {
        int n;
        this.var_IOo__IIIO.II(new IO0o(-81).II(0).II(IO_0.I11l("\u4b58\u4b20\u4b18\u4bff", 19254)).II(IO_0.I11l("\u4b58\u4b20\u4b18\u4bff", 19254)).III(this.l0_1));
        Vector<Integer> vector = new Vector<Integer>();
        IO0l[] iO0lArray = this.IOol_II().var_IO0l_arr_III;
        block0: for (int i = 0; i < nArray.length; ++i) {
            for (n = 0; n < iO0lArray.length; ++n) {
                if (iO0lArray[n].II1_() || iO0lArray[n].I1l != nArray[i]) continue;
                vector.addElement(new Integer(n));
                continue block0;
            }
        }
        IO0o iO0o = new IO0o(-81).II(1).II(vector.size());
        for (n = 0; n < vector.size(); ++n) {
            iO0o.II((Integer)vector.elementAt(n));
        }
        this.var_IOo__IIIO.II(iO0o);
        this.IoI_ = 0;
        this.I_Il = new int[0];
    }

    private void void_II(boolean bl, int n) {
        if (bl) {
            this.var_IOo__IIIO.II(new IO0o(-81).II(7).III(n));
        } else {
            this.var_IOo__IIIO.II(new IO0o(-81).II(8));
        }
    }

    private void lI10() {
        IO0l iO0l = this.IO0l_III(454);
        IO0l iO0l2 = this.IO0l_III(933);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4bb2\u4cfb\u4c40\u4c2a\u4c4c\u4cff\u4ccb\u4ca0\u4cc8\u4d57\u4d49\u4d37\u4d05\u4df7\u4dc3\u4de1\u4d83\u535a\u4e6e\u4e1d\u4e6d\u4e5b\u4eec\u4e59\u4ef8\u4ece\u4f2f\u4f0c\u4f6d\u4f53\u4fdf\u5112\u4fbe\u4f87\u502e\u505b\u4ead\u504b\u50e8\u505d\u50a6\u5080\u5126\u5151\u5125\u510a", 19254), Il10, false);
            return;
        }
        IOol iOol = this.IOol_II();
        int n = this.II__(933);
        String string = IO_0.III0(933);
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bd1\u4b46\u4bbf\u4b97\u4c2f\u4c5a\u4c2c\u4c05\u4cab\u4cfa\u4ca6\u4c9a\u4d66\u4d52\u4d24\u4d44\u4dd8\u4d89\u4df3\u4dbd\u4df5\u4e14\u4e41\u4e6e\u4e07\u4ece\u5070\u4ef8\u4e9b\u51d1\u4f15\u4f20\u4f1b\u4f72\u4fdf\u4fb8\u4fcf\u506d\u50d9\u5022\u500c\u50b0\u5089\u50f9\u50d7\u5136\u5100\u514e", 19254));
        stringBuffer.append(IO_0.II(n >= 9999, IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b8b\u4be8\u4bc9\u4c36\u4c0e", 19254) + string));
        stringBuffer.append(IO_0.II(iOol.Il11 >= 1L, IO_0.I11l("\u4b75\u55f2\u4b1a\u4ba9\u4b92", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254)));
        stringBuffer.append(IO_0.II(iOol.lOoO >= 1, IO_0.I11l("\u4b75\u55f2\u4b1a\u4ba9\u4b92\u4be0\u4bd0\u4c61\u4c49\u5280\u4c0f", 19254)));
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b62\u4b08\u4bc7\u4bda\u5574\u4b84\u4c2f\u4c4c\u52ec\u4c05\u4cab\u4c87\u4cf0\u4cd1\u4d27", 19254) + string);
        if (n < 9999) {
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b16\u4b86\u4bfd\u4b92\u4ba5\u4b98\u4c66\u5291\u4c38\u4c4c", 19254) + (9999 - n) + IO_0.I11l("\u4b16", 19254) + string);
            this.II(stringBuffer.toString(), Il10, false);
        } else if (iOol.lOoO < 1) {
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b16\u4b86\u4bfd\u4b92\u4ba5\u4b98\u4c66\u5291\u4c38\u4c66", 19254) + (1 - iOol.lOoO) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1", 19254));
            this.II(stringBuffer.toString(), Il10, false);
        } else if (iOol.Il11 < 1L) {
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b16\u4b86\u4bfd\u4b92\u4ba5\u4b98\u4c66\u5291\u4c38\u4c4c", 19254) + IO00.IIlI(1L - iOol.Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254));
            this.II(stringBuffer.toString(), Il10, false);
        } else {
            String[] stringArray = new String[2];
            stringArray[0] = IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb\u4bc1\u4c2f\u4c40\u4c2a\u52a1\u4ce8", 19254);
            stringArray[1] = IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254);
            this.II(stringBuffer.toString(), stringArray, true);
        }
    }

    private void lI1o() {
        IO0l iO0l = this.IO0l_III(454);
        IO0l iO0l2 = this.IO0l_III(933);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null) {
            return;
        }
        IOol iOol = this.IOol_II();
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        if (iOol.lOoO < 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u5246\u4cc9\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        if (this.boolean_IIO(921)) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b78\u4b32\u4ac4\u4a32\u4bdb\u4bf1\u4ae1\u4cec\u4c0e\u4c2e\u4c9f\u4cab\u4cc8\u4c3d\u4c86\u4d60\u4d06\u4d31\u4d05\u4dea\u4d82\u4d91\u4d8f\u4d8d\u4e7f\u4e49\u4e3d\u4e5b\u4ef9\u501c\u4ea8\u4ed7\u4f24\u4f15\u4f20\u4f01\u4ffd\u4fdf\u4fb7\u4fcf\u5066\u50cd\u5022\u500c\u50aa\u50dd\u50ba\u5086\u5168\u5142\u5164\u5111\u4f51\u51c8\u51ee", 19254));
            return;
        }
        if (this.II__(933) < 9999) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c20\u52cf\u4ce5\u4cc2\u4ce9\u4c9e\u53e6\u4d06\u4d27\u4d90\u4ded\u4dc5\u4de1\u4d94\u4d9e\u4e77\u4e1d\u4f4d\u50b8\u4eba\u4ed7\u4e3a\u4e99\u4f71\u4f15\u4f37\u51d6\u4fe2", 19254));
            return;
        }
        --iOol.Il11;
        --iOol.lOoO;
        if (this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            iO0l.I1l = 921;
            iO0l.IIl.removeAllElements();
            iO0l.III(72, 2);
            this.IIlO(true);
            this.II_(933, 9999);
        } else {
            this.IIlO(false);
            this.II_(933, 99);
        }
        this.lI1O();
    }

    private void lI_() {
        StringBuffer stringBuffer;
        block9: {
            int n;
            int n2;
            int n3;
            IOol iOol;
            block8: {
                IO0l iO0l = this.IO0l_III(921);
                if (this.II0_() != 2 || iO0l == null) {
                    this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4bb2\u4cfb\u4c40\u4c2a\u4c4c\u4cff\u4ccb\u4ca0\u4cc8\u4d57\u4d49\u4d37\u4d05\u4df7\u4dc3\u4de1\u4d83\u535a\u4e6e\u4e1d\u4e6e\u4e5b\u4f8b\u507a\u4ef8\u4e99\u4ff4\u4f5b\u4f33\u4f53\u4ff1\u5114\u4fa0", 19254), Il10, false);
                    return;
                }
                iOol = this.IOol_II();
                n3 = this.II__(1815);
                n2 = this.II__(934);
                n = this.II__(935);
                stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bd1\u4b46\u4bbf\u4b97\u4c2f\u4c5a\u4c2c\u4c05\u4cab\u4cfa\u4ca6\u4c9a\u4d66\u4d52\u4d24\u4d44\u4dd8\u4d89\u4df2\u4dbd\u4df5\u4e14\u4e41\u4e6e\u4e07\u4ece\u5070\u4ef8\u4e9b\u51d1\u4f15\u4f20\u4f1b\u4f72\u4fdf\u4fb8\u4fcf\u506d\u50d9\u5022\u500c\u50b0\u5089\u50f9\u50d7\u5136\u5100\u514e\u511f\u51b0\u51dd\u5183\u4f78\u5190\u523d\u520e\u526b\u5254\u52a9\u5288\u52e7\u52d6\u5358\u4d97\u533d\u531a\u53b1\u53f2\u533b\u5380\u546a\u540c\u541f\u540b\u54e0\u5488\u5484\u4a43\u5575\u5504\u5570\u5568\u55fd\u5592\u55c3\u559d\u4b5a\u5672\u5601\u567a\u5648\u56b8\u56d9\u56b1\u4838\u5777\u5739", 19254));
                if (n3 < 20000 || n2 < 99 || n < 2) break block8;
                if (iOol.lOoO >= 1) break block9;
            }
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b29\u4b43\u4bef\u4be6\u4bb9\u4b99\u52b0\u4c5b\u4c6d\u4c02\u4cec\u4cdf\u4cb0\u4c02\u4d69\u4d06\u4d29\u4d0d\u5344\u4dd7\u4dfb\u4dea", 19254));
            if (n3 < 20000) {
                stringBuffer.append(IO_0.I11l("\u4b1b\u4b75\u4b37\u4b61\u4bdc\u4bf1\u4b84\u4c67\u4c47\u52f2\u4c19\u4cab", 19254) + (20000 - n3) + IO_0.I11l("\u4b16\u4b18\u55d7\u4bfd\u4bda\u4bf1\u4bb2\u4cfb\u4c40\u4c2a\u4c4c\u4cdf\u4ccb\u4ca0\u4ce2", 19254));
            }
            if (n2 < 99) {
                stringBuffer.append(IO_0.I11l("\u4b1b\u4b75\u4b37\u4b61\u4bdc\u4bf1\u4b84\u4c67\u4c47\u52f2\u4c19\u4cab", 19254) + (99 - n2) + IO_0.I11l("\u4b16", 19254) + IO_0.III0(934) + IO_0.I11l("\u4b3c", 19254));
            }
            if (n < 2) {
                stringBuffer.append(IO_0.I11l("\u4b1b\u4b75\u4b37\u4b61\u4bdc\u4bf1\u4b84\u4c67\u4c47\u52f2\u4c19\u4cab", 19254) + (2 - n) + IO_0.I11l("\u4b16", 19254) + IO_0.III0(935) + IO_0.I11l("\u4b3c", 19254));
            }
            if (iOol.lOoO < 1) {
                stringBuffer.append(IO_0.I11l("\u4b1b\u4b75\u4b37\u4b61\u4bdc\u4bf1\u4b84\u4c67\u4c47\u52f2\u4c19\u4cab", 19254) + (1 - iOol.lOoO) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1\u4bdb", 19254));
            }
            this.II(stringBuffer.toString(), Il10, false);
            return;
        }
        this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24\u4c7c\u4c4c\u4ce5\u4ccd\u5204\u4c8b", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
    }

    private void lI_I() {
        IO0l iO0l = this.IO0l_III(921);
        if (this.II0_() != 2 || iO0l == null) {
            return;
        }
        IOol iOol = this.IOol_II();
        if (iOol.lOoO < 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u5246\u4cc9\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        if (this.boolean_IIO(1816)) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b78\u4b32\u4ac4\u4a32\u4bdb\u4bf1\u4ae1\u4cec\u4c0e\u4c2e\u4c9f\u4cab\u4cc8\u4c3d\u4c86\u4d60\u4d06\u4d31\u4d05\u4dea\u4d82\u4d91\u4d8f\u4d8d\u4e7f\u4e49\u4e3d\u4e5b\u4ef9\u501c\u4ea8\u4ed7\u4f25\u4f15\u4f20\u4f01\u4ffd\u4fdf\u4fb7\u4fcf\u5066\u50cd\u5022\u5003\u50aa\u50dd\u50ba\u5086\u5168\u5142\u5164\u5111\u4f51\u51c8\u51ee", 19254));
            return;
        }
        if (this.II__(1815) < 20000 || this.II__(934) < 99 || this.II__(935) < 2) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u4cfe\u4cd3\u4c23\u4c86\u4d27\u4d4a\u4d2c\u53a3\u4df6\u4d82\u4cd0\u5323\u4ddf\u4e70\u4edf\u4e32\u4e1c\u4eba\u4eda\u507d\u4e87", 19254));
            return;
        }
        --iOol.lOoO;
        if (this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            iO0l.I1l = 1816;
            iO0l.IIl.removeAllElements();
            iO0l.III(72, 3);
            this.IIlO(true);
            this.II_(1815, 20000);
        } else {
            this.IIlO(false);
            this.II_(1815, 999);
        }
        this.lI1O();
    }

    private void Il1_(int n) {
        int n2 = n == 2 ? 921 : 1816;
        int n3 = n == 2 ? 99 : 199;
        int n4 = n == 2 ? 1 : 2;
        IO0l iO0l = this.IO0l_III(n2);
        IO0l iO0l2 = this.IO0l_III(934);
        IO0l iO0l3 = this.IO0l_III(935);
        if (this.II0_() != 3 || iO0l == null || iO0l2 == null || iO0l3 == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4bb2\u4cfb\u4c40\u4c2a\u4c4c\u4cff\u4ccb\u4ca0\u4cc8\u4d57\u4d49\u4d37\u4d05\u4df7\u4dc3\u4de1\u4d83\u535a\u4e6e\u4e1d", 19254) + n + IO_0.I11l("\u4b1a\u4b75\u4b2c", 19254) + n3 + IO_0.I11l("\u4b16\u4b18\u55d7\u4bfd\u4bda\u4bf1\u4b98\u52dc\u4c40\u4c6d\u4c0e\u4c7f\u4cc4\u4cae\u4cc8\u4d73\u4d47\u4d2c\u4d44\u4df5\u4d42\u4de1", 19254) + n4 + IO_0.I11l("\u4b16\u4a45\u4b95\u4bb3\u4bca\u4bb0\u4b9e\u4c67\u4c0e\u4c21\u4c0d\u4ce6", 19254), Il10, false);
            return;
        }
        IOol iOol = this.IOol_II();
        String string = IO_0.III0(934);
        String string2 = IO_0.III0(935);
        String string3 = n == 2 ? IO_0.I11l("\u4b4a\u4b64\u4b08\u4bb8\u4b83\u4bf1\u4bb3\u4c67\u52e7\u4c6d\u4c1f\u525a\u4c8a\u4ca7\u4c8f\u53ac\u4d53\u4d65\u4d0a\u4deb\u4dcb\u4d2b\u4d8e", 19254) : IO_0.I11l("\u4b4a\u4b64\u4b08\u4bb8\u4b80\u4bf1\u4bb3\u4c67\u52e7\u4c6d\u4c1f\u525a\u4c8a\u4ca7\u4c8f\u53ac\u4d53\u4d65\u4d0a\u4deb\u4dcb\u4d2b\u4d8e", 19254);
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bd1\u4b46\u4bbf\u4b97\u4c2f\u4c5a\u4c2c\u4c05\u4cab\u4cfa\u4ca6\u4c9a\u4d66\u4d52\u4d24\u4d44\u4dd8\u4d89", 19254) + n + IO_0.I11l("\u4b6b\u4b5f\u4b7e\u4bef\u4b80\u4bad\u4ba4\u52c6\u4c0e\u4c21\u52ab\u4cab\u4cde\u4ca1\u4c08\u4d69\u4d4e\u4d65\u4d07\u4d77\u4dcc\u4da6\u4dda\u4ddf\u4e2f\u4e0d\u4e6c\u4e5e\u4e90", 19254));
        stringBuffer.append(IO_0.II(iO0l2.lo0I >= n3, IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3", 19254) + n3 + IO_0.I11l("\u4b16", 19254) + string));
        stringBuffer.append(IO_0.II(iO0l3.lo0I >= n4, IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3", 19254) + n4 + IO_0.I11l("\u4b16", 19254) + string2));
        stringBuffer.append(IO_0.II(iOol.lOoO >= 1, IO_0.I11l("\u4b75\u55f2\u4b1a\u4ba9\u4b92\u4be0\u4bd0\u4c61\u4c49\u5280\u4c0f", 19254)));
        stringBuffer.append(string3);
        if (iO0l3.lo0I < n4) {
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b29\u4b46\u4bef\u4bf1\u4b23\u4b9e\u4c2f\u4c5a\u4c25\u4c05\u5234\u4cdf\u4cc3", 19254) + (n4 - iO0l3.lo0I) + IO_0.I11l("\u4b16", 19254) + string2);
            this.II(stringBuffer.toString(), Il10, false);
        } else if (iO0l2.lo0I < n3) {
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b29\u4b46\u4bef\u4bf1\u4b23\u4b9e\u4c2f\u4c5a\u4c25\u4c05\u5234\u4cdf\u4cc3", 19254) + (n3 - iO0l2.lo0I) + IO_0.I11l("\u4b16", 19254) + string);
            this.II(stringBuffer.toString(), Il10, false);
        } else if (iOol.lOoO < 1) {
            stringBuffer.append(IO_0.I11l("\u4b3c\u4b29\u4b46\u4bef\u4bf1\u4b23\u4b9e\u4c2f\u4c5a\u4c25\u4c05\u5234\u4cdf\u4cc3", 19254) + (1 - iOol.lOoO) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1\u4bf1\u4b88\u4c6e\u4c40\u4c25", 19254));
            this.II(stringBuffer.toString(), Il10, false);
        } else {
            this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24\u4c7c\u4c4c\u4ce5\u4ccd\u5204\u4c8b", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
        }
    }

    private void Il1O(int n) {
        int n2 = n == 2 ? 921 : 1816;
        int n3 = n == 2 ? 99 : 199;
        int n4 = n == 2 ? 1 : 2;
        IO0l iO0l = this.IO0l_III(n2);
        IO0l iO0l2 = this.IO0l_III(934);
        IO0l iO0l3 = this.IO0l_III(935);
        if (this.II0_() != 3 || iO0l == null || iO0l2 == null || iO0l3 == null) {
            return;
        }
        IOol iOol = this.IOol_II();
        if (iOol.lOoO < 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b74\u55f4\u4b1a\u4bb3\u4bd9\u4bb9\u4b04\u4c61\u4c49\u4c6d\u4d7d\u526c\u4c8a\u4ca7\u4c8f\u53ca\u4d45\u4d69\u4d44\u4de0\u4d50\u4daf\u4dc0\u4d8b\u4e76\u4e54\u50e3\u4e0e\u4eba", 19254) + IO00.IIlI(1 - iOol.lOoO) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1\u4bf1\u4b9e\u52e0\u4c4f\u4c6c", 19254));
            return;
        }
        if (iO0l2.lo0I < n3 || iO0l3.lo0I < n4) {
            return;
        }
        --iOol.lOoO;
        if (this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            iO0l.IIl.removeAllElements();
            iO0l.III(I_I_[this.var_java_util_Random_IIIO.nextInt(I_I_.length)], this.IIlI(5, 15));
            if (n == 3) {
                iO0l.III(I_I_[this.var_java_util_Random_IIIO.nextInt(I_I_.length)], this.IIlI(5, 15));
            }
            iO0l.III(38, 0);
            iO0l.III(72, n);
            this.IIlO(true);
            this.II_1(IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bbc\u551b\u4c61\u4c49\u4c6d\u4c0f\u4ce4\u4cc4\u4ce9\u4c86\u4d6f\u4dcf", 19254));
        } else {
            this.IIlO(false);
            if (n == 3) {
                String[] stringArray = new String[]{IO_0.I11l("\u55d0\u4b34\u4b4b\u4bb3\u4be6\u4a61\u552f\u4c61\u4c49\u4c6d\u4c00\u522c\u4cc4\u4ce9\u4c86\u4de7\u4d5f\u4d65\u4d08\u4d69\u4dcc\u4de1\u4d83\u4d97\u50f7\u4e1c", 19254), IO_0.I11l("\u4b60\u4bb5\u4b1a\u4bf4\u4b92\u4bb3\u5551\u4c6c\u4c0e\u4c20\u4c8c\u4cf2\u4c8a\u4cbd\u4c87\u4d27\u4d48\u4d2d\u53b9\u4da2", 19254), IO_0.I11l("\u4b60\u4bb5\u4b1a\u4bf4\u4b92\u4bb3\u5551\u4c6c\u4c0e\u4c20\u4c8c\u4cf2\u4c8a\u4ca7\u4c80\u4d6e\u53e7\u4d30\u4d44\u4ded\u4dca\u531c\u4dc1", 19254), IO_0.I11l("\u4b74\u55f6\u4b1b\u4bb3\u4bc0\u5502\u4b99\u4c23\u4c0e\u4c25\u4c98\u4ce6\u4c8a\u4ca7\u4c89\u4d7e\u4d06\u4d2e\u4d0c\u4d77\u4dcc\u4da6\u4dc0\u4d97\u50fd\u4e4d\u4e7c\u4f6a\u5059\u4e99\u4eb6\u4e15\u4f78\u4f52\u4f74\u4e62\u5141\u4f91\u4ec1\u4f0d\u507b\u500c", 19254), IO_0.I11l("\u4b7a\u55f4\u4b1d\u4bb3\u4bc6\u5570\u4b93\u4c67\u4c02\u4c6d\u4c18\u4ce3\u4c5e\u4ca0\u4cc8\u4c16\u53cd\u4d2b\u4d03\u4da3\u4dc9\u4da9\u4d13\u4d9c\u4e3f", 19254), IO_0.I11l("\u4b71\u5598\u4b1d\u4bb3\u4bde\u4b31\u4bd0\u4c7b\u4c46\u52e8\u4c18\u4cab\u4cc8\u5268\u4c81\u4d27\u4d48\u4d2d\u53dd\u4daf\u4d82\u4dad\u4d00\u4d92\u4e3e\u4e4b\u4ebc\u4e12\u4eba\u4ed5\u507f\u4e99\u4f36\u4f5b\u51bb\u4f12\u4fb2\u4fdd\u4f30\u4fcf\u5062\u50c7\u5022\u504b\u50fe\u50c1\u503c\u508e\u5127", 19254), IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bdc\u4bb9\u4b99\u52ce\u4c5b\u4c6d\u4d7d\u4c6a\u4c8a\u4ca4\u4c08\u4d2b\u4d06\u4c54\u53c9\u4df3\u4d82\u4db5\u4d89\u5340\u4e6e\u4e1d\u4f4d\u4e12\u4ebb", 19254), IO_0.I11l("\u4b7e\u4bbf\u4b1a\u4bb3\u4bca\u4ba4\u4b99\u4c2f\u4c43\u4cad\u4c40\u4cab\u4cc6\u526e\u4c86\u4d27\u4d48\u4da5\u4d1d\u4da3\u4dc9\u4da9\u4d14\u4d91\u4e79\u4e1d\u4e30\u4e91\u4ef4\u4e99\u4eac\u4e9f\u4ffa\u4f15\u4f38\u51d4\u4ffc\u4f91\u4fa3\u4f8e\u507b\u500d\u503a\u4ec6\u50f3\u5088", 19254), IO_0.I11l("\u4b75\u4b3d\u4ad5\u4bfa\u4b92\u4ac0\u5523\u4c2f\u528d\u4c22\u4c40\u4cab\u4cc4\u4ca1\u4c0a\u4d69\u4d06\u4d35\u4d0c\u532a\u4dcf\u4de1\u4d94\u4d97\u50b3\u4e49\u4e7d", 19254)};
                this.II_1(stringArray[this.var_java_util_Random_IIIO.nextInt(stringArray.length)]);
            }
        }
        this.void_II(iO0l2, n3);
        this.void_II(iO0l3, n4);
        this.lI1O();
    }

    private void lI_l() {
        IO0l iO0l = this.IO0l_III(225);
        IO0l iO0l2 = this.IO0l_III(226);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4aa3\u5566\u4b84\u4c2f\u4d3f\u4cb7\u4c02\u4cec\u4c8a\u4cfb\u4cc8\u4d71\u538b\u4d31\u4d44\u4df3\u4dca\u5368\u4d8d\u4dde", 19254), Il10, false);
            return;
        }
        IOol iOol = this.IOol_II();
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc7\u557b\u4bf1\u4b9c\u52c8\u4c0e\u4c39\u4c04\u4c6b\u4cc4\u4ca1\u4cc8\u4d64\u4dd2\u4d2b\u4d03\u4db9\u4d82\u4df0\u4dd0\u4dcf\u4e3b\u4e37\u4e20\u4e49\u4ee6\u4efa\u507f\u4e99\u4f2c\u4f15", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254));
        if (iOol.Il11 < 1L) {
            stringBuffer.append(IO_0.I11l("\u4b4a\u4b62\u4b08\u4bd0\u4b40\u4bbf\u4bd0\u4c7b\u4c46\u4c24\u52d3\u4cfe\u4c8a", 19254) + IO00.IIlI(1L - iOol.Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254));
            this.II(stringBuffer.toString(), Il10, false);
        } else {
            String[] stringArray = new String[2];
            stringArray[0] = IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254);
            stringArray[1] = IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254);
            this.II(stringBuffer.toString(), stringArray, true);
        }
    }

    private void lI_1() {
        IO0l iO0l = this.IO0l_III(225);
        IO0l iO0l2 = this.IO0l_III(226);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4aa3\u5566\u4b84\u4c2f\u4d3f\u4cb7\u4c02\u4cec\u4c8a\u4cfb\u4cc8\u4d71\u538b\u4d31\u4d44\u4df3\u4dca\u5368\u4d8d\u4dde", 19254));
            return;
        }
        IOol iOol = this.IOol_II();
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53\u4e7d", 19254));
            return;
        }
        if (iO0l.lo0I < 10 || iO0l2.lo0I < 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u4cfe\u4cd3\u4c23\u4c86\u4d27\u4d4a\u4d2c\u53a3\u4df6\u4d82\u4cd0\u5323\u4ddf\u4e6a\u4e55\u50ad\u4e18\u4eba\u4ed1\u4eb1\u5030\u4f78\u4f14", 19254));
            return;
        }
        if (this.II0O() == 0 && iO0l.lo0I > 10 && iO0l2.lo0I > 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7e\u4bb5\u4b1a\u4bfb\u4b92\u4ba5\u4b82\u4c6e\u4c40\u4c2a\u4c4c\u4d9a\u4c49\u4ce9\u4df9\u53a0\u4d5f", 19254));
            return;
        }
        --iOol.Il11;
        this.void_II(iO0l, 10);
        this.void_II(iO0l2, 1);
        if (this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            this.var_IO0_IIIO.IIIl.III0(new IO0l(this.IIlI(220, 224), 1));
            this.IIlO(true);
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bbc\u551b\u4c61\u4c49\u4c6c\u4c4c\u4cc9\u520b\u4ca7\u4cc8\u4c16\u4dc5\u4d65\u4d07\u4deb\u531d\u4de1\u4d94\u535e\u4e71\u4e1d\u4e28\u4e13\u4e7a\u4ed7\u4eb0\u4ed7\u4f75\u4fc1\u4f3a\u4f14\u4fbc", 19254));
        } else {
            this.IIlO(false);
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b3d\u55d1\u4be7\u4b92\u4bb3\u5551\u4c66\u4c0f\u4c6d\u4c22\u4cec\u4cdf\u4cb0\u4c02\u4d69\u4d06\u4d29\u4d0d\u5344\u4dd7\u4de1\u4cf1\u4d1c\u4e3e\u4e5f\u5097\u4e5b\u4ef7\u501c\u4eac\u4ed9", 19254));
        }
        this.lI1O();
    }

    private void lI__() {
        IO0l iO0l;
        if (this.II0O() == 0) {
            this.II(IO_0.I11l("\u4b7e\u4bb5\u4b1a\u4bfb\u4b92\u4ba5\u4b82\u4c6e\u4c40\u4c2a\u4c4c\u4ce8\u520d\u4ca7\u4cc8\u4dea\u4d52\u4d65\u4d0a\u4deb\u5307\u4db5\u4dc0\u4dce\u4e3e\u4e5e\u4e34\u50ac\u4eba\u4ecd\u4eaa\u5026\u4f78\u4f52", 19254), Il10, false);
            return;
        }
        IO0l iO0l2 = iO0l = this.II0_() == 1 ? this.III() : null;
        if (iO0l == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b85\u4bf1\u4b86\u4c66\u4cc4\u4c23\u4c4c\u4ce5\u4ccd\u5204\u4c8b\u4d27\u4d54\u5396\u4d0a\u4de4\u4d82\u4df3\u4dc0\u4d8c\u4e7f\u4e52\u4e7c\u4e0f\u4ee8\u5066\u4ef8\u4e9b\u4ffc\u4f5b", 19254), Il10, false);
            return;
        }
        this.II(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bd0\u4bdd\u4bbf\u4bd0\u4c6c\u4cdd\u4c6d\u4c01\u4cfe\u527b\u4ca7\u4cc8\u4d65\u4d4f\u53fa\u4d0a\u4da3\u4d95\u4de1", 19254) + IO_0.III0(iO0l.I1l) + IO_0.I11l("\u4b16\u4b21\u4b1c\u4b73\u4bdc\u4bb9\u4bfa\u4c3e\u4c0e\u4c3b\u4c05\u4c61\u4cc4\u4ce9", 19254) + IO_0.III0(iO0l.I1l - 1) + IO_0.I11l("\u4b3c\u4b29\u4b43\u4bef\u4bf1\u5576\u4b9e\u4c2f\u4c19\u4c6d", 19254) + IO_0.III0(iO0l.I1l), new String[]{IO_0.I11l("\u4b7a\u4bb5\u4b19\u4bb3\u4bc2\u4bb9\u4b19\u4c7f", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
    }

    private IO0l III() {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || iO0l.I1l <= 14 || iO0l.I1l > 20 || iO0l.lo0I < 7) continue;
            return iO0l;
        }
        return null;
    }

    private void lI_O() {
        if (this.II0O() == 0 || this.II0_() != 1) {
            return;
        }
        IO0l iO0l = this.III();
        if (iO0l == null) {
            return;
        }
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        int n = iO0l.I1l;
        this.var_IOo__IIIO.II(new IO0o(-81).II(5).III(iII == null ? 0 : iII.lOo0));
        this.void_II(iO0l, 7);
        this.var_IO0_IIIO.IIIl.III0(new IO0l(n - 1, 1));
        this.var_IO0_IIIO.IIIl.l1_l();
        this.lI11();
        this.var_IO0_IIIO.I__O();
    }

    private void lI_0() {
        IO0l iO0l = this.IO0l_II();
        IO0l iO0l2 = this.IO0l_III(1284);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4be1\u4b30\u4b93\u4c67\u4c0e\u4c19\u4c19\u4cf2\u526d\u4cbd\u4cc8\u4d4c\u53df\u4d65\u4d12\u4d63\u4d82\u4da3\u4d19\u4d9e\u4e3e\u4e5a\u4e35\u4e9a\u4ef7\u4e99\u4fc9\u503c\u4f78\u4f5d\u4f7a", 19254), Il10, false);
            return;
        }
        this.II(IO_0.I11l("\u4b4a\u4b64\u4b08\u4bd4\u4bdb\u4b30\u4b9d\u4c2f\u4d3f\u5286\u4c02\u4ce3\u4c8a", 19254) + IO_0.III0(iO0l.I1l) + IO_0.I11l("\u4b16\u4b6a\u4b7e\u4bef\u4b80\u4bad\u4bb2\u4cf6\u4c4f\u4c6d\u4c0b\u4ce2\u4c4b\u4ca4\u4cc8\u4c16\u53ed\u4d2b\u4d0c\u4da3", 19254) + iO0l2.lo0I + IO_0.I11l("\u4b19\u4b64", 19254), new String[]{IO_0.I11l("\u4b71\u4b3c\u4b95\u4bfe\u4b92\u4ac0\u553b\u4c61\u4c46", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
    }

    private void lI_o() {
        IO0l iO0l = this.IO0l_II();
        IO0l iO0l2 = this.IO0l_III(1284);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null || iO0l2.lo0I < 1) {
            return;
        }
        if (IO_0.int_II(iO0l, 217) < 0) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bd1\u4b30\u4b99\u4c2f\u4c40\u5286\u4c18\u4cab\u4cc7\u4c29\u4cc8\u4d60\u4d4f\u4da4\u4d09", 19254));
            return;
        }
        int[] nArray = new int[]{77, 103, 50, 108, 94, 14, 80, 81, 175, 5, 214, 216};
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray2 = (int[])iO0l.IIl.elementAt(i);
            if (nArray2[0] != 217) continue;
            nArray2[0] = nArray[this.var_java_util_Random_IIIO.nextInt(nArray.length)];
            nArray2[1] = this.IIlI(1, 10 / this.IIlI(1, 3));
        }
        this.IIlO(true);
        this.void_II(iO0l2, 1);
        this.lI1O();
    }

    private void lIO() {
        IO0l iO0l = this.IO0l_II();
        if (this.II0_() != 1 || iO0l == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4be1\u4b30\u4b93\u4c67\u4c0e\u4c19\u4c19\u4cf2\u526d\u4cbd\u4cc8\u4d4c\u53df\u4d65\u4c75\u5340\u4d82\u4db5\u5349\u4d86\u4e30", 19254), Il10, false);
            return;
        }
        this.II(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc7\u551b\u4ba8\u4bd0\u4c5c\u4ccf\u4c2e\u4c04\u4cab\u4cfe\u4cbc\u4c91\u53c0\u4d52\u4d65\u4d2f\u537a\u4d82\u4dfe", 19254), new String[]{IO_0.I11l("\u4a26\u5586\u4b1a\u4bf4\u4b92\u4b2c", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
    }

    private void lIOI() {
        int[] nArray;
        int n;
        IO0l iO0l = this.IO0l_II();
        if (this.II0_() != 1 || iO0l == null) {
            return;
        }
        if (IO_0.III(iO0l, 219) <= 0 || IO_0.int_II(iO0l, 217) >= 0) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4b84\u4c67\u52ed\u4c6d\u4c18\u4ce3\u525b\u4caa\u4cc8\u4d6f\u4d4f\u5382\u4d0a", 19254));
            return;
        }
        for (n = 0; n < iO0l.IIl.size() && (nArray = (int[])iO0l.IIl.elementAt(n))[0] != 21; ++n) {
            nArray[0] = 217;
            nArray[1] = 0;
        }
        n = IO_0.int_II(iO0l, 219);
        if (n >= 0) {
            int[] nArray2 = (int[])iO0l.IIl.elementAt(n);
            nArray2[1] = nArray2[1] - 1;
        }
        this.IIlO(true);
        this.lI1O();
    }

    private IO0l IIII() {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || iO0l.I1l != 1044 && iO0l.I1l != 1211 && iO0l.I1l != 1212) continue;
            return iO0l;
        }
        return null;
    }

    private void lIOl() {
        IO0l iO0l = this.IIII();
        IO0l iO0l2 = this.IO0l_III(1285);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null || iO0l2.lo0I < 10) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4be1\u4b30\u4b93\u4c67\u4c0e\u4c19\u4c19\u4cf2\u526d\u4cbd\u4cc8\u4d4c\u53df\u4d65\u4d55\u4da3\u4dd4\u4d21\u4dc0\u4dce\u4e2e\u4e1d\u4e17\u4e97\u4ef7\u4e99\u4eba\u5052\u4f7b\u4f15\u4f33\u4f1a\u5137\u4fc8\u4ffe", 19254), Il10, false);
            return;
        }
        String string = IO_0.I11l("\u4b4a\u4b67\u4b08\u4bdd\u4b50\u4bbf\u4b97\u4c2f\u4c4d\u52e8\u4c1c\u4cab\u4cd9\u4c28\u4c8b\u4d6f\u4d06\u4d31\u4d11\u4dfa\u5365\u4db5\u4dc0\u4d94\u50e7\u4e37\u4e20\u4e49\u4ee6\u4efa\u507f\u4e99\u4f36\u4f04\u4f64\u4f53\u4fd9\u4f5d\u4fbd\u4fcf\u506c\u4e88\u5021\u504b\u50ed\u50c0\u4e6d\u509e\u510c\u5159\u5176\u511f\u51d6\u4f68\u51e0\u51b3\u4f39\u523d\u5248\u5233\u529a\u52f7\u52d0\u52f7\u5295\u53e1\u535a\u5334\u5348\u53b1\u5381\u53ff\u53de\u5428\u5426\u5437\u5458\u54f5\u54e6\u5425\u5488\u5562\u5504\u5520\u4bc7\u55f1\u5580\u55cb\u55b6\u4b58\u5668\u561b\u5638\u48d8\u56f1\u5697\u56a5\u4848\u5734\u575e\u49f7\u5705\u57b0\u579e\u57fe\u57cd\u5847\u58c7\u5827\u5849\u58ea\u4602\u58ab\u58c5\u5963\u594a\u47e7\u5918", 19254);
        this.II(string, new String[]{IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
    }

    private void lIO1() {
        IO0l iO0l = this.IIII();
        IO0l iO0l2 = this.IO0l_III(1285);
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null || iO0l2.lo0I < 10) {
            return;
        }
        if (this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            if (iO0l.I1l == 1044) {
                iO0l.I1l = 1278;
            } else if (iO0l.I1l == 1211) {
                iO0l.I1l = 1279;
            } else if (iO0l.I1l == 1212) {
                iO0l.I1l = 1280;
            }
            this.IIlO(true);
        } else {
            this.IIlO(false);
        }
        this.void_II(iO0l2, 10);
        this.lI1O();
    }

    private static int II_O(int n) {
        int n2 = (1000 - n) * 50 / 1000;
        return n2 < 5 ? 1 : 1;
    }

    private void lIO_() {
        IO0l iO0l = this.IO0l_II();
        if (this.II0_() != 1 || iO0l == null || IO_0.III(iO0l, 212) >= 1000) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4be1\u4b30\u4b93\u4c67\u4c0e\u4c19\u4c19\u4cf2\u526d\u4cbd\u4cc8\u4d4c\u53df\u4d65\u4d0c\u534c\u4dcc\u4da6\u4dc0\u4cee\u50dd\u4e1d\u4e2c\u4e13\u507f\u4eda\u4ef8\u4e9f\u51c5\u4f5c\u4f7a", 19254), Il10, false);
            return;
        }
        int n = IO_0.III(iO0l, 212);
        int n2 = IO_0.II_O(n);
        String string = IO_0.I11l("\u4b66\u4b3d\u5591\u4bf0\u4b92\u4bb9\u5523\u4c66\u4c0e\u4c1e\u4c8d\u4ce8\u4cc2\u4ce9\u4cbc\u4d72\u4d5f\u5382\u4d10\u4da3\u4de9\u5338\u4dc0\u4dc0\u4e14\u4e0c\u4e7c\u4e18\u4eef\u5068\u4eb6\u4efd", 19254) + (1000 - n) + IO_0.I11l("\u4b16\u4a44\u4b1d\u5550\u4bdf\u4bf1\u4ae1\u52d6\u4c0e\u4c2f\u52ad\u4ce5\u4c8a\u4caa\u524f\u4d69\u4d06\u4d2d\u53b7\u4dea\u4d82\u4db1\u4d88\u531a\u4e7d\u4e37\u4e1f\u50dc\u4ef4\u4e99", 19254) + n2 + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1", 19254);
        if (this.IOol_II().lOoO < n2) {
            this.II(string, new String[]{IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bc6\u4bb9\u4b99\u52b0\u4c5b\u4c47", 19254) + (n2 - this.IOol_II().lOoO) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1", 19254)}, false);
        } else {
            this.II(string, new String[]{IO_0.I11l("\u4a26\u5586\u4b1a\u4bf4\u4b92\u4b2c", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
        }
    }

    private void lIOO() {
        IO0l iO0l = this.IO0l_II();
        if (this.II0_() != 1 || iO0l == null || IO_0.III(iO0l, 212) >= 1000) {
            return;
        }
        int n = IO_0.II_O(IO_0.III(iO0l, 212));
        if (this.IOol_II().lOoO < n) {
            return;
        }
        this.IOol_II().lOoO -= n;
        int n2 = IO_0.int_II(iO0l, 212);
        if (n2 >= 0) {
            ((int[])iO0l.IIl.elementAt((int)n2))[1] = 1000;
        } else {
            iO0l.III(212, 1000);
        }
        this.IIlO(true);
        this.lI1O();
    }

    private void lIO0() {
        IO0l iO0l = this.IO0l_II();
        if (this.II0_() != 1 || iO0l == null) {
            this.II(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4b84\u4ce3\u4c43\u4c6d\u4c18\u4ce3\u520f\u4cb0\u4cc8\u4d71\u538b\u4d31\u4d44\u4df3\u4dca\u5368\u4d8d", 19254), Il10, false);
            return;
        }
        IOol iOol = this.IOol_II();
        String string = IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc3\u4bda\u4b33\u4b9e\u4c2f\u4c5c\u4cae\u4c4c\u4cf8\u4c4b\u4caa\u4c80\u4d0d\u4d5a\u4d77\u4d18\u4dcd\u4dca\u536c\u4d8e\u4ddf\u4e72\u509c\u4e35\u4e5b\u4eaf\u4e99\u4ebb\u4e82\u51c7\u4f5b\u4f74\u4f00\u4f73\u4fd2\u4fb8\u4fcf\u506d\u5144\u5046", 19254) + (iOol.Il11 >= 1L ? IO_0.I11l("\u4b4a\u4b67\u4b08", 19254) : IO_0.I11l("\u4b4a\u4b62\u4b08", 19254)) + IO_0.I11l("\u4b66\u4b3d\u4b99\u4bb3\u4bc0\u4b32\u4bd0\u4c3e\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd", 19254);
        if (iOol.Il11 < 1L) {
            String[] stringArray = new String[1];
            stringArray[0] = IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bc6\u4bb9\u4b99\u52b0\u4c5b\u4c47", 19254) + IO00.IIlI(1L - iOol.Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254);
            this.II(string, stringArray, false);
        } else {
            this.II(string, new String[]{IO_0.I11l("\u4a26\u5586\u4b1a\u4bf4\u4b92\u4b2c", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
        }
    }

    private void lIOo() {
        IO0l iO0l;
        block3: {
            block2: {
                iO0l = this.IO0l_II();
                if (this.II0_() != 1 || iO0l == null) break block2;
                if (this.IOol_II().Il11 >= 1L) break block3;
            }
            return;
        }
        --this.IOol_II().Il11;
        this.void_II(iO0l, 1);
        this.var_IO0_IIIO.IIIl.III0(new IO0l(1283, 5).III(30, 0));
        this.IIlO(true);
        this.lI1O();
    }

    void lI0() {
        this.l0_1 = 21;
        int n = this.II__(1281);
        int n2 = this.II__(1282);
        boolean bl = n >= 9999 && n2 >= 1;
        String string = IO_0.I11l("\u4b4a\u4b64\u4b08\u4bd0\u4bda\u556e\u4bd0\u4c7b\u528f\u4c22\u4c4c\u4cc8\u4cdf\u5218\u4c86\u4d27\u4d55\u4da4\u4d07\u4deb\u4d82\u4da2\u4c89\u4df5", 19254) + IO_0.II(n >= 9999, IO_0.III0(1281) + IO_0.I11l("\u4b16", 19254) + n + IO_0.I11l("\u4b19\u4b6c\u4b4d\u4baa\u4b8b", 19254)) + IO_0.II(n2 >= 1, IO_0.III0(1282) + IO_0.I11l("\u4b16", 19254) + n2 + IO_0.I11l("\u4b19\u4b64", 19254)) + IO_0.II(bl, IO_0.I11l("\u4b62\u559c\u4b54\u4bff\u5575\u4bf1\u4b84\u4c67\u4cce\u4c23\u4c04\u4cab\u4cc9\u4c3d\u4c86\u4d60\u4d1c\u4d65\u4d55\u4db3\u4d92\u4de4", 19254)) + IO_0.I11l("\u4b4a\u4b62\u4b08\u4bc7\u4bda\u5574\u4b84\u4c2f\u4c4c\u52ec\u4c05\u4cab\u4cc7\u526c\u4c9c\u4d27\u4d1f\u4d7c\u4d44\u4df7\u4dd0\u4da0\u4d8e\u4d98\u4e3e\u4e4e\u4ebd\u4e18\u4ef2\u4e99\u4eae\u4e17\u4f36\u4f04\u4f74\u4f11\u4f7e\u4fd0\u4ff0\u4f9c\u50ef\u504e\u5024", 19254);
        this.var_IO0_IIIO.var_IO00_II.II(string, new String[]{IO_0.I11l("\u4a26\u5586\u4b1a\u4bf4\u4b92\u4b2c", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, bl ? 5102 : 5101);
    }

    void lI0I() {
        this.l0_1 = 21;
        if (this.II0O() == 0 && this.II__(1283) == 0) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4b04\u4c2f\u4c5a\u4c3f\u52bd\u4ce5\u4ccd\u4ce9\u4c9c\u4d75\u4d49\u4d2b\u4d03\u4da3\u4dca\u4d21\u4d8e\u4d97\u4e3e\u4e49\u4e2e\u4e1a\u4ef4\u4ede\u4ef6", 19254));
            return;
        }
        if (this.II__(1281) < 9999 || this.II__(1282) < 1) {
            return;
        }
        this.III1(new int[]{1281, 1282});
        if (this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            this.II_(1281, 9999);
            this.II_(1282, 1);
            this.var_IO0_IIIO.IIIl.III0(new IO0l(1283, 1).III(30, 0));
            IOO.III iII = IOO.IOO$III_II(1283);
            this.void_II(true, iII == null ? 0 : iII.lOo0);
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b74\u55f4\u4b1a\u4bb3\u4bdc\u4bb9\u555d\u4c61\u4c0e\u4d5c\u4ddc\u5268\u4cc9\u4ce9", 19254) + IO_0.III0(1283));
            this.II_1(IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bbc\u551b\u4c61\u4c49\u4c6d\u4c0f\u4ce4\u4cc4\u4ce9\u4c86\u4d6f\u4dcf", 19254));
        } else {
            this.II_(1281, 99);
            this.II_(1282, 1);
            this.void_II(false, 0);
            this.II_1(IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bb2\u4b9f\u4c61\u4c0e\u4c20\u4c0d\u4cf2\u4c8a\u4ca4\u5247\u4d69\u4d06\u4d29\u53c3\u4ded\u4d82\u4db2\u4d81\u4d8a\u4e32\u4e1d\u4f4d\u5090\u4ef4\u4ede\u4ef8\u4e95\u4f63\u51e6\u4f3a\u4f53\u4ff1\u4fde\u4fbe\u4fcf\u5060\u5045\u50a5", 19254));
        }
        this.var_IO0_IIIO.IIIl.l1_l();
        this.var_IO0_IIIO.I__O();
    }

    void lI0l() {
        this.l0_1 = 21;
        int n = this.II__(1283);
        int n2 = this.II__(1285);
        int n3 = this.II__(1794);
        boolean bl = n >= 10 && n2 >= 1;
        String string = IO_0.I11l("\u4b4a\u4b64\u4b08\u4a83\u5567\u4bb8\u4bd0\u4c7c\u4ccf\u4c2e\u4c04\u4cab\u4cfe\u4cbc\u4c91\u53c0\u4d52\u4d65\u4d2f\u537a\u4d82\u4df0\u4dea", 19254) + IO_0.II(n >= 10, IO_0.III0(1283) + IO_0.I11l("\u4b16", 19254) + n + IO_0.I11l("\u4b19\u4b64\u4b44", 19254)) + IO_0.II(n2 >= 1, IO_0.III0(1285) + IO_0.I11l("\u4b16", 19254) + n2 + IO_0.I11l("\u4b19\u4b64", 19254)) + (bl ? IO_0.I11l("\u4b4a\u4b67\u4b08", 19254) : IO_0.I11l("\u4b4a\u4b62\u4b08", 19254)) + IO_0.I11l("\u4b62\u559c\u4b54\u4bff\u5575\u4bf1\u4b84\u4c67\u4cce\u4c23\u4c04\u4cab\u4cc9\u4c3d\u4c86\u4d60\u4d1c\u4d65\u4d55\u4db3\u4d92\u4de4\u4dea\u4d83\u4e29\u4e41\u4e12\u50c4\u4eef\u4e99\u4ebc\u4e0e\u4f78\u4f52\u4f74\u4f10\u4ffd\u4fdf\u4ff0\u4f8b\u4eab\u5058\u506c\u501f\u4e7d\u5089\u50a4\u4e20\u5126\u5151\u512c\u5183\u51ec\u51c9\u51e0\u51bc\u510a\u5273\u525b\u527b\u5216\u5279\u5298\u52e6\u52c6\u5325\u5311\u5359\u5304\u5371\u5390\u5397\u53db\u542d\u5458\u4abc\u544a\u54e5\u4a6f\u54e7\u5494\u5564\u5504\u5537\u550a\u556b\u55cd\u559f\u55ba\u550f\u5672\u565c\u567a\u561a\u56f0\u56d8\u56f6\u5686\u57f5\u5750\u573a\u577b", 19254);
        if (!bl) {
            this.var_IO0_IIIO.var_IO00_II.II(string, new String[]{IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, 5101);
        } else if (n3 >= 1) {
            this.var_IO0_IIIO.var_IO00_II.II(string, new String[]{IO_0.I11l("\u4a26\u5586\u4b1a\u4bf4\u4b92\u4b2c", 19254), IO_0.I11l("\u4b72\u4bac\u4b1a\u4bf4\u4b92\u4bb2\u4b9f\u4c61\u4c0e\u4c29\u52c9\u4cfe", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, 5103);
        } else {
            this.var_IO0_IIIO.var_IO00_II.II(string, new String[]{IO_0.I11l("\u4a26\u5586\u4b1a\u4bf4\u4b92\u4b2c", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, 5103);
        }
    }

    void Il10(int n) {
        int[] nArray;
        boolean bl;
        this.l0_1 = 21;
        boolean bl2 = bl = n == 1 && this.II__(1794) >= 1;
        if (n != 0 && !bl) {
            return;
        }
        if (this.II0O() == 0) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4b04\u4c2f\u4c5a\u4c3f\u52bd\u4ce5\u4ccd\u4ce9\u4c9c\u4d75\u4d49\u4d2b\u4d03\u4da3\u4dca\u4d21\u4d8e\u4d97\u4e3e\u4e49\u4e2e\u4e1a\u4ef4\u4ede\u4ef6", 19254));
            return;
        }
        if (this.II__(1283) < 10 || this.II__(1285) < 1 || bl && this.II__(1794) < 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b74\u55f4\u4b1a\u4bb3\u4bd9\u4bb9\u4b04\u4c61\u4c49\u4c6d\u4d7d\u526c\u4c8a\u4ca7\u4c8f\u4d72\u4d5f\u4daf\u4d0a\u4da3\u4dce\u4da8\u5327\u4d8a\u4e3e\u4f2c\u509f\u4e5b\u4f8b\u506c\u4eb1\u4ed7\u4f65\u4fd4\u4f37\u4f1b\u4fbc", 19254));
            return;
        }
        if (bl) {
            int[] nArray2 = new int[3];
            nArray2[0] = 1283;
            nArray2[1] = 1285;
            nArray = nArray2;
            nArray2[2] = 1794;
        } else {
            int[] nArray3 = new int[2];
            nArray3[0] = 1283;
            nArray = nArray3;
            nArray3[1] = 1285;
        }
        this.III1(nArray);
        if (bl || this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            this.II_(1283, 10);
            this.II_(1285, 1);
            if (bl) {
                this.II_(1794, 1);
            }
            int[] nArray4 = new int[]{1044, 1211, 1212};
            IO0l iO0l = new IO0l(nArray4[this.var_java_util_Random_IIIO.nextInt(nArray4.length)], 1);
            int n2 = 1;
            if (bl && this.var_java_util_Random_IIIO.nextInt(100) < 100) {
                n2 = this.IIlI(1, 3);
            }
            for (int i = 0; i < n2; ++i) {
                iO0l.III(217, 0);
            }
            iO0l.III(21, 40);
            iO0l.III(30, 0);
            iO0l.III(87, 0);
            iO0l.III(219, 5);
            iO0l.III(212, 1000);
            this.var_IO0_IIIO.IIIl.III0(iO0l);
            IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
            this.void_II(true, iII == null ? 0 : iII.lOo0);
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b74\u55f4\u4b1a\u4bb3\u4bdc\u4bb9\u555d\u4c61\u4c0e\u4d5c\u4ddc\u5268\u4cc9\u4ce9", 19254) + IO_0.III0(iO0l.I1l));
            this.II_1(IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bbc\u551b\u4c61\u4c49\u4c6d\u4c0f\u4ce4\u4cc4\u4ce9\u4c86\u4d6f\u4dcf", 19254));
        } else {
            this.II_(1283, 5);
            this.II_(1285, 1);
            this.void_II(false, 0);
            String[] stringArray = new String[]{IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bb2\u4b9f\u4c61\u4c0e\u4c20\u4c0d\u4cf2\u4c8a\u4ca4\u5247\u4d69\u4d06\u4d29\u53c3\u4ded\u4d82\u4db2\u4d81\u4d8a\u4e32\u4e1d\u4f4d\u5090\u4ef4\u4ede\u4ef8\u4e95\u4f63\u51e6\u4f3a\u4f53\u4ff1\u4fde\u4fbe\u4fcf\u5060\u5045\u50a5\u5045", 19254), IO_0.I11l("\u4b6e\u559e\u4b00\u4bb3\u4bc0\u5502\u4b99\u4c2e\u4c0e\u4c01\u52cd\u4ce2\u4c8a\u4cbd\u5239\u4d69\u4d06\u4d22\u4d0d\u5326\u4ddb\u4ded\u4dc0\u4d8b\u4e77\u5082\u4e3f\u4e5b\u4efd\u4ed1\u4e32\u4ed6", 19254), IO_0.I11l("\u4b75\u4b3a\u4b1a\u4bb3\u4bd1\u4b22\u4bd0\u4c6c\u4c46\u52e2\u4c0f\u4cab\u4cc6\u4c29\u4cc8\u4c16\u4dc5\u4d65\u4d07\u5324\u4dd7\u4de1\u4d8e\u4d98\u4e6b\u4e44\u509b\u4e15\u4eba\u4ecd\u4eaa\u4f47\u51cd\u4f56\u4f74\u4f18\u4ffa\u4fd8\u4ff0\u4efe\u4ea3\u505d\u506c\u5000\u50e2\u505d\u50a6\u5080\u5139", 19254), IO_0.I11l("\u4b7e\u4bbf\u4b1a\u4bb3\u4bca\u4ba4\u4b99\u4c2f\u4c43\u4cad\u4c40\u4cab\u4cc8\u4ca0\u5257\u4d73\u4d06\u4c54\u4d86\u4df6\u4d82\u4dad\u5347\u4d91\u4e3e\u4e4e\u4e3d\u4e0e\u4eba\u4fba\u4eb6\u4ed7\u4f7a\u4f40\u4fa0\u4f1d\u4fb3", 19254), IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4b83\u4c6e\u4c41\u4c61\u4c4c\u4ce5\u4cc2\u4c2b\u4c86\u4d27\u4d56\u4d2d\u53cd\u4dee\u4d82\u4daf\u4d87\u5318\u4e3e\u4e4c\u4e29\u4e91\u4ef4\u4e99\u4ebb\u4e9f\u4fec\u4f41\u4f74\u4f07\u4ffa\u4f45\u4fb9\u4fc1", 19254), IO_0.I11l("\u4b74\u4bb9\u4b1a\u4bfb\u4b92\u4ba5\u4ad9\u4c61\u4c46\u4c61\u4c4c\u4cf9\u5279\u4ca0\u4cc8\u4d64\u4c4f\u4d2b\u4d03\u4da3\u4dce\u4d2b\u4d8e\u4dde", 19254), IO_0.I11l("\u4b7a\u55f4\u4b1d\u4bb3\u4bca\u551a\u4b84\u4c23\u4c0e\u4c25\u4c0d\u4cf2\u4c8a\u4ca5\u4c08\u4d27\u4c37\u4d2c\u4d44\u4dfb\u4dcb\u4daf\u4dc0\u4d89\u4ef3\u4e5c\u4e7c\u4e0f\u4ee8\u4f09\u5003\u4e94\u4f36\u4e24\u4fb7\u4f4c", 19254), IO_0.I11l("\u4b7a\u4bb5\u4b19\u4bb3\u4bde\u5570\u4b99\u4c2f\u4d3f\u4c24\u4c40\u4cab\u4cc8\u4ca8\u4cc8\u4d73\u4d4f\u4d2b\u4d44\u4de0\u4dcd\u4daf\u4dc0\u4d8c\u50a3\u4e1d\u4e28\u4e13\u4e7a\u4ed7\u4eb0\u4ed7\u4f75\u4fc1\u4f3a\u4f14\u4fb3", 19254)};
            this.II_1(stringArray[this.var_java_util_Random_IIIO.nextInt(stringArray.length)]);
        }
        this.var_IO0_IIIO.IIIl.l1_l();
        this.var_IO0_IIIO.I__O();
    }

    private int II(int n, int n2, int n3, int n4, boolean bl) {
        int n5 = 0;
        for (int i = 0; i < this.I_Il.length; ++i) {
            boolean bl2;
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null) continue;
            boolean bl3 = bl2 = iO0l.I1l >= n && iO0l.I1l <= n2 || n3 > 0 && iO0l.I1l >= n3 && iO0l.I1l <= n4;
            if (!bl2 || bl && iO0l.lo0I < 999) continue;
            ++n5;
        }
        return n5;
    }

    private IO0l II(int n, int n2, int n3, int n4) {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || (iO0l.I1l < n || iO0l.I1l > n2) && (n3 <= 0 || iO0l.I1l < n3 || iO0l.I1l > n4)) continue;
            return iO0l;
        }
        return null;
    }

    private static int int_II(boolean bl, int n) {
        return bl ? (int)((double)n * 1.1) : n;
    }

    private IO0l II(int n, int n2) {
        boolean bl;
        IO0l iO0l = new IO0l(n, 1);
        boolean bl2 = n >= 1048 && n <= 1050;
        boolean bl3 = n >= 1051 && n <= 1053;
        boolean bl4 = n >= 1054 && n <= 1056;
        boolean bl5 = n >= 1057 && n <= 1059;
        boolean bl6 = bl = n >= 1060 && n <= 1062;
        if (bl2) {
            iO0l.III(47, IO_0.int_II(n2 == 2, this.var_java_util_Random_IIIO.nextInt(1201) + 2800));
        }
        if (bl3) {
            iO0l.III(22, IO_0.int_II(n2 == 0, this.var_java_util_Random_IIIO.nextInt(100) < 80 ? this.var_java_util_Random_IIIO.nextInt(11) + 120 : this.var_java_util_Random_IIIO.nextInt(21) + 130));
        }
        if (bl4) {
            iO0l.III(0, IO_0.int_II(n2 == 2, this.var_java_util_Random_IIIO.nextInt(100) < 80 ? this.var_java_util_Random_IIIO.nextInt(651) + 10350 : this.var_java_util_Random_IIIO.nextInt(1001) + 10500));
        }
        if (bl5) {
            iO0l.III(23, IO_0.int_II(n2 == 1, this.var_java_util_Random_IIIO.nextInt(100) < 80 ? this.var_java_util_Random_IIIO.nextInt(21) + 90 : this.var_java_util_Random_IIIO.nextInt(21) + 110));
        }
        if (bl) {
            iO0l.III(14, IO_0.int_II(n2 == 1, this.var_java_util_Random_IIIO.nextInt(3) + 18));
        }
        iO0l.III(21, 90);
        iO0l.III(30, 1);
        return iO0l;
    }

    private void lI01() {
        IOol iOol = this.IOol_II();
        if (this.II0_() != 4) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4b86\u52a2\u4c5a\u4c6d\u4c1c\u4ce3\u5203\u4ca4\u4cc4\u4d27\u4d50\u4d30\u4d0d\u4da3\u4dce\u4d33\u4d8e\u4d98\u4e3e\u4e49\u4e34\u4e91\u4ef7\u4e99\u4eae\u4e17\u4f79", 19254));
            return;
        }
        if (this.II(1071, 1073, 1084, 1086, false) != 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4bb3\u4cfb\u4c40\u4c2a\u4c4c\u4cdf\u4cc2\u5220\u4c8b\u4d27\u4d70\u4d2c\u4d14", 19254));
            return;
        }
        if (this.II(1066, 1070, 0, 0, true) != 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4bbd\u52ac\u4c40\u4c25\u4c4c\u4cdf\u4cc2\u4ca0\u4c02\u4d69\u4d06\u4d16\u538d", 19254));
            return;
        }
        if (this.II(1074, 1078, 0, 0, false) != 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4ae0\u4cee\u4c0e\u4c03\u4c8e\u4ce5\u4ccd\u4ce9\u4cab\u53a2\u4d56", 19254));
            return;
        }
        if (this.II(1079, 1083, 0, 0, false) != 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4ae0\u4cee\u4c0e\u4c00\u4c0d\u4cf2\u4c8a\u4c84\u5247\u4d69", 19254));
            return;
        }
        IO0l iO0l = this.II(1071, 1073, 1084, 1086);
        IO0l iO0l2 = this.II(1066, 1070, 0, 0);
        IO0l iO0l3 = this.II(1074, 1078, 0, 0);
        IO0l iO0l4 = this.II(1079, 1083, 0, 0);
        if (this.II0O() <= 0) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b74\u55f4\u4b1a\u4bb3\u4bc2\u4bb9\u5553\u4c66\u4c0e\u4c2e\u4c9f\u4cab\u4c47\u4cbd\u4cc8\u4d69\u4d4e\u53e0\u4d10\u4da3\u4d93\u4de1\u4d14\u4ddf\u4e6a\u4e4f\u508d\u4e15\u4efd\u4e99\u4eb0\u4e17\u4f78\u4f5d\u4f74\u4f07\u4fe0\u4fd0\u4fbe\u4f88", 19254));
            return;
        }
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        --iOol.Il11;
        int n = 40 + (iO0l3.I1l - 1073);
        int n2 = 5 + 5 * (iO0l4.I1l - 1078);
        if (this.IIlI(0, 100) < n) {
            int n3;
            int[][] nArrayArray = new int[][]{{1048, 1051, 1054, 1057, 1060}, {1049, 1052, 1055, 1058, 1061}, {1050, 1053, 1056, 1059, 1062}};
            IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
            int n4 = iII == null ? iOol.lOlI : iII.lOlI;
            int n5 = n3 = n4 > 2 ? iOol.lOlI : n4;
            int n6 = iO0l2.I1l == 1066 ? 0 : (iO0l2.I1l == 1067 ? 1 : (iO0l2.I1l == 1070 ? 2 : (iO0l2.I1l == 1068 ? 3 : 4)));
            IO0l iO0l5 = this.II(nArrayArray[n3][n6], n4);
            int n7 = this.IIlI(0, 50);
            if (n7 <= n2) {
                int n8 = n7 >= n2 - 3 ? 3 : (n7 >= n2 - 10 ? 2 : 1);
                int[] nArray = new int[]{44, 45, 46, 197, 198, 199, 200, 201, 202, 203, 204};
                int n9 = nArray.length;
                iO0l5.III(41, n8);
                for (int i = 0; i < n8; ++i) {
                    int n10 = this.var_java_util_Random_IIIO.nextInt(n9);
                    iO0l5.III(nArray[n10], this.IIlI(1, 3));
                    nArray[n10] = nArray[--n9];
                }
            }
            this.var_IO0_IIIO.IIIl.III0(iO0l5);
            this.IIlO(true);
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b74\u55f4\u4b1a\u4bb3\u4aa3\u4b32\u4bd0\u4c61\u4c46\u52e0\u4c02\u4cab\u4dbb\u4d79\u520b\u4d64\u4d06", 19254) + IO_0.III0(iO0l5.I1l));
        } else {
            this.IIlO(false);
        }
        this.void_II(iO0l, 1);
        this.void_II(iO0l3, 1);
        this.void_II(iO0l4, 1);
        this.void_II(iO0l2, 999);
        this.lI1O();
    }

    private static boolean boolean_II(IO0l iO0l) {
        int n = IO_0.int_II(iO0l);
        return n >= 0 && (n < 5 || n == 32);
    }

    private static boolean III(IO0l iO0l) {
        return iO0l != null && (IO_0.int_II(iO0l) == 30 || iO0l.I1l >= 14 && iO0l.I1l <= 20);
    }

    private static boolean IIII(IO0l iO0l) {
        return iO0l != null && iO0l.I1l >= 441 && iO0l.I1l <= 447;
    }

    private static int[] int_arr_II(IO0l iO0l) {
        if (IO_0.int_II(iO0l) == 30) {
            if (iO0l.IIl.size() == 0) {
                return new int[]{-1, 0};
            }
            int[] nArray = (int[])iO0l.IIl.elementAt(0);
            return new int[]{nArray[0], nArray[1]};
        }
        int[][] nArrayArray = new int[][]{{14, 108, 2}, {15, 94, 2}, {16, 50, 3}, {17, 81, 5}, {18, 80, 5}, {19, 103, 5}, {20, 77, 5}};
        for (int i = 0; i < nArrayArray.length; ++i) {
            if (nArrayArray[i][0] != iO0l.I1l) continue;
            return new int[]{nArrayArray[i][1], nArrayArray[i][2]};
        }
        return new int[]{-1, 0};
    }

    private static int int_II_0(int n) {
        int[] nArray = new int[9];
        nArray[0] = 1;
        nArray[1] = 1;
        nArray[2] = 1;
        nArray[3] = 1;
        nArray[4] = 1;
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        int[] nArray2 = nArray;
        return n >= 0 && n < nArray2.length ? nArray2[n] : 0;
    }

    private static int int_II_o(int n) {
        return n >= 0 && n < 9 ? 0 + 1 : 0;
    }

    private static int int_IIO(int n) {
        int[] nArray = new int[]{80, 40, 30, 20, 10, 5, 3, 2, 1, 1};
        return n >= 0 && n < nArray.length ? nArray[n] : 0;
    }

    private static float float_III(int n) {
        return 100.0f;
    }

    private boolean boolean_II(IO0l iO0l, int n) {
        if (n < 8) {
            return true;
        }
        int n2 = IO_0.III(iO0l, 228);
        return n == 8 ? n2 >= 8 : n2 >= 9;
    }

    private void II(StringBuffer stringBuffer, IO0l iO0l) {
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        stringBuffer.append(iII == null ? "" : iII.II1o).append(IO_0.I11l("\u4b3c\u4b29\u4b46\u4bef", 19254));
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            if (nArray[0] == 102) continue;
            stringBuffer.append(IO_0.III(nArray[0], nArray[1])).append('\n');
        }
    }

    private IO0l II(boolean bl) {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || !(bl ? IO_0.boolean_II(iO0l) : IO_0.III(iO0l))) continue;
            return iO0l;
        }
        return null;
    }

    private void lI0_() {
        if (this.II0_() != 2) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4b84\u4c7d\u4c4f\u4c23\u4c0b\u4cab\u4cc8\u5202\u4cc8\u4d64\u4dd5\u4d65\u4d08\u5354\u4d82\u4db2\u4d81\u4d90\u4e3e\u4e4d\u4e34\u4e1a\u4eba\u4ed5\u4e32\u4ed7\u4f60\u4fd5\u4f74\u4f42\u4fb2\u4fdd\u4fbf\u514e\u5067\u500d\u515d\u508a\u50aa\u50d9\u50a0\u5086\u5126\u5149\u51ae\u5143\u5093\u4f62\u51e0\u5136\u518e\u523d\u524a\u52bb\u5215", 19254), Il10, false);
            return;
        }
        IO0l iO0l = this.II(true);
        IO0l iO0l2 = this.II(false);
        if (iO0l == null || iO0l2 == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4b84\u4c7d\u4c4f\u4c23\u4c0b\u4cab\u4cc8\u5202\u4cc8\u4d64\u4dd5\u4d65\u4d08\u5354\u4d82\u4db2\u4d81\u4d90\u4e3e\u4e4d\u4e34\u4e1a\u4eba\u4ed5\u4e32\u4ed7\u4f60\u4fd5\u4f74\u4f42\u4fb2\u4fdd\u4fbf\u514e\u5067\u500d\u515d\u508a\u50aa\u50d9\u50a0\u5086\u5126\u5149\u51ae\u5143\u5093\u4f62\u51e0\u5136\u518e\u523d\u524a\u52bb\u5215", 19254), Il10, false);
            return;
        }
        int n = IO_0.III(iO0l, 102);
        int n2 = IO_0.III(iO0l, 107);
        if (n2 > 9) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4b84\u4c7d\u4c4f\u4c23\u4c0b\u4cab\u4cc8\u5202\u4cc8\u4d64\u4dd5\u4d65\u4d08\u5354\u4d82\u4db2\u4d81\u4d90\u4e3e\u4e4d\u4e34\u4e1a\u4eba\u4ed5\u4e32\u4ed7\u4f60\u4fd5\u4f74\u4f42\u4fb2\u4fdd\u4fbf\u514e\u5067\u500d\u515d\u508a\u50aa\u50d9\u50a0\u5086\u5126\u5149\u51ae\u5143\u5093\u4f62\u51e0\u5136\u518e\u523d\u524a\u52bb\u5215\u52b5\u5298\u52a1\u5216\u5335\u5358\u4d84\u5352\u53e2\u53d1\u53a0\u53ce\u5479\u4afd\u5422\u544a\u5598\u54c9\u54e7\u548a\u55e5\u5504\u557a", 19254), Il10, false);
            return;
        }
        if (n >= 7 && n2 >= 8 && !this.boolean_II(iO0l, n2)) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4bd1\u4a61\u552d\u4c61\u4c49\u4c6d\u4c04\u4c78\u4ccb\u4ce9\u4c84\u53d0\u4d06\u4d36\u4d05\u4dec\u4d82\u4db1\u4d88\u4d9e\u4e3e\u4e51\u4eb6\u4e5b\u4ef4\u4e59\u4ea1\u4ed7\u4f62\u4f47\u4ee4\u51a8\u4ff1", 19254), Il10, false);
            return;
        }
        int n3 = n <= 8 ? 10 : 0;
        StringBuffer stringBuffer = new StringBuffer();
        this.II(stringBuffer, iO0l);
        int[] nArray = IO_0.int_arr_II(iO0l2);
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b62\u4b08", 19254)).append(IO_0.III(nArray[0], nArray[1])).append('\n');
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b64\u4b08\u4bd0\u5515\u4bbf\u4bd0", 19254) + IO00.IIlI(n3) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1", 19254));
        this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24\u4c2e\u52cb\u4ce5\u4c8a", 19254) + n3 + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1", 19254)}, true);
    }

    private void lI0O() {
        int n;
        int n2;
        if (this.II0_() != 2) {
            return;
        }
        IOol iOol = this.IOol_II();
        IO0l iO0l = this.II(true);
        IO0l iO0l2 = this.II(false);
        if (iO0l == null || iO0l2 == null) {
            return;
        }
        int n3 = IO_0.III(iO0l, 102);
        int n4 = IO_0.III(iO0l, 107);
        int n5 = n3 <= 8 ? 1 : (n2 = 0);
        if (iOol.lOoO < n2) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u5246\u4cc9\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        if (n3 >= n4) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4b84\u4c67\u52ed\u4c6d\u4c85\u4cfb\u4c8a\u4cba\u4c89\u4d68\u4d06\u4d26\u4d05\u4dec\u4d82\u4da9\u4c41\u4d91\u4e3e\u4e51\u508b", 19254));
            return;
        }
        if (n3 >= 7 && n4 >= 8 && !this.boolean_II(iO0l, n4)) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4bd1\u4a61\u552d\u4c61\u4c49\u4c6d\u4c04\u4c78\u4ccb\u4ce9\u4c84\u53d0\u4d06\u4d36\u4d05\u4dec\u4d82\u4db1\u4d88\u4d9e\u4e3e\u4e51\u4eb6\u4e5b\u4ef4\u4e59\u4ea1\u4ed7\u4f62\u4f47\u4ee4\u51a8\u4ff1", 19254));
            return;
        }
        iOol.lOoO -= n2;
        int[] nArray = IO_0.int_arr_II(iO0l2);
        if (nArray[0] < 0) {
            return;
        }
        int n6 = n3 + 1;
        if (n6 == 8 || n6 == 9) {
            iO0l.III(nArray[0], nArray[1]);
        } else {
            n = IO_0.int_II(iO0l, nArray[0]);
            if (n >= 0) {
                int[] nArray2 = (int[])iO0l.IIl.elementAt(n);
                nArray2[1] = nArray2[1] + nArray[1];
            } else {
                iO0l.III(nArray[0], nArray[1]);
            }
        }
        n = IO_0.int_II(iO0l, 102);
        if (n >= 0) {
            int[] nArray3 = (int[])iO0l.IIl.elementAt(n);
            nArray3[1] = nArray3[1] + 1;
        } else {
            iO0l.III(102, 1);
        }
        this.void_II(iO0l2, 1);
        this.IIlO(true);
        this.lI1O();
    }

    private void lI00() {
        if (this.II0_() != 1) {
            this.II(IO_0.I11l("\u4b7e\u4bb6\u4b0d\u4bb3\u4bd1\u4bb9\u553d\u4c61\u4c0e\u4c7c\u4c4c\u4cfd\u5207\u4cbd\u4cc8\u4d77\u4d4e\u53ec\u4d09\u4da3\u4cb3\u5302\u4dc0\u4d8f\u4e76\u4e5c\u4e7c\u4e17\u4e70\u4e99\u4eb0\u4e04\u4f77", 19254), Il10, false);
            return;
        }
        IO0l iO0l = this.II(true);
        if (iO0l == null) {
            this.II(IO_0.I11l("\u4b60\u55f8\u4b00\u4bb3\u4bc2\u4bb9\u5559\u4c62\u4c0e\u4c23\u4c8c\u4cf2\u4c8a\u4ca2\u4c80\u4df3\u4d48\u4d22\u4d44\u4df7\u4dca\u5302\u4dc0\u4cee\u50fb\u4e5e\u4e7c\u4e17\u504d", 19254), Il10, false);
            return;
        }
        int n = IO_0.III(iO0l, 107);
        if (n >= 9) {
            this.II(IO_0.I11l("\u4b60\u55f8\u4b00\u4bb3\u4bc2\u4bb9\u5559\u4c62\u4c0e\u4d5c\u4c8f\u4cab\u4dbb\u5268\u4c9c\u4d27\u4d52\u5394\u4d0d\u4da3\u4cb3\u4da0\u4dc0\u4d8c\u4e7f\u4e52\u4e7c\u4e0b\u4ef2\u4ed8\u4ef8\u4e9b\u4ffc", 19254), Il10, false);
            return;
        }
        this.lOo_ = IO_0.int_II_0(n);
        StringBuffer stringBuffer = new StringBuffer();
        this.II(stringBuffer, iO0l);
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b62\u4b08\u4bc7\u557b\u4bf1\u4b9c\u52c8\u4c0e\u4c39\u4c04\u4c6b\u4cc4\u4ca1\u4cc8\u4d64\u4dd2\u4d2b\u4d03\u4db9\u4d82", 19254) + IO_0.int_IIO(n) + IO_0.I11l("\u4b13\u4b5f", 19254));
        if ((long)this.lOo_ <= this.IOol_II().Il11) {
            stringBuffer.append(IO_0.I11l("\u4b4a\u4b64\u4b08\u4bd0\u5515\u4bbf\u4bd0", 19254) + IO00.IIlI(this.lOo_) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254));
            this.II(stringBuffer.toString(), LyForgeFast.withToggle(new String[]{IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24\u4c2e\u52cb\u4ce5\u4c8a", 19254) + IO_0.int_II_o(n) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1", 19254), IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c0e\u4c7c\u4c5c\u4cab\u4cc6\u526e\u4c86", 19254), IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c0e\u4c7c\u4c5c\u4cbb\u4c8a\u4ca5\u524f\u4d69", 19254)}), true);
        } else {
            stringBuffer.append(IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bc6\u4bb9\u4b99\u52b0\u4c5b\u4c6d", 19254) + IO00.IIlI((long)this.lOo_ - this.IOol_II().Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254));
            this.II(stringBuffer.toString(), Il10, false);
        }
    }

    void Il1o(int n) {
        if (this.IoI_ == 501) {
            this.Il_(n);
        }
    }

    private void Il_(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        long l = System.currentTimeMillis();
        if (l - this.I1Oo < 500L) {
            return;
        }
        this.I1Oo = l;
        if (this.II0_() != 1) {
            return;
        }
        IO0l iO0l = this.II(true);
        if (iO0l == null) {
            return;
        }
        int n3 = IO_0.III(iO0l, 107);
        if (n3 >= 9) {
            return;
        }
        if (iOol.Il11 < (long)IO_0.int_II_0(n3)) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        if (iOol.lOoO < IO_0.int_II_o(n3)) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u5246\u4cc9\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        boolean bl = false;
        int n4 = n3;
        for (n2 = 0; n2 < n; ++n2) {
            boolean bl2;
            int n5 = IO_0.int_II_0(n4);
            int n6 = IO_0.int_II_o(n4);
            if (n4 >= 9 || iOol.Il11 < (long)n5 || iOol.lOoO < n6) break;
            iOol.Il11 -= (long)n5;
            iOol.lOoO -= n6;
            float f = IO_0.float_III(n4);
            boolean bl3 = f < 1.0f ? this.var_java_util_Random_IIIO.nextInt(12000) < (int)(f * 100.0f) : (bl2 = this.var_java_util_Random_IIIO.nextInt(100) < (int)f);
            if (!true) continue;
            bl = true;
            ++n4;
        }
        if (bl) {
            n2 = IO_0.int_II(iO0l, 107);
            if (n2 < 0) {
                iO0l.III(107, n4);
            } else {
                ((int[])iO0l.IIl.elementAt((int)n2))[1] = n4;
            }
            this.IIlO(true);
            this.II_1(IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bbc\u551b\u4c61\u4c49\u4c6d\u4c0f\u4ce4\u4cc4\u4ce9\u4c86\u4d6f\u4dcf", 19254));
        } else {
            this.IIlO(false);
            this.II_1(Il1o[this.var_java_util_Random_IIIO.nextInt(Il1o.length)]);
        }
        this.lI1O();
    }

    private void lI0o() {
        Object object;
        IO0l iO0l = null;
        IO0l iO0l2 = null;
        for (int i = 0; i < this.I_Il.length; ++i) {
            object = this.IO0l_II(this.I_Il[i]);
            if (object == null) continue;
            if (IO_0.IIII((IO0l)object)) {
                iO0l = object;
                continue;
            }
            if (((IO0l)object).I1l != 1423) continue;
            iO0l2 = object;
        }
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4ba3\u4c6e\u4c41\u4c6d\u4c3c\u4ce3\u4ccb\u4ce9\u4ca4\u4ded\u4d06\u4d26\u53c1\u4df3\u4d82\u4df0\u4dc0\u4d89\u4efe\u4e1d\u4e6d\u4e5b\u4f8b\u4e58\u4ef8\u4ebf\u4f73\u4f58\u4f35\u4f07\u4ffb\u4fc5\u4fb5", 19254), Il10, false);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bdd\u4b50\u4bbf\u4b97\u4c2f\u4c4d\u52e8\u4c1c\u4cab\u4cf9\u4ca8\u4c87\u4d27\u4d76\u4d2d\u4d05\u4da3\u4dee\u4d2b\u4dc0\u4d8b\u50f5\u4e1d\u4e3f\u50de\u4eea\u4e99\u4ee9\u4ed7\u4f7a\u4fdf\u4f3a\u4f53\u4ff1\u5114\u4fa0\u4fcf\u503c\u5027\u5030\u5059\u50f6\u50fd\u4e01\u50c7\u516a\u4fe2\u5164\u5117\u51ea\u5141\u51ae\u51b7\u51de\u527e\u52c8\u5235\u521d\u52a3\u5298\u52e6\u52c6\u5325\u5311\u5359\u530e\u53a3\u53cc\u538c\u4d49\u5463\u540c\u547a\u544a\u5598\u5449\u54e7\u54ae\u5560\u5549\u5522\u5516\u55e8\u55d4\u55da\u55d4", 19254));
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bd0\u5515\u4bbf\u4bca\u4c2f\u4c1f\u4c6d\u4c02\u4cec\u5267\u4caa\u4ce2\u4d7b\u4d14\u4d39\u4d27\u5324\u4dcc\u4dfb\u4dc0", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb\u4b8c\u4c38\u4c52\u4c19\u4c04\u522e\u4cde\u4ce9\u4c8a\u53a6\u4d4f\u4d65\u4d49\u4db2\u4d82\u4cd0\u4d01\u4ddf\u4e56\u4e58\u4e31\u4e1a\u4eee\u4ed0\u4eac\u4e92\u4f1c", 19254));
        object = this.IOol_II();
        if (((IOol)object).lOoO < 1) {
            this.II(stringBuffer + IO_0.I11l("\u4b4a\u4b62\u4b08\u4bd0\u4b40\u4bbf\u4bd0\u4c7b\u4c46\u4c24\u52d3\u4cfe\u4c8a", 19254) + (1 - ((IOol)object).lOoO) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1\u4bf1\u4b88\u4c6e\u4c40\u4c25\u4c66", 19254), Il10, false);
        } else if (((IOol)object).Il11 < 1L) {
            this.II(stringBuffer + IO_0.I11l("\u4b4a\u4b62\u4b08\u4bd0\u4b40\u4bbf\u4bd0\u4c7b\u4c46\u4c24\u52d3\u4cfe\u4c8a", 19254) + IO00.IIlI(1L - ((IOol)object).Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254), Il10, false);
        } else {
            String[] stringArray = new String[2];
            stringArray[0] = IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254) + 10 + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1\u4bdb", 19254);
            stringArray[1] = IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254);
            this.II(stringBuffer.toString(), stringArray, true);
        }
    }

    private void lIo() {
        IOol iOol = this.IOol_II();
        IO0l iO0l = null;
        IO0l iO0l2 = null;
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l3 = this.IO0l_II(this.I_Il[i]);
            if (iO0l3 == null) continue;
            if (IO_0.IIII(iO0l3)) {
                iO0l = iO0l3;
                continue;
            }
            if (iO0l3.I1l != 1423) continue;
            iO0l2 = iO0l3;
        }
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null) {
            return;
        }
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        if (iOol.lOoO < 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u5246\u4cc9\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        --iOol.Il11;
        --iOol.lOoO;
        if (this.var_java_util_Random_IIIO.nextInt(100) < 100) {
            IO0l iO0l4 = new IO0l(1416 + (iO0l.I1l - 441), 1);
            for (int i = 0; i < iO0l.IIl.size(); ++i) {
                int[] nArray = (int[])iO0l.IIl.elementAt(i);
                iO0l4.III(nArray[0], nArray[1]);
            }
            this.var_IO0_IIIO.IIIl.III0(iO0l4);
            this.void_II(iO0l, 1);
            this.IIlO(true);
        } else {
            this.IIlO(false);
        }
        this.void_II(iO0l2, 1);
        this.lI1O();
    }

    private void lIoI() {
        IO0l iO0l = null;
        IO0l iO0l2 = null;
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l3 = this.IO0l_II(this.I_Il[i]);
            if (iO0l3 == null) continue;
            if (iO0l3.I1l >= 1416 && iO0l3.I1l <= 1422) {
                iO0l = iO0l3;
                continue;
            }
            if (iO0l3.I1l != 1439) continue;
            iO0l2 = iO0l3;
        }
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null || iO0l.lo0I < 2) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4bca\u4be3\u4bd0\u4c5c\u4c4f\u4c22\u4c4c\u4cdb\u4cc2\u4ca8\u4cc8\u4d4b\u4dcc\u4d65\u4d07\u5326\u4dd2\u4de1\u4dd2\u4ddf\u4e68\u4edd\u4e7c\u4e4a\u4eba\u4fa8\u4e39\u4ed7\u4f7b\u4fd5\u4f3d", 19254), Il10, false);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bdd\u4b50\u4bbf\u4b97\u4c2f\u4c4d\u52e8\u4c1c\u4cab\u4cf9\u4ca8\u4c87\u4d27\u4d76\u4d2d\u4d05\u4da3\u4dee\u4d2b\u4dc0\u4d8b\u50f5\u4e1d\u4e3f\u50de\u4eea\u4e99\u4eea\u4ed7\u4f7a\u4fdf\u4f3a\u4f53\u4fc1\u4fd0\u4fbf\u4fcf\u505e\u5045\u502d\u504b\u50c6\u5043\u50e8\u508b\u4fa3\u5155\u5164\u510f\u5163\u51cf\u51a8\u51d5\u5182\u522f\u5240\u520f\u4cb3\u52b9\u52d4\u4c10\u52d6\u5361\u535c\u53b3\u531c\u53f9\u5390\u53ac\u531a\u5463\u544b\u5471\u544a\u54b8\u5498\u54f7\u54c3\u550f\u5558\u5571\u551e\u55c2\u4b07\u55d1\u55fe\u55cc\u563c\u572a\u56bb\u5659\u56f5\u5657\u56bf\u56ff", 19254));
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bd0\u5515\u4bbf\u4bca\u4c2f", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb\u4b8c\u4c38\u4c52\u4c19\u4c04\u522e\u4cde\u4ce9\u4c8a\u53a6\u4d4f\u4d65\u4d49\u4db2\u4d82\u4cd0\u4d01\u4ddf\u4f0f\u4edc\u4e7c\u4e16\u4e7a\u4ed0\u4ed2", 19254));
        if (this.IOol_II().Il11 < 1L) {
            this.II(stringBuffer + IO_0.I11l("\u4b4a\u4b62\u4b08\u4bd0\u4b40\u4bbf\u4bd0\u4c7b\u4c46\u4c24\u52d3\u4cfe\u4c8a", 19254) + IO00.IIlI(1L - this.IOol_II().Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254), Il10, false);
        } else {
            String[] stringArray = new String[2];
            stringArray[0] = IO_0.I11l("\u4b78\u4bb7\u4b1a\u4bf4\u4b92\u4bb2\u5555\u4c7f\u4c24", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254);
            stringArray[1] = IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254);
            this.II(stringBuffer.toString(), stringArray, true);
        }
    }

    private void lIol() {
        IOol iOol = this.IOol_II();
        IO0l iO0l = null;
        IO0l iO0l2 = null;
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l3 = this.IO0l_II(this.I_Il[i]);
            if (iO0l3 == null) continue;
            if (iO0l3.I1l >= 1416 && iO0l3.I1l <= 1422) {
                iO0l = iO0l3;
                continue;
            }
            if (iO0l3.I1l != 1439) continue;
            iO0l2 = iO0l3;
        }
        if (this.II0_() != 2 || iO0l == null || iO0l2 == null || iO0l.lo0I < 2) {
            return;
        }
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        --iOol.Il11;
        IO0l iO0l4 = new IO0l(1426 + (iO0l.I1l - 1416), 1);
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            iO0l4.III(nArray[0], nArray[1] + 1);
        }
        this.var_IO0_IIIO.IIIl.III0(iO0l4);
        this.void_II(iO0l, 2);
        this.void_II(iO0l2, 1);
        this.IIlO(true);
        this.lI1O();
    }

    private void lIo1() {
        IO0l iO0l;
        IO0l iO0l2 = iO0l = this.II0_() == 1 ? this.IIIl() : null;
        if (iO0l == null || !IO_0.IIII(iO0l) || iO0l.lo0I < 5) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b87\u4bf1\u4b83\u4c6e\u4c41\u4c6d\u4c1c\u4ce3\u4ccb\u4ce9\u4c84\u4ded\u4d06\u4d06\u53c1\u4df3\u4d82\u4df3", 19254), Il10, false);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc7\u5513\u4bbe\u4bd0\u4d1e\u4ccf\u4c6d\u4c24\u4cee\u4cc7\u4ca8\u4c9c\u4d6e\u4d52\u4d20\u4d44\u4df7\u5349\u4de1\u4d93\u4d9e\u4e71\u4e1d\u4e2c\u4e13\u4efb\u4e99\u4eb4\u4e1d\u4f1c\u4f49\u4f66\u4f0f\u4fd1\u5116\u4fbe\u4fcf\u503b\u500d\u503f\u500a\u50e5\u5089\u50b8\u508f\u5167\u5105\u5128\u5189\u51a2\u51e2\u4f65\u51af\u51de\u522f\u5236\u5227\u5248\u52e5\u52ec\u4c1e\u52d6\u5379\u4df3\u5373\u5306\u53f9\u5350\u53a1\u5386\u542d\u544f\u54bf\u5404\u54ee\u5492\u54e7\u54d7\u5535\u5514\u5566\u5568", 19254));
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bd0\u5515\u4bbf\u4bca\u4c2f", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb\u4b8c\u4c38\u4c52\u4c19\u4c04\u522e\u4cde\u4ce9\u4c8a\u53a6\u4d4f\u4d65\u4d49\u4db6\u4d82\u4db2\u4d81\u4d90\u4e3e\u4e4d\u4e34\u4e1a\u4eba\u4ed5\u4e32\u4efd", 19254));
        if (this.IOol_II().Il11 < 1L) {
            this.II(stringBuffer + IO_0.I11l("\u4b4a\u4b62\u4b08\u4bd0\u4b40\u4bbf\u4bd0\u4c7b\u4c46\u4c24\u52d3\u4cfe\u4c8a", 19254) + IO00.IIlI(1L - this.IOol_II().Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254), Il10, false);
        } else {
            String[] stringArray = new String[2];
            stringArray[0] = IO_0.I11l("\u4b62\u55f4\u4b1b\u4bb3\u4aa3\u4b30\u4bd0\u4c47\u4c4b\u4c20\u4c0d\u4cff\u4cc3\u4cbd\u4c8d\u4d0d", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254);
            stringArray[1] = IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254);
            this.II(stringBuffer.toString(), stringArray, true);
        }
    }

    private IO0l IIIl() {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null) continue;
            return iO0l;
        }
        return null;
    }

    private void lIo_() {
        IO0l iO0l;
        IOol iOol = this.IOol_II();
        IO0l iO0l2 = iO0l = this.II0_() == 1 ? this.IIIl() : null;
        if (iO0l == null || !IO_0.IIII(iO0l) || iO0l.lo0I < 5) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3e\u4c0d\u4ce4\u4c8a\u4cb9\u4c80\u4d66\u4d06\u4d29\u4d8e\u4da3\u4cb3\u5302\u4dc0\u4d8b\u50bf\u4e52\u4e7c\u4f6a\u4e7b\u4e99\u4e90\u4e92\u4f7b\u4f54\u4f20\u4f1a\u4fe6\u4fd4", 19254));
            return;
        }
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
            return;
        }
        --iOol.Il11;
        this.void_II(iO0l, 5);
        this.var_IO0_IIIO.IIIl.III0(new IO0l(1423, 1));
        this.IIlO(true);
        this.lI1O();
    }

    private void II(IO0l[] iO0lArray) {
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null) continue;
            if (IO_0.boolean_II(iO0l)) {
                iO0lArray[0] = iO0l;
                continue;
            }
            if (iO0l.I1l == 1423) {
                iO0lArray[1] = iO0l;
                continue;
            }
            if (iO0l.I1l != 1438) continue;
            iO0lArray[2] = iO0l;
        }
    }

    private void lIoO() {
        if (this.II0O() == 0) {
            this.II(IO_0.I11l("\u4b7e\u4bb5\u4b1a\u4bfb\u4b92\u4ba5\u4b82\u4c6e\u4c40\u4c2a\u4c4c\u4ce8\u520d\u4ca7\u4cc8\u4dea\u4d52\u4d65\u4d0a\u4deb\u5307\u4db5\u4dc0\u4dce\u4e3e\u4e5e\u4e34\u50ac\u4eba\u4ecd\u4eaa\u5026\u4f78\u4f52", 19254), Il10, false);
            return;
        }
        if (this.II0_() != 3) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4bd0\u551e\u4bd0\u4d1e\u52c9\u4c6d\u4c1a\u5226\u4cde\u4ce9\u4c98\u4d6f\u538f\u4d28\u4d44\u4dfa\u4d48\u4db4\u4dc0\u4d9c\u50b9\u4e48", 19254), Il10, false);
            return;
        }
        IO0l[] iO0lArray = new IO0l[3];
        this.II(iO0lArray);
        if (iO0lArray[0] == null || iO0lArray[1] == null || iO0lArray[2] == null) {
            this.II(IO_0.I11l("\u4b74\u55f4\u4b1a\u4bb3\u4bd1\u4bb9\u4a40\u4c6e\u4c0e\u4c2f\u52a3\u4cab\u4dbb\u522e\u4cc8\u4d71\u538b\u4d31\u4d44\u4df3\u4dca\u5368\u4d8d\u4ddf\u4e3f\u4e1c\u4e7d", 19254), Il10, false);
            return;
        }
        if (IO_0.III(iO0lArray[0], 107) < 7) {
            this.II(IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c3d\u4c04\u5228\u4cc3\u4ce9\u4c8b\u4df4\u4d06\u4da8\u4d10\u4da3\u4dcc\u4da9\u5345\u4d8b\u4e3e\u4e0a\u4e7c\u4e08\u4efb\u4ed6\u4ef8\u4e87\u4f7e\u4f54\u4f74\u4f1f\u4f78\u4f91\u4fbd\u5134\u5067\u500d\u502f\u5098\u50aa\u50dd\u50a0\u4e24\u5126\u5146\u50f4\u4fbe\u51ec\u51c6\u51e0\u51b7\u510d\u527c\u521d", 19254), Il10, false);
            return;
        }
        String string = IO_0.III0(iO0lArray[0].I1l) + IO_0.I11l("\u4b3c\u4b16\u4ac4\u554e\u4bdc\u4bb6\u4bd0\u4c67\u4cdd\u4c2c\u4c66\u4cab\u4c7e\u4ce9\u4c9b\u4d66\u4d49\u4d65\u4d14\u4deb\u4dc3\u4de1\u4d8c\u4d15\u4e3e\u4e49\u4e34\u5092\u4eba\u4e81\u4ef8\u4e9f\u4f79\u5182\u4f37\u4f53\u4fab\u4fbb", 19254) + IO_0.III0(iO0lArray[0].I1l) + IO_0.I11l("\u4b3c\u4b01\u55bd\u4bb3\u4bde\u5516\u4bd0\u4c7b\u4c46\u4cad\u4c02\u4ce3\u4c8a\u4caa\u4c1c\u4d69\u4d41\u4d7f\u4d44\u4db2\u4d92\u4df1\u4dc5\u4df5\u4e62\u4e0a\u4e20\u4e5b\u4ed9\u501e\u4eb6\u4ed7\u4f27\u4f15", 19254) + IO_0.III0(1423) + IO_0.I11l("\u4b3c\u4b29\u4b43\u4bef\u4b92\u4b92\u5557\u4c61\u4c0e\u4c7c\u4c4c", 19254) + IO_0.III0(1438) + IO_0.I11l("\u4b3c\u4b16\u55d3\u4bfd\u4b92", 19254) + IO00.IIlI(500000000L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254);
        this.II(string, new String[]{IO_0.I11l("\u4b75\u4ae5\u55a9\u4bfd\u4bd5\u4bf1\u4bb8\u4cfc\u4c4f", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIo0() {
        boolean bl;
        boolean bl2;
        IOol iOol = this.IOol_II();
        if (this.II0O() == 0) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b5f\u4ba5\u4bd0\u4c61\u4c46\u52e8\u4c18\u4cab\u4c9b\u4ce9\u4c1c\u4d27\u4d52\u4d37\u53b5\u4ded\u4dc5\u4de1\u4d94\u4d8d\u4e71\u4e53\u4e3b\u4e5b\u4ef2\u4e59\u4eb6\u4e9f\u4f36\u4f41\u4f26\u4f12\u4ffc\u4fd6\u4ffe", 19254));
            return;
        }
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u4b3a\u4b1a\u4bb3\u4bd1\u5576\u4b9e\u4c2f\u4c5a\u4c25\u4c86\u4ce6\u4c8a\u4cbf\u4c08\u4d69\u4d41\u4d65\u4c75\u5340\u4d82\u4da2\u4c50\u5322\u4e70\u4e5a\u4e7c\u4e13\u4e69\u4ed8\u4ef6\u4ed9\u4f38", 19254));
            return;
        }
        IO0l[] iO0lArray = new IO0l[3];
        this.II(iO0lArray);
        if (iO0lArray[0] == null || iO0lArray[1] == null || iO0lArray[2] == null) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4b86\u52a2\u4c5a\u4c6d\u4c1c\u4ce3\u5203\u4ca4\u4cc8\u4d6f\u4d49\u53f2\u4d07\u4da3\u4dd1\u5310\u4dc0\u4d93\u4fae\u50de\u4e32\u4e1c\u4eba\u4ed2\u4eb0\u4e03\u4f78\u4f52\u4f74\u4e62\u5175\u4f9f", 19254));
            return;
        }
        IO0l iO0l = iO0lArray[0];
        int n = IO_0.III(iO0l, 107);
        int n2 = IO_0.int_II(iO0l, 228);
        boolean bl3 = IO_0.int_II(iO0l, 218) >= 0;
        boolean bl4 = bl2 = IO_0.III(iO0l, 102) == 7;
        if (!(n2 >= 0 && ((int[])iO0l.IIl.elementAt(n2))[1] >= 8 || bl2)) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c2e\u52cb\u4ce5\u4c8a\u4caa\u4c1b\u4d27\u4c37\u53a2\u4d44\u4db4\u4d82\u4dad\u5337\u4ddf\u4f0f\u50fe\u4e7c\u4e18\u4f2a\u5064\u4eb6\u4e90\u4f36\u4f5d\u4fa7\u4f12\u4fbc", 19254));
            return;
        }
        if (n < 8) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b60\u4b20\u4b1d\u4bb3\u4bde\u4b23\u4b9e\u4c68\u4c0e\u4c23\u4c8e\u4ce5\u4ccd\u4ce9\u4c8b\u53a2\u4d56\u4d65\u4d10\u4df1\u4dc3\u4daf\u4d87\u4ddf\u4e7c\u50f6\u4e7c\u4e17\u4e70\u4ed7\u4ef8\u4ecf\u4f36\u4f5d\u4f3b\u51c4\u4ff1\u4f91\u4fe9\u4fcf\u507d\u504c\u5023\u504b\u50fe\u50db\u5178\u4e3c\u5165\u5105\u512f\u510b\u51eb\u5181\u51a3\u506f\u4f23\u5273\u525b\u527b\u5212\u526a\u52d9\u52f9", 19254));
            return;
        }
        --iOol.Il11;
        if (n == 8) {
            if (n2 < 0) {
                if (!bl3) {
                    iO0l.III(218, 0);
                }
                iO0l.III(228, 8);
            } else {
                if (((int[])iO0l.IIl.elementAt(n2))[1] >= 8) {
                    ++iOol.Il11;
                    this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4d5c\u4c8f\u4cab\u4cc9\u4c3a\u4cc8\u4d6b\u53f1\u4d65\u4d10\u4deb\u534b\u4de1\u4dd8\u4dd1", 19254));
                    return;
                }
                ((int[])iO0l.IIl.elementAt((int)n2))[1] = 8;
                if (!bl3) {
                    iO0l.III(218, 0);
                }
            }
            bl = true;
        } else {
            if (n != 9) {
                ++iOol.Il11;
                this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u4b3d\u55bd\u4bb3\u4bd1\u4b22\u4bd0\u4c7b\u4c46\u528e\u4c4c\u4ce8\u4d1a\u5214\u4c86\u4d60\u4d06\u4d2d\u4d97\u4de2\u4d82\u4daa\u4d88\u4d96\u4e3e\u4e49\u4e2e\u4e1a\u4ef4\u4ede\u4ef8\u4e95\u51dd\u4f15\u4e45\u51d2\u4fe6\u4f91\u4fe8\u4fcf\u5066\u5042\u4efb\u5008\u50aa\u5090\u50e8\u5094\u5167\u514a\u516a", 19254));
                return;
            }
            if (n2 < 0) {
                if (!bl3) {
                    iO0l.III(218, 0);
                }
                iO0l.III(228, 8);
                bl = true;
            } else {
                int[] nArray = (int[])iO0l.IIl.elementAt(n2);
                if (nArray[1] != 8) {
                    ++iOol.Il11;
                    this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4b84\u4c67\u52ed\u4c6d\u4c0f\u4d3b\u5277\u4ca7\u4c8f\u4d27\u4d4e\u4db6\u4d05\u4da3\u4dd6\u4da9\u4d0a\u4d92\u4e30", 19254));
                    return;
                }
                boolean bl5 = bl = this.var_java_util_Random_IIIO.nextInt(200) < 200;
                if (bl) {
                    nArray[1] = 9;
                }
            }
        }
        this.IIlO(bl);
        if (bl) {
            this.II_1(IO_0.I11l("\u4b75\u4b3d\u4b8e\u4bf0\u4b92\u4bbc\u551b\u4c61\u4c49\u4c6d\u4c0f\u4ce4\u4cc4\u4ce9\u4c86\u4d6f\u4dcf", 19254));
        }
        this.void_II(iO0lArray[1], 1);
        this.void_II(iO0lArray[2], 1);
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        this.var_IOo__IIIO.II(new IO0o(-81).II(5).III(iII == null ? 0 : iII.lOo0));
        this.lI1O();
    }

    private static boolean boolean_IIOI(int n) {
        return n == 0 || n == 6 || n == 7 || n == 14 || n == 22 || n == 23 || n == 47;
    }

    private static boolean IIOl(int n) {
        return n == 236 || n == 228 || n >= 127 && n <= 144 || n >= 233 && n <= 248 || n >= 210 && n <= 218 || n >= 224 && n <= 227;
    }

    private static boolean IIIl(IO0l iO0l) {
        return iO0l.I1l >= 555 && iO0l.I1l <= 567;
    }

    private static boolean III1(IO0l iO0l) {
        int n = iO0l.I1l;
        return IO_0.IIIl(iO0l) || n == 241 || n == 253 || n == 265 || n == 277 || n == 281 || n == 237 || n == 249 || n == 261 || n == 273 || n == 233 || n == 245 || n == 257 || n == 269;
    }

    private String java_lang_String_II(IO0l iO0l, IO0l iO0l2) {
        if (!IO_0.III1(iO0l)) {
            return IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c3d\u4c04\u5228\u4cc3\u4ce9\u4c9c\u53ec\u4d06\u4d27\u53c9\u4de0\u4d82\u4dad\u4c50\u531e\u4e70\u4e5a\u4e7c\u4e17\u4ef5\u4ed7\u4ebf\u4edb\u4f36\u4f7f\u4f31\u4f12\u4ffc\u4f91\u4fb8\u4f80\u4eb9\u504e\u506c\u5031\u50ef\u50c5\u50a7\u5093\u5126\u5151\u5136\u4fbc\u51a2\u51cd\u512a\u51b1", 19254);
        }
        if (IO_0.III(iO0l, 72) < 4) {
            return IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c2a\u52bd\u4ce8\u4c8a\u4caa\u4c1b\u4d27\u4d45\u53e0\u4d14\u4da3\u4dd6\u532a\u4dc0\u4da4\u4e35\u4e09\u4e01", 19254);
        }
        if (!IO_0.IIIl(iO0l2)) {
            return IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c2e\u52cb\u4ce5\u4c8a\u4caa\u4c80\u4d72\u4d5f\u5386\u4d0a\u4da3\u4dca\u4d32\u4d81\u4ddf\u4e6e\u4e55\u50ff\u4e12\u4eba\u4ed5\u4e38\u4ed7\u4f42\u4f5d\u51f3\u4f1d\u4fb2\u4fe9\u4fb1\u4f96\u506a\u504c\u5060\u504b\u50de\u50c1\u4e6f\u5089\u5126\u5171\u5136\u5182\u51eb\u5181\u50d0\u4f7a\u518a\u523d\u5254\u5234\u4ccd\u52fa\u5298\u5283\u529e\u4db2\u535a\u5373\u533c\u53f0\u53dd\u53aa\u5385", 19254);
        }
        if (IO_0.int_II(iO0l2, 72) >= 0 || IO_0.int_II(iO0l2, 102) >= 0) {
            return IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c2e\u52cb\u4ce5\u4c8a\u4caa\u4c80\u4d72\u4d5f\u5386\u4d0a\u4da3\u4dca\u4d32\u4d81\u4ddf\u4e6e\u4e55\u50ff\u4e12\u4eba\u4eda\u4eb0\u4f47\u4f77\u4f15\u4f3a\u4f91\u4ffc\u4fd6\u4ff0\u4f8c\u4eab\u505d\u506c\u501d\u506a\u5089\u50ab\u508f\u50b6\u5144\u5164\u5113\u51ea\u51c0\u51e0\u51b3\u5114\u523d\u5254\u52a8\u521b", 19254);
        }
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        IOO.III iII2 = IOO.IOO$III_II(iO0l2.I1l);
        if (iII == null || iII2 == null || iII.IoI_ != iII2.IoI_ || iII.lOlI != iII2.lOlI) {
            return IO_0.I11l("\u4b62\u4b27\u4b15\u4bfd\u4bd5\u4bf1\u4b92\u52c4\u4c0e\u4c2a\u52bd\u4ce8\u4c8a\u4cbf\u4c08\u4d27\u4d72\u4d37\u4d05\u4ded\u4dc5\u4de1\u4d82\u5334\u4e3e\u4e53\u4e34\u50d6\u4eea\u4e99\u4eac\u4e9f\u51d5\u4f15\u4f24\u4f1b\u5131\u4fd8\u4ff0\u4f8c\u50f7\u5043\u502b\u504b\u50e6\u50c6\u4e69\u508e\u5126\u5153\u51a4\u5143\u51ea\u5141\u51ae\u51b7\u51de\u5269\u5255\u5235\u5212", 19254);
        }
        return null;
    }

    private int int_II(IO0l iO0l, IO0l iO0l2) {
        int n = iO0l2.IIl.size() == 0 ? 0 : ((int[])iO0l2.IIl.elementAt(0))[1];
        return (int)((double)n * Math.pow(1.1, IO_0.III(iO0l, 72)) * Math.pow(0.9, IO_0.III(iO0l, 209)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl0(boolean bl) {
        int[] nArray;
        int n;
        if (this.II0_() != 2) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4b84\u4c7d\u4c4f\u4c23\u4c0b\u4cab\u4cc8\u5202\u4cc8\u4d64\u4dd5\u4d65\u4d07\u5326\u4dd2\u4de1\u4d94\u5314\u4e3e\u4e66\u4e77\u4e4f\u4ec7\u4e99\u4eae\u4e17\u4f36\u4f04\u4f74\u4f07\u4fe0\u4fd0\u4fbe\u4f88\u502e\u504f\u4e87\u504b\u50e1\u50c1\u503c\u5089\u5161\u5105\u5127\u5190\u51a2\u51c2\u4f65\u51af\u51de\u5273\u5254\u53eb\u5214\u52fe\u5298\u52b4\u5297\u537a\u5314\u533b\u52d3\u53ff\u5390\u53fe\u53ce\u546f\u4a81\u5428", 19254), Il10, false);
            return;
        }
        IO0l iO0l = this.IO0l_II(this.I_Il[0]);
        IO0l iO0l2 = this.IO0l_II(this.I_Il[1]);
        if (iO0l == null || iO0l2 == null) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4b83\u4bf1\u4b84\u4c7d\u4c4f\u4c23\u4c0b\u4cab\u4cc8\u5202\u4cc8\u4d64\u4dd5\u4d65\u4d07\u5326\u4dd2\u4de1\u4d94\u5314\u4e3e\u4e66\u4e77\u4e4f\u4ec7\u4e99\u4eae\u4e17\u4f36\u4f04\u4f74\u4f07\u4fe0\u4fd0\u4fbe\u4f88\u502e\u504f\u4e87\u504b\u50e1\u50c1\u503c\u5089\u5161\u5105\u5127\u5190\u51a2\u51c2\u4f65\u51af\u51de\u5273\u5254\u53eb\u5214\u52fe\u5298\u52b4\u5297\u537a\u5314\u533b\u52d3\u53ff\u5390\u53fe\u53ce\u546f\u4a81\u5428", 19254), Il10, false);
            return;
        }
        String string = this.java_lang_String_II(iO0l, iO0l2);
        if (string != null) {
            this.II(string, Il10, false);
            return;
        }
        int n2 = this.int_II(iO0l, iO0l2);
        int n3 = IO_0.III(iO0l, 72);
        StringBuffer stringBuffer = new StringBuffer(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bdb\u4bdb\u5516\u4b9e\u4c2f\u4c5a\u52ec\u4c05\u4cab", 19254) + IO_0.III0(iO0l2.I1l) + IO_0.I11l("\u4b3c", 19254));
        for (n = 0; n < iO0l2.IIl.size(); ++n) {
            nArray = (int[])iO0l2.IIl.elementAt(n);
            if (nArray[0] == 72) continue;
            stringBuffer.append(IO_0.I11l("\u4b4a\u4b65\u4b08", 19254)).append(IO_0.III(nArray[0], nArray[1])).append('\n');
        }
        stringBuffer.append(IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc0\u4bd3\u4ba4\u4bd0\u4c64\u4c46\u4c24\u4c4c\u4ce5\u4c48\u4ca7\u4c8f\u4d27\u4d45\u53e0\u4d14\u4da3\u4d8a\u4dea", 19254) + n3 + IO_0.I11l("\u4b1f\u4b5f", 19254));
        for (n = 0; n < iO0l2.IIl.size(); ++n) {
            nArray = (int[])iO0l2.IIl.elementAt(n);
            if (IO_0.boolean_IIOI(nArray[0])) {
                stringBuffer.append(IO_0.I11l("\u4b4a\u4b64\u4b08", 19254)).append(IO_0.III(nArray[0], n2)).append('\n');
                continue;
            }
            if (nArray[0] == 72) continue;
            stringBuffer.append(IO_0.I11l("\u4b4a\u4b64\u4b08", 19254)).append(IO_0.III(nArray[0], nArray[1])).append('\n');
        }
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            nArray = (int[])iO0l.IIl.elementAt(n);
            if (IO_0.IIOl(nArray[0]) || IO_0.boolean_IIOI(nArray[0])) continue;
            stringBuffer.append(IO_0.III(nArray[0], nArray[1])).append('\n');
        }
        if (!bl) {
            stringBuffer.append(IO_0.I11l("\u4b75\u4b3d\u4b01\u4bea\u5571\u4bbf\u4bd0\u4c7e\u4c5b\u4c2c\u4c4c\u4cff\u520f\u4cbd\u4cc8\u4d64\u5385\u4d65\u4d17\u4de2\u4dcd\u4de1\u4d90\u4d97\u4e7f\u4e1d\u4e30\u4e91\u4e90\u4ec5\u4eea\u4e8b\u4f55\u5192\u4f3a\u4f53\u4fa3\u4f91\u4fa6\u4f0f\u5060\u504a", 19254));
        } else {
            stringBuffer.append(IO_0.I11l("\u4b75\u4b3d\u4b01\u4bea\u5571\u4bbf\u4bd0\u4c7e\u4c5b\u4c2c\u4c4c\u4cff\u520f\u4cbd\u4cc8\u4d64\u5385\u4d65\u4d17\u4de2\u4dcd\u4de1\u4d90\u4d97\u4e7f\u4e1d\u4e30\u4e91\u4e90\u4ec5\u4eea\u4e8b\u4f55\u5192\u4f3a\u4f53\u4fa3\u4f91\u4fbe\u4f88\u4ec3\u504e", 19254));
        }
        if (!bl) {
            if (this.IOol_II().Il11 < 1L) {
                this.II(stringBuffer + IO_0.I11l("\u4b3c\u4b29\u4b43\u4bef\u4bf1\u4b23\u4b9e\u4c2f\u4c5a\u4c25\u4c05\u5234\u4cdf\u4ce9", 19254) + IO00.IIlI(1L - this.IOol_II().Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254), Il10, false);
                return;
            }
        }
        if (bl) {
            if (this.IOol_II().lOoO < 1) {
                this.II(stringBuffer + IO_0.I11l("\u4b3c\u4b29\u4b43\u4bef\u4bf1\u4b23\u4b9e\u4c2f\u4c5a\u4c25\u4c05\u5234\u4cdf\u4ce9", 19254) + (1 - this.IOol_II().lOoO) + IO_0.I11l("\u4b16\u4b3b\u4b13\u555e\u4bd1", 19254), Il10, false);
                return;
            }
        }
        this.II(stringBuffer.toString(), new String[]{IO_0.I11l("\u4b75\u4b3d\u4b01\u4bea\u5571\u4bbf\u4bd0\u4c67\u4cdd\u4c2c", 19254), IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254)}, true);
    }

    private void IIlo(boolean bl) {
        int[] nArray;
        int n;
        IOol iOol = this.IOol_II();
        if (this.II0_() != 2) {
            return;
        }
        IO0l iO0l = this.IO0l_II(this.I_Il[0]);
        IO0l iO0l2 = this.IO0l_II(this.I_Il[1]);
        if (iO0l == null || iO0l2 == null || this.java_lang_String_II(iO0l, iO0l2) != null) {
            return;
        }
        if (!bl) {
            if (iOol.Il11 < 1L) {
                this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
                return;
            }
        }
        if (bl) {
            if (iOol.lOoO < 1) {
                this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c23\u4c0b\u5246\u4cc9\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53", 19254));
                return;
            }
        }
        int n2 = this.int_II(iO0l, iO0l2);
        IO0l iO0l3 = new IO0l(iO0l2.I1l, 1);
        for (n = 0; n < iO0l2.IIl.size(); ++n) {
            nArray = (int[])iO0l2.IIl.elementAt(n);
            if (IO_0.IIOl(nArray[0])) continue;
            iO0l3.III(nArray[0], IO_0.boolean_IIOI(nArray[0]) ? n2 : nArray[1]);
        }
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            nArray = (int[])iO0l.IIl.elementAt(n);
            if (IO_0.IIOl(nArray[0]) || IO_0.boolean_IIOI(nArray[0])) continue;
            iO0l3.III(nArray[0], nArray[1]);
        }
        if (bl) {
            --iOol.lOoO;
        } else {
            --iOol.Il11;
        }
        this.void_II(iO0l, 1);
        this.void_II(iO0l2, 1);
        this.var_IO0_IIIO.IIIl.III0(iO0l3);
        this.IIlO(true);
        this.lI1O();
    }

    private static boolean III_(IO0l iO0l) {
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int n = ((int[])iO0l.IIl.elementAt(i))[0];
            for (int j = 0; j < I_IO.length; ++j) {
                if (I_IO[j] != n) continue;
                return true;
            }
        }
        return false;
    }

    private void lIoo() {
        if (this.II0_() != 1) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4aa3\u5566\u4b84\u4c2f\u4d3f\u4cb7\u4c02\u4cec\u4c8a\u4cbf\u5245\u4d73\u4d06\u4d35\u4d0c\u532a\u4dcf\u4de0", 19254), Il10, false);
            return;
        }
        IO0l iO0l = this.IIIl();
        if (iO0l == null || !IO_0.III_(iO0l)) {
            this.II(IO_0.I11l("\u4b60\u55f8\u4b00\u4bb3\u4bc2\u4bb9\u5559\u4c62\u4c0e\u4c26\u4c04\u4c7f\u4cc4\u4cae\u4cc8\u4c16\u53c1\u4d65\u4c75\u4dea\u5363\u4db4\u4dc0\u4d94\u4e77\u50fa\u4e32\u4e5b\u4f8b\u507a\u4ef8\u4e87\u4f7e\u4fd7\u4f3a\u4f53\u4fe0\u4f52\u4ff1", 19254), Il10, false);
            return;
        }
        String string = IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc7\u557b\u4bf1\u4b9c\u52c8\u4c0e\u4c39\u4c04\u4c6b\u4cc4\u4ca1\u4cc8\u4d64\u4dd2\u4d2b\u4d03\u4db9\u4d82\u4df0\u4dd0\u4dcf\u4e3b\u4e37\u4e20\u4e49\u4ee6\u4efa\u507f\u4e99\u4f2c\u4f15", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254);
        if (this.IOol_II().Il11 < 1L) {
            this.II(string + IO_0.I11l("\u4b4a\u4b62\u4b08\u4bd0\u4b40\u4bbf\u4bd0\u4c7b\u4c46\u4c24\u52d3\u4cfe\u4c8a", 19254) + IO00.IIlI(1L - this.IOol_II().Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254), Il10, false);
        } else {
            String[] stringArray = new String[2];
            stringArray[0] = IO_0.I11l("\u4b66\u4b3d\u4b96\u4bfd\u4b92\u4ba3\u4b13\u4c05", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254);
            stringArray[1] = IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254);
            this.II(string, stringArray, true);
        }
    }

    private void ll() {
        IOol iOol = this.IOol_II();
        if (this.II0_() != 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4aa3\u5566\u4b84\u4c2f\u4d3f\u4cb7\u4c02\u4cec\u4c8a\u4cf8\u4cc8\u4d71\u538b\u4d31\u4d44\u4df3\u4dca\u5368\u4d8d\u4dde", 19254));
            return;
        }
        IO0l iO0l = this.IIIl();
        if (iO0l == null || !IO_0.III_(iO0l)) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b60\u55f8\u4b00\u4bb3\u4bc2\u4bb9\u5559\u4c62\u4c0e\u4c26\u4c04\u4c7f\u4cc4\u4cae\u4cc8\u4c16\u53c1\u4d65\u4c75\u4dea\u5363\u4db4\u4dc0\u4d94\u4e77\u50fa\u4e32\u4e5b\u4f8b\u507a\u4ef8\u4e87\u4f7e\u4fd7\u4f3a\u4f53\u4fe0\u4f52\u4ff1", 19254));
            return;
        }
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53\u4e7d", 19254));
            return;
        }
        --iOol.Il11;
        this.void_II(iO0l, 1);
        this.var_IO0_IIIO.IIIl.III0(new IO0l(1656, 1));
        this.IIlO(true);
        this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b66\u4b3d\u4b96\u4bfd\u4b92\u4ba3\u4b13\u4c2f\u4c5a\u4c25\u4c8c\u4ce5\u4cc2\u4ce9\u4c8b\u4df3\u4d48\u4d22\u4d45", 19254));
        this.lI1O();
    }

    private int int_IIOI(int n) {
        int n2 = 0;
        for (int i = 0; i < this.I_Il.length; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || iO0l.I1l != n) continue;
            n2 += iO0l.lo0I;
        }
        return n2;
    }

    private void II_I(int n, int n2) {
        for (int i = 0; i < this.I_Il.length && n2 > 0; ++i) {
            IO0l iO0l = this.IO0l_II(this.I_Il[i]);
            if (iO0l == null || iO0l.I1l != n) continue;
            int n3 = Math.min(iO0l.IIo1(), n2);
            this.void_II(iO0l, n3);
            n2 -= n3;
        }
    }

    private void llI() {
        if (this.II0_() == 0) {
            this.II(IO_0.I11l("\u4b75\u55f2\u4b1a\u4bb3\u4aa3\u5566\u4b84\u4c2f\u4d3f\u52aa\u4c4c\u4cfd\u5207\u4cbd\u4cc8\u4d77\u4d4e\u53ec\u4d09\u4da2", 19254), Il10, false);
            return;
        }
        if (this.int_IIOI(1656) < 3 || this.int_IIOI(1634) < 1) {
            this.II(IO_0.I11l("\u4b62\u4b3d\u4b1d\u552c\u4bc7\u4bf1\u4b86\u52a2\u4c5a\u4c6d\u4c1c\u4ce3\u5203\u4ca4\u4cc8\u4d64\u5381\u4d2b\u4d44\u4df7\u4dca\u4da8\u535f\u4d8b\u4e3f\u4e37\u4e71\u4e5b\u4ed9\u501e\u4eb6\u4ecd\u4f36\u4f06\u4f74\u4f38\u4ffa\u4fde\u4f31\u4f81\u5069\u500d\u5038\u508a\u50e3\u5089\u50ab\u508f\u4fb9\u512f\u5169\u5143\u51c1\u4f06\u51ae\u51e5\u51de\u522c\u521c\u5218\u521b\u52e9\u52cb\u52a2\u529a\u5370\u5314\u5305\u4d93", 19254), Il10, false);
            return;
        }
        String string = IO_0.I11l("\u4b4a\u4b67\u4b08\u4bc7\u557b\u4bf1\u4b9c\u52c8\u4c0e\u4c39\u4c04\u4c6b\u4cc4\u4ca1\u4cc8\u4d64\u4dd2\u4d2b\u4d03\u4db9\u4d82\u4df0\u4dd0\u4dcf\u4e3b\u4e37\u4e20\u4e49\u4ee6\u4efa\u507f\u4e99\u4f2c\u4f15\u4f67\u4f53\u4fd9\u4fd9\u4fbf\u4f0e\u5060\u504a\u506c\u501f\u506b\u50c0\u50e8\u5084\u516e\u4f9a\u514e\u511f\u51b0\u51dd\u5183\u4f78\u5190\u5227\u521c\u526a\u525a\u52da\u52d9\u52a7\u5285\u5360\u5358\u5336\u5352\u53c7\u4d51\u53c5\u5392\u543f\u5450\u5408\u4acd\u54e7\u5492\u54e7", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254);
        if (this.IOol_II().Il11 < 1L) {
            this.II(string + IO_0.I11l("\u4b4a\u4b62\u4b08\u4bd0\u4b40\u4bbf\u4bd0\u4c7b\u4c46\u4c24\u52d3\u4cfe\u4c8a", 19254) + IO00.IIlI(1L - this.IOol_II().Il11) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5\u4bdb", 19254), Il10, false);
        } else {
            String[] stringArray = new String[2];
            stringArray[0] = IO_0.I11l("\u4b62\u4bb4\u4b1d\u4bb3\u4bc6\u5570\u4b9f\u4c05", 19254) + IO00.IIlI(1L) + IO_0.I11l("\u4b16\u4b23\u4b94\u4bfd\u4bd5", 19254);
            stringArray[1] = IO_0.I11l("\u4b62\u55be\u4b54\u4bf0\u4bda\u5500\u4b99", 19254);
            this.II(string, stringArray, true);
        }
    }

    private void llII() {
        IOol iOol = this.IOol_II();
        if (this.int_IIOI(1656) < 3 || this.int_IIOI(1634) < 1) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u52c1\u4cff\u4c8a\u4cb9\u4c80\u53ae\u4d4b\u4d65\u4d07\u5324\u4dcc\u4de1\u4d94\u4d97\u4e77\u5082\u4e28\u4e5b\u4f8b\u507a\u4ef8\u4e83\u4ff7\u4f5c\u4f74\u4f07\u5133\u4fde\u4ff1", 19254));
            return;
        }
        if (iOol.Il11 < 1L) {
            this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b7d\u4b3d\u4b80\u4bfd\u4bd5\u4bf1\u4ae1\u52e8\u4c0e\u4c3b\u4c8c\u4ce5\u4ccd\u4ce9\u4df9\u53c4\u4d06\u4d31\u4d0c\u5372\u4dc1\u4de1\u4d88\u4d96\u50d9\u4e53\u4e7d", 19254));
            return;
        }
        --iOol.Il11;
        this.II_I(1656, 3);
        this.II_I(1634, 1);
        this.var_IO0_IIIO.IIIl.III0(new IO0l(1655, 1));
        this.IIlO(true);
        this.var_IO0_IIIO.IIIl.IIol(IO_0.I11l("\u4b62\u4bb4\u4b1d\u4bb3\u4bc6\u5570\u4b9f\u4c2f\u4c5a\u4c25\u4c8c\u4ce5\u4cc2\u4ce9\u4c8b\u4df3\u4d48\u4d22\u4d45", 19254));
        this.lI1O();
    }

    static {
        I_I1 = new int[]{1044, 1211, 1212, 1278, 1279, 1280};
        I_I_ = new int[]{77, 80, 81, 103, 50, 94, 5};
        Il10 = new String[]{IO_0.I11l("\u4a26\u4ba6\u4b1a\u4bf4", 19254)};
        I_IO = new int[]{127, 128, 129, 130, 131, 132, 133, 134, 135, 233, 237, 241, 245};
        Il1o = new String[]{IO_0.I11l("\u4b62\u4b34\u4b0d\u4bb3\u4bc0\u4ba4\u4b9e\u4c2f\u4cce\u4c61\u4c4c\u4d9a\u5207\u4cb9\u4cc8\u4d6c\u4d4f\u5386\u4d11\u4da3\u4dc5\u4d2d\u4dc0\u4d8b\u4e76\u5082\u4e63", 19254), IO_0.I11l("\u4b7a\u55f4\u4b1d\u4bb3\u4bca\u551a\u4b84\u4c2f\u4c5c\u529e\u4c05\u4ca7\u4c8a\u4ca1\u4c89\u4d6f\u4d47\u4d2d\u4d05\u4dad\u4d8c\u4def", 19254), IO_0.I11l("\u4b78\u4b32\u4b1b\u4bfd\u4b92\u4bb3\u555f\u4c7b\u4c0e\u4d5c\u4ddc\u5268\u4cc9\u4ce9\u4c8b\u4d68\u4d48\u4d65\u4d08\u5360\u4dcc\u4de1\u4d82\u4d16\u4e71\u4e1d\u4e2e\u50a8\u4ef3\u4e97\u4ef6\u4ed9\u4f37", 19254), IO_0.I11l("\u4b7a\u4bb5\u4b19\u4bb3\u4bde\u5570\u4b99\u4c2f\u4d3f\u4c24\u4c40\u4cab\u4cc8\u4ca0\u5257\u4d73\u4d06\u4c54\u4d86\u4df6\u4d82\u4dad\u5347\u4d91\u4e3e\u4e4e\u4e3d\u4e0e\u4eba\u4fa8\u5017\u4ed6", 19254), IO_0.I11l("\u4b7a\u55f2\u4b1a\u4bb3\u4bc1\u4bb0\u4b85\u4c2f\u4c40\u4c25\u52b7\u4cab\u4cc1\u4ca1\u524d\u4d69\u4d06\u4d31\u4d16\u4c33\u5379\u4da2\u4dc0\u4d94\u4e76\u4e54\u4e7c\u4f6a\u5037\u4ec9\u4ef9", 19254), IO_0.I11l("\u4b7d\u55ac\u4b54\u4bfd\u4ab1\u4bbf\u4b97\u4c2f\u4c5f\u4c38\u4c8d\u4cab\u4cc1\u4c20\u4c85\u4d38", 19254), IO_0.I11l("\u4b7e\u4bbf\u4b1a\u4bb3\u4bca\u4ba4\u4b99\u4c2f\u4c5a\u4c25\u4c98\u4ce2\u4c8a\u4ca4\u4c08\u4d2b\u4d06\u4c54\u538f\u4ded\u4dc5\u4de1\u4d83\u4d9e\u4e67\u4e1c", 19254), IO_0.I11l("\u4b75\u4ba7\u4b1a\u4bb3\u4bc4\u4b31\u4b9e\u4c68\u4c0e\u4c2e\u4c9e\u4ce5\u4c8a\u4ca7\u4c8f\u53ca\u4d45\u4d69\u4d44\u4c92\u530f\u4db1\u4dc0\u4d8b\u4e77\u5082\u4e2c\u4e5b\u4f8b\u4ed0\u4ef9", 19254)};
    }

    private static /* synthetic */ String I11l(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

