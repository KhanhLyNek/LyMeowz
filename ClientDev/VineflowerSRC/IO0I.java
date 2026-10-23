package main;

import java.util.Random;

final class IO0I {
   static final boolean Io_O = true;
   private static final long I1o0 = 3000L;
   private static final long I1oo = 5000L;
   private static final double II = 1.3;
   private static final double III = 0.7;
   private static final int loO0 = 3;
   private static final long I_ = 120000L;
   private static volatile long I_I;
   private final Random IIll = new Random();
   private final long I_II = this.IIll.nextLong() | 1L;
   private final long I_Il = this.IIll.nextLong();
   private long I_I1;
   private long I_I_;
   private long I_IO;
   private boolean Io_0;
   private long I_I0;
   private static final long I_Io = -7046029254386353131L;
   private static final long I_l;
   private long I_lI;
   private long I_ll;
   private long I_l1;
   private long I_l_;
   private int loOo;
   private int lo0;
   private boolean Io_o;
   private long I_lO;

   static long IIIl() {
      return System.currentTimeMillis() + I_I;
   }

   static int IIol() {
      return (int)(IIIl() / 86400000L);
   }

   static boolean IIII(long var0) {
      long var2 = System.currentTimeMillis();
      I_I = 0L;
      if (var0 > var2 + 120000L) {
         I_I = var0 - var2;
         return true;
      } else {
         return false;
      }
   }

   private long III(long var1) {
      return (var1 + this.I_Il) * -7046029254386353131L ^ this.I_II;
   }

   private long IIII(long var1) {
      return (var1 ^ this.I_II) * I_l - this.I_Il;
   }

   synchronized void II(IOol var1) {
      this.I_I1 = this.III(var1.Il11);
      this.I_I_ = this.III(var1.lOoO);
      this.I_IO = this.III(var1._lO);
      this.Io_0 = true;
      this.I_I0 = 0L;
   }

   private int II(IOol var1, long var2) {
      if (this.Io_0) {
         long var4 = this.IIII(this.I_I1);
         long var6 = this.IIII(this.I_I_);
         long var8 = this.IIII(this.I_IO);
         if (var1.Il11 == var4 && var1.lOoO == var6 && var1._lO == var8) {
            this.I_I0 = 0L;
            return 0;
         }

         if (this.I_I0 == 0L) {
            this.I_I0 = var2;
            return 0;
         }

         if (var2 - this.I_I0 < 3000L) {
            return 0;
         }

         System.out
            .println(
               I1_O("駓駋馯馑驡驾驢騀髮髫髗骾骔魾魛鬭魂鮷鯂鮼鮑鱽鰒鰳鰙鲯鳊鲢鲅鴫鵄鴮鴇鷦鷏鷥鶈鹶鹍鸯鸇鹟黽黕麳黛齪齑鼽鼇龬龕龢龒ꁼꁖꁰ", 39304)
                  + var1.Il11
                  + I1_O("馥香", 39304)
                  + var4
                  + I1_O("馤馇馨馂驫驀驢", 39304)
                  + var1.lOoO
                  + I1_O("馥香", 39304)
                  + var6
                  + I1_O("馤馇馨馂驫驀驢騙髡髱髖髽", 39304)
                  + var1._lO
                  + I1_O("馥香", 39304)
                  + var8
            );
         var1.Il11 = var4;
         var1.lOoO = (int)var6;
         var1._lO = (int)var8;
         this.I_I0 = 0L;
         return 1;
      } else {
         return 0;
      }
   }

   boolean Il_l() {
      return this.Io_o;
   }

   private void II(IOoI var1, long var2, long var4) {
      if (this.I_ll == 0L) {
         this.I_lI = var2;
         this.I_ll = var4;
         this.I_l1 = var2;
         this.I_l_ = var4;
      } else {
         long var6 = (var4 - this.I_ll) / 1000000L;
         long var8 = var2 - this.I_lI;
         this.I_lI = var2;
         this.I_ll = var4;
         if (var8 - var6 > 60000L) {
            I_I -= var8 - var6;
            this.I_l1 = var2;
            this.I_l_ = var4;
         } else if (var6 - var8 > 60000L) {
            I_I += var6 - var8;
            this.I_l1 = var2;
            this.I_l_ = var4;
         } else {
            long var10 = (var4 - this.I_l_) / 1000000L;
            if (var10 >= 5000L) {
               long var12 = var2 - this.I_l1;
               this.I_l1 = var2;
               this.I_l_ = var4;
               double var14 = (double)var12 / var10;
               if (!(var14 > 1.3) && !(var14 < 0.7)) {
                  this.loOo = 0;
                  if (this.Io_o && ++this.lo0 >= 2) {
                     this.Io_o = false;
                     this.lo0 = 0;
                  }
               } else {
                  this.lo0 = 0;
                  if (++this.loOo >= 3) {
                     if (!this.Io_o) {
                        System.out.println(I1_O("駓駋馯馑驡驾驢騀髮髫髗骾骔魾魛鬭魂鮷鯘鮲鮜鱺鰒鰥鰑鳡鳉鳭鲘鵤鵉鵩鴏鷦鷋鶠鷈鸣鹖鸨鹀鸓黻麝", 39304) + var14);
                     }

                     this.Io_o = true;
                  }
               }

               if (this.Io_o && var2 - this.I_lO > 10000L) {
                  this.I_lO = var2;
                  var1.IIol(I1_O("駘駏餧馑騤驋騫蒦髮骿髊鯞骒魼鬚鬭薩鯴鮖鮲鮕鱾鱗鱿鱐鳇鱍鲴鳌鵿莅鴽鵈鷤鵒鶫鶃鸣鹁肤鹀鸋龝黓麻黛齮臨鼻齛龶鿒龵龞ꁷꀑꀤ뻎ꃣꂍꂨ븀ꅤꅎꅨꄄꇮꇊꇤꃲ벽ꉏꉠꈴꈖꋴꊜꊹꈖꍷꍐꍷꌂꏽꈄ봎ꎜꑶꐞ", 39304));
               }
            }
         }
      }
   }

   boolean II(IOoI var1, IOol var2, boolean var3) {
      long var4 = System.currentTimeMillis();
      long var6 = System.nanoTime();
      synchronized (this) {
         if (!var3) {
            this.II(var1, var4, var6);
         }

         if (!var3 && this.II(var2, var4) == 1) {
            var1.IIol(I1_O("駘駏餧馑騤驋騫蒦髮骿髊骵骝魢鬚驈薭鯾鮖鮣鬔鱽鱕鱾鰞鳨艣鲮鳌鵩莏鴽鵈鷳鷎鱵茹鹭鹅鹭鹀齮鹽麝麷麓鿮齐齸鼇鿾腐龷鿝", 39304));
            var1.l1_();
         }
      }

      return !this.Io_o;
   }

   static {
      long var0 = -7046029254386353131L;

      for (int var2 = 0; var2 < 6; var2++) {
         var0 *= 2L - -7046029254386353131L * var0;
      }

      I_l = var0;
   }
}
