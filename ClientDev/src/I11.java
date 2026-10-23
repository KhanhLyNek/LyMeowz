package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I11
extends I_lO {
    public static I11 II = new I11(I11.IlIo("\u3e98\u3f7c\u3f45", 16116));
    public static I11 III = new I11(I11.IlIo("\u3e99\u3f7a\u3f56", 16116));
    public static I11 IIII = new I11(I11.IlIo("\u3e99\u3f7a\u3f56\u3f63", 16116));
    public static I11 IIIl = new I11(I11.IlIo("\u3e9c\u3f7a", 16116));

    private void III() {
        for (int i = this.size() - 1; i >= 0; --i) {
            I111 i111 = (I111)this.elementAt(i);
            if (i111 == null) continue;
            i111.IIl1();
            if (!i111.I1l1) continue;
            this.removeElementAt(i);
        }
    }

    public static void IIl1() {
        IIIl.III();
        III.III();
        IIII.III();
        II.III();
    }

    public void II(IO1l iO1l) {
        for (int i = 0; i < this.size(); ++i) {
            I111 i111 = (I111)this.elementAt(i);
            if (i111 == null || i111.I1l1) continue;
            ((I111)this.elementAt(i)).II(iO1l);
        }
    }

    private void IIII() {
        for (int i = this.size() - 1; i >= 0; --i) {
            I111 i111 = (I111)this.elementAt(i);
            if (i111 == null) continue;
            i111.I1l1 = true;
            this.removeElementAt(i);
        }
    }

    public static void IOlI() {
        IIIl.IIII();
        II.IIII();
        III.IIII();
        IIII.IIII();
    }

    public static void II(I111 i111) {
        IIIl.addElement(i111);
    }

    public static void III(I111 i111) {
        III.addElement(i111);
    }

    public static void IIII(I111 i111) {
        IIII.addElement(i111);
    }

    public static void IIIl(I111 i111) {
        II.addElement(i111);
    }

    private I11(String string) {
        super(string);
    }

    private static /* synthetic */ String IlIo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

