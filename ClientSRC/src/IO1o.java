/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class IO1o {
    static final int l_ll = 0;
    static final int l_l1 = 1;
    static final int l_l_ = 2;
    static final int l_lO = 3;
    static final int l_l0 = 4;
    static final int l_lo = 5;
    static final int l_1 = 6;
    static final int l_1I = 7;
    static final int l_1l = 8;
    static final int l_11 = 9;
    static final int l_1_ = 10;
    static final int l_1O = 11;
    static final int l_10 = 12;
    static final int l_1o = 13;
    static final int l__ = 14;
    static final int l__I = 15;
    static final int l__l = 16;
    static final int l__1 = 17;
    static final int l___ = 18;
    static final int l__O = 19;
    static final Object[][] II = new Object[][]{{IO1o.I1l1("\ucc3b\uccf2\uccdb\uccf9\ucc96\ucd7f\ud39b\ucd25\ucd54\ucdc5\ud375\ucdf1\ucdb2\uce66\uce40\uce25", 52348), IO1o.I1l1("\ucd6c\ud23a\uccce\uccf9\ucc9b\ud3b2\ucd46\ucd75\ucd22\ud354\ucd92\ucd93\ucd99\uce61\uce46", 52348), 10000, 340000L}, {IO1o.I1l1("\ucc2f\ud272\uccd9\uccf9\ucc95\ud3b6\ucd58\ucd3d\ucd54\ucde0\ucddb\ucd3b\ucd85\uce2f\uce4d\ud0e8\uce1c", 52348), IO1o.I1l1("\ucd6c\ud23a\uccce\uccf9\ucc9b\ud3b2\ucd46\ucd75\ucd51\ucda2", 52348), 50, 1500000L}, {IO1o.I1l1("\ucc32\ucc6f\uccd4\uccbe\uccd8\ucd73\ucdd4\ucd3b\ucd54\ucdf0\ucdda\uccd2\ucd9d\uce2f\uce4d\uce25\ud0a5", 52348), IO1o.I1l1("\ucc3f\ucc79\uccc3\uccf9\ucde9\ud3ba\ucd43\ucd75\ucd00\ucdfb\ud315\ucdbf\ucdd0\ucf1e\ud08f\uce39\uce4c\ucee8\ud00f\uceb9\ucec8\ucf32", 52348), 20, 5L}, {IO1o.I1l1("\ucc28\ucce9\ucdb9\uccb4\uccd8\ucd63\ucd44\ud3f8\ucd1a\ucdb3\ucdc6\ucda3\uccf3\uce62\uce0e\uce39\uce04\ud024\ucec4\uceae", 52348), IO1o.I1l1("\ucc28\uccf3\ud215\uccb7\ucc9f\ucd37\ucd07\ucd65\ucd44\ucdb3\ucddc\ucdb6\ucc40\ud0d2\uce47\uce6d\uce07\ucee3\uce4b\uceaa\ucec8\ucf69\ucf4e\ucf24\ucf11", 52348), 20, 100L}, {IO1o.I1l1("\ucc32\ud242\uccd3\uccf9\ucc9b\ucde3\ucd58\ucd32\ucd54\ucdf0\ucdd3\ucdbe\ucdd0\uce6c\ucf9e\ud090\uce02\uceec", 52348), IO1o.I1l1("\ucc3f\uccf3\ucd0a\ud206\ucc96\ucd70\ucd16\ucd67\ucd5a\ucda3\ucd82\ucde1\ucdd0\uce7f\uce46\uceac\uce18", 52348), 10, 2000L}, {IO1o.I1l1("\ucc37\uccf3\uccd3\uccb7\ucc90\ucd37\ucd55\ucda1\ucd1a\ucdf4\ucd92\ucda5\ucd98\uceef\uce40\uce25\uce4c\uceff\ucec2\ud068\uce87", 52348), IO1o.I1l1("\ucc3e\uccfa\uccc3\uccf9\uccca\ucd27\ucd18\ucd65\ucd44\ucda3\ucd92\ucdbc\ucd19\uce7b", 52348), 10, 20000L}, {IO1o.I1l1("\ucc28\uccf3\ud259\uccf9\ucc8b\ucc14\ucd58\ucd75\ucd00\ucdfb\ucddb\ud316\ucd9e\uce2f\uce56\ud0ec", 52348), IO1o.I1l1("\ucc34\ud23a\ucc9a\ucce8\uccd6\ucd27\ucd06\ucd65\ucd54\ucde2\ucdc7\ucd30\ucd99\uce2f\uce5a\uce3f\uce86\ucee5\uce8a\ucea2\uce80\ucff3\ucf48\ucf22", 52348), 10, 1000L}, {IO1o.I1l1("\ucc28\ud236\uccca\uccf9\ucc94\ucd62\ucd4f\ud392\ucd1a\ucdb3\ucdd0\ucd31\ucd99\uce2f\uce4c\ud0ee\uce02", 52348), IO1o.I1l1("\ucc34\ud23a\ucc9a\ucce8\uccd6\ucd27\ucd06\ucd65\ucd54\ucdfd\ucdd5\ucc61\ud32d\uce66\uce0e\uce3f\ucfcd\ucee6", 52348), 10, 1000L}, {IO1o.I1l1("\ucc34\uccf4\ud21b\uccad\uccd8\ucc06\ud3ef\ucd3b\ucd13\ucdb3\ucdd1\ucdb9\uccf3\uce62\uce0e\uce2e\uce04\ud042", 52348), IO1o.I1l1("\ucc3f\uccf3\ucd1b\uccb0\uccd8\ucd7f\ucc97\ucd3b\ucd54\ucda2\ucd80\ucde1\ucdd0\uce68\uce47\ud090", 52348), 20, 120L}, {IO1o.I1l1("\ucc34\ud24c\ucc9a\uccad\ucc8a\ud3f4\ucd16\ucc44\ud3a7\ucdfd\ucdd5\ucdf1\ucce1\ud0d6\uce47", 52348), IO1o.I1l1("\ucc3f\uccf3\uccd5\uccf9\uccc9\ucd27\ucd18\ucd65\ucd44\ucda3\ucd92\uccc0\ud35d\uce7a\uce0e\uce39\uce04\ud02c\ucec4", 52348), 50, 10000L}, {IO1o.I1l1("\ucc28\ucce9\ucc43\uccb4\uccd8\ucd79\ucd5e\ud3e2\ucd00\ucdb3\ucdc4\ucdb4\ucdd0\uce6c\uce46\uce2c\uce05", 52348), IO1o.I1l1("\ucc3e\ucc7a\uccd4\uccf9\ucc9b\ucd7f\ucd59\ucd75\ucd51\ucda1\ucd92\ucde3\ucdc0\uce3f\uce0e\uce20\uce9f\ucee5\uce8a\ucfd8\ud03b", 52348), 10, 200L}, {IO1o.I1l1("\ucc30\ud23c\uccd4\uccf9\ucde9\ud3b0\ucd43\ucd75\ucd1a\ud332\ucdc2\ucdf1\ucd9e\uce68\ud0e3\uce2e", 52348), IO1o.I1l1("\ucc32\ud23a\uccca\uccf9\ucc15\ucd63\ucd16\ucd3b\ucd1c\ud336\ucdc6\ucdf1\ucdc1\uce3a\uce1e\uce6d\uce02\uceec\ud067\uceaa", 52348), 50, 150L}, {IO1o.I1l1("\ucd6c\ucc7a\uccd4\uccb1\uccd8\ucd75\ud397\ucd3c\ucd54\ucde0\ucddb\ucd3b\ucd85\uce2f\uce5f\uce38\uce8d\ucee2", 52348), IO1o.I1l1("\ucc34\ud23a\ucc9a\ucce8\uccc8\ucd27\ucd16\ucd26\ucd1d\ucd79\ucdc7\ucdf1\ucd81\uce7a\ucecf\uce24", 52348), 10, 100L}, {IO1o.I1l1("\ucc28\uccf3\ucc5b\uccb7\ucc90\ucd37\ucd5e\ud386\ucd1d\ucdb3\ucdc1\ucdb8\ucd9e\uce67", 52348), IO1o.I1l1("\ucc34\ud248\uccd3\uccf9\ucc8b\ucd7e\ucd58\ucd3d\ucd54\ucde7\ud313\ucdb8\ucdd0\uce6c\uce46\ud09a\uce4c\uceb9\uce9a\ucef9\ucec8\ucf6b\ud181\ucf2b", 52348), 50, 200L}, {IO1o.I1l1("\ucc37\ud262\ucc9a\uccb7\ucdfb\ucd79\ucd51\ucd75\ucd00\ucdfb\ucd52\ucdbf\ucd98\uce2f\uce5a\uce25\ud0cd\ucee4", 52348), IO1o.I1l1("\ucc38\ucc62\uccd4\uccbe\uccd8\ucd74\ucd5e\ucd3c\ucd9e\ucde6\ucd92\uccc0\ud347\uce6c\uce0e\uce2f\uce05\ud04c\ucede\ucee9\uced9\ucf37\ucf16\ucf75\ucf44\ucfef\ud105\ucfaf", 52348), 20, 1000L}, {IO1o.I1l1("\ucc28\ucce9\ucc43\uccb4\uccd8\ucd79\ucd5e\ud3e2\ucd00\ucdb3\ucddc\ucdb6\ud33d\uce6c", 52348), IO1o.I1l1("\ucc32\uccf3\ud20d\uccad\uccd8\ucd26\ucd06\ucd65\ucd44\ucdb3\ucddc\ucdb6\ud33d\uce6c", 52348), 20, 1000L}, {IO1o.I1l1("\ucd6c\ud23a\uccce\uccf9\uccc9\ucd22\ucd16\ucd21\ucd06\ucdfa\ud375\ucda4\ucdd0\uce7c\ud0c7\uce2e\uce4c\ucee6\ud00b\ucea7\uce80", 52348), IO1o.I1l1("\ucc38\ucc7b\uccd4\uccb1\uccd8\ucd74\ucd5e\ucd3a\ucd54\ucde7\ucd50\ucdbf\ucdd0\uce7b\uce46\ud0aa\uce4c\uceff\ud041\ucee9\uced9\ucf3e\ucf09\ucf72\ucf4b\ucfb1\ucf92\ucff3\ucfd3", 52348), 100, 15000000L}, {IO1o.I1l1("\ucc28\uccee\uccc3\ud21e\ucc8c\ucd37\ucd5d\ud3ac\ucd54\ucde7\ucdda\ucd31\ucd9e\uce67\uce0e\uce39\uce04\ud02a\ucec5", 52348), IO1o.I1l1("\ucc38\ucc62\uccd4\uccbe\uccd8\ucd63\ucd43\ucd2c\ud3b3\ucde7\ucd92\ucdba\ud309\uce2f\uce06\uce3e\uce07\ucee2\ucec6\ucea5\ucec8\ucf73\ucf4e\ud1ac\ucf44\ucfba\ucf8b\ucfe1\ucfd7\ucfc8\ud02a\ud004\ud07c\ud017\uce3d\ud0d7", 52348), 50000, 7749L}, {IO1o.I1l1("\ucc3f\uccf3\ucdb9\uccb4\uccd8\ucd64\ucdc5\ucd36\ucd54\ucc82\ud305\ucdb2\ucdd0\uce6d\uce47\ud08a\uce18", 52348), IO1o.I1l1("\ucd6c\ucd2b\ud259\uccba\uccd8\ucd59\ucd57\ucd38\ud3cb\ucdf0\ucd92\ucdb9\ud323\uce66\uce0e\uce3e\uce05\ucee5\ucec2\ucee9\uceda\ucf4c\ucf06\ucf29\ud1c3\ucfed", 52348), 15, 2000L}, {IO1o.I1l1("\ucc28\ucce9\ucc43\uccb4\uccd8\ucd7c\ud389\ucd21\ucd54\ucdff\ucddb\ud314\ucd85\uce2f\uce6c\uce22\uce1f\ucef8", 52348), IO1o.I1l1("\ucd6c\ucc7a\uccd4\uccb1\uccd8\ucc06\ucdc4\ucd3b\ucd54\ucdf0\ucdc7\ud300\ucd99\uce2f\uce46\ud0ec\uce4c\ucec9\ucec5\uceba\uce9b\ucf27\ucf14\ucf0e\ucf44\ucfef\ud105\ucfaf", 52348), 20, 2000L}};
    private final IO0 II;
    private final IOo_ II;

    IO1o(IO0 iO0, IOo_ iOo_) {
        this.II = iO0;
        this.II = iOo_;
    }

    long II(int n) {
        IOol iOol = this.II.II;
        switch (n) {
            case 0: 
            case 1: 
            case 16: {
                return iOol.IO_l;
            }
            case 2: {
                return iOol._110;
            }
            case 8: {
                return iOol.IIl0[8] / 3600000L;
            }
        }
        return iOol.IIl0[n];
    }

    private boolean II_(int n) {
        return (this.II.II._1O_ & 1 << n) != 0;
    }

    private boolean II_I(int n) {
        return this.II_(n) || this.II(n) >= (Long)II[n][3];
    }

    void II(int n, long l) {
        if (this.II.II != null && n >= 0 && n < II.length) {
            int n2 = n;
            this.II.II.IIl0[n2] = this.II.II.IIl0[n2] + l;
        }
    }

    private static String III0(long l) {
        return l <= 10000L ? String.valueOf(l) : IO0O.IIIo(l);
    }

    private String IIlI(String string) {
        int n = this.II.II.lOlI;
        return string.replace(IO1o.I1l1("\ucc59\uccaa", 52348), n == 0 ? IO1o.I1l1("\ucc2f\uccf2\ucc50\uccac\uccd8\ucd79\ucd5e\ucdb7\ucd1a", 52348) : (n == 1 ? IO1o.I1l1("\ucc2f\uccf2\ucc50\uccac\uccd8\ucd59\ucd57\ucd38\ud3cb\ucdf0", 52348) : IO1o.I1l1("\ucc2f\uccf2\ucc50\uccac\uccd8\ucd4f\ucd57\ucd2c\ucd10\ucdf2", 52348))).replace(IO1o.I1l1("\ucc59\ucca9", 52348), n == 0 ? IO1o.I1l1("\ucc3e\uccee\uccd4\uccb4\ucc99", 52348) : (n == 1 ? IO1o.I1l1("\ucc38\uccfe\uccd4\uccbd\ucc9d", 52348) : IO1o.I1l1("\ucc3d\ucceb\uccca\uccac\ucc94\ucd72", 52348)));
    }

    void IooI() {
        IO0o iO0o = new IO0o(-76).II(0).II(II.length);
        for (int i = 0; i < II.length; ++i) {
            iO0o.II((String)II[i][0]);
            iO0o.II(this.IIlI((String)II[i][1]) + IO1o.I1l1("\ucc5c\uccb3", 52348) + IO1o.III0(this.II(i)) + IO1o.I1l1("\ucc53", 52348) + IO1o.III0((Long)II[i][3]) + IO1o.I1l1("\ucc55", 52348));
            iO0o.III((Integer)II[i][2]);
            iO0o.II(this.II_I(i));
            iO0o.II(this.II_(i));
        }
        this.II.II(iO0o);
    }

    void III1(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        if (by < 0 || by >= II.length) {
            return;
        }
        if (this.II_(by) || this.II(by) < (Long)II[by][3]) {
            return;
        }
        if (!this.II.IIIl.Il00()) {
            this.II.IIIl.IIol(IO1o.I1l1("\ucc3f\ud23c\uccd4\uccf9\ucc8c\ud3c6\ucd5f\ucd75\ucd00\ucdfb\ucddb\ud312\ucd85\uce2f\uce1f\uce6d\uce98\uceab\ucede\ucebb\ud039\ucf69\ucf41\ucf65\ucf0c\ucf63\ucfcc\ucfa9\ucfc0\ucf8b\ud06c\ud05c\ud032\ud01c\ud0ba\ud1a8\uce1b\ud0d7\ud178\ud15d\ucff9\ud11d\ud1b2\ud1c5\ud1b8\ud05f\uccd1\ud243\ud22b", 52348));
            return;
        }
        int n = (Integer)II[by][2];
        this.II.II._1O_ |= 1 << by;
        this.II.II._lO += n;
        this.II.IIIl.l1_l();
        this.II.IIIl.l1_();
        this.II.IIIl.IIol(IO1o.I1l1("\ucc3e\ud23a\uccd4\uccf9\ucc8e\ud3fc\ucd57\ucd75\ucd1a\ucdfb\ud31f\ucdbf\ucdd0\ucf1e\ucf9e\ud0ae\uce0f\uceab", 52348) + n + IO1o.I1l1("\ucc5c\uccf5\uccdd\ud214\ucc9b\ucd39", 52348));
        this.II.II(new IO0o(-76).II(1).II(by));
        this.II.I__O();
    }

    void II(int n, int n2, boolean bl) {
        if (bl) {
            this.II(12, 1L);
        }
        if (n2 == 4) {
            this.II(6, 1L);
        }
        if (n == 0) {
            this.II(7, 1L);
        }
    }

    void Ill1(int n) {
        switch (n) {
            case 1: 
            case 3: 
            case 5: {
                this.II(4, 1L);
                break;
            }
            case 0: 
            case 2: 
            case 4: 
            case 9: 
            case 17: 
            case 20: {
                break;
            }
            default: {
                this.II(14, 1L);
            }
        }
    }

    private static /* synthetic */ String I1l1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

