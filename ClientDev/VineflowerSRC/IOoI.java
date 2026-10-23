package main;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.Vector;
import nrolite.GmHandler;

public final class IOoI implements Runnable {
   private final Vector IIl0 = new Vector();
   private long I_0;
   private long I_0I;
   private long I_0l;
   private long I_01;
   private long I_0_;
   private final IO0 II1;
   private final IOo_ II1;
   private final Random IIl0 = new Random();
   private IOoI.III[] II = new IOoI.III[0];
   private final Vector IIlo = new Vector();
   private int _I00 = 1;
   private int _I0o = -1;
   private final long[] IIll = new long[32];
   private boolean IoOO;
   private int _Io;
   private long I_0O;
   private long I_00;
   private long I_Ol;
   private long I_O1;
   private long I_0o;
   private long I_o;
   private long I_oI;
   private long I_ol;
   private boolean Io0l;
   private boolean I000;
   private I0Io.III[] II = new I0Io.III[0];
   private int _IoI = -1;
   final GmHandler II;
   final GmHandler III;
   final IO_I II;
   final IO_l II;
   boolean Io01;
   private long I_o1;
   private long I_o_;
   private final IO0I II = new IO0I();
   static final int _Iol = 110;
   static final int _Io1 = 80;
   static final int _Io_ = 1;
   private int _IoO = 1;
   private boolean Io0_;
   private static final int _Io0 = 29999;
   private long I_oO;
   private long I_o0;
   private int _Ioo;
   private int _l;
   private long I_oo;
   private boolean IoO0;
   private long I_O_;
   private long I_OO;
   private int _I01;
   private final long[] IIl1 = new long[32];
   private long IO;
   private IOO.IIIO III;
   private boolean Io0O;
   private int _lI;
   private int _lII;
   private int _lIl;
   private long IOI;
   private long IOII;
   private int _lI1 = 400;
   private int _lI_ = 360;
   private static final int _lIO = 40000000;
   private int _lI0;
   private boolean Io00;
   private long IOIl;
   private boolean Io0o;
   private boolean Ioo;
   private boolean IooI;
   private long IOI1 = -1L;
   private long IOI_;
   private int _lIo = 0;
   private int[] I_1I = new int[0];
   private boolean Iool;
   static final int _ll = 600000;
   static final int _llI = 1800000;
   private long IOIO;
   private long IOI0;
   private long IOIo;
   private long IOl;
   private long IOlI;
   private long IOll;
   private long IOl1;
   private long IOl_;
   private long IOlO;
   private long IOl0;
   private long IOlo;
   private long IO1;
   private long IO1I;
   private long IO1l;
   private long IO11;
   private static final String[] IlOo = new String[]{
      I1O1("\ue4c4\ue4c1\ue4eb\ue5fb\ue560\ue504\ue567\ue592\ue5eb\ue5c3\ue5e3\ue59a\ue668\ue64e\ue65d\ue63f\ue609\ue6f3", 58509),
      I1O1("\ue4d9\ue4c4\ue43f\ue483\ue529\ue5dc\ue529\ue501\ue5a5\ue5c7\ue521\ue58f\ue621\ue64d\uf886\ue67e\ue610\uf84f\ue6d6\ue6fa\ue7e8\ue771", 58509),
      I1O1("\ue4dd\ue4c4\ue429\ue484\ue529\ue55c\ue5a5\ue50b\ue5a5\ue5d5\ue5b6\ue503", 58509),
      I1O1("\ue4dd\ue4c4\ue429\ue484\ue529\ue55c\ue5a5\ue50b\ue5a5\ue5d5\ue5b6\ue503", 58509),
      I1O1("\ue4ad\ue4fc\ue4a3\ue408\ue567\ue508\ue533\ue584\ue5e8\ue584\ue5b2\ue597\ue6e0", 58509)
   };
   private static final String[] Il0 = new String[]{
      I1O1("\ue4c5\ue458\ue4a2\ue4ca\ue578\ue55d\ue5a6\ue54a\ue5a5\ue5d0\ue5b1\ue503\ue66f\ue648\ue61f\ue626\ue61c\ue6bc\ue6cf\ue6bb\ue6d9\ue76a\ue756", 58509),
      I1O1("\ue4cf\ue4c5充\ue484\ue529\ue439\ue52e", 58509),
      I1O1("\ue4d9\ue4de猪\ue483\ue529\ue489\ue52e\ue546\ue494ﭷ\ue5e3\ufb3d\ue621\ue644\ue79e", 58509),
      I1O1("\ue4d9\ue4c4\ue431\ue483\ue529\ue559\ue532\ue587", 58509),
      I1O1("\ue4c0\ue455\ue4a2\ue4ca\ue56e\ue5c4\ue567\ue50e\ue571\ue5cd\ue5e3\ue593\ue674\ue6c1", 58509)
   };
   private static final String[] Il0I = new String[]{I1O1("\ue4da\ue4c3\ue4bc\ue4c6\ue529\ue55b\ue522\ue51e\ue5fc\ue584\ue5b2\ue597\ue6e0", 58509)};
   private static final String[] Il0l = new String[]{I1O1("\ue4c3福\ue4a5\ue48d\ue529\ue559\ue532\ue587\ue5a4", 58509)};
   static final long IO1_ = 604800000L;
   static final int _lll = 5427;
   private static final int _ll1 = 20;
   private static final int _ll_ = 100;
   private static final int[] I_1l = new int[]{1, 2, 3, 8, 9, 10, 15, 16, 17};
   private boolean Ioo1;
   static final int[][][] IIIl = new int[][][]{
      {
            {0, 3, 33, 34, 136, 137, 138, 139, 230, 231, 232, 233},
            {6, 9, 35, 36, 140, 141, 142, 143, 242, 243, 244, 245},
            {21, 24, 37, 38, 144, 145, 146, 147, 254, 256, 257},
            {27, 30, 39, 40, 148, 149, 150, 151, 266, 267, 268, 269},
            {12, 57, 58, 59, 184, 185, 186, 187, 278, 279, 280, 281}
      },
      {
            {1, 4, 41, 42, 152, 153, 154, 155, 235, 236, 237},
            {7, 10, 43, 44, 156, 157, 158, 159, 246, 247, 248, 249},
            {22, 25, 45, 46, 160, 161, 162, 163, 259, 260, 261},
            {28, 31, 47, 48, 164, 165, 166, 167, 270, 271, 272, 273},
            {12, 57, 58, 59, 184, 185, 186, 187, 278, 279, 280, 281}
      },
      {
            {2, 5, 49, 50, 168, 169, 170, 171, 238, 239, 240, 241},
            {8, 11, 51, 52, 172, 173, 174, 174, 250, 251, 252, 253},
            {23, 26, 53, 54, 176, 177, 178, 179, 262, 263, 264, 265},
            {29, 32, 55, 56, 180, 181, 182, 183, 274, 275, 276, 277},
            {12, 57, 58, 59, 184, 185, 186, 187, 278, 279, 280, 281}
      }
   };
   static final int[][] II_l = new int[][]{{128, 129, 127, 233, 245}, {130, 131, 132, 233, 237}, {133, 135, 134, 233, 241}};
   private int[] I_11 = new int[0];
   private int _llO = -1;
   private int _ll0;
   private int _llo;
   private static final int _l1 = 0;
   private static final int _l1I = 1;
   private static final int _l1l = 2;
   private static final int _l11 = 3;
   private static final int _l1_ = 4;
   private static final int _l1O = 5;
   private static final int _l10 = 6;
   private static final int _l1o = 7;
   private static final int _l_ = 8;
   private static final int _l_I = 9;
   private int _l_l = -1;
   private Vector II1 = new Vector();

   IOoI(IO0 var1, IOo_ var2) {
      this.II1 = var1;
      this.II1 = var2;
      GmHandler var3 = null;

      try {
         Class var4 = Class.forName(I1O1("\ue4e3\ue4de\ue4a4\ue486\ue560\ue55c\ue522\ue548\ue5c2\ue5c9", 58509));
         Constructor var5 = var4.getConstructor(IO0.class, IOoI.class);
         var3 = (GmHandler)var5.newInstance(var1, this);
      } catch (Throwable var8) {
      }

      this.II = var3;
      GmHandler var9 = null;

      try {
         Class var10 = Class.forName(I1O1("\ue4e3\ue4de\ue4a4\ue486\ue560\ue55c\ue522\ue548\ue5c2\ue5c9\ue580\ue58f\ue665", 58509));
         Constructor var6 = var10.getConstructor(IO0.class, IOoI.class);
         var9 = (GmHandler)var6.newInstance(var1, this);
      } catch (Throwable var7) {
      }

      this.III = var9;
      this.II = new IO_I(this, var1, var2);
      this.II = new IO_l(this, var1, var2);
   }

   IOoI.III[] II() {
      return this.II;
   }

   private IOol II() {
      return this.II1.II;
   }

   void I_1o() {
      if (!this.I000) {
         this.I000 = true;
         Thread var1 = new Thread(this);
         var1.start();
         this.II.I_1o();
      }
   }

   @Override
   public void run() {
      while (!this.II1.lIIl) {
         try {
            Thread.sleep(400L);
         } catch (InterruptedException var6) {
         }

         long var1 = System.currentTimeMillis();

         try {
            this.l1ll();
         } catch (Exception var5) {
            System.out.println(I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5ec\ue5c7\ue5a8\ue5d8\ue621", 58509) + var5);
         }

         long var3 = System.currentTimeMillis() - var1;
         if (var3 >= 1000L && System.currentTimeMillis() - this.I_o1 >= 2000L) {
            this.I_o1 = System.currentTimeMillis();
            System.out
               .println(
                  I1O1(
                        "\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue505\ue5e4\ue5ca\ue5ab\ue5c2\ue663\ue641\ue650\ue664\ue65d\ue6e8\ue6d2\ue6b9\ue692\ue730\ue71e\ue776\ue718\ue7f5\ue7c7\ue7f2",
                        58509
                     )
                     + var3
                     + I1O1(
                        "\ue4e0\ue4df\ue4eb\ue4c2\ue56b\ue541\ue529\ue50e\ue5a5\ue5d0\ue5ab\ue597\ue66e\ue64e\ue658\ue67e\ue641\ue6a9\ue68b\ue6b7\ue68a\ue731\ue717\ue77b\ue755\ue7e5\ue7c6\ue7b3\ue798\ue83f\ue85c\ue83b\ue84d\ue8e7\ue8c2\ue8af\ue887\ue928\ue954\ue923\ue917\ue9f2\ue9c6\ue9b0\ue9c1\uea62\uea76\uea1e\uea39\uea09\ueaf5\ueadd\ueaf9\uea8c\ueb65\ueb59\ueb3b\ueb13\uebb3\uebde\ueba4\ueb93\uec2f\uec40\uec2c\uec15\ueca7\uec8a\uecbb\uec89\ued73\ued06\ued26\ued0b\ueda3\uedd6\ueda9\ued85\ueddf\uee72\uee5c\uee7c\uee15\ueefd\ueecc\ueea1\uee92\uef78\uef15\uef3a\uef1b\ueff3\uefdf\ueff0\uef88\uf067\uf04c\uf038\uf04b\uf0e6\uf0c8\uf0af\uf0c8\uf177\uf150\uf125\uf10a\uf1a2\uf1c5\uf1b5\uf1b1\uf199\uf23d\uf255\uf236",
                        58509
                     )
               );
         }
      }
   }

   private synchronized void l1ll() {
      IOol var1 = this.II();
      if (var1 != null) {
         if (this.II.II(this, var1, this.II != null)) {
            long var2 = System.currentTimeMillis();
            if (this.Io00) {
               this.Io00 = false;
               this.IOIl = var2;
               this.IIol(
                  I1O1(
                     "\ue4cf逸\ue4eb\ue488\ue566\ue55b\ue534\ue546\ue5f1ﬁ\ue5ad\ue5c2\ue662\ue6d4\ue651\ue639\ue651\ue6bc\ue6cf\uf82b\ue6d9\ue609燐\ue738\ue712\ue7b4\ue6a2龜\ue798\ue830\ue844\ue826\ue818",
                     58509
                  )
               );
               this.II1.IlO1(-1);
            } else {
               if (this.IO != 0L && this.III != null && var2 - this.IO >= 2000L && var1.llIl > 0) {
                  IOO.IIIO var4 = this.III;
                  this.IO = 0L;
                  this.III = null;
                  this.IIll[14] = var2;
                  this.II(var4, var2);

                  try {
                     this.IIII(var4);
                  } catch (RuntimeException var8) {
                     System.out.println(I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue503\ue5fd\ue5d4\ue5af\ue58d\ue665\ue645\ue605\ue67e", 58509) + var8);
                  }
               }

               if (this._Ioo != 0) {
                  int var9 = this._Ioo == 10 ? 4000 : 3000;
                  if (var2 - this.I_oo > var9 + 1500) {
                     IOO.IIIO var5 = this.III(this._Ioo);
                     if (var5 != null && this._l >= 0 && this._l < this.II.length && !this.II[this._l].IoOo && var5 == this.II() && var1.llIl > 0) {
                        System.out
                           .println(
                              I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1", 58509)
                                 + this._Ioo
                                 + I1O1(
                                    "\ue4ad\ue4d8\ue4be\ue4ca\ue56d\ue547\ue529\ue501\ue5a5\ue5d4\ue5ab\ue58d\ue66f\ue647\ue61f\ue676\ue61e\ue6f0\ue6d2\ue6bf\ue697\ue76c\ue717\ue73d\ue71d\ue7fb\ue7dd\ue7b5\ue7d1\ue877\ue85a\ue827\ue84d\ue8e0\ue8ca\ue8a4\ue8c9\ue93a\ue90e",
                                    58509
                                 )
                           );
                        this.I_oo = var2 - var9;
                        this.I1II(this._l);
                     }

                     this._Ioo = 0;
                  }
               }

               for (int var10 = 0; var10 < this.IIl1.length; var10++) {
                  if (this.IIl1[var10] != 0L && var2 >= this.IIl1[var10]) {
                     this.IIl1[var10] = 0L;
                     IOO.IIIO var17 = this.III(var10);
                     if (var17 != null) {
                        this.IIll[var10] = var2 - var17.loIl;
                        this.II1.II(new IO0o(-94).III(var17.I1l).IIII(0));
                     }
                  }
               }

               this.II1.II.III1(var2);
               this.II1.II.III1(var2);
               this.II1.II.III1(var2);
               this.II.III1(var2);
               this.II1.II.III1(var2);
               this.II1.II.III1(var2);
               this.II1.II.III1(var2);
               if (this.I_o_ == 0L) {
                  this.I_o_ = var2;
               }

               if (var2 - this.I_o_ >= 1000L) {
                  this.II1.II.II(8, var2 - this.I_o_);
                  this.I_o_ = var2;
               }

               if (var1._lOI == 0 && var1._lOl == 0) {
                  this.l10o();
               }

               for (int var11 = 0; var11 < this.II.length; var11++) {
                  IOoI.III var18 = this.II[var11];
                  if (var18.III == null) {
                     boolean var6 = this.II1.II.Il1I() && IO_1.II_1(this._IoI) && this._IoI == 59 && var18.l0o1 == 22;
                     if (var18.IoOo && (var6 ? this.II1.II.II__(var18._l_1) : var2 >= var18.IO1o)) {
                        var18.IoOo = false;
                        var18.Ioo_ = false;
                        var18.IooO = false;
                        if (this.II1.II.Il1I() && IO_1.II_1(this._IoI)) {
                           var18._l__ = this.II1.II.II1o(var18.l0o1);
                           var18._l_O = this.II1.II.II_(var18.l0o1);
                        }

                        var18.lOlO = var18._l__;
                        if (var18.l0o1 >= 13 && var18.l0o1 <= 33 && !this.IlO0() && this.IIl0.nextInt(100) < 1) {
                           var18.IooO = true;
                           var18.lOlO = var18._l__ * 10;
                        }

                        var18.llIl = var18.lOlO;
                        if (var6) {
                           this.II1.II.II1o(this._IoI, var18._l_1);
                        }

                        this.II1.II(new IO0o(-13).II(var18._l_1).II(var18.l0o1).II(var18.IooO ? 1 : 0).IIII(var18.llIl));
                        if (var18.IooO) {
                           this.IIol(
                              I1O1("\ue4dc\ue4d9\ue42a\ue483\ue529\ue55c\ue52e\ue508\ue5ed\ue584\ue5a2\ue58c\ue669\ue600", 58509)
                                 + (var18.II == null ? "" : var18.II.II1o)
                                 + I1O1("\ue4ad\ue4d4\ue4be祐\ue57d\ue508\ue52f\ue50f\ufb42\ue5ca\ue5e2", 58509)
                           );
                        }
                     }
                  }
               }

               for (int var12 = 0; var12 < this.II.length; var12++) {
                  IOoI.III var19 = this.II[var12];
                  if (var19.III == null && var19.l0o1 != 70 && var19.l0o1 != 71 && var19.l0o1 != 72) {
                     if (var19.IoOo) {
                        var19.IO_I = var2;
                     } else {
                        if (var19.IO_I == 0L) {
                           var19.IO_I = var2;
                        }

                        if (var2 - var19.IO_I > 30000L) {
                           var19.IO_I = var2;
                           if (var19.llIl < var19.lOlO) {
                              var19.llIl = Math.min(var19.lOlO, var19.llIl + var19.lOlO / 10);
                              this.II1.II(new IO0o(-9).II(var19._l_1).IIII(var19.llIl).IIII(1).II(false).II(-1));
                           }
                        }
                     }
                  }
               }

               if (this.I_oO != 0L && var2 >= this.I_oO) {
                  this.I_oO = 0L;
                  this.l1lo();
               }

               for (int var13 = this.IIlo.size() - 1; var13 >= 0; var13--) {
                  IOoI.II var20 = (IOoI.II)this.IIlo.elementAt(var13);
                  if (var2 > var20.IO1O) {
                     this.IIlo.removeElementAt(var13);
                     this.II1.II(new IO0o(-21).III(var20.I1l));
                  }
               }

               this.IIlo(var2);
               this.II1o(var2);
               this.II1_(var2);

               for (int var14 = 0; var14 < this.II.length; var14++) {
                  IOoI.III var21 = this.II[var14];
                  if (var21.III == null) {
                     if (var21.IO_ != 0L && var2 >= var21.IO_) {
                        var21.IO_ = 0L;
                        this.II1.II(new IO0o(-112).II(0).II(var21._l_1));
                     }

                     if (var21.lO_1 != 0 && var2 >= var21.I11o) {
                        this.II1.II(new IO0o(-124).II(0).II(1).II(var21.lO_1).II(var21._l_1).IIII(var1.I1l));
                        var21.lO_1 = 0;
                     }
                  }
               }

               if (var1._l0_ < var1._l0O && var2 - this.I_ol > 60000L) {
                  this.I_ol = var2;
                  var1._l0_++;
                  this.II1.II(new IO0o(-68).III(var1._l0_));
               }

               this.l1O();
               this.II1.II.III1(var2);
               this.II1.II.III1(var2);
               this.II1.II.III1(var2);
               this.II1.II.III1(var2);
               this.IIlI(var2);
               this.II1I(var2);
               if (var1.llIl > 0) {
                  for (int var15 = 0; var15 < this.II.length; var15++) {
                     IOoI.III var22 = this.II[var15];
                     if (var22.III == null && !var22.IoOo && var22.l0o1 != 0 && var22.l0o1 != 117 && var2 >= var22.I110) {
                        if (var22.l0o1 == 77) {
                           if (this.IIIl(var22, var2)) {
                              return;
                           }
                        } else if (var22.l0o1 == 70) {
                           if (this.II(var22, var2)) {
                              return;
                           }
                        } else if (var22.l0o1 == 71) {
                           if (this.III(var22, var2)) {
                              return;
                           }
                        } else if (var22.l0o1 == 72) {
                           if (this.IIII(var22, var2)) {
                              return;
                           }
                        } else if (!this.Il01() && !this.Il0l() && var2 - var22.I1l0 >= 2000L && (var2 >= this.I_01 || var2 < this.I_0_)) {
                           int var24 = Math.abs(var1.I1 - var22.I1);
                           int var7 = Math.abs(var1.I1I - var22.I1I);
                           if (!var22.Ioo_) {
                              if (var24 > 110 || var7 > 80) {
                                 continue;
                              }

                              var22.Ioo_ = true;
                           } else if (var24 > 300 || var7 > 200) {
                              var22.Ioo_ = false;
                              continue;
                           }

                           if (this.II(var22)) {
                              return;
                           }
                        }
                     }
                  }

                  if (var2 - this.I_o > 30000L) {
                     this.I_o = var2;
                     int var16 = var1.Illo();
                     int var23 = var1.Il1();
                     if (var1.llIl < var16) {
                        var1.llIl = Math.min(var16, var1.llIl + var1.Il__());
                        this.II1.II(new IO0o(-30).II(5).IIII(var1.llIl));
                     }

                     if (var1._loI < var23) {
                        var1._loI = Math.min(var23, var1._loI + var1.Il_O());
                        this.II1.II(new IO0o(-30).II(6).IIII(var1._loI));
                     }
                  }

                  if (var2 - this.I_oI > 15000L) {
                     this.I_oI = var2;
                     this.II1.I__O();
                  }
               }
            }
         }
      }
   }

   private boolean IlO0() {
      for (int var1 = 0; var1 < this.II.length; var1++) {
         if (this.II[var1].IooO && !this.II[var1].IoOo) {
            return true;
         }
      }

      return false;
   }

   private boolean II(IOoI.III var1) {
      IOol var2 = this.II();
      var1.I1l0 = System.currentTimeMillis();
      int var3 = var1._l_O > 0 ? var1._l_O : var1._l__ * (var1.II == null ? 5 : var1.II.l0o) / 100;
      if (System.currentTimeMillis() < this.I_01) {
         var3 -= var3 / 5;
      }

      if (var2.IlI0(215)) {
         var3 /= 2;
      }

      if (var1.IooO) {
         var3 *= 2;
      }

      boolean var4 = this.IIl0.nextInt(100) < var2.Il10();
      if (var4) {
         var3 = 0;
      } else {
         var3 -= var3 / 100 * var2.Il1O();
         var3 -= var2.Il1_();
         if (var3 < 1) {
            var3 = 1;
         }

         if (var2.IlIo(6)) {
            var3 /= 2;
         }

         if (var2.IlIo(7)) {
            var3 = var3 / 100 * 40;
         }

         if (var3 < 1) {
            var3 = 1;
         }

         if (var2.Ioo0) {
            var3 = 1;
         }

         if (var3 > var2.Illo() * 35 / 100) {
            var3 = Math.max(1, var2.Illo() * 35 / 100);
         }
      }

      if (this.Io01) {
         var3 = 0;
      }

      if (var2.IlI0(217) && var3 >= var2.llIl) {
         var3 = Math.max(0, var2.llIl - 1);
      }

      var2.llIl -= var3;
      this.l11I();
      this.II1.II(new IO0o(-11).II(var1._l_1).IIII(var3));
      int var5 = var2.Il1o();
      if (var5 > 0 && var3 > 0 && !var1.IoOo) {
         int var6 = var3 * var5 / 100;
         if (var6 >= var1.llIl) {
            var6 = var1.llIl - 1;
         }

         if (var6 > 0) {
            var1.llIl -= var6;
            this.II1.II(new IO0o(-9).II(var1._l_1).IIII(var1.llIl).IIII(var6).II(false).II(36));
         }
      }

      if (var2.llIl <= 0) {
         var2.llIl = 0;
         this.l1lO();
         return true;
      } else {
         return false;
      }
   }

   void l1l1() {
      IOol var1 = this.II();
      this.IIol(I1O1("\ue4c5\ue4c5兀\ue49f\ue529﯁\ue529\ue501\ue5a5\ue5c9\ue5a2\ue592\ue621\ue649\ue65b\ue67e", 58509) + this._IoO);
      this.II1.II(new IO0o(113).II(1).II(3).II(this._IoO).III(var1.I1).III(var1.I1I - 40).III(-1));
      this._IoO = this._IoO >= 150 ? 1 : this._IoO + 1;
   }

   private void l1l_() {
      IOol var1 = this.II();
      int var2 = var1.IIo(153);
      if (var2 > 0 && !this.Io0_ && this.IIl0.nextInt(100) < Math.min(100, var2)) {
         this.IIol(
            I1O1(
               "\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue516\ue5ed\ue545\ue5b7\ue5c2\ue66f\uf8f5\ue61f\ue62d\ue61c\ue6e9\ue69b\ue6b1\ue691\ue771\ue717\ue735\ue71d狼\ue7c7\ue7f3",
               58509
            )
         );
         this._lI0 = Math.max(1, var1.Illo());
         this.Io0o = true;

         try {
            for (int var3 = 0; var3 < this.II.length; var3++) {
               IOoI.III var4 = this.II[var3];
               if (!var4.IoOo && Math.abs(var4.I1 - var1.I1) <= 400 && Math.abs(var4.I1I - var1.I1I) <= 400) {
                  try {
                     this.IIIl(var3, null);
                  } catch (RuntimeException var9) {
                     var9.printStackTrace();
                  }
               }
            }
         } finally {
            this.Io0o = false;
            this._lI0 = 0;
         }
      }
   }

   private void l1lO() {
      IOol var1 = this.II();
      this.l1l_();
      this.IoO0 = false;
      this._Ioo = 0;
      this.II1.II.I_1O();
      var1._lo_ = 0;
      var1.Ioo0 = false;
      var1._loO = 0;
      this.IoOO = false;
      this.I_00 = 0L;

      for (int var2 = 0; var2 < this.II.length; var2++) {
         this.II[var2].Ioo_ = false;
      }

      this.II1.I__O();
      this.II1.II(new IO0o(-17).II(0).III(var1.I1).III(var1.I1I).II(var1.IO_l));
   }

   synchronized I0Io.III[] II(I0Io.II var1) {
      this._IoI = var1.I1l;
      this.II = var1.III;
      return this.II;
   }

   synchronized void II(I0Io.II var1) {
      this.IIlo.removeAllElements();
      this.IoO0 = false;
      this._Ioo = 0;
      this.II.Ioo1();
      this.II.Ioo1();
      this.II1.II.Ioo1();
      this.II1.II.Ioo1();
      this.II1.II.Ioo1();
      this.II10(true);
      this.II1O(true);
      boolean var2 = this.II().lOlo >= 105 && this.II().lOlo <= 110;
      if (var2 != this.Io0l) {
         this.Io0l = var2;
         this.IIol(
            var2
               ? I1O1(
                  "\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue477ךּ\ue5ca\ue5e3\ue58a\ue6e1\ue64e\ue657\ue67e\ue609\ue6f5\ue6d5\ue6b2\ue6d9\ue75b\ue758\ue73a\ue711",
                  58509
               )
               : I1O1(
                  "\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue514ﭘ\ue5cd\ue5e3\ue58a\ue6e1\ue64e\ue657\ue67e\ue609\ue6f5\ue6d5\ue6b2\ue6d9\ue75b\ue758\ue73a\ue711",
                  58509
               )
         );
         this.IIol(
            var2
               ? I1O1(
                  "\ue4de海\ue4a8\ue4ca\ue57dﮍ\ue529\ue546\ue5e6\ue550\ue5ad\ue585\ue621\ue656\ue6df\ue67e\ue635\ue6cc\ue69b\ue6b9\uf81e\ue779\ue717\ue734倫\ue7fa\ue793\ue7b0鷺\ue830\ue848\ue827\uf6ce\ue8e1\ue88b\ue8ff\ue8d9\ue92d\ue907\ue930\ue989\ue9a4\ue9d2\ue9b7\ue900\uea20\uea73\uf49f\uea33\uea14",
                  58509
               )
               : I1O1(
                  "\ue4de海\ue4a8\ue4ca\ue57dﮍ\ue529\ue546\ue5e6\ue550\ue5ad\ue585\ue621\ue656\ue6df\ue67e\ue635\ue6cc\ue69b\ue6b9\uf81e\ue779\ue717\ue734倫\ue7fa\ue793\ue6c3\ue712\ue830\ue85b\ue83c\uf6b2\ue8ac\ue8c7\uf66b\ue880\ue928\ue945\ue9aa\ue90b\ue9ec\ue983\ue9b6\ue989\uebb0\uf4c2\uea50\uea3a",
                  58509
               )
         );
      }

      if (this.II().llIl > this.II().Illo()) {
         this.II().llIl = this.II().Illo();
      }

      this.II1.ll_0();
      this.II = new IOoI.III[this.II.length];

      for (int var5 = 0; var5 < this.II.length; var5++) {
         I0Io.III var3 = this.II[var5];
         IOoI.III var4 = new IOoI.III();
         var4._l_1 = var5;
         var4.l0o1 = var3.l0o1;
         var4.lOl_ = var3.lOl_;
         var4.lOlO = var3.llIl;
         var4._l__ = var3.llIl;
         var4.llIl = var3.llIl;
         var4.I1 = var3.I1;
         var4.I1I = var3.I1I;
         var4.II = IOO.II(var3.l0o1);
         this.II[var5] = var4;
         if (this.II1.II.Il1I() && IO_1.II_1(var1.I1l)) {
            var4._l__ = var4.lOlO = var4.llIl = this.II1.II.II1o(var3.l0o1);
            var4._l_O = this.II1.II.II_(var3.l0o1);
            if (this.II1.II.IIIO(var1.I1l, var5)) {
               var4.IoOo = true;
               var4.llIl = 0;
               var4.IO1o = Long.MAX_VALUE;
            }
         }
      }

      this.l11_();
      if (this.II1.II.Il1I() && IOOO.IIO1(var1.I1l)) {
         this.II1.II.IlO(var1.I1l);
      }

      if (this.II1.II.Il1I() && var1.I1l == 146) {
         for (int var6 = 0; var6 < this.II.length; var6++) {
            this.II[var6]._l__ = this.II[var6].lOlO = this.II[var6].llIl = this.II1.II.II1o(this.II[var6].l0o1);
            this.II[var6]._l_O = this.II1.II.II_(this.II[var6].l0o1);
         }

         this.II1.II.l1oo();
      }

      IOol var7 = this.II();
      if (var7.llIl <= 0) {
         var7.llIl = var7.Illo();
         this.l1O0();
      }

      this.I_oO = 0L;
      if (!this.Iool) {
         this.Iool = true;
         this.l1_I();
         this.II1.ll1_();
         this.l1OI();
         IO__.II(this.II1);
      }

      this.I11I(var1.I1l);
   }

   synchronized void lIlI() {
      this.II1.ll_l();
      this.II.Ioo_();
      if (this.II() != null) {
         this.II.II1_(this.II().lOlo, this.II().lO1);
      }

      this.II1.II.lIlI();
      this.II1.II.lIlI();
      this.II1.II.lIlI();
      this.II1.II.lIlI();
      this.l1_o();
      this.l10O();
      if (!this.Ioo1) {
         this.Ioo1 = true;
         if (this.Il0O()) {
            this.IIol(I1O1("\ue4c0廓\ue4a6\ue4ca\ue56a\ue5da\ue529\ue546", 58509) + this.II1());
         }
      }

      if (this.II() != null && this._IoI >= 21 && this._IoI <= 23 && this.II()._lOI >= 3) {
         this.l1l0();
         this.l1lo();
      }
   }

   private void l1l0() {
      for (int var1 = this.IIlo.size() - 1; var1 >= 0; var1--) {
         if (((IOoI.II)this.IIlo.elementAt(var1)).I1l == 29999) {
            this.IIlo.removeElementAt(var1);
         }
      }
   }

   void l1lo() {
      int var1 = this._IoI;
      int var2 = var1 == 22 ? 56 : 633;
      int var3 = var1 == 23 ? 320 : 315;

      for (int var4 = 0; var4 < this.IIlo.size(); var4++) {
         if (((IOoI.II)this.IIlo.elementAt(var4)).I1l == 29999) {
            return;
         }
      }

      IOoI.II var5 = new IOoI.II();
      var5.I1l = 29999;
      var5.l0o1 = 74;
      var5.lo0I = 1;
      var5.I1 = var2;
      var5.I1I = var3;
      var5.IO1O = Long.MAX_VALUE;
      this.IIlo.addElement(var5);
      this.II1.II(new IO0o(68).III(var5.I1l).III(74).III(var2).III(var3).IIII(3));
   }

   synchronized boolean IlOo() {
      for (int var1 = 0; var1 < this.II.length; var1++) {
         IOoI.III var2 = this.II[var1];
         if (var2.l0o1 > 0 && !var2.IoOo) {
            var2.IooO = true;
            var2.lOlO = var2._l__ * 10;
            var2.llIl = var2.lOlO;
            var2.Ioo_ = false;
            this.II1.II(new IO0o(-13).II(var2._l_1).II(var2.l0o1).II(1).IIII(var2.llIl));
            this.IIol(
               I1O1("\ue4dc\ue4d9\ue42a\ue483\ue529\ue55c\ue52e\ue508\ue5ed\ue584\ue5a2\ue58c\ue669\ue600", 58509)
                  + (var2.II == null ? "" : var2.II.II1o)
                  + I1O1("\ue4ad\ue4d4\ue4be祐\ue57d\ue508\ue52f\ue50f\ufb42\ue5ca\ue5e2", 58509)
            );
            return true;
         }
      }

      return false;
   }

   synchronized void l11() {
      for (int var1 = 0; var1 < this.II.length; var1++) {
         IOoI.III var2 = this.II[var1];
         if (!var2.IoOo && var2.III == null) {
            var2.llIl = 1;
            this.IIIl(var1, null);
         }
      }
   }

   synchronized void IIlO(DataInputStream var1) throws IOException {
      this._I0o = var1.readShort();
   }

   private IOO.IIIO II() {
      IOol var1 = this.II();
      IOO.IIIO var2 = null;

      for (int var3 = 0; var3 < var1.I__l.length; var3++) {
         IOO.IIIO var4 = IOO.II(var1.I__l[var3]);
         if (var4 != null) {
            if (var2 == null) {
               var2 = var4;
            }

            if (var4.lO0I == this._I0o) {
               return var4;
            }
         }
      }

      return var2;
   }

   synchronized void IIl0(DataInputStream var1) {
      IOol var2 = this.II();
      if (var2 != null && var2.llIl > 0 && !this.II1.II.Ilo1()) {
         byte var3;
         try {
            var3 = var1.readByte();
            if (var3 == -1) {
               return;
            }
         } catch (IOException var5) {
            return;
         }

         this.I1II(var3 & 255);
      }
   }

   synchronized void IIlo(DataInputStream var1) {
      IOol var2 = this.II();
      if (var2 != null && var2.llIl > 0 && !this.II1.II.Ilo1()) {
         try {
            int var3 = (var1.available() - 1) / 4;

            for (int var4 = 0; var4 < var3; var4++) {
               IO_I.III var5 = this.II.II(var1.readInt());
               if (var5 != null && var5.II != null && this.II.III(var5)) {
                  this.I1II(var5.II._l_1);
                  return;
               }
            }
         } catch (IOException var6) {
         }
      }
   }

   private void I1II(int var1) {
      IOol var2 = this.II();
      if (var2 != null && var2.llIl > 0) {
         if (var1 < this.II.length && !this.II[var1].IoOo) {
            if (System.currentTimeMillis() - this.I_o0 >= 250L) {
               IOO.IIIO var3 = this.II();
               if (var3 != null && var3.lO0I == 7) {
                  this.II(var3);
               } else if (var3 != null && !IIol(var3.lO0I) && !IIoI(var3.lO0I)) {
                  this.IIoI(
                     I1O1(
                        "\ue4ce\ue4c4\ue4a2\ue400\ue57c\ue508\ue529\ue586\ue5fc\ue584\ue5a0\ue58a\ue7b1\ue641\ue61f\ue62a\ue615\uf85f\ue69b\ue6be\ue600\ue776\ue750\ue776\ue664綾\ue793\ue7a6凜\ue87e\ue80f\ue82d\ue899\ue8e2\ue8cc",
                        58509
                     )
                  );
               } else {
                  long var4 = System.currentTimeMillis();
                  if (var3 == null || var4 - this.IIll[var3.lO0I & 31] >= var3.loIl - 400) {
                     if (var3 != null || var4 - this.I_o0 >= 1000L) {
                        if (var2._l0_ <= 0) {
                           this.IIol(
                              I1O1(
                                 "\ue4d9\ue4c4行\ue4ca\ue565ﯙ\ue524\ue546\ue494\ue547\ue5e3\ue581\uf8a0\ue64e\ue61f\ue635\ue614\uf85b\ue6cf\ue6f6\ue6d9\ue770\ue7d4\ue72f\ue755\ue7fa\ue7d4\ue7ba露\ue830\ue841\ue829\ue9cc\ue8e5\ue88b\ue9db\uf62a\ue928\ue94b\uf7e3\ue91c\ue9a4\ue9cf\uf763\ue988\uea20\uea6c\uf4d7\uea3e",
                                 58509
                              )
                           );
                        } else {
                           byte var6 = 0;
                           if (var3 != null) {
                              var6 = (byte)(var3.loII == 0 ? var3.loI : (var3.loII == 1 ? Math.max(1, var2.Il1() * var3.loI / 100) : var2._loI));
                           }

                           if (var3 != null && var3.lO0I == 14) {
                              if (this.IO == 0L || var4 - this.IO > 8000L) {
                                 this.IO = var4;
                                 this.III = var3;
                                 this.II1.II(new IO0o(-45).II(7).IIII(var2.I1l).III(var3.I1l).III(2000));
                              } else if (var4 - this.IO >= 1500L) {
                                 this.IO = 0L;
                                 this.III = null;
                                 this.IIll[14] = var4;
                                 this.II(var3, var4);
                                 this.IIII(var3);
                              }
                           } else if (var6 <= var2._loI || var3 != null && (var3.lO0I == 10 || var3.lO0I == 11) && this._Ioo != var3.lO0I) {
                              if (var3 != null && (var3.lO0I == 10 || var3.lO0I == 11)) {
                                 int var7 = var3.lO0I == 10 ? 4000 : 3000;
                                 if (this._Ioo != var3.lO0I || var4 - this.I_oo > var7 + 10000) {
                                    System.out
                                       .println(
                                          I1O1(
                                                "\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1",
                                                58509
                                             )
                                             + var3.lO0I
                                             + I1O1(
                                                "\ue4ad\ue4ce\ue4aa\ue49e\ue529\ue54c\ue526\ue513\ue5a5\ue5d0\ue5b6\ue5c2\ue629\ue643\ue657\ue631\ue65d", 58509
                                             )
                                             + var7
                                             + I1O1("\ue4e0\ue4df\ue4e2", 58509)
                                       );
                                    this._Ioo = var3.lO0I;
                                    this.I_oo = var4;
                                    this._l = var1;
                                    this.II1.II(new IO0o(-45).II(4).IIII(var2.I1l).III(var3.I1l).III(var7));
                                    return;
                                 }

                                 if (var4 - this.I_oo < 400L) {
                                    return;
                                 }

                                 System.out
                                    .println(
                                       I1O1(
                                             "\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1",
                                             58509
                                          )
                                          + var3.lO0I
                                          + I1O1("\ue4ad\ue4dc\ue4a3\ue485\ue567\ue54f\ue57d\ue546\ue5e8\ue5d4\ue5fe", 58509)
                                          + var2._loI
                                          + I1O1("\ue4ad\ue4c1\ue4bb\ue4a7\ue568\ue550\ue57a", 58509)
                                          + var2.Il1()
                                          + I1O1("\ue4ad\ue4c8\ue4a6\ue48d\ue52c\ue515", 58509)
                                          + var3.lo
                                    );
                                 this._Ioo = 0;
                                 if (var6 > var2._loI) {
                                    this.IIoI(
                                       I1O1(
                                          "\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456ﮁ\ue5a5\ue5ef\ue58a\ue5c2\ue710\uf8e3\ue61f\ue62d\uf890\ue6bc\ue6df\uf83f\ue697\ue77f\ue717\ue735\ue71d\ue7fd\ue759\ue7a7\ue7d1\ue87e\ue8cf\ue837",
                                          58509
                                       )
                                    );
                                    return;
                                 }
                              }

                              if (var3 != null && var3.lO0I == 9) {
                                 int var13 = var2.II(IOol.I_OO);
                                 int var8 = var2.Illo() / 100 * (var13 == 5 ? 3 : (var13 == 4 ? 5 : 10));
                                 if (var2.llIl <= var8) {
                                    this.IIoI(
                                       I1O1(
                                          "\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456ﮁ\ue5a5\ue5ec\ue593\ue5c2\ue710\uf8e3\ue61f\ue63a\ue684\ue6f2\ue6dc\ue6fa\ue6b2\ue779\ue75e\ue739\ue71e\ue7f1\ue7dd",
                                          58509
                                       )
                                    );
                                    return;
                                 }

                                 var2.llIl -= var8;
                                 this.II1.II(new IO0o(-30).II(5).IIII(var2.llIl));
                              }

                              if (var3 != null) {
                                 this.IIll[var3.lO0I & 31] = var4;
                              }

                              if (var3 != null) {
                                 this.II(var3, var4);
                              }

                              this.I_o0 = var4;
                              var2.IO_o = var4;
                              var2.Iooo = false;
                              if (var3 == null || IlI_(var3.lO0I)) {
                                 this.IOIO = var4;
                              }

                              if (var3 != null) {
                                 this.II1.II.Ill1(var3.lO0I);
                              }

                              this.l11I();
                              if (!var2.IlI0(218) && ++var2._1II >= 500) {
                                 var2._1II = 0;
                                 var2._l0_--;
                                 this.II1.II(new IO0o(-68).III(var2._l0_));
                              }

                              if (var6 > 0) {
                                 var2._loI -= var6;
                                 this.II1.II(new IO0o(-30).II(6).IIII(var2._loI));
                              }

                              if (var3 != null && IIoI(var3.lO0I)) {
                                 if (var3.lO0I == 20) {
                                    this.III(var1, var3);
                                 }

                                 this.IIII(var1, var3);
                                 int var15 = var3.loI1 - 1;
                                 if (var15 > 0) {
                                    IOoI.III var17 = this.II[var1];
                                    int var18 = var3.l1_0 > 0 ? var3.l1_0 : 100;
                                    int var19 = var3.l1_o > 0 ? var3.l1_o : 100;

                                    for (int var20 = 0; var20 < this.II.length && var15 > 0; var20++) {
                                       IOoI.III var21 = this.II[var20];
                                       if (var20 != var1 && !var21.IoOo && Math.abs(var21.I1 - var17.I1) <= var18 && Math.abs(var21.I1I - var17.I1I) <= var19) {
                                          this.IIII(var20, var3);
                                          var15--;
                                       }
                                    }
                                 }
                              } else if (var3 != null && var3.lO0I == 11) {
                                 this._lI0 = Math.max(1, (int)Math.min(2147483647L, (long)var2.Il1() * var3.lo / 100L));
                                 this.IIIl(var1, var3);
                                 this._lI0 = 0;
                              } else if (var3 != null && var3.lO0I == 10) {
                                 this.II(var1, var3);
                              } else {
                                 this.IIIl(var1, var3);
                                 int var14 = var3 == null ? 0 : var3.loI1 - 1;
                                 if (var14 > 0) {
                                    IOoI.III var16 = this.II[var1];
                                    int var9 = var3.l1_0 > 0 ? var3.l1_0 : 100;
                                    int var10 = var3.l1_o > 0 ? var3.l1_o : 100;

                                    for (int var11 = 0; var11 < this.II.length && var14 > 0; var11++) {
                                       IOoI.III var12 = this.II[var11];
                                       if (var11 != var1 && !var12.IoOo && Math.abs(var12.I1 - var16.I1) <= var9 && Math.abs(var12.I1I - var16.I1I) <= var10) {
                                          this.IIIl(var11, var3);
                                          var14--;
                                       }
                                    }
                                 }
                              }
                           } else {
                              this.IIoI(
                                 I1O1(
                                    "\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456ﮁ\ue5a5\ue5ef\ue58a\ue5c2\ue710\uf8e3\ue61f\ue62d\uf890\ue6bc\ue6df\uf83f\ue697\ue77f\ue717\ue735\ue71d\ue7fd\ue759\ue7a7\ue7d1\ue87e\ue8cf\ue837",
                                    58509
                                 )
                              );
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void II(int var1, IOO.IIIO var2) {
      IOol var3 = this.II();
      int var4 = 350 + var2.l1__ * 30;
      long var5 = 0L;

      for (int var7 = 0; var7 < this.II.length; var7++) {
         IOoI.III var8 = this.II[var7];
         if (!var8.IoOo && Math.abs(var8.I1 - var3.I1) <= var4 && Math.abs(var8.I1I - var3.I1I) <= var4) {
            var5 += var8.llIl;
         }
      }

      long var13 = var5 * 10L / 100L + var3.Il1I() * 10L;
      var13 += var13 * (this.IIl0.nextInt(11) - 5) / 100L;
      int var9 = (int)Math.max(1L, Math.min(2147483647L, var13));
      IOoI.III var10 = this.II[var1];

      for (int var11 = 0; var11 < this.II.length; var11++) {
         IOoI.III var12 = this.II[var11];
         if (!var12.IoOo && (var11 == var1 || Math.abs(var12.I1 - var10.I1) <= var4 && Math.abs(var12.I1I - var10.I1I) <= var4)) {
            this._lI0 = var9;
            this.IIIl(var11, var2);
         }
      }

      this._lI0 = 0;
   }

   private void II(IOO.IIIO var1) {
      IOol var2 = this.II();
      if (this.II(var1)) {
         int var3 = (var1.l1__ + 9) * 5;
         this.II1.II(new IO0o(-60).IIII(var2.I1l).II(var1.I1l).II(1).IIII(var2.I1l).II(0));
         var2.llIl = Math.min(var2.Illo(), var2.llIl + (int)((long)var2.Illo() * var3 / 100L));
         var2._loI = Math.min(var2.Il1(), var2._loI + (int)((long)var2.Il1() * var3 / 100L));
         this.l1O0();
      }
   }

   private void III(IOO.IIIO var1) {
      IOol var2 = this.II();
      this.l1Io();
      int var3 = Math.max(1, Math.min(8, var1.l1__));
      int var4 = new int[]{8, 11, 32, 25, 43, 49, 50, 96}[var3 - 1];
      this._I01 = (int)((long)var2.Illo() * new int[]{30, 40, 50, 60, 70, 80, 90, 100}[var3 - 1] / 100L);
      this.IoO0 = true;
      long var5 = System.currentTimeMillis();
      this.I_O_ = var5 + (var3 + 5) * 20000L;
      this.I_OO = var5 + 2500L;
      this.II1.II(new IO0o(-95).II(0).IIII(var2.I1l).III(var4).IIII(this._I01));
   }

   private void l1Io() {
      if (this.IoO0) {
         this.IoO0 = false;
         this.II1.II(new IO0o(-95).II(6).IIII(this.II().I1l));
         this.II1.II(new IO0o(-95).II(7).IIII(this.II().I1l));
      }
   }

   private void IIlI(long var1) {
      if (this.IoO0) {
         if (var1 >= this.I_O_) {
            this.l1Io();
         } else if (var1 >= this.I_OO) {
            this.I_OO = var1 + 2500L;
            IOol var3 = this.II();
            int var4 = -1;
            int var5 = 1073741824;

            for (int var6 = 0; var6 < this.II.length; var6++) {
               IOoI.III var7 = this.II[var6];
               if (!var7.IoOo && var7.l0o1 != 0) {
                  int var8 = Math.abs(var7.I1 - var3.I1) + Math.abs(var7.I1I - var3.I1I) * 2;
                  if (Math.abs(var7.I1 - var3.I1) <= 300 && Math.abs(var7.I1I - var3.I1I) <= 160 && var8 < var5) {
                     var5 = var8;
                     var4 = var6;
                  }
               }
            }

            if (var4 >= 0) {
               this.II1.II(new IO0o(-95).II(1).IIII(var3.I1l).II(var4));
               this._lI0 = Math.max(1, var3.Il1I());
               if (var3.II(IOol.I_0) == 5) {
                  this._lI0 = (int)Math.min(2147483647L, this._lI0 * 4L);
               }

               this.IIIl(var4, null);
               this._lI0 = 0;
            }
         }
      }
   }

   private IOO.IIIO III(int var1) {
      IOol var2 = this.II();

      for (int var3 = 0; var3 < var2.I__l.length; var3++) {
         IOO.IIIO var4 = IOO.II(var2.I__l[var3]);
         if (var4 != null && var4.lO0I == var1) {
            return var4;
         }
      }

      return null;
   }

   private void II(IOO.IIIO var1, long var2) {
      if (var1 != null) {
         IOol var4 = this.II();
         int var5 = var1.lO0I;
         int var6 = 0;
         int var7 = var4._lo0;
         switch (var5) {
            case 3:
               if (var7 == 9) {
                  var6 = var4._loo;
               }

               int var8 = var4.II(IOol.I_O0);
               var6 += var8 == 5 ? 50 : (var8 == 4 ? 20 : 0);
            case 4:
            case 5:
            case 8:
            case 9:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            default:
               break;
            case 6:
               if (var7 == 3) {
                  var6 = var4._loo;
               }
               break;
            case 7:
               if (var7 == 10) {
                  var6 = var4._loo;
               }
               break;
            case 10:
               if (var7 == 4) {
                  var6 = var4._loo;
               }
               break;
            case 11:
               if (var7 == 11) {
                  var6 = var4._loo;
               }
               break;
            case 12:
               if (var7 == 12) {
                  var6 = var4._loo;
               }
               break;
            case 14:
               if (var7 == 19) {
                  var6 = var4._loo;
               }
               break;
            case 19:
               if (var7 == 5 || var7 == 15 || var7 == 20) {
                  var6 = var4._loo;
               }
               break;
            case 21:
               if (var7 == 21) {
                  var6 = var4._loo;
               }
         }

         if (var6 > 0 && var6 <= 100) {
            long var10 = (long)var1.loIl * (100 - var6) / 100L;
            this.IIll[var5 & 31] = var2 - var1.loIl + var10;
            this.IIl1[var5 & 31] = var2 + var10;
         }
      }
   }

   private boolean II(IOO.IIIO var1) {
      IOol var2 = this.II();
      long var3 = System.currentTimeMillis();
      if (var3 - this.IIll[var1.lO0I & 31] < var1.loIl - 400) {
         return false;
      }

      int var5 = var1.loII == 0 ? var1.loI : (var1.loII == 1 ? Math.max(1, var2.Il1() * var1.loI / 100) : var2._loI);
      if (var5 > var2._loI) {
         this.IIoI(
            I1O1(
               "\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456ﮁ\ue5a5\ue5ef\ue58a\ue5c2\ue710\uf8e3\ue61f\ue62d\uf890\ue6bc\ue6df\uf83f\ue697\ue77f\ue717\ue735\ue71d\ue7fd\ue759\ue7a7\ue7d1\ue87e\ue8cf\ue837",
               58509
            )
         );
         return false;
      }

      this.IIll[var1.lO0I & 31] = var3;
      this.II(var1, var3);
      if (var5 > 0) {
         var2._loI -= var5;
         this.II1.II(new IO0o(-30).II(6).IIII(var2._loI));
      }

      return true;
   }

   private void IIO1(int var1, int var2) {
      int var3 = this.II().I1l;
      this.II1.II(new IO0o(-124).II(var1).II(0).II(var2).IIII(var3).IIII(var3));
   }

   synchronized void II1(DataInputStream var1) throws IOException {
      IOol var2 = this.II();
      if (var2 != null && var2.llIl > 0 && !this.II1.II.Ilo1()) {
         byte var3 = var1.readByte();
         long var4 = System.currentTimeMillis();
         switch (var3) {
            case 0:
               IOO.IIIO var19 = this.III(6);
               if (var19 == null || !this.II(var19)) {
                  return;
               }

               this.l11I();
               int var20 = 120 + var19.l1__ * 30;
               int var21 = var19.l1__ + 2;
               if (var2.II(IOol.I_0I) >= 5) {
                  var21 *= 2;
               }

               Vector var9 = new Vector();
               Vector var10 = new Vector();

               for (int var11 = 0; var11 < this.II.length; var11++) {
                  IOoI.III var12 = this.II[var11];
                  if (!var12.IoOo) {
                     if (var12.III != null) {
                        if (this.II.III(var12.III) && Math.abs(var12.III.I1 - var2.I1) <= var20 && Math.abs(var12.III.I1I - var2.I1I) <= var20) {
                           var10.addElement(var12.III);
                        }
                     } else if (Math.abs(var12.I1 - var2.I1) <= var20 && Math.abs(var12.I1I - var2.I1I) <= var20) {
                        var12.I110 = var4 + var21 * 1000L;
                        var9.addElement(var12);
                     }
                  }
               }

               IO0o var22 = new IO0o(-45).II(0).IIII(var2.I1l).III(var19.I1l).II(var9.size());

               for (int var23 = 0; var23 < var9.size(); var23++) {
                  var22.II(((IOoI.III)var9.elementAt(var23))._l_1).II(var21);
               }

               var22.II(var10.size());

               for (int var24 = 0; var24 < var10.size(); var24++) {
                  var22.IIII(((IO_I.III)var10.elementAt(var24)).I1l).II(var21);
                  this.II.II((IO_I.III)var10.elementAt(var24), var21 * 1000, 40);
               }

               this.II1.II(var22);
               break;
            case 1:
               IOO.IIIO var18 = this.III(8);
               if (var18 == null || this.IoOO) {
                  return;
               }

               this.IoOO = true;
               this._Io = 0;
               this.I_0O = var4 + 1000L;
               this.II1.II(new IO0o(-45).II(1).IIII(var2.I1l).III(var18.I1l));
            case 2:
            case 5:
            default:
               break;
            case 3:
               this.l11I();
               break;
            case 4:
               IOO.IIIO var17 = this.II();
               if (var17 == null || var17.lO0I != 10 && var17.lO0I != 11) {
                  return;
               }

               if (var4 - this.IIll[var17.lO0I & 31] < var17.loIl - 400) {
                  return;
               }

               int var7 = var17.loII == 0 ? var17.loI : (var17.loII == 1 ? Math.max(1, var2.Il1() * var17.loI / 100) : 1);
               if (var2._loI < var7) {
                  return;
               }

               this.l11I();
               int var8 = var17.lO0I == 10 ? 4000 : 3000;
               this._Ioo = var17.lO0I;
               this.I_oo = var4;
               this._l = -1;
               System.out
                  .println(
                     I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1", 58509)
                        + var17.lO0I
                        + I1O1(
                           "\ue4ad\ue4ce\ue4aa\ue49e\ue529\ue54c\ue526\ue513\ue5a5\ue5d0\ue5b6\ue5c2\ue629\ue647\ue650\ue637\ue65d\ue6b1\ue68f\ue6ef\ue6d9\ue76b\ue743\ue737\ue701\ue7e1\ue7c0\ue7f2\ue7c5\ue839",
                           58509
                        )
                  );
               this.II1.II(new IO0o(-45).II(4).IIII(var2.I1l).III(var17.I1l).III(var8));
               break;
            case 6:
               IOO.IIIO var16 = this.III(13);
               if (var16 == null || var2._lo_ > 0 || this.I_00 > 0L) {
                  return;
               }

               if (!this.II(var16)) {
                  return;
               }

               this.l11I();
               this.II1.II(new IO0o(-45).II(6).IIII(var2.I1l).III(var16.I1l));
               this.I_00 = var4 + 1500L;
               break;
            case 7:
               IOO.IIIO var15 = this.III(14);
               if (var15 == null) {
                  return;
               }

               if (this.IO != 0L && var4 - this.IO <= 8000L) {
                  if (var4 - this.IO < 1500L) {
                     return;
                  }

                  this.IO = 0L;
                  this.III = null;
                  this.IIll[14] = var4;
                  this.II(var15, var4);
                  this.IIII(var15);
                  break;
               }

               if (var4 - this.IIll[14] < var15.loIl - 400) {
                  return;
               }

               this.IO = var4;
               this.III = var15;
               this.l11I();
               this.II1.II(new IO0o(-45).II(7).IIII(var2.I1l).III(var15.I1l).III(2000));
               return;
            case 8:
               IOO.IIIO var14 = this.III(12);
               if (var14 == null || !this.II(var14)) {
                  return;
               }

               this.l11I();
               this.III(var14);
               break;
            case 9:
               IOO.IIIO var13 = this.III(19);
               if (var13 == null || !this.II(var13)) {
                  return;
               }

               this.l11I();
               var2.Ioo0 = true;
               this.I_O1 = var4 + (var13.l1__ + 2) * 5000L;
               this.IIO1(1, 33);
               this.IIol(
                  I1O1(
                     "\ue4c6\ue4c4\ue4a2\ue400\ue567\ue508\ue529\ue465\ue5eb\ue5c3\ue5e3\ue58e\ue7b1\uf8c3\ue651\ue639\ue65d\ue78d\ue658\ue6fa\ue69b例\ue743",
                     58509
                  )
               );
               break;
            case 10:
               IOO.IIIO var6 = this.III(21);
               if (var6 == null || !this.II(var6)) {
                  return;
               }

               this.l11I();
               var2._loO = (var6.l1__ + 3) * 10;
               this.I_0o = var4 + 30000L;
               var2.llIl = Math.min(var2.Illo(), var2.llIl + var2.llIl * var2._loO / 100);
               this.IIO1(1, 39);
               this.II1.ll_0();
               this.l1O0();
         }
      }
   }

   private void l11I() {
      if (this.IoOO) {
         this.IoOO = false;
         this.II1.II(new IO0o(-45).II(3).IIII(this.II().I1l).III(-1));
      }
   }

   private void IIlo(long var1) {
      IOol var3 = this.II();
      if (this.IoOO && var1 >= this.I_0O) {
         this.I_0O = var1 + 1000L;
         IOO.IIIO var4 = this.III(8);
         int var5 = var4 == null ? 4 : var4.l1__ + 3;
         int var6 = var3.Illo();
         int var7 = var3.Il1();
         if (var3.llIl >= var6 && var3._loI >= var7) {
            this.l11I();
         } else {
            var3.llIl = Math.min(var6, var3.llIl + var6 / 100 * var5);
            var3._loI = Math.min(var7, var3._loI + var7 / 100 * var5);
            this.II1.II(new IO0o(-30).II(5).IIII(var3.llIl));
            this.II1.II(new IO0o(-30).II(6).IIII(var3._loI));
            if (++this._Io >= 10) {
               this.l11I();
            }
         }
      }

      if (this.I_00 > 0L && var1 >= this.I_00) {
         this.I_00 = 0L;
         IOO.IIIO var8 = this.III(13);
         int var9 = var8 == null ? 1 : var8.l1__;
         var3._lo_ = var9;
         this.I_Ol = var1 + (var9 + 5) * 10000L * (var3.II(IOol.I_0l) >= 5 ? 5 : 1);
         if (var8 != null) {
            this.II1.II(new IO0o(-45).II(6).IIII(var3.I1l).III(var8.I1l));
         }

         var3.llIl = Math.min(var3.Illo(), var3.llIl * 2);
         this.II1.ll__();
         this.II1.ll_0();
         this.l1O0();
      }

      if (var3._lo_ > 0 && var1 >= this.I_Ol) {
         var3._lo_ = 0;
         if (var3.llIl > var3.Illo()) {
            var3.llIl = var3.Illo();
         }

         this.II1.II(new IO0o(-90).II(-1).IIII(var3.I1l));
         this.II1.ll__();
         this.II1.ll_0();
         this.l1O0();
      }

      if (var3.Ioo0 && var1 >= this.I_O1) {
         var3.Ioo0 = false;
         this.IIO1(0, 33);
         this.IIol(
            I1O1("\ue4c6\ue4c4\ue4a2\ue400\ue567\ue508\ue529\ue465\ue5eb\ue5c3\ue5e3\ue58e\ue7b1\uf8c3\ue651\ue639\ue65d\ue78d\ue658\ue6fa\ue691獵\ue743", 58509)
         );
      }

      if (var3._loO > 0 && var1 >= this.I_0o) {
         var3._loO = 0;
         this.IIO1(0, 39);
         if (var3.llIl > var3.Illo()) {
            var3.llIl = var3.Illo();
         }

         this.II1.ll_0();
         this.l1O0();
      }
   }

   private void III(int var1, IOO.IIIO var2) {
      IOol var3 = this.II();
      IOoI.III var4 = this.II[var1];
      if (!var4.IoOo) {
         int var5 = var4.III != null ? var4.III.I1 : var4.I1;
         int var6 = var4.III != null ? var4.III.I1I : var4.I1I;
         var3.I1 = var5;
         var3.I1I = var6;
         this.II1.II(new IO0o(123).IIII(var3.I1l).III(var5).III(var6).II(1));
         this.Io0O = true;

         try {
            this.IIIl(var1, var2);
         } finally {
            this.Io0O = false;
         }
      }
   }

   private static boolean IIoI(int var0) {
      return var0 == 18 || var0 == 20 || var0 == 22 || var0 == 23;
   }

   private void IIII(int var1, IOO.IIIO var2) {
      IOoI.III var3 = this.II[var1];
      if (!var3.IoOo) {
         if (var3.III != null) {
            this.III(var3.III, var2);
         } else {
            long var4 = System.currentTimeMillis();
            if (var2.lO0I == 18) {
               var3.I110 = var4 + 30000L;
               var3.IO_ = var4 + 30000L;
               this.II1.II(new IO0o(-112).II(1).II(var3._l_1).III(4133));
               if (this.II()._lo0 == 14) {
                  this.II()._11O = this.II()._loo;
               }
            } else {
               int var6;
               byte var7;
               if (var2.lO0I == 23) {
                  var6 = var2.l1__ * 5000;
                  var7 = 32;
               } else if (var2.lO0I == 22) {
                  var6 = (var2.l1__ + 4) * 1000;
                  var7 = 41;
               } else {
                  var6 = (var2.l1__ + 1) * 500;
                  var7 = 40;
               }

               var3.I110 = var4 + var6;
               var3.I11o = var4 + var6;
               var3.lO_1 = var7;
               this.II1.II(new IO0o(-124).II(1).II(1).II(var7).II(var3._l_1).IIII(this.II().I1l));
               IOol var8 = this.II();
               int var9 = var2.lO0I == 20 ? 6 : (var2.lO0I == 22 ? 7 : 22);
               if (var8._lo0 == var9) {
                  var8._11O = var8._loo;
               }
            }
         }
      }
   }

   private void III(IO_I.III var1, IOO.IIIO var2) {
      if (this.II.III(var1)) {
         int var3;
         byte var4;
         if (var2.lO0I == 18) {
            var3 = 30000;
            var4 = -1;
         } else if (var2.lO0I == 23) {
            var3 = var2.l1__ * 5000;
            var4 = 32;
            if (var1.II.lIlI.equals(I1O1("\ue4cf\ue4ed\ue489\ue4b3", 58509))) {
               var3 = 5000;
            }
         } else if (var2.lO0I == 22) {
            var3 = (var2.l1__ + 4) * 1000;
            var4 = 41;
         } else {
            var3 = (var2.l1__ + 1) * 500;
            var4 = 40;
         }

         this.II.II(var1, var3, var4);
         IOol var5 = this.II();
         int var6 = var2.lO0I == 18 ? 14 : (var2.lO0I == 20 ? 6 : (var2.lO0I == 22 ? 7 : 22));
         if (var5._lo0 == var6) {
            var5._11O = var5._loo;
         }
      }
   }

   void II00(String var1) {
      this.II1.II(new IO0o(93).II(var1));
   }

   private void II(IOoI.III var1, int var2, boolean var3, IOO.IIIO var4) {
      int var5 = this.II.II(var1.III, var2, var3, var4);
      if (var5 > 0) {
         this.II(var5, false, var1.III.I1, var1.III.I1I);
      }

      var1.IoOo = !this.II.III(var1.III);
   }

   IOoI.III II(IO_I.III var1) {
      IOoI.III var2 = new IOoI.III();
      var2._l_1 = this.II.length;
      var2.III = var1;
      var2.l0o1 = 0;
      var2.lOlO = var2._l__ = var2.llIl = 1;
      var2.I1 = var1.I1;
      var2.I1I = var1.I1I;
      IOoI.III[] var3 = new IOoI.III[this.II.length + 1];
      System.arraycopy(this.II, 0, var3, 0, this.II.length);
      var3[var2._l_1] = var2;
      this.II = var3;
      return var2;
   }

   boolean II(IO_I.III var1, IOO.IIIO var2, int var3) {
      IOol var4 = this.II();
      if (var4.llIl <= 0) {
         return false;
      }

      this.IOI0 = System.currentTimeMillis();
      if (var4.IOOo > this.IOI0 && this.IOI0 - this.IOIl > 5000L) {
         this.Io00 = true;
      }

      int var5 = var3;
      if (System.currentTimeMillis() < var1.I1_I) {
         var5 -= var5 * var1.lO__ / 100;
      }

      boolean var6 = var2 != null && (var2.lO0I == 1 || var2.lO0I == 3 || var2.lO0I == 5) && var4.IIo(3) > 0;
      if (var6) {
         int var7 = (int)Math.min(2000000000L, (long)var3 * var4.IIo(3) / 100L);
         if (var7 > 0 && var4._loI < var4.Il1()) {
            var4._loI = Math.min(var4.Il1(), var4._loI + var7);
            this.II1.II(new IO0o(-30).II(6).IIII(var4._loI));
         }

         var5 = 0;
      }

      int var12 = this.IIl0.nextInt(100) < var4.Il10() ? 1 : 0;
      if (var12 != 0) {
         var5 = 0;
      } else {
         var5 -= var5 / 100 * var4.Il1O();
         var5 -= var4.Il1_();
         if (var5 < 1) {
            var5 = 1;
         }

         if (var4.IlI0(215)) {
            var5 /= 2;
         }

         if (var4.IlIo(6)) {
            var5 /= 2;
         }

         if (var4.IlIo(7)) {
            var5 = var5 / 100 * 40;
         }

         if (var5 < 1) {
            var5 = 1;
         }

         if (var4.Ioo0) {
            var5 = 1;
         }
      }

      if (var6) {
         var5 = 0;
      }

      if (this.Io01) {
         var5 = 0;
      }

      if (var4.IlI0(217) && var5 >= var4.llIl) {
         var5 = Math.max(0, var4.llIl - 1);
      }

      var4.llIl -= var5;
      this.l11I();
      boolean var8 = var4.llIl <= 0;
      if (var8) {
         var4.llIl = 0;
      }

      this.II1.II(new IO0o(-60).IIII(var1.I1l).II(var2.I1l & 0xFF).II(1).IIII(var4.I1l).II(1).II(0).IIII(var5).II(var8).II(false));
      this.II1.II(new IO0o(-30).II(5).IIII(var4.llIl));
      int var9 = var4.Il1o();
      if (var9 > 0 && var3 > 0) {
         this.II.III(var1, PSTPatch.boss(var3, var5, var12, var9));
      }

      if (var5 > 0 && !var8) {
         this.II1.II.II__(var1);
      }

      if (var8) {
         this.l1lO();
         return true;
      } else {
         return false;
      }
   }

   boolean Il0() {
      IOol var1 = this.II();

      for (int var2 = 0; var2 < this.II.length; var2++) {
         if (this.II[var2].l0o1 == 77 && !this.II[var2].IoOo) {
            return false;
         }
      }

      IOoI.III var4 = new IOoI.III();
      var4._l_1 = this.II.length;
      var4.l0o1 = 77;
      var4.lOl_ = 1;
      var4.lOlO = var4._l__ = var4.llIl = 2000000000;
      var4.I1 = var1.I1 + this.IIl0.nextInt(61) - 30;
      var4.I1I = var1.I1I;
      var4.II = IOO.II(77);
      var4._l_O = 19999999;
      IOoI.III[] var3 = new IOoI.III[this.II.length + 1];
      System.arraycopy(this.II, 0, var3, 0, this.II.length);
      var3[var4._l_1] = var4;
      this.II = var3;
      this.II1.II(new IO0o(-13).II(255).III(var4._l_1).II(77).II(1).III(var4.I1).III(var4.I1I).IIII(var4.llIl).IIII(var4.lOlO));
      return true;
   }

   private void l11l() {
      IOol var1 = this.II();
      if (this._IoI >= 165) {
         int var2 = var1.IOOO > System.currentTimeMillis() ? 2 : 1;
         if (this.II1I(var2, 555)) {
            for (int var3 = 0; var3 < var1.III.length; var3++) {
               IO0l var4 = var1.III[var3];
               if (var4 != null && !var4.II1_() && var4.I1l == 1795) {
                  int[] var5 = null;

                  for (int var6 = 0; var6 < var4.IIl.size(); var6++) {
                     int[] var7 = (int[])var4.IIl.elementAt(var6);
                     if (var7[0] == 250) {
                        var5 = var7;
                        break;
                     }
                  }

                  if (var5 == null) {
                     var4.III(250, 1);
                  } else {
                     var5[1]++;
                  }

                  int var8 = var5 == null ? 1 : var5[1];
                  if (var8 == 3000) {
                     this.IIol(
                        I1O1(
                           "\ue4cf\ue440\ue4a5\ue482\ue529\ue540ﯦ\ue512\ue5a5\ue5ca\ue4c0\ue58c\ue666\ue600\ue653\ue7ee\uf89e\ue6f2\ue6dc\ue6fa\ue7e8\ue7fb\ue717\ue73e\ue78f\ue7e0\ue793\ue6c3烙\ue830\ue81c\ue87e\ue85d\ue8bc\ue88b\ue8a4\ue9ea\ue966\ue940\ue966\ue909\ue834\uf740\ue9ac\ue986\uea20\uea54\uea57\uea31\uea15\ueae8\uea9b",
                           58509
                        )
                     );
                  }

                  this.l1_l();
                  return;
               }
            }
         }
      }
   }

   void l111() {
      IOol var1 = this.II();
      if (var1.lOoO < 5) {
         this.IIol(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue5a0\ue511\ue621\ue731\uf8d8\ue67e\ue613\ue6fb\uf876\ue6b9\ue6d8", 58509));
      } else {
         var1.lOoO -= 5;
         long var2 = System.currentTimeMillis();
         long var4 = var1.IOOO > var2 ? var1.IOOO - var2 : 0L;
         long var6 = Math.min(var4 + 600000L, 3600000L);
         var1.IOOO = var2 + var6;
         this.l1_();
         this.II1.II(new IO0o(-106).III(15359).III((int)(var6 / 1000L)));
         this.II1.I__O();
      }
   }

   private int II(int var1, IOoI.III var2) {
      int var3 = Math.max(1, var2.llIl / 100);
      return this.IIl0.nextInt(100) < 2 ? Math.max(var1, var3) : var3;
   }

   private IOoI.III IIII() {
      for (int var1 = 0; var1 < this.II.length; var1++) {
         if (this.II[var1].l0o1 == 70) {
            return this.II[var1];
         }
      }

      return null;
   }

   private void II1(long var1) {
      if (this.IOI != 0L) {
         if (this._lI >= 3) {
            if (var1 - this.IOI > 15000L) {
               this._lI = 0;
               this.IOI = 0L;
               this._lII = 40000000;
               this._lIl = 0;
               this._lI1 = 100 + this.IIl0.nextInt(801);
               this._lI_ = 360;
            }
         } else if (var1 - this.IOI > 5000L) {
            if (this._lI < 2) {
               this._lI++;
               this.IOI = 0L;
               this._lII = 40000000;
               this._lIl = 0;
            } else {
               this._lI = 3;
            }
         }
      }
   }

   synchronized int[] III1() {
      this.II1(System.currentTimeMillis());
      int var1 = Math.min(this._lI, 2);
      int var2 = this._lI < 3 && this.IOI == 0L ? (this._lII > 0 ? this._lII : 40000000) : 0;
      return new int[]{var1, var2, this._lI1, this._lI_};
   }

   private void l11_() {
      IOoI.III var1 = this.IIII();
      if (var1 != null) {
         var1.I1 = this._lI1;
         var1.I1I = this._lI_;
         var1.lOlO = var1._l__ = 40000000;
         if (this._lI < 3 && this.IOI == 0L) {
            var1.llIl = this._lII > 0 ? this._lII : 40000000;
         } else {
            var1.IoOo = true;
            var1.llIl = 0;
            var1.IO1o = Long.MAX_VALUE;
            if (this._lI >= 3) {
               this.II1.II(new IO0o(101).II(9));
            }
         }
      }
   }

   private void II1I(long var1) {
      IOoI.III var3 = this.IIII();
      if (var3 != null) {
         if (!var3.IoOo) {
            this._lII = var3.llIl;
         }

         if (this.IOI != 0L) {
            if (this._lI < 3) {
               if (var1 - this.IOI > 5000L) {
                  this.II(var3);
               }
            } else if (var1 - this.IOI > 15000L && this.IIlo.size() == 0) {
               this._lI = 0;
               this.IOI = 0L;
               this._lII = 40000000;
               this._lIl = 0;
               this._lI1 = 100 + this.IIl0.nextInt(801);
               this._lI_ = 360;
               IOol var4 = this.II();
               this.II1.III_(var4.lOlo, var4.I1, var4.I1I);
            }
         }
      }
   }

   private void II(IOoI.III var1) {
      int var2 = this._lI1;
      int var3 = this._lI_;

      for (int var4 = 0; var4 < 30; var4++) {
         int var5 = var4 % 2 == 0 ? -5 * (var4 / 2 % 11) : 5 * (1 + var4 / 2 % 10);
         this.II(190, 32000, var2 + var5, var3, null);
      }

      if (this.II1I(20, 100)) {
         this.II(568, 1, var2, var3, null);
      }

      if (this.II().III != null && this.II()._10l == 1 && this.II1I(20, 100)) {
         Vector var6 = new Vector();
         var6.addElement(new int[]{250, 0});
         this.II(1795, 1, var2, var3, var6);
      }

      if (this.II1I(1, 40)) {
         this.IIO_(var2, var3);
      }

      if (this._lI < 2) {
         this._lI++;
         this.IOI = 0L;
         this._lII = 40000000;
         this._lIl = 0;
         var1.IoOo = false;
         var1.Ioo_ = false;
         var1.llIl = var1.lOlO = var1._l__ = 40000000;
         var1.I1 = var2;
         var1.I1I = var3;
         this.II1.II(new IO0o(101).II(this._lI == 1 ? 6 : 5).III(var2).III(var3));
         this.II1.II(new IO0o(-9).II(var1._l_1).IIII(var1.llIl).IIII(1).II(false).II(-1));
      } else {
         this._lI = 3;
         this.II1.II(new IO0o(101).II(9));
      }
   }

   private boolean II(IOoI.III var1, long var2) {
      if (this.IOI == 0L && this._lI < 3) {
         if (var2 - this.IOII < 3000L) {
            return false;
         }

         this.IOII = var2;
         IOol var4 = this.II();
         int[] var5 = this._lI >= 2 ? new int[]{1, 2} : new int[]{1, 2, 3, 7};
         int var6 = this._lIl == 7 ? 0 : var5[this.IIl0.nextInt(var5.length)];
         this._lIl = var6;
         if (var6 == 3) {
            var1.I1 = this._lI1 = var4.I1;
            this.II1.II(new IO0o(101).II(3).III(var1.I1).III(var1.I1I));
            return false;
         }

         if (var6 == 7) {
            this.II1.II(new IO0o(101).II(7));
            return false;
         }

         if (var6 == 1) {
            var1.I1 = this._lI1 = var4.I1;
            this.II1.II(new IO0o(101).II(8).III(var1.I1).III(var1.I1I));
         }

         long var7 = (long)var1._l__ * ((var1.II == null ? 5 : var1.II.l0o) + this.IIl0.nextInt(3) - 1) / 100L;
         int var9 = (int)Math.min(var7, 2000000000L);
         if (var2 < this.I_01) {
            var9 -= var9 / 5;
         }

         if (var4.IlI0(215)) {
            var9 /= 2;
         }

         if (this.IIl0.nextInt(100) < var4.Il10()) {
            var9 = 0;
         } else {
            var9 -= var9 / 100 * var4.Il1O();
            var9 -= var4.Il1_();
            if (var9 < 1) {
               var9 = 1;
            }

            if (var4.IlIo(6)) {
               var9 /= 2;
            }

            if (var4.IlIo(7)) {
               var9 = var9 / 100 * 40;
            }

            if (var9 < 1) {
               var9 = 1;
            }

            if (var4.Ioo0) {
               var9 = 1;
            }

            if (var9 > var4.Illo() * 35 / 100) {
               var9 = Math.max(1, var4.Illo() * 35 / 100);
            }
         }

         if (this.Io01) {
            var9 = 0;
         }

         if (var4.IlI0(217) && var9 >= var4.llIl) {
            var9 = Math.max(0, var4.llIl - 1);
         }

         var4.llIl -= var9;
         this.l11I();
         this.II1.II(new IO0o(101).II(var6).II(1).IIII(var4.I1l).IIII(var9));
         this.II1.II(new IO0o(-30).II(5).IIII(Math.max(0, var4.llIl)));
         if (var4.llIl <= 0) {
            var4.llIl = 0;
            this.l1lO();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean III(IOoI.III var1, long var2) {
      if (var2 - var1.IO10 < 1000L) {
         return false;
      }

      var1.IO10 = var2;
      IOol var4 = this.II();
      if (var4.I1 > 440 && var4.I1 < 950) {
         double var5 = var4.I1 - var1.I1;
         double var7 = var4.I1I - var1.I1I;
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         if (var9 >= 500.0) {
            return false;
         } else if (var9 > 200.0) {
            var1.I1 = var4.I1;
            this.II1.II(new IO0o(102).II(5).III(var1.I1));
            return false;
         } else {
            return this.II(var1, var9 <= 100.0 ? 3 : 4);
         }
      } else {
         return false;
      }
   }

   private boolean IIII(IOoI.III var1, long var2) {
      if (var2 - var1.IO10 < 1000L) {
         return false;
      }

      var1.IO10 = var2;
      IOol var4 = this.II();
      double var5 = var4.I1 - var1.I1;
      double var7 = var4.I1I - var1.I1I;
      double var9 = Math.sqrt(var5 * var5 + var7 * var7);
      int var11 = var9 <= 100.0 ? 0 : (var9 <= 200.0 ? 1 : 2);
      var1.I1 = var4.I1;
      return this.II(var1, var11);
   }

   private boolean II(IOoI.III var1, int var2) {
      IOol var3 = this.II();
      int var4 = var1._l_O > 0 ? var1._l_O : (int)Math.min(2000000000L, (long)var1._l__ * (var1.II == null ? 5 : var1.II.l0o) / 100L);
      if (IIIl() < this.I_01) {
         var4 -= var4 / 5;
      }

      if (var3.IlI0(215)) {
         var4 /= 2;
      }

      if (this.IIl0.nextInt(100) < var3.Il10()) {
         var4 = 0;
      } else {
         var4 -= var4 / 100 * var3.Il1O();
         var4 -= var3.Il1_();
         if (var4 < 1) {
            var4 = 1;
         }

         if (var3.IlIo(6)) {
            var4 /= 2;
         }

         if (var3.IlIo(7)) {
            var4 = var4 / 100 * 40;
         }

         if (var4 < 1) {
            var4 = 1;
         }

         if (var3.Ioo0) {
            var4 = 1;
         }

         if (var4 > var3.Illo() * 35 / 100) {
            var4 = Math.max(1, var3.Illo() * 35 / 100);
         }
      }

      if (this.Io01) {
         var4 = 0;
      }

      if (var3.IlI0(217) && var4 >= var3.llIl) {
         var4 = Math.max(0, var3.llIl - 1);
      }

      var3.llIl -= var4;
      this.l11I();
      this.II1.II(new IO0o(102).II(var2).II(1).IIII(var3.I1l).IIII(var4));
      this.II1.II(new IO0o(-30).II(5).IIII(Math.max(0, var3.llIl)));
      if (var3.llIl <= 0) {
         var3.llIl = 0;
         this.l1lO();
         return true;
      } else {
         return false;
      }
   }

   private static long IIIl() {
      return System.currentTimeMillis();
   }

   int IlI() {
      return this.II1.II.II0o();
   }

   private boolean IIIl(IOoI.III var1, long var2) {
      IOol var4 = this.II();
      if (var2 - var1.I1l0 < 300L) {
         return false;
      }

      var1.I1l0 = var2;
      int var5 = 11 + this.IIl0.nextInt(5);
      double var6 = var4.I1 - var1.I1;
      double var8 = var4.I1I - var1.I1I;
      double var10 = Math.sqrt(var6 * var6 + var8 * var8);
      boolean var12 = var5 == 11 && var10 < 50.0 || var5 == 12 && var10 < 100.0 || (var5 == 13 || var5 == 14) && var10 < 150.0 || var5 == 15 && var10 < 200.0;
      if (!var12) {
         var1.I1 = var4.I1 + this.IIl0.nextInt(21) - 10;
         var1.I1I = var4.I1I;
         this.II1.II(new IO0o(102).II(10).II(var1._l_1).III(var1.I1).III(var1.I1I));
         return false;
      }

      int var13 = 19999999;
      if (this.IIl0.nextInt(100) < var4.Il10()) {
         var13 = 0;
      } else {
         var13 -= var13 / 100 * var4.Il1O();
         var13 -= var4.Il1_();
         if (var13 < 1) {
            var13 = 1;
         }

         if (var4.IlIo(6)) {
            var13 /= 2;
         }

         if (var4.IlIo(7)) {
            var13 = var13 / 100 * 40;
         }

         if (var4.Ioo0) {
            var13 = 1;
         }

         if (var13 > var4.Illo() * 35 / 100) {
            var13 = Math.max(1, var4.Illo() * 35 / 100);
         }
      }

      if (this.Io01) {
         var13 = 0;
      }

      if (var4.IlI0(217) && var13 >= var4.llIl) {
         var13 = Math.max(0, var4.llIl - 1);
      }

      var4.llIl -= var13;
      this.l11I();
      this.II1.II(new IO0o(102).II(var5).II(var1._l_1).II(1).IIII(var4.I1l).IIII(var13).II(var4.I1 < var1.I1 ? -1 : 1));
      this.II1.II(new IO0o(-30).II(5).IIII(Math.max(0, var4.llIl)));
      if (var4.llIl <= 0) {
         var4.llIl = 0;
         this.l1lO();
         return true;
      } else {
         return false;
      }
   }

   private void l11O() {
      IOol var1 = this.II();
      if (var1._lOO != 0) {
         var1._l0I += 50;
         var1._l0 += 50;
         this.IIol(
            I1O1(
               "\ue4cf嗀\ue4a5\ue4ca\ue567\ue540ﯪ\ue508\ue5a5\ue4b5\ue473ﬁ\ue662\ue600\ue60a\ue66e\ue65d\ue6df\ue6da\ue6aa\ue68a\ue76d\ue75b\ue733\ue755\ue7f6\ue7d2\ue7bc\ue796\ue830\ue847\uf697\ue804\ue8ac\ue8df\uf621\ue8c9\ue94f\uf782\ue933\ue945\ue9d0\ue813\uf719\ue98f\uea67\uea3f\uea7d\uebed\uf4a7\ueaeb\uea9b",
               58509
            )
         );
         this.II1.I__O();
      }
   }

   void II(int var1, int var2, int var3, long var4) {
      IOoI.II var6 = this.II(var1, 1, var2, var3);
      var6.IO1O = var4;
      this.II1.II(new IO0o(68).III(var6.I1l).III(var6.l0o1).III(var6.I1).III(var6.I1I).IIII(this.II().I1l));
   }

   void II(int var1, int var2, int var3, int var4, Vector var5) {
      IOoI.II var6 = this.II(var1, var2, var3, var4);
      if (var5 != null) {
         for (int var7 = 0; var7 < var5.size(); var7++) {
            var6.IIl.addElement(var5.elementAt(var7));
         }
      }

      this.II1.II(new IO0o(68).III(var6.I1l).III(var6.l0o1).III(var6.I1).III(var6.I1I).IIII(this.II().I1l));
   }

   void IIIo(String var1, int var2) {
      int var3 = var1.equals(I1O1("\ue4ce\ue4f9\ue486\ue4a8\ue54c\ue57a", 58509))
            || var1.equals(I1O1("\ue4de\ue4e3\ue482\ue4b5\ue541\ue56d\ue504\ue539\ue5d4\ue5f1\ue59a\ue5ac\ue630", 58509))
            || var1.equals(I1O1("\ue4c2\ue4f3\ue48f\ue4a5\ue538", 58509))
            || var1.equals(I1O1("\ue4cc\ue4e2\ue494\ue4be\ue55b\ue567\ue50a\ue539\ue5c9", 58509))
         ? 5
         : (
            !var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4db\ue556\ue566\ue50a", 58509))
                  && !var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4d8\ue556\ue566\ue50a", 58509))
                  && !var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4d9\ue556\ue566\ue50a", 58509))
                  && !var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4de\ue556\ue566\ue50a", 58509))
               ? (var1.startsWith(I1O1("\ue4d5\ue4e9\ue485\ue4b5\ue54a\ue567\ue509", 58509)) && this.IIl0.nextInt(100) < 80 ? 5 : 0)
               : 1
         );
      if (var3 > 0) {
         this.II()._1IO += var3;
         this.IIol(
            I1O1("\ue4c3\ue4c4辶\ue484\ue529\ue439\ue4f7ﮅ\ue5e6\ue584", 58509)
               + var3
               + I1O1("\ue4ad\ue5bd\ue4a2﨩\ue564\ue508\ue534ﮗ\ue5a5\ue5cf\ue5aaﬥ\ue66f", 58509)
         );
      }

      byte var4 = -1;
      int var5 = -1;
      if (var1.equals(I1O1("\ue4c6\ue4f9\ue480\ue4bf", 58509))) {
         var4 = 19;
         var5 = 0;
      } else if (var1.equals(I1O1("\ue4c0\ue4ed\ue49b\ue4b5\ue54d\ue569\ue512\ue539\ue5c1\ue5ed\ue58d\ue5aa", 58509))) {
         var4 = 19;
         var5 = 1;
      } else if (var1.equals(I1O1("\ue4df\ue4ed\ue486\ue4a8\ue546", 58509))) {
         var4 = 19;
         var5 = 2;
      } else if (var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4de", 58509))) {
         var4 = 20;
         var5 = 1;
      } else if (var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4d9", 58509))) {
         var4 = 20;
         var5 = 2;
      } else if (var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4d8", 58509))) {
         var4 = 20;
         var5 = 3;
      } else if (var1.equals(I1O1("\ue4de\ue4e3\ue494\ue4db", 58509))) {
         var4 = 20;
         var5 = 4;
      } else if (var1.equals(I1O1("\ue4d9\ue4e5\ue48e\ue4bf\ue556\ue56c\ue508\ue52f\ue5da\ue5f0\ue591\ue5b7\ue64e\ue66e\ue678", 58509))) {
         var4 = 20;
         var5 = 5;
      } else if (var1.equals(I1O1("\ue4cb\ue4e5\ue48f\ue4af", 58509))) {
         var4 = 21;
         var5 = 1 + var2;
      } else if (var1.equals(I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue59d", 58509))) {
         var4 = 23;
         var5 = 1;
      } else if (var1.equals(I1O1("\ue4c9\ue4fe\ue494\ue4a1\ue546\ue57a\ue502", 58509))) {
         var4 = 23;
         var5 = 2;
      } else if (var1.equals(I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue591", 58509))) {
         var4 = 24;
         var5 = 1;
      } else if (var1.equals(I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue590", 58509))) {
         var4 = 24;
         var5 = 2;
      } else if (var1.equals(I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue597", 58509))) {
         var4 = 24;
         var5 = 3;
      } else if (var1.equals(I1O1("\ue4dd\ue4e3\ue488", 58509))) {
         var4 = 25;
         var5 = 1;
      } else if (var1.equals(I1O1("\ue4dd\ue4e5\ue488", 58509))) {
         var4 = 25;
         var5 = 2;
      } else if (var1.equals(I1O1("\ue4c6\ue4e5\ue485\ue4ad\ue556\ue563\ue508\ue528\ue5c2", 58509))) {
         var4 = 25;
         var5 = 3;
      } else if (var1.equals(I1O1("\ue4d5\ue4e9\ue485\ue4b5\ue54b\ue567\ue518\ue52e\ue5d0\ue5ea\ue584", 58509))) {
         var4 = 26;
         var5 = 1 + var2;
      } else if (var1.equals(I1O1("\ue4de\ue4e5\ue48e\ue4bf\ue556\ue56a\ue508\ue539\ue5cd\ue5f1\ue58d\ue5a5", 58509)) && var2 == 1) {
         var4 = 27;
         var5 = 4;
      } else if (var1.startsWith(I1O1("\ue4d5\ue4e9\ue485\ue4b5\ue54a\ue567\ue509\ue539", 58509))) {
         var4 = 27;
         var5 = 3;
      } else if (var1.startsWith(I1O1("\ue4c9\ue4fe\ue48a\ue4a8\ue55c\ue57a\ue506", 58509))) {
         var4 = 28;
         var5 = 1;
      } else if (var1.startsWith(I1O1("\ue4cf\ue4f9\ue482\ue4b5\ue54b\ue57d\ue50e", 58509))) {
         var4 = 28;
         var5 = 2;
      } else if (var1.equals(I1O1("\ue4d4\ue4ed\ue494\ue4a9\ue546\ue566", 58509)) || var1.equals(I1O1("\ue4d4\ue4ed\ue488\ue4a5\ue547", 58509))) {
         var4 = 28;
         var5 = 4;
      } else if (var1.equals(I1O1("\ue4c0\ue4ed\ue489\ue4bf\ue556\ue519\ue575\ue52e", 58509))) {
         var4 = 28;
         var5 = 6;
      } else if (var1.equals(I1O1("\ue4cf\ue4e0\ue48a\ue4a9\ue542\ue577\ue500\ue529\ue5ce\ue5f1", 58509))) {
         var4 = 29;
         var5 = 0;
      }

      if (var4 >= 0) {
         IOol var6 = this.II();
         if (var6._lOI == var4 && var6._lOl == var5) {
            this.I1lo(1);
         }

         if (var4 == 28 && var6._lOI == 28 && var1.startsWith(I1O1("\ue4c9\ue4fe\ue48a\ue4a8\ue55c\ue57a\ue506", 58509)) && var6._lOl == 5) {
            this.I1lo(1);
         }

         if (var4 == 28 && var6._lOI == 28 && var1.startsWith(I1O1("\ue4cf\ue4f9\ue482\ue4b5\ue54b\ue57d\ue50e", 58509)) && var6._lOl == 3) {
            this.I1lo(1);
         }
      }
   }

   private void IIII(IOO.IIIO var1) {
      IOol var2 = this.II();
      int var3 = 400 + var1.l1__ * 30;
      if (var2.II(IOol.I_Oo) == 2) {
         var3 += 200;
      }

      long var4 = Math.max(1, var2.llIl) + (long)var2.Illo() * var2.II00(14) / 100L;
      this._lI0 = (int)Math.min(2147483647L, var4);
      this.Io0o = true;

      try {
         for (int var6 = 0; var6 < this.II.length; var6++) {
            IOoI.III var7 = this.II[var6];
            if (!var7.IoOo && Math.abs(var7.I1 - var2.I1) <= var3 && Math.abs(var7.I1I - var2.I1I) <= var3) {
               try {
                  this.IIIl(var6, var1);
               } catch (RuntimeException var18) {
                  var18.printStackTrace();
               }
            }
         }
      } finally {
         this.Io0o = false;
         this._lI0 = 0;
      }

      var2.llIl = 0;
      this.II1.II(new IO0o(-30).II(5).IIII(0));
      this.Io0_ = true;

      try {
         this.l1lO();
      } finally {
         this.Io0_ = false;
      }
   }

   private static boolean IIol(int var0) {
      switch (var0) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 9:
         case 10:
         case 11:
         case 14:
         case 17:
            return true;
         case 6:
         case 7:
         case 8:
         case 12:
         case 13:
         case 15:
         case 16:
         default:
            return false;
      }
   }

   void IIIl(int var1, IOO.IIIO var2) {
      if (var1 >= 0 && var1 < this.II.length) {
         IOoI.III var3 = this.II[var1];
         if (!var3.IoOo) {
            IOol var4 = this.II();
            if (var4.IlI0(217) && var4.llIl <= 1 && !this.Io01) {
               this.IIol(
                  I1O1(
                     "\ue4cf嗀\ue4a5\ue4ca\ue418\ue549\ue529\ue501\ue5a5\ue4b5\ue473ﬁ\ue662\ue600\ue65d\ue6a7\ue61c\ue6bc\ue6d9\uf87f\ue68d\ue738\ue743僚\ue755\ue7f6蘿\ue7bd\ue7d1\ue866\uf6e8\ue86e\ue806\ue8e4\ue85f\ue8a4\ue88e\ue928\ue953\ue92e\uf7a6\ue9a4\ue9d7\uf767\ue98f\uea20\uea7c\ueaca\uea33\uea1b\ueaba",
                     58509
                  )
               );
            } else {
               int var5 = var2 == null ? 100 : var2.lo + var4.II0o(var2.lO0I);
               int var6 = var4.Il1I() * var5 / 100;
               if (var3.l0o1 != 0) {
                  var6 = var4.IIoI(var6);
               }

               if (var2 != null) {
                  int var7 = var4._lo0;
                  int var8 = var2.lO0I;
                  boolean var9 = var7 == 1 && var8 == 0
                     || var7 == 2 && var8 == 1
                     || var7 == 8 && var8 == 2
                     || var7 == 9 && var8 == 3
                     || var7 == 13 && var8 == 17
                     || var7 == 16 && var8 == 4
                     || var7 == 17 && var8 == 5;
                  if (var9) {
                     var6 += var6 * var4._loo / 100;
                  }
               }

               if (var4._11O > 0) {
                  var6 += var6 * var4._11O / 100;
                  var4._11O = 0;
               }

               var6 += var6 * (this.IIl0.nextInt(21) - 10) / 100;
               var6 *= this.III(var2);
               boolean var13 = this.Io0O || this.IIl0.nextInt(100) < var4.Il1l();
               if (var13) {
                  var6 *= 2;
                  var6 += var6 * var4.Il11() / 100;
               }

               if (var2 != null) {
                  var6 += var6 * var4.II00(var2.lO0I) / 100;
               }

               if (var4.IlI0(214)) {
                  var6 += var6 * 150 / 100;
               }

               if (this._lI0 > 0) {
                  var6 = this._lI0;
               }

               if (var6 < 1) {
                  var6 = 1;
               }

               if (var3.III != null) {
                  if (this.Io0o) {
                     var6 = Math.max(1, var6 / 2);
                  }

                  this.II(var3, var6, var13, var2);
               } else if (var3.l0o1 == 117) {
                  this.II(var1, var3, var6, var13);
               } else {
                  if (var3.l0o1 == 77) {
                     var6 = Math.max(1, (int)(var6 * 0.05));
                  }

                  if (var3.l0o1 == 70) {
                     var6 = this.II(var6, var3);
                  }

                  if (var3.l0o1 == 0 && var6 > var3.lOlO / 10) {
                     var6 = Math.max(1, var3.lOlO / 10);
                  }

                  if (var3.IooO && !var4.IlI0(216)) {
                     var6 = Math.max(1, var3._l__ / 10);
                     var13 = false;
                  } else if (!this.Io0o && var3.llIl == var3.lOlO && var6 >= var3.llIl && var3.lOlO > 1) {
                     var6 = var3.llIl - 1;
                  }

                  if (var6 >= var3.llIl) {
                     var6 = var3.llIl;
                  }

                  var3.llIl -= var6;
                  this.II(var6, var3.l0o1 != 0, var3.I1, var3.I1I);
                  this.I_0_ = System.currentTimeMillis() + 1000L;
                  var3.Ioo_ = true;
                  var3.I1l0 = System.currentTimeMillis();
                  long var14 = this.II(var3, var6);
                  if (var3.llIl > 0) {
                     this.II1.II(new IO0o(-9).II(var1).IIII(var3.llIl).IIII(var6).II(var13).II(-1));
                     this.IIl0(var14);
                     if (var3.IooO && var4.llIl > 0 && !var4.IlI0(216)) {
                        this.II(var3);
                     }
                  } else {
                     this.II(var1, var3, var6, var13, var14, false);
                  }
               }
            }
         }
      }
   }

   private void II(int var1, IOoI.III var2, int var3, boolean var4, long var5, boolean var7) {
      IOol var8 = this.II();
      var2.IoOo = true;
      var8._1lo++;
      var2.IO1o = System.currentTimeMillis() + (var2.l0o1 == 0 ? 3000 : 6000);
      if (this.II1.II.Il1I() && IO_1.II_1(this._IoI)) {
         var2.IO1o = Long.MAX_VALUE;
         this.II1.II.II10(this._IoI, var2._l_1);
      }

      if (this.II1.II.Il1I() && this._IoI == 146) {
         var2.IO1o = Long.MAX_VALUE;
      }

      if (var2.l0o1 == 77) {
         var2.IO1o = Long.MAX_VALUE;
         this.l11O();
      }

      if (var2.l0o1 == 70) {
         var2.IO1o = Long.MAX_VALUE;
         this.IOI = System.currentTimeMillis();
      }

      if (var2.l0o1 == 71 || var2.l0o1 == 72) {
         var2.IO1o = Long.MAX_VALUE;
      }

      if (this.II1.II.IIO_(this._IoI)) {
         var2.IO1o = Long.MAX_VALUE;
         this.II1.II.II10(this._IoI, var2._l_1);
      }

      this.l11l();
      Vector var9 = this.II(var2);
      IO0o var10 = new IO0o(-12).II(var1).IIII(var3).II(var4).II(var9.size());

      for (int var11 = 0; var11 < var9.size(); var11++) {
         IOoI.II var12 = (IOoI.II)var9.elementAt(var11);
         var10.III(var12.I1l).III(var12.l0o1).III(var12.I1).III(var12.I1I).IIII(var8.I1l);
      }

      this.II1.II(var10);
      if (var2.l0o1 == 71) {
         this.II1.II(new IO0o(102).II(7));
      } else if (var2.l0o1 == 72) {
         this.II1.II(new IO0o(102).II(6));
      }

      if (var8.IlI0(219)) {
         for (int var13 = 0; var13 < var9.size(); var13++) {
            this.I1Il(((IOoI.II)var9.elementAt(var13)).I1l);
         }
      }

      if (var7) {
         this.II1.II.IIl0(var5);
      } else {
         this.IIl0(var5);
      }

      this.I11(var2.l0o1);
      this.II1.II.Il_l(var2.l0o1);
      this.II1.II.II(var2.l0o1, var2.II == null ? 0 : var2.II.IoI_, var2.IooO);
      if (this.Ioo) {
         this.Ioo = false;
         this.l101();
      }

      this.II1.I__O();
   }

   void II(int var1, int var2, boolean var3, IOol var4) {
      if (var1 >= 0 && var1 < this.II.length) {
         IOoI.III var5 = this.II[var1];
         if (!var5.IoOo && var5.III == null && var5.l0o1 != 117) {
            if (var2 < 1) {
               var2 = 1;
            }

            if (var5.l0o1 == 77) {
               var2 = Math.max(1, (int)(var2 * 0.05));
            }

            if (var5.l0o1 == 70) {
               var2 = this.II(var2, var5);
            }

            if (var5.l0o1 == 0 && var2 > var5.lOlO / 10) {
               var2 = Math.max(1, var5.lOlO / 10);
            }

            if (var5.IooO) {
               var2 = Math.max(1, var5._l__ / 10);
               var3 = false;
            } else if (var5.llIl == var5.lOlO && var2 >= var5.llIl && var5.lOlO > 1) {
               var2 = var5.llIl - 1;
            }

            if (var2 >= var5.llIl) {
               var2 = var5.llIl;
            }

            var5.llIl -= var2;
            this.II(var2, var5.l0o1 != 0, var1, var4, var5.I1, var5.I1I);
            var5.Ioo_ = true;
            var5.I1l0 = System.currentTimeMillis();
            long var6 = this.II(var4, var5, var2);
            if (var5.llIl > 0) {
               this.II1.II(new IO0o(-9).II(var1).IIII(var5.llIl).IIII(var2).II(var3).II(-1));
               this.II1.II.IIl0(var6);
            } else {
               this.II(var1, var5, var2, var3, var6, true);
            }
         }
      }
   }

   private void II(int var1, boolean var2, int var3, IOol var4, int var5, int var6) {
      int var7 = (int)((long)var1 * var4.II(var2) / 100L);
      int var8 = (int)((long)var1 * var4.Il_() / 100L);
      if (var7 > 0 || var8 > 0) {
         if (var7 > 0 && var4.llIl > 0) {
            var4.llIl = Math.min(var4.Illo(), var4.llIl + var7);
         }

         if (var8 > 0) {
            var4._loI = Math.min(var4.Il1(), var4._loI + var8);
         }

         this.II1.II(new IO0o(113).II(1).II(3).II(37).III(var5).III(var6).III(-1));
         this.II1.II(new IO0o(-10).II(var3).IIII(-this.II().I1l).IIII(var4.llIl).IIII(var4._loI));
      }
   }

   private void II(int var1, IOoI.III var2, int var3, boolean var4) {
      IOol var5 = this.II();
      var2.llIl = var2.lOlO;
      var2.I1l0 = System.currentTimeMillis();
      this.II1.II(new IO0o(-9).II(var1).IIII(var2.llIl).IIII(var3).II(var4).II(-1));
      long var6 = var5.IO_O / 10000000L;
      var5.IO_O += var3;
      long var8 = var5.IO_O / 10000000L;
      this.IIol(
         I1O1("\ue4c0\ue44d\ue4b2\ue4ca\ue418\ue547\ue567\ue515ﭬ\ue5c7\ue5e3\ue58f\uf8a0\ue64e\ue657\ue67e\ue613\ue6f4\uf816\ue6b4\ue6d9", 58509)
            + var3
            + I1O1("\ue4ad\ue4df\ue42a\ue49e\ue529\ue55c\ue52f\ue4d6\ue424\ue5ca\ue5a4", 58509)
            + (var4 ? I1O1("\ue4ad\ue484\ue4a8\ue482\ue5e4\ue508\ue52a\ufbc7\ue5eb\ue5c3\ue5ea", 58509) : "")
            + I1O1("\ue4ad\ue4d0\ue4eb\ue4beﯜ\ue546\ue520\ue55c\ue5a5", 58509)
            + var5.IO_O
      );
      this.II1.II(new IO0o(44).IIII(-100000 - var1).II(I1O1("\ue4c9\ue4cd\ue4a6\ue48f\ue533\ue508", 58509) + var3));
      if (var8 > var6) {
         int var10 = (int)(var8 - var6) * 10;
         var5._l01 += var10;
         this.IIol(
            I1O1("\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue508\ue5ed\ufb09\ue5ad\ue5c2\ue710\ue790\uf8dc\ue63d\ue65d", 58509)
               + var10
               + I1O1("\ue4ad\ue5bd\ue4a2﨩\ue564\ue508\ue50a\ue587\ue5fc\ue584\ue4d3קּ\ue66c\ue601", 58509)
         );
      }
   }

   private long II(IOoI.III var1, int var2) {
      return this.II(this.II(), var1, var2);
   }

   long II(IOol var1, IOoI.III var2, int var3) {
      if (var2.l0o1 == 0) {
         return 1L;
      }

      int var4 = var1.II0o();
      int var5 = var2.lOl_;
      int var6 = Math.abs(var4 - var5);
      long var7 = (long)(var3 + var2.lOlO * 5.0E-4);
      if (var6 > 5 && var4 > var5) {
         var7 = 1L;
      } else {
         var7 = (long)(var7 / ((int)(var6 * 0.5) + 1.25));
      }

      if (var1 == this.II() && System.currentTimeMillis() < this.I_0l) {
         var7 += var7 * 20L / 100L;
      }

      return var7 < 1L ? 1L : var7;
   }

   private void II(int var1, boolean var2, int var3, int var4) {
      IOol var5 = this.II();
      int var6 = (int)((long)var1 * var5.II(var2) / 100L);
      int var7 = (int)((long)var1 * var5.Il_() / 100L);
      if (var6 > 0 || var7 > 0) {
         this.II1.II(new IO0o(113).II(1).II(3).II(37).III(var3).III(var4).III(-1));
      }

      if (var6 > 0 && var5.llIl > 0 && var5.llIl < var5.Illo()) {
         var5.llIl = Math.min(var5.Illo(), var5.llIl + var6);
         this.II1.II(new IO0o(-30).II(5).IIII(var5.llIl));
      }

      if (var7 > 0 && var5._loI < var5.Il1()) {
         var5._loI = Math.min(var5.Il1(), var5._loI + var7);
         this.II1.II(new IO0o(-30).II(6).IIII(var5._loI));
      }
   }

   void II1l(long var1) {
      long var3 = this.III1(var1);
      if (var3 > 0L) {
         this.II1.II(new IO0o(-3).II(2).IIII((int)var3));
      }
   }

   void II11(long var1) {
      long var3 = this.III1(var1);
      if (var3 > 0L) {
         this.II1.II(new IO0o(-3).II(2).IIII((int)var3));
      }

      this.II1.ll_0();
   }

   private void IIl0(long var1) {
      IOol var3 = this.II();
      var1 = var3.III_(var3.III0(var1));
      long var4 = this.III1(var1);
      if (var4 > 0L) {
         this.II1.II(new IO0o(-3).II(2).IIII((int)var4));
      }

      this.l100();
   }

   long III1(long var1) {
      IOol var3 = this.II();
      long var4 = var3.IIIO();
      if (var3.IO_l < var4 && var1 > 0L) {
         if (var3.IO_l + var1 > var4) {
            var1 = var4 - var3.IO_l;
         }

         var3.IO_l += var1;
         var3.IO_1 += var1;
         return var1;
      } else {
         return 0L;
      }
   }

   private Vector II(IOoI.III var1) {
      Vector var2 = new Vector();
      if (var1.l0o1 == 70) {
         return var2;
      }

      IOol var3 = this.II();
      int var4 = var1.I1;
      int var5 = var1.I1I;
      if (var1.l0o1 != 0) {
         if (this.IIl0.nextInt(100) < 70) {
            int var6 = 10 + this.IIl0.nextInt(10 + Math.max(0, var1.lOlO / 20));
            var6 += var6 * var3.Il_I() / 100;
            var2.addElement(this.II(76, var6, var4 + this.IIl0.nextInt(21) - 10, var5));
         }

         if (this.IIl0.nextInt(100) < 5) {
            var2.addElement(this.II(13, 1, var4 + 12, var5));
         }
      }

      if (var1.l0o1 == 71 || var1.l0o1 == 72) {
         var2.addElement(this.II(457, 1, var4 - 6, var5));
         if (this.IIl0.nextInt(110) < Math.max(1, Math.min(110, this.II1.II.II0o()))) {
            var2.addElement(this.II(457, 1 + this.IIl0.nextInt(5), var4 + 6, var5));
         }
      }

      if (this.II1.II.II00() == 3 && this._IoI >= 135 && this._IoI <= 138) {
         int var10 = 10 + this.IIl0.nextInt(1 + Math.max(1, Math.min(110, this.II1.II.II0o())) * 10 / 110);

         for (int var7 = 0; var7 < var10; var7++) {
            var2.addElement(this.II(190, 32000, var4 - 50 + var7 * 5, var5));
         }
      }

      if (var1.IooO) {
         var2.addElement(this.II(76, 2000 + this.IIl0.nextInt(3000), var4 + 10, var5));
         if (this.IIl0.nextInt(100) < 50) {
            var2.addElement(this.II(13, 1 + this.IIl0.nextInt(3), var4 - 20, var5));
         }

         if (this.IIl0.nextInt(100) < 30) {
            int var11 = new int[]{0, 1, 6, 9, 10, 20, 22}[this.IIl0.nextInt(7)];
            if (var3.lOlI == 1) {
               var11 = new int[]{2, 3, 7, 11, 12, 17, 18}[this.IIl0.nextInt(7)];
            } else if (var3.lOlI == 2) {
               var11 = new int[]{4, 5, 8, 13, 14, 21, 23}[this.IIl0.nextInt(7)];
            }

            IOO.III var13 = IOO.II(var11, 1);
            if (var13 != null) {
               var2.addElement(this.II(var13.I1l, 1, var4 + 30, var5));
            }
         }
      }

      if (var3.IO0_ > System.currentTimeMillis() && var1.l0o1 > 57 && var1.l0o1 < 66 && this.IIl0.nextInt(100) < 20) {
         var2.addElement(this.II(380, 1, var4 + 20, var5));
      }

      if (var3._lOI == 2 && var3._lOl == 0 && (var1.l0o1 == 1 || var1.l0o1 == 2 || var1.l0o1 == 3)) {
         var2.addElement(this.II(73, 1, var4 - 12, var5));
      }

      if (var3._lOI == 8 && var3._lOl == 1 && (var1.l0o1 == 10 || var1.l0o1 == 11 || var1.l0o1 == 12)) {
         if (var1.l0o1 == (var3.lOlI == 0 ? 11 : (var3.lOlI == 1 ? 12 : 10))) {
            var2.addElement(this.II(20, 1, var4 - 12, var5));
            this.Ioo = true;
         } else {
            this.IIol(
               I1O1(
                  "\ue4ce\ue4c3\ue4a5\ue4ca\ue57d\ue540ﯶ\ue508\ue5a5\ue5c8ﭲ\ue58c\ue621\ue64d\uf886\ue67e\ue613\ue67c\ue6c2\ue6fa\ue692\ue770\ue7c3\ue738\ue712\ue7b4\ue7d4\ue7bb爛\ue830\ue841\ue829\uf6a0\ue8ef\ue887\ue8ea\ue881\ue9eb\ue95e\ue966\ue911\ue968\ue9ce\ue9e2\ue982\uea6f\uea71\uea1e\uea29\uea14\uf42a\uead4\ueaf9\uea94\uf5a6\ueb58\ueb75\ueb19\uf52a\ueb92\uebba\ueb98\uecee\uec4d",
                  58509
               )
            );
         }
      }

      if (this.Il0O()) {
         this.III(var1, var2);
      }

      this.II(var1, var2);
      if (this.IIl0.nextInt(10000) < (this.Il0I() ? 2 : 1)) {
         var2.addElement(this.II(18 + this.IIl0.nextInt(3), 1, var4, var5));
      }

      if (this.IIl0.nextInt(10000) < (this.Il0I() ? 3 : 2)) {
         int[][] var12 = new int[][]{{441, 95, 5}, {442, 96, 5}, {443, 97, 5}, {444, 99, 3}, {445, 98, 3}, {446, 100, 5}, {447, 101, 5}};
         int[] var14 = var12[this.IIl0.nextInt(var12.length)];
         IOoI.II var8 = this.II(var14[0], 1, var4 + 8, var5);
         var8.IIl.addElement(new int[]{var14[1], var14[2]});
         var8.IIl.addElement(new int[]{30, 0});
      }

      return var2;
   }

   boolean Il0I() {
      return this.II().IO0l > System.currentTimeMillis();
   }

   private boolean II1I(int var1, int var2) {
      return var2 > 0 && this.IIl0.nextInt(var2) < var1;
   }

   private static boolean III_(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   private static boolean IIo1(int var0) {
      return var0 == 1 || var0 == 2 || var0 == 3 || var0 == 8 || var0 == 9 || var0 == 11 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   private static boolean IIo_(int var0) {
      return III_(var0, 105, 110);
   }

   private static boolean IIoO(int var0) {
      return III_(var0, 92, 94) || III_(var0, 96, 100) || var0 == 102 || var0 == 103;
   }

   private static boolean IIo0(int var0) {
      return III_(var0, 53, 62);
   }

   private static boolean IIoo(int var0) {
      return III_(var0, 63, 83);
   }

   private static boolean Il(int var0) {
      return var0 <= 38 && var0 != 24 && var0 != 25 && var0 != 26 && var0 != 0 && var0 != 7 && var0 != 14 && var0 != 21 && var0 != 22 && var0 != 23;
   }

   private static boolean IlI(int var0) {
      return III_(var0, 156, 159);
   }

   private double II() {
      int var1 = this.II().Il_1();
      if (var1 > 250) {
         var1 = 250;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      return Math.pow(var1 / 100.0, 1.5) * 20.0;
   }

   private double III() {
      IOol var1 = this.II();
      double var2 = 1.0 + this.II() / 100.0;
      var2 *= 1.0 + Math.max(0, var1.IIo(206)) / 100.0;
      if (var1.Il_l() >= 5) {
         var2 *= 1.25;
      }

      return var2;
   }

   private boolean IlII(int var1) {
      IOol var2 = this.II();

      for (int var3 = 0; var3 < var2.III.length; var3++) {
         if (!var2.III[var3].II1_() && var2.III[var3].I1l == var1) {
            return true;
         }
      }

      for (int var4 = 0; var4 < var2.IIII.length; var4++) {
         if (!var2.IIII[var4].II1_() && var2.IIII[var4].I1l == var1) {
            return true;
         }
      }

      return false;
   }

   private boolean II1l(int var1, int var2) {
      IOol var3 = this.II();

      for (int var4 = 0; var4 < 5; var4++) {
         if (var3.II[var4] == null || var3.II[var4].II1_() || var3.II[var4].I1l < var1 || var3.II[var4].I1l > var2) {
            return false;
         }
      }

      return true;
   }

   private int IIOo(int var1) {
      int[][][] var2 = new int[][][]{
         {{0, 33}, {1, 41}, {2, 49}},
         {{6, 35}, {7, 43}, {8, 51}},
         {{27, 30}, {28, 47}, {29, 55}},
         {{21, 24}, {22, 46}, {23, 53}},
         {{12, 57}, {12, 57}, {12, 57}}
      };
      int var3 = this.II1I(10, 100) ? 4 : (this.II1I(23, 100) ? 3 : (this.II1I(23, 100) ? 1 : (this.II1I(23, 100) ? 0 : 2)));
      return var2[var3][var1][this.IIl0.nextInt(2)];
   }

   private int II0(int var1) {
      int[][] var2 = new int[][]{{3, 34, 136, 137, 138, 139}, {4, 42, 152, 153, 154, 155}, {5, 50, 168, 169, 170, 171}};
      int[][] var3 = new int[][]{{9, 36, 140, 141, 142, 143}, {10, 44, 156, 157, 158, 159}, {11, 52, 172, 173, 174, 175}};
      int[][] var4 = new int[][]{{37, 38, 144, 145, 146, 147}, {25, 45, 160, 161, 162, 163}, {26, 54, 176, 177, 178, 179}};
      int[][] var5 = new int[][]{{39, 40, 148, 149, 150, 151}, {31, 48, 164, 165, 166, 167}, {32, 56, 180, 181, 182, 183}};
      int[][] var6 = new int[][]{{58, 59, 184, 185, 186, 187}, {58, 59, 184, 185, 186, 187}, {58, 59, 184, 185, 186, 187}};
      int[][][] var7 = new int[][][]{var2, var4, var3, var5, var6};
      int var8 = this.II1I(10, 100) ? 4 : (this.II1I(23, 100) ? 3 : (this.II1I(23, 100) ? 1 : (this.II1I(23, 100) ? 0 : 2)));
      return var7[var8][var1][this.IIl0.nextInt(6)];
   }

   private int II0I(int var1) {
      if (this.II1I(30, 100)) {
         return var1 == 0 ? 245 : (var1 == 1 ? 237 : 241);
      } else if (var1 == 0) {
         return this.II1I(50, 100) ? 128 : (this.II1I(50, 100) ? 127 : (this.II1I(50, 100) ? 233 : 129));
      } else if (var1 == 1) {
         return this.II1I(50, 100) ? 130 : (this.II1I(50, 100) ? 131 : (this.II1I(50, 100) ? 233 : 132));
      } else {
         return this.II1I(50, 100) ? 134 : (this.II1I(50, 100) ? 135 : (this.II1I(50, 100) ? 233 : 133));
      }
   }

   private static boolean IlIl(int var0) {
      return var0 == 129 || var0 == 133 || var0 == 131 || var0 == 135;
   }

   private int II0l(int var1) {
      IOol var2 = this.II();
      int var3 = 0;
      IO0l[][] var4 = new IO0l[][]{var2.II, var2.III, var2.IIII};

      for (int var5 = 0; var5 < var4.length; var5++) {
         if (var4[var5] != null) {
            for (int var6 = 0; var6 < var4[var5].length; var6++) {
               IO0l var7 = var4[var5][var6];
               if (var7 != null && !var7.II1_()) {
                  boolean var8 = false;

                  for (int var9 = 0; var9 < var7.IIl.size() && !var8; var9++) {
                     if (((int[])var7.IIl.elementAt(var9))[0] == var1) {
                        var8 = true;
                     }
                  }

                  if (var8) {
                     IOO.III var10 = IOO.II(var7.I1l);
                     if (var10 != null && var10.IoI_ >= 0 && var10.IoI_ < 5) {
                        var3 |= 1 << var10.IoI_;
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   private int II01(int var1) {
      int[] var2 = II_l[var1];
      double[] var3 = new double[var2.length];
      double var4 = 0.0;

      for (int var6 = 0; var6 < var2.length; var6++) {
         double var7 = IlIl(var2[var6]) ? 0.35 : (var2[var6] != 245 && var2[var6] != 237 && var2[var6] != 241 ? 1.0 : 0.6);
         var3[var6] = var7 * Math.pow(0.5, Integer.bitCount(this.II0l(var2[var6])));
         var4 += var3[var6];
      }

      double var9 = this.IIl0.nextDouble() * var4;

      for (int var8 = 0; var8 < var2.length; var8++) {
         var9 -= var3[var8];
         if (var9 <= 0.0) {
            return var2[var8];
         }
      }

      return var2[var2.length - 1];
   }

   private int II0_(int var1) {
      int var2 = this.II0l(var1);
      double[] var3 = new double[5];
      double var4 = 0.0;

      for (int var6 = 0; var6 < 5; var6++) {
         var3[var6] = (var2 & 1 << var6) != 0 ? 0.3 : 1.0;
         var4 += var3[var6];
      }

      double var9 = this.IIl0.nextDouble() * var4;

      for (int var8 = 0; var8 < 5; var8++) {
         var9 -= var3[var8];
         if (var9 <= 0.0) {
            return var8;
         }
      }

      return 4;
   }

   IO0l IIIl(int var1, int var2) {
      IO0l var3 = new IO0l(var1, 1);
      Vector var4 = IO_I.II(var1);
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            int[] var6 = (int[])var4.elementAt(var5);
            var3.III(var6[0], var6[1]);
         }
      }

      var3.III(var2, 1);
      int[] var7 = IIIl(var2);

      for (int var8 = 0; var8 < var7.length; var8++) {
         var3.III(var7[var8], 1);
      }

      var3.III(30, 1);
      return var3;
   }

   private void II(Vector var1, int var2, int var3) {
      IOol var4 = this.II();
      int var5 = var4.lOlI > 2 ? 2 : var4.lOlI;
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < 4; var8++) {
         var6 = this.IIOo(var5);
         var7 = this.II01(var5);
         IOO.III var9 = IOO.II(var6);
         boolean var10 = var9 != null && (this.II0l(var7) & 1 << var9.IoI_) != 0;
         if (!var10 || this.IIl0.nextInt(100) < 35) {
            break;
         }
      }

      if (IOO.II(var6) != null) {
         IOoI.II var12 = this.II(var6, 1, var2, var3);
         Vector var13 = IO_I.II(var6);
         if (var13 != null) {
            for (int var14 = 0; var14 < var13.size(); var14++) {
               int[] var11 = (int[])var13.elementAt(var14);
               var12.IIl.addElement(new int[]{var11[0], var11[1]});
            }
         }

         var12.IIl.addElement(new int[]{var7, 1});
         int[] var15 = IIIl(var7);

         for (int var16 = 0; var16 < var15.length; var16++) {
            var12.IIl.addElement(new int[]{var15[var16], 1});
         }

         var12.IIl.addElement(new int[]{30, 1});
         var12.IO1O = System.currentTimeMillis() + 120000L;
         var1.addElement(var12);
         this.IIol(
            I1O1("\ue4cf嗀\ue4a5\ue4ca\ue57f\ufbc3\ue526\ue546\ue5eb\ue5ccﭴ\ue596\ue621\ue731\ue78f\uf8bd\ue61e\ue6bc", 58509)
               + IOO.II(var6).II1o
               + I1O1("\ue4ad\ue4df\ue422\ue49e\ue529\ue543\ue5aa\ue505\ue5ed\ue584\ue5ab\ue58d\uf8a0\ue654", 58509)
         );
      }
   }

   private void III(Vector var1, int var2, int var3) {
      IOol var4 = this.II();
      int var5 = this.II0(var4.lOlI > 2 ? 2 : var4.lOlI);
      if (IOO.II(var5) != null) {
         IOoI.II var6 = this.II(var5, 1, var2 - 8, var3);
         Vector var7 = IO_I.II(var5);
         if (var7 != null) {
            for (int var8 = 0; var8 < var7.size(); var8++) {
               int[] var9 = (int[])var7.elementAt(var8);
               if (var9[0] != 107) {
                  var6.IIl.addElement(new int[]{var9[0], var9[1]});
               }
            }
         }

         int var10 = this.IIl0.nextInt(100);
         int var11 = var10 < 55 ? 0 : (var10 < 85 ? 1 : (var10 < 97 ? 2 : 3));
         if (var11 > 0) {
            var6.IIl.addElement(new int[]{107, var11});
         }

         var6.IO1O = System.currentTimeMillis() + 120000L;
         var1.addElement(var6);
      }
   }

   private void II(Vector var1, int var2, int var3, int var4, int var5, int var6) {
      if (IOO.II(var2) != null) {
         IOoI.II var7 = this.II(var2, 1, var3, var4);
         if (var5 >= 0) {
            var7.IIl.addElement(new int[]{var5, var6});
         }

         var1.addElement(var7);
      }
   }

   private void IIII(Vector var1, int var2, int var3) {
      IOol var4 = this.II();
      int[][] var5 = var4.lOlI == 0
         ? new int[][]{{232, 47, 300}, {244, 6, 22000, 27, 3500}, {256, 0, 1500}, {268, 7, 19000, 28, 2500}, {280, 0, 0}}
         : (
            var4.lOlI == 1
               ? new int[][]{{236, 47, 300}, {248, 6, 21000, 27, 3200}, {260, 0, 1450}, {272, 7, 20000, 28, 2700}, {280, 0, 0}}
               : new int[][]{{240, 47, 330}, {252, 6, 20000, 27, 3100}, {264, 0, 1550}, {276, 7, 18000, 28, 2300}, {280, 0, 0}}
         );
      int[] var6 = var5[this.IIl0.nextInt(var5.length)];
      if (IOO.II(var6[0]) != null) {
         IOoI.II var7 = this.II(var6[0], 1, var2, var3);
         var7.IO1O = System.currentTimeMillis() + 120000L;
         int var8 = var6[2];
         if (var6[0] != 280 && this.II1I(1, 20)) {
            int var9 = this.IIl0.nextInt(100) + 1;
            int var10 = var9 <= 40
               ? this.IIl0.nextInt(6)
               : (var9 <= 70 ? 6 + this.IIl0.nextInt(5) : (var9 <= 90 ? 11 + this.IIl0.nextInt(3) : 14 + this.IIl0.nextInt(2)));
            var8 += var8 * var10 / 100;
         }

         if (var6[0] != 280) {
            var7.IIl.addElement(new int[]{var6[1], var8});
         }

         if (var6.length > 3) {
            var7.IIl.addElement(new int[]{var6[3], var6[4]});
         }

         var1.addElement(var7);
         this.IIol(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue57f\ufbc3\ue526\ue546\ue5eb\ue5ccﭴ\ue596\ue621\ue731\ue78f\uf8bd\ue61e\ue6bc", 58509) + IOO.II(var6[0]).II1o);
      }
   }

   void IIO_(int var1, int var2) {
      int[] var3 = new int[]{555, 557, 559};
      int[] var4 = new int[]{556, 558, 560};
      int[] var5 = new int[]{562, 564, 566};
      int[] var6 = new int[]{563, 565, 567};
      int var7;
      if (this.II1I(10, 100)) {
         var7 = 561;
      } else if (this.II1I(25, 100)) {
         var7 = var5[this.IIl0.nextInt(3)];
      } else if (this.II1I(45, 100)) {
         var7 = var4[this.IIl0.nextInt(3)];
      } else if (this.II1I(75, 100)) {
         var7 = var3[this.IIl0.nextInt(3)];
      } else {
         var7 = var6[this.IIl0.nextInt(3)];
      }

      if (IOO.II(var7) != null) {
         int var8 = 100 + this.IIl0.nextInt(16);
         Vector var9 = new Vector();
         switch (var7) {
            case 555:
               var9.addElement(new int[]{47, 800 * var8 / 100});
               break;
            case 556:
               int var15 = 52000 * var8 / 100;
               var9.addElement(new int[]{22, var15 / 1000});
               var9.addElement(new int[]{27, var15 / 20});
               break;
            case 557:
               var9.addElement(new int[]{47, 850 * var8 / 100});
               break;
            case 558:
               int var14 = 50000 * var8 / 100;
               var9.addElement(new int[]{22, var14 / 1000});
               var9.addElement(new int[]{27, var14 / 20});
               break;
            case 559:
               var9.addElement(new int[]{47, 900 * var8 / 100});
               break;
            case 560:
               int var13 = 48000 * var8 / 100;
               var9.addElement(new int[]{22, var13 / 1000});
               var9.addElement(new int[]{27, var13 / 20});
               break;
            case 561:
            default:
               var9.addElement(new int[]{14, 14 * var8 / 100});
               break;
            case 562:
               var9.addElement(new int[]{0, 4400 * var8 / 100});
               break;
            case 563:
               int var12 = 48000 * var8 / 100;
               var9.addElement(new int[]{23, var12 / 1000});
               var9.addElement(new int[]{28, var12 / 20});
               break;
            case 564:
               var9.addElement(new int[]{0, 4300 * var8 / 100});
               break;
            case 565:
               int var11 = 50000 * var8 / 100;
               var9.addElement(new int[]{23, var11 / 1000});
               var9.addElement(new int[]{28, var11 / 20});
               break;
            case 566:
               var9.addElement(new int[]{0, 4500 * var8 / 100});
               break;
            case 567:
               int var10 = 46000 * var8 / 100;
               var9.addElement(new int[]{23, var10 / 1000});
               var9.addElement(new int[]{28, var10 * 150 / 1000});
         }

         if (var7 != 561 && var8 > 100) {
            var9.addElement(new int[]{207, var8 - 100});
         }

         if (this.II1I(30, 100)) {
            var9.addElement(new int[]{this.IIl0.nextBoolean() ? 86 : 87, 0});
         }

         var9.addElement(new int[]{21, 15 + this.IIl0.nextInt(3)});
         this.II(var7, 1, var1, var2, var9);
      }
   }

   void III0(int var1, int var2, int var3) {
      IOO.III var4 = IOO.II(var1);
      if (var4 != null) {
         Vector var5 = new Vector();
         if (var1 == 555 || var1 == 557 || var1 == 559) {
            var5.addElement(new int[]{47, II(var4.lOlI == 2, 1300 + this.IIl0.nextInt(501))});
         } else if (var1 == 556 || var1 == 558 || var1 == 560) {
            var5.addElement(new int[]{22, II(var4.lOlI == 0, 45 + this.IIl0.nextInt(11))});
         } else if (var1 == 562 || var1 == 564 || var1 == 566) {
            var5.addElement(new int[]{0, II(var4.lOlI == 2, 3500 + this.IIl0.nextInt(1001))});
         } else if (var1 == 563 || var1 == 565 || var1 == 567) {
            var5.addElement(new int[]{23, II(var4.lOlI == 1, 35 + this.IIl0.nextInt(11))});
         } else if (var1 == 561) {
            var5.addElement(new int[]{14, 15 + this.IIl0.nextInt(2)});
         }

         var5.addElement(new int[]{207, 1});
         var5.addElement(new int[]{21, 18});
         var5.addElement(new int[]{30, 1});
         if (this.II1I(90, 100)) {
            var5.addElement(new int[]{107, 1 + this.IIl0.nextInt(3)});
         } else if (this.II1I(4, 100)) {
            var5.addElement(new int[]{107, 5 + this.IIl0.nextInt(3)});
         } else {
            var5.addElement(new int[]{107, 1 + this.IIl0.nextInt(5)});
         }

         this.II(var1, 1, var2, var3, var5);
      }
   }

   private static int II(boolean var0, int var1) {
      return var0 ? (int)(var1 * 1.1) : var1;
   }

   private void IIIl(Vector var1, int var2, int var3) {
      int[] var4 = new int[]{555, 557, 559};
      int[] var5 = new int[]{556, 558, 560};
      int[] var6 = new int[]{562, 564, 566};
      int[] var7 = new int[]{563, 565, 567};
      int var8;
      if (this.II1I(10, 100)) {
         var8 = 561;
      } else if (this.II1I(25, 100)) {
         var8 = var6[this.IIl0.nextInt(3)];
      } else if (this.II1I(45, 100)) {
         var8 = var5[this.IIl0.nextInt(3)];
      } else if (this.II1I(75, 100)) {
         var8 = var4[this.IIl0.nextInt(3)];
      } else {
         var8 = var7[this.IIl0.nextInt(3)];
      }

      if (IOO.II(var8) != null) {
         int var9 = 100 + this.IIl0.nextInt(16);
         IOoI.II var10 = this.II(var8, 1, var2, var3);
         var10.IO1O = System.currentTimeMillis() + 120000L;
         switch (var8) {
            case 555:
               var10.IIl.addElement(new int[]{47, 800 * var9 / 100});
               break;
            case 556:
               int var16 = 52000 * var9 / 100;
               var10.IIl.addElement(new int[]{22, var16 / 1000});
               var10.IIl.addElement(new int[]{27, var16 / 20});
               break;
            case 557:
               var10.IIl.addElement(new int[]{47, 850 * var9 / 100});
               break;
            case 558:
               int var15 = 50000 * var9 / 100;
               var10.IIl.addElement(new int[]{22, var15 / 1000});
               var10.IIl.addElement(new int[]{27, var15 / 20});
               break;
            case 559:
               var10.IIl.addElement(new int[]{47, 900 * var9 / 100});
               break;
            case 560:
               int var14 = 48000 * var9 / 100;
               var10.IIl.addElement(new int[]{22, var14 / 1000});
               var10.IIl.addElement(new int[]{27, var14 / 20});
               break;
            case 561:
            default:
               var10.IIl.addElement(new int[]{14, 14 * var9 / 100});
               break;
            case 562:
               var10.IIl.addElement(new int[]{0, 4400 * var9 / 100});
               break;
            case 563:
               int var13 = 48000 * var9 / 100;
               var10.IIl.addElement(new int[]{23, var13 / 1000});
               var10.IIl.addElement(new int[]{28, var13 / 20});
               break;
            case 564:
               var10.IIl.addElement(new int[]{0, 4300 * var9 / 100});
               break;
            case 565:
               int var12 = 50000 * var9 / 100;
               var10.IIl.addElement(new int[]{23, var12 / 1000});
               var10.IIl.addElement(new int[]{28, var12 / 20});
               break;
            case 566:
               var10.IIl.addElement(new int[]{0, 4500 * var9 / 100});
               break;
            case 567:
               int var11 = 46000 * var9 / 100;
               var10.IIl.addElement(new int[]{23, var11 / 1000});
               var10.IIl.addElement(new int[]{28, var11 * 150 / 1000});
         }

         if (var8 != 561 && var9 > 100) {
            var10.IIl.addElement(new int[]{206, var9 - 100});
         }

         if (this.II1I(30, 100) && this.II1I(70, 100)) {
            var10.IIl.addElement(new int[]{this.IIl0.nextBoolean() ? 86 : 87, 0});
         }

         var10.IIl.addElement(new int[]{21, 15 + this.IIl0.nextInt(3)});
         var1.addElement(var10);
         this.IIol(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue57f\ufbc3\ue526\ue546\ue5eb\ue5ccﭴ\ue596\ue621\ue731\ue78f\uf8bd\ue61e\ue6bc", 58509) + IOO.II(var8).II1o);
      }
   }

   private boolean IlI1(int var1) {
      IOol var2 = this.II();
      int var3 = IO0I.IIol();
      if (var2._1lI != var3) {
         var2._1lI = var3;
         var2._1ll = 0;
      }

      if (var2._1ll >= var1) {
         return false;
      }

      var2._1ll++;
      return true;
   }

   private void II(IOoI.III var1, Vector var2) {
      IOol var3 = this.II();
      int var4 = var3.lOlo;
      int var5 = var1.I1;
      int var6 = var1.I1I;
      boolean var7 = this.Il0I();
      if (IlI(var4)) {
         int var8 = 10 + (var7 ? 5 : 0);
         int var9 = 5 + (var7 ? 3 : 0);
         int var10 = 1 + (var7 ? 1 : 0);
         if (this.II1I(var8, 100)) {
            var2.addElement(this.II(933, 1, var5, var6));
         } else if (this.II1I(var9, 100) && this.IlI1(150)) {
            var2.addElement(this.II(934, 1, var5, var6));
         } else if (this.II1I(var10, 500)) {
            var2.addElement(this.II(935, 1, var5, var6));
         }
      }

      if ((var4 == 156 || var4 == 157) && this.IlII(921) && this.II1I(10 + (var7 ? 5 : 0), 100)) {
         var2.addElement(this.II(1815, 1, var5 + 8, var6));
      }

      double var12 = this.III();
      if (IIo1(var4)) {
         if (this.II1I(1, var7 ? 21739 : 25000)) {
            var2.addElement(this.II(1634, 1, var5, var6));
         }

         double var13 = var12 * (var7 ? 1.5 : 1.0);
         if (this.IIl0.nextDouble() < var13 / 1500.0) {
            this.II(var2, var5, var6);
         }

         if (this.IIl0.nextDouble() < var13 / 500.0) {
            this.III(var2, var5, var6);
         }
      } else if (var4 == 164) {
         if (this.II1I(1, var7 ? 12000 : 25000)) {
            var2.addElement(this.II(1634, 1, var5, var6));
         }

         double var14 = var12 * (var7 ? 2.5 : 1.0);
         if (this.IIl0.nextDouble() < var14 / 500.0) {
            this.II(var2, var5, var6);
         }

         if (this.IIl0.nextDouble() < var14 / 150.0) {
            this.III(var2, var5, var6);
         }
      } else if (Il(var4) && this.IIl0.nextDouble() < var12 * (var7 ? 1.5 : 1.0) / 1200.0) {
         this.III(var2, var5, var6);
      }

      if (var1.III == null && var1.l0o1 != 0 && this.IIl0.nextDouble() < var12 * (var7 ? 1.5 : 1.0) * (var4 == 164 ? 2.0 : 1.0) / 300.0) {
         int var15 = this.IIl0.nextInt(100);
         int var11 = var15 < 30 ? 220 : (var15 < 55 ? 221 : (var15 < 75 ? 222 : (var15 < 90 ? 223 : 224)));
         var2.addElement(this.II(var11, 1, var5 + 4, var6));
      }

      if (var1.III == null && var1.l0o1 != 0 && (Il(var4) || IIoo(var4) || IIoO(var4) || IIo_(var4) || var4 == 164 || IIo0(var4))) {
         double var16 = var12 * (var4 == 164 ? (var7 ? 2.5 : 2.0) : (var7 ? 1.5 : 1.0));
         if (this.IIl0.nextDouble() < var16 / 250.0) {
            this.II(var2, 225, var5 + 8, var6, 74, 0);
         }

         if (this.IIl0.nextDouble() < var16 / 12000.0) {
            var2.addElement(this.II(987, 1, var5 - 12, var6));
         }

         if (this.IIl0.nextDouble() < var16 / 1500.0) {
            var2.addElement(this.II(1229, 1, var5 + 14, var6));
         }
      }

      if (IIo0(var4) && this.II1I(var7 ? 23 : 20, 100)) {
         var2.addElement(this.II(1778, 1, var5, var6));
      }

      if (Il(var4) || IIoo(var4) || IIoO(var4) || IIo_(var4)) {
         int var17 = var7 ? 11 : 10;
         if (this.II1I(var17, 100000)) {
            var2.addElement(this.II(this.II1I(1, 10) ? 19 : 20, 1, var5 - 8, var6));
         }
      }

      boolean var18 = IIo0(var4) || III_(var4, 135, 138) || III_(var4, 141, 144) || III_(var4, 147, 152) && var4 != 150;
      if ((IIo_(var4) || IIoO(var4) || var18) && this.II1I(5, 100)) {
         int var19 = IIo_(var4) ? 5000 + this.IIl0.nextInt(5001) : (IIoO(var4) ? 5000 + this.IIl0.nextInt(3001) : 5000 + this.IIl0.nextInt(4001));
         var2.addElement(this.II(var19 < 7000 ? 189 : 190, var19, var5 - 10, var6));
      }

      if (var4 == 155) {
         if (this.II1l(650, 662) && this.II1I(10, 100)) {
            var2.addElement(this.II(1066 + this.IIl0.nextInt(5), 1, var5, var6));
         }

         if (this.II1I(10, 100)) {
            var2.addElement(this.II(1229, 1, var5 + 8, var6));
         }
      }

      if (IIo_(var4)) {
         if (this.II1I(1, var7 ? 2550 : 3000)) {
            this.IIIl(var2, var5, var6);
         }

         if (this.II1l(555, 567) && this.II1I(3, 333)) {
            var2.addElement(this.II(663 + this.IIl0.nextInt(5), 1, var5 + 10, var6));
         }

         if (this.II1I(1, 2000)) {
            this.IIII(var2, var5, var6);
         }

         if (this.II1I(1, 10000)) {
            this.II(var2, 224, var5, var6, 67, 0);
         } else if (this.II1I(1, 2000)) {
            int var20 = this.IIl0.nextInt(4);
            this.II(var2, 220 + var20, var5, var6, 71 - var20, 0);
         }
      }
   }

   static int[] IIII(int var0) {
      switch (var0) {
         case 441:
            return new int[]{95, 5};
         case 442:
            return new int[]{96, 5};
         case 443:
            return new int[]{97, 5};
         case 444:
            return new int[]{99, 3};
         case 445:
            return new int[]{98, 3};
         case 446:
            return new int[]{100, 5};
         default:
            return new int[]{101, 5};
      }
   }

   private IOoI.II II(int var1, int var2, int var3, int var4) {
      IOoI.II var5 = new IOoI.II();
      var5.I1l = this._I00++;
      if (this._I00 > 30000) {
         this._I00 = 1;
      }

      var5.l0o1 = var1;
      var5.lo0I = var2;
      var5.I1 = var3;
      var5.I1I = var4;
      var5.IO1O = System.currentTimeMillis() + 60000L;
      this.IIlo.addElement(var5);
      return var5;
   }

   synchronized void II1I(DataInputStream var1) throws IOException {
      this.I1Il(var1.readShort());
   }

   synchronized void l110() {
      int[] var1 = new int[this.IIlo.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = ((IOoI.II)this.IIlo.elementAt(var2)).I1l;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         this.I1Il(var1[var3]);
      }
   }

   private void I1Il(int var1) {
      IOol var2 = this.II();
      IOoI.II var3 = null;
      int var4 = -1;

      for (int var5 = 0; var5 < this.IIlo.size(); var5++) {
         IOoI.II var6 = (IOoI.II)this.IIlo.elementAt(var5);
         if (var6.I1l == var1) {
            var3 = var6;
            var4 = var5;
            break;
         }
      }

      if (var3 != null) {
         this.II1.II.III1(var3.l0o1, var3.I1, var3.I1I);
         if (var3.l0o1 == 74) {
            var2.llIl = var2.Illo();
            var2._loI = var2.Il1();
            this.l1O0();
            this.II1.II(new IO0o(-20).III(var1).II("").III(1));
            this.IIlo.removeElementAt(var4);
            this.I_oO = System.currentTimeMillis() + 2500L;
         } else {
            IOO.III var10 = IOO.II(var3.l0o1);
            int var11 = var10 == null ? -1 : var10.IoI_;
            if (var11 == 9) {
               var2.Il11 = var2.Il11 + var3.lo0I;
               this.II1.II.Il_1(var3.lo0I);
            } else if (var11 == 10) {
               var2.lOoO = var2.lOoO + var3.lo0I;
            } else {
               IO0l var7 = new IO0l(var3.l0o1, var3.lo0I);

               for (int var8 = 0; var8 < var3.IIl.size(); var8++) {
                  int[] var9 = (int[])var3.IIl.elementAt(var8);
                  var7.III(var9[0], var9[1]);
               }

               if (var7.IIl.size() == 0 && var10 != null && var10.IoI_ == 6) {
                  int[] var13 = new int[]{1, 1, 2, 3, 5, 8, 13, 21};
                  var7.III(2, var13[Math.max(0, Math.min(7, var10.lOl_))]);
               }

               if (!this.III0(var7)) {
                  this.IIol(
                     I1O1(
                        "\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue589\ue669\ue6d4\ue651\ue639\ue65d\ue6ff\ue649\ue6b4\ue6d9\ue77b\ue75f女\ue755\ue7e0\ue7c1賈\ue79f\ue877\ue803\ue86e\ue806\ue8e4\ue85f\ue8a4\ue88e\ue928\ue953\ue92e\uf7a6\ue9a4\ue9cd\ue9aa\uf756\uea74\uea3f\uea4a\uea35\uea96\ueaf6",
                        58509
                     )
                  );
                  return;
               }
            }

            this.IIlo.removeElementAt(var4);
            int var12 = var3.lo0I > 32767 ? 32767 : var3.lo0I;
            IO0o var14 = new IO0o(-20).III(var1).II("").III(var12);
            if (var11 == 9 || var11 == 10) {
               var14.III(var12);
            }

            this.II1.II(var14);
            if (var11 != 9 && var11 != 10) {
               this.l1_l();
            } else {
               this.l1_();
            }

            this.II0l(var3.l0o1, var3.lo0I);
            this.II1.I__O();
         }
      }
   }

   synchronized void l11o() {
      if (this.IooI) {
         this.IooI = false;
      } else {
         IOol var1 = this.II();
         this.II1.II(new IO0o(6).II(var1.Il11).IIII(var1.lOoO).IIII(var1._lO));
      }
   }

   void l1_() {
      IOol var1 = this.II();
      if (this.IOI1 >= 0L && var1.Il11 > var1.IOO_ && var1.Il11 > this.IOI1) {
         var1.Il11 = Math.max(this.IOI1, var1.IOO_);
         long var2 = System.currentTimeMillis();
         if (var2 - this.IOI_ > 4000L) {
            this.IOI_ = var2;
            this.IIol(
               I1O1("\ue4db\ue44c\ue4a5\ue48d\ue529\ue439\ue5a4\ue546\ue494ﬅ\ue5b7\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9", 58509)
                  + var1.IOO_ / 1000000000L
                  + I1O1(
                     "\ue4ad\ue4d8屮\ue4c4\ue529\ue560\ue5a4\ue51f\ue5a5\ue5ca\ue521\ue58c\ue666\ue600\ue658\ue637\uf8a6\ue6f5\ue69b\ue6b2\uf858\ue776\ue717\ue720\ue795\ue7fa\ue7d4\ue7f2冷\ue830\ue87c\ue82f\ue803\ue8f8\ue8ca\ue8e4",
                     58509
                  )
            );
         }
      }

      this.IOI1 = var1.Il11;
      this.II1.II(new IO0o(-30).II(4).II(var1.Il11).IIII(var1.lOoO).IIII(var1.llIl).IIII(var1._loI).IIII(var1._lO));
      this.II.II(var1);
   }

   boolean III0(IO0l var1) {
      return this.III(this.II().III, var1);
   }

   private static boolean III(IO0l var0, IO0l var1) {
      if (var0.IIl.size() != var1.IIl.size()) {
         return false;
      }

      for (int var2 = 0; var2 < var0.IIl.size(); var2++) {
         int[] var3 = (int[])var0.IIl.elementAt(var2);
         int[] var4 = (int[])var1.IIl.elementAt(var2);
         if (var3[0] != var4[0] || var3[1] != var4[1]) {
            return false;
         }
      }

      return true;
   }

   private static int[] III(IO0l var0) {
      for (int var1 = 0; var1 < var0.IIl.size(); var1++) {
         int[] var2 = (int[])var0.IIl.elementAt(var1);
         if (var2[0] == 1) {
            return var2;
         }
      }

      return null;
   }

   private boolean II(IO0l[] var1, IO0l var2) {
      int[] var3 = III(var2);
      int var4 = var3 == null ? 0 : var3[1];

      for (int var5 = 0; var5 < var1.length; var5++) {
         IO0l var6 = var1[var5];
         if (var6.I1l == 521) {
            int[] var7 = III(var6);
            if (var7 == null) {
               var6.III(1, var4);
            } else {
               var7[1] += var4;
            }

            return true;
         }
      }

      var2.lo0I = 1;

      for (int var8 = 0; var8 < var1.length; var8++) {
         if (var1[var8].II1_()) {
            var1[var8] = var2;
            return true;
         }
      }

      return false;
   }

   private void l1_I() {
      IO0l[] var1 = this.II().III;
      IO0l var2 = null;
      boolean var3 = false;

      for (int var4 = 0; var4 < var1.length; var4++) {
         IO0l var5 = var1[var4];
         if (var5.I1l == 521) {
            if (var2 == null) {
               var2 = var5;
            } else {
               int[] var6 = III(var5);
               int[] var7 = III(var2);
               int var8 = var6 == null ? 0 : var6[1];
               if (var7 == null) {
                  var2.III(1, var8);
               } else {
                  var7[1] += var8;
               }

               var1[var4] = new IO0l();
               var3 = true;
            }
         }
      }

      if (var3) {
         this.l1_l();
         this.II1.I__O();
      }
   }

   private boolean III(IO0l[] var1, IO0l var2) {
      if (var2.I1l == 521) {
         return this.II(var1, var2);
      }

      if (IO0l.II0_(var2.I1l)) {
         int[] var7 = var2.III();
         if (var7 == null) {
            var2.III(31, Math.max(1, var2.lo0I));
            var7 = var2.III();
         }

         var2.lo0I = 1;

         for (int var9 = 0; var9 < var1.length; var9++) {
            IO0l var11 = var1[var9];
            if (var11.I1l == var2.I1l) {
               int[] var6 = var11.III();
               if (var6 == null) {
                  var11.III(31, Math.max(1, var11.lo0I));
                  var11.lo0I = 1;
                  var6 = var11.III();
               }

               var6[1] += var7[1];
               return true;
            }
         }

         for (int var10 = 0; var10 < var1.length; var10++) {
            if (var1[var10].II1_()) {
               var1[var10] = var2;
               return true;
            }
         }

         return false;
      } else {
         IOO.III var3 = IOO.II(var2.I1l);
         if (var3 != null && var3.Io11) {
            for (int var4 = 0; var4 < var1.length; var4++) {
               IO0l var5 = var1[var4];
               if (var5.I1l == var2.I1l && III(var5, var2) && (var2.I1l == 457 || var5.lo0I + var2.lo0I <= 99999)) {
                  var5.lo0I = var5.lo0I + var2.lo0I;
                  return true;
               }
            }
         }

         for (int var8 = 0; var8 < var1.length; var8++) {
            if (var1[var8].II1_()) {
               var1[var8] = var2;
               return true;
            }
         }

         return false;
      }
   }

   private void III(IO0l[] var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (!var1[var3].II1_()) {
            IO0l var4 = var1[var3];
            var1[var3] = var1[var2];
            var1[var2] = var4;
            var2++;
         }
      }
   }

   void l1_l() {
      IOol var1 = this.II();
      IO0o var2 = new IO0o(-36).II(0).II(var1.III.length);
      III(var2, var1.III);
      this.II1.II(var2);
      this.II1O(false);
   }

   boolean IIIo(IO0l var1) {
      if (IOol.II0O(var1.I1l) < 0) {
         return false;
      }

      IOol var2 = this.II();
      IOO.III var3 = IOO.II(var1.I1l);
      String var4 = var3 != null && var3.II1o != null ? var3.II1o : I1O1("\ue4cf\ue45f\ue4a5\ue48d\ue529\ue54b\ue52f\ue584\ue5eb", 58509);
      if (var2._1I0 == var1.I1l) {
         var2._1I0 = 0;
         this.IIol(I1O1("\ue59d\ue44f\ue4eb\ue49eﮦ\ue55c\ue567", 58509) + var4);
      } else {
         var2._1I0 = var1.I1l;
         this.IIol(
            I1O1("\ue59d\ue44f\ue4eb\ue48e\ue5f0\ue546\ue520\ue546", 58509)
               + var4
               + I1O1(
                  "\ue4ad\ue484\ue4bd漢\ue57d\ue508\ue537\ue50eשּׁ\ue5c9\ue5e3\ue594\uf8aa\ue64e\ue61f\uf881\ue65d\ue6f4\ue65b\ue6b4\ue691\ue738\ue743\ue724\ue714\ue7fa\ue7d4\ue7fe\ue7d1\ue874\ue8d6\ue820\ue80a\ue8ac\ue8c7\uf66b\ue880\ue928\ue836\uf785\ue945\ue9f0\uf70c\ue9b6\ue9c8",
                  58509
               )
         );
      }

      this.II1O(false);
      this.II1.ll_0();
      this.l1O0();
      this.II1.I__O();
      return true;
   }

   void II1O(boolean var1) {
      IOol var2 = this.II();
      if (var2 != null) {
         int var3 = 0;
         if (var2.IIIO() != null) {
            int var4 = IOol.II0O(var2._1I0);
            if (var4 >= 0) {
               var3 = IOol.I__[var4];
            }
         }

         if (!var1 && this._lIo != 0 && this._lIo != var3) {
            this.II1.II(new IO0o(-128).II(1).IIII(var2.I1l).III(this._lIo));
         }

         if (var3 != 0 && (var1 || this._lIo != var3)) {
            this.II1.II(new IO0o(-128).II(0).IIII(var2.I1l).III(var3).II(0).II(-1).III(1).II(0));
         }

         boolean var5 = this._lIo != var3;
         this._lIo = var3;
         if (var5 && !var1) {
            this.II1.ll_0();
         }
      }
   }

   void l1_1() {
      IOol var1 = this.II();
      IO0o var2 = new IO0o(-37).II(0).III(var1.I0).II(var1.II.length);
      III(var2, var1.II);
      this.II1.II(var2);
      this.II1.ll__();
      this.II10(false);
      this.l1__();
      this.II1.II.ll1l();
   }

   void l1__() {
      IOol var1 = this.II();
      this.II1.II(new IO0o(-30).II(100).III(var1.Illl()).II(var1.Ill1()).III(-1));
   }

   void II10(boolean var1) {
      IOol var2 = this.II();
      if (var2 != null) {
         int var4 = var2.II(IOol.I__o);
         int var5 = var2.II(new int[]{253});
         int var6 = var2.II(IOol.I_O);
         int var7 = var2.II(IOol.I_0I);
         int var8 = var2.II(IOol.I_OI);
         int var9 = var2.II(IOol.I_0);
         int var10 = var2.II(new int[]{130, 142});
         int var11 = var2.II(IOol.I_OO);
         int var12 = var2.II(IOol.I_O_);
         int var13 = var2.II(IOol.I_O1);
         int var14 = var2.II(IOol.I_0l);
         int[] var3;
         if (var4 >= 5 || var5 >= 5 || var6 >= 5 || var7 >= 5) {
            var3 = new int[]{1200};
         } else if (var8 >= 5 || var9 >= 5 || var10 >= 5) {
            var3 = new int[]{10277};
         } else if (var11 >= 5) {
            var3 = new int[]{10277, 5017};
         } else if (var12 < 5 && var13 < 5 && var14 < 5) {
            var3 = new int[0];
         } else {
            var3 = new int[]{1202};
         }

         boolean var15 = var2.II(IOol.I_Oo) >= 5
            || var2.II(IOol.I_O0) >= 5
            || var11 >= 5
            || var4 >= 5
            || var7 >= 5
            || var5 >= 5
            || var6 >= 5
            || var10 >= 5
            || var9 >= 5
            || var2.II(new int[]{250}) >= 5
            || var13 >= 5
            || var12 >= 5
            || var14 >= 5;
         if (var15) {
            int[] var16 = new int[var3.length + 1];
            System.arraycopy(var3, 0, var16, 0, var3.length);
            var16[var3.length] = 504;
            var3 = var16;
         }

         if (!var1) {
            for (int var19 = 0; var19 < this.I_1I.length; var19++) {
               boolean var17 = false;

               for (int var18 = 0; var18 < var3.length; var18++) {
                  if (var3[var18] == this.I_1I[var19]) {
                     var17 = true;
                  }
               }

               if (!var17) {
                  this.II1.II(new IO0o(-128).II(1).IIII(var2.I1l).III(this.I_1I[var19]));
               }
            }
         }

         for (int var20 = 0; var20 < var3.length; var20++) {
            boolean var21 = false;
            if (!var1) {
               for (int var22 = 0; var22 < this.I_1I.length; var22++) {
                  if (this.I_1I[var22] == var3[var20]) {
                     var21 = true;
                  }
               }
            }

            if (!var21) {
               this.II1.II(new IO0o(-128).II(0).IIII(var2.I1l).III(var3[var20]).II(1).II(-1).III(1).II(0));
            }
         }

         this.I_1I = var3;
      }
   }

   void l1_O() {
      IOol var1 = this.II();
      IO0o var2 = new IO0o(-35).II(0).II(var1.IIII.length);
      III(var2, var1.IIII);
      this.II1.II(var2);
   }

   void l1_0() {
      IOol var1 = this.II();
      IO0o var2 = new IO0o(-35).II(0).II(var1.IIII.length);
      III(var2, var1.IIII);
      this.II1.II(var2);
      this.II1.II(new IO0o(-35).II(1));
   }

   private static void III(IO0o var0, IO0l[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         IO0l var3 = var1[var2];
         if (var3.II1_()) {
            var0.III(-1);
         } else {
            var0.III(var3.I1l).IIII(var3.lo0I).II("").II("");
            if (var3.IIl.size() == 0) {
               var0.II(1).II(73).III(0);
            } else {
               var0.II(var3.IIl.size());

               for (int var4 = 0; var4 < var3.IIl.size(); var4++) {
                  int[] var5 = (int[])var3.IIl.elementAt(var4);
                  var0.II(var5[0]).III(var5[1]);
               }
            }
         }
      }
   }

   private static int IIII(IOO.III var0) {
      switch (var0.IoI_) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return var0.IoI_;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 26:
         case 28:
         case 29:
         case 30:
         case 31:
         default:
            return -1;
         case 11:
            return 8;
         case 23:
         case 24:
            return 9;
         case 25:
            return 10;
         case 27:
            return 7;
         case 32:
            return 6;
      }
   }

   synchronized void II1l(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      byte var3 = var1.readByte();
      if (var3 >= 0) {
         IOol var4 = this.II();
         switch (var2) {
            case 0:
               this.I1IO(var3);
               this.l1o();
               break;
            case 1:
               this.II(var4.III, var3);
            case 2:
            default:
               break;
            case 3:
               this.II(var4.II, var3);
               break;
            case 4:
               this.I1I1(var3);
               break;
            case 5:
               this.I1I_(var3);
               break;
            case 6:
               this.II1.II.I1(var3);
               break;
            case 7:
               this.II1.II.I1I(var3);
         }
      }
   }

   void II0o(String var1) {
      System.out.println(I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue516\ue5ea\ue5d4\ue5b6\ue592\ue63b\ue600", 58509) + var1);
      this.II1.II(new IO0o(-26).II(var1));
   }

   void I1I1(int var1) {
      IOol var2 = this.II();
      if (var1 < 0) {
         this.IIol(I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50eצּ\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
      } else if (var1 < var2.III.length) {
         IO0l var3 = var2.III[var1];
         if (!var3.II1_()) {
            IOO.III var4 = IOO.II(var3.I1l);
            if (var4 != null) {
               switch (var4.IoI_) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 11:
                  case 23:
                  case 24:
                  case 25:
                  case 27:
                  case 32:
                     if (var4.lOlI < 3 && var4.lOlI != var2.lOlI) {
                        this.II0o(
                           I1O1(
                              "\ue4d9\ue4de\ue4aa\ue484\ue56e\ue508\ue525ﮭ\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue62e\ue615\ue665\ue69b\ue6b2\uf81a\ue768\ue716",
                              58509
                           )
                        );
                        return;
                     } else {
                        if (var3.I1l != 691 && var3.I1l != 692 && var3.I1l != 693 || var2.II[0].II1_() && var2.II[5].II1_()) {
                           long var5 = var4.I101;

                           for (int var7 = 0; var7 < var3.IIl.size(); var7++) {
                              int[] var8 = (int[])var3.IIl.elementAt(var7);
                              if (var8[0] == 21) {
                                 var5 = var8[1] * 1000000000L;
                                 break;
                              }
                           }

                           if (var2.IO_l < var5) {
                              this.II0o(
                                 I1O1(
                                    "\ue4de海\ue4a8\ue4ca\ue564ﮉ\ue529\ue50e\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue74f\uf89a\ue6bc\ue6c2\ue630\ue68c\ue738\ue754隣\ue700\ue7b5",
                                    58509
                                 )
                              );
                              return;
                           }

                           if (var3.I1l != 547 && var3.I1l != 548 && var3.I1l != 1302) {
                              this.III(var3);
                              this.IIII(var3);
                              int var9 = IIII(var4);
                              if (var9 >= 0 && var9 < var2.II.length) {
                                 IO0l var10 = var2.II[var9];
                                 var2.II[var9] = var3;
                                 var2.III[var1] = var10;
                                 this.l1_l();
                                 this.l1_1();
                                 this.II1.ll_0();
                                 this.II1.ll__();
                                 this.II1.ll_1();
                                 this.II1.I__O();
                                 return;
                              }

                              this.II0o(
                                 I1O1(
                                    "\ue4d9\ue4de\ue4aa\ue484\ue56e\ue508\ue525ﮭ\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue62e\ue615\ue665\ue69b\ue6b2\uf81a\ue768\ue716\ue767",
                                    58509
                                 )
                              );
                              return;
                           }

                           this.II0o(
                              I1O1(
                                 "\ue4ce﨏\ue4a2\ue4ca\ue57d\ue55a\ue526\ue508\ue5e2\ue584\ue5ad\ue502\ue678\ue600\ue65c\ue636\uf8b4\ue6bc\ue6df\ue63a\ue697\ue770\ue717\ue735\ue71d\ue7fb\ue793\ue6c3虜\ue830\ue85b\uf6a3\ue84c",
                                 58509
                              )
                           );
                           return;
                        }

                        this.II0o(
                           I1O1(
                              "\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c7\ufb1c\ue58b\ue621\ue6c1\ue650\ue67e\ue76c\uf85f\ue69b\ue6b9\ue60a\ue738\ue743\ue73e禮\ue7b4\ue7c0錄\ue7d1\ue874\uf6ca\ue820\ue80a\ue8ac\ue8da\ue8bf\uf64e\ue966\ue907\ue857\ue90c\ue9a4\ue9c1\ue9ab\uf722\uea6e",
                              58509
                           )
                        );
                        return;
                     }
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 26:
                  case 28:
                  case 29:
                  case 30:
                  case 31:
                  default:
                     this.II0o(
                        I1O1(
                           "\ue4d9\ue4de\ue4aa\ue484\ue56e\ue508\ue525ﮭ\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue62e\ue615\ue665\ue69b\ue6b2\uf81a\ue768\ue716\ue767",
                           58509
                        )
                     );
               }
            }
         }
      }
   }

   void III(IO0l var1) {
      for (int var2 = 0; var2 < var1.IIl.size(); var2++) {
         int[] var3 = (int[])var1.IIl.elementAt(var2);
         if (var3[0] == 210) {
            var1.IIl.removeElementAt(var2);
            int[] var4 = new int[]{8, 14, 108, 94, 108, 16, 80, 81, 97, 100, 101, 104, 106};
            Vector var5 = new Vector();

            while (var5.size() < var3[1] && var5.size() < var4.length) {
               Integer var6 = new Integer(var4[this.IIl0.nextInt(var4.length)]);
               if (!var5.contains(var6)) {
                  var5.addElement(var6);
               }
            }

            for (int var9 = 0; var9 < var5.size(); var9++) {
               int var7 = (Integer)var5.elementAt(var9);
               int var8 = 0;
               if (var7 == 8 || var7 == 14 || var7 == 108 || var7 == 94) {
                  var8 = 3 + this.IIl0.nextInt(3);
               } else if (var7 == 16 || var7 == 80 || var7 == 81 || var7 == 97 || var7 == 100 || var7 == 101 || var7 == 104) {
                  var8 = 10 + this.IIl0.nextInt(16);
               }

               var1.III(var7, var8);
            }
            break;
         }
      }
   }

   void IIII(IO0l var1) {
      for (int var2 = 0; var2 < var1.IIl.size(); var2++) {
         int[] var3 = (int[])var1.IIl.elementAt(var2);
         if (var3[0] == 231) {
            var1.IIl.removeElementAt(var2);
            if (this.IIl0.nextDouble() <= 0.99) {
               int[] var4 = new int[]{3, 7, 15, 21};
               var1.III(93, var4[this.IIl0.nextInt(4)]);
            }
            break;
         }
      }
   }

   private void I1I_(int var1) {
      IOol var2 = this.II();
      if (var1 < var2.II.length && !var2.II[var1].II1_()) {
         int var3 = -1;

         for (int var4 = 0; var4 < var2.III.length; var4++) {
            if (var2.III[var4].II1_()) {
               var3 = var4;
               break;
            }
         }

         if (var3 < 0) {
            this.IIol(
               I1O1(
                  "\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue589\ue669\ue6d4\ue651\ue639\ue65d\ue6ff\ue649\ue6b4\ue6d9\ue77b\ue75f女\ue755\ue7e0\ue7c1賈\ue79f\ue877",
                  58509
               )
            );
         } else {
            var2.III[var3] = var2.II[var1];
            var2.II[var1] = new IO0l();
            this.l1_l();
            this.l1_1();
            this.II1.ll_1();
            this.II1.ll_0();
            this.II1.I__O();
         }
      }
   }

   private void II(IO0l[] var1, int var2) {
      IOol var3 = this.II();
      if (var2 < var1.length && !var1[var2].II1_()) {
         if (var1[var2].I1l == 457) {
            this.IIol(
               I1O1(
                  "\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50eצּ\ue584\ue5a0קּ\ue675\ue600\ue649\ue6be\ue613\ue6fb\ue69b\ue6ac\ue619\ue777\ue717\ue724\ue6c5\ue635\ue7dd\ue7b5",
                  58509
               )
            );
         } else {
            IO0l var4 = var1[var2];
            if (!this.III(var3.IIII, var4)) {
               this.IIol(I1O1("\ue4df\ue51c\ue56a\ue484\ue56e\ue508\ue456﮵\ue5a5\ue4b5\ue520\ue5c2\ue710\uf887\ue646", 58509));
            } else {
               var1[var2] = new IO0l();
               if (var1 == var3.III) {
                  this.III(var3.III);
               }

               this.l1_l();
               this.l1_1();
               this.l1_0();
               this.II1.ll_1();
               this.II1.ll_0();
               this.II1.I__O();
            }
         }
      }
   }

   private void I1IO(int var1) {
      IOol var2 = this.II();
      if (var1 < var2.IIII.length && !var2.IIII[var1].II1_()) {
         IO0l var3 = var2.IIII[var1];
         IOO.III var4 = IOO.II(var3.I1l);
         boolean var5 = false;
         int var6 = var4 == null ? -1 : IIII(var4);
         if (var6 >= 0 && var6 < var2.II.length && var2.II[var6].II1_() && (var4.lOlI >= 3 || var4.lOlI == var2.lOlI) && var2.IO_l >= var4.I101) {
            var2.II[var6] = var3;
            var2.IIII[var1] = new IO0l();
            var5 = true;
         }

         if (!var5) {
            if (!this.III0(var3)) {
               this.IIol(
                  I1O1(
                     "\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue589\ue669\ue6d4\ue651\ue639\ue65d\ue6ff\ue649\ue6b4\ue6d9\ue77b\ue75f女\ue755\ue7e0\ue7c1賈\ue79f\ue877",
                     58509
                  )
               );
               return;
            }

            var2.IIII[var1] = new IO0l();
         }

         this.l1_l();
         this.l1_1();
         this.l1_0();
         this.II1.ll_1();
         this.II1.ll_0();
         this.II1.I__O();
      }
   }

   synchronized void II11(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      byte var3 = var1.readByte();
      int var4 = var1.readByte();
      IOol var5 = this.II();
      if (var4 == -1) {
         short var6 = var1.readShort();

         for (int var7 = 0; var7 < var5.III.length; var7++) {
            if (var5.III[var7].I1l == var6) {
               var4 = var7;
               break;
            }
         }
      }

      if (var4 >= 0) {
         IO0l[] var9 = var3 == 0 ? var5.II : var5.III;
         if (var4 < var9.length && !var9[var4].II1_()) {
            IO0l var10 = var9[var4];
            IOO.III var8 = IOO.II(var10.I1l);
            if (var8 != null) {
               switch (var2) {
                  case 0:
                     if (var3 == 0) {
                        this.I1I_(var4);
                     } else if (var8.IoI_ == 7) {
                        this.IooI = true;
                        this.II1
                           .II(
                              new IO0o(-43)
                                 .II(0)
                                 .II(var3)
                                 .II(var4)
                                 .II(
                                    I1O1("\ue4cf嗀\ue4a5\ue4ca\ue56a\ue540ﯨ\ue505\ue5a5\ue5c7\ue5abכֿ\ue66f\ue600\ue657\uf893\ue61e\ue6bc", 58509)
                                       + var8.II1o
                                       + I1O1("\ue4b2", 58509)
                                 )
                           );
                     } else {
                        this.II(var4, var10, var8);
                     }
                     break;
                  case 1:
                     this.IooI = true;
                     this.II1
                        .II(
                           new IO0o(-43)
                              .II(1)
                              .II(var3)
                              .II(var4)
                              .II(
                                 I1O1(
                                       "\ue4cf嗀\ue4a5\ue4ca\ue56a\ue540ﯨ\ue505\ue5a5\ue5c7\ue5abכֿ\ue66f\ue600\ue652\ue62b\uf8ac\ue6f2\ue69b\ue6ac\uf810\ue76c\ue717",
                                       58509
                                    )
                                    + var8.II1o
                                    + I1O1("\ue4b2", 58509)
                              )
                        );
                     break;
                  case 2:
                     var9[var4] = new IO0l();
                     if (var3 == 0) {
                        this.l1_1();
                        this.II1.ll_0();
                     } else {
                        this.l1_l();
                     }

                     this.II1.I__O();
                     break;
                  case 3:
                     this.II(var4, var10, var8);
               }
            }
         }
      }
   }

   private void II(int var1, IO0l var2) {
      IOol var3 = this.II();
      int var4 = -1;

      for (int var5 = 0; var5 < 15; var5++) {
         if (IOol.I_1O[var5] == var2.I1l) {
            var4 = var5;
            break;
         }
      }

      if (var4 < 0) {
         this.IIol(
            I1O1(
               "\ue4ce\ue4c4\ue57b\ue48b\ue529\ue55c\ue52fﮥ\ue5a5\ue5d7אַ\ue5c2\ue665\uf8c5\ue651\ue639\ue65d\ue6ea\uf816\ue6ae\ue6d9\ue768\ue75f刺\ue718\ue7b4\ue7dd\ue732\ue788",
               58509
            )
         );
      } else {
         int var7 = var4 < 10 ? (var4 % 2 == 0 ? var4 + 1 : var4 - 1) : -1;
         if (var7 >= 0 && var3.IlIo(var7)) {
            this.IIol(
               I1O1(
                  "\ue4ce\ue4c4拓\ue4ca\ue56a\ue5db\ue567\ue512\ue5edﭧ\ue5e3\ue591\uf8ec\ue600\ue65b\uf8bb\ue613\ue6fb\ue69b\ue6b9\ue600\ue776\ue750\ue776\ue719\ue76e\ue7d0\ue7f2\ue7c0\ue830\ue859\uf6e3\ue819\ue8ac\ue8db\ue8a2\uf640\ue965\ue907\ue924\uf7b0\ue9a4\ue9d7\ue9b0\uf702\uea20\uea7c\ueac7\uea33\uea1b\ueabb\uead6\ueab6\uf459\ueb7e",
                  58509
               )
            );
         } else {
            if (var4 >= 12) {
               for (int var6 = 12; var6 < 15; var6++) {
                  if (var6 != var4 && var3.IlIo(var6)) {
                     this.IIol(
                        I1O1(
                           "\ue4ce\ue4c4拓\ue4ca\ue56a\ue5db\ue567\ue512\ue5edﭧ\ue5e3\ue591\uf8ec\ue600\ue65b\uf8bb\ue613\ue6fb\ue69b\ue6b9\ue600\ue776\ue750\ue776\ue719\ue76e\ue7d0\ue7f2\ue7c0\ue830\ue859\uf6e3\ue819\ue8ac\ue8db\ue8a2\uf640\ue965\ue907\ue924\uf7b0\ue9a4\ue9d7\ue9b0\uf702\uea20\uea7c\ueac7\uea33\uea1b\ueabb\uead6\ueab6\uf459\ueb7e",
                           58509
                        )
                     );
                     return;
                  }
               }
            }

            int var8 = var4 >= 12 ? 1800000 : 600000;
            var3.IIl_[var4] = System.currentTimeMillis() + var8;
            var3.IIlI[var4] = true;
            this.II0(var1, 1);
            this.II1.II(new IO0o(-106).III(IOol.I_1_[var4]).III(var8 / 1000));
            this.II1.ll_0();
            this.l1O0();
            this.II1.I__O();
         }
      }
   }

   private static int[] II(IO0l var0, int var1) {
      for (int var2 = 0; var2 < var0.IIl.size(); var2++) {
         int[] var3 = (int[])var0.IIl.elementAt(var2);
         if (var3[0] == var1) {
            return var3;
         }
      }

      return null;
   }

   private static boolean IlI_(int var0) {
      switch (var0) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 9:
         case 10:
         case 11:
         case 17:
         case 20:
            return true;
         case 6:
         case 7:
         case 8:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 18:
         case 19:
         default:
            return false;
      }
   }

   boolean Il0l() {
      IOol var1 = this.II();
      return var1 != null && var1.IIo(25) > 0 && System.currentTimeMillis() % 5000L < 1500L;
   }

   boolean Il01() {
      IOol var1 = this.II();
      long var2 = System.currentTimeMillis();
      return var1.IIo(105) > 0 && var2 - this.IOIO >= 5000L && var2 - this.IOI0 >= 5000L;
   }

   private void IIo(String var1) {
      this.II1.II(new IO0o(44).IIII(this.II().I1l).II(var1));
   }

   private void II1_(long var1) {
      IOol var3 = this.II();
      if (var1 - this.IOIo >= 60000L && var1 - this.IOIO < 30000L) {
         if (IOol.IIl(var3.II[6])) {
            int[] var4 = II(var3.II[6], 9);
            if (var4 != null && var4[1] < 1000) {
               var4[1]++;
               this.l1_1();
            }
         }

         this.IOIo = var1;
      }

      if (var1 - this.IOl >= 60000L) {
         this.IOl = var1;

         for (int var9 = 0; var9 < 2; var9++) {
            IO0l[] var5 = var9 == 0 ? var3.III : var3.IIII;

            for (int var6 = 0; var6 < var5.length; var6++) {
               IO0l var7 = var5[var6];
               if (var7 != null && !var7.II1_() && IOol.IIl(var7)) {
                  int[] var8 = II(var7, 9);
                  if (var8 != null && var8[1] > 0) {
                     var8[1]--;
                  }
               }
            }
         }

         this.l1_l();
         this.II1.ll_0();
      }

      this.II10(var1);
   }

   private Vector IIIl(int var1) {
      IOol var2 = this.II();
      Vector var3 = new Vector();

      for (int var4 = 0; var4 < this.II.III_.size(); var4++) {
         IO_I.III var5 = (IO_I.III)this.II.III_.elementAt(var4);
         if (this.II.III(var5) && var5.lOlo == var2.lOlo && var5.lO1 == var2.lO1) {
            long var6 = var5.I1 - var2.I1;
            long var8 = var5.I1I - var2.I1I;
            if (var6 * var6 + var8 * var8 <= (long)var1 * var1) {
               var3.addElement(var5);
            }
         }
      }

      return var3;
   }

   private void IIOO(int var1, int var2) {
      IOol var3 = this.II();

      for (int var4 = 0; var4 < this.II.length; var4++) {
         IOoI.III var5 = this.II[var4];
         if (!var5.IoOo && var5.III == null && (var5.l0o1 == 70 || var5.l0o1 == 77) && var5.llIl > 1) {
            long var6 = var5.I1 - var3.I1;
            long var8 = var5.I1I - var3.I1I;
            if (var6 * var6 + var8 * var8 <= (long)var1 * var1) {
               int var10 = (int)((long)var5.lOlO * var2 / 100L);
               if (var10 >= var5.llIl) {
                  var10 = var5.llIl - 1;
               }

               if (var10 > 0) {
                  var5.llIl -= var10;
                  this.II1.II(new IO0o(-9).II(var4).IIII(var5.llIl).IIII(var10).II(false).II(-1));
               }
            }
         }
      }
   }

   private void II1O(long var1) {
      IOol var3 = this.II();
      int var4 = var3.IIo(109);
      if (var4 > 0 && var1 - this.IOlO >= 10000L) {
         this.IOlO = var1;
         Vector var5 = this.IIIl(200);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            IO_I.III var7 = (IO_I.III)var5.elementAt(var6);
            if (!this.II.IIII(var7)) {
               int var8 = (int)((long)var7.lOlO * var4 / 100L);
               if (var8 >= var7.llIl) {
                  var8 = var7.llIl - 1;
               }

               if (var8 > 0) {
                  var7.llIl -= var8;
                  this.II1.II(new IO0o(-30).II(9).IIII(var7.I1l).IIII(var7.llIl).IIII(var7.lOlO));
               }
            }

            this.II.II(var7, Il0[this.IIl0.nextInt(Il0.length)]);
         }

         this.II.II(var3.I1, var3.I1I, 200, Il0);
         this.IIOO(200, var4);
      }

      if ((var3.IIo(117) > 0 || var3.IIo(226) > 0) && var1 - this.IOl0 >= 10000L) {
         this.IOl0 = var1;
         Vector var11 = this.IIIl(120);

         for (int var13 = 0; var13 < var11.size(); var13++) {
            this.II.II((IO_I.III)var11.elementAt(var13), Il0I[0]);
         }

         this.II.II(var3.I1, var3.I1I, 120, Il0I);
      }

      int var12 = var3.IIo(162);
      if (var12 > 0 && var1 - this.IO1I >= 1000L) {
         this.IO1I = var1;
         if (var3._loI < var3.Il1()) {
            var3._loI = Math.min(var3.Il1(), var3._loI + (int)Math.max(1L, (long)var3.Il1() * var12 / 100L));
            this.II1.II(new IO0o(-30).II(6).IIII(var3._loI));
         }
      }

      int var14 = var3.IIo(229);
      if (var14 > 0 && var1 - this.IO1l >= 30000L) {
         this.IO1l = var1;
         Vector var15 = this.IIIl(200);

         for (int var19 = 0; var19 < var15.size(); var19++) {
            IO_I.III var9 = (IO_I.III)var15.elementAt(var19);
            if (!this.II.IIII(var9)) {
               int var10 = (int)((long)var9.lOlO * var14 / 100L);
               if (var10 >= var9.llIl) {
                  var10 = var9.llIl - 1;
               }

               if (var10 > 0) {
                  var9.llIl -= var10;
                  this.II1.II(new IO0o(-30).II(9).IIII(var9.I1l).IIII(var9.llIl).IIII(var9.lOlO));
               }
            }
         }

         this.IIOO(200, var14);
      }

      if ((var3.IIo(29) > 0 || var3.IIo(115) > 0 || var3.IIo(186) > 0 || var3.IIo(163) > 0) && var1 - this.IO11 >= 30000L) {
         this.IO11 = var1;
         int var16 = Math.min(90, var3.IIo(126));
         Vector var20 = this.IIIl(200);

         for (int var23 = 0; var23 < var20.size(); var23++) {
            IO_I.III var25 = (IO_I.III)var20.elementAt(var23);
            this.II.II(var25, 30000, -1);
            if (var16 > 0) {
               var25.I1_I = var1 + 30000L;
               var25.lO__ = var16;
            }
         }
      }

      if (var3.IIo(26) > 0 && var1 - this.IOlo >= 30000L) {
         this.IOlo = var1;
         Vector var17 = this.IIIl(200);

         for (int var21 = 0; var21 < var17.size(); var21++) {
            this.II.II((IO_I.III)var17.elementAt(var21), 6000, 42);
         }
      }

      if (var3.IIo(24) > 0 && var1 - this.IO1 >= 10000L) {
         this.IO1 = var1;
         Vector var18 = this.IIIl(200);

         for (int var22 = 0; var22 < var18.size(); var22++) {
            IO_I.III var24 = (IO_I.III)var18.elementAt(var22);
            var24.I1_l = var1 + 5000L;
            this.II.II(var24, Il0l[0]);
         }

         this.II.II(var3.I1, var3.I1I, 200, Il0l);
      }
   }

   private void II10(long var1) {
      IOol var3 = this.II();
      if (var3.llIl > 0) {
         this.II1O(var1);
         int var4 = var3.IIo(8);
         if (var4 > 0 && (var3.llIl < var3.Illo() || var3._loI < var3.Il1()) && var1 - this.IOlI >= 5000L) {
            this.IOlI = var1;
            int var5 = 0;

            for (int var6 = 0; var6 < this.II.length; var6++) {
               IOoI.III var7 = this.II[var6];
               if (!var7.IoOo && var7.III == null && var7.l0o1 != 117 && var7.llIl > 1) {
                  long var8 = var7.I1 - var3.I1;
                  long var10 = var7.I1I - var3.I1I;
                  if (var8 * var8 + var10 * var10 <= 40000L) {
                     int var12 = (int)((long)var7.lOlO * var4 / 100L);
                     if (var12 >= var7.llIl) {
                        var12 = var7.llIl - 1;
                     }

                     if (var12 > 0) {
                        var7.llIl -= var12;
                        var5 += var12;
                        this.II1.II(new IO0o(-9).II(var6).IIII(var7.llIl).IIII(var12).II(false).II(-1));
                     }
                  }
               }
            }

            Vector var15 = this.IIIl(200);

            for (int var18 = 0; var18 < var15.size(); var18++) {
               IO_I.III var20 = (IO_I.III)var15.elementAt(var18);
               if (!this.II.IIII(var20)) {
                  int var9 = (int)((long)var20.lOlO * var4 / 100L);
                  if (var9 >= var20.llIl) {
                     var9 = var20.llIl - 1;
                  }

                  if (var9 > 0) {
                     var20.llIl -= var9;
                     var5 += var9;
                     this.II1.II(new IO0o(-30).II(9).IIII(var20.I1l).IIII(var20.llIl).IIII(var20.lOlO));
                  }
               }
            }

            if (var5 > 0) {
               var3.llIl = Math.min(var3.Illo(), var3.llIl + var5);
               this.II1.II(new IO0o(-30).II(5).IIII(var3.llIl));
            }
         }

         if (var3.IIo(111) > 0 && var1 - this.IOl_ >= 10000L) {
            this.IOl_ = var1;
            if (var3.Il10() > 0) {
               this.IIo(IlOo[this.IIl0.nextInt(IlOo.length)]);
               Vector var13 = this.IIIl(200);

               for (int var16 = 0; var16 < var13.size(); var16++) {
                  this.II.II((IO_I.III)var13.elementAt(var16), IlOo[this.IIl0.nextInt(IlOo.length)]);
               }

               this.II.II(var3.I1, var3.I1I, 200, IlOo);
            }
         }

         if (var1 - this.IOll >= 5000L) {
            this.IOll = var1;
            IO0l var14 = var3.II[5];
            if (var14 != null && !var14.II1_() && var14.I1l >= 618 && var14.I1l <= 626) {
               boolean var17 = false;

               for (int var19 = 0; var19 < var14.IIl.size(); var19++) {
                  int[] var21 = (int[])var14.IIl.elementAt(var19);
                  if ((var21[0] == 147 || var21[0] == 77 || var21[0] == 103) && var21[1] != 3) {
                     var21[1] = 3;
                     var17 = true;
                  }
               }

               if (var17) {
                  this.l1_1();
                  this.II1.ll_0();
               }
            }
         }
      }
   }

   private int III(IOO.IIIO var1) {
      if (var1 != null && (var1.lO0I == 1 || var1.lO0I == 3 || var1.lO0I == 5)) {
         int var2 = this.II().IIo(159);
         if (var2 <= 1) {
            return 1;
         }

         long var3 = System.currentTimeMillis();
         if (var3 - this.IOl1 < 60000L) {
            return 1;
         }

         this.IOl1 = var3;
         return var2;
      } else {
         return 1;
      }
   }

   private void III(int var1, IO0l var2) {
      IOol var3 = this.II();
      int var4 = 0;

      for (int var5 = 0; var5 < this.IIl0.size(); var5++) {
         IOoI.IIII var6 = (IOoI.IIII)this.IIl0.elementAt(var5);
         if (var6.lOlo == var3.lOlo && var6.lO1 == var3.lO1) {
            var4++;
         }
      }

      if (var4 >= 3) {
         this.IIol(
            I1O1(
               "\ue4c0嗢\ue4a2\ue4ca\ue564\ue549\ue537\ue546\ue5e6\ue5cc\ufb0a\ue5c2\ue710\uf897\ue64b\ue67e\ue76c\ue72c\uf858\ue6b9\ue6d9\ue72b\ue717\ue700零\ue7b4\ue7e7\ue7bb\ue79f\ue878",
               58509
            )
         );
      } else {
         IOoI.IIII var7 = new IOoI.IIII();
         var7.I1l = this._I00++;
         if (this._I00 > 30000) {
            this._I00 = 1;
         }

         var7.l0o1 = var2.I1l;
         var7.lOlo = var3.lOlo;
         var7.lO1 = var3.lO1;
         var7.I1 = var3.I1;
         var7.I1I = var3.I1I;
         var7.IO1O = System.currentTimeMillis() + 1800000L;
         this.IIl0.addElement(var7);
         this.II1.II(new IO0o(68).III(var7.I1l).III(var7.l0o1).III(var7.I1).III(var7.I1I).IIII(-2).III(200));
         this.II0(var1, 1);
      }
   }

   private void l1_o() {
      IOol var1 = this.II();

      for (int var2 = 0; var2 < this.IIl0.size(); var2++) {
         IOoI.IIII var3 = (IOoI.IIII)this.IIl0.elementAt(var2);
         if (var3.lOlo == var1.lOlo && var3.lO1 == var1.lO1) {
            this.II1.II(new IO0o(68).III(var3.I1l).III(var3.l0o1).III(var3.I1).III(var3.I1I).IIII(-2).III(200));
         }
      }
   }

   private void II1o(long var1) {
      IOol var3 = this.II();

      for (int var4 = this.IIl0.size() - 1; var4 >= 0; var4--) {
         IOoI.IIII var5 = (IOoI.IIII)this.IIl0.elementAt(var4);
         if (var1 > var5.IO1O) {
            this.IIl0.removeElementAt(var4);
            if (var5.lOlo == var3.lOlo && var5.lO1 == var3.lO1) {
               this.II1.II(new IO0o(-21).III(var5.I1l));
            }
         } else if (var5.lOlo == var3.lOlo && var5.lO1 == var3.lO1 && var3.llIl > 0) {
            long var6 = var3.I1 - var5.I1;
            long var8 = var3.I1I - var5.I1I;
            if (var6 * var6 + var8 * var8 < 40000L) {
               switch (var5.l0o1) {
                  case 342:
                     if (var1 - this.I_0 >= 3000L) {
                        this.I_0 = var1;
                        if (var3._loI < var3.Il1()) {
                           var3._loI = Math.min(var3.Il1(), var3._loI + var3.Il1() / 10);
                           this.II1.II(new IO0o(-30).II(6).IIII(var3._loI));
                        }
                     }
                     break;
                  case 343:
                     this.I_0l = var1 + 3000L;
                     break;
                  case 344:
                     this.I_01 = var1 + 3000L;
                     break;
                  case 345:
                     if (var1 - this.I_0I >= 3000L) {
                        this.I_0I = var1;
                        if (var3.llIl < var3.Illo()) {
                           var3.llIl = Math.min(var3.Illo(), var3.llIl + var3.Illo() / 10);
                           this.II1.II(new IO0o(-30).II(5).IIII(var3.llIl));
                        }
                     }
               }
            }
         }
      }
   }

   private void IIIl(IO0l var1) {
      IOol var2 = this.II();
      long var3 = System.currentTimeMillis();
      int[] var5 = null;

      for (int var6 = 0; var6 < var1.IIl.size(); var6++) {
         int[] var7 = (int[])var1.IIl.elementAt(var6);
         if (var7[0] == 1) {
            var5 = var7;
            break;
         }
      }

      if (var2.IOOo > var3) {
         if (var5 != null) {
            var5[1] += (int)((var2.IOOo - var3) / 60000L);
         }

         var2.IOOo = 0L;
         this.II1.II(new IO0o(-116).II(0));
         this.II1.II(new IO0o(-106).III(4387).III(0));
      } else {
         int var9 = var5 == null ? 0 : var5[1];
         if (var9 <= 0) {
            this.IIol(
               I1O1(
                  "\ue4d9\ue4c4\ue4a2突\ue57d\ue508\ue525ﮭ\ue5a5\ue4b5\ue520\ue5c2\ue669\uf89f\ue64b\ue67e\ue609\ue6f4\uf866\ue6b3\ue6d9\ue77f\ue75e\ue737\ue71b\ue7b4\ue7c0錄\ue7d1\ue874\uf6ca\ue820\ue80a",
                  58509
               )
            );
            return;
         }

         int var10 = Math.max((var9 * 60 - 30000) / 60, 0);
         var5[1] = var10;
         int var8 = Math.min((var9 - var10) * 60, 30000);
         var2.IOOo = var3 + var8 * 1000L;
         this.II1.II(new IO0o(-116).II(1));
         this.II1.II(new IO0o(-106).III(4387).III(var8));
      }

      this.l1_l();
      this.II1.I__O();
   }

   private static int IIl_(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0 + 1));
   }

   private boolean Il0_() {
      if (this.IlIl() <= 0) {
         this.IIol(I1O1("\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue4f3\ue6e2\ue600\ue72e\uf8f9\ue604", 58509));
         return true;
      } else {
         return false;
      }
   }

   private boolean III(int var1, IO0l var2) {
      IOol var3 = this.II();
      IO0l var4;
      switch (var2.I1l) {
         case 727:
         case 728:
            int var12 = var2.I1l == 727 ? 2 : 10;
            this.II0(var1, 1);
            if (this.IIl0.nextInt(100) < 90) {
               this.IIol(
                  I1O1(
                     "\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue504פֿ\ue584\ue5a0\ue58a\uf8be\ue654\ue61f\ue628\ue691\ue6bc\ue7aa\uf803\ue69a\ue738\ue754鈴\ue714\ue7b4\ue7c7\ue7ba\ue784\uf6c1\ue84c\ue86e\ue819\ue98f\ue8c5\ue8ad\ue8c9\ue964\uf7d6\ue925\ue945\ue9f7\ue9ca\ue928\ue994\uea20\uea6b\uea56\uf4fa\uea12\ueabb\ueace\ueab1\uf41f\ueb6e\ueb18",
                     58509
                  )
               );
               var3.llIl = 0;
               this.l1O0();
               this.l1lO();
            } else {
               long var15 = 0L;

               for (int var16 = 0; var16 < var12; var16++) {
                  var15 += this.III1(5000000L);
               }

               if (var15 > 0L) {
                  this.II1.II(new IO0o(-3).II(2).IIII((int)Math.min(var15, 2147483647L)));
               }

               this.II1.ll_0();
               this.l1O0();
               this.II1.I__O();
            }

            return true;
         case 962:
         case 963:
            if (this.Il0_()) {
               return true;
            }

            int[] var10 = new int[]{1087, 1088, 1089, 1090, 1091};
            var4 = new IO0l(var10[this.IIl0.nextInt(5)], 1);
            var4.III(50, IIl_(1, 16)).III(77, IIl_(1, 17)).III(103, IIl_(1, 15)).III(95, IIl_(1, 5)).III(96, IIl_(1, 5));
            int[] var14 = new int[]{94, 97, 108};
            var4.III(var14[this.IIl0.nextInt(3)], IIl_(3, 5));
            if (var2.I1l == 963) {
               var4.III(93, 7);
            } else if (this.IIl0.nextInt(100) < 98) {
               var4.III(93, 5);
            }
            break;
         case 987:
            this.IIol(
               I1O1(
                  "\ue4cf﨏\ue4a4\ue4ca\ue57fﯯ\ue567\ue512\ue5f7\ue5c5\ue5ad\ue585\ue621\ue642\uf8f4\ue67e\ue616\ue6f4\ue64f\ue6b4\ue69e\ue738\ue755劣\ue755\ue7e6泌\ue7a6\ue7d1\ue873\uf68a\ue83e",
                  58509
               )
            );
            return true;
         case 1005:
         case 1006:
            if (this.Il0_()) {
               return true;
            }

            int[] var9 = new int[]{995, 996, 997, 998, 999, 1000, 1001, 1602, 1877, 1879};
            var4 = new IO0l(var9[this.IIl0.nextInt(var9.length)], 1);
            var4.III(50, IIl_(10, 15)).III(77, IIl_(10, 15)).III(103, IIl_(10, 15)).III(231, 0);
            int[] var13 = new int[]{14, 94, 97};
            var4.III(var13[this.IIl0.nextInt(3)], IIl_(5, 12));
            break;
         case 1609:
         case 1822:
         case 1823:
            if (this.Il0_()) {
               return true;
            }

            boolean var5 = var2.I1l == 1823;
            int[] var6 = var2.I1l == 1609
               ? new int[]{1804}
               : (var5 ? new int[]{1586, 1809, 1810, 1811, 1812, 1813, 1814} : new int[]{1579, 1580, 1581, 1582, 1583, 1584, 1585});
            var4 = new IO0l(var6[this.IIl0.nextInt(var6.length)], 1);
            int var7 = var2.I1l == 1609 ? 20 : 10;
            int var8 = var2.I1l == 1609 ? 30 : (var5 ? 20 : 17);
            var4.III(50, var2.I1l == 1609 ? IIl_(20, 28) : IIl_(var7, var8)).III(77, IIl_(var7, var8)).III(103, IIl_(var7, var8));
            if (var5) {
               var4.III(210, 3);
            }

            var4.III(30, 0);
            if (this.IIl0.nextInt(100) >= 5) {
               var4.III(93, 15);
            }
            break;
         default:
            return false;
      }

      this.II0(var1, 1);
      this.III0(var4);
      this.l1_l();
      IOO.III var11 = IOO.II(var4.I1l);
      this.IIol(
         I1O1("\ue4cf嗀\ue4a5\ue4ca\ue567\ue540ﯪ\ue508\ue5a5\ue4b5\ue473ﬁ\ue662\ue600", 58509)
            + (var11 == null ? I1O1("\ue4fb度\ue4bf\ue4ca\ue579\ue540ﯮ\ue50b", 58509) : var11.II1o)
      );
      this.II1.I__O();
      return true;
   }

   boolean Il0O() {
      return this.II().IO01 > System.currentTimeMillis();
   }

   private void I1I0(int var1) {
      IOol var2 = this.II();
      long var3 = System.currentTimeMillis();
      if (var2.IO01 <= var3) {
         this.IIol(
            I1O1(
               "\ue4c0廓\ue4a6\ue4ca\ue418\ue5cb\ue567\ue50eךּ\ue5d0\ue5e3\ue58a\uf8a0\ue64e\ue613\ue67e\ue616\ue6f4\ue64f\ue6b4\ue69e\ue738\ue743\ue73e禮\ue7b4\ue7d4\ue7bb\ue790\ue830\ue847\uf6ef\ue803",
               58509
            )
         );
      } else {
         var2.IO01 += 604800000L;
         this.II0(var1, 1);
         this.IIol(I1O1("\ue4ca\ue4c5\ue4aa\ue4ca\ue561ﮉ\ue529\ue546\ue5e8ﬃ\ue5ae\ue5c2\ue675\ue648\ue6df\ue630\ue615\ue6bc\ue6d8\ue62e\ue697\ue77f", 58509));
         this.II1.I__O();
      }
   }

   String II1() {
      long var1 = this.II().IO01 - System.currentTimeMillis();
      if (var1 <= 0L) {
         return I1O1("\ue4bd\ue48c\ue4bb\ue482\ue5f3\ue55c", 58509);
      } else {
         long var3 = var1 / 60000L;
         if (var3 >= 1440L) {
            return var3 / 1440L + I1O1("\ue4ad\ue4c2\ue4ac\ue40a\ue570\ue508", 58509) + var3 % 1440L / 60L + I1O1("\ue4ad\ue4cb\ue4a2嘆", 58509);
         } else {
            return var3 >= 60L
               ? var3 / 60L + I1O1("\ue4ad\ue4cb\ue4a2嘆\ue529", 58509) + var3 % 60L + I1O1("\ue4ad\ue4dc\ue4a3\ue410\ue57d", 58509)
               : Math.max(var3, 1L) + I1O1("\ue4ad\ue4dc\ue4a3\ue410\ue57d", 58509);
         }
      }
   }

   private void III(IOoI.III var1, Vector var2) {
      IOol var3 = this.II();
      int var4 = var1.I1;
      int var5 = var1.I1I;
      if (this.IIl0.nextInt(10000) < 20) {
         int var6 = var3.lOlI > 2 ? 2 : var3.lOlI;
         int var7 = this.II01(var6);
         int[] var8 = IIIl[var6][this.II0_(var7)];
         int var9 = var8[this.IIl0.nextInt(var8.length)];
         Vector var10 = IO_I.II(var9);
         if (IOO.II(var9) != null && var10 != null) {
            IOoI.II var11 = this.II(var9, 1, var4 - 24, var5);

            for (int var12 = 0; var12 < var10.size(); var12++) {
               int[] var13 = (int[])var10.elementAt(var12);
               var11.IIl.addElement(new int[]{var13[0], var13[1]});
            }

            var11.IIl.addElement(new int[]{var7, 1});
            int[] var24 = IIIl(var7);

            for (int var26 = 0; var26 < var24.length; var26++) {
               var11.IIl.addElement(new int[]{var24[var26], 1});
            }

            var11.IIl.addElement(new int[]{30, 1});
            var11.IO1O = System.currentTimeMillis() + 120000L;
         }
      }

      boolean var15 = false;

      for (int var16 = 0; var16 < I_1l.length; var16++) {
         if (I_1l[var16] == this._IoI) {
            var15 = true;
         }
      }

      if (var15 && this.IIl0.nextInt(10000) < 100 && IOO.II != null) {
         Vector var17 = new Vector();

         for (int var18 = 0; var18 < IOO.II.length; var18++) {
            IOO.III var20 = IOO.II[var18];
            if (var20 != null
               && var20.IoI_ <= 4
               && var20.lOl_ >= 1
               && var20.lOl_ <= 3
               && (var20.IoI_ >= 4 || var20.lOlI == var3.lOlI)
               && (var20.IoI_ != 4 || var20.lOlI == 3)) {
               var17.addElement(var20);
            }
         }

         if (var17.size() > 0) {
            IOO.III var19 = (IOO.III)var17.elementAt(this.IIl0.nextInt(var17.size()));
            Vector var21 = IO_I.II(var19.I1l);
            if (var21 != null) {
               int var22 = this.IIl0.nextInt(100);
               int var23 = var22 < 55 ? 0 : (var22 < 85 ? 1 : (var22 < 97 ? 2 : 3));
               IOoI.II var25 = this.II(var19.I1l, 1, var4 + 24, var5);

               for (int var27 = 0; var27 < var21.size(); var27++) {
                  int[] var14 = (int[])var21.elementAt(var27);
                  if (var14[0] != 107) {
                     var25.IIl.addElement(new int[]{var14[0], var14[1]});
                  }
               }

               if (var23 > 0) {
                  var25.IIl.addElement(new int[]{107, var23});
               }

               var25.IO1O = System.currentTimeMillis() + 90000L;
            }
         }
      }
   }

   static int[] IIIl(int var0) {
      switch (var0) {
         case 127:
            return new int[]{140};
         case 128:
            return new int[]{139};
         case 129:
            return new int[]{141};
         case 130:
            return new int[]{142};
         case 131:
            return new int[]{143};
         case 132:
            return new int[]{144};
         case 133:
            return new int[]{136};
         case 134:
            return new int[]{137};
         case 135:
            return new int[]{138};
         case 233:
            return new int[]{234};
         case 237:
            return new int[]{238, 239, 240};
         case 241:
            return new int[]{242, 243, 244};
         case 245:
            return new int[]{246, 247, 248};
         default:
            return new int[0];
      }
   }

   void I1Io(int var1) {
      IOol var2 = this.II();
      if (var1 >= 0 && var1 <= 4) {
         if (this.IlIl() <= 0) {
            this.IIol(
               I1O1(
                  "\ue4cf嗀\ue4a5\ue4ca\ue579\ue540ﯤ\ue50f\ue5a5\ue5c7\ue530\ue5c2\ue6ec\ue654\ue61f\ue630\ue615\uf839\ue6cf\ue6fa\ue6c8\ue738\ue7c3\ue776\ue701\ue7e6異\ue7bc\ue796\ue830\ue85b\ue83c\ue802\ue8e2\ue8cc\ue8ea\ue881\ue9e8\ue949\ue92e\ue945\ue9f0\ue9d1\ue9a3\ue98f\uea67\uea3e",
                  58509
               )
            );
         } else {
            int var3 = -1;

            for (int var4 = 0; var4 < var2.III.length; var4++) {
               if (var2.III[var4] != null && var2.III[var4].I1l == 1655 && var2.III[var4].lo0I > 0) {
                  var3 = var4;
                  break;
               }
            }

            if (var3 >= 0) {
               int var10 = var2.lOlI > 2 ? 2 : var2.lOlI;
               int[] var5 = IIIl[var10][var1];
               int var6 = this.II01(var10);
               int var7 = this.II(var5, 0.65);
               IOO.III var8 = IOO.II(var7);
               if (var8 != null) {
                  IO0l var9 = this.IIIl(var7, var6);
                  this.II0(var3, 1);
                  this.III0(var9);
                  this.l1_l();
                  this.IIol(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue508\ue5ed\ufb09\ue5ad\ue5c2\ue710\ue790\uf8dc\ue63d\ue65d", 58509) + var8.II1o);
                  this.II1.I__O();
               }
            }
         }
      }
   }

   private int II(int[] var1, double var2) {
      double[] var4 = new double[var1.length];
      double var5 = 0.0;

      for (int var7 = 0; var7 < var1.length; var7++) {
         IOO.III var8 = IOO.II(var1[var7]);
         int var9 = var8 == null ? 1 : Math.max(1, var8.lOl_);
         var4[var7] = Math.pow(var2, var9 - 1);
         var5 += var4[var7];
      }

      double var10 = this.IIl0.nextDouble() * var5;

      for (int var11 = 0; var11 < var1.length; var11++) {
         var10 -= var4[var11];
         if (var10 <= 0.0) {
            return var1[var11];
         }
      }

      return var1[var1.length - 1];
   }

   private void I1l(int var1) {
      IOol var2 = this.II();
      if (this.IlIl() <= 0) {
         this.IIol(
            I1O1(
               "\ue4cf嗀\ue4a5\ue4ca\ue579\ue540ﯤ\ue50f\ue5a5\ue5c7\ue530\ue5c2\ue6ec\ue654\ue61f\ue630\ue615\uf839\ue6cf\ue6fa\ue6c8\ue738\ue7c3\ue776\ue701\ue7e6異\ue7bc\ue796\ue830\ue85b\ue83c\ue802\ue8e2\ue8cc\ue8ea\ue881\ue9e8\ue949\ue92e\ue945\ue9f0\ue9d1\ue9a3\ue98f\uea67\uea3e",
               58509
            )
         );
      } else {
         int var3 = var2.lOlI > 2 ? 2 : var2.lOlI;
         int var4 = this.II01(var3);
         int var5 = this.II0_(var4);
         int var6 = -1;
         int[] var7 = IIIl[var3][var5];

         for (int var8 = 0; var8 < var7.length; var8++) {
            IOO.III var9 = IOO.II(var7[var8]);
            if (var9 != null && var9.lOl_ == 1) {
               var6 = var7[var8];
               break;
            }
         }

         if (var6 < 0) {
            var6 = var7[0];
         }

         IOO.III var10 = IOO.II(var6);
         if (var10 != null) {
            this.II0(var1, 1);
            this.III0(this.IIIl(var6, var4));
            this.l1_l();
            this.IIol(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue508\ue5ed\ufb09\ue5ad\ue5c2\ue710\ue790\uf8dc\ue63d\ue65d", 58509) + var10.II1o);
            this.II1.I__O();
         }
      }
   }

   private void I1lI(int var1) {
      IOol var2 = this.II();
      long var3 = System.currentTimeMillis();
      var2.IO0l = (var2.IO0l > var3 ? var2.IO0l : var3) + 1800000L;
      this.II0(var1, 1);
      this.II1.II(new IO0o(-106).III(13618).III((int)Math.min(86400L, (var2.IO0l - var3) / 1000L)));
      this.IIol(
         I1O1(
            "\ue59d\ue44f\ue4eb\ue48e\ue5f0\ue546\ue520\ue546\ue5c6ﭫ\ue5e3\ue580\uf8d0\ue64e\ue61f\ue632\ue69c\ue6b0\ue69b\ue6ae\ue7fa\ue776\ue750\ue776\ue701北\ue793\ue7be虜\ue830\ue85d\ue9ef\ue804\ue8ac\ue8dd\uf667\ue89d\ue928\ue957\ue92e\uf7cc\ue9e9",
            58509
         )
      );
      this.II1.I__O();
   }

   private void I1ll(int var1) {
      IOol var2 = this.II();
      var2.IO0_ = System.currentTimeMillis() + 1800000L;
      this.II0(var1, 1);
      this.II1.II(new IO0o(-106).III(2758).III(1800));
      this.II1.I__O();
   }

   private void l1O() {
      IOol var1 = this.II();
      if (var1.IO0O > 0L && System.currentTimeMillis() >= var1.IO0O) {
         var1.IO0O = 0L;
         if (var1._11_ < 9) {
            var1._11_++;
         }

         this.IIol(
            I1O1(
               "\ue4ca\ue4c5塚\ue483\ue529\ue540ﯦ\ue508\ue5a5\ue5d7שׁ\ue581\ue621\ue64d\uf89e\ue630\ue615\ue6bc\ue6d8\uf83d\ue698\ue738\ue755立\ue71b\ue7b4\ue6a2\ue731\ue7d1\ue901\ue99f\uf6ad\ue80e\ue8ac\ue8df\ue9c9\ue887\ue96f\ue907\ue92a\ue98f\ue9ea\ue983\ue9f3\ue9c1\uea62\uf4b2\uea5d",
               58509
            )
         );
         this.II1.ll_0();
         this.l1O0();
         this.II1.I__O();
      }

      if (var1.IO01 > 0L && System.currentTimeMillis() >= var1.IO01) {
         var1.IO01 = 0L;
         this.IIol(
            I1O1(
               "\ue4c0廓\ue4a6\ue4ca\ue56a\ufbcf\ue526\ue546\ue5e7ﬅ\ue5ad\ue5c2\ue710\ue6c3\ue61f\ue636\uf8c2\ue6e8\ue69b\ue6b2\uf858\ue776\ue71b\ue776\ue718\ue7e1\ue7d2\ue7f2\ue7b6\ue879\ue84e\ue86e\ue805\uf62d\ue8c5\ue8ea\ue884\uf7af\ue94a\ue966\uf7ba\ue9a4\ue9f0\ue9a3\ue98f\uea74\uea7e\uea1e\ueb4c\uf4bf\ueabb\ueace\ueab0\uf447\ueb67\ueb16\ueb21\uf591\uebf0",
               58509
            )
         );
         this.II1.I__O();
      }

      if (var1.IOOo > 0L && System.currentTimeMillis() >= var1.IOOo) {
         var1.IOOo = 0L;
         this.II1.II(new IO0o(-116).II(0));
         this.II1.I__O();
      }

      boolean var2 = false;

      for (int var3 = 0; var3 < 15; var3++) {
         if (var1.IIlI[var3] && !var1.IlIo(var3)) {
            var1.IIlI[var3] = false;
            var1.IIl_[var3] = 0L;
            var2 = true;
         }
      }

      if (var2) {
         if (var1.llIl > var1.Illo()) {
            var1.llIl = var1.Illo();
         }

         if (var1._loI > var1.Il1()) {
            var1._loI = var1.Il1();
         }

         this.II1.ll_0();
         this.l1O0();
      }
   }

   void l1OI() {
      IOol var1 = this.II();
      long var2 = System.currentTimeMillis();

      for (int var4 = 0; var4 < 15; var4++) {
         if (var1.IIl_[var4] > var2) {
            var1.IIlI[var4] = true;
            this.II1.II(new IO0o(-106).III(IOol.I_1_[var4]).III((int)((var1.IIl_[var4] - var2) / 1000L)));
         }
      }

      if (var1.IOOo > var2) {
         this.II1.II(new IO0o(-116).II(1));
         this.II1.II(new IO0o(-106).III(4387).III((int)((var1.IOOo - var2) / 1000L)));
      }

      if (var1.IOOO > var2) {
         this.II1.II(new IO0o(-106).III(15359).III((int)((var1.IOOO - var2) / 1000L)));
      }

      if (var1.IO0l > var2) {
         this.II1.II(new IO0o(-106).III(13618).III((int)Math.min(86400L, (var1.IO0l - var2) / 1000L)));
      }

      if (var1.IO0_ > var2) {
         this.II1.II(new IO0o(-106).III(2758).III((int)((var1.IO0_ - var2) / 1000L)));
      }

      if (var1._10 == 4) {
         this.II1.II(new IO0o(-106).III(var1.lOlI == 1 ? 3901 : 3790).III((int)Math.max(0L, (600000L - (var2 - var1.IOo_)) / 1000L)));
      }

      if (var1.IO0O > var2) {
         this.II1.II(new IO0o(-106).III(3783).III((int)((var1.IO0O - var2) / 1000L)));
      }
   }

   private void II(int var1, IO0l var2, IOO.III var3) {
      IOol var4 = this.II();
      if (var4.IO_l < var3.I101) {
         this.IIol(
            I1O1(
               "\ue4de海\ue4a8\ue4ca\ue564ﮉ\ue529\ue50e\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue74f\uf89a\ue6bc\ue6c2\ue630\ue68c\ue738\ue754隣\ue700\ue7b5",
               58509
            )
         );
      } else if (!this.IIIo(var2)) {
         if (var2.I1l == 1859) {
            this.I1lO(var1);
         } else if (var2.I1l == 193) {
            this.II0(var1, 1);
            this.l1O1();
         } else if (var2.I1l == 194) {
            this.l1O1();
         } else if (var2.I1l == 380) {
            this.I1l_(var1);
         } else if (var2.I1l == 379) {
            this.I1ll(var1);
         } else if (var2.I1l >= 14 && var2.I1l <= 20) {
            this.II1.II.Il__(var2.I1l);
         } else if (var2.I1l == 1635) {
            this.I1lI(var1);
         } else if (var2.I1l == 1655) {
            this.II1.II.ll0_();
         } else if (var2.I1l == 1634) {
            this.I1l(var1);
         } else if (var2.I1l == 521) {
            this.IIIl(var2);
         } else if (var2.I1l == 454 || var2.I1l == 921 || var2.I1l == 1816) {
            this.II1.II.Iloo(var2.I1l);
         } else if (!this.II1.II.II(var1, var2)) {
            if (var2.I1l == 1703 || var2.I1l == 1717) {
               this.I1I0(var1);
            } else if (var2.I1l >= 342 && var2.I1l <= 345) {
               this.III(var1, var2);
            } else if (!this.III(var1, var2)) {
               if (!this.II1.II.IIII(var1, var2)) {
                  if (var2.I1l != 211 && var2.I1l != 212) {
                     int var5 = IIII(var3);
                     if (var5 == 8 || var5 == 9 || var5 == 10) {
                        this.I1I1(var1);
                     } else if (var5 == 7 && IOOo.III(var2.I1l) != null) {
                        this.I1I1(var1);
                     } else if (var5 < 0) {
                        switch (var3.IoI_) {
                           case 6:
                              this.I1l0(var1);
                              break;
                           case 7:
                              this.II(var1, var3);
                              break;
                           case 27:
                              if (var2.I1l == 74) {
                                 var4.llIl = var4.Illo();
                                 var4._loI = var4.Il1();
                                 this.l1O0();
                                 this.II0(var1, 1);
                              } else {
                                 this.IIol(
                                    I1O1(
                                       "\ue4ce\ue4c4\ue57b\ue48b\ue529\ue55c\ue52fﮥ\ue5a5\ue5d7אַ\ue5c2\ue665\uf8c5\ue651\ue639\ue65d\ue6ea\uf816\ue6ae\ue6d9\ue768\ue75f刺\ue718\ue7b4\ue7dd\ue732\ue788",
                                       58509
                                    )
                                 );
                              }
                              break;
                           case 29:
                           case 31:
                              this.II(var1, var2);
                              break;
                           case 33:
                              if (this.II1.II.IllI(var2.I1l)) {
                                 this.II0(var1, 1);
                              }
                              break;
                           default:
                              this.IIol(
                                 I1O1(
                                    "\ue4ce\ue4c4\ue57b\ue48b\ue529\ue55c\ue52fﮥ\ue5a5\ue5d7אַ\ue5c2\ue665\uf8c5\ue651\ue639\ue65d\ue6ea\uf816\ue6ae\ue6d9\ue768\ue75f刺\ue718\ue7b4\ue7dd\ue732\ue788",
                                    58509
                                 )
                              );
                        }
                     }
                  } else {
                     this.IIO0(var1, var2.I1l);
                  }
               }
            }
         }
      }
   }

   boolean Il00() {
      return this.IlIl() > 0;
   }

   int IlII() {
      return this.IlIl();
   }

   void l1Ol() {
      this.l1O0();
   }

   private int IlIl() {
      int var1 = 0;
      IOol var2 = this.II();

      for (int var3 = 0; var3 < var2.III.length; var3++) {
         if (var2.III[var3].II1_()) {
            var1++;
         }
      }

      return var1;
   }

   private int[] III1(int var1) {
      for (int var2 = 0; var2 < I0Io.II.length; var2++) {
         I0Io.II var3 = I0Io.II[var2];
         if (var3 != null && var3.II != null) {
            for (int var4 = 0; var4 < var3.II.length; var4++) {
               I0Io.IIIl var5 = var3.II[var4];
               if (var5.___1 == var1) {
                  return new int[]{var5.____, var5.___O};
               }
            }
         }
      }

      I0Io.II var6 = I0Io.II(var1);
      return var6 != null && var6.II != null && var6.II.length > 0 ? new int[]{var6.II[0].I1, var6.II[0].I1I} : new int[]{100, 100};
   }

   private void l1O1() {
      IOol var1 = this.II();
      int[] var2 = new int[]{21 + var1.lOlI, 47, 45, 0, 7, 14, 5, 20, 13, 24 + var1.lOlI, 27, 19, 79, 84, 154, 52};
      Vector var3 = new Vector();
      if (this._llO > 0 && (this._llO < 21 || this._llO > 23) && I0Io.II(this._llO) != null) {
         var3.addElement(new Integer(-this._llO));
      }

      for (int var4 = 0; var4 < var2.length; var4++) {
         if (I0Io.II(var2[var4]) != null) {
            var3.addElement(new Integer(var2[var4]));
         }
      }

      this.I_11 = new int[var3.size()];
      IO0o var11 = new IO0o(-91).II(this.I_11.length);
      String[] var5 = new String[]{
         I1O1("\ue4d9\ue4de\ue42a\ue483\ue529\ue438ﯢ\ue512", 58509), I1O1("\ue4c3\ue4cd\ue4a6突\ue56a", 58509), I1O1("\ue4d5\ue4cd\ue4b2\ue48e\ue568", 58509)
      };

      for (int var6 = 0; var6 < this.I_11.length; var6++) {
         int var7 = (Integer)var3.elementAt(var6);
         boolean var8 = var7 < 0;
         this.I_11[var6] = var8 ? -var7 : var7;
         I0Io.II var9 = I0Io.II(this.I_11[var6]);
         String var10 = var8
            ? I1O1("\ue4db舘\ue4eb\ue489\ue561ﯿ\ue567\ue505\ue4ec\ue59e\ue5e3", 58509) + var9.II1o
            : (this.I_11[var6] >= 21 && this.I_11[var6] <= 23 ? I1O1("\ue4db舘\ue4eb\ue484\ue561\ue5c8", 58509) : var9.II1o);
         var11.II(var10).II(var9.__1l >= 0 && var9.__1l < 3 ? var5[var9.__1l] : I1O1("\ue4db\ue5c5\ue4eb\ue49e\ue57b\ufbcd", 58509));
      }

      this.IooI = true;
      this.II1.II(var11);
   }

   synchronized void I1l1(int var1) {
      IOol var2 = this.II();
      if (var1 >= 0 && var1 < this.I_11.length) {
         int var3 = this.I_11[var1];
         if (!this.II1.II01(var3)) {
            this.II1.II(new IO0o(6).II(var2.Il11).IIII(var2.lOoO).IIII(var2._lO));
         } else {
            boolean var4 = var1 == 0 && this._llO > 0 && var3 == this._llO;
            if (var4) {
               this._llO = -1;
            } else if (var3 < 21 || var3 > 23 || var1 != 0 || this._llO <= 0) {
               this._llO = var2.lOlo;
            }

            if (var2.llIl <= 0) {
               var2.llIl = 1;
               var2._loI = 1;
               this.l1O0();
            }

            this.II1.IlOl(var3);
         }
      } else {
         this.IIol(I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50eצּ\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
      }
   }

   private void I1l_(int var1) {
      IOol var2 = this.II();
      if (this.IlIl() <= 0) {
         this.IIol(I1O1("\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue4f3\ue6e2\ue600\ue72e\uf8f9\ue604", 58509));
      } else {
         int[] var3 = new int[]{76, 188, 189, 190, 381, 382, 383, 384, 385};
         int var4 = this.IIl0.nextInt(var3.length);
         this.II0(var1, 1);
         if (var4 <= 3) {
            int var5 = 5000 + this.IIl0.nextInt(15001);
            var2.Il11 += var5;
            this.l1_();
            this.IIol(
               I1O1("\ue4cf嗀\ue4a5\ue4ca\ue567\ue540ﯪ\ue508\ue5a5\ue4b5\ue473ﬁ\ue662\ue600", 58509) + var5 + I1O1("\ue4ad\ue4da\ue42b\ue484\ue56e", 58509)
            );
         } else {
            this.III0(new IO0l(var3[var4], 1).III(73, 0));
            this.l1_l();
            IOO.III var6 = IOO.II(var3[var4]);
            this.IIol(
               I1O1("\ue4cf嗀\ue4a5\ue4ca\ue567\ue540ﯪ\ue508\ue5a5\ue4b5\ue473ﬁ\ue662\ue600", 58509)
                  + (var6 == null ? I1O1("\ue4fb度\ue4bf\ue4ca\ue579\ue540ﯮ\ue50b", 58509) : var6.II1o)
            );
         }

         this.II1.I__O();
      }
   }

   private void IIO0(int var1, int var2) {
      IOol var3 = this.II();
      if (var3._l0_ * 100 / var3._l0O > 50) {
         this.IIol(
            I1O1(
               "\ue4d9\ue4c4行\ue4ca\ue565ﯙ\ue524\ue546\ue5f3\ufb0f\ue5ad\ue5c2\ue662\ue6d2\ue651\ue67e\ue609\ue6ee\ue651\ue6b4\ue6d9\ue72d\ue707\ue773", 58509
            )
         );
      } else {
         if (var2 == 211) {
            var3._l0_ = var3._l0O;
            this.IIol(
               I1O1(
                  "\ue4d9\ue4c4行\ue4ca\ue565ﯙ\ue524\ue546\ue5e6ףּ\ue5a2\ue5c2\ue663\uf881\ue651\ue67e\ue76c\ue67f\ue69b\ue7cb\ue749炙\ue754\ue776\ue71d磊\ue7da\ue7f2\ue781\ue878\uf6ca\ue82d\ue84d\ue8bd\ue89b\ue8fa\ue8cc",
                  58509
               )
            );
         } else {
            var3._l0_ = Math.min(var3._l0O, var3._l0_ + var3._l0O * 20 / 100);
            this.IIol(
               I1O1(
                  "\ue4d9\ue4c4行\ue4ca\ue565ﯙ\ue524\ue546\ue5e6ףּ\ue5a2\ue5c2\ue663\uf881\ue651\ue67e\ue76c\ue67f\ue69b\ue7cb\ue749炙\ue754\ue776\ue71d磊\ue7da\ue7f2\ue781\ue878\uf6ca\ue82d\ue84d\ue8be\ue89b\ue8ef",
                  58509
               )
            );
         }

         this.II1.II(new IO0o(-68).III(var3._l0_));
         this.II0(var1, 1);
      }
   }

   private void I1lO(int var1) {
      IOol var2 = this.II();
      if (this.IlIl() < 12) {
         this.IIol(
            I1O1(
               "\ue4ce廓\ue4a5\ue4ca\ue5e4\ue55c\ue567\ue508\ue5edﬁ\ue5b7\ue5c2\ue630\ue612\ue61f\ue6aa\ue65d\ue6e8\ue6c9\uf80b\ue697\ue77f\ue717\ue722\ue707\ue7fb\ue7dd\ue7b5\ue7d1\ue878\ue8cf\ue820\ue805\ue8ac\ue8df\ue8b8\ue888\ue966\ue940\ue967",
               58509
            )
         );
      } else {
         int var3 = var2.lOlI;
         int var4 = var3 == 2 ? 3 : 2;
         int var5 = var3 == 0 ? 30 : 20;
         this.II0(var1, 1);
         this.III0(new IO0l(var3, 1).III(47, var4).III(107, 3).III(30, 0));
         this.III0(new IO0l(var3 == 0 ? 6 : (var3 == 1 ? 7 : 8), 1).III(6, var5).III(107, 3).III(30, 0));
         this.III0(new IO0l(var3 == 0 ? 27 : (var3 == 1 ? 28 : 29), 1).III(7, 20).III(107, 3).III(30, 0));
         this.III0(new IO0l(var3 == 0 ? 21 : (var3 == 1 ? 22 : 23), 1).III(0, 7).III(107, 3).III(30, 0));
         this.III0(new IO0l(12, 1).III(14, 1).III(107, 3).III(30, 0));
         this.III0(new IO0l(457, 10).III(30, 0));
         int[][] var6 = new int[][]{{441, 95, 5}, {442, 96, 5}, {443, 97, 5}, {444, 99, 3}, {445, 98, 3}, {446, 100, 5}, {447, 101, 5}};

         for (int var7 = 0; var7 < var6.length; var7++) {
            this.III0(new IO0l(var6[var7][0], 10).III(var6[var7][1], var6[var7][2]).III(30, 0));
         }

         this.III0(new IO0l(454, 1));
         this.III0(new IO0l(380, 10).III(30, 0));
         this.III0(new IO0l(194, 1));
         this.III0(new IO0l(1577, 1).III(50, 7).III(5, 8).III(77, 2).III(103, 1).III(93, 7));
         this.l1_l();
         this.II1.I__O();
         this.IIol(
            I1O1(
               "\ue4cf嗀\ue4a5\ue4ca\ue567\ue540ﯪ\ue508\ue5a5\ue4b5\ue473ﬁ\ue662\ue600\ue64e\ue62b\ue69d\ue6bc\ue6cf\ue638\ue697\ue738\ue743\ue73e漣\ue7b5",
               58509
            )
         );
      }
   }

   synchronized void l1O_() {
      IOol var1 = this.II();

      for (int var2 = 0; var2 < var1.III.length; var2++) {
         IOO.III var3 = IOO.II(var1.III[var2].I1l);
         if (var3 != null && var3.IoI_ == 6) {
            this.I1l0(var2);
            return;
         }
      }
   }

   private void I1l0(int var1) {
      IOol var2 = this.II();
      IO0l var3 = var2.III[var1];
      int var4 = 0;

      for (int var5 = 0; var5 < var3.IIl.size(); var5++) {
         int[] var6 = (int[])var3.IIl.elementAt(var5);
         if (var6[0] == 2) {
            var4 = var6[1] * 1000;
            break;
         }

         if (var6[0] == 48) {
            var4 = var6[1];
            break;
         }
      }

      if (var4 <= 0) {
         var4 = 100;
      }

      var2.llIl = Math.min(var2.Illo(), var2.llIl + var4);
      var2._loI = Math.min(var2.Il1(), var2._loI + var4);
      this.l1O0();
      int var8 = 1;

      try {
         var8 = Integer.parseInt(IOO.II(var3.I1l).II1o.substring(13).trim());
      } catch (Exception var7) {
      }

      this.II1.II.IIOl(var4, var8);
      this.II0(var1, 1);
   }

   void IIOo(int var1, int var2) {
      this.II0(var1, var2);
   }

   void l1OO() {
      IOol var1 = this.II();
      var1.llIl = 0;
      this.l1O0();
      this.l1lO();
   }

   private void II0(int var1, int var2) {
      IOol var3 = this.II();
      var3.III[var1].lo0I -= var2;
      if (var3.III[var1].lo0I <= 0) {
         var3.III[var1] = new IO0l();
      }

      this.l1_l();
      this.II1.I__O();
   }

   void l1O0() {
      IOol var1 = this.II();
      this.II1.II(new IO0o(-30).II(5).IIII(var1.llIl));
      this.II1.II(new IO0o(-30).II(6).IIII(var1._loI));
   }

   synchronized void l1Oo() {
      IOol var1 = this.II();
      var1.llIl = var1.Illo();
      var1._loI = var1.Il1();
      this.II1.II(new IO0o(-16));
      this.l1_();
      this.l10I();
      this.II1.III_(21 + var1.lOlI, 80, 336);
   }

   synchronized void l10() {
      IOol var1 = this.II();
      this.II1.II.II(13, 1L);
      var1.llIl = var1.Illo();
      var1._loI = var1.Il1();
      this.II1.II(new IO0o(-16));
      this.l1_();
      this.l10I();
   }

   private void l10I() {
      this.II1.II.lIll();
      this.l10l();
   }

   private void l10l() {
      if (this.II1.II.Il1I() && IO_1.II_1(this._IoI)) {
         for (int var1 = 0; var1 < this.II.length; var1++) {
            IOoI.III var2 = this.II[var1];
            if (var2.III == null && !var2.IoOo) {
               int var3 = this.II1.II.II1o(var2.l0o1);
               int var4 = this.II1.II.II_(var2.l0o1);
               if (var3 != var2._l__ || var4 != var2._l_O) {
                  int var5 = var2.IooO ? var3 * 10 : var3;
                  double var6 = var2.lOlO > 0 ? (double)var2.llIl / var2.lOlO : 1.0;
                  var2._l__ = var3;
                  var2.lOlO = var5;
                  var2.llIl = Math.max(1, (int)Math.round(var2.lOlO * var6));
                  var2._l_O = var4;
                  this.II1.II(new IO0o(-9).II(var2._l_1).IIII(var2.llIl).IIII(1).II(false).II(-1));
               }
            }
         }
      }
   }

   synchronized void II(String var1, String var2, boolean var3) {
      this.II.IIO_(var2);
      if (var3) {
         if (var1.length() > 0) {
            this.II00(
               I1O1("\ue4de艹\ue4eb\ue481\ue560ﯯ\ue529\ue546", 58509)
                  + IOO0.IIlO(var1)
                  + I1O1("\ue4ad\ue5bd\ue428\ue4ca\ue562ﮗ\ue533\ue546\ue5f1\ue5cc\ue539\ue581\ue62f", 58509)
            );
         }

         if (var2.length() > 0) {
            this.II00(
               I1O1("\ue4de艹\ue4eb\ue481\ue560ﯯ\ue529\ue546", 58509)
                  + IOO0.IIlO(var2)
                  + I1O1("\ue4ad\ue5bd\ue428\ue4ca\ue56bﮇ\ue533\ue546\ue494ﬃ\ue5b6\ue5c3", 58509)
            );
         }
      }
   }

   private void IIoI(String var1) {
      if (this.II().IOOo <= System.currentTimeMillis()) {
         this.IIol(var1);
      }
   }

   void IIol(String var1) {
      this.II1.II(new IO0o(-25).II(var1));
   }

   private boolean IIlI(String var1) {
      String var2 = var1.trim().toLowerCase();
      if (var2.startsWith(I1O1("\ue4a2", 58509))) {
         var2 = var2.substring(1).trim();
      }

      IOol var3 = this.II();
      switch (var2) {
         case I1O1("\ue4ef\ue4c3\ue4b8\ue499", 58509):
            this.II.IooO();
            return true;
         case I1O1("\ue4e9\ue4c5\ue4bf\ue482\ue56c\ue547", 58509):
         case I1O1("\ue4ef\ue4cd\ue4a4\ue49c\ue56c", 58509):
         case I1O1("\ue4f9\ue4cd\ue4a5\ue489\ue566\ue546\ue520", 58509):
            if (var3 != null && var3.III != null) {
               this.II1
                  .II
                  .Ilo_(
                     var2.equals(I1O1("\ue4e9\ue4c5\ue4bf\ue482\ue56c\ue547", 58509))
                        ? 0
                        : (var2.equals(I1O1("\ue4ef\ue4cd\ue4a4\ue49c\ue56c", 58509)) ? 1 : 2)
                  );
               return true;
            }

            this.IIol(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue56a\ue540\ue4f7\ue507\ue5a5\ue5c7\ue530\ue5c2\ue710\uf8e7\ue61f\ue62a\uf890", 58509));
            return true;
         case I1O1("\ue4ef\ue4c5\ue4ae\ue484\ue561\ue541\ue529\ue50e", 58509):
            if (var3 != null && var3.III != null) {
               if (!this.II1.II.IlOl()) {
                  this.IIol(
                     I1O1(
                        "\ue59d恵\ue4eb\ue49eﯤ\ue508\ue52c\ue50e\ue571\ue5ca\ue5a4\ue5c2\ue675\ue648\uf8fc\ue67e\ue61f\ue6f5\uf804\ue6b4\ue6d9\ue770\ue7db\ue738\ue71d",
                        58509
                     )
                  );
               }

               return true;
            }

            this.IIol(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue56a\ue540\ue4f7\ue507\ue5a5\ue5c7\ue530\ue5c2\ue710\uf8e7\ue61f\ue62a\uf890", 58509));
            return true;
         default:
            return false;
      }
   }

   synchronized void II1_(DataInputStream var1) throws IOException {
      String var2 = var1.readUTF();
      if (!this.IIlI(var2)) {
         if (this.III != null && var2.startsWith(I1O1("\ue4a2", 58509))) {
            this.III.run(var2.substring(1));
         } else if (this.II != null && (var2.equalsIgnoreCase(I1O1("\ue4ea\ue4c1", 58509)) || var2.toLowerCase().startsWith(I1O1("\ue4ea\ue4c1\ue4eb", 58509)))
            )
          {
            String var3 = var2.equalsIgnoreCase(I1O1("\ue4ea\ue4c1", 58509)) ? I1O1("\ue4ea\ue4c1", 58509) : var2.substring(3);
            this.II.run(var3);
         } else {
            this.II1.II(new IO0o(44).IIII(this.II().I1l).II(var2));
         }
      }
   }

   private I0Il.II II() {
      IOol var1 = this.II();
      I0Il.III var2 = I0Il.II(var1._lOI);
      return var2 != null && var1._lOl < var2.II.length ? var2.II[var1._lOl] : null;
   }

   String II1I() {
      I0Il.II var1 = this.II();
      return var1 == null
         ? I1O1(
            "\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue50e\ue5ea\ue544\ue5ad\ue5c2\ue675\ue648\ue6df\ue630\ue615\ue6bc\ue6d3\uf865\ue68d\ue738\ue759\ue73e\ue71c肋\ue7de\ue7f2\ue787\uf6f5\ue80f\ue826\ue804\uf64b\ue8c5\ue8ea\ue88a\ue9fb",
            58509
         )
         : I0Il.I10O(var1.II1o, this.II().lOlI);
   }

   private int II(I0Il.II var1, String var2) {
      String var3 = I0I.IIIl(this.II()._lOI, this.II()._lOl);
      if (var3 != null) {
         char var4 = var3.charAt(0);
         if (var4 == 'T') {
            return 2;
         }

         if (var4 == 'M') {
            return 5;
         }

         if (var4 == 'X') {
            return 7;
         }

         if (var4 == 'B') {
            return 8;
         }

         if (var4 == 'P') {
            return 9;
         }

         if (var4 == 'I') {
            return 4;
         }
      }

      String var5 = var2.toLowerCase();
      if (IIIl(var5, I1O1("\ue59c嗀\ue4bf\ue4ca", 58509))) {
         return 3;
      } else if (IIIl(var5, I1O1("\ue4fe敏\ue4eb\ue48eﯬ\ue546\ue520\ue546\ue5f1\ue5cdﬂ\ue58f\ue621\ue64e\ue73c\ue630\ue61a", 58509))
         || IIIl(var5, I1O1("\ue4f9嗀\ue4a4\ue4ca\ue561\ue547ﯰ\ue505\ue5a5\ue5c3\ue5aa\ue583\ue621\ue64e\ue657\uf8f3\ue60d", 58509))) {
         return 6;
      } else if (IIIl(var5, I1O1("\ue59c\ue44d\ue4a5\ue482", 58509))
         || IIIl(var5, I1O1("\ue4f9\ue4c5\ue421\ue49f\ue529\ue54c\ue52eﮡ\ue5f1", 58509))
         || IIIl(var5, I1O1("\ue4e9\ue4c5兀\ue49e", 58509))
         || IIIl(var5, I1O1("\ue4e5嗀\ue4eb", 58509))) {
         return IOO.II(var2) != null ? 1 : 0;
      } else if (IIIl(var5, I1O1("\ue4f9\ue4c4\ue4be\ue4ca\ue57d\ue540ﯪ\ue516", 58509)) || IIIl(var5, I1O1("\ue4e3\ue4c4塚\ue49e", 58509))) {
         return IOO.II(var2) != null ? 4 : 0;
      } else if (!IIIl(var5, I1O1("\ue59c\ue4c5\ue4eb", 58509))
         && !IIIl(var5, I1O1("\ue4f9勺\ue4a2\ue4ca", 58509))
         && !IIIl(var5, I1O1("\ue59c﨓\ue4a5\ue4ca", 58509))
         && !IIIl(var5, I1O1("\ue4e1\ue446\ue4a5\ue4ca\ue418\ue498ﮚ\ue508\ue5e2", 58509))) {
         return I0Il.IIlo(var1.l0_1, this.II().lOlI) >= 0 && var1.__ll <= 1 ? 2 : 0;
      } else {
         return I0Il.II1(var1.lOlo, this.II().lOlI) <= 0 && var1.lOlo != -4 ? 0 : 5;
      }
   }

   private static boolean IIIl(String var0, String var1) {
      return var0.startsWith(var1);
   }

   private boolean Il0o() {
      IOol var1 = this.II();
      Object[] var2 = I0II.II(var1._lOI, var1._lOl);
      if (var2 == null) {
         return false;
      } else {
         int var3 = (Integer)var2[0];
         String var4 = I0Il.I10O((String)var2[1], var1.lOlI);
         if (var3 == -1000) {
            this.II1.II(new IO0o(38).III(5).II(var4));
            return true;
         } else {
            int var5 = I0Il.IIlo(var3, var1.lOlI);
            IOO.IIIl var6 = IOO.II(var5);
            this.II1.II(new IO0o(38).III(var5).II(var4).III(var6 == null ? 1139 : var6.IO_l));
            return true;
         }
      }
   }

   private void II0I(int var1, int var2) {
      IOol var3 = this.II();

      for (int var4 = 0; var4 < var3.III.length && var2 > 0; var4++) {
         IO0l var5 = var3.III[var4];
         if (!var5.II1_() && var5.I1l == var1) {
            int var6 = Math.min(var2, var5.lo0I);
            var5.lo0I -= var6;
            var2 -= var6;
            if (var5.lo0I <= 0) {
               var3.III[var4] = new IO0l();
            }
         }
      }

      this.l1_l();
   }

   void l101() {
      IOol var1 = this.II();
      this.Il0o();
      if (var1._lOI == 7 && var1._lOl == 2) {
         this.III0(new IO0l(193, 75));
         this.l1_l();
      }

      if (var1._lOI == 2 && var1._lOl == 1) {
         this.II0I(73, 10);
      }

      if (var1._lOI == 3 && var1._lOl == 2) {
         this.II0I(78, 1);
      }

      if (var1._lOI == 10 && var1._lOl == 2) {
         this.III0(new IO0l(var1.lOlI == 0 ? 94 : (var1.lOlI == 1 ? 101 : 108), 1));
         this.l1_l();
      }

      I0Il.III var2 = I0Il.II(var1._lOI);
      var1._lOl++;
      var1._lO1 = 0;
      if (var2 != null && var1._lOl < var2.II.length) {
         this.II1.II(new IO0o(41));
         this.IIol(
            I1O1(
                  "\ue4c3\ue4c4\ue4a2鶴\ue564\ue508\ue531ﮃ\ue5a5\ue5d0\ue5aaﭝ\ue671\ue600\ue64b\ue636\ue618\ue6f3\ue69b\ue6b9\uf81e\ue779\ue717\ue734倫\ue7fa\ue793\ue7be\ue711\ue830",
                  58509
               )
               + I0Il.I10O(var2.II[var1._lOl].II1o, var1.lOlI)
         );
         this.l10O();
      } else {
         this.l10_();
      }

      this.II1.ll_1();
      this.II1.I__O();
   }

   private void l10_() {
      IOol var1 = this.II();
      int var2 = var1._lOI;
      long var3 = var2 < 6 ? new long[]{500L, 1000L, 1200L, 3000L, 7000L, 20000L}[var2] : 0L;
      if (var3 > 0L) {
         var3 = this.III1(var3);
         if (var3 > 0L) {
            this.II1.II(new IO0o(-3).II(2).IIII((int)var3));
         }
      }

      if (var2 > 0 && var2 < 25) {
         long var5 = 500L * (var2 + 1);
         var5 = this.III1(var5);
         if (var5 > 0L) {
            this.II1.II(new IO0o(-3).II(2).IIII((int)var5));
         }

         var1.Il11 += var2 < 5 ? 100000L * (var2 + 1) : 500000L;
         this.l1_();
      }

      int var9;
      if (var2 == 3) {
         var9 = var1.lOlI + 4;
      } else if (var2 >= 4 && var2 <= 6) {
         var9 = 7;
      } else {
         var9 = var2 + 1;
      }

      if (I0Il.II(var9) == null) {
         var9 = var2;
      }

      var1._lOI = var9;
      if (var9 == 3 && this._IoI >= 21 && this._IoI <= 23) {
         this.l1lo();
      }

      var1._lOl = 0;
      var1._lO1 = 0;
      this.II1.ll_I();
      I0Il.III var6 = I0Il.II(var9);
      if (var6 != null && var6.II.length > 0) {
         this.IIol(
            I1O1(
                  "\ue4c3\ue4c4\ue4a2鶴\ue564\ue508\ue531ﮃ\ue5a5\ue5d0\ue5aaﭝ\ue671\ue600\ue64b\ue636\ue618\ue6f3\ue69b\ue6b9\uf81e\ue779\ue717\ue734倫\ue7fa\ue793\ue7be\ue711\ue830",
                  58509
               )
               + I0Il.I10O(var6.II[0].II1o, var1.lOlI)
         );
      }

      this.l10O();
      this.l100();
      this.II1.ll_1();
   }

   void l10O() {
      I0Il.II var1 = this.II();
      if (var1 != null) {
         IOol var2 = this.II();
         if (this.II(var1, I0Il.I10O(var1.II1o, var2.lOlI)) == 6) {
            if (var1.II1o.toLowerCase().startsWith(I1O1("\ue4f9嗀\ue4a4\ue4ca\ue561\ue547ﯰ\ue505\ue5a5\ue5c3\ue5aa\ue583\ue621\ue64e\ue657\uf8f3\ue60d", 58509))
               && var2._lOO == 0) {
               return;
            }

            this.l101();
         }
      }
   }

   private void I1lo(int var1) {
      IOol var2 = this.II();
      I0Il.II var3 = this.II();
      var2._lO1 += var1;
      if (var2._lO1 >= var3.__ll) {
         this.l101();
      } else {
         this.II1.II(new IO0o(43).III(var2._lO1));
      }
   }

   private void I11(int var1) {
      I0Il.II var2 = this.II();
      if (var2 != null) {
         String var3 = I0Il.I10O(var2.II1o, this.II().lOlI);
         if (this.II(var2, var3) == 1) {
            IOO.IIII var4 = IOO.II(var3);
            if (var4 != null && var4.I1l == var1) {
               this.I1lo(1);
            }
         }
      }
   }

   private void II0l(int var1, int var2) {
      I0Il.II var3 = this.II();
      if (var3 != null) {
         String var4 = I0Il.I10O(var3.II1o, this.II().lOlI);
         if (this.II(var3, var4) == 4) {
            String var5 = I0I.IIIl(this.II()._lOI, this.II()._lOl);
            if (var5 != null && var5.startsWith(I1O1("\ue4c4\ue496", 58509))) {
               if (Integer.parseInt(var5.substring(2)) == var1) {
                  this.I1lo(var2);
               }
            } else {
               IOO.III var6 = IOO.II(var4);
               if (var6 != null && var6.I1l == var1) {
                  this.I1lo(var2);
               }
            }
         }
      }
   }

   private void I11I(int var1) {
      I0Il.II var2 = this.II();
      if (var2 != null) {
         IOol var3 = this.II();
         String var4 = I0Il.I10O(var2.II1o, var3.lOlI);
         if (this.II(var2, var4) == 5) {
            String var5 = I0I.IIIl(var3._lOI, var3._lOl);
            int var6 = I0Il.II1(var2.lOlo, var3.lOlI);
            if (var5 != null) {
               if (I0I.II(var5, var1)) {
                  this.l101();
               }
            } else if (var6 == var1) {
               this.l101();
            } else if (var3._lOI == 3 && var3._lOl == 1 && var1 >= 42 && var1 <= 44) {
               this.l101();
            }
         }
      }
   }

   void l100() {
      for (int var1 = 0; var1 < 12; var1++) {
         I0Il.II var2 = this.II();
         if (var2 == null) {
            return;
         }

         IOol var3 = this.II();
         String var4 = I0Il.I10O(var2.II1o, var3.lOlI);
         if (this.II(var2, var4) != 3) {
            return;
         }

         long var5 = II(var4);
         if (var5 <= 0L || var3.IO_l < var5) {
            return;
         }

         int var7 = var3._lOI;
         int var8 = var3._lOl;
         this.l101();
         if (var3._lOI == var7 && var3._lOl == var8) {
            return;
         }
      }
   }

   void l10o() {
      I0Il.II var1 = this.II();
      if (var1 != null) {
         IOol var2 = this.II();
         if (var2._lOI == 0 && var2._lOl == 0) {
            if (var2.I1 >= 635 && I0I.II(I0I.IIIl(0, 0), this._IoI)) {
               this.l101();
            }
         }
      }
   }

   void l1o() {
      IOol var1 = this.II();
      if (var1._lOI == 0 && var1._lOl == 3) {
         this.l101();
      }
   }

   void l1oI() {
      IOol var1 = this.II();
      if (var1._lOI == 0 && var1._lOl == 4) {
         this.l101();
      }
   }

   static long II(String var0) {
      String var1 = var0.toLowerCase();
      int var2 = var1.indexOf(I1O1("\ue59c嗀\ue4bf\ue4ca", 58509));
      if (var2 < 0) {
         return 0L;
      }

      var2 += 4;
      long var3 = 0L;

      int var5;
      for (var5 = var2; var5 < var1.length() && (var1.charAt(var5) >= '0' && var1.charAt(var5) <= '9' || var1.charAt(var5) == '.'); var5++) {
         if (var1.charAt(var5) != '.') {
            var3 = var3 * 10L + (var1.charAt(var5) - '0');
         }
      }

      while (var5 < var1.length() && var1.charAt(var5) == ' ') {
         var5++;
      }

      String var6 = var1.substring(var5);
      if (var6.startsWith(I1O1("\ue4e6", 58509))) {
         var3 *= 1000L;
      } else if (var6.startsWith(I1O1("\ue4f9\ue4de", 58509))) {
         var3 *= 1000000L;
      } else if (var6.startsWith(I1O1("\ue4f9者", 58509)) || var6.startsWith(I1O1("\ue4f9\ue4d5", 58509))) {
         var3 *= 1000000000L;
      }

      return var3;
   }

   private static String II(IOO.III1 var0) {
      String var1 = var0.lIlO == null ? "" : var0.lIlO;
      if (var1.length() == 0) {
         return I1O1("\ue4ce敏\ue4aa\ue4ca\ue561\ue5c8\ue529\ue501", 58509);
      }

      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (var4 == '_') {
            var2.append(' ');
         } else if (var3 == 0) {
            var2.append(Character.toUpperCase(var4));
         } else {
            var2.append(Character.toLowerCase(var4));
         }
      }

      return var2.toString();
   }

   synchronized void II1O(DataInputStream var1) throws IOException {
      short var2 = var1.readShort();
      IOol var3 = this.II();
      I0Il.II var4 = this.II();
      if (var4 != null) {
         String var5 = I0Il.I10O(var4.II1o, var3.lOlI);
         String var6 = I0I.IIIl(var3._lOI, var3._lOl);
         boolean var7 = var6 != null ? I0I.II(var6, var3.lOlI, var2) : this.II(var4, var5) == 2 && I0Il.IIlo(var4.l0_1, var3.lOlI) == var2;
         if (var7) {
            if (I0II.II(var3._lOI, var3._lOl) == null) {
               IOO.IIIl var17 = IOO.II(var2);
               this.II1
                  .II(
                     new IO0o(38)
                        .III(var2)
                        .II(
                           I1O1(
                              "\ue4ca\ue4c5宅\ue483\ue529\ue544ﯨ\ue50b\ue5a9\ue584\ue5a0\ue58d\ue66f\ue600\ue72e\ue6bd\ue65d\ue6f0\ue65b\ue6b7\ue6d9\ue76a漣\ue722\ue755\ue7e0異\ue7a6\ue7d0\ue830\ue867\ue8ad\ue814\ue8ac\ue8c8\uf61b\ue8c9\ue96f\uf788\ue928\ue902\ue9a4\ue9cb\ue863\ue98f\uea20\uea71\uf4d1\uea3c\uea5c\ueaf5\uead2\uea30\uead6",
                              58509
                           )
                        )
                        .III(var17 == null ? 1139 : var17.IO_l)
                  );
            }

            this.l101();
            return;
         }
      }

      if (var2 == 4) {
         this.II1.II.l_I();
      } else if (this.II1.II.II00(var2)) {
         this._l_l = -1;
      } else {
         IOO.IIIl var14 = IOO.II(var2);
         int var15 = var14 == null ? 1139 : var14.IO_l;
         String var16 = var14 == null
            ? I1O1("\ue4d5\ue4c5\ue4a5\ue4ca\ue56a\ue540\ue5a7\ue509\ue5a4", 58509)
            : I1O1("\ue4d5\ue4c5\ue4a5\ue4ca\ue56a\ue540\ue5a7\ue509\ue5a9\ue584\ue5b7\ue583\ue621\ue64c\ue6df\ue67e", 58509)
               + var14.II1o
               + I1O1("\ue4a3", 58509);
         this._l_l = var2;
         this.II1 = new Vector();
         if (var2 == 3) {
            this.II1
               .II(
                  new IO0o(32)
                     .III(var2)
                     .II(I1O1("\ue4df\ue51c\ue56a\ue484\ue56e\ue508\ue456﮵\ue5a5\ue5c7ﬤ\ue583\ue621\ue642\uf89e\ue630", 58509))
                     .II(1)
                     .II(I1O1("\ue4c0侀\ue4eb\ue498\ue4b9\ue489\ue529\ue501", 58509))
                     .III(1139)
               );
         } else {
            Vector var8 = new Vector();
            Vector var9 = IOO.IIII(var2);

            for (int var10 = 0; var10 < var9.size(); var10++) {
               IOO.III1 var11 = (IOO.III1)var9.elementAt(var10);
               if (var11.IoI_ == 1) {
                  if (!this.II1.contains(I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509))) {
                     this.II1.addElement(I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509));
                     var8.addElement(I1O1("\ue4c5視\ue4a8\ue4ca\ue562\ufbd1\ue567\ue508\ue486\ue5ca\ue5a4", 58509));
                  }
               } else {
                  boolean var12 = false;

                  for (int var13 = 0; var13 < var11.II.length; var13++) {
                     if (var11.II[var13].II.length > 0) {
                        var12 = true;
                     }
                  }

                  if (var12) {
                     this.II1.addElement(var11);
                     var8.addElement(var9.size() > 1 ? II(var11) : I1O1("\ue4ce敏\ue4aa\ue4ca\ue561\ue5c8\ue529\ue501", 58509));
                  }
               }
            }

            if (var2 == 13 && !this.II1.contains(I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509))) {
               this.II1.addElement(I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509));
               var8.addElement(I1O1("\ue4c5視\ue4a8\ue4ca\ue562\ufbd1\ue567\ue508\ue486\ue5ca\ue5a4", 58509));
            }

            if (this.II1.size() == 0) {
               this.II1
                  .II(
                     new IO0o(32)
                        .III(var2)
                        .II(
                           var16
                              + I1O1(
                                 "\ue487\ue4ef\ue4a3\ue410\ue56a\ue508\ue525\ufbc7\ue5eb\ue584\ue5a0\ue58a\ue7a0\ue649\ue61f\ue639\ue61c\ue6f1\ue6de\ue6fa\ue68f\ue76d\ue75e\ue776\ue703勞\ue792",
                                 58509
                              )
                        )
                        .II(1)
                        .II(I1O1("\ue59d\ue45f\ue4a5\ue48d", 58509))
                        .III(var15)
                  );
            } else {
               IO0o var18 = new IO0o(32)
                  .III(var2)
                  .II(var16 + I1O1("\ue487\ue4ee頻\ue484\ue529\ue54bﯠ\ue508\ue5a5\ue5c3\ue52f\ue5dd", 58509))
                  .II(var8.size() + 1);

               for (int var19 = 0; var19 < var8.size(); var19++) {
                  var18.II((String)var8.elementAt(var19));
               }

               var18.II(I1O1("\ue59d\ue45f\ue4a5\ue48d", 58509)).III(var15);
               this.II1.II(var18);
            }
         }
      }
   }

   synchronized void II10(DataInputStream var1) throws IOException {
      short var2 = var1.readShort();
      byte var3 = var1.readByte();
      if (var2 == 3 && var3 == 0) {
         this.l1_0();
      } else if (var2 == 4) {
         if (var3 == 0) {
            this.II1.II.l_II();
         }
      } else if (!this.II1.II.IIl_(var2, var3)) {
         if (var2 == this._l_l && var3 >= 0 && var3 < this.II1.size()) {
            Object var4 = this.II1.elementAt(var3);
            if (var4 instanceof IOO.III1) {
               this.II1.II.II((IOO.III1)var4);
            } else {
               this.II1.II.l1o_();
            }
         }
      }
   }

   synchronized void II1o(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      byte var3 = var1.readByte();
      if (var2 == 4) {
         this.II1.II.I11O(var3);
      }
   }

   synchronized void II_(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      byte var3 = var1.readByte();
      short var4 = var1.readShort();
      IOol var5 = this.II();
      IO0l[] var6 = var3 == 0 ? var5.II : var5.III;
      if (var4 >= 0 && var4 < var6.length && !var6[var4].II1_()) {
         IO0l var7 = var6[var4];
         IOO.III var8 = IOO.II(var7.I1l);
         if (var8 != null) {
            if (var7.I1l == 570) {
               this.IIol(
                  I1O1(
                     "\ue4cf嗀\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue5b7\ue58a\uf8c2\ue600\ue65d\ue6bf\ue613\ue6bc\ue6cd\uf877\ue68d\ue738\ue747\ue73e隆\ue7f9\ue793\ue7bc\ue711\ue869",
                     58509
                  )
               );
            } else {
               for (int var9 = 0; var9 < var7.IIl.size(); var9++) {
                  if (((int[])var7.IIl.elementAt(var9))[0] == 93) {
                     this.IIol(
                        I1O1(
                           "\ue4cf嗀\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue5b7\ue58a\uf8c2\ue600\ue65d\ue6bf\ue613\ue6bc\ue6cd\uf877\ue68d\ue738\ue747\ue73e隆\ue7f9\ue793\ue7b1\ue702\ue830\ue847\uf6ef\ue803\ue8ac\ue8d8\uf627\ue8c9\ue96c\uf7c2\ue928\ue902",
                           58509
                        )
                     );
                     return;
                  }
               }

               int var12 = var7.I1l == 457 ? 1 : var7.lo0I;
               long var10 = var7.I1l == 457 ? var8.lOo_ : var8.lOo_ / 4;
               if (var10 <= 0L) {
                  var10 = 1L;
               }

               var10 *= var12;
               if (var2 == 0) {
                  this.IooI = true;
                  this.II1
                     .II(
                        new IO0o(7)
                           .II(var3)
                           .III(var4)
                           .II(
                              I1O1("\ue4cf嗀\ue4a5\ue4ca\ue56a\ue5db\ue567\ue50b\ue5f0ﭵ\ue5ad\ue5c2\ue663\ue6c1\ue651\ue654\ue605", 58509)
                                 + var12
                                 + I1O1("\ue4ad", 58509)
                                 + var8.II1o
                                 + I1O1("\ue487\ue4da塚\ue483\ue529\ue54f\ue52e\ue587\ue5a5\ue5c8\ue523\ue5c2", 58509)
                                 + var10
                                 + I1O1("\ue4ad\ue4da\ue42b\ue484\ue56e\ue517", 58509)
                           )
                     );
               } else if (var5.Il11 + var10 > var5.IOO_) {
                  this.IIol(
                     I1O1(
                        "\ue4db\ue44c\ue4a5\ue48d\ue529\ue55b\ue526\ue513\ue5a5\ue5cf\ue5ab\ue58b\ue621\ue642\ue6de\ue630\ue65d\ue6ea\ue70b\uf839\ue68d\ue738\ue746\ue723\ue794\ue7b4\ue7d4\ue7bb浪\ue879\ue80f\ue826\uf6cc\ue8e2",
                        58509
                     )
                  );
               } else {
                  var5.Il11 += var10;
                  if (var5.lOlo == 0 || var5.lOlo == 7 || var5.lOlo == 14 || var5.lOlo == 21 || var5.lOlo == 22 || var5.lOlo == 23) {
                     this.II1.II.II(10, var7.I1l == 457 ? 1L : var7.lo0I);
                  }

                  if (var7.I1l == 457 && var7.lo0I > 1) {
                     var7.lo0I--;
                  } else {
                     var6[var4] = new IO0l();
                  }

                  if (var3 == 0) {
                     this.l1_1();
                     this.II1.ll__();
                     this.II1.ll_1();
                     this.II1.ll_0();
                  } else {
                     this.l1_l();
                  }

                  this.l1_();
                  this.IIol(
                     I1O1("\ue59d\ue44f\ue4eb\ue488\ue5e8\ue546\ue567", 58509)
                        + var8.II1o
                        + I1O1("\ue4ad\ue4d8\ue4a3\ue49f\ue529\ue439\ue4f7ﮅ\ue5e6\ue584", 58509)
                        + var10
                        + I1O1("\ue4ad\ue4da\ue42b\ue484\ue56e", 58509)
                  );
                  this.II1.I__O();
               }
            }
         }
      } else {
         this.IIol(I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50eצּ\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
      }
   }

   synchronized void IIlO(int var1, int var2) {
      IOol var3 = this.II();
      if (var2 > 0 && var2 <= 1000) {
         if (var1 == 0) {
            int var6 = var2 * 20;
            long var4 = var2 * (2L * (var3._l00 + 1000) + var6 - 20L) / 2L;
            if (var3._l00 + var6 > var3.IlI_()) {
               this.IIol(
                  I1O1(
                     "\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b吏\ue735\ue755\ue7f9裸\ue7bc\ue799",
                     58509
                  )
               );
               return;
            }

            if (!this.IIIO(var4)) {
               return;
            }

            var3._l00 += var6;
         } else if (var1 == 1) {
            int var11 = var2 * 20;
            long var7 = var2 * (2L * (var3._l0o + 1000) + var11 - 20L) / 2L;
            if (var3._l0o + var11 > var3.IlI_()) {
               this.IIol(
                  I1O1(
                     "\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b吏\ue735\ue755\ue7f9裸\ue7bc\ue799",
                     58509
                  )
               );
               return;
            }

            if (!this.IIIO(var7)) {
               return;
            }

            var3._l0o += var11;
         } else if (var1 == 2) {
            long var8 = var2 * (2L * var3._lo + var2 - 1L) / 2L * 100L;
            if (var3._lo + var2 > var3.IlIO()) {
               this.IIol(
                  I1O1(
                     "\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b吏\ue735\ue755\ue7f9裸\ue7bc\ue799",
                     58509
                  )
               );
               return;
            }

            if (!this.IIIO(var8)) {
               return;
            }

            var3._lo += var2;
         } else if (var1 == 3) {
            long var9 = 2L * (var3._lol + 5) / 2L * 100000L;
            if (var3._lol + var2 > var3.IlI0()) {
               this.IIol(
                  I1O1(
                     "\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b吏\ue735\ue755\ue7f9裸\ue7bc\ue799",
                     58509
                  )
               );
               return;
            }

            if (!this.IIIO(var9)) {
               return;
            }

            var3._lol += var2;
         } else {
            if (var1 != 4) {
               return;
            }

            long var10 = 50000000L;

            for (int var12 = 0; var12 < var3._lo1; var12++) {
               var10 *= 5L;
            }

            if (var3._lo1 + var2 > var3.IlIo()) {
               this.IIol(
                  I1O1(
                     "\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b吏\ue735\ue755\ue7f9裸\ue7bc\ue799",
                     58509
                  )
               );
               return;
            }

            if (!this.IIIO(var10)) {
               return;
            }

            var3._lo1 += var2;
         }

         if (var3.llIl > var3.Illo()) {
            var3.llIl = var3.Illo();
         }

         if (var3._loI > var3.Il1()) {
            var3._loI = var3.Il1();
         }

         this.II1.ll_0();
         this.l1O0();
         I0Il.II var13 = this.II();
         if (var13 != null
            && I0Il.I10O(var13.II1o, var3.lOlI)
               .toLowerCase()
               .startsWith(I1O1("\ue4fe敏\ue4eb\ue48eﯬ\ue546\ue520\ue546\ue5f1\ue5cdﬂ\ue58f\ue621\ue64e\ue73c\ue630\ue61a", 58509))) {
            this.l101();
         }

         this.II1.I__O();
      }
   }

   private boolean IIIO(long var1) {
      IOol var3 = this.II();
      if (var3.IO_1 < var1) {
         this.II1
            .II(
               new IO0o(-26)
                  .II(I1O1("\ue4cf嗀\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue4d2ﬅ\ue621\ue654\ue656\uf89f\ue610\ue6bc\ue6d5\ue7d9\ue697\ue77f", 58509))
            );
         return false;
      } else {
         var3.IO_1 -= var1;
         return true;
      }
   }

   boolean II11(int var1, int var2) {
      IOol var3 = this.II();
      IOO.IIIO var4 = IOO.II(var1, var2);
      if (var4 == null) {
         this.IIol(I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50eצּ\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
         return false;
      }

      int var5 = 0;
      int var6 = -1;

      for (int var7 = 0; var7 < var3.I__l.length; var7++) {
         IOO.IIIO var8 = IOO.II(var3.I__l[var7]);
         if (var8 != null && var8.lO0I == var1) {
            var5 = var8.l1__;
            var6 = var7;
            break;
         }
      }

      if (var5 >= var2) {
         this.IIol(
            I1O1(
               "\ue4cf嗀\ue4a5\ue4ca\ue418\ue5cb\ue567\ue50eרּ\ue5c7\ue5e3\ue589\uf8f8\ue600\ue651\ue75d\ue613\ue6fb\ue69b\ue6b4\ue619\ue761\ue717\ue724簾\ue7fd",
               58509
            )
         );
         return false;
      }

      if (var2 - var5 != 1) {
         this.IIol(
            I1O1(
               "\ue4cf嗀\ue4a5\ue4ca\ue56a\ue540\ue4f7\ue507\ue5a5\ue5d0\ue5abﬡ\ue621\ue648\uf8f2\ue63d\ue65d\ue6f7\uf842\ue6fa\ue697\ue61b\ue759\ue731\ue755\ue7fa\ue753\ue7ab",
               58509
            )
         );
         return false;
      }

      if (var6 < 0) {
         int[] var9 = new int[var3.I__l.length + 1];
         System.arraycopy(var3.I__l, 0, var9, 0, var3.I__l.length);
         var9[var3.I__l.length] = var4.I1l;
         var3.I__l = var9;
         this.II1.II(new IO0o(-30).II(23).III(var4.I1l));
      } else {
         var3.I__l[var6] = var4.I1l;
         this.II1.II(new IO0o(-30).II(62).III(var4.I1l));
      }

      this.II1.I__O();
      return true;
   }

   private void II(int var1, IOO.III var2) {
      IOol var3 = this.II();
      int var4 = IOO.II(var2);
      int var5 = IOO.III(var2);
      if (var4 >= 0 && var5 > 0) {
         IOO.IIIO var6 = IOO.II(var4, 1);
         if (var6 != null && (var6.l0oo == var3.lOlI || var4 == 19)) {
            if (this.II11(var4, var5)) {
               this.II0(var1, 1);
            }
         } else {
            this.IIol(I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50eצּ\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
         }
      } else {
         this.IIol(
            I1O1(
               "\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50eצּ\ue584\ue5abאָ\ue662\ue600\ue654\uf8a7\ue65d\ue6f2\ue7b8\ue6b4\ue69e\ue738\ue759\ue7b6\ue70c",
               58509
            )
         );
      }
   }

   static final class II {
      int I1l;
      int l0o1;
      int lo0I;
      int I1;
      int I1I;
      Vector IIl = new Vector();
      long IO1O;
   }

   static final class III {
      int _l_1;
      int l0o1;
      int lOl_;
      int lOlO;
      int llIl;
      int I1;
      int I1I;
      long IO10;
      boolean IoOo;
      boolean Ioo_;
      boolean IooO;
      IO_I.III III;
      int _l__;
      int _l_O;
      long I110;
      long IO1o;
      long I1l0;
      long I11o;
      long IO_;
      long IO_I;
      int lO_1;
      IOO.IIII II;
   }

   static final class IIII {
      int I1l;
      int l0o1;
      int lOlo;
      int lO1;
      int I1;
      int I1I;
      long IO1O;
   }
}
