/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import nrolite.Res;

public final class I0I1 {
    private static short[] IIlO;
    private static Hashtable IIl;
    private static boolean IlO0;
    private static Hashtable IIlI;

    private I0I1() {
    }

    private static synchronized void I___() {
        if (IlO0) {
            return;
        }
        IlO0 = true;
        IIl = new Hashtable();
        try {
            int n;
            int n2;
            byte[] byArray = Res.read(I0I1.I10o("\u11fc\u11c2\u11ab\u1195\u1268\u1242\u1236\u1204\u12f3\u12b1\u12dc\u12b4\u1292", 4488));
            if (byArray == null) {
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            int n3 = dataInputStream.readShort();
            IIlO = new short[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                I0I1.IIlO[n2] = dataInputStream.readShort();
            }
            n2 = dataInputStream.readShort();
            for (n = 0; n < n2; ++n) {
                String string = dataInputStream.readUTF();
                IIl.put(string, new Integer(dataInputStream.readByte()));
            }
            n = dataInputStream.readShort();
            for (int i = 0; i < n; ++i) {
                short s = dataInputStream.readShort();
                IIlI.put(new Integer(s), new int[]{dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort()});
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static int IIoO(int n) {
        I0I1.I___();
        return IIlO != null && n >= 0 && n < IIlO.length ? IIlO[n] : -1;
    }

    public static int[] III_(int n) {
        I0I1.I___();
        return (int[])IIlI.get(new Integer(n));
    }

    public static Vector II() {
        I0I1.I___();
        Vector<Integer> vector = new Vector<Integer>();
        Enumeration enumeration = IIlI.keys();
        while (enumeration.hasMoreElements()) {
            Integer n = (Integer)enumeration.nextElement();
            int[] nArray = (int[])IIlI.get(n);
            if (nArray[0] < 0 || nArray[1] < 0 || nArray[2] < 0 || nArray[2] == 194) continue;
            vector.addElement(n);
        }
        return vector;
    }

    public static int IIIl(String string) {
        I0I1.I___();
        Integer n = (Integer)IIl.get(string);
        return n == null ? 0 : n;
    }

    static {
        IIlI = new Hashtable();
    }

    private static /* synthetic */ String I10o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

