/*
 * Decompiled with CFR 0.152.
 */
final class I_1
implements Runnable {
    private I_00 II;

    I_1(I_00 i_00) {
        this.II = i_00;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20000L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        if (this.II.III1.I0OI) {
            try {
                I_0O.II(this.II.III1).IIl1();
            }
            catch (Exception exception) {
                // empty catch block
            }
            I_0O.IIl = true;
            this.II.III1.I0OI = false;
            this.II.III1.I0O = false;
            this.II.III1.II.IIIo(this.II.III1.I0_o);
        }
    }
}

