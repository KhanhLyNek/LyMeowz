package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import nrolite.Res;

public final class I0Il {
    private static III[] II;

    private I0Il() {
    }

    private static synchronized void I___() {
        if (II != null) {
            return;
        }
        try {
            byte[] byArray = Res.read(I0Il.I100("\ube2a\ube1c\ubeef\ubed0\ubea9\ubed7\ubf7a\ubf5e\ubf38", 48734));
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            int n = dataInputStream.readShort();
            II = new III[n];
            for (int i = 0; i < n; ++i) {
                III iII = new III();
                iII.II1o = dataInputStream.readUTF();
                iII.lIO1 = dataInputStream.readUTF();
                int n2 = dataInputStream.readByte();
                iII.II = new II[n2];
                for (int j = 0; j < n2; ++j) {
                    II iI = new II();
                    iI.II1o = dataInputStream.readUTF();
                    iI.__ll = dataInputStream.readShort();
                    iI.lIOl = dataInputStream.readUTF();
                    iI.l0_1 = dataInputStream.readByte();
                    iI.lOlo = dataInputStream.readShort();
                    iII.II[j] = iI;
                }
                I0Il.II[i] = iII;
            }
        }
        catch (IOException iOException) {
            II = new III[0];
        }
    }

    public static III II(int n) {
        I0Il.I___();
        return n >= 0 && n < II.length ? II[n] : null;
    }

    public static String I10O(String string, int n) {
        String[][] stringArrayArray = new String[][]{{I0Il.I100("\ube7b\ube4c\ubea8", 48734), I0Il.I100("\ube2e\ube15\ubef5\ube9b\ubeb6\ube96\ubf76\ubf50\ubf76\ubf18\ua12d", 48734), I0Il.I100("\ube2f\ube08\ua06b\ube9b\ubeb8\ube98\ubf61\ubf17\ubf3b\ua1cc", 48734), I0Il.I100("\ube2a\ube15\ua02d\ubed5\ubefa\ube95\ua1a9\ubf59\ubf76\ubf18\ua12d", 48734)}, {I0Il.I100("\ube7b\ube4c\ubeaf", 48734), I0Il.I100("\ube0c\ua096\ubef2\ubedc\ubefa\ube97\ua1bd\ubf5a", 48734), I0Il.I100("\ube0a\ube15\ubee9\ubed5\ubebd\ubed9\ubf74\ube5e\ubf38\ubf12\ubfb4\ubffd\ubfb3\ubf9c\udeaf\uc04c", 48734), I0Il.I100("\ube0c\ua096\ubef2\ubedc\ubefa\ube97\ubf7f\ubf42\ubf2f\ubf9f\ubffa\ubf93\ubfa1\ubf98\uc07e\uc047", 48734)}, {I0Il.I100("\ube7b\ube4c\ubeae", 48734), I0Il.I100("\ua08f\ube1e\ubebc\ubed6\ubf6a\ua01a\ubf76\ubf17\ubf3e\ua1a6\ubffa", 48734), I0Il.I100("\ua08f\ube1e\ubebc\ubec8\ube30\ube97", 48734), I0Il.I100("\ube36\ube18\ubef3\ube9b\ube82\ube98\ubf61\ubf53\ubf37\ubf55\ubff9\ua10a", 48734)}, {I0Il.I100("\ube7b\ube4c\ubead", 48734), I0Il.I100("\ubf4e\ua0de\ubef3\ube9b\ube91\ube98\ubf75\ubfdd", 48734), I0Il.I100("\ubf4e\ua0de\ubef3\ube9b\ube9d\ube8c\ubf6a\ubf42", 48734), I0Il.I100("\ube08\ube9c\ubeff\ubed3\ubefa\ube97\ubfe2\ubf5e\ubf76\ube64\ubff1\ubfdd", 48734)}, {I0Il.I100("\ube7b\ube4c\ubeac", 48734), I0Il.I100("\ube0f\ube08\ubee5\ube9b\ube96\ube1a\ubf77\ubf17\ubf1d\ubf14\ubff9\ubfd6", 48734), I0Il.I100("\ube0a\ube0f\ubf2c\ua064\ubeb4\ube9e\ubf38\ubf5b\ubfb5\ubf1a\ubfb4\ubff4\ubfa7\ubf83\uc065", 48734), I0Il.I100("\ube08\ube08\ubefd\ube9b\ube8c\ube9c\ubf7f\ubf52\ubf22\ubf14", 48734)}, {I0Il.I100("\ube7b\ube44", 48734), I0Il.I100("\ube2a\ube15\ua02d\ubed5\ubefa\ube95\ua1a9\ubf59\ubf76\ubf17\ubff5\ubfca", 48734), I0Il.I100("\ube2e\ube15\ubef5\ube9b\ubeb6\ube96\ubf76\ubf50", 48734), I0Il.I100("\ube2f\ube08\ua06b\ube9b\ubeb8\ube98\ubf61", 48734)}, {I0Il.I100("\ube7b\ube45", 48734), I0Il.I100("\ube1c\ube08\ubef2\ubed6\ubebb", 48734), I0Il.I100("\ube1a\ube18\ubef2\ubedf\ubebf", 48734), I0Il.I100("\ube1f\ube0d\ubeec\ubece\ubeb6\ube9c", 48734)}, {I0Il.I100("\ube7b\ube4a", 48734), I0Il.I100("\ube1a\ube0f\ubeb2\ube9b\ube98\ube8b\ubf71\ubf52\ubf30", 48734), I0Il.I100("\ube1d\ube1c\ubeee\ubedc\ubeb5", 48734), I0Il.I100("\ube1d\ube08\ubef5", 48734)}, {I0Il.I100("\ube7b\ube4b", 48734), I0Il.I100("\ube0a\ube15\ubee9\ubed5\ubebd\ubed9\ubf74\ube5e\ubf38\ubf12\ubfb4\ubfc7\ubfa0\ubf94", 48734), I0Il.I100("\ube0a\ube15\ua057\ube9b\ubeae\ube8b\ua1bd\ubf59\ubf76\ubf38\ubffb\ubfdc\ubfa0\ubf98", 48734), I0Il.I100("\ube12\ube9d\ubef2\ubedc\ubefa\ubea9\ubf74\ubf56\ubf38\ubf01", 48734)}, {I0Il.I100("\ube7b\ube48", 48734), I0Il.I100("\ube08\ube9c\ubeff\ubed3\ubefa\ube97\ubfe2\ubf5e\ubf76\ubf34\ubfe6\ubfc6", 48734), I0Il.I100("\ube08\ube9c\ubeff\ubed3\ubefa\ube97\ubfe2\ubf5e\ubf76\ubf38\ubffb\ubfdc\ubfa0\ubf98", 48734), I0Il.I100("\ube08\ube9c\ubeff\ubed3\ubefa\ube97\ubfe2\ubf5e\ubf76\ubf3e\ubff5\ubfd8\ubfb3\ubf83\uc07f\uc05b", 48734)}, {I0Il.I100("\ube7b\ube49", 48734), I0Il.I100("\ube35\ube15\ua07b\ubed5\ubebd\ubed9\ubf74\ubf58\ubf38\ubf12", 48734), I0Il.I100("\ube32\ua09e\ubef2\ube9b\ubeb6\ube0b\ubf71", 48734), I0Il.I100("\ube2f\ube08\ua06b\ube9b\ubfcb\ua05c\ubf6c", 48734)}, {I0Il.I100("\ube7b\ube4e", 48734), I0Il.I100("\ubf4e\ua0ae\ubef5\ube9b\ubeb2\ube96\ubf79\ubf17\ubf35\ubf8f\ubff7", 48734), I0Il.I100("\ubf4e\ua0ae\ubef5\ube9b\ubeb4\ua05c\ubf75\ubf17\ubf22\ubf98\ubff9", 48734), I0Il.I100("\ubf4e\ua0ae\ubef5\ube9b\ubeb2\ube96\ubf79\ubf59\ubf31", 48734)}, {I0Il.I100("\ube7b\ube4f", 48734), I0Il.I100("\ubeaa\ube13\ubefb\ube9b\ube9d\ube0d\ubf70\ubf56\ubf38", 48734), I0Il.I100("\ubeaa\ube13\ubefb\ube9b\ube97\ube96\ubf77\ubf45\ubf3f", 48734), I0Il.I100("\ubeaa\ube13\ubefb\ube9b\ube8a\ube98\ubf6a\ubf56\ubf31\ubf00\ubfe7", 48734)}, {I0Il.I100("\ube7b\ube4c", 48734), I0Il.I100("\ube12\ube9d\ubef2\ubedc\ubefa\ubeb8\ubf6a\ubf42", 48734), I0Il.I100("\ube12\ube9d\ubef2\ubedc\ubefa\ubeb4\ubf77\ubf45\ubf3f", 48734), I0Il.I100("\ube12\ube9d\ubef2\ubedc\ubefa\ubeb2\ubf79\ubf5c\ubf37\ubf07\ubffb\ubfc7", 48734)}};
        for (int i = 0; i < stringArrayArray.length; ++i) {
            string = I0Il.III(string, stringArrayArray[i][0], stringArrayArray[i][1 + n]);
        }
        return string;
    }

    public static int IIlo(int n, int n2) {
        switch (n) {
            case -2: {
                return n2 == 0 ? 0 : (n2 == 1 ? 2 : 1);
            }
            case -3: {
                return 10 + n2;
            }
            case -4: {
                return 7 + n2;
            }
            case -5: {
                return 13 + n2;
            }
        }
        return n;
    }

    public static int II1(int n, int n2) {
        switch (n) {
            case -2: {
                return 21 + n2;
            }
            case -3: {
                return n2 == 0 ? 1 : (n2 == 1 ? 8 : 15);
            }
            case -4: {
                return 39 + n2;
            }
            case -6: {
                return 24 + n2;
            }
            case -7: {
                return n2 == 0 ? 3 : (n2 == 1 ? 11 : 17);
            }
            case -8: {
                return n2 == 0 ? 0 : (n2 == 1 ? 7 : 14);
            }
            case -9: {
                return n2 == 0 ? 5 : (n2 == 1 ? 13 : 20);
            }
        }
        return n;
    }

    public static int IlOl() {
        I0Il.I___();
        return II.length;
    }

    static String III(String string, String string2, String string3) {
        int n;
        while ((n = string.indexOf(string2)) >= 0) {
            string = string.substring(0, n) + string3 + string.substring(n + string2.length());
        }
        return string;
    }

    private static /* synthetic */ String I100(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }

    public static final class III {
        public String II1o;
        public String lIO1;
        public II[] II;
    }

    public static final class II {
        public String II1o;
        public String lIOl;
        public int __ll;
        public int l0_1;
        public int lOlo;
    }
}

