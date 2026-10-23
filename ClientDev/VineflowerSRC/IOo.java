package main;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

final class IOo {
   static final int _I__ = 0;
   static final int _I_O = 1;
   static final int _I_0 = 2;
   static final int _I_o = 3;
   static final int _IO = 4;
   static final int _IOI = 5;
   private static final int _IOl = 300;
   private static final int _IO1 = 50;
   private static final int[][] II_I = new int[][]{{285, 286, 287}, {288, 289, 290}, {282, 283, 284}, {304, 305, 303}};
   private final IO0 IIlo;
   private final IOo_ IIlo;
   private final Random IIlO = new Random();
   private boolean Iol_;
   private boolean I0oI;
   private int loOl;
   private int loO1;
   private long I1_0;
   private long I_1O;
   private long I_10;
   private long I_1o;
   private long I__;
   private long I__I;
   private long I__l;
   private long I__1;
   private long[] IIIo = new long[6];
   private IOoI.III III;
   private boolean IoOl;
   private boolean IoO1;
   private IO_I.III IIII;
   static final String[] IlO_ = new String[]{I1Ol("鐏诹镽锈譶", 38175), I1Ol("镒镟锿铌", 38175), I1Ol("镊镋锿", 38175), I1Ol("镔镗锹镜闙闟閼閊", 38175), I1Ol("镔镗锹镜闑闓閫閝陹", 38175)};
   static final String[] IlOO = new String[]{
      I1Ol("镇镗锳镜闳镙閠闘陣陞阠陔雽雚衼隞霯靚霬霃鞫韆霩鞅頧餷蚂顄飷虏", 38175),
      I1Ol("镐镟镽锓闺閚閶閙阹阘陻", 38175),
      I1Ol("镇镗锳镜闳镙閠闘陣陞阠陔雽雚衼隞霯靚霬霃鞫韆霩鞅頧餷蚂顄飷虏", 38175),
      I1Ol("镗闝锤镜闳譙閩闘陣雗阶陔雥衩隸雐靻靏靡靌韀韋鞢鞉页顉頱顅", 38175),
      I1Ol("镇镗锳镜闳镙閠闘陣陞阠陔雽雚衼隞霯靚霬霃鞫韆霩鞅頧餷蚂顄飷虏", 38175)
   };
   private long I___;
   private String lI_0;
   private static final short[][] III1 = new short[][]{
      {380, 381, 382},
      {383, 384, 385},
      {391, 392, 393},
      {870, 871, 872},
      {873, 874, 875},
      {867, 868, 869},
      {1876, 1879, 1880},
      {1771, 1774, 1775},
      {1766, 1769, 1770}
   };
   private long I__O;
   private long[] IIl = new long[0];
   private long[] IIlI = new long[0];
   private long I__0;
   private int _IO_;
   private long I__o;
   private static final String[] IlO0 = new String[]{
      I1Ol("镋镟镽锟闳镗閷閐阷陚隵陔雧雚衮雐靨靇視霅", 38175),
      I1Ol("镋镟镽锟闳镗閷閐阷陚隵陔雰陆隿隗霯靂鞠", 38175),
      I1Ol("镗闝锤镜闸闒閰锒険阖阻阓霣術隿隗霯靘觶靌隚褓鞹韈顤蛁頤顄飷飃飠飀颷蟿饔饼餘駵駗駸香驱鮅蒉騚", 38175),
      I1Ol("镌诗锾镜闶講閷閐阷陂阺陔雿衩隿雐靡覟霠靌響韘鞦鞆顠順頦駅颣飖颩蘣食饼螘館饛駮蝔", 38175),
      I1Ol("镋镟镽锏謦閚铈閝険阖阶隀雽雕雱障韢霎霹覷韢鞊鞽鞇飧顈顥順虚颂颷馉食饪饏螹饛駴饙馡", 38175)
   };
   private static final int _IOO = 2000;
   private boolean IoO_;
   private long I_O;
   private int _IO0;
   private int _IOo;
   private int _I0;
   private int _I0I;
   private IOO.IIIO II;
   private int _I0l;
   private long I_OI;
   private boolean IoOO;
   private long I_Ol;
   private long I_O1;
   private boolean IoO0;
   private int _I01;
   private long I_O_;
   private long I_OO;
   private boolean IoOo;
   private long I_O0;
   private boolean Io0;
   private boolean Io0I;
   static final long I_Oo = 432000000L;
   static final int _I0_ = 1000000000;
   static final int _I0O = 50000000;

   IOo(IO0 var1, IOo_ var2) {
      this.IIlo = var1;
      this.IIlo = var2;
   }

   private IOol II() {
      return this.IIlo.II;
   }

   private IOol III() {
      return this.IIlo.II == null ? null : this.IIlo.II.III;
   }

   private int IIoO() {
      return -this.IIlo.II.I1l;
   }

   void Ilol(int var1) {
      this.IIIO(0, var1, -1);
   }

   void IIIO(int var1, int var2, int var3) {
      IOol var4 = this.II();
      if (var4.III != null) {
         if (var4._10 != 0) {
            this.l1II();
         }

         for (int var5 = 0; var5 < var4.III.II.length; var5++) {
            if (!var4.III.II[var5].II1_() && this.IIlo.IIIl.III0(var4.III.II[var5])) {
               var4.III.II[var5] = new IO0l();
            }
         }

         this.IIlo.IIIl.l1_l();
         this.I__o();
      }

      this.lloo();
      IOol var6 = new IOol();
      var6.II1o = I1Ol("锻", 38175) + IlO_[var1];
      var6.lOlI = var2;
      var6.IO_l = var1 == 0 ? 2000L : (var1 == 1 ? 1500000L : 40000000000L);
      var6.IO_1 = 0L;
      var6._l0_ = 1000;
      var6._l0O = 1000;
      if (var1 >= 2) {
         var6._l00 = 400000;
         var6._l0o = 400000;
         var6._lo = 20000;
      } else {
         var6._l00 = (40 + this.IIlO.nextInt(66)) * 20;
         var6._l0o = (40 + this.IIlO.nextInt(66)) * 20;
         var6._lo = var1 == 1 ? 50 + this.IIlO.nextInt(71) : 20 + this.IIlO.nextInt(26);
      }

      var6._lol = 9 + this.IIlO.nextInt(42);
      var6._lo1 = this.IIlO.nextInt(3);
      var6.I__l = new int[]{-1, -1, -1, -1, -1};
      var6.I__l[0] = IIO0(this.IIlO.nextInt(3) * 2);
      if (var3 >= 0) {
         var6._11_ = var3;
      }

      if (var1 >= 2 && var6._11_ < 5) {
         var6._11_ = 5;
      }

      var6.llIl = var6.Illo();
      var6._loI = var6.Il1();
      var4.III = var6;
      var4._10I = 0;
      var4._10l = var1;
      this.loOl = var4.I1 + this.IIlO.nextInt(21) - 10;
      this.loO1 = var4.I1I;
      this.l1();
      if (this.Iol_) {
         this.I__0();
      }

      this.II(1000L, IlOO[var1]);
      this.IIlo.I__O();
   }

   private void lloo() {
      this.IoOo = false;
      this.Io0 = false;
      this.III = null;
      this.IoOO = false;
      this.IoO_ = false;
      this.IoO0 = false;
      this.IIl = new long[0];
      this.IIlI = new long[0];
      this.IIIo = new long[6];
   }

   int II00() {
      IOol var1 = this.II();
      return var1 != null && var1.III != null ? var1._10l : 0;
   }

   private static int IIO0(int var0) {
      IOO.IIIO var1 = IOO.II(var0, 1);
      return var1 == null ? -1 : var1.I1l;
   }

   private void II(long var1, String var3) {
      this.I___ = System.currentTimeMillis() + var1;
      this.lI_0 = var3;
   }

   void II_1(String var1) {
      if (this.II() != null && this.III() != null && this.I0oI) {
         this.IIlo.II(new IO0o(44).IIII(this.IIoO()).II(var1));
      }
   }

   void l1() {
      this.IIlo.II(new IO0o(-107).II(this.III() == null ? 0 : 1));
   }

   void II__(IO_I.III var1) {
      IOol var2 = this.II();
      IOol var3 = this.III();
      if (var2 != null && var3 != null && this.I0oI && !this.IoOo && var2.llIl > 0 && var3.llIl > 0) {
         if (var2._10I == 1 || var2._10I == 2) {
            if (this.IIII != var1) {
               this.IIII = var1;
               this.II_1(var1.II1o + I1Ol("锳锞锰锕閻钫锺闘陻雖阸陔雧雓雱隞觚靇靭霋韢複鞧韈页蛵頬顅", 38175));
            }
         }
      }
   }

   private int[] IIII() {
      IOol var1 = this.III();
      int var2 = var1.lOlI;
      if (var1._lo_ > 0) {
         int[] var6 = new int[]{192, 195, 196, 199, 197, 200, 198};
         return new int[]{var6[Math.min(var1._lo_, var6.length) - 1], 193, 194};
      }

      int var3 = this.II00();
      if (var3 >= 1) {
         int[][] var4 = new int[][]{{297, 298, 299}, {946, 947, 948}, {1422, 1423, 1424}, {876, 877, 878}};
         if (this.Io0 && var3 < 3) {
            int[] var5 = this.II(var1);
            return new int[]{var5[0], var4[var3 - 1][1], var4[var3 - 1][2]};
         } else {
            return var4[var3 - 1];
         }
      } else {
         return this.II(var1);
      }
   }

   private int[] II(IOol var1) {
      int var2 = var1.lOlI;
      int var3;
      int var4;
      int var5;
      if (var1.IO_l < 1500000L) {
         var3 = II_I[var2][0];
         var4 = II_I[var2][1];
         var5 = II_I[var2][2];
      } else {
         var3 = II_I[3][var2];
         var4 = var2 == 1 ? 59 : 57;
         var5 = var2 == 1 ? 60 : 58;
      }

      int[] var6 = var1.II[5].II1_() ? null : I0I1.III_(var1.II[5].I1l);
      if (var6 != null && var6[0] != -1) {
         var3 = var6[0];
      }

      if (var6 != null && var6[1] != -1) {
         var4 = var6[1];
      } else if (!var1.II[0].II1_() && I0I1.IIoO(var1.II[0].I1l) != -1) {
         var4 = I0I1.IIoO(var1.II[0].I1l);
      }

      if (var6 != null && var6[2] != -1) {
         var5 = var6[2];
      } else if (!var1.II[1].II1_() && I0I1.IIoO(var1.II[1].I1l) != -1) {
         var5 = I0I1.IIoO(var1.II[1].I1l);
      }

      return new int[]{var3, var4, var5};
   }

   private int IIo0() {
      switch (this.II00()) {
         case 1:
            return 297;
         case 2:
            return 946;
         case 3:
            return 1422;
         case 4:
            return 876;
         default:
            return II_I[3][this.III().lOlI];
      }
   }

   static boolean IIo(int var0) {
      I0Io.II var1 = I0Io.II(var0);
      return var1 != null && var1.IoI_ == 1;
   }

   private boolean Il_0() {
      return this.II().lOlo == 21 + this.II().lOlI;
   }

   private boolean Il_o() {
      IOol var1 = this.II();
      if (var1 != null && var1.III != null && this.Iol_ && !IIo(var1.lOlo)) {
         int var2 = var1._10I;
         if (var2 == 4) {
            return false;
         } else {
            return var2 != 3 ? true : System.currentTimeMillis() < this.I__1 || this.Il_0();
         }
      } else {
         return false;
      }
   }

   private void I__0() {
      IOol var1 = this.II();
      IOol var2 = this.III();
      if (var2 != null) {
         int[] var3 = this.IIII();
         int var4 = Math.max(1, var2.Illo());
         this.IIlo
            .II(
               new IO0o(-5)
                  .IIII(this.IIoO())
                  .IIII(-1)
                  .II(0)
                  .II(false)
                  .II(0)
                  .II(var2.lOlI)
                  .II(var2.lOlI)
                  .III(var3[0])
                  .II(var2.II1o)
                  .IIII(Math.max(1, var2.llIl))
                  .IIII(var4)
                  .III(var3[1])
                  .III(var3[2])
                  .II(-1)
                  .II(-1)
                  .III(this.loOl)
                  .III(this.loO1)
                  .III(0)
                  .III(0)
                  .II(0)
                  .II(0)
                  .II(0)
                  .III(-1)
                  .II(0)
                  .II(0)
                  .III(-1)
                  .II(-1)
                  .III(-1)
            );
         this.I0oI = true;
      }
   }

   private void I__o() {
      if (this.I0oI) {
         this.IIlo.II(new IO0o(-6).IIII(this.IIoO()));
         this.I0oI = false;
      }
   }

   private void l1I() {
      this.I__o();
      if (this.Il_o()) {
         this.I__0();
      }
   }

   void Ioo1() {
      this.Iol_ = false;
      this.I0oI = false;
      this.III = null;
      this.IIII = null;
      this.IoO0 = false;
      this.IoOO = false;
      this.IoO_ = false;
      this.IIl = new long[0];
      this.IIlI = new long[0];
   }

   void lIlI() {
      this.Iol_ = true;
      IOol var1 = this.II();
      this.l1l();
      if (var1 != null && var1.III != null) {
         if (!this.IoOo) {
            if (var1._10I != 3 || this.Il_0()) {
               this.loOl = var1.I1 + this.IIlO.nextInt(21) - 10;
               this.loO1 = var1.I1I;
               if (var1._10I == 3) {
                  this.loOl = 250;
                  this.loO1 = 336;
               }

               if (this.Il_o()) {
                  this.I__0();
               }
            }
         }
      }
   }

   private void IIOI(int var1, int var2) {
      this.loOl = var1;
      this.loO1 = var2;
      if (this.I0oI) {
         this.IIlo.II(new IO0o(-7).IIII(this.IIoO()).III(this.loOl).III(this.loO1));
      }
   }

   private int III1(int var1, int var2, int var3, int var4) {
      double var5 = var1 - var3;
      double var7 = var2 - var4;
      return (int)Math.sqrt(var5 * var5 + var7 * var7);
   }

   private void Ilo1(int var1) {
      IOol var2 = this.II();
      int var3 = var2.I1;
      int var4 = var2.I1I;
      int var5 = this.loOl - var3;
      if (this.III1(var3, var4, this.loOl, this.loO1) >= var1 || var5 < 50) {
         int var6 = var5 < 0 ? var3 - 50 : var3 + 50;
         if (var6 != this.loOl || var4 != this.loO1) {
            this.IIOI(var6, var4);
         }
      }
   }

   void ll11() {
      IOol var1 = this.II();
      if (var1 != null && var1.III != null && this.I0oI) {
         switch (var1._10I) {
            case 2:
               if (this.III != null && !this.III.IoOo && this.III1(this.loOl, this.loO1, var1.I1, var1.I1I) <= 1000) {
                  break;
               }
            case 0:
            case 1:
               this.Ilo1(500);
         }
      }
   }

   private String IIlI(int var1) {
      if (this.II00() == 4) {
         switch (var1) {
            case 0:
               return I1Ol("镓鑗镽锟间闔闹閖陰鞆袈阝隳雙隹阄靡靉靭陽襬鞊鞽陘頧顅颤頇飫颂駐蘣食饰駎餵饛駹駑馭馎蓑驛驴騅葉高髰骛魯", 38175);
            case 1:
               return I1Ol("镋镟镽锏謦閚閺閐陸阖阻阓霣衯隸雐靭靇觲霘鞫韙褠鞋頧顋蛤頊飫颂颢蘇颞餾饐螅餏馺駏蜓駗驢驝蓳騝骲髝騰髏魠魅髼魋鯾鯁蕷鯇鱨鳅鰫鱃鲣", 38175);
            case 2:
               return I1Ol("镋镟镽锏謦閚閭閐裆陘防陔雧雀蠚雐靹陇靭霘韹襏", 38175);
            case 3:
               return I1Ol("镔镖閩锒闼閚閵锕阷陘隵阛隳集隰雐靣規霤靌韹韟鞧韈顴蛅顥順虎飌飡颃颐饰餝餲餜頪蝤馱駗驥驔騻", 38175);
            case 4:
            default:
               return I1Ol("镌诗锾镜闶講閷閐阷陕袲阕隳集隰雐靣韎靭震韣非鞧鞏頧顅颶顄飤飋蘚颉食饶螜餲", 38175);
            case 5:
               return I1Ol("镓鑗镽锟镺闙闹閖陰鞆韴阝隳雞阱隝霯靚霬靌響韂襬鞑頧餷頤頑颣飐蘒颉食螻饄饼餓駻駑馹", 38175);
         }
      } else {
         switch (var1) {
            case 0:
               return I1Ol("镐镕镽锟间闔闹閌陿陓阺陔雠霂雱隀靧觋", 38175);
            case 1:
               return I1Ol("镐镕镽锟间闔闹開袪阖阷裗雼隒隧蠷霯靝雽靌韻韂褬", 38175);
            case 2:
               return I1Ol("镐镕镽锏鐫閚閩閐裲阖靄袷隳雑难隞霯靂霢靌韨韂鞦", 38175);
            case 3:
               return I1Ol("镐镵镽锟间闔闹閎裖阚陵阖雺雐隸雐靼隞靭霜韣襏", 38175);
            case 4:
            default:
               return I1Ol("镌钎镽锌闳譟闹鑙陾阖阶阛雽隒隽阚靡霎霮觉韻鞊鞻褻顮", 38175);
            case 5:
               return I1Ol("镛镓镽锏鐫閚閩閐裲", 38175);
         }
      }
   }

   void Ilo_(int var1) {
      IOol var2 = this.II();
      if (var2 != null && var2.III != null) {
         if (var1 >= 0 && var1 <= 5) {
            if (var2._10 != 0 || this.IoOo && var1 == 4 || System.currentTimeMillis() < this.I__1) {
               this.IIlo.IIIl.IIol(I1Ol("镔镖閩锒闼閚閭閐裔阖阡阜衢雑雱隘靦觩霣", 38175));
            } else if (var1 != 5) {
               this.II_1(this.IIlI(var1));
               if (var1 == 4) {
                  this.Ilo0(4);
               } else {
                  if (var1 == 3) {
                     this.I__1 = System.currentTimeMillis() + 2000L;
                     var2._10I = 3;
                  } else {
                     var2._10I = var1;
                     if (!this.I0oI && this.Il_o()) {
                        this.loOl = var2.I1;
                        this.loO1 = var2.I1I;
                        this.I__0();
                     }
                  }

                  this.IIlo.I__O();
               }
            } else if (var2.lOlI == 1) {
               this.II_1(this.IIlI(var1));
               this.IIlo.II(new IO0o(125).II(4).IIII(var2.I1l));
               long var3 = var2.III.IO_l;
               this.I__o();
               long var5 = var2.IIIO();
               long var7 = Math.min(var3, Math.max(0L, var5 - var2.IO_l));
               var2.IO_l += var7;
               var2.IO_1 += var7;
               var2.III = null;
               var2._10I = 0;
               this.l1();
               this.IIlo.ll_0();
               this.IIlo.I__O();
            }
         }
      }
   }

   int[] IIIl() {
      IOol var1 = this.II();
      if (var1 != null && var1._10 != 0 && var1.III != null) {
         IO0l var2 = var1.II[5];
         IO0l var3 = var1.III.II[5];
         boolean var4 = !var2.II1_() && (var2.I1l == 1693 || var2.I1l == 1553);
         boolean var5 = !var3.II1_() && (var3.I1l == 1693 || var3.I1l == 1553);
         if (var4 && var5 && var2.I1l != var3.I1l) {
            return new int[]{1578, 1581, 1582};
         }

         if (var1.Ilo()) {
            return new int[]{2100, 2101, 2102};
         }

         int var6 = var1.lOlI;
         int var7;
         switch (var1._10) {
            case 4:
               var7 = var6 == 1 ? 2 : 0;
               break;
            case 5:
            case 7:
            default:
               return null;
            case 6:
               var7 = var6 == 1 ? 2 : 1;
               break;
            case 8:
               var7 = 3 + var6;
               break;
            case 9:
               var7 = 6 + var6;
         }

         return new int[]{III1[var7][0], III1[var7][1], III1[var7][2]};
      } else {
         return null;
      }
   }

   private void IloO(int var1) {
      this.IIlo.II(new IO0o(125).II(var1).IIII(this.II().I1l));
   }

   void Ilo0(int var1) {
      IOol var2 = this.II();
      long var3 = System.currentTimeMillis();
      if (!this.IoOo && var2.III != null) {
         if (var3 - this.I__O < 5000L) {
            this.IIlo.IIIl.IIol(I1Ol("镉镋锴镜闷镈閷閟阷霧袶阝隳", 38175) + (5000L - (var3 - this.I__O) + 999L) / 1000L + I1Ol("锿镙锴閞闢閚閷謗陶", 38175));
         } else {
            if (var1 == 4) {
               var2.IOo_ = var3;
               this.IIlo.II(new IO0o(-106).III(var2.lOlI == 1 ? 3901 : 3790).III(600));
            }

            var2._10 = var1;
            var2._10I = 4;
            this.III = null;
            this.l1Io();
            this.IoOO = false;
            this.I__o();
            this.IloO(var1);
            this.IIlo.ll__();
            var2.llIl = var2.Illo();
            var2._loI = var2.Il1();
            this.IIlo.ll_0();
            this.IIlo.IIIl.l1O0();
            this.IIlo.I__O();
         }
      } else {
         this.IIlo.IIIl.IIol(I1Ol("镆闔锨镜闸謝閬闘陧陞裶阝隳雑阢雐阞觩靭霘襦鞊鞿霈頧餷蚂顄飷虏飡颃頍饰餝餯螪駴駞", 38175));
      }
   }

   void l1II() {
      IOol var1 = this.II();
      if (var1._10 != 0) {
         var1._10 = 0;
         var1._10I = 1;
         this.IloO(0);
         this.IIlo.ll__();
         var1.llIl = Math.min(var1.llIl, var1.Illo());
         var1._loI = Math.min(var1._loI, var1.Il1());
         this.IIlo.ll_0();
         this.IIlo.IIIl.l1O0();
         this.I__O = System.currentTimeMillis();
         this.loOl = var1.I1 + this.IIlO.nextInt(21) - 10;
         this.loO1 = var1.I1I;
         if (this.Iol_ && this.Il_o()) {
            this.I__0();
         }

         this.IIlo.I__O();
      }
   }

   void Iloo(int var1) {
      IOol var2 = this.II();
      if (var2.III != null && var2._10 != 4) {
         if (var2._10 == 0) {
            this.Ilo0(var1 == 454 ? 6 : (var1 == 921 ? 8 : 9));
         } else {
            this.l1II();
         }
      } else {
         this.IIlo.IIIl.IIol(I1Ol("镔镖閩锒闼閚閭閐裔阖阡阜衢雑雱隘靦觩霣", 38175));
      }
   }

   void III1(long var1) {
      IOol var3 = this.II();
      if (var3 != null && var3.III != null && this.Iol_) {
         if (this.lI_0 != null && var1 >= this.I___) {
            String var4 = this.lI_0;
            this.lI_0 = null;
            if (!this.I0oI && this.Il_o()) {
               this.I__0();
            }

            this.II_1(var4);
         }

         if (var1 - this.I1_0 >= 250L) {
            this.I1_0 = var1;
            IOol var6 = var3.III;
            if (var3._10 == 4 && var1 - var3.IOo_ >= 600000L) {
               this.l1II();
            } else if (var3._10 == 0) {
               if (this.IoOo) {
                  if (var1 - this.I_O0 >= 120000L) {
                     this.Il1o();
                  }
               } else {
                  if (var6.llIl <= 0) {
                     var6.llIl = var6.Illo();
                  }

                  if (var3.IO_o == 0L) {
                     var3.IO_o = var1;
                  }

                  if (var3.IOO == 0L) {
                     var3.IOO = (30 + this.IIlO.nextInt(31)) * 60000L;
                  }

                  if (!var3.Iooo && !IIo(var3.lOlo) && var1 - var3.IO_o >= var3.IOO) {
                     var3.Iooo = true;
                  }

                  this.IIIo(var1);
                  this.l1Il();
                  if (var1 - this.I_10 > 30000L) {
                     this.I_10 = var1;
                     var6.llIl = Math.min(var6.Illo(), var6.llIl + var6.Il__());
                     var6._loI = Math.min(var6.Il1(), var6._loI + var6.Il_O());
                  }

                  if (var3._10I == 3) {
                     if (this.I0oI && var1 >= this.I__1 && !this.Il_0()) {
                        this.I__o();
                     } else {
                        if (this.Il_0() && this.I0oI && var1 - this.I__l > 5000L) {
                           this.I__l = var1;
                           this.IoO1 = !this.IoO1;
                           int[][] var5 = new int[][]{{250, 200}, {500, 452}, {250, 200}};
                           this.IIOI(var5[var3.lOlI][this.IoO1 ? 1 : 0], 336);
                           this.II_1(I1Ol("镓闞镽锘间閚閻譙陹阖阾阜陧雜隶雐靬靆雬霅鞫隻褚韈餖蚃頼顄飡蘃颯飀虞餿", 38175));
                        }

                        if (var1 < this.I__1 && this.I0oI) {
                           this.II(var1, 2);
                        }
                     }
                  } else if (!this.I0oI) {
                     if (this.Il_o()) {
                        this.loOl = var3.I1;
                        this.loO1 = var3.I1I;
                        this.I__0();
                     }
                  } else {
                     this.IIll(var1);
                     this.IIl1(var1);
                     if (!this.IoOo) {
                        if (var3.llIl > 0) {
                           switch (var3._10I) {
                              case 0:
                                 this.Ilo1(60);
                                 break;
                              case 1:
                              case 2:
                                 this.II(var1, var3._10I);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void IIIo(long var1) {
      if (var1 - this.I_1O >= 1000L) {
         this.I_1O = var1;
         IOol var3 = this.III();
         boolean var4 = false;
         int var5 = var3.IlI_();
         if (var3._l00 > var5) {
            var3._l00 = var5;
            var4 = true;
         }

         if (var3._l0o > var5) {
            var3._l0o = var5;
            var4 = true;
         }

         if (var3._lo > var3.IlIO()) {
            var3._lo = var3.IlIO();
            var4 = true;
         }

         if (var3._lol > var3.IlI0()) {
            var3._lol = var3.IlI0();
            var4 = true;
         }

         if (var3._lo1 > var3.IlIo()) {
            var3._lo1 = var3.IlIo();
            var4 = true;
         }

         for (int var6 = 0; var6 < 20; var6++) {
            long var7;
            int var9;
            switch (this.IIlO.nextInt(5)) {
               case 0:
                  var7 = var3._l00 + 1000;
                  if (var3._l00 + 20 <= var3.IlI_() && var3.IO_1 >= var7) {
                     var3.IO_1 -= var7;
                     var3._l00 += 20;
                     var4 = true;
                  }
                  continue;
               case 1:
                  var7 = var3._l0o + 1000;
                  if (var3._l0o + 20 <= var3.IlI_() && var3.IO_1 >= var7) {
                     var3.IO_1 -= var7;
                     var3._l0o += 20;
                     var4 = true;
                  }
                  continue;
               case 2:
                  var7 = var3._lo * 100L;
                  if (var3._lo + 1 <= var3.IlIO() && var3.IO_1 >= var7) {
                     var3.IO_1 -= var7;
                     var3._lo++;
                     var4 = true;
                  }
                  continue;
               case 3:
                  var7 = (var3._lol + 5) * 100000L;
                  if (var3._lol + 1 <= var3.IlI0() && var3.IO_1 >= var7) {
                     var3.IO_1 -= var7;
                     var3._lol++;
                     var4 = true;
                  }
                  continue;
               default:
                  var7 = 50000000L;
                  var9 = 0;
            }

            while (var9 < var3._lo1) {
               var7 *= 5L;
               if (var7 > 800000000000000000L) {
                  break;
               }

               var9++;
            }

            if (var3._lo1 + 1 <= var3.IlIo() && var3.IO_1 >= var7) {
               var3.IO_1 -= var7;
               var3._lo1++;
               var4 = true;
            }
         }

         if (var4) {
            var3.llIl = Math.min(var3.llIl, var3.Illo());
            var3._loI = Math.min(var3._loI, var3.Il1());
         }
      }
   }

   private int IIoo() {
      IOol var1 = this.III();
      int var2 = 0;

      for (int var3 = 0; var3 < var1.I__l.length; var3++) {
         if (var1.I__l[var3] != -1) {
            var2++;
         }
      }

      return var2;
   }

   private void l1Il() {
      IOol var1 = this.III();
      switch (this.IIoo()) {
         case 1:
            if (var1.IO_l >= 150000000L) {
               this.l1I1();
            }
            break;
         case 2:
            if (var1.IO_l >= 1500000000L) {
               this.l1I_();
            }
            break;
         case 3:
            if (var1.IO_l >= 20000000000L) {
               this.l1IO();
            }
            break;
         case 4:
            if (this.II00() >= 2 && var1.IO_l >= 40000000000L) {
               this.l1I0();
            }
      }
   }

   private void III(int var1, int var2, String var3) {
      IOol var4 = this.III();
      int var5 = IIO0(var2);
      if (var5 != -1) {
         var4.I__l[var1] = var5;
         this.IIlo.I__O();
      }
   }

   private void l1I1() {
      int[] var1 = new int[]{1, 3, 5};
      int[] var2 = new int[]{33, 33, 34};
      int var3 = this.IIlO.nextInt(100);
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < 3; var6++) {
         var4 += var2[var6];
         if (var3 < var4) {
            var5 = var6;
            break;
         }
      }

      this.III(1, var1[var5], "");
   }

   private void l1I_() {
      int[] var1 = new int[]{6, 8, 9};
      int[] var2 = new int[]{30, 40, 30};
      int var3 = this.IIlO.nextInt(100);
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < 3; var6++) {
         var4 += var2[var6];
         if (var3 < var4) {
            var5 = var6;
            break;
         }
      }

      this.III(2, var1[var5], "");
   }

   private void l1IO() {
      int var1 = this.IIlO.nextInt(100);
      this.III(3, var1 < 10 ? 13 : (var1 < 80 ? 12 : 19), "");
   }

   private void l1I0() {
      IOol var1 = this.III();
      this.III(4, var1.lOlI == 0 ? 24 : (var1.lOlI == 1 ? 26 : 25), "");
   }

   private IOoI.III III() {
      IOoI.III[] var1 = this.IIlo.IIIl.II();
      if (var1 == null) {
         return null;
      }

      int var2 = 300;
      IOoI.III var3 = null;

      for (int var4 = 0; var4 < var1.length; var4++) {
         IOoI.III var5 = var1[var4];
         if (!var5.IoOo && var5.III == null && var5.l0o1 != 117) {
            int var6 = this.III1(this.loOl, this.loO1, var5.I1, var5.I1I);
            if (var6 <= var2) {
               var2 = var6;
               var3 = var5;
            }
         }
      }

      return var3;
   }

   private IOO.IIIO II(int var1) {
      IOol var2 = this.III();
      return var1 >= 0 && var1 < var2.I__l.length && var2.I__l[var1] != -1 ? IOO.II(var2.I__l[var1]) : null;
   }

   private int II(IOO.IIIO var1) {
      IOol var2 = this.III();
      return var1.loII == 0 ? var1.loI : (var1.loII == 1 ? Math.max(1, var2.Il1() * var1.loI / 100) : var2._loI);
   }

   private boolean II(int var1, IOO.IIIO var2, long var3) {
      int var5 = var1 == 1 ? 1000 : var2.loIl;
      return var3 - this.IIIo[var1] >= var5;
   }

   private void II(int var1, IOO.IIIO var2, IOoI.III var3, long var4) {
      IOol var6 = this.III();
      this.IIIo[var1] = var4;
      var6._loI = var6._loI - this.II(var2);
      if (var6._loI < 0) {
         var6._loI = 0;
      }

      if (var2.lO0I == 9) {
         var6.llIl = Math.max(1, var6.llIl - var6.Illo() / 10);
      }

      int var7 = var6.Il1I() * var2.lo / 100;
      if (this.II().IlI0(522)) {
         var7 *= 2;
      }

      var7 += var7 * (this.IIlO.nextInt(21) - 10) / 100;
      var7 = var6.IIoI(var7);
      boolean var8 = this.IIlO.nextInt(100) < var6.Il1l();
      if (var8) {
         var7 *= 2;
         var7 += var7 * var6.Il11() / 100;
      }

      if (var7 < 1) {
         var7 = 1;
      }

      if (++var6._1II >= (this.II().IlI0(522) ? 5 : 2)) {
         var6._1II = 0;
         if (var6._l0_ > 0) {
            var6._l0_--;
         }
      }

      this.III(var3._l_1, var4);
      this.IIlo.II(new IO0o(54).IIII(this.IIoO()).II(var2.I1l & 0xFF).II(var3._l_1));
      this.IIlo.IIIl.II(var3._l_1, var7, var8, var6);
   }

   private void III(int var1, long var2) {
      if (this.IIl.length <= var1) {
         this.IIl = II(this.IIl, var1 + 1);
         this.IIlI = II(this.IIlI, var1 + 1);
      }

      this.IIl[var1] = var2;
   }

   private static long[] II(long[] var0, int var1) {
      long[] var2 = new long[Math.max(var1, 64)];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      return var2;
   }

   private void II(long var1, int var3) {
      IOol var4 = this.II();
      IOol var5 = this.III();
      if (var4.Iooo && !var4.IlI0(522)) {
         if (var1 - this.I__0 >= 10000L) {
            this.I__0 = var1;
            this.II_1(this.II00() == 4 ? I1Ol("镌镟锲镜闵闝鑩鑙陾阖阾阜陧雜隶雐阞韏霣霄鞫隻鞠韗", 38175) : I1Ol("镌镟锲镜门鐊闹閈陿裓陵队電陆隿隗霯阿鞬霂韣鞊雘鞁頸", 38175));
         }
      } else if (var5._l0_ <= 0) {
         this.IIlO(var1);
      } else if (!this.III1(var1) && !this.III_(var1) && !this.IIIl(var1)) {
         if (this.IIII != null) {
            if (this.IIlo.IIIl.II.III(this.IIII)) {
               this.II(var1, var3, this.IIII);
               return;
            }

            this.IIII = null;
         }

         IOoI.III var6 = this.III();
         this.III = var6;
         if (var6 != null && this.II00() == 4) {
            this.IIl(var1);
         }

         if (var6 == null) {
            this.IoOl = true;
            if (var1 - this.I__ > this.I__I) {
               int var15 = this.loOl - var4.I1 <= 0 ? -1 : 1;
               this.IIOI(var4.I1 + (var15 == -1 ? 50 : -50), var4.I1I);
               this.I__ = var1;
               this.I__I = 5000 + this.IIlO.nextInt(3000);
               this.IoOl = false;
            }
         } else {
            int var7 = this.III1(this.loOl, this.loO1, var6.I1, var6.I1I);
            int var8 = var3 == 1 ? 60 : 20;
            IOO.IIIO var9 = this.II(0);
            IOO.IIIO var10 = this.II(1);
            IOO.IIIO var11 = this.II(2);
            if (var11 != null && var11.lO0I == 9 && this.II(2, var11, var1) && this.II(var11) <= var5._loI && var5.llIl > var5.Illo() / 5) {
               this.IIOI(var6.I1 + this.IIlO.nextInt(41) - 20, var6.I1I);
               this.II(2, var11, var6, var1);
            } else {
               boolean var12 = var7 > 50 && var10 != null;
               IOO.IIIO var13 = var12 ? var10 : var9;
               int var14 = var12 ? 1 : 0;
               if (var13 != null && this.II(var14, var13, var1)) {
                  if (this.II(var13) > var5._loI) {
                     this.IIlO(var1);
                  } else {
                     if (!var12) {
                        this.IIOI(var6.I1 + this.IIlO.nextInt(var8 * 2 + 1) - var8, var6.I1I);
                     }

                     this.II(var14, var13, var6, var1);
                  }
               }
            }
         }
      }
   }

   private void II(long var1, int var3, IO_I.III var4) {
      IOol var5 = this.III();
      int var6 = this.III1(this.loOl, this.loO1, var4.I1, var4.I1I);
      int var7 = var3 == 1 ? 60 : 20;
      IOO.IIIO var8 = this.II(0);
      IOO.IIIO var9 = this.II(1);
      IOO.IIIO var10 = this.II(2);
      if (var10 != null && var10.lO0I == 9 && this.II(2, var10, var1) && this.II(var10) <= var5._loI && var5.llIl > var5.Illo() / 5) {
         this.IIOI(var4.I1 + this.IIlO.nextInt(41) - 20, var4.I1I);
         this.II(2, var10, var4, var1);
      } else {
         boolean var11 = var6 > 50 && var9 != null;
         IOO.IIIO var12 = var11 ? var9 : var8;
         int var13 = var11 ? 1 : 0;
         if (var12 != null && this.II(var13, var12, var1)) {
            if (this.II(var12) > var5._loI) {
               this.IIlO(var1);
            } else {
               if (!var11) {
                  this.IIOI(var4.I1 + this.IIlO.nextInt(var7 * 2 + 1) - var7, var4.I1I);
               }

               this.II(var13, var12, var4, var1);
            }
         }
      }
   }

   private void II(int var1, IOO.IIIO var2, IO_I.III var3, long var4) {
      IOol var6 = this.III();
      this.IIIo[var1] = var4;
      var6._loI = var6._loI - this.II(var2);
      if (var6._loI < 0) {
         var6._loI = 0;
      }

      if (var2.lO0I == 9) {
         var6.llIl = Math.max(1, var6.llIl - var6.Illo() / 10);
      }

      int var7 = var6.Il1I() * var2.lo / 100;
      if (this.II().IlI0(522)) {
         var7 *= 2;
      }

      var7 += var7 * (this.IIlO.nextInt(21) - 10) / 100;
      boolean var8 = this.IIlO.nextInt(100) < var6.Il1l();
      if (var8) {
         var7 *= 2;
         var7 += var7 * var6.Il11() / 100;
      }

      if (var7 < 1) {
         var7 = 1;
      }

      if (++var6._1II >= (this.II().IlI0(522) ? 5 : 2)) {
         var6._1II = 0;
         if (var6._l0_ > 0) {
            var6._l0_--;
         }
      }

      this.IIlo.IIIl.II.II(var3, var7, var8, var2, this.IIoO());
   }

   private void IIl(long var1) {
      if (var1 - this.I__o >= (this._IO_ == 0 ? 15000 : 1500)) {
         this.I__o = var1;
         this.IIlo.II(new IO0o(44).IIII(this.IIoO()).II(IlO0[this._IO_]));
         this._IO_ = (this._IO_ + 1) % IlO0.length;
      }
   }

   private boolean IIIl(long var1) {
      IOol var3 = this.III();
      if (!this.IoO_) {
         IOO.IIIO var12 = this.II(4);
         if (var12 != null && this.II(4, var12, var1) && this.II(var12) <= var3._loI) {
            IOoI.III var13 = this.III();
            if (var13 == null) {
               return false;
            }

            this.IIIo[4] = var1;
            var3._loI = var3._loI - this.II(var12);
            this.II = var12;
            this._IO0 = this.loOl > var13.I1 ? -1 : 1;
            this._IOo = this.loOl;
            this._I0 = this.loO1;
            this._I0I = 300 + var12.l1__ * 40;
            this.I_O = var1 + 2000L;
            this.IoO_ = true;
            int var14 = var12.lO0I == 24 ? 1 : (var12.lO0I == 25 ? 2 : 3);
            this.IIlo.II(new IO0o(-45).II(20).IIII(this.IIoO()).III(var12.lO0I).II(var14).II(this._IO0).III(2000).II(0).II(0).II(-1));
            return true;
         } else {
            return false;
         }
      } else {
         if (var1 < this.I_O) {
            return true;
         }

         this.IoO_ = false;
         IOO.IIIO var4 = this.II;
         Vector var5 = new Vector();
         IOoI.III[] var6 = this.IIlo.IIIl.II();

         for (int var7 = 0; var6 != null && var7 < var6.length; var7++) {
            IOoI.III var8 = var6[var7];
            if (!var8.IoOo && var8.III == null && var8.l0o1 != 117) {
               boolean var9 = this._IO0 < 0 ? var8.I1 < this._IOo : var8.I1 > this._IOo;
               if (var9 && Math.abs(var8.I1 - this._IOo) <= this._I0I && Math.abs(var8.I1I - this._I0) <= 120) {
                  var5.addElement(var8);
               }
            }
         }

         int var15 = this._IOo + (this._IO0 < 0 ? -this._I0I : this._I0I);
         IO0o var16 = new IO0o(-45).II(21).IIII(this.IIoO()).III(var4.lO0I).III(var15).III(this._I0).III(2000).III(120).II(0).II(var5.size());

         for (int var17 = 0; var17 < var5.size(); var17++) {
            var16.II(0).II(((IOoI.III)var5.elementAt(var17))._l_1);
         }

         var16.II(-1);
         this.IIlo.II(var16);
         if (var4.lO0I != 26) {
            for (int var18 = 0; var18 < var5.size(); var18++) {
               IOoI.III var10 = (IOoI.III)var5.elementAt(var18);
               int var11 = var3.IIoI(var3.Il1I() * Math.max(100, var4.lo) / 100);
               if (var11 < 1) {
                  var11 = 1;
               }

               this.III(var10._l_1, var1);
               this.IIlo.IIIl.II(var10._l_1, var11, false, var3);
            }
         } else {
            for (int var19 = 0; var19 < var5.size(); var19++) {
               IOoI.III var20 = (IOoI.III)var5.elementAt(var19);
               int var21 = var3.IIoI(var3.Il1I() * Math.max(100, var4.lo) / 100);
               this.III(var20._l_1, var1);
               this.IIlo.IIIl.II(var20._l_1, Math.max(1, var21), false, var3);
            }
         }

         return true;
      }
   }

   private boolean III1(long var1) {
      IOol var3 = this.III();
      IOO.IIIO var4 = this.II(2);
      if (var4 == null) {
         return false;
      }

      if (var4.lO0I == 6) {
         if (this.II(2, var4, var1) && this.II(var4) <= var3._loI) {
            int var13 = 120 + var4.l1__ * 30;
            int var6 = var4.l1__ + 2;
            Vector var7 = new Vector();
            IOoI.III[] var8 = this.IIlo.IIIl.II();

            for (int var9 = 0; var9 < var8.length; var9++) {
               IOoI.III var10 = var8[var9];
               if (!var10.IoOo && var10.III == null && Math.abs(var10.I1 - this.loOl) <= var13 && Math.abs(var10.I1I - this.loO1) <= var13) {
                  var7.addElement(var10);
               }
            }

            if (var7.size() == 0) {
               return false;
            }

            this.IIIo[2] = var1;
            var3._loI = var3._loI - this.II(var4);
            IO0o var14 = new IO0o(-45).II(0).IIII(this.IIoO()).III(var4.I1l).II(var7.size());

            for (int var15 = 0; var15 < var7.size(); var15++) {
               IOoI.III var11 = (IOoI.III)var7.elementAt(var15);
               var11.I110 = var1 + var6 * 1000L;
               var14.II(var11._l_1).II(var6);
            }

            var14.II(0);
            this.IIlo.II(var14);
            this.II_1(I1Ol("镝讛锩镜闵闝謄闘陴陞韥阕隳陆隿隗霯靉霤鞌", 38175));
            return true;
         } else {
            return false;
         }
      } else {
         if (var4.lO0I == 8) {
            if (this.IoOO) {
               if (var1 >= this.I_OI) {
                  this.I_OI = var1 + 1000L;
                  int var12 = var4.l1__ + 3;
                  var3.llIl = Math.min(var3.Illo(), var3.llIl + var3.Illo() / 100 * var12);
                  var3._loI = Math.min(var3.Il1(), var3._loI + var3.Il1() / 100 * var12);
                  if (++this._I0l >= 3 + this.IIlO.nextInt(3) || var3.llIl >= var3.Illo() && var3._loI >= var3.Il1()) {
                     this.IoOO = false;
                     this.IIlo.II(new IO0o(-45).II(3).IIII(this.IIoO()).III(-1));
                  }
               }

               return true;
            }

            boolean var5 = var3.llIl * 100 / Math.max(1, var3.Illo()) <= 20 || var3._loI * 100 / Math.max(1, var3.Il1()) <= 20;
            if (var5 && this.II(2, var4, var1) && this.II(var4) <= var3._loI) {
               this.IIIo[2] = var1;
               var3._loI = var3._loI - this.II(var4);
               this.IoOO = true;
               this._I0l = 0;
               this.I_OI = var1 + 1000L;
               this.IIlo.II(new IO0o(-45).II(1).IIII(this.IIoO()).III(var4.I1l));
               return true;
            }
         }

         return false;
      }
   }

   private boolean III_(long var1) {
      IOol var3 = this.III();
      IOO.IIIO var4 = this.II(3);
      if (var4 == null) {
         return false;
      }

      if (var4.lO0I == 13) {
         if (var3._lo_ <= 0 && this.II(3, var4, var1) && this.II(var4) <= var3._loI) {
            this.IIIo[3] = var1;
            var3._loI = var3._loI - this.II(var4);
            var3._lo_ = Math.max(1, var4.l1__);
            this.I_Ol = var1 + (var3._lo_ + 5) * 10000L;
            this.IIlo.II(new IO0o(-45).II(6).IIII(this.IIoO()).III(var4.I1l));
            var3.llIl = Math.min(var3.Illo(), var3.llIl * 2);
            this.l1I();
            return true;
         } else {
            return false;
         }
      } else if (var4.lO0I == 19) {
         if (!var3.Ioo0 && this.II(3, var4, var1) && this.II(var4) <= var3._loI) {
            this.IIIo[3] = var1;
            var3._loI = var3._loI - this.II(var4);
            var3.Ioo0 = true;
            this.I_O1 = var1 + (var4.l1__ + 2) * 5000L;
            this.IIlo.II(new IO0o(-124).II(1).II(0).II(33).IIII(this.IIoO()).IIII(this.IIoO()));
            return true;
         } else {
            return false;
         }
      } else if (var4.lO0I == 12) {
         if (!this.IoO0 && this.II(3, var4, var1) && this.II(var4) <= var3._loI) {
            this.IIIo[3] = var1;
            var3._loI = var3._loI - this.II(var4);
            int var5 = Math.max(1, Math.min(8, var4.l1__));
            int var6 = new int[]{8, 11, 32, 25, 43, 49, 50, 96}[var5 - 1];
            this._I01 = (int)((long)var3.Illo() * new int[]{30, 40, 50, 60, 70, 80, 90, 100}[var5 - 1] / 100L);
            this.IoO0 = true;
            this.I_O_ = var1 + (var5 + 5) * 20000L;
            this.I_OO = var1 + 2500L;
            this.IIlo.II(new IO0o(-95).II(0).IIII(this.IIoO()).III(var6).IIII(this._I01));
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void l1Io() {
      if (this.IoO0) {
         this.IoO0 = false;
         this.IIlo.II(new IO0o(-95).II(6).IIII(this.IIoO()));
         this.IIlo.II(new IO0o(-95).II(7).IIII(this.IIoO()));
      }
   }

   private void IIlI(long var1) {
      if (this.IoO0) {
         if (var1 < this.I_O_ && this.I0oI) {
            if (var1 >= this.I_OO) {
               this.I_OO = var1 + 2500L;
               IOoI.III[] var3 = this.IIlo.IIIl.II();
               int var4 = -1;
               int var5 = 1073741824;

               for (int var6 = 0; var6 < var3.length; var6++) {
                  IOoI.III var7 = var3[var6];
                  if (!var7.IoOo && var7.l0o1 != 0 && var7.III == null && var7.l0o1 != 117) {
                     int var8 = Math.abs(var7.I1 - this.loOl) + Math.abs(var7.I1I - this.loO1) * 2;
                     if (Math.abs(var7.I1 - this.loOl) <= 300 && Math.abs(var7.I1I - this.loO1) <= 160 && var8 < var5) {
                        var5 = var8;
                        var4 = var6;
                     }
                  }
               }

               if (var4 >= 0) {
                  this.IIlo.II(new IO0o(-95).II(1).IIII(this.IIoO()).II(var4));
                  this.III(var4, var1);
                  this.IIlo.IIIl.II(var4, Math.max(1, this.III().Il1I()), false, this.III());
               }
            }
         } else {
            this.l1Io();
         }
      }
   }

   private void IIll(long var1) {
      IOol var3 = this.III();
      if (var3._lo_ > 0 && var1 >= this.I_Ol) {
         var3._lo_ = 0;
         var3.llIl = Math.min(var3.llIl, var3.Illo());
         this.IIlo.II(new IO0o(-90).II(-1).IIII(this.IIoO()));
         this.l1I();
      }

      if (var3.Ioo0 && var1 >= this.I_O1) {
         var3.Ioo0 = false;
      }

      this.IIlI(var1);
   }

   private void IIl1(long var1) {
      IOol var3 = this.III();
      IOoI.III[] var4 = this.IIlo.IIIl.II();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            IOoI.III var6 = var4[var5];
            if (!var6.IoOo
               && var6.III == null
               && var6.l0o1 != 0
               && var6.l0o1 != 117
               && var1 >= var6.I110
               && var5 < this.IIl.length
               && var1 - this.IIl[var5] <= 6000L
               && var1 - this.IIlI[var5] >= 2000L
               && Math.abs(var6.I1 - this.loOl) <= 300
               && Math.abs(var6.I1I - this.loO1) <= 200) {
               this.IIlI[var5] = var1;
               if (this.IIlO.nextInt(2) != 0) {
                  int var7 = var6._l_O > 0 ? var6._l_O : var6._l__ * (var6.II == null ? 5 : var6.II.l0o) / 100;
                  if (var6.IooO) {
                     var7 *= 2;
                  }

                  if (this.II().IlI0(522)) {
                     var7 /= 2;
                  }

                  if (this.IIlO.nextInt(100) < var3.Il10()) {
                     var7 = 0;
                  } else {
                     var7 -= var7 / 100 * var3.Il1O();
                     var7 -= var3.Il1_();
                     if (var7 < 1) {
                        var7 = 1;
                     }

                     if (var3.Ioo0) {
                        var7 = 1;
                     }

                     if (var7 > var3.Illo() * 35 / 100) {
                        var7 = Math.max(1, var3.Illo() * 35 / 100);
                     }
                  }

                  var3.llIl -= var7;
                  if (var3.llIl < 0) {
                     var3.llIl = 0;
                  }

                  this.IIlo.II(new IO0o(-10).II(var6._l_1).IIII(this.IIoO()).IIII(var3.llIl).IIII(var3._loI));
                  int var8 = var3.Il1o();
                  if (var8 > 0 && var8 > 0 && !var6.IoOo) {
                     int var9 = PSTPatch.monster(var6, var7, var8);
                     if (var9 >= var6.llIl) {
                        var9 = var6.llIl - 1;
                     }

                     if (var9 > 0) {
                        var6.llIl -= var9;
                        this.IIlo.II(new IO0o(-9).II(var6._l_1).IIII(var6.llIl).IIII(var9).II(false).II(36));
                     }
                  }

                  if (var3.llIl <= 0) {
                     this.IIl_(var1);
                     return;
                  }
               }
            }
         }
      }
   }

   private void IIl_(long var1) {
      this.IoOo = true;
      this.I_O0 = var1;
      this.III = null;
      this.IoOO = false;
      this.l1Io();
      this.III()._lo_ = 0;
      this.III().Ioo0 = false;
      this.I__o();
      this.IIlo.IIIl.IIol(I1Ol("鐏诹镽锈譶閚铈锛阷陔袞陔鞂陓隿隘霯靌觬霅鞧鞊鞺襕頧顎蚖頍颣飑風颎颗餾饎餽餎馺馋駸馇驾髏騠", 38175));
   }

   private void Il1o() {
      IOol var1 = this.III();
      this.IoOo = false;
      var1.llIl = var1.Illo();
      var1._loI = var1.Il1();
      IOol var2 = this.II();
      this.loOl = var2.I1 + this.IIlO.nextInt(21) - 10;
      this.loO1 = var2.I1I;
      if (this.Il_o()) {
         this.I__0();
         this.II_1(I1Ol("镌钎镽锌闳譟闹鑙陾阖阶阛雽隒韀阒靶霎霣鞄", 38175));
      }
   }

   private void IIlO(long var1) {
      if (var1 - this.I_1o >= 10000L) {
         this.I_1o = var1;
         this.II_1(I1Ol("镌钎镽锌闳譟闹鑙陾阖阶阜雼隒隲隟靡霎陜见韾鞊鞽鞀蚠顈", 38175));
         this.IIlo.IIIl.l1O_();
      }
   }

   void IIOl(int var1, int var2) {
      IOol var3 = this.II();
      if (var3 != null && var3.III != null && this.I0oI) {
         IOol var4 = var3.III;
         var4._l0_ = Math.min(var4._l0O, var4._l0_ + 100 * var2);
         var4.llIl = Math.min(var4.Illo(), var4.llIl + var1);
         var4._loI = Math.min(var4.Il1(), var4._loI + var1);
         this.II_1(I1Ol("镜闟锰镜鐺闔闹開鞧阖阥阜衶", 38175));
      }
   }

   void IIl0(long var1) {
      IOol var3 = this.II();
      IOol var4 = this.III();
      if (var4 != null) {
         if (var4.IO_l < var4.IIIO()) {
            if (var3.IlI0(522)) {
               var1 *= 2L;
            }

            int var5 = var3.IIo(160);
            if (var5 > 0) {
               var1 += var1 * var5 / 100L;
            }

            var1 = var4.III0(var1);
            if (var4.IO_l >= 60000000000L) {
               var1 -= var1 * 80L / 100L;
            }

            if (var1 > 0L) {
               var4.IO_l += var1;
               var4.IO_1 += var1;
               long var6 = var3.III_((long)(var1 * 0.5));
               long var8 = var3.IIIO();
               if (var3.IO_l < var8) {
                  if (var3.IO_l + var6 > var8) {
                     var6 = var8 - var3.IO_l;
                  }

                  var3.IO_l += var6;
                  var3.IO_1 += var6;
                  long var10 = var6 + this.IIlo.IIIl.III1(var6);
                  if (var10 > 0L) {
                     this.IIlo.II(new IO0o(-3).II(2).IIII((int)Math.min(2147483647L, var10)));
                  }

                  this.IIlo.IIIl.l100();
               }
            }
         }
      }
   }

   private static String II(IOol var0) {
      String[] var1 = new String[]{I1Ol("镋镌閼锕閻钪譼閌", 38175), I1Ol("镑镟锰诃闸", 38175), I1Ol("镇镟锤锘闺", 38175)};
      String var2 = var1[var0.lOlI];
      String var3 = var0.lOlI == 0 ? I1Ol("镱镖閿锒", 38175) : var2;
      String[] var4 = new String[]{
         I1Ol("镋關锳镜闯闒謾", 38175),
         I1Ol("镋讓锭镜门譋闹開鞶阖阶裑難", 38175),
         I1Ol("镋讓锭镜门譋闹閌陥陃阻阓隳雑衴隀", 38175),
         I1Ol("镋讓锭镜门譋闹閛陶陙陵阗蠶雂", 38175),
         I1Ol("镋關锳镜闹闓閷閐", 38175),
         I1Ol("镜镖锴诃闵閚閻閑陹陞", 38175),
         I1Ol("镜镖锴诃闵閚閻閑陹陞陵阗雲雝雱隓親非", 38175),
         I1Ol("镉诹镽锞闲闔閱", 38175),
         I1Ol("镉诹镽锞闲闔閱闘陿陙隵阚雴隒隶隙靮", 38175),
         I1Ol("镌镗閷锉閻", 38175) + var3 + I1Ol("锿镝诸锌閻開", 38175),
         I1Ol("镌镗閷锉閻", 38175) + var3 + I1Ol("锿镝诸锌閻閈", 38175),
         I1Ol("镌镗閷锉閻", 38175) + var3 + I1Ol("锿镝诸锌閻閉", 38175),
         I1Ol("镌镗閷锉閻", 38175) + var3 + I1Ol("锿镝诸锌閻閎", 38175),
         I1Ol("镋镖诺锒閻", 38175) + var2 + I1Ol("锿镝诸锌閻開", 38175),
         I1Ol("镋镖诺锒閻", 38175) + var2 + I1Ol("锿镝诸锌閻閈", 38175),
         I1Ol("镋镖诺锒閻", 38175) + var2 + I1Ol("锿镝诸锌閻閉", 38175),
         I1Ol("镘镗讆锕閻闬鑩鑙陹陑陵阠電蠕隿雐靬見霽靌鞺", 38175),
         I1Ol("镘镗讆锕閻闬鑩鑙陹陑陵阠電蠕隿雐靬見霽靌鞹", 38175),
         I1Ol("镘镗讆锕閻闬鑩鑙陹陑陵阠電蠕隿雐靬見霽靌鞸", 38175),
         I1Ol("镋镖锴閖闵閚铈譙陸", 38175),
         I1Ol("镴讅镽锔铲闃闹閜陾裱阡陔雥韛雱隄靽觋", 38175),
         I1Ol("镩闊镽鑭譐闙閱闘霆陗陵阓雺衩隸", 38175)
      };
      int var5 = var0.II0o();
      return var4[Math.min(var5, var4.length - 1)];
   }

   void ll_() {
      IOol var1 = this.II();
      IOol var2 = this.III();
      if (var1 != null && var2 != null) {
         int var3 = this.II00() >= 2 ? 9 : 7;
         IO0o var4 = new IO0o(-107).II(2).III(this.IIo0()).II(var3);

         for (int var5 = 0; var5 < var3; var5++) {
            IO0l var6 = var2.II[var5];
            if (var6.II1_()) {
               var4.III(-1);
            } else {
               var4.III(var6.I1l).IIII(var6.lo0I).II("").II("");
               if (var6.IIl.size() == 0) {
                  var4.II(1).II(73).III(0);
               } else {
                  var4.II(var6.IIl.size());

                  for (int var7 = 0; var7 < var6.IIl.size(); var7++) {
                     int[] var8 = (int[])var6.IIl.elementAt(var7);
                     var4.II(var8[0]).III(var8[1]);
                  }
               }
            }
         }

         var4.IIII(var2.llIl).IIII(var2.Illo()).IIII(var2._loI).IIII(var2.Il1()).IIII(var2.Il1I()).II(var2.II1o).II(II(var2)).II(var2.IO_l).II(var2.IO_1);
         var4.II(var1._10I).III(var2._l0_).III(var2._l0O).II(var2.Il1l()).III(var2.Il1_());
         int var9 = this.II00() >= 2 ? 5 : 4;
         var4.II(var9);
         String[] var10 = new String[]{
            "",
            I1Ol("镜讙锳镜钊講閭闘除裟阶陔雾蠓隿隘霯霟靸靜響韘韩雹蛄順頨蚻", 38175),
            I1Ol("镜讙锳镜钊講閭闘除裟阶陔雾蠓隿隘霯霟霹覛鞾鞊雘褫頧顋蚚", 38175),
            I1Ol("镜讙锳镜钊講閭闘除裟阶陔雾蠓隿隘霯霜靽霘襼鞊雘褫頧顋蚚", 38175),
            I1Ol("镜讙锳镜钊講閭闘除裟阶陔雾蠓隿隘霯霚靽霘襼鞊雘褫頧顋蚚", 38175)
         };

         for (int var11 = 0; var11 < var9; var11++) {
            if (var2.I__l[var11] != -1) {
               var4.III(var2.I__l[var11]);
            } else {
               var4.III(-1).II(var10[var11]);
            }
         }

         this.IIlo.II(var4);
      }
   }

   private IO0l II(IOol var1, IO0l var2) {
      IOO.III var3 = IOO.II(var2.I1l);
      if (var3 == null) {
         return var2;
      }

      switch (var3.IoI_) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 11:
         case 23:
         case 24:
         case 25:
         case 27:
         case 32:
            if (var3.lOlI < 3 && var3.lOlI != var1.lOlI) {
               this.IIlo.IIIl.II0o(I1Ol("镋镌锼锒闼閚閻謳阷陝阽隀雽雕雱隀靧韗靭霄襨韚韨", 38175));
               return var2;
            } else {
               if (var2.I1l != 691 && var2.I1l != 692 && var2.I1l != 693 || var1.II[0].II1_() && var1.II[5].II1_()) {
                  long var4 = var3.I101;

                  for (int var6 = 0; var6 < var2.IIl.size(); var6++) {
                     int[] var7 = (int[])var2.IIl.elementAt(var6);
                     if (var7[0] == 21) {
                        var4 = var7[1] * 1000000000L;
                        break;
                     }
                  }

                  if (var1.IO_l < var4) {
                     this.IIlo.IIIl.II0o(I1Ol("镌诗锾镜闶講閷閐阷陝阽隀雽雕雱韡觨霎霴鞆韾鞊鞪襏顲頇", 38175));
                     return var2;
                  }

                  if (var2.I1l != 544 && var2.I1l != 545 && var2.I1l != 546) {
                     this.IIlo.IIIl.III(var2);
                     this.IIlo.IIIl.IIII(var2);
                     int var8;
                     switch (var3.IoI_) {
                        case 11:
                        case 25:
                           if (this.II00() < 2) {
                              this.IIlo.IIIl.II0o(I1Ol("镜镖讔镜钊譽闹閌裺阖阣阝難隒隼蠫靦霎霾要鞫韎褬鞆顠順饔駔虠飁飡颖虒饪餝餬餓蜳駔駸香髶驌驵", 38175));
                              return var2;
                           }

                           var8 = var3.IoI_ == 11 ? 7 : 8;
                           break;
                        case 23:
                        case 24:
                        case 27:
                           this.IIlo.IIIl.II0o(I1Ol("鐏诹镽锈譶閚閲閐難陘防陔雧雚蠒雐靼觃靭霈襮韄鞮韈顱蚋頱顄飳飊虨颍食饰駝餥饚", 38175));
                           return var2;
                        case 32:
                           var8 = 6;
                           break;
                        default:
                           var8 = var3.IoI_;
                     }

                     IO0l var9 = var1.II[var8];
                     var1.II[var8] = var2;
                     return var9;
                  }

                  this.IIlo.IIIl.II0o(I1Ol("鐏诹镽锈譶閚閲閐難陘防陔雧雚蠒雐靼觃靭霈襮韄鞮韈顤蚅頬顄飷飐颠颎题餾饓馼餂馻", 38175));
                  return var2;
               }

               this.IIlo.IIIl.II0o(I1Ol("镉镋锴镜闷镈閷閟阷陕袊阝隳陓难雐阞觭靭霏靸鞊鞽鞀蛄順頶蚉颣飆蘤颎题餾饌餩蟜駴香飉馞騶驗騽蒰髼", 38175));
               return var2;
            }
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 26:
         case 28:
         case 29:
         case 30:
         case 31:
         default:
            this.IIlo.IIIl.II0o(I1Ol("镋镌锼锒闼閚閻謳阷陝阽隀雽雕雱隀靧韗靭霄襨韚韨韙", 38175));
            return var2;
      }
   }

   void I1(int var1) {
      IOol var2 = this.II();
      IOol var3 = this.III();
      if (var3 == null || var3.IO_l < 1500000L) {
         this.IIlo.IIIl.IIol(I1Ol("鐏诹镽锈譶閚閩閐袴陟陵靥蠲集雱雁靻靜靸靌韸襃鞪韈顪蚇頫頌颣飏蘚颉食饽駎饼餏駲蝺駸馚蒡驖", 38175));
      } else if (var1 >= 0 && var1 < var2.III.length) {
         IO0l var4 = var2.III[var1];
         if (!var4.II1_()) {
            IO0l var5 = this.II(var3, var4);
            var2.III[var1] = var5;
            this.II1_(var5 != var4);
         }
      }
   }

   void I1I(int var1) {
      IOol var2 = this.II();
      IOol var3 = this.III();
      if (var3 != null && var1 >= 0 && var1 < (this.II00() >= 2 ? 9 : 7)) {
         IO0l var4 = var3.II[var1];
         if (!var4.II1_()) {
            if (!this.IIlo.IIIl.III0(var4)) {
               this.IIlo.IIIl.IIol(I1Ol("镗闞锳锔閻闎閫閙陹陑陵队電陆隿隗霯靍鞿霂鞫韉鞡褿頧顒頷蚵飭飅", 38175));
            } else {
               var3.II[var1] = new IO0l();
               this.II1_(true);
            }
         }
      }
   }

   private void II1_(boolean var1) {
      IOol var2 = this.III();
      this.IIlo.IIIl.l1_l();
      this.IIlo.IIIl.l1_1();
      if (var1) {
         var2.llIl = Math.min(var2.llIl, var2.Illo());
         var2._loI = Math.min(var2._loI, var2.Il1());
         this.IIlo.ll_0();
         this.ll_();
      }

      this.l1I();
      this.IIlo.I__O();
   }

   private static boolean II(IO0l var0, int var1, int var2) {
      for (int var3 = 0; var3 < var0.IIl.size(); var3++) {
         int[] var4 = (int[])var0.IIl.elementAt(var3);
         if (var4[0] == var1 && var4[1] >= var2) {
            return true;
         }
      }

      return false;
   }

   boolean II(int var1, IO0l var2) {
      IOol var3 = this.II();
      switch (var2.I1l) {
         case 400:
            if (var3.III == null) {
               this.IIlo.IIIl.IIol(I1Ol("镝讟锳镜闸闒鑩閙阷陕隦陔鞂衵雱隄觢", 38175));
               return true;
            }

            this.Io0I = true;
            this.IIlo.II(new IO0o(-125).II(I1Ol("鐏讉锩镜闯镐閷闘陴陞阺陔鞂衵雱隄觢", 38175)).II(1).II(I1Ol("镋闔锳镜闶譡閰闘阿陂袄阝隳鞣隰雐霾霞靭震靶鞊鞽褙頮", 38175)).II(1));
            return true;
         case 401:
            if (var3.III == null) {
               this.IIlo.IIIl.IIol(I1Ol("镔镖閩锒闼閚閭閐裔阖阡阜衢雑雱隘靦觩霣", 38175));
               return true;
            }

            this.IIlo.IIIl.IIOo(var1, 1);
            this.IIIO(0, (var3.III.lOlI + 1) % 3, var3.III._11_);
            return true;
         case 402:
         case 403:
         case 404:
         case 759:
            if (var3.III == null) {
               this.IIlo.IIIl.IIol(I1Ol("镔镖閩锒闼閚閭閐裔阖阡阜衢雑雱隘靦觩霣", 38175));
               return true;
            } else {
               int var7 = var2.I1l == 759 ? 3 : var2.I1l - 402;
               IOO.IIIO var5 = this.II(var7);
               IOO.IIIO var6 = var5 != null && var5.l1__ + 1 <= 7 ? IOO.II(var5.lO0I, var5.l1__ + 1) : null;
               if (var6 == null) {
                  this.IIlo.IIIl.IIol(I1Ol("镔镖閩锒闼閚閭閐裔阖阡阜衢雑雱隘靦觩霣", 38175));
                  return true;
               } else {
                  var3.III.I__l[var7] = var6.I1l;
                  this.II_1(I1Ol("镜闟锰镜鐺闔闹開鞧阖阥阜衶", 38175));
                  this.IIlo.IIIl.IIOo(var1, 1);
                  this.IIlo.I__O();
                  return true;
               }
            }
         case 568:
            if (var3.lIII) {
               this.IIlo.IIIl.IIol(I1Ol("镝讟锳镜钊镙闹閛雤阖阤阁蠰隒隥隂触靀霪靌韥靀鞧韈顬顎颱頊飤颂颵颈蘼餾饎螱饛駾蝜馶馐", 38175));
               return true;
            }

            var3.lIII = true;
            var3.IOoO = System.currentTimeMillis();
            var3.IOo0 = 432000000L;
            this.IIlo.IIIl.IIOo(var1, 1);
            this.l1l();
            return true;
         case 1758:
         case 1759:
         case 1760:
            if (var3.III == null) {
               this.IIlo.IIIl.IIol(I1Ol("镑镙铭铝闲閚閵锘険阖防隘隳雑阢雐阞觩靭霘襦鞕", 38175));
               return true;
            } else {
               int var4 = var2.I1l - 1757;
               if (var3.III.I__l[var4] == -1) {
                  this.IIlo.IIIl.IIol(I1Ol("闒镊镽锒闳謟閭闘霆裱陵阀衾隒隿隗隿随霤靌韻韂襪鞁頧顅颶顄飠飊風頊颊餾", 38175) + (var4 + 1) + I1Ol("锿镝锵讕閺", 38175));
                  return true;
               }

               this.IIlo.IIIl.IIOo(var1, 1);
               if (var4 == 1) {
                  this.l1I1();
               } else if (var4 == 2) {
                  this.l1I_();
               } else {
                  this.l1IO();
               }

               return true;
            }
         case 1795:
            if (!II(var2, 250, 3000)) {
               this.IIlo.IIIl.IIol(I1Ol("镜讙锳镜镶闎闹閖陿袓阡陔隠隂雡雀霯靝覤霏鞫韇襨鞆顯順頎頍飯飋颲飀駮蟝餝餱螤馻", 38175));
               return true;
            } else {
               if (var3.III != null && var3._10l == 1 && var3.III.IO_l >= 40000000000L) {
                  this.IIlo
                     .II
                     .III(
                        5,
                        1200,
                        I1Ol("镑镙铭铝闲閚閴閍裆陘陵阇行隒隹蠟靺霎陜覫鞫韄霩鞇頸", 38175),
                        new String[]{I1Ol("镊镋锿锞", 38175), I1Ol("镔镗锹镜闙闟閼閊", 38175), I1Ol("镔镗锹镜闑闓閫閝陹", 38175), I1Ol("镋试镽锟闳譫閰", 38175)}
                     );
                  return true;
               }

               this.IIlo.IIIl.IIol(I1Ol("镜讙锳镜闸镉闹铩裐阖阘阕雱霂雱韡覮靚靭靘鞻鞊鞽褟頧顕蚬頇颣飏虠颎颗餾頬螟饛駮駑蜩馔騶驝騽蒴髼骐", 38175));
               return true;
            }
         default:
            return false;
      }
   }

   boolean IIlI(int var1, int var2) {
      if (var1 != 1200) {
         return false;
      }

      IOol var3 = this.II();
      if (var2 >= 0 && var2 <= 2) {
         int var4 = -1;

         for (int var5 = 0; var5 < var3.III.length; var5++) {
            if (var3.III[var5].I1l == 1795 && II(var3.III[var5], 250, 3000)) {
               var4 = var5;
               break;
            }
         }

         if (var4 >= 0 && var3.III != null && var3._10l == 1 && var3.III.IO_l >= 40000000000L) {
            this.IIlo.IIIl.IIOo(var4, 1);
            this.IIIO(2 + var2, var3.lOlI, var3.III._11_);
            this.IIlo.IIIl.IIol(I1Ol("镝讟锳镜钊镙闹閖陿袛阻陔鞂霂蠲隓霯阿覊靌響襇韩鞅蛜顏顤", 38175));
            return true;
         } else {
            this.IIlo.IIIl.IIol(I1Ol("镜讙锳镜闸镉闹铩裐阖阘阕雱霂雱韡覮靚靭靘鞻鞊鞽褟頧顕蚬頇颣飏虠颎颗餾頬螟饛駮駑蜩馔騶驝騽蒴髼骐", 38175));
            return true;
         }
      } else {
         return true;
      }
   }

   boolean IlO() {
      IOol var1 = this.II();
      if (var1.III == null) {
         this.IIlo.IIIl.IIol(I1Ol("镑镙铭铝闲閚閵锘険阖防隘隳雑阢雐阞觩靭霘襦鞕", 38175));
         return false;
      }

      if (var1.III.I__l[1] == -1) {
         this.IIlo.IIIl.IIol(I1Ol("闒镊镽锒闳謟閭闘霆裱陵阀衾隒隿隗隿随霤靌韻韂襪鞁頧顅颶顄飠飊風頊颊餾餏饼餘駲蝐駹", 38175));
         return false;
      }

      this.l1I1();
      if (var1.III.I__l[2] != -1) {
         this.l1I_();
      }

      return true;
   }

   boolean IlOI() {
      IOol var1 = this.II();
      if (var1.III == null) {
         this.IIlo.IIIl.IIol(I1Ol("镑镙铭铝闲閚铈锚院阖阶隇隳鞣蠖雐靻觃", 38175));
         return false;
      }

      IO0l var2 = var1.III.II[2];
      if (var2 != null && !var2.II1_()) {
         int var3 = 0;
         int var4 = -1;

         for (int var5 = 0; var5 < var2.IIl.size(); var5++) {
            int[] var6 = (int[])var2.IIl.elementAt(var5);
            if (var6[0] == 72) {
               var3 = var6[1];
               var4 = var5;
               break;
            }
         }

         if (var3 >= 7) {
            this.IIlo.IIIl.IIol(I1Ol("镘鐽锳锛閻闎閸閁阷陕袲阕隳鞣蠖雐靡靉雽雍韢鞊雘霋頧餷蛤預颣飁虤颐食饪蟬餵饛颋駘", 38175));
            return false;
         }

         if (var4 >= 0) {
            ((int[])var2.IIl.elementAt(var4))[1]++;
         } else {
            var2.III(72, 1);
         }

         for (int var7 = 0; var7 < var2.IIl.size(); var7++) {
            int[] var8 = (int[])var2.IIl.elementAt(var7);
            if (var8[0] == 0) {
               var8[1] += var8[1] * 10 / 100;
               break;
            }
         }

         var1.III.llIl = Math.min(var1.III.llIl, var1.III.Illo());
         this.IIlo.ll_0();
         return true;
      } else {
         this.IIlo.IIIl.IIol(I1Ol("鐏诹镽锒闼鐊鑸閑阷陞阼袳雽隒隥衑靦霎霮鞟鞫隻鞬鞇頧顁饆頊飤颂駐頂颊", 38175));
         return false;
      }
   }

   boolean IlOl() {
      IOol var1 = this.III();
      int var2 = this.II00();
      if (var1 != null && (var2 == 1 || var2 == 2 || var2 == 4)) {
         this.Io0 = !this.Io0;
         this.l1I();
         this.II_1(
            var2 == 1
               ? I1Ol("镝误镽锱镻闃闹閴雷阖阗韄隳雼阹雐霮霏靭霮阻鞄韧鞪馷須顫頦餳颌飯颭颞餰餓餒餓饸駗駶駙驔鮅驺驝骼骟", 38175)
               : (var2 == 2 ? I1Ol("镋镟锲镜闷镚闹閌陿袑阻", 38175) : I1Ol("镗诟锴镜闵闒锻閖阷陚阺裕雺隒隥隘親非靭震面韇韨韈顏飅頼顄飠飊風頊颒餾饓餻飋蝻駗馿駗驠蒎驴魢萫髁髰验藩魌魬鬟鯫鮈", 38175))
         );
         return true;
      } else {
         return false;
      }
   }

   boolean IlO1() {
      return this.Io0I;
   }

   void IIl_(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      String[] var3 = new String[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = var1.readUTF();
      }

      this.Io0I = false;
      IOol var8 = this.II();
      if (var8 != null && var8.III != null && var2 >= 1) {
         String var5 = var3[0].trim();
         int var6 = -1;

         for (int var7 = 0; var7 < var8.III.length; var7++) {
            if (var8.III[var7].I1l == 400 && var8.III[var7].lo0I > 0) {
               var6 = var7;
               break;
            }
         }

         if (var6 < 0) {
            this.IIlo.IIIl.IIol(I1Ol("镝讟锳镜闸謝閷闘陣陞裮陔鞂蠅隥雐靻韄霣靌隚襭韩鞜蛪頊顥頉飶飃飡颔虞饷餝餏餚駴駍馹", 38175));
         } else if (var5.length() != 0) {
            for (int var9 = 0; var9 < var5.length(); var9++) {
               if (!Character.isLetterOrDigit(var5.charAt(var9))) {
                  this.IIlo.IIIl.IIol(I1Ol("镋闔锳镜闰闒锭閖陰阖靄韄衰雑雱隓靧觇霬靌韠靗韩鞜蛶順饔蛓飠颂颣颉蘸饪", 38175));
                  return;
               }
            }

            if (var5.length() > 10) {
               this.IIlo.IIIl.IIol(I1Ol("镋闔锳镜闪闏锸闘陳雖阼", 38175));
            } else {
               var8.III.II1o = I1Ol("锻", 38175) + var5.toLowerCase();
               this.IIlo.IIIl.IIOo(var6, 1);
               this.I__o();
               if (this.Il_o()) {
                  this.I__0();
               }

               this.II(1000L, I1Ol("镜讝锰镜鐺闔闹開鞧阖阥阜衶隒韀阓霯阿觺霘鞫韉鞡鞇頧顅頪頊颣飖頫颎食", 38175) + var5);
               this.IIlo.I__O();
            }
         }
      }
   }

   int Il() {
      IOol var1 = this.II();
      long var2 = (var1.IOoO + var1.IOo0 - System.currentTimeMillis()) / 1000L;
      return var2 > 0L ? (int)var2 : 0;
   }

   void l1l() {
      IOol var1 = this.II();
      if (var1 != null && var1.lIII && this.Il_0()) {
         int var2 = this.Il();
         long var3 = Math.max(1L, var1.IOo0 / 1000L);
         int var5 = var2 == 0 ? 4 : (int)Math.min(3L, (var3 - var2) * 4L / var3);
         if (var5 < 0) {
            var5 = 0;
         }

         this.IIlo.II(new IO0o(-122).III(50).II(5).III(4664).III(4665).III(4666).III(4667).III(4668).II(var5).IIII(var2));
      }
   }

   private void IIII(int var1, String var2, String[] var3) {
      this.IIlo.II.III(50, var1, var2, var3);
   }

   void l1lI() {
      IOol var1 = this.II();
      if (var1.lIII && this.Il_0()) {
         this.l1l();
         if (this.Il() != 0) {
            this.IIII(
               500,
               I1Ol("镝钎镽锞鐫閚閻鑈阹阘陻", 38175),
               new String[]{I1Ol("镗诙锤镜闹譵闓閌陥裟阻阓", 38175), I1Ol("讻镎镽锒闳闛閷閐阝", 38175) + IO00.IIlI(1000000000L) + I1Ol("锿镈閽锒闼", 38175), I1Ol("鐏闍锳锛", 38175)}
            );
         } else {
            this.IIII(501, I1Ol("镝钎镽锞鐫閚閻鑈阹阘陻", 38175), new String[]{I1Ol("镑诡", 38175), I1Ol("镗诙锤镜闹譵闓閌陥裟阻阓", 38175), I1Ol("鐏闍锳锛", 38175)});
         }
      } else {
         this.IIlo.IIIl.IIol(I1Ol("镝讟锳镜闸闒鑩閙阷陕隦陔雧雀蠸隞靨霎需霍鞫韨陹韉", 38175));
      }
   }

   boolean II1(int var1, int var2) {
      IOol var3 = this.II();
      if (var1 < 500 || var1 > 503) {
         return false;
      }

      if (var3.lIII && this.Il_0()) {
         switch (var1) {
            case 500:
               if (var2 == 0) {
                  this.IIII(503, I1Ol("镝讟锳镜闸镉闹閛陿袙阶陔雰雚衾隞霯靃霸覽韥鞊鞡褏顾順頧蚫颣飖颳蘉频饹餝餑餚駸頉駧", 38175), new String[]{I1Ol("鐏语锳锛閻镇", 38175), I1Ol("镋试镽锟闳譫閰", 38175)});
               } else if (var2 == 1) {
                  if (var3.Il11 >= 1000000000L) {
                     var3.Il11 -= 1000000000L;
                     var3.IOo0 = 0L;
                     this.IIlo.IIIl.l1_();
                     this.l1l();
                     this.IIlo.I__O();
                  } else {
                     this.IIlo.IIIl.IIol(I1Ol("镝讟锳镜闰闒锭閖陰阖靄袓隳雄阱隞靨霎陜覯鞫韞鞡褙顤順頭頍虄飌飭飀颜駬饓饼餏駲駐蝧馂騶", 38175) + IO00.IIlI(1000000000L - var3.Il11) + I1Ol("锿镈閽锒闼", 38175));
                  }
               }
               break;
            case 501:
               if (var2 == 0) {
                  this.IIII(
                     502,
                     I1Ol("镝讟锳镜闸镉闹閛陿袙阶陔雰雚衾隞霯靍霥霃鞫韞鞻褁顩顁顥頊虜额飋駰蘸餾饉螱饛駹蝞馹駗驴蒔騺驓髡萌髰鯾骾藎鬯魋鯾鯁鮩鮞鰦鱑鰬苜鲢鳃艱鲱鲙鴽鰭莜鵚鷔鷙鶵鱆", 38175),
                     new String[]{I1Ol("鐏诹镽锑闺闘鑩闲陃附隴阝隳鞢衴隄", 38175), I1Ol("鐏诹镽锑闺闘鑩闲陙陗阸裋雰", 38175), I1Ol("鐏诹镽锑闺闘鑩闲陏陗阬阐雲", 38175), I1Ol("镋试镽锟闳譫閰", 38175)}
                  );
               } else if (var2 == 1) {
                  this.IIII(503, I1Ol("镝讟锳镜闸镉闹閛陿袙阶陔雰雚衾隞霯靃霸覽韥鞊鞡褏顾順頧蚫颣飖颳蘉频饹餝餑餚駸頉駧", 38175), new String[]{I1Ol("鐏语锳锛閻镇", 38175), I1Ol("镋试镽锟闳譫閰", 38175)});
               }
               break;
            case 502:
               if (var2 >= 0 && var2 <= 2 && this.Il() == 0) {
                  var3.lIII = false;
                  this.IIlo.II(new IO0o(-117).II(101));
                  this.IIIO(1, var2, var3.III != null ? var3.III._11_ : -1);
               }
               break;
            case 503:
               if (var2 == 0) {
                  var3.lIII = false;
                  this.IIlo.I__O();
                  this.IIlo.IIIl.IIol(I1Ol("鐏闝镽锔譼闃闹閚裘阖阡阆衺雜隶雐靂靏霯雜", 38175));
               }
         }

         return true;
      } else {
         return true;
      }
   }

   boolean IlO_() {
      IOol var1 = this.II();
      IOol var2 = this.III();
      if (var2 == null) {
         this.IIlo.IIIl.IIol(I1Ol("镔镖閩锒闼閚閭閐裔阖阡阜衢雑雱隘靦觩霣", 38175));
         return false;
      } else if (var2._11_ >= 5) {
         this.IIlo.IIIl.IIol(I1Ol("镘镗讆锕閻闒譸閖阷际袼阗隳雟衰隞靧霎霮見韪鞊雘褯頧顒蚨顄馒顁飡駱虞饪餝館螠駳香馵蜞驵騕騠蒢髻骑鯁骎鬮魅鬥薬鯤鮉鮼蕆鱯", 38175));
         return false;
      } else if (var1.Il11 < 50000000L) {
         this.IIlo.IIIl.IIol(I1Ol("镝讟锳镜闰闒锭閖陰阖靄袓隳雄阱隞靨霎陜覯鞫韇褖韄頧顅颷頊颣飖颩颉虀饫餝", 38175) + IO00.IIlI(50000000L - var1.Il11) + I1Ol("锿镈閽锒闼", 38175));
         return false;
      } else {
         var2._11_++;
         var1.Il11 -= 50000000L;
         this.IIlo.IIIl.IIol(I1Ol("镘镗讆锕閻闒譸閖阷际袼阗隳雟衰隞靧霎霮見韪鞊雘褯頧顒蚨顄馒顁飡駱饏蟽饞饼餏颙駗馿駗驺髟騺驓骣骑骲葂魭", 38175));
         this.IIlo.IIIl.l1_();
         this.ll_();
         this.IIlo.I__O();
         return true;
      }
   }

   long III_() {
      IOol var1 = this.III();
      return var1 == null ? 0L : var1.III_();
   }

   boolean IlOO() {
      IOol var1 = this.III();
      return var1 == null || var1._11_ >= 5;
   }
}
