package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.rms.RecordStore;

public class Ill_ implements Ill1 {
   private static Ill_ III;
   private Hashtable II = new Hashtable();
   private Hashtable III = new Hashtable();
   private Hashtable IIII = new Hashtable();
   private String II11;
   private boolean IlO0 = false;

   private Ill_(String var1) {
      this.II11 = var1;
      this.I___();
   }

   public static Ill_ II() {
      if (III == null) {
         III = new Ill_(II_I("욶익읝윇윳쟷쟁잵잱졳졂젵", 50939));
      }

      return III;
   }

   private synchronized void I___() {
      if (!this.IlO0) {
         try {
            RecordStore var1 = RecordStore.openRecordStore(this.II11, true);
            if (var1.getNumRecords() > 0) {
               byte[] var2 = var1.getRecord(1);
               DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var2));
               int var4 = var3.readInt();

               for (int var5 = 0; var5 < var4; var5++) {
                  this.II.put(var3.readUTF(), new Integer(var3.readInt()));
               }

               var4 = var3.readInt();

               for (int var9 = 0; var9 < var4; var9++) {
                  this.III.put(var3.readUTF(), new Long(var3.readLong()));
               }

               var4 = var3.readInt();

               for (int var10 = 0; var10 < var4; var10++) {
                  this.IIII.put(var3.readUTF(), var3.readUTF());
               }

               var3.close();
            }

            var1.closeRecordStore();
            this.IlO0 = true;
         } catch (Exception var6) {
            this.IlO0 = true;
         }
      }
   }

   private synchronized void I__O() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DataOutputStream var2 = new DataOutputStream(var1);
         var2.writeInt(this.II.size());
         Enumeration var3 = this.II.keys();

         while (var3.hasMoreElements()) {
            String var4 = (String)var3.nextElement();
            var2.writeUTF(var4);
            var2.writeInt((Integer)this.II.get(var4));
         }

         var2.writeInt(this.III.size());
         var3 = this.III.keys();

         while (var3.hasMoreElements()) {
            String var10 = (String)var3.nextElement();
            var2.writeUTF(var10);
            var2.writeLong((Long)this.III.get(var10));
         }

         var2.writeInt(this.IIII.size());
         var3 = this.IIII.keys();

         while (var3.hasMoreElements()) {
            String var11 = (String)var3.nextElement();
            var2.writeUTF(var11);
            var2.writeUTF((String)this.IIII.get(var11));
         }

         var2.flush();
         byte[] var5 = var1.toByteArray();
         var2.close();
         var1.close();
         RecordStore var6 = RecordStore.openRecordStore(this.II11, true);
         if (var6.getNumRecords() == 0) {
            var6.addRecord(var5, 0, var5.length);
         } else {
            var6.setRecord(1, var5, 0, var5.length);
         }

         var6.closeRecordStore();
      } catch (Exception var7) {
      }
   }

   @Override
   public synchronized void III(String var1, int var2) {
      this.II.put(var1, new Integer(var2));
      this.I__O();
   }

   @Override
   public synchronized int II(String var1, int var2) {
      Integer var3 = (Integer)this.II.get(var1);
      return var3 == null ? var2 : var3;
   }

   @Override
   public synchronized void II(String var1, long var2) {
      this.III.put(var1, new Long(var2));
      this.I__O();
   }

   @Override
   public synchronized long II(String var1, long var2) {
      Long var4 = (Long)this.III.get(var1);
      return var4 == null ? var2 : var4;
   }

   @Override
   public synchronized void IIII(String var1, String var2) {
      this.IIII.put(var1, var2 == null ? "" : var2);
      this.I__O();
   }

   @Override
   public synchronized String IIII(String var1, String var2) {
      String var3 = (String)this.IIII.get(var1);
      return var3 == null ? var2 : var3;
   }

   @Override
   public void III(String var1, boolean var2) {
      this.III(var1, var2 ? 1 : 0);
   }

   @Override
   public boolean IIII(String var1, boolean var2) {
      return this.II(var1, var2 ? 1 : 0) != 0;
   }

   @Override
   public synchronized void I_1O() {
      this.II.clear();
      this.III.clear();
      this.IIII.clear();
      this.I__O();
   }
}
