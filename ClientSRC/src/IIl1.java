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
public class IIl1
extends IIII
implements I1_1,
CommandListener {
    private static IIl1 II;
    private IlI0 II;
    private IlI0.II II = new IlI0();
    public Form III;
    public Command IIII;
    public Command IIIl;
    public TextField III;
    public TextField IIII;
    private boolean IIO_ = false;
    private String III0 = "";
    private int IlIl = 5000;
    private int IlI1 = 0;
    private String[] III = new String[0];
    private String IIIo = "";

    private IIl1() {
    }

    public static IIl1 II() {
        if (II == null) {
            II = new IIl1();
        }
        return II;
    }

    public static IIl1 III() {
        return IIl1.II();
    }

    @Override
    protected void II1l() {
        this.IIOI();
        this.II01();
        this.IIlo();
    }

    @Override
    protected void II11() {
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

    private void II01() {
        if (this.II != null) {
            this.II.III(this.II);
        }
        this.II = new IIl_(this, this.IlIl);
        this.II.II(this.II);
    }

    private void II0_() {
        if (!this.III0.equals(this.IIIo)) {
            if (!Il_o.III1(this.III0)) {
                this.III = Il_o.II(this.III0, ';');
                for (int i = 0; i < this.III.length; ++i) {
                    this.III[i] = this.III[i].trim();
                }
            } else {
                this.III = new String[0];
            }
            this.IIIo = this.III0;
            this.IlI1 = 0;
        }
    }

    public void II_I() {
        String string = this.IIO_ ? IIl1.III1("\u3dbf\u20b1\u3e4f", 15869) : IIl1.III1("\u3da9\u20b3\u3e4f", 15869);
        String string2 = this.III.length > 0 ? IIl1.III1("\u3da6", 15869) + this.III.length + IIl1.III1("\u3ddd\u3e68\u3e52\u3e34\u3e59\u3ef6\u3edf\u2079\u3e9b\u3f49", 15869) : IIl1.III1("\u3da6\u3e5f\u3e53\u3fea\u3e18\u3eb8\u3ed4\u3e25\u3ea8", 15869);
        Il1_.II().III().II(IIl1.III1("\u3dbe\u3e74\u3e5a\u3e2e\u3e59\u3eec\u3edf\u3f66\u2028\u3f7a\u3f54", 15869)).II(IIl1.III1("\u3da9\u20ed\u3e1b\u3f4b\u20a0\u3ef6\u3ed0\u3ef6\u3e96\u3f7c\u3f52\u3f26", 15869), string, 1, null).II(IIl1.III1("\u3da9\u3ee5\u3e42\u3e7a\u3e1a\u3ef0\u207e\u3eb8\u3e9d", 15869), string2, 2, null).II(IIl1.III1("\u3dac\u3e69\u3e5a\u3e23\u3e59\u3ef4\u2016\u3ebf", 15869), "", 99, null).II(this).I__0();
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                this.II0O();
                break;
            }
            case 2: {
                this.II0o();
                break;
            }
            case 99: {
                IlI.II().I_1l();
            }
        }
    }

    private void II0O() {
        boolean bl = this.IIO_ = !this.IIO_;
        if (this.IIO_) {
            this.II0_();
            if (this.III.length == 0) {
                this.IIIl(IIl1.III1("\u3dbe\u3e74\u3f8b\u3e3b\u3e59\u3efb\u3e44\u3ef6\u3e9b\u21cd\u3f5a\u3f72\u3f15\u3fe5\u3fc1\u3fa9\u3fcd\u406f\u4043\u402b\u401d\u40a9\u4087\u4090\u4090\u416d\u4103\u412e\u4193\u41ee\u41f8\u419e\u41a9\u4105\u4262\u421a\u423a\u4210\u5c5e\u42d8\u42bd\u42d4\u4367\u4340\u42e1\u5dab\u43ec", 15869));
                this.IIO_ = false;
            } else {
                this.IIIl(IIl1.III1("\u3dbc\u3e69\u3e4f\u3e35\u3e59\u3edb\u3edf\u3eb7\u3e81\u3f2e\u3f13\u3f10\u21dc\u3fe4\u3f8f\u3f95", 15869) + this.III.length + IIl1.III1("\u3ddd\u3e68\u3e52\u3e34\u3e59\u3ef6\u3edf\u2079\u3e9b\u3f38\u3f13\u3f36\u3f14\u3ffc\u3fce\u3fb7\u3fcd", 15869) + this.IlIl + IIl1.III1("\u3d90\u3e6f\u3e66", 15869));
            }
        } else {
            this.IIIl(IIl1.III1("\u3dbc\u3e69\u3e4f\u3e35\u3e59\u3edb\u3edf\u3eb7\u3e81\u3f2e\u3f13\u3f06\u21de\u3fe4", 15869));
        }
        this.IIOl();
        this.II_I();
    }

    public void II00() {
        this.III = new Form(IIl1.III1("\u3da9\u3ee5\u3e42\u3e7a\u3e1a\u3ef0\u207e\u3eb8\u3e9d\u3f34\u3f72\u3f27\u3f05\u3fff\u3f8f\u3f8d\u3f85\u406d\u405f", 15869));
        this.III = new TextField(IIl1.III1("\u3db3\u20c5\u3e52\u3e7a\u3e1d\u3eed\u3ed9\u3eb1\u3ed5\u3f77\u3f5b\u3f33\u3f05\u3fb0\u3f87\u3f8d\u3f0c\u406f\u4043\u406a\u4007\u40e0\u40c6\u40b3\u40c5\u413f\u410a", 15869), this.III0, 500000, 0);
        this.III.append((Item)this.III);
        this.IIII = new TextField(IIl1.III1("\u3db9\u3e79\u3e57\u3e3b\u3e00\u3eb8\u3ed4\u3ebe\u3e94\u3f60\u3f13\u3f7a\u3f4f\u3fad\u3f8f\u3ffb\u3fdd\u403c\u401b\u4063", 15869), String.valueOf(this.IlIl), 500, 2);
        this.III.append((Item)this.IIII);
        this.IIII = new Command(IIl1.III1("\u3db1\u3fac\u3e4e", 15869), 4, 1);
        this.III.addCommand(this.IIII);
        this.IIIl = new Command(IIl1.III1("\u3db5\u3e69\u20cc", 15869), 7, 1);
        this.III.addCommand(this.IIIl);
        this.III.setCommandListener((CommandListener)this);
    }

    private void II0o() {
        this.II00();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.III);
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command == this.IIII) {
            try {
                String string = this.III.getString().trim();
                String string2 = this.IIII.getString().trim();
                int n = Integer.parseInt(string2);
                if (n < 5000) {
                    Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                    II.II(IIl1.III1("\u3db9\u3e79\u3e57\u3e3b\u3e00\u3eb8\u3ec7\u3ebe\u2056\u3f7d\u3f13\u3f6c\u3f4c\u3fb0\u3f9a\u3ffe\u3fdd\u403c\u4046\u4039", 15869));
                    return;
                }
                this.III0 = string;
                this.IlIl = n;
                this.II0_();
                this.II01();
                this.IIOl();
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                this.IIIl(IIl1.III1("\u3ced\u3eff\u3e1b\u3e36\u3fc9\u3eed\u3e8d\u3ef6", 15869) + this.III.length + IIl1.III1("\u3ddd\u3e68\u3e52\u3e34\u3e59\u3ef6\u3edf\u2079\u3e9b\u3f38\u3f13\u3f36\u3f14\u3ffc\u3fce\u3fb7\u3fcd", 15869) + this.IlIl + IIl1.III1("\u3d90\u3e6f", 15869));
                this.II_I();
            }
            catch (NumberFormatException numberFormatException) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                II.II(IIl1.III1("\u3db1\u20cb\u3e52\u3e60\u3e59\u3edc\u3ed2\u3eba\u3e94\u3f6d\u3f13\u3f22\u3f19\u2133\u3fc6\u3fee\u3f81\u40ec\u400b\u4039\u5eb8\u40a8\u4099\u40fb\u40c5\u4131\u4113\u4172\u4151", 15869));
            }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
                II.II(IIl1.III1("\u3db1\u20cb\u3e52\u3e7a\u3e12\u3ef0\u3ede\u3ef6\u3e99\u3ea4\u3f46\u3f72\u3f12\u3f70\u3fc6\u3fee\u3efc\u5ebb\u405f\u4070\u4049", 15869) + exception.getMessage());
            }
        }
        if (command == this.IIIl) {
            Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.II);
            this.II_I();
        }
    }

    private void IIo() {
        I_0_ i_0_;
        String string;
        if (this.III.length == 0) {
            return;
        }
        this.II0_();
        if (this.IlI1 >= this.III.length) {
            this.IlI1 = 0;
        }
        if (!Il_o.III1(string = this.III[this.IlI1]) && (i_0_ = I_0_.II()) != null) {
            i_0_.II_1(string.trim());
        }
        ++this.IlI1;
    }

    private void IIIl(String string) {
        I1_I.II.IIII(string, 0);
    }

    private void IIOI() {
        this.IIO_ = IlIO.III(IIl1.III1("\u3d9c\u3e69\u3e4f\u3e35\u3e1a\u3ef0\u3ed6\u3ea2\u3edb\u3f71\u3f5d\u3f33\u3f13\u3ffc\u3fca\u3faa", 15869), false);
        this.III0 = IlIO.IIII(IIl1.III1("\u3d9c\u3e69\u3e4f\u3e35\u3e1a\u3ef0\u3ed6\u3ea2\u3edb\u3f77\u3f5c\u3f3c\u3f05\u3ff5\u3fc1\u3fba", 15869), "");
        this.IlIl = IlIO.II(IIl1.III1("\u3d9c\u3e69\u3e4f\u3e35\u3e1a\u3ef0\u3ed6\u3ea2\u3edb\u3f70\u3f56\u3f3e\u3f10\u3fe9", 15869), 5000);
        if (this.IlIl < 5000) {
            this.IlIl = 5000;
        }
        this.II0_();
    }

    private void IIOl() {
        IlIO.II(IIl1.III1("\u3d9c\u3e69\u3e4f\u3e35\u3e1a\u3ef0\u3ed6\u3ea2\u3edb\u3f71\u3f5d\u3f33\u3f13\u3ffc\u3fca\u3faa", 15869), this.IIO_);
        IlIO.IIII(IIl1.III1("\u3d9c\u3e69\u3e4f\u3e35\u3e1a\u3ef0\u3ed6\u3ea2\u3edb\u3f77\u3f5c\u3f3c\u3f05\u3ff5\u3fc1\u3fba", 15869), this.III0);
        IlIO.III(IIl1.III1("\u3d9c\u3e69\u3e4f\u3e35\u3e1a\u3ef0\u3ed6\u3ea2\u3edb\u3f70\u3f56\u3f3e\u3f10\u3fe9", 15869), this.IlIl);
    }

    static /* synthetic */ boolean II(IIl1 iIl1) {
        return iIl1.IIO_;
    }

    static /* synthetic */ void II(IIl1 iIl1) {
        iIl1.IIo();
    }

    private static /* synthetic */ String III1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

