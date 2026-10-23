package main;

/*
 * Decompiled with CFR 0.152.
 */
final class I_00
implements Runnable {
    private final String Il1o;
    private int I_Oo;
    final I_0O III1;

    I_00(I_0O i_0O, String string, int n) {
        this.III1 = i_0O;
        this.Il1o = string;
        this.I_Oo = n;
    }

    @Override
    public void run() {
        block4: {
            I_0O.IIl = false;
            new Thread(new I_1(this)).start();
            this.III1.I0OI = true;
            this.III1.I0O = true;
            try {
                int n = this.I_Oo;
                String string = this.Il1o;
                I_0O.II(this.III1, new IO1O(string, n));
                I_0O.II(this.III1, I_0O.IO1O_II(this.III1).java_io_DataOutputStream_III());
                this.III1.var_java_io_DataInputStream_III = I_0O.IO1O_II(this.III1).java_io_DataInputStream_III();
                this.III1.var_java_lang_Thread_IIII = new Thread(I_0O.I_O0_II(this.III1));
                this.III1.var_java_lang_Thread_IIII.start();
                this.III1.var_java_lang_Thread_III = new Thread(new I_I1(this.III1));
                this.III1.var_java_lang_Thread_III.start();
                this.III1.IlOI = System.currentTimeMillis();
                I_0O.II(this.III1, new I_Il(-27));
                this.III1.I0OI = false;
                this.III1.var_I1_0_II.III0(this.III1.I0_o);
            }
            catch (Exception exception) {
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                if (I_0O.IIl || this.III1.var_I1_0_II == null) break block4;
                this.III1.close();
            }
        }
    }
}

