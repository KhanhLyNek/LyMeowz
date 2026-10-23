package main;

import javax.microedition.lcdui.Image;

public final class Il0O {
   public static I_lO IIIO = new I_lO(II0_("ꦯꦺ꩐ꨖꨐꨒꫵ\uaad7ꪲꪄ", 43481));
   private int[] II0O;
   private int[] II00;
   private int[] II0o;
   private int[] IIo;
   private static int[] IIoI;
   private int IIO0;
   private int IIOo;
   private int II0;
   private int II;
   private int III;
   private int IIII;
   private int IIIl;
   private int III1;
   private int III_;
   private boolean I1I0;
   private static Image IIIo;
   private static Image IIl;
   private static Image IIlI;
   private static Image IIll;
   private static Image IIl1;
   private static Image IIl_;
   private static Image IIlO;
   private static Image IIl0;
   private int[] IIol;
   private int I1O;
   public int I_O0;
   private boolean[] IIIO;
   private int[] IIo1;
   private int[] IIo_;
   private boolean[] III0;
   private int I1OO;
   private int I1O0;
   private static int I1Oo = 16;
   private static Image IIlo = IO10.IIII(II0_("꧶ꦕꩶ꩟\uaa3b\uaa3d\uaafe\uaad3ꪶꪕꬠꭃꬴꬸ\uabeeꯒꮽꮝ걵걃걷가곴곃겵겅겍괯괓괬괕귽", 43481));
   private static Image II1 = IO10.IIII(II0_("꧶ꦕꩶ꩟\uaa3b\uaa3d\uaafe\uaad3ꪶꪕꬠꭃꬴꬸ\uabeeꯒꮽꮝ걵걃걷가곴곃겵겅겍괬괓괬괕귽", 43481));
   private static Image II1I;
   private static Image II1l;
   public static short IIII;
   private static Image II11 = null;
   public static boolean II_;
   private static boolean I1Io;
   public static int IIO;
   private static Image II1_;
   private static Image II1O;
   private static int I100;
   private static int I10o;
   public static int IIOI;
   private static int I1o;
   private int[] IIoO = new int[]{0, 1, 2, 1, 0, 0};
   private int[] IIII;

   public static void IIl1() {
      IOlO.I1O1 = 0;
   }

   public static boolean IIO1() {
      for (int var0 = 0; var0 < IIIO.size(); var0++) {
         Il0O var1;
         if ((var1 = (Il0O)IIIO.elementAt(var0)).I_O0 == 0 || var1.I_O0 == 12) {
            return true;
         }
      }

      return false;
   }

   private Il0O(int var1) {
      this.I_O0 = var1;
      switch (this.I_O0) {
         case 0:
         case 12:
            if (IIIo == null) {
               IIIo = IO10.III(II0_("꧶ꦚꩰꨙ\uaa38ꨁꫲꪜꪡꪞꭨ", 43481));
            }

            if (IIl == null) {
               IIl = IO10.III(II0_("꧶ꦚꩰꨙ\uaa38ꨁꫲꪃ\uaaffꪀꭡꭉ", 43481));
            }

            if (IIlI == null) {
               IIlI = IO10.III(II0_("꧶ꦚꩰꨙ\uaa38ꨁꫲꪀ\uaaffꪀꭡꭉ", 43481));
            }

            this.I1O = I_Ol.III_(II.IIl / 3, II.IIl / 2);
            this.II0O = new int[this.I1O];
            this.II00 = new int[this.I1O];
            this.II0o = new int[this.I1O];
            this.IIo = new int[this.I1O];
            this.IIol = new int[this.I1O];
            this.IIo_ = new int[this.I1O];
            this.IIo1 = new int[this.I1O];
            this.IIIO = new boolean[this.I1O];
            this.III0 = new boolean[this.I1O];

            for (int var7 = 0; var7 < this.I1O; var7++) {
               this.II00[var7] = I_Ol.III_(-10, II.IIlI + 100) + I1_I.Io1I;
               this.II0O[var7] = I_Ol.III_(-10, II.IIl + 300) + I1_I.Io1;
               this.IIo_[var7] = I_Ol.III_(0, 1);
               this.II0o[var7] = -12;
               this.IIo[var7] = 12;
               this.IIol[var7] = I_Ol.III_(1, 3);
               this.IIIO[var7] = false;
               if (this.IIol[var7] == 2 && var7 % 2 == 0) {
                  this.IIIO[var7] = true;
               }

               this.III0[var7] = false;
               this.IIo1[var7] = I_Ol.III_(1, 2);
            }

            return;
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
         case 15:
            if (this.I_O0 == 1) {
               IIl1 = IO10.III(II0_("꧶ꦚꩰꨙ\uaa39ꨕ꫰\uaad3ꪨ꫞ꭿꭀꬪ", 43481));
               I1Oo = 10;
            }

            if (this.I_O0 == 2) {
               IIl1 = IO10.III(II0_("꧶ꦚꩰꨙ\uaa39ꨕ꫰\uaad3ꪨꫂꬡꭞꬣꬋ", 43481));
               I1Oo = 18;
            }

            if (this.I_O0 == 5) {
               IIl1 = IO10.III(II0_("꧶ꦚꩰꨙ\uaa39ꨕ꫰\uaad3ꪨ\uaac3ꬡꭞꬣꬋ", 43481));
               I1Oo = 14;
            }

            if (this.I_O0 == 6) {
               IIl1 = IO10.III(II0_("꧶ꦚꩰꨙ\uaa39ꨕ꫰\uaad3ꪨ\uaac4ꬡꭞꬣꬋ", 43481));
               I1Oo = 14;
            }

            if (this.I_O0 == 7) {
               IIl1 = IO10.III(II0_("꧶ꦚꩰꨙ\uaa39ꨕ꫰\uaad3ꪨ\uaac5ꬡꭞꬣꬋ", 43481));
               I1Oo = 12;
            }

            if (this.I_O0 == 11) {
               IIl1 = IO10.III(II0_("꧶ꦚꩰꨙꨡꨁꫪ\uaad7ꪥ꫞ꭿꭀꬪ", 43481));
            }

            if (this.I_O0 == 15) {
               if (I_oo.II[11120] == null) {
                  I_oo.IlIo(11120);
               }

               I1Oo = 16;
            }

            this.I1O = I_Ol.III_(15, 25);
            if (this.I_O0 == 11) {
               this.I1O = 100;
            }

            this.II0O = new int[this.I1O];
            this.II00 = new int[this.I1O];
            this.II0o = new int[this.I1O];
            this.IIo = new int[this.I1O];
            this.IIo_ = new int[this.I1O];
            this.IIo1 = new int[this.I1O];
            this.III0 = new boolean[this.I1O];

            for (int var6 = 0; var6 < this.I1O; var6++) {
               this.II0O[var6] = I_Ol.III_(-10, IOlO.l100 + 10);
               this.II00[var6] = I_Ol.III_(0, IOlO.l10o);
               this.IIo1[var6] = I_Ol.III_(0, 1);
               this.IIo_[var6] = I_Ol.III_(0, 1);
               this.II0o[var6] = I_Ol.III_(-3, 3);
               this.IIo[var6] = I_Ol.III_(1, 4);
               if (this.I_O0 == 11) {
                  this.IIo1[var6] = I_Ol.III_(0, 2);
                  this.II0o[var6] = I_Ol.II1(I_Ol.III_(1, 3));
                  this.IIo[var6] = I_Ol.II1(I_Ol.III_(1, 3));
               }

               if (this.I_O0 == 15) {
                  this.IIo1[var6] = I_Ol.III_(0, 2);
                  this.II0o[var6] = I_Ol.II1(I_Ol.III_(1, 3));
                  this.IIo[var6] = I_Ol.II1(I_Ol.III_(1, 3));
               }
            }

            return;
         case 3:
            II.IIlO = true;
            return;
         case 4:
            this.I1O = I_Ol.III_(5, 10);
            if (IIll == null) {
               IIll = IO10.III(II0_("꧶ꦚꩰꨙꨦꨕ\uaafcꪜꪡꪞꭨ", 43481));
            }

            this.II0O = new int[this.I1O];
            this.II00 = new int[this.I1O];
            this.IIo1 = new int[this.I1O];
            this.IIo_ = new int[this.I1O];
            this.IIII = new int[this.I1O];

            for (int var5 = 0; var5 < this.I1O; var5++) {
               this.II0O[var5] = I_Ol.III_(0, II.IIl);
               this.II00[var5] = I_Ol.III_(0, 50);
               if (var5 % 2 == 0) {
                  this.IIII[var5] = 0;
               } else if (var5 % 3 == 0) {
                  this.IIII[var5] = 1;
               } else if (var5 % 4 == 0) {
                  this.IIII[var5] = 2;
               } else {
                  this.IIII[var5] = 3;
               }

               this.IIo_[var5] = I_Ol.III_(0, 10);
            }

            return;
         case 8:
            this.III1 = I_Ol.III_(100, 300);
            if (IIl_ == null) {
               IIl_ = IO10.III(II0_("꧶ꦚꩰꨙꨦꨜ\uaafaꫂ\uaaffꪀꭡꭉ", 43481));
            }

            if (IIlO == null) {
               IIlO = IO10.III(II0_("꧶ꦚꩰꨙꨳꨝꫡ\uaad7ꫠ꫞ꭿꭀꬪ", 43481));
            }

            if (IIl0 == null) {
               IIl0 = IO10.III(II0_("꧶ꦚꩰꨙꨳꨝꫡ\uaad7ꫣ꫞ꭿꭀꬪ", 43481));
            }

            this.I1I0 = false;
            this.IO11();
            return;
         case 9:
            if (II1I == null) {
               II1I = IO10.III(II0_("꧶ꦚꩰꨙꨶꨜꫲ꫟\uaafcꪄꭽꭁꬣꭝꮥꯚꮧꮏ", 43481));
            }

            if (II1l == null) {
               II1l = IO10.III(II0_("꧶ꦚꩰꨙꨶꨜꫲ꫟\uaafcꪄꭽꭁꬣꭞꮥꯚꮧꮏ", 43481));
            }

            this.IIO0 = 20;
            this.II0O = new int[this.IIO0];
            this.II00 = new int[this.IIO0];
            IIoI = new int[this.IIO0];
            this.II0o = new int[this.IIO0];

            for (int var4 = 0; var4 < this.IIO0; var4++) {
               this.II0O[var4] = I_Ol.II1(I_Ol.III_(0, II.IIl));
               this.II00[var4] = I_Ol.II1(I_Ol.III_(10, 80));
               IIoI[var4] = I_Ol.II1(I_Ol.III_(1, 3));
               this.II0o[var4] = IIoI[var4];
            }

            return;
         case 10:
            this.IIO0 = 30;
            this.II0O = new int[this.IIO0];
            this.II00 = new int[this.IIO0];
            IIoI = new int[this.IIO0];
            this.II0o = new int[this.IIO0];
            var1 = 0;

            for (int var2 = 0; var2 < this.IIO0; var2++) {
               this.II0O[var2] = I_Ol.II1(I_Ol.III_(0, II.IIl)) + I1_I.Io1;
               if (++var1 > this.IIO0 / 2) {
                  this.II00[var2] = I_Ol.II1(I_Ol.III_(20, 60));
                  IIoI[var2] = 10;
               } else {
                  this.II00[var2] = I_Ol.II1(I_Ol.III_(0, 20));
                  IIoI[var2] = 7;
               }

               this.II0o[var2] = IIoI[var2] / 2 - 2;
            }

            return;
         case 13:
            if (I_Ol.II1(I_Ol.III_(0, 2)) == 0) {
               if (I_Ol.II1(I_Ol.III_(0, 2)) == 0) {
                  I1Io = true;
               } else {
                  I1Io = false;
               }

               IIO = I_Ol.II1(I_Ol.III_(2, 5));
               IIII();
               return;
            }
            break;
         case 14:
            if (I_Ol.II1(I_Ol.III_(0, 2)) == 0) {
               II_ = true;
               IIII();
            }
      }
   }

   private static void IIII() {
      if (IO10.l_lI == 1) {
         II1_ = null;
         II1O = null;
      } else if (II.II) {
         II1_ = null;
         II1O = null;
      } else {
         if (IIO > 0) {
            if (II1_ == null) {
               I100 = (II1_ = IO10.IIII(II0_("꧶ꦚꩰꨙꨳꨛꫴꪃ\uaaffꪀꭡꭉ", 43481))).getWidth();
            }
         } else {
            II1_ = null;
         }

         if (!II_) {
            II1O = null;
         } else {
            if (II1O == null) {
               II1O = IO10.IIII(II0_("꧶ꦚꩰꨙꨳꨛꫴꪂ\uaaffꪀꭡꭉ", 43481));
            }

            I1o = 287;
         }
      }
   }

   private static void II1(IO1l var0) {
      if (IO10.l_lI != 1 && !II.II && IIO != 0 && II1_ != null) {
         for (int var1 = 0; var1 < IIO; var1++) {
            var0.II(II1_, (float)II.IIII[var1], (float)II.IIIl[var1], 3);
         }
      }
   }

   public static void II(IO1l var0) {
      if (IO10.l_lI != 1 && !II.II && II_ && II1O != null) {
         for (int var1 = I10o; var1 < IOlO.l100; var1 += I1o) {
            if (var1 >= I1_I.Io1 - I1o) {
               var0.II(II1O, (float)var1, (float)IIOI, 0);
            }
         }
      }
   }

   private void IO11() {
      int var1 = I1_I.Io1;
      int var2 = I1_I.Io1I;
      this.II = I_Ol.III_(1, 3);
      this.I1I0 = false;
      this.III_ = I_Ol.III_(3, 5);
      Il0O var3;
      byte var4;
      if (this.II == 1) {
         this.IIOo = -50;
         this.II0 = I_Ol.III_(var2, II.IIlI - 100 + var2);
         var3 = this;
         var4 = 0;
      } else {
         label34: {
            if (this.II == 2) {
               this.IIOo = IOlO.l100 + 50;
               this.II0 = I_Ol.III_(var2, II.IIlI - 100 + var2);
               var3 = this;
            } else {
               if (this.II == 3) {
                  this.IIOo = I_Ol.III_(var1 + 50, II.IIl - 50 + var1);
                  this.II0 = -50;
                  var1 = I_Ol.III_(0, 2);
                  this.III = var1 == 0 ? 0 : 2;
                  return;
               }

               if (this.II != 4) {
                  return;
               }

               this.IIOo = I_Ol.III_(var1 + 50, II.IIl - 50 + var1);
               this.II0 = IOlO.l10o + 50;
               var1 = I_Ol.III_(0, 2);
               var3 = this;
               if (var1 == 0) {
                  var4 = 0;
                  break label34;
               }
            }

            var4 = 2;
         }
      }

      var3.III = var4;
   }

   public static void IIO(int var0) {
      if (!II.II) {
         Il0O var1 = new Il0O(var0);
         IIIO.addElement(var1);
      }
   }

   public static void III0(int var0, int var1) {
      Il0O var2;
      (var2 = new Il0O(10)).I1O0 = var0;
      var2.I1OO = var1;
      IIIO.addElement(var2);
   }

   public static void IIIl(IO1l var0) {
      for (int var1 = 0; var1 < IIIO.size(); var1++) {
         Il0O var2 = (Il0O)IIIO.elementAt(var1);
         IO1l var3 = var0;
         Il0O var4 = var2;
         if (var2.I_O0 == 10) {
            var0.Illl(var2.I1O0);

            for (int var5 = 0; var5 < var4.IIO0; var5++) {
               var3.II(var5 < var4.IIO0 / 2 ? II1 : IIlo, var4.II0O[var5], var4.II00[var5] + var4.I1OO, 0);
            }

            if (IIII != 0 && II11 == null) {
               II11 = I_oo.II[IIII].I1I1;
            }

            if (II11 != null) {
               for (int var6 = 0; var6 < var4.IIO0 / 2; var6++) {
                  var3.II(II11, var4.II0O[var6], var4.II00[var6] + var4.I1OO, 0);
               }
            }
         }
      }
   }

   public static void II1I(IO1l var0) {
      for (int var1 = 0; var1 < IIIO.size(); var1++) {
         Il0O var2;
         switch ((var2 = (Il0O)IIIO.elementAt(var1)).I_O0) {
            case 8:
               var0.II(IIl_, 0, 0, IIl_.getWidth(), IIl_.getHeight(), var2.III, var2.IIOo, var2.II0, 3);
               if (var2.II != 1 && var2.II != 2) {
                  int var4 = var2.III == 0 ? 11 : -11;
                  var0.II(IIl0, 0, var2.IIII * 18, 8, 18, var2.III, var2.IIOo + var4, var2.II0 + 22, 3);
               } else {
                  int var3 = var2.III == 0 ? -25 : 25;
                  var0.II(IIlO, 0, var2.IIII << 3, 20, 8, var2.III, var2.IIOo + var3, var2.II0 + 5, 3);
               }
               break;
            case 13:
               if (I1Io) {
                  II1(var0);
               }
         }
      }
   }

   public static void III(IO1l var0) {
      for (int var1 = 0; var1 < IIIO.size(); var1++) {
         Il0O var2 = (Il0O)IIIO.elementAt(var1);
         IO1l var3 = var0;
         Il0O var4 = var2;

         try {
            switch (var4.I_O0) {
               case 0:
               case 12:
                  for (int var5 = 0; var5 < var4.I1O; var5++) {
                     if (var4.IIol[var5] == 2
                        && var4.II0O[var5] >= I1_I.Io1
                        && var4.II0O[var5] <= II.IIl + I1_I.Io1
                        && var4.II00[var5] >= I1_I.Io1I
                        && var4.II00[var5] <= II.IIlI + I1_I.Io1I) {
                        if (var4.III0[var5]) {
                           var3.II(IIIo, 0, 10 * var4.IIo1[var5], 13, 10, 0, var4.II0O[var5], var4.II00[var5] - 10, 0);
                        } else {
                           var3.II(IIl, var4.II0O[var5], var4.II00[var5], 0);
                        }
                     }
                  }
                  break;
               case 1:
               case 2:
               case 5:
               case 6:
               case 7:
               case 11:
               case 15:
                  if (var4.I_O0 == 15) {
                     if (I_oo.II[11120] != null && I_oo.II[11120].I1I1 != null) {
                        IIl1 = I_oo.II[11120].I1I1;
                     }

                     if (IIl1 == null) {
                        continue;
                     }
                  }

                  Image var6 = IIl1;
                  var3 = var3;
                  var4 = var4;

                  try {
                     for (int var7 = 0; var7 < var4.I1O; var7++) {
                        if (var7 % 3 == 0
                           && var4.II0O[var7] >= I1_I.Io1
                           && var4.II0O[var7] <= II.IIl + I1_I.Io1
                           && var4.II00[var7] >= I1_I.Io1I
                           && var4.II00[var7] <= II.IIlI + I1_I.Io1I
                           && var6 != null) {
                           var3.II(var6, 0, I1Oo * var4.IIo1[var7], var6.getWidth(), I1Oo, 0, var4.II0O[var7], var4.II00[var7], 0);
                        }
                     }
                  } catch (Exception var8) {
                  }
               case 3:
               case 4:
               case 8:
               case 9:
               case 10:
               case 14:
               default:
                  break;
               case 13:
                  if (!I1Io) {
                     II1(var3);
                  }
            }
         } catch (Exception var9) {
         }
      }
   }

   public static void IIII(IO1l var0) {
      for (int var1 = 0; var1 < IIIO.size(); var1++) {
         Il0O var2 = (Il0O)IIIO.elementAt(var1);
         IO1l var3 = var0;
         Il0O var4 = var2;
         var0.IIl0(-var0.IIO1(), -var0.IIO_());
         if (var2.I_O0 == 4) {
            for (int var5 = 0; var5 < var4.I1O; var5++) {
               var3.II(IIll, 0, 16 * var4.IIo1[var5], 16, 16, 0, var4.II0O[var5], var4.II00[var5], 0);
            }
         }

         if (var4.I_O0 == 9) {
            var3.Illl(16777215);

            for (int var6 = 0; var6 < var4.IIO0; var6++) {
               var3.II(IIoI[var6] == 1 ? II1I : II1l, var4.II0O[var6], var4.II00[var6], 3);
            }
         }
      }
   }

   public static void II1l(IO1l var0) {
      for (int var1 = 0; var1 < IIIO.size(); var1++) {
         Il0O var2 = (Il0O)IIIO.elementAt(var1);
         IO1l var3 = var0;
         Il0O var4 = var2;
         switch (var2.I_O0) {
            case 0:
               var0.Illl(10742731);

               for (int var5 = 0; var5 < var4.I1O; var5++) {
                  if (var4.IIol[var5] != 2
                     && var4.II0O[var5] >= I1_I.Io1
                     && var4.II0O[var5] <= II.IIl + I1_I.Io1
                     && var4.II00[var5] >= I1_I.Io1I
                     && var4.II00[var5] <= II.IIlI + I1_I.Io1I) {
                     var3.II(IIlI, var4.II0O[var5], var4.II00[var5], 0);
                  }
               }
               break;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 11:
            case 15:
               if (var2.I_O0 == 15) {
                  if (I_oo.II[11120] != null && I_oo.II[11120].I1I1 != null) {
                     IIl1 = I_oo.II[11120].I1I1;
                  }

                  if (IIl1 == null) {
                     continue;
                  }
               }

               Image var6 = IIl1;
               var3 = var0;
               var4 = var2;

               try {
                  for (int var7 = 0; var7 < var4.I1O; var7++) {
                     if (var7 % 3 != 0
                        && var4.II0O[var7] >= I1_I.Io1
                        && var4.II0O[var7] <= II.IIl + I1_I.Io1
                        && var4.II00[var7] >= I1_I.Io1I
                        && var4.II00[var7] <= II.IIlI + I1_I.Io1I
                        && var6 != null) {
                        var3.II(var6, 0, I1Oo * var4.IIo1[var7], var6.getWidth(), I1Oo, 0, var4.II0O[var7], var4.II00[var7], 0);
                     }
                  }
               } catch (Exception var8) {
               }
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
         }
      }
   }

   public static void III() {
      for (int var0 = 0; var0 < IIIO.size(); var0++) {
         Il0O var1 = (Il0O)IIIO.elementAt(var0);

         try {
            switch (var1.I_O0) {
               case 0:
               case 12:
                  for (int var19 = 0; var19 < var1.I1O; var19++) {
                     if (var19 % 3 != 0 && var1.I_O0 != 12 && IOlO.IIIl(var1.II0O[var19], var1.II00[var19] - II.II10, 2)) {
                        var1.III0[var19] = true;
                     }

                     if (var19 % 3 == 0 && var1.II00[var19] > II.IIlI + I1_I.Io1I) {
                        var1.II0O[var19] = I_Ol.III_(-10, II.IIl + 300) + I1_I.Io1;
                        var1.II00[var19] = I_Ol.III_(-100, 0) + I1_I.Io1I;
                     }

                     if (!var1.III0[var19]) {
                        int[] var13 = var1.II00;
                        var13[var19] += var1.IIo[var19];
                        var13 = var1.II0O;
                        var13[var19] += var1.II0o[var19];
                     }

                     if (var1.III0[var19]) {
                        var1.IIo_[var19]++;
                        if (var1.IIo_[var19] > 2) {
                           var1.IIo1[var19]++;
                           var1.IIo_[var19] = 0;
                           if (var1.IIo1[var19] > 1) {
                              var1.IIo1[var19] = 0;
                              var1.III0[var19] = false;
                              var1.II0O[var19] = I_Ol.III_(-10, II.IIl + 300) + I1_I.Io1;
                              var1.II00[var19] = I_Ol.III_(-100, 0) + I1_I.Io1I;
                           }
                        }
                     }
                  }
                  break;
               case 1:
               case 2:
               case 5:
               case 6:
               case 7:
               case 11:
               case 15:
                  for (int var18 = 0; var18 < var1.I1O; var18++) {
                     if (var18 % 3 != 0 && IOlO.IIIl(var1.II0O[var18], var1.II00[var18] + (IOlO.l1o == 15 ? 10 : 0), 2)) {
                        var1.III0[var18] = true;
                     }

                     if (var18 % 3 == 0 && var1.II00[var18] > IOlO.l10o) {
                        var1.II0O[var18] = I_Ol.III_(-10, IOlO.l100 + 50);
                        var1.II00[var18] = I_Ol.III_(-50, 0);
                     }

                     if (var1.III0[var18]) {
                        var1.IIo_[var18]++;
                        if (var1.IIo_[var18] == 100) {
                           var1.IIo_[var18] = 0;
                           var1.II0O[var18] = I_Ol.III_(-10, IOlO.l100 + 50);
                           var1.II00[var18] = I_Ol.III_(-50, 0);
                           var1.III0[var18] = false;
                        }
                     } else {
                        for (int var20 = 0; var20 < IOl1.IlI1.size(); var20++) {
                           IOl1 var21;
                           if ((var21 = (IOl1)IOl1.IlI1.elementAt(var20)) != null
                              && var21.I_OI
                              && var1.II0O[var18] < var21.I1 + 80
                              && var1.II0O[var18] > var21.I1 - 80
                              && var1.II00[var18] < var21.I1I + 80
                              && var1.II00[var18] > var21.I1I - 80) {
                              int[] var10 = var1.II0O;
                              var10[var18] += var1.II0O[var18] < var21.I1 ? -10 : 10;
                           }
                        }

                        int[] var11 = var1.II00;
                        var11[var18] += var1.IIo[var18];
                        var11 = var1.II0O;
                        var11[var18] += var1.II0o[var18];
                        var1.IIo_[var18]++;
                        if (var1.IIo_[var18] > (var1.I_O0 != 2 ? 2 : 4)) {
                           if (var1.I_O0 != 11 && var1.I_O0 != 15) {
                              var1.IIo1[var18]++;
                           }

                           var1.IIo_[var18] = 0;
                           if (var1.IIo1[var18] > 3) {
                              var1.IIo1[var18] = 0;
                           }
                        }
                     }
                  }
               case 3:
               default:
                  break;
               case 4:
                  for (int var17 = 0; var17 < var1.I1O; var17++) {
                     var1.IIo_[var17]++;
                     if (var1.IIo_[var17] > 10) {
                        var1.IIII[var17]++;
                        var1.IIo_[var17] = 0;
                        if (var1.IIII[var17] > 5) {
                           var1.IIII[var17] = 0;
                        }

                        var1.IIo1[var17] = var1.IIoO[var1.IIII[var17]];
                     }
                  }
                  break;
               case 8:
                  var1.IIIl++;
                  if (var1.IIIl == 3) {
                     var1.IIIl = 0;
                     var1.IIII++;
                     if (var1.IIII > 1) {
                        var1.IIII = 0;
                     }
                  }

                  if (II.IIIO % var1.III1 == 0) {
                     var1.I1I0 = true;
                  }

                  if (var1.I1I0) {
                     if (var1.II == 1) {
                        var1.IIOo = var1.IIOo + var1.III_;
                        if (var1.IIOo > IOlO.l100 + 50) {
                           var1.IO11();
                        }
                     } else if (var1.II == 2) {
                        var1.IIOo = var1.IIOo - var1.III_;
                        if (var1.IIOo < -50) {
                           var1.IO11();
                        }
                     } else if (var1.II == 3) {
                        var1.II0 = var1.II0 + var1.III_;
                        if (var1.II0 > IOlO.l10o + 50) {
                           var1.IO11();
                        }
                     } else if (var1.II == 4) {
                        var1.II0 = var1.II0 - var1.III_;
                        if (var1.II0 < -50) {
                           var1.IO11();
                        }
                     }
                  }
                  break;
               case 9:
                  for (int var16 = 0; var16 < var1.IIO0; var16++) {
                     int[] var9 = var1.II0O;
                     var9[var16] -= var1.II0o[var16];
                     if (var1.II0O[var16] < -var1.II0o[var16]) {
                        IIoI[var16] = I_Ol.II1(I_Ol.III_(1, 3));
                        var1.II0o[var16] = IIoI[var16];
                        var1.II0O[var16] = II.IIl + var1.II0o[var16];
                     }
                  }
                  break;
               case 10:
                  for (int var15 = 0; var15 < var1.IIO0; var15++) {
                     int[] var8 = var1.II0O;
                     var8[var15] -= var1.II0o[var15];
                     if (var1.II0O[var15] < -var1.II0o[var15] + I1_I.Io1) {
                        var1.II0O[var15] = II.IIl + var1.II0o[var15] + I1_I.Io1;
                     }
                  }
                  break;
               case 13:
                  if (IO10.l_lI != 1 && !II.II && IIO > 0) {
                     int var6 = II.II == I1_I.II() ? IOlO.l100 : I1_I.Io1 + II.IIl;

                     for (int var3 = 0; var3 < IIO; var3++) {
                        int var5 = var3 + 1;
                        int[] var2 = II.IIII;
                        var2[var3] -= var5;
                        if (II.IIII[var3] < -I100) {
                           II.IIII[var3] = var6 + 100;
                        }
                     }
                  }
                  break;
               case 14:
                  if (IO10.l_lI != 1 && !II.II && II_ && --I10o < -I1o) {
                     I10o = 0;
                  }
            }
         } catch (Exception var7) {
         }
      }
   }
}
