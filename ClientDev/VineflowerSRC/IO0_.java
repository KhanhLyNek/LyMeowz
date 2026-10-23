package main;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

final class IO0_ {
   static final int looo = 10;
   static final String lI_1 = "Tại khu vực này, ta đã dùng ma pháp phong ấn\bdù các ngươi có mạnh đến đâu\bcũng sẽ trở thành yếu đuối như nhau\nChỉ có ta với con nhóc Ôsin mới giải được ma pháp này\bKhi đó sức mạnh của ngươi sẽ được\bgiải phóng theo điểm tích lũy (TL)\nKhi đủ điểm tích lũy bằng cách\bhạ lẫn nhau hoặc hạ boss\bta sẽ đưa ngươi xuống tầng tiếp theo";
   static final int _I = 600000;
   private final IO0 IIl_;
   private final IOo_ IIl_;
   private final Random IIl1 = new Random();
   int l1__;
   long I_1;
   private int _II = -1;
   private long I_1I;
   private long I_1l;
   private int Il_0 = -1;
   private final Vector IIl1 = new Vector();

   IO0_(IO0 var1, IOo_ var2) {
      this.IIl_ = var1;
      this.IIl_ = var2;
   }

   static boolean II0O(int var0) {
      return var0 >= 114 && var0 <= 120;
   }

   static boolean Il_1() {
      int var0 = Calendar.getInstance().get(11);
      return var0 >= 12 && var0 < 13;
   }

   private static int IIOO(int var0) {
      switch (var0) {
         case 114:
            return 115;
         case 115:
            return 117;
         case 116:
         default:
            return var0;
         case 117:
            return 118;
         case 118:
            return 119;
         case 119:
            return 120;
      }
   }

   private void IIIl(int var1, String var2) {
      this.IIl_.II(new IO0o(124).III(var1).II(var2));
   }

   private void llO_() {
      this.IIl_.II(new IO0o(-115).II(I1_o("턡퇘", 53621)).III(this.l1__).III(10).III(3));
   }

   void llOO() {
      if (!Il_1()) {
         this.IIl_.IIIl.IIol(I1_o("턃퇡퇚퇲톝틢퉁툩퉍펝챈튣틉팹팕팮퍄", 53621));
      } else {
         this.IIl_.II.lO1 = 0;
         this.l1__ = 0;
         this.IIl_.III_(114, 100 + this.IIl1.nextInt(401), 336);
      }
   }

   void lIlI() {
      IOol var1 = this.IIl_.II;
      int var2 = var1.lOlo;
      if (var2 != this.Il_0) {
         this.Il_0 = var2;
         if (II0O(var2)) {
            if (var1._l0l != 9 && var1._l0l != 10) {
               var1._l0l = 9 + this.IIl1.nextInt(2);
               this.IIl_.ll_l();
            }

            if (var2 == 117) {
               this.IIl_.IIIl.IIol(I1_o("큥텶퇊퇲톝티툏툥툅퉸틅튭틉퍯퍎팧팋펤폀펣펎퐠푫푌쪐퐒퓼풚풵쨉해픚핵픜핰헋헱햓좦홀홭혘훣젇횧", 53621));
            }

            if (var2 != 114 && var2 != 116) {
               this.l1__ = 0;
               int var3 = var2 - 114;
               if (var2 > 116) {
                  var3--;
               }

               IO0l var4 = new IO0l(521, 1);
               var4.III(1, var3 * 5);
               if (this.IIl_.IIIl.III0(var4)) {
                  this.IIl_
                     .IIIl
                     .IIol(
                        I1_o("턷켵퇝퇲톟퉸첂툠퉍펝팛착튊패", 53621)
                           + var3 * 5
                           + I1_o("텕퇤퇛턨톅툰", 53621)
                           + (IOO.II(521) == null ? I1_o("턡퇼켈퇲톝퉥퉖첉툃튬틟챧튙", 53621) : IOO.II(521).II1o)
                     );
                  this.IIl_.IIIl.l1_l();
               }
            }

            this.llO_();
         } else {
            if (var1._l0l == 9 || var1._l0l == 10) {
               var1._l0l = 0;
               this.IIl_.ll_l();
            }

            this._II = -1;
         }
      }
   }

   void III1(long var1) {
      IOol var3 = this.IIl_.II;
      if (var3 != null && II0O(var3.lOlo)) {
         if (var3.lOlo != 116) {
            if (this._II >= 0) {
               if (var1 - this.I_1I >= 3000L) {
                  this.I_1I = var1;
                  if (this._II == 30) {
                     this.IIl_.II.III1(5, I1_o("턡퇦켞톼퇑퉳퉇툧쳒틢튋폛툊패퍌췹팑펤폗펪팛푣퐳퐞퐾퐔푡퓔풾퓘핣핗핵프헻쬑햸헐홽죳혤홌훠훂젆횁휧혷\ud7a7휝힣ퟌ\ud7a6힁힆", 53621));
                  }

                  if (this._II > 0) {
                     this.IIl_.IIIl.IIol(I1_o("턣콕톓톼톙티툏툽툌틹튋", 53621) + this._II + I1_o("텕퇳퇚터톈툰퉁첡툌", 53621));
                  }

                  this._II -= 3;
                  if (this._II <= 0) {
                     this._II = -1;
                     this.IIl_.IlOl(21 + var3.lOlI);
                  }
               }
            } else if (!Il_1()) {
               this._II = 30;
               this.I_1I = 0L;
            } else if (var1 - this.I_1l >= 1000L) {
               this.I_1l = var1;
               if (this.IIl1.nextInt(100) < 1 && var3._l0l == 9) {
                  this.IIIl(46, I1_o("톯퇹톓톰톐퉼퉎퉮툕퉠튋튨툐퍩팇", 53621) + var3.II1o);
                  this.IIl_.IIIl.IIol(I1_o("턷켵퇝퇲탠틳툏투첦튬틩튫튋퍡툶펤팜펤폗펪팕푩퐿푓퐴풖퓵", 53621));
                  var3._l0l = 10;
                  this.IIl_.ll_l();
               } else if (this.IIl1.nextInt(50) < 1 && var3._l0l == 10) {
                  this.IIIl(44, I1_o("톯퇹톓톰톐퉼퉎퉮툕퉠튋튨툐퍩팇팮펖폥펃펥펈쪣푶퐞퐾퐔퓴풚", 53621) + var3.II1o);
                  this.IIl_.IIIl.IIol(I1_o("턷켵퇝퇲탠틳툏퍟폝챯틈틪툽퍻퍎패퍅폣폊쵡펈퐠푽퓇퐼표퓶푐", 53621));
                  var3._l0l = 9;
                  this.IIl_.ll_l();
               }
            }
         }
      }
   }

   void II_1(IO_I.III var1) {
      IOol var2 = this.IIl_.II;
      if (II0O(var2.lOlo)) {
         this.l1__ = this.l1__ + (var1.II.lIlI.equals(I1_o("털퇕퇱톇톮툡툝툆", 53621)) ? 25 : 10);
         this.llO_();
         if (this.l1__ >= 10 && var2.lOlo != 120) {
            this.IIl_.II.III(5, 3001, I1_o("털퇵퇆퇲탠퉹툏툸첶틥튋튾튈패퍟팳춴폪폄폢펕쪧푱푙푽퐈퓲쨅풩퓘핣핞픰픛", 53621), new String[]{I1_o("턺퇟", 53621)});
         }
      }
   }

   boolean IIlI(int var1, int var2) {
      if (var1 != 3001) {
         return false;
      }

      if (var2 == 0 && this.l1__ >= 10 && this.IIl_.II.lOlo != 120) {
         this.llO0();
      }

      return true;
   }

   private void llO0() {
      int var1 = IIOO(this.IIl_.II.lOlo);
      if (var1 != this.IIl_.II.lOlo) {
         this.IIl_.II.lO1 = 0;
         this.IIl_.III_(var1, 100 + this.IIl1.nextInt(400), 100);
      }
   }

   private boolean Il__() {
      return System.currentTimeMillis() < this.I_1;
   }

   void llOo() {
      IOol var1 = this.IIl_.II;
      if (var1._l0l != 9) {
         this.IIl_.II.III1(44, I1_o("턻퇳퀃큳톘툰퉇튭툔튬틝찋틉퍸퍏팣퍅폧쵄펣폁푭퓳푐퐵표퓶푚퓹풌핿쯵핵픜헺쭵햿", 53621));
      } else {
         this.IIl1.removeAllElements();
         Vector var2 = new Vector();
         var2.addElement(I1_o("턽퀤콨톼톖툚퉋쳥툃튆틟튢툃퍥", 53621));
         this.IIl1.addElement(I1_o("턝퇰", 53621));
         if (!this.Il__()) {
            var2.addElement(I1_o("턲퇽켐톻퇑퉤퉝첥퉧틼틃툣튙패퍓팮판촩폗폈폐퐠푱푙쪐퐟", 53621));
            this.IIl1.addElement(I1_o("턒퇠", 53621));
         }

         if (this.l1__ >= 10 && var1.lOlo != 120) {
            var2.addElement(I1_o("턭퇡콢톼톖툚퉻쳩툃틫튋튮퍙췓퍎", 53621));
            this.IIl1.addElement(I1_o("턑퇻퇄톼", 53621));
         }

         String[] var3 = new String[var2.size()];
         var2.copyInto(var3);
         this.IIl_
            .II
            .IIII(
               44,
               6,
               I1_o(
                  "큥콿퇝통퇑퉦쳶툧퉍틴틎튧틉퍼퍏틶춸폪폄폢펣푡푽푗핌풞퓢풖퓹풖핰핗픬핔풂쬍햿헐홬홆혬홌훣젅횧훈흫ퟆ흥휐ퟫ줅\ud7afퟀ힒\ud87f\ud81d\ud94d웚\ud8f5\ud899\ud8ab\ud9de\ud936\ud977\ud93d\ud911\ud9fb\ud8a0\ud932\ud996\uda2e\uda46\uda24\uda02\udaaa\udaca\uda3a\uda89\udb26\udb56얕\udb0d\udbe5\udb81\udba3\udab6\udb90\udc7a\udc1c\udc2b\udc12숺\udcd1\udcf7\udc85쏶\udd14\udd3b쏝\uddff\udd90\udcde썋\ude74\ude0d",
                  53621
               ),
               var3
            );
      }
   }

   void ll0() {
      IOol var1 = this.IIl_.II;
      if (var1._l0l != 10) {
         this.IIl_.II.III1(46, I1_o("턻퇳퀃큳톘툰퉇튭툔튬틝찋틉퍸퍏팣퍅폧쵄펣폁푭퓳푐퐵표퓶푚퓹풌핿쯵핵픜헺쭵햿", 53621));
      } else {
         this.IIl1.removeAllElements();
         Vector var2 = new Vector();
         var2.addElement(I1_o("턽퀤콨톼톖툚퉋쳥툃튆틟튢툃퍥", 53621));
         this.IIl1.addElement(I1_o("턝퇰", 53621));
         if (!this.Il__()) {
            var2.addElement(I1_o("턲퇽켐톻퇑퉤퉝첥퉧틼틃툣튙패퍓팮판촩폗폈폐퐠푱푙쪐퐟", 53621));
            this.IIl1.addElement(I1_o("턒퇠", 53621));
         }

         if (this.l1__ >= 10 && var1.lOlo != 120) {
            var2.addElement(I1_o("턭퇡콢톼톖툚퉻쳩툃틫튋튮퍙췓퍎", 53621));
            this.IIl1.addElement(I1_o("턑퇻퇄톼", 53621));
         }

         var2.addElement(I1_o("턣콕톓톼톙티", 53621));
         this.IIl1.addElement(I1_o("턝퇻퇞톷", 53621));
         String[] var3 = new String[var2.size()];
         var2.copyInto(var3);
         this.IIl_
            .II
            .IIII(
               46,
               7,
               I1_o(
                  "턷콙퇝퇲톺퉱퉆튺퉍틨틄틪튊퍧퍉퍦팋포퍐펡폁퓔푬푗퐳표퓸쨝풴퓘퐆쮑픠핔풂핑헱햓훼혎혠죛훿횊횽졉흮휆화힆ퟺ힌ퟯퟎힷ\ud8fd\ud844\ud87c\ud818\ud8f2\ud8cc왱\ud899\ud936\ud957잟\ud953\ud9b5\ud9e5\ud9b9읐\uda7e\uda0d\uda27\uda03\uda6b\udaca\udaa0\udac0\udb26\udb4b\udb2c\udb8a\udba3",
                  53621
               ),
               var3
            );
      }
   }

   boolean III1(int var1, int var2, int var3) {
      if (var2 != 6 && var2 != 7) {
         return false;
      }

      if (var3 >= 0 && var3 < this.IIl1.size()) {
         String var4 = (String)this.IIl1.elementAt(var3);
         if (var4.equals(I1_o("턝퇰", 53621))) {
            this.IIl_
               .II
               .III1(
                  var1,
                  I1_o(
                     "턡켵퇚퇲톚퉸퉚퉮툛챽틈틪튇폨퍞퍪퍅폰폂폢티퓣퐿푚풤퐒퓼풚풴풙픷핆픽햕헣햒햡햘홠홀혪홌젮후훁회\ud7fe휆휦힅ퟠ힂\ud7af힇홏\ud9bf\ud854\ud87c\ud818\ud869\ud899\ud8b5왖\ud978\ud95d\ud974\ud862윭\ud9df\ud9f0\ud8fe\udaec\uda58\uda44\uda08\udbe3\udac7\udaaf\udac7\udb75얘\udb64\udb17\udbf0앾\udbe0\udbab\udb96\udcfd\udc52\udc33\udc5a\udce0숇\udca2\udcd6\udc04\udd41쎂\udd1b\uddb1\uddde\udda7\udc5e\ude2d\ude42\ude23\ude0b\udefc\udea2\ude84\ude8e쇌\udf04\udf20\udf91\udfa1\udfd4\udfde\udffe\udf8bﻇ\ue052\ue07a\ue01a\ue0f7\ue0d9\ue0f6\ue09b\ue17c\ue1c0\ue131\ue151\ue144\ue1dc\ue1a7\ue183\ue22c\ue246ﲑ\ue200\ue2a8\ue2c0\ue2afﱆ\ue36d\ue303\ue253\ue2d1ﵣ\ue3fc\ue39e\ue3b0\ue39d\ue43b\ue44a\ue431\ue499\ue4e7\ue496\ue4bb\ue414\ue56a\ue53a\ue51a\ue518\ue5e6\ue58e\ue4dc\ue51f\ue62b\ue659\uf8a0\ue60b\ue6a7\ue6cb\uf864\ue68a\ue76b\ue702\ue722驪\ue71e\ue7be\ue7d3\ue7bb\ue64b\ue9bb\ue850\ue878\ue804\uf62b\ue895\ue9c5\ue943\uf7f1\ue952\ue958\ue908\ue9e7\uf70e\ue9a5\ue9cb\uea7a\uea41\ueabb\uea09\ueae1\uea85\ueab0\uea8b\ueb67\ueb4e\ueb60\uea4e\ueb17\uf55e\uebd1\uebfb\ueb8e\uecf4\uec5b\uec3f\uec56\uecf9\ueddd\uecaa\uecd2\ued39\ued64\ued03\ued47\ued87\uede7\ueda3\ued83\uee29\uef39\uf0a0\uee46\uef94\ueecd\uf000\uee8f\uef21\uef54\uefd2\uef3d\uef15\uefbc\uefd7\ueeb3\uef80\uf038\uf055\ueee7\uf01b\uf0f3\uf093\uf0b1\uf010\uf173\uf147\uf146\uf105\uef2d\uf18b\uf1a6\uef42\uf266\uf207\uf228\uf20d\uf2e5\uf2d6\uf2e2\uf289\uf36f\ueda8\uf35d\uf37d\uf314\ued3a\uf39a\uf3bb\uf397\uf464\uf445\uf45d\uf400\uf4f2\uf492\uf4a2\uea4d\uf52f\uf43f\uf4fd\uf50d\uf5ab\uf5c4\uf5ae\uf458\uf7a6\uf64f\uf665\uf61c\uf6f6\ue873\uf6af\uf687\uf6df\uf76a\ue99a\uf732\uf71c\uf7ba\uf7cd\uf7b1\ue948\uf866\uf815\uf820\uf81b\uf8f7\uf8de",
                     53621
                  )
               );
         } else if (var4.equals(I1_o("턒퇠", 53621))) {
            if (this.IIl_.II.lOoO < 1) {
               this.IIl_.IIIl.IIol(I1_o("턷켵퇝퇲톚퉸틛툠툊튬틈툹틉툙췀퍦팋폣쵮펡", 53621));
               return true;
            }

            this.IIl_.II.lOoO--;
            this.IIl_.IIIl.l1_();
            this.I_1 = System.currentTimeMillis() + 600000L;
            this.IIl_.II(new IO0o(-106).III(3778).III(600));
            this.IIl_
               .IIIl
               .IIol(
                  I1_o(
                     "턥퇼텚톢퇑퉤퉇툻쳀틸튋폛툊패툶틶춆폧펃펥펈쪣푶퐞퐩퐎쩰풖퓹풋쯾핕핵푥핲헜햹헐홬죉혬홌훩젋횧훈혖ퟅ흥휐횀ퟌ\ud7a6ퟀ힋\ud876\ud858\ud833\ud85b\ud98b\ud8d0옛\ud89a\ud936\ud941\ud9b9\ud910\ud9fa\ud991\ud9bc\ud886\uda77",
                     53621
                  )
               );
         } else if (var4.equals(I1_o("턑퇻퇄톼", 53621))) {
            if (this.l1__ >= 10 && this.IIl_.II.lOlo != 120) {
               this.llO0();
            }
         } else if (var4.equals(I1_o("턝퇻퇞톷", 53621))) {
            this.IIl_.IlOl(21 + this.IIl_.II.lOlI);
         }

         return true;
      } else {
         return true;
      }
   }
}
