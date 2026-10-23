package main;

public final class I__l {
   private Ilol II1l;
   private I1Io III;
   private I_lO II_I = new I_lO(IlOO("⿷\u2fe4\u2ffe⾌⾩く", 12161));
   private int IIO;
   private int IIOI;
   private int IIOl;
   private int IIlI;
   private int IIO1;
   private int IIO_;
   private int IoII;
   private int IIO0 = 0;
   private int IIOo = 0;
   private boolean IIl = false;
   private boolean I01o = true;
   public I_ol IIII;

   public I__l(Ilol var1, int var2, I_ol var3, int var4, int var5) {
      this.IIII = var3;
      this.II1l = var1;
      this.III = I1_I.II[var2];
      this.IIlI = this.III.IIO1;
      this.IIO1 = var4;
      this.IIO_ = var5;
      I1_O var6;
      if (var1.IIII == null) {
         var6 = var1.IIIl;
      } else {
         var6 = var1.IIII;
      }

      var2 = I_Ol.III1(var6.IIlo() - var4, var6.II1() - var5);
      this.IIO = var2;
      this.IIOI = this.IIlI * I_Ol.IIl1(var2) >> 10;
      this.IIOl = this.IIlI * I_Ol.IIll(var2) >> 10;
   }

   public void IIl1() {
      if (this.I01o) {
         if (this.II1l.IIII == null && this.II1l.IIIl == null) {
            this.IOlI();
         } else {
            I1_O var1;
            if (this.II1l.IIII == null) {
               var1 = this.II1l.IIIl;
            } else {
               var1 = this.II1l.IIII;
            }

            for (int var2 = 0; var2 < this.III.II10; var2++) {
               if (this.III.III_.length > 0) {
                  this.II_I.addElement(new I_o0(this.IIO1, this.IIO_));
               }

               int var3 = this.II1l.IIlo() > var1.IIlo() ? 10 : -10;
               this.IIO0 = var1.IIlo() + var3 - this.IIO1;
               this.IIOo = var1.II1() - var1.II1I() / 2 - this.IIO_;
               this.IoII++;
               if (I_Ol.II1(this.IIO0) < 20 && I_Ol.II1(this.IIOo) < 20) {
                  if (this.II1l.IIIl != null && this.II1l.IIIl.I1_) {
                     this.II1l.IIIl.II(this.II1l.IIIl.II10, 0, this.II1l.IIIl.I11_, this.II1l.IIIl.I111);
                  }

                  this.IOlI();
                  return;
               }

               if (Math.abs((var3 = I_Ol.III1(this.IIO0, this.IIOo)) - this.IIO) < 90 || this.IIO0 * this.IIO0 + this.IIOo * this.IIOo > 4096) {
                  if (Math.abs(var3 - this.IIO) < 15) {
                     this.IIO = var3;
                  } else if ((var3 - this.IIO < 0 || var3 - this.IIO >= 180) && var3 - this.IIO >= -180) {
                     this.IIO = I_Ol.IIl_(this.IIO - 15);
                  } else {
                     this.IIO = I_Ol.IIl_(this.IIO + 15);
                  }
               }

               if (this.IIlI < 8192) {
                  this.IIlI += 1024;
               }

               this.IIOI = this.IIlI * I_Ol.IIl1(this.IIO) >> 10;
               this.IIOl = this.IIlI * I_Ol.IIll(this.IIO) >> 10;
               this.IIO0 = this.IIO0 + this.IIOI;
               var3 = this.IIO0 >> 10;
               this.IIO1 += var3;
               this.IIO0 &= 1023;
               this.IIOo = this.IIOo + this.IIOl;
               var3 = this.IIOo >> 10;
               this.IIO_ += var3;
               this.IIOo &= 1023;
            }

            for (int var4 = 0; var4 < this.II_I.size(); var4++) {
               I_o0 var8;
               (var8 = (I_o0)this.II_I.elementAt(var4)).II0I++;
               if (var8.II0I >= this.III.III_.length) {
                  this.II_I.removeElementAt(var4);
               }
            }
         }
      }
   }

   private void IOlI() {
      I_Ol.II__(IlOO("⿄\u2fee⿻\u2ffe⾰す〚", 12161));
      if (!this.II1l.I1oI && this.IIO1 >= I1_I.Io1 && this.IIO1 <= I1_I.Io1 + II.IIl) {
         IO.II();
      }

      this.II1l.IOoI();
      if (this.II1l.I1oI) {
         this.II1l.I1oI = false;
         if (this.II1l.I10l && this.II1l.I1_ && this.II1l.IOIl != 14 && this.II1l.IOIl != 5) {
            this.II1l.I10l = false;
         }

         I1_I.II().IIl(this.IIO1, this.IIO_);
      }

      this.II1l.II = null;
      this.II1l.I1o = false;
      this.II1l.II = null;
      this.II1l.III = null;
   }

   public void II(IO1l var1) {
      if (this.I01o) {
         int var2 = I_lI.III0(360 - this.IIO);
         byte var3 = I_lI.IIl_[var2];
         var2 = I_lI.I11I[var2];

         for (int var4 = this.II_I.size() / 2; var4 < this.II_I.size(); var4++) {
            I_o0 var5 = (I_o0)this.II_I.elementAt(var4);
            I_oo.IIII(var1, this.III.IIIO[var5.II0I], var5.I_O0, var5.I_Oo, 0, 3);
         }

         int var8 = II.IIIO % this.III.IIII.length;
         I_oo.IIII(var1, this.III.IIII[var8][var3], this.IIO1, this.IIO_, var2, 3);

         for (int var6 = 0; var6 < this.II_I.size(); var6++) {
            I_o0 var9 = (I_o0)this.II_I.elementAt(var6);
            I_oo.IIII(var1, this.III.III_[var9.II0I], var9.I_O0, var9.I_Oo, 0, 3);
         }

         I_oo.IIII(var1, this.III.III[var8][var3], this.IIO1, this.IIO_, var2, 3);

         for (int var11 = 0; var11 < this.II_I.size(); var11++) {
            I_o0 var10 = (I_o0)this.II_I.elementAt(var11);
            if (I_Ol.II1(I_lI.III.nextInt(100)) < this.III.II1O) {
               I_oo.IIII(var1, II.IIIO % 2 == 0 ? this.III.III0[var10.II0I] : this.III.IIIo[var10.II0I], var10.I_O0, var10.I_Oo, 0, 3);
            }
         }

         var1.Illl(16711680);
      }
   }
}
