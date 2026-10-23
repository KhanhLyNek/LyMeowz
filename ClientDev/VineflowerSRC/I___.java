package main;

public final class I___ {
   public byte IIO1;
   public int I_O0;
   public int I_Oo;
   public int I_0;
   public int IIO;
   public int IIOI;
   public int IIOl;
   public int IIlI;
   public int IIO1;
   public int IIO_;
   public int IoII;
   public int IIO0;
   public boolean I__I = false;
   public boolean IIl = false;
   public boolean I01o = false;
   public I11o IIl_;
   public I11o IIlO;
   private byte[] IIlO = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
   public byte[] IIl0 = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
   public byte[] IIlo = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};

   public void IIl1() {
      this.IIO1++;
      this.I_O0 = this.I_O0 + this.IIO;
      this.I_Oo = this.I_Oo + this.IIOI;
   }

   public final int IIlI(int var1) {
      byte var2;
      if (var1 > 15 && var1 <= 345) {
         if ((var1 = (var1 - 15) / 15 + 1) > 24) {
            var1 = 24;
         }

         var2 = this.IIlO[var1];
      } else {
         var2 = 12;
      }

      return var2;
   }

   public void II(IO1l var1, I11o var2, int var3, boolean var4) {
      if (var2 != null) {
         if ((var3 = var2.I_Oo / 3) <= 0) {
            var3 = 1;
         }

         int var5;
         if (var2.I_Oo > 3) {
            var5 = this.IIO1 / 3 % 2 == 0 ? 0 : 3;
         } else {
            var5 = this.IIO1 % var3;
         }

         var3 = var3 * this.IIl0[this.IoII] + var5;
         if (var2.I_Oo < 3) {
            var3 = this.IIO1 / 3 % var2.I_Oo;
         }

         var2.II(var3, this.I_O0, this.I_Oo, this.IIlo[this.IoII], 3, var1);
      }
   }
}
