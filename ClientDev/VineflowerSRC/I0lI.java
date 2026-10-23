package main;

import java.io.IOException;
import java.io.InputStream;

class I0lI extends InputStream {
   I0lI(I0l var1) {
      this.II = var1;
   }

   @Override
   public int read() throws IOException {
      byte[] var1 = new byte[1];
      int var2 = this.II.read(var1, 0, 1);
      return var2 < 0 ? -1 : var1[0] & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.II.read(var1, var2, var3);
   }

   @Override
   public int available() {
      return this.II.available();
   }

   @Override
   public void close() {
      this.II.close();
   }
}
