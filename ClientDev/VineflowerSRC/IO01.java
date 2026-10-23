package main;

import java.util.Vector;

final class IO01 {
   static final int lo0l = 13;
   static final int lo01 = 0;
   static final int lo0_ = 1;
   static final int lo0O = 15;
   static final int lo00 = 16;
   static final int lo0o = 17;
   static final int loo = 20;
   static final int looI = 21;
   static final int lool = 30;
   static final int loo1 = 31;
   static final int loo_ = 32;
   private static final long I_l0 = 2000000000L;
   private int looO;
   private final Vector IIlI = new Vector();
   private static final int loo0 = 1194;
   private static final int[] I_l_ = new int[]{0, 0, 1, 2, 3, 4, 5};
   private static final int[] I_lO = new int[]{1778, 1824, -1, -1, -1, -1, -1};
   private static final int[] I_l0 = new int[]{100, 10, 20, 10, 30, 5, 100000};
   private static final int[] I_lo = new int[]{1, 1, 1000, 500, 300, 1000, 1};
   private static final String[] IlOI = new String[]{
      I1_0("낾녧녇꾊넁놫뇜꼬뇈눶눜뉏눰닫닗닡는늗궳덍덼덊뎪뎉돸뎔둣ꫤ됺둓등듙ꩳ듏땩땄떾땋떢뗸떽딆뙯똅똠똌뛣뛏뚨뛿뚊띯ꦝ뜲띓", 45296),
      I1_0("낾녧녇꾊넁놫뇜꼬뇈눵눜뉏눰닫닗닡는늗궳덍덼덊뎪뎙뎻뎟둷둜둴됐듧듚뒵듏딼딍딠떆뗾떉뗠떥뙩뙖똷뙃뛦뛎뚡뚱뚖뜽띈뜩\ua9db런랑", 45296),
      I1_0("낾녧녇꾊넁놫뇜꼬뇈눴눜뉏눬달뉂늯닀늋덶돝댲댓뎺돉뎰댄됶둗\uaaf7됝뒲듵뒵뒜땺땟딣딅떪뗮떩떔똦뙆꣡똓뚢뚖뛰뛿뚊띯럖뜵띚랫랈럷랚ꚲ롚", 45296),
      I1_0("낾녧녇꾊넁놫뇜꼬뇈눳눜뉏덴뉢닌늩닀늝궿더덼덊뎪뎙뎶뎐떦ꫨ됽둓듦듃뒿뒁땩딍둝ꯊ뗣떉떠ꬾ뙯똅똲뚖뚢뛕뚨뚪ꡓ띩", 45296),
      I1_0("낾녧녇꾊넁놫뇜꼬뇈눲눜뉏눬달뉂늯닀늋덶돝댲댓뎺뎊돨돗둸둝됽ꪴ듿뒑뒦ꨊ딮땞딥떁뗿떉떣떏뛵똅똬뚃뛬뛆뛠뚱뚙럽띅", 45296),
      I1_0("낾녧녇꾊넁놫뇜꼬뇈눱눜뉏눰닫닃늬닀늘덷덜덼댓괻뎙뎿괒둵됕됶된듡듂듰뒍땯땏딵땋떿떉떤ꭀ뙨", 45296),
      I1_0("낾녧녇꾊넁놫뇜꼬뇈눰눜뉏눬갢늂닰닐닏댰댍덬덋뎺돈뎭댖둿됕둼됗둫듟뒷듏땺ꯜ땬둺ꭓ뗇떯뗇뙪뙐똽ꢤ뛬뚁뚴ꡲ뚎뜴", 45296)
   };
   private static final int[][] II1o = new int[][]{
      {1821, 5}, {1592, 5, 1757, 5}, {1360, 1}, {1654, 1}, {1822, 10}, {1797, 1, 1592, 5, 1757, 5}, {1592, 10, 20, 7, 1757, 5}
   };
   private static final int[][] II_ = new int[][]{
      {1821, 10}, {1592, 10, 1757, 10}, {1360, 1}, {1654, 1}, {1822, 20}, {1797, 1, 1592, 10, 1757, 10}, {1592, 20, 1757, 10}
   };
   private final IO0 IIl1;
   private final IO00 III;
   private final Vector IIll = new Vector();
   private static long I_lo;

   IO01(IO0 var1, IO00 var2) {
      this.IIl1 = var1;
      this.III = var2;
   }

   private IOol II() {
      return this.IIl1.II;
   }

   private int II__(int var1) {
      int var2 = 0;
      IO0l[] var3 = this.II().III;

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (!var3[var4].II1_() && var3[var4].I1l == var1) {
            var2 += var3[var4].lo0I;
         }
      }

      return var2;
   }

   private void II_1(int var1, int var2) {
      IO0l[] var3 = this.II().III;

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

   private int IIo_() {
      int var1 = 0;
      IO0l[] var2 = this.II().III;

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var2[var3].II1_()) {
            var1++;
         }
      }

      return var1;
   }

   private static String III0(int var0) {
      IOO.III var1 = IOO.II(var0);
      return var1 == null ? I1_0("냓", 45296) + var0 : var1.II1o;
   }

   void IooI() {
      this.IIll.removeAllElements();
      Vector var1 = new Vector();
      var1.addElement(I1_0("낾뇼녇녇넏뇣뇟놰꼯뉩", 45296));
      this.IIll.addElement(I1_0("낄녮녂넦", 45296));
      var1.addElement(I1_0("뇠꿚녇녭끽뇢꽩놤뇢뉴곗뉥눏닪걥늯닪늤", 45296) + this.II()._1IO + I1_0("낭", 45296));
      this.IIll.addElement(I1_0("낕녹녋넣넘", 45296));
      var1.addElement(I1_0("낾녧녇꾊넁놫뇜꼬뇢뉌뉩눉", 45296));
      this.IIll.addElement(I1_0("낛녠녂", 45296));
      var1.addElement(I1_0("낻녦꿭넠녌뇿뇘놨뇈뉫겇눬뉮닡닃늯늇닟덶귤댵", 45296));
      this.IIll.addElement(I1_0("낓녧녋넮넇", 45296));
      var1.addElement(I1_0("뇠꿚녇녇넼뇣뇃꽶놝눧뉄늬뉄닭닅늮늁늑", 45296));
      this.IIll.addElement(I1_0("낀녧녇넨넙", 45296));
      String[] var2 = new String[var1.size()];
      var1.copyInto(var2);
      this.III.III(0, I1_0("낳녠녀녭넁뇾꽻놧뇈뉯곩눬뉄다뉎닡늎눟덱댂", 45296), var2);
   }

   void II__(int var1, int var2) {
      IOol var3 = this.II();
      if (var1 == 0) {
         String var4 = var2 >= 0 && var2 < this.IIll.size() ? (String)this.IIll.elementAt(var2) : "";
         if (var4.equals(I1_0("낄녮녂넦", 45296))) {
            Vector var5 = new Vector();
            this.IIlI.removeAllElements();
            var5.addElement(I1_0("낾녧녇꾊넁놫뇜꼬", 45296));
            this.IIlI.addElement(I1_0("낄녮녝넦", 45296));
            var5.addElement(I1_0("낸꿂녍녇넧꽲놊놧냫뉩뉁", 45296));
            this.IIlI.addElement(I1_0("낃녤녇넡넀", 45296));
            if (var3._lOO != 0 && I0Io.II(153) != null) {
               var5.addElement(I1_0("낦꿎넎넦넄뇾놠놿꼙뉤눆눧눅닭닅", 45296));
               this.IIlI.addElement(I1_0("낓녣녏넣", 45296));
            }

            if (var3._lOO != 0) {
               var5.addElement(I1_0("낻녧녁녭넎녪뇟뇃놌뎷곽눬뉄닡닋갂늎", 45296));
               this.IIlI.addElement(I1_0("낒녫녅넯", 45296));
            }

            String[] var6 = new String[var5.size()];
            var5.copyInto(var6);
            this.III.III(1, I1_0("낳녧뇎넢녌뇨뇅놧뇄눧뉒눤뉄닱갇늵닀늉덫더덼댐돲돐돸뎐ꪡ둅둴됐듽듟듚뒬땡땃땬딆뗿ꭸ떦뗇뙪뛅똩뙃뛥뙍뛠뚱똞띲뜜띤", 45296), var6);
         } else if (var4.equals(I1_0("낕녹녋넣넘", 45296))) {
            Vector var13 = IOO.IIII(13);

            for (int var18 = 0; var18 < var13.size(); var18++) {
               IOO.III1 var7 = (IOO.III1)var13.elementAt(var18);
               if (I1_0("낣녇녡넝넳뇏뇥놀놷뉃뉯눀눩", 45296).equals(var7.lIlO)) {
                  this.IIl1.II.II(var7);
                  return;
               }
            }

            this.IIl1.IIIl.IIol(I1_0("낳꿢녏녭넄녫뇄놮뇈댖곳눬뉄뎒닋갂늍닟덭귌덼댐돳굾뎶돗둵둝뗤됒뒲듒됣듏땪ꯂ땬딇뗣\uab6e떽", 45296));
         } else if (var4.equals(I1_0("낛녠녂", 45296))) {
            this.III
               .III(
                  15,
                  I1_0("낾녧녇꾊넁놫뇜꼬뇈뉌뉩눉뉄뎒뉁닡늄늖귛덓덼댉돻뎗돒뎺둣둔둴됇듺둛뒽듏땸뗄땬딽뗃뗹뗨듶ꣅ똅똪똋\ua82f뛏뛠뚱뚖띴ꧽ뜮띚럩럐ꥰ래렵례렻맂Ꙏ룞뢨룎륥뢍뤥", 45296),
                  new String[]{I1_0("낾녧꾃넣녌뇺뇟넩뇢뉌뉩눉", 45296), I1_0("낾녧꾃넣녌뇺뇟넩뇢뉌뉩눉뉄닕닫늑", 45296), I1_0("뇠뇼녀넪", 45296)}
               );
         } else if (var4.equals(I1_0("낓녧녋넮넇", 45296))) {
            long var14 = System.currentTimeMillis();
            long var20 = (I_lo + 60000L - var14) / 1000L;
            if (var20 > 0L) {
               this.IIl1.IIIl.IIol(I1_0("낦녺녇녭넀녹뇄놮뇈뉤뉎겘뉄", 45296) + var20 + I1_0("냐녨녇놯넕놫뇄꼦놉", 45296));
               return;
            }

            I_lo = var14;
            this.IIl1.IIIl.IIol(I1_0("남녠녀넪", 45296));
         } else if (var4.equals(I1_0("낀녧녇넨넙", 45296))) {
            this.III
               .III(
                  20,
                  I1_0("낳녠녀녭끽뇪뇄놮뇈뉤닕뉥", 45296)
                     + this.II__(1194)
                     + I1_0(
                        "냐녟녆네꿓뇾놊놫넁눧뉈눢눋닢닌닋늣느데댝댱댎굋돗돸닦\uaac3둜둴됂듧둑듰뒈뗢딍딢떋뗥떉뗷뗭똌똖뙴뙃뛲뛉뚩ꡠ뚋뜧뜜뜖랒럶래랺랃롻렔륂ꚫ룥뢐뢭뢇Ʝ륂륫륂뢘맍릨맆멩뮔먭먅모몪몊뫮뫝뭬뭓묳ꗆ믭뮍믶뮭볹밓밿밄ꉉ볆볮벥뵣뵊뵪뱸뵨뷈뷦뷊븤빫븭븀뺠뻲뻟뺴뻶뼬뼊뽹뼈뿿뿟ꅪ뾁쀩쀒쀓삃샡색샭삤셮셅셩선\udf54쇈솢쇮숺숛쉡숐숗싷\udc02슩싁쌺썵쎥썗쏂쏜\udd17쎆쐲쑿엠엎쓠쓊쓬쒹\udbfb않앨씵\udb67",
                        45296
                     ),
                  new String[]{I1_0("냃넿", 45296), I1_0("냅넿", 45296), I1_0("냇넿", 45296), I1_0("냉넶", 45296), I1_0("뇠뇼녀넪", 45296)}
               );
         }
      } else if (var1 == 1) {
         String var9 = var2 >= 0 && var2 < this.IIlI.size() ? (String)this.IIlI.elementAt(var2) : "";
         if (var9.equals(I1_0("낄녮녝넦", 45296))) {
            this.III.II01(this.IIl1.IIIl.II1I());
         } else if (var9.equals(I1_0("낃녤녇넡넀", 45296))) {
            this.IIl1.II.l1o_();
         } else if (var9.equals(I1_0("낓녣녏넣", 45296))) {
            this.IIl1.III_(153, 100 + (int)(Math.random() * 101.0), 432);
         } else if (var9.equals(I1_0("낒녫녅넯", 45296))) {
            this.III
               .III(
                  30,
                  I1_0("뇠뇭녗녭넀녫놊놫꽋뉩눆더겷늣닉늩늏닟덼돜댩덛돲괚뎱돗둢ꪂ됷둓듦둜듰뒇땡땃땆딨땫뗊뗨떄뙩뙋뙤똀ꡫ뚁뚹똵뚐뜽띈랹뜗랹럔뜽래렵뤥맣ꚯ룿룗룅\ua630뤭렽릩뤓릩맋뤴맆멱멅멣먎뫮몪뫱몶ꐦ물뭘묲ꖴ믶뮗뮵ꕐ뱤밓뵃ꊨ벰볙ꈥ벌봬뵘ꎣ봊붨뷊봪붋빬븃븬븉빩", 45296),
                  new String[]{I1_0("낤녠녞녇넮뇪뇄놮뇈뉯곿눬", 45296), I1_0("낤녧뇎넣넄놫뇞네놋뉯눬눇눅닭닅", 45296), I1_0("낳녧꿣넣녦뇨꼏놹뇈댖곿", 45296), I1_0("낤꿤넎넮넄꽚뇃", 45296)}
               );
         }
      } else if (var1 == 30) {
         if (var2 == 0 || var2 == 1) {
            this.IIl1.IIIl.IIol(I1_0("낲꾬녀넪녌뇳꼕놹뇈뉯겇눫눃늣닩늩늏닟덼돜댩덛돾눉괃뎞됶둗됽ꪰ듼뒑뒳뒇뒾때땬딈땹떉떬\uab08똦뙉똭ꢤ뛷뚁ꠟ뛿뚜ꦾ띒띻뜕럿럞랻랟롻롑", 45296));
         } else if (var2 == 2) {
            if (var3._lOO == 0) {
               this.IIl1.IIIl.IIol(I1_0("낸뇬녗녭넚녫뇅뇩놊뉦뉈눢뉄닫걻늨닀늋덬늍궇댘", 45296));
               return;
            }

            if (var3.IO_l < 2000000000L) {
               this.III.II01(I1_0("납뇥녛녭넏꼬뇟뇩놛곮뉅뉥눉갢닌늩닀늓귅덓덼댓눻돗돸독됸됅둤둃뒼뒁든듟딠딝땼땛", 45296));
               return;
            }

            String[] var10 = new String[12];

            for (int var15 = 0; var15 < 11; var15++) {
               var10[var15] = I1_0("낳꾪녞녇", 45296) + (var15 * 10 + 1) + I1_0("냝", 45296) + Math.min(110, var15 * 10 + 10);
            }

            var10[11] = I1_0("뇠뇼녀넪", 45296);
            this.III.III(31, I1_0("낳녠녀녭넁뇾꽻놧뇈뉤뉎겈눊늣닌늩눓늒댾덞극댋뎺늨괁돗둸듕됻둌", 45296), var10);
         }
      } else if (var1 == 31) {
         if (var2 < 0 || var2 > 10) {
            return;
         }

         this.looO = var2;
         int var11 = var2 * 10 + 1;
         int var16 = Math.min(110, var2 * 10 + 10);
         String[] var19 = new String[var16 - var11 + 2];

         for (int var21 = var11; var21 <= var16; var21++) {
            var19[var21 - var11] = I1_0("낳꾪녞녭", 45296) + var21;
         }

         var19[var16 - var11 + 1] = I1_0("뇠뇼녀넪", 45296);
         this.III.III(32, I1_0("낳녧꿣넣녌뇨꼏놹뇈댖곿뉥눌닢닌늦닀는덶덒덼댙덻돌돸돟둵ꪐ됤둓등둑뒾뒈딮땎딭딄떪뗘떽딆뙯똅똧뚃뛬뛆뛠뚲ꡟ띳띔띲", 45296), var19);
      } else if (var1 == 32) {
         int var12 = this.looO * 10 + 1;
         int var17 = Math.min(110, this.looO * 10 + 10);
         if (var2 < 0 || var2 > var17 - var12) {
            return;
         }

         this.Il0I(var12 + var2);
      } else if (var1 == 15) {
         if (var2 == 0) {
            this.II1I(false);
         } else if (var2 == 1) {
            this.II1I(true);
         }
      } else if (var1 != 16 && var1 != 17) {
         if (var1 == 20 && var2 >= 0 && var2 < 4) {
            this.Il0l(var2);
         }
      } else if (var2 == 0) {
         this.II1l(var1 == 17);
      }
   }

   private void Il0I(int var1) {
      IOol var2 = this.II();
      if (var2._lOO == 0) {
         this.IIl1.IIIl.IIol(I1_0("낸뇬녗녭넚녫뇅뇩놊뉦뉈눢뉄닫걻늨닀늋덬늍궇댘", 45296));
      } else if (var2.IO_l < 2000000000L) {
         this.IIl1.IIIl.IIol(I1_0("납뇥녛녭넏꼬뇟뇩놛곮뉅뉥눉갢닌늩닀늓귅덓덼댓눻돗돸독됸됅둤둃뒼뒁든듟딠딝땼땛", 45296));
      } else {
         int var3 = IO0I.IIol();
         if (var2._1Io != var3) {
            var2._1Io = var3;
            var2._1l = 0;
         }

         if (var2._1l >= 3) {
            this.IIl1.IIIl.IIol(I1_0("낲꾮녀녭끽녨놊놿너뉨눆눭눅닭닅닡늋늗덱댝댾뎚돯뎙돫돗둺ꪒ됺둓듦듃뒿뒁땩딍딤떟뗧떉떦떆뙿똉뙤똋\ua83b뛏뛠뚸ꡉ띭뜜뜷\ua9db런래랹랑룵롍롳렟룰룙", 45296));
         } else {
            if (this.IIl1.II.IIl1(3, var1)) {
               var2._1l++;
               this.IIl1.I__O();
            }
         }
      }
   }

   private long III(int var1) {
      switch (I_l_[var1]) {
         case 0:
            return this.II__(I_lO[var1]);
         case 5:
            return this.II()._1lo;
         default:
            return this.II()._1lo / I_lo[I_l_[var1]];
      }
   }

   private void II1I(boolean var1) {
      IOol var2 = this.II();
      int var3 = var1 ? var2._1l0 : var2._1lO;
      if (var3 < 1) {
         var3 = 1;
      }

      int var4 = var1 ? 17 : 16;
      if (var3 > IlOI.length) {
         this.III
            .III(
               21,
               I1_0("낳녠녀녭끽녨놊놡놇닧뉈뉥눐닫뉂늯늈닟덪궘댨덛돹괚돸뎙둾둜ꪓ됞뒲듇ꨵ듏", 45296) + (var1 ? I1_0("낻녀녢녭넺뇂뇺", 45296) : I1_0("낻녀녢", 45296)) + I1_0("냐녽꿽네녍놫뇩놡넒뉤눆눨겏닭닅닡늃느데댜", 45296),
               new String[]{I1_0("뇠뇼녀넪", 45296)}
            );
      } else {
         int var5 = var3 - 1;
         long var6 = this.III(var5);
         int var8 = (int)(var6 * 100L / I_l0[var5]);
         if (var8 > 100) {
            var8 = 100;
         }

         int[] var9 = var1 ? II_[var5] : II1o[var5];
         StringBuffer var10 = new StringBuffer();

         for (byte var11 = 0; var11 < var9.length; var11 += 2) {
            if (var11 > 0) {
               var10.append(I1_0("냜넯", 45296));
            }

            var10.append(var9[var11 + 1]).append(' ').append(III0(var9[var11]));
         }

         String var13 = I_l_[var5] >= 1 && I_l_[var5] <= 4
            ? I1_0("냺넧녬꿮넂놫뇅놯놎뉫뉏눫눁늹늂늬갷늖댾", 45296) + I_lo[I_l_[var5]] + I1_0("냐녾녛놬넅놫뇂꽨뇈댖뎖겦눇늣닖눬늎늗댾댌덼댗괽돗돱", 45296)
            : "";
         String var12 = IlOI[var5]
            + var13
            + I1_0("냺녟녆꿪넂놫뇞놡끘곘뉈눢뉞늣", 45296)
            + var10
            + I1_0("냺녇녁놭넂놫뇞놡너뉩뉎뉿뉄", 45296)
            + var6
            + I1_0("냟", 45296)
            + I_l0[var5]
            + I1_0("냐넧", 45296)
            + var8
            + I1_0("냕넦", 45296);
         if (var6 >= I_l0[var5]) {
            this.III.III(var4, var12, new String[]{I1_0("낾녧꾃넣녌뇿뇂끹꼷뉩뉁", 45296), I1_0("뇠뇼녀넪", 45296)});
         } else {
            this.III.III(21, var12, new String[]{I1_0("뇠뇼녀넪", 45296)});
         }
      }
   }

   private void II1l(boolean var1) {
      IOol var2 = this.II();
      if (var1 && this.II__(1825) < 1) {
         this.IIl1.IIIl.IIol(I1_0("낲꾮녀녭넏꼬뇄뇩놋담눆눓늍늣달늩늉갸덳댝댊궞뎺돯뎑뎧됶딤ꪗ둓듼듙ꩽ뒁딮땙딤듛ꭕ뗇떯뗇뙍뙪똈뙃뛔뛨뚐뛱", 45296));
         this.IooI();
      } else {
         int var3 = var1 ? var2._1l0 : var2._1lO;
         if (var3 < 1) {
            var3 = 1;
         }

         if (var3 > IlOI.length) {
            this.IIl1.IIIl.IIol(I1_0("낻녧뇚넣넋놫뇞넥놅눧뉒눭곁닺늂늯늈늖귙덐덼댍굿뎙뎰뎞\uaad1둛둴됇ꨳ듘듾", 45296));
         } else {
            int var4 = var3 - 1;
            if (this.III(var4) < I_l0[var4]) {
               this.IIl1.IIIl.IIol(I1_0("낲꾮녀녭넇뇣녞놧놏눧댷겢뉄뎒닋가늕닟덵더궛댕뎺돑뎷댗둸됕될됛둲듟뒸듏땠땅딥ꮬ뗧떉떾ꬂ똧", 45296));
            } else {
               int[] var5 = var1 ? II_[var4] : II1o[var4];
               if (this.IIo_() < var5.length / 2 + (I_l_[var4] == 0 ? 0 : 0)) {
                  this.IIl1.IIIl.IIol(I1_0("낸뇯녀넥녌뇿뇘놨놆뉠눆눮눌뉷닌늦닀돮극댝댿댓굍뎙뎬뎅\uaac7둛됳", 45296));
               } else {
                  if (I_l_[var4] == 0) {
                     this.II_1(I_lO[var4], I_l0[var4]);
                  }

                  for (byte var6 = 0; var6 < var5.length; var6 += 2) {
                     IO0l var7 = new IO0l(var5[var6], var5[var6 + 1]);
                     II(var7);
                     this.IIl1.IIIl.III0(var7);
                  }

                  this.IIl1.IIIl.l1_l();
                  this.IIl1
                     .IIIl
                     .IIol(
                        I1_0("낲꾮녀녭끽녨놊놧놀겪뉈뉥눔닫갅늯닀늋덶늍궃댕돽뎙뎶뎟둿ꫲ됹둓들꩔듰", 45296)
                           + (var1 ? I1_0("낻녀녢녭넺뇂뇺", 45296) : I1_0("낻녀녢", 45296))
                           + I1_0("냐녬꾋넽녌", 45296)
                           + var3
                           + I1_0("냑", 45296)
                     );
                  if (var1) {
                     var2._1l0 = var3 + 1;
                  } else {
                     var2._1lO = var3 + 1;
                  }

                  this.IIl1.I__O();
                  this.IooI();
               }
            }
         }
      }
   }

   private static void II(IO0l var0) {
      switch (var0.I1l) {
         case 1360:
            var0.III(73, 0).III(77, 13).III(103, 13).III(50, 13).III(101, 20).III(30, 1).III(93, 90);
            break;
         case 1654:
            var0.III(73, 0).III(50, 16).III(77, 15).III(103, 15).III(106, 0).III(30, 1).III(93, 30);
            break;
         case 1797:
            var0.III(73, 0).III(50, 25).III(103, 30).III(30, 1).III(93, 90);
      }
   }

   private void Il0l(int var1) {
      byte var2;
      short var3;
      switch (var1) {
         case 0:
            var2 = 30;
            var3 = 1140;
            break;
         case 1:
            var2 = 50;
            var3 = (short)(Math.random() < 0.5 ? 1195 : 1196);
            break;
         case 2:
            var2 = 70;
            var3 = 1142;
            break;
         default:
            var2 = 99;
            var3 = 1476;
      }

      int var4 = this.II__(1194);
      if (var4 == 0) {
         this.IIl1.IIIl.IIol(I1_0("낲꾮녀녭넇뇣녞놧놏눧뉅늶뉄닓닊늨걟늊댾덟뎵덛돴돞뎷뎖둸됔", 45296));
      } else if (var4 < var2) {
         this.IIl1.IIIl.IIol(I1_0("낲꾮녀녭넇뇣녞놧놏눧댷겢뉄", 45296) + var2 + I1_0("냐녟녆네꿓뇾놊놫넁눧뉈눢눋닢닌닠", 45296));
      } else {
         this.II_1(1194, var2);
         IO0l var5 = new IO0l(var3, 1);
         byte var6;
         byte var7;
         switch (var3) {
            case 1140:
               var7 = 10;
               var6 = 15;
               break;
            case 1142:
               var7 = 15;
               var6 = 30;
               break;
            case 1476:
               var7 = 20;
               var6 = 30;
               break;
            default:
               var7 = 12;
               var6 = 30;
         }

         var5.III(50, var7).III(77, var7).III(103, var7);
         if (var3 == 1476) {
            var5.III(30, 1);
         }

         var5.III(93, var6);
         if (!this.IIl1.IIIl.III0(var5)) {
            this.IIl1.IIIl.III0(new IO0l(1194, var2));
            this.IIl1.IIIl.IIol(I1_0("낸뇯녀넥녌뇿뇘놨놆뉠눆눮눌뉷닌늦닀돮극댝댿댓굍뎙뎬뎅\uaac7둛됳", 45296));
            this.IIl1.IIIl.l1_l();
         } else {
            this.IIl1.IIIl.l1_l();
            this.IIl1.IIIl.IIol(I1_0("낲꾮녀녭끽녨놊냘꼽뉮눆눱눌뉣닌늩닀늜돪덓댻덛", 45296) + III0(var3) + I1_0("냑", 45296));
            this.IIl1.I__O();
         }
      }
   }
}
