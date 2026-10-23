package main;

/*
 * Decompiled with CFR 0.152.
 */
public class IlO {
    public static void IIIl(long l) {
        try {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void II(Runnable runnable) {
        new Thread(runnable).start();
    }

    public static void II(Runnable runnable, long l) {
        new Thread(new IlOI(l, runnable)).start();
    }

    public static String III1() {
        return Thread.currentThread().getName();
    }
}

