package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextBox
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;

final class IOIo
implements CommandListener {
    private IOI0 IIII;
    private final TextBox II;

    IOIo(IOI0 iOI0, TextBox textBox) {
        this.IIII = iOI0;
        this.II = textBox;
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command.getLabel().equals(IO11.I_lI)) {
            this.IIII.IIOl(this.II.getString());
        }
        IOIO.II(GameMidlet.II);
        II.var_II_II.setFullScreenMode(true);
        this.IIII.IOOO = true;
    }
}

