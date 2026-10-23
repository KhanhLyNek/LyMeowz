package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I1Il {
    public boolean I_1o = false;
    public String IIoO;
    public String[] IIll;
    public I1_1 III;
    public int IIO;
    public boolean I__ = true;
    public Image IIO1;
    public Image IIO_;
    public int I1 = 0;
    public int I1I = 0;
    public int IoII = IO1_.l_Io;
    public int var_int_IIO0 = IO1_.llo_;
    private int IIII;
    public boolean I__I = false;
    public Object var_java_lang_Object_IIIl;
    private int var_int_IIIl;
    public String IIo0 = "";
    private static Image IIOO = IO10.IIII(I1Il.IIoo("\uc5db\uc67e\uc653\uc638\uc61e\uc6c6\uc6c3\uc6ac\uc68b\uc76e\uc705\uc72b\uc71c\uc7e9\uc796\uc7a9\uc781\uc865\uc856\uc86f\uc810\uc811\uc8f9", 50676));
    private static Image var_javax_microedition_lcdui_Image_IIO0;
    private static Image IIOo;
    private static Image II0;
    private static Image II0I;
    private static Image II0l;
    public boolean I__l;

    public I1Il(String string, I1_1 i1_1, int n, Object object, int n2, int n3) {
        this.IIoO = string;
        this.IIO = n;
        this.III = i1_1;
        this.var_java_lang_Object_IIIl = null;
        this.I1 = n2;
        this.I1I = n3;
    }

    public I1Il(String string, I1_1 i1_1, int n, Object object) {
        this.IIoO = string;
        this.IIO = n;
        this.III = i1_1;
        this.var_java_lang_Object_IIIl = object;
    }

    public I1Il(String string, int n, Object object) {
        this.IIoO = string;
        this.IIO = n;
        this.var_java_lang_Object_IIIl = object;
    }

    public I1Il(String string, int n) {
        this.IIoO = string;
        this.IIO = n;
    }

    public I1Il(String string, int n, int n2, int n3) {
        this.IIoO = string;
        this.IIO = 0;
        this.I1 = n2;
        this.I1I = n3;
    }

    public void I0lO() {
        II.IIlI();
        if (this.I__ && (this.IIoO != null && !this.IIoO.equals("") && !this.IIoO.equals(IO11.IOl) || this.IIO1 != null)) {
            IO.II();
        }
        if (this.IIO > 0) {
            if (this.III != null) {
                this.III.II(this.IIO, this.var_java_lang_Object_IIIl);
                return;
            }
            I1_I.I1_I_II().IIII(this.IIO, this.var_java_lang_Object_IIIl);
        }
    }

    public void IOlI() {
        this.var_int_IIIl = 1;
        this.IoII = 160;
        this.IIII = 80;
    }

    public void II(IO1l iO1l) {
        if (this.IIO1 != null) {
            iO1l.II(this.IIO1, this.I1, this.I1I, 0);
            if (this.I__I) {
                if (this.IIO_ == null) {
                    if (this.I__l) {
                        iO1l.II(I10_.IlOI, this.I1 + 8, this.I1I + 8, 3);
                    } else {
                        iO1l.II(I10_.IlOI, this.I1 - (this.IIO1.equals(I1_I.IIo_) ? 10 : 0), this.I1I, 0);
                    }
                } else {
                    iO1l.II(this.IIO_, this.I1, this.I1I, 0);
                }
            }
            if (this.IIoO != "" && this.IIoO != null) {
                if (!this.I__I) {
                    IO1I.III_.II(iO1l, this.IIoO, this.I1 + IO1l.II(this.IIO1) / 2, this.I1I + IO1l.III(this.IIO1) / 2 - 5, 2);
                    return;
                }
                IO1I.IIIO.II(iO1l, this.IIoO, this.I1 + IO1l.II(this.IIO1) / 2, this.I1I + IO1l.III(this.IIO1) / 2 - 5, 2);
            }
        } else {
            if (this.IIoO != "") {
                if (this.var_int_IIIl == 1) {
                    if (!this.I__I) {
                        I1Il.II(IIOO, var_javax_microedition_lcdui_Image_IIO0, IIOo, this.I1, this.I1I, 160, iO1l);
                    } else {
                        I1Il.II(II0, II0I, II0l, this.I1, this.I1I, 160, iO1l);
                    }
                } else if (!this.I__I) {
                    I1Il.II(IIOO, var_javax_microedition_lcdui_Image_IIO0, IIOo, this.I1, this.I1I, 76, iO1l);
                } else {
                    I1Il.II(II0, II0I, II0l, this.I1, this.I1I, 76, iO1l);
                }
            }
            int n = this.var_int_IIIl == 1 ? this.I1 + this.IIII : this.I1 + 38;
            if (!this.I__I) {
                IO1I.III_.II(iO1l, this.IIoO, n, this.I1I + 7, 2);
            } else {
                IO1I.IIIO.II(iO1l, this.IIoO, n, this.I1I + 7, 2);
            }
        }
    }

    private static void II(Image image, Image image2, Image image3, int n, int n2, int n3, IO1l iO1l) {
        int n4;
        for (n4 = 10; n4 <= n3 - 20; n4 += 10) {
            iO1l.II(image2, n + n4, n2, 0);
        }
        n4 = n3 % 10;
        if (n4 > 0) {
            iO1l.II(image2, 0, 0, n4, 24, 0, n + n3 - 10 - n4, n2, 0);
        }
        iO1l.II(image, n, n2, 0);
        iO1l.II(image3, n + n3 - 10, n2, 0);
    }

    public final boolean II0o() {
        this.I__I = false;
        if (II.II(this.I1, this.I1I, this.IoII, this.var_int_IIO0)) {
            if (II.var_boolean_IIIO) {
                this.I__I = true;
            }
            if (II.var_boolean_IIIo && II.var_boolean_III0) {
                return true;
            }
        }
        return false;
    }

    static {
        var_javax_microedition_lcdui_Image_IIO0 = IO10.IIII(I1Il.IIoo("\uc5db\uc67e\uc653\uc638\uc61e\uc6c6\uc6c3\uc6ac\uc68b\uc76e\uc705\uc72b\uc71c\uc7e9\uc796\uc7a8\uc78d\uc867\uc80c\uc831\uc80e\uc818", 50676));
        IIOo = IO10.IIII(I1Il.IIoo("\uc5db\uc67e\uc653\uc638\uc61e\uc6c6\uc6c3\uc6ac\uc68b\uc76e\uc705\uc72b\uc71c\uc7e9\uc796\uc7b7\uc78d\uc864\uc84a\uc835\uc84e\uc80f\uc8f0\uc8da", 50676));
        II0 = IO10.IIII(I1Il.IIoo("\uc5db\uc67e\uc653\uc638\uc61e\uc6c6\uc6c3\uc6ac\uc68b\uc76e\uc705\uc72b\uc71c\uc7e9\uc797\uc7a9\uc781\uc865\uc856\uc86f\uc810\uc811\uc8f9", 50676));
        II0I = IO10.IIII(I1Il.IIoo("\uc5db\uc67e\uc653\uc638\uc61e\uc6c6\uc6c3\uc6ac\uc68b\uc76e\uc705\uc72b\uc71c\uc7e9\uc797\uc7a8\uc78d\uc867\uc80c\uc831\uc80e\uc818", 50676));
        II0l = IO10.IIII(I1Il.IIoo("\uc5db\uc67e\uc653\uc638\uc61e\uc6c6\uc6c3\uc6ac\uc68b\uc76e\uc705\uc72b\uc71c\uc7e9\uc797\uc7b7\uc78d\uc864\uc84a\uc835\uc84e\uc80f\uc8f0\uc8da", 50676));
    }

    private static /* synthetic */ String IIoo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

