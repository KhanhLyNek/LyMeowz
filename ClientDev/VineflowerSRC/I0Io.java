package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import nrolite.Res;

public final class I0Io {
   public static I0Io.II[] II;
   public static int[] I_oO;
   private static boolean IlO0;

   private static boolean III_(String var0, String var1) {
      if (!I1o1("\ue5ef\ue5cf\ue5ae", 58762).equals(var0)) {
         return false;
      }

      int var2 = var1.indexOf(46);
      if (var2 <= 0) {
         return false;
      }

      try {
         int var3 = Integer.parseInt(var1.substring(0, var2));
         return var3 == 53 || var3 == 54 || var3 >= 72 && var3 <= 77;
      } catch (NumberFormatException var4) {
         return false;
      }
   }

   public static synchronized void I___() {
      if (!IlO0) {
         byte[] var0 = Res.read(I1o1("\ue5e7\ue5c8\ue5b8\ue594\ue628\ue647\ue62d\ue60d", 58762));
         if (var0 == null) {
            throw new RuntimeException(I1o1("\ue5fe\ue5c1\ue5a1\ue582\ue673\ue605\ue629\ue602\ue6f2\ue6d2\ue6ee\ue6bd\ue697\ue773", 58762));
         }

         try {
            DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
            short var2 = var1.readShort();
            II = new I0Io.II[var2];

            for (int var3 = 0; var3 < var2; var3++) {
               I0Io.II var4 = new I0Io.II();
               var4.I1l = var1.readShort();
               var4.II1o = var1.readUTF();
               var4.IoI_ = var1.readByte();
               var4.__1l = var1.readByte();
               var4.l1o_ = var1.readByte();
               var4.__11 = var1.readByte();
               var4.__1_ = var1.readByte();
               var4.__1O = var1.readByte();
               var4.__10 = var1.readByte();
               byte var5 = var1.readByte();
               var4.II = new I0Io.IIIl[var5];

               for (int var6 = 0; var6 < var5; var6++) {
                  I0Io.IIIl var7 = new I0Io.IIIl();
                  var7.II1o = var1.readUTF();
                  var7.__1o = var1.readShort();
                  var7.___ = var1.readShort();
                  var7.___I = var1.readShort();
                  var7.___l = var1.readShort();
                  var7.lIl = var1.readByte() != 0;
                  var7.lIlI = var1.readByte() != 0;
                  var7.___1 = var1.readShort();
                  var7.____ = var1.readShort();
                  var7.___O = var1.readShort();
                  var4.II[var6] = var7;
               }

               byte var19 = var1.readByte();
               var4.III = new I0Io.III[var19];

               for (int var21 = 0; var21 < var19; var21++) {
                  I0Io.III var8 = new I0Io.III();
                  var8.l0o1 = var1.readByte();
                  var8.lOl_ = var1.readByte();
                  var8.llIl = var1.readInt();
                  var8.I1 = var1.readShort();
                  var8.I1I = var1.readShort();
                  var4.III[var21] = var8;
               }

               byte var22 = var1.readByte();
               var4.II = new I0Io.IIII[var22];

               for (int var23 = 0; var23 < var22; var23++) {
                  I0Io.IIII var9 = new I0Io.IIII();
                  var9.I1l = var1.readByte();
                  var9.I1 = var1.readShort();
                  var9.I1I = var1.readShort();
                  var4.II[var23] = var9;
               }

               short var24 = var1.readShort();
               var4.Il01 = new String[var24];
               var4.Il0_ = new String[var24];
               int var25 = 0;

               for (int var10 = 0; var10 < var24; var10++) {
                  String var11 = var1.readUTF();
                  String var12 = var1.readUTF();
                  if (!III_(var11, var12)) {
                     var4.Il01[var25] = var11;
                     var4.Il0_[var25] = var12;
                     var25++;
                  }
               }

               if (var25 < var24) {
                  String[] var26 = new String[var25];
                  String[] var27 = new String[var25];
                  System.arraycopy(var4.Il01, 0, var26, 0, var25);
                  System.arraycopy(var4.Il0_, 0, var27, 0, var25);
                  var4.Il01 = var26;
                  var4.Il0_ = var27;
               }

               II[var3] = var4;
            }

            short var14 = var1.readShort();
            I_oO = new int[var14];

            for (int var15 = 0; var15 < var14; var15++) {
               I_oO[var15] = var1.readShort();
            }

            if (II.length > 154 && II[154] != null) {
               boolean var16 = false;

               for (int var17 = 0; var17 < II[154].II.length; var17++) {
                  if (II[154].II[var17].I1l == 56) {
                     var16 = true;
                  }
               }

               if (!var16) {
                  I0Io.IIII[] var18 = new I0Io.IIII[II[154].II.length + 1];
                  System.arraycopy(II[154].II, 0, var18, 0, II[154].II.length);
                  I0Io.IIII var20 = new I0Io.IIII();
                  var20.I1l = 56;
                  var20.I1 = 725;
                  var20.I1I = 312;
                  var18[var18.length - 1] = var20;
                  II[154].II = var18;
               }
            }

            IlO0 = true;
         } catch (IOException var13) {
            throw new RuntimeException(var13.toString());
         }
      }
   }

   public static I0Io.II II(int var0) {
      I___();

      for (int var1 = 0; var1 < II.length; var1++) {
         if (II[var1].I1l == var0) {
            return II[var1];
         }
      }

      return null;
   }

   public static final class II {
      public int I1l;
      public int IoI_;
      public int __1l;
      public int l1o_;
      public int __11;
      public int __1_;
      public int __1O;
      public int __10;
      public String II1o;
      public I0Io.IIIl[] II;
      public I0Io.III[] III;
      public I0Io.IIII[] II;
      public String[] Il01;
      public String[] Il0_;
   }

   public static final class III {
      public int l0o1;
      public int lOl_;
      public int llIl;
      public int I1;
      public int I1I;
   }

   public static final class IIII {
      public int I1l;
      public int I1;
      public int I1I;
   }

   public static final class IIIl {
      public String II1o;
      public int __1o;
      public int ___;
      public int ___I;
      public int ___l;
      public int ___1;
      public int ____;
      public int ___O;
      public boolean lIl;
      public boolean lIlI;
   }
}
