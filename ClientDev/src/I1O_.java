package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I1O_
implements I1_1 {
    public I_lO IIOO = new I_lO(I1O_.IllO("\udde3\uddc7\uddae\udd88\ude51\ude44\ude2d\ude17\uded6\udece\ude93\udeb7\ude91\udf6a", 56714));
    public I1O0 II;
    public int I_Oo = 100;
    private int IoII;
    public String[] IIIO;
    private int IIO0;
    private int IIOo;
    private boolean IIl = false;
    private static Image IlO = IO10.IIII(I1O_.IllO("\udda5\uddc4\udda9\udd8e\ude68\ude6c\ude29\ude02\udee5\udec4\udeef\udeb2\ude87\udf49\udf59\udf23\udf0e\udfec\udfca\udfb2\udfc4\ue071\ue053\ue03c\ue011\ue0ff\ue0d8\ue0a0\ue080\ue123\ue15c\ue125\ue10d", 56714));
    public int IIO;
    public int IIOI;
    private int III;
    public int IIOl;
    public int IIlI;
    public int IIO1;
    public int IIO_;

    public void IIl1() {
        this.IIIO = null;
        this.IIOO.removeAllElements();
    }

    public void III(IO1l iO1l, int n, int n2, int n3) {
        if (this.IIOO.size() != 0) {
            iO1l.IIl0(n, n2);
            if (this.IIIO != null && this.IIIO.length != 0 && this.III != 1) {
                int n4;
                int n5 = n4 = IO1l.l_I0 == 1 ? 0 : 10;
                if (this.II.IIll == null) {
                    I__O.II(iO1l, this.IIOl, this.IIlI, this.IIO1, this.IIO_, 0xFFFFFF, false);
                } else {
                    IO10.III(iO1l, this.IIOl - 23, this.IIlI - n4 / 2, this.IIO1 + 15);
                }
                if (this.II.IIll == null) {
                    iO1l.II(IlO, 0, 0, 9, 8, n3 == 1 ? 0 : 2, this.IIO0 - 3 + (n3 == 1 ? -15 : 20), this.IIOo - 20 + this.IoII + 2, 17);
                }
                n3 = -1;
                for (int i = 0; i < this.IIIO.length; ++i) {
                    int n6;
                    IO1I iO1I = IO1I.IIlI;
                    String string = this.IIIO[i];
                    if (this.IIIO[i].startsWith(I1O_.IllO("\uddf6", 56714))) {
                        String[] stringArray = I_Ol.II(this.IIIO[i], I1O_.IllO("\uddf6", 56714), 0);
                        if (stringArray.length == 3) {
                            string = stringArray[2];
                        }
                        if (stringArray.length == 4) {
                            string = stringArray[3];
                            Integer.parseInt(stringArray[2]);
                        }
                        n3 = n6 = Integer.parseInt(stringArray[1]);
                    } else {
                        n6 = n3;
                    }
                    switch (n6) {
                        case -1: {
                            iO1I = IO1I.IIlI;
                            break;
                        }
                        case 0: {
                            iO1I = IO1I.III_;
                            break;
                        }
                        case 1: {
                            iO1I = IO1I.III0;
                            break;
                        }
                        case 2: {
                            iO1I = IO1I.III;
                            break;
                        }
                        case 3: {
                            iO1I = IO1I.IIl0;
                            break;
                        }
                        case 4: {
                            iO1I = IO1I.II1;
                            break;
                        }
                        case 5: {
                            iO1I = IO1I.IIlo;
                        }
                        default: {
                            break;
                        }
                        case 7: {
                            iO1I = IO1I.II;
                        }
                    }
                    if (this.II.IIll == null) {
                        iO1I.II(iO1l, string, this.IIO0, this.IIOo - 15 + this.IoII + i * 12 - this.IIIO.length * 12 - 9, 2);
                        continue;
                    }
                    n6 = this.IIOl - 23;
                    int n7 = this.IIlI - n4 / 2;
                    int n8 = IO10.l_lI == 1 ? this.IIO1 + 28 : this.IIO1 + 25;
                    int n9 = this.IIO_ + (II.var_boolean_IIIl ? 0 : 14) + n4;
                    iO1l.Illl(0x442211);
                    iO1l.III_(n6, n7 + n9, n8, 2);
                    n8 = this.II.IIOI * n8 / this.II.IIOl;
                    if (n8 < 0) {
                        n8 = 0;
                    }
                    iO1l.Illl(43758);
                    iO1l.III_(n6, n7 + n9, n8, 2);
                    if (this.II.IIOI == 0) {
                        return;
                    }
                    this.II.IIll.III(iO1l, this.IIOl + 5, this.IIlI + this.IIO_ / 2, 0);
                    if (IO1l.l_I0 == 1) {
                        (this.II.II_ ? IO1I.IIOl : IO1I.IIOO).II(iO1l, this.II.IIll.IIO1, this.IIOl + 12, this.IIlI + 3, 0);
                    } else {
                        (this.II.II_ ? IO1I.IIOl : IO1I.IIOO).II(iO1l, this.II.IIll.IIO1, this.IIOl + 12, this.IIlI - 3, 0);
                    }
                    if (!II.var_boolean_IIIl) {
                        if (!IOI0.III_) {
                            IO1I.IIO1.II(iO1l, I1O_.IllO("\uddc4\uddc1\uc36d\udd89\ude26\ude06\ude64\udf72\uc041\ude81\udea3\udeb7\ude9f\udf69", 56714), this.IIOl + this.IIO1 / 2 + 10, this.IIlI + this.IIO_, 2);
                        } else {
                            IO1I.IIO1.II(iO1l, I1O_.IllO("\uddc4\uddc1\uc36d\udd89\ude26\ude7c\ude64\udf72\uc041\ude81\udea3\udeb7\ude9f\udf69", 56714), this.IIOl + this.IIO1 / 2 + 10, this.IIlI + this.IIO_, 2);
                        }
                    }
                    if (IO1l.l_I0 == 1) {
                        IOl_.II(iO1l, string, this.IIOl + 14, this.IIlI + this.IIO_ / 2 + 2, this.IIO1 - 16, this.IIO_, IO1I.IIO_);
                        continue;
                    }
                    String[] stringArray = IO1I.IIO_.II(string, 120);
                    for (int j = 0; j < stringArray.length; ++j) {
                        IO1I.IIO_.II(iO1l, stringArray[j], this.IIOl + 12, this.IIlI + 12 + j * 12 - 3, 0);
                    }
                    II.II(iO1l);
                }
            }
            iO1l.IIl0(-n, -n2);
        }
    }

    public void IOlI() {
        if (this.IIOO.size() != 0 && this.II.IIOI == 0) {
            ++this.IIO;
            if (this.IIO >= this.II.I_O0) {
                I1O0 i1O0;
                this.IIO = 0;
                this.IIOO.removeElementAt(0);
                if (this.IIOO.size() == 0) {
                    return;
                }
                this.II = i1O0 = (I1O0)this.IIOO.firstElement();
                this.III();
            }
        }
    }

    public void III() {
        int n;
        this.I_Oo = 100;
        if (II.var_int_IIl == 128) {
            this.I_Oo = 128;
        }
        if (this.II.IIll != null) {
            this.IIIO = new String[]{this.II.IIoo};
            n = IO1l.l_I0 == 1 ? this.IIIO.length : IO1I.IIO_.II(this.II.IIoo, 120).length;
        } else {
            this.IIIO = IO1I.IIlI.II(this.II.IIoo, this.I_Oo - 10);
            n = this.IIIO.length;
        }
        this.IoII = 7;
        this.IIOl = this.IIO0 - this.I_Oo / 2 - 1;
        this.IIlI = this.IIOo - 15 + this.IoII - n * 12 - 15;
        this.IIO1 = this.I_Oo + 2 + (this.II.IIll != null ? 30 : 0);
        this.IIO_ = (n + 1) * 12 + 1 + (this.II.IIll != null ? 5 : 0);
    }

    public void II(String string, int n, Ilol ilol, boolean bl) {
        this.III = n;
        if (this.IIOO.size() > 10) {
            this.IIOO.removeElementAt(0);
        }
        if (this.IIOO.size() > 0) {
            string.equals(((I1O0)this.IIOO.lastElement()).IIoo);
        }
        I1O0 i1O0 = new I1O0(string);
        if (this.III == 0) {
            i1O0.I_O0 = string.length();
        }
        if (i1O0.I_O0 < 70) {
            i1O0.I_O0 = 70;
        }
        if (this.III == 1) {
            i1O0.I_O0 = 10000000;
        }
        if (this.III == 3) {
            i1O0.I_O0 = 300;
            i1O0.Ilo_ = IO10.IIII();
            i1O0.IIOI = string.length();
            if (i1O0.IIOI < 15) {
                i1O0.IIOI = 15;
            }
            if (i1O0.IIOI > 100) {
                i1O0.IIOI = 100;
            }
            i1O0.IIOl = i1O0.IIOI;
        }
        if (ilol != null) {
            i1O0.IIll = ilol;
            i1O0.II_ = bl;
            II.var_I_1o_II.II(i1O0);
            if (II.var_boolean_IIIl && II.var_I_1o_II.I01_) {
                I1_I.var_I1Oo_III.IIl_ = new I1Il(IO11.I_Io, this, 1000, i1O0);
            }
        }
        if (ilol != null && II.var_I_1o_II.I01_ || ilol == null) {
            this.IIOO.addElement(i1O0);
        }
        if (this.IIOO.size() == 1) {
            this.II = (I1O0)this.IIOO.firstElement();
            this.III();
        }
        if (II.var_boolean_IIIl && ilol != null && II.var_I_1o_II.I01_ && II.var_int_IIl - 50 > 155 + this.IIO1) {
            I1_I.var_I1Oo_III.IIl_.I1 = II.var_int_IIl - this.IIO1 - 50;
            I1_I.var_I1Oo_III.IIl_.I1I = 35;
        }
    }

    @Override
    public void II(int n, Object object) {
        if (n == 1000) {
            Ilo_ ilo_ = Ilo_.II();
            I1_I.I1_I_II();
            ilo_.II1o(IO11.IO1_);
        }
    }

    private static /* synthetic */ String IllO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

