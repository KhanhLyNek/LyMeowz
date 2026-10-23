package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

public final class IOoO {
    private final IO0 II11;
    private final IOo_ II1l;
    private IOO.III1 var_IOO$III1_II;
    private IOO.III_[][] var_IOO$III__arr_arr_II;
    private boolean lII_;

    IOoO(IO0 iO0, IOo_ iOo_) {
        this.II11 = iO0;
        this.II1l = iOo_;
    }

    synchronized void Il11(int n) {
        Vector vector = IOO.IIII(n);
        for (int i = 0; i < vector.size(); ++i) {
            IOO.III1 iII1 = (IOO.III1)vector.elementAt(i);
            if (iII1.IoI_ != 0 && iII1.IoI_ != 3) continue;
            this.II(iII1);
            return;
        }
        this.II11.IIIl.IIol(IOoO.I10("\ub35d\uadd0\ub33d\ub35b\ub3f2\ub359\ub3b6\ub390\ub436\ub45b\ub4b4\ub40a\ub4b2\ub4d2\ub4b8\ub55f\ub56f\ub50d\ub45d\ub4db\uab69\ub5ca\ub5e8\ub58f\ua8d1\ub605\ub630\ub611\ua861", 45854));
    }

    synchronized void II(IOO.III1 iII1) {
        this.II11.var_IO0O_II.IoO = false;
        this.lII_ = false;
        this.var_IOO$III1_II = iII1;
        int n = this.II11.var_IOol_II.lOlI;
        IO0o iO0o = new IO0o(-44).II(iII1.IoI_ == 3 ? 3 : 0).II(iII1.II.length);
        this.var_IOO$III__arr_arr_II = new IOO.III_[iII1.II.length][];
        for (int i = 0; i < iII1.II.length; ++i) {
            Object object;
            IOO.III_ iII_;
            int n2;
            IOO.III0 iII0 = iII1.II[i];
            Vector<IOO.III_> vector = new Vector<IOO.III_>();
            for (n2 = 0; n2 < iII0.II.length; ++n2) {
                iII_ = iII0.II[n2];
                object = IOO.IOO$III_II(iII_.l0o1);
                if (object == null || !iII_.Io1_ || ((IOO.III)object).lOlI < 3 && ((IOO.III)object).lOlI != n) continue;
                if (IO0l.II0_(iII_.l0o1) && !IOoO.I10("\ub34d\ub375\ub313\ub32b\ub3c5\ub3fd\ub397\ub3be\ub449\ub471\ub41d\ub436\ub4df", 45854).equals(iII1.lIlO)) {
                    Object object2;
                    IOO.III_ iII_2 = new IOO.III_();
                    iII_2.l0o1 = iII_.l0o1;
                    iII_2.Io1_ = iII_.Io1_;
                    iII_2.Io1O = iII_.Io1O;
                    iII_2.l0o0 = iII_.l0o0;
                    iII_2.l0oO = 0;
                    iII_2.l0o_ = 100000000;
                    if (iII1.IoI_ == 3 && (object2 = IOO.IOO$III_II(76)) != null) {
                        iII_2.l0o0 = ((IOO.III)object2).lOo0;
                    }
                    object2 = new Vector();
                    for (int j = 0; iII_.II10 != null && j < iII_.II10.length; ++j) {
                        if (iII_.II10[j][0] == 31) continue;
                        ((Vector)object2).addElement(iII_.II10[j]);
                    }
                    ((Vector)object2).addElement(new int[]{31, 20});
                    iII_2.II10 = new int[((Vector)object2).size()][];
                    ((Vector)object2).copyInto((Object[])iII_2.II10);
                    iII_ = iII_2;
                }
                vector.addElement(iII_);
            }
            this.var_IOO$III__arr_arr_II[i] = new IOO.III_[vector.size()];
            vector.copyInto(this.var_IOO$III__arr_arr_II[i]);
            iO0o.II(iII0.II1o).II(this.var_IOO$III__arr_arr_II[i].length);
            for (n2 = 0; n2 < this.var_IOO$III__arr_arr_II[i].length; ++n2) {
                iII_ = this.var_IOO$III__arr_arr_II[i][n2];
                iO0o.III(iII_.l0o1);
                if (iII1.IoI_ == 3) {
                    iO0o.III(iII_.l0o0).IIII(iII_.l0o_);
                } else if (iII_.l0oO == 0) {
                    iO0o.IIII(iII_.l0o_).IIII(0);
                } else {
                    iO0o.IIII(0).IIII(iII_.l0o_);
                }
                object = iII_.II10;
                if (iII1.lIlO != null && iII1.lIlO.startsWith(IOoO.I10("\ub35c\ub368\ub31d\ub324", 45854))) {
                    long l = this.II11.var_IOol_II.IIII(iII_.l0o1);
                    if (l >= 1440L) {
                        object = new int[][]{{63, (int)(l / 1440L)}};
                    } else if (l >= 60L) {
                        object = new int[][]{{64, (int)(l / 60L)}};
                    } else if (l > 0L) {
                        object = new int[][]{{65, (int)l}};
                    }
                }
                iO0o.II(((Object)object).length);
                for (int j = 0; j < ((Object)object).length; ++j) {
                    iO0o.II((int)object[j][0]).III((int)object[j][1]);
                }
                iO0o.II(iII_.Io1O ? 1 : 0);
                iO0o.II(0);
            }
        }
        this.II1l.II(iO0o);
    }

    synchronized void l1o_() {
        IOO.IIIO iIIO;
        int n;
        this.II11.var_IO0O_II.IoO = false;
        this.lII_ = true;
        this.var_IOO$III1_II = null;
        IOol iOol = this.II11.var_IOol_II;
        Vector[] vectorArray = new Vector[]{new Vector(), new Vector(), new Vector()};
        int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 21, 22, 23};
        for (int i = 0; i < nArray.length; ++i) {
            IOO.III iII;
            int n2 = nArray[i];
            IOO.IIIO iIIO2 = IOO.IOO$IIIO_II(n2, 1);
            if (iIIO2 == null || iIIO2.l0oo != iOol.lOlI && n2 != 19) continue;
            n = 0;
            for (int j = 0; j < iOol.I__l.length; ++j) {
                iIIO = IOO.IOO$IIIO_II(iOol.I__l[j]);
                if (iIIO == null || iIIO.lO0I != n2) continue;
                n = iIIO.l1__;
                break;
            }
            if (n >= IOO.IIO1(n2) || (iII = IOO.IOO$III_II(n2, n + 1)) == null) continue;
            int n3 = n2 == 0 || n2 == 2 || n2 == 4 ? 0 : (n2 == 1 || n2 == 3 || n2 == 5 ? 1 : 2);
            vectorArray[n3].addElement(iII);
        }
        String[] stringArray = new String[]{IOoO.I10("\ub34d\ub3dc\ub33f\ub313\ub390\ub3ef\ub32d", 45854), IOoO.I10("\ub34d\ub3dc\ub33f\ub313\ub390\ub3fa\ub3b0\ub247\uaac9\ub45b\ub433", 45854), IOoO.I10("\ub34d\ub3dc\ub33f\ub313\ub390\ub2a9\uad6f\ub394\ub436\ub457\ub43d\uaab4\ub4e6", 45854)};
        IO0o iO0o = new IO0o(-44).II(1).II(3);
        for (int i = 0; i < 3; ++i) {
            iO0o.II(stringArray[i]).II(vectorArray[i].size());
            for (n = 0; n < vectorArray[i].size(); ++n) {
                IOO.III iII = (IOO.III)vectorArray[i].elementAt(n);
                iIIO = IOO.IOO$IIIO_II(IOO.II(iII), IOO.III(iII));
                iO0o.III(iII.I1l).II(iIIO == null ? 0L : iIIO.I101);
                iO0o.II(0).II(0).II(0);
            }
        }
        this.II1l.II(iO0o);
    }

    private void void_II(IOO.III_ iII_) {
        IOol iOol = this.II11.var_IOol_II;
        int n = iII_.l0o_;
        IOO.III iII = IOO.IOO$III_II(iII_.l0o1);
        if (iOol._1IO < n) {
            this.II11.IIIl.IIol(IOoO.I10("\ub355\ub355\ub3a8\ub315\ub3fd\ub399\ub2c9\uad10\ub436\ub524\ub43d\uaab0\ub4ff\ub491\ub4a3\uaa1e\ub52e\ub546\ub525\uabac\ub5e4\ub589\ub4d9\uab24\ub626\ub648\ub631\ub602\ub6a2\ub6d7\ua86d\ub6ab\ub6de\ub76d\ub754\ua9f2\ub717\ub7b9\ub7d6\ub737\ub78f\ub834", 45854));
            return;
        }
        IO0l iO0l = new IO0l(iII_.l0o1, 1);
        for (int i = 0; iII_.II10 != null && i < iII_.II10.length; ++i) {
            iO0l.III(iII_.II10[i][0], iII_.II10[i][1]);
        }
        if (!this.II11.IIIl.III0(iO0l)) {
            this.II11.IIIl.IIol(IOoO.I10("\ub356\ub3dd\ub332\ub313\ub3ba\ub3cd\ub3aa\ub396\ub478\ub452\ub474\ub562\ub471\ub491\ub5c1\uaa48\ub577", 45854));
            return;
        }
        iOol._1IO -= n;
        this.II11.IIIl.l1_l();
        this.II11.IIIl.IIol(IOoO.I10("\ub20e\ub3de\ub37c\ub26a\uad4f\ub3d0\ub3f8", 45854) + (iII == null ? IOoO.I10("\ub368\uad90\ub328\ub35b\ub3ea\ub3d1\uad71\ub39a", 45854) : iII.II1o) + IOoO.I10("\ub33e\ub35f\uaded\ub315\ub3fd\ub399", 45854) + n + IOoO.I10("\ub33e\ub22c\ub335\uadb8\ub3f7\ub399\ub3ab\uad06\ub436\ub45e\ub43d\uaab4\ub4fc\ub49f", 45854));
        this.II11.I__O();
    }

    synchronized void II_l(DataInputStream dataInputStream) throws IOException {
        int n;
        IO0l iO0l;
        String string;
        int n2;
        byte by = dataInputStream.readByte();
        short s = dataInputStream.readShort();
        IOol iOol = this.II11.var_IOol_II;
        if (this.II11.var_IO0O_II.IIlo(by, s)) {
            return;
        }
        if (this.lII_) {
            this.I111(s);
            return;
        }
        if (this.var_IOO$III1_II == null || this.var_IOO$III__arr_arr_II == null) {
            return;
        }
        IOO.III_ iII_ = null;
        int n3 = 0;
        block0: for (n2 = 0; n2 < this.var_IOO$III__arr_arr_II.length && iII_ == null; ++n2) {
            for (int i = 0; i < this.var_IOO$III__arr_arr_II[n2].length; ++i) {
                if (this.var_IOO$III__arr_arr_II[n2][i].l0o1 != s) continue;
                iII_ = this.var_IOO$III__arr_arr_II[n2][i];
                n3 = n2;
                continue block0;
            }
        }
        if (iII_ == null) {
            this.II11.IIIl.IIol(IOoO.I10("\ub355\ub355\ub3a8\ub315\ub3fd\ub399\ub3ac\ub39f\uaad5\ub415\ub420\ub41b\uaa63\ub4d2\ub4f0\ub487\ub567\uabea\ub522", 45854));
            return;
        }
        if (IOoO.I10("\ub34d\ub37c\ub312\ub32f\ub3db\ub3e6\ub390\ub3b2\ub457\ub471", 45854).equals(this.var_IOO$III1_II.lIlO)) {
            n2 = I0I1.IIoO(s);
            if (n2 < 0) {
                this.II11.IIIl.IIol(IOoO.I10("\ub355\ub355\ub3a8\ub315\ub3fd\ub399\ub3ac\ub39f\uaad5\ub415\ub420\ub41b\uaa63\ub4d2\ub4f0\ub487\ub567\uabea\ub522", 45854));
                return;
            }
            iOol.I0 = n2;
            this.II11.ll__();
            this.II11.ll_0();
            this.II11.IIIl.IIol(IOoO.I10("\ub20e\uade8\ub335\ub35b\ub3f1\ub3d0\uad1b\ub382\ub436\ub441\ub4a7\ub410\ub4b2\ub4c5\ub4b8\ub40f\ub560\ub545\ub56c\ub508\ub57e\ub5c7\ub5af", 45854));
            this.II11.I__O();
            return;
        }
        if (!(s != 1703 && s != 1717 || this.II11.IIIl.Il0O())) {
            this.II11.IIIl.IIol(IOoO.I10("\ub353\uad9a\ub331\ub35b\ub28b\ub35a\ub3f8\ub39f\uaaa9\ub441\ub474\ub41b\uaa33\ub4df\ub4fc\ub4cf\ub565\ub545\ub5b8\ub505\ub5ed\ub589\ub5bc\ub58f\ua8c5\ub605\ub623\ub60a\ub6e3\ub681\ub6a8\ua87e\ub690", 45854));
            return;
        }
        if ((s == 1703 || s == 1717) && iOol._111 >= 5) {
            this.II11.IIIl.IIol(IOoO.I10("\ub353\uadea\ub335\ub35b\ub3ee\ub359\ub3b1\ub3d7\ub47d\ub45d\ub43b\uaad0\ub4fc\ub491\ub4b3\ub487\uabc7\ub50d\ub45d\ub4db\uab69\ub5ca\ub5e8\ub58a\ub673\ub644\ub664\ub617\ua853\ub6c8\ub6e0\ub7ce\ub69f\ub73d\ub709\ub77b\ub716\ua93e\ub7d6\ub7f7\ub7b1\ub87c\ub855\ub873\ub81a\ua630\ub8de\ub8ef\ub883\ua7aa\ub941", 45854));
            return;
        }
        String string2 = string = this.var_IOO$III1_II.lIlO == null ? "" : this.var_IOO$III1_II.lIlO;
        if (string.equals(IOoO.I10("\ub34d\ub37c\ub312\ub32f\ub3db\ub3e6\ub39c\ub3b6\ub458\ub47d\ub40b\ub43b\ub4db\ub4f4\ub485", 45854))) {
            this.II11.var_IO__II.II1I(n3, s);
            return;
        }
        if (string.equals(IOoO.I10("\ub34d\ub375\ub313\ub32b\ub3c5\ub3fa\ub394\ub3b6\ub458", 45854))) {
            this.IIII(iII_);
            return;
        }
        if (string.equals(IOoO.I10("\ub34d\ub375\ub313\ub32b\ub3c5\ub3fd\ub397\ub3be\ub449\ub471\ub41d\ub436\ub4df", 45854))) {
            this.void_II(iII_);
            return;
        }
        if (string.equals(IOoO.I10("\ub34f\ub379\ub318\ub335", 45854))) {
            this.II11.IIIl.IIol(IOoO.I10("\ub35d\uadd0\ub33d\ub35b\ub3f2\ub359\ub3b6\ub390\ub436\ub45b\ub4b4\ub40a\ub4b2\ub5a0\uaa05\ub486\ub52e\ub54f\uabfd\ub505\ub5ed\ub589\ub4d9\ub58e\ua8c5\ub648\ub664\ub610\ua873\ub681\ub6ab\ub6b6\ua839\ub773\ub710\ub77b\ub709\ua968\ub798\ub7bc\ub79f\ua6d2\ub85a\ub873\ub81a\ub8f8\ua677\ub8a1\ub8ce\ub96e\ub944\ub8fb\ub90b\ub9a9\ub9c5\ua718", 45854));
            return;
        }
        if (string.equals(IOoO.I10("\ub35c\ub374\ub310\ub337", 45854))) {
            this.IIIl(iII_);
            return;
        }
        if (s == 988) {
            if (iOol.IOO_ >= 5000000000L) {
                this.II11.IIIl.II0o(IOoO.I10("\ub359\ub354\uad87\ub312\ub3ba\ub3d1\uad79\ub399\ub436\ub443\ub4b4\ub41d\ub4f5\ub491\ub5c1\ub40c\ub52e\ub43c\uabed\ub51f\ub5aa\ub5dd\uab19\ub58e\ub626\ub734\ub625\ub643\ub6b7\ub681\ub6b4\ua828", 45854));
                return;
            }
            if (!this.boolean_II(iII_)) {
                return;
            }
            this.III(iII_);
            iOol.IOO_ = Math.min(5000000000L, iOol.IOO_ + 1000000000L);
            this.II11.IIIl.l1_();
            this.II11.IIIl.IIol(IOoO.I10("\ub353\uade2\ub37c\ub309\uad43\ub3d7\ub3bf\ub3d7\ub462\ub4cf\ub43d\ub453\ub4e4\ub451\ub4be\ub488\ub52e\ub559\ub524\ub58b\ub5e4\ub5c1\ub5e8\ub584\ub6f2\ub64b\ub623\ub642\ub6a2\ub6e6\ub6a9\ua804\ub697\ub73d\ub754\ua9fa\ub714\ub7b9\ub7ce\ub737\ub798\ub872\ub80e\ub873", 45854) + iOol.IOO_ / 1000000000L + IOoO.I10("\ub33e\ub349\uadab", 45854));
            this.II11.I__O();
            return;
        }
        if (!this.boolean_II(iII_)) {
            return;
        }
        IOO.III iII = IOO.IOO$III_II(s);
        if (iII != null && iII.IoI_ == 13 && this.var_IOO$III1_II.lIlO != null && this.var_IOO$III1_II.lIlO.startsWith(IOoO.I10("\ub35c\ub368\ub31d\ub324", 45854))) {
            int n4;
            int n5 = this.var_IOO$III1_II.lIlO.equals(IOoO.I10("\ub35c\ub368\ub31d\ub324\ub3ab\ub3f1", 45854)) ? 60 : (n4 = this.var_IOO$III1_II.lIlO.equals(IOoO.I10("\ub35c\ub368\ub31d\ub324\ub3a2\ub3f1", 45854)) ? 480 : 43200);
            if (!iOol.II1_(s, n4)) {
                this.II11.IIIl.IIol(IOoO.I10("\ub35c\ub3c4\ub33d\ub35b\ub3f4\ub359\ub3a1\ub3d7\ub475\ub45d\ub5e4\ub412\ub4b2\ub5a0\ub560\uaa0c\ub56d\ub50d\ub524\uabbc\ub5aa\ub5dd\ub5ba\uab04\ub626\ua8fa\ub664\ub601\ua821\ub6cf\ub6e0\ub6b0\ub698\ub77b\ub750\ub732\ub714\ub7fc", 45854));
                return;
            }
            this.III(iII_);
            this.II11.IIIl.l1_l();
            this.II11.IIIl.l1_();
            this.II11.IIIl.IIol(IOoO.I10("\ub353\ub348\ub33d\ub35b\ub3ee\ub3d1\ub338\ub399\ub47e\ub415\ub437\ub487\ub4fc\ub4d6\ub4f0", 45854) + iII.II1o);
            this.II(this.var_IOO$III1_II);
            this.II11.I__O();
            return;
        }
        if (s == 517 || s == 518) {
            if (!this.II11.IIIl.Il00()) {
                this.II11.IIIl.IIol(IOoO.I10("\ub356\ub3dd\ub332\ub313\ub3ba\ub3cd\ub3aa\ub396\ub478\ub452\ub474\ub562\ub471\ub491\ub5c1\uaa48\ub577", 45854));
                return;
            }
            if (!iOol.boolean_II(s == 517)) {
                this.II11.IIIl.II0o(s == 517 ? IOoO.I10("\ub356\ub3dd\ub332\ub313\ub3ba\ub3cd\ub3aa\ub396\ub478\ub452\ub474\ub410\uaa75\ub4d0\ub4f0\ub48d\uabaf\ub543\ub56c\ub47a\ub569\ub589\ub4d9\uab46\ub672\ub605\ub630\ua8b2\ub6eb\ub681\ub7d1\ub6be", 45854) : IOoO.I10("\ub34c\ub28d\ub2fd\ub315\ub3fd\ub399\ub2c9\uad24\ub436\ub456\uaab3\ub412\ub4b2\ub4d3\uaa71\ub481\ub52e\ub43c\ub5af\ub54b\ub49b\uab08\ub5bc\ub5c7\ub672\ua8f4\ub62d\ub643\ub793\ub6c0", 45854));
                return;
            }
            this.III(iII_);
            this.II11.IIIl.IIol(s == 517 ? IOoO.I10("\ub353\uade2\ub37c\ub309\uad43\ub3d7\ub3bf\ub3d7\ub462\ub45d\ub4b4\ub41d\ub4fa\ub491\ub4b3\ub41b\ub560\ub54a\ub56c\ub55a\ub5aa\ub55d\ub5e8\ub58f\ub6e6\ub64b\ub62c\ub643\ub6f6\ub6d3\ub6a1\ub6b1\ub699", 45854) : IOoO.I10("\ub353\uade2\ub37c\ub309\uad43\ub3d7\ub3bf\ub3d7\ub462\ub45d\ub4b4\ub41d\ub4fa\ub491\ub4b3\ub41b\ub560\ub54a\ub56c\ub55a\ub5aa\ub55d\ub5e8\ub595\ub7b6\ub784\ub62a\ub604\ub6a2\ub7b0\ua813", 45854));
            if (s == 517) {
                this.II11.IIIl.l1_l();
            } else {
                this.II11.IIIl.l1_O();
            }
            this.II11.IIIl.l1_();
            IOO.III iII2 = IOO.IOO$III_II(s);
            this.II11.IIIl.IIol(IOoO.I10("\ub353\ub348\ub33d\ub35b\ub3ee\ub3d1\ub338\ub399\ub47e\ub415\ub437\ub487\ub4fc\ub4d6\ub4f0", 45854) + (iII2 == null ? "" : iII2.II1o));
            this.II11.I__O();
            return;
        }
        if (s == 543 && (iO0l = this.IIIl(543)) != null) {
            int n6 = -1;
            for (int i = 0; i < iO0l.IIl.size(); ++i) {
                if (((int[])iO0l.IIl.elementAt(i))[0] != 12) continue;
                n6 = i;
            }
            if (n6 >= 0) {
                int[] nArray = (int[])iO0l.IIl.elementAt(n6);
                nArray[1] = nArray[1] + 1;
            } else {
                iO0l.III(12, 1);
            }
            this.III(iII_);
            this.II11.IIIl.l1_l();
            this.II11.IIIl.l1_1();
            this.II11.IIIl.l1_();
            this.II11.IIIl.IIol(IOoO.I10("\ub353\ub348\ub33d\ub35b\ub3ee\ub3d1\ub338\ub399\ub47e\ub415\ub437\ub487\ub4fc\ub4d6\ub4f0", 45854) + (iII == null ? "" : iII.II1o));
            this.II11.I__O();
            return;
        }
        iO0l = new IO0l(s, 1);
        for (n = 0; n < iII_.II10.length; ++n) {
            iO0l.III(iII_.II10[n][0], iII_.II10[n][1]);
        }
        if (s == 543) {
            n = 0;
            for (int i = 0; i < iO0l.IIl.size(); ++i) {
                int[] nArray = (int[])iO0l.IIl.elementAt(i);
                if (nArray[0] != 12) continue;
                n = 1;
                if (nArray[1] != 0) continue;
                nArray[1] = 1;
            }
            if (n == 0) {
                iO0l.III(12, 1);
            }
        }
        if (!this.II11.IIIl.III0(iO0l)) {
            this.II11.IIIl.IIol(IOoO.I10("\ub356\ub3dd\ub332\ub313\ub3ba\ub3cd\ub3aa\ub396\ub478\ub452\ub474\ub562\ub471\ub491\ub5c1\uaa48\ub577", 45854));
            return;
        }
        if (s == 1703 || s == 1717) {
            ++iOol._111;
        }
        this.III(iII_);
        this.II11.IIIl.l1_l();
        this.II11.IIIl.l1_();
        IOO.III iII3 = IOO.IOO$III_II(s);
        this.II11.IIIl.IIol(IOoO.I10("\ub353\ub348\ub33d\ub35b\ub3ee\ub3d1\ub338\ub399\ub47e\ub415\ub437\ub487\ub4fc\ub4d6\ub4f0", 45854) + (iII3 == null ? "" : iII3.II1o));
        this.II11.I__O();
    }

    private static int IIol(int n) {
        IOO.I___();
        if (IOO.var_IOO$III_arr_II == null) {
            return -1;
        }
        for (int i = 0; i < IOO.var_IOO$III_arr_II.length; ++i) {
            if (IOO.var_IOO$III_arr_II[i] == null || IOO.var_IOO$III_arr_II[i].lOo0 != n) continue;
            return IOO.var_IOO$III_arr_II[i].I1l;
        }
        return -1;
    }

    private int IIo1(int n) {
        int n2 = 0;
        IO0l[] iO0lArray = this.II11.var_IOol_II.var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            n2 += iO0lArray[i].lo0I;
        }
        return n2;
    }

    private void II01(int n, int n2) {
        IO0l[] iO0lArray = this.II11.var_IOol_II.var_IO0l_arr_III;
        for (int i = 0; i < iO0lArray.length && n2 > 0; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            if (iO0lArray[i].lo0I > n2) {
                iO0lArray[i].lo0I -= n2;
                n2 = 0;
                continue;
            }
            n2 -= iO0lArray[i].lo0I;
            iO0lArray[i] = new IO0l();
        }
    }

    private IO0l IIIl(int n) {
        int n2;
        IOol iOol = this.II11.var_IOol_II;
        for (n2 = 0; n2 < iOol.var_IO0l_arr_III.length; ++n2) {
            if (iOol.var_IO0l_arr_III[n2].II1_() || iOol.var_IO0l_arr_III[n2].I1l != n) continue;
            return iOol.var_IO0l_arr_III[n2];
        }
        for (n2 = 0; n2 < iOol.II.length; ++n2) {
            if (iOol.II[n2] == null || iOol.II[n2].II1_() || iOol.II[n2].I1l != n) continue;
            return iOol.II[n2];
        }
        return null;
    }

    private boolean boolean_II(IOO.III_ iII_) {
        IOol iOol = this.II11.var_IOol_II;
        if (this.var_IOO$III1_II.IoI_ == 3) {
            int n = IOoO.IIol(iII_.l0o0);
            if (n < 0) {
                this.II11.IIIl.IIol(IOoO.I10("\ub35d\uadd0\ub33d\ub35b\ub3f2\ub359\ub3b6\ub390\ub436\ub446\uaaa5\ub453\ub4f9\ub4d8\uaa17\ub481\ub52e\ub543\ub5ac\ub512\ub5aa\ub5c1\ub5a1\uab20\ub668\ub605\ub627\ub60b\ub732\ub6c0\ub6e0\ub6b2\ua821", 45854));
                return false;
            }
            if (n == 76 || n == 188 || n == 189 || n == 190) {
                if (iOol.Il11 < (long)iII_.l0o_) {
                    this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3d1\ub3d1\ub32c\ub399\ub471\ub415\ub544\uaa94\ub4b2\ub4e7\ub430\ub481\ub569\ub50d\ub45c\uaba8\ub5aa\ub5e4\ub5bd\ub586\ub626\ub673\ua8e9\ub617\ub6a2\ub6f1\ub6a8\ua876\ub693", 45854));
                    return false;
                }
                return true;
            }
            if (n == 77) {
                if (iOol.lOoO < iII_.l0o_) {
                    this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3d1\ub3d1\ub32c\ub399\ub471\ub415\ub544\uaa94\ub4b2\ub4ff\ub4b7\uaa22\ub56d\ub50d\ub45c\uaba8\ub5aa\ub5e4\ub5bd\ub586\ub626\ub673\ua8e9\ub617\ub6a2\ub6f1\ub6a8\ua876\ub693", 45854));
                    return false;
                }
                return true;
            }
            if (n == 861) {
                if (iOol._lO < iII_.l0o_) {
                    this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub437\ub480\ub4b2\ub5a0\uaa37\ub4cf\ub560\ub54a\uab81\ub508", 45854));
                    return false;
                }
                return true;
            }
            IOO.III iII = IOO.IOO$III_II(n);
            String string = iII == null ? IOoO.I10("\ub368\uad90\ub328\ub35b\ub3ea\ub3d1\uad71\ub39a", 45854) : iII.II1o;
            int n2 = this.IIo1(n);
            if (n2 == 0) {
                this.II11.IIIl.IIol(IOoO.I10("\ub355\ub355\ub3a8\ub315\ub3fd\ub399\ub3ac\ub31b\ub47b\ub415\ub420\ub41b\uaa37\ub4c8\ub4f0", 45854) + string);
                return false;
            }
            if (n2 < iII_.l0o_) {
                this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub437\ub480\ub4b2\ub5a0\uaa37\ub4cf", 45854) + iII_.l0o_ + IOoO.I10("\ub33e", 45854) + string);
                return false;
            }
            return true;
        }
        if (iII_.l0oO == 2) {
            if (iOol._lO < iII_.l0o_) {
                this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub437\ub480\ub4b2\ub5a0\uaa37\ub4cf\ub560\ub54a\uab81\ub508", 45854));
                return false;
            }
            return true;
        }
        if (iII_.l0oO == 0) {
            if (iOol.Il11 < (long)iII_.l0o_) {
                this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub437\ub480\ub4b2\ub5a0\uaa37\ub4cf\ub578\ub5cd\ub522\ub50c", 45854));
                return false;
            }
            return true;
        }
        if (iOol.lOoO < iII_.l0o_) {
            this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub437\ub480\ub4b2\ub5a0\uaa37\ub4cf\ub560\ub54a\uab81\ub508", 45854));
            return false;
        }
        return true;
    }

    private void III(IOO.III_ iII_) {
        IOol iOol = this.II11.var_IOol_II;
        if (this.var_IOO$III1_II.IoI_ == 3) {
            int n = IOoO.IIol(iII_.l0o0);
            if (n == 76 || n == 188 || n == 189 || n == 190) {
                iOol.Il11 -= (long)iII_.l0o_;
            } else if (n == 77) {
                iOol.lOoO -= iII_.l0o_;
            } else if (n == 861) {
                iOol._lO -= iII_.l0o_;
            } else if (n >= 0) {
                this.II01(n, iII_.l0o_);
            }
            return;
        }
        if (iII_.l0oO == 2) {
            iOol._lO -= iII_.l0o_;
        } else if (iII_.l0oO == 0) {
            iOol.Il11 -= (long)iII_.l0o_;
        } else {
            iOol.lOoO -= iII_.l0o_;
        }
    }

    private static int IIo_(int n) {
        switch (n) {
            case 987: 
            case 1204: 
            case 1423: 
            case 1438: 
            case 1439: 
            case 1635: 
            case 1794: {
                return 1;
            }
            case 1790: {
                return 2;
            }
            case 1791: {
                return 3;
            }
            case 1792: {
                return 4;
            }
            case 1634: {
                return 10;
            }
            case 1541: 
            case 1550: 
            case 1551: 
            case 1563: 
            case 1573: 
            case 1620: 
            case 1629: 
            case 1630: 
            case 1631: 
            case 1668: 
            case 1682: 
            case 1683: 
            case 1714: 
            case 1724: 
            case 1727: 
            case 1729: 
            case 1733: 
            case 1734: 
            case 1748: 
            case 1749: 
            case 1750: {
                return 50;
            }
        }
        return -1;
    }

    private void IIII(IOO.III_ iII_) {
        IOol iOol = this.II11.var_IOol_II;
        int n = IOoO.IIo_(iII_.l0o1);
        if (n <= 0) {
            this.II11.IIIl.IIol(IOoO.I10("\ub348\uad90\ub328\ub35b\ub3ea\ub3d1\uad71\ub39a\ub436\ub45b\ub4b4\ub40a\ub4b2\ub4da\ub4b8\ub41b\ub560\ub54a\ub56c\ub51f\ub5e2\uab6a\ub5e8\ub58a\ub673\ub644\ub664\ub601\ua833\ub6cf\ub6a7\ub6ff\ub7ef\ub774\ua9ff\ub736\ub75a\ub7da\ub7d9\ub7a7\ub785\ub860\ub858\ub836\ub852\ub8d3\ub8d1\ub8a1\ub889\ub923", 45854));
            return;
        }
        if (iOol._lOO == 0) {
            this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub437\ub480\ub4b2\ub4c5\ub4a2\ub480\ub560\ub54a\ub56c\ub509\ub5eb\ub5c7\ub5af\ub5c7\ub66e\ua8fc\ub62d\ub642", 45854));
            return;
        }
        if (iOol._l0I < n) {
            this.II11.IIIl.IIol(IOoO.I10("\ub35c\ub35c\ub332\ub31c\ub3ba\ub3d1\uad01\ub39e\ub436\ub45e\ub43c\ub487\ub4fc\ub4d6\ub4f0\ub5fe\uabe9\ub50d\ub45d\ub502\uab49\ub5c4\ub5e8\ub5a4\ub667\ub655\ub637\ub616\ub6ee\ub6c4\ub6e0\ub69d\ub69f\ub773\ub75b\ub77b\ub66b\ua95a\ub798\ub7ba\ub783\ub874\ub814\ub825\ua6df\ub8e5\ub890\ub8bf\ub886\ua7a4\ub941\ub96b\ub904\ub969\ub9d1\ub9e6", 45854));
            return;
        }
        IO0l iO0l = new IO0l(iII_.l0o1, 1);
        for (int i = 0; i < iII_.II10.length; ++i) {
            iO0l.III(iII_.II10[i][0], iII_.II10[i][1]);
        }
        if (!this.II11.IIIl.III0(iO0l)) {
            this.II11.IIIl.IIol(IOoO.I10("\ub356\ub3dd\ub332\ub313\ub3ba\ub3cd\ub3aa\ub396\ub478\ub452\ub474\ub562\ub471\ub491\ub5c1\uaa48\ub577", 45854));
            return;
        }
        iOol._l0I -= n;
        this.II11.IIIl.l1_l();
        IOO.III iII = IOO.IOO$III_II(iII_.l0o1);
        this.II11.IIIl.IIol(IOoO.I10("\ub20e\ub3de\ub37c\ub26a\uad4f\ub3d0\ub3f8", 45854) + (iII == null ? "" : iII.II1o) + IOoO.I10("\ub33e\ub35f\uaded\ub315\ub3fd\ub399", 45854) + n + IOoO.I10("\ub33e\ub22c\ub335\uadb8\ub3f7\ub399\ub39b\ub396\ub466\ub446\ub421\ub41f\ub4f7\ub491\ub492\ub48e\ub560\ub54a\ub56c\ub508\uab6d\ub5c8\ub5e8\ub585\ub667\ub64b\ub623\ub643\ub6ea\ua878\ub6a9\ub6f1", 45854));
        this.II11.I__O();
    }

    private void IIIl(IOO.III_ iII_) {
        IO0l iO0l;
        int n;
        int n2;
        IOol iOol = this.II11.var_IOol_II;
        IOO.III iII = IOO.IOO$III_II(iII_.l0o1);
        if (iII == null) {
            return;
        }
        if (!this.II11.IIIl.Il00()) {
            this.II11.IIIl.IIol(IOoO.I10("\ub356\ub3dd\ub332\ub313\ub3ba\ub3cd\ub3aa\ub396\ub478\ub452\ub474\ub562\ub471\ub491\ub5c1\uaa48\ub577\ub501\ub56c\ub500\ub5e2\ub55d\ub5a6\ub580\ub626\ub651\ub62c\ua8a0\ub6a2\ub6c2\ub6a8\ua836\ub69f\ub73d\ub748\ub733\ub790\ub7f4\ub796", 45854));
            return;
        }
        if (iOol.Il11 < (long)iII_.l0o_) {
            this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub545\uaa94\ub4b2\ub4c7\ub430\ub481\ub569\ub501\ub56c\ub508\ub578\ub5c7\ub5e8\ub593\ub66e\ub64c\ua8fb\ub616\ub6a2", 45854) + IO00.IIlI((long)iII_.l0o_ - iOol.Il11));
            return;
        }
        int n3 = -1;
        if (iII.lOl_ == 14) {
            for (n2 = 0; n2 < iOol.var_IO0l_arr_III.length; ++n2) {
                IO0l iO0l2 = iOol.var_IO0l_arr_III[n2];
                if (iO0l2.II1_() || iO0l2.I1l < 663 || iO0l2.I1l > 667 || iO0l2.lo0I < 99) continue;
                n3 = n2;
                break;
            }
            if (n3 < 0) {
                this.II11.IIIl.IIol(IOoO.I10("\ub355\ub355\ub3a8\ub315\ub3fd\ub399\ub3bb\ub304\ub436\ub524\uaab3\ub453\ub4e6\ub4d9\uaa39\ub48c\ub52e\ub42e\ub522", 45854));
                return;
            }
        }
        n2 = 0;
        for (n = 0; n < iOol.II.length; ++n) {
            IOO.III iII2;
            iO0l = iOol.II[n];
            IOO.III iII3 = iII2 = iO0l == null || iO0l.II1_() ? null : IOO.IOO$III_II(iO0l.I1l);
            if (iII2 == null || iII2.lOl_ != 13) continue;
            n2 = 1;
            break;
        }
        if (n2 == 0) {
            this.II11.IIIl.IIol(IOoO.I10("\ub355\ub355\ub3a8\ub315\ub3fd\ub399\ub3bb\ub304\ub436\ub524\uaab3\ub453\ub4e1\ub4d4\ub4a4\ub4cf\ub57a\ub545\uabeb\ub505", 45854));
            return;
        }
        n = 0;
        if (iII.lOl_ == 14) {
            int n4 = 1 + (int)(Math.random() * 100.0);
            n = n4 <= 1 ? 15 : (n4 <= 15 ? 11 + (int)(Math.random() * 4.0) : (n4 <= 35 ? 7 + (int)(Math.random() * 4.0) : (n4 <= 60 ? 4 + (int)(Math.random() * 3.0) : (int)(Math.random() * 4.0))));
        }
        iO0l = new IO0l(iII_.l0o1, 1);
        if (iII_.II10.length > 0) {
            for (int i = 0; i < iII_.II10.length; ++i) {
                boolean bl;
                int n5 = iII_.II10[i][0];
                int n6 = iII_.II10[i][1];
                boolean bl2 = bl = n5 == 0 || n5 == 22 || n5 == 23 || n5 == 14 || n5 == 27 || n5 == 28 || n5 == 47;
                if (iII.lOl_ == 14 && bl && n > 0) {
                    iO0l.III(n5, n6 + n6 * n / 100);
                    continue;
                }
                if (n5 == 164) continue;
                iO0l.III(n5, n6);
            }
        } else {
            iO0l.III(73, 0);
        }
        iO0l.III(30, 0);
        if (!this.II11.IIIl.III0(iO0l)) {
            this.II11.IIIl.IIol(IOoO.I10("\ub356\ub3dd\ub332\ub313\ub3ba\ub3cd\ub3aa\ub396\ub478\ub452\ub474\ub562\ub471\ub491\ub5c1\uaa48\ub577", 45854));
            return;
        }
        iOol.Il11 -= (long)iII_.l0o_;
        if (n3 >= 0) {
            IO0l iO0l3 = iOol.var_IO0l_arr_III[n3];
            iO0l3.lo0I -= 99;
            if (iO0l3.lo0I <= 0) {
                iOol.var_IO0l_arr_III[n3] = new IO0l();
            }
        }
        this.II11.IIIl.l1_l();
        this.II11.IIIl.l1_();
        this.II11.IIIl.IIol(IOoO.I10("\ub353\ub348\ub33d\ub35b\ub3ee\ub3d1\ub338\ub399\ub47e\ub415\ub437\ub487\ub4fc\ub4d6\ub4f0", 45854) + iII.II1o);
        this.II11.I__O();
    }

    private void I111(int n) {
        int n2;
        IOol iOol = this.II11.var_IOol_II;
        IOO.III iII = IOO.IOO$III_II(n);
        if (iII == null) {
            return;
        }
        int n3 = IOO.II(iII);
        IOO.IIIO iIIO = IOO.IOO$IIIO_II(n3, n2 = IOO.III(iII));
        if (iIIO == null) {
            this.II11.IIIl.IIol(IOoO.I10("\ub355\ub355\ub3a8\ub315\ub3fd\ub399\ub3ac\ub39f\uaad5\ub415\ub420\ub41b\uaa63\ub4d2\ub4f0\ub487\ub567\uabea\ub522", 45854));
            return;
        }
        if (iOol.IO_1 < iIIO.I101) {
            this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub3f1\ub3d1\ub32c\ub399\ub471\ub415\ub545\uaa94\ub4b2\ub4c5\ub4b9\uaa2e\ub563\ub50d\ub522\ub468\ub5e4\ub5ce", 45854));
            return;
        }
        if (!this.II11.IIIl.II11(n3, n2)) {
            return;
        }
        iOol.IO_1 -= iIIO.I101;
        this.II11.ll_0();
        this.II11.IIIl.IIol(IOoO.I10("\ub35c\uad9c\ub332\ub35b\ub28b\ub35a\ub3f8\ub39f\uaadb\ub456\ub474\ub562\ub522\uaa52\ub4b3\ub4cf\ub565\uabd4\ub56c\ub505\ub489\ub5c7\ub5af\ub5c7\ub66b\ua8fe\ub62d\ub642", 45854));
        this.l1o_();
        this.II11.I__O();
    }

    private static /* synthetic */ String I10(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

