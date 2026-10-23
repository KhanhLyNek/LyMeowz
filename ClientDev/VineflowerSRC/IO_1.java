package main;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

final class IO_1 {
   static final int lO0l = 1800000;
   static final int lO01 = 60000;
   static final int lO0_ = 7001;
   static final int lO0O = 7002;
   static final int lO00 = 7003;
   private static final int lO0o = 1600000001;
   private static final int lOo = 457;
   private static final String[] Il11 = new String[]{
      I1lo("⊹⍹⏄⌡⌉⎭⏏⌸⏊⑫⑉\u2429␁⒥Ⓦ㨚⒋┡╃\u2456┰┚▼⒪⑪㬚♻☛♶☗⛽㠌⚦⛑☁❆㦏✘➬⟝㤑➀⠨⡋⢫⠋⣬⢃⢡⢀⥮⥷⤞⤱⦜⦻⧂⦶⦖⩰⨘", 8946),
      I1lo("⊿⍤㷡⌡⍎⏻⍌⎤⏊\u245d\u245a㫦␏⒥▴㨚⒁┡╮╗▽┓▼╚◥◙♔㢖☿♕⛼㡼⚻⛑❻❇➧✂➬⟇✧➇⡠⠇⠥⠄⣪⣋⣢㙄⥹⤳⤞⡌㞗⧵⧝⧹⦐㓘⩟⩵⨀⫲⪜", 8946),
      I1lo("⊵⍸⏑⍯⌍㴮⎌⎿⌓⑰␈\u242f⒒ⓨ⒈ⓣ⒎◬╎╗╾┞◽◕▲◙♬♟⚻☖⛼⚓⚦⚙⟼✏✭✅⟣➋➻➜⡩⠉", 8946)
   };
   static final String lIll = "1) Trại độc nhãn là nơi các ngươi không nên vào vì những tướng tá rất mạnh. Hahaha\b2) Trong trại độc nhãn, mỗi vị tướng đều giữ ngọc rồng từ 4 sao đến 6 sao, tùy lúc\n3) Nếu ngươi thích chết thì cứ việc vào. Nhưng ta chỉ cho vào mỗi ngày một lần thôi, để ngươi khỏi phải chết nhiều, hahaha.\b4) Các vị tướng trong trại rất mạnh nhé, các ngươi không đơn giản có thể đánh bại họ bằng cách bình thường như đánh quái được đâu\n5) Muốn vào, ngươi phải gia nhập bang hội được hơn 1 ngày. Không thì phải biết điều với lính canh.\b6) Mỗi lần vào, ngươi chỉ có 30 phút để đánh. Sau 30 phút mà ngươi vẫn không thắng, ta sẽ cho máy bay chở ngươi về nhà.";
   private final IO0 III1;
   private final IOo_ III1;
   private final Random III_ = new Random();
   boolean IolO;
   boolean Iol0;
   boolean Iolo;
   long I1O1;
   long I1O_;
   private final boolean[][] II = new boolean[70][];
   private final int[][] II1O = new int[70][];
   private final long[][] II = new long[70][];
   private final Vector[] II = new Vector[70];
   private int lOoI;
   private boolean Io1;
   private boolean Io1I;
   private int lOol;
   private boolean Io1l;
   private long I1OO;
   private static final long I1O0 = 72000000L;

   IO_1(IO0 var1, IOo_ var2) {
      this.III1 = var1;
      this.III1 = var2;
   }

   static boolean II_1(int var0) {
      return var0 >= 53 && var0 <= 62;
   }

   boolean Il1I() {
      return this.IolO;
   }

   private static long II(long var0) {
      Calendar var2 = Calendar.getInstance();
      var2.setTimeInMillis(var0);
      var2.set(11, 0);
      var2.set(12, 0);
      var2.set(13, 0);
      var2.set(14, 0);
      return var2.getTimeInMillis();
   }

   private boolean Il1l() {
      long var1 = this.III1.II.IO0;
      if (var1 == 0L) {
         return false;
      }

      long var3 = IO0I.IIIl();
      return var3 - var1 < 72000000L ? true : var1 >= II(var3);
   }

   private int II0l() {
      return (int)((System.currentTimeMillis() / 1000L - this.III1.II._lOo) / 86400L);
   }

   private static String III(long var0, int var2) {
      int var3 = (int)Math.max(0L, (var2 - (System.currentTimeMillis() - var0)) / 1000L);
      return var3 > 60 ? var3 / 60 + I1lo("⋒⍡⍘⎵⌚", 8946) : var3 + I1lo("⋒⍶⍙⎭⌗", 8946);
   }

   private void lI() {
      if (!this.IolO) {
         this.III1.II(new IO0o(65).II(0).II("").III(0));
      } else {
         int var1 = this.Iolo
            ? (int)((60000L - (System.currentTimeMillis() - this.I1O_)) / 1000L)
            : (int)((1800000L - (System.currentTimeMillis() - this.I1O1)) / 1000L);
         if (var1 < 0) {
            var1 = 0;
         }

         this.III1.II(new IO0o(65).II(0).II(I1lo("⊦⍣㶑⌦⍎⊜㵵⎨⏊⑧⑀⒤␈Ⓙ", 8946)).III(var1));
      }
   }

   void lII() {
      IOol var1 = this.III1.II;
      IO00 var2 = this.III1.II;
      boolean var3 = this.Io1 || this.Io1I;
      if (this.IolO) {
         var2.IIII(
            25,
            7001,
            I1lo("⊰⍰⍞⌨⍎⏥㵵⎢⏊⑪㫏␦⑆⓫Ⓝ╳╃╨─\u242e┿┓◻▛Ⓥ┘♶♟♶☁⛦㠒⚻⛑☁㧶✭❍⟢⟃✩➇⠂⡳⠮㚸⣭⢃⢥⢈⥡⥱⤞⤾⦎⧵⦚⦵㝙⩾⨖⨹⪔⪳", 8946)
               + III(this.I1O1, 1800000)
               + I1lo("⋜⌱⍾⌨⋞∬⏅⏫⎉⓺␈\u242a␓㩔Ⓤⓣ⒖╩╁╒╾┚◵◚◺▒♰⛃☸☒⚫", 8946),
            new String[]{I1lo("⊦⍹⍑⌢⍎⏪⏅⎪", 8946), I1lo("⊹⍹⏄⌡⌉", 8946), I1lo("⊺⊡㷫⌡⌉⎇⏈㵠⎄␃\u245c\u242f⒌ⓨ", 8946)}
         );
      } else if (!this.Io1 && this.Il1l()) {
         Calendar var6 = Calendar.getInstance();
         var6.setTimeInMillis(var1.IO0);
         String var5 = (var6.get(11) < 10 ? I1lo("⋂", 8946) : "") + var6.get(11) + I1lo("⋈", 8946) + (var6.get(12) < 10 ? I1lo("⋂", 8946) : "") + var6.get(12);
         var2.IIII(
            25,
            7002,
            I1lo("⊺⏥⍝⍯⌀⏬⏕⏫⎄⑮▘◦␏⒥▵␠Ⓜ╷◀═╾┩◮㬚△◙✈㣮☵♕⛚⛛☱⚟✰✞❮✁㤫⟅⟪➛㛛⡎⡦⡍⣨⡙⢡⣁", 8946)
               + var5
               + I1lo("⋛⌽⌐≞㶅⏣⏋⏫⎂⓻⑆␠⑆⓫⑄⒪Ⓜ╯㯩┟┶├◥▛▾┃♱☗☢☜㡕⛝⛲⚅❸⟅✣❍⟠㤌➤⟉⡦㛈⠧⡋⢎⣠⠱⣁⥴⧿⥗⥽⤈⧳⥖⧹⦛⩿㓫⩵⭥㐬⫝̸⫱⪞⭨⯎⬴⭌⯦⯋⮠⯈ⱪⳆⱥⰒⱣⳍⳡⲔⲖ㎡ⵍ\u2d72", 8946),
            new String[]{I1lo("⊽⍚", 8946), I1lo("⊺⊡㷫⌡⌉⎇⏈㵠⎄␃\u245c\u242f⒌ⓨ", 8946)}
         );
      } else if (!var3 && (var1._lOO == 0 || this.II0l() < 1)) {
         this.lOol = 1 + this.III_.nextInt(5);
         String var4 = var1._lOO == 0
            ? I1lo("⊤⏲⍞⌨⍎⏡⏍⎢⏊③⑀⒳␈ⓢ⒄⒡⒃╯╇┟┶㮤◵▗◺▍♰♒☹♕⛸⛆㡿⚅✰❃➮❍⟧⟃✾➇⡯⠇⥗⧕㙧⣀⣢⢗⧠⥰⤐", 8946)
            : I1lo("⊿㷊⍙⍯⌘⍭⏃⏫⎈⑨⑆␠⑆ⓦⓌ╳⒃┡\u2431㯘╾╌▼◕▽┙♡☛♶☖⛼✃⚳⛑☁㧈❮✙☼➋➩✈⡫⡏⡨", 8946);
         var2.IIII(
            25,
            7003,
            var4
               + I1lo("⋸⍟⍘⋿⌀⏪⎂⏥⏄\u2429␀\u2429␎⑩Ⓤⓣ⒓╴╁║┶╝◮㭨△◙♰㢖♶☒⛽㡾⚼⚖✹✏✠㧒⟹➋➤➎⦸⦆⠯⡅⣦⣊㙽⢕⤠⠎⥗㞜⤉⦷⦚⣈⡈⩶⨖⨧⨝⩹⫝̸⪶⫐⭻⭏⭭", 8946)
               + this.lOol
               + I1lo(
                  "⋒⍥⍘㶀⌇⎭⏚⌫⎄⑮␄⑧␒ⓤ⒄⒠⒍╨─║┶Ⓧ▼◐▲┍♶♐♶☁⛼㠖⚫⛑❾❈⛾⛌⟥➋➦㥒⡦⠇⠰⢅⣫⢏⣢⢊⥨㟐⥗⥽⤌⧳㜙⦰⧘⩼⩞⨴⨝⪳⫐⨰⪟⬯⭌⬬⬂⯬⮊⮡㔱ⱮⰆⰩⲄⳮⲂⲦⰌⳟ\u2d7dⵕⴳⵛⷷ㍾ⶬⷙ⸜\u2e78⺴⹓\u2efc⻙》⻏⸟㇆⼢⼌⾪⺸ㄋ⿇な\u2efcつ　リピス⸘ゐㄽㅒㆻ\u3103ㆹ㇊ㆶ㇚㈵㉟㈻㊆㋿㋗㋯㊚㍥㏀㍫㉻ⵢ㏆㎠㏆㑱㑖㒢㐁㓩㒀㓋㒿㓓",
                  8946
               ),
            new String[]{I1lo("⏢⏫⍄⍯⌂⍾⏘⏁⏂", 8946) + this.lOol + I1lo("⋒⍥⍘㶀⌇⎭⏚⌫⎄⑮␁", 8946), I1lo("⊹⍹⏄⌡⌉", 8946), I1lo("⊺⊡㷫⌡⌉⎇⏈㵠⎄␃\u245c\u242f⒌ⓨ", 8946)}
         );
      } else {
         var2.IIII(
            25,
            7001,
            I1lo(
               "⊺⏥⍝⍯⌀⏬⏕⏫⎈⑨⑆␠⑆⓭㩽⒪Ⓜ╢㯇╞╾┓◻␋⑻▐☸♔☾⟅⛵⚓⚤☑❿✏✺✟㤭⟂⟪➅㚯⡉⡦⠋⡤⣌⣬⣁⥎⥸⢎⣼⤕⦻⧙⤪⧘⩺⩃㒄⨚⪳⫄⨱⪟⬅⭅⬥⮘⯥⯍⯶⯢ⴗ㋥ⱥⰒⱣⳍⳭⳀⲋ⵿ⴝⴷⴓⷯⷀⴲ\u2d99⸶⹛⸳⿃⼳⻘⻰⺁\u2fe4⽃⽬⼈⽹⾉⿻⿊〲々〪〄ㄲ\u2e7cォヿゝ\u31e4ㅒㄼㅚㇻ㇙ㆹ㆑㈵㌥㈺㉒㋲㉉㊡㊉㌣",
               8946
            ),
            new String[]{I1lo("⊤⏱⍟⍅⍆⏠⏅㴎⎄\u2429\u2458\u242f⒋⒬", 8946), I1lo("⊹⍹⏄⌡⌉", 8946), I1lo("⊺⊡㷫⌡⌉⎇⏈㵠⎄␃\u245c\u242f⒌ⓨ", 8946)}
         );
      }
   }

   boolean III_(int var1, int var2) {
      if (var1 == 7001) {
         if (var2 == 0) {
            this.lII_();
         } else if (var2 == 2) {
            this.III1
               .II
               .III1(
                  25,
                  I1lo(
                     "⋃⌸⌐⌛⌜㴬⏅⏫⋻㫐\u244b⑧␈⓭⑇⒭Ⓜ╭◀┟┰ⓜ◵▛▹┘♻☗☸☒✤✒⚻⛑❻❇➺✃⟫➋➤✃⡦⠇⠰⢅⣫⢃⢴⠍⤠⥱⥖㞲⤒⧼⦚⦭⡈㓌⩘⨲⩔⫧⩓⫱⪂㖪⭚⭭⬁㔪⯄⮡⯆ⰧⱮⰤⰌⳢⳊⲠ⳨ⳍⴷⴝⴈⴉⷵ\u2dd7\u2dbf\u2dd7\u2e62⹇ヵ⸚⺲⾠〉⺌⼮⽃⼤⾈\u2fe4⾅\u2fe8⾊⻑がつ〕⹉めゴㅯ⸥ㅳㅛㅻに⽘㇍ㇷ㆑㉼ⳛ㉳㈜㋶ⱽ㊬㋎㍿ⷿ㌥㌍㎩㏜\u2d2c㏆㐱㐄㐰㐃㓮㒀㖮⩡㒓㔼㔍㕺㔊㗹㗘㗺㗕㙠㛊㘫㙑㛼㙕㚭㛧㜿㜂㝪㜧⤷㟒㟦㞋㡣㦓㧣㠈㢠㣫㣖㠰㢟㥳㤚㤺㤐✨㧂㧵㦀㩻㫞㩱㨓⑦㪎㪻㪅◌㭉㭩㬞㭧㯉㯫㯄㱍㱊㷱㰎㰘㲾㳉㲽㳛㵹㵑⎑㵗㷵㷝㶻㷓㹤㻑㸿㹏㻣⁺㺥㻋㽤㽎㾨㼞㾦㿈ℝ㾗䀢䁍廧䀱䁞䃩䃔䀯䂓䄵䄘䁆徵䆵䇚䆴䁂䎰䉙䉯䈅䋥屣䊢䋊䍹䍀巤䌏䎥䏇䎫嵝䑵䐀䑑䐶䐔婝䓎䓶䓙䕰䕖䔾䔔䗼䗒䗼䗹䘤䘆䙮䘮䙭䛈䛪䚟姃䜇䜲䛕奟䟍䞥䟁䡴䡭䡑䠳䠛䢻䣎䢫噙䥾䤖䤧埑䧧䦒䦼坑䩡䩆䩭䨂䫣䩃䫥䫈䭤䯇䬦䭄䯭䯅䩱䩁䮖䰾䱖䰴䲏䳴䳞䳸䷦䲷䵛䵴䴔䷻匒䶾䷏乭仞乬丟仢偪仨俶俧佋伬佃俠儀侩俿侖仐倜倹介僷僟僷傕凴兗儻兒凳兜冡円刭剘刣叚䱔勆加勆卫卌勳卂劐十发厶叝呭呎咻吐咸喦啦䨖啷唓呃喓嗥喥嗻嗄嘬噦嘿䢸囦嚇嚰嘅坫圏坢圏埧嘯嘟垴埜填塒䛺堑墷壑墼墕夳奜夹䟝姿妎妯妍婥婍婩娀䑞嫏嫥寵媳䗁嬢孀嬗娿寓导寊尺屗尿岗峯岛峴岸嵺巅崾崈嶮巙嶤崇帪幙帠䃄廯庅度床䆽录彠幎弗䅜忉忻後绂恑恷怚恸惚悻惒慲慑愡愆憣憤懽懃戩扥粐戏报拈籤抌挡捖揟挱捑掼揕掽扉方摞摶搖擼空擲撒旣攏敽敝斬旛斢攓晼昇杗碦暤枲昣暏杨朱朞朎朝柮枚柪柈样框栽梎棧梒梼栐椯楀椪棜株槃槩榞璬橈橥樏櫫橖檯檇櫟歪歕痳欕毽殕毸殃汷氕氧狎沲泒沸沀洮浀涭洒涪淋涩涞渦湆測炼溢滏溧潯潟潴漜漭熻澹濖澿漖瀻",
                     8946
                  )
               );
         }

         return true;
      } else if (var1 == 7002) {
         if (var2 == 1) {
            this.III1
               .II
               .III1(
                  25,
                  I1lo(
                     "⋃⌸⌐⌛⌜㴬⏅⏫⋻㫐\u244b⑧␈⓭⑇⒭Ⓜ╭◀┟┰ⓜ◵▛▹┘♻☗☸☒✤✒⚻⛑❻❇➺✃⟫➋➤✃⡦⠇⠰⢅⣫⢃⢴⠍⤠⥱⥖㞲⤒⧼⦚⦭⡈㓌⩘⨲⩔⫧⩓⫱⪂㖪⭚⭭⬁㔪⯄⮡⯆ⰧⱮⰤⰌⳢⳊⲠ⳨ⳍⴷⴝⴈⴉⷵ\u2dd7\u2dbf\u2dd7\u2e62⹇ヵ⸚⺲⾠〉⺌⼮⽃⼤⾈\u2fe4⾅\u2fe8⾊⻑がつ〕⹉めゴㅯ⸥ㅳㅛㅻに⽘㇍ㇷ㆑㉼ⳛ㉳㈜㋶ⱽ㊬㋎㍿ⷿ㌥㌍㎩㏜\u2d2c㏆㐱㐄㐰㐃㓮㒀㖮⩡㒓㔼㔍㕺㔊㗹㗘㗺㗕㙠㛊㘫㙑㛼㙕㚭㛧㜿㜂㝪㜧⤷㟒㟦㞋㡣㦓㧣㠈㢠㣫㣖㠰㢟㥳㤚㤺㤐✨㧂㧵㦀㩻㫞㩱㨓⑦㪎㪻㪅◌㭉㭩㬞㭧㯉㯫㯄㱍㱊㷱㰎㰘㲾㳉㲽㳛㵹㵑⎑㵗㷵㷝㶻㷓㹤㻑㸿㹏㻣⁺㺥㻋㽤㽎㾨㼞㾦㿈ℝ㾗䀢䁍廧䀱䁞䃩䃔䀯䂓䄵䄘䁆徵䆵䇚䆴䁂䎰䉙䉯䈅䋥屣䊢䋊䍹䍀巤䌏䎥䏇䎫嵝䑵䐀䑑䐶䐔婝䓎䓶䓙䕰䕖䔾䔔䗼䗒䗼䗹䘤䘆䙮䘮䙭䛈䛪䚟姃䜇䜲䛕奟䟍䞥䟁䡴䡭䡑䠳䠛䢻䣎䢫噙䥾䤖䤧埑䧧䦒䦼坑䩡䩆䩭䨂䫣䩃䫥䫈䭤䯇䬦䭄䯭䯅䩱䩁䮖䰾䱖䰴䲏䳴䳞䳸䷦䲷䵛䵴䴔䷻匒䶾䷏乭仞乬丟仢偪仨俶俧佋伬佃俠儀侩俿侖仐倜倹介僷僟僷傕凴兗儻兒凳兜冡円刭剘刣叚䱔勆加勆卫卌勳卂劐十发厶叝呭呎咻吐咸喦啦䨖啷唓呃喓嗥喥嗻嗄嘬噦嘿䢸囦嚇嚰嘅坫圏坢圏埧嘯嘟垴埜填塒䛺堑墷壑墼墕夳奜夹䟝姿妎妯妍婥婍婩娀䑞嫏嫥寵媳䗁嬢孀嬗娿寓导寊尺屗尿岗峯岛峴岸嵺巅崾崈嶮巙嶤崇帪幙帠䃄廯庅度床䆽录彠幎弗䅜忉忻後绂恑恷怚恸惚悻惒慲慑愡愆憣憤懽懃戩扥粐戏报拈籤抌挡捖揟挱捑掼揕掽扉方摞摶搖擼空擲撒旣攏敽敝斬旛斢攓晼昇杗碦暤枲昣暏杨朱朞朎朝柮枚柪柈样框栽梎棧梒梼栐椯楀椪棜株槃槩榞璬橈橥樏櫫橖檯檇櫟歪歕痳欕毽殕毸殃汷氕氧狎沲泒沸沀洮浀涭洒涪淋涩涞渦湆測炼溢滏溧潯潟潴漜漭熻澹濖澿漖瀻",
                     8946
                  )
               );
         }

         return true;
      } else if (var1 == 7003) {
         if (var2 == 0) {
            this.lIII();
         } else if (var2 == 2) {
            this.III1
               .II
               .III1(
                  25,
                  I1lo(
                     "⋃⌸⌐⌛⌜㴬⏅⏫⋻㫐\u244b⑧␈⓭⑇⒭Ⓜ╭◀┟┰ⓜ◵▛▹┘♻☗☸☒✤✒⚻⛑❻❇➺✃⟫➋➤✃⡦⠇⠰⢅⣫⢃⢴⠍⤠⥱⥖㞲⤒⧼⦚⦭⡈㓌⩘⨲⩔⫧⩓⫱⪂㖪⭚⭭⬁㔪⯄⮡⯆ⰧⱮⰤⰌⳢⳊⲠ⳨ⳍⴷⴝⴈⴉⷵ\u2dd7\u2dbf\u2dd7\u2e62⹇ヵ⸚⺲⾠〉⺌⼮⽃⼤⾈\u2fe4⾅\u2fe8⾊⻑がつ〕⹉めゴㅯ⸥ㅳㅛㅻに⽘㇍ㇷ㆑㉼ⳛ㉳㈜㋶ⱽ㊬㋎㍿ⷿ㌥㌍㎩㏜\u2d2c㏆㐱㐄㐰㐃㓮㒀㖮⩡㒓㔼㔍㕺㔊㗹㗘㗺㗕㙠㛊㘫㙑㛼㙕㚭㛧㜿㜂㝪㜧⤷㟒㟦㞋㡣㦓㧣㠈㢠㣫㣖㠰㢟㥳㤚㤺㤐✨㧂㧵㦀㩻㫞㩱㨓⑦㪎㪻㪅◌㭉㭩㬞㭧㯉㯫㯄㱍㱊㷱㰎㰘㲾㳉㲽㳛㵹㵑⎑㵗㷵㷝㶻㷓㹤㻑㸿㹏㻣⁺㺥㻋㽤㽎㾨㼞㾦㿈ℝ㾗䀢䁍廧䀱䁞䃩䃔䀯䂓䄵䄘䁆徵䆵䇚䆴䁂䎰䉙䉯䈅䋥屣䊢䋊䍹䍀巤䌏䎥䏇䎫嵝䑵䐀䑑䐶䐔婝䓎䓶䓙䕰䕖䔾䔔䗼䗒䗼䗹䘤䘆䙮䘮䙭䛈䛪䚟姃䜇䜲䛕奟䟍䞥䟁䡴䡭䡑䠳䠛䢻䣎䢫噙䥾䤖䤧埑䧧䦒䦼坑䩡䩆䩭䨂䫣䩃䫥䫈䭤䯇䬦䭄䯭䯅䩱䩁䮖䰾䱖䰴䲏䳴䳞䳸䷦䲷䵛䵴䴔䷻匒䶾䷏乭仞乬丟仢偪仨俶俧佋伬佃俠儀侩俿侖仐倜倹介僷僟僷傕凴兗儻兒凳兜冡円刭剘刣叚䱔勆加勆卫卌勳卂劐十发厶叝呭呎咻吐咸喦啦䨖啷唓呃喓嗥喥嗻嗄嘬噦嘿䢸囦嚇嚰嘅坫圏坢圏埧嘯嘟垴埜填塒䛺堑墷壑墼墕夳奜夹䟝姿妎妯妍婥婍婩娀䑞嫏嫥寵媳䗁嬢孀嬗娿寓导寊尺屗尿岗峯岛峴岸嵺巅崾崈嶮巙嶤崇帪幙帠䃄廯庅度床䆽录彠幎弗䅜忉忻後绂恑恷怚恸惚悻惒慲慑愡愆憣憤懽懃戩扥粐戏报拈籤抌挡捖揟挱捑掼揕掽扉方摞摶搖擼空擲撒旣攏敽敝斬旛斢攓晼昇杗碦暤枲昣暏杨朱朞朎朝柮枚柪柈样框栽梎棧梒梼栐椯楀椪棜株槃槩榞璬橈橥樏櫫橖檯檇櫟歪歕痳欕毽殕毸殃汷氕氧狎沲泒沸沀洮浀涭洒涪淋涩涞渦湆測炼溢滏溧潯潟潴漜漭熻澹濖澿漖瀻",
                     8946
                  )
               );
         }

         return true;
      } else {
         return false;
      }
   }

   private void lIII() {
      if (this.II10(457) < this.lOol) {
         this.III1.IIIl.IIol(I1lo("⊼⍶⊀⋮⌇⎭⏇⎣⌞⑧\u244f⑧╷㩢⒄", 8946) + this.lOol + I1lo("⋒⍥⍘㶀⌇⎭⏚⌫⎄⑮␈╖㪥⒥▵\u2439⒖┡╌◌┪", 8946));
      } else {
         this.II1O(457, this.lOol);
         this.III1.IIIl.l1_l();
         this.Io1I = true;
         this.III1
            .IIIl
            .IIol(
               I1lo("⊾⏼⍞⌧⍎⏮⏍⎥⎂\u2429┹⒤⑆⓫Ⓦ㩮⒌┡", 8946)
                  + this.lOol
                  + I1lo("⋒⍥⍘㶀⌇⎭⏚⌫⎄⑮␄⑧␊㨲Ⓤ⒤Ⓜ╭㮝┟\u244f㮾▼◕▽⑉➹♞♶☙㠯⛝⛲⚇⟰❀❮✹⟾㤊➣⟉⤘㛾⠥⡅⣊⣋⠡⢏⤠⥲㟧⤩⥜⧶⥖⦷⦐⨻⨖⩤⩔⫿⬂㐲⪄⬯⭊⬸⬕⮫⯄⮡㕍ⱳ", 8946)
            );
         this.lII();
      }
   }

   private int II10(int var1) {
      int var2 = 0;
      IO0l[] var3 = this.III1.II.III;

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (!var3[var4].II1_() && var3[var4].I1l == var1) {
            var2 += var3[var4].lo0I;
         }
      }

      return var2;
   }

   private void II1O(int var1, int var2) {
      IO0l[] var3 = this.III1.II.III;

      for (int var4 = 0; var4 < var3.length && var2 > 0; var4++) {
         if (!var3[var4].II1_() && var3[var4].I1l == var1) {
            if (var3[var4].lo0I > var2) {
               var3[var4].lo0I -= var2;
               var2 = 0;
            } else {
               var2 -= var3[var4].lo0I;
               var3[var4] = new IO0l();
            }
         }
      }
   }

   void lIIl() {
      this.Io1 = !this.Io1;
      this.III1
         .IIIl
         .IIol(
            this.Io1
               ? I1lo("⊩⍖⍽⌒⍎⊝⍏⏫⎈㫆␈╖␏㩄ⓑⓣ⒉╨㯧║╾┟◽◕▽◙♰㣮☿♚⚥⚓⚾㡖❾✏✣㦺⟥➋➤➎⣨⡞⡦⠎⣬⣊⣢⢗⧠⥰⤞⤉⤎㜺⧓⧹⣨㓎⩕⩵⨺⫻⩑⪿", 8946)
               : I1lo("⊩⍖⍽⌒⍎⊝⍏⏫⎁②ⓜ\u242e⑆⓵Ⓦ㨦⒁┡\u2431╖㮟┈▼◐△㬾♶☗☠⚕⛻⚓⚆⚃㦱❆❮♽㥕⟈⟪➧⡠⣄⠨", 8946)
         );
   }

   void lII1() {
      this.III1.II.IO0 = 0L;
      this.III1.IIIl.IIol(I1lo("⊩⍖⍽⌒⍎⊝⍏⏫⎘⑬\u245b␢␒⒥Ⓢ╳㨁╵─\u242e┷╝◘◔▻▗♰☗☂☇㠵⛚⛲⚙⟤❂❮✃⟭⟒⟦⟉⡫⣔⡦⠑⣬㙠⣢⢗⧠⥰⤞⤱㟝⧲⦚⦷⦟⩶⩏", 8946));
   }

   private void Ill0(int var1) {
      I0Io.II var2 = I0Io.II(var1);
      I0Io.IIII var3 = null;
      if (var2 != null && var2.II != null) {
         for (int var4 = 0; var4 < var2.II.length; var4++) {
            if (var2.II[var4].I1l == 25) {
               var3 = var2.II[var4];
               break;
            }
         }
      }

      if (var3 == null) {
         this.Io1l = false;
      } else {
         if (!this.Io1l) {
            this.Io1l = true;
            int[] var5 = this.II();
            this.III1
               .II(
                  new IO0o(-5)
                     .IIII(1600000001)
                     .IIII(-1)
                     .II(0)
                     .II(false)
                     .II(0)
                     .II(0)
                     .II(0)
                     .III(var5[0])
                     .II(I1lo("⊱⏣⌐⌋⌁⏬⏂⎣⏊\u245d\u245a㫦␏", 8946))
                     .IIII(999999)
                     .IIII(999999)
                     .III(var5[1])
                     .III(var5[2])
                     .II(-1)
                     .II(-1)
                     .III(var3.I1 + 35)
                     .III(var3.I1I)
                     .III(0)
                     .III(0)
                     .II(0)
                     .II(0)
                     .II(0)
                     .III(-1)
                     .II(0)
                     .II(0)
                     .III(-1)
                     .II(-1)
                     .III(-1)
               );
            this.I1OO = System.currentTimeMillis() + 3000L;
         }
      }
   }

   private int[] II() {
      Vector var1 = I0I1.II();

      for (int var2 = 0; var2 < 40 && var1.size() > 0; var2++) {
         Integer var3 = (Integer)var1.elementAt(this.III_.nextInt(var1.size()));
         IOO.III var4 = IOO.II(var3);
         if (var4 != null && var4.IoI_ == 5 && (var4.lOlI == 0 || var4.lOlI == 3)) {
            return I0I1.III_(var3);
         }
      }

      return new int[]{0, 0, 0};
   }

   void Ioo1() {
      this.Io1l = false;
   }

   private void lII_() {
      IOol var1 = this.III1.II;
      boolean var2 = this.Io1 || this.Io1I;
      if (!var2 && var1._lOO == 0) {
         this.III1.IIIl.IIol(I1lo("⊹⍹⏄⌡⌉⎭⏘⎣㴩\u2429\u245c\u242f㪗ⓦ⒄⒫⒋㯆╎", 8946));
      } else if (!this.IolO && !this.Io1 && this.Il1l()) {
         this.III1.IIIl.IIol(I1lo("⊤⍤⍙⍯⌂⍿⏂⎬⏊⑪⑀㪚⑆▔㨛⒭Ⓜ╯╇◟┧╝◱◚△", 8946));
      } else if (var2 || this.II0l() >= 1) {
         if (var1.llIl <= 0) {
            this.III1.IIIl.IIol(I1lo("⊹⍹⏄⌡⌉⎭⏘⎣㴩\u2429\u245c\u242f㪗ⓦ⒄⒫⒋㯆╎", 8946));
         } else {
            if (!this.IolO) {
               this.IolO = true;
               this.Iol0 = false;
               this.Iolo = false;
               this.I1O1 = System.currentTimeMillis();
               var1.IO0 = IO0I.IIIl();

               for (int var3 = 53; var3 <= 62; var3++) {
                  I0Io.II var4 = I0Io.II(var3);
                  int var5 = var4 != null && var4.III != null ? var4.III.length : 0;
                  this.II[var3] = new boolean[var5];
                  this.II1O[var3] = new int[var5];
                  this.II[var3] = new long[var5];

                  for (int var6 = 0; var6 < var5; var6++) {
                     this.II1O[var3][var6] = var4.III[var6].l0o1;
                  }

                  this.II[var3] = new Vector();
               }

               this.lIIO();
               this.III1.I__O();
            }

            this.Io1I = false;
            var1.lO1 = 0;
            this.III1.III_(53, 60, 100);
         }
      }
   }

   private void lIIO() {
      IOol var1 = this.III1.II;
      IO_I var2 = this.III1.IIIl.II;
      var2.Iool();
      long var3 = var1.Illo() / 20L;
      long var5 = var1.Il1I() * 50L;
      IO_I.III var7 = var2.II(
         -4,
         I1lo("⊦⍃⍥⌁〈⏒⏹⎒⎵\u245d⑺␆\u2428Ⓜ", 8946),
         I1lo("⊦⍣⍅⌡⌉⎭⏙⌶⏊\u245d\u245a㫨␈ⓢ", 8946),
         new int[]{141, 142, 143, -1, -1, -1},
         II(var3, 1.0),
         III(var5, 1.0),
         59,
         198,
         456,
         new String[]{
            I1lo("⊎⌼⌁⌳⌶⏨⏁⏫⎇①␈␣⒟⓫Ⓝⓣ⒁◠╃╗╾┓╼◔◺░㢹☗❇⟅㡷⛐⛲⚅❱", 8946), I1lo("⊎⌼⌁⌳⌦⏬⎌⎣⎋\u2429⑀␦", 8946), I1lo("⊎⌼⌁⌳⌬⏸⏀⎤⎄\u2429┹⒥␓⒥ⓐ⒪␈╴─╛┷㮺◨▛▲㭆♬☗☴㢸⛺⚓⚱⚙⟪❁✩❍⟯⟃➥⟉⡼⡆", 8946)
         },
         II(false, false)
      );
      var7.lO_o = 755;
      var7.lOO = 1060;
      var7.lOOI = 20;
      IO_I.III var8 = var2.II(
         -6,
         I1lo("⊦⍃⍥⌁〈⏒⏹⎒⎵\u2451⑩␉\u242eⓚⓨ⒌", 8946),
         I1lo("⊦⍣⍅⌡⌉⎭⏙⌶⏊\u2451⑉\u2429␎⒥ⓨ╢", 8946),
         new int[]{135, 136, 137, -1, -1, -1},
         II(var3, 1.1),
         III(var5, 1.1),
         62,
         1210,
         384,
         new String[]{I1lo("⊎⌼⌁⌳⌶⏨⏁⏫⎉ⓨ\u244b⑧␈ⓢ└╢⒋┡╍㮞┰┕▼⒪㭥▗☸✦⚴☀", 8946), I1lo("⊎⌼⌁⌳⌦⏨⎌⎣⎏\u2429⑀␢", 8946)},
         II(true, false)
      );
      var8.Iol = true;
      var8.lOOI = 20;
      IO_I.III var9 = var2.II(
         -5,
         I1lo("⊦⍃⍥⌁〈⏒⏹⎒⎵\u245d①␂\u2436", 8946),
         I1lo("⊦⍣⍅⌡⌉⎭⏙⌶⏊\u245d⑀⒮␖", 8946),
         new int[]{129, 130, 131, -1, -1, -1},
         II(var3, 2.3),
         III(var5, 1.15),
         55,
         884,
         312,
         new String[]{I1lo("⊎⌼⌁⌳⌠㴲⏙⏫⎈㫄⑆⑧␋⓬⒄⒮⒗㯐╎┟┲▗◲▛▮▐㢧♇♶☁㠳⛝⚵⛑❼㦈✻❍⟸⟙✠➇", 8946), I1lo("⊎⌼⌁⌳⌾⏥㴏⎢⏊⑫▘㪜␅⒥ⓕⒶ⒃┡╘◞┽╝◿◓㭥▍☸♔㢱☔⚴⛇⚳⛑☁⟌", 8946)},
         II(false, true)
      );
      var9.lO_o = 640;
      var9.lOO = 980;
      var9.lOOI = 20;
      IO_I.III var10 = var2.II(
         -7,
         I1lo("⊼⍘⍾⌅⌯⏒⏭⎄⎵\u245d②␊", 8946),
         I1lo("⊼⍸⍞⌥⌏⎭⍭⎤⏊\u245dⓅ\u242a", 8946),
         new int[]{123, 124, 125, -1, -1, -1},
         II(var3, 1.2),
         III(var5, 1.2),
         54,
         190,
         312,
         new String[]{I1lo("⊎⌼⌁⌳⌺⏬⎌⎸㵗\u2429\u2450⒮⑆⓽⑅⒠Ⓜ╯╇⒏⓿└▼◉▻◙♬♟⚶☛⛼⚓⚦⚃☓❂❮✀㤯⟅➢", 8946), I1lo("⊎⌼⌁⌳⌦⏬⎌⎣⎋\u2429⑀␦", 8946)},
         II(false, false)
      );
      var10.lOOI = 30;
      int[] var11 = new int[]{-8, -18, -19, -20};

      for (int var12 = 0; var12 < 4; var12++) {
         IO_I.III var13 = var2.II(
            var11[var12],
            I1lo("⊠⍞⍲⌀⌺⏒⏺⎎⎵\u245a②", 8946),
            I1lo("⊠⏥⍒㶞⌚⎭⏺㴌⏊\u245a━⑧\u2456", 8946) + var12,
            new int[]{138, 139, 140, -1, -1, -1},
            II(var3, 1.3),
            III(var5, 1.3),
            57,
            300,
            312,
            new String[0],
            II(false, false)
         );
         var13.Iol = true;
         var13.Ioll = true;
         var13.lOOI = 20;
      }
   }

   private static int II(long var0, double var2) {
      return (int)Math.min(200000000L, (long)(var0 * var2));
   }

   private static int III(long var0, double var2) {
      return (int)Math.min(2000000000L, (long)(var0 * var2));
   }

   private static int[][] II(boolean var0, boolean var1) {
      int[][] var2 = new int[][]{
         {2, 3, -1},
         {2, 6, -1},
         {0, 7, -1},
         {0, 1, -1},
         {4, 5, -1},
         {1, 6, -1},
         {1, 5, -1},
         {1, 4, -1},
         {1, 3, -1},
         {1, 2, -1},
         {1, 1, -1},
         {1, 7, var1 ? 1000 : -1},
         {5, 1, -1},
         {5, 2, -1},
         {5, 3, -1},
         {5, 4, -1},
         {5, 5, -1},
         {5, 6, -1},
         {5, 7, -1},
         {3, 1, -1},
         {3, 5, -1},
         {3, 6, -1}
      };
      Vector var3 = new Vector();

      for (int var4 = 0; var4 < var2.length; var4++) {
         if (!var1 || var2[var4][0] != 1 || var2[var4][1] == 7) {
            var3.addElement(var2[var4]);
         }
      }

      if (var0) {
         var3.addElement(new int[]{6, 7, 60000});
      }

      int[][] var5 = new int[var3.size()][];
      var3.copyInto(var5);
      return var5;
   }

   int II1o(int var1) {
      return (int)Math.min(2147483647L, (long)this.III1.II.Il1I() * var1);
   }

   int II_(int var1) {
      return (int)Math.min(2147483647L, (long)this.III1.II.Illo() / Math.max(1, var1));
   }

   boolean IIIO(int var1, int var2) {
      return this.IolO && var1 >= 53 && var1 <= 62 && this.II[var1] != null && var2 < this.II[var1].length && this.II[var1][var2];
   }

   void II10(int var1, int var2) {
      if (this.IolO && this.II[var1] != null && var2 < this.II[var1].length) {
         this.II[var1][var2] = true;
         if (this.II[var1] != null && var2 < this.II[var1].length) {
            this.II[var1][var2] = System.currentTimeMillis();
         }

         this.lII0();
      }
   }

   boolean Il11() {
      if (this.IolO && this.II[59] != null) {
         for (int var1 = 0; var1 < this.II[59].length; var1++) {
            if (this.II1O[59][var1] == 22 && !this.II[59][var1]) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   boolean Il1_() {
      return this.IolO && this.III1.IIIl.II.IllO();
   }

   boolean II__(int var1) {
      return this.IolO && this.II[59] != null && var1 < this.II[59].length && this.II1O[59] != null && this.II1O[59][var1] == 22
         ? this.Il1_() && System.currentTimeMillis() - this.II[59][var1] >= 10000L
         : false;
   }

   void II1o(int var1, int var2) {
      if (this.IolO && this.II[var1] != null && var2 < this.II[var1].length) {
         this.II[var1][var2] = false;
      }
   }

   void II_I(IO_I.III var1) {
      this.lII0();
   }

   private void lII0() {
      if (this.IolO && !this.Iol0) {
         for (int var1 = 53; var1 <= 62; var1++) {
            if (this.II[var1] == null) {
               return;
            }

            for (int var2 = 0; var2 < this.II[var1].length; var2++) {
               if (!this.II[var1][var2]) {
                  return;
               }
            }
         }

         if (!this.III1.IIIl.II.Ill_()) {
            this.Iol0 = true;
            this.III1.IIIl.IIol(I1lo("⊿⍰⍅⍯≿⏤⎌⎿⌆⑤␈╗㪿ⓦ⒄⒍⒊◢╎", 8946));
         }
      }
   }

   void II_l(IO_I.III var1) {
      int var2 = this.III_.nextInt(2) == 0 ? 4 : 6;
      int var3 = Math.max(1, var1.lllI / 10);
      int var4 = Math.max(1, var1.lOlO / 10);

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = Math.max(60, var1.I1 + this.III_.nextInt(401) - 200);
         this.III1
            .IIIl
            .II
            .II(
               -9 - var5,
               I1lo("⊼⍘⍾⌅⌯⏒⏯⎇⎥⑇⑭", 8946),
               I1lo("⊼⍸⍞⌥⌏⎭⍭⎤⏊\u245dⓅ\u242a", 8946),
               new int[]{123, 124, 125, -1, -1, -1},
               var3,
               var4,
               54,
               var6,
               var1.I1I,
               new String[]{I1lo("⊎⌼⌁⌳⌺⏬⎌⎸㵗\u2429\u2450⒮⑆⓽⑅⒠Ⓜ╯╇⒏⓿└▼◉▻◙♬♟⚶☛⛼⚓⚦⚃☓❂❮✀㤯⟅➢", 8946), I1lo("⊎⌼⌁⌳⌦⏬⎌⎣⎋\u2429⑀␦", 8946)},
               II(false, false)
            )
            .lOOI = 20;
      }
   }

   void lIIo() {
      if (this.IolO && this.III1.II.lOlo == 57) {
         IO00 var1 = this.III1.II;
         if (!this.Iol0) {
            var1.III1(26, I1lo("⊰㷜⍞⍯⌃⏤⎌⋚㴁⑧\u244f⑧␎⑷Ⓤ⒤Ⓜ╵╈═▿┉▼◐▲㬶♱☗☸⟔⛽⚓⟃☓❩", 8946));
         } else {
            var1.III1(
               26,
               I1lo(
                  "⊦⍰⌐⌬⌆㵆⏙⏫⎞②\u245d␦⑊⒥Ⓤ⒫╒╯╇┟┽▜◿▛▴▞➨➖☿♕➅㡘⚼⚖✰❌➽❍⟡⟄➤➎⠨⡋㛣⠜⢤⦲⥲㘂⥣⤿⥐⤺㞱⧸⦚⦺㜟⩶⨖⨧⨕⪙⫆⪰⫐⨞⯍⭭⬋⯢㔏⮼⯈Ⱪⱁ㊈ⰇⲣⲖⳡⲓⲞ\u2d71ⴝ\u2d2a\u2d9bⶺⶈⷸ⳦デ⹛⸳⹓\u2efc⻖〝⺌⼮⼚⽬⼘\u2feb⿆\u2fe8⾓ぴお〪〄アヅクゾゐㅵㄜㄯㄈ⼸㇑ㇷ㆘㋵㉍㉽㉜㊿㊺㊌㈏㍮㌌㌥㌍㈹㈉㎮㏆㑦㑌⪊㑂㓢㑓㒟㓯㓝㕬㕓㖠㔍㖸㒦㖿㗕㙠㛟㘿㙝㚰㞾⠟㛍㝯㟊㜩㝉㟦㟀㙶㙄㡭㠃㠶㢍㣭㢿㣌㢼㣜㥳㥛㤱㤙㧿㧗",
                  8946
               )
            );
            if (!this.Iolo) {
               this.III1
                  .IIIl
                  .IIol(
                     I1lo(
                        "⊦⍣㶑⌦⍎⊝㵵⎨⏊⑇⑀⒤␈⒥▵␠Ⓜ╣㯫┟┪└╶◎◺▝♱㣰☢♙⚴⛑㡳⚟✰❌➽❍➽➋➺➁⣲⡓⡦⥴㙇⢃⢶⠍⥭⤿⥕⤴㟃⧶⦚⦯⦑⫽⩘⩵⨚⫴㑿⪲⫐⬻⬎⬾⬍⯤⮊⮽⮚\u2db7㋽Ⱖⱄ⳨ⳊⲨⳀⲏ\u2d76ⵔ\u2d7cⴏⷲⷌⶡ㌶\u2e78⸕⽅ヌ\u2efc⺑⿁⸜⽠", 8946
                     )
                  );
               this.Iolo = true;
               this.I1O_ = System.currentTimeMillis();
               this.lIl();
               this.lI();
               this.Illo(57);
            }
         }
      }
   }

   private void lIl() {
      int var1 = 53 + this.III_.nextInt(10);

      for (int var2 = 53; var2 <= 62; var2++) {
         this.II[var2] = new Vector();
         I0Io.II var3 = I0Io.II(var2);
         int var4 = Integer.MAX_VALUE;
         int var5 = Integer.MIN_VALUE;
         if (var3 != null && var3.III != null) {
            for (int var6 = 0; var6 < var3.III.length; var6++) {
               if (var3.III[var6].I1 < var4) {
                  var4 = var3.III[var6].I1;
               }

               if (var3.III[var6].I1 > var5) {
                  var5 = var3.III[var6].I1;
               }
            }
         }

         int var9 = 1 + this.III_.nextInt(3);

         for (int var7 = 0; var7 < var9; var7++) {
            int[] var8 = this.II(var3, var4, var5);
            this.II[var2].addElement(new int[]{18 + this.III_.nextInt(3), var8[0], var8[1], 1});
         }

         if (var2 == var1) {
            int[] var10 = this.II(var3, var4, var5);
            this.II[var2].addElement(new int[]{17, var10[0], var10[1], 1});
         }
      }
   }

   private int[] II(I0Io.II var1, int var2, int var3) {
      if (var1 != null && var1.III != null && var1.III.length > 0 && var3 > var2) {
         int var5 = Math.max(60, var2 + this.III_.nextInt(var3 - var2 + 1));
         return new int[]{var5, II(var1, var5)};
      } else if (var1 != null && var1.III != null && var1.III.length > 0) {
         I0Io.III var4 = var1.III[this.III_.nextInt(var1.III.length)];
         return new int[]{Math.max(60, var4.I1), var4.I1I};
      } else {
         return new int[]{100 + this.III_.nextInt(500), 312};
      }
   }

   private static int II(I0Io.II var0, int var1) {
      int var2 = var0.III[0].I1I;
      int var3 = Math.abs(var0.III[0].I1 - var1);

      for (int var4 = 1; var4 < var0.III.length; var4++) {
         int var5 = Math.abs(var0.III[var4].I1 - var1);
         if (var5 < var3) {
            var3 = var5;
            var2 = var0.III[var4].I1I;
         }
      }

      return var2;
   }

   private void Illo(int var1) {
      if (this.IolO && this.Iolo && this.II[var1] != null) {
         long var2 = this.I1O_ + 60000L;

         for (int var4 = 0; var4 < this.II[var1].size(); var4++) {
            int[] var5 = (int[])this.II[var1].elementAt(var4);
            if (var5[3] == 1) {
               this.III1.IIIl.II(var5[0], var5[1], var5[2], var2);
            }
         }
      }
   }

   void III1(int var1, int var2, int var3) {
      if (this.IolO && this.Iolo) {
         int var4 = this.III1.II.lOlo;
         if (var4 >= 53 && var4 <= 62 && this.II[var4] != null) {
            for (int var5 = 0; var5 < this.II[var4].size(); var5++) {
               int[] var6 = (int[])this.II[var4].elementAt(var5);
               if (var6[3] == 1 && var6[0] == var1 && var6[1] == var2 && var6[2] == var3) {
                  var6[3] = 0;
                  if (var1 == 17) {
                     this.lIl1();
                  }

                  return;
               }
            }
         }
      }
   }

   void lIlI() {
      int var1 = this.III1.II.lOlo;
      if (this.IolO && II_1(var1)) {
         this.lI();
         this.Illo(var1);
      }

      this.Ill0(var1);
   }

   void III1(long var1) {
      IOol var3 = this.III1.II;
      if (var3 != null) {
         if (this.Io1l && var1 >= this.I1OO) {
            this.III1.II(new IO0o(44).IIII(1600000001).II(Il11[this.III_.nextInt(Il11.length)]));
            this.I1OO = var1 + 20000L + this.III_.nextInt(30000);
         }

         if (!this.IolO) {
            if (II_1(var3.lOlo)) {
               this.III1.IIIl.IIol(I1lo("⏢⏲⌐⌧㷑⏹⎌⎿⎂㫔⑁⑧␁⓬Ⓟ⒭Ⓨ┡╂㮞┰╝◯㬆◺ⓨ➨㣔☵♕➅✃⚳⛑❦㧮❮✃⟤❋", 8946));
               this.III1.IlOl(21 + var3.lOlI);
            }
         } else {
            if (!this.Iolo && var1 - this.I1O1 >= 1800000L || this.Iolo && var1 - this.I1O_ >= 60000L) {
               this.lIl1();
            }
         }
      }
   }

   void lIll() {
      if (this.IolO) {
         IOol var1 = this.III1.II;
         this.III1.IIIl.II.II(var1.Illo() / 20L, var1.Il1I() * 50L);
      }
   }

   private void lIl1() {
      IOol var1 = this.III1.II;
      this.IolO = false;
      this.Iol0 = false;
      this.Iolo = false;
      this.Io1I = false;
      this.III1.IIIl.II.Iool();
      this.III1.II(new IO0o(65).II(0).II("").III(0));
      if (II_1(var1.lOlo)) {
         this.III1.IIIl.IIol(I1lo("⏢⏲⌐⌧㷑⏹⎌⎿⎂㫔⑁⑧␁⓬Ⓟ⒭Ⓨ┡╂㮞┰╝◯㬆◺ⓨ➨㣔☵♕➅✃⚳⛑❦㧮❮✃⟤❋", 8946));
         this.III1.IlOl(21 + var1.lOlI);
      }
   }
}
