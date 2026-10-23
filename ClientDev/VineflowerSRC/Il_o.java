package main;

public class Il_o {
   public static int II(String var0, String var1) {
      return II(var0, var1, 0);
   }

   public static int II(String var0, String var1, int var2) {
      if (var0 != null && var1 != null) {
         if (var1.length() == 0) {
            return var2;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         if (var2 >= var0.length()) {
            return -1;
         }

         int var3 = var0.length() - var1.length();

         for (int var4 = var2; var4 <= var3; var4++) {
            boolean var5 = true;

            for (int var6 = 0; var6 < var1.length(); var6++) {
               if (var0.charAt(var4 + var6) != var1.charAt(var6)) {
                  var5 = false;
                  break;
               }
            }

            if (var5) {
               return var4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static int II(String var0, char var1) {
      return II(var0, var1, 0);
   }

   public static int II(String var0, char var1, int var2) {
      if (var0 == null) {
         return -1;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= var0.length()) {
         return -1;
      }

      for (int var3 = var2; var3 < var0.length(); var3++) {
         if (var0.charAt(var3) == var1) {
            return var3;
         }
      }

      return -1;
   }

   public static boolean III1(String var0) {
      return var0 == null || var0.length() == 0;
   }

   public static boolean II(String var0, String var1) {
      return var0 != null && var1 != null ? II(var0, var1) != -1 : false;
   }

   public static String II(String[] var0) {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.append(var0[var2]);
      }

      return var1.toString();
   }

   public static Il_l.II II(String var0, char var1) {
      Il_l.II var2 = new Il_l.II();
      if (III1(var0)) {
         return var2;
      }

      int var3 = 0;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         if (var0.charAt(var4) == var1) {
            var2.III(var0.substring(var3, var4));
            var3 = var4 + 1;
         }
      }

      var2.III(var0.substring(var3));
      return var2;
   }

   public static String[] II(String var0, char var1) {
      if (III1(var0)) {
         return new String[0];
      }

      int var2 = 1;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (var0.charAt(var3) == var1) {
            var2++;
         }
      }

      String[] var7 = new String[var2];
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < var0.length(); var6++) {
         if (var0.charAt(var6) == var1) {
            var7[var5++] = var0.substring(var4, var6);
            var4 = var6 + 1;
         }
      }

      var7[var5] = var0.substring(var4);
      return var7;
   }

   public static String II(String var0, String var1, String var2) {
      if (var0 == null || var1 == null || var2 == null) {
         return var0;
      }

      if (var1.length() == 0) {
         return var0;
      }

      StringBuilder var3 = new StringBuilder();
      int var4 = 0;

      for (int var5 = II(var0, var1, var4); var5 >= 0; var5 = II(var0, var1, var4)) {
         var3.append(var0.substring(var4, var5));
         var3.append(var2);
         var4 = var5 + var1.length();
      }

      var3.append(var0.substring(var4));
      return var3.toString();
   }

   public static String III(long var0) {
      if (var0 < 0L) {
         return IIO_("邓", 37054) + III(-var0);
      }

      if (var0 < 1000L) {
         return String.valueOf(var0);
      }

      String var2 = String.valueOf(var0);
      StringBuilder var3 = new StringBuilder();
      int var4 = var2.length();
      int var5 = 0;

      for (int var6 = var4 - 1; var6 >= 0; var6--) {
         if (var5 > 0 && var5 % 3 == 0) {
            var3.insert(0, IIO_("邒", 37054));
         }

         var3.insert(0, String.valueOf(var2.charAt(var6)));
         var5++;
      }

      return var3.toString();
   }

   public static String II(long var0, int var2) {
      String var3 = String.valueOf(var0);

      while (var3.length() < var2) {
         var3 = IIO_("邎", 37054) + var3;
      }

      return var3;
   }

   public static String II(long var0, long var2) {
      return II(var0, 2) + IIO_("還", 37054) + II(var2, 2);
   }

   public static String IIIl(String var0) {
      return var0 == null ? null : var0.trim();
   }

   public static String III1(String var0) {
      return var0 == null ? null : var0.toLowerCase();
   }

   public static String III_(String var0) {
      return var0 == null ? null : var0.toUpperCase();
   }

   public static boolean III(String var0, String var1) {
      if (var0 == null && var1 == null) {
         return true;
      } else {
         return var0 != null && var1 != null ? var0.equals(var1) : false;
      }
   }

   public static boolean IIII(String var0, String var1) {
      if (var0 == null && var1 == null) {
         return true;
      } else {
         return var0 != null && var1 != null ? var0.toLowerCase().equals(var1.toLowerCase()) : false;
      }
   }

   public static boolean IIIl(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return var1.length() > var0.length() ? false : var0.substring(0, var1.length()).equals(var1);
      } else {
         return false;
      }
   }

   public static boolean III1(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return var1.length() > var0.length() ? false : var0.substring(var0.length() - var1.length()).equals(var1);
      } else {
         return false;
      }
   }

   public static String II(String var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > var0.length()) {
         var2 = var0.length();
      }

      return var1 > var2 ? "" : var0.substring(var1, var2);
   }

   public static String II(String[] var0, String var1) {
      if (var0 != null && var0.length != 0) {
         StringBuilder var2 = new StringBuilder();

         for (int var3 = 0; var3 < var0.length; var3++) {
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(var0[var3]);
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static String IIO1(String var0, int var1) {
      if (var0 != null && var1 > 0) {
         StringBuilder var2 = new StringBuilder();

         for (int var3 = 0; var3 < var1; var3++) {
            var2.append(var0);
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static String IIIO(String var0) {
      if (var0 == null) {
         return null;
      }

      StringBuilder var1 = new StringBuilder(var0);
      return var1.reverse().toString();
   }
}
