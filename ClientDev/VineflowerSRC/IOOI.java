package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import nrolite.DataDownloader;

public class IOOI implements Runnable {
   public IOOI(Runnable var1) {
      this.III = var1;
   }

   @Override
   public void run() {
      File var1 = DataDownloader.II();
      var1.mkdirs();
      File var2 = new File(var1, I110("槂榰榙橣橭樵樑櫻櫏櫣檖止歚", 27062));
      boolean var3 = false;
      Throwable var4 = null;

      for (int var5 = 0; var5 < DataDownloader.Il_1.length; var5++) {
         DataDownloader.currentUrlIndex = var5;
         String var6 = DataDownloader.Il_1[var5];
         String var7 = DataDownloader.URL_NAMES[var5];
         DataDownloader.status = 1;
         DataDownloader.lIlo = I110("梦榴榚橴樒樺瓏櫻檎檣琽止欄歧歆", 27062);
         DataDownloader.downloadedBytes = 0L;
         DataDownloader.percent = 0;
         DataDownloader.speedKBps = 0L;
         HttpURLConnection var8 = null;
         InputStream var9 = null;
         FileOutputStream var10 = null;

         try {
            System.out.println(I110("槭榑榕橧橓樕樟櫸櫀檡檃歪歎欬欚毚殆殁殅汭汅污气気泫沝沨沚浳洙洬洂涬涕", 27062) + var7);
            var8 = DataDownloader.III(var6);
            long var11 = var8.getContentLength();
            String var13 = var8.getHeaderField(I110("槵榺榚橧橗樿樄檢櫢檨檂歬歞次", 27062));
            if (var13 != null) {
               try {
                  var11 = Long.parseLong(var13.trim());
               } catch (Exception var49) {
               }
            }

            DataDownloader.totalBytes = var11 > 0L ? var11 : 23862993L;
            DataDownloader.status = 2;
            DataDownloader.lIlo = I110("梦榴榚橴樒樥瓓櫦檎檩球欫歆欠疯毲殈毫毊", 27062);
            var9 = var8.getInputStream();
            var10 = new FileOutputStream(var2);
            byte[] var14 = new byte[16384];
            long var16 = System.currentTimeMillis();
            long var18 = 0L;

            int var15;
            while ((var15 = var9.read(var14)) != -1) {
               var10.write(var14, 0, var15);
               DataDownloader.downloadedBytes += var15;
               if (DataDownloader.totalBytes > 0L) {
                  DataDownloader.percent = (int)(DataDownloader.downloadedBytes * 100L / DataDownloader.totalBytes);
                  if (DataDownloader.percent > 100) {
                     DataDownloader.percent = 100;
                  }
               }

               long var20 = System.currentTimeMillis();
               if (var20 - var16 >= 1000L) {
                  long var22 = DataDownloader.downloadedBytes - var18;
                  DataDownloader.speedKBps = var22 * 1000L / (var20 - var16) / 1024L;
                  var18 = DataDownloader.downloadedBytes;
                  var16 = var20;
               }
            }

            var10.flush();
            var10.close();
            var10 = null;
            var9.close();
            var9 = null;
            var8.disconnect();
            var8 = null;
            if (var2.exists() && var2.length() > 1000000L) {
               if (I110("榆槥槅樤橐樲樒櫮櫏櫺櫜欲歌欭歛毥毃毳殇汢気氥汑氚沧沌沿泂洬洈浯洒涧涃淥涖湷湗渴渊溿滉滸滚潩潋潾潑澶濁濼濗灣灂灲瀹灎炭炈点烊焭焌煦", 27062).length() == 64
                  && !I110("榆槥槅樤橐樲樒櫮櫏櫺櫜欲歌欭歛毥毃毳殇汢気氥汑氚沧沌沿泂洬洈浯洒涧涃淥涖湷湗渴渊溿滉滸滚潩潋潾潑澶濁濼濗灣灂灲瀹灎炭炈点烊焭焌煦", 27062).equalsIgnoreCase(DataDownloader.III(var2))) {
                  throw new IOException(I110("槥榴榝樳機樰橐櫤櫇檨檁欫歞欻欉殧殎殖殬求氏汳汕汉沷沝沨沎洺", 27062) + var7);
               }

               var3 = true;
               System.out.println(I110("槭榑榕橧橓樕樟櫸櫀檡檃歪歎欬欚毚殆殑殅汪氂氵氈氞泰法泼沘浵浗洿浗淢淀淴", 27062) + var7 + I110("榖槽", 27062) + var2.length() + I110("榖榷榍橧橗樢橙", 27062));
               break;
            }

            throw new IOException(I110("槢眒榄樳橆瓲標檯櫘琌櫌歠歂殽欆毠殆殭甇汳氂氭犧江泪牖泼", 27062) + var7);
         } catch (Throwable var52) {
            var4 = var52;
            System.out.println(I110("槭榑榕橧橓樕樟櫸櫀檡檃歪歎欬欚毚殆", 27062) + var7 + I110("榖榡榜橲橆橱樒櫮櫇櫷櫌", 27062) + var52.getMessage());
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Exception var48) {
               }
            }

            if (var9 != null) {
               try {
                  var9.close();
               } catch (Exception var47) {
               }
            }

            if (var8 != null) {
               try {
                  var8.disconnect();
               } catch (Exception var46) {
               }
            }

            try {
               var2.delete();
            } catch (Exception var45) {
            }

            if (var5 < DataDownloader.Il_1.length - 1) {
               DataDownloader.lIlo = var7 + I110("榖榲睃橣樒樢璁檯櫍琜櫀欫歞疸歈檖畿殫殃氣汁氩氕氆牝泓泼沈浻浗洿浗", 27062) + DataDownloader.URL_NAMES[var5 + 1] + I110("榘槻槚", 27062);

               try {
                  Thread.sleep(1000L);
               } catch (InterruptedException var44) {
               }
            }
         }
      }

      if (!var3) {
         try {
            var2.delete();
         } catch (Throwable var39) {
         }

         DataDownloader.status = -1;
         DataDownloader.errorMessage = var4 != null
            ? (var4.getMessage() != null ? var4.getMessage() : var4.getClass().getSimpleName())
            : I110("槢睶榝樳橆樹瓕櫻檎檯瑍止權欤疥毮殆殫殃汶狱氯汁", 27062);
         DataDownloader.lIlo = I110("槺眂榝権樒", 27062) + DataDownloader.errorMessage;
      } else {
         try {
            DataDownloader.status = 3;
            DataDownloader.lIlo = I110("梦榴榚橴樒樶標琬櫇櫭檂毢歄歩欌畨殆殩殍狄汗汯汎汑", 27062);

            try {
               ZipFile var53 = new ZipFile(var2);
               DataDownloader.unzipTotal = var53.size();
               var53.close();
            } catch (Throwable var43) {
               DataDownloader.unzipTotal = 0;
            }

            File var54 = new File(var1, I110("槒榴榀橲", 27062));
            var54.mkdirs();
            String var55 = var54.getCanonicalPath() + File.separator;
            File var56 = new File(var54, I110("榘榱榛橤橜樽樟櫮櫊檤檂歬", 27062));
            new File(var54, I110("榘榣榑橡", 27062)).delete();
            FileOutputStream var57 = new FileOutputStream(var56);
            var57.write(49);
            var57.close();
            ZipInputStream var58 = new ZipInputStream(new FileInputStream(var2));

            ZipEntry var59;
            while ((var59 = var58.getNextEntry()) != null) {
               String var60 = var59.getName().replace('\\', '/');

               while (var60.startsWith(I110("榙", 27062))) {
                  var60 = var60.substring(1);
               }

               if (var60.startsWith(I110("槒榴榀橲樝", 27062))) {
                  var60 = var60.substring(5);
               }

               File var12 = new File(var54, var60);
               if (var60.length() != 0 && (var12.getCanonicalPath() + File.separator).startsWith(var55)) {
                  if (var59.isDirectory()) {
                     var12.mkdirs();
                  } else {
                     File var62 = var12.getParentFile();
                     if (var62 != null) {
                        var62.mkdirs();
                     }

                     FileOutputStream var63 = new FileOutputStream(var12);

                     try {
                        byte[] var64 = new byte[8192];

                        int var65;
                        while ((var65 = var58.read(var64)) != -1) {
                           var63.write(var64, 0, var65);
                        }

                        var63.flush();
                     } finally {
                        var63.close();
                     }
                  }

                  DataDownloader.unzipCount++;
                  if (DataDownloader.unzipTotal > 0) {
                     DataDownloader.unzipPercent = DataDownloader.unzipCount * 100 / DataDownloader.unzipTotal;
                     if (DataDownloader.unzipPercent > 100) {
                        DataDownloader.unzipPercent = 100;
                     }
                  }

                  var58.closeEntry();
               } else {
                  var58.closeEntry();
               }
            }

            var58.close();
            if (!DataDownloader.IIII(var1)) {
               throw new IOException(I110("槱榺榝樳橖樰樄櫮檎檹檄止歏欼歈毳毃段毄汮汃氱氓汑泼泔沲泛浲浖洹洔涶淇涱涀渽湉湡湀滑滄溢溏潯潑", 27062));
            }

            FileOutputStream var61 = new FileOutputStream(new File(var54, I110("榘榣榑橡", 27062)));
            var61.write(String.valueOf(3).getBytes());
            var61.close();
            var56.delete();

            try {
               var2.delete();
            } catch (Throwable var42) {
            }

            DataDownloader.status = 4;
            DataDownloader.lIlo = I110("槾榺椔橽樒樥瓕櫻檏櫭毼歪歄欮歈毬毎甚殍氣洳犘氎氘沰沓泲", 27062);
            if (this.III != null) {
               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var41) {
               }

               this.III.run();
            }
         } catch (Throwable var51) {
            try {
               var2.delete();
            } catch (Throwable var40) {
            }

            DataDownloader.status = -1;
            DataDownloader.errorMessage = var51.getMessage() != null ? var51.getMessage() : var51.getClass().getSimpleName();
            DataDownloader.lIlo = I110("槺眂榝樳橕樸瓓櫦檎檣樅步欐歩", 27062) + DataDownloader.errorMessage;
            var51.printStackTrace();
         }
      }
   }
}
