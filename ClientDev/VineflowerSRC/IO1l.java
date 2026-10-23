package main;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class IO1l {
   public Graphics II;
   public static int l_I0 = 1;

   public void II(int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 *= l_I0;
      var2 *= l_I0;
      var3 *= l_I0;
      var4 *= l_I0;
      this.II.fillArc(var1, var2, var3, var4, 0, 360);
   }

   public void II(Image var1, int var2, int var3, int var4) {
      if (var1 != null) {
         var2 *= l_I0;
         var3 *= l_I0;
         this.II.drawImage(var1, var2, var3, var4);
      }
   }

   public void II(Image var1, float var2, float var3, int var4) {
      float var5 = var3;
      if (var1 != null) {
         var3 = var2 * l_I0;
         var5 *= l_I0;
         this.II.drawImage(var1, (int)var3, (int)var5, var4);
      }
   }

   public void IIII(int var1, int var2, int var3, int var4) {
      var1 *= l_I0;
      var2 *= l_I0;
      var3 *= l_I0;
      var4 *= l_I0;
      this.II.drawLine(var1, var2, var3, var4);
   }

   public void III(int var1, int var2, int var3, int var4, int var5) {
      var1 *= l_I0;
      var2 *= l_I0;
      var3 *= l_I0;
      var4 *= l_I0;
      this.II.setColor(var5);
      this.II.fillRect(var1, var2, var3, var4);
   }

   public void IIIl(int var1, int var2, int var3, int var4) {
      this.III_(var1, var2, var3, var4);
   }

   public void III1(int var1, int var2, int var3, int var4) {
      this.III_(var1, var2, 1, var4);
      this.III_(var1 + var3, var2, 1, var4);
      this.III_(var1, var2, var3, 1);
      this.III_(var1, var2 + var4, var3 + 1, 1);
   }

   public void II(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var1 != null) {
         var7 *= l_I0;
         var8 *= l_I0;
         var2 *= l_I0;
         var3 *= l_I0;
         var4 *= l_I0;
         var5 *= l_I0;
         int var10 = var1.getWidth();
         int var11 = var1.getHeight();
         if (var2 < 0 || var3 < 0) {
            return;
         }

         if (var2 + var4 > var10) {
            var4 = var10 - var2;
         }

         if (var3 + var5 > var11) {
            var5 = var11 - var3;
         }

         if (var4 <= 0 || var5 <= 0) {
            return;
         }

         this.II.drawRegion(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public void III(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var1 != null) {
         this.II(var1, 0, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public void II(Image var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         int var6 = II(var1);
         int var7 = III(var1);
         if (var6 > 0 && var7 > 0) {
            for (int var8 = 0; var8 < var4 / var6 + 1; var8++) {
               for (int var9 = 0; var9 < var5 / var7 + 1; var9++) {
                  this.II.drawImage(var1, 0 + var8 * var6, 0 + var9 * var7, 0);
               }
            }
         }
      }
   }

   public static int II(float var0, int var1, int var2) {
      I_Ol.II__(I1Io("Ⓧ⒢⒈╢╏╪┊◧○▩▗", 9391));
      var0 = var2 >> 16 & 0xFF;
      float var3 = var2 >> 8 & 0xFF;
      float var4 = var2 & 0xFF;
      var0 *= 0.4F;
      var3 *= 0.4F;
      var4 *= 0.4F;
      if (var0 > 255.0F) {
         var0 = 255.0F;
      }

      if (var0 < 0.0F) {
         var0 = 0.0F;
      }

      if (var3 > 255.0F) {
         var3 = 255.0F;
      }

      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      if (var4 > 255.0F) {
         var4 = 255.0F;
      }

      return 0xFF000000 | (int)var0 << 16 | (int)var3 << 8 | (int)var4 & 0xFF;
   }

   public void III_(int var1, int var2, int var3, int var4) {
      var1 *= l_I0;
      var2 *= l_I0;
      var3 *= l_I0;
      var4 *= l_I0;
      this.II.fillRect(var1, var2, var3, var4);
   }

   public final int IIO1() {
      return this.II.getTranslateX() / l_I0;
   }

   public final int IIO_() {
      return this.II.getTranslateY() / l_I0;
   }

   public void IIIO(int var1, int var2, int var3, int var4) {
      var1 *= l_I0;
      var2 *= l_I0;
      var3 *= l_I0;
      var4 *= l_I0;
      this.II.setClip(var1, var2, var3, var4);
   }

   public final int IIOO() {
      return this.II.getClipX();
   }

   public final int IIO0() {
      return this.II.getClipY();
   }

   public final int IIOo() {
      return this.II.getClipWidth();
   }

   public final int II0() {
      return this.II.getClipHeight();
   }

   public void Illl(int var1) {
      this.II.setColor(var1);
   }

   public void IIl0(int var1, int var2) {
      var1 *= l_I0;
      var2 *= l_I0;
      this.II.translate(var1, var2);
   }

   public static int II(Image var0) {
      return var0 == null ? 0 : var0.getWidth() / l_I0;
   }

   public static int III(Image var0) {
      return var0 == null ? 0 : var0.getHeight() / l_I0;
   }

   public static int IIII(Image var0) {
      return var0 == null ? 0 : var0.getWidth();
   }

   public static int IIIl(Image var0) {
      return var0 == null ? 0 : var0.getHeight();
   }
}
