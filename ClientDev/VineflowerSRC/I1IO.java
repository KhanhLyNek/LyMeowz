package main;

import javax.microedition.lcdui.Image;

public final class I1IO extends IO1_ implements I1_1 {
   public static I1IO II;
   private Il00[] II;
   private byte II1O = 0;
   private byte II10;
   private int IIO;
   private int IIOI;
   private int IIOl;
   private int IIlI;
   private int IIO1;
   private int IIO_;
   private int IoII;
   private int IIO0;
   private int IIOo;
   private int II0;
   private int II;
   private int III;
   private int IIII;
   private int IIIl;
   private int III1;
   private int III_;
   private int II0l = 0;
   private int Iol = 0;
   private int IIl;
   private int I1;
   private int[] Il1l;
   private int[] Il11;
   private int[] Il1_;
   private int[] Il1O;
   private short[] III1;
   private long IlOl;
   private long IlO1;
   private boolean I__O;
   private boolean I__0;
   private boolean I_1_;
   private short II1_;
   private static int I1OO;
   private static int[] Il10;
   private static I11o IIIo;
   private static I11o IIl;
   private static Image II1;
   private static Image II1I;
   private byte[] III0 = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
   private byte[] IIIo = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};

   public I1IO() {
      (Il10 = new int[2])[0] = 16;
      I1OO = II.IIlI - 41;
      Il10[1] = II.IIl - 40;
      Image var1 = IO10.IIII(IlII("쑍쓤쒏쓚쒁쓌씲앋씴씞", 50274));
      IIIo = new I11o(var1, 30, 30);
      var1 = IO10.IIII(IlII("쑍쓤쒏쓚쒁쓍씲앋씴씞", 50274));
      IIl = new I11o(var1, 68, 65);
      var1 = IO10.IIII(IlII("쑍쓤쒏쓚쒁쓏씲앋씴씞", 50274));
      new I11o(var1, 66, 70);
      II1I = IO10.IIII(IlII("쑍쓤쒏쓑쒫쒉씮씕씪씗엿", 50274));
      II1 = IO10.IIII(IlII("쑍쓤쒏쓑쒫쒉씯씕씪씗엿", 50274));
      this.IIII = 230;
      this.II = II.IIll - this.IIII / 2;
      this.IIIl = 40;
      this.III = -this.IIIl;
   }

   public static I1IO II() {
      if (II == null) {
         II = new I1IO();
      }

      return II;
   }

   public void II(short[] var1, byte var2, int var3, short var4) {
      if (var1 != null && var1.length > 0) {
         this.IoII = Ilol.II().I_oO - 10;
         this.IIO = II.IIl1 / 3 + 10;
         if (this.IIO > 50) {
            this.IIO = 50;
         }

         this.IIOI = 360;
         I1_I.Io1 = I1_I.Io_ / 2;
         this.IIOl = I1_I.Io1I + II.IIl1 / 3 + 30;
         this.IIO_ = 175;
         this.IIlI = 0;
         this.IIO1 = 360 / this.IIO_;
         this.Il1l = new int[this.IIO_];
         this.Il11 = new int[this.IIO_];
         this.Il1_ = new int[this.IIO_];
         this.Il1O = new int[this.IIO_];
         I1IO var5 = this;
         if (!II.II) {
            for (int var6 = 0; var6 < var5.Il11.length; var6++) {
               var5.Il11[var6] = I_Ol.II1(var5.IIO * I_Ol.IIll(var5.IIlI) / 1024);
               var5.Il1l[var6] = I_Ol.II1(var5.IIO * I_Ol.IIl1(var5.IIlI) / 1024);
               if (var5.IIlI < 90) {
                  var5.Il1_[var6] = var5.IIOI + var5.Il1l[var6];
                  var5.Il1O[var6] = var5.IIOl - var5.Il11[var6];
               } else if (var5.IIlI >= 90 && var5.IIlI < 180) {
                  var5.Il1_[var6] = var5.IIOI - var5.Il1l[var6];
                  var5.Il1O[var6] = var5.IIOl - var5.Il11[var6];
               } else if (var5.IIlI >= 180 && var5.IIlI < 270) {
                  var5.Il1_[var6] = var5.IIOI - var5.Il1l[var6];
                  var5.Il1O[var6] = var5.IIOl + var5.Il11[var6];
               } else {
                  var5.Il1_[var6] = var5.IIOI + var5.Il1l[var6];
                  var5.Il1O[var6] = var5.IIOl + var5.Il11[var6];
               }

               var5.IIlI = var5.IIlI + var5.IIO1;
            }
         }

         this.II = new Il00[var1.length];

         for (int var8 = 0; var8 < this.II.length; var8++) {
            this.II[var8] = new Il00();
            this.II[var8].IIO1 = var1[var8];
            this.II[var8].IIO = var8 * 25;
            this.II[var8].I_0 = -999;
            this.II[var8].IIOl = I_Ol.III_(2, 5);
            this.II[var8].IIlI = I_Ol.III_(-1, 2);
            Il00 var7;
            (var7 = this.II[var8]).IIII = new Ilol();
            var7.IIII.IOI_ = I_Ol.III_(-999, -800);
            var7.IIII.I0 = -1;
            var7.IIII.I0II = -1;
            var7.IIII.I0I = -1;
            var7.IIII.I0Il = -1;
            var7.IIII.IIO1 = "";
            var7.IIII.IOl_ = var7.IIII.IOlo = 20;
         }

         this.I__0 = false;
         this.I__O = false;
         this.I_1_ = false;
         this.IlOl = II.II + I_Ol.III_(1000, 2000);
         this.II1O = 0;
         this.IIO0 = -1;
         this.IIOo = -1;
         this.II10 = var2;
         this.III1 = var3;
         this.III_ = 0;
         Ilol.II().III(470, 408, 1);
         Ilol.II().IOI1 = 2;
         Ilol.II().IOIl = 1;
         this.II0l = 0;
         this.Iol = 0;
         this.IIl = 0;
         this.I1 = 0;
         this.III = -this.IIIl;
         this.II1_ = var4;
         this.II0 = 0;
         this.IOlO();
         this.I0l_();
         IO.II();
      }
   }

   @Override
   public void II(int var1, Object var2) {
   }

   @Override
   public void IIlO() {
      try {
         this.III_ = this.III1 * this.III();
         this.IOlO();
         I1_I.II().IIlO();
         if (this.IlOl - II.II > 0L) {
            for (int var16 = 0; var16 < this.II.length; var16++) {
               Il00 var11 = this.II[var16];
               var11.IIO += 2;
               if (this.II[var16].IIO >= this.IIO_) {
                  this.II[var16].IIO = 0;
               }

               this.II[var16].II0I = this.Il1_[this.II[var16].IIO];
               this.II[var16].I_O0 = this.Il1O[this.II[var16].IIO];
            }

            return;
         }

         if (this.II1O == 0) {
            this.II1O = 1;
         }

         if (this.II1O == 1) {
            for (int var2 = 0; var2 < this.II.length; var2++) {
               if (this.II[var2].I_0 != -999 && !this.II[var2].I1lI) {
                  if (this.II[var2].I_O0 < this.II[var2].I_0) {
                     if (this.II[var2].IIOI < 0) {
                        this.II[var2].IIOI = 0;
                     }

                     if (this.II[var2].I_O0 + this.II[var2].IIOI > this.II[var2].I_0) {
                        this.II[var2].I_O0 = this.II[var2].I_0;
                     } else {
                        Il00 var1 = this.II[var2];
                        var1.I_O0 = var1.I_O0 + this.II[var2].IIOI;
                     }

                     this.II[var2].IIOI++;
                  } else {
                     if (this.II[var2].IIOI > 0) {
                        this.II[var2].IIOI = 0;
                     }

                     Il00 var5 = this.II[var2];
                     var5.I_O0 = var5.I_O0 + this.II[var2].IIOI;
                     this.II[var2].IIOI--;
                  }

                  if (this.II[var2].I_O0 == this.II[var2].I_0) {
                     I1lI.III(new I1ll(19, this.II[var2].II0I - 5, this.II[var2].I_O0 + 25, 2, 1, -1));
                     IO.II();
                     this.II[var2].I1lI = true;
                     if (!this.I__0) {
                        this.I__0 = true;
                     }
                  }
               }
            }
         }

         if (this.II1O == 2) {
            for (int var12 = 0; var12 < this.II.length; var12++) {
               if (!this.II[var12].I1lI) {
                  if (this.II[var12].I_O0 > -10) {
                     if (this.II[var12].IIOI > 0) {
                        this.II[var12].IIOI = 0;
                     }

                     Il00 var6 = this.II[var12];
                     var6.I_O0 = var6.I_O0 + this.II[var12].IIOI;
                     this.II[var12].IIOI--;
                     var6 = this.II[var12];
                     var6.II0I = var6.II0I + this.II[var12].IIOl * this.II[var12].IIlI;
                     var6 = this.II[var12];
                     var6.IIOl -= 3;
                  }

                  if (this.II[var12].I_O0 == -10) {
                     this.II[var12].I1l = false;
                  }
               }
            }

            this.II0l++;
            if (this.II0l > this.III0.length - 1) {
               this.II0l = this.III0.length - 1;
               this.I__O = true;
               IO.II();
               if (!this.I_1_ && this.IlO1 - II.II < 0L) {
                  I_0_.II().IIIl((byte)2, (byte)(this.II() + this.III()));
                  this.I_1_ = true;
               }
            }

            Ilol.II().IO10 = this.III0[this.II0l];
            this.Iol++;
            if (this.Iol > 5) {
               this.Iol = 0;
            }

            this.IIl = this.IIIo[this.Iol];
         }

         if (this.II1O == 3) {
            if (this.Iol <= 5) {
               this.Iol = 5;
            }

            this.Iol++;
            if (this.Iol > this.IIIo.length - 1) {
               this.Iol = this.IIIo.length - 1;
               this.II1O = 4;
               this.I__O = false;
               int var13 = 0;

               for (int var3 = 0; var3 < this.II.length; var3++) {
                  if (this.II[var3].I1lI && !this.II[var3].I1ll) {
                     this.II[var3].IIO1 = this.III1[var13];
                     this.II[var3].I1ll = true;
                     var13++;
                  }
               }
            }

            this.IIl = this.IIIo[this.Iol];
         }

         if (this.II1O == 4) {
            for (int var14 = 0; var14 < this.II.length; var14++) {
               if (this.II[var14].I1l) {
                  this.II[var14].I_Oo = Ilol.II().I_o_;
               }
            }

            this.II1O = 5;
         }

         if (this.II1O == 5) {
            this.I1++;
            if (this.III < II.IIl1 / 3) {
               if (this.III + this.I1 > II.IIl1 / 3) {
                  this.III = II.IIl1 / 3;
               } else {
                  this.III = this.III + this.I1;
               }
            }

            for (int var15 = 0; var15 < this.II.length; var15++) {
               if (this.II[var15].I1l) {
                  if (this.II[var15].II0I < this.II[var15].I_Oo) {
                     if (this.II[var15].IIOl < 0) {
                        this.II[var15].IIOl = 0;
                     }

                     if (this.II[var15].II0I + this.II[var15].IIOl > this.II[var15].I_Oo) {
                        this.II[var15].II0I = this.II[var15].I_Oo;
                     } else {
                        Il00 var9 = this.II[var15];
                        var9.II0I = var9.II0I + this.II[var15].IIOl;
                     }

                     this.II[var15].IIOl++;
                  } else {
                     if (this.II[var15].IIOl > 0) {
                        this.II[var15].IIOl = 0;
                     }

                     Il00 var10 = this.II[var15];
                     var10.II0I = var10.II0I + this.II[var15].IIOl;
                     this.II[var15].IIOl--;
                  }

                  if (this.II[var15].II0I == this.II[var15].I_Oo) {
                     this.II[var15].I1l = false;
                  }
               }
            }

            return;
         }
      } catch (Exception var4) {
         System.out.println(IlII("쑏쓴쓐쓛쓳쓐앲앎씶씕얢얗", 50274) + var4.toString());
      }
   }

   @Override
   public void I_Il() {
      if (!I1OO.I1l1) {
         if (II.IIIl && !Ilo_.II().I_10 && !II.II.IOol) {
            I1IO var1 = this;
            if (this.II1O == 1 && II.III0) {
               for (int var2 = 0; var2 < var1.II.length; var2++) {
                  if (II.II(var1.II[var2].II0I - 20 - I1_I.Io1, var1.II[var2].I_O0 - 10 - I1_I.Io1I, 30, 30) && II.III0 && II.IIIo) {
                     var1.II(var2);
                  }
               }
            }

            if (II.III0) {
               for (int var4 = 0; var4 < Il10.length; var4++) {
                  if (II.II(Il10[var4], I1OO, 36, 36) && II.III0 && II.IIIo) {
                     var1.IIII(var4);
                  }
               }
            }
         }

         for (int var3 = 1; var3 < 8; var3++) {
            if (II.II[var3]) {
               II.II[var3] = false;
               this.II(var3 - 1);
            }
         }

         if (II.II[12]) {
            II.II[12] = false;
            this.IIII(0);
         }

         if (II.II[13]) {
            II.II[13] = false;
            this.IIII(1);
         }

         II.IIIl();
      }
   }

   private void II(int var1) {
      if (!this.II[var1].I1lI) {
         IO.II();
         long var2 = this.II10 == 0 ? Ilol.II().Il11 : Ilol.II().II10();
         if (this.II() >= this.II0 && var2 < this.III_ + this.III1) {
            String var4 = IO11.Il01 + IlII("쑂", 50274) + (this.II10 == 0 ? IO11.I_1_ : IO11.I_1O);
            I1_I.II.IIII(var4, 0);
         } else {
            this.IIO0 = var1;
            this.II[this.IIO0].I_0 = this.IoII + I_Ol.III_(-3, 3);
         }
      }
   }

   private void IIII(int var1) {
      this.IIOo = var1;
      if (var1 == 0) {
         if (this.II1O < 2) {
            if (this.II() + this.III() > 0) {
               this.II1O = 2;
               IO.II();
               Ilol.II().II(I1_I.II[13], 0);
               this.IlO1 = II.II + I_Ol.III_(2000, 3000);
               return;
            }
         } else if (this.III == II.IIl1 / 3) {
            I_0_.II().IIIl(this.II10, (byte)0);
            return;
         }
      } else {
         I1_I.II().IO1l = false;
         I1_I.II().I0l_();
      }
   }

   @Override
   public void III_(IO1l var1) {
      try {
         I1_I.II().III_(var1);
         var1.IIl0(-I1_I.Io1, -I1_I.Io1I);
         var1.IIl0(0, II.II10);

         for (int var2 = 0; var2 < this.II.length; var2++) {
            if (this.II[var2].I1l && this.II[var2].I_O0 > this.II[var2].I_0 - 20) {
               var1.II(IOlO.IIlI, this.II[var2].II0I, this.II[var2].I_0 + 7, 3);
            }
         }

         for (int var5 = 0; var5 < this.II.length; var5++) {
            if (this.II[var5].I1l) {
               I_oo.IIII(var1, this.II[var5].IIO1, this.II[var5].II0I, this.II[var5].I_O0, 0, 3);
            }
         }

         if (this.I__O) {
            if (IIIo != null) {
               int var6 = Ilol.II().I_o_ - IIIo.II0I - 28;

               for (int var3 = 0; var3 < II.IIl / IIIo.II0I + 1; var3++) {
                  IIIo.II(this.IIl, var6 - var3 * (IIIo.II0I - 1), Ilol.II().I_oO - IIIo.I_O0 / 2 - 12 + 2, 0, 0, var1);
               }
            }

            if (IIl != null) {
               int var7 = Ilol.II().I_o_ - IIl.II0I - 10;
               IIl.II(this.IIl, var7 - 5, Ilol.II().I_oO - IIl.I_O0 / 2 - 12, 0, 0, var1);
            }
         }

         I1_I.II1I(var1);
         int var9 = II.IIl - 240;
         var1.Illl(13524492);
         var1.III_(var9, 0, 240, 15);
         var1.II(I_1o.IloI, var9 + 11, 8, 3);
         var1.II(I_1o.Ilo1, var9 + 90, 7, 3);
         IO1I.IIl_.II(var1, Ilol.II().IIO, var9 + 24, 2, 0, IO1I.IIlO);
         IO1I.IIl_.II(var1, Ilol.II().IIOI, var9 + 100, 2, 0, IO1I.IIlO);
         var1.II(I_1o.Ilo_, var9 + 150, 8, 3);
         IO1I.IIl_.II(var1, Ilol.II().IIOl, var9 + 160, 2, 0, IO1I.IIlO);
         var1.II(I_1o.Ilol, var9 + 200, 8, 3);
         IO1I.IIl_.II(var1, String.valueOf(this.II0), var9 + 210, 2, 0, IO1I.IIlO);
         if (this.II1O < 4) {
            var9 = II.IIl - 140;
            var1.Illl(11837316);
            var1.III_(var9, 15, 140, 15);
            if (this.II10 == 0) {
               var1.II(I_1o.IloI, var9 + 21, 23, 3);
            } else {
               var1.II(I_1o.Ilo_, var9 + 21, 22, 3);
               var1.II(I_1o.Ilo1, var9 + 18, 22, 3);
            }

            IO1I.IIl0.II(var1, IlII("쑏", 50274) + this.III_, var9 + 30, 17, 0, IO1I.IIlO);
            var1.II(I_1o.Ilol, var9 + 80, 22, 3);
            IO1I.IIl0.II(var1, IlII("쑏", 50274) + this.II(), var9 + 90, 17, 0, IO1I.IIlO);
         }

         var1.II(I1_I.IIoo, Il10[0], I1OO, 0);
         if (this.IIOo == 0) {
            var1.II(I1_I.Il, Il10[0], I1OO, 0);
         }

         if (this.II1O < 3) {
            I_oo.IIII(var1, 540, Il10[0] + 14, I1OO + 14, 0, IOII.IIOI);
         } else {
            var1.II(II1I, Il10[0] + 14 - 10, I1OO + 14 - 10, 0);
         }

         var1.II(I1_I.IIoo, Il10[1], I1OO, 0);
         if (this.IIOo == 1) {
            var1.II(I1_I.Il, Il10[1], I1OO, 0);
         }

         var1.II(II1, Il10[1] + 14 - 10, I1OO + 14 - 10, 0);
         if (this.II1O > 3) {
            I_10.IIII(this.II, this.III, this.IIII, this.IIIl, var1);
            int var8 = II.IIll - this.III1.length * 30 / 2;

            for (int var11 = 0; var11 < this.III1.length; var11++) {
               I_oo.IIII(var1, this.III1[var11], var8 + 5 + var11 * 30, this.III + 10, 0, 0);
            }

            return;
         }
      } catch (Exception var4) {
         System.out.println(IlII("쑏쓱쓁쓖쒰쒉씱씖씴씌열엛여엕", 50274) + var4.toString());
      }
   }

   public void II(short[] var1) {
      this.II1O = 3;
      this.III1 = var1;
   }

   @Override
   public void I0l_() {
      I1_I.I_1o = true;
      I1_I.II().IO1l = true;
      super.I0l_();
   }

   private byte II() {
      byte var1 = 0;

      for (int var2 = 0; var2 < this.II.length; var2++) {
         if (this.II[var2].I1lI) {
            var1++;
         }
      }

      if (var1 > this.II0) {
         var1 = (byte)this.II0;
      }

      return var1;
   }

   private byte III() {
      byte var1 = 0;

      for (int var2 = 0; var2 < this.II.length; var2++) {
         if (this.II[var2].I1lI) {
            var1++;
         }
      }

      if ((var1 = (byte)(var1 - this.II())) <= 0) {
         var1 = 0;
      }

      return var1;
   }

   private void IOlO() {
      for (int var1 = 0; var1 < Ilol.II().II.length; var1++) {
         if (Ilol.II().II[var1] != null && Ilol.II().II[var1].II.II__ == this.II1_) {
            this.II0 = Ilol.II().II[var1].I1l1;
            return;
         }
      }
   }
}
