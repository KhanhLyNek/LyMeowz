package main;

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
    public void void_IIl_() {
        this.II_I = true;
        this.II1l();
    }

    @Override
    public void void_IIlO() {
        long l;
        if (this.II_I && this.II_l && (l = IO10.IIII()) - this.IIIo >= this.IIl) {
            this.IIIo = l;
            this.II1_();
        }
    }

    @Override
    public void void_IIl0() {
        this.void_II1();
        this.II11();
    }

    @Override
    public boolean boolean_IIII() {
        return this.II_I;
    }

    @Override
    public String java_lang_String_II() {
        String string = this.getClass().getName();
        int n = string.lastIndexOf(46);
        return n >= 0 ? string.substring(n + 1) : string;
    }

    public void void_IIlo() {
        this.II_l = true;
        this.IIIo = 0L;
        this.II1O();
    }

    public void void_II1() {
        this.II_l = false;
        this.II10();
    }

    public void void_II1I() {
        if (this.II_l) {
            this.void_II1();
        } else {
            this.void_IIlo();
        }
    }

    public boolean boolean_IIIl() {
        return this.II_l;
    }

    public void void_II(long l) {
        this.IIl = l > 0L ? l : 0L;
    }

    protected abstract void II1l();

    protected abstract void II11();

    protected abstract void II1_();

    protected abstract void II1O();

    protected abstract void II10();
}

