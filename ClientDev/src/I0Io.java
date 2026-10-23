package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import nrolite.Res;

public final class I0Io {
    public static II[] II;
    public static int[] I_oO;
    private static boolean IlO0;

    private static boolean III_(String string, String string2) {
        if (!I0Io.I1o1("\ue5ef\ue5cf\ue5ae", 58762).equals(string)) {
            return false;
        }
        int n = string2.indexOf(46);
        if (n <= 0) {
            return false;
        }
        try {
            int n2 = Integer.parseInt(string2.substring(0, n));
            return n2 == 53 || n2 == 54 || n2 >= 72 && n2 <= 77;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public static synchronized void I___() {
        if (IlO0) {
            return;
        }
        byte[] byArray = Res.read(I0Io.I1o1("\ue5e7\ue5c8\ue5b8\ue594\ue628\ue647\ue62d\ue60d", 58762));
        if (byArray == null) {
            throw new RuntimeException(I0Io.I1o1("\ue5fe\ue5c1\ue5a1\ue582\ue673\ue605\ue629\ue602\ue6f2\ue6d2\ue6ee\ue6bd\ue697\ue773", 58762));
        }
        try {
            int n;
            int n2;
            int n3;
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            int n4 = dataInputStream.readShort();
            II = new II[n4];
            for (n3 = 0; n3 < n4; ++n3) {
                String[] stringArray;
                int n5;
                int n6;
                int n7;
                II iI = new II();
                iI.I1l = dataInputStream.readShort();
                iI.II1o = dataInputStream.readUTF();
                iI.IoI_ = dataInputStream.readByte();
                iI.__1l = dataInputStream.readByte();
                iI.l1o_ = dataInputStream.readByte();
                iI.__11 = dataInputStream.readByte();
                iI.__1_ = dataInputStream.readByte();
                iI.__1O = dataInputStream.readByte();
                iI.__10 = dataInputStream.readByte();
                n2 = dataInputStream.readByte();
                iI.var_I0Io$IIIl_arr_II = new IIIl[n2];
                for (n7 = 0; n7 < n2; ++n7) {
                    IIIl iIIl = new IIIl();
                    iIIl.II1o = dataInputStream.readUTF();
                    iIIl.__1o = dataInputStream.readShort();
                    iIIl.___ = dataInputStream.readShort();
                    iIIl.___I = dataInputStream.readShort();
                    iIIl.___l = dataInputStream.readShort();
                    iIIl.lIl = dataInputStream.readByte() != 0;
                    iIIl.lIlI = dataInputStream.readByte() != 0;
                    iIIl.___1 = dataInputStream.readShort();
                    iIIl.____ = dataInputStream.readShort();
                    iIIl.___O = dataInputStream.readShort();
                    iI.var_I0Io$IIIl_arr_II[n7] = iIIl;
                }
                n7 = dataInputStream.readByte();
                iI.III = new III[n7];
                for (n6 = 0; n6 < n7; ++n6) {
                    III iII = new III();
                    iII.l0o1 = dataInputStream.readByte();
                    iII.lOl_ = dataInputStream.readByte();
                    iII.llIl = dataInputStream.readInt();
                    iII.I1 = dataInputStream.readShort();
                    iII.I1I = dataInputStream.readShort();
                    iI.III[n6] = iII;
                }
                n6 = dataInputStream.readByte();
                iI.var_I0Io$IIII_arr_II = new IIII[n6];
                for (n5 = 0; n5 < n6; ++n5) {
                    IIII iIII = new IIII();
                    iIII.I1l = dataInputStream.readByte();
                    iIII.I1 = dataInputStream.readShort();
                    iIII.I1I = dataInputStream.readShort();
                    iI.var_I0Io$IIII_arr_II[n5] = iIII;
                }
                n5 = dataInputStream.readShort();
                iI.Il01 = new String[n5];
                iI.Il0_ = new String[n5];
                int n8 = 0;
                for (int i = 0; i < n5; ++i) {
                    String string;
                    stringArray = dataInputStream.readUTF();
                    if (I0Io.III_((String)stringArray, string = dataInputStream.readUTF())) continue;
                    iI.Il01[n8] = stringArray;
                    iI.Il0_[n8] = string;
                    ++n8;
                }
                if (n8 < n5) {
                    String[] stringArray2 = new String[n8];
                    stringArray = new String[n8];
                    System.arraycopy(iI.Il01, 0, stringArray2, 0, n8);
                    System.arraycopy(iI.Il0_, 0, stringArray, 0, n8);
                    iI.Il01 = stringArray2;
                    iI.Il0_ = stringArray;
                }
                I0Io.II[n3] = iI;
            }
            n3 = dataInputStream.readShort();
            I_oO = new int[n3];
            for (n = 0; n < n3; ++n) {
                I0Io.I_oO[n] = dataInputStream.readShort();
            }
            if (II.length > 154 && II[154] != null) {
                n = 0;
                for (n2 = 0; n2 < I0Io.II[154].var_I0Io$IIII_arr_II.length; ++n2) {
                    if (I0Io.II[154].var_I0Io$IIII_arr_II[n2].I1l != 56) continue;
                    n = 1;
                }
                if (n == 0) {
                    IIII[] iIIIArray = new IIII[I0Io.II[154].var_I0Io$IIII_arr_II.length + 1];
                    System.arraycopy(I0Io.II[154].var_I0Io$IIII_arr_II, 0, iIIIArray, 0, I0Io.II[154].var_I0Io$IIII_arr_II.length);
                    IIII iIII = new IIII();
                    iIII.I1l = 56;
                    iIII.I1 = 725;
                    iIII.I1I = 312;
                    iIIIArray[iIIIArray.length - 1] = iIII;
                    I0Io.II[154].var_I0Io$IIII_arr_II = iIIIArray;
                }
            }
            IlO0 = true;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException.toString());
        }
    }

    public static II II(int n) {
        I0Io.I___();
        for (int i = 0; i < II.length; ++i) {
            if (I0Io.II[i].I1l != n) continue;
            return II[i];
        }
        return null;
    }

    private static /* synthetic */ String I1o1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    public static final class II {
        public int I1l;
        public int IoI_;
        public int __1l;
        public int l1o_;
        public int __11;
        public int __1_;
        public int __1O;
        public int __10;
        public String II1o;
        public IIIl[] var_I0Io$IIIl_arr_II;
        public III[] III;
        public IIII[] var_I0Io$IIII_arr_II;
        public String[] Il01;
        public String[] Il0_;
    }

    public static final class IIIl {
        public String II1o;
        public int __1o;
        public int ___;
        public int ___I;
        public int ___l;
        public int ___1;
        public int ____;
        public int ___O;
        public boolean lIl;
        public boolean lIlI;
    }

    public static final class III {
        public int l0o1;
        public int lOl_;
        public int llIl;
        public int I1;
        public int I1I;
    }

    public static final class IIII {
        public int I1l;
        public int I1;
        public int I1I;
    }
}

