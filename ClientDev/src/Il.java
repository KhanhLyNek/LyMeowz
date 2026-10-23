package main;

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

public final class Il
implements CommandListener {
    public Form IIII;
    public Command III1;
    public Command III_;
    public TextField IIl;

    public void IlI1() {
        this.IIII = new Form(Il.II1O("\u89e0\u8922\u8988\u8a20\u8b0e\u9489\u8a29", 35235));
        this.IIl = new TextField(Il.II1O("\u89e2\u8992\u89a8\u8a20\u8a5c\u8a5f\u8a2d\u8a08\u8af8\u8ad2\u8ab8", 35235), IlI.II1l, 500000, 0);
        this.IIII.append((Item)this.IIl);
        this.III1 = new Command(Il.II1O("\u89ef\u8872\u8994", 35235), 4, 1);
        this.IIII.addCommand(this.III1);
        this.III_ = new Command(Il.II1O("\u89eb\u89b7\u9716", 35235), 7, 1);
        this.IIII.addCommand(this.III_);
        this.IIII.setCommandListener((CommandListener)this);
    }

    public final void I_lI() {
        this.IlI1();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.IIII);
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command == this.III1) {
            try {
                IlI.II1l = this.IIl.getString().trim();
                IlIO.void_IIII(Il.II1O("\u89e8\u89a7\u8998\u8a43\u8a7e\u8a4e\u8a1e\u8a14\u8afa\u8a94\u8a98\u8a88\u8b7e\u8b63\u8b27\u8b18", 35235), IlI.II1l);
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
                I1_I.var_I1Oo_II.IIII(Il.II1O("\u88b3\u8921\u89c1\u8a6c\u8baf\u8a4b\u8a7d\u8a37\u8afe\u8ac3\u8a9a\u8a99\u8b67\u8b42\u8b36\u8b1c\u8bf2", 35235), 0);
            }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
                I1_I.var_I1Oo_II.IIII(Il.II1O("\u89ef\u9715\u8988\u8a20\u8a74\u8a56\u8a34\u8a5c\u8af7\u8b0a\u8aac", 35235), 0);
            }
        }
        if (command == this.III_) {
            Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
        }
    }

    static {
        IlI.II1l = IlIO.java_lang_String_IIII(Il.II1O("\u89e8\u89a7\u8998\u8a43\u8a7e\u8a4e\u8a1e\u8a14\u8afa\u8a94\u8a98\u8a88\u8b7e\u8b63\u8b27\u8b18", 35235), "");
    }

    private static /* synthetic */ String II1O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

