package main;

import javax.microedition.lcdui.Image;

public final class I11o {
   public int II0I;
   public int I_O0;
   public int I_Oo;
   public Image II0_;

   public I11o(int var1) {
      Image var2;
      if ((var2 = I111.II(var1)) != null) {
         this.II0_ = var2;
         this.II0I = I111.IIIl[var1][0];
         this.I_O0 = I111.IIIl[var1][1] / I111.IIIl[var1][2];
         this.I_Oo = I111.IIIl[var1][2];
      }
   }

   public I11o(Image var1, int var2, int var3) {
      if (var1 != null) {
         this.II0_ = var1;
         this.II0I = var2;
         this.I_O0 = var3;
         this.I_Oo = var1.getHeight() / var3;
         if (this.I_Oo <= 0) {
            this.I_Oo = 1;
         }
      }
   }

   public void II(int var1, int var2, int var3, int var4, int var5, IO1l var6) {
      try {
         if (this.II0_ != null) {
            if (var1 > this.I_Oo) {
               var1 = this.I_Oo;
            }

            var6.II(this.II0_, 0, var1 * this.I_O0, this.II0I, this.I_O0, var4, var2, var3, var5);
            return;
         }
      } catch (Exception var8) {
      }
   }
}
