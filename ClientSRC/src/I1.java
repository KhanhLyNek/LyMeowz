/*
 * Decompiled with CFR 0.152.
 */
public final class I1
implements I1_1 {
    public int I1l;
    public int IoI_;
    public int IoIO;
    public String IIo1;
    public long IlO;
    public String[] IIIo;
    public byte II1_;
    public byte III;
    private int IIOo;
    public int IoI0;
    public int IoIo;
    public String[] IIl;
    public static I_lO II1 = new I_lO(I1.IIoO("\u9722\u9753\u97df\u97d4\u97a3\u979c\u986f\u984a\u9829", 38740));

    public static void II(I1 i1, int n, boolean bl) {
        for (int i = 0; i < II1.size(); ++i) {
            I1 i12 = (I1)II1.elementAt(i);
            if (i12.I1l == i1.I1l) {
                II1.removeElement(i12);
                if (!bl) {
                    II1.insertElementAt(i1, i);
                    return;
                }
                II1.insertElementAt(i1, 0);
                return;
            }
            if (i12.IoIo == 0 || i12.IoI0 != i12.IoIo) continue;
            II1.removeElement(i12);
        }
        if (n == -1) {
            II1.addElement(i1);
        } else {
            II1.insertElementAt(i1, 0);
        }
        if (II1.size() > 20) {
            II1.removeElementAt(II1.size() - 1);
        }
    }

    public void III(IO1l iO1l, int n, int n2) {
        IO1I iO1I = IO1I.III_;
        if (this.III == 0) {
            iO1I = IO1I.II;
        } else if (this.III == 1) {
            iO1I = IO1I.III0;
        } else if (this.III == 2) {
            iO1I = IO1I.IIIO;
        }
        if (this.IoI_ == 0) {
            iO1I.II(iO1l, this.IIo1, n + 3, n2 + 1, 0);
            if (this.II1_ == 0) {
                IO1I.IIlO.II(iO1l, this.IIIo[0] + (this.IIIo.length > 1 ? I1.IIoO("\u977a\u975d\u97bc", 38740) : ""), n + 3, n2 + 11, 0);
            } else {
                IO1I.IIl0.II(iO1l, this.IIIo[0] + (this.IIIo.length > 1 ? I1.IIoO("\u977a\u975d\u97bc", 38740) : ""), n + 3, n2 + 11, 0);
            }
            IO1I.IIlO.II(iO1l, I_1l.IIIO(this.IIOo) + I1.IIoO("\u9774", 38740) + IO11.I0, n + II.II.llO0 - 3, n2 + 1, 1);
        }
        if (this.IoI_ == 1) {
            iO1I.II(iO1l, this.IIo1 + I1.IIoO("\u9774\u975b", 38740) + this.IoI0 + I1.IIoO("\u977b", 38740) + this.IoIo + I1.IIoO("\u977d", 38740), n + 3, n2 + 1, 0);
            IO1I.IIlo.II(iO1l, IO11.IO_1 + I1.IIoO("\u9774", 38740) + I_1l.IIIO(this.IIOo) + I1.IIoO("\u9774", 38740) + IO11.I0, n + 3, n2 + 11, 0);
        }
        if (this.IoI_ == 2) {
            iO1I.II(iO1l, this.IIo1, n + 3, n2 + 1, 0);
            IO1I.IIlo.II(iO1l, IO11.IO0o, n + 3, n2 + 11, 0);
        }
    }

    @Override
    public void II(int n, Object object) {
    }

    public void IIl1() {
        if (this.IlO != 0L) {
            this.IIOo = (int)(System.currentTimeMillis() / 1000L - this.IlO);
        }
    }

    private static /* synthetic */ String IIoO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

