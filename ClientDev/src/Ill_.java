package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.rms.RecordStore;

public class Ill_
implements Ill1 {
    private static Ill_ var_Ill__III;
    private Hashtable II = new Hashtable();
    private Hashtable var_java_util_Hashtable_III = new Hashtable();
    private Hashtable IIII = new Hashtable();
    private String II11;
    private boolean IlO0 = false;

    private Ill_(String string) {
        this.II11 = string;
        this.I___();
    }

    public static Ill_ II() {
        if (var_Ill__III == null) {
            var_Ill__III = new Ill_(Ill_.II_I("\uc6b6\uc775\uc75d\uc707\uc733\uc7f7\uc7c1\uc7b5\uc7b1\uc873\uc842\uc835", 50939));
        }
        return var_Ill__III;
    }

    private synchronized void I___() {
        if (!this.IlO0) {
            try {
                RecordStore recordStore = RecordStore.openRecordStore((String)this.II11, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    int n;
                    byte[] byArray = recordStore.getRecord(1);
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
                    int n2 = dataInputStream.readInt();
                    for (n = 0; n < n2; ++n) {
                        this.II.put(dataInputStream.readUTF(), new Integer(dataInputStream.readInt()));
                    }
                    n2 = dataInputStream.readInt();
                    for (n = 0; n < n2; ++n) {
                        this.var_java_util_Hashtable_III.put(dataInputStream.readUTF(), new Long(dataInputStream.readLong()));
                    }
                    n2 = dataInputStream.readInt();
                    for (n = 0; n < n2; ++n) {
                        this.IIII.put(dataInputStream.readUTF(), dataInputStream.readUTF());
                    }
                    dataInputStream.close();
                }
                recordStore.closeRecordStore();
                this.IlO0 = true;
            }
            catch (Exception exception) {
                this.IlO0 = true;
            }
        }
    }

    private synchronized void I__O() {
        try {
            String string;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(this.II.size());
            Enumeration enumeration = this.II.keys();
            while (enumeration.hasMoreElements()) {
                string = (String)enumeration.nextElement();
                dataOutputStream.writeUTF(string);
                dataOutputStream.writeInt((Integer)this.II.get(string));
            }
            dataOutputStream.writeInt(this.var_java_util_Hashtable_III.size());
            enumeration = this.var_java_util_Hashtable_III.keys();
            while (enumeration.hasMoreElements()) {
                string = (String)enumeration.nextElement();
                dataOutputStream.writeUTF(string);
                dataOutputStream.writeLong((Long)this.var_java_util_Hashtable_III.get(string));
            }
            dataOutputStream.writeInt(this.IIII.size());
            enumeration = this.IIII.keys();
            while (enumeration.hasMoreElements()) {
                string = (String)enumeration.nextElement();
                dataOutputStream.writeUTF(string);
                dataOutputStream.writeUTF((String)this.IIII.get(string));
            }
            dataOutputStream.flush();
            byte[] byArray = byteArrayOutputStream.toByteArray();
            dataOutputStream.close();
            byteArrayOutputStream.close();
            RecordStore recordStore = RecordStore.openRecordStore((String)this.II11, (boolean)true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(byArray, 0, byArray.length);
            } else {
                recordStore.setRecord(1, byArray, 0, byArray.length);
            }
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public synchronized void III(String string, int n) {
        this.II.put(string, new Integer(n));
        this.I__O();
    }

    @Override
    public synchronized int II(String string, int n) {
        Integer n2 = (Integer)this.II.get(string);
        return n2 == null ? n : n2;
    }

    @Override
    public synchronized void void_II(String string, long l) {
        this.var_java_util_Hashtable_III.put(string, new Long(l));
        this.I__O();
    }

    @Override
    public synchronized long long_II(String string, long l) {
        Long l2 = (Long)this.var_java_util_Hashtable_III.get(string);
        return l2 == null ? l : l2;
    }

    @Override
    public synchronized void void_IIII(String string, String string2) {
        this.IIII.put(string, string2 == null ? "" : string2);
        this.I__O();
    }

    @Override
    public synchronized String java_lang_String_IIII(String string, String string2) {
        String string3 = (String)this.IIII.get(string);
        return string3 == null ? string2 : string3;
    }

    @Override
    public void III(String string, boolean bl) {
        this.III(string, bl ? 1 : 0);
    }

    @Override
    public boolean IIII(String string, boolean bl) {
        return this.II(string, bl ? 1 : 0) != 0;
    }

    @Override
    public synchronized void I_1O() {
        this.II.clear();
        this.var_java_util_Hashtable_III.clear();
        this.IIII.clear();
        this.I__O();
    }

    private static /* synthetic */ String II_I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

