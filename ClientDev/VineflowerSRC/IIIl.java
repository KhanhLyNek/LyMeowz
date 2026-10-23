package main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Image;

public class IIIl {
   public static boolean II_1 = true;
   private static Random II = new Random();

   public static void II1o() {
      try {
         try {
            if (I1_I.II().IIIO != null && !I_IO.I0l1) {
               String var0 = null;
               long var1 = IO10.IIII();

               try {
                  if (I1_I.Il_I == null) {
                     return;
                  }

                  String var3 = II(I1_I.Il_I);
                  if (Il_o.III1(var3)) {
                     I1_I.II.IIII(IIII("ꚃꚏꟲꝋꜣꝃꟶꟉ뤃ꟿꞙ꡴뚟꠲ꡚꣴꡛꣷꢞ꧹\ua95aꤻꥒ뜲꧞ꦧꧏ", 42696), 0);
                     return;
                  }

                  I1_I.II.IIII(IIII("ꟘꚆꝨꝂꝤ꜄\ua7eb뤂ꞩꟿꞓꣾꠜ꠳ꢖꣷ꣐ꣷ뙕ꥻ\ua95c\ua97d\ua95cꦿ", 42696), 0);
                  String var4 = IlI.II1l;
                  if (Il_o.III1(var4)) {
                     I1_I.II.IIII(IIII("ꚃꚏꟲꝋꜣꝃꟶꝍꞭꟿ꞊꡵뚙ꠢꡚ꣘꣨ꢞ꣖ꥀꥦꤟ꥓", 42696), 0);
                     return;
                  }

                  var0 = II(IIII("ꚡꚊꝧꝂ꜡Ꝟ", 42696) + II(var3), var4);
                  if (Il_o.III1(var0)) {
                     I1_I.II.IIII(IIII("ꚉꚷꝏ꜅ꜯ꜋ꝶ\ua7cfꞧꟿ꞊ꡯ뚟\ua87bꠌ뙘ꢘꢼ뙉ꥡꤔꤢ꤇뜲ꦑ", 42696), 0);
                  } else {
                     do {
                        I1_I.II.IIII(IIII("ꚋꚆꝶꝑꜧ꜋\ua7e3ꞛ\ua7e0", 42696) + var0, 0);
                        int var5 = (int)(IO10.IIII() - var1);
                        if (var5 < 5000) {
                           Thread.sleep(5000 - var5);
                        }

                        I1_I.II().IlII = var0;
                        if (var0.length() >= 4 && var0.length() <= 7) {
                           for (int var6 = 0; var6 < var0.length(); var6++) {
                              I_0_.II().II(var0.charAt(var6));
                              Thread.sleep(500 + II.nextInt(1000));
                           }
                        }

                        Thread.sleep(3000L);
                     } while (I1_I.II().IlII.equals(var0) && I1_I.II().IIIO != null);
                  }
               } catch (Exception var11) {
                  var11.printStackTrace();
                  Thread.sleep(3000L);
                  new Thread(new III1()).start();
               }
            }

            if (I1_I.II().IIIO != null) {
               Thread.sleep(30000L);
               return;
            }
         } catch (Throwable var12) {
            var12.printStackTrace();
         }
      } finally {
         II_1 = true;
      }
   }

   public static String II(Image var0) {
      Object var1 = null;

      try {
         if (var0 == null) {
            return null;
         } else {
            int var2 = var0.getWidth();
            int var3 = var0.getHeight();
            if (var2 * var3 > 50000) {
               System.out.println(IIII("ꚁꚊꝧꝂ꜡ꝃꟶ\ua7ceꞯꟿꞒ\ua87cꡎ\ua83cꠟꢣꢘ", 42696) + var2 + IIII("ꚰ", 42696) + var3);
               return null;
            } else {
               byte[] var4 = II(var0, var2, var3);
               return var4 == null ? null : II(var4);
            }
         }
      } catch (OutOfMemoryError var20) {
         System.out.println(IIII("ꚇꚒꝲꝪꜢꜮ\ua7e7\ua7ccꞯꞭꞇ\ua83dꡕ꠵ꡚ꣰꣕ꢶꢑꥰꥠꤼꤰ꧰꧃ꦪ꧘\uaa39", 42696));
         var20.printStackTrace();
         return null;
      } catch (Exception var21) {
         var21.printStackTrace();
         return null;
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (IOException var19) {
               var19.printStackTrace();
            }
         }
      }
   }

   private static byte[] II(Image var0, int var1, int var2) {
      ByteArrayOutputStream var3 = null;
      ByteArrayOutputStream var4 = null;

      try {
         int[] var5 = new int[var1 * var2];
         var0.getRGB(var5, 0, var1, 0, 0, var1, var2);
         var3 = new ByteArrayOutputStream();
         var3.write(new byte[]{-119, 80, 78, 71, 13, 10, 26, 10});
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();
         II(var6, var1);
         II(var6, var2);
         var6.write(8);
         var6.write(2);
         var6.write(0);
         var6.write(0);
         var6.write(0);
         II(var3, IIII("ꚁꚯꝂꝷ", 42696), var6.toByteArray());
         var4 = new ByteArrayOutputStream();

         for (int var7 = 0; var7 < var2; var7++) {
            var4.write(0);

            for (int var8 = 0; var8 < var1; var8++) {
               int var9 = var5[var7 * var1 + var8];
               var4.write(var9 >> 16 & 0xFF);
               var4.write(var9 >> 8 & 0xFF);
               var4.write(var9 & 0xFF);
            }
         }

         byte[] var23 = var4.toByteArray();
         byte[] var24 = II(var23);
         if (var24 == null) {
            System.out.println(IIII("ꚌꚂꝠꝉꜥꜗ\ua7e7ꞁꞦꞾꞗꡱꡙ\ua83f", 42696));
            return null;
         } else {
            II(var3, IIII("ꚁꚣꝇꝱ", 42696), var24);
            II(var3, IIII("ꚁꚢꝈꝡ", 42696), new byte[0]);
            Object var22 = null;
            System.gc();
            return var3.toByteArray();
         }
      } catch (Exception var20) {
         var20.printStackTrace();
         return null;
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }

            if (var3 != null) {
               var3.close();
            }
         } catch (IOException var19) {
            var19.printStackTrace();
         }
      }
   }

   private static byte[] II(byte[] var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         var1.write(120);
         var1.write(1);
         char var2 = '耀';
         int var3 = 0;

         while (var3 < var0.length) {
            int var4 = Math.min(var2, var0.length - var3);
            boolean var5 = var3 + var4 >= var0.length;
            var1.write(var5 ? 1 : 0);
            var1.write(var4 & 0xFF);
            var1.write(var4 >> 8 & 0xFF);
            var1.write(~var4 & 0xFF);
            var1.write(~var4 >> 8 & 0xFF);
            var1.write(var0, var3, var4);
            var3 += var4;
         }

         int var7 = II(var0);
         II(var1, var7);
         return var1.toByteArray();
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private static int II(byte[] var0) {
      int var1 = 1;
      int var2 = 0;

      for (int var3 = 0; var3 < var0.length; var3++) {
         var1 = (var1 + (var0[var3] & 255)) % 65521;
         var2 = (var2 + var1) % 65521;
      }

      return var2 << 16 | var1;
   }

   private static void II(ByteArrayOutputStream var0, String var1, byte[] var2) throws IOException {
      II(var0, var2.length);
      byte[] var3 = var1.getBytes(IIII("ꚁꚴꝉ꜈ꝼꝛꞷꞘ\ua7ed\ua7ee", 42696));
      var0.write(var3);
      var0.write(var2);
      int var4 = II(var3, var2);
      II(var0, var4);
   }

   private static int II(byte[] var0, byte[] var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < var0.length; var3++) {
         var2 ^= var0[var3] & 255;

         for (int var4 = 0; var4 < 8; var4++) {
            if ((var2 & 1) != 0) {
               var2 = var2 >>> 1 ^ -306674912;
            } else {
               var2 >>>= 1;
            }
         }
      }

      for (int var5 = 0; var5 < var1.length; var5++) {
         var2 ^= var1[var5] & 255;

         for (int var6 = 0; var6 < 8; var6++) {
            if ((var2 & 1) != 0) {
               var2 = var2 >>> 1 ^ -306674912;
            } else {
               var2 >>>= 1;
            }
         }
      }

      return ~var2;
   }

   private static void II(ByteArrayOutputStream var0, int var1) throws IOException {
      var0.write(var1 >> 24 & 0xFF);
      var0.write(var1 >> 16 & 0xFF);
      var0.write(var1 >> 8 & 0xFF);
      var0.write(var1 & 0xFF);
   }

   private static String II(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         String var1 = IIII("ꚉꚥꝅꝡ꜁ꜥꟅ\ua7e9꞉ꞕꞵꡑꡱꠕ꠵\ua8c9꣩ꢅꢥꥁꥡ꤅ꤥ꧉ꧩꦕꦏꩯ\uaa4fꨯꨏꫯ\uaacfꪯꪏ\uab6fꭏ\uab2f\uab0f\uabefꯏꯏꮯꮏ걯걏갯갏곯곏겯겏괤괂굠굂궤궚그귚긴긒깡깆", 42696);
         StringBuffer var2 = new StringBuffer(var0.length * 4 / 3 + 4);

         try {
            for (byte var3 = 0; var3 < var0.length; var3 += 3) {
               int var4 = var0[var3] & 255;
               int var5 = var3 + 1 < var0.length ? var0[var3 + 1] & 0xFF : 0;
               int var6 = var3 + 2 < var0.length ? var0[var3 + 2] & 0xFF : 0;
               int var7 = var4 << 16 | var5 << 8 | var6;
               var2.append(var1.charAt(var7 >> 18 & 63));
               var2.append(var1.charAt(var7 >> 12 & 63));
               if (var3 + 1 < var0.length) {
                  var2.append(var1.charAt(var7 >> 6 & 63));
               } else {
                  var2.append('=');
               }

               if (var3 + 2 < var0.length) {
                  var2.append(var1.charAt(var7 & 63));
               } else {
                  var2.append('=');
               }
            }

            return var2.toString();
         } catch (OutOfMemoryError var8) {
            System.out.println(IIII("ꚇꚒꝲꝪꜢꜮ\ua7e7\ua7ccꞯꞭꞇ\ua83dꡕ꠵ꡚ꣼꣖ꢴꢙꥱꥑꤑꤓꧢ꧕꧹\ua9da", 42696));
            return null;
         }
      } else {
         return null;
      }
   }

   private static String II(String var0) {
      if (var0 == null) {
         return "";
      }

      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if ((var3 < 'A' || var3 > 'Z') && (var3 < 'a' || var3 > 'z') && (var3 < '0' || var3 > '9') && var3 != '-' && var3 != '_' && var3 != '.' && var3 != '~'
            )
          {
            var1.append('%');
            String var4 = Integer.toHexString(var3).toUpperCase();
            if (var4.length() == 1) {
               var1.append('0');
            }

            var1.append(var4);
         } else {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   private static String II(String var0, String var1) {
      HttpConnection var2 = null;
      InputStream var3 = null;
      OutputStream var4 = null;

      try {
         var2 = (HttpConnection)Connector.open(var1);
         var2.setRequestMethod(IIII("Ꚙꚨꝕꝱ", 42696));
         var2.setRequestProperty(IIII("ꚋꚈꝨꝑ꜡꜍ꟶꞌꞔꞦꞎ\ua878", 42696), IIII("ꚩꚗꝶꝉꜭ꜀\ua7e3ꟕꞩꞰꞐ꠲ꡄ꡶ꠍ꣮꣏꣺ꢐꥺꥆꤾ꥟ꧤ꧂ꦣꦋꩣ\uaa4fꨤꨎꫬ\uaacc", 42696));
         var2.setRequestProperty(IIII("ꚋꚈꝨꝑ꜡꜍ꟶꞌꞌꞺꞐ\ua87aꡈ꠳", 42696), String.valueOf(var0.length()));
         var4 = var2.openOutputStream();
         var4.write(var0.getBytes(IIII("ꚝꚳꝀ꜈ꝼ", 42696)));
         var4.flush();
         int var5 = var2.getResponseCode();
         if (var5 != 200) {
            System.out.println(IIII("ꚀꚳꝒꝵꝤꜦ\ua7f0ꟓꞯꞭꟄ\ua83d", 42696) + var5);
            return null;
         }

         var3 = var2.openInputStream();
         StringBuffer var6 = new StringBuffer();

         int var7;
         while ((var7 = var3.read()) != -1) {
            var6.append((char)var7);
         }

         return III(var6.toString());
      } catch (Exception var19) {
         var19.printStackTrace();
         return null;
      } finally {
         try {
            if (var3 != null) {
               var3.close();
            }

            if (var4 != null) {
               var4.close();
            }

            if (var2 != null) {
               var2.close();
            }
         } catch (Exception var18) {
            var18.printStackTrace();
         }
      }
   }

   private static String III(String var0) {
      if (var0 != null && var0.length() != 0) {
         try {
            if (Il_o.II(var0, IIII("ꛪꚂꝴꝗꜫ꜑Ꞡ", 42696))) {
               return null;
            }

            String[] var1 = new String[]{IIII("ꚫꚆꝶꝑꜧ꜋\ua7e3", 42696), IIII("ꚼꚂꝾꝑ", 42696), IIII("ꚺꚂꝵꝐꜨꜗ", 42696), IIII("ꚫꚈꝢꝀ", 42696), IIII("ꚩꚉꝵꝒ꜡꜑", 42696)};

            for (int var2 = 0; var2 < var1.length; var2++) {
               String var3 = III(var0, var1[var2]);
               if (var3 != null) {
                  return var3;
               }
            }

            return IIII(var0);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      } else {
         return null;
      }
   }

   private static String III(String var0, String var1) {
      try {
         String var2 = IIII("ꛪ", 42696) + var1 + IIII("ꛪꛝ", 42696);
         if (!Il_o.II(var0, var2)) {
            return null;
         }

         int var3 = var0.indexOf(var2);
         int var4 = var3 + var2.length();

         while (var4 < var0.length() && (var0.charAt(var4) == ' ' || var0.charAt(var4) == '\t')) {
            var4++;
         }

         if (var4 >= var0.length()) {
            return null;
         }

         char var5 = var0.charAt(var4);
         if (var5 == '"') {
            int var6 = var4 + 1;
            int var7 = var0.indexOf(34, var6);
            if (var7 > var6) {
               return var0.substring(var6, var7);
            }
         } else if (Character.isDigit(var5)) {
            int var9 = var4;

            while (var9 < var0.length() && Character.isDigit(var0.charAt(var9))) {
               var9++;
            }

            return var0.substring(var4, var9);
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      return null;
   }

   private static String IIII(String var0) {
      try {
         String var1 = var0;
         char[] var2 = new char[]{'{', '}', '"', '[', ']', ',', ':'};

         for (int var3 = 0; var3 < var2.length; var3++) {
            var1 = var1.replace(var2[var3], ' ');
         }

         int var7 = 0;

         while (var7 < var1.length()) {
            while (var7 < var1.length() && var1.charAt(var7) == ' ') {
               var7++;
            }

            if (var7 >= var1.length()) {
               break;
            }

            int var4 = var7;

            while (var4 < var1.length() && var1.charAt(var4) != ' ') {
               var4++;
            }

            String var5 = var1.substring(var7, var4).trim();
            if (var5.length() >= 4 && var5.length() <= 7 && II(var5)) {
               return var5;
            }

            var7 = var4;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return null;
   }

   private static boolean II(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if ((var2 < 'a' || var2 > 'z') && (var2 < 'A' || var2 > 'Z') && (var2 < '0' || var2 > '9')) {
            return false;
         }
      }

      return true;
   }

   public static boolean III1() {
      return I1_I.II().IIIO != null && !I_IO.I0l1;
   }
}
