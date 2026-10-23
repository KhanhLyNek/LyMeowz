package main;

import javax.microedition.lcdui.Image;

public final class I1Il {
   public boolean I_1o = false;
   public String IIoO;
   public String[] IIll;
   public I1_1 III;
   public int IIO;
   public boolean I__ = true;
   public Image IIO1;
   public Image IIO_;
   public int I1 = 0;
   public int I1I = 0;
   public int IoII = IO1_.l_Io;
   public int IIO0 = IO1_.llo_;
   private int IIII;
   public boolean I__I = false;
   public Object IIIl;
   private int IIIl;
   public String IIo0 = "";
   private static Image IIOO = IO10.IIII(IIoo("엛왾왓옸옞웆웃욬욋읮윅윫윜쟩잖잩잁졥졖졯점접죹", 50676));
   private static Image IIO0 = IO10.IIII(IIoo("엛왾왓옸옞웆웃욬욋읮윅윫윜쟩잖잨잍졧젌젱젎젘", 50676));
   private static Image IIOo = IO10.IIII(IIoo("엛왾왓옸옞웆웃욬욋읮윅윫윜쟩잖잷잍졤졊젵졎젏죰죚", 50676));
   private static Image II0 = IO10.IIII(IIoo("엛왾왓옸옞웆웃욬욋읮윅윫윜쟩잗잩잁졥졖졯점접죹", 50676));
   private static Image II0I = IO10.IIII(IIoo("엛왾왓옸옞웆웃욬욋읮윅윫윜쟩잗잨잍졧젌젱젎젘", 50676));
   private static Image II0l = IO10.IIII(IIoo("엛왾왓옸옞웆웃욬욋읮윅윫윜쟩잗잷잍졤졊젵졎젏죰죚", 50676));
   public boolean I__l;

   public I1Il(String var1, I1_1 var2, int var3, Object var4, int var5, int var6) {
      this.IIoO = var1;
      this.IIO = var3;
      this.III = var2;
      this.IIIl = null;
      this.I1 = var5;
      this.I1I = var6;
   }

   public I1Il(String var1, I1_1 var2, int var3, Object var4) {
      this.IIoO = var1;
      this.IIO = var3;
      this.III = var2;
      this.IIIl = var4;
   }

   public I1Il(String var1, int var2, Object var3) {
      this.IIoO = var1;
      this.IIO = var2;
      this.IIIl = var3;
   }

   public I1Il(String var1, int var2) {
      this.IIoO = var1;
      this.IIO = var2;
   }

   public I1Il(String var1, int var2, int var3, int var4) {
      this.IIoO = var1;
      this.IIO = 0;
      this.I1 = var3;
      this.I1I = var4;
   }

   public void I0lO() {
      II.IIlI();
      if (this.I__ && (this.IIoO != null && !this.IIoO.equals("") && !this.IIoO.equals(IO11.IOl) || this.IIO1 != null)) {
         IO.II();
      }

      if (this.IIO > 0) {
         if (this.III != null) {
            this.III.II(this.IIO, this.IIIl);
            return;
         }

         I1_I.II().IIII(this.IIO, this.IIIl);
      }
   }

   public void IOlI() {
      this.IIIl = 1;
      this.IoII = 160;
      this.IIII = 80;
   }

   public void II(IO1l var1) {
      if (this.IIO1 != null) {
         var1.II(this.IIO1, this.I1, this.I1I, 0);
         if (this.I__I) {
            if (this.IIO_ == null) {
               if (this.I__l) {
                  var1.II(I10_.IlOI, this.I1 + 8, this.I1I + 8, 3);
               } else {
                  var1.II(I10_.IlOI, this.I1 - (this.IIO1.equals(I1_I.IIo_) ? 10 : 0), this.I1I, 0);
               }
            } else {
               var1.II(this.IIO_, this.I1, this.I1I, 0);
            }
         }

         if (this.IIoO != "" && this.IIoO != null) {
            if (!this.I__I) {
               IO1I.III_.II(var1, this.IIoO, this.I1 + IO1l.II(this.IIO1) / 2, this.I1I + IO1l.III(this.IIO1) / 2 - 5, 2);
               return;
            }

            IO1I.IIIO.II(var1, this.IIoO, this.I1 + IO1l.II(this.IIO1) / 2, this.I1I + IO1l.III(this.IIO1) / 2 - 5, 2);
         }
      } else {
         if (this.IIoO != "") {
            if (this.IIIl == 1) {
               if (!this.I__I) {
                  II(IIOO, IIO0, IIOo, this.I1, this.I1I, 160, var1);
               } else {
                  II(II0, II0I, II0l, this.I1, this.I1I, 160, var1);
               }
            } else if (!this.I__I) {
               II(IIOO, IIO0, IIOo, this.I1, this.I1I, 76, var1);
            } else {
               II(II0, II0I, II0l, this.I1, this.I1I, 76, var1);
            }
         }

         int var2;
         if (this.IIIl == 1) {
            var2 = this.I1 + this.IIII;
         } else {
            var2 = this.I1 + 38;
         }

         if (!this.I__I) {
            IO1I.III_.II(var1, this.IIoO, var2, this.I1I + 7, 2);
         } else {
            IO1I.IIIO.II(var1, this.IIoO, var2, this.I1I + 7, 2);
         }
      }
   }

   private static void II(Image var0, Image var1, Image var2, int var3, int var4, int var5, IO1l var6) {
      for (byte var7 = 10; var7 <= var5 - 20; var7 += 10) {
         var6.II(var1, var3 + var7, var4, 0);
      }

      int var8;
      if ((var8 = var5 % 10) > 0) {
         var6.II(var1, 0, 0, var8, 24, 0, var3 + var5 - 10 - var8, var4, 0);
      }

      var6.II(var0, var3, var4, 0);
      var6.II(var2, var3 + var5 - 10, var4, 0);
   }

   public final boolean II0o() {
      this.I__I = false;
      if (II.II(this.I1, this.I1I, this.IoII, this.IIO0)) {
         if (II.IIIO) {
            this.I__I = true;
         }

         if (II.IIIo && II.III0) {
            return true;
         }
      }

      return false;
   }
}
