package main;

import java.util.Calendar;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public class IIlo implements I1_1, CommandListener {
   private static IIlo II;
   public boolean IIO0 = false;
   private int II0o = 0;
   private long IIll = 0L;
   private long IIl1 = 0L;
   public long IIl_ = 0L;
   public boolean IIOo = false;
   public int IlI_;
   public int IlIO;
   private long IIlO = 0L;
   private static final long IIl0 = 2000L;
   private static final long IIlo = 750L;
   private static final long II1 = 30000L;
   private static final long II1I = 15000L;
   private IlI0 II = new IlI0();
   public Form IIII;
   public Command III1;
   public Command III_;
   public TextField IIIl;
   public TextField III1;
   private boolean II0 = false;
   private String IIl = IIIO("뙫뙍뚥뚅", 46680);
   private String IIlI = IIIO("뙭뙍뚦뚅", 46680);
   private int IlI0 = 3;
   private int IlIo = 30;
   private int Ill = 5;
   private int IllI = 0;
   private boolean II0I = false;
   private boolean II0l = false;

   public static IIlo II() {
      if (II == null) {
         II = new IIlo();
      }

      return II;
   }

   public static IIlo III() {
      return II();
   }

   private IIlo() {
      this.IIoI();
      this.IIl0();
   }

   private void IIoI() {
      this.IlIO();
      this.II.II(new II1(this, 10000L));
   }

   public void II_I() {
      Il1_.II()
         .III()
         .II(IIIO("똓\ua8c8뛢뚕뚺ꠢ띻", 46680))
         .II(IIIO("똌ꢆ뚶뛞ꡫ뚇뜲띟ꦁ뜆랮럁ꥭ랂", 46680), this.IIO0 ? IIIO("똚\ua8da뛢", 46680) : IIIO("똌꣘뛢", 46680), 1, null)
         .II(IIIO("똔럇뛣뚕뚿뚛띧뜑뜸뜆ꥉ럃러랟ꚫ례", 46680), this.IIOo ? IIIO("똚\ua8da뛢", 46680) : IIIO("똌꣘뛢", 46680), 2, null)
         .II(IIIO("똙똂뛢뛚뛴뚼라띾뜖뜩", 46680), this.II0 ? IIIO("똚\ua8da뛢", 46680) : IIIO("똌꣘뛢", 46680), 3, null)
         .II(IIIO("똌똞뛻뛐", 46680), IIIO("똌꣘뛢뚏뛴", 46680) + this.IIl + IIIO("뙸똵\ua83b뛁뛮뛓", 46680) + this.IIlI, 4, null)
         .II(IIIO("똉똂뛷뛌뛴뚟꦳띘", 46680), "", 99, null)
         .II(this)
         .I__0();
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            this.IIO0 = !this.IIO0;
            this.IIIl(IIIO("똌ꢆ뚶뛞ꡫ뚇뜲띟ꦁ뜆랮럁ꥭ랂렰렉", 46680) + (this.IIO0 ? IIIO("똚\ua8da뛢", 46680) : IIIO("똌꣘뛢", 46680)));
            this.II_I();
            break;
         case 2:
            this.IIOo = !this.IIOo;
            if (this.IIOo) {
               this.IlIO = IOlO.l1oI;
               this.IlI_ = IOlO.l1ol;
            }

            this.IIIl(IIIO("똔럇뛣뚕뚿뚛띧뜑뜸뜆ꥉ럃러랟ꚫ례롲롇", 46680) + (this.IIOo ? IIIO("똚\ua8da뛢", 46680) : IIIO("똌꣘뛢", 46680)));
            this.II_I();
            break;
         case 3:
            this.II0 = !this.II0;
            this.IlI0();
            this.IIIl(IIIO("똙똂뛢뛚뛴뚼라띾뜖뜩랴랍", 46680) + (this.II0 ? IIIO("똚\ua8da뛢", 46680) : IIIO("똌꣘뛢", 46680)));
            if (this.II0) {
               this.IlIl();
            }

            this.II_I();
            break;
         case 4:
            this.IlI_();
            break;
         case 99:
            IlI.III().I_11();
      }
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   public void IIol() {
      if (this.IIO0) {
         String var1 = I_O1.IIl(IIIO("똹똔뛵", 46680));
         String var2 = I_O1.IIl(IIIO("똨똖뛥뛆", 46680));
         if (!Il_o.III1(var1) && !Il_o.III1(var2)) {
            II.II.Io_();
            if (!I_0O.II().IlI_()) {
               II.II();
            }

            I_0_.II().II(var1, var2, IIIO("뙩뙙뚦뚛뛦", 46680), (byte)(I1o_.IOo ? 1 : 0));
            this.IIl_ = IO10.IIII() + 30000L;
         }
      }
   }

   public void IIlO() {
      this.II.IIlO();
      if (this.IIOo) {
         long var1 = IO10.IIII();
         if (IOlO.l1ol != this.IlI_ && IOlO.l1oI == this.IlIO && var1 - this.IIlO >= 2000L) {
            I_0_.II().II0O(this.IlI_);
            this.IIlO = var1;
         }
      }

      if (this.IIO0) {
         if (II.II instanceof I1o_ && this.IIl_ < IO10.IIII() && !I_0O.II().IlI_()) {
            this.IIol();
         } else {
            switch (this.II0o) {
               case 0:
               default:
                  this.IIo1();
                  break;
               case 1:
                  if (IO10.IIII() - this.IIl1 <= 750L) {
                     return;
                  }

                  this.IIl1 = IO10.IIII();
                  this.IIo_();
                  break;
               case 2:
                  if (IO10.IIII() - this.IIl1 <= 750L) {
                     return;
                  }

                  this.IIl1 = IO10.IIII();
                  this.IIoO();
                  break;
               case 3:
                  if (IO10.IIII() - this.IIl1 <= 750L) {
                     return;
                  }

                  this.IIl1 = IO10.IIII();
                  this.IIo0();
                  break;
               case 4:
                  if (IO10.IIII() - this.IIl1 <= 750L) {
                     return;
                  }

                  this.IIl1 = IO10.IIII();
                  this.IIoo();
            }
         }
      }
   }

   private void IIo1() {
      if (!(II.II instanceof I1o_)) {
         if (!(II.II instanceof I1_I) || !I_0O.II().IlI_()) {
            if (!I_0O.II().IlI_()) {
               this.IIll = IO10.IIII();
               II.II.I0l_();
               II.II(IIIO("띈똖뛸뛒뛴뚇띺\ua9dc띰뜄ꤱ럙러랅ꛛ례롨렋꘧료룤뢐륣륔률륬륎맮릝", 46680));
               this.II0o = 1;
            }
         }
      }
   }

   private void IIo_() {
      if (II.II instanceof I1_I) {
         this.II0o = 0;
      } else {
         long var1 = (30000L - (IO10.IIII() - this.IIll)) / 1000L;
         if (var1 > 0L) {
            II.II(IIIO("똌똟\ua87b뚕뚿ꡌ띦뜑뜾ꦾ럧랍랠ꥊ롣렉렻렆룳뢅", 46680) + var1 + IIIO("똫뙖", 46680));
         }

         if (IO10.IIII() - this.IIll >= 30000L) {
            this.II0o = 2;
            this.IIll = IO10.IIII();
         }
      }
   }

   private void IIoO() {
      if (II.II instanceof I1_I) {
         this.II0o = 0;
      } else {
         if (II.II instanceof I1o_) {
            II.II.I0l_();
         }

         if (I_0O.II().IlI_()) {
            I_0O.II().close();
            this.IIll = IO10.IIII() - 30000L + 1500L;
            this.II0o = 1;
         } else if (I_0O.II().I0OI) {
            II.II(IIIO("띈똖뛸뛒뛴뚘ꦭ띅띰뜁꥟럄럭", 46680));
         } else {
            if (II.II == null) {
               II.II = new I1o_();
            }

            II.II();
            this.IIll = IO10.IIII();
            this.II0o = 3;
         }
      }
   }

   private void IIo0() {
      if (II.II instanceof I1_I) {
         this.II0o = 0;
      } else if (I_0O.II().IlI_()) {
         II.II(IIIO("똓\ua8c8뛢뚕뚺ꠢ띻뜑뜤뜇띮럃랤럋롩룝렦렀뢧", 46680));
         this.II0o = 4;
      } else if (IO10.IIII() - this.IIll > 15000L) {
         II.II(IIIO("또\ua8c8뛢뚕뚠뚛ꧏ띘띰뜈럧럌랢럋롩롁ꚕ롇룭ꘚ뢰룃륬\ua7f0뤩륳륞맩맔Ꜷ맚멵꒙먾멘못몚", 46680));
         this.IIll = IO10.IIII();
         this.II0o = 1;
      } else {
         II.II(IIIO("띈똖뛸뛒뛴뚘ꦭ띅띰뜁꥟럄럢럅려", 46680));
      }
   }

   private void IIoo() {
      if (II.II instanceof I1_I) {
         this.II0o = 0;
      } else if (!I_0O.II().IlI_()) {
         II.II(IIIO("똕꣒뛢뚕뚿ꡌ띦뜑뜾ꦾ럧랍랸랃ꛧ렉려ꛆ룯뢄", 46680));
         this.II0o = 1;
         this.IIll = IO10.IIII();
      } else {
         I_0_.II().Io__();
         II.II.II(3, null);
         this.IIll = IO10.IIII();
         this.II0o = 0;
      }
   }

   private void Il() {
      try {
         Calendar var1 = Calendar.getInstance();
         int var2 = var1.get(11);
         int var3 = var1.get(12);
         if (var2 == this.IlI0 && var3 == this.IlIo && !this.II0I) {
            this.IlI();
            this.II0I = true;
            this.II0l = false;
         }

         if (var2 == this.Ill && var3 == this.IllI && !this.II0l) {
            this.IlII();
            this.II0l = true;
            this.II0I = false;
         }

         if ((var2 != this.IlI0 || var3 != this.IlIo) && this.II0I) {
            this.II0I = false;
         }

         if ((var2 != this.Ill || var3 != this.IllI) && this.II0l) {
            this.II0l = false;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private void IlI() {
      try {
         this.IIO0 = false;
         I_0O.II().close();
         II.II.IIl();
         II.II = II.II;
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private void IlII() {
      try {
         this.IIO0 = true;
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private void IlIl() {
      this.II0I = false;
      this.II0l = false;
   }

   public void IlI1() {
      this.IIII = new Form(IIIO("똛뚗뛿뚕럅ꡄ띦뜑뜤뜇꥓럄러람롣롈렦", 46680));
      this.IIII.append(this.IIIl = new TextField(IIIO("똌꣘뛢뚕뚳뚒띿띔띰띇럆럥럶랦롇렀", 46680), this.IIl, 10, 0));
      this.IIII.append(this.III1 = new TextField(IIIO("똚\ua8da뛢뚕뚳뚒띿띔띰띇럆럥럶랦롇렀", 46680), this.IIlI, 10, 0));
      this.IIII.addCommand(this.III1 = new Command(IIIO("똔럇뛣", 46680), 4, 1));
      this.IIII.addCommand(this.III_ = new Command(IIIO("또똂ꡡ", 46680), 3, 1));
      this.IIII.setCommandListener(this);
   }

   private void IlI_() {
      this.IlI1();
      Display.getDisplay(GameMidlet.II).setCurrent(this.IIII);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == this.III1) {
         try {
            String var3 = this.IIIl.getString().trim();
            if (this.II(var3, true)) {
               this.IIl = var3;
            }

            String var4 = this.III1.getString().trim();
            if (this.II(var4, false)) {
               this.IIlI = var4;
            }

            this.IlI0();
            this.IlIl();
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            this.IIIl(IIIO("띈뚔뚶뛙띤뚆뜨뜑뜄꧀럺랍", 46680) + this.IIl + IIIO("뙸뙚뚶뛷\ua879뚇뜲", 46680) + this.IIlI);
            this.II_I();
         } catch (Exception var5) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            I1_I.II.IIII(IIIO("똔ꢠ뛿뚏뛴", 46680) + var5.getMessage(), 0);
         }
      }

      if (var1 == this.III_) {
         Display.getDisplay(GameMidlet.II).setCurrent(II.II);
         this.II_I();
      }
   }

   private boolean II(String var1, boolean var2) {
      try {
         String[] var3 = Il_o.II(var1, ':');
         if (var3.length != 2) {
            throw new Exception(IIIO("띈ꢼ뛸뛝뛴뚗꦳띟뜷띏럾럅ꥯ랂렪롅뢨롇룎룭룾뢮륏", 46680));
         }

         int var4 = Integer.parseInt(var3[0].trim());
         int var5 = Integer.parseInt(var3[1].trim());
         if (var4 >= 0 && var4 <= 23 && var5 >= 0 && var5 <= 59) {
            if (var2) {
               this.IlI0 = var4;
               this.IlIo = var5;
            } else {
               this.Ill = var4;
               this.IllI = var5;
            }

            return true;
         } else {
            throw new Exception(IIIO("똟똞ꡋ뚕뚤뚛ꦱ띘띰뜛ꥥ랍럼럆렸렚롤롇룶룍렾뢗뤢륕Ɜ륿륎린릉맢", 46680));
         }
      } catch (Exception var6) {
         I1_I.II.IIII(IIIO("똔ꢠ뛿뚕럅꠸라띙띰뜋꤯럃랫럋롾롁ꚕ렎뢦룂뢭뢂륬뤛률", 46680) + var6.getMessage(), 0);
         return false;
      }
   }

   private void IlIO() {
      this.II0 = IlIO.III(IIIO("똹똂뛢뛚뚻뚝락띗뜶띁럫럃랭랉롦롌렬", 46680), false);
      this.IIl = IlIO.IIII(IIIO("똹똂뛢뛚뚻뚝락띗뜶띁럡럋랪랟롣롄렭", 46680), IIIO("뙫뙍뚥뚅", 46680));
      this.IIlI = IlIO.IIII(IIIO("똹똂뛢뛚뚻뚝락띗뜶띁럡럃랸랂롧롌", 46680), IIIO("뙭뙍뚦뚅", 46680));
      this.II(this.IIl, true);
      this.II(this.IIlI, false);
   }

   private void IlI0() {
      IlIO.II(IIIO("똹똂뛢뛚뚻뚝락띗뜶띁럫럃랭랉롦롌렬", 46680), this.II0);
      IlIO.IIII(IIIO("똹똂뛢뛚뚻뚝락띗뜶띁럡럋랪랟롣롄렭", 46680), this.IIl);
      IlIO.IIII(IIIO("똹똂뛢뛚뚻뚝락띗뜶띁럡럃랸랂롧롌", 46680), this.IIlI);
   }

   public void IIl0() {
      this.IlI0();
      this.II.I_1O();
   }
}
