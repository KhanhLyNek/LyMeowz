/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import nrolite.Res;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IOO {
    public static IIII[] II;
    public static III[] II;
    public static II[] II;
    public static Hashtable III0;
    public static IIIl[] II;
    public static III1[] II;
    private static boolean IlO0;
    private static final String lIl_ = "42:60000,43:55000,44:50000,45:45000,46:40000,47:35000,51:34000,52:38000,53:40000,54:42000,55:44000,56:55000,57:50000,58:45000,59:40000,60:35000,70:360000,71:350000,72:340000,73:330000,74:320000,75:310000,76:300000,77:360000,78:350000,79:340000,80:330000,81:320000,82:310000,83:300000,84:360000,85:390000,86:420000,87:450000,88:480000,89:510000,90:540000,91:300000,92:310000,93:320000,94:330000,95:340000,96:350000,97:360000,98:120000,99:120000,100:120000,101:120000,102:120000,103:120000,104:120000,121:75000,122:80000,123:85000,124:90000,125:95000,126:100000,127:105000,135:210000,136:205000,137:200000,138:195000,139:190000,140:185000,141:180000,144:34000,145:36000,146:38000,147:40000,148:42000,153:35000,154:40000,155:45000,156:170000,157:160000,158:150000,159:140000,160:130000,161:120000,162:110000,163:100000,164:90000,165:80000,166:170000,167:160000,168:150000,169:140000,170:130000,171:120000,172:110000,173:100000,174:90000,175:80000,176:170000,177:160000,178:150000,179:140000,180:130000,181:120000,182:110000,183:100000,184:90000,185:80000";
    private static final String[] Il_l;
    private static final int[] I_l;

    private IOO() {
    }

    public static synchronized void I___() {
        if (IlO0) {
            return;
        }
        IlO0 = true;
        try {
            Object object;
            int n;
            Object object2;
            int n2;
            int n3;
            DataInputStream dataInputStream = IOO.II(IOO.I11_("\u6f24\u6f07\u6fe5\u6fd5\u6feb\u6f86\u706a\u704c", 28489));
            if (dataInputStream != null) {
                n3 = dataInputStream.readShort();
                II = new IIII[n3];
                for (n2 = 0; n2 < n3; ++n2) {
                    object2 = new IIII();
                    object2.I1l = dataInputStream.readShort();
                    object2.IoI_ = dataInputStream.readByte();
                    object2.II1o = dataInputStream.readUTF();
                    object2.llIl = dataInputStream.readInt();
                    object2.l0o = dataInputStream.readByte();
                    object2.l0oI = dataInputStream.readByte();
                    IOO.II[n2] = object2;
                }
            }
            if ((dataInputStream = IOO.II(IOO.I11_("\u6f20\u6f1c\u6fe2\u6fcb\u6fb6\u6fca\u7061\u704b\u702f", 28489))) != null) {
                n3 = dataInputStream.readShort();
                n2 = 0;
                object2 = new III[n3];
                for (n = 0; n < n3; ++n) {
                    object = new III();
                    ((III)object).I1l = dataInputStream.readShort();
                    ((III)object).IoI_ = dataInputStream.readByte();
                    ((III)object).lOlI = dataInputStream.readByte();
                    ((III)object).I101 = dataInputStream.readLong();
                    ((III)object).II1o = dataInputStream.readUTF();
                    ((III)object).lOo0 = dataInputStream.readShort();
                    ((III)object).Io11 = dataInputStream.readByte() != 0;
                    ((III)object).lOl_ = dataInputStream.readByte();
                    ((III)object).lOo_ = dataInputStream.readInt();
                    object2[n] = object;
                    if (((III)object).I1l <= n2) continue;
                    n2 = ((III)object).I1l;
                }
                II = new III[n2 + 1];
                for (n = 0; n < n3; ++n) {
                    IOO.II[object2[n].I1l] = object2[n];
                }
            }
            dataInputStream = IOO.II(IOO.I11_("\u6f3a\u6f03\u6fee\u6fca\u6fa9\u6f97\u702d\u7040\u7028\u700e", 28489));
            III0 = new Hashtable();
            if (dataInputStream != null) {
                n3 = dataInputStream.readShort();
                for (n2 = 0; n2 < n3; ++n2) {
                    object2 = new IIIO();
                    object2.I1l = dataInputStream.readShort();
                    object2.lO0I = dataInputStream.readByte();
                    object2.l0oo = dataInputStream.readByte();
                    object2.l1__ = dataInputStream.readByte();
                    object2.lo = dataInputStream.readShort();
                    object2.loI = dataInputStream.readShort();
                    object2.loII = dataInputStream.readByte();
                    object2.loIl = dataInputStream.readShort() & 0xFFFF;
                    object2.I101 = dataInputStream.readLong();
                    object2.l1_0 = dataInputStream.readShort();
                    object2.l1_o = dataInputStream.readShort();
                    object2.loI1 = dataInputStream.readShort();
                    III0.put(new Integer(object2.I1l), object2);
                }
                String[] stringArray = IOO.I11_("\u6f7d\u6f5a\u6fbd\u6f90\u6ff5\u6fd4\u7033\u7012\u706d\u7054\u704c\u70a4\u7088\u70e9\u70cb\u712a\u7109\u7174\u7143\u71a2\u718f\u71e1\u71c3\u7222\u7201\u7260\u7243\u72ba\u7298\u72f6\u72df\u733f\u7319\u7378\u7357\u73aa\u7391\u73f2\u73d9\u7436\u7411\u7470\u746f\u744e\u74b1\u7488\u74ec\u74c0\u752a\u750d\u7567\u7546\u75a5\u7598\u75e6\u75c3\u762b\u7603\u767b\u765e\u76bd\u769c\u76e7\u76df\u773b\u7712\u7774\u775e\u77b5\u7794\u77f3\u77ce\u7834\u7813\u7805\u786a\u784d\u78ac\u788b\u78ea\u78d5\u792d\u7903\u796c\u7941\u79a6\u7983\u79e2\u79c1\u7a3c\u7a1a\u7a7b\u7a57\u7ab8\u7a9f\u7afa\u7ad9\u7b38\u7b0b\u7b73\u7b53\u7bbe\u7b96\u7bf7\u7bd1\u7c30\u7c2f\u7c12\u7c68\u7c4b\u7ca1\u7c8f\u7ce9\u7cc8\u7d27\u7d06\u7d79\u7d41\u7dab\u7d88\u7de5\u7dc5\u7e3f\u7e1e\u7e7d\u7e40\u7ebe\u7e93\u7ef3\u7edc\u7f37\u7f16\u7f75\u7f54\u7faf\u7f94\u7ff1\u7fda\u7fcc\u802b\u800d\u806c\u804b\u80b6\u808e\u80e8\u80cd\u8125\u8103\u8164\u8143\u81a2\u8181\u81fc\u81d8\u823f\u8217\u827f\u825e\u82ba\u8299\u82f8\u82d7\u832a\u8312\u8376\u8359\u83b1\u8395\u83f0\u83ef\u83ce\u842d\u8410\u846c\u8449\u84a3\u848b\u84e4\u84c6\u8525\u8504\u8563\u855e\u85a6\u8584\u85f5\u85dd\u863f\u861c\u867b\u865a\u86b9\u8684\u86f0\u86d3\u873f\u8717\u8772\u8752\u87b1\u8790\u878f\u87f2\u87ca\u882a\u8801\u8869\u8849\u88a8\u8887\u88e6\u88c5\u8938\u8904\u8965\u894b\u89a3\u8999\u89fe\u89dd\u8a3c\u8a1b\u8a66\u8a5e\u8ab0\u8a9d\u8af5\u8ad0\u8b34\u8b13\u8b72\u8b51\u8bac\u8ba8\u8b87\u8be7\u8bcf\u8c2f\u8c0a\u8c69\u8c48\u8ca7\u8c9a\u8ced\u8cc4\u8d29\u8d01\u8d62\u8d40\u8dbf\u8d9e\u8dfd\u8dc0\u8e33\u8e1b\u8e73\u8e5b\u8eb5\u8e96\u8ef5\u8ed4\u8f33\u8f0e\u8f79\u8f52\u8f45\u8fad\u8f8c\u8fec\u8fcb\u902a\u9009\u9074\u904f\u90a5\u908f\u90e7\u90c3\u9122\u9101\u9160\u915f\u91a2\u9195\u91f8\u91d1\u9239\u921f\u9278\u9257\u92b6\u9295\u92e8\u92db\u9337\u931b\u9373\u9366\u934e\u93ad\u938c\u93eb\u93d6\u9421\u940e\u946d\u9442\u94a7\u9484\u94e3\u94c2\u9521\u951c\u9577\u9559\u95b7\u9598\u95fe\u95da\u9639\u9618\u9677\u964a\u96bd\u969c\u96f9\u96d6\u9739\u9710\u970f\u976e\u974d\u97b0\u9783\u97e3\u97c3\u982d\u9806\u9866\u9845\u98a4\u9883\u98fe\u98c8\u9920\u9915\u997b\u9959\u99bc\u999b\u99fa\u99d9\u9a24\u9a1e\u9a77\u9a5f\u9ab7\u9a93\u9af2\u9ad1\u9b30\u9b2f\u9b12\u9b64\u9b4e\u9ba1\u9b89\u9be8\u9bc8\u9c27\u9c06\u9c65\u9c58\u9caa\u9c81\u9ceb\u9cc3\u9d3d\u9d1e\u9d7d\u9d5c\u9dbb\u9d86\u9df0\u9ddc\u9e3d\u9e15\u9e76\u9e54\u9eb3\u9e92\u9ef1\u9ecc\u9ec6\u9f2b\u9f07\u9f6f\u9f4f\u9faa\u9f89\u9fe8\u9fc7\ua03a\ua00c\ua062\ua049\ua0a1\ua084\ua0e0\ua0df\ua13e\ua11d\ua160\ua152\ua1bd\ua193\ua1fb\ua1d1\ua236\ua215\ua274\ua253\ua2ae\ua298\ua2f8\ua2e5\ua2cf\ua32f\ua30c\ua36b\ua34a\ua3a9\ua394\ua3ee\ua3cf\ua42f\ua405\ua461\ua442\ua4a1\ua480\ua4ff\ua4c2\ua53c\ua51c\ua57b\ua550\ua5b8\ua59a\ua5f7\ua5d6\ua635\ua614\ua66f\ua653\ua6b1\ua691\ua685\ua6ef\ua6cf\ua72c\ua70b\ua76a\ua749\ua7b4\ua786\ua7e6\ua7c7\ua82e\ua802\ua860\ua841\ua8a0\ua89f\ua8fe\ua8c1\ua93d\ua91b\ua979\ua953\ua9b9\ua995\ua9f6\ua9d5\uaa34\uaa13\uaa6e\uaa50\uaab0\uaaab\uaa84\uaaec\uaace\uab2b\uab0a\uab69\uab48\uabbb\uab87\uabe7\uabc5\uac29\uac05\uac64\uac40\uacbf\uac9e\uace1\uacdd\uad39\uad18\uad73\uad50\uadb7\uad96\uadf5\uadd4\uae2f\uae13\uae73\uae53\uae45\uaea6\uae88\uaeec\uaecb\uaf2a\uaf15\uaf69\uaf45\uafa2\uaf8f\uafed\uafc3\ub022\ub001\ub060\ub043\ub0bf\ub09f\ub0f9\ub0d1\ub133\ub11c\ub178\ub157\ub1b6\ub189\ub1f5\ub1d1\ub234\ub21b\ub271\ub26f\ub24e\ub2ad\ub28c\ub2eb\ub2d6\ub328\ub30a\ub360\ub34c\ub3a4\ub384\ub3e6\ub3c2\ub421\ub400\ub463\ub45f\ub4be\ub499\ub4f1\ub4d8\ub538\ub518\ub577\ub556\ub5b5\ub588\ub5f2\ub5d1\ub637\ub61a\ub60d\ub66e\ub648\ub6ac\ub68b\ub6ea\ub6d5\ub729\ub704\ub761\ub74f\ub7a6\ub783\ub7e2\ub7c1\ub820\ub81f\ub862\ub85c\ub8bf\ub893\ub8f0\ub8d8\ub931\ub912\ub976\ub955\ub9b4\ub98f\ub9f3\ub9d2\uba39\uba25\uba0f\uba64\uba4c\ubaab\uba8a\ubae9\ubad4\ubb26\ubb02\ubb65\ubb4e\ubba2\ubb8a\ubbe4\ubbc0\ubc3f\ubc1e\ubc61\ubc5d\ubcbf\ubc9b\ubcf3\ubcd9\ubd3f\ubd16\ubd75\ubd54\ubdb3\ubd8e\ubdf0\ubdd4\ubdcb\ube24\ube0e\ube68\ube4b\ubeaa\ube89\ubef4\ubec6\ubf22\ubf00\ubf6e\ubf40\ubfa4\ubf81\ubfe0\ubfdf\uc022\uc01c\uc078\uc05d\uc0b0\uc09a\uc0f0\uc0d7\uc136\uc115\uc168\uc152\uc1b6\uc196\uc1fa\uc1eb\uc1ce\uc22d\uc20c\uc26b\uc256\uc2a8\uc28c\uc2ef\uc2cc\uc321\uc306\uc363\uc342\uc3a1\uc39c\uc3fe\uc3db\uc43e\uc416\uc478\uc45f\uc4b9\uc498\uc4f7\uc4ca\uc534\uc511\uc577\uc558\uc5b5\uc590\uc58f\uc5ee\uc5cd\uc630\uc60a\uc66f\uc64c\uc6a2\uc683\uc6e3\uc6c5\uc724\uc703\uc77e\uc740\uc7a5\uc799\uc7f4\uc7dc\uc83b\uc81b\uc87a\uc859\uc8b8\uc88b\uc8f7\uc8d0\uc933\uc919\uc973\uc957\uc9b0\uc9af\uc98e\uc9ed\uc9d0\uca2a\uca0f\uca61\uca42\ucaa6\uca83\ucae5\ucac4\ucb23\ucb02\ucb7d\ucb41\ucbba\ucb97\ucbf7\ucbdd\ucc3f\ucc1a\ucc79\ucc58\uccb7\ucc8a\uccf4\uccd2\ucd33\ucd18\ucd70\ucd53\ucd4f\ucdae\ucd8d\ucdec\ucdd7\uce2b\uce0f\uce69\uce4d\ucea7\uce87\ucee4\ucec3\ucf22\ucf01\ucf7c\ucf5e\ucfb8\ucf9f\ucff6\ucfda\ud03b\ud019\ud078\ud057\ud0b6\ud089\ud0f5\ud0d5\ud131\ud11b\ud171\ud16f\ud14e\ud1ad\ud18c\ud1eb\ud1d6\ud228\ud20e\ud263\ud24c\ud2ac\ud284\ud2e3\ud2c2\ud321\ud31c\ud37e\ud358\ud3b8\ud396\ud3f3\ud3da\ud439\ud418\ud477\ud44a\ud4b4\ud492\ud4f5\ud4d8\ud530\ud517\ud50f\ud56e\ud54d\ud5ac\ud597\ud5eb\ud5cf\ud62f\ud60d\ud667\ud643\ud6a4\ud683\ud6e2\ud6c1\ud73c\ud71e\ud778\ud755\ud7b6\ud79a\ud7ff\ud7d9\ud838\ud817\ud876\ud849\ud8b5\ud895\ud8fb\ud8db\ud931\ud92b\ud90e\ud96d\ud94c\ud9ab\ud996\ud9e8\ud9cf\uda27\uda0c\uda64\uda47\udaa3\uda82\udae1\udac0\udb23\udb1f\udb7a\udb5d\udbb1\udb9b\udbfb\udbd8\udc37\udc16\udc75\udc48\udcb2\udc95\udcf3\udcda\udcce\udd2f\udd0d\udd6c\udd4b\uddaa\udd95\udde9\uddc0\ude25\ude0f\ude65\ude43\udea2\ude81\udee0\udedf\udf22\udf1c\udf7b\udf5f\udfb0\udf90\udff8\udfd7\ue036\ue015\ue068\ue052\ue0b5\ue094\ue0fa\ue0e7\ue0ce\ue12d\ue10c\ue16b\ue156\ue1a8\ue18f\ue1e1\ue1cc\ue224\ue203\ue263\ue242\ue2a1\ue280\ue2e3\ue2df\ue33a\ue31b\ue371\ue35b\ue3bf\ue398\ue3f7\ue3d6\ue435\ue408\ue472\ue455\ue4b9\ue49a\ue48e\ue4eb\ue4cd\ue52c\ue50b\ue56a\ue555\ue5a9\ue580\ue5ef\ue5cf\ue625\ue607\ue662\ue641\ue6a0\ue69f\ue6e2\ue6dc\ue734\ue71b\ue770\ue758\ue7bb\ue797\ue7f6\ue7d5\ue834\ue80f\ue873\ue859\ue8b1\ue8a5\ue88f\ue8ef\ue8cc\ue92b\ue90a\ue969\ue954\ue9a6\ue98e\ue9e7\ue9ce\uea22\uea03\uea61\uea40\ueabf\uea9e\ueae1\ueadd\ueb33\ueb19\ueb73\ueb59\uebb7\ueb96\uebf5\uebd4\uec33\uec0e\uec70\uec58\uec4b\ueca4\uec84\uecec\ueccb\ued2a\ued09\ued74\ued46\uedae\ued80\uedee\uedcb\uee22\uee01\uee60\uee5f", 28489).split(IOO.I11_("\u6f65", 28489));
                for (int i = 0; i < stringArray.length; ++i) {
                    n = stringArray[i].indexOf(58);
                    object = (IIIO)III0.get(new Integer(Integer.parseInt(stringArray[i].substring(0, n))));
                    if (object == null) continue;
                    ((IIIO)object).loIl = Integer.parseInt(stringArray[i].substring(n + 1));
                }
            }
            if ((dataInputStream = IOO.II(IOO.I11_("\u6f20\u6f06\u6ff3\u6fd4\u6fac\u6f8a\u7070\u704b\u7022\u704e\u701d\u70f7\u70d3", 28489))) != null) {
                n3 = dataInputStream.readShort();
                II = new II[n3];
                for (int i = 0; i < n3; ++i) {
                    II iI = new II();
                    iI.I1l = dataInputStream.readShort();
                    iI.II1o = dataInputStream.readUTF();
                    iI.l00_ = dataInputStream.readShort();
                    iI.l00O = dataInputStream.readShort();
                    iI.l000 = dataInputStream.readShort();
                    iI.l00o = dataInputStream.readShort();
                    iI.lOo0 = dataInputStream.readShort();
                    iI.lOlI = dataInputStream.readByte();
                    IOO.II[i] = iI;
                }
            }
            if ((dataInputStream = IOO.II(IOO.I11_("\u6f27\u6f18\u6fe4\u6fd5\u6feb\u6f86\u706a\u704c", 28489))) != null) {
                n3 = dataInputStream.readShort();
                II = new IIIl[n3];
                for (int i = 0; i < n3; ++i) {
                    IIIl iIIl = new IIIl();
                    iIIl.I1l = dataInputStream.readShort();
                    iIIl.II1o = dataInputStream.readUTF();
                    iIIl.IO_l = dataInputStream.readShort();
                    IOO.II[i] = iIIl;
                }
            }
            if ((dataInputStream = IOO.II(IOO.I11_("\u6f3a\u6f00\u6fe8\u6fd6\u6fb6\u6fca\u7061\u704b\u702f", 28489))) != null) {
                III_[] iII_Array;
                int n4;
                n3 = dataInputStream.readShort();
                II = new III1[n3];
                for (n4 = 0; n4 < n3; ++n4) {
                    III1 iII1 = new III1();
                    iII1.I1l = dataInputStream.readShort();
                    iII1.l0ol = dataInputStream.readShort();
                    iII1.lIlO = dataInputStream.readUTF();
                    iII1.IoI_ = dataInputStream.readByte();
                    n = dataInputStream.readByte();
                    iII1.II = new III0[n];
                    for (int i = 0; i < n; ++i) {
                        iII_Array = new III0();
                        iII_Array.II1o = dataInputStream.readUTF();
                        int n5 = dataInputStream.readShort();
                        iII_Array.II = new III_[n5];
                        for (int j = 0; j < n5; ++j) {
                            III_ iII_ = new III_();
                            iII_.l0o1 = dataInputStream.readShort();
                            iII_.l0o_ = dataInputStream.readInt();
                            iII_.l0oO = dataInputStream.readByte();
                            iII_.Io1_ = dataInputStream.readByte() != 0;
                            iII_.Io1O = dataInputStream.readByte() != 0;
                            iII_.l0o0 = dataInputStream.readShort();
                            int n6 = dataInputStream.readByte();
                            iII_.II10 = new int[n6][2];
                            for (int k = 0; k < n6; ++k) {
                                iII_.II10[k][0] = dataInputStream.readUnsignedByte();
                                iII_.II10[k][1] = dataInputStream.readShort();
                            }
                            iII_Array.II[j] = iII_;
                        }
                        iII1.II[i] = iII_Array;
                    }
                    IOO.II[n4] = iII1;
                }
                for (n4 = 0; n4 < n3; ++n4) {
                    if (!IOO.I11_("\u6f1a\u6f29\u6fc9\u6ff2\u6f84\u6fbb\u704e\u706d\u701e\u7032\u7030\u70d0\u70fa\u7083\u70b3\u715b\u7177\u7110\u7128\u71c2\u71e7\u7195\u71bd\u7255", 28489).equals(IOO.II[n4].lIlO) || IOO.II[n4].II.length <= 0) continue;
                    III0 iII0 = IOO.II[n4].II[0];
                    n = 0;
                    for (int i = 0; i < iII0.II.length; ++i) {
                        if (iII0.II[i].l0o1 != 988) continue;
                        n = 1;
                    }
                    if (n != 0) continue;
                    III_ iII_ = new III_();
                    iII_.l0o1 = 988;
                    iII_.l0o_ = 1000000000;
                    iII_.l0oO = 0;
                    iII_.Io1_ = true;
                    iII_.Io1O = true;
                    iII_.l0o0 = 0;
                    iII_.II10 = new int[][]{{73, 0}};
                    iII_Array = new III_[iII0.II.length + 1];
                    System.arraycopy(iII0.II, 0, iII_Array, 0, iII0.II.length);
                    iII_Array[iII0.II.length] = iII_;
                    iII0.II = iII_Array;
                }
                for (n4 = 0; n4 < n3; ++n4) {
                    if (!IOO.I11_("\u6f1a\u6f29\u6fc9\u6ff2\u6f84", 28489).equals(IOO.II[n4].lIlO) || IOO.II[n4].II.length <= 0) continue;
                    III0 iII0 = IOO.II[n4].II[IOO.II[n4].II.length - 1];
                    III_ iII_ = new III_();
                    iII_.l0o1 = 1703;
                    iII_.l0o_ = 50;
                    iII_.l0oO = 1;
                    iII_.Io1_ = true;
                    iII_.Io1O = true;
                    iII_.l0o0 = 0;
                    iII_.II10 = new int[0][2];
                    III_[] iII_Array2 = new III_[iII0.II.length + 1];
                    System.arraycopy(iII0.II, 0, iII_Array2, 0, iII0.II.length);
                    iII_Array2[iII0.II.length] = iII_;
                    iII0.II = iII_Array2;
                }
            }
        }
        catch (Exception exception) {
            System.out.println(IOO.I11_("\u6f12\u6f04\u6fee\u6fd2\u6fa0\u6fb9\u7023\u704e\u702e\u7009\u705f\u70f0\u70dc\u70ac\u70db\u717e\u714c\u7178\u711b\u71ff\u71d0\u71a1\u71c9\u7232", 28489) + exception);
        }
    }

    private static DataInputStream II(String string) {
        byte[] byArray = Res.read(string);
        return byArray == null ? null : new DataInputStream(new ByteArrayInputStream(byArray));
    }

    public static II II(int n) {
        IOO.I___();
        for (int i = 0; i < II.length; ++i) {
            if (IOO.II[i].I1l != n) continue;
            return II[i];
        }
        return null;
    }

    public static Vector III(int n) {
        IOO.I___();
        Vector<II> vector = new Vector<II>();
        for (int i = 0; i < II.length; ++i) {
            if (IOO.II[i].I1l == 0 || IOO.II[i].lOlI != n && IOO.II[i].lOlI != 3) continue;
            vector.addElement(II[i]);
        }
        return vector;
    }

    public static IIII II(int n) {
        IOO.I___();
        if (II == null) {
            return null;
        }
        for (int i = 0; i < II.length; ++i) {
            if (IOO.II[i].I1l != n) continue;
            return II[i];
        }
        return null;
    }

    public static III II(int n) {
        IOO.I___();
        return II != null && n >= 0 && n < II.length ? II[n] : null;
    }

    public static IIIO II(int n) {
        IOO.I___();
        return (IIIO)III0.get(new Integer(n));
    }

    public static IIIl II(int n) {
        IOO.I___();
        if (II == null) {
            return null;
        }
        for (int i = 0; i < II.length; ++i) {
            if (IOO.II[i].I1l != n) continue;
            return II[i];
        }
        return null;
    }

    public static Vector IIII(int n) {
        IOO.I___();
        Vector<III1> vector = new Vector<III1>();
        if (II != null) {
            for (int i = 0; i < II.length; ++i) {
                if (IOO.II[i].l0ol != n) continue;
                vector.addElement(II[i]);
            }
        }
        return vector;
    }

    private static String IIl1(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == ' ') {
                if (bl) continue;
                bl = true;
            } else {
                bl = false;
            }
            stringBuffer.append(c);
        }
        return stringBuffer.toString().trim();
    }

    public static IIII II(String string) {
        IOO.I___();
        String string2 = IOO.IIl1(string.toLowerCase());
        IIII iIII = null;
        if (II != null) {
            for (int i = 0; i < II.length; ++i) {
                String string3 = IOO.IIl1(IOO.II[i].II1o.toLowerCase());
                if (string3.length() <= 2 || string2.indexOf(string3) < 0 || iIII != null && string3.length() <= iIII.II1o.length()) continue;
                iIII = II[i];
            }
        }
        return iIII;
    }

    public static III II(String string) {
        IOO.I___();
        String string2 = string.toLowerCase();
        III iII = null;
        if (II != null) {
            for (int i = 0; i < II.length; ++i) {
                String string3;
                if (II[i] == null || IOO.II[i].II1o.length() < 3 || string2.indexOf(string3 = IOO.II[i].II1o.toLowerCase()) < 0 || iII != null && string3.length() <= iII.II1o.length()) continue;
                iII = II[i];
            }
        }
        return iII;
    }

    public static int II(III iII) {
        if (iII == null || iII.IoI_ != 7) {
            return -1;
        }
        for (int i = 0; i < Il_l.length; ++i) {
            if (iII.II1o.indexOf(Il_l[i]) < 0) continue;
            return I_l[i];
        }
        return -1;
    }

    public static int III(III iII) {
        if (iII == null) {
            return 0;
        }
        int n = iII.II1o.lastIndexOf(IOO.I11_("\u6f25\u6f1e", 28489));
        if (n < 0) {
            return 0;
        }
        int n2 = 0;
        for (int i = n + 2; i < iII.II1o.length(); ++i) {
            char c = iII.II1o.charAt(i);
            if (c < '0' || c > '9') continue;
            n2 = n2 * 10 + (c - 48);
        }
        return n2;
    }

    public static IIIO II(int n, int n2) {
        IOO.I___();
        Enumeration enumeration = III0.elements();
        while (enumeration.hasMoreElements()) {
            IIIO iIIO = (IIIO)enumeration.nextElement();
            if (iIIO.lO0I != n || iIIO.l1__ != n2) continue;
            return iIIO;
        }
        return null;
    }

    public static int IIO1(int n) {
        int n2 = 0;
        IOO.I___();
        Enumeration enumeration = III0.elements();
        while (enumeration.hasMoreElements()) {
            IIIO iIIO = (IIIO)enumeration.nextElement();
            if (iIIO.lO0I != n || iIIO.l1__ <= n2) continue;
            n2 = iIIO.l1__;
        }
        return n2;
    }

    public static III II(int n, int n2) {
        IOO.I___();
        if (II == null) {
            return null;
        }
        for (int i = 0; i < II.length; ++i) {
            III iII = II[i];
            if (iII == null || iII.IoI_ != 7 || IOO.II(iII) != n || IOO.III(iII) != n2) continue;
            return iII;
        }
        return null;
    }

    static {
        II = new II[0];
        Il_l = new String[]{IOO.I11_("\u6f0d\u6f1a\u6fe6\u6fc1\u6faa\u6f8a", 28489), IOO.I11_("\u6f02\u6f09\u6fea\u6fc3\u6faf\u6f8b\u7068\u704d", 28489), IOO.I11_("\u6f0d\u6f0d\u6fea\u6fc9\u6fab", 28489), IOO.I11_("\u6f04\u6f09\u6ff4\u6fc3\u6fab\u6f8f\u706c", 28489), IOO.I11_("\u6f0e\u6f09\u6feb\u6fcf\u6fa6\u6f8f", 28489), IOO.I11_("\u6f08\u6f06\u6ff3\u6fc9\u6fa8\u6f8d\u7060", 28489), IOO.I11_("\u6f1d\u6f00\u6f66\u6fcf\u6fe5\u6fa0\u71b3\u7183\u702f\u7007", 28489), IOO.I11_("\u6f1d\u6f1a\u714c\u6f86\u6fb1\u6f8c\u71b3\u7183\u702f\u7007", 28489), IOO.I11_("\u6f1d\u6f89\u6fee\u6f86\u6fb1\u7145\u706c", 28489), IOO.I11_("\u6f02\u6f09\u6fee\u6fc9\u6fae\u6f81\u706d", 28489), IOO.I11_("\u6f18\u6f1d\u7124\u6f86\u6fa6\u7143\u7076", 28489), IOO.I11_("\u6f01\u6f9b\u6fe6\u6f86\u6fae\u6f8c\u6eca", 28489), IOO.I11_("\u6f0b\u6f07\u6fea\u6f86\u6fad\u6f8d\u7023\u7051\u7028\u700e\u7017", 28489), IOO.I11_("\u6f04\u6f09\u6fec\u6fc7\u6fab\u6f8f\u706c\u7051\u7020\u7010\u700f\u70f1", 28489), IOO.I11_("\u6e59\u71d3\u6fa7\u6fd2\u6fb7\u710d\u706d\u7045", 28489), IOO.I11_("\u6f02\u6f00\u6fee\u6f4c\u6fab", 28489), IOO.I11_("\u6f1a\u6f9c\u6fe4\u6f52\u6fa9\u6f85", 28489), IOO.I11_("\u6f05\u6f01\u6f6d\u6fc8\u6fe5\u6f8c\u706c\u70c2\u702f", 28489), IOO.I11_("\u6f0d\u71a3\u6fe4\u6fce\u6fe5\u6fa7\u706b\u7057\u7038\u6ea3\u7011", 28489), IOO.I11_("\u6f01\u6f1d\u6f7a\u6fd2\u6fe5\u6fb7\u70e2\u704d", 28489), IOO.I11_("\u6f1d\u6f00\u6f73\u6fcf\u6fe5\u6fa9\u706a\u70c8\u702f", 28489), IOO.I11_("\u6f1d\u6f1a\u6f74\u6fcf", 28489)};
        I_l = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 14, 11, 12, 19, 18, 17, 20, 21, 22, 23};
    }

    private static /* synthetic */ String I11_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    public static final class IIII {
        public int I1l;
        public int IoI_;
        public int llIl;
        public int l0o;
        public int l0oI;
        public String II1o;
    }

    public static final class III {
        public int I1l;
        public int IoI_;
        public int lOlI;
        public int lOo0;
        public int lOl_;
        public int lOo_;
        public long I101;
        public String II1o;
        public boolean Io11;
    }

    public static final class IIIO {
        public int I1l;
        public int lO0I;
        public int l0oo;
        public int l1__;
        public int lo;
        public int loI;
        public int loII;
        public int loIl;
        public int l1_0;
        public int l1_o;
        public int loI1;
        public long I101;
    }

    public static final class II {
        public int I1l;
        public int l00_;
        public int l00O;
        public int l000;
        public int l00o;
        public int lOo0;
        public int lOlI;
        public String II1o;
    }

    public static final class IIIl {
        public int I1l;
        public int IO_l;
        public String II1o;
    }

    public static final class III1 {
        public int I1l;
        public int l0ol;
        public int IoI_;
        public String lIlO;
        public III0[] II;
    }

    public static final class III0 {
        public String II1o;
        public III_[] II;
    }

    public static final class III_ {
        public int l0o1;
        public int l0o_;
        public int l0oO;
        public int l0o0;
        public boolean Io1_;
        public boolean Io1O;
        public int[][] II10;
    }
}

