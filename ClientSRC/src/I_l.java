/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;

public final class I_l
extends IO1_
implements I1_1 {
    public static I_l II;
    private IOI0 III_;
    private IOI0 III;
    private int I_0;
    private int IIO;
    private int IIOI = II.IIl - 20;
    private int IIOl;
    private String[] II1;
    private int IIO1;

    public I_l() {
        if (this.IIOI > 320) {
            this.IIOI = 320;
        }
        this.II1 = IO1I.IIIO.II(IO11.I1ol, this.IIOI - 20);
        this.I_0 = (II.IIl - this.IIOI) / 2;
        this.IIO = II.IIlI - 150 - (this.II1.length - 1) * 20;
        this.IIOl = 110 + (this.II1.length - 1) * 20;
        this.III_ = new IOI0();
        this.III_.II1o = IO11.I1o;
        this.III_.II0I = this.I_0 + 10;
        this.III_.I_O0 = this.IIO + 35 + (this.II1.length - 1) * 20;
        this.III_.l10 = this.IIOI - 20;
        this.III_.l10I = IO1_.ll11 + 2;
        this.III_.Il_0 = !II.IIIl;
        this.III_.Ill(0);
        if (!II.IIIl) {
            this.IIl = this.III_.IIII;
        }
        this.III = new IOI0();
        this.III.II1o = IO11.I1oI;
        this.III.II0I = this.I_0 + 10;
        this.III.I_O0 = this.III_.I_O0 + 35;
        this.III.l10 = this.IIOI - 20;
        this.III.l10I = IO1_.ll11 + 2;
        this.III.Il_0 = false;
        this.III.Ill(0);
        this.IIIo = new I1Il(IO11.I_I, this, 1, null);
        this.III0 = new I1Il(IO11.I1o1, this, 2, null);
        if (II.IIIl) {
            this.III0.I1 = II.IIl / 2 + 18;
            this.IIIo.I1 = II.IIl / 2 - 85;
            this.III0.I1I = this.IIIo.I1I = this.IIO + this.IIOl + 5;
        }
    }

    public static I_l II() {
        if (II == null) {
            II = new I_l();
        }
        return II;
    }

    @Override
    public void I0l_() {
        this.IIO1 = 0;
        try {
            if (IO11.IllI == 0) {
                GameMidlet.II.platformRequest(I_l.Il__("\ucefa\ucec5\ucea4\uce9f\ucf34\ucf02\ucf63\ucf05\ucfed\ucfc6\ucfab\ucf95\ud069\ud04b\ud023\ud00c\ud0ec\ud0cd\ud0a9\ud0b1\ud09b\ud133\ud15f\ud134\ud117\ud1b6", 52882));
            }
            if (IO11.IllI == 2) {
                GameMidlet.II.platformRequest(I_l.Il__("\ucefa\ucec5\ucea4\uce9f\ucf34\ucf02\ucf63\ucf0f\ucff8\ucfc8\ucfaf\ucf88\ud068\ud047\ud025\ud00f\ud0ee\ud08f\ud0a9\ud0b1\ud09a\ud172\ud152\ud13a\ud11d\ud1f8\ud196\ud1b4\ud199\ud278\ud21b", 52882));
            }
            if (IO11.IllI == 1) {
                GameMidlet.II.platformRequest(I_l.Il__("\ucefa\ucec5\ucea4\uce9f\ucf34\ucf02\ucf63\ucf1c\ucfe5\ucfdb\ucfa4\ucf83\ud028\ud051\ud021\ud002\ud0ef\ud0ce\ud0a2\ud0b6\ud0d0\ud17e\ud153\ud136\ud155\ud1fe\ud1d9\ud1ba\ud193\ud266\ud219\ud223\ud213\ud2f6\ud2d5\ud2e2\ud2de\ud323\ud344\ud33f\ud307\ud3e5", 52882));
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void III_(IO1l iO1l) {
        I1_I.II().III_(iO1l);
        I__O.II(iO1l, this.I_0, this.IIO, this.IIOI, this.IIOl, -1, true);
        for (int i = 0; i < this.II1.length; ++i) {
            IO1I.IIIO.II(iO1l, this.II1[i], II.IIl / 2, this.IIO + 15 + i * 20, 2);
        }
        this.III_.III_(iO1l);
        this.III.III_(iO1l);
        super.III_(iO1l);
    }

    @Override
    public void IIlO() {
        I1_I.II().IIlO();
        this.III_.IIlO();
        this.III.IIlO();
    }

    @Override
    public void IIO1(int n) {
        if (this.III_.Il_0) {
            this.III_.II1o(n);
        } else if (this.III.Il_0) {
            this.III.II1o(n);
        }
        super.IIO1(n);
    }

    @Override
    public void I_Il() {
        if (II.II[2]) {
            --this.IIO1;
            if (this.IIO1 < 0) {
                this.IIO1 = 1;
            }
        } else if (II.II[8]) {
            ++this.IIO1;
            if (this.IIO1 > 1) {
                this.IIO1 = 1;
            }
        }
        if (II.II[2] || II.II[8]) {
            II.IIIl();
            if (this.IIO1 == 1) {
                this.III_.Il_0 = false;
                this.III.Il_0 = true;
                if (!II.IIIl) {
                    this.IIl = this.III.IIII;
                }
            } else if (this.IIO1 == 0) {
                this.III_.Il_0 = true;
                this.III.Il_0 = false;
                if (!II.IIIl) {
                    this.IIl = this.III_.IIII;
                }
            } else {
                this.III_.Il_0 = false;
                this.III.Il_0 = false;
            }
        }
        if (II.IIIo) {
            if (II.II(this.III_.II0I, this.III_.I_O0, this.III_.l10, this.III_.l10I)) {
                this.IIO1 = 0;
            } else if (II.II(this.III.II0I, this.III.I_O0, this.III.l10, this.III.l10I)) {
                this.IIO1 = 1;
            }
        }
        super.I_Il();
        II.IIIl();
    }

    @Override
    public void II(int n, Object object) {
        if (n == 1) {
            I1_I.II.I0l_();
            II = null;
        }
        if (n == 2) {
            if (this.III_.IIl1() == null || this.III_.IIl1().equals("")) {
                II.II(IO11.I1o_);
                return;
            }
            if (this.III.IIl1() == null || this.III.IIl1().equals("")) {
                II.II(IO11.I1oO);
                return;
            }
            I_0_.II().III_(this.III_.IIl1(), this.III.IIl1());
            I1_I.II.I0l_();
            II = null;
        }
    }

    private static /* synthetic */ String Il__(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

