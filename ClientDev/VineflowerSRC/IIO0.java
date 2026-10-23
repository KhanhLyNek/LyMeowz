package main;

public class IIO0 extends IIII implements I1_1, I1__ {
   private static IIO0 II;
   private final IlI0 IIIl = new IlI0();
   public boolean IllI;
   public boolean Illl;
   public boolean[] III1 = new boolean[10];
   private long[] II = new long[10];
   private long[] III = new long[10];
   private boolean Ill1 = false;
   private int IlOl;
   private boolean Ill_ = false;
   private boolean[] III_ = new boolean[10];
   private long II_1 = 0L;
   private long II__ = 0L;
   private long II_O = 0L;
   private long[] IIII = new long[10];
   private static final long II_0 = 5000L;
   private static final long II_o = 2600L;
   private static final long IIO = 11000L;
   private static final long IIOI = 150L;

   private IIO0() {
   }

   public static IIO0 II() {
      if (II == null) {
         II = new IIO0();
      }

      return II;
   }

   public static IIO0 III() {
      return II();
   }

   @Override
   protected void II1l() {
      this.IIOI();
      this.IIIl.II(new IIOo(this, 100L));
      this.IIIl.II(new II0(this, 1000L));
      this.IIIl.II(new II0I(this, 0L));
      this.IIlo();
   }

   @Override
   protected void II11() {
      this.IIOl();
      this.IIIl.I_1O();
   }

   @Override
   protected void II1_() {
      this.IIIl.IIlO();
      if (!Ilol.II().I_I_) {
         for (int var1 = 0; var1 < I1_I.III.length; var1++) {
            if (this.III1[var1]) {
               this.IIIO(var1);
            }
         }
      }
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
   }

   private void IIOI() {
      this.IllI = IlIO.III(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda65\uda3b\uda07\udaf3\udac3\udab1", 55582), false);
      this.Ill1 = IlIO.III(
         IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9b9\ud982\uda62\uda5a\uda17\uda1b\udaf3\udadf\udab7\uda8a\udb48\udb42\udb2f\udb1e\udbf9", 55582), false
      );
      this.Ill_ = IlIO.III(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ba\ud998\uda78\uda52\uda20\uda12\udafb", 55582), false);

      for (int var1 = 0; var1 < 10; var1++) {
         this.III1[var1] = IlIO.III(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda66\uda3f\uda1a\udafe\udadd", 55582) + var1, false);
         this.II[var1] = IlIO.II(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ac\ud99e\uda7b\uda50\uda07\uda18\udafb\udadd\udabc", 55582) + var1, 500);
         this.III_[var1] = IlIO.III(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9be\ud985\uda79\uda4f\uda31\uda1d", 55582) + var1, false);
      }
   }

   private void IIOl() {
      IlIO.II(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda65\uda3b\uda07\udaf3\udac3\udab1", 55582), this.IllI);
      IlIO.II(
         IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9b9\ud982\uda62\uda5a\uda17\uda1b\udaf3\udadf\udab7\uda8a\udb48\udb42\udb2f\udb1e\udbf9", 55582),
         this.Ill1
      );
      IlIO.II(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ba\ud998\uda78\uda52\uda20\uda12\udafb", 55582), this.Ill_);

      for (int var1 = 0; var1 < 10; var1++) {
         IlIO.II(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ad\ud984\uda73\uda66\uda3f\uda1a\udafe\udadd", 55582) + var1, this.III1[var1]);
         IlIO.III(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9ac\ud99e\uda7b\uda50\uda07\uda18\udafb\udadd\udabc", 55582) + var1, (int)this.II[var1]);
         IlIO.II(IIlO("\ud96d\ud956\ud935\ud917\ud9f6\ud997\ud9be\ud985\uda79\uda4f\uda31\uda1d", 55582) + var1, this.III_[var1]);
      }
   }

   private void Il0_() {
      for (int var1 = 0; var1 < I1_I.III.length; var1++) {
         if (this.III_[var1] && I1_I.III[var1] != null) {
            I1_I.III[var1].l1_O = 0;
            I1_I.III[var1].l1O = 0;
         }
      }
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   private void Il0O() {
      if (this.IllI && !Ilol.II().I11l) {
         for (int var1 = 0; var1 < Ilol.II().II.length; var1++) {
            I101 var2 = Ilol.II().II[var1];
            if (var2 != null && (var2.II.II__ == 454 || var2.II.II__ == 921 || var2.II.II__ == 1884)) {
               I_0_.II().II((byte)0, (byte)1, (byte)var2.lIO_, (short)-1);
               break;
            }
         }
      }
   }

   private void Il00() {
      if (this.Ill1) {
         long var1 = IO10.IIII();
         if (var1 - this.II_1 >= 5000L) {
            this.II_1 = var1;
            Ilol.II().IOo_();
         }
      }
   }

   public int IIIO() {
      short var1 = -1;
      I101[] var2 = Ilol.II().II;

      for (int var3 = 0; var3 < var2.length; var3++) {
         I101 var4 = var2[var3];
         if (var4 != null) {
            short var5 = var4.II.II__;
            if (var5 == 1884) {
               return 1884;
            }

            if ((var5 == 454 || var5 == 921) && var5 > var1) {
               var1 = var5;
            }
         }
      }

      return var1;
   }

   private void Il0o() {
      if (this.Ill_) {
         if (!Ilol.II().I_I_ && this.IIIO() != -1) {
            long var1 = IO10.IIII();
            long var3 = Ilol.II().I11l ? 11000L : 2600L;
            if (var1 - this.II__ >= var3) {
               this.II__ = var1;
               int var5 = this.II(this.IIIO()).lIO_;
               I_0_.II().II((byte)0, (byte)1, (byte)var5, (short)-1);
               Ilol.II().I11l = !Ilol.II().I11l;
            }
         } else {
            this.Ill_ = false;
         }
      }
   }

   public I101 II(int var1) {
      for (int var2 = 0; var2 < Ilol.II().II.length; var2++) {
         if (Ilol.II().II[var2] != null && Ilol.II().II[var2].II.II__ == var1) {
            return Ilol.II().II[var2];
         }
      }

      return null;
   }

   @Override
   public void II(String var1, String var2) {
      String var3 = Ilo_.II().II.IIl1();
      if (var3 != null && !Il_o.III1(var3) && var1 != null && !Il_o.III1(var1)) {
         if (Ilo_.II()
            .II00
            .equals(
               IIlO(
                  "\ud950\ud955쟱\ud90b\ud9ba\ud9dd\ud9bd\ud99b\uda77\uda4c\uda74\uda5b\udaa3\uda81\udae0\udac2\udb3f\udb1d\udb7c\udb5b\udbba\udbc4\udbbb\udbce",
                  55582
               )
            )) {
            this.IIl0(var3);
         }
      } else {
         Ilo_.II().I_10 = false;
      }
   }

   private void IIl0(String var1) {
      try {
         long var2 = Long.parseLong(var1);
         if (var2 < 100L) {
            var2 = 100L;
         }

         if (var2 > 10000L) {
            var2 = 10000L;
         }

         this.II[this.IlOl] = var2;
         this.III1[this.IlOl] = true;
         this.IIIl(IIlO("\ud95f\ud948\ud928\ud914\ud9ba", 55582) + this.II(this.IlOl) + IIlO("\ud924\ud91d", 55582) + var2 + IIlO("\ud973\ud94e", 55582));
         this.IIOl();
      } catch (Exception var4) {
         this.IIIl(IIlO("\ud959\ud954\ud9bd\ud95b\ud9ee\ud9cb윓\ud9d7\uda7d\uda5d\udaa0\uda1d\udaf5\uda91\udab8쐌\udb7e\udb0d\udb20얬", 55582));
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

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            this.Illl = !this.Illl;
            this.IIIl(
               IIlO("\ud94a쟌\ud97c\ud86a\ud97b\ud9d7\ud9b0\ud9cd\uda36", 55582) + (this.Illl ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582))
            );
            this.II_I();
            break;
         case 2:
            this.Ilo();
            break;
         case 3:
            this.III_((Integer)var2);
            break;
         case 4:
            int var3 = (Integer)var2;
            this.III1[var3] = !this.III1[var3];
            if (this.III1[var3] && this.II[var3] <= 0L) {
               this.II[var3] = 500L;
            }

            this.IIIl(
               IIlO("\ud95f\ud948\ud928\ud914\ud9ba", 55582)
                  + this.II(var3)
                  + IIlO("\ud924\ud91d", 55582)
                  + (this.III1[var3] ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582))
            );
            this.IIOl();
            this.III_(var3);
            break;
         case 5:
            this.III(
               IIlO(
                  "\ud950\ud955쟱\ud90b\ud9ba\ud9dd\ud9bd\ud99b\uda77\uda4c\uda74\uda5b\udaa3\uda81\udae0\udac2\udb3f\udb1d\udb7c\udb5b\udbba\udbc4\udbbb\udbce",
                  55582
               ),
               IIlO("\ud95a\ud958\ud930\ud91a\ud9e3", 55582)
            );
            this.IlOl = (Integer)var2;
            break;
         case 6:
            int var4 = (Integer)var2;
            this.III_[var4] = !this.III_[var4];
            if (this.III_[var4] && I1_I.III[var4] != null) {
               I1_I.III[var4].l1_O = 0;
               I1_I.III[var4].l1O = 0;
               this.IIIl(IIlO("\ud80e\ud9ce\ud932\ud91c\ud9ba\ud9db\ud8db\ud999\uda71\uda15", 55582) + this.II(var4) + IIlO("\ud924\ud91d\ud91e쟖\ud9ee", 55582));
            } else {
               this.IIIl(IIlO("\ud80e\ud9ce\ud932\ud91c\ud9ba\ud9db\ud8db\ud999\uda71\uda15", 55582) + this.II(var4) + IIlO("\ud924\ud91d\ud908쟔\ud9ee", 55582));
            }

            this.IIOl();
            this.III_(var4);
            break;
         case 7:
            this.Ill1 = !this.Ill1;
            this.IIIl(
               IIlO("\ud94a쟌\ud97c\ud86a읏\ud9d0\ud9f8\ud99a쓳\uda56\uda74\uda07\udafb\uda5b\udaa5\udad5\udb2e", 55582)
                  + (this.Ill1 ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582))
            );
            this.IIOl();
            this.II_I();
            break;
         case 8:
            this.Ill_ = !this.Ill_;
            this.IIIl(
               IIlO("\ud95a\ud9c4\ud932\ud91c\ud9ba\ud9db\ud92c\ud999\uda71\uda15\uda20\uda12\udafb\uda8b\udaf0", 55582)
                  + (this.Ill_ ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582))
            );
            this.IIOl();
            this.II_I();
            break;
         case 9:
            if (!this.Ill_) {
               this.IllI = !this.IllI;
               this.IIIl(
                  IIlO("\ud94a쟌\ud97c\ud913읹\ud9c9\ud9f8\ud983\uda7e쓶\uda6e\uda53", 55582)
                     + (this.IllI ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582))
               );
               this.IIOl();
            } else {
               this.IIIl(
                  IIlO("\ud956\ud9de\ud925\ud95b\ud9ee윖\ud9ac\ud9d7\uda72\udacc\uda3a\uda14\udab2\udad3\uda24\uda81\udb69\udb0d\udb38\udb0a\udbe3", 55582)
               );
            }

            this.II_I();
            break;
         case 99:
            this.Ilo();
            break;
         case 200:
            IlI.III().I_1l();
            break;
         case 999:
            this.II_I();
      }
   }

   public void II_I() {
      Il1_.II()
         .III()
         .II(IIlO("\ud95f\ud948\ud928\ud914\ud9ba\ud9ea\ud9b3\ud99e\uda7a\uda59", 55582))
         .II(IIlO("\ud94a쟌\ud97c\ud86a\ud97b\ud9d7\ud9b0", 55582), this.Illl ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582), 1, null)
         .II(I1_I.III.length + IIlO("\ud93e\ud956장\ud95b\ud9f4\ud8ba\ud9b6\ud990", 55582), "", 2, null)
         .II(
            IIlO("\ud94a쟌\ud97c\ud86a읏\ud9d0\ud9f8\ud99a쓳\uda56\uda74\uda07\udafb\uda5b\udaa5", 55582),
            this.Ill1 ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582),
            7,
            null
         )
         .II(
            IIlO("\ud95a\ud9c4\ud932\ud91c\ud9ba\ud9e9\ud9b7\ud983\uda77\uda47\uda35", 55582),
            this.Ill_ ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582),
            8,
            null
         )
         .II(IIlO("\ud94a쟌\ud97c\ud913읹\ud9c9\ud9f8\ud983\uda7e쓶", 55582), this.IllI ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582), 9, null)
         .II(IIlO("\ud94f\ud948\ud93d\ud902\ud9ba\ud9d5읹\ud99e", 55582), "", 200, null)
         .II(this)
         .I__0();
   }

   private void Ilo() {
      Il1_ var1 = Il1_.II().III().II(IIlO("\ud95d\ud955작\ud915\ud9ba\ud9d2육\ud9d7\uda78\udb36\uda3a\uda14", 55582));

      for (int var2 = 0; var2 < I1_I.III.length; var2++) {
         String var3 = this.II(var2);
         var1.II(var3 + IIlO("\ud93e\ud966", 55582) + (var2 + 1) + IIlO("\ud943", 55582), "", 3, new Integer(var2));
      }

      var1.II(IIlO("\ud94f\ud948\ud93d\ud902\ud9ba\ud9d5읹\ud99e", 55582), "", 999, null).II(this).I__0();
   }

   private void III_(int var1) {
      String var2 = this.III1[var1]
         ? IIlO("\ud95c자\ud928\ud95b\ud9c1", 55582) + this.II[var1] + IIlO("\ud973\ud94e\ud901", 55582)
         : IIlO("\ud94a잒\ud928", 55582);
      String var3 = this.III_[var1] ? IIlO("\ud95c자\ud928", 55582) : IIlO("\ud94a잒\ud928", 55582);
      Il1_.II()
         .III()
         .II(this.II(var1))
         .II(IIlO("\ud94d쟐\ud97c\ud91f읿\ud9d7\ud9bf", 55582), var2, 4, new Integer(var1))
         .II(IIlO("\ud950\ud955쟱\ud90b\ud9ba\ud9dd\ud9bd\ud99b\uda77\uda4c", 55582), "", 5, new Integer(var1))
         .II(IIlO("\ud80e\ud9ce\ud932\ud91c\ud9ba\ud9db\ud8db\ud999\uda71\uda15\uda27\uda18\udafb\udadd\udabc", 55582), var3, 6, new Integer(var1))
         .II(IIlO("\ud94f\ud948\ud93d\ud902\ud9ba\ud9d5읹\ud99e", 55582), "", 99, null)
         .II(this)
         .I__0();
   }

   private String II(int var1) {
      if (var1 >= 0 && var1 < I1_I.III.length) {
         return I1_I.III[var1] != null ? I1_I.III[var1].II.II1o : IIlO("\ud94a\ud94f잍\ud915\ud9fd", 55582);
      } else {
         return IIlO("\ud94a\ud94f잍\ud915\ud9fd", 55582);
      }
   }

   @Override
   public void Illl() {
      Ilo_ var1 = Ilo_.II();
      var1.II00 = IIlO("\ud95d\ud955\ud93d\ud90f", 55582);
      var1.II.II1o = IIlO("\ud97d\ud955\ud93d\ud90f", 55582);
      var1.II.IIOl("");
      var1.I_10 = false;
      var1.II = I1_I.II();
      var1.III0 = null;
      this.III_(this.IlOl);
      II.II.I__0();
   }

   public void IloI() {
      Ilol var1 = Ilol.II();
      if (var1 != null && !var1.I_I_ && var1.IOl_ > 0 && var1.IOIl != 14 && var1.IOIl != 5) {
         I_0o var2 = var1.II;
         if (var2 != null && var2.II != null && var2.II.IoI_ != 3 && var2.II.IlIO != 10 && var2.II.IlIO != 11 && (!var2.I0Ol || II.II.I_10)) {
            int var3 = this.III0();
            long var4 = this.II(var2);
            long var6 = IO10.IIII();
            if (var6 - this.IIII[var3] >= var4) {
               if (I1_I.IIIl(var1.IIII)) {
                  this.IIII[var3] = var6;
                  this.Ilo1();
                  var2.I1IO = var6;
               } else if (var1.IIIl != null && this.III1(var1.IIIl) && Math.abs(var1.IIIl.I_o_ - var1.I_o_) < var1.II.l1_0 * 1.7) {
                  this.IIII[var3] = var6;
                  this.Ilol();
                  var2.I1IO = var6;
               }
            }
         }
      }
   }

   private void IIIO(int var1) {
      if (IOlO.l1oI != 21 && IOlO.l1oI != 22 && IOlO.l1oI != 23) {
         if (var1 >= I1_I.III.length) {
            var1 = I1_I.III.length - 1;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         if (I1_I.III[var1] != null && !I1_I.III[var1].I0Ol) {
            if (I1_I.III[var1].l1_O == 0 && this.II[var1] <= 0L) {
               this.II[var1] = 500L;
            } else if (this.II(I1_I.III[var1]) && !I1_I.II().IIol()) {
               long var2 = IO10.IIII();
               if (var2 - this.II_O < 150L) {
                  return;
               }

               if (this.II[var1] == -1L && II.IIIO % 20 == 0) {
                  I1_I.II().II(I1_I.III[var1], true);
                  this.III[var1] = 0L;
               } else if (var2 - this.III[var1] >= this.II[var1]) {
                  this.III[var1] = var2;
                  this.II_O = var2;
                  I1_I.II().II(I1_I.III[var1], true);
               }
            }
         }
      }
   }

   public boolean III1(Ilol var1) {
      if (IOlO.l1oI == 113) {
         return var1 != null && Ilol.II().II != null ? var1.III0 == 5 || var1.III0 == 3 : false;
      }

      if (var1 != null && Ilol.II().II != null) {
         if (var1.IOIl == 14
            || var1.IOIl == 5
            || Ilol.II().II.II.IoI_ == 2
            || (Ilol.II().IIl != 8 || var1.IIl == 0)
               && (Ilol.II().IIl == 0 || var1.IIl != 8)
               && (Ilol.II().IIl == var1.IIl || Ilol.II().IIl == 0 || var1.IIl == 0)
               && (var1.III0 != 3 || Ilol.II().III0 != 3)
               && Ilol.II().III0 != 5
               && var1.III0 != 5
               && (Ilol.II().III0 != 1 || var1.III0 != 1)
               && (Ilol.II().III0 != 4 || var1.III0 != 4)) {
            return Ilol.II().II.II.IoI_ == 2 ? var1.III0 != 5 : false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean II(I_0o var1) {
      if (var1.II.l1Ol == 2) {
         return true;
      } else {
         return var1.II.l1Ol != 1 ? Ilol.II().IOl1 >= var1.l1O : Ilol.II().IOl1 >= var1.l1O * Ilol.II().IO1 / 100;
      }
   }

   private void Ilol() {
      try {
         I_lO var1 = new I_lO("");
         var1.addElement(Ilol.II().IIIl);
         I_0_.II().II(new I_lO(""), var1, 2);
      } catch (Exception var2) {
      }
   }

   private void Ilo1() {
      try {
         I_lO var1 = new I_lO("");
         var1.addElement(Ilol.II().IIII);
         I_0_.II().II(var1, new I_lO(""), 1);
      } catch (Exception var2) {
      }
   }

   private long II(I_0o var1) {
      byte var2 = var1.II.IlIO;
      return var2 != 20 && var2 != 22 && var2 != 7 && var2 != 18 && var2 != 23 ? var1.l1_O + 100L : var1.l1_O + 500L;
   }

   private int III0() {
      for (int var1 = 0; var1 < I1_I.III.length; var1++) {
         if (I1_I.III[var1] == Ilol.II().II) {
            return var1;
         }
      }

      return 0;
   }
}
