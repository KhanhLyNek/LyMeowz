/*
 * Decompiled with CFR 0.152.
 */
final class I0I {
    private I0I() {
    }

    static String IIIl(int n, int n2) {
        switch (n * 100 + n2) {
            case 0: {
                return I0I.I101("\ue19f\ue1dc\ue236\ue21d\ue26f\ue256\ue2b1\ue28c\ue28b\ue2ef", 57799);
            }
            case 1: {
                return I0I.I101("\ue18a\ue1dc\ue237\ue215\ue26f\ue250\ue2b3\ue28c\ue28d\ue2ed", 57799);
            }
            case 2: {
                return I0I.I101("\ue193\ue1dc\ue24d", 57799);
            }
            case 3: {
                return I0I.I101("\ue185", 57799);
            }
            case 4: {
                return I0I.I101("\ue197", 57799);
            }
            case 5: {
                return I0I.I101("\ue193\ue1dc\ue24d", 57799);
            }
            case 101: 
            case 201: 
            case 302: 
            case 403: 
            case 503: 
            case 603: {
                return I0I.I101("\ue193\ue1dc\ue24d", 57799);
            }
            case 702: {
                return I0I.I101("\ue193\ue1dc\ue247", 57799);
            }
            case 703: {
                return I0I.I101("\ue193\ue1dc\ue24d", 57799);
            }
            case 802: {
                return I0I.I101("\ue193\ue1dc\ue24d", 57799);
            }
            case 900: {
                return I0I.I101("\ue18a\ue1dc\ue230\ue208\ue272\ue251\ue2ad\ue292\ue28f", 57799);
            }
            case 901: {
                return I0I.I101("\ue193\ue1dc\ue248", 57799);
            }
            case 1002: {
                return I0I.I101("\ue193\ue1dc\ue248", 57799);
            }
            case 1103: {
                return I0I.I101("\ue193\ue1dc\ue24d\ue208\ue20e", 57799);
            }
            case 1200: {
                return I0I.I101("\ue18a\ue1dc\ue237\ue215\ue26f\ue250\ue2b3\ue28c\ue28d\ue2ed", 57799);
            }
            case 1201: {
                return I0I.I101("\ue193\ue1dc\ue24d", 57799);
            }
            case 1202: {
                return I0I.I101("\ue193\ue1dc\ue248", 57799);
            }
            case 1301: 
            case 1403: 
            case 1503: 
            case 1603: {
                return I0I.I101("\ue193\ue1dc\ue248", 57799);
            }
            case 1700: {
                return I0I.I101("\ue18a\ue1dc\ue234\ue21d", 57799);
            }
            case 1701: {
                return I0I.I101("\ue193\ue1dc\ue248\ue208\ue272\ue252\ue2ad\ue291\ue28e\ue2f2\ue2cc\ue32e", 57799);
            }
            case 1805: 
            case 1903: 
            case 2006: 
            case 2104: {
                return I0I.I101("\ue193\ue1dc\ue248", 57799);
            }
            case 2200: {
                return I0I.I101("\ue193\ue1dc\ue24d", 57799);
            }
            case 2201: {
                return I0I.I101("\ue193\ue1dc\ue236\ue21c", 57799);
            }
            case 2202: {
                return I0I.I101("\ue193\ue1dc\ue248\ue208\ue272\ue251", 57799);
            }
            case 2203: 
            case 2205: 
            case 2304: 
            case 2404: 
            case 2505: 
            case 2605: 
            case 2705: {
                return I0I.I101("\ue193\ue1dc\ue236\ue213", 57799);
            }
            case 2300: {
                return I0I.I101("\ue18a\ue1dc\ue23c\ue217", 57799);
            }
            case 2400: {
                return I0I.I101("\ue18a\ue1dc\ue234\ue214\ue277", 57799);
            }
            case 2500: {
                return I0I.I101("\ue18a\ue1dc\ue23c\ue213", 57799);
            }
            case 2600: {
                return I0I.I101("\ue18a\ue1dc\ue234\ue214\ue273", 57799);
            }
            case 2700: {
                return I0I.I101("\ue193\ue1dc\ue234\ue21c", 57799);
            }
            case 2701: {
                return I0I.I101("\ue18e\ue1dc\ue236\ue21c\ue273", 57799);
            }
            case 2702: {
                return I0I.I101("\ue18a\ue1dc\ue234\ue214\ue270", 57799);
            }
            case 2800: 
            case 2807: {
                return I0I.I101("\ue193\ue1dc\ue231\ue210", 57799);
            }
            case 2901: {
                return I0I.I101("\ue18a\ue1dc\ue234\ue212\ue273", 57799);
            }
            case 2905: {
                return I0I.I101("\ue18a\ue1dc\ue234\ue212\ue272", 57799);
            }
        }
        return null;
    }

    static int II(char c, int n) {
        switch (c) {
            case 'H': {
                return n == 0 ? 0 : (n == 1 ? 2 : 1);
            }
            case 'M': {
                return 13 + n;
            }
            case 'B': {
                return 7 + n;
            }
            case 'T': {
                return 10 + n;
            }
        }
        return -1;
    }

    static boolean IIl1(String string) {
        return string != null && string.startsWith(I0I.I101("\ue193\ue1dc", 57799));
    }

    static boolean II(String string, int n, int n2) {
        if (!I0I.IIl1(string)) {
            return false;
        }
        int n3 = 2;
        while (n3 < string.length()) {
            String string2;
            int n4;
            int n5 = string.indexOf(44, n3);
            if (n5 < 0) {
                n5 = string.length();
            }
            if ((n4 = (string2 = string.substring(n3, n5)).length() == 1 && string2.charAt(0) >= 'A' && string2.charAt(0) <= 'Z' ? I0I.II(string2.charAt(0), n) : Integer.parseInt(string2)) == n2) {
                return true;
            }
            n3 = n5 + 1;
        }
        return false;
    }

    static boolean II(String string, int n) {
        if (string == null || string.length() < 3 || string.charAt(0) != 'M' && string.charAt(0) != 'X' || string.charAt(1) != ':') {
            return false;
        }
        int n2 = 2;
        while (n2 < string.length()) {
            int n3 = string.indexOf(44, n2);
            if (n3 < 0) {
                n3 = string.length();
            }
            if (Integer.parseInt(string.substring(n2, n3)) == n) {
                return true;
            }
            n2 = n3 + 1;
        }
        return false;
    }

    private static /* synthetic */ String I101(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

