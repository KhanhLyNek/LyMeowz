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
public class III_
extends IIII
implements I1_1,
CommandListener {
    private static III_ II;
    private IlI0 II;
    public Form II;
    public Command II;
    public Command III;
    public TextField II;
    private boolean II__ = false;
    private int II01 = 0;
    private int II0_ = -1;
    private long IIlI = 0L;
    public int II0O = -1;
    public boolean II_O = false;
    public int II00 = 0;
    public boolean II_0 = false;
    public boolean II_o = false;
    public boolean IIO = false;
    private String IIIO = "";
    private String[] II = new String[0];

    private III_() {
    }

    public static III_ II() {
        if (II == null) {
            II = new III_();
        }
        return II;
    }

    public static III_ III() {
        return III_.II();
    }

    @Override
    protected void II1l() {
        this.IIOI();
        this.II.II(new IIIO(this, 200L));
        this.II.II(new III0(this, 500L));
        this.II.II(new IIIo(this, 200L));
        this.II.II(new IIl(this, 100L));
        this.IIlo();
    }

    @Override
    protected void II11() {
        this.IIO();
        this.IIOl();
        this.II.I_1O();
    }

    @Override
    protected void II1_() {
        this.II.IIlO();
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    private void II_() {
        if (!Il_o.III1(this.IIIO)) {
            this.II = Il_o.II(this.IIIO, ';');
            for (int i = 0; i < this.II.length; ++i) {
                this.II[i] = this.II[i].trim();
            }
        } else {
            this.II = new String[0];
        }
    }

    public void II_I() {
        String string = this.II.length > 0 ? III_.IIIl("\u500e", 20565) + this.II.length + III_.IIIl("\u5075\u5016\u50fc\u50c1\u50a2\u50ad", 20565) : III_.IIIl("\u500e\u5020\u4e36\u50c6\u50f1\u5093\u4fac\u5173", 20565);
        Il1_.II().III().II(III_.IIIl("\u5014\u5001\u50e7\u50dd\u50f1\u50b2\u5160\u515d\u513e", 20565)).II(III_.IIIl("\u5011\u5086\u50b3\u50d0\u50be\u5083\u517c", 20565), this.II__ ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565), 1, null).II(III_.IIIl("\u5001\u509e\u50fd\u5092\u50b3\u509f\u517c\u515d\u516d\u510f\u4f2c\u51c4\u51e9\u518c\u52f5", 20565), string, 2, null).II(III_.IIIl("\u5014\u5001\u50e7\u50dd\u50f1\u5097\u5166\u5143\u516d\u510e\u51e4\u51d9\u51ba", 20565), this.II_0 ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565), 3, null).II(III_.IIIl("\u5014\u5001\u50e7\u50dd\u50f1\u5094\u4fc4\u514d\u5125\u514c\u51ff\u51c2\u51ac\u5187\u5227\u5244\u522a\u5217\u52f0", 20565), this.II_o ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565), 4, null).II(III_.IIIl("\u5014\u5001\u50e7\u50dd\u50f1\u5084\u4faa\u5140\u516d\u510f\u517f\u51c4\u51ae\u51c8\u5265\u5249\u5236\u5217", 20565), this.IIO ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565), 5, null).II(III_.IIIl("\u5004\u5001\u50f2\u50cb\u50f1\u509c\u4fae\u5147", 20565), "", 99, null).II(this).I__0();
    }

    private void IIIl(String string) {
        I1_I.II.IIII(string, 0);
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                boolean bl = this.II__ = !this.II__;
                if (!this.II__) {
                    this.IIO();
                }
                this.IIIl(III_.IIIl("\u5011\u5086\u50b3\u50d0\u50be\u5083\u517c\u5114\u516d", 20565) + (this.II__ ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565)));
                this.II_I();
                break;
            }
            case 2: {
                this.II_1();
                break;
            }
            case 3: {
                this.II_0 = !this.II_0;
                this.IIIl(III_.IIIl("\u5014\u5001\u50e7\u50dd\u50f1\u5097\u5166\u5143\u516d\u510e\u51e4\u51d9\u51ba\u51d2\u5227", 20565) + (this.II_0 ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565)));
                this.II_I();
                break;
            }
            case 4: {
                this.II_o = !this.II_o;
                this.IIIl(III_.IIIl("\u5014\u5001\u50e7\u50dd\u50f1\u5094\u4fc4\u514d\u5125\u514c\u51ff\u51c2\u51ac\u5187\u5227\u5244\u522a\u5217\u52f0\u5298\u52e1", 20565) + (this.II_o ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565)));
                this.II_I();
                break;
            }
            case 5: {
                boolean bl = this.IIO = !this.IIO;
                if (this.IIO) {
                    Ilol.II().IIII = null;
                    Ilol.II().II = null;
                    Ilol.II().II = null;
                    this.II_o = true;
                    this.II_0 = true;
                } else {
                    this.II_o = false;
                }
                this.IIIl(III_.IIIl("\u5014\u5001\u50e7\u50dd\u50f1\u5084\u4faa\u5140\u516d\u510f\u517f\u51c4\u51ae\u51c8\u5265\u5249\u5236\u5217\u52b9\u5282", 20565) + (this.IIO ? III_.IIIl("\u5017\u4ed9\u50e7", 20565) : III_.IIIl("\u5001\u4edb\u50e7", 20565)));
                this.II_I();
                break;
            }
            case 99: {
                IlI.III().I_1l();
            }
        }
    }

    public void II_l() {
        this.II = new Form(III_.IIIl("\u5001\u508d\u50ea\u5092\u50b2\u5098\u4fc6\u5140\u5125\u514c\u51ff\u5140\u51a7\u51c8\u5245\u5249\u5236\u5217", 20565));
        this.II = new TextField(III_.IIIl("\u5001\u509e\u50fd\u5092\u50b3\u509f\u517c\u515d\u516d\u5144\u51c8\u514b\u51aa\u5180\u5227\u5248\u522d\u5205\u52f6\u5282\u52fa\u52c9", 20565), this.IIIO, 500000, 0);
        this.II.append((Item)this.II);
        this.II = new Command(III_.IIIl("\u5019\u51c4\u50e6", 20565), 4, 1);
        this.III = new Command(III_.IIIl("\u501d\u5001\u4e64", 20565), 3, 1);
        this.II.addCommand(this.II);
        this.II.addCommand(this.III);
        this.II.setCommandListener((CommandListener)this);
    }

    private void II_1() {
        this.II_l();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.II);
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command == this.II) {
            try {
                String string;
                this.IIIO = string = this.II.getString().trim();
                this.II_();
                this.IIOl();
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                if (this.II.length > 0) {
                    this.IIIl(III_.IIIl("\u5145\u5097\u50b3\u50de\u5161\u5085\u5135\u510e", 20565) + this.II.length + III_.IIIl("\u5075\u5000\u5079\u50dc\u50f1\u5092\u5160\u515d\u513e", 20565));
                } else {
                    this.IIIl(III_.IIIl("\u5145\u5097\u50b3\u50ca\u5022\u5091\u512f\u514a\u512c\u5102\u51e3\u518a\u51ba\u5109\u5264\u524e\u5265\u5249\u52a3\u52e6\u5233\u52c0\u528b\u4dbb\u5349\u537c\u5318\u4d39\u5399\u53ba\u5398\u5465\u5446", 20565));
                }
                this.II_I();
            }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                II.II(III_.IIIl("\u5019\u4ea3\u50fa\u5092\u50ba\u5098\u5166\u510e\u5121\u50dc\u51fe\u518a\u51aa\u5108\u526e\u5206\u5354\u4cd3\u52f7\u5298\u52e1", 20565) + exception.getMessage());
            }
        }
        if (command == this.III) {
            Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
            this.II_I();
        }
    }

    public static boolean II(Ilol ilol) {
        if (!(ilol == null || ilol.IIO1 == null || Il_o.III1(ilol.IIO1) || ilol.I_ || ilol.I_I || ilol.IOl_ <= 0 || ilol.IIO1.equals(III_.IIIl("\u5001\u5006\u4e5e\u50dc\u50b6\u50d0\u517b\u51ce\u5124", 20565)) || ilol.IIO1.startsWith(III_.IIIl("\u5017\u5006\u50fc\u50de\u50a8", 20565)) || ilol.IIO1.startsWith(III_.IIIl("\u5076", 20565)) || ilol.IIO1.startsWith(III_.IIIl("\u5071", 20565)))) {
            char c = ilol.IIO1.charAt(0);
            return Character.isUpperCase(c);
        }
        return false;
    }

    private boolean III(Ilol ilol) {
        if (!III_.II(ilol)) {
            return false;
        }
        if (this.II.length == 0) {
            return true;
        }
        for (int i = 0; i < this.II.length; ++i) {
            if (Il_o.III1(this.II[i]) || ilol.IIO1.indexOf(this.II[i]) < 0) continue;
            return true;
        }
        return false;
    }

    private void II__() {
        try {
            Ilol ilol = Ilol.II();
            if (ilol == null) {
                return;
            }
            if (IOlO.l1oI != this.II0O) {
                this.II0O = IOlO.l1oI;
                this.II01 = 0;
            }
            switch (this.II01) {
                case 0: {
                    if (IOlO.l1oI != 23 && IOlO.l1oI != 21 && IOlO.l1oI != 22 && IOlO.l1oI != 47 && IOlO.l1oI != 48 && IOlO.l1oI != 50 && IOlO.l1oI != 116) {
                        if (this.III_()) {
                            this.IIIl(III_.IIIl("\u5145\u5097\u50b3\u50c6\u503d\u509d\u512f\u515a\u5125\u4fc9\u51f2\u518a\u51ab\u5187\u5274\u5255\u5264", 20565));
                            this.II__ = false;
                            break;
                        }
                        Il_0.I_oI();
                        this.II0_ = IOlO.l1ol + 1;
                        this.II_O = true;
                        I_0_.II().IoOI();
                        this.II01 = -1;
                        break;
                    }
                    this.II__ = false;
                    this.IIIl(III_.IIIl("\u5018\u5015\u50e3\u5092\u50ba\u5098\u51fb\u5140\u512a\u514c\u51ff\u51c2\u4f0a\u51c8\u5263\u52d4\u5265\u5206\u52ec\u52d1\u52b2\u52c1", 20565));
                    break;
                }
                case -1: {
                    if (this.II_O) break;
                    this.II00 = I1_I.II().IlOI != null ? I1_I.II().IlOI.length - 1 : 0;
                    this.II01 = 1;
                    break;
                }
                case 1: {
                    if (this.II0_ <= this.II00 && !Ilol.II().I_I_) {
                        I_0_.II().II0O(this.II0_);
                        this.IIlI = IO10.IIII() + 1500L;
                        this.II01 = 2;
                        break;
                    }
                    this.II__ = false;
                    break;
                }
                case 2: {
                    if (IO10.IIII() < this.IIlI) break;
                    if (IOlO.l1ol != this.II0_) {
                        I_0_.II().II0O(this.II0_);
                        this.IIlI = IO10.IIII() + 1500L;
                        break;
                    }
                    this.II01 = 3;
                    break;
                }
                case 3: {
                    if (this.III_()) {
                        this.IIIl(III_.IIIl("\u5145\u5097\u50b3\u50c6\u503d\u509d\u512f\u515a\u5125\u4fc9\u51f2\u518a\u51ab\u5187\u5274\u5255\u5264", 20565));
                        this.II__ = false;
                        break;
                    }
                    long l = 200L;
                    this.IIlI = IO10.IIII() + l;
                    this.II01 = 4;
                    break;
                }
                case 4: {
                    if (IO10.IIII() < this.IIlI) break;
                    ++this.II0_;
                    this.II01 = 1;
                }
            }
        }
        catch (Exception exception) {
            this.IIIl(III_.IIIl("\u5016\u5087\u50b3\u50de\u4e06\u5099\u512f\u5156\u4fee\u5115\u51ab\u51d8\u51a8\u51c9", 20565));
            this.II__ = false;
        }
    }

    private void II_O() {
        Ilol ilol = Ilol.II();
        if (ilol == null || I1_I.II_O == null) {
            return;
        }
        Ilol ilol2 = null;
        long l = Long.MAX_VALUE;
        for (int i = 0; i < I1_I.II_O.size(); ++i) {
            Ilol ilol3 = (Ilol)I1_I.II_O.elementAt(i);
            if (!this.III(ilol3) || (long)ilol3.IOl_ >= l) continue;
            l = ilol3.IOl_;
            ilol2 = ilol3;
        }
        if (ilol2 != null) {
            ilol.II = null;
            ilol.IIIl = ilol2;
            ilol.IIII = null;
        }
    }

    private void II_0() {
        int n;
        Ilol ilol = null;
        long l = Long.MAX_VALUE;
        for (n = 0; n < I1_I.II_O.size(); ++n) {
            Ilol ilol2 = (Ilol)I1_I.II_O.elementAt(n);
            if (!this.III(ilol2) || ilol2.I_o_ <= 10 || ilol2.I_o_ >= IOlO.IIO() - 10 || ilol2.I_oO >= IOlO.IIOI() - 10 || (long)ilol2.IOl_ >= l) continue;
            l = ilol2.IOl_;
            ilol = ilol2;
        }
        if (ilol != null && !Ilol.II().I_I_) {
            Ilol.II().IIIl = ilol;
            n = ilol.I_o_ - Ilol.II().I_o_;
            int n2 = ilol.I_oO - Ilol.II().I_oO;
            double d = Math.sqrt(n * n + n2 * n2);
            if (d > 30.0) {
                Il_0.III1(ilol.I_o_, ilol.I_oO);
            }
        }
    }

    private void II_o() {
        int n;
        Ilol ilol = Ilol.II();
        if (ilol == null) {
            return;
        }
        Ilol ilol2 = null;
        long l = Long.MAX_VALUE;
        for (n = 0; n < I1_I.II_O.size(); ++n) {
            Ilol ilol3 = (Ilol)I1_I.II_O.elementAt(n);
            if (!this.III(ilol3) || (long)ilol3.IOl_ >= l) continue;
            l = ilol3.IOl_;
            ilol2 = ilol3;
        }
        if (ilol2 != null && !Ilol.II().I_I_) {
            Ilol.II().IIIl = ilol2;
            n = ilol2.I_o_ - Ilol.II().I_o_;
            int n2 = ilol2.I_oO - Ilol.II().I_oO;
            double d = Math.sqrt(n * n + n2 * n2);
            if (d <= 100.0) {
                try {
                    if (!Ilol.II().I_I1) {
                        I_lO i_lO = new I_lO("");
                        i_lO.addElement(Ilol.II().IIIl);
                        I_0_.II().II(new I_lO(""), i_lO, 2);
                        Ilol.II().IOl1 -= Ilol.II().II.l1O;
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    public void IIO() {
        this.II__ = false;
        this.II01 = 0;
    }

    public boolean III_() {
        if (I1_I.II_O == null) {
            return false;
        }
        for (int i = 0; i < I1_I.II_O.size(); ++i) {
            Ilol ilol = (Ilol)I1_I.II_O.elementAt(i);
            if (!this.III(ilol) || ilol.I_o_ >= IOlO.IIO() - 10 || ilol.I_oO >= IOlO.IIOI() - 10) continue;
            return true;
        }
        return false;
    }

    private void IIOI() {
        this.IIIO = IlIO.IIII(III_.IIIl("\u5034\u5001\u50e7\u50dd\u50b3\u509f\u517c\u515d\u5163\u510e\u51e4\u51d9\u51ba\u5186\u5266\u524b\u5220\u5217", 20565), "");
        this.II_();
    }

    private void IIOl() {
        IlIO.IIII(III_.IIIl("\u5034\u5001\u50e7\u50dd\u50b3\u509f\u517c\u515d\u5163\u510e\u51e4\u51d9\u51ba\u5186\u5266\u524b\u5220\u5217", 20565), this.IIIO);
    }

    static /* synthetic */ boolean II(III_ iII_) {
        return iII_.II__;
    }

    static /* synthetic */ void II(III_ iII_) {
        iII_.II__();
    }

    static /* synthetic */ void III(III_ iII_) {
        iII_.II_O();
    }

    static /* synthetic */ void IIII(III_ iII_) {
        iII_.II_0();
    }

    static /* synthetic */ void IIIl(III_ iII_) {
        iII_.II_o();
    }

    private static /* synthetic */ String IIIl(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

