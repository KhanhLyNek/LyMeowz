/*
 * Decompiled with CFR 0.152.
 */
public class IO1_ {
    public I1Il IIIo;
    public I1Il III0;
    public I1Il IIl;
    public static int ll11;
    public static int l_Io;
    public static int llo_;
    public static int l_l;

    public void I0l_() {
        II.IIIl();
        II.III1();
        II.II = this;
        II.II.setFullScreenMode(true);
    }

    public void IIO1(int n) {
    }

    public void IIlO() {
    }

    public void I_Il() {
        if (II.II[5] || IO1_.II(II.II.III0)) {
            II.II[5] = false;
            l_l = -1;
            II.IIIo = false;
            if (this.III0 != null) {
                this.III0.I0lO();
            }
        }
        if (II.II[12] || IO1_.II(II.II.IIIo)) {
            II.II[12] = false;
            l_l = -1;
            II.IIIo = false;
            if (Ilo_.II().I_10) {
                if (Ilo_.II().III_ != null) {
                    Ilo_.II().III_.I0lO();
                }
            } else if (this.IIIo != null) {
                this.IIIo.I0lO();
            }
        }
        if (II.II[13] || IO1_.II(II.II.IIl)) {
            II.II[13] = false;
            l_l = -1;
            II.IIIo = false;
            if (Ilo_.II().I_10) {
                if (Ilo_.II().IIIO != null) {
                    Ilo_.II().IIIO.I0lO();
                    return;
                }
            } else if (this.IIl != null) {
                this.IIl.I0lO();
            }
        }
    }

    public static boolean II(I1Il i1Il) {
        if (i1Il == null) {
            return false;
        }
        if (i1Il.I1 >= 0 && i1Il.I1I != 0) {
            return i1Il.II0o();
        }
        if (II.II != null) {
            if (II.II.III0 != null && II.II(II.IIl - l_Io >> 1, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 1;
                if (i1Il == II.II.III0 && II.III0 && II.IIIo) {
                    return true;
                }
            }
            if (II.II.IIIo != null && II.II(0, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 0;
                if (i1Il == II.II.IIIo && II.III0 && II.IIIo) {
                    return true;
                }
            }
            if (II.II.IIl != null && II.II(II.IIl - l_Io, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 2;
                if ((i1Il == II.II.IIl || i1Il == Ilo_.II().IIIO) && II.III0 && II.IIIo) {
                    return true;
                }
            }
        } else {
            if (i1Il == II.II.IIIo && II.II(0, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 0;
                if (II.III0 && II.IIIo) {
                    return true;
                }
            }
            if (i1Il == II.II.IIl && II.II(II.IIl - l_Io, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 2;
                if (II.III0 && II.IIIo) {
                    return true;
                }
            }
            if ((i1Il == II.II.III0 || Ilo1.III != null) && II.II(II.IIl - l_Io >> 1, II.IIlI - llo_ - 5, l_Io, llo_ + 10)) {
                l_l = 1;
                if (II.III0 && II.IIIo) {
                    return true;
                }
            }
        }
        return false;
    }

    public void III_(IO1l iO1l) {
        iO1l.IIl0(-iO1l.IIO1(), -iO1l.IIO_());
        iO1l.IIIO(0, 0, II.IIl, II.IIlI + 1);
        if (!Ilo_.II().I_10 && II.II == null && !II.II.IOol) {
            I_10.II(iO1l, this.IIIo, this.III0, this.IIl);
        }
    }

    static {
        l_Io = 68;
        llo_ = 26;
        l_l = -1;
    }
}

