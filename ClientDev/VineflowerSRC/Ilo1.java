package main;

import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class Ilo1 extends I1l1 implements I1_1 {
   public int II0I = 100;
   public int I_O0;
   public int I_Oo;
   public String[] IIIO;
   public int IIO;
   public int IIOI;
   public int IIOl;
   public int IIlI;
   public I_11 III;
   private static long Il_O;
   private static long Il_0;
   private int I1_o;
   private String[] III0;
   public I1Il IIII;
   public I1Il IIIl;
   public I1Il III1;
   public static Ilo1 III;
   public static Ilo1 IIII;
   private static String II0_;
   private static I_11 IIII;
   public byte II1l = 0;
   public byte II11 = 0;
   public static I_O_ II;
   private static boolean I_1_;
   private int I1O_;
   private static int I1OO;
   private int I1O0;
   public static int IIIl = 7;
   private int I1Oo = 0;
   private int I10 = 0;
   private int I10I = 0;
   private Image II1I;
   public int III1;
   public boolean I_1O = false;
   public static int II0l;
   private int I10l = 0;
   private int I101 = 0;

   public static void II(String var0, I_11 var1) {
      II0_ = var0;
      IIII = var1;
      if (III == null) {
         III(II0_, 100000, IIII);
         II0_ = null;
         IIII = null;
      }
   }

   public static void II(String var0, int var1, I_11 var2) {
      I1_I.II.IIII(var0, 0);
   }

   public static void III(String var0, int var1, I_11 var2) {
      I1_I.II.IIII(var0, 0);
   }

   public static Ilo1 II(String var0, int var1, I_11 var2) {
      I_Ol.II__(IIoI("\ud877\ud811\ud830\ud8b3\ud8e2\ud89e\ud8a0", 55350));
      I_Ol.II__(Ilol.II().II != null ? IIoI("\ud817\ud83b\ud801\ud8ff\ud8de", 55350) : IIoI("\ud858\ud820\ud818\ud8ff", 55350));
      I1OO = 10;
      Ilo1 var3;
      (var3 = new Ilo1()).II0I = II.IIl - 30 - (II.II.IOol ? II.II.I_Oo : 0);
      if (var3.II0I > 320) {
         var3.II0I = 320;
      }

      if (var0.length() < 10) {
         var3.II0I = 64;
      }

      if (II.IIl == 128) {
         var3.II0I = 128;
      }

      var3.IIIO = IO1I.IIl0.II(var0, var3.II0I - 10);
      var3.I_O0 = var1;
      var3.III = var2;
      Ilol.II = var3;
      var3.IIOl = 15 - var3.I_Oo + var3.IIIO.length * 12 + 10;
      if (var3.IIOl > II.IIlI - 80) {
         var3.IIOl = II.IIlI - 80;
      }

      I1l1.II1_.addElement(var3);
      I_1_ = false;
      if (var2 != null && var2.IOI_ == 5) {
         I_1_ = true;
         I1_I.II.IIII("", 1);
      }

      Il_O = Il_0 = IO10.IIII();
      return var3;
   }

   public static Ilo1 II(String var0, int var1, I_11 var2, int var3) {
      I_Ol.II__(IIoI("\ud877\ud811\ud830\ud8b3\ud8e2\ud89e\ud8a0", 55350));
      I_Ol.II__(Ilol.II().II != null ? IIoI("\ud817\ud83b\ud801\ud8ff\ud8de", 55350) : IIoI("\ud858\ud820\ud818\ud8ff", 55350));
      I1OO = 10;
      Ilo1 var4;
      (var4 = new Ilo1()).II0I = II.IIl - 30 - (II.II.IOol ? II.II.I_Oo : 0);
      if (var4.II0I > 320) {
         var4.II0I = 320;
      }

      if (var0.length() < 10) {
         var4.II0I = 64;
      }

      if (II.IIl == 128) {
         var4.II0I = 128;
      }

      var4.IIIO = IO1I.IIl0.II(var0, var4.II0I - 10);
      var4.I_O0 = 100000;
      var4.III = var2;
      var4.I1O_ = 5820;
      Ilol.II = var4;
      var4.IIOl = 15 - var4.I_Oo + var4.IIIO.length * 12 + 10;
      if (var4.IIOl > II.IIlI - 80) {
         var4.IIOl = II.IIlI - 80;
      }

      I1l1.II1_.addElement(var4);
      I_1_ = false;
      if (var2 != null && var2.IOI_ == 5) {
         I_1_ = true;
         I1_I.II.IIII("", 1);
      }

      var4.IIOl += 15;
      Il_O = Il_0 = IO10.IIII();
      return var4;
   }

   @Override
   public void IIlO() {
      if (II != null) {
         I1_I.II.IO0 = false;
         II.IOlI();
      } else {
         I1_I.II.IO0 = true;
      }

      if (II.II.IOol) {
         this.III1 = 0;
         this.IIO = II.IIl / 2 - this.II0I / 2 - 1;
         this.IIOI = II.II.I_0 - this.IIOl;
      } else {
         this.III1 = 0;
         if (I1_I.II().IIl == null && I1_I.II().IIIo == null && I1_I.II().III0 == null && this.IIII == null && this.IIIl == null) {
            this.IIO = II.IIl / 2 - this.II0I / 2 - 1;
            this.IIOI = II.IIlI - 5 - this.IIOl;
         } else {
            this.III1 = 5;
            this.IIO = II.IIl / 2 - this.II0I / 2 - 1;
            this.IIOI = II.IIlI - 20 - this.IIOl;
         }
      }

      if (this.I_O0 > 0) {
         this.I_O0--;
      }

      if (I1OO > 0) {
         I1OO--;
      } else {
         I1_I.II.III.IIO = 0;

         for (int var1 = 0; var1 < I1_I.II.III.IIOO.size(); var1++) {
            if (((I1O0)I1_I.II.III.IIOO.elementAt(var1)).I_O0 != 70) {
               ((I1O0)I1_I.II.III.IIOO.elementAt(var1)).I_O0 = 10;
            }
         }
      }

      if (this.I_Oo > 1) {
         this.I_Oo--;
      }

      if (this.III != null && Ilol.II != null && Ilol.II != this || this.III != null && Ilol.II == null || this.I_O0 <= 0) {
         I1l1.II10.removeElement(this);
         I1l1.II1_.removeElement(this);
      }
   }

   @Override
   public void III_(IO1l var1) {
      if (!I1_I.II().I1_1 || !I1_I.II().IO1I) {
         II.II(var1);
         int var2 = this.IIO;
         int var3 = this.IIOI;
         int var4 = this.II0I + 2;
         int var5 = this.IIOl;
         if (var2 > 0 && var3 > 0 || II.II.I_10) {
            I__O.II(var1, var2, var3, var4, var5, 16777215, false);
            if (this.III != null) {
               byte var6;
               if (II.IIIO % 10 > 2) {
                  var6 = 0;
               } else {
                  var6 = 1;
               }

               I_oo.IIII(var1, this.III.IO_l, this.IIO + 14, this.IIOI + var6, 0, IOII.l1OO);
            }

            if (this.I1O_ != 0) {
               byte var16;
               if (II.IIIO % 10 > 2) {
                  var16 = 0;
               } else {
                  var16 = 1;
               }

               I_oo.IIII(var1, this.I1O_, this.IIO + var4 / 2, this.IIOI + this.IIOl - 15 + var16, 0, IOII.IIOI);
            }

            if (II != null) {
               var1.IIIO(var2, var3, var4, var5 - 16);
               var1.IIl0(0, -II.I_0);
            }

            int var7 = 0;
            int var8 = 0;
            if (this.I_1O) {
               var7 = var1.IIO1();
               var8 = var1.IIO_();
               var1.IIIO(var2, var3 + 1, var4, var5 - 17);
               var1.IIl0(0, -II0l);
            }

            int var9 = -1;

            for (int var10 = 0; var10 < this.IIIO.length; var10++) {
               if (this.IIIO[var10].startsWith(IIoI("\ud81b\ud878", 55350))) {
                  var1.Illl(0);
                  var1.III_(var2 + 10, this.IIOI + this.I_Oo + var10 * 12 + 6, var4 - 20, 1);
               } else {
                  IO1I var11 = IO1I.IIlI;
                  int var12 = 2;
                  String var13 = this.IIIO[var10];
                  int var14;
                  if (this.IIIO[var10].startsWith(IIoI("\ud84a", 55350))) {
                     String[] var15;
                     if ((var15 = I_Ol.II(this.IIIO[var10], IIoI("\ud84a", 55350), 0)).length == 3) {
                        var13 = var15[2];
                     }

                     if (var15.length == 4) {
                        var13 = var15[3];
                        var12 = Integer.parseInt(var15[2]);
                     }

                     var9 = var14 = Integer.parseInt(var15[1]);
                  } else {
                     var14 = var9;
                  }

                  switch (var14) {
                     case -1:
                        var11 = IO1I.IIlI;
                        break;
                     case 0:
                        var11 = IO1I.III_;
                        break;
                     case 1:
                        var11 = IO1I.III0;
                        break;
                     case 2:
                        var11 = IO1I.III;
                        break;
                     case 3:
                        var11 = IO1I.IIl0;
                        break;
                     case 4:
                        var11 = IO1I.II1;
                        break;
                     case 5:
                        var11 = IO1I.IIlo;
                     case 6:
                     default:
                        break;
                     case 7:
                        var11 = IO1I.II;
                        break;
                     case 8:
                        var11 = IO1I.IIIl;
                        break;
                     case 9:
                        var11 = IO1I.IIIl;
                        break;
                     case 10:
                        var11 = IO1I.IIlO;
                  }

                  if (this.IIIO[var10].startsWith(IIoI("\ud80a", 55350))) {
                     String[] var25 = I_Ol.II(I_Ol.II(this.IIIO[var10], IIoI("\ud80a", 55350), 0)[1], IIoI("\ud808", 55350), 1);
                     if (this.I1O0 == 0) {
                        this.I1O0 = Integer.parseInt(var25[1]);
                     } else if ((Il_O = IO10.IIII()) - Il_0 >= 1000L) {
                        Il_0 = Il_O;
                        this.I1O0--;
                     }

                     var13 = this.I1O0 + IIoI("\ud816", 55350) + var25[2];
                     var11.II(var1, var13, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + var10 * 12 - this.III1 + 12, var12);
                  } else {
                     if (var12 == 2) {
                        var11.II(var1, var13, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + var10 * 12 - this.III1 + 12, var12);
                     }

                     if (var12 == 1) {
                        var11.II(var1, var13, this.IIO + this.II0I - 5, this.IIOI + this.I_Oo + var10 * 12 - this.III1 + 12, var12);
                     }
                  }
               }
            }

            if (this.I_1O) {
               II.II(var1);
               var1.IIl0(var7, var8);
            }

            if (this.II11 > 4) {
               this.I10 = (this.II11 + 1) / 2;
               this.I1Oo = this.II11 - this.I10;

               for (int var19 = 0; var19 < this.I10; var19++) {
                  var1.II(I_1o.Il00, var2 + var4 / 2 - this.I10 * 20 / 2 + var19 * 20 + IO1l.II(I_1o.Il00), var3 + var5 - 17, 3);
               }

               for (int var20 = 0; var20 < this.I1Oo; var20++) {
                  var1.II(I_1o.Il00, var2 + var4 / 2 - this.I1Oo * 20 / 2 + var20 * 20 + IO1l.II(I_1o.Il00), var3 + var5 - 8, 3);
               }

               if (this.II1l > 0) {
                  this.II1I = I_1o.Il0O;
                  if (this.II1l < this.I10) {
                     for (int var23 = 0; var23 < this.II1l; var23++) {
                        var1.II(this.II1I, var2 + var4 / 2 - this.I10 * 20 / 2 + var23 * 20 + IO1l.II(this.II1I), var3 + var5 - 17, 3);
                     }
                  } else {
                     this.I10I = this.II1l - this.I10;

                     for (int var21 = 0; var21 < this.I10; var21++) {
                        var1.II(this.II1I, var2 + var4 / 2 - this.I10 * 20 / 2 + var21 * 20 + IO1l.II(this.II1I), var3 + var5 - 17, 3);
                     }

                     for (int var22 = 0; var22 < this.I10I; var22++) {
                        if (var22 + this.I10 >= IIIl) {
                           this.II1I = I_1o.Il0o;
                        }

                        var1.II(this.II1I, var2 + var4 / 2 - this.I1Oo * 20 / 2 + var22 * 20 + IO1l.II(this.II1I), var3 + var5 - 8, 3);
                     }
                  }
               }
            } else {
               for (int var17 = 0; var17 < this.II11; var17++) {
                  var1.II(I_1o.Il00, var2 + var4 / 2 - this.II11 * 20 / 2 + var17 * 20 + IO1l.II(I_1o.Il00), var3 + var5 - 13, 3);
               }

               if (this.II1l > 0) {
                  for (int var18 = 0; var18 < this.II1l; var18++) {
                     var1.II(I_1o.Il0O, var2 + var4 / 2 - this.II11 * 20 / 2 + var18 * 20 + IO1l.II(I_1o.Il0O), var3 + var5 - 13, 3);
                  }
               }
            }

            var1.IIl0(-var1.IIO1(), -var1.IIO_());
            var1.IIIO(0, 0, II.IIl, II.IIlI);
            if (this.IIII != null) {
               I_10.II(var1, (I1Il)null, this.IIII, (I1Il)null);
            }

            if (this.IIIl != null) {
               I_10.II(var1, this.IIIl, (I1Il)null, this.III1);
            }
         }
      }
   }

   public void II(IO1l var1, int var2) {
      int var3 = this.IIO;
      int var4 = this.IIOI;
      int var5 = this.II0I;
      int var6 = var1.IIO1();
      int var7 = var1.IIO_();
      var1.IIl0(0, -var2);
      if (var3 > 0 && var4 > 0 || II.II.I_10) {
         var2 = -1;

         for (int var14 = 0; var14 < this.IIIO.length; var14++) {
            if (this.IIIO[var14].startsWith(IIoI("\ud81b\ud878", 55350))) {
               var1.Illl(16777215);
               var1.III_(var3 + 10, this.IIOI + this.I_Oo + var14 * 12 - 6, var5 - 20, 1);
            } else {
               IO1I var8 = IO1I.II1I;
               int var9 = 2;
               String var10 = this.IIIO[var14];
               int var11;
               if (this.IIIO[var14].startsWith(IIoI("\ud84a", 55350))) {
                  String[] var12;
                  if ((var12 = I_Ol.II(this.IIIO[var14], IIoI("\ud84a", 55350), 0)).length == 3) {
                     var10 = var12[2];
                  }

                  if (var12.length == 4) {
                     var10 = var12[3];
                     var9 = Integer.parseInt(var12[2]);
                  }

                  var2 = var11 = Integer.parseInt(var12[1]);
               } else {
                  var11 = var2;
               }

               switch (var11) {
                  case -1:
                     var8 = IO1I.II1I;
                     break;
                  case 0:
                     var8 = IO1I.IIII;
                     break;
                  case 1:
                     var8 = IO1I.III0;
                     break;
                  case 2:
                     var8 = IO1I.II;
               }

               if (this.IIIO[var14].startsWith(IIoI("\ud80a", 55350))) {
                  String[] var16 = I_Ol.II(I_Ol.II(this.IIIO[var14], IIoI("\ud80a", 55350), 0)[1], IIoI("\ud808", 55350), 1);
                  if (this.I1O0 == 0) {
                     this.I1O0 = Integer.parseInt(var16[1]);
                  } else if ((Il_O = IO10.IIII()) - Il_0 >= 1000L) {
                     Il_0 = Il_O;
                     this.I1O0--;
                  }

                  var10 = this.I1O0 + IIoI("\ud816", 55350) + var16[2];
                  var8.II(var1, var10, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + var14 * 12 - this.III1, var9);
               } else {
                  if (var9 == 2) {
                     var8.II(var1, var10, this.IIO + this.II0I / 2, this.IIOI + this.I_Oo + var14 * 12 - this.III1, var9);
                  }

                  if (var9 == 1) {
                     var8.II(var1, var10, this.IIO + this.II0I - 5, this.IIOI + this.I_Oo + var14 * 12 - this.III1, var9);
                  }
               }
            }
         }

         II.II(var1);
         var1.IIl0(var6, var7);
      }
   }

   private void IIO(int var1) {
      if ((II0l += var1 * 12) < 0) {
         II0l = 0;
      }

      if (II0l > this.IIlI) {
         II0l = this.IIlI;
      }
   }

   public void IOlI() {
      if (this.I_1O) {
         if (II.II[8]) {
            II.II[8] = false;
            this.IIO(1);
         }

         if (II.II[2]) {
            II.II[2] = false;
            this.IIO(-1);
         }

         if (II.II(this.IIO, 0, this.II0I + 2, this.IIOl)) {
            if (II.IIl) {
               if (this.I101 == 0) {
                  this.I101 = II.III;
               }

               this.I10l = this.I101 - II.III;
               if (this.I10l != 0) {
                  II0l = II0l + this.I10l;
                  this.I101 = II.III;
               }

               if (II0l < 0) {
                  II0l = 0;
               }

               if (II0l > this.IIlI) {
                  II0l = this.IIlI;
               }
            } else {
               this.I101 = 0;
               this.I101 = 0;
            }
         }
      }

      if (II != null) {
         if (II.IIIl) {
            II.II();
         }

         if (II.IIII[2]) {
            I_O_ var1 = II;
            var1.I_O0 -= 12;
            if (II.I_O0 < 0) {
               II.I_O0 = 0;
            }
         }

         if (II.IIII[8]) {
            II.II[8] = false;
            I_O_ var2 = II;
            var2.I_O0 += 12;
            if (II.I_O0 > II.IIO0) {
               II.I_O0 = II.IIO0;
            }
         }
      }

      if (II.II[5] || IO1_.II(II.II.III0)) {
         II.II[5] = false;
         IO1_.l_l = -1;
         if (this.IIII != null) {
            this.IIII.I0lO();
         } else if (this.IIIl != null) {
            this.IIIl.I0lO();
         } else if (this.III1 != null) {
            this.III1.I0lO();
         }
      }

      if (II == null || !II.I__I) {
         if (this.IIIl != null && (II.II[12] || II.II[5] || IO1_.II(this.IIIl))) {
            II.II[12] = false;
            II.II[5] = false;
            II.III0 = false;
            II.IIIo = false;
            this.IIIl.I0lO();
            IO1_.l_l = -1;
         }

         if (this.III1 != null && (II.II[13] || IO1_.II(this.III1))) {
            II.II[13] = false;
            II.III0 = false;
            II.IIIo = false;
            this.III1.I0lO();
            IO1_.l_l = -1;
         }
      }
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 1000) {
         try {
            GameMidlet.II.platformRequest((String)var2);
         } catch (Exception var5) {
            var5.printStackTrace();
         }

         GameMidlet.II.notifyDestroyed();
         II.III_();
      }

      if (var1 == 1001) {
         II = null;
         Ilol.II = null;
         IIII = null;
         I1_I.II.IO0 = true;
         Ilol.I10 = false;
         if (I_1_) {
            I1_I.II.III.IIO = 0;
            I1_I.II.III.II.I_O0 = 10;
         }
      }

      if (var1 == 8000) {
         if (I1OO > 0) {
            return;
         }

         int var3 = III.I1_o;
         if (++var3 >= III.III0.length) {
            Ilol.II = null;
            III = null;
            I1_I.II.IO0 = true;
            Ilol.I10 = false;
            if (II0_ != null) {
               III(II0_, 100000, IIII);
               II0_ = null;
               IIII = null;
               return;
            }

            if (I_1_) {
               I1_I.II.III.IIO = 0;

               for (int var6 = 0; var6 < I1_I.II.III.IIOO.size(); var6++) {
                  if (((I1O0)I1_I.II.III.IIOO.elementAt(var6)).I_O0 == 10000000) {
                     ((I1O0)I1_I.II.III.IIOO.elementAt(var6)).I_O0 = 10;
                  }
               }
            }

            return;
         }

         Ilo1 var4;
         (var4 = II(III.III0[var3], III.I_O0, III.III)).I1_o = var3;
         var4.III0 = III.III0;
         var4.IIII = III.IIII;
         III = var4;
      }
   }
}
