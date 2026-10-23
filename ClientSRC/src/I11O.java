/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I11O {
    private Random IIII;
    Vector IIII;
    private int[] IlO;

    public I11O(int n, int n2, int n3, int n4) {
        this.IIII = new Random();
        this.IIII = new Vector();
        this.IlO = new int[]{0xFF0000, 0xFFFF00, 65280, 0xFFFFFF, 255, 65535, 0xF0F0F0, 0xC0C0C0};
        for (n3 = 0; n3 < 72; ++n3) {
            this.IIII.addElement(new I1I_(n, n2, Math.abs(this.IIII.nextInt() % 8) + 3, n3 * 5, this.IlO[Math.abs(this.IIII.nextInt() % this.IlO.length)]));
        }
    }

    public I11O() {
    }

    public static InputStream II(String string) {
        return I11O.class.getResourceAsStream(string);
    }
}

