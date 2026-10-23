package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import main.GameMidlet;

public final class I_0l extends IO1_ implements I1_1 {
   public static String[] II1I;
   public static String[] II1l;
   public static byte II1O;
   public static boolean[] IIl;
   public static short[] III0;
   private static int IIl;
   public static boolean I0_l;
   public static byte[] IIlI;
   private I1Il[] III;
   private static I1Il IIO1;
   private int Ioll;
   private static String Il1l = I0l_.lIll
      ? Il00("᳔᱙Ხ᳖ᵶᵜδᵒᷞᷖᶩᶂṤṂḮṐỦỎạẊὬὊἦ\u1f58ᾰᾔᾋῪῈ…\u200b⁶⁉₴₇", 7321)
      : Il00(
         "\u1ccf᷑᳷ᲂᵧϑᵳᵃᶫᷔᶽᶏṪṃḥṛầỜẢẇὨὋἡἋᾯῃῐᾳῇ\u202d\u200f\u206e⁍₭₍⃦⃙⅂⁚ⅲ℅⇢㽊⇮⇟∶≏∸∈⋯⋈⊨⋗〉⍗⌧⌀⏭⏰⏜⎴⏒⑸\u2455\u2434⑂⒦⒂ⓡⓀ┦┈╡╜◙Ⓡ◭▘♹㣏♩♛⚽⛂⚷⚅❤❍✯❓❑⟪⟘➽➖⡵⡛⠱⡙⣵⣚⢹⣉⤣⤅⥤⥛⦻⦗⧼⧇⩜⭀⩨⨓⫴㑀⫤⫗⬸⭅⬲⬾⬙⯲⯒⯯⯔ⱭⱝⰶⰛ⳺ⳖⲺⳜ\u2d72ⵟⴢⵔⶼ\u2d98ⷿⷞ⸼⸒\u2e77⹊⻓⿍⻣⺖⽳㇅⼟⽫⽇⿸⿉⾻⾞ぷすっせムブコ゜ㅿㅍㄧㅃ\u31ef㇄ㆧ㇓㈹㈓㉲㉑㊱㊙㋲㋍㍖㉶㌞㌩㌎\u2d7e㎚㏯㏂㑳㑄㐴㐓㓼㓜㓧㓞㕻㕋㔬㔁㗤㗈㖠㗆㙤㙉㘨㙞㚲㚖㛵㛔㛊㜤㜍㝰㜭㛳㞙㞬㞅⛳㠕㡣㡉㣶㣃㢱㢈㥡㥃㥻㥅㧾㧌㦩㦊㩩㩇㨭㩍㫡㫎㪭㫥㫏㬩㬈㭯㭏㮣㮈㯻㮠㵼㰔㰧㰀≴㲐㳷㳔㵩㵞㴪㴍㷦㷆㷶㷖㸫㹐㸦㸃㻬㻏㻝㺷㻓㽿㽔㼷㽃㾩㾃㿢㿁䀢䀉䁢䁝䃆䇆䃮䂙䅾忎䅪䅐䆲䇃䆴䆄䉣䉌䈬䉐䊰䊱䋊䊸䊝䍶䍕䌻䌑䎹䏕䎺䎙䐩䐃䑥䑄䒻䒙䓷䓜䔧䕼䐠䕈䗳䗔嬠䗄䘲䘒䙻䘄䘍䛿䛚䚳䚕䜫䜉䝶䜃䟳䟔䞹䞜䡰䡘䡾䠌䣡䣀䣶䣚䤾䤝䥼䥒䦼䦕䧨䦵䭫䨁䨴䨭咛䪽䪍䫪䫀䭽䭊䬶䬑䯺䯚䯢䯃䰿䱄䰪䰏䳠䳃䲩䲃䴧䵋䴨䴋䶿䶕䷷䷖丵丕丅乮乑今乎仺俨俸佞佶伙俽余侼俑偦兆偮候僾乎僰傍兺兆儡儊凪凔冣冓刮剫剛刼刑勴勘劰勖却卙匸华厡厂叡叀吿吔命呀哞哄咠咞啢啔唶唁喣喓嗻善喍噿噚嘳嘕嚴囐嚶嚓坹坛圵圔埳垟垳垀塣堗塽塟墾墝壽壝夷変夊夂姥姀姺妻妌婼婛娴娔媷嫑媹媒孺孚嬲嬕寰实宬宁屠尖屺属岽岜峱峜崷崈嵳嵎嶱",
         7321
      );
   private static String Il11 = Il1l;
   private static String Il1_ = Il00("᳗᳙ᲰᲗᴯᵐᴡᴓᷟ᷶ᶡ᷀ṤṂḯḅủỉẠẇἫ\u1f47ἬἏΆᾑᾋῪΈ\u202a \u2068⁕₪ₛ⃦", 7321);
   private static String Il1O = Il00("᳗᳙ᲰᲗᴯᴁᵡᵜᶦᶄᷡᷜḾḜṥṘẻẒỶỒἱἐή\u1f58ᾳᾌᾍῲ῍", 7321);
   private static String Il10 = Il00("\u1ccc᳖Ჾᲀᵰᵆᴠᴗᶱᶁ᷵ᶊṿṍḬḅủẆẮẈὡὋἭἃῦ῁ᾑ᾽ᾒⁱ \u206b⁍€₃⃣\u20cf℥℟Ⅳ⅝↠", 7321);
   private static String II0_ = Il00("\u1ccc᳖Ჾᲀᵰᵆᴠᴗᶱᶁ᷵ᷛḿḂṼṞầẚỴỖἫ\u1f16ά\u1f58ᾰᾔᾋῪῈ… ⁶⁈₴₇", 7321);
   public static String IIo_ = Il11;
   public static boolean I0_1;
   public static String IlI1;
   public static int IoII;
   public static boolean I1ll;
   private static int I1Ol;
   public static int[] IIOO = new int[3];
   public static int l1_I;
   private static int I1O1;
   public static boolean I0__;
   public static int percent;
   public static int l1_l;
   public static int l1_1;
   public static boolean I__o = false;
   private static I1Il IIO_;
   public static int III_ = -1;
   public static boolean I0_O;
   public static boolean I0_0 = true;

   public I_0l() {
      System.getProperty(Il00("ᳺ᳗Ჺ᳘ᵦᵛᴽᴋ᷂ᷴᶦᶍṾṟḤḄầềẪẃὬ", 7321));
      this.Io1_();
      if (!II.IIIl) {
         IIl = 0;
         this.I0o_();
      }

      I1_I.IIlI(-1, -1);
      I1_I.Io1 = 100;
      I1_I.Io1I = 200;
      Io_1();
      boolean var1 = false;
      if (var1) {
         IIo_ = II0_;
         if (IO10.l_lI == 1) {
            IIo_ = II0_;
         } else {
            IIo_ = Il10;
         }
      } else {
         IIo_ = Il11;
         if (IO10.l_lI == 1) {
            IIo_ = Il11;
         } else {
            IIo_ = Il1l;
         }
      }
   }

   private void Io1_() {
      this.Ioll = 0;
      String var1 = I_O1.IIl(Il00("᳸᳛Ჴ", 7321));
      this.III = new I1Il[IO1l.l_I0 > 1 ? 3 + this.Ioll : (I0l_.lIll ? 4 : 5) + this.Ioll];
      int var2 = II.IIl1 - 15 * this.III.length + 28;

      for (int var3 = 0; var3 < this.III.length; var3++) {
         switch (var3) {
            case 0:
               this.III[0] = new I1Il("", this, 3, null);
               if (var1 == null) {
                  this.III[0].IIoO = IO11.lIIl;
                  if (I_O1.II(Il00("ᳬ\u1ccbᲲᲄᵔᵛ", 7321) + l1_I) != null) {
                     this.III[0].IIoO = IO11.Il_l;
                  }
               } else if (var1.equals("")) {
                  this.III[0].IIoO = IO11.lIIl;
                  if (I_O1.II(Il00("ᳬ\u1ccbᲲᲄᵔᵛ", 7321) + l1_I) != null) {
                     this.III[0].IIoO = IO11.Il_l;
                  }
               } else {
                  this.III[0].IIoO = IO11.lII1 + Il00("ᲣᲘ", 7321) + var1;
                  if (this.III[0].IIoO.length() > 23) {
                     this.III[0].IIoO = this.III[0].IIoO.substring(0, 23);
                     I1Il var4 = this.III[0];
                     var4.IIoO = var4.IIoO + Il00("ᲷᲖ᳹", 7321);
                  }
               }
               break;
            case 1:
               if (this.Ioll == 1) {
                  this.III[1] = new I1Il("", this, 10100, null);
                  this.III[1].IIoO = IO11.lIIl;
               } else {
                  this.III[1] = new I1Il(IO11.I1I0, this, 7, null);
               }
               break;
            case 2:
               if (this.Ioll == 1) {
                  this.III[2] = new I1Il(IO11.I1I0, this, 7, null);
               } else {
                  this.III[2] = new I1Il("", this, 17, null);
               }
               break;
            case 3:
               if (this.Ioll == 1) {
                  this.III[3] = new I1Il("", this, 17, null);
               } else {
                  this.III[3] = new I1Il(Il00("᳚᱘Ჾ᳖ᰄ\u0383ᴧ", 7321), this, 8, null);
               }
               break;
            case 4:
               if (this.Ioll == 1) {
                  this.III[4] = new I1Il(Il00("᳚᱘Ჾ᳖ᰄ\u0383ᴧ", 7321), this, 8, null);
               } else {
                  this.III[4] = new I1Il(Il00("\u1ccaɕᲶ᳖ᵜᵤ", 7321), this, 7000, null);
               }
               break;
            case 5:
               this.III[5] = new I1Il(Il00("\u1ccaɕᲶ᳖ᵜᵤ", 7321), this, 7000, null);
         }

         this.III[var3].I1I = var2;
         this.III[var3].IOlI();
         this.III[var3].I1 = (II.IIl - this.III[var3].IoII) / 2;
         var2 += 30;
      }
   }

   public static void Io1O() {
      II10(IIo_);
   }

   public static void II10(String var0) {
      try {
         IIOO = new int[3];
         String[] var1;
         IO11.III(Byte.parseByte((var1 = I_Ol.II(var0.trim(), Il00("Ჵ", 7321), 0))[var1.length - 2]));
         II1I = new String[var1.length - 2];
         II1l = new String[var1.length - 2];
         III0 = new short[var1.length - 2];
         IIlI = new byte[var1.length - 2];
         IIl = new boolean[2];

         for (int var2 = 0; var2 < var1.length - 2; var2++) {
            String[] var3 = I_Ol.II(var1[var2].trim(), Il00("Უ", 7321), 0);
            II1I[var2] = var3[0];
            II1l[var2] = var3[1];
            III0[var2] = Short.parseShort(var3[2]);
            IIlI[var2] = Byte.parseByte(var3[3].trim());
            IIOO[IIlI[var2]]++;
         }

         II1O = Byte.parseByte(var1[var1.length - 1]);
         ByteArrayOutputStream var7 = new ByteArrayOutputStream();
         DataOutputStream var8 = new DataOutputStream(var7);

         try {
            var8.writeByte(IO11.IllI);
            var8.writeByte(II1I.length);

            for (int var4 = 0; var4 < II1I.length; var4++) {
               var8.writeUTF(II1I[var4]);
               var8.writeUTF(II1l[var4]);
               var8.writeShort(III0[var4]);
               var8.writeByte(IIlI[var4]);
            }

            II1O = II1O;
            var8.writeByte(II1O);
            I_O1.II(Il00("᳗ᳪ\u1cbbᲟᵻᵟ", 7321), var7.toByteArray());
            var8.close();
            IOI.IO11();
         } catch (Exception var5) {
            var5.printStackTrace();
            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   @Override
   public void III_(IO1l var1) {
      if (!I0_O) {
         var1.Illl(0);
         var1.III_(0, 0, II.IIl, II.IIlI);
      } else {
         II.III1(var1);
      }

      IO1I.II1I.II(var1, Il00("ᳯ\u1c89᳹᳆ᴻᴆᵻ", 7321) + IO1l.l_I0 + Il00("Ჰ", 7321), II.IIl - 2, 17, 1, IO1I.IIlO);
      II0o(var1);
      String var2 = "";
      if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
         if (III_ == 0) {
            new StringBuffer(String.valueOf(var2)).append(II1I[l1_I]).append(Il00("Ჹ᳜Ჾᲅᵶᵛᴽᴜᷴᷓᶻ", 7321)).toString();
         } else {
            new StringBuffer(String.valueOf(var2)).append(II1I[l1_I]).append(Il00("Ჹ᳛ᲸᲘᵻᵑᴰᴆᷴᷔ", 7321)).toString();
         }
      }

      if (I__o && !I0_O) {
         IO1I.II1I.II(var1, IlI1, II.IIl - 2, 2, 1, IO1I.IIlO);
      } else if (IO10.l_lI == 1 && !II.IIIl) {
         IO1I.II1I.II(var1, IlI1, II.IIl - 2, II.IIlI - 15, 1, IO1I.IIlO);
      } else {
         IO1I.II1I.II(var1, IlI1, II.IIl - 2, 2, 1, IO1I.IIlO);
      }

      if (II.II == null) {
         if (!I0_O) {
            if (!I0__) {
               var1.II(I1o_.IlOO, II.IIll, II.IIl1 - 32, 3);
               if (I__o) {
                  if (IIO_ != null) {
                     IIO_.II(var1);
                  }

                  var1.IIIO(0, 0, II.IIl, II.IIlI);
                  IO1I.IIII.II(var1, IO11.I1OO + percent + Il00("\u1cbc", 7321), II.IIl / 2, II.IIl1 + 24, 2);
                  I1_I.II(I1_I.II0o, I1_I.IIo, I1_I.IIoI, II.IIl / 2 - 50, II.IIl1 + 45, 100, 100.0F, var1);
                  I1_I.II(I1_I.II0O, I1_I.III_, I1_I.II00, II.IIl / 2 - 50, II.IIl1 + 45, 100, percent, var1);
                  return;
               }

               IO1I.IIII.II(var1, IO11.Ioo0, II.IIll, II.IIl1 + 24, 2);
               if (IIO_ != null) {
                  IIO_.II(var1);
                  return;
               }
            }
         } else {
            int var3;
            if ((var3 = II.IIl1 - 15 * this.III.length - 15) < 25) {
               var3 = 25;
            }

            if (I1o_.IlOO != null) {
               var1.II(I1o_.IlOO, II.IIll, var3, 3);
            }

            for (int var4 = 0; var4 < this.III.length; var4++) {
               this.III[var4].II(var1);
            }

            var1.IIIO(0, 0, II.IIl, II.IIlI);
            if (2 + this.Ioll < this.III.length) {
               if (III_ == -1) {
                  if (II.IIIO % 20 > 10) {
                     var1.II(I1_I.III0, 0, 14, 7, 7, 0, (II.IIl - IO1I.III_.IIII(this.III[2 + this.Ioll].IIoO) >> 1) - 10, this.III[2 + this.Ioll].I1I + 10, 0);
                     return;
                  }
               } else {
                  var1.II(
                     I1_I.III0, 0, III_ * 7, 7, 7, 0, (II.IIl - IO1I.III_.IIII(this.III[2 + this.Ioll].IIoO) >> 1) - 10, this.III[2 + this.Ioll].I1I + 9, 0
                  );
               }
            }
         }
      }
   }

   @Override
   public void IIlO() {
      if (I1ll) {
         if (++I1Ol == 50) {
            Object var1 = null;
            I_0l var3 = II.II;
            I1O1 = 30;
            II.III(IO11.I1O1);
            if (II1l != null && l1_I >= 0 && l1_I < II1l.length) {
               GameMidlet.III = II1l[l1_I];
            }

            if (III0 != null && l1_I >= 0 && l1_I < III0.length) {
               GameMidlet.II_0 = III0[l1_I];
            }

            var3.Io1_();
            II.II(GameMidlet.III, (short)GameMidlet.II_0);
         }

         if (I1Ol >= 100 && I_0O.II().IlI_()) {
            if (II.II == null) {
               II.II = new I1o_();
            }

            II.II.I0OI();
            I_0_.II().IoOo();
            I1ll = false;
         }
      }

      if (I1O1 > 0) {
         if (--I1O1 == 0) {
            II.III_();
         }

         if (III_ == 2) {
            I1O1 = 0;
            II.III_();
         }
      }

      if (I1O1 <= 0 && I0_0 && ++IoII > 100000) {
         IoII = 0;
      }

      for (int var2 = 0; var2 < this.III.length; var2++) {
         try {
            if (var2 == IIl) {
               this.III[var2].I__I = true;
            } else {
               this.III[var2].I__I = false;
            }
         } catch (Exception var4) {
         }
      }

      I1_I.Io1++;
      if (!I0_O && (I0__ || percent == 100)) {
         IIO_ = null;
      }

      super.IIlO();
      if (!Ilol.I10I && I0_O && I0_0 && II.II == this && III_ != 2) {
         if (IoII < (IO10.l_lI == 1 ? 2 : 5)) {
            if (I1O1 <= 0) {
               I1O1 = 30;
               II.III(IO11.I1O1);
               II.II();
               return;
            }
         } else if (!I_0O.II().IlI_()) {
            if (I1O1 <= 0) {
               I1Il var6 = new I1Il(IO11.I_I_, II.II, 18, null);
               I1Il var5 = new I1Il(IO11.I_IO, II.II, 19, null);
               II.II(IO11.Ilo1 + Il00("Ჷ", 7321) + IO11.IlOI, var6, var5);
               I1O1 = 30;
               return;
            }
         } else if (I1O1 <= 0) {
            IoII = 0;
         }
      }
   }

   private void I0o_() {
      I_Ol.II__(Il00("ᳵ᳗ᲶᲒᴵᵧᴰᴀᷴᷕᶡᷓḭ", 7321) + I0_O + Il00("Ჹ\u1ccbᲲᲚᵰᵗᴧᵏᶱ", 7321) + IIl);
      if (I0_O) {
         super.III0 = new I1Il("", this, this.III[IIl].IIO, null);
      } else {
         super.III0 = IIO_;
      }
   }

   public static void IO11() {
   }

   @Override
   public void I_Il() {
      if (II.IIIl) {
         if (IIO1 != null && IIO1.II0o()) {
            this.II(14, null);
            return;
         }

         if (!I0_O) {
            if (IIO_ != null && IIO_.II0o()) {
               IIO_.I0lO();
            }

            super.I_Il();
            return;
         }

         for (int var1 = 0; var1 < this.III.length; var1++) {
            if (this.III[var1] != null && this.III[var1].II0o() && (III_ != -1 && III_ != 0 || this.III[var1].IIoO.indexOf(IO11.I101) != -1)) {
               this.III[var1].I0lO();
            }
         }
      } else {
         if (IO10.l_lI == 1 && II.II[13]) {
            II.II[13] = false;
            if (IIO1 != null) {
               IIO1.I0lO();
            }
         }

         if (I0_O) {
            if (II.II[8]) {
               int var2 = this.III.length - 1;
               II.II[8] = false;
               if (++IIl > var2) {
                  IIl = 0;
               }

               this.I0o_();
            }

            if (II.II[2]) {
               int var3 = this.III.length - 1;
               II.II[2] = false;
               if (--IIl < 0) {
                  IIl = var3;
               }

               this.I0o_();
            }
         }
      }

      super.I_Il();
   }

   public static void Io10() {
      byte[] var0 = I0l_.lIll ? null : I_O1.II(Il00("᳗ᳪ\u1cbbᲟᵻᵟ", 7321));
      if (var0 == null) {
         II10(IIo_);
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         DataInputStream var2 = new DataInputStream(var1);

         try {
            IIOO = new int[3];
            I_Ol.II__(Il00("ᲹᳶᲅᲚᵼᵚᴸᵒᶬᶐ", 7321) + var2.available());
            IO11.III(var2.readByte());
            byte var3;
            II1I = new String[var3 = var2.readByte()];
            II1l = new String[var3];
            III0 = new short[var3];
            IIlI = new byte[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               II1I[var4] = var2.readUTF();
               II1l[var4] = var2.readUTF();
               III0[var4] = var2.readShort();
               IIlI[var4] = var2.readByte();
               IIOO[IIlI[var4]]++;
            }

            II1O = var2.readByte();
            var2.close();
            IOI.IO11();
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }
   }

   @Override
   public void I0l_() {
      I11.IOlI();
      I1_I.Io1I = 0;
      I1_I.Io1 = 0;
      this.Io1_();
      I0_l = false;
      II.II = null;
      String var1;
      if (((var1 = I_O1.IIl(Il00("\u1ccb᳝ᲤᲠᵰᵆᴠᴛ᷾ᷞ", 7321))) != null && var1 != "" ? Integer.parseInt(var1) : -1) > 0) {
         I0_O = true;
         II.III(0);
      }

      I0__ = true;
      if (2 + this.Ioll < this.III.length && II1I != null && l1_I >= 0 && l1_I < II1I.length) {
         this.III[2 + this.Ioll].IIoO = IO11.I101 + Il00("ᲣᲘ", 7321) + II1I[l1_I];
      }

      super.III0 = new I1Il("", this, this.III[IIl].IIO, null);
      if (1 + this.Ioll < this.III.length) {
         this.III[1 + this.Ioll].IIoO = IO11.I1I0;
      }

      if (this.III.length == 4 + this.Ioll && 3 + this.Ioll < this.III.length) {
         this.III[3 + this.Ioll].IIoO = Il00("᳚᱘Ჾ᳖ᰄ\u0383ᴧ", 7321);
      }

      Io_1();
      Ilol.I10I = false;
      IO10.IIl1();
      super.I0l_();
   }

   public void Io1o() {
      I1_I.Io1I = 0;
      I1_I.Io1 = 0;
      this.Io1_();
      I0_l = false;
      II.II = null;
      String var1;
      if (((var1 = I_O1.IIl(Il00("\u1ccb᳝ᲤᲠᵰᵆᴠᴛ᷾ᷞ", 7321))) != null && var1 != "" ? Integer.parseInt(var1) : -1) > 0) {
         I0_O = true;
         II.III(0);
      }

      I0__ = true;
      if (2 + this.Ioll < this.III.length && II1I != null && l1_I >= 0 && l1_I < II1I.length) {
         this.III[2 + this.Ioll].IIoO = IO11.I101 + Il00("ᲣᲘ", 7321) + II1I[l1_I];
      }

      super.III0 = new I1Il("", this, this.III[IIl].IIO, null);
      if (1 + this.Ioll < this.III.length) {
         this.III[1 + this.Ioll].IIoO = IO11.I1I0;
      }

      if (this.III.length == 4 + this.Ioll && 3 + this.Ioll < this.III.length) {
         this.III[3 + this.Ioll].IIoO = Il00("᳚᱘Ჾ᳖ᰄ\u0383ᴧ", 7321);
      }

      super.I0l_();
   }

   public void IO_() {
      if (II.II == null) {
         II.II = new I_0l();
      }

      l1_1 = 0;
      percent = 0;
      I0_1 = true;
      II.II.Io_l();
      I__o = false;
      IIO_.I__I = true;
      super.III0 = new I1Il("", this, 2, null);
   }

   public void Io_() {
      I1O1 = 30;
      I_0O.II().close();
      if (II1l != null && l1_I >= 0 && l1_I < II1l.length) {
         GameMidlet.III = II1l[l1_I];
      }

      if (III0 != null && l1_I >= 0 && l1_I < III0.length) {
         GameMidlet.II_0 = III0[l1_I];
      }

      I_O1.IIIl(Il00("ᳪ\u1cceᲤᲓᵹᵑᴰᴆ", 7321), l1_I);
      if (IIlI != null && l1_I >= 0 && l1_I < IIlI.length && IIlI[l1_I] != IO11.IllI) {
         IO11.III(IIlI[l1_I]);
      }

      if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
         I1o_.Illl = II1I[l1_I];
      }

      this.Io1_();
      I0_O = true;
      IoII = 0;
      III_ = -1;
      I0_0 = true;
   }

   @Override
   public void II(int var1, Object var2) {
      I_Ol.II__(Il00("ᳩ᳝ᲥᲐᵺᵆᴾᵒ᷂ᷥᶠᶀṪḌḘḏỻỞẢẔὉὍἰ\u1f16ῒῃ῍Άᾘ\u2072", 7321) + var1);
      if (var1 == 1000) {
         II.II();
      }

      if (var1 == 1 || var1 == 4) {
         I_0O.II().close();
         I0_0 = false;
         IoII = 0;
         I0_O = true;
         III_ = 0;
         I__o = false;
         I_O1.I_10();
         this.I0l_();
      }

      if (var1 == 2) {
         I0_1 = false;
         (IIO_ = new I1Il(IO11.Iooo, this, 4, null)).I1 = II.IIl / 2 - IO1_.l_Io / 2;
         IIO_.I1I = II.IIl1 + 65;
         super.IIl = null;
         if (!II.IIIl) {
            IIO_.I1 = II.IIl / 2 - IO1_.l_Io / 2;
            IIO_.I1I = II.IIlI - IO1_.llo_ - 1;
         }

         super.III0 = new I1Il("", this, 4, null);
         if (!I__o) {
            I_0_.II().III((byte)1, (I_lO)null);
            if (!II.IIIl) {
               IIO_.I__I = true;
               super.III0 = new I1Il("", this, 4, null);
            }

            I__o = true;
         }
      }

      if (var1 == 3) {
         if (II.II == null) {
            II.II = new I1o_();
         }

         II.II.I0l_();
         boolean var4;
         if (I_O1.IIl(Il00("᳸᳛Ჴ", 7321)) == null) {
            var4 = false;
         } else if (I_O1.IIl(Il00("᳸᳛Ჴ", 7321)).equals("")) {
            var4 = false;
         } else {
            var4 = true;
         }

         boolean var6;
         if (I_O1.IIl(Il00("ᳬ\u1ccbᲲᲄᵔᵛ", 7321) + l1_I) == null) {
            var6 = false;
         } else if (I_O1.IIl(Il00("ᳬ\u1ccbᲲᲄᵔᵛ", 7321) + l1_I).equals("")) {
            var6 = false;
         } else {
            var6 = true;
         }

         if (!var4 && !var6) {
            II.II();
            String var5;
            if ((var5 = I_O1.IIl(Il00("ᳬ\u1ccbᲲᲄᵔᵛ", 7321) + l1_I)) != null && !var5.equals("")) {
               I1o_ var3 = II.II;
               I1o_.IOo = true;
               II.II();
               I_0_.II().Io__();
               I_0_.II().II(var5, "", Il00("ᲨᲖ᳧᳘ᴧ", 7321), (byte)1);
            } else {
               I_0_.II().IIO("");
            }
         } else {
            II.II.I0OI();
         }

         if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
            I1o_.Illl = II1I[l1_I];
         }
      }

      if (var1 == 10100) {
         if (II.II == null) {
            II.II = new I1o_();
         }

         II.II.I0l_();
         II.II();
         I_0_.II().IIO("");
         I_Ol.II__(Il00("᳭᳙Ჸ᳖ᵠᵇᴶᴀᶱ᷑ᶠ", 7321));
         II.IIIO();
         if (II1I != null && l1_I >= 0 && l1_I < II1I.length) {
            I1o_.Illl = II1I[l1_I];
         }
      }

      if (var1 == 5) {
         Io1O();
         if (II1I == null || II1I.length == 1) {
            return;
         }

         I_lO var12 = new I_lO("");

         for (int var7 = 0; var7 < II1I.length; var7++) {
            var12.addElement(new I1Il(II1I[var7], this, 6, null));
         }

         II.II.II(var12);
         if (!II.IIIl) {
            II.II.llII = l1_I;
         }
      }

      if (var1 == 6) {
         l1_I = II.II.llII;
         this.Io_();
      }

      if (var1 == 7) {
         if (II.II == null) {
            II.II = new I1o_();
         }

         II.II.I0l_();
      }

      if (var1 == 8) {
         boolean var10 = I_O1.III(Il00("ᳵ᳗ᲠᲱᵧᵕᴣᴚ᷸ᷓ", 7321)) == 1;
         I_lO var13;
         (var13 = new I_lO(Il00("ᳺ᳙Ტ᳖ᵽᵝᴽᴚ", 7321))).addElement(new I1Il(IO11.IlIO, this, 9, null));
         var13.addElement(new I1Il(IO11.Il1l, this, 10, null));
         var13.addElement(new I1Il(Il00("᳚ȕᲧ᳖ᵻᵜϾᴆᶱ᷎̠ᷔṡṅ\u008cḟ", 7321), this, 9100, null));
         II.II.II(var13);
         if (var10) {
            II.II.llII = 0;
         } else {
            II.II.llII = 1;
         }
      }

      if (var1 == 9100) {
         I1Il var14 = new I1Il(IO11.I_I_, this, 9101, null);
         I1Il var8 = new I1Il(IO11.I_IO, this, 16, null);
         II.II(Il00("\u1ccdțᲾ᳖ᵹΕᴺᵒ᷶ᵃᶦ᷎ṩÃṫḆỠoẲỆὡὅἷἃᾯῚῖᾮ῝‴⁐′‖㸻⃙₱⃕Ωℇⅲℼ⇒ↆ⇱⇍≏㲌∤≉⋣㰘⊲⋅⍪㷲⌫⍁⏭㴾⏐⎺⏒\u243b⑴\u2431⒚⓹⒖⒣㩙╧┒┺┘╻◀▪◌♩㣡♩㣋⛩⛎⛥⚌⚳㧽✯✇❑", 7321), var14, var8);
      }

      if (var1 == 9101) {
         II.III_();
         II.II = new IOOl(true);
      }

      if (var1 == 9) {
         I_O1.IIIl(Il00("ᳵ᳗ᲠᲱᵧᵕᴣᴚ᷸ᷓ", 7321), 1);
         II.II(IO11.IO1, 8885, null);
      }

      if (var1 == 10) {
         I_O1.IIIl(Il00("ᳵ᳗ᲠᲱᵧᵕᴣᴚ᷸ᷓ", 7321), 0);
         II.II(IO11.IO1, 8885, null);
      }

      if (var1 == 11) {
         if (II.II == null) {
            II.II = new I1o_();
         }

         II.II.I0l_();
         String var11;
         if ((var11 = I_O1.IIl(Il00("ᳬ\u1ccbᲲᲄᵔᵛ", 7321) + l1_I)) != null && !var11.equals("")) {
            I1o_ var9 = II.II;
            I1o_.IOo = true;
            II.II();
            I_0_.II().Io__();
            I_0_.II().II(var11, "", Il00("ᲨᲖ᳧᳘ᴧ", 7321), (byte)1);
         } else {
            I_0_.II().IIO("");
         }

         I_Ol.II__(Il00("᳭᳙Ჸ᳖ᵠᵇᴶᴀᶱ᷑ᶠ", 7321));
      }

      if (var1 == 12) {
         GameMidlet.II.IIll();
      }

      if (var1 == 13 && (!I__o || I0_O)) {
         switch (IO10.l_lI) {
            case 1:
               IO10.IOlI();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
         }
      }

      if (var1 == 14) {
         I1Il var15 = new I1Il(IO11.I_I_, II.II, 15, null);
         I1Il var16 = new I1Il(IO11.I_IO, II.II, 16, null);
         II.II(IO11.lIII, var15, var16);
      }

      if (var1 == 15) {
         I_O1.I_10();
         II.II(IO11.IO1, 8885, null);
      }

      if (var1 == 16) {
         I1OO.I__o();
         II.II = null;
      }

      if (I0l_.lIll && (var1 == 17 || var1 == 18 || var1 == 5 || var1 == 7000)) {
         II.III_();
         if (var1 == 17 || var1 == 5) {
            II.II(Il00("᳛țᲹ᳖ᵺᵒᴵᴞ᷸ᷞᶪ᷎ṮṄ\u0082ṊỪṛủẋǜὐὣἏὠῙᾟ᾽ᾕ㻻‗⁺‒⃰⁃₸ₒℴ⅐㿵℟↰⇌↦㼠≢∋∧⊈⋱⊇⊥⊍㷣⌃〉⌀⏹⎿⏐⎵㵑⑫␚␐\u2428Ⓓ", 7321));
         }
      } else {
         if (var1 == 17) {
            if (II.II == null) {
               II.II = new I_01();
            }

            II.II.I0l_();
         }

         if (var1 == 18) {
            II.III_();
            I1OO.I__o();
            if (II.II == null) {
               II.II = new I_01();
            }

            II.II.I0l_();
         }

         if (var1 == 19) {
            if (IO10.l_lI == 1) {
               I1OO.I__o();
               II.II = null;
               return;
            }

            IoII = 0;
            III_ = 0;
            I0_0 = true;
         }

         if (var1 == 7000) {
            I_Oo.II().I__0();
         }
      }
   }

   public static void II(String var0, String var1, short var2) {
      if (II1l != null && III0 != null && IIlI != null && II1I != null && var1 != null && var1.length() != 0) {
         if (l1_I < 0 || l1_I >= II1l.length) {
            return;
         }

         if (var0 != null && var0.length() > 0) {
            II1I[l1_I] = var0;
         }

         II1l[l1_I] = var1;
         III0[l1_I] = var2;
         Io_I();
      }
   }

   private static void Io_I() {
      if (II1I != null && II1l != null && III0 != null && IIlI != null) {
         try {
            ByteArrayOutputStream var0 = new ByteArrayOutputStream();
            DataOutputStream var1 = new DataOutputStream(var0);
            var1.writeByte(IO11.IllI);
            var1.writeByte(II1I.length);

            for (int var2 = 0; var2 < II1I.length; var2++) {
               var1.writeUTF(II1I[var2]);
               var1.writeUTF(II1l[var2]);
               var1.writeShort(III0[var2]);
               var1.writeByte(IIlI[var2]);
            }

            var1.writeByte(II1O);
            var1.close();
            I_O1.II(Il00("᳗ᳪ\u1cbbᲟᵻᵟ", 7321), var0.toByteArray());
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }

   public void Io_l() {
      I1_I.Io1 = 0;
      I1_I.Io1I = 0;
      this.Io1_();
      I0_O = false;
      percent = 0;
      I0__ = false;
      I__o = false;
      l1_1 = 0;
      Ilol.I10I = false;
      if (!I0_O) {
         (IIO_ = new I1Il(IO11.lI, this, 2, null)).I__I = true;
         IIO_.I1 = II.IIl / 2 - IO1_.l_Io / 2;
         IIO_.I1I = II.IIl1 + 45;
         if (IIO_.I1I > II.IIlI - 26) {
            IIO_.I1I = II.IIlI - 26;
         }
      }

      if (!II.IIIl) {
         IIl = 0;
         this.I0o_();
      }

      super.I0l_();
      this.II(2, null);
   }

   public static void II0o(IO1l var0) {
      if (IIO1 != null) {
         IO1I.II1I.II(var0, IO11.lII, II.IIl - 2, II.IIlI - 15, 1, IO1I.IIlO);
      }
   }

   public static void Io_1() {
      IIO1 = new I1Il("", (I1_1)null, 14, null);
      IIO1.I1 = II.IIl - 78;
      IIO1.I1I = II.IIlI - 26;
   }
}
