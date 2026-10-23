package main;

public final class IloO extends IO1_ implements I1_1 {
   private I1Il[] II;
   public static I__1[] II;
   private int I_Oo;
   private int[] Ill0 = new int[]{II.IIl / 2 - 100, II.IIl / 2 - 100};
   private int IIO = 0;
   private int[] Illo = new int[2];
   private int[] II0O;
   private int IIlI;
   private int IIO1;

   @Override
   public void I0l_() {
      I_0l.I0_l = false;
      Ilol.I10I = false;
      I1o_.IO0_ = false;
      I_0l.I1ll = false;
      I1_I.II().IIl1();
      super.I0l_();
   }

   public IloO() {
      this.II0O = new int[]{II.IIl / 2 - 150, II.IIlI / 2 - 100, 300, 200};
      this.IIlI = -35;
      this.IIO1 = -35;
   }

   @Override
   public void IIlO() {
      if (II.IIIO % 10 > 2) {
         this.I_Oo = 1;
      } else {
         this.I_Oo = 0;
      }

      for (int var1 = 0; var1 < this.II.length; var1++) {
         if (this.II[var1].II0o()) {
            this.II[var1].I0lO();
         }
      }

      for (int var2 = 0; var2 < this.Ill0.length; var2++) {
         if (II.II(this.Ill0[var2] + this.IIO1, this.Illo[var2] + this.IIlI, this.II0O[2], 60) && II.IIIO) {
            this.IIO = var2;
            break;
         }
      }

      super.IIlO();
   }

   @Override
   public void III_(IO1l var1) {
      II.III1(var1);

      try {
         I__O.II(var1, this.II0O[0] - 10, this.II0O[1], this.II0O[2] + 20, this.II0O[3], 16777215, true);
         if (this.II != null) {
            for (int var2 = 0; var2 < this.II.length; var2++) {
               this.II[var2].II(var1);
            }
         }

         if (II != null) {
            for (int var7 = 0; var7 < II.length; var7++) {
               I__O.II(var1, this.Ill0[var7] - 20, this.Illo[var7] + this.IIlI, this.II0O[2], 60, 16777215, false);
               I_O1 var3 = I1_I.II[II[var7].IIII];
               I_O1 var4 = I1_I.II[II[var7].IIO1];
               I_O1 var5 = I1_I.II[II[var7].IIOl];
               I_oo.IIII(
                  var1,
                  var3.II[Ilol.II[this.I_Oo][0][0]].II1o,
                  this.Ill0[var7] + Ilol.II[this.I_Oo][0][1] + var3.II[Ilol.II[this.I_Oo][0][0]].IIO_,
                  this.Illo[var7] - Ilol.II[this.I_Oo][0][2] + var3.II[Ilol.II[this.I_Oo][0][0]].II1O,
                  0,
                  0
               );
               I_oo.IIII(
                  var1,
                  var4.II[Ilol.II[this.I_Oo][1][0]].II1o,
                  this.Ill0[var7] + Ilol.II[this.I_Oo][1][1] + var4.II[Ilol.II[this.I_Oo][1][0]].IIO_,
                  this.Illo[var7] - Ilol.II[this.I_Oo][1][2] + var4.II[Ilol.II[this.I_Oo][1][0]].II1O,
                  0,
                  0
               );
               I_oo.IIII(
                  var1,
                  var5.II[Ilol.II[this.I_Oo][2][0]].II1o,
                  this.Ill0[var7] + Ilol.II[this.I_Oo][2][1] + var5.II[Ilol.II[this.I_Oo][2][0]].IIO_,
                  this.Illo[var7] - Ilol.II[this.I_Oo][2][2] + var5.II[Ilol.II[this.I_Oo][2][0]].II1O,
                  0,
                  0
               );
               if (this.IIO == var7) {
                  IO1I.IIIl.II(var1, II[var7].Il, this.Ill0[var7] + this.II0O[2] - 25, this.Illo[var7] + this.IIlI, 1);
                  IO1I.IIIl
                     .II(
                        var1,
                        IO11.IOOl + IIo1("妔", 22964) + I_Ol.III_(II[var7].I1II),
                        this.Ill0[var7] + this.II0O[2] - 25,
                        this.Illo[var7] + this.IIlI + IO1I.IIIl.IIOl(),
                        1
                     );
               } else {
                  IO1I.III_.II(var1, II[var7].Il, this.Ill0[var7] + this.II0O[2] - 25, this.Illo[var7] + this.IIlI, 1);
                  IO1I.III_
                     .II(
                        var1,
                        IO11.IOOl + IIo1("妔", 22964) + I_Ol.III_(II[var7].I1II),
                        this.Ill0[var7] + this.II0O[2] - 25,
                        this.Illo[var7] + this.IIlI + IO1I.III_.IIOl(),
                        1
                     );
               }
            }
         }
      } catch (Exception var6) {
      }

      super.III_(var1);
   }

   public void III(byte var1) {
      this.Ill0 = new int[var1];
      this.Illo = new int[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         this.Ill0[var2] = this.II0O[0] + 20;
         this.Illo[var2] = var2 * 70 + this.II0O[1] + 50;
      }

      this.II = new I1Il[2];
      this.II[1] = new I1Il(IIo1("姢夳妝娱婗娮娃嫨", 22964), this, 1, null, this.II0O[0] + this.II0O[2] - 80 - 80, this.II0O[1] + this.II0O[3] - 30);
      this.II[0] = new I1Il(IIo1("姠妡䜯娱婂娮", 22964), this, 2, null, this.II0O[0] + this.II0O[2] - 80, this.II0O[1] + this.II0O[3] - 30);
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            if (this.IIO != -1) {
               II.IIIO();
               I_0_.II().IlIl(II[this.IIO].II0I);
               return;
            }
            break;
         case 2:
            II.II(II.II);
      }
   }
}
