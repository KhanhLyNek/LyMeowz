/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class II_O
extends IIII
implements I1_1,
I1__,
CommandListener {
    private static II_O II;
    private final IlI0 IIII;
    public Form III;
    public Command IIII;
    public Command IIIl;
    public TextField IIIO;
    private boolean IIo0 = false;
    private boolean IIoo = true;
    private boolean Il = false;
    private boolean IlI = false;
    private int Il1O = 50;
    private Il_l.II II;
    private Il_l.II III;
    private boolean IlII = false;
    private boolean IlIl = false;
    private Il_l.II IIII = new IlI0();
    private long II1o = 0L;
    private long II_ = 0L;
    private static final long II_I = 800L;
    private static final long II_l = 550L;
    private static final int Il10 = 64;
    private final int[] II1;
    private final byte[] II = new Il_l.II();
    private int Il1o = 0;
    private int Il_ = 0;
    private String IIl_ = "";
    private String IIlO = "";
    private String IIl0 = "";

    private II_O() {
        this.III = new Il_l.II();
        this.IIII = new Il_l.II();
        this.II1 = new int[64];
        this.II = new byte[64];
    }

    public static II_O II() {
        if (II == null) {
            II = new II_O();
        }
        return II;
    }

    public static II_O III() {
        return II_O.II();
    }

    @Override
    protected void II1l() {
        this.IIOI();
        this.IIII.II(new II_0(this, 100L));
        this.IIII.II(new II_o(this, 200L));
        this.IIlo();
    }

    @Override
    protected void II11() {
        this.IIOl();
        this.IIII.I_1O();
    }

    @Override
    protected void II1_() {
        this.IIII.IIlO();
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    private void IIOI() {
        this.IIo0 = IlIO.III(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6034\u601e\u60ee\u60cc\u60a1\u6089\u616f", 24502), false);
        this.IIoo = IlIO.III(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6021\u6019\u60ec\u60c5\u608c\u6080\u6167", 24502), true);
        this.Il = IlIO.III(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6021\u6019\u60ec\u60c5\u608f\u6095\u6147\u6143\u613a\u611c", 24502), false);
        this.IlI = IlIO.III(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u603e\u601e\u60e3\u60d7\u6080\u6095\u6142\u615e\u612c\u6105\u61f4", 24502), false);
        this.Il1O = IlIO.II(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6035\u6019\u60fc\u60da\u60ac\u6082\u6168\u614f", 24502), 50);
        if (this.Il1O < 50) {
            this.Il1O = 50;
        }
        if (this.Il1O > 500) {
            this.Il1O = 500;
        }
        this.IIl_ = IlIO.IIII(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6026\u6018\u60e6\u60da\u60a8\u60a0\u6162\u6159\u613d", 24502), "");
        this.Il_I();
        this.IIlO = IlIO.IIII(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6033\u601c\u60ee\u60cd\u60a6\u60a0\u6162\u6159\u613d", 24502), "");
        this.Il_l();
        this.IlIl = IlIO.III(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6030\u6005\u60fb\u60c1\u6089\u609e\u6164\u615a", 24502), false);
        this.IIl0 = IlIO.IIII(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6035\u6002\u60e0\u60de\u6081\u6085\u6178\u615e", 24502), "");
        this.Il_1();
    }

    private void Il_I() {
        this.II.I_1O();
        if (!Il_o.III1(this.IIl_)) {
            String[] stringArray = Il_o.II(this.IIl_, ';');
            for (int i = 0; i < stringArray.length; ++i) {
                try {
                    int n;
                    String string = stringArray[i].trim();
                    if (Il_o.III1(string) || this.II(this.II, n = Integer.parseInt(string))) continue;
                    this.II.III(new Integer(n));
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    private void Il_l() {
        this.III.I_1O();
        if (!Il_o.III1(this.IIlO)) {
            String[] stringArray = Il_o.II(this.IIlO, ';');
            for (int i = 0; i < stringArray.length; ++i) {
                try {
                    int n;
                    String string = stringArray[i].trim();
                    if (Il_o.III1(string) || this.II(this.III, n = Integer.parseInt(string))) continue;
                    this.III.III(new Integer(n));
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    private void Il_1() {
        this.IIII.I_1O();
        if (!Il_o.III1(this.IIl0)) {
            String[] stringArray = Il_o.II(this.IIl0, ';');
            for (int i = 0; i < stringArray.length; ++i) {
                try {
                    int n;
                    String string = stringArray[i].trim();
                    if (Il_o.III1(string) || this.II(this.IIII, n = Integer.parseInt(string))) continue;
                    this.IIII.III(new Integer(n));
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    private boolean II(Il_l.II iI, int n) {
        for (int i = 0; i < iI.IIlO(); ++i) {
            Integer n2 = (Integer)iI.II(i);
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    private void IIOl() {
        IlIO.II(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6034\u601e\u60ee\u60cc\u60a1\u6089\u616f", 24502), this.IIo0);
        IlIO.II(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6021\u6019\u60ec\u60c5\u608c\u6080\u6167", 24502), this.IIoo);
        IlIO.II(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6021\u6019\u60ec\u60c5\u608f\u6095\u6147\u6143\u613a\u611c", 24502), this.Il);
        IlIO.II(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u603e\u601e\u60e3\u60d7\u6080\u6095\u6142\u615e\u612c\u6105\u61f4", 24502), this.IlI);
        IlIO.III(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6035\u6019\u60fc\u60da\u60ac\u6082\u6168\u614f", 24502), this.Il1O);
        IlIO.IIII(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6026\u6018\u60e6\u60da\u60a8\u60a0\u6162\u6159\u613d", 24502), this.IIl_);
        IlIO.IIII(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6033\u601c\u60ee\u60cd\u60a6\u60a0\u6162\u6159\u613d", 24502), this.IIlO);
        IlIO.II(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6030\u6005\u60fb\u60c1\u6089\u609e\u6164\u615a", 24502), this.IlIl);
        IlIO.IIII(II_O.IIlI("\u5fc6\u5fbc\u5f97\u6078\u601c\u6035\u6002\u60e0\u60de\u6081\u6085\u6178\u615e", 24502), this.IIl0);
    }

    private void IIIl(String string) {
        I1_I.II.IIII(string, 0);
    }

    public void II_I() {
        String string = this.IIoo ? II_O.IIlI("\u5ff8\u5fbd\u4143\u6067\u6012\u6025\u7ed5\u60fb\u608e\u60ae\u7e4f", 24502) : (this.Il ? II_O.IIlI("\u5fe2\u5fbd\u5f91\u607c\u6012\u6035\u6011\u60e1\u60c6\u60ed\u609f\u61ea\u6149\u6121", 24502) : II_O.IIlI("\u5ffd\u5fbd\u5f00\u607d\u6055\u6071\u6008\u606e\u60cd\u60ed\u61fd\u7fc0\u6144\u6121", 24502));
        String string2 = this.II.IIlO() > 0 ? II_O.IIlI("\u5fed", 24502) + this.II.IIlO() + II_O.IIlI("\u5f96\u5fbc\u5f80\u6076\u605f\u600c", 24502) : II_O.IIlI("\u5fed\u5f81\u5f86\u7ec2\u605c\u6036\u602d", 24502);
        String string3 = this.III.IIlO() > 0 ? II_O.IIlI("\u5fed", 24502) + this.III.IIlO() + II_O.IIlI("\u5f96\u5fbc\u5f80\u6076\u605f\u600c", 24502) : II_O.IIlI("\u5fed\u5f81\u5f86\u7ec2\u605c\u6036\u602d", 24502);
        String string4 = this.IIII.IIlO() > 0 ? II_O.IIlI("\u5fed", 24502) + this.IIII.IIlO() + II_O.IIlI("\u5f96\u5fbc\u5f80\u6076\u605f\u600c", 24502) : II_O.IIlI("\u5fed\u5f81\u5f86\u7ec2\u605c\u6036\u602d", 24502);
        Il1_.II().III().II(II_O.IIlI("\u5fe2\u4124\u5fd4\u6102\u7eeb\u603f\u6017\u60af\u60c0\u60a5\u7e5b\u617f", 24502)).II(II_O.IIlI("\u5ff7\u5fa0\u5f80\u607c\u6012\u603f\u6018\u7e38\u60da", 24502), this.IIo0 ? II_O.IIlI("\u5ff4\u4178\u5f80", 24502) : II_O.IIlI("\u5fe2\u417a\u5f80", 24502), 1, null).II(II_O.IIlI("\u5ff5\u5fbd\u414b\u6033\u6123\u7e88", 24502), string, 2, null).II(II_O.IIlI("\u5ff5\u5fbd\u413d\u6033\u605c\u6039\u7ec7\u60fb\u608e\u61dc\u7e3f\u612b\u6149\u7fae\u6109\u61a7\u61c4\u7f66\u618a\u6223\u6256\u6229\u6282\u6211", 24502), this.IlI ? II_O.IIlI("\u5ff4\u4178\u5f80", 24502) : II_O.IIlI("\u5fe2\u417a\u5f80", 24502), 3, null).II(II_O.IIlI("\u5ffd\u5fbd\u5f9b\u7eb0\u605c\u6036\u6050\u60ec\u604f\u60ae\u6084", 24502), II_O.IIlI("\u5fed", 24502) + this.Il1O + II_O.IIlI("\u5fc6\u5fad\u5fa9", 24502), 4, null).II(II_O.IIlI("\u5ff7\u5fa0\u5f80\u607c\u6012\u6027\u7e99\u60fb\u608e\u61dc\u7e3f", 24502), this.IlIl ? II_O.IIlI("\u5ff4\u4178\u5f80", 24502) : II_O.IIlI("\u5fe2\u417a\u5f80", 24502), 5, null).II(II_O.IIlI("\u5ff2\u5fb4\u5f9a\u607b\u6012\u6022\u6091\u60ec\u60c6\u60ed\u6082\u6163\u7f9d\u613d", 24502), string2, 6, null).II(II_O.IIlI("\u5ff2\u5fb4\u5f9a\u607b\u6012\u6022\u6091\u60ec\u60c6\u60ed\u6087\u6163\u61de\u6127\u610f\u61a7\u61c8\u61ad\u7f53\u6277", 24502), string3, 7, null).II(II_O.IIlI("\u5ff2\u5fb4\u5f9a\u607b\u6012\u6022\u6091\u60ec\u60c6\u60ed\u609a\u7fe2\u615e", 24502), string4, 8, null).II(II_O.IIlI("\u5fe7\u5fa0\u5f95\u606a\u6012\u603d\u7ed1\u60e6", 24502), "", 999, null).II(this).I__0();
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                this.IIo0 = !this.IIo0;
                this.IIIl(II_O.IIlI("\u5ff7\u5fa0\u5f80\u607c\u6012\u601f\u6018\u7e38\u60da\u60f7\u60cc", 24502) + (this.IIo0 ? II_O.IIlI("\u5ff4\u4178\u5f80", 24502) : II_O.IIlI("\u5fe2\u417a\u5f80", 24502)));
                this.IIOl();
                this.II_I();
                break;
            }
            case 2: {
                if (this.IIoo) {
                    this.IIoo = false;
                    this.Il = true;
                } else {
                    this.IIoo = true;
                    this.Il = false;
                }
                this.IIIl(II_O.IIlI("\u5ff5\u5fbd\u414b\u6033\u6123\u7e88\u604a\u60af", 24502) + (this.IIoo ? II_O.IIlI("\u5ff8\u5fbd\u4143\u6067\u6012\u6025\u7ed5\u60fb\u608e\u60ae\u7e4f", 24502) : II_O.IIlI("\u5fe2\u5fbd\u5f91\u607c\u6012\u6035\u6011\u60e1\u60c6\u60ed\u609f\u61ea\u6149\u6121", 24502)));
                this.IIOl();
                this.II_I();
                break;
            }
            case 3: {
                this.IlI = !this.IlI;
                this.IIIl(II_O.IIlI("\u5ff5\u5fbd\u413d\u6033\u605c\u6039\u7ec7\u60fb\u608e\u61dc\u7e3f\u612b\u6149\u7fae\u6109\u61a7\u61c4\u7f66\u618a\u6223\u6256\u6229\u6282\u6211\u62a4\u629d", 24502) + (this.IlI ? II_O.IIlI("\u5ff4\u4178\u5f80", 24502) : II_O.IIlI("\u5fe2\u417a\u5f80", 24502)));
                this.IIOl();
                this.II_I();
                break;
            }
            case 4: {
                this.III(II_O.IIlI("\u5ff8\u5fbd\u4159\u6063\u6012\u603a\u6018\u60e0\u7e0d\u60a3\u608b\u612b\u6149\u61a8\u610b\u61ef\u6186\u61ed\u61d1\u6233\u620f\u6274\u6250\u624f\u62b7", 24502), II_O.IIlI("\u5ff2\u5fbc\u5f87\u6067\u6053\u603f\u6013\u60ea", 24502));
                break;
            }
            case 5: {
                this.IlIl = !this.IlIl;
                this.IIIl(II_O.IIlI("\u5ff7\u5fa0\u5f80\u607c\u6012\u6007\u7e99\u60fb\u6094\u60ed", 24502) + (this.IlIl ? II_O.IIlI("\u5ff4\u4178\u5f80", 24502) : II_O.IIlI("\u5fe2\u417a\u5f80", 24502)));
                this.IIOl();
                this.II_I();
                break;
            }
            case 6: {
                this.Il_o();
                break;
            }
            case 7: {
                this.IlO();
                break;
            }
            case 8: {
                this.IlOI();
                break;
            }
            case 999: {
                IlI.II().I_1l();
            }
        }
    }

    public void Il__() {
        this.III = new Form(II_O.IIlI("\u5ff2\u5fb4\u5f9a\u607b\u6012\u6022\u6091\u60ec\u60c6\u60ed\u6082\u6163\u7f9d\u613d", 24502));
        this.IIIO = new TextField(II_O.IIlI("\u5fff\u5f91\u5fd4\u607a\u6046\u6034\u601d\u60af\u6086\u608e\u600d\u6168\u6142\u6169\u6106\u61ef\u61c7\u61b0\u61c4\u6238\u620b", 24502), this.IIl_, 500000, 0);
        this.III.append((Item)this.IIIO);
        this.IIII = new Command(II_O.IIlI("\u5ffa\u5e65\u5f81", 24502), 4, 1);
        this.III.addCommand(this.IIII);
        this.IIIl = new Command(II_O.IIlI("\u5ffe\u5fa0\u4103", 24502), 7, 1);
        this.III.addCommand(this.IIIl);
        this.III.setCommandListener((CommandListener)this);
    }

    public void Il_O() {
        this.III = new Form(II_O.IIlI("\u5ff2\u5fb4\u5f9a\u607b\u6012\u6022\u6091\u60ec\u60c6\u60ed\u6087\u6163\u61de\u6127\u610f\u61a7\u61c8\u61ad\u7f53\u6277", 24502));
        this.IIIO = new TextField(II_O.IIlI("\u5fff\u5f91\u5fd4\u607a\u6046\u6034\u601d\u60af\u6086\u608e\u600d\u6168\u6142\u6169\u6106\u61ef\u61c7\u61b0\u61c4\u6238\u620b", 24502), this.IIlO, 500000, 0);
        this.III.append((Item)this.IIIO);
        this.IIII = new Command(II_O.IIlI("\u5ffa\u5e65\u5f81", 24502), 4, 1);
        this.III.addCommand(this.IIII);
        this.IIIl = new Command(II_O.IIlI("\u5ffe\u5fa0\u4103", 24502), 7, 1);
        this.III.addCommand(this.IIIl);
        this.III.setCommandListener((CommandListener)this);
    }

    public void Il_0() {
        this.III = new Form(II_O.IIlI("\u5ff2\u5fb4\u5f9a\u607b\u6012\u6022\u6091\u60ec\u60c6\u60ed\u609a\u7fe2\u615e", 24502));
        this.IIIO = new TextField(II_O.IIlI("\u5fff\u5f91\u5fd4\u607a\u6046\u6034\u601d\u60af\u6086\u608e\u600d\u6168\u6142\u6169\u6106\u61ef\u61c7\u61b0\u61c4\u6238\u620b", 24502), this.IIl0, 500000, 0);
        this.III.append((Item)this.IIIO);
        this.IIII = new Command(II_O.IIlI("\u5ffa\u5e65\u5f81", 24502), 4, 1);
        this.III.addCommand(this.IIII);
        this.IIIl = new Command(II_O.IIlI("\u5ffe\u5fa0\u4103", 24502), 7, 1);
        this.III.addCommand(this.IIIl);
        this.III.setCommandListener((CommandListener)this);
    }

    private void Il_o() {
        this.Il_ = 1;
        this.Il__();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.III);
    }

    private void IlO() {
        this.Il_ = 2;
        this.Il_O();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.III);
    }

    private void IlOI() {
        this.Il_ = 3;
        this.Il_0();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.III);
    }

    private void III(String string, String string2) {
        II.II.I__o();
        Ilo_.II().II00 = string;
        Ilo_.II().II.II1o = string2;
        Ilo_.II().II1o("");
        Ilo_.II().II = this;
    }

    @Override
    public void II(String string, String string2) {
        String string3 = Ilo_.II().II.IIl1();
        if (Il_o.III1(string3)) {
            this.Illl();
            return;
        }
        String string4 = Ilo_.II().II.II1o;
        if (string4.equals(II_O.IIlI("\u5ff2\u5fbc\u5f87\u6067\u6053\u603f\u6013\u60ea", 24502))) {
            this.IIll(string3);
        }
    }

    @Override
    public void Illl() {
        Ilo_ ilo_ = Ilo_.II();
        ilo_.II00 = II_O.IIlI("\u5ff5\u5fbd\u5f95\u6067", 24502);
        ilo_.II.II1o = II_O.IIlI("\u5fd5\u5fbd\u5f95\u6067", 24502);
        ilo_.II.IIOl("");
        ilo_.I_10 = false;
        ilo_.II = I1_I.II();
        ilo_.III0 = null;
        this.II_I();
        II.II.I__0();
    }

    private void IIll(String string) {
        try {
            int n = Integer.parseInt(string.trim());
            if (n < 50) {
                n = 50;
            }
            if (n > 500) {
                n = 500;
            }
            this.Il1O = n;
            this.IIIl(II_O.IIlI("\u5ffd\u5fbd\u5f9b\u7eb0\u605c\u6036\u6050\u60ec\u604f\u60ae\u6084\u612b\u6144\u6121\u7fdf\u61f3\u619c\u61e5", 24502) + this.Il1O + II_O.IIlI("\u5fc6\u5fad", 24502));
            this.IIOl();
        }
        catch (NumberFormatException numberFormatException) {
            this.IIIl(II_O.IIlI("\u5ff1\u5fbc\u5f15\u6033\u6046\u6023\u7ebb\u60af\u60c5\u60a5\u6018\u6165\u614d\u6169\u6100\u7f64\u61d6\u61e5\u6188\u7cc4\u6203\u6261\u622e\u6217\u7c33\u62cd\u62fc\u6288\u7dcb\u6319\u632c\u7d9c\u63b6\u6380\u63e4\u63de\u6427\u6401\u6460", 24502));
        }
        this.Illl();
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command == this.IIII) {
            try {
                String string = this.IIIO.getString().trim();
                if (this.Il_ == 1) {
                    this.IIl_ = string;
                    this.Il_I();
                    this.IIOl();
                    Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                    this.IIIl(II_O.IIlI("\u5ea6\u5f36\u5fd4\u607f\u6182\u6024\u6050\u60eb\u60cf\u60a3\u6084\u612b\u6159\u61a8\u610b\u61ef\u6186\u61ab\u618c\u7cb4\u6256\u627b\u6240", 24502) + this.II.IIlO() + II_O.IIlI("\u5f96\u5fbc\u5f80\u6076\u605f", 24502));
                    this.II_I();
                } else if (this.Il_ == 2) {
                    this.IIlO = string;
                    this.Il_l();
                    this.IIOl();
                    Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                    this.IIIl(II_O.IIlI("\u5ea6\u5f36\u5fd4\u607f\u6182\u6024\u6050\u60eb\u60cf\u60a3\u6084\u612b\u6159\u61a8\u610b\u61ef\u6186\u61ae\u618c\u62f7\u624c\u6226\u6240\u6211\u62f6\u7c0a\u62a8\u62c1\u633a", 24502) + this.III.IIlO() + II_O.IIlI("\u5f96\u5fbc\u5f80\u6076\u605f", 24502));
                    this.II_I();
                } else if (this.Il_ == 3) {
                    this.IIl0 = string;
                    this.Il_1();
                    this.IIOl();
                    Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                    this.IIIl(II_O.IIlI("\u5ea6\u5f36\u5fd4\u607f\u6182\u6024\u6050\u60eb\u60cf\u60a3\u6084\u612b\u6159\u61a8\u610b\u61ef\u6186\u61b3\u7f0d\u6277\u6218\u6261", 24502) + this.IIII.IIlO() + II_O.IIlI("\u5f96\u5fbc\u5f80\u6076\u605f", 24502));
                    this.II_I();
                }
            }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                II.II(II_O.IIlI("\u5ffa\u4102\u5f9d\u6033\u6059\u6039\u6019\u60af\u60c2\u617d\u6099\u6131\u610a", 24502) + exception.getMessage());
            }
        }
        if (command == this.IIIl) {
            Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
            this.II_I();
        }
    }

    public void III_(IO1l iO1l) {
        Ilol ilol;
        if (this.IIo0 && (ilol = Ilol.II()) != null) {
            iO1l.Illl(-16711936);
            int n = ilol.I_o_ - I1_I.Io1;
            int n2 = ilol.I_oO - I1_I.Io1I;
            for (int i = 0; i < 360; ++i) {
                double d = Math.toRadians(i);
                int n3 = n + (int)((double)this.Il1O * Math.cos(d));
                int n4 = n2 + (int)((double)this.Il1O * Math.sin(d));
                iO1l.III_(n3, n4, 1, 1);
            }
        }
    }

    private void IlOl() {
        Ilol ilol = Ilol.II();
        if (ilol != null) {
            int n = ilol.IOIO;
            int n2 = 21 + n;
            if (IOlO.l1oI == n2) {
                this.IlII = false;
            } else if (this.IIo0 && I1_I.II_0 != null && I1_I.II_0.size() != 0) {
                if (this.IIlI()) {
                    this.IlII = false;
                } else {
                    long l = IO10.IIII();
                    if (l - this.II1o >= 550L) {
                        Ilol ilol2 = Ilol.II();
                        int n3 = ilol2.IOI_;
                        int n4 = this.Il1O * this.Il1O;
                        boolean bl = false;
                        for (int i = I1_I.II_0.size() - 1; i >= 0; --i) {
                            int n5;
                            int n6;
                            int n7;
                            I10_ i10_ = (I10_)I1_I.II_0.elementAt(i);
                            if (i10_ == null || this.III_(i10_.II.II__)) continue;
                            if (i10_.II.II__ == 74) {
                                this.II(i10_);
                                bl = true;
                                this.IlII = true;
                                this.II1o = l;
                                return;
                            }
                            if (!this.II(i10_)) continue;
                            if (this.IlI) {
                                int n8 = n7 = i10_.IoIO == n3 || i10_.IoIO == -1 ? 1 : 0;
                                if (n7 == 0) continue;
                            }
                            if (this.III(i10_.lI0l) >= 10 || (n6 = (n7 = ilol2.I_o_ - i10_.I1) * n7 + (n5 = ilol2.I_oO - i10_.I1I) * n5) > n4) continue;
                            bl = true;
                            int n9 = (int)Math.sqrt(n6);
                            if (n9 >= 100) {
                                ilol2.I_o_ = i10_.I1;
                                I_0_.II().IoO();
                            } else if (n9 > 60 && n9 < 100) {
                                ilol2.II = new I_ll(i10_.I1, i10_.I1I);
                            }
                            this.II(i10_);
                            this.IlII = true;
                            this.II1o = l;
                            return;
                        }
                        if (!bl) {
                            this.IlII = false;
                        }
                    }
                }
            } else {
                this.IlII = false;
            }
        }
    }

    private void IlO1() {
        Ilol ilol;
        long l;
        if (this.IlIl && this.IIII.IIlO() != 0 && (l = IO10.IIII()) - this.II_ >= 800L && (ilol = Ilol.II()) != null && ilol.II != null) {
            for (int i = 0; i < ilol.II.length; ++i) {
                I101 i101 = ilol.II[i];
                if (i101 == null || !this.III1(i101.II.II__)) continue;
                I_0_.II().II((byte)2, (byte)1, (byte)i, (short)-1);
                this.II_ = l;
                this.IIIl(II_O.IIlI("\u5ea6\u5f36\u5fd4\u6065\u7edb\u6025\u604a\u60af", 24502) + i101.II.II1o);
                return;
            }
        }
    }

    private boolean III1(int n) {
        for (int i = 0; i < this.IIII.IIlO(); ++i) {
            Integer n2 = (Integer)this.IIII.II(i);
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    private boolean III_(int n) {
        for (int i = 0; i < this.III.IIlO(); ++i) {
            Integer n2 = (Integer)this.III.II(i);
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    private boolean IIlI() {
        Ilol ilol = Ilol.II();
        if (ilol != null && ilol.II != null) {
            for (int i = 0; i < ilol.II.length; ++i) {
                if (ilol.II[i] != null) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private void II(I10_ i10_) {
        I_0_ i_0_ = I_0_.II();
        if (i_0_ != null) {
            i_0_.IIo1(i10_.lI0l);
            this.III1(i10_.lI0l);
        }
    }

    private int III(int n) {
        for (int i = 0; i < 64; ++i) {
            if (this.II1[i] != n) continue;
            return this.II[i] & 0xFF;
        }
        return 0;
    }

    private void III1(int n) {
        for (int i = 0; i < 64; ++i) {
            if (this.II1[i] != n) continue;
            if (this.II[i] < 127) {
                int n2 = i;
                this.II[n2] = (byte)(this.II[n2] + 1);
            }
            return;
        }
        this.II1[this.Il1o] = n;
        this.II[this.Il1o] = 1;
        ++this.Il1o;
        if (this.Il1o >= 64) {
            this.Il1o = 0;
        }
    }

    private boolean II(I10_ i10_) {
        if (this.III_(i10_.II.II__)) {
            return false;
        }
        if (this.IIoo) {
            return true;
        }
        if (this.Il) {
            for (int i = 0; i < this.II.IIlO(); ++i) {
                Integer n = (Integer)this.II.II(i);
                if (n != i10_.II.II__) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean IIll() {
        return this.IlII;
    }

    static /* synthetic */ void II(II_O iI_O) {
        iI_O.IlOl();
    }

    static /* synthetic */ void III(II_O iI_O) {
        iI_O.IlO1();
    }

    private static /* synthetic */ String IIlI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

