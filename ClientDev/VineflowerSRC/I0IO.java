package main;

final class I0IO {
   private final IO0 II1o;
   private final IOo_ II10;
   private static final int[][] II_O = new int[][]{{555, 556, 562, 563, 561}, {557, 558, 564, 565, 561}, {559, 560, 566, 567, 561}};
   private static final int[][][] III_ = new int[][][]{
      {{47, 700}, {21, 15}}, {{22, 65}, {27, 10000}, {21, 15}}, {{0, 3200}, {21, 17}}, {{23, 40}, {28, 10000}, {21, 14}}, {{14, 16}, {21, 18}}
   };
   private static final int[][] II_0 = new int[][]{{700, 65, 3200, 40}, {600, 55, 3000, 60}, {800, 60, 3500, 50}};
   static final int __l_ = 8701;
   static final int __lO = 8702;

   I0IO(IO0 var1, IOo_ var2) {
      this.II1o = var1;
      this.II10 = var2;
   }

   private static int IIl_(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0 + 1));
   }

   private static int III(int[] var0) {
      return var0[(int)(Math.random() * var0.length)];
   }

   private static boolean Illl(int var0) {
      return Math.random() * 100.0 < var0;
   }

   private void II(IO0l var1, int var2, int var3) {
      int[][] var4 = III_[var3];

      for (int var5 = 0; var5 < var4.length; var5++) {
         int var6 = var4[var5][1];
         if (var3 == 0) {
            var6 = II_0[var2][0];
         } else {
            if (var3 == 1) {
               var1.III(22, (int)Math.round(II_0[var2][1] * (0.9 + Math.random() * 0.2)));
               var1.III(27, (int)Math.round(10000.0 * (0.9 + Math.random() * 0.2)));
               var1.III(21, (int)Math.round(15.0 * (0.9 + Math.random() * 0.2)));
               return;
            }

            if (var3 == 2) {
               var6 = II_0[var2][2];
            } else if (var3 == 3) {
               var1.III(23, (int)Math.round(II_0[var2][3] * (0.9 + Math.random() * 0.2)));
               var1.III(28, (int)Math.round(10000.0 * (0.9 + Math.random() * 0.2)));
               var1.III(21, (int)Math.round(14.0 * (0.9 + Math.random() * 0.2)));
               return;
            }
         }

         if (var4[var5][0] == 21) {
            var6 = var4[var5][1];
         }

         var1.III(var4[var5][0], (int)Math.round(var6 * (0.9 + Math.random() * 0.2)));
      }
   }

   private void III(IO0l var1, int var2) {
      switch (var2) {
         case 0:
            var1.III(50, 12).III(77, 7).III(103, 12).III(101, 101).III(30, 0);
            break;
         case 1:
            var1.III(50, IIl_(15, 30)).III(103, IIl_(10, 20)).III(30, 0);
            break;
         case 2:
            var1.III(50, IIl_(15, 30)).III(30, 0);
            break;
         case 3:
            var1.III(77, IIl_(15, 25)).III(103, IIl_(15, 25)).III(30, 0);
            break;
         default:
            var1.III(50, IIl_(1, 10)).III(77, IIl_(1, 10)).III(30, 0);
      }
   }

   private void II(IO0l var1, int var2, int var3, boolean var4, int var5, int var6) {
      var1.III(50, IIl_(var2, var3)).III(77, IIl_(var2, var3)).III(103, IIl_(var2, var3));
      if (var4) {
         var1.III(210, IIl_(0, 2));
      }

      if (!Illl(var6)) {
         var1.III(93, IIl_(1, var5));
      }
   }

   private int IIo_() {
      return this.II1o.IIIl.IlII();
   }

   private boolean II(int var1, IO0l var2, String var3) {
      this.II1o.IIIl.IIOo(var1, 1);
      this.II1o.IIIl.III0(var2);
      this.II1o.IIIl.l1_l();
      IOO.III var4 = IOO.II(var2.I1l);
      this.II1o.IIIl.IIol((var3 == null ? I1oI("巅䌇嶫巄幭幊䃬帎幟徏弍䀿庘强", 23943) : var3) + (var4 == null ? I1oI("己䌋嶱巄平幊䃨帍", 23943) : var4.II1o));
      this.II1o.I__O();
      return true;
   }

   private boolean Ill1(int var1) {
      if (this.IIo_() < var1) {
         this.II1o
            .IIIl
            .IIol(var1 <= 1 ? I1oI("巏嵆嶫嶌帣幖帳币帑廹庝康库忮彗弿彗庇䅒忴徐恺绦恰怛惼繼悢悌", 23943) : I1oI("巅䌇嶫巄平幊䃢帉幟廽幎廼帖彮弙弶弟䄳忁忴", 23943) + var1 + I1oI("嶧嵒工嶐幱䃳帯帇幟延幝庲库强彍弪弖忸忒", 23943));
         return true;
      } else {
         return false;
      }
   }

   boolean III1(int var1, int var2, int var3) {
      if (var1 == 21 && (var2 == 8701 || var2 == 8702)) {
         IOol var4 = this.II1o.II;
         if (var2 == 8701) {
            if (var3 != 0) {
               return true;
            } else if (this.II1o.II.II__(1505) < 99) {
               this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幠幊忱币幟廽幎廼忪䇽弙彡彎徶忲徽䅖恫怑思悏惻", 23943));
               return true;
            } else if (this.IIo_() < 1) {
               this.II1o.IIIl.IIol(I1oI("巏嵆嶫嶌帣幖帳币帑廹庝康库忮彗弿彗庇䅒忴徐恺绦恰怛惼繼悢悌", 23943));
               return true;
            } else {
               this.II1o.II.II_l(1505, 99);
               this.II1o.IIIl.III0(new IO0l(1506, 1));
               this.II1o.IIIl.l1_l();
               this.II1o.I__O();
               return true;
            }
         } else {
            if (var3 > 1) {
               return true;
            }

            if (this.II1o.II.II__(1507) < 5) {
               this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幠幊忱币幟徏䁚廼廎强彪強弔忹忙徵忝", 23943));
               return true;
            }

            if (this.II1o.II.II__(1508) < 30) {
               this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幠幊忱币幟徏䁚廼廈弪弙弐弘忷徕徜䄠恼恖恰怨惧縈悵情", 23943));
               return true;
            }

            if (this.II1o.II.II__(1509) < 1) {
               this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幠幊忱币幟徏䁚廼廊强彷廹彗忂忇徵徝恵怑怄思恣悃", 23943));
               return true;
            }

            if (this.II1o.II.II__(1506) < 1) {
               this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幠幊忱币幟徏䁚廼廊强影䆁弇徶庥䄥徝恵怑态怚恮悃", 23943));
               return true;
            }

            if (this.IIo_() < 1) {
               this.II1o.IIIl.IIol(I1oI("巏嵆嶫嶌帣幖帳币帑廹庝康库忮彗弿彗庇䅒忴徐恺绦恰怛惼繼悢悌", 23943));
               return true;
            }

            this.II1o.II.II_l(1507, 5);
            this.II1o.II.II_l(1508, 30);
            this.II1o.II.II_l(1506, 1);
            if (var3 == 1) {
               this.II1o.II.II_l(1509, 1);
            }

            this.II1o.IIIl.III0(new IO0l(var3 == 0 ? 1510 : 1511, 1));
            this.II1o.IIIl.l1_l();
            this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幭幊䃬帎幟徏弍䀿庘强彈弭得", 23943));
            this.II1o.I__O();
            return true;
         }
      } else {
         return false;
      }
   }

   boolean IIII(int var1, IO0l var2) {
      IOol var3 = this.II1o.II;
      switch (var2.I1l) {
         case 648:
            if (this.Ill1(1)) {
               return true;
            } else if (Illl(6)) {
               int var30 = IIl_(10, 20);
               var3.lOoO += var30;
               this.II1o.IIIl.IIOo(var1, 1);
               this.II1o.IIIl.l1_();
               this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幭幊䃬帎幟徏弍䀿庘强", 23943) + var30 + I1oI("嶧巨嶢䌩幠", 23943));
               return true;
            } else {
               int[] var29 = new int[]{IIl_(441, 445), IIl_(381, 384), IIl_(17, 20), IIl_(925, 931), IIl_(1066, 1070), 533, 380};
               int var36 = III(var29);
               IO0l var23 = new IO0l(var36, 1);
               if (var36 >= 441 && var36 <= 445) {
                  int[] var38 = IOoI.IIII(var36);
                  var23.III(var38[0], var38[1]);
                  var23.lo0I = IIl_(1, 5);
               } else if (var36 >= 381 && var36 <= 384 || var36 >= 1066 && var36 <= 1070) {
                  var23.lo0I = IIl_(1, 5);
               }

               return this.II(var1, var23, null);
            }
         case 726:
            this.II1o.II.l1oO();
            return true;
         case 736:
            if (this.Ill1(2)) {
               return true;
            }

            int var28 = IIl_(1, 100);
            IO0l var22;
            if (var28 <= 50) {
               var22 = new IO0l(III(new int[]{20, 19, 18}), 1);
            } else if (var28 <= 70) {
               var22 = new IO0l(77, IIl_(1, 2));
            } else if (var28 <= 80) {
               var22 = new IO0l(987, 1).III(30, 1);
            } else if (var28 <= 90) {
               var22 = new IO0l(795, 1).III(89, 1).III(30, 1);
               if (Illl(95)) {
                  var22.III(93, IIl_(1, 3));
               }
            } else if (var28 <= 95) {
               var22 = new IO0l(954, 1).III(77, IIl_(5, 9)).III(103, IIl_(5, 9)).III(147, IIl_(5, 9));
               if (Illl(1)) {
                  ((int[])var22.IIl.elementAt((int)(Math.random() * (var22.IIl.size() - 1))))[1] = 10;
               }

               var22.III(30, 1);
               if (Illl(99)) {
                  var22.III(93, IIl_(1, 3));
               }
            } else {
               var22 = new IO0l(680, 1).III(76, 1).III(77, 24).III(103, 25).III(147, 24);
               if (Illl(99)) {
                  var22.III(93, IIl_(1, 3));
               }
            }

            return this.II(var1, var22, I1oI("巅䌇嶫巄弒廁幡帎帗䀳廓廼忪庪䇚弻彗", 23943));
         case 1170:
            if (this.Ill1(1)) {
               return true;
            }

            int var27 = Math.max(0, Math.min(2, var3.lOlI));
            int var35 = IIl_(0, 3);
            int var37 = var35 == 0
               ? 746
               : (var35 == 1 ? new int[]{1155, 1157, 1156}[var27] : (var35 == 2 ? new int[]{1018, 1019, 1020}[var27] : 1087 + IIl_(0, 4)));
            IO0l var21 = new IO0l(var37, 1);
            if (var37 == 746) {
               if (Illl(1)) {
                  var21.III(73, 0);
               } else {
                  var21.III(93, IIl_(7, 30));
               }
            } else {
               int var39 = var37 >= 1087 && var37 <= 1091 ? 22 : 23;
               int var40 = var37 >= 1087 && var37 <= 1091 ? 21 : 23;
               var21.III(50, var39).III(77, var40).III(103, var40);
               if (Illl(95)) {
                  var21.III(93, IIl_(1, 3));
               } else {
                  var21.III(73, 0);
               }
            }

            return this.II(var1, var21, null);
         case 1171:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var20 = new IO0l(1158 + IIl_(0, 6), 1);
            var20.III(50, 11).III(77, 13).III(103, 13).III(III(new int[]{94, 97, 108}), IIl_(3, 5));
            if (Illl(98)) {
               var20.III(93, IIl_(1, 3));
            } else {
               var20.III(73, 0);
            }

            return this.II(var1, var20, null);
         case 1505:
            this.II1o
               .II
               .IIII(
                  21,
                  8701,
                  I1oI("巻嶗嶹嶣廰幋幡帨䂦廮庝忍䀊彴彞彸弆忣录忞徏怠恍怗怆縫惔惬悆懪慜慨", 23943) + this.II1o.II.II__(1505) + I1oI("嶨嶟巼差广帐帽帧帖广庝庪帛彴彞彸彅徸待忤心怼态恠恟", 23943),
                  new String[]{I1oI("岗䍵嶫嶃帣廟", 23943), I1oI("岗嵕嶫嶃", 23943)}
               );
            return true;
         case 1506:
         case 1507:
         case 1508:
         case 1509:
            this.II1o
               .II
               .IIII(
                  21,
                  8702,
                  I1oI("巅䌇嶫巄幮幗䂐帎幟廹幎庵廛彶彖䇹弞徶忛弴徜", 23943),
                  new String[]{I1oI("巀嵕嶬巄幋䃻帱幀帎廫幝廼底彲䆀彸弙忾录徺徔", 23943), I1oI("巀嵕嶬巄幋䃻帱幀帎廫幝廼庘彲䇰弶弟徶忖徼徆", 23943), I1oI("巓䍍工嶇幫䃳帨", 23943)}
               );
            return true;
         case 1560:
            if (this.Ill1(1)) {
               return true;
            } else {
               int var26 = -1;

               for (int var33 = 0; var33 < var3.III.length; var33++) {
                  if (var3.III[var33].I1l == 1561 && var3.III[var33].lo0I > 0) {
                     var26 = var33;
                     break;
                  }
               }

               if (var26 < 0) {
                  this.II1o.IIIl.IIol(I1oI("巅䌇嶫巄幨幊庵帎帘庾廞帯廛役彑徴弖徶忞徼徜想怑怦悏惠惊", 23943));
                  return true;
               } else {
                  int var34 = IIl_(0, 100);
                  int var7 = var34 < 85 ? 17 + IIl_(0, 3) : (var34 < 95 ? 16 : IIl_(14, 15));
                  this.II1o.IIIl.IIOo(var26, 1);
                  int var8 = var3.III[var1] == var2 ? var1 : -1;
                  if (var8 < 0) {
                     for (int var9 = 0; var9 < var3.III.length; var9++) {
                        if (var3.III[var9] == var2) {
                           var8 = var9;
                           break;
                        }
                     }
                  }

                  if (var8 < 0) {
                     return true;
                  }

                  return this.II(var8, new IO0l(var7, 1), I1oI("巅䌇嶫巄幵䃉帠幀帑延䀐庲廛帋庉䆻弔徶", 23943));
               }
            }
         case 1569:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var19 = new IO0l(IIl_(618, 626), 1);
            var19.III(50, IIl_(10, 15)).III(77, IIl_(10, 15)).III(103, IIl_(10, 15)).III(210, 2).III(30, 0);
            if (Illl(95)) {
               var19.III(93, 15);
            }

            return this.II(var1, var19, null);
         case 1575:
         case 1576:
            boolean var25 = var2.I1l == 1576;
            if (var25 && this.Ill1(1)) {
               return true;
            }

            long var32 = var25 ? IIl_(500000, 2000000) : IIl_(5000, 20000);
            var3.Il11 = Math.min(var3.Il11 + var32, 99999999999L);
            this.II1o.IIIl.IIOo(var1, 1);
            if (var25) {
               this.II1o.IIIl.III0(new IO0l(Illl(50) ? 1867 : 1868, 1));
               this.II1o.IIIl.l1_l();
            }

            this.II1o.IIIl.l1_();
            this.II1o.IIIl.IIol(I1oI("巗巎崤嶋帣幀庵帎帘庾廓䀉廚强彻䇹弙徶忛徼䅞恼怑慁懟繭惎惬", 23943) + var32 + I1oI("嶧巐崥嶊幤", 23943));
            this.II1o.I__O();
            return true;
         case 1591:
         case 1592:
         case 1594:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var18 = new IO0l(III(new int[]{1588, 1589, 1595, 1587, 1593, 1590}), 1);
            this.II(var18, 20, 25, true, 15, 1);
            return this.II(var1, var18, null);
         case 1608:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var17 = new IO0l(III(new int[]{1807, 1599, 1600, 1601, 1602}), 1);
            var17.III(50, IIl_(10, 18)).III(77, IIl_(10, 18)).III(103, IIl_(10, 18)).III(210, IIl_(1, 2));
            if (!Illl(1)) {
               var17.III(93, IIl_(1, 7));
            }

            var17.III(30, IIl_(0, 1));
            return this.II(var1, var17, null);
         case 1757:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var16 = new IO0l(1741 + IIl_(0, 5), 1);
            var16.III(103, IIl_(20, 25)).III(50, IIl_(20, 25)).III(77, IIl_(20, 25)).III(210, IIl_(0, 2));
            if (!Illl(1)) {
               var16.III(93, IIl_(1, 15));
            }

            var16.III(30, 0);
            return this.II(var1, var16, null);
         case 1775:
            if (this.Ill1(1)) {
               return true;
            }

            int var24 = Math.max(0, Math.min(2, var3.lOlI));
            int var31 = (int)(Math.random() * 5.0);
            IO0l var15 = new IO0l(II_O[var24][var31], 1);
            this.II(var15, var24, var31);
            var15.III(30, 1);
            return this.II(var1, var15, null);
         case 1776:
            if (this.Ill1(2)) {
               return true;
            }

            IO0l var14 = new IO0l(Illl(50) ? 1772 : 1773, 1);
            var14.III(103, IIl_(7, 10)).III(50, IIl_(7, 10)).III(77, IIl_(7, 10)).III(14, IIl_(7, 10));
            if (!Illl(1)) {
               var14.III(93, IIl_(1, 15));
            }

            var14.III(30, 0);
            return this.II(var1, var14, null);
         case 1777:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var13 = new IO0l(III(new int[]{1761, 1731, 1732}), 1);
            this.II(var13, 20, 25, true, 15, 1);
            return this.II(var1, var13, null);
         case 1787:
            this.II1o.II.II_o(164, 870);
            return true;
         case 1821:
            if (this.Ill1(5)) {
               return true;
            }

            IO0l var12 = new IO0l(IIl_(1765, 1771), 1);
            var12.III(50, IIl_(10, 18)).III(5, IIl_(5, 10)).III(14, IIl_(5, 10));
            if (!Illl(1)) {
               var12.III(93, IIl_(1, 15));
            }

            var12.III(30, IIl_(0, 1));
            return this.II(var1, var12, null);
         case 1840:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var11 = new IO0l(III(new int[]{1588, 1589, 1595, 1587, 1593, 1590}), 1);
            this.II(var11, 20, 25, true, 15, 1);
            var11.III(30, 0);
            return this.II(var1, var11, null);
         case 1863:
         case 1864:
         case 1866:
         case 1867:
         case 1868:
            if (this.Ill1(1)) {
               return true;
            }

            int[] var5 = var2.I1l == 1863
               ? new int[]{1862, 1469, 1470, 1471, 1539}
               : (
                  var2.I1l == 1868
                     ? new int[]{754, 755, 756, 846, 847, 848, 941, 946, 947}
                     : (var2.I1l == 1867 ? new int[]{1202, 942, 943, 944} : new int[]{1477, 1478, 1479, 1483, 1484, 1485, 1486})
               );
            int var6 = (int)(Math.random() * var5.length);
            IO0l var10 = new IO0l(var5[var6], 1);
            this.III(var10, Math.min(var6, 4));
            if (Illl(99)) {
               var10.III(93, 15);
            }

            return this.II(var1, var10, var2.I1l == 1863 ? I1oI("巅䌇嶫巄幭幊䃬帎幟徏弍䀿庘强弑弛弖忦忆御徟恷怑怄绐惺悄惬", 23943) : null);
         case 1865:
            if (this.Ill1(1)) {
               return true;
            }

            IO0l var4 = new IO0l(III(new int[]{1074, 1075, 1076, 1077, 1078, 1079, 1080, 1081, 1082, 1083, 841, 840, 1204}), 1);
            return this.II(var1, var4, null);
         default:
            return false;
      }
   }
}
