/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import nrolite.Res;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IO0 {
    final IOo_ IIl1;
    IOol II;
    String lI_l;
    final IOoI IIIl;
    final IOoO II;
    final IOo1 II;
    final I0I_ II;
    final IO_0 II;
    final IOO_ II;
    final IO_1 II;
    final IO0_ II;
    final IO0O II;
    final IO_o II;
    final IOo0 II;
    final IOO0 II;
    final I0IO II;
    final I0 II;
    final IOOO II;
    final IO_ II;
    final IO1o II;
    final IO00 II;
    final IO_O II;
    final IOo II;
    final IOOo II;
    private static int loO_ = -1;
    static final int[] I_ll = new int[]{363, 364, 365, 366, 367, 368, 369, 370, 371, 519, 520, 747};
    static final int[] I_l1 = new int[]{2761, 2330, 2323, 2327, 2326, 2324, 2329, 2328, 2331, 4386, 4385, 2325};
    private int loOO;

    public IO0(IOo_ iOo_) {
        this.IIl1 = iOo_;
        this.IIIl = new IOoI(this, iOo_);
        this.II = new IOoO(this, iOo_);
        this.II = new I0I_(this, iOo_);
        this.II = new IO_0(this, iOo_);
        this.II = new IOO_(this, iOo_);
        this.II = new IO_1(this, iOo_);
        this.II = new IO0_(this, iOo_);
        this.II = new IO0O(this, iOo_);
        this.II = new IO_o(this, iOo_);
        this.II = new IOo0(this, iOo_);
        this.II = new IOO0(this, iOo_);
        this.II = new I0IO(this, iOo_);
        this.II = new I0(this, iOo_, this.IIIl);
        this.II = new IOOO(this, iOo_, this.IIIl);
        this.II = new IO_(this, iOo_);
        this.II = new IO1o(this, iOo_);
        this.II = new IO00(this, iOo_);
        this.II = new IOo1(this, iOo_);
        this.II = new IO_O(this, iOo_);
        this.II = new IOo(this, iOo_);
        this.II = new IOOo(this, iOo_);
    }

    private int IIo() {
        return this.IIl1._1o_;
    }

    public void II(int n, DataInputStream dataInputStream) throws IOException {
        switch (n) {
            case -29: {
                this.IIIo(dataInputStream);
                break;
            }
            case -28: {
                this.IIl(dataInputStream);
                break;
            }
            case -87: {
                this.llO1();
                break;
            }
            case -67: {
                this.IlO0(dataInputStream.readInt());
                break;
            }
            case 66: {
                this.II0I(dataInputStream.readUTF());
                break;
            }
            case -66: {
                this.IlOo(dataInputStream.readShort());
                break;
            }
            case -32: {
                this.IlOO(dataInputStream.readShort());
                break;
            }
            case 11: {
                this.Il0(dataInputStream.readByte());
                break;
            }
            case -39: {
                this.Io0();
                break;
            }
            case -105: {
                this.II.lloO();
                break;
            }
            case -107: {
                this.II.ll_();
                break;
            }
            case -108: {
                this.II.Ilo_(dataInputStream.readByte());
                break;
            }
            case -7: {
                this.IIl1(dataInputStream);
                break;
            }
            case -41: {
                this.llOI();
                break;
            }
            case -33: 
            case -23: {
                this.llOl();
                this.IIl1.II(new IO0o(-99).II(-1));
                break;
            }
            case 34: {
                this.IIIl.IIlO(dataInputStream);
                break;
            }
            case -113: {
                this.III0(dataInputStream);
                break;
            }
            case 54: {
                this.IIIl.IIl0(dataInputStream);
                break;
            }
            case -60: {
                this.IIIl.IIlo(dataInputStream);
                break;
            }
            case -118: {
                this.IIIl.II.II1o(dataInputStream.readInt());
                break;
            }
            case 127: {
                this.II.II_I(dataInputStream);
                break;
            }
            case -127: {
                this.II.III1(dataInputStream);
                break;
            }
            case -76: {
                this.II.III1(dataInputStream);
                break;
            }
            case -125: {
                if (this.II.IlO1()) {
                    this.II.IIl_(dataInputStream);
                    break;
                }
                this.II.IIl_(dataInputStream);
                break;
            }
            case -103: {
                this.IIlI(dataInputStream);
                break;
            }
            case -45: {
                this.IIIl.II1(dataInputStream);
                break;
            }
            case 112: {
                this.II.ll0o();
                break;
            }
            case -20: {
                this.IIIl.II1I(dataInputStream);
                break;
            }
            case -81: {
                this.II.III1(dataInputStream);
                break;
            }
            case -43: {
                this.IIIl.II11(dataInputStream);
                this.IIIl.l11o();
                break;
            }
            case -40: {
                this.IIIl.II1l(dataInputStream);
                this.IIIl.l11o();
                break;
            }
            case 33: {
                this.IIIl.II1O(dataInputStream);
                break;
            }
            case 32: {
                this.IIIl.II10(dataInputStream);
                break;
            }
            case 6: {
                this.II.II_l(dataInputStream);
                this.IIIl.l11o();
                break;
            }
            case 44: {
                this.IIIl.II1_(dataInputStream);
                break;
            }
            case -34: {
                this.II.II(dataInputStream);
                break;
            }
            case 22: {
                this.IIIl.II1o(dataInputStream);
                break;
            }
            case -30: {
                this.IIll(dataInputStream);
                break;
            }
            case 7: {
                this.IIIl.II_(dataInputStream);
                this.IIIl.l11o();
                break;
            }
            case 29: {
                this.ll_o();
                break;
            }
            case 21: {
                this.IlO1(dataInputStream.readByte());
                break;
            }
            case -15: {
                this.IIIl.l1Oo();
                break;
            }
            case -16: {
                this.IIIl.l10();
                break;
            }
            case -91: {
                this.IIIl.I1l1(dataInputStream.readByte());
                break;
            }
            case -63: 
            case -62: 
            case -57: 
            case -56: 
            case -55: 
            case -54: 
            case -51: 
            case -50: 
            case -49: 
            case -47: 
            case -46: {
                this.II.II(n, dataInputStream);
                break;
            }
            case -114: 
            case -111: 
            case -78: 
            case -38: {
                break;
            }
            default: {
                System.out.println(IO0.I1__("\ubdba\ube6c\ube76\ube4a\ube38\ube21\ubebb\ubed9\ubeb1\ube8d\ubf76\ubf16\ubf3d\ubf1b\ubfb3\ubfc6\ubfa3\ubf9f\uc02f\uc04d\uc020\uc008\uc0ab", 48609) + n);
                if (this.IIIl == null || this.II == null) break;
                this.IIIl.l11o();
                this.IIIl.IIol(IO0.I1__("\ubda2\ube68\ua0f6\ube5d\ube7d\ube12\ubf98\ubed4\ubebe\ubed8\ubf79\ubfd6\ubf2c\ubf54\ubff0\ubfda\ube61\ubf91\uc02f\uc13f\uc1fd\ude8f\uc0e8\uc08a\uc0a1\ude3f\uc127\uc152\uc137\udf87\uc1a3\uc18a\uc1ac\uc103\uc1df", 48609) + n + IO0.I1__("\ubdc8", 48609));
            }
        }
    }

    private void III0(DataInputStream dataInputStream) throws IOException {
        for (int i = 0; i < this.II.I__1.length; ++i) {
            this.II.I__1[i] = dataInputStream.readByte();
        }
        this.I__O();
    }

    void ll1_() {
        int n;
        int n2;
        boolean bl = false;
        for (n2 = 0; n2 < this.II.I__1.length; ++n2) {
            if (this.II.I__1[n2] < 0) continue;
            bl = true;
        }
        if (!bl) {
            n2 = 0;
            for (n = 0; n < this.II.I__l.length && n2 < this.II.I__1.length; ++n) {
                IOO.IIIO iIIO = IOO.II(this.II.I__l[n]);
                if (iIIO == null) continue;
                this.II.I__1[n2++] = iIIO.lO0I;
            }
        }
        IO0o iO0o = new IO0o(-113);
        for (n = 0; n < 10; ++n) {
            iO0o.II(n < this.II.I__1.length ? this.II.I__1[n] : -1);
        }
        this.IIl1.II(iO0o);
    }

    private void IIIo(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        if (by == 0) {
            this.IIIO(dataInputStream.readUTF(), dataInputStream.readUTF());
        } else if (by == 2) {
            dataInputStream.readByte();
            this.IIl1._1o_ = dataInputStream.readByte();
            if (this.IIl1._1o_ < 1 || this.IIl1._1o_ > 4) {
                this.IIl1._1o_ = 1;
            }
            this.IIl1.II(new IO0o(-29).II(2).II(IO0.I1__("\ubdaf\ube67\ua0d2\ube5d\ube7d\ube2e\ua048\ubed4\ubebe\ubed8\ubf58\ubf58\ubf39\ubf1d\ubffd\ubfd7\ubfeb\ubfc1\uc03d\uc019\uc063\uc05c\uc0a5\uc09a\uc0e7\uc0d9\uc13d\uc117\uc171\uc150\uc1b7\uc197\uc1fb\uc1d0\uc1d3\uc22e\uc211\uc26c", 48609)).II(1));
        }
    }

    private void IIl(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        switch (by) {
            case 2: {
                this.III(dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readByte());
                break;
            }
            case 6: {
                this.II0(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube4a", 48609));
                break;
            }
            case 7: {
                this.II0(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube4b", 48609));
                break;
            }
            case 8: {
                this.II0(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube8a", 48609));
                this.II0(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube8b\ubee9\ubec8", 48609));
                this.II0(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube8b", 48609));
                this.II0(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube88", 48609));
                break;
            }
            case 10: {
                this.IlO_(dataInputStream.readUnsignedByte());
                break;
            }
            case 13: {
                this.IoOO();
                break;
            }
            default: {
                System.out.println(IO0.I1__("\ubdba\ube6c\ube76\ube4a\ube38\ube21\ubebb\ubed9\ubeb1\ube8d\ubf76\ubf16\ubf3d\ubf1b\ubfb3\ubfc6\ubfa3\ubf9f\uc02f\uc003\uc07f\uc054\uc0a4", 48609) + by);
                if (this.IIIl == null || this.II == null) break;
                this.IIIl.l11o();
                this.IIIl.IIol(IO0.I1__("\ubda2\ube68\ua0f6\ube5d\ube7d\ube12\ubf98\ubed4\ubebe\ubed8\ubf79\ubfd6\ubf2c\ubf54\ubff0\ubfda\ube61\ubf91\uc02f\uc13f\uc1fd\ude8f\uc0e8\uc08a\uc0a1\ude3f\uc127\uc152\uc137\udf87\uc1a3\uc18a\uc1ac\uc103\uc1df\uc233\uc20f\uc264\uc254", 48609) + by + IO0.I1__("\ubdc8", 48609));
            }
        }
    }

    private void II0(String string) {
        byte[] byArray = Res.read(string);
        if (byArray == null) {
            System.out.println(IO0.I1__("\ubdba\ube6c\ube76\ube4a\ube38\ube21\ubebb\ubece\ubeb1\ube91\ubf72\ubf43\ubf75", 48609) + string);
            return;
        }
        try {
            if (string.equals(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube48", 48609)) && byArray.length > 4) {
                byArray[4] = (byte)IO0.IIoI();
            } else if ((string.equals(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube8a", 48609)) || string.equals(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube8b\ubee9\ubec8", 48609))) && byArray.length > 1) {
                byArray[1] = (byte)IO0.IIoI();
            } else if (string.equals(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube8b", 48609)) || string.equals(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube44\ubec4\ube88", 48609))) {
                byArray = IO0.III(byArray);
            }
        }
        catch (Exception exception) {
            System.out.println(IO0.I1__("\ubdba\ube6c\ube76\ube4a\ube38\ube21\ubebb\ubed6\ubeb6\ube91\ubf37\ubf58\ubf34\ubf04\ubfb3\ubfdf\ubfb0\ubf85\uc02f\uc058\uc02c\uc018\uc0ab\uc0da\uc0a1\uc089\uc16a\uc106", 48609) + string + IO0.I1__("\ubddb\ube20", 48609) + exception);
        }
        this.IIl1.II(new IO0o(-28).II(byArray));
    }

    private static int IIoI() {
        if (loO_ >= 0) {
            return loO_;
        }
        int n = 17;
        IOO.II(0);
        if (IOO.II != null) {
            for (int i = 0; i < IOO.II.length; ++i) {
                IOO.III iII = IOO.II[i];
                if (iII == null) {
                    n = n * 31 + 7;
                    continue;
                }
                n = n * 31 + iII.I1l;
                n = n * 31 + iII.IoI_;
                n = n * 31 + iII.lOlI;
                n = n * 31 + iII.lOo0;
                n = n * 31 + iII.lOl_;
                n = n * 31 + (int)iII.I101;
                n = n * 31 + (iII.Io11 ? 1 : 0);
                n = n * 31 + (iII.II1o == null ? 0 : iII.II1o.hashCode());
            }
        }
        loO_ = 10 + (n & Integer.MAX_VALUE) % 100;
        return loO_;
    }

    private static byte[] III(byte[] byArray) throws IOException {
        int n;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        dataInputStream.readByte();
        dataInputStream.readByte();
        byte by = dataInputStream.readByte();
        int n2 = 0;
        if (by == 1) {
            n = dataInputStream.readShort();
        } else {
            n2 = dataInputStream.readShort();
            n = dataInputStream.readShort();
        }
        int n3 = n;
        IOO.II(0);
        if (by == 2 && IOO.II != null && IOO.II.length > n) {
            n3 = IOO.II.length;
        }
        IO0o iO0o = new IO0o(0);
        iO0o.II(8).II(IO0.IIoI()).II(by);
        if (by == 1) {
            iO0o.III(n3);
        } else {
            iO0o.III(n2).III(n3);
        }
        for (int i = n2; i < n3; ++i) {
            IOO.III iII;
            int n4 = 0;
            int n5 = 3;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            String string = "";
            String string2 = "";
            boolean bl = false;
            if (i < n) {
                n4 = dataInputStream.readByte();
                n5 = dataInputStream.readByte();
                string = dataInputStream.readUTF();
                string2 = dataInputStream.readUTF();
                n6 = dataInputStream.readByte();
                n9 = dataInputStream.readInt();
                n7 = dataInputStream.readShort();
                n8 = dataInputStream.readShort();
                bl = dataInputStream.readBoolean();
            }
            if ((iII = IOO.II(i)) != null) {
                n4 = iII.IoI_;
                n5 = iII.lOlI;
                string = iII.II1o == null ? "" : iII.II1o;
                n6 = iII.lOl_;
                n9 = (int)iII.I101;
                n7 = iII.lOo0;
                bl = iII.Io11;
            }
            iO0o.II(n4).II(n5).II(string).II(string2).II(n6).IIII(n9).III(n7).III(n8).II(bl);
        }
        return iO0o.III();
    }

    private void IIIO(String string, String string2) {
        boolean bl;
        this.lI_l = string;
        this.II = IOoo.II(string);
        if (this.II == null && IOoo.__IO > 0) {
            int n = IOoo.__IO;
            IOoo.__IO = -1;
            this.IIl1.II(new IO0o(-26).II(IO0.I1__("\ubdb5\ubee0\ube76\ube1e\ube36\ube14\ubef4\ua019\ubeb7\ubed8\ubf79\ubfd6\ubf2c\ubf54\ube82\ubf51\ubff1\ubee1\uc1bf\udecd\uc02e\uc04c\uc0e8\uc0c2\uc168\uc081\uc127\uc144\udff4\uc10a\uc1e4\uc182\uc1b1\uc188\uc196\uc2f4\uc253\uc27c\uc219\udc39\uc2d7\uc2f8\uc29a\uddcd\uc35c\uc374\uc31b\uc233\uc3df\uc3f0\uc3c7\uc46a\udac2\uc46c\uc407\uc4e3\uda6e\uc4bd\uc4c7\uc56a\uc495\uc531\uc543\udb5d\uc581\uc4d1\udb14\uc590\uc675\uc61c\uc63f\ud8db\uc6f7\uc6df\uc6f7\uc680", 48609) + n + IO0.I1__("\ubdcd\ube20\ube7d\ua09d\ube33\ube5c\ubf8a\ubedb\ubeb7\ube9f\ubf37\ubf55\ubf3d\ua1d5\ubfea\ubf92\ubfb2\ubf98\udec6\uc00e\uc15c\udea1\uc0e8\uc08a\uc1d8\uc158\udfe4\uc145\uc165\uc110\udf58\uc1cb\uc1e1\uc196", 48609) + 34 + IO0.I1__("\ubdc8\ube2e\ube3f\ube68\ube28\ube15\ubebb\ubed6\ube2b\ube96\ubf70\ubf16\ubf36\ua1d9\ubfe3\ubf92\ubfbf\ubf98\udea2\uc05a\uc06d\uc000\uc061\uc0c4\uc0e9\uc08a\udfa4\uc148\uc165\uc109\udf58\uc1cb\uc1e1\uc18e\uc197\udcbb\uc249\uc27c\uc209\udc49\uc2d0\uc2f8\uc281\uc3f6\uc35a\uc374\uc31f\udd33\uc3d8\uc3fc\uc3cf\uc465\uc445\uc4b8\uc405\uc4ed\uc489\uc4bc\uc48f\udbc5\uc505\uc520\uc59a\uc5ec\uc5c6\uc5e0\uc5bd\udb5d\uc673\uc61c\uc638\uc713\uc6b9\uc6d0\uc776\uc698\uc735\uc742\uc7bf\uc752\uc7e2\ud90d\uc7ef\uc782\uc8ed\uc841\uc86b\uc807\ud62c\uc8dc\uc8e7\uc882\ud7ea\uc904\uc92f\uc90b\ud746\uc9d5\uc99f\uc8cf\uc91e\uca3c\uca57\ucbea\uca0c\ucab6", 48609)));
            return;
        }
        boolean bl2 = bl = this.II != null && IO0I.IIII(this.II.IOO0);
        if (this.II == null) {
            this.ll1O();
            this.ll10();
            this.IIl1.II(new IO0o(2));
        } else {
            boolean bl3;
            boolean bl4 = bl3 = this.II.Il_0() > 0;
            if (this.II.IlOI() > 0 || bl3) {
                this.I__O();
            }
            this.ll1o();
            if (bl) {
                this.IIIl.IIol(IO0.I1__("\ubdb1\ube68\ubefe\ube4a\ube7d\ube14\ubef2\ua07d\ubeb7\ubed8\ube06\ua1e5\ubf3b\ubf13\ubfb3\ubfda\ua102\ubfd0\uc062\uc0cf\uc034\uc04c\uc0e9\ude61\uc0e9\uc08b\uc16f\udfef\uc12b\uc10c\uc1a3\uc1ce\uc138\uc189\uc1d1\uc23e\uc27e\uc2bd\uc218\uc2ba\uc2d4\udc09\uc294\uc336\uc341\uc33c\uc316\uc3fd\uc391\uc3be\uc388\uc4ee\uc454\uc46c\uc418\uda37\uc489\uc4bc\uc40a\uc568\uc54d\uc564\uc517\uc5ea\uc5c4\uc5af\uc5ff\uc58a\uc675\ud8e1\uc632\uc65a\uc6fe\uc6d1\uc6b6\uc698\uc735\uc625\uc7b0\uc752\uc7f6\uc7d8\uc7a6\uc7ce\uc863\uc844\ud6e6\uc804\uc8a7", 48609));
            }
            if (IOoo.lIOI != null) {
                this.IIIl.IIol(IOoo.lIOI);
                IOoo.lIOI = null;
            } else if (bl3) {
                this.IIIl.IIol(IO0.I1__("\ubcf1\ubee3\ube3f\ube4e\ube35\ube9d\ubeef\ube9a\ubeb1\ube91\ua1d0\ubf58\ubf75\ubf02\ubf73\ubf92\ubfa2\ua11d\uc06e\uc00e\uc020\udeb5\uc0ff\uc08a\uc0ba\ude39\uc127\uc142\udfaa\uc144\uc1ef\uc1cb\udf06\uc195\uc1df\uc275\uc255\uc2a8\uc215\uc2fd\uc299\uc2b0\udc14\uc366\uc315\uc338\uddb4\uc3bc", 48609));
            }
        }
    }

    private void ll1O() {
        this.II0(IO0.I1__("\ubd8c\ube2f\ube6c\ube4b\ube3f\ube48", 48609));
    }

    private void ll10() {
        byte[] byArray = Res.read(IO0.I1__("\ubd8c\ube2f\ube72\ube0d\ube6c", 48609));
        if (byArray != null) {
            this.IIl1.II(new IO0o(-31).II(byArray));
        }
    }

    private void III(String string, int n, int n2) {
        if (string.length() < 5 || string.length() > 10) {
            this.IIl1.II(new IO0o(-26).II(IO0.I1__("\ubdb5\ubeea\ube71\ube1e\ube33\ube14\ube79\ubed4\ubef9\ube8e\ua1ba\ubf42\ubf75\ubf17\ubffb\ua17b\ubff1\ubee1\udedc\uc040\uc02a\uc04c\uc076\uc08a\uc0aa\uc009\uc164\uc106\uc12e\uc199\uc1a3\uc1d6\udf30\uc1c0\uc19e\uc233\uc247\uc270\uc25b\uc2aa\uc294\uc2e1\uc2d7\uc360\uc3d5\uc374\uc310\uc3fa\uc3d8\udd11\uc39a\uc42e\uc449\uc4ac\uc402\uc4aa\uc4dd\uda23\uc4c7\uc533\uc505\uc455\udbdc\uc5ec\uc581\uc5f1\uc5ef\uc5de\uc676\uc6c1\uc67b\uc60e\ud868", 48609)));
            return;
        }
        this.II = IOol.II(string.toLowerCase(), n, n2);
        this.II.IO01 = System.currentTimeMillis() + 604800000L;
        IOoo.II(this.lI_l, this.II);
        this.ll1o();
    }

    private void ll1o() {
        IO0o iO0o = new IO0o(-77).III(Short.MAX_VALUE);
        for (int i = 0; i < Short.MAX_VALUE; ++i) {
            iO0o.II(0);
        }
        this.IIl1.II(iO0o);
        byte[] byArray = Res.read(IO0.I1__("\ubd8c\ube2f\ube72\ube07\ube6e", 48609));
        if (byArray != null) {
            this.IIl1.II(new IO0o(-93).II(byArray));
        }
        this.ll1O();
        this.ll10();
        this.ll_();
    }

    private void ll_() {
        byte[] byArray = Res.read(IO0.I1__("\ubd8c\ube61\ube6f\ube11\ube29\ube15\ubef7\ubedf\ube86\ube8b\ubf72\ubf42\ubf0a\ubf1d\ubffd\ubfd4\ubfbe", 48609));
        if (byArray != null) {
            this.IIl1.II(new IO0o(-82).II(byArray));
        }
        this.ll_0();
        this.ll_I();
        this.IIl1.II(new IO0o(-22));
        this.IIl1.II(new IO0o(-69).III(this.II._l0O));
        this.IIl1.II(new IO0o(-68).III(this.II._l0_));
        this.II.llo();
    }

    void ll_I() {
        int n;
        I0Il.III iII = I0Il.II(this.II._lOI);
        if (iII == null) {
            return;
        }
        IO0o iO0o = new IO0o(40).III(this.II._lOI).II(this.II._lOl).II(I0Il.I10O(iII.II1o, this.II.lOlI)).II(I0Il.I10O(iII.lIO1, this.II.lOlI));
        iO0o.II(iII.II.length);
        for (n = 0; n < iII.II.length; ++n) {
            I0Il.II iI = iII.II[n];
            iO0o.II(I0Il.I10O(iI.II1o, this.II.lOlI)).II(I0Il.IIlo(iI.l0_1, this.II.lOlI)).III(I0Il.II1(iI.lOlo, this.II.lOlI)).II(I0Il.I10O(iI.lIOl, this.II.lOlI));
        }
        iO0o.III(this.II._lO1);
        for (n = 0; n < iII.II.length; ++n) {
            iO0o.III(iII.II[n].__ll);
        }
        this.IIl1.II(iO0o);
    }

    private void IoOO() {
        I0Io.II iI;
        if (this.II == null) {
            return;
        }
        if (!this.II.Il1I() && IOOO.IIO1(this.II.lOlo)) {
            this.II.lOlo = 21 + this.II.lOlI;
            iI = I0Io.II(this.II.lOlo);
            this.II.lO1 = 0;
            this.II.I1 = iI != null && iI.II.length > 0 ? iI.II[0].__1o + 40 : 100;
            this.II.I1I = iI != null && iI.II.length > 0 ? iI.II[0].___l : 336;
            this.I__O();
        }
        if (this.II.llIl <= 0) {
            this.II.llIl = 1;
            this.II.lOlo = 21 + this.II.lOlI;
            iI = I0Io.II(this.II.lOlo);
            this.II.lO1 = 0;
            this.II.I1 = iI != null && iI.II.length > 0 ? iI.II[0].__1o + 40 : 100;
            this.II.I1I = iI != null && iI.II.length > 0 ? iI.II[0].___l : 336;
            this.I__O();
        }
        this.ll_O();
        this.ll__();
        this.IIIl.I_1o();
        this.ll_1();
        if (this.II._lOI == 0 && this.II._lOl == 0) {
            this.IIl1.II(new IO0o(38).III(5).II(IO0.I1__("\ubda2\ube68\ubeff\ube51\ube7d\ube31\ua070\ubed4\ubebe\ubed8", 48609) + this.II.II1o + IO0.I1__("\ubdc1\ubf10\ua0a0\ube50\ube7d\ube2a\ua040\ubed3\ubef9\ubeb6\ubf70\ua1fb\ubf36\ubf54\ubfc1\ua161\ubfbf\ubf97\uc02f\uc061\uc023\uc000\uc0e2\uc0c4\uc0ac\uc0e2\uc149\uc14e\uc12c\udfa3\uc1ee\uc182\uc1b7\udf05\uc1df\uc30f\udc9a\uc229\uc25b\uc2ee\uc2d0\uc232\uc299\uc336\uc356\uddb3\uc312\uc3b2\uc3d3\udd71\uc381\uc42e\uc441\uc4ac\uc44b\uc4ee\uc4c0\uc4e8\uc484\uc56e\uc550\uc53d\udba0\uc5ec\uc5ab\uc582\udb7e\uc590\uc63d\uc654\uc6b8\uc603\uc6b9\uc6dc\uc6be\uc6d6\uc776\uc75c\uc726\uc70b\ud952\uc7de\uc7ef\uc780\uc865\uc8ce\uc825\uc84a\uc8ff\ud605\uc8b3\uc8c6\uc971\uc94c\uc926\uc90d\uc9a1\uc9cd\uc8d6\uc9b7\uc9dd\uca68\ucad1\uca34\uca59\ucafb\ucadf\ud41f\ucad5\ucb7c\uca83\ud589\ucb1f\ucbf7", 48609)));
        }
        this.llO();
    }

    private void IIlI(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        if (by == 0) {
            IO0o iO0o = new IO0o(-103).II(0).II(I_ll.length);
            for (int i = 0; i < I_ll.length; ++i) {
                iO0o.III(I_ll[i]).II(1);
                if (I_ll[i] == 363) {
                    iO0o.II(73).III(0);
                    continue;
                }
                if (I_ll[i] == 371) {
                    iO0o.II(88).III(10);
                    continue;
                }
                iO0o.II(88).III(5);
            }
            this.IIl1.II(iO0o);
        } else if (by == 1) {
            byte by2 = dataInputStream.readByte();
            if (by2 < 0 || by2 >= I_ll.length) {
                return;
            }
            int n = this.II.lOlo;
            if (n >= 85 && n <= 91 || n >= 114 && n <= 120) {
                this.IIIl.IIol(IO0.I1__("\ubdaa\ube68\ubeeb\ube50\ube3a\ube5c\ubf8a\ubf0a\ua03a\ube9b\ubf37\ube27\ua180\ubf1d\ubfb3\ubfd1\ua10c\ubfd0\uc063\uc0d4\uc02e\uc04c\uc0e5\uc04a\uc0b0", 48609));
                return;
            }
            long l = 60000L - (System.currentTimeMillis() - this.II.IO__);
            if (l > 0L) {
                this.IIIl.IIol(IO0.I1__("\ubda2\ube68\ua0d6\ube1e\ubf4c\ubfcc\ua078\ubed9\ubef9\ubfe9\ua1c2\ubf5f\ubf75\ubf17\ua14e\ubf92\ubfa2\ubf91\uc07a\uc00e", 48609) + (l / 1000L + 1L) + IO0.I1__("\ubdc1\ube67\ube76\ubedc\ube24\ube5c\ubef5\ua055\ubeb8", 48609));
                return;
            }
            this.II._l0l = by2;
            this.II.IO__ = System.currentTimeMillis();
            this.ll_l();
            this.I__O();
        }
    }

    void ll_l() {
        if (this.II == null) {
            return;
        }
        int n = this.II._l0l < 0 || this.II._l0l >= I_l1.length ? 0 : this.II._l0l;
        this.IIl1.II(new IO0o(-103).II(1).IIII(this.II.I1l).II(n));
        this.IIl1.II(new IO0o(-103).II(2).II(n).III(I_l1[n]));
    }

    void ll_1() {
        int n = -1;
        IO0l iO0l = this.II.II[8];
        if (this.II._lOI == 3 && this.II._lOl == 2) {
            this.IIl1.II(new IO0o(-64).IIII(this.II.I1l).II(28));
            return;
        }
        if (iO0l != null && !iO0l.II1_()) {
            n = I0I1.IIoO(iO0l.I1l);
        } else if (this.II._lOO != 0) {
            n = this.II._lO0;
        }
        this.IIl1.II(new IO0o(-64).IIII(this.II.I1l).II(n));
    }

    void ll__() {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int n = this.II.I0;
        int n2 = this.IIII(this.II.II[0], 0);
        int n3 = this.IIII(this.II.II[1], 1);
        IO0l iO0l = this.II.II[5];
        int[] nArray4 = nArray3 = iO0l == null || iO0l.II1_() ? null : I0I1.III_(iO0l.I1l);
        if (nArray3 != null) {
            if (nArray3[0] != -1) {
                n = nArray3[0];
            }
            if (nArray3[1] != -1) {
                n2 = nArray3[1];
            }
            if (nArray3[2] != -1) {
                n3 = nArray3[2];
            }
        }
        if ((nArray2 = this.II.IIIl()) != null) {
            n = nArray2[0];
            n2 = nArray2[1];
            n3 = nArray2[2];
        }
        if ((nArray = this.II.III_()) != null) {
            n = nArray[0];
            n2 = nArray[1];
            n3 = nArray[2];
        }
        int n4 = 0;
        if (nArray == null && this.II._lo_ > 0) {
            int[] nArray5 = new int[]{192, 195, 196, 199, 197, 200, 198};
            n = nArray5[Math.min(this.II._lo_, nArray5.length) - 1];
            n2 = 193;
            n3 = 194;
            n4 = 1;
        }
        this.IIl1.II(new IO0o(-90).II(1).IIII(this.II.I1l).III(n).III(n2).III(n3).II(n4));
    }

    void I__O() {
        if (this.lI_l != null && this.II != null) {
            IOoo.II(this.lI_l, this.II);
        }
    }

    private static int IIO_(int n) {
        switch (n) {
            case 1: 
            case 8: 
            case 15: {
                return 1;
            }
            case 42: 
            case 43: 
            case 44: {
                return 2;
            }
            case 2: 
            case 9: 
            case 16: {
                return 3;
            }
            case 24: 
            case 25: 
            case 26: {
                return 4;
            }
            case 3: 
            case 11: 
            case 17: {
                return 7;
            }
            case 5: 
            case 13: 
            case 20: {
                return 9;
            }
            case 27: 
            case 28: 
            case 31: 
            case 32: 
            case 35: 
            case 36: {
                return 13;
            }
            case 30: 
            case 34: 
            case 38: {
                return 15;
            }
            case 6: 
            case 10: 
            case 19: {
                return 16;
            }
            case 64: 
            case 65: 
            case 68: 
            case 69: 
            case 70: 
            case 71: 
            case 72: {
                return 18;
            }
            case 63: 
            case 66: 
            case 67: 
            case 73: 
            case 74: 
            case 75: 
            case 76: 
            case 77: 
            case 79: 
            case 81: 
            case 82: 
            case 83: {
                return 19;
            }
            case 80: 
            case 92: 
            case 93: 
            case 94: 
            case 96: 
            case 102: {
                return 21;
            }
            case 97: 
            case 98: 
            case 99: 
            case 100: {
                return 24;
            }
            case 103: 
            case 105: 
            case 106: 
            case 107: 
            case 108: 
            case 109: 
            case 110: 
            case 154: {
                return 27;
            }
        }
        return 0;
    }

    boolean II01(int n) {
        if (this.II == null) {
            return true;
        }
        boolean bl = true;
        if (this.II._lOI < IO0.IIO_(n)) {
            bl = false;
        }
        if (n == 111 && this.II.IO_l > 1500000L) {
            this.IIl1.II(new IO0o(-25).II(IO0.I1__("\ubdb2\ua0e9\ube7c\ube1e\ube30\ua0dd\ubef5\ubed2\ubef9\ube88\ubf7f\ua195\ubf3c\ubf54\ubff7\ube02\ua10a\ubf99\uc02f\uc01f\uc061\uc059\uc0ab\uc0de\uc0bb\uc081\udfc0\uc153\uc165\uc109\udf58\uc1cb\uc1e1\uc196\uc11f\uc271\uc21d\uc34d\uc3cb\udc79\uc2da", 48609)));
            return false;
        }
        if (this.II.lOlI == 0 && (n == 22 || n == 23)) {
            bl = false;
        }
        if (this.II.lOlI == 1 && (n == 21 || n == 23)) {
            bl = false;
        }
        if (this.II.lOlI == 2 && (n == 21 || n == 22)) {
            bl = false;
        }
        if (!bl) {
            this.IIl1.II(new IO0o(-25).II(IO0.I1__("\ubda3\ua0a1\ube71\ube1e\ube3e\ube14\ubf2b\ubedb\ubef9\ube8c\ubf7f\ua1f5\ubf75\ube65\ua12c\ubfdc\ubff1\ubf9b\uc067\uc05b\uc06d\uc01a\ude7a\uc0c9\uc0e9\uc086\uc1e7\uc15f", 48609)));
        }
        return bl;
    }

    void IlOl(int n) {
        if (!this.II01(n)) {
            return;
        }
        int n2 = 100 + (int)(Math.random() * 500.0);
        this.IIl1.II(new IO0o(-65).IIII(this.II.I1l).II(1));
        this.loOO = 1;
        this.III_(n, n2, 5);
    }

    void III_(int n, int n2, int n3) {
        this.II.lOlo = n;
        this.II.I1 = n2;
        this.II.I1I = n3;
        if (this.II.llIl > this.II.Illo()) {
            this.II.llIl = this.II.Illo();
        }
        this.I__O();
        this.IIl1.II(new IO0o(-22));
        this.llO();
    }

    private int IIII(IO0l iO0l, int n) {
        if (iO0l == null || iO0l.II1_()) {
            return -1;
        }
        return I0I1.IIoO(iO0l.I1l);
    }

    private void ll_O() {
        IO0o iO0o = new IO0o(-30).II(0);
        iO0o.IIII(this.II.I1l).II(this.II._lOI).II(this.II.lOlI).III(this.II.I0).II(this.II.II1o).II(0).II(0);
        iO0o.II(this.II.IO_l).III(0).III(0).II(this.II.lOlI);
        iO0o.II(this.II.I__l.length);
        for (int i = 0; i < this.II.I__l.length; ++i) {
            iO0o.III(this.II.I__l[i]);
        }
        iO0o.II(this.II.Il11).IIII(this.II._lO).IIII(this.II.lOoO);
        this.II(iO0o, this.II.II);
        this.II(iO0o, this.II.III);
        this.II(iO0o, this.II.IIII);
        byte[] byArray = Res.read(IO0.I1__("\ubd8c\ube2f\ube77\ube5b\ube3c\ube18\ubec4\ubedb\ubeaf\ube99\ubf63\ubf57\ubf27", 48609));
        if (byArray != null) {
            iO0o.II(byArray);
        } else {
            iO0o.III(0);
        }
        iO0o.III(514).III(515).III(537);
        iO0o.II(this.II._10 != 0 ? 1 : 0).IIII(0).II(this.IIIl.Il0O() ? 1 : 0).III(this.II.Illl()).II(this.II.Ill1()).III(-1);
        this.IIl1.II(iO0o);
        this.II.l1();
        if (this.II._lOO != 0) {
            this.II.lIlO();
        }
    }

    private void II(IO0o iO0o, IO0l[] iO0lArray) {
        iO0o.II(iO0lArray.length);
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

    void ll_0() {
        int n = this.II.Illo();
        int n2 = this.II.Il1();
        IO0o iO0o = new IO0o(-42);
        iO0o.IIII(this.II._l00).IIII(this.II._l0o).IIII(this.II._lo).IIII(n).IIII(n2).IIII(this.II.llIl).IIII(this.II._loI);
        iO0o.II(this.II.Ill0()).II(20).II(20).II(1);
        iO0o.IIII(this.II.Il1I()).IIII(this.II.Il1_()).II(this.II.Il1l()).II(this.II.IO_1).III(100).III(this.II._lol).II(this.II._lo1).IIII(0).IIII(0);
        this.IIl1.II(iO0o);
    }

    private void IIll(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        if (by == 16) {
            this.IIIl.IIlO(dataInputStream.readByte(), dataInputStream.readShort());
        }
    }

    private void ll_o() {
        int n;
        I0Io.II iI = I0Io.II(this.II.lOlo);
        int n2 = n = iI == null || iI.__1O <= 0 ? 1 : iI.__1O;
        if (this.II.Il1I() && IOOO.IIO1(this.II.lOlo)) {
            n = 1;
        }
        if (n > 40) {
            n = 40;
        }
        int n3 = iI == null || iI.__10 <= 0 ? 12 : iI.__10;
        IO0o iO0o = new IO0o(29).II(n);
        for (int i = 0; i < n; ++i) {
            iO0o.II(i).II(0).II(i == this.II.lO1 ? 1 : 0).II(n3).II(0);
        }
        this.IIl1.II(iO0o);
    }

    void IlO1(int n) {
        int n2;
        if (this.II.Il1I() && IOOO.IIO1(this.II.lOlo)) {
            this.IIl1.II(new IO0o(-25).II(IO0.I1__("\ubdaa\ube68\ubeeb\ube50\ube3a\ube5c\ubeef\ubed2\ua01a\ubed8\ube06\ua1e3\ubf3c\ubf54\ubff8\ubfda\ubfa4\ubfd0\uc07b\uc05c\uc022\uc002\uc0ec\uc08a\uc0b9\uc080\uc1f4\uc106\uc127\udfc7\uc1ed", 48609)));
            return;
        }
        I0Io.II iI = I0Io.II(this.II.lOlo);
        int n3 = n2 = iI == null || iI.__1O <= 0 ? 1 : iI.__1O;
        if (n == -1) {
            int n4 = n = n2 > 1 ? (this.II.lO1 + 1) % n2 : 0;
        }
        if (n < 0 || n >= n2) {
            this.IIl1.II(new IO0o(-25).II(IO0.I1__("\ubdaa\ube68\ubeeb\ube50\ube3a\ube5c\ubeef\ubed2\ua01a\ubed8\ube06\ua1e3\ubf3c\ubf54\ubff8\ubfda\ubfa4\ubfd0\uc079\udedf\uc02e", 48609)));
            return;
        }
        this.II.lO1 = n;
        this.III_(this.II.lOlo, this.II.I1, this.II.I1I);
    }

    private void llO() {
        int n;
        Object object;
        int n2;
        I0Io.II iI = I0Io.II(this.II.lOlo);
        if (iI == null) {
            this.II.lOlo = 21 + this.II.lOlI;
            iI = I0Io.II(this.II.lOlo);
        }
        IO0o iO0o = new IO0o(-24);
        iO0o.II(iI.I1l).II(iI.__1l).II(iI.__11).II(iI.__1_).II(iI.IoI_).II(iI.II1o).II(this.II.lO1);
        iO0o.III(this.II.I1).III(this.II.I1I);
        iO0o.II(iI.II.length);
        for (int i = 0; i < iI.II.length; ++i) {
            I0Io.IIIl iIIl = iI.II[i];
            iO0o.III(iIIl.__1o).III(iIIl.___).III(iIIl.___I).III(iIIl.___l).II(iIIl.lIl).II(iIIl.lIlI).II(iIIl.II1o);
        }
        I0Io.III[] iIIArray = this.IIIl.II(iI);
        iO0o.II(iIIArray.length);
        for (n2 = 0; n2 < iIIArray.length; ++n2) {
            int[] nArray;
            object = iIIArray[n2];
            iO0o.II(false).II(((I0Io.III)object).l0o1 == 117).II(false).II(false).II(false);
            n = ((I0Io.III)object).llIl;
            int n3 = ((I0Io.III)object).llIl;
            if (this.II.Il1I() && IO_1.II_1(iI.I1l)) {
                n = this.II.II1o(((I0Io.III)object).l0o1);
                n3 = this.II.IIIO(iI.I1l, n2) ? 0 : n;
            }
            int[] nArray2 = nArray = this.II.Il1I() ? this.II.II(iI.I1l, n2, ((I0Io.III)object).l0o1) : null;
            if (nArray != null) {
                n = nArray[0];
                n3 = nArray[1];
            }
            if (((I0Io.III)object).l0o1 == 70) {
                int[] nArray3 = this.IIIl.III1();
                iO0o.II(70).II(nArray3[0]).IIII(nArray3[1]).II(((I0Io.III)object).lOl_).IIII(((I0Io.III)object).llIl).III(nArray3[2]).III(nArray3[3]).II(5).II(0).II(false);
                continue;
            }
            iO0o.II(((I0Io.III)object).l0o1).II(0).IIII(n3).II(((I0Io.III)object).lOl_).IIII(n).III(((I0Io.III)object).I1).III(((I0Io.III)object).I1I).II(n3 <= 0 && n > 0 ? 0 : 5).II(0).II(false);
        }
        iO0o.II(0);
        iO0o.II(iI.II.length);
        for (n2 = 0; n2 < iI.II.length; ++n2) {
            object = iI.II[n2];
            n = ((I0Io.IIII)object).I1l < I0Io.I_oO.length ? I0Io.I_oO[((I0Io.IIII)object).I1l] : 0;
            iO0o.II(0).III(((I0Io.IIII)object).I1).III(((I0Io.IIII)object).I1I).II(((I0Io.IIII)object).I1l).III(n);
        }
        iO0o.II(0);
        byte[] byArray = Res.read(IO0.I1__("\ubd8c\ube61\ube6f\ube11\ube34\ube08\ubefe\ubed7\ube86\ube9a\ubf70\ubf69\ubf38\ubf15\ubfe3\ubfed\ubfb5\ubf91\uc07b\uc04f\uc062", 48609) + iI.I1l);
        if (byArray != null) {
            iO0o.II(byArray);
        } else {
            iO0o.III(0);
        }
        iO0o.III(iI.Il01.length);
        for (int i = 0; i < iI.Il01.length; ++i) {
            iO0o.II(iI.Il01[i]).II(iI.Il0_[i]);
        }
        iO0o.II(iI.l1o_).II(this.loOO).II(0);
        this.loOO = 0;
        this.IIl1.II(iO0o);
        this.IIIl.II(iI);
    }

    private void Io0() {
        this.IIIl.lIlI();
    }

    private void llOI() {
        String[] stringArray = new String[]{IO0.I1__("\ubdb5\ube72\ubefe\ube57\ube7d\ubf6c\ua03e\ubece", 48609), IO0.I1__("\ubdaf\ube61\ube72\ua081\ube3e", 48609), IO0.I1__("\ubdb9\ube61\ube66\ube5a\ube3c", 48609)};
        String string = stringArray[this.II == null ? 0 : this.II.lOlI];
        String string2 = this.II != null && this.II.lOlI == 0 ? IO0.I1__("\ubd8f\ube68\ubefd\ube50", 48609) : string;
        String[] stringArray2 = new String[]{IO0.I1__("\ubdb5\ubee2\ube71\ube1e\ube29\ube14\ua07c", 48609), IO0.I1__("\ubdb5\ua0ad\ube6f\ube1e\ube2e\ua08d\ubebb\ubec9\ubf78\ubed8\ubf74\ua193\ubf25", 48609), IO0.I1__("\ubdb5\ua0ad\ube6f\ube1e\ube2e\ua08d\ubebb\ubece\ubeab\ube8d\ubf79\ubf51\ubf75\ubf17\ua136\ubfc2", 48609), IO0.I1__("\ubdb5\ua0ad\ube6f\ube1e\ube2e\ua08d\ubebb\ubed9\ubeb8\ube97\ubf37\ubf55\ua1f0\ubf04", 48609), IO0.I1__("\ubdb5\ubee2\ube71\ube1e\ube3f\ube15\ubef5\ubed2", 48609), IO0.I1__("\ubda2\ube68\ube76\ua081\ube33\ube5c\ubef9\ubed3\ubeb7\ube90", 48609), IO0.I1__("\ubda2\ube68\ube76\ua081\ube33\ube5c\ubef9\ubed3\ubeb7\ube90\ubf37\ubf55\ubf34\ubf1b\ubfb3\ubfd1\ua174\ubf80", 48609), IO0.I1__("\ubdb7\ua0c7\ube3f\ube5c\ube34\ube12\ubef3", 48609), IO0.I1__("\ubdb7\ua0c7\ube3f\ube5c\ube34\ube12\ubef3\ube9a\ubeb1\ube97\ubff7\ubf58\ubf32\ubf54\ubff4\ubfdb\ubfb0", 48609), IO0.I1__("\ubdb2\ube69\ubef5\ube4b\ube7d", 48609) + string2 + IO0.I1__("\ubdc1\ube63\ua0ba\ube4e\ube7d\ube4d", 48609), IO0.I1__("\ubdb2\ube69\ubef5\ube4b\ube7d", 48609) + string2 + IO0.I1__("\ubdc1\ube63\ua0ba\ube4e\ube7d\ube4e", 48609), IO0.I1__("\ubdb2\ube69\ubef5\ube4b\ube7d", 48609) + string2 + IO0.I1__("\ubdc1\ube63\ua0ba\ube4e\ube7d\ube4f", 48609), IO0.I1__("\ubdb2\ube69\ubef5\ube4b\ube7d", 48609) + string2 + IO0.I1__("\ubdc1\ube63\ua0ba\ube4e\ube7d\ube48", 48609), IO0.I1__("\ubdb5\ube68\ua0b8\ube50\ube7d", 48609) + string + IO0.I1__("\ubdc1\ube63\ua0ba\ube4e\ube7d\ube4d", 48609), IO0.I1__("\ubdb5\ube68\ua0b8\ube50\ube7d", 48609) + string + IO0.I1__("\ubdc1\ube63\ua0ba\ube4e\ube7d\ube4e", 48609), IO0.I1__("\ubdb5\ube68\ua0b8\ube50\ube7d", 48609) + string + IO0.I1__("\ubdc1\ube63\ua0ba\ube4e\ube7d\ube4f", 48609), IO0.I1__("\ubda6\ube69\ua0c4\ube57\ube7d\ube2a\ubf2b\ubf1b\ubeb7\ube9f\ubf37\ubf62\ubf3d\ua1d3\ubffd\ubf92\ubfb2\ua155\uc07f\uc00e\uc07c", 48609), IO0.I1__("\ubda6\ube69\ua0c4\ube57\ube7d\ube2a\ubf2b\ubf1b\ubeb7\ube9f\ubf37\ubf62\ubf3d\ua1d3\ubffd\ubf92\ubfb2\ua155\uc07f\uc00e\uc07f", 48609), IO0.I1__("\ubda6\ube69\ua0c4\ube57\ube7d\ube2a\ubf2b\ubf1b\ubeb7\ube9f\ubf37\ubf62\ubf3d\ua1d3\ubffd\ubf92\ubfb2\ua155\uc07f\uc00e\uc07e", 48609), IO0.I1__("\ubdb5\ube68\ube76\ubed4\ube33\ube5c\ubf8a\ua01b\ubeb6", 48609), IO0.I1__("\ubd8a\ua0bb\ube3f\ube56\ubf34\ube05\ubebb\ubede\ubeb0\ua03f\ubf63\ubf16\ubf23\ube1d\ubfb3\ubfc6\ubfa3\ua115", 48609), IO0.I1__("\ubd97\ubef4\ube3f\ubf2f\ua096\ube1f\ubef3\ube9a\ubfc8\ube99\ubf37\ubf51\ubf3c\ua1af\ubffa", 48609)};
        IO0o iO0o = new IO0o(-41).II(stringArray2.length);
        for (int i = 0; i < stringArray2.length; ++i) {
            iO0o.II(stringArray2[i]);
        }
        this.IIl1.II(iO0o);
    }

    private void II(I0Io.IIIl iIIl) {
        int n = this.II.I1;
        n = iIIl != null ? (iIIl.__1o <= 100 ? Math.max(60, iIIl.___I + 40) : Math.max(60, iIIl.__1o - 60)) : Math.max(60, n);
        this.II.I1 = n;
        this.IIl1.II(new IO0o(46).III(this.II.I1).III(this.II.I1I));
    }

    private void llOl() {
        if (this.II == null) {
            return;
        }
        I0Io.II iI = I0Io.II(this.II.lOlo);
        I0Io.IIIl iIIl = null;
        for (int i = 0; i < iI.II.length; ++i) {
            I0Io.IIIl iIIl2 = iI.II[i];
            if (this.II.I1 < iIIl2.__1o || this.II.I1 > iIIl2.___I || this.II.I1I < iIIl2.___ || this.II.I1I > iIIl2.___l) continue;
            iIIl = iIIl2;
            break;
        }
        if (iIIl == null || I0Io.II(iIIl.___1) == null) {
            this.IIl1.II(new IO0o(-25).II(IO0.I1__("\ubda3\ua0a1\ube71\ube1e\ube3e\ube14\ubf2b\ubedb\ubef9\ube8c\ubf7f\ua1f5\ubf75\ube65\ua12c\ubfdc\ubff1\ubf9b\uc067\uc05b\uc06d\uc01a\ude7a\uc0c9\uc0e9\uc086\uc1e7\uc15f", 48609)));
            this.II(iIIl);
            return;
        }
        if (!this.II01(iIIl.___1)) {
            this.II(iIIl);
            return;
        }
        if (this.II.Il1I() && this.II.II0(iIIl.___1)) {
            this.IIl1.II(new IO0o(-25).II(IO0.I1__("\ubda9\ubee3\ube66\ube1e\ube29\ube15\ube71\ubecf\ubef9\ube9c\ubf7e\ua1f1\ubf21\ubf54\ubffb\ua10d\ubfa5\ubfd0\uc07e\uc05b\uc0ac\uc005\uc0ab\uc0de\uc0bb\uc087\uc169\uc141\uc165\uc10f\uc1eb\uc1d7\uc1e1\uc196\udf0e\uc27d\uc21d\uc232\uc29b\uc2e3\uc299\uc2ac\uc285\uc2a6\uddee\uc337", 48609)));
            this.II(iIIl);
            return;
        }
        this.III_(iIIl.___1, iIIl.____, iIIl.___O);
    }

    private void IIl1(DataInputStream dataInputStream) {
        try {
            dataInputStream.readByte();
            this.II.I1 = dataInputStream.readShort();
            if (dataInputStream.available() >= 2) {
                this.II.I1I = dataInputStream.readShort();
            }
            if (this.II._lOI == 0) {
                this.IIIl.l10o();
            }
            this.II.ll11();
            this.II.ll11();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private void IlO_(int n) {
        byte[] byArray = Res.read(IO0.I1__("\ubd8c\ube61\ube6f\ube11\ube29\ube15\ubef7\ubedf\ube86\ube95\ubf76\ubf46\ubf0a\ubf10\ubff2\ubfc6\ubfb0\ubfdf", 48609) + n);
        if (byArray != null) {
            this.IIl1.II(new IO0o(-28).II(10).II(byArray));
        }
    }

    private void llO1() {
        String[] stringArray = new String[]{IO0.I1__("\ubd85\ube61\ube6d\ube4a", 48609), IO0.I1__("\ubd80\ube72\ube6d\ube51\ube2a", 48609), IO0.I1__("\ubd84\ube66\ube79\ube5b\ube3e\ube08", 48609), IO0.I1__("\ubd88\ube6d\ube7e\ube59\ube38", 48609)};
        IO0o iO0o = new IO0o(-87).II(10);
        for (int i = 0; i < stringArray.length; ++i) {
            IO0.II(iO0o, Res.read(IO0.I1__("\ubd94\ube70\ube7b\ube5f\ube29\ube19\ubec4\ubede\ubeb8\ube8c\ubf76\ubf19", 48609) + stringArray[i]));
        }
        IO0.II(iO0o, Res.read(IO0.I1__("\ubd8c\ube2f\ube6f\ube5f\ube2f\ube08", 48609)));
        IO0.II(iO0o, Res.read(IO0.I1__("\ubd94\ube70\ube7b\ube5f\ube29\ube19\ubec4\ubede\ubeb8\ube8c\ubf76\ubf19\ubf26\ubf1f\ubffa\ubfde\ubfbd", 48609)));
        this.IIl1.II(iO0o);
    }

    private static void II(IO0o iO0o, byte[] byArray) {
        if (byArray == null) {
            byArray = new byte[]{};
        }
        iO0o.IIII(byArray.length).II(byArray);
    }

    private void IlOO(int n) {
        byte[] byArray = Res.read(IO0.I1__("\ubd88\ube74\ube7a\ube53\ube02\ube1e\ubefc\ubee5\ubead\ube9d\ubf7a\ubf46\ubf7a\ubf0c", 48609) + this.IIo() + IO0.I1__("\ubdce", 48609) + n + IO0.I1__("\ubdcf\ube70\ube71\ube59", 48609));
        if (byArray != null) {
            this.IIl1.II(new IO0o(-32).III(n).IIII(byArray.length).II(byArray));
        }
    }

    private void IlO0(int n) {
        byte[] byArray = Res.read(IO0.I1__("\ubd88\ube63\ube70\ube50\ube72\ube04", 48609) + this.IIo() + IO0.I1__("\ubdce", 48609) + n + IO0.I1__("\ubdcf\ube70\ube71\ube59", 48609));
        if (byArray != null) {
            this.IIl1.II(new IO0o(-67).IIII(n).IIII(byArray.length).II(byArray));
        }
    }

    private void II0I(String string) {
        byte[] byArray = Res.read(IO0.I1__("\ubd88\ube6d\ube78\ube61\ube3f\ube05\ubec4\ubed4\ubeb8\ube95\ubf72\ubf19\ubf2d", 48609) + this.IIo() + IO0.I1__("\ubdce", 48609) + string + IO0.I1__("\ubdcf\ube70\ube71\ube59", 48609));
        IO0o iO0o = new IO0o(66).II(string).II(I0I1.IIIl(string));
        if (byArray == null) {
            iO0o.IIII(0);
        } else {
            iO0o.IIII(byArray.length).II(byArray);
        }
        this.IIl1.II(iO0o);
    }

    private void IlOo(int n) {
        byte[] byArray = Res.read(IO0.I1__("\ubd84\ube66\ube79\ube5a\ube3c\ube08\ubefa\ube95\ube9d\ube99\ubf63\ubf57\ubf10\ubf12\ubff5\ubfd7\ubfb2\ubf84\uc050", 48609) + n);
        byte[] byArray2 = Res.read(IO0.I1__("\ubd84\ube66\ube79\ube5b\ube3e\ube08\ubeb4\ubec2", 48609) + this.IIo() + IO0.I1__("\ubdce\ube49\ube72\ube59\ube18\ube1a\ubefd\ubedf\ubeba\ube8c\ubf48", 48609) + n + IO0.I1__("\ubdcf\ube70\ube71\ube59", 48609));
        if (byArray == null || byArray2 == null) {
            return;
        }
        this.IIl1.II(new IO0o(-66).III(n).IIII(byArray.length).II(byArray).II(n == 60 ? 2 : 0).IIII(byArray2.length).II(byArray2));
    }

    private void Il0(int n) {
        byte[] byArray = Res.read(IO0.I1__("\ubd8c\ube6f\ube7d\ube11\ube25", 48609) + this.IIo() + IO0.I1__("\ubdce", 48609) + n);
        if (byArray != null) {
            this.IIl1.II(new IO0o(11).II(n).II(byArray));
        }
    }

    private static /* synthetic */ String I1__(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

