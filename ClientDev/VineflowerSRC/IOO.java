package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import nrolite.Res;

public final class IOO {
   public static IOO.IIII[] II;
   public static IOO.III[] II;
   public static IOO.II[] II = new IOO.II[0];
   public static Hashtable III0;
   public static IOO.IIIl[] II;
   public static IOO.III1[] II;
   private static boolean IlO0;
   private static final String lIl_ = "42:60000,43:55000,44:50000,45:45000,46:40000,47:35000,51:34000,52:38000,53:40000,54:42000,55:44000,56:55000,57:50000,58:45000,59:40000,60:35000,70:360000,71:350000,72:340000,73:330000,74:320000,75:310000,76:300000,77:360000,78:350000,79:340000,80:330000,81:320000,82:310000,83:300000,84:360000,85:390000,86:420000,87:450000,88:480000,89:510000,90:540000,91:300000,92:310000,93:320000,94:330000,95:340000,96:350000,97:360000,98:120000,99:120000,100:120000,101:120000,102:120000,103:120000,104:120000,121:75000,122:80000,123:85000,124:90000,125:95000,126:100000,127:105000,135:210000,136:205000,137:200000,138:195000,139:190000,140:185000,141:180000,144:34000,145:36000,146:38000,147:40000,148:42000,153:35000,154:40000,155:45000,156:170000,157:160000,158:150000,159:140000,160:130000,161:120000,162:110000,163:100000,164:90000,165:80000,166:170000,167:160000,168:150000,169:140000,170:130000,171:120000,172:110000,173:100000,174:90000,175:80000,176:170000,177:160000,178:150000,179:140000,180:130000,181:120000,182:110000,183:100000,184:90000,185:80000";
   private static final String[] Il_l = new String[]{
      I11_("漍漚濦濁澪澊", 28489),
      I11_("漂漉濪濃澯澋灨灍", 28489),
      I11_("漍漍濪濉澫", 28489),
      I11_("漄漉濴濃澫澏灬", 28489),
      I11_("漎漉濫濏澦澏", 28489),
      I11_("漈漆濳濉澨澍灠", 28489),
      I11_("漝漀潦濏濥澠熳熃瀯瀇", 28489),
      I11_("漝漚煌澆澱澌熳熃瀯瀇", 28489),
      I11_("漝澉濮澆澱煅灬", 28489),
      I11_("漂漉濮濉澮澁灭", 28489),
      I11_("漘漝焤澆澦煃灶", 28489),
      I11_("漁澛濦澆澮澌滊", 28489),
      I11_("漋漇濪澆澭澍瀣灑瀨瀎瀗", 28489),
      I11_("漄漉濬濇澫澏灬灑瀠瀐瀏烱", 28489),
      I11_("湙燓澧濒澷焍灭灅", 28489),
      I11_("漂漀濮潌澫", 28489),
      I11_("漚澜濤潒澩澅", 28489),
      I11_("漅漁潭濈濥澌灬烂瀯", 28489),
      I11_("漍熣濤濎濥澧火灗瀸溣瀑", 28489),
      I11_("漁漝潺濒濥澷烢灍", 28489),
      I11_("漝漀潳濏濥澩灪烈瀯", 28489),
      I11_("漝漚潴濏", 28489)
   };
   private static final int[] I_l = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 14, 11, 12, 19, 18, 17, 20, 21, 22, 23};

   private IOO() {
   }

   public static synchronized void I___() {
      if (!IlO0) {
         IlO0 = true;

         try {
            DataInputStream var0 = II(I11_("漤漇濥濕濫澆灪灌", 28489));
            if (var0 != null) {
               short var1 = var0.readShort();
               II = new IOO.IIII[var1];

               for (int var2 = 0; var2 < var1; var2++) {
                  IOO.IIII var3 = new IOO.IIII();
                  var3.I1l = var0.readShort();
                  var3.IoI_ = var0.readByte();
                  var3.II1o = var0.readUTF();
                  var3.llIl = var0.readInt();
                  var3.l0o = var0.readByte();
                  var3.l0oI = var0.readByte();
                  II[var2] = var3;
               }
            }

            var0 = II(I11_("漠漜濢濋澶濊灡灋瀯", 28489));
            if (var0 != null) {
               short var18 = var0.readShort();
               int var23 = 0;
               IOO.III[] var31 = new IOO.III[var18];

               for (int var4 = 0; var4 < var18; var4++) {
                  IOO.III var5 = new IOO.III();
                  var5.I1l = var0.readShort();
                  var5.IoI_ = var0.readByte();
                  var5.lOlI = var0.readByte();
                  var5.I101 = var0.readLong();
                  var5.II1o = var0.readUTF();
                  var5.lOo0 = var0.readShort();
                  var5.Io11 = var0.readByte() != 0;
                  var5.lOl_ = var0.readByte();
                  var5.lOo_ = var0.readInt();
                  var31[var4] = var5;
                  if (var5.I1l > var23) {
                     var23 = var5.I1l;
                  }
               }

               II = new IOO.III[var23 + 1];

               for (int var39 = 0; var39 < var18; var39++) {
                  II[var31[var39].I1l] = var31[var39];
               }
            }

            var0 = II(I11_("漺漃濮濊澩澗瀭灀瀨瀎", 28489));
            III0 = new Hashtable();
            if (var0 != null) {
               short var19 = var0.readShort();

               for (int var24 = 0; var24 < var19; var24++) {
                  IOO.IIIO var32 = new IOO.IIIO();
                  var32.I1l = var0.readShort();
                  var32.lO0I = var0.readByte();
                  var32.l0oo = var0.readByte();
                  var32.l1__ = var0.readByte();
                  var32.lo = var0.readShort();
                  var32.loI = var0.readShort();
                  var32.loII = var0.readByte();
                  var32.loIl = var0.readShort() & '\uffff';
                  var32.I101 = var0.readLong();
                  var32.l1_0 = var0.readShort();
                  var32.l1_o = var0.readShort();
                  var32.loI1 = var0.readShort();
                  III0.put(new Integer(var32.I1l), var32);
               }

               String[] var25 = I11_(
                     "潽潚澽澐濵濔瀳瀒灭灔灌炤炈烩烋焪焉煴煃熢熏燡燃爢爁牠牃犺犘狶狟猿猙獸獗玪玑珲珙琶琑瑰瑯瑎璱璈瓬瓀甪甍畧畆疥疘痦痃瘫瘃登癞皽皜盧盟眻眒睴睞瞵瞔石矎破砓砅硪硍碬碋磪磕礭礃祬祁禦禃秢私稼稚穻穗窸窟竺站笸笋筳筓箾箖篷篑簰簯簒籨籋粡粏糩糈紧紆絹絁綫綈緥緅縿縞繽繀纾纓绳络缷编罵罔羯羔翱翚翌耫耍聬聋肶肎胨胍脥脃腤腃膢膁臼臘舿舗艿艞芺芙苸苗茪茒荶荙莱莕菰華菎萭萐葬葉蒣蒋蓤蓆蔥蔄蕣蕞薦薄藵藝蘿蘜虻虚蚹蚄蛰蛓蜿蜗蝲蝒螱螐螏蟲蟊蠪蠁衩衉袨袇裦装褸褄襥襋覣覙觾觝証訛試詞誰誝諵諐謴謓譲譑讬讨讇诧诏谯谊豩豈貧貚賭賄贩贁赢赀趿趞跽跀踳踛蹳蹛躵躖軵軔輳輎轹轒轅辭辌迬迋逪选遴遏邥邏郧郃鄢鄁酠酟醢醕釸金鈹鈟鉸鉗銶銕鋨鋛錷錛鍳鍦鍎鎭鎌鏫鏖鐡鐎鑭鑂钧钄铣铂锡锜長镙閷閘闾闚阹阘陷陊隽障雹雖霹霐霏靮靍鞰鞃韣韃頭順顦顅颤颃飾飈餠餕饻饙馼馛駺駙騤騞驷驟骷骓髲髑鬰鬯鬒魤魎鮡鮉鯨鯈鰧鰆鱥鱘鲪鲁鳫鳃鴽鴞鵽鵜鶻鶆鷰鷜鸽鸕鹶鹔麳麒黱黌黆鼫鼇齯齏龪龉鿨鿇ꀺꀌꁢꁉꂡꂄꃠꃟꄾꄝꅠꅒꆽꆓꇻꇑꈶꈕꉴꉓꊮꊘꋸꋥꋏꌯꌌꍫꍊꎩꎔꏮꏏꐯꐅꑡꑂ꒡ꒀ꓿꓂ꔼꔜꕻꕐꖸꖚꗷꗖ\ua635ꘔ꙯ꙓꚱꚑꚅꛯꛏꜬ꜋ꝪꝉꞴꞆ\ua7e6Ꟈ\ua82eꠂꡠꡁꢠꢟꣾꣁꤽꤛꥹ꥓ꦹꦕ꧶꧕ꨴꨓꩮ꩐ꪰꪫꪄꫬ\uaaceꬫꬊꭩꭈꮻꮇꯧꯅ갩갅걤걀겿겞곡곝괹괘굳교궷궖귵귔긯긓깳깓깅꺦꺈껬껋꼪꼕꽩꽅꾢꾏꿭꿃뀢뀁끠끃낿낟냹냑넳넜노녗놶놉뇵뇑눴눛뉱뉯뉎늭늌닫닖댨댊덠덌뎤뎄돦돂됡됀둣둟뒾뒙등듘딸딘땷땖떵떈뗲뗑똷똚똍뙮뙈뚬뚋뛪뛕뜩뜄띡띏랦랃럢럁렠렟롢로뢿뢓룰룘뤱뤒륶륕릴릏맳맒먹먥먏멤멌몫몊뫩뫔묦묂뭥뭎뮢뮊믤므밿밞뱡뱝벿벛볳볙봿봖뵵뵔붳붎뷰뷔뷋븤븎빨빋뺪뺉뻴뻆뼢뼀뽮뽀뾤뾁뿠뿟쀢쀜쁸쁝산삚샰샗섶섕셨셒솶솖쇺쇫쇎숭숌쉫쉖슨슌싯싌쌡쌆썣썂쎡쎜쏾쏛쐾쐖쑸쑟쒹쒘쓷쓊씴씑앷았억얐얏엮엍옰옊왯왌욢욃웣웅윤윃읾은장잙쟴쟜젻젛졺졙좸좋죷죐줳줙쥳쥗즰즯즎짭짐쨪쨏쩡쩂쪦쪃쫥쫄쬣쬂쭽쭁쮺쮗쯷쯝찿찚챹챘첷첊쳴쳒촳촘쵰쵓쵏춮춍췬췗츫츏칩칍캧캇커컃켢켁콼콞쾸쾟쿶쿚퀻퀙큸큗킶킉탵탕턱턛텱텯텎톭톌퇫퇖툨툎퉣퉌튬튄틣틂팡팜퍾퍘편펖폳폚퐹퐘푷푊풴풒퓵퓘픰픗픏핮핍햬햗헫헏혯혍홧홃횤횃훢훁휼휞흸흕ힶ힚\ud7ffퟙ\ud838\ud817\ud876\ud849\ud8b5\ud895\ud8fb\ud8db\ud931\ud92b\ud90e\ud96d\ud94c\ud9ab\ud996\ud9e8\ud9cf\uda27\uda0c\uda64\uda47\udaa3\uda82\udae1\udac0\udb23\udb1f\udb7a\udb5d\udbb1\udb9b\udbfb\udbd8\udc37\udc16\udc75\udc48\udcb2\udc95\udcf3\udcda\udcce\udd2f\udd0d\udd6c\udd4b\uddaa\udd95\udde9\uddc0\ude25\ude0f\ude65\ude43\udea2\ude81\udee0\udedf\udf22\udf1c\udf7b\udf5f\udfb0\udf90\udff8\udfd7\ue036\ue015\ue068\ue052\ue0b5\ue094\ue0fa\ue0e7\ue0ce\ue12d\ue10c\ue16b\ue156\ue1a8\ue18f\ue1e1\ue1cc\ue224\ue203\ue263\ue242\ue2a1\ue280\ue2e3\ue2df\ue33a\ue31b\ue371\ue35b\ue3bf\ue398\ue3f7\ue3d6\ue435\ue408\ue472\ue455\ue4b9\ue49a\ue48e\ue4eb\ue4cd\ue52c\ue50b\ue56a\ue555\ue5a9\ue580\ue5ef\ue5cf\ue625\ue607\ue662\ue641\ue6a0\ue69f\ue6e2\ue6dc\ue734\ue71b\ue770\ue758\ue7bb\ue797\ue7f6\ue7d5\ue834\ue80f\ue873\ue859\ue8b1\ue8a5\ue88f\ue8ef\ue8cc\ue92b\ue90a\ue969\ue954\ue9a6\ue98e\ue9e7\ue9ce\uea22\uea03\uea61\uea40\ueabf\uea9e\ueae1\ueadd\ueb33\ueb19\ueb73\ueb59\uebb7\ueb96\uebf5\uebd4\uec33\uec0e\uec70\uec58\uec4b\ueca4\uec84\uecec\ueccb\ued2a\ued09\ued74\ued46\uedae\ued80\uedee\uedcb\uee22\uee01\uee60\uee5f",
                     28489
                  )
                  .split(I11_("潥", 28489));

               for (int var33 = 0; var33 < var25.length; var33++) {
                  int var40 = var25[var33].indexOf(58);
                  IOO.IIIO var44 = (IOO.IIIO)III0.get(new Integer(Integer.parseInt(var25[var33].substring(0, var40))));
                  if (var44 != null) {
                     var44.loIl = Integer.parseInt(var25[var33].substring(var40 + 1));
                  }
               }
            }

            var0 = II(I11_("漠漆濳濔澬澊灰灋瀢灎瀝烷烓", 28489));
            if (var0 != null) {
               short var20 = var0.readShort();
               II = new IOO.II[var20];

               for (int var26 = 0; var26 < var20; var26++) {
                  IOO.II var34 = new IOO.II();
                  var34.I1l = var0.readShort();
                  var34.II1o = var0.readUTF();
                  var34.l00_ = var0.readShort();
                  var34.l00O = var0.readShort();
                  var34.l000 = var0.readShort();
                  var34.l00o = var0.readShort();
                  var34.lOo0 = var0.readShort();
                  var34.lOlI = var0.readByte();
                  II[var26] = var34;
               }
            }

            var0 = II(I11_("漧漘濤濕濫澆灪灌", 28489));
            if (var0 != null) {
               short var21 = var0.readShort();
               II = new IOO.IIIl[var21];

               for (int var27 = 0; var27 < var21; var27++) {
                  IOO.IIIl var35 = new IOO.IIIl();
                  var35.I1l = var0.readShort();
                  var35.II1o = var0.readUTF();
                  var35.IO_l = var0.readShort();
                  II[var27] = var35;
               }
            }

            var0 = II(I11_("漺漀濨濖澶濊灡灋瀯", 28489));
            if (var0 != null) {
               short var22 = var0.readShort();
               II = new IOO.III1[var22];

               for (int var28 = 0; var28 < var22; var28++) {
                  IOO.III1 var36 = new IOO.III1();
                  var36.I1l = var0.readShort();
                  var36.l0ol = var0.readShort();
                  var36.lIlO = var0.readUTF();
                  var36.IoI_ = var0.readByte();
                  byte var41 = var0.readByte();
                  var36.II = new IOO.III0[var41];

                  for (int var45 = 0; var45 < var41; var45++) {
                     IOO.III0 var6 = new IOO.III0();
                     var6.II1o = var0.readUTF();
                     short var7 = var0.readShort();
                     var6.II = new IOO.III_[var7];

                     for (int var8 = 0; var8 < var7; var8++) {
                        IOO.III_ var9 = new IOO.III_();
                        var9.l0o1 = var0.readShort();
                        var9.l0o_ = var0.readInt();
                        var9.l0oO = var0.readByte();
                        var9.Io1_ = var0.readByte() != 0;
                        var9.Io1O = var0.readByte() != 0;
                        var9.l0o0 = var0.readShort();
                        byte var10 = var0.readByte();
                        var9.II10 = new int[var10][2];

                        for (int var11 = 0; var11 < var10; var11++) {
                           var9.II10[var11][0] = var0.readUnsignedByte();
                           var9.II10[var11][1] = var0.readShort();
                        }

                        var6.II[var8] = var9;
                     }

                     var36.II[var45] = var6;
                  }

                  II[var28] = var36;
               }

               for (int var29 = 0; var29 < var22; var29++) {
                  if (I11_("漚漩濉濲澄澻灎灭瀞瀲瀰烐烺炃炳煛煷焐焨燂燧熕熽牕", 28489).equals(II[var29].lIlO) && II[var29].II.length > 0) {
                     IOO.III0 var37 = II[var29].II[0];
                     boolean var42 = false;

                     for (int var46 = 0; var46 < var37.II.length; var46++) {
                        if (var37.II[var46].l0o1 == 988) {
                           var42 = true;
                        }
                     }

                     if (!var42) {
                        IOO.III_ var47 = new IOO.III_();
                        var47.l0o1 = 988;
                        var47.l0o_ = 1000000000;
                        var47.l0oO = 0;
                        var47.Io1_ = true;
                        var47.Io1O = true;
                        var47.l0o0 = 0;
                        var47.II10 = new int[][]{{73, 0}};
                        IOO.III_[] var49 = new IOO.III_[var37.II.length + 1];
                        System.arraycopy(var37.II, 0, var49, 0, var37.II.length);
                        var49[var37.II.length] = var47;
                        var37.II = var49;
                     }
                  }
               }

               for (int var30 = 0; var30 < var22; var30++) {
                  if (I11_("漚漩濉濲澄", 28489).equals(II[var30].lIlO) && II[var30].II.length > 0) {
                     IOO.III0 var38 = II[var30].II[II[var30].II.length - 1];
                     IOO.III_ var43 = new IOO.III_();
                     var43.l0o1 = 1703;
                     var43.l0o_ = 50;
                     var43.l0oO = 1;
                     var43.Io1_ = true;
                     var43.Io1O = true;
                     var43.l0o0 = 0;
                     var43.II10 = new int[0][2];
                     IOO.III_[] var48 = new IOO.III_[var38.II.length + 1];
                     System.arraycopy(var38.II, 0, var48, 0, var38.II.length);
                     var48[var38.II.length] = var43;
                     var38.II = var48;
                  }
               }
            }
         } catch (Exception var12) {
            System.out.println(I11_("漒漄濮濒澠澹瀣灎瀮瀉灟烰烜炬烛煾煌煸焛燿燐熡燉爲", 28489) + var12);
         }
      }
   }

   private static DataInputStream II(String var0) {
      byte[] var1 = Res.read(var0);
      return var1 == null ? null : new DataInputStream(new ByteArrayInputStream(var1));
   }

   public static IOO.II II(int var0) {
      I___();

      for (int var1 = 0; var1 < II.length; var1++) {
         if (II[var1].I1l == var0) {
            return II[var1];
         }
      }

      return null;
   }

   public static Vector III(int var0) {
      I___();
      Vector var1 = new Vector();

      for (int var2 = 0; var2 < II.length; var2++) {
         if (II[var2].I1l != 0 && (II[var2].lOlI == var0 || II[var2].lOlI == 3)) {
            var1.addElement(II[var2]);
         }
      }

      return var1;
   }

   public static IOO.IIII II(int var0) {
      I___();
      if (II == null) {
         return null;
      }

      for (int var1 = 0; var1 < II.length; var1++) {
         if (II[var1].I1l == var0) {
            return II[var1];
         }
      }

      return null;
   }

   public static IOO.III II(int var0) {
      I___();
      return II != null && var0 >= 0 && var0 < II.length ? II[var0] : null;
   }

   public static IOO.IIIO II(int var0) {
      I___();
      return (IOO.IIIO)III0.get(new Integer(var0));
   }

   public static IOO.IIIl II(int var0) {
      I___();
      if (II == null) {
         return null;
      }

      for (int var1 = 0; var1 < II.length; var1++) {
         if (II[var1].I1l == var0) {
            return II[var1];
         }
      }

      return null;
   }

   public static Vector IIII(int var0) {
      I___();
      Vector var1 = new Vector();
      if (II != null) {
         for (int var2 = 0; var2 < II.length; var2++) {
            if (II[var2].l0ol == var0) {
               var1.addElement(II[var2]);
            }
         }
      }

      return var1;
   }

   private static String IIl1(String var0) {
      StringBuffer var1 = new StringBuffer();
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == ' ') {
            if (var2) {
               continue;
            }

            var2 = true;
         } else {
            var2 = false;
         }

         var1.append(var4);
      }

      return var1.toString().trim();
   }

   public static IOO.IIII II(String var0) {
      I___();
      String var1 = IIl1(var0.toLowerCase());
      IOO.IIII var2 = null;
      if (II != null) {
         for (int var3 = 0; var3 < II.length; var3++) {
            String var4 = IIl1(II[var3].II1o.toLowerCase());
            if (var4.length() > 2 && var1.indexOf(var4) >= 0 && (var2 == null || var4.length() > var2.II1o.length())) {
               var2 = II[var3];
            }
         }
      }

      return var2;
   }

   public static IOO.III II(String var0) {
      I___();
      String var1 = var0.toLowerCase();
      IOO.III var2 = null;
      if (II != null) {
         for (int var3 = 0; var3 < II.length; var3++) {
            if (II[var3] != null && II[var3].II1o.length() >= 3) {
               String var4 = II[var3].II1o.toLowerCase();
               if (var1.indexOf(var4) >= 0 && (var2 == null || var4.length() > var2.II1o.length())) {
                  var2 = II[var3];
               }
            }
         }
      }

      return var2;
   }

   public static int II(IOO.III var0) {
      if (var0 != null && var0.IoI_ == 7) {
         for (int var1 = 0; var1 < Il_l.length; var1++) {
            if (var0.II1o.indexOf(Il_l[var1]) >= 0) {
               return I_l[var1];
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static int III(IOO.III var0) {
      if (var0 == null) {
         return 0;
      }

      int var1 = var0.II1o.lastIndexOf(I11_("漥漞", 28489));
      if (var1 < 0) {
         return 0;
      }

      int var2 = 0;

      for (int var3 = var1 + 2; var3 < var0.II1o.length(); var3++) {
         char var4 = var0.II1o.charAt(var3);
         if (var4 >= '0' && var4 <= '9') {
            var2 = var2 * 10 + (var4 - '0');
         }
      }

      return var2;
   }

   public static IOO.IIIO II(int var0, int var1) {
      I___();
      Enumeration var2 = III0.elements();

      while (var2.hasMoreElements()) {
         IOO.IIIO var3 = (IOO.IIIO)var2.nextElement();
         if (var3.lO0I == var0 && var3.l1__ == var1) {
            return var3;
         }
      }

      return null;
   }

   public static int IIO1(int var0) {
      int var1 = 0;
      I___();
      Enumeration var2 = III0.elements();

      while (var2.hasMoreElements()) {
         IOO.IIIO var3 = (IOO.IIIO)var2.nextElement();
         if (var3.lO0I == var0 && var3.l1__ > var1) {
            var1 = var3.l1__;
         }
      }

      return var1;
   }

   public static IOO.III II(int var0, int var1) {
      I___();
      if (II == null) {
         return null;
      }

      for (int var2 = 0; var2 < II.length; var2++) {
         IOO.III var3 = II[var2];
         if (var3 != null && var3.IoI_ == 7 && II(var3) == var0 && III(var3) == var1) {
            return var3;
         }
      }

      return null;
   }

   public static final class II {
      public int I1l;
      public int l00_;
      public int l00O;
      public int l000;
      public int l00o;
      public int lOo0;
      public int lOlI;
      public String II1o;
   }

   public static final class III {
      public int I1l;
      public int IoI_;
      public int lOlI;
      public int lOo0;
      public int lOl_;
      public int lOo_;
      public long I101;
      public String II1o;
      public boolean Io11;
   }

   public static final class III0 {
      public String II1o;
      public IOO.III_[] II;
   }

   public static final class III1 {
      public int I1l;
      public int l0ol;
      public int IoI_;
      public String lIlO;
      public IOO.III0[] II;
   }

   public static final class IIII {
      public int I1l;
      public int IoI_;
      public int llIl;
      public int l0o;
      public int l0oI;
      public String II1o;
   }

   public static final class IIIO {
      public int I1l;
      public int lO0I;
      public int l0oo;
      public int l1__;
      public int lo;
      public int loI;
      public int loII;
      public int loIl;
      public int l1_0;
      public int l1_o;
      public int loI1;
      public long I101;
   }

   public static final class III_ {
      public int l0o1;
      public int l0o_;
      public int l0oO;
      public int l0o0;
      public boolean Io1_;
      public boolean Io1O;
      public int[][] II10;
   }

   public static final class IIIl {
      public int I1l;
      public int IO_l;
      public String II1o;
   }
}
