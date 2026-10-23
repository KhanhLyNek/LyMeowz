package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Image;

public class IIIl {
    public static boolean II_1 = true;
    private static Random II = new Random();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void II1o() {
        block17: {
            long l;
            String string;
            block20: {
                try {
                    String string2;
                    String string3;
                    block19: {
                        block18: {
                            if (I1_I.I1_I_II().var_I_I__IIIO == null || I_IO.I0l1) break block17;
                            string = null;
                            l = IO10.IIII();
                            if (I1_I.Il_I != null) break block18;
                            II_1 = true;
                            return;
                        }
                        string3 = IIIl.II(I1_I.Il_I);
                        if (Il_o.boolean_III1(string3)) {
                            I1_I.var_I1Oo_II.IIII(IIIl.IIII("\ua683\ua68f\ua7f2\ua74b\ua723\ua743\ua7f6\ua7c9\ub903\ua7ff\ua799\ua874\ub69f\ua832\ua85a\ua8f4\ua85b\ua8f7\ua89e\ua9f9\ua95a\ua93b\ua952\ub732\ua9de\ua9a7\ua9cf", 42696), 0);
                            II_1 = true;
                            return;
                        }
                        I1_I.var_I1Oo_II.IIII(IIIl.IIII("\ua7d8\ua686\ua768\ua742\ua764\ua704\ua7eb\ub902\ua7a9\ua7ff\ua793\ua8fe\ua81c\ua833\ua896\ua8f7\ua8d0\ua8f7\ub655\ua97b\ua95c\ua97d\ua95c\ua9bf", 42696), 0);
                        string2 = IlI.II1l;
                        if (!Il_o.boolean_III1(string2)) break block19;
                        I1_I.var_I1Oo_II.IIII(IIIl.IIII("\ua683\ua68f\ua7f2\ua74b\ua723\ua743\ua7f6\ua74d\ua7ad\ua7ff\ua78a\ua875\ub699\ua822\ua85a\ua8d8\ua8e8\ua89e\ua8d6\ua940\ua966\ua91f\ua953", 42696), 0);
                        II_1 = true;
                        return;
                    }
                    try {
                        string = IIIl.II(IIIl.IIII("\ua6a1\ua68a\ua767\ua742\ua721\ua75e", 42696) + IIIl.java_lang_String_II(string3), string2);
                        if (Il_o.boolean_III1(string)) {
                            I1_I.var_I1Oo_II.IIII(IIIl.IIII("\ua689\ua6b7\ua74f\ua705\ua72f\ua70b\ua776\ua7cf\ua7a7\ua7ff\ua78a\ua86f\ub69f\ua87b\ua80c\ub658\ua898\ua8bc\ub649\ua961\ua914\ua922\ua907\ub732\ua991", 42696), 0);
                        }
                        break block20;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        Thread.sleep(3000L);
                        new Thread(new III1()).start();
                    }
                    break block17;
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                    return;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
            }
            do {
                I1_I.var_I1Oo_II.IIII(IIIl.IIII("\ua68b\ua686\ua776\ua751\ua727\ua70b\ua7e3\ua79b\ua7e0", 42696) + string, 0);
                int n = (int)(IO10.IIII() - l);
                if (n < 5000) {
                    Thread.sleep(5000 - n);
                }
                I1_I.I1_I_II().var_java_lang_String_IlII = string;
                if (string.length() >= 4 && string.length() <= 7) {
                    for (int i = 0; i < string.length(); ++i) {
                        I_0_.II().II(string.charAt(i));
                        Thread.sleep(500 + II.nextInt(1000));
                    }
                }
                Thread.sleep(3000L);
            } while (I1_I.I1_I_II().var_java_lang_String_IlII.equals(string) && I1_I.I1_I_II().var_I_I__IIIO != null);
        }
        if (I1_I.I1_I_II().var_I_I__IIIO == null) return;
        Thread.sleep(30000L);
        return;
        finally {
            II_1 = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String II(Image image) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            int n;
            if (image == null) {
                String string = null;
                return string;
            }
            int n2 = image.getWidth();
            if (n2 * (n = image.getHeight()) > 50000) {
                System.out.println(IIIl.IIII("\ua681\ua68a\ua767\ua742\ua721\ua743\ua7f6\ua7ce\ua7af\ua7ff\ua792\ua87c\ua84e\ua83c\ua81f\ua8a3\ua898", 42696) + n2 + IIIl.IIII("\ua6b0", 42696) + n);
                String string = null;
                return string;
            }
            byte[] byArray = IIIl.II(image, n2, n);
            if (byArray == null) {
                String string = null;
                return string;
            }
            String string = IIIl.java_lang_String_II(byArray);
            return string;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            System.out.println(IIIl.IIII("\ua687\ua692\ua772\ua76a\ua722\ua72e\ua7e7\ua7cc\ua7af\ua7ad\ua787\ua83d\ua855\ua835\ua85a\ua8f0\ua8d5\ua8b6\ua891\ua970\ua960\ua93c\ua930\ua9f0\ua9c3\ua9aa\ua9d8\uaa39", 42696));
            outOfMemoryError.printStackTrace();
            String string = null;
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            String string = null;
            return string;
        }
        finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] II(Image image, int n, int n2) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            int[] nArray = new int[n * n2];
            image.getRGB(nArray, 0, n, 0, 0, n, n2);
            byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(new byte[]{-119, 80, 78, 71, 13, 10, 26, 10});
            byteArrayOutputStream = new ByteArrayOutputStream();
            IIIl.II(byteArrayOutputStream, n);
            IIIl.II(byteArrayOutputStream, n2);
            byteArrayOutputStream.write(8);
            byteArrayOutputStream.write(2);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            IIIl.II(byteArrayOutputStream2, IIIl.IIII("\ua681\ua6af\ua742\ua777", 42696), byteArrayOutputStream.toByteArray());
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            for (int i = 0; i < n2; ++i) {
                byteArrayOutputStream3.write(0);
                for (int j = 0; j < n; ++j) {
                    int n3 = nArray[i * n + j];
                    byteArrayOutputStream3.write(n3 >> 16 & 0xFF);
                    byteArrayOutputStream3.write(n3 >> 8 & 0xFF);
                    byteArrayOutputStream3.write(n3 & 0xFF);
                }
            }
            byte[] byArray = byteArrayOutputStream3.toByteArray();
            byte[] byArray2 = IIIl.byte_arr_II(byArray);
            if (byArray2 == null) {
                System.out.println(IIIl.IIII("\ua68c\ua682\ua760\ua749\ua725\ua717\ua7e7\ua781\ua7a6\ua7be\ua797\ua871\ua859\ua83f", 42696));
                byte[] byArray3 = null;
                return byArray3;
            }
            IIIl.II(byteArrayOutputStream2, IIIl.IIII("\ua681\ua6a3\ua747\ua771", 42696), byArray2);
            IIIl.II(byteArrayOutputStream2, IIIl.IIII("\ua681\ua6a2\ua748\ua761", 42696), new byte[0]);
            nArray = null;
            System.gc();
            byte[] byArray4 = byteArrayOutputStream2.toByteArray();
            return byArray4;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            byteArrayOutputStream = null;
            return byteArrayOutputStream;
        }
        finally {
            try {
                if (byteArrayOutputStream3 != null) {
                    byteArrayOutputStream3.close();
                }
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static byte[] byte_arr_II(byte[] byArray) {
        try {
            int n;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(120);
            byteArrayOutputStream.write(1);
            int n2 = 32768;
            for (int i = 0; i < byArray.length; i += n) {
                n = Math.min(n2, byArray.length - i);
                boolean bl = i + n >= byArray.length;
                byteArrayOutputStream.write(bl ? 1 : 0);
                byteArrayOutputStream.write(n & 0xFF);
                byteArrayOutputStream.write(n >> 8 & 0xFF);
                byteArrayOutputStream.write(~n & 0xFF);
                byteArrayOutputStream.write(~n >> 8 & 0xFF);
                byteArrayOutputStream.write(byArray, i, n);
            }
            n = IIIl.int_II(byArray);
            IIIl.II(byteArrayOutputStream, n);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static int int_II(byte[] byArray) {
        int n = 1;
        int n2 = 0;
        for (int i = 0; i < byArray.length; ++i) {
            n = (n + (byArray[i] & 0xFF)) % 65521;
            n2 = (n2 + n) % 65521;
        }
        return n2 << 16 | n;
    }

    private static void II(ByteArrayOutputStream byteArrayOutputStream, String string, byte[] byArray) throws IOException {
        IIIl.II(byteArrayOutputStream, byArray.length);
        byte[] byArray2 = string.getBytes(IIIl.IIII("\ua681\ua6b4\ua749\ua708\ua77c\ua75b\ua7b7\ua798\ua7ed\ua7ee", 42696));
        byteArrayOutputStream.write(byArray2);
        byteArrayOutputStream.write(byArray);
        int n = IIIl.II(byArray2, byArray);
        IIIl.II(byteArrayOutputStream, n);
    }

    private static int II(byte[] byArray, byte[] byArray2) {
        int n;
        int n2;
        int n3 = -1;
        for (n2 = 0; n2 < byArray.length; ++n2) {
            n3 ^= byArray[n2] & 0xFF;
            for (n = 0; n < 8; ++n) {
                if ((n3 & 1) != 0) {
                    n3 = n3 >>> 1 ^ 0xEDB88320;
                    continue;
                }
                n3 >>>= 1;
            }
        }
        for (n2 = 0; n2 < byArray2.length; ++n2) {
            n3 ^= byArray2[n2] & 0xFF;
            for (n = 0; n < 8; ++n) {
                if ((n3 & 1) != 0) {
                    n3 = n3 >>> 1 ^ 0xEDB88320;
                    continue;
                }
                n3 >>>= 1;
            }
        }
        return ~n3;
    }

    private static void II(ByteArrayOutputStream byteArrayOutputStream, int n) throws IOException {
        byteArrayOutputStream.write(n >> 24 & 0xFF);
        byteArrayOutputStream.write(n >> 16 & 0xFF);
        byteArrayOutputStream.write(n >> 8 & 0xFF);
        byteArrayOutputStream.write(n & 0xFF);
    }

    private static String java_lang_String_II(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            return null;
        }
        String string = IIIl.IIII("\ua689\ua6a5\ua745\ua761\ua701\ua725\ua7c5\ua7e9\ua789\ua795\ua7b5\ua851\ua871\ua815\ua835\ua8c9\ua8e9\ua885\ua8a5\ua941\ua961\ua905\ua925\ua9c9\ua9e9\ua995\ua98f\uaa6f\uaa4f\uaa2f\uaa0f\uaaef\uaacf\uaaaf\uaa8f\uab6f\uab4f\uab2f\uab0f\uabef\uabcf\uabcf\uabaf\uab8f\uac6f\uac4f\uac2f\uac0f\uacef\uaccf\uacaf\uac8f\uad24\uad02\uad60\uad42\uada4\uad9a\uadf8\uadda\uae34\uae12\uae61\uae46", 42696);
        StringBuffer stringBuffer = new StringBuffer(byArray.length * 4 / 3 + 4);
        try {
            for (int i = 0; i < byArray.length; i += 3) {
                int n = byArray[i] & 0xFF;
                int n2 = i + 1 < byArray.length ? byArray[i + 1] & 0xFF : 0;
                int n3 = i + 2 < byArray.length ? byArray[i + 2] & 0xFF : 0;
                int n4 = n << 16 | n2 << 8 | n3;
                stringBuffer.append(string.charAt(n4 >> 18 & 0x3F));
                stringBuffer.append(string.charAt(n4 >> 12 & 0x3F));
                if (i + 1 < byArray.length) {
                    stringBuffer.append(string.charAt(n4 >> 6 & 0x3F));
                } else {
                    stringBuffer.append('=');
                }
                if (i + 2 < byArray.length) {
                    stringBuffer.append(string.charAt(n4 & 0x3F));
                    continue;
                }
                stringBuffer.append('=');
            }
            return stringBuffer.toString();
        }
        catch (OutOfMemoryError outOfMemoryError) {
            System.out.println(IIIl.IIII("\ua687\ua692\ua772\ua76a\ua722\ua72e\ua7e7\ua7cc\ua7af\ua7ad\ua787\ua83d\ua855\ua835\ua85a\ua8fc\ua8d6\ua8b4\ua899\ua971\ua951\ua911\ua913\ua9e2\ua9d5\ua9f9\ua9da", 42696));
            return null;
        }
    }

    private static String java_lang_String_II(String string) {
        if (string == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '-' || c == '_' || c == '.' || c == '~') {
                stringBuffer.append(c);
                continue;
            }
            stringBuffer.append('%');
            String string2 = Integer.toHexString(c).toUpperCase();
            if (string2.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(string2);
        }
        return stringBuffer.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String II(String string, String string2) {
        HttpConnection httpConnection = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            int n;
            httpConnection = (HttpConnection)Connector.open((String)string2);
            httpConnection.setRequestMethod(IIIl.IIII("\ua698\ua6a8\ua755\ua771", 42696));
            httpConnection.setRequestProperty(IIIl.IIII("\ua68b\ua688\ua768\ua751\ua721\ua70d\ua7f6\ua78c\ua794\ua7a6\ua78e\ua878", 42696), IIIl.IIII("\ua6a9\ua697\ua776\ua749\ua72d\ua700\ua7e3\ua7d5\ua7a9\ua7b0\ua790\ua832\ua844\ua876\ua80d\ua8ee\ua8cf\ua8fa\ua890\ua97a\ua946\ua93e\ua95f\ua9e4\ua9c2\ua9a3\ua98b\uaa63\uaa4f\uaa24\uaa0e\uaaec\uaacc", 42696));
            httpConnection.setRequestProperty(IIIl.IIII("\ua68b\ua688\ua768\ua751\ua721\ua70d\ua7f6\ua78c\ua78c\ua7ba\ua790\ua87a\ua848\ua833", 42696), String.valueOf(string.length()));
            outputStream = httpConnection.openOutputStream();
            outputStream.write(string.getBytes(IIIl.IIII("\ua69d\ua6b3\ua740\ua708\ua77c", 42696)));
            outputStream.flush();
            int n2 = httpConnection.getResponseCode();
            if (n2 != 200) {
                System.out.println(IIIl.IIII("\ua680\ua6b3\ua752\ua775\ua764\ua726\ua7f0\ua7d3\ua7af\ua7ad\ua7c4\ua83d", 42696) + n2);
                String string3 = null;
                return string3;
            }
            inputStream = httpConnection.openInputStream();
            StringBuffer stringBuffer = new StringBuffer();
            while ((n = inputStream.read()) != -1) {
                stringBuffer.append((char)n);
            }
            String string4 = IIIl.III(stringBuffer.toString());
            return string4;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            String string5 = null;
            return string5;
        }
        finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpConnection != null) {
                    httpConnection.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static String III(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            if (Il_o.boolean_II(string, IIIl.IIII("\ua6ea\ua682\ua774\ua757\ua72b\ua711\ua7a0", 42696))) {
                return null;
            }
            String[] stringArray = new String[]{IIIl.IIII("\ua6ab\ua686\ua776\ua751\ua727\ua70b\ua7e3", 42696), IIIl.IIII("\ua6bc\ua682\ua77e\ua751", 42696), IIIl.IIII("\ua6ba\ua682\ua775\ua750\ua728\ua717", 42696), IIIl.IIII("\ua6ab\ua688\ua762\ua740", 42696), IIIl.IIII("\ua6a9\ua689\ua775\ua752\ua721\ua711", 42696)};
            for (int i = 0; i < stringArray.length; ++i) {
                String string2 = IIIl.III(string, stringArray[i]);
                if (string2 == null) continue;
                return string2;
            }
            return IIIl.IIII(string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static String III(String string, String string2) {
        try {
            int n;
            String string3 = IIIl.IIII("\ua6ea", 42696) + string2 + IIIl.IIII("\ua6ea\ua6dd", 42696);
            if (!Il_o.boolean_II(string, string3)) {
                return null;
            }
            int n2 = string.indexOf(string3);
            for (n = n2 + string3.length(); n < string.length() && (string.charAt(n) == ' ' || string.charAt(n) == '\t'); ++n) {
            }
            if (n >= string.length()) {
                return null;
            }
            char c = string.charAt(n);
            if (c == '\"') {
                int n3 = n + 1;
                int n4 = string.indexOf(34, n3);
                if (n4 > n3) {
                    return string.substring(n3, n4);
                }
            } else if (Character.isDigit(c)) {
                int n5;
                for (n5 = n; n5 < string.length() && Character.isDigit(string.charAt(n5)); ++n5) {
                }
                return string.substring(n, n5);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    private static String IIII(String string) {
        try {
            int n;
            String string2 = string;
            char[] cArray = new char[]{'{', '}', '\"', '[', ']', ',', ':'};
            for (n = 0; n < cArray.length; ++n) {
                string2 = string2.replace(cArray[n], ' ');
            }
            n = 0;
            while (n < string2.length()) {
                while (n < string2.length() && string2.charAt(n) == ' ') {
                    ++n;
                }
                if (n < string2.length()) {
                    int n2;
                    for (n2 = n; n2 < string2.length() && string2.charAt(n2) != ' '; ++n2) {
                    }
                    String string3 = string2.substring(n, n2).trim();
                    if (string3.length() >= 4 && string3.length() <= 7 && IIIl.boolean_II(string3)) {
                        return string3;
                    }
                    n = n2;
                    continue;
                }
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    private static boolean boolean_II(String string) {
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') continue;
            return false;
        }
        return true;
    }

    public static boolean III1() {
        return I1_I.I1_I_II().var_I_I__IIIO != null && !I_IO.I0l1;
    }

    private static /* synthetic */ String IIII(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

