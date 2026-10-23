package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import nrolite.Res;

public final class IOo1 {
    private static III[] II;
    private final IO0 var_IO0_II1I;
    private final IOo_ var_IOo__II1I;

    IOo1(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_II1I = iO0;
        this.var_IOo__II1I = iOo_;
        IOo1.I___();
    }

    private static synchronized void I___() {
        if (II != null) {
            return;
        }
        try {
            byte[] byArray = Res.read(IOo1.I1OO("\ucbe3\ucbd1\ucbab\ucb8f\ucc7f\ucc02\ucc29\ucc03\ucce7", 52113));
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            int n = dataInputStream.readUnsignedShort();
            II = new III[n];
            for (int i = 0; i < n; ++i) {
                III iII = new III();
                iII.I1l = dataInputStream.readShort();
                iII.lOo0 = dataInputStream.readShort();
                iII.l_ = dataInputStream.readByte();
                iII.l1Oo = dataInputStream.readByte();
                iII.IoI_ = dataInputStream.readByte();
                iII._10o = dataInputStream.readShort();
                iII.I0 = dataInputStream.readShort();
                iII.I0II = dataInputStream.readShort();
                iII.I0I = dataInputStream.readShort();
                iII.I0Il = dataInputStream.readShort();
                iII.II1o = dataInputStream.readUTF();
                iII.IlIo = dataInputStream.readUTF();
                iII._1o = dataInputStream.readShort();
                iII._1oI = dataInputStream.readShort();
                iII._1ol = dataInputStream.readShort();
                int n2 = dataInputStream.readByte();
                iII.II10 = new int[n2][3];
                for (int j = 0; j < n2; ++j) {
                    iII.II10[j][0] = dataInputStream.readInt();
                    iII.II10[j][1] = dataInputStream.readInt();
                    iII.II10[j][2] = dataInputStream.readByte();
                }
                IOo1.II[i] = iII;
            }
        }
        catch (Exception exception) {
            II = new III[0];
        }
    }

    public static III IOo1$III_II(int n) {
        IOo1.I___();
        for (int i = 0; i < II.length; ++i) {
            if (IOo1.II[i].I1l != n) continue;
            return II[i];
        }
        return null;
    }

    public static boolean Ill(int n) {
        return IOo1.IOo1$III_II(n) != null;
    }

    private IOol II() {
        return this.var_IO0_II1I.var_IOol_II;
    }

    private II IOo1$II_II(int n) {
        Vector vector = this.II().II1I;
        for (int i = 0; i < vector.size(); ++i) {
            II iI = (II)vector.elementAt(i);
            if (iI.I1l != n) continue;
            return iI;
        }
        return null;
    }

    void l1ol() {
        IOo1.I___();
        IO0o iO0o = new IO0o(127).II(0).III(II.length);
        for (int i = 0; i < II.length; ++i) {
            III iII = II[i];
            II iI = this.IOo1$II_II(iII.I1l);
            int n = iI == null ? 0 : iI._10O;
            int n2 = iI == null ? iII.l1Oo : iI.l1Oo;
            int n3 = iI == null ? 0 : iI.lOl_;
            int n4 = iI == null ? 0 : iI._100;
            iO0o.III(iII.I1l).III(iII.lOo0).II(iII.l_).II(n).II(n2).II(iII.IoI_);
            if (iII.IoI_ == 0) {
                iO0o.III(iII._10o);
            } else if (iII.I1l == 1791 && n3 == 2) {
                iO0o.III(1730).III(1731).III(1732).III(iII.I0Il);
            } else if (iII.I1l == 1791 && n3 > 2) {
                iO0o.III(1733).III(1734).III(1735).III(iII.I0Il);
            } else {
                iO0o.III(iII.I0).III(iII.I0II).III(iII.I0I).III(iII.I0Il);
            }
            iO0o.II(iII.II1o).II(iII.IlIo).II(n3).II(n4).II(iII.II10.length);
            for (int j = 0; j < iII.II10.length; ++j) {
                iO0o.II(iII.II10[j][0]).III(iII.II10[j][1]).II(iII.II10[j][2]);
            }
            iO0o.III(iII._1ol);
        }
        this.var_IOo__II1I.II(iO0o);
    }

    void II_I(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        if (by == 0) {
            this.l1ol();
            return;
        }
        if (by != 1) {
            return;
        }
        short s = dataInputStream.readShort();
        II iI = this.IOo1$II_II(s);
        if (iI == null || iI.lOl_ == 0) {
            return;
        }
        if (iI._100 == 0) {
            Vector vector = this.II().II1I;
            for (int i = 0; i < vector.size(); ++i) {
                if (((II)vector.elementAt((int)i))._100 != 1) continue;
                this.var_IO0_II1I.IIIl.IIol(IOo1.I1OO("\ucbc2\ud561\ucbef\ucb9a\ucc65\ud297\ucc6b\ucc19\ud264\ucc88\ucca3\ud203\ucd6b\ucd43\ucd63\ucc73\ucd62\ucd80\uccae\ud37f\ucd89\uce3c\uce4f\ud08b\uce10\uceb8\ucfa6\uceb7", 52113));
                return;
            }
            iI._100 = 1;
        } else {
            iI._100 = 0;
        }
        this.var_IOo__II1I.II(new IO0o(127).II(1).III(s).II(iI._100));
        this.var_IO0_II1I.ll_0();
        this.var_IO0_II1I.IIIl.l1O0();
        this.var_IO0_II1I.I__O();
    }

    boolean IllI(int n) {
        Object object;
        IOol iOol = this.II();
        III iII = IOo1.IOo1$III_II(n);
        if (iII == null) {
            return false;
        }
        if (iII._1o != -1) {
            II iI;
            object = IOo1.IOo1$III_II(iII._1o);
            II iI2 = iI = object == null ? null : this.IOo1$II_II(((III)object).I1l);
            if (object == null) {
                return false;
            }
            if (iI == null || iI.lOl_ < iII._1oI) {
                this.var_IO0_II1I.IIIl.IIol(IOo1.I1OO("\ucbd3\ud511\ucba1\ucbce\ucc6e\ud28b\ucc25\ucc4a\uccfa\ucd18\uccb2\uccc6\ucd71\ud383\ucd2e\ucd42", 52113) + ((III)object).II1o + IOo1.I1OO("\ucbb1\ud56f\ucbef\ucb8d\ud2a8\ucc5c\ucc6b\ucd7b\ud250\ucc88", 52113) + iII._1oI + IOo1.I1OO("\ucbb1\ucbdd\ud514\ucb87\ucc2d\ucc4f\uccb8\ucc4a\uccfd\uccc0\ud204\uccc6\ucd76\ud3c9\ucd63\ucd06\ud364\ucdce\ucdd8\ucdfe\ucd89\uce74\ud080\uce7a\uce17\uce78\ucece", 52113));
                return false;
            }
        }
        if ((object = this.IOo1$II_II(n)) == null) {
            object = new II(n, 1, iII.l1Oo, -1, 0);
            iOol.II1I.addElement(object);
            this.var_IOo__II1I.II(new IO0o(127).II(3).III(((II)object).I1l).II(((II)object)._10O).II(((II)object).l1Oo));
            this.var_IOo__II1I.II(new IO0o(127).II(2).III(((II)object).I1l).II(((II)object).lOl_));
            return true;
        }
        if (((II)object).lOl_ >= 3) {
            this.var_IO0_II1I.IIIl.IIol(IOo1.I1OO("\ucbc5\ucbd8\ud574\ucbce\ucc63\ucccc\ucc32\ucc4a\ucd98\ucc4b\ucce7\ucdf7\ud3a4\ucd50\ucd63\ucd01\ud324\ucdd0\ucd9f\ucdaa\ud32c\uce75\uce1b\ucf4b\uce18", 52113));
            return false;
        }
        ++((II)object)._10O;
        boolean bl = false;
        if (((II)object)._10O >= 10 && ((II)object).lOl_ == -1 && ((II)object).I1l == 1791) {
            bl = true;
        } else if (((II)object)._10O >= 125 && ((II)object).lOl_ > 1 && ((II)object).I1l == 1791) {
            bl = true;
        } else if (((II)object)._10O >= ((II)object).l1Oo) {
            bl = true;
        }
        if (bl) {
            ((II)object)._10O = 0;
            ((II)object).lOl_ = ((II)object).lOl_ == -1 ? 1 : ((II)object).lOl_ + 1;
            ((II)object)._100 = 1;
            this.var_IO0_II1I.ll_0();
            this.var_IO0_II1I.IIIl.l1O0();
            this.var_IO0_II1I.IIIl.l1__();
        }
        this.var_IOo__II1I.II(new IO0o(127).II(3).III(((II)object).I1l).II(((II)object)._10O).II(((II)object).l1Oo));
        this.var_IOo__II1I.II(new IO0o(127).II(2).III(((II)object).I1l).II(((II)object).lOl_));
        if (bl) {
            this.var_IOo__II1I.II(new IO0o(127).II(1).III(((II)object).I1l).II(((II)object)._100));
        }
        return true;
    }

    public static int[][] II(IOol iOol) {
        Vector vector = iOol.II1I;
        for (int i = 0; i < vector.size(); ++i) {
            int n;
            II iI = (II)vector.elementAt(i);
            if (iI._100 != 1) continue;
            III iII = IOo1.IOo1$III_II(iI.I1l);
            if (iII == null) {
                return null;
            }
            Vector<int[]> vector2 = new Vector<int[]>();
            for (int j = 0; j < iII.II10.length; ++j) {
                n = iII.II10[j][2];
                if (n > iI.lOl_ && (iI.lOl_ != -1 || n != 0)) continue;
                vector2.addElement(iII.II10[j]);
            }
            int[][] nArrayArray = new int[vector2.size()][];
            for (n = 0; n < nArrayArray.length; ++n) {
                nArrayArray[n] = (int[])vector2.elementAt(n);
            }
            return nArrayArray;
        }
        return null;
    }

    private static /* synthetic */ String I1OO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    public static final class III {
        public int I1l;
        public int lOo0;
        public int l_;
        public int l1Oo;
        public int IoI_;
        public int _10o;
        public int I0;
        public int I0II;
        public int I0I;
        public int I0Il;
        public int _1o;
        public int _1oI;
        public int _1ol;
        public String II1o;
        public String IlIo;
        public int[][] II10;
    }

    public static final class II {
        public int I1l;
        public int _10O;
        public int l1Oo;
        public int lOl_;
        public int _100;

        public II(int n, int n2, int n3, int n4, int n5) {
            this.I1l = n;
            this._10O = n2;
            this.l1Oo = n3;
            this.lOl_ = n4;
            this._100 = n5;
        }
    }
}

