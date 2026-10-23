package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class I1I1 implements I1_0 {
   // $VF: renamed from: II I1I1
   private static I1I1 field_618;
   // $VF: renamed from: II I_Il
   private I_Il field_619;
   public static boolean I__1 = false;
   // $VF: renamed from: II float
   private float field_620;
   public static boolean I___;
   public static I_l_ IIIl = new I_l_(method_718("랋롾롊렧렌뢨룉뢣뢒뤤륁뤭뤒맳", 47085));

   // $VF: renamed from: II () I1I1
   public static I1I1 method_705() {
      if (field_618 == null) {
         field_618 = new I1I1();
      }

      return field_618;
   }

   @Override
   public void III0(boolean var1) {
      if (var1) {
         System.out.println(method_718("랎롣롅려렌룫룓룦룔뤤륌뤩", 47085));
         int var3;
         if ((var3 = IO10.IIOo()) == -1) {
            var3 = I_0l.l1_I;
         }

         GameMidlet.field_40 = I_0l.II1l[var3];
         GameMidlet.II_0 = I_0l.III0[var3];
         I_0l.III_ = 2;
         I_O1.IIIl(method_718("랞롺롘렯렅룭룄뢲", 47085), var3);
         String var4 = GameMidlet.field_40 + method_718("럗", 47085) + GameMidlet.II_0;
         I_O1.method_555(method_718("랣롞롢렚렅룡룉뢭", 47085), var4.getBytes());
         I_0_.method_504().Io__();
         I_0_ var2 = I_0_.method_504();
      } else {
         I_0_ var6 = I_0_.method_504();
         if (I_O1.method_558(method_718("랎론롂렯렇룼룓뢿뢕륡", 47085)) != -1) {
            IO10.l_lI = I_O1.method_558(method_718("랎론롂렯렇룼룓뢿뢕륡", 47085));
         }

         try {
            I_Ol.II__(method_718("랞롩롟렞렐룸룂", 47085));
            I_Il var7;
            (var7 = I_0_.method_522((byte)2)).method_629().writeByte(IO10.l_lI);
            var7.method_629().writeByte(IO1l.l_I0);
            var7.method_629().writeBoolean(false);
            var7.method_629().writeInt(class_1.field_11);
            var7.method_629().writeInt(class_1.IIlI);
            var7.method_629().writeBoolean(IOI0.III_);
            var7.method_629().writeBoolean(class_1.IIIl);
            var7.method_629().writeUTF(System.getProperty(method_718("란롥롈렸렆룭룃뢯뢑륭륌뤬륏맰맳맟릩릚면멈먴", 47085)) + method_718("랑", 47085) + method_718("럜렢렛롤롛", 47085));
            InputStream var8;
            if ((var8 = var6.getClass().getResourceAsStream(method_718("랟롩롘렖렀룦룁뢩", 47085))) != null) {
               var8.read((byte[])null);
               var7.method_629().writeShort(((Object[])null).length);
               var7.method_629().write((byte[])null);
               I_Ol.II_l(method_718("랚롾롂렾렌뢨", 47085) + ((Object[])null).length + method_718("랑", 47085) + method_718("럜렢렛롤롛", 47085));
            }

            var6.field_425 = I_0O.method_493();
            var6.field_425.IIlO(var7);
            var6.field_425 = I_0O.method_492();
            var7.I0Oo();
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }
   }

   @Override
   public void IIIo(boolean var1) {
      if (!var1) {
         if (class_1.field_12 == class_1.field_38 && I_0l.I__o && !I_0_.III1) {
            I_0l.III_ = 0;
            class_1.field_38.method_729();
         }

         if (class_1.field_12 != class_1.field_17 || I_0_.III1) {
            return;
         }
      }

      IO10.IIlI(var1);
   }

   // $VF: renamed from: IIl (boolean) void
   @Override
   public void method_17(boolean var1) {
      if (!var1) {
         System.out.println(method_718("랎롣롅려렌룫룓룦룗뤤륅뤣뤈맬", 47085));
         if (class_1.field_12 == class_1.field_38 && !I_0_.III1) {
            class_1.field_38.method_729();
         }

         if (class_1.field_12 == class_1.field_17 && !I_0_.III1) {
            IO10.III_(var1);
         }
      } else {
         System.out.println(method_718("랂롢롯렣렚룫룈뢨뢋륡륀뤶뤄매릿릏맽릚멺멓먵", 47085));
         IO10.III_(var1);
      }
   }

   // $VF: renamed from: II (I_Il) void
   private static void method_706(I_Il var0) {
      try {
         int var1 = var0.method_628().readUnsignedByte();
         I101 var2 = I1_I.IIlI.IIII[var1];
         var2.lIO0 = var0.method_628().readInt();
         var2.lIOO = var0.method_628().readByte();
         var2.IIOo = new I_lO(method_718("랄롸롎렧롇룧룗뢲뢌륫륍뤱", 47085));

         try {
            while (true) {
               var2.IIOo.addElement(new I100(var0.method_628().readUnsignedByte(), var0.method_628().readUnsignedShort()));
            }
         } catch (Exception var4) {
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   // $VF: renamed from: III (I_Il) void
   @Override
   public void method_16(I_Il var1) {
      IO10.method_440();
      class_1.IIIl.removeAllElements();

      try {
         label5540: {
            try {
               I_Ol.II__(method_718("럑렰렗렘렌룩룃룦뢆륩륇륿륁", 47085) + var1.II00);
               I1I_.IIll(var1);
               label5115:
               switch (var1.II00) {
                  case -112:
                     byte var88 = var1.method_628().readByte();
                     if (var88 == 0) {
                        byte var400 = var1.method_628().readByte();
                        I1_I.method_764(var400).IOll();
                     }

                     if (var88 == 1) {
                        byte var401 = var1.method_628().readByte();
                        I1_I.method_764(var401).method_860(var1.method_628().readShort());
                     }
                  case -111:
                  case -110:
                  case -109:
                  case -108:
                  case -106:
                  case -105:
                  case -104:
                  case -103:
                  case -102:
                  case -101:
                  case -100:
                  case -89:
                  case -78:
                  case -75:
                  case -73:
                  case -72:
                  case -71:
                  case -58:
                  case -56:
                  case -55:
                  case -54:
                  case -49:
                  case -48:
                  case -40:
                  case -39:
                  case -38:
                  case -33:
                  case -27:
                  case -23:
                  case -17:
                  case -16:
                  case -15:
                  case -13:
                  case -12:
                  case -11:
                  case -10:
                  case -9:
                  case -8:
                  case -7:
                  case -6:
                  case -5:
                  case -3:
                  case -2:
                  case -1:
                  case 3:
                  case 4:
                  case 5:
                  case 8:
                  case 9:
                  case 10:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 21:
                  case 22:
                  case 23:
                  case 25:
                  case 26:
                  case 28:
                  case 30:
                  case 31:
                  case 34:
                  case 35:
                  case 36:
                  case 37:
                  case 42:
                  case 44:
                  case 45:
                  case 48:
                  case 49:
                  case 51:
                  case 52:
                  case 53:
                  case 55:
                  case 59:
                  case 60:
                  case 61:
                  case 67:
                  case 70:
                  case 71:
                  case 72:
                  case 73:
                  case 74:
                  case 75:
                  case 76:
                  case 77:
                  case 78:
                  case 79:
                  case 80:
                  case 89:
                  case 91:
                  case 93:
                  case 95:
                  case 96:
                  case 97:
                  case 98:
                  case 99:
                  case 100:
                  case 101:
                  case 102:
                  case 103:
                  case 104:
                  case 105:
                  case 106:
                  case 107:
                  case 108:
                  case 109:
                  case 110:
                  case 111:
                  default:
                     break;
                  case -107:
                     byte var48 = var1.method_628().readByte();
                     if (var48 == 0) {
                        Ilol.method_808().I101 = false;
                     }

                     if (var48 == 1) {
                        Ilol.method_808().I101 = true;
                     }

                     if (var48 != 2) {
                        break;
                     }

                     I1OO.I__o();
                     Ilol.method_809().field_837 = var1.method_628().readShort();
                     Ilol.method_809().IO01();
                     int var489 = var1.method_628().readUnsignedByte();
                     I_Ol.II__(method_718("랃롹롆롪렋룧룃뢿룅뤹뤃", 47085) + var489);
                     Ilol.method_809().IIII = new I101[var489];
                     int var402 = 0;

                     for (; var402 < var489; var402++) {
                        short var502 = var1.method_628().readShort();
                        I_Ol.II__(method_718("랙롩롆렺렅룩룓뢣룅륭륇륿륁", 47085) + var502);
                        if (var502 != -1) {
                           I_Ol.II__(method_718("럜", 47085));
                           Ilol.method_809().IIII[var402] = new I101();
                           Ilol.method_809().IIII[var402].field_543 = I1oI.method_642(var502);
                           byte var512 = Ilol.method_809().IIII[var402].field_543.II0l;
                           Ilol.method_809().IIII[var402].I1l1 = var1.method_628().readInt();
                           I_Ol.II__(method_718("럞", 47085));
                           Ilol.method_809().IIII[var402].IlIo = var1.method_628().readUTF();
                           Ilol.method_809().IIII[var402].field_549 = var1.method_628().readUTF();
                           int var523 = var1.method_628().readUnsignedByte();
                           I_Ol.II__(method_718("랂롼롟렣렆룦뢇뢵뢌륾륆륿륁", 47085) + var523);
                           if (var523 != 0) {
                              Ilol.method_809().IIII[var402].field_542 = new I100[var523];

                              for (int var406 = 0; var406 < Ilol.method_809().IIII[var402].field_542.length; var406++) {
                                 int var408 = var1.method_628().readUnsignedByte();
                                 int var469 = var1.method_628().readUnsignedShort();
                                 if (var408 != -1) {
                                    Ilol.method_809().IIII[var402].field_542[var406] = new I100(var408, var469);
                                 }
                              }
                           }

                           switch (var512) {
                              case 0:
                                 Ilol.method_809().I0II = Ilol.method_809().IIII[var402].field_543.II_0;
                                 break;
                              case 1:
                                 Ilol.method_809().field_838 = Ilol.method_809().IIII[var402].field_543.II_0;
                           }
                        }
                     }

                     Ilol.method_809().IOl_ = var1.II_I();
                     Ilol.method_809().IOlo = var1.II_I();
                     Ilol.method_809().IOl1 = var1.II_I();
                     Ilol.method_809().field_799 = var1.II_I();
                     Ilol.method_809().field_797 = var1.II_I();
                     Ilol.method_809().IIO1 = var1.method_628().readUTF();
                     Ilol.method_809().IIO_ = var1.method_628().readUTF();
                     Ilol.method_809().Illo = var1.method_628().readLong();
                     Ilol.method_809().Il1I = var1.method_628().readLong();
                     Ilol.method_809().III1 = var1.method_628().readByte();
                     Ilol.method_809().IO_0 = var1.method_628().readShort();
                     Ilol.method_809().IIl1 = var1.method_628().readShort();
                     Ilol.method_809().IOll = var1.method_628().readByte();
                     Ilol.method_809().IOlI = var1.method_628().readShort();
                     Ilol.method_809().field_813 = new I_0o[var1.method_628().readByte()];
                     I_Ol.II__(method_718("랾롇롢렆력룍룩뢒룅뤹뤃", 47085) + Ilol.method_809().field_813);

                     for (int var403 = 0; var403 < Ilol.method_809().field_813.length; var403++) {
                        short var503 = var1.method_628().readShort();
                        if (var503 != -1) {
                           Ilol.method_809().field_813[var403] = I_o_.method_491(var503);
                        } else {
                           Ilol.method_809().field_813[var403] = new I_0o();
                           Ilol.method_809().field_813[var403].field_408 = null;
                           Ilol.method_809().field_813[var403].field_412 = var1.method_628().readUTF();
                        }
                     }
                     break;
                  case -99:
                     I1OO.I__o();
                     byte var49 = var1.method_628().readByte();
                     if (var49 != 0) {
                        break;
                     }

                     class_1.field_14.IIoO.removeAllElements();
                     int var404 = var1.method_628().readUnsignedByte();

                     for (int var405 = 0; var405 < var404; var405++) {
                        Ilol var488 = new Ilol();
                        var488.IOI_ = var1.method_628().readInt();
                        var488.field_837 = var1.method_628().readShort();
                        var488.IOoo = var1.method_628().readShort();
                        var488.I0II = var1.method_628().readShort();
                        var488.field_838 = var1.method_628().readShort();
                        var488.I0Il = var1.method_628().readShort();
                        var488.IIO1 = var1.method_628().readUTF();
                        I1O0 var501 = new I1O0(var1.method_628().readUTF());
                        boolean var511 = var1.method_628().readBoolean();
                        var501.IIll = var488;
                        var501.IOO0 = var511;
                        I_Ol.II__(method_718("랄롿롄려렅룡룉뢣룅뤹뤃", 47085) + var511);
                        class_1.field_14.IIoO.addElement(var501);
                     }

                     class_1.field_14.I0ol();
                     class_1.field_14.I__0();
                     break;
                  case -98:
                     byte var50 = var1.method_628().readByte();
                     class_1.field_13.IOol = false;
                     if (var50 == 0) {
                        class_1.method_36(
                           var1.method_628().readUTF(),
                           new I1Il(IO11.I_I_, class_1.field_3, 888397, var1.method_628().readUTF()),
                           new I1Il(IO11.I_IO, class_1.field_3, 888396, null)
                        );
                     }
                     break;
                  case -97:
                     Ilol.method_808().Il1l = var1.method_628().readInt();
                     break;
                  case -96:
                     byte var51 = var1.method_628().readByte();
                     class_1.field_14.IIo_.removeAllElements();
                     String var89 = var1.method_628().readUTF();
                     int var52 = var1.method_628().readUnsignedByte();

                     for (int var407 = 0; var407 < var52; var407++) {
                        int var80 = var1.method_628().readInt();
                        int var415 = var1.method_628().readInt();
                        short var471 = var1.method_628().readShort();
                        short var500 = var1.method_628().readShort();
                        short var510 = var1.method_628().readShort();
                        short var522 = var1.method_628().readShort();
                        String var530 = var1.method_628().readUTF();
                        String var535 = var1.method_628().readUTF();
                        IOl0 var548 = new IOl0();
                        var548.field_315 = var80;
                        var548.l1o0 = var471;
                        var548.IOoo = var500;
                        var548.II0O = var510;
                        var548.II00 = var522;
                        var548.II1o = var530;
                        var548.IlIo = var535;
                        var548.II_o = var1.method_628().readUTF();
                        var548.l1oo = var415;
                        class_1.field_14.IIo_.addElement(var548);
                     }

                     class_1.field_14.IllO = var89;
                     class_1.field_14.IIIl((byte)var51);
                     class_1.field_14.I__0();
                     break;
                  case -95:
                     byte var53 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랙롵롛렯롔뢨", 47085) + var53);
                     if (var53 == 0) {
                        int var54 = var1.method_628().readInt();
                        short var417 = var1.method_628().readShort();
                        int var424 = var1.II_I();
                        if (var54 == Ilol.method_808().IOI_) {
                           Ilol.method_808().IIIl = new I_I_(
                              var54,
                              false,
                              false,
                              false,
                              false,
                              false,
                              var417,
                              1,
                              var424,
                              (byte)0,
                              var424,
                              (short)(Ilol.method_808().I_o_ + (Ilol.method_808().IOI1 != 1 ? -40 : 40)),
                              (short)Ilol.method_808().I_oO,
                              (byte)4,
                              (byte)0
                           );
                           Ilol.method_808().IIIl.I0I1 = true;
                           I1lI.method_692(new I1ll(18, Ilol.method_808().IIIl.field_903, Ilol.method_808().IIIl.field_904, 2, 10, -1));
                           Ilol.method_808().IO__ = 30;
                           I1_I.field_696.addElement(Ilol.method_808().IIIl);
                        } else {
                           Ilol var305 = I1_I.method_762(var54);
                           if (var305 != null) {
                              I_I_ var90 = new I_I_(
                                 var54,
                                 false,
                                 false,
                                 false,
                                 false,
                                 false,
                                 var417,
                                 1,
                                 var424,
                                 (byte)0,
                                 var424,
                                 (short)var305.I_o_,
                                 (short)var305.I_oO,
                                 (byte)4,
                                 (byte)0
                              );
                              var90.I0I1 = true;
                              var305.IIIl = var90;
                              I1_I.field_696.addElement(var305.IIIl);
                           } else {
                              I_I_ var496 = I1_I.method_763(var54);
                              if (var496 == null) {
                                 var496 = new I_I_(
                                    var54, false, false, false, false, false, var417, 1, var424, (byte)0, var424, (short)-100, (short)-100, (byte)4, (byte)0
                                 );
                                 var496.I0I1 = true;
                                 I1_I.field_696.addElement(var496);
                              }
                           }
                        }
                     }

                     if (var53 == 1) {
                        int var409 = var1.method_628().readInt();
                        short var81 = var1.method_628().readByte();
                        I_Ol.II__(method_718("란롣롏롪레룼룓뢧뢆륯뤃뤫뤅립릿", 47085) + var409);
                        if (var409 == Ilol.method_808().IOI_) {
                           if (I1_I.method_763(var81) != null) {
                              Ilol.method_808().IIIl.IIII(I1_I.method_763(var81));
                           }
                        } else {
                           Ilol var306 = I1_I.method_762(var409);
                           if (var306 != null && I1_I.method_763(var81) != null) {
                              var306.IIIl.IIII(I1_I.method_763(var81));
                           }
                        }
                     }

                     if (var53 == 2) {
                        int var410 = var1.method_628().readInt();
                        int var418 = var1.method_628().readInt();
                        int var425 = var1.II_I();
                        int var430 = var1.II_I();
                        if (var410 == Ilol.method_808().IOI_) {
                           I_Ol.II__(method_718("란롣롉롪렍룩룊뢣룘뤤", 47085) + var425);
                           Ilol var307 = I1_I.method_762(var418);
                           if (var307 != null) {
                              if (Ilol.method_808().IIIl.I0IO) {
                                 var307.method_830(var425, 0, false, true);
                              } else {
                                 Ilol.method_808().IIIl.lllI = var425;
                                 Ilol.method_808().IIIl.IIIl(var307);
                              }
                           }
                        } else {
                           I_I_ var498 = I1_I.method_763(var410);
                           if (var498 != null) {
                              if (var418 == Ilol.method_808().IOI_) {
                                 if (var498.I0IO) {
                                    Ilol.method_808().method_830(var425, 0, false, true);
                                 } else {
                                    var498.lllI = var425;
                                    var498.IIIl(Ilol.method_808());
                                 }
                              } else {
                                 Ilol var308 = I1_I.method_762(var418);
                                 if (var308 != null) {
                                    if (var498.I0IO) {
                                       var308.method_830(var425, 0, false, true);
                                    } else {
                                       var498.lllI = var425;
                                       var498.IIIl(var308);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (var53 == 3) {
                        int var411 = var1.method_628().readInt();
                        int var419 = var1.method_628().readInt();
                        int var426 = var1.II_I();
                        int var431 = var1.II_I();
                        Object var309 = null;
                        var309 = Ilol.method_808().IOI_ != var411 ? I1_I.method_762(var411) : Ilol.method_808();
                        if (var309 != null) {
                           I_I_ var499 = I1_I.method_763(var419);
                           if (((Ilol)var309).IIIl != null) {
                              ((Ilol)var309).IIIl.IIII(var499);
                           }

                           if (var499 != null) {
                              var499.llIl = var426;
                              var499.I00l();
                              if (var431 == 0) {
                                 var499.field_903 = var499.llIO;
                                 var499.field_904 = var499.llI0;
                                 I1_I.method_769(IO11.IOlI, var499.field_903, var499.field_904 - var499.IIlI, 0, -2, IO1I.l_I_);
                              } else {
                                 I1_I.method_769(method_718("럀", 47085) + var431, var499.field_903, var499.field_904 - var499.IIlI, 0, -2, IO1I.l_IO);
                              }
                           }
                        }
                     }

                     if (var53 == 4) {
                     }

                     if (var53 == 5) {
                        int var412 = var1.method_628().readInt();
                        short var470 = var1.method_628().readByte();
                        int var427 = var1.method_628().readInt();
                        int var432 = var1.II_I();
                        int var433 = var1.II_I();
                        Ilol var311 = null;
                        var311 = var412 != Ilol.method_808().IOI_ ? I1_I.method_762(var412) : Ilol.method_808();
                        if (var311 == null) {
                           return;
                        }

                        if ((IOlO.method_469(var311.I_o_, var311.I_oO) & 2) == 2) {
                           var311.method_817(I1_I.field_691[var470], 0);
                        } else {
                           var311.method_817(I1_I.field_691[var470], 1);
                        }

                        I_I_ var509 = I1_I.method_763(var427);
                        if (var311.I_o_ <= var509.field_903) {
                           var311.IOI1 = 1;
                        } else {
                           var311.IOI1 = -1;
                        }

                        var311.IIII = var509;
                        var509.llIl = var433;
                        var509.I00l();
                        class_1.method_42(method_718("랾롍렓롹렟뢺", 47085), 2);
                        if (var432 == 0) {
                           var509.field_903 = var509.llIO;
                           var509.field_904 = var509.llI0;
                           I1_I.method_769(IO11.IOlI, var509.field_903, var509.field_904 - var509.IIlI, 0, -2, IO1I.l_I_);
                        } else {
                           I1_I.method_769(method_718("럀", 47085) + var432, var509.field_903, var509.field_904 - var509.IIlI, 0, -2, IO1I.l_IO);
                        }
                     }

                     if (var53 == 6) {
                        int var413 = var1.method_628().readInt();
                        if (var413 == Ilol.method_808().IOI_) {
                           Ilol.method_808().IIIl.IOl0();
                        } else {
                           Ilol var313 = I1_I.method_762(var413);
                           var313.IIIl.IOl0();
                        }
                     }

                     if (var53 != 7) {
                        break;
                     }

                     int var414 = var1.method_628().readInt();
                     if (var414 == Ilol.method_808().IOI_) {
                        Ilol.method_808().IIIl = null;

                        for (int var421 = 0; var421 < I1_I.field_696.size(); var421++) {
                           if (((I_I_)I1_I.field_696.elementAt(var421)).field_907 == var414) {
                              I1_I.field_696.removeElementAt(var421);
                           }
                        }
                     } else {
                        Ilol var314 = I1_I.method_762(var414);

                        for (int var420 = 0; var420 < I1_I.field_696.size(); var420++) {
                           if (((I_I_)I1_I.field_696.elementAt(var420)).field_907 == var414) {
                              I1_I.field_696.removeElementAt(var420);
                           }
                        }

                        if (var314 != null) {
                           var314.IIIl = null;
                        }
                     }
                     break;
                  case -94:
                     while (var1.method_628().available() > 0) {
                        short var416 = var1.method_628().readShort();
                        int var423 = var1.method_628().readInt();

                        for (int var429 = 0; var429 < Ilol.method_808().field_807.size(); var429++) {
                           I_0o var508 = (I_0o)Ilol.method_808().field_807.elementAt(var429);
                           if (var508 != null && var508.II0I == var416) {
                              if (var423 < var508.l1_O) {
                                 var508.I1IO = IO10.IIII() - (var508.l1_O - var423);
                              }

                              I_Ol.II__(
                                 method_718("럜렬롈렢렀룭룒룦뢌률뤞륢", 47085)
                                    + var508.field_408.IlIO
                                    + method_718("럍롯롄력렅룬룈뢱뢋뤹뤃", 47085)
                                    + var423
                                    + method_718("럍롯롞렸렛뢨룄뢩뢊륨뤃뤦뤎맷맱릃맽", 47085)
                                    + var508.l1_O
                              );
                           }
                        }
                     }
                     break;
                  case -93:
                     short var55 = var1.method_628().readShort();
                     Il0o.IIII = new byte[var55];

                     for (int var422 = 0; var422 < var55; var422++) {
                        Il0o.IIII[var422] = var1.method_628().readByte();
                     }
                  case -92:
                     IO10.l_lI = var1.method_628().readByte();
                     I_O1.I_10();
                     I_O1.IIIl(method_718("랎론롂렯렇룼룓뢿뢕륡", 47085), IO10.l_lI);
                     I_O1.IIIl(method_718("랁롭롘렾렳룧룈뢫뢉륡륕뤧뤍", 47085), IO1l.l_I0);
                     class_1.method_35(IO11.field_369, 8885, null);
                     break;
                  case -91:
                     byte var56 = var1.method_628().readByte();
                     class_1.field_14.II11 = new String[var56];
                     class_1.field_14.II1_ = new String[var56];

                     for (int var428 = 0; var428 < var56; var428++) {
                        class_1.field_14.II11[var428] = var1.method_628().readUTF();
                        class_1.field_14.II1_[var428] = var1.method_628().readUTF();
                     }

                     class_1.field_14.I000();
                     class_1.field_14.I__0();
                     break;
                  case -90:
                     byte var57 = var1.method_628().readByte();
                     int var58 = var1.method_628().readInt();
                     I_Ol.II__(method_718("럐렱렖롴롉룝룷뢂뢤륐륦뤝뤣맏맛맧맧맜먻먚멹먌뫮뫆몰뫔묮묒", 47085) + var57);
                     Ilol var10 = Ilol.method_808().IOI_ != var58 ? I1_I.method_762(var58) : Ilol.method_808();
                     if (var57 != -1) {
                        short var507 = var1.method_628().readShort();
                        short var521 = var1.method_628().readShort();
                        short var434 = var1.method_628().readShort();
                        byte var472 = var1.method_628().readByte();
                        if (var10 != null) {
                           if (var10.IOI_ == var58) {
                              var10.I1lo = true;
                              var10.IIlo = var472;
                              if (var10.IIlo != 0) {
                                 var10.I_I1 = false;
                                 var10.I10l = false;
                              }
                           } else if (var10 != null) {
                              var10.I1lo = true;
                              var10.IIlo = var472;
                           }

                           if (var507 != -1) {
                              var10.field_837 = var507;
                           }

                           if (var521 != -1) {
                              var10.I0II = var521;
                           }

                           if (var434 != -1) {
                              var10.field_838 = var434;
                           }
                        }
                     }

                     if (var57 == -1 && var10 != null) {
                        var10.I1lo = false;
                        var10.IIlo = 0;
                     }

                     if (var10 == null) {
                     }
                     break;
                  case -88:
                     class_1.III_();
                     class_1.field_38.I0l_();
                     break;
                  case -87:
                     I_Ol.II__(method_718("랪롉롿롪렼룘룣뢇뢱륁를뤆뤠맔맞릞", 47085) + var1.method_628().available() + method_718("럍롮롒렾렌룻", 47085));
                     var1.method_628().mark(100000);
                     method_709(var1.method_628(), true);
                     var1.method_628().reset();
                     byte[] var91 = new byte[var1.method_628().available()];
                     var1.method_628().readFully(var91);
                     byte[] var92 = new byte[]{I1_I.II1o};
                     I_O1.method_555(method_718("랣롞롏렫렝룩룱뢣뢗륷륊뤭뤏", 47085), var92);
                     I1o_.IO0o = false;
                     if (I1_I.II_1 == I1_I.II1o && I1_I.II__ == I1_I.field_708 && I1_I.II_O == I1_I.II_I && I1_I.II_0 == I1_I.II_l) {
                        I_Ol.II__(I1_I.II_1 + method_718("럁", 47085) + I1_I.II__ + method_718("럁", 47085) + I1_I.II_O + method_718("럁", 47085) + I1_I.II_0);
                        I1_I.method_748();
                        I1_I.I01l();
                        I1_I.method_748();
                        I1_I.method_747();
                        I1_I.method_748();
                        I1_I.I01I();
                        I1_I.method_748();
                        I1_I.I011();
                        I_0_.method_504().IoOO();
                        return;
                     }
                     break;
                  case -86:
                     short var59 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랞롩롙렼렌룺뢇뢡뢐륭뤃뤴뤄릠맸맗림릓먻멞먰먛뫿몖몴몗뭧뭛묾묞뮯뮓믭", 47085) + var59);
                     if (var59 == 0) {
                        int var435 = var1.method_628().readInt();
                        I1_I.method_748().IIO0(var435);
                     }

                     if (var59 == 1) {
                        int var436 = var1.method_628().readInt();
                        Ilol var527 = I1_I.method_762(var436);
                        if (var527 == null) {
                           return;
                        }

                        class_1.field_14.IIIO(var527);
                        class_1.field_14.I__0();
                        I_0_.method_504().II01(var436);
                     }

                     if (var59 == 2) {
                        byte var82 = var1.method_628().readByte();

                        for (int var439 = 0; var439 < class_1.field_14.IIol.size(); var439++) {
                           I101 var528 = (I101)class_1.field_14.IIol.elementAt(var439);
                           if (var528.lIO_ == var82) {
                              class_1.field_14.IIol.removeElement(var528);
                              break;
                           }
                        }
                     }

                     if (var59 == 5) {
                     }

                     if (var59 == 6) {
                        class_1.field_14.I0lO = true;
                        if (class_1.field_15 != null) {
                           class_1.field_15.I0lO = true;
                        }

                        class_1.field_14.IIo1.removeAllElements();
                        if (class_1.field_15 != null) {
                           class_1.field_15.IIo1.removeAllElements();
                        }

                        int var437 = var1.method_628().readInt();
                        byte var529 = var1.method_628().readByte();
                        I_Ol.II__(method_718("랄롸롎렧롉룻룎뢼뢀뤤뤞륢", 47085) + var529);

                        for (int var534 = 0; var534 < var529; var534++) {
                           I101 var547 = new I101();
                           var547.field_543 = I1oI.method_642(var1.method_628().readShort());
                           var547.I1l1 = var1.method_628().readInt();
                           int var441 = var1.method_628().readUnsignedByte();
                           if (var441 != 0) {
                              var547.field_542 = new I100[var441];

                              for (int var443 = 0; var443 < var547.field_542.length; var443++) {
                                 int var479 = var1.method_628().readUnsignedByte();
                                 int var448 = var1.method_628().readUnsignedShort();
                                 if (var479 != -1) {
                                    var547.field_542[var443] = new I100(var479, var448);
                                    var547.lIOo = class_1.field_14.method_601(var547);
                                 }
                              }
                           }

                           if (class_1.field_15 != null) {
                              class_1.field_15.IIo1.addElement(var547);
                           } else {
                              class_1.field_14.IIo1.addElement(var547);
                           }
                        }

                        if (class_1.field_15 != null) {
                           class_1.field_15.IIl1(false);
                           class_1.field_15.ll_O = var437;
                        } else {
                           class_1.field_14.ll_O = var437;
                           if (class_1.field_14.ll_0 == 2) {
                              class_1.field_14.IIl1(false);
                           }
                        }
                     }

                     if (var59 == 7) {
                        I1OO.I__o();
                        if (class_1.field_14.I_10) {
                           class_1.field_14.I__o();
                        }
                     }
                     break;
                  case -85:
                     I_Ol.II__(method_718("랮롍롻롪렪룀룦뢇뢤륅륢뤃뤠링맞맿릜립멚멻먘먹뫖뫷몔몵뭒뭳묐묱믎믯뮌뮭뱊뱫밈방볆볧버벥뵂뵣봀봡봾뷟뷼붝붺", 47085));
                     byte var60 = var1.method_628().readByte();
                     if (var60 == 0) {
                        int var438 = var1.method_628().readUnsignedShort();
                        I_Ol.II__(method_718("랁롩롅렾롉뢵", 47085) + var438);
                        byte[] var526 = new byte[var438];
                        var1.method_628().read(var526, 0, var438);
                        I1_I.Il_I = Image.createImage(var526, 0, var438);
                        I1_I.method_748().IlII = method_718("럀렡렆롧롄", 47085);
                        I1_I.method_748().field_725 = var1.method_628().readUTF();
                        I1_I.method_748().IlO0 = new int[I1_I.method_748().field_725.length()];
                        I1_I.method_748().IIIO = new I_I_();
                        I1_I.method_748().IIl = null;
                     }

                     if (var60 == 1) {
                        I_IO.I0l_ = true;
                     }

                     if (var60 == 2) {
                        I_IO.I0l1 = true;
                        I1_I.method_748().IIl = I1_I.method_748().IIlI;
                     }
                     break;
                  case -84:
                     int var61 = var1.method_628().readUnsignedByte();
                     I_I_ var93 = null;

                     try {
                        var93 = (I_I_)I1_I.field_696.elementAt(var61);
                     } catch (Exception var231) {
                     }

                     if (var93 != null) {
                        var93.llI1 = var1.method_628().readInt();
                     }
                     break;
                  case -83:
                     byte var94 = var1.method_628().readByte();
                     if (var94 == 0) {
                        short var440 = var1.method_628().readShort();
                        short var545 = var1.method_628().readShort();
                        int var478 = var1.method_628().readUnsignedByte();
                        int var447 = var1.method_628().readInt();
                        String var555 = var1.method_628().readUTF();
                        short var561 = var1.method_628().readShort();
                        short var566 = var1.method_628().readShort();
                        byte var572 = var1.method_628().readByte();
                        if (var572 == 1) {
                           I1_I.method_748().IO11 = true;
                        } else {
                           I1_I.method_748().IO11 = false;
                        }

                        I1_I.method_748().Iool = var561;
                        I1_I.method_748().Ioo1 = var566;
                        I_Ol.II__(
                           method_718("랕롞렖롪", 47085)
                              + var561
                              + method_718("럍롵롹롷롉", 47085)
                              + var566
                              + method_718("럍렧렀롡롂뢣뢌룭룎뤯뤈륩륊릫릴릕맶맗먰먑멲멓몼몝뫾뫟문묙뭺뭛뮤뮅믦믇밠밁뱢뱃벬벍", 47085)
                        );
                        if (Ilol.method_808().IOI_ == var447) {
                           class_1.field_14.Iol_();
                           I1_I.method_748().IIll(true);
                        } else if (IOlO.l1oI == var440 && IOlO.l1ol == var478) {
                           I1_I.method_748().IIll(false);
                        } else if (IO1l.l_I0 > 1) {
                           I1_I.method_748().I0_l();
                        }

                        I1_I.method_748().Ioo_ = var440;
                        I1_I.method_748().IooO = var478;
                        I1_I.method_748().I0_I();
                        if (IOlO.l1oI == var440 && IOlO.l1ol == var478) {
                           I1_I.method_748().IO1_ = true;
                           I1_I.method_748().Io00 = 0;
                           I1_I.method_748().Io0o = var561;
                           I1_I.method_748().field_721 = var566;
                        }
                     }

                     if (var94 == 1) {
                        I_Ol.II__(method_718("란롭롛롪렻룁룣룦룘뤤", 47085) + I1_I.method_748().Ioo_ + method_718("럍롶롄려렌뢨룵뢏뢡뤹뤃", 47085) + I1_I.method_748().IooO);
                        I_Ol.II__(method_718("란롭롛롪렠료뢇룻룅", 47085) + IOlO.l1oI + method_718("럍롶롄려렌뢨룮뢂룘뤤", 47085) + IOlO.l1ol);

                        for (int var546 = 0; var546 < 8; var546++) {
                           I1lI.method_693(17);
                           I1lI.method_693(25);
                           I1lI.method_693(20);
                        }

                        I1_I.method_748().IO1l = false;
                        I1_I.method_748().IO1_ = false;
                        I1_I.method_748().IO1O = false;
                        if (IOlO.l1oI == I1_I.method_748().Ioo_ && IOlO.l1ol == I1_I.method_748().IooO) {
                           I1_I.method_748().I0_I();
                        } else {
                           I1_I.method_748().IO1l = false;
                           if (I1_I.method_748().IO11) {
                              I1_I.method_748().IO11 = false;
                           }
                        }
                     }

                     if (var94 != 2) {
                     }
                     break;
                  case -82:
                     byte var62 = var1.method_628().readByte();
                     IOlO.field_322 = new int[var62][][];
                     IOlO.field_321 = new int[var62][];

                     for (int var442 = 0; var442 < var62; var442++) {
                        byte var544 = var1.method_628().readByte();
                        IOlO.field_321[var442] = new int[var544];
                        IOlO.field_322[var442] = new int[var544][];

                        for (int var446 = 0; var446 < var544; var446++) {
                           IOlO.field_321[var442][var446] = var1.method_628().readInt();
                           byte var480 = var1.method_628().readByte();
                           IOlO.field_322[var442][var446] = new int[var480];

                           for (int var452 = 0; var452 < var480; var452++) {
                              IOlO.field_322[var442][var446][var452] = var1.method_628().readByte();
                           }
                        }
                     }
                     break;
                  case -81:
                     byte var63 = var1.method_628().readByte();
                     if (var63 == 0) {
                        String var540 = var1.method_628().readUTF();
                        String var554 = var1.method_628().readUTF();
                        class_1.field_14.I0o0();
                        class_1.field_14.II_l = IO1I.field_306.method_459(var540, I_1o.llOI);
                        class_1.field_14.II_1 = IO1I.IIlI.method_459(var554, I_1o.llOI);
                        class_1.field_14.I__0();
                     }

                     if (var63 == 1) {
                        class_1.field_14.II0O.removeAllElements();
                        byte var83 = var1.method_628().readByte();

                        for (int var444 = 0; var444 < var83; var444++) {
                           byte var84 = var1.method_628().readByte();

                           for (int var451 = 0; var451 < Ilol.method_808().field_811.length; var451++) {
                              I101 var541 = Ilol.method_808().field_811[var451];
                              if (var541 != null && var541.lIO_ == var84) {
                                 var541.IO0I = true;
                                 class_1.field_14.II0O.addElement(var541);
                              }
                           }
                        }

                        if (class_1.field_14.I_10) {
                           class_1.field_14.I0oo();
                        }
                     }

                     if (var63 == 2) {
                        class_1.field_14.IlIl = 0;
                        class_1.field_14.method_607(0);
                     }

                     if (var63 == 3) {
                        class_1.field_14.IlIl = 1;
                        class_1.field_14.method_607(0);
                     }

                     if (var63 == 4) {
                        short var473 = var1.method_628().readShort();
                        class_1.field_14.field_500 = (short)var473;
                        class_1.field_14.IlIl = 0;
                        class_1.field_14.method_607(1);
                     }

                     if (var63 == 5) {
                        short var474 = var1.method_628().readShort();
                        class_1.field_14.field_500 = (short)var474;
                        class_1.field_14.IlIl = 0;
                        class_1.field_14.method_607(2);
                     }

                     if (var63 == 6) {
                        short var475 = var1.method_628().readShort();
                        short var542 = var1.method_628().readShort();
                        class_1.field_14.IlIl = 0;
                        class_1.field_14.method_607(3);
                        class_1.field_14.IIO0 = (short)var475;
                        class_1.field_14.field_500 = var542;
                     }

                     if (var63 == 7) {
                        short var476 = var1.method_628().readShort();
                        class_1.field_14.field_500 = (short)var476;
                        class_1.field_14.IlIl = 0;
                        class_1.field_14.method_607(4);
                     }

                     if (var63 == 8) {
                        class_1.field_14.field_500 = -1;
                        class_1.field_14.IlIl = 1;
                        class_1.field_14.method_607(4);
                     }

                     short var477 = 21;

                     try {
                        var477 = var1.method_628().readShort();
                     } catch (Exception var230) {
                     }

                     for (int var445 = 0; var445 < I1_I.IIOI.size(); var445++) {
                        I_11 var543 = (I_11)I1_I.IIOI.elementAt(var445);
                        if (var543.field_870.lll0 == var477) {
                           class_1.field_14.l1I0 = var543.I_o_ - I1_I.field_689;
                           class_1.field_14.l1Io = var543.I_oO - I1_I.Io1I;
                           class_1.field_14.l1IO = var477;
                           break label5115;
                        }
                     }
                     break;
                  case -80:
                     byte var64 = var1.method_628().readByte();
                     I1OO.I__o();
                     if (var64 == 0) {
                        class_1.field_14.IIoI.removeAllElements();
                        int var95 = var1.method_628().readUnsignedByte();

                        for (int var65 = 0; var65 < var95; var65++) {
                           Ilol var96 = new Ilol();
                           var96.IOI_ = var1.method_628().readInt();
                           var96.field_837 = var1.method_628().readShort();
                           var96.IOoo = var1.method_628().readShort();
                           var96.I0II = var1.method_628().readShort();
                           var96.field_838 = var1.method_628().readShort();
                           var96.I0Il = var1.method_628().readUnsignedByte();
                           var96.IIO1 = var1.method_628().readUTF();
                           boolean var560 = var1.method_628().readBoolean();
                           I1O0 var565 = new I1O0(IO11.IO_0 + method_718("럗렬", 47085) + var1.method_628().readUTF());
                           var565.IIll = var96;
                           var565.IOO0 = var560;
                           class_1.field_14.IIoI.addElement(var565);
                        }

                        class_1.field_14.I0oI();
                        class_1.field_14.I__0();
                     }

                     if (var64 == 3) {
                        I_lO var538 = class_1.field_14.IIoI;
                        int var449 = var1.method_628().readInt();
                        I_Ol.II__(method_718("랂롢롇렣렇룭뢇뢩뢃륢륏뤫뤏맥릿맗릹링", 47085) + var449);

                        for (int var453 = 0; var453 < var538.size(); var453++) {
                           I1O0 var552 = (I1O0)var538.elementAt(var453);
                           if (var552.IIll != null && var552.IIll.IOI_ == var449) {
                              I_Ol.II__(method_718("랂롢롇렣렇룭뢚룦", 47085) + var552.IOO0);
                              var552.IOO0 = var1.method_628().readBoolean();
                              break;
                           }
                        }
                     }

                     if (var64 != 2) {
                        break;
                     }

                     I_lO var539 = class_1.field_14.IIoI;
                     int var450 = var1.method_628().readInt();

                     for (int var454 = 0; var454 < var539.size(); var454++) {
                        I1O0 var553 = (I1O0)var539.elementAt(var454);
                        if (var553.IIll != null && var553.IIll.IOI_ == var450) {
                           var539.removeElement(var553);
                           break;
                        }
                     }

                     if (class_1.field_14.I_10) {
                        class_1.field_14.I0o1();
                     }
                     break;
                  case -79:
                     I1OO.I__o();
                     int var66 = var1.method_628().readInt();
                     Ilol var97 = class_1.field_14.field_484;
                     if (var97 == null) {
                        return;
                     }

                     var97.Illo = var1.method_628().readLong();
                     var97.IIO_ = var1.method_628().readUTF();
                     break;
                  case -77:
                     short var98 = var1.method_628().readShort();
                     I_oo.IIII = new byte[var98];
                     I_oo.II0l = var98;
                     I_oo.field_402 = new I_oO[var98];

                     for (int var455 = 0; var455 < var98; var455++) {
                        I_oo.IIII[var455] = var1.method_628().readByte();
                     }
                     break;
                  case -76:
                     byte var67 = var1.method_628().readByte();
                     if (var67 != 0) {
                        if (var67 == 1) {
                           int var456 = var1.method_628().readUnsignedByte();
                           if (Ilol.method_808().field_810[var456] != null) {
                              Ilol.method_808().field_810[var456].I1I_ = true;
                           }
                        }
                        break;
                     }

                     byte var571 = var1.method_628().readByte();
                     if (var571 <= 0) {
                        return;
                     }

                     Ilol.method_808().field_810 = new Il0I[var571];

                     for (int var579 = 0; var579 < var571; var579++) {
                        Ilol.method_808().field_810[var579] = new Il0I();
                        Ilol.method_808().field_810[var579].II_0 = var579 + 1 + method_718("럃렬", 47085) + var1.method_628().readUTF();
                        Ilol.method_808().field_810[var579].II_o = var1.method_628().readUTF();
                        Ilol.method_808().field_810[var579].I_OO = var1.method_628().readShort();
                        Ilol.method_808().field_810[var579].I1I1 = var1.method_628().readBoolean();
                        Ilol.method_808().field_810[var579].I1I_ = var1.method_628().readBoolean();
                     }

                     class_1.field_14.I00o();
                     class_1.field_14.I__0();
                     break;
                  case -74:
                     if (I_0l.I0_1) {
                        return;
                     }

                     byte var250;
                     if ((var250 = var1.method_628().readByte()) == 0) {
                        int var260 = var1.method_628().readInt();
                        String var389;
                        int var10000 = (var389 = I_O1.method_557(method_718("랿롩롘렜렌룺룔뢯뢊륪", 47085))) != null && var389 != "" ? Integer.parseInt(var389) : -1;
                        int var289 = var10000;
                        if (var10000 != -1 && var289 == var260) {
                           I_Ol.II__(method_718("랁롣롌렣렇뢨룉뢡뢄륽", 47085));
                           I_oo.Io0O();
                           class_28.I1I_ = null;
                           I_0l.I0_O = true;
                           if (class_1.field_12 != class_1.field_17) {
                              class_1.field_38.I0l_();
                           }
                        } else {
                           class_1.field_38.Io_l();
                        }
                     }

                     if (var250 == 1) {
                        I_0l.l1_l = var1.method_628().readShort();
                        I_0_.method_504().method_540((byte)2, (I_lO)null);
                     }

                     if (var250 == 2) {
                        try {
                           I__1 = true;
                           class_1.III_();
                           String[] var315 = I_Ol.method_563(var1.method_628().readUTF(), method_718("럂", 47085), 0);
                           String var570 = method_718("랕", 47085) + IO1l.l_I0 + var315[var315.length - 1];
                           int var269;
                           byte[] var578 = new byte[var269 = var1.method_628().readInt()];
                           var1.method_628().read(var578, 0, var269);
                           I_Ol.II__(
                              method_718("랝롭롟렢롉룻룆뢰뢀뤹뤃", 47085)
                                 + var570
                                 + method_718("럍롨롊렾레뢨룔뢧뢓륡뤃뤮뤄맮맫릃맽", 47085)
                                 + var578.length
                                 + method_718("럍렱렖롷롉", 47085)
                                 + I_0l.percent
                                 + method_718("럈렬", 47085)
                                 + I_0l.l1_l
                           );
                           I_O1.method_555(var570, var578);
                           I_0l.percent = ++I_0l.l1_1 * 100 / I_0l.l1_l;
                           if (IO10.l_lI != 5) {
                           }
                        } catch (Exception var229) {
                           class_1.method_35(IO11.I1O0, 8885, null);
                        }
                     }

                     if (var250 == 3) {
                        I__1 = false;
                        int var261 = var1.method_628().readInt();
                        I_Ol.II__(method_718("랁롭롘렾롉룾룂뢴뢖륭륌뤬륜릠", 47085) + var261);
                        I_O1.III1(method_718("랿롩롘렜렌룺룔뢯뢊륪", 47085), String.valueOf(var261));
                        I_0_.method_504().method_540((byte)3, (I_lO)null);
                        class_1.III_();
                        class_28.I1I_ = null;
                        I_oo.Io0O();
                        System.gc();
                        I_0l.I0__ = true;
                        I_0l.I0_O = true;
                        I1_I.method_748().I01O();
                        if (class_1.field_12 != class_1.field_17) {
                           class_1.field_38.I0l_();
                        }
                     }
                     break;
                  case -70:
                     I_Ol.II__(method_718("랯롅롬롪려룍룴뢕뢤륃륦륢륏릮릱릐맳맒먵먔멷멖몹몘뫻뫚묽묜뭿뭞뮡뮀믣믂밥밄뱧뱆벩번볫볊봭봌뵯뵎뵑붰붓뷲뷕", 47085));
                     class_1.III_();
                     short var68 = var1.method_628().readShort();
                     String var99 = var1.method_628().readUTF();
                     I_11 var100;
                     (var100 = new I_11(-1, 0, 0, 0, 0, 0)).IO_l = var68;
                     Ilo1.method_801(var99, 100000, var100);
                     byte var101;
                     if ((var101 = var1.method_628().readByte()) == 0) {
                        Ilo1.IIII.IIIl = new I1Il(IO11.field_358, Ilo1.IIII, 1001, null);
                        Ilo1.IIII.IIIl.field_624 = class_1.field_11 / 2 - 35;
                        Ilo1.IIII.IIIl.field_625 = class_1.IIlI - 35;
                     }

                     if (var101 == 1) {
                        String var588 = var1.method_628().readUTF();
                        String var368 = var1.method_628().readUTF();
                        Ilo1.IIII.IIIl = new I1Il(var368, Ilo1.IIII, 1000, var588);
                        Ilo1.IIII.IIIl.field_624 = class_1.field_11 / 2 - 75;
                        Ilo1.IIII.IIIl.field_625 = class_1.IIlI - 35;
                        Ilo1.IIII.III1 = new I1Il(IO11.field_358, Ilo1.IIII, 1001, null);
                        Ilo1.IIII.III1.field_624 = class_1.field_11 / 2 + 11;
                        Ilo1.IIII.III1.field_625 = class_1.IIlI - 35;
                     }
                     break;
                  case -69:
                     Ilol.method_808().IIl1 = var1.method_628().readShort();
                     break;
                  case -68:
                     Ilol.method_808().IO_0 = var1.method_628().readShort();
                     break;
                  case -67:
                     this.field_620++;
                     int var342 = var1.method_628().readInt();

                     byte[] var102;
                     try {
                        var102 = I_1l.method_623(var1);
                        if (I_oo.field_402 != null) {
                           I_oo.field_402[var342].I1I1 = method_710(var102);
                        }
                     } catch (Exception var242) {
                        var102 = null;
                        if (I_oo.field_402 != null && I_oo.field_402[var342] != null) {
                           I_oo.field_402[var342].I1I1 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                        }
                     }

                     if (var102 != null) {
                        I_O1.method_555(IO1l.l_I0 + method_718("랾롡롊렦렅", 47085) + var342, var102);
                     }
                     break;
                  case -66:
                     short var343 = var1.method_628().readShort();
                     byte[] var103 = I_1l.method_623(var1);
                     I1l0 var104 = I1ll.method_688(var343);
                     byte var105;
                     if ((var105 = var1.method_628().readByte()) == 0) {
                        var104.method_683(var103);
                     } else {
                        var104.method_682(var103, var105);
                     }

                     byte[] var106 = I_1l.method_623(var1);
                     var104.II01 = Image.createImage(var106, 0, var106.length);
                     break;
                  case -65:
                     I1OO.I__o();
                     int var107 = var1.method_628().readInt();
                     byte var108 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랹롉롧렏령룇룵뢒룅뤪뤍륬륏릮릱릐맳맒먵먔멷멖몹몘뫻뫚묽묜뭿뭞뮡뮀믣믂밥밄뱧뱆벩번볫볊봭봌뵯뵎뵑붰붓뷲뷕븴븗빶빙뺸뺛뻺뻝뼼", 47085) + var108);
                     if (var108 == 0) {
                        break;
                     }

                     if (Ilol.method_808().IOI_ == var107) {
                        I1_I.method_748().III0 = null;
                        if (var108 == 0 || var108 == 1 || var108 == 3) {
                           int var10008 = var108 != 1 ? var108 : Ilol.method_808().IOIO;
                           new IOl1(Ilol.method_808().I_o_, Ilol.method_808().I_oO, Ilol.method_808().field_837, Ilol.method_808().IOI1, 0, true, var10008);
                        }
                     } else {
                        Ilol var608 = I1_I.method_762(var107);
                        if ((var108 == 0 || var108 == 1 || var108 == 3) && var608 != null) {
                           var608.I11I = true;
                           IOl1 var612 = new IOl1(var608.I_o_, var608.I_oO, var608.field_837, var608.IOI1, 0, false, var108 != 1 ? var108 : var608.IOIO);
                           var612.field_327 = var107;
                           var612.II1_ = var608;
                           IOl1.method_475(var612);
                        }

                        if (var108 == 2) {
                           var608.I__o();
                        }
                     }
                     break;
                  case -64:
                     int var259 = var1.method_628().readInt();
                     int var288 = var1.method_628().readUnsignedByte();
                     Ilol var109;
                     if (var259 == Ilol.method_808().IOI_) {
                        var109 = Ilol.method_808();
                     } else {
                        var109 = I1_I.method_762(var259);
                     }

                     if (var109 == null) {
                        return;
                     }

                     var109.I0Il = var288;

                     for (int var385 = 0; var385 < 54; var385++) {
                        var109.method_842(0, var385 + 201);
                     }

                     if (var109.I0Il >= 201 && var109.I0Il < 255) {
                        I1ll var611;
                        (var611 = new I1ll(var109.I0Il, var109, 2, -1, 10, (byte)1)).I_O0 = 5;
                        var109.method_841(var611);
                     }

                     I_Ol.II__(
                        method_718("랎롡롏롰롄뢾뢓룦뢰륔륧뤃뤵맅릿맼릜릻먻멪먕먹뫒뫤뫵뫉묳", 47085)
                           + (var109 == null ? "" : var109.IIO1)
                           + var259
                           + method_718("럍롎롪렍롉룁룣룻룅", 47085)
                           + var288
                     );
                     break;
                  case -63:
                     I_Ol.II__(method_718("랪롉롿롪렫룉룠", 47085));
                     int var258 = var1.method_628().readUnsignedByte();
                     byte var320 = var1.method_628().readByte();
                     Iloo var386;
                     (var386 = new Iloo()).IoIl = var258;
                     if (var320 <= 0) {
                        break;
                     }

                     var386.IIIl = new short[var320];

                     for (int var384 = 0; var384 < var320; var384++) {
                        var386.IIIl[var384] = var1.method_628().readShort();
                        I_Ol.II__(method_718("랤롈렖롪롉", 47085) + var258 + method_718("럍롪롙렫렄룭뢚룦", 47085) + var386.IIIl[var384]);
                     }

                     Iloo.IIII.put(String.valueOf(var258), var386);
                     break;
                  case -62:
                     int var276 = var1.method_628().readUnsignedByte();
                     byte var380 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랎롡롏롰롉뢥뢑룴룅륇륯뤃뤯맟맖맳릜릻멞먚먰먜몪몖", 47085) + var276 + method_718("럍롢롢렧레룯룂룻룅", 47085) + var380);
                     Iloo var37;
                     if (var380 <= 0 || (var37 = Iloo.method_724((short)var276)) == null) {
                        break;
                     }

                     var37.IIIl = new short[var380];

                     for (int var383 = 0; var383 < var380; var383++) {
                        var37.IIIl[var383] = var1.method_628().readShort();
                        if (var37.IIIl[var383] > 0) {
                           I_oo.II_I.addElement(String.valueOf(var37.IIIl[var383]));
                        }
                     }
                     break;
                  case -61:
                     int var275;
                     if ((var275 = var1.method_628().readInt()) != Ilol.method_808().IOI_) {
                        if (I1_I.method_762(var275) != null) {
                           I1_I.method_762(var275).IO1I = var1.method_628().readInt();
                           if (I1_I.method_762(var275).IO1I == -2) {
                              I1_I.method_762(var275).I_Il = true;
                           }
                        }
                     } else if (Ilol.method_808().field_801 != null) {
                        Ilol.method_808().field_801.II0I = var1.method_628().readInt();
                     }
                     break;
                  case -60:
                     int var110 = var1.method_628().readInt();
                     int var111 = -1;
                     if (var110 == Ilol.method_808().IOI_) {
                        var1.method_628().readByte();
                        var1.method_628().readByte();
                        var111 = var1.method_628().readInt();
                     } else {
                        Ilol var615;
                        if ((var615 = I1_I.method_762(var110)) == null) {
                           return;
                        }

                        if (var615.field_833 != null) {
                           var615.method_821(var615.I_o_, var615.I_oO, 10);
                           var615.I_o_ = var615.field_833.field_507;
                           var615.I_oO = var615.field_833.lI0I;
                        }

                        int var457 = var1.method_628().readUnsignedByte();
                        if ((IOlO.method_469(var615.I_o_, var615.I_oO) & 2) == 2) {
                           var615.method_817(I1_I.field_691[var457], 0);
                        } else {
                           var615.method_817(I1_I.field_691[var457], 1);
                        }

                        Ilol[] var399 = new Ilol[var1.method_628().readByte()];

                        int var374;
                        for (var374 = 0; var374 < var399.length; var374++) {
                           Ilol var620;
                           if ((var111 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                              var620 = Ilol.method_808();
                              if (!I1_I.IO_l && I1_I.field_723 && I1_I.IO_I) {
                                 I_0_.method_504().II0O(-1);
                                 I1_I.IO_l = true;
                              }
                           } else {
                              var620 = I1_I.method_762(var111);
                           }

                           var399[var374] = var620;
                           if (var374 == 0) {
                              if (var615.I_o_ <= var620.I_o_) {
                                 var615.IOI1 = 1;
                              } else {
                                 var615.IOI1 = -1;
                              }
                           }
                        }

                        if (var374 > 0) {
                           var615.IIIl = new Ilol[var374];

                           for (int var375 = 0; var375 < var615.IIIl.length; var375++) {
                              var615.IIIl[var375] = var399[var375];
                           }

                           var615.IIII = null;
                           var615.IIIl = var615.IIIl[0];
                        }
                     }

                     try {
                        if (var1.method_628().readByte() == 1) {
                           byte var616 = var1.method_628().readByte();
                           if (var111 == Ilol.method_808().IOI_) {
                              Ilol var353 = Ilol.method_808();
                              int var625 = var1.II_I();
                              var353.I11O = var1.method_628().readBoolean();
                              if (var353.I11O) {
                                 Ilol.field_830 = true;
                              }

                              boolean var621 = var1.method_628().readBoolean();
                              var353.I11_ = var621;
                              var353.I111 = false;
                              var353.II10 = var625;
                              if (var616 == 0) {
                                 var353.method_830(var625, 0, var621, false);
                              }
                           } else {
                              Ilol var354;
                              if ((var354 = I1_I.method_762(var111)) == null) {
                                 return;
                              }

                              int var626 = var1.II_I();
                              var354.I11O = var1.method_628().readBoolean();
                              boolean var622 = var1.method_628().readBoolean();
                              var354.I11_ = var622;
                              var354.I111 = false;
                              var354.II10 = var626;
                              if (var616 == 0) {
                                 var354.method_830(var626, 0, var622, false);
                              }
                           }
                        }
                     } catch (Exception var235) {
                     }
                     break;
                  case -59:
                     byte var379 = var1.method_628().readByte();
                     I1_I var112 = I1_I.method_748();
                     int var69 = var1.method_628().readInt();
                     var1.method_628().readInt();
                     var112.method_772(var69, var1.method_628().readUTF(), var379);
                     break;
                  case -57:
                     String var40 = var1.method_628().readUTF();
                     int var274 = var1.method_628().readInt();
                     int var257 = var1.method_628().readInt();
                     I1_I.method_748().method_749(var40, var274, var257);
                     break;
                  case -53:
                     I_Ol.II__(method_718("랠롕렋렉력룉룩룦뢬륊륥뤍", 47085));
                     I1OO.I__o();
                     int var271 = var1.method_628().readInt();
                     I_Ol.II__(method_718("랎론롊려렠룬뢚룦", 47085) + var271);
                     if (var271 == -1) {
                        Ilol.method_808().field_801 = null;
                        class_27.field_631.removeAllElements();
                        if (class_1.field_14.II00 != null) {
                           class_1.field_14.II00.removeAllElements();
                        }

                        if (class_1.field_14.II0o != null) {
                           class_1.field_14.II0o.removeAllElements();
                        }

                        if (class_1.field_12 == I1_I.method_748()) {
                           class_1.field_14.IoIo();
                        }

                        return;
                     }

                     class_1.field_14.field_466 = null;
                     if (Ilol.method_808().field_801 == null) {
                        Ilol.method_808().field_801 = new Ilo0();
                     }

                     Ilol.method_808().field_801.II0I = var271;
                     Ilol.method_808().field_801.II0o = var1.method_628().readUTF();
                     Ilol.method_808().field_801.field_633 = var1.method_628().readUTF();
                     Ilol.method_808().field_801.I_O0 = var1.method_628().readUnsignedByte();
                     Ilol.method_808().field_801.IIoI = var1.method_628().readUTF();
                     Ilol.method_808().field_801.IIol = var1.method_628().readUTF();
                     Ilol.method_808().field_801.IIOl = var1.method_628().readUnsignedByte();
                     Ilol.method_808().field_801.IIlI = var1.method_628().readUnsignedByte();
                     Ilol.method_808().III_ = var1.method_628().readByte();
                     Ilol.method_808().field_801.IoII = var1.method_628().readInt();
                     Ilol.method_808().field_801.IIO_ = var1.method_628().readByte();
                     class_1.field_14.II0o = new I_lO(method_718("랪롭롆렯렪룩룉뢰뢄륷뤍뤲뤀맮맺맒맳릑멢멷먼먕뫵뫓몧뫔", 47085));

                     for (int var272 = 0; var272 < Ilol.method_808().field_801.IIOl; var272++) {
                        class_18 var459;
                        (var459 = new class_18()).IoIl = var1.method_628().readInt();
                        var459.IIOI = var1.method_628().readShort();
                        var459.IIII = var1.method_628().readShort();
                        var459.IIOl = var1.method_628().readShort();
                        var459.IIO1 = var1.method_628().readShort();
                        var459.IIoI = var1.method_628().readUTF();
                        var459.II1_ = var1.method_628().readByte();
                        var459.IIo_ = var1.method_628().readUTF();
                        var459.IIO1 = var1.method_628().readInt();
                        var459.IIO_ = var1.method_628().readInt();
                        var459.IIO0 = var1.method_628().readInt();
                        var459.IoII = var1.method_628().readInt();
                        var459.Ill_ = I_1l.III1(var1.method_628().readInt());
                        class_1.field_14.II0o.addElement(var459);
                     }

                     var271 = var1.method_628().readUnsignedByte();

                     for (int var256 = 0; var256 < var271; var256++) {
                        method_711(var1, -1);
                     }

                     if (class_1.field_14.I0lo || class_1.field_14.I1l_ || class_1.field_14.field_487) {
                        class_1.field_14.IoIo();
                     }
                     break;
                  case -52:
                     byte var378;
                     if ((var378 = var1.method_628().readByte()) == 0) {
                        class_18 var70;
                        (var70 = new class_18()).IoIl = var1.method_628().readInt();
                        var70.IIOI = var1.method_628().readShort();
                        var70.IIII = var1.method_628().readShort();
                        var70.IIOl = var1.method_628().readShort();
                        var70.IIO1 = var1.method_628().readShort();
                        var70.IIoI = var1.method_628().readUTF();
                        var70.II1_ = var1.method_628().readByte();
                        var70.IIo_ = var1.method_628().readUTF();
                        var70.IIO1 = var1.method_628().readInt();
                        var70.IIO_ = var1.method_628().readInt();
                        var70.IIO0 = var1.method_628().readInt();
                        var70.Ill_ = I_1l.III1(var1.method_628().readInt());
                        if (class_1.field_14.II0o == null) {
                           class_1.field_14.II0o = new I_lO(method_718("람롡롎렉레룦룑뢧뢖뤪륓뤣뤏맥맳릐린릅멖멟먴먚뫲뫄", 47085));
                        }

                        class_1.field_14.II0o.addElement(var70);
                        class_1.field_14.IoI0();
                     }

                     if (var378 == 1) {
                        class_1.field_14.II0o.removeElementAt(var1.method_628().readByte());
                        class_1.field_14.field_475--;
                        class_1.field_14.IoI0();
                     }

                     if (var378 != 2) {
                        break;
                     }

                     class_18 var458;
                     (var458 = new class_18()).IoIl = var1.method_628().readInt();
                     var458.IIOI = var1.method_628().readShort();
                     var458.IIII = var1.method_628().readShort();
                     var458.IIOl = var1.method_628().readShort();
                     var458.IIO1 = var1.method_628().readShort();
                     var458.IIoI = var1.method_628().readUTF();
                     var458.II1_ = var1.method_628().readByte();
                     var458.IIo_ = var1.method_628().readUTF();
                     var458.IIO1 = var1.method_628().readInt();
                     var458.IIO_ = var1.method_628().readInt();
                     var458.IIO0 = var1.method_628().readInt();
                     var458.Ill_ = I_1l.III1(var1.method_628().readInt());

                     for (int var255 = 0; var255 < class_1.field_14.II0o.size(); var255++) {
                        class_18 var388;
                        if ((var388 = (class_18)class_1.field_14.II0o.elementAt(var255)).IoIl == var458.IoIl) {
                           if (Ilol.method_808().IOI_ == var458.IoIl) {
                              Ilol.method_808().III_ = var458.II1_;
                           }

                           class_1.field_14.II0o.removeElement(var388);
                           class_1.field_14.II0o.insertElementAt(var458, var255);
                           return;
                        }
                     }
                     break;
                  case -51:
                     I1OO.I__o();
                     method_711(var1, 0);
                     if (class_1.field_14.field_487 && class_1.field_14.IoI_ == 5) {
                        class_1.field_14.IoI0();
                     }
                     break;
                  case -50:
                     I1OO.I__o();
                     class_1.field_14.II00 = new I_lO(method_718("럃롼롊려렌룤뢉뢫뢀륩륁뤧뤓", 47085));
                     byte var249 = var1.method_628().readByte();

                     for (int var254 = 0; var254 < var249; var254++) {
                        class_18 var39;
                        (var39 = new class_18()).IoIl = var1.method_628().readInt();
                        var39.IIOI = var1.method_628().readShort();
                        var39.IIII = var1.method_628().readShort();
                        var39.IIOl = var1.method_628().readShort();
                        var39.IIO1 = var1.method_628().readShort();
                        var39.IIoI = var1.method_628().readUTF();
                        var39.II1_ = var1.method_628().readByte();
                        var39.IIo_ = var1.method_628().readUTF();
                        var39.IIO1 = var1.method_628().readInt();
                        var39.IIO_ = var1.method_628().readInt();
                        var39.IIO0 = var1.method_628().readInt();
                        var39.Ill_ = I_1l.III1(var1.method_628().readInt());
                        class_1.field_14.II00.addElement(var39);
                     }

                     class_1.field_14.I1l_ = true;
                     class_1.field_14.I0lo = false;
                     class_1.field_14.field_487 = false;
                     class_1.field_14.field_475 = class_1.field_14.II00.size() + 2;
                     class_1.field_14.IoI0();
                     break;
                  case -47:
                     I1OO.I__o();
                     byte var377 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랎론롊려롉뢵뢇", 47085) + var377);
                     if (var377 == 0) {
                        class_1.field_14.field_490 = IO11.IOoo;
                        class_1.field_14.field_481 = null;
                     } else {
                        class_1.field_14.field_481 = new Ilo0[var377];
                        I_Ol.II__(method_718("랎론롊려롉룻룂뢧뢗륧륋륢뤍맥맱맊맠맜", 47085) + class_1.field_14.field_481.length);

                        for (int var382 = 0; var382 < class_1.field_14.field_481.length; var382++) {
                           class_1.field_14.field_481[var382] = new Ilo0();
                           class_1.field_14.field_481[var382].II0I = var1.method_628().readInt();
                           class_1.field_14.field_481[var382].II0o = var1.method_628().readUTF();
                           class_1.field_14.field_481[var382].field_633 = var1.method_628().readUTF();
                           class_1.field_14.field_481[var382].I_O0 = var1.method_628().readUnsignedByte();
                           class_1.field_14.field_481[var382].IIoI = var1.method_628().readUTF();
                           class_1.field_14.field_481[var382].IIol = var1.method_628().readUTF();
                           class_1.field_14.field_481[var382].IIOl = var1.method_628().readUnsignedByte();
                           class_1.field_14.field_481[var382].IIlI = var1.method_628().readUnsignedByte();
                           class_1.field_14.field_481[var382].field_634 = var1.method_628().readInt();
                        }
                     }

                     class_1.field_14.I0lo = true;
                     class_1.field_14.I1l_ = false;
                     class_1.field_14.field_487 = false;
                     if (class_1.field_14.I0lo) {
                        class_1.field_14.IoI0();
                     }
                     break;
                  case -46:
                     I1OO.I__o();
                     byte var283 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랎롍롈렾렀룧룉룻룅", 47085) + var283);
                     if (var283 == 1 || var283 == 3) {
                        class_1.III_();
                        Iloo.IIlo.removeAllElements();
                        int var5 = var1.method_628().readUnsignedByte();

                        for (int var253 = 0; var253 < var5; var253++) {
                           Iloo var619;
                           (var619 = new Iloo()).IoIl = var1.method_628().readUnsignedByte();
                           var619.II1o = var1.method_628().readUTF();
                           var619.IoI1 = var1.method_628().readInt();
                           var619.field_632 = var1.method_628().readInt();
                           if (!Iloo.II1l(var619.IoIl)) {
                              Iloo.method_723(var619);
                           } else {
                              Iloo.method_724((short)var619.IoIl).II1o = var619.II1o;
                              Iloo.method_724((short)var619.IoIl).IoI1 = var619.IoI1;
                              Iloo.method_724((short)var619.IoIl).field_632 = var619.field_632;
                           }
                        }

                        if (Ilol.method_808().field_801 != null) {
                           class_1.field_14.IO1_();
                        }
                     }

                     if (var283 == 4) {
                        Ilol.method_808().field_801.I_O0 = var1.method_628().readUnsignedByte();
                        Ilol.method_808().field_801.field_633 = var1.method_628().readUTF();
                        I_Ol.II__(method_718("랎롤롊려렎룭뢇뢵뢉륫륄뤣뤏릠", 47085) + Ilol.method_808().field_801.field_633);
                     }
                     break;
                  case -45:
                     byte var319 = var1.method_628().readByte();
                     int var268 = var1.method_628().readInt();
                     short var321 = var1.method_628().readShort();
                     I_Ol.II__(method_718("럓렢롸렁렠룄룫뢙뢫륋륷뤝뤧맏맜맫릎맜먻멉먲먑뫻뫚뫵몀뭪뭂무뭍뮯", 47085) + var319 + method_718("럍렬렋렺렅룩룞뢣뢗뤤륖뤱뤄립릿", 47085) + var268);
                     if (var319 == 20) {
                        byte var113 = var1.method_628().readByte();
                        byte var390 = var1.method_628().readByte();
                        short var114 = var1.method_628().readShort();
                        boolean var460 = var1.method_628().readByte() != 0;
                        byte var334 = var1.method_628().readByte();
                        byte var337 = -1;

                        try {
                           var337 = var1.method_628().readByte();
                        } catch (Exception var228) {
                        }

                        I_Ol.II__(method_718("럓렢롸렁렠룄룫뢙뢫륋륷뤝뤧맏맜맫릎맜먻멉먲먑뫻뫚뫵몄뭿뭓묨묕믽믪뮤뮞밶밊", 47085) + var390);
                        Ilol var115;
                        if (Ilol.method_808().IOI_ == var268) {
                           var115 = Ilol.method_808();
                        } else {
                           var115 = I1_I.method_762(var268);
                        }

                        var115.method_846(var321, var460, var113, var334, var390, var114, var337);
                     }

                     if (var319 == 21) {
                        I___ var631;
                        (var631 = new I___()).I_O0 = var1.method_628().readShort();
                        var631.I_Oo = var1.method_628().readShort();
                        short var641 = var1.method_628().readShort();
                        short var624 = var1.method_628().readShort();
                        byte var392 = 0;
                        byte var335 = -1;
                        I___[] var648 = null;
                        Ilol var628;
                        if (Ilol.method_808().IOI_ == var268) {
                           var628 = Ilol.method_808();
                        } else {
                           var628 = I1_I.method_762(var268);
                        }

                        try {
                           var392 = var1.method_628().readByte();
                           var648 = new I___[var1.method_628().readByte()];

                           for (int var394 = 0; var394 < var648.length; var394++) {
                              var648[var394] = new I___();
                              var648[var394].IIO1 = var1.method_628().readByte();
                              if (var648[var394].IIO1 == 0) {
                                 var648[var394].IIO0 = var1.method_628().readByte();
                              } else {
                                 var648[var394].IIO0 = var1.method_628().readInt();
                              }
                           }
                        } catch (Exception var241) {
                        }

                        try {
                           var335 = var1.method_628().readByte();
                        } catch (Exception var227) {
                        }

                        I_Ol.II__(
                           method_718("럓렢롸렁렠룄룫뢙뢫륋륷뤝뤧맏맜맫릎맜먻멉먲먑뫻뫚뫵몀뭲뭀묶묕믻믪뮬뮁뱮밗뱩", 47085)
                              + var631.I_O0
                              + method_718("럗", 47085)
                              + var631.I_Oo
                              + method_718("럍렬렋롪렊뢲", 47085)
                              + var628.I_o_
                              + method_718("럗", 47085)
                              + var628.I_oO
                              + method_718("럍렬렋렩렍룡룕룼", 47085)
                              + var628.IOI1
                        );
                        var628.method_847(1, var321, var631, var641, var624, var392, var648, var335);
                     }

                     if (var319 == 0) {
                        I_Ol.II__(method_718("랄롨렋렿렚룭뢚룦", 47085) + var268);
                        if (Ilol.method_808().IOI_ != var268) {
                           Ilol var632;
                           if ((IOlO.method_469((var632 = I1_I.method_762(var268)).I_o_, var632.I_oO) & 2) == 2) {
                              var632.method_817(I1_I.field_691[var321], 0);
                           } else {
                              var632.method_817(I1_I.field_691[var321], 1);
                              var632.field_834 = 20;
                           }
                        } else {
                           Ilol.method_808();
                           I_Ol.II__(method_718("랡롃롪렎롉룄룦뢕뢱뤤륰뤉뤨만맓", 47085));
                        }

                        byte var618 = var1.method_628().readByte();
                        I_Ol.II__(method_718("랃롼롈롪렚룡룝뢣룘뤤", 47085) + var618);

                        for (int var327 = 0; var327 < var618; var327++) {
                           byte var642 = var1.method_628().readByte();
                           byte var393 = var1.method_628().readByte();
                           I_Ol.II__(method_718("랄롢롏렯렑뢵뢇", 47085) + var642);
                           if (var321 >= 42 && var321 <= 48) {
                              ((I_I_)I1_I.field_696.elementAt(var642)).III_ = true;
                              ((I_I_)I1_I.field_696.elementAt(var642)).IIlI = var393;
                              I_I_ var649 = (I_I_)I1_I.field_696.elementAt(var642);
                              I1_I.field_696.elementAt(var642);
                              var649.IloO = System.currentTimeMillis();
                           }
                        }

                        byte var391 = var1.method_628().readByte();

                        for (int var331 = 0; var331 < var391; var331++) {
                           int var333 = var1.method_628().readInt();
                           byte var336 = var1.method_628().readByte();
                           I_Ol.II__(method_718("랝론롊렳렌룺뢇뢏뢡뤹뤃", 47085) + var333 + method_718("럍롡롒롪렠료뢚룦", 47085) + Ilol.method_808().IOI_);
                           if (var321 >= 42 && var321 <= 48) {
                              if (var333 == Ilol.method_808().IOI_) {
                                 if (!Ilol.method_808().I1ol && !Ilol.method_808().I1o1) {
                                    I1_I.method_748().field_720 = true;
                                    Ilol.method_808().I1_O = true;
                                    Ilol.method_808().field_822 = var336;
                                    Ilol var296 = Ilol.method_808();
                                    Ilol.method_808();
                                    var296.Il10 = System.currentTimeMillis();
                                    Ilol.method_808().I10l = true;
                                 }
                              } else {
                                 Ilol var633;
                                 if ((var633 = I1_I.method_762(var333)) != null && !var633.I1ol && !var633.I1o1) {
                                    var633.I1_O = true;
                                    var633.field_822 = var336;
                                    I1_I.method_762(var333);
                                    var633.Il10 = System.currentTimeMillis();
                                 }
                              }
                           }
                        }
                     }

                     if (var319 == 1 && var268 != Ilol.method_808().IOI_) {
                        I1_I.method_762(var268).I1_0 = true;
                     }

                     if (var319 == 3) {
                        if (var268 == Ilol.method_808().IOI_) {
                           Ilol.method_808().I1_0 = false;
                           class_14.method_484();
                           Ilol.method_808();
                        } else {
                           I1_I.method_762(var268).I1_0 = false;
                        }
                     }

                     if (var319 == 4) {
                        if (var268 == Ilol.method_808().IOI_) {
                           Ilol.method_808().IO_o = var1.method_628().readShort() - 1000;
                           Ilol.method_808().Il1_ = System.currentTimeMillis();
                           I_Ol.II__(method_718("랞롩롈력렇룬뢚룦", 47085) + Ilol.method_808().IO_o + method_718("럍론롊령렝뢵뢇", 47085) + Ilol.method_808().Il1_);
                        } else if (I1_I.method_762(var268) != null) {
                           int var324;
                           if ((var324 = I1_I.method_762(var268).IOIO) == 0) {
                              I1_I.method_762(var268).III_(false);
                           } else if (var324 == 1) {
                              I1_I.method_762(var268).III_(true);
                           }

                           I1_I.method_762(var268).IO_1 = var321;
                           I1_I.method_762(var268).I1oI = true;
                           I1_I.method_762(var268).IO_o = var1.method_628().readShort();
                           I1_I.method_762(var268).Il1_ = System.currentTimeMillis();
                        }
                     }

                     if (var319 == 5) {
                        if (var268 == Ilol.method_808().IOI_) {
                           Ilol.method_808().IO1_();
                        } else if (I1_I.method_762(var268) != null) {
                           I1_I.method_762(var268).IO1_();
                        }
                     }

                     if (var319 == 6) {
                        if (var268 == Ilol.method_808().IOI_) {
                           Ilol.method_808().method_819(I1_I.field_691[var321], 0);
                        } else if (I1_I.method_762(var268) != null) {
                           I1_I.method_762(var268).method_819(I1_I.field_691[var321], 0);
                           class_14.method_484();
                        }
                     }

                     if (var319 == 7) {
                        if (var268 == Ilol.method_808().IOI_) {
                           Ilol.method_808().IO_o = var1.method_628().readShort();
                           I_Ol.II__(method_718("랞롩롈력렇룬뢇룻룅", 47085) + Ilol.method_808().IO_o);
                           Ilol.method_808().Il1_ = System.currentTimeMillis();
                        } else if (I1_I.method_762(var268) != null) {
                           I1_I.method_762(var268).III_(true);
                           I1_I.method_762(var268).IO_o = var1.method_628().readShort();
                           I1_I.method_762(var268).Il1_ = System.currentTimeMillis();
                           class_14.method_484();
                        }
                     }

                     if (var319 == 8 && var268 != Ilol.method_808().IOI_ && I1_I.method_762(var268) != null) {
                        I1_I.method_762(var268).method_819(I1_I.field_691[var321], 0);
                     }
                     break;
                  case -44:
                     boolean var71 = false;
                     if (class_1.field_11 > 2 * I_1o.llOI) {
                        var71 = true;
                     }

                     byte var41 = var1.method_628().readByte();
                     int var330 = var1.method_628().readUnsignedByte();
                     Ilol.method_808().field_814 = new I101[var330][];
                     class_1.field_14.III1 = new String[var330 + (!var71 ? 1 : 0)][2];
                     if (var41 == 2) {
                        class_1.field_14.I11o = new int[var330];
                        class_1.field_14.field_470 = new int[var330];
                     }

                     if (!var71) {
                        class_1.field_14.III1[var330] = IO11.II0o;
                     }

                     for (int var332 = 0; var332 < var330; var332++) {
                        String[] var629 = I_Ol.method_563(var1.method_628().readUTF(), method_718("럧", 47085), 0);
                        if (var41 == 2) {
                           class_1.field_14.I11o[var332] = var1.method_628().readUnsignedByte();
                        }

                        if (var629.length == 2) {
                           class_1.field_14.III1[var332] = var629;
                        }

                        if (var629.length == 1) {
                           class_1.field_14.III1[var332][0] = var629[0];
                           class_1.field_14.III1[var332][1] = "";
                        }

                        int var461 = var1.method_628().readUnsignedByte();
                        Ilol.method_808().field_814[var332] = new I101[var461];

                        for (int var462 = 0; var462 < var461; var462++) {
                           short var640;
                           if ((var640 = var1.method_628().readShort()) != -1) {
                              Ilol.method_808().field_814[var332][var462] = new I101();
                              Ilol.method_808().field_814[var332][var462].field_543 = I1oI.method_642(var640);
                              I_1o.Il1I = IO11.I0OI;
                              if (var41 == 8) {
                                 Ilol.method_808().field_814[var332][var462].field_544 = var1.method_628().readInt();
                                 Ilol.method_808().field_814[var332][var462].field_546 = var1.method_628().readInt();
                                 Ilol.method_808().field_814[var332][var462].I1l1 = var1.method_628().readInt();
                              } else if (var41 == 4) {
                                 Ilol.method_808().field_814[var332][var462].IlIO = var1.method_628().readUTF();
                              } else if (var41 == 0) {
                                 Ilol.method_808().field_814[var332][var462].field_544 = var1.method_628().readInt();
                                 Ilol.method_808().field_814[var332][var462].field_546 = var1.method_628().readInt();
                              } else if (var41 == 1) {
                                 Ilol.method_808().field_814[var332][var462].Iloo = var1.method_628().readLong();
                                 I_1o.Il1I = IO11.I0Ol;
                              } else if (var41 == 2) {
                                 Ilol.method_808().field_814[var332][var462].lIO1 = var1.method_628().readShort();
                                 Ilol.method_808().field_814[var332][var462].field_544 = var1.method_628().readInt();
                                 Ilol.method_808().field_814[var332][var462].field_546 = var1.method_628().readInt();
                                 Ilol.method_808().field_814[var332][var462].IIO0 = var1.method_628().readByte();
                                 Ilol.method_808().field_814[var332][var462].I1l1 = var1.method_628().readInt();
                                 Ilol.method_808().field_814[var332][var462].IIOo = var1.method_628().readByte();
                              } else if (var41 == 3) {
                                 Ilol.method_808().field_814[var332][var462].IIll = true;
                                 Ilol.method_808().field_814[var332][var462].II_1 = var1.method_628().readShort();
                                 Ilol.method_808().field_814[var332][var462].III1 = var1.method_628().readInt();
                              }

                              int var43;
                              if ((var43 = var1.method_628().readUnsignedByte()) != 0) {
                                 Ilol.method_808().field_814[var332][var462].field_542 = new I100[var43];

                                 for (int var646 = 0; var646 < Ilol.method_808().field_814[var332][var462].field_542.length; var646++) {
                                    int var23 = var1.method_628().readUnsignedByte();
                                    int var650 = var1.method_628().readUnsignedShort();
                                    if (var23 != -1) {
                                       Ilol.method_808().field_814[var332][var462].field_542[var646] = new I100(var23, var650);
                                       Ilol.method_808().field_814[var332][var462].lIOo = class_1.field_14
                                          .method_601(Ilol.method_808().field_814[var332][var462]);
                                    }
                                 }
                              }

                              byte var341 = var1.method_628().readByte();
                              Ilol.method_808().field_814[var332][var462].IO0l = var341 != 0;
                              if (var1.method_628().readByte() == 1) {
                                 short var647 = var1.method_628().readShort();
                                 short var24 = var1.method_628().readShort();
                                 short var651 = var1.method_628().readShort();
                                 short var463 = var1.method_628().readShort();
                                 Ilol.method_808().field_814[var332][var462].method_645(var647, var24, var651, var463);
                              }

                              if (var41 == 2) {
                                 Ilol.method_808().field_814[var332][var462].IlI0 = var1.method_628().readUTF();
                                 I_Ol.II_l(method_718("랃롫롞력렀뢨료뢯룅륣륖뤫륁릠", 47085) + Ilol.method_808().field_814[var332][var462].IlI0);
                              }
                           }
                        }
                     }

                     if (var71) {
                        if (var41 != 2) {
                           (class_1.field_15 = new I_1o()).field_472[7] = new String[][]{{""}};
                           class_1.field_15.method_572();
                           class_1.field_15.I__0();
                        } else {
                           (class_1.field_15 = new I_1o()).IIII();
                           class_1.field_15.I__0();
                        }
                     }

                     class_1.field_14.field_472[1] = class_1.field_14.III1;
                     if (var41 == 2) {
                        String[][] var630 = class_1.field_14.field_472[1];
                        if (var71) {
                           class_1.field_14.field_472[1] = new String[][]{var630[0], var630[1], var630[2], var630[3]};
                        } else {
                           class_1.field_14.field_472[1] = new String[][]{var630[0], var630[1], var630[2], var630[3], var630[4]};
                        }
                     }

                     class_1.field_14.method_575(var41);
                     class_1.field_14.I__0();
                     break;
                  case -43:
                     byte var376 = var1.method_628().readByte();
                     byte var282 = var1.method_628().readByte();
                     byte var318 = var1.method_628().readByte();
                     String var116 = var1.method_628().readUTF();
                     class_1.field_14.method_605(var376, var116, var282, var318);
                     break;
                  case -42:
                     Ilol.method_808().I0_O = var1.II_I();
                     Ilol.method_808().I0_0 = var1.II_I();
                     Ilol.method_808().I0__ = var1.method_628().readInt();
                     Ilol.method_808().IOlo = var1.II_I();
                     Ilol.method_808().field_799 = var1.II_I();
                     Ilol.method_808().IOl_ = var1.II_I();
                     Ilol.method_808().IOl1 = var1.II_I();
                     Ilol.method_808().IOIo = var1.method_628().readByte();
                     Ilol.method_808().IIll = var1.method_628().readByte();
                     Ilol.method_808().IIl1 = var1.method_628().readByte();
                     Ilol.method_808().IIl_ = var1.method_628().readByte();
                     Ilol.method_808().field_797 = var1.method_628().readInt();
                     Ilol.method_808().IOlI = var1.method_628().readInt();
                     Ilol.method_808().IOll = var1.method_628().readByte();
                     Ilol.method_808().Il1I = var1.method_628().readLong();
                     Ilol.method_808().IIl_ = var1.method_628().readShort();
                     Ilol.method_808().I0_o = var1.method_628().readShort();
                     Ilol.method_808().field_854 = var1.method_628().readByte();
                     I1OO.I__o();
                     break;
                  case -41:
                     byte var42 = var1.method_628().readByte();
                     Ilol.method_808().III_ = new String[var42];

                     for (int var72 = 0; var72 < var42; var72++) {
                        String var639 = var1.method_628().readUTF();
                        Ilol.method_808().III_[var72] = var639;
                     }
                     break;
                  case -37:
                     byte var248 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랎롍롈렾렀룧룉룻룅", 47085) + var248);
                     if (var248 == 0) {
                        Ilol.method_808().field_837 = var1.method_628().readShort();
                        Ilol.method_808().IO01();
                        int var252 = var1.method_628().readUnsignedByte();
                        I_Ol.II__(method_718("랃롹롆롪렋룧룃뢿룅뤹뤃", 47085) + var252);
                        Ilol.method_808().IIII = new I101[var252];

                        for (int var381 = 0; var381 < var252; var381++) {
                           short var638;
                           if ((var638 = var1.method_628().readShort()) != -1) {
                              Ilol.method_808().IIII[var381] = new I101();
                              Ilol.method_808().IIII[var381].field_543 = I1oI.method_642(var638);
                              byte var645 = Ilol.method_808().IIII[var381].field_543.II0l;
                              Ilol.method_808().IIII[var381].I1l1 = var1.method_628().readInt();
                              Ilol.method_808();
                              var1.method_628().readUTF();
                              Ilol.method_808();
                              var1.method_628().readUTF();
                              int var387;
                              if ((var387 = var1.method_628().readUnsignedByte()) != 0) {
                                 Ilol.method_808().IIII[var381].field_542 = new I100[var387];

                                 for (int var323 = 0; var323 < Ilol.method_808().IIII[var381].field_542.length; var323++) {
                                    int var326 = var1.method_628().readUnsignedByte();
                                    int var329 = var1.method_628().readUnsignedShort();
                                    if (var326 != -1) {
                                       Ilol.method_808().IIII[var381].field_542[var323] = new I100(var326, var329);
                                    }
                                 }
                              }

                              if (var645 == 0) {
                                 Ilol.method_808().I0II = Ilol.method_808().IIII[var381].field_543.II_0;
                              } else if (var645 == 1) {
                                 Ilol.method_808().field_838 = Ilol.method_808().IIII[var381].field_543.II_0;
                              }
                           }
                        }
                     }

                     I_Ol.II__(
                        method_718("랅롩롊렮롔뢨", 47085)
                           + Ilol.method_808().field_837
                           + method_718("럍롮롄렮렐뢵뢇", 47085)
                           + Ilol.method_808().I0II
                           + method_718("럍론롎렭롔뢨", 47085)
                           + Ilol.method_808().field_838
                     );
                     break;
                  case -36:
                     byte var35 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랎롍롈렾렀룧룉룻룅", 47085) + var35);
                     if (var35 == 0) {
                        int var36 = var1.method_628().readUnsignedByte();
                        Ilol.method_808().field_811 = new I101[var36];
                        I1_I.Io_0 = 0;
                        I_Ol.II__(method_718("랃롹롆렉롔", 47085) + var36);

                        for (int var286 = 0; var286 < var36; var286++) {
                           short var637;
                           if ((var637 = var1.method_628().readShort()) != -1) {
                              Ilol.method_808().field_811[var286] = new I101();
                              Ilol.method_808().field_811[var286].field_543 = I1oI.method_642(var637);
                              Ilol.method_808().field_811[var286].I1l1 = var1.method_628().readInt();
                              Ilol.method_808();
                              var1.method_628().readUTF();
                              Ilol.method_808();
                              var1.method_628().readUTF();
                              Ilol.method_808().field_811[var286].lIO_ = var286;
                              int var38;
                              if ((var38 = var1.method_628().readUnsignedByte()) != 0) {
                                 Ilol.method_808().field_811[var286].field_542 = new I100[var38];

                                 for (int var322 = 0; var322 < Ilol.method_808().field_811[var286].field_542.length; var322++) {
                                    int var325 = var1.method_628().readUnsignedByte();
                                    int var328 = var1.method_628().readUnsignedShort();
                                    if (var325 != -1) {
                                       Ilol.method_808().field_811[var286].field_542[var322] = new I100(var325, var328);
                                    }
                                 }

                                 Ilol.method_808().field_811[var286].lIOo = class_1.field_14.method_601(Ilol.method_808().field_811[var286]);
                              }

                              Ilol.method_808();
                              if (Ilol.method_808().field_811[var286].field_543.II0l == 6) {
                                 I1_I.Io_0 = I1_I.Io_0 + Ilol.method_808().field_811[var286].I1l1;
                              }
                           }
                        }
                     }

                     if (var35 == 2) {
                        byte var281 = var1.method_628().readByte();
                        int var287 = var1.method_628().readInt();
                        int var267 = Ilol.method_808().field_811[var281].I1l1;
                        Ilol.method_808().field_811[var281].I1l1 = var287;
                        if (Ilol.method_808().field_811[var281].I1l1 < var267 && Ilol.method_808().field_811[var281].field_543.II0l == 6) {
                           I1_I.Io_0 = I1_I.Io_0 - (var267 - Ilol.method_808().field_811[var281].I1l1);
                        }

                        if (Ilol.method_808().field_811[var281].I1l1 == 0) {
                           Ilol.method_808().field_811[var281] = null;
                        }
                     }
                     break;
                  case -35:
                     byte var7 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랎롍롈렾렀룧룉룻룅", 47085) + var7);
                     if (var7 == 0) {
                        int var8 = var1.method_628().readUnsignedByte();
                        Ilol.method_808().field_812 = new I101[var8];
                        class_1.field_14.ll_o = 0;

                        for (int var265 = 0; var265 < var8; var265++) {
                           short var13;
                           if ((var13 = var1.method_628().readShort()) != -1) {
                              Ilol.method_808().field_812[var265] = new I101();
                              Ilol.method_808().field_812[var265].field_543 = I1oI.method_642(var13);
                              Ilol.method_808().field_812[var265].I1l1 = var1.method_628().readInt();
                              Ilol.method_808();
                              var1.method_628().readUTF();
                              Ilol.method_808();
                              var1.method_628().readUTF();
                              int var14;
                              if ((var14 = var1.method_628().readUnsignedByte()) != 0) {
                                 Ilol.method_808().field_812[var265].field_542 = new I100[var14];

                                 for (int var15 = 0; var15 < Ilol.method_808().field_812[var265].field_542.length; var15++) {
                                    int var16 = var1.method_628().readUnsignedByte();
                                    int var17 = var1.method_628().readUnsignedShort();
                                    if (var16 != -1) {
                                       Ilol.method_808().field_812[var265].field_542[var15] = new I100(var16, var17);
                                    }
                                 }
                              }

                              class_1.field_14.ll_o++;
                           }
                        }
                     }

                     if (var7 == 1) {
                        boolean var636 = false;

                        try {
                           if (var1.method_628().readByte() == 1) {
                              var636 = true;
                           }
                        } catch (Exception var226) {
                        }

                        class_1.field_14.I0oO();
                        class_1.field_14.II1I = var636;
                        class_1.field_14.I__0();
                     }

                     if (var7 == 2) {
                        byte var317 = var1.method_628().readByte();
                        int var266 = var1.method_628().readInt();
                        Ilol.method_808().field_812[var317].I1l1 = var266;
                        if (Ilol.method_808().field_812[var317].I1l1 == 0) {
                           Ilol.method_808().field_812[var317] = null;
                        }
                     }
                     break;
                  case -34:
                     byte var18 = var1.method_628().readByte();
                     I_Ol.II__(method_718("람롯롟롷롉", 47085) + var18);
                     if (var18 == 0 && I1_I.method_748().field_716 != null) {
                        I_Ol.II__(method_718("랙롣롂롪렍룽룈뢥룅률륂뤻", 47085));
                        I1o0 var634;
                        (var634 = I1_I.method_748().field_716).II0I = var1.method_628().readShort();
                        var634.Ill1 = var1.method_628().readUTF();
                        var634.Ill1 = I_Ol.IIIo(var634.Ill1);
                        var1.method_628().readShort();
                        var1.method_628().readShort();
                        var1.method_628().readByte();
                        var634.lIoo = var1.method_628().readShort();
                        var634.field_875 = var1.method_628().readShort();
                        I_Ol.II__(method_718("랎롹롙렸롉룘룂뢧뢖뤹뤃", 47085) + var634.lIoo);
                        var1.method_628().readUTF();
                        var634.IIO0 = var1.method_628().readInt();
                        byte var338 = var1.method_628().readByte();
                        var634.II0O = new int[var338];
                        var634.II00 = new int[var338];

                        for (int var340 = 0; var340 < var338; var340++) {
                           var634.II0O[var340] = var1.method_628().readByte();
                           var634.II00[var340] = var1.method_628().readByte();
                        }

                        var634.field_876 = var1.method_628().readBoolean();
                        var634.Il1O = var634.IlO0 = System.currentTimeMillis();
                        I1_I.method_748().field_716.I1_l = true;
                     }

                     if (var18 == 1) {
                        I_lO var635 = new I_lO(method_718("랛롡롎려렜뢨룄뢩뢋륰륑뤭뤍맥릿릌", 47085));

                        try {
                           while (var1.method_628().available() > 0) {
                              String var644 = var1.method_628().readUTF();
                              var635.addElement(new I1Il(var644, class_1.field_3, 888392, null));
                           }
                        } catch (Exception var240) {
                        }

                        class_1.field_13.method_632(var635);
                     }

                     if (var18 == 2) {
                        I1_I.method_748().field_716.I_Oo = var1.method_628().readShort();
                        I_Ol.II__(method_718("랮롹롙렸롉룸룂뢧룘뤤", 47085) + I1_I.method_748().field_716.I_Oo);
                        I1_I.method_748().field_716.IIO0 = var1.method_628().readInt();
                        I1_I.method_748().field_716.Il1O = I1_I.method_748().field_716.IlO0 = System.currentTimeMillis();
                        I1_I.method_748().field_716.I1_l = true;
                        I1_I.method_748().field_716.I1lI = true;
                     }
                     break;
                  case -32:
                     short var73 = var1.method_628().readShort();
                     I_Ol.II__(method_718("랯롍롨렁롉룏룵뢉뢰륊륧륢뤕맥맲많릱릝멯멟멹먑뫳몋뫵", 47085) + var73);
                     int var117 = var1.method_628().readInt();
                     Object var118 = null;

                     byte[] var119;
                     try {
                        var119 = new byte[var117];
                        var1.method_628().read(var119, 0, var117);
                        var118 = Image.createImage(var119, 0, var117);
                        Il0o.field_886.put(String.valueOf(var73), var118);
                     } catch (Exception var225) {
                        var119 = null;
                        Il0o.field_886.put(String.valueOf(var73), Image.createRGBImage(new int[]{-2013265920}, 1, 1, true));
                     }

                     if (var119 != null && IO1l.l_I0 > 1) {
                        I_O1.method_555(IO1l.l_I0 + method_718("랏롫롢렾렌룥", 47085) + var73, var119);
                     }
                     break;
                  case -31:
                     IOlO.II1l.removeAllElements();
                     short var74 = var1.method_628().readShort();
                     I_Ol.II__(method_718("랃롅롟렯렄뢵뢇", 47085) + var74);

                     for (int var370 = 0; var370 < var74; var370++) {
                        Il0o var653;
                        (var653 = new Il0o()).II0I = var370;
                        var653.IIII = var1.method_628().readShort();
                        var653.field_884 = var1.method_628().readByte();
                        var653.IIOI = var1.method_628().readShort();
                        var653.IIOl = var1.method_628().readShort();
                        byte var656 = var1.method_628().readByte();
                        var653.II0o = new int[var656];
                        var653.field_885 = new int[var656];

                        for (int var464 = 0; var464 < var656; var464++) {
                           var653.II0o[var370] = var1.method_628().readByte();
                           var653.field_885[var370] = var1.method_628().readByte();
                        }

                        IOlO.II1l.addElement(var653);
                     }
                     break;
                  case -30:
                     this.IIIO(var1);
                     break;
                  case -29:
                     III_(var1);
                     break;
                  case -28:
                     this.III1(var1);
                     break;
                  case -26:
                     I_0l.III_ = 2;
                     class_1.method_33(var1.method_628().readUTF());
                     I1OO.I__o();
                     I1o_.IO0_ = false;
                     Ilol.I10I = false;
                     if (class_1.field_12 == class_1.field_17) {
                        class_1.field_38.I0l_();
                     }
                     break;
                  case -25:
                     I1_I.field_713.IIII(var1.method_628().readUTF(), 0);
                     break;
                  case -24:
                     if (class_1.field_12 instanceof I1_I) {
                        class_1.IIIO = IO10.IIII() + 3000L;
                     } else {
                        class_1.IIIO = IO10.IIII() + 30000L;
                     }

                     Ilol.I10I = true;
                     I_Ol.II__(method_718("랪롉롿롪려룉룷룦뢬륊륥뤍", 47085));
                     I1_I.method_748().field_716 = null;
                     class_1.IIII = true;
                     I1_I.I0lo();
                     class_1.III_();
                     IOlO.IlI_.removeAllElements();
                     I__O.field_446.removeAllElements();
                     System.gc();
                     IOlO.l1oI = var1.method_628().readUnsignedByte();
                     IOlO.IlIo = var1.method_628().readByte();
                     IOlO.field_316 = var1.method_628().readByte();
                     IOlO.l1o1 = var1.method_628().readByte();
                     I_Ol.II__(
                        method_718("랁롣롊렮롉룸룋뢧뢋륡륗륢뤇맲맰맓맽릏멾멈먯먝뫥몌뫵", 47085)
                           + IOlO.IlIo
                           + method_718("랏롫롿렳렙룭뢚룦", 47085)
                           + IOlO.l1o_
                           + method_718("럃렢렅롤롇뢦뢉루룋뤪뤍륬륏릮릱릐맳맒먵먔멷멖몹몘뫻뫚묽묜뭿", 47085)
                     );
                     var1.method_628().readByte();
                     IOlO.Il_O = var1.method_628().readUTF();
                     IOlO.l1ol = var1.method_628().readByte();

                     try {
                        IOlO.IllI(IOlO.l1oI);
                     } catch (Exception var233) {
                        I_Ol.II__(method_718("랁롣롊렮롉룥룆뢶룅륢륑뤭뤌릠맬맛릯릊멾멈멣멘", 47085) + IOlO.l1oI);
                        I_0_.method_504().IIo0(IOlO.l1oI);
                        this.field_619 = var1;
                        return;
                     }

                     this.IIIl(var1);

                     try {
                        IOlO.I00l = var1.method_628().readByte() != 0;
                     } catch (Exception var224) {
                     }

                     I1_I.field_689 = I1_I.Io10;
                     I1_I.Io1I = I1_I.Io1o;
                     break;
                  case -22:
                     Ilol.field_830 = true;
                     Ilol.I1Oo = true;
                     I1_I.method_748();
                     I1_I.method_748();
                     Ilol.method_808().IIII = null;
                     Ilol.method_808().field_817 = null;
                     Ilol.method_808().IIIl = null;
                     Ilol.method_808().field_818 = null;
                     Ilol.method_808().IIl1.removeAllElements();
                     Ilol.method_808().II__ = -9999;
                     Ilol.method_808().IO_O = -9999;
                     I1_I.method_748().I01o();
                     I1_I.method_748().III0 = null;
                     break;
                  case -21:
                     short var365 = var1.method_628().readShort();

                     for (int var397 = 0; var397 < I1_I.II_0.size(); var397++) {
                        if (((I10_)I1_I.II_0.elementAt(var397)).lI0l == var365) {
                           I1_I.II_0.removeElementAt(var397);
                           break label5115;
                        }
                     }
                     break;
                  case -20:
                     Ilol.method_808().field_818 = null;
                     short var364 = var1.method_628().readShort();

                     for (int var396 = 0; var396 < I1_I.II_0.size(); var396++) {
                        I10_ var398;
                        if ((var398 = (I10_)I1_I.II_0.elementAt(var396)).lI0l == var364) {
                           var398.III0(Ilol.method_808().I_o_, Ilol.method_808().I_oO - 10);
                           String var652 = var1.method_628().readUTF();
                           short var366 = 0;

                           try {
                              var366 = var1.method_628().readShort();
                              if (var398.field_537.II0l == 9) {
                                 var366 = var1.method_628().readShort();
                                 Ilol var9 = Ilol.method_808();
                                 var9.Il11 += var366;
                                 Ilol.method_808().field_788 = IO10.IIIO(Ilol.method_808().Il11);
                              } else if (var398.field_537.II0l == 10) {
                                 var366 = var1.method_628().readShort();
                                 Ilol var294 = Ilol.method_808();
                                 var294.field_804 += var366;
                                 Ilol.method_808().IIOI = IO10.IIIO(Ilol.method_808().field_804);
                              } else if (var398.field_537.II0l == 34) {
                                 var366 = var1.method_628().readShort();
                                 Ilol var295 = Ilol.method_808();
                                 var295.IO_I += var366;
                                 Ilol.method_808().IIOl = IO10.IIIO(Ilol.method_808().IO_I);
                              }
                           } catch (Exception var223) {
                           }

                           if (var652.equals("")) {
                              if (var398.field_537.II0l == 9) {
                                 I1_I.method_769(
                                    (var366 < 0 ? "" : method_718("럆", 47085)) + var366,
                                    Ilol.method_808().I_o_,
                                    Ilol.method_808().I_oO - Ilol.method_808().IO11,
                                    0,
                                    -2,
                                    1
                                 );
                                 class_14.method_484();
                              } else if (var398.field_537.II0l == 10) {
                                 I1_I.method_769(
                                    (var366 < 0 ? "" : method_718("럆", 47085)) + var366,
                                    Ilol.method_808().I_o_,
                                    Ilol.method_808().I_oO - Ilol.method_808().IO11,
                                    0,
                                    -2,
                                    2
                                 );
                                 class_14.method_484();
                              } else if (var398.field_537.II0l == 34) {
                                 I1_I.method_769(
                                    (var366 < 0 ? "" : method_718("럆", 47085)) + var366,
                                    Ilol.method_808().I_o_,
                                    Ilol.method_808().I_oO - Ilol.method_808().IO11,
                                    0,
                                    -2,
                                    0
                                 );
                                 class_14.method_484();
                              } else {
                                 I1_I.field_713
                                    .IIII(IO11.I__l + method_718("럍", 47085) + (var366 > 0 ? var366 + method_718("럍", 47085) : "") + var398.field_537.II1o, 0);
                                 class_14.method_484();
                              }

                              if (var366 > 0 && Ilol.method_808().field_790 != null && Ilol.method_808().field_790.II1o == 4683) {
                                 class_31.method_795(55, Ilol.method_808().field_790.IIO1, Ilol.method_808().field_790.field_458, 1);
                                 class_31.method_795(55, Ilol.method_808().I_o_, Ilol.method_808().I_oO, 1);
                              }
                           } else if (var652.length() != 1) {
                              I1_I.field_713.IIII(var652, 0);
                           }
                           break label5115;
                        }
                     }
                     break;
                  case -19:
                     short var363 = var1.method_628().readShort();
                     Ilol var352 = I1_I.method_762(var1.method_628().readInt());

                     for (int var45 = 0; var45 < I1_I.II_0.size(); var45++) {
                        I10_ var46;
                        if ((var46 = (I10_)I1_I.II_0.elementAt(var45)).lI0l == var363) {
                           if (var352 == null) {
                              return;
                           }

                           var46.III0(var352.I_o_, var352.I_oO - 10);
                           if (var46.field_534 < var352.I_o_) {
                              var352.IOI1 = -1;
                           } else if (var46.field_534 > var352.I_o_) {
                              var352.IOI1 = 1;
                           }
                           break label5115;
                        }
                     }
                     break;
                  case -18:
                     byte var120 = var1.method_628().readByte();
                     I1_I.II_0
                        .addElement(
                           new I10_(
                              var1.method_628().readShort(),
                              Ilol.method_808().field_811[var120].field_543.II__,
                              Ilol.method_808().I_o_,
                              Ilol.method_808().I_oO,
                              var1.method_628().readShort(),
                              var1.method_628().readShort()
                           )
                        );
                     Ilol.method_808().field_811[var120] = null;
                     break;
                  case -14:
                     Ilol var351;
                     if ((var351 = I1_I.method_762(var1.method_628().readInt())) == null) {
                        return;
                     }

                     I1_I.II_0
                        .addElement(
                           new I10_(
                              var1.method_628().readShort(),
                              var1.method_628().readShort(),
                              var351.I_o_,
                              var351.I_oO,
                              var1.method_628().readShort(),
                              var1.method_628().readShort()
                           )
                        );
                     break;
                  case -4:
                     Ilol var350;
                     if ((var350 = I1_I.method_762(var1.method_628().readInt())) == null) {
                        return;
                     }

                     if ((IOlO.method_469(var350.I_o_, var350.I_oO) & 2) == 2) {
                        var350.method_817(I1_I.field_691[var1.method_628().readUnsignedByte()], 0);
                     } else {
                        var350.method_817(I1_I.field_691[var1.method_628().readUnsignedByte()], 1);
                     }

                     var350.field_819 = new I_I_[var1.method_628().readByte()];

                     for (int var33 = 0; var33 < var350.field_819.length; var33++) {
                        I_I_ var654 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readByte());
                        var350.field_819[var33] = var654;
                        if (var33 == 0) {
                           if (var350.I_o_ <= var654.field_903) {
                              var350.IOI1 = 1;
                           } else {
                              var350.IOI1 = -1;
                           }
                        }
                     }

                     var350.IIIl = null;
                     var350.IIII = var350.field_819[0];
                     Ilol[] var47 = new Ilol[10];
                     int var372 = 0;

                     try {
                        for (var372 = 0; var372 < var47.length; var372++) {
                           int var359;
                           Ilol var655;
                           if ((var359 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                              var655 = Ilol.method_808();
                           } else {
                              var655 = I1_I.method_762(var359);
                           }

                           var47[var372] = var655;
                           if (var372 == 0) {
                              if (var350.I_o_ <= var655.I_o_) {
                                 var350.IOI1 = 1;
                              } else {
                                 var350.IOI1 = -1;
                              }
                           }
                        }
                     } catch (Exception var239) {
                     }

                     if (var372 <= 0) {
                        break;
                     }

                     var350.IIIl = new Ilol[var372];

                     for (int var373 = 0; var373 < var350.IIIl.length; var373++) {
                        var350.IIIl[var373] = var47[var373];
                     }

                     var350.IIIl = var350.IIIl[0];
                     var350.IIII = null;
                     break;
                  case 0:
                     IIII(var1);
                     break;
                  case 1:
                     boolean var121 = var1.method_628().readBoolean();
                     I_Ol.II__(method_718("랄롿롹렯렚뢵뢇", 47085) + var121);
                     if (!var121) {
                        class_1.method_33(var1.method_628().readUTF());
                     } else {
                        I1o_.field_684 = false;
                        I_O1.III1(method_718("래롿롎렸련룧", 47085) + I_0l.l1_I, "");
                        class_1.III_();
                        class_1.field_17.I0OI();
                     }
                     break;
                  case 2:
                     Ilol.I10I = false;
                     if (!I1_I.I1l1) {
                        I1_I.method_748().IIl1();
                     }

                     Il0o.IIl1();
                     class_1.III_();
                     I1I0.I1l1 = true;
                     I1I0.method_779().I0l_();
                     break;
                  case 6:
                     Ilol.method_808().Il11 = var1.method_628().readLong();
                     Ilol.method_808().field_804 = var1.method_628().readInt();
                     Ilol.method_808().IO_I = var1.method_628().readInt();
                     Ilol.method_808().field_788 = IO10.IIIO(Ilol.method_808().Il11);
                     Ilol.method_808().IIOI = IO10.IIIO(Ilol.method_808().field_804);
                     Ilol.method_808().IIOl = IO10.IIIO(Ilol.method_808().IO_I);
                     class_1.III_();
                     break;
                  case 7:
                     byte var75 = var1.method_628().readByte();
                     short var122 = var1.method_628().readShort();
                     String var123 = var1.method_628().readUTF();
                     class_1.field_14.method_606((byte)var75, var123, var122);
                     break;
                  case 11:
                     byte var19 = var1.method_628().readByte();
                     I_Ol.II__(method_718("럐렱렖롷롗뢨뢕룦뢫륁르륢뤥링맋맿맽릨멞멷먉먴뫖뫢몐뫔묳묏뭱", 47085) + var19);
                     byte var20;
                     if ((var20 = var1.method_628().readByte()) != 0) {
                        I_I_.field_902[var19].field_509.method_682(I_1l.method_623(var1), var20);
                     } else {
                        I_I_.field_902[var19].field_509.method_683(I_1l.method_623(var1));
                     }

                     for (int var21 = 0; var21 < I1_I.field_696.size(); var21++) {
                        I_I_ var124;
                        if ((var124 = (I_I_)I1_I.field_696.elementAt(var21)).I1ll == var19) {
                           var124.field_905 = I_I_.field_902[var19].field_509.IIOI;
                           var124.field_906 = I_I_.field_902[var19].field_509.IIOl;
                        }
                     }

                     for (int var339 = 0; var339 < I1_I.II_O.size(); var339++) {
                        Ilol var657;
                        if ((var657 = (Ilol)I1_I.II_O.elementAt(var339)) != null && var657.IIIl != null && var657.IIIl.I1ll == var19) {
                           var657.IIIl.field_905 = I_I_.field_902[var19].field_509.IIOI;
                           var657.IIIl.field_906 = I_I_.field_902[var19].field_509.IIOl;
                        }
                     }

                     if (Ilol.method_808().IIIl != null && Ilol.method_808().IIIl.I1ll == var19) {
                        I_Io var658 = I_I_.field_902[var19];
                        Ilol.method_808().IIIl.field_905 = var658.field_509.IIOI;
                        var658 = I_I_.field_902[var19];
                        Ilol.method_808().IIIl.field_906 = var658.field_509.IIOl;
                     }

                     byte[] var660 = I_1l.method_623(var1);
                     I_Ol.II__(method_718("란롣롉롪렀룥룆뢡뢀뤤륏뤧뤏맴릢릞", 47085) + var660.length);
                     Image var125 = Image.createImage(var660, 0, var660.length);
                     I_I_.field_902[var19].field_509.II01 = var125;
                     byte var22 = var1.method_628().readByte();
                     I_I_.field_902[var19].field_509.field_601 = var22;
                     if (var22 == 1 || var22 == 2) {
                        method_715(var1, var19);
                     }
                     break;
                  case 20:
                     this.IIIo(var1);
                     break;
                  case 24:
                     method_717(var1);
                     break;
                  case 27:
                     I_lO var361 = new I_lO(method_718("란롩롅렿롉룧룗뢣뢋뤤륖뤫", 47085));
                     var1.method_628().readUTF();
                     byte var247 = var1.method_628().readByte();

                     for (int var395 = 0; var395 < var247; var395++) {
                        String var481 = var1.method_628().readUTF();
                        Short var662 = new Short(var1.method_628().readShort());
                        var361.addElement(new I1Il(var481, class_1.field_3, 88819, var662));
                     }

                     class_1.field_13.method_630(var361, 3);
                     break;
                  case 29:
                     I1_I.method_748().IIl_(var1);
                     III_.method_1253().II_O = false;
                     II10.method_1193().II_O = false;
                     break;
                  case 32:
                     short var367 = var1.method_628().readShort();
                     I_Ol.II__(method_718("랃롼롈롪렝룭룊뢶뢉륥륗뤧륁맩맻릃맽", 47085) + var367);

                     for (int var126 = 0; var126 < I1_I.IIOI.size(); var126++) {
                        I_11 var663;
                        if ((var663 = (I_11)I1_I.IIOI.elementAt(var126)).field_870.lll0 == var367 && var663.equals(Ilol.method_808().field_817)) {
                           String var482 = var1.method_628().readUTF();
                           String[] var483 = new String[var1.method_628().readByte()];

                           for (int var466 = 0; var466 < var483.length; var466++) {
                              var483[var466] = var1.method_628().readUTF();
                           }

                           I1_I.method_748();
                           I1_I.method_746(var483, var663);
                           Ilo1.method_803(var482, 100000, var663);
                           return;
                        }
                     }

                     I_11 var369 = new I_11(var367, 0, -100, 100, var367, I1_I.field_713.III1[Ilol.method_808().IOIO][2]);
                     I_Ol.II__(Ilol.method_808().field_817 != null ? method_718("럌롢롞렦렅", 47085) : method_718("랃롹롇렦", 47085));
                     String var85 = var1.method_628().readUTF();
                     String[] var661 = new String[var1.method_628().readByte()];

                     for (int var465 = 0; var465 < var661.length; var465++) {
                        var661[var465] = var1.method_628().readUTF();
                     }

                     try {
                        short var664 = var1.method_628().readShort();
                        var369.IO_l = var664;
                     } catch (Exception var222) {
                     }

                     I_Ol.II__(Ilol.method_808().field_817 != null ? method_718("럌롢롞렦렅", 47085) : method_718("랃롹롇렦", 47085));
                     I1_I.method_748();
                     I1_I.method_746(var661, var369);
                     Ilo1.method_803(var85, 100000, var369);
                     break;
                  case 33:
                     I1OO.I__o();
                     class_1.III1();
                     class_1.IIIl();
                     I_lO var360 = new I_lO(method_718("랛롸렋렧렌룦룒", 47085));

                     int var44;
                     try {
                        while (true) {
                           String var86 = var1.method_628().readUTF();
                           var360.addElement(new I1Il(var86, class_1.field_3, 88822, null));
                        }
                     } catch (Exception var234) {
                        if (Ilol.method_808().field_817 == null) {
                           return;
                        }

                        var44 = 0;
                     }

                     while (var44 < Ilol.method_808().field_817.field_870.field_504.length) {
                        String[] var87 = Ilol.method_808().field_817.field_870.field_504[var44];
                        var360.addElement(new I1Il(var87[0], class_1.field_3, 88820, var87));
                        var44++;
                     }

                     class_1.field_13.method_632(var360);
                     break;
                  case 38:
                     I1OO.I__o();
                     short var30 = var1.method_628().readShort();
                     I_Ol.II__(method_718("랢로롮렄렶룝룮뢙뢶륅륺륢뤨맄릢릞", 47085) + var30);
                     String var31 = I_Ol.IIIo(var1.method_628().readUTF());

                     for (int var76 = 0; var76 < I1_I.IIOI.size(); var76++) {
                        I_11 var32 = (I_11)I1_I.IIOI.elementAt(var76);
                        I_Ol.II__(method_718("랃롼롈롪렀룬뢚룦", 47085) + var32.field_870.lll0);
                        if (var32.field_870.lll0 == var30) {
                           Ilo1.method_802(var31, 100000, var32);
                           class_1.field_14.Iol_();
                           return;
                        }
                     }

                     I_11 var127;
                     if ((var127 = new I_11(var30, 0, 0, 0, var30, I1_I.field_713.III1[Ilol.method_808().IOIO][2])).field_870.lll0 == 5) {
                        var127.IOI_ = 5;
                     }

                     try {
                        var127.IO_l = var1.method_628().readShort();
                     } catch (Exception var221) {
                     }

                     Ilo1.method_802(var31, 100000, var127);
                     class_1.field_14.Iol_();
                     break;
                  case 39:
                     I1_I.method_748().IoOl = 2;
                     I1_I.method_748();
                     break;
                  case 40:
                     class_1.III0 = 150;
                     short var128 = var1.method_628().readShort();
                     byte var77 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랹롍롸렁롉룏룢뢒룅륭륍뤦뤄맸릢릞", 47085) + var77);
                     String var129 = I_Ol.IIIo(var1.method_628().readUTF());
                     String var130 = I_Ol.IIIo(var1.method_628().readUTF());
                     String[] var131;
                     String[] var132 = new String[(var131 = new String[var1.method_628().readByte()]).length];
                     I1_I.IlO_ = new int[var131.length];
                     I1_I.IlOO = new int[var131.length];
                     short[] var133 = new short[var131.length];
                     short var134 = -1;

                     for (byte var135 = 0; var135 < var131.length; var135 += 1) {
                        String var667 = I_Ol.IIIo(var1.method_628().readUTF());
                        I1_I.IlO_[var135] = var1.method_628().readByte();
                        I1_I.IlOO[var135] = var1.method_628().readShort();
                        String var669 = I_Ol.IIIo(var1.method_628().readUTF());
                        var133[var135] = -1;
                        if (!var667.equals("")) {
                           var131[var135] = var667;
                           var132[var135] = var669;
                        }
                     }

                     try {
                        var134 = var1.method_628().readShort();

                        for (byte var665 = 0; var665 < var131.length; var665 += 1) {
                           var133[var665] = var1.method_628().readShort();
                        }
                     } catch (Exception var238) {
                     }

                     Ilol.method_808().field_809 = new IOlI(var128, (byte)var77, var129, var130, var131, var133, var134, var132);
                     if (Ilol.method_808().field_817 != null) {
                        I_11.I00O();
                     }

                     Ilol.III1(false);
                     break;
                  case 41:
                     class_1.III0 = 100;
                     I_Ol.II__(method_718("랹롍롸렁롉룆룢뢞뢱", 47085));
                     Ilol.method_808().field_809.l10l++;
                     Ilol.method_808().field_809.II0_ = 0;
                     I_11.I00O();
                     Ilol.III1(true);
                     break;
                  case 43:
                     class_1.III0 = 50;
                     Ilol.method_808().field_809.II0_ = var1.method_628().readShort();
                     if (Ilol.method_808().field_817 != null) {
                        I_11.I00O();
                     }

                     try {
                        short var362 = var1.method_628().readShort();
                        short var467 = var1.method_628().readShort();
                        Ilol.method_808().III_ = var362;
                        Ilol.method_808().IIIO = var467;
                        I_Ol.II__(method_718("랮롁롯롪롉뢨룳뢇뢶륏를뤗뤱맄맞맪릘맆먯먉먆먕뫶뫆몜몰묳묏뭱뭐뮯뮎뮵뮐뱲밊", 47085) + var362 + method_718("랑", 47085) + var467);

                        for (int var468 = 0; var468 < IOlO.IlI_.size(); var468++) {
                           I_Ol.II__(method_718("럐렱렖롴롉", 47085) + IOlO.IlI_.elementAt(var468));
                        }
                     } catch (Exception var236) {
                     }
                     break;
                  case 46:
                     Ilol.field_830 = false;
                     Ilol.method_808().IIIo(var1.method_628().readShort(), var1.method_628().readShort());
                     break;
                  case 47:
                     I1_I.method_748().I01o();
                     break;
                  case 50:
                     short var78 = var1.method_628().readByte();
                     I_1o.field_495.removeAllElements();

                     for (int var79 = 0; var79 < var78; var79++) {
                        class_23 var666;
                        (var666 = new class_23()).IIII = var1.method_628().readShort();
                        var666.IIoo = var1.method_628().readUTF();
                        var666.field_574 = var1.method_628().readUTF();
                        I_1o.field_495.addElement(var666);
                        boolean var668 = I_O1.method_558(String.valueOf(var666.IIII)) != -1;
                        var666.field_575 = var668;
                     }
                     break;
                  case 54:
                     Ilol var349;
                     if ((var349 = I1_I.method_762(var1.method_628().readInt())) == null) {
                        return;
                     }

                     int var136 = var1.method_628().readUnsignedByte();
                     if ((IOlO.method_469(var349.I_o_, var349.I_oO) & 2) == 2) {
                        var349.method_817(I1_I.field_691[var136], 0);
                     } else {
                        var349.method_817(I1_I.field_691[var136], 1);
                     }

                     I_I_[] var137 = new I_I_[10];
                     int var34 = 0;

                     try {
                        for (var34 = 0; var34 < var137.length; var34++) {
                           new StringBuffer(method_718("랾롍렜롼롐뢱뢞룷뢓뤰뤎뤬뤔맭", 47085)).append(var34).toString();
                           I_I_ var671 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readByte());
                           var137[var34] = var671;
                           if (var34 == 0) {
                              if (var349.I_o_ <= var671.field_903) {
                                 var349.IOI1 = 1;
                              } else {
                                 var349.IOI1 = -1;
                              }
                           }

                           new StringBuffer(method_718("랾롍렜롼롐뢱뢞룷뢓뤱뤎뤬뤔맭", 47085)).append(var34).toString();
                        }
                     } catch (Exception var237) {
                     }

                     if (var34 <= 0) {
                        break;
                     }

                     var349.field_819 = new I_I_[var34];

                     for (int var371 = 0; var371 < var349.field_819.length; var371++) {
                        var349.field_819[var371] = var137[var371];
                     }

                     var349.IIIl = null;
                     var349.IIII = var349.field_819[0];
                     break;
                  case 56:
                     int var358;
                     if ((var358 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                        boolean var138 = false;
                        Ilol var347;
                        (var347 = Ilol.method_808()).IOl_ = var1.II_I();
                        int var139;
                        if ((var139 = var1.II_I()) != 0) {
                           var347.IOoo();
                        }

                        try {
                           var138 = var1.method_628().readBoolean();
                           byte var140;
                           if ((var140 = var1.method_628().readByte()) != -1) {
                              I_Ol.II__(method_718("랅롥롟롪렌룮룁룻룅", 47085) + var140);
                              I1lI.method_692(new I1ll(var140, var347.I_o_, var347.I_oO, 3, 1, -1));
                           }
                        } catch (Exception var220) {
                        }

                        if (Ilol.method_808().III0 != 4) {
                           if (var139 == 0) {
                              I1_I.method_769(IO11.IOlI, var347.I_o_, var347.I_oO - var347.IO11, 0, -3, 7);
                           } else {
                              I1_I.method_769(method_718("럀", 47085) + var139, var347.I_o_, var347.I_oO - var347.IO11, 0, -3, !var138 ? 0 : 3);
                           }
                        }
                     } else {
                        Ilol var348;
                        if ((var348 = I1_I.method_762(var358)) == null) {
                           return;
                        }

                        var348.IOl_ = var1.II_I();
                        boolean var670 = false;
                        int var672;
                        if ((var672 = var1.II_I()) != 0) {
                           var348.IOoo();
                        }

                        try {
                           var670 = var1.method_628().readBoolean();
                           byte var673;
                           if ((var673 = var1.method_628().readByte()) != -1) {
                              I_Ol.II__(method_718("랅롥롟롪렌룮룁룻룅", 47085) + var673);
                              I1lI.method_692(new I1ll(var673, var348.I_o_, var348.I_oO, 3, 1, -1));
                           }
                        } catch (Exception var219) {
                        }

                        if (var348.III0 != 4) {
                           if (var672 == 0) {
                              I1_I.method_769(IO11.IOlI, var348.I_o_, var348.I_oO - var348.IO11, 0, -3, 4);
                           } else {
                              I1_I.method_769(method_718("럀", 47085) + var672, var348.I_o_, var348.I_oO - var348.IO11, 0, -3, !var670 ? 5 : 3);
                           }
                        }
                     }
                     break;
                  case 57:
                     I_lO var27;
                     (var27 = new I_lO(method_718("랛롡롎려렜뢨룲뢏", 47085))).addElement(new I1Il(var1.method_628().readUTF(), class_1.field_3, 88817, null));
                     class_1.field_13.method_632(var27);
                     break;
                  case 58:
                     Ilol var141;
                     int var356;
                     if ((var356 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                        var141 = Ilol.method_808();
                     } else {
                        var141 = I1_I.method_762(var356);
                     }

                     var141.field_820 = new short[3];
                     var141.field_820[0] = 0;
                     short var142 = var1.method_628().readShort();
                     short var143 = var1.method_628().readShort();
                     var141.field_820[1] = var142;
                     var141.field_820[2] = var143;

                     try {
                        Ilol var674;
                        if ((var356 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                           var674 = Ilol.method_808();
                        } else {
                           var674 = I1_I.method_762(var356);
                        }

                        var674.I_o_ = var142;
                        var674.I_oO = var143;
                     } catch (Exception var218) {
                        var218.printStackTrace();
                     }
                     break;
                  case 62:
                     Ilol var346;
                     if ((var346 = I1_I.method_762(var1.method_628().readInt())) != null) {
                        var346.IO_O = Ilol.method_808().IOI_;
                        Ilol.method_808().field_817 = null;
                        Ilol.method_808().IIII = null;
                        Ilol.method_808().field_818 = null;
                        Ilol.method_808().IIIl = var346;
                        Ilol.I_II = true;
                        I1_I.field_713.IIII(var346.IIO1 + IO11.field_361, 0);
                     }
                     break;
                  case 63:
                     Ilol.method_808().IO_O = var1.method_628().readInt();
                     Ilol.method_808().field_817 = null;
                     Ilol.method_808().IIII = null;
                     Ilol.method_808().field_818 = null;
                     Ilol.method_808().IIIl = I1_I.method_762(Ilol.method_808().IO_O);
                     Ilol.I_II = true;
                     break;
                  case 64:
                     Ilol var345 = Ilol.method_808();

                     try {
                        var345 = I1_I.method_762(var1.method_628().readInt());
                     } catch (Exception var217) {
                     }

                     var345.IO_O = -9999;
                     break;
                  case 65:
                     byte var246 = var1.method_628().readByte();
                     String var144 = var1.method_628().readUTF();
                     short var6 = var1.method_628().readShort();
                     if (I1ol.II1O(var246)) {
                        if (var6 != 0) {
                           I1ol.method_638(var246).method_639(var246, var144, var6);
                        } else {
                           I1_I.IIO1.removeElement(I1ol.method_638(var246));
                        }
                     } else {
                        I1ol var675;
                        (var675 = new I1ol()).method_639(var246, var144, var6);
                        I1_I.IIO1.addElement(var675);
                     }

                     I_Ol.II__(
                        method_718("랄롨롦렯렚룻룆뢡뢀륐륊뤯뤄릠릴릞린릙멨멉머먟뫲뫥몡몆묳묙뭱묄믦믃뮨뮡뱮뱙밺밉볠볃볿볞봹봂뵡", 47085)
                           + var246
                           + method_718("랲", 47085)
                           + var144
                           + method_718("랲", 47085)
                           + var6
                     );
                     break;
                  case 66:
                     this.III0(var1);
                     break;
                  case 68:
                     I_Ol.II__(method_718("랬롈롯롪렠룜룢뢋룅륐륬륢뤬링맏릞맰맑먶먗면멕몺몛뫸뫙묾묟뭼뭝뮢뮃믠믁밦밇뱤뱅벪벋볨볉봮봏뵬뵍뵒붳붐뷱뷖븷블빵", 47085));
                     short var28 = var1.method_628().readShort();
                     short var145 = var1.method_628().readShort();
                     short var146 = var1.method_628().readShort();
                     short var29 = var1.method_628().readShort();
                     int var147 = var1.method_628().readInt();
                     short var148 = 0;
                     if (var147 == -2) {
                        var148 = var1.method_628().readShort();
                     }

                     I10_ var149 = new I10_(var147, var28, var145, var146, var29, var148);
                     boolean var150 = false;

                     for (byte var676 = 0; var676 < I1_I.II_0.size(); var676 += 1) {
                        if (((I10_)I1_I.II_0.elementAt(var676)).lI0l == var149.lI0l) {
                           var150 = true;
                           break;
                        }
                     }

                     if (!var150) {
                        I1_I.II_0.addElement(var149);
                     }
                     break;
                  case 69:
                     class_14.I_1o = var1.method_628().readByte() != 0;
                     break;
                  case 81:
                     I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     var1.method_628().readBoolean();
                     break;
                  case 82:
                     ((I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte())).IOoo = var1.method_628().readBoolean();
                     break;
                  case 83:
                     Ilol var344;
                     int var355;
                     if ((var355 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                        var344 = Ilol.method_808();
                     } else {
                        var344 = I1_I.method_762(var355);
                     }

                     if (var344 == null) {
                        return;
                     }

                     I_I_ var151 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     if (var344.IIIl != null) {
                        var344.IIIl.IIII(var151);
                     }
                     break;
                  case 84:
                     Ilol var25;
                     int var26;
                     if ((var26 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                        var25 = Ilol.method_808();
                     } else if ((var25 = I1_I.method_762(var26)) == null) {
                        return;
                     }

                     var25.IOl_ = var25.IOlo;
                     var25.IOl1 = var25.field_799;
                     var25.I_o_ = var1.method_628().readShort();
                     var25.I_oO = var1.method_628().readShort();
                     var25.method_833();
                     break;
                  case 85:
                     I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     var1.method_628().readBoolean();
                     break;
                  case 86:
                     I_I_ var152;
                     (var152 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte())).field_909 = var1.method_628().readBoolean();
                     if (!var152.field_909) {
                        class_31.method_795(77, var152.field_903, var152.field_904 - 9, 1);
                     }
                     break;
                  case 87:
                     ((I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte())).field_910 = var1.method_628().readBoolean();
                     break;
                  case 88:
                     String var153 = var1.method_628().readUTF();
                     new Short(var1.method_628().readShort());
                     break;
                  case 90:
                     method_706(var1);
                     break;
                  case 92:
                     if (class_1.field_12 == I1_I.field_686) {
                        class_1.III_();
                     }

                     String var154 = var1.method_628().readUTF();
                     String var155 = I_Ol.IIIo(var1.method_628().readUTF());
                     I_Ol.II__(method_718("랎롤롊렾롉룼룂뢾뢑뤹뤃", 47085) + var155);
                     String var156 = "";
                     Ilol var157 = null;
                     byte var158 = 0;
                     if (!var154.equals("")) {
                        (var157 = new Ilol()).IOI_ = var1.method_628().readInt();
                        var157.field_837 = var1.method_628().readShort();
                        var157.IOoo = var1.method_628().readShort();
                        var157.I0II = var1.method_628().readShort();
                        var157.I0Il = var1.method_628().readShort();
                        var157.field_838 = var1.method_628().readShort();
                        var158 = var1.method_628().readByte();
                        var157.IIO1 = var154;
                     }

                     var156 = var156 + var155;
                     I1OO.I__o();
                     if (var154.equals("")) {
                        I1_I.field_713.IIII(var156, 0);
                     } else {
                        I1_I.field_714.method_654(var156, var157, var158 == 0);
                        if (class_1.field_14.I_10 && class_1.field_14.IoI_ == 8) {
                           class_1.field_14.method_590();
                        }
                     }
                     break;
                  case 94:
                     I1_I.field_713.IIII(var1.method_628().readUTF(), 0);
                     break;
                  case 112:
                     byte var12;
                     if ((var12 = var1.method_628().readByte()) == 0) {
                        I_1o.IIOO = var1.method_628().readShort();
                        I_1o.Ill0 = var1.method_628().readUTF();
                     } else if (var12 == 1) {
                        byte var2 = var1.method_628().readByte();
                        Ilol.method_808().field_815 = new String[var2][];
                        Ilol.method_808().field_816 = new short[var2][];
                        class_1.field_14.IIl1 = new String[var2][];

                        for (int var3 = 0; var3 < var2; var3++) {
                           class_1.field_14.IIl1[var3] = new String[2];
                           String[] var11;
                           if ((var11 = I_Ol.method_563(var1.method_628().readUTF(), method_718("럧", 47085), 0)).length == 2) {
                              class_1.field_14.IIl1[var3] = var11;
                           }

                           if (var11.length == 1) {
                              class_1.field_14.IIl1[var3][0] = var11[0];
                              class_1.field_14.IIl1[var3][1] = "";
                           }

                           var12 = var1.method_628().readByte();
                           Ilol.method_808().field_815[var3] = new String[var12];
                           Ilol.method_808().field_816[var3] = new short[var12];

                           for (int var4 = 0; var4 < var12; var4++) {
                              Ilol.method_808().field_816[var3][var4] = var1.method_628().readShort();
                              Ilol.method_808().field_815[var3][var4] = var1.method_628().readUTF();
                           }
                        }

                        class_1.field_14.field_472[25] = class_1.field_14.IIl1;
                        class_1.field_14.IOoI();
                        class_1.field_14.I__0();
                     }
               }

               switch (var1.II00) {
                  case -75:
                     I_I_ var520 = null;

                     try {
                        var520 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     } catch (Exception var216) {
                     }

                     if (var520 == null) {
                        return;
                     }

                     var520.II0o = var1.method_628().readByte();
                     if (var520.II0o > 0) {
                        var520.I10_ = I_Ol.III_(0, 3);
                        return;
                     }

                     return;
                  case -73:
                     byte var285 = var1.method_628().readByte();

                     for (int var293 = 0; var293 < I1_I.IIOI.size(); var293++) {
                        I_11 var559;
                        if ((var559 = (I_11)I1_I.IIOI.elementAt(var293)).field_870.lll0 == var285) {
                           if (var1.method_628().readByte() == 0) {
                              var559.IOIo = true;
                           } else {
                              var559.IOIo = false;
                           }

                           return;
                        }
                     }

                     return;
                  case -17:
                     Ilol.method_808().I_I_ = true;
                     Ilol.method_808().IIIO = var1.method_628().readByte();
                     Ilol.method_808().method_831(var1.method_628().readShort(), var1.method_628().readShort());

                     try {
                        Ilol.method_808().Illo = var1.method_628().readLong();
                        Ilol.method_808().IO10();
                     } catch (Exception var215) {
                     }

                     Ilol.method_808();
                     return;
                  case -16:
                     if (Ilol.method_808().IIlI != 0 || Ilol.method_808().IIll != 0) {
                        Ilol.method_808().I_o_ = Ilol.method_808().IIlI;
                        Ilol.method_808().I_oO = Ilol.method_808().IIll;
                        Ilol.method_808().IIlI = Ilol.method_808().IIll = 0;
                     }

                     Ilol.method_808().method_833();
                     Ilol.method_808().I10l = false;
                     Ilol.method_808().I_I_ = false;
                     return;
                  case -13:
                     int var506 = var1.method_628().readUnsignedByte();
                     if (var506 == 255) {
                        int var558 = var1.method_628().readUnsignedShort();
                        int var564 = var1.method_628().readUnsignedByte();
                        byte var569 = var1.method_628().readByte();
                        short var577 = var1.method_628().readShort();
                        short var582 = var1.method_628().readShort();
                        int var587 = var1.method_628().readInt();
                        int var593 = var1.method_628().readInt();
                        I_I_ var598 = new I_I_(
                           var558, false, false, false, false, false, var564, var569, var587, (byte)1, var593, var577, var582, (byte)5, (byte)0
                        );
                        var598.I010 = var598.field_903;
                        var598.I01o = var598.field_904;
                        var598.I0I1 = false;
                        I1_I.field_696.addElement(var598);
                        class_31.method_795(60, var598.field_903, var598.field_904, 1);
                        return;
                     }

                     if (var506 > I1_I.field_696.size() - 1 || var506 < 0) {
                        return;
                     }

                     I_I_ var519;
                     (var519 = (I_I_)I1_I.field_696.elementAt(var506)).lIOO = var1.method_628().readByte();
                     var519.II0o = var1.method_628().readByte();
                     if (var519.II0o != 0) {
                        var519.I10_ = I_Ol.III_(0, 3);
                     }

                     var519.field_903 = var519.llIO;
                     var519.field_904 = var519.llI0;
                     I_Ol.II__(method_718("랥롃롢롪렺룁룩뢎룅를뤞륢", 47085) + var519.llIO + method_718("럍롵렖롪", 47085) + var519.llI0);
                     var519.status = 5;
                     var519.I0Io = false;
                     var519.llIl = var1.method_628().readInt();
                     var519.llI1 = var519.llIl;
                     var519.I00l();
                     class_31.method_795(60, var519.field_903, var519.field_904, 1);
                     return;
                  case -12:
                     I_Ol.II__(method_718("랾롉롹렜렬룚뢇뢕뢠륊륧륢뤬맏망릞릙릵멞", 47085));
                     I_I_ var518 = null;

                     try {
                        var518 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     } catch (Exception var214) {
                     }

                     if (var518 == null || var518.status == 0 || var518.status == 0) {
                        return;
                     }

                     var518.IOl0();

                     try {
                        int var495 = var1.II_I();
                        if (var1.method_628().readBoolean()) {
                           I1_I.method_769(method_718("럀", 47085) + var495, var518.field_903, var518.field_904 - var518.field_906, 0, -2, 3);
                        } else {
                           I1_I.method_769(method_718("럀", 47085) + var495, var518.field_903, var518.field_904 - var518.field_906, 0, -2, 5);
                        }

                        byte var533 = var1.method_628().readByte();

                        for (int var537 = 0; var537 < var533; var537++) {
                           I10_ var557 = new I10_(
                              var1.method_628().readShort(),
                              var1.method_628().readShort(),
                              var518.field_903,
                              var518.field_904,
                              var1.method_628().readShort(),
                              var1.method_628().readShort()
                           );
                           int var264 = var1.method_628().readInt();
                           var557.IoIO = var264;
                           I_Ol.II__(method_718("랝론롊렳렌룺룎뢢룘뤤", 47085) + var264 + method_718("럍롡롒롪렀룬뢚룦", 47085) + Ilol.method_808().IOI_);
                           I1_I.II_0.addElement(var557);
                           if (I_Ol.method_561(var557.field_535 - Ilol.method_808().I_oO) < 24
                              && I_Ol.method_561(var557.field_534 - Ilol.method_808().I_o_) < 24) {
                              Ilol.method_808().IIIl = null;
                           }
                        }
                        break label5540;
                     } catch (Exception var243) {
                        return;
                     }
                  case -11:
                     I_I_ var517 = null;

                     try {
                        int var493 = var1.method_628().readUnsignedByte();
                        I_Ol.II__(method_718("란롣롉롪렀룦룃뢣뢝뤹뤃", 47085) + var493);
                        var517 = (I_I_)I1_I.field_696.elementAt(var493);
                     } catch (Exception var213) {
                     }

                     if (var517 == null) {
                        return;
                     }

                     Ilol.method_808().I11O = false;
                     Ilol.field_830 = false;
                     int var494 = var1.II_I();

                     int var556;
                     try {
                        var556 = var1.II_I();
                     } catch (Exception var212) {
                        var556 = 0;
                     }

                     if (var517.I0IO) {
                        Ilol.method_808().method_830(var494, var556, false, true);
                     } else {
                        var517.lllI = var494;
                        var517.I1OI = var556;
                        var517.IIIl(Ilol.method_808());
                     }

                     return;
                  case -10:
                     I_I_ var516 = null;

                     try {
                        var516 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     } catch (Exception var211) {
                     }

                     if (var516 == null) {
                        return;
                     }

                     Ilol var551;
                     if ((var551 = I1_I.method_762(var1.method_628().readInt())) == null) {
                        return;
                     }

                     int var492 = var1.II_I();
                     var516.lllI = var551.IOl_ - var492;

                     try {
                        var551.IOl1 = var1.II_I();
                     } catch (Exception var210) {
                     }

                     if (var516.I0IO) {
                        var551.method_830(var516.lllI, 0, false, true);
                     } else {
                        var516.IIIl(var551);
                     }

                     return;
                  case -9:
                     I_I_ var515 = null;

                     try {
                        var515 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     } catch (Exception var209) {
                     }

                     if (var515 == null) {
                        return;
                     }

                     var515.llIl = var1.II_I();
                     var515.I00l();
                     int var491;
                     if ((var491 = var1.II_I()) == 1) {
                        return;
                     }

                     if (var491 > 1) {
                        var515.IIII();
                     }

                     boolean var563 = var1.method_628().readBoolean();
                     byte var532;
                     if ((var532 = var1.method_628().readByte()) != -1) {
                        I1lI.method_692(new I1ll(var532, var515.field_903, var515.method_15(), 3, 1, -1));
                     }

                     if (var563) {
                        I1_I.method_769(method_718("럀", 47085) + var491, var515.field_903, var515.method_15() - var515.II1I(), 0, -2, 3);
                        return;
                     }

                     if (var491 == 0) {
                        var515.field_903 = var515.llIO;
                        var515.field_904 = var515.llI0;
                        I1_I.method_769(IO11.IOlI, var515.field_903, var515.method_15() - var515.II1I(), 0, -2, 4);
                        return;
                     }

                     if (var491 <= 1) {
                        return;
                     }

                     I1_I.method_769(method_718("럀", 47085) + var491, var515.field_903, var515.method_15() - var515.II1I(), 0, -2, 5);
                     return;
                  case -8:
                     Ilol var550;
                     if ((var550 = I1_I.method_762(var1.method_628().readInt())) != null) {
                        var550.IIIO = var1.method_628().readByte();
                        var550.method_832(var1.method_628().readShort(), var1.method_628().readShort());
                        return;
                     }

                     return;
                  case -7:
                     int var487 = var1.method_628().readInt();

                     for (int var505 = 0; var505 < I1_I.II_O.size(); var505++) {
                        Ilol var525 = null;

                        try {
                           var525 = (Ilol)I1_I.II_O.elementAt(var505);
                        } catch (Exception var208) {
                        }

                        if (var525 == null) {
                           return;
                        }

                        if (var525.IOI_ == var487) {
                           new StringBuffer(method_718("랾롍렓렲롛룱", 47085)).append(var505).toString();
                           var525.method_829(var1.method_628().readShort(), var1.method_628().readShort(), 0);
                           System.currentTimeMillis();
                           return;
                        }
                     }

                     return;
                  case -6:
                     I_Ol.II__(method_718("랽례롪렓렬룚뢇뢔뢠륉륬뤔뤤맄릾릟맼망먺먇멤멅몪몋뫨뫉묮묏뭬뭍뮲", 47085));
                     int var486 = var1.method_628().readInt();

                     for (int var504 = 0; var504 < I1_I.II_O.size(); var504++) {
                        Ilol var524;
                        if ((var524 = (Ilol)I1_I.II_O.elementAt(var504)) != null && var524.IOI_ == var486) {
                           if (!var524.I1_1 && !var524.I11I) {
                              class_31.method_795(60, var524.I_o_, var524.I_oO, 1);
                           }

                           if (!var524.I11I) {
                              I1_I.II_O.removeElementAt(var504);
                           }

                           return;
                        }
                     }

                     return;
                  case -5:
                     int var270 = var1.method_628().readInt();
                     int var279;
                     Ilol var562;
                     if ((var279 = var1.method_628().readInt()) != -100) {
                        (var562 = new Ilol()).IOI_ = var270;
                        var562.IO1I = var279;
                     } else {
                        (var562 = new I1oO()).IOI_ = var270;
                        var562.IO1I = var279;
                     }

                     if (var562.IO1I == -2) {
                        var562.I_Il = true;
                     }

                     if (method_713(var562, var1)) {
                        byte var567 = var1.method_628().readByte();
                        if (var562.I_oO <= 10 && var567 != 0 && var567 != 2) {
                           IOl1 var573;
                           (var573 = new IOl1(var562.I_o_, var562.I_oO, var562.field_837, var562.IOI1, 1, false, var567 == 1 ? var562.IOIO : var567)).field_327 = var562.IOI_;
                           var562.field_789 = true;
                           IOl1.method_475(var573);
                        }

                        if (var567 == 2) {
                           var562.method_813();
                        }

                        for (int var484 = 0; var484 < I1_I.field_696.size(); var484++) {
                           I_I_ var574;
                           if ((var574 = (I_I_)I1_I.field_696.elementAt(var484)) != null && var574.I0I1 && var574.field_907 == var562.IOI_) {
                              I_Ol.II__(method_718("랎롣렋롻롉룫룈뢨룅륵륖뤣뤈", 47085));
                              var562.IIIl = var574;
                              var562.IIIl.field_903 = var562.I_o_;
                              var562.IIIl.field_904 = var562.I_oO - 40;
                              break;
                           }
                        }

                        I1_I.IIO_(var270);
                        I1_I.II_O.addElement(var562);
                        var562.IIlo = var1.method_628().readByte();
                        short var575;
                        if ((var575 = var1.method_628().readShort()) != -1) {
                           var562.field_824 = true;
                           if (var575 == 346 || var575 == 347 || var575 == 348) {
                              var562.I1OI = false;
                           } else if (var575 == 349 || var575 == 350 || var575 == 351) {
                              var562.I1OI = true;
                           } else if (var575 == 396) {
                              var562.I1Ol = true;
                           } else if (var575 == 532) {
                              var562.I1O1 = true;
                           } else if (var575 >= Ilol.IIIl) {
                              var562.III1 = var575;
                           }
                        } else {
                           var562.field_824 = false;
                        }
                     }

                     byte var568 = var1.method_628().readByte();
                     var562.field_828 = var568;
                     var562.I11l = var1.method_628().readByte() == 1;

                     try {
                        var562.IIlo = var1.method_628().readShort();
                        var562.field_864 = var1.method_628().readByte();
                        var562.II1I = var1.method_628().readShort();
                     } catch (Exception var207) {
                     }

                     I1_I.method_748();
                     I1_I.method_773(var562.IOI_, var562.field_828);
                     if (var562.I0Il >= 201 && var562.I0Il < 255) {
                        I1ll var576;
                        (var576 = new I1ll(var562.I0Il, var562, 2, -1, 10, (byte)1)).I_O0 = 5;
                        var562.method_841(var576);
                        return;
                     }

                     for (int var485 = 0; var485 < 54; var485++) {
                        var562.method_842(0, var485 + 201);
                     }

                     return;
                  case -3:
                     byte var251 = var1.method_628().readByte();
                     int var263 = var1.method_628().readInt();
                     if (var251 == 0) {
                        Ilol var301 = Ilol.method_808();
                        var301.Illo += var263;
                     }

                     if (var251 == 1) {
                        Ilol var302 = Ilol.method_808();
                        var302.Il1I += var263;
                     }

                     if (var251 == 2) {
                        Ilol var303 = Ilol.method_808();
                        var303.Illo += var263;
                        var303 = Ilol.method_808();
                        var303.Il1I += var263;
                     }

                     Ilol.method_808().IO10();
                     if (Ilol.method_808().III0 == 3) {
                        return;
                     }

                     I1_I.method_769(
                        (var263 > 0 ? method_718("럆", 47085) : "") + var263, Ilol.method_808().I_o_, Ilol.method_808().I_oO - Ilol.method_808().IO11, 0, -4, 2
                     );
                     if (var263 <= 0 || Ilol.method_808().field_790 == null || Ilol.method_808().field_790.II1o != 5002) {
                        return;
                     }

                     class_31.method_795(55, Ilol.method_808().field_790.IIO1, Ilol.method_808().field_790.field_458, 1);
                     class_31.method_795(55, Ilol.method_808().I_o_, Ilol.method_808().I_oO, 1);
                     return;
                  case -2:
                     int var278 = var1.method_628().readInt();
                     Ilol var300 = Ilol.method_808();
                     var300.IO1o += var278;
                     I1_I.method_769(
                        var278 > 0 ? method_718("럆", 47085) + var278 : "" + var278,
                        Ilol.method_808().I_o_,
                        Ilol.method_808().I_oO - Ilol.method_808().IO11 - 10,
                        0,
                        -2,
                        1
                     );
                     return;
                  case -1:
                     int var292 = var1.method_628().readInt();
                     Ilol var298 = Ilol.method_808();
                     var298.Il11 += var292;
                     Ilol.method_808().field_788 = IO10.IIIO(Ilol.method_808().Il11);
                     var298 = Ilol.method_808();
                     var298.IO1o -= var292;
                     I1_I.method_769(method_718("럆", 47085) + var292, Ilol.method_808().I_o_, Ilol.method_808().I_oO - Ilol.method_808().IO11 - 10, 0, -2, 1);
                     return;
                  case 18:
                     byte var531 = var1.method_628().readByte();

                     for (int var536 = 0; var536 < var531; var536++) {
                        int var277 = var1.method_628().readInt();
                        short var581 = var1.method_628().readShort();
                        short var280 = var1.method_628().readShort();
                        int var291 = var1.II_I();
                        Ilol var586;
                        if ((var586 = I1_I.method_762(var277)) != null) {
                           var586.I_o_ = var581;
                           var586.I_oO = var280;
                           var586.IOl_ = var291;
                           System.currentTimeMillis();
                        }
                     }

                     return;
                  case 19:
                     Ilol.method_808();
                     var1.method_628().readUnsignedShort();
                     Ilol.method_808();
                     var1.method_628().readUnsignedShort();
                     return;
                  case 44:
                     int var490 = var1.method_628().readInt();
                     String var580 = var1.method_628().readUTF();
                     I_Ol.II__(method_718("래롿롎렸롉룡룃룻룅", 47085) + var490 + method_718("럍롸롎렲렝뢵뢇", 47085) + var580);
                     Ilol var549;
                     if (Ilol.method_808().IOI_ == var490) {
                        var549 = Ilol.method_808();
                     } else {
                        var549 = I1_I.method_762(var490);
                     }

                     if (var549 != null) {
                        var549.II10(var580);
                        return;
                     }

                     if (var490 <= -100000) {
                        try {
                           ((I_I_)I1_I.field_696.elementAt(-var490 - 100000)).II_1(var580);
                        } catch (Exception var206) {
                        }

                        return;
                     }

                     return;
                  case 45:
                     I_I_ var514 = null;

                     try {
                        var514 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     } catch (Exception var205) {
                     }

                     if (var514 != null) {
                        var514.llIl = var1.method_628().readInt();
                        var514.I00l();
                        I1_I.method_769(IO11.IOlI, var514.field_903, var514.field_904 - var514.field_906, 0, -2, 4);
                     }

                     return;
                  case 66:
                     I_Ol.II__(method_718("랠롉렋렎렠룍뢇뢞뢵뤤륧뤍뤶많릿맰릒릨먻멳먔먨뫛뫳몘몱뭝뭦뭱묩믊믺믬믍밪밋뱨뱉벦벇볤볅봢봃뵠뵁뵞붿붜뷽뷚븻븘빹빖뺷뺔뻵", 47085));
                     return;
                  case 74:
                     I_I_ var513 = null;

                     try {
                        var513 = (I_I_)I1_I.field_696.elementAt(var1.method_628().readUnsignedByte());
                     } catch (Exception var204) {
                     }

                     if (var513 == null || var513.status == 0 || var513.status == 0) {
                        return;
                     }

                     var513.status = 0;
                     class_31.method_795(60, var513.field_903, var513.field_904, 1);
                     I10_ var585 = new I10_(
                        var1.method_628().readShort(),
                        var1.method_628().readShort(),
                        var513.field_903,
                        var513.field_904,
                        var1.method_628().readShort(),
                        var1.method_628().readShort()
                     );
                     I1_I.II_0.addElement(var585);
                     if (I_Ol.method_561(var585.field_535 - Ilol.method_808().I_oO) >= 24 || I_Ol.method_561(var585.field_534 - Ilol.method_808().I_o_) >= 24) {
                        return;
                     }

                     Ilol.method_808().IIIl = null;
                     return;
                  case 95:
                     int var262 = var1.method_628().readInt();
                     Ilol var297 = Ilol.method_808();
                     var297.Il11 += var262;
                     Ilol.method_808().field_788 = IO10.IIIO(Ilol.method_808().Il11);
                     I1_I.method_769(
                        var262 > 0 ? method_718("럆", 47085) + var262 : "" + var262,
                        Ilol.method_808().I_o_,
                        Ilol.method_808().I_oO - Ilol.method_808().IO11 - 10,
                        0,
                        -2,
                        1
                     );
                     return;
                  case 96:
                     Ilol.method_808()
                        .IIl_
                        .addElement(
                           new IOll(
                              var1.method_628().readByte(),
                              var1.method_628().readShort(),
                              var1.method_628().readShort(),
                              var1.method_628().readUTF(),
                              var1.method_628().readUTF(),
                              var1.method_628().readByte(),
                              var1.method_628().readByte()
                           )
                        );
                     return;
                  case 97:
                     byte var284 = var1.method_628().readByte();

                     for (int var290 = 0; var290 < Ilol.method_808().IIl_.size(); var290++) {
                        IOll var584;
                        if ((var584 = (IOll)Ilol.method_808().IIl_.elementAt(var290)).II0I == var284) {
                           var584.I_O0 = var1.method_628().readShort();
                           return;
                        }
                     }

                     return;
                  case 127:
                     byte var583 = var1.method_628().readByte();
                     if (var583 == 0) {
                        int var589 = var1.method_628().readUnsignedShort();
                        I_lO var594 = new I_lO("");
                        int var599 = 0;

                        for (int var603 = 0; var603 < var589; var603++) {
                           try {
                              I10I var605 = new I10I();
                              var605.field_550 = var1.method_628().readShort();
                              var605.IIOl = var1.method_628().readShort();
                              var605.IIO1 = var1.method_628().readByte();
                              int var606 = var1.method_628().readUnsignedByte();
                              int var607 = var1.method_628().readUnsignedByte();
                              var605.II10 = var1.method_628().readByte();
                              if (var605.II10 == 0) {
                                 I_I_ var609 = new I_I_();
                                 var609.I1ll = var1.method_628().readShort();
                                 var605.III0 = var609;
                              } else {
                                 var1.method_628().readShort();
                                 var1.method_628().readShort();
                                 var1.method_628().readShort();
                                 var1.method_628().readShort();
                              }

                              var605.IIo_ = var1.method_628().readUTF();
                              var605.IIol = var1.method_628().readUTF();
                              var605.IIIo = var1.method_628().readByte();
                              var605.IIOO = var1.method_628().readByte();
                              var605.method_647((byte)var606, (byte)var607);
                              int var610 = var1.method_628().readUnsignedByte();
                              var605.field_551 = new I100[var610];

                              for (int var613 = 0; var613 < var610; var613++) {
                                 int var614 = var1.method_628().readUnsignedByte();
                                 short var617 = var1.method_628().readShort();
                                 int var623 = var1.method_628().readUnsignedByte();

                                 I100 var627;
                                 try {
                                    var627 = new I100(var614, var617);
                                 } catch (Exception var203) {
                                    var627 = new I100();
                                 }

                                 var627.II0I = (byte)var623;
                                 var605.field_551[var613] = var627;
                              }

                              var605.IIOI = var605.field_550;
                              var605.lIOl = var1.method_628().readShort();
                              var605.IIl1();
                              if (var605.IIIo != 0) {
                                 var599++;
                              }

                              var594.addElement(var605);
                           } catch (Exception var232) {
                              System.out
                                 .println(
                                    method_718("랶롾롊렮레룺룺룦뢉륫륊륢뤅맯맼릞릹릉먻멖먰먝뫢몖몡몜뭶묒묥묘믺뮎", 47085)
                                       + var603
                                       + method_718("럂", 47085)
                                       + var589
                                       + method_718("럗렬", 47085)
                                       + var232
                                 );
                              break;
                           }
                        }

                        class_29.method_734().method_735(var594, var599, 0);
                        return;
                     } else if (var583 == 1) {
                        short var590 = var1.method_628().readShort();
                        byte var595 = var1.method_628().readByte();
                        I10I var600 = I10I.method_650(class_29.IlII, var590);
                        if (var600 != null) {
                           var600.method_649((byte)var595);
                        }

                        class_29.IO11();
                        return;
                     } else {
                        if (var583 == 2) {
                           short var591 = var1.method_628().readShort();
                           byte var596 = var1.method_628().readByte();
                           I10I var601 = I10I.method_650(class_29.IlII, var591);
                           if (var601 != null) {
                              var601.method_648((byte)var596);
                              return;
                           }
                        } else if (var583 == 3) {
                           short var592 = var1.method_628().readShort();
                           int var597 = var1.method_628().readUnsignedByte();
                           int var602 = var1.method_628().readUnsignedByte();
                           I10I var604 = I10I.method_650(class_29.IlII, var592);
                           if (var604 != null) {
                              var604.method_647((byte)var597, (byte)var602);
                           }

                           return;
                        }

                        return;
                     }
               }
            } catch (Exception var244) {
               new StringBuffer(String.valueOf(var244.getMessage())).append(method_718("럍", 47085)).append(var244.toString()).toString();
               var244.printStackTrace();
            }

            return;
         }
      } finally {
         if (var1 != null) {
            var1.I0Oo();
         }
      }
   }

   private static void IIII(I_Il var0) throws IOException {
      byte var1;
      IloO.field_766 = new I__1[var1 = var0.method_628().readByte()];
      I_Ol.II__(method_718("랶례롮렄렴뢨룔뢪룅륪륄뤷뤎맩릿망릵릓멲먚", 47085) + var1);

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = var0.method_628().readInt();
         String var4 = var0.method_628().readUTF();
         short var5 = var0.method_628().readShort();
         short var6 = var0.method_628().readShort();
         short var7 = var0.method_628().readShort();
         long var8 = var0.method_628().readLong();
         IloO.field_766[var2] = new I__1(var3, var4, var5, var6, var7, var8);
      }

      class_1.field_16.I0l_();
      class_1.field_16.method_789(var1);
   }

   // $VF: renamed from: II (java.io.DataInputStream) void
   private static void method_707(DataInputStream var0) throws IOException {
      I1_I.II_I = var0.readByte();
      I1_I.method_748().field_699 = new I_oI[var0.readByte()];

      for (int var1 = 0; var1 < I1_I.method_748().field_699.length; var1++) {
         I1_I.method_748().field_699[var1] = new I_oI();
         I1_I.method_748();
         I1_I.method_748();
         var0.readUTF();
      }

      I1_I.field_697 = new I_l0[var0.readByte()];

      for (int var5 = 0; var5 < I1_I.field_697.length; var5++) {
         I1_I.field_697[var5] = new I_l0();
         I1_I.field_697[var5].II0I = var5;
         var0.readUTF();
         I1_I.field_697[var5].field_506 = new I_o1[var0.readByte()];

         for (int var2 = 0; var2 < I1_I.field_697[var5].field_506.length; var2++) {
            I1_I.field_697[var5].field_506[var2] = new I_o1();
            I1_I.field_697[var5].field_506[var2].IlIO = var0.readByte();
            I1_I.field_697[var5].field_506[var2].II1o = var0.readUTF();
            I1_I.field_697[var5].field_506[var2].l1OI = var0.readByte();
            I1_I.field_697[var5].field_506[var2].l1Ol = var0.readByte();
            I1_I.field_697[var5].field_506[var2].IoI_ = var0.readByte();
            I1_I.field_697[var5].field_506[var2].l1O1 = var0.readShort();
            I1_I.field_697[var5].field_506[var2].Il_I = var0.readUTF();
            short var3 = 130;
            if (class_1.field_11 == 128 || class_1.IIlI <= 208) {
               var3 = 100;
            }

            I1_I.field_697[var5].field_506[var2].II_0 = IO1I.IIl1.method_459(var0.readUTF(), var3);
            I1_I.field_697[var5].field_506[var2].IIIl = new I_0o[var0.readByte()];

            for (int var4 = 0; var4 < I1_I.field_697[var5].field_506[var2].IIIl.length; var4++) {
               I1_I.field_697[var5].field_506[var2].IIIl[var4] = new I_0o();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].II0I = var0.readShort();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].field_408 = I1_I.field_697[var5].field_506[var2];
               I1_I.field_697[var5].field_506[var2].IIIl[var4].l1__ = var0.readByte();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].field_409 = var0.readLong();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].field_410 = var0.readShort();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].l1_O = var0.readInt();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].l1_0 = var0.readShort();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].l1_o = var0.readShort();
               var0.readByte();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].field_411 = var0.readShort();
               var0.readShort();
               I1_I.field_697[var5].field_506[var2].IIIl[var4].field_412 = var0.readUTF();
               I_o_.IIII(I1_I.field_697[var5].field_506[var2].IIIl[var4]);
            }
         }
      }
   }

   // $VF: renamed from: III (java.io.DataInputStream) void
   private static void method_708(DataInputStream var0) throws IOException {
      I1_I.field_708 = var0.readByte();
      IOlO.II11 = new String[var0.readUnsignedByte()];

      for (int var1 = 0; var1 < IOlO.II11.length; var1++) {
         IOlO.II11[var1] = var0.readUTF();
      }

      I_11.field_871 = new I_1_[var0.readByte()];

      for (byte var4 = 0; var4 < I_11.field_871.length; var4++) {
         I_11.field_871[var4] = new I_1_();
         I_11.field_871[var4].lll0 = var4;
         I_11.field_871[var4].II1o = var0.readUTF();
         I_11.field_871[var4].lllo = var0.readShort();
         I_11.field_871[var4].field_503 = var0.readShort();
         I_11.field_871[var4].ll1I = var0.readShort();
         I_11.field_871[var4].field_504 = new String[var0.readByte()][];

         for (int var2 = 0; var2 < I_11.field_871[var4].field_504.length; var2++) {
            I_11.field_871[var4].field_504[var2] = new String[var0.readByte()];

            for (int var3 = 0; var3 < I_11.field_871[var4].field_504[var2].length; var3++) {
               I_11.field_871[var4].field_504[var2][var3] = var0.readUTF();
            }
         }
      }

      I_I_.field_902 = new I_Io[var0.readByte()];

      for (byte var5 = 0; var5 < I_I_.field_902.length; var5++) {
         I_I_.field_902[var5] = new I_Io();
         I_I_.field_902[var5].II0l = var0.readByte();
         I_I_.field_902[var5].II1o = var0.readUTF();
         I_I_.field_902[var5].llIl = var0.readInt();
         I_I_.field_902[var5].field_508 = var0.readByte();
         I_I_.field_902[var5].IIoI = var0.readByte();
         I_I_.field_902[var5].IIol = var0.readByte();
      }
   }

   // $VF: renamed from: II (java.io.DataInputStream, boolean) void
   private static void method_709(DataInputStream var0, boolean var1) throws IOException {
      I1_I.II1o = var0.readByte();
      if (var1) {
         I_O1.method_555(method_718("랣롞롴렮레룺룓", 47085), I_1l.method_624(var0));
         I_O1.method_555(method_718("랣롞롴렫렛룺룈뢱", 47085), I_1l.method_624(var0));
         I_O1.method_555(method_718("랣롞롴렯렏룮룂뢥뢑", 47085), I_1l.method_624(var0));
         I_O1.method_555(method_718("랣롞롴렣렄룩룀뢣", 47085), I_1l.method_624(var0));
         I_O1.method_555(method_718("랣롞롴렺레룺룓", 47085), I_1l.method_624(var0));
         I_O1.method_555(method_718("랣롞롴령렂룡룋뢪", 47085), I_1l.method_624(var0));
         I_O1.II_O(method_718("랣롞롏렫렝룩", 47085));
      }
   }

   // $VF: renamed from: II (byte[]) javax.microedition.lcdui.Image
   private static Image method_710(byte[] var0) {
      try {
         return Image.createImage(var0, 0, var0.length);
      } catch (Exception var2) {
         return null;
      }
   }

   // $VF: renamed from: II (I_Il, int) void
   private static void method_711(I_Il var0, int var1) {
      try {
         class_27 var2 = new class_27();
         byte var3 = var0.method_628().readByte();
         var2.IoI_ = var3;
         var2.field_627 = var0.method_628().readInt();
         var2.IoIO = var0.method_628().readInt();
         var2.IIo1 = var0.method_628().readUTF();
         var2.field_629 = var0.method_628().readByte();
         var2.field_628 = var0.method_628().readInt() + 1000000000;
         I_Ol.II__(
            method_718("랙롵롛렯롔뢨", 47085)
               + var2.IoI_
               + method_718("럍롥롏롷롉", 47085)
               + var2.field_627
               + method_718("럍롼롇렫렐룁룣룻룅", 47085)
               + var2.IoIO
               + method_718("럍롸롂렧렌뢵뢇", 47085)
               + var2.field_628
         );
         boolean var4 = false;
         I1_I.IOlo = false;
         if (var3 == 0) {
            String var5 = var0.method_628().readUTF();
            I_Ol.II__(method_718("랞롸롙롪렊룠룆뢲룅", 47085) + var5);
            I1_I.IOlo = true;
            if (IO1I.IIlI.IIII(var5) > I_1o.llOI - 60) {
               var2.IIIo = IO1I.IIlI.method_459(var5, I_1o.llOI - 10);
            } else {
               var2.IIIo = new String[1];
               var2.IIIo[0] = var5;
            }

            var2.II1_ = var0.method_628().readByte();
         } else if (var3 == 1) {
            var2.IoI0 = var0.method_628().readByte();
            var2.IoIo = var0.method_628().readByte();
            if (var4 = var0.method_628().readByte() == 1) {
               I1_I.IOlo = true;
            }

            if (var2.IoIO != Ilol.method_808().IOI_) {
               if (var2.IoI0 < var2.IoIo) {
                  var2.field_630 = new String[]{IO11.IOll};
               } else {
                  var2.field_630 = null;
               }
            }

            if (class_1.field_14.III1 != null) {
               class_1.field_14.III0(var2.IoI0, var2.IoIo);
            }
         } else if (var3 == 2 && Ilol.method_808().III_ == 0) {
            I1_I.IOlo = true;
            var2.field_630 = new String[]{IO11.I_l_, IO11.IOl1};
         }

         if (class_1.field_12 != I1_I.field_686) {
            I1_I.IOlo = false;
         } else if (class_1.field_14.I_10 && class_1.field_14.IoI_ == 0 && class_1.field_14.ll_0 == 3) {
            I1_I.IOlo = false;
         }

         class_27.method_721(var2, var1, var4);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public static void IIII(byte var0) {
      I_Ol.II__(method_718("랄롿렋렦렆룩룃뢯뢋륣뤃뤯뤀맰릿릃맽", 47085) + Ilol.I10I);
      I1_I.method_748().Io0_ = 0;
      I1_I.IO_l = false;
      I1I0.field_743 = null;
      I1_I.field_713.field_561 = false;
      I1_I.field_714.field_561 = false;
      I1_I.Ioll = 0;
      class_1.field_14.I_10 = false;
      class_14.method_484();
      if (!I1_I.I1l1 && !I1I0.I1l1) {
         I1_I.method_748().IIl1();
      }

      I1_I.IIlI(var0 == 1 ? Ilol.method_808().I_o_ : -1, var0 == 0 ? -1 : 0);
      IOlO.method_471();
      IOlO.IIII(IOlO.field_316);
      I_Ol.II__(method_718("랡롃롪렎롉룏룦뢋뢠륗률뤐륁릲", 47085));
      Ilol.method_808().I_o0 = 0;
      Ilol.method_808().IOIl = 4;
      Ilol.method_808().field_833 = null;
      Ilol.method_808().IIII = null;
      Ilol.method_808().IIIl = null;
      Ilol.method_808().field_817 = null;
      Ilol.method_808().field_818 = null;
      Ilol.method_808().field_845 = null;
      Ilol.method_808().IIIO(false);
      Ilol.method_808().field_846 = null;
      class_1.IIlI();
      if (Ilol.method_808().I_oO >= IOlO.l10o - 100) {
         Ilol.method_808().I1_o = true;
         Ilol var1 = Ilol.method_808();
         var1.I_o_ = var1.I_o_ + I_Ol.method_561(I_Ol.III_(0, 80));
         I_0_.method_504().method_526();
      }

      I1_I.method_748().I01O();
      class_1.method_31(IOlO.l1o1);
      Ilol.field_830 = false;

      for (int var2 = 0; var2 < Ilol.method_808().IIll.size(); var2++) {
         Ilol.method_808().IIll.elementAt(var2);
      }

      class_1.III1();
      class_1.IIIl();
      I1_I.method_748().lI1I = Ilol.method_808().IOl_;
      I1_I.method_748().lIlo = Ilol.method_808().IOl1;
      Ilol.I1Oo = false;
      I1_I.method_748().I0l_();
      if (Ilol.method_808().I_oO <= 10 && var0 != 0 && var0 != 2) {
         int var10008 = var0 == 1 ? Ilol.method_808().IOIO : var0;
         IOl1.method_475(new IOl1(Ilol.method_808().I_o_, Ilol.method_808().I_oO, Ilol.method_808().field_837, Ilol.method_808().IOI1, 1, true, var10008));
         Ilol.method_808().field_789 = true;
      }

      if (var0 == 2) {
         Ilol.method_808().method_813();
      }

      if (I1_I.method_748().IO1l) {
         if (IOlO.l1oI == I1_I.method_748().Ioo_ && IOlO.l1ol == I1_I.method_748().IooO) {
            I1_I.method_748().IIl1(I1_I.method_748().Iool, I1_I.method_748().Ioo1);
         }

         if (IO1l.l_I0 > 1) {
            I1_I.method_748().I0_l();
         }
      }

      I1OO.I__o();
      I1OO.method_655(IOlO.Il_O, IO11.I_00 + method_718("럍", 47085) + IOlO.l1ol, 30);
      class_1.III_();
      class_1.IIII = false;
      I1_l.I0_o();
      I1_l.I0_0();
   }

   private void IIIl(I_Il var1) {
      try {
         I_Ol.II__(method_718("럜렾렘롪렊룠룆뢴룘뤤", 47085) + Ilol.method_808() == null ? method_718("랃롹롇렦", 47085) : method_718("럌롢롞렦렅", 47085));
         Ilol.method_808().I_o_ = Ilol.method_808().IO00 = var1.method_628().readShort();
         Ilol.method_808().I_oO = Ilol.method_808().IO0o = var1.method_628().readShort();
         Ilol.method_808().I010 = Ilol.method_808().I_o_;
         Ilol.method_808().I01o = Ilol.method_808().I_oO;
         I_Ol.II__(
            method_718("랅롩롊렮롔뢨", 47085)
               + Ilol.method_808().field_837
               + method_718("럍롮롄렮렐뢵뢇", 47085)
               + Ilol.method_808().I0II
               + method_718("럍론롎렬렝뢵뢇", 47085)
               + Ilol.method_808().field_838
               + method_718("럍롴렖롪", 47085)
               + Ilol.method_808().I_o_
               + method_718("럍롵렖롪", 47085)
               + Ilol.method_808().I_oO
               + method_718("럍롯롃렿렇룯뢇뢲뢊륧뤞륢", 47085)
               + Ilol.method_808().IOIO
         );
         if (Ilol.method_808().I_o_ >= 0 && Ilol.method_808().I_o_ <= 100) {
            Ilol.method_808().IOI1 = 1;
         } else if (Ilol.method_808().I_o_ >= IOlO.l10_ - 100 && Ilol.method_808().I_o_ <= IOlO.l10_) {
            Ilol.method_808().IOI1 = -1;
         }

         byte var2 = var1.method_628().readByte();
         I_Ol.II__(method_718("랛롋롄롪렚룡룝뢣룘뤤", 47085) + var2);
         if (!I1_I.field_713.IOOo) {
            I1_I.field_713.field_560 = Ilol.method_808().I_o_ - I1_I.field_689;
            I1_I.field_713.Io1I = Ilol.method_808().I_oO - I1_I.Io1I;
         }

         for (int var3 = 0; var3 < var2; var3++) {
            new class_12(
               var1.method_628().readShort(),
               var1.method_628().readShort(),
               var1.method_628().readShort(),
               var1.method_628().readShort(),
               var1.method_628().readBoolean(),
               var1.method_628().readBoolean(),
               var1.method_628().readUTF()
            );
         }

         var2 = var1.method_628().readByte();
         I_I_.II01.removeAllElements();

         for (short var4 = 0; var4 < var2; var4 = (byte)(var4 + 1)) {
            I_I_ var5 = new I_I_(
               var4,
               var1.method_628().readBoolean(),
               var1.method_628().readBoolean(),
               var1.method_628().readBoolean(),
               var1.method_628().readBoolean(),
               var1.method_628().readBoolean(),
               var1.method_628().readByte(),
               var1.method_628().readByte(),
               var1.method_628().readInt(),
               var1.method_628().readByte(),
               var1.method_628().readInt(),
               var1.method_628().readShort(),
               var1.method_628().readShort(),
               var1.method_628().readByte(),
               var1.method_628().readByte()
            );
            var5.I010 = var5.field_903;
            var5.I01o = var5.field_904;
            var5.I0Il = var1.method_628().readBoolean();
            if (I_I_.field_902[var5.I1ll].II0l != 0) {
               if (var4 % 3 == 0) {
                  var5.llI_ = -1;
               } else {
                  var5.llI_ = 1;
               }

               var5.field_903 += 10 - var4 % 20;
            }

            var5.I0I1 = false;
            class_32 var6 = null;
            Il0_ var7 = null;
            IloI var8 = null;
            I_1I var9 = null;
            if (var5.I1ll == 70) {
               var6 = new class_32(var4, (short)var5.field_903, (short)var5.field_904, 70, var5.llIl, var5.llI1, var5.lIOO);
            }

            if (var5.I1ll == 71) {
               var7 = new Il0_(var4, (short)var5.field_903, (short)var5.field_904, 71, var5.llIl, var5.llI1);
            }

            if (var5.I1ll == 72) {
               var8 = new IloI(var4, (short)var5.field_903, (short)var5.field_904, 72, var5.llIl, var5.llI1);
            }

            if (var5.I0Il) {
               var9 = new I_1I(var4, (short)var5.field_903, (short)var5.field_904, var5.I1ll, var5.llIl, var5.llI1);
            }

            if (var9 != null) {
               I1_I.field_696.addElement(var9);
            } else if (var6 != null) {
               I1_I.field_696.addElement(var6);
            } else if (var7 != null) {
               I1_I.field_696.addElement(var7);
            } else if (var8 != null) {
               I1_I.field_696.addElement(var8);
            } else {
               I1_I.field_696.addElement(var5);
            }
         }

         if (Ilol.method_808().IIIl != null && I1_I.method_763(Ilol.method_808().IIIl.field_907) == null) {
            Ilol.method_808().IIIl.method_859();
            Ilol.method_808().IIIl.field_903 = Ilol.method_808().I_o_;
            Ilol.method_808().IIIl.field_904 = Ilol.method_808().I_oO - 40;
            I1_I.field_696.addElement(Ilol.method_808().IIIl);
         }

         var1.method_628().readByte();
         var2 = var1.method_628().readByte();
         I_Ol.II__(method_718("랣로롨롪렚룡룝뢣룘뤤", 47085) + var2);

         for (int var25 = 0; var25 < var2; var25++) {
            short var35 = var1.method_628().readByte();
            short var29 = var1.method_628().readShort();
            short var32 = var1.method_628().readShort();
            short var38 = var1.method_628().readByte();
            I_Ol.II__(method_718("랙롩롆렺레룤룓뢣룅뤹뤃", 47085) + var38);
            short var42 = var1.method_628().readShort();
            I_Ol.II__(method_718("럜", 47085));
            if (var38 != 6) {
               I_Ol.II__(method_718("럟", 47085));
               if (Ilol.method_808().field_809.II01 < 7 || Ilol.method_808().field_809.II01 == 7 && Ilol.method_808().field_809.l10l <= 1) {
                  if (var38 == 7 || var38 == 8 || var38 == 9) {
                     continue;
                  }

                  I_Ol.II__(method_718("럞", 47085));
               }

               if (Ilol.method_808().field_809.II01 >= 6 || var38 != 16) {
                  if (var38 == 4) {
                     I1_I.method_748().field_716 = new I1o0(var25, var35, var29, var32, var38, var42);
                     I_0_.method_504().III_((byte)2);
                     I1_I.IIOI.addElement(I1_I.method_748().field_716);
                     I_Ol.II__(method_718("럘", 47085));
                  } else {
                     I_11 var45 = new I_11(var25, var35, var29, var32 + 3, var38, var42);
                     I1_I.IIOI.addElement(var45);
                     I_Ol.II__(method_718("럛", 47085));
                  }
               }
            }
         }

         var2 = var1.method_628().readByte();
         I_Ol.II__(method_718("랄롸롎렧롉룻룎뢼뢀뤤뤞륢", 47085) + var2);

         for (int var43 = 0; var43 < var2; var43++) {
            short var39 = var1.method_628().readShort();
            short var36 = var1.method_628().readShort();
            short var33 = var1.method_628().readShort();
            short var10 = var1.method_628().readShort();
            int var46 = var1.method_628().readInt();
            short var30 = 0;
            if (var46 == -2) {
               var30 = var1.method_628().readShort();
            }

            I10_ var13 = new I10_(var46, var39, var36, var33, var10, var30);
            boolean var11 = false;

            for (int var12 = 0; var12 < I1_I.II_0.size(); var12++) {
               if (((I10_)I1_I.II_0.elementAt(var12)).lI0l == var13.lI0l) {
                  var11 = true;
                  break;
               }
            }

            if (!var11) {
               I1_I.II_0.addElement(var13);
            }
         }

         IOlO.IlIO.removeAllElements();
         if (IO1l.l_I0 == 1) {
            Il0o.IIl1();
         }

         Il0o.III0.removeAllElements();
         if (class_1.field_0 && (!class_1.field_0 || !IOlO.method_462()) && IOlO.l1oI != 45 && IOlO.l1oI != 46 && IOlO.l1oI != 47 && IOlO.l1oI != 48) {
            short var53 = var1.method_628().readShort();

            for (int var28 = 0; var28 < var53; var28++) {
               var1.method_628().readShort();
               var1.method_628().readShort();
               var1.method_628().readShort();
            }

            short var41 = var1.method_628().readShort();

            for (int var49 = 0; var49 < var41; var49++) {
               var1.method_628().readUTF();
               var1.method_628().readUTF();
            }
         } else {
            short var52 = var1.method_628().readShort();

            for (int var26 = 0; var26 < var52; var26++) {
               short var37 = var1.method_628().readShort();
               short var31 = var1.method_628().readShort();
               short var34 = var1.method_628().readShort();
               if (IOlO.method_465(var37) != null) {
                  Il0o var14 = IOlO.method_465(var37);
                  Il0o var15;
                  (var15 = new Il0o()).II0I = var37;
                  var15.IIII = var14.IIII;
                  var15.IIOI = var14.IIOI;
                  var15.IIOl = var14.IIOl;
                  var15.field_882 = var31 * IOlO.IlI0;
                  var15.field_883 = var34 * IOlO.IlI0;
                  var15.field_884 = var14.field_884;
                  if (IOlO.II1I(var15.II0I)) {
                     var15.I_O0 = var26 % 2 == 0 ? 0 : 2;
                     if (IOlO.l1oI == 45) {
                        var15.I_O0 = 0;
                     }
                  }

                  if (!Il0o.field_886.containsKey(String.valueOf(var15.IIII))) {
                     if (IO1l.l_I0 == 1) {
                        Image var16;
                        if ((var16 = IO10.IIIl(method_718("럂롡롊렺렫룩룄뢭뢢륶륌뤷뤏매린", 47085) + var15.IIII + method_718("럃롼롅렭", 47085))) == null) {
                           var16 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                           I_0O.method_493().IlI_();
                           I_0_.method_504().III1(var15.IIII);
                        }

                        Il0o.field_886.put(String.valueOf(var15.IIII), var16);
                     } else {
                        boolean var50 = false;
                        byte[] var17;
                        if ((var17 = I_O1.method_556(IO1l.l_I0 + method_718("랏롫롢렾렌룥", 47085) + var15.IIII)) != null) {
                           if (Il0o.IIII != null) {
                              I_Ol.II__(method_718("랾롡롊렦렅뢨뢇뢪뢄륷륗륿륁", 47085) + var17.length % 127 + method_718("랃롩로롪렿룭룕뢵뢌륫륍륿륁", 47085) + Il0o.IIII[var15.IIII]);
                              if (var17.length % 127 != Il0o.IIII[var15.IIII]) {
                                 var50 = true;
                              }
                           }

                           if (!var50) {
                              Image var57;
                              if ((var57 = Image.createImage(var17, 0, var17.length)) != null) {
                                 Il0o.field_886.put(String.valueOf(var15.IIII), var57);
                              } else {
                                 var50 = true;
                              }
                           }
                        } else {
                           var50 = true;
                        }

                        if (var50) {
                           Image var58;
                           if ((var58 = IO10.IIIl(method_718("럂롡롊렺렫룩룄뢭뢢륶륌뤷뤏매린", 47085) + var15.IIII + method_718("럃롼롅렭", 47085))) == null) {
                              var58 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                              I_0_.method_504().III1(var15.IIII);
                           }

                           Il0o.field_886.put(String.valueOf(var15.IIII), var58);
                        }
                     }

                     Il0o.IIIo.addElement(String.valueOf(var15.IIII));
                  }

                  if (!Il0o.IIIO(String.valueOf(var15.IIII))) {
                     Il0o.III0.addElement(String.valueOf(var15.IIII));
                  }

                  IOlO.IlIO.addElement(var15);
               }
            }

            for (int var27 = 0; var27 < Il0o.IIIo.size(); var27++) {
               String var54;
               if (!Il0o.IIIO(var54 = (String)Il0o.IIIo.elementAt(var27))) {
                  Il0o.field_886.remove(var54);
                  if (Il0o.field_886.containsKey(var54 + method_718("랏론롎려렍", 47085) + 1)) {
                     Il0o.field_886.remove(var54 + method_718("랏론롎려렍", 47085) + 1);
                  }

                  if (Il0o.field_886.containsKey(var54 + method_718("랏론롎려렍", 47085) + 3)) {
                     Il0o.field_886.remove(var54 + method_718("랏론롎려렍", 47085) + 3);
                  }

                  Il0o.IIIo.removeElementAt(var27);
                  var27--;
               }
            }

            Il0O.field_899 = false;
            Il0O.field_900 = 0;
            I1lI.IIIO.removeAllElements();
            Il0O.IIIO.removeAllElements();
            I1ll.III0.removeAllElements();
            short var40 = var1.method_628().readShort();

            for (int var48 = 0; var48 < var40; var48++) {
               String var55 = var1.method_628().readUTF();
               String var56 = var1.method_628().readUTF();
               if (var55.equals(method_718("랈롪롍", 47085))) {
                  if (I_1o.I1I1 <= 0) {
                     String[] var59;
                     int var51 = Integer.parseInt((var59 = I_Ol.method_563(var56, method_718("럃", 47085), 0))[0]);
                     int var60 = Integer.parseInt(var59[1]);
                     int var18 = Integer.parseInt(var59[2]);
                     int var47 = Integer.parseInt(var59[3]);
                     int var19;
                     int var44;
                     if (var59.length <= 4) {
                        var44 = -1;
                        var19 = 1;
                     } else {
                        var44 = Integer.parseInt(var59[4]);
                        var19 = Integer.parseInt(var59[5]);
                     }

                     I1ll var20 = new I1ll(var51, var18, var47, var60, var44, var19);
                     if (var59.length > 6) {
                        var20.I_O0 = Integer.parseInt(var59[6]);
                        if (var59.length > 7) {
                           var20.I_Oo = Integer.parseInt(var59[7]);
                           var20.field_604 = Integer.parseInt(var59[8]);
                        }
                     }

                     I1lI.method_692(var20);
                  }
               } else if (var55.equals(method_718("랏롩롍렬", 47085)) && I_1o.I1I1 <= 1) {
                  Il0O.method_855(Integer.parseInt(var56));
               }
            }
         }

         IOlO.l1o_ = var1.method_628().readByte();
         IIII(var1.method_628().readByte());
         Ilol.I10I = false;
      } catch (Exception var21) {
         Il_1.I_0o();
         var21.printStackTrace();
      }
   }

   private void III1(I_Il var1) {
      try {
         label444: {
            try {
               switch (var1.method_628().readByte()) {
                  case 4:
                     class_1.field_17.I0Ol();
                     I1_I.field_723 = false;
                     I1_I.IO_I = false;
                     I1o_.field_681 = true;
                     I1o_.IO0o = true;
                     I1o_.III1 = true;
                     I1o_.III_ = true;
                     I1o_.IOOO = true;
                     I1_I.II_1 = var1.method_628().readByte();
                     I1_I.II__ = var1.method_628().readByte();
                     I1_I.II_O = var1.method_628().readByte();
                     I1_I.II_0 = var1.method_628().readByte();
                     var1.method_628().readByte();
                     I1o_ var4 = class_1.field_17;
                     if (I1o_.field_684) {
                        I_O1.III1(method_718("람롯롈", 47085), "");
                        I_O1.III1(method_718("랝롭롘령", 47085), "");
                     } else {
                        I_O1.III1(method_718("래롿롎렸련룧", 47085) + I_0l.l1_I, "");
                     }

                     I_Ol.II__(method_718("럇렦렁론롃뢢뢇뢂뢤륐륢륢뤷맅맍맭릔릳멕먀멹먫뫲뫄몣몑뭡묒", 47085) + I1_I.II_1 + method_718("럍롏롇렣렌룦룓룦", 47085) + I1_I.II1o);
                     I_Ol.II__(method_718("럇렦렁론롃뢢뢇뢋뢤륔뤃뤔뤤맒만맷릒릲먡먚먊먝뫥뫀몰몆묳", 47085) + I1_I.II__ + method_718("럍롏롇렣렌룦룓룦", 47085) + I1_I.field_708);
                     I_Ol.II__(method_718("럇렦렁론롃뢢뢇뢕뢮륍륯뤎륁맖맚맬릎릵메면멣멘뫄뫓몧몂뭶뭀뭱", 47085) + I1_I.II_O + method_718("럍롏롇렣렌룦룓룦", 47085) + I1_I.II_I);
                     I_Ol.II__(method_718("럇렦렁론롃뢢뢇뢏뢱륁륮륢뤷맅맍맭릔릳멕먀멹먫뫲뫄몣몑뭡묒", 47085) + I1_I.II_0 + method_718("럍롏롇렣렌룦룓룦", 47085) + I1_I.II_l);
                     if (I1_I.II_1 != I1_I.II1o) {
                        I_Ol.II__(method_718("랞롩롅렮롉룽룗뢢뢄륰륆륢뤅맡맫맟", 47085));
                        I1_I.I1l1 = false;
                        I_0_.method_504().I0o_();
                     } else {
                        try {
                           I1o_.IO0o = false;
                        } catch (Exception var24) {
                           var24.printStackTrace();
                           I1_I.II1o = -1;
                           I_0_.method_504().I0o_();
                        }
                     }

                     if (I1_I.II__ != I1_I.field_708) {
                        I1_I.I1l1 = false;
                        I_0_.method_504().I0oO();
                     } else {
                        try {
                           if (!I1_I.I1l1) {
                              method_708(new DataInputStream(new ByteArrayInputStream(I_O1.method_556(method_718("랣롞롆렫렙", 47085)))));
                           }

                           I1o_.III1 = false;
                        } catch (Exception var23) {
                           I1_I.field_708 = -1;
                           I_0_.method_504().I0oO();
                        }
                     }

                     if (I1_I.II_O != I1_I.II_I) {
                        I1_I.I1l1 = false;
                        I_0_.method_504().III0();
                     } else {
                        try {
                           if (!I1_I.I1l1) {
                              method_707(new DataInputStream(new ByteArrayInputStream(I_O1.method_556(method_718("랣롞롘렡렀룤룋", 47085)))));
                           }

                           I1o_.III_ = false;
                        } catch (Exception var22) {
                           I1_I.II_I = -1;
                           I_0_.method_504().III0();
                        }
                     }

                     if (I1_I.II_0 != I1_I.II_l) {
                        I1_I.I1l1 = false;
                        I_0_.method_504().IoO_();
                     } else {
                        try {
                           DataInputStream var5 = new DataInputStream(new ByteArrayInputStream(I_O1.method_556(method_718("랣롞롂렾렌룥뢗", 47085))));
                           this.method_714(var5, false);
                           var5 = new DataInputStream(new ByteArrayInputStream(I_O1.method_556(method_718("랣롞롂렾렌룥뢖", 47085))));
                           this.method_714(var5, false);
                           var5 = new DataInputStream(new ByteArrayInputStream(I_O1.method_556(method_718("랣롞롂렾렌룥뢕", 47085))));
                           this.method_714(var5, false);
                           var5 = new DataInputStream(new ByteArrayInputStream(I_O1.method_556(method_718("랣롞롂렾렌룥뢖룶룕", 47085))));
                           this.method_714(var5, false);
                           I1o_.IOOO = false;
                        } catch (Exception var21) {
                           I1_I.II_l = -1;
                           I_0_.method_504().IoO_();
                        }
                     }

                     if (I1_I.II_1 == I1_I.II1o && I1_I.II__ == I1_I.field_708 && I1_I.II_O == I1_I.II_I && I1_I.II_0 == I1_I.II_l) {
                        if (!I1_I.I1l1) {
                           I1_I.method_748();
                           I1_I.I01l();
                           I1_I.method_748();
                           I1_I.method_747();
                           I1_I.method_748();
                           I1_I.I01I();
                           I1_I.method_748();
                           I1_I.I011();
                        }

                        I_0_.method_504().IoOO();
                     }

                     byte var35 = var1.method_628().readByte();
                     I_Ol.II__(method_718("랮롍롻렞렠룇룩룦뢩륁륭뤖륜릠", 47085) + var35);
                     I1_I.IIIl = new long[var35];

                     for (int var28 = 0; var28 < I1_I.IIIl.length; var28++) {
                        I1_I.IIIl[var28] = var1.method_628().readLong();
                     }
                     break label444;
                  case 5:
                  case 9:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 19:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  case 30:
                  case 31:
                  case 32:
                  case 33:
                  case 34:
                  default:
                     return;
                  case 6:
                     I_Ol.II__(method_718("랪롉롿롪렼룘룣뢇뢱륁를뤏뤠말릿", 47085) + var1.method_628().available() + method_718("럍롮롒렾렌룻", 47085));
                     var1.method_628().mark(100000);
                     method_708(var1.method_628());
                     var1.method_628().reset();
                     byte[] var30 = new byte[var1.method_628().available()];
                     var1.method_628().readFully(var30);
                     I_O1.method_555(method_718("랣롞롆렫렙", 47085), var30);
                     var30 = new byte[]{I1_I.field_708};
                     I_O1.method_555(method_718("랣롞롆렫렙룞룂뢴뢖륭륌뤬", 47085), var30);
                     I1o_.III1 = false;
                     if (I1_I.II_1 != I1_I.II1o || I1_I.II__ != I1_I.field_708 || I1_I.II_O != I1_I.II_I || I1_I.II_0 != I1_I.II_l) {
                        return;
                     }

                     I1_I.method_748();
                     I1_I.I01l();
                     I1_I.method_748();
                     I1_I.method_747();
                     I1_I.method_748();
                     I1_I.I01I();
                     I1_I.method_748();
                     I1_I.I011();
                     I_0_.method_504().IoOO();
                     return;
                  case 7:
                     I_Ol.II__(method_718("랪롉롿롪렼룘룣뢇뢱륁를뤑뤪막맓맲맽", 47085) + var1.method_628().available() + method_718("럍롮롒렾렌룻", 47085));
                     var1.method_628().mark(100000);
                     method_707(var1.method_628());
                     var1.method_628().reset();
                     byte[] var3 = new byte[var1.method_628().available()];
                     var1.method_628().readFully(var3);
                     I_O1.method_555(method_718("랣롞롘렡렀룤룋", 47085), var3);
                     var3 = new byte[]{I1_I.II_I};
                     I_O1.method_555(method_718("랣롞롘렡렀룤룋뢐뢀륶륐뤫뤎맮", 47085), var3);
                     I1o_.III_ = false;
                     if (I1_I.II_1 != I1_I.II1o || I1_I.II__ != I1_I.field_708 || I1_I.II_O != I1_I.II_I || I1_I.II_0 != I1_I.II_l) {
                        return;
                     }

                     I1_I.method_748();
                     I1_I.I01l();
                     I1_I.method_748();
                     I1_I.method_747();
                     I1_I.method_748();
                     I1_I.I01I();
                     I1_I.method_748();
                     I1_I.I011();
                     I_0_.method_504().IoOO();
                     return;
                  case 8:
                     I_Ol.II__(method_718("랪롉롿롪렼룘룣뢇뢱륁를뤋뤵맅맒릞", 47085) + var1.method_628().available() + method_718("럍롮롒렾렌룻", 47085));
                     DataInputStream var6 = var1.method_628();
                     I1I1 var7 = this;

                     try {
                        var7.method_714(var6, true);
                     } catch (Exception var20) {
                        var20.printStackTrace();
                     }

                     return;
                  case 10:
                     try {
                        Ilol.I10I = true;
                        I_Ol.II__(method_718("랿롉롺렟렬룛룳룦뢨륅륳륢뤵맅맒맮릑립멏멿", 47085));
                        class_1.IIII = true;
                        IOlO.field_317 = null;
                        IOlO.I1ol = null;
                        System.gc();
                        IOlO.l10_ = var1.method_628().readByte();
                        IOlO.l10O = var1.method_628().readByte();
                        IOlO.field_317 = new int[IOlO.l10_ * IOlO.l10O];
                        I_Ol.II__(
                           method_718("랮롡롏롤렻룍룶뢓뢠륗륷뤝뤬링맏맪릘릱멋멶먘먬뫒몋뫤뫄묳묒묦묌믇뮓믭", 47085)
                              + IOlO.l10_
                              + method_718("랑", 47085)
                              + IOlO.l10O
                              + method_718("럧렬롯렣렌룦뢇뢒뢌륧륋륢륜릠", 47085)
                              + IOlO.l10_ * IOlO.l10O
                        );

                        for (int var2 = 0; var2 < IOlO.field_317.length; var2++) {
                           short var8;
                           if ((var8 = var1.method_628().readByte()) < 0) {
                              var8 += 256;
                           }

                           IOlO.field_317[var2] = (char)var8;
                        }

                        IOlO.I1ol = new int[IOlO.field_317.length];
                        var1 = this.field_619;
                        this.IIIl(var1);

                        try {
                           IOlO.I00l = var1.method_628().readByte() != 0;
                        } catch (Exception var19) {
                        }
                     } catch (Exception var25) {
                        var25.printStackTrace();
                     }

                     var1.I0Oo();
                     this.field_619.I0Oo();
                     var1 = this.field_619 = null;
                     I1_I.method_748().I0l_();
                     return;
                  case 16:
                     class_30.method_738().I0l_();
                     return;
                  case 17:
                     Ilol.method_808();
                     Ilol.method_834();
                     return;
                  case 18:
                     class_1.IIII = false;
                     class_1.III_();
                     new Integer(var1.method_628().readInt());
                     return;
                  case 20:
                     Ilol.method_808().IIIO = var1.method_628().readByte();
                     I1_I.field_713.IIII(IO11.I_1o + method_718("럍", 47085) + Ilol.method_808().IIIO, 0);
                     return;
                  case 35:
                     class_1.III_();
                     I1_I.method_748().I01o();
                     I1_I.field_713.IIII(var1.method_628().readUTF(), 0);
                     return;
                  case 36:
                     I1_I.II_o = var1.method_628().readByte();
                     I_Ol.II__(method_718("랁롣롊렮롉룅룂룦뢤륧륗뤫뤗맥릥릞", 47085) + I1_I.II_o);
               }
            } catch (Exception var26) {
            }

            return;
         }
      } finally {
         if (var1 != null) {
            var1.I0Oo();
         }
      }
   }

   private static void III_(I_Il var0) {
      try {
         try {
            switch (var0.method_628().readByte()) {
               case 2:
                  String var1 = var0.method_628().readUTF();
                  if (I_O1.method_558(method_718("랬롨롆렣렇룄룎뢨뢎", 47085)) == 1) {
                     return;
                  }

                  int var2 = IO10.l_lI;
                  boolean var3 = true;
                  I_0l.IIo_ = var1;
                  I_0l.II10(var1);

                  try {
                     I_1o.I0lI = var0.method_628().readByte() == 1;
                     byte var4 = var0.method_628().readByte();
                     I_O1.IIIl(method_718("랬롨롆렣렇룄룎뢨뢎", 47085), var4);
                  } catch (Exception var9) {
                  }

                  return;
            }
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      } finally {
         if (var0 != null) {
            var0.I0Oo();
         }
      }
   }

   private void IIIO(I_Il var1) {
      try {
         byte var2 = var1.method_628().readByte();
         I_Ol.II__(method_718("랞롹롉롰롉", 47085) + var2);
         switch (var2) {
            case 0:
               class_29.IlII = new I_lO("");
               IOl1.IlI1.removeAllElements();
               I1_I.II_O.removeAllElements();
               I1_I.II_0.removeAllElements();
               Ilol.field_823.removeAllElements();
               I1_I.I0_O();
               I1_I.IIlI = Ilol.method_808();
               Ilol.method_808().IOI_ = var1.method_628().readInt();
               Ilol.method_808().IOI0 = var1.method_628().readByte();
               Ilol.method_808().IOIO = var1.method_628().readByte();
               Ilol.method_808().field_837 = var1.method_628().readShort();
               I_Ol.II__(method_718("랮롤롊렸롉룠룂뢧뢁뤤뤞륢", 47085) + Ilol.method_808().field_837 + method_718("럆렧렀롡롂뢣뢌룭룎뤯뤈륩륊릫릴릕맶맗먰먑멲멓몼몝뫾뫟문묙뭺뭛뮤뮅믦", 47085));
               Ilol.method_808().IIO1 = var1.method_628().readUTF();
               Ilol.method_808().IIIO = var1.method_628().readByte();
               Ilol.method_808().III0 = var1.method_628().readByte();
               Ilol.method_808().Illo = var1.method_628().readLong();
               Ilol.method_808().IO10();
               Ilol.method_808().IOlO = var1.method_628().readShort();
               Ilol.method_808().IOl0 = var1.method_628().readShort();
               Ilol.method_808().field_805 = I1_I.field_697[var1.method_628().readByte()];
               Ilol.method_808().field_807.removeAllElements();
               Ilol.method_808().IIlI.removeAllElements();
               I1_I.method_748().lI1I = Ilol.method_808().IOl_;
               I1_I.method_748().lIlo = Ilol.method_808().IOl1;
               byte var66 = var1.method_628().readByte();

               for (byte var60 = 0; var60 < var66; var60++) {
                  method_712(I_o_.method_491(var1.method_628().readShort()));
               }

               I1_I.method_748();
               I1_I.I0_1();
               I1_I.method_748();
               Ilol.method_808().Il11 = var1.method_628().readLong();
               Ilol.method_808().IO_I = var1.method_628().readInt();
               Ilol.method_808().field_804 = var1.method_628().readInt();
               Ilol.method_808().field_788 = IO10.IIIO(Ilol.method_808().Il11);
               Ilol.method_808().IIOI = IO10.IIIO(Ilol.method_808().field_804);
               Ilol.method_808().IIOl = IO10.IIIO(Ilol.method_808().IO_I);
               Ilol.method_808().IIII = new I101[var1.method_628().readByte()];

               try {
                  Ilol.method_808().IO01();

                  for (int var54 = 0; var54 < Ilol.method_808().IIII.length; var54++) {
                     short var80;
                     if ((var80 = var1.method_628().readShort()) != -1) {
                        class_20 var12;
                        byte var13 = (var12 = I1oI.method_642(var80)).II0l;
                        Ilol.method_808().IIII[var54] = new I101();
                        Ilol.method_808().IIII[var54].field_543 = var12;
                        Ilol.method_808().IIII[var54].I1l1 = var1.method_628().readInt();
                        Ilol.method_808();
                        var1.method_628().readUTF();
                        Ilol.method_808();
                        var1.method_628().readUTF();
                        int var61 = var1.method_628().readUnsignedByte();
                        I_Ol.II__(method_718("랂롼롟렣렆룦뢇뢵뢌륾륆륿륁", 47085) + var61);
                        if (var61 != 0) {
                           Ilol.method_808().IIII[var54].field_542 = new I100[var61];

                           for (int var58 = 0; var58 < Ilol.method_808().IIII[var54].field_542.length; var58++) {
                              int var14 = var1.method_628().readUnsignedByte();
                              var61 = var1.method_628().readUnsignedShort();
                              if (var14 != -1) {
                                 Ilol.method_808().IIII[var54].field_542[var58] = new I100(var14, var61);
                              }
                           }
                        }

                        if (var13 == 0) {
                           I_Ol.II__(method_718("랙롣롂롪렍룩룞룦룘뤹뤞륿륜립릢릃맠링먦먇멤멅몪몋뫨뫉묮묏뭬뭍뮲뮓믰믑밶밗뱴뱕벺벛본볙봾봟뵼뵝뵂", 47085) + Ilol.method_808().I0II);
                           Ilol.method_808().I0II = Ilol.method_808().IIII[var54].field_543.II_0;
                        } else if (var13 == 1) {
                           Ilol.method_808().field_838 = Ilol.method_808().IIII[var54].field_543.II_0;
                           I_Ol.II__(method_718("랙롣롂롪렍룩룞룦룘뤹뤞륿륜립릢릃맠링먦먇멤멅몪몋뫨뫉묮묏뭬뭍뮲뮓믰믑밶밗뱴뱕벺벛본볙봾봟뵼뵝뵂", 47085) + Ilol.method_808().field_838);
                        }
                     }
                  }
               } catch (Exception var50) {
                  var50.printStackTrace();
               }

               Ilol.method_808().field_811 = new I101[var1.method_628().readByte()];
               I1_I.Io_0 = 0;

               for (int var55 = 0; var55 < Ilol.method_808().field_811.length; var55++) {
                  short var81;
                  if ((var81 = var1.method_628().readShort()) != -1) {
                     Ilol.method_808().field_811[var55] = new I101();
                     Ilol.method_808().field_811[var55].field_543 = I1oI.method_642(var81);
                     Ilol.method_808().field_811[var55].I1l1 = var1.method_628().readInt();
                     Ilol.method_808();
                     var1.method_628().readUTF();
                     Ilol.method_808();
                     var1.method_628().readUTF();
                     Ilol.method_808().field_811[var55].lIO_ = var55;
                     byte var84;
                     if ((var84 = var1.method_628().readByte()) != 0) {
                        Ilol.method_808().field_811[var55].field_542 = new I100[var84];

                        for (int var78 = 0; var78 < Ilol.method_808().field_811[var55].field_542.length; var78++) {
                           int var63 = var1.method_628().readUnsignedByte();
                           int var59 = var1.method_628().readUnsignedShort();
                           if (var63 != -1) {
                              Ilol.method_808().field_811[var55].field_542[var78] = new I100(var63, var59);
                              Ilol.method_808().field_811[var55].IIl1();
                           }
                        }
                     }

                     if (Ilol.method_808().field_811[var55].field_543.II0l == 6) {
                        I1_I.Io_0 = I1_I.Io_0 + Ilol.method_808().field_811[var55].I1l1;
                     }
                  }
               }

               Ilol.method_808().field_812 = new I101[var1.method_628().readByte()];
               class_1.field_14.ll_o = 0;

               for (int var56 = 0; var56 < Ilol.method_808().field_812.length; var56++) {
                  short var82;
                  if ((var82 = var1.method_628().readShort()) != -1) {
                     Ilol.method_808().field_812[var56] = new I101();
                     Ilol.method_808().field_812[var56].field_543 = I1oI.method_642(var82);
                     Ilol.method_808().field_812[var56].I1l1 = var1.method_628().readInt();
                     Ilol.method_808();
                     var1.method_628().readUTF();
                     Ilol.method_808();
                     var1.method_628().readUTF();
                     Ilol.method_808().field_812[var56].field_542 = new I100[var1.method_628().readByte()];

                     for (int var76 = 0; var76 < Ilol.method_808().field_812[var56].field_542.length; var76++) {
                        int var79 = var1.method_628().readUnsignedByte();
                        int var64 = var1.method_628().readUnsignedShort();
                        if (var79 != -1) {
                           Ilol.method_808().field_812[var56].field_542[var76] = new I100(var79, var64);
                           Ilol.method_808().field_812[var56].IIl1();
                        }
                     }

                     class_1.field_14.ll_o++;
                  }
               }

               Ilol.method_808().IOIl = 4;
               I_O1.method_558(Ilol.method_808().IIO1 + method_718("랛롯롂", 47085));
               short var83;
               Ilol.field_821 = new short[var83 = var1.method_628().readShort()];
               Ilol.IIII = new short[var83];

               for (int var77 = 0; var77 < var83; var77++) {
                  Ilol.field_821[var77] = var1.method_628().readShort();
                  Ilol.IIII[var77] = var1.method_628().readShort();
               }

               I1_I.field_713.III1[Ilol.method_808().IOIO][0] = var1.method_628().readShort();
               I1_I.field_713.III1[Ilol.method_808().IOIO][1] = var1.method_628().readShort();
               I1_I.field_713.III1[Ilol.method_808().IOIO][2] = var1.method_628().readShort();
               Ilol.method_808().I11l = var1.method_628().readByte() == 1;
               I1_I.Il0l = IO10.IIII() - var1.method_628().readInt() * 1000L;
               I1_I.IIOl = var1.method_628().readByte();
               I_Ol.II__(method_718("랉롩롇렾레뢨룓뢯뢈륡뤞륢", 47085) + I1_I.Il0l);
               I_0_ var85 = I_0_.method_504();
               var66 = (byte)Ilol.method_808().IOIO;
               I_0_ var86 = var85;
               I_Il var88 = null;

               try {
                  (var88 = new I_Il((byte)-41)).method_629().writeByte(var66);
                  var86.field_425.IIlO(var88);
               } catch (Exception var47) {
                  var47.printStackTrace();
               } finally {
                  var88.I0Oo();
               }

               var86 = I_0_.method_504();

               try {
                  Ilol.method_808().IIlo = var1.method_628().readShort();
                  Ilol.method_808().field_864 = var1.method_628().readByte();
                  Ilol.method_808().II1I = var1.method_628().readShort();
               } catch (Exception var46) {
               }
               break;
            case 1:
               Ilol.method_808().field_805 = I1_I.field_697[var1.method_628().readByte()];
               Ilol.method_808().Il1I = var1.method_628().readLong();
               Ilol.method_808().field_807.removeAllElements();
               Ilol.method_808().IIlI.removeAllElements();
               Ilol.method_808().field_808 = null;
               return;
            case 2:
               if (Ilol.method_808().IOIl != 14 && Ilol.method_808().IOIl != 5) {
                  Ilol.method_808().IOl_ = Ilol.method_808().IOlo;
                  Ilol.method_808().IOl1 = Ilol.method_808().field_799;
               }

               Ilol.method_808().field_807.removeAllElements();
               Ilol.method_808().IIlI.removeAllElements();
               byte var65 = var1.method_628().readByte();

               for (byte var5 = 0; var5 < var65; var5++) {
                  short var11 = var1.method_628().readShort();
                  I_Ol.II__(method_718("랞롧롂렮렍뢨룎뢢룅륩륚륢륁맣맷맟릯링먻", 47085) + var11);
                  method_712(I_o_.method_491(var11));
               }

               I1_I.method_748();
               I1_I.I0_1();
               return;
            case 3:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            default:
               return;
            case 4:
               Ilol.method_808().Il11 = var1.method_628().readLong();
               Ilol.method_808().field_804 = var1.method_628().readInt();
               Ilol.method_808().IOl_ = var1.II_I();
               Ilol.method_808().IOl1 = var1.II_I();
               Ilol.method_808().IO_I = var1.method_628().readInt();
               Ilol.method_808().field_788 = IO10.IIIO(Ilol.method_808().Il11);
               Ilol.method_808().IIOI = IO10.IIIO(Ilol.method_808().field_804);
               Ilol.method_808().IIOl = IO10.IIIO(Ilol.method_808().IO_I);
               return;
            case 5:
               int var9 = Ilol.method_808().IOl_;
               Ilol.method_808().IOl_ = var1.II_I();
               I_Ol.II__(method_718("랅롼롌력렊뢨뢇룻", 47085) + Ilol.method_808().I0_O + method_718("럍롤롛롪렏룽룋뢪룘뤤", 47085) + Ilol.method_808().IOlo);
               if (Ilol.method_808().IOl_ > var9 && Ilol.method_808().III0 != 4) {
                  I1_I.method_769(
                     method_718("럆", 47085) + (Ilol.method_808().IOl_ - var9) + method_718("럍", 47085) + IO11.IoIO,
                     Ilol.method_808().I_o_,
                     Ilol.method_808().I_oO - Ilol.method_808().IO11 - 20,
                     0,
                     -1,
                     9
                  );
                  class_14.method_484();
                  if (Ilol.method_808().field_790 != null && Ilol.method_808().field_790.II1o == 5003) {
                     I_lI.method_799(
                        Ilol.method_808().field_790.IIO1 + (Ilol.method_808().field_790.I_O0 == 1 ? 10 : -10),
                        Ilol.method_808().field_790.field_458 + 10,
                        true,
                        -1,
                        -1,
                        Ilol.method_808(),
                        29
                     );
                  }
               }

               if (Ilol.method_808().IOl_ < var9) {
                  I1_I.method_769(
                     method_718("럀", 47085) + (var9 - Ilol.method_808().IOl_) + method_718("럍", 47085) + IO11.IoIO,
                     Ilol.method_808().I_o_,
                     Ilol.method_808().I_oO - Ilol.method_808().IO11 - 20,
                     0,
                     -1,
                     9
                  );
               }

               I_Ol.II__(method_718("랎롹롙렸롉룀룷룻룅", 47085) + Ilol.method_808().IOl_);
               I1_I.method_748().lI1I = Ilol.method_808().IOl_;
               return;
            case 6:
               int var10 = Ilol.method_808().IOl1;
               Ilol.method_808().IOl1 = var1.II_I();
               if (Ilol.method_808().IOl1 > var10) {
                  I1_I.method_769(
                     method_718("럆", 47085) + (Ilol.method_808().IOl1 - var10) + method_718("럍", 47085) + IO11.IIOo,
                     Ilol.method_808().I_o_,
                     Ilol.method_808().I_oO - Ilol.method_808().IO11 - 23,
                     0,
                     -2,
                     10
                  );
                  class_14.method_484();
                  if (Ilol.method_808().field_790 != null && Ilol.method_808().field_790.II1o == 5001) {
                     I_lI.method_799(
                        Ilol.method_808().field_790.IIO1 + (Ilol.method_808().field_790.I_O0 == 1 ? 10 : -10),
                        Ilol.method_808().field_790.field_458 + 10,
                        true,
                        -1,
                        -1,
                        Ilol.method_808(),
                        29
                     );
                  }
               }

               if (Ilol.method_808().IOl1 < var10) {
                  I1_I.method_769(
                     method_718("럀", 47085) + (var10 - Ilol.method_808().IOl1) + method_718("럍", 47085) + IO11.IIOo,
                     Ilol.method_808().I_o_,
                     Ilol.method_808().I_oO - Ilol.method_808().IO11 - 23,
                     0,
                     -2,
                     10
                  );
               }

               I_Ol.II__(method_718("랎롹롙렸롉룅룷룻룅", 47085) + Ilol.method_808().IOl1);
               I1_I.method_748().lIlo = Ilol.method_808().IOl1;
               return;
            case 7:
               Ilol var75;
               if ((var75 = I1_I.method_762(var1.method_628().readInt())) == null) {
                  return;
               }

               var75.IO1I = var1.method_628().readInt();
               if (var75.IO1I == -2) {
                  var75.I_Il = true;
               }

               method_713(var75, var1);

               try {
                  var75.IIlo = var1.method_628().readShort();
                  var75.field_864 = var1.method_628().readByte();
                  var75.II1I = var1.method_628().readShort();
                  if (var75.I0Il >= 201) {
                     I1ll var89;
                     (var89 = new I1ll(var75.I0Il, var75, 2, -1, 10, (byte)1)).I_O0 = 5;
                     var75.method_841(var89);
                  } else {
                     var75.method_842(0, 201);
                  }

                  return;
               } catch (Exception var49) {
                  return;
               }
            case 8:
               Ilol var15 = I1_I.method_762(var1.method_628().readInt());
               if (var15 != null) {
                  var15.IOIo = var1.method_628().readInt();
               }

               return;
            case 9:
               Ilol var74;
               if ((var74 = I1_I.method_762(var1.method_628().readInt())) == null) {
                  return;
               }

               var74.IOl_ = var1.II_I();
               var74.IOlo = var1.II_I();
               return;
            case 10:
               Ilol var73;
               if ((var73 = I1_I.method_762(var1.method_628().readInt())) == null) {
                  return;
               }

               var73.IOl_ = var1.II_I();
               var73.IOlo = var1.II_I();
               var73.IOlO = var1.method_628().readShort();
               var73.IOl0 = var1.method_628().readShort();
               var73.I0I1 = var1.method_628().readShort();
               if (var73.I0I1 == -1) {
                  var73.IO0_();
               }

               return;
            case 11:
               Ilol var72;
               if ((var72 = I1_I.method_762(var1.method_628().readInt())) != null) {
                  var72.IOl_ = var1.II_I();
                  var72.IOlo = var1.II_I();
                  var72.IOlO = var1.method_628().readShort();
                  var72.IOl0 = var1.method_628().readShort();
                  var72.I0II = var1.method_628().readShort();
                  if (var72.I0II == -1) {
                     var72.IO0O();
                  }

                  return;
               }

               return;
            case 12:
               Ilol var71;
               if ((var71 = I1_I.method_762(var1.method_628().readInt())) != null) {
                  var71.IOl_ = var1.II_I();
                  var71.IOlo = var1.II_I();
                  var71.IOlO = var1.method_628().readShort();
                  var71.IOl0 = var1.method_628().readShort();
                  var71.field_838 = var1.method_628().readShort();
                  if (var71.field_838 == -1) {
                     var71.IO00();
                  }

                  return;
               }

               return;
            case 13:
               int var57;
               Ilol var70;
               if ((var57 = var1.method_628().readInt()) == Ilol.method_808().IOI_) {
                  var70 = Ilol.method_808();
               } else {
                  var70 = I1_I.method_762(var57);
               }

               if (var70 != null) {
                  var70.IOl_ = var1.II_I();
                  var70.IOlo = var1.II_I();
                  var70.IOlO = var1.method_628().readShort();
                  var70.IOl0 = var1.method_628().readShort();
                  return;
               }

               return;
            case 14:
               Ilol var69;
               if ((var69 = I1_I.method_762(var1.method_628().readInt())) == null) {
                  return;
               }

               var69.IOl_ = var1.II_I();
               byte var7;
               if ((var7 = var1.method_628().readByte()) == 1) {
                  class_31.method_798(11, var69, 5);
                  class_31.method_798(104, var69, 4);
               }

               if (var7 == 2) {
                  var69.IOoo();
               }

               try {
                  var69.IOlo = var1.II_I();
               } catch (Exception var45) {
               }

               return;
            case 15:
               Ilol var68;
               if ((var68 = I1_I.method_762(var1.method_628().readInt())) != null) {
                  var68.IOl_ = var1.II_I();
                  var68.IOlo = var1.II_I();
                  var68.I_o_ = var1.method_628().readShort();
                  var68.I_oO = var1.method_628().readShort();
                  var68.IOIl = 1;
                  var68.IOII = 0;
                  class_31.method_798(109, var68, 2);
                  return;
               }

               return;
            case 19:
               Ilol.method_808().method_810();
               return;
            case 23:
               short var16;
               I_0o var17;
               method_712(var17 = I_o_.method_491(var16 = var1.method_628().readShort()));
               if (var16 != 0 && var16 != 14 && var16 != 28) {
                  I1_I.field_713.IIII(IO11.I__1 + method_718("럍", 47085) + var17.field_408.II1o, 0);
               }

               return;
            case 35:
               int var6 = var1.method_628().readInt();
               I_Ol.II__(method_718("랮롅롯롪롔뢨", 47085) + var6);
               if (IOlO.l1oI == 130) {
                  I1_I.method_748().I0__();
               }

               if (var6 == Ilol.method_808().IOI_) {
                  Ilol.method_808().III0 = var1.method_628().readByte();
                  if (I1_I.method_748().IIo_() && Ilol.method_808().III0 != 0) {
                     I1_I.method_748().I0__();
                  }

                  I_Ol.II__(method_718("랙롵롛렯롉룸료룻룅", 47085) + Ilol.method_808().III0);
                  Ilol.method_808().field_817 = null;
                  I1_I.method_748();
                  if (!I1_I.IIIl(Ilol.method_808().IIII)) {
                     Ilol.method_808().IIII = null;
                  }

                  Ilol.method_808().field_818 = null;
               } else {
                  Ilol var8;
                  if ((var8 = I1_I.method_762(var6)) != null) {
                     I_Ol.II__(method_718("랙롵롛렯롉룸료룻룅", 47085) + var8.III0);
                     var8.III0 = var1.method_628().readByte();
                     if (var8.II01()) {
                        Ilol.method_808().IIIl = var8;
                     }
                  }
               }

               for (int var4 = 0; var4 < I1_I.II_O.size(); var4++) {
                  Ilol var90;
                  if ((var90 = I1_I.method_762(var4)) != null && var90.III0 != 0 && var90.III0 == Ilol.method_808().III0) {
                     if (!Ilol.method_808().IIII.I0I1) {
                        Ilol.method_808().IIII = null;
                     }

                     Ilol.method_808().field_817 = null;
                     Ilol.method_808().field_818 = null;
                     break;
                  }
               }

               I_Ol.II__(method_718("래롼롏렫렝룭뢇뢲뢜르륆륢뤑맫릢릞", 47085));
               return;
            case 61:
               String var18 = var1.method_628().readUTF();
               byte[] var19 = new byte[var1.method_628().readInt()];
               var1.method_628().read(var19);
               if (var19.length == 0) {
                  var19 = null;
               }

               if (var18.equals(method_718("랦롟례렣렅룤", 47085))) {
                  I1_I.method_748().method_742(var19);
                  return;
               }

               if (var18.equals(method_718("랢롟례렣렅룤", 47085))) {
                  I1_I.method_748().method_741(var19);
                  return;
               }

               if (!var18.equals(method_718("랮롟례렣렅룤", 47085))) {
                  return;
               }

               I1_I.method_748().IIII(var19);
               return;
            case 62:
               I_Ol.II__(method_718("랠롉렋렟령료룦뢒뢠뤤륰뤉뤨만맓", 47085));
               IIlI(var1);
               return;
            case 63:
               if ((var2 = var1.method_628().readByte()) > 0) {
                  class_1.field_14.IIoo.removeAllElements();
                  I1OO.IIl1();
                  I_lO var20 = class_1.field_14.field_482;

                  for (int var3 = 0; var3 < var2; var3++) {
                     String var21 = var1.method_628().readUTF();
                     String var22 = var1.method_628().readUTF();
                     short var23 = var1.method_628().readShort();
                     class_1.field_14.IIoo.addElement(String.valueOf(var23));
                     Ilol.method_808().IIIl.field_796 = var23;
                     I1Il var24;
                     (var24 = new I1Il(var21, 11115, Ilol.method_808().IIIl)).IIo0 = var22;
                     var20.addElement(var24);
                  }

                  I1OO.I__o();
                  class_1.field_14.IOlO();
                  return;
               }

               return;
            case 100:
               try {
                  Ilol.method_808().IIlo = var1.method_628().readShort();
                  Ilol.method_808().field_864 = var1.method_628().readByte();
                  Ilol.method_808().II1I = var1.method_628().readShort();
               } catch (Exception var44) {
               }

               return;
         }
      } catch (Exception var51) {
         var51.printStackTrace();
         return;
      } finally {
         if (var1 != null) {
            var1.I0Oo();
         }
      }
   }

   // $VF: renamed from: II (I_0o) void
   private static void method_712(I_0o var0) {
      if (Ilol.method_808().field_808 == null) {
         Ilol.method_808().field_808 = var0;
      } else if (var0.field_408.equals(Ilol.method_808().field_808.field_408)) {
         Ilol.method_808().field_808 = var0;
      }

      Ilol.method_808().field_807.addElement(var0);
      if ((var0.field_408.IoI_ == 1 || var0.field_408.IoI_ == 4 || var0.field_408.IoI_ == 2 || var0.field_408.IoI_ == 3)
         && (var0.field_408.l1OI == 0 || var0.field_408.l1OI > 0 && var0.l1__ > 0)) {
         if (var0.field_408.IlIO == Ilol.method_808().IO_1) {
            I_0_.method_504().method_530(Ilol.method_808().IO_1);
         }

         Ilol.method_808().IIlI.addElement(var0);
      }
   }

   // $VF: renamed from: II (Ilol, I_Il) boolean
   private static boolean method_713(Ilol var0, I_Il var1) {
      try {
         var0.I10_ = var1.method_628().readByte();
         var0.I1_1 = var1.method_628().readBoolean();
         var0.III0 = var1.method_628().readByte();
         I_Ol.II__(method_718("랬롈롯롪렽룑룷뢃룅륔륨륿륁", 47085) + var0.III0 + method_718("럍롸롄롪렙룤룆뢿뢀륶뤃", 47085) + var0.IOI_);
         var0.field_805 = I1_I.field_697[var1.method_628().readByte()];
         var0.IOIO = var1.method_628().readByte();
         var0.field_837 = var1.method_628().readShort();
         var0.IIO1 = var1.method_628().readUTF();
         var0.IOl_ = var1.II_I();
         var0.I0OO = var0.IOl_;
         if (var0.IOl_ == 0) {
            var0.IOIl = 14;
         }

         var0.IOlo = var1.II_I();
         if (var0.I_oO >= IOlO.l10o - 100) {
            var0.I1_o = true;
         }

         var0.I0II = var1.method_628().readShort();
         var0.field_838 = var1.method_628().readShort();
         var0.I0Il = var1.method_628().readUnsignedByte();
         I_Ol.II__(
            method_718("럍롮롄렮렐뢵뢇", 47085)
               + var0.I0II
               + method_718("럍론롎렭롔뢨", 47085)
               + var0.field_838
               + method_718("럍롮롊렭롔", 47085)
               + var0.I0Il
               + method_718("랯롍롬롪롔뢵", 47085)
               + var0.I0Il
               + method_718("럇렦렁론롃뢢뢍룬룏뤮뤉륨륋릪릵릔맷맖먱먐멳멒몽몜뫿뫞묹묘뭻뭚뮥뮄믧", 47085)
         );
         var0.I1__ = true;
         var1.method_628().readByte();
         if (var0.I0I1 == -1) {
            var0.IO0_();
         }

         if (var0.I0II == -1) {
            var0.IO0O();
         }

         if (var0.field_838 == -1) {
            var0.IO00();
         }

         I_Ol.II__(method_718("럜", 47085));
         var0.I_o_ = var1.method_628().readShort();
         var0.I_oO = var1.method_628().readShort();
         var0.I010 = var0.I_o_;
         var0.I01o = var0.I_oO;
         var0.IOlO = var1.method_628().readShort();
         var0.IOl0 = var1.method_628().readShort();
         byte var2 = var1.method_628().readByte();

         for (int var3 = 0; var3 < var2; var3++) {
            I1l_ var4 = new I1l_(var1.method_628().readByte(), var1.method_628().readInt(), var1.method_628().readInt(), var1.method_628().readShort());
            var0.IIll.addElement(var4);
         }

         I_Ol.II__(method_718("랮롣롅렾렛룧룋뢪뢀륶뤃뤰뤄맡맻맽릵릝멩멳먷먞뫸몖몷몛뭷뭋뭫뭐믭믁뮩뮕뱷뱆밬및볻별벤벃봣", 47085) + var0.I0II + var0.field_838 + var0.I0Il);
         return true;
      } catch (Exception var5) {
         var5.printStackTrace();
         return false;
      }
   }

   private void III0(I_Il var1) {
      try {
         String var2 = var1.method_628().readUTF();
         byte var3 = var1.method_628().readByte();
         byte[] var4;
         Image var5 = method_710(var4 = I_1l.method_623(var1));
         I1O1.method_660(var2, var5, var3);
         if (var4 != null) {
            I1O1.method_663(var2, var3, var4);
            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   // $VF: renamed from: III (java.io.DataInputStream, boolean) void
   private void method_714(DataInputStream var1, boolean var2) {
      try {
         var1.mark(100000);
         I1_I.II_l = var1.readByte();
         byte var3;
         if ((var3 = var1.readByte()) == 0) {
            I1_I.method_748().field_741 = new I10o[var1.readUnsignedByte()];

            for (int var5 = 0; var5 < I1_I.method_748().field_741.length; var5++) {
               I1_I.method_748().field_741[var5] = new I10o();
               I1_I.method_748().field_741[var5].field_532 = var5;
               I1_I.method_748().field_741[var5].II1o = var1.readUTF();
               I1_I.method_748();
               var1.readByte();
            }

            if (var2) {
               var1.reset();
               byte[] var4 = new byte[var1.available()];
               var1.readFully(var4);
               I_O1.method_555(method_718("랣롞롂렾렌룥뢗", 47085), var4);
               return;
            }
         } else if (var3 == 1) {
            I1oI.III_.clear();
            short var11 = var1.readShort();

            for (int var6 = 0; var6 < var11; var6++) {
               I1oI.method_641(
                  new class_20(
                     (short)var6,
                     var1.readByte(),
                     var1.readByte(),
                     var1.readUTF(),
                     var1.readUTF(),
                     var1.readByte(),
                     var1.readInt(),
                     var1.readShort(),
                     var1.readShort(),
                     var1.readBoolean()
                  )
               );
            }

            if (var2) {
               var1.reset();
               byte[] var13 = new byte[var1.available()];
               var1.readFully(var13);
               I_O1.method_555(method_718("랣롞롂렾렌룥뢖", 47085), var13);
               return;
            }
         } else if (var3 == 2) {
            short var12 = var1.readShort();
            short var14 = var1.readShort();

            for (int var7 = var12; var7 < var14; var7++) {
               I1oI.method_641(
                  new class_20(
                     (short)var7,
                     var1.readByte(),
                     var1.readByte(),
                     var1.readUTF(),
                     var1.readUTF(),
                     var1.readByte(),
                     var1.readInt(),
                     var1.readShort(),
                     var1.readShort(),
                     var1.readBoolean()
                  )
               );
            }

            if (var2) {
               var1.reset();
               byte[] var15 = new byte[var1.available()];
               var1.readFully(var15);
               I_O1.method_555(method_718("랣롞롂렾렌룥뢕", 47085), var15);
               byte[] var9 = new byte[]{I1_I.II_l};
               I_O1.method_555(method_718("랣롞롂렾렌룥룱뢣뢗륷륊뤭뤏", 47085), var9);
               I1o_.IOOO = false;
               if (I1_I.II_1 == I1_I.II1o && I1_I.II__ == I1_I.field_708 && I1_I.II_O == I1_I.II_I && I1_I.II_0 == I1_I.II_l) {
                  I1_I.method_748();
                  I1_I.I01l();
                  I1_I.method_748();
                  I1_I.method_747();
                  I1_I.method_748();
                  I1_I.I01I();
                  I1_I.method_748();
                  I1_I.I011();
                  I_0_.method_504().IoOO();
                  return;
               }
            }
         } else if (var3 == 100) {
            Ilol.field_860 = method_716(var1);
            if (var2) {
               var1.reset();
               byte[] var10 = new byte[var1.available()];
               var1.readFully(var10);
               I_O1.method_555(method_718("랣롞롂렾렌룥뢖룶룕", 47085), var10);
               return;
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   // $VF: renamed from: III (I_Il, int) void
   private static void method_715(I_Il var0, int var1) {
      try {
         byte var2;
         int[][] var3 = new int[var2 = var0.method_628().readByte()][];

         for (int var4 = 0; var4 < var2; var4++) {
            byte var5 = var0.method_628().readByte();
            var3[var4] = new int[var5];

            for (int var6 = 0; var6 < var5; var6++) {
               var3[var4][var6] = var0.method_628().readByte();
            }
         }

         IIIl.put(String.valueOf(var1), var3);
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   // $VF: renamed from: II (java.io.DataInputStream) int[][]
   private static int[][] method_716(DataInputStream var0) {
      int[][] var1 = new int[][]{{542, 543}};

      try {
         var1 = new int[var0.readShort()][];

         for (int var2 = 0; var2 < var1.length; var2++) {
            byte var3 = var0.readByte();
            var1[var2] = new int[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               var1[var2][var4] = var0.readShort();
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      return var1;
   }

   private void IIIo(I_Il var1) {
      try {
         byte var2;
         if ((var2 = var1.method_628().readByte()) == 0) {
            var2 = var2;
            var1 = var1;

            try {
               byte var3;
               if ((var3 = var1.method_628().readByte()) == 0) {
                  short var16 = var1.method_628().readShort();
                  String var19 = var1.method_628().readUTF();
                  String var22 = var1.method_628().readUTF();
                  int var17 = var1.method_628().readInt();
                  short var8 = var1.method_628().readShort();
                  byte var9 = var1.method_628().readByte();
                  (I1_I.field_742 = new class_21(var2, var16, var19, var22, var17, var8)).IIOl = var9;
                  I1_I.field_742.method_652(var2, 0, 0);
                  return;
               }

               if (var3 == 1) {
                  int var7 = var1.method_628().readInt();
                  int var5 = var1.method_628().readInt();
                  if (I1_I.field_742 != null) {
                     class_21 var6 = I1_I.field_742;
                     I1_I.field_742.II0I = var2;
                     var6.I_Oo = var7;
                     var6.field_554 = var5;
                     return;
                  }
               } else {
                  if (var3 == 2) {
                     var3 = var1.method_628().readByte();
                     byte var21 = 0;
                     if (var3 == 1) {
                        var21 = 1;
                     } else if (var3 == 2) {
                        var21 = 2;
                     }

                     I1_I.field_742 = null;
                     I1_I.method_776(var21, -1, 0, class_1.IIll, class_1.IIl1, 0, 0, (short)-1, (I___[])null);
                     return;
                  }

                  if (var3 == 5) {
                     short var4 = var1.method_628().readShort();
                     if (I1_I.field_742 != null) {
                        class_21 var18 = I1_I.field_742;
                        I1_I.field_742.II0I = var2;
                        var18.II_l = var4;
                        var18.IlO0 = class_1.field_1;
                        return;
                     }
                  } else if (var3 == 4) {
                     var3 = var1.method_628().readByte();
                     byte var20 = var1.method_628().readByte();
                     if (I1_I.field_742 != null) {
                        I1_I.field_742.method_652(var2, var3, var20);
                        return;
                     }
                  }
               }
            } catch (Exception var10) {
            }

            return;
         }
      } catch (Exception var11) {
      }
   }

   // $VF: renamed from: IIl (I_Il) void
   private static void method_717(I_Il var0) {
      try {
         byte var1;
         if ((var1 = var0.method_628().readByte()) == 0) {
            short var8 = var0.method_628().readShort();
            Ilol.method_808().II1I = var8;
            class_14.method_484();
            class_14.IOlO();
            return;
         }

         if (var1 == 2) {
            int var9 = var0.method_628().readInt();
            byte var4 = var0.method_628().readByte();
            short var5 = var0.method_628().readShort();
            String var6 = var5 + method_718("럁", 47085) + var4;
            I1O1.method_661(method_718("랏롭롅려렌룺룸", 47085) + var5, I1O1.III1);
            class_1.field_27.put(String.valueOf(var9), var6);
            return;
         }

         if (var1 == 3) {
            short var2;
            I_oo.IlIo(var2 = var0.method_628().readShort());
            Il0O.IIII = var2;
            return;
         }

         if (var1 == 4) {
            String var3 = var0.method_628().readUTF();
            class_1.field_28.addElement(var3);
            return;
         }
      } catch (Exception var7) {
      }
   }

   private static void IIlI(I_Il var0) {
      try {
         short var1 = var0.method_628().readShort();
         byte var2 = -1;

         try {
            var2 = var0.method_628().readByte();
         } catch (Exception var7) {
         }

         if (var2 == 0) {
            short var15 = var0.method_628().readShort();

            for (int var14 = 0; var14 < Ilol.method_808().field_807.size(); var14++) {
               I_0o var9;
               if ((var9 = (I_0o)Ilol.method_808().field_807.elementAt(var14)).II0I == var1) {
                  var9.II_l = var15;
                  return;
               }
            }

            return;
         }

         if (var2 == 1) {
            short var5 = var0.method_628().readByte();

            for (int var13 = 0; var13 < Ilol.method_808().field_807.size(); var13++) {
               I_0o var3;
               if ((var3 = (I_0o)Ilol.method_808().field_807.elementAt(var13)).II0I == var1) {
                  for (int var16 = 0; var16 < 20; var16++) {
                     I1O1.method_661(
                        method_718("랾롧롂렦렅룻룸", 47085) + var3.field_408.IlIO + method_718("랲", 47085) + var5 + method_718("랲", 47085) + var16, I1O1.III1
                     );
                  }

                  return;
               }
            }

            return;
         }

         if (var2 == -1) {
            I_0o var6 = I_o_.method_491(var1);

            for (int var4 = 0; var4 < Ilol.method_808().field_807.size(); var4++) {
               if (((I_0o)Ilol.method_808().field_807.elementAt(var4)).field_408.IlIO == var6.field_408.IlIO) {
                  Ilol.method_808().field_807.setElementAt(var6, var4);
                  break;
               }
            }

            for (int var10 = 0; var10 < Ilol.method_808().IIlI.size(); var10++) {
               if (((I_0o)Ilol.method_808().IIlI.elementAt(var10)).field_408.IlIO == var6.field_408.IlIO) {
                  Ilol.method_808().IIlI.setElementAt(var6, var10);
                  break;
               }
            }

            for (int var11 = 0; var11 < I1_I.IIII.length; var11++) {
               if (I1_I.IIII[var11] != null && I1_I.IIII[var11].field_408.IlIO == var6.field_408.IlIO) {
                  I1_I.IIII[var11] = var6;
                  break;
               }
            }

            for (int var12 = 0; var12 < I1_I.field_718.length; var12++) {
               if (I1_I.field_718[var12] != null && I1_I.field_718[var12].field_408.IlIO == var6.field_408.IlIO) {
                  I1_I.field_718[var12] = var6;
                  break;
               }
            }

            if (Ilol.method_808().field_808.field_408.IlIO == var6.field_408.IlIO) {
               Ilol.method_808().field_808 = var6;
            }

            I1_I.field_713.IIII(IO11.I00_ + var6.field_408.II1o + IO11.I00O + var6.l1__, 0);
            return;
         }
      } catch (Exception var8) {
      }
   }
}
