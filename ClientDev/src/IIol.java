package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IIol {
    public String II1;
    public String II1I;
    public int Il0O;
    public long II0o;
    public static Il_l.II III_ = new Il_l.II();
    public static Il_l.II IIIO = new Il_l.II();
    public static boolean Il_I = true;

    public IIol(String string) {
        try {
            if (Il_o.boolean_III1(string) || Il_o.boolean_III1(string.trim())) {
                throw new IllegalArgumentException(IIol.II1I("\u718d\u7185\u726d\u725f\u726a\u7204\u72ed\u72d4\u72b5\u7284\u7363\u7346\u7362\u7302\u73e1\u73f1\u73d0\u73b2\u7388\u743b\u7458\u743c\u7458\u74f9\u74c3\u74b9\u7498\u7533\u755d\u7523\u7550\u75ea\u75c3\u75bd\u7598\u7672", 29134));
            }
            string = Il_o.II(string, IIol.II1I("\u718c\u71a2\u725f\u7278\u726a", 29134), "");
            string = Il_o.II(string, IIol.II1I("\u71ee\u719b\u6ce7\u724a\u726a\u7211\u72fd\u6c02\u72b2\u72c5\u736c\u734a\u6d85\u730f\u73a0\u73eb\u6d1f\u73b4\u73dc", 29134), IIol.II1I("\u71b2", 29134));
            String[] stringArray = Il_o.java_lang_String_arr_II(string = Il_o.II(string, IIol.II1I("\u71ee\u718c\u727c\u725b\u722f\u7208\u72fa\u7287\u72a7\u7291\u7324", 29134), IIol.II1I("\u71b2", 29134)), '|');
            if (stringArray.length < 2) {
                throw new IllegalArgumentException(IIol.II1I("\u7187\u7183\u727a\u724a\u7226\u7200\u72ec\u7287\u72a5\u728d\u7365\u7357\u7362\u7307\u73ef\u73ed\u73d3\u73bc\u7388\u7421\u741a", 29134) + string);
            }
            this.II1 = stringArray[0].trim();
            this.II1I = stringArray[1].trim();
            if (Il_o.boolean_III1(this.II1) || Il_o.boolean_III1(this.II1I)) {
                throw new IllegalArgumentException(IIol.II1I("\u718c\u7182\u727f\u7258\u726a\u7207\u72e9\u72ca\u72a3\u72c5\u736b\u7351\u7362\u730c\u73e1\u73ef\u739e\u73b3\u739d\u7476\u745f\u7479\u741b\u74f6\u74d8\u74bb\u749b\u7567\u7512\u7533\u7515\u75af\u75cb\u75a0\u759c\u767f\u7653", 29134));
            }
            this.Il0O = this.II(this.II1I);
            this.II0o = System.currentTimeMillis();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public int II(String string) {
        try {
            if (string == null || IOlO.II11 == null) {
                return -1;
            }
            for (int i = 0; i < IOlO.II11.length; ++i) {
                if (IOlO.II11[i] == null || !IOlO.II11[i].equals(string)) continue;
                return i;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1;
    }

    public static void IIIO(IO1l iO1l) {
        if (Il_I) {
            try {
                if (III_ != null) {
                    int n = 107;
                    int n2 = II.var_int_IIl - 3;
                    for (int i = 0; i < III_.IIlO(); ++i) {
                        IIol iIol = (IIol)III_.II(i);
                        if (II.II(II.var_int_IIl - 21, n, 17, 10)) {
                            iO1l.Illl(65280);
                            iO1l.III_(II.var_int_IIl - 21, n, 17, 10);
                        }
                        iIol.II(iO1l, n2, n, 1);
                        n += 10;
                    }
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static void I_Il() {
        if (Il_I) {
            Ilol ilol = Ilol.Ilol_II();
            if (ilol == null) {
                return;
            }
            int n = 107;
            for (int i = 0; i < III_.IIlO(); ++i) {
                if (II.II(II.var_int_IIl - 21, n, 17, 10) && II.var_boolean_III0 && II.var_boolean_IIIo) {
                    IIol iIol = (IIol)III_.II(i);
                    if (!IlO_.II_O()) {
                        IlO_.II_l(iIol.Il0O);
                    } else {
                        IlO_.I_o0();
                    }
                    Ilol.Ilol_II().var_I_ll_II = null;
                    II.IIlI();
                    return;
                }
                n += 10;
            }
        }
    }

    public void II(IO1l iO1l, int n, int n2, int n3) {
        if (Il_I) {
            try {
                String string;
                Object object;
                if (iO1l == null) {
                    return;
                }
                long l = (System.currentTimeMillis() - this.II0o) / 1000L;
                int n4 = (int)l;
                IO1I iO1I = IO1I.IIl_;
                if (IOlO.l1oI == this.Il0O) {
                    iO1I = IO1I.IIl0;
                    if (I1_I.var_I_lO_II_O != null) {
                        for (int i = 0; i < I1_I.var_I_lO_II_O.size(); ++i) {
                            try {
                                Object e = I1_I.var_I_lO_II_O.elementAt(i);
                                if (!(e instanceof Ilol)) continue;
                                object = (Ilol)e;
                                if (((Ilol)object).IIO1 == null || !((Ilol)object).IIO1.equals(this.II1)) continue;
                                iO1I = IO1I.IIl0;
                                break;
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                        }
                    }
                }
                if (n4 < 60) {
                    string = n4 + IIol.II1I("\u71bd\u71cd\u7257\u726c\u7225\u7234", 29134);
                } else {
                    long l2 = l / 60L;
                    string = l2 + IIol.II1I("\u71be\u7185\u722c\u7270\u720d\u7206\u72d5", 29134);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.II1).append(IIol.II1I("\u71ee\u71c0\u722c", 29134)).append(this.II1I).append(IIol.II1I("\u71ee\u71c0\u722c", 29134)).append(string);
                object = stringBuilder.toString();
                if (iO1I != null) {
                    iO1I.II(iO1l, (String)object, n, n2, n3, IO1I.IIlI);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static boolean IIIl(String string) {
        if (IIIO.IIlO() > 0 && string != null) {
            String string2 = string.toLowerCase();
            for (int i = 0; i < IIIO.IIlO(); ++i) {
                String string3 = (String)IIIO.II(i);
                if (Il_o.boolean_III1(string3) || !Il_o.boolean_II(string2, string3.toLowerCase())) continue;
                return true;
            }
            return false;
        }
        return true;
    }

    private static /* synthetic */ String II1I(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

