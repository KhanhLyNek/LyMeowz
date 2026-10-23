package nrolite;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

public final class Res {
   private static Boolean II;
   private static final Hashtable IIIo = new Hashtable();
   private static Boolean III;

   private Res() {
   }

   public static byte[] readFile(String var0) {
      if (var0 == null) {
         return null;
      }

      File var1 = new File(DataDownloader.II(), var0);
      if (!var1.exists() || !var1.isFile()) {
         var1 = new File(var0);
      }

      if ((!var1.exists() || !var1.isFile()) && var0.startsWith(I1O0("啁", 21870))) {
         String var2 = var0.substring(1);
         var1 = new File(DataDownloader.II(), var2);
         if (!var1.exists() || !var1.isFile()) {
            var1 = new File(var2);
         }
      }

      if (var1.exists() && var1.isFile()) {
         FileInputStream var18 = null;

         try {
            var18 = new FileInputStream(var1);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream((int)var1.length());
            byte[] var4 = new byte[8192];

            int var5;
            while ((var5 = var18.read(var4)) > 0) {
               var3.write(var4, 0, var5);
            }

            return var3.toByteArray();
         } catch (Exception var16) {
            return null;
         } finally {
            if (var18 != null) {
               try {
                  var18.close();
               } catch (IOException var15) {
               }
            }
         }
      } else {
         return null;
      }
   }

   private static boolean Ilol() {
      if (II == null) {
         InputStream var0 = null;
         boolean var1 = false;

         try {
            var0 = Res.class.getResourceAsStream(I1O0("啁嗣嗞喤喆噠噜嘢噉囨囅嚳嚑圯坂坖地", 21870));
            var1 = var0 != null;
         } catch (Throwable var11) {
         } finally {
            if (var0 != null) {
               try {
                  var0.close();
               } catch (IOException var10) {
               }
            }
         }

         II = var1 ? Boolean.TRUE : Boolean.FALSE;
      }

      return II;
   }

   public static boolean IIll(String var0) {
      try {
         if (III == null) {
            III = Res.class.getResource(I1O0("啁嗀嗩喟喫嘤噡嘉嘠嚪囩嚂嚬坈坦坺圍圩垲埶垜", 21870)) != null ? Boolean.TRUE : Boolean.FALSE;
         }

         return !III ? true : Res.class.getResource(var0) != null;
      } catch (Throwable var2) {
         return true;
      }
   }

   public static byte[] read(String var0) {
      InputStream var1 = null;
      if (Ilol()) {
         try {
            if (IIll(I1O0("啁嗣嗞喤喆噠噜嘢噉", 21870) + var0)) {
               var1 = Res.class.getResourceAsStream(I1O0("啁嗣嗞喤喆噠噜嘢噉", 21870) + var0);
            }

            if (var1 != null) {
               ByteArrayOutputStream var18 = new ByteArrayOutputStream();
               byte[] var3 = new byte[4096];

               int var4;
               while ((var4 = var1.read(var3)) > 0) {
                  var18.write(var3, 0, var4);
               }

               return var18.toByteArray();
            }
         } catch (IOException var16) {
            return null;
         } finally {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (IOException var15) {
               }
            }
         }
      }

      byte[] var2 = readFile(I1O0("唊嗬嗘喪嗅噧噚嘨嘊囬囐嚦囍", 21870) + var0);
      if (var2 == null) {
         var2 = readFile(I1O0("唀嗿嗃喧喃噽噍器", 21870) + var0);
      }

      if (var2 == null && IIIo.put(var0, var0) == null) {
         System.out.println(I1O0("唵嗡嗅喿喏噔嘈嘓嘮囌囡嚖囂坯坒坐圲圔埨埞埵", 21870) + var0);
      }

      return var2;
   }
}
