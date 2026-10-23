package main;

public class IlO_ extends IIII implements I1_1 {
   private static IlO_ II;
   public static boolean Ilol = true;
   public static boolean Ilo1 = true;
   public static boolean Ilo_ = false;
   private static boolean IloO = true;
   public static int I__O = 500;
   public static long IllI = 500L;
   public static boolean Ilo0 = false;
   public static int I__0 = -1;
   public static boolean Iloo = false;
   public static long Illl = 0L;
   private static long Ill1 = 0L;
   private static long Ill_ = 0L;
   private static long IllO = 0L;
   private static boolean I1 = false;
   private static boolean I1I = false;
   private static boolean I1II = false;
   private static long Ill0 = 0L;
   private static int[] II1_ = null;
   private static int[] II1O = null;
   private static final int I__o = 1000;
   private static final int I_O = 2000;
   private static final int I_OI = 3000;
   private static final int I_Ol = 4000;
   private static final int I_O1 = 5000;
   private static final int I_O_ = 6000;
   private static boolean I1Il = false;

   public static IlO_ II() {
      if (II == null) {
         II = new IlO_();
      }

      return II;
   }

   public static IlO_ III() {
      return II();
   }

   @Override
   protected void II1l() {
      IlOO.IOI();
      this.IIlo();
   }

   @Override
   protected void II11() {
      I_o0();
   }

   @Override
   protected void II1_() {
      if (Ilol.II().I_I_) {
         Ill1 = System.currentTimeMillis() + 1000L;
      }

      boolean var1 = false;
      if (Ilol && IlOO.IIl1(IOlO.l1oI)) {
         var1 = II_l();
      }

      if (IOlO.l1oI == I__0) {
         I_o0();
      } else if (Ilo0) {
         if (!var1) {
            if (System.currentTimeMillis() - Ill1 > 100L) {
               if (System.currentTimeMillis() - Illl >= I__O) {
                  Illl = System.currentTimeMillis();
                  boolean var2 = true;
                  if (IlOO.IIl_(I__0)) {
                     if (Ilol.II().II.II01 <= 24) {
                        I_o0();
                        return;
                     }

                     var2 = II_1();
                  }

                  if (var2) {
                     II_(I__0);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
      I_o0();
   }

   private static boolean II_l() {
      for (int var0 = 0; var0 < I1_I.II_0.size(); var0++) {
         I10_ var1 = (I10_)I1_I.II_0.elementAt(var0);
         if ((var1.IoIO == Ilol.II().IOI_ || var1.IoIO == -1) && var1.II.II__ == 74) {
            Ilol.II().II = var1;
            if (System.currentTimeMillis() - Ill1 > 600L) {
               Ill1 = System.currentTimeMillis();
               I_0_.II().IIo1(Ilol.II().II.lI0l);
               return true;
            }
         }
      }

      return false;
   }

   private static boolean II_1() {
      if (I1_I.II((short)38) == null) {
         switch (IOlO.l1oI) {
            case 27:
               II_(28);
               I1Il = false;
               return false;
            case 28:
               if (I1Il) {
                  II_(27);
               } else {
                  II_(29);
               }

               return false;
            case 29:
               I1Il = true;
               II_(28);
               return false;
         }
      } else {
         I1Il = false;
      }

      return true;
   }

   public static void II_(int var0) {
      try {
         if (I__0 == 160 && !I1) {
            if (!I1ol.II1_(992)) {
               I_o0();
               return;
            }

            I1 = true;
            IllO = System.currentTimeMillis();
            Il_1.IIIl(992);
            return;
         }

         int[] var1 = IlOo.II(var0);
         if (var1 == null) {
            II_I(var0);
            return;
         }

         if (Ilo1 && II(var1)) {
            return;
         }

         if (IOlO.l1oI != var1[0] || Ilol.I1Oo || I1I1.I___) {
            return;
         }

         if (!II__()) {
            I_o0();
            return;
         }

         if (!I1 || System.currentTimeMillis() - IllO >= 500L) {
            if (I1 && IOlO.l1oI == 160) {
               I1 = false;
            }

            IlO0.II_O(var1[1]);
         }
      } catch (Exception var2) {
      }
   }

   private static boolean II(int[] var0) {
      if (!I1I && var0.length > 4) {
         for (int var1 = 0; var1 < Ilol.II().II.length; var1++) {
            I101 var2 = Ilol.II().II[var1];
            if (var2 != null) {
               if (IloO && var2.II.II__ == 194) {
                  I1I = true;
                  I1II = false;
                  Ill0 = System.currentTimeMillis();
                  II.II.II11 = null;
                  I_0_.II().II((byte)0, (byte)1, (byte)-1, var2.II.II__);
                  return true;
               }

               if (Ilo_ && var2.II.II__ == 193 && var2.I1l1 > 1) {
                  I1I = true;
                  I1II = false;
                  Ill0 = System.currentTimeMillis();
                  II.II.II11 = null;
                  I_0_.II().II((byte)0, (byte)1, (byte)-1, var2.II.II__);
                  return true;
               }
            }
         }
      }

      if (I1I && !I1II && System.currentTimeMillis() - Ill0 < IllI) {
         return true;
      }

      if (I1I && !I1II && II.II.II11 == null) {
         I1I = false;
         I1II = true;
         return true;
      }

      if (I1I && !I1II) {
         for (int var3 = var0.length - 1; var3 >= 1; var3--) {
            for (int var4 = 0; var4 < II.II.II11.length; var4++) {
               if (II.II.II11[var4].indexOf(IOlO.II11[var0[var3]]) >= 0) {
                  I1II = true;
                  I_0_.II().IlI1(var4);
                  return true;
               }
            }
         }

         I1II = true;
      }

      return false;
   }

   private static boolean II__() {
      if (Ilol.II().II != null) {
         return true;
      }

      boolean var0 = false;

      for (int var1 = 0; var1 < IlOO.II_o.length; var1++) {
         if (I__0 == IlOO.II_o[var1]) {
            var0 = true;
            break;
         }
      }

      if (!var0) {
         for (int var2 = 0; var2 < IlOO.II_0.length; var2++) {
            if (I__0 == IlOO.II_0[var2]) {
               var0 = true;
               break;
            }
         }
      }

      if (!var0 && I__0 >= 53 && I__0 <= 62) {
         var0 = true;
      }

      return !var0;
   }

   private static void II_I(int var0) {
      long var1 = System.currentTimeMillis();
      if (var1 - Ill_ >= 1000L) {
         String var3 = IlOo.IIIl(var0);
         Ill_ = var1;
         Iloo = true;
      }
   }

   public static void II_l(int var0) {
      Ilo0 = true;
      I__0 = var0;
   }

   public static void I_o0() {
      Ilo0 = false;
      I1I = false;
      I1II = false;
      Iloo = false;
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 3000:
            I_oo();
            break;
         case 4000:
            if (var2 instanceof int[]) {
               II((int[])var2);
            }
            break;
         case 5000:
            IO();
            break;
         case 6000:
            IlI.III().I_1l();
            break;
         default:
            if (var1 >= 1000 && var1 < 1100) {
               II_1(var1 - 1000);
            } else if (var1 >= 2000 && var1 < 3000) {
               II__(var1 - 2000);
            }
      }
   }

   public static void I_oo() {
      try {
         Il1_.II().III().II(IIOo("耳胤胄肠胎腀腍脻", 32882)).II(III());

         for (int var0 = 0; var0 < IlOO.II1I.IIlO(); var0++) {
            IlOO.II var1 = (IlOO.II)IlOO.II1I.II(var0);
            Il1_.II().II(var1.II1o, "", 1000 + var0, var1.IIO);
         }

         Il1_.II().II(IIOo("耣胤胑肶胎腡龍脢", 32882), "", 6000, null);
         Il1_.II().I__0();
      } catch (Exception var2) {
      }
   }

   public static void II(int[] var0) {
      if (var0 != null) {
         II1O = var0;
         Il1_.II().III().II(IIOo("耱胹鹽股胎腀腍脻", 32882)).II(III());
         Il_l.II var1 = new Il_l.II();
         int var2 = 0;

         for (int var3 = 0; var3 < var0.length; var3++) {
            int var4 = var0[var3];
            if ((Ilol.II().IOIO != 0 || var4 != 22 && var4 != 23)
               && (Ilol.II().IOIO != 1 || var4 != 21 && var4 != 23)
               && (Ilol.II().IOIO != 2 || var4 != 21 && var4 != 22)) {
               String var5 = IOlO.II11 != null && var4 >= 0 && var4 < IOlO.II11.length && IOlO.II11[var4] != null
                  ? IOlO.II11[var4]
                  : IIOo("耿胰胀胯", 32882) + var4;
               Il1_.II().II(var5, "", 2000 + var2, new Integer(var4));
               var1.III(new Integer(var4));
               var2++;
            }
         }

         Il1_.II().II(IIOo("耣胤胑肶胎腡龍脢", 32882), "", 3000, null);
         II1_ = new int[var1.IIlO()];

         for (int var6 = 0; var6 < var1.IIlO(); var6++) {
            II1_[var6] = (Integer)var1.II(var6);
         }

         Il1_.II().I__0();
      }
   }

   public static void II_1(int var0) {
      if (var0 >= 0 && var0 < IlOO.II1I.IIlO()) {
         IlOO.II var1 = (IlOO.II)IlOO.II1I.II(var0);
         if (IlOO.III(var1.IIO)) {
            IO();
            II.II.I__o();
         } else {
            II(var1.IIO);
         }
      }
   }

   public static void II__(int var0) {
      if (II1_ != null && var0 >= 0 && var0 < II1_.length) {
         II_l(II1_[var0]);
         II.II.I__o();
      }
   }

   public static void IO() {
      try {
         int var0 = Ilol.II().IOIO;
         int var1 = 21 + var0;
         if (IOlO.l1oI != var1) {
            II_l(var1);
         }
      } catch (Exception var2) {
      }
   }

   public static boolean II_O() {
      return Ilo0;
   }
}
