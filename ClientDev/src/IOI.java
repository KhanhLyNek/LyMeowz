package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class IOI
extends IO1_ {
    private static int I_Oo;
    private boolean II_ = false;
    private static int IIO;
    private static int IIOI;
    public static IOI II;
    public static Image I1I_;

    public IOI() {
        II = this;
    }

    public static void Ioo() {
        I1I_ = IO10.IIII(IOI.Ilo0("\ud39f\ud3a8\ud38f\ud460\ud449\ud427\ud405\ud4ee\ud4c7\ud4e9\ud496\ud56b\ud543", 54192));
        I_Oo = 0;
    }

    @Override
    public void void_IIlO() {
        if (I_Oo == 30 && !this.II_) {
            this.II_ = true;
            if (I_O1.III(IOI.Ilo0("\ud3c3\ud3aa\ud39c\ud47b\ud449\ud439\ud409\ud4e1\ud4c9\ud4b3", 54192)) != -1) {
                boolean bl = I1_I.IOO_ = I_O1.III(IOI.Ilo0("\ud3c3\ud3aa\ud39c\ud47b\ud449\ud439\ud409\ud4e1\ud4c9\ud4b3", 54192)) == 0;
            }
            if (I_O1.III(IOI.Ilo0("\ud3d9\ud3bc\ud3be\ud461\ud44d\ud432\ud439\ud4e6\ud4dd\ud4a9\ud482", 54192)) != -1) {
                boolean bl = II.var_boolean_II1I = I_O1.III(IOI.Ilo0("\ud3d9\ud3bc\ud3be\ud461\ud44d\ud432\ud439\ud4e6\ud4dd\ud4a9\ud482", 54192)) == 1;
            }
            if (II.var_boolean_II1I) {
                IO.II();
            }
            IO.II();
            IO.IOlO();
            I_0l.Io10();
        }
        I_0l.IO11();
        if (++I_Oo >= 150) {
            I_Ol.II__(IOI.Ilo0("\ud3d3\ud3a7\ud381\ud42d\ud441\ud42a\ud404\ud4a9\ud4c0\ud4ae\ud488\ud56d\ud504\ud52d\ud503\ud5f8\ud580\ud5ce\ud5bf\ud5dd\ud670\ud65a\ud62f", 54192));
            if (I_0O.II().IlI_()) {
                I_0l.I0_O = true;
                II.var_I_0l_II.I0l_();
                return;
            }
            IO10.III_(true);
        }
    }

    public static void IO11() {
        if (I_O1.III(IOI.Ilo0("\ud3c3\ud3b9\ud39d\ud468\ud440\ud42e\ud409\ud4fd", 54192)) != -1) {
            I_0l.l1_I = I_O1.III(IOI.Ilo0("\ud3c3\ud3b9\ud39d\ud468\ud440\ud42e\ud409\ud4fd", 54192));
            if (I_0l.l1_I > I_0l.II1I.length - 1) {
                I_0l.l1_I = I_0l.II1O;
                int n = IO10.IIOo();
                if (n == -1) {
                    n = I_0l.l1_I;
                }
                I_O1.IIIl(IOI.Ilo0("\ud3c3\ud3b9\ud39d\ud468\ud440\ud42e\ud409\ud4fd", 54192), n);
            }
            GameMidlet.var_java_lang_String_III = I_0l.II1l[I_0l.l1_I];
            GameMidlet.II_0 = I_0l.III0[I_0l.l1_I];
            IO11.III(I_0l.IIlI[I_0l.l1_I]);
            I1o_.Illl = I_0l.II1I[I_0l.l1_I];
            System.out.println(IOI.Ilo0("\ud3d9\ud3bf\ud39d\ud468\ud440\ud42e\ud409\ud4fd\ud488\ud4fa\ud4c6", 54192) + I_0l.l1_I + IOI.Ilo0("\ud390\ud3e3\ud3ce", 54192) + I1o_.Illl);
            I_Ol.II__(IOI.Ilo0("\ud3f9\ud39f\ud3d4", 54192) + GameMidlet.var_java_lang_String_III + IOI.Ilo0("\ud390\ud3e3\ud3ce\ud45d\ud463\ud419\ud43e\ud4b3", 54192) + GameMidlet.II_0);
            II.void_II();
        } else {
            int n;
            int n2 = 0;
            if (IO11.IllI > 0) {
                for (n = 0; n < IO11.IllI; ++n) {
                    n2 += I_0l.IIOO[n];
                }
            }
            I_0l.l1_I = I_0l.II1O == -1 ? n2 + I_Ol.III_(0, I_0l.IIOO[IO11.IllI]) : (int)I_0l.II1O;
            n = IO10.IIOo();
            if (n == -1) {
                n = I_0l.l1_I;
            }
            I_O1.IIIl(IOI.Ilo0("\ud3c3\ud3b9\ud39d\ud468\ud440\ud42e\ud409\ud4fd", 54192), n);
            GameMidlet.var_java_lang_String_III = I_0l.II1l[n];
            GameMidlet.II_0 = I_0l.III0[n];
            IO11.III(I_0l.IIlI[n]);
            I1o_.Illl = I_0l.II1I[n];
            II.void_II();
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        if (I1I_ != null && I_Oo < 30) {
            if (IO10.l_lI == 3 || IO10.l_lI == 5) {
                iO1l.Illl(0xFFFFFF);
                iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
            }
            iO1l.II(I1I_, II.var_int_IIl / 2, II.var_int_IIlI / 2, 3);
        }
        if (IIO != -1) {
            iO1l.Illl(0);
            iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
            iO1l.II(I1o_.IlOO, II.var_int_IIl / 2, II.var_int_IIlI / 2 - 24, IOII.I_Oo);
            II.II(II.var_int_IIll, II.var_int_IIlI / 2 + 24, iO1l);
            IO1I.IIII.II(iO1l, IO11.I1OO + IIO * 100 / IIOI + IOI.Ilo0("\ud395", 54192), II.var_int_IIl / 2, II.var_int_IIlI / 2, 2);
        } else if (I_Oo >= 30) {
            iO1l.Illl(0);
            iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
            II.II(II.var_int_IIll, II.var_int_IIl1, iO1l);
            I_0l.II0o(iO1l);
        }
    }

    static {
        IIO = -1;
        IIOI = -1;
        I1I_ = IO10.IIII(IOI.Ilo0("\ud39f\ud3a8\ud38f\ud460\ud449\ud427\ud405\ud4ee\ud4c7\ud4e9\ud496\ud56b\ud543", 54192));
    }

    private static /* synthetic */ String Ilo0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

