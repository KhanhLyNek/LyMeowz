package main;

public class IlOl {
   public static long IIII() {
      return IO10.IIII();
   }

   public static boolean II(long var0, long var2) {
      return IIII() - var0 >= var2;
   }

   public static void IIIl(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
      }
   }

   public static String IIII(long var0) {
      long var2 = var0 / 1000L;
      long var4 = var2 / 60L;
      long var6 = var4 / 60L;
      String var8 = String.valueOf(var6);
      String var9 = String.valueOf(var4 % 60L);
      String var10 = String.valueOf(var2 % 60L);
      if (var9.length() == 1) {
         var9 = IIOO("㝰", 14144) + var9;
      }

      if (var10.length() == 1) {
         var10 = IIOO("㝰", 14144) + var10;
      }

      return var8 + IIOO("㝺", 14144) + var9 + IIOO("㝺", 14144) + var10;
   }
}
