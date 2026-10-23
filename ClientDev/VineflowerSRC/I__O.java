package main;

import javax.microedition.lcdui.Image;

public final class I__O {
   public static I_lO IlI = new I_lO(IlO0("촯촨췸췆춠춄칠", 52569));
   public int l111 = 100;
   private int l11_;
   public String[] II_O;
   public int I_o_;
   public int I_oO;
   public int IO1l;
   public int IO11;
   public boolean I0_ = false;
   private int IIOo = 0;
   private int II0;
   public I1Il II_I;
   public boolean I0_I = true;
   public boolean I1lI = false;
   private static Image IlO;
   private static Image Iloo;
   private static Image IlO0;
   private static Image IlOo;

   public static void IIl1() {
      if (IlO == null) {
         IlO = IO10.IIII(IlO0("쵶촕췶췟춻춽칾칓츶츕캠컃캴캸콮콒켽켝쿵쿃쿷쾀큡큆큲큎퀏탰탚", 52569));
      }

      if (IlO0 == null) {
         IlO0 = IO10.IIII(IlO0("쵶촕췶췟춻춽칾칓츶츕캠컃캴캸콮콒켽켝쿵쿃쿷쾀큪큏퀦퀰퀐탮탈킬탕텪텗턿", 52569));
      }

      if (IlOo == null) {
         IlOo = IO10.IIII(IlO0("쵶촕췶췟춻춽칾칓츶츕캠컃캴캸콮콒켽켝쿵쿃쿷쾀큪큏퀦퀰퀐탮탈킬탉턴텉턶턐", 52569));
      }

      if (Iloo == null && IO10.l_lI == 1) {
         Iloo = IO10.IIII(IlO0("쵶촕췶췟춻춽칾칓츶츕캠컞캢캞콿콋켥콆쿷쿈쾢", 52569));
      }
   }

   public I__O(String var1, int var2, int var3) {
      if (var1.length() < 10) {
         this.l111 = 60;
      }

      if (II.IIl == 128) {
         this.l111 = 128;
      }

      this.II_O = IO1I.III_.II(var1, this.l111 - 10);
      this.l11_ = 7;
      this.I_o_ = var2 - this.l111 / 2 - 1;
      this.I_oO = var3 - 15 + this.l11_ - this.II_O.length * 12 - 10;
      this.IO1l = this.l111 + 2;
      this.IO11 = (this.II_O.length + 1) * 12 + 1;

      while (this.IO1l % 10 != 0) {
         this.IO1l++;
      }

      while (this.IO11 % 10 != 0) {
         this.IO11++;
      }

      if (var2 >= 0 && var2 <= 24) {
         this.I_o_ = this.I_o_ + this.IO1l / 2 + 30;
      }

      if (var2 <= IOlO.l10_ * 24 && var2 >= IOlO.l10_ * 24 - 24) {
         this.I_o_ = this.I_o_ - (this.IO1l / 2 + 6);
      }

      while (this.I_o_ <= 30) {
         this.I_o_ += 2;
      }

      while (this.I_o_ + this.IO1l >= IOlO.l10_ * 24 - 30) {
         this.I_o_ -= 2;
      }
   }

   public void II(String[] var1, int var2, int var3) {
      this.l111 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (this.l111 < IO1I.III_.IIII(var1[var4])) {
            this.l111 = IO1I.III_.IIII(var1[var4]);
         }
      }

      this.l111 += 20;
      this.II_O = var1;
      this.l11_ = 7;
      this.I_o_ = var2 - this.l111 / 2 - 1;
      this.I_oO = var3 - 15 + this.l11_ - this.II_O.length * 12 - 10;
      this.IO1l = this.l111 + 2;
      this.IO11 = (this.II_O.length + 1) * 12 + 1;

      while (this.IO1l % 10 != 0) {
         this.IO1l++;
      }

      while (this.IO11 % 10 != 0) {
         this.IO11++;
      }

      if (var2 >= 0 && var2 <= 24) {
         this.I_o_ = this.I_o_ + this.IO1l / 2 + 30;
      }

      if (var2 <= IOlO.l10_ * 24 && var2 >= IOlO.l10_ * 24 - 24) {
         this.I_o_ = this.I_o_ - (this.IO1l / 2 + 6);
      }

      while (this.I_o_ <= 30) {
         this.I_o_ += 2;
      }

      while (this.I_o_ + this.IO1l >= IOlO.l10_ * 24 - 30) {
         this.I_o_ -= 2;
      }
   }

   public static void II(I__O var0) {
      IlI.addElement(var0);
   }

   public static void II(IO1l var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (!var6) {
         var0.Illl(0);
         var0.III_(var1 + 6, var2, var3 - 14 + 1, var4);
         var0.III_(var1, var2 + 6, var3, var4 - 12 + 1);
         var0.Illl(var5);
         var0.III_(var1 + 6, var2 + 1, var3 - 12, var4 - 2);
         var0.III_(var1 + 1, var2 + 6, var3 - 2, var4 - 12);
         var0.II(IlO, 0, 0, 7, 6, 0, var1, var2, 0);
         var0.II(IlO, 0, 0, 7, 6, 2, var1 + var3 - 7, var2, 0);
         var0.II(IlO, 0, 0, 7, 6, 6, var1, var2 + var4 - 7, 0);
         var0.II(IlO, 0, 0, 7, 6, 3, var1 + var3 - 7, var2 + var4 - 6, 0);
      } else {
         Image var7 = var5 == 1 ? IlOo : IlO0;
         var0.II(var7, 0, 0, 10, 10, 0, var1, var2, 0);
         var0.II(var7, 0, 20, 10, 10, 0, var1 + var3 - 10, var2, 0);
         var0.II(var7, 0, 50, 10, 10, 0, var1, var2 + var4 - 10, 0);
         var0.II(var7, 0, 70, 10, 10, 0, var1 + var3 - 10, var2 + var4 - 10, 0);
         int var8 = (var3 - 20) % 10 == 0 ? (var3 - 20) / 10 : (var3 - 20) / 10 + 1;
         int var9 = (var4 - 20) % 10 == 0 ? (var4 - 20) / 10 : (var4 - 20) / 10 + 1;

         for (int var10 = 0; var10 < var8; var10++) {
            var0.II(var7, 0, 10, 10, 10, 0, var1 + 10 + var10 * 10, var2, 0);
         }

         for (int var11 = 0; var11 < var9; var11++) {
            var0.II(var7, 0, 30, 10, 10, 0, var1, var2 + 10 + var11 * 10, 0);
         }

         for (int var12 = 0; var12 < var8; var12++) {
            var0.II(var7, 0, 60, 10, 10, 0, var1 + 10 + var12 * 10, var2 + var4 - 10, 0);
         }

         for (int var13 = 0; var13 < var9; var13++) {
            var0.II(var7, 0, 40, 10, 10, 0, var1 + var3 - 10, var2 + 10 + var13 * 10, 0);
         }

         var0.Illl(var5 == 1 ? 12052656 : 16770503);
         var0.III_(var1 + 10, var2 + 10, var3 - 20, var4 - 20);
      }
   }

   public void IIO(int var1) {
      this.II0 = 10;
   }

   public static void II(IO1l var0) {
      for (int var1 = 0; var1 < IlI.size(); var1++) {
         I__O var2 = (I__O)IlI.elementAt(var1);
         IO1l var3 = var0;
         I__O var4 = var2;
         if (var2.I0_I && var2.II_O != null && Ilo1.III == null && !var2.I1lI) {
            if (IO10.l_lI == 1) {
               int var5 = var2.I_o_;
               int var6 = var2.I_oO - II.II10;
               var0.IIIO(var5, var6, var2.IO1l, var2.IO11);
               var0.II(Iloo, var5, var6, 0);
               if (var2.IO1l > 70) {
                  var0.II(Iloo, var5 + 70, var6, 0);
               }

               if (var2.IO11 > 30) {
                  var0.II(Iloo, var5, var6 + 30, 0);
                  if (var2.IO1l > 70) {
                     var0.II(Iloo, var5 + 70, var6 + 30, 0);
                  }
               }

               var0.IIIO(I1_I.Io1, I1_I.Io1I, II.IIl, II.IIlI);
            } else {
               int var7 = var2.I_oO - II.II10;
               boolean var8 = var2.II0 != 0;
               int var9 = var2.IO11;
               int var10 = var2.IO1l;
               int var12 = var2.I_o_;
               if (var8) {
                  var0.III(var12, var7, var10, var9, 16777215);
               } else {
                  var0.III(var12, var7, var10, var9, 0);
               }
            }

            for (int var11 = 0; var11 < var4.II_O.length; var11++) {
               (var4.II0 == 0 ? IO1I.IIII : IO1I.IIIO)
                  .II(var3, var4.II_O[var11], var4.I_o_ + var4.IO1l / 2, var4.I_oO + (var4.IO11 / 2 - var4.II_O.length * 12 / 2) + var11 * 12 - II.II10, 2);
            }
         }
      }
   }

   public static void IOlI() {
      for (int var0 = 0; var0 < IlI.size(); var0++) {
         I__O var1 = (I__O)IlI.elementAt(var0);
         if (Ilol.II().II != null && Ilol.II().II.II01 == 0) {
            if (var1.I_o_ + var1.IO1l >= I1_I.Io1 && var1.I_o_ <= II.IIl + I1_I.Io1 && var1.I_oO + var1.IO11 >= I1_I.Io1I && var1.I_oO <= II.IIlI + I1_I.Io1I) {
               var1.I1lI = false;
            } else {
               var1.I1lI = true;
            }
         }

         if (Ilol.II().II == null || Ilol.II().II != null && Ilol.II().II.II01 != 0) {
            if (var1.I_o_ + var1.IO1l / 2 >= Ilol.II().I_o_ - 100
               && var1.I_o_ + var1.IO1l / 2 <= Ilol.II().I_o_ + 100
               && var1.I_oO + var1.IO11 >= I1_I.Io1I
               && var1.I_oO <= II.IIlI + I1_I.Io1I) {
               var1.I1lI = false;
            } else {
               var1.I1lI = true;
            }
         }

         if (var1.II0 > 0) {
            var1.II0--;
            if (var1.II0 == 0 && var1.II_I != null) {
               var1.II_I.I0lO();
            }
         }

         if (var1.I0_) {
            if (Ilol.II().II != null) {
               if (Ilol.II().II.II01 == 0) {
                  if (Ilol.II().II.l10l == 0) {
                     var1.I0_I = false;
                  }

                  if (Ilol.II().II.l10l == 1) {
                     var1.I0_I = true;
                  }

                  if (Ilol.II().II.l10l > 1 && Ilol.II().II.l10l < 6) {
                     var1.I0_I = false;
                  }
               } else if (!var1.I0_I) {
                  var1.IIOo++;
                  if (var1.IIOo == 50) {
                     var1.I0_I = true;
                  }
               }
            } else if (!var1.I0_I) {
               I1_l.I1_l = false;
               var1.IIOo++;
               if (var1.IIOo == 50) {
                  var1.I0_I = true;
                  I1_l.I1_l = true;
               }
            }
         }
      }
   }
}
