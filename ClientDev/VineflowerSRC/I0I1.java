package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import nrolite.Res;

public final class I0I1 {
   private static short[] IIlO;
   private static Hashtable IIl;
   private static boolean IlO0;
   private static Hashtable IIlI = new Hashtable();

   private I0I1() {
   }

   private static synchronized void I___() {
      if (!IlO0) {
         IlO0 = true;
         IIl = new Hashtable();

         try {
            byte[] var0 = Res.read(I10o("ᇼᇂᆫᆕቨቂሶሄዳ\u12b1ዜኴኒ", 4488));
            if (var0 == null) {
               return;
            }

            DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
            short var2 = var1.readShort();
            IIlO = new short[var2];

            for (int var3 = 0; var3 < var2; var3++) {
               IIlO[var3] = var1.readShort();
            }

            short var8 = var1.readShort();

            for (int var4 = 0; var4 < var8; var4++) {
               String var5 = var1.readUTF();
               IIl.put(var5, new Integer(var1.readByte()));
            }

            short var9 = var1.readShort();

            for (int var10 = 0; var10 < var9; var10++) {
               short var6 = var1.readShort();
               IIlI.put(new Integer(var6), new int[]{var1.readShort(), var1.readShort(), var1.readShort()});
            }
         } catch (Exception var7) {
         }
      }
   }

   public static int IIoO(int var0) {
      I___();
      return IIlO != null && var0 >= 0 && var0 < IIlO.length ? IIlO[var0] : -1;
   }

   public static int[] III_(int var0) {
      I___();
      return (int[])IIlI.get(new Integer(var0));
   }

   public static Vector II() {
      I___();
      Vector var0 = new Vector();
      Enumeration var1 = IIlI.keys();

      while (var1.hasMoreElements()) {
         Integer var2 = (Integer)var1.nextElement();
         int[] var3 = (int[])IIlI.get(var2);
         if (var3[0] >= 0 && var3[1] >= 0 && var3[2] >= 0 && var3[2] != 194) {
            var0.addElement(var2);
         }
      }

      return var0;
   }

   public static int IIIl(String var0) {
      I___();
      Integer var1 = (Integer)IIl.get(var0);
      return var1 == null ? 0 : var1;
   }
}
