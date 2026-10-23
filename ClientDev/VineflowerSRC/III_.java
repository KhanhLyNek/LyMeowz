package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public class III_ extends IIII implements I1_1, CommandListener {
   private static III_ II;
   private IlI0 II = new IlI0();
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
      return II();
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

         for (int var1 = 0; var1 < this.II.length; var1++) {
            this.II[var1] = this.II[var1].trim();
         }
      } else {
         this.II = new String[0];
      }
   }

   public void II_I() {
      String var1 = this.II.length > 0 ? IIIl("倎", 20565) + this.II.length + IIIl("偵倖僼僁傢傭", 20565) : IIIl("倎倠丶僆僱傓侬关", 20565);
      Il1_.II()
         .III()
         .II(IIIl("倔倁僧僝僱傲兠兝儾", 20565))
         .II(IIIl("們傆傳僐傾傃兼", 20565), this.II__ ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565), 1, null)
         .II(IIIl("倁傞僽傒傳傟兼兝六儏伬凄凩册勵", 20565), var1, 2, null)
         .II(IIIl("倔倁僧僝僱傗兦元六儎凤凙冺", 20565), this.II_0 ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565), 3, null)
         .II(IIIl("倔倁僧僝僱傔俄免儥兌凿凂冬冇刧剄刪列勰", 20565), this.II_o ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565), 4, null)
         .II(IIIl("倔倁僧僝僱傄侪兀六儏兿凄冮凈剥剉制列", 20565), this.IIO ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565), 5, null)
         .II(IIIl("倄倁僲僋僱傜侮兇", 20565), "", 99, null)
         .II(this)
         .I__0();
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            this.II__ = !this.II__;
            if (!this.II__) {
               this.IIO();
            }

            this.IIIl(IIIl("們傆傳僐傾傃兼儔六", 20565) + (this.II__ ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565)));
            this.II_I();
            break;
         case 2:
            this.II_1();
            break;
         case 3:
            this.II_0 = !this.II_0;
            this.IIIl(IIIl("倔倁僧僝僱傗兦元六儎凤凙冺凒刧", 20565) + (this.II_0 ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565)));
            this.II_I();
            break;
         case 4:
            this.II_o = !this.II_o;
            this.IIIl(IIIl("倔倁僧僝僱傔俄免儥兌凿凂冬冇刧剄刪列勰劘勡", 20565) + (this.II_o ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565)));
            this.II_I();
            break;
         case 5:
            this.IIO = !this.IIO;
            if (this.IIO) {
               Ilol.II().IIII = null;
               Ilol.II().II = null;
               Ilol.II().II = null;
               this.II_o = true;
               this.II_0 = true;
            } else {
               this.II_o = false;
            }

            this.IIIl(IIIl("倔倁僧僝僱傄侪兀六儏兿凄冮凈剥剉制列効劂", 20565) + (this.IIO ? IIIl("倗仙僧", 20565) : IIIl("倁仛僧", 20565)));
            this.II_I();
            break;
         case 99:
            IlI.III().I_1l();
      }
   }

   public void II_l() {
      this.II = new Form(IIIl("倁傍僪傒傲傘俆兀儥兌凿兀冧凈剅剉制列", 20565));
      this.II = new TextField(IIIl("倁傞僽傒傳傟兼兝六兄凈克冪冀刧剈刭刅勶劂勺勉", 20565), this.IIIO, 500000, 0);
      this.II.append(this.II);
      this.II = new Command(IIIl("候凄僦", 20565), 4, 1);
      this.III = new Command(IIIl("倝倁乤", 20565), 3, 1);
      this.II.addCommand(this.II);
      this.II.addCommand(this.III);
      this.II.setCommandListener(this);
   }

   private void II_1() {
      this.II_l();
      Display.getDisplay(GameMidlet.II).setCurrent(this.II);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == this.II) {
         try {
            String var3 = this.II.getString().trim();
            this.IIIO = var3;
            this.II_();
            this.IIOl();
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            if (this.II.length > 0) {
               this.IIIl(IIIl("充傗傳僞兡傅儵儎", 20565) + this.II.length + IIIl("偵倀偹僜僱傒兠兝儾", 20565));
            } else {
               this.IIIl(IIIl("充傗傳僊倢傑儯兊儬儂凣冊冺儉剤剎剥剉劣勦刳勀劋䶻卉卼匘䴹厙厺厘呥呆", 20565));
            }

            this.II_I();
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            II.II(IIIl("候亣僺傒傺傘兦儎儡僜凾冊冪儈剮分協䳓勷劘勡", 20565) + var4.getMessage());
         }
      }

      if (var1 == this.III) {
         Display.getDisplay(GameMidlet.II).setCurrent(II.II);
         this.II_I();
      }
   }

   public static boolean II(Ilol var0) {
      if (var0 != null
         && var0.IIO1 != null
         && !Il_o.III1(var0.IIO1)
         && !var0.I_
         && !var0.I_I
         && var0.IOl_ > 0
         && !var0.IIO1.equals(IIIl("倁倆乞僜傶僐养凎儤", 20565))
         && !var0.IIO1.startsWith(IIIl("倗倆僼僞储", 20565))
         && !var0.IIO1.startsWith(IIIl("偶", 20565))
         && !var0.IIO1.startsWith(IIIl("偱", 20565))) {
         char var1 = var0.IIO1.charAt(0);
         return Character.isUpperCase(var1);
      } else {
         return false;
      }
   }

   private boolean III(Ilol var1) {
      if (!II(var1)) {
         return false;
      }

      if (this.II.length == 0) {
         return true;
      }

      for (int var2 = 0; var2 < this.II.length; var2++) {
         if (!Il_o.III1(this.II[var2]) && var1.IIO1.indexOf(this.II[var2]) >= 0) {
            return true;
         }
      }

      return false;
   }

   private void II__() {
      try {
         Ilol var1 = Ilol.II();
         if (var1 == null) {
            return;
         }

         if (IOlO.l1oI != this.II0O) {
            this.II0O = IOlO.l1oI;
            this.II01 = 0;
         }

         switch (this.II01) {
            case -1:
               if (!this.II_O) {
                  this.II00 = I1_I.II().IlOI != null ? I1_I.II().IlOI.length - 1 : 0;
                  this.II01 = 1;
               }
               break;
            case 0:
               if (IOlO.l1oI == 23 || IOlO.l1oI == 21 || IOlO.l1oI == 22 || IOlO.l1oI == 47 || IOlO.l1oI == 48 || IOlO.l1oI == 50 || IOlO.l1oI == 116) {
                  this.II__ = false;
                  this.IIIl(IIIl("倘倕僣傒傺傘击兀優兌凿凂伊凈剣勔剥分勬勑劲勁", 20565));
               } else if (this.III_()) {
                  this.IIIl(IIIl("充傗傳僆倽傝儯党儥俉凲冊冫冇剴剕剤", 20565));
                  this.II__ = false;
               } else {
                  Il_0.I_oI();
                  this.II0_ = IOlO.l1ol + 1;
                  this.II_O = true;
                  I_0_.II().IoOI();
                  this.II01 = -1;
               }
               break;
            case 1:
               if (this.II0_ <= this.II00 && !Ilol.II().I_I_) {
                  I_0_.II().II0O(this.II0_);
                  this.IIlI = IO10.IIII() + 1500L;
                  this.II01 = 2;
               } else {
                  this.II__ = false;
               }
               break;
            case 2:
               if (IO10.IIII() >= this.IIlI) {
                  if (IOlO.l1ol != this.II0_) {
                     I_0_.II().II0O(this.II0_);
                     this.IIlI = IO10.IIII() + 1500L;
                  } else {
                     this.II01 = 3;
                  }
               }
               break;
            case 3:
               if (this.III_()) {
                  this.IIIl(IIIl("充傗傳僆倽傝儯党儥俉凲冊冫冇剴剕剤", 20565));
                  this.II__ = false;
               } else {
                  long var2 = 200L;
                  this.IIlI = IO10.IIII() + var2;
                  this.II01 = 4;
               }
               break;
            case 4:
               if (IO10.IIII() >= this.IIlI) {
                  this.II0_++;
                  this.II01 = 1;
               }
         }
      } catch (Exception var4) {
         this.IIIl(IIIl("倖傇傳僞丆備儯兖修儕冫凘冨凉", 20565));
         this.II__ = false;
      }
   }

   private void II_O() {
      Ilol var1 = Ilol.II();
      if (var1 != null && I1_I.II_O != null) {
         Ilol var2 = null;
         long var3 = Long.MAX_VALUE;

         for (int var5 = 0; var5 < I1_I.II_O.size(); var5++) {
            Ilol var6 = (Ilol)I1_I.II_O.elementAt(var5);
            if (this.III(var6) && var6.IOl_ < var3) {
               var3 = var6.IOl_;
               var2 = var6;
            }
         }

         if (var2 != null) {
            var1.II = null;
            var1.IIIl = var2;
            var1.IIII = null;
         }
      }
   }

   private void II_0() {
      Ilol var1 = null;
      long var2 = Long.MAX_VALUE;

      for (int var4 = 0; var4 < I1_I.II_O.size(); var4++) {
         Ilol var5 = (Ilol)I1_I.II_O.elementAt(var4);
         if (this.III(var5) && var5.I_o_ > 10 && var5.I_o_ < IOlO.IIO() - 10 && var5.I_oO < IOlO.IIOI() - 10 && var5.IOl_ < var2) {
            var2 = var5.IOl_;
            var1 = var5;
         }
      }

      if (var1 != null && !Ilol.II().I_I_) {
         Ilol.II().IIIl = var1;
         int var8 = var1.I_o_ - Ilol.II().I_o_;
         int var9 = var1.I_oO - Ilol.II().I_oO;
         double var6 = Math.sqrt(var8 * var8 + var9 * var9);
         if (var6 > 30.0) {
            Il_0.III1(var1.I_o_, var1.I_oO);
         }
      }
   }

   private void II_o() {
      Ilol var1 = Ilol.II();
      if (var1 != null) {
         Ilol var2 = null;
         long var3 = Long.MAX_VALUE;

         for (int var5 = 0; var5 < I1_I.II_O.size(); var5++) {
            Ilol var6 = (Ilol)I1_I.II_O.elementAt(var5);
            if (this.III(var6) && var6.IOl_ < var3) {
               var3 = var6.IOl_;
               var2 = var6;
            }
         }

         if (var2 != null && !Ilol.II().I_I_) {
            Ilol.II().IIIl = var2;
            int var11 = var2.I_o_ - Ilol.II().I_o_;
            int var12 = var2.I_oO - Ilol.II().I_oO;
            double var7 = Math.sqrt(var11 * var11 + var12 * var12);
            if (var7 <= 100.0) {
               try {
                  if (!Ilol.II().I_I1) {
                     I_lO var9 = new I_lO("");
                     var9.addElement(Ilol.II().IIIl);
                     I_0_.II().II(new I_lO(""), var9, 2);
                     Ilol var10000 = Ilol.II();
                     var10000.IOl1 = var10000.IOl1 - Ilol.II().II.l1O;
                  }
               } catch (Exception var10) {
               }
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

      for (int var1 = 0; var1 < I1_I.II_O.size(); var1++) {
         Ilol var2 = (Ilol)I1_I.II_O.elementAt(var1);
         if (this.III(var2) && var2.I_o_ < IOlO.IIO() - 10 && var2.I_oO < IOlO.IIOI() - 10) {
            return true;
         }
      }

      return false;
   }

   private void IIOI() {
      this.IIIO = IlIO.IIII(IIIl("倴倁僧僝傳傟兼兝兣儎凤凙冺円剦剋删列", 20565), "");
      this.II_();
   }

   private void IIOl() {
      IlIO.IIII(IIIl("倴倁僧僝傳傟兼兝兣儎凤凙冺円剦剋删列", 20565), this.IIIO);
   }
}
