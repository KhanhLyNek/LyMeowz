package main;

import java.util.Calendar;
import java.util.Random;

final class IO_o {
   static final int l0O_ = 10;
   static final int l0OO = 5;
   static final int[] I_I0 = new int[]{5000, 20000, 50000, 200000, 25};
   static final String[] Il_ = new String[]{
      I111("⺠〦", 11972), I111("⺦⸏⽬⽉⽠⼫⼖⸭ㅡ⾵⾝", 11972), I111("⺯⺋⿱", 11972), I111("⺶う⽶⼁⼫⼷⾍", 11972), I111("⿕〨⽣⼁⼮⼸㆛\u2ffe", 11972)
   };
   static final int l0O0 = 8301;
   static final int l0Oo = 8302;
   static final int l00 = 8310;
   static final int l00I = 8311;
   static final int l00l = 8312;
   static final int l001 = 8313;
   static final String[] Il_I = new String[]{
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〞\u2e72ペゴヒㅽㅟㄡㄉ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〻⺕・ゔタ　ㅸ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔ㇂⹗ㅥ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〞\u2e72ペゴヒㅽㅟㄡㄉㆭ㇁⽲", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〻⺕・ゔタ　ㅸㄐㄢ\u2fd7", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔ㇂⹗ㅥㄐㄢ\u2fd7", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〣〞⸤ペンゞ⾠ㅞㅯㄌ\u31ec㇕", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〧〞ーゔタゝㅿㅗ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔケんㅨ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〣〞⸤ペンゞ⾠ㅞㅯ\u3103⼴", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〧〞ーゔタゝㅿㅗㅯ\u3103⼴", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔケんㅨㄐㄢ\u2fd7", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〿〓ヺゔァ⸙ㅿㅗ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〿〓ヺゔシんㄱㅈㄮ\u3100\u31e5", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〿〓ヺゔカんㅨㅔㄮ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘⺆〕サベㅣ⸑ㅿㄐㄧ⾽㇣", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘⺆〕サデ〹゜", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〿〓ヺゔカんㅨㅔㄮㅎ㇠⼕", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〞ちペゴヒㅥ⾇ㄬ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔ㇂⹕ㅤㄐㄻ\u3101", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔ㇂⸹ㅰㄐㄡㄉ⽨㇏", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〿〓ヺゔァ⸙ㅿㅗㅯ\u3103⼴", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〿〓ヺゔカんㅿㅘㅯ\u3103⼴", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〶〚ーパソ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〣〗ヸブゼょㅣㅙㄡㄋ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〳〄ムベ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〶〝ヾチゾんㅿ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〹〗ュツゲ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〤〙ヹバズ\u3097ㅣ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〶〆ュチタ\u3097", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〥〗ユツケ\u3097ㅣㅂㄶ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〣〞⸤ペンゞ⾠ㅞㅯㄖ\u31ec㇂ㆣ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔ㇂⹕ㅤㄐㄡㄆ⽀㇂", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔ㇂⹕ㅤㄐㄹㆎ㇣㇋", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔシんㄱㅄㆢ\u3103", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔゴ゛ㇱ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〴\u3097サデ\u2e76ょ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〳㇗ーゔシんㄱㅈㄮ\u3100\u31e5", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〦〃\u2e62ゔグ゚ㅸㅝ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〻゛・ボン㇣⾶ㅅㅯㄚㇿ⽡ㆨ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〻゛・ボンゆㅰㅙㅯㄊㅭ㇅", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〻゛・ボンやへㄐㄻㄜ⽨", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〞⹜ゔタ〆ㅿㅗㅯみ\u31e8㇂", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〞⹜ゔゴ゛ㇰㅀㅯㄝ⼢㇘", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〞⹜ゔタ〆ㅿㅗㅯみ⽂", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〞⹜ゔタ〆ㅿㅗㅯㄘㅭ㇂ㆬ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇺ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇹ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇸ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇿ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇾ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇽ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇼ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〯゜・ゔグゝㅿㄐㄬ⿋ㇽㆌㇳ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〣〗ーゔェ〟ㅼ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〶〔ヺ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〼〗ヱホ", 11972),
      I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻\u2fdf〨〘〳〗サヌゲ゜ㅹ", 11972),
      I111("⺊⺋ㆵ⽕⽠⽺⽏⾽⿊⼻⾔ま", 11972)
   };
   static final int[] I_Io = new int[]{
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      11,
      12,
      16,
      17,
      18,
      13,
      14,
      15,
      31,
      32,
      33,
      19,
      20,
      21,
      25,
      26,
      27,
      39,
      40,
      41,
      42,
      43,
      44,
      45,
      46,
      47,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      58,
      59,
      60,
      61,
      62,
      63,
      64,
      65,
      66,
      67,
      68,
      69,
      -1
   };
   private static final int[][][] IIII = new int[][][]{
      {{1, 20}, {20, 100}, {100, 500}, {500, 2000}, {2000, 5000}},
      {{1, 5}, {5, 20}, {20, 100}, {100, 500}, {500, 1000}},
      {{1000, 3000}, {3000, 20000}, {20000, 100000}, {100000, 10000000}, {10000000, 100000000}}
   };
   private final IO0 III0;
   private final IOo_ III0;
   private final Random III0 = new Random();
   private static final long I10l = 72000000L;

   IO_o(IO0 var1, IOo_ var2) {
      this.III0 = var1;
      this.III0 = var2;
   }

   private static int IIOl(int var0) {
      return var0 >= 58 ? 2 : (var0 >= 24 ? 1 : 0);
   }

   private static boolean III(long var0) {
      if (var0 == 0L) {
         return true;
      }

      long var2 = IO0I.IIIl();
      if (var2 - var0 < 72000000L) {
         return false;
      }

      Calendar var4 = Calendar.getInstance();
      var4.setTimeInMillis(var2);
      var4.set(11, 0);
      var4.set(12, 0);
      var4.set(13, 0);
      var4.set(14, 0);
      return var0 < var4.getTimeInMillis();
   }

   private static String IIIo(long var0) {
      return IO0O.IIIo(var0);
   }

   private String II(boolean var1, int var2, int var3) {
      if (var2 < 0) {
         return I111("⺌⺊㇅⽏⽠⼫㇟⿴⾜⾰⾒ロざ〰ざヶぇン゜ㅹㅙ⾈\u3103ㆭ㇚⼮㇊㉧㋈㈨", 11972);
      }

      String var4 = Il_I[var2];
      if (var1 && var4.startsWith(I111("⺐⺊\u2fe8⽔⽠⼻⼗ㅚ⿈⿻", 11972))) {
         var4 = I111("⺌あ⼢", 11972) + var4.substring(10);
      }

      return var4.replace(I111("⻡⻒", 11972), String.valueOf(var3));
   }

   private static int IIll(int var0, int var1) {
      return var0 >= var1 ? 100 : (int)(var0 * 100L / var1);
   }

   void llIl() {
      IOol var1 = this.III0.II;
      this.llI1();
      if (var1._1_ >= 0) {
         String var2 = I111("⺊⺋⽫\u31e6⼭⽿⼈ㅸ⾜⾳⾓⻞ざぷ。⸴ポラヒ", 11972)
            + this.II(false, var1._1_, var1._1_l)
            + I111("⻤⻋", 11972)
            + Il_[var1._1_1]
            + I111("⻭⻩⽊⽈ㆇ⼱⽞\u2fe9ㄝ⾲\u2fdaㄈホぷ〞ヺごソヒㅥㅘㆯ\u3100\u31e5㆖\u31eb", 11972)
            + var1._1_I
            + I111("⻫", 11972)
            + var1._1_l
            + I111("⻤⻋", 11972)
            + IIll(var1._1_I, var1._1_l)
            + I111("⻡⻊⼈⽲㆑⽿⼐⿵⿕ㄜ⾗〹ぎ⺲ざヶうソヒㅽ⾑ㄦㅎㇹ㇞ㆤㆄ㉮㈈㈩㈁㉥㋝㋹㋂", 11972)
            + var1._1__
            + I111("⻫", 11972)
            + 10;
         this.III0.II.IIII(17, 8302, var2, new String[]{I111("⺐⺑ㆡ⼁⼮⼷⼗ㅚ⿑⿑⾌\u2efc", 11972), I111("⺌〄⽻⼁⼮⼷⼗ㅚ⿑⿑⾌\u2efc", 11972)});
      } else {
         this.III0
            .II
            .IIII(
               17,
               8301,
               I111("⺐⸗⽫⼁⼣⾬⽞\u2feb⽜⾲\u2fdaぷぐ〾⺱ヸゔゥ⸗ㄱㅄㄧㄋ㇢ㆌㆨ⽏㉹㈈㈥ⳋ㋦㊈㋣㊑ⷨ㍃㌟㌽ⷐ㏩㎛㎹㌊㐸㑃㐾⪶㒴㓟㐲㒜㔰㐾㓾⮎㗯㖋㖩㔈㙡㘇㘨㚅㛫㚜", 11972),
               new String[]{I111("⺀〦", 11972), I111("⺆⸏⽬⽉⽠⼫⼖⸭ㅡ⾵⾝", 11972), I111("⺏⺋⿱", 11972), I111("⺐〈⼢⽂⼨ㆎ⼗", 11972)}
            );
      }
   }

   private void llI1() {
      IOol var1 = this.III0.II;
      if (III(var1.IOo)) {
         var1._1__ = 10;
         var1.IOo = IO0I.IIIl();
      }
   }

   boolean III0(int var1, int var2) {
      IOol var3 = this.III0.II;
      if (var1 == 8301) {
         if (var2 >= 0 && var2 <= 2) {
            this.Il_I(var2);
         }

         return true;
      } else if (var1 == 8302) {
         if (var3._1_ < 0) {
            return true;
         }

         if (var2 == 0) {
            this.llIO();
         } else if (var2 == 1) {
            this.III0.IIIl.IIol(I111("⺆あ⽬⼁⼶ㆴ⼟⾽⿔ㄼ⾃〹ず⺘ざ・ボズ⸵ㅼㄐㄹ⾋ㆭ", 11972) + this.II(false, var3._1_, var3._1_l));
            this.llI_();
            this.III0.I__O();
         }

         return true;
      } else {
         return false;
      }
   }

   private void llI_() {
      IOol var1 = this.III0.II;
      var1._1_ = -1;
      var1._1_I = 0;
      var1._1_l = 0;
      var1._1_1 = 0;
      var1._1_O = 0;
   }

   private void Il_I(int var1) {
      IOol var2 = this.III0.II;
      this.llI1();
      if (var2._1__ <= 0) {
         this.III0.IIIl.IIol(I111("⺆あ⽬⼁⹑⾼⽞⿳⿔ㅶ⾔〹ぐ⻨。サペセ゛\u2fd6ㅝㅯㄘ⽨ㆌㆣㄞ㉤㈈㈩㈇㋼㊊㋣㊪㏢㍙㌟㌽㌕ⵁ㎛㎮ⴢ㑱㐗㐸㐒㑴㓊㓲㒜㕱㕆㕮㔟⭟㗂㗪㖇㙠⢊㘨㙅㛰㛊⡽㚑", 11972));
      } else {
         this.llI_();
         var2._1_ = this.III0.nextInt(Il_I.length);
         int[] var3 = IIII[IIOl(var2._1_)][var1];
         var2._1_l = var3[0] + this.III0.nextInt(var3[1] - var3[0] + 1);
         var2._1__--;
         var2._1_1 = var1;
         var2.IOo = IO0I.IIIl();
         this.III0.IIIl.IIol(I111("⺆あ⽬⼁⼮⼷㇓⿳⾜⻊⹊\u2efaせぷ〘ヽポ⸔ゟㄱㅆ⾪ㅔㆭ", 11972) + this.II(false, var2._1_, var2._1_l));
         this.III0.I__O();
      }
   }

   private void llIO() {
      IOol var1 = this.III0.II;
      if (var1._1_I < var1._1_l) {
         this.III0.IIIl.IIol(I111("⺆あ⽬⼁⼣⼷⻎\u2ffc⾜⾳⾕ヹざぷ。ヽごソ゚ㄱㅞㄧㄇ⽊㇁\u31eb㆜ⳬ", 11972));
      } else if (this.III0.IIIl.IlII() <= 1) {
         this.III0.IIIl.IIol(I111("⺌⸃⽬⽉⽠⼫⼌\u2ffc⿒⾼\u2fdaひぐィ〘ヲゔ㇂⸕ㄱㅓㄧ⾹ㆭ㇘ㆹ⼻㉧㉏㉩", 11972));
      } else {
         int var2 = I_I0[var1._1_1];
         this.III0.II.IIlo(6, 3);
         var1.Il11 += var2;
         this.III0.IIIl.l1_l();
         this.III0.IIIl.l1_();
         this.III0.IIIl.IIol(I111("⺆あ⽬⼁⼮⼷㇓⿳⾜⻊⹊\u2efaせぷ", 11972) + IIIo(var2) + I111("⻤⺕\u2fe2⽏⼧", 11972));
         this.llI_();
         this.III0.I__O();
      }
   }

   private boolean IIIo(int var1, int var2) {
      return (var1 & 1 << var2 / 10) != 0;
   }

   private int II(boolean var1, int var2, int var3, int var4, String var5) {
      int var6 = IIll(var2, var3);
      if (var6 != 100) {
         for (byte var7 = 90; var7 >= 0; var7 -= 10) {
            if (!this.IIIo(var4, var7) && var6 >= var7) {
               var4 |= 1 << var7 / 10;
               this.III0
                  .IIIl
                  .IIol(
                     I111("⺊⺋⽫\u31e6⼭⽿⼈ㅸ⾆⿻", 11972)
                        + var5
                        + I111("⻤⿲\u2fe1⼁⼨⼰⾞⿳⾜⾯⾒ヹざ〿がサ", 11972)
                        + var2
                        + I111("⻫", 11972)
                        + var3
                        + I111("⻤⻋", 11972)
                        + var6
                        + I111("⻡⻊", 11972)
                  );
               break;
            }
         }
      } else {
         this.III0
            .IIIl
            .IIol(
               var1
                  ? I111("⺐⺊ㆽ⽑⽠⼫⼖⿸⿓⿻⾒ヺぁぷ　⹔ゔゑんㅿㅗㅯㄆ⽔㇅\u31ebㆈ㋨㉇㉧㈅㉤㋋㋭", 11972)
                  : I111("⺇⺋⿸⽂⽠⼲㆕⿳\u2fdb⿻⾘⺸ざぷㅧぶゔセゝㇱㅞㅯㄚ\u31e5ㅌㆥㆂ㈩㉆㈯㈏ⱂ㋉㋣㊔ⷤ㌌㌟㌼㎟㏥㎛㎽㎐⫅㐗㐾㒖㓭㒓㒣㒄㕱㕖㕮㔛⭍㖋㖈㔛㘨㙪⢟㘋㛣㚃㚶㚓⦣㜿㝐㜵㜕⥜㟗㟹㞎⛲㠘", 11972)
            );
      }

      return var4;
   }

   void Il_l(int var1) {
      IOol var2 = this.III0.II;
      if (var2._1_ >= 0 && I_Io[var2._1_] == var1) {
         var2._1_I++;
         var2._1_O = this.II(false, var2._1_I, var2._1_l, var2._1_O, this.II(false, var2._1_, var2._1_l));
      }

      if (var2._1_0 >= 0 && I_Io[var2._1_0] == var1) {
         var2._1_o++;
         var2._1O1 = this.II(true, var2._1_o, var2._1O, var2._1O1, this.II(true, var2._1_0, var2._1O));
      }
   }

   void Il_1(int var1) {
      IOol var2 = this.III0.II;
      if (var2._1_ == 58) {
         var2._1_I += var1;
         var2._1_O = this.II(false, var2._1_I, var2._1_l, var2._1_O, this.II(false, var2._1_, var2._1_l));
      }

      if (var2._1_0 == 58) {
         var2._1_o += var1;
         var2._1O1 = this.II(true, var2._1_o, var2._1O, var2._1O1, this.II(true, var2._1_0, var2._1O));
      }
   }

   void llI0() {
      IOol var1 = this.III0.II;
      if (var1._lOO != 0) {
         this.llIo();
         this.III0
            .II
            .IIII(
               10,
               8310,
               I111("⺐⸗⽫⼁⼣⾬⽞\u2fe9⿔ㄘ\u2fdaまけキ〆サビ〿ヒㅲㅘㄠㅎ\u31ef㇍ㆥㆍ㈩㉀Ⲟ㈏㊥㋇Ⱔ㊃㌡㍂\u2d9e㌰㍝㎣", 11972),
               new String[]{
                  I111("⺇⺋\u31eb⽂⽠⼱\u2e7d⿳\u2fdb⿑⾘へざ〰ざヽ\u2e6dズ", 11972),
                  I111("⺊⺋⽫\u31e6⼭⽿⼈ㅸ⾜⾙⾛ぷたそ〭", 11972) + var1._1Ol + I111("⻫", 11972) + 5 + I111("⺙", 11972),
                  I111("⿔\u3040⽭⼁⼋⼾⼓⿸", 11972),
                  I111("⺐〈⼢⽂⼨ㆎ⼗", 11972)
               }
            );
      } else {
         this.III0
            .II
            .IIII(
               10,
               8310,
               I111("⺐⸗⽫⼁⼣⾬⽞\u2fe9⿔ㄘ\u2fdaまけキ〆サビ〿ヒㅲㅘㄠㅎ\u31ef㇍ㆥㆍ㈩㉀Ⲟ㈏㊥㋇Ⱔ㊃㌡㍂\u2d9e㌰㍝㎣", 11972),
               new String[]{I111("⿔\u3040⽭⼁⼋⼾⼓⿸", 11972), I111("⺐〈⼢⽂⼨ㆎ⼗", 11972)}
            );
      }
   }

   private void llIo() {
      IOol var1 = this.III0.II;
      if (III(var1.IOoI)) {
         var1._1Ol = 5;
         var1.IOoI = IO0I.IIIl();
      }
   }

   private void lll() {
      IOol var1 = this.III0.II;
      this.llIo();
      if (var1._1_0 >= 0) {
         if (var1._1_o >= var1._1O) {
            this.III0
               .II
               .IIII(
                  10,
                  8312,
                  I111("⺊⺋⽫\u31e6⼭⽿⼈ㅸ⾜⻊⼙〹ぐ〸ゖ・ゔェ゚ㇱㅞㄧㅂㆭ㇄ㄨ㆓㈩㉆㈯ⳋ㋫㊄", 11972) + (var1._1OI + 1) * 10 + I111("⻤⺀⽣⽑⼳⼪⼒⿸⾜⾹⾛ぷた", 11972),
                  new String[]{I111("⺊⺋ㆯ⽏⽊⼫⼖⸭ㅣ⾵⾝", 11972), I111("⿔⸐⽬⽆", 11972)}
               );
         } else {
            this.III0
               .II
               .IIII(
                  10,
                  8312,
                  I111("⺊⺋⽫\u31e6⼭⽿⼈ㅸ⾜⾳⾓⻞ざぷ。⸴ポラヒ", 11972) + this.II(true, var1._1_0, var1._1O) + I111("⻪⻃⸒⿂⽠⼷㇟⾽⺭\u2e6bㄙぺ〘", 11972) + var1._1_o,
                  new String[]{I111("⺋⺨", 11972), I111("⺌〄⽻⼁⼢㆐⽴⿓⿔⾲ㄽぴ〘〡⺓ゟペ〳る", 11972)}
               );
         }
      } else if (var1._1Ol <= 0) {
         this.III0
            .II
            .IIII(10, 8312, I111("⿔⸀⼢⽉ㇿ⼫⽞⿳⿔⾲ㄽぴ〘〡⺓サプセゝㄱㅘㆻ\u3103ㆭ㇂ㆪ㆓㈥㈈㈯㊅㋼㊄㊠㊊ⷜ㌀㈮ⷡ㌓㎼㏕㎽㌙㑡㐗㐻㐔㓽", 11972), new String[]{I111("⺋⺨", 11972), I111("⺐〈⼢⽂⼨ㆎ⼗", 11972)});
      } else {
         int var2 = this.III0.nextInt(5);
         var1._1_0 = this.III0.nextInt(Il_I.length);
         int[] var3 = IIII[IIOl(var1._1_0)][var2];
         var1._1O = var3[0] + this.III0.nextInt(var3[1] - var3[0] + 1);
         var1._1OI = var2;
         var1._1_o = 0;
         var1._1O1 = 0;
         var1.IOoI = IO0I.IIIl();
         this.III0.I__O();
         this.III0
            .II
            .IIII(
               10,
               8312,
               I111("⺊⺋⽫\u31e6⼭⽿⼈ㅸ⾜⾳⾓⻞ざぷ。⸴ポラヒ", 11972) + this.II(true, var1._1_0, var1._1O) + I111("⻪⻃⸒⿂⽠⼷㇟⾽⺭\u2e6bㄙぺ〘", 11972) + var1._1_o,
               new String[]{I111("⺋⺨", 11972), I111("⺌〄⽻⼁⼢㆐⽴⿓⿔⾲ㄽぴ〘〡⺓ゟペ〳る", 11972)}
            );
      }
   }

   private void lllI() {
      IOol var1 = this.III0.II;
      var1._1_0 = -1;
      var1._1_o = 0;
      var1._1O = 0;
      var1._1OI = 0;
      var1._1O1 = 0;
   }

   boolean IIl(int var1, int var2) {
      IOol var3 = this.III0.II;
      if (var1 == 8310) {
         if (var3._lOO == 0) {
            if (var2 == 0) {
               this.III0.II.Ilo(5);
            }

            return true;
         } else {
            if (var2 == 0) {
               this.III0.IIIl.IIol(I111("⺇⺋\u31eb⽂⽠⼱\u2e7d⿳\u2fdb⿻⾘へざ〰ざヽ\u2e6dズヒㄹ〡⾚ㄇㆭ㇘ㄡㆄ㈩㉞㈮ⳙ㋱㊄㊷ⱍ㍵㌌㌟㌰㎟㏲㏜㏺㎚⪽㑇㑶㐗㓵㓝㒵㓘㔰㕌㔦㓝㗭㖋㓛㑙⣫㙄㙦㘍⡓㚃㚶㚓⧣㜿⧡㝽㜞⤸㟔㟹㞗㡱㡐㠹㠝㣽㣗", 11972));
            } else if (var2 == 1) {
               this.lll();
            } else if (var2 == 2) {
               this.III0.II.Ilo(5);
            }

            return true;
         }
      } else if (var1 == 8312) {
         if (var3._1_0 < 0) {
            return true;
         }

         if (var2 == 0) {
            if (var3._1_o >= var3._1O) {
               int var4 = (var3._1OI + 1) * 10;
               var3._1Ol--;
               this.lllI();
               var3._l0I += var4;
               var3._l0 += var4;
               this.III0.IIIl.IIol(I111("⺆あ⽬⼁⼶ㆴ⼟⾽⿒⾳ㅗぷ〘ㅆ㇆\u2e76プン", 11972) + IIIo(var4) + I111("⻤⺀⽣⽑⼳⼪⼒⿸⾜⾹⾛ぷたべ", 11972));
               this.III0.I__O();
            }
         } else if (var2 == 1 && var3._1_o < var3._1O) {
            this.III0
               .II
               .IIII(
                  10,
                  8313,
                  I111("⺆あ⽬⼁⼣⾬⽞\u2ffe⿔ㅴ⾙〹さ〢⺧・ゔセ⸕ㅨㄐㄡㄆ\u31e4⽫ㆦ㇊㉿ⳍ㉧㈈㉥㋝㋼㋨㍏\u2d9f㍊㍾㌕\u2d7b㏂㏺㎗㑰㑞⪑㐘㒴㓅⨷㓑㕲⮎㔠㕍㗿⬖㗪㖄⢭㙓㙦㙔㚤㛏㝲⠂㝴㜿㝐㜵㜕⥜㟗㟹㞎⛲㠖㠡㠆㣼㣜㢶㣐㥡㥉㦭㤕㦥", 11972),
                  new String[]{I111("⿔〰⽬⽆⽠⾢", 11972), I111("⺐〈⼢⽂⼨ㆎ⼗", 11972)}
               );
         }

         return true;
      } else if (var1 == 8313) {
         if (var3._1_0 >= 0 && var2 == 0 && var3._1_o < var3._1O) {
            this.III0.IIIl.IIol(I111("⿔⸀⼢⽉ㆧ⼦⽞⿳⿔⾲ㄽぴ〘〡⺓サブゲ゜ㅶㄞ", 11972));
            var3._1Ol--;
            this.lllI();
            this.III0.I__O();
         }

         return true;
      } else {
         return false;
      }
   }
}
