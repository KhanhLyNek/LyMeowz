package main;

import javax.microedition.lcdui.Image;

public final class I_II {
   public boolean IOol;
   public I_lO II0;
   public int llII;
   public int I_Oo;
   public int I_0;
   private int IIOl;
   private int IIlI;
   private static int[] II0o;
   private static int IIO_;
   private static int IoII;
   private static int IIO0;
   private static int IIOo;
   private I1Il II1_ = new I1Il(IO11.I_lO, 0);
   private I1Il II1O;
   private I1Il II10;
   private static Image IlO0 = IO10.IIII(Il_("ᒼᓟᒰᒙᕡᕧᔠᔍᗬᗏᗦᖅᙾᙲᘠᘜᛷᛗᚳᚅᛍ\u177a\u175fᜨ᜶\u17ffៗឭំᠸᡅᠺ᠔", 5267));
   private static Image IlOo = IO10.IIII(Il_("ᒼᓟᒰᒙᕡᕧᔠᔍᗬᗏᗦᖅᙾᙲᘠᘜᛷᛗᚳᚅᛍ\u177a\u175fᜨ᜶\u17ffៗឭៅᠸᡅᠺ᠔", 5267));
   private boolean I__o;
   public int IIO;
   private int III_;
   private int II0l;
   private int Iol;
   private int[] Il_;
   private boolean IIlI;
   private boolean IIll;
   private int Ioll;
   private int I1__;
   private boolean IOo1;
   private boolean IOo_;
   private int I1_o;
   private int I1O;
   private boolean IOoO;
   private boolean[] IIIo;

   public I_II() {
      this.II1O = new I1Il(IO11.I_I, 0, II.IIl - 71, II.IIlI - IO1_.llo_ + 1);
      this.II10 = null;
      this.Il_ = new int[3];
   }

   public void II(I_lO var1, int var2) {
      this.II(var1);
      this.I__o = true;
   }

   public void II(I_lO var1, int var2, int var3) {
      this.II(var1);
      this.I_Oo = var2;
      this.I_0 = var3;

      while (this.I_0 + this.IIlI > II.IIlI) {
         this.I_0 -= 2;
      }
   }

   public void II(I_lO var1) {
      if (!this.IOol) {
         this.IOoO = false;
         this.IOo1 = false;
         this.IOo_ = false;
         this.IIO = 0;
         if (var1.size() == 1) {
            this.llII = 0;
            I1Il var2;
            if ((var2 = (I1Il)var1.elementAt(0)) != null && var2.IIoO.equals(IO11.IOl)) {
               var2.I0lO();
               this.IOol = false;
               I1OO.IIl1();
               return;
            }
         }

         IO.II();
         this.IIIo = new boolean[var1.size()];

         for (int var4 = 0; var4 < this.IIIo.length; var4++) {
            this.IIIo[var4] = false;
         }

         this.I__o = false;
         Ilo1.III = null;
         I1l1.II1_.removeAllElements();
         I1l1.II10.removeAllElements();
         I1OO.I__o();
         if (var1.size() != 0) {
            this.II0 = var1;
            this.IIOl = 60;
            this.IIlI = 60;

            for (int var5 = 0; var5 < var1.size(); var5++) {
               I1Il var3;
               (var3 = (I1Il)var1.elementAt(var5)).I__ = false;
               IO1I.IIl_.IIII(var3.IIoO);
               var3.IIll = IO1I.IIl_.II(var3.IIoO, this.IIOl - 10);
            }

            II0o = new int[var1.size()];
            this.I_Oo = (II.IIl - var1.size() * this.IIOl) / 2;
            if (this.I_Oo <= 0) {
               this.I_Oo = 1;
            }

            this.I_0 = II.IIlI - this.IIlI - (I_10.II0I + 1) - 1;
            if (II.IIIl) {
               this.I_0 -= 3;
            }

            this.I_0 += 27;

            for (int var6 = 0; var6 < II0o.length; var6++) {
               II0o[var6] = II.IIlI;
            }

            this.IOol = true;
            this.llII = 0;
            if ((IIO0 = this.II0.size() * this.IIOl - II.IIl) < 0) {
               IIO0 = 0;
            }

            IIO_ = 0;
            IoII = 0;
            IIOo = 50;
            this.III_ = var1.size() * this.IIOl - 1;
            if (this.III_ > II.IIl - 2) {
               this.III_ = II.IIl - 2;
            }

            if (II.IIIl) {
               this.llII = -1;
            }
         }
      }
   }

   public final void I0OO() {
      this.IOoO = false;
      this.IOol = false;
      I1OO.I__o();
      if (this.IOo_) {
         II.II.III1 = null;
         Ilol.II = null;
         if (II.III != null && II.III.III1 != null) {
            II.III.III1 = null;
         }
      } else if (this.IOo1) {
         II.II.III1 = null;
         if (II.III != null && II.III.III1 != null) {
            II.III.III1 = null;
         }

         I1Il var1;
         if (this.llII >= 0 && (var1 = (I1Il)this.II0.elementAt(this.llII)) != null) {
            IO.II();
            var1.I0lO();
         }
      }
   }

   public final void I0O0() {
      I1Il var1;
      if (II.II.llII >= 0 && (var1 = (I1Il)II.II.II0.elementAt(II.II.llII)) != null) {
         var1.I0lO();
      }
   }

   private boolean III() {
      return !this.IOoO && II0o[II0o.length - 1] > this.I_0 || this.IOoO && II0o[II0o.length - 1] < II.IIlI;
   }

   public void IIl1() {
      if ((!I1_I.II().I1_1 || !I1_I.II().IO1I) && this.IOol && !this.III()) {
         boolean var1 = false;
         if (II.II[2] || II.II[4]) {
            var1 = true;
            this.llII--;
            if (this.llII < 0) {
               this.llII = this.II0.size() - 1;
            }
         } else if (II.II[8] || II.II[6]) {
            var1 = true;
            this.llII++;
            if (this.llII > this.II0.size() - 1) {
               this.llII = 0;
            }
         } else if (II.II[5]) {
            this.Ioll = 2;
         } else if (II.II[12] && !I1_I.II().IIo1()) {
            if (this.III()) {
               return;
            }

            if (this.II1_.IIO <= 0) {
               this.Ioll = 2;
            }

            IO.II();
         } else if (!I1_I.II().IIo1() && !this.I__o && (II.II[13] || IO1_.II(this.II1O))) {
            if (this.III()) {
               return;
            }

            if (!this.IOo_) {
               this.IOo_ = true;
            }

            this.IOoO = true;
            IO.II();
         }

         if (var1) {
            if ((IIO_ = this.llII * this.IIOl + this.IIOl - II.IIl / 2) > IIO0) {
               IIO_ = IIO0;
            }

            if (IIO_ < 0) {
               IIO_ = 0;
            }

            if (this.llII == this.II0.size() - 1 || this.llII == 0) {
               IoII = IIO_;
            }
         }

         var1 = true;
         if (II.II.III1 != null && II.II.III1.I_1O) {
            if (!II.II(II.II.III1.IIO, 0, II.II.III1.II0I + 2, II.II.III1.IIOl)) {
               var1 = true;
            } else {
               var1 = false;
               II.II.III1.IOlI();
            }
         }

         if (!this.I__o && II.IIIo && !II.III(this.I_Oo, this.I_0, this.III_, this.IIlI) && !this.IIlI && !I1_I.II().IIo1() && var1) {
            if (!this.III()) {
               this.II0l = this.Iol = 0;
               this.IIlI = false;
               II.IIlI();
               this.IOoO = true;
               this.IOo_ = true;
               IO.II();
            }
         } else {
            if (II.IIIO) {
               if (!this.IIlI && II.III(this.I_Oo, this.I_0, this.III_, this.IIlI)) {
                  for (int var7 = 0; var7 < this.Il_.length; var7++) {
                     this.Il_[0] = II.II;
                  }

                  this.Iol = II.II;
                  this.IIlI = true;
                  this.IIll = this.I1__ != 0;
                  this.I1__ = 0;
               } else if (this.IIlI) {
                  this.II0l++;
                  if (this.II0l > 5 && this.Iol == II.II && !this.IIll) {
                     this.Iol = -1000;
                     this.llII = (IIO_ + II.II - this.I_Oo) / this.IIOl;
                  }

                  int var3;
                  if ((var3 = II.II - this.Il_[0]) != 0 && this.llII != -1) {
                     this.llII = -1;
                  }

                  for (int var2 = this.Il_.length - 1; var2 > 0; var2--) {
                     this.Il_[var2] = this.Il_[var2 - 1];
                  }

                  this.Il_[0] = II.II;
                  if ((IIO_ -= var3) < 0) {
                     IIO_ = 0;
                  }

                  if (IIO_ > IIO0) {
                     IIO_ = IIO0;
                  }

                  if (IoII < 0 || IoII > IIO0) {
                     var3 /= 2;
                  }

                  IoII -= var3;
               }
            }

            if (II.IIIo && this.IIlI) {
               int var8 = II.II - this.Il_[0];
               II.IIIo = false;
               if (I_Ol.II1(var8) < 20 && I_Ol.II1(II.II - this.Iol) < 20 && !this.IIll) {
                  this.I1__ = 0;
                  IIO_ = IoII;
                  this.Iol = -1000;
                  this.llII = (IIO_ + II.II - this.I_Oo) / this.IIOl;
                  this.II0l = 0;
                  this.Ioll = 10;
               } else if (this.llII != -1 && this.II0l > 5) {
                  this.II0l = 0;
                  this.Ioll = 1;
               } else if (this.llII == -1 && !this.IIll) {
                  if (IoII < 0) {
                     IIO_ = 0;
                  } else if (IoII > IIO0) {
                     IIO_ = IIO0;
                  } else {
                     byte var4;
                     int var6;
                     if ((var6 = II.II - this.Il_[0] + (this.Il_[0] - this.Il_[1]) + (this.Il_[1] - this.Il_[2])) > 10) {
                        var4 = 10;
                     } else if (var6 < -10) {
                        var4 = -10;
                     } else {
                        var4 = 0;
                     }

                     this.I1__ = -var4 * 100;
                  }
               }

               this.IIlI = false;
               this.II0l = 0;
               II.IIIo = false;
            }

            II.IIIl();
            II.III1();
         }
      }
   }

   public void II(IO1l var1) {
      if (!I1_I.II().I1_1 || !I1_I.II().IO1I) {
         var1.IIl0(-var1.IIO1(), -var1.IIO_());
         var1.IIl0(-IoII, 0);

         for (int var2 = 0; var2 < this.II0.size(); var2++) {
            if (var2 == this.llII) {
               var1.II(IlOo, this.I_Oo + var2 * this.IIOl + 1, II0o[var2] + 1, 0);
            } else {
               var1.II(IlO0, this.I_Oo + var2 * this.IIOl + 1, II0o[var2] + 1, 0);
            }

            I1Il var3;
            String[] var4;
            if ((var4 = (var3 = (I1Il)this.II0.elementAt(var2)).IIll) == null) {
               var4 = new String[]{((I1Il)this.II0.elementAt(var2)).IIoO};
            }

            int var5 = II0o[var2] + (this.IIlI - var4.length * 14) / 2 + 1;

            for (int var6 = 0; var6 < var4.length; var6++) {
               if (var2 == this.llII) {
                  IO1I.IIIO.II(var1, var4[var6], this.I_Oo + var2 * this.IIOl + this.IIOl / 2, var5 + var6 * 14, 2);
               } else if (var3.I_1o) {
                  IO1I.II.II(var1, var4[var6], this.I_Oo + var2 * this.IIOl + this.IIOl / 2, var5 + var6 * 14, 2);
               } else {
                  IO1I.III_.II(var1, var4[var6], this.I_Oo + var2 * this.IIOl + this.IIOl / 2, var5 + var6 * 14, 2);
               }
            }
         }

         var1.IIl0(-var1.IIO1(), -var1.IIO_());
      }
   }

   public void IOlI() {
      if (this.I1__ != 0 && !this.IIlI) {
         if ((IIO_ = IIO_ + this.I1__ / 100) < 0) {
            IIO_ = 0;
         } else if (IIO_ > IIO0) {
            IIO_ = IIO0;
         } else {
            IoII = IIO_;
         }

         this.I1__ = this.I1__ * 9 / 10;
         if (this.I1__ < 100 && this.I1__ > -100) {
            this.I1__ = 0;
         }
      }

      if (IoII != IIO_ && !this.IIlI) {
         this.I1_o = IIO_ - IoII << 2;
         this.I1O = this.I1O + this.I1_o;
         IoII = IoII + (this.I1O >> 4);
         this.I1O &= 15;
      }

      if (!this.IOoO) {
         this.IIO++;

         for (int var2 = 0; var2 < II0o.length; var2++) {
            if (II0o[var2] > this.I_0) {
               int var3;
               if ((var3 = II0o[var2] - this.I_0 >> 1) <= 0) {
                  var3 = 1;
               }

               if (this.IIO > var2) {
                  int[] var1 = II0o;
                  var1[var2] -= var3;
               }
            }
         }

         if (II0o[II0o.length - 1] <= this.I_0) {
            this.IIO = 0;
         }
      } else {
         this.IIO++;

         for (int var6 = 0; var6 < II0o.length; var6++) {
            if (II0o[var6] < II.IIlI) {
               int var7;
               if ((var7 = (II.IIlI - II0o[var6] >> 1) + 2) <= 0) {
                  var7 = 1;
               }

               if (this.IIO > var6) {
                  int[] var5 = II0o;
                  var5[var6] += var7;
               }
            }
         }

         if (II0o[II0o.length - 1] >= II.IIlI) {
            this.IIO = 0;
            this.IOoO = false;
            this.IOol = false;
            I1OO.I__o();
            if (this.IOo_) {
               II.II.III1 = null;
               Ilol.II = null;
               if (II.III != null && II.III.III1 != null) {
                  II.III.III1 = null;
               }
            } else if (this.IOo1) {
               II.II.III1 = null;
               if (II.III != null && II.III.III1 != null) {
                  II.III.III1 = null;
               }

               I1Il var4;
               if (this.llII >= 0 && (var4 = (I1Il)this.II0.elementAt(this.llII)) != null) {
                  IO.II();
                  var4.I0lO();
               }
            }
         }
      }

      if (IIOo != 0 && (IIOo >>= 1) < 0) {
         IIOo = 0;
      }

      if (!this.III() && this.Ioll > 0) {
         this.Ioll--;
         if (this.Ioll == 0) {
            if (this.llII >= 0 && !this.IIIo[this.llII]) {
               this.IOoO = true;
               this.IOo1 = true;
               II.II.III1 = null;
               return;
            }

            I1OO.I__o();
            I1Il var8;
            if (this.llII >= 0 && (var8 = (I1Il)this.II0.elementAt(this.llII)) != null) {
               var8.I0lO();
            }
         }
      }
   }
}
