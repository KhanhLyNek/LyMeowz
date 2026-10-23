package main;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class IOlO {
   public static int l10_;
   public static int l10O;
   public static int l100;
   public static int l10o;
   public static int l1o;
   private static int I1O_ = -1;
   public static int[] IIO;
   public static int[] I1ol;
   private static Image[] IIll;
   private static Image I1Io;
   private static Image I1l;
   public static Image IIO_;
   private static Image IIlo;
   private static Image II1;
   public static byte IlI0 = 24;
   private static int IIl_;
   private static int I10l;
   private static int I101;
   private static int IIOO;
   public static boolean I00l = false;
   public static String Il_O = "";
   public static int l1oI;
   public static int IIOo = -1;
   public static int l1ol;
   public static int l1o1;
   public static int l1o_;
   public static int l1oO = -1;
   public static byte IlIo;
   public static byte Ill = -1;
   public static I_lO IlI_ = new I_lO(I1I_("\ua7deꞀꞩ", 42920));
   public static I_lO II1l = new I_lO(I1I_("\ua7deꞎꞒꡠꡉꠁꠅ", 42920));
   public static I_lO IlIO = new I_lO(I1I_("\ua7deꞄꞓ꡷ꡖꠊꠖ꣤\ua8cd", 42920));
   public static String[] II11;
   public static Image IIlI = IO10.IIII(I1I_("ꞇꞪꞇꡬꡊꠊꠏ꣠\ua8c7\ua8da꣱ꢐꥥꥯꤿ꤁ꧬ꧂ꦤꦐꨦ꩗ꨰꨞ\uaafe\uaac8ꫠꪝꭢꭌ", 42920));
   private static int[] Il_1 = new int[]{21, 22, 23, 39, 40, 41};
   public static int[][] II1;
   public static int[][][] III;
   public static Image IIl_ = IO10.IIII(I1I_("ꞇꞥꞁ꠪ꡈ꠪ꠅ꣩꣔ꢑꢮꢓꥻ", 42920));
   public static int I1_O;
   public static int I1_0;
   public static int I1_o;
   public static int I1O;
   public static int I1OI;
   public static int I1Ol;
   public static int I1O1 = 0;

   public static boolean Ill() {
      return l1oI == 51 || l1oI == 103 || l1oI == 112 || l1oI == 113 || l1oI == 129 || l1oI == 130;
   }

   public static boolean II() {
      return l1oI == 39 || l1oI == 40 || l1oI == 41;
   }

   public static boolean III() {
      return I1_I.II != null && l1oI == I1_I.II.II_I;
   }

   public static Il0o II(int var0) {
      for (int var1 = 0; var1 < II1l.size(); var1++) {
         Il0o var2;
         if ((var2 = (Il0o)II1l.elementAt(var1)).II0I == var0) {
            return var2;
         }
      }

      return null;
   }

   public static boolean IllI() {
      for (int var0 = 0; var0 < Il_1.length; var0++) {
         if (l1oI == Il_1[var0]) {
            return true;
         }
      }

      return false;
   }

   public static boolean II1I(int var0) {
      if (var0 != 156 && var0 != 330 && var0 != 345 && var0 != 334) {
         if (l1oI != 54 && l1oI != 55 && l1oI != 56 && l1oI != 57 && l1oI != 58 && l1oI != 59 && l1oI != 103) {
            int var1 = 0;

            for (int var2 = 0; var2 < IlIO.size(); var2++) {
               if (((Il0o)IlIO.elementAt(var2)).II0I == var0) {
                  var1++;
               }
            }

            return var1 > 2;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static void IO11() {
      if (I1Io == null) {
         I1Io = IO10.III(I1I_("ꞇꞳꞱꡤꡐꠦꠐꢮ꣗\ua8cbꢸ꣓ꥬ\ua955ꤽ", 42920));
      }

      if (I1l == null) {
         I1l = IO10.III(I1I_("ꞇꞳꞱꡤꡐꠦꠐꢮ꣔\ua8c8ꢪꢛꤲꥋꤴꤞ", 42920));
      }

      if (IIO_ == null) {
         IIO_ = IO10.III(I1I_("ꞇꞳꞱꡤꡐꠦꠐꢮ꣗\ua8cbꢭ꣓ꥬ\ua955ꤽ", 42920));
      }

      if (IIlo == null) {
         IIlo = IO10.III(I1I_("ꞇꞳꞱꡤꡐꠦꠐꢮ꣗\ua8cbꢭꢳꤲꥋꤴꤞ", 42920));
      }

      if (II1 == null) {
         II1 = IO10.III(I1I_("ꞇꞳꞱꡤꡐꠦꠐꢮ꣗\ua8cbꢭꢳ꤮ꤕꤪꤗ\ua9ff", 42920));
      }

      System.gc();
   }

   public static void IIII(int var0) {
      l10o = l10O * IlI0;
      l100 = l10_ * IlI0;
      var0--;

      try {
         for (int var1 = 0; var1 < l10_ * l10O; var1++) {
            for (int var2 = 0; var2 < II1[var0].length; var2++) {
               int[] var3 = III[var0][var2];
               int var4 = II1[var0][var2];
               int[] var5 = var3;
               int var6 = var1;

               for (int var7 = 0; var7 < var5.length; var7++) {
                  if (IIO[var6] == var5[var7]) {
                     int[] var8 = I1ol;
                     var8[var6] |= var4;
                     break;
                  }
               }
            }
         }
      } catch (Exception var9) {
         System.out.println(I1I_("\ua7edꞵꞔꡪꡖꡣ\ua82e꣮ꣁ\ua8dbꣾꢰ\ua97dꥋ", 42920));
         var9.printStackTrace();
         GameMidlet.II.IIll();
      }
   }

   public static boolean Illl() {
      return l1oI == 45 || l1oI == 46 || l1oI == 48;
   }

   public static boolean Ill1() {
      return I00l
         || l1oI == 45
         || l1oI == 46
         || l1oI == 48
         || l1oI == 51
         || l1oI == 52
         || l1oI == 103
         || l1oI == 112
         || l1oI == 113
         || l1oI == 115
         || l1oI == 117
         || l1oI == 118
         || l1oI == 119
         || l1oI == 120
         || l1oI == 121
         || l1oI == 125
         || l1oI == 129
         || l1oI == 130;
   }

   public static void IIIl(IO1l var0, int var1, int var2, int var3) {
      try {
         if (IIll == null) {
            return;
         }

         if (IIll.length != 1) {
            var0.II(IIll[var1], var2 * IlI0, var3 * IlI0, 0);
            return;
         }

         var0.II(IIll[0], 0, var1 * IlI0, IlI0, IlI0, 0, var2 * IlI0, var3 * IlI0, 0);
      } catch (Exception var5) {
      }
   }

   private static void II(IO1l var0, int var1, int var2, int var3, int var4) {
      try {
         if (IIll != null) {
            if (IIll.length == 1) {
               var0.II(IIll[0], 0, var1 * 24, 24, 24, 0, var2, var3, 0);
            } else {
               var0.II(IIll[var1], var2, var3, 0);
            }
         }
      } catch (Exception var6) {
      }
   }

   public static void IIo(IO1l var0) {
      try {
         if (Ilol.I10I) {
            return;
         }

         I1_I.II();
         I1_I.III(var0, 1);

         for (int var1 = I1_I.Io_l; var1 < I1_I.Io__; var1++) {
            for (int var2 = I1_I.Io_1; var2 < I1_I.Io_O; var2++) {
               if (var1 != 0 && var1 != l10_ - 1) {
                  int var3 = IIO[var2 * l10_ + var1] - 1;
                  if ((IIIo(var1, var2) & 256) != 256) {
                     if ((IIIo(var1, var2) & 32) == 32) {
                        var0.II(I1Io, 0, 24 * (II.IIIO % 8 >> 1), 24, 24, 0, var1 * IlI0, var2 * IlI0, 0);
                     } else if ((IIIo(var1, var2) & 128) == 128) {
                        var0.II(I1l, 0, 24 * (II.IIIO % 8 >> 1), 24, 24, 0, var1 * IlI0, var2 * IlI0, 0);
                     } else if (l1o != 13 || var3 == -1) {
                        if (l1o == 2 && (IIIo(var1, var2) & 512) == 512 && var3 != -1) {
                           II(var0, var3, var1 * IlI0, var2 * IlI0, 24);
                           II(var0, var3, var1 * IlI0, var2 * IlI0 + 1, 24);
                        }

                        if ((IIIo(var1, var2) & 16) == 16) {
                           I10l = (IIl_ = var1 * IlI0 - I1_I.Io1) - I1_I.IIOI;
                           I101 = (IIOO = (IlI0 - 2) * I10l / IlI0) + I1_I.IIOI;
                           II(var0, var3, I101 + I1_I.Io1, var2 * IlI0, 24);
                        } else if ((IIIo(var1, var2) & 512) == 512) {
                           if (var3 != -1) {
                              II(var0, var3, var1 * IlI0, var2 * IlI0, 24);
                              II(var0, var3, var1 * IlI0, var2 * IlI0 + 1, 24);
                           }
                        } else if (var3 != -1) {
                           IIIl(var0, var3, var1, var2);
                        }
                     }
                  }
               }
            }
         }

         if (I1_I.Io1 < 24) {
            for (int var5 = I1_I.Io_1; var5 < I1_I.Io_O; var5++) {
               int var7;
               if ((var7 = IIO[var5 * l10_ + 1] - 1) != -1) {
                  IIIl(var0, var7, 0, var5);
               }
            }
         }

         if (I1_I.Io1 > I1_I.Io_) {
            int var6 = l10_ - 2;

            for (int var8 = I1_I.Io_1; var8 < I1_I.Io_O; var8++) {
               int var9;
               if ((var9 = IIO[var8 * l10_ + var6] - 1) != -1) {
                  IIIl(var0, var9, var6 + 1, var8);
               }
            }

            return;
         }
      } catch (Exception var4) {
      }
   }

   private static boolean IIO() {
      return l1oI != 54 && l1oI != 55 && l1oI != 56 && l1oI != 57 && l1oI != 138 && l1oI != 167;
   }

   public static void IIIo(IO1l var0) {
      if (!II.II) {
         try {
            for (int var1 = I1_I.Io_l; var1 < I1_I.Io__; var1++) {
               for (int var2 = I1_I.Io_1; var2 < I1_I.Io_O; var2++) {
                  if ((IIIo(var1, var2) & 64) == 64) {
                     Image var3;
                     if (l1o == 5) {
                        var3 = IIlo;
                     } else if (l1o == 8) {
                        var3 = II1;
                     } else {
                        var3 = IIO_;
                     }

                     if (!IIO()) {
                        var0.II(var3, 0, 0, 24, 24, 0, var1 * IlI0, var2 * IlI0 - 1, 0);
                        var0.II(var3, 0, 0, 24, 24, 0, var1 * IlI0, var2 * IlI0 - 3, 0);
                     }

                     var0.II(var3, 0, (II.IIIO % 8 >> 2) * 24, 24, 24, 0, var1 * IlI0, var2 * IlI0 - 12, 0);
                     if (I1O1 == 0 && IIO()) {
                        I1O1 = var2 * IlI0 - 12;
                        int var4 = 16777215;
                        if (II.II1O == 2) {
                           var4 = 10871287;
                        } else if (II.II1O == 4) {
                           var4 = 8111470;
                        } else if (II.II1O == 7) {
                           var4 = 5693125;
                        } else if (II.II1O == 19) {
                           var4 = 16711680;
                        }

                        Il0O.III0(var4, I1O1 + 15);
                     }
                  }
               }
            }

            Il0O.IIIl(var0);
         } catch (Exception var5) {
         }
      }
   }

   public static void IllI(int var0) throws IOException {
      InputStream var1 = I11O.II(I1I_("ꞇꞪꞟꡨꡅ꠳ꡍ", 42920) + var0);
      DataInputStream var2;
      l10_ = (char)(var2 = new DataInputStream(var1)).read();
      l10O = (char)var2.read();
      IIO = new int[var2.available()];

      for (int var3 = 0; var3 < l10_ * l10O; var3++) {
         IIO[var3] = (char)var2.read();
      }

      I1ol = new int[IIO.length];
   }

   public static final int IIIo(int var0, int var1) {
      try {
         return I1ol[var1 * l10_ + var0];
      } catch (Exception var3) {
         return 1000;
      }
   }

   public static final int IIl(int var0, int var1) {
      try {
         return I1ol[var1 / IlI0 * l10_ + var0 / IlI0];
      } catch (Exception var3) {
         return 1000;
      }
   }

   public static final boolean IIIl(int var0, int var1, int var2) {
      try {
         return (I1ol[var1 / IlI0 * l10_ + var0 / IlI0] & var2) == var2;
      } catch (Exception var4) {
         return false;
      }
   }

   public static void III(int var0, int var1, int var2) {
      int[] var3 = I1ol;
      int var4 = var1 / IlI0 * l10_ + var0 / IlI0;
      var3[var4] |= 512;
   }

   public static void IIIl(int var0, int var1, int var2) {
      int[] var3 = I1ol;
      int var4 = var1 / IlI0 * l10_ + var0 / IlI0;
      var3[var4] &= -513;
   }

   public static final int II1I(int var0) {
      return var0 / IlI0 * IlI0;
   }

   public static final int II1l(int var0) {
      return var0 / IlI0 * IlI0;
   }

   public static void IO_() {
      System.gc();
      if (I1O_ != l1o) {
         if (IO10.l_lI != 5 && IO10.l_lI != 3 && IO10.l_lI != 8) {
            if (IO10.III(I1I_("ꞇꞳꟉ", 42920) + l1o + I1I_("ꞌꟶꟈ꡵ꡊꠤ", 42920)) != null) {
               I_O1.II_O(I1I_("Ꟑ", 42920) + IO1l.l_I0 + I1I_("\ua7dc", 42920) + l1o);
               IIll = new Image[100];

               for (int var2 = 0; var2 < IIll.length; var2++) {
                  IIll[var2] = IO10.III(I1I_("ꞇꞳꟉ", 42920) + l1o + I1I_("ꞌ", 42920) + (var2 + 1) + I1I_("Ꞇꞷꞈꡢ", 42920));
               }
            } else {
               Image var1;
               if ((var1 = IO10.III(I1I_("ꞇꞳꟉ", 42920) + l1o + I1I_("Ꞇꞷꞈꡢ", 42920))) != null) {
                  (IIll = new Image[1])[0] = var1;
               }
            }
         } else if (IO1l.l_I0 == 1) {
            (IIll = new Image[1])[0] = IO10.IIIl(I1I_("ꞇꞳꟉ", 42920) + l1o + I1I_("Ꞇꞷꞈꡢ", 42920));
         } else {
            IIll = new Image[100];

            for (int var0 = 0; var0 < IIll.length; var0++) {
               IIll[var0] = IO10.IIIl(I1I_("ꞇꞳꟉ", 42920) + l1o + I1I_("ꞇ", 42920) + (var0 + 1) + I1I_("Ꞇꞷꞈꡢ", 42920));
            }
         }

         I1O_ = l1o;
      }
   }

   public static IO1 IIIl() {
      for (int var0 = 0; var0 < IlI_.size(); var0++) {
         int var1 = Ilol.II().I_o_;
         int var2 = Ilol.II().I_oO;
         IO1 var3 = (IO1)IlI_.elementAt(var0);
         if (var1 >= var3.II0o && var1 <= var3.IIoI && var2 >= var3.IIo && var2 <= var3.IIol) {
            return var3;
         }
      }

      return null;
   }

   public static int IIO() {
      return l100;
   }

   public static int IIOI() {
      return l10o;
   }

   static {
      new I_lO(I1I_("\ua7deꞈꞄꡯꡁꠠꠖ", 42920));
      int[] var10000 = new int[]{21, 22, 23, 24, 25, 26};
      var10000 = new int[]{0, 7, 14};
      var10000 = new int[]{5257738, 8807192};
   }
}
