package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import nrolite.Res;

final class IO_O {
    private static boolean IlO0;
    private static II[] II;
    private static int[] I_I;
    private final IO0 var_IO0_III_;
    private final IOo_ var_IOo__III_;
    private int lOo1;
    private final Vector IIIo = new Vector();

    IO_O(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_III_ = iO0;
        this.var_IOo__III_ = iOo_;
    }

    static synchronized void I___() {
        if (IlO0) {
            return;
        }
        IlO0 = true;
        try {
            int n;
            byte[] byArray = Res.read(IO_O.I11I("\uc00f\uc0e4\uc0c6\uc0a1\uc087\uc165\uc144\uc16c\uc103\uc1e9\uc1f1", 49257));
            if (byArray == null) {
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            int n2 = dataInputStream.readUnsignedShort();
            II = new II[n2];
            for (n = 0; n < n2; ++n) {
                II iI = new II();
                iI.I1l = dataInputStream.readInt();
                iI.II1o = dataInputStream.readUTF();
                iI.lOo_ = dataInputStream.readInt();
                iI.lOoO = dataInputStream.readInt();
                iI.lOo0 = dataInputStream.readShort();
                iI.I_II = new int[dataInputStream.readByte()];
                for (int i = 0; i < iI.I_II.length; ++i) {
                    iI.I_II[i] = dataInputStream.readShort();
                }
                IO_O.II[n] = iI;
            }
            I_I = new int[dataInputStream.readByte()];
            for (n = 0; n < I_I.length; ++n) {
                IO_O.I_I[n] = dataInputStream.readByte();
            }
        }
        catch (IOException iOException) {
            System.out.println(IO_O.I11I("\uc032\uc0e4\uc0ce\uc0b2\uc080\uc159\uc103\uc124\uc10d\uc1e1\uc1f8\uc1dc\uc1bc\uc19b\uc235\uc258\uc230\uc216\uc2b7\uc2da\uc2ba\uc29d\uc329\uc312", 49257) + iOException);
        }
    }

    static II II(int n) {
        IO_O.I___();
        for (int i = 0; i < II.length; ++i) {
            if (IO_O.II[i].I1l != n) continue;
            return II[i];
        }
        return null;
    }

    private boolean II_O(int n) {
        for (int i = 0; i < I_I.length; ++i) {
            if (I_I[i] != n) continue;
            return true;
        }
        return false;
    }

    boolean II(int n, DataInputStream dataInputStream) throws IOException {
        IO_O.I___();
        switch (n) {
            case -46: {
                this.III_(dataInputStream);
                return true;
            }
            case -47: {
                this.IIOo(dataInputStream.readUTF());
                return true;
            }
            case -49: {
                this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc022\uc0e0\uc053\uc0a8\uc082\uc124\uc157\uc12a\udfa2\uc1a0\uc1eb\uc1d6\udf2c\uc19f\uc23b\uc252\uc230\udcbf\uc2f9", 49257));
                return true;
            }
            case -50: {
                dataInputStream.readInt();
                this.lIl0();
                return true;
            }
            case -51: {
                this.IIIO(dataInputStream);
                return true;
            }
            case -54: {
                this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc022\uc0e0\uc053\uc0a8\uc082\uc124\uc157\uc12a\udfa2\uc1a0\uc1eb\uc1d6\udf2c\uc19f\uc23b\uc252\uc230\udcbf\uc2f9", 49257));
                return true;
            }
            case -55: {
                this.lIlo();
                return true;
            }
            case -56: {
                this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc022\uc0e0\uc053\uc0a8\uc082\uc124\uc157\uc12a\udfa2\uc1a0\uc1eb\uc1d6\udf2c\uc19f\uc23b\uc252\uc230\udcbf\uc2f9", 49257));
                return true;
            }
            case -57: {
                this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc022\uc0e0\uc053\uc0a8\uc082\uc124\uc157\uc12a\udfa2\uc1a0\uc1eb\uc1d6\udf2c\uc19f\uc23b\uc252\uc230\udcbf\uc2f9", 49257));
                return true;
            }
            case -62: {
                this.Il1I(dataInputStream.readUnsignedByte());
                return true;
            }
            case -63: {
                this.Il1l(dataInputStream.readUnsignedByte());
                return true;
            }
        }
        return false;
    }

    private void III_(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        if (by == 1 || by == 3) {
            this.lIl_();
        } else if (by == 2) {
            byte by2 = dataInputStream.readByte();
            String string = dataInputStream.readUTF();
            this.IIII(by2, string);
        } else if (by == 4) {
            byte by3 = dataInputStream.readByte();
            String string = dataInputStream.readUTF();
            if (string.length() > 0) {
                this.IIO0(string);
            } else {
                this.Il1(by3);
            }
        }
    }

    private void lIl_() {
        IO0o iO0o = new IO0o(-46).II(1).II(I_I.length);
        for (int i = 0; i < I_I.length; ++i) {
            II iI = IO_O.II(I_I[i]);
            if (iI == null) {
                iO0o.II(I_I[i]).II("").IIII(-1).IIII(-1);
                continue;
            }
            iO0o.II(iI.I1l).II(iI.II1o).IIII(iI.lOo_).IIII(iI.lOoO);
        }
        this.var_IOo__III_.II(iO0o);
    }

    private static String III0(long l) {
        String string = String.valueOf(l);
        String string2 = "";
        for (int i = 0; i < string.length(); ++i) {
            if (i > 0 && (string.length() - i) % 3 == 0) {
                string2 = string2 + IO_O.I11I("\uc047", 49257);
            }
            string2 = string2 + string.charAt(i);
        }
        return string2;
    }

    private boolean II(II iI) {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iI.lOo_ > 0 && iOol.Il11 < (long)iI.lOo_) {
            this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc02b\ude29\uc0c9\uc0e6\uc08e\uc16c\uc1d7\uc12c\uc106\uc1a0\uc08e\udf59\uc1fd\uc18a\uc2fb\uc254\uc23e\uc254\uc2b7\uc2d5\uc227\uc29a\uc333\uc346\uc339\uc319\udd30\uc3db\uc3ed", 49257) + IO_O.III0((long)iI.lOo_ - iOol.Il11) + IO_O.I11I("\uc049\uc0fe\uc047\uc0a8\uc082", 49257));
            return false;
        }
        if (iI.lOoO > 0 && iOol.lOoO < iI.lOoO) {
            this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc02b\ude29\uc0c9\uc0e6\uc08e\uc16c\uc1d7\uc12c\uc106\uc1a0\uc08e\udf59\uc1fd\uc192\uc27c\udcf7\uc23a\uc254\uc2b7\uc2d5\uc227\uc29a\uc333\uc346\uc339\uc319\udd30\uc3db\uc3ed", 49257) + (iI.lOoO - iOol.lOoO) + IO_O.I11I("\uc049\uc0e6\uc0c0\ude0b\uc086", 49257));
            return false;
        }
        if (iI.lOo_ > 0) {
            iOol.Il11 -= (long)iI.lOo_;
        }
        if (iI.lOoO > 0) {
            iOol.lOoO -= iI.lOoO;
        }
        this.var_IO0_III_.IIIl.l1_();
        return true;
    }

    private void IIII(int n, String string) {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iOol._lOO != 0) {
            this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc022\uc0e0\uc053\uc0a8\uc082\uc124\uc157\uc12a\udfa2\uc1a0\uc1eb\uc1d6\udf2c\uc19f\uc23b\uc252\uc230\udcbf\uc2f9", 49257));
            return;
        }
        if ((string = string.trim()).length() > 30) {
            this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc03d\uc062\uc0c9\uc0e6\uc087\uc165\uc14d\uc125\uc141\uc1e8\udf46\uc1d7\uc1fd\uc197\uc273\uc2ce\uc237\uc21f\uc2b7\uc3a7\uc365\udc17\uc370\uc312\uc320\uc305\uc36e\uc38e\uc3fe\uc3dc\uc42b\uc441\uc4b4\uc448\uc4f3\uda57", 49257));
            return;
        }
        if (string.length() == 0) {
            this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc03d\uc062\uc0c9\uc0e6\uc087\uc165\uc14d\uc125\uc141\uc1e8\udf46\uc1d7\uc1fd\uc197\uc273\uc2ce\uc237\uc21f\uc2b7\uc3a7\uc365\udc17\uc370\uc312\uc240\uddb3\uc3af\uc3da\uc3bf\udd3d\uc465\uc44d", 49257));
            return;
        }
        II iI = IO_O.II(n &= 0xFF);
        if (iI == null || !this.II_O(n)) {
            return;
        }
        if (!this.II(iI)) {
            return;
        }
        iOol._lOO = 1;
        iOol.lI_o = string;
        iOol.lIO = "";
        iOol._lO0 = n;
        iOol._lOo = (int)(System.currentTimeMillis() / 1000L);
        iOol._l0 = 0;
        iOol._l0I = 0;
        this.IIIo.removeAllElements();
        this.var_IO0_III_.ll_1();
        this.lIlO();
        this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc02a\uc0e0\uc05d\uc0a5\uc0c5\uc169\udfc8\uc12c\uc106\uc1a0\uc1fd\udf1f\uc1b3\uc1dc\uc30a\uc2d9\uc279\uc20c\udc36\uc2d9\uc2f5\uc296\uc372\uc35c\uc336\uc350\uc3fb\uc3c6\uc32d\uc382\uc463\uc40a\uc42a\uc49c\uc4e9\uc4c1\uc4eb", 49257));
        this.var_IO0_III_.I__O();
    }

    private void IIO0(String string) {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iOol._lOO == 0) {
            return;
        }
        if (string.length() > 250) {
            string = string.substring(0, 250);
        }
        iOol.lIO = string;
        this.lIlO();
        this.var_IO0_III_.I__O();
    }

    private void Il1(int n) {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iOol._lOO == 0 || (n &= 0xFF) == iOol._lO0) {
            return;
        }
        II iI = IO_O.II(n);
        if (iI == null) {
            return;
        }
        if (!this.II(iI)) {
            return;
        }
        iOol._lO0 = n;
        this.var_IO0_III_.ll_1();
        this.lIlO();
        this.var_IO0_III_.I__O();
    }

    private int II_I(int n) {
        IO0l iO0l = this.var_IO0_III_.var_IOol_II.II[n];
        if (iO0l == null || iO0l.II1_()) {
            return 57 + this.var_IO0_III_.var_IOol_II.lOlI * 2 + n;
        }
        return I0I1.IIoO(iO0l.I1l);
    }

    private void II(IO0o iO0o, boolean bl) {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        iO0o.IIII(iOol.I1l).III(iOol.I0).III(-1).III(this.II_I(1)).III(this.II_I(0)).II(iOol.II1o).II(0).II(IO00.IIlI(iOol.IO_l));
        iO0o.IIII(0).IIII(0).IIII(iOol._l0I);
        if (bl) {
            iO0o.IIII(iOol._l0);
        }
        iO0o.IIII(iOol._lOo);
    }

    void lIlO() {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iOol == null) {
            return;
        }
        if (iOol._lOO == 0) {
            this.var_IOo__III_.II(new IO0o(-53).IIII(-1));
            return;
        }
        IO0o iO0o = new IO0o(-53).IIII(iOol._lOO).II(iOol.lI_o).II(iOol.lIO).II(iOol._lO0).II(String.valueOf(iOol.IO_l)).II(iOol.II1o).II(1).II(10).II(0).IIII(0).II(1);
        this.II(iO0o, true);
        iO0o.II(this.IIIo.size());
        for (int i = 0; i < this.IIIo.size(); ++i) {
            this.II(iO0o, (String[])this.IIIo.elementAt(i));
        }
        this.var_IOo__III_.II(iO0o);
    }

    private void II(IO0o iO0o, String[] stringArray) {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        iO0o.II(0).IIII(Integer.parseInt(stringArray[0])).IIII(iOol.I1l).II(iOol.II1o).II(0).IIII(Integer.parseInt(stringArray[2])).II(stringArray[1]).II(0);
    }

    private void IIIO(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iOol._lOO == 0) {
            return;
        }
        if (by == 0) {
            String string = dataInputStream.readUTF();
            String[] stringArray = new String[]{String.valueOf(this.lOo1++), string, String.valueOf((int)(System.currentTimeMillis() / 1000L - 1000000000L))};
            this.IIIo.insertElementAt(stringArray, 0);
            if (this.IIIo.size() > 20) {
                this.IIIo.removeElementAt(this.IIIo.size() - 1);
            }
            IO0o iO0o = new IO0o(-51);
            iO0o.II(0).IIII(Integer.parseInt(stringArray[0])).IIII(iOol.I1l).II(iOol.II1o).II(0).IIII(Integer.parseInt(stringArray[2])).II(string).II(0);
            this.var_IOo__III_.II(iO0o);
        } else if (by == 1) {
            this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc02b\uc0e9\uc0c9\uc0a1\uc0c5\uc16c\udffa\uc12b\uc141\uc1e3\uc1f7\uc00e\uc1bc\uc1dc\uc278\uc2c9\uc279\uc20c\uc2ff\uc256\uc2bb\uc29c\uc333\uc344\uc338\uc39a\uc3e1\uc38e\uc3a6\uc384\uc4ea\uc449\uc469\uc579\uda44\uc486\uc4bd\uc48d\uc56d\uc502\uc450\udbcd\uc50a", 49257));
        } else {
            dataInputStream.readInt();
            this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc022\uc0e0\uc053\uc0a8\uc082\uc124\uc157\uc12a\udfa2\uc1a0\uc1eb\uc1d6\udf2c\uc19f\uc23b\uc252\uc230\udcbf\uc2f9", 49257));
        }
    }

    private void IIOo(String string) {
        boolean bl;
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        IO0o iO0o = new IO0o(-47);
        boolean bl2 = bl = iOol._lOO != 0 && (string.length() == 0 || iOol.lI_o.toLowerCase().indexOf(string.toLowerCase()) >= 0);
        if (!bl) {
            this.var_IOo__III_.II(iO0o.II(0));
            return;
        }
        iO0o.II(1).IIII(iOol._lOO).II(iOol.lI_o).II(iOol.lIO).II(iOol._lO0).II(String.valueOf(iOol.IO_l)).II(iOol.II1o).II(1).II(10).IIII(iOol._lOo);
        this.var_IOo__III_.II(iO0o);
    }

    private void lIl0() {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iOol._lOO == 0) {
            return;
        }
        IO0o iO0o = new IO0o(-50).II(1);
        this.II(iO0o, false);
        this.var_IOo__III_.II(iO0o);
    }

    private void lIlo() {
        if (this.var_IO0_III_.var_IOol_II._lOO == 0) {
            return;
        }
        this.var_IO0_III_.var_IO00_II.ll00();
    }

    void lI1() {
        IOol iOol = this.var_IO0_III_.var_IOol_II;
        if (iOol._lOO == 0) {
            return;
        }
        this.var_IO0_III_.IIIl.IIol(IO_O.I11I("\uc039\uc0e0\ude04\uc0af\uc0c5\uc16a\uc14b\uc0f2\udfbc\uc1ee\uc1f8\uc19e\uc1be\uc194\udcf2\uc259\uc279\uc21a\uc2f6\uc2d8\uc2b2\uc2d4\uc370\uc35a\uddb6\uc350\uc3fb\uc3dc\uc27d\udd37\uc468\uc40a\uc422\uc400\uc4ee\uc486\uc4b7\uda39\uc56a", 49257));
    }

    private void Il1I(int n) {
        II iI = IO_O.II(n);
        if (iI == null) {
            return;
        }
        IO0o iO0o = new IO0o(-62).II(iI.I1l).II(iI.I_II.length + 1).III(iI.lOo0);
        for (int i = 0; i < iI.I_II.length; ++i) {
            iO0o.III(iI.I_II[i]);
        }
        this.var_IOo__III_.II(iO0o);
    }

    private void Il1l(int n) {
        II iI = IO_O.II(n);
        if (iI == null) {
            return;
        }
        IO0o iO0o = new IO0o(-63).II(iI.I1l).II(iI.I_II.length);
        for (int i = 0; i < iI.I_II.length; ++i) {
            iO0o.III(iI.I_II[i]);
        }
        this.var_IOo__III_.II(iO0o);
    }

    static {
        II = new II[0];
        I_I = new int[0];
    }

    private static /* synthetic */ String I11I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    static final class II {
        int I1l;
        int lOo_;
        int lOoO;
        int lOo0;
        String II1o;
        int[] I_II;

        II() {
        }
    }
}

