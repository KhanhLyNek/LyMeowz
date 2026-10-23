package main;

public class Il1_ extends IllO {
   private static Il1_ II;

   private Il1_() {
   }

   public static Il1_ II() {
      if (II == null) {
         II = new Il1_();
      }

      return II;
   }

   public Il1_ III() {
      this.I_OI();
      this.II1_ = "";
      this.II = null;
      return this;
   }

   public Il1_ II(String var1) {
      this.II1_ = var1;
      return this;
   }

   public Il1_ II(String var1, String var2, int var3, Object var4) {
      this.II(var1, var2, var3, var4, true);
      return this;
   }

   public Il1_ II(String var1, String var2) {
      this.II(var1, var2, -1, null, false);
      return this;
   }

   public Il1_ II(I1_1 var1) {
      this.II(var1);
      return this;
   }

   @Override
   public void I__0() {
      II(this);
      super.I__0();
   }

   public static void IIlO(int var0) {
      if (II() == II()) {
         II().IIlI(var0);
      }
   }
}
