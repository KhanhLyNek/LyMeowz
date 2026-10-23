package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;

public final class I1O1 {
    public static I_l_ III1 = new I_l_(I1O1.Ill_("\ua0c2\ua0e9\ua0a1\ua16a\ua141\ua107\ua11d\ua1cd\ua1c3\ua1ac\ua185", 41130));

    public static void II(String string, Image image, byte by) {
        III1.put(string, new I1oo(image, by));
    }

    public static I1oo II(String string, I_l_ i_l_) {
        I1oo i1oo = (I1oo)i_l_.get(string);
        if (i1oo == null) {
            i1oo = new I1oo();
            I1oo i1oo2 = I1O1.II(string);
            if (i1oo2 != null) {
                i1oo.II01 = i1oo2.II01;
                i1oo.II10 = i1oo2.II10;
            }
            i_l_.put(string, i1oo);
        }
        i1oo.I1I = II.var_long_II / 1000L;
        if (i1oo.II01 == null) {
            --i1oo.I_Oo;
            if (i1oo.I_Oo <= 0) {
                I_0_.II().IIOI(string);
                i1oo.I_Oo = 200;
            }
        }
        return i1oo;
    }

    private static I1oo II(String string) {
        byte[] byArray = I_O1.II(IO1l.l_I0 + I1O1.Ill_("\ua0e3\ua0a4\ua08f\ua145\ua15f\ua10b\ua105\ua1ee\ua1c7\ua19e", 41130) + string);
        if (byArray == null) {
            return null;
        }
        try {
            I1oo i1oo = new I1oo();
            new I1oo().II10 = byArray[0];
            i1oo.II01 = Image.createImage((byte[])byArray, (int)1, (int)(byArray.length - 1));
            return i1oo;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void II(String string, byte by, byte[] byArray) {
        string = IO1l.l_I0 + I1O1.Ill_("\ua0e3\ua0a4\ua08f\ua145\ua15f\ua10b\ua105\ua1ee\ua1c7\ua19e", 41130) + string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(by);
            for (int i = 0; i < byArray.length; ++i) {
                dataOutputStream.writeByte(byArray[i]);
            }
            I_O1.II(string, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void II(I_l_ i_l_, int n) {
        I_lO i_lO = new I_lO(I1O1.Ill_("\ua0c9\ua0a1\ua08d\ua164\ua14d\ua101\ua101\ua1ef\ua1ea\ua1a0\ua193\ua197", 41130));
        Enumeration enumeration = i_l_.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            I1oo i1oo = (I1oo)i_l_.get(string);
            if (II.var_long_II / 1000L - i1oo.I1I <= 600L) continue;
            i_lO.addElement(string);
        }
        for (int i = 0; i < i_lO.size(); ++i) {
            i_l_.remove((String)i_lO.elementAt(i));
        }
    }

    private static /* synthetic */ String Ill_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

