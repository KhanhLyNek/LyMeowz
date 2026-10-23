package main;

import javax.microedition.lcdui.Image;

public final class I10_ implements I1_O {
   public int I1;
   public int I1I;
   private int lI0;
   private int lI0I;
   private int IIO1;
   private int IIO_;
   public int IoIO;
   public int lI0l;
   public I1o II;
   private byte II0;
   private int lI01;
   private int lI0_;
   private int lI0O;
   private int lI00;
   private int lI0o;
   private int lIo;
   private int[] I1I_;
   private int[] I1IO;
   private int[] I1I0;
   private int[] I1Io;
   private int Iol;
   private int IIl;
   public static Image IlOI = IO10.IIII(Il1I("洏浒洿洔淲淲涷涘湿湒湹渘滭滧溷溉潤潚漼漈澾濏澬澅灩灕瀣灋烴烍炥", 27936));
   private static Image IlOl = IO10.IIII(Il1I("洏浒洿洔淲淲涷涘湿湒湹渘滭滧溷溉潤潚漼漈澾濏澣澝灭灊瀧瀐烶烂烳烏煰煱煙", 27936));
   private static Image IlO1 = IO10.IIII(Il1I("洏浒洿洔淲淲涷涘湿湒湹渘滭滧溷溉潤潚漼漈澾濏澣澝灭灊瀧瀐烶烂烰烏煰煱煙", 27936));
   private static Image IlO_ = IO10.IIII(Il1I("洏浒洿洔淲淲涷涘湿湒湹渘滭滧溷溉潤潚漼漈澾濏澣澝灭灊瀧瀐烶烂烱烏煰煱煙", 27936));

   public I10_(short var1, short var2, int var3, int var4, int var5, int var6) {
      this.lI0l = var1;
      this.II = I1oI.II(var2);
      this.I1 = var5;
      this.I1I = var4;
      this.lI0 = var5;
      this.lI0I = var6;
      this.IIO1 = var5 - var3 >> 2;
      this.IIO_ = 5;
   }

   public I10_(int var1, short var2, short var3, int var4, int var5, short var6) {
      this.lI0l = var2;
      this.II = I1oI.II(var3);
      this.I1 = this.lI0 = var4;
      this.I1I = this.lI0I = var5;
      this.II0 = 1;
      this.IoIO = var1;
      if (this.IIoo()) {
         this.lI01 = var6;
         this.lI0_ = this.I1;
         this.lI0O = this.I1I;
         this.lIo = 120;
         this.lI00 = 0;
         if (!II.II) {
            this.lI0o = 360 / this.lIo;
            this.I1I_ = new int[this.lIo];
            this.I1IO = new int[this.lIo];
            this.I1I0 = new int[this.lIo];
            this.I1Io = new int[this.lIo];
            this.I0O();
         }
      }
   }

   public void III0(int var1, int var2) {
      this.lI0 = var1;
      this.lI0I = var2;
      this.IIO1 = var1 - this.I1 >> 2;
      this.IIO_ = var2 - this.I1I >> 2;
      this.II0 = 2;
   }

   public void IIl1() {
      if (this.II0 == 2 && this.I1 == this.lI0 && this.I1I == this.lI0I) {
         I1_I.II_0.removeElement(this);
         if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
            Ilol.II().II = null;
         }
      } else {
         if (this.II0 <= 0) {
            this.II0 = (byte)(this.II0 - 4);
            if (this.II0 < -12) {
               this.I1I -= 12;
               this.II0 = 1;
            }
         } else {
            if (this.IIO1 == 0) {
               this.I1 = this.lI0;
            }

            if (this.IIO_ == 0) {
               this.I1I = this.lI0I;
            }

            if (this.I1 != this.lI0) {
               this.I1 = this.I1 + this.IIO1;
               if (this.IIO1 > 0 && this.I1 > this.lI0 || this.IIO1 < 0 && this.I1 < this.lI0) {
                  this.I1 = this.lI0;
               }
            }

            if (this.I1I != this.lI0I) {
               this.I1I = this.I1I + this.IIO_;
               if (this.IIO_ > 0 && this.I1I > this.lI0I || this.IIO_ < 0 && this.I1I < this.lI0I) {
                  this.I1I = this.lI0I;
               }
            }
         }

         if (this.IIoo()) {
            this.Iol++;
            this.IIl++;
            if (this.IIl >= 40) {
               this.IIl = 0;
            }

            if (this.Iol >= this.lIo) {
               this.Iol = 0;
            }

            if (this.Iol % 10 == 0 && !II.II) {
               I_0.III(114, this.I1 - 5, this.I1I - 30, 1);
            }
         }
      }
   }

   public void III_(IO1l var1) {
      if (!IIoo.II(this, var1)) {
         if (this.IIoo()) {
            var1.II(IOlO.IIlI, this.I1 + 3, this.I1I, 3);
            if (this.II0 <= 0) {
               if (this.IIl < 10) {
                  var1.II(IlOl, this.I1, this.I1I + this.II0 + 3, 33);
               } else {
                  var1.II(IlO1, this.I1, this.I1I + this.II0 + 3, 33);
               }
            } else if (this.IIl < 10) {
               var1.II(IlOl, this.I1, this.I1I + 3, 33);
            } else {
               var1.II(IlO1, this.I1, this.I1I + 3, 33);
            }

            IO1l var2 = var1;
            I10_ var3 = this;
            if (!II.II) {
               for (int var4 = 0; var4 < var3.I1IO.length; var4++) {
                  if (var3.Iol == var4) {
                     if (var3.IIl <= 20) {
                        var2.II(IlO_, var3.I1I0[var4], var3.I1Io[var4] + 3, 33);
                     } else {
                        I_oo.IIII(var2, var3.II.II_O, var3.I1I0[var4], var3.I1Io[var4] + 3, 0, 33);
                     }
                  }
               }
            }
         } else if (!this.IIoo()) {
            if (II.IIIO % 4 == 0) {
               var1.II(IlOI, this.I1, this.I1I + this.II0 + 13, 33);
            }

            if (this.II0 <= 0) {
               I_oo.IIII(var1, this.II.II_O, this.I1, this.I1I + this.II0 + 3, 0, 33);
            } else {
               I_oo.IIII(var1, this.II.II_O, this.I1, this.I1I + 3, 0, 33);
            }

            if (Ilol.II().II != null && Ilol.II().II.equals(this) && this.II0 != 2) {
               var1.II(I_I_.Il0, 0, 24, 9, 6, 0, this.I1, this.I1I - 17, 3);
            }
         }
      }
   }

   private boolean IIoo() {
      boolean var1;
      if (this.II.II0l == 22) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void I0O() {
      if (!II.II) {
         for (int var1 = 0; var1 < this.I1IO.length; var1++) {
            this.I1IO[var1] = I_Ol.II1(this.lI01 * I_Ol.IIll(this.lI00) / 1024);
            this.I1I_[var1] = I_Ol.II1(this.lI01 * I_Ol.IIl1(this.lI00) / 1024);
            if (this.lI00 < 90) {
               this.I1I0[var1] = this.lI0_ + this.I1I_[var1];
               this.I1Io[var1] = this.lI0O - this.I1IO[var1];
            } else if (this.lI00 >= 90 && this.lI00 < 180) {
               this.I1I0[var1] = this.lI0_ - this.I1I_[var1];
               this.I1Io[var1] = this.lI0O - this.I1IO[var1];
            } else if (this.lI00 >= 180 && this.lI00 < 270) {
               this.I1I0[var1] = this.lI0_ - this.I1I_[var1];
               this.I1Io[var1] = this.lI0O + this.I1IO[var1];
            } else {
               this.I1I0[var1] = this.lI0_ + this.I1I_[var1];
               this.I1Io[var1] = this.lI0O + this.I1IO[var1];
            }

            this.lI00 = this.lI00 + this.lI0o;
         }
      }
   }

   @Override
   public final int IIlo() {
      return this.I1;
   }

   @Override
   public final int II1() {
      return this.I1I;
   }

   @Override
   public final int II1I() {
      return 20;
   }

   @Override
   public final int II1l() {
      return 20;
   }

   @Override
   public void IOlo() {
   }

   @Override
   public final boolean IIOl() {
      return false;
   }
}
