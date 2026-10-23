package main;

/*
 * Decompiled with CFR 0.152.
 */
public abstract class I1l1 {
    public static I_lO II11 = new I_lO(I1l1.IlIO("\uc80c\uc8dc\uc8de\uc8b1\uc893\uc976\uc940\uc960", 51322));
    public static I_lO II1_ = new I_lO(I1l1.IlIO("\uc80c\uc8dc\uc8de\uc8b1\uc893\uc976\uc940\uc961", 51322));
    public static I_lO II1O = new I_lO(I1l1.IlIO("\uc80c\uc8cb\uc8dd\uc8ba\uc899\uc963\uc951\uc916\uc914\uc9f7\uc982", 51322));
    public static I_lO II10 = new I_lO(I1l1.IlIO("\uc80c\uc8dc\uc8de\uc8b1\uc893\uc976\uc940\uc961\uc93d\uc9e4\uc9c4", 51322));
    public static I_lO II1o = new I_lO(I1l1.IlIO("\uc80c\uc8d8\uc8d6\uc8be\uc89b\uc974\uc940\uc936", 51322));
    public static I_lO II_ = new I_lO(I1l1.IlIO("\uc80c\uc8dc\uc8de\uc8b1\uc893\uc976\uc940\uc915\uc917\uc9f4\uc9c4", 51322));

    public abstract void IIlO();

    public abstract void III_(IO1l var1);

    private static /* synthetic */ String IlIO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

