package main;

import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class I1o_ extends IO1_ implements I1_1 {
   public IOI0 IIIl;
   public IOI0 III1;
   public static boolean IO0_ = false;
   private int lIo1;
   private int lIo_;
   private int IIII;
   private int IIIl;
   private boolean IO0O = false;
   private boolean IO00 = false;
   private I1Il IIlO;
   private I1Il IIl0;
   private I1Il IIlo;
   private I1Il II1;
   private I1Il II1I;
   public static boolean II_;
   public static boolean IO0o;
   public static boolean III1;
   public static boolean III_;
   public static boolean IOOO;
   public static String Illl;
   public static Image IlOO;
   public static short IIO;
   public static long IlOI;
   public static long Il1O;
   private int Ioll;
   private I1Il II1l;
   private int I1_O;
   private int lIoO;
   private int I1_o;
   private int I1O = -1;
   public static boolean IOo = false;
   private int I1OI = 2;
   private int I1Ol = 0;
   private int I1O1 = -40;
   private int I1O_ = 1;
   private I1Il II11;

   @Override
   public void I0l_() {
      IO.II();
      this.IIIl.Il_0 = true;
      this.III1.Il_0 = false;
      if (II.IIIl) {
         this.IIIl.Il_0 = false;
      }

      II.III(0);
      super.I0l_();
   }

   public I1o_() {
      this.lIoO = II.IIl1 - 30;
      if ((IOlO.l1o1 = (byte)(System.currentTimeMillis() % 9L)) == 5 || IOlO.l1o1 == 6) {
         IOlO.l1o1 = 4;
      }

      I1_I.IIlI(-1, -1);
      I1_I.Io1 = 100;
      I1_I.Io1I = 200;
      if (II.IIlI > 200) {
         this.IIIl = II.IIl1 - 80;
      } else {
         this.IIIl = II.IIl1 - 65;
      }

      this.IIII = -50;
      int var1 = II.IIl >= 200 ? 160 : 140;
      this.lIo_ = var1;
      this.Ioll = II.IIl1 - IO1_.ll11 - 5;
      if (II.IIlI <= 160) {
         this.Ioll = 20;
      }

      this.IIIl = new IOI0();
      this.IIIl.I_O0 = II.IIl1 - IO1_.ll11 - 9;
      this.IIIl.l10 = this.lIo_;
      this.IIIl.l10I = IO1_.ll11 + 2;
      this.IIIl.Il_0 = true;
      this.IIIl.Ill(0);
      this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + Il1O("\udf5b", 57204)) + IO11.I11_;
      this.III1 = new IOI0();
      this.III1.I_O0 = II.IIl1 - 4;
      this.III1.Ill(2);
      this.III1.l10 = this.lIo_;
      this.III1.l10I = IO1_.ll11 + 2;
      this.Ioll += 35;
      this.IO0O = true;
      if ((var1 = I_O1.III(Il1O("\udf17\udffb\udfd7\udfb2\udf9b", 57204))) == 1) {
         this.IO0O = true;
      } else if (var1 == 2) {
         this.IO0O = false;
      }

      this.IIIl.IIOl(I_O1.IIl(Il1O("\udf15\udff0\udfd1", 57204)));
      this.III1.IIOl(I_O1.IIl(Il1O("\udf04\udff2\udfc1\udfa2", 57204)));
      this.IIIl.IIOl((String)null);
      this.III1.IIOl((String)null);
      if (this.II11 == null) {
         this.II11 = new I1Il(Il1O("\udf33셞\udfdb\udff1\udf98\ue060\ue05a\ue021\ue005\ue0e5\ue0cf", 57204), this, 13, null);
         this.II11.I1 = II.IIl - 75;
         if (IO10.l_lI == 1 && !II.IIIl) {
            this.II11.I1I = II.IIlI - 20;
         } else {
            this.II11.I1I = 8;
         }
      }

      this.lIo1 = 0;
      this.IIlO = new I1Il(II.IIl > 200 ? IO11.I1_o : IO11.I1O, II.II, 888393, null);
      new I1Il(IO11.I_ll, this, 2001, null);
      this.IIlo = new I1Il(IO11.I1OI, this, 2002, null);
      this.II1I = new I1Il(IO11.I_l_, this, 10021, null);
      super.IIIo = this.II1 = new I1Il(IO11.I_, this, 2003, null);
      if (II.IIIl) {
         this.IIlO.I1 = II.IIl / 2 + 8;
         this.II1.I1 = II.IIl / 2 - IO1_.l_Io - 8;
         if (II.IIlI >= 200) {
            this.IIlO.I1I = this.lIoO + 110;
            this.II1.I1I = this.lIoO + 110;
         }

         this.II1I.I1 = II.IIl / 2 + 3;
         this.II1I.I1I = this.lIoO + 110;
         this.IIlo.I1 = II.IIl / 2 - 84;
         this.IIlo.I1I = this.II1.I1I;
      }

      this.I1_o = 170;
      short var2 = 184;
      if (184 >= II.IIl) {
         var2 = 152;
      }

      this.I1_O = II.IIl / 2 - var2 / 2;
      this.lIoO = II.IIl1 - 30;
      this.IIIl.II0I = this.I1_O + 10;
      this.IIIl.I_O0 = this.lIoO + 20;
      this.II1l = new I1Il(IO11.I_lI, this, 2008, null);
      this.II1l.I1 = II.IIl / 2 - 84;
      this.II1l.I1I = this.IIlO.I1I;
      this.IIl0 = new I1Il(IO11.I1lO, this, 1003, null);
      this.IIl0.I1 = II.IIl / 2 + 3;
      this.IIl0.I1I = this.IIlO.I1I;
      super.III0 = this.II1l;
      super.IIIo = this.IIl0;
   }

   public void I0OI() {
      I_Ol.II__(
         Il1O("\udf01\udfe0\udfd7\udfa3\udfd0\ue06e\ue041\ue070\ue04c", 57204) + I_O1.IIl(Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I)
      );
      String var1 = I_O1.IIl(Il1O("\udf15\udff0\udfd1", 57204));
      String var2 = I_O1.IIl(Il1O("\udf04\udff2\udfc1\udfa2", 57204));
      if ((var1 == null || var1.equals(""))
         && I_O1.IIl(Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I) != null
         && !I_O1.IIl(Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I).equals("")) {
         IOo = true;
      } else {
         IOo = false;
      }

      I_Ol.II__(Il1O("\udf1d\udfe0\udffe\udfbe\udf97\ue066\ue040\ue06d\ue05e\ue0b6\ue08a", 57204) + IOo);
      if ((var1 == null || var1.equals("")) && IOo) {
         var1 = I_O1.IIl(Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I);
         var2 = Il1O("\udf15", 57204);
      }

      I_Ol.II__(Il1O("\udf01\udfe0\udfd7\udfa3\udfd0\ue032\ue00e", 57204) + var1 + Il1O("\udf54\udfe3\udfd3\udfa2\udf83\ue032\ue00e", 57204) + var2);
      if (var1 != null && var2 != null && !var1.equals("")) {
         if (var2.equals("")) {
            this.lIo1 = 1;
            this.IIIl.Il_0 = false;
            this.III1.Il_0 = true;
            if (!II.IIIl) {
               super.IIl = this.III1.IIII;
            }
         } else {
            if (!I_0O.II().IlI_()) {
               II.II();
            }

            I_0_.II().II(var1, var2, Il1O("\udf45\udfbd\udf82\udfff\udfc2", 57204), (byte)(IOo ? 1 : 0));
            I_Ol.II__(this.getClass().getName() + Il1O("\udf54\udff7\udfdd\udf9d\udf9f\ue068\ue047\ue023\ue04c\ue0b6", 57204) + var1);
            if (I_0O.II().I0O) {
               II.IIIO();
            } else {
               II.II(IO11.Ilo1);
            }

            this.lIo1 = 0;
            if (!IOo) {
               this.I0O1();
            }

            II.IIIO = IO10.IIII() + 30000L;
         }
      }
   }

   public void I0Ol() {
      if (this.IO0O) {
         I_O1.IIIl(Il1O("\udf17\udffb\udfd7\udfb2\udf9b", 57204), 1);
         I_O1.III1(Il1O("\udf15\udff0\udfd1", 57204), this.IIIl.IIl1().toLowerCase().trim());
         I_O1.III1(Il1O("\udf04\udff2\udfc1\udfa2", 57204), this.III1.IIl1().toLowerCase().trim());
      } else {
         I_O1.IIIl(Il1O("\udf17\udffb\udfd7\udfb2\udf9b", 57204), 2);
         I_O1.III1(Il1O("\udf15\udff0\udfd1", 57204), "");
         I_O1.III1(Il1O("\udf04\udff2\udfc1\udfa2", 57204), "");
      }
   }

   @Override
   public void IIlO() {
      if (IIO > 0) {
         II.IIIO();
         if ((Il1O = System.currentTimeMillis()) - IlOI >= 1000L) {
            if (--IIO == 0) {
               II.II.I0OI();
            }

            IlOI = Il1O;
         }
      }

      if (IOo && !this.IO00) {
         this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + Il1O("\udf5b", 57204)) + IO11.I11_;
         this.III1.II1o = IO11.I1l0;
         this.IIIl.I0O_ = false;
         this.III1.I0O_ = false;
         this.IIIl.IIlO();
         this.III1.IIlO();
      } else {
         this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + Il1O("\udf5b", 57204)) + IO11.I11_;
         this.III1.II1o = IO11.I1l0;
         this.IIIl.IIlO();
         this.III1.IIlO();
      }

      for (int var1 = 0; var1 < I1l1.II1_.size(); var1++) {
         ((I1l1)I1l1.II1_.elementAt(var1)).IIlO();
      }

      if (II_ && !IO0o && !IOOO && !III1 && !III_) {
         II_ = false;
         System.gc();
         I_0_.II().IoOo();
      }

      if (++I1_I.Io1 > II.IIl * 3 + 100) {
         I1_I.Io1 = 100;
      }

      if (Ilo1.III == null) {
         if (this.IIIl != this.IIII) {
            this.IIII = this.IIII + (this.IIIl - this.IIII >> 1);
         }

         if (this.I1Ol >= 0) {
            this.I1O1 = this.I1O1 + this.I1O_ * this.I1Ol;
            this.I1Ol = this.I1Ol + this.I1O_ * this.I1OI;
            if (this.I1Ol <= 0) {
               this.I1O_ = -this.I1O_;
            }

            if (this.I1O1 > 0) {
               this.I1O_ = -this.I1O_;
               this.I1Ol = this.I1Ol - 2 * this.I1OI;
            }
         }

         if (this.I1O >= 0 && II.IIIO % 100 == 0) {
            this.I1O++;
            if (this.I1O >= IO11.II0O.length) {
               this.I1O = 0;
            }

            if (II.II == II.II && II.II.I_1o) {
               II.II.II10(IO11.II0O[this.I1O]);
            }
         }

         if (IOo && !this.IO00) {
            this.IIIl.I0O_ = false;
            this.III1.I0O_ = false;
            this.IIIl.IIlO();
            this.III1.IIlO();
         } else {
            this.IIIl.II1o = (IO11.IllI == 2 ? "" : IO11.I111 + Il1O("\udf5b", 57204)) + IO11.I11_;
            this.III1.II1o = IO11.I1l0;
            this.IIIl.IIlO();
            this.III1.IIlO();
         }

         if (II.IIIl) {
            if (this.IO00) {
               super.III0 = this.IIlo;
               super.IIIo = this.II1I;
            } else {
               super.III0 = this.II1l;
               super.IIIo = this.IIl0;
            }
         } else if (this.IO00) {
            super.III0 = this.IIlo;
            super.IIIo = this.II1I;
         } else {
            super.III0 = this.II1l;
            super.IIIo = this.IIl0;
         }
      }
   }

   @Override
   public void IIO1(int var1) {
      if (this.IIIl.Il_0) {
         this.IIIl.II1o(var1);
      } else if (this.III1.Il_0) {
         this.III1.II1o(var1);
      }

      super.IIO1(var1);
   }

   @Override
   public void III_(IO1l var1) {
      II.III1(var1);
      int var2 = this.IIIl.I_O0 - 50;
      if (II.IIlI <= 220) {
         var2 += 5;
      }

      IO1I.II1I.II(var1, Il1O("\udf02\udfa2\udf9c\udfe1\udfde\ue03d", 57204), II.IIl - 2, 17, 1, IO1I.IIlO);
      if (IO10.l_lI == 1 && !II.IIIl) {
         IO1I.II1I.II(var1, I_0l.IlI1, II.IIl - 2, II.IIlI - 15, 1, IO1I.IIlO);
      } else {
         IO1I.II1I.II(var1, I_0l.IlI1, II.IIl - 2, 2, 1, IO1I.IIlO);
      }

      if (Ilo1.III == null && Ilo1.IIII == null) {
         if (II.II == null) {
            int var3 = II.IIl >= 200 ? 180 : 160;
            I__O.II(var1, this.I1_O, this.lIoO - 10, var3, 105, -1, true);
            if (II.IIlI > 160 && IlOO != null) {
               var1.II(IlOO, II.IIll, var2, 3);
            }

            short var4 = 184;
            if (184 >= II.IIl) {
               var4 = 152;
            }

            this.I1_O = II.IIl / 2 - var4 / 2;
            this.IIIl.II0I = this.I1_O + 10;
            this.IIIl.I_O0 = this.lIoO + 20;
            this.III1.II0I = this.I1_O + 10;
            this.III1.I_O0 = this.lIoO + 55;
            this.IIIl.III_(var1);
            this.III1.III_(var1);
            if (II.IIl < 176) {
               IO1I.IIIO.II(var1, IO11.I11O + Il1O("\udf4e", 57204), this.IIIl.II0I - 35, this.IIIl.I_O0 + 7, 0);
               IO1I.IIIO.II(var1, IO11.I110 + Il1O("\udf4e", 57204), this.III1.II0I - 35, this.III1.I_O0 + 7, 0);
               IO1I.IIIO.II(var1, IO11.I101 + Il1O("\udf4e\udfb3", 57204) + Illl, II.IIl / 2, this.III1.I_O0 + 32, 2);
            }
         }

         super.III_(var1);
      }
   }

   @Override
   public void I_Il() {
      if (II.IIIl && this.II11 != null && this.II11.II0o()) {
         this.II11.I0lO();
      }

      if (!IO0_) {
         if (!II.IIIl) {
            if (this.IIIl.Il_0) {
               super.IIl = this.IIIl.IIII;
            } else {
               super.IIl = this.III1.IIII;
            }
         }

         if (II.II[2]) {
            this.lIo1--;
            if (this.lIo1 < 0) {
               this.lIo1 = 1;
            }
         } else if (II.II[8]) {
            this.lIo1++;
            if (this.lIo1 > 1) {
               this.lIo1 = 1;
            }
         }

         if (II.II[2] || II.II[8]) {
            II.IIIl();
            if (!IOo || this.IO00) {
               if (this.lIo1 == 1) {
                  this.IIIl.Il_0 = false;
                  this.III1.Il_0 = true;
               } else if (this.lIo1 == 0) {
                  this.IIIl.Il_0 = true;
                  this.III1.Il_0 = false;
               } else {
                  this.IIIl.Il_0 = false;
                  this.III1.Il_0 = false;
               }
            }
         }

         if (II.IIIl) {
            if (this.IO00) {
               super.III0 = this.IIlo;
               super.IIIo = this.II1I;
            } else {
               super.III0 = this.II1l;
               super.IIIo = this.IIl0;
            }
         } else if (this.IO00) {
            super.III0 = this.IIlo;
            super.IIIo = this.II1I;
         } else {
            super.III0 = this.II1l;
            super.IIIo = this.IIl0;
         }

         if (II.IIIo && (!IOo || this.IO00)) {
            if (II.II(this.IIIl.II0I, this.IIIl.I_O0, this.IIIl.l10, this.IIIl.l10I)) {
               this.lIo1 = 0;
            } else if (II.II(this.III1.II0I, this.III1.I_O0, this.III1.l10, this.III1.l10I)) {
               this.lIo1 = 1;
            }
         }

         super.I_Il();
         II.IIIl();
      }
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 13:
            switch (IO10.l_lI) {
               case 1:
                  IO10.IOlI();
                  return;
               case 2:
               case 4:
               default:
                  return;
               case 3:
               case 5:
                  return;
               case 6:
                  return;
            }
         case 1000:
            try {
               GameMidlet.II.platformRequest((String)var2);
            } catch (Exception var11) {
               var11.printStackTrace();
            }

            II.III_();
            return;
         case 1001:
            II.III_();
            this.IO00 = false;
            return;
         case 1002:
            II.IIIO();
            String var4;
            if ((var4 = I_O1.IIl(Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I)) != null && !var4.equals("")) {
               I1o_ var14 = II.II;
               IOo = true;
               II.II();
               I_0_.II().Io__();
               I_0_.II().II(var4, "", Il1O("\udf45\udfbd\udf82\udfff\udfc2", 57204), (byte)1);
               return;
            }

            I_0_.II().IIO("");
            return;
         case 1003:
            II.II(IO11.I11o);
            return;
         case 1004:
            I_0l.Io1O();
            II.II.I0l_();
            return;
         case 1005:
            try {
               GameMidlet.II
                  .platformRequest(
                     Il1O(
                        "\udf1c\udfe7\udfc6\udfa1\udfca\ue020\ue001\ue023\ue00b\ue0e4\ue0c9\ue0bb\ue087\ue169\ue141\ue12a\ue10a\ue1ef\ue1cb\ue1af\ue185\ue1d1\ue27d\ue252\ue231",
                        57204
                     )
                  );
               return;
            } catch (Exception var10) {
               var10.printStackTrace();
               return;
            }
         case 2000:
            return;
         case 2001:
            if (this.IO0O) {
               this.IO0O = false;
               return;
            }

            this.IO0O = true;
            return;
         case 2002:
            I1o_ var5 = this;
            if (this.IIIl.IIl1().equals("")) {
               II.II(IO11.IlO);
            } else {
               this.IIIl.IIl1().toCharArray();
               if (this.III1.IIl1().equals("")) {
                  II.II(IO11.I1Io);
               } else {
                  if (this.IIIl.IIl1().length() >= 5) {
                     String var13 = null;
                     boolean var15;
                     if (IO11.IllI == 2) {
                        if (this.IIIl.IIl1().indexOf(Il1O("\udf34", 57204)) == -1 || this.IIIl.IIl1().indexOf(Il1O("\udf5a", 57204)) == -1) {
                           var13 = IO11.I1ll;
                        }

                        var15 = false;
                     } else {
                        try {
                           Long.parseLong(var5.IIIl.IIl1());
                           if (var5.IIIl.IIl1().length() < 8
                              || var5.IIIl.IIl1().length() > 12
                              || !var5.IIIl.IIl1().startsWith(Il1O("\udf44", 57204)) && !var5.IIIl.IIl1().startsWith(Il1O("\udf4c\udfa7", 57204))) {
                              var13 = IO11.I1lI;
                           }

                           var15 = true;
                        } catch (Exception var12) {
                           if (this.IIIl.IIl1().indexOf(Il1O("\udf34", 57204)) == -1 || this.IIIl.IIl1().indexOf(Il1O("\udf5a", 57204)) == -1) {
                              var13 = IO11.I1ll;
                           }

                           var15 = false;
                        }
                     }

                     if (var13 != null) {
                        II.II(var13);
                     } else {
                        II.II
                           .II(
                              IO11.I11l
                                 + (var15 ? IO11.I111 + Il1O("\udf4e\udfb3", 57204) : IO11.I11_ + Il1O("\udf4e\udfb3", 57204))
                                 + this.IIIl.IIl1()
                                 + Il1O("\udf7e", 57204)
                                 + IO11.I1l0
                                 + Il1O("\udf4e\udfb3", 57204)
                                 + this.III1.IIl1(),
                              new I1Il(IO11.I_l1, this, 4000, null),
                              (I1Il)null,
                              new I1Il(IO11.I_IO, II.II, 8882, null)
                           );
                     }

                     II.II = II.II;
                     return;
                  }

                  II.II(IO11.I1l);
               }
            }
            break;
         case 2003:
            I_lO var6;
            (var6 = new I_lO(Il1O("\udf02\udfde\udfd7\udfbf\udf85\ue02f\ue062\ue022\ue00b\ue0e2\ue0c4", 57204)))
               .addElement(new I1Il(IO11.I1l1, this, 2004, null));
            if (!IOo) {
               var6.addElement(new I1Il(IO11.I1l_, this, 1004, null));
            }

            var6.addElement(new I1Il(IO11.I1lO, this, 1003, null));
            var6.addElement(new I1Il(IO11.I10l, this, 1005, null));
            if (I_O1.III(Il1O("\udf18\udffc\udfc5\udf96\udf82\ue06e\ue05e\ue025\ue005\ue0e8", 57204)) == 1) {
               var6.addElement(new I1Il(IO11.I_OO, this, 10041, null));
            } else {
               var6.addElement(new I1Il(IO11.I_O0, this, 10042, null));
            }

            var6.addElement(new I1Il(IO11.I_I0, II.II, 8885, null));
            II.II.II(var6);
            return;
         case 2004:
            this.III_();
            return;
         case 2008:
            I_O1.III1(Il1O("\udf15\udff0\udfd1", 57204), this.IIIl.IIl1().trim());
            I_O1.III1(Il1O("\udf04\udff2\udfc1\udfa2", 57204), this.III1.IIl1().trim());
            if (I_0l.I0_O) {
               II.II.I0l_();
               return;
            }

            II.II.Io_l();
            return;
         case 4000:
            String var3 = this.IIIl.IIl1();
            II.III(IO11.I1O_);
            II.II();
            II.III(IO11.Ilo0);
            I_0_ var7 = I_0_.II();
            String var8 = this.III1.IIl1();
            String var9 = I_O1.IIl(Il1O("\udf01\udfe0\udfd7\udfa3\udfb1\ue060", 57204) + I_0l.l1_I);
            I_O1.IIl(Il1O("\udf04\udff2\udfc1\udfa2\udfb1\ue060", 57204));
            var7.II(var3, var8, var9, Il1O("\udf45\udfbd\udf82\udfff\udfc2", 57204));
            I_O1.III1(Il1O("\udf15\udff0\udfd1", 57204), var3);
            I_O1.III1(Il1O("\udf04\udff2\udfc1\udfa2", 57204), this.III1.IIl1());
            break;
         case 10021:
            this.I0O1();
            return;
         case 10041:
            I_O1.IIIl(Il1O("\udf18\udffc\udfc5\udf96\udf82\ue06e\ue05e\ue025\ue005\ue0e8", 57204), 0);
            II.II(IO11.IO1, 8885, null);
            return;
         case 10042:
            I_O1.IIIl(Il1O("\udf18\udffc\udfc5\udf96\udf82\ue06e\ue05e\ue025\ue005\ue0e8", 57204), 1);
            II.II(IO11.IO1, 8885, null);
            return;
      }
   }

   private void I0O1() {
      if (IOo) {
         this.I0OI();
      } else {
         this.IO00 = false;
         this.III1.Il_0 = false;
         this.IIIl.Il_0 = true;
         super.IIIo = this.II1;
      }
   }

   public void III_() {
      II.III_();
      II.II(IO11.Ioo);
      this.IO00 = true;
      this.III1.Il_0 = false;
      this.IIIl.Il_0 = true;
   }

   public static void I0O_() {
      II.IIIO = IO10.IIII() + 30000L;
      I_0l.IoII = 0;
      I1o_ var0 = II.II;
      if (IOo) {
         II.II(IO11.Io0o, new I1Il(IO11.I_I_, II.II, 10019, null), new I1Il(IO11.I_IO, II.II, 10020, null));
      } else {
         II.II(II.II);
      }
   }

   static {
      int[] var10000 = new int[]{0, 8, 2, 6, 9};
   }
}
