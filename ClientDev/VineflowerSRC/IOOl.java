package main;

import nrolite.DataDownloader;

public final class IOOl extends IO1_ {
   private int I_00 = 0;
   private volatile boolean Io10 = false;
   private final boolean Io1o;

   public IOOl() {
      this(false);
   }

   public IOOl(boolean var1) {
      this.Io1o = var1;
      this.I_1o();
   }

   private void IIOo() {
      if (II.II == null) {
         II.II = new I_0l();
      }

      II.II.I0l_();
   }

   public void I_1o() {
      DataDownloader.startDownload(new IOO1(this));
   }

   @Override
   public void IIlO() {
      this.I_00++;
      if (this.Io10) {
         IOI.Ioo();
         new IOI().I0l_();
      } else {
         if (DataDownloader.status == -1) {
            if (this.Io1o) {
               int var1 = Math.min(II.IIl - 20, 260);
               short var2 = 135;
               int var3 = (II.IIlI - var2) / 2;
               int var4 = II.IIl / 2;
               if (II.IIIo && II.II(var4 + 5, var3 + 98, 80, 22)) {
                  II.IIIo = false;
                  this.IIOo();
               } else if ((!II.IIIo || !II.II(var4 - 85, var3 + 98, 80, 22)) && !II.II[5]) {
                  if (II.II[13]) {
                     II.II[13] = false;
                     this.IIOo();
                  }
               } else {
                  II.IIIo = false;
                  II.II[5] = false;
                  this.I_1o();
               }
            } else if (II.IIIo || II.II[5]) {
               II.IIIo = false;
               II.II[5] = false;
               this.I_1o();
            }
         }
      }
   }

   @Override
   public void III_(IO1l var1) {
      var1.IIl0(-var1.IIO1(), -var1.IIO_());
      var1.IIIO(0, 0, II.IIl, II.IIlI + 1);
      var1.Illl(659229);
      var1.III_(0, 0, II.IIl, II.IIlI);
      int var2 = Math.min(II.IIl - 20, 260);
      short var3 = 135;
      int var4 = (II.IIl - var2) / 2;
      int var5 = (II.IIlI - var3) / 2;
      var1.Illl(1252659);
      var1.III_(var4, var5, var2, var3);
      var1.Illl(2768486);
      var1.III1(var4, var5, var2, var3);
      var1.Illl(1713988);
      var1.III1(var4 + 1, var5 + 1, var2 - 2, var3 - 2);
      String var6 = I11o("䚻䝓姿䜑䝑䟂好䞀䞪䠬䡤䠌䠯䣄䣮䢈䢠", 18165);
      if (IO1I.IIIl != null) {
         IO1I.IIIl.II(var1, var6, II.IIl / 2, var5 + 10, 2);
      }

      int var7 = DataDownloader.status;
      int var9 = 0;
      int var10 = 15381256;
      String var8;
      if (var7 == 1) {
         var8 = I11o("䟥䝵䝝䜵䝑䟻夐䞺䟍䡢固䠣", 18165) + this.IIlO();
         var9 = 0;
      } else if (var7 == 2) {
         var9 = DataDownloader.percent;
         var8 = I11o("䟥䝵䝝䜵䝑䟤夌䞧䟗䠬", 18165) + var9 + I11o("䛐", 18165);
         var10 = 16347926;
      } else if (var7 == 3) {
         var9 = DataDownloader.unzipPercent;
         var8 = I11o("䟥䝵䝝䜵䝑䟷䟆奭䞄䠬䡅䢣䠇䢲䢇", 18165) + var9 + I11o("䛐", 18165);
         var10 = 2278750;
      } else if (var7 == 4) {
         var9 = 100;
         var8 = I11o("䚽䝻䟓䜼䝑䟤夊䞺䟌䠬䤻䠫䠇䣯䢇䢰䠅䥫䤃䤥䤀䧭䧺䦐䧳䧒", 18165);
         var10 = 1096065;
      } else {
         var8 = I11o("䚹姃䝚䝲䜅夳䟆䟮䞉団䠋䠦䠀噏䣒䣧", 18165);
         var10 = 15680580;
      }

      if (IO1I.IIII != null) {
         IO1I.IIII.II(var1, var8, II.IIl / 2, var5 + 32, 2);
      }

      int var11 = var2 - 30;
      byte var12 = 14;
      int var13 = var4 + 15;
      int var14 = var5 + 54;
      var1.Illl(988970);
      var1.III_(var13, var14, var11, var12);
      var1.Illl(3359061);
      var1.III1(var13, var14, var11, var12);
      if (var9 > 0) {
         int var15 = var11 * var9 / 100;
         if (var15 > var11) {
            var15 = var11;
         }

         var1.Illl(var10);
         var1.III_(var13 + 1, var14 + 1, var15 - 1, var12 - 2);
      }

      if (var7 == 2) {
         long var20 = DataDownloader.downloadedBytes * 10L / 1048576L;
         long var17 = DataDownloader.totalBytes * 10L / 1048576L;
         String var19 = var20 / 10L
            + I11o("䛛", 18165)
            + var20 % 10L
            + I11o("䛕䝙䝱䝲䝞䞰", 18165)
            + var17 / 10L
            + I11o("䛛", 18165)
            + var17 % 10L
            + I11o("䛕䝙䝱䝲䝙", 18165)
            + DataDownloader.speedKBps
            + I11o("䛕䝟䝱䝽䜂䞹", 18165);
         if (IO1I.II1I != null) {
            IO1I.II1I.II(var1, var19, II.IIl / 2, var5 + 74, 2);
         }
      } else if (var7 == 3) {
         String var21 = DataDownloader.unzipCount + I11o("䛕䜻䜓", 18165) + DataDownloader.unzipTotal + I11o("䛕䝠姴䜢䝑䟤䟆䞠", 18165);
         if (IO1I.II1I != null) {
            IO1I.II1I.II(var1, var21, II.IIl / 2, var5 + 74, 2);
         }
      } else if (var7 == -1 && IO1I.IIl0 != null) {
         IO1I.IIl0.II(var1, DataDownloader.errorMessage, II.IIl / 2, var5 + 74, 2);
      }

      if (var7 == -1) {
         byte var22 = 80;
         byte var16 = 22;
         int var23 = this.Io1o ? II.IIl / 2 - 85 : (II.IIl - var22) / 2;
         int var18 = var5 + 98;
         var1.Illl(14251782);
         var1.III_(var23, var18, var22, var16);
         var1.Illl(16707722);
         var1.III1(var23, var18, var22, var16);
         if (IO1I.IIII != null) {
            IO1I.IIII.II(var1, I11o("䚡䝼姞䝲䜝失䟆", 18165), var23 + var22 / 2, var18 + 5, 2);
         }

         if (this.Io1o) {
            int var24 = II.IIl / 2 + 5;
            var1.Illl(4674921);
            var1.III_(var24, var18, var22, var16);
            var1.Illl(13358561);
            var1.III1(var24, var18, var22, var16);
            if (IO1I.IIII != null) {
               IO1I.IIII.II(var1, I11o("䚤䝡䝒䜫䝑䟼夎䞧", 18165), var24 + var22 / 2, var18 + 5, 2);
            }
         }
      } else if (IO1I.IIlO != null) {
         IO1I.IIlO.II(var1, I11o("䚣䝡䝚䝲䜝䝢䟁䞩䟍䡫䡂嚥䡉䣣嘘䢲䣅䥪埲䤫䥁䧭圾䧐䦺䧜䩰䩒䨰䩘䫣吕䪼䫚䬽䬜", 18165), II.IIl / 2, var5 + 104, 2);
      }
   }

   private String IIlO() {
      int var1 = this.I_00 / 8 % 4;
      if (var1 == 1) {
         return I11o("䛛", 18165);
      } else if (var1 == 2) {
         return I11o("䛛䜺", 18165);
      } else {
         return var1 == 3 ? I11o("䛛䜺䜝", 18165) : "";
      }
   }
}
