package main;

import javax.microedition.lcdui.Image;

public final class I_oO {
   public Image I1I1;
   public int I_O0;
   public int I_Oo;
   public int I_0;

   public I_oO(Image var1, int var2) {
      this.I1I1 = var1;
      this.I_O0 = var2;
      this.I_Oo = 0;
      this.I_0 = 0;
   }

   public void II(IO1l var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      var1.III(this.I1I1, 0, 0, IO1l.II(this.I1I1), IO1l.III(this.I1I1), var2, var3, var4, var5);
      if (II.IIIO % 1000 == 0) {
         this.I_Oo++;
         this.I_0 = this.I_Oo;
      }
   }

   public void II(IO1l var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      boolean var9 = false;
      if (IO1l.II(this.I1I1) != 1) {
         var1.III(this.I1I1, 0, var3 * var6, var6, var7, var2, var4, var5, var8);
         if (II.IIIO % 1000 == 0) {
            this.I_Oo++;
            this.I_0 = this.I_Oo;
         }
      }
   }
}
