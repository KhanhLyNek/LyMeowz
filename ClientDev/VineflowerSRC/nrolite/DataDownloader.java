package nrolite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;

public final class DataDownloader {
   public static final String[] Il_1 = new String[]{
      I11O("戻戆拥拀押拔挢挃挬挃揽揀掲掄搫摇搬搏撮擎操撱撊攭攈敫敊斵旓斳斃昻晝映昞暽曌暢暄杩杅朾杆柺柂枪枀桥桐栧栒梯棻棑梪梒楷楕椸検榸槒榴榀橲樟権橁檠櫊檬檘歪欄欳欁毷", 25171),
      I11O("戻戆拥拀押拔挢挃振挘揠揞探揈摰摗搦搐擢擏擑撪撘敲敏整攞旷旘斱料晱昝昱昞曽暀暪暂杻杅朦朆柩柃柹枌桠栞桳树棭棥梎梐梟椶楓楪椁榮槒榍榓橛橣樹権櫭櫠檅檍歮歠欿款毢毇殨殊汆汉汧氅氇泮泒沮沏洧浝洷洀淸淙涻涒湶渗渳渀滠滋溥溙潧演漼", 25171),
      I11O("戻戆拥拀押拔挢挃振挘揠揞探揈摢摋搬搅擭擅撑撽撒敱攔支攚斧旒斮斅晻晁昦晌更曀暹暃杠杄末服枮柎枢柘栵桓栯栛械棒棝棰梕椨楃楠検槏槑榝榥橻橫樳樾櫇櫏檨檦歽歼欬欉毪毈殀殏氥汁氮氎氙泷泏沱泆浮", 25171)
   };
   public static final int loI_ = 3;
   public static final String lIl0 = "0017bcbaa709fd3be6ca5d1e91c9617e161eefde1d41cb660d84ac2f004b0441";
   public static final String[] URL_NAMES = new String[]{I11O("戔戛拥拸抺抌", 25171), I11O("戔戝拾拗抣抋挭捨挹挃揿揍", 25171), I11O("戔戝拾拗抣抋挭捨挹挃揿揍揧揎摁竕摣搒擩摒擑撹擔", 25171)};
   public static final int loIO = 0;
   public static final int STATUS_CONNECTING = 1;
   public static final int STATUS_DOWNLOADING = 2;
   public static final int STATUS_UNZIPPING = 3;
   public static final int STATUS_DONE = 4;
   public static final int STATUS_ERROR = -1;
   public static volatile int status = 0;
   public static volatile String lIlo = "";
   public static volatile int currentUrlIndex = 0;
   public static volatile long downloadedBytes = 0L;
   public static volatile long totalBytes = 0L;
   public static volatile int percent = 0;
   public static volatile long speedKBps = 0L;
   public static volatile int unzipCount = 0;
   public static volatile int unzipTotal = 0;
   public static volatile int unzipPercent = 0;
   public static volatile String errorMessage = "";
   private static Thread IIIl = null;
   private static File II = null;

   private DataDownloader() {
   }

   public static synchronized File II() {
      if (II != null) {
         return II;
      }

      try {
         File var0 = new File(I11O("扽", 25171));
         File var1 = new File(var0, I11O("扽戅拣拙抻抋捒捘挮挙揽揷", 25171) + System.currentTimeMillis());
         if (var1.createNewFile()) {
            var1.delete();
            II = var0;
            return II;
         }
      } catch (Throwable var8) {
      }

      String[] var9 = new String[]{
         IIl_(System.getProperty(I11O("戵戛拽拕抬抁捣捂捥挎揠揚揩掋摠摉搬搐擸擃擞撬撙", 25171))),
         IIl_(System.getProperty(I11O("戵戛拽拕抬抁捣捂捥挎揠揚揩掖摭摋搷損擲", 25171))),
         I11O("扼戁拥拟抽抏捪捉捤挏揤揝掫掇摱摁搧摍撱撏擵擬撰教攖攖攖旹旓斳文", 25171),
         I11O("扼戁拵拓抮抜捩挃持捘揄揭揪措摪摅搧搇擳", 25171),
         I11O("扼戁拥拟抽抏捪捉捤挏揤揝掫掇摱摁搧摍撱", 25171),
         I11O("扼戁拵拓抮抜捩", 25171),
         System.getProperty(I11O("戹戓拧拑拡抇换挂挿指揹揌掮掔", 25171)),
         System.getProperty(I11O("戦戁拴拂拡抆换捁挮", 25171)),
         I11O("扼或拰拄抮拁捡捃挨挋揥掇掳掋摵", 25171)
      };

      for (int var10 = 0; var10 < var9.length; var10++) {
         String var2 = var9[var10];
         if (var2 != null && var2.trim().length() != 0) {
            try {
               File var3 = new File(var2, I11O("戽戀拾拯披抏捹捍", 25171));
               File var4 = new File(var3, I11O("户戓拥拑拠技捿捃挧挃揽揍揨掔摠摗摬搚撰撏擠撷撓數敞攢", 25171));
               if (var4.exists() && var4.length() > 0L) {
                  II = var3;
                  return II;
               }
            } catch (Throwable var7) {
            }
         }
      }

      for (int var11 = 0; var11 < var9.length; var11++) {
         String var12 = var9[var11];
         if (var12 != null && var12.trim().length() != 0) {
            try {
               File var13 = new File(var12);
               if (!var13.exists()) {
                  var13.mkdirs();
               }

               File var14 = new File(var13, I11O("戽戀拾拯披抏捹捍", 25171));
               if (!var14.exists()) {
                  var14.mkdirs();
               }

               File var5 = new File(var14, I11O("扽戅拣拙抻抋捒捘挮挙揽揷", 25171) + System.currentTimeMillis());
               if (var5.createNewFile()) {
                  var5.delete();
                  II = var14;
                  return II;
               }
            } catch (Throwable var6) {
            }
         }
      }

      II = new File(I11O("扽", 25171));
      return II;
   }

   private static String IIl_(String var0) {
      if (var0 == null) {
         return null;
      }

      var0 = var0.trim();
      if (var0.startsWith(I11O("戵戛拽拕拵拁挢挃", 25171))) {
         var0 = var0.substring(7);
      } else if (var0.startsWith(I11O("戵戛拽拕拵拁挢", 25171))) {
         var0 = var0.substring(6);
      } else if (var0.startsWith(I11O("戵戛拽拕拵", 25171))) {
         var0 = var0.substring(5);
      }

      return var0;
   }

   private static boolean II(File var0) {
      File var1 = new File(var0, I11O("户戓拥拑拠技捿捃挧挃揽揍揨掋摤摔搰摌擣擉擑", 25171));
      File var2 = new File(var0, I11O("户戓拥拑拠技捿捃挧挃揽揍揨掔摠摗摬搚撰撏擠撷撓數敞攢", 25171));
      return var1.isFile() && var1.length() > 0L && var2.isFile() && var2.length() > 0L;
   }

   private static boolean III(File var0) {
      try {
         if (!II(var0)) {
            return false;
         }

         if (new File(var0, I11O("户戓拥拑拠拀捩捃挼挄揥揇掦掂摬摊搤", 25171)).exists()) {
            return false;
         }

         File var1 = new File(var0, I11O("户戓拥拑拠拀捻捉挹", 25171));
         if (!var1.isFile()) {
            return true;
         }

         FileInputStream var2 = new FileInputStream(var1);

         try {
            byte[] var3 = new byte[16];
            int var4 = var2.read(var3);
            return var4 > 0 && new String(var3, 0, var4).trim().equals(String.valueOf(3));
         } finally {
            var2.close();
         }
      } catch (Throwable var10) {
         return false;
      }
   }

   public static boolean isDataReady() {
      try {
         if (Res.class.getResourceAsStream(I11O("扼戜拣拟抣抇捹捉捤指揨揘掴揈摧摍搭", 25171)) != null
            && Res.class.getResourceAsStream(I11O("扼戜拣拟抣抇捹捉捤挘揬換揨掞搴搋搜搋擯擄據撦", 25171)) != null) {
            return true;
         }
      } catch (Throwable var3) {
      }

      try {
         if (III(II())) {
            return true;
         }
      } catch (Throwable var2) {
      }

      try {
         if (III(new File(I11O("扽", 25171)))) {
            return true;
         }
      } catch (Throwable var1) {
      }

      return false;
   }

   private static String II(File var0) throws Exception {
      MessageDigest var1 = MessageDigest.getInstance(I11O("戀戺拐抝拽招挻", 25171));
      FileInputStream var2 = new FileInputStream(var0);

      try {
         byte[] var3 = new byte[16384];

         int var4;
         while ((var4 = var2.read(var3)) != -1) {
            var1.update(var3, 0, var4);
         }
      } finally {
         var2.close();
      }

      byte[] var9 = var1.digest();
      StringBuffer var10 = new StringBuffer();

      for (int var5 = 0; var5 < var9.length; var5++) {
         int var6 = var9[var5] & 255;
         if (var6 < 16) {
            var10.append('0');
         }

         var10.append(Integer.toHexString(var6));
      }

      return var10.toString();
   }

   public static synchronized void startDownload(Runnable var0) {
      if (IIIl == null || !IIIl.isAlive()) {
         status = 1;
         lIlo = I11O("捃戓拿拗拯抍捥捙緢挄掩揊紌揆摱窇搪摌撯撎", 25171);
         currentUrlIndex = 0;
         downloadedBytes = 0L;
         totalBytes = 0L;
         percent = 0;
         speedKBps = 0L;
         unzipCount = 0;
         unzipTotal = 0;
         unzipPercent = 0;
         errorMessage = "";
         IIIl = new Thread(new IOOI(var0));
         IIIl.start();
      }
   }

   private static HttpURLConnection II(String var0) throws Exception {
      int var1 = 0;
      String var2 = null;

      while (var1 < 12) {
         URL var3 = new URL(var0);
         HttpURLConnection var4 = (HttpURLConnection)var3.openConnection();
         var4.setRequestProperty(I11O("戆戁拴拂拢抯捪捉挥挞", 25171), I11O("戞戝拫拙抣抂捬挃捾捄掹授揯掱摬摊搧損擶擓撟撐撩攼攊敪敗斨斌时斢晽晝晤晅暫暏暶曛朸朂杪朧柚柨枊枌桰框桭桐梮梯", 25171));
         var4.setConnectTimeout(15000);
         var4.setReadTimeout(35000);
         var4.setInstanceFollowRedirects(false);
         if (var2 != null) {
            var4.setRequestProperty(I11O("成戝拾招抦抋", 25171), var2);
         }

         int var5 = var4.getResponseCode();
         String var6 = var4.getHeaderField(I11O("戀戗拥抝抌抁换捇挢挏", 25171));
         if (var6 != null) {
            var2 = var6.split(I11O("扨", 25171))[0];
         }

         if (var5 != 301 && var5 != 302 && var5 != 303 && var5 != 307 && var5 != 308) {
            if (var5 == 200) {
               return var4;
            }

            throw new IOException(I11O("戛戦担拠拯抋捿捞挤挘掳授", 25171) + var5);
         }

         String var7 = var4.getHeaderField(I11O("戟戝拲拑抻抇换捂", 25171));
         if (var7 == null) {
            throw new IOException(I11O("戁戗拵拙抽抋据捘捫挞握揁探掓搥摌搦搃擥擅操擾撱敳敘攻攍旱旘斸", 25171));
         }

         if (!var7.startsWith(I11O("戻戆拥拀", 25171))) {
            var7 = new URL(var3, var7).toString();
         }

         if (!var7.startsWith(I11O("戻戆拥拀押拔挢挃", 25171))) {
            throw new IOException(I11O("成戚拤拉抪技挭捄挾挅揧描揧掍摭摋搭搅撡擁擑擾撉敳敚攴教新旜斾斚智晔晲昁書曎暧曍杄板朞朹柛枎", 25171));
         }

         var4.disconnect();
         var0 = var7;
         var1++;
      }

      throw new IOException(I11O("戂戇拰抐抡抆捤捉挾捊揥揉掩揆摦摌搶搛擤擎撟撶撈敳敕攽教旍日斚", 25171));
   }
}
