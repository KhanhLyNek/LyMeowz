package main;

public final class I10I {
   public byte IIO1;
   public byte IIO_;
   public byte II1O;
   public byte II10;
   public int IIO;
   public int IIOI;
   public int IIOl;
   public String IIo_;
   public String IIol;
   public byte IIIo;
   public byte IIOO;
   public Ilol IIl1;
   public I_I_ III0;
   public I100[] II;
   int[] Il1 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
   int III = 0;
   long Ilo0;
   public Ilo1 IIIl;
   private I_lO IIO0 = new I_lO("");
   public int lIOl = -1;

   public void II(byte var1, byte var2) {
      this.IIO_ = var1;
      this.II1O = var2;
   }

   public void III(byte var1) {
      this.IIIo = var1;
      this.IIl1();
   }

   public void II(byte var1) {
      this.IIOO = var1;
      this.IIl1();
   }

   public static I10I II(I_lO var0, int var1) {
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.size(); var2++) {
            I10I var3;
            if ((var3 = (I10I)var0.elementAt(var2)) != null && var3.IIO == var1) {
               return var3;
            }
         }
      }

      return null;
   }

   public void IIl1() {
      this.IIIl = new Ilo1();
      String var1 = "";
      var1 = var1 + Illo("\ua8cbꢜ\ua8c9ꥢ", 43201) + this.IIol;
      var1 = var1 + Illo("\ua8cb\ua8cd꣒", 43201);
      if (this.II != null) {
         int var2 = 0;

         while (true) {
            int var3 = 0;

            for (int var4 = 0; var4 < this.II.length; var4++) {
               if (!this.II[var4].IIl().equals("") && var2 == this.II[var4].II0I) {
                  var3++;
                  break;
               }
            }

            if (var3 == 0) {
               break;
            }

            if (var2 == 0) {
               var1 = var1 + Illo("\ua8cbꢜ\ua8c9ꥢꤏꤠ\ua956ꦷ", 43201) + IO11.Il0I + Illo("꣬\ua8cd", 43201);
            } else {
               var1 = var1 + Illo("\ua8cbꢜ\ua8c9ꥢꤏꤠ\ua956ꦷ", 43201) + IO11.Il0 + Illo("꣡ꢬꢉꤰ", 43201) + var2 + Illo("꣬\ua8cd", 43201);
            }

            for (int var10 = 0; var10 < this.II.length; var10++) {
               String var5;
               if (!(var5 = this.II[var10].IIl()).equals("") && var2 == this.II[var10].II0I) {
                  String var6 = Illo("꣰", 43201);
                  if (this.IIIo == 0) {
                     var6 = Illo("ꣳ", 43201);
                  } else if (this.II[var10].II0I != 0) {
                     if (this.IIOO == 0) {
                        var6 = Illo("ꣳ", 43201);
                     } else if (this.IIIo < this.II[var10].II0I) {
                        var6 = Illo("ꣳ", 43201);
                     }
                  }

                  var1 = var1 + Illo("\ua8cbꢜ", 43201) + var6 + Illo("ꢽ꣑ꢃ", 43201) + var5;
               }
            }

            if (var3 != 0) {
               var2++;
            }
         }
      }

      Ilo1 var9 = this.IIIl;
      this.IIIl.II0I = I_O.I_0;
      var9.IIO = I_O.I_O0;
      var9.IIIO = IO1I.IIlI.II(var1, var9.II0I - 8);
      var9.I_O0 = 10000000;
      var9.III = null;
      var9.IIOl = var9.IIIO.length * 12;
      var9.IIOI = I_O.I_Oo;
      var9.III1 = 10;
      var9.IIlI = var9.IIOl - I_O.IIO;
      if (var9.IIlI < 0) {
         var9.IIlI = 0;
      }
   }

   public void III(IO1l var1, int var2, int var3) {
      I10I var4 = this;
      if (this.IIO_ == this.II1O && this.IIO0.size() == 0) {
         int var5 = I_Ol.III_(1, 5);

         for (int var6 = 0; var6 < var5; var6++) {
            I__o var7;
            (var7 = new I__o()).II0I = I_Ol.III_(5, 25);
            var7.I_O0 = I_Ol.III_(5, 25);
            var7.I_0 = var6 * I_Ol.III_(0, 8);
            var7.IIO = 0;
            var7.I_Oo = -1;
            var4.IIO0.addElement(var7);
         }
      }

      for (int var8 = 0; var8 < this.IIO0.size(); var8++) {
         I__o var9;
         if ((var9 = (I__o)this.IIO0.elementAt(var8)) != null) {
            if (var9.IIO < var9.I_0) {
               var9.IIO++;
            }

            if (var9.IIO >= var9.I_0) {
               var9.I_Oo = II.IIIO / 3 % (I_O.II1.I_Oo + 1);
               if (var9.I_Oo >= I_O.II1.I_Oo) {
                  this.IIO0.removeElementAt(var8);
                  var8--;
               } else {
                  I_O.II1.II(var9.I_Oo, var2 + var9.II0I, var3 + var9.I_O0, 0, 3, var1);
               }
            }
         }
      }
   }
}
