package main;

import java.util.Calendar;

final class I0 {
   static final int __I0 = 146;
   static final int __Io = 8601;
   static final int __l = 8602;
   static final int __lI = 8603;
   private static final long I0I_ = 900000L;
   private final IO0 II1O;
   private final IOo_ II1_;
   private final IOoI III1;
   private boolean lIIO;
   private boolean lII0;
   private boolean lIIo;
   private long I0IO;
   private long I0I0;
   private long I0Io;
   private long I0l;
   private long I0lI;
   private IO_I.III IIIl;

   I0(IO0 var1, IOo_ var2, IOoI var3) {
      this.II1O = var1;
      this.II1_ = var2;
      this.III1 = var3;
   }

   boolean Il1I() {
      return this.lIIO;
   }

   static boolean III0(long var0) {
      Calendar var2 = Calendar.getInstance();
      Calendar var3 = Calendar.getInstance();
      var2.setTimeInMillis(var0);
      return var2.get(1) != var3.get(1) || var2.get(6) != var3.get(6);
   }

   boolean IloO() {
      IOol var1 = this.II1O.II;
      return var1.lII && !III0(var1.IOo1);
   }

   void l1oO() {
      IOol var1 = this.II1O.II;
      if (var1.lII && !III0(var1.IOo1)) {
         this.II1O.IIIl.IIol(I10l("歛毑欨歐毨甙殽毌汿求狮氆沧泋氭沋洣浩洠洒洖淰涝泍猸渺湊炵湗滲灐溺溔", 27411));
      } else {
         if (var1.lII) {
            var1.lII = false;
         }

         this.II1O
            .II
            .IIII(
               18,
               8601,
               I10l(
                  "樃毐欨歐毬毆欠殂汣氊氥沈沧泂牠沑洣浊洨玧洊涾淏涵洑湴湞湸渔灱滔滺滝漼漻湀燎濧澍澁澊瀪灿燸燆烨烂烤炳燶煂熴焳熊熗炬焨燚牵狘牷爛汌狀狳犆珻獞獯猟珸浛珫玎櫦琈畖檿瓬璄璯樳畵甀畑甹瓍歁痒痶痙癵森瘢癕盿栈盲矠榱睆睮眊知矊瞤矉磩硄硌砆硷碃碱昈祣礿祓柼礒秳禚禯礌稷笧撞稗竻窒窧稐笯筂箿笂篬箊箽简籦籋籥簏糫籖粯粇糟簏緜紥絕綴綗緒糧惇繜繴縃绺繂绰纙懕罄罬缃愥翇翨羌聮胑耪耄肢胑肨鹼肗脽腘龞腰臚臗膹臖艶苇艳舑苹鰟芬苎荮荄鷤茄莩菅莲鴷葫萄萷蒎蓬蒀蓗驱蒓蔼蕐蔲薍藶藐藩",
                  27411
               ),
               new String[]{I10l("樃痡欿欗殯歓", 27411), I10l("歇痙歱欓毧畿殤", 27411)}
            );
      }
   }

   boolean IIl_(int var1, int var2) {
      if (var1 == 8601) {
         if (var2 == 0) {
            this.l1o0();
         }

         return true;
      } else if (var1 == 8602) {
         if (var2 == 0) {
            this.lIIO = false;
            this.II1O.III_(46, 300 + (int)(Math.random() * 100.0), 408);
         }

         return true;
      } else if (var1 == 8603) {
         this.l_();
         return true;
      } else {
         return false;
      }
   }

   private void l1o0() {
      if (!this.lIIO) {
         if (I0Io.II(146) == null) {
            this.II1O.IIIl.IIol(I10l("歘歚殥欞毨殎殹殄狈氊浘狗泩沆沫浅浪洂洯涀洆", 27411));
         } else if (this.II1O.II01(146)) {
            this.lIIO = true;
            this.lII0 = false;
            this.lIIo = false;
            this.IIIl = null;
            this.I0I0 = 0L;
            this.I0Io = 0L;
            this.I0l = 0L;
            this.I0IO = System.currentTimeMillis() + 900000L;
            this.II1_.II(new IO0o(-65).IIII(this.II1O.II.I1l).II(1));
            this.II1O.III_(146, 70, 336);
         }
      }
   }

   int II1o(int var1) {
      long var2 = Math.max(1L, this.II1O.II.Il1I() / 2L);
      return (int)Math.min(2147483647L, var1 == 26 ? var2 * 3L / 2L : (var1 == 25 ? var2 * 2L : var2));
   }

   int II_(int var1) {
      long var2 = Math.max(1L, this.II1O.II.Illo() / 2L);
      return (int)Math.min(2147483647L, var1 == 26 ? var2 * 3L / 2L : (var1 == 25 ? var2 * 2L : var2));
   }

   boolean Il10() {
      if (!this.lIIo) {
         return false;
      }

      IOoI.III[] var1 = this.II1O.IIIl.II();
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var1[var3].III == null) {
            var2++;
            if (!var1[var3].IoOo) {
               return false;
            }
         }
      }

      return var2 > 0;
   }

   void l1oo() {
      this.lIIo = true;
   }

   void III1(long var1) {
      IOol var3 = this.II1O.II;
      if (var3 != null) {
         if (!this.lIIO) {
            if (var3.lOlo == 146 && var3.lII) {
            }
         } else if (var3.lOlo != 146) {
            this.II0();
         } else if (var1 >= this.I0IO) {
            this.II1O.IIIl.IIol(I10l("歛疍欥歐毻毆甐殅氫汍氠氉泩沇", 27411));
            this.II0();
            this.II1O.II.II_o(var3.lOlI + 21, -1);
         } else if (var3.lII && this.I0l != 0L) {
            if (var3.llIl > 0 && var1 - this.I0l > 3500L && var1 - this.I0lI > 10000L) {
               this.I0lI = var1;
               this.II1O.II.IIII(18, 8602, I10l("樃痱歱欄死毇毭櫽涻汋汩氋爪泓泥沒珂", 27411), new String[]{I10l("樃痡欿欗殯歓", 27411), I10l("歇痙歱欓毧畿殤", 27411)});
            }
         } else {
            IO_I var4 = this.II1O.IIIl.II;
            if (this.IIIl == null) {
               if (this.lIIo && var3.llIl > 0 && this.Il10()) {
                  long var9 = Math.min(var3.Il1I(), 200000000L);
                  long var10 = Math.min(var3.Illo() * 5L, 2147483647L);
                  this.IIIl = var4.II((int)var9, (int)var10, Math.min(1000, var3.I1 + 150));
                  this.I0I0 = var1;
               }
            } else if (this.IIIl.IoI_) {
               if (this.I0Io != 0L && var1 - this.I0Io >= 3000L) {
                  this.I0Io = 0L;
                  var4.IIlo(this.IIIl);
                  var3.lII = true;
                  var3.IOo1 = System.currentTimeMillis();
                  this.I0l = var1;
                  this.I0IO = var1 + 60000L;
                  var4.IIlO(this.IIIl);
                  this.II1O.IIIl.l1OO();
                  this.II1O.I__O();
               }
            } else if (this.lII0) {
               if (this.IIIl.IoI1) {
                  if (this.Il10() && var3.llIl > 0) {
                     var4.IIl_(this.IIIl);
                  }
               } else {
                  if (var3.llIl > 0 && this.IIIl.lllI >= var3.llIl) {
                     this.II_O(this.IIIl);
                  }
               }
            } else {
               if (var1 - this.I0I0 >= 5000L && this.IIIl.status >= 3) {
                  this.lII0 = true;
                  IOoI.III[] var5 = this.II1O.IIIl.II();

                  for (int var6 = 0; var6 < var5.length; var6++) {
                     IOoI.III var7 = var5[var6];
                     if (var7.III == null) {
                        var7._l__ = var7.lOlO = var7.llIl = this.II1o(var7.l0o1);
                        var7._l_O = this.II_(var7.l0o1);
                        var7.IoOo = false;
                        var7.Ioo_ = false;
                        var7.IooO = false;
                        this.II1_.II(new IO0o(-13).II(var7._l_1).II(var7.l0o1).II(0).IIII(var7.llIl));
                     }
                  }

                  var4.II(this.IIIl, I10l("歐毓欲歐毬毁殣毌汨狍氨汈泳泇泥沌淠浛浡洔洖浴淈淼涟湳烾測湗滸湆滺", 27411));
               }
            }
         }
      }
   }

   void II_O(IO_I.III var1) {
      if (!var1.IoI_) {
         var1.IoI_ = true;
         var1.IoI1 = true;
         this.I0Io = System.currentTimeMillis();
         this.II1O.IIIl.II.IIl0(var1);
      }
   }

   private void II0() {
      if (this.IIIl != null) {
         this.II1O.IIIl.II.IIlO(this.IIIl);
      }

      this.IIIl = null;
      this.lIIO = false;
      this.lII0 = false;
      this.lIIo = false;
   }

   void ll0O() {
      this.II1O
         .II
         .IIII(
            18,
            8603,
            I10l(
               "歛毑欨歐毭歂殣殄氫汞浠氆泯沈泫沊浤浊洤浀洋淿涝液洈湳渙潉溔溜滸溽滓潱潙滠漎澮溼焫濋灹滀瀫灇烮渄烤炋澭煏煠灎熜燨熝燑熮牱狌爾牖玄猄氰犑猱獂涜猇玣玂珥玉瑡櫵瑧琒瑨璮璗璃甡畓殂畾甞痴痔痺疔癱瘗瘣梤盺盔盲皅睸睚榟眎瞢瞡瞞瞁硽曶砥硅碣磷私碏祧礿祒枬礟离秉禰礒穢稖稡稜搴竜竱窄筧旉笴筋",
               27411
            ),
            new String[]{I10l("樃痡欿欗殯歓", 27411)}
         );
   }

   private void l_() {
      IOol var1 = this.II1O.II;
      if (this.IloO()) {
         if (!this.II1O.IIIl.Il00()) {
            this.II1O.IIIl.IIol(I10l("歛毒欿欘殯毚殿殍汥汍汩浹汤沆淔牃浺洎浡洃珘淰涝涱猢湮渙溬湗滢滇瀅溝潵漑漤漝濡濃澫濋灢烉瀦瀏炦烑炶炂煬煆", 27411));
         } else {
            int var2 = var1.IO_l < 1000000000L ? 727 : 728;
            IO0l var3 = new IO0l(var2, 1);
            var3.III(30, 0).III(93, 1);
            this.II1O.IIIl.III0(var3);
            this.II1O.IIIl.l1_l();
            var1.lII = false;
            this.II1O.I__O();
            IOO.III var4 = IOO.II(var2);
            this.II1O.IIIl.IIol(I10l("歑疓欿歐毡毆畠殂氫活淹犋泤沆", 27411) + (var4 == null ? I10l("步疟欥歐毿毆畤殁", 27411) : var4.II1o));
         }
      }
   }
}
