package main;

public final class IO1 implements I1_1 {
   public short II0o;
   public short IIo;
   public short IIoI;
   public short IIol;
   public boolean I001;
   public boolean I00_;
   public I__O III;
   public int l10l;
   public int l_I;

   public IO1(short var1, short var2, short var3, short var4, boolean var5, boolean var6, String var7) {
      this.II0o = var1;
      this.IIo = var2;
      this.IIoI = var3;
      this.IIol = var4;
      var7 = I_Ol.IIIo(var7);
      this.I001 = var5;
      this.I00_ = var6;
      if ((IOlO.l1oI != 21 && IOlO.l1oI != 22 && IOlO.l1oI != 23 || this.II0o < 0 || this.II0o > 24)
         && ((IOlO.l1oI != 0 || Ilol.II().IOIO == 0) && (IOlO.l1oI != 7 || Ilol.II().IOIO == 1) && (IOlO.l1oI != 14 || Ilol.II().IOIO == 2) || !var6)) {
         if (!IOlO.Illl() && IOlO.l1oI != 47) {
            if (!var5 && !var6) {
               this.III = new I__O(var7, var1, var2 - 24);
               this.III.II_I = new I1Il((String)null, this, 1, this);
               this.III.I0_ = true;
               this.III.I0_I = false;
               I__O.II(this.III);
            } else {
               if (IOlO.II()) {
                  this.III = new I__O(var7, var1, var2 - 16);
               } else {
                  int var8 = var1 + (var3 - var1) / 2;
                  this.III = new I__O(var7, var8, var2 - (var2 != 0 ? 16 : -32));
               }

               this.III.II_I = new I1Il((String)null, this, 2, this);
               this.III.I0_ = true;
               this.III.I0_I = false;
               I__O.II(this.III);
            }

            IOlO.IlI_.addElement(this);
         } else if (var2 <= 150 || !IOlO.Illl()) {
            this.III = new I__O(var7, var1 + (var3 - var1) / 2, var4 - (var1 > 100 ? 24 : 48));
            this.III.II_I = new I1Il((String)null, this, 1, this);
            this.III.I0_ = true;
            this.III.I0_I = false;
            I__O.II(this.III);
            IOlO.IlI_.addElement(this);
         }
      }
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            var1 = (this.II0o + this.IIoI) / 2;
            int var3 = this.IIol;
            if (this.IIol > this.IIo + 24) {
               var3 = (this.IIo + this.IIol) / 2;
            }

            I1_I.II().Io0_ = 0;
            Ilol.II().II = new I_ll(var1, var3);
            Ilol.II().IOI1 = Ilol.II().I_o_ - Ilol.II().II.lI0 > 0 ? -1 : 1;
            I_0_.II().IoO();
            return;
         case 2:
            I1_I.II().Io0_ = 0;
            if (Ilol.II().III() != null) {
               I_0_.II().IoO();
               I1OO.IIl1();
               I_0_.II().IoO0();
               Ilol.I1Oo = true;
               return;
            } else if (Ilol.II().IIII() != null) {
               I_0_.II().IoO();
               I_0_.II().Io_o();
               Ilol.I10 = true;
               Ilol.I1Oo = true;
               II.III1();
               II.IIIl();
               I1OO.IIl1();
               return;
            } else {
               var1 = (this.II0o + this.IIoI) / 2;
               short var4 = this.IIol;
               Ilol.II().II = new I_ll(var1, var4);
               Ilol.II().IOI1 = Ilol.II().I_o_ - Ilol.II().II.lI0 > 0 ? -1 : 1;
               Ilol.II().III = new I1Il((String)null, this, 2, null);
            }
      }
   }

   public IO1(int var1, int var2) {
      this.l_I = var1;
      this.l10l = var2;
   }
}
