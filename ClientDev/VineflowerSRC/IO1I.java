package main;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class IO1I {
   private int I1O0;
   private int l10I;
   private Image I1lI;
   private String Il_0;
   private int[][] II1I;
   private static String Il_o = I1I0(
      "䉯䉞䊼䊞䋸䋞䌼䌞䍰䍞䎼䎏䏮䏈䐼䐇䑠䑡䑓䒰䒇䓤䓖䕃䕪䔭䔈䖵䗳䗱䗕䘵䙱䙨䙇䚤䚂䛰䚈䟩䟇姥䞆夥䝁奧奆嚩嚴嚓䥞囓嘪嘉噬噏䥵䥕䤱䡥䧶䥛䤹坋咲咗䪧哓告呩同启䭡䭁䬭䬍䭮䭎唈䫉唴䱴䱖䰰䰖䳴䳖䰫䰅叙䷀厙䶇千卢包匸僗侌傗傶偕偈倫亗佷佗伷众俷佛伹儸亗仸册亲云乴乗並傀六免冮侁佦佉伺冔剺剭劊努䰫剫䱧古䶵䶊䷱䷖䴷卢䴛䵸䵕䪶䪗吘吺哜喧咓吼嗜䮉䯮䯉啚䬑䬎䬯䣈䣭嘌嘮囀囮嘋嘩䧌嘋䦈圫埋埓埳垓垳壈壨䚗墭䙛塢䘅䘦䟇䟤䞉壐䝕䝲䜓䜌䓩婺娘娺嫔嫲媐娾寚䗄娩䖄嫐䕶䕗䔰䔕䋪屯尀尮屋䉇䈢䈋䏦嵫崇",
      16975
   );
   public static IO1I II = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐏䓹䓟䓴䒉䕶䕐", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I III = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐟䓰䓎䒿䓗䕨䕙䔱", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I IIII = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐊䓴䓒䒮䒜䔶䕇䔸䔒", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I IIIl = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐄䓹䓗䒶䒖䕯䔙䔦䔛䗳", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I III1 = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐄䓹䓗䒶䒖䕯䔙䔦䔛䗳", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I III_ = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐟䓮䓔䒭䒗䔶䕇䔸䔒", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I IIIO = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐚䓮䓞䒿䒗䔪䔙䔦䔛䗳", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I III0 = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐚䓮䓞䒿䒗䔶䕇䔸䔒", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I IIIo = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐛䓳䓘䒯䒊䔶䕇䔸䔒", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I IIl = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝䐁䐈䓲䓝䒵䒚䕭䕄䕸䔅䗺䗔", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑝", 16975), 0);
   public static IO1I IIlI = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䐑䐮䐓䓻", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I IIll = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐼䐑䓩䓞䓫䓗䕨䕙䔱", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I IIl1 = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐹䐏䓹䓞䒴䓋䔶䕇䔸䔒", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I IIl_ = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐧䐘䓰䓗䒵䒎䔶䕇䔸䔒", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I IIlO = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐹䐏䓹䓂䓴䒉䕶䕐", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I IIl0 = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐬䐘䓸䒕䒪䒗䕿", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I IIlo = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐼䐑䓩䓞䓴䒉䕶䕐", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I II1 = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐹䐏䓹䓞䒴䓗䕨䕙䔱", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I II1I = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗䑠䐩䐕䓵䓏䒿䓗䕨䕙䔱", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐗", 16975), 0);
   public static IO1I II1l = new IO1I(Il_o, I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐘䑝䑰䐍䓲䓜", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌳䌇䏭䏋䎮䎃䑞䐘䑝", 16975), -1);
   private static IO1I II11 = new IO1I(I1I0("䉯䉞䊼䊞䋸䋞䌼䌞䍰䍞䎼䎏䏮", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐䑞䑙䑚䐲䐑䓳䓌䓴䒉䕶䕐", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐", 16975), 0);
   private static IO1I II1_ = new IO1I(I1I0("䉯䉞䊼䊞䋸䋞䌼䌞䍰䍞䎼䎏䏮", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐䑞䑒䑚䐺䑓䓬䓕䒽", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐", 16975), 0);
   private static IO1I II1O = new IO1I(I1I0("䉯䉞䊼䊞䋸䋞䌼䌞䍰䍞䎼䎏䏮", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐䑞䑇䑍䐻䐘䓲䒕䒪䒗䕿", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐", 16975), 0);
   public static IO1I II10 = new IO1I(I1I0("䉯䉞䊼䊞䋸䋞䌼䌞䍰䍞䎼䎏䏮", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐䑞䑇䑍䐿䐄䒲䓋䒴䒞", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐", 16975), 0);
   private static IO1I II1o = new IO1I(I1I0("䉯䉞䊼䊞䋸䋞䌼䌞䍰䍞䎼䎏䏮", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐䑞䑏䑍䐿䐓䓻䓞䓴䒉䕶䕐", 16975), I1I0("䉠䈃䋴䋊䊤䊄䍽䌇䌩䌓䏨䏆䎦䎐", 16975), 0);
   public static IO1I II_ = II1_;
   public static IO1I II_I = IIII;
   public static IO1I II_l = II11;
   public static IO1I II_1 = II1O;
   public static IO1I II__ = II1o;
   public static IO1I II_O = IIll;
   public static IO1I II_0 = IIl0;
   public static IO1I II_o = IIl_;
   public static IO1I IIO = II1;
   public static IO1I IIOI = IIlO;
   public static IO1I IIOl = IIl_;
   public static IO1I IIO1 = IIIO;
   public static IO1I IIO_ = II1I;
   public static IO1I IIOO = III0;
   public static IO1I IIO0 = IIll;
   private String IlO;
   public static int l_II = 0;
   public static int l_Il = 1;
   public static int l_I1 = 2;
   public static int l_I_ = 4;
   public static int l_IO = 5;

   private IO1I(String var1, String var2, String var3, int var4) {
      try {
         this.Il_0 = var1;
         this.I1O0 = var4;
         this.IlO = var2;
         Object var11 = null;
         this.I1lI = IO10.IIII(this.IlO);
         DataInputStream var5 = null;

         try {
            var5 = new DataInputStream(I11O.II(var3));
            this.II1I = new int[var5.readShort()][];

            for (int var6 = 0; var6 < this.II1I.length; var6++) {
               this.II1I[var6] = new int[4];
               this.II1I[var6][0] = var5.readShort();
               this.II1I[var6][1] = var5.readShort();
               this.II1I[var6][2] = var5.readShort();
               this.II1I[var6][3] = var5.readShort();
               int var7 = this.II1I[var6][3];
               this.l10I = var7;
            }
         } catch (Exception var9) {
            try {
               var5.close();
            } catch (IOException var8) {
               var8.printStackTrace();
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
         System.out.println(I1I0("䈿䈏䋥䋘䋫䊎䍨䍜䌦䍜", 16975) + var2);
      }
   }

   public final int IIOl() {
      return this.l10I;
   }

   public final int IIII(String var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         int var4;
         if ((var4 = this.Il_0.indexOf(var1.charAt(var3))) == -1) {
            var4 = 0;
         }

         var2 += this.II1I[var4][2] + this.I1O0;
      }

      return var2;
   }

   public void II(IO1l var1, String var2, int var3, int var4, int var5) {
      int var6 = var2.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - this.IIII(var2);
      } else {
         var5 = var3 - (this.IIII(var2) >> 1);
      }

      for (int var7 = 0; var7 < var6; var7++) {
         if ((var3 = this.Il_0.indexOf(var2.charAt(var7))) == -1) {
            var3 = 0;
         }

         if (var3 >= 0) {
            var1.II(this.I1lI, this.II1I[var3][0], this.II1I[var3][1], this.II1I[var3][2], this.II1I[var3][3], 0, var5, var4, 20);
         }

         var5 += this.II1I[var3][2] + this.I1O0;
      }
   }

   public void II(IO1l var1, String var2, int var3, int var4, int var5, IO1I var6) {
      int var7 = var2.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - this.IIII(var2);
      } else {
         var5 = var3 - (this.IIII(var2) >> 1);
      }

      for (int var8 = 0; var8 < var7; var8++) {
         if ((var3 = this.Il_0.indexOf(var2.charAt(var8))) == -1) {
            var3 = 0;
         }

         if (var3 >= 0) {
            var1.II(var6.I1lI, this.II1I[var3][0], this.II1I[var3][1], this.II1I[var3][2], this.II1I[var3][3], 0, var5 + 1, var4, 20);
            var1.II(var6.I1lI, this.II1I[var3][0], this.II1I[var3][1], this.II1I[var3][2], this.II1I[var3][3], 0, var5, var4 + 1, 20);
            var1.II(this.I1lI, this.II1I[var3][0], this.II1I[var3][1], this.II1I[var3][2], this.II1I[var3][3], 0, var5, var4, 20);
         }

         var5 += this.II1I[var3][2] + this.I1O0;
      }
   }

   public final String[] II(String var1, int var2) {
      int var3 = var2;
      String var4 = var1;
      IO1I var5 = this;
      I_lO var6 = new I_lO(I1I0("䈹䈢䋤䋂䊮", 16975));
      String var7 = "";

      for (int var8 = 0; var8 < var4.length(); var8++) {
         if (var4.charAt(var8) != '\n' && var4.charAt(var8) != '\b') {
            var7 = var7 + var4.charAt(var8);
            if (var5.IIII(var7) > var3) {
               int var9 = var7.length() - 1;

               while (var9 >= 0 && var7.charAt(var9) != ' ') {
                  var9--;
               }

               if (var9 < 0) {
                  var9 = var7.length() - 1;
               }

               var6.addElement(var7.substring(0, var9));
               var8 = var8 - (var7.length() - var9) + 1;
               var7 = "";
            }

            if (var8 == var4.length() - 1 && !var7.trim().equals("")) {
               var6.addElement(var7);
            }
         } else {
            var6.addElement(var7);
            var7 = "";
         }
      }

      I_lO var11 = var6;
      String[] var12 = new String[var6.size()];

      for (int var10 = 0; var10 < var11.size(); var10++) {
         var12[var10] = var11.elementAt(var10).toString();
      }

      return var12;
   }

   public void III(IO1l var1, String var2, int var3, int var4, int var5) {
      this.II(var1, var2, var3, var4, 2);
   }

   public void III(IO1l var1, String var2, int var3, int var4, int var5, IO1I var6) {
      this.II(var1, var2, var3, var4, var5, var6);
   }
}
