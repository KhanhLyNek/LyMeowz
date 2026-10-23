package main;

import javax.microedition.lcdui.Image;

public final class Ilo extends I_I_ implements I1_O {
   private static Image III0 = IO10.IIII(II00("ꍉꏨꏅꎪꎌꑈꑍꑞꐹꐘ꒳\ua4c8꒲꒘ꕼꕘꔡꔷꗽꗔꗼꖁ꙾Ꙉ", 41830));
   private static I1l0 III;
   public int II0I;
   public boolean I1l1;
   private int I_01;
   private int I_0_;
   private boolean II1;
   private int I_0O;
   private boolean I1IO = true;
   private int I_o;
   private int I_oI;
   private boolean I1l_;
   private boolean I1lO;
   private int IIIo;
   private int I_ol;
   private Ilol[] III;
   private int[] II01;
   private byte IIII;
   private int[] IIoo = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
   private int[] Il = new int[]{37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 40, 39, 39, 39, 38, 38, 38};
   private int[] IlI;
   private int[] IlII;
   private int[] IlIl;
   private int[] IlI1;
   private int[] IlI_;
   private int[] IlIO;
   private int[] IlI0;
   private boolean I1l0;

   public void IO1_() {
      III = null;
      III = new I1l0();
      String var1 = II00("ꍉꏽ", 41830) + IO1l.l_I0 + II00("ꍉꏠꏂꎥꎇꑢꑔꑛꐿꐉꓽ꒔", 41830) + 100 + II00("ꍉꏡꏅꎷꎃ", 41830);

      try {
         III.II_(var1);
         III.II01 = IO10.IIIl(II00("ꍉꏠꏂꎥꎇꑢꑔꑛꐿꐉꓽ꒔ꓫ\ua4c9ꔨꔘꔿꔘꗳꖝꖢꖟꙷ", 41830));
      } catch (Exception var3) {
         I_0_.II().II0o(this.I1ll);
      }

      this.status = 2;
      this.Iol = III.IIOI;
      this.IIl = III.IIOl;
   }

   @Override
   public void II(short var1) {
      this.IOo0 = true;
      this.IIO_ = var1;
   }

   @Override
   public void IOll() {
      this.IOo0 = false;
   }

   public Ilo(int var1, short var2, short var3, int var4, int var5, int var6, int var7) {
      int[] var10000 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      var10000 = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.IlI = new int[]{0, 0, 34, 34, 35, 35, 36, 36, 2, 2, 1, 1};
      this.IlII = new int[]{0, 0, 0, 4, 4, 6, 6, 9, 9, 10, 10, 13, 13, 15, 15, 17, 17, 19, 19, 21, 21, 23, 23};
      this.IlIl = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.IlI1 = new int[]{37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 16, 16, 18, 18, 20, 20, 22, 22, 24, 24};
      this.IlI_ = new int[]{37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 38};
      this.IlIO = new int[]{8, 8, 9, 9, 10, 10, 12, 12};
      this.IlI0 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      byte[] var14 = new byte[]{-1, 1};
      this.llIO = this.I1 = var2 + 20;
      this.llI0 = this.I1I = var3;
      this.lll = var1;
      this.llIl = var5;
      this.llI1 = var6;
      this.I1ll = 70;
      this.I100 = 100;
      this.I00l();
      if (var7 == 0) {
         III = null;
         III = new I1l0();
         String var10 = II00("ꍉꏽ", 41830) + IO1l.l_I0 + II00("ꍉꏠꏂꎥꎇꑢꑔꑛꐿꐉꓽ꒔", 41830) + 101 + II00("ꍉꏡꏅꎷꎃ", 41830);

         try {
            III.II_(var10);
            III.II01 = IO10.IIIl(II00("ꍉꏠꏂꎥꎇꑢꑔꑛꐿꐉꓽ꒔ꓫ\ua4c9ꔩꔘꔿꔘꗳꖝꖢꖟꙷ", 41830));
         } catch (Exception var12) {
            I_0_.II().II0o(this.I1ll);
         }

         this.Iol = III.IIOI;
         this.IIl = III.IIOl;
      }

      if (var7 == 1) {
         this.IO1_();
      }

      if (var7 == 2) {
         this.IO1_();
         this.I1l1 = true;
      }

      this.status = 2;
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
         Ilo var1 = this;
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
               this.IIIl(this.I1l1 ? this.Il : this.IIoo);
               if (II.IIIO % 5 == 0) {
                  I_0.III(167, I_Ol.III_(this.I1 - 30, this.I1 + 30), I_Ol.III_(this.II1() + 20, this.II1() + 40), 1);
               }

               if (this.I1 != this.llIO || this.I1I != this.llI0) {
                  this.I1 = this.I1 + (this.llIO - this.I1) / 4;
                  this.I1I = this.I1I + (this.llI0 - this.I1I) / 4;
               }
               break;
            case 2:
               this.IIIl(this.I1l1 ? this.Il : this.IIoo);
               if (this.I1 != this.llIO || this.I1I != this.llI0) {
                  this.I1 = this.I1 + (this.llIO - this.I1) / 4;
                  this.I1I = this.I1I + (this.llI0 - this.I1I) / 4;
               }

               return;
            case 3:
               this.IOl_();
               return;
            case 4:
               this.llIo = 0;
               if (this.I1l_) {
                  this.IIIo++;
                  this.I1I = this.I1I - this.IIIo;
                  this.IIIl(this.IlIO);
                  if (this.I1I <= -500) {
                     this.I1l_ = false;
                     this.I1lO = true;
                     this.IIIo = 0;
                  }
               }

               if (this.I1lO) {
                  this.I1 = this.II0I;
                  this.IIIo += 2;
                  this.I1I = this.I1I + this.IIIo;
                  this.IIIl(this.IlI0);
                  if (this.I1I > this.llI0) {
                     this.I1I = this.llI0;
                     this.I1lO = false;
                     this.IIIo = 0;
                     this.status = 2;
                     I1_I.lII1 = 10;
                     this.I1l0 = true;
                  }
               }

               return;
            case 5:
               this.llIo = 0;
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
      this.I_o = 0;
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
   final boolean II_0() {
      return this.I1ll >= 58 && this.I1ll <= 65 || this.I1ll == 67 || this.I1ll == 68;
   }

   public void IO1O() {
      this.status = 4;
      this.I1l_ = true;
   }

   public void II(Ilol[] var1, int[] var2, byte var3) {
      this.III = var1;
      this.II01 = var2;
      this.IIII = var3;
      this.I_o = 0;
      if (var3 < 3) {
         this.status = 3;
      }

      if (var3 == 3) {
         this.I1l_ = true;
         this.status = 4;
      }

      if (var3 == 4) {
         for (int var4 = 0; var4 < this.III.length; var4++) {
            this.III[var4].II(this.II01[var4], 0, false, false);
         }
      }

      if (var3 == 7) {
         this.status = 3;
      }
   }

   @Override
   public void IOl_() {
      if (this.IIII == 7) {
         if (this.I_o > 8) {
            this.I_o = 8;
         }

         this.IIIl(this.IlI);
         if (II.IIIO % 4 == 0) {
            I_0.III(70, this.I1 + (this.llI_ == 1 ? 15 : -15), this.I1I - 40, 1);
         }
      }

      if (this.IIII == 0) {
         if (this.I_o == this.IlI.length - 1) {
            this.status = 2;
         }

         this.llI_ = this.I1 < this.III[0].I_o_ ? 1 : -1;
         this.IIIl(this.IlI);
         if (this.I_o == 8) {
            for (int var1 = 0; var1 < this.III.length; var1++) {
               I_lI.II(this.I1 + (this.llI_ == 1 ? 45 : -45), this.I1I - 30, true, this.II01[var1], 0, this.III[var1], 24);
            }
         }
      }

      if (this.IIII == 1) {
         if (this.I_o == (this.I1l1 ? this.IlI1.length - 1 : this.IlII.length - 1)) {
            this.status = 2;
         }

         this.llI_ = this.I1 < this.III[0].I_o_ ? 1 : -1;
         this.IIIl(this.I1l1 ? this.IlI1 : this.IlII);
         this.I1 = this.I1 + (this.III[0].I_o_ - this.I1) / 4;
         this.I1I = this.I1I + (this.III[0].I_oO - this.I1I) / 4;
         if (this.I_o == 18) {
            for (int var2 = 0; var2 < this.III.length; var2++) {
               this.III[var2].II(this.II01[var2], 0, false, false);
               I_0.III(102, this.III[var2].I_o_, this.III[var2].I_oO, 1);
            }
         }
      }

      if (this.IIII == 2) {
         if (this.I_o == (this.I1l1 ? this.IlI_.length - 1 : this.IlIl.length - 1)) {
            this.status = 2;
         }

         this.llI_ = this.I1 < this.III[0].I_o_ ? 1 : -1;
         this.IIIl(this.I1l1 ? this.IlI_ : this.IlIl);
         if (this.I_o == 13) {
            I1_I.lII1 = 10;
            this.I1l0 = true;

            for (int var3 = 0; var3 < this.III.length; var3++) {
               this.III[var3].II(this.II01[var3], 0, false, false);
            }
         }
      }
   }

   @Override
   public void IOlO() {
   }

   @Override
   public final boolean II_o() {
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
   public final boolean IIO() {
      return this.status != 0;
   }

   @Override
   public final boolean IIOI() {
      return this.I0Il || this.II0o > 0;
   }

   @Override
   public void II(IO1l var1) {
      if (III != null && !this.I0I0) {
         if (this.I_O_) {
            if (!this.IOo0) {
               III.II(var1, this.I_oI, this.I10I, this.IIl_, this.llI_ == 1 ? 0 : 1, 2);
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
               III.II(var1, this.I_oI, this.I1, this.I1I, this.llI_ == 1 ? 0 : 1, 2);
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
            if (this.I1l0) {
               this.I_ol++;
               I1lI.III(new I1ll(this.IIII == 2 ? 19 : 22, this.I1 + this.I_ol * 50, this.I1I + 25, 2, 1, -1));
               I1lI.III(new I1ll(this.IIII == 2 ? 19 : 22, this.I1 - this.I_ol * 50, this.I1I + 25, 2, 1, -1));
               if (this.I_ol == 50) {
                  this.I_ol = 0;
                  this.I1l0 = false;
               }
            }
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
      this.I_o = 0;
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
   public final int IIlo() {
      return this.I1;
   }

   @Override
   public final int II1() {
      return this.I1l1 ? this.I1I - 20 : this.I1I - 60;
   }

   @Override
   public final int II1I() {
      return 40;
   }

   @Override
   public final int II1l() {
      return 60;
   }

   @Override
   public void IOlo() {
      if (this.status == 5) {
         this.status = 2;
         this.IIII = this.IIIl = this.III1 = 0;
      }
   }

   @Override
   public final boolean IIOl() {
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
}
