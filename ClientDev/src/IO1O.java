package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class IO1O {
    SocketConnection II;

    public IO1O(String string, int n) {
        try {
            this.II = I0l_.lIll ? I0l_.II() : (SocketConnection)Connector.open((String)(IO1O.I1lI("\u5759\u5726\u570b\u57ec\u57c3\u57b1\u57de\u582c\u580d", 22314) + string + IO1O.I1lI("\u5710", 22314) + n));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void IIl1() {
        try {
            this.II.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public final DataOutputStream java_io_DataOutputStream_III() {
        try {
            return this.II.openDataOutputStream();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public final DataInputStream java_io_DataInputStream_III() {
        try {
            return this.II.openDataInputStream();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ String I1lI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

