package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I_oO {
    public Image I1I1;
    public int I_O0;
    public int I_Oo;
    public int I_0;

    public I_oO(Image image, int n) {
        this.I1I1 = image;
        this.I_O0 = n;
        this.I_Oo = 0;
        this.I_0 = 0;
    }

    public void II(IO1l iO1l, int n, int n2, int n3, int n4) {
        boolean bl = false;
        iO1l.III(this.I1I1, 0, 0, IO1l.II(this.I1I1), IO1l.III(this.I1I1), n, n2, n3, n4);
        if (II.var_int_IIIO % 1000 == 0) {
            ++this.I_Oo;
            this.I_0 = this.I_Oo;
        }
    }

    public void II(IO1l iO1l, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl = false;
        if (IO1l.II(this.I1I1) != 1) {
            iO1l.III(this.I1I1, 0, n2 * n5, n5, n6, n, n3, n4, n7);
            if (II.var_int_IIIO % 1000 == 0) {
                ++this.I_Oo;
                this.I_0 = this.I_Oo;
            }
        }
    }
}

