package main;

import javax.microedition.lcdui.Image;

public final class Il0o {
   public int II0I;
   public int I_O0;
   public short IIII;
   public int I_0;
   public int IIO;
   public int IIOI;
   public int IIOl;
   public byte III;
   public int[] II0o;
   public int[] IIo;
   public static I_l_ III = new I_l_(II0O("淚涿涖湞湊渹湍滎滌溃溝潭潊", 28083));
   public static I_lO III0 = new I_lO(II0O("淅涙涔湩湡渫渚滿", 28083));
   public static I_lO IIIo = new I_lO(II0O("淅涙涔湩湣港渞滸", 28083));
   public static byte[] IIII;
   private int II = 0;
   private int III = 0;
   private static int[] IIo0 = new int[]{79, 80, 81, 85, 86, 90, 91, 92, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108};

   public static void IIl1() {
      III.clear();
      III0.removeAllElements();
      IIIo.removeAllElements();
   }

   public static boolean IIIO(String var0) {
      for (int var1 = 0; var1 < III0.size(); var1++) {
         if (((String)III0.elementAt(var1)).equals(var0)) {
            return true;
         }
      }

      return false;
   }

   private boolean II() {
      for (int var1 = 0; var1 < IIo0.length; var1++) {
         if (this.IIII == IIo0[var1]) {
            return true;
         }
      }

      return false;
   }

   public void II(IO1l var1) {
      if (!Ilol.I10I && (this.IIII != 279 || I1_I.II().lIOI < 110)) {
         int var2 = I1_I.Io1;
         int var3 = I1_I.Io1I;
         Image var4;
         if ((var4 = (Image)III.get(String.valueOf(this.IIII))) != null) {
            if (this.IIII == 96) {
               return;
            }

            if (this.III == 4) {
               this.II = -var2 / 2 + 100;
            }

            if (this.IIII == 28 && this.III == 3) {
               this.II = -var2 / 3 + 200;
            }

            if ((this.IIII == 67 || this.IIII == 68 || this.IIII == 69 || this.IIII == 70) && this.III == 3) {
               this.II = -var2 / 3 + 200;
            }

            if (this.II() && this.III < 4) {
               this.II = -(var2 >> 4) + 50;
               this.III = (var3 >> 5) - 15;
            }

            int var5 = this.I_0 + this.IIOI + this.II;
            int var6 = this.IIO + this.IIOl + this.III;
            if (this.I_0 + this.IIOI + var4.getWidth() + this.II >= var2
               && this.I_0 + this.IIOI + this.II <= var2 + II.IIl
               && this.IIO + this.IIOl + this.III + var4.getHeight() >= var3
               && this.IIO + this.IIOl + this.III <= var3 + II.IIlI) {
               var1.II(var4, 0, 0, IO1l.II(var4), IO1l.III(var4), this.I_O0, this.I_0 + this.IIOI + this.II, this.IIO + this.IIOl + this.III, 0);
               if (this.IIII == 11 && IOlO.l1oI != 122) {
                  var1.IIIO(var5, var6 + 24, 48, 14);

                  for (int var7 = 0; var7 < 2; var7++) {
                     var1.II(IOlO.IIO_, 0, (II.IIIO % 8 >> 2) * 24, 24, 24, 0, var5 + var7 * 24, var6 + 24, 0);
                  }

                  var1.IIIO(I1_I.Io1, I1_I.Io1I, I1_I.I_0, I1_I.IIO);
               }
            }

            if (IOlO.Ill1()
               && this.IIII > 137
               && this.IIII != 156
               && this.IIII != 159
               && this.IIII != 157
               && this.IIII != 165
               && this.IIII != 167
               && this.IIII != 168
               && this.IIII != 169
               && this.IIII != 170
               && this.IIII != 238
               && IOlO.l100 - (this.I_0 + this.IIOI + this.II) >= var2
               && IOlO.l100 - (this.I_0 + this.IIOI + this.II + var4.getWidth()) <= var2 + II.IIl
               && this.IIO + this.IIOl + this.III + var4.getHeight() >= var3
               && this.IIO + this.IIOl + this.III <= var3 + II.IIlI
               && (this.IIII < 241 || this.IIII >= 266)) {
               var1.II(
                  var4,
                  0,
                  0,
                  IO1l.II(var4),
                  IO1l.III(var4),
                  2,
                  IOlO.l100 - (this.I_0 + this.IIOI + this.II) - IO1l.II(var4),
                  this.IIO + this.IIOl + this.III,
                  0
               );
            }
         }
      }
   }
}
