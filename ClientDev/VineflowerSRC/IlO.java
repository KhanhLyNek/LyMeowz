package main;

public class IlO {
   public static void IIIl(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
      }
   }

   public static void II(Runnable var0) {
      new Thread(var0).start();
   }

   public static void II(Runnable var0, long var1) {
      new Thread(new IlOI(var1, var0)).start();
   }

   public static String III1() {
      return Thread.currentThread().getName();
   }
}
