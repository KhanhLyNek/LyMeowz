package main;

import javax.microedition.lcdui.Image;

public class Il0_ extends I_I_ implements I1_O {
   private static Image III0 = IO10.IIII(II01("⁚\u20f9⃒₻\u209f⅙⅂ℯℊ⇩ↄ↹ↁ≩≃∩−⋆⋊⊥⋏⍰⍱⍙", 8309));
   private static I1l0 II;
   public int I_0I;
   public int I_0l;
   private int I_01;
   private int I_0_;
   private boolean II1;
   private int I_0O;
   private boolean I1IO = true;
   private int I_00;
   private int I_0o;
   private Ilol[] II;
   private int[] II0;
   private byte II;
   private int[] II0I = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
   private int[] II0l = new int[]{0, 0, 0, 2, 2, 2, 3, 3, 3, 4, 4, 4};
   private int[] II01 = new int[]{0, 0, 0, 4, 4, 4, 5, 5, 5, 6, 6, 6};
   private int[] II0_ = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11};

   @Override
   public void II(short var1) {
      this.IOo0 = true;
      this.IIO_ = var1;
   }

   @Override
   public void IOll() {
      this.IOo0 = false;
   }

   public Il0_(int var1, short var2, short var3, int var4, int var5, int var6) {
      int[] var10000 = new int[]{1, 1, 7, 7};
      byte[] var12 = new byte[]{-1, 1};
      this.lll = var1;
      this.I1 = var2 + 20;
      this.I1I = var3;
      this.I_0I = this.I1;
      this.I_0l = this.I1I;
      this.llI1 = var6;
      this.llIl = var5;
      this.I1ll = 71;
      this.I100 = 100;
      this.I00l();
      II = null;
      II = new I1l0();
      String var9 = II01("⁚⃬", 8309) + IO1l.l_I0 + II01("⁚\u20f1⃕₴ₔⅳ⅛Kℌ⇸⇊⇥", 8309) + 108 + II01("⁚⃒⃰₦ₐ", 8309);

      try {
         II.II_(var9);
         II.II01 = IO10.IIIl(II01("⁚\u20f1⃕₴ₔⅳ⅛Kℌ⇸⇊⇥⇘∸∟≩∌⋩⋄⋬⊑⍮⍸", 8309));
      } catch (Exception var11) {
         I_0_.II().II0o(this.I1ll);
      }

      this.Iol = II.IIOI;
      this.IIl = II.IIOl;
      this.status = 2;
   }

   public void IIII(int[] var1) {
      this.I_00++;
      if (this.I_00 > var1.length - 1) {
         this.I_00 = 0;
      }

      this.I_0o = var1[this.I_00];
   }

   @Override
   public void IOl1() {
   }

   @Override
   public void IIlO() {
      if (this.IIO()) {
         Il0_ var1 = this;
         byte var2 = IOlO.IlI0;
         this.I_01 = this.I1;
         this.I_0O = 0;
         if (this.I_0_ > 0 && !IOlO.IIIl(this.I_01, this.I_0_, 2)) {
            if (IOlO.IIIo(this.I_01 / var2, this.I_0_ / var2) == 0) {
               this.II1 = true;
            } else if (IOlO.IIIo(this.I_01 / var2, this.I_0_ / var2) != 0 && !IOlO.IIIl(this.I_01, this.I_0_, 2)) {
               this.I_01 = this.I1;
               this.I_0_ = this.I1I;
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

         switch (this.status) {
            case 0:
            case 1:
               this.IIII(this.II0I);
               if (II.IIIO % 5 == 0) {
                  I_0.III(167, I_Ol.III_(this.I1 - 20, this.I1 + 20), I_Ol.III_(this.I1I - 40 + 20, this.I1I - 40 + 40), 1);
               }

               if (this.I1 != this.I_0I || this.I1I != this.I_0l) {
                  this.I1 = this.I1 + (this.I_0I - this.I1) / 4;
                  this.I1I = this.I1I + (this.I_0l - this.I1I) / 4;
               }
               break;
            case 2:
               this.IIII(this.II0I);
               if (this.I1 != this.I_0I || this.I1I != this.I_0l) {
                  this.I1 = this.I1 + (this.I_0I - this.I1) / 4;
                  this.I1I = this.I1I + (this.I_0l - this.I1I) / 4;
               }

               return;
            case 3:
               this.IOl_();
               return;
            case 4:
            default:
               break;
            case 5:
               this.llIo = 0;
               this.IOlO();
               return;
            case 6:
               this.llIo = 0;
               this.IIII++;
               this.I1I = this.I1I + this.IIII;
               if (this.I1I >= this.llI0) {
                  this.I1I = this.llI0;
                  this.IIII = 0;
                  this.status = 5;
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
      this.IIlO = var1;
      this.IIII = 0;
      this.IIIl = 0;
      this.status = 3;
      this.I_00 = 0;
      this.llI_ = var1.I_o_ > this.I1 ? 1 : -1;
      int var2 = var1.I_o_;
      int var3 = var1.I_oO;
      if (I_Ol.II1(var2 - this.I1) < this.Iol << 1 && I_Ol.II1(var3 - this.I1I) < this.IIl << 1) {
         if (this.I1 < var2) {
            this.I1 = var2 - this.Iol;
         } else {
            this.I1 = var2 + this.Iol;
         }

         this.III1 = 0;
      } else {
         this.III1 = 1;
      }
   }

   @Override
   boolean II_0() {
      return this.I1ll >= 58 && this.I1ll <= 65 || this.I1ll == 67 || this.I1ll == 68;
   }

   public void II(Ilol[] var1, int[] var2, byte var3) {
      this.II = var1;
      this.II0 = var2;
      this.II = var3;
      this.status = 3;
   }

   @Override
   public void IOl_() {
      if (this.II == 3) {
         if (this.I_00 == this.II01.length - 1) {
            this.status = 2;
         }

         this.llI_ = this.I1 < this.II[0].I_o_ ? 1 : -1;
         this.IIII(this.II01);
         this.I1 = this.I1 + (this.II[0].I_o_ - this.I1) / 4;
         this.I1I = this.I1I + (this.II[0].I_oO - this.I1I) / 4;
         this.I_0I = this.I1;
         if (this.I_00 == 8) {
            for (int var1 = 0; var1 < this.II.length; var1++) {
               this.II[var1].II(this.II0[var1], 0, false, false);
               I_0.III(102, this.II[var1].I_o_, this.II[var1].I_oO, 1);
            }
         }
      }

      if (this.II == 4) {
         if (this.I_00 == this.II0_.length - 1) {
            this.status = 2;
         }

         this.llI_ = this.I1 < this.II[0].I_o_ ? 1 : -1;
         this.IIII(this.II0_);
         if (this.I_00 == 8) {
            for (int var2 = 0; var2 < this.II.length; var2++) {
               this.II[var2].II(this.II0[var2], 0, false, false);
               I_0.III(102, this.II[var2].I_o_, this.II[var2].I_oO, 1);
            }
         }
      }
   }

   @Override
   public void IOlO() {
      this.IIII(this.II0l);
      this.I1 = this.I1 + (this.I1 < this.I_0I ? 2 : -2);
      this.I1I = this.I_0l;
      this.llI_ = this.I1 < this.I_0I ? 1 : -1;
      if (I_Ol.II1(this.I1 - this.I_0I) <= 1) {
         this.I1 = this.I_0I;
         this.status = 2;
      }
   }

   @Override
   public boolean II_o() {
      if (this.I1 < I1_I.Io1) {
         return false;
      } else if (this.I1 > I1_I.Io1 + I1_I.I_0) {
         return false;
      } else if (this.I1I < I1_I.Io1I) {
         return false;
      } else {
         return this.I1I > I1_I.Io1I + I1_I.IIO + 30 ? false : this.status != 0;
      }
   }

   @Override
   public boolean IIO() {
      return this.status != 0;
   }

   @Override
   public boolean IIOI() {
      return this.I0Il || this.II0o > 0;
   }

   @Override
   public void II(IO1l var1) {
      if (II != null && !this.I0I0) {
         if (this.I_O_) {
            if (!this.IOo0) {
               II.II(var1, this.I_0o, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 1, 2);
            } else {
               I_oo.IIII(var1, this.IIO_, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 2, 33);
            }
         } else {
            if (this.I1IO && this.status != 0) {
               var1.II(III0, this.I_01, this.llI0, 3);
               var1.IIIO(I1_I.Io1, I1_I.Io1I - II.II10, I1_I.I_0, I1_I.IIO + 2 * II.II10);
            }

            var1.IIl0(0, II.II10);
            if (!this.IOo0) {
               II.II(var1, this.I_0o, this.I1, this.I1I, this.llI_ == 1 ? 0 : 1, 2);
            } else {
               I_oo.IIII(var1, this.IIO_, this.I1, this.I1I - 9, this.llI_ == 1 ? 0 : 2, 33);
            }

            var1.IIl0(0, -II.II10);
            int var2 = IO1l.II(this.Il0I);
            int var3 = IO1l.III(this.Il0I);
            int var4 = var2;
            int var5 = this.I1 - var2;
            int var6 = this.I1I - this.IIl - 5;
            int var7;
            if ((var7 = (var2 << 1) * this.I10o / 100) > var2) {
               if ((var7 = var7 - var2) <= 0) {
                  var7 = 0;
               }
            } else {
               var4 = var7;
               var7 = 0;
            }

            var1.II(I1_I.Il1_, var5, var6, 20);
            var1.II(I1_I.Il1_, var5 + var2, var6, 20);
            var1.II(this.Il0I, 0, 0, var4, var3, 0, var5, var6, 20);
            var1.II(this.Il0I, 0, 0, var7, var3, 0, var5 + var2, var6, 20);
         }
      }
   }

   @Override
   public void IOl0() {
      this.llIl = 0;
      this.llIl = 0;
      this.status = 1;
      this.IIII = -3;
      this.IIIl = -this.llI_;
      this.III1 = 0;
   }

   @Override
   public void IIII(I_I_ var1) {
      this.IIlO = null;
      this.IIII = 0;
      this.IIIl = 0;
      this.status = 3;
      this.I_00 = 0;
      this.llI_ = var1.I1 > this.I1 ? 1 : -1;
      int var2 = var1.I1;
      int var3 = var1.I1I;
      if (I_Ol.II1(var2 - this.I1) < this.Iol << 1 && I_Ol.II1(var3 - this.I1I) < this.IIl << 1) {
         if (this.I1 < var2) {
            this.I1 = var2 - this.Iol;
         } else {
            this.I1 = var2 + this.Iol;
         }

         this.III1 = 0;
      } else {
         this.III1 = 1;
      }
   }

   @Override
   public int IIlo() {
      return this.I1;
   }

   @Override
   public int II1() {
      return this.I1I - 40;
   }

   @Override
   public int II1I() {
      return 40;
   }

   @Override
   public int II1l() {
      return 40;
   }

   @Override
   public void IOlo() {
      if (this.status == 5) {
         this.status = 2;
         this.IIII = this.IIIl = this.III1 = 0;
      }
   }

   @Override
   public boolean IIOl() {
      return this.status == 0 || this.status == 1;
   }

   @Override
   public void IO1() {
      if (this.IIO_ != 0) {
         this.IIO_ = 0;
      }
   }

   @Override
   public void IO1I() {
   }

   @Override
   public void IO1l() {
   }

   public void III(short var1) {
      this.I_0I = var1;
      this.status = 5;
   }

   static {
      IO10.IIII(II01("⁚\u20f9⃒₻\u209f⅙⅂ℯℊ⇩ↄ↧←≜≂∾∑⋱⋑⊧⋓⍤⍲⍑⌿⌴⏋⎔⎩⎖⑰", 8309));
   }
}
