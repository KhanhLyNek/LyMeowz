package main;

import javax.microedition.lcdui.Image;

public final class I_IO {
   private static Image Il0l = IO10.IIII(Il_1("颂颡颊饣饇餁養駧駂馡駌驯驘騔騺騆髩髉骩骟鬫魜鬺鬙鯷鯷鮲鮂鱲鱘鰮鱀鳽鳂鲬", 39085));
   private static int I_0;
   private static int IIO;
   private static int IIOI;
   private static int IIOl;
   private static int IIlI;
   private static int IIO1;
   private static int IIO_;
   private static int IoII;
   public static boolean I0l1;
   private static int IIO0 = 0;
   private static int IIOo;
   private static int II0;
   private static int II;
   public static boolean I0l_;

   public static void III(IO1l var0, int var1, int var2) {
      if (IIIl.II_1 && IlI.III().II_1) {
         IIIl.II_1 = false;
         new Thread(new I_I0()).start();
      }

      if (!I0l_) {
         if (II.IIIO % 3 == 0) {
            if (Ilol.II().IOI1 == 1) {
               IIlI = var1 - 20 - I1_I.Io1;
            }

            if (Ilol.II().IOI1 == -1) {
               IIlI = var1 + 20 - I1_I.Io1;
            }
         }

         I_0 = Ilol.II().I_oO - 40 - I1_I.Io1I;
      } else {
         if (++IIO0 == 5) {
            I0l_ = false;
            IIO0 = 0;
         }

         IIlI = var1 - I1_I.Io1;
         I_0 = var2 - I1_I.Io1I;
      }

      if (IIO1 > var1 - I1_I.Io1) {
         II = -1;
      } else {
         II = 1;
      }

      var0.II(I1_I.Il_I, IIO1, IIO - 40, 3);
      I__O.II(var0, IIO1 - 25, IIO - 70, 50, 20, 16777215, false);
      int var3 = IIO - 65;
      IO1I.III_.II(var0, I1_I.II().IlII, IIO1, var3, 2);
      if (I0l1) {
         I0l1 = false;
         I1lI.III(new I1ll(18, IIO1 + I1_I.Io1, IIO + I1_I.Io1I, 2, 10, -1));
         I1_I.II().IIIO = null;
         IIlI = -I1_I.Io1;
         I_0 = -I1_I.Io1I;
      }

      var0.II(Il0l, 0, II0 * 40, 40, 40, II == 1 ? 0 : 2, IIO1, IIO + 3 + (II.IIIO % 10 > 5 ? 1 : 0), 3);
      if (IIO != I_0) {
         IIOl = I_0 - IIO << 2;
         IIOI = IIOI + IIOl;
         IIO = IIO + (IIOI >> 4);
         IIOI &= 15;
      }

      if (IIO1 != IIlI) {
         IoII = IIlI - IIO1 << 2;
         IIO_ = IIO_ + IoII;
         IIO1 = IIO1 + (IIO_ >> 4);
         IIO_ &= 15;
      }

      if (++IIOo == 5) {
         IIOo = 0;
         if (++II0 > 2) {
            II0 = 0;
         }
      }
   }
}
