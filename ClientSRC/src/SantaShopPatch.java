/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class SantaShopPatch {
    private static final int SANTA_NPC = 39;
    private static final int OUR_SUBMENU = 77;
    private static final int PAGE_SIZE = 5;
    private static final String ROOT_TOKEN = "SANTA_CRYSTAL_100_ONE_GOLD";
    private static int page = 0;
    private static int[] itemIds = new int[0];
    private static String[] itemNames = new String[0];
    private static int[] displayedActions = new int[0];
    private static String lastNotice = "";
    private static final int PREV = -1;
    private static final int NEXT = -2;
    private static final int BACK = -3;

    private SantaShopPatch() {
    }

    public static void appendMenu(Vector vector, Vector vector2) {
        vector.addElement("Sao pha l\u00ea x100\n1 v\u00e0ng");
        vector2.addElement(ROOT_TOKEN);
    }

    public static boolean handleRoot(IO00 iO00, IO0 iO0, int n, String string) {
        if (n != 39 || !ROOT_TOKEN.equals(string)) {
            return false;
        }
        page = 0;
        lastNotice = "";
        SantaShopPatch.readCrystalTemplates();
        SantaShopPatch.show(iO00);
        return true;
    }

    private static void readCrystalTemplates() {
        int n;
        Vector<Integer> vector = new Vector<Integer>();
        Vector<String> vector2 = new Vector<String>();
        Object[] objectArray = SantaShopBridge.templates();
        if (objectArray != null) {
            for (n = 0; n < objectArray.length; ++n) {
                Object object = objectArray[n];
                if (object == null || SantaShopBridge.name(object) == null) continue;
                String string = SantaShopBridge.name(object).toLowerCase();
                int n2 = SantaShopBridge.id(object);
                if ((n2 < 441 || n2 > 447) && (n2 < 1416 || n2 > 1422) || string.indexOf("sao pha l\u00ea") < 0 && string.indexOf("sao pha le") < 0 && (string.indexOf("sao") < 0 || string.indexOf("pha l\u00ea") < 0)) continue;
                vector.addElement(new Integer(SantaShopBridge.id(object)));
                vector2.addElement(SantaShopBridge.name(object));
            }
        }
        itemIds = new int[vector.size()];
        itemNames = new String[vector2.size()];
        for (n = 0; n < itemIds.length; ++n) {
            SantaShopPatch.itemIds[n] = (Integer)vector.elementAt(n);
            SantaShopPatch.itemNames[n] = (String)vector2.elementAt(n);
        }
    }

    private static void show(IO00 iO00) {
        int n;
        int n2;
        if (itemIds.length == 0) {
            iO00.III(39, 77, "Kh\u00f4ng t\u00ecm th\u1ea5y sao pha l\u00ea trong b\u1ea3ng v\u1eadt ph\u1ea9m.", new String[]{"\u0110\u00f3ng"});
            displayedActions = new int[]{-3};
            return;
        }
        int n3 = (itemIds.length + 5 - 1) / 5;
        if (page < 0) {
            page = 0;
        }
        if (page >= n3) {
            page = n3 - 1;
        }
        if ((n2 = (n = page * 5) + 5) > itemIds.length) {
            n2 = itemIds.length;
        }
        Vector<String> vector = new Vector<String>();
        Vector<Integer> vector2 = new Vector<Integer>();
        for (int i = n; i < n2; ++i) {
            vector.addElement(itemNames[i] + "\nx100 - 1 v\u00e0ng");
            vector2.addElement(new Integer(i));
        }
        if (page > 0) {
            vector.addElement("Trang tr\u01b0\u1edbc");
            vector2.addElement(new Integer(-1));
        }
        if (page + 1 < n3) {
            vector.addElement("Trang sau");
            vector2.addElement(new Integer(-2));
        }
        vector.addElement("\u0110\u00f3ng");
        vector2.addElement(new Integer(-3));
        String[] stringArray = new String[vector.size()];
        displayedActions = new int[vector2.size()];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = (String)vector.elementAt(i);
            SantaShopPatch.displayedActions[i] = (Integer)vector2.elementAt(i);
        }
        String string = "C\u1eeda h\u00e0ng sao pha l\u00ea x100: 1 v\u00e0ng m\u1ed7i l\u1ea7n mua. (Trang " + (page + 1) + "/" + n3 + ")";
        if (lastNotice.length() > 0) {
            string = lastNotice + "\n" + string;
        }
        iO00.III(39, 77, string, stringArray);
    }

    public static boolean handleSub(IO00 iO00, IO0 iO0, int n, int n2, int n3) {
        if (n != 39 || n2 != 77) {
            return false;
        }
        if (n3 < 0 || n3 >= displayedActions.length) {
            return true;
        }
        int n4 = displayedActions[n3];
        if (n4 == -3) {
            lastNotice = "";
            return true;
        }
        if (n4 == -1) {
            --page;
            lastNotice = "";
            SantaShopPatch.show(iO00);
            return true;
        }
        if (n4 == -2) {
            ++page;
            lastNotice = "";
            SantaShopPatch.show(iO00);
            return true;
        }
        if (n4 < 0 || n4 >= itemIds.length || iO0 == null || SantaShopBridge.player(iO0) == null || SantaShopBridge.inventory(iO0) == null) {
            return true;
        }
        IOol iOol = SantaShopBridge.player(iO0);
        if (iOol.Il11 < 1L) {
            lastNotice = "B\u1ea1n c\u1ea7n 1 v\u00e0ng \u0111\u1ec3 mua 100 vi\u00ean.";
        } else {
            int n5 = itemIds[n4];
            IO0l iO0l = new IO0l(n5, 100);
            int n6 = n5 >= 1416 && n5 <= 1422 ? n5 - 1416 + 441 : n5;
            int[] nArray = IOoI.IIII(n6);
            iO0l.III(nArray[0], nArray[1]);
            if (!SantaShopBridge.inventory(iO0).III0(iO0l)) {
                lastNotice = "H\u00e0nh trang \u0111\u1ea7y, kh\u00f4ng tr\u1eeb v\u00e0ng.";
            } else {
                --iOol.Il11;
                SantaShopBridge.inventory(iO0).l1_l();
                SantaShopBridge.inventory(iO0).l1_();
                SantaShopBridge.save(iO0);
                lastNotice = "\u0110\u00e3 mua 100 " + itemNames[n4] + " v\u1edbi 1 v\u00e0ng!";
            }
        }
        SantaShopPatch.show(iO00);
        return true;
    }
}

