package main;

public class IlIo {
   private Il_l.III1 III = new Il_l.III1();

   public void II(String var1, IlIo.II var2) {
      Il_l.II var3 = (Il_l.II)this.III.II(var1);
      if (var3 == null) {
         var3 = new Il_l.II();
         this.III.II(var1, var3);
      }

      var3.III(var2);
   }

   public void III(String var1, IlIo.II var2) {
      Il_l.II var3 = (Il_l.II)this.III.II(var1);
      if (var3 != null) {
         var3.II(var2);
      }
   }

   public void II(String var1, Object var2) {
      Il_l.II var3 = (Il_l.II)this.III.II(var1);
      if (var3 != null) {
         Il_l.II var4 = new Il_l.II();

         for (int var5 = 0; var5 < var3.IIlO(); var5++) {
            var4.III(var3.II(var5));
         }

         for (int var9 = 0; var9 < var4.IIlO(); var9++) {
            IlIo.II var6 = (IlIo.II)var4.II(var9);

            try {
               var6.II(var2);
            } catch (Exception var8) {
               System.err.println(II1o("䤫䧊䧘䦨䦂䩿䩨䨼䨛䫚䪆䪀䪖䭱䭍䬳䭀䬗䯿䯓䮸䮗䱳䱗䰿䱗䳳䳃䲱䲝䵦䴋䵰", 18800) + var1);
               var8.printStackTrace();
            }
         }
      }
   }

   public void II1_(String var1) {
      this.III.III(var1);
   }

   public void I_10() {
      this.III.I_1O();
   }

   public interface II {
      void II(Object var1);
   }
}
