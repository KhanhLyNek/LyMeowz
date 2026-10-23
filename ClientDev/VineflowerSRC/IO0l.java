package main;

import java.util.Vector;

public final class IO0l {
   public int I1l = -1;
   public int lo0I;
   public Vector IIl = new Vector();

   public IO0l() {
   }

   public IO0l(int var1, int var2) {
      this.I1l = var1;
      this.lo0I = var2;
   }

   public IO0l III(int var1, int var2) {
      this.IIl.addElement(new int[]{var1, var2});
      return this;
   }

   public boolean II1_() {
      return this.I1l < 0;
   }

   public static boolean II0_(int var0) {
      return var0 == 933 || var0 == 1815;
   }

   public int[] III() {
      for (int var1 = 0; var1 < this.IIl.size(); var1++) {
         int[] var2 = (int[])this.IIl.elementAt(var1);
         if (var2[0] == 31) {
            return var2;
         }
      }

      return null;
   }

   public int IIo1() {
      int[] var1 = this.III();
      return var1 != null ? var1[1] : this.lo0I;
   }
}
