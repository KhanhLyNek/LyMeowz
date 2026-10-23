package main;

import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

public class I11O {
   private Random IIII;
   Vector IIII;
   private int[] IlO;

   public I11O(int var1, int var2, int var3, int var4) {
      this.IIII = new Random();
      this.IIII = new Vector();
      this.IlO = new int[]{16711680, 16776960, 65280, 16777215, 255, 65535, 15790320, 12632256};

      for (int var5 = 0; var5 < 72; var5++) {
         this.IIII.addElement(new I1I_(var1, var2, Math.abs(this.IIII.nextInt() % 8) + 3, var5 * 5, this.IlO[Math.abs(this.IIII.nextInt() % this.IlO.length)]));
      }
   }

   public I11O() {
   }

   public static InputStream II(String var0) {
      return I11O.class.getResourceAsStream(var0);
   }
}
