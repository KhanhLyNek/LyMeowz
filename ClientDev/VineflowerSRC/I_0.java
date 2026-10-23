package main;

public final class I_0 extends I1l1 {
   private I1lO IIIO;
   private int I_O0;
   private int I_Oo;
   private int I_0;
   private Ilol II11;
   private I_I_ IIl;
   private short II1O = 0;
   private long Ilo_ = 0L;
   private int IIO1;

   public static void III(int var0, int var1, int var2, int var3) {
      I_0 var4;
      (var4 = new I_0()).IIIO = I1_I.II[var0 - 1];
      var4.I_Oo = var1;
      var4.I_0 = var2;
      var4.II1O = (short)var3;
      I1l1.II1_.addElement(var4);
   }

   public static void II(int var0, int var1, int var2, int var3, int var4) {
      I_0 var5;
      (var5 = new I_0()).IIIO = I1_I.II[var0 - 1];
      var5.I_Oo = var1;
      var5.I_0 = var2;
      var5.II1O = 1;
      var5.IIO1 = var4;
      I1l1.II1_.addElement(var5);
   }

   public static void II(int var0, I_I_ var1, int var2) {
      I_0 var3;
      (var3 = new I_0()).IIIO = I1_I.II[var0 - 1];
      var3.IIl = var1;
      var3.II1O = 1;
      I1l1.II1_.addElement(var3);
   }

   public static void II(int var0, Ilol var1, int var2) {
      I_0 var3;
      (var3 = new I_0()).IIIO = I1_I.II[var0 - 1];
      var3.II11 = var1;
      var3.II1O = (short)var2;
      I1l1.II1_.addElement(var3);
   }

   @Override
   public void III_(IO1l var1) {
      if (IO1l.l_I0 == 1) {
         I1_I.IoOO++;
      }

      if (I1_I.IoOO < 11) {
         if (this.II11 != null) {
            this.I_Oo = this.II11.I_o_;
            this.I_0 = this.II11.I_oO + II.II10;
         }

         if (this.IIl != null) {
            this.I_Oo = this.IIl.I1;
            this.I_0 = this.IIl.I1I + II.II10;
         }

         int var2 = this.I_Oo + this.IIIO.II[this.I_O0].II0I;
         int var3 = this.I_0 + this.IIIO.II[this.I_O0].I_O0;
         if (II.II(var2, var3)) {
            I_oo.IIII(var1, this.IIIO.II[this.I_O0].I_Oo, var2, var3, this.IIO1, 3);
         }
      }
   }

   @Override
   public void IIlO() {
      this.I_O0++;
      if (this.I_O0 >= this.IIIO.II.length) {
         this.II1O--;
         if (this.II1O <= 0) {
            I1l1.II1_.removeElement(this);
         } else {
            this.I_O0 = 0;
         }
      }

      if (II.IIIO % 11 == 0 && this.II11 != null && this.II11 != Ilol.II() && !I1_I.II_O.contains(this.II11)) {
         I1l1.II1_.removeElement(this);
      }
   }
}
