/*
 * Decompiled with CFR 0.152.
 */
package nrolite;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import nrolite.DataDownloader;

public final class Res {
    private static Boolean II;
    private static final Hashtable IIIo;
    private static Boolean III;

    private Res() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] readFile(String string) {
        Object object;
        if (string == null) {
            return null;
        }
        File file = new File(DataDownloader.II(), string);
        if (!file.exists() || !file.isFile()) {
            file = new File(string);
        }
        if (!(file.exists() && file.isFile() || !string.startsWith(Res.I1O0("\u5541", 21870)))) {
            object = string.substring(1);
            file = new File(DataDownloader.II(), (String)object);
            if (!file.exists() || !file.isFile()) {
                file = new File((String)object);
            }
        }
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        object = null;
        try {
            int n;
            object = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int)file.length());
            byte[] byArray = new byte[8192];
            while ((n = ((FileInputStream)object).read(byArray)) > 0) {
                byteArrayOutputStream.write(byArray, 0, n);
            }
            byte[] byArray2 = byteArrayOutputStream.toByteArray();
            return byArray2;
        }
        catch (Exception exception) {
            byte[] byArray = null;
            return byArray;
        }
        finally {
            if (object != null) {
                try {
                    ((FileInputStream)object).close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    private static boolean Ilol() {
        if (II == null) {
            InputStream inputStream = null;
            boolean bl = false;
            try {
                inputStream = Res.class.getResourceAsStream(Res.I1O0("\u5541\u55e3\u55de\u55a4\u5586\u5660\u565c\u5622\u5649\u56e8\u56c5\u56b3\u5691\u572f\u5742\u5756\u5730", 21870));
                bl = inputStream != null;
            }
            catch (Throwable throwable) {
            }
            finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (IOException iOException) {}
                }
            }
            II = bl ? Boolean.TRUE : Boolean.FALSE;
        }
        return II;
    }

    public static boolean IIll(String string) {
        try {
            if (III == null) {
                Boolean bl = III = Res.class.getResource(Res.I1O0("\u5541\u55c0\u55e9\u559f\u55ab\u5624\u5661\u5609\u5620\u56aa\u56e9\u5682\u56ac\u5748\u5766\u577a\u570d\u5729\u57b2\u57f6\u579c", 21870)) != null ? Boolean.TRUE : Boolean.FALSE;
            }
            if (!III.booleanValue()) {
                return true;
            }
            return Res.class.getResource(string) != null;
        }
        catch (Throwable throwable) {
            return true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] read(String string) {
        byte[] byArray;
        InputStream inputStream = null;
        if (Res.Ilol()) {
            try {
                if (Res.IIll(Res.I1O0("\u5541\u55e3\u55de\u55a4\u5586\u5660\u565c\u5622\u5649", 21870) + string)) {
                    inputStream = Res.class.getResourceAsStream(Res.I1O0("\u5541\u55e3\u55de\u55a4\u5586\u5660\u565c\u5622\u5649", 21870) + string);
                }
                if (inputStream != null) {
                    int n;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] byArray2 = new byte[4096];
                    while ((n = inputStream.read(byArray2)) > 0) {
                        byteArrayOutputStream.write(byArray2, 0, n);
                    }
                    byte[] byArray3 = byteArrayOutputStream.toByteArray();
                    return byArray3;
                }
            }
            catch (IOException iOException) {
                byte[] byArray4 = null;
                return byArray4;
            }
            finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
        if ((byArray = Res.readFile(Res.I1O0("\u550a\u55ec\u55d8\u55aa\u55c5\u5667\u565a\u5628\u560a\u56ec\u56d0\u56a6\u56cd", 21870) + string)) == null) {
            byArray = Res.readFile(Res.I1O0("\u5500\u55ff\u55c3\u55a7\u5583\u567d\u564d\u5668", 21870) + string);
        }
        if (byArray == null && IIIo.put(string, string) == null) {
            System.out.println(Res.I1O0("\u5535\u55e1\u55c5\u55bf\u558f\u5654\u5608\u5613\u562e\u56cc\u56e1\u5696\u56c2\u576f\u5752\u5750\u5732\u5714\u57e8\u57de\u57f5", 21870) + string);
        }
        return byArray;
    }

    static {
        IIIo = new Hashtable();
    }

    private static /* synthetic */ String I1O0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

