package main;

public final class Il0l {
   public int II0I = 0;
   public int I_O0;
   public int I_Oo;
   private int I_0;
   private int IIO;
   private int IIOI;
   private int IIOl;
   private int IIlI;
   private int IIO1;
   private Ilol III;
   private Il01 II = null;
   private static byte[] III = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
   private static int[] IIOO = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   private static int[] IIO0 = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};

   public Il0l(Ilol var1, Il01 var2) {
      this.III = var1;
      this.II = var2;
   }

   public void IIl1() {
      if (this.III.IIII != null || this.III.IIIl != null) {
         if (this.III.IIII != null) {
            this.I_0 = this.III.IIII.I1;
            this.IIO = this.III.IIII.I1I - this.III.IIII.IIl / 4;
         } else if (this.III.IIIl != null) {
            this.I_0 = this.III.IIIl.I_o_;
            this.IIO = this.III.IIIl.I_oO - this.III.IIIl.IO11 / 4;
         }

         int var1 = this.I_0 - this.I_O0;
         int var2 = this.IIO - this.I_Oo;
         byte var3 = 4;
         if (var1 + var2 < 60) {
            var3 = 3;
         } else if (var1 + var2 < 30) {
            var3 = 2;
         }

         if (this.I_O0 != this.I_0) {
            if (var1 > 0 && var1 < 5) {
               this.I_O0 = this.I_0;
            } else if (var1 < 0 && var1 > -5) {
               this.I_O0 = this.I_0;
            } else {
               this.IIOI = this.I_0 - this.I_O0 << 2;
               this.IIlI = this.IIlI + this.IIOI;
               this.I_O0 = this.I_O0 + (this.IIlI >> var3);
               this.IIlI &= 15;
            }
         }

         if (this.I_Oo != this.IIO) {
            if (var2 > 0 && var2 < 5) {
               this.I_Oo = this.IIO;
            } else if (var2 < 0 && var2 > -5) {
               this.I_Oo = this.IIO;
            } else {
               this.IIOl = this.IIO - this.I_Oo << 2;
               this.IIO1 = this.IIO1 + this.IIOl;
               this.I_Oo = this.I_Oo + (this.IIO1 >> var3);
               this.IIO1 &= 15;
            }
         }

         var1 = 0;
         var2 = 0;
         int var4 = 0;
         int var5 = 0;
         if (this.III.IIII != null) {
            var1 = this.I_0 - this.III.IIII.Iol / 4;
            var4 = this.I_0 + this.III.IIII.Iol / 4;
            var2 = this.IIO - this.III.IIII.IIl / 4;
            var5 = this.IIO + this.III.IIII.IIl / 4;
         } else if (this.III.IIIl != null) {
            var1 = this.I_0 - this.III.IIIl.IO1l / 4;
            var4 = this.I_0 + this.III.IIIl.IO1l / 4;
            var2 = this.IIO - this.III.IIIl.IO11 / 4;
            var5 = this.IIO + this.III.IIIl.IO11 / 4;
         }

         if (this.II0I > 0) {
            this.II0I--;
         }

         if (this.II0I != 0 && (this.I_O0 < var1 || this.I_O0 > var4 || this.I_Oo < var2 || this.I_Oo > var5)) {
            return;
         }
      }

      this.IOlI();
   }

   private void IOlI() {
      this.III.II = null;
      this.I_O0 = this.I_Oo = this.I_0 = this.IIO = this.IIOI = this.IIOl = this.IIlI = this.IIO1 = 0;
      this.III.IOoI();
   }

   public void II(IO1l var1) {
      int var2 = this.I_0 - this.I_O0;
      int var3 = this.IIO - this.I_Oo;
      var2 = I_Ol.III1(var2, -var3);
      var3 = 0;

      byte var4;
      while (true) {
         if (var3 >= IIOO.length - 1) {
            var4 = 0;
            break;
         }

         if (var2 >= IIOO[var3] && var2 <= IIOO[var3 + 1]) {
            var4 = (byte)(var3 >= 16 ? 0 : var3);
            break;
         }

         var3++;
      }

      I_oo.IIII(var1, this.II.IIOo[III[var4]], this.I_O0, this.I_Oo, IIO0[var4], 3);
   }
}
