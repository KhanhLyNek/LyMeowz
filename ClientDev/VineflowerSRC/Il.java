package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public final class Il implements CommandListener {
   public Form IIII;
   public Command III1;
   public Command III_;
   public TextField IIl;

   public void IlI1() {
      this.IIII = new Form(II1O("觠褢覈訠謎钉訩", 35235));
      this.IIII.append(this.IIl = new TextField(II1O("觢覒覨訠詜詟設計諸諒誸", 35235), IlI.II1l, 500000, 0));
      this.IIII.addCommand(this.III1 = new Command(II1O("觯衲覔", 35235), 4, 1));
      this.IIII.addCommand(this.III_ = new Command(II1O("觫覷霖", 35235), 7, 1));
      this.IIII.setCommandListener(this);
   }

   public final void I_lI() {
      this.IlI1();
      Display.getDisplay(GameMidlet.II).setCurrent(this.IIII);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == this.III1) {
         try {
            IlI.II1l = this.IIl.getString().trim();
            IlIO.IIII(II1O("觨覧覘詃詾詎訞訔諺誔誘誈譾譣謧謘", 35235), IlI.II1l);
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            I1_I.II.IIII(II1O("袳褡见詬讯詋詽訷諾諃誚誙譧譂謶謜诲", 35235), 0);
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            I1_I.II.IIII(II1O("觯霕覈訠詴詖訴詜諷謊説", 35235), 0);
         }
      }

      if (var1 == this.III_) {
         Display.getDisplay(GameMidlet.II).setCurrent(II.II);
      }
   }

   static {
      IlI.II1l = IlIO.IIII(II1O("觨覧覘詃詾詎訞訔諺誔誘誈譾譣謧謘", 35235), "");
   }
}
