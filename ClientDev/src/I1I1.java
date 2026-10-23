package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class I1I1
implements I1_0 {
    private static I1I1 var_I1I1_II;
    private I_Il var_I_Il_II;
    public static boolean I__1;
    private float var_float_II;
    public static boolean I___;
    public static I_l_ IIIl;

    public static I1I1 II() {
        if (var_I1I1_II == null) {
            var_I1I1_II = new I1I1();
        }
        return var_I1I1_II;
    }

    @Override
    public void III0(boolean bl) {
        if (bl) {
            System.out.println(I1I1.Il("\ub78e\ub863\ub845\ub824\ub80c\ub8eb\ub8d3\ub8e6\ub8d4\ub924\ub94c\ub929", 47085));
            int n = IO10.IIOo();
            if (n == -1) {
                n = I_0l.l1_I;
            }
            GameMidlet.var_java_lang_String_III = I_0l.II1l[n];
            GameMidlet.II_0 = I_0l.III0[n];
            I_0l.III_ = 2;
            I_O1.IIIl(I1I1.Il("\ub79e\ub87a\ub858\ub82f\ub805\ub8ed\ub8c4\ub8b2", 47085), n);
            String string = GameMidlet.var_java_lang_String_III + I1I1.Il("\ub7d7", 47085) + GameMidlet.II_0;
            I_O1.II(I1I1.Il("\ub7a3\ub85e\ub862\ub81a\ub805\ub8e1\ub8c9\ub8ad", 47085), string.getBytes());
            I_0_.II().Io__();
            I_0_ i_0_ = I_0_.II();
        } else {
            I_0_ i_0_ = I_0_.II();
            if (I_O1.III(I1I1.Il("\ub78e\ub860\ub842\ub82f\ub807\ub8fc\ub8d3\ub8bf\ub895\ub961", 47085)) != -1) {
                IO10.l_lI = I_O1.III(I1I1.Il("\ub78e\ub860\ub842\ub82f\ub807\ub8fc\ub8d3\ub8bf\ub895\ub961", 47085));
            }
            try {
                I_Ol.II__(I1I1.Il("\ub79e\ub869\ub85f\ub81e\ub810\ub8f8\ub8c2", 47085));
                I_Il i_Il = I_0_.I_Il_II((byte)2);
                i_Il.java_io_DataOutputStream_II().writeByte(IO10.l_lI);
                i_Il.java_io_DataOutputStream_II().writeByte(IO1l.l_I0);
                i_Il.java_io_DataOutputStream_II().writeBoolean(false);
                i_Il.java_io_DataOutputStream_II().writeInt(II.var_int_IIl);
                i_Il.java_io_DataOutputStream_II().writeInt(II.var_int_IIlI);
                i_Il.java_io_DataOutputStream_II().writeBoolean(IOI0.III_);
                i_Il.java_io_DataOutputStream_II().writeBoolean(II.var_boolean_IIIl);
                i_Il.java_io_DataOutputStream_II().writeUTF(System.getProperty(I1I1.Il("\ub780\ub865\ub848\ub838\ub806\ub8ed\ub8c3\ub8af\ub891\ub96d\ub94c\ub92c\ub94f\ub9f0\ub9f3\ub9df\ub9a9\ub99a\uba74\uba48\uba34", 47085)) + I1I1.Il("\ub791", 47085) + I1I1.Il("\ub7dc\ub822\ub81b\ub864\ub85b", 47085));
                InputStream inputStream = i_0_.getClass().getResourceAsStream(I1I1.Il("\ub79f\ub869\ub858\ub816\ub800\ub8e6\ub8c1\ub8a9", 47085));
                if (inputStream != null) {
                    inputStream.read(null);
                    i_Il.java_io_DataOutputStream_II().writeShort(((Object[])null).length);
                    i_Il.java_io_DataOutputStream_II().write(null);
                    I_Ol.II_l(I1I1.Il("\ub79a\ub87e\ub842\ub83e\ub80c\ub8a8", 47085) + ((Object[])null).length + I1I1.Il("\ub791", 47085) + I1I1.Il("\ub7dc\ub822\ub81b\ub864\ub85b", 47085));
                }
                i_0_.var_I1_o_II = I_0O.I_0O_III();
                i_0_.var_I1_o_II.IIlO(i_Il);
                i_0_.var_I1_o_II = I_0O.II();
                i_Il.I0Oo();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    @Override
    public void IIIo(boolean bl) {
        if (!bl) {
            if (II.var_IO1__II == II.var_I_0l_II && I_0l.I__o && !I_0_.III1) {
                I_0l.III_ = 0;
                II.var_I_0l_II.IO_();
            }
            if (II.var_IO1__II != II.var_I1o__II || I_0_.III1) {
                return;
            }
        }
        IO10.IIlI(bl);
    }

    @Override
    public void IIl(boolean bl) {
        if (!bl) {
            System.out.println(I1I1.Il("\ub78e\ub863\ub845\ub824\ub80c\ub8eb\ub8d3\ub8e6\ub8d7\ub924\ub945\ub923\ub908\ub9ec", 47085));
            if (II.var_IO1__II == II.var_I_0l_II && !I_0_.III1) {
                II.var_I_0l_II.IO_();
            }
            if (II.var_IO1__II == II.var_I1o__II && !I_0_.III1) {
                IO10.III_(bl);
            }
        } else {
            System.out.println(I1I1.Il("\ub782\ub862\ub86f\ub823\ub81a\ub8eb\ub8c8\ub8a8\ub88b\ub961\ub940\ub936\ub904\ub9e4\ub9bf\ub98f\ub9fd\ub99a\uba7a\uba53\uba35", 47085));
            IO10.III_(bl);
        }
    }

    private static void II(I_Il i_Il) {
        try {
            int n = i_Il.java_io_DataInputStream_II().readUnsignedByte();
            I101 i101 = I1_I.var_Ilol_IIlI.var_I101_arr_IIII[n];
            i101.lIO0 = i_Il.java_io_DataInputStream_II().readInt();
            i101.lIOO = i_Il.java_io_DataInputStream_II().readByte();
            i101.var_I_lO_IIOo = new I_lO(I1I1.Il("\ub784\ub878\ub84e\ub827\ub847\ub8e7\ub8d7\ub8b2\ub88c\ub96b\ub94d\ub931", 47085));
            try {
                while (true) {
                    i101.var_I_lO_IIOo.addElement(new I100(i_Il.java_io_DataInputStream_II().readUnsignedByte(), i_Il.java_io_DataInputStream_II().readUnsignedShort()));
                }
            }
            catch (Exception exception) {
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void III(I_Il var1_1) {
        block687: {
            IO10.III();
            II.var_I_lO_IIIl.removeAllElements();
            try {
                I_Ol.II__(I1I1.Il("\ub7d1\ub830\ub817\ub818\ub80c\ub8e9\ub8c3\ub8e6\ub886\ub969\ub947\ub97f\ub941", 47085) + var1_1.II00);
                I1I_.IIll(var1_1);
                block114 : switch (var1_1.II00) {
                    case -112: {
                        var88_2 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var88_2 == 0) {
                            var48_3 = var1_1.java_io_DataInputStream_II().readByte();
                            I1_I.II(var48_3).IOll();
                        }
                        if (var88_2 == 1) {
                            var48_3 = var1_1.java_io_DataInputStream_II().readByte();
                            I1_I.II(var48_3).II(var1_1.java_io_DataInputStream_II().readShort());
                        }
                    }
                    default: {
                        break;
                    }
                    case -107: {
                        var48_3 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var48_3 == 0) {
                            Ilol.Ilol_II().I101 = false;
                        }
                        if (var48_3 == 1) {
                            Ilol.Ilol_II().I101 = true;
                        }
                        if (var48_3 != 2) break;
                        I1OO.I__o();
                        Ilol.Ilol_III().I0 = var1_1.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_III().IO01();
                        var89_4 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        I_Ol.II__(I1I1.Il("\ub783\ub879\ub846\ub86a\ub80b\ub8e7\ub8c3\ub8bf\ub8c5\ub939\ub903", 47085) + var89_4);
                        Ilol.Ilol_III().var_I101_arr_IIII = new I101[var89_4];
                        block303: for (var49_7 = 0; var49_7 < var89_4; ++var49_7) {
                            var90_11 = var1_1.java_io_DataInputStream_II().readShort();
                            I_Ol.II__(I1I1.Il("\ub799\ub869\ub846\ub83a\ub805\ub8e9\ub8d3\ub8a3\ub8c5\ub96d\ub947\ub97f\ub941", 47085) + var90_11);
                            if (var90_11 == -1) continue;
                            I_Ol.II__(I1I1.Il("\ub7dc", 47085));
                            Ilol.Ilol_III().var_I101_arr_IIII[var49_7] = new I101();
                            Ilol.Ilol_III().var_I101_arr_IIII[var49_7].var_I1o_II = I1oI.II(var90_11);
                            var91_18 = Ilol.Ilol_III().var_I101_arr_IIII[var49_7].var_I1o_II.II0l;
                            Ilol.Ilol_III().var_I101_arr_IIII[var49_7].I1l1 = var1_1.java_io_DataInputStream_II().readInt();
                            I_Ol.II__(I1I1.Il("\ub7de", 47085));
                            Ilol.Ilol_III().var_I101_arr_IIII[var49_7].IlIo = var1_1.java_io_DataInputStream_II().readUTF();
                            Ilol.Ilol_III().var_I101_arr_IIII[var49_7].Ill = var1_1.java_io_DataInputStream_II().readUTF();
                            var92_33 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            I_Ol.II__(I1I1.Il("\ub782\ub87c\ub85f\ub823\ub806\ub8e6\ub887\ub8b5\ub88c\ub97e\ub946\ub97f\ub941", 47085) + var92_33);
                            if (var92_33 != 0) {
                                Ilol.Ilol_III().var_I101_arr_IIII[var49_7].var_I100_arr_III = new I100[var92_33];
                                for (var52_9 = 0; var52_9 < Ilol.Ilol_III().var_I101_arr_IIII[var49_7].var_I100_arr_III.length; ++var52_9) {
                                    var53_10 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                    var80_8 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                    if (var53_10 == -1) continue;
                                    Ilol.Ilol_III().var_I101_arr_IIII[var49_7].var_I100_arr_III[var52_9] = new I100(var53_10, var80_8);
                                }
                            }
                            switch (var91_18) {
                                case 0: {
                                    Ilol.Ilol_III().I0II = Ilol.Ilol_III().var_I101_arr_IIII[var49_7].var_I1o_II.II_0;
                                    continue block303;
                                }
                                case 1: {
                                    Ilol.Ilol_III().I0I = Ilol.Ilol_III().var_I101_arr_IIII[var49_7].var_I1o_II.II_0;
                                    continue block303;
                                }
                            }
                        }
                        Ilol.Ilol_III().IOl_ = var1_1.II_I();
                        Ilol.Ilol_III().IOlo = var1_1.II_I();
                        Ilol.Ilol_III().IOl1 = var1_1.II_I();
                        Ilol.Ilol_III().IO1 = var1_1.II_I();
                        Ilol.Ilol_III().IOl = var1_1.II_I();
                        Ilol.Ilol_III().IIO1 = var1_1.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_III().IIO_ = var1_1.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_III().Illo = var1_1.java_io_DataInputStream_II().readLong();
                        Ilol.Ilol_III().Il1I = var1_1.java_io_DataInputStream_II().readLong();
                        Ilol.Ilol_III().var_byte_III1 = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_III().IO_0 = var1_1.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_III().var_short_IIl1 = var1_1.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_III().IOll = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_III().IOlI = var1_1.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_III().var_I_0o_arr_II = new I_0o[var1_1.java_io_DataInputStream_II().readByte()];
                        I_Ol.II__(I1I1.Il("\ub7be\ub847\ub862\ub806\ub825\ub8cd\ub8e9\ub892\ub8c5\ub939\ub903", 47085) + Ilol.Ilol_III().var_I_0o_arr_II);
                        for (var49_7 = 0; var49_7 < Ilol.Ilol_III().var_I_0o_arr_II.length; ++var49_7) {
                            var90_11 = var1_1.java_io_DataInputStream_II().readShort();
                            if (var90_11 != -1) {
                                Ilol.Ilol_III().var_I_0o_arr_II[var49_7] = I_o_.II(var90_11);
                                continue;
                            }
                            Ilol.Ilol_III().var_I_0o_arr_II[var49_7] = new I_0o();
                            Ilol.Ilol_III().var_I_0o_arr_II[var49_7].II = null;
                            Ilol.Ilol_III().var_I_0o_arr_II[var49_7].Il_ = var1_1.java_io_DataInputStream_II().readUTF();
                        }
                        break;
                    }
                    case -99: {
                        I1OO.I__o();
                        var49_7 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var49_7 != 0) break;
                        II.var_I_1o_II.var_I_lO_IIoO.removeAllElements();
                        var50_39 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        for (var51_40 = 0; var51_40 < var50_39; ++var51_40) {
                            var89_5 = new Ilol();
                            var89_5.IOI_ = var1_1.java_io_DataInputStream_II().readInt();
                            var89_5.I0 = var1_1.java_io_DataInputStream_II().readShort();
                            var89_5.IOoo = var1_1.java_io_DataInputStream_II().readShort();
                            var89_5.I0II = var1_1.java_io_DataInputStream_II().readShort();
                            var89_5.I0I = var1_1.java_io_DataInputStream_II().readShort();
                            var89_5.I0Il = var1_1.java_io_DataInputStream_II().readShort();
                            var89_5.IIO1 = var1_1.java_io_DataInputStream_II().readUTF();
                            var90_12 = new I1O0(var1_1.java_io_DataInputStream_II().readUTF());
                            var91_19 = var1_1.java_io_DataInputStream_II().readBoolean();
                            var90_12.IIll = var89_5;
                            var90_12.IOO0 = var91_19;
                            I_Ol.II__(I1I1.Il("\ub784\ub87f\ub844\ub824\ub805\ub8e1\ub8c9\ub8a3\ub8c5\ub939\ub903", 47085) + var91_19);
                            II.var_I_1o_II.var_I_lO_IIoO.addElement(var90_12);
                        }
                        II.var_I_1o_II.I0ol();
                        II.var_I_1o_II.I__0();
                        break;
                    }
                    case -98: {
                        var50_39 = var1_1.java_io_DataInputStream_II().readByte();
                        II.var_I_II_II.IOol = false;
                        if (var50_39 != 0) break;
                        II.II(var1_1.java_io_DataInputStream_II().readUTF(), new I1Il(IO11.I_I_, II.var_II_II, 888397, var1_1.java_io_DataInputStream_II().readUTF()), new I1Il(IO11.I_IO, II.var_II_II, 888396, null));
                        break;
                    }
                    case -97: {
                        Ilol.Ilol_II().Il1l = var1_1.java_io_DataInputStream_II().readInt();
                        break;
                    }
                    case -96: {
                        var51_40 = var1_1.java_io_DataInputStream_II().readByte();
                        II.var_I_1o_II.var_I_lO_IIo_.removeAllElements();
                        var89_6 = var1_1.java_io_DataInputStream_II().readUTF();
                        var52_9 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        for (var53_10 = 0; var53_10 < var52_9; ++var53_10) {
                            var80_8 = var1_1.java_io_DataInputStream_II().readInt();
                            var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                            var81_41 = var1_1.java_io_DataInputStream_II().readShort();
                            var90_13 = var1_1.java_io_DataInputStream_II().readShort();
                            var91_20 = var1_1.java_io_DataInputStream_II().readShort();
                            var92_34 = var1_1.java_io_DataInputStream_II().readShort();
                            var93_43 = var1_1.java_io_DataInputStream_II().readUTF();
                            var94_51 = var1_1.java_io_DataInputStream_II().readUTF();
                            var95_57 = new IOl0();
                            var95_57.l_ = var80_8;
                            var95_57.l1o0 = var81_41;
                            var95_57.IOoo = var90_13;
                            var95_57.II0O = var91_20;
                            var95_57.II00 = var92_34;
                            var95_57.II1o = var93_43;
                            var95_57.IlIo = var94_51;
                            var95_57.II_o = var1_1.java_io_DataInputStream_II().readUTF();
                            var95_57.l1oo = var54_42;
                            II.var_I_1o_II.var_I_lO_IIo_.addElement(var95_57);
                        }
                        II.var_I_1o_II.IllO = var89_6;
                        II.var_I_1o_II.IIIl((byte)var51_40);
                        II.var_I_1o_II.I__0();
                        break;
                    }
                    case -95: {
                        var53_10 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub799\ub875\ub85b\ub82f\ub854\ub8a8", 47085) + var53_10);
                        if (var53_10 == 0) {
                            var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                            var55_71 = var1_1.java_io_DataInputStream_II().readShort();
                            var56_72 = var1_1.II_I();
                            if (var54_42 == Ilol.Ilol_II().IOI_) {
                                Ilol.Ilol_II().var_I_I__IIIl = new I_I_(var54_42, false, false, false, false, false, var55_71, 1, var56_72, 0, var56_72, (short)(Ilol.Ilol_II().I_o_ + (Ilol.Ilol_II().IOI1 != 1 ? -40 : 40)), (short)Ilol.Ilol_II().I_oO, 4, 0);
                                Ilol.Ilol_II().var_I_I__IIIl.I0I1 = true;
                                I1lI.III(new I1ll(18, Ilol.Ilol_II().var_I_I__IIIl.I1, Ilol.Ilol_II().var_I_I__IIIl.I1I, 2, 10, -1));
                                Ilol.Ilol_II().IO__ = 30;
                                I1_I.var_I_lO_IIO.addElement(Ilol.Ilol_II().var_I_I__IIIl);
                            } else {
                                var10_73 = I1_I.Ilol_II(var54_42);
                                if (var10_73 != null) {
                                    var90_14 = new I_I_(var54_42, false, false, false, false, false, var55_71, 1, var56_72, 0, var56_72, (short)var10_73.I_o_, (short)var10_73.I_oO, 4, 0);
                                    var90_14.I0I1 = true;
                                    var10_73.var_I_I__IIIl = var90_14;
                                    I1_I.var_I_lO_IIO.addElement(var10_73.var_I_I__IIIl);
                                } else {
                                    var90_14 = I1_I.I_I__II(var54_42);
                                    if (var90_14 == null) {
                                        var90_14 = new I_I_(var54_42, false, false, false, false, false, var55_71, 1, var56_72, 0, var56_72, -100, -100, 4, 0);
                                        var90_14.I0I1 = true;
                                        I1_I.var_I_lO_IIO.addElement(var90_14);
                                    }
                                }
                            }
                        }
                        if (var53_10 == 1) {
                            var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                            var81_41 = var1_1.java_io_DataInputStream_II().readByte();
                            I_Ol.II__(I1I1.Il("\ub780\ub863\ub84f\ub86a\ub808\ub8fc\ub8d3\ub8a7\ub886\ub96f\ub903\ub92b\ub905\ub9bd\ub9bf", 47085) + var54_42);
                            if (var54_42 == Ilol.Ilol_II().IOI_) {
                                if (I1_I.I_I__II((int)var81_41) != null) {
                                    Ilol.Ilol_II().var_I_I__IIIl.IIII(I1_I.I_I__II((int)var81_41));
                                }
                            } else {
                                var10_73 = I1_I.Ilol_II(var54_42);
                                if (var10_73 != null && I1_I.I_I__II((int)var81_41) != null) {
                                    var10_73.var_I_I__IIIl.IIII(I1_I.I_I__II((int)var81_41));
                                }
                            }
                        }
                        if (var53_10 != 2) ** GOTO lbl218
                        var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                        var55_71 = var1_1.java_io_DataInputStream_II().readInt();
                        var56_72 = var1_1.II_I();
                        var57_74 = var1_1.II_I();
                        if (var54_42 != Ilol.Ilol_II().IOI_) ** GOTO lbl202
                        I_Ol.II__(I1I1.Il("\ub780\ub863\ub849\ub86a\ub80d\ub8e9\ub8ca\ub8a3\ub8d8\ub924", 47085) + var56_72);
                        var10_73 = I1_I.Ilol_II(var55_71);
                        if (var10_73 != null) {
                            if (Ilol.Ilol_II().var_I_I__IIIl.I0IO) {
                                var10_73.II(var56_72, 0, false, true);
                            } else {
                                Ilol.Ilol_II().var_I_I__IIIl.lllI = var56_72;
                                Ilol.Ilol_II().var_I_I__IIIl.IIIl(var10_73);
                            }
                        }
                        ** GOTO lbl218
lbl202:
                        // 1 sources

                        var90_14 = I1_I.I_I__II(var54_42);
                        if (var90_14 == null) ** GOTO lbl218
                        if (var55_71 != Ilol.Ilol_II().IOI_) ** GOTO lbl211
                        if (var90_14.I0IO) {
                            Ilol.Ilol_II().II(var56_72, 0, false, true);
                        } else {
                            var90_14.lllI = var56_72;
                            var90_14.IIIl(Ilol.Ilol_II());
                        }
                        ** GOTO lbl218
lbl211:
                        // 1 sources

                        var10_73 = I1_I.Ilol_II(var55_71);
                        if (var10_73 != null) {
                            if (var90_14.I0IO) {
                                var10_73.II(var56_72, 0, false, true);
                            } else {
                                var90_14.lllI = var56_72;
                                var90_14.IIIl(var10_73);
                            }
                        }
lbl218:
                        // 10 sources

                        if (var53_10 == 3) {
                            var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                            var55_71 = var1_1.java_io_DataInputStream_II().readInt();
                            var56_72 = var1_1.II_I();
                            var57_74 = var1_1.II_I();
                            var10_73 = null;
                            v0 = var10_73 = Ilol.Ilol_II().IOI_ != var54_42 ? I1_I.Ilol_II(var54_42) : Ilol.Ilol_II();
                            if (var10_73 != null) {
                                var90_14 = I1_I.I_I__II(var55_71);
                                if (var10_73.var_I_I__IIIl != null) {
                                    var10_73.var_I_I__IIIl.IIII(var90_14);
                                }
                                if (var90_14 != null) {
                                    var90_14.llIl = var56_72;
                                    var90_14.I00l();
                                    if (var57_74 == 0) {
                                        var90_14.I1 = var90_14.llIO;
                                        var90_14.I1I = var90_14.llI0;
                                        I1_I.II(IO11.IOlI, var90_14.I1, var90_14.I1I - var90_14.IIlI, 0, -2, IO1I.l_I_);
                                    } else {
                                        I1_I.II(I1I1.Il("\ub7c0", 47085) + var57_74, var90_14.I1, var90_14.I1I - var90_14.IIlI, 0, -2, IO1I.l_IO);
                                    }
                                }
                            }
                        }
                        if (var53_10 == 4) {
                            // empty if block
                        }
                        if (var53_10 == 5) {
                            var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                            var81_41 = var1_1.java_io_DataInputStream_II().readByte();
                            var56_72 = var1_1.java_io_DataInputStream_II().readInt();
                            var57_74 = var1_1.II_I();
                            var58_75 = var1_1.II_I();
                            var10_73 = null;
                            v1 = var10_73 = var54_42 != Ilol.Ilol_II().IOI_ ? I1_I.Ilol_II(var54_42) : Ilol.Ilol_II();
                            if (var10_73 == null) {
                                return;
                            }
                            if ((IOlO.IIl(var10_73.I_o_, var10_73.I_oO) & 2) == 2) {
                                var10_73.II(I1_I.var_I_ol_arr_II[var81_41], 0);
                            } else {
                                var10_73.II(I1_I.var_I_ol_arr_II[var81_41], 1);
                            }
                            var91_21 = I1_I.I_I__II(var56_72);
                            var10_73.IOI1 = var10_73.I_o_ <= var91_21.I1 ? 1 : -1;
                            var10_73.var_I_I__IIII = var91_21;
                            var91_21.llIl = var58_75;
                            var91_21.I00l();
                            II.void_II(I1I1.Il("\ub7be\ub84d\ub813\ub879\ub81f\ub8ba", 47085), 2);
                            if (var57_74 == 0) {
                                var91_21.I1 = var91_21.llIO;
                                var91_21.I1I = var91_21.llI0;
                                I1_I.II(IO11.IOlI, var91_21.I1, var91_21.I1I - var91_21.IIlI, 0, -2, IO1I.l_I_);
                            } else {
                                I1_I.II(I1I1.Il("\ub7c0", 47085) + var57_74, var91_21.I1, var91_21.I1I - var91_21.IIlI, 0, -2, IO1I.l_IO);
                            }
                        }
                        if (var53_10 == 6) {
                            var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                            if (var54_42 == Ilol.Ilol_II().IOI_) {
                                Ilol.Ilol_II().var_I_I__IIIl.IOl0();
                            } else {
                                var10_73 = I1_I.Ilol_II(var54_42);
                                var10_73.var_I_I__IIIl.IOl0();
                            }
                        }
                        if (var53_10 != 7) break;
                        var54_42 = var1_1.java_io_DataInputStream_II().readInt();
                        if (var54_42 == Ilol.Ilol_II().IOI_) {
                            Ilol.Ilol_II().var_I_I__IIIl = null;
                            for (var55_71 = 0; var55_71 < I1_I.var_I_lO_IIO.size(); ++var55_71) {
                                if (((I_I_)I1_I.var_I_lO_IIO.elementAt((int)var55_71)).lll != var54_42) continue;
                                I1_I.var_I_lO_IIO.removeElementAt(var55_71);
                            }
                            break;
                        } else {
                            var10_73 = I1_I.Ilol_II(var54_42);
                            for (var55_71 = 0; var55_71 < I1_I.var_I_lO_IIO.size(); ++var55_71) {
                                if (((I_I_)I1_I.var_I_lO_IIO.elementAt((int)var55_71)).lll != var54_42) continue;
                                I1_I.var_I_lO_IIO.removeElementAt(var55_71);
                            }
                            if (var10_73 == null) break;
                            var10_73.var_I_I__IIIl = null;
                            break;
                        }
                    }
                    case -94: {
                        while (var1_1.java_io_DataInputStream_II().available() > 0) {
                            var55_71 = var1_1.java_io_DataInputStream_II().readShort();
                            var56_72 = var1_1.java_io_DataInputStream_II().readInt();
                            for (var57_74 = 0; var57_74 < Ilol.Ilol_II().var_I_lO_IIl.size(); ++var57_74) {
                                var91_22 = (I_0o)Ilol.Ilol_II().var_I_lO_IIl.elementAt(var57_74);
                                if (var91_22 == null || var91_22.II0I != var55_71) continue;
                                if (var56_72 < var91_22.l1_O) {
                                    var91_22.I1IO = IO10.IIII() - (long)(var91_22.l1_O - var56_72);
                                }
                                I_Ol.II__(I1I1.Il("\ub7dc\ub82c\ub848\ub822\ub800\ub8ed\ub8d2\ub8e6\ub88c\ub960\ub91e\ub962", 47085) + var91_22.II.IlIO + I1I1.Il("\ub7cd\ub86f\ub844\ub825\ub805\ub8ec\ub8c8\ub8b1\ub88b\ub939\ub903", 47085) + var56_72 + I1I1.Il("\ub7cd\ub86f\ub85e\ub838\ub81b\ub8a8\ub8c4\ub8a9\ub88a\ub968\ub903\ub926\ub90e\ub9f7\ub9f1\ub983\ub9fd", 47085) + var91_22.l1_O);
                            }
                        }
                        break;
                    }
                    case -93: {
                        var55_71 = var1_1.java_io_DataInputStream_II().readShort();
                        Il0o.var_byte_arr_IIII = new byte[var55_71];
                        for (var56_72 = 0; var56_72 < var55_71; ++var56_72) {
                            Il0o.var_byte_arr_IIII[var56_72] = var1_1.java_io_DataInputStream_II().readByte();
                        }
                    }
                    case -92: {
                        IO10.l_lI = var1_1.java_io_DataInputStream_II().readByte();
                        I_O1.I_10();
                        I_O1.IIIl(I1I1.Il("\ub78e\ub860\ub842\ub82f\ub807\ub8fc\ub8d3\ub8bf\ub895\ub961", 47085), IO10.l_lI);
                        I_O1.IIIl(I1I1.Il("\ub781\ub86d\ub858\ub83e\ub833\ub8e7\ub8c8\ub8ab\ub889\ub961\ub955\ub927\ub90d", 47085), IO1l.l_I0);
                        II.II(IO11.IO1, 8885, null);
                        break;
                    }
                    case -91: {
                        var56_72 = var1_1.java_io_DataInputStream_II().readByte();
                        II.var_I_1o_II.II11 = new String[var56_72];
                        II.var_I_1o_II.II1_ = new String[var56_72];
                        for (var57_74 = 0; var57_74 < var56_72; ++var57_74) {
                            II.var_I_1o_II.II11[var57_74] = var1_1.java_io_DataInputStream_II().readUTF();
                            II.var_I_1o_II.II1_[var57_74] = var1_1.java_io_DataInputStream_II().readUTF();
                        }
                        II.var_I_1o_II.I000();
                        II.var_I_1o_II.I__0();
                        break;
                    }
                    case -90: {
                        var57_74 = var1_1.java_io_DataInputStream_II().readByte();
                        var58_75 = var1_1.java_io_DataInputStream_II().readInt();
                        I_Ol.II__(I1I1.Il("\ub7d0\ub831\ub816\ub874\ub849\ub8dd\ub8f7\ub882\ub8a4\ub950\ub966\ub91d\ub923\ub9cf\ub9db\ub9e7\ub9e7\ub9dc\uba3b\uba1a\uba79\uba0c\ubaee\ubac6\ubab0\ubad4\ubb2e\ubb12", 47085) + var57_74);
                        v2 = var10_73 = Ilol.Ilol_II().IOI_ != var58_75 ? I1_I.Ilol_II(var58_75) : Ilol.Ilol_II();
                        if (var57_74 != -1) {
                            var91_23 = var1_1.java_io_DataInputStream_II().readShort();
                            var92_35 = var1_1.java_io_DataInputStream_II().readShort();
                            var59_76 = var1_1.java_io_DataInputStream_II().readShort();
                            var82_77 = var1_1.java_io_DataInputStream_II().readByte();
                            if (var10_73 != null) {
                                if (var10_73.IOI_ == var58_75) {
                                    var10_73.I1lo = true;
                                    var10_73.var_byte_IIlo = var82_77;
                                    if (var10_73.var_byte_IIlo != 0) {
                                        var10_73.I_I1 = false;
                                        var10_73.I10l = false;
                                    }
                                } else if (var10_73 != null) {
                                    var10_73.I1lo = true;
                                    var10_73.var_byte_IIlo = var82_77;
                                }
                                if (var91_23 != -1) {
                                    var10_73.I0 = var91_23;
                                }
                                if (var92_35 != -1) {
                                    var10_73.I0II = var92_35;
                                }
                                if (var59_76 != -1) {
                                    var10_73.I0I = var59_76;
                                }
                            }
                        }
                        if (var57_74 == -1 && var10_73 != null) {
                            var10_73.I1lo = false;
                            var10_73.var_byte_IIlo = 0;
                        }
                        if (var10_73 != null) break;
                        break;
                    }
                    case -88: {
                        II.III_();
                        II.var_I_0l_II.I0l_();
                        break;
                    }
                    case -87: {
                        I_Ol.II__(I1I1.Il("\ub7aa\ub849\ub87f\ub86a\ub83c\ub8d8\ub8e3\ub887\ub8b1\ub941\ub97c\ub906\ub920\ub9d4\ub9de\ub99e", 47085) + var1_1.java_io_DataInputStream_II().available() + I1I1.Il("\ub7cd\ub86e\ub852\ub83e\ub80c\ub8fb", 47085));
                        var1_1.java_io_DataInputStream_II().mark(100000);
                        I1I1.II(var1_1.java_io_DataInputStream_II(), true);
                        var1_1.java_io_DataInputStream_II().reset();
                        var91_24 = new byte[var1_1.java_io_DataInputStream_II().available()];
                        var1_1.java_io_DataInputStream_II().readFully(var91_24);
                        var92_36 = new byte[]{I1_I.II1o};
                        I_O1.II(I1I1.Il("\ub7a3\ub85e\ub84f\ub82b\ub81d\ub8e9\ub8f1\ub8a3\ub897\ub977\ub94a\ub92d\ub90f", 47085), var92_36);
                        I1o_.IO0o = false;
                        if (I1_I.var_byte_II_1 != I1_I.II1o || I1_I.var_byte_II__ != I1_I.II_ || I1_I.var_byte_II_O != I1_I.II_I || I1_I.var_byte_II_0 != I1_I.var_byte_II_l) break;
                        I_Ol.II__(I1_I.var_byte_II_1 + I1I1.Il("\ub7c1", 47085) + I1_I.var_byte_II__ + I1I1.Il("\ub7c1", 47085) + I1_I.var_byte_II_O + I1I1.Il("\ub7c1", 47085) + I1_I.var_byte_II_0);
                        I1_I.I1_I_II();
                        I1_I.I01l();
                        I1_I.I1_I_II();
                        I1_I.I01();
                        I1_I.I1_I_II();
                        I1_I.I01I();
                        I1_I.I1_I_II();
                        I1_I.I011();
                        I_0_.II().IoOO();
                        return;
                    }
                    case -86: {
                        var59_76 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub79e\ub869\ub859\ub83c\ub80c\ub8fa\ub887\ub8a1\ub890\ub96d\ub903\ub934\ub904\ub9a0\ub9f8\ub9d7\ub9bc\ub993\uba3b\uba5e\uba30\uba1b\ubaff\uba96\ubab4\uba97\ubb67\ubb5b\ubb3e\ubb1e\ubbaf\ubb93\ubbed", 47085) + var59_76);
                        if (var59_76 == 0) {
                            var60_78 = var1_1.java_io_DataInputStream_II().readInt();
                            I1_I.I1_I_II().IIO0(var60_78);
                        }
                        if (var59_76 == 1) {
                            var60_78 = var1_1.java_io_DataInputStream_II().readInt();
                            var93_44 = I1_I.Ilol_II(var60_78);
                            if (var93_44 == null) {
                                return;
                            }
                            II.var_I_1o_II.IIIO((Ilol)var93_44);
                            II.var_I_1o_II.I__0();
                            I_0_.II().II01(var60_78);
                        }
                        if (var59_76 == 2) {
                            var82_77 = var1_1.java_io_DataInputStream_II().readByte();
                            for (var61_79 = 0; var61_79 < II.var_I_1o_II.var_I_lO_IIol.size(); ++var61_79) {
                                var93_44 = (I101)II.var_I_1o_II.var_I_lO_IIol.elementAt(var61_79);
                                if (var93_44.lIO_ != var82_77) continue;
                                II.var_I_1o_II.var_I_lO_IIol.removeElement(var93_44);
                                break;
                            }
                        }
                        if (var59_76 == 5) {
                            // empty if block
                        }
                        if (var59_76 == 6) {
                            II.var_I_1o_II.I0lO = true;
                            if (II.var_I_1o_III != null) {
                                II.var_I_1o_III.I0lO = true;
                            }
                            II.var_I_1o_II.IIo1.removeAllElements();
                            if (II.var_I_1o_III != null) {
                                II.var_I_1o_III.IIo1.removeAllElements();
                            }
                            var60_78 = var1_1.java_io_DataInputStream_II().readInt();
                            var93_45 = var1_1.java_io_DataInputStream_II().readByte();
                            I_Ol.II__(I1I1.Il("\ub784\ub878\ub84e\ub827\ub849\ub8fb\ub8ce\ub8bc\ub880\ub924\ub91e\ub962", 47085) + var93_45);
                            var94_52 = 0;
                            while (true) {
                                if (var94_52 >= var93_45) {
                                    if (II.var_I_1o_III != null) {
                                        II.var_I_1o_III.IIl1(false);
                                        II.var_I_1o_III.ll_O = var60_78;
                                        break;
                                    }
                                    II.var_I_1o_II.ll_O = var60_78;
                                    if (II.var_I_1o_II.ll_0 != 2) break;
                                    II.var_I_1o_II.IIl1(false);
                                    break;
                                }
                                var95_58 = new I101();
                                var95_58.var_I1o_II = I1oI.II(var1_1.java_io_DataInputStream_II().readShort());
                                var95_58.I1l1 = var1_1.java_io_DataInputStream_II().readInt();
                                var62_82 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                if (var62_82 != 0) {
                                    var95_58.var_I100_arr_III = new I100[var62_82];
                                    for (var63_83 = 0; var63_83 < var95_58.var_I100_arr_III.length; ++var63_83) {
                                        var83_81 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var64_80 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                        if (var83_81 == -1) continue;
                                        var95_58.var_I100_arr_III[var63_83] = new I100(var83_81, var64_80);
                                        var95_58.lIOo = II.var_I_1o_II.III(var95_58);
                                    }
                                }
                                if (II.var_I_1o_III != null) {
                                    II.var_I_1o_III.IIo1.addElement(var95_58);
                                } else {
                                    II.var_I_1o_II.IIo1.addElement(var95_58);
                                }
                                ++var94_52;
                            }
                        }
                        if (var59_76 != 7) break;
                        I1OO.I__o();
                        if (!II.var_I_1o_II.I_10) break;
                        II.var_I_1o_II.I__o();
                        break;
                    }
                    case -85: {
                        I_Ol.II__(I1I1.Il("\ub7ae\ub84d\ub87b\ub86a\ub82a\ub8c0\ub8e6\ub887\ub8a4\ub945\ub962\ub903\ub920\ub9c1\ub9de\ub9ff\ub99c\ub9bd\uba5a\uba7b\uba18\uba39\ubad6\ubaf7\uba94\ubab5\ubb52\ubb73\ubb10\ubb31\ubbce\ubbef\ubb8c\ubbad\ubc4a\ubc6b\ubc08\ubc29\ubcc6\ubce7\ubc84\ubca5\ubd42\ubd63\ubd00\ubd21\ubd3e\ubddf\ubdfc\ubd9d\ubdba", 47085));
                        var60_78 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var60_78 == 0) {
                            var61_79 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                            I_Ol.II__(I1I1.Il("\ub781\ub869\ub845\ub83e\ub849\ub8b5", 47085) + var61_79);
                            var93_46 = new byte[var61_79];
                            var1_1.java_io_DataInputStream_II().read(var93_46, 0, var61_79);
                            I1_I.Il_I = Image.createImage((byte[])var93_46, (int)0, (int)var61_79);
                            I1_I.I1_I_II().var_java_lang_String_IlII = I1I1.Il("\ub7c0\ub821\ub806\ub867\ub844", 47085);
                            I1_I.I1_I_II().var_java_lang_String_IlI = var1_1.java_io_DataInputStream_II().readUTF();
                            I1_I.I1_I_II().IlO0 = new int[I1_I.I1_I_II().var_java_lang_String_IlI.length()];
                            I1_I.I1_I_II().var_I_I__IIIO = new I_I_();
                            I1_I.I1_I_II().IIl = null;
                        }
                        if (var60_78 == 1) {
                            I_IO.I0l_ = true;
                        }
                        if (var60_78 != 2) break;
                        I_IO.I0l1 = true;
                        I1_I.I1_I_II().IIl = I1_I.I1_I_II().var_I1Il_IIlI;
                        break;
                    }
                    case -84: {
                        var61_79 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        var93_47 = null;
                        try {
                            var93_47 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var61_79);
                        }
                        catch (Exception var94_53) {
                            // empty catch block
                        }
                        if (var93_47 == null) break;
                        var93_47.llI1 = var1_1.java_io_DataInputStream_II().readInt();
                        break;
                    }
                    case -83: {
                        var94_54 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var94_54 == 0) {
                            var62_82 = var1_1.java_io_DataInputStream_II().readShort();
                            var95_59 = var1_1.java_io_DataInputStream_II().readShort();
                            var83_81 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            var64_80 = var1_1.java_io_DataInputStream_II().readInt();
                            var96_84 = var1_1.java_io_DataInputStream_II().readUTF();
                            var97_92 = var1_1.java_io_DataInputStream_II().readShort();
                            var98_102 = var1_1.java_io_DataInputStream_II().readShort();
                            var99_105 = var1_1.java_io_DataInputStream_II().readByte();
                            I1_I.I1_I_II().IO11 = var99_105 == 1;
                            I1_I.I1_I_II().Iool = var97_92;
                            I1_I.I1_I_II().Ioo1 = var98_102;
                            I_Ol.II__(I1I1.Il("\ub795\ub85e\ub816\ub86a", 47085) + var97_92 + I1I1.Il("\ub7cd\ub875\ub879\ub877\ub849", 47085) + var98_102 + I1I1.Il("\ub7cd\ub827\ub800\ub861\ub842\ub8a3\ub88c\ub8ed\ub8ce\ub92f\ub908\ub969\ub94a\ub9ab\ub9b4\ub995\ub9f6\ub9d7\uba30\uba11\uba72\uba53\ubabc\uba9d\ubafe\ubadf\ubb38\ubb19\ubb7a\ubb5b\ubba4\ubb85\ubbe6\ubbc7\ubc20\ubc01\ubc62\ubc43\ubcac\ubc8d", 47085));
                            if (Ilol.Ilol_II().IOI_ == var64_80) {
                                II.var_I_1o_II.Iol_();
                                I1_I.I1_I_II().IIll(true);
                            } else if (IOlO.l1oI == var62_82 && IOlO.l1ol == var83_81) {
                                I1_I.I1_I_II().IIll(false);
                            } else if (IO1l.l_I0 > 1) {
                                I1_I.I1_I_II().I0_l();
                            }
                            I1_I.I1_I_II().Ioo_ = var62_82;
                            I1_I.I1_I_II().IooO = var83_81;
                            I1_I.I1_I_II().I0_I();
                            if (IOlO.l1oI == var62_82 && IOlO.l1ol == var83_81) {
                                I1_I.I1_I_II().IO1_ = true;
                                I1_I.I1_I_II().Io00 = 0;
                                I1_I.I1_I_II().Io0o = var97_92;
                                I1_I.I1_I_II().Ioo = var98_102;
                            }
                        }
                        if (var94_54 == 1) {
                            I_Ol.II__(I1I1.Il("\ub780\ub86d\ub85b\ub86a\ub83b\ub8c1\ub8e3\ub8e6\ub8d8\ub924", 47085) + I1_I.I1_I_II().Ioo_ + I1I1.Il("\ub7cd\ub876\ub844\ub824\ub80c\ub8a8\ub8f5\ub88f\ub8a1\ub939\ub903", 47085) + I1_I.I1_I_II().IooO);
                            I_Ol.II__(I1I1.Il("\ub780\ub86d\ub85b\ub86a\ub820\ub8cc\ub887\ub8fb\ub8c5", 47085) + IOlO.l1oI + I1I1.Il("\ub7cd\ub876\ub844\ub824\ub80c\ub8a8\ub8ee\ub882\ub8d8\ub924", 47085) + IOlO.l1ol);
                            for (var95_59 = 0; var95_59 < 8; ++var95_59) {
                                I1lI.IIO(17);
                                I1lI.IIO(25);
                                I1lI.IIO(20);
                            }
                            I1_I.I1_I_II().IO1l = false;
                            I1_I.I1_I_II().IO1_ = false;
                            I1_I.I1_I_II().IO1O = false;
                            if (IOlO.l1oI == I1_I.I1_I_II().Ioo_ && IOlO.l1ol == I1_I.I1_I_II().IooO) {
                                I1_I.I1_I_II().I0_I();
                            } else {
                                I1_I.I1_I_II().IO1l = false;
                                if (I1_I.I1_I_II().IO11) {
                                    I1_I.I1_I_II().IO11 = false;
                                }
                            }
                        }
                        if (var94_54 == 2) break;
                        break;
                    }
                    case -82: {
                        var62_82 = var1_1.java_io_DataInputStream_II().readByte();
                        IOlO.III = new int[var62_82][][];
                        IOlO.var_int_arr_arr_II1 = new int[var62_82][];
                        for (var63_83 = 0; var63_83 < var62_82; ++var63_83) {
                            var95_60 = var1_1.java_io_DataInputStream_II().readByte();
                            IOlO.var_int_arr_arr_II1[var63_83] = new int[var95_60];
                            IOlO.III[var63_83] = new int[var95_60][];
                            for (var64_80 = 0; var64_80 < var95_60; ++var64_80) {
                                IOlO.var_int_arr_arr_II1[var63_83][var64_80] = var1_1.java_io_DataInputStream_II().readInt();
                                var84_115 = var1_1.java_io_DataInputStream_II().readByte();
                                IOlO.III[var63_83][var64_80] = new int[var84_115];
                                for (var65_114 = 0; var65_114 < var84_115; ++var65_114) {
                                    IOlO.III[var63_83][var64_80][var65_114] = var1_1.java_io_DataInputStream_II().readByte();
                                }
                            }
                        }
                        break;
                    }
                    case -81: {
                        var63_83 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var63_83 == 0) {
                            var95_61 = var1_1.java_io_DataInputStream_II().readUTF();
                            var96_84 = var1_1.java_io_DataInputStream_II().readUTF();
                            II.var_I_1o_II.I0o0();
                            II.var_I_1o_II.II_l = IO1I.III.II((String)var95_61, I_1o.llOI);
                            II.var_I_1o_II.II_1 = IO1I.IIlI.II((String)var96_84, I_1o.llOI);
                            II.var_I_1o_II.I__0();
                        }
                        if (var63_83 == 1) {
                            II.var_I_1o_II.II0O.removeAllElements();
                            var83_81 = var1_1.java_io_DataInputStream_II().readByte();
                            var64_80 = 0;
                            while (true) {
                                if (var64_80 >= var83_81) {
                                    if (!II.var_I_1o_II.I_10) break;
                                    II.var_I_1o_II.I0oo();
                                    break;
                                }
                                var84_115 = var1_1.java_io_DataInputStream_II().readByte();
                                for (var65_114 = 0; var65_114 < Ilol.Ilol_II().var_I101_arr_II.length; ++var65_114) {
                                    var95_61 = Ilol.Ilol_II().var_I101_arr_II[var65_114];
                                    if (var95_61 == null || var95_61.lIO_ != var84_115) continue;
                                    var95_61.IO0I = true;
                                    II.var_I_1o_II.II0O.addElement(var95_61);
                                }
                                ++var64_80;
                            }
                        }
                        if (var63_83 == 2) {
                            II.var_I_1o_II.IlIl = 0;
                            II.var_I_1o_II.II0(0);
                        }
                        if (var63_83 == 3) {
                            II.var_I_1o_II.IlIl = 1;
                            II.var_I_1o_II.II0(0);
                        }
                        if (var63_83 == 4) {
                            var83_81 = var1_1.java_io_DataInputStream_II().readShort();
                            II.var_I_1o_II.II0 = (short)var83_81;
                            II.var_I_1o_II.IlIl = 0;
                            II.var_I_1o_II.II0(1);
                        }
                        if (var63_83 == 5) {
                            var83_81 = var1_1.java_io_DataInputStream_II().readShort();
                            II.var_I_1o_II.II0 = (short)var83_81;
                            II.var_I_1o_II.IlIl = 0;
                            II.var_I_1o_II.II0(2);
                        }
                        if (var63_83 == 6) {
                            var83_81 = var1_1.java_io_DataInputStream_II().readShort();
                            var95_62 = var1_1.java_io_DataInputStream_II().readShort();
                            II.var_I_1o_II.IlIl = 0;
                            II.var_I_1o_II.II0(3);
                            II.var_I_1o_II.IIO0 = (short)var83_81;
                            II.var_I_1o_II.II0 = var95_62;
                        }
                        if (var63_83 == 7) {
                            var83_81 = var1_1.java_io_DataInputStream_II().readShort();
                            II.var_I_1o_II.II0 = (short)var83_81;
                            II.var_I_1o_II.IlIl = 0;
                            II.var_I_1o_II.II0(4);
                        }
                        if (var63_83 == 8) {
                            II.var_I_1o_II.II0 = (short)-1;
                            II.var_I_1o_II.IlIl = 1;
                            II.var_I_1o_II.II0(4);
                        }
                        var83_81 = 21;
                        try {
                            var83_81 = var1_1.java_io_DataInputStream_II().readShort();
                        }
                        catch (Exception var95_63) {
                            // empty catch block
                        }
                        for (var64_80 = 0; var64_80 < I1_I.var_I_lO_IIOI.size(); ++var64_80) {
                            var95_64 = (I_11)I1_I.var_I_lO_IIOI.elementAt(var64_80);
                            if (var95_64.var_I_1__II.lll0 != var83_81) continue;
                            II.var_I_1o_II.l1I0 = var95_64.I_o_ - I1_I.Io1;
                            II.var_I_1o_II.l1Io = var95_64.I_oO - I1_I.Io1I;
                            II.var_I_1o_II.l1IO = var83_81;
                            break block114;
                        }
                        break;
                    }
                    case -80: {
                        var64_80 = var1_1.java_io_DataInputStream_II().readByte();
                        I1OO.I__o();
                        if (var64_80 == 0) {
                            II.var_I_1o_II.IIoI.removeAllElements();
                            var95_65 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            for (var65_114 = 0; var65_114 < var95_65; ++var65_114) {
                                var96_84 = new Ilol();
                                var96_84.IOI_ = var1_1.java_io_DataInputStream_II().readInt();
                                var96_84.I0 = var1_1.java_io_DataInputStream_II().readShort();
                                var96_84.IOoo = var1_1.java_io_DataInputStream_II().readShort();
                                var96_84.I0II = var1_1.java_io_DataInputStream_II().readShort();
                                var96_84.I0I = var1_1.java_io_DataInputStream_II().readShort();
                                var96_84.I0Il = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                var96_84.IIO1 = var1_1.java_io_DataInputStream_II().readUTF();
                                var97_93 = var1_1.java_io_DataInputStream_II().readBoolean();
                                var98_103 = new I1O0(IO11.IO_0 + I1I1.Il("\ub7d7\ub82c", 47085) + var1_1.java_io_DataInputStream_II().readUTF());
                                var98_103.IIll = var96_84;
                                var98_103.IOO0 = var97_93;
                                II.var_I_1o_II.IIoI.addElement(var98_103);
                            }
                            II.var_I_1o_II.I0oI();
                            II.var_I_1o_II.I__0();
                        }
                        if (var64_80 == 3) {
                            var95_66 = II.var_I_1o_II.IIoI;
                            var65_114 = var1_1.java_io_DataInputStream_II().readInt();
                            I_Ol.II__(I1I1.Il("\ub782\ub862\ub847\ub823\ub807\ub8ed\ub887\ub8a9\ub883\ub962\ub94f\ub92b\ub90f\ub9e5\ub9bf\ub9d7\ub9b9\ub9c1", 47085) + var65_114);
                            for (var66_116 = 0; var66_116 < var95_66.size(); ++var66_116) {
                                var96_84 = (I1O0)var95_66.elementAt(var66_116);
                                if (var96_84.IIll == null || var96_84.IIll.IOI_ != var65_114) continue;
                                I_Ol.II__(I1I1.Il("\ub782\ub862\ub847\ub823\ub807\ub8ed\ub89a\ub8e6", 47085) + var96_84.IOO0);
                                var96_84.IOO0 = var1_1.java_io_DataInputStream_II().readBoolean();
                                break;
                            }
                        }
                        if (var64_80 != 2) break;
                        var95_67 = II.var_I_1o_II.IIoI;
                        var65_114 = var1_1.java_io_DataInputStream_II().readInt();
                        for (var66_116 = 0; var66_116 < var95_67.size(); ++var66_116) {
                            var96_84 = (I1O0)var95_67.elementAt(var66_116);
                            if (var96_84.IIll == null || var96_84.IIll.IOI_ != var65_114) continue;
                            var95_67.removeElement(var96_84);
                            break;
                        }
                        if (!II.var_I_1o_II.I_10) break;
                        II.var_I_1o_II.I0o1();
                        break;
                    }
                    case -79: {
                        I1OO.I__o();
                        var66_116 = var1_1.java_io_DataInputStream_II().readInt();
                        var97_94 = II.var_I_1o_II.II1;
                        if (var97_94 == null) {
                            return;
                        }
                        var97_94.Illo = var1_1.java_io_DataInputStream_II().readLong();
                        var97_94.IIO_ = var1_1.java_io_DataInputStream_II().readUTF();
                        break;
                    }
                    case -77: {
                        var98_104 = var1_1.java_io_DataInputStream_II().readShort();
                        I_oo.IIII = new byte[var98_104];
                        I_oo.II0l = var98_104;
                        I_oo.II = new I_oO[var98_104];
                        for (var67_117 = 0; var67_117 < var98_104; ++var67_117) {
                            I_oo.IIII[var67_117] = var1_1.java_io_DataInputStream_II().readByte();
                        }
                        break;
                    }
                    case -76: {
                        var67_117 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var67_117 == 0) {
                            var99_106 = var1_1.java_io_DataInputStream_II().readByte();
                            if (var99_106 <= 0) {
                                return;
                            }
                            Ilol.Ilol_II().var_Il0I_arr_II = new Il0I[var99_106];
                            for (var100_118 = 0; var100_118 < var99_106; ++var100_118) {
                                Ilol.Ilol_II().var_Il0I_arr_II[var100_118] = new Il0I();
                                Ilol.Ilol_II().var_Il0I_arr_II[var100_118].II_0 = var100_118 + 1 + I1I1.Il("\ub7c3\ub82c", 47085) + var1_1.java_io_DataInputStream_II().readUTF();
                                Ilol.Ilol_II().var_Il0I_arr_II[var100_118].II_o = var1_1.java_io_DataInputStream_II().readUTF();
                                Ilol.Ilol_II().var_Il0I_arr_II[var100_118].I_OO = var1_1.java_io_DataInputStream_II().readShort();
                                Ilol.Ilol_II().var_Il0I_arr_II[var100_118].I1I1 = var1_1.java_io_DataInputStream_II().readBoolean();
                                Ilol.Ilol_II().var_Il0I_arr_II[var100_118].I1I_ = var1_1.java_io_DataInputStream_II().readBoolean();
                            }
                            II.var_I_1o_II.I00o();
                            II.var_I_1o_II.I__0();
                            break;
                        }
                        if (var67_117 != 1 || Ilol.Ilol_II().var_Il0I_arr_II[var68_122 = var1_1.java_io_DataInputStream_II().readUnsignedByte()] == null) break;
                        Ilol.Ilol_II().var_Il0I_arr_II[var68_122].I1I_ = true;
                        break;
                    }
                    ** case -74:
                    case -70: {
                        I_Ol.II__(I1I1.Il("\ub7af\ub845\ub86c\ub86a\ub824\ub8cd\ub8f4\ub895\ub8a4\ub943\ub966\ub962\ub94f\ub9ae\ub9b1\ub990\ub9f3\ub9d2\uba35\uba14\uba77\uba56\ubab9\uba98\ubafb\ubada\ubb3d\ubb1c\ubb7f\ubb5e\ubba1\ubb80\ubbe3\ubbc2\ubc25\ubc04\ubc67\ubc46\ubca9\ubc88\ubceb\ubcca\ubd2d\ubd0c\ubd6f\ubd4e\ubd51\ubdb0\ubd93\ubdf2\ubdd5", 47085));
                        II.III_();
                        var68_122 = var1_1.java_io_DataInputStream_II().readShort();
                        var99_109 = var1_1.java_io_DataInputStream_II().readUTF();
                        var100_120 = new I_11(-1, 0, 0, 0, 0, 0);
                        new I_11(-1, 0, 0, 0, 0, 0).IO_l = var68_122;
                        Ilo1.void_II(var99_109, 100000, var100_120);
                        var101_130 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var101_130 == 0) {
                            Ilo1.var_Ilo1_IIII.var_I1Il_IIIl = new I1Il(IO11.I_I, Ilo1.var_Ilo1_IIII, 1001, null);
                            Ilo1.var_Ilo1_IIII.var_I1Il_IIIl.I1 = II.var_int_IIl / 2 - 35;
                            Ilo1.var_Ilo1_IIII.var_I1Il_IIIl.I1I = II.var_int_IIlI - 35;
                        }
                        if (var101_130 != 1) break;
                        var102_137 /* !! */  = (byte[])var1_1.java_io_DataInputStream_II().readUTF();
                        var31_143 = var1_1.java_io_DataInputStream_II().readUTF();
                        Ilo1.var_Ilo1_IIII.var_I1Il_IIIl = new I1Il(var31_143, Ilo1.var_Ilo1_IIII, 1000, var102_137 /* !! */ );
                        Ilo1.var_Ilo1_IIII.var_I1Il_IIIl.I1 = II.var_int_IIl / 2 - 75;
                        Ilo1.var_Ilo1_IIII.var_I1Il_IIIl.I1I = II.var_int_IIlI - 35;
                        Ilo1.var_Ilo1_IIII.var_I1Il_III1 = new I1Il(IO11.I_I, Ilo1.var_Ilo1_IIII, 1001, null);
                        Ilo1.var_Ilo1_IIII.var_I1Il_III1.I1 = II.var_int_IIl / 2 + 11;
                        Ilo1.var_Ilo1_IIII.var_I1Il_III1.I1I = II.var_int_IIlI - 35;
                        break;
                    }
                    case -69: {
                        Ilol.Ilol_II().var_short_IIl1 = var1_1.java_io_DataInputStream_II().readShort();
                        break;
                    }
                    case -68: {
                        Ilol.Ilol_II().IO_0 = var1_1.java_io_DataInputStream_II().readShort();
                        break;
                    }
                    case -67: {
                        this.var_float_II += 1.0f;
                        var23_144 = var1_1.java_io_DataInputStream_II().readInt();
                        try {
                            var102_137 /* !! */  = I_1l.II(var1_1);
                            if (I_oo.II != null) {
                                I_oo.II[var23_144].I1I1 = I1I1.II(var102_137 /* !! */ );
                            }
                        }
                        catch (Exception var103_145) {
                            var102_137 /* !! */  = null;
                            if (I_oo.II == null || I_oo.II[var23_144] == null) ** GOTO lbl758
                            I_oo.II[var23_144].I1I1 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                        }
lbl758:
                        // 3 sources

                        if (var102_137 /* !! */  == null) break;
                        I_O1.II(IO1l.l_I0 + I1I1.Il("\ub7be\ub861\ub84a\ub826\ub805", 47085) + var23_144, var102_137 /* !! */ );
                        break;
                    }
                    case -66: {
                        var24_150 = var1_1.java_io_DataInputStream_II().readShort();
                        var103_146 = I_1l.II(var1_1);
                        var104_151 = I1ll.I1l0_II(var24_150);
                        var105_154 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var105_154 == 0) {
                            var104_151.II((byte[])var103_146);
                        } else {
                            var104_151.II((byte[])var103_146, (byte)var105_154);
                        }
                        var106_156 = I_1l.II(var1_1);
                        var104_151.II01 = Image.createImage((byte[])var106_156, (int)0, (int)((byte[])var106_156).length);
                        break;
                    }
                    case -65: {
                        I1OO.I__o();
                        var107_158 = var1_1.java_io_DataInputStream_II().readInt();
                        var108_159 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub7b9\ub849\ub867\ub80f\ub839\ub8c7\ub8f5\ub892\ub8c5\ub92a\ub90d\ub96c\ub94f\ub9ae\ub9b1\ub990\ub9f3\ub9d2\uba35\uba14\uba77\uba56\ubab9\uba98\ubafb\ubada\ubb3d\ubb1c\ubb7f\ubb5e\ubba1\ubb80\ubbe3\ubbc2\ubc25\ubc04\ubc67\ubc46\ubca9\ubc88\ubceb\ubcca\ubd2d\ubd0c\ubd6f\ubd4e\ubd51\ubdb0\ubd93\ubdf2\ubdd5\ube34\ube17\ube76\ube59\ubeb8\ube9b\ubefa\ubedd\ubf3c", 47085) + var108_159);
                        if (var108_159 == 0) break;
                        if (Ilol.Ilol_II().IOI_ == var107_158) {
                            I1_I.I1_I_II().III0 = null;
                            if (var108_159 != 0 && var108_159 != 1 && var108_159 != 3) break;
                            new IOl1(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, Ilol.Ilol_II().I0, Ilol.Ilol_II().IOI1, 0, true, var108_159 != 1 ? var108_159 : Ilol.Ilol_II().IOIO);
                            break;
                        }
                        var109_160 = I1_I.Ilol_II(var107_158);
                        if ((var108_159 == 0 || var108_159 == 1 || var108_159 == 3) && var109_160 != null) {
                            var109_160.I11I = true;
                            var110_163 = new IOl1(var109_160.I_o_, var109_160.I_oO, var109_160.I0, var109_160.IOI1, 0, false, var108_159 != 1 ? var108_159 : var109_160.IOIO);
                            var110_163.I1l = var107_158;
                            var110_163.II1_ = var109_160;
                            IOl1.II(var110_163);
                        }
                        if (var108_159 != 2) break;
                        var109_160.I__o();
                        break;
                    }
                    case -64: {
                        var3_125 = var1_1.java_io_DataInputStream_II().readInt();
                        var8_127 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        var109_160 = var3_125 == Ilol.Ilol_II().IOI_ ? Ilol.Ilol_II() : I1_I.Ilol_II(var3_125);
                        if (var109_160 == null) {
                            return;
                        }
                        var109_160.I0Il = var8_127;
                        for (var36_167 = 0; var36_167 < 54; ++var36_167) {
                            var109_160.IIl(0, var36_167 + 201);
                        }
                        if (var109_160.I0Il >= 201 && var109_160.I0Il < 255) {
                            var110_164 = new I1ll(var109_160.I0Il, var109_160, 2, -1, 10, 1);
                            new I1ll(var109_160.I0Il, var109_160, 2, -1, 10, 1).I_O0 = 5;
                            var109_160.II(var110_164);
                        }
                        I_Ol.II__(I1I1.Il("\ub78e\ub861\ub84f\ub870\ub844\ub8be\ub893\ub8e6\ub8b0\ub954\ub967\ub903\ub935\ub9c5\ub9bf\ub9fc\ub99c\ub9bb\uba3b\uba6a\uba15\uba39\ubad2\ubae4\ubaf5\ubac9\ubb33", 47085) + (var109_160 == null ? "" : var109_160.IIO1) + var3_125 + I1I1.Il("\ub7cd\ub84e\ub86a\ub80d\ub849\ub8c1\ub8e3\ub8fb\ub8c5", 47085) + var8_127);
                        break;
                    }
                    case -63: {
                        I_Ol.II__(I1I1.Il("\ub7aa\ub849\ub87f\ub86a\ub82b\ub8c9\ub8e0", 47085));
                        var3_125 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        var12_168 = var1_1.java_io_DataInputStream_II().readByte();
                        var37_169 = new Iloo();
                        new Iloo().IoIl = var3_125;
                        if (var12_168 <= 0) break;
                        var37_169.IIIl = new short[var12_168];
                        for (var36_167 = 0; var36_167 < var12_168; ++var36_167) {
                            var37_169.IIIl[var36_167] = var1_1.java_io_DataInputStream_II().readShort();
                            I_Ol.II__(I1I1.Il("\ub7a4\ub848\ub816\ub86a\ub849", 47085) + var3_125 + I1I1.Il("\ub7cd\ub86a\ub859\ub82b\ub804\ub8ed\ub89a\ub8e6", 47085) + var37_169.IIIl[var36_167]);
                        }
                        Iloo.IIII.put(String.valueOf(var3_125), var37_169);
                        break;
                    }
                    case -62: {
                        var5_170 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        var35_171 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub78e\ub861\ub84f\ub870\ub849\ub8a5\ub891\ub8f4\ub8c5\ub947\ub96f\ub903\ub92f\ub9df\ub9d6\ub9f3\ub99c\ub9bb\uba5e\uba1a\uba30\uba1c\ubaaa\uba96", 47085) + var5_170 + I1I1.Il("\ub7cd\ub862\ub862\ub827\ub808\ub8ef\ub8c2\ub8fb\ub8c5", 47085) + var35_171);
                        if (var35_171 <= 0 || (var37_169 = Iloo.II((short)var5_170)) == null) break;
                        var37_169.IIIl = new short[var35_171];
                        for (var36_167 = 0; var36_167 < var35_171; ++var36_167) {
                            var37_169.IIIl[var36_167] = var1_1.java_io_DataInputStream_II().readShort();
                            if (var37_169.IIIl[var36_167] <= 0) continue;
                            I_oo.II_I.addElement(String.valueOf(var37_169.IIIl[var36_167]));
                        }
                        break;
                    }
                    case -61: {
                        var5_170 = var1_1.java_io_DataInputStream_II().readInt();
                        if (var5_170 != Ilol.Ilol_II().IOI_) {
                            if (I1_I.Ilol_II(var5_170) == null) break;
                            I1_I.Ilol_II((int)var5_170).IO1I = var1_1.java_io_DataInputStream_II().readInt();
                            if (I1_I.Ilol_II((int)var5_170).IO1I != -2) break;
                            I1_I.Ilol_II((int)var5_170).I_Il = true;
                            break;
                        }
                        if (Ilol.Ilol_II().var_Ilo0_II == null) break;
                        Ilol.Ilol_II().var_Ilo0_II.II0I = var1_1.java_io_DataInputStream_II().readInt();
                        break;
                    }
                    case -60: {
                        var110_165 = var1_1.java_io_DataInputStream_II().readInt();
                        var111_172 = -1;
                        if (var110_165 == Ilol.Ilol_II().IOI_) {
                            var1_1.java_io_DataInputStream_II().readByte();
                            var1_1.java_io_DataInputStream_II().readByte();
                            var111_172 = var1_1.java_io_DataInputStream_II().readInt();
                        } else {
                            var112_173 = I1_I.Ilol_II(var110_165);
                            if (var112_173 == null) {
                                return;
                            }
                            if (var112_173.var_I_ll_II != null) {
                                var112_173.II(var112_173.I_o_, var112_173.I_oO, 10);
                                var112_173.I_o_ = var112_173.var_I_ll_II.lI0;
                                var112_173.I_oO = var112_173.var_I_ll_II.lI0I;
                            }
                            var69_178 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            if ((IOlO.IIl(var112_173.I_o_, var112_173.I_oO) & 2) == 2) {
                                var112_173.II(I1_I.var_I_ol_arr_II[var69_178], 0);
                            } else {
                                var112_173.II(I1_I.var_I_ol_arr_II[var69_178], 1);
                            }
                            var47_179 = new Ilol[var1_1.java_io_DataInputStream_II().readByte()];
                            for (var34_180 = 0; var34_180 < var47_179.length; ++var34_180) {
                                var111_172 = var1_1.java_io_DataInputStream_II().readInt();
                                if (var111_172 == Ilol.Ilol_II().IOI_) {
                                    var113_181 = Ilol.Ilol_II();
                                    if (!I1_I.IO_l && I1_I.IO_ && I1_I.IO_I) {
                                        I_0_.II().II0O(-1);
                                        I1_I.IO_l = true;
                                    }
                                } else {
                                    var113_181 = I1_I.Ilol_II(var111_172);
                                }
                                var47_179[var34_180] = var113_181;
                                if (var34_180 != 0) continue;
                                var112_173.IOI1 = var112_173.I_o_ <= var113_181.I_o_ ? 1 : -1;
                            }
                            if (var34_180 > 0) {
                                var112_173.var_Ilol_arr_IIIl = new Ilol[var34_180];
                                for (var34_180 = 0; var34_180 < var112_173.var_Ilol_arr_IIIl.length; ++var34_180) {
                                    var112_173.var_Ilol_arr_IIIl[var34_180] = var47_179[var34_180];
                                }
                                var112_173.var_I_I__IIII = null;
                                var112_173.var_Ilol_IIIl = var112_173.var_Ilol_arr_IIIl[0];
                            }
                        }
                        try {
                            if (var1_1.java_io_DataInputStream_II().readByte() != 1) break;
                            var112_174 = var1_1.java_io_DataInputStream_II().readByte();
                            if (var111_172 == Ilol.Ilol_II().IOI_) {
                                var25_188 = Ilol.Ilol_II();
                                var114_189 = var1_1.II_I();
                                var25_188.I11O = var1_1.java_io_DataInputStream_II().readBoolean();
                                if (var25_188.I11O) {
                                    Ilol.var_boolean_I10 = true;
                                }
                                var25_188.I11_ = var113_182 = var1_1.java_io_DataInputStream_II().readBoolean();
                                var25_188.I111 = false;
                                var25_188.var_int_II10 = var114_189;
                                if (var112_174 != 0) break;
                                var25_188.II((int)var114_189, 0, var113_182, false);
                                break;
                            }
                            var25_188 = I1_I.Ilol_II(var111_172);
                            if (var25_188 == null) {
                                return;
                            }
                        }
                        catch (Exception var112_175) {
                        }
                        {
                            var114_189 = var1_1.II_I();
                            var25_188.I11O = var1_1.java_io_DataInputStream_II().readBoolean();
                            var25_188.I11_ = var113_183 = var1_1.java_io_DataInputStream_II().readBoolean();
                            var25_188.I111 = false;
                            var25_188.var_int_II10 = var114_189;
                            if (var112_174 != 0) break;
                            var25_188.II((int)var114_189, 0, var113_183, false);
                        }
                        break;
                    }
                    case -59: {
                        var35_171 = var1_1.java_io_DataInputStream_II().readByte();
                        var112_176 = I1_I.I1_I_II();
                        var69_178 = var1_1.java_io_DataInputStream_II().readInt();
                        var1_1.java_io_DataInputStream_II().readInt();
                        var112_176.II(var69_178, var1_1.java_io_DataInputStream_II().readUTF(), (byte)var35_171);
                        break;
                    }
                    case -57: {
                        var40_126 = var1_1.java_io_DataInputStream_II().readUTF();
                        var5_170 = var1_1.java_io_DataInputStream_II().readInt();
                        var3_125 = var1_1.java_io_DataInputStream_II().readInt();
                        I1_I.I1_I_II().II(var40_126, var5_170, var3_125);
                        break;
                    }
                    case -53: {
                        I_Ol.II__(I1I1.Il("\ub7a0\ub855\ub80b\ub809\ub825\ub8c9\ub8e9\ub8e6\ub8ac\ub94a\ub965\ub90d", 47085));
                        I1OO.I__o();
                        var5_170 = var1_1.java_io_DataInputStream_II().readInt();
                        I_Ol.II__(I1I1.Il("\ub78e\ub860\ub84a\ub824\ub820\ub8ec\ub89a\ub8e6", 47085) + var5_170);
                        if (var5_170 == -1) {
                            Ilol.Ilol_II().var_Ilo0_II = null;
                            I1.II1.removeAllElements();
                            if (II.var_I_1o_II.II00 != null) {
                                II.var_I_1o_II.II00.removeAllElements();
                            }
                            if (II.var_I_1o_II.II0o != null) {
                                II.var_I_1o_II.II0o.removeAllElements();
                            }
                            if (II.var_IO1__II != I1_I.I1_I_II()) return;
                            II.var_I_1o_II.IoIo();
                            return;
                        }
                        II.var_I_1o_II.var_IOl_II = null;
                        if (Ilol.Ilol_II().var_Ilo0_II == null) {
                            Ilol.Ilol_II().var_Ilo0_II = new Ilo0();
                        }
                        Ilol.Ilol_II().var_Ilo0_II.II0I = var5_170;
                        Ilol.Ilol_II().var_Ilo0_II.II0o = var1_1.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II().var_Ilo0_II.IIo = var1_1.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II().var_Ilo0_II.I_O0 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        Ilol.Ilol_II().var_Ilo0_II.IIoI = var1_1.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II().var_Ilo0_II.IIol = var1_1.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II().var_Ilo0_II.IIOl = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        Ilol.Ilol_II().var_Ilo0_II.IIlI = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        Ilol.Ilol_II().var_byte_III_ = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_Ilo0_II.IoII = var1_1.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II().var_Ilo0_II.IIO_ = var1_1.java_io_DataInputStream_II().readByte();
                        II.var_I_1o_II.II0o = new I_lO(I1I1.Il("\ub7aa\ub86d\ub846\ub82f\ub82a\ub8e9\ub8c9\ub8b0\ub884\ub977\ub90d\ub932\ub900\ub9ee\ub9fa\ub9d2\ub9f3\ub991\uba62\uba77\uba3c\uba15\ubaf5\ubad3\ubaa7\ubad4", 47085));
                        for (var5_170 = 0; var5_170 < Ilol.Ilol_II().var_Ilo0_II.IIOl; ++var5_170) {
                            var70_191 = new I_I();
                            new I_I().IoIl = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.IIOI = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.IIII = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.IIOl = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.var_short_IIO1 = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.IIoI = var1_1.java_io_DataInputStream_II().readUTF();
                            var70_191.II1_ = var1_1.java_io_DataInputStream_II().readByte();
                            var70_191.IIo_ = var1_1.java_io_DataInputStream_II().readUTF();
                            var70_191.var_int_IIO1 = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.IIO_ = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.IIO0 = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.IoII = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.Ill_ = I_1l.III1(var1_1.java_io_DataInputStream_II().readInt());
                            II.var_I_1o_II.II0o.addElement(var70_191);
                        }
                        var5_170 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        for (var3_125 = 0; var3_125 < var5_170; ++var3_125) {
                            I1I1.II(var1_1, -1);
                        }
                        if (!II.var_I_1o_II.I0lo && !II.var_I_1o_II.I1l_ && !II.var_I_1o_II.I01) break;
                        II.var_I_1o_II.IoIo();
                        break;
                    }
                    case -52: {
                        var35_171 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var35_171 == 0) {
                            var70_191 = new I_I();
                            new I_I().IoIl = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.IIOI = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.IIII = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.IIOl = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.var_short_IIO1 = var1_1.java_io_DataInputStream_II().readShort();
                            var70_191.IIoI = var1_1.java_io_DataInputStream_II().readUTF();
                            var70_191.II1_ = var1_1.java_io_DataInputStream_II().readByte();
                            var70_191.IIo_ = var1_1.java_io_DataInputStream_II().readUTF();
                            var70_191.var_int_IIO1 = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.IIO_ = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.IIO0 = var1_1.java_io_DataInputStream_II().readInt();
                            var70_191.Ill_ = I_1l.III1(var1_1.java_io_DataInputStream_II().readInt());
                            if (II.var_I_1o_II.II0o == null) {
                                II.var_I_1o_II.II0o = new I_lO(I1I1.Il("\ub78c\ub861\ub84e\ub809\ub808\ub8e6\ub8d1\ub8a7\ub896\ub92a\ub953\ub923\ub90f\ub9e5\ub9f3\ub990\ub9b0\ub985\uba56\uba5f\uba34\uba1a\ubaf2\ubac4", 47085));
                            }
                            II.var_I_1o_II.II0o.addElement(var70_191);
                            II.var_I_1o_II.IoI0();
                        }
                        if (var35_171 == 1) {
                            II.var_I_1o_II.II0o.removeElementAt(var1_1.java_io_DataInputStream_II().readByte());
                            --II.var_I_1o_II.llO;
                            II.var_I_1o_II.IoI0();
                        }
                        if (var35_171 != 2) break;
                        var70_191 = new I_I();
                        new I_I().IoIl = var1_1.java_io_DataInputStream_II().readInt();
                        var70_191.IIOI = var1_1.java_io_DataInputStream_II().readShort();
                        var70_191.IIII = var1_1.java_io_DataInputStream_II().readShort();
                        var70_191.IIOl = var1_1.java_io_DataInputStream_II().readShort();
                        var70_191.var_short_IIO1 = var1_1.java_io_DataInputStream_II().readShort();
                        var70_191.IIoI = var1_1.java_io_DataInputStream_II().readUTF();
                        var70_191.II1_ = var1_1.java_io_DataInputStream_II().readByte();
                        var70_191.IIo_ = var1_1.java_io_DataInputStream_II().readUTF();
                        var70_191.var_int_IIO1 = var1_1.java_io_DataInputStream_II().readInt();
                        var70_191.IIO_ = var1_1.java_io_DataInputStream_II().readInt();
                        var70_191.IIO0 = var1_1.java_io_DataInputStream_II().readInt();
                        var70_191.Ill_ = I_1l.III1(var1_1.java_io_DataInputStream_II().readInt());
                        for (var3_125 = 0; var3_125 < II.var_I_1o_II.II0o.size(); ++var3_125) {
                            var39_192 = (I_I)II.var_I_1o_II.II0o.elementAt(var3_125);
                            if (var39_192.IoIl != var70_191.IoIl) continue;
                            if (Ilol.Ilol_II().IOI_ == var70_191.IoIl) {
                                Ilol.Ilol_II().var_byte_III_ = var70_191.II1_;
                            }
                            II.var_I_1o_II.II0o.removeElement(var39_192);
                            II.var_I_1o_II.II0o.insertElementAt(var70_191, var3_125);
                            return;
                        }
                        break;
                    }
                    case -51: {
                        I1OO.I__o();
                        I1I1.II(var1_1, 0);
                        if (!II.var_I_1o_II.I01 || II.var_I_1o_II.IoI_ != 5) break;
                        II.var_I_1o_II.IoI0();
                        break;
                    }
                    case -50: {
                        I1OO.I__o();
                        II.var_I_1o_II.II00 = new I_lO(I1I1.Il("\ub7c3\ub87c\ub84a\ub824\ub80c\ub8e4\ub889\ub8ab\ub880\ub969\ub941\ub927\ub913", 47085));
                        var2_123 = var1_1.java_io_DataInputStream_II().readByte();
                        for (var3_125 = 0; var3_125 < var2_123; ++var3_125) {
                            var39_192 = new I_I();
                            new I_I().IoIl = var1_1.java_io_DataInputStream_II().readInt();
                            var39_192.IIOI = var1_1.java_io_DataInputStream_II().readShort();
                            var39_192.IIII = var1_1.java_io_DataInputStream_II().readShort();
                            var39_192.IIOl = var1_1.java_io_DataInputStream_II().readShort();
                            var39_192.var_short_IIO1 = var1_1.java_io_DataInputStream_II().readShort();
                            var39_192.IIoI = var1_1.java_io_DataInputStream_II().readUTF();
                            var39_192.II1_ = var1_1.java_io_DataInputStream_II().readByte();
                            var39_192.IIo_ = var1_1.java_io_DataInputStream_II().readUTF();
                            var39_192.var_int_IIO1 = var1_1.java_io_DataInputStream_II().readInt();
                            var39_192.IIO_ = var1_1.java_io_DataInputStream_II().readInt();
                            var39_192.IIO0 = var1_1.java_io_DataInputStream_II().readInt();
                            var39_192.Ill_ = I_1l.III1(var1_1.java_io_DataInputStream_II().readInt());
                            II.var_I_1o_II.II00.addElement(var39_192);
                        }
                        II.var_I_1o_II.I1l_ = true;
                        II.var_I_1o_II.I0lo = false;
                        II.var_I_1o_II.I01 = false;
                        II.var_I_1o_II.llO = II.var_I_1o_II.II00.size() + 2;
                        II.var_I_1o_II.IoI0();
                        break;
                    }
                    case -47: {
                        I1OO.I__o();
                        var35_171 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub78e\ub860\ub84a\ub824\ub849\ub8b5\ub887", 47085) + var35_171);
                        if (var35_171 == 0) {
                            II.var_I_1o_II.Il1 = IO11.IOoo;
                            II.var_I_1o_II.var_Ilo0_arr_II = null;
                        } else {
                            II.var_I_1o_II.var_Ilo0_arr_II = new Ilo0[var35_171];
                            I_Ol.II__(I1I1.Il("\ub78e\ub860\ub84a\ub824\ub849\ub8fb\ub8c2\ub8a7\ub897\ub967\ub94b\ub962\ub90d\ub9e5\ub9f1\ub9ca\ub9e0\ub9dc", 47085) + II.var_I_1o_II.var_Ilo0_arr_II.length);
                            for (var36_167 = 0; var36_167 < II.var_I_1o_II.var_Ilo0_arr_II.length; ++var36_167) {
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167] = new Ilo0();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].II0I = var1_1.java_io_DataInputStream_II().readInt();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].II0o = var1_1.java_io_DataInputStream_II().readUTF();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].IIo = var1_1.java_io_DataInputStream_II().readUTF();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].I_O0 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].IIoI = var1_1.java_io_DataInputStream_II().readUTF();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].IIol = var1_1.java_io_DataInputStream_II().readUTF();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].IIOl = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].IIlI = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                II.var_I_1o_II.var_Ilo0_arr_II[var36_167].IIO = var1_1.java_io_DataInputStream_II().readInt();
                            }
                        }
                        II.var_I_1o_II.I0lo = true;
                        II.var_I_1o_II.I1l_ = false;
                        II.var_I_1o_II.I01 = false;
                        if (!II.var_I_1o_II.I0lo) break;
                        II.var_I_1o_II.IoI0();
                        break;
                    }
                    case -46: {
                        I1OO.I__o();
                        var7_193 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub78e\ub84d\ub848\ub83e\ub800\ub8e7\ub8c9\ub8fb\ub8c5", 47085) + var7_193);
                        if (var7_193 == 1 || var7_193 == 3) {
                            II.III_();
                            Iloo.IIlo.removeAllElements();
                            var5_170 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            for (var3_125 = 0; var3_125 < var5_170; ++var3_125) {
                                var113_185 = new Iloo();
                                new Iloo().IoIl = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                var113_185.II1o = var1_1.java_io_DataInputStream_II().readUTF();
                                var113_185.IoI1 = var1_1.java_io_DataInputStream_II().readInt();
                                var113_185.IO_ = var1_1.java_io_DataInputStream_II().readInt();
                                if (!Iloo.II1l(var113_185.IoIl)) {
                                    Iloo.II(var113_185);
                                    continue;
                                }
                                Iloo.II((short)((short)var113_185.IoIl)).II1o = var113_185.II1o;
                                Iloo.II((short)((short)var113_185.IoIl)).IoI1 = var113_185.IoI1;
                                Iloo.II((short)((short)var113_185.IoIl)).IO_ = var113_185.IO_;
                            }
                            if (Ilol.Ilol_II().var_Ilo0_II != null) {
                                II.var_I_1o_II.IO1_();
                            }
                        }
                        if (var7_193 != 4) break;
                        Ilol.Ilol_II().var_Ilo0_II.I_O0 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        Ilol.Ilol_II().var_Ilo0_II.IIo = var1_1.java_io_DataInputStream_II().readUTF();
                        I_Ol.II__(I1I1.Il("\ub78e\ub864\ub84a\ub824\ub80e\ub8ed\ub887\ub8b5\ub889\ub96b\ub944\ub923\ub90f\ub9a0", 47085) + Ilol.Ilol_II().var_Ilo0_II.IIo);
                        break;
                    }
                    case -45: {
                        var12_168 = var1_1.java_io_DataInputStream_II().readByte();
                        var4_129 = var1_1.java_io_DataInputStream_II().readInt();
                        var13_194 = var1_1.java_io_DataInputStream_II().readShort();
                        I_Ol.II__(I1I1.Il("\ub7d3\ub822\ub878\ub801\ub820\ub8c4\ub8eb\ub899\ub8ab\ub94b\ub977\ub91d\ub927\ub9cf\ub9dc\ub9eb\ub98e\ub9dc\uba3b\uba49\uba32\uba11\ubafb\ubada\ubaf5\uba80\ubb6a\ubb42\ubb34\ubb4d\ubbaf", 47085) + var12_168 + I1I1.Il("\ub7cd\ub82c\ub80b\ub83a\ub805\ub8e9\ub8de\ub8a3\ub897\ub924\ub956\ub931\ub904\ub9bd\ub9bf", 47085) + var4_129);
                        if (var12_168 == 20) {
                            var113_186 = var1_1.java_io_DataInputStream_II().readByte();
                            var41_195 = var1_1.java_io_DataInputStream_II().readByte();
                            var114_189 = var1_1.java_io_DataInputStream_II().readShort();
                            var71_196 = var1_1.java_io_DataInputStream_II().readByte() != 0;
                            var18_197 = var1_1.java_io_DataInputStream_II().readByte();
                            var19_198 = -1;
                            try {
                                var19_198 = var1_1.java_io_DataInputStream_II().readByte();
                            }
                            catch (Exception var116_199) {
                                // empty catch block
                            }
                            I_Ol.II__(I1I1.Il("\ub7d3\ub822\ub878\ub801\ub820\ub8c4\ub8eb\ub899\ub8ab\ub94b\ub977\ub91d\ub927\ub9cf\ub9dc\ub9eb\ub98e\ub9dc\uba3b\uba49\uba32\uba11\ubafb\ubada\ubaf5\uba84\ubb7f\ubb53\ubb28\ubb15\ubbfd\ubbea\ubba4\ubb9e\ubc36\ubc0a", 47085) + var41_195);
                            var115_201 = Ilol.Ilol_II().IOI_ == var4_129 ? Ilol.Ilol_II() : I1_I.Ilol_II(var4_129);
                            var115_201.II(var13_194, var71_196, (byte)var113_186, (byte)var18_197, (byte)var41_195, var114_189, (byte)var19_198);
                        }
                        if (var12_168 == 21) {
                            var116_200 = new I___();
                            new I___().I_O0 = var1_1.java_io_DataInputStream_II().readShort();
                            var116_200.I_Oo = var1_1.java_io_DataInputStream_II().readShort();
                            var117_203 = var1_1.java_io_DataInputStream_II().readShort();
                            var114_189 = var1_1.java_io_DataInputStream_II().readShort();
                            var42_211 = 0;
                            var18_197 = -1;
                            var118_212 = null;
                            var115_201 = Ilol.Ilol_II().IOI_ == var4_129 ? Ilol.Ilol_II() : I1_I.Ilol_II(var4_129);
                            try {
                                var42_211 = var1_1.java_io_DataInputStream_II().readByte();
                                var118_212 = new I___[var1_1.java_io_DataInputStream_II().readByte()];
                                for (var43_219 = 0; var43_219 < var118_212.length; ++var43_219) {
                                    var118_212[var43_219] = new I___();
                                    var118_212[var43_219].var_byte_IIO1 = var1_1.java_io_DataInputStream_II().readByte();
                                    var118_212[var43_219].IIO0 = var118_212[var43_219].var_byte_IIO1 == 0 ? (int)var1_1.java_io_DataInputStream_II().readByte() : var1_1.java_io_DataInputStream_II().readInt();
                                }
                            }
                            catch (Exception var119_220) {
                                // empty catch block
                            }
                            try {
                                var18_197 = var1_1.java_io_DataInputStream_II().readByte();
                            }
                            catch (Exception var119_221) {
                                // empty catch block
                            }
                            I_Ol.II__(I1I1.Il("\ub7d3\ub822\ub878\ub801\ub820\ub8c4\ub8eb\ub899\ub8ab\ub94b\ub977\ub91d\ub927\ub9cf\ub9dc\ub9eb\ub98e\ub9dc\uba3b\uba49\uba32\uba11\ubafb\ubada\ubaf5\uba80\ubb72\ubb40\ubb36\ubb15\ubbfb\ubbea\ubbac\ubb81\ubc6e\ubc17\ubc69", 47085) + var116_200.I_O0 + I1I1.Il("\ub7d7", 47085) + var116_200.I_Oo + I1I1.Il("\ub7cd\ub82c\ub80b\ub86a\ub80a\ub8b2", 47085) + var115_201.I_o_ + I1I1.Il("\ub7d7", 47085) + var115_201.I_oO + I1I1.Il("\ub7cd\ub82c\ub80b\ub829\ub80d\ub8e1\ub8d5\ub8fc", 47085) + var115_201.IOI1);
                            var115_201.II(1, var13_194, (I___)var116_200, var117_203, var114_189, (byte)var42_211, var118_212, (byte)var18_197);
                        }
                        if (var12_168 != 0) ** GOTO lbl1225
                        I_Ol.II__(I1I1.Il("\ub784\ub868\ub80b\ub83f\ub81a\ub8ed\ub89a\ub8e6", 47085) + var4_129);
                        if (Ilol.Ilol_II().IOI_ == var4_129) ** GOTO lbl1183
                        var116_200 = I1_I.Ilol_II(var4_129);
                        if ((IOlO.IIl(var116_200.I_o_, var116_200.I_oO) & 2) == 2) {
                            var116_200.II(I1_I.var_I_ol_arr_II[var13_194], 0);
                        } else {
                            var116_200.II(I1_I.var_I_ol_arr_II[var13_194], 1);
                            var116_200.IOo = 20;
                        }
                        ** GOTO lbl1186
lbl1183:
                        // 1 sources

                        Ilol.Ilol_II();
                        I_Ol.II__(I1I1.Il("\ub7a1\ub843\ub86a\ub80e\ub849\ub8c4\ub8e6\ub895\ub8b1\ub924\ub970\ub909\ub928\ub9cc\ub9d3", 47085));
lbl1186:
                        // 3 sources

                        var113_186 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub783\ub87c\ub848\ub86a\ub81a\ub8e1\ub8dd\ub8a3\ub8d8\ub924", 47085) + var113_186);
                        for (var15_225 = 0; var15_225 < var113_186; ++var15_225) {
                            var117_203 = var1_1.java_io_DataInputStream_II().readByte();
                            var42_211 = var1_1.java_io_DataInputStream_II().readByte();
                            I_Ol.II__(I1I1.Il("\ub784\ub862\ub84f\ub82f\ub811\ub8b5\ub887", 47085) + var117_203);
                            if (var13_194 < 42 || var13_194 > 48) continue;
                            ((I_I_)I1_I.var_I_lO_IIO.elementAt((int)var117_203)).III_ = true;
                            ((I_I_)I1_I.var_I_lO_IIO.elementAt((int)var117_203)).IIlI = var42_211;
                            var118_212 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var117_203);
                            I1_I.var_I_lO_IIO.elementAt(var117_203);
                            var118_212.IloO = System.currentTimeMillis();
                        }
                        var41_195 = var1_1.java_io_DataInputStream_II().readByte();
                        for (var16_226 = 0; var16_226 < var41_195; ++var16_226) {
                            var17_228 = var1_1.java_io_DataInputStream_II().readInt();
                            var18_197 = var1_1.java_io_DataInputStream_II().readByte();
                            I_Ol.II__(I1I1.Il("\ub79d\ub860\ub84a\ub833\ub80c\ub8fa\ub887\ub88f\ub8a1\ub939\ub903", 47085) + var17_228 + I1I1.Il("\ub7cd\ub861\ub852\ub86a\ub820\ub8cc\ub89a\ub8e6", 47085) + Ilol.Ilol_II().IOI_);
                            if (var13_194 < 42 || var13_194 > 48) continue;
                            if (var17_228 == Ilol.Ilol_II().IOI_) {
                                if (Ilol.Ilol_II().I1ol || Ilol.Ilol_II().I1o1) continue;
                                I1_I.I1_I_II().IO1 = true;
                                Ilol.Ilol_II().I1_O = true;
                                Ilol.Ilol_II().IOO = var18_197;
                                var9_227 = Ilol.Ilol_II();
                                Ilol.Ilol_II();
                                var9_227.Il10 = System.currentTimeMillis();
                                Ilol.Ilol_II().I10l = true;
                                continue;
                            }
                            var116_200 = I1_I.Ilol_II(var17_228);
                            if (var116_200 == null || var116_200.I1ol || var116_200.I1o1) continue;
                            var116_200.I1_O = true;
                            var116_200.IOO = var18_197;
                            I1_I.Ilol_II(var17_228);
                            var116_200.Il10 = System.currentTimeMillis();
                        }
lbl1225:
                        // 2 sources

                        if (var12_168 == 1 && var4_129 != Ilol.Ilol_II().IOI_) {
                            I1_I.Ilol_II((int)var4_129).I1_0 = true;
                        }
                        if (var12_168 == 3) {
                            if (var4_129 == Ilol.Ilol_II().IOI_) {
                                Ilol.Ilol_II().I1_0 = false;
                                IO.II();
                                Ilol.Ilol_II();
                            } else {
                                I1_I.Ilol_II((int)var4_129).I1_0 = false;
                            }
                        }
                        if (var12_168 == 4) {
                            if (var4_129 == Ilol.Ilol_II().IOI_) {
                                Ilol.Ilol_II().IO_o = var1_1.java_io_DataInputStream_II().readShort() - 1000;
                                Ilol.Ilol_II().Il1_ = System.currentTimeMillis();
                                I_Ol.II__(I1I1.Il("\ub79e\ub869\ub848\ub825\ub807\ub8ec\ub89a\ub8e6", 47085) + Ilol.Ilol_II().IO_o + I1I1.Il("\ub7cd\ub860\ub84a\ub839\ub81d\ub8b5\ub887", 47085) + Ilol.Ilol_II().Il1_);
                            } else if (I1_I.Ilol_II(var4_129) != null) {
                                var14_229 = I1_I.Ilol_II((int)var4_129).IOIO;
                                if (var14_229 == 0) {
                                    I1_I.Ilol_II(var4_129).III_(false);
                                } else if (var14_229 == 1) {
                                    I1_I.Ilol_II(var4_129).III_(true);
                                }
                                I1_I.Ilol_II((int)var4_129).IO_1 = var13_194;
                                I1_I.Ilol_II((int)var4_129).I1oI = true;
                                I1_I.Ilol_II((int)var4_129).IO_o = var1_1.java_io_DataInputStream_II().readShort();
                                I1_I.Ilol_II((int)var4_129).Il1_ = System.currentTimeMillis();
                            }
                        }
                        if (var12_168 == 5) {
                            if (var4_129 == Ilol.Ilol_II().IOI_) {
                                Ilol.Ilol_II().IO1_();
                            } else if (I1_I.Ilol_II(var4_129) != null) {
                                I1_I.Ilol_II(var4_129).IO1_();
                            }
                        }
                        if (var12_168 == 6) {
                            if (var4_129 == Ilol.Ilol_II().IOI_) {
                                Ilol.Ilol_II().III(I1_I.var_I_ol_arr_II[var13_194], 0);
                            } else if (I1_I.Ilol_II(var4_129) != null) {
                                I1_I.Ilol_II(var4_129).III(I1_I.var_I_ol_arr_II[var13_194], 0);
                                IO.II();
                            }
                        }
                        if (var12_168 == 7) {
                            if (var4_129 == Ilol.Ilol_II().IOI_) {
                                Ilol.Ilol_II().IO_o = var1_1.java_io_DataInputStream_II().readShort();
                                I_Ol.II__(I1I1.Il("\ub79e\ub869\ub848\ub825\ub807\ub8ec\ub887\ub8fb\ub8c5", 47085) + Ilol.Ilol_II().IO_o);
                                Ilol.Ilol_II().Il1_ = System.currentTimeMillis();
                            } else if (I1_I.Ilol_II(var4_129) != null) {
                                I1_I.Ilol_II(var4_129).III_(true);
                                I1_I.Ilol_II((int)var4_129).IO_o = var1_1.java_io_DataInputStream_II().readShort();
                                I1_I.Ilol_II((int)var4_129).Il1_ = System.currentTimeMillis();
                                IO.II();
                            }
                        }
                        if (var12_168 != 8 || var4_129 == Ilol.Ilol_II().IOI_ || I1_I.Ilol_II(var4_129) == null) break;
                        I1_I.Ilol_II(var4_129).III(I1_I.var_I_ol_arr_II[var13_194], 0);
                        break;
                    }
                    case -44: {
                        var71_196 = false;
                        if (II.var_int_IIl > 2 * I_1o.llOI) {
                            var71_196 = true;
                        }
                        var41_195 = var1_1.java_io_DataInputStream_II().readByte();
                        var16_226 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        Ilol.Ilol_II().var_I101_arr_arr_II = new I101[var16_226][];
                        II.var_I_1o_II.var_java_lang_String_arr_arr_III1 = new String[var16_226 + (var71_196 == false ? 1 : 0)][2];
                        if (var41_195 == 2) {
                            II.var_I_1o_II.I11o = new int[var16_226];
                            II.var_I_1o_II.I1_ = new int[var16_226];
                        }
                        if (!var71_196) {
                            II.var_I_1o_II.var_java_lang_String_arr_arr_III1[var16_226] = IO11.II0o;
                        }
                        for (var17_228 = 0; var17_228 < var16_226; ++var17_228) {
                            var116_200 = I_Ol.II(var1_1.java_io_DataInputStream_II().readUTF(), I1I1.Il("\ub7e7", 47085), 0);
                            if (var41_195 == 2) {
                                II.var_I_1o_II.I11o[var17_228] = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            }
                            if (((String[])var116_200).length == 2) {
                                II.var_I_1o_II.var_java_lang_String_arr_arr_III1[var17_228] = var116_200;
                            }
                            if (((String[])var116_200).length == 1) {
                                II.var_I_1o_II.var_java_lang_String_arr_arr_III1[var17_228][0] = var116_200[0];
                                II.var_I_1o_II.var_java_lang_String_arr_arr_III1[var17_228][1] = "";
                            }
                            var72_230 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            Ilol.Ilol_II().var_I101_arr_arr_II[var17_228] = new I101[var72_230];
                            for (var73_231 = 0; var73_231 < var72_230; ++var73_231) {
                                var117_204 = var1_1.java_io_DataInputStream_II().readShort();
                                if (var117_204 == -1) continue;
                                Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231] = new I101();
                                Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_I1o_II = I1oI.II(var117_204);
                                I_1o.Il1I = IO11.I0OI;
                                if (var41_195 == 8) {
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].II0 = var1_1.java_io_DataInputStream_II().readInt();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_int_III = var1_1.java_io_DataInputStream_II().readInt();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].I1l1 = var1_1.java_io_DataInputStream_II().readInt();
                                } else if (var41_195 == 4) {
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].IlIO = var1_1.java_io_DataInputStream_II().readUTF();
                                } else if (var41_195 == 0) {
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].II0 = var1_1.java_io_DataInputStream_II().readInt();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_int_III = var1_1.java_io_DataInputStream_II().readInt();
                                } else if (var41_195 == 1) {
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].Iloo = var1_1.java_io_DataInputStream_II().readLong();
                                    I_1o.Il1I = IO11.I0Ol;
                                } else if (var41_195 == 2) {
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].lIO1 = var1_1.java_io_DataInputStream_II().readShort();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].II0 = var1_1.java_io_DataInputStream_II().readInt();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_int_III = var1_1.java_io_DataInputStream_II().readInt();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].IIO0 = var1_1.java_io_DataInputStream_II().readByte();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].I1l1 = var1_1.java_io_DataInputStream_II().readInt();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_byte_IIOo = var1_1.java_io_DataInputStream_II().readByte();
                                } else if (var41_195 == 3) {
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].IIll = true;
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].II_1 = var1_1.java_io_DataInputStream_II().readShort();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].III1 = var1_1.java_io_DataInputStream_II().readInt();
                                }
                                var43_219 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                if (var43_219 != 0) {
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_I100_arr_III = new I100[var43_219];
                                    for (var118_213 = 0; var118_213 < Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_I100_arr_III.length; ++var118_213) {
                                        var23_144 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var119_223 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                        if (var23_144 == -1) continue;
                                        Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].var_I100_arr_III[var118_213] = new I100(var23_144, var119_223);
                                        Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].lIOo = II.var_I_1o_II.III(Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231]);
                                    }
                                }
                                var22_233 = var1_1.java_io_DataInputStream_II().readByte();
                                v3 = Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].IO0l = var22_233 != 0;
                                if (var1_1.java_io_DataInputStream_II().readByte() == 1) {
                                    var118_213 = var1_1.java_io_DataInputStream_II().readShort();
                                    var24_150 = var1_1.java_io_DataInputStream_II().readShort();
                                    var119_223 = var1_1.java_io_DataInputStream_II().readShort();
                                    var74_232 = var1_1.java_io_DataInputStream_II().readShort();
                                    Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].II(var118_213, var24_150, var119_223, var74_232);
                                }
                                if (var41_195 != 2) continue;
                                Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].IlI0 = var1_1.java_io_DataInputStream_II().readUTF();
                                I_Ol.II_l(I1I1.Il("\ub783\ub86b\ub85e\ub825\ub800\ub8a8\ub8cc\ub8af\ub8c5\ub963\ub956\ub92b\ub941\ub9a0", 47085) + Ilol.Ilol_II().var_I101_arr_arr_II[var17_228][var73_231].IlI0);
                            }
                        }
                        if (var71_196) {
                            if (var41_195 != 2) {
                                II.var_I_1o_III = new I_1o();
                                II.var_I_1o_III.var_java_lang_String_arr_arr_arr_II[7] = new String[][]{{""}};
                                II.var_I_1o_III.I0o();
                                II.var_I_1o_III.I__0();
                            } else {
                                II.var_I_1o_III = new I_1o();
                                II.var_I_1o_III.IIII();
                                II.var_I_1o_III.I__0();
                            }
                        }
                        II.var_I_1o_II.var_java_lang_String_arr_arr_arr_II[1] = II.var_I_1o_II.var_java_lang_String_arr_arr_III1;
                        if (var41_195 == 2) {
                            var116_200 = II.var_I_1o_II.var_java_lang_String_arr_arr_arr_II[1];
                            II.var_I_1o_II.var_java_lang_String_arr_arr_arr_II[1] = var71_196 != false ? new String[][]{var116_200[0], var116_200[1], var116_200[2], var116_200[3]} : new String[][]{var116_200[0], var116_200[1], var116_200[2], var116_200[3], var116_200[4]};
                        }
                        II.var_I_1o_II.IIO(var41_195);
                        II.var_I_1o_II.I__0();
                        break;
                    }
                    case -43: {
                        var35_171 = var1_1.java_io_DataInputStream_II().readByte();
                        var7_193 = var1_1.java_io_DataInputStream_II().readByte();
                        var12_168 = var1_1.java_io_DataInputStream_II().readByte();
                        var116_200 = var1_1.java_io_DataInputStream_II().readUTF();
                        II.var_I_1o_II.II((byte)var35_171, (String)var116_200, var7_193, (byte)var12_168);
                        break;
                    }
                    case -42: {
                        Ilol.Ilol_II().I0_O = var1_1.II_I();
                        Ilol.Ilol_II().I0_0 = var1_1.II_I();
                        Ilol.Ilol_II().I0__ = var1_1.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II().IOlo = var1_1.II_I();
                        Ilol.Ilol_II().IO1 = var1_1.II_I();
                        Ilol.Ilol_II().IOl_ = var1_1.II_I();
                        Ilol.Ilol_II().IOl1 = var1_1.II_I();
                        Ilol.Ilol_II().IOIo = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_byte_IIll = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_byte_IIl1 = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_byte_IIl_ = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().IOl = var1_1.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II().IOlI = var1_1.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II().IOll = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().Il1I = var1_1.java_io_DataInputStream_II().readLong();
                        Ilol.Ilol_II().var_short_IIl_ = var1_1.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_II().I0_o = var1_1.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_II().I0O = var1_1.java_io_DataInputStream_II().readByte();
                        I1OO.I__o();
                        break;
                    }
                    case -41: {
                        var42_211 = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_java_lang_String_arr_III_ = new String[var42_211];
                        for (var72_230 = 0; var72_230 < var42_211; ++var72_230) {
                            Ilol.Ilol_II().var_java_lang_String_arr_III_[var72_230] = var117_205 = var1_1.java_io_DataInputStream_II().readUTF();
                        }
                        break;
                    }
                    case -37: {
                        var2_123 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub78e\ub84d\ub848\ub83e\ub800\ub8e7\ub8c9\ub8fb\ub8c5", 47085) + var2_123);
                        if (var2_123 == 0) {
                            Ilol.Ilol_II().I0 = var1_1.java_io_DataInputStream_II().readShort();
                            Ilol.Ilol_II().IO01();
                            var3_125 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            I_Ol.II__(I1I1.Il("\ub783\ub879\ub846\ub86a\ub80b\ub8e7\ub8c3\ub8bf\ub8c5\ub939\ub903", 47085) + var3_125);
                            Ilol.Ilol_II().var_I101_arr_IIII = new I101[var3_125];
                            for (var36_167 = 0; var36_167 < var3_125; ++var36_167) {
                                var117_206 = var1_1.java_io_DataInputStream_II().readShort();
                                if (var117_206 == -1) continue;
                                Ilol.Ilol_II().var_I101_arr_IIII[var36_167] = new I101();
                                Ilol.Ilol_II().var_I101_arr_IIII[var36_167].var_I1o_II = I1oI.II(var117_206);
                                var118_214 = Ilol.Ilol_II().var_I101_arr_IIII[var36_167].var_I1o_II.II0l;
                                Ilol.Ilol_II().var_I101_arr_IIII[var36_167].I1l1 = var1_1.java_io_DataInputStream_II().readInt();
                                Ilol.Ilol_II();
                                var1_1.java_io_DataInputStream_II().readUTF();
                                Ilol.Ilol_II();
                                var1_1.java_io_DataInputStream_II().readUTF();
                                var38_234 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                if (var38_234 != 0) {
                                    Ilol.Ilol_II().var_I101_arr_IIII[var36_167].var_I100_arr_III = new I100[var38_234];
                                    for (var14_229 = 0; var14_229 < Ilol.Ilol_II().var_I101_arr_IIII[var36_167].var_I100_arr_III.length; ++var14_229) {
                                        var15_225 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var16_226 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                        if (var15_225 == -1) continue;
                                        Ilol.Ilol_II().var_I101_arr_IIII[var36_167].var_I100_arr_III[var14_229] = new I100(var15_225, var16_226);
                                    }
                                }
                                if (var118_214 == 0) {
                                    Ilol.Ilol_II().I0II = Ilol.Ilol_II().var_I101_arr_IIII[var36_167].var_I1o_II.II_0;
                                    continue;
                                }
                                if (var118_214 != 1) continue;
                                Ilol.Ilol_II().I0I = Ilol.Ilol_II().var_I101_arr_IIII[var36_167].var_I1o_II.II_0;
                            }
                        }
                        I_Ol.II__(I1I1.Il("\ub785\ub869\ub84a\ub82e\ub854\ub8a8", 47085) + Ilol.Ilol_II().I0 + I1I1.Il("\ub7cd\ub86e\ub844\ub82e\ub810\ub8b5\ub887", 47085) + Ilol.Ilol_II().I0II + I1I1.Il("\ub7cd\ub860\ub84e\ub82d\ub854\ub8a8", 47085) + Ilol.Ilol_II().I0I);
                        break;
                    }
                    case -36: {
                        var35_171 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub78e\ub84d\ub848\ub83e\ub800\ub8e7\ub8c9\ub8fb\ub8c5", 47085) + var35_171);
                        if (var35_171 == 0) {
                            var36_167 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            Ilol.Ilol_II().var_I101_arr_II = new I101[var36_167];
                            I1_I.Io_0 = 0;
                            I_Ol.II__(I1I1.Il("\ub783\ub879\ub846\ub809\ub854", 47085) + var36_167);
                            for (var8_127 = 0; var8_127 < var36_167; ++var8_127) {
                                var117_207 = var1_1.java_io_DataInputStream_II().readShort();
                                if (var117_207 == -1) continue;
                                Ilol.Ilol_II().var_I101_arr_II[var8_127] = new I101();
                                Ilol.Ilol_II().var_I101_arr_II[var8_127].var_I1o_II = I1oI.II(var117_207);
                                Ilol.Ilol_II().var_I101_arr_II[var8_127].I1l1 = var1_1.java_io_DataInputStream_II().readInt();
                                Ilol.Ilol_II();
                                var1_1.java_io_DataInputStream_II().readUTF();
                                Ilol.Ilol_II();
                                var1_1.java_io_DataInputStream_II().readUTF();
                                Ilol.Ilol_II().var_I101_arr_II[var8_127].lIO_ = var8_127;
                                var38_234 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                if (var38_234 != 0) {
                                    Ilol.Ilol_II().var_I101_arr_II[var8_127].var_I100_arr_III = new I100[var38_234];
                                    for (var14_229 = 0; var14_229 < Ilol.Ilol_II().var_I101_arr_II[var8_127].var_I100_arr_III.length; ++var14_229) {
                                        var15_225 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var16_226 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                        if (var15_225 == -1) continue;
                                        Ilol.Ilol_II().var_I101_arr_II[var8_127].var_I100_arr_III[var14_229] = new I100(var15_225, var16_226);
                                    }
                                    Ilol.Ilol_II().var_I101_arr_II[var8_127].lIOo = II.var_I_1o_II.III(Ilol.Ilol_II().var_I101_arr_II[var8_127]);
                                }
                                Ilol.Ilol_II();
                                if (Ilol.Ilol_II().var_I101_arr_II[var8_127].var_I1o_II.II0l != 6) continue;
                                I1_I.Io_0 += Ilol.Ilol_II().var_I101_arr_II[var8_127].I1l1;
                            }
                        }
                        if (var35_171 != 2) break;
                        var7_193 = var1_1.java_io_DataInputStream_II().readByte();
                        var8_127 = var1_1.java_io_DataInputStream_II().readInt();
                        var4_129 = Ilol.Ilol_II().var_I101_arr_II[var7_193].I1l1;
                        Ilol.Ilol_II().var_I101_arr_II[var7_193].I1l1 = var8_127;
                        if (Ilol.Ilol_II().var_I101_arr_II[var7_193].I1l1 < var4_129 && Ilol.Ilol_II().var_I101_arr_II[var7_193].var_I1o_II.II0l == 6) {
                            I1_I.Io_0 -= var4_129 - Ilol.Ilol_II().var_I101_arr_II[var7_193].I1l1;
                        }
                        if (Ilol.Ilol_II().var_I101_arr_II[var7_193].I1l1 != 0) break;
                        Ilol.Ilol_II().var_I101_arr_II[var7_193] = null;
                        break;
                    }
                    case -35: {
                        var7_193 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub78e\ub84d\ub848\ub83e\ub800\ub8e7\ub8c9\ub8fb\ub8c5", 47085) + var7_193);
                        if (var7_193 == 0) {
                            var8_127 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            Ilol.Ilol_II().var_I101_arr_III = new I101[var8_127];
                            II.var_I_1o_II.ll_o = 0;
                            for (var4_129 = 0; var4_129 < var8_127; ++var4_129) {
                                var13_194 = var1_1.java_io_DataInputStream_II().readShort();
                                if (var13_194 == -1) continue;
                                Ilol.Ilol_II().var_I101_arr_III[var4_129] = new I101();
                                Ilol.Ilol_II().var_I101_arr_III[var4_129].var_I1o_II = I1oI.II(var13_194);
                                Ilol.Ilol_II().var_I101_arr_III[var4_129].I1l1 = var1_1.java_io_DataInputStream_II().readInt();
                                Ilol.Ilol_II();
                                var1_1.java_io_DataInputStream_II().readUTF();
                                Ilol.Ilol_II();
                                var1_1.java_io_DataInputStream_II().readUTF();
                                var14_229 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                if (var14_229 != 0) {
                                    Ilol.Ilol_II().var_I101_arr_III[var4_129].var_I100_arr_III = new I100[var14_229];
                                    for (var15_225 = 0; var15_225 < Ilol.Ilol_II().var_I101_arr_III[var4_129].var_I100_arr_III.length; ++var15_225) {
                                        var16_226 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var17_228 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                        if (var16_226 == -1) continue;
                                        Ilol.Ilol_II().var_I101_arr_III[var4_129].var_I100_arr_III[var15_225] = new I100(var16_226, var17_228);
                                    }
                                }
                                ++II.var_I_1o_II.ll_o;
                            }
                        }
                        if (var7_193 == 1) {
                            var117_208 = false;
                            try {
                                if (var1_1.java_io_DataInputStream_II().readByte() == 1) {
                                    var117_208 = true;
                                }
                            }
                            catch (Exception var118_215) {
                                // empty catch block
                            }
                            II.var_I_1o_II.I0oO();
                            II.var_I_1o_II.var_boolean_II1I = var117_208;
                            II.var_I_1o_II.I__0();
                        }
                        if (var7_193 != 2) break;
                        var12_168 = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_I101_arr_III[var12_168].I1l1 = var4_129 = var1_1.java_io_DataInputStream_II().readInt();
                        if (Ilol.Ilol_II().var_I101_arr_III[var12_168].I1l1 != 0) break;
                        Ilol.Ilol_II().var_I101_arr_III[var12_168] = null;
                        break;
                    }
                    case -34: {
                        var18_197 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub78c\ub86f\ub85f\ub877\ub849", 47085) + var18_197);
                        if (var18_197 == 0 && I1_I.I1_I_II().var_I1o0_II != null) {
                            I_Ol.II__(I1I1.Il("\ub799\ub863\ub842\ub86a\ub80d\ub8fd\ub8c8\ub8a5\ub8c5\ub960\ub942\ub93b", 47085));
                            var117_209 = I1_I.I1_I_II().var_I1o0_II;
                            I1_I.I1_I_II().var_I1o0_II.II0I = var1_1.java_io_DataInputStream_II().readShort();
                            var117_209.Ill1 = var1_1.java_io_DataInputStream_II().readUTF();
                            var117_209.Ill1 = I_Ol.IIIo(var117_209.Ill1);
                            var1_1.java_io_DataInputStream_II().readShort();
                            var1_1.java_io_DataInputStream_II().readShort();
                            var1_1.java_io_DataInputStream_II().readByte();
                            var117_209.lIoo = var1_1.java_io_DataInputStream_II().readShort();
                            var117_209.ll = var1_1.java_io_DataInputStream_II().readShort();
                            I_Ol.II__(I1I1.Il("\ub78e\ub879\ub859\ub838\ub849\ub8d8\ub8c2\ub8a7\ub896\ub939\ub903", 47085) + var117_209.lIoo);
                            var1_1.java_io_DataInputStream_II().readUTF();
                            var117_209.IIO0 = var1_1.java_io_DataInputStream_II().readInt();
                            var20_235 = var1_1.java_io_DataInputStream_II().readByte();
                            var117_209.II0O = new int[var20_235];
                            var117_209.II00 = new int[var20_235];
                            for (var21_236 = 0; var21_236 < var20_235; ++var21_236) {
                                var117_209.II0O[var21_236] = var1_1.java_io_DataInputStream_II().readByte();
                                var117_209.II00[var21_236] = var1_1.java_io_DataInputStream_II().readByte();
                            }
                            var117_209.IO0 = var1_1.java_io_DataInputStream_II().readBoolean();
                            var117_209.Il1O = var117_209.IlO0 = System.currentTimeMillis();
                            I1_I.I1_I_II().var_I1o0_II.I1_l = true;
                        }
                        if (var18_197 == 1) {
                            var117_209 = new I_lO(I1I1.Il("\ub79b\ub861\ub84e\ub824\ub81c\ub8a8\ub8c4\ub8a9\ub88b\ub970\ub951\ub92d\ub90d\ub9e5\ub9bf\ub98c", 47085));
                            try {
                                while (var1_1.java_io_DataInputStream_II().available() > 0) {
                                    var118_216 = var1_1.java_io_DataInputStream_II().readUTF();
                                    var117_209.addElement(new I1Il(var118_216, II.var_II_II, 888392, null));
                                }
                            }
                            catch (Exception var118_217) {
                                // empty catch block
                            }
                            II.var_I_II_II.II((I_lO)var117_209);
                        }
                        if (var18_197 != 2) break;
                        I1_I.I1_I_II().var_I1o0_II.I_Oo = var1_1.java_io_DataInputStream_II().readShort();
                        I_Ol.II__(I1I1.Il("\ub7ae\ub879\ub859\ub838\ub849\ub8f8\ub8c2\ub8a7\ub8d8\ub924", 47085) + I1_I.I1_I_II().var_I1o0_II.I_Oo);
                        I1_I.I1_I_II().var_I1o0_II.IIO0 = var1_1.java_io_DataInputStream_II().readInt();
                        I1_I.I1_I_II().var_I1o0_II.Il1O = I1_I.I1_I_II().var_I1o0_II.IlO0 = System.currentTimeMillis();
                        I1_I.I1_I_II().var_I1o0_II.I1_l = true;
                        I1_I.I1_I_II().var_I1o0_II.I1lI = true;
                        break;
                    }
                    case -32: {
                        var73_231 = var1_1.java_io_DataInputStream_II().readShort();
                        I_Ol.II__(I1I1.Il("\ub7af\ub84d\ub868\ub801\ub849\ub8cf\ub8f5\ub889\ub8b0\ub94a\ub967\ub962\ub915\ub9e5\ub9f2\ub9ce\ub9b1\ub99d\uba6f\uba5f\uba79\uba11\ubaf3\uba8b\ubaf5", 47085) + var73_231);
                        var117_210 = var1_1.java_io_DataInputStream_II().readInt();
                        var118_218 = null;
                        try {
                            var119_224 = new byte[var117_210];
                            var1_1.java_io_DataInputStream_II().read(var119_224, 0, var117_210);
                            var118_218 = Image.createImage((byte[])var119_224, (int)0, (int)var117_210);
                            Il0o.var_I_l__III.put(String.valueOf(var73_231), var118_218);
                        }
                        catch (Exception var120_237) {
                            var119_224 = null;
                            Il0o.var_I_l__III.put(String.valueOf(var73_231), Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true));
                        }
                        if (var119_224 == null || IO1l.l_I0 <= 1) break;
                        I_O1.II(IO1l.l_I0 + I1I1.Il("\ub78f\ub86b\ub862\ub83e\ub80c\ub8e5", 47085) + var73_231, var119_224);
                        break;
                    }
                    case -31: {
                        IOlO.II1l.removeAllElements();
                        var74_232 = var1_1.java_io_DataInputStream_II().readShort();
                        I_Ol.II__(I1I1.Il("\ub783\ub845\ub85f\ub82f\ub804\ub8b5\ub887", 47085) + var74_232);
                        for (var33_243 = 0; var33_243 < var74_232; ++var33_243) {
                            var120_238 = new Il0o();
                            new Il0o().II0I = var33_243;
                            var120_238.var_short_IIII = var1_1.java_io_DataInputStream_II().readShort();
                            var120_238.var_byte_III = var1_1.java_io_DataInputStream_II().readByte();
                            var120_238.IIOI = var1_1.java_io_DataInputStream_II().readShort();
                            var120_238.IIOl = var1_1.java_io_DataInputStream_II().readShort();
                            var121_244 = var1_1.java_io_DataInputStream_II().readByte();
                            var120_238.II0o = new int[var121_244];
                            var120_238.IIo = new int[var121_244];
                            for (var75_249 = 0; var75_249 < var121_244; ++var75_249) {
                                var120_238.II0o[var33_243] = var1_1.java_io_DataInputStream_II().readByte();
                                var120_238.IIo[var33_243] = var1_1.java_io_DataInputStream_II().readByte();
                            }
                            IOlO.II1l.addElement(var120_238);
                        }
                        break;
                    }
                    case -30: {
                        this.IIIO(var1_1);
                        break;
                    }
                    case -29: {
                        I1I1.III_(var1_1);
                        break;
                    }
                    case -28: {
                        this.III1(var1_1);
                        break;
                    }
                    case -26: {
                        I_0l.III_ = 2;
                        II.II(var1_1.java_io_DataInputStream_II().readUTF());
                        I1OO.I__o();
                        I1o_.IO0_ = false;
                        Ilol.var_boolean_I10I = false;
                        if (II.var_IO1__II != II.var_I1o__II) break;
                        II.var_I_0l_II.I0l_();
                        break;
                    }
                    case -25: {
                        I1_I.var_I1Oo_II.IIII(var1_1.java_io_DataInputStream_II().readUTF(), 0);
                        break;
                    }
                    case -24: {
                        II.var_long_IIIO = II.var_IO1__II instanceof I1_I != false ? IO10.IIII() + 3000L : IO10.IIII() + 30000L;
                        Ilol.var_boolean_I10I = true;
                        I_Ol.II__(I1I1.Il("\ub7aa\ub849\ub87f\ub86a\ub824\ub8c9\ub8f7\ub8e6\ub8ac\ub94a\ub965\ub90d", 47085));
                        I1_I.I1_I_II().var_I1o0_II = null;
                        II.var_boolean_IIII = true;
                        I1_I.I0lo();
                        II.III_();
                        IOlO.IlI_.removeAllElements();
                        I__O.IlI.removeAllElements();
                        System.gc();
                        IOlO.l1oI = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        IOlO.IlIo = var1_1.java_io_DataInputStream_II().readByte();
                        IOlO.l1o = var1_1.java_io_DataInputStream_II().readByte();
                        IOlO.l1o1 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub781\ub863\ub84a\ub82e\ub849\ub8f8\ub8cb\ub8a7\ub88b\ub961\ub957\ub962\ub907\ub9f2\ub9f0\ub9d3\ub9fd\ub98f\uba7e\uba48\uba2f\uba1d\ubae5\uba8c\ubaf5", 47085) + IOlO.IlIo + I1I1.Il("\ub78f\ub86b\ub87f\ub833\ub819\ub8ed\ub89a\ub8e6", 47085) + IOlO.l1o_ + I1I1.Il("\ub7c3\ub822\ub805\ub864\ub847\ub8a6\ub889\ub8e8\ub8cb\ub92a\ub90d\ub96c\ub94f\ub9ae\ub9b1\ub990\ub9f3\ub9d2\uba35\uba14\uba77\uba56\ubab9\uba98\ubafb\ubada\ubb3d\ubb1c\ubb7f", 47085));
                        var1_1.java_io_DataInputStream_II().readByte();
                        IOlO.Il_O = var1_1.java_io_DataInputStream_II().readUTF();
                        IOlO.l1ol = var1_1.java_io_DataInputStream_II().readByte();
                        try {
                            IOlO.IllI(IOlO.l1oI);
                        }
                        catch (Exception var120_239) {
                            I_Ol.II__(I1I1.Il("\ub781\ub863\ub84a\ub82e\ub849\ub8e5\ub8c6\ub8b6\ub8c5\ub962\ub951\ub92d\ub90c\ub9a0\ub9ec\ub9db\ub9af\ub98a\uba7e\uba48\uba63\uba58", 47085) + IOlO.l1oI);
                            I_0_.II().IIo0(IOlO.l1oI);
                            this.var_I_Il_II = var1_1;
                            if (var1_1 == null) return;
                            var1_1.I0Oo();
                            return;
                        }
                        this.IIIl(var1_1);
                        try {
                            IOlO.I00l = var1_1.java_io_DataInputStream_II().readByte() != 0;
                        }
                        catch (Exception var120_240) {
                            // empty catch block
                        }
                        I1_I.Io1 = I1_I.Io10;
                        I1_I.Io1I = I1_I.Io1o;
                        break;
                    }
                    case -22: {
                        Ilol.var_boolean_I10 = true;
                        Ilol.I1Oo = true;
                        I1_I.I1_I_II();
                        I1_I.I1_I_II();
                        Ilol.Ilol_II().var_I_I__IIII = null;
                        Ilol.Ilol_II().var_I_11_II = null;
                        Ilol.Ilol_II().var_Ilol_IIIl = null;
                        Ilol.Ilol_II().var_I10__II = null;
                        Ilol.Ilol_II().var_I_lO_IIl1.removeAllElements();
                        Ilol.Ilol_II().var_int_II__ = -9999;
                        Ilol.Ilol_II().IO_O = -9999;
                        I1_I.I1_I_II().I01o();
                        I1_I.I1_I_II().III0 = null;
                        break;
                    }
                    case -21: {
                        var28_250 = var1_1.java_io_DataInputStream_II().readShort();
                        for (var45_251 = 0; var45_251 < I1_I.var_I_lO_II_0.size(); ++var45_251) {
                            if (((I10_)I1_I.var_I_lO_II_0.elementAt((int)var45_251)).lI0l != var28_250) continue;
                            I1_I.var_I_lO_II_0.removeElementAt(var45_251);
                            break block114;
                        }
                        break;
                    }
                    case -20: {
                        Ilol.Ilol_II().var_I10__II = null;
                        var28_250 = var1_1.java_io_DataInputStream_II().readShort();
                        for (var45_251 = 0; var45_251 < I1_I.var_I_lO_II_0.size(); ++var45_251) {
                            var46_252 = (I10_)I1_I.var_I_lO_II_0.elementAt(var45_251);
                            if (var46_252.lI0l != var28_250) continue;
                            var46_252.III0(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - 10);
                            var120_241 = var1_1.java_io_DataInputStream_II().readUTF();
                            var29_253 = 0;
                            try {
                                var29_253 = var1_1.java_io_DataInputStream_II().readShort();
                                if (var46_252.II.II0l != 9) ** GOTO lbl1745
                                var29_253 = var1_1.java_io_DataInputStream_II().readShort();
                                var9_227 = Ilol.Ilol_II();
                                var9_227.Il11 += (long)var29_253;
                                Ilol.Ilol_II().var_java_lang_String_IIO = IO10.IIIO(Ilol.Ilol_II().Il11);
                                ** GOTO lbl1759
lbl1745:
                                // 1 sources

                                if (var46_252.II.II0l != 10) ** GOTO lbl1751
                                var29_253 = var1_1.java_io_DataInputStream_II().readShort();
                                var9_227 = Ilol.Ilol_II();
                                var9_227.IO_ += var29_253;
                                Ilol.Ilol_II().var_java_lang_String_IIOI = IO10.IIIO(Ilol.Ilol_II().IO_);
                                ** GOTO lbl1759
lbl1751:
                                // 1 sources

                                if (var46_252.II.II0l == 34) {
                                    var29_253 = var1_1.java_io_DataInputStream_II().readShort();
                                    var9_227 = Ilol.Ilol_II();
                                    var9_227.IO_I += var29_253;
                                    Ilol.Ilol_II().var_java_lang_String_IIOl = IO10.IIIO(Ilol.Ilol_II().IO_I);
                                }
                            }
                            catch (Exception var121_245) {
                                // empty catch block
                            }
lbl1759:
                            // 4 sources

                            if (var120_241.equals("")) {
                                if (var46_252.II.II0l == 9) {
                                    I1_I.II((var29_253 < 0 ? "" : I1I1.Il("\ub7c6", 47085)) + var29_253, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11, 0, -2, 1);
                                    IO.II();
                                } else if (var46_252.II.II0l == 10) {
                                    I1_I.II((var29_253 < 0 ? "" : I1I1.Il("\ub7c6", 47085)) + var29_253, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11, 0, -2, 2);
                                    IO.II();
                                } else if (var46_252.II.II0l == 34) {
                                    I1_I.II((var29_253 < 0 ? "" : I1I1.Il("\ub7c6", 47085)) + var29_253, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11, 0, -2, 0);
                                    IO.II();
                                } else {
                                    I1_I.var_I1Oo_II.IIII(IO11.I__l + I1I1.Il("\ub7cd", 47085) + (var29_253 > 0 ? var29_253 + I1I1.Il("\ub7cd", 47085) : "") + var46_252.II.II1o, 0);
                                    IO.II();
                                }
                                if (var29_253 <= 0 || Ilol.Ilol_II().var_I__I_II == null || Ilol.Ilol_II().var_I__I_II.II1o != 4683) break block114;
                                I_0.III(55, Ilol.Ilol_II().var_I__I_II.IIO1, Ilol.Ilol_II().var_I__I_II.IIO, 1);
                                I_0.III(55, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, 1);
                                break block114;
                            }
                            if (var120_241.length() == 1) break block114;
                            I1_I.var_I1Oo_II.IIII(var120_241, 0);
                            break block114;
                        }
                        break;
                    }
                    case -19: {
                        var28_250 = var1_1.java_io_DataInputStream_II().readShort();
                        var25_188 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                        for (var45_251 = 0; var45_251 < I1_I.var_I_lO_II_0.size(); ++var45_251) {
                            var46_252 = (I10_)I1_I.var_I_lO_II_0.elementAt(var45_251);
                            if (var46_252.lI0l != var28_250) continue;
                            if (var25_188 == null) {
                                return;
                            }
                            var46_252.III0(var25_188.I_o_, var25_188.I_oO - 10);
                            if (var46_252.I1 < var25_188.I_o_) {
                                var25_188.IOI1 = -1;
                                break block114;
                            }
                            if (var46_252.I1 <= var25_188.I_o_) break block114;
                            var25_188.IOI1 = 1;
                            break block114;
                        }
                        break;
                    }
                    case -18: {
                        var120_242 = var1_1.java_io_DataInputStream_II().readByte();
                        I1_I.var_I_lO_II_0.addElement(new I10_(var1_1.java_io_DataInputStream_II().readShort(), Ilol.Ilol_II().var_I101_arr_II[var120_242].var_I1o_II.II__, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, (int)var1_1.java_io_DataInputStream_II().readShort(), (int)var1_1.java_io_DataInputStream_II().readShort()));
                        Ilol.Ilol_II().var_I101_arr_II[var120_242] = null;
                        break;
                    }
                    case -14: {
                        var25_188 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                        if (var25_188 == null) {
                            return;
                        }
                        I1_I.var_I_lO_II_0.addElement(new I10_(var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readShort(), var25_188.I_o_, var25_188.I_oO, (int)var1_1.java_io_DataInputStream_II().readShort(), (int)var1_1.java_io_DataInputStream_II().readShort()));
                        break;
                    }
                    case -4: {
                        var25_188 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                        if (var25_188 == null) {
                            return;
                        }
                        if ((IOlO.IIl(var25_188.I_o_, var25_188.I_oO) & 2) == 2) {
                            var25_188.II(I1_I.var_I_ol_arr_II[var1_1.java_io_DataInputStream_II().readUnsignedByte()], 0);
                        } else {
                            var25_188.II(I1_I.var_I_ol_arr_II[var1_1.java_io_DataInputStream_II().readUnsignedByte()], 1);
                        }
                        var25_188.var_I_I__arr_II = new I_I_[var1_1.java_io_DataInputStream_II().readByte()];
                        for (var33_243 = 0; var33_243 < var25_188.var_I_I__arr_II.length; ++var33_243) {
                            var25_188.var_I_I__arr_II[var33_243] = var121_246 /* !! */  = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readByte());
                            if (var33_243 != 0) continue;
                            var25_188.IOI1 = var25_188.I_o_ <= var121_246 /* !! */ .I1 ? 1 : -1;
                        }
                        var25_188.var_Ilol_IIIl = null;
                        var25_188.var_I_I__IIII = var25_188.var_I_I__arr_II[0];
                        var47_179 = new Ilol[10];
                        var34_180 = 0;
                        try {
                            for (var34_180 = 0; var34_180 < var47_179.length; ++var34_180) {
                                var26_254 = var1_1.java_io_DataInputStream_II().readInt();
                                var121_246 /* !! */  = var26_254 == Ilol.Ilol_II().IOI_ ? Ilol.Ilol_II() : I1_I.Ilol_II(var26_254);
                                var47_179[var34_180] = var121_246 /* !! */ ;
                                if (var34_180 != 0) continue;
                                var25_188.IOI1 = var25_188.I_o_ <= var121_246 /* !! */ .I_o_ ? 1 : -1;
                            }
                        }
                        catch (Exception var121_247) {
                            // empty catch block
                        }
                        if (var34_180 <= 0) break;
                        var25_188.var_Ilol_arr_IIIl = new Ilol[var34_180];
                        for (var34_180 = 0; var34_180 < var25_188.var_Ilol_arr_IIIl.length; ++var34_180) {
                            var25_188.var_Ilol_arr_IIIl[var34_180] = var47_179[var34_180];
                        }
                        var25_188.var_Ilol_IIIl = var25_188.var_Ilol_arr_IIIl[0];
                        var25_188.var_I_I__IIII = null;
                        break;
                    }
                    case 0: {
                        I1I1.IIII(var1_1);
                        break;
                    }
                    case 1: {
                        var121_248 = var1_1.java_io_DataInputStream_II().readBoolean();
                        I_Ol.II__(I1I1.Il("\ub784\ub87f\ub879\ub82f\ub81a\ub8b5\ub887", 47085) + var121_248);
                        if (!var121_248) {
                            II.II(var1_1.java_io_DataInputStream_II().readUTF());
                            break;
                        }
                    }
                    I1o_.IOo = false;
                    I_O1.III1(I1I1.Il("\ub798\ub87f\ub84e\ub838\ub828\ub8e7", 47085) + I_0l.l1_I, "");
                    II.III_();
                    II.var_I1o__II.I0OI();
                    break;
                    case 2: {
                        Ilol.var_boolean_I10I = false;
                        if (!I1_I.I1l1) {
                            I1_I.I1_I_II().IIl1();
                        }
                        Il0o.IIl1();
                        II.III_();
                        I1I0.I1l1 = true;
                        I1I0.II().I0l_();
                        break;
                    }
                    case 6: {
                        Ilol.Ilol_II().Il11 = var1_1.java_io_DataInputStream_II().readLong();
                        Ilol.Ilol_II().IO_ = var1_1.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II().IO_I = var1_1.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II().var_java_lang_String_IIO = IO10.IIIO(Ilol.Ilol_II().Il11);
                        Ilol.Ilol_II().var_java_lang_String_IIOI = IO10.IIIO(Ilol.Ilol_II().IO_);
                        Ilol.Ilol_II().var_java_lang_String_IIOl = IO10.IIIO(Ilol.Ilol_II().IO_I);
                        II.III_();
                        break;
                    }
                    case 7: {
                        var75_249 = var1_1.java_io_DataInputStream_II().readByte();
                        var122_255 = var1_1.java_io_DataInputStream_II().readShort();
                        var123_256 = var1_1.java_io_DataInputStream_II().readUTF();
                        II.var_I_1o_II.II((byte)var75_249, var123_256, var122_255);
                        break;
                    }
                    case 11: {
                        var19_198 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub7d0\ub831\ub816\ub877\ub857\ub8a8\ub895\ub8e6\ub8ab\ub941\ub974\ub962\ub925\ub9c1\ub9cb\ub9ff\ub9fd\ub9a8\uba5e\uba77\uba09\uba34\ubad6\ubae2\uba90\ubad4\ubb33\ubb0f\ubb71", 47085) + var19_198);
                        var20_235 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var20_235 != 0) {
                            I_I_.var_I_Io_arr_II[var19_198].II.II(I_1l.II(var1_1), (byte)var20_235);
                        } else {
                            I_I_.var_I_Io_arr_II[var19_198].II.II(I_1l.II(var1_1));
                        }
                        for (var21_236 = 0; var21_236 < I1_I.var_I_lO_IIO.size(); ++var21_236) {
                            var124_257 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var21_236);
                            if (var124_257.I1ll != var19_198) continue;
                            var124_257.Iol = I_I_.var_I_Io_arr_II[var19_198].II.IIOI;
                            var124_257.IIl = I_I_.var_I_Io_arr_II[var19_198].II.IIOl;
                        }
                        for (var21_236 = 0; var21_236 < I1_I.var_I_lO_II_O.size(); ++var21_236) {
                            var124_257 = (Ilol)I1_I.var_I_lO_II_O.elementAt(var21_236);
                            if (var124_257 == null || var124_257.var_I_I__IIIl == null || var124_257.var_I_I__IIIl.I1ll != var19_198) continue;
                            var124_257.var_I_I__IIIl.Iol = I_I_.var_I_Io_arr_II[var19_198].II.IIOI;
                            var124_257.var_I_I__IIIl.IIl = I_I_.var_I_Io_arr_II[var19_198].II.IIOl;
                        }
                        if (Ilol.Ilol_II().var_I_I__IIIl != null && Ilol.Ilol_II().var_I_I__IIIl.I1ll == var19_198) {
                            var124_257 = I_I_.var_I_Io_arr_II[var19_198];
                            Ilol.Ilol_II().var_I_I__IIIl.Iol = var124_257.II.IIOI;
                            var124_257 = I_I_.var_I_Io_arr_II[var19_198];
                            Ilol.Ilol_II().var_I_I__IIIl.IIl = var124_257.II.IIOl;
                        }
                        var124_257 = I_1l.II(var1_1);
                        I_Ol.II__(I1I1.Il("\ub780\ub863\ub849\ub86a\ub800\ub8e5\ub8c6\ub8a1\ub880\ub924\ub94f\ub927\ub90f\ub9f4\ub9a2\ub99e", 47085) + ((Object)var124_257).length);
                        I_I_.var_I_Io_arr_II[var19_198].II.II01 = var125_258 = Image.createImage((byte[])var124_257, (int)0, (int)((Object)var124_257).length);
                        var22_233 = var1_1.java_io_DataInputStream_II().readByte();
                        I_I_.var_I_Io_arr_II[var19_198].II.IIO = var22_233;
                        if (var22_233 != 1 && var22_233 != 2) break;
                        I1I1.III(var1_1, var19_198);
                        break;
                    }
                    case 20: {
                        this.IIIo(var1_1);
                        break;
                    }
                    case 24: {
                        I1I1.IIl(var1_1);
                        break;
                    }
                    case 27: {
                        var27_259 = new I_lO(I1I1.Il("\ub780\ub869\ub845\ub83f\ub849\ub8e7\ub8d7\ub8a3\ub88b\ub924\ub956\ub92b", 47085));
                        var1_1.java_io_DataInputStream_II().readUTF();
                        var2_123 = var1_1.java_io_DataInputStream_II().readByte();
                        for (var44_260 = 0; var44_260 < var2_123; ++var44_260) {
                            var85_261 = var1_1.java_io_DataInputStream_II().readUTF();
                            var126_262 = new Short(var1_1.java_io_DataInputStream_II().readShort());
                            var27_259.addElement(new I1Il(var85_261, II.var_II_II, 88819, var126_262));
                        }
                        II.var_I_II_II.II(var27_259, 3);
                        break;
                    }
                    case 29: {
                        I1_I.I1_I_II().IIl_(var1_1);
                        III_.III().II_O = false;
                        II10.III().II_O = false;
                        break;
                    }
                    case 32: {
                        var30_264 = var1_1.java_io_DataInputStream_II().readShort();
                        I_Ol.II__(I1I1.Il("\ub783\ub87c\ub848\ub86a\ub81d\ub8ed\ub8ca\ub8b6\ub889\ub965\ub957\ub927\ub941\ub9e9\ub9fb\ub983\ub9fd", 47085) + var30_264);
                        for (var126_263 = 0; var126_263 < I1_I.var_I_lO_IIOI.size(); ++var126_263) {
                            var127_265 = (I_11)I1_I.var_I_lO_IIOI.elementAt(var126_263);
                            if (var127_265.var_I_1__II.lll0 != var30_264 || !var127_265.equals(Ilol.Ilol_II().var_I_11_II)) continue;
                            var86_270 = var1_1.java_io_DataInputStream_II().readUTF();
                            var87_272 = new String[var1_1.java_io_DataInputStream_II().readByte()];
                            var77_274 = 0;
                            while (true) {
                                if (var77_274 >= var87_272.length) {
                                    I1_I.I1_I_II();
                                    I1_I.II(var87_272, var127_265);
                                    Ilo1.Ilo1_II(var86_270, 100000, var127_265);
                                    return;
                                }
                                var87_272[var77_274] = var1_1.java_io_DataInputStream_II().readUTF();
                                ++var77_274;
                            }
                        }
                        var32_276 = new I_11(var30_264, 0, -100, 100, var30_264, I1_I.var_I1Oo_II.III1[Ilol.Ilol_II().IOIO][2]);
                        I_Ol.II__(Ilol.Ilol_II().var_I_11_II != null ? I1I1.Il("\ub7cc\ub862\ub85e\ub826\ub805", 47085) : I1I1.Il("\ub783\ub879\ub847\ub826", 47085));
                        var85_261 = var1_1.java_io_DataInputStream_II().readUTF();
                        var126_262 = new String[var1_1.java_io_DataInputStream_II().readByte()];
                        for (var76_277 = 0; var76_277 < var126_262.length; ++var76_277) {
                            var126_262[var76_277] = var1_1.java_io_DataInputStream_II().readUTF();
                        }
                        try {
                            var127_266 = var1_1.java_io_DataInputStream_II().readShort();
                            var32_276.IO_l = var127_266;
                        }
                        catch (Exception var127_267) {
                            // empty catch block
                        }
                        I_Ol.II__(Ilol.Ilol_II().var_I_11_II != null ? I1I1.Il("\ub7cc\ub862\ub85e\ub826\ub805", 47085) : I1I1.Il("\ub783\ub879\ub847\ub826", 47085));
                        I1_I.I1_I_II();
                        I1_I.II(var126_262, var32_276);
                        Ilo1.Ilo1_II(var85_261, 100000, var32_276);
                        break;
                    }
                    case 33: {
                        I1OO.I__o();
                        II.III1();
                        II.IIIl();
                        var27_259 = new I_lO(I1I1.Il("\ub79b\ub878\ub80b\ub827\ub80c\ub8e6\ub8d2", 47085));
                        try {
                            while (true) {
                                var86_271 = var1_1.java_io_DataInputStream_II().readUTF();
                                var27_259.addElement(new I1Il(var86_271, II.var_II_II, 88822, null));
                            }
                        }
                        catch (Exception var127_268) {
                            if (Ilol.Ilol_II().var_I_11_II == null) {
                                if (var1_1 == null) return;
                                var1_1.I0Oo();
                                return;
                            }
                            for (var44_260 = 0; var44_260 < Ilol.Ilol_II().var_I_11_II.var_I_1__II.III.length; ++var44_260) {
                                var87_273 = Ilol.Ilol_II().var_I_11_II.var_I_1__II.III[var44_260];
                                var27_259.addElement(new I1Il(var87_273[0], II.var_II_II, 88820, var87_273));
                            }
                            II.var_I_II_II.II(var27_259);
                            break;
                        }
                    }
                    case 38: {
                        break block687;
                    }
                    case 39: {
                        I1_I.I1_I_II().IoOl = 2;
                        I1_I.I1_I_II();
                        break;
                    }
                    case 40: {
                        II.var_int_III0 = 150;
                        var128_279 = var1_1.java_io_DataInputStream_II().readShort();
                        var77_275 = var1_1.java_io_DataInputStream_II().readByte();
                        I_Ol.II__(I1I1.Il("\ub7b9\ub84d\ub878\ub801\ub849\ub8cf\ub8e2\ub892\ub8c5\ub96d\ub94d\ub926\ub904\ub9f8\ub9a2\ub99e", 47085) + var77_275);
                        var129_280 = I_Ol.IIIo(var1_1.java_io_DataInputStream_II().readUTF());
                        var130_281 = I_Ol.IIIo(var1_1.java_io_DataInputStream_II().readUTF());
                        var131_282 = new String[var1_1.java_io_DataInputStream_II().readByte()];
                        var132_283 = new String[var131_282.length];
                        I1_I.IlO_ = new int[var131_282.length];
                        I1_I.IlOO = new int[var131_282.length];
                        var133_284 = new short[var131_282.length];
                        var134_285 = -1;
                        for (var135_286 = 0; var135_286 < var131_282.length; ++var135_286) {
                            var136_287 = I_Ol.IIIo(var1_1.java_io_DataInputStream_II().readUTF());
                            I1_I.IlO_[var135_286] = var1_1.java_io_DataInputStream_II().readByte();
                            I1_I.IlOO[var135_286] = var1_1.java_io_DataInputStream_II().readShort();
                            var137_292 = I_Ol.IIIo(var1_1.java_io_DataInputStream_II().readUTF());
                            var133_284[var135_286] = -1;
                            if (var136_287.equals("")) continue;
                            var131_282[var135_286] = var136_287;
                            var132_283[var135_286] = var137_292;
                        }
                        try {
                            var134_285 = var1_1.java_io_DataInputStream_II().readShort();
                            for (var135_286 = 0; var135_286 < var131_282.length; ++var135_286) {
                                var133_284[var135_286] = var1_1.java_io_DataInputStream_II().readShort();
                            }
                        }
                        catch (Exception var136_288) {
                            // empty catch block
                        }
                        Ilol.Ilol_II().var_IOlI_II = new IOlI(var128_279, var77_275, var129_280, var130_281, var131_282, var133_284, var134_285, var132_283);
                        if (Ilol.Ilol_II().var_I_11_II != null) {
                            I_11.I00O();
                        }
                        Ilol.III1(false);
                        break;
                    }
                    case 41: {
                        II.var_int_III0 = 100;
                        I_Ol.II__(I1I1.Il("\ub7b9\ub84d\ub878\ub801\ub849\ub8c6\ub8e2\ub89e\ub8b1", 47085));
                        ++Ilol.Ilol_II().var_IOlI_II.l10l;
                        Ilol.Ilol_II().var_IOlI_II.II0_ = 0;
                        I_11.I00O();
                        Ilol.III1(true);
                        break;
                    }
                    case 43: {
                        II.var_int_III0 = 50;
                        Ilol.Ilol_II().var_IOlI_II.II0_ = var1_1.java_io_DataInputStream_II().readShort();
                        if (Ilol.Ilol_II().var_I_11_II != null) {
                            I_11.I00O();
                        }
                        try {
                            var28_250 = var1_1.java_io_DataInputStream_II().readShort();
                            var78_295 = var1_1.java_io_DataInputStream_II().readShort();
                            Ilol.Ilol_II().var_short_III_ = var28_250;
                            Ilol.Ilol_II().var_short_IIIO = var78_295;
                            I_Ol.II__(I1I1.Il("\ub7ae\ub841\ub86f\ub86a\ub849\ub8a8\ub8f3\ub887\ub8b6\ub94f\ub97c\ub917\ub931\ub9c4\ub9de\ub9ea\ub998\ub9c6\uba2f\uba09\uba06\uba15\ubaf6\ubac6\uba9c\ubab0\ubb33\ubb0f\ubb71\ubb50\ubbaf\ubb8e\ubbb5\ubb90\ubc72\ubc0a", 47085) + var28_250 + I1I1.Il("\ub791", 47085) + var78_295);
                            for (var79_296 = 0; var79_296 < IOlO.IlI_.size(); ++var79_296) {
                                I_Ol.II__(I1I1.Il("\ub7d0\ub831\ub816\ub874\ub849", 47085) + IOlO.IlI_.elementAt(var79_296));
                            }
                            break;
                        }
                        catch (Exception var136_289) {
                            break;
                        }
                    }
                    case 46: {
                        Ilol.var_boolean_I10 = false;
                        Ilol.Ilol_II().IIIo(var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readShort());
                        break;
                    }
                    case 47: {
                        I1_I.I1_I_II().I01o();
                        break;
                    }
                    case 50: {
                        var78_295 = var1_1.java_io_DataInputStream_II().readByte();
                        I_1o.var_I_lO_Il.removeAllElements();
                        for (var79_296 = 0; var79_296 < var78_295; ++var79_296) {
                            var136_290 = new I1_();
                            new I1_().IIII = var1_1.java_io_DataInputStream_II().readShort();
                            var136_290.IIoo = var1_1.java_io_DataInputStream_II().readUTF();
                            var136_290.Il = var1_1.java_io_DataInputStream_II().readUTF();
                            I_1o.var_I_lO_Il.addElement(var136_290);
                            var136_290.II_ = var137_293 = I_O1.III(String.valueOf(var136_290.IIII)) != -1;
                        }
                        break;
                    }
                    case 54: {
                        var25_188 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                        if (var25_188 == null) {
                            return;
                        }
                        var136_291 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                        if ((IOlO.IIl(var25_188.I_o_, var25_188.I_oO) & 2) == 2) {
                            var25_188.II(I1_I.var_I_ol_arr_II[var136_291], 0);
                        } else {
                            var25_188.II(I1_I.var_I_ol_arr_II[var136_291], 1);
                        }
                        var137_294 = new I_I_[10];
                        var34_180 = 0;
                        try {
                            for (var34_180 = 0; var34_180 < var137_294.length; ++var34_180) {
                                new StringBuffer(I1I1.Il("\ub7be\ub84d\ub81c\ub87c\ub850\ub8b1\ub89e\ub8f7\ub893\ub930\ub90e\ub92c\ub914\ub9ed", 47085)).append(var34_180).toString();
                                var137_294[var34_180] = var138_297 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readByte());
                                if (var34_180 == 0) {
                                    var25_188.IOI1 = var25_188.I_o_ <= var138_297.I1 ? 1 : -1;
                                }
                                new StringBuffer(I1I1.Il("\ub7be\ub84d\ub81c\ub87c\ub850\ub8b1\ub89e\ub8f7\ub893\ub931\ub90e\ub92c\ub914\ub9ed", 47085)).append(var34_180).toString();
                            }
                        }
                        catch (Exception var138_298) {
                            // empty catch block
                        }
                        if (var34_180 <= 0) break;
                        var25_188.var_I_I__arr_II = new I_I_[var34_180];
                        for (var34_180 = 0; var34_180 < var25_188.var_I_I__arr_II.length; ++var34_180) {
                            var25_188.var_I_I__arr_II[var34_180] = var137_294[var34_180];
                        }
                        var25_188.var_Ilol_IIIl = null;
                        var25_188.var_I_I__IIII = var25_188.var_I_I__arr_II[0];
                        break;
                    }
                    case 56: {
                        var26_254 = var1_1.java_io_DataInputStream_II().readInt();
                        if (var26_254 == Ilol.Ilol_II().IOI_) {
                            var138_299 = false;
                            var25_188 = Ilol.Ilol_II();
                            Ilol.Ilol_II().IOl_ = var1_1.II_I();
                            var139_301 = var1_1.II_I();
                            if (var139_301 != 0) {
                                var25_188.IOoo();
                            }
                            try {
                                var138_299 = var1_1.java_io_DataInputStream_II().readBoolean();
                                var140_302 = var1_1.java_io_DataInputStream_II().readByte();
                                if (var140_302 != -1) {
                                    I_Ol.II__(I1I1.Il("\ub785\ub865\ub85f\ub86a\ub80c\ub8ee\ub8c1\ub8fb\ub8c5", 47085) + var140_302);
                                    I1lI.III(new I1ll((int)var140_302, var25_188.I_o_, var25_188.I_oO, 3, 1, -1));
                                }
                            }
                            catch (Exception var141_303) {
                                // empty catch block
                            }
                            if (Ilol.Ilol_II().var_byte_III0 == 4) break;
                            if (var139_301 == 0) {
                                I1_I.II(IO11.IOlI, var25_188.I_o_, var25_188.I_oO - var25_188.IO11, 0, -3, 7);
                                break;
                            }
                            I1_I.II(I1I1.Il("\ub7c0", 47085) + var139_301, var25_188.I_o_, var25_188.I_oO - var25_188.IO11, 0, -3, var138_299 == false ? 0 : 3);
                            break;
                        }
                        var25_188 = I1_I.Ilol_II(var26_254);
                        if (var25_188 == null) {
                            return;
                        }
                        var25_188.IOl_ = var1_1.II_I();
                        var138_300 = false;
                        var139_301 = var1_1.II_I();
                        if (var139_301 != 0) {
                            var25_188.IOoo();
                        }
                        try {
                            var138_300 = var1_1.java_io_DataInputStream_II().readBoolean();
                            var140_302 = var1_1.java_io_DataInputStream_II().readByte();
                            if (var140_302 != -1) {
                                I_Ol.II__(I1I1.Il("\ub785\ub865\ub85f\ub86a\ub80c\ub8ee\ub8c1\ub8fb\ub8c5", 47085) + var140_302);
                                I1lI.III(new I1ll((int)var140_302, var25_188.I_o_, var25_188.I_oO, 3, 1, -1));
                            }
                        }
                        catch (Exception var141_304) {
                            // empty catch block
                        }
                        if (var25_188.var_byte_III0 == 4) break;
                        if (var139_301 == 0) {
                            I1_I.II(IO11.IOlI, var25_188.I_o_, var25_188.I_oO - var25_188.IO11, 0, -3, 4);
                            break;
                        }
                        I1_I.II(I1I1.Il("\ub7c0", 47085) + var139_301, var25_188.I_o_, var25_188.I_oO - var25_188.IO11, 0, -3, var138_300 == false ? 5 : 3);
                        break;
                    }
                    case 57: {
                        var27_259 = new I_lO(I1I1.Il("\ub79b\ub861\ub84e\ub824\ub81c\ub8a8\ub8f2\ub88f", 47085));
                        var27_259.addElement(new I1Il(var1_1.java_io_DataInputStream_II().readUTF(), II.var_II_II, 88817, null));
                        II.var_I_II_II.II(var27_259);
                        break;
                    }
                    case 58: {
                        var26_254 = var1_1.java_io_DataInputStream_II().readInt();
                        var141_305 = var26_254 == Ilol.Ilol_II().IOI_ ? Ilol.Ilol_II() : I1_I.Ilol_II(var26_254);
                        var141_305.var_short_arr_II = new short[3];
                        var141_305.var_short_arr_II[0] = 0;
                        var142_306 = var1_1.java_io_DataInputStream_II().readShort();
                        var143_307 = var1_1.java_io_DataInputStream_II().readShort();
                        var141_305.var_short_arr_II[1] = var142_306;
                        var141_305.var_short_arr_II[2] = var143_307;
                        try {
                            var26_254 = var1_1.java_io_DataInputStream_II().readInt();
                            var144_308 = var26_254 == Ilol.Ilol_II().IOI_ ? Ilol.Ilol_II() : I1_I.Ilol_II(var26_254);
                            var144_308.I_o_ = var142_306;
                            var144_308.I_oO = var143_307;
                        }
                        catch (Exception var144_309) {
                            var144_309.printStackTrace();
                        }
                        break;
                    }
                    case 62: {
                        var25_188 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                        if (var25_188 == null) break;
                        var25_188.IO_O = Ilol.Ilol_II().IOI_;
                        Ilol.Ilol_II().var_I_11_II = null;
                        Ilol.Ilol_II().var_I_I__IIII = null;
                        Ilol.Ilol_II().var_I10__II = null;
                        Ilol.Ilol_II().var_Ilol_IIIl = var25_188;
                        Ilol.I_II = true;
                        I1_I.var_I1Oo_II.IIII(var25_188.IIO1 + IO11.I__, 0);
                        break;
                    }
                    case 63: {
                        Ilol.Ilol_II().IO_O = var1_1.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II().var_I_11_II = null;
                        Ilol.Ilol_II().var_I_I__IIII = null;
                        Ilol.Ilol_II().var_I10__II = null;
                        Ilol.Ilol_II().var_Ilol_IIIl = I1_I.Ilol_II(Ilol.Ilol_II().IO_O);
                        Ilol.I_II = true;
                        break;
                    }
                    case 64: {
                        var25_188 = Ilol.Ilol_II();
                        try {
                            var25_188 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                        }
                        catch (Exception var144_310) {
                            // empty catch block
                        }
                        var25_188.IO_O = -9999;
                        break;
                    }
                    case 65: {
                        var2_123 = var1_1.java_io_DataInputStream_II().readByte();
                        var144_308 = var1_1.java_io_DataInputStream_II().readUTF();
                        var6_311 = var1_1.java_io_DataInputStream_II().readShort();
                        if (!I1ol.II1O(var2_123)) ** GOTO lbl2233
                        if (var6_311 != 0) {
                            I1ol.III(var2_123).II((byte)var2_123, (String)var144_308, var6_311);
                        } else {
                            I1_I.var_I_lO_IIO1.removeElement(I1ol.III(var2_123));
                        }
                        ** GOTO lbl2236
lbl2233:
                        // 1 sources

                        var145_312 = new I1ol();
                        var145_312.II((byte)var2_123, (String)var144_308, var6_311);
                        I1_I.var_I_lO_IIO1.addElement(var145_312);
lbl2236:
                        // 3 sources

                        I_Ol.II__(I1I1.Il("\ub784\ub868\ub866\ub82f\ub81a\ub8fb\ub8c6\ub8a1\ub880\ub950\ub94a\ub92f\ub904\ub9a0\ub9b4\ub99e\ub9b0\ub999\uba68\uba49\uba38\uba1f\ubaf2\ubae5\ubaa1\uba86\ubb33\ubb19\ubb71\ubb04\ubbe6\ubbc3\ubba8\ubba1\ubc6e\ubc59\ubc3a\ubc09\ubce0\ubcc3\ubcff\ubcde\ubd39\ubd02\ubd61", 47085) + var2_123 + I1I1.Il("\ub7b2", 47085) + (String)var144_308 + I1I1.Il("\ub7b2", 47085) + var6_311);
                        break;
                    }
                    case 66: {
                        this.III0(var1_1);
                        break;
                    }
                    case 68: {
                        I_Ol.II__(I1I1.Il("\ub7ac\ub848\ub86f\ub86a\ub820\ub8dc\ub8e2\ub88b\ub8c5\ub950\ub96c\ub962\ub92c\ub9c1\ub9cf\ub99e\ub9f0\ub9d1\uba36\uba17\uba74\uba55\ubaba\uba9b\ubaf8\ubad9\ubb3e\ubb1f\ubb7c\ubb5d\ubba2\ubb83\ubbe0\ubbc1\ubc26\ubc07\ubc64\ubc45\ubcaa\ubc8b\ubce8\ubcc9\ubd2e\ubd0f\ubd6c\ubd4d\ubd52\ubdb3\ubd90\ubdf1\ubdd6\ube37\ube14\ube75", 47085));
                        var28_250 = var1_1.java_io_DataInputStream_II().readShort();
                        var145_313 = var1_1.java_io_DataInputStream_II().readShort();
                        var146_314 = var1_1.java_io_DataInputStream_II().readShort();
                        var29_253 = var1_1.java_io_DataInputStream_II().readShort();
                        var147_315 = var1_1.java_io_DataInputStream_II().readInt();
                        var148_316 = 0;
                        if (var147_315 == -2) {
                            var148_316 = var1_1.java_io_DataInputStream_II().readShort();
                        }
                        var149_317 = new I10_(var147_315, var28_250, var145_313, (int)var146_314, (int)var29_253, var148_316);
                        var150_318 = false;
                        for (var151_319 = 0; var151_319 < I1_I.var_I_lO_II_0.size(); ++var151_319) {
                            if (((I10_)I1_I.var_I_lO_II_0.elementAt((int)var151_319)).lI0l != var149_317.lI0l) continue;
                            var150_318 = true;
                            break;
                        }
                        if (var150_318) break;
                        I1_I.var_I_lO_II_0.addElement(var149_317);
                        break;
                    }
                    case 69: {
                        IO.I_1o = var1_1.java_io_DataInputStream_II().readByte() != 0;
                        break;
                    }
                    case 81: {
                        I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                        var1_1.java_io_DataInputStream_II().readBoolean();
                        break;
                    }
                    case 82: {
                        ((I_I_)I1_I.var_I_lO_IIO.elementAt((int)var1_1.java_io_DataInputStream_II().readUnsignedByte())).IOoo = var1_1.java_io_DataInputStream_II().readBoolean();
                        break;
                    }
                    case 83: {
                        var26_254 = var1_1.java_io_DataInputStream_II().readInt();
                        var25_188 = var26_254 == Ilol.Ilol_II().IOI_ ? Ilol.Ilol_II() : I1_I.Ilol_II(var26_254);
                        if (var25_188 == null) {
                            return;
                        }
                        var151_320 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                        if (var25_188.var_I_I__IIIl == null) break;
                        var25_188.var_I_I__IIIl.IIII(var151_320);
                        break;
                    }
                    case 84: {
                        var26_254 = var1_1.java_io_DataInputStream_II().readInt();
                        if (var26_254 == Ilol.Ilol_II().IOI_) {
                            var25_188 = Ilol.Ilol_II();
                        } else {
                            var25_188 = I1_I.Ilol_II(var26_254);
                            if (var25_188 == null) {
                                return;
                            }
                        }
                        var25_188.IOl_ = var25_188.IOlo;
                        var25_188.IOl1 = var25_188.IO1;
                        var25_188.I_o_ = var1_1.java_io_DataInputStream_II().readShort();
                        var25_188.I_oO = var1_1.java_io_DataInputStream_II().readShort();
                        var25_188.I0();
                        break;
                    }
                    case 85: {
                        I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                        var1_1.java_io_DataInputStream_II().readBoolean();
                        break;
                    }
                    case 86: {
                        var152_321 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                        ((I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte())).I0 = var1_1.java_io_DataInputStream_II().readBoolean();
                        if (var152_321.I0) break;
                        I_0.III(77, var152_321.I1, var152_321.I1I - 9, 1);
                        break;
                    }
                    case 87: {
                        ((I_I_)I1_I.var_I_lO_IIO.elementAt((int)var1_1.java_io_DataInputStream_II().readUnsignedByte())).I0I = var1_1.java_io_DataInputStream_II().readBoolean();
                        break;
                    }
                    case 88: {
                        var153_322 = var1_1.java_io_DataInputStream_II().readUTF();
                        new Short(var1_1.java_io_DataInputStream_II().readShort());
                        break;
                    }
                    case 90: {
                        I1I1.II(var1_1);
                        break;
                    }
                    case 92: {
                        if (II.var_IO1__II == I1_I.var_I1_I_II) {
                            II.III_();
                        }
                        var154_323 = var1_1.java_io_DataInputStream_II().readUTF();
                        var155_324 = I_Ol.IIIo(var1_1.java_io_DataInputStream_II().readUTF());
                        I_Ol.II__(I1I1.Il("\ub78e\ub864\ub84a\ub83e\ub849\ub8fc\ub8c2\ub8be\ub891\ub939\ub903", 47085) + var155_324);
                        var156_325 = "";
                        var157_326 = null;
                        var158_327 = 0;
                        if (!var154_323.equals("")) {
                            var157_326 = new Ilol();
                            new Ilol().IOI_ = var1_1.java_io_DataInputStream_II().readInt();
                            var157_326.I0 = var1_1.java_io_DataInputStream_II().readShort();
                            var157_326.IOoo = var1_1.java_io_DataInputStream_II().readShort();
                            var157_326.I0II = var1_1.java_io_DataInputStream_II().readShort();
                            var157_326.I0Il = var1_1.java_io_DataInputStream_II().readShort();
                            var157_326.I0I = var1_1.java_io_DataInputStream_II().readShort();
                            var158_327 = var1_1.java_io_DataInputStream_II().readByte();
                            var157_326.IIO1 = var154_323;
                        }
                        var156_325 = var156_325 + var155_324;
                        I1OO.I__o();
                        if (var154_323.equals("")) {
                            I1_I.var_I1Oo_II.IIII(var156_325, 0);
                            break;
                        }
                        I1_I.var_I1Oo_III.II(var156_325, var157_326, var158_327 == 0);
                        if (!II.var_I_1o_II.I_10 || II.var_I_1o_II.IoI_ != 8) break;
                        II.var_I_1o_II.Iol();
                        break;
                    }
                    case 94: {
                        I1_I.var_I1Oo_II.IIII(var1_1.java_io_DataInputStream_II().readUTF(), 0);
                        break;
                    }
                    case 112: {
                        var12_168 = var1_1.java_io_DataInputStream_II().readByte();
                        if (var12_168 == 0) {
                            I_1o.IIOO = var1_1.java_io_DataInputStream_II().readShort();
                            I_1o.Ill0 = var1_1.java_io_DataInputStream_II().readUTF();
                            break;
                        }
                        if (var12_168 != 1) break;
                        var2_123 = var1_1.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_java_lang_String_arr_arr_II = new String[var2_123][];
                        Ilol.Ilol_II().var_short_arr_arr_II = new short[var2_123][];
                        II.var_I_1o_II.var_java_lang_String_arr_arr_IIl1 = new String[var2_123][];
                        for (var3_125 = 0; var3_125 < var2_123; ++var3_125) {
                            II.var_I_1o_II.var_java_lang_String_arr_arr_IIl1[var3_125] = new String[2];
                            var11_128 = I_Ol.II(var1_1.java_io_DataInputStream_II().readUTF(), I1I1.Il("\ub7e7", 47085), 0);
                            if (var11_128.length == 2) {
                                II.var_I_1o_II.var_java_lang_String_arr_arr_IIl1[var3_125] = var11_128;
                            }
                            if (var11_128.length == 1) {
                                II.var_I_1o_II.var_java_lang_String_arr_arr_IIl1[var3_125][0] = var11_128[0];
                                II.var_I_1o_II.var_java_lang_String_arr_arr_IIl1[var3_125][1] = "";
                            }
                            var12_168 = var1_1.java_io_DataInputStream_II().readByte();
                            Ilol.Ilol_II().var_java_lang_String_arr_arr_II[var3_125] = new String[var12_168];
                            Ilol.Ilol_II().var_short_arr_arr_II[var3_125] = new short[var12_168];
                            for (var4_129 = 0; var4_129 < var12_168; ++var4_129) {
                                Ilol.Ilol_II().var_short_arr_arr_II[var3_125][var4_129] = var1_1.java_io_DataInputStream_II().readShort();
                                Ilol.Ilol_II().var_java_lang_String_arr_arr_II[var3_125][var4_129] = var1_1.java_io_DataInputStream_II().readUTF();
                            }
                        }
                        II.var_I_1o_II.var_java_lang_String_arr_arr_arr_II[25] = II.var_I_1o_II.var_java_lang_String_arr_arr_IIl1;
                        II.var_I_1o_II.IOoI();
                        II.var_I_1o_II.I__0();
                    }
                }
lbl2379:
                // 183 sources

                while (true) {
                    switch (var1_1.II00) {
                        case -75: {
                            var91_25 = null;
                            try {
                                var91_25 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                            }
                            catch (Exception var96_85) {
                                // empty catch block
                            }
                            if (var91_25 == null) {
                                return;
                            }
                            var91_25.II0o = var1_1.java_io_DataInputStream_II().readByte();
                            if (var91_25.II0o <= 0) {
                                return;
                            }
                            var91_25.I10_ = I_Ol.III_(0, 3);
                            return;
                        }
                        case -73: {
                            var7_193 = var1_1.java_io_DataInputStream_II().readByte();
                            var8_127 = 0;
                            while (var8_127 < I1_I.var_I_lO_IIOI.size()) {
                                var96_84 = (I_11)I1_I.var_I_lO_IIOI.elementAt(var8_127);
                                if (var96_84.var_I_1__II.lll0 == var7_193) {
                                    if (var1_1.java_io_DataInputStream_II().readByte() == 0) {
                                        var96_84.IOIo = true;
                                        return;
                                    }
                                    var96_84.IOIo = false;
                                    return;
                                }
                                ++var8_127;
                            }
                            return;
                        }
                        case -17: {
                            Ilol.Ilol_II().I_I_ = true;
                            Ilol.Ilol_II().var_byte_IIIO = var1_1.java_io_DataInputStream_II().readByte();
                            Ilol.Ilol_II().II(var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readShort());
                            try {
                                Ilol.Ilol_II().Illo = var1_1.java_io_DataInputStream_II().readLong();
                                Ilol.Ilol_II().IO10();
                            }
                            catch (Exception var96_86) {
                                // empty catch block
                            }
                            Ilol.Ilol_II();
                            return;
                        }
                        case -16: {
                            if (Ilol.Ilol_II().var_short_IIlI != 0 || Ilol.Ilol_II().var_short_IIll != 0) {
                                Ilol.Ilol_II().I_o_ = Ilol.Ilol_II().var_short_IIlI;
                                Ilol.Ilol_II().I_oO = Ilol.Ilol_II().var_short_IIll;
                                Ilol.Ilol_II().var_short_IIll = 0;
                                Ilol.Ilol_II().var_short_IIlI = 0;
                            }
                            Ilol.Ilol_II().I0();
                            Ilol.Ilol_II().I10l = false;
                            Ilol.Ilol_II().I_I_ = false;
                            return;
                        }
                        case -13: {
                            var90_15 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            if (var90_15 == 255) {
                                var96_87 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                var97_92 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                var98_102 = var1_1.java_io_DataInputStream_II().readByte();
                                var99_105 = var1_1.java_io_DataInputStream_II().readShort();
                                var100_118 = var1_1.java_io_DataInputStream_II().readShort();
                                var101_130 = var1_1.java_io_DataInputStream_II().readInt();
                                var102_138 = var1_1.java_io_DataInputStream_II().readInt();
                                var103_146 = new I_I_(var96_87, false, false, false, false, false, var97_92, var98_102, var101_130, 1, var102_138, var99_105, (short)var100_118, 5, 0);
                                var103_146.I010 = var103_146.I1;
                                var103_146.I01o = var103_146.I1I;
                                var103_146.I0I1 = false;
                                I1_I.var_I_lO_IIO.addElement(var103_146);
                                I_0.III(60, var103_146.I1, var103_146.I1I, 1);
                                return;
                            }
                            if (var90_15 > I1_I.var_I_lO_IIO.size() - 1) return;
                            if (var90_15 < 0) return;
                            var91_26 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var90_15);
                            ((I_I_)I1_I.var_I_lO_IIO.elementAt(var90_15)).lIOO = var1_1.java_io_DataInputStream_II().readByte();
                            var91_26.II0o = var1_1.java_io_DataInputStream_II().readByte();
                            if (var91_26.II0o != 0) {
                                var91_26.I10_ = I_Ol.III_(0, 3);
                            }
                            var91_26.I1 = var91_26.llIO;
                            var91_26.I1I = var91_26.llI0;
                            I_Ol.II__(I1I1.Il("\ub7a5\ub843\ub862\ub86a\ub83a\ub8c1\ub8e9\ub88e\ub8c5\ub97c\ub91e\ub962", 47085) + var91_26.llIO + I1I1.Il("\ub7cd\ub875\ub816\ub86a", 47085) + var91_26.llI0);
                            var91_26.status = 5;
                            var91_26.I0Io = false;
                            var91_26.llI1 = var91_26.llIl = var1_1.java_io_DataInputStream_II().readInt();
                            var91_26.I00l();
                            I_0.III(60, var91_26.I1, var91_26.I1I, 1);
                            return;
                        }
                        case -12: {
                            I_Ol.II__(I1I1.Il("\ub7be\ub849\ub879\ub81c\ub82c\ub8da\ub887\ub895\ub8a0\ub94a\ub967\ub962\ub92c\ub9cf\ub9dd\ub99e\ub999\ub9b5\uba5e", 47085));
                            var91_27 = null;
                            try {
                                var91_27 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                            }
                            catch (Exception var96_88) {
                                // empty catch block
                            }
                            if (var91_27 == null) return;
                            if (var91_27.status == 0) return;
                            if (var91_27.status == 0) {
                                return;
                            }
                            var91_27.IOl0();
                            try {
                                var89_4 = var1_1.II_I();
                                if (var1_1.java_io_DataInputStream_II().readBoolean()) {
                                    I1_I.II(I1I1.Il("\ub7c0", 47085) + var89_4, var91_27.I1, var91_27.I1I - var91_27.IIl, 0, -2, 3);
                                } else {
                                    I1_I.II(I1I1.Il("\ub7c0", 47085) + var89_4, var91_27.I1, var91_27.I1I - var91_27.IIl, 0, -2, 5);
                                }
                                var93_48 = var1_1.java_io_DataInputStream_II().readByte();
                                var94_55 = 0;
                                while (var94_55 < var93_48) {
                                    var96_84 = new I10_(var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readShort(), var91_27.I1, var91_27.I1I, (int)var1_1.java_io_DataInputStream_II().readShort(), (int)var1_1.java_io_DataInputStream_II().readShort());
                                    var96_84.IoIO = var3_125 = var1_1.java_io_DataInputStream_II().readInt();
                                    I_Ol.II__(I1I1.Il("\ub79d\ub860\ub84a\ub833\ub80c\ub8fa\ub8ce\ub8a2\ub8d8\ub924", 47085) + var3_125 + I1I1.Il("\ub7cd\ub861\ub852\ub86a\ub800\ub8ec\ub89a\ub8e6", 47085) + Ilol.Ilol_II().IOI_);
                                    I1_I.var_I_lO_II_0.addElement(var96_84);
                                    if (I_Ol.II1(var96_84.I1I - Ilol.Ilol_II().I_oO) < 24 && I_Ol.II1(var96_84.I1 - Ilol.Ilol_II().I_o_) < 24) {
                                        Ilol.Ilol_II().var_Ilol_IIIl = null;
                                    }
                                    ++var94_55;
                                }
                                return;
                            }
                            catch (Exception var96_89) {
                                if (var1_1 == null) return;
                                var1_1.I0Oo();
                                return;
                            }
                        }
                        case -11: {
                            var91_28 = null;
                            try {
                                var89_4 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                I_Ol.II__(I1I1.Il("\ub780\ub863\ub849\ub86a\ub800\ub8e6\ub8c3\ub8a3\ub89d\ub939\ub903", 47085) + var89_4);
                                var91_28 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var89_4);
                            }
                            catch (Exception var96_90) {
                                // empty catch block
                            }
                            if (var91_28 == null) {
                                return;
                            }
                            Ilol.Ilol_II().I11O = false;
                            Ilol.var_boolean_I10 = false;
                            var89_4 = var1_1.II_I();
                            try {
                                var96_91 = var1_1.II_I();
                            }
                            catch (Exception var97_95) {
                                var96_91 = 0;
                            }
                            if (var91_28.I0IO) {
                                Ilol.Ilol_II().II(var89_4, var96_91, false, true);
                                return;
                            }
                            var91_28.lllI = var89_4;
                            var91_28.I1OI = var96_91;
                            var91_28.IIIl(Ilol.Ilol_II());
                            return;
                        }
                        case -10: {
                            var91_29 = null;
                            try {
                                var91_29 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                            }
                            catch (Exception var97_96) {
                                // empty catch block
                            }
                            if (var91_29 == null) return;
                            var95_68 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                            if (var95_68 == null) {
                                return;
                            }
                            var89_4 = var1_1.II_I();
                            var91_29.lllI = var95_68.IOl_ - var89_4;
                            try {
                                var95_68.IOl1 = var1_1.II_I();
                            }
                            catch (Exception var97_97) {
                                // empty catch block
                            }
                            if (var91_29.I0IO) {
                                var95_68.II(var91_29.lllI, 0, false, true);
                                return;
                            }
                            var91_29.IIIl(var95_68);
                            return;
                        }
                        case -9: {
                            var91_30 = null;
                            try {
                                var91_30 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                            }
                            catch (Exception var97_98) {
                                // empty catch block
                            }
                            if (var91_30 == null) {
                                return;
                            }
                            var91_30.llIl = var1_1.II_I();
                            var91_30.I00l();
                            var89_4 = var1_1.II_I();
                            if (var89_4 == 1) {
                                return;
                            }
                            if (var89_4 > 1) {
                                var91_30.IIII();
                            }
                            var97_99 = var1_1.java_io_DataInputStream_II().readBoolean();
                            var93_49 = var1_1.java_io_DataInputStream_II().readByte();
                            if (var93_49 != -1) {
                                I1lI.III(new I1ll((int)var93_49, var91_30.I1, var91_30.II1(), 3, 1, -1));
                            }
                            if (var97_99) {
                                I1_I.II(I1I1.Il("\ub7c0", 47085) + var89_4, var91_30.I1, var91_30.II1() - var91_30.II1I(), 0, -2, 3);
                                return;
                            }
                            if (var89_4 == 0) {
                                var91_30.I1 = var91_30.llIO;
                                var91_30.I1I = var91_30.llI0;
                                I1_I.II(IO11.IOlI, var91_30.I1, var91_30.II1() - var91_30.II1I(), 0, -2, 4);
                                return;
                            }
                            if (var89_4 <= 1) {
                                return;
                            }
                            I1_I.II(I1I1.Il("\ub7c0", 47085) + var89_4, var91_30.I1, var91_30.II1() - var91_30.II1I(), 0, -2, 5);
                            return;
                        }
                        case -8: {
                            var95_69 = I1_I.Ilol_II(var1_1.java_io_DataInputStream_II().readInt());
                            if (var95_69 == null) {
                                return;
                            }
                            var95_69.var_byte_IIIO = var1_1.java_io_DataInputStream_II().readByte();
                            var95_69.III(var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readShort());
                            return;
                        }
                        case -7: {
                            var88_2 = var1_1.java_io_DataInputStream_II().readInt();
                            var90_16 = 0;
                            while (var90_16 < I1_I.var_I_lO_II_O.size()) {
                                var92_37 = null;
                                try {
                                    var92_37 = (Ilol)I1_I.var_I_lO_II_O.elementAt(var90_16);
                                }
                                catch (Exception var97_100) {
                                    // empty catch block
                                }
                                if (var92_37 == null) {
                                    return;
                                }
                                if (var92_37.IOI_ == var88_2) {
                                    new StringBuffer(I1I1.Il("\ub7be\ub84d\ub813\ub832\ub85b\ub8f1", 47085)).append(var90_16).toString();
                                    var92_37.III(var1_1.java_io_DataInputStream_II().readShort(), (int)var1_1.java_io_DataInputStream_II().readShort(), 0);
                                    System.currentTimeMillis();
                                    return;
                                }
                                ++var90_16;
                            }
                            return;
                        }
                        case -6: {
                            I_Ol.II__(I1I1.Il("\ub7bd\ub840\ub86a\ub813\ub82c\ub8da\ub887\ub894\ub8a0\ub949\ub96c\ub914\ub924\ub9c4\ub9be\ub99f\ub9fc\ub9dd\uba3a\uba07\uba64\uba45\ubaaa\uba8b\ubae8\ubac9\ubb2e\ubb0f\ubb6c\ubb4d\ubbb2", 47085));
                            var88_2 = var1_1.java_io_DataInputStream_II().readInt();
                            var90_17 = 0;
                            while (var90_17 < I1_I.var_I_lO_II_O.size()) {
                                var92_38 = (Ilol)I1_I.var_I_lO_II_O.elementAt(var90_17);
                                if (var92_38 != null && var92_38.IOI_ == var88_2) {
                                    if (!var92_38.I1_1 && !var92_38.I11I) {
                                        I_0.III(60, var92_38.I_o_, var92_38.I_oO, 1);
                                    }
                                    if (var92_38.I11I != false) return;
                                    I1_I.var_I_lO_II_O.removeElementAt(var90_17);
                                    return;
                                }
                                ++var90_17;
                            }
                            return;
                        }
                        case -5: {
                            var4_129 = var1_1.java_io_DataInputStream_II().readInt();
                            var5_170 = var1_1.java_io_DataInputStream_II().readInt();
                            if (var5_170 != -100) {
                                var97_101 = new Ilol();
                                new Ilol().IOI_ = var4_129;
                                var97_101.IO1I = var5_170;
                            } else {
                                var97_101 = new I1oO();
                                ((Ilol)new I1oO()).IOI_ = var4_129;
                                var97_101.IO1I = var5_170;
                            }
                            if (var97_101.IO1I == -2) {
                                var97_101.I_Il = true;
                            }
                            if (!I1I1.II(var97_101, var1_1)) ** GOTO lbl2677
                            var98_102 = var1_1.java_io_DataInputStream_II().readByte();
                            if (var97_101.I_oO <= 10 && var98_102 != 0 && var98_102 != 2) {
                                var99_110 = new IOl1(var97_101.I_o_, var97_101.I_oO, var97_101.I0, var97_101.IOI1, 1, false, var98_102 == 1 ? var97_101.IOIO : var98_102);
                                new IOl1(var97_101.I_o_, var97_101.I_oO, var97_101.I0, var97_101.IOI1, 1, false, var98_102 == 1 ? var97_101.IOIO : var98_102).I1l = var97_101.IOI_;
                                var97_101.I11 = true;
                                IOl1.II(var99_110);
                            }
                            if (var98_102 == 2) {
                                var97_101.IO1();
                            }
                            for (var88_2 = 0; var88_2 < I1_I.var_I_lO_IIO.size(); ++var88_2) {
                                var99_111 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var88_2);
                                if (var99_111 == null || !var99_111.I0I1 || var99_111.lll != var97_101.IOI_) continue;
                                I_Ol.II__(I1I1.Il("\ub78e\ub863\ub80b\ub87b\ub849\ub8eb\ub8c8\ub8a8\ub8c5\ub975\ub956\ub923\ub908", 47085));
                                var97_101.var_I_I__IIIl = var99_111;
                                var97_101.var_I_I__IIIl.I1 = var97_101.I_o_;
                                var97_101.var_I_I__IIIl.I1I = var97_101.I_oO - 40;
                                break;
                            }
                            I1_I.IIO_(var4_129);
                            I1_I.var_I_lO_II_O.addElement(var97_101);
                            var97_101.var_byte_IIlo = var1_1.java_io_DataInputStream_II().readByte();
                            var99_105 = var1_1.java_io_DataInputStream_II().readShort();
                            if (var99_105 == -1) ** GOTO lbl2676
                            var97_101.I1O = true;
                            if (var99_105 == 346 || var99_105 == 347 || var99_105 == 348) ** GOTO lbl2674
                            if (var99_105 == 349 || var99_105 == 350 || var99_105 == 351) ** GOTO lbl2672
                            if (var99_105 != 396) ** GOTO lbl2666
                            var97_101.I1Ol = true;
                            ** GOTO lbl2677
lbl2666:
                            // 1 sources

                            if (var99_105 == 532) {
                                var97_101.I1O1 = true;
                            } else if (var99_105 >= Ilol.var_short_IIIl) {
                                var97_101.var_short_III1 = var99_105;
                            }
                            ** GOTO lbl2677
lbl2672:
                            // 1 sources

                            var97_101.I1OI = true;
                            ** GOTO lbl2677
lbl2674:
                            // 1 sources

                            var97_101.I1OI = false;
                            ** GOTO lbl2677
lbl2676:
                            // 1 sources

                            var97_101.I1O = false;
lbl2677:
                            // 7 sources

                            var98_102 = var1_1.java_io_DataInputStream_II().readByte();
                            var97_101.var_byte_IIl = (byte)var98_102;
                            var97_101.I11l = var1_1.java_io_DataInputStream_II().readByte() == 1;
                            try {
                                var97_101.var_short_IIlo = var1_1.java_io_DataInputStream_II().readShort();
                                var97_101.var_short_II1 = var1_1.java_io_DataInputStream_II().readByte();
                                var97_101.var_short_II1I = var1_1.java_io_DataInputStream_II().readShort();
                            }
                            catch (Exception var99_112) {
                                // empty catch block
                            }
                            I1_I.I1_I_II();
                            I1_I.II(var97_101.IOI_, var97_101.var_byte_IIl);
                            if (var97_101.I0Il >= 201 && var97_101.I0Il < 255) {
                                var99_113 = new I1ll(var97_101.I0Il, var97_101, 2, -1, 10, 1);
                                new I1ll(var97_101.I0Il, var97_101, 2, -1, 10, 1).I_O0 = 5;
                                var97_101.II(var99_113);
                                return;
                            }
                            var88_2 = 0;
                            while (var88_2 < 54) {
                                var97_101.IIl(0, var88_2 + 201);
                                ++var88_2;
                            }
                            return;
                        }
                        case -3: {
                            var2_123 = var1_1.java_io_DataInputStream_II().readByte();
                            var3_125 = var1_1.java_io_DataInputStream_II().readInt();
                            if (var2_123 == 0) {
                                var9_227 = Ilol.Ilol_II();
                                var9_227.Illo += (long)var3_125;
                            }
                            if (var2_123 == 1) {
                                var9_227 = Ilol.Ilol_II();
                                var9_227.Il1I += (long)var3_125;
                            }
                            if (var2_123 == 2) {
                                var9_227 = Ilol.Ilol_II();
                                var9_227.Illo += (long)var3_125;
                                var9_227 = Ilol.Ilol_II();
                                var9_227.Il1I += (long)var3_125;
                            }
                            Ilol.Ilol_II().IO10();
                            if (Ilol.Ilol_II().var_byte_III0 == 3) {
                                return;
                            }
                            I1_I.II((var3_125 > 0 ? I1I1.Il("\ub7c6", 47085) : "") + var3_125, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11, 0, -4, 2);
                            if (var3_125 <= 0) return;
                            if (Ilol.Ilol_II().var_I__I_II == null) return;
                            if (Ilol.Ilol_II().var_I__I_II.II1o != 5002) return;
                            I_0.III(55, Ilol.Ilol_II().var_I__I_II.IIO1, Ilol.Ilol_II().var_I__I_II.IIO, 1);
                            I_0.III(55, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, 1);
                            return;
                        }
                        case -2: {
                            var5_170 = var1_1.java_io_DataInputStream_II().readInt();
                            var9_227 = Ilol.Ilol_II();
                            var9_227.IO1o += var5_170;
                            I1_I.II(var5_170 > 0 ? I1I1.Il("\ub7c6", 47085) + var5_170 : "" + var5_170, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11 - 10, 0, -2, 1);
                            return;
                        }
                        case -1: {
                            var8_127 = var1_1.java_io_DataInputStream_II().readInt();
                            var9_227 = Ilol.Ilol_II();
                            var9_227.Il11 += (long)var8_127;
                            Ilol.Ilol_II().var_java_lang_String_IIO = IO10.IIIO(Ilol.Ilol_II().Il11);
                            var9_227 = Ilol.Ilol_II();
                            var9_227.IO1o -= var8_127;
                            I1_I.II(I1I1.Il("\ub7c6", 47085) + var8_127, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11 - 10, 0, -2, 1);
                            return;
                        }
                        case 18: {
                            var93_50 = var1_1.java_io_DataInputStream_II().readByte();
                            var94_56 = 0;
                            while (var94_56 < var93_50) {
                                var5_170 = var1_1.java_io_DataInputStream_II().readInt();
                                var100_118 = var1_1.java_io_DataInputStream_II().readShort();
                                var6_311 = var1_1.java_io_DataInputStream_II().readShort();
                                var8_127 = var1_1.II_I();
                                var101_131 = I1_I.Ilol_II(var5_170);
                                if (var101_131 != null) {
                                    var101_131.I_o_ = var100_118;
                                    var101_131.I_oO = var6_311;
                                    var101_131.IOl_ = var8_127;
                                    System.currentTimeMillis();
                                }
                                ++var94_56;
                            }
                            return;
                        }
                        case 19: {
                            Ilol.Ilol_II();
                            var1_1.java_io_DataInputStream_II().readUnsignedShort();
                            Ilol.Ilol_II();
                            var1_1.java_io_DataInputStream_II().readUnsignedShort();
                            return;
                        }
                        case 44: {
                            var89_4 = var1_1.java_io_DataInputStream_II().readInt();
                            var100_121 = var1_1.java_io_DataInputStream_II().readUTF();
                            I_Ol.II__(I1I1.Il("\ub798\ub87f\ub84e\ub838\ub849\ub8e1\ub8c3\ub8fb\ub8c5", 47085) + var89_4 + I1I1.Il("\ub7cd\ub878\ub84e\ub832\ub81d\ub8b5\ub887", 47085) + var100_121);
                            var95_70 = Ilol.Ilol_II().IOI_ == var89_4 ? Ilol.Ilol_II() : I1_I.Ilol_II(var89_4);
                            if (var95_70 != null) {
                                var95_70.II10(var100_121);
                                return;
                            }
                            if (var89_4 > -100000) return;
                            try {
                                ((I_I_)I1_I.var_I_lO_IIO.elementAt(-var89_4 - 100000)).II_1(var100_121);
                                return;
                            }
                            catch (Exception var101_132) {
                                // empty catch block
                                return;
                            }
                        }
                        case 45: {
                            var91_31 = null;
                            try {
                                var91_31 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                            }
                            catch (Exception var101_133) {
                                // empty catch block
                            }
                            if (var91_31 == null) return;
                            var91_31.llIl = var1_1.java_io_DataInputStream_II().readInt();
                            var91_31.I00l();
                            I1_I.II(IO11.IOlI, var91_31.I1, var91_31.I1I - var91_31.IIl, 0, -2, 4);
                            return;
                        }
                        case 66: {
                            I_Ol.II__(I1I1.Il("\ub7a0\ub849\ub80b\ub80e\ub820\ub8cd\ub887\ub89e\ub8b5\ub924\ub967\ub90d\ub936\ub9ce\ub9bf\ub9f0\ub992\ub9a8\uba3b\uba73\uba14\uba28\ubadb\ubaf3\uba98\ubab1\ubb5d\ubb66\ubb71\ubb29\ubbca\ubbfa\ubbec\ubbcd\ubc2a\ubc0b\ubc68\ubc49\ubca6\ubc87\ubce4\ubcc5\ubd22\ubd03\ubd60\ubd41\ubd5e\ubdbf\ubd9c\ubdfd\ubdda\ube3b\ube18\ube79\ube56\ubeb7\ube94\ubef5", 47085));
                            return;
                        }
                        case 74: {
                            var91_32 = null;
                            try {
                                var91_32 = (I_I_)I1_I.var_I_lO_IIO.elementAt(var1_1.java_io_DataInputStream_II().readUnsignedByte());
                            }
                            catch (Exception var101_134) {
                                // empty catch block
                            }
                            if (var91_32 == null) return;
                            if (var91_32.status == 0) return;
                            if (var91_32.status == 0) {
                                return;
                            }
                            var91_32.status = 0;
                            I_0.III(60, var91_32.I1, var91_32.I1I, 1);
                            var101_135 = new I10_(var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readShort(), var91_32.I1, var91_32.I1I, (int)var1_1.java_io_DataInputStream_II().readShort(), (int)var1_1.java_io_DataInputStream_II().readShort());
                            I1_I.var_I_lO_II_0.addElement(var101_135);
                            if (I_Ol.II1(var101_135.I1I - Ilol.Ilol_II().I_oO) >= 24) return;
                            if (I_Ol.II1(var101_135.I1 - Ilol.Ilol_II().I_o_) >= 24) {
                                return;
                            }
                            Ilol.Ilol_II().var_Ilol_IIIl = null;
                            return;
                        }
                        case 95: {
                            var3_125 = var1_1.java_io_DataInputStream_II().readInt();
                            var9_227 = Ilol.Ilol_II();
                            var9_227.Il11 += (long)var3_125;
                            Ilol.Ilol_II().var_java_lang_String_IIO = IO10.IIIO(Ilol.Ilol_II().Il11);
                            I1_I.II(var3_125 > 0 ? I1I1.Il("\ub7c6", 47085) + var3_125 : "" + var3_125, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11 - 10, 0, -2, 1);
                            return;
                        }
                        case 96: {
                            Ilol.Ilol_II().var_I_lO_IIl_.addElement(new IOll(var1_1.java_io_DataInputStream_II().readByte(), var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readShort(), var1_1.java_io_DataInputStream_II().readUTF(), var1_1.java_io_DataInputStream_II().readUTF(), var1_1.java_io_DataInputStream_II().readByte(), var1_1.java_io_DataInputStream_II().readByte()));
                            return;
                        }
                        case 97: {
                            var7_193 = var1_1.java_io_DataInputStream_II().readByte();
                            var8_127 = 0;
                            while (var8_127 < Ilol.Ilol_II().var_I_lO_IIl_.size()) {
                                var101_136 = (IOll)Ilol.Ilol_II().var_I_lO_IIl_.elementAt(var8_127);
                                if (var101_136.II0I == var7_193) {
                                    var101_136.I_O0 = var1_1.java_io_DataInputStream_II().readShort();
                                    return;
                                }
                                ++var8_127;
                            }
                            return;
                        }
                        case 127: {
                            var101_130 = var1_1.java_io_DataInputStream_II().readByte();
                            if (var101_130 == 0) {
                                var102_139 = var1_1.java_io_DataInputStream_II().readUnsignedShort();
                                var103_146 = new I_lO("");
                                var104_152 = 0;
                                for (var105_154 = 0; var105_154 < var102_139; ++var105_154) {
                                    try {
                                        var106_156 = new I10I();
                                        var106_156.IIO = var1_1.java_io_DataInputStream_II().readShort();
                                        var106_156.IIOl = var1_1.java_io_DataInputStream_II().readShort();
                                        var106_156.IIO1 = var1_1.java_io_DataInputStream_II().readByte();
                                        var107_158 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var108_159 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var106_156.II10 = var1_1.java_io_DataInputStream_II().readByte();
                                        if (var106_156.II10 == 0) {
                                            var109_161 = new I_I_();
                                            var109_161.I1ll = var1_1.java_io_DataInputStream_II().readShort();
                                            var106_156.III0 = var109_161;
                                        } else {
                                            var1_1.java_io_DataInputStream_II().readShort();
                                            var1_1.java_io_DataInputStream_II().readShort();
                                            var1_1.java_io_DataInputStream_II().readShort();
                                            var1_1.java_io_DataInputStream_II().readShort();
                                        }
                                        var106_156.IIo_ = var1_1.java_io_DataInputStream_II().readUTF();
                                        var106_156.IIol = var1_1.java_io_DataInputStream_II().readUTF();
                                        var106_156.IIIo = var1_1.java_io_DataInputStream_II().readByte();
                                        var106_156.IIOO = var1_1.java_io_DataInputStream_II().readByte();
                                        var106_156.II((byte)var107_158, (byte)var108_159);
                                        var109_162 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                        var106_156.II = new I100[var109_162];
                                        for (var110_166 = 0; var110_166 < var109_162; ++var110_166) {
                                            var111_172 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                            var112_177 = var1_1.java_io_DataInputStream_II().readShort();
                                            var113_187 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                                            try {
                                                var114_190 = new I100(var111_172, var112_177);
                                            }
                                            catch (Exception var115_202) {
                                                var114_190 = new I100();
                                            }
                                            var114_190.II0I = (byte)var113_187;
                                            var106_156.II[var110_166] = var114_190;
                                        }
                                        var106_156.IIOI = var106_156.IIO;
                                        var106_156.lIOl = var1_1.java_io_DataInputStream_II().readShort();
                                        var106_156.IIl1();
                                        if (var106_156.IIIo != 0) {
                                            ++var104_152;
                                        }
                                        var103_146.addElement(var106_156);
                                        continue;
                                    }
                                    catch (Exception var106_157) {
                                        System.out.println(I1I1.Il("\ub7b6\ub87e\ub84a\ub82e\ub808\ub8fa\ub8fa\ub8e6\ub889\ub96b\ub94a\ub962\ub905\ub9ef\ub9fc\ub99e\ub9b9\ub989\uba3b\uba56\uba30\uba1d\ubae2\uba96\ubaa1\uba9c\ubb76\ubb12\ubb25\ubb18\ubbfa\ubb8e", 47085) + var105_154 + I1I1.Il("\ub7c2", 47085) + var102_139 + I1I1.Il("\ub7d7\ub82c", 47085) + var106_157);
                                        break;
                                    }
                                }
                                I_O.II().II((I_lO)var103_146, var104_152, 0);
                                return;
                            }
                            if (var101_130 == 1) {
                                var102_140 = var1_1.java_io_DataInputStream_II().readShort();
                                var103_147 = var1_1.java_io_DataInputStream_II().readByte();
                                var104_151 = I10I.II(I_O.IlII, var102_140);
                                if (var104_151 != null) {
                                    var104_151.II(var103_147);
                                }
                                I_O.IO11();
                                return;
                            }
                            if (var101_130 == 2) {
                                var102_141 = var1_1.java_io_DataInputStream_II().readShort();
                                var103_148 = var1_1.java_io_DataInputStream_II().readByte();
                                var104_151 = I10I.II(I_O.IlII, var102_141);
                                if (var104_151 == null) return;
                                var104_151.III(var103_148);
                                return;
                            }
                            if (var101_130 != 3) return;
                            var102_142 = var1_1.java_io_DataInputStream_II().readShort();
                            var103_149 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            var104_153 = var1_1.java_io_DataInputStream_II().readUnsignedByte();
                            var105_155 = I10I.II(I_O.IlII, var102_142);
                            if (var105_155 == null) return;
                            var105_155.II((byte)var103_149, (byte)var104_153);
                            return;
                        }
                    }
                    return;
                }
            }
            catch (Exception var2_124) {
                new StringBuffer(String.valueOf(var2_124.getMessage())).append(I1I1.Il("\ub7cd", 47085)).append(var2_124.toString()).toString();
                var2_124.printStackTrace();
                return;
            }
        }
        I1OO.I__o();
        var30_264 = var1_1.java_io_DataInputStream_II().readShort();
        I_Ol.II__(I1I1.Il("\ub7a2\ub85c\ub86e\ub804\ub836\ub8dd\ub8ee\ub899\ub8b6\ub945\ub97a\ub962\ub928\ub9c4\ub9a2\ub99e", 47085) + var30_264);
        var31_143 = I_Ol.IIIo(var1_1.java_io_DataInputStream_II().readUTF());
        for (var76_277 = 0; var76_277 < I1_I.var_I_lO_IIOI.size(); ++var76_277) {
            var32_276 = (I_11)I1_I.var_I_lO_IIOI.elementAt(var76_277);
            I_Ol.II__(I1I1.Il("\ub783\ub87c\ub848\ub86a\ub800\ub8ec\ub89a\ub8e6", 47085) + var32_276.var_I_1__II.lll0);
            if (var32_276.var_I_1__II.lll0 != var30_264) continue;
            Ilo1.III(var31_143, 100000, var32_276);
            II.var_I_1o_II.Iol_();
            return;
        }
        var127_269 = new I_11(var30_264, 0, 0, 0, var30_264, I1_I.var_I1Oo_II.III1[Ilol.Ilol_II().IOIO][2]);
        if (var127_269.var_I_1__II.lll0 == 5) {
            var127_269.IOI_ = 5;
        }
        try {
            var127_269.IO_l = var1_1.java_io_DataInputStream_II().readShort();
        }
        catch (Exception var128_278) {
            // empty catch block
        }
        Ilo1.III(var31_143, 100000, var127_269);
        II.var_I_1o_II.Iol_();
        ** while (true)
        finally {
            if (var1_1 != null) {
                var1_1.I0Oo();
            }
        }
    }

    private static void IIII(I_Il i_Il) throws IOException {
        int n = i_Il.java_io_DataInputStream_II().readByte();
        IloO.var_I__1_arr_II = new I__1[n];
        I_Ol.II__(I1I1.Il("\ub7b6\ub840\ub86e\ub804\ub834\ub8a8\ub8d4\ub8aa\ub8c5\ub96a\ub944\ub937\ub90e\ub9e9\ub9bf\ub9dd\ub9b5\ub993\uba72\uba1a", 47085) + n);
        for (int i = 0; i < n; ++i) {
            int n2 = i_Il.java_io_DataInputStream_II().readInt();
            String string = i_Il.java_io_DataInputStream_II().readUTF();
            short s = i_Il.java_io_DataInputStream_II().readShort();
            short s2 = i_Il.java_io_DataInputStream_II().readShort();
            short s3 = i_Il.java_io_DataInputStream_II().readShort();
            long l = i_Il.java_io_DataInputStream_II().readLong();
            IloO.var_I__1_arr_II[i] = new I__1(n2, string, s, s2, s3, l);
        }
        II.var_IloO_II.I0l_();
        II.var_IloO_II.III((byte)n);
    }

    private static void void_II(DataInputStream dataInputStream) throws IOException {
        int n;
        I1_I.II_I = dataInputStream.readByte();
        I1_I.I1_I_II().var_I_oI_arr_II = new I_oI[dataInputStream.readByte()];
        for (n = 0; n < I1_I.I1_I_II().var_I_oI_arr_II.length; ++n) {
            I1_I.I1_I_II().var_I_oI_arr_II[n] = new I_oI();
            I1_I.I1_I_II();
            I1_I.I1_I_II();
            dataInputStream.readUTF();
        }
        I1_I.var_I_l0_arr_II = new I_l0[dataInputStream.readByte()];
        for (n = 0; n < I1_I.var_I_l0_arr_II.length; ++n) {
            I1_I.var_I_l0_arr_II[n] = new I_l0();
            I1_I.var_I_l0_arr_II[n].II0I = n;
            dataInputStream.readUTF();
            I1_I.var_I_l0_arr_II[n].II = new I_o1[dataInputStream.readByte()];
            for (int i = 0; i < I1_I.var_I_l0_arr_II[n].II.length; ++i) {
                I1_I.var_I_l0_arr_II[n].II[i] = new I_o1();
                I1_I.var_I_l0_arr_II[n].II[i].IlIO = dataInputStream.readByte();
                I1_I.var_I_l0_arr_II[n].II[i].II1o = dataInputStream.readUTF();
                I1_I.var_I_l0_arr_II[n].II[i].l1OI = dataInputStream.readByte();
                I1_I.var_I_l0_arr_II[n].II[i].l1Ol = dataInputStream.readByte();
                I1_I.var_I_l0_arr_II[n].II[i].IoI_ = dataInputStream.readByte();
                I1_I.var_I_l0_arr_II[n].II[i].l1O1 = dataInputStream.readShort();
                I1_I.var_I_l0_arr_II[n].II[i].Il_I = dataInputStream.readUTF();
                int n2 = 130;
                if (II.var_int_IIl == 128 || II.var_int_IIlI <= 208) {
                    n2 = 100;
                }
                I1_I.var_I_l0_arr_II[n].II[i].II_0 = IO1I.IIl1.II(dataInputStream.readUTF(), n2);
                I1_I.var_I_l0_arr_II[n].II[i].IIIl = new I_0o[dataInputStream.readByte()];
                for (int j = 0; j < I1_I.var_I_l0_arr_II[n].II[i].IIIl.length; ++j) {
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j] = new I_0o();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].II0I = dataInputStream.readShort();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].II = I1_I.var_I_l0_arr_II[n].II[i];
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].l1__ = dataInputStream.readByte();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].I1 = dataInputStream.readLong();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].l1O = dataInputStream.readShort();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].l1_O = dataInputStream.readInt();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].l1_0 = dataInputStream.readShort();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].l1_o = dataInputStream.readShort();
                    dataInputStream.readByte();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].IIO = dataInputStream.readShort();
                    dataInputStream.readShort();
                    I1_I.var_I_l0_arr_II[n].II[i].IIIl[j].Il_ = dataInputStream.readUTF();
                    I_o_.IIII(I1_I.var_I_l0_arr_II[n].II[i].IIIl[j]);
                }
            }
        }
    }

    private static void III(DataInputStream dataInputStream) throws IOException {
        int n;
        I1_I.II_ = dataInputStream.readByte();
        IOlO.II11 = new String[dataInputStream.readUnsignedByte()];
        for (n = 0; n < IOlO.II11.length; ++n) {
            IOlO.II11[n] = dataInputStream.readUTF();
        }
        I_11.var_I_1__arr_II = new I_1_[dataInputStream.readByte()];
        for (n = 0; n < I_11.var_I_1__arr_II.length; n = (int)((byte)(n + 1))) {
            I_11.var_I_1__arr_II[n] = new I_1_();
            I_11.var_I_1__arr_II[n].lll0 = n;
            I_11.var_I_1__arr_II[n].II1o = dataInputStream.readUTF();
            I_11.var_I_1__arr_II[n].lllo = dataInputStream.readShort();
            I_11.var_I_1__arr_II[n].ll1 = dataInputStream.readShort();
            I_11.var_I_1__arr_II[n].ll1I = dataInputStream.readShort();
            I_11.var_I_1__arr_II[n].III = new String[dataInputStream.readByte()][];
            for (int i = 0; i < I_11.var_I_1__arr_II[n].III.length; ++i) {
                I_11.var_I_1__arr_II[n].III[i] = new String[dataInputStream.readByte()];
                for (int j = 0; j < I_11.var_I_1__arr_II[n].III[i].length; ++j) {
                    I_11.var_I_1__arr_II[n].III[i][j] = dataInputStream.readUTF();
                }
            }
        }
        I_I_.var_I_Io_arr_II = new I_Io[dataInputStream.readByte()];
        for (n = 0; n < I_I_.var_I_Io_arr_II.length; n = (int)((byte)(n + 1))) {
            I_I_.var_I_Io_arr_II[n] = new I_Io();
            I_I_.var_I_Io_arr_II[n].II0l = dataInputStream.readByte();
            I_I_.var_I_Io_arr_II[n].II1o = dataInputStream.readUTF();
            I_I_.var_I_Io_arr_II[n].llIl = dataInputStream.readInt();
            I_I_.var_I_Io_arr_II[n].IIo = dataInputStream.readByte();
            I_I_.var_I_Io_arr_II[n].IIoI = dataInputStream.readByte();
            I_I_.var_I_Io_arr_II[n].IIol = dataInputStream.readByte();
        }
    }

    private static void II(DataInputStream dataInputStream, boolean bl) throws IOException {
        I1_I.II1o = dataInputStream.readByte();
        if (bl) {
            I_O1.II(I1I1.Il("\ub7a3\ub85e\ub874\ub82e\ub808\ub8fa\ub8d3", 47085), I_1l.II(dataInputStream));
            I_O1.II(I1I1.Il("\ub7a3\ub85e\ub874\ub82b\ub81b\ub8fa\ub8c8\ub8b1", 47085), I_1l.II(dataInputStream));
            I_O1.II(I1I1.Il("\ub7a3\ub85e\ub874\ub82f\ub80f\ub8ee\ub8c2\ub8a5\ub891", 47085), I_1l.II(dataInputStream));
            I_O1.II(I1I1.Il("\ub7a3\ub85e\ub874\ub823\ub804\ub8e9\ub8c0\ub8a3", 47085), I_1l.II(dataInputStream));
            I_O1.II(I1I1.Il("\ub7a3\ub85e\ub874\ub83a\ub808\ub8fa\ub8d3", 47085), I_1l.II(dataInputStream));
            I_O1.II(I1I1.Il("\ub7a3\ub85e\ub874\ub839\ub802\ub8e1\ub8cb\ub8aa", 47085), I_1l.II(dataInputStream));
            I_O1.II_O(I1I1.Il("\ub7a3\ub85e\ub84f\ub82b\ub81d\ub8e9", 47085));
        }
    }

    private static Image II(byte[] byArray) {
        try {
            return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void II(I_Il i_Il, int n) {
        try {
            I1 i1 = new I1();
            byte by = i_Il.java_io_DataInputStream_II().readByte();
            i1.IoI_ = by;
            i1.I1l = i_Il.java_io_DataInputStream_II().readInt();
            i1.IoIO = i_Il.java_io_DataInputStream_II().readInt();
            i1.IIo1 = i_Il.java_io_DataInputStream_II().readUTF();
            i1.III = i_Il.java_io_DataInputStream_II().readByte();
            i1.IlO = i_Il.java_io_DataInputStream_II().readInt() + 1000000000;
            I_Ol.II__(I1I1.Il("\ub799\ub875\ub85b\ub82f\ub854\ub8a8", 47085) + i1.IoI_ + I1I1.Il("\ub7cd\ub865\ub84f\ub877\ub849", 47085) + i1.I1l + I1I1.Il("\ub7cd\ub87c\ub847\ub82b\ub810\ub8c1\ub8e3\ub8fb\ub8c5", 47085) + i1.IoIO + I1I1.Il("\ub7cd\ub878\ub842\ub827\ub80c\ub8b5\ub887", 47085) + i1.IlO);
            boolean bl = false;
            I1_I.IOlo = false;
            if (by == 0) {
                String string = i_Il.java_io_DataInputStream_II().readUTF();
                I_Ol.II__(I1I1.Il("\ub79e\ub878\ub859\ub86a\ub80a\ub8e0\ub8c6\ub8b2\ub8c5", 47085) + string);
                I1_I.IOlo = true;
                if (IO1I.IIlI.IIII(string) > I_1o.llOI - 60) {
                    i1.IIIo = IO1I.IIlI.II(string, I_1o.llOI - 10);
                } else {
                    i1.IIIo = new String[1];
                    i1.IIIo[0] = string;
                }
                i1.II1_ = i_Il.java_io_DataInputStream_II().readByte();
            } else if (by == 1) {
                i1.IoI0 = i_Il.java_io_DataInputStream_II().readByte();
                i1.IoIo = i_Il.java_io_DataInputStream_II().readByte();
                bl = i_Il.java_io_DataInputStream_II().readByte() == 1;
                if (bl) {
                    I1_I.IOlo = true;
                }
                if (i1.IoIO != Ilol.Ilol_II().IOI_) {
                    i1.IIl = i1.IoI0 < i1.IoIo ? new String[]{IO11.IOll} : null;
                }
                if (II.var_I_1o_II.var_Ilo1_III1 != null) {
                    II.var_I_1o_II.III0(i1.IoI0, i1.IoIo);
                }
            } else if (by == 2 && Ilol.Ilol_II().var_byte_III_ == 0) {
                I1_I.IOlo = true;
                i1.IIl = new String[]{IO11.I_l_, IO11.IOl1};
            }
            if (II.var_IO1__II != I1_I.var_I1_I_II) {
                I1_I.IOlo = false;
            } else if (II.var_I_1o_II.I_10 && II.var_I_1o_II.IoI_ == 0 && II.var_I_1o_II.ll_0 == 3) {
                I1_I.IOlo = false;
            }
            I1.II(i1, n, bl);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void IIII(byte n) {
        I_Ol.II__(I1I1.Il("\ub784\ub87f\ub80b\ub826\ub806\ub8e9\ub8c3\ub8af\ub88b\ub963\ub903\ub92f\ub900\ub9f0\ub9bf\ub983\ub9fd", 47085) + Ilol.var_boolean_I10I);
        I1_I.I1_I_II().Io0_ = 0;
        I1_I.IO_l = false;
        I1I0.var_I1I0_II = null;
        I1_I.var_I1Oo_II.IO0 = false;
        I1_I.var_I1Oo_III.IO0 = false;
        I1_I.Ioll = 0;
        II.var_I_1o_II.I_10 = false;
        IO.II();
        if (!I1_I.I1l1 && !I1I0.I1l1) {
            I1_I.I1_I_II().IIl1();
        }
        I1_I.IIlI(n == 1 ? Ilol.Ilol_II().I_o_ : -1, n == 0 ? -1 : 0);
        IOlO.IO_();
        IOlO.IIII(IOlO.l1o);
        I_Ol.II__(I1I1.Il("\ub7a1\ub843\ub86a\ub80e\ub849\ub8cf\ub8e6\ub88b\ub8a0\ub957\ub960\ub910\ub941\ub9b2", 47085));
        Ilol.Ilol_II().I_o0 = 0;
        Ilol.Ilol_II().IOIl = 4;
        Ilol.Ilol_II().var_I_ll_II = null;
        Ilol.Ilol_II().var_I_I__IIII = null;
        Ilol.Ilol_II().var_Ilol_IIIl = null;
        Ilol.Ilol_II().var_I_11_II = null;
        Ilol.Ilol_II().var_I10__II = null;
        Ilol.Ilol_II().var_I_ol_II = null;
        Ilol.Ilol_II().IIIO(false);
        Ilol.Ilol_II().var_I_ol_III = null;
        II.IIlI();
        if (Ilol.Ilol_II().I_oO >= IOlO.l10o - 100) {
            Ilol.Ilol_II().I1_o = true;
            Ilol ilol = Ilol.Ilol_II();
            ilol.I_o_ += I_Ol.II1(I_Ol.III_(0, 80));
            I_0_.II().IoO();
        }
        I1_I.I1_I_II().I01O();
        II.III(IOlO.l1o1);
        Ilol.var_boolean_I10 = false;
        for (int i = 0; i < Ilol.Ilol_II().var_I_lO_IIll.size(); ++i) {
            Ilol.Ilol_II().var_I_lO_IIll.elementAt(i);
        }
        II.III1();
        II.IIIl();
        I1_I.I1_I_II().lI1I = Ilol.Ilol_II().IOl_;
        I1_I.I1_I_II().lIlo = Ilol.Ilol_II().IOl1;
        Ilol.I1Oo = false;
        I1_I.I1_I_II().I0l_();
        if (Ilol.Ilol_II().I_oO <= 10 && n != 0 && n != 2) {
            IOl1.II(new IOl1(Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO, Ilol.Ilol_II().I0, Ilol.Ilol_II().IOI1, 1, true, n == 1 ? Ilol.Ilol_II().IOIO : n));
            Ilol.Ilol_II().I11 = true;
        }
        if (n == 2) {
            Ilol.Ilol_II().IO1();
        }
        if (I1_I.I1_I_II().IO1l) {
            if (IOlO.l1oI == I1_I.I1_I_II().Ioo_ && IOlO.l1ol == I1_I.I1_I_II().IooO) {
                I1_I.I1_I_II().IIl1(I1_I.I1_I_II().Iool, I1_I.I1_I_II().Ioo1);
            }
            if (IO1l.l_I0 > 1) {
                I1_I.I1_I_II().I0_l();
            }
        }
        I1OO.I__o();
        I1OO.II(IOlO.Il_O, IO11.I_00 + I1I1.Il("\ub7cd", 47085) + IOlO.l1ol, 30);
        II.III_();
        II.var_boolean_IIII = false;
        I1_l.I0_o();
        I1_l.I0_0();
    }

    private void IIIl(I_Il i_Il) {
        try {
            int n;
            boolean bl;
            int n2;
            int n3;
            I1_O i1_O;
            int n4;
            int n5;
            I_Ol.II__(I1I1.Il("\ub7dc\ub83e\ub818\ub86a\ub80a\ub8e0\ub8c6\ub8b4\ub8d8\ub924", 47085) + Ilol.Ilol_II() == null ? I1I1.Il("\ub783\ub879\ub847\ub826", 47085) : I1I1.Il("\ub7cc\ub862\ub85e\ub826\ub805", 47085));
            short s = i_Il.java_io_DataInputStream_II().readShort();
            Ilol.Ilol_II().IO00 = s;
            Ilol.Ilol_II().I_o_ = s;
            short s2 = i_Il.java_io_DataInputStream_II().readShort();
            Ilol.Ilol_II().IO0o = s2;
            Ilol.Ilol_II().I_oO = s2;
            Ilol.Ilol_II().I010 = Ilol.Ilol_II().I_o_;
            Ilol.Ilol_II().I01o = Ilol.Ilol_II().I_oO;
            I_Ol.II__(I1I1.Il("\ub785\ub869\ub84a\ub82e\ub854\ub8a8", 47085) + Ilol.Ilol_II().I0 + I1I1.Il("\ub7cd\ub86e\ub844\ub82e\ub810\ub8b5\ub887", 47085) + Ilol.Ilol_II().I0II + I1I1.Il("\ub7cd\ub860\ub84e\ub82c\ub81d\ub8b5\ub887", 47085) + Ilol.Ilol_II().I0I + I1I1.Il("\ub7cd\ub874\ub816\ub86a", 47085) + Ilol.Ilol_II().I_o_ + I1I1.Il("\ub7cd\ub875\ub816\ub86a", 47085) + Ilol.Ilol_II().I_oO + I1I1.Il("\ub7cd\ub86f\ub843\ub83f\ub807\ub8ef\ub887\ub8b2\ub88a\ub967\ub91e\ub962", 47085) + Ilol.Ilol_II().IOIO);
            if (Ilol.Ilol_II().I_o_ >= 0 && Ilol.Ilol_II().I_o_ <= 100) {
                Ilol.Ilol_II().IOI1 = 1;
            } else if (Ilol.Ilol_II().I_o_ >= IOlO.l10_ - 100 && Ilol.Ilol_II().I_o_ <= IOlO.l10_) {
                Ilol.Ilol_II().IOI1 = -1;
            }
            int n6 = i_Il.java_io_DataInputStream_II().readByte();
            I_Ol.II__(I1I1.Il("\ub79b\ub84b\ub844\ub86a\ub81a\ub8e1\ub8dd\ub8a3\ub8d8\ub924", 47085) + n6);
            if (!I1_I.var_I1Oo_II.IOOo) {
                I1_I.var_I1Oo_II.Io1 = Ilol.Ilol_II().I_o_ - I1_I.Io1;
                I1_I.var_I1Oo_II.Io1I = Ilol.Ilol_II().I_oO - I1_I.Io1I;
            }
            for (n5 = 0; n5 < n6; ++n5) {
                new IO1(i_Il.java_io_DataInputStream_II().readShort(), i_Il.java_io_DataInputStream_II().readShort(), i_Il.java_io_DataInputStream_II().readShort(), i_Il.java_io_DataInputStream_II().readShort(), i_Il.java_io_DataInputStream_II().readBoolean(), i_Il.java_io_DataInputStream_II().readBoolean(), i_Il.java_io_DataInputStream_II().readUTF());
            }
            n6 = i_Il.java_io_DataInputStream_II().readByte();
            I_I_.II01.removeAllElements();
            for (n4 = 0; n4 < n6; n4 = (int)((byte)(n4 + 1))) {
                I_I_ i_I_ = new I_I_(n4, i_Il.java_io_DataInputStream_II().readBoolean(), i_Il.java_io_DataInputStream_II().readBoolean(), i_Il.java_io_DataInputStream_II().readBoolean(), i_Il.java_io_DataInputStream_II().readBoolean(), i_Il.java_io_DataInputStream_II().readBoolean(), i_Il.java_io_DataInputStream_II().readByte(), i_Il.java_io_DataInputStream_II().readByte(), i_Il.java_io_DataInputStream_II().readInt(), i_Il.java_io_DataInputStream_II().readByte(), i_Il.java_io_DataInputStream_II().readInt(), i_Il.java_io_DataInputStream_II().readShort(), i_Il.java_io_DataInputStream_II().readShort(), i_Il.java_io_DataInputStream_II().readByte(), i_Il.java_io_DataInputStream_II().readByte());
                i_I_.I010 = i_I_.I1;
                i_I_.I01o = i_I_.I1I;
                i_I_.I0Il = i_Il.java_io_DataInputStream_II().readBoolean();
                if (I_I_.var_I_Io_arr_II[i_I_.I1ll].II0l != 0) {
                    i_I_.llI_ = n4 % 3 == 0 ? -1 : 1;
                    i_I_.I1 += 10 - n4 % 20;
                }
                i_I_.I0I1 = false;
                Ilo ilo = null;
                Il0_ il0_ = null;
                IloI iloI = null;
                i1_O = null;
                if (i_I_.I1ll == 70) {
                    ilo = new Ilo(n4, (short)i_I_.I1, (short)i_I_.I1I, 70, i_I_.llIl, i_I_.llI1, i_I_.lIOO);
                }
                if (i_I_.I1ll == 71) {
                    il0_ = new Il0_(n4, (short)i_I_.I1, (short)i_I_.I1I, 71, i_I_.llIl, i_I_.llI1);
                }
                if (i_I_.I1ll == 72) {
                    iloI = new IloI(n4, (short)i_I_.I1, (short)i_I_.I1I, 72, i_I_.llIl, i_I_.llI1);
                }
                if (i_I_.I0Il) {
                    i1_O = new I_1I(n4, (short)i_I_.I1, (short)i_I_.I1I, i_I_.I1ll, i_I_.llIl, i_I_.llI1);
                }
                if (i1_O != null) {
                    I1_I.var_I_lO_IIO.addElement(i1_O);
                    continue;
                }
                if (ilo != null) {
                    I1_I.var_I_lO_IIO.addElement(ilo);
                    continue;
                }
                if (il0_ != null) {
                    I1_I.var_I_lO_IIO.addElement(il0_);
                    continue;
                }
                if (iloI != null) {
                    I1_I.var_I_lO_IIO.addElement(iloI);
                    continue;
                }
                I1_I.var_I_lO_IIO.addElement(i_I_);
            }
            if (Ilol.Ilol_II().var_I_I__IIIl != null && I1_I.I_I__II(Ilol.Ilol_II().var_I_I__IIIl.lll) == null) {
                Ilol.Ilol_II().var_I_I__IIIl.I00();
                Ilol.Ilol_II().var_I_I__IIIl.I1 = Ilol.Ilol_II().I_o_;
                Ilol.Ilol_II().var_I_I__IIIl.I1I = Ilol.Ilol_II().I_oO - 40;
                I1_I.var_I_lO_IIO.addElement(Ilol.Ilol_II().var_I_I__IIIl);
            }
            i_Il.java_io_DataInputStream_II().readByte();
            n6 = i_Il.java_io_DataInputStream_II().readByte();
            I_Ol.II__(I1I1.Il("\ub7a3\ub85c\ub868\ub86a\ub81a\ub8e1\ub8dd\ub8a3\ub8d8\ub924", 47085) + n6);
            for (n5 = 0; n5 < n6; ++n5) {
                short s3 = i_Il.java_io_DataInputStream_II().readByte();
                n4 = i_Il.java_io_DataInputStream_II().readShort();
                short s4 = i_Il.java_io_DataInputStream_II().readShort();
                short s5 = i_Il.java_io_DataInputStream_II().readByte();
                I_Ol.II__(I1I1.Il("\ub799\ub869\ub846\ub83a\ub808\ub8e4\ub8d3\ub8a3\ub8c5\ub939\ub903", 47085) + s5);
                short s6 = i_Il.java_io_DataInputStream_II().readShort();
                I_Ol.II__(I1I1.Il("\ub7dc", 47085));
                if (s5 == 6) continue;
                I_Ol.II__(I1I1.Il("\ub7df", 47085));
                if (Ilol.Ilol_II().var_IOlI_II.II01 < 7 || Ilol.Ilol_II().var_IOlI_II.II01 == 7 && Ilol.Ilol_II().var_IOlI_II.l10l <= 1) {
                    if (s5 == 7 || s5 == 8 || s5 == 9) continue;
                    I_Ol.II__(I1I1.Il("\ub7de", 47085));
                }
                if (Ilol.Ilol_II().var_IOlI_II.II01 < 6 && s5 == 16) continue;
                if (s5 == 4) {
                    I1_I.I1_I_II().var_I1o0_II = new I1o0(n5, s3, n4, s4, s5, s6);
                    I_0_.II().III_((byte)2);
                    I1_I.var_I_lO_IIOI.addElement(I1_I.I1_I_II().var_I1o0_II);
                    I_Ol.II__(I1I1.Il("\ub7d8", 47085));
                    continue;
                }
                i1_O = new I_11(n5, s3, n4, s4 + 3, s5, s6);
                I1_I.var_I_lO_IIOI.addElement(i1_O);
                I_Ol.II__(I1I1.Il("\ub7db", 47085));
            }
            n6 = i_Il.java_io_DataInputStream_II().readByte();
            I_Ol.II__(I1I1.Il("\ub784\ub878\ub84e\ub827\ub849\ub8fb\ub8ce\ub8bc\ub880\ub924\ub91e\ub962", 47085) + n6);
            for (n3 = 0; n3 < n6; ++n3) {
                short s7 = i_Il.java_io_DataInputStream_II().readShort();
                short s8 = i_Il.java_io_DataInputStream_II().readShort();
                short s9 = i_Il.java_io_DataInputStream_II().readShort();
                n2 = i_Il.java_io_DataInputStream_II().readShort();
                int n7 = i_Il.java_io_DataInputStream_II().readInt();
                n4 = 0;
                if (n7 == -2) {
                    n4 = i_Il.java_io_DataInputStream_II().readShort();
                }
                I10_ i10_ = new I10_(n7, s7, s8, (int)s9, n2, (short)n4);
                bl = false;
                for (n = 0; n < I1_I.var_I_lO_II_0.size(); ++n) {
                    if (((I10_)I1_I.var_I_lO_II_0.elementAt((int)n)).lI0l != i10_.lI0l) continue;
                    bl = true;
                    break;
                }
                if (bl) continue;
                I1_I.var_I_lO_II_0.addElement(i10_);
            }
            IOlO.IlIO.removeAllElements();
            if (IO1l.l_I0 == 1) {
                Il0o.IIl1();
            }
            Il0o.III0.removeAllElements();
            if (!(!II.var_boolean_II || II.var_boolean_II && IOlO.Ill() || IOlO.l1oI == 45 || IOlO.l1oI == 46 || IOlO.l1oI == 47 || IOlO.l1oI == 48)) {
                int n8 = i_Il.java_io_DataInputStream_II().readShort();
                for (n5 = 0; n5 < n8; ++n5) {
                    i_Il.java_io_DataInputStream_II().readShort();
                    i_Il.java_io_DataInputStream_II().readShort();
                    i_Il.java_io_DataInputStream_II().readShort();
                }
                int n9 = i_Il.java_io_DataInputStream_II().readShort();
                for (n2 = 0; n2 < n9; ++n2) {
                    i_Il.java_io_DataInputStream_II().readUTF();
                    i_Il.java_io_DataInputStream_II().readUTF();
                }
            } else {
                Image image;
                Object object;
                Object object2;
                int n10 = i_Il.java_io_DataInputStream_II().readShort();
                for (n5 = 0; n5 < n10; ++n5) {
                    short s10 = i_Il.java_io_DataInputStream_II().readShort();
                    n4 = i_Il.java_io_DataInputStream_II().readShort();
                    short s11 = i_Il.java_io_DataInputStream_II().readShort();
                    if (IOlO.II(s10) == null) continue;
                    object2 = IOlO.II(s10);
                    object = new Il0o();
                    new Il0o().II0I = s10;
                    ((Il0o)object).var_short_IIII = ((Il0o)object2).var_short_IIII;
                    ((Il0o)object).IIOI = ((Il0o)object2).IIOI;
                    ((Il0o)object).IIOl = ((Il0o)object2).IIOl;
                    ((Il0o)object).I_0 = n4 * IOlO.IlI0;
                    ((Il0o)object).IIO = s11 * IOlO.IlI0;
                    ((Il0o)object).var_byte_III = ((Il0o)object2).var_byte_III;
                    if (IOlO.boolean_II1I(((Il0o)object).II0I)) {
                        int n11 = ((Il0o)object).I_O0 = n5 % 2 == 0 ? 0 : 2;
                        if (IOlO.l1oI == 45) {
                            ((Il0o)object).I_O0 = 0;
                        }
                    }
                    if (!Il0o.var_I_l__III.containsKey(String.valueOf(((Il0o)object).var_short_IIII))) {
                        if (IO1l.l_I0 == 1) {
                            image = IO10.IIIl(I1I1.Il("\ub7c2\ub861\ub84a\ub83a\ub82b\ub8e9\ub8c4\ub8ad\ub8a2\ub976\ub94c\ub937\ub90f\ub9e4\ub9b0", 47085) + ((Il0o)object).var_short_IIII + I1I1.Il("\ub7c3\ub87c\ub845\ub82d", 47085));
                            if (image == null) {
                                image = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                I_0O.I_0O_III().IlI_();
                                I_0_.II().III1(((Il0o)object).var_short_IIII);
                            }
                            Il0o.var_I_l__III.put(String.valueOf(((Il0o)object).var_short_IIII), image);
                        } else {
                            bl = false;
                            byte[] byArray = I_O1.II(IO1l.l_I0 + I1I1.Il("\ub78f\ub86b\ub862\ub83e\ub80c\ub8e5", 47085) + ((Il0o)object).var_short_IIII);
                            if (byArray != null) {
                                if (Il0o.var_byte_arr_IIII != null) {
                                    I_Ol.II__(I1I1.Il("\ub7be\ub861\ub84a\ub826\ub805\ub8a8\ub887\ub8aa\ub884\ub977\ub957\ub97f\ub941", 47085) + byArray.length % 127 + I1I1.Il("\ub783\ub869\ub85c\ub86a\ub83f\ub8ed\ub8d5\ub8b5\ub88c\ub96b\ub94d\ub97f\ub941", 47085) + Il0o.var_byte_arr_IIII[((Il0o)object).var_short_IIII]);
                                    if (byArray.length % 127 != Il0o.var_byte_arr_IIII[((Il0o)object).var_short_IIII]) {
                                        bl = true;
                                    }
                                }
                                if (!bl) {
                                    image = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
                                    if (image != null) {
                                        Il0o.var_I_l__III.put(String.valueOf(((Il0o)object).var_short_IIII), image);
                                    } else {
                                        bl = true;
                                    }
                                }
                            } else {
                                bl = true;
                            }
                            if (bl) {
                                image = IO10.IIIl(I1I1.Il("\ub7c2\ub861\ub84a\ub83a\ub82b\ub8e9\ub8c4\ub8ad\ub8a2\ub976\ub94c\ub937\ub90f\ub9e4\ub9b0", 47085) + ((Il0o)object).var_short_IIII + I1I1.Il("\ub7c3\ub87c\ub845\ub82d", 47085));
                                if (image == null) {
                                    image = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                    I_0_.II().III1(((Il0o)object).var_short_IIII);
                                }
                                Il0o.var_I_l__III.put(String.valueOf(((Il0o)object).var_short_IIII), image);
                            }
                        }
                        Il0o.IIIo.addElement(String.valueOf(((Il0o)object).var_short_IIII));
                    }
                    if (!Il0o.IIIO(String.valueOf(((Il0o)object).var_short_IIII))) {
                        Il0o.III0.addElement(String.valueOf(((Il0o)object).var_short_IIII));
                    }
                    IOlO.IlIO.addElement(object);
                }
                for (n5 = 0; n5 < Il0o.IIIo.size(); ++n5) {
                    object2 = (String)Il0o.IIIo.elementAt(n5);
                    if (Il0o.IIIO((String)object2)) continue;
                    Il0o.var_I_l__III.remove(object2);
                    if (Il0o.var_I_l__III.containsKey((String)object2 + I1I1.Il("\ub78f\ub860\ub84e\ub824\ub80d", 47085) + 1)) {
                        Il0o.var_I_l__III.remove((String)object2 + I1I1.Il("\ub78f\ub860\ub84e\ub824\ub80d", 47085) + 1);
                    }
                    if (Il0o.var_I_l__III.containsKey((String)object2 + I1I1.Il("\ub78f\ub860\ub84e\ub824\ub80d", 47085) + 3)) {
                        Il0o.var_I_l__III.remove((String)object2 + I1I1.Il("\ub78f\ub860\ub84e\ub824\ub80d", 47085) + 3);
                    }
                    Il0o.IIIo.removeElementAt(n5);
                    --n5;
                }
                Il0O.II_ = false;
                Il0O.IIO = 0;
                I1lI.IIIO.removeAllElements();
                Il0O.var_I_lO_IIIO.removeAllElements();
                I1ll.var_I_lO_III0.removeAllElements();
                int n12 = i_Il.java_io_DataInputStream_II().readShort();
                for (n2 = 0; n2 < n12; ++n2) {
                    object2 = i_Il.java_io_DataInputStream_II().readUTF();
                    object = i_Il.java_io_DataInputStream_II().readUTF();
                    if (((String)object2).equals(I1I1.Il("\ub788\ub86a\ub84d", 47085))) {
                        int n13;
                        if (I_1o.I1I1 > 0) continue;
                        image = I_Ol.II((String)object, I1I1.Il("\ub7c3", 47085), 0);
                        n = Integer.parseInt(image[0]);
                        int n14 = Integer.parseInt(image[1]);
                        int n15 = Integer.parseInt(image[2]);
                        int n16 = Integer.parseInt(image[3]);
                        if (((String[])image).length <= 4) {
                            n3 = -1;
                            n13 = 1;
                        } else {
                            n3 = Integer.parseInt(image[4]);
                            n13 = Integer.parseInt(image[5]);
                        }
                        I1ll i1ll = new I1ll(n, n15, n16, n14, n3, n13);
                        if (((Image)image).length > 6) {
                            i1ll.I_O0 = Integer.parseInt((String)image[6]);
                            if (((Image)image).length > 7) {
                                i1ll.I_Oo = Integer.parseInt((String)image[7]);
                                i1ll.I_0 = Integer.parseInt((String)image[8]);
                            }
                        }
                        I1lI.III(i1ll);
                        continue;
                    }
                    if (!((String)object2).equals(I1I1.Il("\ub78f\ub869\ub84d\ub82c", 47085)) || I_1o.I1I1 > 1) continue;
                    Il0O.IIO(Integer.parseInt((String)object));
                }
            }
            IOlO.l1o_ = i_Il.java_io_DataInputStream_II().readByte();
            I1I1.IIII(i_Il.java_io_DataInputStream_II().readByte());
            Ilol.var_boolean_I10I = false;
        }
        catch (Exception exception) {
            Il_1.I_0o();
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void III1(I_Il i_Il) {
        try {
            switch (i_Il.java_io_DataInputStream_II().readByte()) {
                case 4: {
                    II.var_I1o__II.I0Ol();
                    I1_I.IO_ = false;
                    I1_I.IO_I = false;
                    I1o_.II_ = true;
                    I1o_.IO0o = true;
                    I1o_.var_boolean_III1 = true;
                    I1o_.III_ = true;
                    I1o_.IOOO = true;
                    I1_I.var_byte_II_1 = i_Il.java_io_DataInputStream_II().readByte();
                    I1_I.var_byte_II__ = i_Il.java_io_DataInputStream_II().readByte();
                    I1_I.var_byte_II_O = i_Il.java_io_DataInputStream_II().readByte();
                    I1_I.var_byte_II_0 = i_Il.java_io_DataInputStream_II().readByte();
                    i_Il.java_io_DataInputStream_II().readByte();
                    I1o_ i1o_ = II.var_I1o__II;
                    if (I1o_.IOo) {
                        I_O1.III1(I1I1.Il("\ub78c\ub86f\ub848", 47085), "");
                        I_O1.III1(I1I1.Il("\ub79d\ub86d\ub858\ub839", 47085), "");
                    } else {
                        I_O1.III1(I1I1.Il("\ub798\ub87f\ub84e\ub838\ub828\ub8e7", 47085) + I_0l.l1_I, "");
                    }
                    I_Ol.II__(I1I1.Il("\ub7c7\ub826\ub801\ub860\ub843\ub8a2\ub887\ub882\ub8a4\ub950\ub962\ub962\ub937\ub9c5\ub9cd\ub9ed\ub994\ub9b3\uba55\uba00\uba79\uba2b\ubaf2\ubac4\ubaa3\uba91\ubb61\ubb12", 47085) + I1_I.var_byte_II_1 + I1I1.Il("\ub7cd\ub84f\ub847\ub823\ub80c\ub8e6\ub8d3\ub8e6", 47085) + I1_I.II1o);
                    I_Ol.II__(I1I1.Il("\ub7c7\ub826\ub801\ub860\ub843\ub8a2\ub887\ub88b\ub8a4\ub954\ub903\ub914\ub924\ub9d2\ub9cc\ub9f7\ub992\ub9b2\uba21\uba1a\uba0a\uba1d\ubae5\ubac0\ubab0\uba86\ubb33", 47085) + I1_I.var_byte_II__ + I1I1.Il("\ub7cd\ub84f\ub847\ub823\ub80c\ub8e6\ub8d3\ub8e6", 47085) + I1_I.II_);
                    I_Ol.II__(I1I1.Il("\ub7c7\ub826\ub801\ub860\ub843\ub8a2\ub887\ub895\ub8ae\ub94d\ub96f\ub90e\ub941\ub9d6\ub9da\ub9ec\ub98e\ub9b5\uba54\uba74\uba63\uba58\ubac4\ubad3\ubaa7\uba82\ubb76\ubb40\ubb71", 47085) + I1_I.var_byte_II_O + I1I1.Il("\ub7cd\ub84f\ub847\ub823\ub80c\ub8e6\ub8d3\ub8e6", 47085) + I1_I.II_I);
                    I_Ol.II__(I1I1.Il("\ub7c7\ub826\ub801\ub860\ub843\ub8a2\ub887\ub88f\ub8b1\ub941\ub96e\ub962\ub937\ub9c5\ub9cd\ub9ed\ub994\ub9b3\uba55\uba00\uba79\uba2b\ubaf2\ubac4\ubaa3\uba91\ubb61\ubb12", 47085) + I1_I.var_byte_II_0 + I1I1.Il("\ub7cd\ub84f\ub847\ub823\ub80c\ub8e6\ub8d3\ub8e6", 47085) + I1_I.var_byte_II_l);
                    if (I1_I.var_byte_II_1 != I1_I.II1o) {
                        I_Ol.II__(I1I1.Il("\ub79e\ub869\ub845\ub82e\ub849\ub8fd\ub8d7\ub8a2\ub884\ub970\ub946\ub962\ub905\ub9e1\ub9eb\ub9df", 47085));
                        I1_I.I1l1 = false;
                        I_0_.II().I0o_();
                    } else {
                        try {
                            I1o_.IO0o = false;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            I1_I.II1o = (byte)-1;
                            I_0_.II().I0o_();
                        }
                    }
                    if (I1_I.var_byte_II__ != I1_I.II_) {
                        I1_I.I1l1 = false;
                        I_0_.II().I0oO();
                    } else {
                        try {
                            if (!I1_I.I1l1) {
                                I1I1.III(new DataInputStream(new ByteArrayInputStream(I_O1.II(I1I1.Il("\ub7a3\ub85e\ub846\ub82b\ub819", 47085)))));
                            }
                            I1o_.var_boolean_III1 = false;
                        }
                        catch (Exception exception) {
                            I1_I.II_ = (byte)-1;
                            I_0_.II().I0oO();
                        }
                    }
                    if (I1_I.var_byte_II_O != I1_I.II_I) {
                        I1_I.I1l1 = false;
                        I_0_.II().III0();
                    } else {
                        try {
                            if (!I1_I.I1l1) {
                                I1I1.void_II(new DataInputStream(new ByteArrayInputStream(I_O1.II(I1I1.Il("\ub7a3\ub85e\ub858\ub821\ub800\ub8e4\ub8cb", 47085)))));
                            }
                            I1o_.III_ = false;
                        }
                        catch (Exception exception) {
                            I1_I.II_I = (byte)-1;
                            I_0_.II().III0();
                        }
                    }
                    if (I1_I.var_byte_II_0 != I1_I.var_byte_II_l) {
                        I1_I.I1l1 = false;
                        I_0_.II().IoO_();
                    } else {
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub897", 47085))));
                            this.III(dataInputStream, false);
                            dataInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub896", 47085))));
                            this.III(dataInputStream, false);
                            dataInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub895", 47085))));
                            this.III(dataInputStream, false);
                            dataInputStream = new DataInputStream(new ByteArrayInputStream(I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub896\ub8f6\ub8d5", 47085))));
                            this.III(dataInputStream, false);
                            I1o_.IOOO = false;
                        }
                        catch (Exception exception) {
                            I1_I.var_byte_II_l = (byte)-1;
                            I_0_.II().IoO_();
                        }
                    }
                    if (I1_I.var_byte_II_1 == I1_I.II1o && I1_I.var_byte_II__ == I1_I.II_ && I1_I.var_byte_II_O == I1_I.II_I && I1_I.var_byte_II_0 == I1_I.var_byte_II_l) {
                        if (!I1_I.I1l1) {
                            I1_I.I1_I_II();
                            I1_I.I01l();
                            I1_I.I1_I_II();
                            I1_I.I01();
                            I1_I.I1_I_II();
                            I1_I.I01I();
                            I1_I.I1_I_II();
                            I1_I.I011();
                        }
                        I_0_.II().IoOO();
                    }
                    byte by = i_Il.java_io_DataInputStream_II().readByte();
                    I_Ol.II__(I1I1.Il("\ub7ae\ub84d\ub87b\ub81e\ub820\ub8c7\ub8e9\ub8e6\ub8a9\ub941\ub96d\ub916\ub95c\ub9a0", 47085) + by);
                    I1_I.var_long_arr_IIIl = new long[by];
                    for (int i = 0; i < I1_I.var_long_arr_IIIl.length; ++i) {
                        I1_I.var_long_arr_IIIl[i] = i_Il.java_io_DataInputStream_II().readLong();
                    }
                    return;
                }
                default: {
                    return;
                }
                case 6: {
                    I_Ol.II__(I1I1.Il("\ub7aa\ub849\ub87f\ub86a\ub83c\ub8d8\ub8e3\ub887\ub8b1\ub941\ub97c\ub90f\ub920\ub9d0\ub9bf", 47085) + i_Il.java_io_DataInputStream_II().available() + I1I1.Il("\ub7cd\ub86e\ub852\ub83e\ub80c\ub8fb", 47085));
                    i_Il.java_io_DataInputStream_II().mark(100000);
                    I1I1.III(i_Il.java_io_DataInputStream_II());
                    i_Il.java_io_DataInputStream_II().reset();
                    byte[] byArray = new byte[i_Il.java_io_DataInputStream_II().available()];
                    i_Il.java_io_DataInputStream_II().readFully(byArray);
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub846\ub82b\ub819", 47085), byArray);
                    byArray = new byte[]{I1_I.II_};
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub846\ub82b\ub819\ub8de\ub8c2\ub8b4\ub896\ub96d\ub94c\ub92c", 47085), byArray);
                    I1o_.var_boolean_III1 = false;
                    if (I1_I.var_byte_II_1 != I1_I.II1o || I1_I.var_byte_II__ != I1_I.II_ || I1_I.var_byte_II_O != I1_I.II_I || I1_I.var_byte_II_0 != I1_I.var_byte_II_l) {
                        return;
                    }
                    I1_I.I1_I_II();
                    I1_I.I01l();
                    I1_I.I1_I_II();
                    I1_I.I01();
                    I1_I.I1_I_II();
                    I1_I.I01I();
                    I1_I.I1_I_II();
                    I1_I.I011();
                    I_0_.II().IoOO();
                    return;
                }
                case 7: {
                    I_Ol.II__(I1I1.Il("\ub7aa\ub849\ub87f\ub86a\ub83c\ub8d8\ub8e3\ub887\ub8b1\ub941\ub97c\ub911\ub92a\ub9c9\ub9d3\ub9f2\ub9fd", 47085) + i_Il.java_io_DataInputStream_II().available() + I1I1.Il("\ub7cd\ub86e\ub852\ub83e\ub80c\ub8fb", 47085));
                    i_Il.java_io_DataInputStream_II().mark(100000);
                    I1I1.void_II(i_Il.java_io_DataInputStream_II());
                    i_Il.java_io_DataInputStream_II().reset();
                    byte[] byArray = new byte[i_Il.java_io_DataInputStream_II().available()];
                    i_Il.java_io_DataInputStream_II().readFully(byArray);
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub858\ub821\ub800\ub8e4\ub8cb", 47085), byArray);
                    byArray = new byte[]{I1_I.II_I};
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub858\ub821\ub800\ub8e4\ub8cb\ub890\ub880\ub976\ub950\ub92b\ub90e\ub9ee", 47085), byArray);
                    I1o_.III_ = false;
                    if (I1_I.var_byte_II_1 != I1_I.II1o || I1_I.var_byte_II__ != I1_I.II_ || I1_I.var_byte_II_O != I1_I.II_I || I1_I.var_byte_II_0 != I1_I.var_byte_II_l) {
                        return;
                    }
                    I1_I.I1_I_II();
                    I1_I.I01l();
                    I1_I.I1_I_II();
                    I1_I.I01();
                    I1_I.I1_I_II();
                    I1_I.I01I();
                    I1_I.I1_I_II();
                    I1_I.I011();
                    I_0_.II().IoOO();
                    return;
                }
                case 8: {
                    I_Ol.II__(I1I1.Il("\ub7aa\ub849\ub87f\ub86a\ub83c\ub8d8\ub8e3\ub887\ub8b1\ub941\ub97c\ub90b\ub935\ub9c5\ub9d2\ub99e", 47085) + i_Il.java_io_DataInputStream_II().available() + I1I1.Il("\ub7cd\ub86e\ub852\ub83e\ub80c\ub8fb", 47085));
                    DataInputStream dataInputStream = i_Il.java_io_DataInputStream_II();
                    I1I1 i1I1 = this;
                    try {
                        i1I1.III(dataInputStream, true);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    return;
                }
                case 10: {
                    try {
                        Ilol.var_boolean_I10I = true;
                        I_Ol.II__(I1I1.Il("\ub7bf\ub849\ub87a\ub81f\ub82c\ub8db\ub8f3\ub8e6\ub8a8\ub945\ub973\ub962\ub935\ub9c5\ub9d2\ub9ee\ub991\ub9bd\uba4f\uba7f", 47085));
                        II.var_boolean_IIII = true;
                        IOlO.IIO = null;
                        IOlO.I1ol = null;
                        System.gc();
                        IOlO.l10_ = i_Il.java_io_DataInputStream_II().readByte();
                        IOlO.l10O = i_Il.java_io_DataInputStream_II().readByte();
                        IOlO.IIO = new int[IOlO.l10_ * IOlO.l10O];
                        I_Ol.II__(I1I1.Il("\ub7ae\ub861\ub84f\ub864\ub83b\ub8cd\ub8f6\ub893\ub8a0\ub957\ub977\ub91d\ub92c\ub9c1\ub9cf\ub9ea\ub998\ub9b1\uba4b\uba76\uba18\uba2c\ubad2\uba8b\ubae4\ubac4\ubb33\ubb12\ubb26\ubb0c\ubbc7\ubb93\ubbed", 47085) + IOlO.l10_ + I1I1.Il("\ub791", 47085) + IOlO.l10O + I1I1.Il("\ub7e7\ub82c\ub86f\ub823\ub80c\ub8e6\ub887\ub892\ub88c\ub967\ub94b\ub962\ub95c\ub9a0", 47085) + IOlO.l10_ * IOlO.l10O);
                        for (int i = 0; i < IOlO.IIO.length; ++i) {
                            int n = i_Il.java_io_DataInputStream_II().readByte();
                            if (n < 0) {
                                n += 256;
                            }
                            IOlO.IIO[i] = (char)n;
                        }
                        IOlO.I1ol = new int[IOlO.IIO.length];
                        i_Il = this.var_I_Il_II;
                        this.IIIl(i_Il);
                        try {
                            IOlO.I00l = i_Il.java_io_DataInputStream_II().readByte() != 0;
                        }
                        catch (Exception exception) {}
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    i_Il.I0Oo();
                    this.var_I_Il_II.I0Oo();
                    this.var_I_Il_II = null;
                    i_Il = null;
                    I1_I.I1_I_II().I0l_();
                    return;
                }
                case 16: {
                    I_l.II().I0l_();
                    return;
                }
                case 17: {
                    Ilol.Ilol_II();
                    Ilol.I0I();
                    return;
                }
                case 18: {
                    II.var_boolean_IIII = false;
                    II.III_();
                    new Integer(i_Il.java_io_DataInputStream_II().readInt());
                    return;
                }
                case 20: {
                    Ilol.Ilol_II().var_byte_IIIO = i_Il.java_io_DataInputStream_II().readByte();
                    I1_I.var_I1Oo_II.IIII(IO11.I_1o + I1I1.Il("\ub7cd", 47085) + Ilol.Ilol_II().var_byte_IIIO, 0);
                    return;
                }
                case 35: {
                    II.III_();
                    I1_I.I1_I_II().I01o();
                    I1_I.var_I1Oo_II.IIII(i_Il.java_io_DataInputStream_II().readUTF(), 0);
                    return;
                }
                case 36: 
            }
            I1_I.var_byte_II_o = i_Il.java_io_DataInputStream_II().readByte();
            I_Ol.II__(I1I1.Il("\ub781\ub863\ub84a\ub82e\ub849\ub8c5\ub8c2\ub8e6\ub8a4\ub967\ub957\ub92b\ub917\ub9e5\ub9a5\ub99e", 47085) + I1_I.var_byte_II_o);
        }
        catch (Exception exception) {
        }
        finally {
            if (i_Il != null) {
                i_Il.I0Oo();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void III_(I_Il i_Il) {
        try {
            switch (i_Il.java_io_DataInputStream_II().readByte()) {
                case 2: {
                    String string = i_Il.java_io_DataInputStream_II().readUTF();
                    if (I_O1.III(I1I1.Il("\ub7ac\ub868\ub846\ub823\ub807\ub8c4\ub8ce\ub8a8\ub88e", 47085)) == 1) return;
                    int n = IO10.l_lI;
                    boolean bl = true;
                    I_0l.IIo_ = string;
                    I_0l.II10(string);
                    try {
                        I_1o.I0lI = i_Il.java_io_DataInputStream_II().readByte() == 1;
                        byte by = i_Il.java_io_DataInputStream_II().readByte();
                        I_O1.IIIl(I1I1.Il("\ub7ac\ub868\ub846\ub823\ub807\ub8c4\ub8ce\ub8a8\ub88e", 47085), by);
                        return;
                    }
                    catch (Exception exception) {
                        // empty catch block
                        return;
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        finally {
            if (i_Il != null) {
                i_Il.I0Oo();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIIO(I_Il i_Il) {
        try {
            int n = i_Il.java_io_DataInputStream_II().readByte();
            I_Ol.II__(I1I1.Il("\ub79e\ub879\ub849\ub870\ub849", 47085) + n);
            switch (n) {
                case 0: {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    I_O.IlII = new I_lO("");
                    IOl1.IlI1.removeAllElements();
                    I1_I.var_I_lO_II_O.removeAllElements();
                    I1_I.var_I_lO_II_0.removeAllElements();
                    Ilol.var_java_util_Vector_II.removeAllElements();
                    I1_I.I0_O();
                    I1_I.var_Ilol_IIlI = Ilol.Ilol_II();
                    Ilol.Ilol_II().IOI_ = i_Il.java_io_DataInputStream_II().readInt();
                    Ilol.Ilol_II().IOI0 = i_Il.java_io_DataInputStream_II().readByte();
                    Ilol.Ilol_II().IOIO = i_Il.java_io_DataInputStream_II().readByte();
                    Ilol.Ilol_II().I0 = i_Il.java_io_DataInputStream_II().readShort();
                    I_Ol.II__(I1I1.Il("\ub7ae\ub864\ub84a\ub838\ub849\ub8e0\ub8c2\ub8a7\ub881\ub924\ub91e\ub962", 47085) + Ilol.Ilol_II().I0 + I1I1.Il("\ub7c6\ub827\ub800\ub861\ub842\ub8a3\ub88c\ub8ed\ub8ce\ub92f\ub908\ub969\ub94a\ub9ab\ub9b4\ub995\ub9f6\ub9d7\uba30\uba11\uba72\uba53\ubabc\uba9d\ubafe\ubadf\ubb38\ubb19\ubb7a\ubb5b\ubba4\ubb85\ubbe6", 47085));
                    Ilol.Ilol_II().IIO1 = i_Il.java_io_DataInputStream_II().readUTF();
                    Ilol.Ilol_II().var_byte_IIIO = i_Il.java_io_DataInputStream_II().readByte();
                    Ilol.Ilol_II().var_byte_III0 = i_Il.java_io_DataInputStream_II().readByte();
                    Ilol.Ilol_II().Illo = i_Il.java_io_DataInputStream_II().readLong();
                    Ilol.Ilol_II().IO10();
                    Ilol.Ilol_II().IOlO = i_Il.java_io_DataInputStream_II().readShort();
                    Ilol.Ilol_II().IOl0 = i_Il.java_io_DataInputStream_II().readShort();
                    Ilol.Ilol_II().var_I_l0_II = I1_I.var_I_l0_arr_II[i_Il.java_io_DataInputStream_II().readByte()];
                    Ilol.Ilol_II().var_I_lO_IIl.removeAllElements();
                    Ilol.Ilol_II().var_I_lO_IIlI.removeAllElements();
                    I1_I.I1_I_II().lI1I = Ilol.Ilol_II().IOl_;
                    I1_I.I1_I_II().lIlo = Ilol.Ilol_II().IOl1;
                    byte by = i_Il.java_io_DataInputStream_II().readByte();
                    for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                        I1I1.II(I_o_.II(i_Il.java_io_DataInputStream_II().readShort()));
                    }
                    I1_I.I1_I_II();
                    I1_I.I0_1();
                    I1_I.I1_I_II();
                    Ilol.Ilol_II().Il11 = i_Il.java_io_DataInputStream_II().readLong();
                    Ilol.Ilol_II().IO_I = i_Il.java_io_DataInputStream_II().readInt();
                    Ilol.Ilol_II().IO_ = i_Il.java_io_DataInputStream_II().readInt();
                    Ilol.Ilol_II().var_java_lang_String_IIO = IO10.IIIO(Ilol.Ilol_II().Il11);
                    Ilol.Ilol_II().var_java_lang_String_IIOI = IO10.IIIO(Ilol.Ilol_II().IO_);
                    Ilol.Ilol_II().var_java_lang_String_IIOl = IO10.IIIO(Ilol.Ilol_II().IO_I);
                    Ilol.Ilol_II().var_I101_arr_IIII = new I101[i_Il.java_io_DataInputStream_II().readByte()];
                    try {
                        Ilol.Ilol_II().IO01();
                        for (n7 = 0; n7 < Ilol.Ilol_II().var_I101_arr_IIII.length; ++n7) {
                            n6 = i_Il.java_io_DataInputStream_II().readShort();
                            if (n6 == -1) continue;
                            I1o i1o = I1oI.II((short)n6);
                            byte by3 = i1o.II0l;
                            Ilol.Ilol_II().var_I101_arr_IIII[n7] = new I101();
                            Ilol.Ilol_II().var_I101_arr_IIII[n7].var_I1o_II = i1o;
                            Ilol.Ilol_II().var_I101_arr_IIII[n7].I1l1 = i_Il.java_io_DataInputStream_II().readInt();
                            Ilol.Ilol_II();
                            i_Il.java_io_DataInputStream_II().readUTF();
                            Ilol.Ilol_II();
                            i_Il.java_io_DataInputStream_II().readUTF();
                            n5 = i_Il.java_io_DataInputStream_II().readUnsignedByte();
                            I_Ol.II__(I1I1.Il("\ub782\ub87c\ub85f\ub823\ub806\ub8e6\ub887\ub8b5\ub88c\ub97e\ub946\ub97f\ub941", 47085) + n5);
                            if (n5 != 0) {
                                Ilol.Ilol_II().var_I101_arr_IIII[n7].var_I100_arr_III = new I100[n5];
                                for (n4 = 0; n4 < Ilol.Ilol_II().var_I101_arr_IIII[n7].var_I100_arr_III.length; ++n4) {
                                    int n8 = i_Il.java_io_DataInputStream_II().readUnsignedByte();
                                    n5 = i_Il.java_io_DataInputStream_II().readUnsignedShort();
                                    if (n8 == -1) continue;
                                    Ilol.Ilol_II().var_I101_arr_IIII[n7].var_I100_arr_III[n4] = new I100(n8, n5);
                                }
                            }
                            if (by3 == 0) {
                                I_Ol.II__(I1I1.Il("\ub799\ub863\ub842\ub86a\ub80d\ub8e9\ub8de\ub8e6\ub8d8\ub939\ub91e\ub97f\ub95c\ub9bd\ub9a2\ub983\ub9e0\ub9c1\uba26\uba07\uba64\uba45\ubaaa\uba8b\ubae8\ubac9\ubb2e\ubb0f\ubb6c\ubb4d\ubbb2\ubb93\ubbf0\ubbd1\ubc36\ubc17\ubc74\ubc55\ubcba\ubc9b\ubcf8\ubcd9\ubd3e\ubd1f\ubd7c\ubd5d\ubd42", 47085) + Ilol.Ilol_II().I0II);
                                Ilol.Ilol_II().I0II = Ilol.Ilol_II().var_I101_arr_IIII[n7].var_I1o_II.II_0;
                                continue;
                            }
                            if (by3 != 1) continue;
                            Ilol.Ilol_II().I0I = Ilol.Ilol_II().var_I101_arr_IIII[n7].var_I1o_II.II_0;
                            I_Ol.II__(I1I1.Il("\ub799\ub863\ub842\ub86a\ub80d\ub8e9\ub8de\ub8e6\ub8d8\ub939\ub91e\ub97f\ub95c\ub9bd\ub9a2\ub983\ub9e0\ub9c1\uba26\uba07\uba64\uba45\ubaaa\uba8b\ubae8\ubac9\ubb2e\ubb0f\ubb6c\ubb4d\ubbb2\ubb93\ubbf0\ubbd1\ubc36\ubc17\ubc74\ubc55\ubcba\ubc9b\ubcf8\ubcd9\ubd3e\ubd1f\ubd7c\ubd5d\ubd42", 47085) + Ilol.Ilol_II().I0I);
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    Ilol.Ilol_II().var_I101_arr_II = new I101[i_Il.java_io_DataInputStream_II().readByte()];
                    I1_I.Io_0 = 0;
                    for (n7 = 0; n7 < Ilol.Ilol_II().var_I101_arr_II.length; ++n7) {
                        n6 = i_Il.java_io_DataInputStream_II().readShort();
                        if (n6 == -1) continue;
                        Ilol.Ilol_II().var_I101_arr_II[n7] = new I101();
                        Ilol.Ilol_II().var_I101_arr_II[n7].var_I1o_II = I1oI.II((short)n6);
                        Ilol.Ilol_II().var_I101_arr_II[n7].I1l1 = i_Il.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II();
                        i_Il.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II();
                        i_Il.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II().var_I101_arr_II[n7].lIO_ = n7;
                        byte by4 = i_Il.java_io_DataInputStream_II().readByte();
                        if (by4 != 0) {
                            Ilol.Ilol_II().var_I101_arr_II[n7].var_I100_arr_III = new I100[by4];
                            for (n3 = 0; n3 < Ilol.Ilol_II().var_I101_arr_II[n7].var_I100_arr_III.length; ++n3) {
                                n5 = i_Il.java_io_DataInputStream_II().readUnsignedByte();
                                n4 = i_Il.java_io_DataInputStream_II().readUnsignedShort();
                                if (n5 == -1) continue;
                                Ilol.Ilol_II().var_I101_arr_II[n7].var_I100_arr_III[n3] = new I100(n5, n4);
                                Ilol.Ilol_II().var_I101_arr_II[n7].IIl1();
                            }
                        }
                        if (Ilol.Ilol_II().var_I101_arr_II[n7].var_I1o_II.II0l != 6) continue;
                        I1_I.Io_0 += Ilol.Ilol_II().var_I101_arr_II[n7].I1l1;
                    }
                    Ilol.Ilol_II().var_I101_arr_III = new I101[i_Il.java_io_DataInputStream_II().readByte()];
                    II.var_I_1o_II.ll_o = 0;
                    for (n7 = 0; n7 < Ilol.Ilol_II().var_I101_arr_III.length; ++n7) {
                        n6 = i_Il.java_io_DataInputStream_II().readShort();
                        if (n6 == -1) continue;
                        Ilol.Ilol_II().var_I101_arr_III[n7] = new I101();
                        Ilol.Ilol_II().var_I101_arr_III[n7].var_I1o_II = I1oI.II((short)n6);
                        Ilol.Ilol_II().var_I101_arr_III[n7].I1l1 = i_Il.java_io_DataInputStream_II().readInt();
                        Ilol.Ilol_II();
                        i_Il.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II();
                        i_Il.java_io_DataInputStream_II().readUTF();
                        Ilol.Ilol_II().var_I101_arr_III[n7].var_I100_arr_III = new I100[i_Il.java_io_DataInputStream_II().readByte()];
                        for (n2 = 0; n2 < Ilol.Ilol_II().var_I101_arr_III[n7].var_I100_arr_III.length; ++n2) {
                            n3 = i_Il.java_io_DataInputStream_II().readUnsignedByte();
                            n5 = i_Il.java_io_DataInputStream_II().readUnsignedShort();
                            if (n3 == -1) continue;
                            Ilol.Ilol_II().var_I101_arr_III[n7].var_I100_arr_III[n2] = new I100(n3, n5);
                            Ilol.Ilol_II().var_I101_arr_III[n7].IIl1();
                        }
                        ++II.var_I_1o_II.ll_o;
                    }
                    Ilol.Ilol_II().IOIl = 4;
                    I_O1.III(Ilol.Ilol_II().IIO1 + I1I1.Il("\ub79b\ub86f\ub842", 47085));
                    n6 = i_Il.java_io_DataInputStream_II().readShort();
                    Ilol.var_short_arr_III = new short[n6];
                    Ilol.var_short_arr_IIII = new short[n6];
                    for (n2 = 0; n2 < n6; ++n2) {
                        Ilol.var_short_arr_III[n2] = i_Il.java_io_DataInputStream_II().readShort();
                        Ilol.var_short_arr_IIII[n2] = i_Il.java_io_DataInputStream_II().readShort();
                    }
                    I1_I.var_I1Oo_II.III1[Ilol.Ilol_II().IOIO][0] = i_Il.java_io_DataInputStream_II().readShort();
                    I1_I.var_I1Oo_II.III1[Ilol.Ilol_II().IOIO][1] = i_Il.java_io_DataInputStream_II().readShort();
                    I1_I.var_I1Oo_II.III1[Ilol.Ilol_II().IOIO][2] = i_Il.java_io_DataInputStream_II().readShort();
                    Ilol.Ilol_II().I11l = i_Il.java_io_DataInputStream_II().readByte() == 1;
                    I1_I.var_long_Il0l = IO10.IIII() - (long)i_Il.java_io_DataInputStream_II().readInt() * 1000L;
                    I1_I.var_byte_IIOl = i_Il.java_io_DataInputStream_II().readByte();
                    I_Ol.II__(I1I1.Il("\ub789\ub869\ub847\ub83e\ub808\ub8a8\ub8d3\ub8af\ub888\ub961\ub91e\ub962", 47085) + I1_I.var_long_Il0l);
                    I_0_ i_0_ = I_0_.II();
                    by = (byte)Ilol.Ilol_II().IOIO;
                    I_0_ i_0_2 = i_0_;
                    I_Il i_Il2 = null;
                    try {
                        i_Il2 = new I_Il(-41);
                        i_Il2.java_io_DataOutputStream_II().writeByte(by);
                        i_0_2.var_I1_o_II.IIlO(i_Il2);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    finally {
                        i_Il2.I0Oo();
                    }
                    i_0_2 = I_0_.II();
                    try {
                        Ilol.Ilol_II().var_short_IIlo = i_Il.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_II().var_short_II1 = i_Il.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_short_II1I = i_Il.java_io_DataInputStream_II().readShort();
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                case 1: {
                    Ilol.Ilol_II().var_I_l0_II = I1_I.var_I_l0_arr_II[i_Il.java_io_DataInputStream_II().readByte()];
                    Ilol.Ilol_II().Il1I = i_Il.java_io_DataInputStream_II().readLong();
                    Ilol.Ilol_II().var_I_lO_IIl.removeAllElements();
                    Ilol.Ilol_II().var_I_lO_IIlI.removeAllElements();
                    Ilol.Ilol_II().var_I_0o_II = null;
                    return;
                }
                case 2: {
                    if (Ilol.Ilol_II().IOIl != 14 && Ilol.Ilol_II().IOIl != 5) {
                        Ilol.Ilol_II().IOl_ = Ilol.Ilol_II().IOlo;
                        Ilol.Ilol_II().IOl1 = Ilol.Ilol_II().IO1;
                    }
                    Ilol.Ilol_II().var_I_lO_IIl.removeAllElements();
                    Ilol.Ilol_II().var_I_lO_IIlI.removeAllElements();
                    byte by = i_Il.java_io_DataInputStream_II().readByte();
                    for (byte by5 = 0; by5 < by; by5 = (byte)(by5 + 1)) {
                        short s = i_Il.java_io_DataInputStream_II().readShort();
                        I_Ol.II__(I1I1.Il("\ub79e\ub867\ub842\ub82e\ub80d\ub8a8\ub8ce\ub8a2\ub8c5\ub969\ub95a\ub962\ub941\ub9e3\ub9f7\ub9df\ub9af\ub9c1\uba3b", 47085) + s);
                        I1I1.II(I_o_.II(s));
                    }
                    I1_I.I1_I_II();
                    I1_I.I0_1();
                    return;
                }
                default: {
                    return;
                }
                case 4: {
                    Ilol.Ilol_II().Il11 = i_Il.java_io_DataInputStream_II().readLong();
                    Ilol.Ilol_II().IO_ = i_Il.java_io_DataInputStream_II().readInt();
                    Ilol.Ilol_II().IOl_ = i_Il.II_I();
                    Ilol.Ilol_II().IOl1 = i_Il.II_I();
                    Ilol.Ilol_II().IO_I = i_Il.java_io_DataInputStream_II().readInt();
                    Ilol.Ilol_II().var_java_lang_String_IIO = IO10.IIIO(Ilol.Ilol_II().Il11);
                    Ilol.Ilol_II().var_java_lang_String_IIOI = IO10.IIIO(Ilol.Ilol_II().IO_);
                    Ilol.Ilol_II().var_java_lang_String_IIOl = IO10.IIIO(Ilol.Ilol_II().IO_I);
                    return;
                }
                case 5: {
                    int n9 = Ilol.Ilol_II().IOl_;
                    Ilol.Ilol_II().IOl_ = i_Il.II_I();
                    I_Ol.II__(I1I1.Il("\ub785\ub87c\ub84c\ub825\ub80a\ub8a8\ub887\ub8fb", 47085) + Ilol.Ilol_II().I0_O + I1I1.Il("\ub7cd\ub864\ub85b\ub86a\ub80f\ub8fd\ub8cb\ub8aa\ub8d8\ub924", 47085) + Ilol.Ilol_II().IOlo);
                    if (Ilol.Ilol_II().IOl_ > n9 && Ilol.Ilol_II().var_byte_III0 != 4) {
                        I1_I.II(I1I1.Il("\ub7c6", 47085) + (Ilol.Ilol_II().IOl_ - n9) + I1I1.Il("\ub7cd", 47085) + IO11.IoIO, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11 - 20, 0, -1, 9);
                        IO.II();
                        if (Ilol.Ilol_II().var_I__I_II != null && Ilol.Ilol_II().var_I__I_II.II1o == 5003) {
                            I_lI.II(Ilol.Ilol_II().var_I__I_II.IIO1 + (Ilol.Ilol_II().var_I__I_II.I_O0 == 1 ? 10 : -10), Ilol.Ilol_II().var_I__I_II.IIO + 10, true, -1, -1, Ilol.Ilol_II(), 29);
                        }
                    }
                    if (Ilol.Ilol_II().IOl_ < n9) {
                        I1_I.II(I1I1.Il("\ub7c0", 47085) + (n9 - Ilol.Ilol_II().IOl_) + I1I1.Il("\ub7cd", 47085) + IO11.IoIO, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11 - 20, 0, -1, 9);
                    }
                    I_Ol.II__(I1I1.Il("\ub78e\ub879\ub859\ub838\ub849\ub8c0\ub8f7\ub8fb\ub8c5", 47085) + Ilol.Ilol_II().IOl_);
                    I1_I.I1_I_II().lI1I = Ilol.Ilol_II().IOl_;
                    return;
                }
                case 6: {
                    int n10 = Ilol.Ilol_II().IOl1;
                    Ilol.Ilol_II().IOl1 = i_Il.II_I();
                    if (Ilol.Ilol_II().IOl1 > n10) {
                        I1_I.II(I1I1.Il("\ub7c6", 47085) + (Ilol.Ilol_II().IOl1 - n10) + I1I1.Il("\ub7cd", 47085) + IO11.var_java_lang_String_IIOo, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11 - 23, 0, -2, 10);
                        IO.II();
                        if (Ilol.Ilol_II().var_I__I_II != null && Ilol.Ilol_II().var_I__I_II.II1o == 5001) {
                            I_lI.II(Ilol.Ilol_II().var_I__I_II.IIO1 + (Ilol.Ilol_II().var_I__I_II.I_O0 == 1 ? 10 : -10), Ilol.Ilol_II().var_I__I_II.IIO + 10, true, -1, -1, Ilol.Ilol_II(), 29);
                        }
                    }
                    if (Ilol.Ilol_II().IOl1 < n10) {
                        I1_I.II(I1I1.Il("\ub7c0", 47085) + (n10 - Ilol.Ilol_II().IOl1) + I1I1.Il("\ub7cd", 47085) + IO11.var_java_lang_String_IIOo, Ilol.Ilol_II().I_o_, Ilol.Ilol_II().I_oO - Ilol.Ilol_II().IO11 - 23, 0, -2, 10);
                    }
                    I_Ol.II__(I1I1.Il("\ub78e\ub879\ub859\ub838\ub849\ub8c5\ub8f7\ub8fb\ub8c5", 47085) + Ilol.Ilol_II().IOl1);
                    I1_I.I1_I_II().lIlo = Ilol.Ilol_II().IOl1;
                    return;
                }
                case 7: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) {
                        return;
                    }
                    ilol.IO1I = i_Il.java_io_DataInputStream_II().readInt();
                    if (ilol.IO1I == -2) {
                        ilol.I_Il = true;
                    }
                    I1I1.II(ilol, i_Il);
                    try {
                        ilol.var_short_IIlo = i_Il.java_io_DataInputStream_II().readShort();
                        ilol.var_short_II1 = i_Il.java_io_DataInputStream_II().readByte();
                        ilol.var_short_II1I = i_Il.java_io_DataInputStream_II().readShort();
                        if (ilol.I0Il >= 201) {
                            I1ll i1ll = new I1ll(ilol.I0Il, ilol, 2, -1, 10, 1);
                            new I1ll(ilol.I0Il, ilol, 2, -1, 10, 1).I_O0 = 5;
                            ilol.II(i1ll);
                            return;
                        } else {
                            ilol.IIl(0, 201);
                        }
                        return;
                    }
                    catch (Exception exception) {
                        if (i_Il == null) return;
                        i_Il.I0Oo();
                        return;
                    }
                }
                case 8: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) return;
                    ilol.IOIo = i_Il.java_io_DataInputStream_II().readInt();
                    return;
                }
                case 9: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) return;
                    ilol.IOl_ = i_Il.II_I();
                    ilol.IOlo = i_Il.II_I();
                    return;
                }
                case 10: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) return;
                    ilol.IOl_ = i_Il.II_I();
                    ilol.IOlo = i_Il.II_I();
                    ilol.IOlO = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.IOl0 = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.I0I1 = i_Il.java_io_DataInputStream_II().readShort();
                    if (ilol.I0I1 != -1) return;
                    ilol.IO0_();
                    return;
                }
                case 11: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) {
                        return;
                    }
                    ilol.IOl_ = i_Il.II_I();
                    ilol.IOlo = i_Il.II_I();
                    ilol.IOlO = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.IOl0 = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.I0II = i_Il.java_io_DataInputStream_II().readShort();
                    if (ilol.I0II != -1) return;
                    ilol.IO0O();
                    return;
                }
                case 12: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) {
                        return;
                    }
                    ilol.IOl_ = i_Il.II_I();
                    ilol.IOlo = i_Il.II_I();
                    ilol.IOlO = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.IOl0 = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.I0I = i_Il.java_io_DataInputStream_II().readShort();
                    if (ilol.I0I != -1) return;
                    ilol.IO00();
                    return;
                }
                case 13: {
                    int n11 = i_Il.java_io_DataInputStream_II().readInt();
                    Ilol ilol = n11 == Ilol.Ilol_II().IOI_ ? Ilol.Ilol_II() : I1_I.Ilol_II(n11);
                    if (ilol == null) {
                        return;
                    }
                    ilol.IOl_ = i_Il.II_I();
                    ilol.IOlo = i_Il.II_I();
                    ilol.IOlO = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.IOl0 = i_Il.java_io_DataInputStream_II().readShort();
                    return;
                }
                case 14: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) return;
                    ilol.IOl_ = i_Il.II_I();
                    byte by = i_Il.java_io_DataInputStream_II().readByte();
                    if (by == 1) {
                        I_0.II(11, ilol, 5);
                        I_0.II(104, ilol, 4);
                    }
                    if (by == 2) {
                        ilol.IOoo();
                    }
                    try {
                        ilol.IOlo = i_Il.II_I();
                        return;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    return;
                }
                case 15: {
                    Ilol ilol = I1_I.Ilol_II(i_Il.java_io_DataInputStream_II().readInt());
                    if (ilol == null) {
                        return;
                    }
                    ilol.IOl_ = i_Il.II_I();
                    ilol.IOlo = i_Il.II_I();
                    ilol.I_o_ = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.I_oO = i_Il.java_io_DataInputStream_II().readShort();
                    ilol.IOIl = 1;
                    ilol.IOII = 0;
                    I_0.II(109, ilol, 2);
                    return;
                }
                case 19: {
                    Ilol.Ilol_II().IO_();
                    return;
                }
                case 23: {
                    short s = i_Il.java_io_DataInputStream_II().readShort();
                    I_0o i_0o = I_o_.II(s);
                    I1I1.II(i_0o);
                    if (s == 0 || s == 14 || s == 28) return;
                    I1_I.var_I1Oo_II.IIII(IO11.I__1 + I1I1.Il("\ub7cd", 47085) + i_0o.II.II1o, 0);
                    return;
                }
                case 35: {
                    int n12 = i_Il.java_io_DataInputStream_II().readInt();
                    I_Ol.II__(I1I1.Il("\ub7ae\ub845\ub86f\ub86a\ub854\ub8a8", 47085) + n12);
                    if (IOlO.l1oI == 130) {
                        I1_I.I1_I_II().I0__();
                    }
                    if (n12 == Ilol.Ilol_II().IOI_) {
                        Ilol.Ilol_II().var_byte_III0 = i_Il.java_io_DataInputStream_II().readByte();
                        if (I1_I.I1_I_II().IIo_() && Ilol.Ilol_II().var_byte_III0 != 0) {
                            I1_I.I1_I_II().I0__();
                        }
                        I_Ol.II__(I1I1.Il("\ub799\ub875\ub85b\ub82f\ub849\ub8f8\ub8cc\ub8fb\ub8c5", 47085) + Ilol.Ilol_II().var_byte_III0);
                        Ilol.Ilol_II().var_I_11_II = null;
                        I1_I.I1_I_II();
                        if (!I1_I.IIIl(Ilol.Ilol_II().var_I_I__IIII)) {
                            Ilol.Ilol_II().var_I_I__IIII = null;
                        }
                        Ilol.Ilol_II().var_I10__II = null;
                    } else {
                        Ilol ilol = I1_I.Ilol_II(n12);
                        if (ilol != null) {
                            I_Ol.II__(I1I1.Il("\ub799\ub875\ub85b\ub82f\ub849\ub8f8\ub8cc\ub8fb\ub8c5", 47085) + ilol.var_byte_III0);
                            ilol.var_byte_III0 = i_Il.java_io_DataInputStream_II().readByte();
                            if (ilol.II01()) {
                                Ilol.Ilol_II().var_Ilol_IIIl = ilol;
                            }
                        }
                    }
                    for (int i = 0; i < I1_I.var_I_lO_II_O.size(); ++i) {
                        Ilol ilol = I1_I.Ilol_II(i);
                        if (ilol == null || ilol.var_byte_III0 == 0 || ilol.var_byte_III0 != Ilol.Ilol_II().var_byte_III0) {
                            continue;
                        }
                        if (!Ilol.Ilol_II().var_I_I__IIII.I0I1) {
                            Ilol.Ilol_II().var_I_I__IIII = null;
                        }
                        Ilol.Ilol_II().var_I_11_II = null;
                        Ilol.Ilol_II().var_I10__II = null;
                        break;
                    }
                    I_Ol.II__(I1I1.Il("\ub798\ub87c\ub84f\ub82b\ub81d\ub8ed\ub887\ub8b2\ub89c\ub974\ub946\ub962\ub911\ub9eb\ub9a2\ub99e", 47085));
                    return;
                }
                case 61: {
                    String string = i_Il.java_io_DataInputStream_II().readUTF();
                    byte[] byArray = new byte[i_Il.java_io_DataInputStream_II().readInt()];
                    i_Il.java_io_DataInputStream_II().read(byArray);
                    if (byArray.length == 0) {
                        byArray = null;
                    }
                    if (string.equals(I1I1.Il("\ub7a6\ub85f\ub840\ub823\ub805\ub8e4", 47085))) {
                        I1_I.I1_I_II().III(byArray);
                        return;
                    }
                    if (string.equals(I1I1.Il("\ub7a2\ub85f\ub840\ub823\ub805\ub8e4", 47085))) {
                        I1_I.I1_I_II().II(byArray);
                        return;
                    }
                    if (!string.equals(I1I1.Il("\ub7ae\ub85f\ub840\ub823\ub805\ub8e4", 47085))) {
                        return;
                    }
                    I1_I.I1_I_II().IIII(byArray);
                    return;
                }
                case 62: {
                    I_Ol.II__(I1I1.Il("\ub7a0\ub849\ub80b\ub81f\ub839\ub8cc\ub8e6\ub892\ub8a0\ub924\ub970\ub909\ub928\ub9cc\ub9d3", 47085));
                    I1I1.IIlI(i_Il);
                    return;
                }
                case 63: {
                    n = i_Il.java_io_DataInputStream_II().readByte();
                    if (n <= 0) {
                        return;
                    }
                    II.var_I_1o_II.var_I_lO_IIoo.removeAllElements();
                    I1OO.IIl1();
                    I_lO i_lO = II.var_I_1o_II.IIo;
                    for (int i = 0; i < n; ++i) {
                        String string = i_Il.java_io_DataInputStream_II().readUTF();
                        String string2 = i_Il.java_io_DataInputStream_II().readUTF();
                        short s = i_Il.java_io_DataInputStream_II().readShort();
                        II.var_I_1o_II.var_I_lO_IIoo.addElement(String.valueOf(s));
                        Ilol.Ilol_II().var_Ilol_IIIl.var_int_I10 = s;
                        I1Il i1Il = new I1Il(string, 11115, Ilol.Ilol_II().var_Ilol_IIIl);
                        new I1Il(string, 11115, Ilol.Ilol_II().var_Ilol_IIIl).IIo0 = string2;
                        i_lO.addElement(i1Il);
                    }
                    I1OO.I__o();
                    II.var_I_1o_II.IOlO();
                    return;
                }
                case 100: {
                    try {
                        Ilol.Ilol_II().var_short_IIlo = i_Il.java_io_DataInputStream_II().readShort();
                        Ilol.Ilol_II().var_short_II1 = i_Il.java_io_DataInputStream_II().readByte();
                        Ilol.Ilol_II().var_short_II1I = i_Il.java_io_DataInputStream_II().readShort();
                        return;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    return;
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        finally {
            if (i_Il != null) {
                i_Il.I0Oo();
            }
        }
    }

    private static void II(I_0o i_0o) {
        if (Ilol.Ilol_II().var_I_0o_II == null) {
            Ilol.Ilol_II().var_I_0o_II = i_0o;
        } else if (i_0o.II.equals(Ilol.Ilol_II().var_I_0o_II.II)) {
            Ilol.Ilol_II().var_I_0o_II = i_0o;
        }
        Ilol.Ilol_II().var_I_lO_IIl.addElement(i_0o);
        if ((i_0o.II.IoI_ == 1 || i_0o.II.IoI_ == 4 || i_0o.II.IoI_ == 2 || i_0o.II.IoI_ == 3) && (i_0o.II.l1OI == 0 || i_0o.II.l1OI > 0 && i_0o.l1__ > 0)) {
            if (i_0o.II.IlIO == Ilol.Ilol_II().IO_1) {
                I_0_.II().IIo(Ilol.Ilol_II().IO_1);
            }
            Ilol.Ilol_II().var_I_lO_IIlI.addElement(i_0o);
        }
    }

    private static boolean II(Ilol ilol, I_Il i_Il) {
        try {
            ilol.var_int_I10_ = i_Il.java_io_DataInputStream_II().readByte();
            ilol.I1_1 = i_Il.java_io_DataInputStream_II().readBoolean();
            ilol.var_byte_III0 = i_Il.java_io_DataInputStream_II().readByte();
            I_Ol.II__(I1I1.Il("\ub7ac\ub848\ub86f\ub86a\ub83d\ub8d1\ub8f7\ub883\ub8c5\ub954\ub968\ub97f\ub941", 47085) + ilol.var_byte_III0 + I1I1.Il("\ub7cd\ub878\ub844\ub86a\ub819\ub8e4\ub8c6\ub8bf\ub880\ub976\ub903", 47085) + ilol.IOI_);
            ilol.var_I_l0_II = I1_I.var_I_l0_arr_II[i_Il.java_io_DataInputStream_II().readByte()];
            ilol.IOIO = i_Il.java_io_DataInputStream_II().readByte();
            ilol.I0 = i_Il.java_io_DataInputStream_II().readShort();
            ilol.IIO1 = i_Il.java_io_DataInputStream_II().readUTF();
            ilol.I0OO = ilol.IOl_ = i_Il.II_I();
            if (ilol.IOl_ == 0) {
                ilol.IOIl = 14;
            }
            ilol.IOlo = i_Il.II_I();
            if (ilol.I_oO >= IOlO.l10o - 100) {
                ilol.I1_o = true;
            }
            ilol.I0II = i_Il.java_io_DataInputStream_II().readShort();
            ilol.I0I = i_Il.java_io_DataInputStream_II().readShort();
            ilol.I0Il = i_Il.java_io_DataInputStream_II().readUnsignedByte();
            I_Ol.II__(I1I1.Il("\ub7cd\ub86e\ub844\ub82e\ub810\ub8b5\ub887", 47085) + ilol.I0II + I1I1.Il("\ub7cd\ub860\ub84e\ub82d\ub854\ub8a8", 47085) + ilol.I0I + I1I1.Il("\ub7cd\ub86e\ub84a\ub82d\ub854", 47085) + ilol.I0Il + I1I1.Il("\ub7af\ub84d\ub86c\ub86a\ub854\ub8b5", 47085) + ilol.I0Il + I1I1.Il("\ub7c7\ub826\ub801\ub860\ub843\ub8a2\ub88d\ub8ec\ub8cf\ub92e\ub909\ub968\ub94b\ub9aa\ub9b5\ub994\ub9f7\ub9d6\uba31\uba10\uba73\uba52\ubabd\uba9c\ubaff\ubade\ubb39\ubb18\ubb7b\ubb5a\ubba5\ubb84\ubbe7", 47085));
            ilol.I1__ = true;
            i_Il.java_io_DataInputStream_II().readByte();
            if (ilol.I0I1 == -1) {
                ilol.IO0_();
            }
            if (ilol.I0II == -1) {
                ilol.IO0O();
            }
            if (ilol.I0I == -1) {
                ilol.IO00();
            }
            I_Ol.II__(I1I1.Il("\ub7dc", 47085));
            ilol.I_o_ = i_Il.java_io_DataInputStream_II().readShort();
            ilol.I_oO = i_Il.java_io_DataInputStream_II().readShort();
            ilol.I010 = ilol.I_o_;
            ilol.I01o = ilol.I_oO;
            ilol.IOlO = i_Il.java_io_DataInputStream_II().readShort();
            ilol.IOl0 = i_Il.java_io_DataInputStream_II().readShort();
            int n = i_Il.java_io_DataInputStream_II().readByte();
            for (int i = 0; i < n; ++i) {
                I1l_ i1l_ = new I1l_(i_Il.java_io_DataInputStream_II().readByte(), i_Il.java_io_DataInputStream_II().readInt(), i_Il.java_io_DataInputStream_II().readInt(), i_Il.java_io_DataInputStream_II().readShort());
                ilol.var_I_lO_IIll.addElement(i1l_);
            }
            I_Ol.II__(I1I1.Il("\ub7ae\ub863\ub845\ub83e\ub81b\ub8e7\ub8cb\ub8aa\ub880\ub976\ub903\ub930\ub904\ub9e1\ub9fb\ub9fd\ub9b5\ub99d\uba69\uba73\uba37\uba1e\ubaf8\uba96\ubab7\uba9b\ubb77\ubb4b\ubb6b\ubb50\ubbed\ubbc1\ubba9\ubb95\ubc77\ubc46\ubc2c\ubc0f\ubcfb\ubcc4\ubca4\ubc83\ubd23", 47085) + ilol.I0II + ilol.I0I + ilol.I0Il);
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    private void III0(I_Il i_Il) {
        try {
            String string = i_Il.java_io_DataInputStream_II().readUTF();
            byte by = i_Il.java_io_DataInputStream_II().readByte();
            byte[] byArray = I_1l.II(i_Il);
            Image image = I1I1.II(byArray);
            I1O1.II(string, image, by);
            if (byArray != null) {
                I1O1.II(string, by, byArray);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void III(DataInputStream dataInputStream, boolean bl) {
        try {
            dataInputStream.mark(100000);
            I1_I.var_byte_II_l = dataInputStream.readByte();
            byte by = dataInputStream.readByte();
            if (by == 0) {
                I1_I.I1_I_II().var_I10o_arr_II = new I10o[dataInputStream.readUnsignedByte()];
                for (int i = 0; i < I1_I.I1_I_II().var_I10o_arr_II.length; ++i) {
                    I1_I.I1_I_II().var_I10o_arr_II[i] = new I10o();
                    I1_I.I1_I_II().var_I10o_arr_II[i].I1l = i;
                    I1_I.I1_I_II().var_I10o_arr_II[i].II1o = dataInputStream.readUTF();
                    I1_I.I1_I_II();
                    dataInputStream.readByte();
                }
                if (bl) {
                    dataInputStream.reset();
                    byte[] byArray = new byte[dataInputStream.available()];
                    dataInputStream.readFully(byArray);
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub897", 47085), byArray);
                    return;
                }
            } else if (by == 1) {
                I1oI.III_.clear();
                int n = dataInputStream.readShort();
                for (int i = 0; i < n; ++i) {
                    I1oI.II(new I1o((short)i, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readInt(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean()));
                }
                if (bl) {
                    dataInputStream.reset();
                    byte[] byArray = new byte[dataInputStream.available()];
                    dataInputStream.readFully(byArray);
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub896", 47085), byArray);
                    return;
                }
            } else if (by == 2) {
                int n = dataInputStream.readShort();
                short s = dataInputStream.readShort();
                for (int i = n; i < s; ++i) {
                    I1oI.II(new I1o((short)i, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readInt(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean()));
                }
                if (bl) {
                    dataInputStream.reset();
                    byte[] byArray = new byte[dataInputStream.available()];
                    dataInputStream.readFully(byArray);
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub895", 47085), byArray);
                    byte[] byArray2 = new byte[]{I1_I.var_byte_II_l};
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub8f1\ub8a3\ub897\ub977\ub94a\ub92d\ub90f", 47085), byArray2);
                    I1o_.IOOO = false;
                    if (I1_I.var_byte_II_1 == I1_I.II1o && I1_I.var_byte_II__ == I1_I.II_ && I1_I.var_byte_II_O == I1_I.II_I && I1_I.var_byte_II_0 == I1_I.var_byte_II_l) {
                        I1_I.I1_I_II();
                        I1_I.I01l();
                        I1_I.I1_I_II();
                        I1_I.I01();
                        I1_I.I1_I_II();
                        I1_I.I01I();
                        I1_I.I1_I_II();
                        I1_I.I011();
                        I_0_.II().IoOO();
                        return;
                    }
                }
            } else if (by == 100) {
                Ilol.var_int_arr_arr_II = I1I1.int_arr_arr_II(dataInputStream);
                if (bl) {
                    dataInputStream.reset();
                    byte[] byArray = new byte[dataInputStream.available()];
                    dataInputStream.readFully(byArray);
                    I_O1.II(I1I1.Il("\ub7a3\ub85e\ub842\ub83e\ub80c\ub8e5\ub896\ub8f6\ub8d5", 47085), byArray);
                    return;
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void III(I_Il i_Il, int n) {
        try {
            int n2 = i_Il.java_io_DataInputStream_II().readByte();
            int[][] nArrayArray = new int[n2][];
            for (int i = 0; i < n2; ++i) {
                int n3 = i_Il.java_io_DataInputStream_II().readByte();
                nArrayArray[i] = new int[n3];
                for (int j = 0; j < n3; ++j) {
                    nArrayArray[i][j] = i_Il.java_io_DataInputStream_II().readByte();
                }
            }
            IIIl.put(String.valueOf(n), nArrayArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static int[][] int_arr_arr_II(DataInputStream dataInputStream) {
        int[][] nArrayArray = new int[][]{{542, 543}};
        try {
            nArrayArray = new int[dataInputStream.readShort()][];
            for (int i = 0; i < nArrayArray.length; ++i) {
                int n = dataInputStream.readByte();
                nArrayArray[i] = new int[n];
                for (int j = 0; j < n; ++j) {
                    nArrayArray[i][j] = dataInputStream.readShort();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return nArrayArray;
    }

    private void IIIo(I_Il i_Il) {
        block17: {
            try {
                byte by = i_Il.java_io_DataInputStream_II().readByte();
                if (by != 0) break block17;
                try {
                    byte by2 = i_Il.java_io_DataInputStream_II().readByte();
                    if (by2 == 0) {
                        short s = i_Il.java_io_DataInputStream_II().readShort();
                        String string = i_Il.java_io_DataInputStream_II().readUTF();
                        String string2 = i_Il.java_io_DataInputStream_II().readUTF();
                        int n = i_Il.java_io_DataInputStream_II().readInt();
                        short s2 = i_Il.java_io_DataInputStream_II().readShort();
                        byte by3 = i_Il.java_io_DataInputStream_II().readByte();
                        I1_I.var_I10_II = new I10(by, s, string, string2, n, s2);
                        new I10(by, s, string, string2, n, s2).IIOl = by3;
                        I1_I.var_I10_II.II(by, 0, 0);
                        return;
                    }
                    if (by2 == 1) {
                        int n = i_Il.java_io_DataInputStream_II().readInt();
                        int n2 = i_Il.java_io_DataInputStream_II().readInt();
                        if (I1_I.var_I10_II != null) {
                            I10 i10 = I1_I.var_I10_II;
                            I1_I.var_I10_II.II0I = by;
                            i10.I_Oo = n;
                            i10.I_0 = n2;
                            return;
                        }
                    } else {
                        if (by2 == 2) {
                            by2 = i_Il.java_io_DataInputStream_II().readByte();
                            int n = 0;
                            if (by2 == 1) {
                                n = 1;
                            } else if (by2 == 2) {
                                n = 2;
                            }
                            I1_I.var_I10_II = null;
                            I1_I.II(n, -1, 0, II.var_int_IIll, II.var_int_IIl1, 0, 0, (short)-1, null);
                            return;
                        }
                        if (by2 == 5) {
                            short s = i_Il.java_io_DataInputStream_II().readShort();
                            if (I1_I.var_I10_II != null) {
                                I10 i10 = I1_I.var_I10_II;
                                I1_I.var_I10_II.II0I = by;
                                i10.II_l = s;
                                i10.IlO0 = II.var_long_II;
                                return;
                            }
                        } else if (by2 == 4) {
                            by2 = i_Il.java_io_DataInputStream_II().readByte();
                            byte by4 = i_Il.java_io_DataInputStream_II().readByte();
                            if (I1_I.var_I10_II != null) {
                                I1_I.var_I10_II.II(by, by2, by4);
                                return;
                            }
                        }
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static void IIl(I_Il i_Il) {
        try {
            byte by = i_Il.java_io_DataInputStream_II().readByte();
            if (by == 0) {
                short s;
                Ilol.Ilol_II().var_short_II1I = s = i_Il.java_io_DataInputStream_II().readShort();
                IO.II();
                IO.IOlO();
                return;
            }
            if (by == 2) {
                int n = i_Il.java_io_DataInputStream_II().readInt();
                byte by2 = i_Il.java_io_DataInputStream_II().readByte();
                short s = i_Il.java_io_DataInputStream_II().readShort();
                String string = s + I1I1.Il("\ub7c1", 47085) + by2;
                I1O1.II(I1I1.Il("\ub78f\ub86d\ub845\ub824\ub80c\ub8fa\ub8f8", 47085) + s, I1O1.III1);
                II.var_I_l__II.put(String.valueOf(n), string);
                return;
            }
            if (by == 3) {
                short s = i_Il.java_io_DataInputStream_II().readShort();
                I_oo.IlIo(s);
                Il0O.var_short_IIII = s;
                return;
            }
            if (by == 4) {
                String string = i_Il.java_io_DataInputStream_II().readUTF();
                II.var_I_lO_II.addElement(string);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void IIlI(I_Il i_Il) {
        try {
            short s = i_Il.java_io_DataInputStream_II().readShort();
            int n = -1;
            try {
                n = i_Il.java_io_DataInputStream_II().readByte();
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (n == 0) {
                short s2 = i_Il.java_io_DataInputStream_II().readShort();
                for (int i = 0; i < Ilol.Ilol_II().var_I_lO_IIl.size(); ++i) {
                    I_0o i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIl.elementAt(i);
                    if (i_0o.II0I != s) continue;
                    i_0o.II_l = s2;
                    return;
                }
                return;
            }
            if (n == 1) {
                short s3 = i_Il.java_io_DataInputStream_II().readByte();
                for (int i = 0; i < Ilol.Ilol_II().var_I_lO_IIl.size(); ++i) {
                    I_0o i_0o = (I_0o)Ilol.Ilol_II().var_I_lO_IIl.elementAt(i);
                    if (i_0o.II0I != s) continue;
                    for (int j = 0; j < 20; ++j) {
                        I1O1.II(I1I1.Il("\ub7be\ub867\ub842\ub826\ub805\ub8fb\ub8f8", 47085) + i_0o.II.IlIO + I1I1.Il("\ub7b2", 47085) + s3 + I1I1.Il("\ub7b2", 47085) + j, I1O1.III1);
                    }
                    return;
                }
                return;
            }
            if (n == -1) {
                int n2;
                I_0o i_0o = I_o_.II(s);
                for (n2 = 0; n2 < Ilol.Ilol_II().var_I_lO_IIl.size(); ++n2) {
                    if (((I_0o)Ilol.Ilol_II().var_I_lO_IIl.elementAt((int)n2)).II.IlIO != i_0o.II.IlIO) continue;
                    Ilol.Ilol_II().var_I_lO_IIl.setElementAt(i_0o, n2);
                    break;
                }
                for (n2 = 0; n2 < Ilol.Ilol_II().var_I_lO_IIlI.size(); ++n2) {
                    if (((I_0o)Ilol.Ilol_II().var_I_lO_IIlI.elementAt((int)n2)).II.IlIO != i_0o.II.IlIO) continue;
                    Ilol.Ilol_II().var_I_lO_IIlI.setElementAt(i_0o, n2);
                    break;
                }
                for (n2 = 0; n2 < I1_I.var_I_0o_arr_IIII.length; ++n2) {
                    if (I1_I.var_I_0o_arr_IIII[n2] == null || I1_I.var_I_0o_arr_IIII[n2].II.IlIO != i_0o.II.IlIO) continue;
                    I1_I.var_I_0o_arr_IIII[n2] = i_0o;
                    break;
                }
                for (n2 = 0; n2 < I1_I.var_I_0o_arr_III.length; ++n2) {
                    if (I1_I.var_I_0o_arr_III[n2] == null || I1_I.var_I_0o_arr_III[n2].II.IlIO != i_0o.II.IlIO) continue;
                    I1_I.var_I_0o_arr_III[n2] = i_0o;
                    break;
                }
                if (Ilol.Ilol_II().var_I_0o_II.II.IlIO == i_0o.II.IlIO) {
                    Ilol.Ilol_II().var_I_0o_II = i_0o;
                }
                I1_I.var_I1Oo_II.IIII(IO11.I00_ + i_0o.II.II1o + IO11.I00O + i_0o.l1__, 0);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    static {
        I__1 = false;
        IIIl = new I_l_(I1I1.Il("\ub78b\ub87e\ub84a\ub827\ub80c\ub8a8\ub8c9\ub8a3\ub892\ub924\ub941\ub92d\ub912\ub9f3", 47085));
    }

    private static /* synthetic */ String Il(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

