package main;

import javax.microedition.lcdui.Image;

public final class I_1I extends I_I_ implements I1_O {
   private static Image III0 = IO10.IIII(IlO("䀱䁐䀽䀒䃴䃰䂵䂖䅱䅐䅻䄀䇺䇐䆴䆀䉹䉯䈥䈌䊤䋙䊦䊀", 16414));
   public int I_0I;
   public int I_0l;
   private int lll_;
   private int I_01;
   private boolean I0I_ = true;
   private int IO1I;
   private int I_0O;
   private Ilol[] III_;
   private int[] I11l;
   private byte IIo1;
   private int llll;
   private int I_o1 = -1;
   private int IIIo = -1;
   private int I_ol = -1;
   private int[][] IIl;

   @Override
   public void II(short var1) {
      super.IOo0 = true;
      super.IIO_ = var1;
   }

   @Override
   public void IOll() {
      super.IOo0 = false;
   }

   public I_1I(int var1, short var2, short var3, int var4, int var5, int var6) {
      byte[] var10000 = new byte[]{-1, 1};
      this.IIl = new int[][]{
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1},
         {0, 0, 0, 0, 1, 1, 1, 1}
      };
      super.lll = var1;
      super.I1 = super.llIO = var2 + 20;
      super.I1I = super.llI0 = var3;
      this.I_0I = super.I1;
      this.I_0l = super.I1I;
      super.llI1 = var6;
      super.llIl = var5;
      super.I1ll = var4;
      super.I100 = 100;
      this.I00l();
      if (I_I_.II[super.I1ll].II == null) {
         I_0_.II().II0o(super.I1ll);
      }

      super.status = 2;
      this.IIl = (int[][])null;
   }

   @Override
   public void IIIl(int[] var1) {
      this.IO1I++;
      if (this.IO1I > var1.length - 1) {
         this.IO1I = 0;
      }

      this.I_0O = var1[this.IO1I];
   }

   @Override
   public void IOl1() {
   }

   @Override
   public void IIlO() {
      if (this.IIl == null && I_I_.II[super.I1ll].II != null) {
         this.IOo();
      }

      if (this.IIl != null && this.IIO()) {
         I_1I var1 = this;
         int var2 = 0;
         this.lll_ = super.I1;
         if (IOlO.IIIl(super.I1, super.I1I, 2)) {
            this.I_01 = super.I1I;
         } else {
            this.I_01 = super.I1I;

            while (var2 < 30) {
               var2++;
               var1.I_01 += 24;
               if (IOlO.IIIl(var1.lll_, var1.I_01, 2)) {
                  if (var1.I_01 % 24 != 0) {
                     var1.I_01 = var1.I_01 - var1.I_01 % 24;
                  }
                  break;
               }
            }
         }

         switch (super.status) {
            case 0:
            case 1:
               this.IO1I++;
               if (this.IO1I > this.IIl[13].length - 1) {
                  this.IO1I = this.IIl[13].length - 1;
               }

               this.I_0O = this.IIl[13][this.IO1I];
               if (super.I1 != this.I_0I || super.I1I != this.I_0l) {
                  super.I1 = super.I1 + (this.I_0I - super.I1) / 4;
                  super.I1I = super.I1I + (this.I_0l - super.I1I) / 4;
               }
               break;
            case 2:
               this.IIIl(this.IIl[0]);
               if (super.I1 != this.I_0I || super.I1I != this.I_0l) {
                  super.I1 = super.I1 + (this.I_0I - super.I1) / 4;
                  super.I1I = super.I1I + (this.I_0l - super.I1I) / 4;
               }

               return;
            case 3:
               this.IOl_();
               return;
            case 4:
            default:
               break;
            case 5:
               super.llIo = 0;
               this.IOlO();
               return;
            case 6:
               super.llIo = 0;
               super.IIII++;
               super.I1I = super.I1I + super.IIII;
               if (super.I1I >= super.llI0) {
                  super.I1I = super.llI0;
                  super.IIII = 0;
                  super.status = 5;
                  return;
               }
               break;
            case 7:
               super.IIlO();
               return;
         }
      }
   }

   @Override
   public void IIIl(Ilol var1) {
      super.IIlO = var1;
      super.IIII = 0;
      super.IIIl = 0;
      super.status = 3;
      this.IO1I = 0;
      int var2 = var1.I_o_;
      int var3 = var1.I_oO;
      if (I_Ol.II1(var2 - super.I1) < super.Iol << 1 && I_Ol.II1(var3 - super.I1I) < super.IIl << 1) {
         if (super.I1 < var2) {
            super.I1 = var2 - super.Iol;
         } else {
            super.I1 = var2 + super.Iol;
         }

         super.III1 = 0;
      } else {
         super.III1 = 1;
      }
   }

   public void I001() {
      super.status = 4;
   }

   public void II(Ilol[] var1, int[] var2, byte var3, byte var4) {
      this.III_ = var1;
      this.I11l = var2;
      this.IIo1 = var3;
      super.llI_ = var4;
      super.status = 3;
      if (super.I1 != this.I_0I || super.I1I != this.I_0l) {
         super.I1 = super.I1 + (this.I_0I - super.I1) / 4;
         super.I1I = super.I1I + (this.I_0l - super.I1I) / 4;
      }
   }

   @Override
   public void IOl_() {
      if (this.IO1I == this.IIl[this.IIo1 + 1].length - 1) {
         super.status = 2;
      }

      this.IIIl(this.IIl[this.IIo1 + 1]);
      if (this.IO1I == this.IIl[15][this.IIo1 - 1]) {
         for (int var1 = 0; var1 < this.III_.length; var1++) {
            this.III_[var1].II(this.I11l[var1], 0, false, false);
            I_0.III(this.IIl[16][this.IIo1 - 1], this.III_[var1].I_o_, this.III_[var1].I_oO, 1);
         }
      }
   }

   @Override
   public void IOlO() {
      this.IIIl(this.IIl[1]);
      byte var1 = I_I_.II[super.I1ll].IIoI;
      int var2 = I_I_.II[super.I1ll].IIoI;
      if (I_Ol.II1(super.I1 - this.I_0I) < var1) {
         var2 = I_Ol.II1(super.I1 - this.I_0I);
      }

      super.I1 = super.I1 + (super.I1 < this.I_0I ? var2 : -var2);
      super.I1I = this.I_0l;
      if (super.I1 < this.I_0I) {
         super.llI_ = 1;
      } else if (super.I1 > this.I_0I) {
         super.llI_ = -1;
      }

      if (I_Ol.II1(super.I1 - this.I_0I) <= 1) {
         super.I1 = this.I_0I;
         super.status = 2;
      }
   }

   @Override
   public final boolean II_o() {
      if (super.I1 < I1_I.Io1) {
         return false;
      } else if (super.I1 > I1_I.Io1 + I1_I.I_0) {
         return false;
      } else if (super.I1I < I1_I.Io1I) {
         return false;
      } else {
         return super.I1I > I1_I.Io1I + I1_I.IIO + 30 ? false : super.status != 0;
      }
   }

   @Override
   public final boolean IIO() {
      return super.status != 0;
   }

   @Override
   public final boolean IIOI() {
      return super.I0Il || super.II0o > 0;
   }

   @Override
   public void II(IO1l var1) {
      if (I_I_.II[super.I1ll].II != null && !super.I0I0) {
         if (super.I_O_) {
            if (!super.IOo0) {
               I_I_.II[super.I1ll].II.II(var1, this.I_0O, super.I10I, super.IIl_, super.llI_ == 1 ? 0 : 1, 2);
            } else {
               I_oo.IIII(var1, super.IIO_, super.I10I, super.IIl_, super.llI_ == 1 ? 0 : 2, 33);
            }
         } else {
            if (this.I0I_) {
               byte var2 = IOlO.IlI0;
               if ((IOlO.l1oI < 114 || IOlO.l1oI > 120) && IOlO.l1oI != 127 && IOlO.l1oI != 128) {
                  if (IOlO.IIIl(this.lll_ + var2 / 2, this.I_01 + 1, 4)) {
                     var1.IIIO(this.lll_ / var2 * var2, (this.I_01 - 30) / var2 * var2, var2, 100);
                  } else if (IOlO.IIIo((this.lll_ - var2 / 2) / var2, (this.I_01 + 1) / var2) == 0) {
                     var1.IIIO(this.lll_ / var2 * var2, (this.I_01 - 30) / var2 * var2, 100, 100);
                  } else if (IOlO.IIIo((this.lll_ + var2 / 2) / var2, (this.I_01 + 1) / var2) == 0) {
                     var1.IIIO(this.lll_ / var2 * var2, (this.I_01 - 30) / var2 * var2, var2, 100);
                  } else if (IOlO.IIIl(this.lll_ - var2 / 2, this.I_01 + 1, 8)) {
                     var1.IIIO(this.lll_ / 24 * var2, (this.I_01 - 30) / var2 * var2, var2, 100);
                  }
               }

               var1.II(III0, this.lll_, this.I_01 - 5, 3);
               var1.IIIO(I1_I.Io1, I1_I.Io1I - II.II10, I1_I.I_0, I1_I.IIO + 2 * II.II10);
            }

            var1.IIl0(0, II.II10);
            if (!super.IOo0) {
               if (this.I_ol == -1) {
                  this.I_ol = super.I1I;
               }

               if (IOlO.IIIl(super.I1 + 33, super.I1I, 4)) {
                  this.IIIo = IOlO.II1l(super.I1 + 33) - 33;
                  this.I_o1 = IOlO.II1l(super.I1 + 33);
                  if (super.I1 > this.IIIo && super.I1 < this.I_o1 && this.I_o1 != -1) {
                     super.I1 = this.IIIo;
                  }
               }

               if (super.I1I < this.I_ol && this.I_ol != -1) {
                  this.I_ol = super.I1I;
                  super.I1 += 33;
               }

               if (super.I1I > this.I_ol) {
                  this.I_ol = super.I1I;
                  super.I1 -= 33;
               }

               I_I_.II[super.I1ll].II.II(var1, this.I_0O, super.I1, super.I1I, super.llI_ == 1 ? 0 : 1, 2);
            } else {
               I_oo.IIII(var1, super.IIO_, super.I1, super.I1I - 9, super.llI_ == 1 ? 0 : 2, 33);
            }

            var1.IIl0(0, -II.II10);
            if (super.llIl > 0) {
               int var12 = IO1l.II(super.Il0I);
               int var3 = IO1l.III(super.Il0I);
               int var4 = var12;
               int var5 = super.I1 - var12;
               int var6 = super.I1I - super.IIl - 5;
               int var7;
               int var8 = var7 = (var12 << 1) * super.I10o / 100;
               if (super.I1o >= super.I10o) {
                  int var9 = super.I1o;
                  int var10;
                  if (II.IIIO % 6 > 3) {
                     int var11 = this.llll;
                     var10 = var11;
                     this.llll = var11 + 1;
                  } else {
                     var10 = this.llll;
                  }

                  var8 = var12 * (super.I1o = var9 - var10) / 100;
                  if (super.I1o <= 0) {
                     super.I1o = 0;
                  }

                  if (super.I1o < super.I10o) {
                     super.I1o = super.I10o;
                  }

                  if (this.llll >= 3) {
                     this.llll = 3;
                  }
               }

               if (var7 > var12) {
                  if ((var7 = var7 - var12) <= 0) {
                     var7 = 0;
                  }
               } else {
                  var4 = var7;
                  var7 = 0;
               }

               var1.II(I1_I.Il1_, var5, var6, 20);
               var1.II(I1_I.Il1_, var5 + var12, var6, 20);
               var1.Illl(16777215);
               var1.III_(var5, var6, var8, 2);
               var1.II(super.Il0I, 0, 0, var4, var3, 0, var5, var6, 20);
               var1.II(super.Il0I, 0, 0, var7, var3, 0, var5 + var12, var6, 20);
            }
         }
      }
   }

   @Override
   public void IOl0() {
      super.llIl = 0;
      super.llIl = 0;
      super.status = 1;
      super.IIII = -3;
      super.IIIl = -super.llI_;
      super.III1 = 0;
   }

   @Override
   public void IIII(I_I_ var1) {
      super.IIlO = null;
      super.IIII = 0;
      super.IIIl = 0;
      super.status = 3;
      this.IO1I = 0;
      int var2 = var1.I1;
      int var3 = var1.I1I;
      if (I_Ol.II1(var2 - super.I1) < super.Iol << 1 && I_Ol.II1(var3 - super.I1I) < super.IIl << 1) {
         if (super.I1 < var2) {
            super.I1 = var2 - super.Iol;
         } else {
            super.I1 = var2 + super.Iol;
         }

         super.III1 = 0;
      } else {
         super.III1 = 1;
      }
   }

   @Override
   public final int IIlo() {
      return super.I1;
   }

   @Override
   public final int II1() {
      return super.I1I;
   }

   @Override
   public final int II1I() {
      return super.IIl;
   }

   @Override
   public final int II1l() {
      return super.Iol;
   }

   @Override
   public void IOlo() {
      if (super.status == 5) {
         super.status = 2;
         super.IIII = super.IIIl = super.III1 = 0;
      }
   }

   @Override
   public final boolean IIOl() {
      return super.status == 0 || super.status == 1;
   }

   @Override
   public void IO1() {
      if (super.IIO_ != 0) {
         super.IIO_ = 0;
      }
   }

   @Override
   public void IO1I() {
   }

   @Override
   public void IO1l() {
   }

   public void IIII(short var1, short var2) {
      if (var2 != -1) {
         if (I_Ol.II(super.I1, super.I1I, this.I_0I, this.I_0l) > 100) {
            super.I1 = var1;
            super.I1I = var2;
            super.status = 2;
         } else {
            this.I_0I = var1;
            this.I_0l = var2;
            super.status = 5;
         }
      } else {
         this.I_0I = var1;
         super.status = 5;
      }
   }

   @Override
   public void IOo() {
      try {
         this.IIl = (int[][])I1I1.IIIl.get(String.valueOf(super.I1ll));
         super.Iol = I_I_.II[super.I1ll].II.IIOI;
         super.IIl = I_I_.II[super.I1ll].II.IIOl;
      } catch (Exception var2) {
      }
   }

   public void I00_() {
      super.status = 0;
   }

   static {
      IO10.IIII(IlO("䀱䁐䀽䀒䃴䃰䂵䂖䅱䅐䅻䄞䇫䇥䆵䆗䉺䉘䈾䈎䊸䋍䊥䊈䍤䍭䌔䍍䏲䏏䎧", 16414));
   }
}
