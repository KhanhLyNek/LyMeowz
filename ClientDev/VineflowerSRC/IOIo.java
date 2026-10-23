package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;

final class IOIo implements CommandListener {
   private IOI0 IIII;
   private final TextBox II;

   IOIo(IOI0 var1, TextBox var2) {
      this.IIII = var1;
      this.II = var2;
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1.getLabel().equals(IO11.I_lI)) {
         this.IIII.IIOl(this.II.getString());
      }

      IOIO.II(GameMidlet.II);
      II.II.setFullScreenMode(true);
      this.IIII.IOOO = true;
   }
}
