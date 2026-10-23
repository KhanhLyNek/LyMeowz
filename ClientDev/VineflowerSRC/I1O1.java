package main;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;

public final class I1O1 {
   public static I_l_ III1 = new I_l_(Ill_("ꃂꃩꂡꅪꅁꄇꄝꇍꇃꆬꆅ", 41130));

   public static void II(String var0, Image var1, byte var2) {
      III1.put(var0, new I1oo(var1, var2));
   }

   public static I1oo II(String var0, I_l_ var1) {
      I1oo var2;
      if ((var2 = (I1oo)var1.get(var0)) == null) {
         var2 = new I1oo();
         I1oo var3;
         if ((var3 = II(var0)) != null) {
            var2.II01 = var3.II01;
            var2.II10 = var3.II10;
         }

         var1.put(var0, var2);
      }

      var2.I1I = II.II / 1000L;
      if (var2.II01 == null) {
         var2.I_Oo--;
         if (var2.I_Oo <= 0) {
            I_0_.II().IIOI(var0);
            var2.I_Oo = 200;
         }
      }

      return var2;
   }

   private static I1oo II(String var0) {
      byte[] var1;
      if ((var1 = I_O1.II(IO1l.l_I0 + Ill_("ꃣꂤꂏꅅꅟꄋꄅꇮꇇꆞ", 41130) + var0)) == null) {
         return null;
      }

      try {
         I1oo var2;
         (var2 = new I1oo()).II10 = var1[0];
         var2.II01 = Image.createImage(var1, 1, var1.length - 1);
         return var2;
      } catch (Exception var3) {
         return null;
      }
   }

   public static void II(String var0, byte var1, byte[] var2) {
      var0 = IO1l.l_I0 + Ill_("ꃣꂤꂏꅅꅟꄋꄅꇮꇇꆞ", 41130) + var0;
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);

      try {
         var4.writeByte(var1);

         for (int var5 = 0; var5 < var2.length; var5++) {
            var4.writeByte(var2[var5]);
         }

         I_O1.II(var0, var3.toByteArray());
         var4.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public static void II(I_l_ var0, int var1) {
      I_lO var2 = new I_lO(Ill_("ꃉꂡꂍꅤꅍꄁꄁꇯꇪꆠꆓꆗ", 41130));
      Enumeration var3 = var0.keys();

      while (var3.hasMoreElements()) {
         String var4 = (String)var3.nextElement();
         I1oo var5 = (I1oo)var0.get(var4);
         if (II.II / 1000L - var5.I1I > 600L) {
            var2.addElement(var4);
         }
      }

      for (int var6 = 0; var6 < var2.size(); var6++) {
         var0.remove((String)var2.elementAt(var6));
      }
   }
}
