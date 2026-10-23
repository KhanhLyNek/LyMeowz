package main;

public class Il_O {
   public static int II(int var0, int var1, int var2, int var3) {
      int var4 = var2 - var0;
      int var5 = var3 - var1;
      return (int)Math.sqrt(var4 * var4 + var5 * var5);
   }

   public static int II(I1_O var0, I1_O var1) {
      return I_Ol.II(var0.IIlo(), var0.II1(), var1.IIlo(), var1.II1());
   }

   public static int IIIl(int var0, int var1, int var2, int var3) {
      return IIII(var2 - var0) + IIII(var3 - var1);
   }

   public static int II(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static float II(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static double II(double var0, double var2, double var4) {
      var4 = Math.max(0.0, Math.min(1.0, var4));
      return var0 + (var2 - var0) * var4;
   }

   public static boolean III(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static int III(int var0, int var1) {
      return var0 < var1 ? var0 : var1;
   }

   public static int IIII(int var0, int var1) {
      return var0 > var1 ? var0 : var1;
   }

   public static int IIII(int var0) {
      return var0 < 0 ? -var0 : var0;
   }
}
