package main;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

final class IO0O {
   static final int _III = 54;
   static final int _IIl = 8100;
   static final int _II1 = 8101;
   static final int _II_ = 8200;
   static final int _IIO = 8201;
   static final int _II0 = 8202;
   static final int _IIo = 8210;
   static final int _Il = 8211;
   static final int _IlI = 8212;
   static final int _Ill = 8220;
   static final int _Il1 = 8221;
   static final int _Il_ = 8222;
   static final int _IlO = 8223;
   static final int _Il0 = 7;
   static final int _Ilo = 0;
   static final int _I1 = 39;
   static final int _I1I = 100000;
   static final int _I1l = 100;
   static final int _I11 = 60000;
   static final int _I1_ = 50;
   static final int _I1O = 10;
   static final int _I10 = 300000;
   private final IO0 IIlO;
   private final IOo_ IIlO;
   private final Random IIl_ = new Random();
   private int _I1o = 0;
   boolean IoO;
   private long I_11;
   private long I_1_;
   private final Vector[] III = new Vector[]{new Vector(), new Vector()};
   private final long[] IIIO = new long[]{-1L, -1L};
   private int _I_ = -1;
   private final long[][] III = new long[2][2];
   private final long[][] IIII = new long[2][2];
   private final long[] III0 = new long[]{-1L, -1L};
   private static final String[] IlOl = new String[]{
      I1O("\uddb8\udefb\ude5e", 56819),
      I1O("\uddb1\udee8\ude50", 56819),
      I1O("\uddb1\ude73\ude5e", 56819),
      I1O("\udce3샇\ude58\ude5a\ude02쁧\udece\udeec\ude88\udeba쇊\udf2b", 56819),
      I1O("\uddbd\ude75\ude59삙\ude4f\udeed\udec5\udf6d\ude82", 56819)
   };
   private static final String[] IlO1 = new String[]{I1O("\uddb8\udefb\ude5e", 56819), I1O("\uddb1\udee8\ude50", 56819), I1O("\uddb1\ude73\ude5e", 56819)};

   IO0O(IO0 var1, IOo_ var2) {
      this.IIlO = var1;
      this.IIlO = var2;
   }

   static String IIIo(long var0) {
      String var2 = String.valueOf(Math.abs(var0));
      StringBuilder var3 = new StringBuilder();

      for (int var4 = 0; var4 < var2.length(); var4++) {
         if (var4 > 0 && (var2.length() - var4) % 3 == 0) {
            var3.append('.');
         }

         var3.append(var2.charAt(var4));
      }

      return (var0 < 0L ? I1O("\uddde", 56819) : "") + var3;
   }

   private boolean IIlO(int var1, int var2) {
      return this.IIl_.nextInt(var2) < var1;
   }

   private int IIl1(int var1, int var2) {
      return var1 + this.IIl_.nextInt(var2 - var1 + 1);
   }

   private int II10(int var1) {
      int var2 = 0;
      IO0l[] var3 = this.IIlO.II.III;

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (!var3[var4].II1_() && var3[var4].I1l == var1) {
            var2 += var3[var4].lo0I;
         }
      }

      return var2;
   }

   private void II1O(int var1, int var2) {
      IO0l[] var3 = this.IIlO.II.III;

      for (int var4 = 0; var4 < var3.length && var2 > 0; var4++) {
         if (!var3[var4].II1_() && var3[var4].I1l == var1) {
            if (var3[var4].lo0I > var2) {
               var3[var4].lo0I -= var2;
               var2 = 0;
            } else {
               var2 -= var3[var4].lo0I;
               var3[var4] = new IO0l();
            }
         }
      }
   }

   void ll0I() {
      IOol var1 = this.IIlO.II;
      this.IIlO
         .II
         .IIII(
            19,
            8100,
            I1O("\uddb0\ude7d\ude5f\ude70\ude02\udefb쁼\udea2\udecb\udf66\udfc9\udf25\udf47\udfe1\udf49\udfe4\udf8d\ue0e2\ue04e\ue07f", 56819),
            new String[]{
               I1O("\udda2\ude67\ude50\ude29\ude4f\udeec쀜\udea2\ude8c\udf00\udf5f\udfa8\udf09\udfe1", 56819),
               I1O("\udda5\udee0\ude5f\ude37\ude4f\udeff\uded8\udead\ude92\udf00\ude38쇿\udf04\udfa6\udfc7\udfad설\ue076", 56819),
               I1O("\udda1\udfa2\udf90\ude3e\ude08\udeae\udedd\udea4쀎\udf00\udf01", 56819) + var1.II11.size() + I1O("\uddd3\ude7f\udec2\ude3e\ude46", 56819),
               I1O("\uddab\udee1\ude50\ude70\ude07쀱\uded9\udec6\ude9f\udf78\udf46\udf26\udf00\udfa6\udfd7\ude74\ude42\ue06c\ue046", 56819),
               I1O("\udce3\udee1\ude5f\ude37", 56819)
            }
         );
   }

   boolean IIl0(int var1, int var2) {
      if (var1 == 8100) {
         if (var2 == 0) {
            this.IIIl(0, false);
         } else if (var2 == 1) {
            this.IIIl(7, true);
         } else if (var2 == 2) {
            this.ll0l();
         } else if (var2 == 3) {
            this.IIlO
               .II
               .IIII(
                  19,
                  8101,
                  I1O(
                     "\uddb0\ude7d\ude5f\ude70\ude0c\ude7d\ude8d\udeaf\ude83솥\udf4a\udf68\udf0a\udff3셴\udfaa\udfc3\ue07a\ue0d2\ue021\ue07f\ue016︢\ue0c8\ue0fb\ue08cﾴ\ue14c\ue177\ue106\ue1fd＝\ue1be\ue1d2\ue265\ue242\ue220\ue200\ue2ea\ue28c\ue2b9\ue35a\ue2a8\ue346\ue320\ue346\ue3f5\ue3ccﴦ\ue3dd\ue421\ue473\ue45e\ue42b\ue45d\ue4f7\ue4d3\ue4b3\ue4d9\ue560\ue5c4\ue537\ue555\ue5e7\ufb0e\ue5f2\ue59a\ue678\ue6db\ue620\ue60a\ue6ac\ue6df\ue6a2\uf82a\ue728\ue74c\ue72e\ue791\ue7ed\ue783\ue7b2\ue789\uf6e5\ue87c\ue81f",
                     56819
                  ),
                  new String[]{I1O("\udce3상\ude5f\ude37\ude4f\ude73", 56819), I1O("\uddbb샵\ude48\ude70\ude0d쁁", 56819)}
               );
         }

         return true;
      } else if (var1 == 8101) {
         if (var2 == 0) {
            this.IIlO.II.II11.removeAllElements();
            this.IIlO
               .IIIl
               .IIol(
                  I1O(
                     "\udce3\udef1\ude11\ude28\ude9c\udeef\ude8d\udea4쁔\udf7e\udf09\udf3e쇊\udff2\udf85\udfb4\udf8bﺫ\ue04c\ue060\ue02b\ue00c\ue0f2\ue0d2\ue0bc\ue0da\ue16b\ue088\ue0f6\ue118\ue1f2",
                     56819
                  )
               );
            this.IIlO.I__O();
         }

         return true;
      } else {
         return false;
      }
   }

   private void IIIl(int var1, boolean var2) {
      this._I1o = var1;
      IO0o var3 = new IO0o(-127).II(0).II(7);

      for (int var4 = 0; var4 < 7; var4++) {
         var3.III(var2 ? 419 : 419 + var4);
      }

      var3.II(var1).IIII(var1 == 7 ? 39 : 100000).III(-1);
      this.IIlO.II(var3);
   }

   void III1(DataInputStream var1) {
      byte var2;
      try {
         var1.readByte();
         var2 = var1.readByte();
      } catch (IOException var8) {
         this.IIIl(this._I1o, this._I1o == 7);
         return;
      }

      if (var2 > 0 && var2 <= 7) {
         IOol var3 = this.IIlO.II;
         if (this._I1o == 7) {
            int var4 = var2 * 39;
            if (var3.lOoO < var4) {
               this.IIlO
                  .IIIl
                  .IIol(I1O("\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udfe8\udfc2섉\udf80\ue022\ue130ﺃ\ue07f\ue013﹂", 56819));
               return;
            }

            if (var2 + var3.II11.size() > 100) {
               this.IIlO.IIIl.IIol(I1O("\udda1\udfa2\udf90\ude3e\ude08\udeae\udedd\udea4쀎\udf2a\ude38\udfab\udf47\ude97섂\udfbd", 56819));
               return;
            }

            var3.lOoO -= var4;
         } else {
            long var9 = var2 * 100000L;
            if (var3.Il11 < var9) {
               this.IIlO
                  .IIIl
                  .IIol(I1O("\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udff0\udf45\udfaa\udf84\ue022\ue130ﺃ\ue07f\ue013﹂", 56819));
               return;
            }

            if (var2 + var3.II11.size() > 100) {
               this.IIlO.IIIl.IIol(I1O("\udda1\udfa2\udf90\ude3e\ude08\udeae\udedd\udea4쀎\udf2a\ude38\udfab\udf47\ude97섂\udfbd", 56819));
               return;
            }

            var3.Il11 -= var9;
         }

         Vector var10 = new Vector();

         for (int var5 = 0; var5 < var2; var5++) {
            IO0l var6 = this.III_();
            var10.addElement(var6);
            var3.II11.addElement(var6);
         }

         IO0o var11 = new IO0o(-127).II(1).II(var10.size());

         for (int var12 = 0; var12 < var10.size(); var12++) {
            IOO.III var7 = IOO.II(((IO0l)var10.elementAt(var12)).I1l);
            var11.III(var7 == null ? 0 : var7.lOo0);
         }

         this.IIlO.II(var11);
         this.IIlO.IIIl.l1_();
         this.IIlO.I__O();
      } else {
         this.IIIl(this._I1o, this._I1o == 7);
      }
   }

   private IO0l IIII(int var1, int var2) {
      return new IO0l(189, this.IIl1(var1, var2) * 1000);
   }

   private IO0l IIII(int var1) {
      IO0l var2 = new IO0l(var1, 1);
      var2.III(50, this.IIl1(10, 15)).III(77, this.IIl1(10, 15)).III(103, this.IIl1(10, 15)).III(154, 0);
      if (!this.IIlO(1, 100)) {
         var2.III(93, this.IIl1(3, 15));
      }

      return var2;
   }

   private IO0l III_() {
      IO0l var1 = this.IIII(5, 50);
      boolean var2 = this.IIlO(1, 2);
      if (this.IIlO(1, 2)) {
         if (this.IIlO(5, 100)) {
            var1 = this.IIII(1208);
         } else if (this.IIlO(5, 100)) {
            var1 = this.IIII(1209);
         } else if (this.IIlO(5, 100)) {
            var1 = this.IIII(1210);
         } else if (this.IIlO(5, 100)) {
            var1 = new IO0l(884, 1);
            var1.III(5, this.IIl1(10, 30)).III(50, this.IIl1(3, 9)).III(77, this.IIl1(3, 9)).III(103, this.IIl1(3, 9)).III(154, 0);
            if (!this.IIlO(1, 100)) {
               var1.III(93, this.IIl1(1, 7));
            }
         } else if (this.IIlO(5, 100)) {
            var1 = new IO0l(860, 1);
            var1.III(50, this.IIl1(0, 18)).III(77, this.IIl1(0, 18)).III(117, 10).III(154, 0);
            if (!this.IIlO(1, 100)) {
               var1.III(93, this.IIl1(3, 7));
            }
         } else if (this.IIlO(1, 100)) {
            var1 = new IO0l(955, 1);
            var1.III(50, this.IIl1(1, 7)).III(77, this.IIl1(1, 7)).III(103, this.IIl1(1, 7));
            if (!this.IIlO(1, 100)) {
               var1.III(93, this.IIl1(3, 7));
            }
         } else if (this.IIlO(5, 1000)) {
            var1 = new IO0l(956, 1);
         }
      } else {
         boolean var3 = false;
         if (this.IIlO(1, 2)) {
            int[] var4 = new int[]{467, 468, 469, 470, 471, 741, 745, 800, 801, 803, 804, 1000};
            int var5 = var4[this.IIl_.nextInt(var4.length)];
            if (this.IIlO(20, 100)) {
               int[] var6 = new int[]{467, 468, 469, 470, 471, 741, 745, 800, 801, 803, 804, 999, 1000, 1001};
               var5 = var6[this.IIl_.nextInt(var6.length)];
            }

            int[] var7 = new int[]{77, 80, 81, 103, 50, 94, 5};
            var1 = new IO0l(var5, 1);
            var1.III(var7[this.IIl_.nextInt(7)], this.IIl1(3, 7)).III(30, 0).III(93, this.IIl1(1, 15));
         } else if (this.IIlO(1, 100)) {
            var1 = new IO0l(this.IIl1(18, 20), this.IIl1(1, 5));
         } else if (this.IIlO(1, 3000)) {
            var1 = new IO0l(this.IIl1(220, 224), this.IIl1(1, 3));
         } else if (this.IIlO(1, 1000)) {
            var1 = new IO0l(this.IIl1(828, 842), this.IIl1(1, 3));
         }

         if (!var2) {
            var1 = this.IIII(5, 12);
         }
      }

      if (var1.I1l != 189 && IOO.II(var1.I1l) == null) {
         var1 = this.IIII(5, 12);
      }

      return var1;
   }

   void ll0l() {
      this.IoO = true;
      Vector var1 = this.IIlO.II.II11;
      IO0o var2 = new IO0o(-44).II(4).II(1).II(I1O("\udda3\ude7a삖\ude3e\ude65\udefa\udec5\udf7c쀴\udf64\udf4e", 56819)).II(var1.size());

      for (int var3 = 0; var3 < var1.size(); var3++) {
         IO0l var4 = (IO0l)var1.elementAt(var3);
         var2.III(var4.I1l)
            .II(I1O("\udd8f\ude25\ude4d\ude70\ude23\udedb\udeee\ude87\udeb2\udf2a\udf7b\udf0d\udf30\udfc7\udff7\udf80", 56819))
            .II(var4.IIl.size() + 1);

         for (int var5 = 0; var5 < var4.IIl.size(); var5++) {
            int[] var6 = (int[])var4.IIl.elementAt(var5);
            var2.II(var6[0]).III(var6[1]);
         }

         var2.II(31).III(var4.lo0I);
         var2.II(1).II(0);
      }

      this.IIlO.II(var2);
   }

   boolean IIlo(int var1, int var2) {
      if (!this.IoO) {
         return false;
      }

      Vector var3 = this.IIlO.II.II11;
      if ((var2 < 0 || var2 >= var3.size()) && var1 != 2) {
         this.IIlO.IIIl.IIol(I1O("\uddb8\ude7a\udec5\ude3e\ude08\udeae\uded9\udea4쀨\udf2a\udf5d\udf20솖\udfe5\udf85\udfac\udf8aﻅ\ue04f", 56819));
         return true;
      }

      if (var1 == 0) {
         IO0l var4 = (IO0l)var3.elementAt(var2);
         if (!this.IIIO(var4)) {
            this.IIlO.IIIl.IIol(I1O("\uddbb\udef2\ude5f\ude38\ude4f\udefa\udedf\udead\ude85\udf6d\udf09\ude59\udf84\udfa6\udeb4셣\udf9a", 56819));
            return true;
         }

         var3.removeElementAt(var2);
      } else if (var1 == 1) {
         var3.removeElementAt(var2);
         this.IIlO
            .IIIl
            .IIol(
               I1O("\uddab\udee1\ude50\ude70\ude19쀣\uded9\udeec\ude9b\udf62솀\udf25\udf47\udff2\udfcd\udf24\udf8d\ue06a\ue001\ue023\ue0ab\ue010\ue0fa", 56819)
            );
      } else if (var1 == 2) {
         for (int var5 = var3.size() - 1; var5 >= 0; var5--) {
            if (this.IIIO((IO0l)var3.elementAt(var5))) {
               var3.removeElementAt(var5);
            }
         }
      }

      this.IIlO.IIIl.l1_l();
      this.IIlO.IIIl.l1_();
      this.IIlO.I__O();
      this.ll0l();
      return true;
   }

   private boolean IIIO(IO0l var1) {
      if (var1.I1l == 189) {
         this.IIlO.II.Il11 = this.IIlO.II.Il11 + var1.lo0I;
         this.IIlO
            .IIIl
            .IIol(
               I1O("\uddb1삳\ude5f\ude70\ude01\udee6쀀\udea2\udecb\ude1b\ude99솫\udf04\udfa6", 56819)
                  + IIIo(var1.lo0I)
                  + I1O("\uddd3\ude64\uded1\ude3e\ude08", 56819)
            );
         return true;
      }

      if (!this.IIlO.IIIl.III0(var1)) {
         return false;
      }

      IOO.III var2 = IOO.II(var1.I1l);
      this.IIlO
         .IIIl
         .IIol(
            I1O("\uddb1삳\ude5f\ude70\ude01\udee6쀀\udea2\udecb\ude1b\ude99솫\udf04\udfa6", 56819)
               + (var2 == null ? I1O("\udd85삿\ude45\ude70\ude1f\udee6쀄\udea1", 56819) : var2.II1o)
         );
      return true;
   }

   boolean II00(int var1) {
      if (var1 == 54 && this.IIlO.II.lOlo == 5) {
         this.IIlO
            .II
            .IIII(
               54,
               8200,
               I1O("\uddbe\ude7b\ude5f\ude39\ude4f\udee9\udecc\udea1\ude8e\udf24", 56819),
               new String[]{
                  I1O("\uddb8\udefb\ude5e\ude5a\ude2d\ude74\udecc\udec6\udea9\udf6b\udf46", 56819),
                  I1O(
                     "\uddb0\ude7d\ude5f\ude70\ude1c쁟\udea7\udea1\ude8a\udf73\udf09\udf25쇈\udfe8\udfaf\udfb0\udf8bﻍ\ue048\ue060\ue029\ue09e\ue0f3\ue0db", 56819
                  ),
                  I1O(
                     "\uddb0\ude7d\ude5f\ude70\ude1c쁟\udea7\udea1\ude8a\udf73\udf09\udf25쇈\udfe8\udfaf\udfaa\udf84ﻏ\ue042\ue060\ue027\ue01f\ue0f3\ue0d4", 56819
                  ),
                  I1O("\uddb0\ude7a샼\ude3e\ude4f\udeef\udec4\udeec\udffa\udfe8\udf50", 56819),
                  I1O("\udce3\udee1\ude5f\ude37", 56819)
               }
            );
         return true;
      } else {
         return false;
      }
   }

   boolean III1(int var1, int var2, int var3) {
      if (var1 == 19) {
         return this.IIl0(var2, var3);
      }

      if (var1 != 54) {
         return false;
      }

      switch (var2) {
         case 8200:
            if (var3 == 0) {
               this.II0l(I1O("\uddbb\udef1\ude48\ude70\ude0c\udee6쁠\udea2\udecb\udf67쇀\udf2b\udf47\udfe5\ude15섧\udf80\ue02c", 56819));
            } else if (var3 == 1) {
               this.Il0O(0);
            } else if (var3 == 2) {
               this.Il0O(1);
            } else if (var3 == 3) {
               this.IIlO
                  .II
                  .IIII(
                     54,
                     8220,
                     I1O(
                        "\udda7\ude60\udec3\ude70\ude0c\udee6\udf0c\udea5\udecb\udf49\udf41솅\udf09\udfa6\udfe4\udfad\udfc3\ue112\ue0c3\ue039\ue07f\ue16f\ue0fc\ue0d2\ue0bc\ue0da\ue008\ue088ﾴ\ue115\ue1b5\ue1d0\ue1baＷ\ue27f\ue210\ue23d\ue20f\ue2a1\ue28c\ue2a5ﱕ\ue37c\ue308\ue325ﷇ\ue3eb\ue384\ue3b7\ue38b\ue46f\ue400\ue44b\ue5ee甆\ue4f2\ue4dc\ue4fa\ue494\ue5f4\ue559\ue53e\ue555\ue485\ue5d2\ue5bc\ue596\ue630\ue65b\ue63c\ue68d\ue6e2\ue68b\ue7db\uf84e\ue771\ue707\ue72b\ue704\ue7fd\ue783\ue7af漏\ue86e\ue83f\ue84a\ue835\ue890\ue8bb\ue8d9\ue82a\ue8d8\ue963\ue95e\uf796\ue954\ue9e7\ue9da\ue9b0\ue99d\uea2f\uea49\uea24\uea0d\ueaab\ueade\ueaa1\uf405",
                        56819
                     ),
                     new String[]{
                        I1O("\udda7\ude7a샲\ude70\ude03쁉", 56819),
                        I1O("\uddb0\ude7a샼\ude3e\ude65\uded8\ude4d\udea2\ude8c", 56819),
                        I1O("\uddb0\ude7a샼\ude3e\ude65\udee0\udeca쀁\ude88\udf2a\udf51\udf29\udf09\udfee", 56819)
                     }
                  );
            }

            return true;
         case 8201:
            long var6 = var3 == 0 ? 1000000L : (var3 == 1 ? 5000000L : (var3 == 2 ? 10000000L : 0L));
            if (var6 == 0L) {
               return true;
            } else {
               if (this.IIlO.II.Il11 < var6) {
                  this.IIlO
                     .IIIl
                     .IIol(
                        I1O(
                           "\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udff0\udf45\udfaa\udf84\ue022\ue130ﺃ\ue07f\ue01d\ue0f5\ue11d\ue0b2\ue0db",
                           56819
                        )
                     );
                  return true;
               }

               this.I_11 = var6;
               this.I_1_ = System.currentTimeMillis() + 15000L;
               this.Il01(15);
               this.IIlO
                  .II
                  .IIII(
                     54,
                     8202,
                     I1O("\uddbe샻\ude52\ude70\ude19\ude6e\udec3\udeab\udecb\udf69\ude99솫\udf04\udfbc\udf85", 56819)
                        + IIIo(var6)
                        + I1O(
                           "\uddd3\ude64\uded1\ude3e\ude08\ude84\udee5\ude2f\ude92\udf2a\udf4a\udf20솪\udfe8\udf85\udf8f\udf0a\ue06d\ue00d\ue060\ue01d\ue084\ue0fc\ue09c\ue0b3\ue095ﾮ\ue15b\ue177\ue134\ue1f4\ue1db\ue1d9\ue1a6\ue279ﳭ\ue226\ue24e\ue2ea\ue2c5\ue2aa\ue284\ue329\ue319\ue372\ue346\ue3e2\ue3cd\ue321\ue39b\ue421\ue442敖\ue42a\ue45d\ue58d靖\ue4af",
                           56819
                        ),
                     IlOl
                  );
               return true;
            }
         case 8202:
            if (var3 < 3) {
               this.Il0_(var3);
            } else if (var3 == 3) {
               this.ll01();
               this.II0l(I1O("\uddbb\udef1\ude48\ude70\ude0c\udee6쁠\udea2\udecb\udf67쇀\udf2b\udf47\udfe5\ude15섧\udf80\ue022\ue04cﺛ\ue036\ue050", 56819));
            } else {
               this.ll01();
               this.IIlO.IIIl.IIol(I1O("\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udea2\ude8c\udf62쇠\udf68\udf04\udfee\ude04\udfad\udfcd", 56819));
            }

            return true;
         case 8203:
         case 8204:
         case 8205:
         case 8206:
         case 8207:
         case 8208:
         case 8209:
         case 8213:
         case 8214:
         case 8215:
         case 8216:
         case 8217:
         case 8218:
         case 8219:
         default:
            return false;
         case 8210:
         case 8211:
            this.II_O(var2 == 8210 ? 0 : 1, var3);
            return true;
         case 8212:
            return true;
         case 8220:
            if (var3 == 0) {
               this.IIlO
                  .II
                  .IIII(
                     54,
                     8223,
                     I1O(
                        "\uddbe샅\ude58\ude70\ude03\udf3e쁎\udeb8\udecb\udf69\udf41\udee9\udf0e\udfa6\udfc6\udf37\udfc3\ue034\ue001\ue027\ue036ﻝ\ue0f4\ue09c\ue0af\ue092\ue0a9\uffe7\ue139\ue111\ue19f\ue0a4\ue063１\ue272\ue210\ue22c\ue206ﱀ\ue2c2\ue2eb\ue29e\ufdd8\ue341\ue367\ue277\ue3e4\ue384\ue3f2\ue3d2\ue421\ue44c滛\ue430\ue45d\ue4f1𤋮\ue4b3\ue4d9\ue57f\ue55eﯵ\ue51c\ue59e\ue5e7\ue5baשּׁ\ue679\ue60f\ue629\ue604\ue6ed\ue6c5\ue6ea\ue6d8\ue728\ue74b\ue6f6閭\ue7f0\ue783\ue7a1\ue789\uf6cd\ue871\ue81e\ue831\ue89c\ue8bb\ue88f\ue8f9\ue888\ue97f\ue9cc\ue921\ue97e\ue9d8\ue9da\ue9b8\ue9d0\uea67\uf491\uea39\uea4c\ueaec\ueac3\uf414\ueac4\ueb27\ueb4e\uf582\ueb44\uebf7\uebca\uf510\ueb8e\ueb98\uec3e\uec4e\uf2e1\uec5b\uecf4\uecde\uf273\uec82\ued36\ued5b\ued3c\ued1a\ued78\ueddf\uedf0\ued8c\uee66\uf0e0\uee22\uee4b\ueef8\ueec8\ueee8\ueed6\uef26\uef4b\uef23\ueed3\uf15f\uefc8\uefe0\uefb2\uef9f\uf064\uf01c\uf036\ueed5\uf0f7\uf0b2\uf0b4\uee11\uf174\uf114\uf127\uef99\uf1ff\uf1d7\uf1ef\uf189\uf264\uec8f\uf222\uf24a\uf2ff\uf248\uf2e7\uf292\uf377\uf345\uf32c\uf342\uf3f5\uf3c8\uf20f\ued01\uf393\uf47b\uf415\uf450\uf435\uf528\uf4c2\uf4f6\uf408\uf52e\uf513\uf51c\uebce\uf5e5\uf58f\uf5ba\uf585\uf66d\uf646\uf66a\uf60e\uf6e1\uf6c6\uf6e6\uf687\ue9b5\uf74d\uf725\uf741\uf7ce\uf7f8\ue973\uf7be\uf7dc\uf843\uf85b\uf837\uf810\uf8b7\uf8de\uf8ba\ue643殺裸酪\ue7a3李柳吝廬𤋮\ue4e7飯煮\ufaf3龜﨩醙ﭭ\ufb45\ufaf1\ue5bdﬖ﮾\ufbc9﮴\ue554ﱴﱞﱸﰄ\ue22bﲕﲺﲛ\ue3bfﵟﵰﴛ\ufde6ﰝ\ue313ﶅ\ufe6d︉︤ﺇﺦﻍ\ue017ﺍ･！ＮＸ\ue1b3\ufffeﾒ",
                        56819
                     ),
                     new String[]{I1O("\uddbc\ude59", 56819)}
                  );
            } else if (var3 == 1) {
               this.Il00(0);
            } else if (var3 == 2) {
               this.Il00(1);
            }

            return true;
         case 8221:
         case 8222:
            int var4 = var2 == 8221 ? 0 : 1;
            if (var3 == 0) {
               this.Il00(var4);
            } else if (var3 == 1 || var3 == 2) {
               this.II_0(var4, var3 - 1);
            }

            return true;
         case 8223:
            return true;
      }
   }

   private void II0l(String var1) {
      this.IIlO
         .II
         .IIII(
            54,
            8201,
            var1,
            new String[]{
               I1O("\uddc2\ude32\ude65\ude22\ude4f\udef8\ude4d\udea2\ude8c", 56819),
               I1O("\uddc6\ude32\ude65\ude22\ude4f\udef8\ude4d\udea2\ude8c", 56819),
               I1O("\uddc2\ude22\ude11\ude04\ude1d\udeae\udedb\ude2c\ude85\udf6d", 56819)
            }
         );
   }

   private void Il01(int var1) {
      this.IIlO.II(new IO0o(65).II(4).II(var1 > 0 ? I1O("\udda7\ude7a샬\ude39\ude4f\udee9\udec4\udead\ude85\udf2a\udf13\udf68", 56819) : "").III(var1));
   }

   private void ll01() {
      this.I_11 = 0L;
      this.I_1_ = 0L;
      this.Il01(0);
   }

   private void Il0_(int var1) {
      IOol var2 = this.IIlO.II;
      if (this.I_1_ > System.currentTimeMillis() && this.I_11 != 0L) {
         this.I_1_ = System.currentTimeMillis() + 15000L;
         this.Il01(15);
         long var3 = this.I_11;
         if (var2.Il11 < var3) {
            this.IIlO
               .IIIl
               .IIol(
                  I1O(
                     "\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udff0\udf45\udfaa\udf84\ue022\ue130ﺃ\ue07f\ue01d\ue0f5\ue11d\ue0b2\ue0db",
                     56819
                  )
               );
         } else {
            var2.Il11 -= var3;
            int var5 = this.IIl_.nextInt(3);
            String var6;
            if (var1 == var5) {
               var6 = I1O("\udd8f\ude20\ude4d\ude12샎\udee0\ude8d\udebe\ude8a\udf2a\udf4a\udfa9\udf0e\udfa6\udf99", 56819)
                  + IlO1[var1]
                  + I1O("\uddcd\ude18\ude65\udea4\ude06\udeae\udedf\udead\udecb\udf69\udfc8\udf21\udf47\udfba", 56819)
                  + IlO1[var5]
                  + I1O(
                     "\uddcd\ude18\ude4d\ude68\ude13\udec6\ude5f\udead\udecb\udf64\udf41\udf29\udf12\udfa6\udfcb\udfac\udf0a\ue022\ue049\ue021\ue037\ue01f",
                     56819
                  );
               var2.Il11 += var3;
            } else if ((var1 != 0 || var5 != 2) && (var1 != 1 || var5 != 0) && (var1 != 2 || var5 != 1)) {
               var6 = I1O("\udd8f\ude25\ude4d\ude12샎\udee0\ude8d\udebe\ude8a\udf2a\udf4a\udfa9\udf0e\udfa6\udf99", 56819)
                  + IlO1[var1]
                  + I1O("\uddcd\ude18\ude65\udea4\ude06\udeae\udedf\udead\udecb\udf69\udfc8\udf21\udf47\udfba", 56819)
                  + IlO1[var5]
                  + I1O(
                     "\uddcd\ude18\ude4d\ude60\ude13\udeda\ude59\udea5\udecb\udf7e\udf41쇧\udf09\udfe1\udf85\udfaa\udf8b\ue0eb\ue001\ue028\ue036\ue016\ue0f4\ue0b6\ue0a7\ue0cd\ue165\ue17a\ufff6\ue118\ue1b5\ue1d6８\ue1d2\ue265\ue242ﲤ\ue24e",
                     56819
                  )
                  + IIIo(var3)
                  + I1O("\uddd3\ude64\uded1\ude3e\ude08\udea0", 56819);
            } else {
               long var7 = var3 * 96L / 100L;
               var2.Il11 += var7 + var3;
               var6 = I1O("\udd8f\ude23\ude4d\ude12샎\udee0\ude8d\udebe\ude8a\udf2a\udf4a\udfa9\udf0e\udfa6\udf99", 56819)
                  + IlO1[var1]
                  + I1O("\uddcd\ude18\ude65\udea4\ude06\udeae\udedf\udead\udecb\udf69\udfc8\udf21\udf47\udfba", 56819)
                  + IlO1[var5]
                  + I1O(
                     "\uddcd\ude18\ude4d\ude60\ude13\udecc쀌\udea2\udecb\udf7e\udf41쇧\udf09\udfe1\udf85\udfb6섰\ue06b\ue001\ue028\ue02a\ue016\ue0e8\ue0b6\ue0a7\ue0cb\ue165\ue17a\ufff6\ue118\ue1b5\ue1da\ue1bb｟\ue27f\ue210\ue35e\ue3deﱮ\ue2cf\ue2eb",
                     56819
                  )
                  + IIIo(var7)
                  + I1O("\uddd3\ude64\uded1\ude3e\ude08\udea0", 56819);
            }

            this.IIlO.IIIl.l1_();
            this.IIlO.I__O();
            this.IIlO.II.IIII(54, 8202, var6, IlOl);
         }
      } else {
         this.IIlO
            .IIIl
            .IIol(
               I1O(
                  "\udda7\ude7a샬\ude39\ude4f\udee9\udec4\udead\ude85\udf2a\ude38\udfab\udf47\udfee섚\udfb0\udfc3\ue06a\ue04eﻷ\ue03c\ue05e\ue0ff\ufe1d\ue0b5\ue0da\ue17a\ue150\ue0e7\ue117\ue1b5\ue1d7\ue063１\ue272\ue210\ue23b\ue207ﱌ\ue2c2\ue2ea",
                  56819
               )
            );
      }
   }

   private long IIIl(long var1) {
      return var1 / 60000L;
   }

   private int II(int var1, long var2) {
      return new Random(var2 * 7919L + var1 * 104729L + 12345L).nextInt(100);
   }

   private int II(long var1) {
      return (int)Math.max(0L, 50L - var1 % 60000L / 1000L);
   }

   private String IIl(int var1) {
      StringBuilder var2 = new StringBuilder();
      Vector var3 = this.III[var1];

      for (int var4 = 0; var4 < var3.size(); var4++) {
         if (var4 > 0) {
            var2.append(',');
         }

         var2.append(((Integer)var3.elementAt(var4)).intValue());
      }

      return var2.toString();
   }

   private void Il0O(int var1) {
      long var2 = System.currentTimeMillis();
      long var4 = this.IIIl(var2);
      StringBuilder var6 = new StringBuilder(I1O("\uddbf샙\ude52\ude38\ude4f\udefd쁀\udef6\udecb", 56819));
      int var7 = 0;

      for (long var8 = var4 - 10L; var8 < var4; var8++) {
         if (var7++ > 0) {
            var6.append(I1O("\udddf\ude32", 56819));
         }

         var6.append(this.II(var1, var8));
      }

      String var14 = var1 == 0
         ? I1O("\udd87\ude7a샾\ude39\ude4f\udef8\ude4d\udea2\ude8c", 56819)
         : I1O("\udd9d\ude75샼\ude33\ude4f\udef6\udecc\udea2\ude83", 56819);
      long var9 = var1 == 0 ? 90L : 450L;
      int var11 = var1 == 0 ? 1 : 5;
      String var12 = this.IIl(var1);
      String var13 = I1O("\uddb8삭\ude45\ude70\ude1e\udefb쀎\udeec\ude8c\udf63솊\udf21\udf47\udff2\udfd7\ude74세\ue061\ue01b\ue060", 56819)
         + this.II(var1, var4 - 1L)
         + I1O("\uddf9", 56819)
         + var6
         + I1O("\uddf9\ude46샤\ude3e\ude08\udeae\udeca\udea5쁈\udf63\udf09\udf3c\udf0f\ude36셺\udfaa\udf84\ue038\ue001", 56819)
         + var9
         + I1O("\uddd3", 56819)
         + var14
         + I1O("\uddf9\ude2e", 56819)
         + this.II(var2)
         + I1O("\uddcd\ude75\ude58\udeb2\ude16\ude84", 56819)
         + (
            var12.length() > 0
               ? I1O("\uddb0\udef3\ude52\ude70\ude1c쁟\ude8d\udeae쁊\udf64\udf09\udf2b\udf0f셋\udfcb\udffe\udfc3", 56819) + var12
               : I1O("\uddb1삳\ude5f\ude70\ude0c\udee6\udf1d\udead\udecb\udf69\udf41솅\udf09\udfa6\udfd6섕\udfc3\ue06c\ue0c1\ue02f\ue071", 56819)
         );
      this.IIlO
         .II
         .IIII(
            54,
            var1 == 0 ? 8210 : 8211,
            var13,
            new String[]{
               I1O("\uddb0삿\ude41\ude70\ude01\udee6쀀\udeb8", 56819),
               I1O("\uddc2\ude32\ude62삁\ude65", 56819) + var11 + I1O("\uddd3", 56819) + var14,
               I1O("\uddbd\ude75삚\ude25\ude4f\udee0\udec5\udea5\ude01\udf64\udf23\udf79\udf47\udff5셴\udfe4\udf8fﺹ\ue02b", 56819)
                  + var11
                  + I1O("\uddd3", 56819)
                  + var14,
               I1O("\uddbd\ude75삚\ude25\ude4f\udee0\udec5\udea5\ude01\udf64\udf23\udf79\udf47\udff5셴\udfe4\udf80\ue06aﺔ\ue02e\ue055", 56819)
                  + var11
                  + I1O("\uddd3", 56819)
                  + var14,
               I1O("\uddbb\udfa2샪\ude3e\ude08\ude84\udec9쁧\ude85\udf00\udf5d\udf20\udf8d\udfeb", 56819),
               I1O("\udce3\udee1\ude5f\ude37", 56819)
            }
         );
   }

   private void II_O(int var1, int var2) {
      if (var2 == 0) {
         this.Il0O(var1);
      } else if (var2 == 1) {
         this._I_ = var1;
         this.IIlO
            .II(
               new IO0o(-125)
                  .II(
                     var1 == 0
                        ? I1O(
                           "\uddbb\udef1\ude48\ude70\ude0c\udee6쁠\udea2\udecb\udf3b\udf09\udf3b솶\udfa6\udfd1섯\udfc3\ue032\ue001\ue151ﻠ\ue010\ue0bd\ue085\ue0e2\ue0da\ue17e\ue151\ue1b6\ue156\ue1a4\ue194\ue1a7\ue19aﳞ\ue259\ue26f\ue218\ue26d\ue2c2\ue2ac",
                           56819
                        )
                        : I1O(
                           "\uddbb\udef1\ude48\ude70\ude0c\udee6쁠\udea2\udecb\udf3b\udf09\udf3b솶\udfa6\udfd1섯\udfc3\ue032\ue001\ue151ﻠ\ue010\ue0bd\ue085\ue0e2\ue0da\ue17e\ue151\ue1b6\ue156\ue1a0\ue194\ue1bd\ue195ﳜ\ue253",
                           56819
                        )
                  )
                  .II(1)
                  .II(I1O("\udda0샃\ude11\ude32샎\udee0\ude8d\udeaf\ude83쇇\udf47", 56819))
                  .II(0)
            );
      } else if (var2 != 2 && var2 != 3) {
         if (var2 == 4) {
            this.IIlO
               .II
               .IIII(
                  54,
                  8212,
                  I1O(
                     "\udda7\ude7a샬\ude39\ude4f\udee9\udec4\udead\ude85\udf2a\udf5d솣\udf47\udfbe\udfcd\udfe4\udef2ﺽ\ue04f\ue060\ue037ﻁ\ue0e9\ue09c\ue0e9\ue0cb\ue171\ue10d\ue16e\ue156\ue1fd％\ue1bd\ue195\ue231\ue25e\ue228\ue28e\ue2f4\ue2a6\ue286ﰽ\ue360\ue308\ue32b\ue2d6ﵦ\ue3d0\ue3e3\ue2f3\ue5b1遲\ue45c\ue47e\ue41e\ue4f4勇\ue4b4\ue4d9\ue529\ue507\ue576\ue516\ue5fb\ue5dd\ue5f2\ue582\uf8c1\ue60f\ue63a\uf886\ue6ac\ue69b\ue6ea\ue7f8醴\ue749\ue766\ue75c\ue7bd\ue7a9\ue796\ue789\uf6dd\ue876\ue81e\ue83a\ue815\ue8fa\ue8d4\ue8f9\ue895\uf7c0\ue95f\ue975\ue918\ue823\uf751\ue9a5\ue9d0\uea63\ueace\uea6d\uea59\ueaab\ueada\ueaa1\uea12\ueb73\ueb08",
                     56819
                  ),
                  new String[]{I1O("\udce3상\ude5f\ude37\ude4f\ude73", 56819)}
               );
         }
      } else {
         if (!this.II0o(var1)) {
            return;
         }

         Vector var3 = this.III[var1];
         if (var3.size() >= 50) {
            this.IIlO
               .IIIl
               .IIol(
                  var2 == 2
                     ? I1O(
                        "\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf13섣\udfd1\udfe4\udf80ﺡ\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf︊\ue0da\ue175ﾃ\ue177\ue11d\ue1fd７\ue1f3\ue196ﳴ\ue25e\ue228\ue240",
                        56819
                     )
                     : I1O(
                        "\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf13섣\udfd1\udfe4\udf80ﺡ\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf︊\ue0da\ue17a\ue150￢\ue118\ue1b5\ue1df\ue1bbｑ\ue231\ue254ﲪ\ue200\ue2ea\ue282",
                        56819
                     )
               );
            return;
         }

         int var5 = 0;

         int var4;
         do {
            var4 = var2 == 2 ? this.IIl_.nextInt(50) * 2 + 1 : this.IIl_.nextInt(51) * 2;
            if (var4 > 99) {
               var4 = 98;
            }
         } while (var3.contains(new Integer(var4)) && ++var5 < 500);

         if (var3.contains(new Integer(var4))) {
            this.IIlO
               .IIIl
               .IIol(
                  var2 == 2
                     ? I1O(
                        "\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf13섣\udfd1\udfe4\udf80ﺡ\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf︊\ue0da\ue175ﾃ\ue177\ue11d\ue1fd７\ue1f3\ue196ﳴ\ue25e\ue228\ue240",
                        56819
                     )
                     : I1O(
                        "\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf13섣\udfd1\udfe4\udf80ﺡ\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf︊\ue0da\ue17a\ue150￢\ue118\ue1b5\ue1df\ue1bbｑ\ue231\ue254ﲪ\ue200\ue2ea\ue282",
                        56819
                     )
               );
            return;
         }

         this.II(
            var1,
            var4,
            (
                  var2 == 2
                     ? I1O(
                        "\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf09\udfe1섎\udfb1\udfc3\ue06c\ue049\ue029\ue0b5\ue010\ue0bd\ue0cf︊\ue0da\ue175ﾃ\ue177",
                        56819
                     )
                     : I1O(
                        "\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf09\udfe1섎\udfb1\udfc3\ue06c\ue049\ue029\ue0b5\ue010\ue0bd\ue0cf︊\ue0da\ue17a\ue150￢\ue118\ue1b5",
                        56819
                     )
               )
               + var4
         );
      }
   }

   private boolean II0o(int var1) {
      long var2 = System.currentTimeMillis();
      this.IIIO(var2);
      if (var2 % 60000L >= 50000L) {
         this.IIlO
            .IIIl
            .IIol(
               I1O(
                  "\udce3\udef1\ude11\ude38샐\udefa\ude8d\udeb8\ude83쇗\udf40\udf68\udf00\udfef\udfc4\udfaa\udfc3\ue113ﺖ\ue034\ue07f\ue01d\ue12d﹟\ue0b8\ue0da\ue17a\ue150\ue138\ue156\ue1e3\ue146\ue1bd\ue195\ue231\ue25e\ue2af\ue217\ue2a3\ue28c\ue29d\ue29f\ue360\ue308\ue32b\ue394\ue3eb\ue3c3\ue3e3\ue381\ue469\ufafd\ue41f\ue428\ue48f\ue4f2\ue4dc\ue4fa\ue494\ufbc3\ue55e\ue578",
                  56819
               )
            );
         return false;
      }

      IOol var4 = this.IIlO.II;
      if (var1 == 0) {
         if (this.II10(457) < 1) {
            this.IIlO
               .IIIl
               .IIol(
                  I1O(
                     "\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udfb7\udf85\udfb0\udf8bﻍ\ue048\ue060\ue029\ue09e\ue0f3\ue0db\ue0fb\ue1ebￚ\ue118\ue123\ue11e､\ue1d7\ue1f3\ue19a\ue278ﳷ\ue221",
                     56819
                  )
               );
            return false;
         }
      } else if (var4.lOoO < 5) {
         this.IIlO
            .IIIl
            .IIol(
               I1O(
                  "\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udfb3\udf85\udfaa\udf84ﻏ\ue042\ue060\ue14eﺽ\ue0bd\ue0c8\ue0b3︋\ue17a\ue118\ue13f\ue11fｒ\ue1da",
                  56819
               )
            );
         return false;
      }

      if (this.III[var1].size() >= 10) {
         this.IIlO
            .IIIl
            .IIol(
               I1O(
                  "\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf56\udfb6\udf85\udfb7섲\ue022\ue053ﺓ\ue036\ue05e\ue0f6\ue0d4\ue02f\ue094\ue17e\ue118\ue123\ue11eｖ\ue194\ue1b0\ue19aﳜ\ue25e\ue26f\ue21a\ue2e5\ue246\ue2a6",
                  56819
               )
            );
         return false;
      } else {
         return true;
      }
   }

   private void II(int var1, int var2, String var3) {
      if (var1 == 0) {
         this.II1O(457, 1);
         this.IIlO.IIIl.l1_l();
         var3 = var3 + I1O("\uddd3\ude70삀\ude3e\ude08\udeae\ude9c\udeec\ude9f\udf62쇦\udf21\udf47\udff0\udf45\udfaa\udf84\ue02c", 56819);
      } else {
         this.IIlO.II.lOoO -= 5;
         this.IIlO.IIIl.l1_();
         var3 = var3 + I1O("\uddd3\ude70삀\ude3e\ude08\udeae\ude98\udeec\ude85\udf6d쇤\udf2b\udf49", 56819);
      }

      this.III[var1].addElement(new Integer(var2));
      this.IIlO.IIIl.IIol(var3);
      this.IIlO.II(new IO0o(-126).II(0).II(this.IIl(var1)));
      this.IIlO.I__O();
   }

   void IIl_(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      String[] var3 = new String[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = var1.readUTF();
      }

      int var9 = this._I_;
      this._I_ = -1;
      if (var9 >= 0 && var2 >= 1) {
         int var5;
         try {
            var5 = Integer.parseInt(var3[0].trim());
         } catch (Exception var8) {
            this.IIlO
               .IIIl
               .IIol(
                  I1O(
                     "\udda0샃\ude11\ude32샎\udee0\ude8d\udeaf\ude83쇇\udf47\udf68\udf0c\udfee\udf51\udfaa\udf84\ue022\ue049ﺣ\ue02f\ue05e\ue0f1ﹻ\ue0fb\ue092\ue176ﾏ\ue134\ue156\ue084\ue157\ue1f3\ue19aﲮ\ue244\ue26f\ue21a\ue2e5ﱱ\ue2a2\ue2ca\ue36e\ue341\ue326\ue308\ue3a5\ue2b5ﵴ\ue396\ue421\ue443\ue58f諾\ue41e\ue4b2",
                     56819
                  )
               );
            return;
         }

         long var6 = System.currentTimeMillis();
         if (var5 < 0 || var5 > 100 || this.II(var6) <= 10) {
            this.IIlO
               .IIIl
               .IIol(
                  I1O(
                     "\udda0샃\ude11\ude32샎\udee0\ude8d\udeaf\ude83쇇\udf47\udf68\udf0c\udfee\udf51\udfaa\udf84\ue022\ue049ﺣ\ue02f\ue05e\ue0f1ﹻ\ue0fb\ue092\ue176ﾏ\ue134\ue156\ue084\ue157\ue1f3\ue19aﲮ\ue244\ue26f\ue21a\ue2e5ﱱ\ue2a2\ue2ca\ue36e\ue341\ue326\ue308\ue3a5\ue2b5ﵴ\ue396\ue421\ue443\ue58f諾\ue41e\ue4b2",
                     56819
                  )
               );
         } else if (this.II0o(var9)) {
            if (this.III[var9].contains(new Integer(var5))) {
               this.IIlO
                  .IIIl
                  .IIol(
                     I1O(
                        "\udda0샃\ude11\ude3e\ude8f\udef7\ude8d\udeae쁊\udf64\udf09\ude59\udf84\udfa6\udfc6\udfac섮\ue06c\ue001\ue032ﺌ\ue017\ue0bd\ue0ca\ue0ae\ue093\ue139\ue154\ue1a5\ue118\ue1f2\ue194\ue1b0\ue19aﳜ\ue25e\ue26f\ue21dﱜ\ue28c\ue2a0\ue282\ue3e8\ue34b\ue369",
                        56819
                     )
                  );
            } else {
               this.II(var9, var5, I1O("\uddb1삳\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83쇇\udf47\udf68\udf14셗\udf85", 56819) + var5);
            }
         }
      }
   }

   private void IIIO(long var1) {
      long var3 = this.IIIl(var1);

      for (int var5 = 0; var5 < 2; var5++) {
         if (this.IIIO[var5] < 0L) {
            this.IIIO[var5] = var3;
         }

         if (this.IIIO[var5] != var3) {
            int var6 = this.II(var5, this.IIIO[var5]);
            this.IIIO[var5] = var3;
            Vector var7 = this.III[var5];
            if (var7.size() != 0) {
               String var8 = I1O(
                     "\uddb0\ude7d\ude5f\ude70\ude1c쁟\ude8d\udeb8\ude99\udff0\udf47\udf2f\udf47\udff2\udfcd\ude74센\ue06c\ue046\ue060\ue033\ue09e\ue0bd", 56819
                  )
                  + var6
                  + I1O(
                     "\uddd3\ude71\ude59\udeaa\ude0c\udeae\udecf쁭\ude85\udf2a\udf44\udf29\udf1e\udfa6\udfc8셫\udf8d\ue022\ue04dﻧ\ue031\ue05e\ue0ee\ue0dd\ue0ae",
                     56819
                  );
               boolean var9 = var7.contains(new Integer(var6));
               if (var9) {
                  IOol var10 = this.IIlO.II;
                  if (var5 == 0) {
                     IO0l var11 = new IO0l(457, 90);
                     if (!this.IIlO.IIIl.III0(var11)) {
                        var10.II11.addElement(var11);
                        this.IIlO
                           .IIIl
                           .IIol(
                              I1O(
                                 "\uddbb\udef2\ude5f\ude38\ude4f\udefa\udedf\udead\ude85\udf6d\udf09\ude59쇀\udfff\udf89\udfe4\udf97\ue06a\ue191ﺟ\ue031\ue019\ue0bd\ue1ad\ue16b︙\ue17a\ue118\ue130ﾛ\ue1fc\ue194\ue1a5\ue112\ue27e\ue210\ue23d\ue3de\ue32c\ue2c2\ue2ac\ue2ca\ue379\ue340ﶢ\ue346\ue3e6﵃\ue3a2\ue3c2\ue455\ue448\ue58f諾\ue413\ue4fb\ue49b\ue5ca渚",
                                 56819
                              )
                           );
                     }

                     this.IIlO.IIIl.l1_l();
                     var8 = I1O("\uddb0\ude7a\udecb\ude33\ude4f\udee3쁆\udea2\ude8c\udf2a", 56819)
                        + var10.II1o
                        + I1O(
                           "\uddd3\udf03\uded2\ude70\ude1b\udee6쀂\udea2\ude8c\udf2a\udf10\udf78\udf47\udff2\udfcd섋\udf8a\ue022\ue057\ue0a0\ue031\ue019\ue0bd\ue0ca︀\ue093\ue139\ue15b\ue138\ue118\ue1b5\ue1c7＂\ue1d2\ue27c\ue251\ue236\ue24e\ue2e0ﰃ\ue2a5\ue2ca",
                           56819
                        )
                        + var6;
                  } else {
                     var10.lOoO += 450;
                     this.IIlO.IIIl.l1_();
                     var8 = I1O("\uddb0\ude7a\udecb\ude33\ude4f\udee3쁆\udea2\ude8c\udf2a", 56819)
                        + var10.II1o
                        + I1O(
                           "\uddd3\udf03\uded2\ude70\ude1b\udee6쀂\udea2\ude8c\udf2a\udf1d\udf7d\udf57\udfa6\udfcb\udfa3섮\ue061\ue001\ue036ﺄ\ue017\ue0bd\ue0df\ue0b4\ue094\ue139\ue14bﾆ\ue156\ue1f8\ue1d5\ue1aa\ue1d2\ue27cﲟ\ue221\ue24e",
                           56819
                        )
                        + var6;
                  }
               }

               this.IIlO.II(new IO0o(-126).II(1).II(1).II("" + var6).II(var8));
               this.IIlO
                  .IIIl
                  .IIol(
                     I1O("\uddb0\ude7d\ude5f\ude70\ude1c쁟\ude8d\udea1\ude8a\udf73\udf09\udf25쇈\udfe8\udf85", 56819)
                        + (var5 == 0 ? I1O("\udda5\udef2\ude5f\ude37", 56819) : I1O("\uddbd\ude75샼\ude33", 56819))
                        + I1O("\uddd3\ude64\udec3\ude3e\ude08\udeae\udec3\ude2c\ude92\udf2a\udf45\udfa8\udf5d\udfa6", 56819)
                        + var6
                        + (
                           var9
                              ? I1O("\udddd\ude32\ude7f\ude37\udfdf쁓\udec4\udeec\ude9f\udf62솆\udf26\udf00\udfa6\udfc6\udfb1섺\ue061\ue01b\ue060", 56819)
                                 + this.IIlO.II.II1o
                              : I1O(
                                 "\udddd\ude32\ude7a\ude38\ude9b\udee0\udeca\udeec\ude88\udff9\udf09\udf26\udf00\ude36셸\udfad\udfc3\ue076\ue049ﻯ\ue031\ue019\ue0bd\ue0df\ue0ae︣\ue17a\ue116",
                                 56819
                              )
                        )
                  );
               var7.removeAllElements();
               this.IIlO.I__O();
            }
         }
      }
   }

   private static String III(long var0, long var2) {
      return var2 == 0L ? I1O("\uddc3", 56819) : String.valueOf(Math.ceil((double)var0 / var2 * 100.0));
   }

   private void Il00(int var1) {
      long var2 = System.currentTimeMillis();
      this.III0(var2);
      long var4 = Math.max(0L, (300000L - var2 % 300000L) / 1000L);
      String var6 = var1 == 0 ? I1O("\udd85\udef2\ude5f\ude37", 56819) : I1O("\udd9b상\ude5f\ude37\ude4f\udee0\udeca쀁\ude88", 56819);
      String var7 = I1O("\udda7샇\ude5f\ude37\ude4f\udee9\udec4쁯\ude82\udf2a\udf5d\udf20\uded7셛\udfcb\udfa3\udfd9\ue022", 56819)
         + IIIo(this.IIII[var1][0])
         + I1O("\uddd3", 56819)
         + var6
         + I1O(
            "\udddf\ude32\ude52\udff1\ude4f\udee6쁴\udea5\udecb\udf7e\udf5b\udfb2\udf09\udfe1\udf85\udfa7섄\ue063\ue001\ue022\ufefe\ue010\ue0bd\ue0d0\ue03b\ue0c0\ue139",
            56819
         )
         + III(this.III[var1][0], this.IIII[var1][0])
         + I1O("\uddd6\ude18\ude65삅\ude01\udee9\ude8d\udeab\ude82솩\udf40\udf68\udf31\udfcf\udff5\udffe\udfc3", 56819)
         + IIIo(this.IIII[var1][1])
         + I1O("\uddd3", 56819)
         + var6
         + I1O(
            "\udddf\ude32\ude52\udff1\ude4f\udee6쁴\udea5\udecb\udf7e\udf5b\udfb2\udf09\udfe1\udf85\udfa7섄\ue063\ue001\ue022\ufefe\ue010\ue0bd\ue0d0\ue03b\ue0c0\ue139",
            56819
         )
         + III(this.III[var1][1], this.IIII[var1][1])
         + I1O("\uddd6\ude18\ude65\ude38삲\udee7\ude8d\udeab\ude82\udf6b\udf47\udf68\udf04\udf74\udfcb\udfe4\udf8fﺣ\ue048\ue07a\ue07f", 56819)
         + var4
         + I1O("\uddd3\ude75\ude58\udeb2\ude16", 56819);
      String[] var8 = var1 == 0
         ? new String[]{
            I1O("\uddb0삿\ude41\ude70\ude01\udee6쀀\udebc", 56819),
            I1O("\udda7\ude7a\udf81삍\ude01\udee9\udea7\udefd\udecb\udf7e\udf5b\udf21솠\udff3\udfaf\udfb2\udf03\ue06c\ue046", 56819),
            I1O("\udda5\ude5b\ude61\ude5a\ude5e\udebe\ude8d\udeb8\ude99\udf63쇮\udf3d\udf6d\udff0\udf45\udfaa\udf84", 56819),
            I1O("\udce3\udee1\ude5f\ude37", 56819)
         }
         : new String[]{
            I1O("\uddb0삿\ude41\ude70\ude01\udee6쀀\udebc", 56819),
            I1O("\udda7\ude7a\udf81삍\ude01\udee9\udea7\udefd\udedb\udf2a\udf47\udf2f솪\udfe5\udfaf\udfbc\udf82\ue06c\ue049", 56819),
            I1O("\udda5\ude5b\ude61\ude5a\ude5e\udebe\ude9d\udeec\ude85\udf6d쇤\udf2b\udf6d\udffe\udfc4\udfaa\udf8b", 56819),
            I1O("\udce3\udee1\ude5f\ude37", 56819)
         };
      this.IIlO.II.IIII(54, var1 == 0 ? 8221 : 8222, var7, var8);
   }

   private void II_0(int var1, int var2) {
      long var3 = var1 == 0 ? (var2 == 0 ? 1000000L : 10000000L) : (var2 == 0 ? 10 : 100);
      IOol var5 = this.IIlO.II;
      if (var1 == 0) {
         if (var5.Il11 < var3) {
            this.IIlO.IIIl.IIol(I1O("\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udff0\udf45\udfaa\udf84", 56819));
            return;
         }

         var5.Il11 -= var3;
      } else {
         if (var5.lOoO < var3) {
            this.IIlO
               .IIIl
               .IIol(I1O("\uddb1삳\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38솯\udf47\udfe8\udfc2섉\udf80\ue022\ue059\ue021\ue031\ue016", 56819));
            return;
         }

         var5.lOoO -= (int)var3;
      }

      this.IIlO.IIIl.l1_();
      this.III[var1][var2] = this.III[var1][var2] + var3;
      this.IIII[var1][var2] = this.IIII[var1][var2] + var3;
      this.IIlO.I__O();
      this.Il00(var1);
   }

   private void III0(long var1) {
      long var3 = var1 / 300000L;

      for (int var5 = 0; var5 < 2; var5++) {
         if (this.III0[var5] < 0L) {
            this.III0[var5] = var3;
         }

         if (this.III0[var5] != var3) {
            this.III0[var5] = var3;
            IOol var6 = this.IIlO.II;
            boolean var7 = false;

            for (int var8 = 0; var8 < 2; var8++) {
               if (this.III[var5][var8] != 0L) {
                  var7 = true;
                  long var9 = this.IIII[var5][var8];
                  if (var5 == 1 && var8 >= 0) {
                     long var13 = this.III[var5][var8] * 90L / 100L;
                     var6.lOoO += (int)var13;
                     this.IIlO
                        .IIIl
                        .IIol(
                           I1O(
                                 "\uddb1삳\ude5f\ude70\ude03\ude6e\ude8d\udea2\ude8c\udeba쇴\udf21\udf47\udfe2\udfd0\udfbd\udfc3\ue06c\ue049ﻥ\ue02b\ue05e\ue0e9\ue0d4\ue0ba\ue097\ue139\ue15f\ue13e\ue117\ue1b5\ue1c2\ue133\ue1d2\ue273ﳻ\ue26f\ue206\ue2e2\ue24c\ue2a5\ue2ca\ue365ﶉ\ue32e\ue346\ue3bc\ue394\ue3e6\ue3c2\ue466\ue445\ue452\ue47e\ue56c\ue47f\ue49b\ue5cb祈\ue56c\ue517\ue57e",
                                 56819
                              )
                              + IIIo(var13)
                              + I1O("\uddda", 56819)
                        );
                  } else {
                     long var11 = var9 * (var8 == 0 ? 80 : 90) / 100L;
                     var6.Il11 += var11;
                     this.IIlO
                        .IIIl
                        .IIol(
                           I1O(
                                 "\uddb0\ude7a\udecb\ude33\ude4f\udee3쁆\udea2\ude8c\udf2a\udf4b쇩\udf09\udfa6\udeb4\udf27\udfc3\ue066\ue0c1\ue02e\ue037\ue05e\ue0fe\ue0d4\ue0b2﹅\ue177\ue118\ue123\ue11eＺ\ue1da\ue1b4\ue1d2\ue267\ue2d0\ue26f\ue200\ue2e5ﰁ\ue2a5\ue2ca\ue218\ue298ﶤ\ue305\ue3a5",
                                 56819
                              )
                              + IIIo(var11)
                              + I1O("\uddd3\ude64\uded1\ude3e\ude08", 56819)
                        );
                  }

                  this.III[var5][var8] = 0L;
                  this.IIII[var5][var8] = 0L;
               }
            }

            if (var7) {
               this.IIlO.IIIl.l1_();
               this.IIlO.I__O();
            }
         }
      }
   }

   void III1(long var1) {
      if (this.IIlO.II != null) {
         if (this.I_11 != 0L && var1 >= this.I_1_) {
            this.I_11 = 0L;
            this.I_1_ = 0L;
            this.Il01(0);
         }

         this.IIIO(var1);
         this.III0(var1);
      }
   }
}
