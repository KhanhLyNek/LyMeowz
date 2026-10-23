package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public class II1I extends IIII implements I1_1, I1__, CommandListener {
   private static II1I II;
   private IlI0 II = new IlI0();
   public Form IIII;
   public Command III1;
   public Command III_;
   public TextField III_;
   private boolean II01 = false;
   private boolean II0_ = false;
   private boolean II0O = false;
   private String IIll = "";
   private String[] IIIl = new String[0];
   private int Illl = 0;
   private int Ill1 = 0;
   private int Ill_ = 0;
   private int IllO = 0;
   private static final long II1l = 301000L;
   private static final int Ill0 = 20;
   private static final int Illo = 10;
   private int Il1 = -1;
   private int Il1I = -1;

   private II1I() {
   }

   public static II1I II() {
      if (II == null) {
         II = new II1I();
      }

      return II;
   }

   public static II1I III() {
      return II();
   }

   @Override
   protected void II1l() {
      this.IIOI();
      this.II.II(new II1l(this, 301000L));
      this.II.II(new II11(this, 1000L));
      this.II.II(new II1_(this, 5000L));
      this.II.II(new II1O(this, 1000L));
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

   private void IlIo() {
      if (!Il_o.III1(this.IIll)) {
         this.IIIl = Il_o.II(this.IIll, ';');

         for (int var1 = 0; var1 < this.IIIl.length; var1++) {
            this.IIIl[var1] = this.IIIl[var1].trim();
         }
      } else {
         this.IIIl = new String[0];
      }
   }

   public void II_I() {
      String var1 = this.Illl > 0 ? I_1l.IIIl(this.Illl) : III0("콱퇫켗", 53029);
      String var2 = this.Ill_ > 0 ? this.Ill_ + III0("케", 53029) : III0("콱퇫켗", 53029);
      String var3 = this.Ill1 > 0 ? I_1l.IIIl(this.Ill1) : III0("콱퇫켗", 53029);
      String var4 = this.IllO > 0 ? this.IllO + III0("케", 53029) : III0("콱퇫켗", 53029);
      String var5 = this.IIIl.length > 0 ? III0("콾", 53029) + this.IIIl.length + III0("켅켪켄츲텼쾩쾂", 53029) : III0("콾켐퇆쿶쾁쾣텼쾣", 53029);
      Il1_.II()
         .III()
         .II(III0("콤켱켗쿭쾁컐텲쾋퀽큨퀳컝탷", 53029))
         .II(III0("콽켭켍쾢캱텭쾪", 53029), this.II01 ? III0("콧퇩켗", 53029) : III0("콱퇫켗", 53029), 1, null)
         .II(III0("콦켬켌쾢캱텭쾪", 53029), this.II0_ ? III0("콧퇩켗", 53029) : III0("콱퇫켗", 53029), 2, null)
         .II(III0("콱쾮켍쾢쿌쾵턎쾐퀽큟퀳퀕", 53029), var5, 8, null)
         .II(III0("콱켬켖쾢캱텭쾪", 53029), this.II0O ? III0("콧퇩켗", 53029) : III0("콱퇫켗", 53029), 3, null)
         .II(III0("콭켔", 53029), var1, 4, null)
         .II(III0("케콤켫쿒", 53029), var2, 5, null)
         .II(III0("콨켔", 53029), var3, 6, null)
         .II(III0("케콤켮쿒", 53029), var4, 7, null)
         .II(III0("콴켱켂쿻쾁쾬텾쾗", 53029), "", 99, null)
         .II(this)
         .I__0();
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            this.II01 = !this.II01;
            this.IIIl(III0("콽켭켍쾢캱텭쾪쿄퀽", 53029) + (this.II01 ? III0("콧퇩켗", 53029) : III0("콱퇫켗", 53029)));
            this.IIOl();
            this.II_I();
            break;
         case 2:
            this.II0_ = !this.II0_;
            this.IIIl(III0("콦켬켌쾢캱텭쾪쿄퀽", 53029) + (this.II0_ ? III0("콧퇩켗", 53029) : III0("콱퇫켗", 53029)));
            this.IIOl();
            this.II_I();
            break;
         case 3:
            this.II0O = !this.II0O;
            this.IIIl(III0("콱켬켖쾢캱텭쾪쿄퀽", 53029) + (this.II0O ? III0("콧퇩켗", 53029) : III0("콱퇫켗", 53029)));
            this.IIOl();
            this.II_I();
            break;
         case 4:
            this.III(III0("콫켬퇎쿲쾁쾈쾏쿞큩컭퀲큚탭탐킾층텠턔큂쾱톱퇔턶톀퉪툌퍚쳇틼", 53029), III0("콨켭켍쾢쿩쾐", 53029));
            break;
         case 5:
            this.III(III0("콫켬퇎쿲쾁쿥쿿쾶큍퀜퀯캫탰킘킣킞텼쿷턦텒톹톁퇢퇗툴툅", 53029), III0("콨켭켍쾢쾄쿠쾗쾮", 53029));
            break;
         case 6:
            this.III(III0("콫켬퇎쿲쾁쾍쾏쿞큩컭퀲큚탭탐킾층텠턔큂쾱톱퇔턶톀퉪툌퍚쳇틼", 53029), III0("콨켭켍쾢쿬쾐", 53029));
            break;
         case 7:
            this.III(III0("콫켬퇎쿲쾁쿥쿿쾳큍퀜퀯캫탰킘킣킞텼쿷턦텒톹톁퇢퇗툴툅", 53029), III0("콨켭켍쾢쾄쿠쾒쾮", 53029));
            break;
         case 8:
            this.IllI();
            break;
         case 99:
            IlI.II().I_1l();
      }
   }

   public void Ill() {
      this.IIII = new Form(III0("콱쾮켍쾢쿌쾵턎쾐퀽큟퀳퀕킹톩칺킃", 53029));
      this.IIII.append(this.III_ = new TextField(III0("콱쾮켍쾢쾉쾃켾쾝큵퀜퀵퀒탸탍탷탍턼", 53029), this.IIll, 500000, 0));
      this.IIII.addCommand(this.III1 = new Command(III0("콩컴켖", 53029), 4, 1));
      this.IIII.addCommand(this.III_ = new Command(III0("콭켱톔", 53029), 7, 1));
      this.IIII.setCommandListener(this);
   }

   private void IllI() {
      this.Ill();
      Display.getDisplay(GameMidlet.II).setCurrent(this.IIII);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == this.III1) {
         try {
            String var3 = this.III_.getString().trim();
            this.IIll = var3;
            this.IlIo();
            this.IIOl();
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            if (this.IIIl.length > 0) {
               this.IIIl(III0("콦켬톪쾢쿂쾨쾰쿞턌캑퀮큀킹", 53029) + this.IIIl.length + III0("켅켪켄츲텼쾩", 53029));
            } else {
               this.IIIl(III0("층쾧콃쿶턎쾴쿿쾒컐큟큻퀎큳탖탷탛턵텷턻턝톱킡콢톛툭퉘쳮툞튩틋챤", 53029));
            }

            this.II_I();
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            II.II(III0("콩톓켊쾢쿊쾨쾶쿞큱톌퀮큀킹", 53029) + var4.getMessage());
         }
      }

      if (var1 == this.III_) {
         Display.getDisplay(GameMidlet.II).setCurrent(II.II);
         this.II_I();
      }
   }

   @Override
   public void II(String var1, String var2) {
      String var3 = Ilo_.II().II.IIl1();
      if (Il_o.III1(var3)) {
         this.Illl();
      } else {
         String var4 = Ilo_.II().II00;
         if (var4.equals(III0("콫켬퇎쿲쾁쾈쾏쿞큩컭퀲큚탭탐킾층텠턔큂쾱톱퇔턶톀퉪툌퍚쳇틼", 53029))) {
            this.III1(var3);
         } else if (var4.equals(III0("콫켬퇎쿲쾁쿥쿿쾶큍퀜퀯캫탰킘킣킞텼쿷턦텒톹톁퇢퇗툴툅", 53029))) {
            this.III_(var3);
         } else if (var4.equals(III0("콫켬퇎쿲쾁쾍쾏쿞큩컭퀲큚탭탐킾층텠턔큂쾱톱퇔턶톀퉪툌퍚쳇틼", 53029))) {
            this.IIIO(var3);
         } else if (var4.equals(III0("콫켬퇎쿲쾁쿥쿿쾳큍퀜퀯캫탰킘킣킞텼쿷턦텒톹톁퇢퇗툴툅", 53029))) {
            this.III0(var3);
         }
      }
   }

   @Override
   public void Illl() {
      Ilo_ var1 = Ilo_.II();
      var1.II00 = III0("콦켬켂쿶", 53029);
      var1.II.II1o = III0("콆켬켂쿶", 53029);
      var1.II.IIOl("");
      var1.I_10 = false;
      var1.II = I1_I.II();
      var1.III0 = null;
      this.II_I();
      II.II.I__0();
   }

   public void II(boolean var1) {
      if (var1) {
         if (this.Il1 < 0) {
            this.Il1 = this.Ill_;
            this.Il1I = this.IllO;
         }

         if (this.Ill_ < 50) {
            this.Ill_ = 50;
         }

         if (this.IllO < 30) {
            this.IllO = 30;
         }
      } else if (this.Il1 >= 0) {
         this.Ill_ = this.Il1;
         this.IllO = this.Il1I;
         this.Il1 = -1;
         this.Il1I = -1;
      }
   }

   private void Ill1() {
      I_0_.II().II(1, "", -1);
   }

   private void Ill_() {
      if (I1.II1 != null) {
         for (int var1 = 0; var1 < I1.II1.size(); var1++) {
            I1 var2 = (I1)I1.II1.elementAt(var1);
            if (this.II(var2) && this.III(var2.IIo1)) {
               I_0_.II().II0_(var2.I1l);
               break;
            }
         }
      }
   }

   private void IllO() {
      if (this.III0()) {
         int var1 = this.IIII();
         if (var1 < 20) {
            this.Illo();
         }

         if (this.IIIl(var1)) {
            this.Il1();
         }
      }
   }

   private void Ill0() {
      Ilol var1 = Ilol.II();
      if (var1 != null && !var1.I_I_ && I1_I.Io_0 > 0 && var1.IOl_ > 0) {
         boolean var2 = this.IIII(var1);
         boolean var3 = this.IIIl(var1);
         if (var2 || var3) {
            I1_I.II().I0_();
         }
      }
   }

   private boolean II(I1 var1) {
      if (var1 != null && var1.IIo1 != null) {
         Ilol var2 = Ilol.II();
         return var2 != null && var2.IIO1 != null ? var1.IoIo != 0 && !var1.IIo1.equals(var2.IIO1) && var1.IoI0 != var1.IoIo : false;
      } else {
         return false;
      }
   }

   private boolean III0() {
      int var1 = IOlO.l1oI;
      return var1 == 21 || var1 == 22 || var1 == 23;
   }

   private boolean III(String var1) {
      if (this.IIIl.length == 0) {
         return true;
      }

      if (Il_o.III1(var1)) {
         return false;
      }

      String var2 = var1.trim();

      for (int var3 = 0; var3 < this.IIIl.length; var3++) {
         String var4 = this.IIIl[var3];
         if (!Il_o.III1(var4) && var4.equalsIgnoreCase(var2)) {
            return true;
         }
      }

      return false;
   }

   private int IIII() {
      Ilol var1 = Ilol.II();
      if (var1 != null && var1.III != null) {
         int var2 = 0;
         I101[] var3 = Ilol.II().III;

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var3[var4] != null && var3[var4].II.II0l == 6) {
               var2 += var3[var4].I1l1;
            }
         }

         return var2;
      } else {
         return 0;
      }
   }

   private void Illo() {
      Ilol var1 = Ilol.II();
      if (var1 != null && var1.II != null) {
         I101[] var2 = Ilol.II().II;

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3] != null && var2[var3].II.II0l == 6) {
               I_0_.II().III((byte)1, (byte)var3);
               break;
            }
         }
      }
   }

   private boolean IIIl(int var1) {
      return I1_I.II().II == null ? false : I1_I.II().II.lIoo > 0 && (I1_I.Io_0 < 10 || var1 < 20);
   }

   private void Il1() {
      I_0_.II().IIoI(4);
      I_0_.II().II((short)4, (byte)0);
   }

   private boolean IIII(Ilol var1) {
      if (this.Illl > 0 && var1.IOl_ <= this.Illl) {
         return true;
      }

      if (this.Ill_ > 0 && var1.IOlo > 0) {
         int var2 = var1.IOl_ * 100 / var1.IOlo;
         if (var2 <= this.Ill_) {
            return true;
         }
      }

      return false;
   }

   private boolean IIIl(Ilol var1) {
      if (this.Ill1 > 0 && var1.IOl1 <= this.Ill1) {
         return true;
      }

      if (this.IllO > 0 && var1.IO1 > 0) {
         int var2 = var1.IOl1 * 100 / var1.IO1;
         if (var2 <= this.IllO) {
            return true;
         }
      }

      return false;
   }

   private void III1(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         this.Illl = var2 > 0 ? var2 : 0;
         this.IIIl(III0("콤켱켗쿭쾁컑텲쾋퀽큗퀳퀓킹탰킇탖텱킄쾈턛톫톐", 53029) + I_1l.IIIl(this.Illl));
         this.IIOl();
      } catch (Exception var3) {
         this.IIIl(III0("콢켭쾂쾢쿕쾲턔쿞큶큔킯퀔탾킘킿츕텥턔턿쾵", 53029));
      }

      this.Illl();
   }

   private void III_(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         if (var2 > 99) {
            var2 = 99;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         this.Ill_ = var2;
         this.IIIl(III0("콤켱켗쿭쾁컑텲쾋퀽큗퀳퀓킹탰킇탖텱킄쾈턛톫톐", 53029) + this.Ill_ + III0("케", 53029));
         this.IIOl();
      } catch (Exception var3) {
         this.IIIl(III0("콢켭쾂쾢쿕쾲턔쿞큶큔킯퀔탾킘킿츕텥턔턿쾵", 53029));
      }

      this.Illl();
   }

   private void IIIO(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         this.Ill1 = var2 > 0 ? var2 : 0;
         this.IIIl(III0("콤켱켗쿭쾁컑텲쾋퀽큗퀳퀓킹탵킇탖텱킄쾈턛톫톐", 53029) + I_1l.IIIl(this.Ill1));
         this.IIOl();
      } catch (Exception var3) {
         this.IIIl(III0("콢켭쾂쾢쿕쾲턔쿞큶큔킯퀔탾킘킿츕텥턔턿쾵", 53029));
      }

      this.Illl();
   }

   private void III0(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         if (var2 > 99) {
            var2 = 99;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         this.IllO = var2;
         this.IIIl(III0("콤켱켗쿭쾁컑텲쾋퀽큗퀳퀓킹탵킇탖텱킄쾈턛톫톐", 53029) + this.IllO + III0("케", 53029));
         this.IIOl();
      } catch (Exception var3) {
         this.IIIl(III0("콢켭쾂쾢쿕쾲턔쿞큶큔킯퀔탾킘킿츕텥턔턿쾵", 53029));
      }

      this.Illl();
   }

   private void III(String var1, String var2) {
      II.II.I__o();
      Ilo_.II().II00 = var1;
      Ilo_.II().II.II1o = var2;
      Ilo_.II().II1o("");
      Ilo_.II().II = this;
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   private void IIOI() {
      this.II01 = IlIO.III(III0("콕켡켂쿬쾏쾲쾺쾏큨큙퀨퀎", 53029), false);
      this.II0_ = IlIO.III(III0("콕켡켂쿬쾏쾤쾰쾐큼큈퀾", 53029), false);
      this.II0O = IlIO.III(III0("콕켡켂쿬쾏쾨쾾쾌큫큙퀨퀎", 53029), false);
      this.IIll = IlIO.IIII(III0("콕켡켂쿬쾏쾴쾾쾌큺큙퀯퀴탸탕킲킅", 53029), "");
      this.IlIo();
      this.Illl = IlIO.II(III0("콕켡켂쿬쾏쾭쾶쾐큕크", 53029), 0);
      this.Ill1 = IlIO.II(III0("콕켡켂쿬쾏쾭쾶쾐큐크", 53029), 0);
      this.Ill_ = IlIO.II(III0("콕켡켂쿬쾏쾭쾶쾐큕크퀋퀟탫탛킲킘텡", 53029), 0);
      this.IllO = IlIO.II(III0("콕켡켂쿬쾏쾭쾶쾐큐크퀋퀟탫탛킲킘텡", 53029), 0);
   }

   private void IIOl() {
      IlIO.II(III0("콕켡켂쿬쾏쾲쾺쾏큨큙퀨퀎", 53029), this.II01);
      IlIO.II(III0("콕켡켂쿬쾏쾤쾰쾐큼큈퀾", 53029), this.II0_);
      IlIO.II(III0("콕켡켂쿬쾏쾨쾾쾌큫큙퀨퀎", 53029), this.II0O);
      IlIO.IIII(III0("콕켡켂쿬쾏쾴쾾쾌큺큙퀯퀴탸탕킲킅", 53029), this.IIll);
      IlIO.III(III0("콕켡켂쿬쾏쾭쾶쾐큕크", 53029), this.Illl);
      IlIO.III(III0("콕켡켂쿬쾏쾭쾶쾐큐크", 53029), this.Ill1);
      IlIO.III(III0("콕켡켂쿬쾏쾭쾶쾐큕크퀋퀟탫탛킲킘텡", 53029), this.Ill_);
      IlIO.III(III0("콕켡켂쿬쾏쾭쾶쾐큐크퀋퀟탫탛킲킘텡", 53029), this.IllO);
   }
}
