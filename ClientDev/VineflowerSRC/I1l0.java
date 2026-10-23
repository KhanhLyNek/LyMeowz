package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class I1l0 {
   public Image II01;
   private I1O[] II;
   private I110[] II;
   public short[] IIlI;
   public short[][] IIIl = new short[16][];
   public int I_0;
   public int IIO = 0;
   public int IIOI;
   public int IIOl;

   public void II10(String var1) {
      DataInputStream var2;
      try {
         InputStream var3 = I11O.II(var1);
         var2 = new DataInputStream(var3);
      } catch (Exception var4) {
         return;
      }

      this.IIIl(var2);
   }

   public void II_(String var1) {
      DataInputStream var2;
      try {
         InputStream var3 = I11O.II(var1);
         var2 = new DataInputStream(var3);
      } catch (Exception var4) {
         return;
      }

      this.IIII(var2);
   }

   private void IIII(DataInputStream var1) {
      short var2 = 0;
      short var3 = 0;
      int var4 = 0;
      int var5 = 0;

      try {
         byte var6 = var1.readByte();
         this.II = new I1O[var6];

         for (int var7 = 0; var7 < var6; var7++) {
            this.II[var7] = new I1O();
            this.II[var7].II0I = var1.readByte();
            this.II[var7].I_O0 = (short)var1.readUnsignedByte();
            this.II[var7].I_Oo = (short)var1.readUnsignedByte();
            this.II[var7].I_0 = (short)var1.readUnsignedByte();
            this.II[var7].IIO = (short)var1.readUnsignedByte();
         }

         short var12 = var1.readShort();
         this.II = new I110[var12];

         for (int var8 = 0; var8 < this.II.length; var8++) {
            this.II[var8] = new I110();
            byte var9 = var1.readByte();
            this.II[var8].IIll = new short[var9];
            this.II[var8].IIlI = new short[var9];
            this.II[var8].IIll = new byte[var9];

            for (int var10 = 0; var10 < var9; var10++) {
               this.II[var8].IIll[var10] = var1.readShort();
               this.II[var8].IIlI[var10] = var1.readShort();
               this.II[var8].IIll[var10] = var1.readByte();
               if (var8 == 0) {
                  if (var2 > this.II[var8].IIll[var10]) {
                     var2 = this.II[var8].IIll[var10];
                  }

                  if (var3 > this.II[var8].IIlI[var10]) {
                     var3 = this.II[var8].IIlI[var10];
                  }

                  if (var4 < this.II[var8].IIll[var10] + this.II[this.II[var8].IIll[var10]].I_0) {
                     var4 = this.II[var8].IIll[var10] + this.II[this.II[var8].IIll[var10]].I_0;
                  }

                  if (var5 < this.II[var8].IIlI[var10] + this.II[this.II[var8].IIll[var10]].IIO) {
                     var5 = this.II[var8].IIlI[var10] + this.II[this.II[var8].IIll[var10]].IIO;
                  }

                  this.IIOI = var4 - var2;
                  this.IIOl = var5 - var3;
               }
            }
         }

         this.IIlI = new short[var1.readShort()];

         for (int var13 = 0; var13 < this.IIlI.length; var13++) {
            this.IIlI[var13] = var1.readShort();
         }
      } catch (Exception var11) {
      }
   }

   private void IIIl(DataInputStream var1) {
      short var2 = 0;
      short var3 = 0;
      int var4 = 0;
      int var5 = 0;

      try {
         byte var6 = var1.readByte();
         I_Ol.II__(IlI0("쬖쯩쯂쮮쮍찠챱챋찰챁첻", 52069) + var6);
         this.II = new I1O[var6];

         for (int var7 = 0; var7 < var6; var7++) {
            this.II[var7] = new I1O();
            this.II[var7].II0I = var1.readByte();
            this.II[var7].I_O0 = (short)var1.readUnsignedByte();
            this.II[var7].I_Oo = (short)var1.readUnsignedByte();
            this.II[var7].I_0 = (short)var1.readUnsignedByte();
            this.II[var7].IIO = (short)var1.readUnsignedByte();
         }

         short var18 = var1.readShort();
         this.II = new I110[var18];

         for (int var10 = 0; var10 < var18; var10++) {
            this.II[var10] = new I110();
            byte var8 = var1.readByte();
            this.II[var10].IIll = new short[var8];
            this.II[var10].IIlI = new short[var8];
            this.II[var10].IIll = new byte[var8];

            for (int var9 = 0; var9 < var8; var9++) {
               this.II[var10].IIll[var9] = var1.readShort();
               this.II[var10].IIlI[var9] = var1.readShort();
               this.II[var10].IIll[var9] = var1.readByte();
               if (var10 == 0) {
                  if (var2 > this.II[var10].IIll[var9]) {
                     var2 = this.II[var10].IIll[var9];
                  }

                  if (var3 > this.II[var10].IIlI[var9]) {
                     var3 = this.II[var10].IIlI[var9];
                  }

                  if (var4 < this.II[var10].IIll[var9] + this.II[this.II[var10].IIll[var9]].I_0) {
                     var4 = this.II[var10].IIll[var9] + this.II[this.II[var10].IIll[var9]].I_0;
                  }

                  if (var5 < this.II[var10].IIlI[var9] + this.II[this.II[var10].IIll[var9]].IIO) {
                     var5 = this.II[var10].IIlI[var9] + this.II[this.II[var10].IIll[var9]].IIO;
                  }

                  this.IIOI = var4 - var2;
                  this.IIOl = var5 - var3;
               }
            }
         }

         short var22 = var1.readShort();
         this.IIlI = new short[var22];
         if (this.I_0 >= 201) {
            short[] var11 = new short[var22];
            int var21 = 0;
            String var12 = "";
            boolean var13 = false;

            for (int var16 = 0; var16 < var22; var16++) {
               var18 = var1.readShort();
               var12 = var12 + var18 + IlI0("쭉", 52069);
               this.IIlI[var16] = var18;
               if (var18 + 500 >= 500) {
                  var11[var21++] = var18;
                  var13 = true;
               } else {
                  short var14 = (short)I_Ol.II1(var18 + 500);
                  this.IIIl[var14] = new short[var21];
                  System.arraycopy(var11, 0, this.IIIl[var14], 0, var21);
                  var21 = 0;
               }
            }

            if (!var13) {
               this.IIIl[0] = new short[var21];
               System.arraycopy(var11, 0, this.IIIl[0], 0, var21);
            } else {
               for (int var17 = 0; var17 < 16; var17++) {
                  if (this.IIIl[var17] == null) {
                     this.IIIl[var17] = this.IIIl[2];
                  }
               }
            }
         } else {
            for (int var20 = 0; var20 < var22; var20++) {
               this.IIlI[var20] = var1.readShort();
            }
         }
      } catch (Exception var15) {
      }
   }

   public void II(byte[] var1, byte var2) {
      ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
      DataInputStream var4 = new DataInputStream(var3);
      this.II(var4, var2);
   }

   public void II(byte[] var1) {
      ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
      DataInputStream var3 = new DataInputStream(var2);
      this.IIIl(var3);
   }

   public void II(IO1l var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.II != null && this.II.length != 0) {
         I110 var7 = this.II[var2];

         for (int var8 = 0; var8 < var7.IIll.length; var8++) {
            byte var9 = var7.IIll[var8];
            I1l0 var10 = this;

            I1O var12;
            label51: {
               for (int var11 = 0; var11 < var10.II.length; var11++) {
                  if (var10.II[var11].II0I == var9) {
                     var12 = var10.II[var11];
                     break label51;
                  }
               }

               var12 = null;
            }

            I1O var13 = var12;

            try {
               if (var5 == -1) {
                  var1.II(this.II01, var13.I_O0, var13.I_Oo, var13.I_0, var13.IIO, 0, var3 + var7.IIll[var8], var4 + var7.IIlI[var8], 0);
               } else if (var5 == 0) {
                  var1.II(
                     this.II01,
                     var13.I_O0,
                     var13.I_Oo,
                     var13.I_0,
                     var13.IIO,
                     0,
                     var3 + var7.IIll[var8],
                     var4 + var7.IIlI[var8] - (var6 < 4 && var6 > 0 ? II.II10 : 0),
                     0
                  );
               } else if (var5 == 1) {
                  var1.II(
                     this.II01,
                     var13.I_O0,
                     var13.I_Oo,
                     var13.I_0,
                     var13.IIO,
                     2,
                     var3 - var7.IIll[var8],
                     var4 + var7.IIlI[var8] - (var6 < 4 && var6 > 0 ? II.II10 : 0),
                     IOII.l1O_
                  );
               } else if (var5 == 2) {
                  var1.II(
                     this.II01,
                     var13.I_O0,
                     var13.I_Oo,
                     var13.I_0,
                     var13.IIO,
                     7,
                     var3 - var7.IIll[var8],
                     var4 + var7.IIlI[var8] - (var6 < 4 && var6 > 0 ? II.II10 : 0),
                     IOII.IIOI
                  );
               }
            } catch (Exception var15) {
            }
         }
      }
   }

   private void II(DataInputStream var1, byte var2) {
      short var3 = 0;
      short var4 = 0;
      int var5 = 0;
      int var6 = 0;

      try {
         byte var7 = var1.readByte();
         this.II = new I1O[var7];

         for (int var8 = 0; var8 < var7; var8++) {
            this.II[var8] = new I1O();
            this.II[var8].II0I = var1.readByte();
            if (var2 == 1) {
               this.II[var8].I_O0 = (short)var1.readUnsignedByte();
               this.II[var8].I_Oo = (short)var1.readUnsignedByte();
            } else {
               this.II[var8].I_O0 = var1.readShort();
               this.II[var8].I_Oo = var1.readShort();
            }

            this.II[var8].I_0 = (short)var1.readUnsignedByte();
            this.II[var8].IIO = (short)var1.readUnsignedByte();
         }

         short var9 = var1.readShort();
         this.II = new I110[var9];

         for (int var10 = 0; var10 < this.II.length; var10++) {
            this.II[var10] = new I110();
            var7 = var1.readByte();
            this.II[var10].IIll = new short[var7];
            this.II[var10].IIlI = new short[var7];
            this.II[var10].IIll = new byte[var7];

            for (int var13 = 0; var13 < var7; var13++) {
               this.II[var10].IIll[var13] = var1.readShort();
               this.II[var10].IIlI[var13] = var1.readShort();
               this.II[var10].IIll[var13] = var1.readByte();
               if (var10 == 0) {
                  if (var3 > this.II[var10].IIll[var13]) {
                     var3 = this.II[var10].IIll[var13];
                  }

                  if (var4 > this.II[var10].IIlI[var13]) {
                     var4 = this.II[var10].IIlI[var13];
                  }

                  if (var5 < this.II[var10].IIll[var13] + this.II[this.II[var10].IIll[var13]].I_0) {
                     var5 = this.II[var10].IIll[var13] + this.II[this.II[var10].IIll[var13]].I_0;
                  }

                  if (var6 < this.II[var10].IIlI[var13] + this.II[this.II[var10].IIll[var13]].IIO) {
                     var6 = this.II[var10].IIlI[var13] + this.II[this.II[var10].IIll[var13]].IIO;
                  }

                  this.IIOI = var5 - var3;
                  this.IIOl = var6 - var4;
               }
            }
         }

         this.IIlI = new short[var1.readShort()];

         for (int var14 = 0; var14 < this.IIlI.length; var14++) {
            this.IIlI[var14] = var1.readShort();
         }
      } catch (Exception var11) {
      }
   }
}
