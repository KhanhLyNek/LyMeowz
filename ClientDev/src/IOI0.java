package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;

public final class IOI0
implements I1_1 {
    public int II0I;
    public int I_O0;
    public int l10;
    public int l10I;
    public boolean Il_0;
    private boolean I1ll = false;
    private static int IIOo = 2;
    private static final int[] I1oI = new int[]{18, 14, 11, 9, 6, 4, 2};
    private static int II = 0;
    private static String[] II_o = new String[]{IOI0.I1II("\u7336\u7305", 29462), IOI0.I1II("\u7338\u7319\u7314\u734c\u73b3\u73ee\u73e1\u73cd\u7421\u7409\u7461\u7443\u74a3\u7493\u74e2\u74cc\u753a\u7518\u757a\u7558\u75a7\u7587\u75be\u75fc\u75db\u7643\u761a\u7671\u7601\u76e4\u76e3\u768a\u76cd\u7732\u771b\u7762", 29462), IOI0.I1II("\u7377\u7357\u7337\u7341\u7373\u7351\u6d73\u730c\u6aaf\u74cf\u6ae9\u6acc\u6a23\u6a02\u6a65\u75e4\u6ba9\u6b94\u6bf7\u6bd6\u6b35\u7593", 29462), IOI0.I1II("\u7372\u7350\u7332\u7340\u7283\u7358\u7338\u6d54\u6ab3\u6a94\u74a6\u6ad4\u6a4b\u6a6a\u6a0d\u6a20\u7535", 29462), IOI0.I1II("\u7371\u735d\u733d\u7347\u737f\u735d\u6d19\u72c6\u6ac5\u7419", 29462), IOI0.I1II("\u737c\u735e\u7338\u7346", 29462), IOI0.I1II("\u737b\u735b\u733b\u7345\u7361\u7343\u6d1f\u731a\u6ac3\u74d9\u6a9d\u6ab8\u6a5f\u6a7e\u6a11\u7546\u6bdd\u6bf8\u6b9b\u6b82\u6b61\u7597", 29462), IOI0.I1II("\u7366\u7344\u7326\u7300\u73a5", 29462), IOI0.I1II("\u7362\u7340\u7322\u734b\u7368\u7348\u6d37\u7286\u6aeb\u759d\u6aa5\u6a80\u6a67\u6a46\u6a39\u74df", 29462), IOI0.I1II("\u7361\u734d\u732d\u7309\u73ab\u734c\u6d23\u6d18\u6af7\u6ad8\u7475", 29462), IOI0.I1II("\u733c", 29462), IOI0.I1II("\u7335", 29462)};
    private static String[] IIO = new String[]{IOI0.I1II("\u7326", 29462), IOI0.I1II("\u7327", 29462), IOI0.I1II("\u7377\u7357\u7337\u7341", 29462), IOI0.I1II("\u7372\u7350\u7332\u7340", 29462), IOI0.I1II("\u7371\u735d\u733d\u7347", 29462), IOI0.I1II("\u737c\u735e\u7338\u7346", 29462), IOI0.I1II("\u737b\u735b\u733b\u7345", 29462), IOI0.I1II("\u7366\u7344\u7326\u7300\u73a5", 29462), IOI0.I1II("\u7362\u7340\u7322\u734b", 29462), IOI0.I1II("\u7361\u734d\u732d\u7309\u73ab", 29462), IOI0.I1II("\u7326", 29462), IOI0.I1II("\u7326", 29462)};
    public String IIoI = "";
    private String Il_l = "";
    private String Il_1 = "";
    private String Il__ = "";
    private int II0l = 0;
    private int Iol = 0;
    private int IIl = 500;
    private int I1 = 0;
    private int I1I = -1984;
    private int Ioll = 0;
    private int I1__ = 0;
    private int I1_O = 10;
    private int I1_0 = 0;
    public static boolean III_;
    private static int I1_o;
    private int I1O = 0;
    private static int I1OI;
    public boolean IOOO;
    public String II1o = "";
    public I1Il IIII;
    private static Image I1IO;
    private boolean I_1_ = true;
    public boolean I0O_ = true;
    private static Image I1I0;

    public void void_IIl1() {
        TextBox textBox = new TextBox(this.II1o, "", this.IIl, 0);
        textBox.addCommand(new Command(IO11.I_lI, 4, 0));
        textBox.addCommand(new Command(IO11.I_l_, 3, 0));
        textBox.setCommandListener((CommandListener)new IOIo(this, textBox));
        try {
            if (this.I1_0 == 2) {
                textBox.setConstraints(65536);
            } else if (this.I1_0 == 1) {
                textBox.setConstraints(2);
            } else {
                textBox.setConstraints(0);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        textBox.setString(this.Il_l);
        textBox.setMaxSize(this.IIl);
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)textBox);
    }

    public IOI0() {
        II = IO1I.II1l.IIOl() + 1;
        this.IIII = new I1Il(IO11.I_II, this, 1000, null);
        I1_o = 0;
        if (I_O1.III(IOI0.I1II("\u7367\u7342\u7331\u7301\u73e6\u73c8", 29462)) == 1) {
            III_ = true;
        }
    }

    public void IOlI() {
        if (this.II0l > 0 && this.Il_l.length() > 0) {
            this.Il_l = this.Il_l.substring(0, this.II0l - 1) + this.Il_l.substring(this.II0l, this.Il_l.length());
            --this.II0l;
            this.IO11();
            this.IOl_();
        }
    }

    private void IO11() {
        this.Il__ = this.I1_0 == 2 ? this.Il_1 : this.Il_l;
        if (this.I1 < 0 && IO1I.II1l.IIII(this.Il__) + this.I1 < this.l10 - 6 - 13) {
            this.I1 = this.l10 - 10 - IO1I.II1l.IIII(this.Il__);
        }
        if (this.I1 + IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) <= 0) {
            this.I1 = -IO1I.II1l.IIII(this.Il__.substring(0, this.II0l));
            this.I1 += 40;
        } else if (this.I1 + IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) >= this.l10 - 22) {
            this.I1 = this.l10 - 10 - IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) - 12;
        }
        if (this.I1 > 0) {
            this.I1 = 0;
        }
    }

    private void IIOI(int n) {
        if (n == 432) {
            n = 119;
        }
        if ((this.I1_0 != 2 && this.I1_0 != 3 || n >= 48 && n <= 57 || n >= 65 && n <= 90 || n >= 97 && n <= 122) && this.Il_l.length() < this.IIl) {
            String string = this.Il_l.substring(0, this.II0l) + (char)n;
            if (this.II0l < this.Il_l.length()) {
                string = string + this.Il_l.substring(this.II0l, this.Il_l.length());
            }
            this.Il_l = string;
            ++this.II0l;
            this.IOl_();
            this.IO11();
        }
    }

    public final boolean II1o(int n) {
        if (n != 8 && n != -8 && n != 204) {
            if (n >= 65 && n <= 122 && !III_) {
                III_ = true;
                I1_o = 0;
                I_O1.IIIl(IOI0.I1II("\u7367\u7342\u7331\u7301\u73e6\u73c8", 29462), 1);
            }
            if (III_) {
                if (n == 45) {
                    if (n == this.I1I && this.Ioll < I1oI[IIOo]) {
                        this.Il__ = this.Il_l = this.Il_l.substring(0, this.II0l - 1) + '_';
                        this.IOl_();
                        this.IO11();
                        this.I1I = -1984;
                        return false;
                    }
                    this.I1I = 45;
                }
                if (n >= 32) {
                    this.IIOI(n);
                    return false;
                }
            }
            if (n == I1OI) {
                ++this.I1O;
                if (this.I1O > 3) {
                    this.I1O = 0;
                }
                this.Ioll = 1;
                this.I1I = n;
                return false;
            }
            if (n == 42) {
                n = 58;
            }
            if (n == 35) {
                n = 59;
            }
            if (n >= 48 && n <= 59) {
                if (this.I1_0 != 0 && this.I1_0 != 2 && this.I1_0 != 3) {
                    if (this.I1_0 == 1) {
                        this.IIOI(n);
                        this.Ioll = 1;
                    }
                } else {
                    String[] stringArray = this.I1_0 != 2 && this.I1_0 != 3 ? II_o : IIO;
                    if (n == this.I1I) {
                        this.I1__ = (this.I1__ + 1) % stringArray[n - 48].length();
                        char c = stringArray[n - 48].charAt(this.I1__);
                        c = this.I1O == 0 ? Character.toLowerCase(c) : (this.I1O == 1 ? Character.toUpperCase(c) : (this.I1O == 2 ? Character.toUpperCase(c) : stringArray[n - 48].charAt(stringArray[n - 48].length() - 1)));
                        String string = this.Il_l.substring(0, this.II0l - 1) + c;
                        if (this.II0l < this.Il_l.length()) {
                            string = string + this.Il_l.substring(this.II0l, this.Il_l.length());
                        }
                        this.Il_l = string;
                        this.Ioll = I1oI[IIOo];
                        this.IOl_();
                    } else if (this.Il_l.length() < this.IIl) {
                        if (this.I1O == 1 && this.I1I != -1984) {
                            this.I1O = 0;
                        }
                        this.I1__ = 0;
                        char c = stringArray[n - 48].charAt(this.I1__);
                        c = this.I1O == 0 ? Character.toLowerCase(c) : (this.I1O == 1 ? Character.toUpperCase(c) : (this.I1O == 2 ? Character.toUpperCase(c) : stringArray[n - 48].charAt(stringArray[n - 48].length() - 1)));
                        String string = this.Il_l.substring(0, this.II0l) + c;
                        if (this.II0l < this.Il_l.length()) {
                            string = string + this.Il_l.substring(this.II0l, this.Il_l.length());
                        }
                        this.Il_l = string;
                        this.Ioll = I1oI[IIOo];
                        ++this.II0l;
                        this.IOl_();
                        this.IO11();
                    }
                    this.I1I = n;
                }
            } else {
                this.I1__ = 0;
                this.I1I = -1984;
                if (n == 14) {
                    if (this.II0l > 0) {
                        --this.II0l;
                        this.IO11();
                        this.I1_O = 10;
                        return false;
                    }
                } else if (n == 15) {
                    if (this.II0l < this.Il_l.length()) {
                        ++this.II0l;
                        this.IO11();
                        this.I1_O = 10;
                        return false;
                    }
                } else {
                    if (n == 19) {
                        this.IOlI();
                        return false;
                    }
                    this.I1I = n;
                }
            }
            return true;
        }
        this.IOlI();
        return true;
    }

    public void III_(IO1l iO1l) {
        if (this.I_1_) {
            iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
        }
        boolean bl = this.Il_0;
        this.Il__ = this.I1_0 == 2 ? this.Il_1 : this.Il_l;
        int n = this.II0I;
        int n2 = this.I_O0 - 1;
        int n3 = this.l10;
        int n4 = this.l10I;
        int n5 = 6 + this.I1 + this.II0I;
        int n6 = this.I_O0 + (this.l10I - IO1I.II1l.IIOl()) / 2;
        String string = this.II1o;
        String string2 = this.Il__;
        int n7 = n3;
        int n8 = n2;
        int n9 = n;
        IO1l iO1l2 = iO1l;
        iO1l.Illl(0);
        if (bl) {
            iO1l.II(I1I0, 0, 81, 29, 27, 0, n, n2, 0);
            iO1l.II(I1I0, 0, 135, 29, 27, 0, n + n3 - 29, n2, 0);
            iO1l.II(I1I0, 0, 108, 29, 27, 0, n + n3 - 58, n2, 0);
            for (int i = 0; i < (n7 - 58) / 29; ++i) {
                iO1l2.II(I1I0, 0, 108, 29, 27, 0, n9 + 29 + i * 29, n8, 0);
            }
        } else {
            iO1l.II(I1I0, 0, 0, 29, 27, 0, n, n2, 0);
            iO1l.II(I1I0, 0, 54, 29, 27, 0, n + n3 - 29, n2, 0);
            iO1l.II(I1I0, 0, 27, 29, 27, 0, n + n3 - 58, n2, 0);
            for (int i = 0; i < (n7 - 58) / 29; ++i) {
                iO1l2.II(I1I0, 0, 27, 29, 27, 0, n9 + 29 + i * 29, n8, 0);
            }
        }
        iO1l2.IIIO(n9 + 3, n8 + 1, n7 - 4, n4);
        if (string2 != null && !string2.equals("")) {
            IO1I.II1l.II(iO1l2, string2, n5, n6, 0);
        } else if (string != null) {
            if (bl) {
                IO1I.IIIo.II(iO1l2, string, n5, n6 + 2, 0);
            } else {
                IO1I.IIl.II(iO1l2, string, n5, n6 + 2, 0);
            }
        }
        iO1l.Illl(0);
        if (this.Il_0 && this.I0O_) {
            if (this.Ioll == 0 && (this.I1_O > 0 || this.Iol / 5 % 2 == 0)) {
                iO1l.Illl(7999781);
                iO1l.III_(7 + this.I1 + this.II0I + IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) - 1, this.I_O0 + (this.l10I - II) / 2 + 1, 1, II);
            }
            II.II(iO1l);
            if (this.Il_l != null && this.Il_l.length() > 0 && II.var_boolean_IIIl && bl) {
                iO1l.II(I1IO, this.II0I + this.l10 - 13, this.I_O0 + this.l10I / 2 + 1, 3);
            }
        }
    }

    private void IOl_() {
        if (this.I1_0 == 2) {
            this.Il_1 = "";
            for (int i = 0; i < this.Il_l.length(); ++i) {
                this.Il_1 = this.Il_1 + IOI0.I1II("\u733c", 29462);
            }
            if (this.Ioll > 0 && this.II0l > 0) {
                this.Il_1 = this.Il_1.substring(0, this.II0l - 1) + this.Il_l.charAt(this.II0l - 1) + this.Il_1.substring(this.II0l, this.Il_1.length());
            }
        }
    }

    public void IIlO() {
        this.I0O_ = true;
        ++this.Iol;
        if (this.Ioll > 0) {
            --this.Ioll;
            if (this.Ioll == 0) {
                this.I1__ = 0;
                if (this.I1O == 1 && this.I1I != I1OI) {
                    this.I1O = 0;
                }
                this.I1I = -1984;
                this.IOl_();
            }
        }
        if (this.I1_O > 0) {
            --this.I1_O;
        }
        if (II.var_boolean_IIIo) {
            if (II.II(this.II0I + this.l10 - 20, this.I_O0, 40, this.l10I)) {
                this.Il_l = "";
                this.II0l = 0;
                this.IO11();
                this.IOl_();
                this.Il_0 = true;
                return;
            }
            if (II.II(this.II0I, this.I_O0, this.l10, this.l10I)) {
                this.void_IIl1();
                return;
            }
            this.Il_0 = false;
        }
    }

    public final String java_lang_String_IIl1() {
        return this.Il_l;
    }

    public void IIOl(String string) {
        if (string != null) {
            this.I1I = -1984;
            this.Ioll = 0;
            this.I1__ = 0;
            this.Il_l = string;
            this.Il__ = string;
            this.IOl_();
            this.II0l = string.length();
            this.IO11();
        }
    }

    public void II(int n) {
        this.IIl = n;
    }

    public void Ill(int n) {
        int n2;
        this.I1_0 = n;
        this.IIl = n2 = 500;
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1000: {
                this.IOlI();
            }
        }
    }

    static {
        String[] stringArray = new String[]{IOI0.I1II("\u7377\u7357\u7337", 29462), IOI0.I1II("\u7357\u7357\u7337", 29462), IOI0.I1II("\u7357\u7377\u7317", 29462), IOI0.I1II("\u7327\u7307\u7367", 29462)};
        I1OI = 11;
        I1IO = IO10.IIII(IOI0.I1II("\u7339\u7358\u7335\u731a\u73fc\u73f8\u73bd\u738e\u7469\u7448\u7463\u7406\u74f3\u74fd\u74ad\u749f\u7572\u7550\u7536\u7506\u75b0\u75c5\u75a5\u75ad\u75d0\u766d\u7652\u763c", 29462));
        I1I0 = IO10.IIII(IOI0.I1II("\u7339\u7358\u7335\u731a\u73fc\u73f8\u73bd\u738e\u7469\u7448\u7463\u7406\u74f3\u74fd\u74ad\u749f\u7572\u7550\u7536\u7506\u75b0\u75c5\u75b4\u75b9\u75d0\u766d\u7652\u763c", 29462));
        int[][] nArrayArray = new int[][]{{32, 48}, {49, 69}, {50, 84}, {51, 85}, {52, 68}, {53, 71}, {54, 74}, {55, 67}, {56, 66}, {57, 77}, {42, 128}, {35, 137}, {33, 113}, {63, 97}, {64, 121, 122}, {46, 111}, {44, 108}};
    }

    private static /* synthetic */ String I1II(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

