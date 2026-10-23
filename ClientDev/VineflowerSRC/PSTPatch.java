package main;

public final class PSTPatch {
   private PSTPatch() {
   }

   public static int boss(int var0, int var1, int var2, int var3) {
      int var4 = var0 > 0 ? var0 : Math.max(0, var1);
      return scaled(var4, var3);
   }

   public static int monster(IOoI.III var0, int var1, int var2) {
      long var3 = 0L;
      if (var0 != null) {
         var3 = var0._l_O;
         if (var3 <= 0L) {
            long var5 = var0.II == null ? 5L : var0.II.l0o;
            var3 = var0._l__ * var5 / 100L;
         }

         if (var0.IooO) {
            var3 = Math.min(2147483647L, var3 * 2L);
         }
      }

      int var7 = var3 > 0L ? (int)Math.min(2147483647L, var3) : Math.max(0, var1);
      return scaled(var7, var2);
   }

   public static int scaled(int var0, int var1) {
      return var0 > 0 && var1 > 0 ? (int)Math.min(2147483647L, (long)var0 * var1 / 100L) : 0;
   }
}
