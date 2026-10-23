package main;

final class IOo0 {
   static final int _1oO = 32;
   static final int _1o0 = 40;
   static final int _1oo = 41;
   static final int __ = 42;
   static final int __I = -1;
   private final IO0 II1_;
   private final IOo_ II11;
   private long IOoo;
   private long I0;
   private long I0I;
   private long I0II;
   private long IO_;
   private int __II;
   private int __Il;

   IOo0(IO0 var1, IOo_ var2) {
      this.II1_ = var1;
      this.II11 = var2;
   }

   private static long IIIl() {
      return System.currentTimeMillis();
   }

   boolean Ilo1() {
      long var1 = IIIl();
      return var1 < this.IOoo || var1 < this.I0 || var1 < this.I0I || var1 < this.I0II;
   }

   boolean Ilo_() {
      return this.Ilo1() || IIIl() < this.IO_;
   }

   private void IIIo(int var1, int var2, int var3) {
      this.II11.II(new IO0o(-124).II(var1).II(0).II(var2).IIII(this.II1_.II.I1l).IIII(var3));
   }

   private void IIII(int var1, long var2) {
      this.II11.II(new IO0o(-106).III(var1).III((int)(var2 / 1000L)));
   }

   boolean II1O(int var1, int var2) {
      if (this.II1_.II.llIl <= 0) {
         return false;
      }

      if (this.II1_.II.IIo(116) > 0) {
         return false;
      }

      this.IOoo = IIIl() + var1;
      this.__II = var2;
      this.IIIo(1, 40, var2);
      return true;
   }

   void II0_(int var1, int var2) {
      if (this.II1_.II.llIl > 0) {
         this.IOoo = IIIl() + var1;
         this.__II = var2;
         this.IIIo(1, 40, var2);
         this.IIII(3779, var1);
      }
   }

   void II0O(int var1, int var2) {
      if (this.II1_.II.llIl > 0) {
         this.I0 = IIIl() + var1;
         this.IIIo(1, 41, var2);
         this.IIII(3782, var1);
      }
   }

   void II00(int var1, int var2) {
      if (this.II1_.II.llIl > 0) {
         this.I0I = IIIl() + var1;
         this.__Il = var2;
         this.IIIo(1, 32, var2);
      }
   }

   void II0o(int var1, int var2) {
      if (this.II1_.II.llIl > 0) {
         this.I0II = IIIl() + var1;
         this.IIIo(1, 42, var2);
         this.IIII(4392, var1);
         this.II1_.ll__();
      }
   }

   void I11_(int var1) {
      if (this.II1_.II.llIl > 0) {
         this.IO_ = IIIl() + var1;
         this.IIII(4133, var1);
         this.II1_.ll__();
      }
   }

   int[] III_() {
      long var1 = IIIl();
      if (var1 < this.I0II) {
         return new int[]{454, 455, 456};
      } else {
         return var1 < this.IO_ ? new int[]{412, 413, 414} : null;
      }
   }

   void III1(long var1) {
      if (this.IOoo != 0L && var1 >= this.IOoo) {
         this.IOoo = 0L;
         this.IIIo(0, 40, this.__II);
      }

      if (this.I0 != 0L && var1 >= this.I0) {
         this.I0 = 0L;
         this.IIIo(0, 41, 0);
      }

      if (this.I0I != 0L && var1 >= this.I0I) {
         this.I0I = 0L;
         this.IIIo(0, 32, this.__Il);
      }

      if (this.I0II != 0L && var1 >= this.I0II) {
         this.I0II = 0L;
         this.IIIo(0, 42, 0);
         this.II1_.ll__();
      }

      if (this.IO_ != 0L && var1 >= this.IO_) {
         this.IO_ = 0L;
         this.II1_.ll__();
      }
   }

   void I_1O() {
      boolean var1 = this.I0II != 0L || this.IO_ != 0L;
      if (this.IOoo != 0L) {
         this.IIIo(0, 40, this.__II);
      }

      if (this.I0 != 0L) {
         this.IIIo(0, 41, 0);
      }

      if (this.I0I != 0L) {
         this.IIIo(0, 32, this.__Il);
      }

      if (this.I0II != 0L) {
         this.IIIo(0, 42, 0);
      }

      this.IOoo = this.I0 = this.I0I = this.I0II = this.IO_ = 0L;
      if (var1) {
         this.II1_.ll__();
      }
   }
}
