package main;

public final class IOl_ {
   private static int II0I;
   private static int I_O0;
   private static int I_Oo;
   private static boolean II_;
   private static String Ill1 = "";

   public static void II0() {
      II0I = 0;
      I_O0 = 0;
      II_ = false;
   }

   public static void II(IO1l var0, String var1, int var2, int var3, int var4, int var5, IO1I var6) {
      if (I_Oo != var6.IIII(var1) || !Ill1.equals(var1)) {
         Ill1 = var1;
         II0I = 0;
         I_Oo = var6.IIII(var1);
         II_ = false;
         I_O0 = 0;
      }

      var0.IIIO(var2, var3, var4, var5);
      if (I_Oo > var4) {
         var6.II(var0, var1, var2 - II0I, var3, 0);
      } else {
         var6.II(var0, var1, var2 + var4 / 2, var3, 2);
      }

      II.II(var0);
      if (I_Oo > var4) {
         if (!II_) {
            if (++I_O0 > 50 && ++II0I >= I_Oo) {
               I_O0 = 0;
               II0I = -var4 + 30;
               II_ = true;
               return;
            }
         } else {
            if (II0I < 0) {
               int var7 = var4 + II0I >> 1;
               II0I += var7;
            }

            if (II0I > 0) {
               II0I = 0;
            }

            if (II0I == 0 && ++I_O0 == 50) {
               I_O0 = 0;
               II_ = false;
            }
         }
      }
   }
}
