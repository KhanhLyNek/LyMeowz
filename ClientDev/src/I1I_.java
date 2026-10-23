package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class I1I_ {
    int II0I;
    int I_O0;
    int I_Oo;
    int I_0;
    int IIO;
    int IIOI;
    int IIOl;
    int IIlI;
    int IIO1;
    int IIO_;
    float III;
    long IlOI;
    long Il1O;
    boolean IIl;
    int[] Il1;
    int[] Il1I;

    public I1I_(int n, int n2, int n3, int n4, int n5) {
        this.IIO1 = 0;
        this.IIO_ = 0xFF0000;
        this.IlOI = 0L;
        this.Il1O = 150L;
        this.IIl = true;
        this.Il1 = new int[2];
        this.Il1I = new int[2];
        this.IIOl = n2;
        this.I_0 = n;
        this.III = 1.0f;
        this.I_Oo = n3;
        this.IIlI = n4;
        this.II0I = II.var_int_IIl;
        this.I_O0 = II.var_int_IIlI;
        this.IlOI = System.currentTimeMillis();
        for (n3 = 0; n3 < 2; ++n3) {
            this.Il1[n3] = n;
            this.Il1I[n3] = n2;
        }
        this.IIO_ = n5;
    }

    public static void III(IO1l iO1l, int n, int n2, int n3) {
        iO1l.Illl(n3);
        iO1l.III_(n, n2, 1, 2);
    }

    public I1I_() {
    }

    /*
     * Exception decompiling
     */
    public static void IIll(I_Il var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void IIl1(I_Il i_Il) {
        try {
            int n = i_Il.java_io_DataInputStream_II().readByte();
            if (n == 0) {
                n = i_Il.java_io_DataInputStream_II().readByte();
                short[] sArray = new short[n];
                for (int i = 0; i < n; ++i) {
                    sArray[i] = i_Il.java_io_DataInputStream_II().readShort();
                }
                byte by = i_Il.java_io_DataInputStream_II().readByte();
                int n2 = i_Il.java_io_DataInputStream_II().readInt();
                short s = i_Il.java_io_DataInputStream_II().readShort();
                I1IO.I1IO_II().II(sArray, by, n2, s);
                return;
            }
            if (n == 1) {
                n = i_Il.java_io_DataInputStream_II().readByte();
                short[] sArray = new short[n];
                for (int i = 0; i < n; ++i) {
                    sArray[i] = i_Il.java_io_DataInputStream_II().readShort();
                }
                I1IO.I1IO_II().II(sArray);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void IIII(I_Il i_Il, int n) {
        try {
            int n2;
            I_1I i_1I = I_I_.II(i_Il.java_io_DataInputStream_II().readByte());
            if (i_1I == null) {
                return;
            }
            if (n == 10) {
                n2 = i_Il.java_io_DataInputStream_II().readShort();
                short s = i_Il.java_io_DataInputStream_II().readShort();
                i_1I.IIII((short)n2, s);
            }
            if (n >= 11 && n <= 20) {
                int n3;
                byte by = i_Il.java_io_DataInputStream_II().readByte();
                n2 = by;
                Ilol[] ilolArray = new Ilol[by];
                int[] nArray = new int[n2];
                for (n3 = 0; n3 < n2; ++n3) {
                    int n4 = i_Il.java_io_DataInputStream_II().readInt();
                    ilolArray[n3] = null;
                    ilolArray[n3] = n4 != Ilol.Ilol_II().IOI_ ? I1_I.Ilol_II(n4) : Ilol.Ilol_II();
                    nArray[n3] = i_Il.java_io_DataInputStream_II().readInt();
                }
                n3 = i_Il.java_io_DataInputStream_II().readByte();
                i_1I.II(ilolArray, nArray, (byte)(n - 10), (byte)n3);
            }
            if (n == 21) {
                i_1I.I_0I = i_Il.java_io_DataInputStream_II().readShort();
                i_1I.I_0l = i_Il.java_io_DataInputStream_II().readShort();
                i_1I.I001();
            }
            if (n == 23) {
                i_1I.I00_();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static /* synthetic */ String IlI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

