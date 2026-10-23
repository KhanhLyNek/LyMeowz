package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import nrolite.Res;

final class IO_I implements Runnable {
   static final int l_o1 = 0;
   static final int l_o_ = 1;
   static final int l_oO = 2;
   static final int l_o0 = 3;
   static final int l_oo = 4;
   static final int lO = 5;
   static final int lOI = 6;
   static final int lOII = 7;
   static final int lOIl = 8;
   static final int lOI1 = 0;
   static final int lOI_ = 5;
   static final int lOIO = 0;
   static final int lOI0 = 1;
   static final int lOIo = 2;
   static final int lOl = 3;
   private static boolean IlO0;
   private static final Hashtable IIIl = new Hashtable();
   private static final Hashtable III1 = new Hashtable();
   private static final Hashtable III_ = new Hashtable();
   private final IOoI II;
   private final IO0 IIII;
   private final IOo_ IIII;
   private final Random IIIl = new Random();
   final Vector III_ = new Vector();
   private boolean I000;
   private long I1l;
   private static final String[] IlIO = new String[]{
      I1lO("ሢዜዱኆክፕ\u137fጆጱᏙ\u13fe\u139eᎥᑇᑯ", 4726),
      I1lO("ሢዜዱኆክፕ\u137fጆጱᏙ\u13fe\u139eᎥᑇᑯᐘᐨᓈ", 4726),
      I1lO("ሴዚዾኒ\u12b1ፚ", 4726),
      I1lO("ሥዀዤኖአፎ፲ጀጤᏌᏯᎀ", 4726),
      I1lO("ሽዜዺኔክፚ\u137fጁጩ", 4726),
      I1lO("ሮዐዺኌኰ፞፯ጇጻᏃᏫ", 4726),
      I1lO("ሥዜዱኆክፓ\u137fጐጦᏘᏢᎌ", 4726),
      I1lO("ሰዜደኖ", 4726),
      I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮉ", 4726),
      I1lO("ሲ\u12c7ያኘኽፃ፵", 4726),
      I1lO("ስዀዹኑ\u12b7ፃ", 4726),
      I1lO("ስዚዻኟ\u12b7ፃ", 4726),
      I1lO("ሴዙድነኹፎ፷ጀጥᏘ", 4726),
      I1lO("ሴዙድነኹፎ፷ጀጥᏘ", 4726),
      I1lO("ሱዚዸኗ\u12b7፟፯ጉጼᏄᏩ᎑Ꭻ", 4726),
      I1lO("ሴዔዶኊ", 4726),
      I1lO("ሥዚዽኌኺፔ፳ጐጿᏘᏵᎅᏛ", 4726),
      I1lO("ሥዚዽኌኺፔ፳ጐጿᏘᏵᎅᏛ", 4726)
   };
   private static final String[] IlI0 = new String[]{
      I1lO("ሢዔዡኌኢፐ፩ጐጾᏌᏵ᎔Ꭾᑆᑦ᐀ᐹᓋᓥᒎᒽᕊᕡᕭᔗᔳ", 4726),
      I1lO("ሲ\u12c7ድኑኧፃ፱", 4726),
      I1lO("ሴዀዽኌኰፄ፹", 4726),
      I1lO("ሴዀዽኌኰፄ፹ጐ\u135c", 4726),
      I1lO("ሯዔዷኜኼ", 4726),
      I1lO("ሯዔያነኽ፟", 4726),
      I1lO("ሲ\u12c7ድኑኧፃ፱ጐ\u135c", 4726),
      I1lO("ሻዔዶኆክጠጂጇ", 4726),
      I1lO("ሢዔዺኌኰፘ\u137eጇጱᎸ", 4726),
      I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳ\u13fe", 4726),
      I1lO("ሲዚዽኌኦፃ፥ጀጠᏊᏳ\u13fe", 4726)
   };
   private static final String[] IlIo = new String[]{
      I1lO("ሽዀዿኆ", 4726), I1lO("ሻዔዤኌ\u12b6ፐ፥ጐጪᏄᏢᎃ", 4726), I1lO("ሤዔዹኑኽ", 4726), I1lO("ሷዛያኇአ፞\u137dጐጢ", 4726), I1lO("ሹዊደኜዃ", 4726)
   };
   private boolean I00o;
   private static final Object[][] IIIl = new Object[][]{
      {I1lO("ሾዔዸኟኽፆ፵ጊጠ", 4726), I1lO("ሴዜዹኒ", 4726), 6},
      {I1lO("ሾዔዸኟኽፆ፵ጊጠ", 4726), I1lO("ሻዔዠኁኽፘ", 4726), 6},
      {I1lO("ሾዔዸኟኽፆ፵ጊጠ", 4726), I1lO("ሲዚዽ", 4726), 6},
      {I1lO("ሾዔዸኟኽፆ፵ጊጠ", 4726), I1lO("ሬዚዹኑኻፔ", 4726), 6},
      {I1lO("ስዝዦኚኡፅ\u137dጎጽ", 4726), I1lO("ሹዛዳኌኵፘ፱ጐጠᏂᏩᎇ", 4726), 3},
      {I1lO("ሾዀዺኔክፇ፥ጀጠᏊ", 4726), I1lO("ሢዝዡኊክፅ፹ጁጦ", 4726), 3},
      {I1lO("ሢ\u12c7ዡኝኵፎ፤ጇጻ", 4726), I1lO("ሽዝዽኗኽፅ", 4726), 5},
      {I1lO("ሢ\u12c7ዡኝኵፎ፤ጇጻ", 4726), I1lO("ሸዒዡኊ\u12b7ፅ፤ጇጯᏃ", 4726), 3},
      {I1lO("ሺዀዺኒአፎ\u137eጊጹᏒᏵᎎᎫᑛ", 4726), I1lO("ሴዐያኝኳ", 4726), 3}
   };
   private static final String[] Ill = new String[]{
      I1lO("ሴዙድነኹፎ፷ጀጥᏘ", 4726), I1lO("ስዚዻኟ\u12b7ፃ", 4726), I1lO("ስዀዹኑ\u12b7ፃ", 4726), I1lO("ሥዜዱኆክፓ\u137fጐጦᏘᏢᎌ", 4726)
   };
   private static final int[][] II1l = new int[][]{
      {423, 77, 5, 20},
      {424, 77, 5, 20},
      {425, 77, 5, 20},
      {426, 77, 5, 20},
      {427, 77, 5, 20},
      {428, 77, 5, 20},
      {429, 77, 1, 5},
      {430, 77, 1, 5},
      {431, 77, 1, 5},
      {432, 77, 1, 5},
      {433, 77, 1, 5}
   };
   private static final String[] IllI = new String[]{
      I1lO("ሴዀዾኚኼ", 4726),
      I1lO("ሽዚዳኆ", 4726),
      I1lO("ሬዔዺኔካፐ", 4726),
      I1lO("ሴዜደኜ", 4726),
      I1lO("ሴዚዾኒ\u12b1ፚ", 4726),
      I1lO("ሥዀዤኖአፎ፲ጀጤᏌᏯᎀ", 4726),
      I1lO("ሥዚያዧክ፟\u137d", 4726),
      I1lO("ሥዚያዠክ፟\u137d", 4726),
      I1lO("ሥዚያዡክ፟\u137d", 4726),
      I1lO("ሥዚያዢክ፟\u137d", 4726),
      I1lO("ሢዜዱኆክፕ\u137fጆጱᏙ\u13fe\u139eᎥᑇᑯᐘᐨᓈ", 4726)
   };
   private static final String[] Illl = new String[]{
      I1lO("ሴዀዽኌኰፄ፹", 4726),
      I1lO("ሴዀዽኌኰፄ፹ጐ\u135c", 4726),
      I1lO("ሲ\u12c7ድኑኧፃ፱", 4726),
      I1lO("ሲ\u12c7ድኑኧፃ፱ጐ\u135c", 4726),
      I1lO("ሲ\u12c7ድኑኧፃ፱ጐ፝", 4726),
      I1lO("ሯዔዷኜኼ", 4726),
      I1lO("ሯዔያነኽ፟", 4726),
      I1lO("ሻዔዶኆክጠጂጇ", 4726),
      I1lO("ስዔደኚ\u12b1", 4726),
      I1lO("ሱዚዿኆ", 4726)
   };
   private static final int[][] II11 = new int[][]{
      {230, 231, 232, 234, 235, 236, 238, 239, 240, 242, 243, 244, 246, 247, 248, 250, 251, 252, 266, 267, 268, 270, 271, 272, 274, 275, 276},
      {254, 255, 256, 258, 259, 260, 262, 263, 264, 278, 279, 280}
   };
   private static final String[] Ill1 = new String[]{
      I1lO("ሤዐዧኇ", 4726),
      I1lO("ሤዐዧኃኳፆ\u137e", 4726),
      I1lO("ሼዚዽኝክ\u135c፱ጟ", 4726),
      I1lO("ስዝድኇክፂ", 4726),
      I1lO("ሷዓዿ", 4726),
      I1lO("ሷዖዠኚኤፔ", 4726),
      I1lO("ሲዜዱ", 4726),
      I1lO("ስዝድኇክፔ", 4726),
      I1lO("ሺዐድኅ\u12b7ፎ\u137dጎጾ", 4726)
   };

   static synchronized void I___() {
      if (!IlO0) {
         IlO0 = true;

         try {
            byte[] var0 = Res.read(I1lO("ሔዺ\u12c7አዜ፳ፙጡ", 4726));
            if (var0 == null) {
               return;
            }

            DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
            int var2 = var1.readUnsignedShort();

            for (int var3 = 0; var3 < var2; var3++) {
               IO_I.II var4 = new IO_I.II();
               var4.lIlI = var1.readUTF();
               var4.II1o = var1.readUTF();
               var4.lOlI = var1.readByte();
               var4.I1o1 = new int[6];

               for (int var5 = 0; var5 < 6; var5++) {
                  var4.I1o1[var5] = var1.readShort();
               }

               var4.lllI = var1.readInt();
               var4.I1o_ = new int[var1.readByte()];

               for (int var14 = 0; var14 < var4.I1o_.length; var14++) {
                  var4.I1o_[var14] = var1.readInt();
               }

               var4.IIO = new int[var1.readByte()];

               for (int var15 = 0; var15 < var4.IIO.length; var15++) {
                  var4.IIO[var15] = var1.readShort();
               }

               var4.II1_ = new int[var1.readByte()][];

               for (int var16 = 0; var16 < var4.II1_.length; var16++) {
                  var4.II1_[var16] = new int[]{var1.readByte(), var1.readByte(), var1.readInt()};
               }

               var4.Ill_ = II(var1);
               var4.IllO = II(var1);
               var4.Ill0 = II(var1);
               var4.lOll = var1.readInt();
               var4.lOl1 = var1.readByte();
               var4.I1oO = new int[var1.readByte()];

               for (int var17 = 0; var17 < var4.I1oO.length; var17++) {
                  var4.I1oO[var17] = var1.readInt();
               }

               IIIl.put(var4.lIlI, var4);
            }

            int var11 = var1.readUnsignedShort();

            for (int var12 = 0; var12 < var11; var12++) {
               IO_I.IIII var18 = new IO_I.IIII();
               var18.I1l = var1.readInt();
               var18.lIlI = var1.readUTF();
               var18.Iol1 = var1.readByte() != 0;
               var18.Illo = new String[var1.readByte()];

               for (int var6 = 0; var6 < var18.Illo.length; var6++) {
                  var18.Illo[var6] = var1.readUTF();
               }

               III1.put(var18.lIlI, var18);
               III_.put(new Integer(var18.I1l), var18);
            }

            III0(I1lO("ሽዔዦኚኼ", 4726), -357);
            III0(I1lO("ሯዔዾኚአ፞", 4726), -358);
            III0(I1lO("ሡዝዽኀ", 4726), -359);
            String[] var13 = new String[]{
               I1lO("ሢዔዤኌኡፄ፯\u137f", 4726),
               I1lO("ሢዔዤኌኡፄ፯\u137e", 4726),
               I1lO("ሢዔዤኌኡፄ፯\u137d", 4726),
               I1lO("ሢዔዤኌኡፄ፯፼", 4726),
               I1lO("ሢዔዤኌኡፄ፯፻", 4726),
               I1lO("ሢዔዺኌኰፘ\u137eጇጱᎸ", 4726),
               I1lO("ሢዔዺኌኰፘ\u137eጇጱᎽ", 4726),
               I1lO("ሢዔዺኌኰፘ\u137eጇጱᎼ", 4726),
               I1lO("ሢዔዺኌኰፘ\u137eጇጱᎿ", 4726),
               I1lO("ሢዔዺኌኰፘ\u137eጇጱᎾ", 4726),
               I1lO("ሢዔዺኌኰፘ\u137eጇጱᎹ", 4726),
               I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳ\u13fe", 4726),
               I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳᏻ", 4726),
               I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳᏺ", 4726),
               I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳᏹ", 4726),
               I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳᏸ", 4726),
               I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳ\u13ff", 4726),
               I1lO("ሲዚዽኌኦፃ፥ጀጠᏊᏳ\u13fe", 4726)
            };

            for (int var19 = 0; var19 < var13.length; var19++) {
               III0(var13[var19], -322 - var19);
            }

            int[] var20 = new int[]{
               0,
               1,
               2,
               3,
               4,
               5,
               6,
               7,
               8,
               9,
               10,
               11,
               12,
               13,
               14,
               15,
               16,
               17,
               18,
               19,
               20,
               24,
               25,
               26,
               27,
               28,
               29,
               30,
               31,
               32,
               33,
               34,
               35,
               36,
               37,
               63,
               64,
               65,
               66,
               67,
               68,
               69,
               70,
               71,
               72,
               73,
               74,
               75,
               76,
               77,
               79,
               80,
               81,
               82,
               83,
               84,
               92,
               93,
               94,
               96,
               97,
               98,
               99,
               100,
               102,
               103,
               104,
               105,
               106,
               107,
               108,
               109,
               110
            };
            II(I1lO("ሷዛያኇአ፞\u137dጐጢ", 4726), -365, I1lO("፴ዻኔኇኀ\u0dc8፝፯", 4726), new int[]{201, 202, 203, -1, -1, -1}, 1, 100, var20, new int[][]{{6, 3, 50000}});
            II(I1lO("ሹዊደኜዃ", 4726), -78, I1lO("ನኵደ፲ዒጴፔ", 4726), new int[]{400, 401, 402, -1, -1, -1}, 1000, 500000, var20, new int[][]{{8, 1, -1}});

            for (int var21 = 0; var21 < IlI0.length; var21++) {
               III0(IlI0[var21], -2000 - var21);
            }

            int[] var22 = new int[]{5, 13, 20, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38};
            int[][] var7 = new int[][]{{8, 7, 1000}, {0, 7, 1000}, {2, 7, 1000}, {4, 7, 1000}, {1, 7, 1000}, {3, 7, 1000}, {5, 7, 1000}};
            II(I1lO("ሴ\u12c7ዻኟካ", 4726), -1822, I1lO("ሴዧዛ\u12bfኋጱጕጫ", 4726), new int[]{291, 292, 293, -1, -1, -1}, 100, 500, var22, var7);
            II(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726), -82282, I1lO("ሥዠዄ\u12b6ኀጱ፲ጽጁᏡᏕᏫᏏᑭ", 4726), new int[]{294, 295, 296, -1, -1, -1}, 100, 1000, var22, var7);
            IO_I.II var8 = (IO_I.II)IIIl.get(I1lO("ሴ\u12c7ዻኟካ", 4726));
            IO_I.II var9 = (IO_I.II)IIIl.get(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726));
            var8.lOlI = 2;
            var9.lOlI = 2;
            var8.lOll = 600;
            var9.lOll = 1;
            var8.IllO = new String[]{
               I1lO("ሊኸኅኯኺ፰ፘጮፏᎭᏘᎪᏊᑺકᑧᐁᓬਛᒷᓂᕩடᕋᕾᔞᕽᗘᗺᖗᙿជ៷ᘜ", 4726),
               I1lO("ሊኸኅኯኡ\u0df8ፓ፯ጃബᏂᎣᏊᑪ\u0acfᐦᑆᓱᓅᓣᒎᗡᔀᕋᔫᔄ\u0b5bᗏᗺᓨࣉᙞ", 4726),
               I1lO("ሊኸኅኯኤᏱ፟፯ጆലᏘᏫዻᓫᑑᑦᑇᒤ", 4726)
            };
            var9.IllO = var8.IllO;
            var8.Ill0 = new String[]{I1lO("ሊኸኅኯ\u12b1Ᏸፓ፯ጀᏪሜቪᎃᐩᑏᐮ\u0aa9ᓬᒄᒯ੍ᕬᔎᔟᔊᔜᖼᗈ୧ᗙᙩᙂᘷᘌᚴᛟࡳᚘ\u173e", 4726)};
            var9.Ill0 = var8.Ill0;
         } catch (IOException var10) {
            System.out.println(I1lO("ርዹዝኧኗፌጐጭጁ\u13feᏟᏥᎈᑠᑆᑧᐊᓪᓍᓹᓂ", 4726) + var10);
         }
      }
   }

   private static void II(String var0, int var1, String var2, int[] var3, int var4, int var5, int[] var6, int[][] var7) {
      IO_I.II var8 = new IO_I.II();
      var8.lIlI = var0;
      var8.II1o = var2;
      var8.lOlI = 0;
      var8.lllI = var4;
      var8.lOll = 600;
      var8.lOl1 = 0;
      var8.I1o1 = var3;
      var8.I1o_ = new int[]{var5};
      var8.IIO = var6;
      var8.I1oO = new int[0];
      var8.II1_ = var7;
      var8.Ill_ = new String[0];
      var8.IllO = new String[0];
      var8.Ill0 = new String[0];
      IIIl.put(var0, var8);
      III0(var0, var1);
   }

   private static void III0(String var0, int var1) {
      if (III1.get(var0) == null && IIIl.get(var0) != null) {
         IO_I.IIII var2 = new IO_I.IIII();
         var2.I1l = var1;
         var2.lIlI = var0;
         var2.Iol1 = true;
         var2.Illo = new String[]{var0};
         III1.put(var0, var2);
         III_.put(new Integer(var1), var2);
      }
   }

   private static String[] II(DataInputStream var0) throws IOException {
      String[] var1 = new String[var0.readByte()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0.readUTF();
      }

      return var1;
   }

   IO_I(IOoI var1, IO0 var2, IOo_ var3) {
      this.II = var1;
      this.IIII = var2;
      this.IIII = var3;
   }

   synchronized void I_1o() {
      if (!this.I000) {
         this.I000 = true;
         this.I1l = System.currentTimeMillis() + 4000L;
         I___();

         for (int var1 = 0; var1 < IlIo.length; var1++) {
            for (int var2 = 0; var2 < 5; var2++) {
               this.II(IlIo[var1], null, 0);
            }
         }

         for (int var4 = 0; var4 < IlIO.length; var4++) {
            this.II(IlIO[var4], null, 0);
         }

         this.II(I1lO("ሴ\u12c7ዻኟካ", 4726), null, 0);

         for (int var5 = 0; var5 < IlI0.length; var5++) {
            for (int var7 = 0; var7 < 3; var7++) {
               IO_I.III var3 = this.II(IlI0[var5], null, 0);
               if (var3 != null) {
                  var3.lO_l = var7;
               }
            }
         }

         Thread var6 = new Thread(this);
         var6.start();
      }
   }

   @Override
   public void run() {
      while (!this.IIII.lIIl) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var5) {
         }

         try {
            synchronized (this.II) {
               this.III1(System.currentTimeMillis());
            }
         } catch (Exception var4) {
            System.out.println(I1lO("ርዹዝኧኗፌጐጭጁ\u13feᏟᏫ\u139eᑠᑋᐬᑜᒥ", 4726) + var4);
         }
      }
   }

   synchronized void IIO_(String var1) {
      I___();

      for (int var2 = 0; var2 < this.III_.size(); var2++) {
         IO_I.III var3 = (IO_I.III)this.III_.elementAt(var2);
         if (var3.IoII && !var3.I0oO) {
            this.II11(var3);
            var3.I0oO = true;
         }
      }

      this.I00o = true;

      try {
         for (int var8 = 0; var8 < IIIl.length; var8++) {
            if (IIIl[var8][0].equals(var1)) {
               int var9 = (Integer)IIIl[var8][2];

               for (int var4 = 0; var4 < var9; var4++) {
                  this.II((String)IIIl[var8][1], null, 0);
               }
            }
         }
      } finally {
         this.I00o = false;
      }
   }

   private IO_I.III II(String var1, IO_I.III var2, int var3) {
      IO_I.IIII var4 = (IO_I.IIII)III1.get(var1);
      if (var4 == null) {
         return null;
      }

      IO_I.III var5 = new IO_I.III();
      var5.II = var4;
      var5.I1l = var4.I1l;
      var5.II = new IO_I.II[var4.Illo.length];

      for (int var6 = 0; var6 < var5.II.length; var6++) {
         var5.II[var6] = (IO_I.II)IIIl.get(var4.Illo[var6]);
         if (var5.II[var6] == null) {
            return null;
         }
      }

      var5.II = var2;
      var5.IoII = this.I00o;
      var5.lO10 = var3;
      var5.status = 0;
      var5.I0ol = IIIo(var1);
      this.III_.addElement(var5);
      var5.II = new IO_I.III[var5.II.length][];

      for (int var10 = 0; var10 < var5.II.length; var10++) {
         int[] var7 = var5.II[var10].I1oO;
         if (var7.length != 0) {
            var5.II[var10] = new IO_I.III[var7.length];

            for (int var8 = 0; var8 < var7.length; var8++) {
               IO_I.IIII var9 = (IO_I.IIII)III_.get(new Integer(var7[var8]));
               var5.II[var10][var8] = var9 == null ? null : this.II(var9.lIlI, var5, var8);
            }
         }
      }

      return var5;
   }

   private static boolean IIIo(String var0) {
      return var0.equals(I1lO("ሥዚያዠ", 4726))
         || var0.equals(I1lO("ሥዚያዡ", 4726))
         || var0.equals(I1lO("ሥዚያዢ", 4726))
         || var0.equals(I1lO("ሢዜዱኆክፕ\u137fጆጱᏙ\u13fe\u139eᎥᑇᑯ", 4726))
         || var0.equals(I1lO("ሥዚያዠክ፟\u137d", 4726))
         || var0.equals(I1lO("ሥዚያዡክ፟\u137d", 4726))
         || var0.equals(I1lO("ሥዚያዢክ፟\u137d", 4726))
         || var0.equals(I1lO("ሢዜዱኆክፕ\u137fጆጱᏙ\u13fe\u139eᎥᑇᑯᐘᐨᓈ", 4726))
         || var0.equals(I1lO("ሦዜዷ", 4726));
   }

   private void III1(long var1) {
      for (int var3 = 0; var3 < this.III_.size(); var3++) {
         IO_I.III var4 = (IO_I.III)this.III_.elementAt(var3);

         try {
            this.II(var4, (long)var1);
         } catch (Exception var8) {
            System.out.println(I1lO("ርዹዝኧኗፌጐጭጁ\u13feᏟᏫ", 4726) + (var4.II != null ? var4.II.lIlI : I1lO("\u1249", 4726)) + I1lO("ቌኵ", 4726) + var8);
            if (var4.status == 8 || var4.status == 7 || var4.status == 6) {
               try {
                  if (var4.I0oI) {
                     this.II11(var4);
                  }
               } catch (Exception var7) {
               }

               var4.lOlo = -1;
               var4.lOl_ = -1;
               var4.I1lI = var1;
               var4.status = 0;
            }
         }
      }

      for (int var9 = this.III_.size() - 1; var9 >= 0; var9--) {
         if (((IO_I.III)this.III_.elementAt(var9)).I0oO) {
            this.III_.removeElementAt(var9);
         }
      }
   }

   private boolean II(IO_I.III var1) {
      IOol var2 = this.IIII.II;
      return var2 != null && var1.lOlo == var2.lOlo && var1.lO1 == var2.lO1 && !IOo.IIo(var2.lOlo);
   }

   void II(IO_I.III var1, int var2, int var3) {
      long var4 = System.currentTimeMillis();
      if (var1.I11o != 0L && var1.lO_1 >= 0 && var1.lO_1 != var3) {
         this.II(var1);
      }

      var1.I110 = var4 + var2;
      if (var3 >= 0) {
         var1.lO_1 = var3;
         var1.I11o = var1.I110;
         if (var1.I0oI && this.II(var1)) {
            this.IIII.II(new IO0o(-124).II(1).II(0).II(var3).IIII(var1.I1l).IIII(this.IIII.II.I1l));
         }
      }
   }

   private void II(IO_I.III var1) {
      if (var1.I11o != 0L && var1.lO_1 >= 0 && var1.I0oI && this.II(var1)) {
         this.IIII.II(new IO0o(-124).II(0).II(0).II(var1.lO_1).IIII(var1.I1l).IIII(this.IIII.II.I1l));
      }

      var1.I11o = 0L;
      var1.lO_1 = -1;
   }

   private void II(IO_I.III var1, long var2) {
      if (var1.status == 5
         && var1.lOl0 == 5
         && this.II(var1)
         && this.IIII.II.llIl > 0
         && (var1.II.lIlI.equals(I1lO("ሲ\u12c7ድኑኧፃ፱", 4726)) || var1.II.lIlI.equals(I1lO("ሻዔዶኆክጠጂጇ", 4726)))) {
         boolean var4 = var1.II.lIlI.equals(I1lO("ሻዔዶኆክጠጂጇ", 4726));
         if (var1.I11l == 0L) {
            var1.I11l = var2;
         }

         if (var2 - var1.I11l >= (var4 ? 30000 : 10000)) {
            var1.I11l = var2;
            if (this.IIIl.nextInt(10) == 0) {
               this.II(var1, var4 ? I1lO("ኬዸኔ\u12b1ናጱ\u135cጮፎᏵፀᏫᎈᓰᑉ", 4726) : I1lO("ሆዽ\u0c0dኧ", 4726));
               this.IIII.II.II0o(22000, var1.I1l);
            } else if (var4 && this.IIIl.nextInt(5) == 0) {
               this.II(var1, I1lO("ኬዸኔ\u12b1ናጱ\u135cጮፎᏵፀᏫᎈᓰᑉ", 4726));
               this.IIII.II.I11_(30000);
            }
         }
      }

      if (var1.IoII && var1.status == 5 && var1.II.lIlI.equals(I1lO("ሹዛዳኌኵፘ፱ጐጠᏂᏩᎇ", 4726)) && this.II(var1) && var2 - var1.I1_ >= 60000L) {
         if (var1.I1_ != 0L) {
            int[] var6 = new int[]{3, 5, 7};

            for (int var5 = 0; var5 < 3; var5++) {
               if (this.IIIl.nextInt(var6[var5]) == 0) {
                  this.II.II(648, 1, var1.I1 + (var5 == 0 ? 0 : (var5 == 1 ? 1 : -1) * this.IIIl.nextInt(50)), var1.I1I, null);
               }
            }
         }

         var1.I1_ = var2;
      }

      if (var1.I11o != 0L && var2 >= var1.I11o) {
         this.II(var1);
      }

      switch (var1.status) {
         case 3:
         case 4:
         case 5:
            if (this.II(var1)) {
               var1.I1ll = var2;
            }

            if (var2 - var1.I1ll > (var1.II.lIlI.equals(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726)) ? 300000 : 900000) && !var1.IoI0) {
               this.IIl(var1);
               return;
            }
      }

      switch (var1.status) {
         case 0:
            this.III(var1, (long)var2);
            break;
         case 1:
            this.III(var1);
            var1.status = 2;
            break;
         case 2:
            this.IIII(var1, var2);
            break;
         case 3:
            if (this.II(var1, (long)var2)) {
               this.III1(var1);
               var1.I1lO = var2;
               var1.lO11 = 5000;
               if (var1.status != 4) {
                  var1.status = 5;
               }
            }
            break;
         case 4:
            if (var1.I0o1) {
               this.IIIo(var1, var2);
            } else if (var1.Iol) {
               this.IIl1(var1);
            }
            break;
         case 5:
            if (var1.I0o1) {
               this.III0(var1, var2);
            } else if (!var1.I0oo && !var1.IoI1 && (var2 >= var1.I1_l || (var2 / 600L & 1L) != 1L)) {
               this.IIIl(var1, var2);
               if (var1.lOl0 == 0) {
                  this.II(var1, 5);
               }

               this.III_(var1, var2);
            }
            break;
         case 6:
            var1.status = 7;
            break;
         case 7:
            if (this.III(var1, (long)var2)) {
               this.III_(var1);
               var1.status = 8;
            }
            break;
         case 8:
            this.III1(var1, var2);
      }
   }

   private void III(IO_I.III var1, long var2) {
      int var4 = var1.lOl_ + 1;
      if (var4 >= var1.II.length) {
         var4 = 0;
      }

      if (var1.II[var4].lOl1 == 0 && var2 - var1.I1lI >= var1.II[0].lOll * 1000L) {
         var1.status = 1;
      }
   }

   private void III(IO_I.III var1) {
      var1.lOl_++;
      if (var1.lOl_ >= var1.II.length) {
         var1.lOl_ = 0;
      }

      var1.II = var1.II[var1.lOl_];
      var1.II1o = var1.II.II1o;
      int var2 = var1.II1o.indexOf(I1lO("ቓዱ", 4726));
      if (var2 >= 0) {
         var1.II1o = var1.II1o.substring(0, var2) + this.IIIl.nextInt(100) + var1.II1o.substring(var2 + 2);
      }

      var1.lllI = var1.II.lllI;
      var1.lOlO = var1.II.I1o_.length == 0 ? 1000 : var1.II.I1o_[this.IIIl.nextInt(var1.II.I1o_.length)];
      if (var1.II.lIlI.equals(I1lO("ሴ\u12c7ዻኟካ", 4726))) {
         var1.lOlO = 500 + this.IIIl.nextInt(99501);
      } else if (var1.II.lIlI.equals(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726))) {
         var1.lOlO = 1500000 + this.IIIl.nextInt(14570778);
      }

      if (var1.II.lIlI.equals(I1lO("ሴ\u12c7ዻኟካ", 4726)) || var1.II.lIlI.equals(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726))) {
         var1.lllI = Math.max(1, var1.lOlO / 100);
      }

      var1.llIl = var1.lOlO;
      this.IIII(var1);
      var1.lOl0 = 0;
      var1.I0o0 = false;
      var1.Io = false;
      var1.I0oo = false;
      var1.lO1_ = 0;
      var1.lO1O = 0;
      var1.lO1I = 0;
      var1.lO1l = 0;
      var1.I1l1 = 0L;
      var1.I1l_ = 0L;
   }

   private void IIII(IO_I.III var1) {
      int var2 = var1.II.II1_.length;
      Vector var3 = new Vector();
      Vector var4 = new Vector();

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var1.II.II1_[var5][0];
         int var7 = var1.II.II1_[var5][1];
         IOO.IIIO var8 = null;

         for (int var9 = var7; var9 >= 1 && var8 == null; var9--) {
            var8 = IOO.II(var6, var9);
         }

         if (var8 == null) {
            var8 = new IOO.IIIO();
            var8.I1l = var6;
            var8.lO0I = var6;
            var8.l1__ = var7;
            var8.lo = 100 + var7 * 5;
            var8.loIl = 1000;
         }

         var3.addElement(var8);
         var4.addElement(new Integer(var1.II.II1_[var5][2] >= 0 ? var1.II.II1_[var5][2] : var8.loIl));
      }

      var1.II = new IOO.IIIO[var3.size()];
      var1.III_ = new long[var3.size()];
      var1.I1o0 = new int[var3.size()];

      for (int var10 = 0; var10 < var1.II.length; var10++) {
         var1.II[var10] = (IOO.IIIO)var3.elementAt(var10);
         var1.I1o0[var10] = (Integer)var4.elementAt(var10);
      }
   }

   private boolean II(int var1, int var2, IO_I.III var3) {
      for (int var4 = 0; var4 < this.III_.size(); var4++) {
         IO_I.III var5 = (IO_I.III)this.III_.elementAt(var4);
         if (var5 != var3 && var5.II == null && var5.lOlo == var1 && var5.lO1 == var2 && var5.status >= 3 && var5.status <= 5) {
            return true;
         }
      }

      return false;
   }

   private void IIII(IO_I.III var1, long var2) {
      if (var1.II != null && var1.II.lOlo >= 0 && var1.lOl_ == 0) {
         var1.lOlo = var1.II.lOlo;
         var1.lO1 = var1.II.lO1;
         var1.I0o = false;
      } else if (var1.lOl_ <= 0 || var1.lOlo < 0) {
         if (var1.lO1o >= 0) {
            var1.lOlo = var1.lO1o;
            var1.lO1 = var1.lO_ < 0 ? 0 : var1.lO_;
            var1.lO1o = -1;
            var1.I0o = false;
         } else {
            int[] var4 = var1.II.IIO;
            if (var4.length == 0) {
               var1.status = 0;
               var1.I1lI = var2;
               return;
            }

            int var5 = var4[this.IIIl.nextInt(var4.length)];
            I0Io.II var6 = I0Io.II(var5);
            if (var6 == null) {
               var1.status = 0;
               var1.I1lI = var2;
               return;
            }

            int var7 = var6.__1O <= 0 ? 1 : var6.__1O;
            int var8 = 0;
            if (var7 > 2) {
               var8 = 2 + this.IIIl.nextInt(var7 - 2);
               int var9 = 0;

               while (this.II(var5, var8, var1) && var9++ < var7) {
                  var8 = var8 + 1 >= var7 ? 2 : var8 + 1;
               }

               if (this.II(var5, var8, var1)) {
                  var1.status = 0;
                  var1.I1lI = var2;
                  return;
               }
            } else {
               while (var8 < var7 && this.II(var5, var8, var1)) {
                  var8++;
               }

               if (var8 >= var7) {
                  var8 = 0;
               }
            }

            if (var1.lO_l >= 0 && var1.lO_l < var7) {
               var8 = var1.lO_l;
            }

            var1.lOlo = var5;
            var1.lO1 = var8;
            var1.I0o = false;
         }
      }

      if (var1.I0o1) {
         var1.I1 = var1.II.lIlI.equals(I1lO("ሯዔዾኚአ፞", 4726)) ? 320 : 420;
         var1.I1I = 408;
         var1.I0o = true;
         if (var1.II.lIlI.equals(I1lO("ሡዝዽኀ", 4726))) {
            var1.I1 = 341;
            var1.I1I = 320;
            int var10 = Math.max(1, var1.lO_I);
            var1.lOlO = (int)Math.min(2000000000L, (long)var1.lOlO * var10);
            var1.lllI = (int)Math.min(2000000000L, (long)var1.lllI * var10);
            var1.II1o = I1lO("ሡዽዝአዒፊ፼ጙፔ", 4726) + var10 + I1lO("ራ", 4726);
            var1.I11 = var2;
         }
      }

      var1.IoI = var1.lOlo >= 114 && var1.lOlo <= 120;
      var1.I1ll = var2;
      var1.llIl = var1.lOlO;
      this.IIIl(var1);
      var1.status = 3;
      if (var1.lOl_ == 0) {
         this.III0(var1);
      }

      if (this.II(var1)) {
         this.II(var1, true);
      }
   }

   private void IIIl(IO_I.III var1) {
      if (!var1.I0o1) {
         if (System.currentTimeMillis() >= this.I1l) {
            if (!var1.II.Iol1 && (var1.II == null || var1.lOl_ <= 0)) {
               if (var1.lOl_ <= 0 || var1.II.Illo.length <= 1 || !var1.II.lIlI.startsWith(I1lO("ሥዚያ", 4726))) {
                  I0Io.II var2 = I0Io.II(var1.lOlo);
                  if (var2 != null) {
                     this.II.II00(I1lO("ሴዚዧኀዒ", 4726) + var1.II1o + I1lO("ቖዣ\u0c5fኲዒ፩ፅ෪ጚᎭᏄᎢഭᑧᐈᐳેᓬᒄ", 4726) + var2.II1o);
                  }
               }
            }
         }
      }
   }

   private boolean II(IO_I.III var1, long var2) {
      if (this.II(var1) && var1.I0oI) {
         if (var2 - var1.I1l1 < var1.lO1I) {
            return false;
         }

         String[] var4 = var1.II.Ill_;
         if (var1.lO1_ < (var1.I0o1 ? 1 : var4.length) && var4.length != 0) {
            String var5 = var1.I0o1 ? var4[Math.min(var1.I0o_ ? 1 : 0, var4.length - 1)] : var4[var1.lO1_];
            if (!this.II(var1, var5)) {
               return false;
            }

            var1.I1l1 = var2;
            var1.lO1I = Math.min(2000, var5.substring(var5.lastIndexOf(124) + 1).length() * 100);
            var1.lO1_++;
            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private boolean III(IO_I.III var1, long var2) {
      if (this.II(var1) && var1.I0oI) {
         if (var2 - var1.I1l_ < var1.lO1l) {
            return false;
         }

         String[] var4 = var1.II.Ill0;
         if (var1.lO1O >= var4.length) {
            return true;
         }

         String var5 = var4[var1.lO1O];
         if (!this.II(var1, var5)) {
            return false;
         }

         var1.I1l_ = var2;
         var1.lO1l = Math.min(2000, var5.substring(var5.lastIndexOf(124) + 1).length() * 100);
         var1.lO1O++;
         return false;
      } else {
         return true;
      }
   }

   private void IIIl(IO_I.III var1, long var2) {
      if (var1.lOl0 != 0 && var1.II.IllO.length != 0 && var1.I0oI && this.II(var1)) {
         if (var2 - var1.I1lO >= var1.lO11) {
            this.II(var1, var1.II.IllO[this.IIIl.nextInt(var1.II.IllO.length)]);
            var1.I1lO = var2;
            var1.lO11 = 3000 + this.IIIl.nextInt(17000);
         }
      }
   }

   private boolean II(IO_I.III var1, String var2) {
      int var3 = var2.indexOf(124);
      int var4 = var2.lastIndexOf(124);
      int var5 = -1;

      try {
         var5 = Integer.parseInt(var2.substring(var3 + 1, var4));
      } catch (Exception var8) {
      }

      String var6 = var2.substring(var4 + 1);
      if (var5 == -1) {
         this.II(var1, var6);
      } else if (var5 == -2) {
         IOol var7 = this.IIII.II;
         if (var7 == null || var7.llIl <= 0 || II(var1, var7.I1, var7.I1I) > 600) {
            return false;
         }

         this.IIII.II(new IO0o(44).IIII(var7.I1l).II(var6));
      } else if (var5 == -3) {
         if (var1.II != null && !var1.II.Illo()) {
            this.II(var1.II, var6);
         }
      } else if (var5 >= 0) {
         IO_I.III[] var9 = null;
         if (var1.II != null && var1.lOl_ >= 0 && var1.II[var1.lOl_] != null) {
            var9 = var1.II[var1.lOl_];
         } else if (var1.II != null && var1.II.lOl_ >= 0 && var1.II.II[var1.II.lOl_] != null) {
            var9 = var1.II.II[var1.II.lOl_];
         }

         if (var9 != null && var5 < var9.length && var9[var5] != null && !var9[var5].Illo()) {
            this.II(var9[var5], var6);
         }
      }

      return true;
   }

   void II(IO_I.III var1, String var2) {
      if (var1.I0oI && this.II(var1)) {
         this.IIII.II(new IO0o(44).IIII(var1.I1l).II(var2));
      }
   }

   private void III1(IO_I.III var1) {
      if (var1.II.lIlI.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮎ", 4726)) && var1.II != null) {
         IO_I.III var2 = this.II(var1.II, I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮈ", 4726));
         if (var2 != null && !var2.Illo()) {
            var2.I0oo = false;
            this.II(var2, 5);
         }

         var1.II.I0oo = false;
         if (!var1.II.Illo()) {
            this.II(var1.II, 5);
         }
      }

      if (var1.I0ol || var1.Iol) {
         var1.status = 4;
      }
   }

   private void III_(IO_I.III var1) {
      String var2 = var1.II.lIlI;
      IO_I.III var3 = var1.II;
      if (var3 != null && var3.lOl_ >= 0) {
         IO_I.III[] var4 = var3.II[var3.lOl_];
         if (var2.equals(I1lO("ሥዚያዧ", 4726)) || var2.equals(I1lO("ሥዚያዧክ፟\u137d", 4726))) {
            this.II(var4, I1lO("ሥዚያዠ", 4726), I1lO("ሥዚያዠክ፟\u137d", 4726));
         } else if (var2.equals(I1lO("ሥዚያዠ", 4726)) || var2.equals(I1lO("ሥዚያዠክ፟\u137d", 4726))) {
            this.II(var4, I1lO("ሥዚያዡ", 4726), I1lO("ሥዚያዡክ፟\u137d", 4726));
            this.II(var4, I1lO("ሥዚያዢ", 4726), I1lO("ሥዚያዢክ፟\u137d", 4726));
         } else if (var2.equals(I1lO("ሥዚያዡ", 4726))
            || var2.equals(I1lO("ሥዚያዢ", 4726))
            || var2.equals(I1lO("ሥዚያዡክ፟\u137d", 4726))
            || var2.equals(I1lO("ሥዚያዢክ፟\u137d", 4726))) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               IO_I.III var6 = var4[var5];
               if (var6 != null && var6 != var1) {
                  String var7 = var6.II.lIlI;
                  if ((
                        var7.equals(I1lO("ሥዚያዢ", 4726))
                           || var7.equals(I1lO("ሥዚያዡ", 4726))
                           || var7.equals(I1lO("ሥዚያዢክ፟\u137d", 4726))
                           || var7.equals(I1lO("ሥዚያዡክ፟\u137d", 4726))
                     )
                     && !var6.Illo()
                     && var6.status <= 5
                     && var6.status >= 3) {
                     return;
                  }
               }
            }

            if (var3.status == 4) {
               var3.status = 5;
            }
         } else if (var2.equals(I1lO("ሦዚዷ", 4726))) {
            this.II(var4, I1lO("ሦዜዷ", 4726), I1lO("ሦዜዷ", 4726));
         } else if (var2.equals(I1lO("ሦዜዷ", 4726))) {
            if (var3.status == 4) {
               var3.status = 5;
            }
         } else if (var2.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮄ", 4726))) {
            this.II(var3, 5);
         }
      }
   }

   private IO_I.III II(IO_I.III var1, String var2) {
      if (var1 != null && var1.II != null && var1.lOl_ >= 0 && var1.II[var1.lOl_] != null) {
         IO_I.III[] var3 = var1.II[var1.lOl_];

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var3[var4] != null && var3[var4].II.lIlI.equals(var2)) {
               return var3[var4];
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void IIIO(IO_I.III var1) {
      var1.I0o0 = true;
      IO_I.III var2 = this.II(var1, I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮈ", 4726));
      IO_I.III var3 = this.II(var1, I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮎ", 4726));
      var1.llIl = var1.lOlO;
      var1.I0oo = true;
      this.II(var1, 0);
      this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
      if (var2 != null && !var2.Illo()) {
         var2.I0o0 = true;
         var2.llIl = var2.lOlO;
         var2.I0oo = true;
         this.II(var2, 0);
         this.IIII.II(new IO0o(-30).II(9).IIII(var2.I1l).IIII(var2.llIl).IIII(var2.lOlO));
      }

      if (var3 != null && var3.status == 0) {
         var3.lO1o = var1.lOlo;
         var3.lO_ = var1.lO1;
         var3.lOl_ = -1;
         var3.status = 1;
      }
   }

   private void II(IO_I.III[] var1, String var2, String var3) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         IO_I.III var5 = var1[var4];
         if (var5 != null && !var5.Illo() && (var5.II.lIlI.equals(var2) || var5.II.lIlI.equals(var3)) && var5.status == 4) {
            var5.status = 5;
         }
      }
   }

   private void III0(IO_I.III var1) {
      if (var1.II != null && var1.lOl_ >= 0 && var1.II[var1.lOl_] != null) {
         IO_I.III[] var2 = var1.II[var1.lOl_];

         for (int var3 = 0; var3 < var2.length; var3++) {
            IO_I.III var4 = var2[var3];
            if (var4 != null) {
               int var5 = var4.lOl_ + 1 >= var4.II.length ? 0 : var4.lOl_ + 1;
               if (var4.II[var5].lOl1 == 3) {
                  if (var4.lOlo >= 0) {
                     this.IIIo(var4);
                  }
               } else if (var4.II[var5].lOl1 == 1) {
                  if (var4.lOlo >= 0) {
                     this.IIIo(var4);
                  }

                  var4.status = 1;
               }
            }
         }
      }
   }

   private void IIIo(IO_I.III var1) {
      if (var1.I0oI) {
         this.II11(var1);
      }

      var1.lOlo = -1;
      var1.status = 0;
      var1.I1lI = System.currentTimeMillis();
      var1.lOl_ = -1;
   }

   private void IIl(IO_I.III var1) {
      var1.lOl_ = var1.II.length;
      var1.status = 8;
   }

   private void IIlI(IO_I.III var1) {
      IO_I.III var2 = this.II(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726), null, 0);
      if (var2 != null) {
         var2.IoIo = true;
         var2.lO1o = var1.lOlo;
         var2.lO_ = var1.lO1;
         var2.status = 1;
      }
   }

   private void IIll(IO_I.III var1) {
      int var2 = var1.lOlO / (10 + this.IIIl.nextInt(91));
      var1.lOlO = (int)Math.min(16070777L, (long)var1.lOlO + var2);
      var1.lllI = Math.max(1, var1.lOlO / 10);
      this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
   }

   private void III1(IO_I.III var1, long var2) {
      if (var1.II.lIlI.equals(I1lO("ሴ\u12c7ዻኟካ", 4726)) && var1.lOlo >= 0 && var1.lOl_ >= 0 && !var1.Io) {
         var1.Io = true;
         this.IIlI(var1);
      }

      if (var1.IoIo) {
         if (var1.I0oI) {
            this.II11(var1);
         }

         var1.lOlo = -1;
         var1.I0oO = true;
      } else {
         if (var1.II.lIlI.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮉ", 4726)) && var1.II != null && var1.lOl_ >= 0 && var1.lOl_ < var1.II.length && var1.II[var1.lOl_] != null) {
            IO_I.III[] var4 = var1.II[var1.lOl_];

            for (int var5 = 0; var5 < var4.length; var5++) {
               IO_I.III var6 = var4[var5];
               if (var6 != null && !var6.Illo() && var6.lOlo >= 0 && var6.status >= 1 && var6.status <= 5) {
                  return;
               }
            }
         }

         if (var1.lOl_ < var1.II.length - 1 && var1.lOl_ >= 0) {
            var1.status = 1;
         } else {
            if (var1.I0oI) {
               this.II11(var1);
            }

            var1.lOlo = -1;
            var1.I1lI = var2;
            var1.status = 0;
            var1.lOl_ = -1;
            if (var1.II != null) {
               for (int var7 = 0; var7 < var1.II.length; var7++) {
                  if (var1.II[var7] != null) {
                     for (int var8 = 0; var8 < var1.II[var7].length; var8++) {
                        IO_I.III var9 = var1.II[var7][var8];
                        if (var9 != null && var9.lOlo >= 0 && var9.status != 0) {
                           if (var9.I0oI) {
                              this.II11(var9);
                           }

                           var9.lOlo = -1;
                           var9.status = 0;
                           var9.I1lI = var2;
                           var9.lOl_ = -1;
                        }
                     }
                  }
               }
            }

            if (var1.II.lIlI.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮄ", 4726)) && var1.II != null) {
               this.II(var1.II, 5);
            }
         }
      }
   }

   private void IIl1(IO_I.III var1) {
      IOol var2 = this.IIII.II;
      if (this.II(var1) && var2.llIl > 0) {
         if (var1.Ioll) {
            var1.I1 = var2.I1 + this.IIIl.nextInt(201) - 100;
            var1.I1I = 0;
            var1.I0o = true;
            if (var1.I0oI) {
               this.IIII.II(new IO0o(-7).IIII(var1.I1l).III(var1.I1).III(var1.I1I));
            }

            var1.status = 5;
         } else if (II(var1, var2.I1, var2.I1I) <= 500) {
            var1.status = 5;
         }
      }
   }

   synchronized IO_I.III II(int var1, String var2, String var3, int[] var4, int var5, int var6, int var7, int var8, int var9, String[] var10, int[][] var11) {
      IO_I.II var12 = new IO_I.II();
      var12.lIlI = var2;
      var12.II1o = var3;
      var12.lOlI = 0;
      var12.lllI = var5;
      var12.lOll = 999999;
      var12.lOl1 = 0;
      var12.I1o1 = var4;
      var12.I1o_ = new int[]{var6};
      var12.IIO = new int[]{var7};
      var12.I1oO = new int[0];
      var12.II1_ = var11;
      var12.Ill_ = new String[0];
      var12.IllO = var10;
      var12.Ill0 = new String[0];
      IO_I.IIII var13 = new IO_I.IIII();
      var13.I1l = var1;
      var13.lIlI = var2;
      var13.Iol1 = true;
      var13.Illo = new String[]{var2};
      IO_I.III var14 = new IO_I.III();
      var14.II = var13;
      var14.I1l = var1;
      var14.II = new IO_I.II[]{var12};
      var14.II = null;
      var14.lO10 = 0;
      var14.status = 1;
      var14.IoI0 = true;
      var14.IoIo = true;
      var14.lO1o = var7;
      var14.lO_ = 0;
      var14.lO_O = var8;
      var14.lO_0 = var9;
      var14.lOl_ = -1;
      this.III_.addElement(var14);
      return var14;
   }

   synchronized IO_I.III II(int var1, int var2, int var3) {
      IO_I.III var4 = this.II(
         -340,
         I1lO("ሦዚዷኜኾ፞", 4726),
         I1lO("ሻዴኔእፂኰ፞ጨፎᏝፘᎨጞᑥᓜ", 4726),
         new int[]{739, 740, 741, -1, -1, -1},
         var1,
         var2,
         146,
         var3,
         336,
         new String[]{I1lO("ሊኸኅኯᏢኡීጬፏᎭᏡᎢᏊᑤᑝખᐈᒥᓇᒫ\u0a5dᕵᔀᕋᔶᖑᖼᗏᖻᗙᙻᙟᘹᙕᛷᛛ\u086dᚅᜱ", 4726)},
         new int[][]{{2, 7, 1000}, {3, 7, 1000}, {1, 7, 1000}, {5, 7, 1000}, {8, 7, 15000}}
      );
      var4.IoI0 = false;
      var4.IoIl = true;
      var4.IoI1 = true;
      return var4;
   }

   synchronized void IIl_(IO_I.III var1) {
      IOol var2 = this.IIII.II;
      var1.IoI1 = false;
      this.IIII(var1, Math.max(60, var2.I1 + (this.IIIl.nextBoolean() ? 1 : -1) * (50 + this.IIIl.nextInt(50))), 336);
   }

   synchronized void IIlO(IO_I.III var1) {
      if (var1 != null) {
         this.II11(var1);
         var1.lOlo = -1;
         var1.I0oO = true;
         var1.status = 0;
      }
   }

   synchronized void IIl0(IO_I.III var1) {
      this.IIII.II(new IO0o(-45).II(4).IIII(var1.I1l).III(83).III(3000));
      this.II(var1, I1lO("ሮደዙዳᏣᏳፉ", 4726));
   }

   synchronized void IIlo(IO_I.III var1) {
      this.IIII.II(new IO0o(-60).IIII(var1.I1l).II(83).II(1).IIII(this.IIII.II.I1l).II(1).II(1).IIII(1000000000).II(true).II(false));
      this.II(var1, I1lO("ሾቷውኲና፰ፑ", 4726));
   }

   synchronized IO_I.III II(String var1, int var2, String var3, int[] var4, int var5, int var6, int var7, int var8, int var9, String[] var10, int[][] var11) {
      for (int var12 = 0; var12 < this.III_.size(); var12++) {
         IO_I.III var13 = (IO_I.III)this.III_.elementAt(var12);
         if (var13.II != null && var1.equals(var13.II.lIlI) && !var13.I0oO) {
            return var13;
         }
      }

      IO_I.II var15 = new IO_I.II();
      var15.lIlI = var1;
      var15.II1o = var3;
      var15.lOlI = 0;
      var15.lllI = var5;
      var15.lOll = 999999;
      var15.lOl1 = 0;
      var15.I1o1 = var4;
      var15.I1o_ = new int[]{var6};
      var15.IIO = new int[]{var7};
      var15.I1oO = new int[0];
      var15.II1_ = var11;
      var15.Ill_ = new String[0];
      var15.IllO = var10;
      var15.Ill0 = new String[0];
      IO_I.IIII var16 = new IO_I.IIII();
      var16.I1l = var2;
      var16.lIlI = var1;
      var16.Iol1 = true;
      var16.Illo = new String[]{var1};
      IO_I.III var14 = new IO_I.III();
      var14.II = var16;
      var14.I1l = var2;
      var14.II = new IO_I.II[]{var15};
      var14.II = null;
      var14.lO10 = 0;
      var14.status = 1;
      var14.IoIO = true;
      var14.IoIo = true;
      var14.lO1o = var7;
      var14.lO_ = 0;
      var14.lO_O = var8;
      var14.lO_0 = var9;
      var14.lOl_ = -1;
      this.III_.addElement(var14);
      return var14;
   }

   synchronized IO_I.III II(String var1) {
      for (int var2 = 0; var2 < this.III_.size(); var2++) {
         IO_I.III var3 = (IO_I.III)this.III_.elementAt(var2);
         if (var3.II != null && var1.equals(var3.II.lIlI) && !var3.I0oO) {
            return var3;
         }
      }

      return null;
   }

   synchronized void IIOO(String var1) {
      IO_I.III var2 = this.II(var1);
      if (var2 != null) {
         if (var2.I0oI) {
            this.II11(var2);
         }

         var2.lOlo = -1;
         var2.I0oO = true;
         var2.status = 0;
      }
   }

   synchronized IO_I.III III(String var1) {
      for (int var2 = 0; var2 < this.III_.size(); var2++) {
         IO_I.III var3 = (IO_I.III)this.III_.elementAt(var2);
         if (var3.IoI0 && var3.II.lIlI.equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   synchronized void Iool() {
      for (int var1 = 0; var1 < this.III_.size(); var1++) {
         IO_I.III var2 = (IO_I.III)this.III_.elementAt(var1);
         if (var2.IoI0) {
            if (var2.I0oI) {
               this.II11(var2);
            }

            var2.lOlo = -1;
            var2.I0oO = true;
            var2.status = 0;
         }
      }
   }

   private static double II(String var0) {
      if (var0.equals(I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏕᏭᎅᎢᑖᑤᐈ", 4726))) {
         return 1.1;
      } else if (var0.equals(I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏙᏤᎎᎺ", 4726))) {
         return 2.3;
      } else if (var0.equals(I1lO("ሸዜዺኙኳፎ፱ጀጱᏙᏥᎆ", 4726))) {
         return 1.2;
      } else {
         return var0.equals(I1lO("ሤዚዶኜኦፎ፦ጊጱᏞᏥ", 4726)) ? 1.3 : 1.0;
      }
   }

   private static double III(String var0) {
      if (var0.equals(I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏕᏭᎅᎢᑖᑤᐈ", 4726))) {
         return 1.1;
      } else if (var0.equals(I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏙᏤᎎᎺ", 4726))) {
         return 1.15;
      } else if (var0.equals(I1lO("ሸዜዺኙኳፎ፱ጀጱᏙᏥᎆ", 4726))) {
         return 1.2;
      } else {
         return var0.equals(I1lO("ሤዚዶኜኦፎ፦ጊጱᏞᏥ", 4726)) ? 1.3 : 1.0;
      }
   }

   synchronized void II(long var1, long var3) {
      for (int var5 = 0; var5 < this.III_.size(); var5++) {
         IO_I.III var6 = (IO_I.III)this.III_.elementAt(var5);
         if (var6.IoI0 && !var6.Illo() && !var6.II.lIlI.equals(I1lO("ሸዜዺኙኳፎ፳ጃጡᏃᏩ", 4726))) {
            String var7 = var6.II.lIlI;
            int var8 = (int)Math.min(200000000L, (long)(var1 * II(var7)));
            int var9 = (int)Math.min(2000000000L, (long)(var3 * III(var7)));
            var8 = Math.max(1, var8);
            var9 = Math.max(1, var9);
            if (var8 != var6.lllI || var9 != var6.lOlO) {
               double var10 = var6.lOlO > 0 ? (double)var6.llIl / var6.lOlO : 1.0;
               var6.lllI = var8;
               var6.lOlO = var9;
               var6.llIl = Math.max(1, (int)Math.round(var6.lOlO * var10));
               if (var6.I0oI) {
                  this.IIII.II(new IO0o(-30).II(9).IIII(var6.I1l).IIII(var6.llIl).IIII(var6.lOlO));
               }
            }
         }
      }
   }

   synchronized boolean Ill_() {
      for (int var1 = 0; var1 < this.III_.size(); var1++) {
         IO_I.III var2 = (IO_I.III)this.III_.elementAt(var1);
         if (var2.IoI0 && !var2.I0oO && (var2.status == 1 || var2.llIl > 0 && var2.status != 0)) {
            return true;
         }
      }

      return false;
   }

   synchronized boolean IllO() {
      for (int var1 = 0; var1 < this.III_.size(); var1++) {
         IO_I.III var2 = (IO_I.III)this.III_.elementAt(var1);
         if (var2.IoI0 && !var2.I0oO && var2.llIl > 0 && I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏙ\u13feᎊᎤᑎ", 4726).equals(var2.II.lIlI)) {
            return true;
         }
      }

      return false;
   }

   private void II1(IO_I.III var1) {
      String var2 = var1.II.lIlI;
      int var3 = var1.I1;
      int var4 = var1.I1I;
      if (var2.equals(I1lO("ሢዀዬኟክፓ፴ጄጬ", 4726))) {
         this.II.II(705, 1, var3, var4, null);
         this.II.II(457, 1, var3 - 14, var4, null);
         int var5 = Math.max(1, Math.min(110, this.II.IlI()));
         if (this.IIIl.nextInt(110) < var5) {
            this.II.II(457, 1 + this.IIIl.nextInt(10), var3 + 14, var4, null);
         }
      } else {
         if (this.IIIl.nextInt(100) < 40) {
            this.II.II(17 + this.IIIl.nextInt(4), 1, var3, var4, null);
         }

         if (this.IIIl.nextInt(100) < 60) {
            this.II.II(1824, 1 + this.IIIl.nextInt(3), var3 + 12, var4, null);
         }

         if (var2.equals(I1lO("ስዔደኚ\u12b1ፙ፯ጟጬ", 4726)) || var2.equals(I1lO("ሾዔዠነኺፘ፩ጎጭᏆᏳ\u139bᎨ", 4726)) || var2.equals(I1lO("ሢዀዬኟክፓ፴ጄጬ", 4726))) {
            if (this.IIIl.nextInt(100) < 30) {
               this.II.II(611, 1 + this.IIIl.nextInt(3), var3 - 24, var4, null);
            }

            if (this.IIIl.nextInt(100) < 10) {
               this.II.II(422, 1, var3 - 12, var4, null);
            }
         }
      }
   }

   private void II1I(IO_I.III var1) {
      String var2 = var1.II.lIlI;
      int var3 = var1.I1;
      int var4 = var1.I1I;
      if (!var2.equals(I1lO("ሸዜዺኙኳፎ፳ጃጡᏃᏩ", 4726))) {
         this.II.II(17 + this.IIIl.nextInt(4), 1, var3, var4, null);
         if (var2.equals(I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏕᏭᎅᎢᑖᑤᐈ", 4726))) {
            this.II.II(611, 1 + this.IIIl.nextInt(3), var3 + 12, var4, null);
         }

         this.II.II(1824, 1, var3 - 12, var4, null);
      }
   }

   void Ioo1() {
      for (int var1 = 0; var1 < this.III_.size(); var1++) {
         IO_I.III var2 = (IO_I.III)this.III_.elementAt(var1);
         var2.I0oI = false;
         var2.II = null;
         var2.I0o = false;
      }
   }

   void Ioo_() {
      for (int var1 = 0; var1 < this.III_.size(); var1++) {
         IO_I.III var2 = (IO_I.III)this.III_.elementAt(var1);
         if (var2.status >= 3 && var2.status <= 8 && var2.lOlo >= 0 && this.II(var2) && !var2.I0oI) {
            this.II(var2, false);
         }
      }
   }

   private void II1l(IO_I.III var1) {
      if (!var1.I0o) {
         if (var1.lO_O >= 0) {
            var1.I1 = var1.lO_O;
            var1.I1I = var1.lO_0;
            var1.I0o = true;
         } else {
            IOol var2 = this.IIII.II;
            int var3 = 150 + this.IIIl.nextInt(150);
            var1.I1 = var2.I1 + (this.IIIl.nextBoolean() ? var3 : -var3);
            if (var1.I1 < 60) {
               var1.I1 = var2.I1 + var3;
            }

            var1.I1I = var2.I1I;
            var1.I0o = true;
         }
      }
   }

   private void II(IO_I.III var1, boolean var2) {
      if (this.IIII.II != null) {
         this.II1l(var1);
         var1.I0oI = true;
         IO0o var3 = new IO0o(-5)
            .IIII(var1.I1l)
            .IIII(-1)
            .II(0)
            .II(false)
            .II(var1.lOl0)
            .II(var1.II.lOlI)
            .II(var1.II.lOlI)
            .III(var1.II.I1o1[0])
            .II(var1.II1o)
            .IIII(var1.llIl)
            .IIII(var1.lOlO)
            .III(var1.II.I1o1[1])
            .III(var1.II.I1o1[2])
            .II(var1.II.I1o1[3])
            .II(-1)
            .III(var1.I1)
            .III(var1.I1I)
            .III(0)
            .III(0)
            .II(0)
            .II(0)
            .II(0)
            .III(-1)
            .II(0)
            .II(0)
            .III(var1.II.I1o1[4])
            .II(var1.II.I1o1[5])
            .III(-1);
         this.IIII.II(var3);
         if (var1.llIl <= 0) {
            this.IIII.II(new IO0o(-8).IIII(var1.I1l).II(0).III(var1.I1).III(var1.I1I));
         }

         if (var1.II == null) {
            var1.II = this.II.II(var1);
         }

         var1.II.IoOo = var1.llIl <= 0 || var1.status == 6 || var1.status == 7 || var1.status == 8;
      }
   }

   void II11(IO_I.III var1) {
      if (var1.I0oI) {
         this.IIII.II(new IO0o(-6).IIII(var1.I1l));
         var1.I0oI = false;
         if (var1.II != null) {
            var1.II.IoOo = true;
         }
      }
   }

   private void II(IO_I.III var1, int var2) {
      var1.lOl0 = var2;
      if (var1.I0oI && this.II(var1)) {
         this.IIII.II(new IO0o(-30).II(35).IIII(var1.I1l).II(var2));
      }
   }

   private void III(IO_I.III var1, int var2, int var3) {
      int var4 = var1.I1 - var2 < 0 ? 1 : -1;
      int var5 = 40 + this.IIIl.nextInt(21);
      var1.I1 += var4 * var5;
      var1.I1I = var3 + (this.IIIl.nextInt(10) < 3 ? -50 : 0);
      if (var1.I0oI) {
         this.IIII.II(new IO0o(-7).IIII(var1.I1l).III(var1.I1).III(var1.I1I));
      }
   }

   private void IIII(IO_I.III var1, int var2, int var3) {
      var1.I1 = var2;
      var1.I1I = var3;
      if (var1.I0oI) {
         this.IIII.II(new IO0o(-7).IIII(var1.I1l).III(var1.I1).III(var1.I1I));
      }
   }

   private void II1_(IO_I.III var1) {
      if (var1.lO_O >= 0) {
         int var2 = var1.lO_O - var1.I1;
         int var3 = var1.lO_0 - var1.I1I;
         if (var2 != 0 || var3 != 0) {
            int var4 = (int)Math.sqrt((double)var2 * var2 + (double)var3 * var3);
            int var5 = 40 + this.IIIl.nextInt(21);
            if (var4 <= var5) {
               var1.I1 = var1.lO_O;
               var1.I1I = var1.lO_0;
            } else {
               var1.I1 += var2 * var5 / var4;
               var1.I1I += var3 * var5 / var4;
            }

            if (var1.I0oI) {
               this.IIII.II(new IO0o(-7).IIII(var1.I1l).III(var1.I1).III(var1.I1I));
            }
         }
      }
   }

   private static int II(IO_I.III var0, int var1, int var2) {
      double var3 = var0.I1 - var1;
      double var5 = var0.I1I - var2;
      return (int)Math.sqrt(var3 * var3 + var5 * var5);
   }

   private static int II1_(int var0) {
      if (var0 == 1 || var0 == 3 || var0 == 5) {
         return 300;
      } else {
         return var0 != 0 && var0 != 2 && var0 != 4 && var0 != 9 && var0 != 17 ? 500 : 100;
      }
   }

   private void III_(IO_I.III var1, long var2) {
      if (var2 >= var1.I110) {
         if (!this.II.Il0l()) {
            if (var2 - var1.I1l0 >= 100L && var1.lOl0 == 5 && var1.II.length != 0) {
               var1.I1l0 = var2;
               if (this.II(var1) && var1.I0oI) {
                  IOol var4 = this.IIII.II;
                  if (var4.llIl > 0) {
                     if (var1.lOO <= 0 || var4.I1 >= var1.lO_o && var4.I1 <= var1.lOO) {
                        if (!var1.IoI || var4._l0l != 10) {
                           if (var1.II.lIlI.equals(I1lO("ሷዛያኇአ፞\u137dጐጢ", 4726))) {
                              this.IIIO(var1, var2);
                           }

                           if (var2 >= var1.I1lo) {
                              int var5 = this.IIIl.nextInt(var1.II.length);
                              IOO.IIIO var6 = var1.II[var5];
                              if (II(var1, var4.I1, var4.I1I) <= II1_(var6.lO0I)) {
                                 if (this.IIIl.nextInt(20) < 5) {
                                    boolean var7 = var6.lO0I == 1 || var6.lO0I == 3 || var6.lO0I == 5;
                                    int var8 = var7 ? 20 + this.IIIl.nextInt(181) : 10 + this.IIIl.nextInt(31);
                                    int var9 = this.IIIl.nextInt(10) % 2 == 0 ? var4.I1I : var4.I1I - this.IIIl.nextInt(var7 ? 71 : 51);
                                    this.IIII(var1, var4.I1 + (this.IIIl.nextBoolean() ? var8 : -var8), var9);
                                 }

                                 if (var2 - var1.III_[var5] < var1.I1o0[var5]) {
                                    return;
                                 }

                                 if (var1.II.lIlI.equals(I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏙᏤᎎᎺ", 4726)) && var4.I1I < 220) {
                                    return;
                                 }

                                 var1.III_[var5] = var2;
                                 boolean var10 = var6.lO0I == 6 || var6.lO0I == 20 || var6.lO0I == 22 || var6.lO0I == 23;
                                 if (!var10) {
                                    var1.I1lo = var2 + 1000L + this.IIIl.nextInt(1001);
                                 }

                                 this.II(var1, var6);
                              } else if (this.IIIl.nextBoolean()) {
                                 this.III(var1, var4.I1, var4.I1I);
                              }
                           }
                        }
                     } else {
                        this.II1_(var1);
                     }
                  }
               }
            }
         }
      }
   }

   private void II(IO_I.III var1, IOO.IIIO var2) {
      IOol var3 = this.IIII.II;
      switch (var2.lO0I) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 9:
         case 17:
         case 24:
         case 25:
         case 26:
            int var10 = (int)Math.min(2000000000L, (long)var1.lllI * var2.lo / 100L);
            var10 += var10 * (this.IIIl.nextInt(11) - 5) / 100;
            if (var10 < 1) {
               var10 = 1;
            }

            this.II.II(var1, var2, var10);
            break;
         case 6:
            int var9 = Math.max(1, var2.l1__);
            if (II(var1, var3.I1, var3.I1I) <= 120 + var9 * 30) {
               String[] var12 = new String[]{
                  I1lO("ሻ\u0c3aዀዳኑ\u0df6ፑ፯ጚᏬ", 4726), I1lO("ስዽቇኺዒ፼ඟጻፎᏼᏙጪ", 4726), I1lO("፦ዠዝዳኟ\u0dbeፄ፯ጜ൞Ꮕ", 4726), I1lO("ሻቬኔኾౝ፥ጐጽලᏤ", 4726)
               };
               int var6 = var9 + 2;
               if (this.IIII.II.II1O(var6 * 1000, var1.I1l)) {
                  this.IIII.II(new IO0o(44).IIII(var3.I1l).II(var12[this.IIIl.nextInt(var12.length)]));
                  this.IIII.II(new IO0o(-45).II(0).IIII(var1.I1l).III(var2.I1l).II(0).II(1).IIII(var3.I1l).II(var6));
               }
            }
         case 7:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 18:
         case 19:
         case 21:
         default:
            break;
         case 8:
            if (var1.llIl < var1.lOlO) {
               var1.llIl = Math.min(var1.lOlO, var1.llIl + var1.lOlO / 20);
               this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
            }
            break;
         case 20:
            int var8 = Math.max(1, var2.l1__);
            this.II(var1, I1lO("ሲ\u0c5e\u12d7ኻዒ፲ፘጺ\u1317ൎᏂᏫ\u139eૠᑋᑧᐒᓭ\u0a79ᒪ", 4726));
            this.IIII(var1, var3.I1 + (this.IIIl.nextBoolean() ? 25 : -25), var3.I1I);
            int var5 = (int)Math.min(2000000000L, (long)var1.lllI * Math.max(100, var2.lo) / 100L);
            if (var5 < 1) {
               var5 = 1;
            }

            this.II.II(var1, var2, var5);
            if (var3.llIl > 0) {
               this.IIII.II.II0_((var8 + 1) * 500, var1.I1l);
            }
            break;
         case 22:
            int var7 = Math.max(1, var2.l1__);
            this.IIII.II.II0O((var7 + 4) * 1000, var1.I1l);
            break;
         case 23:
            int var4 = Math.max(1, var2.l1__);
            this.IIII.II.II00(var4 * 5000, var1.I1l);
      }
   }

   IO_I.III II(int var1) {
      for (int var2 = 0; var2 < this.III_.size(); var2++) {
         IO_I.III var3 = (IO_I.III)this.III_.elementAt(var2);
         if (var3.I1l == var1 && var3.I0oI && var3.lOlo >= 0) {
            return var3;
         }
      }

      return null;
   }

   IO_I.III II() {
      for (int var1 = 0; var1 < this.III_.size(); var1++) {
         IO_I.III var2 = (IO_I.III)this.III_.elementAt(var1);
         if (var2.lOlo >= 0 && this.II(var2) && this.III(var2) && var2.lOl0 == 5) {
            return var2;
         }
      }

      return null;
   }

   private int II(IO_I.III var1, String var2, int var3) {
      if (var2.startsWith(I1lO("ሢዔዤኌኡፄ", 4726))
         || var2.startsWith(I1lO("ሢዔዺኌኰፘ\u137eጇ", 4726))
         || var2.startsWith(I1lO("ስዝዽኖኼፎ፲ጆጠᏅ", 4726))
         || var2.startsWith(I1lO("ሲዚዽኌኦፃ፥ጀጠᏊ", 4726))) {
         return this.IIIl.nextInt(100) < 10 ? -1 : Math.min(var3, Math.max(1, var1.lOlO / 100));
      } else if (var2.equals(I1lO("ሱዚዸኗ\u12b7፟፯ጉጼᏄᏩ᎑Ꭻ", 4726))) {
         return Math.min(var3, 50000000);
      } else if (var2.equals(I1lO("ሴዜዹኒ", 4726)) || var2.equals(I1lO("ሻዔዠኁኽፘ", 4726)) || var2.equals(I1lO("ሲዚዽ", 4726)) || var2.equals(I1lO("ሬዚዹኑኻፔ", 4726))) {
         return this.IIIl.nextInt(1000) < 10 ? -1 : Math.min(Math.max(1, var3 / 7), Math.max(1, var1.lOlO / 50));
      } else if (var2.equals(I1lO("ሽዝዽኗኽፅ", 4726))) {
         return Math.max(1, var3 / 7);
      } else if (var2.equals(I1lO("ሸዒዡኊ\u12b7ፅ፤ጇጯᏃ", 4726))
         || var2.equals(I1lO("ሸዝድኇኦፙ፱ጁ", 4726))
         || var2.equals(I1lO("ሢዝዡኊክፅ፹ጁጦ", 4726))
         || var2.equals(I1lO("ሥዚዺኌኦፘ\u137eጇ", 4726))) {
         return var3 > 1000000 ? 900000 + this.IIIl.nextInt(100001) : var3;
      } else if (var2.equals(I1lO("ሴዐያኝኳ", 4726))) {
         return Math.min(var3, 500000);
      } else if (var2.equals(I1lO("ሲ\u12c7ድኑኧፃ፱", 4726))
         || var2.equals(I1lO("ሲ\u12c7ድኑኧፃ፱ጐ\u135c", 4726))
         || var2.equals(I1lO("ሲ\u12c7ድኑኧፃ፱ጐ፝", 4726))
         || var2.equals(I1lO("ሱዚዿኆ", 4726))) {
         return Math.min(var3, 20000000);
      } else if (var2.equals(I1lO("ስዔደኚ\u12b1", 4726))) {
         return Math.min(var3, 10000000);
      } else if (var2.equals(I1lO("ሻዔዶኆክጠጂጇ", 4726))) {
         return var3 >= 50000000 ? 50000000 + this.IIIl.nextInt(20001) - 10000 : var3;
      } else {
         return var3;
      }
   }

   boolean III(IO_I.III var1) {
      return var1.I0oI && var1.llIl > 0 && var1.status >= 3 && var1.status <= 5;
   }

   boolean IIII(IO_I.III var1) {
      return var1.IoI0 && I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏙ\u13feᎊᎤᑎ", 4726).equals(var1.II.lIlI) && this.IIII.II.Il11();
   }

   int II(IO_I.III var1, int var2, boolean var3, IOO.IIIO var4) {
      return this.II(var1, var2, var3, var4, this.IIII.II.I1l);
   }

   int II(IO_I.III var1, int var2, boolean var3, IOO.IIIO var4, int var5) {
      if (!this.III(var1)) {
         return 0;
      }

      String var6 = var1.II.lIlI;
      if (var6.equals(I1lO("ሷዛያኇአ፞\u137dጐጢ", 4726))) {
         var2 = 1;
      } else if (var6.equals(I1lO("ሹዊደኜዃ", 4726))) {
         var2 = 50000;
      }

      if (!var6.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮄ", 4726)) || var4 == null || var4.lO0I != 1 && var4.lO0I != 3 && var4.lO0I != 5) {
         if (!var6.equals(I1lO("ሲ\u12c7ያኘኽፃ፵", 4726)) || var4 == null || var4.lO0I != 1 && var4.lO0I != 3 && var4.lO0I != 5) {
            if (var1.I0o1 && var4 != null && this.IIIl.nextInt(1000) < 400) {
               this.II(var1, I1lO("ሮቸኔኻగ፥", 4726));
               return 0;
            }

            if (var1.IoI && this.IIII.II._l0l == 10) {
               this.II.IIol(I1lO("ሴఴዚዳᏣ፰፞ጨፎᏯ൧Ꮻ\u139eᑡᓜᐮᑆᓨᓍᐩᒌᔭᔀᕗᖽᔄᖼᗘᖲତᘸᛣᘥᘜ\u16faᚓᚵᚘ\u09b3ᝆᝮᜏ\u1775៊", 4726));
               return 0;
            }

            if (var1.IoI0) {
               if (this.IIII(var1)) {
                  return 0;
               }

               if (var1.lOOI > 0 && this.IIIl.nextInt(100) < var1.lOOI) {
                  this.II(var1, I1lO("ሮቸኔኻగ፥", 4726));
                  return 0;
               }

               var2 = Math.max(1, var2 / 2);
               if (var6.equals(I1lO("ሢ\u12c7ዡኝኵፎ፥\u1316ጱᏙᏤᎎᎺ", 4726)) && var4 == null) {
                  var2 = Math.max(1, var2 * 30 / 100);
               }

               if (var6.equals(I1lO("ሸዜዺኙኳፎ፱ጀጱᏙᏥᎆ", 4726)) && !var1.IolI && var1.llIl <= var1.lOlO / 2) {
                  var1.IolI = true;
                  if (this.IIIl.nextInt(5) < 4) {
                     this.IIII.II.II_l(var1);
                  }

                  return 0;
               }
            }

            if (var6.equals(I1lO("ሢዔዡኌኢፐ፩ጐጾᏌᏵ᎔Ꭾᑆᑦ᐀ᐹᓋᓥᒎᒽᕊᕡᕭᔗᔳ", 4726))) {
               if (var2 > 100) {
                  var2 = 100;
               }

               long var7 = (long)var2 * (20 + this.IIIl.nextInt(31));
               if (var7 > 10000000L) {
                  var7 = 10000000L - this.IIIl.nextInt(1000000);
               }

               if (this.IIII.II.IO_l >= 1500000L) {
                  var7 = 0L;
               }

               if (var7 > 0L) {
                  this.II.II1l(var7);
               }
            }

            if (!var6.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮉ", 4726)) && !var6.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮈ", 4726))) {
               if (var6.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮎ", 4726)) && var1.II != null) {
                  IO_I.III var11 = this.II(var1.II, I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮈ", 4726));
                  if (var11 != null && !var11.Illo() || !var1.II.Illo()) {
                     if (var2 >= var1.llIl) {
                        var2 = var1.llIl - 1;
                     }

                     if (var2 < 0) {
                        var2 = 0;
                     }
                  }
               }
            } else {
               IO_I.III var10 = var6.equals(I1lO("ሷዛደኁኽፘ፴ጐ፟Ꮉ", 4726)) ? var1 : var1.II;
               if (var10 != null && !var10.I0o0 && var2 >= var1.llIl) {
                  this.IIIO(var10);
                  this.IIII.II(new IO0o(-60).IIII(var5).II(var4 == null ? 0 : var4.I1l & 0xFF).II(1).IIII(var1.I1l).II(1).II(0).IIII(0).II(false).II(var3));
                  return 0;
               }
            }

            var2 = this.II(var1, var6, var2);
            if (var2 < 0) {
               this.II(var1, I1lO("ሮቸኔኻగ፥", 4726));
               return 0;
            }

            if (var6.equals(I1lO("ሴ\u12c7ዻኟካ", 4726)) || var6.equals(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726))) {
               if (var4 == null || var4.lO0I != 14) {
                  int var12 = Math.max(1, var1.lOlO / 100);
                  if (var2 > var12) {
                     var2 = var12;
                  }
               }

               if (this.IIIl.nextInt(var6.equals(I1lO("ሴ\u12c7ዻኟካ", 4726)) ? 10 : 30) == 0) {
                  this.IIll(var1);
               }
            }

            if (var6.equals(I1lO("ሡዝዽኀ", 4726)) && var1.I0o1) {
               var2 = Math.max(1, var2 / Math.max(1, var1.lO_I));
            }

            if (var6.equals(I1lO("ሮዐዺኌኰ፞፯ጇጻᏃᏫ", 4726))) {
               var2 = Math.max(1, var2 / 2);
            } else if (var6.equals(I1lO("ሴዔዶኊ", 4726))) {
               var2 = Math.max(1, var2 / 7);
            }

            if (var1.IoIl) {
               if (var1.IoI_) {
                  return 0;
               }

               if (var2 >= var1.llIl) {
                  this.IIII.II.II_O(var1);
                  return 0;
               }
            }

            if (var2 >= var1.llIl) {
               var2 = var1.llIl;
            }

            var1.llIl -= var2;
            boolean var13 = var1.llIl <= 0;
            this.IIII.II(new IO0o(-60).IIII(var5).II(var4 == null ? 0 : var4.I1l & 0xFF).II(1).IIII(var1.I1l).II(1).II(0).IIII(var2).II(var13).II(var3));
            this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
            if (var13) {
               this.II1O(var1);
            } else {
               if (var1.lOl0 == 0 && !var1.I0oo) {
                  this.II(var1, 5);
               }

               if (var1.I0o1 && var1.llIl < var1.lOlO / 5 && System.currentTimeMillis() - var1.I11O > 2000L) {
                  var1.I11O = System.currentTimeMillis();
                  this.II(var1, this.IIIl.nextBoolean() ? I1lO("ሷዔድኒኳፐ፱ጎጯ", 4726) : I1lO("ሗዼኔ\u12b7ና", 4726));
               }
            }

            return var2;
         } else {
            var1.llIl = Math.min(var1.lOlO, var1.llIl + var2);
            this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
            if (this.IIIl.nextInt(5) == 0) {
               this.II(var1, I1lO("ሾరዄዳኆ፹\u0dd5፡ፀᎭᏏጪᎉᐩᑆᐠᗖᔤᓍᓣᒌᕦᕈᐖᕾᔎᗽᗔᗺᖏࢵᙎᙩ", 4726));
            }

            return 0;
         }
      } else {
         var1.llIl = Math.min(var1.lOlO, var1.llIl + var2 * 80 / 100);
         this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
         if (this.IIIl.nextInt(5) == 0) {
            this.II(var1, I1lO("ሾరዄዳኆ፹\u0dd5፡ፀᎭᏏጪᎉᐩᑆᐠᗖᔤᓍᓣᒌᕦᕈᐖᕾᔎᗽᗔᗺᖏࢵᙎᙩ", 4726));
         }

         return 0;
      }
   }

   void III(IO_I.III var1, int var2) {
      if (var1.llIl > 1 && !var1.Illo()) {
         if (true) {
            if (var2 >= var1.llIl) {
               var2 = var1.llIl - 1;
            }

            var1.llIl -= var2;
            this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
            this.IIII.II(new IO0o(56).IIII(var1.I1l).IIII(var1.llIl).IIII(var2).II(false).II(36));
         }
      }
   }

   void II1O(IO_I.III var1) {
      if (var1.IoIl) {
         this.IIII.II.II_O(var1);
         var1.llIl = 1;
      } else if (var1.I0o1) {
         this.II1o(var1);
      } else {
         var1.llIl = 0;
         var1.status = 6;
         if (var1.II != null) {
            var1.II.IoOo = true;
         }

         this.IIII.II.IIO1(var1.II.lIlI);
         this.IIII.II.II(19, 1L);
         this.IIII.II(new IO0o(-8).IIII(var1.I1l).II(0).III(var1.I1).III(var1.I1I));
         if (!var1.IoI0 && !var1.IoIO) {
            this.II.II00(this.IIII.II.II1o + I1lO("ቌኵᎤሰዒ፥ፙᎥጛᎭᏈᎢഭᑽᐈᕖᗖ੦ᓇᓣ", 4726) + var1.II1o + I1lO("ቖዸ౹ኺዒ\u137fፗዿඳᏤᎌዚഫᑼᐈᐩᐁᔵ\u0a45ᒭᒅᔡᕍ௦ᕰ", 4726));
         }

         if (var1.IoIO) {
            this.II1(var1);
         } else if (var1.IoI0) {
            this.II1I(var1);
            this.IIII.II.II_I(var1);
         } else {
            this.II10(var1);
         }

         this.II.IIIo(var1.II.lIlI, var1.lOl_);
         if (var1.IoI) {
            this.IIII.II.II_1(var1);
         }
      }
   }

   private boolean IIIl(IO_I.III var1) {
      String var2 = var1.II.lIlI;
      int var3 = var1.I1;
      int var4 = var1.I1I;
      if (var2.equals(I1lO("ሴዜዹኒ", 4726)) || var2.equals(I1lO("ሻዔዠኁኽፘ", 4726)) || var2.equals(I1lO("ሲዚዽ", 4726))) {
         this.II.II(585, 1, var3, var4, null);
         return true;
      }

      if (var2.equals(I1lO("ሬዚዹኑኻፔ", 4726))) {
         this.II.II(585, 1, var3, var4, null);
         if (this.IIII.II.II__(1348) > 0) {
            this.IIII.II.II_l(1348, 1);
            this.II.l1_l();
            this.II.II(702 + this.IIIl.nextInt(7), 1, var3 + 20, var4, null);
         } else {
            this.II.IIol(I1lO("ሴఴዚዳኙ፹ᏄጡጉᎭᏏጸᏊᑎᑁઈᑆᖔ\u0a55ᒭᒅᔡᕮᕘஓᔞᖼᗹᔷᗙᜉࣴᙶᘙ࠱ᛊᛲᚳ\u17fdᜏᜀᜊ\u1778ច", 4726));
         }

         return true;
      } else {
         if (var2.equals(I1lO("ሽዝዽኗኽፅ", 4726))) {
            this.II.II(1045, 1, var3, var4, null);
            return true;
         }

         if (!var2.equals(I1lO("ሢዝዡኊክፅ፹ጁጦ", 4726))
            && !var2.equals(I1lO("ሥዚዺኌኦፘ\u137eጇ", 4726))
            && !var2.equals(I1lO("ሸዒዡኊ\u12b7ፅ፤ጇጯᏃ", 4726))
            && !var2.equals(I1lO("ሸዝድኇኦፙ፱ጁ", 4726))) {
            return var2.equals(I1lO("ሹዛዳኌኵፘ፱ጐጠᏂᏩᎇ", 4726)) || var2.equals(I1lO("ሴዐያኝኳ", 4726));
         }

         boolean var5 = var2.equals(I1lO("ሢዝዡኊክፅ፹ጁጦ", 4726)) || var2.equals(I1lO("ሥዚዺኌኦፘ\u137eጇ", 4726));
         int var6 = var5 ? 422 : (var2.equals(I1lO("ሸዒዡኊ\u12b7ፅ፤ጇጯᏃ", 4726)) ? 2123 : 2124);
         if (IOO.II(var6) == null) {
            var6 = 422;
         }

         Vector var7 = new Vector();
         int var8 = var5 ? 15 : 10;
         int var9 = var5 ? 20 : 20;
         var7.addElement(new int[]{77, var8 + this.IIIl.nextInt(var9 - var8 + 1)});
         var7.addElement(new int[]{103, var8 + this.IIIl.nextInt(var9 - var8 + 1)});
         var7.addElement(new int[]{50, var8 + this.IIIl.nextInt(var9 - var8 + 1)});
         var7.addElement(new int[]{94, 1 + this.IIIl.nextInt(10)});
         var7.addElement(new int[]{14, var5 ? 2 + this.IIIl.nextInt(4) : 1 + this.IIIl.nextInt(10)});
         var7.addElement(new int[]{154, 0});
         var7.addElement(new int[]{93, 1 + this.IIIl.nextInt(15)});
         this.II.II(var6, 1, var3, var4, var7);
         this.II.IIol(I1lO("፦ጥ\u0c57ኰዓጱፘ෬ጁᎭᏄጪᎄᐨ", 4726));
         return true;
      }
   }

   private void II10(IO_I.III var1) {
      if (!var1.IoII || !this.IIIl(var1)) {
         String var2 = var1.II.lIlI;
         int var3 = var1.I1;
         int var4 = var1.I1I;

         for (int var5 = 0; var5 < IllI.length; var5++) {
            if (IllI[var5].equals(var2)) {
               int var6 = II1l[var5][2];
               int var7 = II1l[var5][3];
               int var8 = 1 + this.IIIl.nextInt(2) + 3 + this.IIIl.nextInt(2) + 3;

               for (int var9 = 0; var9 < var8; var9++) {
                  this.II.II(II1l[var5][1], var6 + this.IIIl.nextInt(var7 - var6 + 1), var3 + this.IIIl.nextInt(101) - 50, var4, null);
               }

               this.II.II(II1l[var5][0], 1, var3 + this.IIIl.nextInt(101) - 50, var4, II(II1l[var5][0]));
               this.II.II(19, 1, var3 + this.IIIl.nextInt(101) - 50, var4, null);
               this.II.II(20, 1, var3 + this.IIIl.nextInt(101) - 50, var4, null);
               return;
            }
         }

         if (var2.equals(I1lO("ሱዚዸኗ\u12b7፟፯ጉጼᏄᏩ᎑Ꭻ", 4726))) {
            Vector var13 = new Vector();
            var13.addElement(new int[]{30, 1});
            var13.addElement(new int[]{50, 20});
            var13.addElement(new int[]{77, 20});
            var13.addElement(new int[]{103, 20});
            var13.addElement(new int[]{93, 20});
            this.II.II(629, 1, var3 + this.IIIl.nextInt(101) - 50, var4, var13);
         } else if (!this.II(var1, var2, var3, var4)) {
            boolean var12 = false;

            for (int var14 = 0; var14 < Ill.length; var14++) {
               if (Ill[var14].equals(var2)) {
                  var12 = true;
               }
            }

            this.II.II(190, 20000 + this.IIIl.nextInt(10001), var3, var4, null);
            if (!var12) {
               if (this.IIIl.nextInt(100) < 80) {
                  this.II.II(18 + this.IIIl.nextInt(3), 1, var3 + 15, var4, null);
               }
            } else {
               if (this.IIIl.nextInt(100) < 5) {
                  int[][] var15 = new int[][]{
                     {230, 231, 232, 234, 235, 236, 238, 239, 240, 242, 243, 244, 246, 247, 248, 250, 251, 252, 266, 267, 268, 270, 271, 272, 274, 275, 276},
                     {254, 255, 256, 258, 259, 260, 262, 263, 264, 278, 279, 280}
                  };
                  int[] var17 = var15[this.IIIl.nextInt(100) < 70 ? 0 : 1];
                  int var18 = var17[this.IIIl.nextInt(var17.length)];
                  Vector var19 = II(var18);
                  if (var19 != null) {
                     for (int var10 = 0; var10 < var19.size(); var10++) {
                        int[] var11 = (int[])var19.elementAt(var10);
                        var11[1] = var11[1] * (100 + this.IIIl.nextInt(16)) / 100;
                     }

                     int var20 = this.IIIl.nextInt(100) + 1;
                     var19.addElement(new int[]{107, var20 <= 80 ? 1 + this.IIIl.nextInt(3) : (var20 <= 97 ? 4 + this.IIIl.nextInt(2) : 6)});
                  }

                  this.II.II(var18, 1, var3 + 15, var4, var19);
               }

               int var16 = this.IIIl.nextInt(100) + 1;
               this.II.II(var16 <= 40 ? 18 : (var16 <= 70 ? 17 : (var16 <= 90 ? 16 : 15)), 1, var3 - 15, var4, null);
            }
         }
      }
   }

   private static boolean II(String var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].equals(var0)) {
            return true;
         }
      }

      return false;
   }

   private void II1l(int var1, int var2) {
      int[] var3 = II11[this.IIIl.nextInt(100) < 70 ? 0 : 1];
      int var4 = var3[this.IIIl.nextInt(var3.length)];
      Vector var5 = II(var4);
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.size(); var6++) {
            int[] var7 = (int[])var5.elementAt(var6);
            var7[1] = var7[1] * (100 + this.IIIl.nextInt(16)) / 100;
         }

         int var8 = this.IIIl.nextInt(100) + 1;
         var5.addElement(new int[]{107, var8 <= 80 ? 1 + this.IIIl.nextInt(3) : (var8 <= 97 ? 4 + this.IIIl.nextInt(2) : 6)});
      }

      this.II.II(var4, 1, var1 + 15, var2, var5);
   }

   private void II11(int var1, int var2) {
      int var3 = this.IIIl.nextInt(100) + 1;
      this.II.II(var3 <= 40 ? 18 : (var3 <= 70 ? 17 : (var3 <= 90 ? 16 : 15)), 1, var1 - 15, var2, null);
   }

   private boolean II(IO_I.III var1, String var2, int var3, int var4) {
      if (var2.equals(I1lO("ሴ\u12c7ዻኟካ", 4726))) {
         return true;
      }

      if (var2.equals(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726))) {
         if (this.IIII.II.III == null) {
            this.IIII.II.Ilol(this.IIIl.nextInt(3));
         }

         return true;
      } else {
         if (var2.startsWith(I1lO("ሲዐድኇኺፎ፲ጊጯᏀ", 4726))) {
            Vector var12 = new Vector();
            var12.addElement(new int[]{30, 1});
            var12.addElement(new int[]{50, 20});
            var12.addElement(new int[]{77, 20});
            var12.addElement(new int[]{103, 20});
            var12.addElement(new int[]{93, 20});
            this.II.II(629, 1, var3 + this.IIIl.nextInt(101) - 50, var4, var12);
            return true;
         }

         if (II(var2, Ill)) {
            this.II.II(190, 20000 + this.IIIl.nextInt(10001), var3, var4, null);
            if (this.IIIl.nextInt(100) < 30) {
               this.II.IIO_(var3, var4);
            }

            if (this.IIIl.nextInt(100) < (var2.equals(I1lO("ሥዜዱኆክፓ\u137fጐጦᏘᏢᎌ", 4726)) ? 30 : 5)) {
               this.II1l(var3, var4);
            }

            this.II11(var3, var4);
            if (var2.equals(I1lO("ሴዙድነኹፎ፷ጀጥᏘ", 4726)) && this.IIIl.nextInt(100) < 50) {
               this.II.II(992, 1, var3 + 25, var4, null);
            }

            return true;
         } else if (var2.equals(I1lO("ሴዔዶኊ", 4726)) || var2.equals(I1lO("ሴዔዶኊክ\u135c\u137fጁጥᏈᏵ", 4726))) {
            int[] var11 = new int[]{562, 564, 566, 561};
            int[] var14 = new int[]{555, 557, 559, 556, 558, 560, 563, 565, 567};
            if (this.IIIl.nextInt(30) < 8) {
               this.II.III0(var11[this.IIIl.nextInt(var11.length - 1)], var3, var4);
            } else if (this.IIIl.nextInt(50) < 15) {
               this.II.III0(var14[this.IIIl.nextInt(var14.length - 1)], var3, var4);
            }

            return true;
         } else if (II(var2, Illl)) {
            this.II.II(190, 20000 + this.IIIl.nextInt(10001), var3, var4, null);
            if (this.IIIl.nextInt(500) == 0) {
               this.II.IIO_(var3, var4);
            }

            if (this.IIIl.nextInt(100) == 0) {
               this.II1l(var3, var4);
            }

            this.II.II(20, 1, var3, var4, null);
            if (this.IIIl.nextInt(100) < 10) {
               int var10 = this.IIIl.nextInt(100) + 1;
               this.II.II(var10 <= 50 ? 19 : (var10 <= 90 ? 18 : (var10 <= 96 ? 17 : (var10 <= 99 ? 16 : 15))), 1, var3 + 15, var4, null);
            }

            return true;
         } else if (!var2.equals(I1lO("ሢዔዡኌኢፐ፩ጐጾᏌᏵ᎔Ꭾᑆᑦ᐀ᐹᓋᓥᒎᒽᕊᕡᕭᔗᔳ", 4726))
            && !var2.startsWith(I1lO("ሢዔዤኌኡፄ", 4726))
            && !var2.startsWith(I1lO("ሢዔዺኌኰፘ\u137eጇ", 4726))
            && !var2.startsWith(I1lO("ስዝዽኖኼፎ፲ጆጠᏅ", 4726))
            && !var2.equals(I1lO("ሲዚዽኌኦፃ፥ጀጠᏊᏳ\u13fe", 4726))) {
            if (!var2.equals(I1lO("ሷዛያኇአ፞\u137dጐጢ", 4726))) {
               if (var2.equals(I1lO("ሹዊደኜዃ", 4726))) {
                  this.II.II(189, 200, var3 + this.IIIl.nextInt(41) - 20, var4, null);
                  int var9 = 441 + this.IIIl.nextInt(7);
                  int[] var13 = IOoI.IIII(var9);
                  Vector var15 = new Vector();
                  var15.addElement(new int[]{var13[0], var13[1]});
                  var15.addElement(new int[]{30, 0});
                  this.II.II(var9, 1, var3 + this.IIIl.nextInt(41) - 20, var4, var15);
                  return true;
               }

               if (var2.equals(I1lO("ሥዚዽኌኺፔ፳ጐጿᏘᏵᎅᏛ", 4726))) {
                  this.II.II(1591, 1, var3 + this.IIIl.nextInt(41) - 20, var4, null);
                  this.II.II(1594, 1, var3 + this.IIIl.nextInt(41) - 20, var4, null);
                  return true;
               }

               if (var2.startsWith(I1lO("ሮዐዺኌ\u12b1፞\u137e", 4726))) {
                  this.II.II(190, 20000 + this.IIIl.nextInt(10001), var3, var4, null);
                  if (this.IIIl.nextInt(100) < 80) {
                     this.II.II(18 + this.IIIl.nextInt(3), 1, var3 + 15, var4, null);
                  }

                  return true;
               } else {
                  return false;
               }
            } else {
               if (var1.I1_1 > 0L) {
                  long var8 = var1.I1_1 * 8L / 10L / 5L;

                  for (int var7 = 0; var7 < 5; var7++) {
                     this.II.II(190, (int)Math.min(2000000000L, var8), var3 + var7 * 3, var4, null);
                  }
               }

               return true;
            }
         } else {
            if (var2.equals(I1lO("ሢዔዡኌኢፐ፩ጐጾᏌᏵ᎔Ꭾᑆᑦ᐀ᐹᓋᓥᒎᒽᕊᕡᕭᔗᔳ", 4726))) {
               return true;
            }

            int var5 = var2.equals(I1lO("ሢዔዤኌኡፄ፯\u137f", 4726))
               ? 5
               : (
                  var2.equals(I1lO("ሢዔዺኌኰፘ\u137eጇጱᎽ", 4726))
                     ? 4
                     : (var2.equals(I1lO("ስዝዽኖኼፎ፲ጆጠᏅᏳᏻ", 4726)) ? 3 : (var2.equals(I1lO("ሲዚዽኌኦፃ፥ጀጠᏊᏳ\u13fe", 4726)) ? 2 : 5))
               );
            if (this.IIIl.nextInt(var5) == 0) {
               Vector var6 = new Vector();
               var6.addElement(new int[]{31, 1});
               this.II.II(590, 1, this.IIII.II.I1 + this.IIIl.nextInt(21) - 10, this.IIII.II.I1I, var6);
            }

            return true;
         }
      }
   }

   private void IIIO(IO_I.III var1, long var2) {
      IOol var4 = this.IIII.II;
      if (var2 - var1.I1__ >= 500L && var1.I1_1 <= 10000000000L) {
         if (Math.abs(var4.I1 - var1.I1) <= 40 && Math.abs(var4.I1I - var1.I1I) <= 40) {
            int var5 = 0;
            if (var4.Il11 >= 1000000000L) {
               var5 = 4000 + this.IIIl.nextInt(1001);
            } else if (var4.Il11 >= 2000000L) {
               var5 = 200000 + this.IIIl.nextInt(100001);
            } else if (var4.Il11 >= 1000000L) {
               var5 = 1000 + this.IIIl.nextInt(1001);
            }

            var1.I1__ = var2;
            if (var5 > 0) {
               var4.Il11 -= var5;
               var1.I1_1 += var5;
               this.II.l1_();
               this.II(var1, I1lO("ሾዴዜኲዒሀᏓ፯ጚ\u13ff൵ᎦᏊᔘᖘતᐅᒥ", 4726) + var1.I1_1 + I1lO("ቖዃቔኽን", 4726));
            }
         }
      }
   }

   static Vector II(int var0) {
      IOO.I___();
      if (IOO.II == null) {
         return null;
      }

      for (int var1 = 0; var1 < IOO.II.length; var1++) {
         IOO.III1 var2 = IOO.II[var1];
         if (var2 != null && var2.II != null) {
            for (int var3 = 0; var3 < var2.II.length; var3++) {
               IOO.III0 var4 = var2.II[var3];
               if (var4 != null && var4.II != null) {
                  for (int var5 = 0; var5 < var4.II.length; var5++) {
                     IOO.III_ var6 = var4.II[var5];
                     if (var6 != null && var6.l0o1 == var0 && var6.II10 != null) {
                        Vector var7 = new Vector();

                        for (int var8 = 0; var8 < var6.II10.length; var8++) {
                           var7.addElement(new int[]{var6.II10[var8][0], var6.II10[var8][1]});
                        }

                        return var7;
                     }
                  }
               }
            }
         }
      }

      return null;
   }

   synchronized void IooO() {
      Vector var1 = new Vector();

      for (int var2 = 0; var2 < this.III_.size() && var1.size() < 255; var2++) {
         IO_I.III var3 = (IO_I.III)this.III_.elementAt(var2);
         if (!var3.I0oO && !var3.IoIO && !var3.I0o1 && (var3.II == null || var3.lOlo >= 0)) {
            int var4 = var3.II[0].IIO.length > 0 ? var3.II[0].IIO[0] : -1;
            if (var4 != 111 && var4 < 165 && (var4 < 131 || var4 > 133) && (var4 < 114 || var4 > 120) && (var4 < 85 || var4 > 91)) {
               var1.addElement(new Integer(var2));
            }
         }
      }

      IO0o var8 = new IO0o(-96).II(0).II(I1lO("ሴዺ\u12c7አ", 4726)).II(var1.size());

      for (int var9 = 0; var9 < var1.size(); var9++) {
         int var10 = (Integer)var1.elementAt(var9);
         IO_I.III var5 = (IO_I.III)this.III_.elementAt(var10);
         IO_I.II var6 = var5.II[0];
         var8.IIII(var10).IIII(var10).III(var6.I1o1[0]).III(-1).III(var6.I1o1[1]).III(var6.I1o1[2]).II(var6.II1o).II(Ill1[var5.status]);
         I0Io.II var7 = var5.lOlo >= 0 ? I0Io.II(var5.lOlo) : null;
         var8.II(var7 == null ? I1lO("ቋኼኝ", 4726) : var7.II1o + I1lO("\u125e", 4726) + var7.I1l + I1lO("\u125fኵዟኻኇጱ", 4726) + var5.lO1);
      }

      this.IIII.II(var8);
   }

   void II1o(int var1) {
      synchronized (this.II) {
         this.Ill_(var1);
      }
   }

   private void Ill_(int var1) {
      if (var1 >= 0 && var1 < this.III_.size()) {
         IO_I.III var2 = (IO_I.III)this.III_.elementAt(var1);
         I0Io.II var3 = var2.lOlo >= 0 ? I0Io.II(var2.lOlo) : null;
         if (var3 == null || var2.status < 3 || var2.status > 5) {
            this.II.IIol(I1lO("ሽዽቀኽንጱፄጧතᎭᏘᎣഛᑪᐈᐯᐏੂᓊ", 4726));
         } else if (this.IIII.II01(var2.lOlo)) {
            int var4 = 200;
            int var5 = 300;
            if (var3.III.length > 0) {
               var4 = var3.III[0].I1;
               var5 = var3.III[0].I1I;
            } else if (var3.II.length > 0) {
               I0Io.IIIl var6 = var3.II[0];
               var4 = (var6.__1o + var6.___I) / 2;
               var5 = var6.___l;
            }

            IOol var7 = this.IIII.II;
            var7.lO1 = var2.lO1;
            this.IIII.III_(var2.lOlo, var4, var5);
         }
      } else {
         this.II.IIol(I1lO("ሽዽቀኽንጱፄጧතᎭᏘᎣഛᑪᐈᐯᐏੂᓊ", 4726));
      }
   }

   synchronized boolean IIIl(String var1, boolean var2) {
      I___();

      for (int var3 = 0; var3 < this.III_.size(); var3++) {
         if (((IO_I.III)this.III_.elementAt(var3)).I0o1) {
            return false;
         }
      }

      IO_I.III var5 = this.II(var1, null, 0);
      if (var5 == null) {
         return false;
      }

      var5.I0o1 = true;
      var5.I0o_ = var2;
      var5.I0ol = false;
      IOol var4 = this.IIII.II;
      var5.lO1o = var4.lOlo;
      var5.lO_ = var4.lO1;
      var5.status = 1;
      var5.I1ll = System.currentTimeMillis();
      this.IIII.II(new IO0o(-73).II(18).II(0));
      return true;
   }

   synchronized boolean Ill0() {
      I___();

      for (int var1 = 0; var1 < this.III_.size(); var1++) {
         if (((IO_I.III)this.III_.elementAt(var1)).I0o1) {
            return false;
         }
      }

      IO_I.III var3 = this.II(I1lO("ሡዝዽኀ", 4726), null, 0);
      if (var3 == null) {
         return false;
      }

      var3.I0o1 = true;
      var3.I0o_ = false;
      var3.I0ol = false;
      var3.lO_I = this.IIII.II._11I + 1;
      IOol var2 = this.IIII.II;
      var3.lO1o = var2.lOlo;
      var3.lO_ = var2.lO1;
      var3.status = 1;
      var3.I1ll = System.currentTimeMillis();
      this.IIII.II(new IO0o(-73).II(18).II(0));
      return true;
   }

   private void III0(IO_I.III var1, long var2) {
      IOol var4 = this.IIII.II;
      if (!this.II(var1)) {
         this.II_(var1);
      } else if (var4.llIl <= 0) {
         this.II(var1, I1lO("ሺዠውఔኜጱፄ\u0de2ጞᎭᏘᎢൕᑹᐈᕖᐏ", 4726));
         this.II(var1, 0);
         var1.status = 4;
         var1.I11I = var2;
      } else {
         if (var1.lOl0 == 0) {
            this.II(var1, 5);
         }

         this.IIIl(var1, var2);
         if (var2 - var1.I111 >= 30000L) {
            var1.I111 = var2;
            if (var1.llIl > 0 && var1.llIl < var1.lOlO) {
               var1.llIl = Math.min(var1.lOlO, var1.llIl + var1.lOlO / 5);
               this.IIII.II(new IO0o(-30).II(9).IIII(var1.I1l).IIII(var1.llIl).IIII(var1.lOlO));
            }
         }

         if (var1.II.lIlI.equals(I1lO("ሽዔዦኚኼ", 4726)) && var2 - var1.I11_ > 5000L) {
            var1.I11_ = var2;
            this.IIII(var1, var4.I1 + (this.IIIl.nextBoolean() ? 1 : -1) * (20 + this.IIIl.nextInt(61)), var1.I1I);
         }

         this.III_(var1, var2);
      }
   }

   private void IIIo(IO_I.III var1, long var2) {
      IOol var4 = this.IIII.II;
      if (!this.II(var1)) {
         this.II_(var1);
      } else {
         if (var1.I11I == 0L) {
            var1.I11I = var2;
         }

         if (var1.II.lIlI.equals(I1lO("ሽዔዦኚኼ", 4726)) && var2 - var1.I11_ > 1500L) {
            var1.I11_ = var2;
            this.III(var1, var4.I1, var4.I1I);
         }

         if (var2 - var1.I11I > (var1.II.lIlI.equals(I1lO("ሯዔዾኚአ፞", 4726)) ? 15000 : (var1.II.lIlI.equals(I1lO("ሡዝዽኀ", 4726)) ? 1000 : 5000))) {
            this.II_(var1);
         }
      }
   }

   private void II1o(IO_I.III var1) {
      var1.llIl = 0;
      if (var1.II != null) {
         var1.II.IoOo = true;
      }

      this.IIII.II(new IO0o(-8).IIII(var1.I1l).II(0).III(var1.I1).III(var1.I1I));
      this.II(var1, 0);
      if (var1.II.Ill0.length > 0) {
         String var2 = var1.II.Ill0[0];
         this.II(var1, var2.substring(var2.lastIndexOf(124) + 1));
      }

      var1.status = 4;
      var1.I11I = System.currentTimeMillis();
      if (var1.II.lIlI.equals(I1lO("ሡዝዽኀ", 4726))) {
         this.IIII.II._11I = var1.lO_I;
         this.IIII.II._11l = (int)Math.min(2147483647L, System.currentTimeMillis() - var1.I11);
         this.II.IIol(I1lO("ሴఴዚዳᏣᏲጐጻጆഢᏂᎬᏊ", 4726) + var1.II1o + I1lO("\u1257", 4726));
         this.IIII.I__O();
      } else if (var1.I0o_) {
         this.IIII.II._lO_++;
         this.II.IIol(I1lO("ሴఴዚዳᏣᏲጐጻጆഢᏂᎬᏊ", 4726) + var1.II1o + I1lO("\u1257", 4726));
         this.IIII.I__O();
      }
   }

   private void II_(IO_I.III var1) {
      this.II11(var1);
      var1.lOlo = -1;
      var1.I0oO = true;
      var1.status = 0;
      this.IIII.II(new IO0o(-73).II(18).II(1));
   }

   synchronized String IIll(String var1) {
      IO_I.III var2 = null;

      for (int var3 = 0; var3 < this.III_.size(); var3++) {
         IO_I.III var4 = (IO_I.III)this.III_.elementAt(var3);
         if (var4.II.lIlI.equalsIgnoreCase(var1) && var4.II == null && (var2 == null || var2.status != 0 && var4.status == 0)) {
            var2 = var4;
         }
      }

      if (var2 == null && var1.equalsIgnoreCase(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726))) {
         var2 = this.II(I1lO("ሥዀዤኖአፎ፲ጝጡᏁᏵ", 4726), null, 0);
         if (var2 != null) {
            var2.IoIo = true;
         }
      }

      if (var2 == null) {
         return I1lO("ሽዽዛኽንጱፓጠፎᏯᏃᎸ᎙ᐩ", 4726) + var1;
      }

      IOol var5 = this.IIII.II;
      if (var2.I0oI) {
         this.II11(var2);
      }

      var2.lOlo = -1;
      var2.lOl_ = -1;
      var2.lO1o = var5.lOlo;
      var2.lO_ = var5.lO1;
      var2.status = 1;
      return I1lO("ሲዴኔኴኝ፸ጐ", 4726) + var2.II.lIlI + I1lO("ቖዱዑኽዒ፼ፑጿፎ", 4726) + var5.lOlo;
   }

   synchronized String IIl_() {
      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < this.III_.size(); var2++) {
         IO_I.III var3 = (IO_I.III)this.III_.elementAt(var2);
         if (var3.II == null && var3.lOlo >= 0) {
            I0Io.II var4 = I0Io.II(var3.lOlo);
            var1.append(var3.II.lIlI)
               .append(I1lO("ቖዕ", 4726))
               .append(var4 == null ? I1lO("\u1249", 4726) : var4.II1o)
               .append(I1lO("ቖዾዜኦዒ", 4726))
               .append(var3.lO1)
               .append('\n');
         }
      }

      return var1.length() == 0 ? I1lO("ሽዽዛኽንጱፓጠፎᏯᏃᎸ᎙ᐩᑆᐦᐉᒥᓀᒢᒌᕦᔀᕇᔫᔜᗨᖛᖲᖐᙽᙙ", 4726) : var1.toString();
   }

   static final class II {
      String lIlI;
      String II1o;
      int lOlI;
      int lllI;
      int lOll;
      int lOl1;
      int[] I1o1;
      int[] I1o_;
      int[] IIO;
      int[] I1oO;
      int[][] II1_;
      String[] Ill_;
      String[] IllO;
      String[] Ill0;
   }

   static final class III {
      IO_I.IIII II;
      int I1l;
      IO_I.II[] II;
      int lOl_ = -1;
      int status = 0;
      IO_I.II II;
      String II1o = "";
      int llIl;
      int lOlO;
      int lllI;
      int lOl0;
      int lOlo = -1;
      int lO1;
      int I1;
      int I1I;
      boolean I0o;
      boolean I0oI;
      long I1lI;
      long I1ll;
      long I1l1;
      long I1l_;
      long I1lO;
      long I1l0;
      int lO1I;
      int lO1l;
      int lO11;
      int lO1_;
      int lO1O;
      IOO.IIIO[] II = new IOO.IIIO[0];
      long[] III_ = new long[0];
      int[] I1o0 = new int[0];
      long I1lo;
      IO_I.III II;
      IO_I.III[][] II;
      int lO10;
      int lO1o = -1;
      int lO_ = -1;
      IOoI.III II;
      boolean I0ol;
      boolean I0o1;
      boolean I0o_;
      boolean I0oO;
      int lO_I;
      long I11;
      int lO_l = -1;
      long I11I;
      long I11l;
      long I111;
      long I11_;
      long I11O;
      long I110;
      long I11o;
      int lO_1 = -1;
      boolean I0o0;
      boolean I0oo;
      boolean Io;
      boolean IoI;
      boolean IoII;
      long I1_;
      long I1_I;
      int lO__;
      long I1_l;
      boolean IoIl;
      boolean IoI1;
      boolean IoI_;
      boolean IoIO;
      boolean IoI0;
      boolean IoIo;
      boolean Iol;
      boolean IolI;
      boolean Ioll;
      int lO_O = -1;
      int lO_0;
      int lO_o;
      int lOO;
      int lOOI;
      long I1_1;
      long I1__;

      boolean Illo() {
         return this.llIl <= 0;
      }
   }

   static final class IIII {
      int I1l;
      String lIlI;
      boolean Iol1;
      String[] Illo;
   }
}
