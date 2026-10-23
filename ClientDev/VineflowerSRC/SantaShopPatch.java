package main;

import java.util.Vector;

public final class SantaShopPatch {
   private static final int SANTA_NPC = 39;
   private static final int OUR_SUBMENU = 77;
   private static final int PAGE_SIZE = 5;
   private static final String ROOT_TOKEN = "SANTA_CRYSTAL_100_ONE_GOLD";
   private static int page = 0;
   private static int[] itemIds = new int[0];
   private static String[] itemNames = new String[0];
   private static int[] displayedActions = new int[0];
   private static String lastNotice = "";
   private static final int PREV = -1;
   private static final int NEXT = -2;
   private static final int BACK = -3;

   private SantaShopPatch() {
   }

   public static void appendMenu(Vector var0, Vector var1) {
      var0.addElement("Sao pha lê x100\n1 vàng");
      var1.addElement("SANTA_CRYSTAL_100_ONE_GOLD");
   }

   public static boolean handleRoot(IO00 var0, IO0 var1, int var2, String var3) {
      if (var2 == 39 && "SANTA_CRYSTAL_100_ONE_GOLD".equals(var3)) {
         page = 0;
         lastNotice = "";
         readCrystalTemplates();
         show(var0);
         return true;
      } else {
         return false;
      }
   }

   private static void readCrystalTemplates() {
      Vector var0 = new Vector();
      Vector var1 = new Vector();
      Object[] var2 = SantaShopBridge.templates();
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            Object var4 = var2[var3];
            if (var4 != null && SantaShopBridge.name(var4) != null) {
               String var5 = SantaShopBridge.name(var4).toLowerCase();
               int var6 = SantaShopBridge.id(var4);
               if ((var6 >= 441 && var6 <= 447 || var6 >= 1416 && var6 <= 1422)
                  && (var5.indexOf("sao pha lê") >= 0 || var5.indexOf("sao pha le") >= 0 || var5.indexOf("sao") >= 0 && var5.indexOf("pha lê") >= 0)) {
                  var0.addElement(new Integer(SantaShopBridge.id(var4)));
                  var1.addElement(SantaShopBridge.name(var4));
               }
            }
         }
      }

      itemIds = new int[var0.size()];
      itemNames = new String[var1.size()];

      for (int var7 = 0; var7 < itemIds.length; var7++) {
         itemIds[var7] = (Integer)var0.elementAt(var7);
         itemNames[var7] = (String)var1.elementAt(var7);
      }
   }

   private static void show(IO00 var0) {
      if (itemIds.length == 0) {
         var0.III(39, 77, "Không tìm thấy sao pha lê trong bảng vật phẩm.", new String[]{"Đóng"});
         displayedActions = new int[]{-3};
      } else {
         int var1 = (itemIds.length + 5 - 1) / 5;
         if (page < 0) {
            page = 0;
         }

         if (page >= var1) {
            page = var1 - 1;
         }

         int var2 = page * 5;
         int var3 = var2 + 5;
         if (var3 > itemIds.length) {
            var3 = itemIds.length;
         }

         Vector var4 = new Vector();
         Vector var5 = new Vector();

         for (int var6 = var2; var6 < var3; var6++) {
            var4.addElement(itemNames[var6] + "\nx100 - 1 vàng");
            var5.addElement(new Integer(var6));
         }

         if (page > 0) {
            var4.addElement("Trang trước");
            var5.addElement(new Integer(-1));
         }

         if (page + 1 < var1) {
            var4.addElement("Trang sau");
            var5.addElement(new Integer(-2));
         }

         var4.addElement("Đóng");
         var5.addElement(new Integer(-3));
         String[] var8 = new String[var4.size()];
         displayedActions = new int[var5.size()];

         for (int var7 = 0; var7 < var8.length; var7++) {
            var8[var7] = (String)var4.elementAt(var7);
            displayedActions[var7] = (Integer)var5.elementAt(var7);
         }

         String var9 = "Cửa hàng sao pha lê x100: 1 vàng mỗi lần mua. (Trang " + (page + 1) + "/" + var1 + ")";
         if (lastNotice.length() > 0) {
            var9 = lastNotice + "\n" + var9;
         }

         var0.III(39, 77, var9, var8);
      }
   }

   public static boolean handleSub(IO00 var0, IO0 var1, int var2, int var3, int var4) {
      if (var2 != 39 || var3 != 77) {
         return false;
      }

      if (var4 >= 0 && var4 < displayedActions.length) {
         int var5 = displayedActions[var4];
         if (var5 == -3) {
            lastNotice = "";
            return true;
         }

         if (var5 == -1) {
            page--;
            lastNotice = "";
            show(var0);
            return true;
         }

         if (var5 == -2) {
            page++;
            lastNotice = "";
            show(var0);
            return true;
         }

         if (var5 >= 0 && var5 < itemIds.length && var1 != null && SantaShopBridge.player(var1) != null && SantaShopBridge.inventory(var1) != null) {
            IOol var6 = SantaShopBridge.player(var1);
            if (var6.Il11 < 1L) {
               lastNotice = "Bạn cần 1 vàng để mua 100 viên.";
            } else {
               int var7 = itemIds[var5];
               IO0l var8 = new IO0l(var7, 100);
               int var9 = var7 >= 1416 && var7 <= 1422 ? var7 - 1416 + 441 : var7;
               int[] var10 = IOoI.IIII(var9);
               var8.III(var10[0], var10[1]);
               if (!SantaShopBridge.inventory(var1).III0(var8)) {
                  lastNotice = "Hành trang đầy, không trừ vàng.";
               } else {
                  var6.Il11--;
                  SantaShopBridge.inventory(var1).l1_l();
                  SantaShopBridge.inventory(var1).l1_();
                  SantaShopBridge.save(var1);
                  lastNotice = "Đã mua 100 " + itemNames[var5] + " với 1 vàng!";
               }
            }

            show(var0);
            return true;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }
}
