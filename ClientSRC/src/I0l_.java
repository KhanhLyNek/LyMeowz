/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.SocketConnection
 */
import javax.microedition.io.SocketConnection;

public final class I0l_ {
    public static final int ___0 = 14445;
    public static final boolean lIll = !I0l_.I1o0("\ud6a7\ud681\ud693\ud76d\ud758", 54977).equals(System.getProperty(I0l_.I1o0("\ud6af\ud692\ud690\ud730\ud752\ud73a\ud71d\ud7f6\ud7d0\ud7b6\ud792", 54977)));

    private I0l_() {
    }

    public static SocketConnection II() {
        I0l i0l = new I0l(0x100000, I0l_.I1o0("\ud6b5\ud68f\ud6ac\ud77b\ud74f\ud72a\ud71e\ud7e8", 54977));
        I0l i0l2 = new I0l(0x100000, I0l_.I1o0("\ud6b5\ud68f\ud6bc\ud772\ud754\ud739\ud715\ud7ee", 54977));
        Thread thread = new Thread(new IOo_(i0l.II(), i0l2.II()));
        thread.start();
        return new I0l1(i0l, i0l2);
    }

    private static /* synthetic */ String I1o0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

