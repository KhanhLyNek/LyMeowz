package main;

public final class I101 {
   public I100[] III;
   public I1o II;
   public I_lO IIOo;
   public int lIO1;
   public int IoIO;
   public boolean IO0I;
   public int lIO_;
   public int I1l1;
   public int IIO1;
   public long Iloo;
   public boolean I1lI;
   public int lIOO;
   public int IIOo;
   public int II0;
   public int II;
   public int III;
   public int IIII;
   public int lIO0;
   public int III1;
   public int III_;
   public short II_1 = -1;
   public byte IIO0 = -1;
   public int IIl;
   public boolean IIlI;
   public boolean IIll = false;
   public String IlIO = "";
   public int lIOo;
   public byte IIOo;
   public boolean IO0l;
   public int I1_o = -1;
   public int I1O = -1;
   public int I1OI = -1;
   public int I1Ol = -1;
   public String IlI0 = "";
   public String IlIo;
   public String Ill;

   public I101() {
      int[] var10000 = new int[]{
         0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 3346688, 4199680, 5052928, 3276851, 3932211, 4587571, 5046280, 6684682, 3359744
      };
      int[][] var3 = new int[][]{
         {18687, 16869, 15052, 13235, 11161, 9344},
         {45824, 39168, 32768, 26112, 19712, 13056},
         {16744192, 15037184, 13395456, 11753728, 10046464, 8404992},
         {13500671, 12058853, 10682572, 9371827, 7995545, 6684800},
         {16711705, 15007767, 13369364, 11730962, 10027023, 8388621}
      };
      var10000 = new int[]{2, 1, 1, 1, 1, 1};
   }

   public void IIl1() {
      this.lIOo = II.II.III(this);
   }

   public final boolean II11(int var1) {
      for (int var2 = 0; var2 < this.III.length; var2++) {
         I100 var3;
         if ((var3 = this.III[var2]) != null && var3.II.I1l == var1) {
            return true;
         }
      }

      return false;
   }

   public final boolean IIo0() {
      return this.II.II0l >= 0 && this.II.II0l < 6 || this.II.II0l == 32 || this.II.II0l == 35 || this.II.II0l == 11 || this.II.II0l == 23;
   }

   public void II(int var1, int var2, int var3, int var4) {
      this.I1_o = var1;
      this.I1O = var2;
      this.I1OI = var3;
      this.I1Ol = var4;
   }

   public String IIIo() {
      String var1 = this.II.II1o;
      if (this.III != null) {
         for (int var2 = 0; var2 < this.III.length; var2++) {
            if (this.III[var2].II.I1l == 72) {
               var1 = var1 + Il1("爠牄爕", 29184) + this.III[var2].lIoI + Il1("牝", 29184);
               break;
            }
         }
      }

      if (this.III != null) {
         for (int var4 = 0; var4 < this.III.length; var4++) {
            if (this.III[var4].II.II1o.startsWith(Il1("爤", 29184))) {
               String var3 = this.III[var4].IIlI();
               if (this.III[var4].lIoI == 1) {
                  var1 = var1 + Il1("爊", 29184) + var3;
               }

               if (this.III[var4].lIoI == 0) {
                  var1 = var1 + Il1("爊", 29184) + var3;
               }
            } else {
               String var5 = this.III[var4].IIl();
               if (!var5.equals("") && this.III[var4].II.I1l != 72) {
                  var1 = var1 + Il1("爊", 29184) + var5;
               }
            }
         }
      }

      if (this.II.lIol > 1) {
         var1 = var1 + Il1("爊", 29184) + IO11.I_oo + Il1("爺爿", 29184) + this.II.lIol;
      }

      return var1 + Il1("爊", 29184) + this.II.IllI;
   }
}
