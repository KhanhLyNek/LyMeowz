package main;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import main.GameMidlet;

public abstract class IOIO extends Canvas implements Runnable {
   public static boolean I0O1;
   private static long I1I0;
   private static int I1Il;
   public static int l1Oo;

   public static void II(GameMidlet var0) {
      Display.getDisplay(var0).setCurrent(II.II);
   }

   public IOIO() {
      this.setFullScreenMode(true);
      int var1 = super.getWidth();
      int var2 = super.getHeight();
      IO1l.l_I0 = 1;
   }

   public final int II_0() {
      int var1;
      return (var1 = super.getWidth()) / IO1l.l_I0 + (var1 % IO1l.l_I0 == 0 ? 0 : 1);
   }

   public final int II_o() {
      int var1;
      return (var1 = super.getHeight()) / IO1l.l_I0 + (var1 % IO1l.l_I0 == 0 ? 0 : 1);
   }

   protected void pointerDragged(int var1, int var2) {
      var1 /= IO1l.l_I0;
      var2 /= IO1l.l_I0;
      this.II(var1, var2);
   }

   protected void pointerPressed(int var1, int var2) {
      var1 /= IO1l.l_I0;
      var2 /= IO1l.l_I0;
      this.III(var1, var2);
   }

   protected void pointerReleased(int var1, int var2) {
      var1 /= IO1l.l_I0;
      var2 /= IO1l.l_I0;
      this.IIII(var1, var2);
   }

   protected abstract void II(int var1, int var2);

   protected abstract void III(int var1, int var2);

   protected abstract void IIII(int var1, int var2);

   protected abstract void IIII();

   @Override
   public void run() {
      try {
         Thread.sleep(100L);
      } catch (Exception var8) {
      }

      I0O1 = true;

      while (I0O1) {
         if (I1Il == 0) {
            I1I0 = System.currentTimeMillis();
         } else if (System.currentTimeMillis() - I1I0 > 1000L) {
            l1Oo = I1Il;
            I1Il = 0;
            I1I0 = System.currentTimeMillis();
         }

         I1Il++;
         long var1 = System.currentTimeMillis();
         this.IIII();
         this.repaint();
         this.serviceRepaints();
         long var3 = System.currentTimeMillis() - var1;
         if (IIo1.Il_l) {
            try {
               if (var3 < IIo1.III().Il00) {
                  while (true) {
                     long var11 = System.currentTimeMillis();
                     Thread.sleep(IIo1.III().Il00 - var3);
                     if (System.currentTimeMillis() - var11 >= IIo1.III().Il00 - var3) {
                        break;
                     }
                  }
               } else {
                  Thread.sleep(1L);
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         } else {
            try {
               if (var3 < IlI.III().I1I_) {
                  while (true) {
                     long var5 = System.currentTimeMillis();
                     Thread.sleep(IlI.III().I1I_ - var3);
                     if (System.currentTimeMillis() - var5 >= IlI.III().I1I_ - var3) {
                        break;
                     }
                  }
               } else {
                  Thread.sleep(1L);
               }
            } catch (Exception var9) {
               var9.printStackTrace();
            }
         }
      }
   }
}
