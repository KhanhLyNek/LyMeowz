/*
 * Decompiled with CFR 0.152.
 */
public abstract class I1l {
    public I1Il IIIo;
    public I1Il III0;
    public I1Il IIl;

    public void II(IO1l iO1l) {
        iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        iO1l.IIIO(0, 0, II.IIl, II.IIlI);
        I_10.II(iO1l, this.IIIo, this.III0, this.IIl);
    }

    public void IIO(int n) {
        switch (n) {
            case -39: 
            case -2: {
                II.IIII[8] = true;
                II.II[8] = true;
                return;
            }
            case -38: 
            case -1: {
                II.IIII[2] = true;
                II.II[2] = true;
                return;
            }
            case -27: {
                return;
            }
            case -22: 
            case -7: {
                II.IIII[13] = true;
                II.II[13] = true;
                return;
            }
            case -21: 
            case -6: {
                II.IIII[12] = true;
                II.II[12] = true;
                return;
            }
            case -5: 
            case 10: {
                II.IIII[5] = true;
                II.II[5] = true;
                return;
            }
        }
    }

    public void IIl1() {
        if (this.III0 != null && (II.II[5] || IO1_.II(this.III0))) {
            II.II[5] = false;
            II.III0 = false;
            IO1_.l_l = -1;
            II.IIIo = false;
            if (this.III0 != null) {
                this.III0.I0lO();
            }
            IO1_.l_l = -1;
        }
        if (this.IIIo != null && (II.II[12] || IO1_.II(this.IIIo))) {
            II.II[12] = false;
            II.III0 = false;
            IO1_.l_l = -1;
            II.IIIo = false;
            if (this.IIIo != null) {
                this.IIIo.I0lO();
            }
            IO1_.l_l = -1;
        }
        if (this.IIl != null && (II.II[13] || IO1_.II(this.IIl))) {
            II.II[13] = false;
            II.III0 = false;
            II.IIIo = false;
            IO1_.l_l = -1;
            if (this.IIl != null) {
                this.IIl.I0lO();
            }
            IO1_.l_l = -1;
        }
        II.IIIl();
        II.III1();
    }
}

