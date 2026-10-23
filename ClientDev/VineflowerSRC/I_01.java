package main;

public final class I_01 extends IO1_ implements I1_1 {
   private int II0I = 0;
   private I_lO IIO_ = new I_lO("");
   private I1Il IIOO;
   private int I_0;
   private int IIO;
   private int IIOI;
   private int IIOl;
   private int IIlI;
   private I1Il IIl_;
   private I1Il IIII;

   @Override
   public void I0l_() {
      IO.II();
      super.I0l_();
      this.IIl_ = new I1Il(Il0o("ឥᡛ۷᠄ᡏᣀᣬᢁ", 6131), this, 98, null);
      this.IIl_.I1 = 0;
      this.IIl_.I1I = 0;
      this.IIII = new I1Il(Il0o("឴ᡞ\u187e᠒ᠮᣂ", 6131), this, 97, null);
      this.IIII.I1 = 50;
      this.IIII.I1I = 0;
      this.IIO_ = new I_lO("");
      this.IIO_.addElement(this.IIl_);
      this.IIO_.addElement(this.IIII);
      this.IIl1();
   }

   public I_01() {
      if ((IOlO.l1o1 = (byte)(System.currentTimeMillis() % 9L)) == 5 || IOlO.l1o1 == 6) {
         IOlO.l1o1 = 4;
      }

      I1_I.IIlI(-1, -1);
      I1_I.Io1 = 100;
      I1_I.Io1I = 200;
   }

   private void IIl1() {
      this.II0I = I_0l.l1_I;
      this.IIOI = 5;
      this.I_0 = 76;
      this.IIO = IO1_.llo_;
      this.IIOl = 2;
      if (II.IIl > 3 * (this.I_0 + this.IIOI)) {
         this.IIOl = 3;
      }

      if (this.IIO_.size() < 3) {
         this.IIOl = 2;
      }

      this.IIlI = this.IIO_.size() / this.IIOl + (this.IIO_.size() % this.IIOl == 0 ? 0 : 1);

      for (int var1 = 0; var1 < this.IIO_.size(); var1++) {
         I1Il var2;
         if ((var2 = (I1Il)this.IIO_.elementAt(var1)) != null) {
            int var3 = II.IIll - this.IIOl * (this.I_0 + this.IIOI) / 2 + var1 % this.IIOl * (this.I_0 + this.IIOI);
            int var4 = II.IIl1 - this.IIlI * (this.IIO + this.IIOI) / 2 + var1 / this.IIOl * (this.IIO + this.IIOI);
            var2.I1 = var3;
            var2.I1I = var4;
         }
      }
   }

   @Override
   public void IIlO() {
      if (++I1_I.Io1 > II.IIl * 3 + 100) {
         I1_I.Io1 = 100;
      }

      for (int var1 = 0; var1 < this.IIO_.size(); var1++) {
         I1Il var2 = (I1Il)this.IIO_.elementAt(var1);
         if (!II.IIIl) {
            if (var1 == this.II0I) {
               if (II.IIIO % 10 < 4) {
                  var2.I__I = true;
               } else {
                  var2.I__I = false;
               }

               this.IIOO = new I1Il(IO11.I_lO, this, var2.IIO, null);
               super.III0 = this.IIOO;
            } else {
               var2.I__I = false;
            }
         } else if (var2 != null && var2.II0o()) {
            var2.I0lO();
         }
      }
   }

   @Override
   public void III_(IO1l var1) {
      II.III1(var1);

      for (int var2 = 0; var2 < this.IIO_.size(); var2++) {
         if (this.IIO_.elementAt(var2) != null) {
            ((I1Il)this.IIO_.elementAt(var2)).II(var1);
         }
      }

      super.III_(var1);
   }

   @Override
   public void I_Il() {
      super.I_Il();
      int var1 = this.II0I % this.IIOl;
      int var2 = this.II0I / this.IIOl;
      if (II.II[4]) {
         if (var1 > 0) {
            this.II0I--;
         }

         II.II[4] = false;
      } else if (II.II[6]) {
         if (var1 < this.IIOl - 1) {
            this.II0I++;
         }

         II.II[6] = false;
      } else if (II.II[2]) {
         if (var2 > 0) {
            this.II0I = this.II0I - this.IIOl;
         }

         II.II[2] = false;
      } else if (II.II[8]) {
         System.out.println(Il0o("\u17deᠿ\u181c\u187dᡂᢣᢀᣡᣆᤧᤄ\u193eᤈᦼᦅ", 6131) + this.II0I);
         if (var2 < this.IIlI - 1) {
            this.II0I = this.II0I + this.IIOl;
         }

         II.II[8] = false;
      }

      if (this.II0I < 0) {
         this.II0I = 0;
      }

      if (this.II0I >= this.IIO_.size()) {
         this.II0I = this.IIO_.size() - 1;
      }

      if (II.II[5]) {
         ((I1Il)this.IIO_.elementAt(var1)).I0lO();
         II.II[5] = false;
      }

      II.IIIl();
   }

   @Override
   public void II(int var1, Object var2) {
      I_Ol.II__(Il0o("ឃᡷᡃᠶ᠀\u18fcᣀᣬᢟ\u1978᥆ᤦᤀᦦ᧶ᦡᦑᩴᩄᨲᨌ\u1a1d\u1aef᪆", 6131) + var1);
      switch (var1) {
         case 97:
            this.IIO_.removeAllElements();

            for (int var4 = 0; var4 < I_0l.II1I.length; var4++) {
               if (I_0l.IIlI[var4] != 0) {
                  this.IIO_.addElement(new I1Il(I_0l.II1I[var4], this, var4 + 100, null));
               }
            }

            this.IIl1();
            return;
         case 98:
            this.IIO_.removeAllElements();

            for (int var3 = 0; var3 < I_0l.II1I.length; var3++) {
               if (I_0l.IIlI[var3] == 0) {
                  this.IIO_.addElement(new I1Il(I_0l.II1I[var3], this, var3 + 100, null));
               }
            }

            this.IIl1();
            return;
         case 99:
            I_0O.II().III();
            I_0l.l1_I = this.II0I;
            II.II.Io_();
            II.II.I0l_();
            return;
         default:
            I_0O.II().III();
            I_0l.l1_I = var1 - 100;
            II.II.Io_();
            II.II.I0l_();
      }
   }
}
