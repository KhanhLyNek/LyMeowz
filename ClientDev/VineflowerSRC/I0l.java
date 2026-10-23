package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class I0l {
   private final byte[] II1I;
   private int IIIl;
   private int IIl;
   private int I1_;
   private boolean lIIl;
   private String II1o = I1o_("ᤲᤗ᧤᧕᧚", 6467);
   private long I0ll;

   public I0l(int var1) {
      this.II1I = new byte[var1];
   }

   public I0l(int var1, String var2) {
      this.II1I = new byte[var1];
      this.II1o = var2;
   }

   public synchronized void write(byte[] var1, int var2, int var3) throws IOException {
      while (var3 > 0) {
         if (this.I1_ == this.II1I.length && !this.lIIl) {
            long var4 = System.currentTimeMillis();

            while (this.I1_ == this.II1I.length && !this.lIIl) {
               try {
                  this.wait(200L);
               } catch (InterruptedException var8) {
                  throw new IOException(I1o_("ᤪᤌ᧵ᧅ\u19cd\u19acᦈᩬᩏᨿ\u1a1d", 6467));
               }

               long var6 = System.currentTimeMillis() - var4;
               if (var6 >= 1000L && System.currentTimeMillis() - this.I0ll >= 2000L) {
                  this.I0ll = System.currentTimeMillis();
                  System.out
                     .println(
                        I1o_("ᤘᤎ᧨᧔᧚ᦃᦦ", 6467)
                           + this.II1o
                           + I1o_("ᤞ\u1942᧢ᧁ᧑ᦶ\u19dd\u1a7eᩚᨵᩃ᪸\u1adf᪷\u1a9b᭳ᬓᬶᬞ\u1bf9ᮏ᮪ᮌᱵᰇᱪᰍᳩᲇᲥ\u1c8dᵫᴃ", 6467)
                           + var6
                           + I1o_(
                              "\u192eᤑᦡᦈ\u19ddᦻᦓᨼ\u1a5fᨵᨚ᪸\u1adc᪾\u1a9a᭺᭔᭲ᬚ\u1bf9ᯟᯡᮏᱥᰋ᰾ᰛ᳭\u1cc8ᳯ᳅ᴩᴃᴬᴆᷨ᷶ᶞᶳᶛṴḚḽḙỮẖẹẕἳ\u1f5cἶἅῶΉᾣῌ\u2065⁂\u2028 ₧\u20c1€₅ⅷℂℭ℁℘",
                              6467
                           )
                     );
               }
            }
         }

         if (this.lIIl) {
            throw new IOException(I1o_("ᤲᤗ᧤᧕᧚᧾ᦞᩰᩔᨩ\u1a1c\u1afc", 6467));
         }

         int var9 = Math.min(var3, this.II1I.length - this.I1_);
         var9 = Math.min(var9, this.II1I.length - this.IIl);
         System.arraycopy(var1, var2, this.II1I, this.IIl, var9);
         this.IIl = (this.IIl + var9) % this.II1I.length;
         this.I1_ += var9;
         var2 += var9;
         var3 -= var9;
         this.notifyAll();
      }
   }

   public synchronized int read(byte[] var1, int var2, int var3) throws IOException {
      if (var3 == 0) {
         return 0;
      }

      while (this.I1_ == 0) {
         if (this.lIIl) {
            return -1;
         }

         try {
            this.wait();
         } catch (InterruptedException var5) {
            throw new IOException(I1o_("ᤪᤌ᧵ᧅ\u19cd\u19acᦈᩬᩏᨿ\u1a1d", 6467));
         }
      }

      int var4 = Math.min(var3, this.I1_);
      var4 = Math.min(var4, this.II1I.length - this.IIIl);
      System.arraycopy(this.II1I, this.IIIl, var1, var2, var4);
      this.IIIl = (this.IIIl + var4) % this.II1I.length;
      this.I1_ -= var4;
      this.notifyAll();
      return var4;
   }

   public synchronized int available() {
      return this.I1_;
   }

   public synchronized void close() {
      this.lIIl = true;
      this.notifyAll();
   }

   public synchronized boolean I1() {
      return this.lIIl;
   }

   public InputStream II() {
      return new I0lI(this);
   }

   public OutputStream II() {
      return new I0ll(this);
   }
}
