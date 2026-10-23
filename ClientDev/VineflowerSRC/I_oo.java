package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class I_oo {
   public static int[][] IIlo;
   public static Image[] IIl;
   public static I_oO[] II;
   public static I_lO II_I = new I_lO(Ilo_("\uec9c\ued42\ued4d\ued3e\ued15", 60650));
   private static Image IIO1 = null;
   public static byte[] IIII;
   private static int IIlI;
   public static short II0l;

   public static void Io0O() {
      if (IIl == null) {
         IIl = new Image[]{
            IO10.III(Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd2\uee2f\uee50\uee51\uee39", 60650)),
            IO10.III(Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd3\uee2f\uee50\uee51\uee39", 60650)),
            IO10.III(Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd0\uee2f\uee50\uee51\uee39", 60650)),
            IO10.III(Ilo_("\uecc5\ued60\ued45\ued20\ued49\uedc7\uedcd\ueda4\uedd1\uee2f\uee50\uee51\uee39", 60650))
         };
         System.gc();
      }
   }

   public static void Io00() {
      System.gc();
      IIO1 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
   }

   public I_oo() {
      Io0o();
   }

   public static void IIl_() {
      new I_oo();
   }

   private static void Io0o() {
      try {
         DataInputStream var0;
         short var1;
         IIlo = new int[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(I_O1.II(Ilo_("\ueca4\ued5b\ued77\ued2e\ued0b\uede4\uedc3\ueda6", 60650)))))
            .readShort()][5];

         for (int var2 = 0; var2 < var1; var2++) {
            IIlo[var2][0] = var0.readUnsignedByte();
            IIlo[var2][1] = var0.readShort();
            IIlo[var2][2] = var0.readShort();
            IIlo[var2][3] = var0.readShort();
            IIlo[var2][4] = var0.readShort();
            if ((var2 < 84 || var2 > 90)
               && (var2 < 372 || var2 > 384)
               && (var2 < 371 || var2 > 377)
               && (IIlo[var2][1] >= 256 || IIlo[var2][3] >= 256 || IIlo[var2][2] >= 256 || IIlo[var2][4] >= 256)) {
               IIlo[var2] = null;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static void IlIo(int var0) {
      Image var1;
      if ((
            var1 = IO10.IIII(
               Ilo_("\uecc5\ued5a\ued45\ued26\ued0a\uede9\ueded\uedae\ued83\uee66\uee45\uee10\uee0d\uee10\ueefd\ueed7\ueeb6", 60650)
                  + var0
                  + Ilo_("\uecc4\ued79\ued46\ued20", 60650)
            )
         )
         != null) {
         II[var0] = new I_oO(var1, var0);
      } else {
         boolean var2 = false;
         byte[] var3;
         if ((var3 = I_O1.II(IO1l.l_I0 + Ilo_("\uecb9\ued64\ued49\ued2b\ued0a", 60650) + var0)) != null) {
            if (IIII != null && var3.length % 127 != IIII[var0]) {
               var2 = true;
            }

            if (!var2) {
               Image var4;
               if ((var4 = Image.createImage(var3, 0, var3.length)) != null) {
                  II[var0] = new I_oO(var4, var0);
               } else {
                  var2 = true;
               }
            }
         } else {
            var2 = true;
         }

         if (var2) {
            II[var0] = new I_oO(IIO1, var0);
            I_0_.II().IIoo(var0);
         }
      }
   }

   public static void III(IO1l var0, int var1, int var2, int var3, int var4, int var5) {
      IIII(var0, var1, var2, var3, 0, var5);
   }

   public static void IIII(IO1l var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (IIl == null) {
            I_oO var10;
            if ((var10 = II[var1]) == null) {
               IlIo(var1);
               return;
            }

            var0.II(var10.I1I1, 0, 0, IO1l.II(var10.I1I1), IO1l.III(var10.I1I1), var4, var2, var3, var5);
            return;
         }

         if (IIlo != null) {
            if (var1 < IIlo.length && IIlo[var1] != null && IIlo[var1][1] < 256 && IIlo[var1][3] < 256 && IIlo[var1][2] < 256 && IIlo[var1][4] < 256) {
               if (IIlo[var1][0] != 4 && IIl[IIlo[var1][0]] != null) {
                  var0.II(IIl[IIlo[var1][0]], IIlo[var1][1], IIlo[var1][2], IIlo[var1][3], IIlo[var1][4], var4, var2, var3, var5);
                  return;
               }

               I_oO var9;
               if ((var9 = II[var1]) == null) {
                  IlIo(var1);
                  return;
               }

               var9.II(var0, var4, var2, var3, var5);
               return;
            }

            I_oO var8;
            if ((var8 = II[var1]) == null) {
               IlIo(var1);
               return;
            }

            var8.II(var0, var4, var2, var3, var5);
            return;
         }

         if (II.II != I1_I.II()) {
            I_oO var6;
            if ((var6 = II[var1]) == null) {
               IlIo(var1);
               return;
            }

            var6.II(var0, var4, var2, var3, var5);
            return;
         }
      } catch (Exception var7) {
      }
   }

   public static void II(IO1l var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (IIl == null) {
            I_oO var13;
            if ((var13 = II[var1]) == null) {
               IlIo(var1);
               return;
            }

            var0.II(var13.I1I1, 0, var2 * var5, var5, var6, var7, var3, var4, var8);
            return;
         }

         if (IIlo != null) {
            if (var1 < IIlo.length && IIlo[var1] != null && IIlo[var1][1] < 256 && IIlo[var1][3] < 256 && IIlo[var1][2] < 256 && IIlo[var1][4] < 256) {
               if (IIlo[var1][0] != 4 && IIl[IIlo[var1][0]] != null) {
                  var0.II(IIl[IIlo[var1][0]], 0, var2 * var5, var5, var6, var7, var3, var4, var8);
                  return;
               }

               I_oO var12;
               if ((var12 = II[var1]) == null) {
                  IlIo(var1);
                  return;
               }

               var12.II(var0, var7, var2, var3, var4, var5, var6, var8);
               return;
            }

            I_oO var11;
            if ((var11 = II[var1]) == null) {
               IlIo(var1);
               return;
            }

            var11.II(var0, var7, var2, var3, var4, var5, var6, var8);
            return;
         }

         if (II.II != I1_I.II()) {
            I_oO var9;
            if ((var9 = II[var1]) == null) {
               IlIo(var1);
               return;
            }

            var9.II(var0, var7, var2, var3, var4, var5, var6, var8);
            return;
         }
      } catch (Exception var10) {
      }
   }

   public static void IIlO() {
      int var0 = 0;
      if (II.IIIO % 1000 == 0) {
         for (int var1 = 0; var1 < II.length; var1++) {
            if (II[var1] != null) {
               var0++;
               I_oO var2;
               (var2 = II[var1]).I_0++;
               if (var2.I_0 - var2.I_Oo > 1 && !Ilol.II().IIl0(var2.I_O0)) {
                  II[var2.I_O0] = null;
               }

               IIlI++;
            }
         }

         if (var0 > 200 && II.II) {
            II = new I_oO[II0l];
         }
      }
   }
}
