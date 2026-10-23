package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

public final class I_0_ {
    I1_o var_I1_o_II = I_0O.II();
    private static I_0_ var_I_0__II;
    public static long I1I;
    public static long I1I1;
    public static long I1;
    public static long IlO;
    public static boolean III1;

    public static I_0_ II() {
        if (var_I_0__II == null) {
            var_I_0__II = new I_0_();
        }
        return var_I_0__II;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIO(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(18);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(42);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            i_Il.java_io_DataOutputStream_II().writeUTF(string2);
            i_Il.java_io_DataOutputStream_II().writeUTF(string3);
            i_Il.java_io_DataOutputStream_II().writeUTF(string4);
            i_Il.java_io_DataOutputStream_II().writeUTF(string5);
            i_Il.java_io_DataOutputStream_II().writeUTF(string6);
            i_Il.java_io_DataOutputStream_II().writeUTF(string7);
            i_Il.java_io_DataOutputStream_II().writeUTF(string8);
            i_Il.java_io_DataOutputStream_II().writeUTF(string9);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, I_lO i_lO) {
        I_Ol.II__(I_0_.Ilo("\u9e2b\u9e08\u9eeb\u9ec7\u9ead\u9e8d\u9f67", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-81);
            i_Il.java_io_DataOutputStream_II().writeByte(1);
            i_Il.java_io_DataOutputStream_II().writeByte(i_lO.size());
            for (int i = 0; i < i_lO.size(); ++i) {
                i_Il.java_io_DataOutputStream_II().writeByte(((I101)i_lO.elementAt((int)i)).lIO_);
                I_Ol.II__(I_0_.Ilo("\u9e2f\u9e12\u9eef\u9e85\u9ead\u9e87\u9f22", 40520) + ((I101)i_lO.elementAt((int)i)).lIO_);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, int n, byte by2, int n2) {
        I_Ol.II__(I_0_.Ilo("\u9e2f\u9e0e\u9ee7\u9eca\u9ee4\u9e87\u9f6b\u9f42\u9f28\u9f7f\u9f1f\u9ffe\u9fc8\u9fb2\u9f95\ua077\ua018\ua06a\ua056", 40520) + by);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-86);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (by == 0 || by == 1) {
                i_Il.java_io_DataOutputStream_II().writeInt(n);
            }
            if (by == 2) {
                I_Ol.II__(I_0_.Ilo("\u9e2f\u9e12\u9eef\u9e85\u9ea8\u9e86\u9f6c\u9f01\u9f29\u9f31\u9f1a\u9fe5\u9fd9\u9ffb\u9fc7", 40520) + by2 + I_0_.Ilo("\u9e68\u9e09\u9ef3\u9ec8\u9ef9\u9ec3", 40520) + n2);
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
                i_Il.java_io_DataOutputStream_II().writeInt(n2);
            }
            if (by == 4) {
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(IOI0[] iOI0Array) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-125);
            i_Il.java_io_DataOutputStream_II().writeByte(iOI0Array.length);
            for (int i = 0; i < iOI0Array.length; ++i) {
                i_Il.java_io_DataOutputStream_II().writeUTF(iOI0Array[i].java_lang_String_IIl1());
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void void_III(byte by) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(112);
            i_Il.java_io_DataOutputStream_II().writeByte(0);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(char c) {
        I_Ol.II__(I_0_.Ilo("\u9e2b\u9e06\u9ef6\u9e85\u9ea7\u9e8b\u9f63\u9f53\u9f60\u9f3c\u9f43\u9fbd", 40520) + c);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-85);
            i_Il.java_io_DataOutputStream_II().writeChar(c);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III(byte by, int n) {
        I_Ol.II__(I_0_.Ilo("\u9e29\u9e03\u9ee2\u9e85\u9ea2\u9e91\u9f6b\u9f44\u9f2e\u9f3b", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-80);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (n != -1) {
                i_Il.java_io_DataOutputStream_II().writeInt(n);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(int n) {
        I_Ol.II__(I_0_.Ilo("\u9e2f\u9e02\u9ef2\u9e85\u9eaa\u9e84\u9f6d\u9f42", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-76);
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II01(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-79);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void void_II(byte by) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-62);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III1(byte by) {
        I_Ol.II__(I_0_.Ilo("\u9e1b\u9e0c\u9eef\u9ec9\u9ea8\u9ec3\u9f6c\u9f4e\u9f34\u9f7f\u9f18\u9ff2\u9fdf\u9fae\u9f89\ua039\ua04b\ua038\ua056", 40520) + by);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-45);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II0_(int n) {
        I_Il i_Il = null;
        try {
            I_Ol.II__(I_0_.Ilo("\u9e0b\u9e2b\u9ec7\u9eeb\u9ee4\u9ea7\u9f4d\u9f6f\u9f01\u9f0b\u9f3b", 40520));
            i_Il = new I_Il(-54);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(int n, String string, int n2) {
        I_Il i_Il = null;
        try {
            I_Ol.II__(I_0_.Ilo("\u9e0b\u9e2b\u9ec7\u9eeb\u9ee4\u9eae\u9f47\u9f72\u9f13\u9f1e\u9f39\u9fd8", 40520));
            i_Il = new I_Il(-51);
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            if (n == 0) {
                i_Il.java_io_DataOutputStream_II().writeUTF(string);
            }
            if (n == 2) {
                i_Il.java_io_DataOutputStream_II().writeInt(n2);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, byte by2, byte by3, short s) {
        if (Ilol.Ilol_II().IOIl != 14) {
            I_Il i_Il = null;
            try {
                i_Il = new I_Il(-43);
                i_Il.java_io_DataOutputStream_II().writeByte(by);
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
                i_Il.java_io_DataOutputStream_II().writeByte(by3);
                if (by3 == -1) {
                    i_Il.java_io_DataOutputStream_II().writeShort(s);
                }
                this.var_I1_o_II.IIlO(i_Il);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
            finally {
                i_Il.I0Oo();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(int n, byte by) {
        I_Ol.II__(I_0_.Ilo("\u9e02\u9e28\u9ecf\u9eeb\u9ee4\u9ea0\u9f4e\u9f60\u9f0e\u9f7f", 40520) + n);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-49);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIOl(int n) {
        I_Ol.II__(I_0_.Ilo("\u9e05\u9e22\u9ecb\u9ee7\u9e81\u9eb1\u9f22\u9f62\u9f0c\u9f1e\u9f30\u9fbd", 40520) + n);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-50);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II10(String string) {
        I_Ol.II__(I_0_.Ilo("\u9e3b\u9e02\u9ee8\u9ec1\u9ee4\u9eb0\u9f47\u9f60\u9f12\u9f1c\u9f36\u9fbd\u9fff\u9f97\u9fbb\ua057\ua018", 40520) + string);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-47);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III(int n, byte by) {
        I_Ol.II__(I_0_.Ilo("\u9e1a\u9e22\u9ecb\u9eea\u9e90\u9ea6\u9f22\u9f62\u9f0c\u9f1e\u9f30\u9fbd\u9fd5\u9fbf\u9fda\ua024\ua018", 40520) + n + I_0_.Ilo("\u9e68\u9e15\u9ee9\u9ec9\u9ea1\u9ede\u9f22", 40520) + by);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-56);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IOlI() {
        I_Ol.II__(I_0_.Ilo("\u9e04\u9e22\u9ec7\u9ef3\u9e81\u9ec3\u9f41\u9f6d\u9f01\u9f11", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-55);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, int n, int n2, int n3) {
        I_Ol.II__(I_0_.Ilo("\u9e21\u9e09\u9ef0\u9ecc\u9eb0\u9e86\u9f22\u9f40\u9f23\u9f2b\u9f17\u9ff2\u9fd2\u9ffb\u9fc7\ua039", 40520) + by + I_0_.Ilo("\u9e24\u9e06\u9eff\u9ec0\u9eb6\u9e8a\u9f66\u9f1c\u9f60", 40520) + n + I_0_.Ilo("\u9e68\u9e04\u9eea\u9ec4\u9eaa\u9eaa\u9f46\u9f1c\u9f60", 40520) + n2 + I_0_.Ilo("\u9e68\u9e04\u9ee9\u9ec1\u9ea1\u9ede\u9f22", 40520) + n3);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-57);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (by == 0) {
                i_Il.java_io_DataOutputStream_II().writeInt(n);
            }
            if (by == 1 || by == 2) {
                i_Il.java_io_DataOutputStream_II().writeInt(n2);
                i_Il.java_io_DataOutputStream_II().writeInt(n3);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, byte by2, String string) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-46);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (by == 2 || by == 4) {
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
                i_Il.java_io_DataOutputStream_II().writeUTF(string);
                I_Ol.II__(I_0_.Ilo("\u9e1b\u9e22\u9ec8\u9ee1\u9ee4\u9eb0\u9f4e\u9f6e\u9f07\u9f1e\u9f30\u9fa0\u9f9c", 40520) + string);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III(byte by, byte by2) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-40);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            i_Il.java_io_DataOutputStream_II().writeByte(by2);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public static I_Il I_Il_II(byte by) throws IOException {
        I_Il i_Il = new I_Il(-29);
        i_Il.java_io_DataOutputStream_II().writeByte(by);
        return i_Il;
    }

    private static I_Il I_Il_III(byte by) throws IOException {
        I_Il i_Il = new I_Il(-28);
        i_Il.java_io_DataOutputStream_II().writeByte(by);
        return i_Il;
    }

    public void Io__() {
        if (I_O1.III(I_0_.Ilo("\u9e2b\u9e0b\u9eef\u9ec0\u9eaa\u9e97\u9f76\u9f58\u9f30\u9f3a", 40520)) != -1) {
            IO10.l_lI = I_O1.III(I_0_.Ilo("\u9e2b\u9e0b\u9eef\u9ec0\u9eaa\u9e97\u9f76\u9f58\u9f30\u9f3a", 40520));
        }
        try {
            I_Ol.II__(I_0_.Ilo("\u9e3b\u9e02\u9ef2\u9ef1\u9ebd\u9e93\u9f67", 40520));
            I_Il i_Il = I_0_.I_Il_II((byte)2);
            i_Il.java_io_DataOutputStream_II().writeByte(IO10.l_lI);
            i_Il.java_io_DataOutputStream_II().writeByte(IO1l.l_I0);
            i_Il.java_io_DataOutputStream_II().writeBoolean(false);
            i_Il.java_io_DataOutputStream_II().writeInt(II.var_int_IIl);
            i_Il.java_io_DataOutputStream_II().writeInt(II.var_int_IIlI);
            i_Il.java_io_DataOutputStream_II().writeBoolean(IOI0.III_);
            i_Il.java_io_DataOutputStream_II().writeBoolean(II.var_boolean_IIIl);
            i_Il.java_io_DataOutputStream_II().writeUTF(System.getProperty(I_0_.Ilo("\u9e25\u9e0e\u9ee5\u9ed7\u9eab\u9e86\u9f66\u9f48\u9f34\u9f36\u9f11\u9ff3\u9f92\u9fab\u9f96\ua078\ua04c\ua031\ua019\ua0e7\ua0d9", 40520)) + I_0_.Ilo("\u9e34", 40520) + I_0_.Ilo("\u9e79\u9e49\u9eb6\u9e8b\u9ef6", 40520));
            InputStream inputStream = this.getClass().getResourceAsStream(I_0_.Ilo("\u9e3a\u9e02\u9ef5\u9ef9\u9ead\u9e8d\u9f64\u9f4e", 40520));
            if (inputStream != null) {
                inputStream.read(null);
                i_Il.java_io_DataOutputStream_II().writeShort(((Object[])null).length);
                i_Il.java_io_DataOutputStream_II().write(null);
                I_Ol.II_l(I_0_.Ilo("\u9e3f\u9e15\u9eef\u9ed1\u9ea1\u9ec3", 40520) + ((Object[])null).length + I_0_.Ilo("\u9e34", 40520) + I_0_.Ilo("\u9e79\u9e49\u9eb6\u9e8b\u9ef6", 40520));
            }
            this.var_I1_o_II.IIlO(i_Il);
            i_Il.I0Oo();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void Io_O() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-120);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
        }
        finally {
            I1I = IO10.IIII();
            i_Il.I0Oo();
        }
    }

    public void Io_0() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-121);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
        }
        finally {
            I1I1 = IO10.IIII();
            i_Il.I0Oo();
        }
    }

    public void II(String string, String string2, String string3, byte by) {
        I_Ol.II__(I_0_.Ilo("\u9e04\u9e08\u9ee1\u9ecc\u9eaa\u9ec3", 40520) + string + I_0_.Ilo("\u9e68", 40520) + string2 + I_0_.Ilo("\u9e68", 40520) + string3);
        try {
            I_Il i_Il = I_0_.I_Il_II((byte)0);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            i_Il.java_io_DataOutputStream_II().writeUTF(string2);
            i_Il.java_io_DataOutputStream_II().writeUTF(string3);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            i_Il.java_io_DataOutputStream_II().writeByte(IO11.IllI);
            this.var_I1_o_II.IIlO(i_Il);
            i_Il.I0Oo();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void II(String string, String string2, String string3, String string4) {
        I_Ol.II__(I_0_.Ilo("\u9e1a\u9e02\u9ef7\u9ed0\u9ea1\u9e90\u9f76\u9f01\u9f12\u9f3a\u9f19\u9ff4\u9fcf\u9faf\u9f9f\ua06b\ua018", 40520) + string + I_0_.Ilo("\u9e68", 40520) + string2 + I_0_.Ilo("\u9e68", 40520) + string4);
        try {
            I_Il i_Il = I_0_.I_Il_II((byte)1);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            i_Il.java_io_DataOutputStream_II().writeUTF(string2);
            if (string3 != null && !string3.equals("")) {
                i_Il.java_io_DataOutputStream_II().writeUTF(string3);
                i_Il.java_io_DataOutputStream_II().writeUTF(I_0_.Ilo("\u9e29", 40520));
            }
            this.var_I1_o_II.IIlO(i_Il);
            i_Il.I0Oo();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void Io_o() {
        I_Il i_Il = new I_Il(-23);
        this.var_I1_o_II.IIlO(i_Il);
        i_Il.I0Oo();
    }

    public void III_(byte by) {
        I_Il i_Il = new I_Il(-34);
        try {
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            i_Il.I0Oo();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void II0O(int n) {
        I_Il i_Il = new I_Il(21);
        try {
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            this.var_I1_o_II.IIlO(i_Il);
            i_Il.I0Oo();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void II00(int n) {
        I_Il i_Il = new I_Il(-78);
        try {
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            i_Il.I0Oo();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void IoO() {
        int n = Ilol.Ilol_II().I_o_ - Ilol.Ilol_II().IO00;
        int n2 = Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO0o;
        if (!(Ilol.I1Oo || n == 0 && n2 == 0 || I1I1.I___ || Ilol.Ilol_II().I11 || Ilol.Ilol_II().I_oO <= 0 || Ilol.Ilol_II().I_l_)) {
            try {
                I_Il i_Il = new I_Il(-7);
                Ilol.Ilol_II().IO00 = Ilol.Ilol_II().I_o_;
                Ilol.Ilol_II().IO0o = Ilol.Ilol_II().I_oO;
                Ilol.Ilol_II();
                Ilol.Ilol_II();
                Ilol.Ilol_II();
                Ilol.Ilol_II();
                if (IOlO.IIIo(Ilol.Ilol_II().I_o_ / IOlO.IlI0, Ilol.Ilol_II().I_oO / IOlO.IlI0) == 0) {
                    i_Il.java_io_DataOutputStream_II().writeByte(1);
                    if (Ilol.Ilol_II().I110) {
                        if (!Ilol.Ilol_II().I1O) {
                            Ilol ilol = Ilol.Ilol_II();
                            ilol.IOl1 = ilol.IOl1 - Ilol.Ilol_II().I0_0 / 100 * (Ilol.Ilol_II().var_byte_IIlo == 1 ? 2 : 1);
                        }
                        if (Ilol.Ilol_II().IOl1 < 0) {
                            Ilol.Ilol_II().IOl1 = 0;
                        }
                        I1_I.I1_I_II().IO_O = true;
                        I1_I.I1_I_II().lI1 = 0;
                    }
                } else {
                    i_Il.java_io_DataOutputStream_II().writeByte(0);
                }
                i_Il.java_io_DataOutputStream_II().writeShort(Ilol.Ilol_II().I_o_);
                if (n2 != 0) {
                    i_Il.java_io_DataOutputStream_II().writeShort(Ilol.Ilol_II().I_oO);
                }
                this.var_I1_o_II.IIlO(i_Il);
                ++I1_I.I1Oo;
                i_Il.I0Oo();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void II(String string, int n, int n2) {
        I_Il i_Il = new I_Il(-28);
        try {
            i_Il.java_io_DataOutputStream_II().writeByte(2);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            i_Il.java_io_DataOutputStream_II().writeByte(n2);
            I_Ol.II__(I_0_.Ilo("\u9e26\u9e06\u9eeb\u9ec0\u9ef9\u9ec3", 40520) + string + I_0_.Ilo("\u9e68\u9e00\u9ee3\u9ecb\u9ea0\u9e86\u9f70\u9f1c\u9f60", 40520) + n + I_0_.Ilo("\u9e68\u9e0f\u9ee7\u9ecc\u9eb6\u9ede", 40520) + n2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.var_I1_o_II.IIlO(i_Il);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II0o(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(11);
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, byte by2, short s) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(7);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            i_Il.java_io_DataOutputStream_II().writeByte(by2);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, int n, int n2) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(6);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            i_Il.java_io_DataOutputStream_II().writeShort(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIo(int n) {
        I_Ol.II__(Ilol.Ilol_II().IIO1 + I_0_.Ilo("\u9e68\u9e34\u9ec3\u9ee9\u9e81\u9ea0\u9f56\u9f01\u9f13\u9f14\u9f37\u9fd1\u9ff0\u9ffb", 40520) + n);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(34);
            i_Il.java_io_DataOutputStream_II().writeShort(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIII(short s) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-66);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IoOI() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(29);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(short s, byte by) {
        I_Ol.II__(I_0_.Ilo("\u9e2b\u9e08\u9ee8\u9ec3\u9ead\u9e91\u9f6f\u9f44\u9f60\u9f32\u9f1b\u9ff3\u9fc9\u9fe6", 40520) + by + I_0_.Ilo("\u9e68\u9e09\u9ef6\u9ec6\u9ef9\u9ec3", 40520) + s);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(32);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIoI(int n) {
        I_Ol.II__(I_0_.Ilo("\u9e26\u9e17\u9ee5\u9e85\u9ead\u9e87", 40520) + n);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(33);
            i_Il.java_io_DataOutputStream_II().writeShort(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIII(int n, int n2, int n3) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(22);
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            i_Il.java_io_DataOutputStream_II().writeByte(n2);
            i_Il.java_io_DataOutputStream_II().writeByte(n3);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIIl(short s) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(27);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(short s, String string) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(88);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(I101[] i101Array) {
        II.var_I_l1_II.IOlI();
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(13);
            for (int i = 0; i < i101Array.length; ++i) {
                if (i101Array[i] == null) continue;
                i_Il.java_io_DataOutputStream_II().writeByte(i101Array[i].lIO_);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIol(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(37);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IIIo() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(50);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void II(I_lO i_lO, I_lO i_lO2, int n) {
        block17: {
            try {
                I_Ol.II__(I_0_.Ilo("\u9e1b\u9e22\u9ec8\u9ee1\u9ee4\u9ea2\u9f56\u9f75\u9f01\u9f1c\u9f2a\u9fbd\u9fca\u9f98\u9f92\ua078\ua04a\ua06a\ua056\ua0b5", 40520) + i_lO2.size());
                I_Il i_Il = null;
                if (n == 0) break block17;
                if (i_lO.size() > 0 && i_lO2.size() > 0) {
                    if (n == 1) {
                        i_Il = new I_Il(-4);
                    } else if (n == 2) {
                        i_Il = new I_Il(67);
                    }
                    i_Il.java_io_DataOutputStream_II().writeByte(i_lO.size());
                    for (n = 0; n < i_lO.size(); ++n) {
                        I_I_ i_I_ = (I_I_)i_lO.elementAt(n);
                        i_Il.java_io_DataOutputStream_II().writeByte(i_I_.lll);
                    }
                    for (n = 0; n < i_lO2.size(); ++n) {
                        Ilol ilol = (Ilol)i_lO2.elementAt(n);
                        if (ilol != null) {
                            i_Il.java_io_DataOutputStream_II().writeInt(ilol.IOI_);
                            continue;
                        }
                        i_Il.java_io_DataOutputStream_II().writeInt(-1);
                    }
                } else if (i_lO.size() > 0) {
                    I_Ol.II__(I_0_.Ilo("\u9e18\u9e2b\u9ec7\u9efc\u9e81\u9eb1\u9f22\u9f60\u9f14\u9f0b\u9f3f\u9fde\u9ff7\u9ffb\u9fb4\ua049\ua07b", 40520));
                    i_Il = new I_Il(54);
                    for (n = 0; n < i_lO.size(); ++n) {
                        I_I_ i_I_ = (I_I_)i_lO.elementAt(n);
                        if (!i_I_.I0I1) {
                            i_Il.java_io_DataOutputStream_II().writeByte(i_I_.lll);
                            continue;
                        }
                        i_Il.java_io_DataOutputStream_II().writeByte(-1);
                        i_Il.java_io_DataOutputStream_II().writeInt(i_I_.lll);
                    }
                } else if (i_lO2.size() > 0) {
                    I_Ol.II__(I_0_.Ilo("\u9e38\u9e0b\u9ee7\u9edc\u9ea1\u9e91\u9f22\u9f40\u9f34\u9f2b\u9f1f\u9ffe\u9fd7\u9ffb\u9f8a\ua075\ua059\ua02e\ua013\ua0e7\ua094", 40520));
                    i_Il = new I_Il(-60);
                    for (n = 0; n < i_lO2.size(); ++n) {
                        Ilol ilol = (Ilol)i_lO2.elementAt(n);
                        i_Il.java_io_DataOutputStream_II().writeInt(ilol.IOI_);
                    }
                }
                i_Il.java_io_DataOutputStream_II().writeByte((byte)Ilol.Ilol_II().IOI1);
                if (i_Il != null) {
                    this.var_I1_o_II.IIlO(i_Il);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIo1(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-20);
            i_Il.java_io_DataOutputStream_II().writeShort(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IoOl() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-15);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IoO1() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-16);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II_1(String string) {
        I_Il i_Il = null;
        try {
            I_Ol.II__(I_0_.Ilo("\u9e1b\u9e02\u9ee8\u9ec1\u9ee4\u9e80\u9f6a\u9f40\u9f34\u9f7f", 40520) + string);
            i_Il = new I_Il(44);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void I0o_() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-87);
            this.var_I1_o_II = I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI ? I_0O.I_0O_III() : I_0O.II();
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void I0oO() {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)6);
            this.var_I1_o_II = I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI ? I_0O.I_0O_III() : I_0O.II();
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void III0() {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)7);
            this.var_I1_o_II = I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI ? I_0O.I_0O_III() : I_0O.II();
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IoO_() {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)8);
            this.var_I1_o_II = I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI ? I_0O.I_0O_III() : I_0O.II();
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IoOO() {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)13);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIII(String string) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(53);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIo_(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(76);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIoO(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(77);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, byte by2, int n) {
        I_Ol.II__(I_0_.Ilo("\u9e18\u9e2b\u9ec7\u9efc\u9e81\u9eb1\u9f22\u9f77\u9f13\u9f7f\u9f2e\u9fd1\u9ffd\u9f82\u9fbf\ua04b", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-59);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            i_Il.java_io_DataOutputStream_II().writeByte(by2);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIo0(int n) {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)10);
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II_0(String string) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(17);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III1(String string, int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-72);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II_o(String string) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-71);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III_(String string, String string2) {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)16);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            i_Il.java_io_DataOutputStream_II().writeUTF(string2);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III_(String string, int n) {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)18);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIoo(int n) {
        II.void_II();
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-67);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II = I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI ? I_0O.I_0O_III() : I_0O.II();
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Il(int n) {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)37);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlI(int n) {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)41);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlII(int n) {
        I_Il i_Il = null;
        try {
            i_Il = I_0_.I_Il_III((byte)39);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III1(short s) {
        I_Ol.II__(I_0_.Ilo("\u9e2f\u9e02\u9ef2\u9e85\u9ead\u9e8e\u9f63\u9f46\u9f25\u9f7f\u9f17\u9ff9\u9f81\u9ffb", 40520) + s);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-32);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            this.var_I1_o_II = I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI ? I_0O.I_0O_III() : I_0O.II();
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IoO0() {
        I_Ol.II__(I_0_.Ilo("\u9e3b\u9e02\u9ee8\u9ec1\u9ee4\u9e8e\u9f63\u9f51\u9f60\u9f30\u9f18\u9ffb\u9fd0\u9fb2\u9f94\ua07c", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-33);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void IoOo() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-38);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlIl(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-38);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void Io0() {
        I_Ol.II__(I_0_.Ilo("\u9e2e\u9e0e\u9ee8\u9ecc\u9eb7\u9e8b\u9f4e\u9f4e\u9f21\u9f3b\u9f33\u9ffc\u9fcc", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-39);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIIO(byte by) {
        I_Ol.II__(I_0_.Ilo("\u9e3a\u9e02\u9ef7\u9ed0\u9ea1\u9e90\u9f76\u9f01\u9f22\u9f3e\u9f19\u9fbd\u9fd5\u9fb6\u9f9b\ua07e\ua05d", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-63);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIO(String string) {
        I_Ol.II__(I_0_.Ilo("\u9e04\u9e08\u9ee1\u9ecc\u9eaa\u9ec3\u9f30", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-101);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            i_Il.java_io_DataOutputStream_II().writeByte(1);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III0(byte by) {
        I_Ol.II__(I_0_.Ilo("\u9e3a\u9e02\u9ef7\u9ed0\u9ea1\u9e90\u9f76\u9f01\u9f2d\u9f3e\u9f19\u9ff4\u9fdf\u9ffb\u9f8e\ua06b\ua05d\ua032", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-34);
            i_Il.java_io_DataOutputStream_II().writeByte(2);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIlO(int n, int n2) {
        I_Il i_Il = null;
        try {
            boolean bl = true;
            I_Il i_Il2 = new I_Il(-30);
            i_Il2.java_io_DataOutputStream_II().writeByte(16);
            i_Il = i_Il2;
            i_Il2.java_io_DataOutputStream_II().writeByte(n);
            i_Il2.java_io_DataOutputStream_II().writeShort(n2);
            I_Ol.II__(I_0_.Ilo("\u9e2f\u808a\u9eef\u9e85\u9eb0\u9fe0\u9f6c\u9f46\u9f60\u9f2b\u9f17\u815c\u9fd1\u9ffb\u9f94\ua11a\ua056\ua030\ua056\ua0db\ua0e1\ua09e\ua0cf\ua131", 40520) + n2 + I_0_.Ilo("\u9e68\u9e13\u9eff\u9ed5\u9ea1\u9ede\u9f22", 40520) + n);
            this.var_I1_o_II.IIlO(i_Il2);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III(byte by, I_lO i_lO) {
        I_Ol.II__(I_0_.Ilo("\u9e3a\u9e02\u9ef7\u9ed0\u9ea1\u9e90\u9f76\u9f01\u9f32\u9f3a\u9f0d\u9ff2\u9fc9\u9fa9\u9f99\ua07c\ua018\ua036\ua015\ua0e1\ua0dd\ua0bc\ua09c\ua12c\ua110", 40520) + by);
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-74);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI) {
                this.var_I1_o_II = I_0O.I_0O_III();
            } else {
                III1 = true;
                this.var_I1_o_II = I_0O.II();
            }
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlI1(int n) {
        I_Ol.II__(I_0_.Ilo("\u9e3a\u9e02\u9ef7\u9ed0\u9ea1\u9e90\u9f76\u9f01\u9f2d\u9f3e\u9f19\u9ff4\u9fdf\u9ffb\u9f8e\ua06b\ua05d\ua032", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-91);
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void Io0I() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-107);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(String string, byte by) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-96);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlI_(int n) {
        I_Ol.II__(I_0_.Ilo("\u9e0f\u9e32\u9ecf\u9e85\u9e90\u9eab\u9f43\u9f62\u9f08\u9f7f\u9f3a\u9fdc\u9fe9\u9f9a", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-118);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIII(byte by, int n) {
        I_Ol.II__(I_0_.Ilo("\u9e29\u9e03\u9ee2\u9e85\u9ea2\u9e91\u9f6b\u9f44\u9f2e\u9f3b", 40520));
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-99);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (by == 1 || by == 2) {
                i_Il.java_io_DataOutputStream_II().writeInt(n);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, int n, byte by2, int n2, int n3) {
        I_Il i_Il = null;
        try {
            I_Ol.II__(I_0_.Ilo("\u9e23\u9e0e\u9ea6\u9ec2\u9eb1\u9e8a\u9f22\u9f40\u9f23\u9f2b\u9f17\u9ff2\u9fd2\u9fe6\u9fda", 40520) + by + I_0_.Ilo("\u9e68\u9e0e\u9ef2\u9ec0\u9ea9\u9ec3\u9f6b\u9f45\u9f7d\u9f7f", 40520) + n);
            i_Il = new I_Il(-100);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (by == 0) {
                i_Il.java_io_DataOutputStream_II().writeShort(n);
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
                i_Il.java_io_DataOutputStream_II().writeInt(n2);
                i_Il.java_io_DataOutputStream_II().writeInt(n3);
                I_Ol.II__(I_0_.Ilo("\u9e23\u9e0e\u9ea6\u9ec2\u9eb1\u9e8a\u9f22\u9f52\u9f2f\u9f7f\u9f12\u9fe8\u9fd3\u9fb5\u9f9d\ua039", 40520) + n3);
            }
            if (by == 1 || by == 2) {
                i_Il.java_io_DataOutputStream_II().writeShort(n);
            }
            if (by == 3) {
                i_Il.java_io_DataOutputStream_II().writeShort(n);
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
                i_Il.java_io_DataOutputStream_II().writeInt(n2);
            }
            if (by == 4) {
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
                i_Il.java_io_DataOutputStream_II().writeByte(n2);
                I_Ol.II__(I_0_.Ilo("\u9e2b\u9e12\u9ef4\u9ed7\u9e90\u9e82\u9f60\u9f1c\u9f60", 40520) + by2 + I_0_.Ilo("\u9e68\u9e17\u9ee7\u9ec2\u9ea1\u9ede\u9f22", 40520) + n2);
            }
            if (by == 5) {
                i_Il.java_io_DataOutputStream_II().writeShort(n);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIII(byte by, byte by2) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-103);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            I_Ol.II__(I_0_.Ilo("\u9e65\u9e4a\u9eab\u9e88\u9ee9\u9ece\u9f2f\u9f0c\u9f6d\u9f72\u9f53\u9fb0\u9fcf\u9fbe\u9f88\ua06f\ua051\ua034\ua013\ua0b8\ua099\ua0f3\ua0d2", 40520) + by + I_0_.Ilo("\u9e68\u9e47\u9ea6", 40520) + by2);
            if (by != 0) {
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlIO(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-104);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIIo(byte by) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-108);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void Io0l() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-105);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIl(byte by) {
        I_Il i_Il = null;
        try {
            I_Ol.II__(I_0_.Ilo("\u9e0e\u9e32\u9ec8\u9ef6\u9e8d\u9eac\u9f4c", 40520));
            i_Il = new I_Il(125);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void III(I_lO i_lO) {
        I_Il i_Il = null;
        try {
            I_Ol.II__(I_0_.Ilo("\u9e01\u9e2a\u9ec7\u9ee2\u9e81\u9ec3\u9f51\u9f6e\u9f15\u9f0d\u9f3d\u9fd8\u9f9c\u9fa8\u9f93\ua063\ua05d\ua06a\ua056", 40520) + i_lO.size());
            i_Il = new I_Il(-111);
            i_Il.java_io_DataOutputStream_II().writeShort(i_lO.size());
            if (i_lO.size() > 0) {
                for (int i = 0; i < i_lO.size(); ++i) {
                    I_Ol.II__(I_0_.Ilo("\u9e2f\u9e12\u9eef\u9e85\u9ea8\u9e86\u9f6c\u9f01\u9f33\u9f2b\u9f0c\u9fbd", 40520) + ((I1Ol)i_lO.elementAt((int)i)).IIoo);
                    i_Il.java_io_DataOutputStream_II().writeUTF(((I1Ol)i_lO.elementAt((int)i)).IIoo);
                }
            }
            if (I_0O.I_0O_III().IlI_() && !I_0O.I_0O_III().I0OI) {
                this.var_I1_o_II = I_0O.I_0O_III();
            } else {
                this.var_I1_o_II = I_0O.II();
                III1 = true;
            }
            this.var_I1_o_II.IIlO(i_Il);
            this.var_I1_o_II = I_0O.II();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, int n, byte[] byArray) {
        I_Il i_Il = null;
        try {
            I_Ol.II__(I_0_.Ilo("\u9e1b\u9e22\u9ed4\u9ef3\u9e81\u9eb1\u9f22\u9f65\u9f01\u9f0b\u9f3f", 40520));
            i_Il = new I_Il(-110);
            i_Il.java_io_DataOutputStream_II().writeByte(1);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            if (byArray != null) {
                n = byArray.length;
                i_Il.java_io_DataOutputStream_II().writeShort(n);
                i_Il.java_io_DataOutputStream_II().write(byArray, 0, n);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte[] byArray) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-113);
            for (int i = 0; i < I1_I.var_I_0o_arr_IIII.length; ++i) {
                i_Il.java_io_DataOutputStream_II().writeByte(byArray[i]);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void Io01() {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-114);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlI0(int n) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-30);
            i_Il.java_io_DataOutputStream_II().writeByte(63);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(int n, short s) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-30);
            i_Il.java_io_DataOutputStream_II().writeByte(64);
            i_Il.java_io_DataOutputStream_II().writeInt(n);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIOI(String string) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(66);
            i_Il.java_io_DataOutputStream_II().writeUTF(string);
            I_Ol.II__(I_0_.Ilo("\u9e76\u9e59\u9eb8\u9ec2\u9ea1\u9e97\u9f45\u9f44\u9f34\u9f16\u9f13\u9ffa\u9ffe\u9fa2\u9fb4\ua078\ua055\ua032\ua056\ua0a8\ua094", 40520) + string);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIIl(byte by, byte by2) {
        I_Il i_Il = new I_Il(-127);
        try {
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            if (by2 > 0) {
                i_Il.java_io_DataOutputStream_II().writeByte(by2);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIl(int n, int n2) {
        I_Il i_Il = new I_Il(127);
        try {
            i_Il.java_io_DataOutputStream_II().writeByte(n);
            if (n2 != -1) {
                i_Il.java_io_DataOutputStream_II().writeShort(n2);
            }
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i_Il.I0Oo();
        }
    }

    public void I0__() {
        I_Il i_Il = new I_Il(69);
        try {
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
        }
        finally {
            i_Il.I0Oo();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void II(byte by, byte by2, short s, short s2) {
        I_Il i_Il = null;
        try {
            i_Il = new I_Il(-45);
            i_Il.java_io_DataOutputStream_II().writeByte(20);
            i_Il.java_io_DataOutputStream_II().writeByte(by);
            i_Il.java_io_DataOutputStream_II().writeShort(Ilol.Ilol_II().I_o_);
            i_Il.java_io_DataOutputStream_II().writeShort(Ilol.Ilol_II().I_oO);
            i_Il.java_io_DataOutputStream_II().writeByte(by2);
            i_Il.java_io_DataOutputStream_II().writeShort(s);
            i_Il.java_io_DataOutputStream_II().writeShort(s2);
            this.var_I1_o_II.IIlO(i_Il);
            return;
        }
        catch (Exception exception) {
        }
        finally {
            i_Il.I0Oo();
        }
    }

    private static /* synthetic */ String Ilo(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

