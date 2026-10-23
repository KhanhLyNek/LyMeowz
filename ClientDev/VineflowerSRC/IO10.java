package main;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class IO10 {
   public static boolean I_1o = false;
   public static boolean I1l1 = false;
   public static boolean III = false;
   private static Image IlOO = IIII(I1ll("苻芞荳荘茾茦菣菌莫莎营葋萤萆蓥蓎蓪蒓蕬蕆", 33492));
   public static int l_lI = 1;
   public static byte Illl = 0;
   public static byte Ill1 = 0;
   public static byte II1_ = 5;
   public static String IIo_;
   public static boolean I1_l = false;

   public static void IIl1() {
      Ill1 = 0;
   }

   public static int III1(Image var0) {
      if (var0 == null) {
         return 0;
      } else {
         return l_lI == 5 ? var0.getWidth() : var0.getWidth();
      }
   }

   public static int III_(Image var0) {
      if (var0 == null) {
         return 0;
      } else {
         return l_lI == 5 ? var0.getHeight() : var0.getWidth();
      }
   }

   public static String II(long var0, int var2, boolean var3, boolean var4) {
      long var5;
      return (var5 = (var0 + var2 * 1000 - System.currentTimeMillis()) / 1000L) <= 0L ? "" : String.valueOf(var5);
   }

   public static String IIIO(long var0) {
      String var2 = "" + var0;
      boolean var3 = false;

      try {
         if (var0 < 0L) {
            var3 = true;
            var0 = -var0;
            var2 = "" + var0;
         }

         String var4;
         int var5;
         if (var0 >= 1000000000L) {
            var4 = I1ll("芶", 33492);
            var0 /= 1000000000L;
            var5 = ("" + var0).length();
         } else if (var0 >= 1000000L) {
            var4 = I1ll("芹", 33492);
            var0 /= 1000000L;
            var5 = ("" + var0).length();
         } else {
            if (var0 < 1000L) {
               if (var3) {
                  return I1ll("苹", 33492) + var2;
               }

               return var2;
            }

            var4 = I1ll("芿", 33492);
            var0 /= 1000L;
            var5 = ("" + var0).length();
         }

         int var6;
         if ((var6 = Integer.parseInt(var2.substring(var5, 2))) == 0) {
            var2 = var2.substring(0, var5) + var4;
         } else if (var6 % 10 == 0) {
            var2 = var2.substring(0, var5) + I1ll("苸", 33492) + var2.substring(var5, 1) + var4;
         } else {
            var2 = var2.substring(0, var5) + I1ll("苸", 33492) + var2.substring(var5, 2) + var4;
         }
      } catch (Exception var7) {
      }

      return var3 ? I1ll("苹", 33492) + var2 : var2;
   }

   public static void IOlI() {
      try {
         GameMidlet.II.platformRequest(I_0l.IlI1);
      } catch (ConnectionNotFoundException var1) {
         var1.printStackTrace();
      }
   }

   public static void III(IO1l var0, int var1, int var2, int var3) {
      var3 = var3 / IO1l.II(IlOO) + 1;

      for (int var4 = 0; var4 < var3; var4++) {
         var0.II(IlOO, var1 + var4 * IO1l.II(IlOO), var2, 0);
      }
   }

   public static void III() {
      while (I1I1.I___) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var1) {
            var1.printStackTrace();
         }
      }
   }

   public static void IIlI(boolean var0) {
      if (II.II.equals(IOI.II)) {
         if (I_0l.IIl != null) {
            if (!I_0l.IIl[0]) {
               I_0l.IIl[0] = true;
               I_0l.l1_I = 0;
               int var1;
               if ((var1 = IIOo()) == -1) {
                  var1 = I_0l.l1_I;
               }

               GameMidlet.III = I_0l.II1l[var1];
               I_O1.IIIl(I1ll("芧芅荡荔茼茊菭菙", 33492), var1);
               II.II();
            } else if (!I_0l.IIl[2]) {
               I_0l.IIl[2] = true;
               I_0l.l1_I = 2;
               int var2;
               if ((var2 = IIOo()) == -1) {
                  var2 = I_0l.l1_I;
               }

               GameMidlet.III = I_0l.II1l[var2];
               I_O1.IIIl(I1ll("芧芅荡荔茼茊菭菙", 33492), var2);
               II.II();
            } else if (I_O1.II(I1ll("芝芞荳荖茵茼菡菘莾莈葯", 33492)) == null) {
               II.II(IO11.I1O0, 8885, null);
            } else {
               II.II(IO11.I1Oo, 9000, null);
            }
         } else if (I_O1.II(I1ll("芝芞荳荖茵茼菡菘莾莈葯", 33492)) == null) {
            II.II(IO11.I1O0, 8885, null);
         } else {
            II.II(IO11.I1Oo, 9000, null);
         }
      } else {
         I_0O.II().III();
         I_0O.III().III();
         I_0l.I0_l = false;
         if (I1I1.I__1) {
            II.II(IO11.I1O0, 8885, null);
         } else {
            I1o_.IO0_ = false;
            if (II.II != null) {
               II.II.IIl();
            } else {
               II.II = new I1o_();
            }

            I1o_.Illl = I_0l.II1I[I_0l.l1_I];
            if (II.II != II.II) {
               I_Ol.II__(I1ll("苩苎茯茌荭荒莳莐菱菖萷萗葨葕蒦蓓笹蒌蔢蕮蔮蔼蔑藳藒薾薙虭虾蘶蘟蛹", 33492));
               I_0l.IoII = 0;
            } else {
               II.III_();
               I_0l.I0_O = true;
               II.II.I0l_();
            }

            Ilol.I10I = false;
            if (var0) {
               I_0l.III_ = 0;
            }
         }
      }
   }

   public static void III_(boolean var0) {
      I_0O.II().III();
      I_0O.III().III();
      if (I1I1.I__1) {
         II.II.IIl();
         II.II(IO11.I1O0, 8885, null);
      } else {
         if (II.II != II.II) {
            II.II(IO11.Ilo1);
         } else {
            II.III_();
         }

         Ilol.I10I = false;
         if (var0) {
            I_0l.III_ = 0;
         }

         II.II.IIl();
      }
   }

   public static Image III(String var0) {
      String var1 = I1ll("苻芋", 33492) + IO1l.l_I0 + var0;
      Image var2;
      if ((var2 = I1OI.II(var0)) == null) {
         String[] var3 = I_Ol.II(I_Ol.II(var1, I1ll("苺", 33492), 0)[0], I1ll("苻", 33492), 0);
         byte[] var4;
         if ((var4 = I_O1.II(I1ll("芬", 33492) + IO1l.l_I0 + var3[var3.length - 1])) != null) {
            var2 = Image.createImage(var4, 0, var4.length);
         }
      }

      return var2;
   }

   public static Image IIII(String var0) {
      Image var1 = null;

      try {
         var1 = I1OI.II(var0);
      } catch (Exception var3) {
      }

      return var1;
   }

   public static Image IIIl(String var0) {
      var0 = I1ll("苻芋", 33492) + IO1l.l_I0 + var0;
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (Exception var3) {
      }

      return var1;
   }

   public static void II(IO1l var0) {
      for (int var1 = 0; var1 < 5; var1++) {
         if (I1_I.Ilo[var1] != -1 && II.II(I1_I.Il01[var1], I1_I.Il0_[var1])) {
            if (I1_I.IloI[var1] == 0) {
               IO1I.II_.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2);
            } else if (I1_I.IloI[var1] == 1) {
               IO1I.II_l.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2);
            } else if (I1_I.IloI[var1] == 2) {
               IO1I.II_1.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2);
            } else if (I1_I.IloI[var1] == 3) {
               IO1I.II_l.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2, IO1I.II_1);
            } else if (I1_I.IloI[var1] == 8) {
               IO1I.II1.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2, IO1I.III_);
            } else if (I1_I.IloI[var1] == 4) {
               IO1I.II1I.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2, IO1I.IIlO);
            } else if (I1_I.IloI[var1] == 5) {
               IO1I.II__.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2);
            } else if (I1_I.IloI[var1] == 6) {
               IO1I.II_l.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2, IO1I.II_);
            } else if (I1_I.IloI[var1] == 7) {
               IO1I.IIII.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2, IO1I.III_);
            } else if (I1_I.IloI[var1] == 9) {
               IO1I.IIl0.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2, IO1I.III_);
            } else if (I1_I.IloI[var1] == 10) {
               IO1I.IIll.III(var0, I1_I.IIlO[var1], I1_I.Il01[var1], I1_I.Il0_[var1], 2, IO1I.III_);
            }
         }
      }
   }

   public static long IIII() {
      return System.currentTimeMillis();
   }

   public static I11o II(String var0) {
      I11o var1 = null;
      I1oo var2 = null;
      if ((var2 = I1O1.II(var0, I1O1.III1)).II01 != null) {
         int var3;
         if ((var3 = var2.II01.getHeight() / var2.II10) <= 0) {
            var3 = 1;
         }

         var1 = new I11o(var2.II01, var2.II01.getWidth(), var3);
      }

      return var1;
   }

   public static int IIOo() {
      String[] var0 = I_Ol.II(I_0l.IIo_.trim(), I1ll("苸", 33492), 0);

      for (int var1 = 0; var1 < var0.length - 2; var1++) {
         I_Ol.II(var0[var1].trim(), I1ll("苮", 33492), 0);
      }

      return -1;
   }
}
