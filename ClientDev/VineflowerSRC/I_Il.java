package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class I_Il {
   public byte II00;
   private ByteArrayOutputStream II = null;
   private DataOutputStream II = null;
   private DataInputStream II = null;

   public I_Il() {
   }

   public I_Il(byte var1) {
      this.II00 = var1;
      this.II = new ByteArrayOutputStream(1024);
      this.II = new DataOutputStream(this.II);
   }

   public I_Il(byte var1, byte[] var2) {
      this.II00 = var1;
      ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
      this.II = new DataInputStream(var3);
   }

   public byte[] II() {
      return this.II.toByteArray();
   }

   public int II_I() throws IOException {
      return this.II.readInt();
   }

   public DataInputStream II() {
      return this.II;
   }

   public DataOutputStream II() {
      return this.II;
   }

   public void I0Oo() {
      try {
         if (this.II != null) {
            this.II.close();
         }

         if (this.II != null) {
            this.II.close();
         }
      } catch (IOException var2) {
         I_Ol.IIIo(var2.getMessage());
      }
   }
}
