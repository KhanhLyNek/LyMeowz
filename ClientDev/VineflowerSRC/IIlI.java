package main;

public class IIlI extends IIII {
   private static IIlI II;
   private IlI0 II = new IlI0();
   public boolean IIOI = false;
   private int II0o;
   private int IIo;
   private int IIoI;
   private int IIol;
   private int II0O;
   private int IIo1;
   private int IIo_;
   private int IIoO;
   private boolean IIOl;
   private boolean IIO1;
   private static final short II = 4387;
   private static final int IIo0 = 5;
   private static final int IIoo = 39;
   private static final int Il = 0;
   private static final int IlI = 6;
   private static final int IlII = 30;

   private IIlI() {
   }

   public static IIlI II() {
      if (II == null) {
         II = new IIlI();
      }

      return II;
   }

   public static IIlI III() {
      return II();
   }

   @Override
   protected void II1l() {
      this.II0();
      this.II.II(new IIll(this, 700L));
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
      int var1 = this.II();
      if (var1 > 0) {
         this.II0O = IOlO.l1oI;
         this.IIo1 = IOlO.l1ol;
         this.IIo_ = Ilol.II().I_o_;
         this.IIoO = Ilol.II().I_oO;
         this.II0I();
         this.IIo = var1;
         this.IIoI = 0;
         this.II0o = 1;
      }
   }

   private void IIOO() {
      if (IOlO.l1oI != 5) {
         if (!IlO_.II_O()) {
            IlO_.II_l(5);
         }
      } else {
         this.II0o = 2;
      }
   }

   private void IIO0() {
      if (this.IIo <= 0) {
         this.II0o = 3;
      } else if (!this.III(this.IIo)) {
         this.II0o = 3;
      } else if (II.IIIO - this.IIol >= 30) {
         I_1o var1 = II.II;
         if (var1 == null || !var1.I_10) {
            I_0_.II().IIoI(39);
            I_0_.II().II((short)39, (byte)0);
         }

         I_0_.II().II((byte)1, this.IIo, 1);
         this.IIol = II.IIIO;
         this.IIoI++;
         if (this.IIoI >= 6) {
            this.II0o = 3;
         }
      }
   }

   private void IIOo() {
      if (IOlO.l1oI != this.II0O) {
         if (!IlO_.II_O()) {
            IlO_.II_l(this.II0O);
         }
      } else if (IOlO.l1ol != this.IIo1) {
         I_0_.II().II0O(this.IIo1);
      } else if (this.II(Ilol.II().I_o_, Ilol.II().I_oO, this.IIo_, this.IIoO) > 12) {
         Il_0.III1(this.IIo_, this.IIoO);
      } else {
         this.II0l();
         this.II0();
      }
   }

   private void II0() {
      this.II0o = 0;
      this.IIo = -1;
      this.IIoI = 0;
      this.IIol = -99999;
      this.II0O = -1;
      this.IIo1 = 0;
      this.IIo_ = 0;
      this.IIoO = 0;
   }

   private void II0I() {
      try {
         this.IIOl = II0l.III().IIIl();
         if (this.IIOl) {
            II0l.III().II1();
         }
      } catch (Exception var3) {
      }

      try {
         this.IIO1 = IIo_.III().IIIl();
         if (this.IIO1) {
            IIo_.III().II1();
         }
      } catch (Exception var2) {
      }
   }

   private void II0l() {
      try {
         if (this.IIOl) {
            II0l.III().IIlo();
         }
      } catch (Exception var3) {
      }

      try {
         if (this.IIO1) {
            IIo_.III().IIlo();
         }
      } catch (Exception var2) {
      }

      this.IIOl = false;
      this.IIO1 = false;
   }

   private int II() {
      if (!this.IIOI) {
         return -1;
      } else {
         Ilol var1 = Ilol.II();
         if (var1 == null) {
            return -1;
         } else if (this.III() > 0) {
            return -1;
         } else if (I1ol.II1_(4387)) {
            return -1;
         } else {
            boolean var2 = this.II(521);
            if (!var2) {
               return 521;
            } else {
               int var3 = var1.II10();
               if (var3 >= 22) {
                  return 1524;
               } else if (var3 >= 9) {
                  return 1523;
               } else {
                  return var3 >= 1 ? 521 : -1;
               }
            }
         }
      }
   }

   private boolean II(int var1) {
      try {
         I101[] var2 = Ilol.II().II;
         if (var2 == null) {
            return false;
         }

         for (int var3 = 0; var3 < var2.length; var3++) {
            I101 var4 = var2[var3];
            if (var4 != null && var4.II != null && var4.II.II__ == var1) {
               return true;
            }
         }
      } catch (Exception var5) {
      }

      return false;
   }

   private boolean III(int var1) {
      return var1 != 521 && var1 != 1523 && var1 != 1524 ? false : this.III() <= 0 && !I1ol.II1_(4387);
   }

   private int III() {
      try {
         I101[] var1 = Ilol.II().II;
         if (var1 == null) {
            return 0;
         }

         for (int var2 = 0; var2 < var1.length; var2++) {
            I101 var3 = var1[var2];
            if (var3 != null && var3.II != null && var3.II.II__ == 521) {
               if (var3.III != null && var3.III.length > 0 && var3.III[0] != null) {
                  return var3.III[0].lIoI;
               }

               return 0;
            }
         }
      } catch (Exception var4) {
      }

      return 0;
   }

   private int II(int var1, int var2, int var3, int var4) {
      int var5 = var1 - var3;
      if (var5 < 0) {
         var5 = -var5;
      }

      int var6 = var2 - var4;
      if (var6 < 0) {
         var6 = -var6;
      }

      return var5 == 0 && var6 == 0 ? 0 : (int)Math.sqrt(var5 * var5 + var6 * var6);
   }

   public boolean IIIO() {
      return this.II0o > 0;
   }
}
