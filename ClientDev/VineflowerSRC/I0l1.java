package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.SocketConnection;

public final class I0l1 implements SocketConnection {
   private final I0l IIII;
   private final I0l IIIl;
   private volatile boolean lIIl;

   I0l1(I0l var1, I0l var2) {
      this.IIII = var1;
      this.IIIl = var2;
   }

   public DataInputStream openDataInputStream() throws IOException {
      return new DataInputStream(this.IIIl.II());
   }

   public InputStream openInputStream() throws IOException {
      return this.IIIl.II();
   }

   public DataOutputStream openDataOutputStream() throws IOException {
      return new DataOutputStream(this.IIII.II());
   }

   public OutputStream openOutputStream() throws IOException {
      return this.IIII.II();
   }

   public void close() throws IOException {
      this.lIIl = true;
      this.IIII.close();
      this.IIIl.close();
   }

   public boolean I1() {
      return this.lIIl;
   }

   public String getAddress() {
      return I1oO("ᛩᛅᜡ\u171bᝤ\u175dអស១", 5848);
   }

   public String getLocalAddress() {
      return I1oO("ᛩᛅᜡ\u171bᝤ\u175dអស១", 5848);
   }

   public int getLocalPort() {
      return 14445;
   }

   public int getPort() {
      return 14445;
   }

   public int getSocketOption(byte var1) {
      return 0;
   }

   public void setSocketOption(byte var1, int var2) {
   }
}
