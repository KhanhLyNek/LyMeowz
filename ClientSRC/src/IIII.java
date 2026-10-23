/*
 * Decompiled with CFR 0.152.
 */
public abstract class IIII
implements Ill {
    protected boolean II_I = false;
    protected boolean II_l = false;
    protected long IIIo = 0L;
    protected long IIl = 0L;

    @Override
    public void IIl_() {
        this.II_I = true;
        this.II1l();
    }

    @Override
    public void IIlO() {
        long l;
        if (this.II_I && this.II_l && (l = IO10.IIII()) - this.IIIo >= this.IIl) {
            this.IIIo = l;
            this.II1_();
        }
    }

    @Override
    public void IIl0() {
        this.II1();
        this.II11();
    }

    @Override
    public boolean IIII() {
        return this.II_I;
    }

    @Override
    public String II() {
        String string = this.getClass().getName();
        int n = string.lastIndexOf(46);
        return n >= 0 ? string.substring(n + 1) : string;
    }

    public void IIlo() {
        this.II_l = true;
        this.IIIo = 0L;
        this.II1O();
    }

    public void II1() {
        this.II_l = false;
        this.II10();
    }

    public void II1I() {
        if (this.II_l) {
            this.II1();
        } else {
            this.IIlo();
        }
    }

    public boolean IIIl() {
        return this.II_l;
    }

    public void II(long l) {
        this.IIl = l > 0L ? l : 0L;
    }

    protected abstract void II1l();

    protected abstract void II11();

    protected abstract void II1_();

    protected abstract void II1O();

    protected abstract void II10();
}

