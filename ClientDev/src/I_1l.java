package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class I_1l {
    public static byte[] II(I_Il i_Il) {
        try {
            int n = i_Il.java_io_DataInputStream_II().readInt();
            if (n > 1) {
                byte[] byArray = new byte[n];
                i_Il.java_io_DataInputStream_II().read(byArray);
                return byArray;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static byte[] II(DataInputStream dataInputStream) {
        try {
            byte[] byArray = new byte[dataInputStream.readInt()];
            dataInputStream.read(byArray);
            return byArray;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static String III(String string, String string2, String string3) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        while ((n = string.indexOf(string2)) != -1) {
            stringBuffer.append(string.substring(0, n) + string3);
            string = string.substring(n + string2.length());
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public static String III1(int n) {
        long l = (long)n * 1000L;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone(I_1l.IlOI("\u7572\u7519\u7527\u75b9\u7586", 30005)));
        calendar.setTime(new Date(l));
        int n2 = calendar.get(11);
        calendar.get(12);
        int n3 = calendar.get(5);
        int n4 = calendar.get(2) + 1;
        n = calendar.get(1);
        return n3 + I_1l.IlOI("\u751a", 30005) + n4 + I_1l.IlOI("\u751a", 30005) + n + I_1l.IlOI("\u7515", 30005) + n2 + I_1l.IlOI("\u755d", 30005);
    }

    public static String III_(int n) {
        int n2 = 0;
        if (n > 60) {
            n2 = n / 60;
            n %= 60;
        }
        int n3 = 0;
        if (n2 > 60) {
            n3 = n2 / 60;
            n2 %= 60;
        }
        int n4 = 0;
        if (n3 > 24) {
            n4 = n3 / 24;
            n3 %= 24;
        }
        String string = "";
        if (n4 > 0) {
            string = string + n4;
            string = string + I_1l.IlOI("\u7551", 30005);
            string = string + n3 + I_1l.IlOI("\u755d", 30005);
        } else if (n3 > 0) {
            string = string + n3;
            string = string + I_1l.IlOI("\u755d", 30005);
            string = string + n2 + I_1l.IlOI("\u7512", 30005);
        } else {
            string = n2 > 9 ? string + n2 : string + I_1l.IlOI("\u7505", 30005) + n2;
            string = string + I_1l.IlOI("\u750f", 30005);
            string = n > 9 ? string + n : string + I_1l.IlOI("\u7505", 30005) + n;
        }
        return string;
    }

    public static String IIIl(long l) {
        String string = "";
        long l2 = l / 1000L + 1L;
        int n = 0;
        while ((long)n < l2) {
            if (l < 1000L) {
                string = l + string;
                break;
            }
            long l3 = l % 1000L;
            string = l3 == 0L ? I_1l.IlOI("\u751b\u7564\u7543\u75a2", 30005) + string : (l3 < 10L ? I_1l.IlOI("\u751b\u7564\u7543", 30005) + l3 + string : (l3 < 100L ? I_1l.IlOI("\u751b\u7564", 30005) + l3 + string : I_1l.IlOI("\u751b", 30005) + l3 + string));
            l /= 1000L;
            ++n;
        }
        return string;
    }

    public static String IIIO(int n) {
        int n2 = 0;
        if (n > 60) {
            n2 = n / 60;
        }
        n = 0;
        if (n2 > 60) {
            n = n2 / 60;
            n2 %= 60;
        }
        int n3 = 0;
        if (n > 24) {
            n3 = n / 24;
            n %= 24;
        }
        String string = "";
        if (n3 > 0) {
            string = string + n3;
            string = string + I_1l.IlOI("\u7551", 30005);
            string = string + n + I_1l.IlOI("\u755d", 30005);
        } else if (n > 0) {
            string = string + n;
            string = string + I_1l.IlOI("\u755d", 30005);
            string = string + n2 + I_1l.IlOI("\u7512", 30005);
        } else {
            if (n2 == 0) {
                n2 = 1;
            }
            string = string + n2;
            string = string + I_1l.IlOI("\u7545\u753c", 30005);
        }
        return string;
    }

    private static /* synthetic */ String IlOI(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

