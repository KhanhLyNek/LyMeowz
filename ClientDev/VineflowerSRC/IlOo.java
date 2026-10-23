package main;

public class IlOo {
   public static int[] II(int var0) {
      Il_l.II var1 = new Il_l.II();
      Il_l.III_ var2 = new Il_l.III_();
      Il_l.III1 var3 = new Il_l.III1();
      int[] var4 = new int[]{IOlO.l1oI};
      var2.III(new IlOo.II(var4));
      var3.II(new Integer(IOlO.l1oI), Boolean.TRUE);
      long var5 = Ilol.II().Illo;
      boolean var7 = Ilol.II().II.II01 > 30;

      while (!var2.II1_()) {
         IlOo.II var8 = (IlOo.II)var2.IIIl();
         int[] var9 = var8.IIO_;
         int var10 = var9[var9.length - 1];
         if (var10 != var0) {
            Integer var11 = new Integer(var10);
            if (IlOO.III1.IIII(var11)) {
               Il_l.II var12 = (Il_l.II)IlOO.III1.II(var11);

               for (int var13 = 0; var13 < var12.IIlO(); var13++) {
                  IlO1 var14 = (IlO1)var12.II(var13);
                  int var15 = var14.I_1O;
                  Integer var16 = new Integer(var15);
                  if (var10 == 19 && var15 == 109 && !var7) {
                     if (!var3.IIII(var16)) {
                        var3.II(var16, Boolean.TRUE);
                        int[] var22 = II(var9, var15);
                        var2.III(new IlOo.II(var22));
                     }
                  } else if (!var3.IIII(var16) && (var7 || var15 < 105 || var15 > 110)) {
                     var3.II(var16, Boolean.TRUE);
                     int[] var17 = II(var9, var15);
                     var2.III(new IlOo.II(var17));
                  }
               }
            }
         } else if (II(var9, var5, var7)) {
            var1.III(var9);
         }
      }

      int var18 = Integer.MAX_VALUE;
      int[] var19 = null;

      for (int var20 = 0; var20 < var1.IIlO(); var20++) {
         int[] var21 = (int[])var1.II(var20);
         if (var21.length < var18) {
            var18 = var21.length;
            var19 = var21;
         }
      }

      return var19;
   }

   private static boolean II(int[] var0, long var1, boolean var3) {
      if (IIII(var0)) {
         return false;
      }

      if (!var3 && IIIl(var0)) {
         return false;
      }

      for (int var4 = 0; var4 < var0.length; var4++) {
         int var5 = var0[var4];
         if (var5 != 155 && var5 >= 153 && var5 <= 159 && var1 < 4000000000L) {
            return false;
         }

         if ((var5 == 155 || var5 == 166) && var1 < 60000000000L) {
            return false;
         }

         for (int var6 = 0; var6 < IlOO.II_l.length; var6++) {
            if (Ilol.II().II.II01 <= 24 && var5 == IlOO.II_l[var6]) {
               return false;
            }
         }
      }

      return true;
   }

   private static boolean IIII(int[] var0) {
      for (int var1 = 1; var1 < var0.length - 1; var1++) {
         if (var0[var1] == 102 && var0[var1 + 1] == 24 && (var0[var1 - 1] == 27 || var0[var1 - 1] == 28 || var0[var1 - 1] == 29)) {
            return true;
         }
      }

      return false;
   }

   private static boolean IIIl(int[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1] >= 105 && var0[var1] <= 110) {
            return true;
         }
      }

      return false;
   }

   private static int[] II(int[] var0, int var1) {
      int[] var2 = new int[var0.length + 1];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      var2[var0.length] = var1;
      return var2;
   }

   public static String IIIl(int var0) {
      long var1 = Ilol.II().Illo;
      boolean var3 = false;
      String var4 = "";
      if (var0 == 154 && var1 < 40000000000L) {
         var4 = II0I("╶▤┘▬◈㭭▜☨♔㢯☆⚤⛎㡣⚏❨✿❊㦌✕➻⟎➱➑㛔⡃⡵⠗⣻⣝⣱⢝⥮⥞⥭⥝⦾⦞⧳⧈⨳⨖⩩⩔⪳⪒⫭⫐⫏⬮⬑⭬⭋⮪⮗", 9519);
         var3 = true;
      } else if (var0 == 155 && var1 < 60000000000L) {
         var4 = II0I("╶▤┘▬◈㭭▜☨♔㢯☆⚤⛎㡣⚏❨✿❊㦌✕➻⟎➱➑㛔⡃⡵⠗⣻⣝⣱⢝⥮⥞⥭⥝⦾⦟⧳⧈⨱⨖⩩⩔⪳⪒⫭⫐⫏⬮⬑⭬⭋⮪⮗", 9519);
         var3 = true;
      } else if (var0 == 166 && var1 < 60000000000L) {
         var4 = II0I("╶▤┘▬◈㭭▜☨♔㢯☆⚤⛎㡣⚏❨✿❊㦌✕➻⟎➱➑㛔⡃⡵⠗⣻⣝⣱⢝⥮⥞⥭⥝⦽⦜⧳⧈⨱⨖⩩⩔⪳⪒⫭⫐⫏⬮⬑⭬⭋⮪⮗", 9519);
         var3 = true;
      } else if (var0 >= 153 && var0 <= 159 && var0 != 155 && var1 < 40000000000L) {
         var4 = II0I("╶▤┘▬◈㭭▜☨♔㢯☆⚤⛎㡣⚏❨✿❊㦌✕➻⟎➱➑㛔⡃⡵⠗⣻⣝⣱⢝⥮⥞⥭", 9519) + var0 + II0I("┕╮╙▼▇◺◙☸☋♶♕⚴⚏⛲⛑✰✱", 9519);
         var3 = true;
      }

      if (!var3 && IlOO.IIl_(var0) && Ilol.II().II.II01 <= 24) {
         var4 = II0I("╧▭└▬◃▥┉♦☇☲☍♤⛍⚪⛁❮❷❗㦚✑➻⟌㤼⟘⤆㛵⡵⠂⡳⣝⣱⢝⥮⥞⥭", 9519) + var0 + II0I("━", 9519);
         var3 = true;
      }

      if (!var3) {
         boolean var5 = false;

         for (int var6 = 0; var6 < IlOO.II_o.length; var6++) {
            if (var0 == IlOO.II_o[var6]) {
               var5 = true;
               break;
            }
         }

         if (!var5) {
            for (int var7 = 0; var7 < IlOO.II_0.length; var7++) {
               if (var0 == IlOO.II_0[var7]) {
                  var5 = true;
                  break;
               }
            }
         }

         if (!var5 && var0 >= 53 && var0 <= 62) {
            var5 = true;
         }

         if (var5 && Ilol.II().II == null) {
            var4 = II0I("╬㯩┃▬◈┹◉♪♆☨☂⚤⛋㠛⚈✠☎㧽❽✊❻⟕⟹➕⡶⡆⡵", 9519) + var0 + II0I("━", 9519);
            var3 = true;
         }
      }

      if (!var3 && var0 == 160 && !I1ol.II1_(992)) {
         var4 = II0I("╤┦▙◢◌◪▊⛻☇☈☍㠯⛍⛢⚕❨㧂❗❽✗⟳❎➷➟⠶", 9519);
         var3 = true;
      }

      if (!var3) {
         var4 = II0I("╤┦▙◢◌◪▝♠㣤♦☑♨⛎⛢⚕❨㦺❇❽♭☫㥧➷➟⠷⤧⠼⡔⣧㙙⣱⢝⥮⥞⥭", 9519) + IOlO.l1oI + II0I("┏\u245f㯒◢▋▧█♸☇", 9519) + var0 + II0I("━", 9519);
      }

      return var4;
   }

   static class II {
      int[] IIO_;

      II(int[] var1) {
         this.IIO_ = var1;
      }
   }
}
