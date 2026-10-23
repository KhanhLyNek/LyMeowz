/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class I1ll {
    public int II0I;
    public int I_O0;
    public int I_Oo;
    public int I_0;
    private boolean I__I;
    private Ilol III0;
    public int IIO;
    private int II;
    public int IIOI;
    public int IIOl;
    private int III;
    private int IIII;
    private int IIIl;
    private boolean I__o = true;
    public int IIlI;
    public int IIO1 = 0;
    private static I_lO II1I = new I_lO(I1ll.IlI_("\u3952\u3906\u3904\u39e7\u39e4\u39de\u39aa\u399c", 14628));
    public int IIO_ = 0;
    public long IlO_ = 0L;
    private static I_lO II1l = new I_lO(I1ll.IlI_("\u3952\u390f\u3903\u39f2\u39d4\u39fa\u39b8\u399b", 14628));
    public static I_lO III0 = new I_lO(I1ll.IlI_("\u3952\u390d\u3907\u39f6\u39e5\u39d9\u39b8", 14628));
    private int[] Il1o = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
    private int[] Il_ = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
    private int[] Il_I = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
    private int[] Il1l = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
    private int[] Il11 = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
    private boolean I_O = false;
    private short[] IIl;

    private static void II(int n) {
        for (int i = 0; i < II1I.size(); ++i) {
            I1l0 i1l0 = (I1l0)II1I.elementAt(i);
            if (i1l0.I_0 != n) continue;
            II1I.removeElement(i1l0);
            return;
        }
    }

    private static void II(I1l0 i1l0) {
        II1I.addElement(i1l0);
        if (IOlO.l1oI != 130 && II1I.size() > 10) {
            for (int i = 0; i < 5; ++i) {
                II1I.removeElementAt(0);
            }
        }
    }

    public static I1l0 II(int n) {
        for (int i = 0; i < II1I.size(); ++i) {
            I1l0 i1l0 = (I1l0)II1I.elementAt(i);
            if (i1l0.I_0 != n) continue;
            return i1l0;
        }
        return null;
    }

    public I1ll() {
    }

    public I1ll(int n, Ilol ilol, int n2, int n3, int n4, byte by) {
        this.III0 = ilol;
        this.II0I = n;
        this.IIlI = n2;
        this.III = n3;
        this.IIII = n4;
        this.IIO1 = by;
        if (I1ll.II(n) == null) {
            I1l0 i1l0 = new I1l0();
            new I1l0().I_0 = n;
            if (n >= 42 && n <= 46) {
                n = 106;
            }
            String string = I1ll.IlI_("\u390b\u393b", 14628) + IO1l.l_I0 + I1ll.IlI_("\u390b\u3926\u3904\u39e7\u39c5\u39dc\u39aa\u3999\u3a7d\u3a4f\u3a3b\u3a56", 14628) + n + I1ll.IlI_("\u390b\u3927\u3903\u39f5\u39c1", 14628);
            InputStream inputStream = null;
            try {
                inputStream = I11O.II(string);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (inputStream == null) {
                I_0_.II().IIII((short)n);
            } else {
                if (n > 100 && n < 200) {
                    i1l0.II_(string);
                } else {
                    i1l0.II10(string);
                }
                i1l0.II01 = IO10.IIII(I1ll.IlI_("\u390b\u3926\u3904\u39e7\u39c5\u39dc\u39aa\u3999\u3a7d\u3a4f\u3a3b\u3a56", 14628) + n + I1ll.IlI_("\u390b\u392a\u390f\u39e6\u398e\u39cf\u39b0\u399a", 14628));
            }
            I1ll.II(i1l0);
        }
        this.I_Oo = -1;
        this.I_0 = -1;
        this.IIO_ = -1;
        this.I_O0 = 4;
    }

    public I1ll(int n, int n2, int n3, int n4, int n5, int n6) {
        this.IIOI = n2;
        this.IIOl = n3;
        this.II0I = n;
        this.IIlI = n4;
        this.III = n5;
        this.IIII = n6;
        if (I1ll.II(n) == null) {
            I1l0 i1l0 = new I1l0();
            new I1l0().I_0 = n;
            if (n >= 42 && n <= 46) {
                n = 106;
            }
            String string = I1ll.IlI_("\u390b\u393b", 14628) + IO1l.l_I0 + I1ll.IlI_("\u390b\u3926\u3904\u39e7\u39c5\u39dc\u39aa\u3999\u3a7d\u3a4f\u3a3b\u3a56", 14628) + n + I1ll.IlI_("\u390b\u3927\u3903\u39f5\u39c1", 14628);
            InputStream inputStream = null;
            try {
                inputStream = I11O.II(string);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (inputStream == null) {
                I_0_.II().IIII((short)n);
            } else {
                if (n > 100 && n < 200) {
                    i1l0.II_(string);
                } else {
                    i1l0.II10(string);
                }
                i1l0.II01 = IO10.IIII(I1ll.IlI_("\u390b\u3926\u3904\u39e7\u39c5\u39dc\u39aa\u3999\u3a7d\u3a4f\u3a3b\u3a56", 14628) + n + I1ll.IlI_("\u390b\u392a\u390f\u39e6\u398e\u39cf\u39b0\u399a", 14628));
            }
            I1ll.II(i1l0);
            if (II1l.size() > 20) {
                I1ll.II(Integer.parseInt((String)II1l.elementAt(0)));
                II1l.removeElementAt(0);
            }
            II1l.addElement(String.valueOf(this.II0I));
        }
        this.I_Oo = -1;
        this.I_0 = -1;
        this.I_O0 = 1;
        if (!I1ll.IIIO(String.valueOf(this.II0I))) {
            III0.addElement(String.valueOf(this.II0I));
        }
    }

    private static boolean IIIO(String string) {
        for (int i = 0; i < III0.size(); ++i) {
            if (!((String)III0.elementAt(i)).equals(string)) continue;
            return true;
        }
        return false;
    }

    private boolean II() {
        return this.I__o;
    }

    public void III(IO1l iO1l, int n, int n2) {
        if (this.II() && I1ll.II((int)this.II0I).II01 != null) {
            I1ll.II(this.II0I).II(iO1l, this.II, this.IIOI + n, this.IIOl + n2, this.IIO_, this.IIlI);
        }
    }

    public void II(IO1l iO1l) {
        if (this.II() && I1ll.II(this.II0I) != null && I1ll.II((int)this.II0I).II01 != null) {
            try {
                I1ll.II(this.II0I).II(iO1l, this.II, this.IIOI, this.IIOl, this.IIO_, this.IIlI);
                return;
            }
            catch (Exception exception) {
                I_Ol.II__(I1ll.IlI_("\u3961\u3925\u3904\u39e4\u39c3\u39cb\u39fe", 14628) + this.II0I + I1ll.IlI_("\u3904\u3926\u3910\u39f3\u3980\u39de\u39aa\u39dd\u3a7a\u3a49\u3a3b\u3a14\u3afd\u3a97", 14628) + this.II + I1ll.IlI_("\u3904\u3935\u390b\u39f5\u39d2\u39d6\u39fe", 14628) + this.IIOI + I1ll.IlI_("\u397b", 14628) + this.IIOl + I1ll.IlI_("\u3904\u3963\u3942", 14628) + this.IIlI);
                exception.printStackTrace();
            }
        }
    }

    public void IIl1() {
        try {
            if (this.II0I >= 42 && this.II0I <= 46) {
                if (this.II0I == 42) {
                    this.II = this.Il1o[this.IIO];
                }
                if (this.II0I == 43) {
                    this.II = this.Il_[this.IIO];
                }
                if (this.II0I == 44) {
                    this.II = this.Il_I[this.IIO];
                }
                if (this.II0I == 45) {
                    this.II = this.Il1l[this.IIO];
                }
                if (this.II0I == 46) {
                    this.II = this.Il11[this.IIO];
                }
                ++this.IIO;
                if (this.IIO > this.Il1o.length - 1) {
                    this.IIO = 0;
                }
                return;
            }
            if (I1ll.II(this.II0I) == null) {
                return;
            }
            if (I1ll.II((int)this.II0I).II01 == null) {
                return;
            }
            if (this.I_O0 == 5) {
                I1l0 i1l0 = I1ll.II(this.II0I);
                int n = this.III0.IOIl;
                if (n >= i1l0.IIIl.length) {
                    n = 0;
                }
                this.IIl = i1l0.IIIl[n] == null ? new short[1] : i1l0.IIIl[n];
            } else {
                this.IIl = I1ll.II((int)this.II0I).IIlI;
            }
            if (this.IIl != null) {
                if (!this.I_O) {
                    this.I_O = true;
                    int n = this.IIl.length - 1;
                    if (n > 0 && this.I_O0 != 1) {
                        this.IIO = I_Ol.III_(0, n);
                    }
                    if (this.I_O0 == 0) {
                        this.IIO = I_Ol.III_(this.I_Oo, this.I_0);
                    }
                }
                switch (this.I_O0) {
                    case 0: {
                        if (I_Ol.II(this.IIOI - 50, this.IIOl - 50, 100, 100, Ilol.II().I_o_, Ilol.II().I_oO) && this.IIO > this.I_Oo && this.IIO < this.I_0) {
                            if (this.IIO < this.I_0) {
                                this.IIO = this.I_0;
                            }
                            this.I__I = true;
                        }
                        if (!this.I__I) {
                            ++this.IIO;
                            if (this.IIO != this.I_0) break;
                            this.IIO = this.I_Oo;
                            break;
                        }
                        if (this.IIO >= this.IIl.length) break;
                        ++this.IIO;
                        break;
                    }
                    case 1: 
                    case 3: {
                        if (this.IIO >= this.IIl.length) break;
                        ++this.IIO;
                        break;
                    }
                    case 2: {
                        if (this.IIO < this.IIl.length) {
                            ++this.IIO;
                        }
                        ++this.IIIl;
                        if (this.IIIl != this.IIII) break;
                        this.IIIl = 0;
                        this.IIO_ = I_Ol.III_(0, 2);
                        break;
                    }
                    case 4: {
                        this.IIOI = this.III0.I_o_;
                        this.IIOl = this.III0.I_oO;
                        if (this.IIO >= this.IIl.length) break;
                        ++this.IIO;
                        break;
                    }
                    case 5: {
                        this.IIO_ = this.III0.IOI1 == 1 ? 0 : 1;
                        this.IIOI = this.III0.IOI1 == 1 ? this.III0.I_o_ - 15 : this.III0.I_o_ + 15;
                        this.IIOl = this.III0.IIlo == 0 ? this.III0.I_oO - 25 : this.III0.I_oO - 35;
                        if (this.IIO >= this.IIl.length) break;
                        ++this.IIO;
                    }
                }
                if (this.IIO <= this.IIl.length - 1) {
                    this.II = this.IIl[this.IIO];
                }
            }
            if (this.IIO < this.IIl.length - 1) {
                this.I__o = true;
                return;
            }
            if (this.I_O0 == 0 || this.I_O0 == 3) {
                this.I__o = false;
            }
            if (this.IIII == -1) {
                I1lI.IIIO.removeElement(this);
            }
            if (this.I_O0 == 2) {
                this.IIO = 0;
                return;
            }
            if (this.I_O0 == 1 && this.III == 1) {
                this.I__o = false;
            }
            if (this.I_O0 == 4 || this.I_O0 == 5) {
                if (this.III == -1) {
                    this.IIO = 0;
                    return;
                }
                ++this.IIIl;
                if (this.IIIl == this.IIII) {
                    this.IIIl = 0;
                    --this.III;
                    this.IIO = 0;
                    if (this.III == 0) {
                        this.III0.IIl(0, this.II0I);
                    }
                }
                return;
            }
            this.I__I = false;
            if (this.III == -1) {
                ++this.IIIl;
                this.IIO = 0;
                if (this.IIIl == this.IIII) {
                    this.IIIl = 0;
                    if (this.IIII > 1) {
                        this.IIO_ = I_Ol.III_(0, 2);
                        return;
                    }
                }
            } else {
                ++this.IIIl;
                this.IIO = 0;
                if (this.IIIl == this.IIII) {
                    this.IIIl = 0;
                    --this.III;
                    if (this.III == 0) {
                        I1lI.IIIO.removeElement(this);
                        return;
                    }
                }
            }
        }
        catch (Exception exception) {
            System.out.println(I1ll.IlI_("\u3941\u3931\u3910\u39a1\u3980\u39fa\u39b8\u399b\u3a79\u3a58\u3a2e\u3a57\u3aed\u3ac7\u3ab2\u3a94\u3b60\u3b56\u3b68\u3b51", 14628) + this.II0I + I1ll.IlI_("\u3904\u3963", 14628) + this.I_O0);
            exception.printStackTrace();
            I1lI.IIIO.removeElement(this);
        }
    }

    private static /* synthetic */ String IlI_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

