/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
package main;

import javax.microedition.midlet.MIDlet;
import nrolite.DataDownloader;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GameMidlet
extends MIDlet {
    public static String III = GameMidlet.III("\u26e1\u26b5\u26a6\u276f\u2746\u273f\u271d", 9901);
    public static int II_0 = 14445;
    public static String IIII;
    public static int II_o;
    public static final String IIIl = "LyMeowz";
    public static final String III1 = "1.0.2";
    public static final String III_ = "Ph\u1ea1m Ho\u00e0ng Kh\u00e1nh Ly";
    private static II III;
    public static GameMidlet II;
    private static boolean II1_;
    public static boolean II1O;

    public GameMidlet() {
        II = this;
    }

    public static void II(String[] stringArray) {
        System.out.println(GameMidlet.III("\u26e1\u26b5\u26a6\u276f\u2746\u273f\u271d\u27a6\u2794\u27ea\u27d3\u282c\u2813\u2860\u2872\u285e\u28cd\u28d4\u283a\u288e\u2939\u294c\u2925\u291f\u3756\u29da\u29f3\u2990\u34ce\u2a59\u2a6f\u2a3e\u2ae5\u340d\u2aa6\u2aca\u2b41\u2b47\u2ba7\u2b08\u2be2\u2b84\u2b88\u2b8a\u2ce0\u2c4e\u2c57\u2c7e\u2c31\u2ce5", 9901));
    }

    protected void destroyApp(boolean bl) {
    }

    protected void pauseApp() {
    }

    public void startApp() {
        if (!II1_) {
            III = new II();
            new Thread(III).start();
            I_0O.II().II(I1I1.II());
            I_0O.III().II(I1I1.II());
            I_0O.III().I0_o = false;
            if (DataDownloader.isDataReady()) {
                IOI.Ioo();
                II.II = new IOI();
            } else {
                II.II = new IOOl();
            }
            IOIO.II(II);
            II1_ = true;
        }
    }

    public void IIll() {
        IOIO.I0O1 = false;
        System.gc();
        this.notifyDestroyed();
    }

    private static /* synthetic */ String III(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

