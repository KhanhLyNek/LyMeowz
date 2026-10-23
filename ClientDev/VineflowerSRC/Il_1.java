package main;

public class Il_1 {
   public static void IIIl(int var0) {
      try {
         I101[] var1 = Ilol.II().II;

         for (int var2 = 0; var2 < var1.length; var2++) {
            I101 var3 = var1[var2];
            if (var3 != null && var3.II.II__ == var0) {
               I_0_.II().II((byte)0, (byte)1, (byte)var3.lIO_, (short)-1);
               break;
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static void II1O(int var0) {
      try {
         if (I1_I.II_0 == null) {
            return;
         }

         for (int var1 = I1_I.II_0.size() - 1; var1 >= 0; var1--) {
            I10_ var2 = (I10_)I1_I.II_0.elementAt(var1);
            if (var2 != null && var2.II != null && var2.II.II__ == var0) {
               Il_0.III1(var2.I1, var2.I1I);
               break;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static boolean II(IOl1 var0) {
      if (var0.I0OO) {
         if (var0.IoI_ == 0) {
            I1I1.I___ = false;
            Ilol.I1Oo = true;
            IOl1.IlI1.removeElement(var0);
         } else {
            if (Ilol.II().I11) {
               Ilol.II().I_oO = var0.I1I = var0.l101;
            }

            Ilol.II().I11 = false;
         }
      } else {
         Ilol var1 = I1_I.II(var0.I1l);
         if (var1 != null) {
            if (var0.IoI_ == 0) {
               if (var0.I0Oo) {
                  var0.I1I = var0.l101;
               }
            } else {
               if (var1.I11) {
                  var1.I_oO = var0.I1I = var0.l101;
               }

               var1.I11 = false;
            }
         }
      }

      IOl1.IlI1.removeElement(var0);
      return true;
   }

   public static byte II(short[] var0) {
      Ilol var1 = Ilol.II();
      int var2 = var1.II.length;

      for (byte var3 = 0; var3 < var2; var3++) {
         I101 var4 = var1.II[var3];
         if (var4 != null) {
            for (int var5 = 0; var5 < var0.length; var5++) {
               if (var4.II.II__ == var0[var5]) {
                  return var3;
               }
            }
         }
      }

      return -1;
   }

   public static boolean IIll(int var0) {
      I101[] var1 = Ilol.II().II;

      for (int var2 = 0; var2 < var1.length; var2++) {
         I101 var3 = var1[var2];
         if (var3 != null && var3.II.II__ == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean IIlI() {
      I101[] var0 = Ilol.II().II;

      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1] == null) {
            return false;
         }
      }

      return true;
   }

   public static boolean II10() {
      I101[] var0 = Ilol.II().III;

      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1] == null) {
            return false;
         }
      }

      return true;
   }

   public static boolean II(Ilol var0) {
      if (var0 == null || Il_o.III1(var0.IIO1)) {
         return false;
      }

      if (!var0.I_ && !var0.I_I) {
         String var1 = var0.IIO1;
         if (!var1.equals(IIOl("앧씠\udbbc엾었엮얙웬왂", 50483)) && !var1.startsWith(IIOl("씐", 50483)) && !var1.startsWith(IIOl("씗", 50483))) {
            char var2 = var1.charAt(0);
            return Character.isUpperCase(var2);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean II1o() {
      return IOlO.l1oI >= 85 && IOlO.l1oI <= 91;
   }

   public static void II(I1_O var0) {
      I1_I.II().IIII(var0);
   }

   public static void I_0o() {
      I1I1.IIII((byte)0);
      I_0_.II().Io0();
      Ilol.I10I = false;
   }

   public static void II10(int var0) {
      try {
         for (int var1 = 0; var1 < I1_I.IIOI.size(); var1++) {
            I_11 var2 = (I_11)I1_I.IIOI.elementAt(var1);
            if (var2.II.lll0 == var0) {
               Ilol.II().II = var2;
               Il_0.III1(var2.I_o_, var2.I_oO - 3);
               break;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static int III(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }
}
