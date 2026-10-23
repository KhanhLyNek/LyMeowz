package main;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

final class IOO0 {
   static final String lI1l = "HALLOWEEN";
   static final String lI11 = "CHRISTMAS";
   static final String lI1_ = "HUNG_VUONG";
   static final String lI1O = "TRUNG_THU";
   static final String lI10 = "LUNAR_NEW_YEAR";
   static final String lI1o = "INTERNATIONAL_WOMANS_DAY";
   private static final Object[][] III1 = new Object[][]{
      {I1_l("廍廵廱废庯彃彵弟弮忇忮従徴恆", 24193), 1, 20, 2, 25},
      {I1_l("廈廮廫庛庯归彺弎弰志忹得徹恋恤思怼惑惡悝悲慈慪愓", 24193), 3, 1, 3, 10},
      {I1_l("廉廵廱庙庢彊彮引強忟", 24193), 4, 1, 4, 25},
      {I1_l("廕廲廪庐庺彃彯弒弬", 24193), 9, 15, 10, 5},
      {I1_l("廉廡廳庒庲彋彾弟強", 24193), 10, 20, 11, 5},
      {I1_l("廂廨廭店庮彈彶弛弪", 24193), 12, 15, 1, 5}
   };
   static final String[] IlO = new String[]{
      I1_l("廍廵廱废庯彃彵弟弮忇忮従徴恆", 24193),
      I1_l("廈廮廫庛庯归彺弎弰志忹得徹恋恤思怼惑惡悝悲慈慪愓", 24193),
      I1_l("廉廵廱庙庢彊彮引強忟", 24193),
      I1_l("廕廲廪庐庺彃彯弒弬", 24193),
      I1_l("廉廡廳庒庲彋彾弟強", 24193),
      I1_l("廂廨廭店庮彈彶弛弪", 24193)
   };
   private static String lI_ = "";
   private static boolean Io__;
   static final int lo1o = 8401;
   static final int lo_ = 8402;
   static final int lo_I = 8403;
   private final IO0 IIlI;
   private final IOo_ IIlI;
   private final Random IIl = new Random();
   private String lI_I;
   private long I1oO;
   static final int lo_l = 901;
   static final int lo_1 = 1348;
   static final int lo__ = 1355;
   static final int lo_O = 1354;
   static final int lo_0 = 1356;
   private static final int[] I_lI = new int[]{1702, 1721, 1724, 1727, 1731, 1732};

   IOO0(IO0 var1, IOo_ var2) {
      this.IIlI = var1;
      this.IIlI = var2;
   }

   static String IIlo() {
      return lI_;
   }

   static boolean IIl(String var0) {
      return lI_.equals(var0);
   }

   static String IIlO(String var0) {
      if (var0.equals(I1_l("廉廡廳庒庲彋彾弟強", 24193))) {
         return I1_l("廉廁廓庲庒彫彞弿弗", 24193);
      } else if (var0.equals(I1_l("廂廨廭店庮彈彶弛弪", 24193))) {
         return I1_l("廆廉幞庰庚弼彈弳弗忰", 24193);
      } else if (var0.equals(I1_l("廉廵廱庙庢彊彮引強忟", 24193))) {
         return I1_l("廆廉䁨廾庉䇉弛弒往忶忐忶徣憤憒怼怖", 24193);
      } else if (var0.equals(I1_l("廕廲廪庐庺彃彯弒弬", 24193))) {
         return I1_l("廕廒廊庰庚弼彏弲弌", 24193);
      } else if (var0.equals(I1_l("廍廵廱废庯彃彵弟弮忇忮従徴恆", 24193))) {
         return I1_l("廕䀟廋廾庳彻彎弣従忶得廆弔恺", 24193);
      } else {
         return var0.equals(I1_l("廈廮廫庛庯归彺弎弰志忹得徹恋恤思怼惑惡悝悲慈慪愓", 24193)) ? I1_l("廐廕䁮庽廝彨䆄彺弉忰䅒忶徛绻怓恪恞患", 24193) : "";
      }
   }

   static String IIII(int var0, int var1) {
      int var2 = var0 * 100 + var1;

      for (int var3 = 0; var3 < III1.length; var3++) {
         Object[] var4 = III1[var3];
         int var5 = (Integer)var4[1] * 100 + (Integer)var4[2];
         int var6 = (Integer)var4[3] * 100 + (Integer)var4[4];
         boolean var7 = var5 <= var6 ? var2 >= var5 && var2 <= var6 : var2 >= var5 || var2 <= var6;
         if (var7) {
            return (String)var4[0];
         }
      }

      return "";
   }

   static String IIl(long var0) {
      String var2 = null;

      try {
         var2 = System.getProperty(I1_l("廯廒廐庲应彨彞彴弜忮忒徸征", 24193));
      } catch (Exception var4) {
      }

      if (var2 != null && var2.length() > 0 && !var2.equalsIgnoreCase(I1_l("廀廵廫庑", 24193))) {
         Io__ = true;
         if (var2.equalsIgnoreCase(I1_l("廏廯廱庛", 24193))) {
            return "";
         }

         for (int var5 = 0; var5 < IlO.length; var5++) {
            if (IlO[var5].equalsIgnoreCase(var2)) {
               return IlO[var5];
            }
         }

         return "";
      } else {
         Calendar var3 = Calendar.getInstance();
         var3.setTime(new Date(var0));
         return IIII(var3.get(2) + 1, var3.get(5));
      }
   }

   void III1(long var1) {
      if (var1 >= this.I1oO) {
         this.I1oO = var1 + 30000L;
         String var3 = IIl(var1);
         if (this.lI_I == null || !this.lI_I.equals(var3)) {
            String var4 = this.lI_I;
            this.lI_I = var3;
            lI_ = var3;
            this.IIlI.IIIl.II(var4 == null ? "" : var4, var3, var4 != null);
         }
      }
   }

   int II__(int var1) {
      int var2 = 0;
      IOol var3 = this.IIlI.II;

      for (int var4 = 0; var4 < var3.III.length; var4++) {
         if (!var3.III[var4].II1_() && var3.III[var4].I1l == var1) {
            var2 += var3.III[var4].lo0I;
         }
      }

      return var2;
   }

   void II_l(int var1, int var2) {
      IOol var3 = this.IIlI.II;

      for (int var4 = 0; var4 < var3.III.length && var2 > 0; var4++) {
         IO0l var5 = var3.III[var4];
         if (!var5.II1_() && var5.I1l == var1) {
            if (var5.lo0I > var2) {
               var5.lo0I -= var2;
               var2 = 0;
            } else {
               var2 -= var5.lo0I;
               var3.III[var4] = new IO0l();
            }
         }
      }
   }

   void ll1() {
      boolean var1 = this.Il_();
      this.IIlI
         .II
         .IIII(
            21,
            8401,
            I1_l("廉廁廓庲庒彫彞弿弗徸忁徣徜怴恅绩恻惄惎惮悎懿愋愾愁罋憇憡憌拾打扢戆扬抿拝抵抓挻捙挶挖推", 24193),
            new String[]{
               I1_l("廍幀廒廔底䇅彋彺弒䄡忘忶徘恵怹怣怄繧", 24193), I1_l("廍幀廒廔庅弭弋彺弑䅁忇忶從纭恜恘怜惱悏悿悘翻", 24193), var1 ? I1_l("弮䁻廜廔庐彵䇾弴彙忨忟弻", 24193) : I1_l("弮䁻廜廾废䆭录弽彳徭徇忶徛恳绾怱", 24193)
            }
         );
   }

   private boolean Il_() {
      IOol var1 = this.IIlI.II;
      int var2 = IO0I.IIol();
      if (var1._1O0 != var2) {
         var1._1O0 = var2;
         var1._1Oo = 1;
      }

      return var1._1Oo > 0;
   }

   private String IIIo(int var1) {
      int var2 = this.II__(901);
      int var3 = this.II__(1355);
      int var4 = this.II__(1354);
      return I1_l("廉䁹廏廾庶䆥彔彺弴忹得徇往绣", 24193)
         + (var1 > 1 ? I1_l("庡廘", 24193) + var1 : "")
         + I1_l("庋廫䀆庱廝彾忛弴彙忬忖徯忕", 24193)
         + var2
         + I1_l("庮", 24193)
         + 99 * var1
         + I1_l("庋廧廖䀑廝帍䇊弴弞徸応䅯徚怴恇怠悐惹悏悬怀愬", 24193)
         + var3
         + I1_l("庮", 24193)
         + var1
         + I1_l("庋廧廖䁻庄弼彏弨弘忶忐忶征恦惞恲怹惱惃悢悂慻慎愯愇憨", 24193)
         + var4
         + I1_l("庮", 24193)
         + 3 * var1;
   }

   private boolean II0l(int var1) {
      return this.II__(901) >= 99 * var1 && this.II__(1355) >= var1 && this.II__(1354) >= 3 * var1;
   }

   boolean IIl_(int var1, int var2) {
      if (var1 != 8401) {
         if (var1 != 8402 && var1 != 8403) {
            return false;
         }

         if (var2 == 0) {
            this.IlOI(var1 == 8402 ? 1 : 10);
         }

         return true;
      } else {
         if (var2 == 0 || var2 == 1) {
            int var3 = var2 == 0 ? 1 : 10;
            if (!this.II0l(var3)) {
               this.IIlI.II.IIII(21, 0, this.IIIo(var3), new String[]{I1_l("廕䁋废庽底䇍归", 24193)});
            } else {
               this.IIlI.II.IIII(21, var3 == 1 ? 8402 : 8403, this.IIIo(var3), new String[]{I1_l("徑䁳廑庹廝忡", 24193), I1_l("廕䁋废庽底䇍归", 24193)});
            }
         } else if (var2 == 2) {
            this.ll1I();
         }

         return true;
      }
   }

   private void IlOI(int var1) {
      IOol var2 = this.IIlI.II;
      if (!this.II0l(var1)) {
         this.IIlI.IIIl.IIol(I1_l("廃䀁廑廾庖彴忏弴弞徸度䄱忕恺恔性怈恺惁惮悁慥翬愿慉悙罤懦憑粥扌扢戩籙拯択抖籅捴挚挔挙掷揧掠紃搲", 24193));
      } else if (this.IIlI.IIIl.IlII() < var1) {
         this.IIlI.IIIl.IIol(I1_l("廉幀廑庶廝彨彉弻弗忿得徽徝惠恝怵恑憁繈惮悎慤翼慪愝懺罶憨憂", 24193));
      } else {
         this.II_l(901, 99 * var1);
         this.II_l(1355, var1);
         this.II_l(1354, 3 * var1);

         for (int var3 = 0; var3 < var1; var3++) {
            IO0l var4 = new IO0l(1356, 1);
            var4.III(87, 1);
            var4.III(93, 35);
            var4.III(174, 2025);
            this.IIlI.IIIl.III0(var4);
         }

         this.IIlI.IIIl.l1_l();
         this.IIlI.IIIl.IIol(I1_l("廃䀁廑廾库彴䆖弴彙庉帇䄵徖怴恻纋态悰惤繷悂愬慦愫慉懙懒缱", 24193) + (var1 > 1 ? I1_l("庡廘", 24193) + var1 : ""));
         this.IIlI.I__O();
      }
   }

   private void ll1I() {
      IOol var1 = this.IIlI.II;
      boolean var2 = this.Il_();
      if (!var2 && var1.lOoO < 50) {
         this.IIlI.IIIl.IIol(I1_l("廊廈幋庰庚弼帪䆽彙徭徇忶徛恳绾怱恑憁繬惮慝翗慈慫", 24193));
      } else if (this.IIlI.IIIl.IlII() <= 0) {
         this.IIlI.IIIl.IIol(I1_l("廕幚廖廾忬䇏弛幋䇞忡徖忶徽惷恊恲怕繝惁惮懼翟愋愸羺懡憇恶缾执戃戮糀择抱", 24193));
      } else {
         if (var2) {
            var1._1Oo--;
         } else {
            var1.lOoO -= 50;
         }

         int var3 = I_lI[this.IIl.nextInt(I_lI.length)];
         int var4 = var3 != 1731 && var3 != 1732 ? 15 : 30;
         IO0l var5 = new IO0l(var3, 1);
         var5.III(50, 5 + this.IIl.nextInt(var4 - 4));
         var5.III(77, 5 + this.IIl.nextInt(var4 - 4));
         var5.III(103, 5 + this.IIl.nextInt(var4 - 4));
         this.IIlI.IIIl.III0(var5);
         this.IIlI.IIIl.l1_l();
         this.IIlI.IIIl.l1_();
         IOO.III var6 = IOO.II(var3);
         this.IIlI
            .IIIl
            .IIol(
               (var2 ? I1_l("弮䁻廜廾庐彵䇾弴彙忨忟弻忕恠恛悲怟惸悏悭怙慢慌慫", 24193) : I1_l("弮䁻廜廾庉彴忛弴弑徸忔弢徛恳怓恿恄悠悏悠悊翁慈", 24193))
                  + I1_l("庋廢䀞庰廝彲当䇷弗徸度幦䄖恷怉恲", 24193)
                  + (var6 == null ? "" + var3 : var6.II1o)
            );
         this.IIlI.I__O();
      }
   }
}
