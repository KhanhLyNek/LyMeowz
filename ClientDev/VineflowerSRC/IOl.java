package main;

public final class IOl implements I1_1 {
   int II0I;
   private int III;
   int I_O0;
   private int IIII;
   I1Il IIOO;
   I1Il III_;
   private int IIIl = 24;
   public int IIO = 0;
   private int III1 = 50;
   public static I_O_ III1;
   public int IIOl;
   public int IIlI;
   public int IIO1;
   public int IIO_;
   public boolean I1lI;
   public boolean I1ll;
   public String Ill_;
   private I_lO II1I = new I_lO(I1Il("䡽䡣䠽䠍䣪䣕", 18443));
   int II0;
   int II;

   public void IIlI(boolean var1) {
      Ilol.II();
      this.I1lI = true;
      this.I1ll = false;
      if (this.I1ll) {
         this.I_O0 = 170;
         this.IIII = 118;
         this.II0I = II.IIl / 2 - this.I_O0 / 2;
         this.III = II.IIlI / 2 - this.IIII / 2;
      } else {
         this.I_O0 = 170;
         this.IIII = 170;
         this.II0I = II.IIl / 2 - this.I_O0 / 2;
         this.III = II.IIlI / 2 - this.IIII / 2;
         if (II.IIlI < 240) {
            this.III -= 10;
         }
      }

      this.IIlI = this.II0I;
      this.IIOl = 0;
      this.IIO = Iloo.IIlo.size();
      if (II.IIIl) {
         this.IIOO.I1 = this.II0I;
         this.IIOO.I1I = this.III + this.IIII + 5;
         this.III_.I1 = this.II0I + this.I_O0 - 68;
         this.III_.I1I = this.III + this.IIII + 5;
      }

      (III1 = new I_O_()).II(this.IIO, this.IIIl, this.II0I, this.III + this.III1, this.I_O0, this.IIII - this.III1, true, 1);
   }

   private void IIl1() {
      this.IIOl = this.II0I + this.I_O0;
   }

   public IOl() {
      this.IIOO = new I1Il(IO11.I_lO, this, 1, null);
      this.III_ = new I1Il(IO11.I_I, this, 2, null);
   }

   public void II(IO1l var1) {
      var1.IIl0(-this.IIlI, 0);
      I__O.II(var1, this.II0I, this.III - 17, this.I_O0, this.IIII + 17, -1, true);
      IO1I.III_.II(var1, IO11.IO00, this.II0I + this.I_O0 / 2, this.III - 7, 2);
      Iloo var2;
      if (this.II >= 0 && this.II <= Iloo.IIlo.size() - 1 && (var2 = (Iloo)Iloo.IIlo.elementAt(this.II)).IIIl != null) {
         Ilol.II().II(var1, var2.IIIl, II.IIl / 2, this.III + 45, 1, false);
      }

      Ilol.II().II(var1, II.IIl / 2, this.III + 45, 1, Ilol.II().IO10, false);
      var1.IIIO(this.II0I, this.III + this.III1, this.I_O0, this.IIII - this.III1 - 10);
      if (III1 != null) {
         var1.IIl0(0, -III1.I_0);
      }

      for (int var3 = 0; var3 < this.IIO; var3++) {
         int var4 = this.II0I + 10;
         int var5;
         if ((var5 = this.III + var3 * this.IIIl + this.III1) + this.IIIl - (III1 != null ? III1.I_0 : 0) >= this.III + this.III1
            && var5 - (III1 != null ? III1.I_0 : 0) <= this.III + this.III1 + this.IIII) {
            Iloo var6 = (Iloo)Iloo.IIlo.elementAt(var3);
            IO1I var7 = IO1I.IIlO;
            if (var3 == this.II) {
               var7 = IO1I.IIlo;
            }

            if (var6.II1o != null) {
               var7.II(var1, var6.II1o, var4 + 20, var5, 0);
            }

            if (var6.IoI1 > 0) {
               var7.II(var1, var6.IoI1 + I1Il("䠫", 18443) + IO11.I_1_, var4 + this.I_O0 - 20, var5, 1);
            } else if (var6.IO_ > 0) {
               var7.II(var1, var6.IO_ + I1Il("䠫", 18443) + IO11.I_1O, var4 + this.I_O0 - 20, var5, 1);
            }

            if (var6.IIIl != null) {
               I_oo.IIII(var1, var6.IIIl[0], var4, var5, 0, 0);
            }
         }
      }

      var1.IIl0(0, -var1.IIO_());
      var1.IIIO(0, 0, II.IIl, II.IIlI);
      I_10.II(var1, this.IIOO, (I1Il)null, this.III_);
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 2) {
         this.IIl1();
      }

      if (var1 == 1 && !this.I1ll && this.II >= 0) {
         this.IIl1();
         if (Ilol.II().II == null) {
            I_0_.II().II((byte)2, (byte)((Iloo)Iloo.IIlo.elementAt(this.II)).IoIl, this.Ill_);
            return;
         }

         I_0_.II().II((byte)4, (byte)((Iloo)Iloo.IIlo.elementAt(this.II)).IoIl, "");
      }
   }
}
