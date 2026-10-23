package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class I_O1 {
    public I__[] II;

    public I_O1(int n) {
        if (n == 0) {
            this.II = new I__[3];
        }
        if (n == 1) {
            this.II = new I__[17];
        }
        if (n == 2) {
            this.II = new I__[14];
        }
        if (n == 3) {
            this.II = new I__[2];
        }
    }

    public I_O1() {
    }

    public static void II(String string, byte[] byArray) {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)(I_O1.Il01("\ue39e\ue46d", 58344) + string), (boolean)true);
            if (recordStore.getNumRecords() > 0) {
                recordStore.setRecord(1, byArray, 0, byArray.length);
            } else {
                recordStore.addRecord(byArray, 0, byArray.length);
            }
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {
            I_Ol.II__(I_O1.Il01("\ue38a\ue46e\ue406\ue429\ue40b\ue4ea\ue482\ue4b2\ue481\ue489\ue57b\ue51d\ue571\ue556\ue5b7\ue594\ue5f5\ue5da\ue63b\ue618\ue679\ue65e\ue6bf\ue69c\ue6fd\ue6c2\ue723\ue700\ue761\ue746\ue7a7\ue784\ue7e5\ue7ca\ue82b\ue808\ue869", 58344) + string);
        }
    }

    public static void II_O(String string) {
        for (int i = 0; i < RecordStore.listRecordStores().length; ++i) {
            if (!RecordStore.listRecordStores().equals(string)) continue;
            try {
                RecordStore.deleteRecordStore((String)string);
                continue;
            }
            catch (RecordStoreNotFoundException recordStoreNotFoundException) {
                recordStoreNotFoundException.printStackTrace();
                continue;
            }
            catch (RecordStoreException recordStoreException) {
                recordStoreException.printStackTrace();
            }
        }
    }

    private static boolean III0(String string) {
        return string.equals(I_O1.Il01("\ue39e\ue46d\ue447\ue426\ue407", 58344)) || string.equals(I_O1.Il01("\ue39e\ue46d\ue456\ue424\ue417\ue4f0", 58344)) || string.equals(I_O1.Il01("\ue39e\ue46d\ue445\ue42d\ue401\ue4e0\ue4c9", 58344)) || string.startsWith(I_O1.Il01("\ue39e\ue46d\ue453\ue436\ue401\ue4f1\ue4e3\ue4ae", 58344));
    }

    public static void I_10() {
        I_Ol.II__(I_O1.Il01("\ue3ab\ue44b\ue463\ue404\ue436\ue4a3\ue4e3\ue48d\ue4ac", 58344));
        try {
            String[] stringArray = RecordStore.listRecordStores();
            if (stringArray != null) {
                for (int i = 0; i < stringArray.length; ++i) {
                    if (stringArray[i] == null || stringArray[i].startsWith(I_O1.Il01("\ue386\ue475\ue449\ue429\ue40d\ue4f7\ue4c7", 58344)) || I_O1.III0(stringArray[i])) continue;
                    I_Ol.II__(I_O1.Il01("\ue386\ue466\ue44b\ue420\ue444\ue4be\ue482", 58344) + stringArray[i]);
                    try {
                        RecordStore.deleteRecordStore((String)stringArray[i]);
                        continue;
                    }
                    catch (Throwable throwable) {
                        I_Ol.II__(I_O1.Il01("\ue38a\ue468\ue406\ue434\ue411\ue4e2\ue482", 58344) + stringArray[i]);
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static byte[] II(String string) {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)(I_O1.Il01("\ue39e\ue46d", 58344) + string), (boolean)false);
            byte[] byArray = recordStore.getRecord(1);
            recordStore.closeRecordStore();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void IIIl(String string, int n) {
        try {
            I_O1.II(string, new byte[]{(byte)n});
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void III1(String string, String string2) {
        try {
            I_O1.II(string, string2.getBytes(I_O1.Il01("\ue3bd\ue453\ue460\ue468\ue45c", 58344)));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static String IIl(String string) {
        byte[] byArray = I_O1.II(string);
        if (byArray == null) {
            return null;
        }
        try {
            return new String(byArray, I_O1.Il01("\ue3bd\ue453\ue460\ue468\ue45c", 58344));
        }
        catch (Exception exception) {
            return new String(byArray);
        }
    }

    public static int III(String string) {
        byte[] byArray = I_O1.II(string);
        return byArray == null ? -1 : byArray[0];
    }

    private static /* synthetic */ String Il01(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

