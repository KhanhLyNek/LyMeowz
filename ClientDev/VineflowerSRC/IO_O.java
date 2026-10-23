package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import nrolite.Res;

final class IO_O {
   private static boolean IlO0;
   private static IO_O.II[] II = new IO_O.II[0];
   private static int[] I_I = new int[0];
   private final IO0 III_;
   private final IOo_ III_;
   private int lOo1;
   private final Vector IIIo = new Vector();

   IO_O(IO0 var1, IOo_ var2) {
      this.III_ = var1;
      this.III_ = var2;
   }

   static synchronized void I___() {
      if (!IlO0) {
         IlO0 = true;

         try {
            byte[] var0 = Res.read(I11I("쀏샤샆삡삇셥셄셬섃쇩쇱", 49257));
            if (var0 == null) {
               return;
            }

            DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
            int var2 = var1.readUnsignedShort();
            II = new IO_O.II[var2];

            for (int var3 = 0; var3 < var2; var3++) {
               IO_O.II var4 = new IO_O.II();
               var4.I1l = var1.readInt();
               var4.II1o = var1.readUTF();
               var4.lOo_ = var1.readInt();
               var4.lOoO = var1.readInt();
               var4.lOo0 = var1.readShort();
               var4.I_II = new int[var1.readByte()];

               for (int var5 = 0; var5 < var4.I_II.length; var5++) {
                  var4.I_II[var5] = var1.readShort();
               }

               II[var3] = var4;
            }

            I_I = new int[var1.readByte()];

            for (int var7 = 0; var7 < I_I.length; var7++) {
               I_I[var7] = var1.readByte();
            }
         } catch (IOException var6) {
            System.out.println(I11I("쀲샤샎삲삀셙섃설섍쇡쇸쇜솼솛숵쉘숰숖슷싚슺슝쌩쌒", 49257) + var6);
         }
      }
   }

   static IO_O.II II(int var0) {
      I___();

      for (int var1 = 0; var1 < II.length; var1++) {
         if (II[var1].I1l == var0) {
            return II[var1];
         }
      }

      return null;
   }

   private boolean II_O(int var1) {
      for (int var2 = 0; var2 < I_I.length; var2++) {
         if (I_I[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   boolean II(int var1, DataInputStream var2) throws IOException {
      I___();
      switch (var1) {
         case -63:
            this.Il1l(var2.readUnsignedByte());
            return true;
         case -62:
            this.Il1I(var2.readUnsignedByte());
            return true;
         case -61:
         case -60:
         case -59:
         case -58:
         case -53:
         case -52:
         case -48:
         default:
            return false;
         case -57:
            this.III_.IIIl.IIol(I11I("쀢샠쁓삨삂설셗섪\udfa2솠쇫쇖\udf2c솟숻쉒숰\udcbf싹", 49257));
            return true;
         case -56:
            this.III_.IIIl.IIol(I11I("쀢샠쁓삨삂설셗섪\udfa2솠쇫쇖\udf2c솟숻쉒숰\udcbf싹", 49257));
            return true;
         case -55:
            this.lIlo();
            return true;
         case -54:
            this.III_.IIIl.IIol(I11I("쀢샠쁓삨삂설셗섪\udfa2솠쇫쇖\udf2c솟숻쉒숰\udcbf싹", 49257));
            return true;
         case -51:
            this.IIIO(var2);
            return true;
         case -50:
            var2.readInt();
            this.lIl0();
            return true;
         case -49:
            this.III_.IIIl.IIol(I11I("쀢샠쁓삨삂설셗섪\udfa2솠쇫쇖\udf2c솟숻쉒숰\udcbf싹", 49257));
            return true;
         case -47:
            this.IIOo(var2.readUTF());
            return true;
         case -46:
            this.III_(var2);
            return true;
      }
   }

   private void III_(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      if (var2 == 1 || var2 == 3) {
         this.lIl_();
      } else if (var2 == 2) {
         byte var3 = var1.readByte();
         String var4 = var1.readUTF();
         this.IIII(var3, var4);
      } else if (var2 == 4) {
         byte var5 = var1.readByte();
         String var6 = var1.readUTF();
         if (var6.length() > 0) {
            this.IIO0(var6);
         } else {
            this.Il1(var5);
         }
      }
   }

   private void lIl_() {
      IO0o var1 = new IO0o(-46).II(1).II(I_I.length);

      for (int var2 = 0; var2 < I_I.length; var2++) {
         IO_O.II var3 = II(I_I[var2]);
         if (var3 == null) {
            var1.II(I_I[var2]).II("").IIII(-1).IIII(-1);
         } else {
            var1.II(var3.I1l).II(var3.II1o).IIII(var3.lOo_).IIII(var3.lOoO);
         }
      }

      this.III_.II(var1);
   }

   private static String III0(long var0) {
      String var2 = String.valueOf(var0);
      String var3 = "";

      for (int var4 = 0; var4 < var2.length(); var4++) {
         if (var4 > 0 && (var2.length() - var4) % 3 == 0) {
            var3 = var3 + I11I("쁇", 49257);
         }

         var3 = var3 + var2.charAt(var4);
      }

      return var3;
   }

   private boolean II(IO_O.II var1) {
      IOol var2 = this.III_.II;
      if (var1.lOo_ > 0 && var2.Il11 < var1.lOo_) {
         this.III_.IIIl.IIol(I11I("쀫\ude29색샦삎셬쇗섬섆솠삎\udf59쇽솊싻쉔숾쉔슷싕숧슚쌳썆쌹쌙\udd30쏛쏭", 49257) + III0(var1.lOo_ - var2.Il11) + I11I("쁉샾쁇삨삂", 49257));
         return false;
      }

      if (var1.lOoO > 0 && var2.lOoO < var1.lOoO) {
         this.III_.IIIl.IIol(I11I("쀫\ude29색샦삎셬쇗섬섆솠삎\udf59쇽솒쉼\udcf7숺쉔슷싕숧슚쌳썆쌹쌙\udd30쏛쏭", 49257) + (var1.lOoO - var2.lOoO) + I11I("쁉샦샀\ude0b삆", 49257));
         return false;
      }

      if (var1.lOo_ > 0) {
         var2.Il11 = var2.Il11 - var1.lOo_;
      }

      if (var1.lOoO > 0) {
         var2.lOoO = var2.lOoO - var1.lOoO;
      }

      this.III_.IIIl.l1_();
      return true;
   }

   private void IIII(int var1, String var2) {
      IOol var3 = this.III_.II;
      if (var3._lOO != 0) {
         this.III_.IIIl.IIol(I11I("쀢샠쁓삨삂설셗섪\udfa2솠쇫쇖\udf2c솟숻쉒숰\udcbf싹", 49257));
      } else {
         var2 = var2.trim();
         if (var2.length() > 30) {
            this.III_.IIIl.IIol(I11I("쀽쁢색샦삇셥셍섥셁쇨\udf46쇗쇽솗쉳싎숷숟슷쎧썥\udc17썰쌒쌠쌅썮쎎쏾쏜쐫쑁쒴쑈쓳\uda57", 49257));
         } else if (var2.length() == 0) {
            this.III_.IIIl.IIol(I11I("쀽쁢색샦삇셥셍섥셁쇨\udf46쇗쇽솗쉳싎숷숟슷쎧썥\udc17썰쌒쉀\uddb3쎯쏚쎿\udd3d쑥쑍", 49257));
         } else {
            var1 &= 255;
            IO_O.II var4 = II(var1);
            if (var4 != null && this.II_O(var1)) {
               if (this.II(var4)) {
                  var3._lOO = 1;
                  var3.lI_o = var2;
                  var3.lIO = "";
                  var3._lO0 = var1;
                  var3._lOo = (int)(System.currentTimeMillis() / 1000L);
                  var3._l0 = 0;
                  var3._l0I = 0;
                  this.IIIo.removeAllElements();
                  this.III_.ll_1();
                  this.lIlO();
                  this.III_.IIIl.IIol(I11I("쀪샠쁝삥샅셩\udfc8섬섆솠쇽\udf1f솳쇜쌊싙쉹숌\udc36싙싵슖썲썜쌶썐쏻쏆쌭쎂쑣쐊쐪쒜쓩쓁쓫", 49257));
                  this.III_.I__O();
               }
            }
         }
      }
   }

   private void IIO0(String var1) {
      IOol var2 = this.III_.II;
      if (var2._lOO != 0) {
         if (var1.length() > 250) {
            var1 = var1.substring(0, 250);
         }

         var2.lIO = var1;
         this.lIlO();
         this.III_.I__O();
      }
   }

   private void Il1(int var1) {
      IOol var2 = this.III_.II;
      var1 &= 255;
      if (var2._lOO != 0 && var1 != var2._lO0) {
         IO_O.II var3 = II(var1);
         if (var3 != null) {
            if (this.II(var3)) {
               var2._lO0 = var1;
               this.III_.ll_1();
               this.lIlO();
               this.III_.I__O();
            }
         }
      }
   }

   private int II_I(int var1) {
      IO0l var2 = this.III_.II.II[var1];
      return var2 != null && !var2.II1_() ? I0I1.IIoO(var2.I1l) : 57 + this.III_.II.lOlI * 2 + var1;
   }

   private void II(IO0o var1, boolean var2) {
      IOol var3 = this.III_.II;
      var1.IIII(var3.I1l).III(var3.I0).III(-1).III(this.II_I(1)).III(this.II_I(0)).II(var3.II1o).II(0).II(IO00.IIlI(var3.IO_l));
      var1.IIII(0).IIII(0).IIII(var3._l0I);
      if (var2) {
         var1.IIII(var3._l0);
      }

      var1.IIII(var3._lOo);
   }

   void lIlO() {
      IOol var1 = this.III_.II;
      if (var1 != null) {
         if (var1._lOO == 0) {
            this.III_.II(new IO0o(-53).IIII(-1));
         } else {
            IO0o var2 = new IO0o(-53)
               .IIII(var1._lOO)
               .II(var1.lI_o)
               .II(var1.lIO)
               .II(var1._lO0)
               .II(String.valueOf(var1.IO_l))
               .II(var1.II1o)
               .II(1)
               .II(10)
               .II(0)
               .IIII(0)
               .II(1);
            this.II(var2, true);
            var2.II(this.IIIo.size());

            for (int var3 = 0; var3 < this.IIIo.size(); var3++) {
               this.II(var2, (String[])this.IIIo.elementAt(var3));
            }

            this.III_.II(var2);
         }
      }
   }

   private void II(IO0o var1, String[] var2) {
      IOol var3 = this.III_.II;
      var1.II(0).IIII(Integer.parseInt(var2[0])).IIII(var3.I1l).II(var3.II1o).II(0).IIII(Integer.parseInt(var2[2])).II(var2[1]).II(0);
   }

   private void IIIO(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      IOol var3 = this.III_.II;
      if (var3._lOO != 0) {
         if (var2 == 0) {
            String var4 = var1.readUTF();
            String[] var5 = new String[]{String.valueOf(this.lOo1++), var4, String.valueOf((int)(System.currentTimeMillis() / 1000L - 1000000000L))};
            this.IIIo.insertElementAt(var5, 0);
            if (this.IIIo.size() > 20) {
               this.IIIo.removeElementAt(this.IIIo.size() - 1);
            }

            IO0o var6 = new IO0o(-51);
            var6.II(0).IIII(Integer.parseInt(var5[0])).IIII(var3.I1l).II(var3.II1o).II(0).IIII(Integer.parseInt(var5[2])).II(var4).II(0);
            this.III_.II(var6);
         } else if (var2 == 1) {
            this.III_.IIIl.IIol(I11I("쀫샩색삡샅셬\udffa섫셁쇣쇷쀎솼쇜쉸싉쉹숌싿쉖슻슜쌳썄쌸쎚쏡쎎쎦쎄쓪쑉쑩앹\uda44쒆쒽쒍앭씂쑐\udbcd씊", 49257));
         } else {
            var1.readInt();
            this.III_.IIIl.IIol(I11I("쀢샠쁓삨삂설셗섪\udfa2솠쇫쇖\udf2c솟숻쉒숰\udcbf싹", 49257));
         }
      }
   }

   private void IIOo(String var1) {
      IOol var2 = this.III_.II;
      IO0o var3 = new IO0o(-47);
      boolean var4 = var2._lOO != 0 && (var1.length() == 0 || var2.lI_o.toLowerCase().indexOf(var1.toLowerCase()) >= 0);
      if (!var4) {
         this.III_.II(var3.II(0));
      } else {
         var3.II(1).IIII(var2._lOO).II(var2.lI_o).II(var2.lIO).II(var2._lO0).II(String.valueOf(var2.IO_l)).II(var2.II1o).II(1).II(10).IIII(var2._lOo);
         this.III_.II(var3);
      }
   }

   private void lIl0() {
      IOol var1 = this.III_.II;
      if (var1._lOO != 0) {
         IO0o var2 = new IO0o(-50).II(1);
         this.II(var2, false);
         this.III_.II(var2);
      }
   }

   private void lIlo() {
      if (this.III_.II._lOO != 0) {
         this.III_.II.ll00();
      }
   }

   void lI1() {
      IOol var1 = this.III_.II;
      if (var1._lOO != 0) {
         this.III_.IIIl.IIol(I11I("쀹샠\ude04삯샅셪셋샲\udfbc쇮쇸솞솾솔\udcf2쉙쉹숚싶싘슲싔썰썚\uddb6썐쏻쏜쉽\udd37쑨쐊쐢쐀쓮쒆쒷\uda39앪", 49257));
      }
   }

   private void Il1I(int var1) {
      IO_O.II var2 = II(var1);
      if (var2 != null) {
         IO0o var3 = new IO0o(-62).II(var2.I1l).II(var2.I_II.length + 1).III(var2.lOo0);

         for (int var4 = 0; var4 < var2.I_II.length; var4++) {
            var3.III(var2.I_II[var4]);
         }

         this.III_.II(var3);
      }
   }

   private void Il1l(int var1) {
      IO_O.II var2 = II(var1);
      if (var2 != null) {
         IO0o var3 = new IO0o(-63).II(var2.I1l).II(var2.I_II.length);

         for (int var4 = 0; var4 < var2.I_II.length; var4++) {
            var3.III(var2.I_II[var4]);
         }

         this.III_.II(var3);
      }
   }

   static final class II {
      int I1l;
      int lOo_;
      int lOoO;
      int lOo0;
      String II1o;
      int[] I_II;
   }
}
