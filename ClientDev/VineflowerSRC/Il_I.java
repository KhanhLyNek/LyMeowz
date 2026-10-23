package main;

public class Il_I {
   private static Il_I II;
   private static final long Il = 30L;
   private static final int I11O = 3;
   private static final int I110 = 24;
   private Il_l.II IIlo = null;
   private int I11o = 0;
   private long IlI = 0L;

   private Il_I() {
   }

   public static Il_I II() {
      if (II == null) {
         II = new Il_I();
      }

      return II;
   }

   public static Il_I III() {
      return II();
   }

   public void II(Il10.IIII var1, Il10.IIII var2) {
      this.IIlo = Il10.II(var1, var2);
      if (this.IIlo != null) {
         this.I11o = 0;
         this.IlI = IO10.IIII();
      }
   }

   public void IIlO() {
      if (this.IIlo != null) {
         if (IO10.IIII() - this.IlI >= 30L) {
            if (this.I11o >= this.IIlo.IIlO()) {
               this.II0();
            } else {
               int var1 = this.I11o + 3;
               if (var1 > this.IIlo.IIlO() - 1) {
                  var1 = this.IIlo.IIlO() - 1;
               }

               Il10.IIII var2 = (Il10.IIII)this.IIlo.II(var1);
               this.IIIl(var2.I1, var2.I1I);
               this.I11o += 3;
               this.IlI = IO10.IIII();
            }
         }
      }
   }

   private void IIIl(int var1, int var2) {
      try {
         int var3 = var1 * 24;
         int var4 = var2 * 24 + 24;
         Ilol var5 = Ilol.II();
         if (var5 != null) {
            var5.II = null;
            var5.I_o_ = var3;
            var5.I_oO = var4;
            I_0_ var6 = I_0_.II();
            if (var6 != null) {
               var6.IoO();
            }
         }
      } catch (Exception var7) {
      }
   }

   public void II0() {
      this.IIlo = null;
      this.I11o = 0;
      this.IlI = 0L;
   }

   public boolean II1O() {
      return this.IIlo != null && this.I11o < this.IIlo.IIlO();
   }
}
