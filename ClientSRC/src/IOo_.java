/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import nrolite.Res;

public final class IOo_
implements Runnable {
    public static final int _1o1 = 1;
    private final DataInputStream IIII;
    private final DataOutputStream IIIl;
    int _1o_ = 1;
    volatile boolean lIIl;
    public IO0 II1l = new IO0(this);
    static final boolean lII1 = System.getProperty(IOo_.I1Oo("\ub0a3\ub087\ub179\ub149\ub165\ub10e\ub1ec\ub1ca\ub1b2\ub181", 45263)) != null;

    public IOo_(InputStream inputStream, OutputStream outputStream) {
        this.IIII = new DataInputStream(inputStream);
        this.IIIl = new DataOutputStream(outputStream);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block10: while (true) {
            try {
                try {
                    while (true) {
                        byte by = this.IIII.readByte();
                        int n = this.IIII.readUnsignedShort();
                        byte[] byArray = new byte[n];
                        this.IIII.readFully(byArray);
                        try {
                            this.III(by, new DataInputStream(new ByteArrayInputStream(byArray)));
                            continue block10;
                        }
                        catch (Exception exception) {
                            System.out.println(IOo_.I1Oo("\ub094\ub082\ub164\ub158\ub12e\ub137\ub1a9\ub1c4\ub1a8\ub18f\ub225\ub25c\ub236\ub242\ub2ed\ub2d9\ub29f\ub2bd\ub290\ub378\ub31b", 45263) + by + IOo_.I1Oo("\ub0f5\ub0ce", 45263) + exception);
                            exception.printStackTrace();
                            continue;
                        }
                        break;
                    }
                }
                catch (IOException iOException) {
                    this.lIIl = true;
                    try {
                        this.IIIl.close();
                    }
                    catch (IOException iOException2) {}
                    break;
                }
            }
            catch (Throwable throwable) {
                this.lIIl = true;
                try {
                    this.IIIl.close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    private void III(int n, DataInputStream dataInputStream) throws IOException {
        if (lII1) {
            System.out.println(IOo_.I1Oo("\ub094\ub082\ub164\ub158\ub12e\ub137\ub1a9\ub194\ub1ea\ub1c6\ub266\ub249\ub227\ub242", 45263) + n);
        }
        switch (n) {
            case -27: {
                this.l1o1();
                this.II(new IO0o(-74).II(0).IIII(1));
                break;
            }
            case -74: {
                this.I11l(dataInputStream.readByte());
                break;
            }
            default: {
                this.II1l.II(n, dataInputStream);
            }
        }
    }

    private void l1o1() {
        this.II(new IO0o(-27).II(1).II(0).II("").IIII(0).II(0));
    }

    private void I11l(int n) {
        if (n == 1) {
            byte[] byArray = Res.read(IOo_.I1Oo("\ub0bd\ub08b\ub17e\ub103\ub133", 45263) + this._1o_ + IOo_.I1Oo("\ub0e0\ub0b1\ub164\ub142\ub12f\ub10f\ub1f1", 45263));
            boolean bl = false;
            String[] stringArray = byArray == null ? new String[]{} : IOo_.II(new String(byArray));
            this.II(new IO0o(-74).II(1).III(stringArray.length));
        } else if (n == 2) {
            byte[] byArray = Res.read(IOo_.I1Oo("\ub0bd\ub08b\ub17e\ub103\ub133", 45263) + this._1o_ + IOo_.I1Oo("\ub0e0\ub0b1\ub164\ub142\ub12f\ub10f\ub1f1", 45263));
            String[] stringArray = byArray == null ? new String[]{} : IOo_.II(new String(byArray));
            for (int i = 0; i < stringArray.length; ++i) {
                byte[] byArray2 = Res.read(IOo_.I1Oo("\ub0bd\ub08b\ub17e\ub103\ub133", 45263) + this._1o_ + IOo_.I1Oo("\ub0e0", 45263) + stringArray[i]);
                if (byArray2 == null) continue;
                this.II(new IO0o(-74).II(2).II(stringArray[i]).IIII(byArray2.length).II(byArray2));
            }
            this.II(new IO0o(-74).II(3).IIII(1));
        }
    }

    static String[] II(String string) {
        Vector<String> vector = new Vector<String>();
        int n = 0;
        for (int i = 0; i <= string.length(); ++i) {
            if (i != string.length() && string.charAt(i) != '\n' && string.charAt(i) != '\r') continue;
            if (i > n) {
                vector.addElement(string.substring(n, i));
            }
            n = i + 1;
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public synchronized void II(IO0o iO0o) {
        try {
            byte[] byArray = iO0o.III();
            int n = iO0o._I_1;
            this.IIIl.writeByte(n);
            if (n == -32 || n == -66 || n == -74 || n == 11 || n == -67 || n == -87 || n == 66 || n == 12) {
                this.IIIl.writeByte((byArray.length & 0xFF) - 128);
                this.IIIl.writeByte((byArray.length >> 8 & 0xFF) - 128);
                this.IIIl.writeByte((byArray.length >> 16 & 0xFF) - 128);
            } else {
                this.IIIl.writeShort(byArray.length);
            }
            this.IIIl.write(byArray);
            this.IIIl.flush();
            if (lII1) {
                System.out.println(IOo_.I1Oo("\ub094\ub082\ub164\ub158\ub12e\ub137\ub1a9\ub185\ub1f9\ub1c6\ub266\ub249\ub227\ub242", 45263) + n + IOo_.I1Oo("\ub0ef\ub0c6", 45263) + byArray.length + IOo_.I1Oo("\ub08d\ub0c7", 45263));
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static /* synthetic */ String I1Oo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

