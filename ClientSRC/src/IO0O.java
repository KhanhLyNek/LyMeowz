/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class IO0O {
    static final int _III = 54;
    static final int _IIl = 8100;
    static final int _II1 = 8101;
    static final int _II_ = 8200;
    static final int _IIO = 8201;
    static final int _II0 = 8202;
    static final int _IIo = 8210;
    static final int _Il = 8211;
    static final int _IlI = 8212;
    static final int _Ill = 8220;
    static final int _Il1 = 8221;
    static final int _Il_ = 8222;
    static final int _IlO = 8223;
    static final int _Il0 = 7;
    static final int _Ilo = 0;
    static final int _I1 = 39;
    static final int _I1I = 100000;
    static final int _I1l = 100;
    static final int _I11 = 60000;
    static final int _I1_ = 50;
    static final int _I1O = 10;
    static final int _I10 = 300000;
    private final IO0 IIlO;
    private final IOo_ IIlO;
    private final Random IIl_ = new Random();
    private int _I1o = 0;
    boolean IoO;
    private long I_11;
    private long I_1_;
    private final Vector[] III;
    private final long[] IIIO;
    private int _I_ = -1;
    private final long[][] III = new Vector[]{new Vector(), new Vector()};
    private final long[][] IIII;
    private final long[] III0;
    private static final String[] IlOl = new String[]{IO0O.I1O("\uddb8\udefb\ude5e", 56819), IO0O.I1O("\uddb1\udee8\ude50", 56819), IO0O.I1O("\uddb1\ude73\ude5e", 56819), IO0O.I1O("\udce3\uc0c7\ude58\ude5a\ude02\uc067\udece\udeec\ude88\udeba\uc1ca\udf2b", 56819), IO0O.I1O("\uddbd\ude75\ude59\uc099\ude4f\udeed\udec5\udf6d\ude82", 56819)};
    private static final String[] IlO1 = new String[]{IO0O.I1O("\uddb8\udefb\ude5e", 56819), IO0O.I1O("\uddb1\udee8\ude50", 56819), IO0O.I1O("\uddb1\ude73\ude5e", 56819)};

    IO0O(IO0 iO0, IOo_ iOo_) {
        this.IIIO = new long[]{-1L, -1L};
        this.III = new long[2][2];
        this.IIII = new long[2][2];
        this.III0 = new long[]{-1L, -1L};
        this.IIlO = iO0;
        this.IIlO = iOo_;
    }

    static String IIIo(long l) {
        String string = String.valueOf(Math.abs(l));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            if (i > 0 && (string.length() - i) % 3 == 0) {
                stringBuilder.append('.');
            }
            stringBuilder.append(string.charAt(i));
        }
        return (l < 0L ? IO0O.I1O("\uddde", 56819) : "") + stringBuilder;
    }

    private boolean IIlO(int n, int n2) {
        return this.IIl_.nextInt(n2) < n;
    }

    private int IIl1(int n, int n2) {
        return n + this.IIl_.nextInt(n2 - n + 1);
    }

    private int II10(int n) {
        int n2 = 0;
        IO0l[] iO0lArray = this.IIlO.II.III;
        for (int i = 0; i < iO0lArray.length; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            n2 += iO0lArray[i].lo0I;
        }
        return n2;
    }

    private void II1O(int n, int n2) {
        IO0l[] iO0lArray = this.IIlO.II.III;
        for (int i = 0; i < iO0lArray.length && n2 > 0; ++i) {
            if (iO0lArray[i].II1_() || iO0lArray[i].I1l != n) continue;
            if (iO0lArray[i].lo0I > n2) {
                iO0lArray[i].lo0I -= n2;
                n2 = 0;
                continue;
            }
            n2 -= iO0lArray[i].lo0I;
            iO0lArray[i] = new IO0l();
        }
    }

    void ll0I() {
        IOol iOol = this.IIlO.II;
        this.IIlO.II.IIII(19, 8100, IO0O.I1O("\uddb0\ude7d\ude5f\ude70\ude02\udefb\uc07c\udea2\udecb\udf66\udfc9\udf25\udf47\udfe1\udf49\udfe4\udf8d\ue0e2\ue04e\ue07f", 56819), new String[]{IO0O.I1O("\udda2\ude67\ude50\ude29\ude4f\udeec\uc01c\udea2\ude8c\udf00\udf5f\udfa8\udf09\udfe1", 56819), IO0O.I1O("\udda5\udee0\ude5f\ude37\ude4f\udeff\uded8\udead\ude92\udf00\ude38\uc1ff\udf04\udfa6\udfc7\udfad\uc124\ue076", 56819), IO0O.I1O("\udda1\udfa2\udf90\ude3e\ude08\udeae\udedd\udea4\uc00e\udf00\udf01", 56819) + iOol.II11.size() + IO0O.I1O("\uddd3\ude7f\udec2\ude3e\ude46", 56819), IO0O.I1O("\uddab\udee1\ude50\ude70\ude07\uc031\uded9\udec6\ude9f\udf78\udf46\udf26\udf00\udfa6\udfd7\ude74\ude42\ue06c\ue046", 56819), IO0O.I1O("\udce3\udee1\ude5f\ude37", 56819)});
    }

    boolean IIl0(int n, int n2) {
        if (n == 8100) {
            if (n2 == 0) {
                this.IIIl(0, false);
            } else if (n2 == 1) {
                this.IIIl(7, true);
            } else if (n2 == 2) {
                this.ll0l();
            } else if (n2 == 3) {
                this.IIlO.II.IIII(19, 8101, IO0O.I1O("\uddb0\ude7d\ude5f\ude70\ude0c\ude7d\ude8d\udeaf\ude83\uc1a5\udf4a\udf68\udf0a\udff3\uc174\udfaa\udfc3\ue07a\ue0d2\ue021\ue07f\ue016\ufe22\ue0c8\ue0fb\ue08c\uffb4\ue14c\ue177\ue106\ue1fd\uff1d\ue1be\ue1d2\ue265\ue242\ue220\ue200\ue2ea\ue28c\ue2b9\ue35a\ue2a8\ue346\ue320\ue346\ue3f5\ue3cc\ufd26\ue3dd\ue421\ue473\ue45e\ue42b\ue45d\ue4f7\ue4d3\ue4b3\ue4d9\ue560\ue5c4\ue537\ue555\ue5e7\ufb0e\ue5f2\ue59a\ue678\ue6db\ue620\ue60a\ue6ac\ue6df\ue6a2\uf82a\ue728\ue74c\ue72e\ue791\ue7ed\ue783\ue7b2\ue789\uf6e5\ue87c\ue81f", 56819), new String[]{IO0O.I1O("\udce3\uc0c1\ude5f\ude37\ude4f\ude73", 56819), IO0O.I1O("\uddbb\uc0f5\ude48\ude70\ude0d\uc041", 56819)});
            }
            return true;
        }
        if (n == 8101) {
            if (n2 == 0) {
                this.IIlO.II.II11.removeAllElements();
                this.IIlO.IIIl.IIol(IO0O.I1O("\udce3\udef1\ude11\ude28\ude9c\udeef\ude8d\udea4\uc054\udf7e\udf09\udf3e\uc1ca\udff2\udf85\udfb4\udf8b\ufeab\ue04c\ue060\ue02b\ue00c\ue0f2\ue0d2\ue0bc\ue0da\ue16b\ue088\ue0f6\ue118\ue1f2", 56819));
                this.IIlO.I__O();
            }
            return true;
        }
        return false;
    }

    private void IIIl(int n, boolean bl) {
        this._I1o = n;
        IO0o iO0o = new IO0o(-127).II(0).II(7);
        for (int i = 0; i < 7; ++i) {
            iO0o.III(bl ? 419 : 419 + i);
        }
        iO0o.II(n).IIII(n == 7 ? 39 : 100000).III(-1);
        this.IIlO.II(iO0o);
    }

    void III1(DataInputStream dataInputStream) {
        int n;
        try {
            dataInputStream.readByte();
            n = dataInputStream.readByte();
        }
        catch (IOException iOException) {
            this.IIIl(this._I1o, this._I1o == 7);
            return;
        }
        if (n <= 0 || n > 7) {
            this.IIIl(this._I1o, this._I1o == 7);
            return;
        }
        IOol iOol = this.IIlO.II;
        if (this._I1o == 7) {
            int n2 = n * 39;
            if (iOol.lOoO < n2) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udfe8\udfc2\uc109\udf80\ue022\ue130\ufe83\ue07f\ue013\ufe42", 56819));
                return;
            }
            if (n + iOol.II11.size() > 100) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\udda1\udfa2\udf90\ude3e\ude08\udeae\udedd\udea4\uc00e\udf2a\ude38\udfab\udf47\ude97\uc102\udfbd", 56819));
                return;
            }
            iOol.lOoO -= n2;
        } else {
            long l = (long)n * 100000L;
            if (iOol.Il11 < l) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udff0\udf45\udfaa\udf84\ue022\ue130\ufe83\ue07f\ue013\ufe42", 56819));
                return;
            }
            if (n + iOol.II11.size() > 100) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\udda1\udfa2\udf90\ude3e\ude08\udeae\udedd\udea4\uc00e\udf2a\ude38\udfab\udf47\ude97\uc102\udfbd", 56819));
                return;
            }
            iOol.Il11 -= l;
        }
        Vector<IO0l> vector = new Vector<IO0l>();
        for (int i = 0; i < n; ++i) {
            IO0l iO0l = this.III_();
            vector.addElement(iO0l);
            iOol.II11.addElement(iO0l);
        }
        IO0o iO0o = new IO0o(-127).II(1).II(vector.size());
        for (int i = 0; i < vector.size(); ++i) {
            IOO.III iII = IOO.II(((IO0l)vector.elementAt((int)i)).I1l);
            iO0o.III(iII == null ? 0 : iII.lOo0);
        }
        this.IIlO.II(iO0o);
        this.IIlO.IIIl.l1_();
        this.IIlO.I__O();
    }

    private IO0l IIII(int n, int n2) {
        return new IO0l(189, this.IIl1(n, n2) * 1000);
    }

    private IO0l IIII(int n) {
        IO0l iO0l = new IO0l(n, 1);
        iO0l.III(50, this.IIl1(10, 15)).III(77, this.IIl1(10, 15)).III(103, this.IIl1(10, 15)).III(154, 0);
        if (!this.IIlO(1, 100)) {
            iO0l.III(93, this.IIl1(3, 15));
        }
        return iO0l;
    }

    private IO0l III_() {
        IO0l iO0l = this.IIII(5, 50);
        boolean bl = this.IIlO(1, 2);
        if (this.IIlO(1, 2)) {
            if (this.IIlO(5, 100)) {
                iO0l = this.IIII(1208);
            } else if (this.IIlO(5, 100)) {
                iO0l = this.IIII(1209);
            } else if (this.IIlO(5, 100)) {
                iO0l = this.IIII(1210);
            } else if (this.IIlO(5, 100)) {
                iO0l = new IO0l(884, 1);
                iO0l.III(5, this.IIl1(10, 30)).III(50, this.IIl1(3, 9)).III(77, this.IIl1(3, 9)).III(103, this.IIl1(3, 9)).III(154, 0);
                if (!this.IIlO(1, 100)) {
                    iO0l.III(93, this.IIl1(1, 7));
                }
            } else if (this.IIlO(5, 100)) {
                iO0l = new IO0l(860, 1);
                iO0l.III(50, this.IIl1(0, 18)).III(77, this.IIl1(0, 18)).III(117, 10).III(154, 0);
                if (!this.IIlO(1, 100)) {
                    iO0l.III(93, this.IIl1(3, 7));
                }
            } else if (this.IIlO(1, 100)) {
                iO0l = new IO0l(955, 1);
                iO0l.III(50, this.IIl1(1, 7)).III(77, this.IIl1(1, 7)).III(103, this.IIl1(1, 7));
                if (!this.IIlO(1, 100)) {
                    iO0l.III(93, this.IIl1(3, 7));
                }
            } else if (this.IIlO(5, 1000)) {
                iO0l = new IO0l(956, 1);
            }
        } else {
            boolean bl2 = false;
            if (this.IIlO(1, 2)) {
                int[] nArray;
                int[] nArray2 = new int[]{467, 468, 469, 470, 471, 741, 745, 800, 801, 803, 804, 1000};
                int n = nArray2[this.IIl_.nextInt(nArray2.length)];
                if (this.IIlO(20, 100)) {
                    nArray = new int[]{467, 468, 469, 470, 471, 741, 745, 800, 801, 803, 804, 999, 1000, 1001};
                    n = nArray[this.IIl_.nextInt(nArray.length)];
                }
                nArray = new int[]{77, 80, 81, 103, 50, 94, 5};
                iO0l = new IO0l(n, 1);
                iO0l.III(nArray[this.IIl_.nextInt(7)], this.IIl1(3, 7)).III(30, 0).III(93, this.IIl1(1, 15));
            } else if (this.IIlO(1, 100)) {
                iO0l = new IO0l(this.IIl1(18, 20), this.IIl1(1, 5));
            } else if (this.IIlO(1, 3000)) {
                iO0l = new IO0l(this.IIl1(220, 224), this.IIl1(1, 3));
            } else if (this.IIlO(1, 1000)) {
                iO0l = new IO0l(this.IIl1(828, 842), this.IIl1(1, 3));
            }
            if (!bl) {
                iO0l = this.IIII(5, 12);
            }
        }
        if (iO0l.I1l != 189 && IOO.II(iO0l.I1l) == null) {
            iO0l = this.IIII(5, 12);
        }
        return iO0l;
    }

    void ll0l() {
        this.IoO = true;
        Vector vector = this.IIlO.II.II11;
        IO0o iO0o = new IO0o(-44).II(4).II(1).II(IO0O.I1O("\udda3\ude7a\uc096\ude3e\ude65\udefa\udec5\udf7c\uc034\udf64\udf4e", 56819)).II(vector.size());
        for (int i = 0; i < vector.size(); ++i) {
            IO0l iO0l = (IO0l)vector.elementAt(i);
            iO0o.III(iO0l.I1l).II(IO0O.I1O("\udd8f\ude25\ude4d\ude70\ude23\udedb\udeee\ude87\udeb2\udf2a\udf7b\udf0d\udf30\udfc7\udff7\udf80", 56819)).II(iO0l.IIl.size() + 1);
            for (int j = 0; j < iO0l.IIl.size(); ++j) {
                int[] nArray = (int[])iO0l.IIl.elementAt(j);
                iO0o.II(nArray[0]).III(nArray[1]);
            }
            iO0o.II(31).III(iO0l.lo0I);
            iO0o.II(1).II(0);
        }
        this.IIlO.II(iO0o);
    }

    boolean IIlo(int n, int n2) {
        if (!this.IoO) {
            return false;
        }
        Vector vector = this.IIlO.II.II11;
        if ((n2 < 0 || n2 >= vector.size()) && n != 2) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\uddb8\ude7a\udec5\ude3e\ude08\udeae\uded9\udea4\uc028\udf2a\udf5d\udf20\uc196\udfe5\udf85\udfac\udf8a\ufec5\ue04f", 56819));
            return true;
        }
        if (n == 0) {
            IO0l iO0l = (IO0l)vector.elementAt(n2);
            if (!this.IIIO(iO0l)) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\uddbb\udef2\ude5f\ude38\ude4f\udefa\udedf\udead\ude85\udf6d\udf09\ude59\udf84\udfa6\udeb4\uc163\udf9a", 56819));
                return true;
            }
            vector.removeElementAt(n2);
        } else if (n == 1) {
            vector.removeElementAt(n2);
            this.IIlO.IIIl.IIol(IO0O.I1O("\uddab\udee1\ude50\ude70\ude19\uc023\uded9\udeec\ude9b\udf62\uc180\udf25\udf47\udff2\udfcd\udf24\udf8d\ue06a\ue001\ue023\ue0ab\ue010\ue0fa", 56819));
        } else if (n == 2) {
            for (int i = vector.size() - 1; i >= 0; --i) {
                if (!this.IIIO((IO0l)vector.elementAt(i))) continue;
                vector.removeElementAt(i);
            }
        }
        this.IIlO.IIIl.l1_l();
        this.IIlO.IIIl.l1_();
        this.IIlO.I__O();
        this.ll0l();
        return true;
    }

    private boolean IIIO(IO0l iO0l) {
        if (iO0l.I1l == 189) {
            this.IIlO.II.Il11 += (long)iO0l.lo0I;
            this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude01\udee6\uc000\udea2\udecb\ude1b\ude99\uc1ab\udf04\udfa6", 56819) + IO0O.IIIo(iO0l.lo0I) + IO0O.I1O("\uddd3\ude64\uded1\ude3e\ude08", 56819));
            return true;
        }
        if (!this.IIlO.IIIl.III0(iO0l)) {
            return false;
        }
        IOO.III iII = IOO.II(iO0l.I1l);
        this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude01\udee6\uc000\udea2\udecb\ude1b\ude99\uc1ab\udf04\udfa6", 56819) + (iII == null ? IO0O.I1O("\udd85\uc0bf\ude45\ude70\ude1f\udee6\uc004\udea1", 56819) : iII.II1o));
        return true;
    }

    boolean II00(int n) {
        if (n != 54 || this.IIlO.II.lOlo != 5) {
            return false;
        }
        this.IIlO.II.IIII(54, 8200, IO0O.I1O("\uddbe\ude7b\ude5f\ude39\ude4f\udee9\udecc\udea1\ude8e\udf24", 56819), new String[]{IO0O.I1O("\uddb8\udefb\ude5e\ude5a\ude2d\ude74\udecc\udec6\udea9\udf6b\udf46", 56819), IO0O.I1O("\uddb0\ude7d\ude5f\ude70\ude1c\uc05f\udea7\udea1\ude8a\udf73\udf09\udf25\uc1c8\udfe8\udfaf\udfb0\udf8b\ufecd\ue048\ue060\ue029\ue09e\ue0f3\ue0db", 56819), IO0O.I1O("\uddb0\ude7d\ude5f\ude70\ude1c\uc05f\udea7\udea1\ude8a\udf73\udf09\udf25\uc1c8\udfe8\udfaf\udfaa\udf84\ufecf\ue042\ue060\ue027\ue01f\ue0f3\ue0d4", 56819), IO0O.I1O("\uddb0\ude7a\uc0fc\ude3e\ude4f\udeef\udec4\udeec\udffa\udfe8\udf50", 56819), IO0O.I1O("\udce3\udee1\ude5f\ude37", 56819)});
        return true;
    }

    boolean III1(int n, int n2, int n3) {
        if (n == 19) {
            return this.IIl0(n2, n3);
        }
        if (n != 54) {
            return false;
        }
        switch (n2) {
            case 8200: {
                if (n3 == 0) {
                    this.II0l(IO0O.I1O("\uddbb\udef1\ude48\ude70\ude0c\udee6\uc060\udea2\udecb\udf67\uc1c0\udf2b\udf47\udfe5\ude15\uc127\udf80\ue02c", 56819));
                } else if (n3 == 1) {
                    this.Il0O(0);
                } else if (n3 == 2) {
                    this.Il0O(1);
                } else if (n3 == 3) {
                    this.IIlO.II.IIII(54, 8220, IO0O.I1O("\udda7\ude60\udec3\ude70\ude0c\udee6\udf0c\udea5\udecb\udf49\udf41\uc185\udf09\udfa6\udfe4\udfad\udfc3\ue112\ue0c3\ue039\ue07f\ue16f\ue0fc\ue0d2\ue0bc\ue0da\ue008\ue088\uffb4\ue115\ue1b5\ue1d0\ue1ba\uff37\ue27f\ue210\ue23d\ue20f\ue2a1\ue28c\ue2a5\ufc55\ue37c\ue308\ue325\ufdc7\ue3eb\ue384\ue3b7\ue38b\ue46f\ue400\ue44b\ue5ee\ufaa2\ue4f2\ue4dc\ue4fa\ue494\ue5f4\ue559\ue53e\ue555\ue485\ue5d2\ue5bc\ue596\ue630\ue65b\ue63c\ue68d\ue6e2\ue68b\ue7db\uf84e\ue771\ue707\ue72b\ue704\ue7fd\ue783\ue7af\uf94e\ue86e\ue83f\ue84a\ue835\ue890\ue8bb\ue8d9\ue82a\ue8d8\ue963\ue95e\uf796\ue954\ue9e7\ue9da\ue9b0\ue99d\uea2f\uea49\uea24\uea0d\ueaab\ueade\ueaa1\uf405", 56819), new String[]{IO0O.I1O("\udda7\ude7a\uc0f2\ude70\ude03\uc049", 56819), IO0O.I1O("\uddb0\ude7a\uc0fc\ude3e\ude65\uded8\ude4d\udea2\ude8c", 56819), IO0O.I1O("\uddb0\ude7a\uc0fc\ude3e\ude65\udee0\udeca\uc001\ude88\udf2a\udf51\udf29\udf09\udfee", 56819)});
                }
                return true;
            }
            case 8201: {
                long l;
                long l2 = n3 == 0 ? 1000000L : (n3 == 1 ? 5000000L : (l = n3 == 2 ? 10000000L : 0L));
                if (l == 0L) {
                    return true;
                }
                if (this.IIlO.II.Il11 < l) {
                    this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udff0\udf45\udfaa\udf84\ue022\ue130\ufe83\ue07f\ue01d\ue0f5\ue11d\ue0b2\ue0db", 56819));
                    return true;
                }
                this.I_11 = l;
                this.I_1_ = System.currentTimeMillis() + 15000L;
                this.Il01(15);
                this.IIlO.II.IIII(54, 8202, IO0O.I1O("\uddbe\uc0fb\ude52\ude70\ude19\ude6e\udec3\udeab\udecb\udf69\ude99\uc1ab\udf04\udfbc\udf85", 56819) + IO0O.IIIo(l) + IO0O.I1O("\uddd3\ude64\uded1\ude3e\ude08\ude84\udee5\ude2f\ude92\udf2a\udf4a\udf20\uc1aa\udfe8\udf85\udf8f\udf0a\ue06d\ue00d\ue060\ue01d\ue084\ue0fc\ue09c\ue0b3\ue095\uffae\ue15b\ue177\ue134\ue1f4\ue1db\ue1d9\ue1a6\ue279\ufced\ue226\ue24e\ue2ea\ue2c5\ue2aa\ue284\ue329\ue319\ue372\ue346\ue3e2\ue3cd\ue321\ue39b\ue421\ue442\ufa90\ue42a\ue45d\ue58d\ufa1c\ue4af", 56819), IlOl);
                return true;
            }
            case 8202: {
                if (n3 < 3) {
                    this.Il0_(n3);
                } else if (n3 == 3) {
                    this.ll01();
                    this.II0l(IO0O.I1O("\uddbb\udef1\ude48\ude70\ude0c\udee6\uc060\udea2\udecb\udf67\uc1c0\udf2b\udf47\udfe5\ude15\uc127\udf80\ue022\ue04c\ufe9b\ue036\ue050", 56819));
                } else {
                    this.ll01();
                    this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udea2\ude8c\udf62\uc1e0\udf68\udf04\udfee\ude04\udfad\udfcd", 56819));
                }
                return true;
            }
            case 8210: 
            case 8211: {
                this.II_O(n2 == 8210 ? 0 : 1, n3);
                return true;
            }
            case 8212: {
                return true;
            }
            case 8220: {
                if (n3 == 0) {
                    this.IIlO.II.IIII(54, 8223, IO0O.I1O("\uddbe\uc0c5\ude58\ude70\ude03\udf3e\uc04e\udeb8\udecb\udf69\udf41\udee9\udf0e\udfa6\udfc6\udf37\udfc3\ue034\ue001\ue027\ue036\ufedd\ue0f4\ue09c\ue0af\ue092\ue0a9\uffe7\ue139\ue111\ue19f\ue0a4\ue063\uff11\ue272\ue210\ue22c\ue206\ufc40\ue2c2\ue2eb\ue29e\ufdd8\ue341\ue367\ue277\ue3e4\ue384\ue3f2\ue3d2\ue421\ue44c\ufa98\ue430\ue45d\ue4f1\ufa6c\ue4b3\ue4d9\ue57f\ue55e\ufbf5\ue51c\ue59e\ue5e7\ue5ba\ufb2c\ue679\ue60f\ue629\ue604\ue6ed\ue6c5\ue6ea\ue6d8\ue728\ue74b\ue6f6\uf986\ue7f0\ue783\ue7a1\ue789\uf6cd\ue871\ue81e\ue831\ue89c\ue8bb\ue88f\ue8f9\ue888\ue97f\ue9cc\ue921\ue97e\ue9d8\ue9da\ue9b8\ue9d0\uea67\uf491\uea39\uea4c\ueaec\ueac3\uf414\ueac4\ueb27\ueb4e\uf582\ueb44\uebf7\uebca\uf510\ueb8e\ueb98\uec3e\uec4e\uf2e1\uec5b\uecf4\uecde\uf273\uec82\ued36\ued5b\ued3c\ued1a\ued78\ueddf\uedf0\ued8c\uee66\uf0e0\uee22\uee4b\ueef8\ueec8\ueee8\ueed6\uef26\uef4b\uef23\ueed3\uf15f\uefc8\uefe0\uefb2\uef9f\uf064\uf01c\uf036\ueed5\uf0f7\uf0b2\uf0b4\uee11\uf174\uf114\uf127\uef99\uf1ff\uf1d7\uf1ef\uf189\uf264\uec8f\uf222\uf24a\uf2ff\uf248\uf2e7\uf292\uf377\uf345\uf32c\uf342\uf3f5\uf3c8\uf20f\ued01\uf393\uf47b\uf415\uf450\uf435\uf528\uf4c2\uf4f6\uf408\uf52e\uf513\uf51c\uebce\uf5e5\uf58f\uf5ba\uf585\uf66d\uf646\uf66a\uf60e\uf6e1\uf6c6\uf6e6\uf687\ue9b5\uf74d\uf725\uf741\uf7ce\uf7f8\ue973\uf7be\uf7dc\uf843\uf85b\uf837\uf810\uf8b7\uf8de\uf8ba\ue643\uf970\uf912\uf919\ue7a3\uf9e1\uf9c9\uf9ed\uf982\ufa6c\ue4e7\ufa2a\ufa48\ufaf3\uface\ufa29\ufac4\ufb6d\ufb45\ufaf1\ue5bd\ufb16\ufbbe\ufbc9\ufbb4\ue554\ufc74\ufc5e\ufc78\ufc04\ue22b\ufc95\ufcba\ufc9b\ue3bf\ufd5f\ufd70\ufd1b\ufde6\ufc1d\ue313\ufd85\ufe6d\ufe09\ufe24\ufe87\ufea6\ufecd\ue017\ufe8d\uff65\uff01\uff2e\uff38\ue1b3\ufffe\uff92", 56819), new String[]{IO0O.I1O("\uddbc\ude59", 56819)});
                } else if (n3 == 1) {
                    this.Il00(0);
                } else if (n3 == 2) {
                    this.Il00(1);
                }
                return true;
            }
            case 8221: 
            case 8222: {
                int n4;
                int n5 = n4 = n2 == 8221 ? 0 : 1;
                if (n3 == 0) {
                    this.Il00(n4);
                } else if (n3 == 1 || n3 == 2) {
                    this.II_0(n4, n3 - 1);
                }
                return true;
            }
            case 8223: {
                return true;
            }
        }
        return false;
    }

    private void II0l(String string) {
        this.IIlO.II.IIII(54, 8201, string, new String[]{IO0O.I1O("\uddc2\ude32\ude65\ude22\ude4f\udef8\ude4d\udea2\ude8c", 56819), IO0O.I1O("\uddc6\ude32\ude65\ude22\ude4f\udef8\ude4d\udea2\ude8c", 56819), IO0O.I1O("\uddc2\ude22\ude11\ude04\ude1d\udeae\udedb\ude2c\ude85\udf6d", 56819)});
    }

    private void Il01(int n) {
        this.IIlO.II(new IO0o(65).II(4).II(n > 0 ? IO0O.I1O("\udda7\ude7a\uc0ec\ude39\ude4f\udee9\udec4\udead\ude85\udf2a\udf13\udf68", 56819) : "").III(n));
    }

    private void ll01() {
        this.I_11 = 0L;
        this.I_1_ = 0L;
        this.Il01(0);
    }

    private void Il0_(int n) {
        String string;
        IOol iOol = this.IIlO.II;
        if (this.I_1_ <= System.currentTimeMillis() || this.I_11 == 0L) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\udda7\ude7a\uc0ec\ude39\ude4f\udee9\udec4\udead\ude85\udf2a\ude38\udfab\udf47\udfee\uc11a\udfb0\udfc3\ue06a\ue04e\ufef7\ue03c\ue05e\ue0ff\ufe1d\ue0b5\ue0da\ue17a\ue150\ue0e7\ue117\ue1b5\ue1d7\ue063\uff11\ue272\ue210\ue23b\ue207\ufc4c\ue2c2\ue2ea", 56819));
            return;
        }
        this.I_1_ = System.currentTimeMillis() + 15000L;
        this.Il01(15);
        long l = this.I_11;
        if (iOol.Il11 < l) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udff0\udf45\udfaa\udf84\ue022\ue130\ufe83\ue07f\ue01d\ue0f5\ue11d\ue0b2\ue0db", 56819));
            return;
        }
        iOol.Il11 -= l;
        int n2 = this.IIl_.nextInt(3);
        if (n == n2) {
            string = IO0O.I1O("\udd8f\ude20\ude4d\ude12\uc0ce\udee0\ude8d\udebe\ude8a\udf2a\udf4a\udfa9\udf0e\udfa6\udf99", 56819) + IlO1[n] + IO0O.I1O("\uddcd\ude18\ude65\udea4\ude06\udeae\udedf\udead\udecb\udf69\udfc8\udf21\udf47\udfba", 56819) + IlO1[n2] + IO0O.I1O("\uddcd\ude18\ude4d\ude68\ude13\udec6\ude5f\udead\udecb\udf64\udf41\udf29\udf12\udfa6\udfcb\udfac\udf0a\ue022\ue049\ue021\ue037\ue01f", 56819);
            iOol.Il11 += l;
        } else if (n == 0 && n2 == 2 || n == 1 && n2 == 0 || n == 2 && n2 == 1) {
            long l2 = l * 96L / 100L;
            iOol.Il11 += l2 + l;
            string = IO0O.I1O("\udd8f\ude23\ude4d\ude12\uc0ce\udee0\ude8d\udebe\ude8a\udf2a\udf4a\udfa9\udf0e\udfa6\udf99", 56819) + IlO1[n] + IO0O.I1O("\uddcd\ude18\ude65\udea4\ude06\udeae\udedf\udead\udecb\udf69\udfc8\udf21\udf47\udfba", 56819) + IlO1[n2] + IO0O.I1O("\uddcd\ude18\ude4d\ude60\ude13\udecc\uc00c\udea2\udecb\udf7e\udf41\uc1e7\udf09\udfe1\udf85\udfb6\uc130\ue06b\ue001\ue028\ue02a\ue016\ue0e8\ue0b6\ue0a7\ue0cb\ue165\ue17a\ufff6\ue118\ue1b5\ue1da\ue1bb\uff5f\ue27f\ue210\ue35e\ue3de\ufc6e\ue2cf\ue2eb", 56819) + IO0O.IIIo(l2) + IO0O.I1O("\uddd3\ude64\uded1\ude3e\ude08\udea0", 56819);
        } else {
            string = IO0O.I1O("\udd8f\ude25\ude4d\ude12\uc0ce\udee0\ude8d\udebe\ude8a\udf2a\udf4a\udfa9\udf0e\udfa6\udf99", 56819) + IlO1[n] + IO0O.I1O("\uddcd\ude18\ude65\udea4\ude06\udeae\udedf\udead\udecb\udf69\udfc8\udf21\udf47\udfba", 56819) + IlO1[n2] + IO0O.I1O("\uddcd\ude18\ude4d\ude60\ude13\udeda\ude59\udea5\udecb\udf7e\udf41\uc1e7\udf09\udfe1\udf85\udfaa\udf8b\ue0eb\ue001\ue028\ue036\ue016\ue0f4\ue0b6\ue0a7\ue0cd\ue165\ue17a\ufff6\ue118\ue1b5\ue1d6\uff18\ue1d2\ue265\ue242\ufca4\ue24e", 56819) + IO0O.IIIo(l) + IO0O.I1O("\uddd3\ude64\uded1\ude3e\ude08\udea0", 56819);
        }
        this.IIlO.IIIl.l1_();
        this.IIlO.I__O();
        this.IIlO.II.IIII(54, 8202, string, IlOl);
    }

    private long IIIl(long l) {
        return l / 60000L;
    }

    private int II(int n, long l) {
        return new Random(l * 7919L + (long)n * 104729L + 12345L).nextInt(100);
    }

    private int II(long l) {
        return (int)Math.max(0L, 50L - l % 60000L / 1000L);
    }

    private String IIl(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        Vector vector = this.III[n];
        for (int i = 0; i < vector.size(); ++i) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append((Integer)vector.elementAt(i));
        }
        return stringBuilder.toString();
    }

    private void Il0O(int n) {
        long l = System.currentTimeMillis();
        long l2 = this.IIIl(l);
        StringBuilder stringBuilder = new StringBuilder(IO0O.I1O("\uddbf\uc0d9\ude52\ude38\ude4f\udefd\uc040\udef6\udecb", 56819));
        int n2 = 0;
        for (long i = l2 - 10L; i < l2; ++i) {
            if (n2++ > 0) {
                stringBuilder.append(IO0O.I1O("\udddf\ude32", 56819));
            }
            stringBuilder.append(this.II(n, i));
        }
        String string = n == 0 ? IO0O.I1O("\udd87\ude7a\uc0fe\ude39\ude4f\udef8\ude4d\udea2\ude8c", 56819) : IO0O.I1O("\udd9d\ude75\uc0fc\ude33\ude4f\udef6\udecc\udea2\ude83", 56819);
        long l3 = n == 0 ? 90L : 450L;
        int n3 = n == 0 ? 1 : 5;
        String string2 = this.IIl(n);
        String string3 = IO0O.I1O("\uddb8\uc0ad\ude45\ude70\ude1e\udefb\uc00e\udeec\ude8c\udf63\uc18a\udf21\udf47\udff2\udfd7\ude74\uc138\ue061\ue01b\ue060", 56819) + this.II(n, l2 - 1L) + IO0O.I1O("\uddf9", 56819) + stringBuilder + IO0O.I1O("\uddf9\ude46\uc0e4\ude3e\ude08\udeae\udeca\udea5\uc048\udf63\udf09\udf3c\udf0f\ude36\uc17a\udfaa\udf84\ue038\ue001", 56819) + l3 + IO0O.I1O("\uddd3", 56819) + string + IO0O.I1O("\uddf9\ude2e", 56819) + this.II(l) + IO0O.I1O("\uddcd\ude75\ude58\udeb2\ude16\ude84", 56819) + (string2.length() > 0 ? IO0O.I1O("\uddb0\udef3\ude52\ude70\ude1c\uc05f\ude8d\udeae\uc04a\udf64\udf09\udf2b\udf0f\uc14b\udfcb\udffe\udfc3", 56819) + string2 : IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude0c\udee6\udf1d\udead\udecb\udf69\udf41\uc185\udf09\udfa6\udfd6\uc115\udfc3\ue06c\ue0c1\ue02f\ue071", 56819));
        this.IIlO.II.IIII(54, n == 0 ? 8210 : 8211, string3, new String[]{IO0O.I1O("\uddb0\uc0bf\ude41\ude70\ude01\udee6\uc000\udeb8", 56819), IO0O.I1O("\uddc2\ude32\ude62\uc081\ude65", 56819) + n3 + IO0O.I1O("\uddd3", 56819) + string, IO0O.I1O("\uddbd\ude75\uc09a\ude25\ude4f\udee0\udec5\udea5\ude01\udf64\udf23\udf79\udf47\udff5\uc174\udfe4\udf8f\ufeb9\ue02b", 56819) + n3 + IO0O.I1O("\uddd3", 56819) + string, IO0O.I1O("\uddbd\ude75\uc09a\ude25\ude4f\udee0\udec5\udea5\ude01\udf64\udf23\udf79\udf47\udff5\uc174\udfe4\udf80\ue06a\ufe94\ue02e\ue055", 56819) + n3 + IO0O.I1O("\uddd3", 56819) + string, IO0O.I1O("\uddbb\udfa2\uc0ea\ude3e\ude08\ude84\udec9\uc067\ude85\udf00\udf5d\udf20\udf8d\udfeb", 56819), IO0O.I1O("\udce3\udee1\ude5f\ude37", 56819)});
    }

    private void II_O(int n, int n2) {
        if (n2 == 0) {
            this.Il0O(n);
        } else if (n2 == 1) {
            this._I_ = n;
            this.IIlO.II(new IO0o(-125).II(n == 0 ? IO0O.I1O("\uddbb\udef1\ude48\ude70\ude0c\udee6\uc060\udea2\udecb\udf3b\udf09\udf3b\uc1b6\udfa6\udfd1\uc12f\udfc3\ue032\ue001\ue151\ufee0\ue010\ue0bd\ue085\ue0e2\ue0da\ue17e\ue151\ue1b6\ue156\ue1a4\ue194\ue1a7\ue19a\ufcde\ue259\ue26f\ue218\ue26d\ue2c2\ue2ac", 56819) : IO0O.I1O("\uddbb\udef1\ude48\ude70\ude0c\udee6\uc060\udea2\udecb\udf3b\udf09\udf3b\uc1b6\udfa6\udfd1\uc12f\udfc3\ue032\ue001\ue151\ufee0\ue010\ue0bd\ue085\ue0e2\ue0da\ue17e\ue151\ue1b6\ue156\ue1a0\ue194\ue1bd\ue195\ufcdc\ue253", 56819)).II(1).II(IO0O.I1O("\udda0\uc0c3\ude11\ude32\uc0ce\udee0\ude8d\udeaf\ude83\uc1c7\udf47", 56819)).II(0));
        } else if (n2 == 2 || n2 == 3) {
            int n3;
            if (!this.II0o(n)) {
                return;
            }
            Vector vector = this.III[n];
            if (vector.size() >= 50) {
                this.IIlO.IIIl.IIol(n2 == 2 ? IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf13\uc123\udfd1\udfe4\udf80\ufea1\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf\ufe0a\ue0da\ue175\uff83\ue177\ue11d\ue1fd\uff17\ue1f3\ue196\ufcf4\ue25e\ue228\ue240", 56819) : IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf13\uc123\udfd1\udfe4\udf80\ufea1\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf\ufe0a\ue0da\ue17a\ue150\uffe2\ue118\ue1b5\ue1df\ue1bb\uff51\ue231\ue254\ufcaa\ue200\ue2ea\ue282", 56819));
                return;
            }
            int n4 = 0;
            do {
                int n5 = n3 = n2 == 2 ? this.IIl_.nextInt(50) * 2 + 1 : this.IIl_.nextInt(51) * 2;
                if (n3 <= 99) continue;
                n3 = 98;
            } while (vector.contains(new Integer(n3)) && ++n4 < 500);
            if (vector.contains(new Integer(n3))) {
                this.IIlO.IIIl.IIol(n2 == 2 ? IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf13\uc123\udfd1\udfe4\udf80\ufea1\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf\ufe0a\ue0da\ue175\uff83\ue177\ue11d\ue1fd\uff17\ue1f3\ue196\ufcf4\ue25e\ue228\ue240", 56819) : IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf13\uc123\udfd1\udfe4\udf80\ufea1\ue001\ue023\ue0be\ue01d\ue0bd\ue0cf\ufe0a\ue0da\ue17a\ue150\uffe2\ue118\ue1b5\ue1df\ue1bb\uff51\ue231\ue254\ufcaa\ue200\ue2ea\ue282", 56819));
                return;
            }
            this.II(n, n3, (n2 == 2 ? IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf09\udfe1\uc10e\udfb1\udfc3\ue06c\ue049\ue029\ue0b5\ue010\ue0bd\ue0cf\ufe0a\ue0da\ue175\uff83\ue177", 56819) : IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf09\udfe1\uc10e\udfb1\udfc3\ue06c\ue049\ue029\ue0b5\ue010\ue0bd\ue0cf\ufe0a\ue0da\ue17a\ue150\uffe2\ue118\ue1b5", 56819)) + n3);
        } else if (n2 == 4) {
            this.IIlO.II.IIII(54, 8212, IO0O.I1O("\udda7\ude7a\uc0ec\ude39\ude4f\udee9\udec4\udead\ude85\udf2a\udf5d\uc1a3\udf47\udfbe\udfcd\udfe4\udef2\ufebd\ue04f\ue060\ue037\ufec1\ue0e9\ue09c\ue0e9\ue0cb\ue171\ue10d\ue16e\ue156\ue1fd\uff05\ue1bd\ue195\ue231\ue25e\ue228\ue28e\ue2f4\ue2a6\ue286\ufc3d\ue360\ue308\ue32b\ue2d6\ufd66\ue3d0\ue3e3\ue2f3\ue5b1\ufac3\ue45c\ue47e\ue41e\ue4f4\ufa76\ue4b4\ue4d9\ue529\ue507\ue576\ue516\ue5fb\ue5dd\ue5f2\ue582\uf8c1\ue60f\ue63a\uf886\ue6ac\ue69b\ue6ea\ue7f8\uf9b7\ue749\ue766\ue75c\ue7bd\ue7a9\ue796\ue789\uf6dd\ue876\ue81e\ue83a\ue815\ue8fa\ue8d4\ue8f9\ue895\uf7c0\ue95f\ue975\ue918\ue823\uf751\ue9a5\ue9d0\uea63\ueace\uea6d\uea59\ueaab\ueada\ueaa1\uea12\ueb73\ueb08", 56819), new String[]{IO0O.I1O("\udce3\uc0c1\ude5f\ude37\ude4f\ude73", 56819)});
        }
    }

    private boolean II0o(int n) {
        long l = System.currentTimeMillis();
        this.IIIO(l);
        if (l % 60000L >= 50000L) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\udce3\udef1\ude11\ude38\uc0d0\udefa\ude8d\udeb8\ude83\uc1d7\udf40\udf68\udf00\udfef\udfc4\udfaa\udfc3\ue113\ufe96\ue034\ue07f\ue01d\ue12d\ufe5f\ue0b8\ue0da\ue17a\ue150\ue138\ue156\ue1e3\ue146\ue1bd\ue195\ue231\ue25e\ue2af\ue217\ue2a3\ue28c\ue29d\ue29f\ue360\ue308\ue32b\ue394\ue3eb\ue3c3\ue3e3\ue381\ue469\ufafd\ue41f\ue428\ue48f\ue4f2\ue4dc\ue4fa\ue494\ufbc3\ue55e\ue578", 56819));
            return false;
        }
        IOol iOol = this.IIlO.II;
        if (n == 0) {
            if (this.II10(457) < 1) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udfb7\udf85\udfb0\udf8b\ufecd\ue048\ue060\ue029\ue09e\ue0f3\ue0db\ue0fb\ue1eb\uffda\ue118\ue123\ue11e\uff64\ue1d7\ue1f3\ue19a\ue278\ufcf7\ue221", 56819));
                return false;
            }
        } else if (iOol.lOoO < 5) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udfb3\udf85\udfaa\udf84\ufecf\ue042\ue060\ue14e\ufebd\ue0bd\ue0c8\ue0b3\ufe0b\ue17a\ue118\ue13f\ue11f\uff52\ue1da", 56819));
            return false;
        }
        if (this.III[n].size() >= 10) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf56\udfb6\udf85\udfb7\uc132\ue022\ue053\ufe93\ue036\ue05e\ue0f6\ue0d4\ue02f\ue094\ue17e\ue118\ue123\ue11e\uff56\ue194\ue1b0\ue19a\ufcdc\ue25e\ue26f\ue21a\ue2e5\ue246\ue2a6", 56819));
            return false;
        }
        return true;
    }

    private void II(int n, int n2, String string) {
        if (n == 0) {
            this.II1O(457, 1);
            this.IIlO.IIIl.l1_l();
            string = string + IO0O.I1O("\uddd3\ude70\uc080\ude3e\ude08\udeae\ude9c\udeec\ude9f\udf62\uc1e6\udf21\udf47\udff0\udf45\udfaa\udf84\ue02c", 56819);
        } else {
            this.IIlO.II.lOoO -= 5;
            this.IIlO.IIIl.l1_();
            string = string + IO0O.I1O("\uddd3\ude70\uc080\ude3e\ude08\udeae\ude98\udeec\ude85\udf6d\uc1e4\udf2b\udf49", 56819);
        }
        this.III[n].addElement(new Integer(n2));
        this.IIlO.IIIl.IIol(string);
        this.IIlO.II(new IO0o(-126).II(0).II(this.IIl(n)));
        this.IIlO.I__O();
    }

    void IIl_(DataInputStream dataInputStream) throws IOException {
        int n;
        int n2;
        int n3 = dataInputStream.readByte();
        String[] stringArray = new String[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            stringArray[n2] = dataInputStream.readUTF();
        }
        n2 = this._I_;
        this._I_ = -1;
        if (n2 < 0 || n3 < 1) {
            return;
        }
        try {
            n = Integer.parseInt(stringArray[0].trim());
        }
        catch (Exception exception) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\udda0\uc0c3\ude11\ude32\uc0ce\udee0\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf0c\udfee\udf51\udfaa\udf84\ue022\ue049\ufea3\ue02f\ue05e\ue0f1\ufe7b\ue0fb\ue092\ue176\uff8f\ue134\ue156\ue084\ue157\ue1f3\ue19a\ufcae\ue244\ue26f\ue21a\ue2e5\ufc71\ue2a2\ue2ca\ue36e\ue341\ue326\ue308\ue3a5\ue2b5\ufd74\ue396\ue421\ue443\ue58f\ufabd\ue41e\ue4b2", 56819));
            return;
        }
        long l = System.currentTimeMillis();
        if (n < 0 || n > 100 || this.II(l) <= 10) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\udda0\uc0c3\ude11\ude32\uc0ce\udee0\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf0c\udfee\udf51\udfaa\udf84\ue022\ue049\ufea3\ue02f\ue05e\ue0f1\ufe7b\ue0fb\ue092\ue176\uff8f\ue134\ue156\ue084\ue157\ue1f3\ue19a\ufcae\ue244\ue26f\ue21a\ue2e5\ufc71\ue2a2\ue2ca\ue36e\ue341\ue326\ue308\ue3a5\ue2b5\ufd74\ue396\ue421\ue443\ue58f\ufabd\ue41e\ue4b2", 56819));
            return;
        }
        if (!this.II0o(n2)) {
            return;
        }
        if (this.III[n2].contains(new Integer(n))) {
            this.IIlO.IIIl.IIol(IO0O.I1O("\udda0\uc0c3\ude11\ude3e\ude8f\udef7\ude8d\udeae\uc04a\udf64\udf09\ude59\udf84\udfa6\udfc6\udfac\uc12e\ue06c\ue001\ue032\ufe8c\ue017\ue0bd\ue0ca\ue0ae\ue093\ue139\ue154\ue1a5\ue118\ue1f2\ue194\ue1b0\ue19a\ufcdc\ue25e\ue26f\ue21d\ufc5c\ue28c\ue2a0\ue282\ue3e8\ue34b\ue369", 56819));
            return;
        }
        this.II(n2, n, IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\udf7e\ude6d\ude8d\udeaf\ude83\uc1c7\udf47\udf68\udf14\uc157\udf85", 56819) + n);
    }

    private void IIIO(long l) {
        long l2 = this.IIIl(l);
        for (int i = 0; i < 2; ++i) {
            if (this.IIIO[i] < 0L) {
                this.IIIO[i] = l2;
            }
            if (this.IIIO[i] == l2) continue;
            int n = this.II(i, this.IIIO[i]);
            this.IIIO[i] = l2;
            Vector vector = this.III[i];
            if (vector.size() == 0) continue;
            String string = IO0O.I1O("\uddb0\ude7d\ude5f\ude70\ude1c\uc05f\ude8d\udeb8\ude99\udff0\udf47\udf2f\udf47\udff2\udfcd\ude74\uc13c\ue06c\ue046\ue060\ue033\ue09e\ue0bd", 56819) + n + IO0O.I1O("\uddd3\ude71\ude59\udeaa\ude0c\udeae\udecf\uc06d\ude85\udf2a\udf44\udf29\udf1e\udfa6\udfc8\uc16b\udf8d\ue022\ue04d\ufee7\ue031\ue05e\ue0ee\ue0dd\ue0ae", 56819);
            boolean bl = vector.contains(new Integer(n));
            if (bl) {
                IOol iOol = this.IIlO.II;
                if (i == 0) {
                    IO0l iO0l = new IO0l(457, 90);
                    if (!this.IIlO.IIIl.III0(iO0l)) {
                        iOol.II11.addElement(iO0l);
                        this.IIlO.IIIl.IIol(IO0O.I1O("\uddbb\udef2\ude5f\ude38\ude4f\udefa\udedf\udead\ude85\udf6d\udf09\ude59\uc1c0\udfff\udf89\udfe4\udf97\ue06a\ue191\ufe9f\ue031\ue019\ue0bd\ue1ad\ue16b\ufe19\ue17a\ue118\ue130\uff9b\ue1fc\ue194\ue1a5\ue112\ue27e\ue210\ue23d\ue3de\ue32c\ue2c2\ue2ac\ue2ca\ue379\ue340\ufda2\ue346\ue3e6\ufd43\ue3a2\ue3c2\ue455\ue448\ue58f\ufabd\ue413\ue4fb\ue49b\ue5ca\ufa46", 56819));
                    }
                    this.IIlO.IIIl.l1_l();
                    string = IO0O.I1O("\uddb0\ude7a\udecb\ude33\ude4f\udee3\uc046\udea2\ude8c\udf2a", 56819) + iOol.II1o + IO0O.I1O("\uddd3\udf03\uded2\ude70\ude1b\udee6\uc002\udea2\ude8c\udf2a\udf10\udf78\udf47\udff2\udfcd\uc10b\udf8a\ue022\ue057\ue0a0\ue031\ue019\ue0bd\ue0ca\ufe00\ue093\ue139\ue15b\ue138\ue118\ue1b5\ue1c7\uff02\ue1d2\ue27c\ue251\ue236\ue24e\ue2e0\ufc03\ue2a5\ue2ca", 56819) + n;
                } else {
                    iOol.lOoO += 450;
                    this.IIlO.IIIl.l1_();
                    string = IO0O.I1O("\uddb0\ude7a\udecb\ude33\ude4f\udee3\uc046\udea2\ude8c\udf2a", 56819) + iOol.II1o + IO0O.I1O("\uddd3\udf03\uded2\ude70\ude1b\udee6\uc002\udea2\ude8c\udf2a\udf1d\udf7d\udf57\udfa6\udfcb\udfa3\uc12e\ue061\ue001\ue036\ufe84\ue017\ue0bd\ue0df\ue0b4\ue094\ue139\ue14b\uff86\ue156\ue1f8\ue1d5\ue1aa\ue1d2\ue27c\ufc9f\ue221\ue24e", 56819) + n;
                }
            }
            this.IIlO.II(new IO0o(-126).II(1).II(1).II("" + n).II(string));
            this.IIlO.IIIl.IIol(IO0O.I1O("\uddb0\ude7d\ude5f\ude70\ude1c\uc05f\ude8d\udea1\ude8a\udf73\udf09\udf25\uc1c8\udfe8\udf85", 56819) + (i == 0 ? IO0O.I1O("\udda5\udef2\ude5f\ude37", 56819) : IO0O.I1O("\uddbd\ude75\uc0fc\ude33", 56819)) + IO0O.I1O("\uddd3\ude64\udec3\ude3e\ude08\udeae\udec3\ude2c\ude92\udf2a\udf45\udfa8\udf5d\udfa6", 56819) + n + (bl ? IO0O.I1O("\udddd\ude32\ude7f\ude37\udfdf\uc053\udec4\udeec\ude9f\udf62\uc186\udf26\udf00\udfa6\udfc6\udfb1\uc13a\ue061\ue01b\ue060", 56819) + this.IIlO.II.II1o : IO0O.I1O("\udddd\ude32\ude7a\ude38\ude9b\udee0\udeca\udeec\ude88\udff9\udf09\udf26\udf00\ude36\uc178\udfad\udfc3\ue076\ue049\ufeef\ue031\ue019\ue0bd\ue0df\ue0ae\ufe23\ue17a\ue116", 56819)));
            vector.removeAllElements();
            this.IIlO.I__O();
        }
    }

    private static String III(long l, long l2) {
        if (l2 == 0L) {
            return IO0O.I1O("\uddc3", 56819);
        }
        return String.valueOf(Math.ceil((double)l / (double)l2 * 100.0));
    }

    private void Il00(int n) {
        String[] stringArray;
        long l = System.currentTimeMillis();
        this.III0(l);
        long l2 = Math.max(0L, (300000L - l % 300000L) / 1000L);
        String string = n == 0 ? IO0O.I1O("\udd85\udef2\ude5f\ude37", 56819) : IO0O.I1O("\udd9b\uc0c1\ude5f\ude37\ude4f\udee0\udeca\uc001\ude88", 56819);
        String string2 = IO0O.I1O("\udda7\uc0c7\ude5f\ude37\ude4f\udee9\udec4\uc06f\ude82\udf2a\udf5d\udf20\uded7\uc15b\udfcb\udfa3\udfd9\ue022", 56819) + IO0O.IIIo(this.IIII[n][0]) + IO0O.I1O("\uddd3", 56819) + string + IO0O.I1O("\udddf\ude32\ude52\udff1\ude4f\udee6\uc074\udea5\udecb\udf7e\udf5b\udfb2\udf09\udfe1\udf85\udfa7\uc104\ue063\ue001\ue022\ufefe\ue010\ue0bd\ue0d0\ue03b\ue0c0\ue139", 56819) + IO0O.III(this.III[n][0], this.IIII[n][0]) + IO0O.I1O("\uddd6\ude18\ude65\uc085\ude01\udee9\ude8d\udeab\ude82\uc1a9\udf40\udf68\udf31\udfcf\udff5\udffe\udfc3", 56819) + IO0O.IIIo(this.IIII[n][1]) + IO0O.I1O("\uddd3", 56819) + string + IO0O.I1O("\udddf\ude32\ude52\udff1\ude4f\udee6\uc074\udea5\udecb\udf7e\udf5b\udfb2\udf09\udfe1\udf85\udfa7\uc104\ue063\ue001\ue022\ufefe\ue010\ue0bd\ue0d0\ue03b\ue0c0\ue139", 56819) + IO0O.III(this.III[n][1], this.IIII[n][1]) + IO0O.I1O("\uddd6\ude18\ude65\ude38\uc0b2\udee7\ude8d\udeab\ude82\udf6b\udf47\udf68\udf04\udf74\udfcb\udfe4\udf8f\ufea3\ue048\ue07a\ue07f", 56819) + l2 + IO0O.I1O("\uddd3\ude75\ude58\udeb2\ude16", 56819);
        if (n == 0) {
            String[] stringArray2 = new String[4];
            stringArray2[0] = IO0O.I1O("\uddb0\uc0bf\ude41\ude70\ude01\udee6\uc000\udebc", 56819);
            stringArray2[1] = IO0O.I1O("\udda7\ude7a\udf81\uc08d\ude01\udee9\udea7\udefd\udecb\udf7e\udf5b\udf21\uc1a0\udff3\udfaf\udfb2\udf03\ue06c\ue046", 56819);
            stringArray2[2] = IO0O.I1O("\udda5\ude5b\ude61\ude5a\ude5e\udebe\ude8d\udeb8\ude99\udf63\uc1ee\udf3d\udf6d\udff0\udf45\udfaa\udf84", 56819);
            stringArray = stringArray2;
            stringArray2[3] = IO0O.I1O("\udce3\udee1\ude5f\ude37", 56819);
        } else {
            String[] stringArray3 = new String[4];
            stringArray3[0] = IO0O.I1O("\uddb0\uc0bf\ude41\ude70\ude01\udee6\uc000\udebc", 56819);
            stringArray3[1] = IO0O.I1O("\udda7\ude7a\udf81\uc08d\ude01\udee9\udea7\udefd\udedb\udf2a\udf47\udf2f\uc1aa\udfe5\udfaf\udfbc\udf82\ue06c\ue049", 56819);
            stringArray3[2] = IO0O.I1O("\udda5\ude5b\ude61\ude5a\ude5e\udebe\ude9d\udeec\ude85\udf6d\uc1e4\udf2b\udf6d\udffe\udfc4\udfaa\udf8b", 56819);
            stringArray = stringArray3;
            stringArray3[3] = IO0O.I1O("\udce3\udee1\ude5f\ude37", 56819);
        }
        String[] stringArray4 = stringArray;
        this.IIlO.II.IIII(54, n == 0 ? 8221 : 8222, string2, stringArray4);
    }

    private void II_0(int n, int n2) {
        long l = n == 0 ? (n2 == 0 ? 1000000L : 10000000L) : (long)(n2 == 0 ? 10 : 100);
        IOol iOol = this.IIlO.II;
        if (n == 0) {
            if (iOol.Il11 < l) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udff0\udf45\udfaa\udf84", 56819));
                return;
            }
            iOol.Il11 -= l;
        } else {
            if ((long)iOol.lOoO < l) {
                this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude04\udee6\ude59\udea2\ude8c\udf2a\ude38\uc1af\udf47\udfe8\udfc2\uc109\udf80\ue022\ue059\ue021\ue031\ue016", 56819));
                return;
            }
            iOol.lOoO -= (int)l;
        }
        this.IIlO.IIIl.l1_();
        long[] lArray = this.III[n];
        int n3 = n2;
        lArray[n3] = lArray[n3] + l;
        long[] lArray2 = this.IIII[n];
        int n4 = n2;
        lArray2[n4] = lArray2[n4] + l;
        this.IIlO.I__O();
        this.Il00(n);
    }

    private void III0(long l) {
        long l2 = l / 300000L;
        for (int i = 0; i < 2; ++i) {
            if (this.III0[i] < 0L) {
                this.III0[i] = l2;
            }
            if (this.III0[i] == l2) continue;
            this.III0[i] = l2;
            IOol iOol = this.IIlO.II;
            boolean bl = false;
            for (int j = 0; j < 2; ++j) {
                long l3;
                if (this.III[i][j] == 0L) continue;
                bl = true;
                long l4 = this.IIII[i][j];
                if (i == 1 && j >= 0) {
                    l3 = this.III[i][j] * 90L / 100L;
                    iOol.lOoO += (int)l3;
                    this.IIlO.IIIl.IIol(IO0O.I1O("\uddb1\uc0b3\ude5f\ude70\ude03\ude6e\ude8d\udea2\ude8c\udeba\uc1f4\udf21\udf47\udfe2\udfd0\udfbd\udfc3\ue06c\ue049\ufee5\ue02b\ue05e\ue0e9\ue0d4\ue0ba\ue097\ue139\ue15f\ue13e\ue117\ue1b5\ue1c2\ue133\ue1d2\ue273\ufcfb\ue26f\ue206\ue2e2\ue24c\ue2a5\ue2ca\ue365\ufd89\ue32e\ue346\ue3bc\ue394\ue3e6\ue3c2\ue466\ue445\ue452\ue47e\ue56c\ue47f\ue49b\ue5cb\ufa4e\ue56c\ue517\ue57e", 56819) + IO0O.IIIo(l3) + IO0O.I1O("\uddda", 56819));
                } else {
                    l3 = l4 * (long)(j == 0 ? 80 : 90) / 100L;
                    iOol.Il11 += l3;
                    this.IIlO.IIIl.IIol(IO0O.I1O("\uddb0\ude7a\udecb\ude33\ude4f\udee3\uc046\udea2\ude8c\udf2a\udf4b\uc1e9\udf09\udfa6\udeb4\udf27\udfc3\ue066\ue0c1\ue02e\ue037\ue05e\ue0fe\ue0d4\ue0b2\ufe45\ue177\ue118\ue123\ue11e\uff3a\ue1da\ue1b4\ue1d2\ue267\ue2d0\ue26f\ue200\ue2e5\ufc01\ue2a5\ue2ca\ue218\ue298\ufda4\ue305\ue3a5", 56819) + IO0O.IIIo(l3) + IO0O.I1O("\uddd3\ude64\uded1\ude3e\ude08", 56819));
                }
                this.III[i][j] = 0L;
                this.IIII[i][j] = 0L;
            }
            if (!bl) continue;
            this.IIlO.IIIl.l1_();
            this.IIlO.I__O();
        }
    }

    void III1(long l) {
        if (this.IIlO.II == null) {
            return;
        }
        if (this.I_11 != 0L && l >= this.I_1_) {
            this.I_11 = 0L;
            this.I_1_ = 0L;
            this.Il01(0);
        }
        this.IIIO(l);
        this.III0(l);
    }

    private static /* synthetic */ String I1O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

