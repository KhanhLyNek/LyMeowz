package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class IO0l {
    public int I1l = -1;
    public int lo0I;
    public Vector IIl = new Vector();

    public IO0l() {
    }

    public IO0l(int n, int n2) {
        this.I1l = n;
        this.lo0I = n2;
    }

    public IO0l III(int n, int n2) {
        this.IIl.addElement(new int[]{n, n2});
        return this;
    }

    public boolean II1_() {
        return this.I1l < 0;
    }

    public static boolean II0_(int n) {
        return n == 933 || n == 1815;
    }

    public int[] III() {
        for (int i = 0; i < this.IIl.size(); ++i) {
            int[] nArray = (int[])this.IIl.elementAt(i);
            if (nArray[0] != 31) continue;
            return nArray;
        }
        return null;
    }

    public int IIo1() {
        int[] nArray = this.III();
        return nArray != null ? nArray[1] : this.lo0I;
    }
}

