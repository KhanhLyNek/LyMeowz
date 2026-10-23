package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import main.GameMidlet;

public final class I_0l
extends IO1_
implements I1_1 {
    public static String[] II1I;
    public static String[] II1l;
    public static byte II1O;
    public static boolean[] var_boolean_arr_IIl;
    public static short[] III0;
    private static int var_int_IIl;
    public static boolean I0_l;
    public static byte[] IIlI;
    private I1Il[] III;
    private static I1Il IIO1;
    private int Ioll;
    private static String Il1l;
    private static String Il11;
    private static String Il1_;
    private static String Il1O;
    private static String Il10;
    private static String II0_;
    public static String IIo_;
    public static boolean I0_1;
    public static String IlI1;
    public static int IoII;
    public static boolean I1ll;
    private static int I1Ol;
    public static int[] IIOO;
    public static int l1_I;
    private static int I1O1;
    public static boolean I0__;
    public static int percent;
    public static int l1_l;
    public static int l1_1;
    public static boolean I__o;
    private static I1Il IIO_;
    public static int III_;
    public static boolean I0_O;
    public static boolean I0_0;

    public I_0l() {
        System.getProperty(I_0l.Il00("\u1cfa\u1cd7\u1cba\u1cd8\u1d66\u1d5b\u1d3d\u1d0b\u1df4\u1dc2\u1da6\u1d8d\u1e7e\u1e5f\u1e24\u1e04\u1ea7\u1ec1\u1eaa\u1e83\u1f6c", 7321));
        this.Io1_();
        if (!II.var_boolean_IIIl) {
            var_int_IIl = 0;
            this.I0o_();
        }
        I1_I.IIlI(-1, -1);
        I1_I.Io1 = 100;
        I1_I.Io1I = 200;
        I_0l.Io_1();
        boolean bl = false;
        if (bl) {
            IIo_ = II0_;
            IIo_ = IO10.l_lI == 1 ? II0_ : Il10;
        } else {
            IIo_ = Il11;
            IIo_ = IO10.l_lI == 1 ? Il11 : Il1l;
        }
    }

    private void Io1_() {
        this.Ioll = 0;
        String string = I_O1.IIl(I_0l.Il00("\u1cf8\u1cdb\u1cb4", 7321));
        this.III = new I1Il[IO1l.l_I0 > 1 ? 3 + this.Ioll : (I0l_.lIll ? 4 : 5) + this.Ioll];
        int n = II.var_int_IIl1 - 15 * this.III.length + 28;
        for (int i = 0; i < this.III.length; ++i) {
            switch (i) {
                case 0: {
                    this.III[0] = new I1Il("", this, 3, null);
                    if (string == null) {
                        this.III[0].IIoO = IO11.lIIl;
                        if (I_O1.II(I_0l.Il00("\u1cec\u1ccb\u1cb2\u1c84\u1d54\u1d5b", 7321) + l1_I) == null) break;
                        this.III[0].IIoO = IO11.Il_l;
                        break;
                    }
                    if (string.equals("")) {
                        this.III[0].IIoO = IO11.lIIl;
                        if (I_O1.II(I_0l.Il00("\u1cec\u1ccb\u1cb2\u1c84\u1d54\u1d5b", 7321) + l1_I) == null) break;
                        this.III[0].IIoO = IO11.Il_l;
                        break;
                    }
                    this.III[0].IIoO = IO11.lII1 + I_0l.Il00("\u1ca3\u1c98", 7321) + string;
                    if (this.III[0].IIoO.length() <= 23) break;
                    this.III[0].IIoO = this.III[0].IIoO.substring(0, 23);
                    I1Il i1Il = this.III[0];
                    i1Il.IIoO = i1Il.IIoO + I_0l.Il00("\u1cb7\u1c96\u1cf9", 7321);
                    break;
                }
                case 1: {
                    if (this.Ioll == 1) {
                        this.III[1] = new I1Il("", this, 10100, null);
                        this.III[1].IIoO = IO11.lIIl;
                        break;
                    }
                    this.III[1] = new I1Il(IO11.I1I0, this, 7, null);
                    break;
                }
                case 2: {
                    if (this.Ioll == 1) {
                        this.III[2] = new I1Il(IO11.I1I0, this, 7, null);
                        break;
                    }
                    this.III[2] = new I1Il("", this, 17, null);
                    break;
                }
                case 3: {
                    if (this.Ioll == 1) {
                        this.III[3] = new I1Il("", this, 17, null);
                        break;
                    }
                    this.III[3] = new I1Il(I_0l.Il00("\u1cda\u1c58\u1cbe\u1cd6\u1c04\u0383\u1d27", 7321), this, 8, null);
                    break;
                }
                case 4: {
                    if (this.Ioll == 1) {
                        this.III[4] = new I1Il(I_0l.Il00("\u1cda\u1c58\u1cbe\u1cd6\u1c04\u0383\u1d27", 7321), this, 8, null);
                        break;
                    }
                    this.III[4] = new I1Il(I_0l.Il00("\u1cca\u0255\u1cb6\u1cd6\u1d5c\u1d64", 7321), this, 7000, null);
                    break;
                }
                case 5: {
                    this.III[5] = new I1Il(I_0l.Il00("\u1cca\u0255\u1cb6\u1cd6\u1d5c\u1d64", 7321), this, 7000, null);
                }
            }
            this.III[i].I1I = n;
            this.III[i].IOlI();
            this.III[i].I1 = (II.var_int_IIl - this.III[i].IoII) / 2;
            n += 30;
        }
    }

    public static void Io1O() {
        I_0l.II10(IIo_);
    }

    public static void II10(String string) {
        try {
            Object object;
            IIOO = new int[3];
            String[] stringArray = I_Ol.II(string.trim(), I_0l.Il00("\u1cb5", 7321), 0);
            IO11.III(Byte.parseByte(stringArray[stringArray.length - 2]));
            II1I = new String[stringArray.length - 2];
            II1l = new String[stringArray.length - 2];
            III0 = new short[stringArray.length - 2];
            IIlI = new byte[stringArray.length - 2];
            var_boolean_arr_IIl = new boolean[2];
            for (int i = 0; i < stringArray.length - 2; ++i) {
                object = I_Ol.II(stringArray[i].trim(), I_0l.Il00("\u1ca3", 7321), 0);
                I_0l.II1I[i] = object[0];
                I_0l.II1l[i] = object[1];
                I_0l.III0[i] = Short.parseShort((String)object[2]);
                I_0l.IIlI[i] = Byte.parseByte(((String)object[3]).trim());
                byte by = IIlI[i];
                IIOO[by] = IIOO[by] + 1;
            }
            II1O = Byte.parseByte(stringArray[stringArray.length - 1]);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new DataOutputStream(byteArrayOutputStream);
            try {
                ((DataOutputStream)object).writeByte(IO11.IllI);
                ((DataOutputStream)object).writeByte(II1I.length);
                for (int i = 0; i < II1I.length; ++i) {
                    ((DataOutputStream)object).writeUTF(II1I[i]);
                    ((DataOutputStream)object).writeUTF(II1l[i]);
                    ((DataOutputStream)object).writeShort(III0[i]);
                    ((DataOutputStream)object).writeByte(IIlI[i]);
                }
                ((DataOutputStream)object).writeByte(II1O);
                I_O1.II(I_0l.Il00("\u1cd7\u1cea\u1cbb\u1c9f\u1d7b\u1d5f", 7321), byteArrayOutputStream.toByteArray());
                ((FilterOutputStream)object).close();
                IOI.IO11();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        if (!I0_O) {
            iO1l.Illl(0);
            iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
        } else {
            II.III1(iO1l);
        }
        IO1I.var_IO1I_II1I.II(iO1l, I_0l.Il00("\u1cef\u1c89\u1cf9\u1cc6\u1d3b\u1d06\u1d7b", 7321) + IO1l.l_I0 + I_0l.Il00("\u1cb0", 7321), II.var_int_IIl - 2, 17, 1, IO1I.IIlO);
        I_0l.II0o(iO1l);
        String string = "";
        if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
            if (III_ == 0) {
                new StringBuffer(String.valueOf(string)).append(II1I[l1_I]).append(I_0l.Il00("\u1cb9\u1cdc\u1cbe\u1c85\u1d76\u1d5b\u1d3d\u1d1c\u1df4\u1dd3\u1dbb", 7321)).toString();
            } else {
                new StringBuffer(String.valueOf(string)).append(II1I[l1_I]).append(I_0l.Il00("\u1cb9\u1cdb\u1cb8\u1c98\u1d7b\u1d51\u1d30\u1d06\u1df4\u1dd4", 7321)).toString();
            }
        }
        if (I__o && !I0_O) {
            IO1I.var_IO1I_II1I.II(iO1l, IlI1, II.var_int_IIl - 2, 2, 1, IO1I.IIlO);
        } else if (IO10.l_lI == 1 && !II.var_boolean_IIIl) {
            IO1I.var_IO1I_II1I.II(iO1l, IlI1, II.var_int_IIl - 2, II.var_int_IIlI - 15, 1, IO1I.IIlO);
        } else {
            IO1I.var_IO1I_II1I.II(iO1l, IlI1, II.var_int_IIl - 2, 2, 1, IO1I.IIlO);
        }
        if (II.var_I1l_II == null) {
            if (!I0_O) {
                if (!I0__) {
                    iO1l.II(I1o_.IlOO, II.var_int_IIll, II.var_int_IIl1 - 32, 3);
                    if (I__o) {
                        if (IIO_ != null) {
                            IIO_.II(iO1l);
                        }
                        iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
                        IO1I.IIII.II(iO1l, IO11.I1OO + percent + I_0l.Il00("\u1cbc", 7321), II.var_int_IIl / 2, II.var_int_IIl1 + 24, 2);
                        I1_I.II(I1_I.II0o, I1_I.IIo, I1_I.IIoI, II.var_int_IIl / 2 - 50, II.var_int_IIl1 + 45, 100, 100.0f, iO1l);
                        I1_I.II(I1_I.II0O, I1_I.III_, I1_I.II00, II.var_int_IIl / 2 - 50, II.var_int_IIl1 + 45, 100, percent, iO1l);
                        return;
                    }
                    IO1I.IIII.II(iO1l, IO11.Ioo0, II.var_int_IIll, II.var_int_IIl1 + 24, 2);
                    if (IIO_ != null) {
                        IIO_.II(iO1l);
                        return;
                    }
                }
            } else {
                int n = II.var_int_IIl1 - 15 * this.III.length - 15;
                if (n < 25) {
                    n = 25;
                }
                if (I1o_.IlOO != null) {
                    iO1l.II(I1o_.IlOO, II.var_int_IIll, n, 3);
                }
                for (n = 0; n < this.III.length; ++n) {
                    this.III[n].II(iO1l);
                }
                iO1l.IIIO(0, 0, II.var_int_IIl, II.var_int_IIlI);
                if (2 + this.Ioll < this.III.length) {
                    if (III_ == -1) {
                        if (II.var_int_IIIO % 20 > 10) {
                            iO1l.II(I1_I.III0, 0, 14, 7, 7, 0, (II.var_int_IIl - IO1I.III_.IIII(this.III[2 + this.Ioll].IIoO) >> 1) - 10, this.III[2 + this.Ioll].I1I + 10, 0);
                            return;
                        }
                    } else {
                        iO1l.II(I1_I.III0, 0, III_ * 7, 7, 7, 0, (II.var_int_IIl - IO1I.III_.IIII(this.III[2 + this.Ioll].IIoO) >> 1) - 10, this.III[2 + this.Ioll].I1I + 9, 0);
                    }
                }
            }
        }
    }

    @Override
    public void void_IIlO() {
        I1Il i1Il;
        if (I1ll) {
            if (++I1Ol == 50) {
                i1Il = null;
                I_0l i_0l = II.var_I_0l_II;
                I1O1 = 30;
                II.III(IO11.I1O1);
                if (II1l != null && l1_I >= 0 && l1_I < II1l.length) {
                    GameMidlet.var_java_lang_String_III = II1l[l1_I];
                }
                if (III0 != null && l1_I >= 0 && l1_I < III0.length) {
                    GameMidlet.II_0 = III0[l1_I];
                }
                i_0l.Io1_();
                II.II(GameMidlet.var_java_lang_String_III, (short)GameMidlet.II_0);
            }
            if (I1Ol >= 100 && I_0O.II().IlI_()) {
                if (II.var_I1o__II == null) {
                    II.var_I1o__II = new I1o_();
                }
                II.var_I1o__II.I0OI();
                I_0_.II().IoOo();
                I1ll = false;
            }
        }
        if (I1O1 > 0) {
            if (--I1O1 == 0) {
                II.III_();
            }
            if (III_ == 2) {
                I1O1 = 0;
                II.III_();
            }
        }
        if (I1O1 <= 0 && I0_0 && ++IoII > 100000) {
            IoII = 0;
        }
        for (int i = 0; i < this.III.length; ++i) {
            try {
                if (i == var_int_IIl) {
                    this.III[i].I__I = true;
                    continue;
                }
                this.III[i].I__I = false;
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        ++I1_I.Io1;
        if (!I0_O && (I0__ || percent == 100)) {
            IIO_ = null;
        }
        super.void_IIlO();
        if (!Ilol.var_boolean_I10I && I0_O && I0_0 && II.var_IO1__II == this && III_ != 2) {
            if (IoII < (IO10.l_lI == 1 ? 2 : 5)) {
                if (I1O1 <= 0) {
                    I1O1 = 30;
                    II.III(IO11.I1O1);
                    II.void_II();
                    return;
                }
            } else if (!I_0O.II().IlI_()) {
                if (I1O1 <= 0) {
                    I1Il i1Il2 = new I1Il(IO11.I_I_, II.var_I_0l_II, 18, null);
                    i1Il = new I1Il(IO11.I_IO, II.var_I_0l_II, 19, null);
                    II.II(IO11.Ilo1 + I_0l.Il00("\u1cb7", 7321) + IO11.IlOI, i1Il2, i1Il);
                    I1O1 = 30;
                    return;
                }
            } else if (I1O1 <= 0) {
                IoII = 0;
            }
        }
    }

    private void I0o_() {
        I_Ol.II__(I_0l.Il00("\u1cf5\u1cd7\u1cb6\u1c92\u1d35\u1d67\u1d30\u1d00\u1df4\u1dd5\u1da1\u1dd3\u1e2d", 7321) + I0_O + I_0l.Il00("\u1cb9\u1ccb\u1cb2\u1c9a\u1d70\u1d57\u1d27\u1d4f\u1db1", 7321) + var_int_IIl);
        ((IO1_)this).III0 = I0_O ? new I1Il("", this, this.III[I_0l.var_int_IIl].IIO, null) : IIO_;
    }

    public static void IO11() {
    }

    @Override
    public void I_Il() {
        if (II.var_boolean_IIIl) {
            if (IIO1 != null && IIO1.II0o()) {
                this.II(14, null);
                return;
            }
            if (!I0_O) {
                if (IIO_ != null && IIO_.II0o()) {
                    IIO_.I0lO();
                }
                super.I_Il();
                return;
            }
            for (int i = 0; i < this.III.length; ++i) {
                if (this.III[i] == null || !this.III[i].II0o() || (III_ == -1 || III_ == 0) && this.III[i].IIoO.indexOf(IO11.I101) == -1) continue;
                this.III[i].I0lO();
            }
        } else {
            if (IO10.l_lI == 1 && II.var_boolean_arr_II[13]) {
                II.var_boolean_arr_II[13] = false;
                if (IIO1 != null) {
                    IIO1.I0lO();
                }
            }
            if (I0_O) {
                int n;
                if (II.var_boolean_arr_II[8]) {
                    n = this.III.length - 1;
                    II.var_boolean_arr_II[8] = false;
                    if (++var_int_IIl > n) {
                        var_int_IIl = 0;
                    }
                    this.I0o_();
                }
                if (II.var_boolean_arr_II[2]) {
                    n = this.III.length - 1;
                    II.var_boolean_arr_II[2] = false;
                    if (--var_int_IIl < 0) {
                        var_int_IIl = n;
                    }
                    this.I0o_();
                }
            }
        }
        super.I_Il();
    }

    public static void Io10() {
        byte[] byArray;
        byte[] byArray2 = byArray = I0l_.lIll ? null : I_O1.II(I_0l.Il00("\u1cd7\u1cea\u1cbb\u1c9f\u1d7b\u1d5f", 7321));
        if (byArray == null) {
            I_0l.II10(IIo_);
        } else {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                IIOO = new int[3];
                I_Ol.II__(I_0l.Il00("\u1cb9\u1cf6\u1c85\u1c9a\u1d7c\u1d5a\u1d38\u1d52\u1dac\u1d90", 7321) + dataInputStream.available());
                IO11.III(dataInputStream.readByte());
                int n = dataInputStream.readByte();
                II1I = new String[n];
                II1l = new String[n];
                III0 = new short[n];
                IIlI = new byte[n];
                for (int i = 0; i < n; ++i) {
                    I_0l.II1I[i] = dataInputStream.readUTF();
                    I_0l.II1l[i] = dataInputStream.readUTF();
                    I_0l.III0[i] = dataInputStream.readShort();
                    I_0l.IIlI[i] = dataInputStream.readByte();
                    byte by = IIlI[i];
                    IIOO[by] = IIOO[by] + 1;
                }
                II1O = dataInputStream.readByte();
                dataInputStream.close();
                IOI.IO11();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    @Override
    public void I0l_() {
        I11.IOlI();
        I1_I.Io1I = 0;
        I1_I.Io1 = 0;
        this.Io1_();
        I0_l = false;
        II.var_I1o__II = null;
        String string = I_O1.IIl(I_0l.Il00("\u1ccb\u1cdd\u1ca4\u1ca0\u1d70\u1d46\u1d20\u1d1b\u1dfe\u1dde", 7321));
        if ((string != null && string != "" ? Integer.parseInt(string) : -1) > 0) {
            I0_O = true;
            II.III(0);
        }
        I0__ = true;
        if (2 + this.Ioll < this.III.length && II1I != null && l1_I >= 0 && l1_I < II1I.length) {
            this.III[2 + this.Ioll].IIoO = IO11.I101 + I_0l.Il00("\u1ca3\u1c98", 7321) + II1I[l1_I];
        }
        ((IO1_)this).III0 = new I1Il("", this, this.III[I_0l.var_int_IIl].IIO, null);
        if (1 + this.Ioll < this.III.length) {
            this.III[1 + this.Ioll].IIoO = IO11.I1I0;
        }
        if (this.III.length == 4 + this.Ioll && 3 + this.Ioll < this.III.length) {
            this.III[3 + this.Ioll].IIoO = I_0l.Il00("\u1cda\u1c58\u1cbe\u1cd6\u1c04\u0383\u1d27", 7321);
        }
        I_0l.Io_1();
        Ilol.var_boolean_I10I = false;
        IO10.IIl1();
        super.I0l_();
    }

    public void Io1o() {
        I1_I.Io1I = 0;
        I1_I.Io1 = 0;
        this.Io1_();
        I0_l = false;
        II.var_I1o__II = null;
        String string = I_O1.IIl(I_0l.Il00("\u1ccb\u1cdd\u1ca4\u1ca0\u1d70\u1d46\u1d20\u1d1b\u1dfe\u1dde", 7321));
        if ((string != null && string != "" ? Integer.parseInt(string) : -1) > 0) {
            I0_O = true;
            II.III(0);
        }
        I0__ = true;
        if (2 + this.Ioll < this.III.length && II1I != null && l1_I >= 0 && l1_I < II1I.length) {
            this.III[2 + this.Ioll].IIoO = IO11.I101 + I_0l.Il00("\u1ca3\u1c98", 7321) + II1I[l1_I];
        }
        ((IO1_)this).III0 = new I1Il("", this, this.III[I_0l.var_int_IIl].IIO, null);
        if (1 + this.Ioll < this.III.length) {
            this.III[1 + this.Ioll].IIoO = IO11.I1I0;
        }
        if (this.III.length == 4 + this.Ioll && 3 + this.Ioll < this.III.length) {
            this.III[3 + this.Ioll].IIoO = I_0l.Il00("\u1cda\u1c58\u1cbe\u1cd6\u1c04\u0383\u1d27", 7321);
        }
        super.I0l_();
    }

    public void IO_() {
        if (II.var_I_0l_II == null) {
            II.var_I_0l_II = new I_0l();
        }
        l1_1 = 0;
        percent = 0;
        I0_1 = true;
        II.var_I_0l_II.Io_l();
        I__o = false;
        I_0l.IIO_.I__I = true;
        ((IO1_)this).III0 = new I1Il("", this, 2, null);
    }

    public void Io_() {
        I1O1 = 30;
        I_0O.II().close();
        if (II1l != null && l1_I >= 0 && l1_I < II1l.length) {
            GameMidlet.var_java_lang_String_III = II1l[l1_I];
        }
        if (III0 != null && l1_I >= 0 && l1_I < III0.length) {
            GameMidlet.II_0 = III0[l1_I];
        }
        I_O1.IIIl(I_0l.Il00("\u1cea\u1cce\u1ca4\u1c93\u1d79\u1d51\u1d30\u1d06", 7321), l1_I);
        if (IIlI != null && l1_I >= 0 && l1_I < IIlI.length && IIlI[l1_I] != IO11.IllI) {
            IO11.III(IIlI[l1_I]);
        }
        if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
            I1o_.Illl = II1I[l1_I];
        }
        this.Io1_();
        I0_O = true;
        IoII = 0;
        III_ = -1;
        I0_0 = true;
    }

    @Override
    public void II(int n, Object object) {
        I1Il i1Il;
        I1o_ i1o_;
        String string;
        boolean bl;
        I_Ol.II__(I_0l.Il00("\u1ce9\u1cdd\u1ca5\u1c90\u1d7a\u1d46\u1d3e\u1d52\u1de5\u1dc2\u1da0\u1d80\u1e6a\u1e0c\u1e18\u1e0f\u1efb\u1ede\u1ea2\u1e94\u1f49\u1f4d\u1f30\u1f16\u1fd2\u1fc3\u1fcd\u1fbb\u1f98\u2072", 7321) + n);
        if (n == 1000) {
            II.void_II();
        }
        if (n == 1 || n == 4) {
            I_0O.II().close();
            I0_0 = false;
            IoII = 0;
            I0_O = true;
            III_ = 0;
            I__o = false;
            I_O1.I_10();
            this.I0l_();
        }
        if (n == 2) {
            I0_1 = false;
            IIO_ = new I1Il(IO11.Iooo, this, 4, null);
            new I1Il(IO11.Iooo, this, 4, null).I1 = II.var_int_IIl / 2 - IO1_.l_Io / 2;
            I_0l.IIO_.I1I = II.var_int_IIl1 + 65;
            ((IO1_)this).IIl = null;
            if (!II.var_boolean_IIIl) {
                I_0l.IIO_.I1 = II.var_int_IIl / 2 - IO1_.l_Io / 2;
                I_0l.IIO_.I1I = II.var_int_IIlI - IO1_.llo_ - 1;
            }
            ((IO1_)this).III0 = new I1Il("", this, 4, null);
            if (!I__o) {
                I_0_.II().III((byte)1, null);
                if (!II.var_boolean_IIIl) {
                    I_0l.IIO_.I__I = true;
                    ((IO1_)this).III0 = new I1Il("", this, 4, null);
                }
                I__o = true;
            }
        }
        if (n == 3) {
            if (II.var_I1o__II == null) {
                II.var_I1o__II = new I1o_();
            }
            II.var_I1o__II.I0l_();
            bl = I_O1.IIl(I_0l.Il00("\u1cf8\u1cdb\u1cb4", 7321)) == null ? false : !I_O1.IIl(I_0l.Il00("\u1cf8\u1cdb\u1cb4", 7321)).equals("");
            boolean bl2 = I_O1.IIl(I_0l.Il00("\u1cec\u1ccb\u1cb2\u1c84\u1d54\u1d5b", 7321) + l1_I) == null ? false : !I_O1.IIl(I_0l.Il00("\u1cec\u1ccb\u1cb2\u1c84\u1d54\u1d5b", 7321) + l1_I).equals("");
            if (!bl && !bl2) {
                II.void_II();
                string = I_O1.IIl(I_0l.Il00("\u1cec\u1ccb\u1cb2\u1c84\u1d54\u1d5b", 7321) + l1_I);
                if (string != null && !string.equals("")) {
                    i1o_ = II.var_I1o__II;
                    I1o_.IOo = true;
                    II.void_II();
                    I_0_.II().Io__();
                    I_0_.II().II(string, "", I_0l.Il00("\u1ca8\u1c96\u1ce7\u1cd8\u1d27", 7321), (byte)1);
                } else {
                    I_0_.II().IIO("");
                }
            } else {
                II.var_I1o__II.I0OI();
            }
            if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
                I1o_.Illl = II1I[l1_I];
            }
        }
        if (n == 10100) {
            if (II.var_I1o__II == null) {
                II.var_I1o__II = new I1o_();
            }
            II.var_I1o__II.I0l_();
            II.void_II();
            I_0_.II().IIO("");
            I_Ol.II__(I_0l.Il00("\u1ced\u1cd9\u1cb8\u1cd6\u1d60\u1d47\u1d36\u1d00\u1db1\u1dd1\u1da0", 7321));
            II.IIIO();
            if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
                I1o_.Illl = II1I[l1_I];
            }
        }
        if (n == 5) {
            I_0l.Io1O();
            if (II1I == null || II1I.length == 1) {
                return;
            }
            I_lO i_lO = new I_lO("");
            for (int i = 0; i < II1I.length; ++i) {
                i_lO.addElement(new I1Il(II1I[i], this, 6, null));
            }
            II.var_I_II_II.II(i_lO);
            if (!II.var_boolean_IIIl) {
                II.var_I_II_II.llII = l1_I;
            }
        }
        if (n == 6) {
            l1_I = II.var_I_II_II.llII;
            this.Io_();
        }
        if (n == 7) {
            if (II.var_I1o__II == null) {
                II.var_I1o__II = new I1o_();
            }
            II.var_I1o__II.I0l_();
        }
        if (n == 8) {
            bl = I_O1.III(I_0l.Il00("\u1cf5\u1cd7\u1ca0\u1cb1\u1d67\u1d55\u1d23\u1d1a\u1df8\u1dd3", 7321)) == 1;
            I_lO i_lO = new I_lO(I_0l.Il00("\u1cfa\u1cd9\u1ca2\u1cd6\u1d7d\u1d5d\u1d3d\u1d1a", 7321));
            i_lO.addElement(new I1Il(IO11.IlIO, this, 9, null));
            i_lO.addElement(new I1Il(IO11.Il1l, this, 10, null));
            i_lO.addElement(new I1Il(I_0l.Il00("\u1cda\u0215\u1ca7\u1cd6\u1d7b\u1d5c\u03fe\u1d06\u1db1\u1dd4\u0320\u1dce\u1e61\u1e45\u008c\u1e1f", 7321), this, 9100, null));
            II.var_I_II_II.II(i_lO);
            II.var_I_II_II.llII = bl ? 0 : 1;
        }
        if (n == 9100) {
            I1Il i1Il2 = new I1Il(IO11.I_I_, this, 9101, null);
            i1Il = new I1Il(IO11.I_IO, this, 16, null);
            II.II(I_0l.Il00("\u1ccd\u021b\u1cbe\u1cd6\u1d79\u0395\u1d3a\u1d52\u1df6\u1d43\u1da6\u1dce\u1e69\u00c3\u1e6b\u1e06\u1ee0o\u1eb2\u1ec6\u1f61\u1f45\u1f37\u1f03\u1faf\u1fda\u1fd6\u1fae\u1fdd\u2034\u2050\u2032\u2016\u3e3b\u20d9\u20b1\u20d5\u2126\u2107\u2172\u213c\u21d2\u2186\u21f1\u21cd\u224f\u3c8c\u2224\u2249\u22e3\u3c18\u22b2\u22c5\u236a\u3df2\u232b\u2341\u23ed\u3d3e\u23d0\u23ba\u23d2\u243b\u2474\u2431\u249a\u24f9\u2496\u24a3\u3a59\u2567\u2512\u253a\u2518\u257b\u25c0\u25aa\u25cc\u2669\u38e1\u2669\u38cb\u26e9\u26ce\u26e5\u268c\u26b3\u39fd\u272f\u2707\u2751", 7321), i1Il2, i1Il);
        }
        if (n == 9101) {
            II.III_();
            II.var_IO1__II = new IOOl(true);
        }
        if (n == 9) {
            I_O1.IIIl(I_0l.Il00("\u1cf5\u1cd7\u1ca0\u1cb1\u1d67\u1d55\u1d23\u1d1a\u1df8\u1dd3", 7321), 1);
            II.II(IO11.IO1, 8885, null);
        }
        if (n == 10) {
            I_O1.IIIl(I_0l.Il00("\u1cf5\u1cd7\u1ca0\u1cb1\u1d67\u1d55\u1d23\u1d1a\u1df8\u1dd3", 7321), 0);
            II.II(IO11.IO1, 8885, null);
        }
        if (n == 11) {
            if (II.var_I1o__II == null) {
                II.var_I1o__II = new I1o_();
            }
            II.var_I1o__II.I0l_();
            string = I_O1.IIl(I_0l.Il00("\u1cec\u1ccb\u1cb2\u1c84\u1d54\u1d5b", 7321) + l1_I);
            if (string != null && !string.equals("")) {
                i1o_ = II.var_I1o__II;
                I1o_.IOo = true;
                II.void_II();
                I_0_.II().Io__();
                I_0_.II().II(string, "", I_0l.Il00("\u1ca8\u1c96\u1ce7\u1cd8\u1d27", 7321), (byte)1);
            } else {
                I_0_.II().IIO("");
            }
            I_Ol.II__(I_0l.Il00("\u1ced\u1cd9\u1cb8\u1cd6\u1d60\u1d47\u1d36\u1d00\u1db1\u1dd1\u1da0", 7321));
        }
        if (n == 12) {
            GameMidlet.II.IIll();
        }
        if (n == 13 && (!I__o || I0_O)) {
            switch (IO10.l_lI) {
                case 1: {
                    IO10.IOlI();
                }
            }
        }
        if (n == 14) {
            I1Il i1Il3 = new I1Il(IO11.I_I_, II.var_I_0l_II, 15, null);
            i1Il = new I1Il(IO11.I_IO, II.var_I_0l_II, 16, null);
            II.II(IO11.lIII, i1Il3, i1Il);
        }
        if (n == 15) {
            I_O1.I_10();
            II.II(IO11.IO1, 8885, null);
        }
        if (n == 16) {
            I1OO.I__o();
            II.var_I1l_II = null;
        }
        if (I0l_.lIll && (n == 17 || n == 18 || n == 5 || n == 7000)) {
            II.III_();
            if (n == 17 || n == 5) {
                II.II(I_0l.Il00("\u1cdb\u021b\u1cb9\u1cd6\u1d7a\u1d52\u1d35\u1d1e\u1df8\u1dde\u1daa\u1dce\u1e6e\u1e44\u0082\u1e4a\u1eea\u1e5b\u1ee7\u1e8b\u01dc\u1f50\u1f63\u1f0f\u1f60\u1fd9\u1f9f\u1fbd\u1f95\u3efb\u2017\u207a\u2012\u20f0\u2043\u20b8\u2092\u2134\u2150\u3ff5\u211f\u21b0\u21cc\u21a6\u3f20\u2262\u220b\u2227\u2288\u22f1\u2287\u22a5\u228d\u3de3\u2303\u232a\u2300\u23f9\u23bf\u23d0\u23b5\u3d51\u246b\u241a\u2410\u2428\u24b9", 7321));
            }
            return;
        }
        if (n == 17) {
            if (II.var_I_01_II == null) {
                II.var_I_01_II = new I_01();
            }
            II.var_I_01_II.I0l_();
        }
        if (n == 18) {
            II.III_();
            I1OO.I__o();
            if (II.var_I_01_II == null) {
                II.var_I_01_II = new I_01();
            }
            II.var_I_01_II.I0l_();
        }
        if (n == 19) {
            if (IO10.l_lI == 1) {
                I1OO.I__o();
                II.var_I1l_II = null;
                return;
            }
            IoII = 0;
            III_ = 0;
            I0_0 = true;
        }
        if (n == 7000) {
            I_Oo.II().I__0();
        }
    }

    public static void II(String string, String string2, short s) {
        if (II1l != null && III0 != null && IIlI != null && II1I != null && string2 != null && string2.length() != 0) {
            if (l1_I < 0 || l1_I >= II1l.length) {
                return;
            }
            if (string != null && string.length() > 0) {
                I_0l.II1I[I_0l.l1_I] = string;
            }
            I_0l.II1l[I_0l.l1_I] = string2;
            I_0l.III0[I_0l.l1_I] = s;
            I_0l.Io_I();
        }
    }

    private static void Io_I() {
        if (II1I != null && II1l != null && III0 != null && IIlI != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeByte(IO11.IllI);
                dataOutputStream.writeByte(II1I.length);
                for (int i = 0; i < II1I.length; ++i) {
                    dataOutputStream.writeUTF(II1I[i]);
                    dataOutputStream.writeUTF(II1l[i]);
                    dataOutputStream.writeShort(III0[i]);
                    dataOutputStream.writeByte(IIlI[i]);
                }
                dataOutputStream.writeByte(II1O);
                dataOutputStream.close();
                I_O1.II(I_0l.Il00("\u1cd7\u1cea\u1cbb\u1c9f\u1d7b\u1d5f", 7321), byteArrayOutputStream.toByteArray());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void Io_l() {
        I1_I.Io1 = 0;
        I1_I.Io1I = 0;
        this.Io1_();
        I0_O = false;
        percent = 0;
        I0__ = false;
        I__o = false;
        l1_1 = 0;
        Ilol.var_boolean_I10I = false;
        if (!I0_O) {
            IIO_ = new I1Il(IO11.lI, this, 2, null);
            new I1Il(IO11.lI, this, 2, null).I__I = true;
            I_0l.IIO_.I1 = II.var_int_IIl / 2 - IO1_.l_Io / 2;
            I_0l.IIO_.I1I = II.var_int_IIl1 + 45;
            if (I_0l.IIO_.I1I > II.var_int_IIlI - 26) {
                I_0l.IIO_.I1I = II.var_int_IIlI - 26;
            }
        }
        if (!II.var_boolean_IIIl) {
            var_int_IIl = 0;
            this.I0o_();
        }
        super.I0l_();
        this.II(2, null);
    }

    public static void II0o(IO1l iO1l) {
        if (IIO1 != null) {
            IO1I.var_IO1I_II1I.II(iO1l, IO11.lII, II.var_int_IIl - 2, II.var_int_IIlI - 15, 1, IO1I.IIlO);
        }
    }

    public static void Io_1() {
        IIO1 = new I1Il("", null, 14, null);
        I_0l.IIO1.I1 = II.var_int_IIl - 78;
        I_0l.IIO1.I1I = II.var_int_IIlI - 26;
    }

    static {
        Il11 = Il1l = I0l_.lIll ? I_0l.Il00("\u1cd4\u1c59\u1cae\u1cd6\u1d76\u1d5c\u03b4\u1d52\u1dde\u1dd6\u1da9\u1d82\u1e64\u1e42\u1e2e\u1e50\u1ee6\u1ece\u1ea1\u1e8a\u1f6c\u1f4a\u1f26\u1f58\u1fb0\u1f94\u1f8b\u1fea\u1fc8\u2026\u200b\u2076\u2049\u20b4\u2087", 7321) : I_0l.Il00("\u1ccf\u1dd1\u1cf7\u1c82\u1d67\u03d1\u1d73\u1d43\u1dab\u1dd4\u1dbd\u1d8f\u1e6a\u1e43\u1e25\u1e5b\u1ea7\u1edc\u1ea2\u1e87\u1f68\u1f4b\u1f21\u1f0b\u1faf\u1fc3\u1fd0\u1fb3\u1fc7\u202d\u200f\u206e\u204d\u20ad\u208d\u20e6\u20d9\u2142\u205a\u2172\u2105\u21e2\u3f4a\u21ee\u21df\u2236\u224f\u2238\u2208\u22ef\u22c8\u22a8\u22d7\u232a\u2357\u2327\u2300\u23ed\u23f0\u23dc\u23b4\u23d2\u2478\u2455\u2434\u2442\u24a6\u2482\u24e1\u24c0\u2526\u2508\u2561\u255c\u25d9\u24c7\u25ed\u2598\u2679\u38cf\u2669\u265b\u26bd\u26c2\u26b7\u2685\u2764\u274d\u272f\u2753\u2751\u27ea\u27d8\u27bd\u2796\u2875\u285b\u2831\u2859\u28f5\u28da\u28b9\u28c9\u2923\u2905\u2964\u295b\u29bb\u2997\u29fc\u29c7\u2a5c\u2b40\u2a68\u2a13\u2af4\u3440\u2ae4\u2ad7\u2b38\u2b45\u2b32\u2b3e\u2b19\u2bf2\u2bd2\u2bef\u2bd4\u2c6d\u2c5d\u2c36\u2c1b\u2cfa\u2cd6\u2cba\u2cdc\u2d72\u2d5f\u2d22\u2d54\u2dbc\u2d98\u2dff\u2dde\u2e3c\u2e12\u2e77\u2e4a\u2ed3\u2fcd\u2ee3\u2e96\u2f73\u31c5\u2f1f\u2f6b\u2f47\u2ff8\u2fc9\u2fbb\u2f9e\u3077\u3059\u3063\u305b\u30e0\u30d6\u30b3\u309c\u317f\u314d\u3127\u3143\u31ef\u31c4\u31a7\u31d3\u3239\u3213\u3272\u3251\u32b1\u3299\u32f2\u32cd\u3356\u3276\u331e\u3329\u330e\u2d7e\u339a\u33ef\u33c2\u3473\u3444\u3434\u3413\u34fc\u34dc\u34e7\u34de\u357b\u354b\u352c\u3501\u35e4\u35c8\u35a0\u35c6\u3664\u3649\u3628\u365e\u36b2\u3696\u36f5\u36d4\u36ca\u3724\u370d\u3770\u372d\u36f3\u3799\u37ac\u3785\u26f3\u3815\u3863\u3849\u38f6\u38c3\u38b1\u3888\u3961\u3943\u397b\u3945\u39fe\u39cc\u39a9\u398a\u3a69\u3a47\u3a2d\u3a4d\u3ae1\u3ace\u3aad\u3ae5\u3acf\u3b29\u3b08\u3b6f\u3b4f\u3ba3\u3b88\u3bfb\u3ba0\u3d7c\u3c14\u3c27\u3c00\u2274\u3c90\u3cf7\u3cd4\u3d69\u3d5e\u3d2a\u3d0d\u3de6\u3dc6\u3df6\u3dd6\u3e2b\u3e50\u3e26\u3e03\u3eec\u3ecf\u3edd\u3eb7\u3ed3\u3f7f\u3f54\u3f37\u3f43\u3fa9\u3f83\u3fe2\u3fc1\u4022\u4009\u4062\u405d\u40c6\u41c6\u40ee\u4099\u417e\u5fce\u416a\u4150\u41b2\u41c3\u41b4\u4184\u4263\u424c\u422c\u4250\u42b0\u42b1\u42ca\u42b8\u429d\u4376\u4355\u433b\u4311\u43b9\u43d5\u43ba\u4399\u4429\u4403\u4465\u4444\u44bb\u4499\u44f7\u44dc\u4527\u457c\u4420\u4548\u45f3\u45d4\u5b20\u45c4\u4632\u4612\u467b\u4604\u460d\u46ff\u46da\u46b3\u4695\u472b\u4709\u4776\u4703\u47f3\u47d4\u47b9\u479c\u4870\u4858\u487e\u480c\u48e1\u48c0\u48f6\u48da\u493e\u491d\u497c\u4952\u49bc\u4995\u49e8\u49b5\u4b6b\u4a01\u4a34\u4a2d\u549b\u4abd\u4a8d\u4aea\u4ac0\u4b7d\u4b4a\u4b36\u4b11\u4bfa\u4bda\u4be2\u4bc3\u4c3f\u4c44\u4c2a\u4c0f\u4ce0\u4cc3\u4ca9\u4c83\u4d27\u4d4b\u4d28\u4d0b\u4dbf\u4d95\u4df7\u4dd6\u4e35\u4e15\u4e05\u4e6e\u4e51\u4eca\u4e4e\u4efa\u4fe8\u4ff8\u4f5e\u4f76\u4f19\u4ffd\u4f59\u4fbc\u4fd1\u5066\u5146\u506e\u5019\u50fe\u4e4e\u50f0\u508d\u517a\u5146\u5121\u510a\u51ea\u51d4\u51a3\u5193\u522e\u526b\u525b\u523c\u5211\u52f4\u52d8\u52b0\u52d6\u5374\u5359\u5338\u534e\u53a1\u5382\u53e1\u53c0\u543f\u5414\u547d\u5440\u54de\u54c4\u54a0\u549e\u5562\u5554\u5536\u5501\u55a3\u5593\u55fb\u5584\u558d\u567f\u565a\u5633\u5615\u56b4\u56d0\u56b6\u5693\u5779\u575b\u5735\u5714\u57f3\u579f\u57b3\u5780\u5863\u5817\u587d\u585f\u58be\u589d\u58fd\u58dd\u5937\u5909\u590a\u5902\u59e5\u59c0\u59fa\u59bb\u598c\u5a7c\u5a5b\u5a34\u5a14\u5ab7\u5ad1\u5ab9\u5a92\u5b7a\u5b5a\u5b32\u5b15\u5bf0\u5b9e\u5bac\u5b81\u5c60\u5c16\u5c7a\u5c5e\u5cbd\u5c9c\u5cf1\u5cdc\u5d37\u5d08\u5d73\u5d4e\u5db1", 7321);
        Il1_ = I_0l.Il00("\u1cd7\u1cd9\u1cb0\u1c97\u1d2f\u1d50\u1d21\u1d13\u1df6\u1ddf\u1da1\u1dc0\u1e64\u1e42\u1e2f\u1e05\u1ee7\u1ec9\u1ea0\u1e87\u1f2b\u1f47\u1f2c\u1f0f\u1fbb\u1f91\u1f8b\u1fea\u1fc9\u202a\u2001\u2068\u2055\u20aa\u209b\u20e6", 7321);
        Il1O = I_0l.Il00("\u1cd7\u1cd9\u1cb0\u1c97\u1d2f\u1d01\u1d61\u1d5c\u1da6\u1d84\u1de1\u1ddc\u1e3e\u1e1c\u1e65\u1e58\u1ebb\u1e92\u1ef6\u1ed2\u1f31\u1f10\u1f75\u1f58\u1fb3\u1f8c\u1f8d\u1ff2\u1fcd", 7321);
        Il10 = I_0l.Il00("\u1ccc\u1cd6\u1cbe\u1c80\u1d70\u1d46\u1d20\u1d17\u1db1\u1d81\u1df5\u1d8a\u1e7f\u1e4d\u1e2c\u1e05\u1ee7\u1e86\u1eae\u1e88\u1f61\u1f4b\u1f2d\u1f03\u1fe6\u1fc1\u1f91\u1fbd\u1f92\u2071\u2001\u206b\u204d\u20ac\u2083\u20e3\u20cf\u2125\u211f\u2163\u215d\u21a0", 7321);
        II0_ = I_0l.Il00("\u1ccc\u1cd6\u1cbe\u1c80\u1d70\u1d46\u1d20\u1d17\u1db1\u1d81\u1df5\u1ddb\u1e3f\u1e02\u1e7c\u1e5e\u1ea7\u1e9a\u1ef4\u1ed6\u1f2b\u1f16\u1f71\u1f58\u1fb0\u1f94\u1f8b\u1fea\u1fc8\u2026\u200a\u2076\u2048\u20b4\u2087", 7321);
        IIo_ = Il11;
        IIOO = new int[3];
        I__o = false;
        III_ = -1;
        I0_0 = true;
    }

    private static /* synthetic */ String Il00(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

