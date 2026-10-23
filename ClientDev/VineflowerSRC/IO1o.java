package main;

import java.io.DataInputStream;
import java.io.IOException;

final class IO1o {
   static final int l_ll = 0;
   static final int l_l1 = 1;
   static final int l_l_ = 2;
   static final int l_lO = 3;
   static final int l_l0 = 4;
   static final int l_lo = 5;
   static final int l_1 = 6;
   static final int l_1I = 7;
   static final int l_1l = 8;
   static final int l_11 = 9;
   static final int l_1_ = 10;
   static final int l_1O = 11;
   static final int l_10 = 12;
   static final int l_1o = 13;
   static final int l__ = 14;
   static final int l__I = 15;
   static final int l__l = 16;
   static final int l__1 = 17;
   static final int l___ = 18;
   static final int l__O = 19;
   static final Object[][] II = new Object[][]{
      {I1l1("찻쳲쳛쳹첖쵿펛촥쵔췅퍵췱춲칦칀츥", 52348), I1l1("쵬툺쳎쳹첛펲쵆쵵촢퍔춒춓춙칡칆", 52348), 10000, 340000L},
      {I1l1("찯퉲쳙쳹첕펶쵘촽쵔췠췛촻춅츯칍탨츜", 52348), I1l1("쵬툺쳎쳹첛펲쵆쵵쵑춢", 52348), 50, 1500000L},
      {I1l1("찲챯쳔첾쳘쵳췔촻쵔췰췚쳒춝츯칍츥킥", 52348), I1l1("찿챹쳃쳹췩펺쵃쵵촀췻팕춿췐켞킏츹칌컨퀏캹컈켲", 52348), 20, 5L},
      {I1l1("차쳩춹체쳘쵣쵄폸촚춳췆춣쳳칢츎츹츄퀤컄캮", 52348), I1l1("차쳳툕첷첟촷촇쵥쵄춳췜춶챀탒칇칭츇컣칋캪컈콩콎켤켑", 52348), 20, 100L},
      {I1l1("찲퉂쳓쳹첛췣쵘촲쵔췰췓춾췐칬쾞킐츂컬", 52348), I1l1("찿쳳촊툆첖쵰촖쵧쵚춣춂췡췐칿칆캬츘", 52348), 10, 2000L},
      {I1l1("찷쳳쳓첷첐촷쵕춡촚췴춒춥춘컯칀츥칌컿컂큨캇", 52348), I1l1("찾쳺쳃쳹쳊촧촘쵥쵄춣춒춼촙칻", 52348), 10, 20000L},
      {I1l1("차쳳퉙쳹첋찔쵘쵵촀췻췛팖춞츯칖탬", 52348), I1l1("찴툺첚쳨쳖촧촆쵥쵔췢췇촰춙츯칚츿캆컥캊캢캀쿳콈켢", 52348), 10, 1000L},
      {I1l1("차툶쳊쳹첔쵢쵏펒촚춳췐촱춙츯칌탮츂", 52348), I1l1("찴툺첚쳨쳖촧촆쵥쵔췽췕챡팭칦츎츿쿍컦", 52348), 10, 1000L},
      {I1l1("찴쳴툛청쳘찆폯촻촓춳췑춹쳳칢츎츮츄큂", 52348), I1l1("찿쳳촛첰쳘쵿첗촻쵔춢춀췡췐침칇킐", 52348), 20, 120L},
      {I1l1("찴퉌첚청첊폴촖채펧췽췕췱쳡탖칇", 52348), I1l1("찿쳳쳕쳹쳉촧촘쵥쵄춣춒쳀퍝칺츎츹츄퀬컄", 52348), 50, 10000L},
      {I1l1("차쳩챃체쳘쵹쵞폢촀춳췄춴췐칬칆츬츅", 52348), I1l1("찾챺쳔쳹첛쵿쵙쵵쵑춡춒췣췀츿츎츠캟컥캊쿘퀻", 52348), 10, 200L},
      {I1l1("찰툼쳔쳹췩펰쵃쵵촚팲췂췱춞침탣츮", 52348), I1l1("찲툺쳊쳹찕쵣촖촻촜팶췆췱췁츺츞칭츂컬큧캪", 52348), 50, 150L},
      {I1l1("쵬챺쳔첱쳘쵵펗촼쵔췠췛촻춅츯칟츸캍컢", 52348), I1l1("찴툺첚쳨쳈촧촖촦총쵹췇췱춁칺컏츤", 52348), 10, 100L},
      {I1l1("차쳳챛첷첐촷쵞펆총춳췁춸춞칧", 52348), I1l1("찴퉈쳓쳹첋쵾쵘촽쵔췧팓춸췐칬칆킚칌캹캚컹컈콫톁켫", 52348), 50, 200L},
      {I1l1("찷퉢첚첷췻쵹쵑쵵촀췻쵒춿춘츯칚츥탍커", 52348), I1l1("참챢쳔첾쳘쵴쵞촼춞췦춒쳀퍇칬츎츯츅큌컞컩컙켷켖콵콄쿯턅쾯", 52348), 20, 1000L},
      {I1l1("차쳩챃체쳘쵹쵞폢촀춳췜춶팽칬", 52348), I1l1("찲쳳툍청쳘촦촆쵥쵄춳췜춶팽칬", 52348), 20, 1000L},
      {I1l1("쵬툺쳎쳹쳉촢촖촡촆췺퍵춤췐칼탇츮칌컦퀋캧캀", 52348), I1l1("참챻쳔첱쳘쵴쵞촺쵔췧쵐춿췐칻칆킪칌컿큁컩컙켾켉콲콋쾱쾒쿳쿓", 52348), 100, 15000000L},
      {I1l1("차쳮쳃툞첌촷쵝펬쵔췧췚촱춞칧츎츹츄퀪컅", 52348), I1l1("참챢쳔첾쳘쵣쵃촬펳췧춒춺팉츯츆츾츇컢컆캥컈콳콎톬콄쾺쾋쿡쿗쿈퀪퀄큼퀗츽탗", 52348), 50000, 7749L},
      {I1l1("찿쳳춹체쳘쵤췅촶쵔첂팅춲췐칭칇킊츘", 52348), I1l1("쵬촫퉙첺쳘쵙쵗촸폋췰춒춹팣칦츎츾츅컥컂컩컚콌켆켩퇃쿭", 52348), 15, 2000L},
      {I1l1("차쳩챃체쳘쵼펉촡쵔췿췛팔춅츯칬츢츟컸", 52348), I1l1("쵬챺쳔첱쳘찆췄촻쵔췰췇팀춙츯칆탬칌컉컅캺캛켧켔켎콄쿯턅쾯", 52348), 20, 2000L}
   };
   private final IO0 II;
   private final IOo_ II;

   IO1o(IO0 var1, IOo_ var2) {
      this.II = var1;
      this.II = var2;
   }

   long II(int var1) {
      IOol var2 = this.II.II;
      switch (var1) {
         case 0:
         case 1:
         case 16:
            return var2.IO_l;
         case 2:
            return var2._110;
         case 8:
            return var2.IIl0[8] / 3600000L;
         default:
            return var2.IIl0[var1];
      }
   }

   private boolean II_(int var1) {
      return (this.II.II._1O_ & 1 << var1) != 0;
   }

   private boolean II_I(int var1) {
      return this.II_(var1) || this.II(var1) >= (Long)II[var1][3];
   }

   void II(int var1, long var2) {
      if (this.II.II != null && var1 >= 0 && var1 < II.length) {
         this.II.II.IIl0[var1] = this.II.II.IIl0[var1] + var2;
      }
   }

   private static String III0(long var0) {
      return var0 <= 10000L ? String.valueOf(var0) : IO0O.IIIo(var0);
   }

   private String IIlI(String var1) {
      int var2 = this.II.II.lOlI;
      return var1.replace(I1l1("챙첪", 52348), var2 == 0 ? I1l1("찯쳲챐첬쳘쵹쵞춷촚", 52348) : (var2 == 1 ? I1l1("찯쳲챐첬쳘쵙쵗촸폋췰", 52348) : I1l1("찯쳲챐첬쳘쵏쵗촬촐췲", 52348)))
         .replace(I1l1("챙첩", 52348), var2 == 0 ? I1l1("찾쳮쳔체척", 52348) : (var2 == 1 ? I1l1("참쳾쳔첽첝", 52348) : I1l1("창쳫쳊첬첔쵲", 52348)));
   }

   void IooI() {
      IO0o var1 = new IO0o(-76).II(0).II(II.length);

      for (int var2 = 0; var2 < II.length; var2++) {
         var1.II((String)II[var2][0]);
         var1.II(this.IIlI((String)II[var2][1]) + I1l1("챜첳", 52348) + III0(this.II(var2)) + I1l1("챓", 52348) + III0((Long)II[var2][3]) + I1l1("챕", 52348));
         var1.III((Integer)II[var2][2]);
         var1.II(this.II_I(var2));
         var1.II(this.II_(var2));
      }

      this.II.II(var1);
   }

   void III1(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      if (var2 >= 0 && var2 < II.length) {
         if (!this.II_(var2) && this.II(var2) >= (Long)II[var2][3]) {
            if (!this.II.IIIl.Il00()) {
               this.II.IIIl.IIol(I1l1("찿툼쳔쳹첌폆쵟쵵촀췻췛팒춅츯츟칭캘캫컞캻퀹콩콁콥켌콣쿌쾩쿀쾋크큜퀲퀜킺톨츛탗텸텝쿹턝톲퇅톸큟쳑퉃툫", 52348));
            } else {
               int var3 = (Integer)II[var2][2];
               this.II.II._1O_ |= 1 << var2;
               this.II.II._lO += var3;
               this.II.IIIl.l1_l();
               this.II.IIIl.l1_();
               this.II.IIIl.IIol(I1l1("찾툺쳔쳹첎폼쵗쵵촚췻팟춿췐켞쾞킮츏캫", 52348) + var3 + I1l1("챜쳵쳝툔첛촹", 52348));
               this.II.II(new IO0o(-76).II(1).II(var2));
               this.II.I__O();
            }
         }
      }
   }

   void II(int var1, int var2, boolean var3) {
      if (var3) {
         this.II(12, 1L);
      }

      if (var2 == 4) {
         this.II(6, 1L);
      }

      if (var1 == 0) {
         this.II(7, 1L);
      }
   }

   void Ill1(int var1) {
      switch (var1) {
         case 0:
         case 2:
         case 4:
         case 9:
         case 17:
         case 20:
            break;
         case 1:
         case 3:
         case 5:
            this.II(4, 1L);
            break;
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 18:
         case 19:
         default:
            this.II(14, 1L);
      }
   }
}
