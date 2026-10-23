package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class I1Ol {
   private byte II1O;
   public String IIoo;
   public static I_lO IIO_ = new I_lO("");
   private static I_lO II_I = new I_lO("");

   public I1Ol(String var1, byte var2) {
      this.IIoo = var1;
      this.II1O = var2;
   }

   public static void IIl1() {
      I_lO var0 = new I_lO("");
      byte[] var1;
      if ((var1 = I_O1.II(Ill1("䲳䵴䵙䴰䴓䷆䷛䶦䶀乲乕", 19706))) == null) {
         I_0_.II().III(var0);
      } else {
         II_I = new I_lO("");
         ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
         DataInputStream var3 = new DataInputStream(var2);

         try {
            short var4;
            String[] var5 = new String[var4 = var3.readShort()];
            byte[] var6 = new byte[var4];

            for (int var7 = 0; var7 < var4; var7++) {
               var5[var7] = var3.readUTF();
               var6[var7] = var3.readByte();
               II_I.addElement(new I1Ol(var5[var7], var6[var7]));
            }

            var3.close();
         } catch (IOException var8) {
            var8.printStackTrace();
         }

         I_Ol.II__(Ill1("䲌䵊䴘䴤䴟䷯䷑䷮䷒", 19706) + IIO_.size() + Ill1("䳚䵯䵪䴚䴥䶵䷇䶺䶈乴不乯", 19706) + II_I.size());
         I_0_.II().III(var0);
      }
   }

   public static void IOlI() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeShort(IIO_.size());

         for (int var2 = 0; var2 < IIO_.size(); var2++) {
            var1.writeUTF(((I1Ol)IIO_.elementAt(var2)).IIoo);
            var1.writeByte(((I1Ol)IIO_.elementAt(var2)).II1O);
         }

         I_O1.II(Ill1("䲳䵴䵙䴰䴓䷆䷛䶦䶀乲乕", 19706), var0.toByteArray());
         var1.close();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
