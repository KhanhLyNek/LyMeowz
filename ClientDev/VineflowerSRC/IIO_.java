package main;

public class IIO_ extends IIII {
   private static IIO_ II;
   private IlI0 II = new IlI0();
   public boolean IlIO = false;
   public boolean IlI0 = false;
   private int II0o;
   private int Il_0;
   private int Il_o;
   private int IIo_;
   private int IIoO;
   private int IlO;
   private int IIoI;
   private boolean IlIo;
   private boolean Ill;
   private static final int IlOI = 10;
   private static final String IIlo = "521,1523,1524";

   public static IIO_ II() {
      if (II == null) {
         II = new IIO_();
      }

      return II;
   }

   public static IIO_ III() {
      return II();
   }

   private IIO_() {
   }

   @Override
   protected void II1l() {
      this.II0();
      this.II.II(new IIOO(this, 750L));
      this.IIlo();
   }

   @Override
   protected void II11() {
      this.II.I_1O();
   }

   @Override
   protected void II1_() {
      this.II.IIlO();
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
   }

   private void IIO_() {
      boolean var1 = this.IlI0 && this.IIl1() && !this.IIl_();
      boolean var2 = this.IlIO && this.IIlI();
      if (var1 || var2) {
         this.Il_0 = IOlO.l1oI;
         this.Il_o = IOlO.l1ol;
         this.IIo_ = Ilol.II().I_o_;
         this.IIoO = Ilol.II().I_oO;
         this.Il0l();
         if (var1) {
            this.II0o = 1;
         } else {
            this.II0o = 3;
         }
      }
   }

   private void IlO0() {
      Ilol var1 = Ilol.II();
      if (var1 != null) {
         int var2 = var1.IOIO + 21;
         if (IOlO.l1oI != var2) {
            if (!IlO_.II_O()) {
               IlO_.II_l(var2);
            }
         } else {
            this.II0o = 2;
         }
      }
   }

   private void IlOo() {
      int var1 = this.III1();
      short var2 = 336;
      if (this.III(Ilol.II().I_o_, Ilol.II().I_oO, var1, var2) > 15) {
         Il_0.III1(var1, var2);
      } else if (II.II == null || !II.II.I_10) {
         I_0_.II().IIoI(3);
      } else if (this.IIl_()) {
         if (this.IlIO) {
            this.II0o = 3;
         } else {
            this.II0o = 5;
         }
      } else {
         for (int var3 = Ilol.II().II.length - 1; var3 >= 0; var3--) {
            I101 var4 = Ilol.II().II[var3];
            if (var4 != null && this.II(var4)) {
               I_0_.II().III((byte)1, (byte)var3);
               return;
            }
         }

         if (this.IlIO) {
            this.II0o = 3;
         } else {
            this.II0o = 5;
         }
      }
   }

   private void Il0() {
      Ilol var1 = Ilol.II();
      if (var1 != null) {
         int var2 = var1.IOIO + 24;
         if (IOlO.l1oI != var2) {
            if (!IlO_.II_O()) {
               IlO_.II_l(var2);
            }
         } else {
            this.II0o = 4;
         }
      }
   }

   private void Il0I() {
      I_1o var1 = II.II;
      int var2 = this.III_();
      short var3 = 336;
      if (this.III(Ilol.II().I_o_, Ilol.II().I_oO, var2, var3) > 15) {
         Il_0.III1(var2, var3);
      } else if (var1 == null || !var1.I_10) {
         I_0_.II().IIoI(16);
         I_0_.II().II((short)16, (byte)0);
      } else if (II.II != null) {
         if (this.IlO >= 0) {
            I_0_.II().II((byte)1, (byte)1, (short)this.IlO);
         }

         II.III_();
      } else {
         for (int var4 = this.IlO >= 0 ? this.IlO : Ilol.II().II.length - 1; var4 >= 0; var4--) {
            I101 var5 = Ilol.II().II[var4];
            if (var5 != null && !this.III(var5)) {
               I_0_.II().II((byte)0, (byte)1, (short)var4);
               if (var4 == this.IlO) {
                  this.IIoI++;
               } else {
                  this.IIoI = 0;
               }

               this.IlO = this.IIoI >= 5 ? var4 - 1 : var4;
               return;
            }
         }

         if (II.II != null) {
            II.II.I__o();
         }

         this.IlO = -1;
         this.IIoI = 0;
         this.II0o = 5;
      }
   }

   private void IIOo() {
      if (IOlO.l1oI != this.Il_0) {
         if (!IlO_.II_O()) {
            IlO_.II_l(this.Il_0);
         }
      } else if (IOlO.l1ol != this.Il_o) {
         I_0_.II().II0O(this.Il_o);
      } else if (this.III(Ilol.II().I_o_, Ilol.II().I_oO, this.IIo_, this.IIoO) > 12) {
         Il_0.III1(this.IIo_, this.IIoO);
      } else {
         this.Il01();
         this.II0();
      }
   }

   private void II0() {
      this.II0o = 0;
      this.IlO = -1;
      this.IIoI = 0;
      this.Il_0 = -1;
      this.Il_o = 0;
      this.IIo_ = 0;
      this.IIoO = 0;
   }

   private boolean IIl1() {
      if (Ilol.II().II == null) {
         return false;
      }

      for (int var1 = 0; var1 < Ilol.II().II.length; var1++) {
         I101 var2 = Ilol.II().II[var1];
         if (var2 != null && this.II(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean IIlI() {
      if (Ilol.II().II == null) {
         return false;
      }

      int var1 = 0;

      for (int var2 = 0; var2 < Ilol.II().II.length; var2++) {
         if (Ilol.II().II[var2] == null) {
            var1++;
         }
      }

      return var1 == 0;
   }

   private boolean IIl_() {
      try {
         if (Ilol.II().III == null) {
            return false;
         } else {
            return II.II == null ? false : II.II.ll_o >= Ilol.II().III.length;
         }
      } catch (Exception var2) {
         return false;
      }
   }

   private boolean II(I101 var1) {
      if (var1 == null || var1.II == null) {
         return false;
      }

      if (var1.II.II0l > 4) {
         return false;
      }

      if (var1.II.II0_ > 10) {
         return true;
      }

      String var2 = var1.II.II1o.toLowerCase();
      if (!Il_o.II(var2, IIl_("걥걘단가", 44049)) && !Il_o.II(var2, IIl_("걹닗갶걎곩곅눌겞", 44049)) && !Il_o.II(var2, IIl_("걥걘갦겄곣게겸눃", 44049))) {
         if (var1.III != null) {
            for (int var3 = 0; var3 < var1.III.length; var3++) {
               if (var1.III[var3] != null) {
                  int var4 = var1.III[var3].II.I1l;
                  String var5 = var1.III[var3].II.II1o;
                  if (var4 >= 127 && var4 <= 135 || var4 >= 34 && var4 <= 36 || var4 == 107) {
                     return true;
                  }

                  if (var5 != null && var5.startsWith(IIl_("갵", 44049))) {
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private boolean III(I101 var1) {
      if (var1 == null || var1.II == null) {
         return true;
      }

      if (this.II(var1)) {
         return true;
      }

      if (this.IIIO(var1.II.II__)) {
         return true;
      }

      byte var2 = var1.II.II0l;
      return var2 == 23 || var2 == 24 || var2 == 11 || var2 == 5 || var2 == 14 || var2 == 12 || var2 == 29 || var2 == 32 || var2 == 27 || var2 == 6;
   }

   private boolean IIIO(int var1) {
      try {
         String[] var2 = Il_o.II(IIl_("갤갂걾걂겼겙곹곙괥괙굲굔궱", 44049), ',');

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (Integer.parseInt(var2[var3].trim()) == var1) {
               return true;
            }
         }
      } catch (Exception var4) {
      }

      return false;
   }

   private void Il0l() {
      try {
         this.IlIo = II0l.III().IIIl();
         if (this.IlIo) {
            II0l.III().II1();
         }
      } catch (Exception var3) {
      }

      try {
         this.Ill = IIo_.III().IIIl();
         if (this.Ill) {
            IIo_.III().II1();
         }
      } catch (Exception var2) {
      }
   }

   private void Il01() {
      try {
         if (this.IlIo) {
            II0l.III().IIlo();
         }
      } catch (Exception var3) {
      }

      try {
         if (this.Ill) {
            IIo_.III().IIlo();
         }
      } catch (Exception var2) {
      }

      this.IlIo = false;
      this.Ill = false;
   }

   private int III1() {
      if (Ilol.II().IOIO == 0) {
         return 85;
      } else {
         return Ilol.II().IOIO == 2 ? 94 : 638;
      }
   }

   private int III_() {
      if (IOlO.l1oI == 24) {
         return 389;
      } else {
         return IOlO.l1oI == 25 ? 508 : 511;
      }
   }

   private int III(int var1, int var2, int var3, int var4) {
      int var5 = var1 - var3;
      if (var5 < 0) {
         var5 = -var5;
      }

      int var6 = var2 - var4;
      if (var6 < 0) {
         var6 = -var6;
      }

      return (int)Math.sqrt(var5 * var5 + var6 * var6);
   }

   public boolean IIIO() {
      return this.II0o > 0;
   }
}
