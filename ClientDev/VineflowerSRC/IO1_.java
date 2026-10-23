package main;

public class IO1_ {
   public I1Il IIIo;
   public I1Il III0;
   public I1Il IIl;
   public static int ll11;
   public static int l_Io = 68;
   public static int llo_ = 26;
   public static int l_l = -1;

   public void I0l_() {
      II.IIIl();
      II.III1();
      II.II = this;
      II.II.setFullScreenMode(true);
   }

   public void IIO1(int var1) {
   }

   public void IIlO() {
   }

   public void I_Il() {
      if (II.II[5] || II(II.II.III0)) {
         II.II[5] = false;
         l_l = -1;
         II.IIIo = false;
         if (this.III0 != null) {
            this.III0.I0lO();
         }
      }

      if (II.II[12] || II(II.II.IIIo)) {
         II.II[12] = false;
         l_l = -1;
         II.IIIo = false;
         if (Ilo_.II().I_10) {
            if (Ilo_.II().III_ != null) {
               Ilo_.II().III_.I0lO();
            }
         } else if (this.IIIo != null) {
            this.IIIo.I0lO();
         }
      }

      if (II.II[13] || II(II.II.IIl)) {
         II.II[13] = false;
         l_l = -1;
         II.IIIo = false;
         if (Ilo_.II().I_10) {
            if (Ilo_.II().IIIO != null) {
               Ilo_.II().IIIO.I0lO();
               return;
            }
         } else if (this.IIl != null) {
            this.IIl.I0lO();
         }
      }
   }

   public static boolean II(I1Il var0) {
      if (var0 == null) {
         return false;
      }

      if (var0.I1 >= 0 && var0.I1I != 0) {
         return var0.II0o();
      }

      if (II.II != null) {
         if (II.II.III0 != null && II.II(II.IIl - l_Io >> 1, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
            l_l = 1;
            if (var0 == II.II.III0 && II.III0 && II.IIIo) {
               return true;
            }
         }

         if (II.II.IIIo != null && II.II(0, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
            l_l = 0;
            if (var0 == II.II.IIIo && II.III0 && II.IIIo) {
               return true;
            }
         }

         if (II.II.IIl != null && II.II(II.IIl - l_Io, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
            l_l = 2;
            if ((var0 == II.II.IIl || var0 == Ilo_.II().IIIO) && II.III0 && II.IIIo) {
               return true;
            }
         }
      } else {
         if (var0 == II.II.IIIo && II.II(0, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
            l_l = 0;
            if (II.III0 && II.IIIo) {
               return true;
            }
         }

         if (var0 == II.II.IIl && II.II(II.IIl - l_Io, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
            l_l = 2;
            if (II.III0 && II.IIIo) {
               return true;
            }
         }

         if ((var0 == II.II.III0 || Ilo1.III != null) && II.II(II.IIl - l_Io >> 1, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
            l_l = 1;
            if (II.III0 && II.IIIo) {
               return true;
            }
         }
      }

      return false;
   }

   public void III_(IO1l var1) {
      var1.IIl0(-var1.IIO1(), -var1.IIO_());
      var1.IIIO(0, 0, II.IIl, II.IIlI + 1);
      if (!Ilo_.II().I_10 && II.II == null && !II.II.IOol) {
         I_10.II(var1, this.IIIo, this.III0, this.IIl);
      }
   }
}
