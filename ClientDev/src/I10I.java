package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I10I {
    public byte IIO1;
    public byte IIO_;
    public byte II1O;
    public byte II10;
    public int IIO;
    public int IIOI;
    public int IIOl;
    public String IIo_;
    public String IIol;
    public byte IIIo;
    public byte IIOO;
    public Ilol IIl1;
    public I_I_ III0;
    public I100[] II;
    int[] Il1 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
    int III = 0;
    long Ilo0;
    public Ilo1 IIIl;
    private I_lO IIO0 = new I_lO("");
    public int lIOl = -1;

    public void II(byte by, byte by2) {
        this.IIO_ = by;
        this.II1O = by2;
    }

    public void III(byte by) {
        this.IIIo = by;
        this.IIl1();
    }

    public void II(byte by) {
        this.IIOO = by;
        this.IIl1();
    }

    public static I10I II(I_lO i_lO, int n) {
        if (i_lO != null) {
            for (int i = 0; i < i_lO.size(); ++i) {
                I10I i10I = (I10I)i_lO.elementAt(i);
                if (i10I == null || i10I.IIO != n) continue;
                return i10I;
            }
        }
        return null;
    }

    public void IIl1() {
        this.IIIl = new Ilo1();
        String string = "";
        string = string + I10I.Illo("\ua8cb\ua89c\ua8c9\ua962", 43201) + this.IIol;
        string = string + I10I.Illo("\ua8cb\ua8cd\ua8d2", 43201);
        if (this.II != null) {
            int n = 0;
            while (true) {
                int n2;
                int n3 = 0;
                for (n2 = 0; n2 < this.II.length; ++n2) {
                    if (this.II[n2].IIl().equals("") || n != this.II[n2].II0I) continue;
                    ++n3;
                    break;
                }
                if (n3 == 0) break;
                string = n == 0 ? string + I10I.Illo("\ua8cb\ua89c\ua8c9\ua962\ua90f\ua920\ua956\ua9b7", 43201) + IO11.Il0I + I10I.Illo("\ua8ec\ua8cd", 43201) : string + I10I.Illo("\ua8cb\ua89c\ua8c9\ua962\ua90f\ua920\ua956\ua9b7", 43201) + IO11.Il0 + I10I.Illo("\ua8e1\ua8ac\ua889\ua930", 43201) + n + I10I.Illo("\ua8ec\ua8cd", 43201);
                for (n2 = 0; n2 < this.II.length; ++n2) {
                    String string2 = this.II[n2].IIl();
                    if (string2.equals("") || n != this.II[n2].II0I) continue;
                    String string3 = I10I.Illo("\ua8f0", 43201);
                    if (this.IIIo == 0) {
                        string3 = I10I.Illo("\ua8f3", 43201);
                    } else if (this.II[n2].II0I != 0) {
                        if (this.IIOO == 0) {
                            string3 = I10I.Illo("\ua8f3", 43201);
                        } else if (this.IIIo < this.II[n2].II0I) {
                            string3 = I10I.Illo("\ua8f3", 43201);
                        }
                    }
                    string = string + I10I.Illo("\ua8cb\ua89c", 43201) + string3 + I10I.Illo("\ua8bd\ua8d1\ua883", 43201) + string2;
                }
                if (n3 == 0) continue;
                ++n;
            }
        }
        Ilo1 ilo1 = this.IIIl;
        this.IIIl.II0I = I_O.I_0;
        ilo1.IIO = I_O.I_O0;
        ilo1.IIIO = IO1I.IIlI.II(string, ilo1.II0I - 8);
        ilo1.I_O0 = 10000000;
        ilo1.var_I_11_III = null;
        ilo1.IIOl = ilo1.IIIO.length * 12;
        ilo1.IIOI = I_O.I_Oo;
        ilo1.var_int_III1 = 10;
        ilo1.IIlI = ilo1.IIOl - I_O.IIO;
        if (ilo1.IIlI < 0) {
            ilo1.IIlI = 0;
        }
    }

    public void III(IO1l iO1l, int n, int n2) {
        int n3;
        I10I i10I = this;
        if (this.IIO_ == this.II1O && this.IIO0.size() == 0) {
            n3 = I_Ol.III_(1, 5);
            for (int i = 0; i < n3; ++i) {
                I__o i__o = new I__o();
                new I__o().II0I = I_Ol.III_(5, 25);
                i__o.I_O0 = I_Ol.III_(5, 25);
                i__o.I_0 = i * I_Ol.III_(0, 8);
                i__o.IIO = 0;
                i__o.I_Oo = -1;
                i10I.IIO0.addElement(i__o);
            }
        }
        for (n3 = 0; n3 < this.IIO0.size(); ++n3) {
            I__o i__o = (I__o)this.IIO0.elementAt(n3);
            if (i__o == null) continue;
            if (i__o.IIO < i__o.I_0) {
                ++i__o.IIO;
            }
            if (i__o.IIO < i__o.I_0) continue;
            i__o.I_Oo = II.var_int_IIIO / 3 % (I_O.II1.I_Oo + 1);
            if (i__o.I_Oo >= I_O.II1.I_Oo) {
                this.IIO0.removeElementAt(n3);
                --n3;
                continue;
            }
            I_O.II1.II(i__o.I_Oo, n + i__o.II0I, n2 + i__o.I_O0, 0, 3, iO1l);
        }
    }

    private static /* synthetic */ String Illo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

