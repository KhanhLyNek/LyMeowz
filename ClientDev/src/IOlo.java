package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class IOlo
extends IO1_
implements I1_1 {
    private static IOlo var_IOlo_II;
    private static Image var_javax_microedition_lcdui_Image_IIO1;
    private static Image IIO_;
    public byte var_byte_IIO1;
    private int var_int_IIO1 = 5;
    private int[] IIo = new int[this.var_int_II];
    private int[] IIoI = new int[this.var_int_II];
    private int[] Il_o;
    private int[] IIOO;
    private int II0;
    private int var_int_II = 20;
    public short IIOI;
    public short IIII;
    public long I1;
    public long IlO;
    private boolean I__l;
    private boolean I00;
    private int IIIl;

    public IOlo() {
        int n;
        for (n = 0; n < this.var_int_II; ++n) {
            this.IIo[n] = I_Ol.III_(0, II.var_int_IIl);
            this.IIoI[n] = n * (II.var_int_IIlI / this.var_int_II);
        }
        this.Il_o = new int[this.var_int_II];
        this.IIOO = new int[this.var_int_II];
        for (n = 0; n < this.var_int_II; ++n) {
            this.Il_o[n] = I_Ol.III_(0, II.var_int_IIl);
            this.IIOO[n] = n * (II.var_int_IIlI / this.var_int_II);
        }
    }

    public static IOlo II() {
        if (var_IOlo_II == null) {
            var_IOlo_II = new IOlo();
        }
        return var_IOlo_II;
    }

    @Override
    public void I0l_() {
        this.I__l = false;
        this.I00 = false;
        this.III0 = Ilol.Ilol_II().II10() > 0 && this.var_byte_IIO1 == 0 ? new I1Il(IO11.Ioo_, this, 1, null) : null;
        this.IIIl = 0;
        super.I0l_();
    }

    @Override
    public void III_(IO1l iO1l) {
        int n;
        iO1l.Illl(this.var_byte_IIO1 == 0 ? 0 : 3056895);
        iO1l.III_(0, 0, II.var_int_IIl, II.var_int_IIlI);
        for (n = 0; n < this.var_int_II; ++n) {
            iO1l.Illl(this.var_byte_IIO1 == 0 ? 0xE1DEDE : 11140863);
            iO1l.III_(this.IIo[n], this.IIoI[n], 10, 2);
        }
        if (this.var_byte_IIO1 == 0) {
            iO1l.II(var_javax_microedition_lcdui_Image_IIO1, 0, 0, 72, 95, 7, this.II0 + this.IIIl, II.var_int_IIlI / 2, 3);
        }
        if (this.var_byte_IIO1 == 1) {
            iO1l.II(IIO_, 0, 0, 144, 79, 2, this.II0 + this.IIIl, II.var_int_IIlI / 2, 3);
        }
        for (n = 0; n < this.var_int_II; ++n) {
            iO1l.Illl(this.var_byte_IIO1 == 0 ? 0xE3E3E3 : 7536127);
            iO1l.III_(this.Il_o[n], this.IIOO[n], 18, 3);
        }
        super.III_(iO1l);
    }

    @Override
    public void void_IIlO() {
        int[] nArray;
        int n;
        if (this.var_byte_IIO1 == 0) {
            if (!this.I__l) {
                this.IIIl = II.var_int_IIl / 2 * this.IIOI / this.IIII;
            }
        } else {
            this.IIIl += 2;
        }
        I1I1.I___ = false;
        this.II0 = (((II.var_int_IIl / 2 + this.II0) / 2 + this.II0) / 2 + this.II0) / 2;
        if (this.var_byte_IIO1 == 1) {
            this.II0 = 0;
        }
        for (n = 0; n < this.var_int_II; ++n) {
            nArray = this.IIo;
            int n2 = n;
            nArray[n2] = nArray[n2] - this.var_int_IIO1 / 2;
            if (this.IIo[n] >= -20) continue;
            this.IIo[n] = II.var_int_IIl;
        }
        for (n = 0; n < this.var_int_II; ++n) {
            nArray = this.Il_o;
            int n3 = n;
            nArray[n3] = nArray[n3] - this.var_int_IIO1;
            if (this.Il_o[n] >= -20) continue;
            this.Il_o[n] = II.var_int_IIl;
        }
        if (II.var_int_IIIO % 3 == 0) {
            this.var_int_IIO1 += this.I__l ? 2 : 1;
        }
        if (this.var_int_IIO1 > (this.I__l ? 80 : 25)) {
            this.var_int_IIO1 = this.I__l ? 80 : 25;
        }
        this.IlO = System.currentTimeMillis();
        if (this.IlO - this.I1 >= 1000L) {
            this.IIOI = (short)(this.IIOI + 1);
            this.I1 = this.IlO;
        }
        if (this.I__l) {
            this.IIIl += 3;
        }
        if (this.IIIl >= II.var_int_IIl / 2 + 30 && !this.I00) {
            this.I00 = true;
            I_0_.II().Io0l();
        }
        super.void_IIlO();
    }

    @Override
    public void I_Il() {
        super.I_Il();
    }

    @Override
    public void II(int n, Object object) {
        if (n == 1) {
            II.II(IO11.IooO, new I1Il(IO11.I_I_, this, 2, null), new I1Il(IO11.I_IO, this, 3, null));
        }
        if (n == 2 && Ilol.Ilol_II().II10() > 0) {
            this.I__l = true;
            II.III_();
            this.III0 = null;
        }
        if (n == 3) {
            II.III_();
        }
    }

    static {
        var_javax_microedition_lcdui_Image_IIO1 = IO10.IIII(IOlo.I1IO("\u5b82\u5ba1\u5b8a\u5c63\u5c47\u5c01\u5c0a\u5ce7\u5cc2\u5ca1\u5ccc\u5d6f\u5d58\u5d14\u5d3a\u5d06\u5de9\u5dc9\u5da9\u5d9f\u5e2b\u5e5c\u5e31\u5e03\u5ee1\u5edc\u5eb6\u5e80\u5f42\u5f58\u5f26\u5f1e\u5fa3\u5fdc\u5fa5\u5f8d", 23469));
        IIO_ = IO10.IIII(IOlo.I1IO("\u5b82\u5ba1\u5b8a\u5c63\u5c47\u5c01\u5c0a\u5ce7\u5cc2\u5ca1\u5ccc\u5d76\u5d40\u5d35\u5d31\u5d19\u5dfc\u5dd1\u5df5\u5d8a\u5e77\u5e5f", 23469));
    }

    private static /* synthetic */ String I1IO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

