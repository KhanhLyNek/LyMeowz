/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IO1I {
    private int I1O0;
    private int l10I;
    private Image I1lI;
    private String Il_0;
    private int[][] II1I;
    private static String Il_o = IO1I.I1I0("\u426f\u425e\u42bc\u429e\u42f8\u42de\u433c\u431e\u4370\u435e\u43bc\u438f\u43ee\u43c8\u443c\u4407\u4460\u4461\u4453\u44b0\u4487\u44e4\u44d6\u4543\u456a\u452d\u4508\u45b5\u45f3\u45f1\u45d5\u4635\u4671\u4668\u4647\u46a4\u4682\u46f0\u4688\u47e9\u47c7\u59e5\u4786\u5925\u4741\u5967\u5946\u56a9\u56b4\u5693\u495e\u56d3\u562a\u5609\u566c\u564f\u4975\u4955\u4931\u4865\u49f6\u495b\u4939\u574b\u54b2\u5497\u4aa7\u54d3\u544a\u5469\u540c\u542f\u4b61\u4b41\u4b2d\u4b0d\u4b6e\u4b4e\u5508\u4ac9\u5534\u4c74\u4c56\u4c30\u4c16\u4cf4\u4cd6\u4c2b\u4c05\u53d9\u4dc0\u5399\u4d87\u5343\u5362\u5305\u5338\u50d7\u4f8c\u5097\u50b6\u5055\u5048\u502b\u4e97\u4f77\u4f57\u4f37\u4f17\u4ff7\u4f5b\u4f39\u5138\u4e97\u4ef8\u518c\u4eb2\u4e91\u4e74\u4e57\u4e26\u5080\u516d\u514d\u51ae\u4f81\u4f66\u4f49\u4f3a\u5194\u527a\u526d\u528a\u52aa\u4c2b\u526b\u4c67\u53e4\u4db5\u4d8a\u4df1\u4dd6\u4d37\u5362\u4d1b\u4d78\u4d55\u4ab6\u4a97\u5418\u543a\u54dc\u55a7\u5493\u543c\u55dc\u4b89\u4bee\u4bc9\u555a\u4b11\u4b0e\u4b2f\u48c8\u48ed\u560c\u562e\u56c0\u56ee\u560b\u5629\u49cc\u560b\u4988\u572b\u57cb\u57d3\u57f3\u5793\u57b3\u58c8\u58e8\u4697\u58ad\u465b\u5862\u4605\u4626\u47c7\u47e4\u4789\u58d0\u4755\u4772\u4713\u470c\u44e9\u5a7a\u5a18\u5a3a\u5ad4\u5af2\u5a90\u5a3e\u5bda\u45c4\u5a29\u4584\u5ad0\u4576\u4557\u4530\u4515\u42ea\u5c6f\u5c00\u5c2e\u5c4b\u4247\u4222\u420b\u43e6\u5d6b\u5d07", 16975);
    public static IO1I II;
    public static IO1I III;
    public static IO1I IIII;
    public static IO1I IIIl;
    public static IO1I III1;
    public static IO1I III_;
    public static IO1I IIIO;
    public static IO1I III0;
    public static IO1I IIIo;
    public static IO1I IIl;
    public static IO1I IIlI;
    public static IO1I IIll;
    public static IO1I IIl1;
    public static IO1I IIl_;
    public static IO1I IIlO;
    public static IO1I IIl0;
    public static IO1I IIlo;
    public static IO1I II1;
    public static IO1I II1I;
    public static IO1I II1l;
    private static IO1I II11;
    private static IO1I II1_;
    private static IO1I II1O;
    public static IO1I II10;
    private static IO1I II1o;
    public static IO1I II_;
    public static IO1I II_I;
    public static IO1I II_l;
    public static IO1I II_1;
    public static IO1I II__;
    public static IO1I II_O;
    public static IO1I II_0;
    public static IO1I II_o;
    public static IO1I IIO;
    public static IO1I IIOI;
    public static IO1I IIOl;
    public static IO1I IIO1;
    public static IO1I IIO_;
    public static IO1I IIOO;
    public static IO1I IIO0;
    private String IlO;
    public static int l_II;
    public static int l_Il;
    public static int l_I1;
    public static int l_I_;
    public static int l_IO;

    private IO1I(String string, String string2, String string3, int n) {
        try {
            this.Il_0 = string;
            this.I1O0 = n;
            this.IlO = string2;
            string = null;
            this.I1lI = IO10.IIII(this.IlO);
            FilterInputStream filterInputStream = null;
            try {
                filterInputStream = new DataInputStream(I11O.II(string3));
                this.II1I = new int[((DataInputStream)filterInputStream).readShort()][];
                for (int i = 0; i < this.II1I.length; ++i) {
                    int n2;
                    this.II1I[i] = new int[4];
                    this.II1I[i][0] = ((DataInputStream)filterInputStream).readShort();
                    this.II1I[i][1] = ((DataInputStream)filterInputStream).readShort();
                    this.II1I[i][2] = ((DataInputStream)filterInputStream).readShort();
                    this.II1I[i][3] = ((DataInputStream)filterInputStream).readShort();
                    this.l10I = n2 = this.II1I[i][3];
                }
            }
            catch (Exception exception) {
                try {
                    filterInputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(IO1I.I1I0("\u423f\u420f\u42e5\u42d8\u42eb\u428e\u4368\u435c\u4326\u435c", 16975) + string2);
        }
    }

    public final int IIOl() {
        return this.l10I;
    }

    public final int IIII(String string) {
        int n = 0;
        for (int i = 0; i < string.length(); ++i) {
            int n2 = this.Il_0.indexOf(string.charAt(i));
            if (n2 == -1) {
                n2 = 0;
            }
            n += this.II1I[n2][2] + this.I1O0;
        }
        return n;
    }

    public void II(IO1l iO1l, String string, int n, int n2, int n3) {
        int n4 = string.length();
        n3 = n3 == 0 ? n : (n3 == 1 ? n - this.IIII(string) : n - (this.IIII(string) >> 1));
        for (int i = 0; i < n4; ++i) {
            n = this.Il_0.indexOf(string.charAt(i));
            if (n == -1) {
                n = 0;
            }
            if (n >= 0) {
                iO1l.II(this.I1lI, this.II1I[n][0], this.II1I[n][1], this.II1I[n][2], this.II1I[n][3], 0, n3, n2, 20);
            }
            n3 += this.II1I[n][2] + this.I1O0;
        }
    }

    public void II(IO1l iO1l, String string, int n, int n2, int n3, IO1I iO1I) {
        int n4 = string.length();
        n3 = n3 == 0 ? n : (n3 == 1 ? n - this.IIII(string) : n - (this.IIII(string) >> 1));
        for (int i = 0; i < n4; ++i) {
            n = this.Il_0.indexOf(string.charAt(i));
            if (n == -1) {
                n = 0;
            }
            if (n >= 0) {
                iO1l.II(iO1I.I1lI, this.II1I[n][0], this.II1I[n][1], this.II1I[n][2], this.II1I[n][3], 0, n3 + 1, n2, 20);
                iO1l.II(iO1I.I1lI, this.II1I[n][0], this.II1I[n][1], this.II1I[n][2], this.II1I[n][3], 0, n3, n2 + 1, 20);
                iO1l.II(this.I1lI, this.II1I[n][0], this.II1I[n][1], this.II1I[n][2], this.II1I[n][3], 0, n3, n2, 20);
            }
            n3 += this.II1I[n][2] + this.I1O0;
        }
    }

    public final String[] II(String string, int n) {
        int n2 = n;
        String string2 = string;
        IO1I iO1I = this;
        I_lO i_lO = new I_lO(IO1I.I1I0("\u4239\u4222\u42e4\u42c2\u42ae", 16975));
        String string3 = "";
        for (int i = 0; i < string2.length(); ++i) {
            if (string2.charAt(i) != '\n' && string2.charAt(i) != '\b') {
                if (iO1I.IIII(string3 = string3 + string2.charAt(i)) > n2) {
                    int n3;
                    for (n3 = string3.length() - 1; n3 >= 0 && string3.charAt(n3) != ' '; --n3) {
                    }
                    if (n3 < 0) {
                        n3 = string3.length() - 1;
                    }
                    i_lO.addElement(string3.substring(0, n3));
                    i = i - (string3.length() - n3) + 1;
                    string3 = "";
                }
                if (i != string2.length() - 1 || string3.trim().equals("")) continue;
                i_lO.addElement(string3);
                continue;
            }
            i_lO.addElement(string3);
            string3 = "";
        }
        I_lO i_lO2 = i_lO;
        String[] stringArray = new String[i_lO.size()];
        for (n2 = 0; n2 < i_lO2.size(); ++n2) {
            stringArray[n2] = i_lO2.elementAt(n2).toString();
        }
        return stringArray;
    }

    public void III(IO1l iO1l, String string, int n, int n2, int n3) {
        this.II(iO1l, string, n, n2, 2);
    }

    public void III(IO1l iO1l, String string, int n, int n2, int n3, IO1I iO1I) {
        this.II(iO1l, string, n, n2, n3, iO1I);
    }

    static {
        l_II = 0;
        l_Il = 1;
        l_I1 = 2;
        l_I_ = 4;
        l_IO = 5;
        II = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u440f\u44f9\u44df\u44f4\u4489\u4576\u4550", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        III = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u441f\u44f0\u44ce\u44bf\u44d7\u4568\u4559\u4531", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        IIII = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u440a\u44f4\u44d2\u44ae\u449c\u4536\u4547\u4538\u4512", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        IIIl = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u4404\u44f9\u44d7\u44b6\u4496\u456f\u4519\u4526\u451b\u45f3", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        III1 = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u4404\u44f9\u44d7\u44b6\u4496\u456f\u4519\u4526\u451b\u45f3", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        III_ = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u441f\u44ee\u44d4\u44ad\u4497\u4536\u4547\u4538\u4512", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        IIIO = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u441a\u44ee\u44de\u44bf\u4497\u452a\u4519\u4526\u451b\u45f3", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        III0 = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u441a\u44ee\u44de\u44bf\u4497\u4536\u4547\u4538\u4512", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        IIIo = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u441b\u44f3\u44d8\u44af\u448a\u4536\u4547\u4538\u4512", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        IIl = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d\u4401\u4408\u44f2\u44dd\u44b5\u449a\u456d\u4544\u4578\u4505\u45fa\u45d4", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u445d", 16975), 0);
        IIlI = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4411\u442e\u4413\u44fb", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        IIll = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u443c\u4411\u44e9\u44de\u44eb\u44d7\u4568\u4559\u4531", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        IIl1 = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u4439\u440f\u44f9\u44de\u44b4\u44cb\u4536\u4547\u4538\u4512", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        IIl_ = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u4427\u4418\u44f0\u44d7\u44b5\u448e\u4536\u4547\u4538\u4512", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        IIlO = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u4439\u440f\u44f9\u44c2\u44f4\u4489\u4576\u4550", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        IIl0 = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u442c\u4418\u44f8\u4495\u44aa\u4497\u457f", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        IIlo = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u443c\u4411\u44e9\u44de\u44f4\u4489\u4576\u4550", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        II1 = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u4439\u440f\u44f9\u44de\u44b4\u44d7\u4568\u4559\u4531", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        II1I = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417\u4460\u4429\u4415\u44f5\u44cf\u44bf\u44d7\u4568\u4559\u4531", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4417", 16975), 0);
        II1l = new IO1I(Il_o, IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4418\u445d\u4470\u440d\u44f2\u44dc", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4333\u4307\u43ed\u43cb\u43ae\u4383\u445e\u4418\u445d", 16975), -1);
        II11 = new IO1I(IO1I.I1I0("\u426f\u425e\u42bc\u429e\u42f8\u42de\u433c\u431e\u4370\u435e\u43bc\u438f\u43ee", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390\u445e\u4459\u445a\u4432\u4411\u44f3\u44cc\u44f4\u4489\u4576\u4550", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390", 16975), 0);
        II1_ = new IO1I(IO1I.I1I0("\u426f\u425e\u42bc\u429e\u42f8\u42de\u433c\u431e\u4370\u435e\u43bc\u438f\u43ee", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390\u445e\u4452\u445a\u443a\u4453\u44ec\u44d5\u44bd", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390", 16975), 0);
        II1O = new IO1I(IO1I.I1I0("\u426f\u425e\u42bc\u429e\u42f8\u42de\u433c\u431e\u4370\u435e\u43bc\u438f\u43ee", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390\u445e\u4447\u444d\u443b\u4418\u44f2\u4495\u44aa\u4497\u457f", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390", 16975), 0);
        II10 = new IO1I(IO1I.I1I0("\u426f\u425e\u42bc\u429e\u42f8\u42de\u433c\u431e\u4370\u435e\u43bc\u438f\u43ee", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390\u445e\u4447\u444d\u443f\u4404\u44b2\u44cb\u44b4\u449e", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390", 16975), 0);
        II1o = new IO1I(IO1I.I1I0("\u426f\u425e\u42bc\u429e\u42f8\u42de\u433c\u431e\u4370\u435e\u43bc\u438f\u43ee", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390\u445e\u444f\u444d\u443f\u4413\u44fb\u44de\u44f4\u4489\u4576\u4550", 16975), IO1I.I1I0("\u4260\u4203\u42f4\u42ca\u42a4\u4284\u437d\u4307\u4329\u4313\u43e8\u43c6\u43a6\u4390", 16975), 0);
        II_ = II1_;
        II_I = IIII;
        II_l = II11;
        II_1 = II1O;
        II__ = II1o;
        II_O = IIll;
        II_0 = IIl0;
        II_o = IIl_;
        IIO = II1;
        IIOI = IIlO;
        IIOl = IIl_;
        IIO1 = IIIO;
        IIO_ = II1I;
        IIOO = III0;
        IIO0 = IIll;
    }

    private static /* synthetic */ String I1I0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

