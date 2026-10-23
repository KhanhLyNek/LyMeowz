package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IlI0 {
    private Il_l.II III0 = new Il_l.II();

    public void II(II iI) {
        if (iI != null) {
            this.III0.void_III(iI);
        }
    }

    public void III(II iI) {
        this.III0.boolean_II(iI);
    }

    public void I_1O() {
        this.III0.I_1O();
    }

    public void IIlO() {
        long l = IO10.IIII();
        for (int i = 0; i < this.III0.IIlO(); ++i) {
            II iI = (II)this.III0.II(i);
            iI.IIII(l);
        }
    }

    public static abstract class II {
        private long IIo_;
        private long IIoO;

        public II(long l) {
            this.IIo_ = l;
            this.IIoO = IO10.IIII();
        }

        private void IIII(long l) {
            if (this.IIo_ == 0L || l - this.IIoO >= this.IIo_) {
                this.IIoO = l;
                this.IIO1();
            }
        }

        protected abstract void IIO1();
    }
}

