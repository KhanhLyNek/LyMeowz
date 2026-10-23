package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nrolite.GmHandler
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.util.Random;
import java.util.Vector;
import nrolite.GmHandler;

public final class IOoI
implements Runnable {
    private final Vector var_java_util_Vector_IIl0 = new Vector();
    private long I_0;
    private long I_0I;
    private long I_0l;
    private long I_01;
    private long I_0_;
    private final IO0 var_IO0_II1;
    private final IOo_ var_IOo__II1;
    private final Random var_java_util_Random_IIl0 = new Random();
    private III[] var_IOoI$III_arr_II = new III[0];
    private final Vector IIlo = new Vector();
    private int _I00 = 1;
    private int _I0o = -1;
    private final long[] IIll = new long[32];
    private boolean IoOO;
    private int _Io;
    private long I_0O;
    private long I_00;
    private long I_Ol;
    private long I_O1;
    private long I_0o;
    private long I_o;
    private long I_oI;
    private long I_ol;
    private boolean Io0l;
    private boolean I000;
    private I0Io.III[] var_I0Io$III_arr_II = new I0Io.III[0];
    private int _IoI = -1;
    final GmHandler var_nrolite_GmHandler_II;
    final GmHandler var_nrolite_GmHandler_III;
    final IO_I var_IO_I_II;
    final IO_l var_IO_l_II;
    boolean Io01;
    private long I_o1;
    private long I_o_;
    private final IO0I var_IO0I_II = new IO0I();
    static final int _Iol = 110;
    static final int _Io1 = 80;
    static final int _Io_ = 1;
    private int _IoO = 1;
    private boolean Io0_;
    private static final int _Io0 = 29999;
    private long I_oO;
    private long I_o0;
    private int _Ioo;
    private int _l;
    private long I_oo;
    private boolean IoO0;
    private long I_O_;
    private long I_OO;
    private int _I01;
    private final long[] IIl1 = new long[32];
    private long IO;
    private IOO.IIIO var_IOO$IIIO_III;
    private boolean Io0O;
    private int _lI;
    private int _lII;
    private int _lIl;
    private long IOI;
    private long IOII;
    private int _lI1 = 400;
    private int _lI_ = 360;
    private static final int _lIO = 40000000;
    private int _lI0;
    private boolean Io00;
    private long IOIl;
    private boolean Io0o;
    private boolean Ioo;
    private boolean IooI;
    private long IOI1 = -1L;
    private long IOI_;
    private int _lIo = 0;
    private int[] I_1I = new int[0];
    private boolean Iool;
    static final int _ll = 600000;
    static final int _llI = 1800000;
    private long IOIO;
    private long IOI0;
    private long IOIo;
    private long IOl;
    private long IOlI;
    private long IOll;
    private long IOl1;
    private long IOl_;
    private long IOlO;
    private long IOl0;
    private long IOlo;
    private long IO1;
    private long IO1I;
    private long IO1l;
    private long IO11;
    private static final String[] IlOo = new String[]{IOoI.I1O1("\ue4c4\ue4c1\ue4eb\ue5fb\ue560\ue504\ue567\ue592\ue5eb\ue5c3\ue5e3\ue59a\ue668\ue64e\ue65d\ue63f\ue609\ue6f3", 58509), IOoI.I1O1("\ue4d9\ue4c4\ue43f\ue483\ue529\ue5dc\ue529\ue501\ue5a5\ue5c7\ue521\ue58f\ue621\ue64d\uf886\ue67e\ue610\uf84f\ue6d6\ue6fa\ue7e8\ue771", 58509), IOoI.I1O1("\ue4dd\ue4c4\ue429\ue484\ue529\ue55c\ue5a5\ue50b\ue5a5\ue5d5\ue5b6\ue503", 58509), IOoI.I1O1("\ue4dd\ue4c4\ue429\ue484\ue529\ue55c\ue5a5\ue50b\ue5a5\ue5d5\ue5b6\ue503", 58509), IOoI.I1O1("\ue4ad\ue4fc\ue4a3\ue408\ue567\ue508\ue533\ue584\ue5e8\ue584\ue5b2\ue597\ue6e0", 58509)};
    private static final String[] Il0 = new String[]{IOoI.I1O1("\ue4c5\ue458\ue4a2\ue4ca\ue578\ue55d\ue5a6\ue54a\ue5a5\ue5d0\ue5b1\ue503\ue66f\ue648\ue61f\ue626\ue61c\ue6bc\ue6cf\ue6bb\ue6d9\ue76a\ue756", 58509), IOoI.I1O1("\ue4cf\ue4c5\ufa74\ue484\ue529\ue439\ue52e", 58509), IOoI.I1O1("\ue4d9\ue4de\ufa16\ue483\ue529\ue489\ue52e\ue546\ue494\ufb77\ue5e3\ufb3d\ue621\ue644\ue79e", 58509), IOoI.I1O1("\ue4d9\ue4c4\ue431\ue483\ue529\ue559\ue532\ue587", 58509), IOoI.I1O1("\ue4c0\ue455\ue4a2\ue4ca\ue56e\ue5c4\ue567\ue50e\ue571\ue5cd\ue5e3\ue593\ue674\ue6c1", 58509)};
    private static final String[] Il0I = new String[]{IOoI.I1O1("\ue4da\ue4c3\ue4bc\ue4c6\ue529\ue55b\ue522\ue51e\ue5fc\ue584\ue5b2\ue597\ue6e0", 58509)};
    private static final String[] Il0l = new String[]{IOoI.I1O1("\ue4c3\ufa1b\ue4a5\ue48d\ue529\ue559\ue532\ue587\ue5a4", 58509)};
    static final long IO1_ = 604800000L;
    static final int _lll = 5427;
    private static final int _ll1 = 20;
    private static final int _ll_ = 100;
    private static final int[] I_1l = new int[]{1, 2, 3, 8, 9, 10, 15, 16, 17};
    private boolean Ioo1;
    static final int[][][] IIIl = new int[][][]{new int[][]{{0, 3, 33, 34, 136, 137, 138, 139, 230, 231, 232, 233}, {6, 9, 35, 36, 140, 141, 142, 143, 242, 243, 244, 245}, {21, 24, 37, 38, 144, 145, 146, 147, 254, 256, 257}, {27, 30, 39, 40, 148, 149, 150, 151, 266, 267, 268, 269}, {12, 57, 58, 59, 184, 185, 186, 187, 278, 279, 280, 281}}, new int[][]{{1, 4, 41, 42, 152, 153, 154, 155, 235, 236, 237}, {7, 10, 43, 44, 156, 157, 158, 159, 246, 247, 248, 249}, {22, 25, 45, 46, 160, 161, 162, 163, 259, 260, 261}, {28, 31, 47, 48, 164, 165, 166, 167, 270, 271, 272, 273}, {12, 57, 58, 59, 184, 185, 186, 187, 278, 279, 280, 281}}, new int[][]{{2, 5, 49, 50, 168, 169, 170, 171, 238, 239, 240, 241}, {8, 11, 51, 52, 172, 173, 174, 174, 250, 251, 252, 253}, {23, 26, 53, 54, 176, 177, 178, 179, 262, 263, 264, 265}, {29, 32, 55, 56, 180, 181, 182, 183, 274, 275, 276, 277}, {12, 57, 58, 59, 184, 185, 186, 187, 278, 279, 280, 281}}};
    static final int[][] II_l = new int[][]{{128, 129, 127, 233, 245}, {130, 131, 132, 233, 237}, {133, 135, 134, 233, 241}};
    private int[] I_11 = new int[0];
    private int _llO = -1;
    private int _ll0;
    private int _llo;
    private static final int _l1 = 0;
    private static final int _l1I = 1;
    private static final int _l1l = 2;
    private static final int _l11 = 3;
    private static final int _l1_ = 4;
    private static final int _l1O = 5;
    private static final int _l10 = 6;
    private static final int _l1o = 7;
    private static final int _l_ = 8;
    private static final int _l_I = 9;
    private int _l_l = -1;
    private Vector var_java_util_Vector_II1 = new Vector();

    IOoI(IO0 iO0, IOo_ iOo_) {
        GenericDeclaration genericDeclaration;
        GmHandler gmHandler;
        this.var_IO0_II1 = iO0;
        this.var_IOo__II1 = iOo_;
        GmHandler gmHandler2 = null;
        try {
            gmHandler = Class.forName(IOoI.I1O1("\ue4e3\ue4de\ue4a4\ue486\ue560\ue55c\ue522\ue548\ue5c2\ue5c9", 58509));
            genericDeclaration = gmHandler.getConstructor(IO0.class, IOoI.class);
            gmHandler2 = (GmHandler)((Constructor)genericDeclaration).newInstance(iO0, this);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.var_nrolite_GmHandler_II = gmHandler2;
        gmHandler = null;
        try {
            genericDeclaration = Class.forName(IOoI.I1O1("\ue4e3\ue4de\ue4a4\ue486\ue560\ue55c\ue522\ue548\ue5c2\ue5c9\ue580\ue58f\ue665", 58509));
            Constructor<?> constructor = ((Class)genericDeclaration).getConstructor(IO0.class, IOoI.class);
            gmHandler = (GmHandler)constructor.newInstance(iO0, this);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.var_nrolite_GmHandler_III = gmHandler;
        this.var_IO_I_II = new IO_I(this, iO0, iOo_);
        this.var_IO_l_II = new IO_l(this, iO0, iOo_);
    }

    III[] IOoI$III_arr_II() {
        return this.var_IOoI$III_arr_II;
    }

    private IOol IOol_II() {
        return this.var_IO0_II1.var_IOol_II;
    }

    void I_1o() {
        if (this.I000) {
            return;
        }
        this.I000 = true;
        Thread thread = new Thread(this);
        thread.start();
        this.var_IO_I_II.I_1o();
    }

    @Override
    public void run() {
        while (!this.var_IOo__II1.lIIl) {
            long l;
            try {
                Thread.sleep(400L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            long l2 = System.currentTimeMillis();
            try {
                this.l1ll();
            }
            catch (Exception exception) {
                System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5ec\ue5c7\ue5a8\ue5d8\ue621", 58509) + exception);
            }
            if ((l = System.currentTimeMillis() - l2) < 1000L || System.currentTimeMillis() - this.I_o1 < 2000L) continue;
            this.I_o1 = System.currentTimeMillis();
            System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue505\ue5e4\ue5ca\ue5ab\ue5c2\ue663\ue641\ue650\ue664\ue65d\ue6e8\ue6d2\ue6b9\ue692\ue730\ue71e\ue776\ue718\ue7f5\ue7c7\ue7f2", 58509) + l + IOoI.I1O1("\ue4e0\ue4df\ue4eb\ue4c2\ue56b\ue541\ue529\ue50e\ue5a5\ue5d0\ue5ab\ue597\ue66e\ue64e\ue658\ue67e\ue641\ue6a9\ue68b\ue6b7\ue68a\ue731\ue717\ue77b\ue755\ue7e5\ue7c6\ue7b3\ue798\ue83f\ue85c\ue83b\ue84d\ue8e7\ue8c2\ue8af\ue887\ue928\ue954\ue923\ue917\ue9f2\ue9c6\ue9b0\ue9c1\uea62\uea76\uea1e\uea39\uea09\ueaf5\ueadd\ueaf9\uea8c\ueb65\ueb59\ueb3b\ueb13\uebb3\uebde\ueba4\ueb93\uec2f\uec40\uec2c\uec15\ueca7\uec8a\uecbb\uec89\ued73\ued06\ued26\ued0b\ueda3\uedd6\ueda9\ued85\ueddf\uee72\uee5c\uee7c\uee15\ueefd\ueecc\ueea1\uee92\uef78\uef15\uef3a\uef1b\ueff3\uefdf\ueff0\uef88\uf067\uf04c\uf038\uf04b\uf0e6\uf0c8\uf0af\uf0c8\uf177\uf150\uf125\uf10a\uf1a2\uf1c5\uf1b5\uf1b1\uf199\uf23d\uf255\uf236", 58509));
        }
    }

    private synchronized void l1ll() {
        int n;
        int n2;
        Object object;
        IOol iOol = this.IOol_II();
        if (iOol == null) {
            return;
        }
        if (!this.var_IO0I_II.II(this, iOol, this.var_nrolite_GmHandler_II != null)) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.Io00) {
            this.Io00 = false;
            this.IOIl = l;
            this.IIol(IOoI.I1O1("\ue4cf\ufa67\ue4eb\ue488\ue566\ue55b\ue534\ue546\ue5f1\ufb01\ue5ad\ue5c2\ue662\ue6d4\ue651\ue639\ue651\ue6bc\ue6cf\uf82b\ue6d9\ue609\uf9ee\ue738\ue712\ue7b4\ue6a2\uf907\ue798\ue830\ue844\ue826\ue818", 58509));
            this.var_IO0_II1.IlO1(-1);
            return;
        }
        if (this.IO != 0L && this.var_IOO$IIIO_III != null && l - this.IO >= 2000L && iOol.llIl > 0) {
            IOO.IIIO iIIO = this.var_IOO$IIIO_III;
            this.IO = 0L;
            this.var_IOO$IIIO_III = null;
            this.IIll[14] = l;
            this.II(iIIO, l);
            try {
                this.IIII(iIIO);
            }
            catch (RuntimeException runtimeException) {
                System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue503\ue5fd\ue5d4\ue5af\ue58d\ue665\ue645\ue605\ue67e", 58509) + runtimeException);
            }
        }
        if (this._Ioo != 0) {
            int n3;
            int n4 = n3 = this._Ioo == 10 ? 4000 : 3000;
            if (l - this.I_oo > (long)(n3 + 1500)) {
                object = this.III(this._Ioo);
                if (object != null && this._l >= 0 && this._l < this.var_IOoI$III_arr_II.length && !this.var_IOoI$III_arr_II[this._l].IoOo && object == this.IOO$IIIO_II() && iOol.llIl > 0) {
                    System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1", 58509) + this._Ioo + IOoI.I1O1("\ue4ad\ue4d8\ue4be\ue4ca\ue56d\ue547\ue529\ue501\ue5a5\ue5d4\ue5ab\ue58d\ue66f\ue647\ue61f\ue676\ue61e\ue6f0\ue6d2\ue6bf\ue697\ue76c\ue717\ue73d\ue71d\ue7fb\ue7dd\ue7b5\ue7d1\ue877\ue85a\ue827\ue84d\ue8e0\ue8ca\ue8a4\ue8c9\ue93a\ue90e", 58509));
                    this.I_oo = l - (long)n3;
                    this.I1II(this._l);
                }
                this._Ioo = 0;
            }
        }
        for (n2 = 0; n2 < this.IIl1.length; ++n2) {
            if (this.IIl1[n2] == 0L || l < this.IIl1[n2]) continue;
            this.IIl1[n2] = 0L;
            object = this.III(n2);
            if (object == null) continue;
            this.IIll[n2] = l - (long)((IOO.IIIO)object).loIl;
            this.var_IOo__II1.II(new IO0o(-94).III(((IOO.IIIO)object).I1l).IIII(0));
        }
        this.var_IO0_II1.var_IO__II.III1(l);
        this.var_IO0_II1.var_IOO0_II.III1(l);
        this.var_IO0_II1.var_IOo0_II.III1(l);
        this.var_IO_l_II.III1(l);
        this.var_IO0_II1.var_IOo_II.void_III1(l);
        this.var_IO0_II1.var_I0_II.III1(l);
        this.var_IO0_II1.var_IOOO_II.III1(l);
        if (this.I_o_ == 0L) {
            this.I_o_ = l;
        }
        if (l - this.I_o_ >= 1000L) {
            this.var_IO0_II1.var_IO1o_II.II(8, l - this.I_o_);
            this.I_o_ = l;
        }
        if (iOol._lOI == 0 && iOol._lOl == 0) {
            this.l10o();
        }
        for (n2 = 0; n2 < this.var_IOoI$III_arr_II.length; ++n2) {
            object = this.var_IOoI$III_arr_II[n2];
            if (((III)object).III != null) continue;
            int n5 = n = this.var_IO0_II1.var_IO_1_II.Il1I() && IO_1.II_1(this._IoI) && this._IoI == 59 && ((III)object).l0o1 == 22 ? 1 : 0;
            if (!((III)object).IoOo || !(n != 0 ? this.var_IO0_II1.var_IO_1_II.II__(((III)object)._l_1) : l >= ((III)object).IO1o)) continue;
            ((III)object).IoOo = false;
            ((III)object).Ioo_ = false;
            ((III)object).IooO = false;
            if (this.var_IO0_II1.var_IO_1_II.Il1I() && IO_1.II_1(this._IoI)) {
                ((III)object)._l__ = this.var_IO0_II1.var_IO_1_II.II1o(((III)object).l0o1);
                ((III)object)._l_O = this.var_IO0_II1.var_IO_1_II.II_(((III)object).l0o1);
            }
            ((III)object).lOlO = ((III)object)._l__;
            if (((III)object).l0o1 >= 13 && ((III)object).l0o1 <= 33 && !this.IlO0() && this.var_java_util_Random_IIl0.nextInt(100) < 1) {
                ((III)object).IooO = true;
                ((III)object).lOlO = ((III)object)._l__ * 10;
            }
            ((III)object).llIl = ((III)object).lOlO;
            if (n != 0) {
                this.var_IO0_II1.var_IO_1_II.II1o(this._IoI, ((III)object)._l_1);
            }
            this.var_IOo__II1.II(new IO0o(-13).II(((III)object)._l_1).II(((III)object).l0o1).II(((III)object).IooO ? 1 : 0).IIII(((III)object).llIl));
            if (!((III)object).IooO) continue;
            this.IIol(IOoI.I1O1("\ue4dc\ue4d9\ue42a\ue483\ue529\ue55c\ue52e\ue508\ue5ed\ue584\ue5a2\ue58c\ue669\ue600", 58509) + (((III)object).II == null ? "" : ((III)object).II.II1o) + IOoI.I1O1("\ue4ad\ue4d4\ue4be\ufa4f\ue57d\ue508\ue52f\ue50f\ufb42\ue5ca\ue5e2", 58509));
        }
        for (n2 = 0; n2 < this.var_IOoI$III_arr_II.length; ++n2) {
            object = this.var_IOoI$III_arr_II[n2];
            if (((III)object).III != null || ((III)object).l0o1 == 70 || ((III)object).l0o1 == 71 || ((III)object).l0o1 == 72) continue;
            if (((III)object).IoOo) {
                ((III)object).IO_I = l;
                continue;
            }
            if (((III)object).IO_I == 0L) {
                ((III)object).IO_I = l;
            }
            if (l - ((III)object).IO_I <= 30000L) continue;
            ((III)object).IO_I = l;
            if (((III)object).llIl >= ((III)object).lOlO) continue;
            ((III)object).llIl = Math.min(((III)object).lOlO, ((III)object).llIl + ((III)object).lOlO / 10);
            this.var_IOo__II1.II(new IO0o(-9).II(((III)object)._l_1).IIII(((III)object).llIl).IIII(1).II(false).II(-1));
        }
        if (this.I_oO != 0L && l >= this.I_oO) {
            this.I_oO = 0L;
            this.l1lo();
        }
        for (n2 = this.IIlo.size() - 1; n2 >= 0; --n2) {
            object = (II)this.IIlo.elementAt(n2);
            if (l <= ((II)object).IO1O) continue;
            this.IIlo.removeElementAt(n2);
            this.var_IOo__II1.II(new IO0o(-21).III(((II)object).I1l));
        }
        this.IIlo(l);
        this.II1o(l);
        this.II1_(l);
        for (n2 = 0; n2 < this.var_IOoI$III_arr_II.length; ++n2) {
            object = this.var_IOoI$III_arr_II[n2];
            if (((III)object).III != null) continue;
            if (((III)object).IO_ != 0L && l >= ((III)object).IO_) {
                ((III)object).IO_ = 0L;
                this.var_IOo__II1.II(new IO0o(-112).II(0).II(((III)object)._l_1));
            }
            if (((III)object).lO_1 == 0 || l < ((III)object).I11o) continue;
            this.var_IOo__II1.II(new IO0o(-124).II(0).II(1).II(((III)object).lO_1).II(((III)object)._l_1).IIII(iOol.I1l));
            ((III)object).lO_1 = 0;
        }
        if (iOol._l0_ < iOol._l0O && l - this.I_ol > 60000L) {
            this.I_ol = l;
            ++iOol._l0_;
            this.var_IOo__II1.II(new IO0o(-68).III(iOol._l0_));
        }
        this.l1O();
        this.var_IO0_II1.var_IOO__II.III1(l);
        this.var_IO0_II1.var_IO_1_II.III1(l);
        this.var_IO0_II1.var_IO0__II.III1(l);
        this.var_IO0_II1.var_IO0O_II.III1(l);
        this.IIlI(l);
        this.II1I(l);
        if (iOol.llIl <= 0) {
            return;
        }
        for (n2 = 0; n2 < this.var_IOoI$III_arr_II.length; ++n2) {
            object = this.var_IOoI$III_arr_II[n2];
            if (((III)object).III != null || ((III)object).IoOo || ((III)object).l0o1 == 0 || ((III)object).l0o1 == 117 || l < ((III)object).I110) continue;
            if (((III)object).l0o1 == 77) {
                if (!this.IIIl((III)object, l)) continue;
                return;
            }
            if (((III)object).l0o1 == 70) {
                if (!this.II((III)object, l)) continue;
                return;
            }
            if (((III)object).l0o1 == 71) {
                if (!this.III((III)object, l)) continue;
                return;
            }
            if (((III)object).l0o1 == 72) {
                if (!this.IIII((III)object, l)) continue;
                return;
            }
            if (this.Il01() || this.Il0l() || l - ((III)object).I1l0 < 2000L || l < this.I_01 && l >= this.I_0_) continue;
            n = Math.abs(iOol.I1 - ((III)object).I1);
            int n6 = Math.abs(iOol.I1I - ((III)object).I1I);
            if (!((III)object).Ioo_) {
                if (n > 110 || n6 > 80) continue;
                ((III)object).Ioo_ = true;
            } else if (n > 300 || n6 > 200) {
                ((III)object).Ioo_ = false;
                continue;
            }
            if (!this.boolean_II((III)object)) continue;
            return;
        }
        if (l - this.I_o > 30000L) {
            this.I_o = l;
            n2 = iOol.Illo();
            int n7 = iOol.Il1();
            if (iOol.llIl < n2) {
                iOol.llIl = Math.min(n2, iOol.llIl + iOol.Il__());
                this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
            }
            if (iOol._loI < n7) {
                iOol._loI = Math.min(n7, iOol._loI + iOol.Il_O());
                this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
            }
        }
        if (l - this.I_oI > 15000L) {
            this.I_oI = l;
            this.var_IO0_II1.I__O();
        }
    }

    private boolean IlO0() {
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            if (!this.var_IOoI$III_arr_II[i].IooO || this.var_IOoI$III_arr_II[i].IoOo) continue;
            return true;
        }
        return false;
    }

    private boolean boolean_II(III iII) {
        boolean bl;
        int n;
        IOol iOol = this.IOol_II();
        iII.I1l0 = System.currentTimeMillis();
        int n2 = iII._l_O > 0 ? iII._l_O : (n = iII._l__ * (iII.II == null ? 5 : iII.II.l0o) / 100);
        if (System.currentTimeMillis() < this.I_01) {
            n -= n / 5;
        }
        if (iOol.IlI0(215)) {
            n /= 2;
        }
        if (iII.IooO) {
            n *= 2;
        }
        boolean bl2 = bl = this.var_java_util_Random_IIl0.nextInt(100) < iOol.Il10();
        if (bl) {
            n = 0;
        } else {
            n -= n / 100 * iOol.Il1O();
            if ((n -= iOol.Il1_()) < 1) {
                n = 1;
            }
            if (iOol.IlIo(6)) {
                n /= 2;
            }
            if (iOol.IlIo(7)) {
                n = n / 100 * 40;
            }
            if (n < 1) {
                n = 1;
            }
            if (iOol.Ioo0) {
                n = 1;
            }
            if (n > iOol.Illo() * 35 / 100) {
                n = Math.max(1, iOol.Illo() * 35 / 100);
            }
        }
        if (this.Io01) {
            n = 0;
        }
        if (iOol.IlI0(217) && n >= iOol.llIl) {
            n = Math.max(0, iOol.llIl - 1);
        }
        iOol.llIl -= n;
        this.l11I();
        this.var_IOo__II1.II(new IO0o(-11).II(iII._l_1).IIII(n));
        int n3 = iOol.Il1o();
        if (n3 > 0 && n > 0 && !iII.IoOo) {
            int n4 = n * n3 / 100;
            if (n4 >= iII.llIl) {
                n4 = iII.llIl - 1;
            }
            if (n4 > 0) {
                iII.llIl -= n4;
                this.var_IOo__II1.II(new IO0o(-9).II(iII._l_1).IIII(iII.llIl).IIII(n4).II(false).II(36));
            }
        }
        if (iOol.llIl <= 0) {
            iOol.llIl = 0;
            this.l1lO();
            return true;
        }
        return false;
    }

    void l1l1() {
        IOol iOol = this.IOol_II();
        this.IIol(IOoI.I1O1("\ue4c5\ue4c5\ufa0c\ue49f\ue529\ufbc1\ue529\ue501\ue5a5\ue5c9\ue5a2\ue592\ue621\ue649\ue65b\ue67e", 58509) + this._IoO);
        this.var_IOo__II1.II(new IO0o(113).II(1).II(3).II(this._IoO).III(iOol.I1).III(iOol.I1I - 40).III(-1));
        this._IoO = this._IoO >= 150 ? 1 : this._IoO + 1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void l1l_() {
        IOol iOol = this.IOol_II();
        int n = iOol.IIo(153);
        if (n <= 0 || this.Io0_ || this.var_java_util_Random_IIl0.nextInt(100) >= Math.min(100, n)) {
            return;
        }
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue516\ue5ed\ue545\ue5b7\ue5c2\ue66f\uf8f5\ue61f\ue62d\ue61c\ue6e9\ue69b\ue6b1\ue691\ue771\ue717\ue735\ue71d\uf92b\ue7c7\ue7f3", 58509));
        this._lI0 = Math.max(1, iOol.Illo());
        this.Io0o = true;
        try {
            for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
                III iII = this.var_IOoI$III_arr_II[i];
                if (iII.IoOo || Math.abs(iII.I1 - iOol.I1) > 400 || Math.abs(iII.I1I - iOol.I1I) > 400) continue;
                try {
                    this.IIIl(i, null);
                    continue;
                }
                catch (RuntimeException runtimeException) {
                    runtimeException.printStackTrace();
                }
            }
        }
        finally {
            this.Io0o = false;
            this._lI0 = 0;
        }
    }

    private void l1lO() {
        IOol iOol = this.IOol_II();
        this.l1l_();
        this.IoO0 = false;
        this._Ioo = 0;
        this.var_IO0_II1.var_IOo0_II.I_1O();
        iOol._lo_ = 0;
        iOol.Ioo0 = false;
        iOol._loO = 0;
        this.IoOO = false;
        this.I_00 = 0L;
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            this.var_IOoI$III_arr_II[i].Ioo_ = false;
        }
        this.var_IO0_II1.I__O();
        this.var_IOo__II1.II(new IO0o(-17).II(0).III(iOol.I1).III(iOol.I1I).II(iOol.IO_l));
    }

    synchronized I0Io.III[] I0Io$III_arr_II(I0Io.II iI) {
        this._IoI = iI.I1l;
        this.var_I0Io$III_arr_II = iI.III;
        return this.var_I0Io$III_arr_II;
    }

    synchronized void void_II(I0Io.II iI) {
        int n;
        this.IIlo.removeAllElements();
        this.IoO0 = false;
        this._Ioo = 0;
        this.var_IO_I_II.Ioo1();
        this.var_IO_l_II.Ioo1();
        this.var_IO0_II1.var_IOo_II.Ioo1();
        this.var_IO0_II1.var_IOOo_II.Ioo1();
        this.var_IO0_II1.var_IO_1_II.Ioo1();
        this.II10(true);
        this.II1O(true);
        int n2 = n = this.IOol_II().lOlo >= 105 && this.IOol_II().lOlo <= 110 ? 1 : 0;
        if (n != this.Io0l) {
            this.Io0l = n;
            this.IIol(n != 0 ? IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue477\ufb3a\ue5ca\ue5e3\ue58a\ue6e1\ue64e\ue657\ue67e\ue609\ue6f5\ue6d5\ue6b2\ue6d9\ue75b\ue758\ue73a\ue711", 58509) : IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue514\ufb58\ue5cd\ue5e3\ue58a\ue6e1\ue64e\ue657\ue67e\ue609\ue6f5\ue6d5\ue6b2\ue6d9\ue75b\ue758\ue73a\ue711", 58509));
            this.IIol(n != 0 ? IOoI.I1O1("\ue4de\ufa45\ue4a8\ue4ca\ue57d\ufb8d\ue529\ue546\ue5e6\ue550\ue5ad\ue585\ue621\ue656\ue6df\ue67e\ue635\ue6cc\ue69b\ue6b9\uf81e\ue779\ue717\ue734\uf9d4\ue7fa\ue793\ue7b0\uf93a\ue830\ue848\ue827\uf6ce\ue8e1\ue88b\ue8ff\ue8d9\ue92d\ue907\ue930\ue989\ue9a4\ue9d2\ue9b7\ue900\uea20\uea73\uf49f\uea33\uea14", 58509) : IOoI.I1O1("\ue4de\ufa45\ue4a8\ue4ca\ue57d\ufb8d\ue529\ue546\ue5e6\ue550\ue5ad\ue585\ue621\ue656\ue6df\ue67e\ue635\ue6cc\ue69b\ue6b9\uf81e\ue779\ue717\ue734\uf9d4\ue7fa\ue793\ue6c3\ue712\ue830\ue85b\ue83c\uf6b2\ue8ac\ue8c7\uf66b\ue880\ue928\ue945\ue9aa\ue90b\ue9ec\ue983\ue9b6\ue989\uebb0\uf4c2\uea50\uea3a", 58509));
        }
        if (this.IOol_II().llIl > this.IOol_II().Illo()) {
            this.IOol_II().llIl = this.IOol_II().Illo();
        }
        this.var_IO0_II1.ll_0();
        this.var_IOoI$III_arr_II = new III[this.var_I0Io$III_arr_II.length];
        for (n = 0; n < this.var_IOoI$III_arr_II.length; ++n) {
            I0Io.III iII = this.var_I0Io$III_arr_II[n];
            III iII2 = new III();
            iII2._l_1 = n;
            iII2.l0o1 = iII.l0o1;
            iII2.lOl_ = iII.lOl_;
            iII2.lOlO = iII.llIl;
            iII2._l__ = iII.llIl;
            iII2.llIl = iII.llIl;
            iII2.I1 = iII.I1;
            iII2.I1I = iII.I1I;
            iII2.II = IOO.IOO$IIII_II(iII.l0o1);
            this.var_IOoI$III_arr_II[n] = iII2;
            if (!this.var_IO0_II1.var_IO_1_II.Il1I() || !IO_1.II_1(iI.I1l)) continue;
            iII2.lOlO = iII2.llIl = this.var_IO0_II1.var_IO_1_II.II1o(iII.l0o1);
            iII2._l__ = iII2.llIl;
            iII2._l_O = this.var_IO0_II1.var_IO_1_II.II_(iII.l0o1);
            if (!this.var_IO0_II1.var_IO_1_II.IIIO(iI.I1l, n)) continue;
            iII2.IoOo = true;
            iII2.llIl = 0;
            iII2.IO1o = Long.MAX_VALUE;
        }
        this.l11_();
        if (this.var_IO0_II1.var_IOOO_II.Il1I() && IOOO.IIO1(iI.I1l)) {
            this.var_IO0_II1.var_IOOO_II.IlO(iI.I1l);
        }
        if (this.var_IO0_II1.var_I0_II.Il1I() && iI.I1l == 146) {
            for (n = 0; n < this.var_IOoI$III_arr_II.length; ++n) {
                this.var_IOoI$III_arr_II[n].lOlO = this.var_IOoI$III_arr_II[n].llIl = this.var_IO0_II1.var_I0_II.II1o(this.var_IOoI$III_arr_II[n].l0o1);
                this.var_IOoI$III_arr_II[n]._l__ = this.var_IOoI$III_arr_II[n].llIl;
                this.var_IOoI$III_arr_II[n]._l_O = this.var_IO0_II1.var_I0_II.II_(this.var_IOoI$III_arr_II[n].l0o1);
            }
            this.var_IO0_II1.var_I0_II.l1oo();
        }
        IOol iOol = this.IOol_II();
        if (iOol.llIl <= 0) {
            iOol.llIl = iOol.Illo();
            this.l1O0();
        }
        this.I_oO = 0L;
        if (!this.Iool) {
            this.Iool = true;
            this.l1_I();
            this.var_IO0_II1.ll1_();
            this.l1OI();
            IO__.II(this.var_IOo__II1);
        }
        this.I11I(iI.I1l);
    }

    synchronized void lIlI() {
        this.var_IO0_II1.ll_l();
        this.var_IO_I_II.Ioo_();
        if (this.IOol_II() != null) {
            this.var_IO_l_II.II1_(this.IOol_II().lOlo, this.IOol_II().lO1);
        }
        this.var_IO0_II1.var_IOo_II.lIlI();
        this.var_IO0_II1.var_IOOo_II.lIlI();
        this.var_IO0_II1.var_IO_1_II.lIlI();
        this.var_IO0_II1.var_IO0__II.lIlI();
        this.l1_o();
        this.l10O();
        if (!this.Ioo1) {
            this.Ioo1 = true;
            if (this.Il0O()) {
                this.IIol(IOoI.I1O1("\ue4c0\ufa0b\ue4a6\ue4ca\ue56a\ue5da\ue529\ue546", 58509) + this.II1());
            }
        }
        if (this.IOol_II() != null && this._IoI >= 21 && this._IoI <= 23 && this.IOol_II()._lOI >= 3) {
            this.l1l0();
            this.l1lo();
        }
    }

    private void l1l0() {
        for (int i = this.IIlo.size() - 1; i >= 0; --i) {
            if (((II)this.IIlo.elementAt((int)i)).I1l != 29999) continue;
            this.IIlo.removeElementAt(i);
        }
    }

    void l1lo() {
        int n = this._IoI;
        int n2 = n == 22 ? 56 : 633;
        int n3 = n == 23 ? 320 : 315;
        for (int i = 0; i < this.IIlo.size(); ++i) {
            if (((II)this.IIlo.elementAt((int)i)).I1l != 29999) continue;
            return;
        }
        II iI = new II();
        iI.I1l = 29999;
        iI.l0o1 = 74;
        iI.lo0I = 1;
        iI.I1 = n2;
        iI.I1I = n3;
        iI.IO1O = Long.MAX_VALUE;
        this.IIlo.addElement(iI);
        this.var_IOo__II1.II(new IO0o(68).III(iI.I1l).III(74).III(n2).III(n3).IIII(3));
    }

    synchronized boolean IlOo() {
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            III iII = this.var_IOoI$III_arr_II[i];
            if (iII.l0o1 <= 0 || iII.IoOo) continue;
            iII.IooO = true;
            iII.llIl = iII.lOlO = iII._l__ * 10;
            iII.Ioo_ = false;
            this.var_IOo__II1.II(new IO0o(-13).II(iII._l_1).II(iII.l0o1).II(1).IIII(iII.llIl));
            this.IIol(IOoI.I1O1("\ue4dc\ue4d9\ue42a\ue483\ue529\ue55c\ue52e\ue508\ue5ed\ue584\ue5a2\ue58c\ue669\ue600", 58509) + (iII.II == null ? "" : iII.II.II1o) + IOoI.I1O1("\ue4ad\ue4d4\ue4be\ufa4f\ue57d\ue508\ue52f\ue50f\ufb42\ue5ca\ue5e2", 58509));
            return true;
        }
        return false;
    }

    synchronized void l11() {
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            III iII = this.var_IOoI$III_arr_II[i];
            if (iII.IoOo || iII.III != null) continue;
            iII.llIl = 1;
            this.IIIl(i, null);
        }
    }

    synchronized void IIlO(DataInputStream dataInputStream) throws IOException {
        this._I0o = dataInputStream.readShort();
    }

    private IOO.IIIO IOO$IIIO_II() {
        IOol iOol = this.IOol_II();
        IOO.IIIO iIIO = null;
        for (int i = 0; i < iOol.I__l.length; ++i) {
            IOO.IIIO iIIO2 = IOO.IOO$IIIO_II(iOol.I__l[i]);
            if (iIIO2 == null) continue;
            if (iIIO == null) {
                iIIO = iIIO2;
            }
            if (iIIO2.lO0I != this._I0o) continue;
            return iIIO2;
        }
        return iIIO;
    }

    synchronized void IIl0(DataInputStream dataInputStream) {
        byte by;
        IOol iOol = this.IOol_II();
        if (iOol == null || iOol.llIl <= 0 || this.var_IO0_II1.var_IOo0_II.Ilo1()) {
            return;
        }
        try {
            by = dataInputStream.readByte();
            if (by == -1) {
                return;
            }
        }
        catch (IOException iOException) {
            return;
        }
        this.I1II(by & 0xFF);
    }

    synchronized void IIlo(DataInputStream dataInputStream) {
        IOol iOol = this.IOol_II();
        if (iOol == null || iOol.llIl <= 0 || this.var_IO0_II1.var_IOo0_II.Ilo1()) {
            return;
        }
        try {
            int n = (dataInputStream.available() - 1) / 4;
            for (int i = 0; i < n; ++i) {
                IO_I.III iII = this.var_IO_I_II.IO_I$III_II(dataInputStream.readInt());
                if (iII == null || iII.var_IOoI$III_II == null || !this.var_IO_I_II.boolean_III(iII)) continue;
                this.I1II(iII.var_IOoI$III_II._l_1);
                return;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private void I1II(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        if (iOol == null || iOol.llIl <= 0) {
            return;
        }
        if (n >= this.var_IOoI$III_arr_II.length || this.var_IOoI$III_arr_II[n].IoOo) {
            return;
        }
        if (System.currentTimeMillis() - this.I_o0 < 250L) {
            return;
        }
        IOO.IIIO iIIO = this.IOO$IIIO_II();
        if (iIIO != null && iIIO.lO0I == 7) {
            this.void_II(iIIO);
            return;
        }
        if (iIIO != null && !IOoI.IIol(iIIO.lO0I) && !IOoI.IIoI(iIIO.lO0I)) {
            this.IIoI(IOoI.I1O1("\ue4ce\ue4c4\ue4a2\ue400\ue57c\ue508\ue529\ue586\ue5fc\ue584\ue5a0\ue58a\ue7b1\ue641\ue61f\ue62a\ue615\uf85f\ue69b\ue6be\ue600\ue776\ue750\ue776\ue664\uf957\ue793\ue7a6\uf954\ue87e\ue80f\ue82d\ue899\ue8e2\ue8cc", 58509));
            return;
        }
        long l = System.currentTimeMillis();
        if (iIIO != null && l - this.IIll[iIIO.lO0I & 0x1F] < (long)(iIIO.loIl - 400)) {
            return;
        }
        if (iIIO == null && l - this.I_o0 < 1000L) {
            return;
        }
        if (iOol._l0_ <= 0) {
            this.IIol(IOoI.I1O1("\ue4d9\ue4c4\ufa08\ue4ca\ue565\ufbd9\ue524\ue546\ue494\ue547\ue5e3\ue581\uf8a0\ue64e\ue61f\ue635\ue614\uf85b\ue6cf\ue6f6\ue6d9\ue770\ue7d4\ue72f\ue755\ue7fa\ue7d4\ue7ba\uf938\ue830\ue841\ue829\ue9cc\ue8e5\ue88b\ue9db\uf62a\ue928\ue94b\uf7e3\ue91c\ue9a4\ue9cf\uf763\ue988\uea20\uea6c\uf4d7\uea3e", 58509));
            return;
        }
        int n3 = 0;
        if (iIIO != null) {
            int n4 = iIIO.loII == 0 ? iIIO.loI : (n3 = iIIO.loII == 1 ? Math.max(1, iOol.Il1() * iIIO.loI / 100) : iOol._loI);
        }
        if (iIIO != null && iIIO.lO0I == 14) {
            if (this.IO == 0L || l - this.IO > 8000L) {
                this.IO = l;
                this.var_IOO$IIIO_III = iIIO;
                this.var_IOo__II1.II(new IO0o(-45).II(7).IIII(iOol.I1l).III(iIIO.I1l).III(2000));
                return;
            }
            if (l - this.IO < 1500L) {
                return;
            }
            this.IO = 0L;
            this.var_IOO$IIIO_III = null;
            this.IIll[14] = l;
            this.II(iIIO, l);
            this.IIII(iIIO);
            return;
        }
        if (n3 > iOol._loI && (iIIO == null || iIIO.lO0I != 10 && iIIO.lO0I != 11 || this._Ioo == iIIO.lO0I)) {
            this.IIoI(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456\ufb81\ue5a5\ue5ef\ue58a\ue5c2\ue710\uf8e3\ue61f\ue62d\uf890\ue6bc\ue6df\uf83f\ue697\ue77f\ue717\ue735\ue71d\ue7fd\ue759\ue7a7\ue7d1\ue87e\ue8cf\ue837", 58509));
            return;
        }
        if (iIIO != null && (iIIO.lO0I == 10 || iIIO.lO0I == 11)) {
            int n5 = n2 = iIIO.lO0I == 10 ? 4000 : 3000;
            if (this._Ioo != iIIO.lO0I || l - this.I_oo > (long)(n2 + 10000)) {
                System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1", 58509) + iIIO.lO0I + IOoI.I1O1("\ue4ad\ue4ce\ue4aa\ue49e\ue529\ue54c\ue526\ue513\ue5a5\ue5d0\ue5b6\ue5c2\ue629\ue643\ue657\ue631\ue65d", 58509) + n2 + IOoI.I1O1("\ue4e0\ue4df\ue4e2", 58509));
                this._Ioo = iIIO.lO0I;
                this.I_oo = l;
                this._l = n;
                this.var_IOo__II1.II(new IO0o(-45).II(4).IIII(iOol.I1l).III(iIIO.I1l).III(n2));
                return;
            }
            if (l - this.I_oo < 400L) {
                return;
            }
            System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1", 58509) + iIIO.lO0I + IOoI.I1O1("\ue4ad\ue4dc\ue4a3\ue485\ue567\ue54f\ue57d\ue546\ue5e8\ue5d4\ue5fe", 58509) + iOol._loI + IOoI.I1O1("\ue4ad\ue4c1\ue4bb\ue4a7\ue568\ue550\ue57a", 58509) + iOol.Il1() + IOoI.I1O1("\ue4ad\ue4c8\ue4a6\ue48d\ue52c\ue515", 58509) + iIIO.lo);
            this._Ioo = 0;
            if (n3 > iOol._loI) {
                this.IIoI(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456\ufb81\ue5a5\ue5ef\ue58a\ue5c2\ue710\uf8e3\ue61f\ue62d\uf890\ue6bc\ue6df\uf83f\ue697\ue77f\ue717\ue735\ue71d\ue7fd\ue759\ue7a7\ue7d1\ue87e\ue8cf\ue837", 58509));
                return;
            }
        }
        if (iIIO != null && iIIO.lO0I == 9) {
            n2 = iOol.II(IOol.I_OO);
            int n6 = iOol.Illo() / 100 * (n2 == 5 ? 3 : (n2 == 4 ? 5 : 10));
            if (iOol.llIl <= n6) {
                this.IIoI(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456\ufb81\ue5a5\ue5ec\ue593\ue5c2\ue710\uf8e3\ue61f\ue63a\ue684\ue6f2\ue6dc\ue6fa\ue6b2\ue779\ue75e\ue739\ue71e\ue7f1\ue7dd", 58509));
                return;
            }
            iOol.llIl -= n6;
            this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
        }
        if (iIIO != null) {
            this.IIll[iIIO.lO0I & 0x1F] = l;
        }
        if (iIIO != null) {
            this.II(iIIO, l);
        }
        this.I_o0 = l;
        iOol.IO_o = l;
        iOol.Iooo = false;
        if (iIIO == null || IOoI.IlI_(iIIO.lO0I)) {
            this.IOIO = l;
        }
        if (iIIO != null) {
            this.var_IO0_II1.var_IO1o_II.Ill1(iIIO.lO0I);
        }
        this.l11I();
        if (!iOol.IlI0(218) && ++iOol._1II >= 500) {
            iOol._1II = 0;
            --iOol._l0_;
            this.var_IOo__II1.II(new IO0o(-68).III(iOol._l0_));
        }
        if (n3 > 0) {
            iOol._loI -= n3;
            this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
        }
        if (iIIO != null && IOoI.IIoI(iIIO.lO0I)) {
            if (iIIO.lO0I == 20) {
                this.III(n, iIIO);
            }
            this.IIII(n, iIIO);
            n2 = iIIO.loI1 - 1;
            if (n2 > 0) {
                III iII = this.var_IOoI$III_arr_II[n];
                int n7 = iIIO.l1_0 > 0 ? iIIO.l1_0 : 100;
                int n8 = iIIO.l1_o > 0 ? iIIO.l1_o : 100;
                for (int i = 0; i < this.var_IOoI$III_arr_II.length && n2 > 0; ++i) {
                    III iII2 = this.var_IOoI$III_arr_II[i];
                    if (i == n || iII2.IoOo || Math.abs(iII2.I1 - iII.I1) > n7 || Math.abs(iII2.I1I - iII.I1I) > n8) continue;
                    this.IIII(i, iIIO);
                    --n2;
                }
            }
            return;
        }
        if (iIIO != null && iIIO.lO0I == 11) {
            this._lI0 = Math.max(1, (int)Math.min(Integer.MAX_VALUE, (long)iOol.Il1() * (long)iIIO.lo / 100L));
            this.IIIl(n, iIIO);
            this._lI0 = 0;
            return;
        }
        if (iIIO != null && iIIO.lO0I == 10) {
            this.II(n, iIIO);
            return;
        }
        this.IIIl(n, iIIO);
        int n9 = n2 = iIIO == null ? 0 : iIIO.loI1 - 1;
        if (n2 > 0) {
            III iII = this.var_IOoI$III_arr_II[n];
            int n10 = iIIO.l1_0 > 0 ? iIIO.l1_0 : 100;
            int n11 = iIIO.l1_o > 0 ? iIIO.l1_o : 100;
            for (int i = 0; i < this.var_IOoI$III_arr_II.length && n2 > 0; ++i) {
                III iII3 = this.var_IOoI$III_arr_II[i];
                if (i == n || iII3.IoOo || Math.abs(iII3.I1 - iII.I1) > n10 || Math.abs(iII3.I1I - iII.I1I) > n11) continue;
                this.IIIl(i, iIIO);
                --n2;
            }
        }
    }

    private void II(int n, IOO.IIIO iIIO) {
        IOol iOol = this.IOol_II();
        int n2 = 350 + iIIO.l1__ * 30;
        long l = 0L;
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            III iII = this.var_IOoI$III_arr_II[i];
            if (iII.IoOo || Math.abs(iII.I1 - iOol.I1) > n2 || Math.abs(iII.I1I - iOol.I1I) > n2) continue;
            l += (long)iII.llIl;
        }
        long l2 = l * 10L / 100L + (long)iOol.Il1I() * 10L;
        l2 += l2 * (long)(this.var_java_util_Random_IIl0.nextInt(11) - 5) / 100L;
        int n3 = (int)Math.max(1L, Math.min(Integer.MAX_VALUE, l2));
        III iII = this.var_IOoI$III_arr_II[n];
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            III iII2 = this.var_IOoI$III_arr_II[i];
            if (iII2.IoOo || i != n && (Math.abs(iII2.I1 - iII.I1) > n2 || Math.abs(iII2.I1I - iII.I1I) > n2)) continue;
            this._lI0 = n3;
            this.IIIl(i, iIIO);
        }
        this._lI0 = 0;
    }

    private void void_II(IOO.IIIO iIIO) {
        IOol iOol = this.IOol_II();
        if (!this.boolean_II(iIIO)) {
            return;
        }
        int n = (iIIO.l1__ + 9) * 5;
        this.var_IOo__II1.II(new IO0o(-60).IIII(iOol.I1l).II(iIIO.I1l).II(1).IIII(iOol.I1l).II(0));
        iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + (int)((long)iOol.Illo() * (long)n / 100L));
        iOol._loI = Math.min(iOol.Il1(), iOol._loI + (int)((long)iOol.Il1() * (long)n / 100L));
        this.l1O0();
    }

    private void void_III(IOO.IIIO iIIO) {
        IOol iOol = this.IOol_II();
        this.l1Io();
        int n = Math.max(1, Math.min(8, iIIO.l1__));
        int n2 = (new int[]{8, 11, 32, 25, 43, 49, 50, 96})[n - 1];
        this._I01 = (int)((long)iOol.Illo() * (long)(new int[]{30, 40, 50, 60, 70, 80, 90, 100})[n - 1] / 100L);
        this.IoO0 = true;
        long l = System.currentTimeMillis();
        this.I_O_ = l + (long)(n + 5) * 20000L;
        this.I_OO = l + 2500L;
        this.var_IOo__II1.II(new IO0o(-95).II(0).IIII(iOol.I1l).III(n2).IIII(this._I01));
    }

    private void l1Io() {
        if (!this.IoO0) {
            return;
        }
        this.IoO0 = false;
        this.var_IOo__II1.II(new IO0o(-95).II(6).IIII(this.IOol_II().I1l));
        this.var_IOo__II1.II(new IO0o(-95).II(7).IIII(this.IOol_II().I1l));
    }

    private void IIlI(long l) {
        if (!this.IoO0) {
            return;
        }
        if (l >= this.I_O_) {
            this.l1Io();
            return;
        }
        if (l < this.I_OO) {
            return;
        }
        this.I_OO = l + 2500L;
        IOol iOol = this.IOol_II();
        int n = -1;
        int n2 = 0x40000000;
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            III iII = this.var_IOoI$III_arr_II[i];
            if (iII.IoOo || iII.l0o1 == 0) continue;
            int n3 = Math.abs(iII.I1 - iOol.I1) + Math.abs(iII.I1I - iOol.I1I) * 2;
            if (Math.abs(iII.I1 - iOol.I1) > 300 || Math.abs(iII.I1I - iOol.I1I) > 160 || n3 >= n2) continue;
            n2 = n3;
            n = i;
        }
        if (n < 0) {
            return;
        }
        this.var_IOo__II1.II(new IO0o(-95).II(1).IIII(iOol.I1l).II(n));
        this._lI0 = Math.max(1, iOol.Il1I());
        if (iOol.II(IOol.I_0) == 5) {
            this._lI0 = (int)Math.min(Integer.MAX_VALUE, (long)this._lI0 * 4L);
        }
        this.IIIl(n, null);
        this._lI0 = 0;
    }

    private IOO.IIIO III(int n) {
        IOol iOol = this.IOol_II();
        for (int i = 0; i < iOol.I__l.length; ++i) {
            IOO.IIIO iIIO = IOO.IOO$IIIO_II(iOol.I__l[i]);
            if (iIIO == null || iIIO.lO0I != n) continue;
            return iIIO;
        }
        return null;
    }

    private void II(IOO.IIIO iIIO, long l) {
        if (iIIO == null) {
            return;
        }
        IOol iOol = this.IOol_II();
        int n = iIIO.lO0I;
        int n2 = 0;
        int n3 = iOol._lo0;
        switch (n) {
            case 7: {
                if (n3 != 10) break;
                n2 = iOol._loo;
                break;
            }
            case 6: {
                if (n3 != 3) break;
                n2 = iOol._loo;
                break;
            }
            case 10: {
                if (n3 != 4) break;
                n2 = iOol._loo;
                break;
            }
            case 19: {
                if (n3 != 5 && n3 != 15 && n3 != 20) break;
                n2 = iOol._loo;
                break;
            }
            case 11: {
                if (n3 != 11) break;
                n2 = iOol._loo;
                break;
            }
            case 12: {
                if (n3 != 12) break;
                n2 = iOol._loo;
                break;
            }
            case 14: {
                if (n3 != 19) break;
                n2 = iOol._loo;
                break;
            }
            case 21: {
                if (n3 != 21) break;
                n2 = iOol._loo;
                break;
            }
            case 3: {
                int n4;
                if (n3 == 9) {
                    n2 = iOol._loo;
                }
                n2 += (n4 = iOol.II(IOol.I_O0)) == 5 ? 50 : (n4 == 4 ? 20 : 0);
                break;
            }
        }
        if (n2 <= 0 || n2 > 100) {
            return;
        }
        long l2 = (long)iIIO.loIl * (long)(100 - n2) / 100L;
        this.IIll[n & 0x1F] = l - (long)iIIO.loIl + l2;
        this.IIl1[n & 0x1F] = l + l2;
    }

    private boolean boolean_II(IOO.IIIO iIIO) {
        int n;
        IOol iOol = this.IOol_II();
        long l = System.currentTimeMillis();
        if (l - this.IIll[iIIO.lO0I & 0x1F] < (long)(iIIO.loIl - 400)) {
            return false;
        }
        int n2 = iIIO.loII == 0 ? iIIO.loI : (n = iIIO.loII == 1 ? Math.max(1, iOol.Il1() * iIIO.loI / 100) : iOol._loI);
        if (n > iOol._loI) {
            this.IIoI(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue456\ufb81\ue5a5\ue5ef\ue58a\ue5c2\ue710\uf8e3\ue61f\ue62d\uf890\ue6bc\ue6df\uf83f\ue697\ue77f\ue717\ue735\ue71d\ue7fd\ue759\ue7a7\ue7d1\ue87e\ue8cf\ue837", 58509));
            return false;
        }
        this.IIll[iIIO.lO0I & 0x1F] = l;
        this.II(iIIO, l);
        if (n > 0) {
            iOol._loI -= n;
            this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
        }
        return true;
    }

    private void IIO1(int n, int n2) {
        int n3 = this.IOol_II().I1l;
        this.var_IOo__II1.II(new IO0o(-124).II(n).II(0).II(n2).IIII(n3).IIII(n3));
    }

    synchronized void II1(DataInputStream dataInputStream) throws IOException {
        IOol iOol = this.IOol_II();
        if (iOol == null || iOol.llIl <= 0 || this.var_IO0_II1.var_IOo0_II.Ilo1()) {
            return;
        }
        byte by = dataInputStream.readByte();
        long l = System.currentTimeMillis();
        switch (by) {
            case 0: {
                int n;
                IOO.IIIO iIIO = this.III(6);
                if (iIIO == null || !this.boolean_II(iIIO)) {
                    return;
                }
                this.l11I();
                int n2 = 120 + iIIO.l1__ * 30;
                int n3 = iIIO.l1__ + 2;
                if (iOol.II(IOol.I_0I) >= 5) {
                    n3 *= 2;
                }
                Vector<III> vector = new Vector<III>();
                Vector<IO_I.III> vector2 = new Vector<IO_I.III>();
                for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
                    III iII = this.var_IOoI$III_arr_II[i];
                    if (iII.IoOo) continue;
                    if (iII.III != null) {
                        if (!this.var_IO_I_II.boolean_III(iII.III) || Math.abs(iII.III.I1 - iOol.I1) > n2 || Math.abs(iII.III.I1I - iOol.I1I) > n2) continue;
                        vector2.addElement(iII.III);
                        continue;
                    }
                    if (Math.abs(iII.I1 - iOol.I1) > n2 || Math.abs(iII.I1I - iOol.I1I) > n2) continue;
                    iII.I110 = l + (long)n3 * 1000L;
                    vector.addElement(iII);
                }
                IO0o iO0o = new IO0o(-45).II(0).IIII(iOol.I1l).III(iIIO.I1l).II(vector.size());
                for (n = 0; n < vector.size(); ++n) {
                    iO0o.II(((III)vector.elementAt((int)n))._l_1).II(n3);
                }
                iO0o.II(vector2.size());
                for (n = 0; n < vector2.size(); ++n) {
                    iO0o.IIII(((IO_I.III)vector2.elementAt((int)n)).I1l).II(n3);
                    this.var_IO_I_II.void_II((IO_I.III)vector2.elementAt(n), n3 * 1000, 40);
                }
                this.var_IOo__II1.II(iO0o);
                break;
            }
            case 1: {
                IOO.IIIO iIIO = this.III(8);
                if (iIIO == null || this.IoOO) {
                    return;
                }
                this.IoOO = true;
                this._Io = 0;
                this.I_0O = l + 1000L;
                this.var_IOo__II1.II(new IO0o(-45).II(1).IIII(iOol.I1l).III(iIIO.I1l));
                break;
            }
            case 3: {
                this.l11I();
                break;
            }
            case 4: {
                int n;
                IOO.IIIO iIIO = this.IOO$IIIO_II();
                if (iIIO == null || iIIO.lO0I != 10 && iIIO.lO0I != 11) {
                    return;
                }
                if (l - this.IIll[iIIO.lO0I & 0x1F] < (long)(iIIO.loIl - 400)) {
                    return;
                }
                int n4 = iIIO.loII == 0 ? iIIO.loI : (n = iIIO.loII == 1 ? Math.max(1, iOol.Il1() * iIIO.loI / 100) : 1);
                if (iOol._loI < n) {
                    return;
                }
                this.l11I();
                int n5 = iIIO.lO0I == 10 ? 4000 : 3000;
                this._Ioo = iIIO.lO0I;
                this.I_oo = l;
                this._l = -1;
                System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue512\ue5f0\ue584\ue5a8\ue58a\ue668\ue600\ue64b\ue62e\ue611\ue6a1", 58509) + iIIO.lO0I + IOoI.I1O1("\ue4ad\ue4ce\ue4aa\ue49e\ue529\ue54c\ue526\ue513\ue5a5\ue5d0\ue5b6\ue5c2\ue629\ue647\ue650\ue637\ue65d\ue6b1\ue68f\ue6ef\ue6d9\ue76b\ue743\ue737\ue701\ue7e1\ue7c0\ue7f2\ue7c5\ue839", 58509));
                this.var_IOo__II1.II(new IO0o(-45).II(4).IIII(iOol.I1l).III(iIIO.I1l).III(n5));
                break;
            }
            case 6: {
                IOO.IIIO iIIO = this.III(13);
                if (iIIO == null || iOol._lo_ > 0 || this.I_00 > 0L) {
                    return;
                }
                if (!this.boolean_II(iIIO)) {
                    return;
                }
                this.l11I();
                this.var_IOo__II1.II(new IO0o(-45).II(6).IIII(iOol.I1l).III(iIIO.I1l));
                this.I_00 = l + 1500L;
                break;
            }
            case 7: {
                IOO.IIIO iIIO = this.III(14);
                if (iIIO == null) {
                    return;
                }
                if (this.IO == 0L || l - this.IO > 8000L) {
                    if (l - this.IIll[14] < (long)(iIIO.loIl - 400)) {
                        return;
                    }
                    this.IO = l;
                    this.var_IOO$IIIO_III = iIIO;
                    this.l11I();
                    this.var_IOo__II1.II(new IO0o(-45).II(7).IIII(iOol.I1l).III(iIIO.I1l).III(2000));
                    return;
                }
                if (l - this.IO < 1500L) {
                    return;
                }
                this.IO = 0L;
                this.var_IOO$IIIO_III = null;
                this.IIll[14] = l;
                this.II(iIIO, l);
                this.IIII(iIIO);
                break;
            }
            case 8: {
                IOO.IIIO iIIO = this.III(12);
                if (iIIO == null || !this.boolean_II(iIIO)) {
                    return;
                }
                this.l11I();
                this.void_III(iIIO);
                break;
            }
            case 9: {
                IOO.IIIO iIIO = this.III(19);
                if (iIIO == null || !this.boolean_II(iIIO)) {
                    return;
                }
                this.l11I();
                iOol.Ioo0 = true;
                this.I_O1 = l + (long)(iIIO.l1__ + 2) * 5000L;
                this.IIO1(1, 33);
                this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue4a2\ue400\ue567\ue508\ue529\ue465\ue5eb\ue5c3\ue5e3\ue58e\ue7b1\uf8c3\ue651\ue639\ue65d\ue78d\ue658\ue6fa\ue69b\uf9b5\ue743", 58509));
                break;
            }
            case 10: {
                IOO.IIIO iIIO = this.III(21);
                if (iIIO == null || !this.boolean_II(iIIO)) {
                    return;
                }
                this.l11I();
                iOol._loO = (iIIO.l1__ + 3) * 10;
                this.I_0o = l + 30000L;
                iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + iOol.llIl * iOol._loO / 100);
                this.IIO1(1, 39);
                this.var_IO0_II1.ll_0();
                this.l1O0();
                break;
            }
        }
    }

    private void l11I() {
        if (!this.IoOO) {
            return;
        }
        this.IoOO = false;
        this.var_IOo__II1.II(new IO0o(-45).II(3).IIII(this.IOol_II().I1l).III(-1));
    }

    private void IIlo(long l) {
        int n;
        IOO.IIIO iIIO;
        IOol iOol = this.IOol_II();
        if (this.IoOO && l >= this.I_0O) {
            this.I_0O = l + 1000L;
            iIIO = this.III(8);
            n = iIIO == null ? 4 : iIIO.l1__ + 3;
            int n2 = iOol.Illo();
            int n3 = iOol.Il1();
            if (iOol.llIl >= n2 && iOol._loI >= n3) {
                this.l11I();
            } else {
                iOol.llIl = Math.min(n2, iOol.llIl + n2 / 100 * n);
                iOol._loI = Math.min(n3, iOol._loI + n3 / 100 * n);
                this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
                this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
                if (++this._Io >= 10) {
                    this.l11I();
                }
            }
        }
        if (this.I_00 > 0L && l >= this.I_00) {
            this.I_00 = 0L;
            iIIO = this.III(13);
            iOol._lo_ = n = iIIO == null ? 1 : iIIO.l1__;
            this.I_Ol = l + (long)(n + 5) * 10000L * (long)(iOol.II(IOol.I_0l) >= 5 ? 5 : 1);
            if (iIIO != null) {
                this.var_IOo__II1.II(new IO0o(-45).II(6).IIII(iOol.I1l).III(iIIO.I1l));
            }
            iOol.llIl = Math.min(iOol.Illo(), iOol.llIl * 2);
            this.var_IO0_II1.ll__();
            this.var_IO0_II1.ll_0();
            this.l1O0();
        }
        if (iOol._lo_ > 0 && l >= this.I_Ol) {
            iOol._lo_ = 0;
            if (iOol.llIl > iOol.Illo()) {
                iOol.llIl = iOol.Illo();
            }
            this.var_IOo__II1.II(new IO0o(-90).II(-1).IIII(iOol.I1l));
            this.var_IO0_II1.ll__();
            this.var_IO0_II1.ll_0();
            this.l1O0();
        }
        if (iOol.Ioo0 && l >= this.I_O1) {
            iOol.Ioo0 = false;
            this.IIO1(0, 33);
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue4a2\ue400\ue567\ue508\ue529\ue465\ue5eb\ue5c3\ue5e3\ue58e\ue7b1\uf8c3\ue651\ue639\ue65d\ue78d\ue658\ue6fa\ue691\uf9a7\ue743", 58509));
        }
        if (iOol._loO > 0 && l >= this.I_0o) {
            iOol._loO = 0;
            this.IIO1(0, 39);
            if (iOol.llIl > iOol.Illo()) {
                iOol.llIl = iOol.Illo();
            }
            this.var_IO0_II1.ll_0();
            this.l1O0();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void III(int n, IOO.IIIO iIIO) {
        IOol iOol = this.IOol_II();
        III iII = this.var_IOoI$III_arr_II[n];
        if (iII.IoOo) {
            return;
        }
        int n2 = iII.III != null ? iII.III.I1 : iII.I1;
        int n3 = iII.III != null ? iII.III.I1I : iII.I1I;
        iOol.I1 = n2;
        iOol.I1I = n3;
        this.var_IOo__II1.II(new IO0o(123).IIII(iOol.I1l).III(n2).III(n3).II(1));
        this.Io0O = true;
        try {
            this.IIIl(n, iIIO);
        }
        finally {
            this.Io0O = false;
        }
    }

    private static boolean IIoI(int n) {
        return n == 18 || n == 20 || n == 22 || n == 23;
    }

    private void IIII(int n, IOO.IIIO iIIO) {
        int n2;
        int n3;
        int n4;
        III iII = this.var_IOoI$III_arr_II[n];
        if (iII.IoOo) {
            return;
        }
        if (iII.III != null) {
            this.III(iII.III, iIIO);
            return;
        }
        long l = System.currentTimeMillis();
        if (iIIO.lO0I == 18) {
            iII.I110 = l + 30000L;
            iII.IO_ = l + 30000L;
            this.var_IOo__II1.II(new IO0o(-112).II(1).II(iII._l_1).III(4133));
            if (this.IOol_II()._lo0 == 14) {
                this.IOol_II()._11O = this.IOol_II()._loo;
            }
            return;
        }
        if (iIIO.lO0I == 23) {
            n4 = iIIO.l1__ * 5000;
            n3 = 32;
        } else if (iIIO.lO0I == 22) {
            n4 = (iIIO.l1__ + 4) * 1000;
            n3 = 41;
        } else {
            n4 = (iIIO.l1__ + 1) * 500;
            n3 = 40;
        }
        iII.I110 = l + (long)n4;
        iII.I11o = l + (long)n4;
        iII.lO_1 = n3;
        this.var_IOo__II1.II(new IO0o(-124).II(1).II(1).II(n3).II(iII._l_1).IIII(this.IOol_II().I1l));
        IOol iOol = this.IOol_II();
        int n5 = iIIO.lO0I == 20 ? 6 : (n2 = iIIO.lO0I == 22 ? 7 : 22);
        if (iOol._lo0 == n2) {
            iOol._11O = iOol._loo;
        }
    }

    private void III(IO_I.III iII, IOO.IIIO iIIO) {
        int n;
        int n2;
        int n3;
        if (!this.var_IO_I_II.boolean_III(iII)) {
            return;
        }
        if (iIIO.lO0I == 18) {
            n3 = 30000;
            n2 = -1;
        } else if (iIIO.lO0I == 23) {
            n3 = iIIO.l1__ * 5000;
            n2 = 32;
            if (iII.var_IO_I$IIII_II.lIlI.equals(IOoI.I1O1("\ue4cf\ue4ed\ue489\ue4b3", 58509))) {
                n3 = 5000;
            }
        } else if (iIIO.lO0I == 22) {
            n3 = (iIIO.l1__ + 4) * 1000;
            n2 = 41;
        } else {
            n3 = (iIIO.l1__ + 1) * 500;
            n2 = 40;
        }
        this.var_IO_I_II.void_II(iII, n3, n2);
        IOol iOol = this.IOol_II();
        int n4 = iIIO.lO0I == 18 ? 14 : (iIIO.lO0I == 20 ? 6 : (n = iIIO.lO0I == 22 ? 7 : 22));
        if (iOol._lo0 == n) {
            iOol._11O = iOol._loo;
        }
    }

    void II00(String string) {
        this.var_IOo__II1.II(new IO0o(93).II(string));
    }

    private void II(III iII, int n, boolean bl, IOO.IIIO iIIO) {
        int n2 = this.var_IO_I_II.II(iII.III, n, bl, iIIO);
        if (n2 > 0) {
            this.II(n2, false, iII.III.I1, iII.III.I1I);
        }
        iII.IoOo = !this.var_IO_I_II.boolean_III(iII.III);
    }

    III II(IO_I.III iII) {
        III iII2 = new III();
        iII2._l_1 = this.var_IOoI$III_arr_II.length;
        iII2.III = iII;
        iII2.l0o1 = 0;
        iII2.llIl = 1;
        iII2._l__ = 1;
        iII2.lOlO = 1;
        iII2.I1 = iII.I1;
        iII2.I1I = iII.I1I;
        III[] iIIArray = new III[this.var_IOoI$III_arr_II.length + 1];
        System.arraycopy(this.var_IOoI$III_arr_II, 0, iIIArray, 0, this.var_IOoI$III_arr_II.length);
        iIIArray[iII2._l_1] = iII2;
        this.var_IOoI$III_arr_II = iIIArray;
        return iII2;
    }

    boolean II(IO_I.III iII, IOO.IIIO iIIO, int n) {
        boolean bl;
        int n2;
        boolean bl2;
        IOol iOol = this.IOol_II();
        if (iOol.llIl <= 0) {
            return false;
        }
        this.IOI0 = System.currentTimeMillis();
        if (iOol.IOOo > this.IOI0 && this.IOI0 - this.IOIl > 5000L) {
            this.Io00 = true;
        }
        int n3 = n;
        if (System.currentTimeMillis() < iII.I1_I) {
            n3 -= n3 * iII.lO__ / 100;
        }
        boolean bl3 = bl2 = iIIO != null && (iIIO.lO0I == 1 || iIIO.lO0I == 3 || iIIO.lO0I == 5) && iOol.IIo(3) > 0;
        if (bl2) {
            n2 = (int)Math.min(2000000000L, (long)n * (long)iOol.IIo(3) / 100L);
            if (n2 > 0 && iOol._loI < iOol.Il1()) {
                iOol._loI = Math.min(iOol.Il1(), iOol._loI + n2);
                this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
            }
            n3 = 0;
        }
        int n4 = n2 = this.var_java_util_Random_IIl0.nextInt(100) < iOol.Il10() ? 1 : 0;
        if (n2 != 0) {
            n3 = 0;
        } else {
            n3 -= n3 / 100 * iOol.Il1O();
            if ((n3 -= iOol.Il1_()) < 1) {
                n3 = 1;
            }
            if (iOol.IlI0(215)) {
                n3 /= 2;
            }
            if (iOol.IlIo(6)) {
                n3 /= 2;
            }
            if (iOol.IlIo(7)) {
                n3 = n3 / 100 * 40;
            }
            if (n3 < 1) {
                n3 = 1;
            }
            if (iOol.Ioo0) {
                n3 = 1;
            }
        }
        if (bl2) {
            n3 = 0;
        }
        if (this.Io01) {
            n3 = 0;
        }
        if (iOol.IlI0(217) && n3 >= iOol.llIl) {
            n3 = Math.max(0, iOol.llIl - 1);
        }
        iOol.llIl -= n3;
        this.l11I();
        boolean bl4 = bl = iOol.llIl <= 0;
        if (bl) {
            iOol.llIl = 0;
        }
        this.var_IOo__II1.II(new IO0o(-60).IIII(iII.I1l).II(iIIO.I1l & 0xFF).II(1).IIII(iOol.I1l).II(1).II(0).IIII(n3).II(bl).II(false));
        this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
        int n5 = iOol.Il1o();
        if (n5 > 0 && n > 0) {
            this.var_IO_I_II.III(iII, PSTPatch.boss(n, n3, n2, n5));
        }
        if (n3 > 0 && !bl) {
            this.var_IO0_II1.var_IOo_II.II__(iII);
        }
        if (bl) {
            this.l1lO();
            return true;
        }
        return false;
    }

    boolean Il0() {
        IOol iOol = this.IOol_II();
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            if (this.var_IOoI$III_arr_II[i].l0o1 != 77 || this.var_IOoI$III_arr_II[i].IoOo) continue;
            return false;
        }
        III iII = new III();
        iII._l_1 = this.var_IOoI$III_arr_II.length;
        iII.l0o1 = 77;
        iII.lOl_ = 1;
        iII.llIl = 2000000000;
        iII._l__ = 2000000000;
        iII.lOlO = 2000000000;
        iII.I1 = iOol.I1 + this.var_java_util_Random_IIl0.nextInt(61) - 30;
        iII.I1I = iOol.I1I;
        iII.II = IOO.IOO$IIII_II(77);
        iII._l_O = 19999999;
        III[] iIIArray = new III[this.var_IOoI$III_arr_II.length + 1];
        System.arraycopy(this.var_IOoI$III_arr_II, 0, iIIArray, 0, this.var_IOoI$III_arr_II.length);
        iIIArray[iII._l_1] = iII;
        this.var_IOoI$III_arr_II = iIIArray;
        this.var_IOo__II1.II(new IO0o(-13).II(255).III(iII._l_1).II(77).II(1).III(iII.I1).III(iII.I1I).IIII(iII.llIl).IIII(iII.lOlO));
        return true;
    }

    private void l11l() {
        int n;
        IOol iOol = this.IOol_II();
        if (this._IoI < 165) {
            return;
        }
        int n2 = n = iOol.IOOO > System.currentTimeMillis() ? 2 : 1;
        if (!this.II1I(n, 555)) {
            return;
        }
        for (int i = 0; i < iOol.var_IO0l_arr_III.length; ++i) {
            int n3;
            IO0l iO0l = iOol.var_IO0l_arr_III[i];
            if (iO0l == null || iO0l.II1_() || iO0l.I1l != 1795) continue;
            int[] nArray = null;
            for (n3 = 0; n3 < iO0l.IIl.size(); ++n3) {
                int[] nArray2 = (int[])iO0l.IIl.elementAt(n3);
                if (nArray2[0] != 250) continue;
                nArray = nArray2;
                break;
            }
            if (nArray == null) {
                iO0l.III(250, 1);
            } else {
                nArray[1] = nArray[1] + true;
            }
            int n4 = n3 = nArray == null ? 1 : nArray[1];
            if (n3 == 3000) {
                this.IIol(IOoI.I1O1("\ue4cf\ue440\ue4a5\ue482\ue529\ue540\ufbe6\ue512\ue5a5\ue5ca\ue4c0\ue58c\ue666\ue600\ue653\ue7ee\uf89e\ue6f2\ue6dc\ue6fa\ue7e8\ue7fb\ue717\ue73e\ue78f\ue7e0\ue793\ue6c3\uf916\ue830\ue81c\ue87e\ue85d\ue8bc\ue88b\ue8a4\ue9ea\ue966\ue940\ue966\ue909\ue834\uf740\ue9ac\ue986\uea20\uea54\uea57\uea31\uea15\ueae8\uea9b", 58509));
            }
            this.l1_l();
            return;
        }
    }

    void l111() {
        IOol iOol = this.IOol_II();
        if (iOol.lOoO < 5) {
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue5a0\ue511\ue621\ue731\uf8d8\ue67e\ue613\ue6fb\uf876\ue6b9\ue6d8", 58509));
            return;
        }
        iOol.lOoO -= 5;
        long l = System.currentTimeMillis();
        long l2 = iOol.IOOO > l ? iOol.IOOO - l : 0L;
        long l3 = Math.min(l2 + 600000L, 3600000L);
        iOol.IOOO = l + l3;
        this.l1_();
        this.var_IOo__II1.II(new IO0o(-106).III(15359).III((int)(l3 / 1000L)));
        this.var_IO0_II1.I__O();
    }

    private int II(int n, III iII) {
        int n2 = Math.max(1, iII.llIl / 100);
        return this.var_java_util_Random_IIl0.nextInt(100) < 2 ? Math.max(n, n2) : n2;
    }

    private III IIII() {
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            if (this.var_IOoI$III_arr_II[i].l0o1 != 70) continue;
            return this.var_IOoI$III_arr_II[i];
        }
        return null;
    }

    private void II1(long l) {
        if (this.IOI == 0L) {
            return;
        }
        if (this._lI >= 3) {
            if (l - this.IOI > 15000L) {
                this._lI = 0;
                this.IOI = 0L;
                this._lII = 40000000;
                this._lIl = 0;
                this._lI1 = 100 + this.var_java_util_Random_IIl0.nextInt(801);
                this._lI_ = 360;
            }
        } else if (l - this.IOI > 5000L) {
            if (this._lI < 2) {
                ++this._lI;
                this.IOI = 0L;
                this._lII = 40000000;
                this._lIl = 0;
            } else {
                this._lI = 3;
            }
        }
    }

    synchronized int[] III1() {
        this.II1(System.currentTimeMillis());
        int n = Math.min(this._lI, 2);
        int n2 = this._lI >= 3 || this.IOI != 0L ? 0 : (this._lII > 0 ? this._lII : 40000000);
        return new int[]{n, n2, this._lI1, this._lI_};
    }

    private void l11_() {
        III iII = this.IIII();
        if (iII == null) {
            return;
        }
        iII.I1 = this._lI1;
        iII.I1I = this._lI_;
        iII._l__ = 40000000;
        iII.lOlO = 40000000;
        if (this._lI >= 3 || this.IOI != 0L) {
            iII.IoOo = true;
            iII.llIl = 0;
            iII.IO1o = Long.MAX_VALUE;
            if (this._lI >= 3) {
                this.var_IOo__II1.II(new IO0o(101).II(9));
            }
        } else {
            iII.llIl = this._lII > 0 ? this._lII : 40000000;
        }
    }

    private void II1I(long l) {
        III iII = this.IIII();
        if (iII == null) {
            return;
        }
        if (!iII.IoOo) {
            this._lII = iII.llIl;
        }
        if (this.IOI == 0L) {
            return;
        }
        if (this._lI < 3) {
            if (l - this.IOI > 5000L) {
                this.void_II(iII);
            }
        } else if (l - this.IOI > 15000L && this.IIlo.size() == 0) {
            this._lI = 0;
            this.IOI = 0L;
            this._lII = 40000000;
            this._lIl = 0;
            this._lI1 = 100 + this.var_java_util_Random_IIl0.nextInt(801);
            this._lI_ = 360;
            IOol iOol = this.IOol_II();
            this.var_IO0_II1.III_(iOol.lOlo, iOol.I1, iOol.I1I);
        }
    }

    private void void_II(III iII) {
        int n = this._lI1;
        int n2 = this._lI_;
        for (int i = 0; i < 30; ++i) {
            int n3 = i % 2 == 0 ? -5 * (i / 2 % 11) : 5 * (1 + i / 2 % 10);
            this.II(190, 32000, n + n3, n2, null);
        }
        if (this.II1I(20, 100)) {
            this.II(568, 1, n, n2, null);
        }
        if (this.IOol_II().var_IOol_III != null && this.IOol_II()._10l == 1 && this.II1I(20, 100)) {
            Vector<int[]> vector = new Vector<int[]>();
            vector.addElement(new int[]{250, 0});
            this.II(1795, 1, n, n2, vector);
        }
        if (this.II1I(1, 40)) {
            this.IIO_(n, n2);
        }
        if (this._lI < 2) {
            ++this._lI;
            this.IOI = 0L;
            this._lII = 40000000;
            this._lIl = 0;
            iII.IoOo = false;
            iII.Ioo_ = false;
            iII._l__ = 40000000;
            iII.lOlO = 40000000;
            iII.llIl = 40000000;
            iII.I1 = n;
            iII.I1I = n2;
            this.var_IOo__II1.II(new IO0o(101).II(this._lI == 1 ? 6 : 5).III(n).III(n2));
            this.var_IOo__II1.II(new IO0o(-9).II(iII._l_1).IIII(iII.llIl).IIII(1).II(false).II(-1));
        } else {
            this._lI = 3;
            this.var_IOo__II1.II(new IO0o(101).II(9));
        }
    }

    private boolean II(III iII, long l) {
        int n;
        int[] nArray;
        if (this.IOI != 0L || this._lI >= 3) {
            return false;
        }
        if (l - this.IOII < 3000L) {
            return false;
        }
        this.IOII = l;
        IOol iOol = this.IOol_II();
        if (this._lI >= 2) {
            int[] nArray2 = new int[2];
            nArray2[0] = 1;
            nArray = nArray2;
            nArray2[1] = 2;
        } else {
            int[] nArray3 = new int[4];
            nArray3[0] = 1;
            nArray3[1] = 2;
            nArray3[2] = 3;
            nArray = nArray3;
            nArray3[3] = 7;
        }
        int[] nArray4 = nArray;
        this._lIl = n = this._lIl == 7 ? 0 : nArray4[this.var_java_util_Random_IIl0.nextInt(nArray4.length)];
        if (n == 3) {
            iII.I1 = this._lI1 = iOol.I1;
            this.var_IOo__II1.II(new IO0o(101).II(3).III(iII.I1).III(iII.I1I));
            return false;
        }
        if (n == 7) {
            this.var_IOo__II1.II(new IO0o(101).II(7));
            return false;
        }
        if (n == 1) {
            iII.I1 = this._lI1 = iOol.I1;
            this.var_IOo__II1.II(new IO0o(101).II(8).III(iII.I1).III(iII.I1I));
        }
        long l2 = (long)iII._l__ * (long)((iII.II == null ? 5 : iII.II.l0o) + this.var_java_util_Random_IIl0.nextInt(3) - 1) / 100L;
        int n2 = (int)Math.min(l2, 2000000000L);
        if (l < this.I_01) {
            n2 -= n2 / 5;
        }
        if (iOol.IlI0(215)) {
            n2 /= 2;
        }
        if (this.var_java_util_Random_IIl0.nextInt(100) < iOol.Il10()) {
            n2 = 0;
        } else {
            n2 -= n2 / 100 * iOol.Il1O();
            if ((n2 -= iOol.Il1_()) < 1) {
                n2 = 1;
            }
            if (iOol.IlIo(6)) {
                n2 /= 2;
            }
            if (iOol.IlIo(7)) {
                n2 = n2 / 100 * 40;
            }
            if (n2 < 1) {
                n2 = 1;
            }
            if (iOol.Ioo0) {
                n2 = 1;
            }
            if (n2 > iOol.Illo() * 35 / 100) {
                n2 = Math.max(1, iOol.Illo() * 35 / 100);
            }
        }
        if (this.Io01) {
            n2 = 0;
        }
        if (iOol.IlI0(217) && n2 >= iOol.llIl) {
            n2 = Math.max(0, iOol.llIl - 1);
        }
        iOol.llIl -= n2;
        this.l11I();
        this.var_IOo__II1.II(new IO0o(101).II(n).II(1).IIII(iOol.I1l).IIII(n2));
        this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(Math.max(0, iOol.llIl)));
        if (iOol.llIl <= 0) {
            iOol.llIl = 0;
            this.l1lO();
            return true;
        }
        return false;
    }

    private boolean III(III iII, long l) {
        if (l - iII.IO10 < 1000L) {
            return false;
        }
        iII.IO10 = l;
        IOol iOol = this.IOol_II();
        if (iOol.I1 <= 440 || iOol.I1 >= 950) {
            return false;
        }
        double d = iOol.I1 - iII.I1;
        double d2 = iOol.I1I - iII.I1I;
        double d3 = Math.sqrt(d * d + d2 * d2);
        if (d3 >= 500.0) {
            return false;
        }
        if (d3 > 200.0) {
            iII.I1 = iOol.I1;
            this.var_IOo__II1.II(new IO0o(102).II(5).III(iII.I1));
            return false;
        }
        return this.boolean_II(iII, d3 <= 100.0 ? 3 : 4);
    }

    private boolean IIII(III iII, long l) {
        if (l - iII.IO10 < 1000L) {
            return false;
        }
        iII.IO10 = l;
        IOol iOol = this.IOol_II();
        double d = iOol.I1 - iII.I1;
        double d2 = iOol.I1I - iII.I1I;
        double d3 = Math.sqrt(d * d + d2 * d2);
        int n = d3 <= 100.0 ? 0 : (d3 <= 200.0 ? 1 : 2);
        iII.I1 = iOol.I1;
        return this.boolean_II(iII, n);
    }

    private boolean boolean_II(III iII, int n) {
        int n2;
        IOol iOol = this.IOol_II();
        int n3 = iII._l_O > 0 ? iII._l_O : (n2 = (int)Math.min(2000000000L, (long)iII._l__ * (long)(iII.II == null ? 5 : iII.II.l0o) / 100L));
        if (IOoI.IIIl() < this.I_01) {
            n2 -= n2 / 5;
        }
        if (iOol.IlI0(215)) {
            n2 /= 2;
        }
        if (this.var_java_util_Random_IIl0.nextInt(100) < iOol.Il10()) {
            n2 = 0;
        } else {
            n2 -= n2 / 100 * iOol.Il1O();
            if ((n2 -= iOol.Il1_()) < 1) {
                n2 = 1;
            }
            if (iOol.IlIo(6)) {
                n2 /= 2;
            }
            if (iOol.IlIo(7)) {
                n2 = n2 / 100 * 40;
            }
            if (n2 < 1) {
                n2 = 1;
            }
            if (iOol.Ioo0) {
                n2 = 1;
            }
            if (n2 > iOol.Illo() * 35 / 100) {
                n2 = Math.max(1, iOol.Illo() * 35 / 100);
            }
        }
        if (this.Io01) {
            n2 = 0;
        }
        if (iOol.IlI0(217) && n2 >= iOol.llIl) {
            n2 = Math.max(0, iOol.llIl - 1);
        }
        iOol.llIl -= n2;
        this.l11I();
        this.var_IOo__II1.II(new IO0o(102).II(n).II(1).IIII(iOol.I1l).IIII(n2));
        this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(Math.max(0, iOol.llIl)));
        if (iOol.llIl <= 0) {
            iOol.llIl = 0;
            this.l1lO();
            return true;
        }
        return false;
    }

    private static long IIIl() {
        return System.currentTimeMillis();
    }

    int IlI() {
        return this.var_IO0_II1.var_IOOO_II.II0o();
    }

    private boolean IIIl(III iII, long l) {
        boolean bl;
        IOol iOol = this.IOol_II();
        if (l - iII.I1l0 < 300L) {
            return false;
        }
        iII.I1l0 = l;
        int n = 11 + this.var_java_util_Random_IIl0.nextInt(5);
        double d = iOol.I1 - iII.I1;
        double d2 = iOol.I1I - iII.I1I;
        double d3 = Math.sqrt(d * d + d2 * d2);
        boolean bl2 = bl = n == 11 && d3 < 50.0 || n == 12 && d3 < 100.0 || (n == 13 || n == 14) && d3 < 150.0 || n == 15 && d3 < 200.0;
        if (!bl) {
            iII.I1 = iOol.I1 + this.var_java_util_Random_IIl0.nextInt(21) - 10;
            iII.I1I = iOol.I1I;
            this.var_IOo__II1.II(new IO0o(102).II(10).II(iII._l_1).III(iII.I1).III(iII.I1I));
            return false;
        }
        int n2 = 19999999;
        if (this.var_java_util_Random_IIl0.nextInt(100) < iOol.Il10()) {
            n2 = 0;
        } else {
            n2 -= n2 / 100 * iOol.Il1O();
            if ((n2 -= iOol.Il1_()) < 1) {
                n2 = 1;
            }
            if (iOol.IlIo(6)) {
                n2 /= 2;
            }
            if (iOol.IlIo(7)) {
                n2 = n2 / 100 * 40;
            }
            if (iOol.Ioo0) {
                n2 = 1;
            }
            if (n2 > iOol.Illo() * 35 / 100) {
                n2 = Math.max(1, iOol.Illo() * 35 / 100);
            }
        }
        if (this.Io01) {
            n2 = 0;
        }
        if (iOol.IlI0(217) && n2 >= iOol.llIl) {
            n2 = Math.max(0, iOol.llIl - 1);
        }
        iOol.llIl -= n2;
        this.l11I();
        this.var_IOo__II1.II(new IO0o(102).II(n).II(iII._l_1).II(1).IIII(iOol.I1l).IIII(n2).II(iOol.I1 < iII.I1 ? -1 : 1));
        this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(Math.max(0, iOol.llIl)));
        if (iOol.llIl <= 0) {
            iOol.llIl = 0;
            this.l1lO();
            return true;
        }
        return false;
    }

    private void l11O() {
        IOol iOol = this.IOol_II();
        if (iOol._lOO == 0) {
            return;
        }
        iOol._l0I += 50;
        iOol._l0 += 50;
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue567\ue540\ufbea\ue508\ue5a5\ue4b5\ue473\ufb01\ue662\ue600\ue60a\ue66e\ue65d\ue6df\ue6da\ue6aa\ue68a\ue76d\ue75b\ue733\ue755\ue7f6\ue7d2\ue7bc\ue796\ue830\ue847\uf697\ue804\ue8ac\ue8df\uf621\ue8c9\ue94f\uf782\ue933\ue945\ue9d0\ue813\uf719\ue98f\uea67\uea3f\uea7d\uebed\uf4a7\ueaeb\uea9b", 58509));
        this.var_IO0_II1.I__O();
    }

    void II(int n, int n2, int n3, long l) {
        II iI = this.II(n, 1, n2, n3);
        iI.IO1O = l;
        this.var_IOo__II1.II(new IO0o(68).III(iI.I1l).III(iI.l0o1).III(iI.I1).III(iI.I1I).IIII(this.IOol_II().I1l));
    }

    void II(int n, int n2, int n3, int n4, Vector vector) {
        II iI = this.II(n, n2, n3, n4);
        if (vector != null) {
            for (int i = 0; i < vector.size(); ++i) {
                iI.IIl.addElement(vector.elementAt(i));
            }
        }
        this.var_IOo__II1.II(new IO0o(68).III(iI.I1l).III(iI.l0o1).III(iI.I1).III(iI.I1I).IIII(this.IOol_II().I1l));
    }

    void IIIo(String string, int n) {
        int n2;
        int n3 = string.equals(IOoI.I1O1("\ue4ce\ue4f9\ue486\ue4a8\ue54c\ue57a", 58509)) || string.equals(IOoI.I1O1("\ue4de\ue4e3\ue482\ue4b5\ue541\ue56d\ue504\ue539\ue5d4\ue5f1\ue59a\ue5ac\ue630", 58509)) || string.equals(IOoI.I1O1("\ue4c2\ue4f3\ue48f\ue4a5\ue538", 58509)) || string.equals(IOoI.I1O1("\ue4cc\ue4e2\ue494\ue4be\ue55b\ue567\ue50a\ue539\ue5c9", 58509)) ? 5 : (string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4db\ue556\ue566\ue50a", 58509)) || string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4d8\ue556\ue566\ue50a", 58509)) || string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4d9\ue556\ue566\ue50a", 58509)) || string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4de\ue556\ue566\ue50a", 58509)) ? 1 : (n2 = string.startsWith(IOoI.I1O1("\ue4d5\ue4e9\ue485\ue4b5\ue54a\ue567\ue509", 58509)) && this.var_java_util_Random_IIl0.nextInt(100) < 80 ? 5 : 0));
        if (n2 > 0) {
            this.IOol_II()._1IO += n2;
            this.IIol(IOoI.I1O1("\ue4c3\ue4c4\ufa66\ue484\ue529\ue439\ue4f7\ufb85\ue5e6\ue584", 58509) + n2 + IOoI.I1O1("\ue4ad\ue5bd\ue4a2\ufa29\ue564\ue508\ue534\ufb97\ue5a5\ue5cf\ue5aa\ufb25\ue66f", 58509));
        }
        int n4 = -1;
        int n5 = -1;
        if (string.equals(IOoI.I1O1("\ue4c6\ue4f9\ue480\ue4bf", 58509))) {
            n4 = 19;
            n5 = 0;
        } else if (string.equals(IOoI.I1O1("\ue4c0\ue4ed\ue49b\ue4b5\ue54d\ue569\ue512\ue539\ue5c1\ue5ed\ue58d\ue5aa", 58509))) {
            n4 = 19;
            n5 = 1;
        } else if (string.equals(IOoI.I1O1("\ue4df\ue4ed\ue486\ue4a8\ue546", 58509))) {
            n4 = 19;
            n5 = 2;
        } else if (string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4de", 58509))) {
            n4 = 20;
            n5 = 1;
        } else if (string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4d9", 58509))) {
            n4 = 20;
            n5 = 2;
        } else if (string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4d8", 58509))) {
            n4 = 20;
            n5 = 3;
        } else if (string.equals(IOoI.I1O1("\ue4de\ue4e3\ue494\ue4db", 58509))) {
            n4 = 20;
            n5 = 4;
        } else if (string.equals(IOoI.I1O1("\ue4d9\ue4e5\ue48e\ue4bf\ue556\ue56c\ue508\ue52f\ue5da\ue5f0\ue591\ue5b7\ue64e\ue66e\ue678", 58509))) {
            n4 = 20;
            n5 = 5;
        } else if (string.equals(IOoI.I1O1("\ue4cb\ue4e5\ue48f\ue4af", 58509))) {
            n4 = 21;
            n5 = 1 + n;
        } else if (string.equals(IOoI.I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue59d", 58509))) {
            n4 = 23;
            n5 = 1;
        } else if (string.equals(IOoI.I1O1("\ue4c9\ue4fe\ue494\ue4a1\ue546\ue57a\ue502", 58509))) {
            n4 = 23;
            n5 = 2;
        } else if (string.equals(IOoI.I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue591", 58509))) {
            n4 = 24;
            n5 = 1;
        } else if (string.equals(IOoI.I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue590", 58509))) {
            n4 = 24;
            n5 = 2;
        } else if (string.equals(IOoI.I1O1("\ue4cc\ue4e2\ue48f\ue4b8\ue546\ue561\ue503\ue539\ue5b4\ue597", 58509))) {
            n4 = 24;
            n5 = 3;
        } else if (string.equals(IOoI.I1O1("\ue4dd\ue4e3\ue488", 58509))) {
            n4 = 25;
            n5 = 1;
        } else if (string.equals(IOoI.I1O1("\ue4dd\ue4e5\ue488", 58509))) {
            n4 = 25;
            n5 = 2;
        } else if (string.equals(IOoI.I1O1("\ue4c6\ue4e5\ue485\ue4ad\ue556\ue563\ue508\ue528\ue5c2", 58509))) {
            n4 = 25;
            n5 = 3;
        } else if (string.equals(IOoI.I1O1("\ue4d5\ue4e9\ue485\ue4b5\ue54b\ue567\ue518\ue52e\ue5d0\ue5ea\ue584", 58509))) {
            n4 = 26;
            n5 = 1 + n;
        } else if (string.equals(IOoI.I1O1("\ue4de\ue4e5\ue48e\ue4bf\ue556\ue56a\ue508\ue539\ue5cd\ue5f1\ue58d\ue5a5", 58509)) && n == 1) {
            n4 = 27;
            n5 = 4;
        } else if (string.startsWith(IOoI.I1O1("\ue4d5\ue4e9\ue485\ue4b5\ue54a\ue567\ue509\ue539", 58509))) {
            n4 = 27;
            n5 = 3;
        } else if (string.startsWith(IOoI.I1O1("\ue4c9\ue4fe\ue48a\ue4a8\ue55c\ue57a\ue506", 58509))) {
            n4 = 28;
            n5 = 1;
        } else if (string.startsWith(IOoI.I1O1("\ue4cf\ue4f9\ue482\ue4b5\ue54b\ue57d\ue50e", 58509))) {
            n4 = 28;
            n5 = 2;
        } else if (string.equals(IOoI.I1O1("\ue4d4\ue4ed\ue494\ue4a9\ue546\ue566", 58509)) || string.equals(IOoI.I1O1("\ue4d4\ue4ed\ue488\ue4a5\ue547", 58509))) {
            n4 = 28;
            n5 = 4;
        } else if (string.equals(IOoI.I1O1("\ue4c0\ue4ed\ue489\ue4bf\ue556\ue519\ue575\ue52e", 58509))) {
            n4 = 28;
            n5 = 6;
        } else if (string.equals(IOoI.I1O1("\ue4cf\ue4e0\ue48a\ue4a9\ue542\ue577\ue500\ue529\ue5ce\ue5f1", 58509))) {
            n4 = 29;
            n5 = 0;
        }
        if (n4 < 0) {
            return;
        }
        IOol iOol = this.IOol_II();
        if (iOol._lOI == n4 && iOol._lOl == n5) {
            this.I1lo(1);
        }
        if (n4 == 28 && iOol._lOI == 28 && string.startsWith(IOoI.I1O1("\ue4c9\ue4fe\ue48a\ue4a8\ue55c\ue57a\ue506", 58509)) && iOol._lOl == 5) {
            this.I1lo(1);
        }
        if (n4 == 28 && iOol._lOI == 28 && string.startsWith(IOoI.I1O1("\ue4cf\ue4f9\ue482\ue4b5\ue54b\ue57d\ue50e", 58509)) && iOol._lOl == 3) {
            this.I1lo(1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIII(IOO.IIIO iIIO) {
        IOol iOol = this.IOol_II();
        int n = 400 + iIIO.l1__ * 30;
        if (iOol.II(IOol.I_Oo) == 2) {
            n += 200;
        }
        long l = (long)Math.max(1, iOol.llIl) + (long)iOol.Illo() * (long)iOol.II00(14) / 100L;
        this._lI0 = (int)Math.min(Integer.MAX_VALUE, l);
        this.Io0o = true;
        try {
            for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
                III iII = this.var_IOoI$III_arr_II[i];
                if (iII.IoOo || Math.abs(iII.I1 - iOol.I1) > n || Math.abs(iII.I1I - iOol.I1I) > n) continue;
                try {
                    this.IIIl(i, iIIO);
                    continue;
                }
                catch (RuntimeException runtimeException) {
                    runtimeException.printStackTrace();
                }
            }
        }
        finally {
            this.Io0o = false;
            this._lI0 = 0;
        }
        iOol.llIl = 0;
        this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(0));
        this.Io0_ = true;
        try {
            this.l1lO();
        }
        finally {
            this.Io0_ = false;
        }
    }

    private static boolean IIol(int n) {
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 9: 
            case 10: 
            case 11: 
            case 14: 
            case 17: {
                return true;
            }
        }
        return false;
    }

    void IIIl(int n, IOO.IIIO iIIO) {
        boolean bl;
        boolean bl2;
        if (n < 0 || n >= this.var_IOoI$III_arr_II.length) {
            return;
        }
        III iII = this.var_IOoI$III_arr_II[n];
        if (iII.IoOo) {
            return;
        }
        IOol iOol = this.IOol_II();
        if (iOol.IlI0(217) && iOol.llIl <= 1 && !this.Io01) {
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue549\ue529\ue501\ue5a5\ue4b5\ue473\ufb01\ue662\ue600\ue65d\ue6a7\ue61c\ue6bc\ue6d9\uf87f\ue68d\ue738\ue743\uf9bb\ue755\ue7f6\uf910\ue7bd\ue7d1\ue866\uf6e8\ue86e\ue806\ue8e4\ue85f\ue8a4\ue88e\ue928\ue953\ue92e\uf7a6\ue9a4\ue9d7\uf767\ue98f\uea20\uea7c\ueaca\uea33\uea1b\ueaba", 58509));
            return;
        }
        int n2 = iIIO == null ? 100 : iIIO.lo + iOol.II0o(iIIO.lO0I);
        int n3 = iOol.Il1I() * n2 / 100;
        if (iII.l0o1 != 0) {
            n3 = iOol.IIoI(n3);
        }
        if (iIIO != null) {
            boolean bl3;
            int bl4 = iOol._lo0;
            int n4 = iIIO.lO0I;
            boolean bl5 = bl3 = bl4 == 1 && n4 == 0 || bl4 == 2 && n4 == 1 || bl4 == 8 && n4 == 2 || bl4 == 9 && n4 == 3 || bl4 == 13 && n4 == 17 || bl4 == 16 && n4 == 4 || bl4 == 17 && n4 == 5;
            if (bl3) {
                n3 += n3 * iOol._loo / 100;
            }
        }
        if (iOol._11O > 0) {
            n3 += n3 * iOol._11O / 100;
            iOol._11O = 0;
        }
        n3 += n3 * (this.var_java_util_Random_IIl0.nextInt(21) - 10) / 100;
        n3 *= this.int_III(iIIO);
        boolean bl6 = bl2 = this.Io0O || this.var_java_util_Random_IIl0.nextInt(100) < iOol.Il1l();
        if (bl2) {
            n3 *= 2;
            n3 += n3 * iOol.Il11() / 100;
        }
        if (iIIO != null) {
            n3 += n3 * iOol.II00(iIIO.lO0I) / 100;
        }
        if (iOol.IlI0(214)) {
            n3 += n3 * 150 / 100;
        }
        if (this._lI0 > 0) {
            n3 = this._lI0;
        }
        if (n3 < 1) {
            n3 = 1;
        }
        if (iII.III != null) {
            if (this.Io0o) {
                n3 = Math.max(1, n3 / 2);
            }
            this.II(iII, n3, bl2, iIIO);
            return;
        }
        if (iII.l0o1 == 117) {
            this.II(n, iII, n3, bl2);
            return;
        }
        if (iII.l0o1 == 77) {
            n3 = Math.max(1, (int)((double)n3 * 0.05));
        }
        if (iII.l0o1 == 70) {
            n3 = this.II(n3, iII);
        }
        if (iII.l0o1 == 0 && n3 > iII.lOlO / 10) {
            n3 = Math.max(1, iII.lOlO / 10);
        }
        if (iII.IooO && !iOol.IlI0(216)) {
            n3 = Math.max(1, iII._l__ / 10);
            bl = false;
        } else if (!this.Io0o && iII.llIl == iII.lOlO && n3 >= iII.llIl && iII.lOlO > 1) {
            n3 = iII.llIl - 1;
        }
        if (n3 >= iII.llIl) {
            n3 = iII.llIl;
        }
        iII.llIl -= n3;
        this.II(n3, iII.l0o1 != 0, iII.I1, iII.I1I);
        this.I_0_ = System.currentTimeMillis() + 1000L;
        iII.Ioo_ = true;
        iII.I1l0 = System.currentTimeMillis();
        long l = this.long_II(iII, n3);
        if (iII.llIl > 0) {
            this.var_IOo__II1.II(new IO0o(-9).II(n).IIII(iII.llIl).IIII(n3).II(bl).II(-1));
            this.IIl0(l);
            if (iII.IooO && iOol.llIl > 0 && !iOol.IlI0(216)) {
                this.boolean_II(iII);
            }
            return;
        }
        this.II(n, iII, n3, bl, l, false);
    }

    private void II(int n, III iII, int n2, boolean bl, long l, boolean bl2) {
        int n3;
        IOol iOol = this.IOol_II();
        iII.IoOo = true;
        ++iOol._1lo;
        iII.IO1o = System.currentTimeMillis() + (long)(iII.l0o1 == 0 ? 3000 : 6000);
        if (this.var_IO0_II1.var_IO_1_II.Il1I() && IO_1.II_1(this._IoI)) {
            iII.IO1o = Long.MAX_VALUE;
            this.var_IO0_II1.var_IO_1_II.II10(this._IoI, iII._l_1);
        }
        if (this.var_IO0_II1.var_I0_II.Il1I() && this._IoI == 146) {
            iII.IO1o = Long.MAX_VALUE;
        }
        if (iII.l0o1 == 77) {
            iII.IO1o = Long.MAX_VALUE;
            this.l11O();
        }
        if (iII.l0o1 == 70) {
            iII.IO1o = Long.MAX_VALUE;
            this.IOI = System.currentTimeMillis();
        }
        if (iII.l0o1 == 71 || iII.l0o1 == 72) {
            iII.IO1o = Long.MAX_VALUE;
        }
        if (this.var_IO0_II1.var_IOOO_II.IIO_(this._IoI)) {
            iII.IO1o = Long.MAX_VALUE;
            this.var_IO0_II1.var_IOOO_II.II10(this._IoI, iII._l_1);
        }
        this.l11l();
        Vector vector = this.java_util_Vector_II(iII);
        IO0o iO0o = new IO0o(-12).II(n).IIII(n2).II(bl).II(vector.size());
        for (n3 = 0; n3 < vector.size(); ++n3) {
            II iI = (II)vector.elementAt(n3);
            iO0o.III(iI.I1l).III(iI.l0o1).III(iI.I1).III(iI.I1I).IIII(iOol.I1l);
        }
        this.var_IOo__II1.II(iO0o);
        if (iII.l0o1 == 71) {
            this.var_IOo__II1.II(new IO0o(102).II(7));
        } else if (iII.l0o1 == 72) {
            this.var_IOo__II1.II(new IO0o(102).II(6));
        }
        if (iOol.IlI0(219)) {
            for (n3 = 0; n3 < vector.size(); ++n3) {
                this.I1Il(((II)vector.elementAt((int)n3)).I1l);
            }
        }
        if (bl2) {
            this.var_IO0_II1.var_IOo_II.IIl0(l);
        } else {
            this.IIl0(l);
        }
        this.I11(iII.l0o1);
        this.var_IO0_II1.var_IO_o_II.Il_l(iII.l0o1);
        this.var_IO0_II1.var_IO1o_II.II(iII.l0o1, iII.II == null ? 0 : iII.II.IoI_, iII.IooO);
        if (this.Ioo) {
            this.Ioo = false;
            this.l101();
        }
        this.var_IO0_II1.I__O();
    }

    void II(int n, int n2, boolean bl, IOol iOol) {
        if (n < 0 || n >= this.var_IOoI$III_arr_II.length) {
            return;
        }
        III iII = this.var_IOoI$III_arr_II[n];
        if (iII.IoOo || iII.III != null || iII.l0o1 == 117) {
            return;
        }
        if (n2 < 1) {
            n2 = 1;
        }
        if (iII.l0o1 == 77) {
            n2 = Math.max(1, (int)((double)n2 * 0.05));
        }
        if (iII.l0o1 == 70) {
            n2 = this.II(n2, iII);
        }
        if (iII.l0o1 == 0 && n2 > iII.lOlO / 10) {
            n2 = Math.max(1, iII.lOlO / 10);
        }
        if (iII.IooO) {
            n2 = Math.max(1, iII._l__ / 10);
            bl = false;
        } else if (iII.llIl == iII.lOlO && n2 >= iII.llIl && iII.lOlO > 1) {
            n2 = iII.llIl - 1;
        }
        if (n2 >= iII.llIl) {
            n2 = iII.llIl;
        }
        iII.llIl -= n2;
        this.II(n2, iII.l0o1 != 0, n, iOol, iII.I1, iII.I1I);
        iII.Ioo_ = true;
        iII.I1l0 = System.currentTimeMillis();
        long l = this.II(iOol, iII, n2);
        if (iII.llIl > 0) {
            this.var_IOo__II1.II(new IO0o(-9).II(n).IIII(iII.llIl).IIII(n2).II(bl).II(-1));
            this.var_IO0_II1.var_IOo_II.IIl0(l);
            return;
        }
        this.II(n, iII, n2, bl, l, true);
    }

    private void II(int n, boolean bl, int n2, IOol iOol, int n3, int n4) {
        int n5 = (int)((long)n * (long)iOol.int_II(bl) / 100L);
        int n6 = (int)((long)n * (long)iOol.Il_() / 100L);
        if (n5 <= 0 && n6 <= 0) {
            return;
        }
        if (n5 > 0 && iOol.llIl > 0) {
            iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + n5);
        }
        if (n6 > 0) {
            iOol._loI = Math.min(iOol.Il1(), iOol._loI + n6);
        }
        this.var_IOo__II1.II(new IO0o(113).II(1).II(3).II(37).III(n3).III(n4).III(-1));
        this.var_IOo__II1.II(new IO0o(-10).II(n2).IIII(-this.IOol_II().I1l).IIII(iOol.llIl).IIII(iOol._loI));
    }

    private void II(int n, III iII, int n2, boolean bl) {
        IOol iOol = this.IOol_II();
        iII.llIl = iII.lOlO;
        iII.I1l0 = System.currentTimeMillis();
        this.var_IOo__II1.II(new IO0o(-9).II(n).IIII(iII.llIl).IIII(n2).II(bl).II(-1));
        long l = iOol.IO_O / 10000000L;
        iOol.IO_O += (long)n2;
        long l2 = iOol.IO_O / 10000000L;
        this.IIol(IOoI.I1O1("\ue4c0\ue44d\ue4b2\ue4ca\ue418\ue547\ue567\ue515\ufb6c\ue5c7\ue5e3\ue58f\uf8a0\ue64e\ue657\ue67e\ue613\ue6f4\uf816\ue6b4\ue6d9", 58509) + n2 + IOoI.I1O1("\ue4ad\ue4df\ue42a\ue49e\ue529\ue55c\ue52f\ue4d6\ue424\ue5ca\ue5a4", 58509) + (bl ? IOoI.I1O1("\ue4ad\ue484\ue4a8\ue482\ue5e4\ue508\ue52a\ufbc7\ue5eb\ue5c3\ue5ea", 58509) : "") + IOoI.I1O1("\ue4ad\ue4d0\ue4eb\ue4be\ufbdc\ue546\ue520\ue55c\ue5a5", 58509) + iOol.IO_O);
        this.var_IOo__II1.II(new IO0o(44).IIII(-100000 - n).II(IOoI.I1O1("\ue4c9\ue4cd\ue4a6\ue48f\ue533\ue508", 58509) + n2));
        if (l2 > l) {
            int n3 = (int)(l2 - l) * 10;
            iOol._l01 += n3;
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue508\ue5ed\ufb09\ue5ad\ue5c2\ue710\ue790\uf8dc\ue63d\ue65d", 58509) + n3 + IOoI.I1O1("\ue4ad\ue5bd\ue4a2\ufa29\ue564\ue508\ue50a\ue587\ue5fc\ue584\ue4d3\ufb47\ue66c\ue601", 58509));
        }
    }

    private long long_II(III iII, int n) {
        return this.II(this.IOol_II(), iII, n);
    }

    long II(IOol iOol, III iII, int n) {
        if (iII.l0o1 == 0) {
            return 1L;
        }
        int n2 = iOol.II0o();
        int n3 = iII.lOl_;
        int n4 = Math.abs(n2 - n3);
        long l = (long)((double)n + (double)iII.lOlO * 5.0E-4);
        l = n4 > 5 && n2 > n3 ? 1L : (long)((double)l / ((double)((int)((double)n4 * 0.5)) + 1.25));
        if (iOol == this.IOol_II() && System.currentTimeMillis() < this.I_0l) {
            l += l * 20L / 100L;
        }
        return l < 1L ? 1L : l;
    }

    private void II(int n, boolean bl, int n2, int n3) {
        IOol iOol = this.IOol_II();
        int n4 = (int)((long)n * (long)iOol.int_II(bl) / 100L);
        int n5 = (int)((long)n * (long)iOol.Il_() / 100L);
        if (n4 > 0 || n5 > 0) {
            this.var_IOo__II1.II(new IO0o(113).II(1).II(3).II(37).III(n2).III(n3).III(-1));
        }
        if (n4 > 0 && iOol.llIl > 0 && iOol.llIl < iOol.Illo()) {
            iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + n4);
            this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
        }
        if (n5 > 0 && iOol._loI < iOol.Il1()) {
            iOol._loI = Math.min(iOol.Il1(), iOol._loI + n5);
            this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
        }
    }

    void II1l(long l) {
        long l2 = this.III1(l);
        if (l2 > 0L) {
            this.var_IOo__II1.II(new IO0o(-3).II(2).IIII((int)l2));
        }
    }

    void II11(long l) {
        long l2 = this.III1(l);
        if (l2 > 0L) {
            this.var_IOo__II1.II(new IO0o(-3).II(2).IIII((int)l2));
        }
        this.var_IO0_II1.ll_0();
    }

    private void IIl0(long l) {
        IOol iOol = this.IOol_II();
        l = iOol.III_(iOol.III0(l));
        long l2 = this.III1(l);
        if (l2 > 0L) {
            this.var_IOo__II1.II(new IO0o(-3).II(2).IIII((int)l2));
        }
        this.l100();
    }

    long III1(long l) {
        IOol iOol = this.IOol_II();
        long l2 = iOol.long_IIIO();
        if (iOol.IO_l >= l2 || l <= 0L) {
            return 0L;
        }
        if (iOol.IO_l + l > l2) {
            l = l2 - iOol.IO_l;
        }
        iOol.IO_l += l;
        iOol.IO_1 += l;
        return l;
    }

    private Vector java_util_Vector_II(III iII) {
        int n;
        Vector<II> vector = new Vector<II>();
        if (iII.l0o1 == 70) {
            return vector;
        }
        IOol iOol = this.IOol_II();
        int n2 = iII.I1;
        int n3 = iII.I1I;
        if (iII.l0o1 != 0) {
            if (this.var_java_util_Random_IIl0.nextInt(100) < 70) {
                n = 10 + this.var_java_util_Random_IIl0.nextInt(10 + Math.max(0, iII.lOlO / 20));
                n += n * iOol.Il_I() / 100;
                vector.addElement(this.II(76, n, n2 + this.var_java_util_Random_IIl0.nextInt(21) - 10, n3));
            }
            if (this.var_java_util_Random_IIl0.nextInt(100) < 5) {
                vector.addElement(this.II(13, 1, n2 + 12, n3));
            }
        }
        if (iII.l0o1 == 71 || iII.l0o1 == 72) {
            vector.addElement(this.II(457, 1, n2 - 6, n3));
            if (this.var_java_util_Random_IIl0.nextInt(110) < Math.max(1, Math.min(110, this.var_IO0_II1.var_IOOO_II.II0o()))) {
                vector.addElement(this.II(457, 1 + this.var_java_util_Random_IIl0.nextInt(5), n2 + 6, n3));
            }
        }
        if (this.var_IO0_II1.var_IOOO_II.II00() == 3 && this._IoI >= 135 && this._IoI <= 138) {
            n = 10 + this.var_java_util_Random_IIl0.nextInt(1 + Math.max(1, Math.min(110, this.var_IO0_II1.var_IOOO_II.II0o())) * 10 / 110);
            for (int i = 0; i < n; ++i) {
                vector.addElement(this.II(190, 32000, n2 - 50 + i * 5, n3));
            }
        }
        if (iII.IooO) {
            vector.addElement(this.II(76, 2000 + this.var_java_util_Random_IIl0.nextInt(3000), n2 + 10, n3));
            if (this.var_java_util_Random_IIl0.nextInt(100) < 50) {
                vector.addElement(this.II(13, 1 + this.var_java_util_Random_IIl0.nextInt(3), n2 - 20, n3));
            }
            if (this.var_java_util_Random_IIl0.nextInt(100) < 30) {
                n = (new int[]{0, 1, 6, 9, 10, 20, 22})[this.var_java_util_Random_IIl0.nextInt(7)];
                if (iOol.lOlI == 1) {
                    n = (new int[]{2, 3, 7, 11, 12, 17, 18})[this.var_java_util_Random_IIl0.nextInt(7)];
                } else if (iOol.lOlI == 2) {
                    n = (new int[]{4, 5, 8, 13, 14, 21, 23})[this.var_java_util_Random_IIl0.nextInt(7)];
                }
                IOO.III iII2 = IOO.IOO$III_II(n, 1);
                if (iII2 != null) {
                    vector.addElement(this.II(iII2.I1l, 1, n2 + 30, n3));
                }
            }
        }
        if (iOol.IO0_ > System.currentTimeMillis() && iII.l0o1 > 57 && iII.l0o1 < 66 && this.var_java_util_Random_IIl0.nextInt(100) < 20) {
            vector.addElement(this.II(380, 1, n2 + 20, n3));
        }
        if (iOol._lOI == 2 && iOol._lOl == 0 && (iII.l0o1 == 1 || iII.l0o1 == 2 || iII.l0o1 == 3)) {
            vector.addElement(this.II(73, 1, n2 - 12, n3));
        }
        if (iOol._lOI == 8 && iOol._lOl == 1 && (iII.l0o1 == 10 || iII.l0o1 == 11 || iII.l0o1 == 12)) {
            if (iII.l0o1 == (iOol.lOlI == 0 ? 11 : (iOol.lOlI == 1 ? 12 : 10))) {
                vector.addElement(this.II(20, 1, n2 - 12, n3));
                this.Ioo = true;
            } else {
                this.IIol(IOoI.I1O1("\ue4ce\ue4c3\ue4a5\ue4ca\ue57d\ue540\ufbf6\ue508\ue5a5\ue5c8\ufb72\ue58c\ue621\ue64d\uf886\ue67e\ue613\ue67c\ue6c2\ue6fa\ue692\ue770\ue7c3\ue738\ue712\ue7b4\ue7d4\ue7bb\uf91e\ue830\ue841\ue829\uf6a0\ue8ef\ue887\ue8ea\ue881\ue9eb\ue95e\ue966\ue911\ue968\ue9ce\ue9e2\ue982\uea6f\uea71\uea1e\uea29\uea14\uf42a\uead4\ueaf9\uea94\uf5a6\ueb58\ueb75\ueb19\uf52a\ueb92\uebba\ueb98\uecee\uec4d", 58509));
            }
        }
        if (this.Il0O()) {
            this.III(iII, vector);
        }
        this.II(iII, vector);
        if (this.var_java_util_Random_IIl0.nextInt(10000) < (this.Il0I() ? 2 : 1)) {
            vector.addElement(this.II(18 + this.var_java_util_Random_IIl0.nextInt(3), 1, n2, n3));
        }
        if (this.var_java_util_Random_IIl0.nextInt(10000) < (this.Il0I() ? 3 : 2)) {
            int[][] nArrayArray = new int[][]{{441, 95, 5}, {442, 96, 5}, {443, 97, 5}, {444, 99, 3}, {445, 98, 3}, {446, 100, 5}, {447, 101, 5}};
            int[] nArray = nArrayArray[this.var_java_util_Random_IIl0.nextInt(nArrayArray.length)];
            II iI = this.II(nArray[0], 1, n2 + 8, n3);
            iI.IIl.addElement(new int[]{nArray[1], nArray[2]});
            iI.IIl.addElement(new int[]{30, 0});
        }
        return vector;
    }

    boolean Il0I() {
        return this.IOol_II().IO0l > System.currentTimeMillis();
    }

    private boolean II1I(int n, int n2) {
        return n2 > 0 && this.var_java_util_Random_IIl0.nextInt(n2) < n;
    }

    private static boolean III_(int n, int n2, int n3) {
        return n >= n2 && n <= n3;
    }

    private static boolean IIo1(int n) {
        return n == 1 || n == 2 || n == 3 || n == 8 || n == 9 || n == 11 || n == 15 || n == 16 || n == 17;
    }

    private static boolean IIo_(int n) {
        return IOoI.III_(n, 105, 110);
    }

    private static boolean IIoO(int n) {
        return IOoI.III_(n, 92, 94) || IOoI.III_(n, 96, 100) || n == 102 || n == 103;
    }

    private static boolean IIo0(int n) {
        return IOoI.III_(n, 53, 62);
    }

    private static boolean IIoo(int n) {
        return IOoI.III_(n, 63, 83);
    }

    private static boolean Il(int n) {
        return n <= 38 && n != 24 && n != 25 && n != 26 && n != 0 && n != 7 && n != 14 && n != 21 && n != 22 && n != 23;
    }

    private static boolean IlI(int n) {
        return IOoI.III_(n, 156, 159);
    }

    private double double_II() {
        int n = this.IOol_II().Il_1();
        if (n > 250) {
            n = 250;
        }
        if (n < 0) {
            n = 0;
        }
        return Math.pow((double)n / 100.0, 1.5) * 20.0;
    }

    private double III() {
        IOol iOol = this.IOol_II();
        double d = 1.0 + this.double_II() / 100.0;
        d *= 1.0 + (double)Math.max(0, iOol.IIo(206)) / 100.0;
        if (iOol.Il_l() >= 5) {
            d *= 1.25;
        }
        return d;
    }

    private boolean IlII(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        for (n2 = 0; n2 < iOol.var_IO0l_arr_III.length; ++n2) {
            if (iOol.var_IO0l_arr_III[n2].II1_() || iOol.var_IO0l_arr_III[n2].I1l != n) continue;
            return true;
        }
        for (n2 = 0; n2 < iOol.IIII.length; ++n2) {
            if (iOol.IIII[n2].II1_() || iOol.IIII[n2].I1l != n) continue;
            return true;
        }
        return false;
    }

    private boolean II1l(int n, int n2) {
        IOol iOol = this.IOol_II();
        for (int i = 0; i < 5; ++i) {
            if (iOol.II[i] != null && !iOol.II[i].II1_() && iOol.II[i].I1l >= n && iOol.II[i].I1l <= n2) continue;
            return false;
        }
        return true;
    }

    private int IIOo(int n) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{0, 33}, {1, 41}, {2, 49}}, new int[][]{{6, 35}, {7, 43}, {8, 51}}, new int[][]{{27, 30}, {28, 47}, {29, 55}}, new int[][]{{21, 24}, {22, 46}, {23, 53}}, new int[][]{{12, 57}, {12, 57}, {12, 57}}};
        int n2 = this.II1I(10, 100) ? 4 : (this.II1I(23, 100) ? 3 : (this.II1I(23, 100) ? 1 : (this.II1I(23, 100) ? 0 : 2)));
        return nArrayArray[n2][n][this.var_java_util_Random_IIl0.nextInt(2)];
    }

    private int II0(int n) {
        int[][] nArrayArray = new int[][]{{3, 34, 136, 137, 138, 139}, {4, 42, 152, 153, 154, 155}, {5, 50, 168, 169, 170, 171}};
        int[][] nArrayArray2 = new int[][]{{9, 36, 140, 141, 142, 143}, {10, 44, 156, 157, 158, 159}, {11, 52, 172, 173, 174, 175}};
        int[][] nArrayArray3 = new int[][]{{37, 38, 144, 145, 146, 147}, {25, 45, 160, 161, 162, 163}, {26, 54, 176, 177, 178, 179}};
        int[][] nArrayArray4 = new int[][]{{39, 40, 148, 149, 150, 151}, {31, 48, 164, 165, 166, 167}, {32, 56, 180, 181, 182, 183}};
        int[][] nArrayArray5 = new int[][]{{58, 59, 184, 185, 186, 187}, {58, 59, 184, 185, 186, 187}, {58, 59, 184, 185, 186, 187}};
        int[][][] nArrayArray6 = new int[][][]{nArrayArray, nArrayArray3, nArrayArray2, nArrayArray4, nArrayArray5};
        int n2 = this.II1I(10, 100) ? 4 : (this.II1I(23, 100) ? 3 : (this.II1I(23, 100) ? 1 : (this.II1I(23, 100) ? 0 : 2)));
        return nArrayArray6[n2][n][this.var_java_util_Random_IIl0.nextInt(6)];
    }

    private int II0I(int n) {
        if (this.II1I(30, 100)) {
            return n == 0 ? 245 : (n == 1 ? 237 : 241);
        }
        if (n == 0) {
            return this.II1I(50, 100) ? 128 : (this.II1I(50, 100) ? 127 : (this.II1I(50, 100) ? 233 : 129));
        }
        if (n == 1) {
            return this.II1I(50, 100) ? 130 : (this.II1I(50, 100) ? 131 : (this.II1I(50, 100) ? 233 : 132));
        }
        return this.II1I(50, 100) ? 134 : (this.II1I(50, 100) ? 135 : (this.II1I(50, 100) ? 233 : 133));
    }

    private static boolean IlIl(int n) {
        return n == 129 || n == 133 || n == 131 || n == 135;
    }

    private int II0l(int n) {
        IOol iOol = this.IOol_II();
        int n2 = 0;
        IO0l[][] iO0lArrayArray = new IO0l[][]{iOol.II, iOol.var_IO0l_arr_III, iOol.IIII};
        for (int i = 0; i < iO0lArrayArray.length; ++i) {
            if (iO0lArrayArray[i] == null) continue;
            for (int j = 0; j < iO0lArrayArray[i].length; ++j) {
                IOO.III iII;
                IO0l iO0l = iO0lArrayArray[i][j];
                if (iO0l == null || iO0l.II1_()) continue;
                boolean bl = false;
                for (int k = 0; k < iO0l.IIl.size() && !bl; ++k) {
                    if (((int[])iO0l.IIl.elementAt(k))[0] != n) continue;
                    bl = true;
                }
                if (!bl || (iII = IOO.IOO$III_II(iO0l.I1l)) == null || iII.IoI_ < 0 || iII.IoI_ >= 5) continue;
                n2 |= 1 << iII.IoI_;
            }
        }
        return n2;
    }

    private int II01(int n) {
        int[] nArray = II_l[n];
        double[] dArray = new double[nArray.length];
        double d = 0.0;
        for (int i = 0; i < nArray.length; ++i) {
            double d2 = IOoI.IlIl(nArray[i]) ? 0.35 : (nArray[i] == 245 || nArray[i] == 237 || nArray[i] == 241 ? 0.6 : 1.0);
            dArray[i] = d2 * Math.pow(0.5, Integer.bitCount(this.II0l(nArray[i])));
            d += dArray[i];
        }
        double d3 = this.var_java_util_Random_IIl0.nextDouble() * d;
        for (int i = 0; i < nArray.length; ++i) {
            if (!((d3 -= dArray[i]) <= 0.0)) continue;
            return nArray[i];
        }
        return nArray[nArray.length - 1];
    }

    private int II0_(int n) {
        int n2 = this.II0l(n);
        double[] dArray = new double[5];
        double d = 0.0;
        for (int i = 0; i < 5; ++i) {
            dArray[i] = (n2 & 1 << i) != 0 ? 0.3 : 1.0;
            d += dArray[i];
        }
        double d2 = this.var_java_util_Random_IIl0.nextDouble() * d;
        for (int i = 0; i < 5; ++i) {
            if (!((d2 -= dArray[i]) <= 0.0)) continue;
            return i;
        }
        return 4;
    }

    IO0l IIIl(int n, int n2) {
        IO0l iO0l = new IO0l(n, 1);
        Vector vector = IO_I.java_util_Vector_II(n);
        if (vector != null) {
            for (int i = 0; i < vector.size(); ++i) {
                int[] nArray = (int[])vector.elementAt(i);
                iO0l.III(nArray[0], nArray[1]);
            }
        }
        iO0l.III(n2, 1);
        int[] nArray = IOoI.int_arr_IIIl(n2);
        for (int i = 0; i < nArray.length; ++i) {
            iO0l.III(nArray[i], 1);
        }
        iO0l.III(30, 1);
        return iO0l;
    }

    private void II(Vector vector, int n, int n2) {
        int n3;
        Object object;
        IOol iOol = this.IOol_II();
        int n4 = iOol.lOlI > 2 ? 2 : iOol.lOlI;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < 4; ++i) {
            n5 = this.IIOo(n4);
            n6 = this.II01(n4);
            object = IOO.IOO$III_II(n5);
            int n7 = n3 = object != null && (this.II0l(n6) & 1 << ((IOO.III)object).IoI_) != 0 ? 1 : 0;
            if (n3 == 0 || this.var_java_util_Random_IIl0.nextInt(100) < 35) break;
        }
        if (IOO.IOO$III_II(n5) == null) {
            return;
        }
        II iI = this.II(n5, 1, n, n2);
        object = IO_I.java_util_Vector_II(n5);
        if (object != null) {
            for (n3 = 0; n3 < ((Vector)object).size(); ++n3) {
                int[] nArray = (int[])((Vector)object).elementAt(n3);
                iI.IIl.addElement(new int[]{nArray[0], nArray[1]});
            }
        }
        iI.IIl.addElement(new int[]{n6, 1});
        int[] nArray = IOoI.int_arr_IIIl(n6);
        for (int i = 0; i < nArray.length; ++i) {
            iI.IIl.addElement(new int[]{nArray[i], 1});
        }
        iI.IIl.addElement(new int[]{30, 1});
        iI.IO1O = System.currentTimeMillis() + 120000L;
        vector.addElement(iI);
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue57f\ufbc3\ue526\ue546\ue5eb\ue5cc\ufb74\ue596\ue621\ue731\ue78f\uf8bd\ue61e\ue6bc", 58509) + IOO.IOO$III_II((int)n5).II1o + IOoI.I1O1("\ue4ad\ue4df\ue422\ue49e\ue529\ue543\ue5aa\ue505\ue5ed\ue584\ue5ab\ue58d\uf8a0\ue654", 58509));
    }

    private void III(Vector vector, int n, int n2) {
        int n3;
        int n4;
        IOol iOol = this.IOol_II();
        int n5 = this.II0(iOol.lOlI > 2 ? 2 : iOol.lOlI);
        if (IOO.IOO$III_II(n5) == null) {
            return;
        }
        II iI = this.II(n5, 1, n - 8, n2);
        Vector vector2 = IO_I.java_util_Vector_II(n5);
        if (vector2 != null) {
            for (n4 = 0; n4 < vector2.size(); ++n4) {
                int[] nArray = (int[])vector2.elementAt(n4);
                if (nArray[0] == 107) continue;
                iI.IIl.addElement(new int[]{nArray[0], nArray[1]});
            }
        }
        int n6 = (n4 = this.var_java_util_Random_IIl0.nextInt(100)) < 55 ? 0 : (n4 < 85 ? 1 : (n3 = n4 < 97 ? 2 : 3));
        if (n3 > 0) {
            iI.IIl.addElement(new int[]{107, n3});
        }
        iI.IO1O = System.currentTimeMillis() + 120000L;
        vector.addElement(iI);
    }

    private void II(Vector vector, int n, int n2, int n3, int n4, int n5) {
        if (IOO.IOO$III_II(n) == null) {
            return;
        }
        II iI = this.II(n, 1, n2, n3);
        if (n4 >= 0) {
            iI.IIl.addElement(new int[]{n4, n5});
        }
        vector.addElement(iI);
    }

    private void IIII(Vector vector, int n, int n2) {
        int[][] nArrayArray;
        IOol iOol = this.IOol_II();
        if (iOol.lOlI == 0) {
            int[][] nArrayArray2 = new int[5][];
            nArrayArray2[0] = new int[]{232, 47, 300};
            nArrayArray2[1] = new int[]{244, 6, 22000, 27, 3500};
            nArrayArray2[2] = new int[]{256, 0, 1500};
            nArrayArray2[3] = new int[]{268, 7, 19000, 28, 2500};
            nArrayArray = nArrayArray2;
            nArrayArray2[4] = new int[]{280, 0, 0};
        } else if (iOol.lOlI == 1) {
            int[][] nArrayArray3 = new int[5][];
            nArrayArray3[0] = new int[]{236, 47, 300};
            nArrayArray3[1] = new int[]{248, 6, 21000, 27, 3200};
            nArrayArray3[2] = new int[]{260, 0, 1450};
            nArrayArray3[3] = new int[]{272, 7, 20000, 28, 2700};
            nArrayArray = nArrayArray3;
            nArrayArray3[4] = new int[]{280, 0, 0};
        } else {
            int[][] nArrayArray4 = new int[5][];
            nArrayArray4[0] = new int[]{240, 47, 330};
            nArrayArray4[1] = new int[]{252, 6, 20000, 27, 3100};
            nArrayArray4[2] = new int[]{264, 0, 1550};
            nArrayArray4[3] = new int[]{276, 7, 18000, 28, 2300};
            nArrayArray = nArrayArray4;
            nArrayArray4[4] = new int[]{280, 0, 0};
        }
        int[][] nArrayArray5 = nArrayArray;
        int[] nArray = nArrayArray5[this.var_java_util_Random_IIl0.nextInt(nArrayArray5.length)];
        if (IOO.IOO$III_II(nArray[0]) == null) {
            return;
        }
        II iI = this.II(nArray[0], 1, n, n2);
        iI.IO1O = System.currentTimeMillis() + 120000L;
        int n3 = nArray[2];
        if (nArray[0] != 280 && this.II1I(1, 20)) {
            int n4 = this.var_java_util_Random_IIl0.nextInt(100) + 1;
            int n5 = n4 <= 40 ? this.var_java_util_Random_IIl0.nextInt(6) : (n4 <= 70 ? 6 + this.var_java_util_Random_IIl0.nextInt(5) : (n4 <= 90 ? 11 + this.var_java_util_Random_IIl0.nextInt(3) : 14 + this.var_java_util_Random_IIl0.nextInt(2)));
            n3 += n3 * n5 / 100;
        }
        if (nArray[0] != 280) {
            iI.IIl.addElement(new int[]{nArray[1], n3});
        }
        if (nArray.length > 3) {
            iI.IIl.addElement(new int[]{nArray[3], nArray[4]});
        }
        vector.addElement(iI);
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue57f\ufbc3\ue526\ue546\ue5eb\ue5cc\ufb74\ue596\ue621\ue731\ue78f\uf8bd\ue61e\ue6bc", 58509) + IOO.IOO$III_II((int)nArray[0]).II1o);
    }

    void IIO_(int n, int n2) {
        int[] nArray = new int[]{555, 557, 559};
        int[] nArray2 = new int[]{556, 558, 560};
        int[] nArray3 = new int[]{562, 564, 566};
        int[] nArray4 = new int[]{563, 565, 567};
        int n3 = this.II1I(10, 100) ? 561 : (this.II1I(25, 100) ? nArray3[this.var_java_util_Random_IIl0.nextInt(3)] : (this.II1I(45, 100) ? nArray2[this.var_java_util_Random_IIl0.nextInt(3)] : (this.II1I(75, 100) ? nArray[this.var_java_util_Random_IIl0.nextInt(3)] : nArray4[this.var_java_util_Random_IIl0.nextInt(3)])));
        if (IOO.IOO$III_II(n3) == null) {
            return;
        }
        int n4 = 100 + this.var_java_util_Random_IIl0.nextInt(16);
        Vector<int[]> vector = new Vector<int[]>();
        switch (n3) {
            case 555: {
                vector.addElement(new int[]{47, 800 * n4 / 100});
                break;
            }
            case 557: {
                vector.addElement(new int[]{47, 850 * n4 / 100});
                break;
            }
            case 559: {
                vector.addElement(new int[]{47, 900 * n4 / 100});
                break;
            }
            case 556: {
                int n5 = 52000 * n4 / 100;
                vector.addElement(new int[]{22, n5 / 1000});
                vector.addElement(new int[]{27, n5 / 20});
                break;
            }
            case 558: {
                int n6 = 50000 * n4 / 100;
                vector.addElement(new int[]{22, n6 / 1000});
                vector.addElement(new int[]{27, n6 / 20});
                break;
            }
            case 560: {
                int n7 = 48000 * n4 / 100;
                vector.addElement(new int[]{22, n7 / 1000});
                vector.addElement(new int[]{27, n7 / 20});
                break;
            }
            case 562: {
                vector.addElement(new int[]{0, 4400 * n4 / 100});
                break;
            }
            case 564: {
                vector.addElement(new int[]{0, 4300 * n4 / 100});
                break;
            }
            case 566: {
                vector.addElement(new int[]{0, 4500 * n4 / 100});
                break;
            }
            case 563: {
                int n8 = 48000 * n4 / 100;
                vector.addElement(new int[]{23, n8 / 1000});
                vector.addElement(new int[]{28, n8 / 20});
                break;
            }
            case 565: {
                int n9 = 50000 * n4 / 100;
                vector.addElement(new int[]{23, n9 / 1000});
                vector.addElement(new int[]{28, n9 / 20});
                break;
            }
            case 567: {
                int n10 = 46000 * n4 / 100;
                vector.addElement(new int[]{23, n10 / 1000});
                vector.addElement(new int[]{28, n10 * 150 / 1000});
                break;
            }
            default: {
                vector.addElement(new int[]{14, 14 * n4 / 100});
            }
        }
        if (n3 != 561 && n4 > 100) {
            vector.addElement(new int[]{207, n4 - 100});
        }
        if (this.II1I(30, 100)) {
            vector.addElement(new int[]{this.var_java_util_Random_IIl0.nextBoolean() ? 86 : 87, 0});
        }
        vector.addElement(new int[]{21, 15 + this.var_java_util_Random_IIl0.nextInt(3)});
        this.II(n3, 1, n, n2, vector);
    }

    void III0(int n, int n2, int n3) {
        IOO.III iII = IOO.IOO$III_II(n);
        if (iII == null) {
            return;
        }
        Vector<int[]> vector = new Vector<int[]>();
        if (n == 555 || n == 557 || n == 559) {
            vector.addElement(new int[]{47, IOoI.II(iII.lOlI == 2, 1300 + this.var_java_util_Random_IIl0.nextInt(501))});
        } else if (n == 556 || n == 558 || n == 560) {
            vector.addElement(new int[]{22, IOoI.II(iII.lOlI == 0, 45 + this.var_java_util_Random_IIl0.nextInt(11))});
        } else if (n == 562 || n == 564 || n == 566) {
            vector.addElement(new int[]{0, IOoI.II(iII.lOlI == 2, 3500 + this.var_java_util_Random_IIl0.nextInt(1001))});
        } else if (n == 563 || n == 565 || n == 567) {
            vector.addElement(new int[]{23, IOoI.II(iII.lOlI == 1, 35 + this.var_java_util_Random_IIl0.nextInt(11))});
        } else if (n == 561) {
            vector.addElement(new int[]{14, 15 + this.var_java_util_Random_IIl0.nextInt(2)});
        }
        vector.addElement(new int[]{207, 1});
        vector.addElement(new int[]{21, 18});
        vector.addElement(new int[]{30, 1});
        if (this.II1I(90, 100)) {
            vector.addElement(new int[]{107, 1 + this.var_java_util_Random_IIl0.nextInt(3)});
        } else if (this.II1I(4, 100)) {
            vector.addElement(new int[]{107, 5 + this.var_java_util_Random_IIl0.nextInt(3)});
        } else {
            vector.addElement(new int[]{107, 1 + this.var_java_util_Random_IIl0.nextInt(5)});
        }
        this.II(n, 1, n2, n3, vector);
    }

    private static int II(boolean bl, int n) {
        return bl ? (int)((double)n * 1.1) : n;
    }

    private void IIIl(Vector vector, int n, int n2) {
        int[] nArray = new int[]{555, 557, 559};
        int[] nArray2 = new int[]{556, 558, 560};
        int[] nArray3 = new int[]{562, 564, 566};
        int[] nArray4 = new int[]{563, 565, 567};
        int n3 = this.II1I(10, 100) ? 561 : (this.II1I(25, 100) ? nArray3[this.var_java_util_Random_IIl0.nextInt(3)] : (this.II1I(45, 100) ? nArray2[this.var_java_util_Random_IIl0.nextInt(3)] : (this.II1I(75, 100) ? nArray[this.var_java_util_Random_IIl0.nextInt(3)] : nArray4[this.var_java_util_Random_IIl0.nextInt(3)])));
        if (IOO.IOO$III_II(n3) == null) {
            return;
        }
        int n4 = 100 + this.var_java_util_Random_IIl0.nextInt(16);
        II iI = this.II(n3, 1, n, n2);
        iI.IO1O = System.currentTimeMillis() + 120000L;
        switch (n3) {
            case 555: {
                iI.IIl.addElement(new int[]{47, 800 * n4 / 100});
                break;
            }
            case 557: {
                iI.IIl.addElement(new int[]{47, 850 * n4 / 100});
                break;
            }
            case 559: {
                iI.IIl.addElement(new int[]{47, 900 * n4 / 100});
                break;
            }
            case 556: {
                int n5 = 52000 * n4 / 100;
                iI.IIl.addElement(new int[]{22, n5 / 1000});
                iI.IIl.addElement(new int[]{27, n5 / 20});
                break;
            }
            case 558: {
                int n6 = 50000 * n4 / 100;
                iI.IIl.addElement(new int[]{22, n6 / 1000});
                iI.IIl.addElement(new int[]{27, n6 / 20});
                break;
            }
            case 560: {
                int n7 = 48000 * n4 / 100;
                iI.IIl.addElement(new int[]{22, n7 / 1000});
                iI.IIl.addElement(new int[]{27, n7 / 20});
                break;
            }
            case 562: {
                iI.IIl.addElement(new int[]{0, 4400 * n4 / 100});
                break;
            }
            case 564: {
                iI.IIl.addElement(new int[]{0, 4300 * n4 / 100});
                break;
            }
            case 566: {
                iI.IIl.addElement(new int[]{0, 4500 * n4 / 100});
                break;
            }
            case 563: {
                int n8 = 48000 * n4 / 100;
                iI.IIl.addElement(new int[]{23, n8 / 1000});
                iI.IIl.addElement(new int[]{28, n8 / 20});
                break;
            }
            case 565: {
                int n9 = 50000 * n4 / 100;
                iI.IIl.addElement(new int[]{23, n9 / 1000});
                iI.IIl.addElement(new int[]{28, n9 / 20});
                break;
            }
            case 567: {
                int n10 = 46000 * n4 / 100;
                iI.IIl.addElement(new int[]{23, n10 / 1000});
                iI.IIl.addElement(new int[]{28, n10 * 150 / 1000});
                break;
            }
            default: {
                iI.IIl.addElement(new int[]{14, 14 * n4 / 100});
            }
        }
        if (n3 != 561 && n4 > 100) {
            iI.IIl.addElement(new int[]{206, n4 - 100});
        }
        if (this.II1I(30, 100) && this.II1I(70, 100)) {
            iI.IIl.addElement(new int[]{this.var_java_util_Random_IIl0.nextBoolean() ? 86 : 87, 0});
        }
        iI.IIl.addElement(new int[]{21, 15 + this.var_java_util_Random_IIl0.nextInt(3)});
        vector.addElement(iI);
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue57f\ufbc3\ue526\ue546\ue5eb\ue5cc\ufb74\ue596\ue621\ue731\ue78f\uf8bd\ue61e\ue6bc", 58509) + IOO.IOO$III_II((int)n3).II1o);
    }

    private boolean IlI1(int n) {
        IOol iOol = this.IOol_II();
        int n2 = IO0I.IIol();
        if (iOol._1lI != n2) {
            iOol._1lI = n2;
            iOol._1ll = 0;
        }
        if (iOol._1ll >= n) {
            return false;
        }
        ++iOol._1ll;
        return true;
    }

    private void II(III iII, Vector vector) {
        boolean bl;
        int n;
        IOol iOol = this.IOol_II();
        int n2 = iOol.lOlo;
        int n3 = iII.I1;
        int n4 = iII.I1I;
        boolean bl2 = this.Il0I();
        if (IOoI.IlI(n2)) {
            int n5 = 10 + (bl2 ? 5 : 0);
            int n6 = 5 + (bl2 ? 3 : 0);
            int n7 = 1 + (bl2 ? 1 : 0);
            if (this.II1I(n5, 100)) {
                vector.addElement(this.II(933, 1, n3, n4));
            } else if (this.II1I(n6, 100) && this.IlI1(150)) {
                vector.addElement(this.II(934, 1, n3, n4));
            } else if (this.II1I(n7, 500)) {
                vector.addElement(this.II(935, 1, n3, n4));
            }
        }
        if ((n2 == 156 || n2 == 157) && this.IlII(921) && this.II1I(10 + (bl2 ? 5 : 0), 100)) {
            vector.addElement(this.II(1815, 1, n3 + 8, n4));
        }
        double d = this.III();
        if (IOoI.IIo1(n2)) {
            if (this.II1I(1, bl2 ? 21739 : 25000)) {
                vector.addElement(this.II(1634, 1, n3, n4));
            }
            double d2 = d * (bl2 ? 1.5 : 1.0);
            if (this.var_java_util_Random_IIl0.nextDouble() < d2 / 1500.0) {
                this.II(vector, n3, n4);
            }
            if (this.var_java_util_Random_IIl0.nextDouble() < d2 / 500.0) {
                this.III(vector, n3, n4);
            }
        } else if (n2 == 164) {
            if (this.II1I(1, bl2 ? 12000 : 25000)) {
                vector.addElement(this.II(1634, 1, n3, n4));
            }
            double d3 = d * (bl2 ? 2.5 : 1.0);
            if (this.var_java_util_Random_IIl0.nextDouble() < d3 / 500.0) {
                this.II(vector, n3, n4);
            }
            if (this.var_java_util_Random_IIl0.nextDouble() < d3 / 150.0) {
                this.III(vector, n3, n4);
            }
        } else if (IOoI.Il(n2)) {
            double d4 = this.var_java_util_Random_IIl0.nextDouble();
            double d5 = bl2 ? 1.5 : 1.0;
            if (d4 < d * d5 / 1200.0) {
                this.III(vector, n3, n4);
            }
        }
        if (iII.III == null && iII.l0o1 != 0) {
            double d6 = this.var_java_util_Random_IIl0.nextDouble();
            double d7 = d * (bl2 ? 1.5 : 1.0);
            double d8 = n2 == 164 ? 2.0 : 1.0;
            if (d6 < d7 * d8 / 300.0) {
                int n8 = this.var_java_util_Random_IIl0.nextInt(100);
                n = n8 < 30 ? 220 : (n8 < 55 ? 221 : (n8 < 75 ? 222 : (n8 < 90 ? 223 : 224)));
                vector.addElement(this.II(n, 1, n3 + 4, n4));
            }
        }
        if (iII.III == null && iII.l0o1 != 0 && (IOoI.Il(n2) || IOoI.IIoo(n2) || IOoI.IIoO(n2) || IOoI.IIo_(n2) || n2 == 164 || IOoI.IIo0(n2))) {
            double d9 = d * (n2 == 164 ? (bl2 ? 2.5 : 2.0) : (bl2 ? 1.5 : 1.0));
            if (this.var_java_util_Random_IIl0.nextDouble() < d9 / 250.0) {
                this.II(vector, 225, n3 + 8, n4, 74, 0);
            }
            if (this.var_java_util_Random_IIl0.nextDouble() < d9 / 12000.0) {
                vector.addElement(this.II(987, 1, n3 - 12, n4));
            }
            if (this.var_java_util_Random_IIl0.nextDouble() < d9 / 1500.0) {
                vector.addElement(this.II(1229, 1, n3 + 14, n4));
            }
        }
        if (IOoI.IIo0(n2) && this.II1I(bl2 ? 23 : 20, 100)) {
            vector.addElement(this.II(1778, 1, n3, n4));
        }
        if (IOoI.Il(n2) || IOoI.IIoo(n2) || IOoI.IIoO(n2) || IOoI.IIo_(n2)) {
            int n9;
            int n10 = n9 = bl2 ? 11 : 10;
            if (this.II1I(n9, 100000)) {
                vector.addElement(this.II(this.II1I(1, 10) ? 19 : 20, 1, n3 - 8, n4));
            }
        }
        boolean bl3 = bl = IOoI.IIo0(n2) || IOoI.III_(n2, 135, 138) || IOoI.III_(n2, 141, 144) || IOoI.III_(n2, 147, 152) && n2 != 150;
        if ((IOoI.IIo_(n2) || IOoI.IIoO(n2) || bl) && this.II1I(5, 100)) {
            n = IOoI.IIo_(n2) ? 5000 + this.var_java_util_Random_IIl0.nextInt(5001) : (IOoI.IIoO(n2) ? 5000 + this.var_java_util_Random_IIl0.nextInt(3001) : 5000 + this.var_java_util_Random_IIl0.nextInt(4001));
            vector.addElement(this.II(n < 7000 ? 189 : 190, n, n3 - 10, n4));
        }
        if (n2 == 155) {
            if (this.II1l(650, 662) && this.II1I(10, 100)) {
                vector.addElement(this.II(1066 + this.var_java_util_Random_IIl0.nextInt(5), 1, n3, n4));
            }
            if (this.II1I(10, 100)) {
                vector.addElement(this.II(1229, 1, n3 + 8, n4));
            }
        }
        if (IOoI.IIo_(n2)) {
            if (this.II1I(1, bl2 ? 2550 : 3000)) {
                this.IIIl(vector, n3, n4);
            }
            if (this.II1l(555, 567) && this.II1I(3, 333)) {
                vector.addElement(this.II(663 + this.var_java_util_Random_IIl0.nextInt(5), 1, n3 + 10, n4));
            }
            if (this.II1I(1, 2000)) {
                this.IIII(vector, n3, n4);
            }
            if (this.II1I(1, 10000)) {
                this.II(vector, 224, n3, n4, 67, 0);
            } else if (this.II1I(1, 2000)) {
                n = this.var_java_util_Random_IIl0.nextInt(4);
                this.II(vector, 220 + n, n3, n4, 71 - n, 0);
            }
        }
    }

    static int[] IIII(int n) {
        switch (n) {
            case 441: {
                return new int[]{95, 5};
            }
            case 442: {
                return new int[]{96, 5};
            }
            case 443: {
                return new int[]{97, 5};
            }
            case 444: {
                return new int[]{99, 3};
            }
            case 445: {
                return new int[]{98, 3};
            }
            case 446: {
                return new int[]{100, 5};
            }
        }
        return new int[]{101, 5};
    }

    private II II(int n, int n2, int n3, int n4) {
        II iI = new II();
        iI.I1l = this._I00++;
        if (this._I00 > 30000) {
            this._I00 = 1;
        }
        iI.l0o1 = n;
        iI.lo0I = n2;
        iI.I1 = n3;
        iI.I1I = n4;
        iI.IO1O = System.currentTimeMillis() + 60000L;
        this.IIlo.addElement(iI);
        return iI;
    }

    synchronized void II1I(DataInputStream dataInputStream) throws IOException {
        this.I1Il(dataInputStream.readShort());
    }

    synchronized void l110() {
        int n;
        int[] nArray = new int[this.IIlo.size()];
        for (n = 0; n < nArray.length; ++n) {
            nArray[n] = ((II)this.IIlo.elementAt((int)n)).I1l;
        }
        for (n = 0; n < nArray.length; ++n) {
            this.I1Il(nArray[n]);
        }
    }

    private void I1Il(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        II iI = null;
        int n3 = -1;
        for (int i = 0; i < this.IIlo.size(); ++i) {
            II iI2 = (II)this.IIlo.elementAt(i);
            if (iI2.I1l != n) continue;
            iI = iI2;
            n3 = i;
            break;
        }
        if (iI == null) {
            return;
        }
        this.var_IO0_II1.var_IO_1_II.III1(iI.l0o1, iI.I1, iI.I1I);
        if (iI.l0o1 == 74) {
            iOol.llIl = iOol.Illo();
            iOol._loI = iOol.Il1();
            this.l1O0();
            this.var_IOo__II1.II(new IO0o(-20).III(n).II("").III(1));
            this.IIlo.removeElementAt(n3);
            this.I_oO = System.currentTimeMillis() + 2500L;
            return;
        }
        IOO.III iII = IOO.IOO$III_II(iI.l0o1);
        int n4 = n2 = iII == null ? -1 : iII.IoI_;
        if (n2 == 9) {
            iOol.Il11 += (long)iI.lo0I;
            this.var_IO0_II1.var_IO_o_II.Il_1(iI.lo0I);
        } else if (n2 == 10) {
            iOol.lOoO += iI.lo0I;
        } else {
            IO0l iO0l = new IO0l(iI.l0o1, iI.lo0I);
            for (int i = 0; i < iI.IIl.size(); ++i) {
                int[] nArray = (int[])iI.IIl.elementAt(i);
                iO0l.III(nArray[0], nArray[1]);
            }
            if (iO0l.IIl.size() == 0 && iII != null && iII.IoI_ == 6) {
                int[] nArray = new int[]{1, 1, 2, 3, 5, 8, 13, 21};
                iO0l.III(2, nArray[Math.max(0, Math.min(7, iII.lOl_))]);
            }
            if (!this.III0(iO0l)) {
                this.IIol(IOoI.I1O1("\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue589\ue669\ue6d4\ue651\ue639\ue65d\ue6ff\ue649\ue6b4\ue6d9\ue77b\ue75f\uf981\ue755\ue7e0\ue7c1\uf903\ue79f\ue877\ue803\ue86e\ue806\ue8e4\ue85f\ue8a4\ue88e\ue928\ue953\ue92e\uf7a6\ue9a4\ue9cd\ue9aa\uf756\uea74\uea3f\uea4a\uea35\uea96\ueaf6", 58509));
                return;
            }
        }
        this.IIlo.removeElementAt(n3);
        int n5 = iI.lo0I > Short.MAX_VALUE ? Short.MAX_VALUE : iI.lo0I;
        IO0o iO0o = new IO0o(-20).III(n).II("").III(n5);
        if (n2 == 9 || n2 == 10) {
            iO0o.III(n5);
        }
        this.var_IOo__II1.II(iO0o);
        if (n2 == 9 || n2 == 10) {
            this.l1_();
        } else {
            this.l1_l();
        }
        this.II0l(iI.l0o1, iI.lo0I);
        this.var_IO0_II1.I__O();
    }

    synchronized void l11o() {
        if (this.IooI) {
            this.IooI = false;
            return;
        }
        IOol iOol = this.IOol_II();
        this.var_IOo__II1.II(new IO0o(6).II(iOol.Il11).IIII(iOol.lOoO).IIII(iOol._lO));
    }

    void l1_() {
        IOol iOol = this.IOol_II();
        if (this.IOI1 >= 0L && iOol.Il11 > iOol.IOO_ && iOol.Il11 > this.IOI1) {
            iOol.Il11 = Math.max(this.IOI1, iOol.IOO_);
            long l = System.currentTimeMillis();
            if (l - this.IOI_ > 4000L) {
                this.IOI_ = l;
                this.IIol(IOoI.I1O1("\ue4db\ue44c\ue4a5\ue48d\ue529\ue439\ue5a4\ue546\ue494\ufb05\ue5b7\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9", 58509) + iOol.IOO_ / 1000000000L + IOoI.I1O1("\ue4ad\ue4d8\ufa3c\ue4c4\ue529\ue560\ue5a4\ue51f\ue5a5\ue5ca\ue521\ue58c\ue666\ue600\ue658\ue637\uf8a6\ue6f5\ue69b\ue6b2\uf858\ue776\ue717\ue720\ue795\ue7fa\ue7d4\ue7f2\uf92e\ue830\ue87c\ue82f\ue803\ue8f8\ue8ca\ue8e4", 58509));
            }
        }
        this.IOI1 = iOol.Il11;
        this.var_IOo__II1.II(new IO0o(-30).II(4).II(iOol.Il11).IIII(iOol.lOoO).IIII(iOol.llIl).IIII(iOol._loI).IIII(iOol._lO));
        this.var_IO0I_II.II(iOol);
    }

    boolean III0(IO0l iO0l) {
        return this.III(this.IOol_II().var_IO0l_arr_III, iO0l);
    }

    private static boolean III(IO0l iO0l, IO0l iO0l2) {
        if (iO0l.IIl.size() != iO0l2.IIl.size()) {
            return false;
        }
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray;
            int[] nArray2 = (int[])iO0l.IIl.elementAt(i);
            if (nArray2[0] == (nArray = (int[])iO0l2.IIl.elementAt(i))[0] && nArray2[1] == nArray[1]) continue;
            return false;
        }
        return true;
    }

    private static int[] int_arr_III(IO0l iO0l) {
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            if (nArray[0] != 1) continue;
            return nArray;
        }
        return null;
    }

    private boolean II(IO0l[] iO0lArray, IO0l iO0l) {
        int n;
        int[] nArray = IOoI.int_arr_III(iO0l);
        int n2 = nArray == null ? 0 : nArray[1];
        for (n = 0; n < iO0lArray.length; ++n) {
            IO0l iO0l2 = iO0lArray[n];
            if (iO0l2.I1l != 521) continue;
            int[] nArray2 = IOoI.int_arr_III(iO0l2);
            if (nArray2 == null) {
                iO0l2.III(1, n2);
            } else {
                nArray2[1] = nArray2[1] + n2;
            }
            return true;
        }
        iO0l.lo0I = 1;
        for (n = 0; n < iO0lArray.length; ++n) {
            if (!iO0lArray[n].II1_()) continue;
            iO0lArray[n] = iO0l;
            return true;
        }
        return false;
    }

    private void l1_I() {
        IO0l[] iO0lArray = this.IOol_II().var_IO0l_arr_III;
        IO0l iO0l = null;
        boolean bl = false;
        for (int i = 0; i < iO0lArray.length; ++i) {
            int n;
            IO0l iO0l2 = iO0lArray[i];
            if (iO0l2.I1l != 521) continue;
            if (iO0l == null) {
                iO0l = iO0l2;
                continue;
            }
            int[] nArray = IOoI.int_arr_III(iO0l2);
            int[] nArray2 = IOoI.int_arr_III(iO0l);
            int n2 = n = nArray == null ? 0 : nArray[1];
            if (nArray2 == null) {
                iO0l.III(1, n);
            } else {
                nArray2[1] = nArray2[1] + n;
            }
            iO0lArray[i] = new IO0l();
            bl = true;
        }
        if (bl) {
            this.l1_l();
            this.var_IO0_II1.I__O();
        }
    }

    private boolean III(IO0l[] iO0lArray, IO0l iO0l) {
        int n;
        if (iO0l.I1l == 521) {
            return this.II(iO0lArray, iO0l);
        }
        if (IO0l.II0_(iO0l.I1l)) {
            int n2;
            int[] nArray = iO0l.III();
            if (nArray == null) {
                iO0l.III(31, Math.max(1, iO0l.lo0I));
                nArray = iO0l.III();
            }
            iO0l.lo0I = 1;
            for (n2 = 0; n2 < iO0lArray.length; ++n2) {
                IO0l iO0l2 = iO0lArray[n2];
                if (iO0l2.I1l != iO0l.I1l) continue;
                int[] nArray2 = iO0l2.III();
                if (nArray2 == null) {
                    iO0l2.III(31, Math.max(1, iO0l2.lo0I));
                    iO0l2.lo0I = 1;
                    nArray2 = iO0l2.III();
                }
                nArray2[1] = nArray2[1] + nArray[1];
                return true;
            }
            for (n2 = 0; n2 < iO0lArray.length; ++n2) {
                if (!iO0lArray[n2].II1_()) continue;
                iO0lArray[n2] = iO0l;
                return true;
            }
            return false;
        }
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        if (iII != null && iII.Io11) {
            for (n = 0; n < iO0lArray.length; ++n) {
                IO0l iO0l3 = iO0lArray[n];
                if (iO0l3.I1l != iO0l.I1l || !IOoI.III(iO0l3, iO0l) || iO0l.I1l != 457 && iO0l3.lo0I + iO0l.lo0I > 99999) continue;
                iO0l3.lo0I += iO0l.lo0I;
                return true;
            }
        }
        for (n = 0; n < iO0lArray.length; ++n) {
            if (!iO0lArray[n].II1_()) continue;
            iO0lArray[n] = iO0l;
            return true;
        }
        return false;
    }

    private void III(IO0l[] iO0lArray) {
        int n = 0;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (iO0lArray[i].II1_()) continue;
            IO0l iO0l = iO0lArray[i];
            iO0lArray[i] = iO0lArray[n];
            iO0lArray[n] = iO0l;
            ++n;
        }
    }

    void l1_l() {
        IOol iOol = this.IOol_II();
        IO0o iO0o = new IO0o(-36).II(0).II(iOol.var_IO0l_arr_III.length);
        IOoI.III(iO0o, iOol.var_IO0l_arr_III);
        this.var_IOo__II1.II(iO0o);
        this.II1O(false);
    }

    boolean IIIo(IO0l iO0l) {
        String string;
        if (IOol.II0O(iO0l.I1l) < 0) {
            return false;
        }
        IOol iOol = this.IOol_II();
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        String string2 = string = iII != null && iII.II1o != null ? iII.II1o : IOoI.I1O1("\ue4cf\ue45f\ue4a5\ue48d\ue529\ue54b\ue52f\ue584\ue5eb", 58509);
        if (iOol._1I0 == iO0l.I1l) {
            iOol._1I0 = 0;
            this.IIol(IOoI.I1O1("\ue59d\ue44f\ue4eb\ue49e\ufba6\ue55c\ue567", 58509) + string);
        } else {
            iOol._1I0 = iO0l.I1l;
            this.IIol(IOoI.I1O1("\ue59d\ue44f\ue4eb\ue48e\ue5f0\ue546\ue520\ue546", 58509) + string + IOoI.I1O1("\ue4ad\ue484\ue4bd\ufa47\ue57d\ue508\ue537\ue50e\ufb2c\ue5c9\ue5e3\ue594\uf8aa\ue64e\ue61f\uf881\ue65d\ue6f4\ue65b\ue6b4\ue691\ue738\ue743\ue724\ue714\ue7fa\ue7d4\ue7fe\ue7d1\ue874\ue8d6\ue820\ue80a\ue8ac\ue8c7\uf66b\ue880\ue928\ue836\uf785\ue945\ue9f0\uf70c\ue9b6\ue9c8", 58509));
        }
        this.II1O(false);
        this.var_IO0_II1.ll_0();
        this.l1O0();
        this.var_IO0_II1.I__O();
        return true;
    }

    void II1O(boolean bl) {
        int n;
        IOol iOol = this.IOol_II();
        if (iOol == null) {
            return;
        }
        int n2 = 0;
        if (iOol.IO0l_IIIO() != null && (n = IOol.II0O(iOol._1I0)) >= 0) {
            n2 = IOol.I__[n];
        }
        if (!bl && this._lIo != 0 && this._lIo != n2) {
            this.var_IOo__II1.II(new IO0o(-128).II(1).IIII(iOol.I1l).III(this._lIo));
        }
        if (n2 != 0 && (bl || this._lIo != n2)) {
            this.var_IOo__II1.II(new IO0o(-128).II(0).IIII(iOol.I1l).III(n2).II(0).II(-1).III(1).II(0));
        }
        n = this._lIo != n2 ? 1 : 0;
        this._lIo = n2;
        if (n != 0 && !bl) {
            this.var_IO0_II1.ll_0();
        }
    }

    void l1_1() {
        IOol iOol = this.IOol_II();
        IO0o iO0o = new IO0o(-37).II(0).III(iOol.I0).II(iOol.II.length);
        IOoI.III(iO0o, iOol.II);
        this.var_IOo__II1.II(iO0o);
        this.var_IO0_II1.ll__();
        this.II10(false);
        this.l1__();
        this.var_IO0_II1.var_IOOo_II.ll1l();
    }

    void l1__() {
        IOol iOol = this.IOol_II();
        this.var_IOo__II1.II(new IO0o(-30).II(100).III(iOol.Illl()).II(iOol.Ill1()).III(-1));
    }

    void II10(boolean bl) {
        int n;
        boolean bl2;
        boolean bl3;
        IOol iOol = this.IOol_II();
        if (iOol == null) {
            return;
        }
        int n2 = iOol.II(IOol.I__o);
        int n3 = iOol.II(new int[]{253});
        int n4 = iOol.II(IOol.I_O);
        int n5 = iOol.II(IOol.I_0I);
        int n6 = iOol.II(IOol.I_OI);
        int n7 = iOol.II(IOol.I_0);
        int n8 = iOol.II(new int[]{130, 142});
        int n9 = iOol.II(IOol.I_OO);
        int n10 = iOol.II(IOol.I_O_);
        int n11 = iOol.II(IOol.I_O1);
        int n12 = iOol.II(IOol.I_0l);
        int[] nArray = n2 >= 5 || n3 >= 5 || n4 >= 5 || n5 >= 5 ? new int[]{1200} : (n6 >= 5 || n7 >= 5 || n8 >= 5 ? new int[]{10277} : (n9 >= 5 ? new int[]{10277, 5017} : (n10 >= 5 || n11 >= 5 || n12 >= 5 ? new int[]{1202} : new int[]{})));
        boolean bl4 = bl3 = iOol.II(IOol.I_Oo) >= 5 || iOol.II(IOol.I_O0) >= 5 || n9 >= 5 || n2 >= 5 || n5 >= 5 || n3 >= 5 || n4 >= 5 || n8 >= 5 || n7 >= 5 || iOol.II(new int[]{250}) >= 5 || n11 >= 5 || n10 >= 5 || n12 >= 5;
        if (bl3) {
            int[] nArray2 = new int[nArray.length + 1];
            System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
            nArray2[nArray.length] = 504;
            nArray = nArray2;
        }
        if (!bl) {
            for (int i = 0; i < this.I_1I.length; ++i) {
                bl2 = false;
                for (n = 0; n < nArray.length; ++n) {
                    if (nArray[n] != this.I_1I[i]) continue;
                    bl2 = true;
                }
                if (bl2) continue;
                this.var_IOo__II1.II(new IO0o(-128).II(1).IIII(iOol.I1l).III(this.I_1I[i]));
            }
        }
        for (int i = 0; i < nArray.length; ++i) {
            bl2 = false;
            if (!bl) {
                for (n = 0; n < this.I_1I.length; ++n) {
                    if (this.I_1I[n] != nArray[i]) continue;
                    bl2 = true;
                }
            }
            if (bl2) continue;
            this.var_IOo__II1.II(new IO0o(-128).II(0).IIII(iOol.I1l).III(nArray[i]).II(1).II(-1).III(1).II(0));
        }
        this.I_1I = nArray;
    }

    void l1_O() {
        IOol iOol = this.IOol_II();
        IO0o iO0o = new IO0o(-35).II(0).II(iOol.IIII.length);
        IOoI.III(iO0o, iOol.IIII);
        this.var_IOo__II1.II(iO0o);
    }

    void l1_0() {
        IOol iOol = this.IOol_II();
        IO0o iO0o = new IO0o(-35).II(0).II(iOol.IIII.length);
        IOoI.III(iO0o, iOol.IIII);
        this.var_IOo__II1.II(iO0o);
        this.var_IOo__II1.II(new IO0o(-35).II(1));
    }

    private static void III(IO0o iO0o, IO0l[] iO0lArray) {
        for (int i = 0; i < iO0lArray.length; ++i) {
            IO0l iO0l = iO0lArray[i];
            if (iO0l.II1_()) {
                iO0o.III(-1);
                continue;
            }
            iO0o.III(iO0l.I1l).IIII(iO0l.lo0I).II("").II("");
            if (iO0l.IIl.size() == 0) {
                iO0o.II(1).II(73).III(0);
                continue;
            }
            iO0o.II(iO0l.IIl.size());
            for (int j = 0; j < iO0l.IIl.size(); ++j) {
                int[] nArray = (int[])iO0l.IIl.elementAt(j);
                iO0o.II(nArray[0]).III(nArray[1]);
            }
        }
    }

    private static int IIII(IOO.III iII) {
        switch (iII.IoI_) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return iII.IoI_;
            }
            case 32: {
                return 6;
            }
            case 27: {
                return 7;
            }
            case 11: {
                return 8;
            }
            case 23: 
            case 24: {
                return 9;
            }
            case 25: {
                return 10;
            }
        }
        return -1;
    }

    synchronized void II1l(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        byte by2 = dataInputStream.readByte();
        if (by2 < 0) {
            return;
        }
        IOol iOol = this.IOol_II();
        switch (by) {
            case 4: {
                this.I1I1(by2);
                break;
            }
            case 5: {
                this.I1I_(by2);
                break;
            }
            case 0: {
                this.I1IO(by2);
                this.l1o();
                break;
            }
            case 1: {
                this.II(iOol.var_IO0l_arr_III, (int)by2);
                break;
            }
            case 3: {
                this.II(iOol.II, (int)by2);
                break;
            }
            case 6: {
                this.var_IO0_II1.var_IOo_II.I1(by2);
                break;
            }
            case 7: {
                this.var_IO0_II1.var_IOo_II.I1I(by2);
                break;
            }
        }
    }

    void II0o(String string) {
        System.out.println(IOoI.I1O1("\ue4d6\ue4c0\ue4a2\ue49e\ue56c\ue575\ue567\ue516\ue5ea\ue5d4\ue5b6\ue592\ue63b\ue600", 58509) + string);
        this.var_IOo__II1.II(new IO0o(-26).II(string));
    }

    void I1I1(int n) {
        Object object;
        int n2;
        IOol iOol = this.IOol_II();
        if (n < 0) {
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50e\ufb46\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
            return;
        }
        if (n >= iOol.var_IO0l_arr_III.length) {
            return;
        }
        IO0l iO0l = iOol.var_IO0l_arr_III[n];
        if (iO0l.II1_()) {
            return;
        }
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        if (iII == null) {
            return;
        }
        switch (iII.IoI_) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 11: 
            case 23: 
            case 24: 
            case 25: 
            case 27: 
            case 32: {
                break;
            }
            default: {
                this.II0o(IOoI.I1O1("\ue4d9\ue4de\ue4aa\ue484\ue56e\ue508\ue525\ufbad\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue62e\ue615\ue665\ue69b\ue6b2\uf81a\ue768\ue716\ue767", 58509));
                return;
            }
        }
        if (iII.lOlI < 3 && iII.lOlI != iOol.lOlI) {
            this.II0o(IOoI.I1O1("\ue4d9\ue4de\ue4aa\ue484\ue56e\ue508\ue525\ufbad\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue62e\ue615\ue665\ue69b\ue6b2\uf81a\ue768\ue716", 58509));
            return;
        }
        if (!(iO0l.I1l != 691 && iO0l.I1l != 692 && iO0l.I1l != 693 || iOol.II[0].II1_() && iOol.II[5].II1_())) {
            this.II0o(IOoI.I1O1("\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c7\ufb1c\ue58b\ue621\ue6c1\ue650\ue67e\ue76c\uf85f\ue69b\ue6b9\ue60a\ue738\ue743\ue73e\uf9b6\ue7b4\ue7c0\uf93f\ue7d1\ue874\uf6ca\ue820\ue80a\ue8ac\ue8da\ue8bf\uf64e\ue966\ue907\ue857\ue90c\ue9a4\ue9c1\ue9ab\uf722\uea6e", 58509));
            return;
        }
        long l = iII.I101;
        for (n2 = 0; n2 < iO0l.IIl.size(); ++n2) {
            object = (int[])iO0l.IIl.elementAt(n2);
            if (object[0] != 21) continue;
            l = (long)object[1] * 1000000000L;
            break;
        }
        if (iOol.IO_l < l) {
            this.II0o(IOoI.I1O1("\ue4de\ufa45\ue4a8\ue4ca\ue564\ufb89\ue529\ue50e\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue74f\uf89a\ue6bc\ue6c2\ue630\ue68c\ue738\ue754\uf9f1\ue700\ue7b5", 58509));
            return;
        }
        if (iO0l.I1l == 547 || iO0l.I1l == 548 || iO0l.I1l == 1302) {
            this.II0o(IOoI.I1O1("\ue4ce\ufa0f\ue4a2\ue4ca\ue57d\ue55a\ue526\ue508\ue5e2\ue584\ue5ad\ue502\ue678\ue600\ue65c\ue636\uf8b4\ue6bc\ue6df\ue63a\ue697\ue770\ue717\ue735\ue71d\ue7fb\ue793\ue6c3\uf936\ue830\ue85b\uf6a3\ue84c", 58509));
            return;
        }
        this.void_III(iO0l);
        this.IIII(iO0l);
        n2 = IOoI.IIII(iII);
        if (n2 < 0 || n2 >= iOol.II.length) {
            this.II0o(IOoI.I1O1("\ue4d9\ue4de\ue4aa\ue484\ue56e\ue508\ue525\ufbad\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue62e\ue615\ue665\ue69b\ue6b2\uf81a\ue768\ue716\ue767", 58509));
            return;
        }
        object = iOol.II[n2];
        iOol.II[n2] = iO0l;
        iOol.var_IO0l_arr_III[n] = object;
        this.l1_l();
        this.l1_1();
        this.var_IO0_II1.ll_0();
        this.var_IO0_II1.ll__();
        this.var_IO0_II1.ll_1();
        this.var_IO0_II1.I__O();
    }

    void void_III(IO0l iO0l) {
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            if (nArray[0] != 210) continue;
            iO0l.IIl.removeElementAt(i);
            int[] nArray2 = new int[]{8, 14, 108, 94, 108, 16, 80, 81, 97, 100, 101, 104, 106};
            Vector<Integer> vector = new Vector<Integer>();
            while (vector.size() < nArray[1] && vector.size() < nArray2.length) {
                Integer n = new Integer(nArray2[this.var_java_util_Random_IIl0.nextInt(nArray2.length)]);
                if (vector.contains(n)) continue;
                vector.addElement(n);
            }
            for (int j = 0; j < vector.size(); ++j) {
                int n = (Integer)vector.elementAt(j);
                int n2 = 0;
                if (n == 8 || n == 14 || n == 108 || n == 94) {
                    n2 = 3 + this.var_java_util_Random_IIl0.nextInt(3);
                } else if (n == 16 || n == 80 || n == 81 || n == 97 || n == 100 || n == 101 || n == 104) {
                    n2 = 10 + this.var_java_util_Random_IIl0.nextInt(16);
                }
                iO0l.III(n, n2);
            }
            break;
        }
    }

    void IIII(IO0l iO0l) {
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            if (nArray[0] != 231) continue;
            iO0l.IIl.removeElementAt(i);
            if (!(this.var_java_util_Random_IIl0.nextDouble() <= 0.99)) break;
            int[] nArray2 = new int[]{3, 7, 15, 21};
            iO0l.III(93, nArray2[this.var_java_util_Random_IIl0.nextInt(4)]);
            break;
        }
    }

    private void I1I_(int n) {
        IOol iOol = this.IOol_II();
        if (n >= iOol.II.length || iOol.II[n].II1_()) {
            return;
        }
        int n2 = -1;
        for (int i = 0; i < iOol.var_IO0l_arr_III.length; ++i) {
            if (!iOol.var_IO0l_arr_III[i].II1_()) continue;
            n2 = i;
            break;
        }
        if (n2 < 0) {
            this.IIol(IOoI.I1O1("\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue589\ue669\ue6d4\ue651\ue639\ue65d\ue6ff\ue649\ue6b4\ue6d9\ue77b\ue75f\uf981\ue755\ue7e0\ue7c1\uf903\ue79f\ue877", 58509));
            return;
        }
        iOol.var_IO0l_arr_III[n2] = iOol.II[n];
        iOol.II[n] = new IO0l();
        this.l1_l();
        this.l1_1();
        this.var_IO0_II1.ll_1();
        this.var_IO0_II1.ll_0();
        this.var_IO0_II1.I__O();
    }

    private void II(IO0l[] iO0lArray, int n) {
        IOol iOol = this.IOol_II();
        if (n >= iO0lArray.length || iO0lArray[n].II1_()) {
            return;
        }
        if (iO0lArray[n].I1l == 457) {
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50e\ufb46\ue584\ue5a0\ufb47\ue675\ue600\ue649\ue6be\ue613\ue6fb\ue69b\ue6ac\ue619\ue777\ue717\ue724\ue6c5\ue635\ue7dd\ue7b5", 58509));
            return;
        }
        IO0l iO0l = iO0lArray[n];
        if (!this.III(iOol.IIII, iO0l)) {
            this.IIol(IOoI.I1O1("\ue4df\ue51c\ue56a\ue484\ue56e\ue508\ue456\ufbb5\ue5a5\ue4b5\ue520\ue5c2\ue710\uf887\ue646", 58509));
            return;
        }
        iO0lArray[n] = new IO0l();
        if (iO0lArray == iOol.var_IO0l_arr_III) {
            this.III(iOol.var_IO0l_arr_III);
        }
        this.l1_l();
        this.l1_1();
        this.l1_0();
        this.var_IO0_II1.ll_1();
        this.var_IO0_II1.ll_0();
        this.var_IO0_II1.I__O();
    }

    private void I1IO(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        if (n >= iOol.IIII.length || iOol.IIII[n].II1_()) {
            return;
        }
        IO0l iO0l = iOol.IIII[n];
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        boolean bl = false;
        int n3 = n2 = iII == null ? -1 : IOoI.IIII(iII);
        if (n2 >= 0 && n2 < iOol.II.length && iOol.II[n2].II1_() && (iII.lOlI >= 3 || iII.lOlI == iOol.lOlI) && iOol.IO_l >= iII.I101) {
            iOol.II[n2] = iO0l;
            iOol.IIII[n] = new IO0l();
            bl = true;
        }
        if (!bl) {
            if (!this.III0(iO0l)) {
                this.IIol(IOoI.I1O1("\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue589\ue669\ue6d4\ue651\ue639\ue65d\ue6ff\ue649\ue6b4\ue6d9\ue77b\ue75f\uf981\ue755\ue7e0\ue7c1\uf903\ue79f\ue877", 58509));
                return;
            }
            iOol.IIII[n] = new IO0l();
        }
        this.l1_l();
        this.l1_1();
        this.l1_0();
        this.var_IO0_II1.ll_1();
        this.var_IO0_II1.ll_0();
        this.var_IO0_II1.I__O();
    }

    synchronized void II11(DataInputStream dataInputStream) throws IOException {
        IO0l[] iO0lArray;
        byte by = dataInputStream.readByte();
        byte by2 = dataInputStream.readByte();
        int n = dataInputStream.readByte();
        IOol iOol = this.IOol_II();
        if (n == -1) {
            short s = dataInputStream.readShort();
            for (int i = 0; i < iOol.var_IO0l_arr_III.length; ++i) {
                if (iOol.var_IO0l_arr_III[i].I1l != s) continue;
                n = i;
                break;
            }
        }
        if (n < 0) {
            return;
        }
        IO0l[] iO0lArray2 = iO0lArray = by2 == 0 ? iOol.II : iOol.var_IO0l_arr_III;
        if (n >= iO0lArray.length || iO0lArray[n].II1_()) {
            return;
        }
        IO0l iO0l = iO0lArray[n];
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        if (iII == null) {
            return;
        }
        switch (by) {
            case 0: {
                if (by2 == 0) {
                    this.I1I_(n);
                    break;
                }
                if (iII.IoI_ == 7) {
                    this.IooI = true;
                    this.var_IOo__II1.II(new IO0o(-43).II(0).II(by2).II(n).II(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue56a\ue540\ufbe8\ue505\ue5a5\ue5c7\ue5ab\ufb4d\ue66f\ue600\ue657\uf893\ue61e\ue6bc", 58509) + iII.II1o + IOoI.I1O1("\ue4b2", 58509)));
                    break;
                }
                this.II(n, iO0l, iII);
                break;
            }
            case 3: {
                this.II(n, iO0l, iII);
                break;
            }
            case 1: {
                this.IooI = true;
                this.var_IOo__II1.II(new IO0o(-43).II(1).II(by2).II(n).II(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue56a\ue540\ufbe8\ue505\ue5a5\ue5c7\ue5ab\ufb4d\ue66f\ue600\ue652\ue62b\uf8ac\ue6f2\ue69b\ue6ac\uf810\ue76c\ue717", 58509) + iII.II1o + IOoI.I1O1("\ue4b2", 58509)));
                break;
            }
            case 2: {
                iO0lArray[n] = new IO0l();
                if (by2 == 0) {
                    this.l1_1();
                    this.var_IO0_II1.ll_0();
                } else {
                    this.l1_l();
                }
                this.var_IO0_II1.I__O();
                break;
            }
        }
    }

    private void II(int n, IO0l iO0l) {
        int n2;
        int n3;
        IOol iOol = this.IOol_II();
        int n4 = -1;
        for (n3 = 0; n3 < 15; ++n3) {
            if (IOol.I_1O[n3] != iO0l.I1l) continue;
            n4 = n3;
            break;
        }
        if (n4 < 0) {
            this.IIol(IOoI.I1O1("\ue4ce\ue4c4\ue57b\ue48b\ue529\ue55c\ue52f\ufba5\ue5a5\ue5d7\ufb2e\ue5c2\ue665\uf8c5\ue651\ue639\ue65d\ue6ea\uf816\ue6ae\ue6d9\ue768\ue75f\uf9ff\ue718\ue7b4\ue7dd\ue732\ue788", 58509));
            return;
        }
        int n5 = n4 < 10 ? (n4 % 2 == 0 ? n4 + 1 : n4 - 1) : (n3 = -1);
        if (n3 >= 0 && iOol.IlIo(n3)) {
            this.IIol(IOoI.I1O1("\ue4ce\ue4c4\ufa02\ue4ca\ue56a\ue5db\ue567\ue512\ue5ed\ufb67\ue5e3\ue591\uf8ec\ue600\ue65b\uf8bb\ue613\ue6fb\ue69b\ue6b9\ue600\ue776\ue750\ue776\ue719\ue76e\ue7d0\ue7f2\ue7c0\ue830\ue859\uf6e3\ue819\ue8ac\ue8db\ue8a2\uf640\ue965\ue907\ue924\uf7b0\ue9a4\ue9d7\ue9b0\uf702\uea20\uea7c\ueac7\uea33\uea1b\ueabb\uead6\ueab6\uf459\ueb7e", 58509));
            return;
        }
        if (n4 >= 12) {
            for (n2 = 12; n2 < 15; ++n2) {
                if (n2 == n4 || !iOol.IlIo(n2)) continue;
                this.IIol(IOoI.I1O1("\ue4ce\ue4c4\ufa02\ue4ca\ue56a\ue5db\ue567\ue512\ue5ed\ufb67\ue5e3\ue591\uf8ec\ue600\ue65b\uf8bb\ue613\ue6fb\ue69b\ue6b9\ue600\ue776\ue750\ue776\ue719\ue76e\ue7d0\ue7f2\ue7c0\ue830\ue859\uf6e3\ue819\ue8ac\ue8db\ue8a2\uf640\ue965\ue907\ue924\uf7b0\ue9a4\ue9d7\ue9b0\uf702\uea20\uea7c\ueac7\uea33\uea1b\ueabb\uead6\ueab6\uf459\ueb7e", 58509));
                return;
            }
        }
        n2 = n4 >= 12 ? 1800000 : 600000;
        iOol.IIl_[n4] = System.currentTimeMillis() + (long)n2;
        iOol.IIlI[n4] = true;
        this.II0(n, 1);
        this.var_IOo__II1.II(new IO0o(-106).III(IOol.I_1_[n4]).III(n2 / 1000));
        this.var_IO0_II1.ll_0();
        this.l1O0();
        this.var_IO0_II1.I__O();
    }

    private static int[] II(IO0l iO0l, int n) {
        for (int i = 0; i < iO0l.IIl.size(); ++i) {
            int[] nArray = (int[])iO0l.IIl.elementAt(i);
            if (nArray[0] != n) continue;
            return nArray;
        }
        return null;
    }

    private static boolean IlI_(int n) {
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 9: 
            case 10: 
            case 11: 
            case 17: 
            case 20: {
                return true;
            }
        }
        return false;
    }

    boolean Il0l() {
        IOol iOol = this.IOol_II();
        return iOol != null && iOol.IIo(25) > 0 && System.currentTimeMillis() % 5000L < 1500L;
    }

    boolean Il01() {
        IOol iOol = this.IOol_II();
        long l = System.currentTimeMillis();
        return iOol.IIo(105) > 0 && l - this.IOIO >= 5000L && l - this.IOI0 >= 5000L;
    }

    private void IIo(String string) {
        this.var_IOo__II1.II(new IO0o(44).IIII(this.IOol_II().I1l).II(string));
    }

    private void II1_(long l) {
        IOol iOol = this.IOol_II();
        if (l - this.IOIo >= 60000L && l - this.IOIO < 30000L) {
            int[] nArray;
            if (IOol.IIl(iOol.II[6]) && (nArray = IOoI.II(iOol.II[6], 9)) != null && nArray[1] < 1000) {
                nArray[1] = nArray[1] + 1;
                this.l1_1();
            }
            this.IOIo = l;
        }
        if (l - this.IOl >= 60000L) {
            this.IOl = l;
            for (int i = 0; i < 2; ++i) {
                IO0l[] iO0lArray = i == 0 ? iOol.var_IO0l_arr_III : iOol.IIII;
                for (int j = 0; j < iO0lArray.length; ++j) {
                    int[] nArray;
                    IO0l iO0l = iO0lArray[j];
                    if (iO0l == null || iO0l.II1_() || !IOol.IIl(iO0l) || (nArray = IOoI.II(iO0l, 9)) == null || nArray[1] <= 0) continue;
                    nArray[1] = nArray[1] - 1;
                }
            }
            this.l1_l();
            this.var_IO0_II1.ll_0();
        }
        this.II10(l);
    }

    private Vector java_util_Vector_IIIl(int n) {
        IOol iOol = this.IOol_II();
        Vector<IO_I.III> vector = new Vector<IO_I.III>();
        for (int i = 0; i < this.var_IO_I_II.var_java_util_Vector_III_.size(); ++i) {
            long l;
            long l2;
            IO_I.III iII = (IO_I.III)this.var_IO_I_II.var_java_util_Vector_III_.elementAt(i);
            if (!this.var_IO_I_II.boolean_III(iII) || iII.lOlo != iOol.lOlo || iII.lO1 != iOol.lO1 || (l2 = (long)(iII.I1 - iOol.I1)) * l2 + (l = (long)(iII.I1I - iOol.I1I)) * l > (long)n * (long)n) continue;
            vector.addElement(iII);
        }
        return vector;
    }

    private void IIOO(int n, int n2) {
        IOol iOol = this.IOol_II();
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            long l;
            long l2;
            III iII = this.var_IOoI$III_arr_II[i];
            if (iII.IoOo || iII.III != null || iII.l0o1 != 70 && iII.l0o1 != 77 || iII.llIl <= 1 || (l2 = (long)(iII.I1 - iOol.I1)) * l2 + (l = (long)(iII.I1I - iOol.I1I)) * l > (long)n * (long)n) continue;
            int n3 = (int)((long)iII.lOlO * (long)n2 / 100L);
            if (n3 >= iII.llIl) {
                n3 = iII.llIl - 1;
            }
            if (n3 <= 0) continue;
            iII.llIl -= n3;
            this.var_IOo__II1.II(new IO0o(-9).II(i).IIII(iII.llIl).IIII(n3).II(false).II(-1));
        }
    }

    private void II1O(long l) {
        int n;
        int n2;
        Object object;
        int n3;
        Vector vector;
        IOol iOol = this.IOol_II();
        int n4 = iOol.IIo(109);
        if (n4 > 0 && l - this.IOlO >= 10000L) {
            this.IOlO = l;
            vector = this.java_util_Vector_IIIl(200);
            for (n3 = 0; n3 < vector.size(); ++n3) {
                object = (IO_I.III)vector.elementAt(n3);
                if (!this.var_IO_I_II.boolean_IIII((IO_I.III)object)) {
                    n2 = (int)((long)((IO_I.III)object).lOlO * (long)n4 / 100L);
                    if (n2 >= ((IO_I.III)object).llIl) {
                        n2 = ((IO_I.III)object).llIl - 1;
                    }
                    if (n2 > 0) {
                        ((IO_I.III)object).llIl -= n2;
                        this.var_IOo__II1.II(new IO0o(-30).II(9).IIII(((IO_I.III)object).I1l).IIII(((IO_I.III)object).llIl).IIII(((IO_I.III)object).lOlO));
                    }
                }
                this.var_IO_I_II.void_II((IO_I.III)object, Il0[this.var_java_util_Random_IIl0.nextInt(Il0.length)]);
            }
            this.var_IO_l_II.II(iOol.I1, iOol.I1I, 200, Il0);
            this.IIOO(200, n4);
        }
        if ((iOol.IIo(117) > 0 || iOol.IIo(226) > 0) && l - this.IOl0 >= 10000L) {
            this.IOl0 = l;
            vector = this.java_util_Vector_IIIl(120);
            for (n3 = 0; n3 < vector.size(); ++n3) {
                this.var_IO_I_II.void_II((IO_I.III)vector.elementAt(n3), Il0I[0]);
            }
            this.var_IO_l_II.II(iOol.I1, iOol.I1I, 120, Il0I);
        }
        if ((n = iOol.IIo(162)) > 0 && l - this.IO1I >= 1000L) {
            this.IO1I = l;
            if (iOol._loI < iOol.Il1()) {
                iOol._loI = Math.min(iOol.Il1(), iOol._loI + (int)Math.max(1L, (long)iOol.Il1() * (long)n / 100L));
                this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
            }
        }
        if ((n3 = iOol.IIo(229)) > 0 && l - this.IO1l >= 30000L) {
            this.IO1l = l;
            object = this.java_util_Vector_IIIl(200);
            for (n2 = 0; n2 < ((Vector)object).size(); ++n2) {
                IO_I.III iII = (IO_I.III)((Vector)object).elementAt(n2);
                if (this.var_IO_I_II.boolean_IIII(iII)) continue;
                int n5 = (int)((long)iII.lOlO * (long)n3 / 100L);
                if (n5 >= iII.llIl) {
                    n5 = iII.llIl - 1;
                }
                if (n5 <= 0) continue;
                iII.llIl -= n5;
                this.var_IOo__II1.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
            }
            this.IIOO(200, n3);
        }
        if ((iOol.IIo(29) > 0 || iOol.IIo(115) > 0 || iOol.IIo(186) > 0 || iOol.IIo(163) > 0) && l - this.IO11 >= 30000L) {
            this.IO11 = l;
            int n6 = Math.min(90, iOol.IIo(126));
            Vector vector2 = this.java_util_Vector_IIIl(200);
            for (int i = 0; i < vector2.size(); ++i) {
                IO_I.III iII = (IO_I.III)vector2.elementAt(i);
                this.var_IO_I_II.void_II(iII, 30000, -1);
                if (n6 <= 0) continue;
                iII.I1_I = l + 30000L;
                iII.lO__ = n6;
            }
        }
        if (iOol.IIo(26) > 0 && l - this.IOlo >= 30000L) {
            this.IOlo = l;
            Vector vector3 = this.java_util_Vector_IIIl(200);
            for (int i = 0; i < vector3.size(); ++i) {
                this.var_IO_I_II.void_II((IO_I.III)vector3.elementAt(i), 6000, 42);
            }
        }
        if (iOol.IIo(24) > 0 && l - this.IO1 >= 10000L) {
            this.IO1 = l;
            Vector vector4 = this.java_util_Vector_IIIl(200);
            for (int i = 0; i < vector4.size(); ++i) {
                IO_I.III iII = (IO_I.III)vector4.elementAt(i);
                iII.I1_l = l + 5000L;
                this.var_IO_I_II.void_II(iII, Il0l[0]);
            }
            this.var_IO_l_II.II(iOol.I1, iOol.I1I, 200, Il0l);
        }
    }

    private void II10(long l) {
        int n;
        IOol iOol = this.IOol_II();
        if (iOol.llIl <= 0) {
            return;
        }
        this.II1O(l);
        int n2 = iOol.IIo(8);
        if (n2 > 0 && (iOol.llIl < iOol.Illo() || iOol._loI < iOol.Il1()) && l - this.IOlI >= 5000L) {
            this.IOlI = l;
            int n3 = 0;
            for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
                long l2;
                long l3;
                III iII = this.var_IOoI$III_arr_II[i];
                if (iII.IoOo || iII.III != null || iII.l0o1 == 117 || iII.llIl <= 1 || (l3 = (long)(iII.I1 - iOol.I1)) * l3 + (l2 = (long)(iII.I1I - iOol.I1I)) * l2 > 40000L) continue;
                int n4 = (int)((long)iII.lOlO * (long)n2 / 100L);
                if (n4 >= iII.llIl) {
                    n4 = iII.llIl - 1;
                }
                if (n4 <= 0) continue;
                iII.llIl -= n4;
                n3 += n4;
                this.var_IOo__II1.II(new IO0o(-9).II(i).IIII(iII.llIl).IIII(n4).II(false).II(-1));
            }
            Vector vector = this.java_util_Vector_IIIl(200);
            for (n = 0; n < vector.size(); ++n) {
                IO_I.III iII = (IO_I.III)vector.elementAt(n);
                if (this.var_IO_I_II.boolean_IIII(iII)) continue;
                int n5 = (int)((long)iII.lOlO * (long)n2 / 100L);
                if (n5 >= iII.llIl) {
                    n5 = iII.llIl - 1;
                }
                if (n5 <= 0) continue;
                iII.llIl -= n5;
                n3 += n5;
                this.var_IOo__II1.II(new IO0o(-30).II(9).IIII(iII.I1l).IIII(iII.llIl).IIII(iII.lOlO));
            }
            if (n3 > 0) {
                iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + n3);
                this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
            }
        }
        if (iOol.IIo(111) > 0 && l - this.IOl_ >= 10000L) {
            this.IOl_ = l;
            if (iOol.Il10() > 0) {
                this.IIo(IlOo[this.var_java_util_Random_IIl0.nextInt(IlOo.length)]);
                Vector vector = this.java_util_Vector_IIIl(200);
                for (int i = 0; i < vector.size(); ++i) {
                    this.var_IO_I_II.void_II((IO_I.III)vector.elementAt(i), IlOo[this.var_java_util_Random_IIl0.nextInt(IlOo.length)]);
                }
                this.var_IO_l_II.II(iOol.I1, iOol.I1I, 200, IlOo);
            }
        }
        if (l - this.IOll >= 5000L) {
            this.IOll = l;
            IO0l iO0l = iOol.II[5];
            if (iO0l != null && !iO0l.II1_() && iO0l.I1l >= 618 && iO0l.I1l <= 626) {
                boolean bl = false;
                for (n = 0; n < iO0l.IIl.size(); ++n) {
                    int[] nArray = (int[])iO0l.IIl.elementAt(n);
                    if (nArray[0] != 147 && nArray[0] != 77 && nArray[0] != 103 || nArray[1] == 3) continue;
                    nArray[1] = 3;
                    bl = true;
                }
                if (bl) {
                    this.l1_1();
                    this.var_IO0_II1.ll_0();
                }
            }
        }
    }

    private int int_III(IOO.IIIO iIIO) {
        if (iIIO == null || iIIO.lO0I != 1 && iIIO.lO0I != 3 && iIIO.lO0I != 5) {
            return 1;
        }
        int n = this.IOol_II().IIo(159);
        if (n <= 1) {
            return 1;
        }
        long l = System.currentTimeMillis();
        if (l - this.IOl1 < 60000L) {
            return 1;
        }
        this.IOl1 = l;
        return n;
    }

    private void void_III(int n, IO0l iO0l) {
        IOol iOol = this.IOol_II();
        int n2 = 0;
        for (int i = 0; i < this.var_java_util_Vector_IIl0.size(); ++i) {
            IIII iIII = (IIII)this.var_java_util_Vector_IIl0.elementAt(i);
            if (iIII.lOlo != iOol.lOlo || iIII.lO1 != iOol.lO1) continue;
            ++n2;
        }
        if (n2 >= 3) {
            this.IIol(IOoI.I1O1("\ue4c0\ufa7b\ue4a2\ue4ca\ue564\ue549\ue537\ue546\ue5e6\ue5cc\ufb0a\ue5c2\ue710\uf897\ue64b\ue67e\ue76c\ue72c\uf858\ue6b9\ue6d9\ue72b\ue717\ue700\uf9b2\ue7b4\ue7e7\ue7bb\ue79f\ue878", 58509));
            return;
        }
        IIII iIII = new IIII();
        iIII.I1l = this._I00++;
        if (this._I00 > 30000) {
            this._I00 = 1;
        }
        iIII.l0o1 = iO0l.I1l;
        iIII.lOlo = iOol.lOlo;
        iIII.lO1 = iOol.lO1;
        iIII.I1 = iOol.I1;
        iIII.I1I = iOol.I1I;
        iIII.IO1O = System.currentTimeMillis() + 1800000L;
        this.var_java_util_Vector_IIl0.addElement(iIII);
        this.var_IOo__II1.II(new IO0o(68).III(iIII.I1l).III(iIII.l0o1).III(iIII.I1).III(iIII.I1I).IIII(-2).III(200));
        this.II0(n, 1);
    }

    private void l1_o() {
        IOol iOol = this.IOol_II();
        for (int i = 0; i < this.var_java_util_Vector_IIl0.size(); ++i) {
            IIII iIII = (IIII)this.var_java_util_Vector_IIl0.elementAt(i);
            if (iIII.lOlo != iOol.lOlo || iIII.lO1 != iOol.lO1) continue;
            this.var_IOo__II1.II(new IO0o(68).III(iIII.I1l).III(iIII.l0o1).III(iIII.I1).III(iIII.I1I).IIII(-2).III(200));
        }
    }

    private void II1o(long l) {
        IOol iOol = this.IOol_II();
        block6: for (int i = this.var_java_util_Vector_IIl0.size() - 1; i >= 0; --i) {
            long l2;
            long l3;
            IIII iIII = (IIII)this.var_java_util_Vector_IIl0.elementAt(i);
            if (l > iIII.IO1O) {
                this.var_java_util_Vector_IIl0.removeElementAt(i);
                if (iIII.lOlo != iOol.lOlo || iIII.lO1 != iOol.lO1) continue;
                this.var_IOo__II1.II(new IO0o(-21).III(iIII.I1l));
                continue;
            }
            if (iIII.lOlo != iOol.lOlo || iIII.lO1 != iOol.lO1 || iOol.llIl <= 0 || (l3 = (long)(iOol.I1 - iIII.I1)) * l3 + (l2 = (long)(iOol.I1I - iIII.I1I)) * l2 >= 40000L) continue;
            switch (iIII.l0o1) {
                case 342: {
                    if (l - this.I_0 < 3000L) continue block6;
                    this.I_0 = l;
                    if (iOol._loI >= iOol.Il1()) continue block6;
                    iOol._loI = Math.min(iOol.Il1(), iOol._loI + iOol.Il1() / 10);
                    this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
                    continue block6;
                }
                case 345: {
                    if (l - this.I_0I < 3000L) continue block6;
                    this.I_0I = l;
                    if (iOol.llIl >= iOol.Illo()) continue block6;
                    iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + iOol.Illo() / 10);
                    this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
                    continue block6;
                }
                case 343: {
                    this.I_0l = l + 3000L;
                    continue block6;
                }
                case 344: {
                    this.I_01 = l + 3000L;
                    continue block6;
                }
            }
        }
    }

    private void IIIl(IO0l iO0l) {
        int n;
        IOol iOol = this.IOol_II();
        long l = System.currentTimeMillis();
        int[] nArray = null;
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            int[] nArray2 = (int[])iO0l.IIl.elementAt(n);
            if (nArray2[0] != 1) continue;
            nArray = nArray2;
            break;
        }
        if (iOol.IOOo > l) {
            if (nArray != null) {
                nArray[1] = nArray[1] + (int)((iOol.IOOo - l) / 60000L);
            }
            iOol.IOOo = 0L;
            this.var_IOo__II1.II(new IO0o(-116).II(0));
            this.var_IOo__II1.II(new IO0o(-106).III(4387).III(0));
        } else {
            int n2;
            int n3 = n = nArray == null ? 0 : nArray[1];
            if (n <= 0) {
                this.IIol(IOoI.I1O1("\ue4d9\ue4c4\ue4a2\ufa55\ue57d\ue508\ue525\ufbad\ue5a5\ue4b5\ue520\ue5c2\ue669\uf89f\ue64b\ue67e\ue609\ue6f4\uf866\ue6b3\ue6d9\ue77f\ue75e\ue737\ue71b\ue7b4\ue7c0\uf93f\ue7d1\ue874\uf6ca\ue820\ue80a", 58509));
                return;
            }
            nArray[1] = n2 = Math.max((n * 60 - 30000) / 60, 0);
            int n4 = Math.min((n - n2) * 60, 30000);
            iOol.IOOo = l + (long)n4 * 1000L;
            this.var_IOo__II1.II(new IO0o(-116).II(1));
            this.var_IOo__II1.II(new IO0o(-106).III(4387).III(n4));
        }
        this.l1_l();
        this.var_IO0_II1.I__O();
    }

    private static int IIl_(int n, int n2) {
        return n + (int)(Math.random() * (double)(n2 - n + 1));
    }

    private boolean Il0_() {
        if (this.IlIl() <= 0) {
            this.IIol(IOoI.I1O1("\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue4f3\ue6e2\ue600\ue72e\uf8f9\ue604", 58509));
            return true;
        }
        return false;
    }

    private boolean boolean_III(int n, IO0l iO0l) {
        IO0l iO0l2;
        IOol iOol = this.IOol_II();
        switch (iO0l.I1l) {
            case 962: 
            case 963: {
                if (this.Il0_()) {
                    return true;
                }
                int[] nArray = new int[]{1087, 1088, 1089, 1090, 1091};
                iO0l2 = new IO0l(nArray[this.var_java_util_Random_IIl0.nextInt(5)], 1);
                iO0l2.III(50, IOoI.IIl_(1, 16)).III(77, IOoI.IIl_(1, 17)).III(103, IOoI.IIl_(1, 15)).III(95, IOoI.IIl_(1, 5)).III(96, IOoI.IIl_(1, 5));
                int[] nArray2 = new int[]{94, 97, 108};
                iO0l2.III(nArray2[this.var_java_util_Random_IIl0.nextInt(3)], IOoI.IIl_(3, 5));
                if (iO0l.I1l == 963) {
                    iO0l2.III(93, 7);
                    break;
                }
                if (this.var_java_util_Random_IIl0.nextInt(100) >= 98) break;
                iO0l2.III(93, 5);
                break;
            }
            case 1005: 
            case 1006: {
                if (this.Il0_()) {
                    return true;
                }
                int[] nArray = new int[]{995, 996, 997, 998, 999, 1000, 1001, 1602, 1877, 1879};
                iO0l2 = new IO0l(nArray[this.var_java_util_Random_IIl0.nextInt(nArray.length)], 1);
                iO0l2.III(50, IOoI.IIl_(10, 15)).III(77, IOoI.IIl_(10, 15)).III(103, IOoI.IIl_(10, 15)).III(231, 0);
                int[] nArray3 = new int[]{14, 94, 97};
                iO0l2.III(nArray3[this.var_java_util_Random_IIl0.nextInt(3)], IOoI.IIl_(5, 12));
                break;
            }
            case 1609: 
            case 1822: 
            case 1823: {
                int n2;
                int[] nArray;
                boolean bl;
                if (this.Il0_()) {
                    return true;
                }
                boolean bl2 = bl = iO0l.I1l == 1823;
                if (iO0l.I1l == 1609) {
                    int[] nArray4 = new int[1];
                    nArray = nArray4;
                    nArray4[0] = 1804;
                } else if (bl) {
                    int[] nArray5 = new int[7];
                    nArray5[0] = 1586;
                    nArray5[1] = 1809;
                    nArray5[2] = 1810;
                    nArray5[3] = 1811;
                    nArray5[4] = 1812;
                    nArray5[5] = 1813;
                    nArray = nArray5;
                    nArray5[6] = 1814;
                } else {
                    int[] nArray6 = new int[7];
                    nArray6[0] = 1579;
                    nArray6[1] = 1580;
                    nArray6[2] = 1581;
                    nArray6[3] = 1582;
                    nArray6[4] = 1583;
                    nArray6[5] = 1584;
                    nArray = nArray6;
                    nArray6[6] = 1585;
                }
                int[] nArray7 = nArray;
                iO0l2 = new IO0l(nArray7[this.var_java_util_Random_IIl0.nextInt(nArray7.length)], 1);
                int n3 = n2 = iO0l.I1l == 1609 ? 20 : 10;
                int n4 = iO0l.I1l == 1609 ? 30 : (bl ? 20 : 17);
                iO0l2.III(50, iO0l.I1l == 1609 ? IOoI.IIl_(20, 28) : IOoI.IIl_(n2, n4)).III(77, IOoI.IIl_(n2, n4)).III(103, IOoI.IIl_(n2, n4));
                if (bl) {
                    iO0l2.III(210, 3);
                }
                iO0l2.III(30, 0);
                if (this.var_java_util_Random_IIl0.nextInt(100) < 5) break;
                iO0l2.III(93, 15);
                break;
            }
            case 727: 
            case 728: {
                int n5 = iO0l.I1l == 727 ? 2 : 10;
                this.II0(n, 1);
                if (this.var_java_util_Random_IIl0.nextInt(100) < 90) {
                    this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue504\ufb4e\ue584\ue5a0\ue58a\uf8be\ue654\ue61f\ue628\ue691\ue6bc\ue7aa\uf803\ue69a\ue738\ue754\uf9b1\ue714\ue7b4\ue7c7\ue7ba\ue784\uf6c1\ue84c\ue86e\ue819\ue98f\ue8c5\ue8ad\ue8c9\ue964\uf7d6\ue925\ue945\ue9f7\ue9ca\ue928\ue994\uea20\uea6b\uea56\uf4fa\uea12\ueabb\ueace\ueab1\uf41f\ueb6e\ueb18", 58509));
                    iOol.llIl = 0;
                    this.l1O0();
                    this.l1lO();
                } else {
                    long l = 0L;
                    for (int i = 0; i < n5; ++i) {
                        l += this.III1(5000000L);
                    }
                    if (l > 0L) {
                        this.var_IOo__II1.II(new IO0o(-3).II(2).IIII((int)Math.min(l, Integer.MAX_VALUE)));
                    }
                    this.var_IO0_II1.ll_0();
                    this.l1O0();
                    this.var_IO0_II1.I__O();
                }
                return true;
            }
            case 987: {
                this.IIol(IOoI.I1O1("\ue4cf\ufa0f\ue4a4\ue4ca\ue57f\ufbef\ue567\ue512\ue5f7\ue5c5\ue5ad\ue585\ue621\ue642\uf8f4\ue67e\ue616\ue6f4\ue64f\ue6b4\ue69e\ue738\ue755\uf99d\ue755\ue7e6\uf968\ue7a6\ue7d1\ue873\uf68a\ue83e", 58509));
                return true;
            }
            default: {
                return false;
            }
        }
        this.II0(n, 1);
        this.III0(iO0l2);
        this.l1_l();
        IOO.III iII = IOO.IOO$III_II(iO0l2.I1l);
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue567\ue540\ufbea\ue508\ue5a5\ue4b5\ue473\ufb01\ue662\ue600", 58509) + (iII == null ? IOoI.I1O1("\ue4fb\ufa01\ue4bf\ue4ca\ue579\ue540\ufbee\ue50b", 58509) : iII.II1o));
        this.var_IO0_II1.I__O();
        return true;
    }

    boolean Il0O() {
        return this.IOol_II().IO01 > System.currentTimeMillis();
    }

    private void I1I0(int n) {
        IOol iOol = this.IOol_II();
        long l = System.currentTimeMillis();
        if (iOol.IO01 <= l) {
            this.IIol(IOoI.I1O1("\ue4c0\ufa0b\ue4a6\ue4ca\ue418\ue5cb\ue567\ue50e\ufb3a\ue5d0\ue5e3\ue58a\uf8a0\ue64e\ue613\ue67e\ue616\ue6f4\ue64f\ue6b4\ue69e\ue738\ue743\ue73e\uf9b6\ue7b4\ue7d4\ue7bb\ue790\ue830\ue847\uf6ef\ue803", 58509));
            return;
        }
        iOol.IO01 += 604800000L;
        this.II0(n, 1);
        this.IIol(IOoI.I1O1("\ue4ca\ue4c5\ue4aa\ue4ca\ue561\ufb89\ue529\ue546\ue5e8\ufb03\ue5ae\ue5c2\ue675\ue648\ue6df\ue630\ue615\ue6bc\ue6d8\ue62e\ue697\ue77f", 58509));
        this.var_IO0_II1.I__O();
    }

    String II1() {
        long l = this.IOol_II().IO01 - System.currentTimeMillis();
        if (l <= 0L) {
            return IOoI.I1O1("\ue4bd\ue48c\ue4bb\ue482\ue5f3\ue55c", 58509);
        }
        long l2 = l / 60000L;
        if (l2 >= 1440L) {
            return l2 / 1440L + IOoI.I1O1("\ue4ad\ue4c2\ue4ac\ue40a\ue570\ue508", 58509) + l2 % 1440L / 60L + IOoI.I1O1("\ue4ad\ue4cb\ue4a2\ufa37", 58509);
        }
        if (l2 >= 60L) {
            return l2 / 60L + IOoI.I1O1("\ue4ad\ue4cb\ue4a2\ufa37\ue529", 58509) + l2 % 60L + IOoI.I1O1("\ue4ad\ue4dc\ue4a3\ue410\ue57d", 58509);
        }
        return Math.max(l2, 1L) + IOoI.I1O1("\ue4ad\ue4dc\ue4a3\ue410\ue57d", 58509);
    }

    private void III(III iII, Vector vector) {
        int n;
        Object object;
        int n2;
        int n3;
        IOol iOol = this.IOol_II();
        int n4 = iII.I1;
        int n5 = iII.I1I;
        if (this.var_java_util_Random_IIl0.nextInt(10000) < 20) {
            n3 = iOol.lOlI > 2 ? 2 : iOol.lOlI;
            n2 = this.II01(n3);
            int[] nArray = IIIl[n3][this.II0_(n2)];
            int n6 = nArray[this.var_java_util_Random_IIl0.nextInt(nArray.length)];
            Vector vector2 = IO_I.java_util_Vector_II(n6);
            if (IOO.IOO$III_II(n6) != null && vector2 != null) {
                II iI = this.II(n6, 1, n4 - 24, n5);
                for (int i = 0; i < vector2.size(); ++i) {
                    int[] nArray2 = (int[])vector2.elementAt(i);
                    iI.IIl.addElement(new int[]{nArray2[0], nArray2[1]});
                }
                iI.IIl.addElement(new int[]{n2, 1});
                object = IOoI.int_arr_IIIl(n2);
                for (n = 0; n < ((int[])object).length; ++n) {
                    iI.IIl.addElement(new int[]{object[n], 1});
                }
                iI.IIl.addElement(new int[]{30, 1});
                iI.IO1O = System.currentTimeMillis() + 120000L;
            }
        }
        n3 = 0;
        for (n2 = 0; n2 < I_1l.length; ++n2) {
            if (I_1l[n2] != this._IoI) continue;
            n3 = 1;
        }
        if (n3 != 0 && this.var_java_util_Random_IIl0.nextInt(10000) < 100 && IOO.var_IOO$III_arr_II != null) {
            Vector<IOO.III> vector3 = new Vector<IOO.III>();
            for (int i = 0; i < IOO.var_IOO$III_arr_II.length; ++i) {
                IOO.III iII2 = IOO.var_IOO$III_arr_II[i];
                if (iII2 == null || iII2.IoI_ > 4 || iII2.lOl_ < 1 || iII2.lOl_ > 3 || iII2.IoI_ < 4 && iII2.lOlI != iOol.lOlI || iII2.IoI_ == 4 && iII2.lOlI != 3) continue;
                vector3.addElement(iII2);
            }
            if (vector3.size() > 0) {
                IOO.III iII3 = (IOO.III)vector3.elementAt(this.var_java_util_Random_IIl0.nextInt(vector3.size()));
                Vector vector4 = IO_I.java_util_Vector_II(iII3.I1l);
                if (vector4 != null) {
                    int n7 = this.var_java_util_Random_IIl0.nextInt(100);
                    int n8 = n7 < 55 ? 0 : (n7 < 85 ? 1 : (n7 < 97 ? 2 : 3));
                    object = this.II(iII3.I1l, 1, n4 + 24, n5);
                    for (n = 0; n < vector4.size(); ++n) {
                        int[] nArray = (int[])vector4.elementAt(n);
                        if (nArray[0] == 107) continue;
                        object.IIl.addElement(new int[]{nArray[0], nArray[1]});
                    }
                    if (n8 > 0) {
                        object.IIl.addElement(new int[]{107, n8});
                    }
                    object.IO1O = System.currentTimeMillis() + 90000L;
                }
            }
        }
    }

    static int[] int_arr_IIIl(int n) {
        switch (n) {
            case 127: {
                return new int[]{140};
            }
            case 128: {
                return new int[]{139};
            }
            case 129: {
                return new int[]{141};
            }
            case 130: {
                return new int[]{142};
            }
            case 131: {
                return new int[]{143};
            }
            case 132: {
                return new int[]{144};
            }
            case 133: {
                return new int[]{136};
            }
            case 134: {
                return new int[]{137};
            }
            case 135: {
                return new int[]{138};
            }
            case 233: {
                return new int[]{234};
            }
            case 237: {
                return new int[]{238, 239, 240};
            }
            case 241: {
                return new int[]{242, 243, 244};
            }
            case 245: {
                return new int[]{246, 247, 248};
            }
        }
        return new int[0];
    }

    void I1Io(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        if (n < 0 || n > 4) {
            return;
        }
        if (this.IlIl() <= 0) {
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue579\ue540\ufbe4\ue50f\ue5a5\ue5c7\ue530\ue5c2\ue6ec\ue654\ue61f\ue630\ue615\uf839\ue6cf\ue6fa\ue6c8\ue738\ue7c3\ue776\ue701\ue7e6\uf962\ue7bc\ue796\ue830\ue85b\ue83c\ue802\ue8e2\ue8cc\ue8ea\ue881\ue9e8\ue949\ue92e\ue945\ue9f0\ue9d1\ue9a3\ue98f\uea67\uea3e", 58509));
            return;
        }
        int n3 = -1;
        for (n2 = 0; n2 < iOol.var_IO0l_arr_III.length; ++n2) {
            if (iOol.var_IO0l_arr_III[n2] == null || iOol.var_IO0l_arr_III[n2].I1l != 1655 || iOol.var_IO0l_arr_III[n2].lo0I <= 0) continue;
            n3 = n2;
            break;
        }
        if (n3 < 0) {
            return;
        }
        n2 = iOol.lOlI > 2 ? 2 : iOol.lOlI;
        int[] nArray = IIIl[n2][n];
        int n4 = this.II01(n2);
        int n5 = this.II(nArray, 0.65);
        IOO.III iII = IOO.IOO$III_II(n5);
        if (iII == null) {
            return;
        }
        IO0l iO0l = this.IIIl(n5, n4);
        this.II0(n3, 1);
        this.III0(iO0l);
        this.l1_l();
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue508\ue5ed\ufb09\ue5ad\ue5c2\ue710\ue790\uf8dc\ue63d\ue65d", 58509) + iII.II1o);
        this.var_IO0_II1.I__O();
    }

    private int II(int[] nArray, double d) {
        int n;
        double[] dArray = new double[nArray.length];
        double d2 = 0.0;
        for (int i = 0; i < nArray.length; ++i) {
            IOO.III iII = IOO.IOO$III_II(nArray[i]);
            n = iII == null ? 1 : Math.max(1, iII.lOl_);
            dArray[i] = Math.pow(d, n - 1);
            d2 += dArray[i];
        }
        double d3 = this.var_java_util_Random_IIl0.nextDouble() * d2;
        for (n = 0; n < nArray.length; ++n) {
            if (!((d3 -= dArray[n]) <= 0.0)) continue;
            return nArray[n];
        }
        return nArray[nArray.length - 1];
    }

    private void I1l(int n) {
        IOO.III iII;
        IOol iOol = this.IOol_II();
        if (this.IlIl() <= 0) {
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue579\ue540\ufbe4\ue50f\ue5a5\ue5c7\ue530\ue5c2\ue6ec\ue654\ue61f\ue630\ue615\uf839\ue6cf\ue6fa\ue6c8\ue738\ue7c3\ue776\ue701\ue7e6\uf962\ue7bc\ue796\ue830\ue85b\ue83c\ue802\ue8e2\ue8cc\ue8ea\ue881\ue9e8\ue949\ue92e\ue945\ue9f0\ue9d1\ue9a3\ue98f\uea67\uea3e", 58509));
            return;
        }
        int n2 = iOol.lOlI > 2 ? 2 : iOol.lOlI;
        int n3 = this.II01(n2);
        int n4 = this.II0_(n3);
        int n5 = -1;
        int[] nArray = IIIl[n2][n4];
        for (int i = 0; i < nArray.length; ++i) {
            IOO.III iII2 = IOO.IOO$III_II(nArray[i]);
            if (iII2 == null || iII2.lOl_ != 1) continue;
            n5 = nArray[i];
            break;
        }
        if (n5 < 0) {
            n5 = nArray[0];
        }
        if ((iII = IOO.IOO$III_II(n5)) == null) {
            return;
        }
        this.II0(n, 1);
        this.III0(this.IIIl(n5, n3));
        this.l1_l();
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue508\ue5ed\ufb09\ue5ad\ue5c2\ue710\ue790\uf8dc\ue63d\ue65d", 58509) + iII.II1o);
        this.var_IO0_II1.I__O();
    }

    private void I1lI(int n) {
        IOol iOol = this.IOol_II();
        long l = System.currentTimeMillis();
        iOol.IO0l = (iOol.IO0l > l ? iOol.IO0l : l) + 1800000L;
        this.II0(n, 1);
        this.var_IOo__II1.II(new IO0o(-106).III(13618).III((int)Math.min(86400L, (iOol.IO0l - l) / 1000L)));
        this.IIol(IOoI.I1O1("\ue59d\ue44f\ue4eb\ue48e\ue5f0\ue546\ue520\ue546\ue5c6\ufb6b\ue5e3\ue580\uf8d0\ue64e\ue61f\ue632\ue69c\ue6b0\ue69b\ue6ae\ue7fa\ue776\ue750\ue776\ue701\uf963\ue793\ue7be\uf936\ue830\ue85d\ue9ef\ue804\ue8ac\ue8dd\uf667\ue89d\ue928\ue957\ue92e\uf7cc\ue9e9", 58509));
        this.var_IO0_II1.I__O();
    }

    private void I1ll(int n) {
        IOol iOol = this.IOol_II();
        iOol.IO0_ = System.currentTimeMillis() + 1800000L;
        this.II0(n, 1);
        this.var_IOo__II1.II(new IO0o(-106).III(2758).III(1800));
        this.var_IO0_II1.I__O();
    }

    private void l1O() {
        IOol iOol = this.IOol_II();
        if (iOol.IO0O > 0L && System.currentTimeMillis() >= iOol.IO0O) {
            iOol.IO0O = 0L;
            if (iOol._11_ < 9) {
                ++iOol._11_;
            }
            this.IIol(IOoI.I1O1("\ue4ca\ue4c5\ufa10\ue483\ue529\ue540\ufbe6\ue508\ue5a5\ue5d7\ufb2a\ue581\ue621\ue64d\uf89e\ue630\ue615\ue6bc\ue6d8\uf83d\ue698\ue738\ue755\uf9f7\ue71b\ue7b4\ue6a2\ue731\ue7d1\ue901\ue99f\uf6ad\ue80e\ue8ac\ue8df\ue9c9\ue887\ue96f\ue907\ue92a\ue98f\ue9ea\ue983\ue9f3\ue9c1\uea62\uf4b2\uea5d", 58509));
            this.var_IO0_II1.ll_0();
            this.l1O0();
            this.var_IO0_II1.I__O();
        }
        if (iOol.IO01 > 0L && System.currentTimeMillis() >= iOol.IO01) {
            iOol.IO01 = 0L;
            this.IIol(IOoI.I1O1("\ue4c0\ufa0b\ue4a6\ue4ca\ue56a\ufbcf\ue526\ue546\ue5e7\ufb05\ue5ad\ue5c2\ue710\ue6c3\ue61f\ue636\uf8c2\ue6e8\ue69b\ue6b2\uf858\ue776\ue71b\ue776\ue718\ue7e1\ue7d2\ue7f2\ue7b6\ue879\ue84e\ue86e\ue805\uf62d\ue8c5\ue8ea\ue884\uf7af\ue94a\ue966\uf7ba\ue9a4\ue9f0\ue9a3\ue98f\uea74\uea7e\uea1e\ueb4c\uf4bf\ueabb\ueace\ueab0\uf447\ueb67\ueb16\ueb21\uf591\uebf0", 58509));
            this.var_IO0_II1.I__O();
        }
        if (iOol.IOOo > 0L && System.currentTimeMillis() >= iOol.IOOo) {
            iOol.IOOo = 0L;
            this.var_IOo__II1.II(new IO0o(-116).II(0));
            this.var_IO0_II1.I__O();
        }
        boolean bl = false;
        for (int i = 0; i < 15; ++i) {
            if (!iOol.IIlI[i] || iOol.IlIo(i)) continue;
            iOol.IIlI[i] = false;
            iOol.IIl_[i] = 0L;
            bl = true;
        }
        if (bl) {
            if (iOol.llIl > iOol.Illo()) {
                iOol.llIl = iOol.Illo();
            }
            if (iOol._loI > iOol.Il1()) {
                iOol._loI = iOol.Il1();
            }
            this.var_IO0_II1.ll_0();
            this.l1O0();
        }
    }

    void l1OI() {
        IOol iOol = this.IOol_II();
        long l = System.currentTimeMillis();
        for (int i = 0; i < 15; ++i) {
            if (iOol.IIl_[i] <= l) continue;
            iOol.IIlI[i] = true;
            this.var_IOo__II1.II(new IO0o(-106).III(IOol.I_1_[i]).III((int)((iOol.IIl_[i] - l) / 1000L)));
        }
        if (iOol.IOOo > l) {
            this.var_IOo__II1.II(new IO0o(-116).II(1));
            this.var_IOo__II1.II(new IO0o(-106).III(4387).III((int)((iOol.IOOo - l) / 1000L)));
        }
        if (iOol.IOOO > l) {
            this.var_IOo__II1.II(new IO0o(-106).III(15359).III((int)((iOol.IOOO - l) / 1000L)));
        }
        if (iOol.IO0l > l) {
            this.var_IOo__II1.II(new IO0o(-106).III(13618).III((int)Math.min(86400L, (iOol.IO0l - l) / 1000L)));
        }
        if (iOol.IO0_ > l) {
            this.var_IOo__II1.II(new IO0o(-106).III(2758).III((int)((iOol.IO0_ - l) / 1000L)));
        }
        if (iOol._10 == 4) {
            this.var_IOo__II1.II(new IO0o(-106).III(iOol.lOlI == 1 ? 3901 : 3790).III((int)Math.max(0L, (600000L - (l - iOol.IOo_)) / 1000L)));
        }
        if (iOol.IO0O > l) {
            this.var_IOo__II1.II(new IO0o(-106).III(3783).III((int)((iOol.IO0O - l) / 1000L)));
        }
    }

    private void II(int n, IO0l iO0l, IOO.III iII) {
        IOol iOol = this.IOol_II();
        if (iOol.IO_l < iII.I101) {
            this.IIol(IOoI.I1O1("\ue4de\ufa45\ue4a8\ue4ca\ue564\ufb89\ue529\ue50e\ue5a5\ue5cf\ue5ab\ue516\ue66f\ue647\ue61f\ue74f\uf89a\ue6bc\ue6c2\ue630\ue68c\ue738\ue754\uf9f1\ue700\ue7b5", 58509));
            return;
        }
        if (this.IIIo(iO0l)) {
            return;
        }
        if (iO0l.I1l == 1859) {
            this.I1lO(n);
            return;
        }
        if (iO0l.I1l == 193) {
            this.II0(n, 1);
            this.l1O1();
            return;
        }
        if (iO0l.I1l == 194) {
            this.l1O1();
            return;
        }
        if (iO0l.I1l == 380) {
            this.I1l_(n);
            return;
        }
        if (iO0l.I1l == 379) {
            this.I1ll(n);
            return;
        }
        if (iO0l.I1l >= 14 && iO0l.I1l <= 20) {
            this.var_IO0_II1.var_IOO__II.Il__(iO0l.I1l);
            return;
        }
        if (iO0l.I1l == 1635) {
            this.I1lI(n);
            return;
        }
        if (iO0l.I1l == 1655) {
            this.var_IO0_II1.var_IO00_II.ll0_();
            return;
        }
        if (iO0l.I1l == 1634) {
            this.I1l(n);
            return;
        }
        if (iO0l.I1l == 521) {
            this.IIIl(iO0l);
            return;
        }
        if (iO0l.I1l == 454 || iO0l.I1l == 921 || iO0l.I1l == 1816) {
            this.var_IO0_II1.var_IOo_II.Iloo(iO0l.I1l);
            return;
        }
        if (this.var_IO0_II1.var_IOo_II.II(n, iO0l)) {
            return;
        }
        if (iO0l.I1l == 1703 || iO0l.I1l == 1717) {
            this.I1I0(n);
            return;
        }
        if (iO0l.I1l >= 342 && iO0l.I1l <= 345) {
            this.void_III(n, iO0l);
            return;
        }
        if (this.boolean_III(n, iO0l)) {
            return;
        }
        if (this.var_IO0_II1.var_I0IO_II.IIII(n, iO0l)) {
            return;
        }
        if (iO0l.I1l == 211 || iO0l.I1l == 212) {
            this.IIO0(n, iO0l.I1l);
            return;
        }
        int n2 = IOoI.IIII(iII);
        if (n2 == 8 || n2 == 9 || n2 == 10) {
            this.I1I1(n);
            return;
        }
        if (n2 == 7 && IOOo.III(iO0l.I1l) != null) {
            this.I1I1(n);
            return;
        }
        if (n2 >= 0) {
            return;
        }
        switch (iII.IoI_) {
            case 33: {
                if (!this.var_IO0_II1.var_IOo1_II.IllI(iO0l.I1l)) break;
                this.II0(n, 1);
                break;
            }
            case 6: {
                this.I1l0(n);
                break;
            }
            case 7: {
                this.II(n, iII);
                break;
            }
            case 29: 
            case 31: {
                this.II(n, iO0l);
                break;
            }
            case 27: {
                if (iO0l.I1l == 74) {
                    iOol.llIl = iOol.Illo();
                    iOol._loI = iOol.Il1();
                    this.l1O0();
                    this.II0(n, 1);
                    break;
                }
                this.IIol(IOoI.I1O1("\ue4ce\ue4c4\ue57b\ue48b\ue529\ue55c\ue52f\ufba5\ue5a5\ue5d7\ufb2e\ue5c2\ue665\uf8c5\ue651\ue639\ue65d\ue6ea\uf816\ue6ae\ue6d9\ue768\ue75f\uf9ff\ue718\ue7b4\ue7dd\ue732\ue788", 58509));
                break;
            }
            default: {
                this.IIol(IOoI.I1O1("\ue4ce\ue4c4\ue57b\ue48b\ue529\ue55c\ue52f\ufba5\ue5a5\ue5d7\ufb2e\ue5c2\ue665\uf8c5\ue651\ue639\ue65d\ue6ea\uf816\ue6ae\ue6d9\ue768\ue75f\uf9ff\ue718\ue7b4\ue7dd\ue732\ue788", 58509));
            }
        }
    }

    boolean Il00() {
        return this.IlIl() > 0;
    }

    int IlII() {
        return this.IlIl();
    }

    void l1Ol() {
        this.l1O0();
    }

    private int IlIl() {
        int n = 0;
        IOol iOol = this.IOol_II();
        for (int i = 0; i < iOol.var_IO0l_arr_III.length; ++i) {
            if (!iOol.var_IO0l_arr_III[i].II1_()) continue;
            ++n;
        }
        return n;
    }

    private int[] III1(int n) {
        for (int i = 0; i < I0Io.II.length; ++i) {
            I0Io.II iI = I0Io.II[i];
            if (iI == null || iI.var_I0Io$IIIl_arr_II == null) continue;
            for (int j = 0; j < iI.var_I0Io$IIIl_arr_II.length; ++j) {
                I0Io.IIIl iIIl = iI.var_I0Io$IIIl_arr_II[j];
                if (iIIl.___1 != n) continue;
                return new int[]{iIIl.____, iIIl.___O};
            }
        }
        I0Io.II iI = I0Io.II(n);
        if (iI != null && iI.var_I0Io$IIII_arr_II != null && iI.var_I0Io$IIII_arr_II.length > 0) {
            return new int[]{iI.var_I0Io$IIII_arr_II[0].I1, iI.var_I0Io$IIII_arr_II[0].I1I};
        }
        return new int[]{100, 100};
    }

    private void l1O1() {
        IOol iOol = this.IOol_II();
        int[] nArray = new int[]{21 + iOol.lOlI, 47, 45, 0, 7, 14, 5, 20, 13, 24 + iOol.lOlI, 27, 19, 79, 84, 154, 52};
        Vector<Integer> vector = new Vector<Integer>();
        if (this._llO > 0 && (this._llO < 21 || this._llO > 23) && I0Io.II(this._llO) != null) {
            vector.addElement(new Integer(-this._llO));
        }
        for (int i = 0; i < nArray.length; ++i) {
            if (I0Io.II(nArray[i]) == null) continue;
            vector.addElement(new Integer(nArray[i]));
        }
        this.I_11 = new int[vector.size()];
        IO0o iO0o = new IO0o(-91).II(this.I_11.length);
        String[] stringArray = new String[]{IOoI.I1O1("\ue4d9\ue4de\ue42a\ue483\ue529\ue438\ufbe2\ue512", 58509), IOoI.I1O1("\ue4c3\ue4cd\ue4a6\ufa55\ue56a", 58509), IOoI.I1O1("\ue4d5\ue4cd\ue4b2\ue48e\ue568", 58509)};
        for (int i = 0; i < this.I_11.length; ++i) {
            int n = (Integer)vector.elementAt(i);
            boolean bl = n < 0;
            this.I_11[i] = bl ? -n : n;
            I0Io.II iI = I0Io.II(this.I_11[i]);
            String string = bl ? IOoI.I1O1("\ue4db\ufa6d\ue4eb\ue489\ue561\ufbff\ue567\ue505\ue4ec\ue59e\ue5e3", 58509) + iI.II1o : (this.I_11[i] >= 21 && this.I_11[i] <= 23 ? IOoI.I1O1("\ue4db\ufa6d\ue4eb\ue484\ue561\ue5c8", 58509) : iI.II1o);
            iO0o.II(string).II(iI.__1l >= 0 && iI.__1l < 3 ? stringArray[iI.__1l] : IOoI.I1O1("\ue4db\ue5c5\ue4eb\ue49e\ue57b\ufbcd", 58509));
        }
        this.IooI = true;
        this.var_IOo__II1.II(iO0o);
    }

    synchronized void I1l1(int n) {
        boolean bl;
        IOol iOol = this.IOol_II();
        if (n < 0 || n >= this.I_11.length) {
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50e\ufb46\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
            return;
        }
        int n2 = this.I_11[n];
        if (!this.var_IO0_II1.II01(n2)) {
            this.var_IOo__II1.II(new IO0o(6).II(iOol.Il11).IIII(iOol.lOoO).IIII(iOol._lO));
            return;
        }
        boolean bl2 = bl = n == 0 && this._llO > 0 && n2 == this._llO;
        if (bl) {
            this._llO = -1;
        } else if (n2 < 21 || n2 > 23 || n != 0 || this._llO <= 0) {
            this._llO = iOol.lOlo;
        }
        if (iOol.llIl <= 0) {
            iOol.llIl = 1;
            iOol._loI = 1;
            this.l1O0();
        }
        this.var_IO0_II1.IlOl(n2);
    }

    private void I1l_(int n) {
        IOol iOol = this.IOol_II();
        if (this.IlIl() <= 0) {
            this.IIol(IOoI.I1O1("\ue4c5\ue44c\ue4a5\ue482\ue529\ue55c\ue535\ue507\ue5eb\ue5c3\ue5e3\ue4f3\ue6e2\ue600\ue72e\uf8f9\ue604", 58509));
            return;
        }
        int[] nArray = new int[]{76, 188, 189, 190, 381, 382, 383, 384, 385};
        int n2 = this.var_java_util_Random_IIl0.nextInt(nArray.length);
        this.II0(n, 1);
        if (n2 <= 3) {
            int n3 = 5000 + this.var_java_util_Random_IIl0.nextInt(15001);
            iOol.Il11 += (long)n3;
            this.l1_();
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue567\ue540\ufbea\ue508\ue5a5\ue4b5\ue473\ufb01\ue662\ue600", 58509) + n3 + IOoI.I1O1("\ue4ad\ue4da\ue42b\ue484\ue56e", 58509));
        } else {
            this.III0(new IO0l(nArray[n2], 1).III(73, 0));
            this.l1_l();
            IOO.III iII = IOO.IOO$III_II(nArray[n2]);
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue567\ue540\ufbea\ue508\ue5a5\ue4b5\ue473\ufb01\ue662\ue600", 58509) + (iII == null ? IOoI.I1O1("\ue4fb\ufa01\ue4bf\ue4ca\ue579\ue540\ufbee\ue50b", 58509) : iII.II1o));
        }
        this.var_IO0_II1.I__O();
    }

    private void IIO0(int n, int n2) {
        IOol iOol = this.IOol_II();
        if (iOol._l0_ * 100 / iOol._l0O > 50) {
            this.IIol(IOoI.I1O1("\ue4d9\ue4c4\ufa08\ue4ca\ue565\ufbd9\ue524\ue546\ue5f3\ufb0f\ue5ad\ue5c2\ue662\ue6d2\ue651\ue67e\ue609\ue6ee\ue651\ue6b4\ue6d9\ue72d\ue707\ue773", 58509));
            return;
        }
        if (n2 == 211) {
            iOol._l0_ = iOol._l0O;
            this.IIol(IOoI.I1O1("\ue4d9\ue4c4\ufa08\ue4ca\ue565\ufbd9\ue524\ue546\ue5e6\ufb43\ue5a2\ue5c2\ue663\uf881\ue651\ue67e\ue76c\ue67f\ue69b\ue7cb\ue749\uf9fb\ue754\ue776\ue71d\uf947\ue7da\ue7f2\ue781\ue878\uf6ca\ue82d\ue84d\ue8bd\ue89b\ue8fa\ue8cc", 58509));
        } else {
            iOol._l0_ = Math.min(iOol._l0O, iOol._l0_ + iOol._l0O * 20 / 100);
            this.IIol(IOoI.I1O1("\ue4d9\ue4c4\ufa08\ue4ca\ue565\ufbd9\ue524\ue546\ue5e6\ufb43\ue5a2\ue5c2\ue663\uf881\ue651\ue67e\ue76c\ue67f\ue69b\ue7cb\ue749\uf9fb\ue754\ue776\ue71d\uf947\ue7da\ue7f2\ue781\ue878\uf6ca\ue82d\ue84d\ue8be\ue89b\ue8ef", 58509));
        }
        this.var_IOo__II1.II(new IO0o(-68).III(iOol._l0_));
        this.II0(n, 1);
    }

    private void I1lO(int n) {
        IOol iOol = this.IOol_II();
        if (this.IlIl() < 12) {
            this.IIol(IOoI.I1O1("\ue4ce\ufa0b\ue4a5\ue4ca\ue5e4\ue55c\ue567\ue508\ue5ed\ufb01\ue5b7\ue5c2\ue630\ue612\ue61f\ue6aa\ue65d\ue6e8\ue6c9\uf80b\ue697\ue77f\ue717\ue722\ue707\ue7fb\ue7dd\ue7b5\ue7d1\ue878\ue8cf\ue820\ue805\ue8ac\ue8df\ue8b8\ue888\ue966\ue940\ue967", 58509));
            return;
        }
        int n2 = iOol.lOlI;
        int n3 = n2 == 2 ? 3 : 2;
        int n4 = n2 == 0 ? 30 : 20;
        this.II0(n, 1);
        this.III0(new IO0l(n2, 1).III(47, n3).III(107, 3).III(30, 0));
        this.III0(new IO0l(n2 == 0 ? 6 : (n2 == 1 ? 7 : 8), 1).III(6, n4).III(107, 3).III(30, 0));
        this.III0(new IO0l(n2 == 0 ? 27 : (n2 == 1 ? 28 : 29), 1).III(7, 20).III(107, 3).III(30, 0));
        this.III0(new IO0l(n2 == 0 ? 21 : (n2 == 1 ? 22 : 23), 1).III(0, 7).III(107, 3).III(30, 0));
        this.III0(new IO0l(12, 1).III(14, 1).III(107, 3).III(30, 0));
        this.III0(new IO0l(457, 10).III(30, 0));
        int[][] nArrayArray = new int[][]{{441, 95, 5}, {442, 96, 5}, {443, 97, 5}, {444, 99, 3}, {445, 98, 3}, {446, 100, 5}, {447, 101, 5}};
        for (int i = 0; i < nArrayArray.length; ++i) {
            this.III0(new IO0l(nArrayArray[i][0], 10).III(nArrayArray[i][1], nArrayArray[i][2]).III(30, 0));
        }
        this.III0(new IO0l(454, 1));
        this.III0(new IO0l(380, 10).III(30, 0));
        this.III0(new IO0l(194, 1));
        this.III0(new IO0l(1577, 1).III(50, 7).III(5, 8).III(77, 2).III(103, 1).III(93, 7));
        this.l1_l();
        this.var_IO0_II1.I__O();
        this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue567\ue540\ufbea\ue508\ue5a5\ue4b5\ue473\ufb01\ue662\ue600\ue64e\ue62b\ue69d\ue6bc\ue6cf\ue638\ue697\ue738\ue743\ue73e\uf992\ue7b5", 58509));
    }

    synchronized void l1O_() {
        IOol iOol = this.IOol_II();
        for (int i = 0; i < iOol.var_IO0l_arr_III.length; ++i) {
            IOO.III iII = IOO.IOO$III_II(iOol.var_IO0l_arr_III[i].I1l);
            if (iII == null || iII.IoI_ != 6) continue;
            this.I1l0(i);
            return;
        }
    }

    private void I1l0(int n) {
        int n2;
        IOol iOol = this.IOol_II();
        IO0l iO0l = iOol.var_IO0l_arr_III[n];
        int n3 = 0;
        for (n2 = 0; n2 < iO0l.IIl.size(); ++n2) {
            int[] nArray = (int[])iO0l.IIl.elementAt(n2);
            if (nArray[0] == 2) {
                n3 = nArray[1] * 1000;
                break;
            }
            if (nArray[0] != 48) continue;
            n3 = nArray[1];
            break;
        }
        if (n3 <= 0) {
            n3 = 100;
        }
        iOol.llIl = Math.min(iOol.Illo(), iOol.llIl + n3);
        iOol._loI = Math.min(iOol.Il1(), iOol._loI + n3);
        this.l1O0();
        n2 = 1;
        try {
            n2 = Integer.parseInt(IOO.IOO$III_II((int)iO0l.I1l).II1o.substring(13).trim());
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.var_IO0_II1.var_IOo_II.IIOl(n3, n2);
        this.II0(n, 1);
    }

    void IIOo(int n, int n2) {
        this.II0(n, n2);
    }

    void l1OO() {
        IOol iOol = this.IOol_II();
        iOol.llIl = 0;
        this.l1O0();
        this.l1lO();
    }

    private void II0(int n, int n2) {
        IOol iOol = this.IOol_II();
        iOol.var_IO0l_arr_III[n].lo0I -= n2;
        if (iOol.var_IO0l_arr_III[n].lo0I <= 0) {
            iOol.var_IO0l_arr_III[n] = new IO0l();
        }
        this.l1_l();
        this.var_IO0_II1.I__O();
    }

    void l1O0() {
        IOol iOol = this.IOol_II();
        this.var_IOo__II1.II(new IO0o(-30).II(5).IIII(iOol.llIl));
        this.var_IOo__II1.II(new IO0o(-30).II(6).IIII(iOol._loI));
    }

    synchronized void l1Oo() {
        IOol iOol = this.IOol_II();
        iOol.llIl = iOol.Illo();
        iOol._loI = iOol.Il1();
        this.var_IOo__II1.II(new IO0o(-16));
        this.l1_();
        this.l10I();
        this.var_IO0_II1.III_(21 + iOol.lOlI, 80, 336);
    }

    synchronized void l10() {
        IOol iOol = this.IOol_II();
        this.var_IO0_II1.var_IO1o_II.II(13, 1L);
        iOol.llIl = iOol.Illo();
        iOol._loI = iOol.Il1();
        this.var_IOo__II1.II(new IO0o(-16));
        this.l1_();
        this.l10I();
    }

    private void l10I() {
        this.var_IO0_II1.var_IO_1_II.lIll();
        this.l10l();
    }

    private void l10l() {
        if (!this.var_IO0_II1.var_IO_1_II.Il1I() || !IO_1.II_1(this._IoI)) {
            return;
        }
        for (int i = 0; i < this.var_IOoI$III_arr_II.length; ++i) {
            III iII = this.var_IOoI$III_arr_II[i];
            if (iII.III != null || iII.IoOo) continue;
            int n = this.var_IO0_II1.var_IO_1_II.II1o(iII.l0o1);
            int n2 = this.var_IO0_II1.var_IO_1_II.II_(iII.l0o1);
            if (n == iII._l__ && n2 == iII._l_O) continue;
            int n3 = iII.IooO ? n * 10 : n;
            double d = iII.lOlO > 0 ? (double)iII.llIl / (double)iII.lOlO : 1.0;
            iII._l__ = n;
            iII.lOlO = n3;
            iII.llIl = Math.max(1, (int)Math.round((double)iII.lOlO * d));
            iII._l_O = n2;
            this.var_IOo__II1.II(new IO0o(-9).II(iII._l_1).IIII(iII.llIl).IIII(1).II(false).II(-1));
        }
    }

    synchronized void II(String string, String string2, boolean bl) {
        this.var_IO_I_II.IIO_(string2);
        if (!bl) {
            return;
        }
        if (string.length() > 0) {
            this.II00(IOoI.I1O1("\ue4de\ufa5d\ue4eb\ue481\ue560\ufbef\ue529\ue546", 58509) + IOO0.IIlO(string) + IOoI.I1O1("\ue4ad\ue5bd\ue428\ue4ca\ue562\ufb97\ue533\ue546\ue5f1\ue5cc\ue539\ue581\ue62f", 58509));
        }
        if (string2.length() > 0) {
            this.II00(IOoI.I1O1("\ue4de\ufa5d\ue4eb\ue481\ue560\ufbef\ue529\ue546", 58509) + IOO0.IIlO(string2) + IOoI.I1O1("\ue4ad\ue5bd\ue428\ue4ca\ue56b\ufb87\ue533\ue546\ue494\ufb03\ue5b6\ue5c3", 58509));
        }
    }

    private void IIoI(String string) {
        if (this.IOol_II().IOOo > System.currentTimeMillis()) {
            return;
        }
        this.IIol(string);
    }

    void IIol(String string) {
        this.var_IOo__II1.II(new IO0o(-25).II(string));
    }

    /*
     * Exception decompiling
     */
    private boolean IIlI(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
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

    synchronized void II1_(DataInputStream dataInputStream) throws IOException {
        String string = dataInputStream.readUTF();
        if (this.IIlI(string)) {
            return;
        }
        if (this.var_nrolite_GmHandler_III != null && string.startsWith(IOoI.I1O1("\ue4a2", 58509))) {
            this.var_nrolite_GmHandler_III.run(string.substring(1));
            return;
        }
        if (this.var_nrolite_GmHandler_II != null && (string.equalsIgnoreCase(IOoI.I1O1("\ue4ea\ue4c1", 58509)) || string.toLowerCase().startsWith(IOoI.I1O1("\ue4ea\ue4c1\ue4eb", 58509)))) {
            String string2 = string.equalsIgnoreCase(IOoI.I1O1("\ue4ea\ue4c1", 58509)) ? IOoI.I1O1("\ue4ea\ue4c1", 58509) : string.substring(3);
            this.var_nrolite_GmHandler_II.run(string2);
            return;
        }
        this.var_IOo__II1.II(new IO0o(44).IIII(this.IOol_II().I1l).II(string));
    }

    private I0Il.II I0Il$II_II() {
        IOol iOol = this.IOol_II();
        I0Il.III iII = I0Il.II(iOol._lOI);
        if (iII == null || iOol._lOl >= iII.II.length) {
            return null;
        }
        return iII.II[iOol._lOl];
    }

    String II1I() {
        I0Il.II iI = this.I0Il$II_II();
        return iI == null ? IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue50e\ue5ea\ue544\ue5ad\ue5c2\ue675\ue648\ue6df\ue630\ue615\ue6bc\ue6d3\uf865\ue68d\ue738\ue759\ue73e\ue71c\uf953\ue7de\ue7f2\ue787\uf6f5\ue80f\ue826\ue804\uf64b\ue8c5\ue8ea\ue88a\ue9fb", 58509) : I0Il.I10O(iI.II1o, this.IOol_II().lOlI);
    }

    private int II(I0Il.II iI, String string) {
        String string2;
        String string3 = I0I.IIIl(this.IOol_II()._lOI, this.IOol_II()._lOl);
        if (string3 != null) {
            char c = string3.charAt(0);
            if (c == 'T') {
                return 2;
            }
            if (c == 'M') {
                return 5;
            }
            if (c == 'X') {
                return 7;
            }
            if (c == 'B') {
                return 8;
            }
            if (c == 'P') {
                return 9;
            }
            if (c == 'I') {
                return 4;
            }
        }
        if (IOoI.IIIl(string2 = string.toLowerCase(), IOoI.I1O1("\ue59c\ufa0d\ue4bf\ue4ca", 58509))) {
            return 3;
        }
        if (IOoI.IIIl(string2, IOoI.I1O1("\ue4fe\ufa41\ue4eb\ue48e\ufbec\ue546\ue520\ue546\ue5f1\ue5cd\ufb02\ue58f\ue621\ue64e\ue73c\ue630\ue61a", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue4f9\ufa0d\ue4a4\ue4ca\ue561\ue547\ufbf0\ue505\ue5a5\ue5c3\ue5aa\ue583\ue621\ue64e\ue657\uf8f3\ue60d", 58509))) {
            return 6;
        }
        if (IOoI.IIIl(string2, IOoI.I1O1("\ue59c\ue44d\ue4a5\ue482", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue4f9\ue4c5\ue421\ue49f\ue529\ue54c\ue52e\ufba1\ue5f1", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue4e9\ue4c5\ufa0c\ue49e", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue4e5\ufa0d\ue4eb", 58509))) {
            return IOO.IOO$IIII_II(string) != null ? 1 : 0;
        }
        if (IOoI.IIIl(string2, IOoI.I1O1("\ue4f9\ue4c4\ue4be\ue4ca\ue57d\ue540\ufbea\ue516", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue4e3\ue4c4\ufa7c\ue49e", 58509))) {
            return IOO.IOO$III_II(string) != null ? 4 : 0;
        }
        if (IOoI.IIIl(string2, IOoI.I1O1("\ue59c\ue4c5\ue4eb", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue4f9\ufa77\ue4a2\ue4ca", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue59c\ufa13\ue4a5\ue4ca", 58509)) || IOoI.IIIl(string2, IOoI.I1O1("\ue4e1\ue446\ue4a5\ue4ca\ue418\ue498\ufb9a\ue508\ue5e2", 58509))) {
            return I0Il.II1(iI.lOlo, this.IOol_II().lOlI) > 0 || iI.lOlo == -4 ? 5 : 0;
        }
        if (I0Il.IIlo(iI.l0_1, this.IOol_II().lOlI) >= 0 && iI.__ll <= 1) {
            return 2;
        }
        return 0;
    }

    private static boolean IIIl(String string, String string2) {
        return string.startsWith(string2);
    }

    private boolean Il0o() {
        IOol iOol = this.IOol_II();
        Object[] objectArray = I0II.II(iOol._lOI, iOol._lOl);
        if (objectArray == null) {
            return false;
        }
        int n = (Integer)objectArray[0];
        String string = I0Il.I10O((String)objectArray[1], iOol.lOlI);
        if (n == -1000) {
            this.var_IOo__II1.II(new IO0o(38).III(5).II(string));
            return true;
        }
        int n2 = I0Il.IIlo(n, iOol.lOlI);
        IOO.IIIl iIIl = IOO.IOO$IIIl_II(n2);
        this.var_IOo__II1.II(new IO0o(38).III(n2).II(string).III(iIIl == null ? 1139 : iIIl.IO_l));
        return true;
    }

    private void II0I(int n, int n2) {
        IOol iOol = this.IOol_II();
        for (int i = 0; i < iOol.var_IO0l_arr_III.length && n2 > 0; ++i) {
            IO0l iO0l = iOol.var_IO0l_arr_III[i];
            if (iO0l.II1_() || iO0l.I1l != n) continue;
            int n3 = Math.min(n2, iO0l.lo0I);
            iO0l.lo0I -= n3;
            n2 -= n3;
            if (iO0l.lo0I > 0) continue;
            iOol.var_IO0l_arr_III[i] = new IO0l();
        }
        this.l1_l();
    }

    void l101() {
        IOol iOol = this.IOol_II();
        this.Il0o();
        if (iOol._lOI == 7 && iOol._lOl == 2) {
            this.III0(new IO0l(193, 75));
            this.l1_l();
        }
        if (iOol._lOI == 2 && iOol._lOl == 1) {
            this.II0I(73, 10);
        }
        if (iOol._lOI == 3 && iOol._lOl == 2) {
            this.II0I(78, 1);
        }
        if (iOol._lOI == 10 && iOol._lOl == 2) {
            this.III0(new IO0l(iOol.lOlI == 0 ? 94 : (iOol.lOlI == 1 ? 101 : 108), 1));
            this.l1_l();
        }
        I0Il.III iII = I0Il.II(iOol._lOI);
        ++iOol._lOl;
        iOol._lO1 = 0;
        if (iII == null || iOol._lOl >= iII.II.length) {
            this.l10_();
        } else {
            this.var_IOo__II1.II(new IO0o(41));
            this.IIol(IOoI.I1O1("\ue4c3\ue4c4\ue4a2\ufa2d\ue564\ue508\ue531\ufb83\ue5a5\ue5d0\ue5aa\ufb5d\ue671\ue600\ue64b\ue636\ue618\ue6f3\ue69b\ue6b9\uf81e\ue779\ue717\ue734\uf9d4\ue7fa\ue793\ue7be\ue711\ue830", 58509) + I0Il.I10O(iII.II[iOol._lOl].II1o, iOol.lOlI));
            this.l10O();
        }
        this.var_IO0_II1.ll_1();
        this.var_IO0_II1.I__O();
    }

    private void l10_() {
        int n;
        long l;
        IOol iOol = this.IOol_II();
        int n2 = iOol._lOI;
        long l2 = l = n2 < 6 ? (new long[]{500L, 1000L, 1200L, 3000L, 7000L, 20000L})[n2] : 0L;
        if (l > 0L && (l = this.III1(l)) > 0L) {
            this.var_IOo__II1.II(new IO0o(-3).II(2).IIII((int)l));
        }
        if (n2 > 0 && n2 < 25) {
            long l3 = 500L * (long)(n2 + 1);
            if ((l3 = this.III1(l3)) > 0L) {
                this.var_IOo__II1.II(new IO0o(-3).II(2).IIII((int)l3));
            }
            iOol.Il11 = iOol.Il11 + (n2 < 5 ? 100000L * (long)(n2 + 1) : 500000L);
            this.l1_();
        }
        if (I0Il.II(n = n2 == 3 ? iOol.lOlI + 4 : (n2 >= 4 && n2 <= 6 ? 7 : n2 + 1)) == null) {
            n = n2;
        }
        iOol._lOI = n;
        if (n == 3 && this._IoI >= 21 && this._IoI <= 23) {
            this.l1lo();
        }
        iOol._lOl = 0;
        iOol._lO1 = 0;
        this.var_IO0_II1.ll_I();
        I0Il.III iII = I0Il.II(n);
        if (iII != null && iII.II.length > 0) {
            this.IIol(IOoI.I1O1("\ue4c3\ue4c4\ue4a2\ufa2d\ue564\ue508\ue531\ufb83\ue5a5\ue5d0\ue5aa\ufb5d\ue671\ue600\ue64b\ue636\ue618\ue6f3\ue69b\ue6b9\uf81e\ue779\ue717\ue734\uf9d4\ue7fa\ue793\ue7be\ue711\ue830", 58509) + I0Il.I10O(iII.II[0].II1o, iOol.lOlI));
        }
        this.l10O();
        this.l100();
        this.var_IO0_II1.ll_1();
    }

    void l10O() {
        I0Il.II iI = this.I0Il$II_II();
        if (iI == null) {
            return;
        }
        IOol iOol = this.IOol_II();
        if (this.II(iI, I0Il.I10O(iI.II1o, iOol.lOlI)) == 6) {
            if (iI.II1o.toLowerCase().startsWith(IOoI.I1O1("\ue4f9\ufa0d\ue4a4\ue4ca\ue561\ue547\ufbf0\ue505\ue5a5\ue5c3\ue5aa\ue583\ue621\ue64e\ue657\uf8f3\ue60d", 58509)) && iOol._lOO == 0) {
                return;
            }
            this.l101();
        }
    }

    private void I1lo(int n) {
        IOol iOol = this.IOol_II();
        I0Il.II iI = this.I0Il$II_II();
        iOol._lO1 += n;
        if (iOol._lO1 >= iI.__ll) {
            this.l101();
        } else {
            this.var_IOo__II1.II(new IO0o(43).III(iOol._lO1));
        }
    }

    private void I11(int n) {
        I0Il.II iI = this.I0Il$II_II();
        if (iI == null) {
            return;
        }
        String string = I0Il.I10O(iI.II1o, this.IOol_II().lOlI);
        if (this.II(iI, string) != 1) {
            return;
        }
        IOO.IIII iIII = IOO.IOO$IIII_II(string);
        if (iIII != null && iIII.I1l == n) {
            this.I1lo(1);
        }
    }

    private void II0l(int n, int n2) {
        I0Il.II iI = this.I0Il$II_II();
        if (iI == null) {
            return;
        }
        String string = I0Il.I10O(iI.II1o, this.IOol_II().lOlI);
        if (this.II(iI, string) != 4) {
            return;
        }
        String string2 = I0I.IIIl(this.IOol_II()._lOI, this.IOol_II()._lOl);
        if (string2 != null && string2.startsWith(IOoI.I1O1("\ue4c4\ue496", 58509))) {
            if (Integer.parseInt(string2.substring(2)) == n) {
                this.I1lo(n2);
            }
            return;
        }
        IOO.III iII = IOO.IOO$III_II(string);
        if (iII != null && iII.I1l == n) {
            this.I1lo(n2);
        }
    }

    private void I11I(int n) {
        I0Il.II iI = this.I0Il$II_II();
        if (iI == null) {
            return;
        }
        IOol iOol = this.IOol_II();
        String string = I0Il.I10O(iI.II1o, iOol.lOlI);
        if (this.II(iI, string) != 5) {
            return;
        }
        String string2 = I0I.IIIl(iOol._lOI, iOol._lOl);
        int n2 = I0Il.II1(iI.lOlo, iOol.lOlI);
        if (string2 != null) {
            if (I0I.II(string2, n)) {
                this.l101();
            }
        } else if (n2 == n) {
            this.l101();
        } else if (iOol._lOI == 3 && iOol._lOl == 1 && n >= 42 && n <= 44) {
            this.l101();
        }
    }

    void l100() {
        for (int i = 0; i < 12; ++i) {
            I0Il.II iI = this.I0Il$II_II();
            if (iI == null) {
                return;
            }
            IOol iOol = this.IOol_II();
            String string = I0Il.I10O(iI.II1o, iOol.lOlI);
            if (this.II(iI, string) != 3) {
                return;
            }
            long l = IOoI.II(string);
            if (l <= 0L || iOol.IO_l < l) {
                return;
            }
            int n = iOol._lOI;
            int n2 = iOol._lOl;
            this.l101();
            if (iOol._lOI != n || iOol._lOl != n2) continue;
            return;
        }
    }

    void l10o() {
        I0Il.II iI = this.I0Il$II_II();
        if (iI == null) {
            return;
        }
        IOol iOol = this.IOol_II();
        if (iOol._lOI != 0 || iOol._lOl != 0) {
            return;
        }
        if (iOol.I1 >= 635 && I0I.II(I0I.IIIl(0, 0), this._IoI)) {
            this.l101();
        }
    }

    void l1o() {
        IOol iOol = this.IOol_II();
        if (iOol._lOI == 0 && iOol._lOl == 3) {
            this.l101();
        }
    }

    void l1oI() {
        IOol iOol = this.IOol_II();
        if (iOol._lOI == 0 && iOol._lOl == 4) {
            this.l101();
        }
    }

    static long II(String string) {
        int n;
        String string2 = string.toLowerCase();
        int n2 = string2.indexOf(IOoI.I1O1("\ue59c\ufa0d\ue4bf\ue4ca", 58509));
        if (n2 < 0) {
            return 0L;
        }
        long l = 0L;
        for (n = n2 += 4; n < string2.length() && (string2.charAt(n) >= '0' && string2.charAt(n) <= '9' || string2.charAt(n) == '.'); ++n) {
            if (string2.charAt(n) == '.') continue;
            l = l * 10L + (long)(string2.charAt(n) - 48);
        }
        while (n < string2.length() && string2.charAt(n) == ' ') {
            ++n;
        }
        String string3 = string2.substring(n);
        if (string3.startsWith(IOoI.I1O1("\ue4e6", 58509))) {
            l *= 1000L;
        } else if (string3.startsWith(IOoI.I1O1("\ue4f9\ue4de", 58509))) {
            l *= 1000000L;
        } else if (string3.startsWith(IOoI.I1O1("\ue4f9\ufa5b", 58509)) || string3.startsWith(IOoI.I1O1("\ue4f9\ue4d5", 58509))) {
            l *= 1000000000L;
        }
        return l;
    }

    private static String II(IOO.III1 iII1) {
        String string;
        String string2 = string = iII1.lIlO == null ? "" : iII1.lIlO;
        if (string.length() == 0) {
            return IOoI.I1O1("\ue4ce\ufa41\ue4aa\ue4ca\ue561\ue5c8\ue529\ue501", 58509);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == '_') {
                stringBuffer.append(' ');
                continue;
            }
            if (i == 0) {
                stringBuffer.append(Character.toUpperCase(c));
                continue;
            }
            stringBuffer.append(Character.toLowerCase(c));
        }
        return stringBuffer.toString();
    }

    synchronized void II1O(DataInputStream dataInputStream) throws IOException {
        Object object;
        short s = dataInputStream.readShort();
        IOol iOol = this.IOol_II();
        I0Il.II iI = this.I0Il$II_II();
        if (iI != null) {
            boolean bl;
            object = I0Il.I10O(iI.II1o, iOol.lOlI);
            String string = I0I.IIIl(iOol._lOI, iOol._lOl);
            boolean bl2 = string != null ? I0I.II(string, iOol.lOlI, s) : (bl = this.II(iI, (String)object) == 2 && I0Il.IIlo(iI.l0_1, iOol.lOlI) == s);
            if (bl) {
                if (I0II.II(iOol._lOI, iOol._lOl) == null) {
                    IOO.IIIl iIIl = IOO.IOO$IIIl_II(s);
                    this.var_IOo__II1.II(new IO0o(38).III(s).II(IOoI.I1O1("\ue4ca\ue4c5\ufa04\ue483\ue529\ue544\ufbe8\ue50b\ue5a9\ue584\ue5a0\ue58d\ue66f\ue600\ue72e\ue6bd\ue65d\ue6f0\ue65b\ue6b7\ue6d9\ue76a\uf992\ue722\ue755\ue7e0\uf962\ue7a6\ue7d0\ue830\ue867\ue8ad\ue814\ue8ac\ue8c8\uf61b\ue8c9\ue96f\uf788\ue928\ue902\ue9a4\ue9cb\ue863\ue98f\uea20\uea71\uf4d1\uea3c\uea5c\ueaf5\uead2\uea30\uead6", 58509)).III(iIIl == null ? 1139 : iIIl.IO_l));
                }
                this.l101();
                return;
            }
        }
        if (s == 4) {
            this.var_IO0_II1.var_I0I__II.l_I();
            return;
        }
        if (this.var_IO0_II1.var_IO00_II.II00(s)) {
            this._l_l = -1;
            return;
        }
        object = IOO.IOO$IIIl_II(s);
        int n = object == null ? 1139 : ((IOO.IIIl)object).IO_l;
        String string = object == null ? IOoI.I1O1("\ue4d5\ue4c5\ue4a5\ue4ca\ue56a\ue540\ue5a7\ue509\ue5a4", 58509) : IOoI.I1O1("\ue4d5\ue4c5\ue4a5\ue4ca\ue56a\ue540\ue5a7\ue509\ue5a9\ue584\ue5b7\ue583\ue621\ue64c\ue6df\ue67e", 58509) + ((IOO.IIIl)object).II1o + IOoI.I1O1("\ue4a3", 58509);
        this._l_l = s;
        this.var_java_util_Vector_II1 = new Vector();
        if (s == 3) {
            this.var_IOo__II1.II(new IO0o(32).III(s).II(IOoI.I1O1("\ue4df\ue51c\ue56a\ue484\ue56e\ue508\ue456\ufbb5\ue5a5\ue5c7\ufb24\ue583\ue621\ue642\uf89e\ue630", 58509)).II(1).II(IOoI.I1O1("\ue4c0\ufa73\ue4eb\ue498\ue4b9\ue489\ue529\ue501", 58509)).III(1139));
            return;
        }
        Vector<String> vector = new Vector<String>();
        Vector vector2 = IOO.IIII(s);
        for (int i = 0; i < vector2.size(); ++i) {
            IOO.III1 iII1 = (IOO.III1)vector2.elementAt(i);
            if (iII1.IoI_ == 1) {
                if (this.var_java_util_Vector_II1.contains(IOoI.I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509))) continue;
                this.var_java_util_Vector_II1.addElement(IOoI.I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509));
                vector.addElement(IOoI.I1O1("\ue4c5\ufa61\ue4a8\ue4ca\ue562\ufbd1\ue567\ue508\ue486\ue5ca\ue5a4", 58509));
                continue;
            }
            boolean bl = false;
            for (int j = 0; j < iII1.II.length; ++j) {
                if (iII1.II[j].II.length <= 0) continue;
                bl = true;
            }
            if (!bl) continue;
            this.var_java_util_Vector_II1.addElement(iII1);
            vector.addElement(vector2.size() > 1 ? IOoI.II(iII1) : IOoI.I1O1("\ue4ce\ufa41\ue4aa\ue4ca\ue561\ue5c8\ue529\ue501", 58509));
        }
        if (s == 13 && !this.var_java_util_Vector_II1.contains(IOoI.I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509))) {
            this.var_java_util_Vector_II1.addElement(IOoI.I1O1("\ue4de\ue4e7\ue482\ue4a6\ue545", 58509));
            vector.addElement(IOoI.I1O1("\ue4c5\ufa61\ue4a8\ue4ca\ue562\ufbd1\ue567\ue508\ue486\ue5ca\ue5a4", 58509));
        }
        if (this.var_java_util_Vector_II1.size() == 0) {
            this.var_IOo__II1.II(new IO0o(32).III(s).II(string + IOoI.I1O1("\ue487\ue4ef\ue4a3\ue410\ue56a\ue508\ue525\ufbc7\ue5eb\ue584\ue5a0\ue58a\ue7a0\ue649\ue61f\ue639\ue61c\ue6f1\ue6de\ue6fa\ue68f\ue76d\ue75e\ue776\ue703\uf92f\ue792", 58509)).II(1).II(IOoI.I1O1("\ue59d\ue45f\ue4a5\ue48d", 58509)).III(n));
            return;
        }
        IO0o iO0o = new IO0o(32).III(s).II(string + IOoI.I1O1("\ue487\ue4ee\ufa6a\ue484\ue529\ue54b\ufbe0\ue508\ue5a5\ue5c3\ue52f\ue5dd", 58509)).II(vector.size() + 1);
        for (int i = 0; i < vector.size(); ++i) {
            iO0o.II((String)vector.elementAt(i));
        }
        iO0o.II(IOoI.I1O1("\ue59d\ue45f\ue4a5\ue48d", 58509)).III(n);
        this.var_IOo__II1.II(iO0o);
    }

    synchronized void II10(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        byte by = dataInputStream.readByte();
        if (s == 3 && by == 0) {
            this.l1_0();
            return;
        }
        if (s == 4) {
            if (by == 0) {
                this.var_IO0_II1.var_I0I__II.l_II();
            }
            return;
        }
        if (this.var_IO0_II1.var_IO00_II.IIl_(s, by)) {
            return;
        }
        if (s != this._l_l || by < 0 || by >= this.var_java_util_Vector_II1.size()) {
            return;
        }
        Object e = this.var_java_util_Vector_II1.elementAt(by);
        if (e instanceof IOO.III1) {
            this.var_IO0_II1.var_IOoO_II.II((IOO.III1)e);
        } else {
            this.var_IO0_II1.var_IOoO_II.l1o_();
        }
    }

    synchronized void II1o(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        byte by2 = dataInputStream.readByte();
        if (by == 4) {
            this.var_IO0_II1.var_I0I__II.I11O(by2);
        }
    }

    synchronized void II_(DataInputStream dataInputStream) throws IOException {
        long l;
        int n;
        IO0l[] iO0lArray;
        byte by = dataInputStream.readByte();
        byte by2 = dataInputStream.readByte();
        short s = dataInputStream.readShort();
        IOol iOol = this.IOol_II();
        IO0l[] iO0lArray2 = iO0lArray = by2 == 0 ? iOol.II : iOol.var_IO0l_arr_III;
        if (s < 0 || s >= iO0lArray.length || iO0lArray[s].II1_()) {
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50e\ufb46\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
            return;
        }
        IO0l iO0l = iO0lArray[s];
        IOO.III iII = IOO.IOO$III_II(iO0l.I1l);
        if (iII == null) {
            return;
        }
        if (iO0l.I1l == 570) {
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue5b7\ue58a\uf8c2\ue600\ue65d\ue6bf\ue613\ue6bc\ue6cd\uf877\ue68d\ue738\ue747\ue73e\uf9dc\ue7f9\ue793\ue7bc\ue711\ue869", 58509));
            return;
        }
        for (n = 0; n < iO0l.IIl.size(); ++n) {
            if (((int[])iO0l.IIl.elementAt(n))[0] != 93) continue;
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue5b7\ue58a\uf8c2\ue600\ue65d\ue6bf\ue613\ue6bc\ue6cd\uf877\ue68d\ue738\ue747\ue73e\uf9dc\ue7f9\ue793\ue7b1\ue702\ue830\ue847\uf6ef\ue803\ue8ac\ue8d8\uf627\ue8c9\ue96c\uf7c2\ue928\ue902", 58509));
            return;
        }
        n = iO0l.I1l == 457 ? 1 : iO0l.lo0I;
        long l2 = l = iO0l.I1l == 457 ? (long)iII.lOo_ : (long)(iII.lOo_ / 4);
        if (l <= 0L) {
            l = 1L;
        }
        l *= (long)n;
        if (by == 0) {
            this.IooI = true;
            this.var_IOo__II1.II(new IO0o(7).II(by2).III(s).II(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue56a\ue5db\ue567\ue50b\ue5f0\ufb75\ue5ad\ue5c2\ue663\ue6c1\ue651\ue654\ue605", 58509) + n + IOoI.I1O1("\ue4ad", 58509) + iII.II1o + IOoI.I1O1("\ue487\ue4da\ufa10\ue483\ue529\ue54f\ue52e\ue587\ue5a5\ue5c8\ue523\ue5c2", 58509) + l + IOoI.I1O1("\ue4ad\ue4da\ue42b\ue484\ue56e\ue517", 58509)));
            return;
        }
        if (iOol.Il11 + l > iOol.IOO_) {
            this.IIol(IOoI.I1O1("\ue4db\ue44c\ue4a5\ue48d\ue529\ue55b\ue526\ue513\ue5a5\ue5cf\ue5ab\ue58b\ue621\ue642\ue6de\ue630\ue65d\ue6ea\ue70b\uf839\ue68d\ue738\ue746\ue723\ue794\ue7b4\ue7d4\ue7bb\uf92a\ue879\ue80f\ue826\uf6cc\ue8e2", 58509));
            return;
        }
        iOol.Il11 += l;
        if (iOol.lOlo == 0 || iOol.lOlo == 7 || iOol.lOlo == 14 || iOol.lOlo == 21 || iOol.lOlo == 22 || iOol.lOlo == 23) {
            this.var_IO0_II1.var_IO1o_II.II(10, iO0l.I1l == 457 ? 1L : (long)iO0l.lo0I);
        }
        if (iO0l.I1l == 457 && iO0l.lo0I > 1) {
            --iO0l.lo0I;
        } else {
            iO0lArray[s] = new IO0l();
        }
        if (by2 == 0) {
            this.l1_1();
            this.var_IO0_II1.ll__();
            this.var_IO0_II1.ll_1();
            this.var_IO0_II1.ll_0();
        } else {
            this.l1_l();
        }
        this.l1_();
        this.IIol(IOoI.I1O1("\ue59d\ue44f\ue4eb\ue488\ue5e8\ue546\ue567", 58509) + iII.II1o + IOoI.I1O1("\ue4ad\ue4d8\ue4a3\ue49f\ue529\ue439\ue4f7\ufb85\ue5e6\ue584", 58509) + l + IOoI.I1O1("\ue4ad\ue4da\ue42b\ue484\ue56e", 58509));
        this.var_IO0_II1.I__O();
    }

    synchronized void IIlO(int n, int n2) {
        int n3;
        IOol iOol = this.IOol_II();
        if (n2 <= 0 || n2 > 1000) {
            return;
        }
        if (n == 0) {
            n3 = n2 * 20;
            long l = (long)n2 * (2L * (long)(iOol._l00 + 1000) + (long)n3 - 20L) / 2L;
            if (iOol._l00 + n3 > iOol.IlI_()) {
                this.IIol(IOoI.I1O1("\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b\uf9de\ue735\ue755\ue7f9\uf912\ue7bc\ue799", 58509));
                return;
            }
            if (!this.IIIO(l)) {
                return;
            }
            iOol._l00 += n3;
        } else if (n == 1) {
            n3 = n2 * 20;
            long l = (long)n2 * (2L * (long)(iOol._l0o + 1000) + (long)n3 - 20L) / 2L;
            if (iOol._l0o + n3 > iOol.IlI_()) {
                this.IIol(IOoI.I1O1("\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b\uf9de\ue735\ue755\ue7f9\uf912\ue7bc\ue799", 58509));
                return;
            }
            if (!this.IIIO(l)) {
                return;
            }
            iOol._l0o += n3;
        } else if (n == 2) {
            long l = (long)n2 * (2L * (long)iOol._lo + (long)n2 - 1L) / 2L * 100L;
            if (iOol._lo + n2 > iOol.IlIO()) {
                this.IIol(IOoI.I1O1("\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b\uf9de\ue735\ue755\ue7f9\uf912\ue7bc\ue799", 58509));
                return;
            }
            if (!this.IIIO(l)) {
                return;
            }
            iOol._lo += n2;
        } else if (n == 3) {
            long l = 2L * (long)(iOol._lol + 5) / 2L * 100000L;
            if (iOol._lol + n2 > iOol.IlI0()) {
                this.IIol(IOoI.I1O1("\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b\uf9de\ue735\ue755\ue7f9\uf912\ue7bc\ue799", 58509));
                return;
            }
            if (!this.IIIO(l)) {
                return;
            }
            iOol._lol += n2;
        } else if (n == 4) {
            long l = 50000000L;
            for (n3 = 0; n3 < iOol._lo1; ++n3) {
                l *= 5L;
            }
            if (iOol._lo1 + n2 > iOol.IlIo()) {
                this.IIol(IOoI.I1O1("\ue4db\ue4d9\ue4a2\ue4ca\ue565\ue5da\ue529\ue501\ue5a5\ue5c9\ufb1c\ue5c2\ue666\ue649\uf8e4\ue637\ue65d\ue6f4\uf81a\ue6b4\ue6d9\ue76b\uf9de\ue735\ue755\ue7f9\uf912\ue7bc\ue799", 58509));
                return;
            }
            if (!this.IIIO(l)) {
                return;
            }
            iOol._lo1 += n2;
        } else {
            return;
        }
        if (iOol.llIl > iOol.Illo()) {
            iOol.llIl = iOol.Illo();
        }
        if (iOol._loI > iOol.Il1()) {
            iOol._loI = iOol.Il1();
        }
        this.var_IO0_II1.ll_0();
        this.l1O0();
        I0Il.II iI = this.I0Il$II_II();
        if (iI != null && I0Il.I10O(iI.II1o, iOol.lOlI).toLowerCase().startsWith(IOoI.I1O1("\ue4fe\ufa41\ue4eb\ue48e\ufbec\ue546\ue520\ue546\ue5f1\ue5cd\ufb02\ue58f\ue621\ue64e\ue73c\ue630\ue61a", 58509))) {
            this.l101();
        }
        this.var_IO0_II1.I__O();
    }

    private boolean IIIO(long l) {
        IOol iOol = this.IOol_II();
        if (iOol.IO_1 < l) {
            this.var_IOo__II1.II(new IO0o(-26).II(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue562\ue540\ue5b3\ue508\ue5e2\ue584\ue4d2\ufb05\ue621\ue654\ue656\uf89f\ue610\ue6bc\ue6d5\ue7d9\ue697\ue77f", 58509)));
            return false;
        }
        iOol.IO_1 -= l;
        return true;
    }

    boolean II11(int n, int n2) {
        IOol iOol = this.IOol_II();
        IOO.IIIO iIIO = IOO.IOO$IIIO_II(n, n2);
        if (iIIO == null) {
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50e\ufb46\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
            return false;
        }
        int n3 = 0;
        int n4 = -1;
        for (int i = 0; i < iOol.I__l.length; ++i) {
            IOO.IIIO iIIO2 = IOO.IOO$IIIO_II(iOol.I__l[i]);
            if (iIIO2 == null || iIIO2.lO0I != n) continue;
            n3 = iIIO2.l1__;
            n4 = i;
            break;
        }
        if (n3 >= n2) {
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue418\ue5cb\ue567\ue50e\ufb48\ue5c7\ue5e3\ue589\uf8f8\ue600\ue651\ue75d\ue613\ue6fb\ue69b\ue6b4\ue619\ue761\ue717\ue724\uf9a6\ue7fd", 58509));
            return false;
        }
        if (n2 - n3 != 1) {
            this.IIol(IOoI.I1O1("\ue4cf\ufa0d\ue4a5\ue4ca\ue56a\ue540\ue4f7\ue507\ue5a5\ue5d0\ue5ab\ufb21\ue621\ue648\uf8f2\ue63d\ue65d\ue6f7\uf842\ue6fa\ue697\ue61b\ue759\ue731\ue755\ue7fa\ue753\ue7ab", 58509));
            return false;
        }
        if (n4 < 0) {
            int[] nArray = new int[iOol.I__l.length + 1];
            System.arraycopy(iOol.I__l, 0, nArray, 0, iOol.I__l.length);
            nArray[iOol.I__l.length] = iIIO.I1l;
            iOol.I__l = nArray;
            this.var_IOo__II1.II(new IO0o(-30).II(23).III(iIIO.I1l));
        } else {
            iOol.I__l[n4] = iIIO.I1l;
            this.var_IOo__II1.II(new IO0o(-30).II(62).III(iIIO.I1l));
        }
        this.var_IO0_II1.I__O();
        return true;
    }

    private void II(int n, IOO.III iII) {
        IOol iOol = this.IOol_II();
        int n2 = IOO.II(iII);
        int n3 = IOO.III(iII);
        if (n2 < 0 || n3 <= 0) {
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50e\ufb46\ue584\ue5ab\ufb2f\ue662\ue600\ue654\uf8a7\ue65d\ue6f2\ue7b8\ue6b4\ue69e\ue738\ue759\ue7b6\ue70c", 58509));
            return;
        }
        IOO.IIIO iIIO = IOO.IOO$IIIO_II(n2, 1);
        if (iIIO == null || iIIO.l0oo != iOol.lOlI && n2 != 19) {
            this.IIol(IOoI.I1O1("\ue4c6\ue4c4\ue43f\ue484\ue56e\ue508\ue533\ue50e\ufb46\ue584\ue5b7\ue58a\uf8f0\ue643\ue61f\ue636\ue614\uf85b\ue6d5", 58509));
            return;
        }
        if (this.II11(n2, n3)) {
            this.II0(n, 1);
        }
    }

    private static /* synthetic */ String I1O1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    static final class III {
        int _l_1;
        int l0o1;
        int lOl_;
        int lOlO;
        int llIl;
        int I1;
        int I1I;
        long IO10;
        boolean IoOo;
        boolean Ioo_;
        boolean IooO;
        IO_I.III III;
        int _l__;
        int _l_O;
        long I110;
        long IO1o;
        long I1l0;
        long I11o;
        long IO_;
        long IO_I;
        int lO_1;
        IOO.IIII II;

        III() {
        }
    }

    static final class II {
        int I1l;
        int l0o1;
        int lo0I;
        int I1;
        int I1I;
        Vector IIl = new Vector();
        long IO1O;

        II() {
        }
    }

    static final class IIII {
        int I1l;
        int l0o1;
        int lOlo;
        int lO1;
        int I1;
        int I1I;
        long IO1O;

        IIII() {
        }
    }
}

