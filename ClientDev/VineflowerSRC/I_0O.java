package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class I_0O implements I1_o {
   private static I_0O IIII = new I_0O();
   private static I_0O IIIl = new I_0O();
   private DataOutputStream III;
   public DataInputStream III;
   public I1_0 II;
   public boolean I0_o = true;
   private IO1O II;
   public boolean I0O;
   public boolean I0OI;
   private final I_O0 II = new I_O0(this);
   private Thread II;
   public Thread III;
   public Thread IIII;
   public int IIlI;
   public int IIO1;
   boolean I1l;
   public byte[] II1 = null;
   private byte IlI_;
   private byte IIO0;
   long IlOI;
   public String Ill_ = "";
   private long I1I_ = 0L;
   public static boolean IIl;
   private static int I1;

   public static I_0O II() {
      return IIII;
   }

   public static I_0O III() {
      return IIIl;
   }

   public void III() {
      I_O0.II(this.II).removeAllElements();
   }

   public final boolean IlI_() {
      return this.I0O && this.II != null && this.II.II != null && this.III != null;
   }

   public void II(I1_0 var1) {
      this.II = var1;
   }

   public void IIIO(String var1, int var2) {
      System.out.println(IloI("媨孥孇嬦嬂寥寑寤宗屭封屺屿尗峭岜峦峚", 23275) + var1 + IloI("嫆嬧嬉嬸嬈寴寑寤寞尢", 23275) + var2);
      if (!this.I0O && !this.I0OI && IO10.IIII() >= this.I1I_) {
         this.I1I_ = IO10.IIII() + 50L;
         if (this.I0_o) {
            I_0l.III_ = -1;
         }

         this.I1l = false;
         this.Io0_();
         this.II = new Thread(new I_00(this, var1, var2));
         this.II.start();
      }
   }

   @Override
   public void IIlO(I_Il var1) {
      I1++;
      this.II.IIl_(var1);
   }

   private synchronized void IIl0(I_Il var1) {
      byte[] var2 = var1.II();

      try {
         if (this.I1l) {
            byte var3 = this.II(var1.II00);
            this.III.writeByte(var3);
         } else {
            this.III.writeByte(var1.II00);
         }

         if (var2 != null) {
            int var4 = var2.length;
            if (this.I1l) {
               byte var5 = this.II((byte)(var4 >> 8));
               this.III.writeByte(var5);
               byte var7 = this.II((byte)var4);
               this.III.writeByte(var7);
            } else {
               this.III.writeShort(var4);
            }

            if (this.I1l) {
               for (int var8 = 0; var8 < var2.length; var8++) {
                  var2[var8] = this.II(var2[var8]);
               }
            }

            this.III.write(var2);
            this.IIlI += 5 + var2.length;
         } else {
            this.III.writeShort(0);
            this.IIlI += 5;
         }

         this.III.flush();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   private byte II(byte var1) {
      byte[] var2 = this.II1;
      byte var3 = this.IIO0;
      this.IIO0 = (byte)(var3 + 1);
      var1 = (byte)(var2[var3] & 0xFF ^ var1 & 0xFF);
      if (this.IIO0 >= this.II1.length) {
         this.IIO0 = (byte)(this.IIO0 % this.II1.length);
      }

      return var1;
   }

   public void close() {
      this.Io0_();
   }

   private void Io0_() {
      this.II1 = null;
      this.IlI_ = 0;
      this.IIO0 = 0;

      try {
         this.I0O = false;
         this.I0OI = false;
         if (this.II != null && this.II.II != null) {
            this.II.IIl1();
         }

         this.II = null;
         if (this.III != null) {
            this.III.close();
         }

         this.III = null;
         if (this.III != null) {
            this.III.close();
         }

         this.III = null;
         if (this.IIII != null) {
            this.IIII.interrupt();
         }

         this.IIII = null;
         if (this.III != null) {
            this.III.interrupt();
         }

         this.III = null;
         if (this.I0_o) {
            I_0l.III_ = 0;
         }

         System.gc();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   static IO1O II(I_0O var0) {
      return var0.II;
   }

   static void II(I_0O var0, IO1O var1) {
      var0.II = var1;
   }

   static void II(I_0O var0, DataOutputStream var1) {
      var0.III = var1;
   }

   static I_O0 II(I_0O var0) {
      return var0.II;
   }

   static void II(I_0O var0, I_Il var1) {
      var0.IIl0(var1);
   }

   static void II(I_0O var0) {
      var0.Io0_();
   }

   static byte II(I_0O var0, byte var1) {
      byte[] var2 = var0.II1;
      byte var3 = var0.IlI_;
      var0.IlI_ = (byte)(var3 + 1);
      var1 = (byte)(var2[var3] & 0xFF ^ var1 & 0xFF);
      if (var0.IlI_ >= var0.II1.length) {
         var0.IlI_ = (byte)(var0.IlI_ % var0.II1.length);
      }

      return var1;
   }
}
