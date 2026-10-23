package main;

class IlOI implements Runnable {
   IlOI(long var1, Runnable var3) {
      this.IlII = var1;
      this.II = var3;
   }

   @Override
   public void run() {
      IlO.IIIl(this.IlII);
      this.II.run();
   }
}
