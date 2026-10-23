/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class I_O0
implements Runnable {
    private final Vector III1;
    private I_0O III;
    private long I1Il;

    public I_O0(I_0O i_0O) {
        this.III = i_0O;
        this.III1 = new Vector();
    }

    public void IIl_(I_Il i_Il) {
        this.III1.addElement(i_Il);
    }

    @Override
    public void run() {
        while (this.III.I0O) {
            try {
                if (this.III.I1l) {
                    int n = this.III1.size();
                    if (n >= 50 && System.currentTimeMillis() - this.I1Il >= 2000L) {
                        this.I1Il = System.currentTimeMillis();
                        System.out.println(I_O0.Il0_("\u4c0b\u4c03\u4ce7\u4cd9\u4ca9\u4cb6\u4d2a\u4d4a\u4d29\u4d09\u4dee\u4d85\u4da6\u4d82\u4e6d\u4e1b\u4e60\u4e37\u4e1f\u4ef3\u4edb\u4efb\u4e9e\u4f76\u4f51\u4f77\u4f11\u4ffa\u4fdd\u4ff3\u4f86\u5078\u505e\u506f\u5009\u50f8\u50c5\u50eb\u508e\u5160\u5108\u5123\u5109\u51eb\u5184", 19536) + n + I_O0.Il0_("\u4c70\u4c08\u4ce1\u4cc4\u4cec\u4cc6\u4d2a\u4d45\u4d3d\u4d08\u4de8\u4dc2\u4de4\u4d84\u4e77\u4e48\u4e60\u4e3c\u4e11\u4ebd\u4ec8\u4eb3\u4e9f\u4f39\u4f5c\u4f36\u4f18\u4ff2\u4f94\u4fb1\u4f9b\u5031\u5053\u5027\u500f\u50e0\u5083\u50bf\u5098\u516c\u5147\u516b\u5146\u51e2\u51c5\u51ba\u51c2\u5266\u5249\u525e\u522a\u525d\u52f0\u52da\u52bd", 19536));
                    }
                    while (this.III1.size() > 0) {
                        I_Il i_Il = (I_Il)this.III1.elementAt(0);
                        this.III1.removeElementAt(0);
                        I_0O.II(this.III, i_Il);
                    }
                }
                try {
                    Thread.sleep(10L);
                }
                catch (Exception exception) {
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    static Vector II(I_O0 i_O0) {
        return i_O0.III1;
    }

    private static /* synthetic */ String Il0_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

