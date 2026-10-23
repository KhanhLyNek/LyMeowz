package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

final class IOOo {
    private static final int lo_o = 7;
    private static final int loO = -310720020;
    private final IO0 var_IO0_IIll;
    private final IOo_ var_IOo__IIll;
    private final Random IIlI = new Random();
    private boolean Iol_;
    private boolean I0oI;
    private int loOI = -1;
    private int loOl;
    private int loO1;

    IOOo(IO0 iO0, IOo_ iOo_) {
        this.var_IO0_IIll = iO0;
        this.var_IOo__IIll = iOo_;
    }

    static int[] III(int n) {
        switch (n) {
            case 892: {
                return new int[]{882, 883, 884};
            }
            case 893: {
                return new int[]{885, 886, 887};
            }
            case 908: {
                return new int[]{891, 892, 893};
            }
            case 909: {
                return new int[]{894, 895, 896};
            }
            case 910: {
                return new int[]{897, 898, 899};
            }
            case 916: {
                return new int[]{925, 926, 927};
            }
            case 917: {
                return new int[]{928, 929, 930};
            }
            case 918: {
                return new int[]{931, 932, 933};
            }
            case 919: {
                return new int[]{934, 935, 936};
            }
            case 936: {
                return new int[]{718, 719, 720};
            }
            case 942: {
                return new int[]{966, 967, 968};
            }
            case 943: {
                return new int[]{969, 970, 971};
            }
            case 944: {
                return new int[]{972, 973, 974};
            }
            case 967: {
                return new int[]{1050, 1051, 1052};
            }
            case 1008: {
                return new int[]{1074, 1075, 1076};
            }
            case 1039: {
                return new int[]{1089, 1090, 1091};
            }
            case 1040: {
                return new int[]{1092, 1093, 1094};
            }
            case 1046: {
                return new int[]{-1, -1, -1};
            }
            case 1107: {
                return new int[]{1155, 1156, 1157};
            }
            case 1114: {
                return new int[]{1158, 1159, 1160};
            }
            case 1188: {
                return new int[]{1183, 1184, 1185};
            }
            case 1202: {
                return new int[]{1201, 1202, 1203};
            }
            case 1203: {
                return new int[]{1201, 1202, 1203};
            }
            case 1207: {
                return new int[]{1077, 1078, 1079};
            }
            case 1224: {
                return new int[]{1227, 1228, 1229};
            }
            case 1225: {
                return new int[]{1233, 1234, 1235};
            }
            case 1226: {
                return new int[]{1230, 1231, 1232};
            }
            case 1243: {
                return new int[]{1245, 1246, 1247};
            }
            case 1244: {
                return new int[]{1248, 1249, 1250};
            }
            case 1256: {
                return new int[]{1267, 1268, 1269};
            }
            case 1318: {
                return new int[]{1299, 1300, 1301};
            }
            case 1347: {
                return new int[]{1302, 1303, 1304};
            }
            case 1414: {
                return new int[]{1341, 1342, 1343};
            }
            case 1435: {
                return new int[]{1347, 1348, 1349};
            }
            case 1452: {
                return new int[]{1365, 1366, 1367};
            }
            case 1458: {
                return new int[]{1368, 1369, 1370};
            }
            case 1482: {
                return new int[]{1398, 1399, 1400};
            }
            case 1497: {
                return new int[]{1401, 1402, 1403};
            }
            case 1550: {
                return new int[]{1428, 1429, 1430};
            }
            case 1551: {
                return new int[]{1425, 1426, 1427};
            }
            case 1564: {
                return new int[]{1437, 1438, 1439};
            }
            case 1568: {
                return new int[]{1443, 1444, 1445};
            }
            case 1573: {
                return new int[]{1446, 1447, 1448};
            }
            case 1596: {
                return new int[]{1473, 1474, 1475};
            }
            case 1597: {
                return new int[]{1473, 1474, 1475};
            }
            case 1611: {
                return new int[]{1488, 1494, 1495};
            }
            case 1620: {
                return new int[]{1496, 1497, 1498};
            }
            case 1621: {
                return new int[]{1496, 1497, 1498};
            }
            case 1622: {
                return new int[]{1488, 1489, 1490};
            }
            case 1629: {
                return new int[]{1505, 1506, 1507};
            }
            case 1630: {
                return new int[]{1508, 1509, 1510};
            }
            case 1631: {
                return new int[]{1513, 1516, 1517};
            }
            case 1633: {
                return new int[]{1523, 1524, 1525};
            }
            case 1654: {
                return new int[]{1526, 1529, 1530};
            }
            case 1668: {
                return new int[]{1550, 1551, 1552};
            }
            case 1682: {
                return new int[]{1558, 1559, 1560};
            }
            case 1683: {
                return new int[]{1561, 1562, 1563};
            }
            case 1686: {
                return new int[]{1572, 1573, 1574};
            }
            case 1727: {
                return new int[]{1616, 1617, 1618};
            }
            case 1729: {
                return new int[]{1621, 1622, 1623};
            }
            case 1750: {
                return new int[]{1464, 1465, 1466};
            }
            case 1765: {
                return new int[]{1662, 1663, 1664};
            }
            case 1766: {
                return new int[]{1665, 1666, 1667};
            }
            case 1767: {
                return new int[]{1668, 1669, 1670};
            }
            case 1768: {
                return new int[]{1671, 1672, 1673};
            }
            case 1769: {
                return new int[]{1674, 1675, 1676};
            }
            case 1770: {
                return new int[]{1677, 1678, 1679};
            }
            case 1771: {
                return new int[]{1680, 1681, 1682};
            }
            case 1789: {
                return new int[]{1724, 1725, 1726};
            }
            case 1828: {
                return new int[]{1791, 1792, 1793};
            }
            case 1836: {
                return new int[]{1800, 1801, 1802};
            }
            case 1837: {
                return new int[]{1803, 1804, 1805};
            }
            case 1858: {
                return new int[]{1884, 1885, 1886};
            }
            case 1862: {
                return new int[]{1897, 1898, 1899};
            }
            case 1877: {
                return new int[]{1782, 1783, 1784};
            }
            case 1879: {
                return new int[]{1779, 1780, 1781};
            }
        }
        return null;
    }

    private IO0l III1() {
        IOol iOol = this.var_IO0_IIll.var_IOol_II;
        if (iOol == null || iOol.II.length <= 7) {
            return null;
        }
        IO0l iO0l = iOol.II[7];
        return iO0l == null || iO0l.II1_() ? null : iO0l;
    }

    private boolean Il_I() {
        IOol iOol = this.var_IO0_IIll.var_IOol_II;
        if (iOol == null || !this.Iol_ || IOo.IIo(iOol.lOlo)) {
            return false;
        }
        IO0l iO0l = this.III1();
        if (iO0l == null) {
            return false;
        }
        int[] nArray = IOOo.III(iO0l.I1l);
        return nArray != null && nArray[0] >= 0;
    }

    void ll1l() {
        int n;
        IO0l iO0l = this.III1();
        int n2 = n = this.Il_I() ? iO0l.I1l : -1;
        if (this.I0oI && n == this.loOI) {
            return;
        }
        this.I__o();
        this.loOI = n;
        if (n >= 0) {
            this.I__0();
        }
    }

    void Ioo1() {
        this.Iol_ = false;
        this.I0oI = false;
        this.loOI = -1;
    }

    void lIlI() {
        this.Iol_ = true;
        this.ll1l();
    }

    private void I__0() {
        IOol iOol = this.var_IO0_IIll.var_IOol_II;
        int[] nArray = IOOo.III(this.loOI);
        if (nArray == null) {
            return;
        }
        this.loOl = iOol.I1 + this.IIlI.nextInt(21) - 10;
        this.loO1 = iOol.I1I;
        this.var_IOo__IIll.II(new IO0o(-5).IIII(-310720020).IIII(-1).II(0).II(false).II(0).II(iOol.lOlI).II(iOol.lOlI).III(nArray[0]).II(IOOo.I1_1("\ua224", 41472)).IIII(500000000).IIII(500000000).III(nArray[1]).III(nArray[2]).II(-1).II(-1).III(this.loOl).III(this.loO1).III(0).III(0).II(0).II(0).II(0).III(-1).II(0).II(0).III(-1).II(-1).III(-1));
        this.I0oI = true;
        System.out.println(IOOo.I1_1("\ua25b\ua273\ua257\ua229\ua219\ua2c6\ua29a\ua2a9\ua29d\ua363\ua316\ua331\ua31d\ua3b3\ua3c6\ua3b9\ua395\ua460\ua40e\ua424\ua418\ua4ee\ua4c7\ua4e9", 41472) + this.loOI + IOOo.I1_1("\ua220\ua277\ua257\ua238\ua212\ua2bb\ua2ce\ua2b8\ua291\ua337", 41472) + this.loOl + IOOo.I1_1("\ua22c", 41472) + this.loO1);
    }

    private void I__o() {
        if (!this.I0oI) {
            return;
        }
        this.var_IOo__IIll.II(new IO0o(-6).IIII(-310720020));
        this.I0oI = false;
    }

    void ll11() {
        IOol iOol = this.var_IO0_IIll.var_IOol_II;
        if (!this.I0oI || iOol == null) {
            return;
        }
        int n = this.loOl - iOol.I1;
        double d = iOol.I1 - this.loOl;
        double d2 = iOol.I1I - this.loO1;
        if (Math.sqrt(d * d + d2 * d2) >= 30.0 || Math.abs(n) < 25 || this.loO1 != iOol.I1I) {
            int n2;
            int n3 = n2 = n < 0 ? iOol.I1 - 40 - this.IIlI.nextInt(11) : iOol.I1 + 40 + this.IIlI.nextInt(11);
            if (n2 != this.loOl || this.loO1 != iOol.I1I) {
                this.loOl = n2;
                this.loO1 = iOol.I1I;
                this.var_IOo__IIll.II(new IO0o(-7).IIII(-310720020).III(this.loOl).III(this.loO1));
            }
        }
    }

    private static /* synthetic */ String I1_1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

