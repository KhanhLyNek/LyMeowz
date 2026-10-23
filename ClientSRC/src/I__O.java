/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I__O {
    public static I_lO IlI = new I_lO(I__O.IlO0("\ucd2f\ucd28\ucdf8\ucdc6\ucda0\ucd84\uce60", 52569));
    public int l111 = 100;
    private int l11_;
    public String[] II_O;
    public int I_o_;
    public int I_oO;
    public int IO1l;
    public int IO11;
    public boolean I0_ = false;
    private int IIOo = 0;
    private int II0;
    public I1Il II_I;
    public boolean I0_I = true;
    public boolean I1lI = false;
    private static Image IlO;
    private static Image Iloo;
    private static Image IlO0;
    private static Image IlOo;

    public static void IIl1() {
        if (IlO == null) {
            IlO = IO10.IIII(I__O.IlO0("\ucd76\ucd15\ucdf6\ucddf\ucdbb\ucdbd\uce7e\uce53\uce36\uce15\ucea0\ucec3\uceb4\uceb8\ucf6e\ucf52\ucf3d\ucf1d\ucff5\ucfc3\ucff7\ucf80\ud061\ud046\ud072\ud04e\ud00f\ud0f0\ud0da", 52569));
        }
        if (IlO0 == null) {
            IlO0 = IO10.IIII(I__O.IlO0("\ucd76\ucd15\ucdf6\ucddf\ucdbb\ucdbd\uce7e\uce53\uce36\uce15\ucea0\ucec3\uceb4\uceb8\ucf6e\ucf52\ucf3d\ucf1d\ucff5\ucfc3\ucff7\ucf80\ud06a\ud04f\ud026\ud030\ud010\ud0ee\ud0c8\ud0ac\ud0d5\ud16a\ud157\ud13f", 52569));
        }
        if (IlOo == null) {
            IlOo = IO10.IIII(I__O.IlO0("\ucd76\ucd15\ucdf6\ucddf\ucdbb\ucdbd\uce7e\uce53\uce36\uce15\ucea0\ucec3\uceb4\uceb8\ucf6e\ucf52\ucf3d\ucf1d\ucff5\ucfc3\ucff7\ucf80\ud06a\ud04f\ud026\ud030\ud010\ud0ee\ud0c8\ud0ac\ud0c9\ud134\ud149\ud136\ud110", 52569));
        }
        if (Iloo == null && IO10.l_lI == 1) {
            Iloo = IO10.IIII(I__O.IlO0("\ucd76\ucd15\ucdf6\ucddf\ucdbb\ucdbd\uce7e\uce53\uce36\uce15\ucea0\ucede\ucea2\uce9e\ucf7f\ucf4b\ucf25\ucf46\ucff7\ucfc8\ucfa2", 52569));
        }
    }

    public I__O(String string, int n, int n2) {
        if (string.length() < 10) {
            this.l111 = 60;
        }
        if (II.IIl == 128) {
            this.l111 = 128;
        }
        this.II_O = IO1I.III_.II(string, this.l111 - 10);
        this.l11_ = 7;
        this.I_o_ = n - this.l111 / 2 - 1;
        this.I_oO = n2 - 15 + this.l11_ - this.II_O.length * 12 - 10;
        this.IO1l = this.l111 + 2;
        this.IO11 = (this.II_O.length + 1) * 12 + 1;
        while (this.IO1l % 10 != 0) {
            ++this.IO1l;
        }
        while (this.IO11 % 10 != 0) {
            ++this.IO11;
        }
        if (n >= 0 && n <= 24) {
            this.I_o_ += this.IO1l / 2 + 30;
        }
        if (n <= IOlO.l10_ * 24 && n >= IOlO.l10_ * 24 - 24) {
            this.I_o_ -= this.IO1l / 2 + 6;
        }
        while (this.I_o_ <= 30) {
            this.I_o_ += 2;
        }
        while (this.I_o_ + this.IO1l >= IOlO.l10_ * 24 - 30) {
            this.I_o_ -= 2;
        }
    }

    public void II(String[] stringArray, int n, int n2) {
        this.l111 = 0;
        for (int i = 0; i < stringArray.length; ++i) {
            if (this.l111 >= IO1I.III_.IIII(stringArray[i])) continue;
            this.l111 = IO1I.III_.IIII(stringArray[i]);
        }
        this.l111 += 20;
        this.II_O = stringArray;
        this.l11_ = 7;
        this.I_o_ = n - this.l111 / 2 - 1;
        this.I_oO = n2 - 15 + this.l11_ - this.II_O.length * 12 - 10;
        this.IO1l = this.l111 + 2;
        this.IO11 = (this.II_O.length + 1) * 12 + 1;
        while (this.IO1l % 10 != 0) {
            ++this.IO1l;
        }
        while (this.IO11 % 10 != 0) {
            ++this.IO11;
        }
        if (n >= 0 && n <= 24) {
            this.I_o_ += this.IO1l / 2 + 30;
        }
        if (n <= IOlO.l10_ * 24 && n >= IOlO.l10_ * 24 - 24) {
            this.I_o_ -= this.IO1l / 2 + 6;
        }
        while (this.I_o_ <= 30) {
            this.I_o_ += 2;
        }
        while (this.I_o_ + this.IO1l >= IOlO.l10_ * 24 - 30) {
            this.I_o_ -= 2;
        }
    }

    public static void II(I__O i__O) {
        IlI.addElement(i__O);
    }

    public static void II(IO1l iO1l, int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (!bl) {
            iO1l.Illl(0);
            iO1l.III_(n + 6, n2, n3 - 14 + 1, n4);
            iO1l.III_(n, n2 + 6, n3, n4 - 12 + 1);
            iO1l.Illl(n5);
            iO1l.III_(n + 6, n2 + 1, n3 - 12, n4 - 2);
            iO1l.III_(n + 1, n2 + 6, n3 - 2, n4 - 12);
            iO1l.II(IlO, 0, 0, 7, 6, 0, n, n2, 0);
            iO1l.II(IlO, 0, 0, 7, 6, 2, n + n3 - 7, n2, 0);
            iO1l.II(IlO, 0, 0, 7, 6, 6, n, n2 + n4 - 7, 0);
            iO1l.II(IlO, 0, 0, 7, 6, 3, n + n3 - 7, n2 + n4 - 6, 0);
        } else {
            int n6;
            Image image = n5 == 1 ? IlOo : IlO0;
            iO1l.II(image, 0, 0, 10, 10, 0, n, n2, 0);
            iO1l.II(image, 0, 20, 10, 10, 0, n + n3 - 10, n2, 0);
            iO1l.II(image, 0, 50, 10, 10, 0, n, n2 + n4 - 10, 0);
            iO1l.II(image, 0, 70, 10, 10, 0, n + n3 - 10, n2 + n4 - 10, 0);
            int n7 = (n3 - 20) % 10 == 0 ? (n3 - 20) / 10 : (n3 - 20) / 10 + 1;
            int n8 = (n4 - 20) % 10 == 0 ? (n4 - 20) / 10 : (n4 - 20) / 10 + 1;
            for (n6 = 0; n6 < n7; ++n6) {
                iO1l.II(image, 0, 10, 10, 10, 0, n + 10 + n6 * 10, n2, 0);
            }
            for (n6 = 0; n6 < n8; ++n6) {
                iO1l.II(image, 0, 30, 10, 10, 0, n, n2 + 10 + n6 * 10, 0);
            }
            for (n6 = 0; n6 < n7; ++n6) {
                iO1l.II(image, 0, 60, 10, 10, 0, n + 10 + n6 * 10, n2 + n4 - 10, 0);
            }
            for (n6 = 0; n6 < n8; ++n6) {
                iO1l.II(image, 0, 40, 10, 10, 0, n + n3 - 10, n2 + 10 + n6 * 10, 0);
            }
            iO1l.Illl(n5 == 1 ? 12052656 : 16770503);
            iO1l.III_(n + 10, n2 + 10, n3 - 20, n4 - 20);
        }
    }

    public void IIO(int n) {
        this.II0 = 10;
    }

    public static void II(IO1l iO1l) {
        for (int i = 0; i < IlI.size(); ++i) {
            int n;
            int n2;
            I__O i__O = (I__O)IlI.elementAt(i);
            IO1l iO1l2 = iO1l;
            I__O i__O2 = i__O;
            if (!i__O.I0_I || i__O.II_O == null || Ilo1.III != null || i__O.I1lI) continue;
            if (IO10.l_lI == 1) {
                n2 = i__O.I_o_;
                n = i__O.I_oO - II.II10;
                iO1l.IIIO(n2, n, i__O.IO1l, i__O.IO11);
                iO1l.II(Iloo, n2, n, 0);
                if (i__O.IO1l > 70) {
                    iO1l.II(Iloo, n2 + 70, n, 0);
                }
                if (i__O.IO11 > 30) {
                    iO1l.II(Iloo, n2, n + 30, 0);
                    if (i__O.IO1l > 70) {
                        iO1l.II(Iloo, n2 + 70, n + 30, 0);
                    }
                }
                iO1l.IIIO(I1_I.Io1, I1_I.Io1I, II.IIl, II.IIlI);
            } else {
                int n3 = i__O.I_oO - II.II10;
                boolean bl = i__O.II0 != 0;
                int n4 = i__O.IO11;
                int n5 = i__O.IO1l;
                n = i__O.I_o_;
                if (bl) {
                    iO1l.III(n, n3, n5, n4, 0xFFFFFF);
                } else {
                    iO1l.III(n, n3, n5, n4, 0);
                }
            }
            for (n2 = 0; n2 < i__O2.II_O.length; ++n2) {
                (i__O2.II0 == 0 ? IO1I.IIII : IO1I.IIIO).II(iO1l2, i__O2.II_O[n2], i__O2.I_o_ + i__O2.IO1l / 2, i__O2.I_oO + (i__O2.IO11 / 2 - i__O2.II_O.length * 12 / 2) + n2 * 12 - II.II10, 2);
            }
        }
    }

    public static void IOlI() {
        for (int i = 0; i < IlI.size(); ++i) {
            I__O i__O = (I__O)IlI.elementAt(i);
            if (Ilol.II().II != null && Ilol.II().II.II01 == 0) {
                i__O.I1lI = i__O.I_o_ + i__O.IO1l < I1_I.Io1 || i__O.I_o_ > II.IIl + I1_I.Io1 || i__O.I_oO + i__O.IO11 < I1_I.Io1I || i__O.I_oO > II.IIlI + I1_I.Io1I;
            }
            if (Ilol.II().II == null || Ilol.II().II != null && Ilol.II().II.II01 != 0) {
                i__O.I1lI = i__O.I_o_ + i__O.IO1l / 2 < Ilol.II().I_o_ - 100 || i__O.I_o_ + i__O.IO1l / 2 > Ilol.II().I_o_ + 100 || i__O.I_oO + i__O.IO11 < I1_I.Io1I || i__O.I_oO > II.IIlI + I1_I.Io1I;
            }
            if (i__O.II0 > 0) {
                --i__O.II0;
                if (i__O.II0 == 0 && i__O.II_I != null) {
                    i__O.II_I.I0lO();
                }
            }
            if (!i__O.I0_) continue;
            if (Ilol.II().II != null) {
                if (Ilol.II().II.II01 == 0) {
                    if (Ilol.II().II.l10l == 0) {
                        i__O.I0_I = false;
                    }
                    if (Ilol.II().II.l10l == 1) {
                        i__O.I0_I = true;
                    }
                    if (Ilol.II().II.l10l <= 1 || Ilol.II().II.l10l >= 6) continue;
                    i__O.I0_I = false;
                    continue;
                }
                if (i__O.I0_I) continue;
                ++i__O.IIOo;
                if (i__O.IIOo != 50) continue;
                i__O.I0_I = true;
                continue;
            }
            if (i__O.I0_I) continue;
            I1_l.I1_l = false;
            ++i__O.IIOo;
            if (i__O.IIOo != 50) continue;
            i__O.I0_I = true;
            I1_l.I1_l = true;
        }
    }

    private static /* synthetic */ String IlO0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

