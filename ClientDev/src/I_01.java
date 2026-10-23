package main;

/*
 * Decompiled with CFR 0.152.
 */
public final class I_01
extends IO1_
implements I1_1 {
    private int II0I = 0;
    private I_lO IIO_ = new I_lO("");
    private I1Il IIOO;
    private int I_0;
    private int IIO;
    private int IIOI;
    private int IIOl;
    private int IIlI;
    private I1Il IIl_;
    private I1Il IIII;

    @Override
    public void I0l_() {
        IO.II();
        super.I0l_();
        this.IIl_ = new I1Il(I_01.Il0o("\u17a5\u185b\u06f7\u1804\u184f\u18c0\u18ec\u1881", 6131), this, 98, null);
        this.IIl_.I1 = 0;
        this.IIl_.I1I = 0;
        this.IIII = new I1Il(I_01.Il0o("\u17b4\u185e\u187e\u1812\u182e\u18c2", 6131), this, 97, null);
        this.IIII.I1 = 50;
        this.IIII.I1I = 0;
        this.IIO_ = new I_lO("");
        this.IIO_.addElement(this.IIl_);
        this.IIO_.addElement(this.IIII);
        this.IIl1();
    }

    public I_01() {
        byte by = (byte)(System.currentTimeMillis() % 9L);
        IOlO.l1o1 = by;
        if (by == 5 || IOlO.l1o1 == 6) {
            IOlO.l1o1 = 4;
        }
        I1_I.IIlI(-1, -1);
        I1_I.Io1 = 100;
        I1_I.Io1I = 200;
    }

    private void IIl1() {
        this.II0I = I_0l.l1_I;
        this.IIOI = 5;
        this.I_0 = 76;
        this.IIO = IO1_.llo_;
        this.IIOl = 2;
        if (II.var_int_IIl > 3 * (this.I_0 + this.IIOI)) {
            this.IIOl = 3;
        }
        if (this.IIO_.size() < 3) {
            this.IIOl = 2;
        }
        this.IIlI = this.IIO_.size() / this.IIOl + (this.IIO_.size() % this.IIOl == 0 ? 0 : 1);
        for (int i = 0; i < this.IIO_.size(); ++i) {
            I1Il i1Il = (I1Il)this.IIO_.elementAt(i);
            if (i1Il == null) continue;
            int n = II.var_int_IIll - this.IIOl * (this.I_0 + this.IIOI) / 2 + i % this.IIOl * (this.I_0 + this.IIOI);
            int n2 = II.var_int_IIl1 - this.IIlI * (this.IIO + this.IIOI) / 2 + i / this.IIOl * (this.IIO + this.IIOI);
            i1Il.I1 = n;
            i1Il.I1I = n2;
        }
    }

    @Override
    public void void_IIlO() {
        if (++I1_I.Io1 > II.var_int_IIl * 3 + 100) {
            I1_I.Io1 = 100;
        }
        for (int i = 0; i < this.IIO_.size(); ++i) {
            I1Il i1Il = (I1Il)this.IIO_.elementAt(i);
            if (!II.var_boolean_IIIl) {
                if (i == this.II0I) {
                    i1Il.I__I = II.var_int_IIIO % 10 < 4;
                    this.III0 = this.IIOO = new I1Il(IO11.I_lO, this, i1Il.IIO, null);
                    continue;
                }
                i1Il.I__I = false;
                continue;
            }
            if (i1Il == null || !i1Il.II0o()) continue;
            i1Il.I0lO();
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        II.III1(iO1l);
        for (int i = 0; i < this.IIO_.size(); ++i) {
            if (this.IIO_.elementAt(i) == null) continue;
            ((I1Il)this.IIO_.elementAt(i)).II(iO1l);
        }
        super.III_(iO1l);
    }

    @Override
    public void I_Il() {
        super.I_Il();
        int n = this.II0I % this.IIOl;
        int n2 = this.II0I / this.IIOl;
        if (II.var_boolean_arr_II[4]) {
            if (n > 0) {
                --this.II0I;
            }
            II.var_boolean_arr_II[4] = false;
        } else if (II.var_boolean_arr_II[6]) {
            if (n < this.IIOl - 1) {
                ++this.II0I;
            }
            II.var_boolean_arr_II[6] = false;
        } else if (II.var_boolean_arr_II[2]) {
            if (n2 > 0) {
                this.II0I -= this.IIOl;
            }
            II.var_boolean_arr_II[2] = false;
        } else if (II.var_boolean_arr_II[8]) {
            System.out.println(I_01.Il0o("\u17de\u183f\u181c\u187d\u1842\u18a3\u1880\u18e1\u18c6\u1927\u1904\u193e\u1908\u19bc\u1985", 6131) + this.II0I);
            if (n2 < this.IIlI - 1) {
                this.II0I += this.IIOl;
            }
            II.var_boolean_arr_II[8] = false;
        }
        if (this.II0I < 0) {
            this.II0I = 0;
        }
        if (this.II0I >= this.IIO_.size()) {
            this.II0I = this.IIO_.size() - 1;
        }
        if (II.var_boolean_arr_II[5]) {
            ((I1Il)this.IIO_.elementAt(n)).I0lO();
            II.var_boolean_arr_II[5] = false;
        }
        II.IIIl();
    }

    @Override
    public void II(int n, Object object) {
        I_Ol.II__(I_01.Il0o("\u1783\u1877\u1843\u1836\u1800\u18fc\u18c0\u18ec\u189f\u1978\u1946\u1926\u1900\u19a6\u19f6\u19a1\u1991\u1a74\u1a44\u1a32\u1a0c\u1a1d\u1aef\u1a86", 6131) + n);
        switch (n) {
            case 97: {
                this.IIO_.removeAllElements();
                for (n = 0; n < I_0l.II1I.length; ++n) {
                    if (I_0l.IIlI[n] == 0) continue;
                    this.IIO_.addElement(new I1Il(I_0l.II1I[n], this, n + 100, null));
                }
                this.IIl1();
                return;
            }
            case 98: {
                this.IIO_.removeAllElements();
                for (n = 0; n < I_0l.II1I.length; ++n) {
                    if (I_0l.IIlI[n] != 0) continue;
                    this.IIO_.addElement(new I1Il(I_0l.II1I[n], this, n + 100, null));
                }
                this.IIl1();
                return;
            }
            case 99: {
                I_0O.II().void_III();
                I_0l.l1_I = this.II0I;
                II.var_I_0l_II.Io_();
                II.var_I_0l_II.I0l_();
                return;
            }
        }
        I_0O.II().void_III();
        I_0l.l1_I = n - 100;
        II.var_I_0l_II.Io_();
        II.var_I_0l_II.I0l_();
    }

    private static /* synthetic */ String Il0o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

