package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class I1l0 {
    public Image II01;
    private I1O[] var_I1O_arr_II;
    private I110[] var_I110_arr_II;
    public short[] IIlI;
    public short[][] IIIl = new short[16][];
    public int I_0;
    public int IIO = 0;
    public int IIOI;
    public int IIOl;

    public void II10(String string) {
        DataInputStream dataInputStream;
        try {
            InputStream inputStream = I11O.II(string);
            dataInputStream = new DataInputStream(inputStream);
        }
        catch (Exception exception) {
            return;
        }
        this.IIIl(dataInputStream);
    }

    public void II_(String string) {
        DataInputStream dataInputStream;
        try {
            InputStream inputStream = I11O.II(string);
            dataInputStream = new DataInputStream(inputStream);
        }
        catch (Exception exception) {
            return;
        }
        this.IIII(dataInputStream);
    }

    private void IIII(DataInputStream dataInputStream) {
        short s = 0;
        short s2 = 0;
        int n = 0;
        int n2 = 0;
        try {
            int n3;
            int n4;
            int n5 = dataInputStream.readByte();
            this.var_I1O_arr_II = new I1O[n5];
            for (n4 = 0; n4 < n5; ++n4) {
                this.var_I1O_arr_II[n4] = new I1O();
                this.var_I1O_arr_II[n4].II0I = dataInputStream.readByte();
                this.var_I1O_arr_II[n4].I_O0 = (short)dataInputStream.readUnsignedByte();
                this.var_I1O_arr_II[n4].I_Oo = (short)dataInputStream.readUnsignedByte();
                this.var_I1O_arr_II[n4].I_0 = (short)dataInputStream.readUnsignedByte();
                this.var_I1O_arr_II[n4].IIO = (short)dataInputStream.readUnsignedByte();
            }
            n4 = dataInputStream.readShort();
            this.var_I110_arr_II = new I110[n4];
            for (n3 = 0; n3 < this.var_I110_arr_II.length; ++n3) {
                this.var_I110_arr_II[n3] = new I110();
                int n6 = dataInputStream.readByte();
                this.var_I110_arr_II[n3].var_short_arr_IIll = new short[n6];
                this.var_I110_arr_II[n3].IIlI = new short[n6];
                this.var_I110_arr_II[n3].var_byte_arr_IIll = new byte[n6];
                for (int i = 0; i < n6; ++i) {
                    this.var_I110_arr_II[n3].var_short_arr_IIll[i] = dataInputStream.readShort();
                    this.var_I110_arr_II[n3].IIlI[i] = dataInputStream.readShort();
                    this.var_I110_arr_II[n3].var_byte_arr_IIll[i] = dataInputStream.readByte();
                    if (n3 != 0) continue;
                    if (s > this.var_I110_arr_II[n3].var_short_arr_IIll[i]) {
                        s = this.var_I110_arr_II[n3].var_short_arr_IIll[i];
                    }
                    if (s2 > this.var_I110_arr_II[n3].IIlI[i]) {
                        s2 = this.var_I110_arr_II[n3].IIlI[i];
                    }
                    if (n < this.var_I110_arr_II[n3].var_short_arr_IIll[i] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[i]].I_0) {
                        n = this.var_I110_arr_II[n3].var_short_arr_IIll[i] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[i]].I_0;
                    }
                    if (n2 < this.var_I110_arr_II[n3].IIlI[i] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[i]].IIO) {
                        n2 = this.var_I110_arr_II[n3].IIlI[i] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[i]].IIO;
                    }
                    this.IIOI = n - s;
                    this.IIOl = n2 - s2;
                }
            }
            this.IIlI = new short[dataInputStream.readShort()];
            for (n3 = 0; n3 < this.IIlI.length; ++n3) {
                this.IIlI[n3] = dataInputStream.readShort();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void IIIl(DataInputStream dataInputStream) {
        short s = 0;
        short s2 = 0;
        int n = 0;
        int n2 = 0;
        try {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7 = dataInputStream.readByte();
            I_Ol.II__(I1l0.IlI0("\ucb16\ucbe9\ucbc2\ucbae\ucb8d\ucc20\ucc71\ucc4b\ucc30\ucc41\uccbb", 52069) + n7);
            this.var_I1O_arr_II = new I1O[n7];
            for (n6 = 0; n6 < n7; ++n6) {
                this.var_I1O_arr_II[n6] = new I1O();
                this.var_I1O_arr_II[n6].II0I = dataInputStream.readByte();
                this.var_I1O_arr_II[n6].I_O0 = (short)dataInputStream.readUnsignedByte();
                this.var_I1O_arr_II[n6].I_Oo = (short)dataInputStream.readUnsignedByte();
                this.var_I1O_arr_II[n6].I_0 = (short)dataInputStream.readUnsignedByte();
                this.var_I1O_arr_II[n6].IIO = (short)dataInputStream.readUnsignedByte();
            }
            n6 = dataInputStream.readShort();
            this.var_I110_arr_II = new I110[n6];
            for (n5 = 0; n5 < n6; ++n5) {
                this.var_I110_arr_II[n5] = new I110();
                n4 = dataInputStream.readByte();
                this.var_I110_arr_II[n5].var_short_arr_IIll = new short[n4];
                this.var_I110_arr_II[n5].IIlI = new short[n4];
                this.var_I110_arr_II[n5].var_byte_arr_IIll = new byte[n4];
                for (n3 = 0; n3 < n4; ++n3) {
                    this.var_I110_arr_II[n5].var_short_arr_IIll[n3] = dataInputStream.readShort();
                    this.var_I110_arr_II[n5].IIlI[n3] = dataInputStream.readShort();
                    this.var_I110_arr_II[n5].var_byte_arr_IIll[n3] = dataInputStream.readByte();
                    if (n5 != 0) continue;
                    if (s > this.var_I110_arr_II[n5].var_short_arr_IIll[n3]) {
                        s = this.var_I110_arr_II[n5].var_short_arr_IIll[n3];
                    }
                    if (s2 > this.var_I110_arr_II[n5].IIlI[n3]) {
                        s2 = this.var_I110_arr_II[n5].IIlI[n3];
                    }
                    if (n < this.var_I110_arr_II[n5].var_short_arr_IIll[n3] + this.var_I1O_arr_II[this.var_I110_arr_II[n5].var_byte_arr_IIll[n3]].I_0) {
                        n = this.var_I110_arr_II[n5].var_short_arr_IIll[n3] + this.var_I1O_arr_II[this.var_I110_arr_II[n5].var_byte_arr_IIll[n3]].I_0;
                    }
                    if (n2 < this.var_I110_arr_II[n5].IIlI[n3] + this.var_I1O_arr_II[this.var_I110_arr_II[n5].var_byte_arr_IIll[n3]].IIO) {
                        n2 = this.var_I110_arr_II[n5].IIlI[n3] + this.var_I1O_arr_II[this.var_I110_arr_II[n5].var_byte_arr_IIll[n3]].IIO;
                    }
                    this.IIOI = n - s;
                    this.IIOl = n2 - s2;
                }
            }
            n5 = dataInputStream.readShort();
            this.IIlI = new short[n5];
            if (this.I_0 >= 201) {
                short[] sArray = new short[n5];
                n3 = 0;
                String string = "";
                boolean bl = false;
                for (n2 = 0; n2 < n5; ++n2) {
                    n6 = dataInputStream.readShort();
                    string = string + n6 + I1l0.IlI0("\ucb49", 52069);
                    this.IIlI[n2] = n6;
                    if (n6 + 500 >= 500) {
                        sArray[n3++] = n6;
                        bl = true;
                        continue;
                    }
                    short s3 = (short)I_Ol.II1(n6 + 500);
                    this.IIIl[s3] = new short[n3];
                    System.arraycopy(sArray, 0, this.IIIl[s3], 0, n3);
                    n3 = 0;
                }
                if (!bl) {
                    this.IIIl[0] = new short[n3];
                    System.arraycopy(sArray, 0, this.IIIl[0], 0, n3);
                } else {
                    for (n2 = 0; n2 < 16; ++n2) {
                        if (this.IIIl[n2] != null) continue;
                        this.IIIl[n2] = this.IIIl[2];
                    }
                }
            } else {
                for (n4 = 0; n4 < n5; ++n4) {
                    this.IIlI[n4] = dataInputStream.readShort();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void II(byte[] byArray, byte by) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        this.II(dataInputStream, by);
    }

    public void II(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        this.IIIl(dataInputStream);
    }

    public void II(IO1l iO1l, int n, int n2, int n3, int n4, int n5) {
        if (this.var_I110_arr_II != null && this.var_I110_arr_II.length != 0) {
            I110 i110 = this.var_I110_arr_II[n];
            for (int i = 0; i < i110.var_short_arr_IIll.length; ++i) {
                I1O i1O;
                byte by = i110.var_byte_arr_IIll[i];
                I1l0 i1l0 = this;
                int n6 = 0;
                while (true) {
                    if (n6 >= i1l0.var_I1O_arr_II.length) {
                        i1O = null;
                        break;
                    }
                    if (i1l0.var_I1O_arr_II[n6].II0I == by) {
                        i1O = i1l0.var_I1O_arr_II[n6];
                        break;
                    }
                    ++n6;
                }
                I1O i1O2 = i1O;
                try {
                    if (n4 == -1) {
                        iO1l.II(this.II01, i1O2.I_O0, i1O2.I_Oo, i1O2.I_0, i1O2.IIO, 0, n2 + i110.var_short_arr_IIll[i], n3 + i110.IIlI[i], 0);
                        continue;
                    }
                    if (n4 == 0) {
                        iO1l.II(this.II01, i1O2.I_O0, i1O2.I_Oo, i1O2.I_0, i1O2.IIO, 0, n2 + i110.var_short_arr_IIll[i], n3 + i110.IIlI[i] - (n5 < 4 && n5 > 0 ? II.II10 : 0), 0);
                        continue;
                    }
                    if (n4 == 1) {
                        iO1l.II(this.II01, i1O2.I_O0, i1O2.I_Oo, i1O2.I_0, i1O2.IIO, 2, n2 - i110.var_short_arr_IIll[i], n3 + i110.IIlI[i] - (n5 < 4 && n5 > 0 ? II.II10 : 0), IOII.l1O_);
                        continue;
                    }
                    if (n4 != 2) continue;
                    iO1l.II(this.II01, i1O2.I_O0, i1O2.I_Oo, i1O2.I_0, i1O2.IIO, 7, n2 - i110.var_short_arr_IIll[i], n3 + i110.IIlI[i] - (n5 < 4 && n5 > 0 ? II.II10 : 0), IOII.IIOI);
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    private void II(DataInputStream dataInputStream, byte by) {
        short s = 0;
        short s2 = 0;
        int n = 0;
        int n2 = 0;
        try {
            int n3;
            int n4;
            int n5 = dataInputStream.readByte();
            this.var_I1O_arr_II = new I1O[n5];
            for (n4 = 0; n4 < n5; ++n4) {
                this.var_I1O_arr_II[n4] = new I1O();
                this.var_I1O_arr_II[n4].II0I = dataInputStream.readByte();
                if (by == 1) {
                    this.var_I1O_arr_II[n4].I_O0 = (short)dataInputStream.readUnsignedByte();
                    this.var_I1O_arr_II[n4].I_Oo = (short)dataInputStream.readUnsignedByte();
                } else {
                    this.var_I1O_arr_II[n4].I_O0 = dataInputStream.readShort();
                    this.var_I1O_arr_II[n4].I_Oo = dataInputStream.readShort();
                }
                this.var_I1O_arr_II[n4].I_0 = (short)dataInputStream.readUnsignedByte();
                this.var_I1O_arr_II[n4].IIO = (short)dataInputStream.readUnsignedByte();
            }
            short s3 = dataInputStream.readShort();
            this.var_I110_arr_II = new I110[s3];
            for (n3 = 0; n3 < this.var_I110_arr_II.length; ++n3) {
                this.var_I110_arr_II[n3] = new I110();
                n5 = dataInputStream.readByte();
                this.var_I110_arr_II[n3].var_short_arr_IIll = new short[n5];
                this.var_I110_arr_II[n3].IIlI = new short[n5];
                this.var_I110_arr_II[n3].var_byte_arr_IIll = new byte[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    this.var_I110_arr_II[n3].var_short_arr_IIll[n4] = dataInputStream.readShort();
                    this.var_I110_arr_II[n3].IIlI[n4] = dataInputStream.readShort();
                    this.var_I110_arr_II[n3].var_byte_arr_IIll[n4] = dataInputStream.readByte();
                    if (n3 != 0) continue;
                    if (s > this.var_I110_arr_II[n3].var_short_arr_IIll[n4]) {
                        s = this.var_I110_arr_II[n3].var_short_arr_IIll[n4];
                    }
                    if (s2 > this.var_I110_arr_II[n3].IIlI[n4]) {
                        s2 = this.var_I110_arr_II[n3].IIlI[n4];
                    }
                    if (n < this.var_I110_arr_II[n3].var_short_arr_IIll[n4] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[n4]].I_0) {
                        n = this.var_I110_arr_II[n3].var_short_arr_IIll[n4] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[n4]].I_0;
                    }
                    if (n2 < this.var_I110_arr_II[n3].IIlI[n4] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[n4]].IIO) {
                        n2 = this.var_I110_arr_II[n3].IIlI[n4] + this.var_I1O_arr_II[this.var_I110_arr_II[n3].var_byte_arr_IIll[n4]].IIO;
                    }
                    this.IIOI = n - s;
                    this.IIOl = n2 - s2;
                }
            }
            this.IIlI = new short[dataInputStream.readShort()];
            for (n3 = 0; n3 < this.IIlI.length; ++n3) {
                this.IIlI[n3] = dataInputStream.readShort();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static /* synthetic */ String IlI0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

