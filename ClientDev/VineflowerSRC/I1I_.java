package main;

import java.io.IOException;

public class I1I_ {
   int II0I;
   int I_O0;
   int I_Oo;
   int I_0;
   int IIO;
   int IIOI;
   int IIOl;
   int IIlI;
   int IIO1;
   int IIO_;
   float III;
   long IlOI;
   long Il1O;
   boolean IIl;
   int[] Il1;
   int[] Il1I;

   public I1I_(int var1, int var2, int var3, int var4, int var5) {
      this.IIO1 = 0;
      this.IIO_ = 16711680;
      this.IlOI = 0L;
      this.Il1O = 150L;
      this.IIl = true;
      this.Il1 = new int[2];
      this.Il1I = new int[2];
      this.IIOl = var2;
      this.I_0 = var1;
      this.III = 1.0F;
      this.I_Oo = var3;
      this.IIlI = var4;
      this.II0I = II.IIl;
      this.I_O0 = II.IIlI;
      this.IlOI = System.currentTimeMillis();

      for (int var6 = 0; var6 < 2; var6++) {
         this.Il1[var6] = var1;
         this.Il1I[var6] = var2;
      }

      this.IIO_ = var5;
   }

   public static void III(IO1l var0, int var1, int var2, int var3) {
      var0.Illl(var3);
      var0.III_(var1, var2, 1, 2);
   }

   public I1I_() {
   }

   public static void IIll(I_Il var0) {
      try {
         I_Ol.II__(IlI("漼漈濭濏澇澌灻灔瀧瀂烡炃炶炓煯煱煙煽焿燴燔熭熊牸牚爹爑狡犀狫", 28494) + var0.II00);
         switch (var0.II00) {
            case -128:
               I_Il var27 = var0;

               try {
                  byte var132 = var27.II().readByte();
                  int var133;
                  Ilol var135;
                  if ((var133 = var27.II().readInt()) == Ilol.II().IOI_) {
                     var135 = Ilol.II();
                  } else {
                     var135 = I1_I.II(var133);
                  }

                  if (var132 == 0) {
                     short var137 = var27.II().readShort();
                     byte var140 = var27.II().readByte();
                     byte var145 = var27.II().readByte();
                     short var131 = var27.II().readShort();
                     byte var148 = var27.II().readByte();
                     if (var135 != null) {
                        var135.II(new I1ll(var137, var135, var140, var145, var131, var148));
                     }
                     break;
                  }

                  if (var132 == 1) {
                     short var136 = var27.II().readShort();
                     if (var135 != null) {
                        var135.IIl(0, var136);
                     }
                     break;
                  }

                  if (var132 == 2) {
                     if (var135 != null) {
                        var135.IIl(-1, 0);
                     }
                     break;
                  }
               } catch (Exception var50) {
                  var50.printStackTrace();
               }

               return;
            case -127:
               IIl1(var0);
               return;
            case -126:
               byte var70 = var0.II().readByte();
               I_Ol.II__(IlI("漺演濼濎濪澘災灆瀿灘炤", 28494) + var70);
               if (var70 == 1) {
                  var0.II().readByte();
                  String var104 = var0.II().readUTF();
                  String var121 = var0.II().readUTF();
                  I1_I.II().IIIl(var104, var121);
               }

               if (var70 == 0) {
                  I1_I.II().II_l(var0.II().readUTF());
                  return;
               }
               break;
            case -125:
               Ilo_.II().I_10 = false;
               String var28 = var0.II().readUTF();
               I_Ol.II__(IlI("漺漄濸濂澦澌瀵瀇", 28494) + var28);
               byte var69 = var0.II().readByte();
               I1II.II().III(var69, var28);

               for (int var111 = 0; var111 < var69; var111++) {
                  I1II.II().II[var111].II1o = var0.II().readUTF();
                  byte var84;
                  if ((var84 = var0.II().readByte()) == 0) {
                     I1II.II().II[var111].Ill(1);
                  }

                  if (var84 == 1) {
                     I1II.II().II[var111].Ill(0);
                  }

                  if (var84 == 2) {
                     I1II.II().II[var111].Ill(2);
                  }
               }

               return;
            case -124:
               byte var83 = var0.II().readByte();
               byte var92;
               if ((var92 = var0.II().readByte()) == 0) {
                  if (var83 == 2) {
                     int var97;
                     if ((var97 = var0.II().readInt()) == Ilol.II().IOI_) {
                        Ilol.II().I0I_();
                     } else if (I1_I.II(var97) != null) {
                        I1_I.II(var97).I0I_();
                     }
                  }

                  int var98 = var0.II().readUnsignedByte();
                  int var120 = var0.II().readInt();
                  I_Ol.II__(IlI("漾漁濭濒澯澛灁灣灻灅", 28494) + var120 + IlI("潮漞濧濂澦澅灁灣灻灅", 28494) + var98);
                  if (var98 == 32) {
                     if (var83 == 1) {
                        int var109 = var0.II().readInt();
                        if (var120 == Ilol.II().IOI_) {
                           Ilol.II().I0OI = var98;
                           I1_I.II(var109).III1(Ilol.II());
                        } else if (I1_I.II(var120) != null && var109 != Ilol.II().IOI_) {
                           I1_I.II(var120).I0OI = var98;
                           I1_I.II(var109).III1(I1_I.II(var120));
                        } else if (I1_I.II(var120) != null && var109 == Ilol.II().IOI_) {
                           I1_I.II(var120).I0OI = var98;
                           Ilol.II().III1(I1_I.II(var120));
                        }
                     } else if (var120 == Ilol.II().IOI_) {
                        Ilol.II().I0II();
                     } else if (I1_I.II(var120) != null) {
                        I1_I.II(var120).I0II();
                     }
                  }

                  if (var98 == 33) {
                     if (var83 == 1) {
                        if (var120 == Ilol.II().IOI_) {
                           Ilol.II().I_I0 = true;
                        } else if (I1_I.II(var120) != null) {
                           I1_I.II(var120).I_I0 = true;
                        }
                     } else if (var120 == Ilol.II().IOI_) {
                        Ilol.II().I0Il();
                     } else if (I1_I.II(var120) != null) {
                        I1_I.II(var120).I0Il();
                     }
                  }

                  if (var98 == 39) {
                     if (var83 == 1) {
                        if (var120 == Ilol.II().IOI_) {
                           Ilol.II().I_ll = true;
                        } else if (I1_I.II(var120) != null) {
                           I1_I.II(var120).I_ll = true;
                        }
                     } else if (var120 == Ilol.II().IOI_) {
                        Ilol.II().I0IO();
                     } else if (I1_I.II(var120) != null) {
                        I1_I.II(var120).I0IO();
                     }
                  }

                  if (var98 == 40) {
                     if (var83 == 1) {
                        if (var120 == Ilol.II().IOI_) {
                           Ilol.II().I_l1 = true;
                        } else if (I1_I.II(var120) != null) {
                           I1_I.II(var120).I_l1 = true;
                        }
                     } else if (var120 == Ilol.II().IOI_) {
                        Ilol.II().I0I1();
                     } else if (I1_I.II(var120) != null) {
                        I1_I.II(var120).I0I1();
                     }
                  }

                  if (var98 == 41) {
                     if (var83 == 1) {
                        if (var120 == Ilol.II().IOI_) {
                           Ilol.II().I_lO = true;
                        } else if (I1_I.II(var120) != null) {
                           I1_I.II(var120).I_lO = true;
                        }
                     } else if (var120 == Ilol.II().IOI_) {
                        Ilol.II().I0Io();
                     } else if (I1_I.II(var120) != null) {
                        I1_I.II(var120).I0Io();
                     }
                  }

                  if (var98 == 42) {
                     if (var83 == 1) {
                        if (var120 == Ilol.II().IOI_) {
                           Ilol.II().I_l0 = true;
                        }
                     } else if (var120 == Ilol.II().IOI_) {
                        Ilol.II().I_l0 = false;
                        I_Ol.II__(IlI("漺漟濭澋澼澌瀨灏瀳瀜炤烀炪炈煥煪焞煯", 28494));
                     }
                  }
               }

               if (var92 == 1) {
                  int var99 = var0.II().readUnsignedByte();
                  byte var68 = var0.II().readByte();
                  I_Ol.II__(IlI("漣漂濨濉澂澆灤灃瀏瀡点炃", 28494) + var68 + IlI("潮漞濧濂澦澅灁灣灻灅", 28494) + var99 + IlI("漫漋濪澋澃澭瀵瀇", 28494) + var83);
                  if (var99 == 32) {
                     if (var83 == 1) {
                        int var110;
                        if ((var110 = var0.II().readInt()) == Ilol.II().IOI_) {
                           I1_I.II(var68).IIO_ = var99;
                           Ilol.II().IIIl(I1_I.II(var68));
                        } else if (I1_I.II(var110) != null) {
                           I1_I.II(var68).IIO_ = var99;
                           I1_I.II(var110).IIIl(I1_I.II(var68));
                        }
                     } else {
                        I1_I.II(var68).IO1();
                     }
                  }

                  if (var99 == 40) {
                     if (var83 == 1) {
                        I1_I.II(var68).I0l = true;
                     } else {
                        I1_I.II(var68).IO1I();
                     }
                  }

                  if (var99 == 41) {
                     if (var83 == 1) {
                        I1_I.II(var68).I0lI = true;
                        return;
                     }

                     I1_I.II(var68).IO1l();
                     return;
                  }
               }
               break;
            case -123:
               int var58;
               if (I1_I.II(var58 = var0.II().readInt()) != null) {
                  I1_I.II(var58).I0O_ = var0.II().readByte();
                  return;
               }
               break;
            case -122:
               I_11 var75 = I1_I.II(var0.II().readShort());
               byte var91 = var0.II().readByte();
               var75.I111 = new int[var91];

               for (int var96 = 0; var96 < var91; var96++) {
                  var75.I111[var96] = var0.II().readShort();
               }

               var75.II(var0.II().readByte(), var0.II().readInt());
               return;
            case -121:
               I_0_.IlO = IO10.IIII() - I_0_.I1I1;
               I_0_.II().Io_0();
               return;
            case -120:
               I_0_.I1 = IO10.IIII() - I_0_.I1I;
               I_0_.II().Io_O();
               return;
            case -119:
               Ilol.II().IIl = var0.II().readInt();
               return;
            case -117:
               I1_I.II().lIOI = 0;
               I1_I.II().IIO = var0.II().readByte();
               if (I1_I.II().IIO == 100) {
                  I1_I.II().IOO1 = true;
               }

               if (I1_I.II().IIO == 101) {
                  I_11.IOl = true;
                  return;
               }
               break;
            case -116:
               I1_I.IO_I = var0.II().readByte() == 1;
               II0l.III().II(I1_I.IO_I);
               return;
            case -115:
               Ilol.II().II(var0.II().readUTF(), var0.II().readShort(), var0.II().readShort(), var0.II().readShort());
               return;
            case -113:
               byte[] var29 = new byte[10];

               for (int var95 = 0; var95 < 10; var95++) {
                  var29[var95] = var0.II().readByte();
               }

               I1_I.II().III(var29);
               I1_I.II().II(var29);
               I1_I.II().IIII(var29);
               return;
            case -111:
               I_Ol.II__(IlI("漂漬濕澋澂澠灆灯", 28494));
               short var66 = var0.II().readShort();
               I1Ol.IIO_ = new I_lO("");

               for (int var119 = 0; var119 < var66; var119++) {
                  String var103 = var0.II().readUTF();
                  byte var90 = var0.II().readByte();
                  I1Ol.IIO_.addElement(new I1Ol(var103, var90));
               }

               I1Ol.IIl1();
               I1Ol.IOlI();
               return;
            case -110:
               byte var123;
               if ((var123 = var0.II().readByte()) == 1) {
                  int var56 = var0.II().readInt();
                  byte[] var30;
                  if ((var30 = I_O1.II(String.valueOf(var56))) == null) {
                     I_0_.II().II((byte)1, -1, (byte[])null);
                  } else {
                     I_0_.II().II((byte)1, var56, var30);
                  }
               }

               if (var123 == 0) {
                  int var57 = var0.II().readInt();
                  short var64;
                  byte[] var134 = new byte[var64 = var0.II().readShort()];
                  var0.II().read(var134, 0, var64);
                  I_O1.II(String.valueOf(var57), var134);
                  return;
               }
               break;
            case -106:
               short var63 = var0.II().readShort();
               short var65 = var0.II().readShort();
               if (I1ol.II1_(var63)) {
                  I1ol.II(var63).III(var65, false);
                  return;
               }

               I1ol var31 = new I1ol(var63, var65);
               Ilol.II.addElement(var31);
               return;
            case -105:
               IOlo.II().IIOI = 0;
               IOlo.II().IIII = var0.II().readShort();
               IOlo.II().I1 = IOlo.II().IlO = System.currentTimeMillis();
               IOlo.II().IIO1 = var0.II().readByte();
               IOlo.II().I0l_();
               return;
            case -103:
               byte var80 = var0.II().readByte();
               I_Ol.II__(IlI("漽漈濾濝澯澛瀨灀瀳瀌炤烕炧烁煡煼煊焴焓燵燼熵熙牰爖牨牔", 28494) + var80);
               if (var80 == 0) {
                  II.II.IIo0.removeAllElements();
                  var80 = var0.II().readByte();

                  for (int var139 = 0; var139 < var80; var139++) {
                     I101 var144 = new I101();
                     short var105;
                     if ((var105 = var0.II().readShort()) != -1) {
                        var144.II = I1oI.II(var105);
                        byte var21;
                        if ((var21 = var0.II().readByte()) != -1) {
                           var144.III = new I100[var21];

                           for (int var122 = 0; var122 < var144.III.length; var122++) {
                              int var130 = var0.II().readUnsignedByte();
                              int var126 = var0.II().readUnsignedShort();
                              if (var130 != -1) {
                                 var144.III[var122] = new I100(var130, var126);
                              }
                           }
                        }
                     }

                     II.II.IIo0.addElement(var144);
                  }

                  II.II.IO_();
                  II.II.I__0();
                  return;
               }

               if (var80 == 1) {
                  int var55 = var0.II().readInt();
                  byte var89 = var0.II().readByte();
                  I_Ol.II__(IlI("潣潀澡澆濧濄瀥瀊火灈炩炎烯烌焭煾煝焩焕燴燔熟熔牶牑牤牎犳犒", 28494) + var55 + IlI("潮潗澬", 28494) + var89);
                  if (var55 == Ilol.II().IOI_) {
                     Ilol.II().IIl = var89;
                  } else if (I1_I.II(var55) != null) {
                     I1_I.II(var55).IIl = var89;
                  }

                  I1_I.II();
                  I1_I.II(var55, var89);
                  return;
               }

               if (var80 == 2) {
                  var80 = var0.II().readByte();
                  short var62 = var0.II().readShort();
                  I_1O var138;
                  (var138 = new I_1O()).IIO1 = var80;
                  var138.I_O0 = var62;
                  I1_I.IIOl.addElement(var138);

                  for (int var117 = 0; var117 < I1_I.IIOl.size(); var117++) {
                     I_1O var143 = (I_1O)I1_I.IIOl.elementAt(var117);
                     I_Ol.II__(IlI("漧潗澬", 28494) + var117 + IlI("潮潍濯濍澦澈灯瀝灦", 28494) + var143.IIO1 + IlI("潮潍澬濢澎澀灥灆瀡瀀烂烏炣炆焺焿", 28494) + var143.I_O0);
                  }

                  for (int var118 = 0; var118 < I1_I.II_O.size(); var118++) {
                     Ilol var107;
                     if ((var107 = (Ilol)I1_I.II_O.elementAt(var118)) != null && var107.IIl == var80) {
                        var107.IO0_ = var62;
                     }
                  }

                  if (Ilol.II().IIl == var80) {
                     Ilol.II().IO0_ = var62;
                     return;
                  }
               }
               break;
            case -102:
               byte var79;
               if ((var79 = var0.II().readByte()) != 0 && var79 == 1) {
                  I1o_ var112 = II.II;
                  I1o_.IOo = false;
                  I_0_.II().II(I_O1.IIl(IlI("漯漎濯", 28494)), I_O1.IIl(IlI("漾漌濿濘", 28494)), IlI("潿潃澼澅濸", 28494), (byte)0);
                  return;
               }
               break;
            case -101:
               I1o_ var17 = II.II;
               I1o_.IOo = true;
               II.II();
               String var19 = var0.II().readUTF();
               I_O1.III1(IlI("漻漞濩濙澋澆", 28494) + I_0l.l1_I, var19);
               I_0_.II().Io__();
               I_0_.II().II(var19, "", IlI("潿潃澼澅濸", 28494), (byte)1);
               return;
            case -100:
               I1OO.I__o();
               boolean var32 = false;
               if (II.IIl > 2 * I_1o.llOI) {
                  var32 = true;
               }

               byte var67 = var0.II().readByte();
               I_Ol.II__(IlI("漺潍濅濅澮澑灭瀚灦", 28494) + var67);
               II.II.I11o[var67] = var0.II().readByte();
               II.II.I1_[var67] = var0.II().readByte();
               I_Ol.II__(IlI("漣漌濴澋澺澈灯灂灻灅", 28494) + II.II.I11o[var67] + IlI("潮漎濹濙澸濉灸灆瀡瀀点炃", 28494) + II.II.I1_[var67]);
               int var108 = var0.II().readUnsignedByte();
               Ilol.II().II[var67] = new I101[var108];
               I_1o.Il1I = IO11.I0OI;

               for (int var20 = 0; var20 < var108; var20++) {
                  short var142;
                  if ((var142 = var0.II().readShort()) != -1) {
                     Ilol.II().II[var67][var20] = new I101();
                     Ilol.II().II[var67][var20].II = I1oI.II(var142);
                     Ilol.II().II[var67][var20].lIO1 = var0.II().readShort();
                     Ilol.II().II[var67][var20].II0 = var0.II().readInt();
                     Ilol.II().II[var67][var20].III = var0.II().readInt();
                     Ilol.II().II[var67][var20].IIO0 = var0.II().readByte();
                     Ilol.II().II[var67][var20].I1l1 = var0.II().readInt();
                     Ilol.II().II[var67][var20].IIOo = var0.II().readByte();
                     byte var129;
                     if ((var129 = var0.II().readByte()) != -1) {
                        Ilol.II().II[var67][var20].III = new I100[var129];

                        for (int var125 = 0; var125 < Ilol.II().II[var67][var20].III.length; var125++) {
                           int var127 = var0.II().readUnsignedByte();
                           int var128 = var0.II().readUnsignedShort();
                           if (var127 != -1) {
                              Ilol.II().II[var67][var20].III[var125] = new I100(var127, var128);
                              Ilol.II().II[var67][var20].lIOo = II.II.III(Ilol.II().II[var67][var20]);
                           }
                        }
                     }

                     if (var0.II().readByte() == 1) {
                        short var26 = var0.II().readShort();
                        short var147 = var0.II().readShort();
                        short var149 = var0.II().readShort();
                        short var150 = var0.II().readShort();
                        Ilol.II().II[var67][var20].II(var26, var147, var149, var150);
                     }

                     Ilol.II().II[var67][var20].IlI0 = var0.II().readUTF();
                     I_Ol.II_l(IlI("漠漊濹濄澣濉灣灎灦瀂烱烊烢烁", 28494) + Ilol.II().II[var67][var20].IlI0);
                  }
               }

               if (var32) {
                  II.III.IO11();
               }

               II.II.IolI();
               II.II.Io1I = II.II.Io1o = 0;
            default:
               return;
            case -89:
               II.II1l = var0.II().readByte() == 1;
               return;
            case 31:
               int var54 = var0.II().readInt();
               if (var0.II().readByte() != 1) {
                  if (var54 == Ilol.II().IOI_) {
                     Ilol.II().II.Io1I();
                     Ilol.II().II = null;
                     return;
                  }

                  Ilol var141;
                  (var141 = I1_I.II(var54)).II.Io1I();
                  var141.II = null;
                  return;
               }

               short var61 = var0.II().readShort();
               byte var102 = -1;
               int[] var33 = null;
               short var71 = 0;
               short var72 = 0;

               try {
                  if ((var102 = var0.II().readByte()) > 0) {
                     byte var25;
                     var33 = new int[var25 = var0.II().readByte()];

                     for (int var124 = 0; var124 < var25; var124++) {
                        var33[var124] = var0.II().readByte();
                     }

                     var71 = var0.II().readShort();
                     var72 = var0.II().readShort();
                  }
               } catch (Exception var49) {
               }

               if (var54 == Ilol.II().IOI_) {
                  Ilol.II().II = new I__I();
                  Ilol.II().II.II1o = var61;
                  if (var102 > 0) {
                     Ilol.II().II.II(var102, var33, var71, var72);
                     return;
                  }
               } else {
                  Ilol var146;
                  (var146 = I1_I.II(var54)).II = new I__I();
                  var146.II.II1o = var61;
                  if (var102 > 0) {
                     var146.II.II(var102, var33, var71, var72);
                     return;
                  }
               }
               break;
            case 42:
               II.III_();
               I1o_.IO0_ = false;
               Ilol.I10I = false;
               byte var88 = var0.II().readByte();
               if (II.II == null) {
                  II.II = new I_OI(var88);
               }

               II.II.I0l_();
               return;
            case 48:
               I_0l.l1_I = var0.II().readByte();
               II.II(II.II);
               I_0O.II().close();
               II.III_();
               I_0l.I1ll = true;
               return;
            case 51:
               I1oO var34 = (I1oO)I1_I.II(var0.II().readInt());
               byte var22 = var0.II().readByte();
               short var23 = var0.II().readShort();
               short var24 = var0.II().readShort();
               byte var78;
               Ilol[] var35 = new Ilol[var78 = var0.II().readByte()];
               int[] var36 = new int[var78];

               for (int var116 = 0; var116 < var78; var116++) {
                  int var151 = var0.II().readInt();
                  I_Ol.II__(IlI("漭漅濭濙濪澠灌瀚", 28494) + var151);
                  var35[var116] = null;
                  if (var151 != Ilol.II().IOI_) {
                     var35[var116] = I1_I.II(var151);
                  } else {
                     var35[var116] = Ilol.II();
                  }

                  var36[var116] = var0.II().readInt();
               }

               var34.II((byte)var22, (short)var23, (short)var24, var35, var36);
               return;
            case 52:
               byte var101;
               if ((var101 = var0.II().readByte()) == 1) {
                  int var113;
                  if ((var113 = var0.II().readInt()) == Ilol.II().IOI_) {
                     Ilol.II().IIIO(true);
                     Ilol.II().I_o_ = var0.II().readShort();
                     Ilol.II().I_oO = var0.II().readShort();
                  } else {
                     Ilol var15;
                     if ((var15 = I1_I.II(var113)) != null) {
                        var15.IIIO(true);
                        var15.I_o_ = var0.II().readShort();
                        var15.I_oO = var0.II().readShort();
                     }
                  }
               }

               if (var101 == 0) {
                  int var114;
                  if ((var114 = var0.II().readInt()) == Ilol.II().IOI_) {
                     Ilol.II().IIIO(false);
                  } else {
                     Ilol var106;
                     if ((var106 = I1_I.II(var114)) != null) {
                        var106.IIIO(false);
                     }
                  }
               }

               if (var101 == 2) {
                  int var115 = var0.II().readInt();
                  int var16 = var0.II().readInt();
                  ((I1oO)I1_I.II(var115)).IIII(var16);
               }

               if (var101 == 3) {
                  I1_I.IIOI = var0.II().readByte();
                  return;
               }
               break;
            case 93:
               String var13 = I_Ol.IIIo(var0.II().readUTF());
               I1_I.II().II_I(var13);
               return;
            case 100:
               byte var100 = var0.II().readByte();
               byte var76 = var0.II().readByte();
               I101 var37 = null;
               if (var100 == 0) {
                  var37 = Ilol.II().IIII[var76];
               }

               if (var100 == 1) {
                  var37 = Ilol.II().II[var76];
               }

               short var38;
               if ((var38 = var0.II().readShort()) != -1) {
                  var37.II = I1oI.II(var38);
                  var37.I1l1 = var0.II().readInt();
                  var0.II().readUTF();
                  var0.II().readUTF();
                  if ((var76 = var0.II().readByte()) != 0) {
                     var37.III = new I100[var76];

                     for (int var53 = 0; var53 < var37.III.length; var53++) {
                        int var94 = var0.II().readUnsignedByte();
                        int var18 = var0.II().readUnsignedShort();
                        if (var94 != -1) {
                           var37.III[var53] = new I100(var94, var18);
                        }
                     }
                  }

                  if (var37.I1l1 <= 0) {
                     return;
                  }
               }
               break;
            case 101:
               I_Ol.II__(IlI("漬漄濫澋澨澆灻灔火灈炩炎烯烌焭焲焓煰煑熶熗燴燕爺爛牸牙犾犟狼狝猢猃獠獁玦率珤珅琪琋瑨瑉璮璏瓬瓍瓒申甐畱畖疷疔痵痚瘻瘘", 28494));
               Ilo var39;
               if ((var39 = I_I_.II()) == null) {
                  return;
               }

               byte var87;
               if ((var87 = var0.II().readByte()) == 0 || var87 == 1 || var87 == 2 || var87 == 4 || var87 == 3) {
                  if (var87 == 3) {
                     var39.II0I = var39.llIO = var0.II().readShort();
                     var39.llI0 = var0.II().readShort();
                     var39.IO1O();
                  } else {
                     byte var153 = var0.II().readByte();
                     I_Ol.II__(IlI("漍漥濙濤澄澮瀨灉瀅瀍烥烑烿烁", 28494) + var153);
                     Ilol[] var155 = new Ilol[var153];
                     int[] var157 = new int[var153];

                     for (int var74 = 0; var74 < var153; var74++) {
                        int var93 = var0.II().readInt();
                        I_Ol.II__(IlI("漭漅濭濙濪澠灌瀚", 28494) + var93);
                        var155[var74] = null;
                        if (var93 != Ilol.II().IOI_) {
                           var155[var74] = I1_I.II(var93);
                        } else {
                           var155[var74] = Ilol.II();
                        }

                        var157[var74] = var0.II().readInt();
                     }

                     var39.II(var155, var157, var87);
                  }
               }

               if (var87 == 5) {
                  var39.I1l1 = true;
                  var39.status = 2;
               }

               if (var87 == 6) {
                  var39.IO1_();
                  var39.I1 = var0.II().readShort();
                  var39.I1I = var0.II().readShort();
               }

               if (var87 == 7) {
                  var39.II((Ilol[])null, (int[])null, var87);
               }

               if (var87 == 8) {
                  var39.II0I = var39.llIO = var0.II().readShort();
                  var39.llI0 = var0.II().readShort();
                  var39.status = 2;
               }

               if (var87 == 9) {
                  var39.I1 = var39.I1I = var39.II0I = var39.llIO = var39.llI0 = -1000;
                  return;
               }
               break;
            case 102:
               byte var12;
               if ((var12 = var0.II().readByte()) == 0 || var12 == 1 || var12 == 2 || var12 == 6) {
                  IloI var158;
                  if ((var158 = I_I_.II()) == null) {
                     return;
                  }

                  if (var12 == 6) {
                     var158.I1 = var158.I1I = var158.II0I = var158.I_O0 = var158.llIO = var158.llI0 = -1000;
                     return;
                  }

                  byte var85;
                  Ilol[] var40 = new Ilol[var85 = var0.II().readByte()];
                  int[] var41 = new int[var85];

                  for (int var42 = 0; var42 < var85; var42++) {
                     int var7 = var0.II().readInt();
                     var40[var42] = null;
                     if (var7 != Ilol.II().IOI_) {
                        var40[var42] = I1_I.II(var7);
                     } else {
                        var40[var42] = Ilol.II();
                     }

                     var41[var42] = var0.II().readInt();
                  }

                  var158.II(var40, var41, var12);
               }

               if (var12 == 3 || var12 == 4 || var12 == 5 || var12 == 7) {
                  Il0_ var159;
                  if ((var159 = I_I_.II()) == null) {
                     return;
                  }

                  if (var12 == 7) {
                     var159.I1 = var159.I1I = var159.I_0I = var159.I_0l = var159.llIO = var159.llI0 = -1000;
                     return;
                  }

                  if (var12 == 3 || var12 == 4) {
                     byte var86;
                     Ilol[] var152 = new Ilol[var86 = var0.II().readByte()];
                     int[] var154 = new int[var86];

                     for (int var156 = 0; var156 < var86; var156++) {
                        int var73 = var0.II().readInt();
                        var152[var156] = null;
                        if (var73 != Ilol.II().IOI_) {
                           var152[var156] = I1_I.II(var73);
                        } else {
                           var152[var156] = Ilol.II();
                        }

                        var154[var156] = var0.II().readInt();
                     }

                     var159.II(var152, var154, var12);
                  }

                  if (var12 == 5) {
                     short var60 = var0.II().readShort();
                     var159.III(var60);
                  }
               }

               if (var12 > 9 && var12 < 30) {
                  IIII(var0, var12);
                  return;
               }
               break;
            case 113:
               byte var9 = 0;
               byte var10 = 0;
               int var11 = 0;
               short var14 = 0;
               short var5 = 0;
               short var6 = -1;

               try {
                  var9 = var0.II().readByte();
                  var10 = var0.II().readByte();
                  var11 = var0.II().readUnsignedByte();
                  var14 = var0.II().readShort();
                  var5 = var0.II().readShort();
                  var6 = var0.II().readShort();
               } catch (Exception var48) {
               }

               I1lI.III(new I1ll(var11, var14, var5, var10, var9, var6));
               return;
            case 114:
               try {
                  var0.II().readUTF();
                  IO10.Ill1 = var0.II().readByte();
                  IO10.II1_ = var0.II().readByte();
                  return;
               } catch (Exception var47) {
                  return;
               }
            case 121:
               IO10.IIo_ = var0.II().readUTF();
               var0.II().readUTF();
               I_Ol.II__(IlI("漝漥濃濼濪澨灌瀇瀶瀐烦烏炫炂焠煖煺煠煜", 28494) + IO10.IIo_);
               return;
            case 122:
               short var43 = var0.II().readShort();
               I_Ol.II__(IlI("漽漈濯濄澤澍瀨灋瀩瀂热烍烢烜焠", 28494) + var43);
               I1o_.IIO = var43;
               I1o_.Il1O = I1o_.IlOI = System.currentTimeMillis();
               II.III_();
               return;
            case 123:
               int var52 = var0.II().readInt();
               short var59 = var0.II().readShort();
               short var3 = var0.II().readShort();
               byte var44 = var0.II().readByte();
               I_Ol.II__(
                  IlI("漝漨濘澋澚澦灛灴瀕瀶烗烰炑炲煓煌煭焎焯燈燩熊熫牄牥爆爧狀狡犂犣獜獽猞猿珘珹玚玻瑔瑵琖琷瓐瓱璒璳璬畍畮甏用痉痪疋疤癅癦瘇瘠盁盢皣皜眮睕睱睋", 28494)
                     + var59
                     + IlI("潮演澱澋", 28494)
                     + var3
                     + IlI("漭漅濭濻澥澚瀵瀇", 28494)
                     + var52
                     + IlI("漺演濼濎濪澹灧灔灻灅", 28494)
                     + var44
               );
               Ilol var45 = null;
               if (var52 == Ilol.II().IOI_) {
                  var45 = Ilol.II();
               } else if (I1_I.II(var52) != null) {
                  var45 = I1_I.II(var52);
               }

               if (var45 != null) {
                  I_0.II(var44 == 0 ? 60 : 173, var45, 1);
                  var45.II(var59, var3, var44);
                  return;
               }
               break;
            case 124:
               short var2 = var0.II().readShort();
               String var46 = var0.II().readUTF();
               I_11 var8;
               if ((var8 = I1_I.II(var2)) != null) {
                  var8.II10(var46);
                  return;
               }
               break;
            case 125:
               byte var4 = var0.II().readByte();
               int var1;
               if ((var1 = var0.II().readInt()) == Ilol.II().IOI_) {
                  Ilol.II().II(var4);
                  return;
               }

               if (I1_I.II(var1) != null) {
                  I1_I.II(var1).II(var4);
                  return;
               }
         }
      } catch (Exception var51) {
      }
   }

   private static void IIl1(I_Il var0) {
      try {
         byte var1;
         if ((var1 = var0.II().readByte()) == 0) {
            short[] var10 = new short[var1 = var0.II().readByte()];

            for (int var11 = 0; var11 < var1; var11++) {
               var10[var11] = var0.II().readShort();
            }

            byte var4 = var0.II().readByte();
            int var5 = var0.II().readInt();
            short var6 = var0.II().readShort();
            I1IO.II().II(var10, var4, var5, var6);
            return;
         }

         if (var1 == 1) {
            short[] var2 = new short[var1 = var0.II().readByte()];

            for (int var3 = 0; var3 < var1; var3++) {
               var2[var3] = var0.II().readShort();
            }

            I1IO.II().II(var2);
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   private static void IIII(I_Il var0, int var1) {
      try {
         I_1I var2;
         if ((var2 = I_I_.II(var0.II().readByte())) == null) {
            return;
         }

         if (var1 == 10) {
            short var3 = var0.II().readShort();
            short var4 = var0.II().readShort();
            var2.IIII(var3, var4);
         }

         if (var1 >= 11 && var1 <= 20) {
            byte var9;
            Ilol[] var10 = new Ilol[var9 = var0.II().readByte()];
            int[] var5 = new int[var9];

            for (int var6 = 0; var6 < var9; var6++) {
               int var7 = var0.II().readInt();
               var10[var6] = null;
               if (var7 != Ilol.II().IOI_) {
                  var10[var6] = I1_I.II(var7);
               } else {
                  var10[var6] = Ilol.II();
               }

               var5[var6] = var0.II().readInt();
            }

            byte var11 = var0.II().readByte();
            var2.II(var10, var5, (byte)(var1 - 10), var11);
         }

         if (var1 == 21) {
            var2.I_0I = var0.II().readShort();
            var2.I_0l = var0.II().readShort();
            var2.I001();
         }

         if (var1 == 23) {
            var2.I00_();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }
}
