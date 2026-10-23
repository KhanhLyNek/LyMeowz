package main;

import java.util.Random;

public final class I_lI extends I1l1 {
   private int I_0;
   private I1Io II;
   public static Random III = new Random(System.currentTimeMillis());
   private int IIOI;
   private int IIOl;
   private int IIlI;
   private int IIO1;
   private int IIO_;
   private int IoII;
   private boolean I1ll = false;
   private int IIOo;
   private int II0;
   private Ilol IIlo;
   private I_lO II0_ = new I_lO(Il_O("빉븚븜뻮뻏뺩", 48703));
   private int IIII = 0;
   private int IIIl = 0;
   private static int[] I11 = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   public static final int[] I11I = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
   public static final byte[] IIl_ = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};

   public static void II(int var0, int var1, boolean var2, int var3, int var4, Ilol var5, int var6) {
      I1l1.II1_.addElement(new I_lI(var0, var1, var2, var3, var4, var5, var6));
   }

   private I_lI(int var1, int var2, boolean var3, int var4, int var5, Ilol var6, int var7) {
      this.II = I1_I.II[var7];
      this.IIO1 = var1;
      this.IIO_ = var2;
      this.IIOo = var4;
      this.II0 = var5;
      this.IIlo = var6;
      this.I_0 = this.II.IIO1;
      int var8 = I_Ol.III1(var6.I_o_ - var1, var6.I_oO - var2);
      this.IIOI = var8;
      this.IIOl = this.I_0 * I_Ol.IIl1(var8) >> 10;
      this.IIlI = this.I_0 * I_Ol.IIll(var8) >> 10;
      if (var1 >= I1_I.Io1 && var1 <= I1_I.Io1 + II.IIl) {
         IO.II();
      }
   }

   @Override
   public void IIlO() {
      for (int var1 = 0; var1 < this.II.II10; var1++) {
         if (this.II.III_.length > 0) {
            this.II0_.addElement(new I_o0(this.IIO1, this.IIO_));
         }

         this.IIII = (this.IIlo != null ? this.IIlo.I_o_ : 0) - this.IIO1;
         this.IIIl = (this.IIlo != null ? this.IIlo.I_oO : 0) - 10 - this.IIO_;
         short var2 = 60;
         if (IOlO.l1oI == 0) {
            var2 = 600;
         }

         this.IoII++;
         if (this.IIlo != null && (this.IIlo.IOIl == 5 || this.IIlo.IOIl == 14) || this.IIlo == null) {
            this.IIO1 = this.IIO1 + ((this.IIlo != null ? this.IIlo.I_o_ : 0) - this.IIO1) / 2;
            this.IIO_ = this.IIO_ + ((this.IIlo != null ? this.IIlo.I_oO : 0) - this.IIO_) / 2;
         }

         if (I_Ol.II1(this.IIII) < 16 && I_Ol.II1(this.IIIl) < 16 || this.IoII > var2) {
            if (this.IIlo != null && this.IIlo.IOI_ >= 0 && this.II0 != -1) {
               if (this.II0 != -100) {
                  this.IIlo.II(this.IIOo, this.II0, false, true);
               } else {
                  I_0.II(80, this.IIlo, 1);
               }
            }

            I1l1.II1_.removeElement(this);
            if (this.II0 != -100) {
               I_0.II(81, this.IIlo, 1);
               if (this.IIO1 >= I1_I.Io1 && this.IIO1 <= I1_I.Io1 + II.IIl) {
                  IO.II();
               }
            }

            return;
         }

         int var3;
         if (Math.abs((var3 = I_Ol.III1(this.IIII, this.IIIl)) - this.IIOI) < 90 || this.IIII * this.IIII + this.IIIl * this.IIIl > 4096) {
            if (Math.abs(var3 - this.IIOI) < 15) {
               this.IIOI = var3;
            } else if ((var3 - this.IIOI < 0 || var3 - this.IIOI >= 180) && var3 - this.IIOI >= -180) {
               this.IIOI = I_Ol.IIl_(this.IIOI - 15);
            } else {
               this.IIOI = I_Ol.IIl_(this.IIOI + 15);
            }
         }

         if (this.I_0 < 8192) {
            this.I_0 += 1024;
         }

         this.IIOl = this.I_0 * I_Ol.IIl1(this.IIOI) >> 10;
         this.IIlI = this.I_0 * I_Ol.IIll(this.IIOI) >> 10;
         this.IIII = this.IIII + this.IIOl;
         var3 = this.IIII >> 10;
         this.IIO1 += var3;
         this.IIII &= 1023;
         this.IIIl = this.IIIl + this.IIlI;
         var3 = this.IIIl >> 10;
         this.IIO_ += var3;
         this.IIIl &= 1023;
      }

      for (int var4 = 0; var4 < this.II0_.size(); var4++) {
         I_o0 var5;
         (var5 = (I_o0)this.II0_.elementAt(var4)).II0I++;
         if (var5.II0I >= this.II.III_.length) {
            this.II0_.removeElementAt(var4);
         }
      }
   }

   public static int III0(int var0) {
      for (int var1 = 0; var1 < I11.length - 1; var1++) {
         if (var0 >= I11[var1] && var0 <= I11[var1 + 1]) {
            if (var1 >= 16) {
               return 0;
            }

            return var1;
         }
      }

      return 0;
   }

   @Override
   public void III_(IO1l var1) {
      int var2 = III0(360 - this.IIOI);
      byte var3 = IIl_[var2];
      var2 = I11I[var2];

      for (int var4 = this.II0_.size() / 2; var4 < this.II0_.size(); var4++) {
         I_o0 var5 = (I_o0)this.II0_.elementAt(var4);
         I_oo.IIII(var1, this.II.IIIO[var5.II0I], var5.I_O0, var5.I_Oo, 0, 3);
      }

      int var8 = II.IIIO % this.II.IIII.length;
      I_oo.IIII(var1, this.II.IIII[var8][var3], this.IIO1, this.IIO_, var2, 3);

      for (int var6 = 0; var6 < this.II0_.size(); var6++) {
         I_o0 var9 = (I_o0)this.II0_.elementAt(var6);
         I_oo.IIII(var1, this.II.III_[var9.II0I], var9.I_O0, var9.I_Oo, 0, 3);
      }

      I_oo.IIII(var1, this.II.III[var8][var3], this.IIO1, this.IIO_, var2, 3);

      for (int var11 = 0; var11 < this.II0_.size(); var11++) {
         I_o0 var10 = (I_o0)this.II0_.elementAt(var11);
         if (I_Ol.II1(III.nextInt(100)) < this.II.II1O) {
            I_oo.IIII(var1, II.IIIO % 2 == 0 ? this.II.III0[var10.II0I] : this.II.IIIo[var10.II0I], var10.I_O0, var10.I_Oo, 0, 3);
         }
      }
   }
}
