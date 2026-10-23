package main;

/*
 * Decompiled with CFR 0.152.
 */
public class Il_o {
    public static int int_II(String string, String string2) {
        return Il_o.II(string, string2, 0);
    }

    public static int II(String string, String string2, int n) {
        if (string == null || string2 == null) {
            return -1;
        }
        if (string2.length() == 0) {
            return n;
        }
        if (n < 0) {
            n = 0;
        }
        if (n >= string.length()) {
            return -1;
        }
        int n2 = string.length() - string2.length();
        for (int i = n; i <= n2; ++i) {
            boolean bl = true;
            for (int j = 0; j < string2.length(); ++j) {
                if (string.charAt(i + j) == string2.charAt(j)) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            return i;
        }
        return -1;
    }

    public static int int_II(String string, char c) {
        return Il_o.II(string, c, 0);
    }

    public static int II(String string, char c, int n) {
        if (string == null) {
            return -1;
        }
        if (n < 0) {
            n = 0;
        }
        if (n >= string.length()) {
            return -1;
        }
        for (int i = n; i < string.length(); ++i) {
            if (string.charAt(i) != c) continue;
            return i;
        }
        return -1;
    }

    public static boolean boolean_III1(String string) {
        return string == null || string.length() == 0;
    }

    public static boolean boolean_II(String string, String string2) {
        if (string == null || string2 == null) {
            return false;
        }
        return Il_o.int_II(string, string2) != -1;
    }

    public static String II(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; ++i) {
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
    }

    public static Il_l.II Il_l$II_II(String string, char c) {
        Il_l.II iI = new Il_l.II();
        if (Il_o.boolean_III1(string)) {
            return iI;
        }
        int n = 0;
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) != c) continue;
            iI.void_III(string.substring(n, i));
            n = i + 1;
        }
        iI.void_III(string.substring(n));
        return iI;
    }

    public static String[] java_lang_String_arr_II(String string, char c) {
        if (Il_o.boolean_III1(string)) {
            return new String[0];
        }
        int n = 1;
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) != c) continue;
            ++n;
        }
        String[] stringArray = new String[n];
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) != c) continue;
            stringArray[n3++] = string.substring(n2, i);
            n2 = i + 1;
        }
        stringArray[n3] = string.substring(n2);
        return stringArray;
    }

    public static String II(String string, String string2, String string3) {
        if (string == null || string2 == null || string3 == null) {
            return string;
        }
        if (string2.length() == 0) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        int n2 = Il_o.II(string, string2, n);
        while (n2 >= 0) {
            stringBuilder.append(string.substring(n, n2));
            stringBuilder.append(string3);
            n = n2 + string2.length();
            n2 = Il_o.II(string, string2, n);
        }
        stringBuilder.append(string.substring(n));
        return stringBuilder.toString();
    }

    public static String III(long l) {
        if (l < 0L) {
            return Il_o.IIO_("\u9093", 37054) + Il_o.III(-l);
        }
        if (l < 1000L) {
            return String.valueOf(l);
        }
        String string = String.valueOf(l);
        StringBuilder stringBuilder = new StringBuilder();
        int n = string.length();
        int n2 = 0;
        for (int i = n - 1; i >= 0; --i) {
            if (n2 > 0 && n2 % 3 == 0) {
                stringBuilder.insert(0, Il_o.IIO_("\u9092", 37054));
            }
            stringBuilder.insert(0, String.valueOf(string.charAt(i)));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static String II(long l, int n) {
        String string = String.valueOf(l);
        while (string.length() < n) {
            string = Il_o.IIO_("\u908e", 37054) + string;
        }
        return string;
    }

    public static String II(long l, long l2) {
        return Il_o.II(l, 2) + Il_o.IIO_("\u9084", 37054) + Il_o.II(l2, 2);
    }

    public static String IIIl(String string) {
        if (string == null) {
            return null;
        }
        return string.trim();
    }

    public static String java_lang_String_III1(String string) {
        if (string == null) {
            return null;
        }
        return string.toLowerCase();
    }

    public static String III_(String string) {
        if (string == null) {
            return null;
        }
        return string.toUpperCase();
    }

    public static boolean III(String string, String string2) {
        if (string == null && string2 == null) {
            return true;
        }
        if (string == null || string2 == null) {
            return false;
        }
        return string.equals(string2);
    }

    public static boolean IIII(String string, String string2) {
        if (string == null && string2 == null) {
            return true;
        }
        if (string == null || string2 == null) {
            return false;
        }
        return string.toLowerCase().equals(string2.toLowerCase());
    }

    public static boolean IIIl(String string, String string2) {
        if (string == null || string2 == null) {
            return false;
        }
        if (string2.length() > string.length()) {
            return false;
        }
        return string.substring(0, string2.length()).equals(string2);
    }

    public static boolean III1(String string, String string2) {
        if (string == null || string2 == null) {
            return false;
        }
        if (string2.length() > string.length()) {
            return false;
        }
        return string.substring(string.length() - string2.length()).equals(string2);
    }

    public static String II(String string, int n, int n2) {
        if (string == null) {
            return null;
        }
        if (n < 0) {
            n = 0;
        }
        if (n2 > string.length()) {
            n2 = string.length();
        }
        if (n > n2) {
            return "";
        }
        return string.substring(n, n2);
    }

    public static String II(String[] stringArray, String string) {
        if (stringArray == null || stringArray.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; ++i) {
            if (i > 0) {
                stringBuilder.append(string);
            }
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
    }

    public static String IIO1(String string, int n) {
        if (string == null || n <= 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String IIIO(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }

    private static /* synthetic */ String IIO_(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

