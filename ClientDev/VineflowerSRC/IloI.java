package main;

import javax.microedition.lcdui.Image;

public final class IloI extends I_I_ implements I1_O {
   private static Image III0 = IO10.IIII(II0o("并帕延廟庻庽彾当弶引徠忝徥徍息恅怾怪惮惁惫悔慭慅", 24153));
   private static I1l0 III;
   public int II0I;
   public int I_O0;
   private int I_01;
   private int I_0_;
   private boolean II1;
   private int I_0O;
   private boolean I1IO = true;
   private int I_o;
   private int I_oI;
   private boolean I1l_;
   private int I_o1;
   private int IIIo;
   private Ilol[] IIII;
   private int[] II0l;
   private byte IIIl;
   private int[] II0_ = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
   private int[] IIoo;
   private int[] Il;
   private int[] IlI;
   private int[] IlII;
   private boolean IIl_;

   @Override
   public void II(short var1) {
      super.IOo0 = true;
      super.IIO_ = var1;
   }

   @Override
   public void IOll() {
      super.IOo0 = false;
   }

   public IloI(int var1, short var2, short var3, int var4, int var5, int var6) {
      int[] var10000 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      var10000 = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.IIoo = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9};
      this.Il = new int[]{0, 0, 0, 10, 10, 10, 11, 11, 11, 12, 12, 12};
      var10000 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.IlI = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      this.IlII = new int[]{6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      byte[] var14 = new byte[]{-1, 1};
      super.lll = var1;
      this.II0I = super.I1 = var2 + 20;
      this.I_O0 = super.I1I = var3;
      super.llI0 = var3;
      super.llIl = var5;
      super.llI1 = var6;
      super.I1ll = 72;
      super.I100 = 100;
      this.I00l();
      III = null;
      III = new I1l0();
      String var9 = II0o("并帀", 24153) + IO1l.l_I0 + II0o("并帝廱廐庰店彧彖弰弄忮征", 24153) + 109 + II0o("并帜延廂庴", 24153);

      try {
         III.II_(var9);
         III.II01 = IO10.IIIl(II0o("并帝廱廐庰店彧彖弰弄忮征忼応怲怅怠怅惠悈悵悊慤", 24153));
      } catch (Exception var11) {
         I_0_.II().II0o(super.I1ll);
      }

      super.Iol = III.IIOI;
      super.IIl = III.IIOl;
      super.status = 2;
   }

   @Override
   public void IIIl(int[] var1) {
      this.I_o++;
      if (this.I_o > var1.length - 1) {
         this.I_o = 0;
      }

      this.I_oI = var1[this.I_o];
   }

   @Override
   public void IOl1() {
   }

   @Override
   public void IIlO() {
      if (this.IIO()) {
         IloI var1 = this;
         byte var2 = IOlO.IlI0;
         this.I_01 = super.I1;
         this.I_0O = 0;
         if (this.I_0_ > 0 && !IOlO.IIIl(this.I_01, this.I_0_, 2)) {
            if (IOlO.IIIo(this.I_01 / var2, this.I_0_ / var2) == 0) {
               this.II1 = true;
            } else if (IOlO.IIIo(this.I_01 / var2, this.I_0_ / var2) != 0 && !IOlO.IIIl(this.I_01, this.I_0_, 2)) {
               this.I_01 = super.I1;
               this.I_0_ = super.I1I;
               this.II1 = false;
            }

            while (var1.II1 && var1.I_0O < 10) {
               var1.I_0O++;
               var1.I_0_ += 24;
               if (IOlO.IIIl(var1.I_01, var1.I_0_, 2)) {
                  if (var1.I_0_ % 24 != 0) {
                     var1.I_0_ = var1.I_0_ - var1.I_0_ % 24;
                  }
                  break;
               }
            }
         }

         switch (super.status) {
            case 0:
            case 1:
               this.IIIl(this.II0_);
               if (II.IIIO % 5 == 0) {
                  I_0.III(167, I_Ol.III_(super.I1 - 25, super.I1 + 25), I_Ol.III_(super.I1I - 50 + 20, super.I1I - 50 + 40), 1);
               }

               if (super.I1 != this.II0I || super.I1I != this.I_O0) {
                  super.I1 = super.I1 + (this.II0I - super.I1) / 4;
                  super.I1I = super.I1I + (this.I_O0 - super.I1I) / 4;
               }
               break;
            case 2:
               this.IIIl(this.II0_);
               if (super.I1 != this.II0I || super.I1I != this.I_O0) {
                  super.I1 = super.I1 + (this.II0I - super.I1) / 4;
                  super.I1I = super.I1I + (this.I_O0 - super.I1I) / 4;
               }

               return;
            case 3:
               this.IOl_();
               return;
            case 4:
               super.llIo = 0;
               if (this.I1l_) {
                  super.I1 = this.II0I;
                  this.I_o1 += 2;
                  super.I1I = super.I1I + this.I_o1;
                  this.IIIl(this.IlII);
                  if (super.I1I > super.llI0) {
                     super.I1I = super.llI0;
                     this.I1l_ = false;
                     this.I_o1 = 0;
                     super.status = 2;
                     I1_I.lII1 = 10;
                     this.IIl_ = true;
                  }
               }

               return;
            case 5:
               super.llIo = 0;
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
               return;
         }
      }
   }

   @Override
   public void IIII() {
   }

   @Override
   public void IIIl(Ilol var1) {
      super.IIlO = var1;
      super.IIII = 0;
      super.IIIl = 0;
      super.status = 3;
      this.I_o = 0;
      super.llI_ = var1.I_o_ > super.I1 ? 1 : -1;
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

   @Override
   final boolean II_0() {
      return super.I1ll >= 58 && super.I1ll <= 65 || super.I1ll == 67 || super.I1ll == 68;
   }

   public void II(Ilol[] var1, int[] var2, byte var3) {
      super.status = 3;
      this.IIII = var1;
      this.II0l = var2;
      this.IIIl = var3;
      this.I_o = 0;
   }

   @Override
   public void IOl_() {
      if (this.IIIl == 0) {
         if (this.I_o == this.IIoo.length - 1) {
            super.status = 2;
         }

         super.llI_ = super.I1 < this.IIII[0].I_o_ ? 1 : -1;
         this.IIIl(this.IIoo);
         super.I1 = super.I1 + (this.IIII[0].I_o_ - super.I1) / 4;
         super.I1I = super.I1I + (this.IIII[0].I_oO - super.I1I) / 4;
         this.II0I = super.I1;
         if (this.I_o == 8) {
            for (int var1 = 0; var1 < this.IIII.length; var1++) {
               this.IIII[var1].II(this.II0l[var1], 0, false, false);
               I_0.III(102, this.IIII[var1].I_o_, this.IIII[var1].I_oO, 1);
            }
         }
      }

      if (this.IIIl == 1) {
         if (this.I_o == this.Il.length - 1) {
            super.status = 2;
         }

         super.llI_ = super.I1 < this.IIII[0].I_o_ ? 1 : -1;
         this.IIIl(this.Il);
         if (this.I_o == 8) {
            for (int var2 = 0; var2 < this.IIII.length; var2++) {
               I_lI.II(super.I1 + (super.llI_ == 1 ? 45 : -45), super.I1I - 25, true, this.II0l[var2], 0, this.IIII[var2], 24);
            }
         }
      }

      if (this.IIIl == 2) {
         if (this.I_o == this.IlI.length - 1) {
            super.status = 2;
         }

         super.llI_ = super.I1 < this.IIII[0].I_o_ ? 1 : -1;
         this.IIIl(this.IlI);
         super.I1 = super.I1 + (this.IIII[0].I_o_ - super.I1) / 4;
         this.II0I = super.I1;
         this.I_O0 = super.I1I;
         if (this.I_o == 12) {
            for (int var3 = 0; var3 < this.IIII.length; var3++) {
               this.IIII[var3].II(this.II0l[var3], 0, false, false);
               I_0.III(102, this.IIII[var3].I_o_, this.IIII[var3].I_oO, 1);
            }
         }
      }
   }

   @Override
   public void IOlO() {
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
      if (III != null && !super.I0I0) {
         if (super.I_O_) {
            if (!super.IOo0) {
               III.II(var1, this.I_oI, super.I10I, super.IIl_, super.llI_ == 1 ? 0 : 1, 2);
            } else {
               I_oo.IIII(var1, super.IIO_, super.I10I, super.IIl_, super.llI_ == 1 ? 0 : 2, 33);
            }
         } else {
            if (this.I1IO && super.status != 0) {
               var1.II(III0, this.I_01, super.llI0, 3);
               var1.IIIO(I1_I.Io1, I1_I.Io1I - II.II10, I1_I.I_0, I1_I.IIO + 2 * II.II10);
            }

            var1.IIl0(0, II.II10);
            if (!super.IOo0) {
               III.II(var1, this.I_oI, super.I1, super.I1I, super.llI_ == 1 ? 0 : 1, 2);
            } else {
               I_oo.IIII(var1, super.IIO_, super.I1, super.I1I - 9, super.llI_ == 1 ? 0 : 2, 33);
            }

            var1.IIl0(0, -II.II10);
            int var2 = IO1l.II(super.Il0I);
            int var3 = IO1l.III(super.Il0I);
            int var4 = var2;
            int var5 = super.I1 - var2;
            int var6 = super.I1I - super.IIl - 5;
            int var7;
            if ((var7 = (var2 << 1) * super.I10o / 100) > var2) {
               if ((var7 = var7 - var2) <= 0) {
                  var7 = 0;
               }
            } else {
               var4 = var7;
               var7 = 0;
            }

            var1.II(I1_I.Il1_, var5, var6, 20);
            var1.II(I1_I.Il1_, var5 + var2, var6, 20);
            var1.II(super.Il0I, 0, 0, var4, var3, 0, var5, var6, 20);
            var1.II(super.Il0I, 0, 0, var7, var3, 0, var5 + var2, var6, 20);
            if (this.IIl_) {
               this.IIIo++;
               I1lI.III(new I1ll(this.IIIl == 2 ? 19 : 22, super.I1 + this.IIIo * 50, super.I1I + 25, 2, 1, -1));
               I1lI.III(new I1ll(this.IIIl == 2 ? 19 : 22, super.I1 - this.IIIo * 50, super.I1I + 25, 2, 1, -1));
               if (this.IIIo == 50) {
                  this.IIIo = 0;
                  this.IIl_ = false;
               }
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
      this.I_o = 0;
      super.llI_ = var1.I1 > super.I1 ? 1 : -1;
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
      return super.I1I - 50;
   }

   @Override
   public final int II1I() {
      return 40;
   }

   @Override
   public final int II1l() {
      return 50;
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

   static {
      IO10.IIII(II0o("并帕延廟庻庽彾当弶引徠心徴徸恮恒怽思惵惃惷悀慮慍愣愨愯憰懍憲憜", 24153));
   }
}
