package main;

final class I_00 implements Runnable {
   private final String Il1o;
   private int I_Oo;
   final I_0O III1;

   I_00(I_0O var1, String var2, int var3) {
      this.III1 = var1;
      this.Il1o = var2;
      this.I_Oo = var3;
   }

   @Override
   public void run() {
      I_0O.IIl = false;
      new Thread(new I_1(this)).start();
      this.III1.I0OI = true;
      this.III1.I0O = true;

      try {
         int var1 = this.I_Oo;
         String var2 = this.Il1o;
         I_0O.II(this.III1, new IO1O(var2, var1));
         I_0O.II(this.III1, I_0O.II(this.III1).III());
         this.III1.III = I_0O.II(this.III1).III();
         this.III1.IIII = new Thread(I_0O.II(this.III1));
         this.III1.IIII.start();
         this.III1.III = new Thread(new I_I1(this.III1));
         this.III1.III.start();
         this.III1.IlOI = System.currentTimeMillis();
         I_0O.II(this.III1, new I_Il((byte)-27));
         this.III1.I0OI = false;
         this.III1.II.III0(this.III1.I0_o);
      } catch (Exception var4) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var3) {
         }

         if (!I_0O.IIl && this.III1.II != null) {
            this.III1.close();
         }
      }
   }
}
