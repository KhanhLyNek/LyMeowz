package main;

import main.GameMidlet;

public final class I_l extends IO1_ implements I1_1 {
   public static I_l II;
   private IOI0 III_;
   private IOI0 III;
   private int I_0;
   private int IIO;
   private int IIOI = II.IIl - 20;
   private int IIOl;
   private String[] II1;
   private int IIO1;

   public I_l() {
      if (this.IIOI > 320) {
         this.IIOI = 320;
      }

      this.II1 = IO1I.IIIO.II(IO11.I1ol, this.IIOI - 20);
      this.I_0 = (II.IIl - this.IIOI) / 2;
      this.IIO = II.IIlI - 150 - (this.II1.length - 1) * 20;
      this.IIOl = 110 + (this.II1.length - 1) * 20;
      this.III_ = new IOI0();
      this.III_.II1o = IO11.I1o;
      this.III_.II0I = this.I_0 + 10;
      this.III_.I_O0 = this.IIO + 35 + (this.II1.length - 1) * 20;
      this.III_.l10 = this.IIOI - 20;
      this.III_.l10I = IO1_.ll11 + 2;
      if (II.IIIl) {
         this.III_.Il_0 = false;
      } else {
         this.III_.Il_0 = true;
      }

      this.III_.Ill(0);
      if (!II.IIIl) {
         super.IIl = this.III_.IIII;
      }

      this.III = new IOI0();
      this.III.II1o = IO11.I1oI;
      this.III.II0I = this.I_0 + 10;
      this.III.I_O0 = this.III_.I_O0 + 35;
      this.III.l10 = this.IIOI - 20;
      this.III.l10I = IO1_.ll11 + 2;
      this.III.Il_0 = false;
      this.III.Ill(0);
      super.IIIo = new I1Il(IO11.I_I, this, 1, null);
      super.III0 = new I1Il(IO11.I1o1, this, 2, null);
      if (II.IIIl) {
         super.III0.I1 = II.IIl / 2 + 18;
         super.IIIo.I1 = II.IIl / 2 - 85;
         super.III0.I1I = super.IIIo.I1I = this.IIO + this.IIOl + 5;
      }
   }

   public static I_l II() {
      if (II == null) {
         II = new I_l();
      }

      return II;
   }

   @Override
   public void I0l_() {
      this.IIO1 = 0;

      try {
         if (IO11.IllI == 0) {
            GameMidlet.II.platformRequest(Il__("컺컅캤캟켴켂콣켅쿭쿆쾫쾕큩큋퀣퀌탬탍킩킱킛턳텟턴턗톶", 52882));
         }

         if (IO11.IllI == 2) {
            GameMidlet.II.platformRequest(Il__("컺컅캤캟켴켂콣켏쿸쿈쾯쾈큨큇퀥퀏탮킏킩킱킚텲텒턺턝퇸톖톴톙퉸툛", 52882));
         }

         if (IO11.IllI == 1) {
            GameMidlet.II.platformRequest(Il__("컺컅캤캟켴켂콣켜쿥쿛쾤쾃퀨큑퀡퀂탯탎킢킶탐텾텓턶텕퇾퇙톺톓퉦툙툣툓틶틕틢틞팣퍄팿팇폥", 52882));
            return;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   @Override
   public void III_(IO1l var1) {
      I1_I.II().III_(var1);
      I__O.II(var1, this.I_0, this.IIO, this.IIOI, this.IIOl, -1, true);

      for (int var2 = 0; var2 < this.II1.length; var2++) {
         IO1I.IIIO.II(var1, this.II1[var2], II.IIl / 2, this.IIO + 15 + var2 * 20, 2);
      }

      this.III_.III_(var1);
      this.III.III_(var1);
      super.III_(var1);
   }

   @Override
   public void IIlO() {
      I1_I.II().IIlO();
      this.III_.IIlO();
      this.III.IIlO();
   }

   @Override
   public void IIO1(int var1) {
      if (this.III_.Il_0) {
         this.III_.II1o(var1);
      } else if (this.III.Il_0) {
         this.III.II1o(var1);
      }

      super.IIO1(var1);
   }

   @Override
   public void I_Il() {
      if (II.II[2]) {
         this.IIO1--;
         if (this.IIO1 < 0) {
            this.IIO1 = 1;
         }
      } else if (II.II[8]) {
         this.IIO1++;
         if (this.IIO1 > 1) {
            this.IIO1 = 1;
         }
      }

      if (II.II[2] || II.II[8]) {
         II.IIIl();
         if (this.IIO1 == 1) {
            this.III_.Il_0 = false;
            this.III.Il_0 = true;
            if (!II.IIIl) {
               super.IIl = this.III.IIII;
            }
         } else if (this.IIO1 == 0) {
            this.III_.Il_0 = true;
            this.III.Il_0 = false;
            if (!II.IIIl) {
               super.IIl = this.III_.IIII;
            }
         } else {
            this.III_.Il_0 = false;
            this.III.Il_0 = false;
         }
      }

      if (II.IIIo) {
         if (II.II(this.III_.II0I, this.III_.I_O0, this.III_.l10, this.III_.l10I)) {
            this.IIO1 = 0;
         } else if (II.II(this.III.II0I, this.III.I_O0, this.III.l10, this.III.l10I)) {
            this.IIO1 = 1;
         }
      }

      super.I_Il();
      II.IIIl();
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 1) {
         I1_I.II.I0l_();
         II = null;
      }

      if (var1 == 2) {
         if (this.III_.IIl1() == null || this.III_.IIl1().equals("")) {
            II.II(IO11.I1o_);
            return;
         }

         if (this.III.IIl1() == null || this.III.IIl1().equals("")) {
            II.II(IO11.I1oO);
            return;
         }

         I_0_.II().III_(this.III_.IIl1(), this.III.IIl1());
         I1_I.II.I0l_();
         II = null;
      }
   }
}
