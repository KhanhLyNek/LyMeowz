package main;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class I1OI {
   private static byte[] IIl1 = new byte[]{-22, 2, 12, 4, 5, 2, -10};
   private int I_O0 = 0;

   public static Image II(String var0) {
      if (var0 == null) {
         return null;
      }

      Image var1 = null;
      var0 = Illl("\ue099\ue0ad", 57526) + IO1l.l_I0 + var0;
      InputStream var2 = null;

      try {
         var2 = I1OI.class.getResourceAsStream(var0);
         if (var2 != null) {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            byte[] var4 = new byte[4096];

            int var5;
            while ((var5 = var2.read(var4)) > 0) {
               var3.write(var4, 0, var5);
            }

            byte[] var6 = var3.toByteArray();
            I1OI var7 = new I1OI();
            var7.I_O0 = 0;

            for (int var8 = 0; var8 < var6.length; var8++) {
               byte var9 = var6[var8];
               var9 = (byte)(IIl1[var7.I_O0++] & 0xFF ^ var9 & 0xFF);
               if (var7.I_O0 >= IIl1.length) {
                  var7.I_O0 = var7.I_O0 % IIl1.length;
               }

               var6[var8] = var9;
            }

            var1 = Image.createImage(var6, 0, var6.length);
         }
      } catch (Throwable var20) {
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var18) {
            }
         }
      }

      if (var1 == null) {
         try {
            var1 = Image.createImage(var0);
         } catch (Throwable var19) {
            return null;
         }
      }

      return var1;
   }
}
