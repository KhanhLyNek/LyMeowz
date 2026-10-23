package main;

import java.util.Vector;

final class I_O0 implements Runnable {
   private final Vector III1;
   private I_0O III;
   private long I1Il;

   public I_O0(I_0O var1) {
      this.III = var1;
      this.III1 = new Vector();
   }

   public void IIl_(I_Il var1) {
      this.III1.addElement(var1);
   }

   @Override
   public void run() {
      while (this.III.I0O) {
         try {
            if (this.III.I1l) {
               int var1 = this.III1.size();
               if (var1 >= 50 && System.currentTimeMillis() - this.I1Il >= 2000L) {
                  this.I1Il = System.currentTimeMillis();
                  System.out
                     .println(
                        Il0_("䰋䰃䳧䳙䲩䲶䴪䵊䴩䴉䷮䶅䶦䶂乭丛习丷丟仳仛任亞佶佑佷休俺保俳來偸偞偯倉僸僅僫傎兠儈儣儉凫冄", 19536)
                           + var1
                           + Il0_("䱰䰈䳡䳄䳬䳆䴪䵅䴽䴈䷨䷂䷤䶄乷么习丼丑亽仈亳亟伹作伶优俲侔侱供倱偓倧倏僠傃傿傘公兇八兆凢凅冺凂剦剉剞刪剝勰勚劽", 19536)
                     );
               }

               while (this.III1.size() > 0) {
                  I_Il var2 = (I_Il)this.III1.elementAt(0);
                  this.III1.removeElementAt(0);
                  I_0O.II(this.III, var2);
               }
            }

            try {
               Thread.sleep(10L);
            } catch (Exception var3) {
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }
   }

   static Vector II(I_O0 var0) {
      return var0.III1;
   }
}
