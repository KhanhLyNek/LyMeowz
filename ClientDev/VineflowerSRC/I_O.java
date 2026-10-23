package main;

import javax.microedition.lcdui.Image;

public final class I_O extends IO1_ {
   private static I_O II;
   private static boolean I1_l;
   private static I11o IIl0;
   private static I11o IIlo;
   public static I11o II1;
   private static Image II1o;
   private static Image I1;
   private static Image II_;
   private static Image IlO;
   private static Image Iloo;
   private static Image IlO0;
   private static Image IlOo;
   private static Image I1I;
   private static Image I1II;
   private static Image I1Il;
   private static Image IIIo;
   private static Image IIl;
   private static Image IIlI;
   private static Image IIll;
   private static Image[] IIIo;
   private static int I1__;
   private static int I1_O;
   private static int I1_0;
   private static int I1_o;
   private static int I1O;
   private static int I1OI;
   public static int I_O0;
   public static int I_Oo;
   public static int I_0;
   private static int I1Ol;
   public static int IIO;
   private static int I1O1;
   private static int[] I101 = new int[0];
   private static int[] I10_ = new int[0];
   private static int[][] IIlO;
   private static int[][] IIl0;
   private static int[] I10O = new int[]{-2, -1, 0, 1, 2};
   private int I10I;
   private int[] I100;
   private int I10l;
   private int I101;
   private int IIOO = 0;
   public static I_lO IlII;
   public static I_lO IlIl;
   private static int I10_;
   private I10I II;
   private int I100 = 0;
   private int I10o = 0;
   private int I1o;
   private int I1oI;
   private int I1ol;

   public static I_O II() {
      if (II == null) {
         II = new I_O();
      }

      return II;
   }

   public I_O() {
      I1_l = true;
      Image var1 = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芘苠芝荢荌", 33207));
      Image var2 = IO10.IIII(Il0("膘膤膔艰艒舠艞芣芁芾芃荫", 33207));
      Image var3 = IO10.IIII(Il0("膘膤膔艰艒舠艞芢芜苠芝荢荌", 33207));
      IIl0 = new I11o(var1, 28, 28);
      IIlo = new I11o(var2, 30, 30);
      II1 = new I11o(var3, 11, 11);
      II1o = IO10.IIII(Il0("膘膤膔艰艒舠艞芠芁芾芃荫", 33207));
      II_ = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芁芾芃荫", 33207));
      IlO = IO10.IIII(Il0("膘膤膔艰艒舠艞芢芁芾芃荫", 33207));
      I1 = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芘苠芝荢荌", 33207));
      Iloo = IO10.IIII(Il0("膘膤膔艰艒舠艞芤芁芾芃荫", 33207));
      IlO0 = IO10.IIII(Il0("膘膤膔艰艒舠艞芥芁芾芃荫", 33207));
      IlOo = IO10.IIII(Il0("膘膤膔艰艒舠艞芦芁芾芃荫", 33207));
      IIIo = new Image[7];

      for (int var4 = 0; var4 < 7; var4++) {
         IIIo[var4] = IO10.IIII(Il0("膘膤膔艰艒舠艞", 33207) + (var4 + 7) + Il0("膙膦膛艳", 33207));
      }

      I1I = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芛苠芝荢荌", 33207));
      I1II = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芚苠芝荢荌", 33207));
      I1Il = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芙苠芝荢荌", 33207));
      I1 = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芗苠芝荢荌", 33207));
      IIl = IO10.IIII(Il0("膘膤膔艰艒舠艞芡芖苠芝荢荌", 33207));
      IIlI = IO10.IIII(Il0("膘膤膔艰艒舠艞芢芟苠芝荢荌", 33207));
      IIll = IO10.IIII(Il0("膘膤膔艰艒舠艞芢芞苠芝荢荌", 33207));
      IIIo = IO10.IIII(Il0("膘膤膔艰艒舠艞芢芝苠芝荢荌", 33207));
      I1_0 = 200;
      I1_o = 219;
      I1__ = II.IIll - (I1_0 + 40) / 2;
      I1_O = II.IIl1 - I1_o / 2;
      I_O0 = I1__ + I1_0 - 81;
      I_Oo = I1_O + 29;
      I_0 = 120;
      IIO = 80;
      IIlO = new int[][]{{I1__ + 34, I1_O + I1_o - 42}, {I1__ + I1_0 / 2 - Iloo.getWidth() / 2, I1_O + I1_o / 2 + 33}, {I1__ + I1_0 - 41, I1_O + I1_o - 42}};
      IIl0 = new int[][]{
         {I1__ + 25, I1_O + I1_o - 82},
         {I1__ + 57, I1_O + I1_o - 62},
         {I1__ + I1_0 / 2 - 14, I1_O + I1_o - 102},
         {I1__ + I1_0 - 57 - 28, I1_O + I1_o - 62},
         {I1__ + I1_0 - 25 - 28, I1_O + I1_o - 82}
      };
      this.I100 = new int[2];
      this.I10I = 0;
      I1O = I1__ + 73;
      I1OI = I1_O + I1_o / 2 + 5;
      I1O1 = I1_O + I1_o - 22;
      I101 = new int[]{I1__ + I1_0 / 2 - 8 - 80, I1__ + I1_0 / 2 - 8, I1__ + I1_0 / 2 - 8 + 80};
      I10_ = new int[3];
      this.I1oI = I_Oo + 10 + 70;
      this.I1ol = 0;
      IlII = new I_lO("");
      IlIl = new I_lO("");
      this.I10l = 1;
      this.I101 = 2;
   }

   public void II(I_lO var1, int var2, int var3) {
      IlII = var1;
      I10_ = var2;
      this.I10l = 1;
      this.IIOO = 2;
      this.IOl_();
      I1_l = true;
      IO11();
      if (I1_l) {
         this.I101 = var1.size() / 5 + (var1.size() % 5 > 0 ? 1 : 0);
      } else {
         this.I101 = IlIl.size() / 5 + (IlIl.size() % 5 > 0 ? 1 : 0);
      }
   }

   public static void III0(int var0, int var1) {
      I10_ = var0;
   }

   public static void IO11() {
      IlIl = new I_lO("");

      for (int var0 = 0; var0 < IlII.size(); var0++) {
         I10I var1;
         if ((var1 = (I10I)IlII.elementAt(var0)) != null && var1.IIOO == 1) {
            IlIl.addElement(var1);
         }
      }
   }

   private void IOl_() {
      I_lO var1 = IlIl;
      if (I1_l) {
         var1 = IlII;
      }

      if (this.I10l < 1) {
         this.I10l = 1;
      }

      int var2;
      int var3 = (var2 = (this.I10l - 1) * 5) + 5;

      for (int var4 = var2; var4 < var3; var4++) {
         if (var4 >= 0 && var4 < var1.size()) {
            I10I var5;
            if ((var5 = (I10I)var1.elementAt(var4)) != null) {
               I10O[var4 - var2] = var5.IIO;
            }
         } else {
            I10O[var4 - var2] = -1;
         }
      }

      IO.II();
   }

   @Override
   public void IIlO() {
      try {
         if (IIO < 80 && (IIO += 4) > 80) {
            IIO = 80;
         }

         this.II = I10I.II(IlIl, I10O[this.IIOO]);
         if (I1_l) {
            this.II = I10I.II(IlII, I10O[this.IIOO]);
         }

         I1_I.II().IIlO();
         if (II.IIIO % 10 < 6) {
            if (II.IIIO % 2 == 0) {
               this.I10I--;
            }
         } else {
            this.I10I = 0;
         }

         if (this.II != null) {
            int var1 = this.II.IIO_ * 100 / this.II.II1O;
            this.I1ol = var1 * IIl.getHeight() / 100;
            var1 = I10_ * 100 / IlII.size();
            this.I1o = var1 * IIll.getWidth() / 100;
            return;
         }
      } catch (Exception var2) {
         System.out.println(Il0("膚膣膅艰舞舠舐苴苎芝芎荾茆茤茜菤菋菼菅", 33207) + var2.toString());
      }
   }

   @Override
   public void I_Il() {
      if (!I1OO.I1l1) {
         if (II.IIIl && !Ilo_.II().I_10 && !II.II.IOol) {
            I_O var1 = this;
            if (!II.III0) {
               I10_[0] = 0;
               I10_[1] = 0;
               I10_[2] = 0;
               this.I100[0] = 0;
               this.I100[1] = 0;
            } else {
               for (int var2 = 0; var2 < 5; var2++) {
                  if (II.II(IIl0[var2][0], IIl0[var2][1], 30, 30) && II.III0 && II.IIIo && var2 != var1.IIOO) {
                     var1.IIOO = var2;
                     IIO = 0;
                  }
               }

               if (II.II(IIlO[0][0] - 5, IIlO[0][1] - 5, 20, 20)) {
                  if (II.IIIO) {
                     var1.I100[0] = 1;
                  }

                  if (II.III0 && II.IIIo) {
                     var1.IIII(0);
                     var1.I100[0] = 0;
                  }
               }

               if (II.II(IIlO[2][0] - 5, IIlO[2][1] - 5, 20, 20)) {
                  if (II.IIIO) {
                     var1.I100[1] = 1;
                  }

                  if (II.III0 && II.IIIo) {
                     var1.IIII(1);
                     var1.I100[1] = 0;
                  }
               }

               for (int var3 = 0; var3 < I101.length; var3++) {
                  if (II.II(I101[var3] - 5, I1O1 - 5, 20, 20)) {
                     if (II.IIIO) {
                        I10_[var3] = 1;
                     }

                     if (II.III0 && II.IIIo) {
                        var1.II(var3);
                        I10_[var3] = 0;
                     }
                  }
               }
            }

            if (II.II(I_O0, 0, I_0, I_Oo + IIO)) {
               if (II.IIl) {
                  if (var1.I10o == 0) {
                     var1.I10o = II.III;
                  }

                  var1.I100 = var1.I10o - II.III;
                  if (var1.I100 != 0) {
                     I1Ol = I1Ol + var1.I100;
                     var1.I10o = II.III;
                  }

                  if (I1Ol < 0) {
                     I1Ol = 0;
                  }

                  if (I1Ol > var1.II.IIIl.IIlI) {
                     I1Ol = var1.II.IIIl.IIlI;
                  }
               } else {
                  var1.I10o = 0;
                  var1.I10o = 0;
               }
            }
         }

         if (II.II[8]) {
            II.II[8] = false;
            this.IIOI(1);
         }

         if (II.II[2]) {
            II.II[2] = false;
            this.IIOI(-1);
         }

         if (II.II[4]) {
            II.II[4] = false;
            this.IIOl(1);
         }

         if (II.II[6]) {
            II.II[6] = false;
            this.IIOl(0);
         }

         if (II.II[12]) {
            II.II[12] = false;
            this.II(0);
         }

         if (II.II[5]) {
            II.II[5] = false;
            this.II(1);
         }

         if (II.II[13]) {
            this.II(2);
         }

         II.IIIl();
      }
   }

   private void II(int var1) {
      if (var1 == 0) {
         I1_l = !I1_l;
         this.I10l = 1;
         this.IIOO = 0;
         if (I1_l) {
            this.I101 = IlII.size() / 5 + (IlII.size() % 5 > 0 ? 1 : 0);
         } else {
            this.I101 = IlIl.size() / 5 + (IlIl.size() % 5 > 0 ? 1 : 0);
         }

         this.IOl_();
         IIO = 0;
      } else if (var1 == 1) {
         if (this.II != null) {
            I_0_.II().IIl(1, this.II.IIO);
         }
      } else if (var1 == 2) {
         I1_I.II().I0l_();
      }

      IO.II();
   }

   private void IIII(int var1) {
      if (I1_l) {
         this.I101 = IlII.size() / 5 + (IlII.size() % 5 > 0 ? 1 : 0);
      } else {
         this.I101 = IlIl.size() / 5 + (IlIl.size() % 5 > 0 ? 1 : 0);
      }

      if (this.I101 < 1) {
         this.I101 = 1;
      }

      int var2 = this.I10l;
      if (var1 == 0) {
         if (this.I10l == 1) {
            return;
         }

         if (--var2 <= 0) {
            var2 = 1;
         }
      } else {
         if (this.I10l == this.I101) {
            return;
         }

         if (++var2 > this.I101) {
            var2 = this.I101;
         }

         if (var2 < 1) {
            var2 = 1;
         }
      }

      if (var2 != this.I10l) {
         this.I10l = var2;
         this.IOl_();
      }
   }

   private void IIOI(int var1) {
      if ((I1Ol += var1 * 12) < 0) {
         I1Ol = 0;
      }

      if (I1Ol > this.II.IIIl.IIlI) {
         I1Ol = this.II.IIIl.IIlI;
      }
   }

   private void IIOl(int var1) {
      int var2 = this.IIOO;
      int var3 = this.I10l;
      if (var1 == 0) {
         var2++;
      } else {
         var2--;
      }

      if (var2 >= I10O.length) {
         if (this.I10l < this.I101) {
            var2 = 0;
            var3++;
         } else {
            var2 = I10O.length - 1;
         }
      }

      if (var2 < 0) {
         if (this.I10l > 1) {
            var2 = I10O.length - 1;
            var3--;
         } else {
            var2 = 0;
         }
      }

      if (var2 != this.IIOO) {
         this.IIOO = var2;
         I1Ol = 0;
         IIO = 0;
      }

      if (var3 != this.I10l) {
         this.I10l = var3;
         this.IOl_();
      }
   }

   @Override
   public void III_(IO1l var1) {
      try {
         I1_I.II().III_(var1);
         var1.IIl0(-I1_I.Io1, -I1_I.Io1I);
         var1.IIl0(0, II.II10);
         I1_I.II1I(var1);
         var1.II(II1o, I1__, I1_O, 0);
         var1.II(IIlI, I1__ + I1_0 / 2 - IO10.III1(IIlI) / 2, I1_O - IO10.III_(IIlI) / 2 - 2, 0);
         var1.IIIO(I1__ + I1_0 / 2 - IO10.III1(IIlI) / 2 + 13, I1_O - IO10.III_(IIlI) / 2 + 3, this.I1o, IO10.III_(IIlI));
         var1.II(IIll, I1__ + I1_0 / 2 - IO10.III1(IIlI) / 2 + 13, I1_O - IO10.III_(IIlI) / 2 + 3, 0);
         I1_I.II1I(var1);
         var1.II(I1Il, I101[0], I1O1 + I10_[0], 0);
         var1.II(IlOo, I101[1], I1O1 + I10_[1], 0);
         var1.II(I1II, I101[2], I1O1 + I10_[2], 0);
         if (I1_l) {
            var1.II(I1I, 0, 0, 17, 17, 0, I101[1], I1O1 + I10_[1], 0);
         } else {
            var1.II(I1I, 0, 0, 17, 17, 1, I101[1], I1O1 + I10_[1], 0);
         }

         if (this.II != null) {
            var1.IIIO(I1__ + 30, I1_O + 13, I1_0 - 60, I1_o / 2);
            I10I var3 = this.II;
            int var2 = I1OI;
            int var4 = I1O;
            var3.III++;
            if (var3.III > var3.Il1.length - 1) {
               var3.III = 0;
            }

            boolean var5 = false;
            if (var3.II10 == 0 && var3.III0 != null && I_I_.II[var3.III0.I1ll] != null) {
               if (I_I_.II[var3.III0.I1ll].II != null) {
                  I_I_.II[var3.III0.I1ll].II.II(var1, var3.Il1[var3.III], var4, var2, 0, 0);
                  var5 = true;
               } else if (var3.Ilo0 - II.II < 0L) {
                  var3.Ilo0 = II.II + 1500L;
                  var3.III0.I00();
               }
            } else if (var3.II10 != 0 && var3.IIl1 != null) {
               var3.IIl1.II(var1, var4, var2, 1, var3.Il1[var3.III], true);
               var5 = true;
            }

            if (!var5 && var3.lIOl >= 0) {
               I11o var6 = IO10.II(Il0("臖膣膇艵艬", 33207) + var3.lIOl);
               if (var6 != null) {
                  var6.II(II.IIIO / 4 % var6.I_Oo, var4, var2, 0, 33, var1);
                  var5 = true;
               }
            }

            if (!var5) {
               I_oo.IIII(var1, var3.IIOl, var4, var2, 0, IOII.IIOI);
            }

            I1_I.II1I(var1);
            IO1I.IIIl.II(var1, (this.II.IIIo > 0 ? Il0("臻膠臛", 33207) + this.II.IIIo + Il0("膗", 33207) : "") + this.II.IIo_, I1__ + I1_0 / 2, I1_O + 15, 2);
            IO1I.II1I.II(var1, Il0("臙膹臛", 33207) + this.II.IIOI, I1__ + 30, I_Oo - 2, 0);
            var1.II(IIIo, I1__ + 36, I_Oo + 10, 0);
            var1.IIIO(I1__ + 36, this.I1oI - this.I1ol, 7, this.I1ol);
            var1.II(IIl, I1__ + 36, I_Oo + 10, 0);
            I1_I.II1I(var1);
            var1.II(IIIo[this.II.IIO1], I1__ + 39 - 5 + 14, I_Oo + 12, 0);
         }

         var1.IIIO(I_O0, I_Oo, I_0 + 5, IIO + 8);
         if (this.II != null) {
            var1.II(I1, I_O0, I_Oo, 0);
         }

         I1_I.II1I(var1);
         var1.IIIO(I_O0, I_Oo + 1, I_0, IIO + 5);
         if (this.II != null && this.II.IIIl != null) {
            if (this.II.IIIl.IIIO == null) {
               return;
            }

            this.II.IIIl.II(var1, I1Ol);
         }

         I1_I.II1I(var1);
         if (!I1_l && IlIl.size() > 5 || I1_l) {
            if (this.I10l > 1) {
               var1.II(II_, IIlO[0][0], IIlO[0][1] + this.I100[0], 0);
            }

            if (this.I10l < this.I101) {
               var1.II(IlO, IIlO[2][0], IIlO[2][1] + this.I100[1], 0);
            }
         }

         for (int var9 = 0; var9 < I10O.length; var9++) {
            int var8 = 0;
            byte var10 = 0;
            byte var11 = 0;
            if (var9 == this.IIOO) {
               var8 = this.I10I;
               var10 = -10;
               var11 = 1;
               var1.II(Iloo, IIl0[var9][0] + 10, IIl0[var9][1] + this.I10I + 29 + -10, 0);
            }

            I10I var12 = I10I.II(IlIl, I10O[var9]);
            if (I1_l) {
               var12 = I10I.II(IlII, I10O[var9]);
            }

            if (var12 != null) {
               IIl0.II(var12.IIO1, IIl0[var9][0], IIl0[var9][1] + var8 + var10, 0, 0, var1);
               I_oo.IIII(var1, var12.IIOl, IIl0[var9][0] + 14, IIl0[var9][1] + 14 + var8 + var10, 0, IOII.IIOI);
               var12.III(var1, IIl0[var9][0], IIl0[var9][1] + var8 + var10);
               if (var12.IIIo == 0) {
                  var1.II(IlO0, IIl0[var9][0], IIl0[var9][1] + var8 + var10, 0);
               }

               if (var9 == this.IIOO) {
                  IIl0.II(7, IIl0[var9][0], IIl0[var9][1] + var8 + var10, 0, 0, var1);
               }

               if (var12.IIOO == 1) {
                  IIl0.II(8, IIl0[var9][0], IIl0[var9][1] + var8 + var10, 0, 0, var1);
               }
            } else {
               IIlo.II(var11, IIl0[var9][0] - 1, IIl0[var9][1] - 1 + var8 + var10, 0, 0, var1);
            }
         }
      } catch (Exception var7) {
         System.out.println(Il0("膚膦膔艽艝舦艜苢苎芪芌荟荈茸荄菦菒莪莉萾萃", 33207) + var7.toString());
      }
   }

   @Override
   public void I0l_() {
      I1_I.I_1o = true;
      super.I0l_();
   }
}
