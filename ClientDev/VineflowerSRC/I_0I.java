package main;

public final class I_0I extends I1l1 {
   private I1lO IIIO;
   private int I_O0;
   private int I_Oo;
   private int I_0;
   private short IIO1 = 0;
   private long I1II = 0L;

   public static void II(int var0, int var1, int var2, int var3) {
      I_0I var4;
      (var4 = new I_0I()).IIIO = I1_I.II[var0 - 1];
      var4.I_Oo = var1;
      var4.I_0 = var2;
      var4.IIO1 = 2;
      I1l1.II11.addElement(var4);
   }

   @Override
   public void III_(IO1l var1) {
      if (IO1l.l_I0 == 1) {
         I1_I.IoOO++;
      }

      if (I1_I.IoOO < 8) {
         int var2 = this.I_Oo + this.IIIO.II[this.I_O0].II0I;
         int var3 = this.I_0 + this.IIIO.II[this.I_O0].I_O0;
         I_oo.IIII(var1, this.IIIO.II[this.I_O0].I_Oo, var2, var3, 0, 3);
      }
   }

   @Override
   public void IIlO() {
      this.I_O0++;
      if (this.I_O0 >= this.IIIO.II.length) {
         this.IIO1--;
         if (this.IIO1 <= 0) {
            I1l1.II11.removeElement(this);
            return;
         }

         this.I_O0 = 0;
      }
   }
}
