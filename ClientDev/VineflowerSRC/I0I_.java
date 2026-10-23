package main;

import java.io.DataInputStream;
import java.io.IOException;

public final class I0I_ {
   static final int __l1 = 10;
   static final int[] I_o = new int[]{13, 60, 61, 62, 63, 64, 65, 352, 523, 595};
   static final int[] I_oI = new int[]{100, 500, 2, 4, 8, 16, 32, 64, 128, 256};
   static final int[][] II_1 = new int[][]{
      {0, 0, 10, 5},
      {0, 1, 40, 10},
      {0, 16, 40, 100},
      {6, 22, 0, 1},
      {13, 21, 0, 10},
      {27, 18, 0, 20},
      {55, 13, 0, 50},
      {69, 10, 0, 100},
      {104, 4, 0, 300},
      {0, 0, 0, 0}
   };
   static final int[][] II__ = new int[][]{
      {84, 85, 86, 87, 88, 89, 90, 90, 90, 90}, {371, 372, 373, 374, 375, 376, 377, 377, 377, 377}, {378, 379, 380, 381, 382, 383, 384, 384, 384, 384}
   };
   static final int[] I_ol = new int[]{348, 372, 348};
   static final int[] I_o1 = new int[]{20, 50, 120, 300, 800, 1500, 3000, 6000, 7500, 10000};
   static final int[] I_o_ = new int[]{1, 2, 5, 7, 9, 12, 15, 20, 25, 30};
   static final int[][][] III1 = new int[][][]{
      {{19, 22}, {-1, 16}, {3, 10}, {19, 8}, {9, 0}},
      {{-1, 27}, {22, 35}, {15, 24}, {0, 17}, {-1, 7}, {26, 5}, {5, 0}},
      {{25, 41}, {-1, 40}, {25, 34}, {3, 32}, {25, 23}, {10, 19}, {2, 12}, {17, 10}, {4, 5}},
      {{3, 44}, {21, 49}, {25, 39}, {4, 30}, {29, 25}, {0, 18}, {21, 15}, {14, 39}, {18, 25}, {4, 7}, {15, 0}},
      {{21, 58}, {0, 56}, {18, 48}, {10, 0}, {25, 38}, {0, 26}, {14, 28}, {25, 16}, {1, 14}, {22, 7}, {10, 14}, {28, 23}, {15, 16}},
      {{25, 63}, {0, 66}, {21, 52}, {3, 55}, {14, 60}, {3, 45}, {22, 43}, {10, 35}, {22, 28}, {3, 28}, {18, 17}, {3, 14}, {17, 6}, {11, 22}, {6, 1}},
      {
            {32, 86},
            {5, 77},
            {25, 77},
            {8, 89},
            {29, 68},
            {4, 63},
            {18, 61},
            {33, 53},
            {8, 48},
            {26, 39},
            {11, 36},
            {33, 23},
            {18, 25},
            {4, 20},
            {26, 12},
            {12, 7},
            {19, 0}
      },
      {
            {32, 86},
            {5, 77},
            {25, 77},
            {8, 89},
            {29, 68},
            {4, 63},
            {18, 61},
            {33, 53},
            {8, 48},
            {26, 39},
            {11, 36},
            {33, 23},
            {18, 25},
            {4, 20},
            {26, 12},
            {12, 7},
            {19, 0},
            {19, 0},
            {19, 0}
      },
      {
            {32, 86},
            {5, 77},
            {25, 77},
            {8, 89},
            {29, 68},
            {4, 63},
            {18, 61},
            {33, 53},
            {8, 48},
            {26, 39},
            {11, 36},
            {33, 23},
            {18, 25},
            {4, 20},
            {26, 12},
            {12, 7},
            {19, 0},
            {19, 0},
            {19, 0},
            {19, 0},
            {19, 0}
      },
      {
            {32, 86},
            {5, 77},
            {25, 77},
            {8, 89},
            {29, 68},
            {4, 63},
            {18, 61},
            {33, 53},
            {8, 48},
            {26, 39},
            {11, 36},
            {33, 23},
            {18, 25},
            {4, 20},
            {26, 12},
            {12, 7},
            {19, 0},
            {19, 0},
            {19, 0},
            {19, 0},
            {19, 0},
            {19, 0},
            {19, 0}
      }
   };
   private final IO0 II10;
   private final IOo_ II1O;

   I0I_(IO0 var1, IOo_ var2) {
      this.II10 = var1;
      this.II1O = var2;
   }

   private IOol II() {
      return this.II10.II;
   }

   static int IIo0(int var0) {
      return (var0 - 1) * 2 + 5;
   }

   static int IIoo(int var0) {
      return var0 * 60;
   }

   private static int[][] III(int var0) {
      return III1[var0 - 1 < III1.length ? var0 - 1 : III1.length - 1];
   }

   void IIlO() {
      IOol var1 = this.II();
      long var2 = System.currentTimeMillis();
      if (!var1.lI) {
         if (var1._11o < IIo0(var1._110)) {
            int var4 = (int)((var2 - var1.IO00) / 1000L);
            int var5 = var4 / IIoo(var1._110);
            if (var5 > 0) {
               var1._11o += var5;
               if (var1._11o >= IIo0(var1._110)) {
                  var1._11o = IIo0(var1._110);
                  var1.IO00 = var2;
               } else {
                  var1.IO00 = var1.IO00 + (long)var5 * IIoo(var1._110) * 1000L;
               }
            }
         }
      } else if (var2 - var1.IO0o >= IIIl(var1._110)) {
         if (var1._110 < 10) {
            var1._110++;
         }

         var1.lI = false;
         var1.IO00 = var2;
      }
   }

   static long IIIl(int var0) {
      int[] var1 = II_1[var0 - 1];
      return var1[0] * 86400000L + var1[1] * 3600000L + var1[2] * 60000L;
   }

   private int IlO1() {
      IOol var1 = this.II();
      long var2 = var1.IO00 + IIoo(var1._110) * 1000L;
      int var4 = (int)((var2 - System.currentTimeMillis()) / 1000L);
      return var4 < 0 ? 0 : var4;
   }

   private int IlO_() {
      IOol var1 = this.II();
      long var2 = var1.IO0o + IIIl(var1._110) - System.currentTimeMillis();
      return (int)(var2 / 1000L < 0L ? 0L : var2 / 1000L);
   }

   void I___() {
      this.IIlO();
      IOol var1 = this.II();
      int var2 = var1._110;
      int[][] var3 = III(var2);
      IO0o var4 = new IO0o(-34).II(0).III(II__[var1.lOlI][var2 - 1]).II(I1o("웡횽졚졮젙죤혌좤죉쥫힂줶쥅", 51185) + var2).III(I_ol[var1.lOlI]).III(336).II(var2);
      var4.III(var1._11o).III(IIo0(var2)).II(I1o("웡족졁젩졍죧혔좾죉쥠힆줲쥯짇쥁즻직쩬퓄쩐쩽쨏쫲쫔쪱쫘쭹쭞쬼햵쯦쮒쮹핑챻찎찥췍쳥", 51185));
      var4.IIII(var1.lI ? this.IlO_() : this.IlO1());
      var4.II(var3.length);

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4.II(var3[var5][0]).II(var3[var5][1]);
      }

      var4.II(var1.lI);
      this.II1O.II(var4);
   }

   private String II1l() {
      IOol var1 = this.II();
      int[] var2 = II_1[var1._110 - 1];
      String var3 = I1o("잿죲졁젩졍죯혎좺죣", 51185);
      if (var2[0] != 0) {
         var3 = var3 + var2[0] + I1o("잕", 51185);
      }

      if (var2[1] != 0) {
         var3 = var3 + var2[1] + I1o("잙", 51185);
      }

      if (var2[2] != 0) {
         var3 = var3 + var2[2] + I1o("쟖", 51185);
      }

      return var3 + I1o("쟻", 51185) + var2[3] + (var1._110 <= 3 ? I1o("쟑졻", 51185) : I1o("쟑졄졝", 51185)) + I1o("쟻졦죏젠젊", 51185);
   }

   private boolean Ilo0() {
      return this.II()._110 < 10 && this.II()._lOI != 0;
   }

   void l_I() {
      this.IIlO();
      IOol var1 = this.II();
      IO0o var2 = new IO0o(-34).II(1);
      if (!var1.lI) {
         var2.II(I1o("장졸졚졄젅죣혊좩좁", 51185));
         if (this.Ilo0()) {
            var2.II(this.II1l());
         }

         if (var1._11o < IIo0(var1._110)) {
            var2.II(I1o("잺횯졛졮젅혭죟죀좇쥠쥆줨줍즎", 51185) + I_o_[var1._110 - 1] + I1o("쟑졾졈횃젎", 51185));
         }
      } else {
         var2.II(I1o("잿죲졁젩졍죯혎좺죣쥦쥏줧줋짬즩", 51185) + I_o1[var1._110 - 1] + I1o("쟑졾졈횃젎", 51185));
         int[] var3 = II_1[var1._110 - 1];
         var2.II(I1o("잹훷졖졄젃졮죅좭죉쥫힂줶쥯짬흰즫직", 51185) + var3[3] / 2 + (var1._110 <= 3 ? I1o("쟑졻", 51185) : I1o("쟑졄졝", 51185)) + I1o("쟻졦죏젠젊", 51185));
      }

      this.II1O.II(var2);
   }

   void I11O(int var1) {
      this.IIlO();
      IOol var2 = this.II();
      if (!var2.lI) {
         boolean var3 = this.Ilo0();
         int var4 = var3 ? 2 : 1;
         if (var1 == 0) {
            this.II10.IIIl.l1oI();
            this.l_II();
         } else if (var1 == 1 && var3) {
            this.l_Il();
         } else if (var1 == var4 && var2._11o < IIo0(var2._110)) {
            this.l_I_();
         }
      } else if (var1 == 0) {
         this.l_IO();
      } else if (var1 == 1) {
         this.l_I1();
      }
   }

   void l_II() {
      IOol var1 = this.II();
      this.IIlO();
      if (var1._11o <= 0) {
         this.II10.IIIl.IIol(I1o("잲죲졖졮젎죤줛좫죉쥫짔쥦줍휥짗짢죰풭쩪쨞쨳쪜쫴", 51185));
      } else {
         int var2 = var1._110;

         int var3;
         for (var3 = 0; var1._11o > 0; var3++) {
            IO0l var4 = new IO0l(I_o[var2 - 1], 1).III(var2 - 1 > 1 ? 2 : 48, I_oI[var2 - 1]);
            if (!this.II10.IIIl.III0(var4)) {
               break;
            }

            var1._11o--;
         }

         if (var3 == 0) {
            this.II10.IIIl.IIol(I1o("잹죰졁젦졍죸죙좫좇쥯줇줭줍쥰짍즥직쩣쫭쩐쩽쨟쫳푭쫹쪌쭥헧쬻쬓", 51185));
         } else {
            var1.IO00 = System.currentTimeMillis();
            this.II10.IIIl.l1_l();
            this.II1O.II(new IO0o(-34).II(2).III(var1._11o).IIII(this.IlO1()));
            IOO.III var5 = IOO.II(I_o[var2 - 1]);
            this.II10.IIIl.IIol(I1o("잳횱졁졮젛홧죊죪좝쥠쥒쥦줍짫휂즡즉쨠쬎쮎풾쨟쪻", 51185) + var3 + I1o("쟑졸횎젺졍", 51185) + (var5 == null ? I1o("웠횽졚", 51185) : var5.II1o));
            this.II10.I__O();
         }
      }
   }

   private long III0() {
      IOol var1 = this.II();
      int var2 = II_1[var1._110 - 1][3];
      return var2 * (var1._110 <= 3 ? 1000L : 1000000L);
   }

   void l_Il() {
      IOol var1 = this.II();
      long var2 = this.III0();
      if (var1.Il11 < var2) {
         this.II10.IIIl.IIol(I1o("잳횱졁졮젆죤졟좤좎줨젶힡쥅짲쥃즬즆쨠쬎퓽쩽쨒쩹쫔쪾쫘쭴햓쬥쭘쮳쯑쬣쮞찯챚찥찅툴쳟쳩", 51185) + (var2 - var1.Il11) + I1o("쟑졦죏젠젊좬죅혥좈", 51185));
      } else {
         var1.Il11 -= var2;
         var1.lI = true;
         var1.IO0o = System.currentTimeMillis();
         this.II10.IIIl.l1_();
         this.I___();
         this.II10.I__O();
      }
   }

   void l_I1() {
      IOol var1 = this.II();
      var1.Il11 = var1.Il11 + this.III0() / 2L;
      var1.lI = false;
      var1.IO00 = System.currentTimeMillis();
      this.II10.IIIl.l1_();
      this.I___();
      this.II10.I__O();
   }

   void l_I_() {
      IOol var1 = this.II();
      int var2 = I_o_[var1._110 - 1];
      if (var1.lOoO < var2) {
         this.II10.IIIl.IIol(I1o("잳횱졁졮젆죤졟좤좎줨젶힡쥅짪진휏즂쨠쬎퓽쩽쨗퐤쫎쫹쪐햶쭂쭵쬚쯻쯓쮿쮘찣찎찮첞쳥첊첽첀쵮펙촰쵄", 51185) + (var2 - var1.lOoO) + I1o("쟑졾졈횃젎좢", 51185));
      } else {
         var1.lOoO -= var2;
         var1._11o = IIo0(var1._110);
         this.II10.IIIl.l1_();
         this.I___();
         this.II10.I__O();
      }
   }

   void l_IO() {
      IOol var1 = this.II();
      int var2 = I_o1[var1._110 - 1];
      if (var1._110 < 10 && var1.lOoO >= var2) {
         var1.lOoO -= var2;
         var1._110++;
         var1.lI = false;
         var1.IO00 = System.currentTimeMillis();
         this.II10.IIIl.l1_();
         this.I___();
         this.II10.IIIl.IIol(I1o("잿죲졁젩졍죯혎좺죉쥦쥏줧줋짬즃즶즉쫠쩱쩖쩽쨟쩯쫔쪾쫙쬷쭴헴쬚쮳쪣쬲쯐챢튋찹챌", 51185) + var2 + I1o("쟑졾졈횃젎좢", 51185));
         this.II10.I__O();
      } else {
         this.II10.IIIl.IIol(I1o("잳횱졁졮젆죤졟좤좎줨젶힡쥅짪진휏즂쨠쬎퓽쩽쨒쩹쫔쪾쫘쭴햓쬥쭔쯽쯚쮰쮞챧찎찥찃툼쳉쳩첋췥쵟쵥챵쵠춂쳐퍁춋츾칞탹츋캺컍퀉캞켶츤켵콝", 51185));
      }
   }

   void II(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      if (var2 == 1) {
         this.l_I();
      } else if (var2 == 2) {
         this.I___();
      }
   }
}
