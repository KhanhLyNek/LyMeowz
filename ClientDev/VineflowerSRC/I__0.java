package main;

public final class I__0 implements I1_1 {
   public I1Il II_l;
   private I1Il II_1;
   private String[] IIll;
   private int I_0;
   private int IIO;
   private int IIOI = 120;
   private int IIOl;
   private int IIlI;
   private long IloO;
   private long Iloo;

   public void IIII(String var1, I1Il var2, I1Il var3) {
      this.IIll = new String[]{var1};
      this.IIOl = 29;
      this.II_l = var2;
      this.II_1 = var3;
      this.II_l.IIO1 = this.II_1.IIO1 = I1_I.Il1o;
      this.II_l.IIO_ = this.II_1.IIO_ = I1_I.Il_;
      this.II_l.IoII = IO1l.II(var2.IIO1);
      this.II_1.IoII = IO1l.II(var2.IIO1);
      this.II_l.IIO0 = IO1l.III(var2.IIO1);
      this.II_1.IIO0 = IO1l.III(var2.IIO1);
      this.IloO = System.currentTimeMillis();
      this.IIlI = this.IIll[0].length() / 3;
      if (this.IIlI < 15) {
         this.IIlI = 15;
      }

      IOl_.II0();
   }

   public void III_(IO1l var1) {
      I__O.II(var1, this.I_0, this.IIO, this.IIOI, this.IIOl + (!II.IIIl ? 10 : 0), 16777215, false);
      if (this.IIll != null) {
         IOl_.II(var1, this.IIll[0], this.I_0 + 5, this.IIO + this.IIOl / 2 - (II.IIIl ? 4 : 6), this.IIOI - 10, this.IIOl, IO1I.IIlI);
         if (II.IIIl) {
            this.II_l.II(var1);
            IO1I.IIl_.II(var1, String.valueOf(this.IIlI), this.II_l.I1 + this.II_l.IoII / 2, this.II_l.I1I + this.II_l.IIO0 + 5, 2, IO1I.IIlO);
            return;
         }

         if (IOI0.III_) {
            IO1I.III.II(var1, IO11.IOl0 + this.IIlI + IlOo("퐓", 54330), this.I_0 + this.IIOI / 2, this.IIO + this.IIOl, 2);
            return;
         }

         IO1I.III.II(var1, IO11.IOlo + this.IIlI + IlOo("퐓", 54330), this.I_0 + this.IIOI / 2, this.IIO + this.IIOl, 2);
      }
   }

   public void IIl1() {
      if (this.IIll != null) {
         this.I_0 = II.IIl - 5 - this.IIOI;
         this.IIO = 45;
         if (II.IIl - 50 > 155 + this.IIOI) {
            this.I_0 = II.IIl - 55 - this.IIOI;
            this.IIO = 5;
         }

         this.II_l.I1 = this.I_0 - 35;
         this.II_l.I1I = this.IIO;
         this.Iloo = System.currentTimeMillis();
         I_Ol.II__(IlOo("푙퐬퐊퓥풖퓸퓔핿핓픢프햲햎", 54330) + (this.Iloo - this.IloO));
         if (this.Iloo - this.IloO >= 1000L) {
            this.IloO = System.currentTimeMillis();
            this.IIlI--;
         }

         if (this.IIlI == 0) {
            I1_I.II().II = null;
         }
      }
   }

   @Override
   public void II(int var1, Object var2) {
   }
}
