package main;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class I_O1 {
   public I__[] II;

   public I_O1(int var1) {
      if (var1 == 0) {
         this.II = new I__[3];
      }

      if (var1 == 1) {
         this.II = new I__[17];
      }

      if (var1 == 2) {
         this.II = new I__[14];
      }

      if (var1 == 3) {
         this.II = new I__[2];
      }
   }

   public I_O1() {
   }

   public static void II(String var0, byte[] var1) {
      try {
         RecordStore var2;
         if ((var2 = RecordStore.openRecordStore(Il01("\ue39e\ue46d", 58344) + var0, true)).getNumRecords() > 0) {
            var2.setRecord(1, var1, 0, var1.length);
         } else {
            var2.addRecord(var1, 0, var1.length);
         }

         var2.closeRecordStore();
      } catch (Exception var3) {
         I_Ol.II__(
            Il01(
                  "\ue38a\ue46e\ue406\ue429\ue40b\ue4ea\ue482\ue4b2\ue481\ue489\ue57b\ue51d\ue571\ue556\ue5b7\ue594\ue5f5\ue5da\ue63b\ue618\ue679\ue65e\ue6bf\ue69c\ue6fd\ue6c2\ue723\ue700\ue761\ue746\ue7a7\ue784\ue7e5\ue7ca\ue82b\ue808\ue869",
                  58344
               )
               + var0
         );
      }
   }

   public static void II_O(String var0) {
      for (int var1 = 0; var1 < RecordStore.listRecordStores().length; var1++) {
         if (RecordStore.listRecordStores().equals(var0)) {
            try {
               RecordStore.deleteRecordStore(var0);
            } catch (RecordStoreNotFoundException var3) {
               var3.printStackTrace();
            } catch (RecordStoreException var4) {
               var4.printStackTrace();
            }
         }
      }
   }

   private static boolean III0(String var0) {
      return var0.equals(Il01("\ue39e\ue46d\ue447\ue426\ue407", 58344))
         || var0.equals(Il01("\ue39e\ue46d\ue456\ue424\ue417\ue4f0", 58344))
         || var0.equals(Il01("\ue39e\ue46d\ue445\ue42d\ue401\ue4e0\ue4c9", 58344))
         || var0.startsWith(Il01("\ue39e\ue46d\ue453\ue436\ue401\ue4f1\ue4e3\ue4ae", 58344));
   }

   public static void I_10() {
      I_Ol.II__(Il01("\ue3ab\ue44b\ue463\ue404\ue436\ue4a3\ue4e3\ue48d\ue4ac", 58344));

      try {
         String[] var0;
         if ((var0 = RecordStore.listRecordStores()) != null) {
            for (int var1 = 0; var1 < var0.length; var1++) {
               if (var0[var1] != null && !var0[var1].startsWith(Il01("\ue386\ue475\ue449\ue429\ue40d\ue4f7\ue4c7", 58344)) && !III0(var0[var1])) {
                  I_Ol.II__(Il01("\ue386\ue466\ue44b\ue420\ue444\ue4be\ue482", 58344) + var0[var1]);

                  try {
                     RecordStore.deleteRecordStore(var0[var1]);
                  } catch (Throwable var3) {
                     I_Ol.II__(Il01("\ue38a\ue468\ue406\ue434\ue411\ue4e2\ue482", 58344) + var0[var1]);
                  }
               }
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static byte[] II(String var0) {
      try {
         RecordStore var1;
         byte[] var2 = (var1 = RecordStore.openRecordStore(Il01("\ue39e\ue46d", 58344) + var0, false)).getRecord(1);
         var1.closeRecordStore();
         return var2;
      } catch (Exception var3) {
         return null;
      }
   }

   public static void IIIl(String var0, int var1) {
      try {
         II(var0, new byte[]{(byte)var1});
      } catch (Exception var3) {
      }
   }

   public static void III1(String var0, String var1) {
      try {
         II(var0, var1.getBytes(Il01("\ue3bd\ue453\ue460\ue468\ue45c", 58344)));
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static String IIl(String var0) {
      byte[] var1;
      if ((var1 = II(var0)) == null) {
         return null;
      }

      try {
         return new String(var1, Il01("\ue3bd\ue453\ue460\ue468\ue45c", 58344));
      } catch (Exception var3) {
         return new String(var1);
      }
   }

   public static int III(String var0) {
      byte[] var1;
      return (var1 = II(var0)) == null ? -1 : var1[0];
   }
}
