package main;

class IOO1 implements Runnable {
   IOO1(IOOl var1) {
      this.II = var1;
   }

   @Override
   public void run() {
      IOOl.II(this.II, true);
   }
}
