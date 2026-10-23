package main;

import javax.microedition.midlet.MIDlet;
import nrolite.DataDownloader;

public class GameMidlet extends MIDlet {
   public static String III = III("⛡⚵⚦❯❆✿✝", 9901);
   public static int II_0 = 14445;
   public static String IIII;
   public static int II_o;
   public static final String IIIl = "LyMeowz";
   public static final String III1 = "1.0.2";
   public static final String III_ = "Phạm Hoàng Khánh Ly";
   private static II III;
   public static GameMidlet II;
   private static boolean II1_;
   public static boolean II1O;

   public GameMidlet() {
      II = this;
   }

   public static void II(String[] var0) {
      System.out.println(III("⛡⚵⚦❯❆✿✝➦➔⟪⟓⠬⠓⡠⡲⡞⣍⣔⠺⢎⤹⥌⤥⤟㝖⧚⧳⦐㓎⩙⩯⨾⫥㐍⪦⫊⭁⭇⮧⬈⯢⮄⮈⮊ⳠⱎⱗⱾⰱ⳥", 9901));
   }

   protected void destroyApp(boolean var1) {
   }

   protected void pauseApp() {
   }

   public void startApp() {
      if (!II1_) {
         III = new II();
         new Thread(III).start();
         I_0O.II().II(I1I1.II());
         I_0O.III().II(I1I1.II());
         I_0O.III().I0_o = false;
         if (DataDownloader.isDataReady()) {
            IOI.Ioo();
            II.II = new IOI();
         } else {
            II.II = new IOOl();
         }

         IOIO.II(II);
         II1_ = true;
      }
   }

   public void IIll() {
      IOIO.I0O1 = false;
      System.gc();
      this.notifyDestroyed();
   }
}
