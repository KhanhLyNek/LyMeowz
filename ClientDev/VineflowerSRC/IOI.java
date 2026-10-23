package main;

import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class IOI extends IO1_ {
   private static int I_Oo;
   private boolean II_ = false;
   private static int IIO = -1;
   private static int IIOI = -1;
   public static IOI II;
   public static Image I1I_ = IO10.IIII(Ilo0("펟펨펏푠푉퐧퐅퓮퓇퓩풖핫핃", 54192));

   public IOI() {
      II = this;
   }

   public static void Ioo() {
      I1I_ = IO10.IIII(Ilo0("펟펨펏푠푉퐧퐅퓮퓇퓩풖핫핃", 54192));
      I_Oo = 0;
   }

   @Override
   public void IIlO() {
      if (I_Oo == 30 && !this.II_) {
         this.II_ = true;
         if (I_O1.III(Ilo0("폃펪펜푻푉퐹퐉퓡퓉풳", 54192)) != -1) {
            I1_I.IOO_ = I_O1.III(Ilo0("폃펪펜푻푉퐹퐉퓡퓉풳", 54192)) == 0;
         }

         if (I_O1.III(Ilo0("폙펼펾푡푍퐲퐹퓦퓝풩풂", 54192)) != -1) {
            II.II1I = I_O1.III(Ilo0("폙펼펾푡푍퐲퐹퓦퓝풩풂", 54192)) == 1;
         }

         if (II.II1I) {
            IO.II();
         }

         IO.II();
         IO.IOlO();
         I_0l.Io10();
      }

      I_Oo++;
      I_0l.IO11();
      if (I_Oo >= 150) {
         I_Ol.II__(Ilo0("폓펧펁퐭푁퐪퐄풩퓀풮품항프픭픃헸햀헎햿헝홰홚혯", 54192));
         if (I_0O.II().IlI_()) {
            I_0l.I0_O = true;
            II.II.I0l_();
            return;
         }

         IO10.III_(true);
      }
   }

   public static void IO11() {
      if (I_O1.III(Ilo0("폃펹펝푨푀퐮퐉퓽", 54192)) != -1) {
         if ((I_0l.l1_I = I_O1.III(Ilo0("폃펹펝푨푀퐮퐉퓽", 54192))) > I_0l.II1I.length - 1) {
            I_0l.l1_I = I_0l.II1O;
            int var0;
            if ((var0 = IO10.IIOo()) == -1) {
               var0 = I_0l.l1_I;
            }

            I_O1.IIIl(Ilo0("폃펹펝푨푀퐮퐉퓽", 54192), var0);
         }

         GameMidlet.III = I_0l.II1l[I_0l.l1_I];
         GameMidlet.II_0 = I_0l.III0[I_0l.l1_I];
         IO11.III(I_0l.IIlI[I_0l.l1_I]);
         I1o_.Illl = I_0l.II1I[I_0l.l1_I];
         System.out.println(Ilo0("폙펿펝푨푀퐮퐉퓽품퓺퓆", 54192) + I_0l.l1_I + Ilo0("펐폣폎", 54192) + I1o_.Illl);
         I_Ol.II__(Ilo0("폹펟폔", 54192) + GameMidlet.III + Ilo0("펐폣폎푝푣퐙퐾풳", 54192) + GameMidlet.II_0);
         II.II();
      } else {
         int var2 = 0;
         if (IO11.IllI > 0) {
            for (int var1 = 0; var1 < IO11.IllI; var1++) {
               var2 += I_0l.IIOO[var1];
            }
         }

         if (I_0l.II1O == -1) {
            I_0l.l1_I = var2 + I_Ol.III_(0, I_0l.IIOO[IO11.IllI]);
         } else {
            I_0l.l1_I = I_0l.II1O;
         }

         int var3;
         if ((var3 = IO10.IIOo()) == -1) {
            var3 = I_0l.l1_I;
         }

         I_O1.IIIl(Ilo0("폃펹펝푨푀퐮퐉퓽", 54192), var3);
         GameMidlet.III = I_0l.II1l[var3];
         GameMidlet.II_0 = I_0l.III0[var3];
         IO11.III(I_0l.IIlI[var3]);
         I1o_.Illl = I_0l.II1I[var3];
         II.II();
      }
   }

   @Override
   public void III_(IO1l var1) {
      if (I1I_ != null && I_Oo < 30) {
         if (IO10.l_lI == 3 || IO10.l_lI == 5) {
            var1.Illl(16777215);
            var1.III_(0, 0, II.IIl, II.IIlI);
         }

         var1.II(I1I_, II.IIl / 2, II.IIlI / 2, 3);
      }

      if (IIO != -1) {
         var1.Illl(0);
         var1.III_(0, 0, II.IIl, II.IIlI);
         var1.II(I1o_.IlOO, II.IIl / 2, II.IIlI / 2 - 24, IOII.I_Oo);
         II.II(II.IIll, II.IIlI / 2 + 24, var1);
         IO1I.IIII.II(var1, IO11.I1OO + IIO * 100 / IIOI + Ilo0("펕", 54192), II.IIl / 2, II.IIlI / 2, 2);
      } else if (I_Oo >= 30) {
         var1.Illl(0);
         var1.III_(0, 0, II.IIl, II.IIlI);
         II.II(II.IIll, II.IIl1, var1);
         I_0l.II0o(var1);
      }
   }
}
