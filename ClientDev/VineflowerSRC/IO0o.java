package main;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class IO0o {
   public final int _I_1;
   private final ByteArrayOutputStream III = new ByteArrayOutputStream();
   public final DataOutputStream IIII = new DataOutputStream(this.III);

   public IO0o(int var1) {
      this._I_1 = var1;
   }

   public IO0o II(int var1) {
      try {
         this.IIII.writeByte(var1);
      } catch (IOException var3) {
      }

      return this;
   }

   public IO0o III(int var1) {
      try {
         this.IIII.writeShort(var1);
      } catch (IOException var3) {
      }

      return this;
   }

   public IO0o IIII(int var1) {
      try {
         this.IIII.writeInt(var1);
      } catch (IOException var3) {
      }

      return this;
   }

   public IO0o II(long var1) {
      try {
         this.IIII.writeLong(var1);
      } catch (IOException var4) {
      }

      return this;
   }

   public IO0o II(boolean var1) {
      try {
         this.IIII.writeBoolean(var1);
      } catch (IOException var3) {
      }

      return this;
   }

   public IO0o II(String var1) {
      try {
         this.IIII.writeUTF(var1);
      } catch (IOException var3) {
      }

      return this;
   }

   public IO0o II(byte[] var1) {
      try {
         this.IIII.write(var1);
      } catch (IOException var3) {
      }

      return this;
   }

   public byte[] III() {
      return this.III.toByteArray();
   }
}
