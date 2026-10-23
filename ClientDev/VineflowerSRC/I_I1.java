package main;

import java.io.IOException;
import main.GameMidlet;

final class I_I1 implements Runnable {
   private I_0O II;

   I_I1(I_0O var1) {
      this.II = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            if (this.II.IlI_()) {
               I_I1 var1 = this;
               byte var2 = this.II.III.readByte();
               if (this.II.I1l) {
                  var2 = I_0O.II(this.II, var2);
               }

               I_Il var8;
               if (var2 != -32 && var2 != -66 && var2 != 11 && var2 != -67 && var2 != -74 && var2 != -87 && var2 != 66) {
                  int var16;
                  if (this.II.I1l) {
                     byte var24 = this.II.III.readByte();
                     byte var11 = this.II.III.readByte();
                     var16 = (I_0O.II(this.II, var24) & 255) << 8 | I_0O.II(this.II, var11) & 255;
                  } else {
                     var16 = this.II.III.readUnsignedShort();
                  }

                  byte[] var22 = new byte[var16];
                  int var17 = 0;
                  int var18 = 0;

                  while (var17 != -1 && var18 < var16) {
                     if ((var17 = var1.II.III.read(var22, var18, var16 - var18)) > 0) {
                        var18 += var17;
                        I_0O var23 = var1.II;
                        var23.IIO1 += var18 + 5;
                        int var20 = I_0O.II().IIO1 + I_0O.II().IIlI;
                        var1.II.Ill_ = var20 / 1024 + Il_I("ゆ", 12456) + var20 % 1024 / 102 + Il_I("ャゥ", 12456);
                     }
                  }

                  if (var1.II.I1l) {
                     for (int var21 = 0; var21 < var22.length; var21++) {
                        var22[var21] = I_0O.II(var1.II, var22[var21]);
                     }
                  }

                  var8 = new I_Il(var2, var22);
               } else {
                  var1 = this;
                  int var3 = I_0O.II(this.II, this.II.III.readByte()) + 128;
                  int var10 = I_0O.II(this.II, this.II.III.readByte()) + 128;
                  int var15;
                  byte[] var7 = new byte[var15 = var3 + ((I_0O.II(this.II, this.II.III.readByte()) + 128 << 8) + var10 << 8)];
                  int var4 = 0;
                  int var5 = 0;

                  while (var4 != -1 && var5 < var15) {
                     if ((var4 = var1.II.III.read(var7, var5, var15 - var5)) > 0) {
                        var5 += var4;
                        I_0O var9 = var1.II;
                        var9.IIO1 += var5 + 5;
                        int var6 = I_0O.II().IIO1 + I_0O.II().IIlI;
                        var1.II.Ill_ = var6 / 1024 + Il_I("ゆ", 12456) + var6 % 1024 / 102 + Il_I("ャゥ", 12456);
                     }
                  }

                  if (var1.II.I1l) {
                     for (int var19 = 0; var19 < var7.length; var19++) {
                        var7[var19] = I_0O.II(var1.II, var7[var19]);
                     }
                  }

                  var8 = new I_Il(var2, var7);
               }

               I_Il var25 = var8;
               if (var8 != null) {
                  try {
                     if (var25.II00 == -27) {
                        this.IIl_(var25);
                     } else {
                        this.II.II.III(var25);
                     }
                  } catch (Exception var12) {
                     var12.printStackTrace();
                  }
                  continue;
               }
            }
         } catch (Exception var13) {
         }

         if (this.II.I0O) {
            if (this.II.II != null) {
               if (System.currentTimeMillis() - this.II.IlOI > 500L) {
                  this.II.II.IIl(this.II.I0_o);
               } else {
                  this.II.II.IIIo(this.II.I0_o);
               }
            }

            if (I_0O.II(this.II) != null) {
               I_0O.II(this.II);
            }
         }

         return;
      }
   }

   private void IIl_(I_Il var1) throws IOException {
      byte var2 = var1.II().readByte();
      this.II.II1 = new byte[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.II.II1[var3] = var1.II().readByte();
      }

      for (int var5 = 0; var5 < this.II.II1.length - 1; var5++) {
         byte[] var4 = this.II.II1;
         var4[var5 + 1] = (byte)(var4[var5 + 1] ^ this.II.II1[var5]);
      }

      this.II.I1l = true;
      GameMidlet.IIII = var1.II().readUTF();
      GameMidlet.II_o = var1.II().readInt();
      GameMidlet.II1O = var1.II().readByte() != 0;
      System.out.println(Il_I("チゴテㅦㅋㄭㄌ\u31e4㇃㇋ㆪ㇝㈮㈆㉺", 12456) + GameMidlet.II1O);
      if (this.II.I0_o && GameMidlet.II1O) {
         II.III();
      }
   }
}
