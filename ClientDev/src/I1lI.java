package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I1lI {
    public static I_lO IIIO = new I_lO(I1lI.IlI1("\u8dcb\u8d99\u8d9d\u8e7c", 36285));

    public static void III(I1ll i1ll) {
        IIIO.addElement(i1ll);
    }

    public static void IIO(int n) {
        if (I1lI.III(n) != null) {
            IIIO.removeElement(I1lI.III(n));
        }
    }

    private static I1ll III(int n) {
        for (int i = 0; i < IIIO.size(); ++i) {
            I1ll i1ll = (I1ll)IIIO.elementAt(i);
            if (i1ll.II0I != n) continue;
            return i1ll;
        }
        return null;
    }

    public static void III(IO1l iO1l, int n, int n2, int n3) {
        for (int i = 0; i < IIIO.size(); ++i) {
            if (((I1ll)I1lI.IIIO.elementAt((int)i)).IIlI != -n3) continue;
            ((I1ll)IIIO.elementAt(i)).III(iO1l, n, n2);
        }
    }

    public static void II(IO1l iO1l) {
        for (int i = 0; i < IIIO.size(); ++i) {
            if (((I1ll)I1lI.IIIO.elementAt((int)i)).IIlI != 1) continue;
            ((I1ll)IIIO.elementAt(i)).II(iO1l);
        }
    }

    public static void IIIl(IO1l iO1l) {
        for (int i = 0; i < IIIO.size(); ++i) {
            if (((I1ll)I1lI.IIIO.elementAt((int)i)).IIlI != 2) continue;
            ((I1ll)IIIO.elementAt(i)).II(iO1l);
        }
    }

    public static void II1I(IO1l iO1l) {
        for (int i = 0; i < IIIO.size(); ++i) {
            if (((I1ll)I1lI.IIIO.elementAt((int)i)).IIlI != 3) continue;
            ((I1ll)IIIO.elementAt(i)).II(iO1l);
        }
    }

    public static void III(IO1l iO1l) {
        for (int i = 0; i < IIIO.size(); ++i) {
            if (((I1ll)I1lI.IIIO.elementAt((int)i)).IIlI != 4) continue;
            ((I1ll)IIIO.elementAt(i)).II(iO1l);
        }
    }

    public static void IIl1() {
        for (int i = 0; i < IIIO.size(); ++i) {
            ((I1ll)IIIO.elementAt(i)).IIl1();
        }
    }

    private static /* synthetic */ String IlI1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

