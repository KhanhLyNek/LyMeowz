package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import nrolite.Res;

public final class IOo_ implements Runnable {
   public static final int _1o1 = 1;
   private final DataInputStream IIII;
   private final DataOutputStream IIIl;
   int _1o_ = 1;
   volatile boolean lIIl;
   public IO0 II1l = new IO0(this);
   static final boolean lII1 = System.getProperty(I1Oo("낣낇녹녉녥넎뇬뇊놲놁", 45263)) != null;

   public IOo_(InputStream var1, OutputStream var2) {
      this.IIII = new DataInputStream(var1);
      this.IIIl = new DataOutputStream(var2);
   }

   @Override
   public void run() {
      try {
         while (true) {
            byte var1 = this.IIII.readByte();
            int var2 = this.IIII.readUnsignedShort();
            byte[] var3 = new byte[var2];
            this.IIII.readFully(var3);

            try {
               this.III(var1, new DataInputStream(new ByteArrayInputStream(var3)));
            } catch (Exception var13) {
               System.out.println(I1Oo("낔낂녤녘넮넷놩뇄놨놏눥뉜눶뉂닭닙늟늽느델댛", 45263) + var1 + I1Oo("냵냎", 45263) + var13);
               var13.printStackTrace();
            }
         }
      } catch (IOException var14) {
      } finally {
         this.lIIl = true;

         try {
            this.IIIl.close();
         } catch (IOException var12) {
         }
      }
   }

   private void III(int var1, DataInputStream var2) throws IOException {
      if (lII1) {
         System.out.println(I1Oo("낔낂녤녘넮넷놩놔뇪뇆뉦뉉눧뉂", 45263) + var1);
      }

      switch (var1) {
         case -74:
            this.I11l(var2.readByte());
            break;
         case -27:
            this.l1o1();
            this.II(new IO0o(-74).II(0).IIII(1));
            break;
         default:
            this.II1l.II(var1, var2);
      }
   }

   private void l1o1() {
      this.II(new IO0o(-27).II(1).II(0).II("").IIII(0).II(0));
   }

   private void I11l(int var1) {
      if (var1 == 1) {
         byte[] var2 = Res.read(I1Oo("낽낋녾넃넳", 45263) + this._1o_ + I1Oo("냠낱녤녂넯넏뇱", 45263));
         boolean var3 = false;
         String[] var4 = var2 == null ? new String[0] : II(new String(var2));
         this.II(new IO0o(-74).II(1).III(var4.length));
      } else if (var1 == 2) {
         byte[] var6 = Res.read(I1Oo("낽낋녾넃넳", 45263) + this._1o_ + I1Oo("냠낱녤녂넯넏뇱", 45263));
         String[] var7 = var6 == null ? new String[0] : II(new String(var6));

         for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var5 = Res.read(I1Oo("낽낋녾넃넳", 45263) + this._1o_ + I1Oo("냠", 45263) + var7[var8]);
            if (var5 != null) {
               this.II(new IO0o(-74).II(2).II(var7[var8]).IIII(var5.length).II(var5));
            }
         }

         this.II(new IO0o(-74).II(3).IIII(1));
      }
   }

   static String[] II(String var0) {
      Vector var1 = new Vector();
      int var2 = 0;

      for (int var3 = 0; var3 <= var0.length(); var3++) {
         if (var3 == var0.length() || var0.charAt(var3) == '\n' || var0.charAt(var3) == '\r') {
            if (var3 > var2) {
               var1.addElement(var0.substring(var2, var3));
            }

            var2 = var3 + 1;
         }
      }

      String[] var4 = new String[var1.size()];
      var1.copyInto(var4);
      return var4;
   }

   public synchronized void II(IO0o var1) {
      try {
         byte[] var2 = var1.III();
         int var3 = var1._I_1;
         this.IIIl.writeByte(var3);
         if (var3 != -32 && var3 != -66 && var3 != -74 && var3 != 11 && var3 != -67 && var3 != -87 && var3 != 66 && var3 != 12) {
            this.IIIl.writeShort(var2.length);
         } else {
            this.IIIl.writeByte((var2.length & 0xFF) - 128);
            this.IIIl.writeByte((var2.length >> 8 & 0xFF) - 128);
            this.IIIl.writeByte((var2.length >> 16 & 0xFF) - 128);
         }

         this.IIIl.write(var2);
         this.IIIl.flush();
         if (lII1) {
            System.out.println(I1Oo("낔낂녤녘넮넷놩놅뇹뇆뉦뉉눧뉂", 45263) + var3 + I1Oo("냯냆", 45263) + var2.length + I1Oo("낍냇", 45263));
         }
      } catch (IOException var4) {
      }
   }
}
