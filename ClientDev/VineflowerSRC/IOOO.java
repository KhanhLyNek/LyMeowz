package main;

import java.util.HashSet;

final class IOOO {
   static final int lo1l = 1800000;
   static final int lo11 = 1;
   static final int lo1_ = 2;
   static final int lo1O = 3;
   static final int lo10 = 4;
   private final IO0 IIl;
   private final IOo_ IIl;
   private final IOoI IIII;
   private int IoI_;
   private int lOl_;
   private long I1O1;
   private boolean Io_I;
   private boolean Io_l;
   private boolean Io_1;
   private long I1o1;
   private long I1o_;
   private final HashSet<Integer> II = new HashSet<>();

   IOOO(IO0 var1, IOo_ var2, IOoI var3) {
      this.IIl = var1;
      this.IIl = var2;
      this.IIII = var3;
   }

   boolean Il1I() {
      return this.IoI_ != 0;
   }

   int II00() {
      return this.IoI_;
   }

   int II0o() {
      return this.lOl_;
   }

   static boolean IIO1(int var0) {
      return var0 >= 147 && var0 <= 152 || var0 == 143 || var0 == 144 || var0 >= 135 && var0 <= 138 || var0 == 127 || var0 == 128;
   }

   synchronized boolean IIl1(int var1, int var2) {
      if (this.Il1I()) {
         this.IIl.IIIl.IIol(I1_I("틅펕푽푕푱퐄퓽퓁풣풋픫핚픡햛햧헄쭦햊혣홉혩횁혜", 54229));
         return false;
      }

      if (var2 >= 1 && var2 <= 110) {
         short var3;
         switch (var1) {
            case 1:
               var3 = 147;
               break;
            case 2:
               var3 = 143;
               break;
            case 3:
               int var4 = -1;

               for (int var5 = 0; var5 < this.IIl.II.III.length; var5++) {
                  if (this.IIl.II.III[var5].I1l == 611 && this.IIl.II.III[var5].lo0I > 0) {
                     var4 = var5;
                     break;
                  }
               }

               if (var4 < 0) {
                  this.IIl.IIIl.IIol(I1_I("펞펜퓧표퐶푐퓻푂풠퓌핿핂쯬픑햧헄쭦햊혣휳좒홀혔훶훒훼횙ퟻ흌", 54229));
                  return false;
               }

               this.IIl.II.III[var4].lo0I--;
               if (this.IIl.II.III[var4].lo0I <= 0) {
                  this.IIl.II.III[var4] = new IO0l();
               }

               this.IIII.l1_l();
               var3 = 135;
               break;
            case 4:
               var3 = 127;
               break;
            default:
               return false;
         }

         if (I0Io.II(var3) == null) {
            this.IIl.IIIl.IIol(I1_I("펞펜퓧표퐶푐퓬푝퓭풁핪핚합픆핧헟", 54229));
            return false;
         }

         if (!this.IIl.II01(var3)) {
            return false;
         }

         this.IoI_ = var1;
         this.lOl_ = var2;
         this.I1O1 = System.currentTimeMillis();
         this.Io_I = false;
         this.Io_l = false;
         this.Io_1 = false;
         this.I1o1 = 0L;
         this.I1o_ = 0L;
         this.II.clear();
         this.IIl.II(new IO0o(-65).IIII(this.IIl.II.I1l).II(1));
         this.IIl.III_(var3, 100 + (int)(Math.random() * 200.0), 336);
         this.IIII.II00(I1_I("펃팔푼퐒", 54229) + this.IIl0() + I1_I("폵펗쪶푂푱", 54229) + var2);
         this.lI();
         return true;
      } else {
         this.IIl.IIIl.IIol(I1_I("펖쵑푣퐒푠푝풾풟퓽", 54229));
         return false;
      }
   }

   private void lI() {
      if (this.IoI_ == 3) {
         long var1 = System.currentTimeMillis();
         long var3 = this.I1o1 > 0L ? 60000L - (var1 - this.I1o1) : 1800000L - (var1 - this.I1O1);
         int var5 = (int)Math.max(1L, Math.min(var3 / 1000L, 32000L));
         this.IIl.II(new IO0o(65).II(1).II(I1_I("펝펕푽푕푱퐛퓧퓁퓭풎헪핟핳", 54229)).III(var5));
      }
   }

   private void lI1() {
      boolean var1 = this.IoI_ == 3;
      IOol var2 = this.IIl.II;
      this.close();
      if (var2 != null) {
         this.IIl.II.II_o(var1 ? 5 : 21 + var2.lOlI, -1);
      }
   }

   private String IIl0() {
      return this.IoI_ == 1
         ? I1_I("펞펜퓾퐒퐖퐑퓼풎풅쨋핲픊픍픁쭀헒", 54229)
         : (this.IoI_ == 2 ? I1_I("펖펛푽퐒핁헀쩒퓀풪퓌학쮅픧핈풗쭿햦", 54229) : (this.IoI_ == 3 ? I1_I("펗쵗푽퐒핁쪣풯퓥풥풃픫함햨픝", 54229) : I1_I("페펕푱햂푱푁풻퓆", 54229)));
   }

   boolean IIO_(int var1) {
      return (this.IoI_ == 1 || this.IoI_ == 2 || this.IoI_ == 3) && IIO1(var1);
   }

   synchronized void II10(int var1, int var2) {
      this.II.add(var1 * 1000 + var2);
   }

   boolean IIIO(int var1, int var2) {
      return this.IIO_(var1) && this.II.contains(var1 * 1000 + var2);
   }

   int[] II(int var1, int var2, int var3) {
      if (!this.IIO_(var1)) {
         return null;
      }

      long[] var4 = this.II(var1, var2, var3);
      return new int[]{(int)var4[0], this.IIIO(var1, var2) ? 0 : (int)var4[0]};
   }

   void IlO(int var1) {
      if (this.Il1I()) {
         this.lI();
         IOoI.III[] var2 = this.IIII.II();

         for (int var3 = 0; var3 < var2.length; var3++) {
            IOoI.III var4 = var2[var3];
            if (var4.III == null) {
               long[] var5 = this.II(var1, var3, var4.l0o1);
               var4._l__ = var4.lOlO = (int)var5[0];
               var4._l_O = (int)var5[1];
               var4.Ioo_ = false;
               var4.IooO = false;
               var4.IO1o = Long.MAX_VALUE;
               if (this.IIIO(var1, var3)) {
                  var4.IoOo = true;
                  var4.llIl = 0;
                  if (var4.l0o1 == 71) {
                     this.IIl.II(new IO0o(102).II(7));
                  } else if (var4.l0o1 == 72) {
                     this.IIl.II(new IO0o(102).II(6));
                  }
               } else {
                  var4.IoOo = false;
                  var4.llIl = var4.lOlO;
                  if (var4.l0o1 != 71 && var4.l0o1 != 72) {
                     this.IIl.II(new IO0o(-13).II(var4._l_1).II(var4.l0o1).II(0).IIII(var4.llIl));
                  }
               }
            }
         }
      }
   }

   private static boolean IIOO(int var0) {
      return var0 >= 135 && var0 <= 138;
   }

   private boolean IIO0(int var1) {
      I0Io.II var2 = I0Io.II(var1);
      if (var2 == null) {
         return true;
      }

      for (int var3 = 0; var3 < var2.III.length; var3++) {
         if (!this.II.contains(var1 * 1000 + var3)) {
            return false;
         }
      }

      return true;
   }

   private boolean IIOo(int var1) {
      if (!this.IIO0(var1)) {
         return false;
      }

      if (var1 == 137) {
         IO_I.III var2 = this.IIl.IIIl.II.II(I1_I("펁펡푋푾퐎퐲퓋퓥풏", 54229));
         if (var2 == null || var2.llIl > 0) {
            return false;
         }
      }

      return true;
   }

   boolean II0(int var1) {
      if (this.IoI_ != 3 || this.IIl.II == null) {
         return false;
      } else {
         return IIOO(this.IIl.II.lOlo) && IIOO(var1) ? !this.IIOo(var1) && !this.IIOo(this.IIl.II.lOlo) : false;
      }
   }

   private boolean Il10() {
      int var1 = 0;

      for (int var2 = 135; var2 <= 138; var2++) {
         I0Io.II var3 = I0Io.II(var2);
         if (var3 != null) {
            var1 += var3.III.length;
         }
      }

      return this.II.size() >= var1;
   }

   private long[] II(int var1, int var2, int var3) {
      IOol var4 = this.IIl.II;
      double var5 = this.lOl_ / 50.0;
      int var7 = Math.max(1, var3);
      double var8 = (double)var4.Il1I() * var7 * var5;
      double var10 = (double)var4.Illo() / var7 * var5;
      double var12;
      double var14;
      if (this.IoI_ == 1) {
         boolean var16 = var1 == 147 && var2 == 0 || var1 == 149 && var2 == 7 || var1 == 151 && var2 == 0 || var1 == 152 && (var2 == 0 || var2 == 33);
         var14 = var16 ? var10 * 10.0 : var10;
         var12 = var16 ? var8 * 893.3333333333334 : var8;
      } else if (this.IoI_ == 2) {
         boolean var20 = var2 == 5;
         var14 = var20 ? var10 * 120.0 : var10;
         var12 = var20 ? var8 * 120.0 : var8;
      } else if (this.IoI_ == 3) {
         boolean var21 = var1 >= 135 && var1 <= 137;
         boolean var17 = var1 == 135 && (var2 == 5 || var2 == 10) || var1 == 136 && var2 == 5 || var1 == 137 && var2 == 5;
         if (var21) {
            var14 = var17 ? var10 * 30.0 : var10;
            var12 = var8;
         } else {
            var14 = var10 * 7.75;
            var12 = var8 * 33.07786947183796;
         }
      } else {
         var14 = var10;
         var12 = var8;
      }

      long var22 = (long)Math.min(2.147483647E9, Math.max(1.0, var12));
      long var18 = (long)Math.min(2.147483647E9, Math.max(1.0, var14));
      return new long[]{var22, var18};
   }

   private boolean Il1o() {
      IOoI.III[] var1 = this.IIII.II();
      if (var1.length == 0) {
         return false;
      }

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

   void III1(long var1) {
      if (this.Il1I()) {
         IOol var3 = this.IIl.II;
         if (var3 != null) {
            if (!IIO1(var3.lOlo)) {
               this.close();
            } else {
               long var4 = 1800000L - (var1 - this.I1O1);
               if (var4 > 0L && (this.I1o1 <= 0L || var1 - this.I1o1 < 60000L)) {
                  if (this.IoI_ == 3) {
                     if (this.I1o1 == 0L && var4 <= 60000L) {
                        this.I1o1 = var1;
                        this.I1o_ = 0L;
                        this.lI();
                     }

                     if (this.I1o1 > 0L && var1 - this.I1o_ >= 10000L) {
                        this.I1o_ = var1;
                        this.IIII
                           .II00(
                              I1_I(
                                    "펖팕푺퐒퐹퐑퓡퓉퓭풂헫핓합픛쬨헖헥햗좮홒홡혒좬훷횑훼횘흲ퟃ휶휐ힶퟁힵퟓ\ud862\ud859웳\ud806\ud8ae\ud8df옑\ud882\ud92a\ud942\ud920잨\ud9ef\ud985\ud8d5\ud901\uda7b\uda01",
                                    54229
                                 )
                                 + Math.max(1L, (60000L - (var1 - this.I1o1) + 999L) / 1000L)
                                 + I1_I("폵펓푺퓐퐨푐퓡쩁풬", 54229)
                           );
                     }
                  } else if (var4 <= 60000L && !this.Io_1) {
                     this.Io_1 = true;
                     this.IIII.II00(I1_I("펅펜퓠퐒퐳쫓퓡풎풦쩓핿픊픽픀핽헅헥햗홢홗홡홖홏횾훚횵혙흣휙휶즘ퟷ", 54229));
                  }

                  if (this.IoI_ != 4) {
                     if (!this.Io_I) {
                        if (this.IoI_ == 3) {
                           if (var3.lOlo == 137 && this.IIO0(137)) {
                              this.lll0();
                           }
                        } else if (this.II0I(var3.lOlo)) {
                           IOoI.III[] var11 = this.IIII.II();
                           int var12 = 0;
                           int var8 = 0;

                           for (int var9 = 0; var9 < var11.length; var9++) {
                              if (var11[var9].III == null) {
                                 var12++;
                                 if (!var11[var9].IoOo) {
                                    var8++;
                                 }
                              }
                           }

                           if (var12 <= 0 || var8 <= 0) {
                              this.lll0();
                           }
                        }
                     } else {
                        if (this.IoI_ == 1 && !this.Io_l) {
                           IO_I.III var10 = this.IIl.IIIl.II.II(I1_I("펑펦푌푾퐈퐳퓇퓫품풳핛함", 54229));
                           if (var10 != null && var10.llIl <= 0) {
                              this.Io_l = true;
                              this.lllo();
                           }
                        } else {
                           String var6 = this.IoI_ == 1 ? I1_I("펝펵푇푱퐙퐹퓖퓯풎풧핔핺픋", 54229) : (this.IoI_ == 2 ? I1_I("펖펵푗푻퐒퐸퓐퓾풏", 54229) : I1_I("펁펡푋푾퐎퐲퓋퓥풏", 54229));
                           IO_I.III var7 = this.IIl.IIIl.II.II(var6);
                           if (var7 != null && var7.llIl <= 0) {
                              if (this.IoI_ == 3) {
                                 if (this.I1o1 == 0L && this.Il10()) {
                                    this.IIII.II00(this.IIl0() + I1_I("폵펜푼퓒퐿푐퓻퓆퐭풂핣픊픪쯍헷햆", 54229) + this.lOl_ + I1_I("폴", 54229));
                                    this.I1o1 = var1;
                                    this.I1o_ = 0L;
                                    this.lI();
                                 }
                              } else {
                                 this.IIII.II00(this.IIl0() + I1_I("폵펜푼퓒퐿푐퓻퓆퐭풂핣픊픪쯍헷햆", 54229) + this.lOl_ + I1_I("폴", 54229));
                                 this.lI1();
                              }
                           }
                        }
                     }
                  }
               } else {
                  this.IIII.II00(var4 <= 0L ? I1_I("펝쵋푧퐒퐥퐘쩒퓇퓭풋핢핋픧핈", 54229) + this.IIl0() : I1_I("펝펕푽푕푱핡푬풎풾쩁핻픆합픊쬦허헥퓵ힳ죁혢홀흮휮훜훼획짛휙홉짔ퟹ힕힟힒\ud87f\ud854", 54229));
                  this.lI1();
               }
            }
         }
      }
   }

   private boolean II0I(int var1) {
      return this.IoI_ == 1 && var1 == 148 || this.IoI_ == 2 && var1 == 144 || this.IoI_ == 3 && var1 == 137;
   }

   private void lll0() {
      if (!this.Io_I) {
         this.Io_I = true;
         IOol var1 = this.IIl.II;
         IO_I var2 = this.IIl.IIIl.II;
         if (this.IoI_ == 1) {
            int var3 = (int)Math.min(this.lOl_ * 1000L, 200000000L);
            int var4 = (int)Math.min(1000000L + this.lOl_ * 15000000L, 2000000000L);
            var3 = 10000 + var3;
            var4 = Math.min(var4, 2000000000);
            var2.II(
               I1_I("펑펦푌푾퐈퐳퓇퓫품풳핛함", 54229),
               -2080,
               I1_I("펑펆퐳푾퐨퐓퓧퓋풨", 54229),
               new int[]{742, 743, 744, -1, -1, -1},
               var3,
               var4,
               148,
               var1.I1 + 200,
               var1.I1I,
               new String[]{I1_I("펩폙퐢푎퐅퐑풯햿쨮풅픫핉햨픋햧허햢푔힢홋홡혍횜훷", 54229), I1_I("펩폙퐢푎퐓쪽퓡풎풵풍핲핎픨핈헤핇햦헄홭홅ퟱퟁ혖횾훐횽횎휺혨즙휙ힶퟁ줍힚\ud832\ud920\ud839", 54229)},
               II(2)
            );
            this.IIII.II00(I1_I("펑펆퐳푾퐨퐓퓧퓋풨퓌핳핟쯬픜햧헎햬쬣홭혃", 54229));
         } else if (this.IoI_ == 2) {
            int var10 = (int)Math.min(200000L * this.lOl_, 200000000L);
            int var13 = (int)Math.min(2000000L * this.lOl_, 2000000000L);

            for (int var5 = 6; var5 >= 1; var5--) {
               var2.II(
                  I1_I("펆펵푚푭", 54229) + var5,
                  -170 - var5,
                  I1_I("펆촥퐳", 54229) + var5,
                  new int[]{642, 643, 644, -1, -1, -1},
                  10000 + var10,
                  500000 + var13,
                  144,
                  var1.I1 + 60 * var5,
                  var1.I1I,
                  new String[0],
                  II(4)
               );
            }

            int var15 = (int)Math.min(var10 * 5L, 200000000L);
            int var6 = (int)Math.min(var13 * 5L, 2000000000L);
            var2.II(
               I1_I("펛펵푗푻퐒퐯퓟퓬", 54229),
               -160,
               I1_I("펛펕픂퓟퐲", 54229),
               new int[]{648, 649, 650, -1, -1, -1},
               10000 + var15,
               500000 + var6,
               144,
               var1.I1 + 300,
               var1.I1I,
               new String[0],
               II(4)
            );
            int var7 = (int)Math.min(var15 * 10L, 200000000L);
            int var8 = (int)Math.min(var6 * 10L, 2000000000L);
            var2.II(
               I1_I("펖펵푗푻퐒퐸퓐퓾풏", 54229),
               -150,
               I1_I("펖펕픂퓟퐲퐘", 54229),
               new int[]{645, 646, 647, -1, -1, -1},
               10000 + var7,
               500000 + var8,
               144,
               var1.I1 + 400,
               var1.I1I,
               new String[]{I1_I("펩폙퐢푎퐇학퓡퓆퓭풎핢쯭픽핈헤헎픿헄홮훂호홀협훶화훰훛흔흘흸홦흻ퟖ", 54229)},
               II(new int[][]{{4, 7}, {3, 1}, {5, 1}, {1, 4}})
            );
            this.IIII.II00(I1_I("펛펜퓠푟푱퐨퓮퓗풩풍픫핒피쯍헳햆햭햍죄홌홠", 54229));
         } else if (this.IoI_ == 3) {
            int var11 = (int)Math.min(200000L * this.lOl_, 200000000L);
            int var14 = (int)Math.min(20000000L * this.lOl_, 2000000000L);
            var2.II(
               I1_I("펁펡푋푾퐎퐲퓋퓥풏", 54229),
               -600,
               I1_I("펁펆푦표퐶푐푵퓗퓭풴핪필픡핈헋퐇", 54229),
               new int[]{135, 136, 137, -1, -1, -1},
               var11,
               var14,
               137,
               198,
               456,
               new String[]{I1_I("펩폙퐢푎퐒풑퓬풎풣풋풻풋픠핈헳쭽햬헄홰죳홡혒좬훷횝횱젠흳휙휿지ퟦ힕\ud7a4힛욱\ud858\ud870\ud81b\ud8ef", 54229)},
               II(2)
            );
            this.IIII.II00(I1_I("펁펆푦표퐶푐퓺푓퓭풴핪필픡핈헋퐇헥햜홶좇혵홀혗훷졺횲훚", 54229));
         }
      }
   }

   private void lllo() {
      IO_I.III var1 = this.IIl.IIIl.II.II(I1_I("펑펦푌푾퐈퐳퓇퓫품풳핛함", 54229));
      int var2 = (int)Math.min((var1 == null ? 10000 : var1.lllI) * 3L / 2L, 200000000L);
      int var3 = (int)Math.min((var1 == null ? 1000000 : var1.lOlO) * 3L / 2L, 2000000000L);
      this.IIl
         .IIIl
         .II
         .II(
            I1_I("펝펵푇푱퐙퐹퓖퓯풎풧핔핺픋", 54229),
            -2070,
            I1_I("펝펕푧푑퐹퐙퓶퓏풮풇", 54229),
            new int[]{639, 640, 641, -1, -1, -1},
            var2,
            var3,
            148,
            this.IIl.II.I1 + 200,
            this.IIl.II.I1I,
            new String[]{I1_I("펩폙퐢푎퐒풑퓬풎풣풋풻풋픠핈헣핇햨헄홫좃홡혓ퟏ횾훍횴젞휺흍휹", 54229), I1_I("펩폙퐢푎퐅퐑풯퓝쩰퓌핿핃햣픝햧헂햬쬣홷혂혩죟혋횾훞혽횘휺흗휿훇혷ퟜ", 54229)},
            II(2)
         );
      this.IIII.II00(I1_I("펝펕푧푑퐹퐙퓶퓏풮풇픫핒피쯍헳햆햭햍죄홌홠", 54229));
   }

   private static int[][] II(int var0) {
      return new int[][]{{var0, 1, 1000}, {var0, 2, 1000}, {var0, 3, 1000}, {var0, 4, 1000}, {var0, 5, 1000}, {var0, 6, 1000}, {var0, 7, 1000}};
   }

   private static int[][] II(int[][] var0) {
      int[][] var1 = new int[var0.length][3];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2][0] = var0[var2][0];
         var1[var2][1] = var0[var2][1];
         var1[var2][2] = 1000;
      }

      return var1;
   }

   private void close() {
      if (this.IoI_ == 1) {
         this.IIl.IIIl.II.IIOO(I1_I("펑펦푌푾퐈퐳퓇퓫품풳핛함", 54229));
         this.IIl.IIIl.II.IIOO(I1_I("펝펵푇푱퐙퐹퓖퓯풎풧핔핺픋", 54229));
      } else if (this.IoI_ == 2) {
         for (int var1 = 1; var1 <= 6; var1++) {
            this.IIl.IIIl.II.IIOO(I1_I("펆펵푚푭", 54229) + var1);
         }

         this.IIl.IIIl.II.IIOO(I1_I("펛펵푗푻퐒퐯퓟퓬", 54229));
         this.IIl.IIIl.II.IIOO(I1_I("펖펵푗푻퐒퐸퓐퓾풏", 54229));
      } else if (this.IoI_ == 3) {
         this.IIl.IIIl.II.IIOO(I1_I("펁펡푋푾퐎퐲퓋퓥풏", 54229));
         this.IIl.II(new IO0o(65).II(1).II("").III(0));
      }

      this.IoI_ = 0;
   }
}
