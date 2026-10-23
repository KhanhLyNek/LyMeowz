package main;

public class Il_ {
   private static Il_ II;
   private static final int I11 = 24;
   private static final int I11I = 5;
   private Il_l.II IIl0 = null;
   private int I11l = 0;
   private int I111 = 0;
   private int I11_ = 0;

   private Il_() {
   }

   public static Il_ II() {
      if (II == null) {
         II = new Il_();
      }

      return II;
   }

   public static Il_ III() {
      return II();
   }

   public void II(Il10.IIII var1, Il10.IIII var2) {
      Il_l.II var3 = Il10.II(var1, var2);
      if (var3 != null && var3.IIlO() > 0) {
         this.IIl0 = this.II(var3);
         this.I11l = 0;
         this.I111 = var2.I1 * IOlO.IlI0 + 24;
         this.I11_ = var2.I1I * IOlO.IlI0 + 24;
      } else {
         this.II0();
      }
   }

   public void IIlO() {
      if (this.IIl0 != null && Ilol.II() != null) {
         if (this.I11l >= this.IIl0.IIlO()) {
            this.II0();
         } else {
            byte var1 = IOlO.IlI0;
            int var2 = Ilol.II().I_o_;
            int var3 = Ilol.II().I_oO;
            Il10.IIII var4 = (Il10.IIII)this.IIl0.II(this.I11l);
            int var5 = var4.I1 * var1 + 24;
            int var6 = var4.I1I * var1 + 24;
            Ilol.II().II = new I_ll(var5, var6);
            int var7 = Il_O.II(var2, var3, var5, var6);
            if (var7 <= var1) {
               this.I11l++;
            }
         }
      }
   }

   private Il_l.II II(Il_l.II var1) {
      if (var1 != null && var1.IIlO() > 2) {
         Il_l.II var2 = new Il_l.II();
         var2.III(var1.II(0));

         for (int var3 = 1; var3 < var1.IIlO() - 1; var3++) {
            Il10.IIII var4 = (Il10.IIII)var2.II(var2.IIlO() - 1);
            Il10.IIII var5 = (Il10.IIII)var1.II(var3);
            Il10.IIII var6 = (Il10.IIII)var1.II(var3 + 1);
            int var7 = Math.abs(var5.I1 - var4.I1) + Math.abs(var5.I1I - var4.I1I);
            if (!this.II(var4, var5, var6) || var7 > 5) {
               var2.III(var5);
            }
         }

         var2.III(var1.II(var1.IIlO() - 1));
         return var2;
      } else {
         return var1;
      }
   }

   private boolean II(Il10.IIII var1, Il10.IIII var2, Il10.IIII var3) {
      int var4 = (var2.I1 - var1.I1) * (var3.I1I - var1.I1I) - (var2.I1I - var1.I1I) * (var3.I1 - var1.I1);
      return var4 == 0;
   }

   public void II0() {
      this.IIl0 = null;
      this.I11l = 0;
      this.I111 = 0;
      this.I11_ = 0;
   }

   public boolean II1O() {
      return this.IIl0 != null && this.I11l < this.IIl0.IIlO();
   }
}
