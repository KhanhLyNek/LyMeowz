package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public class IIl1 extends IIII implements I1_1, CommandListener {
   private static IIl1 II;
   private IlI0 II = new IlI0();
   private IlI0.II II;
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
      return II();
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

            for (int var1 = 0; var1 < this.III.length; var1++) {
               this.III[var1] = this.III[var1].trim();
            }
         } else {
            this.III = new String[0];
         }

         this.IIIo = this.III0;
         this.IlI1 = 0;
      }
   }

   public void II_I() {
      String var1 = this.IIO_ ? III1("㶿₱㹏", 15869) : III1("㶩₳㹏", 15869);
      String var2 = this.III.length > 0 ? III1("㶦", 15869) + this.III.length + III1("㷝㹨㹒㸴㹙㻶㻟⁹㺛㽉", 15869) : III1("㶦㹟㹓㿪㸘㺸㻔㸥㺨", 15869);
      Il1_.II()
         .III()
         .II(III1("㶾㹴㹚㸮㹙㻬㻟㽦\u2028㽺㽔", 15869))
         .II(III1("㶩⃭㸛㽋₠㻶㻐㻶㺖㽼㽒㼦", 15869), var1, 1, null)
         .II(III1("㶩㻥㹂㹺㸚㻰⁾㺸㺝", 15869), var2, 2, null)
         .II(III1("㶬㹩㹚㸣㹙㻴‖㺿", 15869), "", 99, null)
         .II(this)
         .I__0();
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            this.II0O();
            break;
         case 2:
            this.II0o();
            break;
         case 99:
            IlI.II().I_1l();
      }
   }

   private void II0O() {
      this.IIO_ = !this.IIO_;
      if (this.IIO_) {
         this.II0_();
         if (this.III.length == 0) {
            this.IIIl(III1("㶾㹴㾋㸻㹙㻻㹄㻶㺛⇍㽚㽲㼕㿥㿁㾩㿍䁯䁃䀫䀝䂩䂇䂐䂐䅭䄃䄮䆓䇮䇸䆞䆩䄅䉢䈚䈺䈐属䋘䊽䋔䍧䍀䋡嶫䏬", 15869));
            this.IIO_ = false;
         } else {
            this.IIIl(III1("㶼㹩㹏㸵㹙㻛㻟㺷㺁㼮㼓㼐⇜㿤㾏㾕", 15869) + this.III.length + III1("㷝㹨㹒㸴㹙㻶㻟⁹㺛㼸㼓㼶㼔㿼㿎㾷㿍", 15869) + this.IlIl + III1("㶐㹯㹦", 15869));
         }
      } else {
         this.IIIl(III1("㶼㹩㹏㸵㹙㻛㻟㺷㺁㼮㼓㼆⇞㿤", 15869));
      }

      this.IIOl();
      this.II_I();
   }

   public void II00() {
      this.III = new Form(III1("㶩㻥㹂㹺㸚㻰⁾㺸㺝㼴㽲㼧㼅㿿㾏㾍㾅䁭䁟", 15869));
      this.III.append(this.III = new TextField(III1("㶳\u20c5㹒㹺㸝㻭㻙㺱㻕㽷㽛㼳㼅㾰㾇㾍㼌䁯䁃䁪䀇䃠䃆䂳䃅䄿䄊", 15869), this.III0, 500000, 0));
      this.III.append(this.IIII = new TextField(III1("㶹㹹㹗㸻㸀㺸㻔㺾㺔㽠㼓㽺㽏㾭㾏㿻㿝䀼䀛䁣", 15869), String.valueOf(this.IlIl), 500, 2));
      this.III.addCommand(this.IIII = new Command(III1("㶱㾬㹎", 15869), 4, 1));
      this.III.addCommand(this.IIIl = new Command(III1("㶵㹩\u20cc", 15869), 7, 1));
      this.III.setCommandListener(this);
   }

   private void II0o() {
      this.II00();
      Display.getDisplay(GameMidlet.II).setCurrent(this.III);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == this.IIII) {
         try {
            String var3 = this.III.getString().trim();
            String var4 = this.IIII.getString().trim();
            int var5 = Integer.parseInt(var4);
            if (var5 < 5000) {
               Display.getDisplay(GameMidlet.II).setCurrent(II.II);
               II.II(III1("㶹㹹㹗㸻㸀㺸㻇㺾⁖㽽㼓㽬㽌㾰㾚㿾㿝䀼䁆䀹", 15869));
               return;
            }

            this.III0 = var3;
            this.IlIl = var5;
            this.II0_();
            this.II01();
            this.IIOl();
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            this.IIIl(III1("㳭㻿㸛㸶㿉㻭㺍㻶", 15869) + this.III.length + III1("㷝㹨㹒㸴㹙㻶㻟⁹㺛㼸㼓㼶㼔㿼㿎㾷㿍", 15869) + this.IlIl + III1("㶐㹯", 15869));
            this.II_I();
         } catch (NumberFormatException var6) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            II.II(III1("㶱\u20cb㹒㹠㹙㻜㻒㺺㺔㽭㼓㼢㼙ℳ㿆㿮㾁䃬䀋䀹庸䂨䂙䃻䃅䄱䄓䅲䅑", 15869));
         } catch (Exception var7) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            II.II(III1("㶱\u20cb㹒㹺㸒㻰㻞㻶㺙㺤㽆㽲㼒㽰㿆㿮㻼庻䁟䁰䁉", 15869) + var7.getMessage());
         }
      }

      if (var1 == this.IIIl) {
         Display.getDisplay(GameMidlet.II).setCurrent(II.II);
         this.II_I();
      }
   }

   private void IIo() {
      if (this.III.length != 0) {
         this.II0_();
         if (this.IlI1 >= this.III.length) {
            this.IlI1 = 0;
         }

         String var1 = this.III[this.IlI1];
         if (!Il_o.III1(var1)) {
            I_0_ var2 = I_0_.II();
            if (var2 != null) {
               var2.II_1(var1.trim());
            }
         }

         this.IlI1++;
      }
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   private void IIOI() {
      this.IIO_ = IlIO.III(III1("㶜㹩㹏㸵㸚㻰㻖㺢㻛㽱㽝㼳㼓㿼㿊㾪", 15869), false);
      this.III0 = IlIO.IIII(III1("㶜㹩㹏㸵㸚㻰㻖㺢㻛㽷㽜㼼㼅㿵㿁㾺", 15869), "");
      this.IlIl = IlIO.II(III1("㶜㹩㹏㸵㸚㻰㻖㺢㻛㽰㽖㼾㼐㿩", 15869), 5000);
      if (this.IlIl < 5000) {
         this.IlIl = 5000;
      }

      this.II0_();
   }

   private void IIOl() {
      IlIO.II(III1("㶜㹩㹏㸵㸚㻰㻖㺢㻛㽱㽝㼳㼓㿼㿊㾪", 15869), this.IIO_);
      IlIO.IIII(III1("㶜㹩㹏㸵㸚㻰㻖㺢㻛㽷㽜㼼㼅㿵㿁㾺", 15869), this.III0);
      IlIO.III(III1("㶜㹩㹏㸵㸚㻰㻖㺢㻛㽰㽖㼾㼐㿩", 15869), this.IlIl);
   }
}
