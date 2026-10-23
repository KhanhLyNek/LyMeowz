package main;

import java.io.IOException;
import java.io.OutputStream;

class I0ll extends OutputStream {
   I0ll(I0l var1) {
      this.III = var1;
   }

   @Override
   public void write(int var1) throws IOException {
      this.III.write(new byte[]{(byte)var1}, 0, 1);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.III.write(var1, var2, var3);
   }

   @Override
   public void close() {
      this.III.close();
   }
}
