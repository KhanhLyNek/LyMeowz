package main;

public final class III {
   private int IIO;
   private int IIOI;
   private int IIOl;
   private int IIlI;
   private int IIO1;
   private int IIO_;
   private int IIOO = 28;
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
   private boolean II10 = false;
   public boolean II1o;
   public boolean III;
   public boolean II_;

   public III() {
      if (II.IIl < 300) {
         this.II1o = true;
         this.III = false;
         this.II_ = false;
      }

      if (II.IIl >= 300 && II.IIl <= 380) {
         this.II1o = false;
         this.III = true;
         this.II_ = false;
      }

      if (II.IIl > 380) {
         this.II1o = false;
         this.III = false;
         this.II_ = true;
      }

      if (!this.II_) {
         this.III1 = 0;
         this.II0I = II.IIll;
         this.III_ = II.IIl1 >> 1;
         this.II0l = II.IIlI - 80;
      } else {
         this.III1 = 0;
         this.II0I = II.IIll / 4 * 3 - 20;
         this.III_ = II.IIl1 >> 1;
         this.II0l = II.IIlI;
         if (IO10.l_lI == 2) {
            this.III1 = 0;
            this.III_ = (II.IIlI >> 1) + 40;
            this.II0I = II.IIll / 4 * 3 - 40;
            this.II0l = II.IIlI;
         }
      }
   }

   public void IIl1() {
      try {
         if (I1_I.IoO0 != 0) {
            if (II.IIIO && !II.IIIo) {
               this.IIOo = II.IIII;
               this.II0 = II.IIIl;
               if (this.IIOo >= 0 && this.IIOo <= this.II0I && this.II0 >= this.III_ && this.II0 <= this.II0l) {
                  if (!this.II10) {
                     this.IIO = this.IIOl = this.IIOo;
                     this.IIOI = this.IIlI = this.II0;
                  }

                  this.II10 = true;
                  this.II = II.II - this.IIO;
                  this.III = II.III - this.IIOI;
                  this.IIII = I_Ol.III0(this.II, 2) + I_Ol.III0(this.III, 2);
                  this.IIO0 = I_Ol.IIlo(this.IIII);
                  if (I_Ol.II1(this.II) > 4 || I_Ol.II1(this.III) > 4) {
                     this.IIIl = I_Ol.III1(this.II, this.III);
                     if (!II.II(this.IIO - this.IIOO, this.IIOI - this.IIOO, 2 * this.IIOO, 2 * this.IIOO)) {
                        if (this.IIO0 != 0) {
                           this.IIlI = this.III * this.IIOO / this.IIO0;
                           this.IIOl = this.II * this.IIOO / this.IIO0;
                           this.IIOl = this.IIOl + this.IIO;
                           this.IIlI = this.IIlI + this.IIOI;
                           if (!I_Ol.II(this.IIO - this.IIOO, this.IIOI - this.IIOO, 2 * this.IIOO, 2 * this.IIOO, this.IIOl, this.IIlI)) {
                              this.IIOl = this.IIO1;
                              this.IIlI = this.IIO_;
                           } else {
                              this.IIO1 = this.IIOl;
                              this.IIO_ = this.IIlI;
                           }
                        } else {
                           this.IIOl = this.IIO1;
                           this.IIlI = this.IIO_;
                        }
                     } else {
                        this.IIOl = II.II;
                        this.IIlI = II.III;
                     }

                     II.III1();
                     boolean var1 = true;
                     boolean var2;
                     if (I1_I.IoO0 == 0) {
                        var2 = false;
                     } else if (Ilol.II().IOIl == 3) {
                        var2 = true;
                     } else {
                        int var3 = 2;

                        while (true) {
                           if (var3 <= 0) {
                              var2 = true;
                              break;
                           }

                           int var4 = II.II[var3].II0I - II.II[var3 - 1].II0I;
                           int var5 = II.II[var3].I_O0 - II.II[var3 - 1].I_O0;
                           if (I_Ol.II1(var4) > 2 && I_Ol.II1(var5) > 2) {
                              var2 = false;
                              break;
                           }

                           var3--;
                        }
                     }

                     if (!var2) {
                        II.III1();
                     } else if ((this.IIIl > 360 || this.IIIl < 340) && (this.IIIl < 0 || this.IIIl > 20)) {
                        if (this.IIIl > 40 && this.IIIl < 70) {
                           II.IIII[6] = true;
                           II.II[6] = true;
                        } else if (this.IIIl >= 70 && this.IIIl <= 110) {
                           II.IIII[8] = true;
                           II.II[8] = true;
                        } else if (this.IIIl > 110 && this.IIIl < 120) {
                           II.IIII[4] = true;
                           II.II[4] = true;
                        } else if (this.IIIl >= 120 && this.IIIl <= 200) {
                           II.IIII[4] = true;
                           II.II[4] = true;
                        } else if (this.IIIl > 200 && this.IIIl < 250) {
                           II.IIII[2] = true;
                           II.II[2] = true;
                           II.IIII[4] = true;
                           II.II[4] = true;
                        } else if (this.IIIl >= 250 && this.IIIl <= 290) {
                           II.IIII[2] = true;
                           II.II[2] = true;
                        } else if (this.IIIl > 290 && this.IIIl < 340) {
                           II.IIII[2] = true;
                           II.II[2] = true;
                           II.IIII[6] = true;
                           II.II[6] = true;
                        }
                     } else {
                        II.IIII[6] = true;
                        II.II[6] = true;
                     }
                  }
               }
            } else {
               this.IIOl = this.IIO = 45;
               if (!this.II_) {
                  this.IIlI = this.IIOI = II.IIlI - 90;
               } else {
                  this.IIlI = this.IIOI = II.IIlI - 45;
               }

               this.II10 = false;
               II.III1();
            }
         }
      } catch (Exception var6) {
      }
   }

   public void II(IO1l var1) {
      if (I1_I.IoO0 != 0) {
         var1.II(I1_I.III, this.IIO, this.IIOI, 3);
         var1.II(I1_I.Illl, this.IIOl, this.IIlI, 3);
      }
   }

   public final boolean II() {
      return I1_I.IoO0 == 0 ? false : this.II10;
   }

   public final boolean III() {
      try {
         if (I1_I.IoO0 == 0) {
            return false;
         }

         boolean var1;
         if ((II.II < 0 || II.II > this.II0I || II.III < this.III_ || II.III > this.II0l) && II.II < II.IIl - 50) {
            var1 = false;
         } else {
            var1 = true;
         }

         return var1;
      } catch (Exception var2) {
         return false;
      }
   }
}
