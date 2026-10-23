package main;

/*
 * Decompiled with CFR 0.152.
 */
public class Il1O
implements I1_1 {
    private static Il1O II;
    private static final String II_l = "skills.enabled";
    private static final Il_l.II IIl_;
    private static final int[] II1l;
    private static final int[] II11;
    public Il_l.II IIlO = new Il_l.II();

    private static void II(int n, String string) {
        IIl_.void_III(new II(n, string));
    }

    private Il1O() {
        this.IIOI();
    }

    public static Il1O II() {
        if (II == null) {
            II = new Il1O();
        }
        return II;
    }

    public static Il1O Il1O_III() {
        return Il1O.II();
    }

    public void II_I() {
        Il1_ il1_ = Il1_.II().Il1__III().II(Il1O.II_0("\ue15d\ue1dd\ue135\ue15b\ue08a\uff0e\ue1ac\ue1d7\ue245\ue25e\ue23d\ue21f\ue2fe", 57630));
        for (int i = 0; i < II11.length; ++i) {
            Integer n = new Integer(II11[i]);
            String string = this.II(n);
            String string2 = this.IIl(n) ? Il1O.II_0("\ue15c\uff90\ue128", 57630) : Il1O.II_0("\ue14a\uff92\ue128", 57630);
            il1_.II(string, string2, 1, n);
        }
        il1_.II(Il1O.II_0("\ue14f\ue148\ue13d\ue102\ue1ba\ue1d5\uff79\ue19e", 57630), "", 99, null).Il1__II(this).I__0();
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                int n2 = (Integer)object;
                this.IIl0(n2);
                this.IIIl(this.II(n2) + Il1O.II_0("\ue124\ue11d", 57630) + (this.IIl(n2) ? Il1O.II_0("\ue15c\uff90\ue128", 57630) : Il1O.II_0("\ue14a\uff92\ue128", 57630)));
                this.II_I();
                break;
            }
            case 99: {
                II0l.II0l_III().II_I();
            }
        }
    }

    public boolean IIl(int n) {
        return this.boolean_II(this.IIlO, n);
    }

    private boolean boolean_II(Il_l.II iI, int n) {
        for (int i = 0; i < iI.IIlO(); ++i) {
            Integer n2 = (Integer)iI.II(i);
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    public void IIl0(int n) {
        Integer n2 = new Integer(n);
        if (this.IIl(n)) {
            this.void_II(this.IIlO, n);
        } else {
            this.IIlO.void_III(n2);
        }
        this.IIOl();
    }

    private void void_II(Il_l.II iI, int n) {
        for (int i = 0; i < iI.IIlO(); ++i) {
            Integer n2 = (Integer)iI.II(i);
            if (n2 != n) continue;
            iI.III(i);
            return;
        }
    }

    public void IIlo(int n) {
        if (!this.IIl(n)) {
            this.IIlO.void_III(new Integer(n));
            this.IIOl();
        }
    }

    public void II1(int n) {
        if (this.IIl(n)) {
            this.void_II(this.IIlO, n);
            this.IIOl();
        }
    }

    public String II(int n) {
        for (int i = 0; i < IIl_.IIlO(); ++i) {
            II iI = (II)IIl_.II(i);
            if (iI.I1l != n) continue;
            return iI.II1o;
        }
        return Il1O.II_0("\ue14b\ue153\ue137\ue115\ue1f5\ue1ce\ue1b6\ue1d7\ue245\ue25e\ue23d\ue21f\ue2fe", 57630);
    }

    private boolean IIlI(int n) {
        for (int i = 0; i < IIl_.IIlO(); ++i) {
            II iI = (II)IIl_.II(i);
            if (iI.I1l != n) continue;
            return true;
        }
        return false;
    }

    public Il_l.II Il_l$II_III() {
        Il_l.II iI = new Il_l.II();
        for (int i = 0; i < this.IIlO.IIlO(); ++i) {
            iI.void_III(this.IIlO.II(i));
        }
        return iI;
    }

    public void I_10() {
        this.IIlO.I_1O();
        this.IIOl();
    }

    public void I_0_() {
        this.IIlO.I_1O();
        for (int i = 0; i < II1l.length; ++i) {
            this.IIlO.void_III(new Integer(II1l[i]));
        }
        this.IIOl();
        this.IIIl(Il1O.II_0("\ue00e\ue1de\ue17c\ue109\ue1ff\ue1ca\ue1bd\ue183\ue236\ue243\ufc95\ue253\ue2f1\ue251\ue2b9\ue2cf\ue21f\ufd9a\ue338\ue34b\ue3e7\ufd1e\ue3ab\ue3c7\ue517\ufaee\ue42a\ue40b", 57630));
    }

    private void IIIl(String string) {
        I1_I.var_I1Oo_II.IIII(string, 0);
    }

    private void IIOI() {
        String string = IlIO.java_lang_String_IIII(Il1O.II_0("\ue16d\ue156\ue135\ue117\ue1f6\ue1ca\ue1f6\ue192\ue278\ue254\ue236\ue21f\ue2f7\ue2d5", 57630), "");
        if (Il_o.boolean_III1(string)) {
            this.I_0_();
        } else {
            this.II1O(string);
        }
    }

    private void II1O(String string) {
        String[] stringArray = Il_o.java_lang_String_arr_II(string, ',');
        for (int i = 0; i < stringArray.length; ++i) {
            try {
                int n = Integer.parseInt(stringArray[i].trim());
                if (!this.IIlI(n)) continue;
                this.IIlO.void_III(new Integer(n));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private void IIOl() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.IIlO.IIlO(); ++i) {
            if (i > 0) {
                stringBuilder.append(Il1O.II_0("\ue132", 57630));
            }
            stringBuilder.append(this.IIlO.II(i));
        }
        IlIO.void_IIII(Il1O.II_0("\ue16d\ue156\ue135\ue117\ue1f6\ue1ca\ue1f6\ue192\ue278\ue254\ue236\ue21f\ue2f7\ue2d5", 57630), stringBuilder.toString());
    }

    static {
        IIl_ = new Il_l.II();
        Il1O.II(0, Il1O.II_0("\ue15d\ue155\ue135\ue191\ue1ef\ue199\ue0c9\uff52\ue27b\ue215\ue210\ue201\ue2f3\ue2d6\ue2bf\ue281", 57630));
        Il1O.II(1, Il1O.II_0("\ue15d\ue155\ue135\ue191\ue1ef\ue199\ue193\ue196\ue27b\ue250\ue23e\ue21c\ue2f9\ue2de", 57630));
        Il1O.II(6, Il1O.II_0("\ue14a\ue155\ue1bd\ue112\ue1ba\ue1fd\ue068\ue056\ue278\ue252\ue274\ue23b\ufc33\ue291\ue283\ue28e\ue360", 57630));
        Il1O.II(9, Il1O.II_0("\ue155\ue15c\ue135\ue114\ue1f1\ue1dc\ue1b6", 57630));
        Il1O.II(10, Il1O.II_0("\ue14f\ue148\uffff\ue15b\ue1f9\uff1e\ue1ad\ue1d7\ue27d\ue2df\ue239\ue253\ue2f9\ue2d9\ue23d", 57630));
        Il1O.II(20, Il1O.II_0("\ue15a\ufff6\ue13f\ue113\ue1ba\ue1da\ue1b0\ue182\ue26f\ufcf6\ue23a\ue253\ue2e6\ufc58\ue2b3\ue2cf\ue37a\ue345\ufd91\ue302", 57630));
        Il1O.II(22, Il1O.II_0("\ue14a\ue155\ue1a8\ue112\ue1ba\ue1d4\ue1b1\ue11d\ue278", 57630));
        Il1O.II(24, Il1O.II_0("\ue14d\ue148\ue12c\ue11e\ue1e8\ue199\ue193\ue196\ue27b\ue250\ue23e\ue21c\ue2f9\ue2de", 57630));
        Il1O.II(19, Il1O.II_0("\ue155\ue155\ue135\ue191\ue1f4\ue199\ue1b6\ue0f4\ue278\ue252\ue274\ue21f\ue322\ufc52\ue2be\ue288", 57630));
        Il1O.II(2, Il1O.II_0("\ue15d\ue155\ue135\ue191\ue1ef\ue199\ue0c9\uff52\ue27b\ue215\ue210\ue216\ue2ff\ue2de\ue2be", 57630));
        Il1O.II(3, Il1O.II_0("\ue15d\ue155\ue135\ue191\ue1ef\ue199\ue195\ue196\ue265\ue250\ue23a\ue218\ue2fd", 57630));
        Il1O.II(7, Il1O.II_0("\ue14a\ue14f\ue1b1\ue15b\ue1ee\ue1d1\ue068\ue056\ue278\ue252", 57630));
        Il1O.II(11, Il1O.II_0("\ue153\ue15c\ue137\ue11a\ue1f4\ue1d2\ue1b7\ue184\ue277\ue245\ue224\ue21c", 57630));
        Il1O.II(12, Il1O.II_0("\ue00e\uff86\ue17c\ue10f\ue1e8\uff50\ue1b6\ue190", 57630));
        Il1O.II(17, Il1O.II_0("\ue152\ue154\ue1b6\ue115\ue1ba\ue1d1\ue1b7\ue117\ue278", 57630));
        Il1O.II(18, Il1O.II_0("\ue15c\ue154\uffe3\ue115\ue1ba\ue1ea\ue12c\ue194\ue2e2\ue259\ue235", 57630));
        Il1O.II(26, Il1O.II_0("\ue153\ue15c\ue17c\ue10b\ue1f2\ue1d6\ue1b6\ue190\ue236\ue257\ue235", 57630));
        Il1O.II(4, Il1O.II_0("\ue15d\ue155\ue135\ue191\ue1ef\ue199\ue0c9\uff52\ue27b\ue215\ue213\ue212\ue2fe\ue2d8\ue2b3\ue284", 57630));
        Il1O.II(5, Il1O.II_0("\ue15d\ue155\ue135\ue191\ue1ef\ue199\ue199\ue199\ue262\ue25a\ue239\ue21a\ue2f1", 57630));
        Il1O.II(8, Il1O.II_0("\ue14a\ue1dc\ue135\ue15b\ue1ee\uff18\ue1b7\ue1d7\ue278\ue336\ue23a\ue214\ue2b2\ue2dd\ue360\ufc0c\ue360\ue34a", 57630));
        Il1O.II(13, Il1O.II_0("\ue15c\ue154\uffe3\ue115\ue1ba\ue1d1\ue134\ue199\ue27e", 57630));
        Il1O.II(14, Il1O.II_0("\ue14a\uffcc\ue17c\ue10b\ue1f2\ue158\ue1ac\ue1d7\ue278\ufce0", 57630));
        Il1O.II(21, Il1O.II_0("\ue156\ue148\ue1a1\ue10f\ue1ba\ue1ca\ue139\ue198", 57630));
        Il1O.II(23, Il1O.II_0("\ue14a\ue14f\ue1af\ue112", 57630));
        Il1O.II(25, Il1O.II_0("\ue15d\ue15c\ue138\ue112\ue1f9\ue199\ue1b4\ue19e\ue2fc\ue25b\ue274\ue21b\ue2fd\ue251\ue2be\ue2cf\ue36d\ue345\ue2fc\ufdb4\ue3e4\ue3ce", 57630));
        II1l = new int[]{17, 7, 4, 13, 12, 0, 2, 9, 19};
        II11 = new int[]{0, 1, 6, 9, 10, 20, 22, 24, 19, 2, 3, 7, 11, 12, 17, 18, 26, 4, 5, 8, 13, 14, 21, 23, 25};
    }

    private static /* synthetic */ String II_0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    static class II {
        int I1l;
        String II1o;

        II(int n, String string) {
            this.I1l = n;
            this.II1o = string;
        }
    }
}

