package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class I1o0
extends I_11
implements I1_1 {
    private static Image II_o = IO10.IIII(I1o0.Il1o("\u88a3\u88c6\u88ab\u8880\u8966\u896e\u892b\u8904\u89e3\u89c6\u89ed\u898c\u8a79\u8a4b\u8a5b\u8a25\u8a08\u8aee\u8ac8\u8abc\u8aca\u8b73\u8b5e\u8b34\u8b00\u8bf7\u8bd3\u8ba4\u8bde\u8c7f\u8c40\u8c2a", 34956));
    public int II0I;
    public int lIoo;
    public int I_Oo;
    public int ll;
    public String Ill1;
    public boolean IO0;
    public int[] II0O;
    public int[] II00;
    private I__O II = new I__O("", 0, 0);
    public boolean I1_l;
    public static boolean I1l = true;
    public boolean I1lI;
    public int IIO0;
    public long Il1O;
    public long IlO0;
    private boolean IOl1;
    private int llI = 0;

    public I1o0(int n, int n2, int n3, int n4, int n5, int n6) {
        super(n, n2, n3, n4, n5, n6);
        this.II.II_I = new I1Il((String)null, this, 1, null);
        I__O.II(this.II);
    }

    @Override
    public void II(IO1l iO1l) {
        if (!IIoo.II(this, iO1l) && this.II0I != 0) {
            I_oo.IIII(iO1l, this.II0I, this.I_o_, this.I_oO, 0, IOII.I_Oo);
            if (Ilol.Ilol_II().var_I_11_II != null && Ilol.Ilol_II().var_I_11_II.equals(this)) {
                iO1l.II(I_I_.Il0, 0, 0, 9, 6, 0, this.I_o_, this.I_oO - I_oo.IIlo[this.II0I][4] - 1, 33);
                if (this.Ill1 != null) {
                    IO1I.IIl_.II(iO1l, this.Ill1, this.I_o_, this.I_oO - I_oo.IIlo[this.II0I][4] - 20, 2, IO1I.IIlO);
                }
            } else if (this.Ill1 != null) {
                IO1I.IIl_.II(iO1l, this.Ill1, this.I_o_, this.I_oO - I_oo.IIlo[this.II0I][4] - 17, 2, IO1I.IIlO);
            }
            try {
                for (int i = 0; i < this.lIoo; ++i) {
                    iO1l.II(II_o, this.I_o_ + this.II0O[i] - I_oo.IIlo[this.II0I][3] / 2, this.I_oO + this.II00[i] - I_oo.IIlo[this.II0I][4], 0);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (this.I0IO >= 0 && this.III != null && this.III0 == 0) {
                I_oo.IIII(iO1l, this.III.II[this.I0IO].I_Oo, this.I_o_ + this.III.II[this.I0IO].II0I + I_oo.IIlo[this.II0I][3] / 2 + 5, this.I_oO - 15 + this.III.II[this.I0IO].I_O0, 0, 3);
                if (II.var_int_IIIO % 2 == 0) {
                    ++this.I0IO;
                    if (this.I0IO >= this.III.II.length) {
                        this.I0IO = 0;
                    }
                }
            }
        }
    }

    @Override
    public void IIl1() {
        this.II.I0_I = I1l;
        this.IlO0 = System.currentTimeMillis();
        if (this.IlO0 - this.Il1O >= 1000L) {
            --this.IIO0;
            this.Il1O = this.IlO0;
            if (this.IIO0 < 0) {
                this.IIO0 = 0;
            }
        }
        if (!this.IO0) {
            if (this.lIoo < this.ll && this.IIO0 == 0) {
                this.IOl1 = true;
            }
        } else if (this.IIO0 == 0) {
            this.IO0 = false;
            this.IOl1 = true;
        }
        if (this.IOl1) {
            ++this.llI;
            if (this.llI == 20) {
                this.llI = 0;
                this.IOl1 = false;
                I_0_.II().III0((byte)2);
            }
        }
        if (this.I1_l) {
            this.I1_l = false;
            if (!(this.IIO0 >= 0 && this.lIoo < this.ll || this.IIO0 >= 0 && this.IO0 || this.I1lI)) {
                if (this.lIoo == this.ll && !this.IO0) {
                    this.II.II(new String[]{IO11.IOlO, this.lIoo + I1o0.Il1o("\u88a3", 34956) + this.ll}, this.I_o_, this.I_oO - 20 - I_oo.IIlo[this.II0I][4]);
                }
            } else {
                this.II.II(new String[]{!this.IO0 ? this.lIoo + I1o0.Il1o("\u88a3", 34956) + this.ll : IO11.IOI1, I_1l.III_(this.IIO0)}, this.I_o_, this.I_oO - 20 - I_oo.IIlo[this.II0I][4]);
            }
        }
        if (this.IIO0 >= 0 && this.lIoo < this.ll || this.IIO0 >= 0 && this.IO0) {
            this.II.II_O[this.II.II_O.length - 1] = I_1l.III_(this.IIO0);
        }
        if (this.I1lI) {
            this.II.I0_I = false;
            I_0.III(98, this.I_o_ + this.II0O[this.lIoo - 1] - I_oo.IIlo[this.II0I][3] / 2, this.I_oO + this.II00[this.lIoo - 1] - I_oo.IIlo[this.II0I][4], 1);
            --this.lIoo;
            if (II.var_int_IIIO % 2 == 0) {
                IO.II();
            }
            if (this.lIoo == this.I_Oo) {
                this.II.I0_I = true;
                this.I1_l = true;
                this.I1lI = false;
            }
        }
        super.IIl1();
    }

    @Override
    public void II(int n, Object object) {
        if (n == 1) {
            I_0_.II().III_((byte)1);
        }
    }

    private static /* synthetic */ String Il1o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

