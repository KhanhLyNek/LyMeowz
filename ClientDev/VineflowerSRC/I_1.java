package main;

final class I_1 implements Runnable {
   private I_00 II;

   I_1(I_00 var1) {
      this.II = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
      }

      if (this.II.III1.I0OI) {
         try {
            I_0O.II(this.II.III1).IIl1();
         } catch (Exception var2) {
         }

         I_0O.IIl = true;
         this.II.III1.I0OI = false;
         this.II.III1.I0O = false;
         this.II.III1.II.IIIo(this.II.III1.I0_o);
      }
   }
}
