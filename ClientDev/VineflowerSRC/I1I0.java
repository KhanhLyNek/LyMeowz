package main;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class I1I0 extends IO1_ implements I1_1 {
   public static I1I0 II;
   public static boolean I1l1 = false;
   private static IOI0 III;
   private static int IolI;
   private static int IIO;
   private static int IIOI;
   private static int[][] IIII = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
   private static int[] II00 = new int[]{2, 13, 8};
   private static int[] II0o = new int[]{1, 12, 7};
   private int[] IIo = new int[]{0, 4, 8};
   private int IoII = 168;
   private int IIO0 = 350;
   private int IIOo = 45;
   private int II0;
   private int II;

   public static I1I0 II() {
      if (II == null) {
         II = new I1I0();
      }

      return II;
   }

   private static void II(byte[] var0) throws IOException {
      for (int var1 = 0; var1 < var0.length; var1++) {
         InputStream var2 = I11O.II(IlIl("牬爏狸狍狞犮狒", 29251) + var0[var1]);
         DataInputStream var3 = new DataInputStream(var2);
         I_.I1ll[var1] = (char)var3.read();
         I_.I1l1[var1] = (char)var3.read();
         I_.IIIO[var1] = new int[var3.available()];

         for (int var4 = 0; var4 < I_.I1ll[var1] * I_.I1l1[var1]; var4++) {
            I_.IIIO[var1][var4] = var3.read();
         }

         I_.III0[var1] = new int[I_.IIIO[var1].length];
      }
   }

   @Override
   public void I0l_() {
      I1o_.IO0_ = false;
      II.II.IOol = false;
      II.III_();
      super.I0l_();
      IolI = I_Ol.III_(0, 3);
      IIO = I_Ol.III_(0, 3);
      this.I0l0();
      Ilol.I10I = false;
      if (III != null) {
         III.II1o = IO11.I1_0;
      }

      I_0l.IoII = 0;
   }

   private void I0l0() {
      IOlO.IIO = new int[I_.IIIO[IolI].length];

      for (int var1 = 0; var1 < I_.IIIO[IolI].length; var1++) {
         IOlO.IIO[var1] = I_.IIIO[IolI][var1];
      }

      IOlO.I1ol = I_.III0[IolI];
      IOlO.l10o = I_.Ill0[IolI];
      IOlO.l100 = I_.IlO[IolI];
      IOlO.l1o = I_.IlO[IolI];
      IOlO.l10_ = I_.I1ll[IolI];
      IOlO.l10O = I_.I1l1[IolI];
      IOlO.l1o = this.IIo[IolI] + 1;
      IOlO.IO_();
      II.III(this.IIo[IolI]);
      I1_I.IIlI(this.IoII, this.IIO0);
   }

   public I1I0() {
      try {
         if (!II.II) {
            byte[] var1 = new byte[]{39, 40, 41};
            if (!II.II) {
               try {
                  for (int var2 = 0; var2 < var1.length; var2++) {
                     InputStream var3 = I11O.II(IlIl("牬爏狸狍狞犮狒獱獚猪猭珹珕玺玐", 29251) + var1[var2]);
                     DataInputStream var4;
                     short var5 = (var4 = new DataInputStream(var3)).readShort();
                     I_.II[var2] = new I_lO(IlIl("爎爃狱狴狚犳犍獰獚献猜玶珁玕玀瑦瑁琛琅瓵瓂璕璌畑甋", 29251));

                     for (int var6 = 0; var6 < var5; var6++) {
                        short var7 = var4.readShort();
                        short var8 = var4.readShort();
                        short var9 = var4.readShort();
                        if (IOlO.II(var7) != null) {
                           Il0o var10 = IOlO.II(var7);
                           Il0o var11;
                           (var11 = new Il0o()).II0I = var7;
                           var11.IIII = var10.IIII;
                           var11.IIOI = var10.IIOI;
                           var11.IIOl = var10.IIOl;
                           var11.I_0 = var8 * IOlO.IlI0;
                           var11.IIO = var9 * IOlO.IlI0;
                           var11.III = var10.III;
                           I_.II[var2].addElement(var11);
                           if (!Il0o.III.containsKey(String.valueOf(var11.IIII))) {
                              try {
                                 Image var17 = IO10.IIII(IlIl("牬爏狠狐狽犿犞獷獼猨猖班珙玲珚", 29251) + var11.IIII + IlIl("牭爒狯狇", 29251));
                                 Il0o.III.put(String.valueOf(var11.IIII), var17);
                              } catch (Exception var14) {
                                 Image var12;
                                 if ((var12 = IO10.IIIl(IlIl("牬爏狠狐狽犿犞獷獼猨猖班珙玲珚", 29251) + var11.IIII + IlIl("牭爒狯狇", 29251))) == null) {
                                    var12 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                    I_0_.II().III1(var11.IIII);
                                 }

                                 Il0o.III.put(String.valueOf(var11.IIII), var12);
                              }

                              Il0o.IIIo.addElement(String.valueOf(var11.IIII));
                           }

                           if (!Il0o.IIIO(String.valueOf(var11.IIII))) {
                              Il0o.III0.addElement(String.valueOf(var11.IIII));
                           }
                        }
                     }
                  }
               } catch (Exception var15) {
                  var15.printStackTrace();
               }
            }
         }

         II(new byte[]{39, 40, 41});
      } catch (Exception var16) {
         var16.printStackTrace();
      }

      if (II.IIl <= 200) {
         I1_I.IIl_(128, 100);
         I1_I.lI1o = (II.IIl - 128) / 2;
         I1_I.lI10 = 10;
         this.IIO0 += 15;
         this.IIOo -= 15;
      }

      IolI = 1;
      (III = new IOI0()).l10 = II.II.IIIl.l10;
      if (II.IIl < 200) {
         III.l10 = 60;
      }

      III.l10I = 26;
      if (II.IIl < 200) {
         III.II0I = I1_I.lI1o + 45;
         III.I_O0 = I1_I.lI10 + 12;
      } else {
         III.II0I = II.IIl / 2 - III.l10 / 2;
         III.I_O0 = 35;
      }

      if (!II.IIIl) {
         III.Il_0 = true;
      }

      III.Ill(0);
      III.II1o = IO11.I1_0;
      if (III.IIl1().equals(IlIl("爃", 29251))) {
         III.IIOl(II.II.IIIl.IIl1().substring(0, II.II.IIIl.IIl1().indexOf(IlIl("爃", 29251))));
      }

      IolI = 1;
      IIO = 0;
      super.III0 = new I1Il(IO11.I_1, this, 8000, null);
      super.IIIo = new I1Il(IO11.I_1I, this, 8001, null);
      if (!II.IIIl) {
         super.IIl = III.IIII;
      }
   }

   @Override
   public void IIO1(int var1) {
      III.II1o(var1);
   }

   @Override
   public void IIlO() {
      this.II0++;
      if (this.II0 > 30) {
         this.II0 = 0;
      }

      if (this.II0 % 15 < 5) {
         this.II = 0;
      } else {
         this.II = 1;
      }

      III.IIlO();
      if (IIOI != 0) {
         III.Il_0 = false;
      }
   }

   @Override
   public void I_Il() {
      if (II.II[2] && --IIOI < 0) {
         IIOI = IO11.IIO0.length - 1;
      }

      if (II.II[8] && ++IIOI >= IO11.IIO0.length) {
         IIOI = 0;
      }

      if (IIOI == 0) {
         if (!II.IIIl) {
            super.IIl = III.IIII;
         }

         III.IIlO();
      }

      if (IIOI == 1) {
         if (II.II[4]) {
            if (--IolI < 0) {
               IolI = IO11.IIOo.length - 1;
            }

            this.I0l0();
         }

         if (II.II[6]) {
            if (++IolI > IO11.IIOo.length - 1) {
               IolI = 0;
            }

            this.I0l0();
         }

         super.IIl = null;
      }

      if (IIOI == 2) {
         if (II.II[4] && --IIO < 0) {
            IIO = IO11.II1[0].length - 1;
         }

         if (II.II[6] && ++IIO > IO11.II1[0].length - 1) {
            IIO = 0;
         }

         super.IIl = null;
      }

      if (II.IIIo) {
         byte var1 = 110;
         byte var2 = 60;
         if (II.IIl > II.IIlI) {
            var1 = 100;
            var2 = 40;
         }

         if (II.II(II.IIl / 2 - 117, 15, 234, 80)) {
            IIOI = 0;
            III.Il_0 = true;
         }

         if (II.II(II.IIl / 2 - 117, var1 - 30, 234, var2 + 5)) {
            IIOI = 1;
            int var3 = IolI;
            if ((IolI = (II.II - (II.IIl / 2 - 117)) / 78) < 0) {
               IolI = 0;
            }

            if (IolI > IO11.IIOo.length - 1) {
               IolI = IO11.IIOo.length - 1;
            }

            if (var3 != IolI) {
               this.I0l0();
            }
         }

         if (II.II(II.IIl / 2 - 117, var1 - 30 + var2 + 5, 234, 65)) {
            IIOI = 2;
            int var4 = IIO;
            if ((IIO = (II.II - (II.IIl / 2 - 117)) / 78) < 0) {
               IIO = 0;
            }

            if (IIO > IO11.II1[0].length - 1) {
               IIO = IO11.II1[0].length - 1;
            }

            if (var4 != IIOI) {
               this.I0l0();
            }
         }
      }

      super.I_Il();
      II.III1();
      II.IIIl();
   }

   @Override
   public void III_(IO1l var1) {
      if (!Ilol.I10I) {
         II.III1(var1);
         var1.IIl0(-I1_I.Io1, -I1_I.Io1I);
         if (!II.II) {
            for (int var2 = 0; var2 < I_.II[IolI].size(); var2++) {
               Il0o var3;
               if ((var3 = (Il0o)I_.II[IolI].elementAt(var2)).IIII != -1 && var3.III == 1) {
                  var3.II(var1);
               }
            }
         }

         if (IO10.l_lI == 5) {
            II.IIIl(var1);
         } else {
            IOlO.IIo(var1);
         }

         byte var15 = 30;
         if (II.IIl == 128) {
            var15 = 20;
         }

         int var4 = IIII[IolI][IIO];
         int var5 = II00[IolI];
         int var6 = II0o[IolI];
         var1.II(IOlO.IIlI, this.IoII, this.IIO0 + this.IIOo, 3);
         I_O1 var7 = I1_I.II[var4];
         I_O1 var8 = I1_I.II[var5];
         I_O1 var9 = I1_I.II[var6];
         I_oo.IIII(
            var1,
            var7.II[Ilol.II[this.II][0][0]].II1o,
            this.IoII + Ilol.II[this.II][0][1] + var7.II[Ilol.II[this.II][0][0]].IIO_,
            this.IIO0 - Ilol.II[this.II][0][2] + var7.II[Ilol.II[this.II][0][0]].II1O + this.IIOo,
            0,
            0
         );
         I_oo.IIII(
            var1,
            var8.II[Ilol.II[this.II][1][0]].II1o,
            this.IoII + Ilol.II[this.II][1][1] + var8.II[Ilol.II[this.II][1][0]].IIO_,
            this.IIO0 - Ilol.II[this.II][1][2] + var8.II[Ilol.II[this.II][1][0]].II1O + this.IIOo,
            0,
            0
         );
         I_oo.IIII(
            var1,
            var9.II[Ilol.II[this.II][2][0]].II1o,
            this.IoII + Ilol.II[this.II][2][1] + var9.II[Ilol.II[this.II][2][0]].IIO_,
            this.IIO0 - Ilol.II[this.II][2][2] + var9.II[Ilol.II[this.II][2][0]].II1O + this.IIOo,
            0,
            0
         );
         if (!II.II) {
            for (int var10 = 0; var10 < I_.II[IolI].size(); var10++) {
               Il0o var11;
               if ((var11 = (Il0o)I_.II[IolI].elementAt(var10)).IIII != -1 && var11.III == 3) {
                  var11.II(var1);
               }
            }
         }

         var1.IIl0(-var1.IIO1(), -var1.IIO_());
         if (II.IIl < 200) {
            I_10.III(I1_I.lI1o, I1_I.lI10, I1_I.lI_, I1_I.lI_I, var1);
            I_oo.IIII(
               var1,
               var7.II[Ilol.II[0][0][0]].II1o,
               II.IIl / 2 + Ilol.II[0][0][1] + var7.II[Ilol.II[0][0][0]].IIO_,
               I1_I.lI10 + 30 + var15 * 3 - Ilol.II[0][0][2] + var7.II[Ilol.II[0][0][0]].II1O + this.IIOo,
               0,
               0
            );
            I_oo.IIII(
               var1,
               var8.II[Ilol.II[0][1][0]].II1o,
               II.IIl / 2 + Ilol.II[0][1][1] + var8.II[Ilol.II[0][1][0]].IIO_,
               I1_I.lI10 + 30 + var15 * 3 - Ilol.II[0][1][2] + var8.II[Ilol.II[0][1][0]].II1O + this.IIOo,
               0,
               0
            );
            I_oo.IIII(
               var1,
               var9.II[Ilol.II[0][2][0]].II1o,
               II.IIl / 2 + Ilol.II[0][2][1] + var9.II[Ilol.II[0][2][0]].IIO_,
               I1_I.lI10 + 30 + var15 * 3 - Ilol.II[0][2][2] + var9.II[Ilol.II[0][2][0]].II1O + this.IIOo,
               0,
               0
            );

            for (int var16 = 0; var16 < IO11.IIO0.length; var16++) {
               if (IIOI == var16) {
                  var1.II(I1_I.Il_l, 0, 0, 13, 16, 2, I1_I.lI1o + 10 + (II.IIIO % 7 > 3 ? 1 : 0), I1_I.lI10 + 35 + var16 * var15, IOII.IIOI);
                  var1.II(I1_I.Il_l, 0, 0, 13, 16, 0, I1_I.lI1o + I1_I.lI_ - 10 - (II.IIIO % 7 > 3 ? 1 : 0), I1_I.lI10 + 35 + var16 * var15, IOII.IIOI);
               }

               IO1I.III_.II(var1, IO11.IIO0[var16], I1_I.lI1o + 20, I1_I.lI10 + 30 + var16 * var15, 0);
            }

            IO1I.III_.II(var1, IO11.IIOo[IolI], I1_I.lI1o + 70, I1_I.lI10 + 30 + var15 * 1, 0);
            IO1I.III_.II(var1, IO11.II1[IolI][IIO], I1_I.lI1o + 55, I1_I.lI10 + 30 + var15 * 2, 0);
         } else {
            byte var17 = 110;
            byte var12 = 60;
            if (II.IIl > II.IIlI) {
               var17 = 100;
               var12 = 45;
            }

            for (int var13 = 0; var13 < 3; var13++) {
               if (var13 != IolI) {
                  var1.II(I1_I.IlI0, II.IIl / 2 - 78 + var13 * 78, var17, 3);
               } else {
                  if (IIOI == 1) {
                     var1.II(I1_I.Il_l, 0, 0, 13, 16, 4, II.IIl / 2 - 78 + var13 * 78, var17 - 20 + (II.IIIO % 7 > 3 ? 1 : 0), IOII.IIOI);
                  }

                  var1.II(I1_I.IlIo, II.IIl / 2 - 78 + var13 * 78, var17, 3);
               }

               IO1I.III_.II(var1, IO11.IIOo[var13], II.IIl / 2 - 78 + var13 * 78, var17 - 5, 2);
            }

            for (int var14 = 0; var14 < 3; var14++) {
               if (var14 != IIO) {
                  var1.II(I1_I.IlI0, II.IIl / 2 - 78 + var14 * 78, var17 + var12, 3);
               } else {
                  if (IIOI == 2) {
                     var1.II(I1_I.Il_l, 0, 0, 13, 16, 4, II.IIl / 2 - 78 + var14 * 78, var17 + var12 - 20 + (II.IIIO % 7 > 3 ? 1 : 0), IOII.IIOI);
                  }

                  var1.II(I1_I.IlIo, II.IIl / 2 - 78 + var14 * 78, var17 + var12, 3);
               }

               IO1I.III_.II(var1, IO11.II1[IolI][var14], II.IIl / 2 - 78 + var14 * 78, var17 + var12 - 5, 2);
            }

            if (IIOI == 0) {
               var1.II(I1_I.Il_l, 0, 0, 13, 16, 4, II.IIl / 2, 20 + (II.IIIO % 7 > 3 ? 1 : 0), IOII.IIOI);
            }
         }

         III.III_(var1);
         var1.IIIO(0, 0, II.IIl, II.IIlI);
         IO1I.IIII.II(var1, IO11.I101 + IlIl("牣", 29251) + I1o_.Illl, 5, 5, 0, IO1I.III_);
         super.III_(var1);
      }
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 8000:
            if (III.IIl1().equals("")) {
               II.II(IO11.I1_l);
               return;
            } else if (III.IIl1().length() < 5) {
               II.II(IO11.I1_1);
               return;
            } else {
               if (III.IIl1().length() > 15) {
                  II.II(IO11.I1__);
                  return;
               }

               I1OO.IIl1();
               I_0_.II().II(III.IIl1(), IolI, IIII[IolI][IIO]);
               return;
            }
         case 8001:
            I1o_ var3 = II.II;
            if (I1o_.IOo) {
               II.II(IO11.Io0o, new I1Il(IO11.I_I_, this, 10019, null), new I1Il(IO11.I_IO, this, 10020, null));
               return;
            }

            I_0O.II().close();
            II.II.I0l_();
            return;
         case 10019:
            I_0O.II().close();
            II.III_();
            II.II.I0l_();
         default:
            return;
         case 10020:
            II.III_();
      }
   }
}
