package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public class II0l extends IIII implements I1_1, CommandListener {
   private static II0l II;
   private IlI0 II = new IlI0();
   public boolean IllO = false;
   private boolean Ill0 = false;
   private boolean Illo = false;
   private I_I_ II;
   public long IIOl = 0L;
   public boolean Il1 = true;
   public boolean Il1I = false;
   public int IlO1 = 0;
   public Il_l.II IIIl = new Il_l.II();
   private long IIO1 = 0L;
   private long IIO_ = 0L;
   public boolean Il1l = true;
   private long IIOO = 0L;
   private int IlO_ = -1;
   private long IIO0 = -1L;
   private Il_l.III1 II = new Il_l.III1();
   private long IIOo = 0L;
   private int IlOO = -1;
   private long II0 = 0L;
   public long II0I = 0L;
   public Form IIIl;
   public Command IIIO;
   public Command III0;
   public TextField III0;
   public TextField IIIo;

   private II0l() {
   }

   public static II0l II() {
      if (II == null) {
         II = new II0l();
      }

      return II;
   }

   public static II0l III() {
      return II();
   }

   @Override
   protected void II1l() {
      this.IIOI();
      this.II.II(new II01(this, 5000L));
      this.II.II(new II0_(this, 5000L));
      this.II.II(new II0O(this, 0L));
      this.II.II(new II00(this, 100L));
      this.II.II(new II0o(this, 5000L));
      this.IIlo();
   }

   @Override
   protected void II11() {
      this.IIOl();
      this.II.I_1O();
   }

   @Override
   protected void II1_() {
      IIo_.III().IIlO();
      Ilol var1 = Ilol.II();
      if (var1 != null && this.IllO && !IlO_.II_O() && !II_O.III().IIll()) {
         Il_.III().IIlO();
         Il_I.III().IIlO();
         if (IIo1.Il_l) {
            this.II(Il1O.III().IIlO);
         }

         this.II.IIlO();
      }
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
   }

   private void IIOI() {
      this.Il1 = IlIO.III(IIl0("뻣뻄뺴뺝뽽뼜뼰뼆뿠뿇뾩뾿쁾쁚쀬쀚샊색삧", 48791), true);
      this.IlO1 = IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼼뼟뿹뿋뾀뾃쁯쁏", 48791), 0);
      this.Il1I = IlIO.III(IIl0("뻣뻄뺴뺝뽽뼜뼥뼂뿮뿇뾣뾼쁮쁞쀺", 48791), false);
      this.Il1l = IlIO.III(IIl0("뻣뻄뺴뺝뽽뼜뼲뼘뿪뿍뾦뾠쁪쁍쀄쀇샥", 48791), true);
      this.IIO1 = IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼼뼑뿷뿦뾝뾡쁤쁈", 48791), (long)0L);
      this.IIO_ = IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼼뼙뿡뿦뾝뾡쁤쁈", 48791), (long)0L);
   }

   private void IIOl() {
      IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼰뼆뿠뿇뾩뾿쁾쁚쀬쀚샊색삧", 48791), this.Il1);
      IlIO.III(IIl0("뻣뻄뺴뺝뽽뼜뼼뼟뿹뿋뾀뾃쁯쁏", 48791), this.IlO1);
      IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼥뼂뿮뿇뾣뾼쁮쁞쀺", 48791), this.Il1I);
      IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼲뼘뿪뿍뾦뾠쁪쁍쀄쀇샥", 48791), this.Il1l);
      IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼼뼑뿷뿦뾝뾡쁤쁈", 48791), (long)this.IIO1);
      IlIO.II(IIl0("뻣뻄뺴뺝뽽뼜뼼뼙뿡뿦뾝뾡쁤쁈", 48791), (long)this.IIO_);
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   private void II(I_I_ var1) {
      try {
         if (var1 == null || this.Il1I || !this.Il1l) {
            return;
         }

         if (this.IlO_ != var1.lll) {
            this.IlO_ = var1.lll;
            this.IIOO = IO10.IIII();
            this.IIO0 = var1.llIl;
            return;
         }

         long var2 = IO10.IIII() - this.IIOO;
         if (var2 > 15000L) {
            if (var1.llIl >= this.IIO0 * 0.9) {
               this.II.II(new Integer(var1.lll), new Boolean(true));
               this.IIOo = IO10.IIII();
               Ilol.II().IIII = null;
               this.II = null;
               this.IlO_ = -1;
               this.IIOO = 0L;
               this.IIO0 = -1L;
               Il_.III().II0();
               Il_I.III().II0();
            }
         } else {
            this.IIO0 = var1.llIl;
         }
      } catch (Exception var4) {
      }
   }

   private boolean III(I_I_ var1) {
      return this.II.IIII(new Integer(var1.lll));
   }

   private void Ilo_() {
      try {
         if (this.IlOO != IOlO.l1oI) {
            this.II.I_1O();
            this.IlOO = IOlO.l1oI;
            this.IIOo = 0L;
            return;
         }

         if (this.II.IIlO() > 0 && IO10.IIII() - this.IIOo > 30000L) {
            this.II.I_1O();
            this.IIOo = 0L;
         }
      } catch (Exception var2) {
      }
   }

   public long II() {
      try {
         Ilol var1 = Ilol.II();
         if (var1 != null && this.IllO && this.II0 > 0L) {
            return var1.Il11 - this.II0;
         }
      } catch (Exception var2) {
      }

      return 0L;
   }

   public long III() {
      return this.IllO && this.II0I > 0L ? IO10.IIII() - this.II0I : 0L;
   }

   private I_I_ III() {
      I_I_ var1 = null;
      int var2 = Integer.MAX_VALUE;

      for (int var3 = 0; var3 < I1_I.IIO.size(); var3++) {
         I_I_ var4 = (I_I_)I1_I.IIO.elementAt(var3);
         if (this.II(var4)) {
            if ((this.IlO1 == 0 || this.IlO1 == 2) && !Il_0.II_()) {
               Il10.IIII var8 = new Il10.IIII(Ilol.II().I_o_ / 24, Ilol.II().I_oO / 24);
               Il10.IIII var6 = new Il10.IIII(var4.I1 / 24, var4.I1I / 24);
               Il_l.II var7 = Il10.II(var8, var6);
               if (var7 != null && var7.IIlO() < var2) {
                  var2 = var7.IIlO();
                  var1 = var4;
               }
            } else {
               int var5 = Il_O.II(Ilol.II(), var4);
               if (var5 < var2) {
                  var2 = var5;
                  var1 = var4;
               }
            }
         }
      }

      return var1;
   }

   private boolean II(I_I_ var1) {
      if (var1 == null || var1.llIl <= 0 || var1.I0I1 || var1.status <= 1) {
         return false;
      } else if (this.III(var1)) {
         return false;
      } else if (this.IIIl.IIlO() > 0 && !this.IIIl.III(new Integer(var1.I1ll))) {
         return false;
      } else if (this.Il1 && !Il_0.II_() && var1.IIOI()) {
         return false;
      } else {
         return this.IIO1 <= 0L || var1.llI1 <= this.IIO1 && var1.llI1 >= this.IIO_ ? this.IIO_ <= 0L || var1.llIl > this.IIO_ : false;
      }
   }

   private void IloO() {
      if (this.II != null && !this.Il1I) {
         Ilol var1 = Ilol.II();
         if (var1 != null) {
            this.II(this.II);
            Ilol.II().IIII = this.II;
            if (this.IlO1 == 2) {
               Il_1.II(this.II);
            } else {
               I_0o var2 = Ilol.II().II;
               if (var2 != null) {
                  long var3 = IO10.IIII();
                  if (var3 - var2.I1IO < var2.l1_O + 100L) {
                     return;
                  }

                  var2.I1IO = var3;
               }

               I_lO var5 = new I_lO("");
               var5.addElement(this.II);
               I_0_.II().II(var5, new I_lO(""), -1);
            }
         }
      }
   }

   public void II(boolean var1) {
      try {
         this.Ill0 = var1;
         if (!var1) {
            this.I1();
         }

         II1I.III().II(var1);
      } catch (Exception var3) {
      }
   }

   public void Ilo0() {
      try {
         if (!this.Ill0 || !I1_I.IO_I || this.IllO || Ilol.II() == null) {
            return;
         }

         this.IIIl.I_1O();
         this.II0 = Ilol.II().Il11;
         this.II0I = IO10.IIII();
         this.Illo = true;
         this.IllO = true;
      } catch (Exception var2) {
      }
   }

   public void Iloo() {
      if (this.Illo) {
         this.I1();
      }
   }

   private void I1() {
      if (this.Illo) {
         this.Illo = false;
         this.IllO = false;
         this.II = null;
         if (Ilol.II() != null) {
            Ilol.II().IIII = null;
         }

         Il_.III().II0();
         Il_I.III().II0();
      }
   }

   public void I1I() {
      if (this.Illo) {
         this.I1();
         this.IIIl(IIl0("뾇빕뻵뺐ꇸ뽜뼶뽐뿻ꅟ뿭뻽\uded2쁄쀮쁈샫샓삼\ude23셭섂섵\udfcd섏", 48791));
      } else if (this.Ill0) {
         this.IIIl(IIl0("뻙뻞ꁰ뺄뼳븣뾫뼀뾯뿘뼭뾃쀫쁛쀼삉샮삆쇔\ude27섣셀\udfee섔셟삏\udf1a솩쇛쉶쉌숡\udcb0싸슕슠\udc5e썢", 48791));
      }
   }

   private void I1II() {
      this.Illo = false;
      if (this.IIIl.IIlO() == 0) {
         this.IIIl(IIl0("뻃빖뺻뻔뽀뿓뼥뽐뿛ꄋ뾹뿌쁈\ude89쁩셸쁤삆삇\ude49셷섃", 48791));
      } else {
         this.IIIl(IIl0("뻃빖뺻뻔뽀뿓뼥뽐뿋뿏뾣뾄쀫쁹삨쀋샯삆쇕쀇섣셠\udfec섔셞", 48791));
      }

      this.II0 = Ilol.II().Il11;
      this.II0I = IO10.IIII();
      this.IllO = true;
   }

   private void I1Il() {
      if (!Ilol.II().I_I1 && !Ilol.II().I_I_) {
         I_I_ var1 = this.III();
         if (this.II != var1) {
            this.II = var1;
            Il_.III().II0();
            Il_I.III().II0();
         }

         if (this.II != null) {
            int var2 = Il_O.II(Ilol.II(), this.II);
            if (var2 <= 50) {
               Il_.III().II0();
               Il_I.III().II0();
               this.IloO();
            } else if (Il_0.II_()) {
               Il_0.III1(this.II.I1, this.II.I1I);
            } else if (this.IlO1 == 0) {
               if (!Il_I.III().II1O()) {
                  Il10.IIII var3 = new Il10.IIII(Ilol.II().I_o_ / 24, Ilol.II().I_oO / 24);
                  Il10.IIII var4 = new Il10.IIII(this.II.I1 / 24, this.II.I1I / 24);
                  Il_I.III().II(var3, var4);
               }
            } else if (this.IlO1 == 1) {
               Il_0.III1(this.II.I1, this.II.I1I);
            } else if (this.IlO1 == 2 && !Il_.III().II1O()) {
               Il10.IIII var5 = new Il10.IIII(Ilol.II().I_o_ / 24, Ilol.II().I_oO / 24);
               Il10.IIII var6 = new Il10.IIII(this.II.I1 / 24, this.II.I1I / 24);
               Il_.III().II(var5, var6);
            }
         }
      }
   }

   public void I1I1() {
      this.IIIl = new Form(IIl0("뻛ꁻ뺶뻔뽛뽢뽱뼡뿺뽏뾤", 48791));
      String var1 = this.IIO1 > 0L ? String.valueOf(this.IIO1) : "";
      this.III0 = new TextField(IIl0("뻟뻦뻵뺠ꇂ뽛뽱빠뿮뾔", 48791), var1, 500000000, 2);
      String var2 = this.IIO_ > 0L ? String.valueOf(this.IIO_) : "";
      this.IIIo = new TextField(IIl0("뻟뻦뻵뺠ꇂ뽛뽱뼤뿧뿇ꄎ뾙쀱", 48791), var2, 500000000, 2);
      this.IIIl.append(this.III0);
      this.IIIl.append(this.IIIo);
      this.IIIO = new Command(IIl0("뻛뼆뺠", 48791), 4, 1);
      this.III0 = new Command(IIl0("뻟뻃ꀢ", 48791), 3, 1);
      this.IIIl.addCommand(this.IIIO);
      this.IIIl.addCommand(this.III0);
      this.IIIl.setCommandListener(this);
   }

   private void I1I_() {
      this.I1I1();
      Display.getDisplay(GameMidlet.II).setCurrent(this.IIIl);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == this.IIIO) {
         try {
            String var3 = this.III0.getString().trim();
            String var4 = this.IIIo.getString().trim();
            if (Il_o.III1(var3)) {
               this.IIO1 = 0L;
            } else {
               long var5 = Long.parseLong(var3);
               if (var5 < 0L) {
                  I1_I.II.IIII(IIl0("뻟뻦뻵뺀ꇂ뽛뽱빡뿮뾎뾽뾄\udea8쁃쁩쁖삺삆샵", 48791), 0);
                  return;
               }

               this.IIO1 = var5;
            }

            if (Il_o.III1(var4)) {
               this.IIO_ = 0L;
            } else {
               long var9 = Long.parseLong(var4);
               if (var9 < 0L) {
                  I1_I.II.IIII(IIl0("뻟뻦뻵뺀ꇂ뽛뽱뼄뿧뿇ꄎ뾙쀫쁚쀡\udecb샮삆샻샙섣섒", 48791), 0);
                  return;
               }

               this.IIO_ = var9;
            }

            if (this.IIO1 > 0L && this.IIO_ > 0L && this.IIO_ > this.IIO1) {
               I1_I.II.IIII(IIl0("뻟뻦뻵뺀ꇂ뽛뽱뼄뿧뿇ꄎ뾙쀫쁁쀡삜샩상샥쇵삳\udfc1섢셀섓\udf45쇓쇼솓쎻쉗쉸숿싆슕슠\udc22썻쌑쉁쌎", 48791), 0);
               return;
            }

            this.IIOl();
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            if (this.IIO1 <= 0L && this.IIO_ <= 0L) {
               this.IIIl(IIl0("뾇빕뻵뺀ꆼ뽆뽱뼜ꅂ뿍뿭뾤쁛", 48791));
            } else {
               this.IIIl(IIl0("뾇빕뻵뺘뺣뽇뽫뽐뿇뿾뿭", 48791) + this.IIO_ + IIl0("뺷뺛뻵", 48791) + this.IIO1);
            }

            this.II_I();
         } catch (NumberFormatException var7) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            I1_I.II.IIII(IIl0("뻛ꁡ뺼뻎뼳뽼뼹ꇝ뿿뾎뾾ꄽ쀫쁁쀡삜샩상샥삌\udfe0셒셡섌\udfb8", 48791), 0);
         } catch (Exception var8) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            I1_I.II.IIII(IIl0("뻛ꁡ뺼뻎뼳", 48791) + var8.getMessage(), 0);
         }
      }

      if (var1 == this.III0) {
         Display.getDisplay(GameMidlet.II).setCurrent(II.II);
         this.II_I();
      }
   }

   public void II_I() {
      Il_l.II var1 = new Il_l.II();
      Il1_ var2 = Il1_.II().III().II(IIl0("뻖뻃뺡뺛뼳뽦뼣뼑뿦뿀", 48791));
      if (this.IllO) {
         var2.II(IIl0("뻃ꀙ뺡뻔뽇뿒뼿뽐뿜뽏뾹", 48791), "", 5, null);
      }

      for (int var3 = 0; var3 < I1_I.IIO.size(); var3++) {
         I_I_ var4 = (I_I_)I1_I.IIO.elementAt(var3);
         if (!var4.I0I1) {
            boolean var5 = false;

            for (int var6 = 0; var6 < var1.IIlO(); var6++) {
               I_I_ var7 = (I_I_)var1.II(var6);
               if (var4.I1ll == var7.I1ll) {
                  var5 = true;
                  break;
               }
            }

            if (!var5) {
               var1.III(var4);
               var2.II(IIl0("뻃빖뺻뻔뽀뿓뼥뽐", 48791) + var4.II().II1o, "", 1, new Integer(var4.I1ll));
            }
         }
      }

      var2.II(IIl0("뻃빖뺻뻔뽀뿓뼥뽐뿛ꄋ뾹뿌쁈\ude89", 48791), "", 2, null);
      var2.II(IIl0("뻙빟뻵뺧뽺뿘뼤뽐뿞뿛뼬뾅", 48791), this.Il1 ? IIl0("뻕ꀛ뺡", 48791) : IIl0("뻃ꀙ뺡", 48791), 3, null);
      String var8 = this.IlO1 == 0
         ? IIl0("뻓뻟뻵뺷뽻뽇뼨ꆳ뿡뾎뾙뾄샿쁄쀮쁈샊샏삫삌", 48791)
         : (this.IlO1 == 1 ? IIl0("뻓ꁽ뺶뺜뼳뽱뼹뼅뿶ꅭ뾣뿌쁝샊쀦쁈샖샓쀤삍", 48791) : IIl0("뾇뻟뻵뺶ꇊ뼒뼅뼘뽻뿀뾪뿌쁆쁃쀧쀀", 48791));
      var2.II(var8, "", 6, null);
      var2.II(IIl0("뾇ꁱ뻵뺠ꇾ뼒뼅뾐뿡뾎뾞뼍쁿", 48791), this.Il1I ? IIl0("뻕ꀛ뺡", 48791) : IIl0("뻃ꀙ뺡", 48791), 7, null);
      var2.II(IIl0("뻔빖뺼뻔븃ꆅ뼥뽐뿜뿅뾤뾀쁧", 48791), "", 8, null);
      var2.II(IIl0("뾇ꁣ뺼뻔뽾ꇗ뼲뽐뿻뿇뼧뾙쀫쁁쀡쀁삧샪삄삣", 48791), this.Il1l ? IIl0("뻕ꀛ뺡", 48791) : IIl0("뻃ꀙ뺡", 48791), 9, null);
      String var9 = this.IIO1 <= 0L && this.IIO_ <= 0L ? IIl0("뻃ꀙ뺡", 48791) : this.IIO_ + IIl0("뺷뺛뻵", 48791) + this.IIO1;
      var2.II(IIl0("뻛ꁻ뺶뻔뽛뽢뽱뼡뿺뽏뾤", 48791), var9, 10, null);
      var2.II(IIl0("뻐뻙뺷뺕뽰뽙", 48791), "", 11, null);
      var2.II(IIl0("뻆뻃뺴뺍뼳뽞ꇰ뼙", 48791), "", 12, null);
      var2.II(this);
      var2.I__0();
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            int var3 = (Integer)var2;
            this.IIIl.I_1O();
            this.IIIl.III(new Integer(var3));
            this.I1II();
            this.II_I();
            break;
         case 2:
            this.IIIl.I_1O();

            for (int var6 = 0; var6 < I1_I.IIO.size(); var6++) {
               I_I_ var5 = (I_I_)I1_I.IIO.elementAt(var6);
               if (!var5.I0I1 && !this.IIIl.III(new Integer(var5.I1ll))) {
                  this.IIIl.III(new Integer(var5.I1ll));
               }
            }

            this.I1II();
            this.II_I();
            break;
         case 3:
            this.Il1 = !this.Il1;
            this.IIOl();
            this.IIIl(IIl0("뻙빟뻵뺧뽺뿘뼤뽐뿞뿛뼬뾅쀱쀊", 48791) + (this.Il1 ? IIl0("뻕ꀛ뺡", 48791) : IIl0("뻃ꀙ뺡", 48791)));
            this.II_I();
         case 4:
         default:
            break;
         case 5:
            this.IllO = false;
            this.Illo = false;
            this.IIIl.I_1O();
            this.II = null;
            Ilol.II().IIII = null;
            Il_.III().II0();
            Il_I.III().II0();
            this.IIIl(IIl0("뾇빕뻵뺠ꆼ뽆뽱뼤뽯뿀뿭뾿샪쁞쁨", 48791));
            this.II_I();
            break;
         case 6:
            this.IlO1 = (this.IlO1 + 1) % 3;
            this.IIOl();
            String var4 = this.IlO1 == 0
               ? IIl0("뻓뻟뻵뺷뽻뽇뼨ꆳ뿡뾎뾙뾄샿쁄쀮쁈샊샏삫삌", 48791)
               : (this.IlO1 == 1 ? IIl0("뻓ꁽ뺶뺜뼳뽱뼹뼅뿶ꅭ뾣", 48791) : IIl0("뾇뻟뻵뺶ꇊ뼒뼅뼘뽻뿀뾪뿌쁆쁃쀧쀀", 48791));
            this.IIIl(var4 + IIl0("뺷뾦븶뻔뽑ꆟ뼥뽑", 48791));
            this.II_I();
            break;
         case 7:
            this.Il1I = !this.Il1I;
            if (this.Il1I && !II10.III().II00) {
               II10.III().II00 = true;
            }

            this.IIOl();
            this.IIIl(IIl0("뾇ꁱ뻵뺠ꇾ뼒뼅뾐뿡뾎뾞뼍쁿쀐쁩", 48791) + (this.Il1I ? IIl0("뻕ꀛ뺡", 48791) : IIl0("뻃ꀙ뺡", 48791)));
            this.II_I();
            break;
         case 8:
            Il1O.III().II_I();
            break;
         case 9:
            this.Il1l = !this.Il1l;
            this.IIOl();
            this.IIIl(IIl0("뾇ꁣ뺼뻔뽾ꇗ뼲뽐뿻뿇뼧뾙쀫쁁쀡쀁삧샪삄삣섹섂", 48791) + (this.Il1l ? IIl0("뻕ꀛ뺡", 48791) : IIl0("뻃ꀙ뺡", 48791)));
            this.II_I();
            break;
         case 10:
            this.I1I_();
            break;
         case 11:
            IIo_.III().II_I();
            break;
         case 12:
            IlI.III().I_1l();
      }
   }

   public I_0o II(int var1) {
      if (I1_I.III == null) {
         return null;
      }

      for (int var2 = 0; var2 < I1_I.III.length; var2++) {
         I_0o var3 = I1_I.III[var2];
         if (var3 != null && var3.II != null && var3.II.IlIO == var1) {
            return var3;
         }
      }

      return null;
   }

   private boolean II(I_0o var1) {
      if (var1.II.l1Ol == 2) {
         return true;
      } else {
         return var1.II.l1Ol != 1 ? Ilol.II().IOl1 >= var1.l1O : Ilol.II().IOl1 >= (long)var1.l1O * Ilol.II().IO1 / 100L;
      }
   }

   public void II(Il_l.II var1) {
      for (int var2 = 0; var2 < var1.IIlO(); var2++) {
         int var3 = (Integer)var1.II(var2);
         I_0o var4 = this.II(var3);
         if (var4 != null) {
            if (Ilol.II().I1_0 || Ilol.II().I_I1) {
               break;
            }

            long var5 = IO10.IIII();
            if (var5 - this.IIOl < 500L) {
               break;
            }

            if (var5 - var4.I1IO >= var4.l1_O && this.II(var4) && var4.II.IoI_ != 1) {
               if (var4.II.IlIO() && var4.II.IlIO == 7) {
                  this.I1I0();
                  return;
               }

               if (var4.II.IlI0()) {
                  I1_I.II().II(var4, true);
                  I1_I.II().II(var4, true);
                  switch (var4.II.IlIO) {
                     case 8:
                        I_0_.II().IIo(8);
                        I_0_.II().III1((byte)1);
                        break;
                     case 12:
                        I_0_.II().IIo(12);
                        I_0_.II().III1((byte)8);
                        break;
                     case 13:
                        I_0_.II().IIo(13);
                        I_0_.II().III1((byte)6);
                        break;
                     case 19:
                        I_0_.II().IIo(19);
                        I_0_.II().III1((byte)9);
                  }

                  var4.I1IO = var5;
                  this.IIOl = var5;
               }
            }

            if (Ilol.II().IOIO == 1 && I1_I.III[5] != null && var4.II.IlIO == 2) {
               break;
            }

            if (var4.II.IoI_ == 1 && var5 - var4.I1IO >= var4.l1_O && this.II(var4)) {
               if (Ilol.II().II != var4) {
                  I_0_.II().IIo(var4.II.IlIO);
                  Ilol.II().II = var4;
               }
               break;
            }
         }
      }
   }

   public void I1IO() {
      Ilol var1 = Ilol.II();
      if (var1 != null && var1.II != null) {
         I101[] var2 = Ilol.II().II;

         for (I101 var5 : var2) {
            if (var5 != null && var5.II.II__ == 212) {
               I_0_.II().II((byte)0, (byte)1, (byte)var5.lIO_, (short)-1);
               return;
            }
         }

         byte var3;
         for (int var6 = 0; var6 < var3; var6++) {
            I101 var7 = var2[var6];
            if (var7 != null && var7.II.II__ == 211) {
               I_0_.II().II((byte)0, (byte)1, (byte)var7.lIO_, (short)-1);
               break;
            }
         }
      }
   }

   private void I1I0() {
      if (Ilol.II().IOIO == 1) {
         byte var1 = Ilol.II().II.II.IlIO;
         I_o1 var2 = new I_o1();
         var2.IlIO = 7;
         I_0o var3 = Ilol.II().II(var2);
         long var4 = IO10.IIII();
         if (var4 - var3.I1IO >= var3.l1_O) {
            I_0_.II().IIo(var2.IlIO);
            I_lO var6 = new I_lO("");
            var6.addElement(Ilol.II());
            I_0_.II().II(new I_lO(), var6, -1);
            var3.I1IO = var4;
            I_0_.II().IIo(var1);
         }
      }
   }
}
