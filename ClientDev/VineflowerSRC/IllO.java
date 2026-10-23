package main;

public abstract class IllO implements Ill0 {
   protected String II1_ = "";
   protected String II1O = "";
   protected Il_l.II IIl = new Il_l.II();
   protected I1_1 II;
   private static Ill0 II;

   @Override
   public void I__0() {
      this.I_O();
   }

   @Override
   public void I__o() {
      this.IIl.I_1O();
   }

   @Override
   public String III() {
      return this.II1_;
   }

   @Override
   public void II(I1_1 var1) {
      this.II = var1;
   }

   @Override
   public void IIlI(int var1) {
      if (var1 >= 0 && var1 < this.IIl.IIlO()) {
         Illo var2 = (Illo)this.IIl.II(var1);
         if (var2.IlOo && this.II != null) {
            this.II.II(var2.I1l, var2.II);
         }
      }
   }

   public static void III_(IO1l var0) {
      var0.IIIO(II.II.llO_, II.II.llOO, II.II.llO0, II.II.llOo);
      var0.IIl0(0, -II.II.Io1I);
      IllO var1 = (IllO)II();
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.IIl.IIlO(); var2++) {
            Illo var3 = (Illo)var1.IIl.II(var2);
            int var4 = II.II.llO_;
            int var5 = II.II.llOO + var2 * 24;
            int var6 = II.II.llO0 - 1;
            byte var7 = 23;
            if (var5 - II.II.Io1I <= II.II.llOO + II.II.llOo && var5 - II.II.Io1I >= II.II.llOO - 24) {
               var0.Illl(var2 == II.II.ll0l ? 16383818 : 15196114);
               var0.III_(var4, var5, var6, var7);
               IO1I.III_.II(var0, var3.II1_, var4 + 5, var5 + 5, 0);
               if (var3.II10 != null && var3.II10.length() > 0) {
                  int var8 = IO1I.III_.IIII(var3.II10);
                  IO1I.III_.II(var0, var3.II10, var4 + var6 - var8 - 5, var5 + 5, 0);
               }
            }
         }

         II.II.II1o(var0);
      }
   }

   private void I_O() {
      if (II.II.IIIl == null || II.II.IIII == null) {
         II.II.IoI();
      }

      II.II.llO = this.IIl.IIlO();
      II.II.ll11 = 24;
      II.II.ll0l = II.IIIl ? -1 : 0;
      II.II.Io_I = this.IIl.IIlO() * 24 - II.II.llOo;
      if (II.II.Io_I < 0) {
         II.II.Io_I = 0;
      }

      if (II.II.Io1I < 0) {
         II.II.Io1I = II.II.Io1o = 0;
      }

      if (II.II.Io1I > II.II.Io_I) {
         II.II.Io1I = II.II.Io1o = II.II.Io_I;
      }

      II.II.IoI_ = 27;
      II.II.IIOo(0);
   }

   protected IllO II(String var1, String var2, int var3, Object var4, boolean var5) {
      this.IIl.III(new Illo(var1, var2, var3, var4, var5));
      return this;
   }

   protected void I_OI() {
      this.IIl.I_1O();
   }

   protected static void II(Ill0 var0) {
      II = var0;
   }

   protected static Ill0 II() {
      return II;
   }

   public static String IIII() {
      IllO var0 = (IllO)II;
      return var0 != null && var0.II1_.length() > 0 ? var0.II1_ : II_l("䶲乥乫乊临丒仼仉", 19937);
   }

   public static String IIIl() {
      IllO var0 = (IllO)II;
      return var0 != null ? var0.II1O : "";
   }
}
