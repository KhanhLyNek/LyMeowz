/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class IO0_ {
    static final int looo = 10;
    static final String lI_1 = "T\u1ea1i khu v\u1ef1c n\u00e0y, ta \u0111\u00e3 d\u00f9ng ma ph\u00e1p phong \u1ea5n\bd\u00f9 c\u00e1c ng\u01b0\u01a1i c\u00f3 m\u1ea1nh \u0111\u1ebfn \u0111\u00e2u\bc\u0169ng s\u1ebd tr\u1edf th\u00e0nh y\u1ebfu \u0111u\u1ed1i nh\u01b0 nhau\nCh\u1ec9 c\u00f3 ta v\u1edbi con nh\u00f3c \u00d4sin m\u1edbi gi\u1ea3i \u0111\u01b0\u1ee3c ma ph\u00e1p n\u00e0y\bKhi \u0111\u00f3 s\u1ee9c m\u1ea1nh c\u1ee7a ng\u01b0\u01a1i s\u1ebd \u0111\u01b0\u1ee3c\bgi\u1ea3i ph\u00f3ng theo \u0111i\u1ec3m t\u00edch l\u0169y (TL)\nKhi \u0111\u1ee7 \u0111i\u1ec3m t\u00edch l\u0169y b\u1eb1ng c\u00e1ch\bh\u1ea1 l\u1eabn nhau ho\u1eb7c h\u1ea1 boss\bta s\u1ebd \u0111\u01b0a ng\u01b0\u01a1i xu\u1ed1ng t\u1ea7ng ti\u1ebfp theo";
    static final int _I = 600000;
    private final IO0 IIl_;
    private final IOo_ IIl_;
    private final Random IIl1;
    int l1__;
    long I_1;
    private int _II = -1;
    private long I_1I;
    private long I_1l;
    private int Il_0 = -1;
    private final Vector IIl1 = new Vector();

    IO0_(IO0 iO0, IOo_ iOo_) {
        this.IIl_ = iO0;
        this.IIl_ = iOo_;
    }

    static boolean II0O(int n) {
        return n >= 114 && n <= 120;
    }

    static boolean Il_1() {
        int n = Calendar.getInstance().get(11);
        return n >= 12 && n < 13;
    }

    private static int IIOO(int n) {
        switch (n) {
            case 114: {
                return 115;
            }
            case 115: {
                return 117;
            }
            case 117: {
                return 118;
            }
            case 118: {
                return 119;
            }
            case 119: {
                return 120;
            }
        }
        return n;
    }

    private void IIIl(int n, String string) {
        this.IIl_.II(new IO0o(124).III(n).II(string));
    }

    private void llO_() {
        this.IIl_.II(new IO0o(-115).II(IO0_.I1_o("\ud121\ud1d8", 53621)).III(this.l1__).III(10).III(3));
    }

    void llOO() {
        if (!IO0_.Il_1()) {
            this.IIl_.IIIl.IIol(IO0_.I1_o("\ud103\ud1e1\ud1da\ud1f2\ud19d\ud2e2\ud241\ud229\ud24d\ud39d\ucc48\ud2a3\ud2c9\ud339\ud315\ud32e\ud344", 53621));
            return;
        }
        this.IIl_.II.lO1 = 0;
        this.l1__ = 0;
        this.IIl_.III_(114, 100 + this.IIl1.nextInt(401), 336);
    }

    void lIlI() {
        IOol iOol = this.IIl_.II;
        int n = iOol.lOlo;
        if (n == this.Il_0) {
            return;
        }
        this.Il_0 = n;
        if (!IO0_.II0O(n)) {
            if (iOol._l0l == 9 || iOol._l0l == 10) {
                iOol._l0l = 0;
                this.IIl_.ll_l();
            }
            this._II = -1;
            return;
        }
        if (iOol._l0l != 9 && iOol._l0l != 10) {
            iOol._l0l = 9 + this.IIl1.nextInt(2);
            this.IIl_.ll_l();
        }
        if (n == 117) {
            this.IIl_.IIIl.IIol(IO0_.I1_o("\ud065\ud176\ud1ca\ud1f2\ud19d\ud2f0\ud20f\ud225\ud205\ud278\ud2c5\ud2ad\ud2c9\ud36f\ud34e\ud327\ud30b\ud3a4\ud3c0\ud3a3\ud38e\ud420\ud46b\ud44c\uca90\ud412\ud4fc\ud49a\ud4b5\uca09\ud574\ud51a\ud575\ud51c\ud570\ud5cb\ud5f1\ud593\uc8a6\ud640\ud66d\ud618\ud6e3\uc807\ud6a7", 53621));
        }
        if (n != 114 && n != 116) {
            this.l1__ = 0;
            int n2 = n - 114;
            if (n > 116) {
                --n2;
            }
            IO0l iO0l = new IO0l(521, 1);
            iO0l.III(1, n2 * 5);
            if (this.IIl_.IIIl.III0(iO0l)) {
                this.IIl_.IIIl.IIol(IO0_.I1_o("\ud137\ucf35\ud1dd\ud1f2\ud19f\ud278\ucc82\ud220\ud24d\ud39d\ud31b\ucc29\ud28a\ud328", 53621) + n2 * 5 + IO0_.I1_o("\ud155\ud1e4\ud1db\ud128\ud185\ud230", 53621) + (IOO.II(521) == null ? IO0_.I1_o("\ud121\ud1fc\ucf08\ud1f2\ud19d\ud265\ud256\ucc89\ud203\ud2ac\ud2df\ucc67\ud299", 53621) : IOO.II((int)521).II1o));
                this.IIl_.IIIl.l1_l();
            }
        }
        this.llO_();
    }

    void III1(long l) {
        IOol iOol = this.IIl_.II;
        if (iOol == null || !IO0_.II0O(iOol.lOlo)) {
            return;
        }
        if (iOol.lOlo == 116) {
            return;
        }
        if (this._II >= 0) {
            if (l - this.I_1I >= 3000L) {
                this.I_1I = l;
                if (this._II == 30) {
                    this.IIl_.II.III1(5, IO0_.I1_o("\ud121\ud1e6\ucf1e\ud1bc\ud1d1\ud273\ud247\ud227\uccd2\ud2e2\ud28b\ud3db\ud20a\ud328\ud34c\ucdf9\ud311\ud3a4\ud3d7\ud3aa\ud31b\ud463\ud433\ud41e\ud43e\ud414\ud461\ud4d4\ud4be\ud4d8\ud563\ud557\ud575\ud504\ud5fb\ucb11\ud5b8\ud5d0\ud67d\uc8f3\ud624\ud64c\ud6e0\ud6c2\uc806\ud681\ud727\ud637\ud7a7\ud71d\ud7a3\ud7cc\ud7a6\ud781\ud786", 53621));
                }
                if (this._II > 0) {
                    this.IIl_.IIIl.IIol(IO0_.I1_o("\ud123\ucf55\ud193\ud1bc\ud199\ud2f0\ud20f\ud23d\ud20c\ud2f9\ud28b", 53621) + this._II + IO0_.I1_o("\ud155\ud1f3\ud1da\ud130\ud188\ud230\ud241\ucca1\ud20c", 53621));
                }
                this._II -= 3;
                if (this._II <= 0) {
                    this._II = -1;
                    this.IIl_.IlOl(21 + iOol.lOlI);
                }
            }
            return;
        }
        if (!IO0_.Il_1()) {
            this._II = 30;
            this.I_1I = 0L;
            return;
        }
        if (l - this.I_1l < 1000L) {
            return;
        }
        this.I_1l = l;
        if (this.IIl1.nextInt(100) < 1 && iOol._l0l == 9) {
            this.IIIl(46, IO0_.I1_o("\ud1af\ud1f9\ud193\ud1b0\ud190\ud27c\ud24e\ud26e\ud215\ud260\ud28b\ud2a8\ud210\ud369\ud307", 53621) + iOol.II1o);
            this.IIl_.IIIl.IIol(IO0_.I1_o("\ud137\ucf35\ud1dd\ud1f2\ud0e0\ud2f3\ud20f\ud22c\ucca6\ud2ac\ud2e9\ud2ab\ud28b\ud361\ud236\ud3a4\ud31c\ud3a4\ud3d7\ud3aa\ud315\ud469\ud43f\ud453\ud434\ud496\ud4f5", 53621));
            iOol._l0l = 10;
            this.IIl_.ll_l();
        } else if (this.IIl1.nextInt(50) < 1 && iOol._l0l == 10) {
            this.IIIl(44, IO0_.I1_o("\ud1af\ud1f9\ud193\ud1b0\ud190\ud27c\ud24e\ud26e\ud215\ud260\ud28b\ud2a8\ud210\ud369\ud307\ud32e\ud396\ud3e5\ud383\ud3a5\ud388\ucaa3\ud476\ud41e\ud43e\ud414\ud4f4\ud49a", 53621) + iOol.II1o);
            this.IIl_.IIIl.IIol(IO0_.I1_o("\ud137\ucf35\ud1dd\ud1f2\ud0e0\ud2f3\ud20f\ud35f\ud3dd\ucc6f\ud2c8\ud2ea\ud23d\ud37b\ud34e\ud328\ud345\ud3e3\ud3ca\ucd61\ud388\ud420\ud47d\ud4c7\ud43c\ud45c\ud4f6\ud450", 53621));
            iOol._l0l = 9;
            this.IIl_.ll_l();
        }
    }

    void II_1(IO_I.III iII) {
        IOol iOol = this.IIl_.II;
        if (!IO0_.II0O(iOol.lOlo)) {
            return;
        }
        this.l1__ += iII.II.lIlI.equals(IO0_.I1_o("\ud138\ud1d5\ud1f1\ud187\ud1ae\ud221\ud21d\ud206", 53621)) ? 25 : 10;
        this.llO_();
        if (this.l1__ >= 10 && iOol.lOlo != 120) {
            this.IIl_.II.III(5, 3001, IO0_.I1_o("\ud138\ud1f5\ud1c6\ud1f2\ud0e0\ud279\ud20f\ud238\uccb6\ud2e5\ud28b\ud2be\ud288\ud328\ud35f\ud333\ucdb4\ud3ea\ud3c4\ud3e2\ud395\ucaa7\ud471\ud459\ud47d\ud408\ud4f2\uca05\ud4a9\ud4d8\ud563\ud55e\ud530\ud51b", 53621), new String[]{IO0_.I1_o("\ud13a\ud1df", 53621)});
        }
    }

    boolean IIlI(int n, int n2) {
        if (n != 3001) {
            return false;
        }
        if (n2 == 0 && this.l1__ >= 10 && this.IIl_.II.lOlo != 120) {
            this.llO0();
        }
        return true;
    }

    private void llO0() {
        int n = IO0_.IIOO(this.IIl_.II.lOlo);
        if (n == this.IIl_.II.lOlo) {
            return;
        }
        this.IIl_.II.lO1 = 0;
        this.IIl_.III_(n, 100 + this.IIl1.nextInt(400), 100);
    }

    private boolean Il__() {
        return System.currentTimeMillis() < this.I_1;
    }

    void llOo() {
        IOol iOol = this.IIl_.II;
        if (iOol._l0l != 9) {
            this.IIl_.II.III1(44, IO0_.I1_o("\ud13b\ud1f3\ud003\ud073\ud198\ud230\ud247\ud2ad\ud214\ud2ac\ud2dd\ucc0b\ud2c9\ud378\ud34f\ud323\ud345\ud3e7\ucd44\ud3a3\ud3c1\ud46d\ud4f3\ud450\ud435\ud45c\ud4f6\ud45a\ud4f9\ud48c\ud57f\ucbf5\ud575\ud51c\ud5fa\ucb75\ud5bf", 53621));
            return;
        }
        this.IIl1.removeAllElements();
        Vector<String> vector = new Vector<String>();
        vector.addElement(IO0_.I1_o("\ud13d\ud024\ucf68\ud1bc\ud196\ud21a\ud24b\ucce5\ud203\ud286\ud2df\ud2a2\ud203\ud365", 53621));
        this.IIl1.addElement(IO0_.I1_o("\ud11d\ud1f0", 53621));
        if (!this.Il__()) {
            vector.addElement(IO0_.I1_o("\ud132\ud1fd\ucf10\ud1bb\ud1d1\ud264\ud25d\ucca5\ud267\ud2fc\ud2c3\ud223\ud299\ud328\ud353\ud32e\ud310\ucd29\ud3d7\ud3c8\ud3d0\ud420\ud471\ud459\uca90\ud41f", 53621));
            this.IIl1.addElement(IO0_.I1_o("\ud112\ud1e0", 53621));
        }
        if (this.l1__ >= 10 && iOol.lOlo != 120) {
            vector.addElement(IO0_.I1_o("\ud12d\ud1e1\ucf62\ud1bc\ud196\ud21a\ud27b\ucce9\ud203\ud2eb\ud28b\ud2ae\ud359\ucdd3\ud34e", 53621));
            this.IIl1.addElement(IO0_.I1_o("\ud111\ud1fb\ud1c4\ud1bc", 53621));
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        this.IIl_.II.IIII(44, 6, IO0_.I1_o("\ud065\ucf7f\ud1dd\ud1b5\ud1d1\ud266\uccf6\ud227\ud24d\ud2f4\ud2ce\ud2a7\ud2c9\ud37c\ud34f\ud2f6\ucdb8\ud3ea\ud3c4\ud3e2\ud3a3\ud461\ud47d\ud457\ud54c\ud49e\ud4e2\ud496\ud4f9\ud496\ud570\ud557\ud52c\ud554\ud482\ucb0d\ud5bf\ud5d0\ud66c\ud646\ud62c\ud64c\ud6e3\uc805\ud6a7\ud6c8\ud76b\ud7c6\ud765\ud710\ud7eb\uc905\ud7af\ud7c0\ud792\ud87f\ud81d\ud94d\uc6da\ud8f5\ud899\ud8ab\ud9de\ud936\ud977\ud93d\ud911\ud9fb\ud8a0\ud932\ud996\uda2e\uda46\uda24\uda02\udaaa\udaca\uda3a\uda89\udb26\udb56\uc595\udb0d\udbe5\udb81\udba3\udab6\udb90\udc7a\udc1c\udc2b\udc12\uc23a\udcd1\udcf7\udc85\uc3f6\udd14\udd3b\uc3dd\uddff\udd90\udcde\uc34b\ude74\ude0d", 53621), (String[])objectArray);
    }

    void ll0() {
        IOol iOol = this.IIl_.II;
        if (iOol._l0l != 10) {
            this.IIl_.II.III1(46, IO0_.I1_o("\ud13b\ud1f3\ud003\ud073\ud198\ud230\ud247\ud2ad\ud214\ud2ac\ud2dd\ucc0b\ud2c9\ud378\ud34f\ud323\ud345\ud3e7\ucd44\ud3a3\ud3c1\ud46d\ud4f3\ud450\ud435\ud45c\ud4f6\ud45a\ud4f9\ud48c\ud57f\ucbf5\ud575\ud51c\ud5fa\ucb75\ud5bf", 53621));
            return;
        }
        this.IIl1.removeAllElements();
        Vector<String> vector = new Vector<String>();
        vector.addElement(IO0_.I1_o("\ud13d\ud024\ucf68\ud1bc\ud196\ud21a\ud24b\ucce5\ud203\ud286\ud2df\ud2a2\ud203\ud365", 53621));
        this.IIl1.addElement(IO0_.I1_o("\ud11d\ud1f0", 53621));
        if (!this.Il__()) {
            vector.addElement(IO0_.I1_o("\ud132\ud1fd\ucf10\ud1bb\ud1d1\ud264\ud25d\ucca5\ud267\ud2fc\ud2c3\ud223\ud299\ud328\ud353\ud32e\ud310\ucd29\ud3d7\ud3c8\ud3d0\ud420\ud471\ud459\uca90\ud41f", 53621));
            this.IIl1.addElement(IO0_.I1_o("\ud112\ud1e0", 53621));
        }
        if (this.l1__ >= 10 && iOol.lOlo != 120) {
            vector.addElement(IO0_.I1_o("\ud12d\ud1e1\ucf62\ud1bc\ud196\ud21a\ud27b\ucce9\ud203\ud2eb\ud28b\ud2ae\ud359\ucdd3\ud34e", 53621));
            this.IIl1.addElement(IO0_.I1_o("\ud111\ud1fb\ud1c4\ud1bc", 53621));
        }
        vector.addElement(IO0_.I1_o("\ud123\ucf55\ud193\ud1bc\ud199\ud2f0", 53621));
        this.IIl1.addElement(IO0_.I1_o("\ud11d\ud1fb\ud1de\ud1b7", 53621));
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        this.IIl_.II.IIII(46, 7, IO0_.I1_o("\ud137\ucf59\ud1dd\ud1f2\ud1ba\ud271\ud246\ud2ba\ud24d\ud2e8\ud2c4\ud2ea\ud28a\ud367\ud349\ud366\ud30b\ud3ec\ud350\ud3a1\ud3c1\ud4d4\ud46c\ud457\ud433\ud45c\ud4f8\uca1d\ud4b4\ud4d8\ud406\ucb91\ud520\ud554\ud482\ud551\ud5f1\ud593\ud6fc\ud60e\ud620\uc8db\ud6ff\ud68a\ud6bd\uc849\ud76e\ud706\ud654\ud786\ud7fa\ud78c\ud7ef\ud7ce\ud7b7\ud8fd\ud844\ud87c\ud818\ud8f2\ud8cc\uc671\ud899\ud936\ud957\uc79f\ud953\ud9b5\ud9e5\ud9b9\uc750\uda7e\uda0d\uda27\uda03\uda6b\udaca\udaa0\udac0\udb26\udb4b\udb2c\udb8a\udba3", 53621), (String[])objectArray);
    }

    boolean III1(int n, int n2, int n3) {
        if (n2 != 6 && n2 != 7) {
            return false;
        }
        if (n3 < 0 || n3 >= this.IIl1.size()) {
            return true;
        }
        String string = (String)this.IIl1.elementAt(n3);
        if (string.equals(IO0_.I1_o("\ud11d\ud1f0", 53621))) {
            this.IIl_.II.III1(n, IO0_.I1_o("\ud121\ucf35\ud1da\ud1f2\ud19a\ud278\ud25a\ud26e\ud21b\ucc7d\ud2c8\ud2ea\ud287\ud3e8\ud35e\ud36a\ud345\ud3f0\ud3c2\ud3e2\ud2f0\ud4e3\ud43f\ud45a\ud4a4\ud412\ud4fc\ud49a\ud4b4\ud499\ud537\ud546\ud53d\ud595\ud5e3\ud592\ud5a1\ud598\ud660\ud640\ud62a\ud64c\uc82e\ud6c4\ud6c1\ud68c\ud7fe\ud706\ud726\ud785\ud7e0\ud782\ud7af\ud787\ud64f\ud9bf\ud854\ud87c\ud818\ud869\ud899\ud8b5\uc656\ud978\ud95d\ud974\ud862\uc72d\ud9df\ud9f0\ud8fe\udaec\uda58\uda44\uda08\udbe3\udac7\udaaf\udac7\udb75\uc598\udb64\udb17\udbf0\uc57e\udbe0\udbab\udb96\udcfd\udc52\udc33\udc5a\udce0\uc207\udca2\udcd6\udc04\udd41\uc382\udd1b\uddb1\uddde\udda7\udc5e\ude2d\ude42\ude23\ude0b\udefc\udea2\ude84\ude8e\uc1cc\udf04\udf20\udf91\udfa1\udfd4\udfde\udffe\udf8b\ufec7\ue052\ue07a\ue01a\ue0f7\ue0d9\ue0f6\ue09b\ue17c\ue1c0\ue131\ue151\ue144\ue1dc\ue1a7\ue183\ue22c\ue246\ufc91\ue200\ue2a8\ue2c0\ue2af\ufc46\ue36d\ue303\ue253\ue2d1\ufd63\ue3fc\ue39e\ue3b0\ue39d\ue43b\ue44a\ue431\ue499\ue4e7\ue496\ue4bb\ue414\ue56a\ue53a\ue51a\ue518\ue5e6\ue58e\ue4dc\ue51f\ue62b\ue659\uf8a0\ue60b\ue6a7\ue6cb\uf864\ue68a\ue76b\ue702\ue722\uf987\ue71e\ue7be\ue7d3\ue7bb\ue64b\ue9bb\ue850\ue878\ue804\uf62b\ue895\ue9c5\ue943\uf7f1\ue952\ue958\ue908\ue9e7\uf70e\ue9a5\ue9cb\uea7a\uea41\ueabb\uea09\ueae1\uea85\ueab0\uea8b\ueb67\ueb4e\ueb60\uea4e\ueb17\uf55e\uebd1\uebfb\ueb8e\uecf4\uec5b\uec3f\uec56\uecf9\ueddd\uecaa\uecd2\ued39\ued64\ued03\ued47\ued87\uede7\ueda3\ued83\uee29\uef39\uf0a0\uee46\uef94\ueecd\uf000\uee8f\uef21\uef54\uefd2\uef3d\uef15\uefbc\uefd7\ueeb3\uef80\uf038\uf055\ueee7\uf01b\uf0f3\uf093\uf0b1\uf010\uf173\uf147\uf146\uf105\uef2d\uf18b\uf1a6\uef42\uf266\uf207\uf228\uf20d\uf2e5\uf2d6\uf2e2\uf289\uf36f\ueda8\uf35d\uf37d\uf314\ued3a\uf39a\uf3bb\uf397\uf464\uf445\uf45d\uf400\uf4f2\uf492\uf4a2\uea4d\uf52f\uf43f\uf4fd\uf50d\uf5ab\uf5c4\uf5ae\uf458\uf7a6\uf64f\uf665\uf61c\uf6f6\ue873\uf6af\uf687\uf6df\uf76a\ue99a\uf732\uf71c\uf7ba\uf7cd\uf7b1\ue948\uf866\uf815\uf820\uf81b\uf8f7\uf8de", 53621));
        } else if (string.equals(IO0_.I1_o("\ud112\ud1e0", 53621))) {
            if (this.IIl_.II.lOoO < 1) {
                this.IIl_.IIIl.IIol(IO0_.I1_o("\ud137\ucf35\ud1dd\ud1f2\ud19a\ud278\ud2db\ud220\ud20a\ud2ac\ud2c8\ud239\ud2c9\ud219\ucdc0\ud366\ud30b\ud3e3\ucd6e\ud3a1", 53621));
                return true;
            }
            --this.IIl_.II.lOoO;
            this.IIl_.IIIl.l1_();
            this.I_1 = System.currentTimeMillis() + 600000L;
            this.IIl_.II(new IO0o(-106).III(3778).III(600));
            this.IIl_.IIIl.IIol(IO0_.I1_o("\ud125\ud1fc\ud15a\ud1a2\ud1d1\ud264\ud247\ud23b\uccc0\ud2f8\ud28b\ud3db\ud20a\ud328\ud236\ud2f6\ucd86\ud3e7\ud383\ud3a5\ud388\ucaa3\ud476\ud41e\ud429\ud40e\uca70\ud496\ud4f9\ud48b\ucbfe\ud555\ud575\ud465\ud572\ud5dc\ud5b9\ud5d0\ud66c\uc8c9\ud62c\ud64c\ud6e9\uc80b\ud6a7\ud6c8\ud616\ud7c5\ud765\ud710\ud680\ud7cc\ud7a6\ud7c0\ud78b\ud876\ud858\ud833\ud85b\ud98b\ud8d0\uc61b\ud89a\ud936\ud941\ud9b9\ud910\ud9fa\ud991\ud9bc\ud886\uda77", 53621));
        } else if (string.equals(IO0_.I1_o("\ud111\ud1fb\ud1c4\ud1bc", 53621))) {
            if (this.l1__ >= 10 && this.IIl_.II.lOlo != 120) {
                this.llO0();
            }
        } else if (string.equals(IO0_.I1_o("\ud11d\ud1fb\ud1de\ud1b7", 53621))) {
            this.IIl_.IlOl(21 + this.IIl_.II.lOlI);
        }
        return true;
    }

    private static /* synthetic */ String I1_o(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

