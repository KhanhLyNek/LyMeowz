package main;

import java.io.InputStream;

public final class I1ll {
   public int II0I;
   public int I_O0;
   public int I_Oo;
   public int I_0;
   private boolean I__I;
   private Ilol III0;
   public int IIO;
   private int II;
   public int IIOI;
   public int IIOl;
   private int III;
   private int IIII;
   private int IIIl;
   private boolean I__o = true;
   public int IIlI;
   public int IIO1 = 0;
   private static I_lO II1I = new I_lO(IlI_("㥒㤆㤄㧧㧤㧞㦪㦜", 14628));
   public int IIO_ = 0;
   public long IlO_ = 0L;
   private static I_lO II1l = new I_lO(IlI_("㥒㤏㤃㧲㧔㧺㦸㦛", 14628));
   public static I_lO III0 = new I_lO(IlI_("㥒㤍㤇㧶㧥㧙㦸", 14628));
   private int[] Il1o = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
   private int[] Il_ = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
   private int[] Il_I = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
   private int[] Il1l = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
   private int[] Il11 = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
   private boolean I_O = false;
   private short[] IIl;

   private static void II(int var0) {
      for (int var1 = 0; var1 < II1I.size(); var1++) {
         I1l0 var2;
         if ((var2 = (I1l0)II1I.elementAt(var1)).I_0 == var0) {
            II1I.removeElement(var2);
            return;
         }
      }
   }

   private static void II(I1l0 var0) {
      II1I.addElement(var0);
      if (IOlO.l1oI != 130 && II1I.size() > 10) {
         for (int var1 = 0; var1 < 5; var1++) {
            II1I.removeElementAt(0);
         }
      }
   }

   public static I1l0 II(int var0) {
      for (int var1 = 0; var1 < II1I.size(); var1++) {
         I1l0 var2;
         if ((var2 = (I1l0)II1I.elementAt(var1)).I_0 == var0) {
            return var2;
         }
      }

      return null;
   }

   public I1ll() {
   }

   public I1ll(int var1, Ilol var2, int var3, int var4, int var5, byte var6) {
      this.III0 = var2;
      this.II0I = var1;
      this.IIlI = var3;
      this.III = var4;
      this.IIII = var5;
      this.IIO1 = var6;
      if (II(var1) == null) {
         I1l0 var7;
         (var7 = new I1l0()).I_0 = var1;
         if (var1 >= 42 && var1 <= 46) {
            var1 = 106;
         }

         String var8 = IlI_("㤋㤻", 14628) + IO1l.l_I0 + IlI_("㤋㤦㤄㧧㧅㧜㦪㦙㩽㩏㨻㩖", 14628) + var1 + IlI_("㤋㤧㤃㧵㧁", 14628);
         InputStream var9 = null;

         try {
            var9 = I11O.II(var8);
         } catch (Exception var11) {
         }

         if (var9 == null) {
            I_0_.II().IIII((short)var1);
         } else {
            if (var1 > 100 && var1 < 200) {
               var7.II_(var8);
            } else {
               var7.II10(var8);
            }

            var7.II01 = IO10.IIII(IlI_("㤋㤦㤄㧧㧅㧜㦪㦙㩽㩏㨻㩖", 14628) + var1 + IlI_("㤋㤪㤏㧦㦎㧏㦰㦚", 14628));
         }

         II(var7);
      }

      this.I_Oo = -1;
      this.I_0 = -1;
      this.IIO_ = -1;
      this.I_O0 = 4;
   }

   public I1ll(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.IIOI = var2;
      this.IIOl = var3;
      this.II0I = var1;
      this.IIlI = var4;
      this.III = var5;
      this.IIII = var6;
      if (II(var1) == null) {
         I1l0 var7;
         (var7 = new I1l0()).I_0 = var1;
         if (var1 >= 42 && var1 <= 46) {
            var1 = 106;
         }

         String var8 = IlI_("㤋㤻", 14628) + IO1l.l_I0 + IlI_("㤋㤦㤄㧧㧅㧜㦪㦙㩽㩏㨻㩖", 14628) + var1 + IlI_("㤋㤧㤃㧵㧁", 14628);
         InputStream var9 = null;

         try {
            var9 = I11O.II(var8);
         } catch (Exception var11) {
         }

         if (var9 == null) {
            I_0_.II().IIII((short)var1);
         } else {
            if (var1 > 100 && var1 < 200) {
               var7.II_(var8);
            } else {
               var7.II10(var8);
            }

            var7.II01 = IO10.IIII(IlI_("㤋㤦㤄㧧㧅㧜㦪㦙㩽㩏㨻㩖", 14628) + var1 + IlI_("㤋㤪㤏㧦㦎㧏㦰㦚", 14628));
         }

         II(var7);
         if (II1l.size() > 20) {
            II(Integer.parseInt((String)II1l.elementAt(0)));
            II1l.removeElementAt(0);
         }

         II1l.addElement(String.valueOf(this.II0I));
      }

      this.I_Oo = -1;
      this.I_0 = -1;
      this.I_O0 = 1;
      if (!IIIO(String.valueOf(this.II0I))) {
         III0.addElement(String.valueOf(this.II0I));
      }
   }

   private static boolean IIIO(String var0) {
      for (int var1 = 0; var1 < III0.size(); var1++) {
         if (((String)III0.elementAt(var1)).equals(var0)) {
            return true;
         }
      }

      return false;
   }

   private boolean II() {
      return this.I__o;
   }

   public void III(IO1l var1, int var2, int var3) {
      if (this.II() && II(this.II0I).II01 != null) {
         II(this.II0I).II(var1, this.II, this.IIOI + var2, this.IIOl + var3, this.IIO_, this.IIlI);
      }
   }

   public void II(IO1l var1) {
      if (this.II() && II(this.II0I) != null && II(this.II0I).II01 != null) {
         try {
            II(this.II0I).II(var1, this.II, this.IIOI, this.IIOl, this.IIO_, this.IIlI);
            return;
         } catch (Exception var3) {
            I_Ol.II__(
               IlI_("㥡㤥㤄㧤㧃㧋㧾", 14628)
                  + this.II0I
                  + IlI_("㤄㤦㤐㧳㦀㧞㦪㧝㩺㩉㨻㨔㫽㪗", 14628)
                  + this.II
                  + IlI_("㤄㤵㤋㧵㧒㧖㧾", 14628)
                  + this.IIOI
                  + IlI_("㥻", 14628)
                  + this.IIOl
                  + IlI_("㤄㥣㥂", 14628)
                  + this.IIlI
            );
            var3.printStackTrace();
         }
      }
   }

   public void IIl1() {
      try {
         if (this.II0I >= 42 && this.II0I <= 46) {
            if (this.II0I == 42) {
               this.II = this.Il1o[this.IIO];
            }

            if (this.II0I == 43) {
               this.II = this.Il_[this.IIO];
            }

            if (this.II0I == 44) {
               this.II = this.Il_I[this.IIO];
            }

            if (this.II0I == 45) {
               this.II = this.Il1l[this.IIO];
            }

            if (this.II0I == 46) {
               this.II = this.Il11[this.IIO];
            }

            this.IIO++;
            if (this.IIO > this.Il1o.length - 1) {
               this.IIO = 0;
            }

            return;
         }

         if (II(this.II0I) == null) {
            return;
         }

         if (II(this.II0I).II01 == null) {
            return;
         }

         if (this.I_O0 == 5) {
            I1l0 var1 = II(this.II0I);
            int var2 = this.III0.IOIl;
            if (var2 >= var1.IIIl.length) {
               var2 = 0;
            }

            this.IIl = var1.IIIl[var2] == null ? new short[1] : var1.IIIl[var2];
         } else {
            this.IIl = II(this.II0I).IIlI;
         }

         if (this.IIl != null) {
            if (!this.I_O) {
               this.I_O = true;
               int var4;
               if ((var4 = this.IIl.length - 1) > 0 && this.I_O0 != 1) {
                  this.IIO = I_Ol.III_(0, var4);
               }

               if (this.I_O0 == 0) {
                  this.IIO = I_Ol.III_(this.I_Oo, this.I_0);
               }
            }

            switch (this.I_O0) {
               case 0:
                  if (I_Ol.II(this.IIOI - 50, this.IIOl - 50, 100, 100, Ilol.II().I_o_, Ilol.II().I_oO) && this.IIO > this.I_Oo && this.IIO < this.I_0) {
                     if (this.IIO < this.I_0) {
                        this.IIO = this.I_0;
                     }

                     this.I__I = true;
                  }

                  if (!this.I__I) {
                     this.IIO++;
                     if (this.IIO == this.I_0) {
                        this.IIO = this.I_Oo;
                     }
                  } else if (this.IIO < this.IIl.length) {
                     this.IIO++;
                  }
                  break;
               case 1:
               case 3:
                  if (this.IIO < this.IIl.length) {
                     this.IIO++;
                  }
                  break;
               case 2:
                  if (this.IIO < this.IIl.length) {
                     this.IIO++;
                  }

                  this.IIIl++;
                  if (this.IIIl == this.IIII) {
                     this.IIIl = 0;
                     this.IIO_ = I_Ol.III_(0, 2);
                  }
                  break;
               case 4:
                  this.IIOI = this.III0.I_o_;
                  this.IIOl = this.III0.I_oO;
                  if (this.IIO < this.IIl.length) {
                     this.IIO++;
                  }
                  break;
               case 5:
                  this.IIO_ = this.III0.IOI1 == 1 ? 0 : 1;
                  if (this.III0.IOI1 == 1) {
                     this.IIOI = this.III0.I_o_ - 15;
                  } else {
                     this.IIOI = this.III0.I_o_ + 15;
                  }

                  if (this.III0.IIlo == 0) {
                     this.IIOl = this.III0.I_oO - 25;
                  } else {
                     this.IIOl = this.III0.I_oO - 35;
                  }

                  if (this.IIO < this.IIl.length) {
                     this.IIO++;
                  }
            }

            if (this.IIO <= this.IIl.length - 1) {
               this.II = this.IIl[this.IIO];
            }
         }

         if (this.IIO < this.IIl.length - 1) {
            this.I__o = true;
            return;
         }

         if (this.I_O0 == 0 || this.I_O0 == 3) {
            this.I__o = false;
         }

         if (this.IIII == -1) {
            I1lI.IIIO.removeElement(this);
         }

         if (this.I_O0 == 2) {
            this.IIO = 0;
            return;
         }

         if (this.I_O0 == 1 && this.III == 1) {
            this.I__o = false;
         }

         if (this.I_O0 == 4 || this.I_O0 == 5) {
            if (this.III == -1) {
               this.IIO = 0;
               return;
            }

            this.IIIl++;
            if (this.IIIl == this.IIII) {
               this.IIIl = 0;
               this.III--;
               this.IIO = 0;
               if (this.III == 0) {
                  this.III0.IIl(0, this.II0I);
               }
            }

            return;
         }

         this.I__I = false;
         if (this.III == -1) {
            this.IIIl++;
            this.IIO = 0;
            if (this.IIIl == this.IIII) {
               this.IIIl = 0;
               if (this.IIII > 1) {
                  this.IIO_ = I_Ol.III_(0, 2);
                  return;
               }
            }
         } else {
            this.IIIl++;
            this.IIO = 0;
            if (this.IIIl == this.IIII) {
               this.IIIl = 0;
               this.III--;
               if (this.III == 0) {
                  I1lI.IIIO.removeElement(this);
                  return;
               }
            }
         }
      } catch (Exception var3) {
         System.out.println(IlI_("㥁㤱㤐㦡㦀㧺㦸㦛㩹㩘㨮㩗㫭㫇㪲㪔㭠㭖㭨㭑", 14628) + this.II0I + IlI_("㤄㥣", 14628) + this.I_O0);
         var3.printStackTrace();
         I1lI.IIIO.removeElement(this);
      }
   }
}
