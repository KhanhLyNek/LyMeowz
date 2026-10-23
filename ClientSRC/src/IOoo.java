/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreNotFoundException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IOoo {
    private static final int __I1 = 1313624882;
    private static final long I0Il = 300000L;
    private static long I0I1;
    private static int __I_;
    public static String lIOI;
    public static int __IO;
    private static final int[] I_0o;

    private IOoo() {
    }

    private static String IIl0(String string) {
        int n = 0;
        for (int i = 0; i < string.length(); ++i) {
            n = n * 31 + string.charAt(i);
        }
        return IOoo.I10I("\ud60c\ud6f3\ud6cf\ud6d3\ud6b7\ud689\ud779", 54882) + (n & Integer.MAX_VALUE);
    }

    private static byte[] III(String string) {
        int[] nArray = new int[]{7230031, 5007732, 101, 6247233, 5653855, 11057};
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < nArray.length; ++i) {
            stringBuffer.append((char)(nArray[i] >> 16 & 0xFF));
            stringBuffer.append((char)(nArray[i] >> 8 & 0xFF));
            stringBuffer.append((char)(nArray[i] & 0xFF));
        }
        stringBuffer.append((char)(IOoo.IIl0(string).length() * 7 + 11)).append(IOoo.IIl0(string));
        String string2 = stringBuffer.toString();
        byte[] byArray = new byte[string2.length()];
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(string2.charAt(i) ^ 90 + i);
        }
        return byArray;
    }

    private static int IIl0(int n, int n2) {
        return n >>> n2 | n << 32 - n2;
    }

    static byte[] II(byte[] byArray, int n, int n2) {
        int n3;
        int[] nArray = new int[]{1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
        int n4 = (n2 + 9 + 63) / 64 * 64;
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, n, byArray2, 0, n2);
        byArray2[n2] = -128;
        long l = (long)n2 * 8L;
        for (int i = 0; i < 8; ++i) {
            byArray2[n4 - 1 - i] = (byte)(l >>> 8 * i);
        }
        int[] nArray2 = new int[64];
        for (int i = 0; i < n4; i += 64) {
            int n5;
            int n6;
            for (n3 = 0; n3 < 16; ++n3) {
                nArray2[n3] = (byArray2[i + n3 * 4] & 0xFF) << 24 | (byArray2[i + n3 * 4 + 1] & 0xFF) << 16 | (byArray2[i + n3 * 4 + 2] & 0xFF) << 8 | byArray2[i + n3 * 4 + 3] & 0xFF;
            }
            for (n3 = 16; n3 < 64; ++n3) {
                n6 = IOoo.IIl0(nArray2[n3 - 15], 7) ^ IOoo.IIl0(nArray2[n3 - 15], 18) ^ nArray2[n3 - 15] >>> 3;
                n5 = IOoo.IIl0(nArray2[n3 - 2], 17) ^ IOoo.IIl0(nArray2[n3 - 2], 19) ^ nArray2[n3 - 2] >>> 10;
                nArray2[n3] = nArray2[n3 - 16] + n6 + nArray2[n3 - 7] + n5;
            }
            n3 = nArray[0];
            n6 = nArray[1];
            n5 = nArray[2];
            int n7 = nArray[3];
            int n8 = nArray[4];
            int n9 = nArray[5];
            int n10 = nArray[6];
            int n11 = nArray[7];
            for (int j = 0; j < 64; ++j) {
                int n12 = n11 + (IOoo.IIl0(n8, 6) ^ IOoo.IIl0(n8, 11) ^ IOoo.IIl0(n8, 25)) + (n8 & n9 ^ ~n8 & n10) + I_0o[j] + nArray2[j];
                int n13 = (IOoo.IIl0(n3, 2) ^ IOoo.IIl0(n3, 13) ^ IOoo.IIl0(n3, 22)) + (n3 & n6 ^ n3 & n5 ^ n6 & n5);
                n11 = n10;
                n10 = n9;
                n9 = n8;
                n8 = n7 + n12;
                n7 = n5;
                n5 = n6;
                n6 = n3;
                n3 = n12 + n13;
            }
            nArray[0] = nArray[0] + n3;
            nArray[1] = nArray[1] + n6;
            nArray[2] = nArray[2] + n5;
            nArray[3] = nArray[3] + n7;
            nArray[4] = nArray[4] + n8;
            nArray[5] = nArray[5] + n9;
            nArray[6] = nArray[6] + n10;
            nArray[7] = nArray[7] + n11;
        }
        byte[] byArray3 = new byte[32];
        for (n3 = 0; n3 < 8; ++n3) {
            byArray3[n3 * 4] = (byte)(nArray[n3] >>> 24);
            byArray3[n3 * 4 + 1] = (byte)(nArray[n3] >>> 16);
            byArray3[n3 * 4 + 2] = (byte)(nArray[n3] >>> 8);
            byArray3[n3 * 4 + 3] = (byte)nArray[n3];
        }
        return byArray3;
    }

    static byte[] II(byte[] byArray, byte[] byArray2, int n) {
        byte[] byArray3 = byArray;
        if (byArray3.length > 64) {
            byArray3 = IOoo.II(byArray3, 0, byArray3.length);
        }
        byte[] byArray4 = new byte[64 + n];
        byte[] byArray5 = new byte[96];
        for (int i = 0; i < 64; ++i) {
            byte by = i < byArray3.length ? byArray3[i] : (byte)0;
            byArray4[i] = (byte)(by ^ 0x36);
            byArray5[i] = (byte)(by ^ 0x5C);
        }
        System.arraycopy(byArray2, 0, byArray4, 64, n);
        byte[] byArray6 = IOoo.II(byArray4, 0, byArray4.length);
        System.arraycopy(byArray6, 0, byArray5, 64, 32);
        return IOoo.II(byArray5, 0, byArray5.length);
    }

    private static boolean II(byte[] byArray, int n, byte[] byArray2) {
        int n2 = 0;
        for (int i = 0; i < 32; ++i) {
            n2 |= byArray[n + i] ^ byArray2[i];
        }
        return n2 == 0;
    }

    private static byte[] II(String string, byte[] byArray, int n) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(1313624882);
        dataOutputStream.writeInt(n);
        dataOutputStream.writeLong(System.currentTimeMillis());
        dataOutputStream.writeInt(byArray.length);
        dataOutputStream.write(byArray);
        byte[] byArray2 = byteArrayOutputStream.toByteArray();
        byte[] byArray3 = IOoo.II(IOoo.III(string), byArray2, byArray2.length);
        dataOutputStream.write(byArray3);
        return byteArrayOutputStream.toByteArray();
    }

    private static Object[] II(String string, byte[] byArray) {
        try {
            if (byArray == null || byArray.length < 52) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            if (dataInputStream.readInt() != 1313624882) {
                return null;
            }
            int n = dataInputStream.readInt();
            dataInputStream.readLong();
            int n2 = dataInputStream.readInt();
            if (n2 < 0 || 20 + n2 + 32 != byArray.length) {
                return null;
            }
            byte[] byArray2 = IOoo.II(IOoo.III(string), byArray, 20 + n2);
            if (!IOoo.II(byArray, 20 + n2, byArray2)) {
                return null;
            }
            byte[] byArray3 = new byte[n2];
            System.arraycopy(byArray, 20, byArray3, 0, n2);
            return new Object[]{byArray3, new Integer(n)};
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static byte[] II(String string, int n) {
        byte[] byArray = new byte[]{77, (byte)(n >>> 24), (byte)(n >>> 16), (byte)(n >>> 8), (byte)n};
        byte[] byArray2 = IOoo.II(IOoo.III(string), byArray, byArray.length);
        byte[] byArray3 = new byte[36];
        System.arraycopy(byArray, 1, byArray3, 0, 4);
        System.arraycopy(byArray2, 0, byArray3, 4, 32);
        return byArray3;
    }

    private static int II(String string, byte[] byArray) {
        if (byArray == null || byArray.length != 36) {
            return -1;
        }
        int n = (byArray[0] & 0xFF) << 24 | (byArray[1] & 0xFF) << 16 | (byArray[2] & 0xFF) << 8 | byArray[3] & 0xFF;
        byte[] byArray2 = IOoo.II(string, n);
        for (int i = 0; i < 36; ++i) {
            if (byArray2[i] == byArray[i]) continue;
            return -1;
        }
        return n;
    }

    private static byte[] II(RecordStore recordStore, int n) {
        try {
            if (n > recordStore.getNumRecords()) {
                return null;
            }
            byte[] byArray = recordStore.getRecord(n);
            return byArray == null || byArray.length == 0 ? null : byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static IOol II(byte[] byArray) {
        try {
            return IOol.II(new DataInputStream(new ByteArrayInputStream(byArray)));
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static synchronized IOol II(String string) {
        byte[] byArray;
        RecordStore recordStore = null;
        lIOI = null;
        __IO = -1;
        try {
            recordStore = RecordStore.openRecordStore((String)IOoo.IIl0(string), (boolean)false);
            System.out.println(IOoo.I10I("\ud639\ud6ed\ud6c9\ud6cb\ud6bb\ud6a0\ud73c\ud755\ud73b\ud709\ud7b8\ud7d9\ud7be\ud794\ud87a\ud813\ud824\ud810\ud8e4\ud88f\ud8e9", 54882) + string + IOoo.I10I("\ud645\ud6a1\ud6d4\ud6ca\ud6fe\ud696\ud774\ud754\ud77a", 54882) + IOoo.IIl0(string) + IOoo.I10I("\ud642\ud6a9", 54882) + recordStore.getNumRecords() + IOoo.I10I("\ud642\ud6e3\ud6c1\ud6d1\ud6fe\ud69a\ud774\ud752\ud773", 54882));
            if (recordStore.getNumRecords() == 0) {
                IOol iOol = null;
                return iOol;
            }
            int n = IOoo.II(string, IOoo.II(recordStore, 4));
            byArray = IOoo.II(recordStore, 1);
            Object[] objectArray = IOoo.II(string, byArray);
            if (objectArray == null && byArray != null && IOoo.II(recordStore, 2) == null && IOoo.II(recordStore, 3) == null && IOoo.II(recordStore, 4) == null) {
                IOol iOol = IOoo.II(byArray);
                if (iOol != null && iOol._l_o > 34) {
                    __IO = iOol._l_o;
                    IOol iOol2 = null;
                    return iOol2;
                }
                if (iOol != null) {
                    __I_ = 0;
                    I0I1 = 0L;
                    IOol iOol3 = iOol;
                    return iOol3;
                }
                IOol iOol4 = null;
                return iOol4;
            }
            if (objectArray != null) {
                IOol iOol = IOoo.II((byte[])objectArray[0]);
                if (iOol != null && iOol._l_o > 34) {
                    __IO = iOol._l_o;
                    IOol iOol5 = null;
                    return iOol5;
                }
                if (iOol != null) {
                    __I_ = (Integer)objectArray[1];
                    if (n > __I_) {
                        lIOI = IOoo.I10I("\ud632\ud6e9\ud641\ud6cb\ud6fe\ud695\ud775\uc9fc\ud734\ud759\ud7fa\uc914\ud7b8\ud7d5\ud878\ud983\ud827\ud851\ud8f3\ud9c6\ud8ee\ud88f\uc7c7\ud90b\ud929\ud901\ud961\ud9d7\ud9e6\ud8f4\udaec\uda03\uda2e\uda8b\udaee\udabf\uda96\udaaf\uda93\udb77\udb56\udb3b\udb19\udbf4\udbdd\udbfc\udbda", 54882);
                    }
                    IOol iOol6 = iOol;
                    return iOol6;
                }
            }
            for (int i = 2; i <= 3; ++i) {
                Object[] objectArray2 = IOoo.II(string, IOoo.II(recordStore, i));
                if (objectArray2 == null) continue;
                IOol iOol = IOoo.II((byte[])objectArray2[0]);
                if (iOol != null && iOol._l_o > 34) {
                    __IO = iOol._l_o;
                    IOol iOol7 = null;
                    return iOol7;
                }
                if (iOol == null) continue;
                __I_ = (Integer)objectArray2[1];
                lIOI = IOoo.I10I("\ud626\uc86e\ud680\ud6d3\ud6b7\uc83a\ud769\ud71b\ud734\ud711\ud77a\ud7d9\ud7f6\ud783\uc6b9\ud847\ud872\ud813\uc65b\ud88f\ud8ba\ud885\ud96d\ud952\ud96a\ud878\uc75d\ud9ce\ud9ea\ud9c5\udb15\udac0\uda62\uda0a\udae8\uda6b\udad7\udafd\uda8c\udb73\uc5df\udb3a\udb58\udbe3\uc55d\udbf5\udb96\uc2b0\udc5c\udc71\udc03\udcee\udcc1\udced\udc80\udcbb\udd5f\udd67", 54882);
                System.out.println(IOoo.I10I("\ud639\ud6ed\ud6c9\ud6cb\ud6bb\ud6a0\ud73c\ud75a\ud734\ud70d\ud7f1\ud7d4\ud7be\ud790\ud875\ud847\ud868\ud851\ud8f2\ud8ce\ud8a0\ud8cd\ud97f\ud94a\ud93c\ud90c\ud9a8\ud9c4\ud9ae\ud98c\uda6a\uda4b\uda62\uda12\udae1\udaf6\uda9e\udabe\uda94\udb6e\udb1a\udb32\udb01\udbbb\udb96\udbb1\udb81\udc7d\udc55\udc71\udc12\udcee\udccd\udca6\udc99\udd7b\udd0a", 54882) + i);
                IOol iOol8 = iOol;
                return iOol8;
            }
            lIOI = IOoo.I10I("\ud626\uc86e\ud680\ud6d3\ud6b7\uc83a\ud769\ud71b\ud734\ud711\ud77a\ud7d9\ud7f6\ud783\uc6b9\ud847\ud872\ud813\uc65b\ud88f\ud8a6\uc622\ud962\ud94c\ud96a\ud901\ud9e7\uc710\ud9a5\ud9c5\uda66\uc4e8\uda62\uda12\uc46d\udafe\uda9e\udaab\uda1c\udb3b\udb51\udb31\udb8c\udbf9\udbd1\udbf5\udb97\udce0\udc12\udc33\uc2d3\udce1\udc8e\udcbe\udc8d\udd64\udd0a\udd25\udcd8\uddf2\udd86\uddad\uc307\ude73\ude02\ude2d\uc0a7\ude51", 54882);
            System.out.println(IOoo.I10I("\ud639\ud6ed\ud6c9\ud6cb\ud6bb\ud6a0\ud73c\ud75a\ud734\ud70d\ud7f1\ud7d4\ud7be\ud790\ud875\ud847\ud868\ud851\ud8fb\ud8c7\ud8a1\ud883\ud96b\ud90b\ud929\ud906\ud9a8\ud9c5\ud9a7\ud98b\uda24\uda50\uda23\uda17\udae5\udabf\udad6\udab2\uda8c\udb3b\udb56\udb3c", 54882));
            IOol iOol = null;
            return iOol;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            System.out.println(IOoo.I10I("\ud639\ud6ed\ud6c9\ud6cb\ud6bb\ud6a0\ud73c\ud758\ud732\ud70c\ud7f9\ud797\ud7b5\ud79a\ud834\ud857\ud827\ud851\ud8fc\ud8c6\ud8ab\ud898\ud92c\ud945\ud922\ud908\ud9e6\ud987\ud9b0\ud984\uda70\uda03\uda65", 54882) + string + IOoo.I10I("\ud645\ud6a1\ud688\ud6d4\ud6b6\ud692\ud73c", 54882) + IOoo.IIl0(string) + IOoo.I10I("\ud642\ud6ea\ud6c8\ud6d0\ud6b0\ud69a\ud73c\ud74f\ud735\ud717\ud7b8\ud7c3\ud7b7\ud79c\ud83d", 54882));
            byArray = null;
            return byArray;
        }
        catch (Exception exception) {
            System.out.println(IOoo.I10I("\ud639\ud6ed\ud6c9\ud6cb\ud6bb\ud6a0\ud73c\ud777\ud715\ud730\ud7b8\ud7d9\ud7b7\ud785\ud834\ud85d\ud83a\ud810\ud8fe\ud88f\ud8b8\ud88c\ud978\ud90b\ud96d", 54882) + string + IOoo.I10I("\ud645\ud6a1\ud688\ud6d4\ud6b6\ud692\ud73c", 54882) + IOoo.IIl0(string) + IOoo.I10I("\ud64b\ud6bb\ud680", 54882) + exception);
            byArray = null;
            return byArray;
        }
        finally {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {}
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static synchronized void II(String string, IOol iOol) {
        RecordStore recordStore = null;
        try {
            byte[] byArray;
            boolean bl;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            iOol.II(new DataOutputStream(byteArrayOutputStream));
            int n = __I_ + 1;
            byte[] byArray2 = IOoo.II(string, byteArrayOutputStream.toByteArray(), n);
            recordStore = RecordStore.openRecordStore((String)IOoo.IIl0(string), (boolean)true);
            while (recordStore.getNumRecords() < 4) {
                recordStore.addRecord(new byte[0], 0, 0);
            }
            long l = System.currentTimeMillis();
            byte[] byArray3 = IOoo.II(recordStore, 1);
            boolean bl2 = bl = byArray3 != null && (IOoo.II(string, byArray3) != null || __I_ == 0);
            if (bl && (l - I0I1 >= 300000L || IOoo.II(recordStore, 2) == null)) {
                byArray = IOoo.II(recordStore, 2);
                if (byArray != null) {
                    recordStore.setRecord(3, byArray, 0, byArray.length);
                }
                recordStore.setRecord(2, byArray3, 0, byArray3.length);
                I0I1 = l;
            }
            recordStore.setRecord(1, byArray2, 0, byArray2.length);
            byArray = IOoo.II(string, n);
            recordStore.setRecord(4, byArray, 0, byArray.length);
            __I_ = n;
            System.out.println(IOoo.I10I("\ud639\ud6ed\ud6c9\ud6cb\ud6bb\ud6a0\ud73c\ud75f\ud73b\ud759\ud7f4\ud7c2\ud7a3\ud7d5\ud87a\ud85b\ud833\ud81f\ud8b0\ud8d9\ud8af\ud899\ud92c\ud90c", 54882) + string + IOoo.I10I("\ud645\ud6a1\ud6d6\ud6de\ud6b1\ud6dd\ud777\ud753\ud735\ud759", 54882) + IOoo.IIl0(string) + IOoo.I10I("\ud642\ud6a9\ud6cc\ud6de\ud6b0\ud6dd", 54882) + n + IOoo.I10I("\ud64e\ud6a1", 54882) + byArray2.length + IOoo.I10I("\ud642\ud6e3\ud6d9\ud6cb\ud6bb\ud6d4", 54882));
        }
        catch (Exception exception) {
            System.out.println(IOoo.I10I("\ud639\ud6ed\ud6c9\ud6cb\ud6bb\ud6a0\ud73c\ud750\ud732\ud716\ud7f6\ud7d0\ud7f6\ud799\ud861\ud846\ud872\ud815\ud8e5\ud8c0\ud8ad\ud8d7\ud92c", 54882) + exception);
        }
        finally {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {}
            }
        }
    }

    static {
        __IO = -1;
        I_0o = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    }

    private static /* synthetic */ String I10I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

