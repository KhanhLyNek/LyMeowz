package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreNotFoundException;

public final class IOoo {
   private static final int __I1 = 1313624882;
   private static final long I0Il = 300000L;
   private static long I0I1;
   private static int __I_;
   public static String lIOI;
   public static int __IO = -1;
   private static final int[] I_0o = new int[]{
      1116352408,
      1899447441,
      -1245643825,
      -373957723,
      961987163,
      1508970993,
      -1841331548,
      -1424204075,
      -670586216,
      310598401,
      607225278,
      1426881987,
      1925078388,
      -2132889090,
      -1680079193,
      -1046744716,
      -459576895,
      -272742522,
      264347078,
      604807628,
      770255983,
      1249150122,
      1555081692,
      1996064986,
      -1740746414,
      -1473132947,
      -1341970488,
      -1084653625,
      -958395405,
      -710438585,
      113926993,
      338241895,
      666307205,
      773529912,
      1294757372,
      1396182291,
      1695183700,
      1986661051,
      -2117940946,
      -1838011259,
      -1564481375,
      -1474664885,
      -1035236496,
      -949202525,
      -778901479,
      -694614492,
      -200395387,
      275423344,
      430227734,
      506948616,
      659060556,
      883997877,
      958139571,
      1322822218,
      1537002063,
      1747873779,
      1955562222,
      2024104815,
      -2067236844,
      -1933114872,
      -1866530822,
      -1538233109,
      -1090935817,
      -965641998
   };

   private IOoo() {
   }

   private static String IIl0(String var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         var1 = var1 * 31 + var0.charAt(var2);
      }

      return I10I("혌훳훏훓횷횉흹", 54882) + (var1 & 2147483647);
   }

   private static byte[] III(String var0) {
      int[] var1 = new int[]{7230031, 5007732, 101, 6247233, 5653855, 11057};
      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2.append((char)(var1[var3] >> 16 & 0xFF));
         var2.append((char)(var1[var3] >> 8 & 0xFF));
         var2.append((char)(var1[var3] & 0xFF));
      }

      var2.append((char)(IIl0(var0).length() * 7 + 11)).append(IIl0(var0));
      String var6 = var2.toString();
      byte[] var4 = new byte[var6.length()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = (byte)(var6.charAt(var5) ^ 90 + var5);
      }

      return var4;
   }

   private static int IIl0(int var0, int var1) {
      return var0 >>> var1 | var0 << 32 - var1;
   }

   static byte[] II(byte[] var0, int var1, int var2) {
      int[] var3 = new int[]{1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
      int var4 = (var2 + 9 + 63) / 64 * 64;
      byte[] var5 = new byte[var4];
      System.arraycopy(var0, var1, var5, 0, var2);
      var5[var2] = -128;
      long var6 = var2 * 8L;

      for (int var8 = 0; var8 < 8; var8++) {
         var5[var4 - 1 - var8] = (byte)(var6 >>> 8 * var8);
      }

      int[] var21 = new int[64];

      for (byte var9 = 0; var9 < var4; var9 += 64) {
         for (int var10 = 0; var10 < 16; var10++) {
            var21[var10] = (var5[var9 + var10 * 4] & 255) << 24
               | (var5[var9 + var10 * 4 + 1] & 255) << 16
               | (var5[var9 + var10 * 4 + 2] & 255) << 8
               | var5[var9 + var10 * 4 + 3] & 255;
         }

         for (int var23 = 16; var23 < 64; var23++) {
            int var11 = IIl0(var21[var23 - 15], 7) ^ IIl0(var21[var23 - 15], 18) ^ var21[var23 - 15] >>> 3;
            int var12 = IIl0(var21[var23 - 2], 17) ^ IIl0(var21[var23 - 2], 19) ^ var21[var23 - 2] >>> 10;
            var21[var23] = var21[var23 - 16] + var11 + var21[var23 - 7] + var12;
         }

         int var24 = var3[0];
         int var26 = var3[1];
         int var27 = var3[2];
         int var13 = var3[3];
         int var14 = var3[4];
         int var15 = var3[5];
         int var16 = var3[6];
         int var17 = var3[7];

         for (int var18 = 0; var18 < 64; var18++) {
            int var19 = var17 + (IIl0(var14, 6) ^ IIl0(var14, 11) ^ IIl0(var14, 25)) + (var14 & var15 ^ ~var14 & var16) + I_0o[var18] + var21[var18];
            int var20 = (IIl0(var24, 2) ^ IIl0(var24, 13) ^ IIl0(var24, 22)) + (var24 & var26 ^ var24 & var27 ^ var26 & var27);
            var17 = var16;
            var16 = var15;
            var15 = var14;
            var14 = var13 + var19;
            var13 = var27;
            var27 = var26;
            var26 = var24;
            var24 = var19 + var20;
         }

         var3[0] += var24;
         var3[1] += var26;
         var3[2] += var27;
         var3[3] += var13;
         var3[4] += var14;
         var3[5] += var15;
         var3[6] += var16;
         var3[7] += var17;
      }

      byte[] var22 = new byte[32];

      for (int var25 = 0; var25 < 8; var25++) {
         var22[var25 * 4] = (byte)(var3[var25] >>> 24);
         var22[var25 * 4 + 1] = (byte)(var3[var25] >>> 16);
         var22[var25 * 4 + 2] = (byte)(var3[var25] >>> 8);
         var22[var25 * 4 + 3] = (byte)var3[var25];
      }

      return var22;
   }

   static byte[] II(byte[] var0, byte[] var1, int var2) {
      byte[] var3 = var0;
      if (var3.length > 64) {
         var3 = II(var3, 0, var3.length);
      }

      byte[] var4 = new byte[64 + var2];
      byte[] var5 = new byte[96];

      for (int var6 = 0; var6 < 64; var6++) {
         byte var7 = var6 < var3.length ? var3[var6] : 0;
         var4[var6] = (byte)(var7 ^ 54);
         var5[var6] = (byte)(var7 ^ 92);
      }

      System.arraycopy(var1, 0, var4, 64, var2);
      byte[] var8 = II(var4, 0, var4.length);
      System.arraycopy(var8, 0, var5, 64, 32);
      return II(var5, 0, var5.length);
   }

   private static boolean II(byte[] var0, int var1, byte[] var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < 32; var4++) {
         var3 |= var0[var1 + var4] ^ var2[var4];
      }

      return var3 == 0;
   }

   private static byte[] II(String var0, byte[] var1, int var2) throws IOException {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeInt(1313624882);
      var4.writeInt(var2);
      var4.writeLong(System.currentTimeMillis());
      var4.writeInt(var1.length);
      var4.write(var1);
      byte[] var5 = var3.toByteArray();
      byte[] var6 = II(III(var0), var5, var5.length);
      var4.write(var6);
      return var3.toByteArray();
   }

   private static Object[] II(String var0, byte[] var1) {
      try {
         if (var1 != null && var1.length >= 52) {
            DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(var1));
            if (var2.readInt() != 1313624882) {
               return null;
            }

            int var3 = var2.readInt();
            var2.readLong();
            int var4 = var2.readInt();
            if (var4 >= 0 && 20 + var4 + 32 == var1.length) {
               byte[] var5 = II(III(var0), var1, 20 + var4);
               if (!II(var1, 20 + var4, var5)) {
                  return null;
               }

               byte[] var6 = new byte[var4];
               System.arraycopy(var1, 20, var6, 0, var4);
               return new Object[]{var6, new Integer(var3)};
            } else {
               return null;
            }
         } else {
            return null;
         }
      } catch (Exception var7) {
         return null;
      }
   }

   private static byte[] II(String var0, int var1) {
      byte[] var2 = new byte[]{77, (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1};
      byte[] var3 = II(III(var0), var2, var2.length);
      byte[] var4 = new byte[36];
      System.arraycopy(var2, 1, var4, 0, 4);
      System.arraycopy(var3, 0, var4, 4, 32);
      return var4;
   }

   private static int II(String var0, byte[] var1) {
      if (var1 != null && var1.length == 36) {
         int var2 = (var1[0] & 255) << 24 | (var1[1] & 255) << 16 | (var1[2] & 255) << 8 | var1[3] & 255;
         byte[] var3 = II(var0, var2);

         for (int var4 = 0; var4 < 36; var4++) {
            if (var3[var4] != var1[var4]) {
               return -1;
            }
         }

         return var2;
      } else {
         return -1;
      }
   }

   private static byte[] II(RecordStore var0, int var1) {
      try {
         if (var1 > var0.getNumRecords()) {
            return null;
         }

         byte[] var2 = var0.getRecord(var1);
         return var2 != null && var2.length != 0 ? var2 : null;
      } catch (Exception var3) {
         return null;
      }
   }

   private static IOol II(byte[] var0) {
      try {
         return IOol.II(new DataInputStream(new ByteArrayInputStream(var0)));
      } catch (Exception var2) {
         return null;
      }
   }

   public static synchronized IOol II(String var0) {
      RecordStore var1 = null;
      lIOI = null;
      __IO = -1;

      try {
         var1 = RecordStore.openRecordStore(IIl0(var0), false);
         System.out
            .println(
               I10I("혹훭훉훋횻횠휼흕휻휉ힸퟙힾ힔\ud87a\ud813\ud824\ud810\ud8e4\ud88f\ud8e9", 54882)
                  + var0
                  + I10I("홅횡훔훊훾횖흴흔흺", 54882)
                  + IIl0(var0)
                  + I10I("홂횩", 54882)
                  + var1.getNumRecords()
                  + I10I("홂훣훁훑훾횚흴흒흳", 54882)
            );
         if (var1.getNumRecords() == 0) {
            return null;
         }

         int var2 = II(var0, II(var1, 4));
         byte[] var3 = II(var1, 1);
         Object[] var4 = II(var0, var3);
         if (var4 == null && var3 != null && II(var1, 2) == null && II(var1, 3) == null && II(var1, 4) == null) {
            IOol var32 = II(var3);
            if (var32 != null && var32._l_o > 34) {
               __IO = var32._l_o;
               return null;
            } else if (var32 != null) {
               __I_ = 0;
               I0I1 = 0L;
               return var32;
            } else {
               return null;
            }
         } else {
            if (var4 != null) {
               IOol var5 = II((byte[])var4[0]);
               if (var5 != null && var5._l_o > 34) {
                  __IO = var5._l_o;
                  return null;
               }

               if (var5 != null) {
                  __I_ = (Integer)var4[1];
                  if (var2 > __I_) {
                     lIOI = I10I(
                        "혲훩홁훋훾횕흵짼휴흙ퟺ줔ힸퟕ\ud878\ud983\ud827\ud851\ud8f3\ud9c6\ud8ee\ud88f쟇\ud90b\ud929\ud901\ud961\ud9d7\ud9e6\ud8f4\udaec\uda03\uda2e\uda8b\udaee\udabf\uda96\udaaf\uda93\udb77\udb56\udb3b\udb19\udbf4\udbdd\udbfc\udbda",
                        54882
                     );
                  }

                  return var5;
               }
            }

            for (int var31 = 2; var31 <= 3; var31++) {
               Object[] var6 = II(var0, II(var1, var31));
               if (var6 != null) {
                  IOol var7 = II((byte[])var6[0]);
                  if (var7 != null && var7._l_o > 34) {
                     __IO = var7._l_o;
                     return null;
                  }

                  if (var7 != null) {
                     __I_ = (Integer)var6[1];
                     lIOI = I10I(
                        "혦졮횀훓횷젺흩휛휴휑흺ퟙퟶ힃욹\ud847\ud872\ud813왛\ud88f\ud8ba\ud885\ud96d\ud952\ud96a\ud878읝\ud9ce\ud9ea\ud9c5\udb15\udac0\uda62\uda0a\udae8\uda6b\udad7\udafd\uda8c\udb73엟\udb3a\udb58\udbe3앝\udbf5\udb96슰\udc5c\udc71\udc03\udcee\udcc1\udced\udc80\udcbb\udd5f\udd67",
                        54882
                     );
                     System.out
                        .println(
                           I10I(
                                 "혹훭훉훋횻횠휼흚휴휍ퟱퟔힾ힐\ud875\ud847\ud868\ud851\ud8f2\ud8ce\ud8a0\ud8cd\ud97f\ud94a\ud93c\ud90c\ud9a8\ud9c4\ud9ae\ud98c\uda6a\uda4b\uda62\uda12\udae1\udaf6\uda9e\udabe\uda94\udb6e\udb1a\udb32\udb01\udbbb\udb96\udbb1\udb81\udc7d\udc55\udc71\udc12\udcee\udccd\udca6\udc99\udd7b\udd0a",
                                 54882
                              )
                              + var31
                        );
                     return var7;
                  }
               }
            }

            lIOI = I10I(
               "혦졮횀훓횷젺흩휛휴휑흺ퟙퟶ힃욹\ud847\ud872\ud813왛\ud88f\ud8a6옢\ud962\ud94c\ud96a\ud901\ud9e7윐\ud9a5\ud9c5\uda66쓨\uda62\uda12쑭\udafe\uda9e\udaab\uda1c\udb3b\udb51\udb31\udb8c\udbf9\udbd1\udbf5\udb97\udce0\udc12\udc33싓\udce1\udc8e\udcbe\udc8d\udd64\udd0a\udd25\udcd8\uddf2\udd86\uddad쌇\ude73\ude02\ude2d삧\ude51",
               54882
            );
            System.out
               .println(
                  I10I(
                     "혹훭훉훋횻횠휼흚휴휍ퟱퟔힾ힐\ud875\ud847\ud868\ud851\ud8fb\ud8c7\ud8a1\ud883\ud96b\ud90b\ud929\ud906\ud9a8\ud9c5\ud9a7\ud98b\uda24\uda50\uda23\uda17\udae5\udabf\udad6\udab2\uda8c\udb3b\udb56\udb3c",
                     54882
                  )
               );
            return null;
         }
      } catch (RecordStoreNotFoundException var28) {
         System.out
            .println(
               I10I("혹훭훉훋횻횠휼흘휲휌ퟹ힗ힵ힚\ud834\ud857\ud827\ud851\ud8fc\ud8c6\ud8ab\ud898\ud92c\ud945\ud922\ud908\ud9e6\ud987\ud9b0\ud984\uda70\uda03\uda65", 54882)
                  + var0
                  + I10I("홅횡횈훔횶횒휼", 54882)
                  + IIl0(var0)
                  + I10I("홂훪훈훐횰횚휼흏휵휗ힸퟃힷ힜\ud83d", 54882)
            );
         return null;
      } catch (Exception var29) {
         System.out
            .println(
               I10I("혹훭훉훋횻횠휼흷휕휰ힸퟙힷ힅\ud834\ud85d\ud83a\ud810\ud8fe\ud88f\ud8b8\ud88c\ud978\ud90b\ud96d", 54882)
                  + var0
                  + I10I("홅횡횈훔횶횒휼", 54882)
                  + IIl0(var0)
                  + I10I("홋횻횀", 54882)
                  + var29
            );
         return null;
      } finally {
         if (var1 != null) {
            try {
               var1.closeRecordStore();
            } catch (Exception var27) {
            }
         }
      }
   }

   public static synchronized void II(String var0, IOol var1) {
      RecordStore var2 = null;

      try {
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         var1.II(new DataOutputStream(var3));
         int var4 = __I_ + 1;
         byte[] var5 = II(var0, var3.toByteArray(), var4);
         var2 = RecordStore.openRecordStore(IIl0(var0), true);

         while (var2.getNumRecords() < 4) {
            var2.addRecord(new byte[0], 0, 0);
         }

         long var6 = System.currentTimeMillis();
         byte[] var8 = II(var2, 1);
         boolean var9 = var8 != null && (II(var0, var8) != null || __I_ == 0);
         if (var9 && (var6 - I0I1 >= 300000L || II(var2, 2) == null)) {
            byte[] var10 = II(var2, 2);
            if (var10 != null) {
               var2.setRecord(3, var10, 0, var10.length);
            }

            var2.setRecord(2, var8, 0, var8.length);
            I0I1 = var6;
         }

         var2.setRecord(1, var5, 0, var5.length);
         byte[] var21 = II(var0, var4);
         var2.setRecord(4, var21, 0, var21.length);
         __I_ = var4;
         System.out
            .println(
               I10I("혹훭훉훋횻횠휼흟휻흙ퟴퟂ힣ퟕ\ud87a\ud85b\ud833\ud81f\ud8b0\ud8d9\ud8af\ud899\ud92c\ud90c", 54882)
                  + var0
                  + I10I("홅횡훖훞횱훝흷흓휵흙", 54882)
                  + IIl0(var0)
                  + I10I("홂횩훌훞횰훝", 54882)
                  + var4
                  + I10I("홎횡", 54882)
                  + var5.length
                  + I10I("홂훣훙훋횻훔", 54882)
            );
      } catch (Exception var19) {
         System.out.println(I10I("혹훭훉훋횻횠휼흐휲휖ퟶퟐퟶ힙\ud861\ud846\ud872\ud815\ud8e5\ud8c0\ud8ad\ud8d7\ud92c", 54882) + var19);
      } finally {
         if (var2 != null) {
            try {
               var2.closeRecordStore();
            } catch (Exception var18) {
            }
         }
      }
   }
}
