package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

public class I11O {
    private Random var_java_util_Random_IIII;
    Vector var_java_util_Vector_IIII;
    private int[] IlO;

    public I11O(int n, int n2, int n3, int n4) {
        this.var_java_util_Random_IIII = new Random();
        this.var_java_util_Vector_IIII = new Vector();
        this.IlO = new int[]{0xFF0000, 0xFFFF00, 65280, 0xFFFFFF, 255, 65535, 0xF0F0F0, 0xC0C0C0};
        for (n3 = 0; n3 < 72; ++n3) {
            this.var_java_util_Vector_IIII.addElement(new I1I_(n, n2, Math.abs(this.var_java_util_Random_IIII.nextInt() % 8) + 3, n3 * 5, this.IlO[Math.abs(this.var_java_util_Random_IIII.nextInt() % this.IlO.length)]));
        }
    }

    public I11O() {
    }

    public static InputStream II(String string) {
        return I11O.class.getResourceAsStream(string);
    }
}

