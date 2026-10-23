package main;

import javax.microedition.lcdui.Image;

public final class IOlo extends IO1_ implements I1_1 {
   private static IOlo II;
   private static Image IIO1 = IO10.IIII(I1IO("宂审宊屣屇封尊峧峂岡峌嵯嵘崔崺崆巩巉嶩嶟師幜帱布廡廜庶庀彂彘弦弞徣応徥徍", 23469));
   private static Image IIO_ = IO10.IIII(I1IO("宂审宊屣屇封尊峧峂岡峌嵶嵀崵崱崙巼巑巵嶊幷幟", 23469));
   public byte IIO1;
   private int IIO1 = 5;
   private int[] IIo;
   private int[] IIoI;
   private int[] Il_o;
   private int[] IIOO;
   private int II0;
   private int II = 20;
   public short IIOI;
   public short IIII;
   public long I1;
   public long IlO;
   private boolean I__l;
   private boolean I00;
   private int IIIl;

   public IOlo() {
      this.IIo = new int[this.II];
      this.IIoI = new int[this.II];

      for (int var1 = 0; var1 < this.II; var1++) {
         this.IIo[var1] = I_Ol.III_(0, II.IIl);
         this.IIoI[var1] = var1 * (II.IIlI / this.II);
      }

      this.Il_o = new int[this.II];
      this.IIOO = new int[this.II];

      for (int var2 = 0; var2 < this.II; var2++) {
         this.Il_o[var2] = I_Ol.III_(0, II.IIl);
         this.IIOO[var2] = var2 * (II.IIlI / this.II);
      }
   }

   public static IOlo II() {
      if (II == null) {
         II = new IOlo();
      }

      return II;
   }

   @Override
   public void I0l_() {
      this.I__l = false;
      this.I00 = false;
      if (Ilol.II().II10() > 0 && this.IIO1 == 0) {
         super.III0 = new I1Il(IO11.Ioo_, this, 1, null);
      } else {
         super.III0 = null;
      }

      this.IIIl = 0;
      super.I0l_();
   }

   @Override
   public void III_(IO1l var1) {
      var1.Illl(this.IIO1 == 0 ? 0 : 3056895);
      var1.III_(0, 0, II.IIl, II.IIlI);

      for (int var2 = 0; var2 < this.II; var2++) {
         var1.Illl(this.IIO1 == 0 ? 14802654 : 11140863);
         var1.III_(this.IIo[var2], this.IIoI[var2], 10, 2);
      }

      if (this.IIO1 == 0) {
         var1.II(IIO1, 0, 0, 72, 95, 7, this.II0 + this.IIIl, II.IIlI / 2, 3);
      }

      if (this.IIO1 == 1) {
         var1.II(IIO_, 0, 0, 144, 79, 2, this.II0 + this.IIIl, II.IIlI / 2, 3);
      }

      for (int var3 = 0; var3 < this.II; var3++) {
         var1.Illl(this.IIO1 == 0 ? 14935011 : 7536127);
         var1.III_(this.Il_o[var3], this.IIOO[var3], 18, 3);
      }

      super.III_(var1);
   }

   @Override
   public void IIlO() {
      if (this.IIO1 == 0) {
         if (!this.I__l) {
            this.IIIl = II.IIl / 2 * this.IIOI / this.IIII;
         }
      } else {
         this.IIIl += 2;
      }

      I1I1.I___ = false;
      this.II0 = (((II.IIl / 2 + this.II0) / 2 + this.II0) / 2 + this.II0) / 2;
      if (this.IIO1 == 1) {
         this.II0 = 0;
      }

      for (int var2 = 0; var2 < this.II; var2++) {
         int[] var1 = this.IIo;
         var1[var2] -= this.IIO1 / 2;
         if (this.IIo[var2] < -20) {
            this.IIo[var2] = II.IIl;
         }
      }

      for (int var4 = 0; var4 < this.II; var4++) {
         int[] var3 = this.Il_o;
         var3[var4] -= this.IIO1;
         if (this.Il_o[var4] < -20) {
            this.Il_o[var4] = II.IIl;
         }
      }

      if (II.IIIO % 3 == 0) {
         this.IIO1 = this.IIO1 + (this.I__l ? 2 : 1);
      }

      if (this.IIO1 > (this.I__l ? 80 : 25)) {
         this.IIO1 = this.I__l ? 80 : 25;
      }

      this.IlO = System.currentTimeMillis();
      if (this.IlO - this.I1 >= 1000L) {
         this.IIOI++;
         this.I1 = this.IlO;
      }

      if (this.I__l) {
         this.IIIl += 3;
      }

      if (this.IIIl >= II.IIl / 2 + 30 && !this.I00) {
         this.I00 = true;
         I_0_.II().Io0l();
      }

      super.IIlO();
   }

   @Override
   public void I_Il() {
      super.I_Il();
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 1) {
         II.II(IO11.IooO, new I1Il(IO11.I_I_, this, 2, null), new I1Il(IO11.I_IO, this, 3, null));
      }

      if (var1 == 2 && Ilol.II().II10() > 0) {
         this.I__l = true;
         II.III_();
         super.III0 = null;
      }

      if (var1 == 3) {
         II.III_();
      }
   }
}
