package main;

import java.util.Random;

final class I0I0 {
   static final int __l0 = 56;
   private static final int __lo = 1229;
   private static final int __1 = 0;
   private static final int __1I = 6;
   private final IO0 II_;
   private final IO00 IIII;
   private final Random IIlo = new Random();

   I0I0(IO0 var1, IO00 var2) {
      this.II_ = var1;
      this.IIII = var2;
   }

   private IOol II() {
      return this.II_.II;
   }

   private int IlOO() {
      int var1 = this.II().lOlI;
      return var1 == 0 ? 24 : (var1 == 1 ? 26 : 25);
   }

   private int IlO0() {
      IOol var1 = this.II();
      int var2 = this.IlOO();

      for (int var3 = 0; var3 < var1.I__l.length; var3++) {
         IOO.IIIO var4 = IOO.II(var1.I__l[var3]);
         if (var4 != null && var4.lO0I == var2) {
            return var4.l1__;
         }
      }

      return 0;
   }

   private int IlOl() {
      int var1 = 0;
      IO0l[] var2 = this.II().III;

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (!var2[var3].II1_() && var2[var3].I1l == 1229) {
            var1 += var2[var3].lo0I;
         }
      }

      return var1;
   }

   private int IlOo() {
      IO0l[] var1 = this.II().III;

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (!var1[var2].II1_() && var1[var2].I1l == 1229) {
            return var2;
         }
      }

      return -1;
   }

   private void I110(int var1) {
      IO0l[] var2 = this.II().III;

      for (int var3 = 0; var3 < var2.length && var1 > 0; var3++) {
         if (!var2[var3].II1_() && var2[var3].I1l == 1229) {
            if (var2[var3].lo0I > var1) {
               var2[var3].lo0I -= var1;
               var1 = 0;
            } else {
               var1 -= var2[var3].lo0I;
               var2[var3] = new IO0l();
            }
         }
      }
   }

   private boolean Iloo() {
      IO0l[] var1 = this.II().II;

      for (int var2 = 0; var2 < 5; var2++) {
         if (var1[var2] == null || var1[var2].II1_() || var1[var2].I1l < 650 || var1[var2].I1l > 662) {
            return false;
         }
      }

      return true;
   }

   void IooI() {
      this.IIII
         .II(
            0,
            I1ol("⼼\u2fefㅋ\u2fe5\u2ef5モが〩\u3040〉⹅ピーわㅻㄙㄠㄒㇻ㆕ㆺㄓ㉽\u321f㉚㈡㋩㌝㍭㊂㌪㍊㎺㌉㎦㎔㏤㎏㖲⫂㐴㑿㐐⩲㓝㓻㒙㒸㔘㔺㖖㖻", 12136),
            new String[]{
               I1ol("⼦⽴⿏⿏⾇にし〸⺧】", 12136),
               I1ol("⼠ㅊ⿅⿏⾐ぶせ⺆〔たヵ⹄", 12136),
               I1ol("⼼\u2fe8\u2fd6\u2fe5⿕〳〒", 12136),
               I1ol("⼳⿋⿰\u2fff", 12136) + (this.II()._11I + 1) + I1ol("⼵", 12136)
            }
         );
   }

   void II__(int var1, int var2) {
      if (var1 == 0) {
         if (var2 == 0) {
            this.IIII
               .II(
                  5,
                  I1ol("⼼\u2fe6⾆⾶ㅙ〣ぅ〨゚』ゾビセㅋセㅐㅸㄔㇾ⼊ㇴㆇⲳ㉞㉰㈛㋼㋌㊢㊌㌪㍋ⶃ㍇㏲㏍㎭㌉㑬㐁㐳⪶", 12136),
                  new String[]{I1ol("⼻\u2fef⿉⾵⿄ぷお〨り】ゾノ⸵", 12136), I1ol("⼫\u2fefㄙ\u2fe5⾐⺢き", 12136), I1ol("⼼ㅬ⾆⾦⾌⻒か", 12136)}
               );
            return;
         }

         if (var2 == 2) {
            this.IIII
               .II0_(
                  I1ol("⼼⿈⿶\u2fe5⿕〳〒ち〷〗ヷノブナㄴㄙ", 12136)
                     + this.II().II1o
                     + I1ol("⽈⾪⾆⾉⾲〹", 12136)
                     + this.II()._11I
                     + (this.II()._11l > 0 ? I1ol("⽈⾯", 12136) + this.II()._11l / 1000 + I1ol("⼛⾮", 12136) : "")
               );
            return;
         }

         if (var2 == 3) {
            if (!this.II_.IIIl.II.Ill0()) {
               this.II_.IIIl.IIol(I1ol("\u2e78\u2fe6⿈⾢⿄だパち『〘ㄮ\u2e60サホㅶㅌㄡ⾰ㇸ㆕ㆠ⽞㉢", 12136));
            }

            return;
         }

         if (var2 != 1) {
            return;
         }

         int var3 = this.IlO0();
         boolean var4 = var3 == 0;
         String var5 = this.II().lOlI == 0
            ? I1ol("⼻⿲\u2fd6⾠⾖〣ぉ〠」〚ヴヒシゔ", 12136)
            : (this.II().lOlI == 1 ? I1ol("⼥\u2fe6⾆⾵⾌ぬが〦\u3040〝ヿ", 12136) : I1ol("⼫\u2fe6⾆⻔⼉だ。〭〉ゕヰゝゴゔㇺㅗㅸㄔㇾ々⼋㆝㉵", 12136));
         int var6 = var4 ? 9999 : 999;
         this.IIII
            .II(
               6,
               I1ol("⼔⾶\u2fda⾑⾅〣け\u2efc\u3040〛⸿ツーゕㅽらヹㄞㆶ㇁ㆡㆊⳕ㉅㉰㈄ⱷ㊍", 12136)
                  + var5
                  + I1ol("⽈", 12136)
                  + (var4 ? 1 : var3 + 1)
                  + I1ol("⽢⿻⾑⾹⾦ヮ。〪ろ』ゾドォも\u2fddㅍㅸㄜ⽯\u318fㇴ", 12136)
                  + this.IlOl()
                  + I1ol("⽇", 12136)
                  + var6
                  + I1ol("⽢⿻⾔⾹⾣なッち〖ゟヰペユホㄫㄉㅶㅇㆦㆅㇺ㇃㈢㈁㉚㈓㊼㋑㊋㊂㏫㌉㌦㌀ⵋ㏆㏾㏃㐻㐘", 12136),
               new String[]{I1ol("\u2e78ㅔ⿈⾢⿄ヾ", 12136), I1ol("⼼ㅬ⾆⾦⾌⻒か", 12136)}
            );
      } else if (var1 == 5) {
         if (var2 == 0) {
            this.IIII.II0O(I1ol("⼼⿏\u2fef⾀⾪ぜぱ〔", 12136));
         } else if (var2 == 1) {
            if (!this.Iloo()) {
               this.IIII
                  .II(22, I1ol("⼦\u2fe0⸖\u2e64⾍〣おア〙たリハソゕㅽㄙㄺ⾼ㆶイ⼳㇓㈧㈑㈽㊜㋠㊍㊸㊙㍫㍇㌯㍇㏤\u2d6e㏤㎫⫥㑘㑠㐛㐗⩚㓈㓻㒈⯊㕑㕷㔂㗴㖔㖽㔁㙸㘐㘬㘆㛸㛕⠌㚄㜩㝜㜮⧙㟵㞊", 12136), new String[]{I1ol("⼧⿌", 12136)});
            } else {
               this.II_.II.Il11(515);
            }
         }
      } else if (var1 == 6 && var2 == 0) {
         this.l_I0();
      }
   }

   private void III1(int var1, boolean var2) {
      IOo_ var3 = this.II_.IIl1;
      var3.II(new IO0o(-81).II(0).II(I1ol("⼻\u2fec⿏⾩⾈〣〛", 12136)).II(I1ol("⼆⿲⿊⾩", 12136)).III(56));
      int var4 = this.IlOo();
      var3.II(new IO0o(-81).II(1).II(1).II(var4 < 0 ? 0 : var4));
      if (var2) {
         var3.II(new IO0o(-81).II(7).III(var1));
      } else {
         var3.II(new IO0o(-81).II(8));
      }
   }

   private void l_I0() {
      IOol var1 = this.II();
      if (this.IlOl() != 0) {
         if (var1.Il11 >= 10000000L && var1.lOoO >= 99 && var1.IO_l >= 60000000000L) {
            int var2 = this.IlO0();
            int var3 = var1.lOlI == 0 ? 11162 : (var1.lOlI == 1 ? 11194 : 11193);
            IOo_ var4 = this.II_.IIl1;
            if (var2 == 0) {
               if (this.IlOl() < 9999) {
                  int var5 = 9999 - this.IlOl();
                  this.II_
                     .IIIl
                     .IIol(I1ol("⼦\u2fe0⸖\u2e64⾍〣ぁコ『たリフサ⹄ㅯㄙ", 12136) + var5 + I1ol("⽈\u2fe5⽋\u2fe5⾏ヮげち『⺐ヿんブコㇹㅀㅸ\u3103ㅺ㇘ㇴモ\u2cf5㈑㈢Ⲽ㋧㊍㏝ⱔ㍤㌉㌯ⷐ㏶㎅㎰㎂㐬", 12136));
                  return;
               }

               this.III1(var3, true);
               this.II_.IIIl.II11(this.IlOO(), 1);
               this.I110(9999);
               var4.II(new IO0o(124).III(56).II(I1ol("⼫\u2fef⽜⾦⿄の⻉〯〇たヽヒゲホㅴㅑㆱㅖ", 12136)));
               this.II_.IIIl.IIol(I1ol("⼠ㅊ⿅\u2fe5⾗とか〭「たリフ〼ゕㅲㄙㄻㆃㇸ㇒ㇵ", 12136));
            } else {
               if (this.IlOl() < 999) {
                  int var7 = 999 - this.IlOl();
                  this.II_
                     .IIIl
                     .IIol(I1ol("⼦\u2fe0⸖\u2e64⾍〣ぁコ『たリフサ⹄ㅯㄙ", 12136) + var7 + I1ol("⽈\u2fe5⽋\u2fe5⾏ヮげち『⺐ヿんブコㇹㅀㅸ\u3103ㅺ㇘ㇴモ\u2cf5㈑㈢Ⲽ㋧㊍㏝ⱔ㍤㌉㌯ⷐ㏶㎅㎰㎂㐬", 12136));
                  return;
               }

               if (var2 >= 9) {
                  var4.II(new IO0o(124).III(56).II(I1ol("⼻\u2fec⿏⾩⾈〣ぁ⺦、たヰペㅬㅚㅳㄙぉ㆔ㆶイ⽵ㆇ㈲㉒\u2cf5\u321f㊮㋙Ⱍ㊂㌪㈸㌩㍉", 12136)));
                  return;
               }

               boolean var6 = this.IIlo.nextInt(30) < 1;
               this.III1(var6 ? var3 : 15313, var6);
               if (var6) {
                  this.II_.IIIl.II11(this.IlOO(), var2 + 1);
               }

               this.I110(var6 ? 999 : 99);
               var4.II(new IO0o(124).III(56).II(var6 ? I1ol("⼫\u2fef⽜⾦⿄の⻉〯〇たヽヒゲホㅴㅑㆱㅖ", 12136) : I1ol("⼦\u2fe0⿓\u2fe5⾀⻒ざだ", 12136)));
               this.II_.IIIl.IIol(var6 ? I1ol("⼦⽥⿈⾢⿄ばぉ〨「〓ゾドゴ〛ㅴㅑㅸㄔㅢ㇛ㆳ㇒", 12136) : I1ol("⼼⸷⾆⾦⾌⺦ざち》ゖン゜", 12136));
            }

            var1.Il11 -= 10000000L;
            var1.lOoO -= 99;
            this.II_.IIIl.l1_l();
            this.II_.IIIl.l1_();
            this.II_.I__O();
         } else {
            this.II_.IIIl.IIol(I1ol("⼪ㄦ⿈\u2fe5⾏にブ〯〇た\u318f⹚ー\u31eaㅳ⿸ㄭㅗㇽ㇜⼓㆝㈲㉙ⲝ㈌㊮㋙㊹㊒ⷍ㍝㍨㌌⵿㎄", 12136));
         }
      }
   }
}
