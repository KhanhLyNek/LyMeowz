package main;

import java.util.Random;
import java.util.Vector;

final class IO_l {
   static final int lOOl = 0;
   static final int lOO1 = 1;
   static final int lOO_ = 2;
   private static final int lOOO = 1500000000;
   private static final String[] Il1 = new String[]{
      I1l0("⥡⤪⤏⧶", 10534),
      I1l0("⥰⤠⤃⧦⧖⦠", 10534),
      I1l0("⥡⤪⤌⧢⧌", 10534),
      I1l0("⥶⤬⤇⧠⧍⦭⦏", 10534),
      I1l0("⥲⤷⤑⧭⧉⦲", 10534),
      I1l0("⥭⤷⤍⧯⧎⦨⦎", 10534),
      I1l0("⥿⤤⤉⧠⧊⦠", 10534),
      I1l0("⥲⤬⤁⧭", 10534),
      I1l0("⥤⤷⤋⧯⧛", 10534),
      I1l0("⥤⤠⤁⧱⧗⦲", 10534),
      I1l0("⥵⤤⤍⧺⧃⦯", 10534),
      I1l0("⥨⤤⤉⧦⧉", 10534),
      I1l0("⥾⤤⤝⧧⧃", 10534),
      I1l0("⥭⤤⤉⧦", 10534),
      I1l0("⥥⤤⤔⧰⧗⦭⦅", 10534)
   };
   private static final String[] Il1I = new String[]{
      I1l0("⥶⤷⤋", 10534),
      I1l0("⥰⤌⤴", 10534),
      I1l0("⥨⤗⤫", 10534),
      I1l0("⥠⤤⤊", 10534),
      I1l0("⥤⤪⤝", 10534),
      I1l0("⥡⤬⤖⧯", 10534),
      I1l0("⥮⤠⤖⧬", 10534),
      I1l0("⥭⤬⤊⧤", 10534),
      I1l0("⥢⤿", 10534),
      I1l0("⥾⤬⤊", 10534),
      I1l0("⥥⤰⤐⧦", 10534),
      I1l0("⥫⤤⤜", 10534)
   };
   private static final String[] Il1l = new String[]{
      I1l0("⥮⦱⤉⦣⧌⦠⦙⧟⬏⫉⨲⨜⪺⫈⪭⨖", 10534),
      I1l0("⥧⤬⥄⧠⥑⧡⣱㝒⩫⨝⨨⨓㐽⫗⫸⪜⭾⯁⬺⬔⮭", 10534),
      I1l0("⥵㟪⤔⦣⧎⤫⦎⧟⩽㒘⨬⩛⫨㑪⪱⫖", 10534),
      I1l0("⥤⤪⤗⧰⦂㜞⧀⦔⩶⩈⩼⨕⩺⫖⫸⪁㖻⭌⭫", 10534),
      I1l0("⥪⤤⤃⦣⧓⦴⤁⧟⩪⩏㒁⨒", 10534),
      I1l0("⥥⦥⤝⦣⧖⦨㝟⦏⨾⩉⨴⪏⫳", 10534),
      I1l0("⥥⦶⥄⧢⧋⧡⣱⦖⨾⩍⨨⩛⫱⫑⨬⪙⭱⬊", 10534),
      I1l0("⥷⤰⦅⧪⦂㜞⧀⣮⫼⩄⩼⨐⫲⩘⫸⪙⭱⭚⬺", 10534),
      I1l0("⥫㞞⤍⦣⧁⦩⡁⦖⨲⨝⨱㒶⫳⪙⪶⪐⪦㗨⬽⭓⯵⯘⬪⮟Ⱞⱛ㊗Ⰲ", 10534),
      I1l0("⠶⤤⤊⧤⦂⦵⤌⦒⨾⩓⨻㒶⫹⪙⪪㐤⭸⭒\u2b74⭀⮲⯂⮱⮀", 10534),
      I1l0("⠶⤬⥄⧰⢡⦯⧀⦝⩱⩎⨯⩛⫱⫑⨬⪙⭱⬊", 10534),
      I1l0("⥫⦤⤑⦣⧓⦴⤁⦖⨾⩉⨮⪙⫯⪙⪬⪟㖻⭁", 10534),
      I1l0("⥨⤢⤌㝊⦂⦢⦈⤅⩪⨝⨮㒨⫳⪙⪻⨗⭯⬕⬠⬚㔭⯁", 10534),
      I1l0("⥧⤬⥄⧡⥃⦯⧀⣮㒳⩈⩼⨏⫲㐞⪶⫗⭽⭝⮠⬝⯵⮎", 10534),
      I1l0("⥥⤭⦞⧠⦂⦬㜭⦖⨾⩓⨻⯋㑇⫐⫸⪚⭷⭌\u2b74⬞㔽⯟", 10534)
   };
   private final IOoI III;
   private final IO0 IIIl;
   private final IOo_ IIIl;
   private final Random III1 = new Random();
   private final Vector IIIO = new Vector();
   private Vector III0;
   private int lOO0;
   private int lOOo;
   private long I1_O;
   private long I1_0;
   private boolean Iol_;
   private int[] I1oo = new int[2];

   IO_l(IOoI var1, IO0 var2, IOo_ var3) {
      this.III = var1;
      this.IIIl = var2;
      this.IIIl = var3;
   }

   private static int II0I() {
      String var0 = null;

      try {
         var0 = System.getProperty(I1l0("⥈⤷⤋⧯⧋⦵⦅⧑⩼⩒⨨⨈", 10534));
      } catch (Exception var3) {
      }

      if (var0 == null) {
         return 0;
      }

      try {
         return Math.max(0, Math.min(12, Integer.parseInt(var0.trim())));
      } catch (Exception var2) {
         return 0;
      }
   }

   private static boolean II_l(int var0) {
      if (var0 >= 21 && var0 <= 23) {
         return false;
      } else if (IO_1.II_1(var0)) {
         return false;
      } else if (var0 >= 114 && var0 <= 120) {
         return false;
      } else {
         return var0 == 164 ? false : !IOOO.IIO1(var0);
      }
   }

   void Ioo1() {
      this.IIIO.removeAllElements();
      this.Iol_ = false;
   }

   void II1_(int var1, int var2) {
      this.IIIO.removeAllElements();
      this.Iol_ = true;
      this.lOOo = II_l(var1) ? II0I() : 0;
      if (this.lOOo > 0) {
         this.lOOo = Math.max(1, this.lOOo - this.III1.nextInt(2));
      }

      this.I1_O = System.currentTimeMillis() + 800L;
   }

   boolean Il1() {
      return II0I() > 0;
   }

   void Ioo0() {
      boolean var1 = !this.Il1();

      try {
         System.setProperty(I1l0("⥈⤷⤋⧯⧋⦵⦅⧑⩼⩒⨨⨈", 10534), var1 ? I1l0("⤕", 10534) : I1l0("⤖", 10534));
      } catch (Exception var3) {
      }

      if (!var1) {
         this.IllO(0);
      }

      this.III.IIol(var1 ? I1l0("⠶⦦⥄⧡㜏⦵⧀⦝⩱⩉⩼⨕⫽⬉㐅⪞⬶⭖⬼⫒⯻⮑⯸⬎ⱾⰍⰨ㊎ⳤⳎ⳨Ⲍ\u2d6eⵌⵤⴐⷣ\u2dcf\u2da7ⷿⶓ\u2e7c⹌\u2e7b⸑⻱⹙⺴⻟", 10534) : I1l0("⠶⦦⥄⧷㜍⦵⧀⦝⩱⩉⩼⨕⫽⬉㐅⪞⬶⭖⬼⫒⯻", 10534));
   }

   void IllO(int var1) {
      this.lOOo = Math.max(0, Math.min(12, var1));
      if (this.lOOo == 0) {
         for (int var2 = 0; var2 < this.IIIO.size(); var2++) {
            this.III((IO_l.II)this.IIIO.elementAt(var2));
         }

         this.IIIO.removeAllElements();
      }

      this.Iol_ = true;
      this.I1_O = System.currentTimeMillis();
   }

   private int II1O(int var1) {
      IOol var2 = this.IIIl.II;
      return var2.I1I;
   }

   private void Iooo() {
      IOol var1 = this.IIIl.II;
      I0Io.II var2 = I0Io.II(var1.lOlo);
      boolean var3 = var2 != null && var2.III.length >= 3;
      IO_l.II var4 = new IO_l.II();
      var4.I1l = 1500000000 + this.lOO0++ % 1000000;
      var4.lOlI = this.III1.nextInt(3);
      var4.II1o = Il1[this.III1.nextInt(Il1.length)] + Il1I[this.III1.nextInt(Il1I.length)] + (10 + this.III1.nextInt(990));
      if (this.III0 == null) {
         this.III0 = I0I1.II();
      }

      int var5 = 0;
      int[] var6 = null;

      while (var6 == null && this.III0.size() > 0 && var5++ < 40) {
         Integer var7 = (Integer)this.III0.elementAt(this.III1.nextInt(this.III0.size()));
         IOO.III var8 = IOO.II(var7);
         if (var8 != null && var8.IoI_ == 5 && (var8.lOlI == var4.lOlI || var8.lOlI == 3)) {
            var6 = I0I1.III_(var7);
         }
      }

      if (var6 != null) {
         var4.I0 = var6[0];
         var4.I0II = var6[1];
         var4.I0I = var6[2];
         var4.IoI_ = var3 ? 0 : 1;
         var4.lO0I = (this.III1.nextInt(3) == 0 ? 1 : 0) + var4.lOlI * 2;
         IOO.IIIO var10 = IOO.II(var4.lO0I, 7);
         var4.lO0 = var10 == null ? -1 : var10.I1l;
         int var11 = 100 + this.III1.nextInt(400);
         var4.I1 = Math.max(60, var1.I1 + (this.III1.nextBoolean() ? var11 : -var11));
         var4.I1I = this.II1O(var4.I1);
         if (var3) {
            IOoI.III var9 = this.II();
            if (var9 != null) {
               var4.I1 = var9.I1;
               var4.I1I = var9.I1I;
            }
         }

         var4.I1Ol = System.currentTimeMillis() + 120000L + this.III1.nextInt(240000);
         var4.I1OI = System.currentTimeMillis() + 5000L + this.III1.nextInt(30000);
         this.IIIO.addElement(var4);
         this.II(var4);
      }
   }

   private IOoI.III II() {
      IOoI.III[] var1 = this.III.II();
      if (var1 != null && var1.length != 0) {
         for (int var2 = 0; var2 < 10; var2++) {
            IOoI.III var3 = var1[this.III1.nextInt(var1.length)];
            if (!var3.IoOo && var3.III == null && var3.l0o1 != 117 && var3.l0o1 != 0) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void II(IO_l.II var1) {
      int var2 = 100000 + this.III1.nextInt(900000);
      this.IIIl
         .II(
            new IO0o(-5)
               .IIII(var1.I1l)
               .IIII(-1)
               .II(0)
               .II(false)
               .II(0)
               .II(var1.lOlI)
               .II(var1.lOlI)
               .III(var1.I0)
               .II(var1.II1o)
               .IIII(var2)
               .IIII(var2)
               .III(var1.I0II)
               .III(var1.I0I)
               .II(-1)
               .II(-1)
               .III(var1.I1)
               .III(var1.I1I)
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
   }

   int II(int var1, int var2, int var3, String[] var4) {
      int var5 = 0;

      for (int var6 = 0; var6 < this.IIIO.size(); var6++) {
         IO_l.II var7 = (IO_l.II)this.IIIO.elementAt(var6);
         long var8 = var7.I1 - var1;
         long var10 = var7.I1I - var2;
         if (var8 * var8 + var10 * var10 <= (long)var3 * var3) {
            this.IIIl.II(new IO0o(44).IIII(var7.I1l).II(var4[this.III1.nextInt(var4.length)]));
            var5++;
         }
      }

      return var5;
   }

   private void III(IO_l.II var1) {
      this.IIIl.II(new IO0o(-6).IIII(var1.I1l));
   }

   private void II(IO_l.II var1, int var2, int var3) {
      int var4 = var2 - var1.I1;
      int var5 = Math.min(Math.abs(var4), 40 + this.III1.nextInt(30));
      if (var5 > 0) {
         var1.llI_ = var4 > 0 ? 1 : -1;
         var1.I1 = var1.I1 + var5 * var1.llI_;
      }

      var1.I1I = var3;
      this.IIIl.II(new IO0o(-7).IIII(var1.I1l).III(var1.I1).III(var1.I1I));
   }

   void III1(long var1) {
      if (this.Iol_ && this.IIIl.II != null && this.IIIl.II.llIl > 0) {
         if (var1 - this.I1_0 >= 300L) {
            this.I1_0 = var1;
            if (this.lOOo != 0) {
               if (var1 >= this.I1_O && this.IIIO.size() < this.lOOo) {
                  this.Iooo();
                  this.I1_O = var1 + 1500L + this.III1.nextInt(4000);
               }

               for (int var3 = this.IIIO.size() - 1; var3 >= 0; var3--) {
                  IO_l.II var4 = (IO_l.II)this.IIIO.elementAt(var3);
                  if (var1 >= var4.I1Ol) {
                     this.III(var4);
                     this.IIIO.removeElementAt(var3);
                     this.I1_O = var1 + 3000L + this.III1.nextInt(20000);
                  } else {
                     this.II(var4, var1);
                  }
               }
            }
         }
      }
   }

   private void II(IO_l.II var1, long var2) {
      if (var2 >= var1.I1OI) {
         this.IIIl.II(new IO0o(44).IIII(var1.I1l).II(Il1l[this.III1.nextInt(Il1l.length)]));
         var1.I1OI = var2 + 20000L + this.III1.nextInt(60000);
      }

      if (var1.IoI_ != 1 && (var1.III == null || !this.III.II.III(var1.III))) {
         var1.III = null;
         IO_I.III var4 = this.III.II.II();
         if (var4 != null && this.III1.nextInt(4) == 0) {
            var1.III = var4;
            var1.IoI_ = 2;
         } else if (var1.IoI_ == 2) {
            var1.IoI_ = 0;
         }
      }

      if (var2 >= var1.I1_o) {
         var1.I1_o = var2 + 350L + this.III1.nextInt(250);
         switch (var1.IoI_) {
            case 0:
               IOoI.III var8 = var1.III;
               if (var8 == null || var8.IoOo) {
                  var1.III = var8 = this.II();
               }

               if (var8 == null) {
                  this.IIII(var1);
                  return;
               }

               int var9 = var8.I1 + (var1.I1l % 2 == 0 ? 40 : -40);
               if (Math.abs(var1.I1 - var9) > 30 || Math.abs(var1.I1I - var8.I1I) > 40) {
                  this.II(var1, var9, var8.I1I);
                  return;
               }

               if (var2 >= var1.I1O && var1.lO0 >= 0) {
                  var1.I1O = var2 + 1000L + this.III1.nextInt(1500);
                  this.IIIl.II(new IO0o(54).IIII(var1.I1l).II(var1.lO0 & 0xFF).II(var8._l_1));
                  int var11 = 800 + this.III1.nextInt(8000);
                  this.IIIl.II(new IO0o(-9).II(var8._l_1).IIII(var8.llIl).IIII(var11).II(false).II(-1));
                  if (this.III1.nextInt(14) == 0) {
                     var1.III = null;
                  }
               }
               break;
            case 2:
               IO_I.III var7 = var1.III;
               if (var7 == null) {
                  var1.IoI_ = 0;
                  return;
               }

               int var5 = var7.I1 + (var1.I1l % 2 == 0 ? 60 : -60);
               if (Math.abs(var1.I1 - var5) > 30) {
                  this.II(var1, var5, var7.I1I);
                  return;
               }

               if (var2 >= var1.I1O && var1.lO0 >= 0) {
                  var1.I1O = var2 + 1400L + this.III1.nextInt(1200);
                  int var6 = 5000 + this.III1.nextInt(60000);
                  var6 = Math.min(var6, Math.max(1, var7.llIl / 200));
                  this.IIIl
                     .II(new IO0o(-60).IIII(var1.I1l).II(var1.lO0 & 0xFF).II(1).IIII(var7.I1l).II(1).II(0).IIII(var6).II(false).II(this.III1.nextInt(8) == 0));
                  this.IIIl.II(new IO0o(-30).II(9).IIII(var7.I1l).IIII(var7.llIl).IIII(var7.lOlO));
               }
               break;
            default:
               this.IIII(var1);
         }
      }
   }

   private void IIII(IO_l.II var1) {
      if (this.III1.nextInt(3) == 0) {
         int var2 = Math.max(60, var1.I1 + (this.III1.nextBoolean() ? 1 : -1) * (60 + this.III1.nextInt(200)));
         this.II(var1, var2, var1.I1I);
      }
   }

   static final class II {
      int I1l;
      int IoI_;
      int lOlI;
      int I0;
      int I0II;
      int I0I;
      String II1o;
      int I1;
      int I1I;
      int llI_ = 1;
      int lO0 = -1;
      int lO0I;
      long I1_o;
      long I1O;
      long I1OI;
      long I1Ol;
      IOoI.III III;
      IO_I.III III;
   }
}
