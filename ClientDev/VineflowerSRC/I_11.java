package main;

public class I_11 extends Ilol {
   public I_1_ II;
   public static I_1_[] II;
   public boolean IOIo;
   private int lllO;
   private int I_O0;
   public static boolean IOl;
   private static int I_Oo;
   public int[] I111;
   private int I_0;
   private long IlO;
   private long I1II;
   public int lIo0;

   public I_11(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.I1__ = true;
      super.IO_l = var6;
      I_Ol.II__(IlOl("胓肬肘脺腘脮脖臢臔膦臎舲", 32957) + super.IO_l);
      super.I_o_ = var3;
      super.I_oO = var4;
      super.I010 = var3;
      super.I01o = var4;
      super.IOIl = var2;
      if (var1 != -1) {
         this.II = II[var5];
      }

      if (var5 == 23 || var5 == 42) {
         super.IO11 = 45;
      }

      if (var5 == 51) {
         super.I1__ = false;
         this.lllO = var2;
         I_Ol.II__(IlOl("胙肩肚腒腘脭腗膫膕", 32957) + var2);
      }

      if (this.II != null) {
         if (this.II.II1o == null) {
            this.II.II1o = "";
         }

         this.II.II1o = I_Ol.IIIo(this.II.II1o);
      }
   }

   public void II(byte var1, int var2) {
      this.lllO = var1;
      this.IlO = this.I1II = System.currentTimeMillis();
      this.I_0 = var2;
      I_Ol.II__(IlOl("胔育胛腨腘腸脄至臖膻膝艶舌艰", 32957) + this.I_0);
   }

   public static void I00O() {
      for (int var0 = 0; var0 < I1_I.IIOI.size(); var0++) {
         I_11 var1;
         (var1 = (I_11)I1_I.IIOI.elementAt(var0)).III = null;
         var1.I0IO = -1;
      }
   }

   @Override
   public void IIl1() {
      if (this.II.lll0 == 51) {
         this.I1II = System.currentTimeMillis();
         if (this.I1II - this.IlO >= 1000L) {
            this.I_0--;
            this.IlO = this.I1II;
            if (this.I_0 < 0) {
               this.I_0 = 0;
            }
         }
      }

      if (super.I1__) {
         this.IOol();
      }

      label68:
      if (super.III == null) {
         byte[] var1 = new byte[]{-1, 9, 9, 10, 10, 11, 11};
         if (Ilol.II().IOI0 < 9 || Ilol.II().IOI0 > 10 || Ilol.II().II.II0I <= 0 || var1[Ilol.II().II.II0I] != this.II.lll0) {
            I1_I.II();
            byte var2 = I1_I.IIII();
            if (Ilol.II().II != null || var2 != this.II.lll0) {
               if (Ilol.II().II == null || var2 != this.II.lll0) {
                  break label68;
               }

               int var3 = Ilol.II().II.l10l + 1;
               int var4 = Ilol.II().II.IIO1.length;
               super.III = I1_I.II[98];
            }
         } else if (Ilol.II().II == null) {
            super.III = I1_I.II[57];
         } else {
            if (Ilol.II().II == null || Ilol.II().II.l10l + 1 != Ilol.II().II.IIO1.length) {
               break label68;
            }

            super.III = I1_I.II[62];
         }

         super.I0IO = 0;
      }

      super.IIl1();
      if (IOlO.l1oI == 51) {
         if (super.I_o_ > Ilol.II().I_o_) {
            super.IOI1 = -1;
         } else {
            super.IOI1 = 1;
         }

         if (this.II.lll0 % 2 == 0) {
            if (super.IO10 == 1) {
               super.IO10 = 0;
               return;
            }

            super.IO10 = 1;
         }
      }
   }

   @Override
   public void II(IO1l var1) {
      if (!IIoo.II(this, var1) && !Ilol.I10I && !this.IOIo && this.II0l() && super.IOIl != 15) {
         if (super.III0 != 0) {
            super.II(var1);
         } else if (this.II != null) {
            if (this.II.lll0 != 4 && this.II.lll0 != 51 && this.II.lll0 != 50) {
               var1.II(IOlO.IIlI, super.I_o_, super.I_oO, 3);
            }

            if (this.II.lll0 == 3) {
               I_oo.IIII(var1, 265, super.I_o_, super.I_oO, 0, 33);
               if (Ilol.II().II != null && Ilol.II().II.equals(this) && Ilo1.III == null) {
                  var1.II(I_I_.Il0, 0, 0, 9, 6, 0, super.I_o_, super.I_oO - super.IO11 + 4, 33);
               }

               this.I_O0 = 60;
            } else if (this.II.lll0 != 4) {
               if (this.II.lll0 != 50 && this.II.lll0 != 51) {
                  if (this.II.lll0 == 6) {
                     I_oo.IIII(var1, 545, super.I_o_, super.I_oO + 5, 0, 33);
                     if (Ilol.II().II != null && Ilol.II().II.equals(this) && Ilo1.III == null) {
                        var1.II(I_I_.Il0, 0, 0, 9, 6, 0, super.I_o_, super.I_oO - super.IO11 - 9, 33);
                     }

                     IO1I.IIII.II(var1, String.valueOf(IOlO.l1ol), super.I_o_, super.I_oO - super.IO11 + 19 - IO1I.IIlI.IIOl(), 2);
                  } else {
                     int var11 = this.II.lllo;
                     int var3 = this.II.ll1I;
                     int var4 = this.II.ll1;
                     I_O1 var5 = I1_I.II[var11];
                     I_O1 var6 = I1_I.II[var3];
                     I_O1 var7 = I1_I.II[var4];
                     if (super.IOI1 == 1) {
                        I_oo.IIII(
                           var1,
                           var5.II[Ilol.II[super.IO10][0][0]].II1o,
                           super.I_o_ + Ilol.II[super.IO10][0][1] + var5.II[Ilol.II[super.IO10][0][0]].IIO_,
                           super.I_oO - Ilol.II[super.IO10][0][2] + var5.II[Ilol.II[super.IO10][0][0]].II1O,
                           0,
                           0
                        );
                        I_oo.IIII(
                           var1,
                           var6.II[Ilol.II[super.IO10][1][0]].II1o,
                           super.I_o_ + Ilol.II[super.IO10][1][1] + var6.II[Ilol.II[super.IO10][1][0]].IIO_,
                           super.I_oO - Ilol.II[super.IO10][1][2] + var6.II[Ilol.II[super.IO10][1][0]].II1O,
                           0,
                           0
                        );
                        I_oo.IIII(
                           var1,
                           var7.II[Ilol.II[super.IO10][2][0]].II1o,
                           super.I_o_ + Ilol.II[super.IO10][2][1] + var7.II[Ilol.II[super.IO10][2][0]].IIO_,
                           super.I_oO - Ilol.II[super.IO10][2][2] + var7.II[Ilol.II[super.IO10][2][0]].II1O,
                           0,
                           0
                        );
                     } else {
                        I_oo.IIII(
                           var1,
                           var5.II[Ilol.II[super.IO10][0][0]].II1o,
                           super.I_o_ - Ilol.II[super.IO10][0][1] - var5.II[Ilol.II[super.IO10][0][0]].IIO_,
                           super.I_oO - Ilol.II[super.IO10][0][2] + var5.II[Ilol.II[super.IO10][0][0]].II1O,
                           2,
                           24
                        );
                        I_oo.IIII(
                           var1,
                           var6.II[Ilol.II[super.IO10][1][0]].II1o,
                           super.I_o_ - Ilol.II[super.IO10][1][1] - var6.II[Ilol.II[super.IO10][1][0]].IIO_,
                           super.I_oO - Ilol.II[super.IO10][1][2] + var6.II[Ilol.II[super.IO10][1][0]].II1O,
                           2,
                           24
                        );
                        I_oo.IIII(
                           var1,
                           var7.II[Ilol.II[super.IO10][2][0]].II1o,
                           super.I_o_ - Ilol.II[super.IO10][2][1] - var7.II[Ilol.II[super.IO10][2][0]].IIO_,
                           super.I_oO - Ilol.II[super.IO10][2][2] + var7.II[Ilol.II[super.IO10][2][0]].II1O,
                           2,
                           24
                        );
                     }

                     if (IOlO.l1oI != 51) {
                        byte var8 = 15;
                        if (this.II.lll0 == 47) {
                           var8 = 47;
                        }

                        if (Ilol.II().II != null && Ilol.II().II.equals(this) && Ilo1.III == null) {
                           byte var9 = 0;
                           byte var10 = 0;
                           if (Ilol.II().II.II.lll0 == 28 || Ilol.II().II.II.lll0 == 41) {
                              var9 = 3;
                              var10 = -12;
                           }

                           var1.II(I_I_.Il0, 0, 0, 9, 6, 0, super.I_o_ + var9, super.I_oO - super.IO11 - (var8 - 8) + var10, 33);
                        }
                     }

                     this.I_O0 = 65;
                  }
               } else if (this.I111 != null) {
                  if (this.II.lll0 == 50 && IOl) {
                     I_Oo++;
                     if (II.IIIO % 3 == 0) {
                        I1lI.III(new I1ll(19, super.I_o_ + I_Ol.III_(-50, 50), super.I_oO, 2, 1, -1));
                     }

                     if (II.IIIO % 15 == 0) {
                        I1lI.III(new I1ll(18, super.I_o_ + I_Ol.III_(-5, 5), super.I_oO + I_Ol.III_(-90, 0), 2, 1, -1));
                     }

                     if (I_Oo == 100) {
                        I1_I.II().IIl(super.I_o_, super.I_oO);
                     }

                     if (I_Oo == 110) {
                        IOl = false;
                        this.II.lll0 = 4;
                     }
                  }

                  int var2 = 0;
                  if (I_oo.II[this.I111[this.lllO]] != null && I_oo.II[this.I111[this.lllO]].I1I1 != null) {
                     var2 = IO1l.III(I_oo.II[this.I111[this.lllO]].I1I1);
                  }

                  I_oo.IIII(var1, this.I111[this.lllO], super.I_o_ + I_Ol.III_(-1, 1), super.I_oO, 0, 33);
                  if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                     if (Ilo1.III == null) {
                        var1.II(I_I_.Il0, 0, 0, 9, 6, 0, super.I_o_, super.I_oO - super.IO11 - 9 + 16 - var2, 33);
                     }

                     IO1I.IIII.II(var1, I_1l.III_(this.I_0), super.I_o_, super.I_oO - super.IO11 - 16 - IO1I.IIlI.IIOl() - 20 - var2 + 16, 2, IO1I.III_);
                  } else {
                     IO1I.IIII.II(var1, I_1l.III_(this.I_0), super.I_o_, super.I_oO - super.IO11 - 8 - IO1I.IIlI.IIOl() - 20 - var2 + 16, 2, IO1I.III_);
                  }
               }
            }

            if (super.I0IO >= 0 && super.III != null && super.III0 == 0) {
               I_oo.IIII(
                  var1, super.III.II[super.I0IO].I_Oo, super.I_o_ + super.III.II[super.I0IO].II0I, super.I_oO + super.III.II[super.I0IO].I_O0 - this.I_O0, 0, 3
               );
               if (II.IIIO % 2 == 0) {
                  super.I0IO++;
                  if (super.I0IO >= super.III.II.length) {
                     super.I0IO = 0;
                  }
               }
            }
         }
      }
   }

   @Override
   public void IIII(IO1l var1) {
      if (!Ilol.I10I && !this.IOIo && this.II0l() && super.IOIl != 15 && this.II != null) {
         if (this.II.lll0 == 3) {
            if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
               IO1I.IIl_.II(var1, this.II.II1o, super.I_o_, super.I_oO - super.IO11 - IO1I.IIlI.IIOl() - 5, 2, IO1I.IIlO);
            } else {
               IO1I.IIl_.II(var1, this.II.II1o, super.I_o_, super.I_oO - super.IO11 - 3 - IO1I.IIlI.IIOl(), 2, IO1I.IIlO);
            }

            this.I_O0 = 60;
         } else if (this.II.lll0 != 4) {
            if (this.II.lll0 != 50 && this.II.lll0 != 51) {
               if (this.II.lll0 == 6) {
                  if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                     IO1I.IIl_.II(var1, this.II.II1o, super.I_o_, super.I_oO - super.IO11 - IO1I.IIlI.IIOl() - 16, 2, IO1I.IIlO);
                     return;
                  }

                  IO1I.IIl_.II(var1, this.II.II1o, super.I_o_, super.I_oO - super.IO11 - 8 - IO1I.IIlI.IIOl(), 2, IO1I.IIlO);
                  return;
               }

               if (IOlO.l1oI != 51) {
                  byte var5 = 15;
                  if (this.II.lll0 == 47) {
                     var5 = 47;
                  }

                  if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                     if (IOlO.l1oI != 113) {
                        byte var7 = 0;
                        byte var8 = 0;
                        if (Ilol.II().II.II.lll0 == 28 || Ilol.II().II.II.lll0 == 41) {
                           var7 = 3;
                           var8 = -12;
                        }

                        IO1I.IIl_.II(var1, this.II.II1o, super.I_o_ + var7, super.I_oO - super.IO11 - IO1I.IIlI.IIOl() - var5 + var8, 2, IO1I.IIlO);
                     }
                  } else {
                     var5 = 8;
                     if (this.II.lll0 == 47) {
                        var5 = 40;
                     }

                     if (IOlO.l1oI != 113) {
                        byte var3 = 0;
                        byte var4 = 0;
                        if (this.II.lll0 == 28 || this.II.lll0 == 41) {
                           var3 = 3;
                           var4 = -12;
                        }

                        IO1I.IIl_.II(var1, this.II.II1o, super.I_o_ + var3, super.I_oO - super.IO11 - var5 - IO1I.IIlI.IIOl() + var4, 2, IO1I.IIlO);
                     }
                  }
               }

               this.I_O0 = 65;
            } else if (this.I111 != null) {
               int var2 = 0;
               if (I_oo.II[this.I111[this.lllO]] != null && I_oo.II[this.I111[this.lllO]].I1I1 != null) {
                  var2 = IO1l.III(I_oo.II[this.I111[this.lllO]].I1I1);
               }

               if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
                  IO1I.IIl_.II(var1, this.II.II1o, super.I_o_, super.I_oO - super.IO11 - IO1I.IIlI.IIOl() - var2, 2, IO1I.IIlO);
                  return;
               }

               IO1I.IIl_.II(var1, this.II.II1o, super.I_o_, super.I_oO - super.IO11 - 8 - IO1I.IIlI.IIOl() - var2 + 16, 2, IO1I.IIlO);
               return;
            }
         }
      }
   }

   @Override
   public void I__o() {
      super.IOIl = 15;
      Ilol.II = null;
   }

   static {
      int[] var10000 = new int[]{1, -1, 1, -1};
      var10000 = new int[]{1, -1, -1, 1};
   }
}
