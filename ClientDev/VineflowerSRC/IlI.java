package main;

public class IlI extends IIII implements I1_1, I1__ {
   private static Il II;
   private static IlI II;
   public boolean II_1 = false;
   private IlI0 II = new IlI0();
   public int I1 = 0;
   public int I1I = 0;
   private int I1II = 0;
   private long IIo = 1000L;
   private int I1Il = 0;
   private int I1I1;
   public int I1I_ = 20;
   public int I1IO = 5;
   public boolean Il_0;
   public I_lO III_ = new I_lO("");
   public boolean Il_o = false;
   private boolean IlO = false;
   public boolean IlOI = false;
   private Ilol II = null;
   private I_I_ III = null;
   public int I1I0 = 0;
   public boolean IlOl;
   public boolean IlO1;
   public boolean IlO_ = false;
   public boolean IlOO;
   public int I1Io = 500;
   private long IIoI = 0L;
   public static String II1l;
   private static final long IIol = 1100L;
   private static long IIo1 = IO10.IIII();

   public static IlI II() {
      if (II == null) {
         II = new IlI();
      }

      return II;
   }

   public static IlI III() {
      return II();
   }

   private IlI() {
      II = new Il();
   }

   @Override
   protected void II1l() {
      this.IIOI();
      I1_I.II.IIII(II10("㋟㋞㊴㋏㍬㍔㍬㌦㏫㏍㏩", 12946), 0);
      this.II.II(new IlII(this, 100L));
      this.II.II(new IlIl(this, 0L));
      this.II.II(new IlI1(this, 100L));
      this.II.II(new IlI_(this, 1000L));
      this.IIlo();
   }

   @Override
   protected void II11() {
      this.IIOl();
      this.II.I_1O();
   }

   @Override
   protected void II1_() {
      Ilol var1 = Ilol.II();
      if (var1 != null) {
         this.II.IIlO();
         this.I_l_();
         var1.IOIo = this.I1IO;
      }
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
   }

   private void I_ll() {
      if (I1_I.II_O != null) {
         this.III_.removeAllElements();

         for (int var1 = 0; var1 < I1_I.II_O.size(); var1++) {
            Ilol var2 = (Ilol)I1_I.II_O.elementAt(var1);
            if (var2.IIO1 != null
               && !var2.IIO1.equals("")
               && !var2.I_
               && !var2.I_I
               && !var2.IIO1.startsWith(II10("㊱", 12946))
               && !var2.IIO1.startsWith(II10("㊶", 12946))
               && !var2.IIO1.equals(II10("㋆㋃Ⱍ㊁㍩㌍㌸㎋㏣", 12946))) {
               this.III_.addElement(var2);
            }
         }
      }
   }

   private void I_l1() {
      Ilol var1 = Ilol.II();
      if (var1 != null) {
         long var2 = System.currentTimeMillis();
         if (var1.IIl == 0) {
            if (var2 - this.IIoI > 1100L) {
               I_0_.II().IIII((byte)1, (byte)8);
               this.IIoI = var2;
            }
         } else if (var1.IOl_ > 0 && !var1.I_I_) {
            if (var2 - this.IIoI > this.I1Io) {
               I_lO var4 = new I_lO("");
               var4.addElement(var1);
               I_0_.II().II(new I_lO(""), var4, -1);
               this.IIoI = var2;
            }
         } else {
            this.IlOO = false;
            I1_I.II.IIII(II10("㋆ⱀ㋰㊜㏯㍙㍬㉺㍩㎉㎼ⴖ㐦㑑⫫㐗㒢㓊㒨㒶㓞㕶㕕⮜㔎㖹㗋⬾㖕㘴", 12946), 0);
         }
      }
   }

   public void I_l_() {
      this.IIl1();
   }

   public void III_(IO1l var1) {
      try {
         Ilol var2 = Ilol.II();
         if (var2 == null) {
            return;
         }

         int var3 = this.IIl1();
         IO1I.IIl_.II(var1, "" + var3, 0, 0, 0, IO1I.IIlI);
         IIo1.III().III0(var1);
         II_O.III().III_(var1);
         if (this.Il_0) {
            this.I1I0--;
            if (this.I1I0 <= 0) {
               this.Il_0 = false;
            }

            int var4 = II.IIl - I1_I.IIo_.getWidth() - 10;
            int var5 = II.IIlI / 2 + 25;
            var1.II(I10_.IlOI, var4 - 10, var5 - 10, 0);
         }

         IIol.IIIO(var1);
         if (!IIo1.Il_l && IOlO.l1oI >= 0 && IOlO.l1oI < IOlO.II11.length) {
            String var6 = II10("㋉", 12946) + IOlO.l1oI + II10("㋏㊑", 12946) + IOlO.II11[IOlO.l1oI] + II10("㊲㋪㊛", 12946) + IOlO.l1ol + II10("㋏", 12946);
            IO1I.IIII.II(var1, var6, 10, 80, 0, IO1I.III_);
            long var7 = IO10.IIII();
            long var9 = (var7 / 1000L / 60L / 60L + 7L) % 24L;
            long var11 = var7 / 1000L / 60L % 60L;
            String var13 = String.format(II10("㊷㊁㋢㊋㌴㌈㍼㍙㏮", 12946), var9, var11);
            long var14 = (var7 - IIo1) / 1000L / 60L;
            long var16 = var14 / 60L;
            long var18 = var14 % 60L;
            String var20 = var16 + II10("㋺", 12946) + var18 + II10("㋿", 12946);
            String var21 = II10("㋆㋘㊽㊊㌴㌍", 12946) + var13 + II10("㊲㋤㊠㋕㌮", 12946) + var20;
            IO1I.II1I.II(var1, var21, 10, 90, 0, IO1I.IIlI);
            long var22 = Runtime.getRuntime().freeMemory() / 1024L / 1024L;
            long var24 = Runtime.getRuntime().totalMemory() / 1024L / 1024L;
            long var26 = var24 - var22;
            String var28 = II10("㋊㊋㋰", 12946) + var2.I_o_ + II10("㊲㊜㋰㊶㌴㌍", 12946) + var2.I_oO + II10("㊲㋣㊱㊂㌴㌍", 12946) + var26 + II10("㋟㋓", 12946);
            IO1I.II1I.II(var1, var28, 10, 100, 0, IO1I.IIlI);
         }

         if (this.Il_o) {
            this.IIll(var1);
         }

         if (this.IlOI && (this.II != null || this.III != null)) {
            var1.Illl(16711680);
            if (this.II != null) {
               var1.IIII(Ilol.II().I_o_ - I1_I.Io1, Ilol.II().I_oO - I1_I.Io1I, this.II.I_o_ - I1_I.Io1, this.II.I_oO - I1_I.Io1I);
            } else if (this.III != null) {
               var1.IIII(Ilol.II().I_o_ - I1_I.Io1, Ilol.II().I_oO - I1_I.Io1I, this.III.I1 - I1_I.Io1, this.III.I1I - I1_I.Io1I);
            }
         }

         if (!II.II.IOol && !Ilo_.II().I_10 && !II.II.I_10) {
            if (!Ilol.II().I_I_ && I1_I.lIIl == 1 && Ilol.II().II.II01 > 1) {
               Il11.IIlo(var1);
            }

            int var30 = II.IIl - I1_I.IIo_.getWidth();
            int var31 = II.IIlI - 125;
            var1.II(I1_I.IIo_, 0, 0, I1_I.IIo_.getWidth(), I1_I.IIo_.getHeight(), 2, var30, var31, 0);
            boolean var32 = II.II(var30, var31, I1_I.IIo_.getWidth(), I1_I.IIo_.getHeight()) && II.IIIO;
            if (var32) {
               var1.II(I10_.IlOI, var30 - 5, var31, 0);
            }
         }

         Ilol var33 = Ilol.II().IIIl;
         if (var33 != null
            && !var33.I_
            && !var33.I_I
            && var33.IIO1 != null
            && !var33.IIO1.equals("")
            && !var33.IIO1.startsWith(II10("㊱", 12946))
            && !var33.IIO1.startsWith(II10("㊶", 12946))
            && !var33.IIO1.equals(II10("㋆㋃Ⱍ㊁㍩㌍㌸㎋㏣", 12946))) {
            this.II(var1, var33);
         }

         if (this.IlOl || this.IlO1) {
            this.IIl(var1);
         }

         if (this.IlO && !this.IlOl && !this.IlO1) {
            this.IIlI(var1);
         }
      } catch (Exception var29) {
      }
   }

   private void IIl(IO1l var1) {
      short var2 = 160;
      byte var3 = 10;
      byte var4 = 10;
      if (this.IlO1) {
         byte var5 = 10;
         this.II(var1, Ilol.II(), II10("㊿㊜㋰㊼㊡㌍㌜㌣\u2d6e㎉㏥㏊", 12946), var5 + var3, var2, var4, true);
      }

      if (this.IlOl) {
         if (II.IIIO % 15 == 0) {
            I_0_.II().Io0I();
         }

         int var6 = this.IlO1 ? 125 : 10;
         this.II(var1, Ilol.III(), II10("㊿㊜㋰㏿ⷈ㌍㌘ⶇ㎪㎄㏥", 12946), var6 + var3, var2, var4, false);
      }
   }

   private void II(IO1l var1, Ilol var2, String var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var5;
      IO1I.II.II(var1, var3, var4, var8, 0, IO1I.III_);
      var8 += var6;
      this.II(var1, II10("㋁㋼㋪㋏", 12946) + I_1l.IIIl(var2.Illo), var4, var8);
      var8 += var6;
      this.II(var1, II10("㋆㋿㋪㋏", 12946) + I_1l.IIIl(var2.Il1I), var4, var8);
      var8 += var6;
      int var9 = this.II(var2.IOl_, var2.IOlo);
      this.II(var1, II10("㋚㋡㋪㋏", 12946) + I_1l.IIIl(var2.IOl_) + II10("㊺", 12946) + var9 + II10("㊷㊘", 12946), var4, var8);
      var8 += var6;
      int var10 = this.II(var2.IOl1, var2.IO1);
      this.II(var1, II10("㋙㋸㋪㋏", 12946) + I_1l.IIIl(var2.IOl1) + II10("㊺", 12946) + var10 + II10("㊷㊘", 12946), var4, var8);
      var8 += var6;
      this.II(var1, II10("㋁㋵㋪㋏", 12946) + I_1l.IIIl(var2.IOl), var4, var8);
      var8 += var6;
      if (var7) {
         this.II(var1, II10("㋄㉑㊾㊈㌴㌍", 12946) + I_1l.IIIl(var2.Il11), var4, var8);
         var8 += var6;
         if (II0l.III().IllO) {
            this.II(var1, var4, var8);
         }
      } else {
         this.II(var1, II10("㋕㋘㈱㊟㌴㌍", 12946) + I_1l.IIIl(var2.IOlI), var4, var8);
      }
   }

   private void II(IO1l var1, String var2, int var3, int var4) {
      IO1I.II1I.II(var1, var2, var3, var4, 0, IO1I.IIlI);
   }

   private void II(IO1l var1, int var2, int var3) {
      long var4 = II0l.III().II();
      long var6 = II0l.III().III();
      long var8 = var6 > 0L ? var4 * 3600000L / var6 : 0L;
      String var10 = this.II(var8);
      String var11 = II10("㋕㋞㊼㊋㍚㍟㌭㌂㏤㎓㏨㏌", 12946) + I_1l.IIIl(var4) + II10("㊲㊑", 12946) + var10;
      this.II(var1, var11, var2, var3);
   }

   private String II(long var1) {
      return var1 >= 1000000L ? var1 / 1000000L + II10("㋟㊞㊸", 12946) : var1 / 1000L + II10("㋙㊞㊸", 12946);
   }

   private void IIlI(IO1l var1) {
      Ilol var2 = Ilol.II();
      if (var2 != null && var2.II != null && var2.III != null && var2.IIII != null) {
         byte var3 = 10;
         short var4 = 135;
         byte var5 = 10;
         int[] var6 = new int[5];
         int[] var7 = new int[5];
         int[] var8 = new int[5];
         int[] var9 = new int[5];
         int[] var10 = new int[5];
         II(Ilol.II().II, var6, var7, var8, var9, var10);
         II(Ilol.II().III, var6, var7, var8, var9, var10);
         II(Ilol.II().IIII, var6, var7, var8, var9, var10);
         IO1I.II.II(var1, II10("㊿㊜㋰㊻㍆㏹㌂㌬㎪㏽㎁㎩㐦㑶㐏㐫㒢㒌㓭", 12946), var3, var4, 0, IO1I.III_);
         int var11 = var4 + var5 + 2;
         if (Ilol.II().III0().equals(II10("㋆㎡", 12946))) {
            IO1I.II1I
               .II(
                  var1,
                  II10("㋁㋞㊾㊈㍡㍆㌹㍑㎪㏲", 12946)
                     + var6[0]
                     + II10("㊾㊑", 12946)
                     + var6[1]
                     + II10("㊾㊑", 12946)
                     + var6[2]
                     + II10("㊾㊑", 12946)
                     + var6[3]
                     + II10("㊾㊑", 12946)
                     + var6[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋙㋐㊹㊀㍥㍈㌢㍑㎪㏲", 12946)
                     + var7[0]
                     + II10("㊾㊑", 12946)
                     + var7[1]
                     + II10("㊾㊑", 12946)
                     + var7[2]
                     + II10("㊾㊑", 12946)
                     + var7[3]
                     + II10("㊾㊑", 12946)
                     + var7[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋆㋔㊾㊜㍦㍄㌢㌃㏫㏇㏲㏇㑝", 12946)
                     + var8[0]
                     + II10("㊾㊑", 12946)
                     + var8[1]
                     + II10("㊾㊑", 12946)
                     + var8[2]
                     + II10("㊾㊑", 12946)
                     + var8[3]
                     + II10("㊾㊑", 12946)
                     + var8[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋕㋞㊸㊎㍠㌗㍬㌰", 12946)
                     + var9[0]
                     + II10("㊾㊑", 12946)
                     + var9[1]
                     + II10("㊾㊑", 12946)
                     + var9[2]
                     + II10("㊾㊑", 12946)
                     + var9[3]
                     + II10("㊾㊑", 12946)
                     + var9[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋙㋘㊢㊆㍠㌗㍬㌰", 12946)
                     + var10[0]
                     + II10("㊾㊑", 12946)
                     + var10[1]
                     + II10("㊾㊑", 12946)
                     + var10[2]
                     + II10("㊾㊑", 12946)
                     + var10[3]
                     + II10("㊾㊑", 12946)
                     + var10[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
         } else if (Ilol.II().III0().equals(II10("㋊㋵", 12946))) {
            IO1I.II1I
               .II(
                  var1,
                  II10("㋙㋐㊻㊎㍢㍂㌸㍑㎪㏲", 12946)
                     + var6[0]
                     + II10("㊾㊑", 12946)
                     + var6[1]
                     + II10("㊾㊑", 12946)
                     + var6[2]
                     + II10("㊾㊑", 12946)
                     + var6[3]
                     + II10("㊾㊑", 12946)
                     + var6[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋑㋐㋰㏿㏣㍎㍶㍋㏑", 12946)
                     + var7[0]
                     + II10("㊾㊑", 12946)
                     + var7[1]
                     + II10("㊾㊑", 12946)
                     + var7[2]
                     + II10("㊾㊑", 12946)
                     + var7[3]
                     + II10("㊾㊑", 12946)
                     + var7[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋑㋐㏁㊆㍭㌍㌁㍑㎪㏲", 12946)
                     + var8[0]
                     + II10("㊾㊑", 12946)
                     + var8[1]
                     + II10("㊾㊑", 12946)
                     + var8[2]
                     + II10("㊾㊑", 12946)
                     + var8[3]
                     + II10("㊾㊑", 12946)
                     + var8[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋕㋞㊸㊎㍠㌗㍬㌰", 12946)
                     + var9[0]
                     + II10("㊾㊑", 12946)
                     + var9[1]
                     + II10("㊾㊑", 12946)
                     + var9[2]
                     + II10("㊾㊑", 12946)
                     + var9[3]
                     + II10("㊾㊑", 12946)
                     + var9[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋜㋐㊠㊟㍯㌗㍬㌰", 12946)
                     + var10[0]
                     + II10("㊾㊑", 12946)
                     + var10[1]
                     + II10("㊾㊑", 12946)
                     + var10[2]
                     + II10("㊾㊑", 12946)
                     + var10[3]
                     + II10("㊾㊑", 12946)
                     + var10[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
         } else {
            IO1I.II1I
               .II(
                  var1,
                  II10("㋂㋘㊳㊀㍢㍂㍶㍋㏑", 12946)
                     + var6[0]
                     + II10("㊾㊑", 12946)
                     + var6[1]
                     + II10("㊾㊑", 12946)
                     + var6[2]
                     + II10("㊾㊑", 12946)
                     + var6[3]
                     + II10("㊾㊑", 12946)
                     + var6[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋖㋐㊹㊂㍯㍂㍶㍋㏑", 12946)
                     + var7[0]
                     + II10("㊾㊑", 12946)
                     + var7[1]
                     + II10("㊾㊑", 12946)
                     + var7[2]
                     + II10("㊾㊑", 12946)
                     + var7[3]
                     + II10("㊾㊑", 12946)
                     + var7[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("ⱂ㋒㋰㊛㍧㏇㌹㍑㎪㏲", 12946)
                     + var8[0]
                     + II10("㊾㊑", 12946)
                     + var8[1]
                     + II10("㊾㊑", 12946)
                     + var8[2]
                     + II10("㊾㊑", 12946)
                     + var8[3]
                     + II10("㊾㊑", 12946)
                     + var8[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋕㋞㊸㊎㍠㌗㍬㌰", 12946)
                     + var9[0]
                     + II10("㊾㊑", 12946)
                     + var9[1]
                     + II10("㊾㊑", 12946)
                     + var9[2]
                     + II10("㊾㊑", 12946)
                     + var9[3]
                     + II10("㊾㊑", 12946)
                     + var9[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
            var11 += var5;
            IO1I.II1I
               .II(
                  var1,
                  II10("㋜㋐㊹㊃㌴㌍㌗", 12946)
                     + var10[0]
                     + II10("㊾㊑", 12946)
                     + var10[1]
                     + II10("㊾㊑", 12946)
                     + var10[2]
                     + II10("㊾㊑", 12946)
                     + var10[3]
                     + II10("㊾㊑", 12946)
                     + var10[4]
                     + II10("㋏", 12946),
                  var3,
                  var11,
                  0,
                  IO1I.IIlI
               );
         }
      }
   }

   private static void II(I101[] var0, int[] var1, int[] var2, int[] var3, int[] var4, int[] var5) {
      if (Ilol.II().III0().equals(II10("㋆㎡", 12946))) {
         for (int var6 = 0; var6 < var0.length; var6++) {
            I101 var7 = var0[var6];

            try {
               if (var7 != null && var7.III[1] != null && var7.III[2] != null && var7.II.II0l <= 4) {
                  if (var7.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍝㏙㌢㌌㍾㏂㎽", 12946)) || var7.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍝㏙㌢㌌㍾㏂㎽", 12946))) {
                     II(var1, var7);
                  } else if (var7.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍚㍅ⷫ㌅㎪㏿㊡㏇㑒㑗⪡", 12946)) || var7.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍚㍅ⷫ㌅㎪㏿㊡㏇㑒㑗⪡", 12946))) {
                     II(var2, var7);
                  } else if (var7.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍚㍅㎦㌅", 12946)) || var7.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍚㍅㎦㌅", 12946))) {
                     II(var3, var7);
                  } else if (var7.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍉㍂㌤㌊㏤", 12946)) || var7.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍉㍂㌤㌊㏤", 12946))) {
                     II(var4, var7);
                  } else if (var7.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍅㍄㌾㌂㏤", 12946)) || var7.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍅㍄㌾㌂㏤", 12946))) {
                     II(var5, var7);
                  }
               }
            } catch (Exception var11) {
            }
         }
      } else if (Ilol.II().III0().equals(II10("㋊㋵", 12946))) {
         for (int var12 = 0; var12 < var0.length; var12++) {
            I101 var14 = var0[var12];

            try {
               if (var14 != null && var14.III[1] != null && var14.III[2] != null && var14.II.II0l <= 4) {
                  if (var14.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍅㍌㌧㌊㏸㏆㎼", 12946)) || var14.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍅㍌㌧㌊㏸㏆㎼", 12946))) {
                     II(var1, var14);
                  } else if (var14.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍍㍌㍬㉻㍧㏊", 12946)) || var14.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍍㍌㍬㉻㍧㏊", 12946))) {
                     II(var2, var14);
                  } else if (var14.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍍㍌㉝㌂㏩㎉㎅", 12946)) || var14.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍍㍌㉝㌂㏩㎉㎅", 12946))) {
                     II(var3, var14);
                  } else if (var14.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍉㍂㌤㌊㏤", 12946)) || var14.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍉㍂㌤㌊㏤", 12946))) {
                     II(var4, var14);
                  } else if (var14.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍀㍌㌼㌛㏫", 12946)) || var14.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍀㍌㌼㌛㏫", 12946))) {
                     II(var5, var14);
                  }
               }
            } catch (Exception var10) {
            }
         }
      } else {
         for (int var13 = 0; var13 < var0.length; var13++) {
            I101 var15 = var0[var13];

            try {
               if (var15 != null && var15.III[1] != null && var15.III[2] != null && var15.II.II0l <= 4) {
                  if (var15.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍞㍄㌯㌄㏦㏆", 12946)) || var15.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍞㍄㌯㌄㏦㏆", 12946))) {
                     II(var1, var15);
                  } else if (var15.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍞㍄㌧㌀㏥㏛㎧㏇㑂㑄㐭㐎㓣㓎", 12946))
                     || var15.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍞㍄㌧㌀㏥㏛㎧㏇㑂㑄㐭㐎㓣㓎", 12946))) {
                     II(var2, var15);
                  } else if (var15.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏ⷞ㍎㍬㌟㏣㍃㎽", 12946)) || var15.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏ⷞ㍎㍬㌟㏣㍃㎽", 12946))) {
                     II(var3, var15);
                  } else if (var15.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍉㍂㌤㌊㏤", 12946)) || var15.III[2].II.II1o.startsWith(II10("㋁㋔㊤㋏㍉㍂㌤㌊㏤", 12946))) {
                     II(var4, var15);
                  } else if (var15.III[1].II.II1o.startsWith(II10("㋁㋔㊤㋏㍀㍌㌥㌇㎪㏊㎠㎎⪹㑋㑤㐁㓫㓏㒨", 12946))
                     || var15.III[2].II.II1o.startsWith(II10("㋜㋐㊹㊃㌮㍎㌤㌂ⴵ㏇㏨㎅㑯㑋㐬", 12946))) {
                     II(var5, var15);
                  }
               }
            } catch (Exception var9) {
            }
         }
      }
   }

   private static void II(int[] var0, I101 var1) {
      var0[var1.II.II0l]++;
   }

   private int II(int var1, int var2) {
      return var2 == 0 ? 0 : var1 * 100 / var2;
   }

   public int IIl1() {
      this.I1II++;
      long var1 = IO10.IIII();
      long var3 = var1 - this.IIo;
      if (var3 >= 500L) {
         this.I1Il = (int)(this.I1II * 1000.0 / var3 + 0.5);
         this.I1II = 0;
         this.IIo = var1;
      }

      return this.I1Il;
   }

   private void II(IO1l var1, Ilol var2) {
      if (this.Il_o) {
         String var3 = var2.IIO1 + II10("㊲㋪", 12946) + I_1l.IIIl(var2.IOl_) + II10("㊽", 12946) + I_1l.IIIl(var2.IOlo) + II10("㋏", 12946);
         IO1I.IIl0.II(var1, var3, II.IIl / 2, 43, 2, IO1I.IIlI);
         byte var4 = 60;
         byte var5 = 10;
         if (var2.I1_O) {
            IO1I.IIl0.II(var1, II10("㋐ⱺ㋰㊻㍊㍥㌟㍑㎪", 12946) + var2.IOO + II10("㊲㋖㊹㈍㍷", 12946), II.IIl / 2, var4, 2, IO1I.IIlI);
            var4 += var5;
         }

         if (var2.IOIl == 3) {
            IO1I.IIl0.II(var1, II10("㎂㋐㊾㊈㌮㍆㌥㌅㏢㎉㎫㌓㑨㑂", 12946), II.IIl / 2, var4, 2, IO1I.IIlI);
            var4 += var5;
         }

         if (var2.I_I0) {
            IO1I.IIl0.II(var1, II10("㎂㋐㊾㊈㌮㍆㌤㌂㍠㏇㏨㎉㔅㑋㐣㑃㓮㔑⨣㒱㒙", 12946), II.IIl / 2, var4, 2, IO1I.IIlI);
            var4 += var5;
         }

         if (var2.IIlo == 1) {
            IO1I.IIl0.II(var1, II10("㎂㋐㊾㊈㌮㍏㌥ⷔ㏤㎉㎣㎏⫏", 12946), II.IIl / 2, var4, 2, IO1I.IIlI);
            var4 += var5;
         }

         if (var2.I_lO) {
            IO1I.IIl0.II(var1, II10("㋐ⱺ㋰㊛㍦㏙㌥㍋㏧㏀㌢㎉", 12946), II.IIl / 2, var4, 2, IO1I.IIlI);
            var4 += var5;
         }

         if (var2.I0OI != 0) {
            IO1I.IIl0.II(var1, II10("㋐ⱺ㋰㊛㍼㏞㌥", 12946), II.IIl / 2, var4, 2, IO1I.IIlI);
            var4 += var5;
         }

         if (var2.I_l1) {
            IO1I.IIl0.II(var1, II10("㋐ⱺ㋰㊌㍦㍂㎭㌅㏭", 12946), II.IIl / 2, var4, 2, IO1I.IIlI);
            int var6 = var4 + var5;
         }
      }
   }

   public void II(IO1l var1, Ilol var2, int var3, int var4) {
      if (var2.IIl != 0 && var2.IIl != -1) {
         int var5 = II.IIl - 21;
         I_oo.IIII(var1, var2.IO0_, var5, var3, 0, 0);
      }
   }

   public boolean III0(int var1) {
      if (II.II_ == Il__.II().I1__) {
         IIO0.III().Illl = !IIO0.III().Illl;
         I1_I.II.IIII(II10("㋆ⱀ㋰㏿㏯㍃㌤㍑㎪", 12946) + (IIO0.III().Illl ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)), 0);
         return true;
      }

      if (II.II_ == Il__.II().I1OO) {
         Il0.IOI_();
         return true;
      }

      if (II.II_ == Il__.II().I1Oo) {
         Il0.IOI0();
         return true;
      }

      if (II.II_ == Il__.II().I1O0) {
         Il0.IOIO();
         return true;
      }

      if (II.II_ == Il__.II().I1oI) {
         this.I_1l();
         II.II.I__0();
         return true;
      }

      if (II.II_ == Il__.II().I10) {
         I_0_.II().IoOI();
         return true;
      }

      if (II.II_ == Il__.II().I10O) {
         Il_1.IIIl(521);
         return true;
      }

      if (II.II_ == Il__.II().IIl_) {
         II.II.IoI();
         II.II.I__0();
         return true;
      }

      if (II.II_ == Il__.II().I1o1) {
         if (Ilol.II().IIl == 0) {
            I_0_.II().IIII((byte)1, (byte)8);
            I1_I.II.IIII(II10("㎂㉒㋰㊈ⷣ㍄㍬㌒㍠㏜㏨㎄⪡㑐㑤㐁⨯㓕㓠㒼⨣㔽㐭㔾㔔", 12946), 0);
         } else {
            I_0_.II().IIII((byte)1, (byte)0);
            I1_I.II.IIII(II10("㎂㉒㋰㊈ⷣ㍄㍬㌒㍠㏜㏨㎄⪡㑐㑤㐗⨭㓕㓠㒼⨣", 12946), 0);
         }

         return true;
      } else {
         if (II.II_ == Il__.II().I1O_) {
            III().I_l0();
            return true;
         }

         if (II.II_ == Il__.II().I1Ol) {
            if (Ilol.II().IIIl == null) {
               I1_I.II.IIII(II10("㋄㋄㊹㋏㍂㏟㌢㌌㎪㏪㎠\u2d2a㑨㐅㐉⪆㓡㒁㒔㒶㐔㕨㔝", 12946), 0);
            } else {
               I_0_.II().II((byte)0, Ilol.II().IIIl.IOI_, (byte)-1, -1);
               I1_I.II.IIII(II10("㎂㉒㋰㊨ⷣ㍄㍬㌧ⵗ㏀㏨㎪⫛㑌㑤㐤㓫㓀㒯㓿㒺⯖㕟㔳㕚㒉⬇㖹㗌㘵", 12946) + Ilol.II().IIIl.IIO1, 0);
            }

            return true;
         } else if (II.II_ == Il__.II().I1OI) {
            byte var3 = Il_1.II(new short[]{1884, 921, 454});
            if (var3 == -1) {
               I1_I.II.IIII(II10("㋙㋙㈤㊁㍩㌍㌸㎇㏧㎉㎼㎏⪣㑜㑤㐁㑶㓏㒧㓿㒊㕼㕕", 12946), 0);
            } else {
               I_0_.II().II((byte)0, (byte)1, var3, (short)-1);
            }

            return true;
         } else {
            if (II.II_ == Il__.II().I1_O) {
               I_0_.II().III((byte)0, -1);
               return true;
            }

            if (II.II_ == Il__.II().I1_0) {
               byte var2 = Il_1.II(new short[]{194, 193});
               if (var2 == -1) {
                  I1_I.II.IIII(II10("㋙㋙㈤㊁㍩㌍㌸㎇㏧㎉㎼㎏⪣㑜㑤㐀㓣㓑㒳㒪㒒㕸", 12946), 0);
               } else {
                  I_0_.II().II((byte)0, (byte)1, var2, (short)-1);
               }

               return true;
            } else {
               return true;
            }
         }
      }
   }

   public void I_lO() {
      if (this.Il_o) {
         int var1 = 150;
         short var2 = 157;
         byte var3 = 9;
         int var4 = II.IIl - var2;
         int var5 = this.III_.size();

         for (int var6 = 0; var6 < var5; var6++) {
            Ilol var7 = (Ilol)this.III_.elementAt(var6);
            if (var7 != null) {
               if (II.II(var4, var1 + 2, var2 - 5, var3)) {
                  Ilol var8 = Ilol.II();
                  if (var8.IIIl != null && var8.IIIl == var7) {
                     Il_0.III1(var7.I_o_, var7.I_oO);
                     var8.II = null;
                  } else {
                     var8.IIII = null;
                     var8.II = null;
                     var8.II = null;
                     var8.IIIl = var7;
                  }

                  IO.II();
                  II.IIlI();
                  break;
               }

               var1 += var3 + 2;
            }
         }
      }
   }

   public void IIll(IO1l var1) {
      if (this.Il_o) {
         int var2 = 150;
         byte var3 = 9;
         int var4 = II.IIl - 5;
         int var5 = this.III_.size();
         Ilol var6 = Ilol.II();
         Ilol var7 = var6.IIIl;
         int var8 = var6.I_o_ - I1_I.Io1;
         int var9 = var6.I_oO - I1_I.Io1I;
         boolean var10 = Il_1.II1o();

         for (int var11 = 0; var11 < var5; var11++) {
            Ilol var12 = (Ilol)this.III_.elementAt(var11);
            if (var12 != null
               && var12.IIO1 != null
               && !var12.IIO1.equals("")
               && !var12.I_
               && !var12.I_I
               && !var12.IIO1.startsWith(II10("㊱", 12946))
               && !var12.IIO1.startsWith(II10("㊶", 12946))
               && !var12.IIO1.equals(II10("㋆㋃Ⱍ㊁㍩㌍㌸㎋㏣", 12946))) {
               boolean var13 = Il_1.II(var12);
               boolean var14 = var12.IIl != 0 && var12.IIl != -1;
               StringBuffer var15 = new StringBuffer();
               var15.append(var11 + 1).append(II10("㊼㊑", 12946)).append(var12.IIO1).append(II10("㊲㋪", 12946)).append(I_1l.IIIl(var12.IOl_));
               if (!var13) {
                  var15.append(II10("㊲㊜㋰", 12946)).append(var12.III0());
               }

               if (var14) {
                  var15.append(II10("㊲㊑㋰㋏㌮", 12946));
               }

               var15.append(II10("㋏", 12946));
               String var16 = var15.toString();
               int var17 = var12.I_o_ - I1_I.Io1;
               int var18 = var12.I_oO - I1_I.Io1I;
               if (var7 != null && var7.IIO1.equals(var12.IIO1)) {
                  var1.Illl(14155776);
                  var1.IIII(var8, var9, var17, var18);
                  IO1I.IIl0.II(var1, var16, var4, var2, 1, IO1I.IIlI);
                  if (var14) {
                     this.II(var1, var12, var2, var11);
                  }
               } else if (var13) {
                  var1.Illl(16383818);
                  var1.IIII(var8, var9, var17, var18);
                  IO1I.IIl_.II(var1, var16, var4, var2, 1, IO1I.IIlI);
                  if (var14) {
                     this.II(var1, var12, var2, var11);
                  }
               } else if (var12.IOlo > 100000000 && var12.IOl_ > 0 && var10) {
                  IO1I.IIl0.II(var1, var16, var4, var2, 1);
                  if (var14) {
                     this.II(var1, var12, var2, var11);
                  }
               } else {
                  IO1I.II1I.II(var1, var16, var4, var2, 1, IO1I.IIlI);
                  if (var14) {
                     this.II(var1, var12, var2, var11);
                  }
               }

               var2 += var3 + 2;
            }
         }
      }
   }

   public void I_l0() {
      if (!IIoo.II1l() && (Ilol.II().IIIl != null || Ilol.II().IIII != null)) {
         this.IlOI = !this.IlOI;
         if (this.IlOI) {
            this.II = Ilol.II().IIIl;
            this.III = Ilol.II().IIII;
            I1_I.II.IIII(II10("㋙㋙㈣㊎㌮㍀ⶩ㌈㎪㏝㎡㌍㑳㐟㑤㐡⨯㓕", 12946), 0);
         } else {
            this.II = null;
            this.III = null;
            Ilol.II().IIIl = null;
            Ilol.II().IIII = null;
            Ilol.II().II = null;
            Ilol.II().II = null;
            I1_I.II.IIII(II10("㋙㋙㈣㊎㌮㍀ⶩ㌈㎪㏝㎡㌍㑳㐟㑤㐷⨭㓕", 12946), 0);
         }
      }
   }

   private void I_lo() {
      if (this.IlOI) {
         Ilol var1 = Ilol.II();
         if (var1 != null) {
            if (this.II != null) {
               boolean var2 = false;

               for (int var3 = 0; var3 < I1_I.II_O.size(); var3++) {
                  Ilol var4 = (Ilol)I1_I.II_O.elementAt(var3);
                  if (var4 == this.II && var4.IOl_ > 0 && !var4.I_I_) {
                     var2 = true;
                     break;
                  }
               }

               if (var2) {
                  Ilol.II().IIIl = this.II;
                  Ilol.II().IIII = null;
                  Ilol.II().II = null;
                  Ilol.II().II = null;
                  return;
               }
            }

            if (this.III != null) {
               boolean var5 = false;

               for (int var6 = 0; var6 < I1_I.IIO.size(); var6++) {
                  I_I_ var7 = (I_I_)I1_I.IIO.elementAt(var6);
                  if (var7 == this.III && var7.llIl > 0) {
                     var5 = true;
                     break;
                  }
               }

               if (var5) {
                  Ilol.II().IIII = this.III;
                  Ilol.II().IIIl = null;
                  Ilol.II().II = null;
                  Ilol.II().II = null;
                  return;
               }
            }

            this.IlOI = false;
            this.II = null;
            this.III = null;
            I1_I.II.IIII(II10("㋙㋙㈣㊎㌮㍀ⶩ㌈㎪㏝㎡㌍㑳㐟㑤㐷⨭㓕", 12946), 0);
         }
      }
   }

   public void I_1() {
      Il11.I_01();
      int var1 = II.IIl - I1_I.IIo_.getWidth();
      int var2 = II.IIlI - 125;
      if (II.II(var1, var2, I1_I.IIo_.getWidth(), I1_I.IIo_.getHeight()) && II.III0 && II.IIIo) {
         this.I_1l();
         II.II.I__0();
         II.IIlI();
      }
   }

   private void I_1I() {
      if (I1_I.II_O != null) {
         for (int var1 = I1_I.II_O.size() - 1; var1 >= 0; var1--) {
            Object var2 = I1_I.II_O.elementAt(var1);
            if (var2 instanceof Ilol) {
               Ilol var3 = (Ilol)var2;
               if (var3 != null && var3 != Ilol.II() && var3.IOI_ != Ilol.II().IOI_ * -1 && var3.I0Il != 31) {
                  boolean var4 = false;
                  if (IIol.IIIO.IIlO() > 0) {
                     var4 = !IIol.IIIl(var3.IIO1);
                  } else if (var3.III0 != 5) {
                     var4 = true;
                  }

                  if (var4) {
                     I1_I.II_O.removeElementAt(var1);
                  }
               }
            }
         }
      }
   }

   public void I_1l() {
      Il1_.II()
         .III()
         .II(II10("㋟㋐㊹㊁㌮㍠㌣㌏", 12946))
         .II(II10("㋖ⱺ㊳㊇㌮㍎㌤㌞㏳\u2d6a㎦", 12946), "", 1, null)
         .II(II10("㋐㋞㊣㊜", 12946), "", 2, null)
         .II(II10("㋙ⱈ㋰㊁㈍㍃㌫", 12946), "", 3, null)
         .II(II10("㎂Ⱌ㊥㋏㍺㍅ⷫ㌅", 12946), "", 4, null)
         .II(II10("㋆ⱀ㋰㊁㍦\u2d9a㌸", 12946), "", 5, null)
         .II(II10("㋆㉑㊾㋏㍽㏌㌸", 12946), "", 6, null)
         .II(II10("㋑㋙㊱㊛", 12946), "", 7, null)
         .II(II10("㋆㋘Ⱁ㊂㌮㍃㉏㌅㏭", 12946), "", 8, null)
         .II(II10("㋑㉑㊹㋏\u321f\u2d9a㌸", 12946), "", 9, null)
         .II(II10("㋆㋙㈺㊂", 12946), "", 10, null)
         .II(this)
         .I__0();
   }

   public void I_11() {
      Il1_.II()
         .III()
         .II(II10("㋟㋔㊾㊚㌮㍽㌾㌄", 12946))
         .II(II10("㋞㋞㊷㊆㍠", 12946), "", 20, null)
         .II(II10("㋇㋁㋰㏾ⷉ", 12946), "", 21, null)
         .II(II10("㋆ⱀ㋰㊜㏯㍙", 12946), "", 22, null)
         .II(II10("㋓㋄㊤㊀㌮㍄㌸㌎㏧", 12946), "", 23, null)
         .II(II10("㋁㋺㊘", 12946), "", 24, null)
         .II(II10("㋁㋔㊤㋏\u321fⷾ", 12946), "", 25, null)
         .II(II10("㋓㋄㊤㊀㌮㍃㌩㌜㏋㏊㎫㎈㑳㑋㐰", 12946), IIo.IIO_ ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 26, null)
         .II(II10("㋃㋄㊱㊖㌮㍁ⷭ㌂", 12946), "", 300, null)
         .II(this)
         .I__0();
   }

   public void I_1_() {
      Il1_.II()
         .III()
         .II(II10("㋁㋔㊤㊛㍧㍃㌫", 12946))
         .II(II10("㋆Ⱡ㊳㋏\u321fⷴ㍬㌌㏫㏄㎭", 12946), II10("㋉", 12946) + this.I1I_ + II10("㋿㋂㊍", 12946), 30, null)
         .II(II10("㋆Ⱡ㊳㋏\u321fⷴ㍬㌈㏢ⴈ㎱", 12946), II10("㋉", 12946) + this.I1IO + II10("㋡㋬", 12946), 31, null)
         .II(II10("㋖㋔㊼㊎㍷㌍㌔㌆㏫㏙", 12946), II10("㋉", 12946) + IlO_.I__O + II10("㋿㋂㊍", 12946), 32, null)
         .II(II10("㋖㋔㊼㊎㍷㌍㌹㌘㏯㎉㎫㎆㑶㑖㐱㐏㓧", 12946), II10("㋉", 12946) + IlO_.IllI + II10("㋿㋂㊍", 12946), 33, null)
         .II(II10("㋕㋘ⱳ㊆㌮㍮㌭㌛㏩㏁㎩", 12946), this.II_1 ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 34, null)
         .II(II10("㎂Ɫ㋰㊇㍡ⶌ㍬㌟㏢ⴌ㎸", 12946), IIoo.II1l() ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 35, null)
         .II(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㋙ⴠ㐦㑑⪩", 12946), this.IlOl ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 36, null)
         .II(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㎻㉗㐦㑕㐬⪆", 12946), this.IlO1 ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 37, null)
         .II(II10("㋆㋙㈤㊁㍩㌍㌮㎊㏥㎉㎪㎈㑵㑖", 12946), IIol.Il_I ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 38, null)
         .II(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㎸㎋㑧㑜㐡㐑", 12946), this.Il_o ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 39, null)
         .II(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㎛㎬㑎", 12946), this.IlO ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 40, null)
         .II(II10("㋑㋐㊠㊜㍻㍁㌩㍋㏨㏈㎱", 12946), IlO_.Ilo_ ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 41, null)
         .II(II10("㎐㋟㋰㏾㏷㌍㌫㎋", 12946), IlO_.Ilol ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 42, null)
         .II(II10("㋊㋞㈱㋏㍠㍊㋼ⶶ㏣", 12946), this.IlO_ ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946), 43, null)
         .II(II10("㋙㋔㊩㋏㍍㍌㌼㌈㏢㏈", 12946), "", 44, null)
         .II(II10("㋃㋄㊱㊖㌮㍁ⷭ㌂", 12946), "", 99, null)
         .II(this)
         .I__0();
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            IlO_.I_oo();
            break;
         case 2:
            III_.III().II_I();
            break;
         case 3:
            IIO0.III().II_I();
            break;
         case 4:
            II1I.III().II_I();
            break;
         case 5:
            II_O.III().II_I();
            break;
         case 6:
            II0l.III().II_I();
            break;
         case 7:
            IIl1.III().II_I();
            break;
         case 8:
            IIO.III().II_I();
            break;
         case 9:
            this.I_1_();
            break;
         case 10:
            this.I_11();
            break;
         case 20:
            IIlo.III().II_I();
            break;
         case 21:
            II10.III().II_I();
            break;
         case 22:
            this.IlOO = true;
            this.IIIl(II10("㋙㋘㊼㊃㌮㍙ⷯ㌅㎪㏝㎠㌅㑨", 12946));
            break;
         case 23:
            IIlO.III().II_I();
            break;
         case 24:
            IIOl.III().II_I();
            break;
         case 25:
            Il1I.III().II_I();
            break;
         case 26:
            IIo.IIO_ = !IIo.IIO_;
            this.IIIl(II10("㋓㋄㊤㊀㌮㍃㌩㌜㏋㏊㎫㎈㑳㑋㐰㑙㒢", 12946) + (IIo.IIO_ ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.I_11();
            break;
         case 30:
            this.III(II10("㋜㋙ⱽ㊟㌮㍙\u2d9d㌈㎪㊸ⴑ㏇㑡㑄㐩㐆㒢㒉㓵㓲㓏㔭㔌㔶㔉㖰", 12946), II10("㋕㋐㊽㊊㌮㍾㌼㌎㏯㏍", 12946));
            break;
         case 31:
            this.III(II10("㋜㋙ⱽ㊟㌮㍙\u2d9d㌈㎪㊸ⴑ㏇㑥㑍⫥㐚㒢㒉㓱㓲㓌㔭㔕", 12946), II10("㋟㋞㊦㊊㌮㍾㌼㌎㏯㏍", 12946));
            break;
         case 32:
            this.III(II10("㋜㋙ⱽ㊟㌮㍉㌩㌇㏫㏐㏨㎿㑫㑄㐴㑃㒪㒔㓰㓯㓓㔮㔌㕫㕊㗴㗋㗾", 12946), II10("㋖㋔㊼㊎㍷㌍㌔㌆㏫㏙", 12946));
            break;
         case 33:
            this.III(II10("㋜㋙ⱽ㊟㌮㍉㌩㌇㏫㏐㏨㎄㑧㑕㐷㐖㓮㓄㓠㓷㓋㔭㔌㕶㕉㖩㖈㗧㖛㙦㘝", 12946), II10("㋖㋔㊼㊎㍷㌍㌏㌊㏺㏚㎽㎋㑣", 12946));
            break;
         case 34:
            this.II_1 = !this.II_1;
            this.IIIl(II10("㋕㋘ⱳ㊆㌮㍮㌭㌛㏩㏁㎩㏝㐦", 12946) + (this.II_1 ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 35:
            IIoo.IIIl(!IIoo.II1l());
            this.IIIl(II10("㎂Ɫ㋰㊇㍡ⶌ㍬㌟㏢ⴌ㎸㏝㐦", 12946) + (IIoo.II1l() ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 36:
            this.IlOl = !this.IlOl;
            this.IIIl(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㋙ⴠ㐦㑑⪩㑙㒢", 12946) + (this.IlOl ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 37:
            this.IlO1 = !this.IlO1;
            this.IIIl(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㎻㉗㐦㑕㐬⪆㒸㒁", 12946) + (this.IlO1 ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 38:
            IIol.Il_I = !IIol.Il_I;
            this.IIIl(II10("㋆㋙㈤㊁㍩㌍㌮㎊㏥㎉㎪㎈㑵㑖㑾㑃", 12946) + (IIol.Il_I ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 39:
            this.Il_o = !this.Il_o;
            this.IIIl(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㎸㎋㑧㑜㐡㐑㒸㒁", 12946) + (this.Il_o ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 40:
            this.IlO = !this.IlO;
            this.IIIl(II10("㋆㋙㈤㊁㍩㌍㌸㌂㏤㎉㎛㎬㑎㐟㑤", 12946) + (this.IlO ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 41:
            IlO_.Ilo_ = !IlO_.Ilo_;
            this.IIIl(II10("㋑㋐㊠㊜㍻㍁㌩㍋㏨㏈㎱㏝㐦", 12946) + (IlO_.Ilo_ ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 42:
            IlO_.Ilol = !IlO_.Ilol;
            this.IIIl(II10("㎐㋟㋰㏾㏷㌍㌫㎋㎰㎉", 12946) + (IlO_.Ilol ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 43:
            this.IlO_ = !this.IlO_;
            this.IIIl(II10("㋊㋞㈱㋏㍠㍊㋼ⶶ㏣㎓㏨", 12946) + (this.IlO_ ? II10("㋐Ⱌ㊤", 12946) : II10("㋆Ⱎ㊤", 12946)));
            this.IIOl();
            this.I_1_();
            break;
         case 44:
            II.I_lI();
            break;
         case 99:
            this.I_1l();
            break;
         case 300:
            this.I_1l();
      }
   }

   @Override
   public void II(String var1, String var2) {
      String var3 = Ilo_.II().II.IIl1();
      if (var3 != null && !var3.equals("") && var1 != null && !var1.equals("")) {
         String var4 = Ilo_.II().II00;
         if (var4.equals(II10("㋜㋙ⱽ㊟㌮㍙\u2d9d㌈㎪㊸ⴑ㏇㑡㑄㐩㐆㒢㒉㓵㓲㓏㔭㔌㔶㔉㖰", 12946))) {
            this.II1(var3);
         } else if (var4.equals(II10("㋜㋙ⱽ㊟㌮㍙\u2d9d㌈㎪㊸ⴑ㏇㑥㑍⫥㐚㒢㒉㓱㓲㓌㔭㔕", 12946))) {
            this.II1I(var3);
         } else if (var4.equals(II10("㋜㋙ⱽ㊟㌮㍉㌩㌇㏫㏐㏨㎿㑫㑄㐴㑃㒪㒔㓰㓯㓓㔮㔌㕫㕊㗴㗋㗾", 12946))) {
            this.II1l(var3);
         } else if (var4.equals(II10("㋜㋙ⱽ㊟㌮㍉㌩㌇㏫㏐㏨㎄㑧㑕㐷㐖㓮㓄㓠㓷㓋㔭㔌㕶㕉㖩㖈㗧㖛㙦㘝", 12946))) {
            this.II11(var3);
         }
      } else {
         this.Illl();
      }
   }

   @Override
   public void Illl() {
      Ilo_.II().I_10 = false;
      this.I_1_();
      II.II.I__0();
   }

   private void II1(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         if (var2 < 5) {
            var2 = 5;
         }

         if (var2 > 100) {
            var2 = 100;
         }

         this.I1I_ = var2;
         this.IIIl(II10("㋆Ⱡ㊳㋏\u321fⷴ㍬㌌㏫㏄㎭㏝㐦", 12946) + this.I1I_ + II10("㋿㋂", 12946));
         this.IIOl();
      } catch (NumberFormatException var3) {
         this.IIIl(II10("㋕㋘㈱㋏㍺㍟ⶇ㍋㏡㏁㌼㎉㑡㐅㐬⪀㓲㒁㒬⨘", 12946));
      }

      this.Illl();
   }

   private void II1I(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         if (var2 < 1) {
            var2 = 1;
         }

         if (var2 > 20) {
            var2 = 20;
         }

         this.I1IO = var2;
         this.IIIl(II10("㋆Ⱡ㊳㋏\u321fⷴ㍬㌈㏢ⴈ㎱㏝㐦", 12946) + this.I1IO);
         this.IIOl();
      } catch (NumberFormatException var3) {
         this.IIIl(II10("㋕㋘㈱㋏㍺㍟ⶇ㍋㏡㏁㌼㎉㑡㐅㐬⪀㓲㒁㒬⨘", 12946));
      }

      this.Illl();
   }

   private void II1l(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         if (var2 < 500) {
            var2 = 500;
         }

         if (var2 > 3000) {
            var2 = 3000;
         }

         IlO_.I__O = var2;
         this.IIIl(II10("㋖㋔㊼㊎㍷㌍㌔㌆㏫㏙㏲㏇", 12946) + IlO_.I__O + II10("㋿㋂", 12946));
         this.IIOl();
      } catch (NumberFormatException var3) {
         this.IIIl(II10("㋕㋘㈱㋏㍺㍟ⶇ㍋㏡㏁㌼㎉㑡㐅㐬⪀㓲㒁㒬⨘", 12946));
      }

      this.Illl();
   }

   private void II11(String var1) {
      try {
         long var2 = Long.parseLong(var1);
         if (var2 < 500L) {
            var2 = 500L;
         }

         if (var2 > 5000L) {
            var2 = 5000L;
         }

         IlO_.IllI = var2;
         this.IIIl(II10("㋖㋔㊼㊎㍷㌍㌯㌊㏺㏚㎽㎋㑣㐟㑤", 12946) + IlO_.IllI + II10("㋿㋂", 12946));
         this.IIOl();
      } catch (NumberFormatException var4) {
         this.IIIl(II10("㋕㋘㈱㋏㍺㍟ⶇ㍋㏡㏁㌼㎉㑡㐅㐬⪀㓲㒁㒬⨘", 12946));
      }

      this.Illl();
   }

   private void III(String var1, String var2) {
      II.II.I__o();
      Ilo_.II().II00 = var1;
      Ilo_.II().II.II1o = var2;
      Ilo_.II().II1o("");
      Ilo_.II().II = this;
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   private void IIOI() {
      this.I1I_ = IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏍㏈㎥㎂㑕㑕㐡㐆㓦", 12946), 20);
      if (this.I1I_ < 5) {
         this.I1I_ = 5;
      }

      if (this.I1I_ > 100) {
         this.I1I_ = 100;
      }

      this.I1IO = IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏇㏆㎾㎂㑕㑕㐡㐆㓦", 12946), 5);
      if (this.I1IO < 1) {
         this.I1IO = 1;
      }

      if (this.I1IO > 20) {
         this.I1IO = 20;
      }

      IlO_.I__O = IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏎㏌㎤㎆㑿㑽㐩㐂㓲", 12946), 500);
      if (IlO_.I__O < 500) {
         IlO_.I__O = 500;
      }

      if (IlO_.I__O > 3000) {
         IlO_.I__O = 3000;
      }

      IlO_.IllI = IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏎㏌㎤㎆㑿㑰㐷㐆㓁㓀㒰㒬㒋㕱㕙", 12946), (long)500L);
      if (IlO_.IllI < 500L) {
         IlO_.IllI = 500L;
      }

      if (IlO_.IllI > 5000L) {
         IlO_.IllI = 5000L;
      }

      this.I1I1 = IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏍㏛㎩㎗㑮㑌㐧㐐", 12946), 5);
      if (this.I1I1 < 1) {
         this.I1I1 = 1;
      }

      if (this.I1I1 > 5) {
         this.I1I1 = 5;
      }

      this.IlOl = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏞㏽㎌㎳", 12946), false);
      this.IlO1 = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏞㏽㎛㎷", 12946), false);
      this.Il_o = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏙㏁㎧㎐㑅㑍㐥㐑㓱㓨㒮㒒㒟㕭", 12946), false);
      this.II_1 = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏁㏁㎧㎆", 12946), false);
      this.IlO_ = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏒㏆㎩㎩㑡㑐㐫㐊", 12946), false);
      IlO_.Ilo_ = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏟㏚㎭㎩㑩㑗㐩㐂㓮㓢㒡㒯㒍㕨㕐㔾", 12946), true);
      IlO_.Ilol = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏏㏈㎼㎤㑮㑌㐧㐈㓧㓏", 12946), true);
      IIol.Il_I = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏙㏁㎧㎐㑄㑊㐷㐐", 12946), false);
      this.IlO = IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏙㏁㎧㎐㑕㑮㐌", 12946), false);
   }

   private void IIOl() {
      IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏍㏈㎥㎂㑕㑕㐡㐆㓦", 12946), this.I1I_);
      IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏇㏆㎾㎂㑕㑕㐡㐆㓦", 12946), this.I1IO);
      IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏎㏌㎤㎆㑿㑽㐩㐂㓲", 12946), IlO_.I__O);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏎㏌㎤㎆㑿㑰㐷㐆㓁㓀㒰㒬㒋㕱㕙", 12946), (long)IlO_.IllI);
      IlIO.III(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏍㏛㎩㎗㑮㑌㐧㐐", 12946), this.I1I1);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏞㏽㎌㎳", 12946), this.IlOl);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏞㏽㎛㎷", 12946), this.IlO1);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏙㏁㎧㎐㑅㑍㐥㐑㓱㓨㒮㒒㒟㕭", 12946), this.Il_o);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏁㏁㎧㎆", 12946), this.II_1);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏒㏆㎩㎩㑡㑐㐫㐊", 12946), this.IlO_);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏟㏚㎭㎩㑩㑗㐩㐂㓮㓢㒡㒯㒍㕨㕐㔾", 12946), IlO_.Ilo_);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏏㏈㎼㎤㑮㑌㐧㐈㓧㓏", 12946), IlO_.Ilol);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏙㏁㎧㎐㑄㑊㐷㐐", 12946), IIol.Il_I);
      IlIO.II(II10("㋟㋐㊹㊁㍃㍂㌨㍅㏙㏁㎧㎐㑕㑮㐌", 12946), this.IlO);
   }
}
