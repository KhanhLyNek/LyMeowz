package main;

public final class I_l1 extends I1l {
   private String[] IIlo;
   public boolean I_1o;
   private int IIOI;
   private int IIOl = 35;
   private long Ilo_ = -1L;

   public I_l1() {
      if (II.IIl <= 176) {
         this.IIOl = 10;
      }

      if (II.IIl > 320) {
         this.IIOl = 80;
      }
   }

   public void IOlI() {
      this.II(IO11.I1O1, (I1Il)null, (I1Il)null, (I1Il)null);
      II.II = this;
      this.Ilo_ = IO10.IIII() + 5000L;
   }

   public void III() {
      II.II = this;
      this.Ilo_ = -1L;
   }

   public void II10(String var1) {
      this.IIlo = IO1I.II1l.II(var1, II.IIl - ((this.IIOl << 1) + 20));
      this.IIOI = 80;
      if (this.IIlo.length >= 5) {
         this.IIOI = this.IIlo.length * IO1I.II1l.IIOl() + 20;
      }
   }

   public void II(String var1, I1Il var2, I1Il var3, I1Il var4) {
      this.IIlo = IO1I.II1l.II(var1, II.IIl - ((this.IIOl << 1) + 20));
      super.IIIo = var2;
      super.III0 = var3;
      super.IIl = var4;
      this.IIOI = 80;
      if (this.IIlo.length >= 5) {
         this.IIOI = this.IIlo.length * IO1I.II1l.IIOl() + 20;
      }

      if (II.IIIl) {
         if (var2 != null) {
            super.IIIo.I1 = II.IIl / 2 - 68 - 5;
            super.IIIo.I1I = II.IIlI - 50;
         }

         if (var4 != null) {
            super.IIl.I1 = II.IIl / 2 + 5;
            super.IIl.I1I = II.IIlI - 50;
         }

         if (var3 != null) {
            super.III0.I1 = II.IIl / 2 - 35;
            super.III0.I1I = II.IIlI - 50;
         }
      }

      this.I_1o = false;
      this.Ilo_ = -1L;
   }

   @Override
   public void II(IO1l var1) {
      var1.IIIO(0, 0, II.IIl, II.IIlI);
      if (!I1o_.IO0_) {
         int var2 = II.IIlI - this.IIOI - 38;
         int var3 = II.IIl - (this.IIOl << 1);
         I_10.II(this.IIOl, var2, var3, this.IIOI, var1);
         var2 = var2 + (this.IIOI - this.IIlo.length * IO1I.II1l.IIOl()) / 2 - 2;
         if (this.I_1o) {
            var2 += 8;
            II.II(II.IIll, var2 - 12, var1);
         }

         var3 = 0;

         for (int var5 = var2; var3 < this.IIlo.length; var5 += IO1I.II1l.IIOl()) {
            IO1I.III_.II(var1, this.IIlo[var3], II.IIll, var5, 2);
            var3++;
         }

         super.II(var1);
      }
   }

   @Override
   public void IIl1() {
      super.IIl1();
      if (this.Ilo_ != -1L && IO10.IIII() > this.Ilo_) {
         II.III_();
      }
   }
}
