package main;

public final class Ilo_ implements I1_1 {
   private static Ilo_ II;
   public IOI0 II;
   public boolean I_10 = false;
   public I1__ II;
   private long Il_o = 0L;
   public I1Il III_;
   public I1Il IIIO;
   public I1Il III0 = null;
   private int I1;
   private int I1I;
   private int IIl;
   private int IIlI;
   public String II0O;
   public String II00 = IO11.I_Io + IIol("埙", 22521);

   public void IIl1() {
      this.III_ = new I1Il(IO11.I_lI, this, 8000, null, 1, II.IIlI - IO1_.llo_ + 1);
      this.IIIO = new I1Il(IO11.I_II, this, 8001, null, II.IIl - 70, II.IIlI - IO1_.llo_ + 1);
      this.III0 = null;
      this.IIl = this.II.l10 + 28;
      this.IIlI = this.II.l10I + 26;
      this.I1 = II.IIl / 2 - this.IIl / 2;
      this.I1I = this.II.I_O0 - 18;
      if (this.IIl > 320) {
         this.IIl = 320;
      }

      this.III_.I1 = this.I1;
      this.IIIO.I1 = this.I1 + this.IIl - 68;
      if (II.IIIl) {
         IOI0 var1 = this.II;
         var1.I_O0 -= 5;
         this.I1I -= 20;
         this.IIlI += 30;
         this.III_.I1 = II.IIl / 2 - 68 - 5;
         this.IIIO.I1 = II.IIl / 2 + 5;
         this.III_.I1I = II.IIlI - 30;
         this.IIIO.I1I = II.IIlI - 30;
      }
   }

   public void keyPressed(int var1) {
      if (this.I_10) {
         this.II.II1o(var1);
      }

      if (this.II.IIl1().equals("")) {
         this.IIIO.IIoO = IO11.I_I;
      } else {
         this.IIIO.IIoO = IO11.I_II;
      }
   }

   public static Ilo_ II() {
      return II == null ? (II = new Ilo_()) : II;
   }

   public Ilo_() {
      this.II = new IOI0();
      this.II.II1o = IO11.I_Io;
      this.II.l10 = II.IIl - 32;
      if (this.II.l10 > 250) {
         this.II.l10 = 250;
      }

      this.II.l10I = IO1_.ll11 + 2;
      this.II.II0I = II.IIl / 2 - this.II.l10 / 2;
      this.II.Il_0 = true;
      this.II.II(80);
   }

   public void II(int var1, I1__ var2, String var3) {
      this.IIIO.IIoO = IO11.I_I;
      this.II0O = var3;
      this.II.II1o(var1);
      if (!this.II.IIl1().equals("") && II.II == null) {
         this.II = var2;
         this.I_10 = true;
      }
   }

   public void II1o(String var1) {
      this.IIIO.IIoO = IO11.I_I;
      this.II0O = var1;
      if (II.II == null) {
         this.I_10 = true;
         if (II.IIIl) {
            this.II.IIl1();
         }
      }
   }

   public void III() {
      if (this.I_10) {
         if (IO10.l_lI != 5 && IO10.l_lI != 3) {
            this.II.IIlO();
         }

         if (this.II.IOOO) {
            this.II.IOOO = false;
            this.II.II(this.II.IIl1(), this.II0O);
            this.II.IIOl("");
            this.IIIO.IIoO = IO11.I_I;
         }
      }
   }

   public void II(IO1l var1) {
      if (this.I_10 && IO10.l_lI != 5 && IO10.l_lI != 3) {
         I__O.II(var1, this.I1, this.I1I, this.IIl, this.IIlI, -1, true);
         IO1I.IIIO.II(var1, this.II00 + this.II0O, this.II.II0I, this.II.I_O0 - (II.IIIl ? 17 : 12), 0);
         I_10.II(var1, this.III_, this.III0, this.IIIO);
         this.II.III_(var1);
      }
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 8000:
            I_Ol.II__(IIol("垉塽塅堰堚壦壞売墒奸奎夺奍妽", 22521));
            if (this.II != null) {
               long var3;
               if ((var3 = System.currentTimeMillis()) - this.Il_o < 1000L) {
                  return;
               }

               this.Il_o = var3;
               this.II.II(this.II.IIl1(), this.II0O);
               this.II.IIOl("");
               this.IIIO.IIoO = IO11.I_I;
               return;
            }
            break;
         case 8001:
            I_Ol.II__(IIol("垉塽塅堰堚壦壞売墒奸奎夺奍妾", 22521));
            if (this.II.IIl1().equals("")) {
               this.I_10 = false;
               this.II.Illl();
            }

            this.II.IOlI();
         case 8002:
      }
   }
}
