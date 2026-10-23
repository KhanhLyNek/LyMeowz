/*
 * Decompiled with CFR 0.152.
 */
public class Il1_
extends IllO {
    private static Il1_ II;

    private Il1_() {
    }

    public static Il1_ II() {
        if (II == null) {
            II = new Il1_();
        }
        return II;
    }

    public Il1_ III() {
        this.I_OI();
        this.II1_ = "";
        this.II = null;
        return this;
    }

    public Il1_ II(String string) {
        this.II1_ = string;
        return this;
    }

    public Il1_ II(String string, String string2, int n, Object object) {
        this.II(string, string2, n, object, true);
        return this;
    }

    public Il1_ II(String string, String string2) {
        this.II(string, string2, -1, null, false);
        return this;
    }

    public Il1_ II(I1_1 i1_1) {
        this.II(i1_1);
        return this;
    }

    @Override
    public void I__0() {
        Il1_.II(this);
        super.I__0();
    }

    public static void IIlO(int n) {
        if (Il1_.II() == Il1_.II()) {
            Il1_.II().IIlI(n);
        }
    }
}

