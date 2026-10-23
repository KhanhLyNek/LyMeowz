package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import nrolite.Res;

public final class IOo1 {
   private static IOo1.III[] II;
   private final IO0 II1I;
   private final IOo_ II1I;

   IOo1(IO0 var1, IOo_ var2) {
      this.II1I = var1;
      this.II1I = var2;
      I___();
   }

   private static synchronized void I___() {
      if (II == null) {
         try {
            byte[] var0 = Res.read(I1OO("쯣쯑쮫쮏챿찂착찃쳧", 52113));
            DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
            int var2 = var1.readUnsignedShort();
            II = new IOo1.III[var2];

            for (int var3 = 0; var3 < var2; var3++) {
               IOo1.III var4 = new IOo1.III();
               var4.I1l = var1.readShort();
               var4.lOo0 = var1.readShort();
               var4.l_ = var1.readByte();
               var4.l1Oo = var1.readByte();
               var4.IoI_ = var1.readByte();
               var4._10o = var1.readShort();
               var4.I0 = var1.readShort();
               var4.I0II = var1.readShort();
               var4.I0I = var1.readShort();
               var4.I0Il = var1.readShort();
               var4.II1o = var1.readUTF();
               var4.IlIo = var1.readUTF();
               var4._1o = var1.readShort();
               var4._1oI = var1.readShort();
               var4._1ol = var1.readShort();
               byte var5 = var1.readByte();
               var4.II10 = new int[var5][3];

               for (int var6 = 0; var6 < var5; var6++) {
                  var4.II10[var6][0] = var1.readInt();
                  var4.II10[var6][1] = var1.readInt();
                  var4.II10[var6][2] = var1.readByte();
               }

               II[var3] = var4;
            }
         } catch (Exception var7) {
            II = new IOo1.III[0];
         }
      }
   }

   public static IOo1.III II(int var0) {
      I___();

      for (int var1 = 0; var1 < II.length; var1++) {
         if (II[var1].I1l == var0) {
            return II[var1];
         }
      }

      return null;
   }

   public static boolean Ill(int var0) {
      return II(var0) != null;
   }

   private IOol II() {
      return this.II1I.II;
   }

   private IOo1.II II(int var1) {
      Vector var2 = this.II().II1I;

      for (int var3 = 0; var3 < var2.size(); var3++) {
         IOo1.II var4 = (IOo1.II)var2.elementAt(var3);
         if (var4.I1l == var1) {
            return var4;
         }
      }

      return null;
   }

   void l1ol() {
      I___();
      IO0o var1 = new IO0o(127).II(0).III(II.length);

      for (int var2 = 0; var2 < II.length; var2++) {
         IOo1.III var3 = II[var2];
         IOo1.II var4 = this.II(var3.I1l);
         int var5 = var4 == null ? 0 : var4._10O;
         int var6 = var4 == null ? var3.l1Oo : var4.l1Oo;
         int var7 = var4 == null ? 0 : var4.lOl_;
         int var8 = var4 == null ? 0 : var4._100;
         var1.III(var3.I1l).III(var3.lOo0).II(var3.l_).II(var5).II(var6).II(var3.IoI_);
         if (var3.IoI_ == 0) {
            var1.III(var3._10o);
         } else if (var3.I1l == 1791 && var7 == 2) {
            var1.III(1730).III(1731).III(1732).III(var3.I0Il);
         } else if (var3.I1l == 1791 && var7 > 2) {
            var1.III(1733).III(1734).III(1735).III(var3.I0Il);
         } else {
            var1.III(var3.I0).III(var3.I0II).III(var3.I0I).III(var3.I0Il);
         }

         var1.II(var3.II1o).II(var3.IlIo).II(var7).II(var8).II(var3.II10.length);

         for (int var9 = 0; var9 < var3.II10.length; var9++) {
            var1.II(var3.II10[var9][0]).III(var3.II10[var9][1]).II(var3.II10[var9][2]);
         }

         var1.III(var3._1ol);
      }

      this.II1I.II(var1);
   }

   void II_I(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      if (var2 == 0) {
         this.l1ol();
      } else if (var2 == 1) {
         short var3 = var1.readShort();
         IOo1.II var4 = this.II(var3);
         if (var4 != null && var4.lOl_ != 0) {
            if (var4._100 == 0) {
               Vector var5 = this.II().II1I;

               for (int var6 = 0; var6 < var5.size(); var6++) {
                  if (((IOo1.II)var5.elementAt(var6))._100 == 1) {
                     this.II1I.IIIl.IIol(I1OO("쯂핡쯯쮚챥튗챫찙퉤첈첣툃쵫쵃쵣챳쵢춀첮퍿춉츼칏킋츐캸쾦캷", 52113));
                     return;
                  }
               }

               var4._100 = 1;
            } else {
               var4._100 = 0;
            }

            this.II1I.II(new IO0o(127).II(1).III(var3).II(var4._100));
            this.II1I.ll_0();
            this.II1I.IIIl.l1O0();
            this.II1I.I__O();
         }
      }
   }

   boolean IllI(int var1) {
      IOol var2 = this.II();
      IOo1.III var3 = II(var1);
      if (var3 == null) {
         return false;
      }

      if (var3._1o != -1) {
         IOo1.III var4 = II(var3._1o);
         IOo1.II var5 = var4 == null ? null : this.II(var4.I1l);
         if (var4 == null) {
            return false;
         }

         if (var5 == null || var5.lOl_ < var3._1oI) {
            this.II1I
               .IIIl
               .IIol(I1OO("쯓픑쮡쯎챮튋찥챊쳺촘첲쳆쵱펃촮쵂", 52113) + var4.II1o + I1OO("쮱핯쯯쮍튨챜챫쵻퉐첈", 52113) + var3._1oI + I1OO("쮱쯝픔쮇찭챏첸챊쳽쳀툄쳆쵶평쵣촆퍤췎췘췾춉카킀칺츗칸컎", 52113));
            return false;
         }
      }

      IOo1.II var6 = this.II(var1);
      if (var6 == null) {
         var6 = new IOo1.II(var1, 1, var3.l1Oo, -1, 0);
         var2.II1I.addElement(var6);
         this.II1I.II(new IO0o(127).II(3).III(var6.I1l).II(var6._10O).II(var6.l1Oo));
         this.II1I.II(new IO0o(127).II(2).III(var6.I1l).II(var6.lOl_));
         return true;
      }

      if (var6.lOl_ >= 3) {
         this.II1I.IIIl.IIol(I1OO("쯅쯘해쯎챣쳌찲챊춘챋쳧췷펤쵐쵣촁팤췐춟춪팬칵츛콋츘", 52113));
         return false;
      }

      var6._10O++;
      boolean var8 = false;
      if (var6._10O >= 10 && var6.lOl_ == -1 && var6.I1l == 1791) {
         var8 = true;
      } else if (var6._10O >= 125 && var6.lOl_ > 1 && var6.I1l == 1791) {
         var8 = true;
      } else if (var6._10O >= var6.l1Oo) {
         var8 = true;
      }

      if (var8) {
         var6._10O = 0;
         var6.lOl_ = var6.lOl_ == -1 ? 1 : var6.lOl_ + 1;
         var6._100 = 1;
         this.II1I.ll_0();
         this.II1I.IIIl.l1O0();
         this.II1I.IIIl.l1__();
      }

      this.II1I.II(new IO0o(127).II(3).III(var6.I1l).II(var6._10O).II(var6.l1Oo));
      this.II1I.II(new IO0o(127).II(2).III(var6.I1l).II(var6.lOl_));
      if (var8) {
         this.II1I.II(new IO0o(127).II(1).III(var6.I1l).II(var6._100));
      }

      return true;
   }

   public static int[][] II(IOol var0) {
      Vector var1 = var0.II1I;

      for (int var2 = 0; var2 < var1.size(); var2++) {
         IOo1.II var3 = (IOo1.II)var1.elementAt(var2);
         if (var3._100 == 1) {
            IOo1.III var4 = II(var3.I1l);
            if (var4 == null) {
               return null;
            }

            Vector var5 = new Vector();

            for (int var6 = 0; var6 < var4.II10.length; var6++) {
               int var7 = var4.II10[var6][2];
               if (var7 <= var3.lOl_ || var3.lOl_ == -1 && var7 == 0) {
                  var5.addElement(var4.II10[var6]);
               }
            }

            int[][] var8 = new int[var5.size()][];

            for (int var9 = 0; var9 < var8.length; var9++) {
               var8[var9] = (int[])var5.elementAt(var9);
            }

            return var8;
         }
      }

      return null;
   }

   public static final class II {
      public int I1l;
      public int _10O;
      public int l1Oo;
      public int lOl_;
      public int _100;

      public II(int var1, int var2, int var3, int var4, int var5) {
         this.I1l = var1;
         this._10O = var2;
         this.l1Oo = var3;
         this.lOl_ = var4;
         this._100 = var5;
      }
   }

   public static final class III {
      public int I1l;
      public int lOo0;
      public int l_;
      public int l1Oo;
      public int IoI_;
      public int _10o;
      public int I0;
      public int I0II;
      public int I0I;
      public int I0Il;
      public int _1o;
      public int _1oI;
      public int _1ol;
      public String II1o;
      public String IlIo;
      public int[][] II10;
   }
}
