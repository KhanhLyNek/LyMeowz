package main;

import javax.microedition.lcdui.Image;

public final class I1O_ implements I1_1 {
   public I_lO IIOO = new I_lO(IllO("\udde3\uddc7\uddae\udd88\ude51\ude44\ude2d\ude17\uded6\udece\ude93\udeb7\ude91\udf6a", 56714));
   public I1O0 II;
   public int I_Oo = 100;
   private int IoII;
   public String[] IIIO;
   private int IIO0;
   private int IIOo;
   private boolean IIl = false;
   private static Image IlO = IO10.IIII(
      IllO(
         "\udda5\uddc4\udda9\udd8e\ude68\ude6c\ude29\ude02\udee5\udec4\udeef\udeb2\ude87\udf49\udf59\udf23\udf0e\udfec\udfca\udfb2\udfc4\ue071\ue053\ue03c\ue011\ue0ff\ue0d8\ue0a0\ue080\ue123\ue15c\ue125\ue10d",
         56714
      )
   );
   public int IIO;
   public int IIOI;
   private int III;
   public int IIOl;
   public int IIlI;
   public int IIO1;
   public int IIO_;

   public void IIl1() {
      this.IIIO = null;
      this.IIOO.removeAllElements();
   }

   public void III(IO1l var1, int var2, int var3, int var4) {
      if (this.IIOO.size() != 0) {
         var1.IIl0(var2, var3);
         if (this.IIIO != null && this.IIIO.length != 0 && this.III != 1) {
            int var5 = IO1l.l_I0 == 1 ? 0 : 10;
            if (this.II.IIll == null) {
               I__O.II(var1, this.IIOl, this.IIlI, this.IIO1, this.IIO_, 16777215, false);
            } else {
               IO10.III(var1, this.IIOl - 23, this.IIlI - var5 / 2, this.IIO1 + 15);
            }

            if (this.II.IIll == null) {
               var1.II(IlO, 0, 0, 9, 8, var4 == 1 ? 0 : 2, this.IIO0 - 3 + (var4 == 1 ? -15 : 20), this.IIOo - 20 + this.IoII + 2, 17);
            }

            var4 = -1;

            for (int var6 = 0; var6 < this.IIIO.length; var6++) {
               IO1I var7 = IO1I.IIlI;
               String var8 = this.IIIO[var6];
               int var9;
               if (this.IIIO[var6].startsWith(IllO("\uddf6", 56714))) {
                  String[] var10;
                  if ((var10 = I_Ol.II(this.IIIO[var6], IllO("\uddf6", 56714), 0)).length == 3) {
                     var8 = var10[2];
                  }

                  if (var10.length == 4) {
                     var8 = var10[3];
                     Integer.parseInt(var10[2]);
                  }

                  var4 = var9 = Integer.parseInt(var10[1]);
               } else {
                  var9 = var4;
               }

               switch (var9) {
                  case -1:
                     var7 = IO1I.IIlI;
                     break;
                  case 0:
                     var7 = IO1I.III_;
                     break;
                  case 1:
                     var7 = IO1I.III0;
                     break;
                  case 2:
                     var7 = IO1I.III;
                     break;
                  case 3:
                     var7 = IO1I.IIl0;
                     break;
                  case 4:
                     var7 = IO1I.II1;
                     break;
                  case 5:
                     var7 = IO1I.IIlo;
                  case 6:
                  default:
                     break;
                  case 7:
                     var7 = IO1I.II;
               }

               if (this.II.IIll == null) {
                  var7.II(var1, var8, this.IIO0, this.IIOo - 15 + this.IoII + var6 * 12 - this.IIIO.length * 12 - 9, 2);
               } else {
                  var9 = this.IIOl - 23;
                  int var17 = this.IIlI - var5 / 2;
                  int var11 = IO10.l_lI == 1 ? this.IIO1 + 28 : this.IIO1 + 25;
                  int var12 = this.IIO_ + (II.IIIl ? 0 : 14) + var5;
                  var1.Illl(4465169);
                  var1.III_(var9, var17 + var12, var11, 2);
                  if ((var11 = this.II.IIOI * var11 / this.II.IIOl) < 0) {
                     var11 = 0;
                  }

                  var1.Illl(43758);
                  var1.III_(var9, var17 + var12, var11, 2);
                  if (this.II.IIOI == 0) {
                     return;
                  }

                  this.II.IIll.III(var1, this.IIOl + 5, this.IIlI + this.IIO_ / 2, 0);
                  if (IO1l.l_I0 == 1) {
                     (this.II.II_ ? IO1I.IIOl : IO1I.IIOO).II(var1, this.II.IIll.IIO1, this.IIOl + 12, this.IIlI + 3, 0);
                  } else {
                     (this.II.II_ ? IO1I.IIOl : IO1I.IIOO).II(var1, this.II.IIll.IIO1, this.IIOl + 12, this.IIlI - 3, 0);
                  }

                  if (!II.IIIl) {
                     if (!IOI0.III_) {
                        IO1I.IIO1
                           .II(
                              var1,
                              IllO("\uddc4\uddc1썭\udd89\ude26\ude06\ude64\udf72쁁\ude81\udea3\udeb7\ude9f\udf69", 56714),
                              this.IIOl + this.IIO1 / 2 + 10,
                              this.IIlI + this.IIO_,
                              2
                           );
                     } else {
                        IO1I.IIO1
                           .II(
                              var1,
                              IllO("\uddc4\uddc1썭\udd89\ude26\ude7c\ude64\udf72쁁\ude81\udea3\udeb7\ude9f\udf69", 56714),
                              this.IIOl + this.IIO1 / 2 + 10,
                              this.IIlI + this.IIO_,
                              2
                           );
                     }
                  }

                  if (IO1l.l_I0 == 1) {
                     IOl_.II(var1, var8, this.IIOl + 14, this.IIlI + this.IIO_ / 2 + 2, this.IIO1 - 16, this.IIO_, IO1I.IIO_);
                  } else {
                     String[] var13 = IO1I.IIO_.II(var8, 120);

                     for (int var14 = 0; var14 < var13.length; var14++) {
                        IO1I.IIO_.II(var1, var13[var14], this.IIOl + 12, this.IIlI + 12 + var14 * 12 - 3, 0);
                     }

                     II.II(var1);
                  }
               }
            }
         }

         var1.IIl0(-var2, -var3);
      }
   }

   public void IOlI() {
      if (this.IIOO.size() != 0 && this.II.IIOI == 0) {
         this.IIO++;
         if (this.IIO >= this.II.I_O0) {
            this.IIO = 0;
            this.IIOO.removeElementAt(0);
            if (this.IIOO.size() == 0) {
               return;
            }

            I1O0 var1 = (I1O0)this.IIOO.firstElement();
            this.II = var1;
            this.III();
         }
      }
   }

   public void III() {
      this.I_Oo = 100;
      if (II.IIl == 128) {
         this.I_Oo = 128;
      }

      int var1;
      if (this.II.IIll != null) {
         this.IIIO = new String[]{this.II.IIoo};
         if (IO1l.l_I0 == 1) {
            var1 = this.IIIO.length;
         } else {
            var1 = IO1I.IIO_.II(this.II.IIoo, 120).length;
         }
      } else {
         this.IIIO = IO1I.IIlI.II(this.II.IIoo, this.I_Oo - 10);
         var1 = this.IIIO.length;
      }

      this.IoII = 7;
      this.IIOl = this.IIO0 - this.I_Oo / 2 - 1;
      this.IIlI = this.IIOo - 15 + this.IoII - var1 * 12 - 15;
      this.IIO1 = this.I_Oo + 2 + (this.II.IIll != null ? 30 : 0);
      this.IIO_ = (var1 + 1) * 12 + 1 + (this.II.IIll != null ? 5 : 0);
   }

   public void II(String var1, int var2, Ilol var3, boolean var4) {
      this.III = var2;
      if (this.IIOO.size() > 10) {
         this.IIOO.removeElementAt(0);
      }

      if (this.IIOO.size() > 0) {
         var1.equals(((I1O0)this.IIOO.lastElement()).IIoo);
      }

      I1O0 var5 = new I1O0(var1);
      if (this.III == 0) {
         var5.I_O0 = var1.length();
      }

      if (var5.I_O0 < 70) {
         var5.I_O0 = 70;
      }

      if (this.III == 1) {
         var5.I_O0 = 10000000;
      }

      if (this.III == 3) {
         var5.I_O0 = 300;
         var5.Ilo_ = IO10.IIII();
         var5.IIOI = var1.length();
         if (var5.IIOI < 15) {
            var5.IIOI = 15;
         }

         if (var5.IIOI > 100) {
            var5.IIOI = 100;
         }

         var5.IIOl = var5.IIOI;
      }

      if (var3 != null) {
         var5.IIll = var3;
         var5.II_ = var4;
         II.II.II(var5);
         if (II.IIIl && II.II.I01_) {
            I1_I.III.IIl_ = new I1Il(IO11.I_Io, this, 1000, var5);
         }
      }

      if (var3 != null && II.II.I01_ || var3 == null) {
         this.IIOO.addElement(var5);
      }

      if (this.IIOO.size() == 1) {
         this.II = (I1O0)this.IIOO.firstElement();
         this.III();
      }

      if (II.IIIl && var3 != null && II.II.I01_ && II.IIl - 50 > 155 + this.IIO1) {
         I1_I.III.IIl_.I1 = II.IIl - this.IIO1 - 50;
         I1_I.III.IIl_.I1I = 35;
      }
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 1000) {
         Ilo_ var3 = Ilo_.II();
         I1_I.II();
         var3.II1o(IO11.IO1_);
      }
   }
}
