package main;

public final class LyForgeFast {
   private static boolean fast;

   private LyForgeFast() {
   }

   public static boolean enabled() {
      return fast;
   }

   public static String[] withToggle(String[] var0) {
      if (var0 == null) {
         return new String[]{fast ? "Ép nhanh: BẬT" : "Ép nhanh: TẮT"};
      }

      String[] var1 = new String[var0.length + 1];
      System.arraycopy(var0, 0, var1, 0, var0.length);
      var1[var0.length] = fast ? "Ép nhanh: BẬT" : "Ép nhanh: TẮT";
      return var1;
   }

   public static boolean click(int var0, int var1) {
      if (var0 == 5100 && var1 == 3) {
         fast = !fast;
         return true;
      } else {
         return false;
      }
   }

   public static String status() {
      return fast ? "Ép nhanh đã BẬT. Mở lại menu để xem trạng thái." : "Ép nhanh đã TẮT. Mở lại menu để xem trạng thái.";
   }
}
