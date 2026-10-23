package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;

public abstract class IOIO
extends Canvas
implements Runnable {
    public static boolean I0O1;
    private static long I1I0;
    private static int I1Il;
    public static int l1Oo;

    public static void II(GameMidlet gameMidlet) {
        Display.getDisplay((MIDlet)gameMidlet).setCurrent((Displayable)II.var_II_II);
    }

    public IOIO() {
        this.setFullScreenMode(true);
        int n = super.getWidth();
        int n2 = super.getHeight();
        IO1l.l_I0 = 1;
    }

    public final int II_0() {
        int n = super.getWidth();
        return n / IO1l.l_I0 + (n % IO1l.l_I0 == 0 ? 0 : 1);
    }

    public final int II_o() {
        int n = super.getHeight();
        return n / IO1l.l_I0 + (n % IO1l.l_I0 == 0 ? 0 : 1);
    }

    protected void pointerDragged(int n, int n2) {
        this.void_II(n /= IO1l.l_I0, n2 /= IO1l.l_I0);
    }

    protected void pointerPressed(int n, int n2) {
        this.III(n /= IO1l.l_I0, n2 /= IO1l.l_I0);
    }

    protected void pointerReleased(int n, int n2) {
        this.IIII(n /= IO1l.l_I0, n2 /= IO1l.l_I0);
    }

    protected abstract void void_II(int var1, int var2);

    protected abstract void III(int var1, int var2);

    protected abstract void IIII(int var1, int var2);

    protected abstract void IIII();

    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        I0O1 = true;
        while (I0O1) {
            long l;
            if (I1Il == 0) {
                I1I0 = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - I1I0 > 1000L) {
                l1Oo = I1Il;
                I1Il = 0;
                I1I0 = System.currentTimeMillis();
            }
            ++I1Il;
            long l2 = System.currentTimeMillis();
            this.IIII();
            this.repaint();
            this.serviceRepaints();
            long l3 = System.currentTimeMillis() - l2;
            if (IIo1.Il_l) {
                try {
                    if (l3 < (long)IIo1.III().Il00) {
                        do {
                            l = System.currentTimeMillis();
                            Thread.sleep((long)IIo1.III().Il00 - l3);
                        } while (System.currentTimeMillis() - l < (long)IIo1.III().Il00 - l3);
                        continue;
                    }
                    Thread.sleep(1L);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                continue;
            }
            try {
                if (l3 < (long)IlI.III().I1I_) {
                    do {
                        l = System.currentTimeMillis();
                        Thread.sleep((long)IlI.III().I1I_ - l3);
                    } while (System.currentTimeMillis() - l < (long)IlI.III().I1I_ - l3);
                    continue;
                }
                Thread.sleep(1L);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

