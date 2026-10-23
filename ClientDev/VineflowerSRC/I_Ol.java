package main;

import java.util.Random;

public final class I_Ol {
   private static short[] IIIO = new short[]{
      0,
      18,
      36,
      54,
      71,
      89,
      107,
      125,
      143,
      160,
      178,
      195,
      213,
      230,
      248,
      265,
      282,
      299,
      316,
      333,
      350,
      367,
      384,
      400,
      416,
      433,
      449,
      465,
      481,
      496,
      512,
      527,
      543,
      558,
      573,
      587,
      602,
      616,
      630,
      644,
      658,
      672,
      685,
      698,
      711,
      724,
      737,
      749,
      761,
      773,
      784,
      796,
      807,
      818,
      828,
      839,
      849,
      859,
      868,
      878,
      887,
      896,
      904,
      912,
      920,
      928,
      935,
      943,
      949,
      956,
      962,
      968,
      974,
      979,
      984,
      989,
      994,
      998,
      1002,
      1005,
      1008,
      1011,
      1014,
      1016,
      1018,
      1020,
      1022,
      1023,
      1023,
      1024,
      1024
   };
   private static short[] III0;
   private static int[] Illo;
   public static Random III = new Random();
   public static boolean I1l1;
   public static boolean III;

   public static void IIl1() {
      III0 = new short[91];
      Illo = new int[91];

      for (int var0 = 0; var0 <= 90; var0++) {
         III0[var0] = IIIO[90 - var0];
         if (III0[var0] == 0) {
            Illo[var0] = Integer.MAX_VALUE;
         } else {
            Illo[var0] = (IIIO[var0] << 10) / III0[var0];
         }
      }
   }

   public static final int IIll(int var0) {
      if ((var0 = IIl_(var0)) >= 0 && var0 < 90) {
         return IIIO[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return IIIO[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -IIIO[var0 - 180] : -IIIO[360 - var0];
      }
   }

   public static final int IIl1(int var0) {
      if ((var0 = IIl_(var0)) >= 0 && var0 < 90) {
         return III0[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return -III0[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -III0[var0 - 180] : III0[360 - var0];
      }
   }

   public static final int III1(int var0, int var1) {
      int var5;
      if (var0 == 0) {
         var5 = var1 > 0 ? 90 : 270;
      } else {
         int var3 = Math.abs((var1 << 10) / var0);
         int var4 = 0;

         while (true) {
            if (var4 <= 90) {
               if (Illo[var4] < var3) {
                  var4++;
                  continue;
               }

               var5 = var4;
            } else {
               var5 = 0;
            }

            var3 = var5;
            if (var1 >= 0 && var0 < 0) {
               var3 = 180 - var5;
            }

            if (var1 < 0 && var0 < 0) {
               var3 += 180;
            }

            if (var1 >= 0 || var0 < 0) {
               return var3;
            }

            var5 = 360 - var3;
            break;
         }
      }

      return var5;
   }

   public static final int IIl_(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   public static void II(IO1l var0) {
      IO1I.III_.II(var0, Il0l("㗐㖺㖔㙳㙄㙮㘮㛣㛅㚾㚛㝧㝋㜪㜀㟶㞞㟢", 13747) + I_0_.I1, 3, 55, 0);
      IO1I.III_.II(var0, Il0l("㗐㖺㖔㙳㙄㙮㘠㛭㛛㛷㛉", 13747) + I_0_.IlO, 3, 75, 0);
   }

   public static void IOlI() {
      long var0 = IO10.IIII();
      if (I_0_.I1I - var0 > 5000L) {
         I_0_.II().Io_O();
      }

      if (I_0_.I1I1 - var0 > 5000L) {
         I_0_.II().Io_0();
      }
   }

   public static String IIIo(String var0) {
      if (IO10.l_lI != 7) {
         return var0;
      }

      if (Ilol.II() != null && Ilol.II().II != null && Ilol.II().II.II01 >= 10) {
         return var0;
      }

      if (var0.indexOf(Il0l("㗴㖽㖙㙱㙁", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗴㖽㖙㙱㙁", 13747), Il0l("㗻㖳㖟㙷㙀", 13747));
      }

      if (var0.indexOf(Il0l("㗴㔦㖙㙱㙁", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗴㔦㖙㙱㙁", 13747), Il0l("㗻㖳㖟㙷㙀", 13747));
      }

      if (var0.indexOf(Il0l("㗱㖧㖟㙽㙎", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗱㖧㖟㙽㙎", 13747), Il0l("㗾㖳㖓㙥㙁", 13747));
      }

      if (var0.indexOf(Il0l("㗱㖧㖟㙽㙎㘠", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗱㖧㖟㙽㙎㘠", 13747), Il0l("㗾㖳㖓㙥㙁", 13747));
      }

      if (var0.indexOf(Il0l("㗱㖧㖟㘰㙂㘯", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗱㖧㖟㘰㙂㘯", 13747), Il0l("㗾㖳㖓㙥㙁", 13747));
      }

      if (var0.indexOf(Il0l("㒣⭿㖄㘰㙛㘦⣊㛢", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㒣⭿㖄㘰㙛㘦⣊㛢", 13747), Il0l("㗰㔰㖈㘰㙛㘦⣊㛢", 13747));
      }

      if (var0.indexOf(Il0l("㗾㖳㖓㙥", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗾㖳㖓㙥", 13747), Il0l("㗱㖧㖜㙱", 13747));
      }

      if (var0.indexOf(Il0l("㗾㖳㗑㙲㞟", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗾㖳㗑㙲㞟", 13747), Il0l("㗱㖧㖜㙱", 13747));
      }

      if (var0.indexOf(Il0l("㗫㖳㖈㙴㙎", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗫㖳㖈㙴㙎", 13747), Il0l("㗷㖳㖂㙱㙖", 13747));
      }

      if (var0.indexOf(Il0l("㗫㖳㖈㘰㙋㘯", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗫㖳㖈㘰㙋㘯", 13747), Il0l("㗷㖳㖂㙱㙖", 13747));
      }

      if (var0.indexOf(Il0l("㗽㖳㖜⢯㙌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗽㖳㖜⢯㙌", 13747), Il0l("㗾㖷㖒㙴㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗽㖳㗑㙽⢐㘭", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗽㖳㗑㙽⢐㘭", 13747), Il0l("㗾㖷㖒㙴㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗽㖳㖜㙵㙄", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗽㖳㖜㙵㙄", 13747), Il0l("㗾㖷㖒㙴㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗡⬁㖟㙷㘏㘺㘅⠫㛅", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗡⬁㖟㙷㘏㘺㘅⠫㛅", 13747), Il0l("㗡⬁㖟㙷㘏㝟⣈㛸", 13747));
      }

      if (var0.indexOf(Il0l("㗸㖳㖜㙵", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗸㖳㖜㙵", 13747), Il0l("㗾㖷㖚㙱", 13747));
      }

      if (var0.indexOf(Il0l("㗥㖷㖖㙵㙛㘯", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗥㖷㖖㙵㙛㘯", 13747), Il0l("㗧㖳㖖㙵㙙㘫", 13747));
      }

      if (var0.indexOf(Il0l("㗸㖳㖚㙱㙃㘡㘙", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗸㖳㖚㙱㙃㘡㘙", 13747), Il0l("㗿㖽㖅㙻㙎㘥㘌", 13747));
      }

      if (var0.indexOf(Il0l("㗱㖠㖞㙼㙖", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗱㖠㖞㙼㙖", 13747), Il0l("㗿㖫㖓㙢㙀", 13747));
      }

      if (var0.indexOf(Il0l("㗽㖵⬼㙳㘏㘼⢾㛢㛌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗽㖵⬼㙳㘏㘼⢾㛢㛌", 13747), Il0l("㗽㖵⬼㙳㘏㘺㘅⠫㛅", 13747));
      }

      if (var0.indexOf(Il0l("㗝㖵⬼㙳㘏㘼⢾㛢㛌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗝㖵⬼㙳㘏㘼⢾㛢㛌", 13747), Il0l("㗽㖵⬼㙳㘏㘺㘅⠫㛅", 13747));
      }

      if (var0.indexOf(Il0l("㗡㖳㖕㙹㙌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗡㖳㖕㙹㙌", 13747), Il0l("㗷㖻㖒㙢㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗡㖳㗑㙴㙆㘭", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗡㖳㗑㙴㙆㘭", 13747), Il0l("㗷㖻㖒㙢㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗡㖳㗑㜁㛂㘭", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗡㖳㗑㜁㛂㘭", 13747), Il0l("㗷㖻㖒㙢㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗰㖳㖕㙹㙌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗰㖳㖕㙹㙌", 13747), Il0l("㗷㖻㖒㙳㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗰㖳㗑㙴㙆㘭", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗰㖳㗑㙴㙆㘭", 13747), Il0l("㗷㖻㖒㙳㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗰㖳㗑㜁㛂㘭", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗰㖳㗑㜁㛂㘭", 13747), Il0l("㗷㖻㖒㙳㙎", 13747));
      }

      if (var0.indexOf(Il0l("㗢㖧㖈㘰㙃㚭㘂", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗢㖧㖈㘰㙃㚭㘂", 13747), Il0l("㗿㔱㖞", 13747));
      }

      if (var0.indexOf(Il0l("㗂㖧㖈㘰㙃㚭㘂", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗂㖧㖈㘰㙃㚭㘂", 13747), Il0l("㗟㔱㖞", 13747));
      }

      if (var0.indexOf(Il0l("㗢㖧㖈㙜㛌㘡", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗢㖧㖈㘰㙣㚭㘂", 13747), Il0l("㗿㔱㖞", 13747));
      }

      if (var0.indexOf(Il0l("㗠㖳㖟㙤㙎", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗠㖳㖟㙤㙎", 13747), Il0l("㗧㖳㖂㙱㙁", 13747));
      }

      if (var0.indexOf(Il0l("㗻⭳㖅㘰㙢㚣㘙", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗻⭳㖅㘰㙢㚣㘙", 13747), Il0l("㗻⭳㖅㘰㙫⣵", 13747));
      }

      if (var0.indexOf(Il0l("㗻⭳㖅㘰㙂㚣㘙", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗻⭳㖅㘰㙂㚣㘙", 13747), Il0l("㗻⭳㖅㘰㙋⣵", 13747));
      }

      if (var0.indexOf(Il0l("㗧㔲㖄㘰㙍⣭㘔㚬㛉⡩㚐", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗧㔲㖄㘰㙍⣭㘔㚬㛉⡩㚐", 13747), Il0l("㗧㔲㖄㘰㙛㚮㘘", 13747));
      }

      if (var0.indexOf(Il0l("㗦㖠㖞㙾", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗦㖠㖞㙾", 13747), Il0l("㗼㖼㖃㙥", 13747));
      }

      if (var0.indexOf(Il0l("㗦㗲㖃㙿㙁", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗦㗲㖃㙿㙁", 13747), Il0l("㗼㖼㖃㙥", 13747));
      }

      if (var0.indexOf(Il0l("㗦㖠㔅㙾", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗦㖠㔅㙾", 13747), Il0l("㗼㖼㖃㙥", 13747));
      }

      if (var0.indexOf(Il0l("㗽㖵⬼㙳㘏㘜⢾㛢㛌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗽㖵⬼㙳㘏㘜⢾㛢㛌", 13747), Il0l("㗽㖵⬼㙳㘏㘺㘅⠫㛅", 13747));
      }

      if (var0.indexOf(Il0l("㗽㖵⬼㙳㘏㘼⢾㛢㛌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗽㖵⬼㙳㘏㘼⢾㛢㛌", 13747), Il0l("㗽㖵⬼㙳㘏㘺㘅⠫㛅", 13747));
      }

      if (var0.indexOf(Il0l("㗵㖻㖕㙵", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗵㖻㖕㙵", 13747), Il0l("㗷㖷㖗㙹", 13747));
      }

      if (var0.indexOf(Il0l("㗥㖷㖖㙵㙛㘯", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗥㖷㖖㙵㙛㘯", 13747), Il0l("㗧㖳㖖㙵㙙㘫", 13747));
      }

      if (var0.indexOf(Il0l("㗾㖽㖞㙢㙆", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗾㖽㖞㙢㙆", 13747), Il0l("㗡㖻㖜㙿㙀", 13747));
      }

      if (var0.indexOf(Il0l("㗲㖠㖄", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗲㖠㖄", 13747), Il0l("㗦㖠㖐", 13747));
      }

      if (var0.indexOf(Il0l("㗸㖳㖜㙵㙅㘡㘆㛣", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗸㖳㖜㙵㙅㘡㘆㛣", 13747), Il0l("㗸㖽㖛㙿㙂㘫㘆㛭", 13747));
      }

      if (var0.indexOf(Il0l("㗘㖳㖜㙵㙅㘡㘆㛣", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗘㖳㖜㙵㙅㘡㘆㛣", 13747), Il0l("㗘㖽㖛㙿㙂㘫㘆㛭", 13747));
      }

      if (var0.indexOf(Il0l("㗸㖳㖜㙵", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗸㖳㖜㙵", 13747), Il0l("㗾㖷㖚㙱", 13747));
      }

      if (var0.indexOf(Il0l("㗘㖳㖜㙵", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗘㖳㖜㙵", 13747), Il0l("㗞㖷㖚㙱", 13747));
      }

      if (var0.indexOf(Il0l("㗾㖳㖂㙵㙁㘥㘂", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗾㖳㖂㙵㙁㘥㘂", 13747), Il0l("㗸㖽㖂㙵㙁㘣㘌", 13747));
      }

      if (var0.indexOf(Il0l("㗧㖺㔐㙹㘏㘊㟝㜭㛅㚭㛉㝀⦆㝦㜶㟥㟍", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗧㖺㔐㙹㘏㘊㟝㜭㛅㚭㛉㝀⦆㝦㜶㟥㟍", 13747), Il0l("㗻⭳㗑㙔㞟㟯㘃㛫", 13747));
      }

      if (var0.indexOf(Il0l("㗠㖽㖝㙱㙝㙮㘋㛠㛊㚸㚌", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗠㖽㖝㙱㙝㙮㘋㛠㛊㚸㚌", 13747), Il0l("㗠㖽㖝㙱㙝", 13747));
      }

      if (var0.indexOf(Il0l("㗢㖧⭒㘰㙌⣩㘘㚬㛀㘠㚇㝠㜇㜭㜍㟭", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗢㖧⭒㘰㙌⣩㘘㚬㛀㘠㚇㝠㜇㜭㜍㟭", 13747), Il0l("㗢㖧⭒㘰㙌⣩㘘", 13747));
      }

      if (var0.indexOf(Il0l("㗴㖷㖟㙻㙆㙣㘩㛭㛆㚫", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗴㖷㖟㙻㙆㙣㘩㛭㛆㚫", 13747), Il0l("㗷㖳㖜㙱", 13747));
      }

      if (var0.indexOf(Il0l("㗴㖷㖟㙻㙆㙣㘩㛭㛆㚫", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗴㖷㖟㙻㙆㙣㘩㛭㛆㚫", 13747), Il0l("㗷㖳㖜㙱", 13747));
      }

      if (var0.indexOf(Il0l("㗾㖳㖚㙱㙁㘥㘂㛿㛊㚺㚙㝧", 13747)) != -1) {
         var0 = IIII(var0, Il0l("㗾㖳㖚㙱㙁㘥㘂㛿㛊㚺㚙㝧", 13747), Il0l("㗼㖢㖁㙱㙜㘡㘆㛢㛊㚡㚈㝥", 13747));
      }

      return var0;
   }

   public static String IIII(String var0, String var1, String var2) {
      StringBuffer var3 = new StringBuffer();
      int var4 = var0.indexOf(var1);
      int var5 = 0;
      int var6 = var1.length();

      while (var4 != -1) {
         var3.append(var0.substring(var5, var4)).append(var2);
         var5 = var4 + var6;
         var4 = var0.indexOf(var1, var5);
      }

      var3.append(var0.substring(var5, var0.length()));
      return var3.toString();
   }

   public static int IIlO(int var0) {
      return III.nextInt(var0);
   }

   public static int III_(int var0, int var1) {
      return var0 == var1 ? var0 : var0 + III.nextInt(var1 - var0);
   }

   public static int IIl0(int var0) {
      int var1 = 0;

      while (var1 == 0) {
         var1 = III.nextInt() % var0;
      }

      return var1;
   }

   public static int IIIl(int var0, int var1) {
      var0 += III.nextInt(var1 - var0);
      byte var2 = 2;
      if (III.nextInt(var2) == 0) {
         var0 = -var0;
      }

      return var0;
   }

   public static int II(int var0, int var1, int var2, int var3) {
      return IIlo((var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3));
   }

   public static int IIIO(int var0, int var1) {
      return IIlo(var0 * var0 + var1 * var1);
   }

   public static int IIlo(int var0) {
      if (var0 <= 0) {
         return 0;
      }

      int var1 = (var0 + 1) / 2;

      int var2;
      do {
         var2 = var1;
         var1 = var1 / 2 + var0 / (var1 * 2);
      } while (Math.abs(var2 - var1) > 1);

      return var1;
   }

   public static int III0(int var0, int var1) {
      var1 = 1;

      for (int var2 = 0; var2 < 2; var2++) {
         var1 *= var0;
      }

      return var1;
   }

   public static int II1(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static boolean II(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
   }

   public static void II_l(String var0) {
   }

   public static void II__(String var0) {
   }

   public static String[] II(String var0, String var1, int var2) {
      int var3;
      String[] var4;
      if ((var3 = var0.indexOf(var1)) >= 0) {
         var4 = II(var0.substring(var3 + var1.length()), var1, var2 + 1);
      } else {
         var4 = new String[var2 + 1];
         var3 = var0.length();
      }

      var4[var2] = var0.substring(0, var3);
      return var4;
   }

   public static String III1(long var0) {
      String var10;
      if (var0 >= 1000000000L) {
         String var2 = IO11.I1o0;
         long var3 = var0 % 1000000000L / 100000000L;
         var0 /= 1000000000L;
         var10 = String.valueOf(var0);
         if (var3 > 0L) {
            var10 = var10 + Il0l("㖟", 13747) + var3 + var2;
         } else {
            var10 = var10 + var2;
         }
      } else if (var0 >= 1000000L) {
         String var8 = IO11.I1oo;
         long var9 = var0 % 1000000L / 100000L;
         var0 /= 1000000L;
         var10 = String.valueOf(var0);
         if (var9 > 0L) {
            var10 = var10 + Il0l("㖟", 13747) + var9 + var8;
         } else {
            var10 = var10 + var8;
         }
      } else {
         var10 = String.valueOf(var0);
      }

      return var10;
   }

   public static String III_(long var0) {
      String var13;
      if (var0 >= 1000000000L) {
         String var2 = IO11.I1o0;
         long var3 = var0 % 1000000000L / 10000000L;
         var0 /= 1000000000L;
         var13 = String.valueOf(var0);
         if (var3 >= 10L) {
            if (var3 % 10L == 0L) {
               var3 /= 10L;
            }

            var13 = var13 + Il0l("㖟", 13747) + var3 + var2;
         } else if (var3 > 0L) {
            var13 = var13 + Il0l("㖟㗢", 13747) + var3 + var2;
         } else {
            var13 = var13 + var2;
         }
      } else if (var0 >= 1000000L) {
         String var9 = IO11.I1oo;
         long var11 = var0 % 1000000L / 10000L;
         var0 /= 1000000L;
         var13 = String.valueOf(var0);
         if (var11 >= 10L) {
            if (var11 % 10L == 0L) {
               var11 /= 10L;
            }

            var13 = var13 + Il0l("㖟", 13747) + var11 + var9;
         } else if (var11 > 0L) {
            var13 = var13 + Il0l("㖟㗢", 13747) + var11 + var9;
         } else {
            var13 = var13 + var9;
         }
      } else if (var0 >= 10000L) {
         String var10 = Il0l("㗘", 13747);
         long var12 = var0 % 1000L / 10L;
         var0 /= 1000L;
         var13 = String.valueOf(var0);
         if (var12 >= 10L) {
            if (var12 % 10L == 0L) {
               var12 /= 10L;
            }

            var13 = var13 + Il0l("㖟", 13747) + var12 + var10;
         } else if (var12 > 0L) {
            var13 = var13 + Il0l("㖟㗢", 13747) + var12 + var10;
         } else {
            var13 = var13 + var10;
         }
      } else {
         var13 = String.valueOf(var0);
      }

      return var13;
   }

   static {
      String[] var10000 = new String[]{
         Il0l("㖏㖱㖞㙼㙀㘼㙐㚯㛍㚬㛙㜸㜗㝶㜃㟢㞝㞙㟁㠠㡓㡱㠚㠣㣘㣻㢍㣘㤷㥫㥩㥛㧰㧝㦽㦟㩽㨐", 13747),
         Il0l("㖏㖱㖞㙼㙀㘼㙐㚯㛍㚬㛙㜸㜗㝶㜃㟢㞝㞙㞭㡏㡘㡡㠎㠹㣈㣩㢐㢷㥙㥫㥩㥛㧰㧝㦽㦟㩽㨐", 13747),
         Il0l("㖏㖱㖞㙼㙀㘼㙐㚯㛍㚬㚏㝮㜗㝶㜃㟢㞝㞙㞭㡏㡘㡡㠎㠹㣈㣩㢐㢷㥙㥫㥩㥛㧰㧝㦽㦟㩽㨐", 13747),
         Il0l("㖏㖱㖞㙼㙀㘼㙐㚯㛍㚬㛙㜸㜗㝶㜃㟢㞝㞙㞭㡏㡘㡡㠐㠳㣙㣳㢕㢽㤷㥫㥩㥛㧰㧝㦽㦟㩽㨐", 13747),
         ""
      };
      new I_lO("");
   }
}
