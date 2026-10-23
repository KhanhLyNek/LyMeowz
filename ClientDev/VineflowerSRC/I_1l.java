package main;

import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class I_1l {
   public static byte[] II(I_Il var0) {
      try {
         int var1;
         if ((var1 = var0.II().readInt()) > 1) {
            byte[] var2 = new byte[var1];
            var0.II().read(var2);
            return var2;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      return null;
   }

   public static byte[] II(DataInputStream var0) {
      try {
         byte[] var1 = new byte[var0.readInt()];
         var0.read(var1);
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static String III(String var0, String var1, String var2) {
      StringBuffer var3 = new StringBuffer();

      int var4;
      while ((var4 = var0.indexOf(var1)) != -1) {
         var3.append(var0.substring(0, var4) + var2);
         var0 = var0.substring(var4 + var1.length());
      }

      var3.append(var0);
      return var3.toString();
   }

   public static String III1(int var0) {
      long var1 = var0 * 1000L;
      Calendar var3;
      (var3 = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone(IlOI("畲甙甧疹疆", 30005)));
      var3.setTime(new Date(var1));
      int var4 = var3.get(11);
      var3.get(12);
      int var5 = var3.get(5);
      int var6 = var3.get(2) + 1;
      var0 = var3.get(1);
      return var5 + IlOI("甚", 30005) + var6 + IlOI("甚", 30005) + var0 + IlOI("甕", 30005) + var4 + IlOI("畝", 30005);
   }

   public static String III_(int var0) {
      int var1 = 0;
      if (var0 > 60) {
         var1 = var0 / 60;
         var0 %= 60;
      }

      int var2 = 0;
      if (var1 > 60) {
         var2 = var1 / 60;
         var1 %= 60;
      }

      int var3 = 0;
      if (var2 > 24) {
         var3 = var2 / 24;
         var2 %= 24;
      }

      String var4 = "";
      if (var3 > 0) {
         var4 = var4 + var3;
         var4 = var4 + IlOI("畑", 30005);
         var4 = var4 + var2 + IlOI("畝", 30005);
      } else if (var2 > 0) {
         var4 = var4 + var2;
         var4 = var4 + IlOI("畝", 30005);
         var4 = var4 + var1 + IlOI("甒", 30005);
      } else {
         if (var1 > 9) {
            var4 = var4 + var1;
         } else {
            var4 = var4 + IlOI("甅", 30005) + var1;
         }

         var4 = var4 + IlOI("甏", 30005);
         if (var0 > 9) {
            var4 = var4 + var0;
         } else {
            var4 = var4 + IlOI("甅", 30005) + var0;
         }
      }

      return var4;
   }

   public static String IIIl(long var0) {
      String var2 = "";
      long var3 = var0 / 1000L + 1L;

      for (int var5 = 0; var5 < var3; var5++) {
         if (var0 < 1000L) {
            var2 = var0 + var2;
            break;
         }

         long var6;
         if ((var6 = var0 % 1000L) == 0L) {
            var2 = IlOI("甛畤畃疢", 30005) + var2;
         } else if (var6 < 10L) {
            var2 = IlOI("甛畤畃", 30005) + var6 + var2;
         } else if (var6 < 100L) {
            var2 = IlOI("甛畤", 30005) + var6 + var2;
         } else {
            var2 = IlOI("甛", 30005) + var6 + var2;
         }

         var0 /= 1000L;
      }

      return var2;
   }

   public static String IIIO(int var0) {
      int var1 = 0;
      if (var0 > 60) {
         var1 = var0 / 60;
      }

      var0 = 0;
      if (var1 > 60) {
         var0 = var1 / 60;
         var1 %= 60;
      }

      int var2 = 0;
      if (var0 > 24) {
         var2 = var0 / 24;
         var0 %= 24;
      }

      String var3 = "";
      if (var2 > 0) {
         var3 = var3 + var2;
         var3 = var3 + IlOI("畑", 30005);
         var3 = var3 + var0 + IlOI("畝", 30005);
      } else if (var0 > 0) {
         var3 = var3 + var0;
         var3 = var3 + IlOI("畝", 30005);
         var3 = var3 + var1 + IlOI("甒", 30005);
      } else {
         if (var1 == 0) {
            var1 = 1;
         }

         var3 = var3 + var1;
         var3 = var3 + IlOI("畅甼", 30005);
      }

      return var3;
   }
}
