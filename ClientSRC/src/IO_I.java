/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import nrolite.Res;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class IO_I
implements Runnable {
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
    private static final Hashtable IIIl;
    private static final Hashtable III1;
    private static final Hashtable III_;
    private final IOoI II;
    private final IO0 IIII;
    private final IOo_ IIII;
    private final Random IIIl = new Random();
    final Vector III_ = new Vector();
    private boolean I000;
    private long I1l;
    private static final String[] IlIO;
    private static final String[] IlI0;
    private static final String[] IlIo;
    private boolean I00o;
    private static final Object[][] IIIl;
    private static final String[] Ill;
    private static final int[][] II1l;
    private static final String[] IllI;
    private static final String[] Illl;
    private static final int[][] II11;
    private static final String[] Ill1;

    static synchronized void I___() {
        if (IlO0) {
            return;
        }
        IlO0 = true;
        try {
            int n;
            int n2;
            byte[] byArray = Res.read(IO_I.I1lO("\u1214\u12fa\u12c7\u12a0\u12dc\u1373\u1359\u1321", 4726));
            if (byArray == null) {
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            int n3 = dataInputStream.readUnsignedShort();
            for (n2 = 0; n2 < n3; ++n2) {
                int n4;
                II iI = new II();
                iI.lIlI = dataInputStream.readUTF();
                iI.II1o = dataInputStream.readUTF();
                iI.lOlI = dataInputStream.readByte();
                iI.I1o1 = new int[6];
                for (n4 = 0; n4 < 6; ++n4) {
                    iI.I1o1[n4] = dataInputStream.readShort();
                }
                iI.lllI = dataInputStream.readInt();
                iI.I1o_ = new int[dataInputStream.readByte()];
                for (n4 = 0; n4 < iI.I1o_.length; ++n4) {
                    iI.I1o_[n4] = dataInputStream.readInt();
                }
                iI.IIO = new int[dataInputStream.readByte()];
                for (n4 = 0; n4 < iI.IIO.length; ++n4) {
                    iI.IIO[n4] = dataInputStream.readShort();
                }
                iI.II1_ = new int[dataInputStream.readByte()][];
                for (n4 = 0; n4 < iI.II1_.length; ++n4) {
                    iI.II1_[n4] = new int[]{dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readInt()};
                }
                iI.Ill_ = IO_I.II(dataInputStream);
                iI.IllO = IO_I.II(dataInputStream);
                iI.Ill0 = IO_I.II(dataInputStream);
                iI.lOll = dataInputStream.readInt();
                iI.lOl1 = dataInputStream.readByte();
                iI.I1oO = new int[dataInputStream.readByte()];
                for (n4 = 0; n4 < iI.I1oO.length; ++n4) {
                    iI.I1oO[n4] = dataInputStream.readInt();
                }
                IIIl.put(iI.lIlI, iI);
            }
            n2 = dataInputStream.readUnsignedShort();
            for (int i = 0; i < n2; ++i) {
                IIII iIII = new IIII();
                iIII.I1l = dataInputStream.readInt();
                iIII.lIlI = dataInputStream.readUTF();
                iIII.Iol1 = dataInputStream.readByte() != 0;
                iIII.Illo = new String[dataInputStream.readByte()];
                for (n = 0; n < iIII.Illo.length; ++n) {
                    iIII.Illo[n] = dataInputStream.readUTF();
                }
                III1.put(iIII.lIlI, iIII);
                III_.put(new Integer(iIII.I1l), iIII);
            }
            IO_I.III0(IO_I.I1lO("\u123d\u12d4\u12e6\u129a\u12bc", 4726), -357);
            IO_I.III0(IO_I.I1lO("\u122f\u12d4\u12fe\u129a\u12a0\u135e", 4726), -358);
            IO_I.III0(IO_I.I1lO("\u1221\u12dd\u12fd\u1280", 4726), -359);
            String[] stringArray = new String[]{IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344\u136f\u137f", 4726), IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344\u136f\u137e", 4726), IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344\u136f\u137d", 4726), IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344\u136f\u137c", 4726), IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344\u136f\u137b", 4726), IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13b8", 4726), IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13bd", 4726), IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13bc", 4726), IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13bf", 4726), IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13be", 4726), IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13b9", 4726), IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13fe", 4726), IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13fb", 4726), IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13fa", 4726), IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13f9", 4726), IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13f8", 4726), IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13ff", 4726), IO_I.I1lO("\u1232\u12da\u12fd\u128c\u12a6\u1343\u1365\u1300\u1320\u13ca\u13f3\u13fe", 4726)};
            for (int i = 0; i < stringArray.length; ++i) {
                IO_I.III0(stringArray[i], -322 - i);
            }
            int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 79, 80, 81, 82, 83, 84, 92, 93, 94, 96, 97, 98, 99, 100, 102, 103, 104, 105, 106, 107, 108, 109, 110};
            IO_I.II(IO_I.I1lO("\u1237\u12db\u12eb\u1287\u12a0\u135e\u137d\u1310\u1322", 4726), -365, IO_I.I1lO("\u1374\u12fb\u1294\u1287\u1280\u0dc8\u135d\u136f", 4726), new int[]{201, 202, 203, -1, -1, -1}, 1, 100, nArray, new int[][]{{6, 3, 50000}});
            IO_I.II(IO_I.I1lO("\u1239\u12ca\u12f0\u129c\u12c3", 4726), -78, IO_I.I1lO("\u0ca8\u12b5\u12f0\u1372\u12d2\u1334\u1354", 4726), new int[]{400, 401, 402, -1, -1, -1}, 1000, 500000, nArray, new int[][]{{8, 1, -1}});
            for (n = 0; n < IlI0.length; ++n) {
                IO_I.III0(IlI0[n], -2000 - n);
            }
            int[] nArray2 = new int[]{5, 13, 20, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38};
            int[][] nArrayArray = new int[][]{{8, 7, 1000}, {0, 7, 1000}, {2, 7, 1000}, {4, 7, 1000}, {1, 7, 1000}, {3, 7, 1000}, {5, 7, 1000}};
            IO_I.II(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726), -1822, IO_I.I1lO("\u1234\u12e7\u12db\u12bf\u128b\u1331\u1315\u132b", 4726), new int[]{291, 292, 293, -1, -1, -1}, 100, 500, nArray2, nArrayArray);
            IO_I.II(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726), -82282, IO_I.I1lO("\u1225\u12e0\u12c4\u12b6\u1280\u1331\u1372\u133d\u1301\u13e1\u13d5\u13eb\u13cf\u146d", 4726), new int[]{294, 295, 296, -1, -1, -1}, 100, 1000, nArray2, nArrayArray);
            II iI = (II)IIIl.get(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726));
            II iI2 = (II)IIIl.get(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726));
            iI.lOlI = 2;
            iI2.lOlI = 2;
            iI.lOll = 600;
            iI2.lOll = 1;
            iI2.IllO = iI.IllO = new String[]{IO_I.I1lO("\u120a\u12b8\u1285\u12af\u12ba\u1370\u1358\u132e\u134f\u13ad\u13d8\u13aa\u13ca\u147a\u0a95\u1467\u1401\u14ec\u0a1b\u14b7\u14c2\u1569\u0b9f\u154b\u157e\u151e\u157d\u15d8\u15fa\u1597\u167f\u1787\u17f7\u161c", 4726), IO_I.I1lO("\u120a\u12b8\u1285\u12af\u12a1\u0df8\u1353\u136f\u1303\u0d2c\u13c2\u13a3\u13ca\u146a\u0acf\u1426\u1446\u14f1\u14c5\u14e3\u148e\u15e1\u1500\u154b\u152b\u1504\u0b5b\u15cf\u15fa\u14e8\u08c9\u165e", 4726), IO_I.I1lO("\u120a\u12b8\u1285\u12af\u12a4\u13f1\u135f\u136f\u1306\u0d32\u13d8\u13eb\u12fb\u14eb\u1451\u1466\u1447\u14a4", 4726)};
            iI2.Ill0 = iI.Ill0 = new String[]{IO_I.I1lO("\u120a\u12b8\u1285\u12af\u12b1\u13f0\u1353\u136f\u1300\u13ea\u121c\u126a\u1383\u1429\u144f\u142e\u0aa9\u14ec\u1484\u14af\u0a4d\u156c\u150e\u151f\u150a\u151c\u15bc\u15c8\u0b67\u15d9\u1669\u1642\u1637\u160c\u16b4\u16df\u0873\u1698\u173e", 4726)};
        }
        catch (IOException iOException) {
            System.out.println(IO_I.I1lO("\u122d\u12f9\u12dd\u12a7\u1297\u134c\u1310\u132d\u1301\u13fe\u13df\u13e5\u1388\u1460\u1446\u1467\u140a\u14ea\u14cd\u14f9\u14c2", 4726) + iOException);
        }
    }

    private static void II(String string, int n, String string2, int[] nArray, int n2, int n3, int[] nArray2, int[][] nArray3) {
        II iI = new II();
        iI.lIlI = string;
        iI.II1o = string2;
        iI.lOlI = 0;
        iI.lllI = n2;
        iI.lOll = 600;
        iI.lOl1 = 0;
        iI.I1o1 = nArray;
        iI.I1o_ = new int[]{n3};
        iI.IIO = nArray2;
        iI.I1oO = new int[0];
        iI.II1_ = nArray3;
        iI.Ill_ = new String[0];
        iI.IllO = new String[0];
        iI.Ill0 = new String[0];
        IIIl.put(string, iI);
        IO_I.III0(string, n);
    }

    private static void III0(String string, int n) {
        if (III1.get(string) != null || IIIl.get(string) == null) {
            return;
        }
        IIII iIII = new IIII();
        iIII.I1l = n;
        iIII.lIlI = string;
        iIII.Iol1 = true;
        iIII.Illo = new String[]{string};
        III1.put(string, iIII);
        III_.put(new Integer(n), iIII);
    }

    private static String[] II(DataInputStream dataInputStream) throws IOException {
        String[] stringArray = new String[dataInputStream.readByte()];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = dataInputStream.readUTF();
        }
        return stringArray;
    }

    IO_I(IOoI iOoI, IO0 iO0, IOo_ iOo_) {
        this.II = iOoI;
        this.IIII = iO0;
        this.IIII = iOo_;
    }

    synchronized void I_1o() {
        int n;
        int n2;
        if (this.I000) {
            return;
        }
        this.I000 = true;
        this.I1l = System.currentTimeMillis() + 4000L;
        IO_I.I___();
        for (n2 = 0; n2 < IlIo.length; ++n2) {
            for (n = 0; n < 5; ++n) {
                this.II(IlIo[n2], null, 0);
            }
        }
        for (n2 = 0; n2 < IlIO.length; ++n2) {
            this.II(IlIO[n2], null, 0);
        }
        this.II(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726), null, 0);
        for (n2 = 0; n2 < IlI0.length; ++n2) {
            for (n = 0; n < 3; ++n) {
                III iII = this.II(IlI0[n2], null, 0);
                if (iII == null) continue;
                iII.lO_l = n;
            }
        }
        Thread thread = new Thread(this);
        thread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (!this.IIII.lIIl) {
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            try {
                IOoI iOoI = this.II;
                synchronized (iOoI) {
                    this.III1(System.currentTimeMillis());
                }
            }
            catch (Exception exception) {
                System.out.println(IO_I.I1lO("\u122d\u12f9\u12dd\u12a7\u1297\u134c\u1310\u132d\u1301\u13fe\u13df\u13eb\u139e\u1460\u144b\u142c\u145c\u14a5", 4726) + exception);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized void IIO_(String string) {
        int n;
        IO_I.I___();
        for (n = 0; n < this.III_.size(); ++n) {
            III iII = (III)this.III_.elementAt(n);
            if (!iII.IoII || iII.I0oO) continue;
            this.II11(iII);
            iII.I0oO = true;
        }
        this.I00o = true;
        try {
            for (n = 0; n < IIIl.length; ++n) {
                if (!IIIl[n][0].equals(string)) continue;
                int n2 = (Integer)IIIl[n][2];
                for (int i = 0; i < n2; ++i) {
                    this.II((String)IIIl[n][1], null, 0);
                }
            }
        }
        finally {
            this.I00o = false;
        }
    }

    private III II(String string, III iII, int n) {
        int n2;
        IIII iIII = (IIII)III1.get(string);
        if (iIII == null) {
            return null;
        }
        III iII2 = new III();
        iII2.II = iIII;
        iII2.I1l = iIII.I1l;
        iII2.II = new II[iIII.Illo.length];
        for (n2 = 0; n2 < iII2.II.length; ++n2) {
            iII2.II[n2] = (II)IIIl.get(iIII.Illo[n2]);
            if (iII2.II[n2] != null) continue;
            return null;
        }
        iII2.II = iII;
        iII2.IoII = this.I00o;
        iII2.lO10 = n;
        iII2.status = 0;
        iII2.I0ol = IO_I.IIIo(string);
        this.III_.addElement(iII2);
        iII2.II = new III[iII2.II.length][];
        for (n2 = 0; n2 < iII2.II.length; ++n2) {
            int[] nArray = iII2.II[n2].I1oO;
            if (nArray.length == 0) continue;
            iII2.II[n2] = new III[nArray.length];
            for (int i = 0; i < nArray.length; ++i) {
                IIII iIII2 = (IIII)III_.get(new Integer(nArray[i]));
                iII2.II[n2][i] = iIII2 == null ? null : this.II(iIII2.lIlI, iII2, i);
            }
        }
        return iII2;
    }

    private static boolean IIIo(String string) {
        return string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e0", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e1", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e2", 4726)) || string.equals(IO_I.I1lO("\u1222\u12dc\u12f1\u1286\u12ad\u1355\u137f\u1306\u1331\u13d9\u13fe\u139e\u13a5\u1447\u146f", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e0\u12ad\u135f\u137d", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e1\u12ad\u135f\u137d", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e2\u12ad\u135f\u137d", 4726)) || string.equals(IO_I.I1lO("\u1222\u12dc\u12f1\u1286\u12ad\u1355\u137f\u1306\u1331\u13d9\u13fe\u139e\u13a5\u1447\u146f\u1418\u1428\u14c8", 4726)) || string.equals(IO_I.I1lO("\u1226\u12dc\u12f7", 4726));
    }

    private void III1(long l) {
        int n;
        for (n = 0; n < this.III_.size(); ++n) {
            III iII = (III)this.III_.elementAt(n);
            try {
                this.II(iII, l);
                continue;
            }
            catch (Exception exception) {
                System.out.println(IO_I.I1lO("\u122d\u12f9\u12dd\u12a7\u1297\u134c\u1310\u132d\u1301\u13fe\u13df\u13eb", 4726) + (iII.II != null ? iII.II.lIlI : IO_I.I1lO("\u1249", 4726)) + IO_I.I1lO("\u124c\u12b5", 4726) + exception);
                if (iII.status != 8 && iII.status != 7 && iII.status != 6) continue;
                try {
                    if (iII.I0oI) {
                        this.II11(iII);
                    }
                }
                catch (Exception exception2) {
                    // empty catch block
                }
                iII.lOlo = -1;
                iII.lOl_ = -1;
                iII.I1lI = l;
                iII.status = 0;
            }
        }
        for (n = this.III_.size() - 1; n >= 0; --n) {
            if (!((III)this.III_.elementAt((int)n)).I0oO) continue;
            this.III_.removeElementAt(n);
        }
    }

    private boolean II(III iII) {
        IOol iOol = this.IIII.II;
        return iOol != null && iII.lOlo == iOol.lOlo && iII.lO1 == iOol.lO1 && !IOo.IIo(iOol.lOlo);
    }

    void II(III iII, int n, int n2) {
        long l = System.currentTimeMillis();
        if (iII.I11o != 0L && iII.lO_1 >= 0 && iII.lO_1 != n2) {
            this.II(iII);
        }
        iII.I110 = l + (long)n;
        if (n2 >= 0) {
            iII.lO_1 = n2;
            iII.I11o = iII.I110;
            if (iII.I0oI && this.II(iII)) {
                this.IIII.II(new IO0o(-124).II(1).II(0).II(n2).IIII(iII.I1l).IIII(this.IIII.II.I1l));
            }
        }
    }

    private void II(III iII) {
        if (iII.I11o != 0L && iII.lO_1 >= 0 && iII.I0oI && this.II(iII)) {
            this.IIII.II(new IO0o(-124).II(0).II(0).II(iII.lO_1).IIII(iII.I1l).IIII(this.IIII.II.I1l));
        }
        iII.I11o = 0L;
        iII.lO_1 = -1;
    }

    private void II(III iII, long l) {
        if (iII.status == 5 && iII.lOl0 == 5 && this.II(iII) && this.IIII.II.llIl > 0 && (iII.II.lIlI.equals(IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371", 4726)) || iII.II.lIlI.equals(IO_I.I1lO("\u123b\u12d4\u12f6\u1286\u12ad\u1320\u1302\u1307", 4726)))) {
            boolean bl = iII.II.lIlI.equals(IO_I.I1lO("\u123b\u12d4\u12f6\u1286\u12ad\u1320\u1302\u1307", 4726));
            if (iII.I11l == 0L) {
                iII.I11l = l;
            }
            if (l - iII.I11l >= (long)(bl ? 30000 : 10000)) {
                iII.I11l = l;
                if (this.IIIl.nextInt(10) == 0) {
                    this.II(iII, bl ? IO_I.I1lO("\u12ac\u12f8\u1294\u12b1\u1293\u1331\u135c\u132e\u134e\u13f5\u1340\u13eb\u1388\u14f0\u1449", 4726) : IO_I.I1lO("\u1206\u12fd\u0c0d\u12a7", 4726));
                    this.IIII.II.II0o(22000, iII.I1l);
                } else if (bl && this.IIIl.nextInt(5) == 0) {
                    this.II(iII, IO_I.I1lO("\u12ac\u12f8\u1294\u12b1\u1293\u1331\u135c\u132e\u134e\u13f5\u1340\u13eb\u1388\u14f0\u1449", 4726));
                    this.IIII.II.I11_(30000);
                }
            }
        }
        if (iII.IoII && iII.status == 5 && iII.II.lIlI.equals(IO_I.I1lO("\u1239\u12db\u12f3\u128c\u12b5\u1358\u1371\u1310\u1320\u13c2\u13e9\u1387", 4726)) && this.II(iII) && l - iII.I1_ >= 60000L) {
            if (iII.I1_ != 0L) {
                int[] nArray = new int[]{3, 5, 7};
                for (int i = 0; i < 3; ++i) {
                    if (this.IIIl.nextInt(nArray[i]) != 0) continue;
                    this.II.II(648, 1, iII.I1 + (i == 0 ? 0 : (i == 1 ? 1 : -1) * this.IIIl.nextInt(50)), iII.I1I, null);
                }
            }
            iII.I1_ = l;
        }
        if (iII.I11o != 0L && l >= iII.I11o) {
            this.II(iII);
        }
        switch (iII.status) {
            case 3: 
            case 4: 
            case 5: {
                if (this.II(iII)) {
                    iII.I1ll = l;
                }
                if (l - iII.I1ll <= (long)(iII.II.lIlI.equals(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726)) ? 300000 : 900000) || iII.IoI0) break;
                this.IIl(iII);
                return;
            }
        }
        switch (iII.status) {
            case 0: {
                this.III(iII, l);
                break;
            }
            case 1: {
                this.III(iII);
                iII.status = 2;
                break;
            }
            case 2: {
                this.IIII(iII, l);
                break;
            }
            case 3: {
                if (!this.II(iII, l)) break;
                this.III1(iII);
                iII.I1lO = l;
                iII.lO11 = 5000;
                if (iII.status == 4) break;
                iII.status = 5;
                break;
            }
            case 4: {
                if (iII.I0o1) {
                    this.IIIo(iII, l);
                    break;
                }
                if (!iII.Iol) break;
                this.IIl1(iII);
                break;
            }
            case 5: {
                if (iII.I0o1) {
                    this.III0(iII, l);
                    break;
                }
                if (iII.I0oo || iII.IoI1 || l < iII.I1_l && (l / 600L & 1L) == 1L) break;
                this.IIIl(iII, l);
                if (iII.lOl0 == 0) {
                    this.II(iII, 5);
                }
                this.III_(iII, l);
                break;
            }
            case 6: {
                iII.status = 7;
                break;
            }
            case 7: {
                if (!this.III(iII, l)) break;
                this.III_(iII);
                iII.status = 8;
                break;
            }
            case 8: {
                this.III1(iII, l);
                break;
            }
        }
    }

    private void III(III iII, long l) {
        int n = iII.lOl_ + 1;
        if (n >= iII.II.length) {
            n = 0;
        }
        if (iII.II[n].lOl1 == 0 && l - iII.I1lI >= (long)iII.II[0].lOll * 1000L) {
            iII.status = 1;
        }
    }

    private void III(III iII) {
        ++iII.lOl_;
        if (iII.lOl_ >= iII.II.length) {
            iII.lOl_ = 0;
        }
        iII.II = iII.II[iII.lOl_];
        iII.II1o = iII.II.II1o;
        int n = iII.II1o.indexOf(IO_I.I1lO("\u1253\u12f1", 4726));
        if (n >= 0) {
            iII.II1o = iII.II1o.substring(0, n) + this.IIIl.nextInt(100) + iII.II1o.substring(n + 2);
        }
        iII.lllI = iII.II.lllI;
        int n2 = iII.lOlO = iII.II.I1o_.length == 0 ? 1000 : iII.II.I1o_[this.IIIl.nextInt(iII.II.I1o_.length)];
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726))) {
            iII.lOlO = 500 + this.IIIl.nextInt(99501);
        } else if (iII.II.lIlI.equals(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726))) {
            iII.lOlO = 1500000 + this.IIIl.nextInt(14570778);
        }
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726)) || iII.II.lIlI.equals(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726))) {
            iII.lllI = Math.max(1, iII.lOlO / 100);
        }
        iII.llIl = iII.lOlO;
        this.IIII(iII);
        iII.lOl0 = 0;
        iII.I0o0 = false;
        iII.Io = false;
        iII.I0oo = false;
        iII.lO1_ = 0;
        iII.lO1O = 0;
        iII.lO1I = 0;
        iII.lO1l = 0;
        iII.I1l1 = 0L;
        iII.I1l_ = 0L;
    }

    private void IIII(III iII) {
        int n;
        int n2 = iII.II.II1_.length;
        Vector<IOO.IIIO> vector = new Vector<IOO.IIIO>();
        Vector<Integer> vector2 = new Vector<Integer>();
        for (n = 0; n < n2; ++n) {
            int n3 = iII.II.II1_[n][0];
            int n4 = iII.II.II1_[n][1];
            IOO.IIIO iIIO = null;
            for (int i = n4; i >= 1 && iIIO == null; --i) {
                iIIO = IOO.II(n3, i);
            }
            if (iIIO == null) {
                iIIO = new IOO.IIIO();
                iIIO.I1l = n3;
                iIIO.lO0I = n3;
                iIIO.l1__ = n4;
                iIIO.lo = 100 + n4 * 5;
                iIIO.loIl = 1000;
            }
            vector.addElement(iIIO);
            vector2.addElement(new Integer(iII.II.II1_[n][2] >= 0 ? iII.II.II1_[n][2] : iIIO.loIl));
        }
        iII.II = new IOO.IIIO[vector.size()];
        iII.III_ = new long[vector.size()];
        iII.I1o0 = new int[vector.size()];
        for (n = 0; n < iII.II.length; ++n) {
            iII.II[n] = (IOO.IIIO)vector.elementAt(n);
            iII.I1o0[n] = (Integer)vector2.elementAt(n);
        }
    }

    private boolean II(int n, int n2, III iII) {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII2 = (III)this.III_.elementAt(i);
            if (iII2 == iII || iII2.II != null || iII2.lOlo != n || iII2.lO1 != n2 || iII2.status < 3 || iII2.status > 5) continue;
            return true;
        }
        return false;
    }

    private void IIII(III iII, long l) {
        if (iII.II != null && iII.II.lOlo >= 0 && iII.lOl_ == 0) {
            iII.lOlo = iII.II.lOlo;
            iII.lO1 = iII.II.lO1;
            iII.I0o = false;
        } else if (iII.lOl_ <= 0 || iII.lOlo < 0) {
            if (iII.lO1o >= 0) {
                iII.lOlo = iII.lO1o;
                iII.lO1 = iII.lO_ < 0 ? 0 : iII.lO_;
                iII.lO1o = -1;
                iII.I0o = false;
            } else {
                int n;
                int[] nArray = iII.II.IIO;
                if (nArray.length == 0) {
                    iII.status = 0;
                    iII.I1lI = l;
                    return;
                }
                int n2 = nArray[this.IIIl.nextInt(nArray.length)];
                I0Io.II iI = I0Io.II(n2);
                if (iI == null) {
                    iII.status = 0;
                    iII.I1lI = l;
                    return;
                }
                int n3 = iI.__1O <= 0 ? 1 : iI.__1O;
                if (n3 > 2) {
                    n = 2 + this.IIIl.nextInt(n3 - 2);
                    int n4 = 0;
                    while (this.II(n2, n, iII) && n4++ < n3) {
                        n = n + 1 >= n3 ? 2 : n + 1;
                    }
                    if (this.II(n2, n, iII)) {
                        iII.status = 0;
                        iII.I1lI = l;
                        return;
                    }
                } else {
                    for (n = 0; n < n3 && this.II(n2, n, iII); ++n) {
                    }
                    if (n >= n3) {
                        n = 0;
                    }
                }
                if (iII.lO_l >= 0 && iII.lO_l < n3) {
                    n = iII.lO_l;
                }
                iII.lOlo = n2;
                iII.lO1 = n;
                iII.I0o = false;
            }
        }
        if (iII.I0o1) {
            iII.I1 = iII.II.lIlI.equals(IO_I.I1lO("\u122f\u12d4\u12fe\u129a\u12a0\u135e", 4726)) ? 320 : 420;
            iII.I1I = 408;
            iII.I0o = true;
            if (iII.II.lIlI.equals(IO_I.I1lO("\u1221\u12dd\u12fd\u1280", 4726))) {
                iII.I1 = 341;
                iII.I1I = 320;
                int n = Math.max(1, iII.lO_I);
                iII.lOlO = (int)Math.min(2000000000L, (long)iII.lOlO * (long)n);
                iII.lllI = (int)Math.min(2000000000L, (long)iII.lllI * (long)n);
                iII.II1o = IO_I.I1lO("\u1221\u12fd\u12dd\u12a0\u12d2\u134a\u137c\u1319\u1354", 4726) + n + IO_I.I1lO("\u122b", 4726);
                iII.I11 = l;
            }
        }
        iII.IoI = iII.lOlo >= 114 && iII.lOlo <= 120;
        iII.I1ll = l;
        iII.llIl = iII.lOlO;
        this.IIIl(iII);
        iII.status = 3;
        if (iII.lOl_ == 0) {
            this.III0(iII);
        }
        if (this.II(iII)) {
            this.II(iII, true);
        }
    }

    private void IIIl(III iII) {
        if (iII.I0o1) {
            return;
        }
        if (System.currentTimeMillis() < this.I1l) {
            return;
        }
        if (iII.II.Iol1 || iII.II != null && iII.lOl_ > 0) {
            return;
        }
        if (iII.lOl_ > 0 && iII.II.Illo.length > 1 && iII.II.lIlI.startsWith(IO_I.I1lO("\u1225\u12da\u12eb", 4726))) {
            return;
        }
        I0Io.II iI = I0Io.II(iII.lOlo);
        if (iI != null) {
            this.II.II00(IO_I.I1lO("\u1234\u12da\u12e7\u1280\u12d2", 4726) + iII.II1o + IO_I.I1lO("\u1256\u12e3\u0c5f\u12b2\u12d2\u1369\u1345\u0dea\u131a\u13ad\u13c4\u13a2\u0d2d\u1467\u1408\u1433\u0ac7\u14ec\u1484", 4726) + iI.II1o);
        }
    }

    private boolean II(III iII, long l) {
        String string;
        if (!this.II(iII) || !iII.I0oI) {
            return true;
        }
        if (l - iII.I1l1 < (long)iII.lO1I) {
            return false;
        }
        String[] stringArray = iII.II.Ill_;
        if (iII.lO1_ >= (iII.I0o1 ? 1 : stringArray.length) || stringArray.length == 0) {
            return true;
        }
        String string2 = iII.I0o1 ? stringArray[Math.min(iII.I0o_ ? 1 : 0, stringArray.length - 1)] : (string = stringArray[iII.lO1_]);
        if (!this.II(iII, string)) {
            return false;
        }
        iII.I1l1 = l;
        iII.lO1I = Math.min(2000, string.substring(string.lastIndexOf(124) + 1).length() * 100);
        ++iII.lO1_;
        return false;
    }

    private boolean III(III iII, long l) {
        if (!this.II(iII) || !iII.I0oI) {
            return true;
        }
        if (l - iII.I1l_ < (long)iII.lO1l) {
            return false;
        }
        String[] stringArray = iII.II.Ill0;
        if (iII.lO1O >= stringArray.length) {
            return true;
        }
        String string = stringArray[iII.lO1O];
        if (!this.II(iII, string)) {
            return false;
        }
        iII.I1l_ = l;
        iII.lO1l = Math.min(2000, string.substring(string.lastIndexOf(124) + 1).length() * 100);
        ++iII.lO1O;
        return false;
    }

    private void IIIl(III iII, long l) {
        if (iII.lOl0 == 0 || iII.II.IllO.length == 0 || !iII.I0oI || !this.II(iII)) {
            return;
        }
        if (l - iII.I1lO < (long)iII.lO11) {
            return;
        }
        this.II(iII, iII.II.IllO[this.IIIl.nextInt(iII.II.IllO.length)]);
        iII.I1lO = l;
        iII.lO11 = 3000 + this.IIIl.nextInt(17000);
    }

    private boolean II(III iII, String string) {
        int n = string.indexOf(124);
        int n2 = string.lastIndexOf(124);
        int n3 = -1;
        try {
            n3 = Integer.parseInt(string.substring(n + 1, n2));
        }
        catch (Exception exception) {
            // empty catch block
        }
        String string2 = string.substring(n2 + 1);
        if (n3 == -1) {
            this.II(iII, string2);
        } else if (n3 == -2) {
            IOol iOol = this.IIII.II;
            if (iOol == null || iOol.llIl <= 0 || IO_I.II(iII, iOol.I1, iOol.I1I) > 600) {
                return false;
            }
            this.IIII.II(new IO0o(44).IIII(iOol.I1l).II(string2));
        } else if (n3 == -3) {
            if (iII.II != null && !iII.II.Illo()) {
                this.II(iII.II, string2);
            }
        } else if (n3 >= 0) {
            III[] iIIArray = null;
            if (iII.II != null && iII.lOl_ >= 0 && iII.II[iII.lOl_] != null) {
                iIIArray = iII.II[iII.lOl_];
            } else if (iII.II != null && iII.II.lOl_ >= 0 && iII.II.II[iII.II.lOl_] != null) {
                iIIArray = iII.II.II[iII.II.lOl_];
            }
            if (iIIArray != null && n3 < iIIArray.length && iIIArray[n3] != null && !iIIArray[n3].Illo()) {
                this.II(iIIArray[n3], string2);
            }
        }
        return true;
    }

    void II(III iII, String string) {
        if (iII.I0oI && this.II(iII)) {
            this.IIII.II(new IO0o(44).IIII(iII.I1l).II(string));
        }
    }

    private void III1(III iII) {
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13be", 4726)) && iII.II != null) {
            III iII2 = this.II(iII.II, IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b8", 4726));
            if (iII2 != null && !iII2.Illo()) {
                iII2.I0oo = false;
                this.II(iII2, 5);
            }
            iII.II.I0oo = false;
            if (!iII.II.Illo()) {
                this.II(iII.II, 5);
            }
        }
        if (iII.I0ol || iII.Iol) {
            iII.status = 4;
        }
    }

    private void III_(III iII) {
        String string = iII.II.lIlI;
        III iII2 = iII.II;
        if (iII2 == null || iII2.lOl_ < 0) {
            return;
        }
        III[] iIIArray = iII2.II[iII2.lOl_];
        if (string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e7", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e7\u12ad\u135f\u137d", 4726))) {
            this.II(iIIArray, IO_I.I1lO("\u1225\u12da\u12eb\u12e0", 4726), IO_I.I1lO("\u1225\u12da\u12eb\u12e0\u12ad\u135f\u137d", 4726));
        } else if (string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e0", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e0\u12ad\u135f\u137d", 4726))) {
            this.II(iIIArray, IO_I.I1lO("\u1225\u12da\u12eb\u12e1", 4726), IO_I.I1lO("\u1225\u12da\u12eb\u12e1\u12ad\u135f\u137d", 4726));
            this.II(iIIArray, IO_I.I1lO("\u1225\u12da\u12eb\u12e2", 4726), IO_I.I1lO("\u1225\u12da\u12eb\u12e2\u12ad\u135f\u137d", 4726));
        } else if (string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e1", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e2", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e1\u12ad\u135f\u137d", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e2\u12ad\u135f\u137d", 4726))) {
            for (int i = 0; i < iIIArray.length; ++i) {
                String string2;
                III iII3 = iIIArray[i];
                if (iII3 == null || iII3 == iII || !(string2 = iII3.II.lIlI).equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e2", 4726)) && !string2.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e1", 4726)) && !string2.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e2\u12ad\u135f\u137d", 4726)) && !string2.equals(IO_I.I1lO("\u1225\u12da\u12eb\u12e1\u12ad\u135f\u137d", 4726)) || iII3.Illo() || iII3.status > 5 || iII3.status < 3) continue;
                return;
            }
            if (iII2.status == 4) {
                iII2.status = 5;
            }
        } else if (string.equals(IO_I.I1lO("\u1226\u12da\u12f7", 4726))) {
            this.II(iIIArray, IO_I.I1lO("\u1226\u12dc\u12f7", 4726), IO_I.I1lO("\u1226\u12dc\u12f7", 4726));
        } else if (string.equals(IO_I.I1lO("\u1226\u12dc\u12f7", 4726))) {
            if (iII2.status == 4) {
                iII2.status = 5;
            }
        } else if (string.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b4", 4726))) {
            this.II(iII2, 5);
        }
    }

    private III II(III iII, String string) {
        if (iII == null || iII.II == null || iII.lOl_ < 0 || iII.II[iII.lOl_] == null) {
            return null;
        }
        III[] iIIArray = iII.II[iII.lOl_];
        for (int i = 0; i < iIIArray.length; ++i) {
            if (iIIArray[i] == null || !iIIArray[i].II.lIlI.equals(string)) continue;
            return iIIArray[i];
        }
        return null;
    }

    private void IIIO(III iII) {
        iII.I0o0 = true;
        III iII2 = this.II(iII, IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b8", 4726));
        III iII3 = this.II(iII, IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13be", 4726));
        iII.llIl = iII.lOlO;
        iII.I0oo = true;
        this.II(iII, 0);
        this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
        if (iII2 != null && !iII2.Illo()) {
            iII2.I0o0 = true;
            iII2.llIl = iII2.lOlO;
            iII2.I0oo = true;
            this.II(iII2, 0);
            this.IIII.II(new IO0o(-30).II(9).IIII(iII2.I1l).IIII(iII2.llIl).IIII(iII2.lOlO));
        }
        if (iII3 != null && iII3.status == 0) {
            iII3.lO1o = iII.lOlo;
            iII3.lO_ = iII.lO1;
            iII3.lOl_ = -1;
            iII3.status = 1;
        }
    }

    private void II(III[] iIIArray, String string, String string2) {
        for (int i = 0; i < iIIArray.length; ++i) {
            III iII = iIIArray[i];
            if (iII == null || iII.Illo() || !iII.II.lIlI.equals(string) && !iII.II.lIlI.equals(string2) || iII.status != 4) continue;
            iII.status = 5;
        }
    }

    private void III0(III iII) {
        if (iII.II == null || iII.lOl_ < 0 || iII.II[iII.lOl_] == null) {
            return;
        }
        III[] iIIArray = iII.II[iII.lOl_];
        for (int i = 0; i < iIIArray.length; ++i) {
            int n;
            III iII2 = iIIArray[i];
            if (iII2 == null) continue;
            int n2 = n = iII2.lOl_ + 1 >= iII2.II.length ? 0 : iII2.lOl_ + 1;
            if (iII2.II[n].lOl1 == 3) {
                if (iII2.lOlo < 0) continue;
                this.IIIo(iII2);
                continue;
            }
            if (iII2.II[n].lOl1 != 1) continue;
            if (iII2.lOlo >= 0) {
                this.IIIo(iII2);
            }
            iII2.status = 1;
        }
    }

    private void IIIo(III iII) {
        if (iII.I0oI) {
            this.II11(iII);
        }
        iII.lOlo = -1;
        iII.status = 0;
        iII.I1lI = System.currentTimeMillis();
        iII.lOl_ = -1;
    }

    private void IIl(III iII) {
        iII.lOl_ = iII.II.length;
        iII.status = 8;
    }

    private void IIlI(III iII) {
        III iII2 = this.II(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726), null, 0);
        if (iII2 == null) {
            return;
        }
        iII2.IoIo = true;
        iII2.lO1o = iII.lOlo;
        iII2.lO_ = iII.lO1;
        iII2.status = 1;
    }

    private void IIll(III iII) {
        int n = iII.lOlO / (10 + this.IIIl.nextInt(91));
        iII.lOlO = (int)Math.min(16070777L, (long)iII.lOlO + (long)n);
        iII.lllI = Math.max(1, iII.lOlO / 10);
        this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
    }

    private void III1(III iII, long l) {
        III iII2;
        int n;
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726)) && iII.lOlo >= 0 && iII.lOl_ >= 0 && !iII.Io) {
            iII.Io = true;
            this.IIlI(iII);
        }
        if (iII.IoIo) {
            if (iII.I0oI) {
                this.II11(iII);
            }
            iII.lOlo = -1;
            iII.I0oO = true;
            return;
        }
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b9", 4726)) && iII.II != null && iII.lOl_ >= 0 && iII.lOl_ < iII.II.length && iII.II[iII.lOl_] != null) {
            III[] iIIArray = iII.II[iII.lOl_];
            for (n = 0; n < iIIArray.length; ++n) {
                iII2 = iIIArray[n];
                if (iII2 == null || iII2.Illo() || iII2.lOlo < 0 || iII2.status < 1 || iII2.status > 5) continue;
                return;
            }
        }
        if (iII.lOl_ < iII.II.length - 1 && iII.lOl_ >= 0) {
            iII.status = 1;
            return;
        }
        if (iII.I0oI) {
            this.II11(iII);
        }
        iII.lOlo = -1;
        iII.I1lI = l;
        iII.status = 0;
        iII.lOl_ = -1;
        if (iII.II != null) {
            for (int i = 0; i < iII.II.length; ++i) {
                if (iII.II[i] == null) continue;
                for (n = 0; n < iII.II[i].length; ++n) {
                    iII2 = iII.II[i][n];
                    if (iII2 == null || iII2.lOlo < 0 || iII2.status == 0) continue;
                    if (iII2.I0oI) {
                        this.II11(iII2);
                    }
                    iII2.lOlo = -1;
                    iII2.status = 0;
                    iII2.I1lI = l;
                    iII2.lOl_ = -1;
                }
            }
        }
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b4", 4726)) && iII.II != null) {
            this.II(iII.II, 5);
        }
    }

    private void IIl1(III iII) {
        IOol iOol = this.IIII.II;
        if (!this.II(iII) || iOol.llIl <= 0) {
            return;
        }
        if (iII.Ioll) {
            iII.I1 = iOol.I1 + this.IIIl.nextInt(201) - 100;
            iII.I1I = 0;
            iII.I0o = true;
            if (iII.I0oI) {
                this.IIII.II(new IO0o(-7).IIII(iII.I1l).III(iII.I1).III(iII.I1I));
            }
            iII.status = 5;
        } else if (IO_I.II(iII, iOol.I1, iOol.I1I) <= 500) {
            iII.status = 5;
        }
    }

    synchronized III II(int n, String string, String string2, int[] nArray, int n2, int n3, int n4, int n5, int n6, String[] stringArray, int[][] nArray2) {
        II iI = new II();
        iI.lIlI = string;
        iI.II1o = string2;
        iI.lOlI = 0;
        iI.lllI = n2;
        iI.lOll = 999999;
        iI.lOl1 = 0;
        iI.I1o1 = nArray;
        iI.I1o_ = new int[]{n3};
        iI.IIO = new int[]{n4};
        iI.I1oO = new int[0];
        iI.II1_ = nArray2;
        iI.Ill_ = new String[0];
        iI.IllO = stringArray;
        iI.Ill0 = new String[0];
        IIII iIII = new IIII();
        iIII.I1l = n;
        iIII.lIlI = string;
        iIII.Iol1 = true;
        iIII.Illo = new String[]{string};
        III iII = new III();
        iII.II = iIII;
        iII.I1l = n;
        iII.II = new II[]{iI};
        iII.II = null;
        iII.lO10 = 0;
        iII.status = 1;
        iII.IoI0 = true;
        iII.IoIo = true;
        iII.lO1o = n4;
        iII.lO_ = 0;
        iII.lO_O = n5;
        iII.lO_0 = n6;
        iII.lOl_ = -1;
        this.III_.addElement(iII);
        return iII;
    }

    synchronized III II(int n, int n2, int n3) {
        III iII = this.II(-340, IO_I.I1lO("\u1226\u12da\u12f7\u129c\u12be\u135e", 4726), IO_I.I1lO("\u123b\u12f4\u1294\u12a5\u1342\u12b0\u135e\u1328\u134e\u13dd\u1358\u13a8\u131e\u1465\u14dc", 4726), new int[]{739, 740, 741, -1, -1, -1}, n, n2, 146, n3, 336, new String[]{IO_I.I1lO("\u120a\u12b8\u1285\u12af\u13e2\u12a1\u0dd3\u132c\u134f\u13ad\u13e1\u13a2\u13ca\u1464\u145d\u0a96\u1408\u14a5\u14c7\u14ab\u0a5d\u1575\u1500\u154b\u1536\u1591\u15bc\u15cf\u15bb\u15d9\u167b\u165f\u1639\u1655\u16f7\u16db\u086d\u1685\u1731", 4726)}, (int[][])new int[][]{{2, 7, 1000}, {3, 7, 1000}, {1, 7, 1000}, {5, 7, 1000}, {8, 7, 15000}});
        iII.IoI0 = false;
        iII.IoIl = true;
        iII.IoI1 = true;
        return iII;
    }

    synchronized void IIl_(III iII) {
        IOol iOol = this.IIII.II;
        iII.IoI1 = false;
        this.IIII(iII, Math.max(60, iOol.I1 + (this.IIIl.nextBoolean() ? 1 : -1) * (50 + this.IIIl.nextInt(50))), 336);
    }

    synchronized void IIlO(III iII) {
        if (iII == null) {
            return;
        }
        this.II11(iII);
        iII.lOlo = -1;
        iII.I0oO = true;
        iII.status = 0;
    }

    synchronized void IIl0(III iII) {
        this.IIII.II(new IO0o(-45).II(4).IIII(iII.I1l).III(83).III(3000));
        this.II(iII, IO_I.I1lO("\u122e\u12f0\u12d9\u12f3\u13e3\u13f3\u1349", 4726));
    }

    synchronized void IIlo(III iII) {
        this.IIII.II(new IO0o(-60).IIII(iII.I1l).II(83).II(1).IIII(this.IIII.II.I1l).II(1).II(1).IIII(1000000000).II(true).II(false));
        this.II(iII, IO_I.I1lO("\u123e\u1277\u12cd\u12b2\u1293\u1370\u1351", 4726));
    }

    synchronized III II(String string, int n, String string2, int[] nArray, int n2, int n3, int n4, int n5, int n6, String[] stringArray, int[][] nArray2) {
        Object object;
        for (int i = 0; i < this.III_.size(); ++i) {
            object = (III)this.III_.elementAt(i);
            if (((III)object).II == null || !string.equals(((III)object).II.lIlI) || ((III)object).I0oO) continue;
            return object;
        }
        II iI = new II();
        iI.lIlI = string;
        iI.II1o = string2;
        iI.lOlI = 0;
        iI.lllI = n2;
        iI.lOll = 999999;
        iI.lOl1 = 0;
        iI.I1o1 = nArray;
        iI.I1o_ = new int[]{n3};
        iI.IIO = new int[]{n4};
        iI.I1oO = new int[0];
        iI.II1_ = nArray2;
        iI.Ill_ = new String[0];
        iI.IllO = stringArray;
        iI.Ill0 = new String[0];
        object = new IIII();
        ((IIII)object).I1l = n;
        ((IIII)object).lIlI = string;
        ((IIII)object).Iol1 = true;
        ((IIII)object).Illo = new String[]{string};
        III iII = new III();
        iII.II = object;
        iII.I1l = n;
        iII.II = new II[]{iI};
        iII.II = null;
        iII.lO10 = 0;
        iII.status = 1;
        iII.IoIO = true;
        iII.IoIo = true;
        iII.lO1o = n4;
        iII.lO_ = 0;
        iII.lO_O = n5;
        iII.lO_0 = n6;
        iII.lOl_ = -1;
        this.III_.addElement(iII);
        return iII;
    }

    synchronized III II(String string) {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (iII.II == null || !string.equals(iII.II.lIlI) || iII.I0oO) continue;
            return iII;
        }
        return null;
    }

    synchronized void IIOO(String string) {
        III iII = this.II(string);
        if (iII == null) {
            return;
        }
        if (iII.I0oI) {
            this.II11(iII);
        }
        iII.lOlo = -1;
        iII.I0oO = true;
        iII.status = 0;
    }

    synchronized III III(String string) {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (!iII.IoI0 || !iII.II.lIlI.equals(string)) continue;
            return iII;
        }
        return null;
    }

    synchronized void Iool() {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (!iII.IoI0) continue;
            if (iII.I0oI) {
                this.II11(iII);
            }
            iII.lOlo = -1;
            iII.I0oO = true;
            iII.status = 0;
        }
    }

    private static double II(String string) {
        if (string.equals(IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d5\u13ed\u1385\u13a2\u1456\u1464\u1408", 4726))) {
            return 1.1;
        }
        if (string.equals(IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d9\u13e4\u138e\u13ba", 4726))) {
            return 2.3;
        }
        if (string.equals(IO_I.I1lO("\u1238\u12dc\u12fa\u1299\u12b3\u134e\u1371\u1300\u1331\u13d9\u13e5\u1386", 4726))) {
            return 1.2;
        }
        if (string.equals(IO_I.I1lO("\u1224\u12da\u12f6\u129c\u12a6\u134e\u1366\u130a\u1331\u13de\u13e5", 4726))) {
            return 1.3;
        }
        return 1.0;
    }

    private static double III(String string) {
        if (string.equals(IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d5\u13ed\u1385\u13a2\u1456\u1464\u1408", 4726))) {
            return 1.1;
        }
        if (string.equals(IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d9\u13e4\u138e\u13ba", 4726))) {
            return 1.15;
        }
        if (string.equals(IO_I.I1lO("\u1238\u12dc\u12fa\u1299\u12b3\u134e\u1371\u1300\u1331\u13d9\u13e5\u1386", 4726))) {
            return 1.2;
        }
        if (string.equals(IO_I.I1lO("\u1224\u12da\u12f6\u129c\u12a6\u134e\u1366\u130a\u1331\u13de\u13e5", 4726))) {
            return 1.3;
        }
        return 1.0;
    }

    synchronized void II(long l, long l2) {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (!iII.IoI0 || iII.Illo() || iII.II.lIlI.equals(IO_I.I1lO("\u1238\u12dc\u12fa\u1299\u12b3\u134e\u1373\u1303\u1321\u13c3\u13e9", 4726))) continue;
            String string = iII.II.lIlI;
            int n = (int)Math.min(200000000L, (long)((double)l * IO_I.II(string)));
            int n2 = (int)Math.min(2000000000L, (long)((double)l2 * IO_I.III(string)));
            n = Math.max(1, n);
            n2 = Math.max(1, n2);
            if (n == iII.lllI && n2 == iII.lOlO) continue;
            double d = iII.lOlO > 0 ? (double)iII.llIl / (double)iII.lOlO : 1.0;
            iII.lllI = n;
            iII.lOlO = n2;
            iII.llIl = Math.max(1, (int)Math.round((double)iII.lOlO * d));
            if (!iII.I0oI) continue;
            this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
        }
    }

    synchronized boolean Ill_() {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (!iII.IoI0 || iII.I0oO || iII.status != 1 && (iII.llIl <= 0 || iII.status == 0)) continue;
            return true;
        }
        return false;
    }

    synchronized boolean IllO() {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (!iII.IoI0 || iII.I0oO || iII.llIl <= 0 || !IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d9\u13fe\u138a\u13a4\u144e", 4726).equals(iII.II.lIlI)) continue;
            return true;
        }
        return false;
    }

    private void II1(III iII) {
        String string = iII.II.lIlI;
        int n = iII.I1;
        int n2 = iII.I1I;
        if (string.equals(IO_I.I1lO("\u1222\u12c0\u12ec\u129f\u12ad\u1353\u1374\u1304\u132c", 4726))) {
            this.II.II(705, 1, n, n2, null);
            this.II.II(457, 1, n - 14, n2, null);
            int n3 = Math.max(1, Math.min(110, this.II.IlI()));
            if (this.IIIl.nextInt(110) < n3) {
                this.II.II(457, 1 + this.IIIl.nextInt(10), n + 14, n2, null);
            }
            return;
        }
        if (this.IIIl.nextInt(100) < 40) {
            this.II.II(17 + this.IIIl.nextInt(4), 1, n, n2, null);
        }
        if (this.IIIl.nextInt(100) < 60) {
            this.II.II(1824, 1 + this.IIIl.nextInt(3), n + 12, n2, null);
        }
        if (string.equals(IO_I.I1lO("\u1235\u12d4\u12f0\u129a\u12b1\u1359\u136f\u131f\u132c", 4726)) || string.equals(IO_I.I1lO("\u123e\u12d4\u12e0\u1290\u12ba\u1358\u1369\u130e\u132d\u13c6\u13f3\u139b\u13a8", 4726)) || string.equals(IO_I.I1lO("\u1222\u12c0\u12ec\u129f\u12ad\u1353\u1374\u1304\u132c", 4726))) {
            if (this.IIIl.nextInt(100) < 30) {
                this.II.II(611, 1 + this.IIIl.nextInt(3), n - 24, n2, null);
            }
            if (this.IIIl.nextInt(100) < 10) {
                this.II.II(422, 1, n - 12, n2, null);
            }
        }
    }

    private void II1I(III iII) {
        String string = iII.II.lIlI;
        int n = iII.I1;
        int n2 = iII.I1I;
        if (string.equals(IO_I.I1lO("\u1238\u12dc\u12fa\u1299\u12b3\u134e\u1373\u1303\u1321\u13c3\u13e9", 4726))) {
            return;
        }
        this.II.II(17 + this.IIIl.nextInt(4), 1, n, n2, null);
        if (string.equals(IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d5\u13ed\u1385\u13a2\u1456\u1464\u1408", 4726))) {
            this.II.II(611, 1 + this.IIIl.nextInt(3), n + 12, n2, null);
        }
        this.II.II(1824, 1, n - 12, n2, null);
    }

    void Ioo1() {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            iII.I0oI = false;
            iII.II = null;
            iII.I0o = false;
        }
    }

    void Ioo_() {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (iII.status < 3 || iII.status > 8 || iII.lOlo < 0 || !this.II(iII) || iII.I0oI) continue;
            this.II(iII, false);
        }
    }

    private void II1l(III iII) {
        if (iII.I0o) {
            return;
        }
        if (iII.lO_O >= 0) {
            iII.I1 = iII.lO_O;
            iII.I1I = iII.lO_0;
            iII.I0o = true;
            return;
        }
        IOol iOol = this.IIII.II;
        int n = 150 + this.IIIl.nextInt(150);
        iII.I1 = iOol.I1 + (this.IIIl.nextBoolean() ? n : -n);
        if (iII.I1 < 60) {
            iII.I1 = iOol.I1 + n;
        }
        iII.I1I = iOol.I1I;
        iII.I0o = true;
    }

    private void II(III iII, boolean bl) {
        if (this.IIII.II == null) {
            return;
        }
        this.II1l(iII);
        iII.I0oI = true;
        IO0o iO0o = new IO0o(-5).IIII(iII.I1l).IIII(-1).II(0).II(false).II(iII.lOl0).II(iII.II.lOlI).II(iII.II.lOlI).III(iII.II.I1o1[0]).II(iII.II1o).IIII(iII.llIl).IIII(iII.lOlO).III(iII.II.I1o1[1]).III(iII.II.I1o1[2]).II(iII.II.I1o1[3]).II(-1).III(iII.I1).III(iII.I1I).III(0).III(0).II(0).II(0).II(0).III(-1).II(0).II(0).III(iII.II.I1o1[4]).II(iII.II.I1o1[5]).III(-1);
        this.IIII.II(iO0o);
        if (iII.llIl <= 0) {
            this.IIII.II(new IO0o(-8).IIII(iII.I1l).II(0).III(iII.I1).III(iII.I1I));
        }
        if (iII.II == null) {
            iII.II = this.II.II(iII);
        }
        iII.II.IoOo = iII.llIl <= 0 || iII.status == 6 || iII.status == 7 || iII.status == 8;
    }

    void II11(III iII) {
        if (!iII.I0oI) {
            return;
        }
        this.IIII.II(new IO0o(-6).IIII(iII.I1l));
        iII.I0oI = false;
        if (iII.II != null) {
            iII.II.IoOo = true;
        }
    }

    private void II(III iII, int n) {
        iII.lOl0 = n;
        if (iII.I0oI && this.II(iII)) {
            this.IIII.II(new IO0o(-30).II(35).IIII(iII.I1l).II(n));
        }
    }

    private void III(III iII, int n, int n2) {
        int n3 = iII.I1 - n < 0 ? 1 : -1;
        int n4 = 40 + this.IIIl.nextInt(21);
        iII.I1 += n3 * n4;
        iII.I1I = n2 + (this.IIIl.nextInt(10) < 3 ? -50 : 0);
        if (iII.I0oI) {
            this.IIII.II(new IO0o(-7).IIII(iII.I1l).III(iII.I1).III(iII.I1I));
        }
    }

    private void IIII(III iII, int n, int n2) {
        iII.I1 = n;
        iII.I1I = n2;
        if (iII.I0oI) {
            this.IIII.II(new IO0o(-7).IIII(iII.I1l).III(iII.I1).III(iII.I1I));
        }
    }

    private void II1_(III iII) {
        int n;
        if (iII.lO_O < 0) {
            return;
        }
        int n2 = iII.lO_O - iII.I1;
        int n3 = iII.lO_0 - iII.I1I;
        if (n2 == 0 && n3 == 0) {
            return;
        }
        int n4 = (int)Math.sqrt((double)n2 * (double)n2 + (double)n3 * (double)n3);
        if (n4 <= (n = 40 + this.IIIl.nextInt(21))) {
            iII.I1 = iII.lO_O;
            iII.I1I = iII.lO_0;
        } else {
            iII.I1 += n2 * n / n4;
            iII.I1I += n3 * n / n4;
        }
        if (iII.I0oI) {
            this.IIII.II(new IO0o(-7).IIII(iII.I1l).III(iII.I1).III(iII.I1I));
        }
    }

    private static int II(III iII, int n, int n2) {
        double d = iII.I1 - n;
        double d2 = iII.I1I - n2;
        return (int)Math.sqrt(d * d + d2 * d2);
    }

    private static int II1_(int n) {
        if (n == 1 || n == 3 || n == 5) {
            return 300;
        }
        if (n == 0 || n == 2 || n == 4 || n == 9 || n == 17) {
            return 100;
        }
        return 500;
    }

    private void III_(III iII, long l) {
        if (l < iII.I110) {
            return;
        }
        if (this.II.Il0l()) {
            return;
        }
        if (l - iII.I1l0 < 100L || iII.lOl0 != 5 || iII.II.length == 0) {
            return;
        }
        iII.I1l0 = l;
        if (!this.II(iII) || !iII.I0oI) {
            return;
        }
        IOol iOol = this.IIII.II;
        if (iOol.llIl <= 0) {
            return;
        }
        if (iII.lOO > 0 && (iOol.I1 < iII.lO_o || iOol.I1 > iII.lOO)) {
            this.II1_(iII);
            return;
        }
        if (iII.IoI && iOol._l0l == 10) {
            return;
        }
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1237\u12db\u12eb\u1287\u12a0\u135e\u137d\u1310\u1322", 4726))) {
            this.IIIO(iII, l);
        }
        if (l < iII.I1lo) {
            return;
        }
        int n = this.IIIl.nextInt(iII.II.length);
        IOO.IIIO iIIO = iII.II[n];
        if (IO_I.II(iII, iOol.I1, iOol.I1I) <= IO_I.II1_(iIIO.lO0I)) {
            boolean bl;
            if (this.IIIl.nextInt(20) < 5) {
                int n2;
                bl = iIIO.lO0I == 1 || iIIO.lO0I == 3 || iIIO.lO0I == 5;
                int n3 = n2 = bl ? 20 + this.IIIl.nextInt(181) : 10 + this.IIIl.nextInt(31);
                int n4 = this.IIIl.nextInt(10) % 2 == 0 ? iOol.I1I : iOol.I1I - this.IIIl.nextInt(bl ? 71 : 51);
                this.IIII(iII, iOol.I1 + (this.IIIl.nextBoolean() ? n2 : -n2), n4);
            }
            if (l - iII.III_[n] < (long)iII.I1o0[n]) {
                return;
            }
            if (iII.II.lIlI.equals(IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d9\u13e4\u138e\u13ba", 4726)) && iOol.I1I < 220) {
                return;
            }
            iII.III_[n] = l;
            boolean bl2 = bl = iIIO.lO0I == 6 || iIIO.lO0I == 20 || iIIO.lO0I == 22 || iIIO.lO0I == 23;
            if (!bl) {
                iII.I1lo = l + 1000L + (long)this.IIIl.nextInt(1001);
            }
            this.II(iII, iIIO);
        } else if (this.IIIl.nextBoolean()) {
            this.III(iII, iOol.I1, iOol.I1I);
        }
    }

    private void II(III iII, IOO.IIIO iIIO) {
        IOol iOol = this.IIII.II;
        switch (iIIO.lO0I) {
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
            case 26: {
                int n = (int)Math.min(2000000000L, (long)iII.lllI * (long)iIIO.lo / 100L);
                n += n * (this.IIIl.nextInt(11) - 5) / 100;
                if (n < 1) {
                    n = 1;
                }
                this.II.II(iII, iIIO, n);
                break;
            }
            case 8: {
                if (iII.llIl >= iII.lOlO) break;
                iII.llIl = Math.min(iII.lOlO, iII.llIl + iII.lOlO / 20);
                this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
                break;
            }
            case 6: {
                int n = Math.max(1, iIIO.l1__);
                if (IO_I.II(iII, iOol.I1, iOol.I1I) > 120 + n * 30) break;
                String[] stringArray = new String[]{IO_I.I1lO("\u123b\u0c3a\u12c0\u12f3\u1291\u0df6\u1351\u136f\u131a\u13ec", 4726), IO_I.I1lO("\u1235\u12fd\u1247\u12ba\u12d2\u137c\u0d9f\u133b\u134e\u13fc\u13d9\u132a", 4726), IO_I.I1lO("\u1366\u12e0\u12dd\u12f3\u129f\u0dbe\u1344\u136f\u131c\u0d5e\u13c5", 4726), IO_I.I1lO("\u123b\u126c\u1294\u12be\u0c5d\u1365\u1310\u133d\u0dbd\u13e4", 4726)};
                int n2 = n + 2;
                if (!this.IIII.II.II1O(n2 * 1000, iII.I1l)) break;
                this.IIII.II(new IO0o(44).IIII(iOol.I1l).II(stringArray[this.IIIl.nextInt(stringArray.length)]));
                this.IIII.II(new IO0o(-45).II(0).IIII(iII.I1l).III(iIIO.I1l).II(0).II(1).IIII(iOol.I1l).II(n2));
                break;
            }
            case 20: {
                int n = Math.max(1, iIIO.l1__);
                this.II(iII, IO_I.I1lO("\u1232\u0c5e\u12d7\u12bb\u12d2\u1372\u1358\u133a\u1317\u0d4e\u13c2\u13eb\u139e\u0ae0\u144b\u1467\u1412\u14ed\u0a79\u14aa", 4726));
                this.IIII(iII, iOol.I1 + (this.IIIl.nextBoolean() ? 25 : -25), iOol.I1I);
                int n3 = (int)Math.min(2000000000L, (long)iII.lllI * (long)Math.max(100, iIIO.lo) / 100L);
                if (n3 < 1) {
                    n3 = 1;
                }
                this.II.II(iII, iIIO, n3);
                if (iOol.llIl <= 0) break;
                this.IIII.II.II0_((n + 1) * 500, iII.I1l);
                break;
            }
            case 22: {
                int n = Math.max(1, iIIO.l1__);
                this.IIII.II.II0O((n + 4) * 1000, iII.I1l);
                break;
            }
            case 23: {
                int n = Math.max(1, iIIO.l1__);
                this.IIII.II.II00(n * 5000, iII.I1l);
                break;
            }
        }
    }

    III II(int n) {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (iII.I1l != n || !iII.I0oI || iII.lOlo < 0) continue;
            return iII;
        }
        return null;
    }

    III II() {
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (iII.lOlo < 0 || !this.II(iII) || !this.III(iII) || iII.lOl0 != 5) continue;
            return iII;
        }
        return null;
    }

    private int II(III iII, String string, int n) {
        if (string.startsWith(IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344", 4726)) || string.startsWith(IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307", 4726)) || string.startsWith(IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5", 4726)) || string.startsWith(IO_I.I1lO("\u1232\u12da\u12fd\u128c\u12a6\u1343\u1365\u1300\u1320\u13ca", 4726))) {
            if (this.IIIl.nextInt(100) < 10) {
                return -1;
            }
            return Math.min(n, Math.max(1, iII.lOlO / 100));
        }
        if (string.equals(IO_I.I1lO("\u1231\u12da\u12f8\u1297\u12b7\u135f\u136f\u1309\u133c\u13c4\u13e9\u1391\u13ab", 4726))) {
            return Math.min(n, 50000000);
        }
        if (string.equals(IO_I.I1lO("\u1234\u12dc\u12f9\u1292", 4726)) || string.equals(IO_I.I1lO("\u123b\u12d4\u12e0\u1281\u12bd\u1358", 4726)) || string.equals(IO_I.I1lO("\u1232\u12da\u12fd", 4726)) || string.equals(IO_I.I1lO("\u122c\u12da\u12f9\u1291\u12bb\u1354", 4726))) {
            if (this.IIIl.nextInt(1000) < 10) {
                return -1;
            }
            return Math.min(Math.max(1, n / 7), Math.max(1, iII.lOlO / 50));
        }
        if (string.equals(IO_I.I1lO("\u123d\u12dd\u12fd\u1297\u12bd\u1345", 4726))) {
            return Math.max(1, n / 7);
        }
        if (string.equals(IO_I.I1lO("\u1238\u12d2\u12e1\u128a\u12b7\u1345\u1364\u1307\u132f\u13c3", 4726)) || string.equals(IO_I.I1lO("\u1238\u12dd\u12f5\u1287\u12a6\u1359\u1371\u1301", 4726)) || string.equals(IO_I.I1lO("\u1222\u12dd\u12e1\u128a\u12ad\u1345\u1379\u1301\u1326", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12fa\u128c\u12a6\u1358\u137e\u1307", 4726))) {
            return n > 1000000 ? 900000 + this.IIIl.nextInt(100001) : n;
        }
        if (string.equals(IO_I.I1lO("\u1234\u12d0\u12eb\u129d\u12b3", 4726))) {
            return Math.min(n, 500000);
        }
        if (string.equals(IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371", 4726)) || string.equals(IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371\u1310\u135c", 4726)) || string.equals(IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371\u1310\u135d", 4726)) || string.equals(IO_I.I1lO("\u1231\u12da\u12ff\u1286", 4726))) {
            return Math.min(n, 20000000);
        }
        if (string.equals(IO_I.I1lO("\u1235\u12d4\u12f0\u129a\u12b1", 4726))) {
            return Math.min(n, 10000000);
        }
        if (string.equals(IO_I.I1lO("\u123b\u12d4\u12f6\u1286\u12ad\u1320\u1302\u1307", 4726))) {
            return n >= 50000000 ? 50000000 + this.IIIl.nextInt(20001) - 10000 : n;
        }
        return n;
    }

    boolean III(III iII) {
        return iII.I0oI && iII.llIl > 0 && iII.status >= 3 && iII.status <= 5;
    }

    boolean IIII(III iII) {
        return iII.IoI0 && IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d9\u13fe\u138a\u13a4\u144e", 4726).equals(iII.II.lIlI) && this.IIII.II.Il11();
    }

    int II(III iII, int n, boolean bl, IOO.IIIO iIIO) {
        return this.II(iII, n, bl, iIIO, this.IIII.II.I1l);
    }

    int II(III iII, int n, boolean bl, IOO.IIIO iIIO, int n2) {
        III iII2;
        if (!this.III(iII)) {
            return 0;
        }
        String string = iII.II.lIlI;
        if (string.equals(IO_I.I1lO("\u1237\u12db\u12eb\u1287\u12a0\u135e\u137d\u1310\u1322", 4726))) {
            n = 1;
        } else if (string.equals(IO_I.I1lO("\u1239\u12ca\u12f0\u129c\u12c3", 4726))) {
            n = 50000;
        }
        if (string.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b4", 4726)) && iIIO != null && (iIIO.lO0I == 1 || iIIO.lO0I == 3 || iIIO.lO0I == 5)) {
            iII.llIl = Math.min(iII.lOlO, iII.llIl + n * 80 / 100);
            this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
            if (this.IIIl.nextInt(5) == 0) {
                this.II(iII, IO_I.I1lO("\u123e\u0c30\u12c4\u12f3\u1286\u1379\u0dd5\u1361\u1340\u13ad\u13cf\u132a\u1389\u1429\u1446\u1420\u15d6\u1524\u14cd\u14e3\u148c\u1566\u1548\u1416\u157e\u150e\u15fd\u15d4\u15fa\u158f\u08b5\u164e\u1669", 4726));
            }
            return 0;
        }
        if (string.equals(IO_I.I1lO("\u1232\u12c7\u12eb\u1298\u12bd\u1343\u1375", 4726)) && iIIO != null && (iIIO.lO0I == 1 || iIIO.lO0I == 3 || iIIO.lO0I == 5)) {
            iII.llIl = Math.min(iII.lOlO, iII.llIl + n);
            this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
            if (this.IIIl.nextInt(5) == 0) {
                this.II(iII, IO_I.I1lO("\u123e\u0c30\u12c4\u12f3\u1286\u1379\u0dd5\u1361\u1340\u13ad\u13cf\u132a\u1389\u1429\u1446\u1420\u15d6\u1524\u14cd\u14e3\u148c\u1566\u1548\u1416\u157e\u150e\u15fd\u15d4\u15fa\u158f\u08b5\u164e\u1669", 4726));
            }
            return 0;
        }
        if (iII.I0o1 && iIIO != null && this.IIIl.nextInt(1000) < 400) {
            this.II(iII, IO_I.I1lO("\u122e\u1278\u1294\u12bb\u0c17\u1365", 4726));
            return 0;
        }
        if (iII.IoI && this.IIII.II._l0l == 10) {
            this.II.IIol(IO_I.I1lO("\u1234\u0c34\u12da\u12f3\u13e3\u1370\u135e\u1328\u134e\u13ef\u0d67\u13eb\u139e\u1461\u14dc\u142e\u1446\u14e8\u14cd\u1429\u148c\u152d\u1500\u1557\u15bd\u1504\u15bc\u15d8\u15b2\u0b24\u1638\u16e3\u1625\u161c\u16fa\u1693\u16b5\u1698\u09b3\u1746\u176e\u170f\u1775\u17ca", 4726));
            return 0;
        }
        if (iII.IoI0) {
            if (this.IIII(iII)) {
                return 0;
            }
            if (iII.lOOI > 0 && this.IIIl.nextInt(100) < iII.lOOI) {
                this.II(iII, IO_I.I1lO("\u122e\u1278\u1294\u12bb\u0c17\u1365", 4726));
                return 0;
            }
            n = Math.max(1, n / 2);
            if (string.equals(IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1365\u1316\u1331\u13d9\u13e4\u138e\u13ba", 4726)) && iIIO == null) {
                n = Math.max(1, n * 30 / 100);
            }
            if (string.equals(IO_I.I1lO("\u1238\u12dc\u12fa\u1299\u12b3\u134e\u1371\u1300\u1331\u13d9\u13e5\u1386", 4726)) && !iII.IolI && iII.llIl <= iII.lOlO / 2) {
                iII.IolI = true;
                if (this.IIIl.nextInt(5) < 4) {
                    this.IIII.II.II_l(iII);
                }
                return 0;
            }
        }
        if (string.equals(IO_I.I1lO("\u1222\u12d4\u12e1\u128c\u12a2\u1350\u1369\u1310\u133e\u13cc\u13f5\u1394\u13ae\u1446\u1466\u1400\u1439\u14cb\u14e5\u148e\u14bd\u154a\u1561\u156d\u1517\u1533", 4726))) {
            long l;
            if (n > 100) {
                n = 100;
            }
            if ((l = (long)n * (long)(20 + this.IIIl.nextInt(31))) > 10000000L) {
                l = 10000000L - (long)this.IIIl.nextInt(1000000);
            }
            if (this.IIII.II.IO_l >= 1500000L) {
                l = 0L;
            }
            if (l > 0L) {
                this.II.II1l(l);
            }
        }
        if (string.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b9", 4726)) || string.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b8", 4726))) {
            III iII3;
            III iII4 = iII3 = string.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b9", 4726)) ? iII : iII.II;
            if (iII3 != null && !iII3.I0o0 && n >= iII.llIl) {
                this.IIIO(iII3);
                this.IIII.II(new IO0o(-60).IIII(n2).II(iIIO == null ? 0 : iIIO.I1l & 0xFF).II(1).IIII(iII.I1l).II(1).II(0).IIII(0).II(false).II(bl));
                return 0;
            }
        } else if (string.equals(IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13be", 4726)) && iII.II != null && ((iII2 = this.II(iII.II, IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b8", 4726))) != null && !iII2.Illo() || !iII.II.Illo())) {
            if (n >= iII.llIl) {
                n = iII.llIl - 1;
            }
            if (n < 0) {
                n = 0;
            }
        }
        if ((n = this.II(iII, string, n)) < 0) {
            this.II(iII, IO_I.I1lO("\u122e\u1278\u1294\u12bb\u0c17\u1365", 4726));
            return 0;
        }
        if (string.equals(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726)) || string.equals(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726))) {
            int n3;
            if ((iIIO == null || iIIO.lO0I != 14) && n > (n3 = Math.max(1, iII.lOlO / 100))) {
                n = n3;
            }
            if (this.IIIl.nextInt(string.equals(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726)) ? 10 : 30) == 0) {
                this.IIll(iII);
            }
        }
        if (string.equals(IO_I.I1lO("\u1221\u12dd\u12fd\u1280", 4726)) && iII.I0o1) {
            n = Math.max(1, n / Math.max(1, iII.lO_I));
        }
        if (string.equals(IO_I.I1lO("\u122e\u12d0\u12fa\u128c\u12b0\u135e\u136f\u1307\u133b\u13c3\u13eb", 4726))) {
            n = Math.max(1, n / 2);
        } else if (string.equals(IO_I.I1lO("\u1234\u12d4\u12f6\u128a", 4726))) {
            n = Math.max(1, n / 7);
        }
        if (iII.IoIl) {
            if (iII.IoI_) {
                return 0;
            }
            if (n >= iII.llIl) {
                this.IIII.II.II_O(iII);
                return 0;
            }
        }
        if (n >= iII.llIl) {
            n = iII.llIl;
        }
        iII.llIl -= n;
        boolean bl2 = iII.llIl <= 0;
        this.IIII.II(new IO0o(-60).IIII(n2).II(iIIO == null ? 0 : iIIO.I1l & 0xFF).II(1).IIII(iII.I1l).II(1).II(0).IIII(n).II(bl2).II(bl));
        this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
        if (bl2) {
            this.II1O(iII);
        } else {
            if (iII.lOl0 == 0 && !iII.I0oo) {
                this.II(iII, 5);
            }
            if (iII.I0o1 && iII.llIl < iII.lOlO / 5 && System.currentTimeMillis() - iII.I11O > 2000L) {
                iII.I11O = System.currentTimeMillis();
                this.II(iII, this.IIIl.nextBoolean() ? IO_I.I1lO("\u1237\u12d4\u12f5\u1292\u12b3\u1350\u1371\u130e\u132f", 4726) : IO_I.I1lO("\u1217\u12fc\u1294\u12b7\u1293", 4726));
            }
        }
        return n;
    }

    void III(III iII, int n) {
        if (iII.llIl <= 1 || iII.Illo()) {
            return;
        }
        if (false) {
            return;
        }
        if (n >= iII.llIl) {
            n = iII.llIl - 1;
        }
        iII.llIl -= n;
        this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
        this.IIII.II(new IO0o(56).IIII(iII.I1l).IIII(iII.llIl).IIII(n).II(false).II(36));
    }

    void II1O(III iII) {
        if (iII.IoIl) {
            this.IIII.II.II_O(iII);
            iII.llIl = 1;
            return;
        }
        if (iII.I0o1) {
            this.II1o(iII);
            return;
        }
        iII.llIl = 0;
        iII.status = 6;
        if (iII.II != null) {
            iII.II.IoOo = true;
        }
        this.IIII.II.IIO1(iII.II.lIlI);
        this.IIII.II.II(19, 1L);
        this.IIII.II(new IO0o(-8).IIII(iII.I1l).II(0).III(iII.I1).III(iII.I1I));
        if (!iII.IoI0 && !iII.IoIO) {
            this.II.II00(this.IIII.II.II1o + IO_I.I1lO("\u124c\u12b5\u13a4\u1230\u12d2\u1365\u1359\u13a5\u131b\u13ad\u13c8\u13a2\u0d2d\u147d\u1408\u1556\u15d6\u0a66\u14c7\u14e3", 4726) + iII.II1o + IO_I.I1lO("\u1256\u12f8\u0c79\u12ba\u12d2\u137f\u1357\u12ff\u0db3\u13e4\u138c\u12da\u0d2b\u147c\u1408\u1429\u1401\u1535\u0a45\u14ad\u1485\u1521\u154d\u0be6\u1570", 4726));
        }
        if (iII.IoIO) {
            this.II1(iII);
        } else if (iII.IoI0) {
            this.II1I(iII);
            this.IIII.II.II_I(iII);
        } else {
            this.II10(iII);
        }
        this.II.IIIo(iII.II.lIlI, iII.lOl_);
        if (iII.IoI) {
            this.IIII.II.II_1(iII);
        }
    }

    private boolean IIIl(III iII) {
        String string = iII.II.lIlI;
        int n = iII.I1;
        int n2 = iII.I1I;
        if (string.equals(IO_I.I1lO("\u1234\u12dc\u12f9\u1292", 4726)) || string.equals(IO_I.I1lO("\u123b\u12d4\u12e0\u1281\u12bd\u1358", 4726)) || string.equals(IO_I.I1lO("\u1232\u12da\u12fd", 4726))) {
            this.II.II(585, 1, n, n2, null);
            return true;
        }
        if (string.equals(IO_I.I1lO("\u122c\u12da\u12f9\u1291\u12bb\u1354", 4726))) {
            this.II.II(585, 1, n, n2, null);
            if (this.IIII.II.II__(1348) > 0) {
                this.IIII.II.II_l(1348, 1);
                this.II.l1_l();
                this.II.II(702 + this.IIIl.nextInt(7), 1, n + 20, n2, null);
            } else {
                this.II.IIol(IO_I.I1lO("\u1234\u0c34\u12da\u12f3\u1299\u1379\u13c4\u1321\u1309\u13ad\u13cf\u1338\u13ca\u144e\u1441\u0a88\u1446\u1594\u0a55\u14ad\u1485\u1521\u156e\u1558\u0b93\u151e\u15bc\u15f9\u1537\u15d9\u1709\u08f4\u1676\u1619\u0831\u16ca\u16f2\u16b3\u17fd\u170f\u1700\u170a\u1778\u1785", 4726));
            }
            return true;
        }
        if (string.equals(IO_I.I1lO("\u123d\u12dd\u12fd\u1297\u12bd\u1345", 4726))) {
            this.II.II(1045, 1, n, n2, null);
            return true;
        }
        if (string.equals(IO_I.I1lO("\u1222\u12dd\u12e1\u128a\u12ad\u1345\u1379\u1301\u1326", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12fa\u128c\u12a6\u1358\u137e\u1307", 4726)) || string.equals(IO_I.I1lO("\u1238\u12d2\u12e1\u128a\u12b7\u1345\u1364\u1307\u132f\u13c3", 4726)) || string.equals(IO_I.I1lO("\u1238\u12dd\u12f5\u1287\u12a6\u1359\u1371\u1301", 4726))) {
            int n3;
            boolean bl;
            boolean bl2 = bl = string.equals(IO_I.I1lO("\u1222\u12dd\u12e1\u128a\u12ad\u1345\u1379\u1301\u1326", 4726)) || string.equals(IO_I.I1lO("\u1225\u12da\u12fa\u128c\u12a6\u1358\u137e\u1307", 4726));
            int n4 = bl ? 422 : (n3 = string.equals(IO_I.I1lO("\u1238\u12d2\u12e1\u128a\u12b7\u1345\u1364\u1307\u132f\u13c3", 4726)) ? 2123 : 2124);
            if (IOO.II(n3) == null) {
                n3 = 422;
            }
            Vector<int[]> vector = new Vector<int[]>();
            int n5 = bl ? 15 : 10;
            int n6 = bl ? 20 : 20;
            vector.addElement(new int[]{77, n5 + this.IIIl.nextInt(n6 - n5 + 1)});
            vector.addElement(new int[]{103, n5 + this.IIIl.nextInt(n6 - n5 + 1)});
            vector.addElement(new int[]{50, n5 + this.IIIl.nextInt(n6 - n5 + 1)});
            vector.addElement(new int[]{94, 1 + this.IIIl.nextInt(10)});
            vector.addElement(new int[]{14, bl ? 2 + this.IIIl.nextInt(4) : 1 + this.IIIl.nextInt(10)});
            vector.addElement(new int[]{154, 0});
            vector.addElement(new int[]{93, 1 + this.IIIl.nextInt(15)});
            this.II.II(n3, 1, n, n2, vector);
            this.II.IIol(IO_I.I1lO("\u1366\u1325\u0c57\u12b0\u12d3\u1331\u1358\u0dec\u1301\u13ad\u13c4\u132a\u1384\u1428", 4726));
            return true;
        }
        return string.equals(IO_I.I1lO("\u1239\u12db\u12f3\u128c\u12b5\u1358\u1371\u1310\u1320\u13c2\u13e9\u1387", 4726)) || string.equals(IO_I.I1lO("\u1234\u12d0\u12eb\u129d\u12b3", 4726));
    }

    private void II10(III iII) {
        int n;
        if (iII.IoII && this.IIIl(iII)) {
            return;
        }
        String string = iII.II.lIlI;
        int n2 = iII.I1;
        int n3 = iII.I1I;
        for (n = 0; n < IllI.length; ++n) {
            if (!IllI[n].equals(string)) continue;
            int n4 = II1l[n][2];
            int n5 = II1l[n][3];
            int n6 = 1 + this.IIIl.nextInt(2) + 3 + this.IIIl.nextInt(2) + 3;
            for (int i = 0; i < n6; ++i) {
                this.II.II(II1l[n][1], n4 + this.IIIl.nextInt(n5 - n4 + 1), n2 + this.IIIl.nextInt(101) - 50, n3, null);
            }
            this.II.II(II1l[n][0], 1, n2 + this.IIIl.nextInt(101) - 50, n3, IO_I.II(II1l[n][0]));
            this.II.II(19, 1, n2 + this.IIIl.nextInt(101) - 50, n3, null);
            this.II.II(20, 1, n2 + this.IIIl.nextInt(101) - 50, n3, null);
            return;
        }
        if (string.equals(IO_I.I1lO("\u1231\u12da\u12f8\u1297\u12b7\u135f\u136f\u1309\u133c\u13c4\u13e9\u1391\u13ab", 4726))) {
            Vector<int[]> vector = new Vector<int[]>();
            vector.addElement(new int[]{30, 1});
            vector.addElement(new int[]{50, 20});
            vector.addElement(new int[]{77, 20});
            vector.addElement(new int[]{103, 20});
            vector.addElement(new int[]{93, 20});
            this.II.II(629, 1, n2 + this.IIIl.nextInt(101) - 50, n3, vector);
            return;
        }
        if (this.II(iII, string, n2, n3)) {
            return;
        }
        n = 0;
        for (int i = 0; i < Ill.length; ++i) {
            if (!Ill[i].equals(string)) continue;
            n = 1;
        }
        this.II.II(190, 20000 + this.IIIl.nextInt(10001), n2, n3, null);
        if (n != 0) {
            int n7;
            if (this.IIIl.nextInt(100) < 5) {
                int[][] nArrayArray = new int[][]{{230, 231, 232, 234, 235, 236, 238, 239, 240, 242, 243, 244, 246, 247, 248, 250, 251, 252, 266, 267, 268, 270, 271, 272, 274, 275, 276}, {254, 255, 256, 258, 259, 260, 262, 263, 264, 278, 279, 280}};
                int[] nArray = nArrayArray[this.IIIl.nextInt(100) < 70 ? 0 : 1];
                int n8 = nArray[this.IIIl.nextInt(nArray.length)];
                Vector vector = IO_I.II(n8);
                if (vector != null) {
                    int n9;
                    for (n9 = 0; n9 < vector.size(); ++n9) {
                        int[] nArray2 = (int[])vector.elementAt(n9);
                        nArray2[1] = nArray2[1] * (100 + this.IIIl.nextInt(16)) / 100;
                    }
                    n9 = this.IIIl.nextInt(100) + 1;
                    vector.addElement(new int[]{107, n9 <= 80 ? 1 + this.IIIl.nextInt(3) : (n9 <= 97 ? 4 + this.IIIl.nextInt(2) : 6)});
                }
                this.II.II(n8, 1, n2 + 15, n3, vector);
            }
            this.II.II((n7 = this.IIIl.nextInt(100) + 1) <= 40 ? 18 : (n7 <= 70 ? 17 : (n7 <= 90 ? 16 : 15)), 1, n2 - 15, n3, null);
            return;
        }
        if (this.IIIl.nextInt(100) < 80) {
            this.II.II(18 + this.IIIl.nextInt(3), 1, n2 + 15, n3, null);
        }
    }

    private static boolean II(String string, String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            if (!stringArray[i].equals(string)) continue;
            return true;
        }
        return false;
    }

    private void II1l(int n, int n2) {
        int[] nArray = II11[this.IIIl.nextInt(100) < 70 ? 0 : 1];
        int n3 = nArray[this.IIIl.nextInt(nArray.length)];
        Vector vector = IO_I.II(n3);
        if (vector != null) {
            int n4;
            for (n4 = 0; n4 < vector.size(); ++n4) {
                int[] nArray2 = (int[])vector.elementAt(n4);
                nArray2[1] = nArray2[1] * (100 + this.IIIl.nextInt(16)) / 100;
            }
            n4 = this.IIIl.nextInt(100) + 1;
            vector.addElement(new int[]{107, n4 <= 80 ? 1 + this.IIIl.nextInt(3) : (n4 <= 97 ? 4 + this.IIIl.nextInt(2) : 6)});
        }
        this.II.II(n3, 1, n + 15, n2, vector);
    }

    private void II11(int n, int n2) {
        int n3 = this.IIIl.nextInt(100) + 1;
        this.II.II(n3 <= 40 ? 18 : (n3 <= 70 ? 17 : (n3 <= 90 ? 16 : 15)), 1, n - 15, n2, null);
    }

    private boolean II(III iII, String string, int n, int n2) {
        if (string.equals(IO_I.I1lO("\u1234\u12c7\u12fb\u129f\u12ab", 4726))) {
            return true;
        }
        if (string.equals(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726))) {
            if (this.IIII.II.III == null) {
                this.IIII.II.Ilol(this.IIIl.nextInt(3));
            }
            return true;
        }
        if (string.startsWith(IO_I.I1lO("\u1232\u12d0\u12f5\u1287\u12ba\u134e\u1372\u130a\u132f\u13c0", 4726))) {
            Vector<int[]> vector = new Vector<int[]>();
            vector.addElement(new int[]{30, 1});
            vector.addElement(new int[]{50, 20});
            vector.addElement(new int[]{77, 20});
            vector.addElement(new int[]{103, 20});
            vector.addElement(new int[]{93, 20});
            this.II.II(629, 1, n + this.IIIl.nextInt(101) - 50, n2, vector);
            return true;
        }
        if (IO_I.II(string, Ill)) {
            this.II.II(190, 20000 + this.IIIl.nextInt(10001), n, n2, null);
            if (this.IIIl.nextInt(100) < 30) {
                this.II.IIO_(n, n2);
            }
            if (this.IIIl.nextInt(100) < (string.equals(IO_I.I1lO("\u1225\u12dc\u12f1\u1286\u12ad\u1353\u137f\u1310\u1326\u13d8\u13e2\u138c", 4726)) ? 30 : 5)) {
                this.II1l(n, n2);
            }
            this.II11(n, n2);
            if (string.equals(IO_I.I1lO("\u1234\u12d9\u12f5\u1290\u12b9\u134e\u1377\u1300\u1325\u13d8", 4726)) && this.IIIl.nextInt(100) < 50) {
                this.II.II(992, 1, n + 25, n2, null);
            }
            return true;
        }
        if (string.equals(IO_I.I1lO("\u1234\u12d4\u12f6\u128a", 4726)) || string.equals(IO_I.I1lO("\u1234\u12d4\u12f6\u128a\u12ad\u135c\u137f\u1301\u1325\u13c8\u13f5", 4726))) {
            int[] nArray = new int[]{562, 564, 566, 561};
            int[] nArray2 = new int[]{555, 557, 559, 556, 558, 560, 563, 565, 567};
            if (this.IIIl.nextInt(30) < 8) {
                this.II.III0(nArray[this.IIIl.nextInt(nArray.length - 1)], n, n2);
            } else if (this.IIIl.nextInt(50) < 15) {
                this.II.III0(nArray2[this.IIIl.nextInt(nArray2.length - 1)], n, n2);
            }
            return true;
        }
        if (IO_I.II(string, Illl)) {
            this.II.II(190, 20000 + this.IIIl.nextInt(10001), n, n2, null);
            if (this.IIIl.nextInt(500) == 0) {
                this.II.IIO_(n, n2);
            }
            if (this.IIIl.nextInt(100) == 0) {
                this.II1l(n, n2);
            }
            this.II.II(20, 1, n, n2, null);
            if (this.IIIl.nextInt(100) < 10) {
                int n3 = this.IIIl.nextInt(100) + 1;
                this.II.II(n3 <= 50 ? 19 : (n3 <= 90 ? 18 : (n3 <= 96 ? 17 : (n3 <= 99 ? 16 : 15))), 1, n + 15, n2, null);
            }
            return true;
        }
        if (string.equals(IO_I.I1lO("\u1222\u12d4\u12e1\u128c\u12a2\u1350\u1369\u1310\u133e\u13cc\u13f5\u1394\u13ae\u1446\u1466\u1400\u1439\u14cb\u14e5\u148e\u14bd\u154a\u1561\u156d\u1517\u1533", 4726)) || string.startsWith(IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344", 4726)) || string.startsWith(IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307", 4726)) || string.startsWith(IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5", 4726)) || string.equals(IO_I.I1lO("\u1232\u12da\u12fd\u128c\u12a6\u1343\u1365\u1300\u1320\u13ca\u13f3\u13fe", 4726))) {
            int n4;
            if (string.equals(IO_I.I1lO("\u1222\u12d4\u12e1\u128c\u12a2\u1350\u1369\u1310\u133e\u13cc\u13f5\u1394\u13ae\u1446\u1466\u1400\u1439\u14cb\u14e5\u148e\u14bd\u154a\u1561\u156d\u1517\u1533", 4726))) {
                return true;
            }
            int n5 = string.equals(IO_I.I1lO("\u1222\u12d4\u12e4\u128c\u12a1\u1344\u136f\u137f", 4726)) ? 5 : (string.equals(IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13bd", 4726)) ? 4 : (string.equals(IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13fb", 4726)) ? 3 : (n4 = string.equals(IO_I.I1lO("\u1232\u12da\u12fd\u128c\u12a6\u1343\u1365\u1300\u1320\u13ca\u13f3\u13fe", 4726)) ? 2 : 5)));
            if (this.IIIl.nextInt(n4) == 0) {
                Vector<int[]> vector = new Vector<int[]>();
                vector.addElement(new int[]{31, 1});
                this.II.II(590, 1, this.IIII.II.I1 + this.IIIl.nextInt(21) - 10, this.IIII.II.I1I, vector);
            }
            return true;
        }
        if (string.equals(IO_I.I1lO("\u1237\u12db\u12eb\u1287\u12a0\u135e\u137d\u1310\u1322", 4726))) {
            if (iII.I1_1 > 0L) {
                long l = iII.I1_1 * 8L / 10L / 5L;
                for (int i = 0; i < 5; ++i) {
                    this.II.II(190, (int)Math.min(2000000000L, l), n + i * 3, n2, null);
                }
            }
            return true;
        }
        if (string.equals(IO_I.I1lO("\u1239\u12ca\u12f0\u129c\u12c3", 4726))) {
            this.II.II(189, 200, n + this.IIIl.nextInt(41) - 20, n2, null);
            int n6 = 441 + this.IIIl.nextInt(7);
            int[] nArray = IOoI.IIII(n6);
            Vector<int[]> vector = new Vector<int[]>();
            vector.addElement(new int[]{nArray[0], nArray[1]});
            vector.addElement(new int[]{30, 0});
            this.II.II(n6, 1, n + this.IIIl.nextInt(41) - 20, n2, vector);
            return true;
        }
        if (string.equals(IO_I.I1lO("\u1225\u12da\u12fd\u128c\u12ba\u1354\u1373\u1310\u133f\u13d8\u13f5\u1385\u13db", 4726))) {
            this.II.II(1591, 1, n + this.IIIl.nextInt(41) - 20, n2, null);
            this.II.II(1594, 1, n + this.IIIl.nextInt(41) - 20, n2, null);
            return true;
        }
        if (string.startsWith(IO_I.I1lO("\u122e\u12d0\u12fa\u128c\u12b1\u135e\u137e", 4726))) {
            this.II.II(190, 20000 + this.IIIl.nextInt(10001), n, n2, null);
            if (this.IIIl.nextInt(100) < 80) {
                this.II.II(18 + this.IIIl.nextInt(3), 1, n + 15, n2, null);
            }
            return true;
        }
        return false;
    }

    private void IIIO(III iII, long l) {
        IOol iOol = this.IIII.II;
        if (l - iII.I1__ < 500L || iII.I1_1 > 10000000000L) {
            return;
        }
        if (Math.abs(iOol.I1 - iII.I1) > 40 || Math.abs(iOol.I1I - iII.I1I) > 40) {
            return;
        }
        int n = 0;
        if (iOol.Il11 >= 1000000000L) {
            n = 4000 + this.IIIl.nextInt(1001);
        } else if (iOol.Il11 >= 2000000L) {
            n = 200000 + this.IIIl.nextInt(100001);
        } else if (iOol.Il11 >= 1000000L) {
            n = 1000 + this.IIIl.nextInt(1001);
        }
        iII.I1__ = l;
        if (n <= 0) {
            return;
        }
        iOol.Il11 -= (long)n;
        iII.I1_1 += (long)n;
        this.II.l1_();
        this.II(iII, IO_I.I1lO("\u123e\u12f4\u12dc\u12b2\u12d2\u1200\u13d3\u136f\u131a\u13ff\u0d75\u13a6\u13ca\u1518\u1598\u0aa4\u1405\u14a5", 4726) + iII.I1_1 + IO_I.I1lO("\u1256\u12c3\u1254\u12bd\u1295", 4726));
    }

    static Vector II(int n) {
        IOO.I___();
        if (IOO.II == null) {
            return null;
        }
        for (int i = 0; i < IOO.II.length; ++i) {
            IOO.III1 iII1 = IOO.II[i];
            if (iII1 == null || iII1.II == null) continue;
            for (int j = 0; j < iII1.II.length; ++j) {
                IOO.III0 iII0 = iII1.II[j];
                if (iII0 == null || iII0.II == null) continue;
                for (int k = 0; k < iII0.II.length; ++k) {
                    IOO.III_ iII_ = iII0.II[k];
                    if (iII_ == null || iII_.l0o1 != n || iII_.II10 == null) continue;
                    Vector<int[]> vector = new Vector<int[]>();
                    for (int i2 = 0; i2 < iII_.II10.length; ++i2) {
                        vector.addElement(new int[]{iII_.II10[i2][0], iII_.II10[i2][1]});
                    }
                    return vector;
                }
            }
        }
        return null;
    }

    synchronized void IooO() {
        int n;
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 0; i < this.III_.size() && vector.size() < 255; ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (iII.I0oO || iII.IoIO || iII.I0o1 || iII.II != null && iII.lOlo < 0) continue;
            int n2 = n = iII.II[0].IIO.length > 0 ? iII.II[0].IIO[0] : -1;
            if (n == 111 || n >= 165 || n >= 131 && n <= 133 || n >= 114 && n <= 120 || n >= 85 && n <= 91) continue;
            vector.addElement(new Integer(i));
        }
        IO0o iO0o = new IO0o(-96).II(0).II(IO_I.I1lO("\u1234\u12fa\u12c7\u12a0", 4726)).II(vector.size());
        for (int i = 0; i < vector.size(); ++i) {
            n = (Integer)vector.elementAt(i);
            III iII = (III)this.III_.elementAt(n);
            II iI = iII.II[0];
            iO0o.IIII(n).IIII(n).III(iI.I1o1[0]).III(-1).III(iI.I1o1[1]).III(iI.I1o1[2]).II(iI.II1o).II(Ill1[iII.status]);
            I0Io.II iI2 = iII.lOlo >= 0 ? I0Io.II(iII.lOlo) : null;
            iO0o.II(iI2 == null ? IO_I.I1lO("\u124b\u12bc\u129d", 4726) : iI2.II1o + IO_I.I1lO("\u125e", 4726) + iI2.I1l + IO_I.I1lO("\u125f\u12b5\u12df\u12bb\u1287\u1331", 4726) + iII.lO1);
        }
        this.IIII.II(iO0o);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void II1o(int n) {
        IOoI iOoI = this.II;
        synchronized (iOoI) {
            this.Ill_(n);
        }
    }

    private void Ill_(int n) {
        Object object;
        I0Io.II iI;
        if (n < 0 || n >= this.III_.size()) {
            this.II.IIol(IO_I.I1lO("\u123d\u12fd\u1240\u12bd\u1295\u1331\u1344\u1327\u0dad\u13ad\u13d8\u13a3\u0d1b\u146a\u1408\u142f\u140f\u0a42\u14ca", 4726));
            return;
        }
        III iII = (III)this.III_.elementAt(n);
        I0Io.II iI2 = iI = iII.lOlo >= 0 ? I0Io.II(iII.lOlo) : null;
        if (iI == null || iII.status < 3 || iII.status > 5) {
            this.II.IIol(IO_I.I1lO("\u123d\u12fd\u1240\u12bd\u1295\u1331\u1344\u1327\u0dad\u13ad\u13d8\u13a3\u0d1b\u146a\u1408\u142f\u140f\u0a42\u14ca", 4726));
            return;
        }
        if (!this.IIII.II01(iII.lOlo)) {
            return;
        }
        int n2 = 200;
        int n3 = 300;
        if (iI.III.length > 0) {
            n2 = iI.III[0].I1;
            n3 = iI.III[0].I1I;
        } else if (iI.II.length > 0) {
            object = iI.II[0];
            n2 = (((I0Io.IIIl)object).__1o + ((I0Io.IIIl)object).___I) / 2;
            n3 = ((I0Io.IIIl)object).___l;
        }
        object = this.IIII.II;
        ((IOol)object).lO1 = iII.lO1;
        this.IIII.III_(iII.lOlo, n2, n3);
    }

    synchronized boolean IIIl(String string, boolean bl) {
        IO_I.I___();
        for (int i = 0; i < this.III_.size(); ++i) {
            if (!((III)this.III_.elementAt((int)i)).I0o1) continue;
            return false;
        }
        III iII = this.II(string, null, 0);
        if (iII == null) {
            return false;
        }
        iII.I0o1 = true;
        iII.I0o_ = bl;
        iII.I0ol = false;
        IOol iOol = this.IIII.II;
        iII.lO1o = iOol.lOlo;
        iII.lO_ = iOol.lO1;
        iII.status = 1;
        iII.I1ll = System.currentTimeMillis();
        this.IIII.II(new IO0o(-73).II(18).II(0));
        return true;
    }

    synchronized boolean Ill0() {
        IO_I.I___();
        for (int i = 0; i < this.III_.size(); ++i) {
            if (!((III)this.III_.elementAt((int)i)).I0o1) continue;
            return false;
        }
        III iII = this.II(IO_I.I1lO("\u1221\u12dd\u12fd\u1280", 4726), null, 0);
        if (iII == null) {
            return false;
        }
        iII.I0o1 = true;
        iII.I0o_ = false;
        iII.I0ol = false;
        iII.lO_I = this.IIII.II._11I + 1;
        IOol iOol = this.IIII.II;
        iII.lO1o = iOol.lOlo;
        iII.lO_ = iOol.lO1;
        iII.status = 1;
        iII.I1ll = System.currentTimeMillis();
        this.IIII.II(new IO0o(-73).II(18).II(0));
        return true;
    }

    private void III0(III iII, long l) {
        IOol iOol = this.IIII.II;
        if (!this.II(iII)) {
            this.II_(iII);
            return;
        }
        if (iOol.llIl <= 0) {
            this.II(iII, IO_I.I1lO("\u123a\u12e0\u12cd\u0c14\u129c\u1331\u1344\u0de2\u131e\u13ad\u13d8\u13a2\u0d55\u1479\u1408\u1556\u140f", 4726));
            this.II(iII, 0);
            iII.status = 4;
            iII.I11I = l;
            return;
        }
        if (iII.lOl0 == 0) {
            this.II(iII, 5);
        }
        this.IIIl(iII, l);
        if (l - iII.I111 >= 30000L) {
            iII.I111 = l;
            if (iII.llIl > 0 && iII.llIl < iII.lOlO) {
                iII.llIl = Math.min(iII.lOlO, iII.llIl + iII.lOlO / 5);
                this.IIII.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
            }
        }
        if (iII.II.lIlI.equals(IO_I.I1lO("\u123d\u12d4\u12e6\u129a\u12bc", 4726)) && l - iII.I11_ > 5000L) {
            iII.I11_ = l;
            this.IIII(iII, iOol.I1 + (this.IIIl.nextBoolean() ? 1 : -1) * (20 + this.IIIl.nextInt(61)), iII.I1I);
        }
        this.III_(iII, l);
    }

    private void IIIo(III iII, long l) {
        IOol iOol = this.IIII.II;
        if (!this.II(iII)) {
            this.II_(iII);
            return;
        }
        if (iII.I11I == 0L) {
            iII.I11I = l;
        }
        if (iII.II.lIlI.equals(IO_I.I1lO("\u123d\u12d4\u12e6\u129a\u12bc", 4726)) && l - iII.I11_ > 1500L) {
            iII.I11_ = l;
            this.III(iII, iOol.I1, iOol.I1I);
        }
        if (l - iII.I11I > (long)(iII.II.lIlI.equals(IO_I.I1lO("\u122f\u12d4\u12fe\u129a\u12a0\u135e", 4726)) ? 15000 : (iII.II.lIlI.equals(IO_I.I1lO("\u1221\u12dd\u12fd\u1280", 4726)) ? 1000 : 5000))) {
            this.II_(iII);
        }
    }

    private void II1o(III iII) {
        iII.llIl = 0;
        if (iII.II != null) {
            iII.II.IoOo = true;
        }
        this.IIII.II(new IO0o(-8).IIII(iII.I1l).II(0).III(iII.I1).III(iII.I1I));
        this.II(iII, 0);
        if (iII.II.Ill0.length > 0) {
            String string = iII.II.Ill0[0];
            this.II(iII, string.substring(string.lastIndexOf(124) + 1));
        }
        iII.status = 4;
        iII.I11I = System.currentTimeMillis();
        if (iII.II.lIlI.equals(IO_I.I1lO("\u1221\u12dd\u12fd\u1280", 4726))) {
            this.IIII.II._11I = iII.lO_I;
            this.IIII.II._11l = (int)Math.min(Integer.MAX_VALUE, System.currentTimeMillis() - iII.I11);
            this.II.IIol(IO_I.I1lO("\u1234\u0c34\u12da\u12f3\u13e3\u13f2\u1310\u133b\u1306\u0d22\u13c2\u13ac\u13ca", 4726) + iII.II1o + IO_I.I1lO("\u1257", 4726));
            this.IIII.I__O();
        } else if (iII.I0o_) {
            ++this.IIII.II._lO_;
            this.II.IIol(IO_I.I1lO("\u1234\u0c34\u12da\u12f3\u13e3\u13f2\u1310\u133b\u1306\u0d22\u13c2\u13ac\u13ca", 4726) + iII.II1o + IO_I.I1lO("\u1257", 4726));
            this.IIII.I__O();
        }
    }

    private void II_(III iII) {
        this.II11(iII);
        iII.lOlo = -1;
        iII.I0oO = true;
        iII.status = 0;
        this.IIII.II(new IO0o(-73).II(18).II(1));
    }

    synchronized String IIll(String string) {
        III iII = null;
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII2 = (III)this.III_.elementAt(i);
            if (!iII2.II.lIlI.equalsIgnoreCase(string) || iII2.II != null || iII != null && (iII.status == 0 || iII2.status != 0)) continue;
            iII = iII2;
        }
        if (iII == null && string.equalsIgnoreCase(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726)) && (iII = this.II(IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u131d\u1321\u13c1\u13f5", 4726), null, 0)) != null) {
            iII.IoIo = true;
        }
        if (iII == null) {
            return IO_I.I1lO("\u123d\u12fd\u12db\u12bd\u1295\u1331\u1353\u1320\u134e\u13ef\u13c3\u13b8\u1399\u1429", 4726) + string;
        }
        IOol iOol = this.IIII.II;
        if (iII.I0oI) {
            this.II11(iII);
        }
        iII.lOlo = -1;
        iII.lOl_ = -1;
        iII.lO1o = iOol.lOlo;
        iII.lO_ = iOol.lO1;
        iII.status = 1;
        return IO_I.I1lO("\u1232\u12f4\u1294\u12b4\u129d\u1378\u1310", 4726) + iII.II.lIlI + IO_I.I1lO("\u1256\u12f1\u12d1\u12bd\u12d2\u137c\u1351\u133f\u134e", 4726) + iOol.lOlo;
    }

    synchronized String IIl_() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.III_.size(); ++i) {
            III iII = (III)this.III_.elementAt(i);
            if (iII.II != null || iII.lOlo < 0) continue;
            I0Io.II iI = I0Io.II(iII.lOlo);
            stringBuffer.append(iII.II.lIlI).append(IO_I.I1lO("\u1256\u12d5", 4726)).append(iI == null ? IO_I.I1lO("\u1249", 4726) : iI.II1o).append(IO_I.I1lO("\u1256\u12fe\u12dc\u12a6\u12d2", 4726)).append(iII.lO1).append('\n');
        }
        return stringBuffer.length() == 0 ? IO_I.I1lO("\u123d\u12fd\u12db\u12bd\u1295\u1331\u1353\u1320\u134e\u13ef\u13c3\u13b8\u1399\u1429\u1446\u1426\u1409\u14a5\u14c0\u14a2\u148c\u1566\u1500\u1547\u152b\u151c\u15e8\u159b\u15b2\u1590\u167d\u1659", 4726) : stringBuffer.toString();
    }

    static {
        IIIl = new Hashtable();
        III1 = new Hashtable();
        III_ = new Hashtable();
        IlIO = new String[]{IO_I.I1lO("\u1222\u12dc\u12f1\u1286\u12ad\u1355\u137f\u1306\u1331\u13d9\u13fe\u139e\u13a5\u1447\u146f", 4726), IO_I.I1lO("\u1222\u12dc\u12f1\u1286\u12ad\u1355\u137f\u1306\u1331\u13d9\u13fe\u139e\u13a5\u1447\u146f\u1418\u1428\u14c8", 4726), IO_I.I1lO("\u1234\u12da\u12fe\u1292\u12b1\u135a", 4726), IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u1300\u1324\u13cc\u13ef\u1380", 4726), IO_I.I1lO("\u123d\u12dc\u12fa\u1294\u12ad\u135a\u137f\u1301\u1329", 4726), IO_I.I1lO("\u122e\u12d0\u12fa\u128c\u12b0\u135e\u136f\u1307\u133b\u13c3\u13eb", 4726), IO_I.I1lO("\u1225\u12dc\u12f1\u1286\u12ad\u1353\u137f\u1310\u1326\u13d8\u13e2\u138c", 4726), IO_I.I1lO("\u1230\u12dc\u12f0\u1296", 4726), IO_I.I1lO("\u1237\u12db\u12f0\u1281\u12bd\u1358\u1374\u1310\u135f\u13b9", 4726), IO_I.I1lO("\u1232\u12c7\u12eb\u1298\u12bd\u1343\u1375", 4726), IO_I.I1lO("\u1235\u12c0\u12f9\u1291\u12b7\u1343", 4726), IO_I.I1lO("\u1235\u12da\u12fb\u129f\u12b7\u1343", 4726), IO_I.I1lO("\u1234\u12d9\u12f5\u1290\u12b9\u134e\u1377\u1300\u1325\u13d8", 4726), IO_I.I1lO("\u1234\u12d9\u12f5\u1290\u12b9\u134e\u1377\u1300\u1325\u13d8", 4726), IO_I.I1lO("\u1231\u12da\u12f8\u1297\u12b7\u135f\u136f\u1309\u133c\u13c4\u13e9\u1391\u13ab", 4726), IO_I.I1lO("\u1234\u12d4\u12f6\u128a", 4726), IO_I.I1lO("\u1225\u12da\u12fd\u128c\u12ba\u1354\u1373\u1310\u133f\u13d8\u13f5\u1385\u13db", 4726), IO_I.I1lO("\u1225\u12da\u12fd\u128c\u12ba\u1354\u1373\u1310\u133f\u13d8\u13f5\u1385\u13db", 4726)};
        IlI0 = new String[]{IO_I.I1lO("\u1222\u12d4\u12e1\u128c\u12a2\u1350\u1369\u1310\u133e\u13cc\u13f5\u1394\u13ae\u1446\u1466\u1400\u1439\u14cb\u14e5\u148e\u14bd\u154a\u1561\u156d\u1517\u1533", 4726), IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371", 4726), IO_I.I1lO("\u1234\u12c0\u12fd\u128c\u12b0\u1344\u1379", 4726), IO_I.I1lO("\u1234\u12c0\u12fd\u128c\u12b0\u1344\u1379\u1310\u135c", 4726), IO_I.I1lO("\u122f\u12d4\u12f7\u129c\u12bc", 4726), IO_I.I1lO("\u122f\u12d4\u12eb\u1290\u12bd\u135f", 4726), IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371\u1310\u135c", 4726), IO_I.I1lO("\u123b\u12d4\u12f6\u1286\u12ad\u1320\u1302\u1307", 4726), IO_I.I1lO("\u1222\u12d4\u12fa\u128c\u12b0\u1358\u137e\u1307\u1331\u13b8", 4726), IO_I.I1lO("\u1235\u12dd\u12fd\u1296\u12bc\u134e\u1372\u1306\u1320\u13c5\u13f3\u13fe", 4726), IO_I.I1lO("\u1232\u12da\u12fd\u128c\u12a6\u1343\u1365\u1300\u1320\u13ca\u13f3\u13fe", 4726)};
        IlIo = new String[]{IO_I.I1lO("\u123d\u12c0\u12ff\u1286", 4726), IO_I.I1lO("\u123b\u12d4\u12e4\u128c\u12b6\u1350\u1365\u1310\u132a\u13c4\u13e2\u1383", 4726), IO_I.I1lO("\u1224\u12d4\u12f9\u1291\u12bd", 4726), IO_I.I1lO("\u1237\u12db\u12eb\u1287\u12a0\u135e\u137d\u1310\u1322", 4726), IO_I.I1lO("\u1239\u12ca\u12f0\u129c\u12c3", 4726)};
        IIIl = new Object[][]{{IO_I.I1lO("\u123e\u12d4\u12f8\u129f\u12bd\u1346\u1375\u130a\u1320", 4726), IO_I.I1lO("\u1234\u12dc\u12f9\u1292", 4726), 6}, {IO_I.I1lO("\u123e\u12d4\u12f8\u129f\u12bd\u1346\u1375\u130a\u1320", 4726), IO_I.I1lO("\u123b\u12d4\u12e0\u1281\u12bd\u1358", 4726), 6}, {IO_I.I1lO("\u123e\u12d4\u12f8\u129f\u12bd\u1346\u1375\u130a\u1320", 4726), IO_I.I1lO("\u1232\u12da\u12fd", 4726), 6}, {IO_I.I1lO("\u123e\u12d4\u12f8\u129f\u12bd\u1346\u1375\u130a\u1320", 4726), IO_I.I1lO("\u122c\u12da\u12f9\u1291\u12bb\u1354", 4726), 6}, {IO_I.I1lO("\u1235\u12dd\u12e6\u129a\u12a1\u1345\u137d\u130e\u133d", 4726), IO_I.I1lO("\u1239\u12db\u12f3\u128c\u12b5\u1358\u1371\u1310\u1320\u13c2\u13e9\u1387", 4726), 3}, {IO_I.I1lO("\u123e\u12c0\u12fa\u1294\u12ad\u1347\u1365\u1300\u1320\u13ca", 4726), IO_I.I1lO("\u1222\u12dd\u12e1\u128a\u12ad\u1345\u1379\u1301\u1326", 4726), 3}, {IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1364\u1307\u133b", 4726), IO_I.I1lO("\u123d\u12dd\u12fd\u1297\u12bd\u1345", 4726), 5}, {IO_I.I1lO("\u1222\u12c7\u12e1\u129d\u12b5\u134e\u1364\u1307\u133b", 4726), IO_I.I1lO("\u1238\u12d2\u12e1\u128a\u12b7\u1345\u1364\u1307\u132f\u13c3", 4726), 3}, {IO_I.I1lO("\u123a\u12c0\u12fa\u1292\u12a0\u134e\u137e\u130a\u1339\u13d2\u13f5\u138e\u13ab\u145b", 4726), IO_I.I1lO("\u1234\u12d0\u12eb\u129d\u12b3", 4726), 3}};
        Ill = new String[]{IO_I.I1lO("\u1234\u12d9\u12f5\u1290\u12b9\u134e\u1377\u1300\u1325\u13d8", 4726), IO_I.I1lO("\u1235\u12da\u12fb\u129f\u12b7\u1343", 4726), IO_I.I1lO("\u1235\u12c0\u12f9\u1291\u12b7\u1343", 4726), IO_I.I1lO("\u1225\u12dc\u12f1\u1286\u12ad\u1353\u137f\u1310\u1326\u13d8\u13e2\u138c", 4726)};
        II1l = new int[][]{{423, 77, 5, 20}, {424, 77, 5, 20}, {425, 77, 5, 20}, {426, 77, 5, 20}, {427, 77, 5, 20}, {428, 77, 5, 20}, {429, 77, 1, 5}, {430, 77, 1, 5}, {431, 77, 1, 5}, {432, 77, 1, 5}, {433, 77, 1, 5}};
        IllI = new String[]{IO_I.I1lO("\u1234\u12c0\u12fe\u129a\u12bc", 4726), IO_I.I1lO("\u123d\u12da\u12f3\u1286", 4726), IO_I.I1lO("\u122c\u12d4\u12fa\u1294\u12ab\u1350", 4726), IO_I.I1lO("\u1234\u12dc\u12f0\u129c", 4726), IO_I.I1lO("\u1234\u12da\u12fe\u1292\u12b1\u135a", 4726), IO_I.I1lO("\u1225\u12c0\u12e4\u1296\u12a0\u134e\u1372\u1300\u1324\u13cc\u13ef\u1380", 4726), IO_I.I1lO("\u1225\u12da\u12eb\u12e7\u12ad\u135f\u137d", 4726), IO_I.I1lO("\u1225\u12da\u12eb\u12e0\u12ad\u135f\u137d", 4726), IO_I.I1lO("\u1225\u12da\u12eb\u12e1\u12ad\u135f\u137d", 4726), IO_I.I1lO("\u1225\u12da\u12eb\u12e2\u12ad\u135f\u137d", 4726), IO_I.I1lO("\u1222\u12dc\u12f1\u1286\u12ad\u1355\u137f\u1306\u1331\u13d9\u13fe\u139e\u13a5\u1447\u146f\u1418\u1428\u14c8", 4726)};
        Illl = new String[]{IO_I.I1lO("\u1234\u12c0\u12fd\u128c\u12b0\u1344\u1379", 4726), IO_I.I1lO("\u1234\u12c0\u12fd\u128c\u12b0\u1344\u1379\u1310\u135c", 4726), IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371", 4726), IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371\u1310\u135c", 4726), IO_I.I1lO("\u1232\u12c7\u12f5\u1291\u12a7\u1343\u1371\u1310\u135d", 4726), IO_I.I1lO("\u122f\u12d4\u12f7\u129c\u12bc", 4726), IO_I.I1lO("\u122f\u12d4\u12eb\u1290\u12bd\u135f", 4726), IO_I.I1lO("\u123b\u12d4\u12f6\u1286\u12ad\u1320\u1302\u1307", 4726), IO_I.I1lO("\u1235\u12d4\u12f0\u129a\u12b1", 4726), IO_I.I1lO("\u1231\u12da\u12ff\u1286", 4726)};
        II11 = new int[][]{{230, 231, 232, 234, 235, 236, 238, 239, 240, 242, 243, 244, 246, 247, 248, 250, 251, 252, 266, 267, 268, 270, 271, 272, 274, 275, 276}, {254, 255, 256, 258, 259, 260, 262, 263, 264, 278, 279, 280}};
        Ill1 = new String[]{IO_I.I1lO("\u1224\u12d0\u12e7\u1287", 4726), IO_I.I1lO("\u1224\u12d0\u12e7\u1283\u12b3\u1346\u137e", 4726), IO_I.I1lO("\u123c\u12da\u12fd\u129d\u12ad\u135c\u1371\u131f", 4726), IO_I.I1lO("\u1235\u12dd\u12f5\u1287\u12ad\u1342", 4726), IO_I.I1lO("\u1237\u12d3\u12ff", 4726), IO_I.I1lO("\u1237\u12d6\u12e0\u129a\u12a4\u1354", 4726), IO_I.I1lO("\u1232\u12dc\u12f1", 4726), IO_I.I1lO("\u1235\u12dd\u12f5\u1287\u12ad\u1354", 4726), IO_I.I1lO("\u123a\u12d0\u12f5\u1285\u12b7\u134e\u137d\u130e\u133e", 4726)};
    }

    private static /* synthetic */ String I1lO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
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

        II() {
        }
    }

    static final class IIII {
        int I1l;
        String lIlI;
        boolean Iol1;
        String[] Illo;

        IIII() {
        }
    }

    /*
     * Duplicate member names - consider using --renamedupmembers true
     */
    static final class III {
        IIII II;
        int I1l;
        II[] II;
        int lOl_ = -1;
        int status = 0;
        II II;
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
        IOO.IIIO[] II;
        long[] III_;
        int[] I1o0;
        long I1lo;
        III II;
        III[][] II;
        int lO10;
        int lO1o = -1;
        int lO_ = -1;
        IOoI.III II = new IOO.IIIO[0];
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

        III() {
            this.III_ = new long[0];
            this.I1o0 = new int[0];
        }

        boolean Illo() {
            return this.llIl <= 0;
        }
    }
}

