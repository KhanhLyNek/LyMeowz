package main;

public final class I1ol {
   public short II_o;
   public int I_O0 = 0;
   public int I_Oo;
   private long I1;
   private long IlO;
   private boolean III1;
   private int IIOl;
   private int IIlI;
   private boolean I1_l;
   private boolean I1l;
   private String IlI_;
   private int IIO0 = 100;

   public I1ol(short var1, int var2) {
      this.II_o = var1;
      this.I_Oo = var2 / 60;
      this.I_O0 = var2 % 60;
      this.IIOl = var2;
      this.IIlI = var2;
      this.I1 = this.IlO = System.currentTimeMillis();
      this.III1 = var1 == 14;
   }

   public I1ol() {
   }

   public static boolean II1_(int var0) {
      for (int var1 = 0; var1 < Ilol.II.size(); var1++) {
         if (((I1ol)Ilol.II.elementAt(var1)).II_o == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean II1O(int var0) {
      for (int var1 = 0; var1 < I1_I.IIO1.size(); var1++) {
         if (((I1ol)I1_I.IIO1.elementAt(var1)).II_o == var0) {
            return true;
         }
      }

      return false;
   }

   public static I1ol II(int var0) {
      for (int var1 = 0; var1 < Ilol.II.size(); var1++) {
         I1ol var2;
         if ((var2 = (I1ol)Ilol.II.elementAt(var1)).II_o == var0) {
            return var2;
         }
      }

      return null;
   }

   public static I1ol III(int var0) {
      for (int var1 = 0; var1 < I1_I.IIO1.size(); var1++) {
         I1ol var2;
         if ((var2 = (I1ol)I1_I.IIO1.elementAt(var1)).II_o == var0) {
            return var2;
         }
      }

      return null;
   }

   public void II(byte var1, String var2, int var3) {
      if (var3 == -1) {
         this.I1l = true;
      } else {
         this.I1l = false;
      }

      this.I1_l = true;
      this.I_Oo = var3 / 60;
      this.I_O0 = var3 % 60;
      this.II_o = var1;
      this.IIOl = var3;
      this.IIlI = var3;
      this.IlI_ = var2;
      this.I1 = this.IlO = System.currentTimeMillis();
      this.III1 = this.II_o == 14;
   }

   public void III(int var1, boolean var2) {
      this.I_Oo = var1 / 60;
      this.I_O0 = var1 % 60;
      this.IIOl = var1;
      this.IIlI = var1;
      this.I1_l = false;
      this.I1 = this.IlO = System.currentTimeMillis();
   }

   public void IIIl(IO1l var1, int var2, int var3) {
      if (this.III1) {
         if (Ilol.II() != null) {
            var2 = II.IIl / 2 - 40;
            var3 = II.IIlI - 80;
            var1.Illl(8421504);
            var1.III_(var2, var3, 80, 2);
            var1.Illl(16777215);
            if (this.IIO0 > 0) {
               var1.III_(var2, var3, 80 * this.IIO0 / 100, 2);
               return;
            }
         }
      } else {
         String var4 = this.I_Oo + Il1_("隑", 38582);
         if (this.I_Oo <= 0) {
            var4 = this.I_O0 + Il1_("雅", 38582);
         }

         if (this.I_Oo < 0) {
            var4 = "";
         }

         if (this.I1l) {
            var4 = "";
         }

         IO1I.IIII.II(var1, this.IlI_ + Il1_("隖", 38582) + var4, var2, var3, 0, IO1I.III_);
      }
   }

   public void IIlO() {
      this.I1 = System.currentTimeMillis();
      if (this.I1 - this.IlO >= 1000L) {
         this.IlO = System.currentTimeMillis();
         this.I_O0--;
         this.IIlI--;
         if (this.I_O0 <= 0) {
            this.I_O0 = 60;
            this.I_Oo--;
         }

         if (this.IIOl > 0) {
            this.IIO0 = this.IIlI * 100 / this.IIOl;
         }
      }

      if (this.I_Oo < 0 && !this.I1_l) {
         Ilol.II.removeElement(this);
      }

      if (this.I_Oo < 0 && this.I1_l && !this.I1l) {
         I1_I.IIO1.removeElement(this);
      }
   }
}
