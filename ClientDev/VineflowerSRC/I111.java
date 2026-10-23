package main;

import javax.microedition.lcdui.Image;

public final class I111 {
   private I_lO II_I = new I_lO(Ill("ꞙꞝ\ua87cꡜ\ua83bꠃ꣓\ua8dbꢰ꣓ꥄ\ua954ꤳꤪꧨ꧋ꦉꦅꩮ", 42972));
   private I11o IIlI;
   private byte[] IIl = new byte[10];
   private byte[] IIlI = new byte[10];
   private int IIlI = 0;
   private int IIO1 = 0;
   private int IIO_ = 0;
   private int IoII = 0;
   private int IIO0;
   private int IIOo;
   private int II0;
   private int II;
   private int III;
   private int IIII;
   private int IIIl;
   private int III1;
   private int III_;
   public int II0I;
   private int II0l;
   private int Iol;
   private int IIl;
   private int I1;
   private int I1I;
   private int Ioll;
   private int I1__;
   private int I1_O;
   private int I1_0;
   private int I1_o;
   private int I1O;
   private int I1OI;
   private short II_;
   private long IlOO;
   public boolean I1l1;
   private boolean I_Ol;
   private Ilol IIl;
   private I___[] II;
   private I___ III;
   public static short[][] IIIl = new short[][]{
      {68, 264, 4},
      {30, 120, 4},
      {66, 280, 4},
      {0, 0, 1},
      {111, 68, 2},
      {90, 68, 2},
      {125, 68, 2},
      {47, 282, 6},
      {10, 40, 4},
      {92, 525, 7},
      {62, 372, 6},
      {80, 352, 4},
      {80, 352, 4},
      {80, 352, 4},
      {72, 240, 3},
      {20, 42, 3},
      {65, 160, 4},
      {50, 300, 6},
      {84, 168, 2},
      {90, 540, 6},
      {180, 900, 6},
      {62, 186, 3},
      {34, 80, 4},
      {140, 560, 4},
      {64, 600, 6},
      {36, 200, 5},
      {35, 200, 5},
      {50, 250, 5},
      {50, 240, 6}
   };
   private int I10;
   private int I10I;
   private int IIl_;
   private int I10l;
   private int I101;
   private int[] Il_l;
   private int[] Il_1;
   private int[] Il__;
   private int[] Il_O;
   private static int[][] IIIl = new int[][]{{16310304, 16298056, 16777215}, {7045120, 12643960, 16777215}, {2407423, 11987199, 16777215}};
   private int[] Il_0;
   private int I1oI;
   private int I1ol;
   private int I1o1;
   private I11o[] II;

   public static Image II(int var0) {
      if (var0 < 0) {
         return null;
      }

      String var1 = Ill("ꟳꞞ꠵ꡜꠇ", 42972) + var0 + Ill("ꟲꞋ꡴ꡞ", 42972);
      Image var2 = null;

      try {
         var2 = IO10.IIII(var1);
      } catch (Exception var4) {
      }

      return var2;
   }

   public I111(int var1, int var2, int var3, Ilol var4, I___ var5, int var6, short var7, short var8) {
      byte[] var10000 = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
      var10000 = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
      var10000 = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
      this.I1oI = 0;
      this.II0l = 0;
      this.I1O = 0;
      this.IIO1 = var1;
      this.IIO_ = var2;
      this.IIlI = var3;
      this.IIl = var4;
      if (var4.II1I(1265)) {
         if (this.IIO1 == 21 || this.IIO1 == 22 || this.IIO1 == 23) {
            Ilol var12 = this.IIl;
            var12.I_o_ = var12.I_o_ + 10 * this.IIl.IOI1;
         } else if (this.IIO1 != 18 && this.IIO1 != 19 && this.IIO1 != 20) {
            Ilol var11 = this.IIl;
            var11.I_o_ = var11.I_o_ + 15 * this.IIl.IOI1;
         } else {
            Ilol var10 = this.IIl;
            var10.I_o_ = var10.I_o_ + -15 * this.IIl.IOI1;
         }
      }

      this.II = this.IIl.I_o_;
      this.III = this.IIl.I_oO;
      this.III1 = this.IIl.IOI1;
      this.III_ = this.III1 == -1 ? 2 : 0;
      this.III = var5;
      this.II0I = var6;
      this.IlOO = IO10.IIII();
      this.II_ = var7;
      this.IoII = var8;
      this.I1l1 = this.I_Ol = false;
      this.II0 = 4;
      this.IOl_();
      this.IOlI();
   }

   public I111(int var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8, I___[] var9) {
      byte[] var10000 = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
      var10000 = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
      var10000 = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
      this.I1oI = 0;
      this.II0l = 0;
      this.I1O = 0;
      this.IIO1 = var1;
      this.IIO_ = var2;
      this.IIlI = var3;
      this.II = var4;
      this.III = var5;
      this.II0I = var6;
      this.III1 = var7;
      this.III_ = var7 == -1 ? 2 : 0;
      this.IlOO = IO10.IIII();
      this.II_ = var8;
      this.I1l1 = this.I_Ol = false;
      this.II0 = 4;
      if (var9 != null) {
         this.II = new I___[var9.length];

         for (int var11 = 0; var11 < this.II.length; var11++) {
            this.II[var11] = var9[var11];
         }
      }

      this.IOl_();
      this.IOlI();
   }

   private void IOlI() {
      try {
         int var1 = this.III;
         int var2 = this.II;

         try {
            I_Ol.IIlO(3);
         } catch (Exception var4) {
            I_Ol.II_l(Ill("ꞙꞩꡈꠙ꠫ꠒ꣢꣦ꢻꢆꥼ\ua955꤃꤄ꧧ꧁ꦠꦴ\uaa4fꩧꨌ꩝ꪦ", 42972) + var4.toString());
         }

         switch (this.IIO1) {
            case 0:
            case 1:
            case 2:
               var1 = this.IIO1;
               switch (var1) {
                  case 0:
                     this.IIlI = new I11o(4);
                     break;
                  case 1:
                     this.IIlI = new I11o(5);
                     break;
                  case 2:
                     this.IIlI = new I11o(6);
               }

               this.IIO0 = 100;
               this.I1_O = II.IIlI / 3 + 10;
               this.I1 = 10;
               this.Ioll = 0;
               this.I_Ol = false;
               return;
            case 3:
               this.III();
               return;
            case 9:
               this.I1oI = this.IIO_;
               this.I1I = this.II * 1000;
               this.Ioll = this.III * 1000;
               this.IIO0 = I_Ol.III_(4, 6);
               this.I1_0 = 5;
               this.I1ol = 10;
               this.I1o1 = 20;
               this.II(this.I1_0, this.I1ol, this.I1o1, 0);
               return;
            case 10:
            case 11:
               this.IO11();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
               return;
            case 16:
            case 17:
               if (this.IIO1 == 17) {
                  this.II = this.II + (this.III1 == 0 ? 0 : -this.II[0].II0I);
                  this.III = this.III - this.II[0].I_O0 / 2;
               }

               return;
            case 18:
            case 19:
            case 20:
               this.IIl = null;
               this.II0 = 3;
               if (this.IIO1 == 18) {
                  if (this.IIO_ == 0) {
                     this.IIl = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
                     break;
                  }

                  this.IIl = new byte[]{3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6};
               }

               return;
            case 21:
            case 22:
            case 23:
               if (this.IIl != null) {
                  if (this.IIO1 == 21) {
                     this.II = this.IIl.I_o_ - 3 * this.IIl.IOI1;
                     this.III = this.IIl.I_oO;
                     break;
                  }

                  if (this.IIO1 == 22) {
                     this.II = this.IIl.I_o_ + 20 * this.IIl.IOI1;
                     this.III = this.IIl.I_oO - 4;
                     break;
                  }

                  if (this.IIO1 == 23) {
                     this.II = this.IIl.I_o_;
                     this.III = this.IIl.I_oO - 50;
                     break;
                  }

                  this.II = this.IIl.I_o_;
                  this.III = this.IIl.I_oO;
               }

               return;
            case 24:
               this.IIII = this.II[0].II0I;
               this.IIIl = this.II[0].I_O0;
               this.I1_0 = I_Ol.II1(this.II - this.III.I_O0);
               this.IIl = new byte[]{0, 0, 0, 1, 1, 1};
               this.I_Ol = false;
               return;
            case 25:
               this.IIII();
               return;
            case 26:
               this.IIl = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
               this.I_Ol = false;
               this.IIOo = 10;
               this.I1I = this.II;
               this.Ioll = this.III + 12;
               this.I1OI = 25;
               this.I1_O = 19;
               if (this.IIO_ == 1) {
                  this.I1_O = 21;
               } else if (this.IIO_ == 2) {
                  this.I1_O = 31;
               }

               this.IIIl = this.II[1].I_O0 + 50 - this.I1_O;
               this.I1 = 1;
               this.I1__ = 1;
               this.III = this.Ioll - this.IIIl;
               this.I10 = 90;
               this.I1_0 = 1;
               this.I10I = this.IIl_ = 25;
               this.I101 = 1;
               if (this.II != null && this.II.length > 0) {
                  this.I101 = this.II.length;
               }

               this.I10l = 360 / this.I101;
               this.Il_l = new int[this.I101];
               this.Il_1 = new int[this.I101];
               this.Il__ = new int[this.I101];
               this.Il_O = new int[this.I101];
               I1_I.II(16, 0, this.IIlI, this.I1I, this.Ioll, 1, 0, (short)-1, (I___[])null);
               return;
         }
      } catch (Exception var5) {
         I_Ol.II_l(Ill("ꞙꞩꡈꠙ\ua83bꠅꣳ꣔ꢠꢖꥍꥴꤶ꤉ꧫ\ua9ceꦸ꧑ꨪ", 42972) + var5.toString());
         this.I1l1 = true;
      }
   }

   public void IIl1() {
      try {
         this.II0l++;
         switch (this.IIO1) {
            case 0:
            case 1:
            case 2:
               this.II = II.IIll;
               this.III = this.Ioll;
               if (this.II0l > this.IIO0) {
                  this.I1l1 = true;
               }

               this.I1++;
               if (this.I1 > 15) {
                  this.I1 = 15;
               }

               if (this.Ioll + this.I1 >= this.I1_O) {
                  this.Ioll = this.I1_O;
                  if (!this.I_Ol) {
                     this.I_Ol = true;
                     if (this.IIO_ != -1) {
                        I1_I.II(this.IIO_, 0, 0, this.II, this.III, this.II0I, 0, (short)-1, (I___[])null);
                     }
                  }

                  return;
               }

               this.Ioll = this.Ioll + this.I1;
               break;
            case 3:
               I111 var13 = this;

               for (int var16 = 0; var16 < var13.II_I.size(); var16++) {
                  I___ var18;
                  (var18 = (I___)var13.II_I.elementAt(var16)).IIl1();
                  if (var18.IIO1 - var18.IIO_ > var18.IIl_.I_Oo * 3 - 1) {
                     var18.IIO1 = 0;
                     if (var13.IIO_ == 0) {
                        var18.IIO_ = I_Ol.IIlO(10);
                        byte var23 = 1;
                        if (var16 % 2 == 0) {
                           var23 = -1;
                        }

                        var18.I_O0 = var13.II + I_Ol.IIlO(IIIl[5][0] / 2) * var23;
                        var18.I_Oo = var13.III - I_Ol.IIlO(IIIl[5][1] / 2);
                     }
                  }
               }

               if (var13.II0l >= var13.IIO0) {
                  var13.I1l1 = true;
               }

               return;
            case 9:
               I111 var12 = this;

               for (int var15 = 0; var15 < var12.II_I.size(); var15++) {
                  I1o1 var22;
                  I1o1 var26;
                  I1o1 var30 = var26 = var22 = (I1o1)var12.II_I.elementAt(var15);
                  var30.II0I = var30.II0I + var26.IIO;
                  var26.I_Oo = var26.I_Oo + var26.IIO;
                  var26.I_O0 = var26.I_O0 + var26.IIOI;
                  var26.I_0 = var26.I_0 + var26.IIOI;
                  var26.IIOl++;
                  if (var12.II0l >= var12.IIO0) {
                     var12.II_I.removeElement(var22);
                     var15--;
                  }
               }

               if (var12.II0l >= var12.IIO0) {
                  if (II.II - var12.IlOO >= var12.II_) {
                     var12.II_I.removeAllElements();
                     var12.I1l1 = true;
                     break;
                  }

                  var12.IIO0 = I_Ol.III_(4, 6);
                  var12.II0l = 0;
                  var12.II(var12.I1_0, var12.I1ol, var12.I1o1, 0);
               }

               return;
            case 10:
            case 11:
               I111 var11 = this;

               for (int var14 = 0; var14 < var11.II_I.size(); var14++) {
                  I___ var4;
                  (var4 = (I___)var11.II_I.elementAt(var14)).IIl1();
                  if (var4.I_Oo < var11.I1_o) {
                     var11.II_I.removeElementAt(var14);
                     var14--;
                  }
               }

               if (var11.II0l >= var11.IIO0) {
                  var11.I1l1 = true;
               }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
               return;
            case 16:
            case 17:
               if (this.II_ > 0) {
                  if (II.II - this.IlOO >= this.II_) {
                     this.I1l1 = true;
                     break;
                  }
               } else if (this.II0l >= this.II[0].I_Oo * this.II0) {
                  this.I1l1 = true;
               }

               return;
            case 18:
            case 19:
            case 20:
               if (this.IIl != null) {
                  this.II = this.IIl.I_o_;
                  this.III = this.IIl.I_oO + 13;
               }

               if (this.II_ > 0) {
                  if (II.II - this.IlOO >= this.II_) {
                     this.I1l1 = true;
                     break;
                  }
               } else if (this.IIl != null) {
                  if (this.II0l > this.IIl.length) {
                     this.I1l1 = true;
                     break;
                  }
               } else if (this.II0l >= this.II[0].I_Oo * this.II0) {
                  this.I1l1 = true;
               }

               return;
            case 21:
            case 22:
            case 23:
               if (this.IIl != null) {
                  if (this.IIO1 == 21) {
                     this.II = this.IIl.I_o_ - 3 * this.IIl.IOI1;
                     this.III = this.IIl.I_oO;
                  } else if (this.IIO1 == 22) {
                     this.II = this.IIl.I_o_ + 20 * this.IIl.IOI1;
                     this.III = this.IIl.I_oO - 4;
                  } else if (this.IIO1 == 23) {
                     this.II = this.IIl.I_o_;
                     this.III = this.IIl.I_oO - 50;
                  } else {
                     this.II = this.IIl.I_o_;
                     this.III = this.IIl.I_oO;
                  }
               }

               if (this.II_ > 0) {
                  if (II.II - this.IlOO >= this.II_) {
                     this.I1l1 = true;
                     break;
                  }
               } else if (this.II0l >= this.II[0].I_Oo * this.II0) {
                  this.I1l1 = true;
               }

               return;
            case 24:
               this.IIl++;
               this.IIII += 20;
               if (this.IIII > this.I1_0) {
                  this.IIII = this.I1_0;
               }

               this.II = this.IIl.I_o_ + 10;
               this.III = this.IIl.I_oO - 3;
               if (this.III1 == -1) {
                  this.II = this.IIl.I_o_ - this.IIII - 10;
               }

               if (!this.I_Ol && II.II - this.IlOO >= this.II_) {
                  this.II0l = 0;
                  this.IIl = new byte[]{2, 2, 2, 3, 3, 3};
                  this.I_Ol = true;
               }

               if (this.II0l > this.IIl.length - 1) {
                  if (this.I_Ol) {
                     this.I1l1 = true;
                     break;
                  }

                  this.II0l = 0;
               }

               return;
            case 25:
               I111 var1 = this;
               int var2 = 0;

               for (int var17 = 0; var17 < var1.II_I.size(); var17++) {
                  I___ var21;
                  if (!(var21 = (I___)var1.II_I.elementAt(var17)).IIl && II.II - var1.IlOO >= var17 * var1.IIOo) {
                     var21.IIl = true;
                     I1_I.II(17, 0, var1.IIlI, var1.IIl.I_o_, var1.IIl.I_oO - 3, 2, var1.III_, (short)-1, (I___[])null);
                     var1.II_I.size();
                  }

                  if (var21.IIl && !var21.I__I) {
                     var21.IIO1++;
                     if (!var21.I01o) {
                        if (var21.IIO1 < 10
                           && var17 == var1.II_I.size() - 1
                           && var1.IIl != null
                           && !IOlO.IIIl(var1.IIl.I_o_ - (var1.IIl.IO1_ + 1) * var1.IIl.IOI1, var1.IIl.I_oO, var1.IIl.IOI1 == 1 ? 8 : 4)) {
                           Ilol var24 = var1.IIl;
                           var24.I_o_ = var24.I_o_ - var1.IIl.IOI1;
                        }

                        int var25 = var21.IIlI;
                        int var19 = var21.IIOl;
                        int var28 = var19 - var21.I_O0;
                        int var31 = var25 - var21.I_Oo;
                        if (var28 > 1) {
                           var28 = I_Ol.III1(var28, var31);
                           var21.IoII = var21.IIlI(var28);
                        }

                        if (I_Ol.II1(var21.IIO) > 0 && I_Ol.II1(var21.I_O0 - var19) >= I_Ol.II1(var21.IIO)) {
                           var21.I_O0 = var21.I_O0 + var21.IIO;
                        } else {
                           var21.I_O0 = var19;
                           var21.IIO = 0;
                        }

                        if (I_Ol.II1(var21.IIOI) > 0 && I_Ol.II1(var21.I_Oo - var25) >= I_Ol.II1(var21.IIOI)) {
                           var21.I_Oo = var21.I_Oo + var21.IIOI;
                        } else {
                           var21.I_Oo = var25;
                           var21.IIOI = 0;
                        }

                        if (var21.I_O0 == var21.IIOl) {
                           var21.I01o = true;
                           var21.IIO1 = 0;
                        }
                     }

                     if (var21.I01o && var21.IIO1 >= var1.II0 * var21.IIlO.I_Oo) {
                        var21.I__I = true;
                     }
                  }

                  if (var21.I__I) {
                     var2++;
                  }
               }

               if (var2 == var1.II_I.size()) {
                  var1.I1l1 = true;
               }

               return;
            case 26:
               if (this.I1O == 0) {
                  this.Iol++;
                  if (this.Iol > this.IIl.length - 1) {
                     this.Iol = this.IIl.length - 1;
                  }

                  if (this.II0l == this.IIOo + 4) {
                     I1_I.II(16, 1, this.IIlI, this.II, this.III, 3, 0, (short)2945, (I___[])null);
                  }

                  if (this.II0l > this.IIOo + 4) {
                     this.I10--;
                     if (this.I10 < 0) {
                        this.I10 = 0;
                        this.II0l = 0;
                        this.IIl = 0;
                        this.IIlI = new byte[]{1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 2};
                        boolean var7 = true;
                        I111 var20 = this;
                        if (this.II != null) {
                           for (int var5 = 0; var5 < var20.II.length; var5++) {
                              if (var20.II[var5] != null) {
                                 if (var20.II[var5].IIO1 == 0) {
                                    I_I_ var8;
                                    if ((var8 = I1_I.II(var20.II[var5].IIO0)) != null) {
                                       var8.I0I0 = true;
                                    }
                                 } else {
                                    I___ var27 = var20.II[var5];
                                    Ilol var9;
                                    if (Ilol.II().IOI_ == var27.IIO0) {
                                       var9 = Ilol.II();
                                    } else {
                                       var9 = I1_I.II(var20.II[var5].IIO0);
                                    }

                                    if (var9 != null) {
                                       var9.I100 = true;
                                    }
                                 }
                              }
                           }
                        }

                        this.I1O = 1;
                     } else {
                        if (this.I1_0 < 40) {
                           this.I1_0 += 2;
                        }

                        this.I10I = this.IIl_;
                        this.I10I = this.I10I - this.I1_0;
                        if (this.I10I >= 360) {
                           this.I10I -= 360;
                        }

                        if (this.I10I < 0) {
                           this.I10I += 360;
                        }

                        this.IIl_ = this.I10I;
                        I111 var6 = this;

                        for (int var3 = 0; var3 < var6.Il_1.length; var3++) {
                           if (var6.I10I >= 360) {
                              var6.I10I -= 360;
                           }

                           if (var6.I10I < 0) {
                              var6.I10I += 360;
                           }

                           var6.Il_1[var3] = I_Ol.II1(var6.I10 * I_Ol.IIll(var6.I10I) / 1024);
                           var6.Il_l[var3] = I_Ol.II1(var6.I10 * I_Ol.IIl1(var6.I10I) / 1024);
                           if (var6.I10I < 90) {
                              var6.Il__[var3] = var6.II + var6.Il_l[var3];
                              var6.Il_O[var3] = var6.III - var6.Il_1[var3];
                           } else if (var6.I10I >= 90 && var6.I10I < 180) {
                              var6.Il__[var3] = var6.II - var6.Il_l[var3];
                              var6.Il_O[var3] = var6.III - var6.Il_1[var3];
                           } else if (var6.I10I >= 180 && var6.I10I < 270) {
                              var6.Il__[var3] = var6.II - var6.Il_l[var3];
                              var6.Il_O[var3] = var6.III + var6.Il_1[var3];
                           } else {
                              var6.Il__[var3] = var6.II + var6.Il_l[var3];
                              var6.Il_O[var3] = var6.III + var6.Il_1[var3];
                           }

                           var6.I10I = var6.I10I - var6.I10l;
                        }

                        this.IIlI(true);
                     }

                     return;
                  }
               } else if (this.I1O == 1) {
                  this.IIl++;
                  if (this.IIl > this.IIlI.length - 1) {
                     this.IIl = this.IIlI.length - 1;
                     if (II.IIIO % 2 == 0) {
                        this.I1__++;
                     }

                     this.I1 = this.I1 + this.I1__;
                     if (this.I1 >= this.IIIl - this.II[0].I_O0 - this.I1OI + this.I1_O) {
                        this.I1 = this.IIIl - this.II[0].I_O0 - this.I1OI + this.I1_O;
                        this.II0l = 0;
                        this.IIl = 0;
                        this.I1O = 2;
                        this.IIlI = new byte[]{3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
                        return;
                     }
                  }
               } else if (this.I1O == 2) {
                  this.IIl++;
                  if (this.IIl > this.IIlI.length - 1) {
                     this.I1O = 3;
                     this.Iol = 0;
                     this.IIl = new byte[]{2, 2, 1, 1, 0, 0, 3, 3, 3, 0, 0, 0, 4, 4, 4, 0, 0};
                     return;
                  }
               } else if (this.I1O == 3) {
                  this.Iol++;
                  if (this.Iol > this.IIl.length - 1) {
                     this.Iol = 0;
                     this.I1O = 4;
                     this.IIl = new byte[]{
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        3,
                        3,
                        3,
                        0,
                        0,
                        0,
                        4,
                        4,
                        4,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        3,
                        3,
                        0,
                        0,
                        4,
                        4
                     };
                     return;
                  }
               } else {
                  this.Iol++;
                  if (this.Iol > this.IIl.length - 1) {
                     this.Iol = 0;
                  }

                  if (II.II - this.IlOO >= this.II_) {
                     I1_I.II(16, 0, this.IIlI, this.I1I, this.Ioll, 1, 0, (short)-1, (I___[])null);
                     this.IIlI(false);
                     this.I1l1 = true;
                  }
               }

               return;
         }
      } catch (Exception var10) {
         I_Ol.II_l(Ill("ꞙꞩꡈꠙ\ua82dꠇꣲ꣔ꢠꢖꤨꤑ", 42972) + var10.toString());
         this.I1l1 = true;
      }
   }

   public void II(IO1l var1) {
      try {
         if (this.I1l1 || this.II0l < 0) {
            return;
         }

         switch (this.IIO1) {
            case 0:
            case 1:
            case 2:
               if (this.IIlI != null) {
                  this.IIlI.II(this.II0l / 5 % this.IIlI.I_Oo, this.II, this.III, 0, 33, var1);
               }

               return;
            case 3:
               IO1l var27 = var1;
               I111 var30 = this;

               for (int var33 = 0; var33 < var30.II_I.size(); var33++) {
                  I___ var36;
                  if ((var36 = (I___)var30.II_I.elementAt(var33)).IIO1 - var36.IIO_ >= 0 && var36.IIl_ != null) {
                     var36.IIl_.II((var36.IIO1 - var36.IIO_) / 3 % var36.IIl_.I_Oo, var36.I_O0, var36.I_Oo, 0, 3, var27);
                  }
               }

               return;
            case 9:
               IO1l var26 = var1;
               I111 var29 = this;

               for (int var32 = 0; var32 < var29.II_I.size(); var32++) {
                  I1o1 var39;
                  if ((var39 = (I1o1)var29.II_I.elementAt(var32)) != null) {
                     int var37 = 0;
                     if (var32 / 2 < var29.Il_0.length) {
                        var37 = var29.Il_0[var32 / 2];
                     }

                     var26.Illl(var37);
                     var26.IIII(var39.II0I / 1000, var39.I_O0 / 1000, var39.I_Oo / 1000, var39.I_0 / 1000);
                     if (var39.IOOO) {
                        var26.IIII(var39.II0I / 1000 + 1, var39.I_O0 / 1000, var39.I_Oo / 1000 + 1, var39.I_0 / 1000);
                     }
                  }
               }

               return;
            case 10:
            case 11:
               IO1l var25 = var1;
               I111 var28 = this;

               for (int var31 = 0; var31 < var28.II_I.size(); var31++) {
                  I___ var35 = (I___)var28.II_I.elementAt(var31);
                  if (var28.IIlI != null) {
                     var28.IIlI.II(var35.IoII, var35.I_O0, var35.I_Oo, 0, 3, var25);
                  }
               }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
               return;
            case 16:
               if (this.IIO_ == 0) {
                  this.II(var1, 33);
                  return;
               }

               this.II(var1, 3);
               return;
            case 17:
               this.II(var1, 0);
               return;
            case 18:
            case 19:
            case 20:
               boolean var34 = true;
               if (this.II[0] != null) {
                  if (this.IIl != null) {
                     this.II[0].II(this.IIl[this.II0l % this.IIl.length], this.II, this.III, this.III_, 33, var1);
                     break;
                  }

                  this.II[0].II(this.II0l / this.II0 % this.II[0].I_Oo, this.II, this.III, this.III_, 33, var1);
               }

               return;
            case 21:
            case 22:
            case 23:
               boolean var5 = true;
               if (this.II[0] != null) {
                  this.II[0].II(this.II0l / this.II0 % this.II[0].I_Oo, this.II, this.III, this.III_, 3, var1);
               }

               return;
            case 24:
               if (this.II != null) {
                  var1.IIIO(this.II, this.III - this.IIIl / 2, this.IIII, this.IIIl);
                  I11o var38 = this.II[0];
                  I11o var9 = this.II[1];
                  I11o var10 = this.II[2];
                  byte var11 = this.IIl[this.II0l];
                  int var12 = this.I1_0;
                  int var13 = this.III;
                  int var14 = this.II;
                  byte var15 = var11;
                  I11o var16 = var10;
                  I11o var17 = var9;
                  I11o var18 = var38;
                  IO1l var19 = var1;
                  int var20 = var12;
                  boolean var21 = false;
                  if (var38 != null && var10 != null) {
                     var21 = true;
                     var20 = var12 - (var38.II0I + var10.II0I);
                  }

                  if (var20 > 0) {
                     int var22 = var20 / var9.II0I;
                     if (var20 % var9.II0I > 0) {
                        var22++;
                     }

                     if (this.III1 == -1) {
                        for (int var40 = 0; var40 < var22; var40++) {
                           int var23;
                           if (var40 == var22 - 1) {
                              if (var21) {
                                 var23 = var14 + var16.II0I;
                              } else {
                                 var23 = var14 + var12 - var17.II0I;
                              }
                           } else if (var21) {
                              var23 = var14 + var16.II0I + var17.II0I + var40 * var17.II0I;
                           } else {
                              var23 = var14 + var40 * var17.II0I;
                           }

                           var17.II(var15, var23, var13 - var17.I_O0 / 2, 2, 0, var19);
                        }
                     } else {
                        for (int var41 = 0; var41 < var22; var41++) {
                           int var42;
                           if (var41 == var22 - 1) {
                              if (var21) {
                                 var42 = var14 + var12 - (var17.II0I + var16.II0I);
                              } else {
                                 var42 = var14 + var12 - var17.II0I;
                              }
                           } else if (var21) {
                              var42 = var14 + var41 * var17.II0I + var18.II0I;
                           } else {
                              var42 = var14 + var41 * var17.II0I;
                           }

                           var17.II(var15, var42, var13 - var17.I_O0 / 2, 0, 0, var19);
                        }
                     }
                  }

                  if (this.III1 == -1) {
                     if (var18 != null) {
                        var18.II(var15, var14 + var12 - var18.II0I, var13 - var18.I_O0 / 2, 2, 0, var19);
                     }

                     if (var16 != null) {
                        var16.II(var15, var14, var13 - var16.I_O0 / 2, 2, 0, var19);
                     }
                  } else {
                     if (var18 != null) {
                        var18.II(var15, var14, var13 - var18.I_O0 / 2, 0, 0, var19);
                     }

                     if (var16 != null) {
                        var16.II(var15, var14 + var12 - var16.II0I - 1, var13 - var16.I_O0 / 2, 0, 0, var19);
                     }
                  }

                  if (this.III1 == -1 && this.II[0] != null) {
                     this.II[0].II(this.IIl[this.II0l], this.II + this.IIII - this.II[0].II0I, this.III - this.II[0].I_O0 / 2 - 1, 2, 0, var1);
                  }
               }

               return;
            case 25:
               IO1l var2 = var1;
               I111 var3 = this;

               for (int var4 = 0; var4 < var3.II_I.size(); var4++) {
                  I___ var6;
                  if ((var6 = (I___)var3.II_I.elementAt(var4)).IIl && !var6.I__I) {
                     if (!var6.I01o) {
                        var6.II(var2, var6.IIl_, 3, false);
                     }

                     if (var6.I01o) {
                        var6.IIlO.II(var6.IIO1 / var3.II0 % var6.IIlO.I_Oo, var6.I_O0, var6.I_Oo, var3.III_, 3, var2);
                     }
                  }
               }

               return;
            case 26:
               if (this.II != null) {
                  if (this.IIl != null) {
                     this.II[0].II(this.IIl[this.Iol], this.I1I, this.Ioll, 0, 33, var1);
                  }

                  if (this.I1O == 1 || this.I1O == 2) {
                     byte var8 = 33;
                     int var7 = this.I1OI;
                     if (this.IIlI[this.IIl] == 0 || this.IIlI[this.IIl] == 1) {
                        var8 = 3;
                        var7 = 0;
                     }

                     this.II[1].II(this.IIlI[this.IIl], this.II, this.III + var7 + this.I1, 0, var8, var1);
                  }
               }

               return;
         }
      } catch (Exception var24) {
         I_Ol.II_l(var24.toString());
         this.I1l1 = true;
      }
   }

   private void III() {
      int var1 = I_Ol.III_(3, 5);
      this.IIO0 = 90;

      for (int var2 = 0; var2 < var1; var2++) {
         I___ var3;
         (var3 = new I___()).I_O0 = this.II + I_Ol.IIl0(4);
         var3.I_Oo = this.III + I_Ol.IIl0(5);
         if (this.IIO_ == 0) {
            var3.IIO_ = I_Ol.IIlO(10);
            byte var4 = 1;
            if (var2 % 2 == 0) {
               var4 = -1;
            }

            var3.I_O0 = this.II + I_Ol.IIlO(IIIl[5][0] / 2) * var4;
            var3.I_Oo = this.III - I_Ol.IIlO(IIIl[5][1] / 2);
            var3.IIl_ = new I11o(7);
         }

         this.II_I.addElement(var3);
      }
   }

   private void IIII() {
      this.II = this.IIl.I_o_ + 20 * this.IIl.IOI1;
      this.IIOo = this.II_ / 15;
      if (this.III != null) {
         for (int var1 = 0; var1 < 15; var1++) {
            I___ var2;
            (var2 = new I___()).IIl_ = this.II[0];
            var2.IIlO = this.II[2];
            var2.I_O0 = this.II;
            var2.I_Oo = this.III;
            if (this.III != null) {
               var2.IIOl = this.III.I_O0;
               var2.IIlI = this.III.I_Oo;
               if (this.IoII > 0) {
                  var2.IIOl = var2.IIOl + I_Ol.IIIl(0, this.IoII);
                  var2.IIlI = var2.IIlI + I_Ol.IIIl(0, this.IoII);
               }
            }

            this.I1_0 = I_Ol.III_(9, 12);
            if (var1 == 14) {
               var2.IIl_ = this.II[1];
               var2.IIlO = this.II[3];
               var2.IIOl = this.III.I_O0;
               var2.IIlI = this.III.I_Oo;
               this.I1_0 = 9;
            }

            var2.IIl = false;
            var2.I01o = false;
            var2.I__I = false;
            int var3 = this.I1_0;
            var2.I_0 = var3;
            var3 = var2.IIOl - var2.I_O0;
            int var4 = var2.IIlI - var2.I_Oo;
            int var5 = I_Ol.III1(var3, var4);
            var2.IoII = var2.IIlI(var5);
            int var6;
            if ((var6 = I_Ol.IIIO(var3, var4) / var2.I_0) == 0) {
               var6 = 1;
            }

            var5 = var3 / var6;
            int var7 = var4 / var6;
            if (var5 == 0 && var3 < var6) {
               var5 = var3 < 0 ? -1 : 1;
            }

            if (var7 == 0 && var4 < var6) {
               var7 = var4 < 0 ? -1 : 1;
            }

            if (I_Ol.II1(var5) > I_Ol.II1(var3)) {
               var5 = var3;
            }

            if (I_Ol.II1(var7) > I_Ol.II1(var4)) {
               var7 = var4;
            }

            var2.IIO = var5;
            var2.IIOI = var7;
            this.II_I.addElement(var2);
         }
      } else {
         this.I1l1 = true;
      }
   }

   private void II(int var1, int var2, int var3, int var4) {
      if (this.II0l == -1) {
         this.II_I.removeAllElements();
      }

      this.Il_0 = new int[4];
      if (var3 <= var2) {
         var3 = var2 + 1;
      }

      for (int var11 = 0; var11 < 4; var11++) {
         if (I_Ol.IIlO(2) == 0) {
            this.Il_0[var11] = IIIl[this.I1oI][I_Ol.IIlO(3)];
         } else {
            this.Il_0[var11] = IIIl[this.I1oI][2];
         }
      }

      for (int var12 = 0; var12 < 4; var12++) {
         I1o1 var5 = new I1o1();
         int var6 = 5 + var12 * 45;
         int var7;
         if ((var7 = 45 + var12 * 45 - 5) <= var6) {
            var7 = var6 + 1;
         }

         int var8 = I_Ol.III_(var2, var3);
         int var9 = I_Ol.III_(var1, var1 + 3);
         var6 = I_Ol.III_(var6, var7);
         var7 = I_Ol.III_(13, 23);
         boolean var10 = I_Ol.IIlO(4) == 0;
         var6 = I_Ol.IIl_(var6 % 360);
         var5.II(
            this.I1I - I_Ol.IIll(var6) * (var8 + var7),
            this.Ioll - I_Ol.IIl1(var6) * (var8 + var7),
            this.I1I - I_Ol.IIll(var6) * var7,
            this.Ioll - I_Ol.IIl1(var6) * var7,
            I_Ol.IIll(var6) * var9,
            I_Ol.IIl1(var6) * var9,
            var10
         );
         this.II_I.addElement(var5);
         var5 = new I1o1();
         var6 = I_Ol.IIl_((var6 + 180 + I_Ol.IIIl(2, 5)) % 360);
         var5.II(
            this.I1I - I_Ol.IIll(var6) * (var8 + var7),
            this.Ioll - I_Ol.IIl1(var6) * (var8 + var7),
            this.I1I - I_Ol.IIll(var6) * var7,
            this.Ioll - I_Ol.IIl1(var6) * var7,
            I_Ol.IIll(var6) * var9,
            I_Ol.IIl1(var6) * var9,
            var10
         );
         this.II_I.addElement(var5);
      }
   }

   private void IO11() {
      this.IIlI = new I11o(8);
      this.IIO0 = I_Ol.III_(23, 27);
      int var1 = I_Ol.III_(1, 3);
      this.I1_o = this.III - 40;

      for (int var2 = 0; var2 < var1; var2++) {
         I___ var3;
         (var3 = new I___()).I_O0 = this.II + I_Ol.IIIl(0, 20);
         var3.I_Oo = this.III + I_Ol.IIl0(7);
         if (this.IIO1 == 10) {
            var3.IoII = I_Ol.III_(0, this.IIlI.I_Oo - 2);
         } else if (this.IIO1 == 11) {
            var3.IoII = I_Ol.III_(2, this.IIlI.I_Oo);
         } else {
            var3.IoII = I_Ol.III_(0, this.IIlI.I_Oo);
         }

         I_Ol.IIlO(2);
         var3.IIOI = -I_Ol.III_(1, 4);
         this.II_I.addElement(var3);
      }
   }

   private void IIlI(boolean var1) {
      if (this.II != null) {
         for (int var2 = 0; var2 < this.II.length; var2++) {
            if (this.II[var2] != null) {
               if (this.II[var2].IIO1 == 0) {
                  I_I_ var3;
                  if ((var3 = I1_I.II(this.II[var2].IIO0)) != null) {
                     var3.I_O_ = var1;
                     var3.I0I0 = false;
                     var3.I10I = this.Il__[var2];
                     var3.IIl_ = this.Il_O[var2];
                  }
               } else {
                  I___ var5 = this.II[var2];
                  Ilol var4;
                  if (Ilol.II().IOI_ == var5.IIO0) {
                     var4 = Ilol.II();
                  } else {
                     var4 = I1_I.II(this.II[var2].IIO0);
                  }

                  if (var4 != null) {
                     var4.I_11 = var1;
                     var4.I100 = false;
                     var4.I000 = this.Il__[var2];
                     var4.I00o = this.Il_O[var2];
                  }
               }
            }
         }
      }
   }

   private void IOl_() {
      byte var1 = 0;
      int[] var2 = null;
      int[] var3 = null;
      switch (this.IIO1) {
         case 16:
            var1 = 26;
            if (this.IIO_ == 0) {
               var2 = new int[]{7};
               var3 = new int[]{28};
            }

            if (this.IIO_ == 1) {
               var2 = new int[]{2};
               var3 = new int[]{23};
            }
            break;
         case 17:
            var1 = 25;
            var2 = new int[]{2};
            var3 = new int[]{16};
            break;
         case 18:
            var1 = 24;
            var2 = new int[1];
            var3 = new int[]{9};
            break;
         case 19:
            var1 = 25;
            var2 = new int[1];
            var3 = new int[]{14};
            break;
         case 20:
            var1 = 26;
            var2 = new int[1];
            var3 = new int[]{21};
            break;
         case 21:
            var1 = 24;
            var2 = new int[]{1};
            var3 = new int[]{10};
            break;
         case 22:
            var1 = 25;
            var2 = new int[]{1};
            var3 = new int[]{15};
            break;
         case 23:
            var1 = 26;
            var2 = new int[]{1};
            var3 = new int[]{22};
            break;
         case 24:
            var1 = 24;
            var2 = new int[]{2, 3, 4};
            var3 = new int[]{11, 12, 13};
            break;
         case 25:
            var1 = 25;
            var2 = new int[]{3, 4, 5, 6};
            var3 = new int[]{17, 18, 19, 20};
            break;
         case 26:
            var1 = 26;
            byte var4 = 0;
            byte var5 = 0;
            if (this.IIO_ == 0) {
               var4 = 4;
               var5 = 25;
            } else if (this.IIO_ == 1) {
               var4 = 5;
               var5 = 26;
            } else if (this.IIO_ == 2) {
               var4 = 6;
               var5 = 27;
            }

            var2 = new int[]{var4, 3};
            var3 = new int[]{var5, 24};
      }

      if (var2 != null && var3 != null) {
         this.II = new I11o[var2.length];

         for (int var6 = 0; var6 < var2.length; var6++) {
            I11o var7;
            if ((var7 = IO10.II(Ill("ꞏꞐꡳꡕ꠴ꠄ\ua8c9", 42972) + var1 + Ill("ꞃ", 42972) + this.IIlI + Ill("ꞃ", 42972) + var2[var6])) == null) {
               var7 = new I11o(var3[var6]);
            }

            if (var7 != null) {
               this.II[var6] = var7;
            }
         }
      }
   }

   private void II(IO1l var1, int var2) {
      this.II[0].II(this.II0l / this.II0 % this.II[0].I_Oo, this.II, this.III, this.III1, var2, var1);
   }
}
