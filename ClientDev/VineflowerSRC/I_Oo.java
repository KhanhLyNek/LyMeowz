package main;

import main.GameMidlet;

public final class I_Oo extends IO1_ implements I1_1 {
   private static I_Oo II;
   private final IOI0 IIlO = new IOI0();
   private final IOI0 IIl0 = new IOI0();
   private final IOI0 IIlo = new IOI0();
   private final I1Il IIOI;
   private final I1Il IIOl;
   private int l11O;
   private int l110;
   private int l11o;
   private int l1_;

   private I_Oo() {
      this.IIlO.Ill(0);
      this.IIl0.Ill(0);
      this.IIlo.Ill(1);
      this.IIlO.l10I = IO1_.ll11 + 2;
      this.IIl0.l10I = IO1_.ll11 + 2;
      this.IIlo.l10I = IO1_.ll11 + 2;
      this.IIlO.II1o = IO11.I101;
      this.IIl0.II1o = Il0O("㡵㠳㠈㣮", 14397);
      this.IIlo.II1o = Il0O("㡭㠳㠉㣮", 14397);
      this.IIOI = new I1Il(IO11.I_lI, this, 7001, null);
      this.IIOl = new I1Il(IO11.I_l_, this, 7002, null);
      super.III0 = this.IIOI;
      super.IIIo = this.IIOl;
      this.l11O = 0;
      this.Io11();
   }

   public static I_Oo II() {
      if (II == null) {
         II = new I_Oo();
      }

      return II;
   }

   public void I__0() {
      this.Io1l();
      this.Io11();
      this.l11O = 0;
      this.II0l(0);
      super.I0l_();
   }

   @Override
   public void I0l_() {
      this.Io11();
      super.I0l_();
   }

   private void Io1l() {
      int var1 = I_0l.l1_I;
      String var2 = "";
      String var3 = "";
      short var4 = 14445;
      if (I_0l.II1I != null && I_0l.II1l != null && I_0l.III0 != null && var1 >= 0 && var1 < I_0l.II1I.length) {
         var2 = I_0l.II1I[var1];
         var3 = I_0l.II1l[var1];
         var4 = I_0l.III0[var1];
      }

      this.IIlO.IIOl(var2);
      this.IIl0.IIOl(var3);
      this.IIlo.IIOl(String.valueOf(var4));
   }

   private void Io11() {
      this.l1_ = II.IIl >= 200 ? 180 : 160;
      this.l110 = II.IIl / 2 - this.l1_ / 2;
      this.l11o = II.IIl1 - 70;
      if (II.IIlI <= 160) {
         this.l11o = 20;
      }

      int var1 = this.l1_ - 20;
      int var2 = this.l110 + 10;
      this.IIlO.l10 = var1;
      this.IIl0.l10 = var1;
      this.IIlo.l10 = var1;
      this.IIlO.II0I = var2;
      this.IIlO.I_O0 = this.l11o + 20;
      this.IIl0.II0I = var2;
      this.IIl0.I_O0 = this.IIlO.I_O0 + 35;
      this.IIlo.II0I = var2;
      this.IIlo.I_O0 = this.IIl0.I_O0 + 35;
      this.IIOI.I1 = II.IIl / 2 - 84;
      this.IIOI.I1I = this.IIlo.I_O0 + 60;
      this.IIOl.I1 = II.IIl / 2 + 3;
      this.IIOl.I1I = this.IIOI.I1I;
   }

   @Override
   public void IIlO() {
      this.IIlO.IIlO();
      this.IIl0.IIlO();
      this.IIlo.IIlO();
      super.IIlO();
      I1_I.Io1++;
   }

   @Override
   public void III_(IO1l var1) {
      II.III1(var1);
      I__O.II(var1, this.l110, this.l11o - 10, this.l1_, 150, -1, true);
      this.IIlO.III_(var1);
      this.IIl0.III_(var1);
      this.IIlo.III_(var1);
      super.III_(var1);
   }

   @Override
   public void I_Il() {
      if (II.IIIl) {
         if (this.IIOI.II0o()) {
            this.IIOI.I0lO();
            return;
         }

         if (this.IIOl.II0o()) {
            this.IIOl.I0lO();
            return;
         }

         if (II.IIIo) {
            if (II.II(this.IIlO.II0I, this.IIlO.I_O0, this.IIlO.l10, this.IIlO.l10I)) {
               this.II0l(0);
               II.IIIo = false;
            } else if (II.II(this.IIl0.II0I, this.IIl0.I_O0, this.IIl0.l10, this.IIl0.l10I)) {
               this.II0l(1);
               II.IIIo = false;
            } else if (II.II(this.IIlo.II0I, this.IIlo.I_O0, this.IIlo.l10, this.IIlo.l10I)) {
               this.II0l(2);
               II.IIIo = false;
            }
         }
      }

      if (II.II[2]) {
         II.II[2] = false;
         this.II0I(-1);
      } else if (II.II[8]) {
         II.II[8] = false;
         this.II0I(1);
      }

      super.I_Il();
   }

   private void II0I(int var1) {
      int var2 = this.l11O + var1;
      if (var2 < 0) {
         var2 = 2;
      } else if (var2 > 2) {
         var2 = 0;
      }

      this.II0l(var2);
   }

   private void II0l(int var1) {
      this.l11O = var1;
      this.IIlO.Il_0 = var1 == 0;
      this.IIl0.Il_0 = var1 == 1;
      this.IIlo.Il_0 = var1 == 2;
   }

   @Override
   public void IIO1(int var1) {
      if (this.IIlO.Il_0) {
         this.IIlO.II1o(var1);
      } else if (this.IIl0.Il_0) {
         this.IIl0.II1o(var1);
      } else if (this.IIlo.Il_0) {
         this.IIlo.II1o(var1);
      }

      super.IIO1(var1);
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 7002) {
         II.II.I0l_();
      } else if (var1 == 7001) {
         this.IIOl();
      }
   }

   private void IIOl() {
      int var1 = I_0l.l1_I;
      String var2 = this.IIIl(this.IIlO.IIl1());
      String var3 = this.IIIl(this.IIl0.IIl1());
      String var4 = this.IIIl(this.IIlo.IIl1());
      if (var3.length() == 0) {
         II.II(IO11.Ilo1);
      } else {
         short var5 = 14445;
         if (I_0l.III0 != null && var1 >= 0 && var1 < I_0l.III0.length) {
            var5 = I_0l.III0[var1];
         }

         short var6 = this.II(var4, var5);
         if (var6 <= 0) {
            II.II(IO11.Ilo1);
         } else {
            if (var2.length() == 0 && I_0l.II1I != null && var1 >= 0 && var1 < I_0l.II1I.length) {
               var2 = I_0l.II1I[var1];
            }

            I_0l.II(var2, var3, var6);
            GameMidlet.III = var3;
            GameMidlet.II_0 = var6;
            I1o_.Illl = var2;
            if (var1 >= 0) {
               I_O1.IIIl(Il0O("㡎㠪㠈㣿㣕㢽㢔㥢", 14397), var1);
            }

            II.III_();
            GameMidlet.II.IIll();
         }
      }
   }

   private String IIIl(String var1) {
      return var1 == null ? "" : var1.trim();
   }

   private short II(String var1, short var2) {
      if (var1 != null && var1.length() != 0) {
         try {
            int var3 = Integer.parseInt(var1);
            if (var3 > 0 && var3 <= 65535) {
               return (short)var3;
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         return var2;
      } else {
         return var2;
      }
   }
}
