package main;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

public final class IOoO {
   private final IO0 II11;
   private final IOo_ II1l;
   private IOO.III1 II;
   private IOO.III_[][] II;
   private boolean lII_;

   IOoO(IO0 var1, IOo_ var2) {
      this.II11 = var1;
      this.II1l = var2;
   }

   synchronized void Il11(int var1) {
      Vector var2 = IOO.IIII(var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         IOO.III1 var4 = (IOO.III1)var2.elementAt(var3);
         if (var4.IoI_ == 0 || var4.IoI_ == 3) {
            this.II(var4);
            return;
         }
      }

      this.II11.IIIl.IIol(I10("덝귐댽덛돲덙뎶뎐됶둛뒴됊뒲듒뒸땟땯딍둝듛ꭩ뗊뗨떏꣑똅똰똑ꡡ", 45854));
   }

   synchronized void II(IOO.III1 var1) {
      this.II11.II.IoO = false;
      this.lII_ = false;
      this.II = var1;
      int var2 = this.II11.II.lOlI;
      IO0o var3 = new IO0o(-44).II(var1.IoI_ == 3 ? 3 : 0).II(var1.II.length);
      this.II = new IOO.III_[var1.II.length][];

      for (int var4 = 0; var4 < var1.II.length; var4++) {
         IOO.III0 var5 = var1.II[var4];
         Vector var6 = new Vector();

         for (int var7 = 0; var7 < var5.II.length; var7++) {
            IOO.III_ var8 = var5.II[var7];
            IOO.III var9 = IOO.II(var8.l0o1);
            if (var9 != null && var8.Io1_ && (var9.lOlI >= 3 || var9.lOlI == var2)) {
               if (IO0l.II0_(var8.l0o1) && !I10("덍덵댓댫독돽뎗뎾둉둱됝됶듟", 45854).equals(var1.lIlO)) {
                  IOO.III_ var10 = new IOO.III_();
                  var10.l0o1 = var8.l0o1;
                  var10.Io1_ = var8.Io1_;
                  var10.Io1O = var8.Io1O;
                  var10.l0o0 = var8.l0o0;
                  var10.l0oO = 0;
                  var10.l0o_ = 100000000;
                  if (var1.IoI_ == 3) {
                     IOO.III var11 = IOO.II(76);
                     if (var11 != null) {
                        var10.l0o0 = var11.lOo0;
                     }
                  }

                  Vector var18 = new Vector();

                  for (int var12 = 0; var8.II10 != null && var12 < var8.II10.length; var12++) {
                     if (var8.II10[var12][0] != 31) {
                        var18.addElement(var8.II10[var12]);
                     }
                  }

                  var18.addElement(new int[]{31, 20});
                  var10.II10 = new int[var18.size()][];
                  var18.copyInto(var10.II10);
                  var8 = var10;
               }

               var6.addElement(var8);
            }
         }

         this.II[var4] = new IOO.III_[var6.size()];
         var6.copyInto(this.II[var4]);
         var3.II(var5.II1o).II(this.II[var4].length);

         for (int var13 = 0; var13 < this.II[var4].length; var13++) {
            IOO.III_ var14 = this.II[var4][var13];
            var3.III(var14.l0o1);
            if (var1.IoI_ == 3) {
               var3.III(var14.l0o0).IIII(var14.l0o_);
            } else if (var14.l0oO == 0) {
               var3.IIII(var14.l0o_).IIII(0);
            } else {
               var3.IIII(0).IIII(var14.l0o_);
            }

            int[][] var15 = var14.II10;
            if (var1.lIlO != null && var1.lIlO.startsWith(I10("덜덨댝댤", 45854))) {
               long var16 = this.II11.II.IIII(var14.l0o1);
               if (var16 >= 1440L) {
                  var15 = new int[][]{{63, (int)(var16 / 1440L)}};
               } else if (var16 >= 60L) {
                  var15 = new int[][]{{64, (int)(var16 / 60L)}};
               } else if (var16 > 0L) {
                  var15 = new int[][]{{65, (int)var16}};
               }
            }

            var3.II(var15.length);

            for (int var17 = 0; var17 < var15.length; var17++) {
               var3.II(var15[var17][0]).III(var15[var17][1]);
            }

            var3.II(var14.Io1O ? 1 : 0);
            var3.II(0);
         }
      }

      this.II1l.II(var3);
   }

   synchronized void l1o_() {
      this.II11.II.IoO = false;
      this.lII_ = true;
      this.II = null;
      IOol var1 = this.II11.II;
      Vector[] var2 = new Vector[]{new Vector(), new Vector(), new Vector()};
      int[] var3 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 21, 22, 23};

      for (int var4 = 0; var4 < var3.length; var4++) {
         int var5 = var3[var4];
         IOO.IIIO var6 = IOO.II(var5, 1);
         if (var6 != null && (var6.l0oo == var1.lOlI || var5 == 19)) {
            int var7 = 0;

            for (int var8 = 0; var8 < var1.I__l.length; var8++) {
               IOO.IIIO var9 = IOO.II(var1.I__l[var8]);
               if (var9 != null && var9.lO0I == var5) {
                  var7 = var9.l1__;
                  break;
               }
            }

            if (var7 < IOO.IIO1(var5)) {
               IOO.III var14 = IOO.II(var5, var7 + 1);
               if (var14 != null) {
                  int var16 = var5 != 0 && var5 != 2 && var5 != 4 ? (var5 != 1 && var5 != 3 && var5 != 5 ? 2 : 1) : 0;
                  var2[var16].addElement(var14);
               }
            }
         }
      }

      String[] var10 = new String[]{I10("덍돜댿댓뎐돯댭", 45854), I10("덍돜댿댓뎐돺뎰뉇\uaac9둛됳", 45854), I10("덍돜댿댓뎐늩굯뎔됶둗됽ꪴ듦", 45854)};
      IO0o var11 = new IO0o(-44).II(1).II(3);

      for (int var12 = 0; var12 < 3; var12++) {
         var11.II(var10[var12]).II(var2[var12].size());

         for (int var13 = 0; var13 < var2[var12].size(); var13++) {
            IOO.III var15 = (IOO.III)var2[var12].elementAt(var13);
            IOO.IIIO var17 = IOO.II(IOO.II(var15), IOO.III(var15));
            var11.III(var15.I1l).II(var17 == null ? 0L : var17.I101);
            var11.II(0).II(0).II(0);
         }
      }

      this.II1l.II(var11);
   }

   private void II(IOO.III_ var1) {
      IOol var2 = this.II11.II;
      int var3 = var1.l0o_;
      IOO.III var4 = IOO.II(var1.l0o1);
      if (var2._1IO < var3) {
         this.II11.IIIl.IIol(I10("덕덕뎨댕돽뎙닉괐됶딤됽ꪰ듿뒑뒣ꨞ딮땆딥ꮬ뗤떉듙ꬤ똦뙈똱똂뚢뛗ꡭ뚫뛞띭띔꧲뜗랹럖뜷랏렴", 45854));
      } else {
         IO0l var5 = new IO0l(var1.l0o1, 1);

         for (int var6 = 0; var1.II10 != null && var6 < var1.II10.length; var6++) {
            var5.III(var1.II10[var6][0], var1.II10[var6][1]);
         }

         if (!this.II11.IIIl.III0(var5)) {
            this.II11.IIIl.IIol(I10("덖돝댲댓뎺돍뎪뎖둸둒둴땢둱뒑뗁ꩈ땷", 45854));
         } else {
            var2._1IO -= var3;
            this.II11.IIIl.l1_l();
            this.II11
               .IIIl
               .IIol(I10("눎돞덼뉪굏돐돸", 45854) + (var4 == null ? I10("덨궐댨덛돪돑굱뎚", 45854) : var4.II1o) + I10("댾덟귭댕돽뎙", 45854) + var3 + I10("댾눬댵궸돷뎙뎫괆됶둞됽ꪴ듼뒟", 45854));
            this.II11.I__O();
         }
      }
   }

   synchronized void II_l(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      short var3 = var1.readShort();
      IOol var4 = this.II11.II;
      if (!this.II11.II.IIlo(var2, var3)) {
         if (this.lII_) {
            this.I111(var3);
         } else if (this.II != null && this.II != null) {
            IOO.III_ var5 = null;
            int var6 = 0;

            for (int var7 = 0; var7 < this.II.length && var5 == null; var7++) {
               for (int var8 = 0; var8 < this.II[var7].length; var8++) {
                  if (this.II[var7][var8].l0o1 == var3) {
                     var5 = this.II[var7][var8];
                     var6 = var7;
                     break;
                  }
               }
            }

            if (var5 == null) {
               this.II11.IIIl.IIol(I10("덕덕뎨댕돽뎙뎬뎟\uaad5됕될됛ꩣ듒듰뒇땧ꯪ딢", 45854));
            } else if (I10("덍덼댒댯돛돦뎐뎲둗둱", 45854).equals(this.II.lIlO)) {
               int var14 = I0I1.IIoO(var3);
               if (var14 < 0) {
                  this.II11.IIIl.IIol(I10("덕덕뎨댕돽뎙뎬뎟\uaad5됕될됛ꩣ듒듰뒇땧ꯪ딢", 45854));
               } else {
                  var4.I0 = var14;
                  this.II11.ll__();
                  this.II11.ll_0();
                  this.II11.IIIl.IIol(I10("눎귨댵덛돱돐괛뎂됶둁뒧됐뒲듅뒸됏땠땅땬딈땾뗇떯", 45854));
                  this.II11.I__O();
               }
            } else if ((var3 == 1703 || var3 == 1717) && !this.II11.IIIl.Il0O()) {
               this.II11.IIIl.IIol(I10("덓궚댱덛늋덚돸뎟ꪩ둁둴됛ꨳ듟듼듏땥땅떸딅뗭떉떼떏ꣅ똅똣똊뛣뚁뚨\ua87e뚐", 45854));
            } else if ((var3 == 1703 || var3 == 1717) && var4._111 >= 5) {
               this.II11.IIIl.IIol(I10("덓귪댵덛돮덙뎱돗둽둝됻\uaad0듼뒑뒳뒇ꯇ딍둝듛ꭩ뗊뗨떊뙳뙄뙤똗ꡓ뛈뛠럎뚟뜽뜉띻뜖ꤾ럖럷랱롼롕롳렚\ua630룞룯뢃Ɦ륁", 45854));
            } else {
               String var13 = this.II.lIlO == null ? "" : this.II.lIlO;
               if (var13.equals(I10("덍덼댒댯돛돦뎜뎶둘둽됋됻듛듴뒅", 45854))) {
                  this.II11.II.II1I(var6, var3);
               } else if (var13.equals(I10("덍덵댓댫독돺뎔뎶둘", 45854))) {
                  this.IIII(var5);
               } else if (var13.equals(I10("덍덵댓댫독돽뎗뎾둉둱됝됶듟", 45854))) {
                  this.II(var5);
               } else if (var13.equals(I10("덏덹댘댵", 45854))) {
                  this.II11.IIIl.IIol(I10("덝귐댽덛돲덙뎶뎐됶둛뒴됊뒲떠ꨅ뒆딮땏\uabfd딅뗭떉듙떎ꣅ뙈뙤또ꡳ뚁뚫뚶꠹띳뜐띻뜉ꥨ래랼랟ꛒ롚롳렚룸ꙷ뢡룎륮륄룻뤋릩맅ꜘ", 45854));
               } else if (var13.equals(I10("덜덴댐댷", 45854))) {
                  this.IIIl(var5);
               } else if (var3 == 988) {
                  if (var4.IOO_ >= 5000000000L) {
                     this.II11.IIIl.II0o(I10("덙더궇댒뎺돑굹뎙됶둃뒴됝듵뒑뗁됌딮됼꯭딟떪뗝\uab19떎똦뜴똥뙃뚷뚁뚴꠨", 45854));
                  } else if (this.II(var5)) {
                     this.III(var5);
                     var4.IOO_ = Math.min(5000000000L, var4.IOO_ + 1000000000L);
                     this.II11.IIIl.l1_();
                     this.II11.IIIl.IIol(I10("덓귢덼댉굃돗뎿돗둢듏됽둓들둑뒾뒈딮땙딤떋뗤뗁뗨떄뛲뙋똣뙂뚢뛦뚩ꠄ뚗뜽띔ꧺ뜔랹럎뜷래롲렎롳", 45854) + var4.IOO_ / 1000000000L + I10("댾덉궫", 45854));
                     this.II11.I__O();
                  }
               } else if (this.II(var5)) {
                  IOO.III var15 = IOO.II(var3);
                  if (var15 != null && var15.IoI_ == 13 && this.II.lIlO != null && this.II.lIlO.startsWith(I10("덜덨댝댤", 45854))) {
                     int var18 = this.II.lIlO.equals(I10("덜덨댝댤뎫돱", 45854)) ? 60 : (this.II.lIlO.equals(I10("덜덨댝댤뎢돱", 45854)) ? 480 : 43200);
                     if (!var4.II1_(var3, var18)) {
                        this.II11.IIIl.IIol(I10("덜도댽덛돴덙뎡돗둵둝뗤됒뒲떠땠ꨌ땭딍딤ꮼ떪뗝떺ꬄ똦꣺뙤똁ꠡ뛏뛠뚰뚘띻띐뜲뜔럼", 45854));
                     } else {
                        this.III(var5);
                        this.II11.IIIl.l1_l();
                        this.II11.IIIl.l1_();
                        this.II11.IIIl.IIol(I10("덓덈댽덛돮돑댸뎙둾됕됷뒇듼듖듰", 45854) + var15.II1o);
                        this.II(this.II);
                        this.II11.I__O();
                     }
                  } else if (var3 != 517 && var3 != 518) {
                     if (var3 == 543) {
                        IO0l var16 = this.IIIl(543);
                        if (var16 != null) {
                           int var21 = -1;

                           for (int var22 = 0; var22 < var16.IIl.size(); var22++) {
                              if (((int[])var16.IIl.elementAt(var22))[0] == 12) {
                                 var21 = var22;
                              }
                           }

                           if (var21 >= 0) {
                              ((int[])var16.IIl.elementAt(var21))[1]++;
                           } else {
                              var16.III(12, 1);
                           }

                           this.III(var5);
                           this.II11.IIIl.l1_l();
                           this.II11.IIIl.l1_1();
                           this.II11.IIIl.l1_();
                           this.II11.IIIl.IIol(I10("덓덈댽덛돮돑댸뎙둾됕됷뒇듼듖듰", 45854) + (var15 == null ? "" : var15.II1o));
                           this.II11.I__O();
                           return;
                        }
                     }

                     IO0l var17 = new IO0l(var3, 1);

                     for (int var10 = 0; var10 < var5.II10.length; var10++) {
                        var17.III(var5.II10[var10][0], var5.II10[var10][1]);
                     }

                     if (var3 == 543) {
                        boolean var19 = false;

                        for (int var11 = 0; var11 < var17.IIl.size(); var11++) {
                           int[] var12 = (int[])var17.IIl.elementAt(var11);
                           if (var12[0] == 12) {
                              var19 = true;
                              if (var12[1] == 0) {
                                 var12[1] = 1;
                              }
                           }
                        }

                        if (!var19) {
                           var17.III(12, 1);
                        }
                     }

                     if (!this.II11.IIIl.III0(var17)) {
                        this.II11.IIIl.IIol(I10("덖돝댲댓뎺돍뎪뎖둸둒둴땢둱뒑뗁ꩈ땷", 45854));
                     } else {
                        if (var3 == 1703 || var3 == 1717) {
                           var4._111++;
                        }

                        this.III(var5);
                        this.II11.IIIl.l1_l();
                        this.II11.IIIl.l1_();
                        IOO.III var20 = IOO.II(var3);
                        this.II11.IIIl.IIol(I10("덓덈댽덛돮돑댸뎙둾됕됷뒇듼듖듰", 45854) + (var20 == null ? "" : var20.II1o));
                        this.II11.I__O();
                     }
                  } else if (!this.II11.IIIl.Il00()) {
                     this.II11.IIIl.IIol(I10("덖돝댲댓뎺돍뎪뎖둸둒둴땢둱뒑뗁ꩈ땷", 45854));
                  } else if (!var4.II(var3 == 517)) {
                     this.II11.IIIl.II0o(var3 == 517 ? I10("덖돝댲댓뎺돍뎪뎖둸둒둴됐ꩵ듐듰뒍ꮯ땃땬둺땩떉듙ꭆ뙲똅똰ꢲ뛫뚁럑뚾", 45854) : I10("덌늍닽댕돽뎙닉괤됶둖ꪳ됒뒲듓ꩱ뒁딮됼떯땋뒛\uab08떼뗇뙲ꣴ똭뙃랓뛀", 45854));
                  } else {
                     this.III(var5);
                     this.II11.IIIl.IIol(var3 == 517 ? I10("덓귢덼댉굃돗뎿돗둢둝뒴됝듺뒑뒳됛땠땊땬땚떪땝뗨떏뛦뙋똬뙃뛶뛓뚡뚱뚙", 45854) : I10("덓귢덼댉굃돗뎿돗둢둝뒴됝듺뒑뒳됛땠땊땬땚떪땝뗨떕랶랄똪똄뚢랰ꠓ", 45854));
                     if (var3 == 517) {
                        this.II11.IIIl.l1_l();
                     } else {
                        this.II11.IIIl.l1_O();
                     }

                     this.II11.IIIl.l1_();
                     IOO.III var9 = IOO.II(var3);
                     this.II11.IIIl.IIol(I10("덓덈댽덛돮돑댸뎙둾됕됷뒇듼듖듰", 45854) + (var9 == null ? "" : var9.II1o));
                     this.II11.I__O();
                  }
               }
            }
         }
      }
   }

   private static int IIol(int var0) {
      IOO.I___();
      if (IOO.II == null) {
         return -1;
      }

      for (int var1 = 0; var1 < IOO.II.length; var1++) {
         if (IOO.II[var1] != null && IOO.II[var1].lOo0 == var0) {
            return IOO.II[var1].I1l;
         }
      }

      return -1;
   }

   private int IIo1(int var1) {
      int var2 = 0;
      IO0l[] var3 = this.II11.II.III;

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (!var3[var4].II1_() && var3[var4].I1l == var1) {
            var2 += var3[var4].lo0I;
         }
      }

      return var2;
   }

   private void II01(int var1, int var2) {
      IO0l[] var3 = this.II11.II.III;

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

   private IO0l IIIl(int var1) {
      IOol var2 = this.II11.II;

      for (int var3 = 0; var3 < var2.III.length; var3++) {
         if (!var2.III[var3].II1_() && var2.III[var3].I1l == var1) {
            return var2.III[var3];
         }
      }

      for (int var4 = 0; var4 < var2.II.length; var4++) {
         if (var2.II[var4] != null && !var2.II[var4].II1_() && var2.II[var4].I1l == var1) {
            return var2.II[var4];
         }
      }

      return null;
   }

   private boolean II(IOO.III_ var1) {
      IOol var2 = this.II11.II;
      if (this.II.IoI_ == 3) {
         int var3 = IIol(var1.l0o0);
         if (var3 < 0) {
            this.II11.IIIl.IIol(I10("덝귐댽덛돲덙뎶뎐됶둆ꪥ둓듹듘ꨗ뒁딮땃떬딒떪뗁떡ꬠ뙨똅똧똋뜲뛀뛠뚲ꠡ", 45854));
            return false;
         }

         if (var3 != 76 && var3 != 188 && var3 != 189 && var3 != 190) {
            if (var3 == 77) {
               if (var2.lOoO < var1.l0o_) {
                  this.II11.IIIl.IIol(I10("덜궜댲덛돑돑댬뎙둱됕땄ꪔ뒲듿뒷ꨢ땭딍둜ꮨ떪뗤떽떆똦뙳꣩똗뚢뛱뚨꡶뚓", 45854));
                  return false;
               } else {
                  return true;
               }
            } else if (var3 != 861) {
               IOO.III var4 = IOO.II(var3);
               String var5 = var4 == null ? I10("덨궐댨덛돪돑굱뎚", 45854) : var4.II1o;
               int var6 = this.IIo1(var3);
               if (var6 == 0) {
                  this.II11.IIIl.IIol(I10("덕덕뎨댕돽뎙뎬댛둻됕될됛\uaa37듈듰", 45854) + var5);
                  return false;
               } else if (var6 < var1.l0o_) {
                  this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕됷뒀뒲떠\uaa37듏", 45854) + var1.l0o_ + I10("댾", 45854) + var5);
                  return false;
               } else {
                  return true;
               }
            } else if (var2._lO < var1.l0o_) {
               this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕됷뒀뒲떠\uaa37듏땠땊ꮁ딈", 45854));
               return false;
            } else {
               return true;
            }
         } else if (var2.Il11 < var1.l0o_) {
            this.II11.IIIl.IIol(I10("덜궜댲덛돑돑댬뎙둱됕땄ꪔ뒲듧됰뒁땩딍둜ꮨ떪뗤떽떆똦뙳꣩똗뚢뛱뚨꡶뚓", 45854));
            return false;
         } else {
            return true;
         }
      } else if (var1.l0oO == 2) {
         if (var2._lO < var1.l0o_) {
            this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕됷뒀뒲떠\uaa37듏땠땊ꮁ딈", 45854));
            return false;
         } else {
            return true;
         }
      } else if (var1.l0oO == 0) {
         if (var2.Il11 < var1.l0o_) {
            this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕됷뒀뒲떠\uaa37듏땸뗍딢딌", 45854));
            return false;
         } else {
            return true;
         }
      } else if (var2.lOoO < var1.l0o_) {
         this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕됷뒀뒲떠\uaa37듏땠땊ꮁ딈", 45854));
         return false;
      } else {
         return true;
      }
   }

   private void III(IOO.III_ var1) {
      IOol var2 = this.II11.II;
      if (this.II.IoI_ != 3) {
         if (var1.l0oO == 2) {
            var2._lO = var2._lO - var1.l0o_;
         } else if (var1.l0oO == 0) {
            var2.Il11 = var2.Il11 - var1.l0o_;
         } else {
            var2.lOoO = var2.lOoO - var1.l0o_;
         }
      } else {
         int var3 = IIol(var1.l0o0);
         if (var3 == 76 || var3 == 188 || var3 == 189 || var3 == 190) {
            var2.Il11 = var2.Il11 - var1.l0o_;
         } else if (var3 == 77) {
            var2.lOoO = var2.lOoO - var1.l0o_;
         } else if (var3 == 861) {
            var2._lO = var2._lO - var1.l0o_;
         } else if (var3 >= 0) {
            this.II01(var3, var1.l0o_);
         }
      }
   }

   private static int IIo_(int var0) {
      switch (var0) {
         case 987:
         case 1204:
         case 1423:
         case 1438:
         case 1439:
         case 1635:
         case 1794:
            return 1;
         case 1541:
         case 1550:
         case 1551:
         case 1563:
         case 1573:
         case 1620:
         case 1629:
         case 1630:
         case 1631:
         case 1668:
         case 1682:
         case 1683:
         case 1714:
         case 1724:
         case 1727:
         case 1729:
         case 1733:
         case 1734:
         case 1748:
         case 1749:
         case 1750:
            return 50;
         case 1634:
            return 10;
         case 1790:
            return 2;
         case 1791:
            return 3;
         case 1792:
            return 4;
         default:
            return -1;
      }
   }

   private void IIII(IOO.III_ var1) {
      IOol var2 = this.II11.II;
      int var3 = IIo_(var1.l0o1);
      if (var3 <= 0) {
         this.II11.IIIl.IIol(I10("덈궐댨덛돪돑굱뎚됶둛뒴됊뒲듚뒸됛땠땊땬딟뗢꭪뗨떊뙳뙄뙤똁꠳뛏뚧뛿럯띴\ua9ff뜶띚럚럙랧랅론롘렶롒룓룑뢡뢉뤣", 45854));
      } else if (var2._lOO == 0) {
         this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕됷뒀뒲듅뒢뒀땠땊땬딉뗫뗇떯뗇뙮꣼똭뙂", 45854));
      } else if (var2._l0I < var3) {
         this.II11.IIIl.IIol(I10("덜덜댲댜뎺돑괁뎞됶둞됼뒇듼듖듰뗾ꯩ딍둝딂ꭉ뗄뗨떤뙧뙕똷똖뛮뛄뛠뚝뚟띳띛띻뙫\ua95a래랺랃롴렔력ꛟ룥뢐뢿뢆Ꞥ륁륫뤄륩맑맦", 45854));
      } else {
         IO0l var4 = new IO0l(var1.l0o1, 1);

         for (int var5 = 0; var5 < var1.II10.length; var5++) {
            var4.III(var1.II10[var5][0], var1.II10[var5][1]);
         }

         if (!this.II11.IIIl.III0(var4)) {
            this.II11.IIIl.IIol(I10("덖돝댲댓뎺돍뎪뎖둸둒둴땢둱뒑뗁ꩈ땷", 45854));
         } else {
            var2._l0I -= var3;
            this.II11.IIIl.l1_l();
            IOO.III var6 = IOO.II(var1.l0o1);
            this.II11
               .IIIl
               .IIol(
                  I10("눎돞덼뉪굏돐돸", 45854)
                     + (var6 == null ? "" : var6.II1o)
                     + I10("댾덟귭댕돽뎙", 45854)
                     + var3
                     + I10("댾눬댵궸돷뎙뎛뎖둦둆됡됟듷뒑뒒뒎땠땊땬딈\uab6d뗈뗨떅뙧뙋똣뙃뛪\ua878뚩뛱", 45854)
               );
            this.II11.I__O();
         }
      }
   }

   private void IIIl(IOO.III_ var1) {
      IOol var2 = this.II11.II;
      IOO.III var3 = IOO.II(var1.l0o1);
      if (var3 != null) {
         if (!this.II11.IIIl.Il00()) {
            this.II11.IIIl.IIol(I10("덖돝댲댓뎺돍뎪뎖둸둒둴땢둱뒑뗁ꩈ땷딁땬딀뗢땝떦떀똦뙑똬ꢠ뚢뛂뚨꠶뚟뜽띈뜳랐럴랖", 45854));
         } else if (var2.Il11 < var1.l0o_) {
            this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕땅ꪔ뒲듇됰뒁땩딁땬딈땸뗇뗨떓뙮뙌ꣻ똖뚢", 45854) + IO00.IIlI(var1.l0o_ - var2.Il11));
         } else {
            int var4 = -1;
            if (var3.lOl_ == 14) {
               for (int var5 = 0; var5 < var2.III.length; var5++) {
                  IO0l var6 = var2.III[var5];
                  if (!var6.II1_() && var6.I1l >= 663 && var6.I1l <= 667 && var6.lo0I >= 99) {
                     var4 = var5;
                     break;
                  }
               }

               if (var4 < 0) {
                  this.II11.IIIl.IIol(I10("덕덕뎨댕돽뎙뎻댄됶딤ꪳ둓듦듙\uaa39뒌딮됮딢", 45854));
                  return;
               }
            }

            boolean var12 = false;

            for (int var13 = 0; var13 < var2.II.length; var13++) {
               IO0l var7 = var2.II[var13];
               IOO.III var8 = var7 != null && !var7.II1_() ? IOO.II(var7.I1l) : null;
               if (var8 != null && var8.lOl_ == 13) {
                  var12 = true;
                  break;
               }
            }

            if (!var12) {
               this.II11.IIIl.IIol(I10("덕덕뎨댕돽뎙뎻댄됶딤ꪳ둓듡듔뒤듏땺땅꯫딅", 45854));
            } else {
               int var14 = 0;
               if (var3.lOl_ == 14) {
                  int var15 = 1 + (int)(Math.random() * 100.0);
                  if (var15 <= 1) {
                     var14 = 15;
                  } else if (var15 <= 15) {
                     var14 = 11 + (int)(Math.random() * 4.0);
                  } else if (var15 <= 35) {
                     var14 = 7 + (int)(Math.random() * 4.0);
                  } else if (var15 <= 60) {
                     var14 = 4 + (int)(Math.random() * 3.0);
                  } else {
                     var14 = (int)(Math.random() * 4.0);
                  }
               }

               IO0l var16 = new IO0l(var1.l0o1, 1);
               if (var1.II10.length > 0) {
                  for (int var17 = 0; var17 < var1.II10.length; var17++) {
                     int var9 = var1.II10[var17][0];
                     int var10 = var1.II10[var17][1];
                     boolean var11 = var9 == 0 || var9 == 22 || var9 == 23 || var9 == 14 || var9 == 27 || var9 == 28 || var9 == 47;
                     if (var3.lOl_ == 14 && var11 && var14 > 0) {
                        var16.III(var9, var10 + var10 * var14 / 100);
                     } else if (var9 != 164) {
                        var16.III(var9, var10);
                     }
                  }
               } else {
                  var16.III(73, 0);
               }

               var16.III(30, 0);
               if (!this.II11.IIIl.III0(var16)) {
                  this.II11.IIIl.IIol(I10("덖돝댲댓뎺돍뎪뎖둸둒둴땢둱뒑뗁ꩈ땷", 45854));
               } else {
                  var2.Il11 = var2.Il11 - var1.l0o_;
                  if (var4 >= 0) {
                     IO0l var18 = var2.III[var4];
                     var18.lo0I -= 99;
                     if (var18.lo0I <= 0) {
                        var2.III[var4] = new IO0l();
                     }
                  }

                  this.II11.IIIl.l1_l();
                  this.II11.IIIl.l1_();
                  this.II11.IIIl.IIol(I10("덓덈댽덛돮돑댸뎙둾됕됷뒇듼듖듰", 45854) + var3.II1o);
                  this.II11.I__O();
               }
            }
         }
      }
   }

   private void I111(int var1) {
      IOol var2 = this.II11.II;
      IOO.III var3 = IOO.II(var1);
      if (var3 != null) {
         int var4 = IOO.II(var3);
         int var5 = IOO.III(var3);
         IOO.IIIO var6 = IOO.II(var4, var5);
         if (var6 == null) {
            this.II11.IIIl.IIol(I10("덕덕뎨댕돽뎙뎬뎟\uaad5됕될됛ꩣ듒듰뒇땧ꯪ딢", 45854));
         } else if (var2.IO_1 < var6.I101) {
            this.II11.IIIl.IIol(I10("덜궜댲덛돱돑댬뎙둱됕땅ꪔ뒲듅뒹ꨮ땣딍딢둨뗤뗎", 45854));
         } else if (this.II11.IIIl.II11(var4, var5)) {
            var2.IO_1 = var2.IO_1 - var6.I101;
            this.II11.ll_0();
            this.II11.IIIl.IIol(I10("덜궜댲덛늋덚돸뎟ꫛ둖둴땢딢꩒뒳듏땥ꯔ땬딅뒉뗇떯뗇뙫ꣾ똭뙂", 45854));
            this.l1o_();
            this.II11.I__O();
         }
      }
   }
}
