package main;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;

public final class IOI0 implements I1_1 {
   public int II0I;
   public int I_O0;
   public int l10;
   public int l10I;
   public boolean Il_0;
   private boolean I1ll = false;
   private static int IIOo = 2;
   private static final int[] I1oI = new int[]{18, 14, 11, 9, 6, 4, 2};
   private static int II = 0;
   private static String[] II_o = new String[]{
      I1II("猶猅", 29462),
      I1II("猸猙猔獌玳珮珡珍琡琉瑡瑃璣璓瓢瓌町甘畺畘疧疇疾痼痛癃瘚癱瘁盤監皊盍眲眛睢", 29462),
      I1II("獷獗猷獁獳獑浳猌檯瓏櫩櫌樣樂橥痤殩殔毷毖欵疓", 29462),
      I1II("獲獐猲獀犃獘猸浔檳檔璦櫔橋橪樍樠电", 29462),
      I1II("獱獝猽獇獿獝洙狆櫅琙", 29462),
      I1II("獼獞猸獆", 29462),
      I1II("獻獛猻獅獡獃洟猚櫃瓙檝檸機橾樑畆毝毸殛殂歡疗", 29462),
      I1II("獦獄猦猀玥", 29462),
      I1II("獢獀猢獋獨獈洷犆櫫疝檥檀橧橆樹瓟", 29462),
      I1II("獡獍猭猉玫獌洣洘櫷櫘瑵", 29462),
      I1II("猼", 29462),
      I1II("猵", 29462)
   };
   private static String[] IIO = new String[]{
      I1II("猦", 29462),
      I1II("猧", 29462),
      I1II("獷獗猷獁", 29462),
      I1II("獲獐猲獀", 29462),
      I1II("獱獝猽獇", 29462),
      I1II("獼獞猸獆", 29462),
      I1II("獻獛猻獅", 29462),
      I1II("獦獄猦猀玥", 29462),
      I1II("獢獀猢獋", 29462),
      I1II("獡獍猭猉玫", 29462),
      I1II("猦", 29462),
      I1II("猦", 29462)
   };
   public String IIoI = "";
   private String Il_l = "";
   private String Il_1 = "";
   private String Il__ = "";
   private int II0l = 0;
   private int Iol = 0;
   private int IIl = 500;
   private int I1 = 0;
   private int I1I = -1984;
   private int Ioll = 0;
   private int I1__ = 0;
   private int I1_O = 10;
   private int I1_0 = 0;
   public static boolean III_;
   private static int I1_o;
   private int I1O = 0;
   private static int I1OI = 11;
   public boolean IOOO;
   public String II1o = "";
   public I1Il IIII;
   private static Image I1IO = IO10.IIII(I1II("猹獘猵猚珼珸玽玎瑩瑈瑣理瓳瓽璭璟畲畐甶甆疰病疥疭痐癭癒瘼", 29462));
   private boolean I_1_ = true;
   public boolean I0O_ = true;
   private static Image I1I0 = IO10.IIII(I1II("猹獘猵猚珼珸玽玎瑩瑈瑣理瓳瓽璭璟畲畐甶甆疰病疴疹痐癭癒瘼", 29462));

   public void IIl1() {
      TextBox var1;
      (var1 = new TextBox(this.II1o, "", this.IIl, 0)).addCommand(new Command(IO11.I_lI, 4, 0));
      var1.addCommand(new Command(IO11.I_l_, 3, 0));
      var1.setCommandListener(new IOIo(this, var1));

      try {
         if (this.I1_0 == 2) {
            var1.setConstraints(65536);
         } else if (this.I1_0 == 1) {
            var1.setConstraints(2);
         } else {
            var1.setConstraints(0);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      var1.setString(this.Il_l);
      var1.setMaxSize(this.IIl);
      Display.getDisplay(GameMidlet.II).setCurrent(var1);
   }

   public IOI0() {
      this.Il_l = "";
      II = IO1I.II1l.IIOl() + 1;
      this.IIII = new I1Il(IO11.I_II, this, 1000, null);
      I1_o = 0;
      if (I_O1.III(I1II("獧獂猱猁珦珈", 29462)) == 1) {
         III_ = true;
      }
   }

   public void IOlI() {
      if (this.II0l > 0 && this.Il_l.length() > 0) {
         this.Il_l = this.Il_l.substring(0, this.II0l - 1) + this.Il_l.substring(this.II0l, this.Il_l.length());
         this.II0l--;
         this.IO11();
         this.IOl_();
      }
   }

   private void IO11() {
      if (this.I1_0 == 2) {
         this.Il__ = this.Il_1;
      } else {
         this.Il__ = this.Il_l;
      }

      if (this.I1 < 0 && IO1I.II1l.IIII(this.Il__) + this.I1 < this.l10 - 6 - 13) {
         this.I1 = this.l10 - 10 - IO1I.II1l.IIII(this.Il__);
      }

      if (this.I1 + IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) <= 0) {
         this.I1 = -IO1I.II1l.IIII(this.Il__.substring(0, this.II0l));
         this.I1 += 40;
      } else if (this.I1 + IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) >= this.l10 - 22) {
         this.I1 = this.l10 - 10 - IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) - 12;
      }

      if (this.I1 > 0) {
         this.I1 = 0;
      }
   }

   private void IIOI(int var1) {
      if (var1 == 432) {
         var1 = 119;
      }

      if ((this.I1_0 != 2 && this.I1_0 != 3 || var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 90 || var1 >= 97 && var1 <= 122)
         && this.Il_l.length() < this.IIl) {
         String var2 = this.Il_l.substring(0, this.II0l) + (char)var1;
         if (this.II0l < this.Il_l.length()) {
            var2 = var2 + this.Il_l.substring(this.II0l, this.Il_l.length());
         }

         this.Il_l = var2;
         this.II0l++;
         this.IOl_();
         this.IO11();
      }
   }

   public final boolean II1o(int var1) {
      if (var1 != 8 && var1 != -8 && var1 != 204) {
         if (var1 >= 65 && var1 <= 122 && !III_) {
            III_ = true;
            I1_o = 0;
            I_O1.IIIl(I1II("獧獂猱猁珦珈", 29462), 1);
         }

         if (III_) {
            if (var1 == 45) {
               if (var1 == this.I1I && this.Ioll < I1oI[IIOo]) {
                  this.Il_l = this.Il_l.substring(0, this.II0l - 1) + '_';
                  this.Il__ = this.Il_l;
                  this.IOl_();
                  this.IO11();
                  this.I1I = -1984;
                  return false;
               }

               this.I1I = 45;
            }

            if (var1 >= 32) {
               this.IIOI(var1);
               return false;
            }
         }

         if (var1 == I1OI) {
            this.I1O++;
            if (this.I1O > 3) {
               this.I1O = 0;
            }

            this.Ioll = 1;
            this.I1I = var1;
            return false;
         } else {
            if (var1 == 42) {
               var1 = 58;
            }

            if (var1 == 35) {
               var1 = 59;
            }

            if (var1 < 48 || var1 > 59) {
               this.I1__ = 0;
               this.I1I = -1984;
               if (var1 == 14) {
                  if (this.II0l > 0) {
                     this.II0l--;
                     this.IO11();
                     this.I1_O = 10;
                     return false;
                  }
               } else if (var1 == 15) {
                  if (this.II0l < this.Il_l.length()) {
                     this.II0l++;
                     this.IO11();
                     this.I1_O = 10;
                     return false;
                  }
               } else {
                  if (var1 == 19) {
                     this.IOlI();
                     return false;
                  }

                  this.I1I = var1;
               }
            } else if (this.I1_0 != 0 && this.I1_0 != 2 && this.I1_0 != 3) {
               if (this.I1_0 == 1) {
                  this.IIOI(var1);
                  this.Ioll = 1;
               }
            } else {
               String[] var2;
               if (this.I1_0 != 2 && this.I1_0 != 3) {
                  var2 = II_o;
               } else {
                  var2 = IIO;
               }

               if (var1 == this.I1I) {
                  this.I1__ = (this.I1__ + 1) % var2[var1 - 48].length();
                  char var3 = var2[var1 - 48].charAt(this.I1__);
                  if (this.I1O == 0) {
                     var3 = Character.toLowerCase(var3);
                  } else if (this.I1O == 1) {
                     var3 = Character.toUpperCase(var3);
                  } else if (this.I1O == 2) {
                     var3 = Character.toUpperCase(var3);
                  } else {
                     var3 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
                  }

                  String var4 = this.Il_l.substring(0, this.II0l - 1) + var3;
                  if (this.II0l < this.Il_l.length()) {
                     var4 = var4 + this.Il_l.substring(this.II0l, this.Il_l.length());
                  }

                  this.Il_l = var4;
                  this.Ioll = I1oI[IIOo];
                  this.IOl_();
               } else if (this.Il_l.length() < this.IIl) {
                  if (this.I1O == 1 && this.I1I != -1984) {
                     this.I1O = 0;
                  }

                  this.I1__ = 0;
                  char var6 = var2[var1 - 48].charAt(this.I1__);
                  if (this.I1O == 0) {
                     var6 = Character.toLowerCase(var6);
                  } else if (this.I1O == 1) {
                     var6 = Character.toUpperCase(var6);
                  } else if (this.I1O == 2) {
                     var6 = Character.toUpperCase(var6);
                  } else {
                     var6 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
                  }

                  String var8 = this.Il_l.substring(0, this.II0l) + var6;
                  if (this.II0l < this.Il_l.length()) {
                     var8 = var8 + this.Il_l.substring(this.II0l, this.Il_l.length());
                  }

                  this.Il_l = var8;
                  this.Ioll = I1oI[IIOo];
                  this.II0l++;
                  this.IOl_();
                  this.IO11();
               }

               this.I1I = var1;
            }

            return true;
         }
      } else {
         this.IOlI();
         return true;
      }
   }

   public void III_(IO1l var1) {
      if (this.I_1_) {
         var1.IIIO(0, 0, II.IIl, II.IIlI);
      }

      boolean var2 = this.Il_0;
      if (this.I1_0 == 2) {
         this.Il__ = this.Il_1;
      } else {
         this.Il__ = this.Il_l;
      }

      int var3 = this.II0I;
      int var4 = this.I_O0 - 1;
      int var5 = this.l10;
      int var6 = this.l10I;
      int var7 = 6 + this.I1 + this.II0I;
      int var8 = this.I_O0 + (this.l10I - IO1I.II1l.IIOl()) / 2;
      String var9 = this.II1o;
      String var10 = this.Il__;
      int var11 = var5;
      int var12 = var4;
      int var13 = var3;
      IO1l var14 = var1;
      var1.Illl(0);
      if (var2) {
         var1.II(I1I0, 0, 81, 29, 27, 0, var3, var4, 0);
         var1.II(I1I0, 0, 135, 29, 27, 0, var3 + var5 - 29, var4, 0);
         var1.II(I1I0, 0, 108, 29, 27, 0, var3 + var5 - 58, var4, 0);

         for (int var15 = 0; var15 < (var11 - 58) / 29; var15++) {
            var14.II(I1I0, 0, 108, 29, 27, 0, var13 + 29 + var15 * 29, var12, 0);
         }
      } else {
         var1.II(I1I0, 0, 0, 29, 27, 0, var3, var4, 0);
         var1.II(I1I0, 0, 54, 29, 27, 0, var3 + var5 - 29, var4, 0);
         var1.II(I1I0, 0, 27, 29, 27, 0, var3 + var5 - 58, var4, 0);

         for (int var16 = 0; var16 < (var11 - 58) / 29; var16++) {
            var14.II(I1I0, 0, 27, 29, 27, 0, var13 + 29 + var16 * 29, var12, 0);
         }
      }

      var14.IIIO(var13 + 3, var12 + 1, var11 - 4, var6);
      if (var10 != null && !var10.equals("")) {
         IO1I.II1l.II(var14, var10, var7, var8, 0);
      } else if (var9 != null) {
         if (var2) {
            IO1I.IIIo.II(var14, var9, var7, var8 + 2, 0);
         } else {
            IO1I.IIl.II(var14, var9, var7, var8 + 2, 0);
         }
      }

      var1.Illl(0);
      if (this.Il_0 && this.I0O_) {
         if (this.Ioll == 0 && (this.I1_O > 0 || this.Iol / 5 % 2 == 0)) {
            var1.Illl(7999781);
            var1.III_(7 + this.I1 + this.II0I + IO1I.II1l.IIII(this.Il__.substring(0, this.II0l)) - 1, this.I_O0 + (this.l10I - II) / 2 + 1, 1, II);
         }

         II.II(var1);
         if (this.Il_l != null && this.Il_l.length() > 0 && II.IIIl && var2) {
            var1.II(I1IO, this.II0I + this.l10 - 13, this.I_O0 + this.l10I / 2 + 1, 3);
         }
      }
   }

   private void IOl_() {
      if (this.I1_0 == 2) {
         this.Il_1 = "";

         for (int var1 = 0; var1 < this.Il_l.length(); var1++) {
            this.Il_1 = this.Il_1 + I1II("猼", 29462);
         }

         if (this.Ioll > 0 && this.II0l > 0) {
            this.Il_1 = this.Il_1.substring(0, this.II0l - 1) + this.Il_l.charAt(this.II0l - 1) + this.Il_1.substring(this.II0l, this.Il_1.length());
         }
      }
   }

   public void IIlO() {
      this.I0O_ = true;
      this.Iol++;
      if (this.Ioll > 0) {
         this.Ioll--;
         if (this.Ioll == 0) {
            this.I1__ = 0;
            if (this.I1O == 1 && this.I1I != I1OI) {
               this.I1O = 0;
            }

            this.I1I = -1984;
            this.IOl_();
         }
      }

      if (this.I1_O > 0) {
         this.I1_O--;
      }

      if (II.IIIo) {
         if (II.II(this.II0I + this.l10 - 20, this.I_O0, 40, this.l10I)) {
            this.Il_l = "";
            this.II0l = 0;
            this.IO11();
            this.IOl_();
            this.Il_0 = true;
            return;
         }

         if (II.II(this.II0I, this.I_O0, this.l10, this.l10I)) {
            this.IIl1();
            return;
         }

         this.Il_0 = false;
      }
   }

   public final String IIl1() {
      return this.Il_l;
   }

   public void IIOl(String var1) {
      if (var1 != null) {
         this.I1I = -1984;
         this.Ioll = 0;
         this.I1__ = 0;
         this.Il_l = var1;
         this.Il__ = var1;
         this.IOl_();
         this.II0l = var1.length();
         this.IO11();
      }
   }

   public void II(int var1) {
      this.IIl = var1;
   }

   public void Ill(int var1) {
      this.I1_0 = var1;
      short var2 = 500;
      this.IIl = var2;
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1000:
            this.IOlI();
      }
   }

   static {
      String[] var10000 = new String[]{I1II("獷獗猷", 29462), I1II("獗獗猷", 29462), I1II("獗獷猗", 29462), I1II("猧猇獧", 29462)};
      int[][] var2 = new int[][]{
         {32, 48},
         {49, 69},
         {50, 84},
         {51, 85},
         {52, 68},
         {53, 71},
         {54, 74},
         {55, 67},
         {56, 66},
         {57, 77},
         {42, 128},
         {35, 137},
         {33, 113},
         {63, 97},
         {64, 121, 122},
         {46, 111},
         {44, 108}
      };
   }
}
