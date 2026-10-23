package main;

public final class I1oO extends Ilol {
   private static I1l0 IIII;
   private static I1l0 IIIl;
   private int I_00 = 0;
   private int I_0;
   private boolean IOoI;
   private I1ll IIII;
   private Ilol IIl_;
   private int IIlI;
   private int IIO1;
   private Ilol[] III1;
   private int[] IIoI;
   private int IIO0;
   private int[] IIOO = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
   private int[] IIO0 = new int[]{0, 0, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 10, 10};
   private int[] I1l = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12};
   private int[] I1lI = new int[]{13, 13, 14, 14, 15, 15, 16, 16};
   private int[][] III_ = new int[][]{this.IIOO, this.IIO0, this.I1l, this.I1lI};
   private byte II0O = -1;
   private int I_0o;
   private int lIo0;

   public void IIII(int var1) {
      this.IIII = new I1ll(105, this.I_o_, this.I_oO + 20, 2, 1, -1);
      I1lI.III(this.IIII);
      if (var1 == Ilol.II().IOI_) {
         this.IIl_ = Ilol.II();
      } else {
         this.IIl_ = I1_I.II(var1);
      }
   }

   @Override
   public void IIII(int[] var1) {
      if (this.II0O == 0) {
         if (this.I_00 == 11) {
            this.IOoI = true;
            I1lI.III(new I1ll(19, this.I_o_, this.I_oO + 20, 2, 1, -1));
         }

         if (this.I_00 >= var1.length - 1) {
            this.II0O = 2;
            return;
         }
      }

      if (this.II0O == 1 && this.I_00 == var1.length - 1) {
         this.II0O = 3;
         this.I_oO -= 15;
      } else {
         this.I_00++;
         if (this.I_00 > var1.length - 1) {
            this.I_00 = 0;
         }

         this.I_0o = var1[this.I_00];
      }
   }

   public I1oO() {
      IIII = null;
      IIII = new I1l0();
      String var1 = Il10("諎譸", 35553) + IO1l.l_I0 + Il10("諎譥譹識謸謟误诞许讌豶谙", 35553) + 102 + Il10("諎譤譾譊謼", 35553);

      try {
         IIII.II_(var1);
         IIII.II01 = IO10.IIIl(Il10("諎譥譹識謸謟误诞许讌豶谙豤豄財貝貸貝赨贀贽贂跬", 35553));
      } catch (Exception var4) {
      }

      IIIl = null;
      IIIl = new I1l0();
      var1 = Il10("諎譸", 35553) + IO1l.l_I0 + Il10("諎譥譹識謸謟误诞许讌豶谙", 35553) + 103 + Il10("諎譤譾譊謼", 35553);

      try {
         IIIl.II_(var1);
         IIIl.II01 = IO10.IIIl(Il10("諎譥譹識謸謟误诞许讌豶谙豤豄負貝貸貝赨贀贽贂跬", 35553));
      } catch (Exception var3) {
      }
   }

   public void II(byte var1, short var2, short var3, Ilol[] var4, int[] var5) {
      this.II0O = var1;
      this.IIlI = var2;
      this.IIO1 = var3;
      this.I_0 = this.IOI1;
      this.IOI1 = this.IIlI > this.I_o_ ? 1 : -1;
      this.III1 = var4;
      this.IIoI = var5;
   }

   @Override
   public void IIl1() {
      if (this.IIl_ != null) {
         if (this.IIII.IIO >= 30) {
            I1ll var1 = this.IIII;
            var1.IIOI = var1.IIOI + (this.I_o_ - this.IIII.IIOI) / 4;
            var1 = this.IIII;
            var1.IIOl = var1.IIOl + (this.I_oO - this.IIII.IIOl) / 4;
            this.IIl_.I_o_ = this.IIII.IIOI;
            this.IIl_.I_oO = this.IIII.IIOl;
            this.IIl_.I1oO = true;
         } else {
            this.IIII.IIO_ = this.IIII.IIOI > this.IIl_.I_o_ ? 1 : 0;
            I1ll var4 = this.IIII;
            var4.IIOI = var4.IIOI + (this.IIl_.I_o_ - this.IIII.IIOI) / 3;
            var4 = this.IIII;
            var4.IIOl = var4.IIOl + (this.IIl_.I_oO - this.IIII.IIOl) / 3;
         }
      }

      if (this.II0O == -1) {
         this.IIl1();
      } else {
         if (this.II0O == 0 && this.IOoI && II.IIIO % 2 == 0) {
            this.IIO0 = this.IIO0 + (this.IIlI > this.I_o_ ? 30 : -30);
            I1ll var6;
            (var6 = new I1ll(103, this.I_o_ + this.IIO0, this.I_oO + 20, 2, 1, -1)).IIO_ = this.IIlI > this.I_o_ ? 0 : 1;
            I1lI.III(var6);
            if (this.IOI1 == 1 && this.I_o_ + this.IIO0 >= this.IIlI || this.IOI1 == -1 && this.I_o_ + this.IIO0 <= this.IIlI) {
               this.IOoI = false;
               this.II0O = -1;
               this.IIO0 = 0;
               this.I_00 = 0;
               this.IOI1 = this.I_0;

               for (int var2 = 0; var2 < this.III1.length; var2++) {
                  this.III1[var2].II(this.IIoI[var2], 0, false, false);
               }
            }
         }

         if (this.II0O == 3) {
            this.IIlI = this.III1[this.lIo0].I_o_;
            this.IIO1 = this.III1[this.lIo0].I_oO;
            this.I_o_ = this.I_o_ + (this.IIlI - this.I_o_) / 3;
            this.I_oO = this.I_oO + (this.IIO1 - this.I_oO) / 3;
            if (II.IIIO % 5 == 0) {
               I1lI.III(new I1ll(19, this.I_o_, this.I_oO, 2, 1, -1));
            }

            if (I_Ol.II1(this.I_o_ - this.IIlI) <= 20 && I_Ol.II1(this.I_oO - this.IIO1) <= 20) {
               this.I_o_ = this.IIlI;
               this.I_oO = this.IIO1;
               this.III1[this.lIo0].II(this.IIoI[this.lIo0], 0, false, false);
               this.lIo0++;
               if (this.lIo0 == this.III1.length) {
                  this.II0O = -1;
                  this.lIo0 = 0;
               }
            }
         }
      }
   }

   @Override
   public void II(IO1l var1) {
      if (this.II0O == -1) {
         this.II(var1);
      } else {
         this.II1I(var1);
         var1.IIl0(0, II.II10);
         this.IIII(this.III_[this.II0O]);
         if (this.II0O != 0 && this.II0O != 1) {
            IIIl.II(var1, this.I_0o, this.I_o_, this.I_oO + this.IOo1, this.IOI1 == 1 ? 0 : 1, 2);
         } else {
            IIII.II(var1, this.I_0o, this.I_o_, this.I_oO + this.IOo1, this.IOI1 == 1 ? 0 : 1, 2);
         }

         var1.IIl0(0, -II.II10);
      }
   }
}
