/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I11o {
    public int II0I;
    public int I_O0;
    public int I_Oo;
    public Image II0_;

    public I11o(int n) {
        Image image = I111.II(n);
        if (image != null) {
            this.II0_ = image;
            this.II0I = I111.IIIl[n][0];
            this.I_O0 = I111.IIIl[n][1] / I111.IIIl[n][2];
            this.I_Oo = I111.IIIl[n][2];
        }
    }

    public I11o(Image image, int n, int n2) {
        if (image != null) {
            this.II0_ = image;
            this.II0I = n;
            this.I_O0 = n2;
            this.I_Oo = image.getHeight() / n2;
            if (this.I_Oo <= 0) {
                this.I_Oo = 1;
            }
        }
    }

    public void II(int n, int n2, int n3, int n4, int n5, IO1l iO1l) {
        try {
            if (this.II0_ != null) {
                if (n > this.I_Oo) {
                    n = this.I_Oo;
                }
                iO1l.II(this.II0_, 0, n * this.I_O0, this.II0I, this.I_O0, n4, n2, n3, n5);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

