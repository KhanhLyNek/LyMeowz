/*
 * Decompiled with CFR 0.152.
 */
package nrolite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import nrolite.Res;

public final class DataDownloader {
    public static final String[] Il_1 = new String[]{DataDownloader.I11O("\u623b\u6206\u62e5\u62c0\u62bc\u62d4\u6322\u6303\u632c\u6303\u63fd\u63c0\u63b2\u6384\u642b\u6447\u642c\u640f\u64ae\u64ce\u64cd\u64b1\u648a\u652d\u6508\u656b\u654a\u65b5\u65d3\u65b3\u6583\u663b\u665d\u6620\u661e\u66bd\u66cc\u66a2\u6684\u6769\u6745\u673e\u6746\u67fa\u67c2\u67aa\u6780\u6865\u6850\u6827\u6812\u68af\u68fb\u68d1\u68aa\u6892\u6977\u6955\u6938\u691c\u69b8\u69d2\u69b4\u6980\u6a72\u6a1f\u6a29\u6a41\u6aa0\u6aca\u6aac\u6a98\u6b6a\u6b04\u6b33\u6b01\u6bf7", 25171), DataDownloader.I11O("\u623b\u6206\u62e5\u62c0\u62bc\u62d4\u6322\u6303\u632f\u6318\u63e0\u63de\u63a2\u63c8\u6470\u6457\u6426\u6410\u64e2\u64cf\u64d1\u64aa\u6498\u6572\u654f\u6574\u651e\u65f7\u65d8\u65b1\u6599\u6671\u661d\u6631\u661e\u66fd\u6680\u66aa\u6682\u677b\u6745\u6726\u6706\u67e9\u67c3\u67f9\u678c\u6860\u681e\u6873\u6811\u68ed\u68e5\u688e\u6890\u689f\u6936\u6953\u696a\u6901\u69ae\u69d2\u698d\u6993\u6a5b\u6a63\u6a39\u6a29\u6aed\u6ae0\u6a85\u6a8d\u6b6e\u6b60\u6b3f\u6b3e\u6be2\u6bc7\u6ba8\u6b8a\u6c46\u6c49\u6c67\u6c05\u6c07\u6cee\u6cd2\u6cae\u6c8f\u6d27\u6d5d\u6d37\u6d00\u6df8\u6dd9\u6dbb\u6d92\u6e76\u6e17\u6e33\u6e00\u6ee0\u6ecb\u6ea5\u6e99\u6f67\u6f14\u6f3c", 25171), DataDownloader.I11O("\u623b\u6206\u62e5\u62c0\u62bc\u62d4\u6322\u6303\u632f\u6318\u63e0\u63de\u63a2\u63c8\u6462\u644b\u642c\u6405\u64ed\u64c5\u6491\u64bd\u6492\u6571\u6514\u652f\u651a\u65a7\u65d2\u65ae\u6585\u667b\u6641\u6626\u664c\u66f4\u66c0\u66b9\u6683\u6760\u6744\u672b\u670d\u67ae\u67ce\u67a2\u67d8\u6835\u6853\u682f\u681b\u68b0\u68d2\u68dd\u68f0\u6895\u6928\u6943\u6960\u691c\u69cf\u69d1\u699d\u69a5\u6a7b\u6a6b\u6a33\u6a3e\u6ac7\u6acf\u6aa8\u6aa6\u6b7d\u6b7c\u6b2c\u6b09\u6bea\u6bc8\u6b80\u6b8f\u6c25\u6c41\u6c2e\u6c0e\u6c19\u6cf7\u6ccf\u6cb1\u6cc6\u6d6e", 25171)};
    public static final int loI_ = 3;
    public static final String lIl0 = "0017bcbaa709fd3be6ca5d1e91c9617e161eefde1d41cb660d84ac2f004b0441";
    public static final String[] URL_NAMES = new String[]{DataDownloader.I11O("\u6214\u621b\u62e5\u62f8\u62ba\u628c", 25171), DataDownloader.I11O("\u6214\u621d\u62fe\u62d7\u62a3\u628b\u632d\u6368\u6339\u6303\u63ff\u63cd", 25171), DataDownloader.I11O("\u6214\u621d\u62fe\u62d7\u62a3\u628b\u632d\u6368\u6339\u6303\u63ff\u63cd\u63e7\u63ce\u6441\u7ad5\u6463\u6412\u64e9\u6452\u64d1\u64b9\u64d4", 25171)};
    public static final int loIO = 0;
    public static final int STATUS_CONNECTING = 1;
    public static final int STATUS_DOWNLOADING = 2;
    public static final int STATUS_UNZIPPING = 3;
    public static final int STATUS_DONE = 4;
    public static final int STATUS_ERROR = -1;
    public static volatile int status = 0;
    public static volatile String lIlo = "";
    public static volatile int currentUrlIndex = 0;
    public static volatile long downloadedBytes = 0L;
    public static volatile long totalBytes = 0L;
    public static volatile int percent = 0;
    public static volatile long speedKBps = 0L;
    public static volatile int unzipCount = 0;
    public static volatile int unzipTotal = 0;
    public static volatile int unzipPercent = 0;
    public static volatile String errorMessage = "";
    private static Thread IIIl = null;
    private static File II = null;

    private DataDownloader() {
    }

    public static synchronized File II() {
        File file;
        File file2;
        String string;
        int n;
        String[] stringArray;
        if (II != null) {
            return II;
        }
        try {
            stringArray = new File(DataDownloader.I11O("\u627d", 25171));
            File file3 = new File((File)stringArray, DataDownloader.I11O("\u627d\u6205\u62e3\u62d9\u62bb\u628b\u6352\u6358\u632e\u6319\u63fd\u63f7", 25171) + System.currentTimeMillis());
            if (file3.createNewFile()) {
                file3.delete();
                II = stringArray;
                return II;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        stringArray = new String[]{DataDownloader.IIl_(System.getProperty(DataDownloader.I11O("\u6235\u621b\u62fd\u62d5\u62ac\u6281\u6363\u6342\u6365\u630e\u63e0\u63da\u63e9\u638b\u6460\u6449\u642c\u6410\u64f8\u64c3\u64de\u64ac\u6499", 25171))), DataDownloader.IIl_(System.getProperty(DataDownloader.I11O("\u6235\u621b\u62fd\u62d5\u62ac\u6281\u6363\u6342\u6365\u630e\u63e0\u63da\u63e9\u6396\u646d\u644b\u6437\u640d\u64f2", 25171))), DataDownloader.I11O("\u627c\u6201\u62e5\u62df\u62bd\u628f\u636a\u6349\u6364\u630f\u63e4\u63dd\u63ab\u6387\u6471\u6441\u6427\u644d\u64b1\u648f\u64f5\u64ec\u64b0\u6559\u6516\u6516\u6516\u65f9\u65d3\u65b3\u6587", 25171), DataDownloader.I11O("\u627c\u6201\u62f5\u62d3\u62ae\u629c\u6369\u6303\u6301\u6358\u63c4\u63ed\u63ea\u63aa\u646a\u6445\u6427\u6407\u64f3", 25171), DataDownloader.I11O("\u627c\u6201\u62e5\u62df\u62bd\u628f\u636a\u6349\u6364\u630f\u63e4\u63dd\u63ab\u6387\u6471\u6441\u6427\u644d\u64b1", 25171), DataDownloader.I11O("\u627c\u6201\u62f5\u62d3\u62ae\u629c\u6369", 25171), System.getProperty(DataDownloader.I11O("\u6239\u6213\u62e7\u62d1\u62e1\u6287\u6362\u6302\u633f\u6307\u63f9\u63cc\u63ae\u6394", 25171)), System.getProperty(DataDownloader.I11O("\u6226\u6201\u62f4\u62c2\u62e1\u6286\u6362\u6341\u632e", 25171)), DataDownloader.I11O("\u627c\u6216\u62f0\u62c4\u62ae\u62c1\u6361\u6343\u6328\u630b\u63e5\u6387\u63b3\u638b\u6475", 25171)};
        for (n = 0; n < stringArray.length; ++n) {
            string = stringArray[n];
            if (string == null || string.trim().length() == 0) continue;
            try {
                file2 = new File(string, DataDownloader.I11O("\u623d\u6200\u62fe\u62ef\u62ab\u628f\u6379\u634d", 25171));
                file = new File(file2, DataDownloader.I11O("\u6237\u6213\u62e5\u62d1\u62e0\u6280\u637f\u6343\u6327\u6303\u63fd\u63cd\u63e8\u6394\u6460\u6457\u646c\u641a\u64b0\u648f\u64e0\u64b7\u6493\u6578\u655e\u6522", 25171));
                if (!file.exists() || file.length() <= 0L) continue;
                II = file2;
                return II;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        for (n = 0; n < stringArray.length; ++n) {
            string = stringArray[n];
            if (string == null || string.trim().length() == 0) continue;
            try {
                File file4;
                file2 = new File(string);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!(file = new File(file2, DataDownloader.I11O("\u623d\u6200\u62fe\u62ef\u62ab\u628f\u6379\u634d", 25171))).exists()) {
                    file.mkdirs();
                }
                if (!(file4 = new File(file, DataDownloader.I11O("\u627d\u6205\u62e3\u62d9\u62bb\u628b\u6352\u6358\u632e\u6319\u63fd\u63f7", 25171) + System.currentTimeMillis())).createNewFile()) continue;
                file4.delete();
                II = file;
                return II;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        II = new File(DataDownloader.I11O("\u627d", 25171));
        return II;
    }

    private static String IIl_(String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).startsWith(DataDownloader.I11O("\u6235\u621b\u62fd\u62d5\u62f5\u62c1\u6322\u6303", 25171))) {
            string = string.substring(7);
        } else if (string.startsWith(DataDownloader.I11O("\u6235\u621b\u62fd\u62d5\u62f5\u62c1\u6322", 25171))) {
            string = string.substring(6);
        } else if (string.startsWith(DataDownloader.I11O("\u6235\u621b\u62fd\u62d5\u62f5", 25171))) {
            string = string.substring(5);
        }
        return string;
    }

    private static boolean boolean_II(File file) {
        File file2 = new File(file, DataDownloader.I11O("\u6237\u6213\u62e5\u62d1\u62e0\u6280\u637f\u6343\u6327\u6303\u63fd\u63cd\u63e8\u638b\u6464\u6454\u6430\u644c\u64e3\u64c9\u64d1", 25171));
        File file3 = new File(file, DataDownloader.I11O("\u6237\u6213\u62e5\u62d1\u62e0\u6280\u637f\u6343\u6327\u6303\u63fd\u63cd\u63e8\u6394\u6460\u6457\u646c\u641a\u64b0\u648f\u64e0\u64b7\u6493\u6578\u655e\u6522", 25171));
        return file2.isFile() && file2.length() > 0L && file3.isFile() && file3.length() > 0L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean boolean_III(File file) {
        boolean bl;
        if (!DataDownloader.boolean_II(file)) {
            return false;
        }
        if (new File(file, DataDownloader.I11O("\u6237\u6213\u62e5\u62d1\u62e0\u62c0\u6369\u6343\u633c\u6304\u63e5\u63c7\u63a6\u6382\u646c\u644a\u6424", 25171)).exists()) {
            return false;
        }
        File file2 = new File(file, DataDownloader.I11O("\u6237\u6213\u62e5\u62d1\u62e0\u62c0\u637b\u6349\u6339", 25171));
        if (!file2.isFile()) {
            return true;
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            byte[] byArray = new byte[16];
            int n = fileInputStream.read(byArray);
            bl = n > 0 && new String(byArray, 0, n).trim().equals(String.valueOf(3));
        }
        catch (Throwable throwable) {
            try {
                fileInputStream.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                return false;
            }
        }
        fileInputStream.close();
        return bl;
    }

    public static boolean isDataReady() {
        try {
            if (Res.class.getResourceAsStream(DataDownloader.I11O("\u627c\u621c\u62e3\u62df\u62a3\u6287\u6379\u6349\u6364\u6307\u63e8\u63d8\u63b4\u63c8\u6467\u644d\u642d", 25171)) != null && Res.class.getResourceAsStream(DataDownloader.I11O("\u627c\u621c\u62e3\u62df\u62a3\u6287\u6379\u6349\u6364\u6318\u63ec\u63db\u63e8\u639e\u6434\u640b\u641c\u640b\u64ef\u64c4\u64da\u64a6", 25171)) != null) {
                return true;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            if (DataDownloader.boolean_III(DataDownloader.II())) {
                return true;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            if (DataDownloader.boolean_III(new File(DataDownloader.I11O("\u627d", 25171)))) {
                return true;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String java_lang_String_II(File file) throws Exception {
        byte[] byArray;
        MessageDigest messageDigest = MessageDigest.getInstance(DataDownloader.I11O("\u6200\u623a\u62d0\u629d\u62fd\u62db\u633b", 25171));
        try (FileInputStream fileInputStream = new FileInputStream(file);){
            int n;
            byArray = new byte[16384];
            while ((n = fileInputStream.read(byArray)) != -1) {
                messageDigest.update(byArray, 0, n);
            }
        }
        byArray = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < byArray.length; ++i) {
            int n = byArray[i] & 0xFF;
            if (n < 16) {
                stringBuffer.append('0');
            }
            stringBuffer.append(Integer.toHexString(n));
        }
        return stringBuffer.toString();
    }

    public static synchronized void startDownload(Runnable runnable) {
        if (IIIl != null && IIIl.isAlive()) {
            return;
        }
        status = 1;
        lIlo = DataDownloader.I11O("\u6343\u6213\u62ff\u62d7\u62ef\u628d\u6365\u6359\u7de2\u6304\u63a9\u63ca\u7d0c\u63c6\u6471\u7a87\u642a\u644c\u64af\u648e", 25171);
        currentUrlIndex = 0;
        downloadedBytes = 0L;
        totalBytes = 0L;
        percent = 0;
        speedKBps = 0L;
        unzipCount = 0;
        unzipTotal = 0;
        unzipPercent = 0;
        errorMessage = "";
        IIIl = new Thread(new IOOI(runnable));
        IIIl.start();
    }

    private static HttpURLConnection II(String string) throws Exception {
        String string2 = null;
        for (int i = 0; i < 12; ++i) {
            URL uRL = new URL(string);
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestProperty(DataDownloader.I11O("\u6206\u6201\u62f4\u62c2\u62e2\u62af\u636a\u6349\u6325\u631e", 25171), DataDownloader.I11O("\u621e\u621d\u62eb\u62d9\u62a3\u6282\u636c\u6303\u637e\u6344\u63b9\u6388\u63ef\u63b1\u646c\u644a\u6427\u640d\u64f6\u64d3\u649f\u6490\u64a9\u653c\u650a\u656a\u6557\u65a8\u658c\u65f6\u65a2\u667d\u665d\u6664\u6645\u66ab\u668f\u66b6\u66db\u6738\u6702\u676a\u6727\u67da\u67e8\u678a\u678c\u6870\u6846\u686d\u6850\u68ae\u68af", 25171));
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(35000);
            httpURLConnection.setInstanceFollowRedirects(false);
            if (string2 != null) {
                httpURLConnection.setRequestProperty(DataDownloader.I11O("\u6210\u621d\u62fe\u62db\u62a6\u628b", 25171), string2);
            }
            int n = httpURLConnection.getResponseCode();
            String string3 = httpURLConnection.getHeaderField(DataDownloader.I11O("\u6200\u6217\u62e5\u629d\u628c\u6281\u6362\u6347\u6322\u630f", 25171));
            if (string3 != null) {
                string2 = string3.split(DataDownloader.I11O("\u6268", 25171))[0];
            }
            if (n == 301 || n == 302 || n == 303 || n == 307 || n == 308) {
                String string4 = httpURLConnection.getHeaderField(DataDownloader.I11O("\u621f\u621d\u62f2\u62d1\u62bb\u6287\u6362\u6342", 25171));
                if (string4 == null) {
                    throw new IOException(DataDownloader.I11O("\u6201\u6217\u62f5\u62d9\u62bd\u628b\u636e\u6358\u636b\u631e\u63e1\u63c1\u63a2\u6393\u6425\u644c\u6426\u6403\u64e5\u64c5\u64cd\u64fe\u64b1\u6573\u6558\u653b\u650d\u65f1\u65d8\u65b8", 25171));
                }
                if (!string4.startsWith(DataDownloader.I11O("\u623b\u6206\u62e5\u62c0", 25171))) {
                    string4 = new URL(uRL, string4).toString();
                }
                if (!string4.startsWith(DataDownloader.I11O("\u623b\u6206\u62e5\u62c0\u62bc\u62d4\u6322\u6303", 25171))) {
                    throw new IOException(DataDownloader.I11O("\u6210\u621a\u62e4\u62c9\u62aa\u6280\u632d\u6344\u633e\u6305\u63e7\u63cf\u63e7\u638d\u646d\u644b\u642d\u6405\u64a1\u64c1\u64d1\u64fe\u6489\u6573\u655a\u6534\u6559\u65b0\u65dc\u65be\u659a\u667a\u6654\u6672\u6601\u66f8\u66ce\u66a7\u66cd\u6744\u677f\u671e\u6739\u67db\u678e", 25171));
                }
                httpURLConnection.disconnect();
                string = string4;
                continue;
            }
            if (n == 200) {
                return httpURLConnection;
            }
            throw new IOException(DataDownloader.I11O("\u621b\u6226\u62c5\u62e0\u62ef\u628b\u637f\u635e\u6324\u6318\u63b3\u6388", 25171) + n);
        }
        throw new IOException(DataDownloader.I11O("\u6202\u6207\u62f0\u6290\u62a1\u6286\u6364\u6349\u633e\u634a\u63e5\u63c9\u63a9\u63c6\u6466\u644c\u6436\u641b\u64e4\u64ce\u649f\u64b6\u6488\u6573\u6555\u653d\u6559\u65cd\u65e5\u659a", 25171));
    }

    public static /* synthetic */ HttpURLConnection III(String string) throws Exception {
        return DataDownloader.II(string);
    }

    public static /* synthetic */ String java_lang_String_III(File file) throws Exception {
        return DataDownloader.java_lang_String_II(file);
    }

    public static /* synthetic */ boolean IIII(File file) {
        return DataDownloader.boolean_II(file);
    }

    private static /* synthetic */ String I11O(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

