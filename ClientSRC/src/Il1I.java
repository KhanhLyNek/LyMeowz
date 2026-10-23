/*
 * Decompiled with CFR 0.152.
 */
import static II.II;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Il1I
extends IIII
implements I1_1,
I1__ {
    private static Il1I II;
    private Il_l.II IIlI = new Il_l.II();
    private II II;
    public Il_l.II IIll = new Il_l.II();
    public Il_l.II IIl1 = new Il_l.II();
    private boolean Il0 = false;
    private String[] III1 = new String[]{Il1I.II__("\ue50c\ue509\ufb2d\ue5ef\ue59e\ue5b9\ue599\ue677\ue65b\ue620", 58690), Il1I.II__("\ue525\ue508\ue562\ue5e6", 58690)};
    private static final long IIo0 = 100L;

    public static Il1I II() {
        if (II == null) {
            II = new Il1I();
        }
        return II;
    }

    public static Il1I III() {
        return Il1I.II();
    }

    private Il1I() {
    }

    @Override
    protected void II1l() {
        this.IIOI();
        this.IIlo();
    }

    @Override
    protected void II11() {
        this.IIOl();
    }

    @Override
    protected void II1_() {
        if (II.IIIO % 5 == 0) {
            this.I_O0();
        }
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    private void I_O0() {
        if (this.IIlI.IIlO() <= 0) {
            return;
        }
        for (int i = 0; i < this.IIlI.IIlO(); ++i) {
            II iI = (II)this.IIlI.II(i);
            if (!IlOl.II(iI.IIoo, (long)iI.I1l_ * 1000L)) continue;
            iI.IIoo = IlOl.IIII();
            I_0_.II().II((byte)0, (byte)1, (byte)-1, (short)iI.I1ll);
            break;
        }
    }

    @Override
    public void II(String string, String string2) {
        String string3 = Ilo_.II().II.IIl1();
        if (Il_o.III1(string3) || Il_o.III1(string)) {
            this.Illl();
            return;
        }
        if (Ilo_.II().II00.equals(this.III1[0])) {
            this.IIl0(string3);
        }
    }

    @Override
    public void Illl() {
        Ilo_ ilo_ = Ilo_.II();
        ilo_.II00 = Il1I.II__("\ue501\ue509\ue5e1\ue5eb", 58690);
        ilo_.II.II1o = Il1I.II__("\ue521\ue509\ue5e1\ue5eb", 58690);
        ilo_.II.IIOl("");
        ilo_.I_10 = false;
        ilo_.II = I1_I.II();
        ilo_.III0 = null;
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                this.II((II)object);
                break;
            }
            case 2: {
                this.IIl1((Integer)object);
                break;
            }
            case 4: {
                this.IIll.III(((I101)object).IIIo());
                this.IIOl();
                break;
            }
            case 5: {
                this.IIl1.III(((I101)object).IIIo());
                this.IIOl();
                break;
            }
            case 6: {
                this.II(this.IIll, ((I101)object).IIIo());
                this.IIOl();
                break;
            }
            case 7: {
                this.II(this.IIl1, ((I101)object).IIIo());
                this.IIOl();
                break;
            }
            case 8: {
                this.IIl_(0);
                this.II_I();
                break;
            }
            case 9: {
                this.IIl_(1);
                this.II_I();
                break;
            }
            case 10: {
                this.I_0I();
                break;
            }
            case 11: {
                this.I_0();
                this.II_I();
                break;
            }
            case 20: {
                IlI.III().I_11();
            }
        }
    }

    private void II(Il_l.II iI, String string) {
        for (int i = 0; i < iI.IIlO(); ++i) {
            String string2 = (String)iI.II(i);
            if (!string2.equals(string)) continue;
            iI.III(i);
            return;
        }
    }

    private void IIl0(String string) {
        try {
            int n;
            this.II.I1l_ = n = Integer.parseInt(string);
            this.IIIl(Il1I.II__("\ue503\ue514\ue5f4\ue5f0\ue59e", 58690) + this.II.II_ + Il1I.II__("\ue578\ue541", 58690) + n + Il1I.II__("\ue562\ue506\ue5e9\ue57d\ue5c7", 58690));
            this.IIlI.III(this.II);
        }
        catch (Exception exception) {
            this.IIIl(Il1I.II__("\ue506\ue504\ue5ec\ue5fe\ue5c7\ue5fd\ue5b7\ue673\ue6ce\ue637\ue61f\ue6b7\ue6fe\uf836\ue684\ue733\ue77e\uf996\ue75c\ue7af\ue7f8\ue7b8\ue785\ue82b\ue866\ue8bb\ue806\ue8e0\ue886\ue88b\ue88c\uf7ae\ue952\ue961\ue92c\uf7de\ue9f7\ue99c", 58690));
        }
        this.I_Oo();
    }

    private void I_Oo() {
        Ilo_ ilo_ = Ilo_.II();
        ilo_.II00 = Il1I.II__("\ue501\ue509\ue5e1\ue5eb", 58690);
        ilo_.II.II1o = Il1I.II__("\ue521\ue509\ue5e1\ue5eb", 58690);
        ilo_.I_10 = false;
        ilo_.II = null;
    }

    public boolean IIIo(int n) {
        for (int i = 0; i < this.IIlI.IIlO(); ++i) {
            II iI = (II)this.IIlI.II(i);
            if (iI.I1ll != n) continue;
            return true;
        }
        return false;
    }

    private void IIl1(int n) {
        for (int i = 0; i < this.IIlI.IIlO(); ++i) {
            II iI = (II)this.IIlI.II(i);
            if (iI.I1ll != n) continue;
            this.IIlI.III(i);
            this.IIIl(Il1I.II__("\ue452\ue582\ue5a0\ue5f1\ue5d9\ue46d\ue592\ue67c\ue61a\ue618\ue60d\ue6e3\ue6d9", 58690));
            break;
        }
    }

    private void II(II iI) {
        this.II = iI;
        Ilo_ ilo_ = Ilo_.II();
        ilo_.II00 = this.III1[0];
        ilo_.II.II1o = this.III1[1];
        II.II.I_10 = false;
        ilo_.II1o("");
        ilo_.II = this;
    }

    public void IIl_(int n) {
        if (this.Il0) {
            this.IIIl(Il1I.II__("\ue452\ue500\ue5ee\ue5f8\ue59e\ue590\ufb4b\ue678\ue61a\ue749\uf8ab\ue6b6", 58690));
            return;
        }
        IlO.II(new Il1l(this, n));
    }

    private void III(Il_l.II iI) {
        if (this.Il0) {
            this.IIIl(Il1I.II__("\ue452\ue500\ue5ee\ue5f8\ue59e\ue590\ufb4b\ue678\ue61a\ue749\uf8ab\ue6b6", 58690));
            return;
        }
        this.Il0 = true;
        try {
            for (int i = Ilol.II().II.length - 1; i >= 0; --i) {
                I101 i101 = Ilol.II().II[i];
                if (i101 == null || !this.II(iI, i101.IIIo())) continue;
                I_0_.II().III((byte)4, (byte)i);
                IlO.IIIl(100L);
            }
            this.IIIl(Il1I.II__("\ue452\ue582\ue5a0\ue5f2\ufb09\ue5be\ue5dc\ue663\ue655\ue637\ue61f\ue6b6", 58690));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.Il0 = false;
    }

    private boolean II(Il_l.II iI, String string) {
        for (int i = 0; i < iI.IIlO(); ++i) {
            String string2 = (String)iI.II(i);
            if (!string2.equals(string)) continue;
            return true;
        }
        return false;
    }

    private void I_0() {
        this.IIll.I_1O();
        this.IIl1.I_1O();
        this.IIOl();
        this.IIIl(Il1I.II__("\ue452\ue582\ue5a0\ue5e7\ue54d\ue5bc\ue5dc\ue66f\ue655\ue6b9\ue616\ue6b7\ue6d4\uf80c\ue6d4\ue740\ue757\ue725", 58690));
    }

    public void II_I() {
        Il1_.II().III().II(Il1I.II__("\ue50f\ue504\ue5ee\ue5ea\ue59e\ue58e\ue599\ue66f\ue61a\ue749\uf8ab", 58690)).II(Il1I.II__("\ue50f\ufbd6\ue5e3\ue5bf\ue5ed\ue5b8\ue588\ue63b\ue60b", 58690), this.II(this.IIll), 8, null).II(Il1I.II__("\ue50f\ufbd6\ue5e3\ue5bf\ue5ed\ue5b8\ue588\ue63b\ue608", 58690), this.II(this.IIl1), 9, null).II(Il1I.II__("\ue51a\ue504\ue5ed\ue5bf\ue5ed\ue5b8\ue588\ue63b\ue72a\uf88a", 58690), "", 10, null).II(Il1I.II__("\ue51a\ue592\ue5e1\ue5bf\ue5ea\ue5b2\ue51c\ue675\ue61a\ue61b\uf8a1", 58690), "", 11, null).II(Il1I.II__("\ue513\ue514\ue5e1\ue5e6\ue59e\ue5b1\ufb5d\ue672", 58690), "", 20, null).II(this).I__0();
    }

    private String II(Il_l.II iI) {
        return iI.IIlO() == 0 ? Il1I.II__("\ue56a\ue535\ue5f2\ufb4e\ue5d0\ue5ba\ue5d5", 58690) : Il1I.II__("\ue56a", 58690) + iI.IIlO() + Il1I.II__("\ue562\ue50c\ue573\ue5f1\ue597", 58690);
    }

    private void I_0I() {
        String string;
        String[] stringArray;
        String string2;
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Il1I.II__("\ue57f\ue55c\ue5bd\ue5bf\ue5ed\ue598\ue5a8\ue63b\ue60b\ue679\ue645\ue6aa\ue68b\ue6df", 58690));
        if (this.IIll.IIlO() == 0) {
            stringBuilder.append(Il1I.II__("\ue56a\ue535\ue5f2\ufb4e\ue5d0\ue5ba\ue5d5\ue611", 58690));
        } else {
            for (n = 0; n < this.IIll.IIlO(); ++n) {
                string2 = (String)this.IIll.II(n);
                stringArray = Il_o.II(string2, '\n');
                string = stringArray[0];
                stringBuilder.append(Il1I.II__("\ue56f\ue541", 58690)).append(string).append(Il1I.II__("\ue548", 58690));
            }
        }
        stringBuilder.append(Il1I.II__("\ue548\ue55c\ue5bd\ue5a2\ue59e\ue58e\ue5b9\ue64f\ue61a\ue66b\ue658\ue6aa\ue68b\ue6e8\ue6fe", 58690));
        if (this.IIl1.IIlO() == 0) {
            stringBuilder.append(Il1I.II__("\ue56a\ue535\ue5f2\ufb4e\ue5d0\ue5ba\ue5d5", 58690));
        } else {
            for (n = 0; n < this.IIl1.IIlO(); ++n) {
                string2 = (String)this.IIl1.II(n);
                stringArray = Il_o.II(string2, '\n');
                string = stringArray[0];
                stringBuilder.append(Il1I.II__("\ue56f\ue541", 58690)).append(string);
                if (n >= this.IIl1.IIlO() - 1) continue;
                stringBuilder.append(Il1I.II__("\ue548", 58690));
            }
        }
        II(stringBuilder.toString());
    }

    private void IIIl(String string) {
        I1_I.II.IIII(string, 0);
    }

    private void IIOI() {
        Object object;
        String string = IlIO.IIII(Il1I.II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue60b", 58690), "");
        if (!Il_o.III1(string)) {
            object = Il_o.II(string, '|');
            this.IIll.I_1O();
            for (int i = 0; i < ((String[])object).length; ++i) {
                if (Il_o.III1(object[i])) continue;
                this.IIll.III(object[i]);
            }
        }
        if (!Il_o.III1((String)(object = IlIO.IIII(Il1I.II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue608", 58690), "")))) {
            String[] stringArray = Il_o.II((String)object, '|');
            this.IIl1.I_1O();
            for (int i = 0; i < stringArray.length; ++i) {
                if (Il_o.III1(stringArray[i])) continue;
                this.IIl1.III(stringArray[i]);
            }
        }
    }

    private void IIOl() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.IIll.IIlO(); ++i) {
            stringBuilder.append((String)this.IIll.II(i));
            if (i >= this.IIll.IIlO() - 1) continue;
            stringBuilder.append(Il1I.II__("\ue53e", 58690));
        }
        IlIO.IIII(Il1I.II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue60b", 58690), stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < this.IIl1.IIlO(); ++i) {
            stringBuilder2.append((String)this.IIl1.II(i));
            if (i >= this.IIl1.IIlO() - 1) continue;
            stringBuilder2.append(Il1I.II__("\ue53e", 58690));
        }
        IlIO.IIII(Il1I.II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue608", 58690), stringBuilder2.toString());
    }

    static /* synthetic */ void II(Il1I il1I, Il_l.II iI) {
        il1I.III(iI);
    }

    private static /* synthetic */ String II__(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    public static class II {
        public int I1ll;
        public String II_;
        public int I1l1;
        public short III;
        public boolean Il0I;
        public boolean Il0l;
        public int I1l_;
        public long IIoo;

        public II() {
        }

        public II(int n, String string) {
            this.I1ll = n;
            this.II_ = string;
        }

        public II(int n, short s, boolean bl, boolean bl2) {
            this.I1ll = n;
            this.III = s;
            this.Il0I = bl;
            this.Il0l = bl2;
        }
    }
}

