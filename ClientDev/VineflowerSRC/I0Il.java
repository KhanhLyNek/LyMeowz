package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import nrolite.Res;

public final class I0Il {
   private static I0Il.III[] II;

   private I0Il() {
   }

   private static synchronized void I___() {
      if (II == null) {
         try {
            byte[] var0 = Res.read(I100("븪븜뻯뻐뺩뻗뽺뽞뼸", 48734));
            DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
            short var2 = var1.readShort();
            II = new I0Il.III[var2];

            for (int var3 = 0; var3 < var2; var3++) {
               I0Il.III var4 = new I0Il.III();
               var4.II1o = var1.readUTF();
               var4.lIO1 = var1.readUTF();
               byte var5 = var1.readByte();
               var4.II = new I0Il.II[var5];

               for (int var6 = 0; var6 < var5; var6++) {
                  I0Il.II var7 = new I0Il.II();
                  var7.II1o = var1.readUTF();
                  var7.__ll = var1.readShort();
                  var7.lIOl = var1.readUTF();
                  var7.l0_1 = var1.readByte();
                  var7.lOlo = var1.readShort();
                  var4.II[var6] = var7;
               }

               II[var3] = var4;
            }
         } catch (IOException var8) {
            II = new I0Il.III[0];
         }
      }
   }

   public static I0Il.III II(int var0) {
      I___();
      return var0 >= 0 && var0 < II.length ? II[var0] : null;
   }

   public static String I10O(String var0, int var1) {
      String[][] var2 = new String[][]{
         {I100("빻빌뺨", 48734), I100("븮븕뻵뺛뺶뺖뽶뽐뽶뼘ꄭ", 48734), I100("븯븈ꁫ뺛뺸뺘뽡뼗뼻ꇌ", 48734), I100("븪븕ꀭ뻕뻺뺕ꆩ뽙뽶뼘ꄭ", 48734)},
         {I100("빻빌뺯", 48734), I100("브ꂖ뻲뻜뻺뺗ꆽ뽚", 48734), I100("븊븕뻩뻕뺽뻙뽴빞뼸뼒뾴뿽뾳뾜\udeaf쁌", 48734), I100("브ꂖ뻲뻜뻺뺗뽿뽂뼯뾟뿺뾓뾡뾘쁾쁇", 48734)},
         {I100("빻빌뺮", 48734), I100("ꂏ븞뺼뻖뽪ꀚ뽶뼗뼾ꆦ뿺", 48734), I100("ꂏ븞뺼뻈븰뺗", 48734), I100("븶븘뻳뺛뺂뺘뽡뽓뼷뽕뿹ꄊ", 48734)},
         {I100("빻빌뺭", 48734), I100("뽎ꃞ뻳뺛뺑뺘뽵뿝", 48734), I100("뽎ꃞ뻳뺛뺝뺌뽪뽂", 48734), I100("븈뺜뻿뻓뻺뺗뿢뽞뽶빤뿱뿝", 48734)},
         {I100("빻빌뺬", 48734), I100("븏븈뻥뺛뺖븚뽷뼗뼝뼔뿹뿖", 48734), I100("븊븏뼬ꁤ뺴뺞뼸뽛뾵뼚뾴뿴뾧뾃쁥", 48734), I100("븈븈뻽뺛뺌뺜뽿뽒뼢뼔", 48734)},
         {I100("빻비", 48734), I100("븪븕ꀭ뻕뻺뺕ꆩ뽙뽶뼗뿵뿊", 48734), I100("븮븕뻵뺛뺶뺖뽶뽐", 48734), I100("븯븈ꁫ뺛뺸뺘뽡", 48734)},
         {I100("빻빅", 48734), I100("븜븈뻲뻖뺻", 48734), I100("븚븘뻲뻟뺿", 48734), I100("븟븍뻬뻎뺶뺜", 48734)},
         {I100("빻빊", 48734), I100("븚븏뺲뺛뺘뺋뽱뽒뼰", 48734), I100("븝븜뻮뻜뺵", 48734), I100("븝븈뻵", 48734)},
         {I100("빻빋", 48734), I100("븊븕뻩뻕뺽뻙뽴빞뼸뼒뾴뿇뾠뾔", 48734), I100("븊븕ꁗ뺛뺮뺋ꆽ뽙뽶뼸뿻뿜뾠뾘", 48734), I100("븒뺝뻲뻜뻺뺩뽴뽖뼸뼁", 48734)},
         {I100("빻빈", 48734), I100("븈뺜뻿뻓뻺뺗뿢뽞뽶뼴뿦뿆", 48734), I100("븈뺜뻿뻓뻺뺗뿢뽞뽶뼸뿻뿜뾠뾘", 48734), I100("븈뺜뻿뻓뻺뺗뿢뽞뽶뼾뿵뿘뾳뾃쁿쁛", 48734)},
         {I100("빻빉", 48734), I100("븵븕ꁻ뻕뺽뻙뽴뽘뼸뼒", 48734), I100("븲ꂞ뻲뺛뺶븋뽱", 48734), I100("븯븈ꁫ뺛뿋ꁜ뽬", 48734)},
         {I100("빻빎", 48734), I100("뽎ꂮ뻵뺛뺲뺖뽹뼗뼵뾏뿷", 48734), I100("뽎ꂮ뻵뺛뺴ꁜ뽵뼗뼢뾘뿹", 48734), I100("뽎ꂮ뻵뺛뺲뺖뽹뽙뼱", 48734)},
         {I100("빻빏", 48734), I100("뺪븓뻻뺛뺝븍뽰뽖뼸", 48734), I100("뺪븓뻻뺛뺗뺖뽷뽅뼿", 48734), I100("뺪븓뻻뺛뺊뺘뽪뽖뼱뼀뿧", 48734)},
         {I100("빻빌", 48734), I100("븒뺝뻲뻜뻺뺸뽪뽂", 48734), I100("븒뺝뻲뻜뻺뺴뽷뽅뼿", 48734), I100("븒뺝뻲뻜뻺뺲뽹뽜뼷뼇뿻뿇", 48734)}
      };

      for (int var3 = 0; var3 < var2.length; var3++) {
         var0 = III(var0, var2[var3][0], var2[var3][1 + var1]);
      }

      return var0;
   }

   public static int IIlo(int var0, int var1) {
      switch (var0) {
         case -5:
            return 13 + var1;
         case -4:
            return 7 + var1;
         case -3:
            return 10 + var1;
         case -2:
            return var1 == 0 ? 0 : (var1 == 1 ? 2 : 1);
         default:
            return var0;
      }
   }

   public static int II1(int var0, int var1) {
      switch (var0) {
         case -9:
            return var1 == 0 ? 5 : (var1 == 1 ? 13 : 20);
         case -8:
            return var1 == 0 ? 0 : (var1 == 1 ? 7 : 14);
         case -7:
            return var1 == 0 ? 3 : (var1 == 1 ? 11 : 17);
         case -6:
            return 24 + var1;
         case -5:
         default:
            return var0;
         case -4:
            return 39 + var1;
         case -3:
            return var1 == 0 ? 1 : (var1 == 1 ? 8 : 15);
         case -2:
            return 21 + var1;
      }
   }

   public static int IlOl() {
      I___();
      return II.length;
   }

   static String III(String var0, String var1, String var2) {
      int var3;
      while ((var3 = var0.indexOf(var1)) >= 0) {
         var0 = var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length());
      }

      return var0;
   }

   public static final class II {
      public String II1o;
      public String lIOl;
      public int __ll;
      public int l0_1;
      public int lOlo;
   }

   public static final class III {
      public String II1o;
      public String lIO1;
      public I0Il.II[] II;
   }
}
