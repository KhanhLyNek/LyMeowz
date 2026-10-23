package main;

import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

public final class KamePetPatch {
   private static final int NPC_KAME = 5;
   private static final int SERVICE_MENU = 9917;
   private static final int COST_EXPERIENCE = 1000;
   private static final int COST_SKILL = 1;
   private static final long EXPERIENCE_GAIN = 1500000L;
   private static final Random RNG = new Random();
   private static int rootOptionIndex = -1;
   private static String notice = "";

   private KamePetPatch() {
   }

   public static String[] decorate(String[] var0, int var1, int var2) {
      if (var1 == 5 && (var2 == 0 || var2 == 1655) && var0 != null) {
         rootOptionIndex = var0.length;
         String[] var3 = new String[var0.length + 1];
         System.arraycopy(var0, 0, var3, 0, var0.length);
         var3[var0.length] = "Đút lót Kame - Đệ tử";
         return var3;
      } else {
         return var0;
      }
   }

   public static boolean dispatch(IO00 var0, IO0 var1, int var2, int var3, int var4) {
      return SantaShopPatch.handleSub(var0, var1, var2, var3, var4) ? true : handle(var0, var1, var2, var3, var4);
   }

   public static boolean handle(IO00 var0, IO0 var1, int var2, int var3, int var4) {
      if (var2 != 5) {
         return false;
      }

      if ((var3 == 0 || var3 == 1655) && var4 == rootOptionIndex && rootOptionIndex >= 0) {
         notice = "";
         show(var0);
         return true;
      }

      if (var3 != 9917) {
         return false;
      }

      if (var4 < 0 || var4 > 5) {
         return true;
      }

      if (var4 == 5) {
         notice = "";
         return true;
      }

      if (var1 != null && SantaShopBridge.player(var1) != null) {
         IOol var5 = SantaShopBridge.player(var1);
         IOol var6 = var5.III;
         if (var6 == null) {
            notice = "Bạn chưa có đệ tử.";
            show(var0);
            return true;
         }

         if (var4 == 0) {
            increase(var1, var5, var6);
         } else {
            reroll(var1, var5, var6, var4 - 1);
         }

         show(var0);
         return true;
      } else {
         notice = "Không tìm thấy nhân vật.";
         show(var0);
         return true;
      }
   }

   private static void show(IO00 var0) {
      String[] var1 = new String[]{
         "Tăng 1.500.000 TN + SM\n1.000 ngọc", "Đổi skill 1\n1 ngọc", "Đổi skill 2\n1 ngọc", "Đổi skill 3\n1 ngọc", "Đổi skill 4\n1 ngọc", "Đóng"
      };
      String var2 = "Quy Lão Kame - Dịch vụ đệ tử. Mỗi lần tăng 1.500.000 sức mạnh và 1.500.000 tiềm năng.";
      if (notice.length() > 0) {
         var2 = notice + "\n" + var2;
      }

      var0.III(5, 9917, var2, var1);
   }

   private static long cappedAdd(long var0, long var2) {
      return var0 > Long.MAX_VALUE - var2 ? Long.MAX_VALUE : Math.max(0L, var0) + var2;
   }

   private static void increase(IO0 var0, IOol var1, IOol var2) {
      if (var1.lOoO < 1000) {
         notice = "Cần 1.000 ngọc. Hiện có: " + var1.lOoO;
      } else if (var2.IO_l >= 0L && var2.IO_1 >= 0L && var2.IO_l <= 9223372036853275807L && var2.IO_1 <= 9223372036853275807L) {
         var2.IO_l += 1500000L;
         var2.IO_1 += 1500000L;
         var1.lOoO -= 1000;
         save(var0);
         notice = "Thành công! Đệ tử +1.500.000 SM, +1.500.000 TN. Đã trừ 1.000 ngọc.";
      } else {
         notice = "Chỉ số đệ tử không hợp lệ hoặc vượt giới hạn.";
      }
   }

   private static int val(Object var0, String var1, int var2) {
      try {
         Field var3 = var0.getClass().getField(var1);
         return var3.getInt(var0);
      } catch (Exception var4) {
         return var2;
      }
   }

   private static Object meta(int var0) {
      Hashtable var1 = IOO.III0;
      return var1 == null ? null : var1.get(new Integer(var0));
   }

   private static boolean alreadyKnown(IOol var0, int var1, int var2) {
      if (var0.I__l == null) {
         return false;
      }

      for (int var3 = 0; var3 < var0.I__l.length; var3++) {
         if (var3 != var2 && var0.I__l[var3] == var1) {
            return true;
         }
      }

      return false;
   }

   private static void reroll(IO0 var0, IOol var1, IOol var2, int var3) {
      if (var1.lOoO < 1) {
         notice = "Thiếu 1 ngọc để đổi skill.";
      } else if (var3 >= 0 && var2.I__l != null && var3 < var2.I__l.length) {
         int var4 = var2.I__l[var3];
         IOO.I___();
         Object var5 = meta(var4);
         if (var5 == null) {
            notice = "Không tìm thấy dữ liệu skill cũ. Không trừ ngọc.";
         } else {
            int var6 = val(var5, "l1__", -1);
            int var7 = val(var5, "lO0I", -1);
            int var8 = var2.lOlI;
            if (var6 > 0 && var7 >= 0 && var8 >= 0 && var8 <= 2) {
               Vector var9 = new Vector();
               Hashtable var10 = IOO.III0;
               if (var10 != null) {
                  Enumeration var11 = var10.elements();

                  while (var11.hasMoreElements()) {
                     Object var12 = var11.nextElement();
                     int var13 = val(var12, "lO0I", -1);
                     int var14 = val(var12, "l1__", -1);
                     int var15 = val(var12, "I1l", -1);
                     if (var15 >= 0 && var14 == var6 && var13 != var7 && var13 >= var8 * 14 && var13 < var8 * 14 + 14 && !alreadyKnown(var2, var15, var3)) {
                        var9.addElement(new Integer(var15));
                     }
                  }
               }

               if (var9.size() == 0) {
                  notice = "Không có skill khác cùng cấp và hành tinh. Không trừ ngọc.";
               } else {
                  int var16 = (Integer)var9.elementAt(RNG.nextInt(var9.size()));
                  if (var2.I__1 != null) {
                     for (int var17 = 0; var17 < var2.I__1.length; var17++) {
                        if (var2.I__1[var17] == var4) {
                           var2.I__1[var17] = var16;
                        }
                     }
                  }

                  var2.I__l[var3] = var16;
                  var1.lOoO--;
                  save(var0);
                  notice = "Đã đổi skill " + (var3 + 1) + " (" + var4 + " -> " + var16 + "). Đã trừ 1 ngọc.";
               }
            } else {
               notice = "Dữ liệu skill đệ tử không hợp lệ. Không trừ ngọc.";
            }
         }
      } else {
         notice = "Đệ tử chưa mở skill " + (var3 + 1) + ". Không trừ ngọc.";
      }
   }

   private static void save(IO0 var0) {
      if (var0.IIIl != null) {
         var0.IIIl.l1_l();
         var0.IIIl.l1_();
      }

      var0.I__O();
   }
}
