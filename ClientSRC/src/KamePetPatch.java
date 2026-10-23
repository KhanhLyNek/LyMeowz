/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

public final class KamePetPatch {
    private static final int NPC_KAME = 5;
    private static final int SERVICE_MENU = 9917;
    private static final int COST_EXPERIENCE = 1000;
    private static final int COST_SKILL = 1;
    private static final long EXPERIENCE_GAIN = 1500000L;
    private static final Random RNG = new Random();
    private static int rootOptionIndex = -1;
    private static String notice = "";

    private KamePetPatch() {
    }

    public static String[] decorate(String[] stringArray, int n, int n2) {
        if (n != 5 || n2 != 0 && n2 != 1655 || stringArray == null) {
            return stringArray;
        }
        rootOptionIndex = stringArray.length;
        String[] stringArray2 = new String[stringArray.length + 1];
        System.arraycopy(stringArray, 0, stringArray2, 0, stringArray.length);
        stringArray2[stringArray.length] = "\u0110\u00fat l\u00f3t Kame - \u0110\u1ec7 t\u1eed";
        return stringArray2;
    }

    public static boolean dispatch(IO00 iO00, IO0 iO0, int n, int n2, int n3) {
        if (SantaShopPatch.handleSub(iO00, iO0, n, n2, n3)) {
            return true;
        }
        return KamePetPatch.handle(iO00, iO0, n, n2, n3);
    }

    public static boolean handle(IO00 iO00, IO0 iO0, int n, int n2, int n3) {
        if (n != 5) {
            return false;
        }
        if ((n2 == 0 || n2 == 1655) && n3 == rootOptionIndex && rootOptionIndex >= 0) {
            notice = "";
            KamePetPatch.show(iO00);
            return true;
        }
        if (n2 != 9917) {
            return false;
        }
        if (n3 < 0 || n3 > 5) {
            return true;
        }
        if (n3 == 5) {
            notice = "";
            return true;
        }
        if (iO0 == null || SantaShopBridge.player(iO0) == null) {
            notice = "Kh\u00f4ng t\u00ecm th\u1ea5y nh\u00e2n v\u1eadt.";
            KamePetPatch.show(iO00);
            return true;
        }
        IOol iOol = SantaShopBridge.player(iO0);
        IOol iOol2 = iOol.III;
        if (iOol2 == null) {
            notice = "B\u1ea1n ch\u01b0a c\u00f3 \u0111\u1ec7 t\u1eed.";
            KamePetPatch.show(iO00);
            return true;
        }
        if (n3 == 0) {
            KamePetPatch.increase(iO0, iOol, iOol2);
        } else {
            KamePetPatch.reroll(iO0, iOol, iOol2, n3 - 1);
        }
        KamePetPatch.show(iO00);
        return true;
    }

    private static void show(IO00 iO00) {
        String[] stringArray = new String[]{"T\u0103ng 1.500.000 TN + SM\n1.000 ng\u1ecdc", "\u0110\u1ed5i skill 1\n1 ng\u1ecdc", "\u0110\u1ed5i skill 2\n1 ng\u1ecdc", "\u0110\u1ed5i skill 3\n1 ng\u1ecdc", "\u0110\u1ed5i skill 4\n1 ng\u1ecdc", "\u0110\u00f3ng"};
        String string = "Quy L\u00e3o Kame - D\u1ecbch v\u1ee5 \u0111\u1ec7 t\u1eed. M\u1ed7i l\u1ea7n t\u0103ng 1.500.000 s\u1ee9c m\u1ea1nh v\u00e0 1.500.000 ti\u1ec1m n\u0103ng.";
        if (notice.length() > 0) {
            string = notice + "\n" + string;
        }
        iO00.III(5, 9917, string, stringArray);
    }

    private static long cappedAdd(long l, long l2) {
        return l > Long.MAX_VALUE - l2 ? Long.MAX_VALUE : Math.max(0L, l) + l2;
    }

    private static void increase(IO0 iO0, IOol iOol, IOol iOol2) {
        if (iOol.lOoO < 1000) {
            notice = "C\u1ea7n 1.000 ng\u1ecdc. Hi\u1ec7n c\u00f3: " + iOol.lOoO;
            return;
        }
        if (iOol2.IO_l < 0L || iOol2.IO_1 < 0L || iOol2.IO_l > 9223372036853275807L || iOol2.IO_1 > 9223372036853275807L) {
            notice = "Ch\u1ec9 s\u1ed1 \u0111\u1ec7 t\u1eed kh\u00f4ng h\u1ee3p l\u1ec7 ho\u1eb7c v\u01b0\u1ee3t gi\u1edbi h\u1ea1n.";
            return;
        }
        iOol2.IO_l += 1500000L;
        iOol2.IO_1 += 1500000L;
        iOol.lOoO -= 1000;
        KamePetPatch.save(iO0);
        notice = "Th\u00e0nh c\u00f4ng! \u0110\u1ec7 t\u1eed +1.500.000 SM, +1.500.000 TN. \u0110\u00e3 tr\u1eeb 1.000 ng\u1ecdc.";
    }

    private static int val(Object object, String string, int n) {
        try {
            Field field = object.getClass().getField(string);
            return field.getInt(object);
        }
        catch (Exception exception) {
            return n;
        }
    }

    private static Object meta(int n) {
        Hashtable hashtable = IOO.III0;
        return hashtable == null ? null : hashtable.get(new Integer(n));
    }

    private static boolean alreadyKnown(IOol iOol, int n, int n2) {
        if (iOol.I__l == null) {
            return false;
        }
        for (int i = 0; i < iOol.I__l.length; ++i) {
            if (i == n2 || iOol.I__l[i] != n) continue;
            return true;
        }
        return false;
    }

    private static void reroll(IO0 iO0, IOol iOol, IOol iOol2, int n) {
        if (iOol.lOoO < 1) {
            notice = "Thi\u1ebfu 1 ng\u1ecdc \u0111\u1ec3 \u0111\u1ed5i skill.";
            return;
        }
        if (n < 0 || iOol2.I__l == null || n >= iOol2.I__l.length) {
            notice = "\u0110\u1ec7 t\u1eed ch\u01b0a m\u1edf skill " + (n + 1) + ". Kh\u00f4ng tr\u1eeb ng\u1ecdc.";
            return;
        }
        int n2 = iOol2.I__l[n];
        IOO.I___();
        Object object = KamePetPatch.meta(n2);
        if (object == null) {
            notice = "Kh\u00f4ng t\u00ecm th\u1ea5y d\u1eef li\u1ec7u skill c\u0169. Kh\u00f4ng tr\u1eeb ng\u1ecdc.";
            return;
        }
        int n3 = KamePetPatch.val(object, "l1__", -1);
        int n4 = KamePetPatch.val(object, "lO0I", -1);
        int n5 = iOol2.lOlI;
        if (n3 <= 0 || n4 < 0 || n5 < 0 || n5 > 2) {
            notice = "D\u1eef li\u1ec7u skill \u0111\u1ec7 t\u1eed kh\u00f4ng h\u1ee3p l\u1ec7. Kh\u00f4ng tr\u1eeb ng\u1ecdc.";
            return;
        }
        Vector<Integer> vector = new Vector<Integer>();
        Hashtable hashtable = IOO.III0;
        if (hashtable != null) {
            Enumeration enumeration = hashtable.elements();
            while (enumeration.hasMoreElements()) {
                Object v = enumeration.nextElement();
                int n6 = KamePetPatch.val(v, "lO0I", -1);
                int n7 = KamePetPatch.val(v, "l1__", -1);
                int n8 = KamePetPatch.val(v, "I1l", -1);
                if (n8 < 0 || n7 != n3 || n6 == n4 || n6 < n5 * 14 || n6 >= n5 * 14 + 14 || KamePetPatch.alreadyKnown(iOol2, n8, n)) continue;
                vector.addElement(new Integer(n8));
            }
        }
        if (vector.size() == 0) {
            notice = "Kh\u00f4ng c\u00f3 skill kh\u00e1c c\u00f9ng c\u1ea5p v\u00e0 h\u00e0nh tinh. Kh\u00f4ng tr\u1eeb ng\u1ecdc.";
            return;
        }
        int n9 = (Integer)vector.elementAt(RNG.nextInt(vector.size()));
        if (iOol2.I__1 != null) {
            for (int i = 0; i < iOol2.I__1.length; ++i) {
                if (iOol2.I__1[i] != n2) continue;
                iOol2.I__1[i] = n9;
            }
        }
        iOol2.I__l[n] = n9;
        --iOol.lOoO;
        KamePetPatch.save(iO0);
        notice = "\u0110\u00e3 \u0111\u1ed5i skill " + (n + 1) + " (" + n2 + " -> " + n9 + "). \u0110\u00e3 tr\u1eeb 1 ng\u1ecdc.";
    }

    private static void save(IO0 iO0) {
        if (iO0.IIIl != null) {
            iO0.IIIl.l1_l();
            iO0.IIIl.l1_();
        }
        iO0.I__O();
    }
}

