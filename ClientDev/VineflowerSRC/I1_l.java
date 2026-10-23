package main;

public final class I1_l {
   public static int II0I;
   public static int I_O0;
   public static int I_Oo;
   public static int I_0;
   public static boolean I_OI;
   public static boolean III1;
   public static boolean III_;
   public static boolean IOOO;
   public static boolean I1_l;
   public static boolean I1l;
   public static int IoII;
   public static boolean I1ll;
   public static boolean I__I;

   public static boolean III1(int var0, int var1) {
      return Ilol.II().II != null && Ilol.II().II.II01 == var0 && Ilol.II().II.l10l == 0;
   }

   public static void I0_0() {
      if (II.II.I_10) {
         I1_l = false;
      }

      if (I1_I.II() != null) {
         II0I = I1_I.II().I_o_;
         I_O0 = I1_I.II().I_oO;
         IoII = 0;
         I1l = true;
         I_Oo = II.IIIl ? 1 : 0;
      }
   }

   public static void IIO(int var0) {
      if (!II.II.I_10 && I__O.IlI.size() - 1 >= var0) {
         I__O var1;
         II0I = (var1 = (I__O)I__O.IlI.elementAt(var0)).I_o_ + var1.l111 / 2;
         I_O0 = var1.I_oO + 30;
         if (!var1.I1lI && var1.I0_I) {
            I1_l = true;
         } else {
            I1_l = false;
         }

         I_Oo = 0;
         I1l = true;
         IoII = 0;
         if (!II.IIIl) {
            I1_l = false;
         }
      }
   }

   public static void I0_o() {
      I_Oo = 1;
      if (II.II.I_10) {
         I1_l = false;
      }

      boolean var0 = false;

      for (int var1 = 0; var1 < I1_I.IIO.size(); var1++) {
         if (((I_I_)I1_I.IIO.elementAt(var1)).III1) {
            var0 = true;
            break;
         }
      }

      for (int var3 = 0; var3 < I1_I.IIO.size(); var3++) {
         I_I_ var2;
         if ((var2 = (I_I_)I1_I.IIO.elementAt(var3)).III1) {
            II0I = var2.I1;
            I_O0 = var2.I1I + 5;
            I1l = true;
            if (var2.status == 0) {
               var2.III1 = false;
               return;
            }
            break;
         }

         if (!var0) {
            if (var2.status != 0) {
               var2.III1 = true;
               return;
            }

            var2.III1 = false;
         }
      }
   }

   public static boolean III() {
      if (II.II.I_10) {
         I1_l = false;
      }

      for (int var0 = 0; var0 < I1_I.II_0.size(); var0++) {
         I10_ var1;
         if ((var1 = (I10_)I1_I.II_0.elementAt(var0)).IoIO == Ilol.II().IOI_ && var1.II.II__ == 73) {
            I_Oo = 1;
            II0I = var1.I1;
            I_O0 = var1.I1I + 5;
            I1l = true;
            return true;
         }
      }

      return false;
   }
}
