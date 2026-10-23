package main;

public class Il11 {
   public int I1;
   public int I1I;
   public String II_I;
   public int I1lO = -1;
   public Il1 II;
   private boolean Il_0;
   private boolean Il01;
   public static boolean Il0_ = true;
   public static Il11 II = new Il11("", 1088, new Il1(0, II_O("雪雍隸隿靺靊霪霍韻韓", 38559)));
   public static Il11 III = new Il11("", 7993, new Il1(1, II_O("雪雍隸隬靴靈霸霌韶", 38559)));
   public static Il11 IIII = new Il11(II_O("雔雖隨", 38559), -1, new Il1(2, II_O("雲雛隳隉靁靕霷霝", 38559)));
   public static Il11 IIIl = new Il11(II_O("雛衕隳際", 38559), -1, new Il1(3, II_O("雬雊隲隌", 38559)));
   public static Il11 III1 = new Il11("", -1, new Il1(4, II_O("雳雑隼隘靖靛霩霴韲韐鞡", 38559)));
   public static Il11 III_ = new Il11("", -1, new Il1(5, II_O("雳雑隼隘靖靛霩霪韾韑鞽鞀", 38559)));
   public static Il11 IIIO = new Il11("", -1, new Il1(6, II_O("雳雑隼隘靖靛霩霻韲韘鞡鞑顡", 38559)));

   public Il11(String var1, int var2, Il1 var3) {
      this.II_I = var1;
      this.I1lO = var2;
      this.II = var3;
      this.Il01 = false;
   }

   public void IIl1(IO1l var1) {
      if (this == III1 || this == III_ || this == IIIO) {
         this.IIl_(var1);
      } else if (this == IIIl) {
         this.IIlO(var1);
      } else {
         this.IIl0(var1);
      }
   }

   private void IIl_(IO1l var1) {
      if (I1_I.Il_l != null) {
         int var2 = I1_I.Il_l.getWidth();
         int var3 = I1_I.Il_l.getHeight();
         if (this == III_) {
            var1.II(I1_I.Il_l, 0, 0, var2, var3, 0, this.I1, this.I1I, 0);
         } else if (this == IIIO) {
            var1.II(I1_I.Il_l, 0, 0, var2, var3, 5, this.I1, this.I1I, 0);
         } else if (this == III1) {
            var1.II(I1_I.Il_l, 0, 0, var2, var3, 3, this.I1, this.I1I, 0);
         }

         if (this.Il01 && I10_.IlOI != null) {
            var1.II(I10_.IlOI, this.I1 - 7, this.I1I - 5, 0);
         }
      }
   }

   private void IIlO(IO1l var1) {
      if (IlO_.II_O()) {
         IO1I.IIII.II(var1, II_O("鞏雟隳際霻非霰靘韴韞鞠鞍蛐顜", 38559), II.IIl / 2 - 35, II.IIlI / 2 - 20, 0, IO1I.III_);
         var1.II(this.Il01 ? I1_I.IllI : I1_I.Ill, this.I1, this.I1I, 0);
         if (!this.II_I.equals("")) {
            int var2 = I1_I.Ill.getWidth();
            int var3 = I1_I.Ill.getHeight();
            IO1I.III_.II(var1, this.II_I, this.I1 + 1 + var2 / 2, this.I1I + var3 / 2 - 6, 3);
         }
      }
   }

   private void IIl0(IO1l var1) {
      if (I1_I.IoO0 == 0) {
         if (!IIoo.II1l()) {
            var1.II(this.Il_0 ? I1_I.Il_ : I1_I.Il1o, this.I1, this.I1I, 0);
         }

         if (!this.II_I.equals("")) {
            int var2 = I1_I.Il1o.getWidth();
            int var3 = I1_I.Il1o.getHeight();
            IO1I.III_.II(var1, this.II_I, this.I1 + 1 + var2 / 2, this.I1I + var3 / 2 - I1_I.Il1o.getHeight() / 2 + 10, 3);
         }

         if (this.I1lO != -1) {
            I_oo.IIII(var1, this.I1lO, this.I1 + I1_I.Il1o.getWidth() / 2, this.I1I + I1_I.Il1o.getHeight() / 2, 0, 3);
         }
      }
   }

   public boolean II11() {
      this.Il_0 = false;
      int var1;
      int var2;
      if (this != III1 && this != III_ && this != IIIO) {
         if (this == IIIl) {
            var1 = I1_I.Ill.getWidth();
            var2 = I1_I.IlIo.getHeight();
         } else {
            var1 = I1_I.Il1o.getWidth();
            var2 = I1_I.Il1o.getHeight();
         }
      } else {
         if (I1_I.Il_l == null) {
            return false;
         }

         var1 = I1_I.Il_l.getWidth() + 10;
         var2 = I1_I.Il_l.getHeight() + 10;
      }

      if (II.II(this.I1 - 5, this.I1I - 5, var1, var2)) {
         if (II.IIIO) {
            this.Il_0 = true;
            this.Il01 = true;
         }

         if (II.III0 && II.IIIo) {
            Ilol.II().II = null;
            this.Il01 = false;
            return true;
         }
      } else {
         this.Il01 = false;
      }

      return false;
   }

   public void I_0l() {
      II.IIlI();
      this.II.II(0, null);
   }

   public static void I_01() {
      if (IIIl.II11()) {
         IIIl.I_0l();
      }

      if (III1.II11()) {
         III1.I_0l();
      }

      if (III_.II11()) {
         III_.I_0l();
      }

      if (IIIO.II11()) {
         IIIO.I_0l();
      }

      if (Il0_ && !Ilol.II().I_I_ && I1_I.lIIl == 1 && I1_I.IoO0 == 0) {
         if (II.II11()) {
            II.I_0l();
         }

         if (III.II11()) {
            III.I_0l();
         }

         if (IIII.II11()) {
            IIII.I_0l();
         }
      }
   }

   public static void IIlo(IO1l var0) {
      if (Il0_) {
         int var1 = I1_I.Il1o.getWidth();
         int var2 = I1_I.Il1o.getHeight();
         II.I1 = I1_I.lIIo + 48 - var1;
         II.I1I = I1_I.lIl - 2 - var2;
         II.IIl1(var0);
         III.I1 = I1_I.lIIo + 12 - var1;
         III.I1I = I1_I.lIl + 12 - var2;
         III.IIl1(var0);
         IIII.I1 = I1_I.lIIo - var1;
         IIII.I1I = I1_I.lIl + 47 - var2;
         IIII.IIl1(var0);
         IIIl.I1 = II.IIl / 2 - 15;
         IIIl.I1I = II.IIlI / 2 - 5;
         IIIl.IIl1(var0);
         III1.I1 = var1 - 22;
         III1.I1I = var2 + 82;
         III1.IIl1(var0);
         IIIO.I1 = var1 + 6;
         IIIO.I1I = var2 + 85;
         IIIO.IIl1(var0);
         III_.I1 = var1 + 38;
         III_.I1I = var2 + 82;
         III_.IIl1(var0);
      }
   }
}
