package main;

public class Il10 {
   private static int IIII(int var0, int var1, int var2, int var3) {
      int var4 = Math.abs(var0 - var2);
      int var5 = Math.abs(var1 - var3);
      byte var6 = 10;
      byte var7 = 14;
      int var8 = Math.min(var4, var5);
      return var6 * (var4 + var5) + (var7 - 2 * var6) * var8;
   }

   public static Il_l.II II(Il10.IIII var0, Il10.IIII var1) {
      if (!III(var0.I1, var0.I1I)) {
         var0 = II(var0.I1, var0.I1I);
         if (var0 == null) {
            return null;
         }
      }

      if (!III(var1.I1, var1.I1I)) {
         var1 = II(var1.I1, var1.I1I);
         if (var1 == null) {
            return null;
         }
      }

      Il10.IIIl var2 = new Il10.IIIl(new Il10.III(null));
      Il_l.III1 var3 = new Il_l.III1();
      Il_l.III1 var4 = new Il_l.III1();
      Il10.IIII var5 = new Il10.IIII(var0.I1, var0.I1I);
      var5.I1l0 = 0;
      var5.I1lo = IIII(var0.I1, var0.I1I, var1.I1, var1.I1I);
      var2.III(var5);
      var4.II(new Integer(var5.hashCode()), var5);
      int[] var6 = new int[]{0, 1, 0, -1, 1, 1, -1, -1};
      int[] var7 = new int[]{-1, 0, 1, 0, -1, 1, -1, 1};
      int[] var8 = new int[]{10, 10, 10, 10, 14, 14, 14, 14};

      while (!var2.II1_()) {
         Il10.IIII var9 = (Il10.IIII)var2.II();
         var4.III(new Integer(var9.hashCode()));
         if (var9.I1 == var1.I1 && var9.I1I == var1.I1I) {
            return II(var9);
         }

         var3.II(new Integer(var9.hashCode()), var9);

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = var9.I1 + var6[var10];
            int var12 = var9.I1I + var7[var10];
            if (var11 >= 0
               && var12 >= 0
               && var11 < IOlO.l10_
               && var12 < IOlO.l10O
               && III(var11, var12)
               && (var10 < 4 || III(var9.I1 + var6[var10], var9.I1I) && III(var9.I1, var9.I1I + var7[var10]))) {
               Integer var13 = new Integer(var11 * 10000 + var12);
               if (!var3.IIII(var13)) {
                  int var14 = var9.I1l0 + var8[var10];
                  Il10.IIII var15 = (Il10.IIII)var4.II(var13);
                  if (var15 == null) {
                     Il10.IIII var18 = new Il10.IIII(var11, var12);
                     var18.I1l0 = var14;
                     var18.I1lo = IIII(var11, var12, var1.I1, var1.I1I);
                     var18.II = var9;
                     var2.III(var18);
                     var4.II(var13, var18);
                  } else if (var14 < var15.I1l0) {
                     var15.I1l0 = var14;
                     var15.II = var9;
                     var2.I_1O();
                     Il_l.II var16 = var4.IIIl();

                     for (int var17 = 0; var17 < var16.IIlO(); var17++) {
                        var2.III(var16.II(var17));
                     }
                  }
               }
            }
         }
      }

      return null;
   }

   private static Il_l.II II(Il10.IIII var0) {
      Il_l.II var1 = new Il_l.II();

      for (Il10.IIII var2 = var0; var2 != null; var2 = var2.II) {
         var1.III(0, new Il10.IIII(var2.I1, var2.I1I));
      }

      return var1;
   }

   private static boolean III(int var0, int var1) {
      if (var0 >= 0 && var1 >= 0 && var0 < IOlO.l10_ && var1 < IOlO.l10O) {
         int var2 = IOlO.IIIo(var0, var1);
         if (var2 != 0) {
            return false;
         }

         if (var1 > 0) {
            int var3 = IOlO.IIIo(var0, var1 - 1);
            if (var3 != 0) {
               return false;
            }
         }

         int[] var11 = new int[]{-1, 1, 0, 0};
         int[] var4 = new int[]{0, 0, -1, 1};
         int[] var5 = new int[]{4, 8, 64, 8192, 8200, 8196, 8204};

         for (int var6 = 0; var6 < 4; var6++) {
            int var7 = var0 + var11[var6];
            int var8 = var1 + var4[var6];
            if (var7 >= 0 && var8 >= 0 && var7 < IOlO.l10_ && var8 < IOlO.l10O) {
               int var9 = IOlO.IIIo(var7, var8);

               for (int var10 = 0; var10 < var5.length; var10++) {
                  if (var9 == var5[var10]) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static Il10.IIII II(int var0, int var1) {
      for (int var2 = 1; var2 <= 5; var2++) {
         for (int var3 = -var2; var3 <= var2; var3++) {
            for (int var4 = -var2; var4 <= var2; var4++) {
               if (Math.abs(var3) == var2 || Math.abs(var4) == var2) {
                  int var5 = var0 + var3;
                  int var6 = var1 + var4;
                  if (III(var5, var6)) {
                     return new Il10.IIII(var5, var6);
                  }
               }
            }
         }
      }

      return null;
   }

   interface II {
      int II(Object var1, Object var2);
   }

   static class III implements Il10.II {
      private III() {
      }

      @Override
      public int II(Object var1, Object var2) {
         Il10.IIII var3 = (Il10.IIII)var1;
         Il10.IIII var4 = (Il10.IIII)var2;
         int var5 = var3.IIl_();
         int var6 = var4.IIl_();
         if (var5 < var6) {
            return -1;
         } else if (var5 > var6) {
            return 1;
         } else if (var3.I1lo < var4.I1lo) {
            return -1;
         } else {
            return var3.I1lo > var4.I1lo ? 1 : 0;
         }
      }
   }

   public static class IIII {
      public int I1;
      public int I1I;
      public int I1l0;
      public int I1lo;
      public Il10.IIII II;

      public IIII(int var1, int var2) {
         this.I1 = var1;
         this.I1I = var2;
         this.I1l0 = 0;
         this.I1lo = 0;
         this.II = null;
      }

      public IIII(int var1, int var2, int var3, int var4, Il10.IIII var5) {
         this.I1 = var1;
         this.I1I = var2;
         this.I1l0 = var3;
         this.I1lo = var4;
         this.II = var5;
      }

      public int IIl_() {
         return this.I1l0 + this.I1lo;
      }

      @Override
      public boolean equals(Object var1) {
         if (!(var1 instanceof Il10.IIII)) {
            return false;
         }

         Il10.IIII var2 = (Il10.IIII)var1;
         return this.I1 == var2.I1 && this.I1I == var2.I1I;
      }

      @Override
      public int hashCode() {
         return this.I1 * 10000 + this.I1I;
      }
   }

   static class IIIl {
      private Il_l.II IIl = new Il_l.II();
      private Il10.II II;

      IIIl(Il10.II var1) {
         this.II = var1;
      }

      void III(Object var1) {
         this.IIl.III(var1);
      }

      Object II() {
         if (this.IIl.II1_()) {
            return null;
         }

         int var1 = 0;

         for (int var2 = 1; var2 < this.IIl.IIlO(); var2++) {
            if (this.II.II(this.IIl.II(var2), this.IIl.II(var1)) < 0) {
               var1 = var2;
            }
         }

         return this.IIl.III(var1);
      }

      boolean II1_() {
         return this.IIl.II1_();
      }

      void I_1O() {
         this.IIl.I_1O();
      }
   }
}
