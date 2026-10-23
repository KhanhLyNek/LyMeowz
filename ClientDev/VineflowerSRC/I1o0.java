package main;

import javax.microedition.lcdui.Image;

public final class I1o0 extends I_11 implements I1_1 {
   private static Image II_o = IO10.IIII(Il1o("袣裆被袀襦襮褫褄解视觭覌詹詋詛訥計諮諈誼諊譳譞謴謀请诓认诞豿豀谪", 34956));
   public int II0I;
   public int lIoo;
   public int I_Oo;
   public int ll;
   public String Ill1;
   public boolean IO0;
   public int[] II0O;
   public int[] II00;
   private I__O II = new I__O("", 0, 0);
   public boolean I1_l;
   public static boolean I1l = true;
   public boolean I1lI;
   public int IIO0;
   public long Il1O;
   public long IlO0;
   private boolean IOl1;
   private int llI = 0;

   public I1o0(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.II.II_I = new I1Il((String)null, this, 1, null);
      I__O.II(this.II);
   }

   @Override
   public void II(IO1l var1) {
      if (!IIoo.II(this, var1) && this.II0I != 0) {
         I_oo.IIII(var1, this.II0I, super.I_o_, super.I_oO, 0, IOII.I_Oo);
         if (Ilol.II().II != null && Ilol.II().II.equals(this)) {
            var1.II(I_I_.Il0, 0, 0, 9, 6, 0, super.I_o_, super.I_oO - I_oo.IIlo[this.II0I][4] - 1, 33);
            if (this.Ill1 != null) {
               IO1I.IIl_.II(var1, this.Ill1, super.I_o_, super.I_oO - I_oo.IIlo[this.II0I][4] - 20, 2, IO1I.IIlO);
            }
         } else if (this.Ill1 != null) {
            IO1I.IIl_.II(var1, this.Ill1, super.I_o_, super.I_oO - I_oo.IIlo[this.II0I][4] - 17, 2, IO1I.IIlO);
         }

         try {
            for (int var2 = 0; var2 < this.lIoo; var2++) {
               var1.II(II_o, super.I_o_ + this.II0O[var2] - I_oo.IIlo[this.II0I][3] / 2, super.I_oO + this.II00[var2] - I_oo.IIlo[this.II0I][4], 0);
            }
         } catch (Exception var3) {
         }

         if (super.I0IO >= 0 && super.III != null && super.III0 == 0) {
            I_oo.IIII(
               var1,
               super.III.II[super.I0IO].I_Oo,
               super.I_o_ + super.III.II[super.I0IO].II0I + I_oo.IIlo[this.II0I][3] / 2 + 5,
               super.I_oO - 15 + super.III.II[super.I0IO].I_O0,
               0,
               3
            );
            if (II.IIIO % 2 == 0) {
               super.I0IO++;
               if (super.I0IO >= super.III.II.length) {
                  super.I0IO = 0;
               }
            }
         }
      }
   }

   @Override
   public void IIl1() {
      this.II.I0_I = I1l;
      this.IlO0 = System.currentTimeMillis();
      if (this.IlO0 - this.Il1O >= 1000L) {
         this.IIO0--;
         this.Il1O = this.IlO0;
         if (this.IIO0 < 0) {
            this.IIO0 = 0;
         }
      }

      if (!this.IO0) {
         if (this.lIoo < this.ll && this.IIO0 == 0) {
            this.IOl1 = true;
         }
      } else if (this.IIO0 == 0) {
         this.IO0 = false;
         this.IOl1 = true;
      }

      if (this.IOl1) {
         this.llI++;
         if (this.llI == 20) {
            this.llI = 0;
            this.IOl1 = false;
            I_0_.II().III0((byte)2);
         }
      }

      if (this.I1_l) {
         this.I1_l = false;
         if ((this.IIO0 < 0 || this.lIoo >= this.ll) && (this.IIO0 < 0 || !this.IO0) && !this.I1lI) {
            if (this.lIoo == this.ll && !this.IO0) {
               this.II.II(new String[]{IO11.IOlO, this.lIoo + Il1o("袣", 34956) + this.ll}, super.I_o_, super.I_oO - 20 - I_oo.IIlo[this.II0I][4]);
            }
         } else {
            this.II
               .II(
                  new String[]{!this.IO0 ? this.lIoo + Il1o("袣", 34956) + this.ll : IO11.IOI1, I_1l.III_(this.IIO0)},
                  super.I_o_,
                  super.I_oO - 20 - I_oo.IIlo[this.II0I][4]
               );
         }
      }

      if (this.IIO0 >= 0 && this.lIoo < this.ll || this.IIO0 >= 0 && this.IO0) {
         this.II.II_O[this.II.II_O.length - 1] = I_1l.III_(this.IIO0);
      }

      if (this.I1lI) {
         this.II.I0_I = false;
         I_0.III(98, super.I_o_ + this.II0O[this.lIoo - 1] - I_oo.IIlo[this.II0I][3] / 2, super.I_oO + this.II00[this.lIoo - 1] - I_oo.IIlo[this.II0I][4], 1);
         this.lIoo--;
         if (II.IIIO % 2 == 0) {
            IO.II();
         }

         if (this.lIoo == this.I_Oo) {
            this.II.I0_I = true;
            this.I1_l = true;
            this.I1lI = false;
         }
      }

      super.IIl1();
   }

   @Override
   public void II(int var1, Object var2) {
      if (var1 == 1) {
         I_0_.II().III_((byte)1);
      }
   }
}
