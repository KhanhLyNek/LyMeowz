package main;

import java.util.Random;

public class Il_l {
   public static class II {
      private Object[] II;
      private int I1_;

      public II() {
         this(10);
      }

      public II(int var1) {
         this.II = new Object[var1];
         this.I1_ = 0;
      }

      public void III(Object var1) {
         this.I_0O();
         this.II[this.I1_++] = var1;
      }

      public void III(int var1, Object var2) {
         if (var1 >= 0 && var1 <= this.I1_) {
            this.I_0O();
            System.arraycopy(this.II, var1, this.II, var1 + 1, this.I1_ - var1);
            this.II[var1] = var2;
            this.I1_++;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public Object II(int var1) {
         if (var1 >= 0 && var1 < this.I1_) {
            return this.II[var1];
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public Object III(int var1) {
         if (var1 >= 0 && var1 < this.I1_) {
            Object var2 = this.II[var1];
            int var3 = this.I1_ - var1 - 1;
            if (var3 > 0) {
               System.arraycopy(this.II, var1 + 1, this.II, var1, var3);
            }

            this.II[--this.I1_] = null;
            return var2;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public boolean II(Object var1) {
         for (int var2 = 0; var2 < this.I1_; var2++) {
            if (this.II[var2] == null ? var1 == null : this.II[var2].equals(var1)) {
               this.III(var2);
               return true;
            }
         }

         return false;
      }

      public int IIlO() {
         return this.I1_;
      }

      public boolean II1_() {
         return this.I1_ == 0;
      }

      public void I_1O() {
         for (int var1 = 0; var1 < this.I1_; var1++) {
            this.II[var1] = null;
         }

         this.I1_ = 0;
      }

      public boolean III(Object var1) {
         return this.II(var1) >= 0;
      }

      public int II(Object var1) {
         for (int var2 = 0; var2 < this.I1_; var2++) {
            if (this.II[var2] == null ? var1 == null : this.II[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      }

      public Object II(int var1, Object var2) {
         if (var1 >= 0 && var1 < this.I1_) {
            Object var3 = this.II[var1];
            this.II[var1] = var2;
            return var3;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      private void I_0O() {
         if (this.I1_ == this.II.length) {
            int var1 = this.II.length + (this.II.length >> 1);
            Object[] var2 = new Object[var1];
            System.arraycopy(this.II, 0, var2, 0, this.I1_);
            this.II = var2;
         }
      }
   }

   public static class III {
      public static void IIII(Il_l.II var0) {
         II(var0, (Il_l.IIIl)null);
      }

      public static void II(Il_l.II var0, Il_l.IIIl var1) {
         Object[] var2 = new Object[var0.IIlO()];

         for (int var3 = 0; var3 < var0.IIlO(); var3++) {
            var2[var3] = var0.II(var3);
         }

         II(var2, 0, var2.length - 1, var1);

         for (int var4 = 0; var4 < var0.IIlO(); var4++) {
            var0.II(var4, var2[var4]);
         }
      }

      private static void II(Object[] var0, int var1, int var2, Il_l.IIIl var3) {
         if (var1 < var2) {
            int var4 = II(var0, var1, var2, var3);
            II(var0, var1, var4 - 1, var3);
            II(var0, var4 + 1, var2, var3);
         }
      }

      private static int II(Object[] var0, int var1, int var2, Il_l.IIIl var3) {
         Object var4 = var0[var2];
         int var5 = var1 - 1;

         for (int var6 = var1; var6 < var2; var6++) {
            if (II(var0[var6], var4, var3) <= 0) {
               Object var7 = var0[++var5];
               var0[var5] = var0[var6];
               var0[var6] = var7;
            }
         }

         Object var8 = var0[var5 + 1];
         var0[var5 + 1] = var0[var2];
         var0[var2] = var8;
         return var5 + 1;
      }

      private static int II(Object var0, Object var1, Il_l.IIIl var2) {
         return var2 != null ? var2.II(var0, var1) : ((Il_l.IIII)var0).III(var1);
      }

      public static void IIIl(Il_l.II var0) {
         int var1 = var0.IIlO();

         for (int var2 = 0; var2 < var1 / 2; var2++) {
            Object var3 = var0.II(var2);
            var0.II(var2, var0.II(var1 - 1 - var2));
            var0.II(var1 - 1 - var2, var3);
         }
      }

      public static int II(Il_l.II var0, Object var1) {
         return II(var0, var1, null);
      }

      public static int II(Il_l.II var0, Object var1, Il_l.IIIl var2) {
         int var3 = 0;
         int var4 = var0.IIlO() - 1;

         while (var3 <= var4) {
            int var5 = (var3 + var4) / 2;
            Object var6 = var0.II(var5);
            int var7 = II(var6, var1, var2);
            if (var7 < 0) {
               var3 = var5 + 1;
            } else {
               if (var7 <= 0) {
                  return var5;
               }

               var4 = var5 - 1;
            }
         }

         return -(var3 + 1);
      }

      public static Object II(Il_l.II var0) {
         return II(var0, (Il_l.IIIl)null);
      }

      public static Object II(Il_l.II var0, Il_l.IIIl var1) {
         if (var0.II1_()) {
            throw new RuntimeException(II_o("욉욆읺읝윱읇쟪쟌잷잗", 50892));
         }

         Object var2 = var0.II(0);

         for (int var3 = 1; var3 < var0.IIlO(); var3++) {
            Object var4 = var0.II(var3);
            if (II(var4, var2, var1) < 0) {
               var2 = var4;
            }
         }

         return var2;
      }

      public static Object III(Il_l.II var0) {
         return III(var0, null);
      }

      public static Object III(Il_l.II var0, Il_l.IIIl var1) {
         if (var0.II1_()) {
            throw new RuntimeException(II_o("욉욆읺읝윱읇쟪쟌잷잗", 50892));
         }

         Object var2 = var0.II(0);

         for (int var3 = 1; var3 < var0.IIlO(); var3++) {
            Object var4 = var0.II(var3);
            if (II(var4, var2, var1) > 0) {
               var2 = var4;
            }
         }

         return var2;
      }

      public static void II(Il_l.II var0, Random var1) {
         int var2 = var0.IIlO();

         for (int var3 = var2 - 1; var3 > 0; var3--) {
            int var4 = var1.nextInt(var3 + 1);
            Object var5 = var0.II(var3);
            var0.II(var3, var0.II(var4));
            var0.II(var4, var5);
         }
      }
   }

   public static class III0 {
      private char[] II;
      private int I1_1;

      public III0() {
         this(16);
      }

      public III0(int var1) {
         this.II = new char[var1];
         this.I1_1 = 0;
      }

      public III0(String var1) {
         this(var1.length() + 16);
         this.II(var1);
      }

      public Il_l.III0 II(String var1) {
         if (var1 == null) {
            var1 = IIOI("鳧鳝鲫鲊", 40073);
         }

         int var2 = var1.length();
         this.II1_(this.I1_1 + var2);
         var1.getChars(0, var2, this.II, this.I1_1);
         this.I1_1 += var2;
         return this;
      }

      public Il_l.III0 II(char var1) {
         this.II1_(this.I1_1 + 1);
         this.II[this.I1_1++] = var1;
         return this;
      }

      public Il_l.III0 II(int var1) {
         return this.II(String.valueOf(var1));
      }

      public Il_l.III0 II(long var1) {
         return this.II(String.valueOf(var1));
      }

      public Il_l.III0 II(boolean var1) {
         return this.II(String.valueOf(var1));
      }

      public Il_l.III0 II(Object var1) {
         return this.II(var1 == null ? IIOI("鳧鳝鲫鲊", 40073) : var1.toString());
      }

      public Il_l.III0 II(int var1, String var2) {
         if (var1 >= 0 && var1 <= this.I1_1) {
            if (var2 == null) {
               var2 = IIOI("鳧鳝鲫鲊", 40073);
            }

            int var3 = var2.length();
            this.II1_(this.I1_1 + var3);
            System.arraycopy(this.II, var1, this.II, var1 + var3, this.I1_1 - var1);
            var2.getChars(0, var3, this.II, var1);
            this.I1_1 += var3;
            return this;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public Il_l.III0 II(int var1, int var2) {
         if (var1 >= 0 && var1 <= this.I1_1 && var1 <= var2) {
            if (var2 > this.I1_1) {
               var2 = this.I1_1;
            }

            int var3 = var2 - var1;
            if (var3 > 0) {
               System.arraycopy(this.II, var2, this.II, var1, this.I1_1 - var2);
               this.I1_1 -= var3;
            }

            return this;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public Il_l.III0 III(int var1) {
         if (var1 >= 0 && var1 < this.I1_1) {
            System.arraycopy(this.II, var1 + 1, this.II, var1, this.I1_1 - var1 - 1);
            this.I1_1--;
            return this;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public Il_l.III0 II() {
         for (int var1 = 0; var1 < this.I1_1 / 2; var1++) {
            char var2 = this.II[var1];
            this.II[var1] = this.II[this.I1_1 - 1 - var1];
            this.II[this.I1_1 - 1 - var1] = var2;
         }

         return this;
      }

      public char II(int var1) {
         if (var1 >= 0 && var1 < this.I1_1) {
            return this.II[var1];
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public void II(int var1, char var2) {
         if (var1 >= 0 && var1 < this.I1_1) {
            this.II[var1] = var2;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public int IIl0() {
         return this.I1_1;
      }

      public void II11(int var1) {
         if (var1 < 0) {
            throw new IndexOutOfBoundsException();
         }

         this.II1_(var1);
         if (var1 > this.I1_1) {
            for (int var2 = this.I1_1; var2 < var1; var2++) {
               this.II[var2] = 0;
            }
         }

         this.I1_1 = var1;
      }

      @Override
      public String toString() {
         return new String(this.II, 0, this.I1_1);
      }

      public String IIII(int var1) {
         return this.II(var1, (int)this.I1_1);
      }

      public String II(int var1, int var2) {
         if (var1 >= 0 && var2 <= this.I1_1 && var1 <= var2) {
            return new String(this.II, var1, var2 - var1);
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      private void II1_(int var1) {
         if (var1 > this.II.length) {
            int var2 = (this.II.length + 1) * 2;
            if (var2 < var1) {
               var2 = var1;
            }

            char[] var3 = new char[var2];
            System.arraycopy(this.II, 0, var3, 0, this.I1_1);
            this.II = var3;
         }
      }
   }

   public static class III1 {
      private Il_l.III1.II[] II;
      private int I1_;
      private int I1_I;

      public III1() {
         this(16);
      }

      public III1(int var1) {
         this.II = new Il_l.III1.II[var1];
         this.I1_I = (int)(var1 * 0.75F);
         this.I1_ = 0;
      }

      public Object II(Object var1, Object var2) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         int var3 = var1.hashCode();
         int var4 = (var3 & 2147483647) % this.II.length;

         for (Il_l.III1.II var5 = this.II[var4]; var5 != null; var5 = var5.II) {
            if (var5.I1_l == var3 && var5.III.equals(var1)) {
               Object var6 = var5.IIII;
               var5.IIII = var2;
               return var6;
            }
         }

         if (this.I1_ >= this.I1_I) {
            this.I_00();
            var4 = (var3 & 2147483647) % this.II.length;
         }

         this.II[var4] = new Il_l.III1.II(var1, var2, var3, this.II[var4]);
         this.I1_++;
         return null;
      }

      public Object II(Object var1) {
         if (var1 == null) {
            return null;
         }

         int var2 = var1.hashCode();
         int var3 = (var2 & 2147483647) % this.II.length;

         for (Il_l.III1.II var4 = this.II[var3]; var4 != null; var4 = var4.II) {
            if (var4.I1_l == var2 && var4.III.equals(var1)) {
               return var4.IIII;
            }
         }

         return null;
      }

      public Object III(Object var1) {
         if (var1 == null) {
            return null;
         }

         int var2 = var1.hashCode();
         int var3 = (var2 & 2147483647) % this.II.length;
         Il_l.III1.II var4 = null;

         for (Il_l.III1.II var5 = this.II[var3]; var5 != null; var5 = var5.II) {
            if (var5.I1_l == var2 && var5.III.equals(var1)) {
               if (var4 == null) {
                  this.II[var3] = var5.II;
               } else {
                  var4.II = var5.II;
               }

               this.I1_--;
               return var5.IIII;
            }

            var4 = var5;
         }

         return null;
      }

      public boolean IIII(Object var1) {
         return this.II(var1) != null;
      }

      public int IIlO() {
         return this.I1_;
      }

      public boolean II1_() {
         return this.I1_ == 0;
      }

      public void I_1O() {
         for (int var1 = 0; var1 < this.II.length; var1++) {
            this.II[var1] = null;
         }

         this.I1_ = 0;
      }

      public Il_l.II IIII() {
         Il_l.II var1 = new Il_l.II();

         for (int var2 = 0; var2 < this.II.length; var2++) {
            for (Il_l.III1.II var3 = this.II[var2]; var3 != null; var3 = var3.II) {
               var1.III(var3.III);
            }
         }

         return var1;
      }

      public Il_l.II IIIl() {
         Il_l.II var1 = new Il_l.II();

         for (int var2 = 0; var2 < this.II.length; var2++) {
            for (Il_l.III1.II var3 = this.II[var2]; var3 != null; var3 = var3.II) {
               var1.III(var3.IIII);
            }
         }

         return var1;
      }

      private void I_00() {
         Il_l.III1.II[] var1 = this.II;
         this.II = new Il_l.III1.II[var1.length * 2];
         this.I1_I = (int)(this.II.length * 0.75F);

         for (int var2 = 0; var2 < var1.length; var2++) {
            Il_l.III1.II var3 = var1[var2];

            while (var3 != null) {
               Il_l.III1.II var4 = var3.II;
               int var5 = (var3.I1_l & 2147483647) % this.II.length;
               var3.II = this.II[var5];
               this.II[var5] = var3;
               var3 = var4;
            }
         }
      }

      static class II {
         Object III;
         Object IIII;
         Il_l.III1.II II;
         int I1_l;

         II(Object var1, Object var2, int var3, Il_l.III1.II var4) {
            this.III = var1;
            this.IIII = var2;
            this.I1_l = var3;
            this.II = var4;
         }
      }
   }

   public interface IIII {
      int III(Object var1);
   }

   public static class IIIO {
      private Il_l.II II1 = new Il_l.II();
      private Il_l.IIIl II;

      public IIIO() {
         this(null);
      }

      public IIIO(Il_l.IIIl var1) {
         this.II = var1;
      }

      public void III(Object var1) {
         this.II1.III(var1);
         this.II1I(this.II1.IIlO() - 1);
      }

      public Object II() {
         if (this.II1.II1_()) {
            return null;
         }

         Object var1 = this.II1.II(0);
         Object var2 = this.II1.III(this.II1.IIlO() - 1);
         if (!this.II1.II1_()) {
            this.II1.II(0, var2);
            this.II1l(0);
         }

         return var1;
      }

      public Object III_() {
         return this.II1.II1_() ? null : this.II1.II(0);
      }

      public int IIlO() {
         return this.II1.IIlO();
      }

      public boolean II1_() {
         return this.II1.II1_();
      }

      public void I_1O() {
         this.II1.I_1O();
      }

      private void II1I(int var1) {
         Object var2 = this.II1.II(var1);

         while (var1 > 0) {
            int var3 = (var1 - 1) / 2;
            Object var4 = this.II1.II(var3);
            if (this.II(var2, var4) >= 0) {
               break;
            }

            this.II1.II(var1, var4);
            var1 = var3;
         }

         this.II1.II(var1, var2);
      }

      private void II1l(int var1) {
         Object var2 = this.II1.II(var1);
         int var3 = this.II1.IIlO() / 2;

         while (var1 < var3) {
            int var4 = 2 * var1 + 1;
            Object var5 = this.II1.II(var4);
            int var6 = var4 + 1;
            if (var6 < this.II1.IIlO() && this.II(var5, this.II1.II(var6)) > 0) {
               var4 = var6;
               var5 = this.II1.II(var6);
            }

            if (this.II(var2, var5) <= 0) {
               break;
            }

            this.II1.II(var1, var5);
            var1 = var4;
         }

         this.II1.II(var1, var2);
      }

      private int II(Object var1, Object var2) {
         return this.II != null ? this.II.II(var1, var2) : ((Il_l.IIII)var1).III(var2);
      }
   }

   public static class III_ {
      private Il_l.III_.II II = null;
      private Il_l.III_.II III = null;
      private int I1_ = 0;

      public void III(Object var1) {
         this.IIIl(var1);
      }

      public void IIII(Object var1) {
         Il_l.III_.II var2 = new Il_l.III_.II(var1);
         if (this.II == null) {
            this.II = this.III = var2;
         } else {
            var2.IIII = this.II;
            this.II.IIIl = var2;
            this.II = var2;
         }

         this.I1_++;
      }

      public void IIIl(Object var1) {
         Il_l.III_.II var2 = new Il_l.III_.II(var1);
         if (this.III == null) {
            this.II = this.III = var2;
         } else {
            var2.IIIl = this.III;
            this.III.IIII = var2;
            this.III = var2;
         }

         this.I1_++;
      }

      public Object II(int var1) {
         return this.II(var1).II;
      }

      public Object III() {
         if (this.II == null) {
            throw new RuntimeException(IIO("꺟꺔꽨꽃꼯꽕꿸꿚꾡꾅", 44762));
         } else {
            return this.II.II;
         }
      }

      public Object IIII() {
         if (this.III == null) {
            throw new RuntimeException(IIO("꺟꺔꽨꽃꼯꽕꿸꿚꾡꾅", 44762));
         } else {
            return this.III.II;
         }
      }

      public Object IIIl() {
         if (this.II == null) {
            throw new RuntimeException(IIO("꺟꺔꽨꽃꼯꽕꿸꿚꾡꾅", 44762));
         }

         Object var1 = this.II.II;
         this.II = this.II.IIII;
         if (this.II == null) {
            this.III = null;
         } else {
            this.II.IIIl = null;
         }

         this.I1_--;
         return var1;
      }

      public Object III1() {
         if (this.III == null) {
            throw new RuntimeException(IIO("꺟꺔꽨꽃꼯꽕꿸꿚꾡꾅", 44762));
         }

         Object var1 = this.III.II;
         this.III = this.III.IIIl;
         if (this.III == null) {
            this.II = null;
         } else {
            this.III.IIII = null;
         }

         this.I1_--;
         return var1;
      }

      public Object III(int var1) {
         Il_l.III_.II var2 = this.II(var1);
         return this.II(var2);
      }

      public boolean II(Object var1) {
         for (Il_l.III_.II var2 = this.II; var2 != null; var2 = var2.IIII) {
            if (var2.II == null ? var1 == null : var2.II.equals(var1)) {
               this.II(var2);
               return true;
            }
         }

         return false;
      }

      public int IIlO() {
         return this.I1_;
      }

      public boolean II1_() {
         return this.I1_ == 0;
      }

      public void I_1O() {
         this.II = this.III = null;
         this.I1_ = 0;
      }

      public boolean III(Object var1) {
         for (Il_l.III_.II var2 = this.II; var2 != null; var2 = var2.IIII) {
            if (var2.II == null ? var1 == null : var2.II.equals(var1)) {
               return true;
            }
         }

         return false;
      }

      private Il_l.III_.II II(int var1) {
         if (var1 >= 0 && var1 < this.I1_) {
            Il_l.III_.II var2;
            if (var1 < this.I1_ / 2) {
               var2 = this.II;

               for (int var3 = 0; var3 < var1; var3++) {
                  var2 = var2.IIII;
               }
            } else {
               var2 = this.III;

               for (int var4 = this.I1_ - 1; var4 > var1; var4--) {
                  var2 = var2.IIIl;
               }
            }

            return var2;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      private Object II(Il_l.III_.II var1) {
         Object var2 = var1.II;
         if (var1.IIIl == null) {
            this.II = var1.IIII;
         } else {
            var1.IIIl.IIII = var1.IIII;
         }

         if (var1.IIII == null) {
            this.III = var1.IIIl;
         } else {
            var1.IIII.IIIl = var1.IIIl;
         }

         this.I1_--;
         return var2;
      }

      static class II {
         Object II;
         Il_l.III_.II IIII;
         Il_l.III_.II IIIl;

         II(Object var1) {
            this.II = var1;
         }
      }
   }

   public interface IIIl {
      int II(Object var1, Object var2);
   }
}
