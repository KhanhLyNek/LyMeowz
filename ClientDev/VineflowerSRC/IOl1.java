package main;

import javax.microedition.lcdui.Image;

public final class IOl1 {
   public static I_lO IlI1 = new I_lO(I1I1("ᠷᠴ\u181aᣲᣘ\u18acᢔᥨ᥍", 6209));
   public int I1;
   public int I1I;
   private int IIOI;
   public int IoI_;
   public boolean I0OO;
   public int l101;
   public int I1l;
   private int IIO_;
   private int IoII;
   private static Image[] IIlI = new Image[5];
   private static Image I1;
   public boolean I0O0;
   public boolean I0Oo;
   private boolean I__l = false;
   public boolean I_OI;
   private boolean I00;
   private int IIIl;
   private int III1 = 1;
   private int III_;
   private int II0l;
   private boolean I0_0;
   private boolean I00I;
   public Ilol II1_;

   public IOl1(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      this.I1 = var1;
      this.I1I = 5;
      this.l101 = var2;
      I_Ol.II__(I1I1("᠕ᠥᠳᣛᣭᢓᢩ᥎ᤙᤠ᥊ᦶ", 6209) + var1 + I1I1("ᡡ᠙ᡂᢾ", 6209) + var2 + I1I1("ᡡ᠔᠆ᣮᣘᣡᣛ", 6209) + var5);
      this.IIOI = var3;
      this.IoI_ = var5;
      this.I0OO = var6;
      this.IIO_ = var4;
      this.IoII = var7;
      this.IIIl = 0;
      var2 = 0;

      while (var2 < 100) {
         var2++;
         this.l101 += 12;
         if (IOlO.IIIl(var1, this.l101, 2)) {
            if (this.l101 % 24 != 0) {
               this.l101 = this.l101 - this.l101 % 24;
            }
            break;
         }
      }

      I_Ol.II__(I1I1("᠘ᡒᡂᢾ", 6209) + this.l101 + I1I1("ᡬᡍᡒᢳᢐᣱᣖᤷᤔ\u1975ᥚᦻᦘ᧹᧞ᨿ\u1a1c\u1a7dᩂ᪣᪀\u1ae1᫆ᬧᬄ᭥ᭊ᮫ᮈᯩᯎᰯᰌᱭᱲ᱓ᲰᲑᳶ᳗ᴴᴕᵺᵛᶸᶙ᷾ᷟḼḝṢṃẠẁỦệἤἅὪὋᾨᾉ", 6209));
      this.I0Oo = true;
      this.I0O0 = false;
      if (this.IoII > 2) {
         this.l101 += 4;
         if (IIlI[3] == null) {
            IIlI[3] = IO10.IIIl(I1I1("ᡮ᠍\u181e\u18f7ᣓᢕᢖ\u197bᥞ\u193dᥘ᧻\u19ccᦀᦖᩪᩅᨥ\u1a1d\u1aeb\u1a9f᪨᪆᭫᭐ᬪᬆ᯿ᮑᮥᯍᱲᱏᰧ", 6209));
         }

         if (IIlI[4] == null) {
            IIlI[4] = IO10.IIIl(I1I1("ᡮ᠍\u181e\u18f7ᣓᢕᢖ\u197bᥞ\u193dᥘ᧻\u19ccᦀᦖᩪᩅᨥ\u1a1d\u1aeb\u1a9f᪨᪆᭫᭐ᬪᬆ᯿ᮑᮦᯍᱲᱏᰧ", 6209));
         }

         if (I1 == null) {
            I1 = IO10.IIIl(I1I1("ᡮ᠍\u181e\u18f7ᣓᢕᢖ\u197bᥞ\u193dᥘ᧾᧚ᦸᦖᨼᩁᨾᨈ", 6209));
         }
      } else if (IIlI[var7] == null) {
         IIlI[var7] = IO10.IIII(I1I1("ᡮ᠍\u181e\u18f7ᣓᢕᢖ\u197bᥞ\u193dᥘ᧻\u19ccᦀᦖᩪᩅᨥ\u1a1d\u1aeb\u1a9f᪨᪆᭫᭐ᬪᬆ᯿", 6209) + (var7 + 1) + I1I1("ᡯ᠐᠑\u18f9", 6209));
      }

      if (var1 > I1_I.Io1 && var1 < I1_I.Io1 + II.IIl && this.l101 > 100) {
         IO.II();
         IO.II();
         this.I__l = true;
         IO.II();
      }
   }

   public static void II(IOl1 var0) {
      IlI1.addElement(var0);
   }

   public void II(IO1l var1) {
      if (this.IoII > 2 && this.I0_0) {
         var1.II(I1, this.I1, this.l101 + 20, IOII.I_Oo);
      }
   }

   public void IIIl(IO1l var1) {
      if (!Ilol.I10I && this.I1 >= I1_I.Io1 && this.I1 <= I1_I.Io1 + II.IIl) {
         I_O1 var2 = I1_I.II[this.IIOI];
         byte var3 = 0;
         byte var4 = 0;
         if (this.IoII == 0) {
            var3 = 15;
            var4 = 40;
         }

         if (this.IoII == 1) {
            var3 = 7;
            var4 = 55;
         }

         if (this.IoII == 2) {
            var3 = 18;
            var4 = 52;
         }

         if (this.I00 && this.IoII < 3) {
            I_oo.IIII(var1, var2.II[Ilol.II[0][0][0]].II1o, this.I1 + (this.IIO_ == 1 ? var3 : -var3), this.I1I - var4, this.IIO_ == 1 ? 0 : 2, IOII.II0I);
         }

         if (this.IoII < 3) {
            var1.II(IIlI[this.IoII], 0, 0, IO1l.II(IIlI[this.IoII]), IO1l.III(IIlI[this.IoII]), this.IIO_ == 1 ? 2 : 0, this.I1, this.I1I, IOII.I_Oo);
         } else if (this.I0Oo) {
            if (this.IIIl > 10) {
               var1.II(
                  IIlI[4],
                  0,
                  0,
                  IO1l.II(IIlI[4]),
                  IO1l.III(IIlI[4]),
                  this.IIO_ == 1 ? 2 : 0,
                  this.IIO_ == 1 ? this.I1 - 11 : this.I1 + 11,
                  this.I1I + 2,
                  IOII.I_Oo
               );
            } else {
               var1.II(IIlI[3], 0, 0, IO1l.II(IIlI[3]), IO1l.III(IIlI[3]), this.IIO_ == 1 ? 2 : 0, this.I1, this.I1I, IOII.I_Oo);
            }
         } else if (this.IIIl < 20) {
            var1.II(
               IIlI[4],
               0,
               0,
               IO1l.II(IIlI[4]),
               IO1l.III(IIlI[4]),
               this.IIO_ == 1 ? 2 : 0,
               this.IIO_ == 1 ? this.I1 - 11 : this.I1 + 11,
               this.I1I + 2,
               IOII.I_Oo
            );
         } else {
            var1.II(IIlI[3], 0, 0, IO1l.II(IIlI[3]), IO1l.III(IIlI[3]), this.IIO_ == 1 ? 2 : 0, this.I1, this.I1I, IOII.I_Oo);
         }
      }
   }

   public void IIl1() {
      Il_1.II(this);
      if (this.IoII > 2 && this.I_OI && this.I1I != -80) {
         if (this.I0Oo && this.IIIl == 0) {
            if (II.IIIO % 3 == 0) {
               I_0.II(1, this.I1, this.I1I, 1, 0);
            }
         } else if (this.I0O0 && II.IIIO % 3 == 0) {
            I_0.II(1, this.I1, this.I1I + 16, 1, 1);
         }
      }

      this.III_++;
      if (this.III_ > 3) {
         this.III_ = 0;
      }

      if (this.I0Oo) {
         this.I_OI = true;
         this.I00 = this.IoI_ != 0;
         if (this.IoII < 3) {
            int var1;
            if ((var1 = this.l101 - this.I1I >> 3) <= 0) {
               var1 = 1;
               this.I_OI = false;
            }

            this.I1I += var1;
         } else {
            if (II.IIIO % 2 == 0) {
               this.III1++;
            }

            if (this.l101 - this.I1I < this.III1) {
               this.I1I = this.l101;
               this.I_OI = false;
            } else {
               this.I1I = this.I1I + this.III1;
            }
         }

         if (this.I0OO && this.IoI_ == 1 && Ilol.II().I11) {
            Ilol.II().I_o_ = this.I1;
            Ilol.II().I_oO = this.I1I - 30;
            Ilol.II().IOIl = 4;
            I1_I.Io10 = this.I1 - I1_I.IIOI;
            I1_I.Io1o = this.I1I - I1_I.IIOl - 1;
            I1_I.II.IO0 = false;
         }

         if (I1_I.II(this.I1l) != null && !this.I0OO && this.IoI_ == 1 && I1_I.II(this.I1l).I11) {
            I1_I.II(this.I1l).I_o_ = this.I1;
            I1_I.II(this.I1l).I_oO = this.I1I - 30;
            I1_I.II(this.I1l).IOIl = 4;
         }

         if (I_Ol.II1(this.I1I - this.l101) < 50 && IOlO.IIIl(this.I1, this.I1I, 2)) {
            this.I0_0 = true;
            if (this.IoII < 3) {
               IO.II();
               if (this.I1I % 24 != 0) {
                  this.I1I = this.I1I - this.I1I % 24;
               }

               this.IIIl++;
               if (this.IIIl > 10) {
                  this.IIIl = 0;
                  this.I0Oo = false;
                  this.I0O0 = true;
                  this.I_OI = false;
               }

               if (this.IoI_ == 1) {
                  if (this.I0OO) {
                     Ilol.II().I11 = false;
                  } else if (I1_I.II(this.I1l) != null) {
                     I1_I.II(this.I1l).I11 = false;
                  }

                  this.I00 = false;
               }
            } else {
               this.I1I = this.l101;
               if (!this.I00I) {
                  I_0.II(92, this.I1 + 4, this.I1I + 14, 1, 0);
                  I1_I.lII1 = 10;
                  this.I00I = true;
               }

               this.IIIl++;
               if (this.IIIl > 30) {
                  this.IIIl = 0;
                  this.I0Oo = false;
                  this.I0O0 = true;
                  this.I_OI = false;
               }

               if (this.IoI_ == 1) {
                  if (this.I0OO) {
                     Ilol.II().I11 = false;
                  } else if (I1_I.II(this.I1l) != null) {
                     I1_I.II(this.I1l).I11 = false;
                  }

                  this.I00 = false;
               }
            }
         }
      } else if (this.I0O0) {
         this.IIIl++;
         if (this.IIIl > 30) {
            int var2;
            if ((var2 = this.l101 + 24 - this.I1I >> 3) > 30) {
               var2 = 30;
            }

            this.I1I -= var2;
            this.I_OI = true;
         } else {
            if (this.IIIl == 14 && this.I__l) {
               IO.II();
            }

            if (this.IIIl > 0 && this.IoI_ == 0) {
               if (this.I0OO) {
                  Ilol.II().I11 = false;
                  if (Ilol.II().IOIl != 14) {
                     Ilol.II().IOIl = 3;
                  }

                  Ilol.II().I_oo = -3;
               } else if (I1_I.II(this.I1l) != null) {
                  I1_I.II(this.I1l).I11 = false;
                  if (I1_I.II(this.I1l).IOIl != 14) {
                     I1_I.II(this.I1l).IOIl = 3;
                  }

                  I1_I.II(this.I1l).I_oo = -3;
               }

               this.I00 = false;
            }

            if (this.IIIl > 12 && this.IoI_ == 0) {
               if (this.I0OO) {
                  Ilol.II().I11 = true;
               } else if (I1_I.II(this.I1l) != null) {
                  I1_I.II(this.I1l).I_o_ = this.I1;
                  I1_I.II(this.I1l).I_oO = this.I1I;
                  I1_I.II(this.I1l).I11 = true;
               }

               this.I00 = true;
            }
         }

         if (this.I0OO) {
            if (this.IoI_ == 0) {
               I1_I.Io10 = this.I1 - I1_I.IIOI;
               I1_I.Io1o = this.I1I - I1_I.IIOl - 1;
            }

            if (this.IoI_ == 1) {
               I1_I.II.IO0 = true;
            }
         }

         if (this.I1I <= -80) {
            if (this.I0OO && this.IoI_ == 0) {
               I1I1.I___ = false;
               Ilol.I1Oo = true;
            }

            if (!this.I0OO && this.II1_ != null && this.IoI_ == 0) {
               I1_I.II_O.removeElement(this.II1_);
            }

            if (this.IoII < 3) {
               IlI1.removeElement(this);
            } else {
               this.I1I = -80;
               this.II0l++;
               if (this.II0l > 80) {
                  this.II0l = 0;
                  IlI1.removeElement(this);
               }
            }
         }
      }

      if (this.I_OI && this.IoII < 3 && I_Ol.II1(this.I1I - this.l101) <= 50 && II.IIIO % 5 == 0) {
         I1lI.III(new I1ll(19, this.I1, this.l101 + 20, 2, 1, -1));
      }
   }
}
