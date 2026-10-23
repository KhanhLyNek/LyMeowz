/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Il_l {

    /*
     * Duplicate member names - consider using --renamedupmembers true
     */
    public static class III0 {
        private char[] II;
        private int I1_1;

        public III0() {
            this(16);
        }

        public III0(int n) {
            this.II = new char[n];
            this.I1_1 = 0;
        }

        public III0(String string) {
            this(string.length() + 16);
            this.II(string);
        }

        public III0 II(String string) {
            if (string == null) {
                string = III0.IIOI("\u9ce7\u9cdd\u9cab\u9c8a", 40073);
            }
            int n = string.length();
            this.II1_(this.I1_1 + n);
            string.getChars(0, n, this.II, this.I1_1);
            this.I1_1 += n;
            return this;
        }

        public III0 II(char c) {
            this.II1_(this.I1_1 + 1);
            this.II[this.I1_1++] = c;
            return this;
        }

        public III0 II(int n) {
            return this.II(String.valueOf(n));
        }

        public III0 II(long l) {
            return this.II(String.valueOf(l));
        }

        public III0 II(boolean bl) {
            return this.II(String.valueOf(bl));
        }

        public III0 II(Object object) {
            return this.II(object == null ? III0.IIOI("\u9ce7\u9cdd\u9cab\u9c8a", 40073) : object.toString());
        }

        public III0 II(int n, String string) {
            if (n < 0 || n > this.I1_1) {
                throw new IndexOutOfBoundsException();
            }
            if (string == null) {
                string = III0.IIOI("\u9ce7\u9cdd\u9cab\u9c8a", 40073);
            }
            int n2 = string.length();
            this.II1_(this.I1_1 + n2);
            System.arraycopy(this.II, n, this.II, n + n2, this.I1_1 - n);
            string.getChars(0, n2, this.II, n);
            this.I1_1 += n2;
            return this;
        }

        public III0 II(int n, int n2) {
            int n3;
            if (n < 0 || n > this.I1_1 || n > n2) {
                throw new IndexOutOfBoundsException();
            }
            if (n2 > this.I1_1) {
                n2 = this.I1_1;
            }
            if ((n3 = n2 - n) > 0) {
                System.arraycopy(this.II, n2, this.II, n, this.I1_1 - n2);
                this.I1_1 -= n3;
            }
            return this;
        }

        public III0 III(int n) {
            if (n < 0 || n >= this.I1_1) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(this.II, n + 1, this.II, n, this.I1_1 - n - 1);
            --this.I1_1;
            return this;
        }

        public III0 II() {
            for (int i = 0; i < this.I1_1 / 2; ++i) {
                char c = this.II[i];
                this.II[i] = this.II[this.I1_1 - 1 - i];
                this.II[this.I1_1 - 1 - i] = c;
            }
            return this;
        }

        public char II(int n) {
            if (n < 0 || n >= this.I1_1) {
                throw new IndexOutOfBoundsException();
            }
            return this.II[n];
        }

        public void II(int n, char c) {
            if (n < 0 || n >= this.I1_1) {
                throw new IndexOutOfBoundsException();
            }
            this.II[n] = c;
        }

        public int IIl0() {
            return this.I1_1;
        }

        public void II11(int n) {
            if (n < 0) {
                throw new IndexOutOfBoundsException();
            }
            this.II1_(n);
            if (n > this.I1_1) {
                for (int i = this.I1_1; i < n; ++i) {
                    this.II[i] = '\u0000';
                }
            }
            this.I1_1 = n;
        }

        public String toString() {
            return new String(this.II, 0, this.I1_1);
        }

        public String IIII(int n) {
            return this.II(n, this.I1_1);
        }

        public String II(int n, int n2) {
            if (n < 0 || n2 > this.I1_1 || n > n2) {
                throw new IndexOutOfBoundsException();
            }
            return new String(this.II, n, n2 - n);
        }

        private void II1_(int n) {
            if (n > this.II.length) {
                int n2 = (this.II.length + 1) * 2;
                if (n2 < n) {
                    n2 = n;
                }
                char[] cArray = new char[n2];
                System.arraycopy(this.II, 0, cArray, 0, this.I1_1);
                this.II = cArray;
            }
        }

        private static /* synthetic */ String IIOI(String string, int n) {
            char[] cArray = string.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ n + i * 31);
            }
            return new String(cArray);
        }
    }

    /*
     * Duplicate member names - consider using --renamedupmembers true
     */
    public static class III {
        public static void IIII(II iI) {
            III.II(iI, null);
        }

        public static void II(II iI, IIIl iIIl) {
            int n;
            Object[] objectArray = new Object[iI.IIlO()];
            for (n = 0; n < iI.IIlO(); ++n) {
                objectArray[n] = iI.II(n);
            }
            III.II(objectArray, 0, objectArray.length - 1, iIIl);
            for (n = 0; n < iI.IIlO(); ++n) {
                iI.II(n, objectArray[n]);
            }
        }

        private static void II(Object[] objectArray, int n, int n2, IIIl iIIl) {
            if (n < n2) {
                int n3 = III.II(objectArray, n, n2, iIIl);
                III.II(objectArray, n, n3 - 1, iIIl);
                III.II(objectArray, n3 + 1, n2, iIIl);
            }
        }

        private static int II(Object[] objectArray, int n, int n2, IIIl iIIl) {
            Object object = objectArray[n2];
            int n3 = n - 1;
            for (int i = n; i < n2; ++i) {
                if (III.II(objectArray[i], object, iIIl) > 0) continue;
                Object object2 = objectArray[++n3];
                objectArray[n3] = objectArray[i];
                objectArray[i] = object2;
            }
            Object object3 = objectArray[n3 + 1];
            objectArray[n3 + 1] = objectArray[n2];
            objectArray[n2] = object3;
            return n3 + 1;
        }

        private static int II(Object object, Object object2, IIIl iIIl) {
            if (iIIl != null) {
                return iIIl.II(object, object2);
            }
            return ((IIII)object).III(object2);
        }

        public static void IIIl(II iI) {
            int n = iI.IIlO();
            for (int i = 0; i < n / 2; ++i) {
                Object object = iI.II(i);
                iI.II(i, iI.II(n - 1 - i));
                iI.II(n - 1 - i, object);
            }
        }

        public static int II(II iI, Object object) {
            return III.II(iI, object, null);
        }

        public static int II(II iI, Object object, IIIl iIIl) {
            int n = 0;
            int n2 = iI.IIlO() - 1;
            while (n <= n2) {
                int n3 = (n + n2) / 2;
                Object object2 = iI.II(n3);
                int n4 = III.II(object2, object, iIIl);
                if (n4 < 0) {
                    n = n3 + 1;
                    continue;
                }
                if (n4 > 0) {
                    n2 = n3 - 1;
                    continue;
                }
                return n3;
            }
            return -(n + 1);
        }

        public static Object II(II iI) {
            return III.II(iI, null);
        }

        public static Object II(II iI, IIIl iIIl) {
            if (iI.II1_()) {
                throw new RuntimeException(III.II_o("\uc689\uc686\uc77a\uc75d\uc731\uc747\uc7ea\uc7cc\uc7b7\uc797", 50892));
            }
            Object object = iI.II(0);
            for (int i = 1; i < iI.IIlO(); ++i) {
                Object object2 = iI.II(i);
                if (III.II(object2, object, iIIl) >= 0) continue;
                object = object2;
            }
            return object;
        }

        public static Object III(II iI) {
            return III.III(iI, null);
        }

        public static Object III(II iI, IIIl iIIl) {
            if (iI.II1_()) {
                throw new RuntimeException(III.II_o("\uc689\uc686\uc77a\uc75d\uc731\uc747\uc7ea\uc7cc\uc7b7\uc797", 50892));
            }
            Object object = iI.II(0);
            for (int i = 1; i < iI.IIlO(); ++i) {
                Object object2 = iI.II(i);
                if (III.II(object2, object, iIIl) <= 0) continue;
                object = object2;
            }
            return object;
        }

        public static void II(II iI, Random random) {
            int n = iI.IIlO();
            for (int i = n - 1; i > 0; --i) {
                int n2 = random.nextInt(i + 1);
                Object object = iI.II(i);
                iI.II(i, iI.II(n2));
                iI.II(n2, object);
            }
        }

        private static /* synthetic */ String II_o(String string, int n) {
            char[] cArray = string.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ n + i * 31);
            }
            return new String(cArray);
        }
    }

    public static interface IIII {
        public int III(Object var1);
    }

    public static interface IIIl {
        public int II(Object var1, Object var2);
    }

    public static class IIIO {
        private II II1 = new II();
        private IIIl II;

        public IIIO() {
            this(null);
        }

        public IIIO(IIIl iIIl) {
            this.II = iIIl;
        }

        public void III(Object object) {
            this.II1.III(object);
            this.II1I(this.II1.IIlO() - 1);
        }

        public Object II() {
            if (this.II1.II1_()) {
                return null;
            }
            Object object = this.II1.II(0);
            Object object2 = this.II1.III(this.II1.IIlO() - 1);
            if (!this.II1.II1_()) {
                this.II1.II(0, object2);
                this.II1l(0);
            }
            return object;
        }

        public Object III_() {
            return this.II1.II1_() ? null : this.II1.II(0);
        }

        public int IIlO() {
            return this.II1.IIlO();
        }

        public boolean II1_() {
            return this.II1.II1_();
        }

        public void I_1O() {
            this.II1.I_1O();
        }

        private void II1I(int n) {
            int n2;
            Object object;
            Object object2 = this.II1.II(n);
            while (n > 0 && this.II(object2, object = this.II1.II(n2 = (n - 1) / 2)) < 0) {
                this.II1.II(n, object);
                n = n2;
            }
            this.II1.II(n, object2);
        }

        private void II1l(int n) {
            Object object = this.II1.II(n);
            int n2 = this.II1.IIlO() / 2;
            while (n < n2) {
                int n3 = 2 * n + 1;
                Object object2 = this.II1.II(n3);
                int n4 = n3 + 1;
                if (n4 < this.II1.IIlO() && this.II(object2, this.II1.II(n4)) > 0) {
                    n3 = n4;
                    object2 = this.II1.II(n4);
                }
                if (this.II(object, object2) <= 0) break;
                this.II1.II(n, object2);
                n = n3;
            }
            this.II1.II(n, object);
        }

        private int II(Object object, Object object2) {
            if (this.II != null) {
                return this.II.II(object, object2);
            }
            return ((IIII)object).III(object2);
        }
    }

    /*
     * Duplicate member names - consider using --renamedupmembers true
     */
    public static class III_ {
        private II II = null;
        private II III = null;
        private int I1_ = 0;

        public void III(Object object) {
            this.IIIl(object);
        }

        public void IIII(Object object) {
            II iI = new II(object);
            if (this.II == null) {
                this.II = this.III = iI;
            } else {
                iI.IIII = this.II;
                this.II.IIIl = iI;
                this.II = iI;
            }
            ++this.I1_;
        }

        public void IIIl(Object object) {
            II iI = new II(object);
            if (this.III == null) {
                this.II = this.III = iI;
            } else {
                iI.IIIl = this.III;
                this.III.IIII = iI;
                this.III = iI;
            }
            ++this.I1_;
        }

        public Object II(int n) {
            return ((II)this.II((int)n)).II;
        }

        public Object III() {
            if (this.II == null) {
                throw new RuntimeException(III_.IIO("\uae9f\uae94\uaf68\uaf43\uaf2f\uaf55\uaff8\uafda\uafa1\uaf85", 44762));
            }
            return this.II.II;
        }

        public Object IIII() {
            if (this.III == null) {
                throw new RuntimeException(III_.IIO("\uae9f\uae94\uaf68\uaf43\uaf2f\uaf55\uaff8\uafda\uafa1\uaf85", 44762));
            }
            return this.III.II;
        }

        public Object IIIl() {
            if (this.II == null) {
                throw new RuntimeException(III_.IIO("\uae9f\uae94\uaf68\uaf43\uaf2f\uaf55\uaff8\uafda\uafa1\uaf85", 44762));
            }
            Object object = this.II.II;
            this.II = this.II.IIII;
            if (this.II == null) {
                this.III = null;
            } else {
                this.II.IIIl = null;
            }
            --this.I1_;
            return object;
        }

        public Object III1() {
            if (this.III == null) {
                throw new RuntimeException(III_.IIO("\uae9f\uae94\uaf68\uaf43\uaf2f\uaf55\uaff8\uafda\uafa1\uaf85", 44762));
            }
            Object object = this.III.II;
            this.III = this.III.IIIl;
            if (this.III == null) {
                this.II = null;
            } else {
                this.III.IIII = null;
            }
            --this.I1_;
            return object;
        }

        public Object III(int n) {
            Object object = this.II(n);
            return this.II((II)object);
        }

        public boolean II(Object object) {
            II iI = this.II;
            while (iI != null) {
                if (iI.II == null ? object == null : iI.II.equals(object)) {
                    this.II(iI);
                    return true;
                }
                iI = iI.IIII;
            }
            return false;
        }

        public int IIlO() {
            return this.I1_;
        }

        public boolean II1_() {
            return this.I1_ == 0;
        }

        public void I_1O() {
            this.III = null;
            this.II = null;
            this.I1_ = 0;
        }

        public boolean III(Object object) {
            II iI = this.II;
            while (iI != null) {
                if (iI.II == null ? object == null : iI.II.equals(object)) {
                    return true;
                }
                iI = iI.IIII;
            }
            return false;
        }

        private II II(int n) {
            II iI;
            if (n < 0 || n >= this.I1_) {
                throw new IndexOutOfBoundsException();
            }
            if (n < this.I1_ / 2) {
                iI = this.II;
                for (int i = 0; i < n; ++i) {
                    iI = iI.IIII;
                }
            } else {
                iI = this.III;
                for (int i = this.I1_ - 1; i > n; --i) {
                    iI = iI.IIIl;
                }
            }
            return iI;
        }

        private Object II(II iI) {
            Object object = iI.II;
            if (iI.IIIl == null) {
                this.II = iI.IIII;
            } else {
                iI.IIIl.IIII = iI.IIII;
            }
            if (iI.IIII == null) {
                this.III = iI.IIIl;
            } else {
                iI.IIII.IIIl = iI.IIIl;
            }
            --this.I1_;
            return object;
        }

        private static /* synthetic */ String IIO(String string, int n) {
            char[] cArray = string.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ n + i * 31);
            }
            return new String(cArray);
        }

        static class II {
            Object II;
            II IIII;
            II IIIl;

            II(Object object) {
                this.II = object;
            }
        }
    }

    public static class III1 {
        private II[] II;
        private int I1_;
        private int I1_I;

        public III1() {
            this(16);
        }

        public III1(int n) {
            this.II = new II[n];
            this.I1_I = (int)((float)n * 0.75f);
            this.I1_ = 0;
        }

        public Object II(Object object, Object object2) {
            if (object == null) {
                throw new NullPointerException();
            }
            int n = object.hashCode();
            int n2 = (n & Integer.MAX_VALUE) % this.II.length;
            II iI = this.II[n2];
            while (iI != null) {
                if (iI.I1_l == n && iI.III.equals(object)) {
                    Object object3 = iI.IIII;
                    iI.IIII = object2;
                    return object3;
                }
                iI = iI.II;
            }
            if (this.I1_ >= this.I1_I) {
                this.I_00();
                n2 = (n & Integer.MAX_VALUE) % this.II.length;
            }
            this.II[n2] = new II(object, object2, n, this.II[n2]);
            ++this.I1_;
            return null;
        }

        public Object II(Object object) {
            if (object == null) {
                return null;
            }
            int n = object.hashCode();
            int n2 = (n & Integer.MAX_VALUE) % this.II.length;
            II iI = this.II[n2];
            while (iI != null) {
                if (iI.I1_l == n && iI.III.equals(object)) {
                    return iI.IIII;
                }
                iI = iI.II;
            }
            return null;
        }

        public Object III(Object object) {
            if (object == null) {
                return null;
            }
            int n = object.hashCode();
            int n2 = (n & Integer.MAX_VALUE) % this.II.length;
            II iI = null;
            II iI2 = this.II[n2];
            while (iI2 != null) {
                if (iI2.I1_l == n && iI2.III.equals(object)) {
                    if (iI == null) {
                        this.II[n2] = iI2.II;
                    } else {
                        iI.II = iI2.II;
                    }
                    --this.I1_;
                    return iI2.IIII;
                }
                iI = iI2;
                iI2 = iI2.II;
            }
            return null;
        }

        public boolean IIII(Object object) {
            return this.II(object) != null;
        }

        public int IIlO() {
            return this.I1_;
        }

        public boolean II1_() {
            return this.I1_ == 0;
        }

        public void I_1O() {
            for (int i = 0; i < this.II.length; ++i) {
                this.II[i] = null;
            }
            this.I1_ = 0;
        }

        public Il_l$II IIII() {
            Il_l$II iI = new Il_l$II();
            for (int i = 0; i < this.II.length; ++i) {
                II iI2 = this.II[i];
                while (iI2 != null) {
                    iI.III(iI2.III);
                    iI2 = iI2.II;
                }
            }
            return iI;
        }

        public Il_l$II IIIl() {
            Il_l$II iI = new Il_l$II();
            for (int i = 0; i < this.II.length; ++i) {
                II iI2 = this.II[i];
                while (iI2 != null) {
                    iI.III(iI2.IIII);
                    iI2 = iI2.II;
                }
            }
            return iI;
        }

        private void I_00() {
            II[] iIArray = this.II;
            this.II = new II[iIArray.length * 2];
            this.I1_I = (int)((float)this.II.length * 0.75f);
            for (int i = 0; i < iIArray.length; ++i) {
                II iI = iIArray[i];
                while (iI != null) {
                    II iI2 = iI.II;
                    int n = (iI.I1_l & Integer.MAX_VALUE) % this.II.length;
                    iI.II = this.II[n];
                    this.II[n] = iI;
                    iI = iI2;
                }
            }
        }

        static class II {
            Object III;
            Object IIII;
            II II;
            int I1_l;

            II(Object object, Object object2, int n, II iI) {
                this.III = object;
                this.IIII = object2;
                this.I1_l = n;
                this.II = iI;
            }
        }
    }

    /*
     * Duplicate member names - consider using --renamedupmembers true
     */
    public static class II {
        private Object[] II;
        private int I1_;

        public II() {
            this(10);
        }

        public II(int n) {
            this.II = new Object[n];
            this.I1_ = 0;
        }

        public void III(Object object) {
            this.I_0O();
            this.II[this.I1_++] = object;
        }

        public void III(int n, Object object) {
            if (n < 0 || n > this.I1_) {
                throw new IndexOutOfBoundsException();
            }
            this.I_0O();
            System.arraycopy(this.II, n, this.II, n + 1, this.I1_ - n);
            this.II[n] = object;
            ++this.I1_;
        }

        public Object II(int n) {
            if (n < 0 || n >= this.I1_) {
                throw new IndexOutOfBoundsException();
            }
            return this.II[n];
        }

        public Object III(int n) {
            if (n < 0 || n >= this.I1_) {
                throw new IndexOutOfBoundsException();
            }
            Object object = this.II[n];
            int n2 = this.I1_ - n - 1;
            if (n2 > 0) {
                System.arraycopy(this.II, n + 1, this.II, n, n2);
            }
            this.II[--this.I1_] = null;
            return object;
        }

        public boolean II(Object object) {
            for (int i = 0; i < this.I1_; ++i) {
                if (!(this.II[i] == null ? object == null : this.II[i].equals(object))) continue;
                this.III(i);
                return true;
            }
            return false;
        }

        public int IIlO() {
            return this.I1_;
        }

        public boolean II1_() {
            return this.I1_ == 0;
        }

        public void I_1O() {
            for (int i = 0; i < this.I1_; ++i) {
                this.II[i] = null;
            }
            this.I1_ = 0;
        }

        public boolean III(Object object) {
            return this.II(object) >= 0;
        }

        public int II(Object object) {
            for (int i = 0; i < this.I1_; ++i) {
                if (!(this.II[i] == null ? object == null : this.II[i].equals(object))) continue;
                return i;
            }
            return -1;
        }

        public Object II(int n, Object object) {
            if (n < 0 || n >= this.I1_) {
                throw new IndexOutOfBoundsException();
            }
            Object object2 = this.II[n];
            this.II[n] = object;
            return object2;
        }

        private void I_0O() {
            if (this.I1_ == this.II.length) {
                int n = this.II.length + (this.II.length >> 1);
                Object[] objectArray = new Object[n];
                System.arraycopy(this.II, 0, objectArray, 0, this.I1_);
                this.II = objectArray;
            }
        }
    }
}

