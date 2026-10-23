package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public class II_O extends IIII implements I1_1, I1__, CommandListener {
   private static II_O II;
   private final IlI0 IIII = new IlI0();
   public Form III;
   public Command IIII;
   public Command IIIl;
   public TextField IIIO;
   private boolean IIo0 = false;
   private boolean IIoo = true;
   private boolean Il = false;
   private boolean IlI = false;
   private int Il1O = 50;
   private Il_l.II II = new Il_l.II();
   private Il_l.II III = new Il_l.II();
   private boolean IlII = false;
   private boolean IlIl = false;
   private Il_l.II IIII = new Il_l.II();
   private long II1o = 0L;
   private long II_ = 0L;
   private static final long II_I = 800L;
   private static final long II_l = 550L;
   private static final int Il10 = 64;
   private final int[] II1 = new int[64];
   private final byte[] II = new byte[64];
   private int Il1o = 0;
   private int Il_ = 0;
   private String IIl_ = "";
   private String IIlO = "";
   private String IIl0 = "";

   private II_O() {
   }

   public static II_O II() {
      if (II == null) {
         II = new II_O();
      }

      return II;
   }

   public static II_O III() {
      return II();
   }

   @Override
   protected void II1l() {
      this.IIOI();
      this.IIII.II(new II_0(this, 100L));
      this.IIII.II(new II_o(this, 200L));
      this.IIlo();
   }

   @Override
   protected void II11() {
      this.IIOl();
      this.IIII.I_1O();
   }

   @Override
   protected void II1_() {
      this.IIII.IIlO();
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
   }

   private void IIOI() {
      this.IIo0 = IlIO.III(IIlI("忆徼得恸怜怴怞惮惌悡悉慯", 24502), false);
      this.IIoo = IlIO.III(IIlI("忆徼得恸怜怡怙惬情悌悀慧", 24502), true);
      this.Il = IlIO.III(IIlI("忆徼得恸怜怡怙惬情悏悕慇慃愺愜", 24502), false);
      this.IlI = IlIO.III(IIlI("忆徼得恸怜怾怞惣惗悀悕慂慞愬愅懴", 24502), false);
      this.Il1O = IlIO.II(IIlI("忆徼得恸怜怵怙惼惚悬悂慨慏", 24502), 50);
      if (this.Il1O < 50) {
         this.Il1O = 50;
      }

      if (this.Il1O > 500) {
         this.Il1O = 500;
      }

      this.IIl_ = IlIO.IIII(IIlI("忆徼得恸怜怦怘惦惚您悠慢慙愽", 24502), "");
      this.Il_I();
      this.IIlO = IlIO.IIII(IIlI("忆徼得恸怜怳怜惮惍悦悠慢慙愽", 24502), "");
      this.Il_l();
      this.IlIl = IlIO.III(IIlI("忆徼得恸怜怰怅惻惁悉悞慤慚", 24502), false);
      this.IIl0 = IlIO.IIII(IIlI("忆徼得恸怜怵怂惠惞悁悅慸慞", 24502), "");
      this.Il_1();
   }

   private void Il_I() {
      this.II.I_1O();
      if (!Il_o.III1(this.IIl_)) {
         String[] var1 = Il_o.II(this.IIl_, ';');

         for (int var2 = 0; var2 < var1.length; var2++) {
            try {
               String var3 = var1[var2].trim();
               if (!Il_o.III1(var3)) {
                  int var4 = Integer.parseInt(var3);
                  if (!this.II(this.II, var4)) {
                     this.II.III(new Integer(var4));
                  }
               }
            } catch (Exception var5) {
            }
         }
      }
   }

   private void Il_l() {
      this.III.I_1O();
      if (!Il_o.III1(this.IIlO)) {
         String[] var1 = Il_o.II(this.IIlO, ';');

         for (int var2 = 0; var2 < var1.length; var2++) {
            try {
               String var3 = var1[var2].trim();
               if (!Il_o.III1(var3)) {
                  int var4 = Integer.parseInt(var3);
                  if (!this.II(this.III, var4)) {
                     this.III.III(new Integer(var4));
                  }
               }
            } catch (Exception var5) {
            }
         }
      }
   }

   private void Il_1() {
      this.IIII.I_1O();
      if (!Il_o.III1(this.IIl0)) {
         String[] var1 = Il_o.II(this.IIl0, ';');

         for (int var2 = 0; var2 < var1.length; var2++) {
            try {
               String var3 = var1[var2].trim();
               if (!Il_o.III1(var3)) {
                  int var4 = Integer.parseInt(var3);
                  if (!this.II(this.IIII, var4)) {
                     this.IIII.III(new Integer(var4));
                  }
               }
            } catch (Exception var5) {
            }
         }
      }
   }

   private boolean II(Il_l.II var1, int var2) {
      for (int var3 = 0; var3 < var1.IIlO(); var3++) {
         Integer var4 = (Integer)var1.II(var3);
         if (var4 == var2) {
            return true;
         }
      }

      return false;
   }

   private void IIOl() {
      IlIO.II(IIlI("忆徼得恸怜怴怞惮惌悡悉慯", 24502), this.IIo0);
      IlIO.II(IIlI("忆徼得恸怜怡怙惬情悌悀慧", 24502), this.IIoo);
      IlIO.II(IIlI("忆徼得恸怜怡怙惬情悏悕慇慃愺愜", 24502), this.Il);
      IlIO.II(IIlI("忆徼得恸怜怾怞惣惗悀悕慂慞愬愅懴", 24502), this.IlI);
      IlIO.III(IIlI("忆徼得恸怜怵怙惼惚悬悂慨慏", 24502), this.Il1O);
      IlIO.IIII(IIlI("忆徼得恸怜怦怘惦惚您悠慢慙愽", 24502), this.IIl_);
      IlIO.IIII(IIlI("忆徼得恸怜怳怜惮惍悦悠慢慙愽", 24502), this.IIlO);
      IlIO.II(IIlI("忆徼得恸怜怰怅惻惁悉悞慤慚", 24502), this.IlIl);
      IlIO.IIII(IIlI("忆徼得恸怜怵怂惠惞悁悅慸慞", 24502), this.IIl0);
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   public void II_I() {
      String var1 = this.IIoo ? IIlI("忸徽䅃恧怒急绕惻悎悮繏", 24502) : (this.Il ? IIlI("忢徽徑恼怒怵怑惡惆惭悟懪慉愡", 24502) : IIlI("忽徽开恽恕恱怈恮惍惭懽翀慄愡", 24502));
      String var2 = this.II.IIlO() > 0 ? IIlI("忭", 24502) + this.II.IIlO() + IIlI("徖徼往恶恟怌", 24502) : IIlI("忭征徆绂恜怶怭", 24502);
      String var3 = this.III.IIlO() > 0 ? IIlI("忭", 24502) + this.III.IIlO() + IIlI("徖徼往恶恟怌", 24502) : IIlI("忭征徆绂恜怶怭", 24502);
      String var4 = this.IIII.IIlO() > 0 ? IIlI("忭", 24502) + this.IIII.IIlO() + IIlI("徖徼往恶恟怌", 24502) : IIlI("忭征徆绂恜怶怭", 24502);
      Il1_.II()
         .III()
         .II(IIlI("忢䄤忔愂绫怿怗悯惀悥繛慿", 24502))
         .II(IIlI("忷徠往恼怒怿怘縸惚", 24502), this.IIo0 ? IIlI("忴䅸往", 24502) : IIlI("忢䅺往", 24502), 1, null)
         .II(IIlI("念徽䅋怳愣纈", 24502), var1, 2, null)
         .II(IIlI("念徽䄽怳恜怹织惻悎懜縿愫慉羮愉憧懄罦憊戣扖戩抂我", 24502), this.IlI ? IIlI("忴䅸往", 24502) : IIlI("忢䅺往", 24502), 3, null)
         .II(IIlI("忽徽徛纰恜怶恐惬恏悮悄", 24502), IIlI("忭", 24502) + this.Il1O + IIlI("忆徭復", 24502), 4, null)
         .II(IIlI("忷徠往恼怒性纙惻悎懜縿", 24502), this.IlIl ? IIlI("忴䅸往", 24502) : IIlI("忢䅺往", 24502), 5, null)
         .II(IIlI("忲徴徚恻怒怢悑惬惆惭悂慣羝愽", 24502), var2, 6, null)
         .II(IIlI("忲徴徚恻怒怢悑惬惆惭悇慣懞愧意憧懈憭罓扷", 24502), var3, 7, null)
         .II(IIlI("忲徴徚恻怒怢悑惬惆惭悚翢慞", 24502), var4, 8, null)
         .II(IIlI("忧徠徕恪怒怽绑惦", 24502), "", 999, null)
         .II(this)
         .I__0();
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            this.IIo0 = !this.IIo0;
            this.IIIl(IIlI("忷徠往恼怒怟怘縸惚惷惌", 24502) + (this.IIo0 ? IIlI("忴䅸往", 24502) : IIlI("忢䅺往", 24502)));
            this.IIOl();
            this.II_I();
            break;
         case 2:
            if (this.IIoo) {
               this.IIoo = false;
               this.Il = true;
            } else {
               this.IIoo = true;
               this.Il = false;
            }

            this.IIIl(IIlI("念徽䅋怳愣纈恊悯", 24502) + (this.IIoo ? IIlI("忸徽䅃恧怒急绕惻悎悮繏", 24502) : IIlI("忢徽徑恼怒怵怑惡惆惭悟懪慉愡", 24502)));
            this.IIOl();
            this.II_I();
            break;
         case 3:
            this.IlI = !this.IlI;
            this.IIIl(IIlI("念徽䄽怳恜怹织惻悎懜縿愫慉羮愉憧懄罦憊戣扖戩抂我护抝", 24502) + (this.IlI ? IIlI("忴䅸往", 24502) : IIlI("忢䅺往", 24502)));
            this.IIOl();
            this.II_I();
            break;
         case 4:
            this.III(IIlI("忸徽䅙恣怒怺怘惠縍患悋愫慉憨愋懯憆懭懑戳戏扴扐扏抷", 24502), IIlI("忲徼徇恧恓怿怓惪", 24502));
            break;
         case 5:
            this.IlIl = !this.IlIl;
            this.IIIl(IIlI("忷徠往恼怒怇纙惻悔惭", 24502) + (this.IlIl ? IIlI("忴䅸往", 24502) : IIlI("忢䅺往", 24502)));
            this.IIOl();
            this.II_I();
            break;
         case 6:
            this.Il_o();
            break;
         case 7:
            this.IlO();
            break;
         case 8:
            this.IlOI();
            break;
         case 999:
            IlI.II().I_1l();
      }
   }

   public void Il__() {
      this.III = new Form(IIlI("忲徴徚恻怒怢悑惬惆惭悂慣羝愽", 24502));
      this.III.append(this.IIIO = new TextField(IIlI("忿徑忔恺恆怴思悯悆悎怍慨慂慩愆懯懇憰懄戸戋", 24502), this.IIl_, 500000, 0));
      this.III.addCommand(this.IIII = new Command(IIlI("忺幥征", 24502), 4, 1));
      this.III.addCommand(this.IIIl = new Command(IIlI("忾徠䄃", 24502), 7, 1));
      this.III.setCommandListener(this);
   }

   public void Il_O() {
      this.III = new Form(IIlI("忲徴徚恻怒怢悑惬惆惭悇慣懞愧意憧懈憭罓扷", 24502));
      this.III.append(this.IIIO = new TextField(IIlI("忿徑忔恺恆怴思悯悆悎怍慨慂慩愆懯懇憰懄戸戋", 24502), this.IIlO, 500000, 0));
      this.III.addCommand(this.IIII = new Command(IIlI("忺幥征", 24502), 4, 1));
      this.III.addCommand(this.IIIl = new Command(IIlI("忾徠䄃", 24502), 7, 1));
      this.III.setCommandListener(this);
   }

   public void Il_0() {
      this.III = new Form(IIlI("忲徴徚恻怒怢悑惬惆惭悚翢慞", 24502));
      this.III.append(this.IIIO = new TextField(IIlI("忿徑忔恺恆怴思悯悆悎怍慨慂慩愆懯懇憰懄戸戋", 24502), this.IIl0, 500000, 0));
      this.III.addCommand(this.IIII = new Command(IIlI("忺幥征", 24502), 4, 1));
      this.III.addCommand(this.IIIl = new Command(IIlI("忾徠䄃", 24502), 7, 1));
      this.III.setCommandListener(this);
   }

   private void Il_o() {
      this.Il_ = 1;
      this.Il__();
      Display.getDisplay(GameMidlet.II).setCurrent(this.III);
   }

   private void IlO() {
      this.Il_ = 2;
      this.Il_O();
      Display.getDisplay(GameMidlet.II).setCurrent(this.III);
   }

   private void IlOI() {
      this.Il_ = 3;
      this.Il_0();
      Display.getDisplay(GameMidlet.II).setCurrent(this.III);
   }

   private void III(String var1, String var2) {
      II.II.I__o();
      Ilo_.II().II00 = var1;
      Ilo_.II().II.II1o = var2;
      Ilo_.II().II1o("");
      Ilo_.II().II = this;
   }

   @Override
   public void II(String var1, String var2) {
      String var3 = Ilo_.II().II.IIl1();
      if (Il_o.III1(var3)) {
         this.Illl();
      } else {
         String var4 = Ilo_.II().II.II1o;
         if (var4.equals(IIlI("忲徼徇恧恓怿怓惪", 24502))) {
            this.IIll(var3);
         }
      }
   }

   @Override
   public void Illl() {
      Ilo_ var1 = Ilo_.II();
      var1.II00 = IIlI("念徽徕恧", 24502);
      var1.II.II1o = IIlI("忕徽徕恧", 24502);
      var1.II.IIOl("");
      var1.I_10 = false;
      var1.II = I1_I.II();
      var1.III0 = null;
      this.II_I();
      II.II.I__0();
   }

   private void IIll(String var1) {
      try {
         int var2 = Integer.parseInt(var1.trim());
         if (var2 < 50) {
            var2 = 50;
         }

         if (var2 > 500) {
            var2 = 500;
         }

         this.Il1O = var2;
         this.IIIl(IIlI("忽徽徛纰恜怶恐惬恏悮悄愫慄愡翟懳憜懥", 24502) + this.Il1O + IIlI("忆徭", 24502));
         this.IIOl();
      } catch (NumberFormatException var3) {
         this.IIIl(IIlI("忱徼引怳恆怣纻悯情悥怘慥慍慩愀罤懖懥憈糄戃扡戮戗簳拍拼抈緋挙挬綜掶掀揤揞搧搁摠", 24502));
      }

      this.Illl();
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == this.IIII) {
         try {
            String var3 = this.IIIO.getString().trim();
            if (this.Il_ == 1) {
               this.IIl_ = var3;
               this.Il_I();
               this.IIOl();
               Display.getDisplay(GameMidlet.II).setCurrent(II.II);
               this.IIIl(IIlI("度弶忔恿憂怤恐惫惏患悄愫慙憨愋懯憆憫憌粴扖扻所", 24502) + this.II.IIlO() + IIlI("徖徼往恶恟", 24502));
               this.II_I();
            } else if (this.Il_ == 2) {
               this.IIlO = var3;
               this.Il_l();
               this.IIOl();
               Display.getDisplay(GameMidlet.II).setCurrent(II.II);
               this.IIIl(IIlI("度弶忔恿憂怤恐惫惏患悄愫慙憨愋懯憆憮憌拷扌戦所我拶簊抨拁挺", 24502) + this.III.IIlO() + IIlI("徖徼往恶恟", 24502));
               this.II_I();
            } else if (this.Il_ == 3) {
               this.IIl0 = var3;
               this.Il_1();
               this.IIOl();
               Display.getDisplay(GameMidlet.II).setCurrent(II.II);
               this.IIIl(IIlI("度弶忔恿憂怤恐惫惏患悄愫慙憨愋懯憆憳缍扷战扡", 24502) + this.IIII.IIlO() + IIlI("徖徼往恶恟", 24502));
               this.II_I();
            }
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.II).setCurrent(II.II);
            II.II(IIlI("忺䄂徝怳恙怹怙悯惂慽悙愱愊", 24502) + var4.getMessage());
         }
      }

      if (var1 == this.IIIl) {
         Display.getDisplay(GameMidlet.II).setCurrent(II.II);
         this.II_I();
      }
   }

   public void III_(IO1l var1) {
      if (this.IIo0) {
         Ilol var2 = Ilol.II();
         if (var2 != null) {
            var1.Illl(-16711936);
            int var3 = var2.I_o_ - I1_I.Io1;
            int var4 = var2.I_oO - I1_I.Io1I;

            for (int var5 = 0; var5 < 360; var5++) {
               double var6 = Math.toRadians(var5);
               int var8 = var3 + (int)(this.Il1O * Math.cos(var6));
               int var9 = var4 + (int)(this.Il1O * Math.sin(var6));
               var1.III_(var8, var9, 1, 1);
            }
         }
      }
   }

   private void IlOl() {
      Ilol var1 = Ilol.II();
      if (var1 != null) {
         int var2 = var1.IOIO;
         int var3 = 21 + var2;
         if (IOlO.l1oI == var3) {
            this.IlII = false;
         } else if (!this.IIo0 || I1_I.II_0 == null || I1_I.II_0.size() == 0) {
            this.IlII = false;
         } else if (this.IIlI()) {
            this.IlII = false;
         } else {
            long var4 = IO10.IIII();
            if (var4 - this.II1o >= 550L) {
               Ilol var6 = Ilol.II();
               int var7 = var6.IOI_;
               int var8 = this.Il1O * this.Il1O;
               boolean var9 = false;

               for (int var10 = I1_I.II_0.size() - 1; var10 >= 0; var10--) {
                  I10_ var11 = (I10_)I1_I.II_0.elementAt(var10);
                  if (var11 != null && !this.III_(var11.II.II__)) {
                     if (var11.II.II__ == 74) {
                        this.II(var11);
                        var9 = true;
                        this.IlII = true;
                        this.II1o = var4;
                        return;
                     }

                     if (this.II(var11)) {
                        if (this.IlI) {
                           boolean var12 = var11.IoIO == var7 || var11.IoIO == -1;
                           if (!var12) {
                              continue;
                           }
                        }

                        if (this.III(var11.lI0l) < 10) {
                           int var18 = var6.I_o_ - var11.I1;
                           int var13 = var6.I_oO - var11.I1I;
                           int var14 = var18 * var18 + var13 * var13;
                           if (var14 <= var8) {
                              var9 = true;
                              int var15 = (int)Math.sqrt(var14);
                              if (var15 >= 100) {
                                 var6.I_o_ = var11.I1;
                                 I_0_.II().IoO();
                              } else if (var15 > 60 && var15 < 100) {
                                 var6.II = new I_ll(var11.I1, var11.I1I);
                              }

                              this.II(var11);
                              this.IlII = true;
                              this.II1o = var4;
                              return;
                           }
                        }
                     }
                  }
               }

               if (!var9) {
                  this.IlII = false;
               }
            }
         }
      }
   }

   private void IlO1() {
      if (this.IlIl && this.IIII.IIlO() != 0) {
         long var1 = IO10.IIII();
         if (var1 - this.II_ >= 800L) {
            Ilol var3 = Ilol.II();
            if (var3 != null && var3.II != null) {
               for (int var4 = 0; var4 < var3.II.length; var4++) {
                  I101 var5 = var3.II[var4];
                  if (var5 != null && this.III1(var5.II.II__)) {
                     I_0_.II().II((byte)2, (byte)1, (byte)var4, (short)-1);
                     this.II_ = var1;
                     this.IIIl(IIlI("度弶忔恥绛急恊悯", 24502) + var5.II.II1o);
                     return;
                  }
               }
            }
         }
      }
   }

   private boolean III1(int var1) {
      for (int var2 = 0; var2 < this.IIII.IIlO(); var2++) {
         Integer var3 = (Integer)this.IIII.II(var2);
         if (var3 == var1) {
            return true;
         }
      }

      return false;
   }

   private boolean III_(int var1) {
      for (int var2 = 0; var2 < this.III.IIlO(); var2++) {
         Integer var3 = (Integer)this.III.II(var2);
         if (var3 == var1) {
            return true;
         }
      }

      return false;
   }

   private boolean IIlI() {
      Ilol var1 = Ilol.II();
      if (var1 != null && var1.II != null) {
         for (int var2 = 0; var2 < var1.II.length; var2++) {
            if (var1.II[var2] == null) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void II(I10_ var1) {
      I_0_ var2 = I_0_.II();
      if (var2 != null) {
         var2.IIo1(var1.lI0l);
         this.III1(var1.lI0l);
      }
   }

   private int III(int var1) {
      for (int var2 = 0; var2 < 64; var2++) {
         if (this.II1[var2] == var1) {
            return this.II[var2] & 0xFF;
         }
      }

      return 0;
   }

   private void III1(int var1) {
      for (int var2 = 0; var2 < 64; var2++) {
         if (this.II1[var2] == var1) {
            if (this.II[var2] < 127) {
               this.II[var2]++;
            }

            return;
         }
      }

      this.II1[this.Il1o] = var1;
      this.II[this.Il1o] = 1;
      this.Il1o++;
      if (this.Il1o >= 64) {
         this.Il1o = 0;
      }
   }

   private boolean II(I10_ var1) {
      if (this.III_(var1.II.II__)) {
         return false;
      }

      if (this.IIoo) {
         return true;
      }

      if (this.Il) {
         for (int var2 = 0; var2 < this.II.IIlO(); var2++) {
            Integer var3 = (Integer)this.II.II(var2);
            if (var3 == var1.II.II__) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean IIll() {
      return this.IlII;
   }
}
