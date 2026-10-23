package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class IO1l {
    public Graphics II;
    public static int l_I0 = 1;

    public void II(int n, int n2, int n3, int n4, int n5, int n6) {
        this.II.fillArc(n *= l_I0, n2 *= l_I0, n3 *= l_I0, n4 *= l_I0, 0, 360);
    }

    public void II(Image image, int n, int n2, int n3) {
        if (image != null) {
            this.II.drawImage(image, n *= l_I0, n2 *= l_I0, n3);
        }
    }

    public void II(Image image, float f, float f2, int n) {
        float f3 = f2;
        if (image != null) {
            f2 = f * (float)l_I0;
            this.II.drawImage(image, (int)f2, (int)(f3 *= (float)l_I0), n);
        }
    }

    public void IIII(int n, int n2, int n3, int n4) {
        this.II.drawLine(n *= l_I0, n2 *= l_I0, n3 *= l_I0, n4 *= l_I0);
    }

    public void III(int n, int n2, int n3, int n4, int n5) {
        this.II.setColor(n5);
        this.II.fillRect(n *= l_I0, n2 *= l_I0, n3 *= l_I0, n4 *= l_I0);
    }

    public void IIIl(int n, int n2, int n3, int n4) {
        this.III_(n, n2, n3, n4);
    }

    public void III1(int n, int n2, int n3, int n4) {
        this.III_(n, n2, 1, n4);
        this.III_(n + n3, n2, 1, n4);
        this.III_(n, n2, n3, 1);
        this.III_(n, n2 + n4, n3 + 1, 1);
    }

    public void II(Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (image != null) {
            n6 *= l_I0;
            n7 *= l_I0;
            n3 *= l_I0;
            n4 *= l_I0;
            int n9 = image.getWidth();
            int n10 = image.getHeight();
            if ((n *= l_I0) < 0 || (n2 *= l_I0) < 0) {
                return;
            }
            if (n + n3 > n9) {
                n3 = n9 - n;
            }
            if (n2 + n4 > n10) {
                n4 = n10 - n2;
            }
            if (n3 <= 0 || n4 <= 0) {
                return;
            }
            this.II.drawRegion(image, n, n2, n3, n4, n5, n6, n7, n8);
        }
    }

    public void III(Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (image != null) {
            this.II(image, 0, n2, n3, n4, n5, n6, n7, n8);
        }
    }

    public void II(Image image, int n, int n2, int n3, int n4) {
        if (image == null) {
            return;
        }
        int n5 = IO1l.II(image);
        int n6 = IO1l.III(image);
        if (n5 <= 0 || n6 <= 0) {
            return;
        }
        for (n = 0; n < n3 / n5 + 1; ++n) {
            for (n2 = 0; n2 < n4 / n6 + 1; ++n2) {
                this.II.drawImage(image, 0 + n * n5, 0 + n2 * n6, 0);
            }
        }
    }

    public static int II(float f, int n, int n2) {
        I_Ol.II__(IO1l.I1Io("\u24cd\u24a2\u2488\u2562\u254f\u256a\u250a\u25e7\u25cb\u25a9\u2597", 9391));
        f = n2 >> 16 & 0xFF;
        float f2 = n2 >> 8 & 0xFF;
        float f3 = n2 & 0xFF;
        f *= 0.4f;
        f2 *= 0.4f;
        f3 *= 0.4f;
        if (f > 255.0f) {
            f = 255.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 > 255.0f) {
            f2 = 255.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        return 0xFF000000 | (int)f << 16 | (int)f2 << 8 | (int)f3 & 0xFF;
    }

    public void III_(int n, int n2, int n3, int n4) {
        this.II.fillRect(n *= l_I0, n2 *= l_I0, n3 *= l_I0, n4 *= l_I0);
    }

    public final int IIO1() {
        return this.II.getTranslateX() / l_I0;
    }

    public final int IIO_() {
        return this.II.getTranslateY() / l_I0;
    }

    public void IIIO(int n, int n2, int n3, int n4) {
        this.II.setClip(n *= l_I0, n2 *= l_I0, n3 *= l_I0, n4 *= l_I0);
    }

    public final int IIOO() {
        return this.II.getClipX();
    }

    public final int IIO0() {
        return this.II.getClipY();
    }

    public final int IIOo() {
        return this.II.getClipWidth();
    }

    public final int II0() {
        return this.II.getClipHeight();
    }

    public void Illl(int n) {
        this.II.setColor(n);
    }

    public void IIl0(int n, int n2) {
        this.II.translate(n *= l_I0, n2 *= l_I0);
    }

    public static int II(Image image) {
        if (image == null) {
            return 0;
        }
        return image.getWidth() / l_I0;
    }

    public static int III(Image image) {
        if (image == null) {
            return 0;
        }
        return image.getHeight() / l_I0;
    }

    public static int IIII(Image image) {
        if (image == null) {
            return 0;
        }
        return image.getWidth();
    }

    public static int IIIl(Image image) {
        if (image == null) {
            return 0;
        }
        return image.getHeight();
    }

    private static /* synthetic */ String I1Io(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

