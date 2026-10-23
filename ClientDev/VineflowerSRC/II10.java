package main;

public class II10 extends IIII implements I1_1, I1__ {
   private static II10 II;
   private final IlI0 III = new IlI0();
   public boolean II00 = false;
   private boolean II0o = false;
   private boolean IIo = false;
   private boolean IIoI = false;
   private boolean IIol = false;
   private boolean IIo1 = false;
   private boolean IIo_ = false;
   public boolean II_O = false;
   private long II11 = 0L;
   private long II1_ = 0L;
   private int Il1l = 0;
   private long II1O = 0L;
   private int II0_ = -1;
   private boolean IIoO = false;
   private int Il11 = 0;
   private int Il1_ = 0;
   private long II10 = 0L;
   private String IIl1 = IIIo("맥맔릻맓멡뮁며먟뫦ꑈ뫬몀뭢믝묦묀뮦몴묥뮍뱪밁뵑밶뱁", 47510);

   public static II10 II() {
      if (II == null) {
         II = new II10();
      }

      return II;
   }

   public static II10 III() {
      return II();
   }

   private II10() {
   }

   @Override
   protected void II1l() {
      this.IIOI();
      this.III.II(new II1o(this, 1000L));
      this.III.II(new II_(this, 500L));
      this.III.II(new II_I(this, 20L));
      this.III.II(new II_l(this, 100L));
      this.III.II(new II_1(this, 1000L));
      this.III.II(new II__(this, 150L));
      this.IIlo();
   }

   @Override
   protected void II11() {
      this.IIOl();
      this.III.I_1O();
   }

   @Override
   protected void II1_() {
      this.Il1o();
      this.Il1I();
      this.Il1_();
      this.III.IIlO();
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
      this.Il_();
   }

   private void Il1I() {
      if (this.IIol) {
         long var1 = IO10.IIII();
         if (var1 - this.II11 >= 1000L) {
            this.II11 = var1;
            Ilol var3 = Ilol.II();
            if (var3 != null) {
               boolean var4 = this.IIIo();
               if (!var4 && Ilol.II().IIl == 0) {
                  I_0_.II().IIII((byte)1, (byte)8);
               } else if (var4 && Ilol.II().IIl == 8) {
                  I_0_.II().IIII((byte)1, (byte)0);
               }
            }
         }
      }
   }

   private boolean IIIo() {
      if (I1_I.II_O == null) {
         return false;
      }

      for (int var1 = 0; var1 < I1_I.II_O.size(); var1++) {
         Ilol var2 = (Ilol)I1_I.II_O.elementAt(var1);
         if (var2.IIl != 0 && var2.IOI_ > 0) {
            return true;
         }
      }

      return false;
   }

   public void II(String var1, Ilol var2) {
      if (var1 != null && var2 != null) {
         if (var1.toLowerCase().equals(this.IIl1)) {
            if (this.II00) {
               if (var2.IOI_ == Ilol.II().IOI_ * -1) {
                  this.IIo = true;
               }
            }
         }
      }
   }

   private void Il1l() {
      try {
         if (Ilol.II() == null || Ilol.II().IOl_ <= 0) {
            return;
         }

         I_0o var1 = this.II();
         if (var1 == null) {
            return;
         }

         I_0_.II().IIo(var1.II.IlIO);
         I_I_ var2 = this.II();
         if (var2 != null) {
            Ilol.II().III1(var2);
            Ilol.II().II = var1;
            I_lO var3 = new I_lO("");
            var3.addElement(var2);
            I_0_.II().II(var3, new I_lO(""), 1);
         }
      } catch (Exception var4) {
      }
   }

   private I_0o II() {
      for (int var1 = 0; var1 < I1_I.III.length; var1++) {
         I_0o var2 = I1_I.III[var1];
         if (var2 != null && var2.II.IoI_ == 1) {
            return var2;
         }
      }

      return null;
   }

   private I_I_ II() {
      I_I_ var1 = null;
      int var2 = Integer.MAX_VALUE;
      Ilol var3 = Ilol.II();
      if (var3 == null) {
         return null;
      }

      for (int var4 = 0; var4 < I1_I.IIO.size(); var4++) {
         I_I_ var5 = (I_I_)I1_I.IIO.elementAt(var4);
         if (this.II(var5)) {
            int var6 = Ilol.II().I_o_ - var5.I1;
            int var7 = Ilol.II().I_oO - var5.I1I;
            if (var6 < 0) {
               var6 = -var6;
            }

            if (var7 < 0) {
               var7 = -var7;
            }

            int var8 = var6 + var7;
            if (var8 < var2) {
               var2 = var8;
               var1 = var5;
            }
         }
      }

      return var1;
   }

   private boolean II(I_I_ var1) {
      return var1 != null && var1.llIl > 0 && !var1.I0I1 && var1.status > 1;
   }

   private void Il11() {
      if (this.II0o && Ilol.II() != null && !IlO_.II_O()) {
         if (II.IIIO % 60 == 0) {
            Ilol.II().I_oO--;
            I_0_.II().IoO();
         }

         if (II.IIIO % 60 == 30) {
            Ilol.II().I_oO++;
            I_0_.II().IoO();
         }
      }
   }

   public void II(Ilol var1) {
      try {
         I_lO var2 = new I_lO("");
         var2.addElement(var1);
         I_0_.II().II(new I_lO(""), var2, -1);
      } catch (Exception var3) {
      }
   }

   private void Il1_() {
      if (this.IIoO) {
         try {
            switch (this.Il1l) {
               case 0:
                  this.II_O = true;
                  I_0_.II().IoOI();
                  this.II1O = IO10.IIII() + 1000L;
                  this.Il1l = 1;
                  break;
               case 1:
                  if (IO10.IIII() >= this.II1O && !this.II_O && I1_I.II().IlOI != null) {
                     this.II0_ = this.IIIl();
                     if (this.II0_ != -1) {
                        this.IIIl(IIIo("뢆맔릺릔먲멒머먚뫷ꑮ몢뫋뭹뭈묦묀뮦믎뮬뮖밢", 47510) + this.II0_ + IIIo("릸릛맺", 47510));
                        this.Il1l = 2;
                     } else {
                        this.IIIl(IIIo("망망뤠릝멵먑먤몃뫣몍몸몃ꖯ뭐뭨묌믮믐믤뮓뱪볘뱠밷ꊝ볭벝", 47510));
                        this.Il10();
                     }
                  }
                  break;
               case 2:
                  I_0_.II().II0O(this.II0_);
                  this.II1O = IO10.IIII() + 1500L;
                  this.Il1l = 3;
                  break;
               case 3:
                  if (IO10.IIII() >= this.II1O) {
                     if (IOlO.l1ol == this.II0_) {
                        this.IIIl(IIIo("뢆륖맴릐멺멄먩꒬뫠몍몿몊뭤뭎뭨묌믮믐믤", 47510) + this.II0_ + IIIo("릶링림뤓멼멙며먌멺뫃몫뫊", 47510));
                        this.Il10();
                     } else {
                        I_0_.II().II0O(this.II0_);
                        this.II1O = IO10.IIII() + 1500L;
                     }
                  }
            }
         } catch (Exception var2) {
            this.IIIl(IIIo("맚Ꝣ립맓멹멙먹멏뮟ꑸ몥뫋뭡뭁묽뭆", 47510));
            this.Il10();
         }
      }
   }

   private void Il1O() {
      if (this.IIl()) {
         this.IIoO = true;
         this.Il1l = 0;
         this.II0_ = -1;
         this.IIIl(IIIo("맆망뤵릇먲멙먹꒨뫠몍몮몄뭹뭚뭩뭇믅믍뮱ꕊ뱬밁밢ꊔ뱞붌ꉩ벲볚뵲뵐봢뵘붻붚", 47510));
      }
   }

   private void Il10() {
      this.IIoO = false;
      this.Il1l = 0;
      this.II0_ = -1;
   }

   private int IIIl() {
      try {
         if (I1_I.II().IlOI != null && I1_I.II().IlOI.length != 0) {
            int var1 = IOlO.l1ol;
            int[] var2 = I1_I.II().IlOI;
            int var3 = -1;

            for (int var4 = 0; var4 < var2.length; var4++) {
               if (var2[var4] == var1) {
                  var3 = var4;
                  break;
               }
            }

            if (var3 == -1) {
               return var2[0];
            }

            int var6 = var3 + 1;
            if (var6 >= var2.length) {
               var6 = 0;
            }

            return var2[var6];
         } else {
            return -1;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return -1;
      }
   }

   private boolean IIl() {
      for (int var1 = 0; var1 < I1_I.II_O.size(); var1++) {
         Ilol var2 = (Ilol)I1_I.II_O.elementAt(var1);
         if (this.II(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean II(Ilol var1) {
      if (var1 == null || var1.IIO1 == null || var1.IIO1.equals("")) {
         return false;
      }

      if (!var1.I_ && !var1.I_I) {
         if (var1.IIO1.equals(IIIo("맂맇ꜙ릝멵먑먤몏뫧", 47510))) {
            return false;
         } else if (var1.IIO1.startsWith(IIIo("릵", 47510)) || var1.IIO1.startsWith(IIIo("릲", 47510))) {
            return false;
         } else if (var1.IOl_ <= 0) {
            return false;
         } else if (var1.I_o_ >= IOlO.IIO() - 10) {
            return false;
         } else {
            return var1.I_oO >= IOlO.IIOI() - 10 ? false : Character.isUpperCase(var1.IIO1.charAt(0));
         }
      } else {
         return false;
      }
   }

   private void Il1o() {
      if (this.IIo_) {
         Ilol var1 = Ilol.II();
         if (var1 == null) {
            return;
         }

         if (Ilol.II().IO_ + Ilol.II().IO_I > 0 && Ilol.II().I_I_ && Ilol.II().IOl_ <= 0 && II.IIIO % 20 == 0) {
            I_0_.II().IoO1();
            Ilol.II().I_I_ = false;
            Ilol.II().IOIl = 1;
            Ilol.II().IOl_ = Ilol.II().IOlo;
            Ilol.II().IOl1 = Ilol.II().IO1;
            Ilol.II().IO = 0;
            Ilol.II().IOI = 0;
            Ilol.II().IOII = 0;
            I_0.II(109, Ilol.II(), 2);
            I1_I.II().III0 = null;
            I1_I.I_0l = true;
         }
      }
   }

   public void II_I() {
      String var1 = this.Il11 > 0 ? IIIo("맍", 47510) + this.Il11 + IIIo("릳맨", 47510) : IIIo("맂ꜚ릠", 47510);
      String var2 = this.Il1_ > 0 ? IIIo("맍", 47510) + this.Il1_ + IIIo("릳맨", 47510) : IIIo("맂ꜚ릠", 47510);
      String var3 = this.II10 > 0L ? IIIo("맍", 47510) + this.II10 + IIIo("맋", 47510) : IIIo("맂ꜚ릠", 47510);
      Il1_.II()
         .III()
         .II(IIIo("맗맀릠릜먲멡먵먛", 47510))
         .II(IIIo("맆말릠맓멳멅먤먎뫭뫆", 47510), this.II00 ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510), 1, null)
         .II(IIIo("맗맀릠릜먲멺먿먄", 47510), this.II0o ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510), 2, null)
         .II(IIIo("맂맇ꜟ맓멦멙믠믎뫠뫊", 47510), this.IIoI ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510), 3, null)
         .II(IIIo("맗맀릠릜먲멒\ua48d멏뮟뫈몢", 47510), this.IIol ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510), 4, null)
         .II(IIIo("맘륜맴릑멽멂먣", 47510), this.IIo1 ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510), 5, null)
         .II(IIIo("맒륌릺릔먲묠ꓽ먚몮뮼ꐋ뫋뭩믛묦뭇믎믵", 47510), var1, 6, null)
         .II(IIIo("맒륌릺릔먲묠ꓽ먚몮뮼ꐋ뫋뭩믛묦뭇믋믵", 47510), var2, 7, null)
         .II(IIIo("맂망릻뤒멦먑먻먇뫧몍몟몦묪머ꖏ", 47510), var3, 8, null)
         .II(IIIo("맂Ꝅ맴룢\ua4cb멟먷멏뫦ꑾ몥뫋뭹뭀묦묏뮦믋뮣ꔮ뱡", 47510), this.IIo_ ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510), 9, null)
         .II(IIIo("맇맀릵릊먲멝ꓱ먆", 47510), "", 99, null)
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
            this.II00 = !this.II00;
            this.IIIl(IIIo("맆말릠맓멦꓀며뭾멯뫃몤뫑묪", 47510) + (this.II00 ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510)));
            this.IIOl();
            this.II_I();
            break;
         case 2:
            this.II0o = !this.II0o;
            this.IIIl(IIIo("맗맀릠릜먲멺먿먄몴몍", 47510) + (this.II0o ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510)));
            this.IIOl();
            this.II_I();
            break;
         case 3:
            this.IIoI = !this.IIoI;
            this.IIIl(IIIo("맂맇ꜟ맓멦멙믠믎뫠뫊뫶뫋", 47510) + (this.IIoI ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510)));
            this.IIOl();
            this.II_I();
            break;
         case 4:
            this.IIol = !this.IIol;
            this.IIIl(IIIo("맗맀릠릜먲멒\ua48d멏뮟뫈몢뫑묪", 47510) + (this.IIol ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510)));
            this.IIOl();
            this.II_I();
            break;
         case 5:
            this.IIo1 = !this.IIo1;
            this.IIIl(IIIo("맘륜맴릑멽멂먣멕몮", 47510) + (this.IIo1 ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510)));
            this.IIOl();
            this.II_I();
            break;
         case 6:
            this.III(IIIo("맘망Ꝺ릃먲먔며먧뫞몍몼몎뭾묉뭠뭗뮫뮔믴믓밫", 47510), IIIo("맞맥맴릣멷멅", 47510));
            break;
         case 7:
            this.III(IIIo("맘망Ꝺ릃먲먔며먢뫞몍몼몎뭾묉뭠뭗뮫뮔믴믓밫", 47510), IIIo("맛맥맴릣멷멅", 47510));
            break;
         case 8:
            this.III(IIIo("맘망Ꝺ릃먲멂꒹먌몮뫀ꑭ명뭢묉물ꖖ뮦믑뮬뮌볣뱕", 47510), IIIo("맅맸맴릣멷멅", 47510));
            break;
         case 9:
            this.IIo_ = !this.IIo_;
            this.IIIl(IIIo("맂Ꝅ맴룢\ua4cb멟먷멏뫦ꑾ몥뫋뭹뭀묦묏뮦믋뮣ꔮ뱡받뱠", 47510) + (this.IIo_ ? IIIo("맔ꜘ릠", 47510) : IIIo("맂ꜚ릠", 47510)));
            this.IIOl();
            this.II_I();
            break;
         case 99:
            IlI.II().I_11();
      }
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
      if (var3 != null && !Il_o.III1(var3)) {
         String var4 = Ilo_.II().II00;
         if (var4.equals(IIIo("맘망Ꝺ릃먲먔며먧뫞몍몼몎뭾묉뭠뭗뮫뮔믴믓밫", 47510))) {
            this.IIIo(var3);
         } else if (var4.equals(IIIo("맘망Ꝺ릃먲먔며먢뫞몍몼몎뭾묉뭠뭗뮫뮔믴믓밫", 47510))) {
            this.IIl(var3);
         } else if (var4.equals(IIIo("맘망Ꝺ릃먲멂꒹먌몮뫀ꑭ명뭢묉물ꖖ뮦믑뮬뮌볣뱕", 47510))) {
            this.IIlI(var3);
         }
      } else {
         this.Illl();
      }
   }

   private void IIIo(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         this.Il11 = this.II(var2);
         this.IIIl(IIIo("맞맥맴룢ꓕ먑먴몖뫠뫊뫬믺ꖧ뭜뭲뭇", 47510) + this.Il11 + IIIo("릳", 47510));
         this.IIOl();
      } catch (Exception var3) {
         this.IIIl(IIIo("맑맜뤵맓멦멃꒛멏뫥뫅머명뭭묉묠ꖄ믶뮅뮨ꔤ밣", 47510));
      }

      this.Illl();
   }

   private void IIl(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         this.Il1_ = this.II(var2);
         this.IIIl(IIIo("맛맥맴룢ꓕ먑먴몖뫠뫊뫬믺ꖧ뭜뭲뭇", 47510) + this.Il1_ + IIIo("릳", 47510));
         this.IIOl();
      } catch (Exception var3) {
         this.IIIl(IIIo("맑맜뤵맓멦멃꒛멏뫥뫅머명뭭묉묠ꖄ믶뮅뮨ꔤ밣", 47510));
      }

      this.Illl();
   }

   private void IIlI(String var1) {
      try {
         long var2 = Long.parseLong(var1);
         if (var2 < 0L) {
            var2 = 0L;
         }

         this.II10 = var2;
         this.IIIl(IIIo("맅맸맴릇ꓣ먑먤먇뫡멌몸뫑묪", 47510) + this.II10);
         this.IIOl();
      } catch (Exception var4) {
         this.IIIl(IIIo("맑맜뤵맓멦멃꒛멏뫥뫅머명뭭묉묠ꖄ믶뮅뮨ꔤ밣", 47510));
      }

      this.Illl();
   }

   private int II(int var1) {
      if (var1 < 0) {
         return 0;
      } else {
         return var1 > 100 ? 100 : var1;
      }
   }

   @Override
   public void Illl() {
      Ilo_ var1 = Ilo_.II();
      var1.II00 = IIIo("맕망릵릇", 47510);
      var1.II.II1o = IIIo("맵망릵릇", 47510);
      var1.II.Ill(0);
      var1.II.IIOl("");
      var1.I_10 = false;
      var1.II = I1_I.II();
      var1.III0 = null;
      this.II_I();
      II.II.I__0();
   }

   private void Il_() {
      this.II00 = false;
      this.II0o = false;
      this.IIoI = false;
      this.IIol = false;
      this.IIo1 = false;
      this.IIo_ = false;
      this.Il10();
   }

   private void IIOI() {
      this.II00 = IlIO.III(IIIo("맦말릠망멳멄먤먀뫏뫙몸몊뭩뭂", 47510), false);
      this.II0o = IlIO.III(IIIo("맦말릠망멹멞먻", 47510), false);
      this.IIoI = IlIO.III(IIIo("맦말릠망멺메먱먃", 47510), false);
      this.IIol = IlIO.III(IIIo("맦말릠망면멝먱먈", 47510), false);
      this.IIo1 = IlIO.III(IIIo("맦말릠망멼메먒먀뫽뫞", 47510), false);
      this.IIo_ = IlIO.III(IIIo("맦말릠망멠메먦먆뫸뫈몋몎뭧뭚", 47510), false);
      this.Il11 = IlIO.II(IIIo("맦말릠망멺멁", 47510), 0);
      this.Il1_ = IlIO.II(IIIo("맦말릠망멿멁", 47510), 0);
      this.II10 = IlIO.II(IIIo("맦말릠망멡멜", 47510), (long)0L);
      this.Il11 = this.II(this.Il11);
      this.Il1_ = this.II(this.Il1_);
      if (this.II10 < 0L) {
         this.II10 = 0L;
      }
   }

   private void IIOl() {
      IlIO.II(IIIo("맦말릠망멳멄먤먀뫏뫙몸몊뭩뭂", 47510), this.II00);
      IlIO.II(IIIo("맦말릠망멹멞먻", 47510), this.II0o);
      IlIO.II(IIIo("맦말릠망멺메먱먃", 47510), this.IIoI);
      IlIO.II(IIIo("맦말릠망면멝먱먈", 47510), this.IIol);
      IlIO.II(IIIo("맦말릠망멼메먒먀뫽뫞", 47510), this.IIo1);
      IlIO.II(IIIo("맦말릠망멠메먦먆뫸뫈몋몎뭧뭚", 47510), this.IIo_);
      IlIO.III(IIIo("맦말릠망멺멁", 47510), this.Il11);
      IlIO.III(IIIo("맦말릠망멿멁", 47510), this.Il1_);
      IlIO.II(IIIo("맦말릠망멡멜", 47510), (long)this.II10);
   }
}
