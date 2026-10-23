package main;

public final class I1II extends IO1_ implements I1_1 {
   public static I1II II;
   public IOI0[] II;
   private int I_Oo;
   private int I_0;
   private int IIO;
   private int IIOI;
   private String[] IIlI;
   private String IIo_;
   private Ilo_ II;
   private int IIO_;
   private int IoII;

   public static I1II II() {
      if (II == null) {
         II = new I1II();
      }

      return II;
   }

   @Override
   public void I0l_() {
      if (IO10.l_lI == 5 && this.II.length == 1 || IO10.l_lI == 3 && this.II.length == 1) {
         this.II = new Ilo_();
         this.II.II00 = this.IIo_;
         this.II.II.II1o = this.II[0].IIoI;
         this.II.II0O = "";
         this.II.I_10 = true;
         this.II.II.Ill(0);
         if (II.IIIl) {
            return;
         }
      } else {
         this.IIO_ = 0;
         super.I0l_();
      }
   }

   public void III(int var1, String var2) {
      this.IoII = var1;
      I1II var3 = this;
      this.IIo_ = var2;
      this.IIO = II.IIl - 20;
      if (this.IIO > 320) {
         this.IIO = 320;
      }

      I_Ol.II__(IIo0("갠갚곦곝겵곒괮", 44116) + var2);
      this.IIlI = IO1I.III_.II(var2, this.IIO - 20);
      this.I_Oo = (II.IIl - this.IIO) / 2;
      this.II = new IOI0[this.IoII];
      this.IIOI = this.II.length * 35 + (this.IIlI.length - 1) * 20 + 40;
      this.I_0 = II.IIlI - this.IIOI - 40 - (this.IIlI.length - 1) * 20;

      for (int var4 = 0; var4 < var3.II.length; var4++) {
         var3.II[var4] = new IOI0();
         var3.II[var4].II1o = "";
         var3.II[var4].II0I = var3.I_Oo + 10;
         var3.II[var4].I_O0 = var3.I_0 + 35 + (var3.IIlI.length - 1) * 20 + var4 * 35;
         var3.II[var4].l10 = var3.IIO - 20;
         var3.II[var4].l10I = IO1_.ll11 + 2;
         if (II.IIIl) {
            var3.II[0].Il_0 = false;
         } else {
            var3.II[0].Il_0 = true;
         }

         if (!II.IIIl) {
            var3.IIl = var3.II[0].IIII;
         }
      }

      var3.IIIo = new I1Il(IO11.I_I, var3, 1, null);
      var3.III0 = new I1Il(IO11.I_lI, var3, 2, null);
      if (II.IIIl) {
         var3.III0.I1 = II.IIl / 2 + 18;
         var3.IIIo.I1 = II.IIl / 2 - 85;
         var3.III0.I1I = var3.IIIo.I1I = var3.I_0 + var3.IIOI + 5;
      }

      this.I0l_();
   }

   @Override
   public void III_(IO1l var1) {
      I1_I.II().III_(var1);
      I__O.II(var1, this.I_Oo, this.I_0, this.IIO, this.IIOI, -1, true);

      for (int var2 = 0; var2 < this.IIlI.length; var2++) {
         IO1I.IIIO.II(var1, this.IIlI[var2], II.IIl / 2, this.I_0 + 15 + var2 * 20, 2);
      }

      for (int var3 = 0; var3 < this.II.length; var3++) {
         this.II[var3].III_(var1);
      }

      super.III_(var1);
   }

   @Override
   public void IIlO() {
      I1_I.II().IIlO();

      for (int var1 = 0; var1 < this.II.length; var1++) {
         this.II[var1].IIlO();
      }
   }

   @Override
   public void IIO1(int var1) {
      for (int var2 = 0; var2 < this.II.length; var2++) {
         if (this.II[var2].Il_0) {
            this.II[var2].II1o(var1);
            break;
         }
      }

      super.IIO1(var1);
   }

   @Override
   public void I_Il() {
      if (II.II[2]) {
         this.IIO_--;
         if (this.IIO_ < 0) {
            this.IIO_ = this.II.length - 1;
         }
      } else if (II.II[8]) {
         this.IIO_++;
         if (this.IIO_ > this.II.length - 1) {
            this.IIO_ = 0;
         }
      }

      if (II.II[2] || II.II[8]) {
         II.IIIl();

         for (int var1 = 0; var1 < this.II.length; var1++) {
            if (this.IIO_ == var1) {
               this.II[var1].Il_0 = true;
               if (!II.IIIl) {
                  super.IIl = this.II[var1].IIII;
               }
            } else {
               this.II[var1].Il_0 = false;
            }

            if (II.IIIo && II.II(this.II[var1].II0I, this.II[var1].I_O0, this.II[var1].l10, this.II[var1].l10I)) {
               this.IIO_ = var1;
               break;
            }
         }
      }

      super.I_Il();
      II.IIIl();
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 1) {
         I1_I.II.I0l_();
         II = null;
      }

      if (var1 == 2) {
         if (IO10.l_lI == 5 && this.II.length == 1 || IO10.l_lI == 3 && this.II.length == 1) {
            if (this.II.II.IIl1() != null && !this.II.II.IIl1().equals("")) {
               this.II[0].IIOl(this.II.II.IIl1());
               I_0_.II().II(this.II);
               I1_I.II.I0l_();
               return;
            }

            II.II(IO11.lII_);
            return;
         }

         for (int var3 = 0; var3 < this.II.length; var3++) {
            if (this.II[var3].IIl1() == null || this.II[var3].IIl1().equals("")) {
               II.II(IO11.lII_);
               return;
            }
         }

         I_0_.II().II(this.II);
         I1_I.II.I0l_();
      }
   }
}
