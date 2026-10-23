package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class I1OI {
    private static byte[] IIl1 = new byte[]{-22, 2, 12, 4, 5, 2, -10};
    private int I_O0 = 0;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Image II(String string) {
        if (string == null) {
            return null;
        }
        Image image = null;
        string = I1OI.Illl("\ue099\ue0ad", 57526) + IO1l.l_I0 + string;
        InputStream inputStream = null;
        try {
            inputStream = I1OI.class.getResourceAsStream(string);
            if (inputStream != null) {
                int n;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] byArray = new byte[4096];
                while ((n = inputStream.read(byArray)) > 0) {
                    byteArrayOutputStream.write(byArray, 0, n);
                }
                byte[] byArray2 = byteArrayOutputStream.toByteArray();
                I1OI i1OI = new I1OI();
                i1OI.I_O0 = 0;
                for (int i = 0; i < byArray2.length; ++i) {
                    byte by = byArray2[i];
                    by = (byte)(IIl1[i1OI.I_O0++] & 0xFF ^ by & 0xFF);
                    if (i1OI.I_O0 >= IIl1.length) {
                        i1OI.I_O0 %= IIl1.length;
                    }
                    byArray2[i] = by;
                }
                image = Image.createImage((byte[])byArray2, (int)0, (int)byArray2.length);
            }
        }
        catch (Throwable throwable) {
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (Throwable throwable) {}
            }
        }
        if (image == null) {
            try {
                image = Image.createImage((String)string);
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        return image;
    }

    private static /* synthetic */ String Illl(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

