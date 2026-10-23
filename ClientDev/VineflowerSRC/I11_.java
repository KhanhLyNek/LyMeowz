package main;

import java.util.Random;
import java.util.Vector;

public final class I11_ {
   private static Random III = new Random();
   private static Vector III = new Vector();
   private static int I_Oo;
   private static int I_0;
   private static int IIO;
   private static int IIOI;
   private static int IIOl;
   private static int IIlI;
   private static int IIO1;
   private static float IIII;
   private static int[] IIoI = new int[3];
   private static int[] Il_o = new int[3];
   private static boolean I__I = false;
   private static long IlO0 = 0L;
   private static long IlOo = 150L;

   public static void II(IO1l var0) {
      if (I__I) {
         Il_o[2] = Il_o[1];
         IIoI[2] = IIoI[1];
         Il_o[1] = Il_o[0];
         IIoI[1] = IIoI[0];
         Il_o[0] = I_0;
         IIoI[0] = I_Oo;
         I_Oo = (int)(Math.cos(IIO * Math.PI / 180.0) * IIO1 * IIlI) + IIOI;
         I_0 = (int)(IIO1 * Math.sin(IIO * Math.PI / 180.0) * IIlI - 0.0F * IIlI * IIlI / 2.0F);
         if (System.currentTimeMillis() - IlO0 >= IlOo) {
            IIlI++;
            IlO0 = System.currentTimeMillis();
         }
      }

      if (IIlI > 32 && I__I) {
         I__I = false;
         III.removeAllElements();
         III.addElement(new I11O(I_Ol.III_(50, II.IIl - 50), I_Ol.III_(II.IIlI - 100, II.IIlI), 5, 72));
      }

      var0.Illl(0);
      var0.III_(0, 0, 0, 0);
      var0.Illl(16711680);

      for (int var1 = 0; var1 < III.size(); var1++) {
         I11O var2 = (I11O)III.elementAt(var1);
         IO1l var3 = var0;
         I11O var4 = var2;

         for (int var5 = 0; var5 < var4.IIII.size(); var5++) {
            I1I_ var6;
            if ((var6 = (I1I_)var4.IIII.elementAt(var5)).IIOI < -200) {
               var4.IIII.removeElementAt(var5);
            }

            IO1l var7 = var3;
            var6 = var6;
            I1I_.III(var3, var6.II0I - var6.IIO, var6.I_O0 - var6.IIOI, var6.IIO_);

            for (int var8 = 0; var8 < 2; var8++) {
               I1I_.III(var7, var6.II0I - var6.Il1[var8], var6.I_O0 - var6.Il1I[var8], var6.IIO_);
            }

            if (var6.IIl && System.currentTimeMillis() - var6.IlOI >= var6.Il1O) {
               var6.IIO1++;
               var6.IlOI = System.currentTimeMillis();
               var6.Il1[1] = var6.Il1[0];
               var6.Il1I[1] = var6.Il1I[0];
               var6.Il1[0] = var6.IIO;
               var6.Il1I[0] = var6.IIOI;
               var6.IIO = (int)(Math.cos(var6.IIlI * Math.PI / 180.0) * var6.I_Oo * var6.IIO1) + var6.I_0;
               var6.IIOI = (int)(var6.I_Oo * Math.sin(var6.IIlI * Math.PI / 180.0) * var6.IIO1 - var6.III * var6.IIO1 * var6.IIO1 / 2.0F) + var6.IIOl;
            }
         }
      }

      if (!I__I) {
         int var9;
         if ((var9 = -(Math.abs(III.nextInt() % 3) + 5)) == -5 && !I__I) {
            IIOI = 0;
            IIO = 80;
            I__I = true;
            IIl1();
            return;
         }

         if (var9 == -7 && !I__I) {
            IIO = 60;
            IIOI = 0;
            I__I = true;
            IIl1();
            return;
         }

         if (var9 == -6 && !I__I) {
            IIO = 120;
            IIOI = 0;
            I__I = true;
            IIl1();
         }
      }
   }

   private static void IIl1() {
      IIOl = 0;
      IIO1 = 16;
      IIlI = 0;
      IIII = 0.0F;

      for (int var0 = 0; var0 < 3; var0++) {
         Il_o[var0] = 0;
         IIoI[var0] = IIOI;
      }

      I__I = true;
   }
}
