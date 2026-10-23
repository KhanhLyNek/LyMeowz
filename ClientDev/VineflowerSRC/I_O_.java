package main;

public final class I_O_ {
   public int II0I;
   public int I_O0;
   public int I_Oo;
   public int I_0;
   public int IIO;
   public int IIOI;
   public int IIOl;
   public int IIlI;
   private int III;
   private int IIII;
   public int IIO1;
   public int IIO_;
   public int IoII;
   public int IIO0;
   private int IIIl;
   private int III1;
   private int[] I10o = new int[3];
   public boolean I__I;
   private boolean I1I0;
   private int Iol;
   public int II0;
   public int II;
   private int IIl;
   private boolean IIlI = true;

   public final I_OO II() {
      if (this.IIlI) {
         boolean var30 = false;
         I_O_ var11 = this;
         int var18 = this.III;
         int var20 = this.IIII;
         int var23 = this.IIO1;
         int var28 = this.IIO_;
         if (II.IIIO) {
            if (!this.I__I && II.III(var18, var20, var23, var28)) {
               for (int var26 = 0; var26 < var11.I10o.length; var26++) {
                  var11.I10o[0] = II.III;
               }

               var11.III1 = II.III;
               var11.I__I = true;
               var11.II0 = -1;
               var11.I1I0 = var11.Iol != 0;
               var11.Iol = 0;
            } else if (this.I__I) {
               this.IIIl++;
               if (this.IIIl > 5 && this.III1 == II.III && !this.I1I0) {
                  this.III1 = -1000;
                  if (this.IIl > 1) {
                     var23 = (this.I_O0 + II.III - var20) / this.II;
                     int var13 = (this.II0I + II.II - var18) / this.II;
                     this.II0 = var23 * this.IIl + var13;
                  } else {
                     this.II0 = (this.I_O0 + II.III - var20) / this.II;
                  }
               }

               if ((var23 = II.III - this.I10o[0]) != 0 && this.II0 != -1) {
                  this.II0 = -1;
               }

               for (int var14 = this.I10o.length - 1; var14 > 0; var14--) {
                  var11.I10o[var14] = var11.I10o[var14 - 1];
               }

               var11.I10o[0] = II.III;
               var11.I_O0 -= var23;
               if (var11.I_O0 < 0) {
                  var11.I_O0 = 0;
               }

               if (var11.I_O0 > var11.IIO0) {
                  var11.I_O0 = var11.IIO0;
               }

               if (var11.I_0 < 0 || var11.I_0 > var11.IIO0) {
                  var23 /= 2;
               }

               var11.I_0 -= var23;
            }
         }

         boolean var31 = false;
         if (II.IIIo && var11.I__I) {
            int var15 = II.III - var11.I10o[0];
            II.IIIo = false;
            if (I_Ol.II1(var15) < 20 && I_Ol.II1(II.III - var11.III1) < 20 && !var11.I1I0) {
               var11.Iol = 0;
               var11.I_O0 = var11.I_0;
               var11.III1 = -1000;
               if (var11.IIl > 1) {
                  var15 = (var11.I_O0 + II.III - var20) / var11.II;
                  var18 = (var11.II0I + II.II - var18) / var11.II;
                  var11.II0 = var15 * var11.IIl + var18;
               } else {
                  var11.II0 = (var11.I_O0 + II.III - var20) / var11.II;
               }

               var11.IIIl = 0;
               var31 = true;
            } else if (var11.II0 != -1 && var11.IIIl > 5) {
               var11.IIIl = 0;
               var31 = true;
            } else if (var11.II0 == -1 && !var11.I1I0) {
               if (var11.I_0 < 0) {
                  var11.I_O0 = 0;
               } else if (var11.I_0 > var11.IIO0) {
                  var11.I_O0 = var11.IIO0;
               } else {
                  byte var29;
                  if ((var15 = II.III - var11.I10o[0] + (var11.I10o[0] - var11.I10o[1]) + (var11.I10o[1] - var11.I10o[2])) > 10) {
                     var29 = 10;
                  } else if (var15 < -10) {
                     var29 = -10;
                  } else {
                     var29 = 0;
                  }

                  var11.Iol = -var29 * 100;
               }
            }

            var11.I__I = false;
            var11.IIIl = 0;
            II.IIIo = false;
         }

         I_OO var10;
         (var10 = new I_OO()).I_O0 = var11.II0;
         var10.III = var31;
         var10.I_1o = var11.I__I;
         return var10;
      } else {
         I_O_ var1 = this;
         int var2 = this.III;
         int var3 = this.IIII;
         int var4 = this.IIO1;
         int var5 = this.IIO_;
         if (II.IIIO) {
            if (!this.I__I && II.III(var2, var3, var4, var5)) {
               for (int var27 = 0; var27 < var1.I10o.length; var27++) {
                  var1.I10o[0] = II.II;
               }

               var1.III1 = II.II;
               var1.I__I = true;
               var1.II0 = -1;
               var1.I1I0 = var1.Iol != 0;
               var1.Iol = 0;
            } else if (this.I__I) {
               this.IIIl++;
               if (this.IIIl > 5 && this.III1 == II.II && !this.I1I0) {
                  this.III1 = -1000;
                  this.II0 = (this.II0I + II.II - var2) / this.II;
               }

               int var6;
               if ((var6 = II.II - this.I10o[0]) != 0 && this.II0 != -1) {
                  this.II0 = -1;
               }

               for (int var21 = this.I10o.length - 1; var21 > 0; var21--) {
                  var1.I10o[var21] = var1.I10o[var21 - 1];
               }

               var1.I10o[0] = II.II;
               var1.II0I -= var6;
               if (var1.II0I < 0) {
                  var1.II0I = 0;
               }

               if (var1.II0I > var1.IoII) {
                  var1.II0I = var1.IoII;
               }

               if (var1.I_Oo < 0 || var1.I_Oo > var1.IoII) {
                  var6 /= 2;
               }

               var1.I_Oo -= var6;
            }
         }

         boolean var8 = false;
         if (II.IIIo && var1.I__I) {
            var5 = II.II - var1.I10o[0];
            II.IIIo = false;
            if (I_Ol.II1(var5) < 20 && I_Ol.II1(II.II - var1.III1) < 20 && !var1.I1I0) {
               var1.Iol = 0;
               var1.II0I = var1.I_Oo;
               var1.III1 = -1000;
               var1.II0 = (var1.II0I + II.II - var2) / var1.II;
               var1.IIIl = 0;
               var8 = true;
            } else if (var1.II0 != -1 && var1.IIIl > 5) {
               var1.IIIl = 0;
               var8 = true;
            } else if (var1.II0 == -1 && !var1.I1I0) {
               if (var1.I_Oo < 0) {
                  var1.II0I = 0;
               } else if (var1.I_Oo > var1.IoII) {
                  var1.II0I = var1.IoII;
               } else {
                  byte var7;
                  if ((var2 = II.II - var1.I10o[0] + (var1.I10o[0] - var1.I10o[1]) + (var1.I10o[1] - var1.I10o[2])) > 10) {
                     var7 = 10;
                  } else if (var2 < -10) {
                     var7 = -10;
                  } else {
                     var7 = 0;
                  }

                  var1.Iol = -var7 * 100;
               }
            }

            var1.I__I = false;
            var1.IIIl = 0;
            II.IIIo = false;
         }

         I_OO var9;
         (var9 = new I_OO()).I_O0 = var1.II0;
         var9.III = var8;
         var9.I_1o = var1.I__I;
         return var9;
      }
   }

   public void IOlI() {
      if (this.Iol != 0 && !this.I__I) {
         if (this.IIlI) {
            this.I_O0 = this.I_O0 + this.Iol / 100;
            if (this.I_O0 < 0) {
               this.I_O0 = 0;
            } else if (this.I_O0 > this.IIO0) {
               this.I_O0 = this.IIO0;
            } else {
               this.I_0 = this.I_O0;
            }
         } else {
            this.II0I = this.II0I + this.Iol / 100;
            if (this.II0I < 0) {
               this.II0I = 0;
            } else if (this.II0I > this.IoII) {
               this.II0I = this.IoII;
            } else {
               this.I_Oo = this.II0I;
            }
         }

         this.Iol = this.Iol * 9 / 10;
         if (this.Iol < 100 && this.Iol > -100) {
            this.Iol = 0;
         }
      }

      if (this.I_Oo != this.II0I && !this.I__I) {
         this.IIO = this.II0I - this.I_Oo << 2;
         this.IIOl = this.IIOl + this.IIO;
         this.I_Oo = this.I_Oo + (this.IIOl >> 4);
         this.IIOl &= 15;
      }

      if (this.I_0 != this.I_O0 && !this.I__I) {
         this.IIOI = this.I_O0 - this.I_0 << 2;
         this.IIlI = this.IIlI + this.IIOI;
         this.I_0 = this.I_0 + (this.IIlI >> 4);
         this.IIlI &= 15;
      }
   }

   public void II(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
      this.III = var3;
      this.IIII = var4;
      this.II = var2;
      this.IIO1 = var5;
      this.IIO_ = var6;
      this.IIlI = true;
      this.IIl = 1;
      this.IIO0 = var1 * var2 - var6;
      if (this.IIO0 < 0) {
         this.IIO0 = 0;
      }

      if (this.IoII < 0) {
         this.IoII = 0;
      }
   }

   public void IIO(int var1) {
      if (this.IIlI) {
         var1 -= (this.IIO_ - this.II) / 2;
         this.I_O0 = var1;
         if (this.I_O0 < 0) {
            this.I_O0 = 0;
         }

         if (this.I_O0 > this.IIO0) {
            this.I_O0 = this.IIO0;
            return;
         }
      } else {
         var1 -= (this.IIO1 - this.II) / 2;
         this.II0I = var1;
         if (this.II0I < 0) {
            this.II0I = 0;
         }

         if (this.II0I > this.IoII) {
            this.II0I = this.IoII;
         }
      }
   }
}
