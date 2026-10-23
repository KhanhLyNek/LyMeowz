package main;

import javax.microedition.lcdui.Image;

public final class I_10 {
   private static int ll1l = 15787715;
   private static Image[] III0 = new Image[6];
   public static int II0I;
   private static int I_0;

   public I_10() {
      int[] var10000 = new int[]{15970400, -844109861, 2250052, 16374659, 15906669, 12931125, 3108954};
   }

   public static void II(IO1l var0, I1Il var1, I1Il var2, I1Il var3) {
      IO1I var4 = IO1I.III_;
      if (var1 != null && (I_0 = var4.IIII(var1.IIoO)) > 0) {
         if (var1.I1 >= 0 && var1.I1I > 0) {
            var1.II(var0);
         } else {
            var0.II(IO1_.l_l == 0 ? I1_I.IlIo : I1_I.IlI0, 1, II.IIlI - IO1_.llo_ - 1, 0);
            var4.II(var0, var1.IIoO, 35, II.IIlI - IO1_.llo_ + 3 + 3, 2);
         }
      }

      if (var2 != null && (I_0 = var4.IIII(var2.IIoO)) > 0) {
         if (var2.I1 > 0 && var2.I1I > 0) {
            var2.II(var0);
         } else {
            var0.II(IO1_.l_l == 1 ? I1_I.IlIo : I1_I.IlI0, II.IIll - 35, II.IIlI - IO1_.llo_ - 1, 0);
            var4.II(var0, var2.IIoO, II.IIll, II.IIlI - IO1_.llo_ + 3 + 3, 2);
         }
      }

      if (var3 != null && (I_0 = var4.IIII(var3.IIoO)) > 0) {
         if (var3.I1 > 0 && var3.I1I > 0) {
            var3.II(var0);
            return;
         }

         var0.II(IO1_.l_l == 2 ? I1_I.IlIo : I1_I.IlI0, II.IIl - 71, II.IIlI - IO1_.llo_ - 1, 0);
         var4.II(var0, var3.IIoO, II.IIl - 35, II.IIlI - IO1_.llo_ + 3 + 3, 2);
      }
   }

   public void II(IO1l var1, int var2, int var3, int var4, int var5, String[] var6) {
      III(var2, var3, var4, 69, var1);
      var3 = var3 + 20 - IO1I.II1l.IIOl();
      var5 = 0;

      for (int var8 = var3; var5 < var6.length; var8 += IO1I.II1l.IIOl()) {
         IO1I.II1l.II(var1, var6[var5], var2 + var4 / 2, var8, 2);
         var5++;
      }
   }

   public static void II(int var0, int var1, int var2, int var3, IO1l var4) {
      var4.Illl(9340251);
      var4.III1(var0 + 18, var1, (var2 - 36) / 2 - 32, var3);
      var4.III1(var0 + 18 + (var2 - 36) / 2 + 32, var1, (var2 - 36) / 2 - 22, var3);
      var4.III1(var0, var1 + 8, var2, var3 - 17);
      var4.Illl(ll1l);
      var4.III_(var0 + 18, var1 + 3, (var2 - 36) / 2 - 32, var3 - 4);
      var4.III_(var0 + 18 + (var2 - 36) / 2 + 31, var1 + 3, (var2 - 38) / 2 - 22, var3 - 4);
      var4.III_(var0 + 1, var1 + 6, var2 - 1, var3 - 11);
      var4.Illl(14667919);
      var4.III_(var0 + 18, var1 + 1, (var2 - 36) / 2 - 32, 2);
      var4.III_(var0 + 18 + (var2 - 36) / 2 + 32, var1 + 1, (var2 - 36) / 2 - 12, 2);
      var4.III_(var0 + 18, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.III_(var0 + 18 + (var2 - 36) / 2 + 32, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.III_(var0 + 1, var1 + 11, 2, var3 - 18);
      var4.III_(var0 + var2 - 2, var1 + 11, 2, var3 - 18);
      var4.II(III0[0], var0 - 3, var1 - 2, 20);
      var4.II(III0[2], var0 + var2 + 3, var1 - 2, IOII.l1O_);
      var4.II(III0[1], var0 - 3, var1 + var3 + 3, IOII.l1OO);
      var4.II(III0[3], var0 + var2 + 4, var1 + var3 + 2, IOII.l1O0);
      var4.II(III0[4], var0 + var2 / 2, var1, IOII.II0I);
      var4.II(III0[5], var0 + var2 / 2, var1 + var3 + 1, IOII.I_Oo);
   }

   public static void III(int var0, int var1, int var2, int var3, IO1l var4) {
      var4.Illl(13524492);
      var4.III1(var0 + 6, var1, var2 - 12, var3);
      var4.III1(var0, var1 + 6, var2, var3 - 12);
      var4.III1(var0 + 7, var1 + 1, var2 - 14, var3 - 2);
      var4.III1(var0 + 1, var1 + 7, var2 - 2, var3 - 14);
      var4.Illl(14338484);
      var4.III_(var0 + 8, var1 + 2, var2 - 16, var3 - 3);
      var4.III_(var0 + 2, var1 + 8, var2 - 3, var3 - 14);
      var4.II(II.IIIl[2], var0, var1, 20);
      var4.II(II.IIIl[2], 0, 0, 16, 16, 2, var0 + var2 + 1, var1, IOII.l1O_);
      var4.II(II.IIIl[2], 0, 0, 16, 16, 1, var0, var1 + var3 + 1, IOII.l1OO);
      var4.II(II.IIIl[2], 0, 0, 16, 16, 3, var0 + var2 + 1, var1 + var3 + 1, IOII.l1O0);
   }

   public static void IIII(int var0, int var1, int var2, int var3, IO1l var4) {
      var4.Illl(6702080);
      var4.III_(var0, var1, var2, var3);
      var4.Illl(14338484);
      var4.III_(var0 + 1, var1 + 1, var2 - 2, var3 - 2);
   }

   static {
      for (int var0 = 0; var0 < III0.length; var0++) {
         III0[var0] = IO10.IIII(IlO1("ᙡᘀ᛭ᛂᚤᚠᝥᝆᜡᜀឫ៎ុ឵ᡥᡧᡊᠨ\u180e\u18feᢈᢽᢟ\u1978ᥕ", 5710) + (var0 + 1) + IlO1("ᙠᘝᛢᛌ", 5710));
      }

      II0I = 24;
      I_0 = 0;
      IO10.IIII(IlO1("ᙡᘀ᛭ᛂᚤᚠᝥᝆᜡᜀឫ៎ុ឵ᡥᡧᡊᠨ\u180e\u18feᢈᢽᢛ\u197fᥓᤶ\u191fᦽᧂᦿᦗ", 5710));
   }
}
