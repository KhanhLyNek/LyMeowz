package main;

public class IlO0 {
   private static int[] IIOI;
   private static int[] IIOl;
   private static int[] IIO1;

   public static void II_O(int var0) {
      Integer var1 = new Integer(IOlO.l1oI);
      if (IlOO.III1.IIII(var1)) {
         IlO1 var2 = null;
         IlO1 var3 = null;
         Il_l.II var4 = (Il_l.II)IlOO.III1.II(var1);

         for (int var5 = 0; var5 < var4.IIlO(); var5++) {
            IlO1 var6 = (IlO1)var4.II(var5);
            if (var6.I_1O == var0) {
               if (var6.I_10 != -1 || var6.Il0O) {
                  var2 = var6;
                  break;
               }

               if (var6.I_10 == -1 && var6.I_1o == -1 && !var6.Il0O) {
                  var3 = var6;
               }
            }
         }

         if (var2 != null) {
            var2.I_ol();
         } else if (var3 != null) {
            var3.I_ol();
         }
      }
   }

   public static void IOI_() {
      II_0(0);
   }

   public static void IOIO() {
      II_0(2);
   }

   public static void IOI0() {
      II_0(1);
   }

   private static void II_0(int var0) {
      if (IlOO.IIlO(IOlO.l1oI)) {
         II_o(var0);
      } else {
         IOIo();
         int var1 = 0;
         int var2 = 0;
         switch (var0) {
            case 0:
               if (IIOI[0] != 0 && IIOI[1] != 0) {
                  var1 = IIOI[0];
                  var2 = IIOI[1];
               } else {
                  var1 = 60;
                  var2 = III1(60);
               }
               break;
            case 1:
               if (IIO1[0] != 0 && IIO1[1] != 0) {
                  var1 = IIO1[0];
                  var2 = IIO1[1];
               } else {
                  var1 = IOlO.l100 - 60;
                  var2 = III1(IOlO.l100 - 60);
               }
               break;
            case 2:
               if (IIOl[0] != 0 && IIOl[1] != 0) {
                  var1 = IIOl[0];
                  var2 = IIOl[1];
               } else {
                  var1 = IOlO.l100 / 2;
                  var2 = III1(IOlO.l100 / 2);
               }
         }

         Il_0.III1(var1, var2);
         if (IOlO.l1oI != 7 && IOlO.l1oI != 14 && IOlO.l1oI != 0) {
            I_0_.II().Io_o();
         } else {
            I_0_.II().IoO0();
         }
      }
   }

   private static void IOIo() {
      IOl();
      int var0 = IOlO.IlI_.size();
      if (var0 != 2) {
         for (int var3 = 0; var3 < var0; var3++) {
            IO1 var4 = (IO1)IOlO.IlI_.elementAt(var3);
            if (var4.IIoI < 60) {
               IIOI[0] = var4.II0o + 15;
               IIOI[1] = var4.IIol;
            } else if (var4.II0o > IOlO.l100 - 60) {
               IIO1[0] = var4.IIoI - 15;
               IIO1[1] = var4.IIol;
            } else {
               IIOl[0] = var4.II0o + 15;
               IIOl[1] = var4.IIol;
            }
         }
      } else {
         IO1 var1 = (IO1)IOlO.IlI_.elementAt(0);
         IO1 var2 = (IO1)IOlO.IlI_.elementAt(1);
         if ((var1.IIoI >= 60 || var2.IIoI >= 60) && (var1.II0o <= IOlO.l100 - 60 || var2.II0o <= IOlO.l100 - 60)) {
            if (var1.IIoI < var2.IIoI) {
               IIOI[0] = var1.II0o + 15;
               IIOI[1] = var1.IIol;
               IIO1[0] = var2.IIoI - 15;
               IIO1[1] = var2.IIol;
            } else {
               IIOI[0] = var2.II0o + 15;
               IIOI[1] = var2.IIol;
               IIO1[0] = var1.IIoI - 15;
               IIO1[1] = var1.IIol;
            }
         } else {
            IIOI[0] = var1.II0o + 15;
            IIOI[1] = var1.IIol;
            IIO1[0] = var2.IIoI - 15;
            IIO1[1] = var2.IIol;
         }
      }
   }

   private static void IOl() {
      IIOI = new int[2];
      IIOl = new int[2];
      IIO1 = new int[2];
   }

   public static int III1(int var0) {
      int var1 = 50;
      int var2 = 0;

      while (var2 < 30) {
         var2++;
         var1 += 24;
         if (IOlO.IIIl(var0, var1, 2)) {
            if (var1 % 24 != 0) {
               var1 -= var1 % 24;
            }
            break;
         }
      }

      return var1;
   }

   private static void II_o(int var0) {
      switch (var0) {
         case 0:
            Il_0.III1(60, III1(60));
            break;
         case 1:
            Il_0.III1(IOlO.l100 - 60, III1(IOlO.l100 - 60));
            break;
         case 2:
            for (int var1 = 0; var1 < I1_I.IIOI.size(); var1++) {
               I_11 var2 = (I_11)I1_I.IIOI.elementAt(var1);
               if (var2.II.lll0 >= 30 && var2.II.lll0 <= 36) {
                  Ilol.II().II = var2;
                  Il_0.III1(var2.I_o_, var2.I_oO - 3);
                  break;
               }
            }
      }
   }
}
