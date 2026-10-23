package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class Iloo {
    public int IoIl;
    public String II1o;
    public short[] IIIl;
    public int IoI1;
    public int IO_;
    public static I_lO IIlo = new I_lO(Iloo.IIo_("\u84bc\u84aa\u8564\u8546\u8528\u852c\u85e9\u85c2\u85a5\u8584", 33994));
    public static I_l_ IIII = new I_l_(Iloo.IIo_("\u84a2\u84c9\u8561\u8543\u8566\u850c\u85e9\u85c2\u85a5\u8584\u8673", 33994));

    public static void II(Iloo iloo) {
        I_0_.II().void_II((byte)iloo.IoIl);
        IIlo.addElement(iloo);
    }

    public static Iloo II(short s) {
        for (int i = 0; i < IIlo.size(); ++i) {
            Iloo iloo = (Iloo)IIlo.elementAt(i);
            if (iloo.IoIl != s) continue;
            return iloo;
        }
        return null;
    }

    public static boolean II1l(int n) {
        for (int i = 0; i < IIlo.size(); ++i) {
            if (((Iloo)Iloo.IIlo.elementAt((int)i)).IoIl != n) continue;
            return true;
        }
        return false;
    }

    private static /* synthetic */ String IIo_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

