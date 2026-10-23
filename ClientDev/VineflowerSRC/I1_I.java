package main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class I1_I extends IO1_ implements I1__ {
   private boolean I_O1;
   private long Il0;
   private long Il0I;
   public static boolean I_1o = false;
   public static boolean I1l1 = false;
   public static I1_I II;
   public static int I_0;
   public static int IIO;
   public static int IIOI;
   private static int Iol1;
   private static int Iol_;
   public static int IIOl;
   private static int IolO;
   private static int Iol0;
   private static int Iolo;
   public static int IIlI;
   public static int IIO1;
   public static int Io1;
   public static int Io1I;
   private static int Io1l;
   private static int Io11;
   private static int Io1_;
   private static int Io1O;
   public static int Io10;
   public static int Io1o;
   public static int Io_;
   private static int Io_I;
   public static int Io_l;
   public static int Io_1;
   public static int Io__;
   public static int Io_O;
   public I1Il IIlI;
   public static int Io_0;
   public static I_ol[] II;
   public static Il01[] II;
   public static I1Io[] II;
   public static I_O1[] II;
   public static I1lO[] II;
   public static int Ioll;
   public static I_lO II_l = new I_lO(IllI("茍菙菕莹莙", 33659));
   public static I_lO II_1 = new I_lO(IllI("茍菜菋莱莒葸葑", 33659));
   public static I_lO II__ = new I_lO(IllI("茍菟菗莽莚葿葐萧", 33659));
   public static I_lO II_O = new I_lO(IllI("茍菙菑莹莅葟葛萙萒蓢", 33659));
   public static I_lO II_0 = new I_lO(IllI("茍菓菍莽莚葛葔萤", 33659));
   private static I_lO II_o = new I_lO(IllI("茍菗菖莺莶葢葁萵萐蓹", 33659));
   public static I_lO IIO = new I_lO(IllI("茍菗菖莺", 33659));
   public static I_lO IIOI = new I_lO(IllI("茍菔菉莻", 33659));
   public static I_lO IIOl = new I_lO(IllI("茍菜菕莹莐", 33659));
   public static I_l0[] II;
   private static int Io_o = 0;
   public static int I1OO = -1;
   private static int IoO = 0;
   public I_oI[] II;
   private static I_O_ III = new I_O_();
   private static I_O_ IIII = new I_O_();
   public static int I1Oo;
   public static boolean I_O_ = false;
   private static boolean I_OO = false;
   private static boolean I_O0 = false;
   private static boolean I_Oo = false;
   private static boolean I_0 = false;
   private static boolean I_0I = false;
   private static boolean I_Il = false;
   public static boolean I_0l = false;
   public static boolean I_01 = false;
   private static boolean I_0_ = false;
   private static boolean I_0O = false;
   private static boolean I_00 = false;
   private static boolean I_0o = false;
   private static boolean I_o = false;
   private static boolean I_oI = false;
   private static boolean I_ol = false;
   private static boolean I_o1 = false;
   private static boolean I_o_ = false;
   private static boolean I_l_ = false;
   private static boolean I_oO = false;
   private static boolean I_l0 = false;
   private static boolean I_o0 = false;
   private static boolean I_oo = false;
   private static boolean IO = false;
   private static boolean IOI = false;
   private static boolean I_lo = false;
   private static boolean I_1 = false;
   private static boolean IOII = false;
   private static boolean IOIl = false;
   private static boolean I_1I = false;
   private static boolean I_11 = false;
   private static boolean IOI1 = false;
   private static boolean IOI_ = false;
   private static boolean IOIO = false;
   private static boolean IOI0 = false;
   private static boolean IOIo = false;
   private static boolean IOl = false;
   private static boolean IOlI = false;
   private static boolean IOll = false;
   public static Ilol IIlI;
   public static long[] IIIl;
   private int IoOI = 0;
   public int[] IlOI;
   public int[] Il_1;
   public int[] IlOl;
   public int[] Il_O;
   public int[] IlO1;
   public int[] Il_0;
   public String[] IIl1;
   public String[] IIl_;
   public int I1o1 = 0;
   public int IoOl = 0;
   private int IoO1 = -1;
   private boolean IOl1;
   public static int[] IlO_;
   public static int[] IlOO;
   public static Image III0 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虖蘰蘂蛶蚏蚰蚱蚙", 33659));
   public static Image II0O = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虉蘭蘍蛧蛢蚯蚳蚑蝯蜎蝫蝔蟩蟖螰", 33659));
   public static Image III_ = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虉蘭蘍蛧蛢蚯蚳蚑蝯蜎蝪蝔蟩蟖螰", 33659));
   public static Image II00 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虉蘭蘍蛧蛢蚯蚳蚑蝯蜎蝩蝔蟩蟖螰", 33659));
   public static Image II0o = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虉蘭蘍蛧蛢蚯蚳蚑蝯蜌蝫蝔蟩蟖螰", 33659));
   public static Image IIo = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虉蘭蘍蛧蛢蚯蚳蚑蝯蜌蝪蝔蟩蟖螰", 33659));
   public static Image IIoI = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虉蘭蘍蛧蛢蚯蚳蚑蝯蜌蝩蝔蟩蟖螰", 33659));
   public static byte II1o;
   public static byte II_;
   public static byte II_I;
   public static byte II_l;
   public static byte II_1;
   public static byte II__;
   public static byte II_O;
   public static byte II_0;
   private static Image IIol;
   private static Image IIo1;
   public static Image IIo_ = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虈蘡蘍蛷蚏蚰蚱蚙", 33659));
   private static Image IIoO = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虃蘫蘀蛷蛒蛮蚯蚐蝺", 33659));
   private static Image IIo0;
   public static Image IIoo = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虖蘯蘊蛮蛍蛮蚯蚐蝺", 33659));
   public static Image Il = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虖蘯蘊蛮蛍蛲蛱蚎蝳蝛", 33659));
   private static Image IlI;
   private static Image IlII;
   private static Image IlIl;
   private static Image IlI1;
   private static Image IlI_;
   private static Image IlIO;
   public static Image IlI0 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虇蘰蘍蛮蚏蚰蚱蚙", 33659));
   public static Image IlIo = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虇蘰蘍蛮蛇蛮蚯蚐蝺", 33659));
   public static Image Ill = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虇蘰蘍蛮蚓蛮蚯蚐蝺", 33659));
   public static Image IllI = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虇蘰蘍蛮蛇蛲蛱蚎蝳蝛", 33659));
   public static Image III;
   public static Image Illl;
   public static byte II_o = 0;
   public static I1Oo II = new I1Oo();
   public static I1Oo III = new I1Oo();
   private static Image Ill1 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢處蘥蘍蛧蛍蛮蚯蚐蝺", 33659));
   private static Image Ill_ = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒠蒎蕠蕈蔠蕙薤藙薦薀", 33659));
   private static Image IllO = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虭蘔虍蛲蛏蚧", 33659));
   public static Image Ill0 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虨蘔虍蛲蛏蚧", 33659));
   private static Image Illo = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒃蒿蔠蕝蔢蔌", 33659));
   private static Image Il1 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虍蘴蘯蛭蛒蚴蛱蚎蝳蝛", 33659));
   public static Image Il1I = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虈蘴蘯蛭蛒蚴蛱蚎蝳蝛", 33659));
   public static Image Il1l = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒤蒂蔣蕉蔣蕅藺藇薯", 33659));
   public static Image Il11 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒤蒂蔣蕛蔭蔅藭薇薸薉虡", 33659));
   public static Image Il1_ = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒤蒂蔣蕕蔭蔆薤藙薦薀", 33659));
   public static Image Il1O = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒤蒂蔣蕕蔭蔅藢薇薸薉虡", 33659));
   public I_I_ IIIO;
   public I1o0 II;
   private int IoO_;
   public static int IoOO;
   private static III II = new III();
   public static int IoO0 = 0;
   public static I_0o[] III;
   public static I_0o[] IIII;
   public I1Il IIll;
   private static int IoOo;
   public static long Il0l;
   public boolean IOl_;
   private boolean IOlO;
   private int Io0;
   private int Io0I;
   private int Io0l;
   private int IOoI;
   private int Io01;
   private boolean I10O;
   public long Il01;
   boolean IOl0;
   private boolean I10o;
   private int IOol;
   private int IOo_;
   private int IOoO;
   private int IOo0;
   public static boolean IOlo;
   private long Il0_;
   private long Il0O;
   public int Io0_;
   int Io0O;
   public boolean IO1;
   public boolean IO1I;
   private static Image Il10;
   public boolean IO1l = false;
   public boolean IO11 = false;
   public boolean IO1_ = false;
   public boolean IO1O = false;
   public int Io00 = 0;
   public int Io0o;
   public int Ioo;
   private boolean IO10 = false;
   private int I0Io;
   private int I0l;
   private int I0lI;
   private int I0ll;
   public boolean I1_1;
   private boolean IO1o;
   public int IooI;
   public int Iool;
   public int Ioo1;
   public int Ioo_;
   public int IooO;
   private static int I0l_;
   public static boolean IO_;
   public static boolean IO_I;
   public static boolean IO_l;
   private int Ioo0;
   private int I0l0 = 0;
   private int I0lo = -1;
   private I_0o III;
   public String IlI;
   private boolean IO_1;
   private int Iooo;
   private int lI = -1;
   private static long Il00;
   private static long Il0o;
   private static long Ilo;
   private static long IloI;
   private static int lII;
   private int lIII = 0;
   public static int lIIl;
   public static Image Il1o;
   public static Image Il_;
   public int[] IlO0;
   public static Image Il_I;
   public String IlII;
   private static int I011;
   public static boolean IO__;
   public static int lII1;
   private static int[] IlOo;
   private static int[] Il0;
   public static I_lO IIO1;
   private int I01_ = 0;
   public static Image Il_l;
   private static int lII_;
   public static int lIIO;
   public static int lII0;
   public static int lIIo;
   public static int lIl;
   public static int lIlI;
   public static int lIll;
   private static int lIl1;
   private static int lIl_;
   private static int[] Il0I;
   private static int[] Il0l;
   private static int lIlO;
   private static int lIl0;
   public int lIlo;
   public int lI1;
   public boolean IO_O;
   public int lI1I;
   public int lI1l;
   public boolean IO_0;
   private long Ilol;
   private long Ilo1;
   private int lI11;
   public static String[] IIlO;
   public static int[] Il01;
   public static int[] Il0_;
   private static int[] Il0O;
   private static int[] Il00;
   private static int[] Il0o;
   public static int[] Ilo;
   public static int[] IloI;
   private static int[] Ilol;
   private static int[] Ilo1;
   private static int[] Ilo_;
   private static int[] IloO;
   private static int[] Ilo0;
   private static int[] Iloo;
   private static Image[] IIIO;
   private static int lI1_;
   private static int I00l;
   private static long Il_l;
   private int lI1O;
   public static int lI10;
   public static int lI1o;
   public static int lI_;
   public static int lI_I;
   private static int lI_l;
   private static int lI_1;
   private static int I001;
   private static int lI__;
   private I1Il IIl1;
   public static boolean IO_o;
   public static boolean IOO;
   public I__0 II;
   private static Vector IIIl;
   public boolean IOOI;
   private int[] I1;
   private int[] I1I;
   private int[] I1II;
   private int[] I1Il;
   private int[] I1I1;
   private int lI_O;
   private String II0l;
   private int lI_0;
   private int lI_o;
   private int lIO;
   private boolean IOOl;
   public byte IIO;
   public boolean IOO1;
   public int lIOI;
   public static boolean IOO_;
   public static byte IIOI;
   public static byte IIOl;
   private String IlIl;
   private String[] IIl0;
   public I10o[] II;
   private static Image Il_1 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒹蒰蕦蕝蕢蔛藤藎", 33659));
   public static I10 II;
   private static I11o IIll = new I11o(IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒹蒰蕾蕛蔩蔴藨藈薺薸蘶蘋蘴蘍蛥", 33659)), 6, 15);
   private static I11o IIl1 = new I11o(IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒹蒰蕾蕛蔩蔴藨藈薺薸蘷蘋蘴蘍蛥", 33659)), 38, 21);
   private static Image Il__ = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒹蒰蕸蕞蕢蔛藤藎", 33659));
   private static Image Il_O = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒹蒰蕭蕅蔭蔙藦藀薮薂蘨處蘪蘄", 33659));
   private static Image Il_0 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒹蒰蕥蕅蔹蔅藭薇薸薉虡", 33659));
   private static Image Il_o;

   public void IIl1() {
      DataInputStream var1 = null;

      try {
         short var2;
         II = new I_O1[var2 = (var1 = new DataInputStream(new ByteArrayInputStream(I_O1.II(IllI("茵菈菦莨莖葤葁", 33659))))).readShort()];

         for (int var3 = 0; var3 < var2; var3++) {
            byte var4 = var1.readByte();
            II[var3] = new I_O1(var4);

            for (int var5 = 0; var5 < II[var3].II.length; var5++) {
               II[var3].II[var5] = new I__();
               II[var3].II[var5].II1o = var1.readShort();
               II[var3].II[var5].IIO_ = var1.readByte();
               II[var3].II[var5].II1O = var1.readByte();
            }
         }
      } catch (Exception var14) {
         var14.printStackTrace();
      } finally {
         try {
            var1.close();
         } catch (IOException var13) {
            var13.printStackTrace();
         }
      }

      I_oo.IIl_();
   }

   public static void II(Image var0, Image var1, Image var2, float var3, float var4, int var5, float var6, IO1l var7) {
      var5 = var7.IIOO();
      int var8 = var7.IIO0();
      int var9 = var7.IIOo();
      int var10 = var7.II0();
      var7.IIIO((int)var3, (int)var4, (int)var6, 13);

      for (int var11 = 0; var11 < 4; var11++) {
         var7.II(var1, var3 + (var11 + 1) * 15, var4, 0);
      }

      var7.II(var0, var3, var4, 0);
      var7.II(var1, var3 + 100.0F - 30.0F, var4, 0);
      var7.II(var2, var3 + 100.0F - 15.0F, var4, 0);
      var7.IIIO(var5, var8, var9, var10);
   }

   public static boolean IIo() {
      return IOlO.l1oI >= 53 && IOlO.l1oI <= 62;
   }

   public static boolean IIoI() {
      return IOlO.l1oI >= 63;
   }

   @Override
   public void I0l_() {
      I_0l.I0_l = false;
      if (Il0O.IIO1()) {
         IO.II();
      }

      I1o_.IO0_ = false;
      Ilol.I10I = false;
      if (!I_1o) {
         I_0_.II().Io0();
      }

      if (IOlO.II() && I1I0.I1l1) {
         I1I0.I1l1 = false;
         super.IIl = null;
      }

      II.IO0 = true;
      III.IO0 = true;
      I1l1 = true;
      this.IoO_ = 0;
      I_1o = false;
      super.I0l_();
   }

   public static void I0lo() {
      IOl1.IlI1.removeAllElements();
      II_O.removeAllElements();
      II_0.removeAllElements();
      I1l1.II1_.removeAllElements();
      I1l1.II1o.removeAllElements();
      I1l1.II10.removeAllElements();
      I1l1.II_.removeAllElements();
      I1l1.II11.removeAllElements();
      II_o.removeAllElements();
      IIO.removeAllElements();
      IIOI.removeAllElements();
      Ilol.II().IIlO.removeAllElements();
   }

   public void II(byte[] var1) {
      I_Ol.II__(IllI("茼菟菭菸莸葘葦萗萡蓗蓴蒞蒼蕅蕤蔀蔧薫", 33659));
      IIII = new I_0o[10];
      if (var1 == null) {
         I_Ol.II__(IllI("茕華菕莴", 33659));
         I_Ol.II__(IllI("茷菕菸莜菗葒葰萒萲蓇蓽蒄蓏蕁蕣蔟蔨藘藬薍薩蘦虶蘏蘪蛎蛭", 33659));

         for (int var2 = 0; var2 < IIII.length && var2 < Ilol.II().IIlI.size(); var2++) {
            I_0o var3 = (I_0o)Ilol.II().IIlI.elementAt(var2);
            IIII[var2] = var3;
         }

         IOo();
      } else {
         for (int var5 = 0; var5 < var1.length; var5++) {
            for (int var6 = 0; var6 < Ilol.II().IIlI.size(); var6++) {
               I_0o var4;
               if ((var4 = (I_0o)Ilol.II().IIlI.elementAt(var6)).II.IlIO == var1[var5]) {
                  IIII[var5] = var4;
                  break;
               }
            }
         }
      }
   }

   public void III(byte[] var1) {
      I_Ol.II__(IllI("茼菟菭菸莼葓葬萇萸蓛蓽蒜蓎", 33659));
      III = new I_0o[10];
      if (var1 == null) {
         I_Ol.II__(IllI("茷菕菸莜菗葒葰萒萲蓇蓽蒄蓏蕅蕨蔕蕋藙藢薁薫虊", 33659));

         for (int var2 = 0; var2 < III.length && var2 < Ilol.II().IIlI.size(); var2++) {
            I_0o var3 = (I_0o)Ilol.II().IIlI.elementAt(var2);
            III[var2] = var3;
         }

         IO1_();
      } else {
         for (int var5 = 0; var5 < var1.length; var5++) {
            for (int var6 = 0; var6 < Ilol.II().IIlI.size(); var6++) {
               I_0o var4;
               if ((var4 = (I_0o)Ilol.II().IIlI.elementAt(var6)).II.IlIO == var1[var5]) {
                  III[var5] = var4;
                  break;
               }
            }
         }
      }
   }

   public void IIII(byte[] var1) {
      I_Ol.II__(IllI("茼菟菭菸莴葃葧萆萶蓜蓥蒃蒤蕇蕡蔀蕊", 33659));
      if (var1 != null && var1.length != 0) {
         for (int var2 = 0; var2 < Ilol.II().IIlI.size(); var2++) {
            I_0o var3;
            if ((var3 = (I_0o)Ilol.II().IIlI.elementAt(var2)).II.IlIO == var1[0]) {
               Ilol.II().II = var3;
               break;
            }
         }
      } else if (Ilol.II().IIlI.size() > 0) {
         Ilol.II().II = (I_0o)Ilol.II().IIlI.elementAt(0);
      }

      if (Ilol.II().II != null) {
         I_0_.II().IIo(Ilol.II().II.II.IlIO);
         Ilol.II();
      }
   }

   protected static void II(I_o1 var0) {
      I_Ol.II__(IllI("茿菕莙莋莲葂萕萛落蓁蓲蒂蒪蕋蕣蕬蔸藁藠薄薫", 33659));
      I_0o var1 = Ilol.II().II(var0);
      I_lO var2 = new I_lO("");

      for (int var3 = 0; var3 < (II.IIIl ? 10 : 5); var3++) {
         Object[] var4;
         (var4 = new Object[2])[0] = var1;
         var4[1] = String.valueOf(var3);
         I1Il var5 = new I1Il(IO11.IOIO + (var3 + 1), 11120, var4);
         if (IIII[var3] != null) {
            var5.I_1o = true;
         }

         var2.addElement(var5);
      }

      II.II.II(var2);
   }

   protected static void III(I_o1 var0) {
      I_Ol.II__(IllI("茿菕莙莋莲葂萕萟萶蓋蒑蒃蒤蕇蕡蔀", 33659));
      I_0o var1 = Ilol.II().II(var0);
      String[] var2 = IOI0.III_ ? IO11.II0I : IO11.II0l;
      I_lO var3 = new I_lO("");

      for (int var4 = 0; var4 < (II.IIIl ? 10 : 5); var4++) {
         Object[] var5;
         (var5 = new Object[2])[0] = var1;
         var5[1] = String.valueOf(var4);
         var3.addElement(new I1Il(var2[var4], 11121, var5));
      }

      II.II.II(var3);
   }

   private static void IOo() {
      byte[] var0 = new byte[IIII.length];

      for (int var1 = 0; var1 < IIII.length; var1++) {
         if (IIII[var1] == null) {
            var0[var1] = -1;
         } else {
            var0[var1] = IIII[var1].II.IlIO;
         }
      }

      I_0_.II().II(var0);
   }

   private static void IO1_() {
      byte[] var0 = new byte[III.length];

      for (int var1 = 0; var1 < III.length; var1++) {
         if (III[var1] == null) {
            var0[var1] = -1;
         } else {
            var0[var1] = III[var1].II.IlIO;
         }
      }

      I_0_.II().II(var0);
   }

   public static boolean II_o() {
      for (int var0 = Ilol.II().II.length - 1; var0 >= 0; var0--) {
         if (Ilol.II().II[var0] == null) {
            return false;
         }
      }

      return true;
   }

   public static void II(String[] var0, I_11 var1) {
      I_lO var2 = new I_lO("");

      for (int var3 = 0; var3 < var0.length; var3++) {
         var2.addElement(new I1Il(var0[var3], 11057, var1));
      }

      II.II.II(var2);
   }

   public static void I01() {
      DataInputStream var0 = null;

      try {
         short var1;
         II = new I1lO[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(I_O1.II(IllI("茵菈菦莽莑葰葐萷萇", 33659))))).readShort()];

         for (int var2 = 0; var2 < var1; var2++) {
            II[var2] = new I1lO();
            var0.readShort();
            II[var2].II = new I1lo[var0.readByte()];

            for (int var3 = 0; var3 < II[var2].II.length; var3++) {
               II[var2].II[var3] = new I1lo();
               II[var2].II[var3].I_Oo = var0.readShort();
               II[var2].II[var3].II0I = var0.readByte();
               II[var2].II[var3].I_O0 = var0.readByte();
            }
         }

         return;
      } catch (Exception var12) {
         var12.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }
   }

   public static void I01I() {
      DataInputStream var0 = null;

      try {
         short var1;
         II = new Il01[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(I_O1.II(IllI("茵菈菦莹莅葤葚萣", 33659))))).readShort()];

         for (int var2 = 0; var2 < var1; var2++) {
            II[var2] = new Il01();
            var0.readShort();
            II[var2].IIOo[0] = var0.readShort();
            II[var2].IIOo[1] = var0.readShort();
            II[var2].IIOo[2] = var0.readShort();
         }

         return;
      } catch (Exception var11) {
         var11.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var10) {
            var10.printStackTrace();
         }
      }
   }

   public static void I01l() {
      DataInputStream var0 = null;

      try {
         short var1;
         II = new I1Io[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(I_O1.II(IllI("茵菈菦莼莖葤葁", 33659))))).readShort()];

         for (int var2 = 0; var2 < var1; var2++) {
            II[var2] = new I1Io();
            var0.readShort();
            II[var2].II10 = var0.readShort();
            II[var2].IIO1 = var0.readShort() << 8;
            II[var2].II1O = var0.readShort();
            short var3 = var0.readShort();
            II[var2].III_ = new short[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               II[var2].III_[var4] = var0.readShort();
            }

            var3 = var0.readShort();
            II[var2].IIIO = new short[var3];

            for (int var22 = 0; var22 < var3; var22++) {
               II[var2].IIIO[var22] = var0.readShort();
            }

            var3 = var0.readShort();
            II[var2].III0 = new short[var3];

            for (int var23 = 0; var23 < var3; var23++) {
               II[var2].III0[var23] = var0.readShort();
            }

            var3 = var0.readShort();
            II[var2].IIIo = new short[var3];

            for (int var24 = 0; var24 < var3; var24++) {
               II[var2].IIIo[var24] = var0.readShort();
            }

            var3 = var0.readShort();
            II[var2].III = new short[var3][];

            for (int var25 = 0; var25 < var3; var25++) {
               short var5 = var0.readShort();
               II[var2].III[var25] = new short[var5];

               for (int var6 = 0; var6 < var5; var6++) {
                  II[var2].III[var25][var6] = var0.readShort();
               }
            }

            var3 = var0.readShort();
            II[var2].IIII = new short[var3][];

            for (int var26 = 0; var26 < var3; var26++) {
               short var27 = var0.readShort();
               II[var2].IIII[var26] = new short[var27];

               for (int var28 = 0; var28 < var27; var28++) {
                  II[var2].IIII[var26][var28] = var0.readShort();
               }
            }
         }

         return;
      } catch (Exception var15) {
         var15.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var14) {
            var14.printStackTrace();
         }
      }
   }

   public static void I011() {
      DataInputStream var0 = null;

      try {
         short var1 = (var0 = new DataInputStream(new ByteArrayInputStream(I_O1.II(IllI("茵菈菦莫莜葿葙萸", 33659))))).readShort();
         II = new I_ol[I_o_.IIIO.size()];

         for (int var2 = 0; var2 < var1; var2++) {
            short var3;
            if ((var3 = var0.readShort()) == 1111) {
               var3 = (short)(var1 - 1);
            }

            II[var3] = new I_ol();
            II[var3].II0I = var3;
            II[var3].I_O0 = var0.readShort();
            if (II[var3].I_O0 <= 0) {
               II[var3].I_O0 = 80;
            }

            var0.readByte();
            II[var3].II = new I_o[var0.readByte()];

            for (int var4 = 0; var4 < II[var3].II.length; var4++) {
               II[var3].II[var4] = new I_o();
               II[var3].II[var4].II0I = var0.readByte();
               II[var3].II[var4].I_O0 = var0.readShort();
               II[var3].II[var4].I_Oo = var0.readShort();
               II[var3].II[var4].I_0 = var0.readShort();
               II[var3].II[var4].IIO = var0.readShort();
               II[var3].II[var4].IIOI = var0.readShort();
               II[var3].II[var4].IIOl = var0.readShort();
               II[var3].II[var4].IIlI = var0.readShort();
               II[var3].II[var4].IIO1 = var0.readShort();
               II[var3].II[var4].IIO_ = var0.readShort();
               II[var3].II[var4].IoII = var0.readShort();
               II[var3].II[var4].IIO0 = var0.readShort();
               II[var3].II[var4].IIOo = var0.readShort();
            }

            II[var3].III = new I_o[var0.readByte()];

            for (int var15 = 0; var15 < II[var3].III.length; var15++) {
               II[var3].III[var15] = new I_o();
               II[var3].III[var15].II0I = var0.readByte();
               II[var3].III[var15].I_O0 = var0.readShort();
               II[var3].III[var15].I_Oo = var0.readShort();
               II[var3].III[var15].I_0 = var0.readShort();
               II[var3].III[var15].IIO = var0.readShort();
               II[var3].III[var15].IIOI = var0.readShort();
               II[var3].III[var15].IIOl = var0.readShort();
               II[var3].III[var15].IIlI = var0.readShort();
               II[var3].III[var15].IIO1 = var0.readShort();
               II[var3].III[var15].IIO_ = var0.readShort();
               II[var3].III[var15].IoII = var0.readShort();
               II[var3].III[var15].IIO0 = var0.readShort();
               II[var3].III[var15].IIOo = var0.readShort();
            }
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var12) {
            var12.printStackTrace();
         }
      }

      I_Ol.II__(IllI("茩菟菸莜菗葅葾萝萿蓞蒑蒔蒠蕀蕨", 33659));
   }

   public static I1_I II() {
      if (II == null) {
         II = new I1_I();
      }

      return II;
   }

   public static void I01_() {
      II = null;
   }

   public void I01O() {
      if (IIIO == null) {
         IIIO = new Image[3];

         for (int var1 = 0; var1 < 3; var1++) {
            IIIO[var1] = IO10.IIII(IllI("荔菿莖莫莇", 33659) + var1 + IllI("荕菪菗莿", 33659));
         }
      }

      Ilo1 = new int[2];
      Ilo_ = new int[2];
      IloO = new int[2];
      Ilo0 = new int[2];
      Iloo = new int[2];
      IloO[0] = IloO[1] = -1;
      this.lI1O = 84;
      Il_l = 66L;
      I00l = 59;
      lI1_ = 61;
   }

   public I1_I() {
      int[] var10000 = new int[]{-1, -1};
      this.IOOI = false;
      this.IlIl = "";
      new I1Il("", 11021);
      this.IIll = new I1Il(IllI("荛莺", 33659), 11000);
      this.IIlI = new I1Il("", 11001);
      this.IIll.IIO1 = IIo_;
      this.IIll.IoII = IO1l.II(this.IIll.IIO1) + 20;
      this.IIll.I__ = false;
      this.IIlI.IIO1 = IIoO;
      if (II.IIIl) {
         this.IIll.I1 = 0;
         this.IIll.I1I = 50;
         this.IIlI = null;
      } else {
         this.IIll.I1 = 0;
         this.IIll.I1I = IIO - 30;
         this.IIlI.I1 = I_0 - 32;
         this.IIlI.I1I = IIO - 32;
      }

      super.IIl = this.IIlI;
      lIIl = 1;
      if (II.IIIl) {
         I_0l = true;
      }
   }

   public static void IIlI(int var0, int var1) {
      I_0 = II.IIl;
      IIlI = 39;
      IIO = II.IIlI;
      if ((Iolo = II.IIlI / 6) < 48) {
         Iolo = 48;
      }

      IIOI = I_0 >> 1;
      Iol0 = IIO >> 1;
      IolO = IIO - 120;
      IIOl = (IIO << 1) / 3;
      IIO1 = I_0 / 6;
      Iol1 = I_0 / IOlO.IlI0 + 2;
      Iol_ = IIO / IOlO.IlI0 + 2;
      if (I_0 % 24 != 0) {
         Iol1++;
      }

      Io_ = (IOlO.l10_ - 1) * IOlO.IlI0 - I_0;
      Io_I = (IOlO.l10O - 1) * IOlO.IlI0 - IIO;
      if (var0 == -1 && var1 == -1) {
         Io1 = Io10 = Ilol.II().I_o_ - IIOI + IIO1 * Ilol.II().IOI1;
         Io1I = Io1o = Ilol.II().I_oO - IIOl - 1;
      } else {
         Io1 = Io10 = var0 - IolO + IIO1 * Ilol.II().IOI1;
         Io1I = Io1o = var1 - IIOl - 1;
      }

      if (Io1 < 24) {
         Io10 = 24;
         Io1 = 24;
      }

      if (Io1 > Io_) {
         Io1 = Io10 = Io_;
      }

      if (Io1I < 0) {
         Io1o = 0;
         Io1I = 0;
      }

      if (Io1I > Io_I) {
         Io1I = Io1o = Io_I;
      }

      if ((Io_l = Io1 / IOlO.IlI0 - 1) < 0) {
         Io_l = 0;
      }

      Io_1 = Io1I / IOlO.IlI0;
      Io__ = Io_l + Iol1;
      Io_O = Io_1 + Iol_;
      if (Io_1 < 0) {
         Io_1 = 0;
      }

      if (Io_O > IOlO.l10O - 1) {
         Io_O = IOlO.l10O - 1;
      }

      if ((IOlO.I1OI = Io__ - Io_l << 2) > IOlO.l10_) {
         IOlO.I1OI = IOlO.l10_;
      }

      if ((IOlO.I1Ol = Io_O - Io_1 << 2) > IOlO.l10O) {
         IOlO.I1Ol = IOlO.l10O;
      }

      if ((IOlO.I1_O = (Ilol.II().I_o_ - 2 * I_0) / IOlO.IlI0) < 0) {
         IOlO.I1_O = 0;
      }

      if ((IOlO.I1_0 = IOlO.I1_O + IOlO.I1OI) > IOlO.l10_) {
         IOlO.I1_0 = IOlO.l10_;
      }

      if ((IOlO.I1_o = (Ilol.II().I_oO - 2 * IIO) / IOlO.IlI0) < 0) {
         IOlO.I1_o = 0;
      }

      if ((IOlO.I1O = IOlO.I1_o + IOlO.I1Ol) > IOlO.l10O) {
         IOlO.I1O = IOlO.l10O;
      }

      Ilo_.II().II = II;
      Ilo_.II().II.I_O0 = II.IIlI - 35 - Ilo_.II().II.l10I;
      Ilo_.II().IIl1();
      if (II.IIIl) {
         lII_ = IIO - 88;
         lIIO = I_0 - 40;
         lII0 = 2;
         if (II.IIl <= 240) {
            lIIO = I_0 - 35;
            lII0 = 5;
         }

         lIIo = I_0 - 55;
         lIl = lII_ + 35;
         lIl1 = I_0 - 37;
         lIl_ = lII_ - 1;
         if (II.IIl >= 450) {
            lIl_ -= 12;
            lIll -= 7;
            lIIo -= 10;
            lIl -= 5;
            lIl1 -= 10;
         }
      }

      I010();
      I011 = II.IIl > 200 ? 40 : 30;
      I_1o var2;
      boolean var3;
      if (I_O1.III(IllI("茍菳菜莯莔葾葔萠", 33659)) == -1) {
         var2 = II.II;
         var3 = true;
      } else {
         var2 = II.II;
         var3 = I_O1.III(IllI("茍菳菜莯莔葾葔萠", 33659)) == 1;
      }

      var2.I01_ = var3;
   }

   public static void I010() {
      Object var0 = null;
      Il0I = new int[((Object[])(var0 = II.IIIl ? IIII : III)).length];
      Il0l = new int[((Object[])var0).length];
      IoOo = 30;
      if (II.IIl <= 320) {
         lIl0 = IIO - IoOo - 6;
         lIlO = IIOI - ((Object[])var0).length * IoOo / 2 - 25;
      } else {
         IoOo = 40;
         lIlO = 10;
         lIl0 = II.IIlI - IoOo + 7;
      }

      for (int var1 = 0; var1 < Il0I.length; var1++) {
         Il0I[var1] = var1 * IoOo;
         Il0l[var1] = lIl0;
         if (Il0I.length > 5 && var1 >= Il0I.length / 2) {
            Il0I[var1] = (var1 - Il0I.length / 2) * IoOo;
            Il0l[var1] = lIl0 - 32;
         }
      }

      lIlI = ((Object[])var0).length * IoOo;
      lIll = lIl0;
      if (II.IIIl) {
         lIlO = 17;
         lIl0 = II.IIlI - 40;
         if (II.II1o && IoO0 == 1) {
            lIlI = ((Object[])var0).length * IoOo;
            lIll = lIl0;
         } else {
            lIlI = II.IIl - 45;
            lIll = II.IIlI - 45;
         }

         if (IoO0 != 0) {
            lIl1 = lIIo = II.IIl - 45;
            if (II.II_) {
               lIlO = II.II0I + 20;
               IoOo = 35;
               lIlI = lIIo - 45;
            } else if (II.III) {
               lIlI = lIIo - 45;
            }

            lIl_ = (lIl = II.IIlI - 45) - 45;
         }

         for (int var3 = 0; var3 < Il0I.length; var3++) {
            Il0I[var3] = var3 * IoOo;
            Il0l[var3] = lIl0;
            if (Il0I.length > 5 && var3 >= Il0I.length / 2) {
               Il0I[var3] = (var3 - Il0I.length / 2) * IoOo;
               Il0l[var3] = lIl0 - 32;
            }
         }
      }
   }

   public void II(String var1, int var2, int var3) {
      I1I var4;
      (var4 = new I1I()).I_O0 = var3;
      var4.II0I = var2;
      this.III(var1, new I1Il(IO11.I_I_, 12002, var4), new I1Il(IO11.I_IO, 12003, var4));
   }

   private void IOoI() {
      this.Io0_ = 0;
      II.III1();
      if (Ilol.II().IIIl.IOI_ >= 0 && Ilol.II().IOI_ >= 0) {
         I_lO var1 = II.II.IIo;
         if (II.II.IIo.size() <= 0) {
            if (Ilol.II().II != null && Ilol.II().II.II01 > 1) {
               var1.addElement(new I1Il(IO11.IO11, 11112, Ilol.II().IIIl));
               var1.addElement(new I1Il(IO11.I0II, 11113, Ilol.II().IIIl));
            }

            if (Ilol.II().II != null && Ilol.II().III_ < 2 && Ilol.II().IIIl.IO1I == -1) {
               var1.addElement(new I1Il(IO11.II0[4], 110391));
            }

            if (Ilol.II().IIIl.IOIl == 14 || Ilol.II().IIIl.IOIl == 5) {
               Ilol.II();
            } else if (Ilol.II().II != null && Ilol.II().II.II01 >= 14) {
               var1.addElement(new I1Il(IO11.II0[0], 2003));
            }

            if (Ilol.II().II != null
               && Ilol.II().II.II0I == Ilol.II().IIIl.IO1I
               && Ilol.II().IIIl.IOIl != 14
               && Ilol.II().II != null
               && Ilol.II().II.II01 >= 14) {
               var1.addElement(new I1Il(IO11.II0[1], 2004));
            }

            int var2 = Ilol.II().II.II.length;

            for (int var3 = 0; var3 < var2; var3++) {
               I_o1 var4 = Ilol.II().II.II[var3];
               I_0o var5;
               if ((var5 = Ilol.II().II(var4)) != null && var4.IlIO() && var5.l1__ > 0) {
                  var1.addElement(new I1Il(var4.II1o, 12004, var5));
               }
            }
         }
      }
   }

   public static boolean IIIl(I_I_ var0) {
      if (var0 == null) {
         return false;
      } else if (Ilol.II().III0 == 5) {
         return true;
      } else if (Ilol.II().II01() && !var0.I0I1) {
         return false;
      } else if (Ilol.II().IIIl != null && var0.equals(Ilol.II().IIIl)) {
         return false;
      } else {
         Ilol var1;
         if ((var1 = II(var0.lll)) == null) {
            return true;
         } else {
            return var1.III0 == 5 ? true : Ilol.II().IIIO(var1);
         }
      }
   }

   private boolean II0I() {
      if (Ilol.II().II == null
         || (Ilol.II().II.II.l1Ol == 1 || Ilol.II().IOl1 >= Ilol.II().II.l1O)
            && (Ilol.II().II.II.l1Ol != 1 || Ilol.II().IOl1 >= Ilol.II().IO1 * Ilol.II().II.l1O / 100)) {
         if (Ilol.II().II != null && (Ilol.II().II.II.l1OI <= 0 || Ilol.II().II.l1__ != 0)) {
            return true;
         }

         II.II(IO11.I10_);
         return false;
      } else {
         II.IIII(IO11.I__I, 0);
         this.Io0_ = 0;
         return false;
      }
   }

   public void I01o() {
      II.II.IOol = false;
      Ilo_ var1;
      (var1 = Ilo_.II()).II.IIOl("");
      var1.I_10 = false;
      Ilo_.II().III0 = null;
      this.IOl1 = false;
      this.I1o1 = 0;
      IoO = 0;
      Io_o = 0;
      this.IoO1 = -1;
      I1OO = -1;
      this.I1o1 = this.IoOl = 0;
      if (Ilol.II().IOl_ > 0 && Ilol.II().IOIl != 14 && Ilol.II().IOIl != 5) {
         I_0l = true;
      } else {
         if (Ilol.II().I_I_) {
            this.IIl1 = new I1Il(IO11.II0_[0], 11038);
            super.III0 = this.IIl1;
            Ilol.II().IOl_ = 0;
         }

         I_0l = false;
      }

      I_O_ var2 = IIII;
      IIII.II0I = 0;
      var2.I_O0 = 0;
      var2.I_Oo = 0;
      var2.I_0 = 0;
      var2.IIO = 0;
      var2.IIOI = 0;
      var2.IIOl = 0;
      var2.IIlI = 0;
      var2.IoII = 0;
      var2.IIO0 = 0;
      var2.IIO1 = 0;
      var2.IIO_ = 0;
   }

   @Override
   public void IIO1(int var1) {
      super.IIO1(var1);
   }

   @Override
   public void I_Il() {
      if (!I1I1.I___ && !Ilol.II().I11 && !Ilol.II().I_1I && !I1OO.I1l1) {
         label1004:
         if (II.IIIl && !Ilo_.II().I_10 && !II.II.IOol && !this.IIoO()) {
            IlI.III().I_lO();
            IIol.I_Il();
            IlI.III().I_1();
            IIo1.III().I_I1();
            IO1_.l_l = -1;
            if (II.III1) {
               if (II.II(0, 0, 60, 50) && II.III0 && II.IIIo) {
                  IlI.III().I_l0();
                  if (Ilol.II().II != null) {
                     Ilol.II().II.I0lO();
                  }

                  Ilol.II().II = null;
                  II.IIlI();
                  this.IO_1 = true;
                  this.Iooo = 5;
                  break label1004;
               }

               if (!IOlO.IllI() && II.II(lIIO, lII0, 34, 34)) {
                  IO1_.l_l = 15;
                  II.II1 = false;
                  this.IOl_ = false;
                  Ilo_.II().II00 = IO11.I_Io;
                  if (II.III0 && II.IIIo) {
                     Ilo_.II().II1o("");
                     IO.II();
                     Ilol.II().II = null;
                     II.IIlI();
                     break label1004;
                  }
               }

               if (Ilol.II().II != null && II.II(Ilol.II().II.I1 - 17, Ilol.II().II.I1I - 17, 34, 34)) {
                  IO1_.l_l = 20;
                  II.II1 = false;
                  this.IOl_ = false;
                  if (II.III0 && II.IIIo) {
                     II.IIlI();
                     Ilol.II().II.I0lO();
                     break label1004;
                  }
               }

               if (IoO0 != 0 && Ilol.II().IOIl != 14) {
                  if (II.II(lIIo, lIl, 40, 40)) {
                     IO1_.l_l = 5;
                     if (II.IIIo) {
                        II.II[5] = true;
                        II.IIIo = false;
                        II.II1 = false;
                        II.III0 = false;
                     }
                  }

                  II.IIl1();
                  if (II.II(lIl1, lIl_, 34, 34)) {
                     IO1_.l_l = 13;
                     II.II1 = false;
                     this.IOl_ = false;
                     if (II.III0 && II.IIIo) {
                        Ilol.II().IOo_();
                        II.IIIo = false;
                        II.II1 = false;
                        II.III0 = false;
                     }
                  }
               }

               if ((IoO0 == 0 ? II.II(lIlI, lIll, 40, 40) : II.II(lIlI, lIll, 34, 34)) && Ilol.II().IOIl != 14 && this.IIIO == null) {
                  IO1_.l_l = 10;
                  II.II1 = false;
                  this.IOl_ = false;
                  if (II.III0 && II.IIIo) {
                     II.II[10] = true;
                     II.IIIo = false;
                     II.II1 = false;
                     II.III0 = false;
                  }
               }
            }

            if (this.IIIO != null) {
               I1_I var8 = this;
               if (!this.IIoO()) {
                  for (int var3 = 0; var3 < var8.IlI.length(); var3++) {
                     var8.IlO0[var3] = -1;
                     if (II.III1) {
                        int var4 = (II.IIl - var8.IlI.length() * I011) / 2;
                        int var6 = var8.IlI.length() * I011;
                        int var9 = II.IIlI - 40;
                        int var1 = I011;
                        if (II.II(var4, var9, var6, var1)) {
                           var1 = (II.II - var4) / I011;
                           if (var3 == var1) {
                              var8.IlO0[var3] = 1;
                           }

                           if (II.III0 && II.IIIo && var3 == var1) {
                              char[] var7 = var8.IlII.toCharArray();
                              I_lO var2 = new I_lO("");

                              for (int var24 = 0; var24 < var7.length; var24++) {
                                 var2.addElement(String.valueOf(var7[var24]));
                              }

                              var2.removeElementAt(0);
                              var2.insertElementAt(String.valueOf(var8.IlI.charAt(var3)), var2.size());
                              var8.IlII = "";

                              for (int var25 = 0; var25 < var2.size(); var25++) {
                                 var8.IlII = var8.IlII + ((String)var2.elementAt(var25)).toUpperCase();
                              }

                              I_0_.II().II(var8.IlI.charAt(var3));
                           }
                        }
                     }
                  }
               }
            } else if (I_0l) {
               if (this.IIol()) {
                  break label1004;
               }

               this.lI = -1;
               boolean var30 = false;
               if (IIII.length > 5
                  && (
                     II.II(lIlO + Il0I[0] - IoOo / 2 + 12, Il0l[0] - IoOo / 2 + 12, 5 * IoOo, IoOo)
                        || II.II(lIlO + Il0I[5] - IoOo / 2 + 12, Il0l[5] - IoOo / 2 + 12, 5 * IoOo, IoOo)
                  )) {
                  var30 = true;
               }

               if (var30
                  || II.II(lIlO + Il0I[0] - IoOo / 2 + 12, Il0l[0] - IoOo / 2 + 12, 5 * IoOo, IoOo)
                  || !II.III1 && II.II(lIlO + Il0I[0] - IoOo / 2 + 12, Il0l[0] - IoOo / 2 + 12, IoOo, IIII.length * IoOo)) {
                  II.II1 = false;
                  this.IOl_ = false;
                  int var5 = (II.III1 - (lIlO + Il0I[0] - IoOo / 2 + 12)) / IoOo;
                  if (var30 && II.III_ < Il0l[0]) {
                     var5 += 5;
                  }

                  this.lI = var5;
                  if (II.III0 && II.IIIo) {
                     II.IIIo = false;
                     II.II1 = false;
                     II.III0 = false;
                     this.I0lo = var5;
                     if (this.I0lo > IIII.length - 1) {
                        this.I0lo = IIII.length - 1;
                     }

                     I_0o var33;
                     if ((var33 = IIII[this.I0lo]) != null) {
                        this.II(var33, true);
                     }
                  }
               }
            }

            if (II.IIIo) {
               if (II.IIII[1] || II.IIII[2] || II.IIII[3] || II.IIII[4] || II.IIII[6]) {
                  II.IIIo = false;
               }

               II.IIII[1] = false;
               II.IIII[2] = false;
               II.IIII[3] = false;
               II.IIII[4] = false;
               II.IIII[6] = false;
            }
         }

         long var31 = System.currentTimeMillis();
         if (II.II[2] || II.II[4] || II.II[6] || II.II[1] || II.II[3]) {
            this.Io0_ = 0;
            IO_ = false;
            II0l.III().Iloo();
         }

         if (II.II[5]) {
            if (this.Io0_ == 0) {
               if (var31 - this.Il0_ < 800L
                  && (
                     Ilol.II().II == null
                        || (Ilol.II().II.II.l1Ol == 1 || Ilol.II().IOl1 >= Ilol.II().II.l1O)
                           && (Ilol.II().II.II.l1Ol != 1 || Ilol.II().IOl1 >= Ilol.II().IO1 * Ilol.II().II.l1O / 100)
                  )
                  && Ilol.II().II != null
                  && (Ilol.II().II.II.l1OI <= 0 || Ilol.II().II.l1__ != 0)
                  && (Ilol.II().IIII != null || Ilol.II().IIIl != null && Ilol.II().IIIO(Ilol.II().IIIl))) {
                  this.Io0_ = 10;
                  II.II[5] = false;
               }
            } else {
               this.Io0_ = 0;
               II.II[4] = II.II[6] = false;
            }

            this.Il0_ = var31;
         }

         label951: {
            if (II.IIIO % 5 == 0 && this.Io0_ > 0 && Ilol.II().II == null) {
               if (Ilol.II().II != null && (Ilol.II().II.II.IlI0() || Ilol.II().II.I0Ol)) {
                  break label951;
               }

               if (Ilol.II().IIII != null && Ilol.II().IIII.status != 1 && Ilol.II().IIII.status != 0 && Ilol.II().IIIl == null
                  || Ilol.II().IIIl != null && Ilol.II().IIIO(Ilol.II().IIIl)) {
                  if (Ilol.II().II.I0Ol) {
                     break label951;
                  }

                  this.II(false, true);
               }
            }

            if (this.Io0_ > 1) {
               this.Io0_--;
            }
         }

         if (Ilo1.III != null) {
            I1Il var10 = Ilo1.III.IIII;
            if ((II.II[5] || IO1_.II(var10)) && var10 != null) {
               II.IIIo = false;
               II.II[5] = false;
               IO1_.l_l = -1;
               if (var10 != null) {
                  var10.I0lO();
               }
            }
         } else if (!Ilo_.II().I_10) {
            if ((II.II[12] || IO1_.II(II.II.IIIo)) && super.IIIo != null) {
               II.IIIo = false;
               II.III0 = false;
               II.II[12] = false;
               IO1_.l_l = -1;
               if (super.IIIo != null) {
                  super.IIIo.I0lO();
               }
            }

            if ((II.II[13] || IO1_.II(II.II.IIl)) && super.IIl != null) {
               II.IIIo = false;
               II.III0 = false;
               II.II[13] = false;
               IO1_.l_l = -1;
               if (super.IIl != null) {
                  super.IIl.I0lO();
               }
            }

            if ((II.II[5] || IO1_.II(II.II.III0)) && super.III0 != null) {
               II.IIIo = false;
               II.II[5] = false;
               IO1_.l_l = -1;
               if (super.III0 != null) {
                  super.III0.I0lO();
               }
            }
         } else {
            if (Ilo_.II().III_ != null && (II.II[12] || IO1_.II(Ilo_.II().III_)) && Ilo_.II().III_ != null) {
               Ilo_.II().III_.I0lO();
            }

            if (Ilo_.II().IIIO != null && (II.II[13] || IO1_.II(Ilo_.II().IIIO)) && Ilo_.II().IIIO != null) {
               Ilo_.II().IIIO.I0lO();
            }

            if (Ilo_.II().III0 != null && (II.II[5] || IO1_.II(Ilo_.II().III0)) && Ilo_.II().III0 != null) {
               Ilo_.II().III0.I0lO();
            }
         }

         if (Ilol.II().II != null) {
            for (int var17 = 0; var17 < II.II.length; var17++) {
               if (II.II[var17]) {
                  Ilol.II().II = null;
                  break;
               }
            }
         }

         if (Ilo_.II().I_10 && II.II_ != 0) {
            Ilo_.II().keyPressed(II.II_);
            II.II_ = 0;
         } else if (!II.II.IOol && !Ilol.I10) {
            if (II.II[10]) {
               II.II[10] = false;
               this.I0_();
               II.IIIl();
            }

            if (II.II[11] && this.IIIO == null) {
               if (this.II != null) {
                  this.II.II_l.I0lO();
               } else if (III.III.II != null && III.III.II.IIll != null) {
                  II.II.I0o_();
                  II.II.I__0();
               }

               II.II[11] = false;
               II.IIIl();
            }

            if (II.II_ != 0 && IOI0.III_ && II.II_ == 32) {
               this.I0_();
               II.II_ = 0;
               II.IIIl();
            }

            if (II.II_ != 0 && this.IIIO == null && IOI0.III_ && II.II_ == 121) {
               if (this.II != null) {
                  this.II.II_l.I0lO();
                  II.II_ = 0;
                  II.IIIl();
               } else if (III.III.II != null && III.III.II.IIll != null) {
                  II.II.I0o_();
                  II.II.I__0();
                  II.II_ = 0;
                  II.IIIl();
               }
            }

            if (II.II[10] && this.IIIO == null) {
               II.II[10] = false;
               boolean var34 = true;
               III.IIOl = 10;
               II.IIIl();
            }

            if (!II.II() && IoO0 != 1) {
               Ilol.II().I11o = true;
               if (II.II1) {
                  II.II1 = false;
                  this.IOl_ = true;
                  this.Io01 = 0;
                  this.Io0 = this.Io0l = II.II;
                  this.Io0I = this.IOoI = II.III;
               }

               if (this.IOl_) {
                  int var11 = II.II - this.Io0;
                  int var27 = II.III - this.Io0I;
                  if (!this.IOlO && (I_Ol.II1(II.II - this.Io0l) > 15 || I_Ol.II1(II.III - this.IOoI) > 15)) {
                     this.IOlO = true;
                  }

                  this.Io0 = II.II;
                  this.Io0I = II.III;
                  this.Io01++;
                  if (this.IOlO) {
                     Ilol.II().I11o = false;
                     Io1 -= var11;
                     Io1I -= var27;
                     int var12;
                     if (Io1 < 24 && (var12 = (24 - Io1) / 3) != 0) {
                        Io1 += var11 - var11 / var12;
                     }

                     if (Io1 < 24) {
                        Io1 = 24;
                     }

                     if (Io1 > Io_ && (var12 = (Io1 - Io_) / 3) != 0) {
                        Io1 += var11 - var11 / var12;
                     }

                     if (Io1 > Io_) {
                        Io1 = Io_;
                     }

                     if (Io1I < 0 && (var12 = (0 - Io1I) / 3) != 0) {
                        Io1I += var27 - var27 / var12;
                     }

                     if (Io1I < 0) {
                        Io1I = 0;
                     }

                     if (Io1I > Io_I) {
                        Io1I = Io_I;
                     }

                     Io10 = Io1;
                     Io1o = Io1I;
                  }
               }

               if (this.IOl_ && II.IIIo) {
                  this.IOl_ = false;
                  this.IOlO = false;
                  if (I_Ol.II1(II.II - this.Io0l) > 15 || I_Ol.II1(II.III - this.IOoI) > 15) {
                     II.IIIo = false;
                  }
               }
            }

            if (!Ilol.II().I1ol && !this.IIol()) {
               if (this.II != null && this.II.II_l != null && this.II.II_l.II0o()) {
                  this.II.II_l.I0lO();
               } else {
                  boolean var43;
                  label840: {
                     if (this.IIIO != null) {
                        int var36 = (II.IIl - 5 * I011) / 2;
                        int var20 = 5 * I011;
                        int var26 = II.IIlI - 40;
                        int var28 = I011;
                        if (II.II(var36, var26, var20, var28)) {
                           var43 = true;
                           break label840;
                        }
                     }

                     var43 = false;
                  }

                  if (!var43) {
                     var31 = System.currentTimeMillis();
                     if (this.Il01 != 0L) {
                        this.Il01 = 0L;
                        II.II1 = false;
                        if (!this.I10O) {
                           int var37 = II.II + this.IOoO;
                           int var21 = II.III + this.IOo0;
                           if (!this.IIIl(var37, var21) && !this.IIII(var37, var21)) {
                              this.IIll(var37, var21);
                           }

                           II.IIIo = false;
                           this.I_O1 = true;
                           this.Il0 = IO10.IIII();
                        }
                     }

                     if (this.I_O1) {
                        this.Il0I = IO10.IIII();
                        label833:
                        if (this.Il0I - this.Il0 < 300L && II.IIIo) {
                           this.I_O1 = false;
                           int var38 = II.II + this.IOoO;
                           int var22 = II.III + this.IOo0;
                           Ilol.II();
                           I1_O var13;
                           if ((var13 = this.II(var38, var22)) != null) {
                              if (!(var13 instanceof I_I_) || IIIl((I_I_)var13)) {
                                 if (this.II(var13) || !var13.equals(Ilol.II().II) && this.IIIO != null) {
                                    break label833;
                                 }

                                 Ilol var14;
                                 if ((
                                       !Ilol.II().II01()
                                          || Ilol.II().IIIl == null
                                          || var13.equals(Ilol.II().IIIl)
                                          || var13.equals(Ilol.II().IIIl.IIIl)
                                          || !(var13 instanceof Ilol)
                                          || (var14 = (Ilol)var13).III0 == 5
                                          || var14.II01()
                                    )
                                    && (IOlO.l1oI != 51 || !var13.equals(Ilol.II().II))) {
                                    this.IIII(var13);
                                    break label833;
                                 }
                              }
                           } else if (this.IIIl(var38, var22) || this.IIII(var38, var22)) {
                              break label833;
                           }

                           this.IIll(var38, var22);
                        }
                     }

                     if (II.IIIo) {
                        boolean var47;
                        label1165: {
                           int var39 = II.II + Io1;
                           int var23 = II.III + Io1I;
                           Ilol.II();
                           I1_O var50;
                           if ((var50 = this.II(var39, var23)) != null) {
                              Ilol var15;
                              if (Ilol.II().II01()
                                 && Ilol.II().IIIl != null
                                 && !var50.equals(Ilol.II().IIIl)
                                 && !var50.equals(Ilol.II().IIIl.IIIl)
                                 && var50 instanceof Ilol
                                 && (var15 = (Ilol)var50).III0 != 5
                                 && !var15.II01()) {
                                 this.IIll(var39, var23);
                              } else {
                                 if (Ilol.II().IIII == var50 || Ilol.II().II == var50) {
                                    this.IIII(var50);
                                    var47 = true;
                                    break label1165;
                                 }

                                 if (IOlO.l1oI == 51 && var50.equals(Ilol.II().II)) {
                                    this.IIll(var39, var23);
                                 } else {
                                    if (Ilol.II().II != null || Ilol.II().II != null || Ilol.II().II != null || Ilol.II().II() != null) {
                                       var47 = false;
                                       break label1165;
                                    }

                                    Ilol.II().III1(var50);
                                    var50.IOlo();
                                 }
                              }
                           }

                           var47 = false;
                        }

                        this.I10O = var47;
                        this.Il01 = var31;
                        this.IOoO = Io1;
                        this.IOo0 = Io1I;
                        II.IIIo = false;
                     }
                  }
               }
            }

            if (Ilol.II().II != null && Ilol.II().II.II0o()) {
               Ilol.II().II.I0lO();
            }

            if (Ilol.II().II == null) {
               if (Ilol.II().IOIl == 1) {
                  if (II.II[5]) {
                     II.II[5] = false;
                     this.II(false, false);
                  } else if (II.IIII[2]) {
                     if (!Ilol.II().I10l) {
                        boolean var35 = false;
                        if (Ilol.II().I_o_ - Ilol.II().IO00 != 0 || Ilol.II().I_oO - Ilol.II().IO0o != 0) {
                           I_0_.II().IoO();
                        }

                        Ilol.II().I_oo = -10;
                        Ilol.II().I_o0 = 0;
                        Ilol.II().IOIl = 3;
                        Ilol.II().IO = 0;
                     }
                  } else if (II.IIII[4]) {
                     IO_ = false;
                     Ilol.II().I1_I = false;
                     if (Ilol.II().IOI1 == 1) {
                        Ilol.II().IOI1 = -1;
                     } else if (!Ilol.II().I10l) {
                        if (Ilol.II().I_o_ - Ilol.II().IO00 != 0) {
                           I_0_.II().IoO();
                        }

                        Ilol.II().IOIl = 2;
                        Ilol.II().I_o0 = -Ilol.II().IOIo;
                     }

                     Ilol.II().I_IO = false;
                  } else if (II.IIII[6]) {
                     IO_ = false;
                     Ilol.II().I1_I = false;
                     if (Ilol.II().IOI1 == -1) {
                        Ilol.II().IOI1 = 1;
                     } else if (!Ilol.II().I10l) {
                        if (Ilol.II().I_o_ - Ilol.II().IO00 != 0) {
                           I_0_.II().IoO();
                        }

                        Ilol.II().IOIl = 2;
                        Ilol.II().I_o0 = Ilol.II().IOIo;
                     }

                     Ilol.II().I_IO = false;
                  }
               } else if (Ilol.II().IOIl == 2) {
                  if (II.II[5]) {
                     II.II[5] = false;
                     this.II(false, true);
                  } else if (!II.IIII[2]) {
                     if (II.IIII[4]) {
                        IO_ = false;
                        if (Ilol.II().IOI1 == 1) {
                           Ilol.II().IOI1 = -1;
                        } else {
                           Ilol var44 = Ilol.II();
                           int var48 = -Ilol.II().IOIo;
                           Ilol.II();
                           var44.I_o0 = var48;
                        }
                     } else if (II.IIII[6]) {
                        IO_ = false;
                        if (Ilol.II().IOI1 == -1) {
                           Ilol.II().IOI1 = 1;
                        } else {
                           Ilol var45 = Ilol.II();
                           int var49 = Ilol.II().IOIo;
                           Ilol.II();
                           var45.I_o0 = var49;
                        }
                     }
                  } else {
                     if (Ilol.II().I_o_ - Ilol.II().IO00 != 0 || Ilol.II().I_oO - Ilol.II().IO0o != 0) {
                        I_0_.II().IoO();
                     }

                     Ilol.II().I_oo = -10;
                     Ilol.II().IOIl = 3;
                     Ilol.II().IO = 0;
                  }
               } else if (Ilol.II().IOIl == 3) {
                  IO_ = false;
                  if (II.II[5]) {
                     II.II[5] = false;
                     this.II(false, true);
                  }

                  if (!II.IIII[4] && (!II.IIII[1] || this.IIIO != null)) {
                     if (II.IIII[6] || II.IIII[3] && this.IIIO == null) {
                        if (Ilol.II().IOI1 == -1) {
                           Ilol.II().IOI1 = 1;
                        } else {
                           Ilol.II().I_o0 = Ilol.II().IOIo;
                        }
                     }
                  } else if (Ilol.II().IOI1 == 1) {
                     Ilol.II().IOI1 = -1;
                  } else {
                     Ilol.II().I_o0 = -Ilol.II().IOIo;
                  }

                  if ((II.IIII[2] || (II.IIII[1] || II.IIII[3]) && this.IIIO == null)
                     && Ilol.II().I110
                     && Ilol.II().IOl1 > 0
                     && Ilol.II().IO < 8
                     && Ilol.II().I_oo > -4) {
                     Ilol.II().IO++;
                     Ilol.II().I_oo = -7;
                  }
               } else if (Ilol.II().IOIl == 4) {
                  if (II.II[5]) {
                     II.II[5] = false;
                     this.II(false, true);
                  }

                  if (II.IIII[2] && Ilol.II().IOl1 > 0 && Ilol.II().I110) {
                     IO_ = false;
                     if ((Ilol.II().I_o_ - Ilol.II().IO00 != 0 || Ilol.II().I_oO - Ilol.II().IO0o != 0)
                        && (I_Ol.II1(Ilol.II().I_o_ - Ilol.II().IO00) > 96 || I_Ol.II1(Ilol.II().I_oO - Ilol.II().IO0o) > 24)) {
                        I_0_.II().IoO();
                     }

                     Ilol.II().I_oo = -10;
                     Ilol.II().IOIl = 3;
                     Ilol.II().IO = 0;
                  }

                  if (II.IIII[4]) {
                     IO_ = false;
                     if (Ilol.II().IOI1 == 1) {
                        Ilol.II().IOI1 = -1;
                     } else {
                        Ilol.II().IO++;
                        Ilol.II().I_o0 = -Ilol.II().IOIo;
                        if (Ilol.II().IO > 5 && Ilol.II().I_oo > 6) {
                           Ilol.II().IOIl = 10;
                           Ilol.II().IO = 0;
                           Ilol.II().I_oo = 0;
                        }
                     }
                  } else if (II.IIII[6]) {
                     IO_ = false;
                     if (Ilol.II().IOI1 == -1) {
                        Ilol.II().IOI1 = 1;
                     } else {
                        Ilol.II().IO++;
                        Ilol.II().I_o0 = Ilol.II().IOIo;
                        if (Ilol.II().IO > 5 && Ilol.II().I_oo > 6) {
                           Ilol.II().IOIl = 10;
                           Ilol.II().IO = 0;
                           Ilol.II().I_oo = 0;
                        }
                     }
                  }
               } else if (Ilol.II().IOIl == 10) {
                  if (II.II[5]) {
                     II.II[5] = false;
                     this.II(false, true);
                  }

                  if (Ilol.II().I110 && Ilol.II().IOl1 > 0) {
                     if (!II.IIII[2]) {
                        if (II.IIII[4]) {
                           IO_ = false;
                           if (Ilol.II().IOI1 == 1) {
                              Ilol.II().IOI1 = -1;
                           } else {
                              Ilol.II().I_o0 = -(Ilol.II().IOIo + 1);
                           }
                        } else if (II.IIII[6]) {
                           if (Ilol.II().IOI1 == -1) {
                              Ilol.II().IOI1 = 1;
                           } else {
                              Ilol.II().I_o0 = Ilol.II().IOIo + 1;
                           }
                        }
                     } else {
                        IO_ = false;
                        if ((Ilol.II().I_o_ - Ilol.II().IO00 != 0 || Ilol.II().I_oO - Ilol.II().IO0o != 0)
                           && (I_Ol.II1(Ilol.II().I_o_ - Ilol.II().IO00) > 96 || I_Ol.II1(Ilol.II().I_oO - Ilol.II().IO0o) > 24)) {
                           I_0_.II().IoO();
                        }

                        Ilol.II().I_oo = -10;
                        Ilol.II().IOIl = 3;
                        Ilol.II().IO = 0;
                     }
                  }
               } else if (Ilol.II().IOIl == 7) {
                  if (II.II[5]) {
                     II.II[5] = false;
                  }

                  if (II.IIII[4]) {
                     IO_ = false;
                     if (Ilol.II().IOI1 == 1) {
                        Ilol.II().IOI1 = -1;
                     } else {
                        Ilol.II().I_o0 = -Ilol.II().IOIo + 2;
                     }
                  } else if (II.IIII[6]) {
                     IO_ = false;
                     if (Ilol.II().IOI1 == -1) {
                        Ilol.II().IOI1 = 1;
                     } else {
                        Ilol.II().I_o0 = Ilol.II().IOIo - 2;
                     }
                  }
               }

               if (II.II[8] && II.II_ != 56) {
                  II.II[8] = false;
                  Ilol.II().IOo = 0;
               }

               if (II.II[10]) {
                  II.II[10] = false;
                  this.I0_();
               }

               if (II.II_ != 0) {
                  if (this.IIIO == null) {
                     if (IOI0.III_) {
                        if (II.II_ == 113) {
                           if (III[0] != null) {
                              this.II(III[0], true);
                           }
                        } else if (II.II_ == 119) {
                           if (III[1] != null) {
                              this.II(III[1], true);
                           }
                        } else if (II.II_ == 101) {
                           if (III[2] != null) {
                              this.II(III[2], true);
                           }
                        } else if (II.II_ == 114) {
                           if (III[3] != null) {
                              this.II(III[3], true);
                           }
                        } else if (II.II_ == 116) {
                           if (III[4] != null) {
                              this.II(III[4], true);
                           }
                        } else if (II.II_ != 50 && II.II_ != 53) {
                           Ilo_.II().II(II.II_, this, "");
                        }
                     } else if (!II.III) {
                        Ilo_.II().II(II.II_, this, "");
                     } else if (II.II_ == 55) {
                        if (III[0] != null) {
                           this.II(III[0], true);
                        }
                     } else if (II.II_ == 56) {
                        if (III[1] != null) {
                           this.II(III[1], true);
                        }
                     } else if (II.II_ == 57) {
                        if (III[2] != null) {
                           this.II(III[2], true);
                        }
                     } else if (II.II_ == 49) {
                        if (III[3] != null) {
                           this.II(III[3], true);
                        }
                     } else if (II.II_ == 51) {
                        if (III[4] != null) {
                           this.II(III[4], true);
                        }
                     } else if (II.II_ == 48) {
                        Ilo_.II().II1o("");
                     } else if (!IlI.III().III0(II.II_)) {
                     }
                  } else {
                     char[] var29 = this.IlII.toCharArray();
                     I_lO var19 = new I_lO("");

                     for (int var40 = 0; var40 < var29.length; var40++) {
                        var19.addElement(String.valueOf(var29[var40]));
                     }

                     var19.removeElementAt(0);
                     String var46;
                     if ((var46 = String.valueOf((char)II.II_)).equals("") || var46 == null || var46.equals(IllI("荱", 33659))) {
                        var46 = IllI("荖", 33659);
                     }

                     var19.insertElementAt(var46, var19.size());
                     this.IlII = "";

                     for (int var18 = 0; var18 < var19.size(); var18++) {
                        this.IlII = this.IlII + ((String)var19.elementAt(var18)).toUpperCase();
                     }

                     I_0_.II().II((char)II.II_);
                  }

                  II.II_ = 0;
               }

               II.IIIl();
            }
         }
      }
   }

   private I1_O II(int var1, int var2) {
      I1_O var3 = null;
      int var4 = 0;
      I_lO[] var5 = new I_lO[]{IIO, IIOI, II_0, II_O};

      for (int var6 = 0; var6 < var5.length; var6++) {
         for (int var7 = 0; var7 < var5[var6].size(); var7++) {
            I1_O var8;
            I_I_ var9;
            if (!(var8 = (I1_O)var5[var6].elementAt(var7)).IIOl() && (!(var8 instanceof I_I_) || !(var9 = (I_I_)var8).I0I1 || !var9.equals(Ilol.II().IIIl))) {
               int var10 = var8.IIlo();
               int var11 = var8.II1();
               int var12 = var8.II1l();
               int var13 = var8.II1I();
               if (II(var1, var2, var10 - var12 / 2 - 30, var11 - var13 - 30, var12 + 60, var13 + 60)) {
                  if (var3 == null) {
                     var3 = var8;
                     var4 = I_Ol.II1(var1 - var10) + I_Ol.II1(var2 - var11);
                     if (var6 == 1) {
                        return var8;
                     }
                  } else if ((var10 = I_Ol.II1(var1 - var10) + I_Ol.II1(var2 - var11)) < var4) {
                     var3 = var8;
                     var4 = var10;
                  }
               }
            }
         }
      }

      return var3;
   }

   private static boolean II(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5;
   }

   private boolean II(I1_O var1) {
      if (var1 == null) {
         return false;
      }

      int var2 = var1.II1();
      int var3 = Ilol.II().I_oO;
      if (var2 < var3) {
         while (var2 < var3) {
            var3 -= 5;
            if (IOlO.IIIl(Ilol.II().I_o_, var3, 8192)) {
               this.Io0_ = 0;
               Ilol.II();
               Ilol.II().II = null;
               return true;
            }
         }
      }

      return false;
   }

   public void IIII(I1_O var1) {
      if ((var1.equals(Ilol.II().II) || this.IIIO == null) && !this.II(var1)) {
         boolean var2 = false;
         if (var1 != null && this.I01_ <= 0) {
            this.I01_ = 10;
            int var3 = var1.IIlo();
            byte var4;
            if ((var3 = I_Ol.II1(Ilol.II().I_o_ - var3)) <= 80) {
               var4 = 1;
            } else if (var3 > 80 && var3 <= 200) {
               var4 = 2;
            } else if (var3 > 200 && var3 <= 400) {
               var4 = 3;
            } else {
               var4 = 4;
            }

            if (!var1.equals(Ilol.II().IIII) && (!var1.equals(Ilol.II().IIIl) || !Ilol.II().IIIO(Ilol.II().IIIl))) {
               if (var1.equals(Ilol.II().II) || var1.equals(Ilol.II().II) || var1.equals(Ilol.II().IIIl)) {
                  I_0.III(136, var1.IIlo(), var1.II1(), var4);
               }
            } else {
               I_0.III(135, var1.IIlo(), var1.II1(), var4);
            }
         }

         Ilol.II();
         Ilol.II().II = null;
         Ilol.II().I_o0 = Ilol.II().I_oo = 0;
         var1.IOlo();
         this.Io0_ = 10;
         if (var1 instanceof I_I_) {
            II0l.III().Ilo0();
         }

         this.II(false, true);
         this.IOol = var1.IIlo();
         this.IOo_ = var1.II1();
         this.I10o = false;
         this.IOl0 = true;
      }
   }

   private boolean IIII(int var1, int var2) {
      if (this.equals(III) && II().II != null) {
         return false;
      }

      if (III.III.II != null && III.III.II.IIll != null) {
         int var3 = I_Ol.II1(III.Io1) + III.III.IIOl - 40;
         int var4 = I_Ol.II1(III.Io1I) + III.III.IIlI;
         if (II(var1 - Io1, var2 - Io1I, var3, var4, 200, III.III.IIO_)) {
            boolean var5 = true;
            III.IIOl = 10;
            return true;
         }
      }

      return false;
   }

   private boolean IIIl(int var1, int var2) {
      for (int var3 = 0; var3 < I__O.IlI.size(); var3++) {
         I__O var4 = (I__O)I__O.IlI.elementAt(var3);
         if (II(var1, var2, var4.I_o_, var4.I_oO, var4.IO1l, var4.IO11)) {
            if (var4.I_oO <= 24 && IOlO.Illl() && Ilol.II().III0 != 0) {
               return false;
            }

            if (var4.I0_I) {
               var4.IIO(10);
               return true;
            }
         }
      }

      return false;
   }

   private void IIll(int var1, int var2) {
      if (!II.III()) {
         Ilol.II();
         if (var1 < IOlO.l100 && var1 > IOlO.l100 - 32) {
            Ilol.II().II = new I_ll(IOlO.l100, var2);
         } else if (var1 < 32 && var1 > 0) {
            Ilol.II().II = new I_ll(0, var2);
         } else {
            this.IOol = var1;
            this.IOo_ = var2;
            this.I10o = false;
            Ilol.II().IOo = 0;
            var1 = Ilol.II().I110 && Ilol.II().IOl1 > 0 ? 0 : 1000;
            if (this.IOo_ <= Ilol.II().I_oO || I_Ol.II1(this.IOol - Ilol.II().I_o_) >= 12) {
               for (byte var4 = 0; var4 < var1 + 60 && this.IOo_ + var4 < IOlO.l10o - 24; var4 += 24) {
                  if (IOlO.IIIl(this.IOol, this.IOo_ + var4, 2)) {
                     this.IOo_ = IOlO.II1I(this.IOo_ + var4);
                     this.I10o = true;
                     break;
                  }
               }

               for (byte var5 = 0; var5 < var1 + 40; var5 += 24) {
                  if (IOlO.IIIl(this.IOol, this.IOo_ - var5, 2)) {
                     this.IOo_ = IOlO.II1I(this.IOo_ - var5);
                     this.I10o = true;
                     break;
                  }
               }

               this.IOl0 = true;
               Ilol.II().IOo = 0;
               if (!this.I10o && this.IOo_ < Ilol.II().I_oO - 50) {
                  Ilol.II().IOo = 20;
               }

               this.Io0_ = 0;
               if (Ilol.II().I_IO) {
                  Ilol.II().I0II();
               }

               Ilol.II().II = new I_ll(this.IOol, this.IOo_);
               Ilol.II().IOI1 = Ilol.II().I_o_ - Ilol.II().II.lI0 > 0 ? -1 : 1;
               Ilol.II().III = null;
               IO_ = false;
               II0l.III().Iloo();
            }
         }
      }
   }

   public void I0_() {
      long var1;
      if (!Ilol.II().I_l0 && !Ilol.II().I_l1 && Ilol.II().I0OI <= 0 && (var1 = System.currentTimeMillis()) - this.Il0O >= 10000L) {
         if (!Ilol.II().II0_()) {
            II.IIII(IO11.I10O, 0);
         } else {
            I_0.II(11, Ilol.II(), 5);
            I_0.II(104, Ilol.II(), 4);
            this.Il0O = var1;
            IO.II();
         }
      }
   }

   public void IIl(int var1, int var2) {
      if (!this.IO10) {
         IO.II();
         I_Ol.II__(IllI("茺菙菭莑莡葓萕萇萦蓂蓴蒂蓏蕞蕢蔛蔮藘", 33659));
         this.IO10 = true;
         this.I0Io = 0;
         this.I0ll = 0;
         this.I0l = var1 - Io1;
         this.I0lI = var2 - Io1I;
      }
   }

   public void IIll(boolean var1) {
      this.I1_1 = true;
      this.IO1I = true;
      this.IO1o = true;
      if (var1) {
         I1lI.III(new I1ll(20, Ilol.II().I_o_, Ilol.II().I_oO - 77, 2, 8, 1));
      }
   }

   public void I0_I() {
      this.I1_1 = false;
      this.IO1I = true;
      this.IO1o = false;
   }

   public void I0_l() {
      this.IO1l = true;
      this.IooI = IO1l.II(0.4F, 0, II.IIIo[II.IIIo.length - 1]);
   }

   public void IIl1(int var1, int var2) {
      I_Ol.II__(IllI("茭菟莙莊莸葘葲葴萧蓚蓰蒞蓏蕁蔍蔚蔢薪藽薚薮蘦虝虹虃", 33659) + var1 + IllI("荛菣莄", 33659) + var2);
      this.I0_l();
      this.IO1O = true;
      I1lI.III(new I1ll(this.IO11 ? 25 : 17, var1, var2 - 77, 2, -1, 1));
   }

   private void II(boolean var1, boolean var2) {
      if (Ilol.II().IIIl != null && Ilol.II().IIIl.I_oO >= Ilol.II().I_oO + 48 && IOlO.IIIl(Ilol.II().I_o_, Ilol.II().I_oO, 2)) {
         this.Io0_ = 0;
         Ilol.II().II = null;
         Ilol.I10 = false;
         Ilol.II().I10l = false;
      } else {
         I_Ol.II__(IllI("茟菵莙莾莞葤葐", 33659));
         I0l_++;
         IO1 var3 = Ilol.II().III();
         IO1 var4 = Ilol.II().IIII();
         if (var2 || var3 == null || Ilol.II().IIII != null && (Ilol.II().IIII == null || Ilol.II().IIII.I1ll != 0)) {
            if (var2 || var4 == null || Ilol.II().IIII != null && (Ilol.II().IIII == null || Ilol.II().IIII.I1ll != 0)) {
               if ((IOlO.l1oI != 51 || Ilol.II().II == null) && Ilol.II().IOIl != 14) {
                  Ilol.II().I_o0 = Ilol.II().I_oo = 0;
                  if (Ilol.II().IIOO() && Ilol.II().II00()) {
                     if (this.II0I()) {
                        Ilol.II();
                        Ilol.II();
                        Ilol.IO0o();
                     }
                  } else {
                     boolean var5;
                     if (this.II(Ilol.II().IIIl)) {
                        var5 = false;
                     } else if (this.II(Ilol.II().IIII)) {
                        var5 = false;
                     } else if (this.II(Ilol.II().II)) {
                        var5 = false;
                     } else if (Ilo_.II().I_10) {
                        var5 = false;
                     } else {
                        label422: {
                           if (!I1OO.I1l1) {
                              Ilol.II();
                              if (!Ilol.I10) {
                                 if (Ilol.II().II != null && Ilol.II().II.II.IlIO == 6 && Ilol.II().II != null) {
                                    this.IOol();
                                    var5 = false;
                                 } else if (Ilol.II().II != null && Ilol.II().II.II.IoI_ == 2 && Ilol.II().II == null && Ilol.II().II.II.IlIO != 6) {
                                    var5 = this.II0I();
                                 } else if (Ilol.II().II == null
                                    && (Ilol.II().IIII != null || Ilol.II().II != null || Ilol.II().IIIl != null || Ilol.II().II != null)) {
                                    label390:
                                    if (Ilol.II().IIII != null) {
                                       if (Ilol.II().IIII.Il() && Ilol.II().IIII.status == 4) {
                                          Ilol.II().IIII = null;
                                          Ilol.II().II = null;
                                       }

                                       IO_ = true;
                                       if (!IIIl(Ilol.II().IIII)) {
                                          var5 = false;
                                          break label422;
                                       }

                                       if (this.IIIO != null) {
                                          var5 = false;
                                          break label422;
                                       }

                                       if (Ilol.II().II == null) {
                                          var5 = false;
                                          break label422;
                                       }

                                       if (Ilol.II().IIOO()) {
                                          var5 = false;
                                          break label422;
                                       }

                                       int var16 = -1;
                                       int var21 = I_Ol.II1(Ilol.II().I_o_ - Io1) * IO1l.l_I0;
                                       if (Ilol.II().IIIl != null) {
                                          var16 = I_Ol.II1(Ilol.II().I_o_ - Ilol.II().IIIl.I_o_) * IO1l.l_I0;
                                       } else if (Ilol.II().IIII != null) {
                                          var16 = I_Ol.II1(Ilol.II().I_o_ - Ilol.II().IIII.I1) * IO1l.l_I0;
                                       }

                                       if (Ilol.II().IIII.status != 1
                                          && Ilol.II().IIII.status != 0
                                          && Ilol.II().II.II.IoI_ != 4
                                          && var16 != -1
                                          && var16 <= var21) {
                                          if (!this.II0I()) {
                                             var5 = false;
                                             break label422;
                                          }

                                          if (Ilol.II().I_o_ < Ilol.II().IIII.IIlo()) {
                                             Ilol.II().IOI1 = 1;
                                          } else {
                                             Ilol.II().IOI1 = -1;
                                          }

                                          int var20 = Math.abs(Ilol.II().I_o_ - Ilol.II().IIII.IIlo());
                                          var21 = Math.abs(Ilol.II().I_oO - Ilol.II().IIII.II1());
                                          Ilol.II().I_o0 = 0;
                                          if (var20 <= Ilol.II().II.l1_0 && var21 <= Ilol.II().II.l1_o) {
                                             if (Ilol.II().II.II.IlIO != 20) {
                                                if (var21 > var20 && I_Ol.II1(Ilol.II().I_oO - Ilol.II().IIII.II1()) > 30 && Ilol.II().IIII.II().II0l == 4) {
                                                   Ilol.II().II = new I_ll(Ilol.II().I_o_ + Ilol.II().IOI1, Ilol.II().IIII.II1());
                                                   Ilol.II().III = new I1Il((String)null, (I1_1)null, 8002, null);
                                                   II.III1();
                                                   II.IIIl();
                                                   var5 = false;
                                                   break label422;
                                                }

                                                byte var24 = 20;
                                                var2 = false;
                                                if (Ilol.II().IIII instanceof Ilo || Ilol.II().IIII instanceof IloI) {
                                                   var2 = true;
                                                }

                                                if (Ilol.II().II.l1_0 > 100) {
                                                   var24 = 60;
                                                   if (var20 < 20) {
                                                      Ilol.II().II(Ilol.II().I_o_, Ilol.II().I_oO, 10);
                                                   }
                                                }

                                                I_Ol.II__(IllI("茟菮莄菸", 33659) + var24);
                                                boolean var23 = false;
                                                if ((IOlO.IIl(Ilol.II().I_o_, Ilol.II().I_oO + 3) & 2) == 2) {
                                                   int var25 = Ilol.II().I_o_ > Ilol.II().IIII.IIlo() ? 1 : -1;
                                                   if ((IOlO.IIl(Ilol.II().IIII.IIlo() + var24 * var25, Ilol.II().I_oO + 3) & 2) != 2) {
                                                      var23 = true;
                                                   }
                                                }

                                                if (var20 <= var24 && !var23) {
                                                   if (Ilol.II().I_o_ > Ilol.II().IIII.IIlo()) {
                                                      Ilol.II().I_o_ = Ilol.II().IIII.IIlo() + var24 + (var2 ? 30 : 0);
                                                      Ilol.II().IOI1 = -1;
                                                   } else {
                                                      Ilol.II().I_o_ = Ilol.II().IIII.IIlo() - var24 - (var2 ? 30 : 0);
                                                      Ilol.II().IOI1 = 1;
                                                   }

                                                   I_0_.II().IoO();
                                                }

                                                II.III1();
                                                II.IIIl();
                                             }
                                             break label390;
                                          }

                                          boolean var12 = false;
                                          if (Ilol.II().IIII instanceof Ilo || Ilol.II().IIII instanceof IloI) {
                                             var12 = true;
                                          }

                                          var16 = (Ilol.II().II.l1_0 - (var12 ? 50 : 20)) * (Ilol.II().I_o_ > Ilol.II().IIII.IIlo() ? 1 : -1);
                                          if (var20 <= Ilol.II().II.l1_0) {
                                             var16 = 0;
                                          }

                                          Ilol.II().II = new I_ll(Ilol.II().IIII.IIlo() + var16, Ilol.II().IIII.II1());
                                          Ilol.II().III = new I1Il((String)null, (I1_1)null, 8002, null);
                                          II.III1();
                                          II.IIIl();
                                          var5 = false;
                                          break label422;
                                       }

                                       if (Ilol.II().II.II.IoI_ == 4) {
                                          if (Ilol.II().IIII.I1 < Ilol.II().I_o_) {
                                             Ilol.II().IOI1 = -1;
                                          } else {
                                             Ilol.II().IOI1 = 1;
                                          }

                                          this.II(Ilol.II().II, true);
                                       }

                                       var5 = false;
                                       break label422;
                                    } else {
                                       if (Ilol.II().II != null) {
                                          if (Ilol.II().II.IOIo) {
                                             var5 = false;
                                          } else {
                                             if (Ilol.II().I_o_ < Ilol.II().II.I_o_) {
                                                Ilol.II().IOI1 = 1;
                                             } else {
                                                Ilol.II().IOI1 = -1;
                                             }

                                             if (Ilol.II().I_o_ < Ilol.II().II.I_o_) {
                                                Ilol.II().II.IOI1 = -1;
                                             } else {
                                                Ilol.II().II.IOI1 = 1;
                                             }

                                             int var15 = Math.abs(Ilol.II().I_o_ - Ilol.II().II.I_o_);
                                             if (Math.abs(Ilol.II().I_oO - Ilol.II().II.I_oO) > 40) {
                                                Ilol.II().I_oO = Ilol.II().II.I_oO - 40;
                                             }

                                             if (var15 < 60) {
                                                II.III1();
                                                II.IIIl();
                                                if (this.IoOI == 0) {
                                                   if (Ilol.II().II != null && Ilol.II().II.II01 == 0) {
                                                      if (Ilol.II().II.l10l < 4 && Ilol.II().II.II.lll0 == 4) {
                                                         var5 = false;
                                                         break label422;
                                                      }

                                                      if (Ilol.II().II.l10l < 3 && Ilol.II().II.II.lll0 == 3) {
                                                         var5 = false;
                                                         break label422;
                                                      }
                                                   }

                                                   this.IoOI = 50;
                                                   I1OO.IIl1();
                                                   I_0_.II().IoO();
                                                   I_0_.II().IIoI(Ilol.II().II.II.lll0);
                                                }
                                             } else {
                                                int var19 = (20 + I_Ol.III.nextInt(20)) * (Ilol.II().I_o_ > Ilol.II().II.I_o_ ? 1 : -1);
                                                Ilol.II().II = new I_ll(Ilol.II().II.I_o_ + var19, Ilol.II().I_oO);
                                                Ilol.II().III = new I1Il((String)null, (I1_1)null, 8002, null);
                                                II.III1();
                                                II.IIIl();
                                             }

                                             var5 = false;
                                          }
                                          break label422;
                                       }

                                       if (Ilol.II().IIIl != null) {
                                          if (this.IIIO != null) {
                                             var5 = false;
                                             break label422;
                                          }

                                          if (Ilol.II().I_o_ < Ilol.II().IIIl.I_o_) {
                                             Ilol.II().IOI1 = 1;
                                          } else {
                                             Ilol.II().IOI1 = -1;
                                          }

                                          int var6 = Math.abs(Ilol.II().I_o_ - Ilol.II().IIIl.I_o_);
                                          int var8 = Math.abs(Ilol.II().I_oO - Ilol.II().IIIl.I_oO);
                                          if (!Ilol.II().IIIO(Ilol.II().IIIl) && !Ilol.II().IIOo()) {
                                             if (var6 < 60 && var8 < 40) {
                                                Ilol.II();
                                                this.IOoI();
                                                if (!II.IIIl && Ilol.II().IIIl.IOI_ >= 0 && IOlO.l1oI != 51 && IOlO.l1oI != 52 && this.II == null) {
                                                   II.II.III_(Ilol.II().IIIl);
                                                   II.II.I__0();
                                                   I_0_.II().II01(Ilol.II().IIIl.IOI_);
                                                   I_0_.II().IlI0(Ilol.II().IIIl.IOI_);
                                                }
                                             } else {
                                                int var18 = (20 + I_Ol.III.nextInt(20)) * (Ilol.II().I_o_ > Ilol.II().IIIl.I_o_ ? 1 : -1);
                                                Ilol.II().II = new I_ll(Ilol.II().IIIl.I_o_ + var18, Ilol.II().IIIl.I_oO);
                                                Ilol.II().III = new I1Il((String)null, (I1_1)null, 8002, null);
                                                II.III1();
                                                II.IIIl();
                                             }

                                             var5 = false;
                                             break label422;
                                          }

                                          if (Ilol.II().II == null) {
                                             var5 = false;
                                             break label422;
                                          }

                                          if (!this.II0I()) {
                                             var5 = false;
                                             break label422;
                                          }

                                          if (Ilol.II().I_o_ < Ilol.II().IIIl.I_o_) {
                                             Ilol.II().IOI1 = 1;
                                          } else {
                                             Ilol.II().IOI1 = -1;
                                          }

                                          Ilol.II().I_o0 = 0;
                                          if (var6 > Ilol.II().II.l1_0 || var8 > Ilol.II().II.l1_o) {
                                             int var7 = (Ilol.II().II.l1_0 - 20) * (Ilol.II().I_o_ > Ilol.II().IIIl.I_o_ ? 1 : -1);
                                             if (var6 <= Ilol.II().II.l1_0) {
                                                var7 = 0;
                                             }

                                             Ilol.II().II = new I_ll(Ilol.II().IIIl.I_o_ + var7, Ilol.II().IIIl.I_oO);
                                             Ilol.II().III = new I1Il((String)null, (I1_1)null, 8002, null);
                                             II.III1();
                                             II.IIIl();
                                             var5 = false;
                                             break label422;
                                          }

                                          if (Ilol.II().II.II.IlIO != 20) {
                                             byte var10 = 20;
                                             if (Ilol.II().II.l1_0 > 60) {
                                                var10 = 60;
                                                if (var6 < 20) {
                                                   Ilol.II().II(Ilol.II().I_o_, Ilol.II().I_oO, 10);
                                                }
                                             }

                                             boolean var9 = false;
                                             if ((IOlO.IIl(Ilol.II().I_o_, Ilol.II().I_oO + 3) & 2) == 2) {
                                                int var11 = Ilol.II().I_o_ > Ilol.II().IIIl.I_o_ ? 1 : -1;
                                                if ((IOlO.IIl(Ilol.II().IIIl.I_o_ + var10 * var11, Ilol.II().I_oO + 3) & 2) != 2) {
                                                   var9 = true;
                                                }
                                             }

                                             if (var6 <= var10 && !var9) {
                                                if (Ilol.II().I_o_ > Ilol.II().IIIl.I_o_) {
                                                   Ilol.II().I_o_ = Ilol.II().IIIl.I_o_ + var10;
                                                   Ilol.II().IOI1 = -1;
                                                } else {
                                                   Ilol.II().I_o_ = Ilol.II().IIIl.I_o_ - var10;
                                                   Ilol.II().IOI1 = 1;
                                                }

                                                I_0_.II().IoO();
                                             }

                                             II.III1();
                                             II.IIIl();
                                          }
                                       } else if (Ilol.II().II != null) {
                                          this.IOol();
                                          var5 = false;
                                          break label422;
                                       }
                                    }

                                    var5 = true;
                                 } else {
                                    var5 = false;
                                 }
                                 break label422;
                              }
                           }

                           var5 = false;
                        }
                     }

                     if (var5) {
                        if (!Ilol.II().II0() || !Ilol.II().II00()) {
                           var1 = IOlO.IIIl(Ilol.II().I_o_, Ilol.II().I_oO, 2);
                           Ilol.II().II(II[Ilol.II().II.II0I], var1 ? 0 : 1);
                           if (var1) {
                              Ilol.II().IOo = 20;
                           }

                           Ilol.II();
                        } else if (this.II0I()) {
                           Ilol.II();
                           Ilol.II().IOo();
                        } else {
                           Ilol.II().IO1_();
                        }
                     }
                  }

                  if (Ilol.II().IIOo()) {
                     this.Io0_ = 0;
                  }
               }
            } else {
               var4.III.II_I.I0lO();
            }
         } else {
            var3.III.II_I.I0lO();
         }
      }
   }

   private void IOol() {
      if (Ilol.II().II != null) {
         if (Ilol.II().I_o_ < Ilol.II().II.I1) {
            Ilol.II().IOI1 = 1;
         } else {
            Ilol.II().IOI1 = -1;
         }

         int var1 = Math.abs(Ilol.II().I_o_ - Ilol.II().II.I1);
         int var2 = Math.abs(Ilol.II().I_oO - Ilol.II().II.I1I);
         if (var1 <= 40 && var2 < 40) {
            II.III1();
            II.IIIl();
            if (Ilol.II().II.II.II__ != 673) {
               I_0_.II().IIo1(Ilol.II().II.lI0l);
               return;
            }

            I_11 var3 = new I_11(5, 0, -100, 100, 5, II.III1[Ilol.II().IOIO][2]);
            I_Ol.II__(Ilol.II().II != null ? IllI("荚菴菌莴莛", 33659) : IllI("茕華菕莴", 33659));
            String var4 = IO11.I1Ol;
            String[] var5 = new String[]{IO11.I_I_, IO11.I_IO};
            I_Ol.II__(Ilol.II().II != null ? IllI("荚菴菌莴莛", 33659) : IllI("茕華菕莴", 33659));
            var3.lIo0 = 673;
            II();
            II(var5, var3);
            Ilo1.II(var4, 100000, var3, 5820);
            return;
         }

         Ilol.II().II = new I_ll(Ilol.II().II.I1, Ilol.II().II.I1I);
         Ilol.II().III = new I1Il((String)null, (I1_1)null, 8002, null);
         II.III1();
         II.IIIl();
      }
   }

   public boolean IIol() {
      return Ilol.II().I1ol || Ilol.II().I1oI || Ilol.II().I1o1 || Ilol.II().I_I1 || this.IO10;
   }

   public void II(I_0o var1, boolean var2) {
      if (!Ilol.II().I1o && !this.IIol() && Ilol.II().II.II01 > 1) {
         Ilol.II().II = var1;
         if (this.III != var1 && this.III != null) {
            I_0_.II().IIo(var1.II.IlIO);
            this.I01o();
            this.III = var1;
            this.I0lo = -1;
            II().Io0_ = 0;
         } else if (Ilol.II().IIO0()) {
            I_Ol.II__(IllI("荅莤莇莭莄葳萕萧萘蓻蓝蒼蓏蕽蕝蔩蔈薰薉", 33659) + var1.II.IlIO);
            Ilol.II().IIII(var1.II.IlIO);
            this.I01o();
            this.III = var1;
            this.I0lo = -1;
            II().Io0_ = 0;
         } else if (Ilol.II().IIOO()) {
            I_Ol.II__(IllI("茎菩菜菸莄葽葜萸萟蒲蓟蒿蒛蔮蕋蔣蔈藿藚", 33659));
            this.III(var1);
            this.III = var1;
         } else {
            this.I0lo = -1;
            if (var1 != null) {
               I_Ol.II__(IllI("茔菴菕莡菗葥葐萸萖蓱蓅蓰蒜蕥蕄蔠蔇", 33659));
               if (this.III != var1) {
                  I_0_.II().IIo(var1.II.IlIO);
                  this.I01o();
               }

               if (Ilol.II().IIIl == null && Ilol.II().IIOo()) {
                  I_Ol.II__(IllI("茉菿菍莭莅葸萕萻葓蓶蓐蒩", 33659));
                  return;
               }

               if (Ilol.II().II00()) {
                  this.II(true, true);
               }

               this.III = var1;
            }
         }
      }
   }

   private void III(I_0o var1, boolean var2) {
      if (IOlO.l1oI != 112 && IOlO.l1oI != 113 || Ilol.II().III0 != 0) {
         if (Ilol.II().IIOO()) {
            this.III(var1);
         } else {
            this.I0lo = -1;
            if (var1 != null) {
               I_0_.II().IIo(var1.II.IlIO);
               this.I01o();
               Ilol.II().II = var1;
               this.II(var2, true);
            }
         }
      }
   }

   private void III(I_0o var1) {
      if ((IOlO.l1oI != 112 && IOlO.l1oI != 113 || Ilol.II().III0 != 0) && this.II0I()) {
         this.I0lo = -1;
         if (var1 != null) {
            I_0_.II().IIo(var1.II.IlIO);
            this.I01o();
            Ilol.II().II = var1;
            Ilol.II();
            Ilol.IO0o();
            Ilol.II();
            this.Io0_ = 0;
         }
      }
   }

   public static void I0_1() {
      for (int var0 = 0; var0 < Ilol.II().IIlI.size() - 1; var0++) {
         I_0o var1 = (I_0o)Ilol.II().IIlI.elementAt(var0);

         for (int var2 = var0 + 1; var2 < Ilol.II().IIlI.size(); var2++) {
            I_0o var3;
            if ((var3 = (I_0o)Ilol.II().IIlI.elementAt(var2)).II.IlIO < var1.II.IlIO) {
               I_0o var4 = var3;
               var3 = var1;
               var1 = var4;
               Ilol.II().IIlI.setElementAt(var4, var0);
               Ilol.II().IIlI.setElementAt(var3, var2);
            }
         }
      }
   }

   @Override
   public void IIlO() {
      if (II.IIIO % 100 == 0 && IOlO.l1oI == 137) {
         lII1 = 30;
      }

      I1_I var1 = this;
      if (this.lI_0 != 0) {
         if ((IloI = System.currentTimeMillis()) - Ilo > 1000L) {
            Ilo = System.currentTimeMillis();
            lII++;
         }

         if (lII > 20) {
            for (int var2 = 0; var2 < var1.I1.length; var2++) {
               var1.I1I[var2] = var1.I1[var2];
            }

            var1.lI_0--;
            if (var1.lI_0 == 0) {
               var1.IlIl = "";
               II.IIII(var1.II0l, 0);
               lII = 0;
            }
         } else if (this.lI_O > this.I1.length - 1) {
            this.lI_0--;
            if (this.lI_0 == 0) {
               this.IlIl = "";
               II.IIII(this.II0l, 0);
            }
         } else {
            if (this.lI_O < this.I1I.length) {
               if (this.I1II[this.lI_O] == 15) {
                  if (this.I1I[this.lI_O] == this.I1[this.lI_O] - 1) {
                     this.I1I1[this.lI_O] = 10;
                  }

                  if (this.I1I[this.lI_O] == this.I1[this.lI_O]) {
                     this.I1II[this.lI_O] = -1;
                     this.lI_O++;
                  }
               } else if (II.IIIO % 5 == 0) {
                  this.I1II[this.lI_O]++;
               }
            }

            for (int var9 = 0; var9 < var1.I1.length; var9++) {
               if (var1.I1II[var9] != -1) {
                  var1.I1Il[var9]++;
                  if (var1.I1Il[var9] > var1.I1II[var9] + var1.I1I1[var9]) {
                     var1.I1Il[var9] = 0;
                     var1.I1I[var9]++;
                     if (var1.I1I[var9] >= 10) {
                        var1.I1I[var9] = 0;
                     }
                  }
               }
            }
         }
      }

      this.IoO_++;
      if (this.IoO_ == 100) {
         this.IoO_ = 0;
      }

      try {
         if (I1o_.IO0_) {
            I1o_.IO0_ = false;
         }

         if (I1Oo == 1) {
            Il00 = System.currentTimeMillis();
         }

         if (I1Oo == 100) {
            I1Oo = 0;
            int var4 = (int)((Il0o = System.currentTimeMillis()) - Il00) / 1000;
            I_0_.II().II00(var4);
         }

         if (Ioll > 0 && --Ioll == 0) {
            I1I1.I___ = false;
         }

         if (!I_1o) {
            if (Io1 != Io10 || Io1I != Io1o) {
               Io1_ = Io10 - Io1 << 2;
               Io1O = Io1o - Io1I << 2;
               Io1l = Io1l + Io1_;
               Io1 = Io1 + (Io1l >> 4);
               Io1l &= 15;
               Io11 = Io11 + Io1O;
               Io1I = Io1I + (Io11 >> 4);
               Io11 &= 15;
               if (Io1 < 24) {
                  Io1 = 24;
               }

               if (Io1 > Io_) {
                  Io1 = Io_;
               }

               if (Io1I < 0) {
                  Io1I = 0;
               }

               if (Io1I > Io_I) {
                  Io1I = Io_I;
               }
            }

            if ((Io_l = Io1 / IOlO.IlI0 - 1) < 0) {
               Io_l = 0;
            }

            Io_1 = Io1I / IOlO.IlI0;
            Io__ = Io_l + Iol1;
            Io_O = Io_1 + Iol_;
            if (Io_1 < 0) {
               Io_1 = 0;
            }

            if (Io_O > IOlO.l10O - 1) {
               Io_O = IOlO.l10O - 1;
            }

            if ((IOlO.I1_O = (Ilol.II().I_o_ - 2 * I_0) / IOlO.IlI0) < 0) {
               IOlO.I1_O = 0;
            }

            if ((IOlO.I1_0 = IOlO.I1_O + IOlO.I1OI) > IOlO.l10_) {
               IOlO.I1_O = (IOlO.I1_0 = IOlO.l10_) - IOlO.I1OI;
            }

            if ((IOlO.I1_o = (Ilol.II().I_oO - 2 * IIO) / IOlO.IlI0) < 0) {
               IOlO.I1_o = 0;
            }

            if ((IOlO.I1O = IOlO.I1_o + IOlO.I1Ol) > IOlO.l10O) {
               IOlO.I1_o = (IOlO.I1O = IOlO.l10O) - IOlO.I1Ol;
            }

            IIII.IOlI();
            III.IOlI();
         }

         Ilo_.II().III();

         for (int var12 = 0; var12 < II_O.size(); var12++) {
            ((Ilol)II_O.elementAt(var12)).IIl1();
         }

         for (int var13 = 0; var13 < IOl1.IlI1.size(); var13++) {
            ((IOl1)IOl1.IlI1.elementAt(var13)).IIl1();
         }

         Ilol.II().IIl1();
         if (Ilol.II().IOIl == 1 && II.IIIO % 100 == 0) {
            System.gc();
         }

         if (this.II != null) {
            this.II.IIl1();
         }

         I1lI.IIl1();

         for (int var14 = 0; var14 < IIO.size(); var14++) {
            ((I_I_)IIO.elementAt(var14)).IIlO();
         }

         for (int var15 = 0; var15 < IIOI.size(); var15++) {
            ((I_11)IIOI.elementAt(var15)).IIl1();
         }

         this.I0l0 = IIII.length;

         for (int var16 = IIII.length - 1; var16 >= 0; var16--) {
            if (IIII[var16] != null) {
               this.I0l0 = var16 + 1;
               break;
            }

            this.I0l0--;
         }

         if (this.I0l0 == 1 && II.IIIl) {
            lIlO = -200;
         } else if (lIlO < 0) {
            I010();
         }

         II.II().IIIo();

         for (int var17 = 0; var17 < 5; var17++) {
            if (Ilo[var17] != -1) {
               if (Ilo[var17] > Il0O[var17]) {
                  Ilol[var17]++;
                  if (Ilol[var17] == 25) {
                     Ilol[var17] = 0;
                     Ilo[var17] = -1;
                     Il0O[var17] = 0;
                     Il00[var17] = 0;
                     Il01[var17] = 0;
                  }
               } else {
                  int[] var5 = Ilo;
                  var5[var17] += I_Ol.II1(Il0o[var17]);
                  var5 = Il01;
                  var5[var17] += Il00[var17];
                  var5 = Il0_;
                  var5[var17] += Il0o[var17];
               }
            }
         }

         I__O.IOlI();

         for (int var18 = 0; var18 < 2; var18++) {
            if (IloO[var18] != -1) {
               IloO[var18]++;
               int[] var30 = Ilo1;
               var30[var18] += Iloo[var18] << 2;
               Ilo_[var18]--;
               if (IloO[var18] >= 6) {
                  IloO[var18] = -1;
               } else {
                  Ilo0[var18] = (IloO[var18] >> 1) % 3;
               }
            }
         }

         if (lI_l != lI_1) {
            lI__ = lI_1 - lI_l << 2;
            I001 = I001 + lI__;
            lI_l = lI_l + (I001 >> 4);
            I001 &= 15;
         }

         if (Math.abs(lI_1 - lI_l) < 15 && lI_l < 0) {
            lI_1 = 0;
         }

         if (Math.abs(lI_1 - lI_l) < 15 && lI_l > 0) {
            lI_1 = 0;
         }

         if (this.I01_ > 0) {
            this.I01_--;
         }

         if (this.IOl0) {
            this.IOl0 = false;
            I1_O var6;
            if ((var6 = this.II(this.IOol, this.IOo_)) == null || var6 != null && var6.equals(Ilol.II().II) && IOlO.l1oI == 51) {
               I_0.III(134, this.IOol, this.IOo_ + II.II10 / 2, 3);
            }
         }

         for (int var19 = 0; var19 < II_0.size(); var19++) {
            ((I10_)II_0.elementAt(var19)).IIl1();
         }

         for (int var20 = I1l1.II1O.size() - 1; var20 >= 0; var20--) {
            I1l1.II1_.removeElement(I1l1.II1O.elementAt(var20));
            I1l1.II1O.removeElementAt(var20);
         }

         for (int var21 = 0; var21 < I1l1.II1_.size(); var21++) {
            ((I1l1)I1l1.II1_.elementAt(var21)).IIlO();
         }

         for (int var22 = 0; var22 < I1l1.II10.size(); var22++) {
            ((I1l1)I1l1.II10.elementAt(var22)).IIlO();
         }

         for (int var23 = 0; var23 < I1l1.II1o.size(); var23++) {
            ((I1l1)I1l1.II1o.elementAt(var23)).IIlO();
         }

         for (int var24 = 0; var24 < I1l1.II_.size(); var24++) {
            ((I1l1)I1l1.II_.elementAt(var24)).IIlO();
         }

         for (int var25 = 0; var25 < I1l1.II11.size(); var25++) {
            ((I1l1)I1l1.II11.elementAt(var25)).IIlO();
         }

         Il0O.III();
         II.IIlO();
         III.IIlO();
         if (IIlI != null && !IIlI.equals(Ilol.II())) {
            IIlI.IIl1();
         }

         this.lIII++;
         if (this.lIII > 3) {
            this.lIII = 0;
         }

         if (this.IO_0) {
            this.lI1l++;
            if (this.lI1l == 20) {
               this.lI1l = 0;
               this.IO_0 = false;
            }
         } else if (this.lI1I > Ilol.II().IOl_) {
            int var10;
            if ((var10 = this.lI1I - Ilol.II().IOl_ >> 1) <= 0) {
               var10 = 1;
            }

            this.lI1I -= var10;
         } else {
            this.lI1I = Ilol.II().IOl_;
         }

         if (this.IO_O) {
            this.lI1++;
            if (this.lI1 == 20) {
               this.lI1 = 0;
               this.IO_O = false;
            }
         } else if (this.lIlo > Ilol.II().IOl1) {
            int var11;
            if ((var11 = this.lIlo - Ilol.II().IOl1 >> 1) <= 0) {
               var11 = 1;
            }

            this.lIlo -= var11;
         } else {
            this.lIlo = Ilol.II().IOl1;
         }

         if (this.IoOI > 0) {
            this.IoOI--;
         }

         if (this.IO1_) {
            this.Io00++;
            boolean var31 = false;

            for (int var7 = 0; var7 < I1lI.IIIO.size(); var7++) {
               if (((I1ll)I1lI.IIIO.elementAt(var7)).II0I == 20) {
                  var31 = true;
               }
            }

            if (this.Io00 > 3 && !var31 || this.Io00 > 240) {
               this.IO1_ = false;
               this.IIl1(this.Io0o, this.Ioo);
            }
         }

         if (this.IIo1() || this.IO1O) {
            while (this.Ioo1 - 100 < Io1I) {
               Io1I--;
            }
         }

         for (int var26 = 0; var26 < Ilol.II.size(); var26++) {
            ((I1ol)Ilol.II.elementAt(var26)).IIlO();
         }

         for (int var27 = 0; var27 < IIO1.size(); var27++) {
            ((I1ol)IIO1.elementAt(var27)).IIlO();
         }

         if (this.IOOl) {
            this.lI_o -= 2;
            if (this.lI_o < -this.lIO) {
               this.lI_o = II.IIl;
               IIIl.removeElementAt(0);
               if (IIIl.size() == 0) {
                  this.IOOI = false;
                  this.IOOl = false;
               } else {
                  this.lIO = IO1I.IIII.IIII((String)IIIl.elementAt(0));
               }
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      if (II.IIIO % 4000 == 1000) {
         I1O1.II(I1O1.III1, 10);
      }

      I11.IIl1();
   }

   public final boolean IIo1() {
      return this.IO1o;
   }

   private static void III(IO1l var0) {
      if (!IIoo.II1l()) {
         for (int var1 = 0; var1 < I1l1.II1_.size(); var1++) {
            I1l1 var2;
            if ((var2 = (I1l1)I1l1.II1_.elementAt(var1)) != null && !(var2 instanceof Ilo1)) {
               var2.III_(var0);
            }
         }

         if (!II.II) {
            for (int var3 = 0; var3 < I1l1.II1o.size(); var3++) {
               ((I1l1)I1l1.II1o.elementAt(var3)).III_(var0);
            }
         }

         for (int var4 = 0; var4 < I1l1.II10.size(); var4++) {
            ((I1l1)I1l1.II10.elementAt(var4)).III_(var0);
         }
      }
   }

   public static void III(IO1l var0, int var1) {
      if (!IIoo.II1l()) {
         for (int var2 = 0; var2 < IOlO.IlIO.size(); var2++) {
            Il0o var3;
            if ((var3 = (Il0o)IOlO.IlIO.elementAt(var2)).IIII != -1 && var3.III == var1) {
               var3.II(var0);
            }
         }

         if (IOlO.l1oI == 48 && var1 == 3 && II.II != null && II.II[0] != 0) {
            for (int var4 = 0; var4 < IOlO.l100 / II.II[0] + 1; var4++) {
               var0.II(II.II[0], var4 * II.II[0], IOlO.l10o - II.III[0] - 70, 0);
            }
         }
      }
   }

   public static void IIIl(IO1l var0) {
      if (!II.II) {
         var0.II(Il10, 0, 0, II.IIl, II.IIlI);
      }
   }

   @Override
   public void III_(IO1l var1) {
      IoOO = 0;
      if (IO__) {
         if (this.IO1 || this.IO1I && Ilo1.III == null) {
            this.Io0O++;
            if ((this.Io0O >= 30 || this.Io0O < 0 || II.IIIO % 4 != 0) && (this.Io0O < 30 || this.Io0O > 50 || II.IIIO % 3 != 0) && this.Io0O > 50) {
            }
         }

         II.III1(var1);
         if (IO10.l_lI == 5) {
            if (Il_o != null) {
               var1.Illl(16777215);
               var1.III_(0, 0, II.IIl, II.IIlI);
               var1.II(Il_o, II.IIl / 2, II.IIlI / 2, 3);
            } else {
               int var2 = IOlO.l1o1 % 2 == 0 ? 2 : 1;
               Il_o = IO10.IIII(IllI("荔菸菞菷莕葱葪落萜蓡蓮", 33659) + var2 + IllI("荕菪菗莿", 33659));
            }
         }

         if ((this.IO1l || this.IOOI) && IOlO.l1o1 != 3) {
            IIIl(var1);
         }

         if (lII1 > 0) {
            var1.IIl0(-Io1 + IlOo[lII1 % IlOo.length], -Io1I + Il0[lII1 % Il0.length]);
            lII1--;
         } else {
            var1.IIl0(-Io1, -Io1I);
         }

         if (this.IO10) {
            int var18 = II.IIIO % 3 == 0 ? 3 : -3;
            var1.IIl0(var18, 0);
         }

         Il0O.II1I(var1);
         I1lI.II(var1);
         if (!IIoo.II1l()) {
            IOlO.IIIo(var1);
            IOlO.IIo(var1);
         }

         if (!IIoo.II1l()) {
            for (int var3 = 0; var3 < II_O.size(); var3++) {
               Ilol var4;
               if ((var4 = (Ilol)II_O.elementAt(var3)).I1oO && IOlO.l1oI == 128) {
                  var4.IIII(var1, var4.I_o_, var4.I_oO, 0);
               }
            }
         }

         if (Ilol.II().I1oO && IOlO.l1oI == 128) {
            Ilol.II().IIII(var1, Ilol.II().I_o_, Ilol.II().I_oO, 0);
         }

         III(var1, 2);
         if (Ilol.II().II != null && II.IIIl && !IIoo.III(this, var1)) {
            if (IO1_.l_l == 20) {
               var1.II(IIo1, Ilol.II().II.I1 + Io1, Ilol.II().II.I1I + Io1I, 3);
            } else {
               var1.II(IIol, Ilol.II().II.I1 + Io1, Ilol.II().II.I1I + Io1I, 3);
            }
         }

         Il0O.II1l(var1);
         I11.II.II(var1);

         for (int var23 = 0; var23 < I1l1.II_.size(); var23++) {
            ((I1l1)I1l1.II_.elementAt(var23)).III_(var1);
         }

         for (int var24 = 0; var24 < IOl1.IlI1.size(); var24++) {
            ((IOl1)IOl1.IlI1.elementAt(var24)).II(var1);
         }

         if (!IIoo.II1l()) {
            for (int var25 = 0; var25 < IIOI.size(); var25++) {
               I_11 var5;
               if ((var5 = (I_11)IIOI.elementAt(var25)).IOl_ > 0) {
                  var5.II1I(var1);
               }
            }
         }

         for (int var26 = 0; var26 < IIOI.size(); var26++) {
            ((I_11)IIOI.elementAt(var26)).II(var1);
         }

         var1.IIl0(0, II.II10);
         if (!IIoo.II1l()) {
            for (int var27 = 0; var27 < II_O.size(); var27++) {
               Ilol var44 = null;

               try {
                  var44 = (Ilol)II_O.elementAt(var27);
               } catch (Exception var17) {
               }

               if (var44 != null && (!II.II.I_10 || !II.II.IlIl()) && var44.I1__) {
                  var44.II1I(var1);
               }
            }
         }

         if (!IIoo.II1l()) {
            Ilol.II().II1I(var1);
            I1lI.IIIl(var1);
         } else {
            IIoo.IIIo(var1);
         }

         for (int var28 = 0; var28 < IIO.size(); var28++) {
            ((I_I_)IIO.elementAt(var28)).II(var1);
         }

         for (int var29 = 0; var29 < IOl1.IlI1.size(); var29++) {
            ((IOl1)IOl1.IlI1.elementAt(var29)).IIIl(var1);
         }

         for (int var30 = 0; var30 < II_O.size(); var30++) {
            Ilol var45 = null;

            try {
               var45 = (Ilol)II_O.elementAt(var30);
            } catch (Exception var16) {
            }

            if (var45 != null && (!II.II.I_10 || !II.II.IlIl())) {
               var45.II(var1);
            }
         }

         Ilol.II().II(var1);
         if (Ilol.II().II != null && Ilol.II().II() != null && Ilol.II().I0I0 < Ilol.II().II().length) {
            Ilol.II().III(var1);
            Ilol.II().IIIl(var1);
         }

         for (int var31 = 0; var31 < II_O.size(); var31++) {
            Ilol var46 = null;

            try {
               var46 = (Ilol)II_O.elementAt(var31);
            } catch (Exception var15) {
            }

            if (var46 != null && (!II.II.I_10 || !II.II.IlIl()) && var46.II != null && var46.II() != null && var46.I0I0 < var46.II().length) {
               var46.III(var1);
               var46.IIIl(var1);
            }
         }

         for (int var32 = 0; var32 < II_0.size(); var32++) {
            ((I10_)II_0.elementAt(var32)).III_(var1);
         }

         var1.IIl0(0, -II.II10);
         II1_(var1);
         III(var1);
         III(var1, 3);

         for (int var33 = 0; var33 < IIOI.size(); var33++) {
            ((I_11)IIOI.elementAt(var33)).IIII(var1);
         }

         I1lI.II1I(var1);

         for (int var34 = 0; var34 < IIOI.size(); var34++) {
            I_11 var48;
            if ((var48 = (I_11)IIOI.elementAt(var34)) != null && var48.II != null) {
               var48.II.III(var1, var48.I_o_, var48.I_oO - var48.IO11 - II.II10, var48.IOI1);
            }
         }

         for (int var35 = 0; var35 < II_O.size(); var35++) {
            Ilol var47 = null;

            try {
               var47 = (Ilol)II_O.elementAt(var35);
            } catch (Exception var14) {
            }

            if (var47 != null && var47.II != null) {
               var47.II.III(var1, var47.I_o_, var47.I_oO - var47.IO11, var47.IOI1);
            }
         }

         for (int var36 = 0; var36 < IIO.size(); var36++) {
            I_I_ var6 = (I_I_)IIO.elementAt(var36);
            if (var6 != null && var6.II != null) {
               var6.II.III(var1, var6.I1, var6.I1I - 50, var6.llI_);
            }
         }

         if (Ilol.II().II != null) {
            Ilol.II().II.III(var1, Ilol.II().I_o_, Ilol.II().I_oO - Ilol.II().IO11, Ilol.II().IOI1);
         }

         I11.IIII.II(var1);
         I11.III.II(var1);
         Il0O.III(var1);
         if (!IIoo.II1l()) {
            for (int var19 = 0; var19 < IOlO.IlIO.size(); var19++) {
               Il0o var49;
               if ((var49 = (Il0o)IOlO.IlIO.elementAt(var19)).IIII != -1 && var49.III > 3) {
                  var49.II(var1);
               }
            }
         }

         I__O.II(var1);
         if (IOlO.l1oI == 120) {
            if (this.IIO != 100) {
               int var20 = this.IIO * IO1l.II(Il1) / 100;
               var1.II(Il1, IOlO.l100 / 2 - IO1l.II(Il1) / 2, 220, 0);
               var1.IIIO(IOlO.l100 / 2 - IO1l.II(Il1) / 2, 220, var20, 10);
               var1.II(IllO, IOlO.l100 / 2 - IO1l.II(Il1) / 2, 220, 0);
               var1.IIIO(0, 0, II.IIl, II.IIlI);
            }

            if (this.IOO1) {
               this.lIOI++;
               if (II.IIIO % 3 == 0) {
                  I1lI.III(new I1ll(19, I_Ol.III_(IOlO.l100 / 2 - 50, IOlO.l100 / 2 + 50), 340, 2, 1, -1));
               }

               if (II.IIIO % 15 == 0) {
                  I1lI.III(new I1ll(18, I_Ol.III_(IOlO.l100 / 2 - 5, IOlO.l100 / 2 + 5), I_Ol.III_(300, 320), 2, 1, -1));
               }

               if (this.lIOI == 100) {
                  this.IIl(IOlO.l100 / 2, 300);
               }

               if (this.lIOI == 110) {
                  this.lIOI = 0;
                  this.IOO1 = false;
               }
            }
         }

         Il0O.II(var1);
         boolean var50 = true;

         for (int var37 = 0; var37 < Il0O.IIIO.size(); var37++) {
            if (((Il0O)Il0O.IIIO.elementAt(var37)).I_O0 == 0) {
               var50 = false;
               break;
            }
         }

         if (IO1l.l_I0 <= 1) {
            var50 = false;
         }

         if (var50 && !this.IO1l) {
            int var8;
            if ((var8 = IOlO.l100 / (IO1l.II(IOlO.IIl_) + 50)) <= 0) {
               var8 = 1;
            }

            if (IOlO.l1o != 28) {
               for (int var38 = 0; var38 < var8; var38++) {
                  int var7 = 100 + var38 * (IO1l.II(IOlO.IIl_) + 50) - Io1 / 2;
                  int var21 = IO1l.II(IOlO.IIl_);
                  if (var7 + var21 >= Io1 && var7 <= Io1 + II.IIl && -20 + IO1l.III(IOlO.IIl_) >= Io1I && -20 <= Io1I + II.IIlI) {
                     var1.II(IOlO.IIl_, 100 + var38 * (IO1l.II(IOlO.IIl_) + 50) - Io1 / 2, -20, 0);
                  }
               }
            }
         }

         IO10.II(var1);
         II1l(var1);
         if (!I_1o && lIIl == 1 && !II.II.I_10) {
            this.II1(var1);
         }

         II1I(var1);
         II1O(var1);
         if (!I_1o) {
            var1.IIl0(-var1.IIO1(), -var1.IIO_());
            if ((IOlO.l1oI == 128 || IOlO.l1oI == 127) && IIOI != 0) {
               var1.Illl(0);
               var1.III_(3, 88, 54, 8);
               var1.Illl(16711680);
               var1.IIIO(5, 90, IIOI, 4);
               var1.III_(5, 90, 50, 4);
               var1.IIIO(0, 0, 3000, 3000);
               IO1I.IIII.II(var1, IllI("茶菻菛莭", 33659), 30, 98, 2, IO1I.III_);
            }

            if (Ilol.II().I_lI) {
               Ilol.II().I0O1++;
               if (II.IIIO % 3 == 0) {
                  var1.Illl(16777215);
                  var1.III_(0, 0, II.IIl, II.IIlI);
               }

               if (Ilol.II().I0O1 >= 100) {
                  Ilol.II().I0I0();
               }
            }

            for (int var39 = 0; var39 < II_O.size(); var39++) {
               Ilol var9 = null;

               try {
                  var9 = (Ilol)II_O.elementAt(var39);
               } catch (Exception var13) {
               }

               if (var9 != null && var9.I_lI && Ilol.III_(var9)) {
                  var9.I0O1++;
                  if (II.IIIO % 3 == 0) {
                     var1.Illl(16777215);
                     var1.III_(0, 0, II.IIl, II.IIlI);
                  }

                  if (var9.I0O1 >= 100) {
                     var9.I0I0();
                  }
               }
            }

            IlI.III().III_(var1);
            II1I(var1);
            this.II11(var1);
            II1I(var1);
            if (II.IIIl && II.III1 && !this.IIoO()) {
               II1I(var1);
               if (!IOlO.IllI() && !this.IIo_() && !IIoo.IIII(this, var1)) {
                  if (IO1_.l_l == 15) {
                     var1.II(IIo1, lIIO + 17, lII0 + 17, 3);
                  } else {
                     var1.II(IIol, lIIO + 17, lII0 + 17, 3);
                  }
               }
            }

            II1I(var1);
            if (IIIl.size() != 0 && IOO_) {
               var1.IIIO(0, II.IIlI - 13, II.IIl, 15);
               var1.III(0, II.IIlI - 13, II.IIl, 15, 0);
               String var56 = (String)IIIl.elementAt(0);
               IO1I.III1.II(var1, var56, this.lI_o, II.IIlI - 12, 0);
            }

            if (!II.II.I_10 && II.II == null && Ilo1.III == null && Ilo1.IIII == null && II.II.equals(II)) {
               super.III_(var1);
            }

            II1I(var1);
            int var54 = 100 + (Ilol.II.size() != 0 ? IIO1.size() * 12 : 0);
            if (Ilol.II().II != null) {
               int var51 = 0;
               int var57 = 0;
               int var22 = (II.IIlI - 100 - 60) / 12;

               for (int var40 = 0; var40 < II_O.size(); var40++) {
                  Ilol var10;
                  if ((var10 = (Ilol)II_O.elementAt(var40)).IO1I != -1 && var10.IO1I == Ilol.II().II.II0I) {
                     if (var10.II0I() && var10.I_o_ < Ilol.II().I_o_) {
                        int var11 = var22;
                        if (Ilol.II.size() != 0) {
                           var11 = var22 - IIO1.size();
                        }

                        if (var51 <= var11) {
                           IO1I.II1.II(var1, var10.IIO1, 20, var54 - 12 + var51 * 12, 0, IO1I.IIlO);
                           var10.III(var1, 10, var54 + var51 * 12 - 5);
                           var51++;
                        }
                     } else if (var10.II0I() && var10.I_o_ > Ilol.II().I_o_ && var57 <= var22) {
                        IO1I.II1.II(var1, var10.IIO1, II.IIl - 25, var54 - 12 + var57 * 12, 1, IO1I.IIlO);
                        var10.III(var1, II.IIl - 15, var54 + var57 * 12 - 5);
                        var57++;
                     }
                  }
               }
            }

            Ilo_.II().II(var1);
            if (IOlo && !II.II.I_10 && II.IIIO % 4 == 0) {
               var1.II(I10_.IlOI, this.IIll.I1 + 15, this.IIll.I1I + 30, 33);
            }

            if (this.IO10) {
               this.I0ll += 5;
               if (this.I0Io >= 0) {
                  this.I0Io = this.I0Io + this.I0ll;
               }

               if (this.I0Io < 0) {
                  this.I0Io--;
                  if (this.I0Io == -20) {
                     this.IO10 = false;
                     this.I0Io = 0;
                     this.I0ll = 0;
                  }
               } else if ((this.I0l - this.I0Io > 0 || this.I0Io < IOlO.l100) && this.I0Io > 0) {
                  var1.Illl(16777215);
                  if (!II.II && IO10.l_lI != 3 && IO10.l_lI != 5) {
                     var1.II(this.I0l - this.I0Io, this.I0lI - this.I0Io, 2 * this.I0Io, 2 * this.I0Io, 0, 360);
                  } else {
                     var1.III_(0, 0, II.IIl, II.IIlI);
                  }
               } else {
                  this.I0Io = -1;
               }
            }

            for (int var41 = 0; var41 < Ilol.II.size(); var41++) {
               I1ol var58 = (I1ol)Ilol.II.elementAt(var41);
               int var60 = this.IIll.I1 + 32 + var41 * 24;
               boolean var61 = true;
               I_oo.IIII(var1, var58.II_o, var60, 55, 0, 3);
               String var12 = var58.I_Oo + IllI("荜", 33659);
               if (var58.I_Oo == 0) {
                  var12 = var58.I_O0 + IllI("茈", 33659);
               }

               IO1I.IIII.II(var1, var12, var60, 70, 2, IO1I.III_);
            }

            for (int var42 = 0; var42 < IIO1.size(); var42++) {
               ((I1ol)IIO1.elementAt(var42)).IIIl(var1, this.IIll.I1 + (Ilol.II.size() != 0 ? 5 : 25), (Ilol.II.size() != 0 ? 90 : 45) + var42 * 12);
            }

            this.IIII(var1);
            if (IO11.IllI == 1) {
               long var59 = IO10.IIII() - Il0l;
               IO1I var62 = IO1I.IIII;
               Calendar var63;
               (var63 = Calendar.getInstance()).setTime(new Date(var59 + 25200000L));
               var54 = var63.get(11);
               int var52 = var63.get(12);
               var62.II(var1, var54 + IllI("茓", 33659) + var52 + IllI("茖", 33659), 10, II.IIlI - 65, 0, IO1I.III_);
            }

            if (!this.IlIl.equals("")) {
               for (int var43 = 0; var43 < this.IIl0.length; var43++) {
                  IO1I.IIII.II(var1, this.IIl0[var43], 5, 85 + var43 * 18, 0, IO1I.III_);
               }
            }
         }

         int var53 = II.IIll;
         if (II.IIll > 200) {
            var53 = 200;
         }

         III(var1, 0 + II.IIl / 2, 0, var53);
         I11.IIIl.II(var1);
      }
   }

   private void IIII(IO1l var1) {
      if (this.lI_0 != 0) {
         String var2 = "";

         for (int var3 = 0; var3 < this.I1.length; var3++) {
            var2 = var2 + this.I1I[var3] + IllI("荛", 33659);
         }

         I__O.II(var1, 20, 45, 95, 35, 16777215, false);
         IO1I.III_.II(var1, IO11.Il0O, 68, 50, 2);
         IO1I.III_.II(var1, var2, 68, 65, 2);
      }
   }

   public static I_11 II(short var0) {
      for (int var1 = 0; var1 < IIOI.size(); var1++) {
         I_11 var2;
         if ((var2 = (I_11)IIOI.elementAt(var1)).II.lll0 == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Ilol II(int var0) {
      for (int var1 = 0; var1 < II_O.size(); var1++) {
         Ilol var2;
         if ((var2 = (Ilol)II_O.elementAt(var1)).IOI_ == var0) {
            return var2;
         }
      }

      return null;
   }

   public static I_I_ II(int var0) {
      for (int var1 = 0; var1 < IIO.size(); var1++) {
         I_I_ var2;
         if ((var2 = (I_I_)IIO.elementAt(var1)).lll == var0) {
            return var2;
         }
      }

      return null;
   }

   public static I_I_ II(byte var0) {
      return (I_I_)IIO.elementAt(var0);
   }

   public static I_11 II() {
      for (int var0 = 0; var0 < IIOI.size(); var0++) {
         I_11 var1;
         if ((var1 = (I_11)IIOI.elementAt(var0)).II.lll0 == IIII()) {
            return var1;
         }
      }

      return null;
   }

   private static void II1l(IO1l var0) {
      try {
         byte var1;
         if (Ilo1.III == null && (var1 = IIII()) != -1) {
            I_11 var2 = null;

            for (int var3 = 0; var3 < IIOI.size(); var3++) {
               I_11 var4;
               if ((var4 = (I_11)IIOI.elementAt(var3)).II.lll0 == var1) {
                  if (var2 == null) {
                     var2 = var4;
                  } else if (I_Ol.II1(var4.I_o_ - Ilol.II().I_o_) < I_Ol.II1(var2.I_o_ - Ilol.II().I_o_)) {
                     var2 = var4;
                  }
               }
            }

            if (var2 != null
               && var2.IOIl != 15
               && (var2.I_o_ <= Io1 || var2.I_o_ >= Io1 + I_0 || var2.I_oO <= Io1I || var2.I_oO >= Io1I + IIO)
               && II.IIIO % 10 >= 5) {
               int var9 = var2.I_o_ - Ilol.II().I_o_;
               int var10 = var2.I_oO - Ilol.II().I_oO;
               int var5 = 0;
               int var6 = 0;
               byte var7 = 0;
               if (var9 > 0 && var10 >= 0) {
                  if (I_Ol.II1(var9) >= I_Ol.II1(var10)) {
                     var5 = I_0 - 10;
                     var6 = IIO / 2 + 30;
                     if (II.IIIl) {
                        var6 = IIO / 2 + 10;
                     }

                     var7 = 0;
                  } else {
                     var5 = I_0 / 2;
                     var6 = IIO - 10;
                     var7 = 5;
                  }
               } else if (var9 >= 0 && var10 < 0) {
                  if (I_Ol.II1(var9) >= I_Ol.II1(var10)) {
                     var5 = I_0 - 10;
                     var6 = IIO / 2 + 30;
                     if (II.IIIl) {
                        var6 = IIO / 2 + 10;
                     }

                     var7 = 0;
                  } else {
                     var5 = I_0 / 2;
                     var6 = 10;
                     var7 = 6;
                  }
               }

               if (var9 < 0 && var10 >= 0) {
                  if (I_Ol.II1(var9) >= I_Ol.II1(var10)) {
                     var5 = 10;
                     var6 = IIO / 2 + 30;
                     if (II.IIIl) {
                        var6 = IIO / 2 + 10;
                     }

                     var7 = 3;
                  } else {
                     var5 = I_0 / 2;
                     var6 = IIO - 10;
                     var7 = 5;
                  }
               } else if (var9 <= 0 && var10 < 0) {
                  if (I_Ol.II1(var9) >= I_Ol.II1(var10)) {
                     var5 = 10;
                     var6 = IIO / 2 + 30;
                     if (II.IIIl) {
                        var6 = IIO / 2 + 10;
                     }

                     var7 = 3;
                  } else {
                     var5 = I_0 / 2;
                     var6 = 10;
                     var7 = 6;
                  }
               }

               II1I(var0);
               var0.II(Il_l, 0, 0, 13, 16, var7, var5, var6, IOII.IIOI);
            }
         }
      } catch (Exception var8) {
      }
   }

   public static void II1I(IO1l var0) {
      var0.IIl0(-var0.IIO1(), -var0.IIO_());
      var0.IIIO(0, -200, II.IIl, 200 + II.IIlI);
   }

   private void III(IO1l var1, Ilol var2) {
      int var3 = (int)(var2.IOl_ * Il_l / var2.IOlo);
      int var4 = var2.IOl1 * I00l;
      int var5 = (int)(this.lI1I * Il_l / var2.IOlo);
      int var6 = this.lIlo * I00l;
      var1.IIIO(II.IIl / 2 + 58 - IO1l.II(Ill1), 0, 95, 100);
      var1.III(Ill1, 0, 0, IO1l.II(Ill1), IO1l.III(Ill1), 2, II.IIl / 2 + 60, 0, 24);
      var1.IIIO((int)(II.IIl / 2 + 60 - 83 - Il_l + Il_l - var5), 5, var5, 10);
      var1.II(Il1, II.IIl / 2 + 60 - 83, 5, 24);
      var1.IIIO(0, 0, II.IIl, II.IIlI);
      var1.IIIO((int)(II.IIl / 2 + 60 - 83 - Il_l + Il_l - var3), 5, var3, 10);
      var1.II(IllO, II.IIl / 2 + 60 - 83, 5, 24);
      var1.IIIO(0, 0, II.IIl, II.IIlI);
      var1.IIIO((int)(II.IIl / 2 + 60 - 83 - I00l + Il_l - var6), 20, var6, 6);
      var1.II(Il1I, II.IIl / 2 + 60 - 83, 20, 24);
      var1.IIIO(0, 0, II.IIl, II.IIlI);
      var1.IIIO((int)(II.IIl / 2 + 60 - 83 - I00l + Il_l - var4), 20, var4, 6);
      var1.II(Ill0, II.IIl / 2 + 60 - 83, 20, 24);
      var1.IIIO(0, 0, II.IIl, II.IIlI);
   }

   private void II(IO1l var1, boolean var2, Ilol var3) {
      if (var3 != null) {
         int var4;
         int var5;
         int var6;
         if (var3.IOI_ == Ilol.II().IOI_) {
            var6 = (int)(this.lI1I * Il_l / var3.IOlo);
            var4 = this.lIlo * I00l / var3.IO1;
            var5 = (int)(var3.IOl_ * Il_l / var3.IOlo);
         } else {
            var6 = (int)(var3.I0OO * Il_l / var3.IOlo);
            var4 = var3.I0O_ * I00l / 100;
            var5 = (int)(var3.IOl_ * Il_l / var3.IOlo);
         }

         if (Ilol.II().IIl > 0) {
            int var7 = Ilol.II().III0 * lI1_ / Ilol.II().IIIo;
            var1.II(Ill_, 58, 29, 0);
            var1.IIIO(83, 31, var7, 10);
            var1.II(Illo, 83, 31, 0);
            var1.IIIO(0, 0, II.IIl, II.IIlI);
            IO1I.II1I.II(var1, Ilol.II().IIOO + IllI("荁", 33659) + Ilol.II().III0 + IllI("荔", 33659) + Ilol.II().IIIo, 115, 29, 2);
         }

         if (var3.IOI_ != Ilol.II().IOI_) {
            var1.IIIO(IO1l.II(Ill1) - 95, 0, 95, 100);
         }

         var1.II(Ill1, 0, 0, 0);
         var1.IIIO(83, 5, var6, 10);
         var1.II(Il1, 83, 5, 0);
         var1.IIIO(0, 0, II.IIl, II.IIlI);
         var1.IIIO(83, 5, var5, 10);
         var1.II(IllO, 83, 5, 0);
         var1.IIIO(0, 0, II.IIl, II.IIlI);
         var1.IIIO(83, 20, var4, 6);
         var1.II(Il1I, 83, 20, 0);
         var1.IIIO(0, 0, II.IIl, II.IIlI);
         var1.IIIO(83, 20, var4, 6);
         var1.II(Ill0, 83, 20, 0);
         var1.IIIO(0, 0, II.IIl, II.IIlI);
         if (Ilol.II().IOl1 == 0 && II.IIIO % 10 > 5) {
            var1.IIIO(83, 20, 2, 6);
            var1.II(Il1I, 83, 20, 0);
            var1.IIIO(0, 0, II.IIl, II.IIlI);
         }

         String var9 = Il_o.III(Ilol.II().IOl_);
         IO1I.II1I.II(var1, var9, 87, 5, 0, IO1I.IIlI);
         String var8 = Il_o.III(Ilol.II().IOl1);
         IO1I.II1I.II(var1, var8, 87, 18, 0, IO1I.IIlI);
      }
   }

   public void I0__() {
      this.Ilol = this.Ilo1 = System.currentTimeMillis();
      this.lI11 = 180;
   }

   private static Ilol IIIl() {
      for (int var0 = 0; var0 < II_O.size(); var0++) {
         Ilol var1;
         if ((var1 = (Ilol)II_O.elementAt(var0)).III0 != 0) {
            return var1;
         }
      }

      return null;
   }

   private Ilol III1() {
      for (int var1 = 0; var1 < II_O.size(); var1++) {
         Ilol var2;
         if ((var2 = (Ilol)II_O.elementAt(var1)).III0 != 0 && var2 != IIIl()) {
            return var2;
         }
      }

      return null;
   }

   public static void IIO_(int var0) {
      for (int var1 = 0; var1 < II_O.size(); var1++) {
         if (((Ilol)II_O.elementAt(var1)).IOI_ == var0) {
            II_O.removeElementAt(var1);
            var1--;
         }
      }
   }

   private void II1(IO1l var1) {
      if (!Ilol.I10I) {
         II1I(var1);
         if (IIoo.II(this, var1)) {
            return;
         }

         if (IOlO.l1oI == 130 && IIIl() != null && this.III1() != null) {
            var1.IIl0(II.IIl / 2 - 62, 0);
            this.II(var1, true, IIIl());
            var1.IIl0(-(II.IIl / 2 - 65), 0);
            this.III(var1, this.III1());
            IIIl().IIII(var1, 137, 25, 0);
            this.III1().IIII(var1, II.IIl - 15 - 122, 25, 2);
         } else if (this.IIo_() && Ilol.II().IIIl != null) {
            var1.IIl0(II.IIl / 2 - 62, 0);
            this.II(var1, true, Ilol.II().IIIl);
            var1.IIl0(-(II.IIl / 2 - 65), 0);
            this.III(var1, Ilol.II());
            Ilol.II().IIII(var1, 137, 25, 0);
            Ilol.II().IIIl.IIII(var1, II.IIl - 15 - 122, 25, 2);
         } else if (II0_() && II.IIl <= 320) {
            Ilol var10 = Ilol.II();
            boolean var3 = true;
            var3 = true;
            var1.II(Il_0, 1, 1, 0);
            int var4 = Il_1.getWidth();
            int var5 = Il_1.getHeight() / 2;
            int var6;
            if ((var6 = var10.IOl_ * var4 / var10.IOlo) <= 0) {
               var6 = 1;
            } else if (var6 > var4) {
               var6 = var4;
            }

            var1.II(Il_1, 0, var5, var6, var5, 0, 4, 20, 0);
            if ((var6 = var10.IOl1 * var4 / var10.IO1) <= 0) {
               var6 = 1;
            } else if (var6 > var4) {
               var6 = var4;
            }

            var1.II(Il_1, 0, 0, var6, var5, 0, 4, 26, 0);
            var6 = 1 + Il_0.getWidth() / 2 + 1;
            IO1I.IIl1.II(var1, var10.IIO1, var6, 5, 2);
            if (var10.IIII != null) {
               if (var10.IIII.II() != null) {
                  IO1I.IIl1.II(var1, var10.IIII.II().II1o, var6, 33, 2);
               }
            } else if (var10.II != null) {
               IO1I.IIl1.II(var1, var10.II.II.II1o, var6, 33, 2);
            } else if (var10.IIIl != null) {
               IO1I.IIl1.II(var1, var10.IIIl.IIO1, var6, 33, 2);
            }
         } else {
            this.II(var1, true, Ilol.II());
            if (Ilol.II().III() != null || Ilol.II().IIII() != null) {
               IO1I.IIl1.II(var1, IO11.I_l0, this.lI1O / 2, 8, 2);
            } else if (Ilol.II().IIII != null) {
               if (Ilol.II().IIII.II() != null) {
                  int var2 = this.lI1O / 2;
                  IO1I.IIl1.II(var1, Ilol.II().IIII.II().II1o, var2, 9, 2);
               }

               if (Ilol.II().IIII.I1ll != 0) {
                  IO1I.IIl1.II(var1, I_1l.IIIl(Ilol.II().IIII.llIl), this.lI1O / 2, 22, 2);
               }
            } else if (Ilol.II().II != null) {
               int var7 = this.lI1O / 2;
               IO1I.IIl1.II(var1, Ilol.II().II.II.II1o, var7, 9, 2);
               if (Ilol.II().II.II.lll0 == 4) {
                  IO1I.IIl1.II(var1, II().II.lIoo + IllI("荔", 33659) + II().II.ll, this.lI1O / 2, 22, 2);
               }
            } else if (Ilol.II().IIIl != null) {
               int var8 = this.lI1O / 2;
               IO1I.IIl1.II(var1, Ilol.II().IIIl.IIO1, var8, 9, 2);
               IO1I.IIl1.II(var1, I_1l.IIIl(Ilol.II().IIIl.IOl_), this.lI1O / 2, 22, 2);
            } else {
               int var9 = this.lI1O / 2;
               IO1I.IIl1.II(var1, Ilol.II().IIO1, var9, 9, 2);
               IO1I.IIl1.II(var1, I_1l.IIIl(Ilol.II().Illo), this.lI1O / 2, 22, 2);
            }
         }

         var1.IIl0(-var1.IIO1(), -var1.IIO_());
         if (this.IIo_() && this.lI11 > 0) {
            this.Ilol = System.currentTimeMillis();
            if (this.Ilol - this.Ilo1 >= 1000L) {
               this.Ilo1 = System.currentTimeMillis();
               this.lI11--;
            }

            IO1I.IIII.II(var1, String.valueOf(this.lI11), II.IIl / 2, 13, 2, IO1I.III_);
         }

         if (this.IO_1) {
            var1.II(I10_.IlOI, 40, 35, 33);
            this.Iooo--;
            if (this.Iooo < 0) {
               this.Iooo = 0;
               this.IO_1 = false;
            }
         }
      }
   }

   public final boolean IIo_() {
      return IOlO.Ill() && (Ilol.II().III0 != 0 || IOlO.l1oI == 130 && IIIl() != null && this.III1() != null);
   }

   public void IIOO(int var1) {
      if (Ilol.II().I_o_ - Ilol.II().IO00 != 0 || Ilol.II().I_oO - Ilol.II().IO0o != 0) {
         I_0_.II().IoO();
      }

      Ilol.II().I_oo = -10;
      Ilol.II().I_o0 = var1;
      Ilol.II().IOIl = 3;
      Ilol.II().IO = 0;
   }

   private void II11(IO1l var1) {
      if (this.IIIO != null) {
         IO1l var4 = var1;
         I1_I var5 = this;
         I_IO.III(var1, Ilol.II().I_o_, Ilol.II().I_oO);
         var1.IIl0(-var1.IIO1(), -var1.IIO_());
         if (!II.II.IOol && !II.II.I_10 && Ilo1.III == null && II.IIIl) {
            for (int var2 = 0; var2 < var5.IlI.length(); var2++) {
               int var3 = (II.IIl - var5.IlI.length() * I011) / 2 + var2 * I011 + I011 / 2;
               if (var5.IlO0[var2] == -1) {
                  var4.II(Il1o, var3, II.IIlI - 25, 3);
                  IO1I.III_.II(var4, String.valueOf(var5.IlI.charAt(var2)), var3, II.IIlI - 30, 2);
               } else {
                  var4.II(Il_, var3, II.IIlI - 25, 3);
                  IO1I.IIIO.II(var4, String.valueOf(var5.IlI.charAt(var2)), var3, II.IIlI - 30, 2);
               }
            }
         }
      } else if (II.II == null && Ilo1.III == null && !II.II.IOol && !II.II.I_10 && Ilol.II().II.II01 != 0 && !Ilo_.II().I_10 && II.II != I_l.II) {
         long var20 = IO10.IIII() - this.Il0O;
         int var17 = 0;
         if (var20 < 10000L) {
            var17 = (int)(var20 * 20L / 10000L);
         }

         if (!II.IIIl) {
            if (!IIoo.II(var1, lIlO + lIlI - 1, lIll - 1, IO1_.l_l == 10)) {
               var1.II(IO1_.l_l == 10 ? Il : IIoo, lIlO + lIlI - 1, lIll - 1, 0);
            }

            I_oo.IIII(var1, 542, lIlO + lIlI + 3, lIll + 3, 0, 0);
            IO1I.II10.II(var1, "" + Io_0, lIlO + lIlI + 22, lIll + 15, 1);
            if (var20 < 10000L) {
               var1.Illl(2721889);
               var17 = (int)(var20 * 20L / 10000L);
               var1.III_(lIlO + lIlI + 3, lIll + 3 + var17, 20, 20 - var17);
            }
         } else if (Ilol.II().IOIl != 14) {
            if (II.II1o) {
               if (IoO0 != 1) {
                  var1.Illl(9670800);
                  var1.III_(lIlI + 9, lIll + 10, 22, 20);
                  var1.Illl(16777215);
                  var1.III_(lIlI + 9, lIll + 10 + (var17 != 0 ? 20 - var17 : 0), 22, var17 != 0 ? var17 : 20);
                  if (!IIoo.II1l()) {
                     var1.II(IO1_.l_l == 10 ? IlII : IlI, lIlI, lIll, 0);
                  }

                  IO1I.IIl0.II(var1, "" + Io_0, lIlI + 20, lIll + 15, 2);
               } else if (IoO0 == 1) {
                  if (!IIoo.II(var1, lIlO + lIlI - 1, lIll - 1, IO1_.l_l == 10)) {
                     var1.II(IO1_.l_l == 10 ? Il : IIoo, lIlO + lIlI - 1, lIll - 1, 0);
                  }

                  I_oo.IIII(var1, 542, lIlO + lIlI + 3, lIll + 3, 0, 0);
                  IO1I.II10.II(var1, "" + Io_0, lIlO + lIlI + 22, lIll + 13, 1);
                  if (var20 < 10000L) {
                     var1.Illl(2721889);
                     var17 = (int)(var20 * 20L / 10000L);
                     var1.III_(lIlO + lIlI + 3, lIll + 3 + var17, 20, 20 - var17);
                  }
               }
            } else if (IoO0 != 1) {
               var1.Illl(9670800);
               var1.III_(lIlI + 9, lIll + 10 - 6, 22, 20);
               var1.Illl(16777215);
               var1.III_(lIlI + 9, lIll + 10 + (var17 != 0 ? 20 - var17 : 0) - 6, 22, var17 != 0 ? var17 : 20);
               if (!IIoo.II1l()) {
                  var1.II(IO1_.l_l == 10 ? IlII : IlI, lIlI, lIll - 6, 0);
               }

               IO1I.IIl0.II(var1, "" + Io_0, lIlI + 20, lIll + 15 - 6, 2);
            } else {
               var1.Illl(9670800);
               var1.III_(lIlI + 10, lIll + 10 - 6, 20, 18);
               var1.Illl(16777215);
               var1.III_(lIlI + 10, lIll + 10 + (var17 != 0 ? 20 - var17 : 0) - 6, 20, var17 != 0 ? var17 : 18);
               var1.II(IO1_.l_l == 10 ? IlI1 : IlIl, lIlI + 20, lIll + 20 - 6, 3);
               IO1I.IIl0.II(var1, "" + Io_0, lIlI + 20, lIll + 15 - 6, 2);
            }
         }

         if (I_0l) {
            I_0o[] var6 = II.IIIl ? IIII : III;
            if (!II.IIIl) {
               var1.Illl(11152401);
               var1.III_(lIlO + lIlI + 2, lIll - 10 + 6, 20, 10);
               IO1I.II1I.II(var1, IllI("荑", 33659), lIlO + lIlI + 12, lIll - 8 + 6, 2);
            }

            int var7 = II.IIIl ? this.I0l0 : var6.length;

            for (int var8 = 0; var8 < var7; var8++) {
               if (!II.IIIl) {
                  String[] var9 = IOI0.III_
                     ? new String[]{IllI("茪", 33659), IllI("茬", 33659), IllI("茾", 33659), IllI("茩", 33659), IllI("茯", 33659)}
                     : new String[]{IllI("荌", 33659), IllI("荃", 33659), IllI("荂", 33659), IllI("荊", 33659), IllI("荈", 33659)};
                  var1.Illl(11152401);
                  var1.III_(lIlO + Il0I[var8] + 2, Il0l[var8] - 10 + 8, 20, 10);
                  IO1I.II1I.II(var1, var9[var8], lIlO + Il0I[var8] + 12, Il0l[var8] - 10 + 6, 2);
               }

               I_0o var21;
               if ((var21 = var6[var8]) != Ilol.II().II && !IIoo.II(var1, lIlO + Il0I[var8] - 1, Il0l[var8] - 1, false)) {
                  var1.II(IIoo, lIlO + Il0I[var8] - 1, Il0l[var8] - 1, 0);
               }

               if (var21 != null) {
                  if (var21 == Ilol.II().II) {
                     if (!IIoo.II(var1, lIlO + Il0I[var8] - 1, Il0l[var8] - 1, true)) {
                        var1.II(Il, lIlO + Il0I[var8] - 1, Il0l[var8] - 1, 0);
                     }

                     if (II.IIIl) {
                        var1.II(I_I_.Il0, 0, 12, 9, 6, 0, lIlO + Il0I[var8] + 8, Il0l[var8] - 7, 0);
                     }
                  }

                  int var10 = lIlO + Il0I[var8] + 13;
                  int var16 = Il0l[var8] + 13;
                  I_oo.IIII(var1, var21.II.l1O1, var10, var16, 0, IOII.IIOI);
                  long var11;
                  if ((var11 = System.currentTimeMillis() - var21.I1IO) < var21.l1_O) {
                     var1.Illl(2721889);
                     if (var21.I0Ol && II.IIIO % 6 > 2) {
                        var1.Illl(876862);
                     }

                     int var13 = (int)(var11 * 20L / var21.l1_O);
                     var1.III_(var10 - 10, var16 - 10 + var13, 20, 20 - var13);
                  } else {
                     var21.I0Ol = false;
                  }

                  if (var8 == this.I0lo && II.IIIO % 10 > 5 || var8 == this.lI) {
                     var1.II(I10_.IlOI, lIlO + Il0I[var8] + 13, Il0l[var8] + 14, 3);
                  }

                  float var22 = (float)(var21.l1_O - var11) / 1000.0F;
                  if (var22 > 0.0F) {
                     int var14 = (int)(var22 * 10.0F);
                     String var15 = var14 / 10 + IllI("荕", 33659) + var14 % 10;
                     IO1I.II1I.II(var1, var15, var10, var16 - 5, 2, IO1I.IIlI);
                  }
               }
            }
         }

         if (IoO0 != 0 && Ilol.II().IOIl != 14) {
            var1.II(IO1_.l_l == 5 ? IlIO : IlI_, lIIo + 20, lIl + 20, 3);
            II.II(var1);
            var1.II(IO1_.l_l == 13 ? IIo0 : IIoO, lIl1 + 20, lIl_ + 20, 3);
         }
      }
   }

   public static void II(String var0, int var1, int var2, int var3, int var4, int var5) {
      var3 = -1;

      for (int var6 = 0; var6 < 5; var6++) {
         if (Ilo[var6] == -1) {
            var3 = var6;
            break;
         }
      }

      if (var3 != -1) {
         IloI[var3] = var5;
         IIlO[var3] = var0;
         Il01[var3] = var1;
         Il0_[var3] = var2;
         Il00[var3] = 0;
         Il0o[var3] = var4 < 0 ? -5 : 5;
         Ilo[var3] = 0;
         Ilol[var3] = 0;
         Il0O[var3] = 10;

         for (int var9 = 0; var9 < 5; var9++) {
            if (Ilo[var9] != -1 && var3 != var9 && Il0o[var3] < 0 && I_Ol.II1(Il01[var3] - Il01[var9]) <= 20 && Il0O[var3] == Il0O[var9]) {
               int[] var7 = Il0O;
               var7[var3] += 10;
            }
         }
      }
   }

   public static final boolean IIII(int var0, int var1, int var2) {
      int var3 = IloO[0] == -1 ? 0 : 1;
      if (IloO[var3] != -1) {
         return false;
      }

      IloO[var3] = 0;
      Iloo[var3] = var2;
      Ilo1[var3] = var0;
      Ilo_[var3] = var1;
      return true;
   }

   private static void II1_(IO1l var0) {
      for (int var1 = 0; var1 < 2; var1++) {
         if (IloO[var1] != -1) {
            if (Iloo[var1] == 1) {
               var0.II(IIIO[Ilo0[var1]], Ilo1[var1], Ilo_[var1], 3);
            } else {
               var0.II(IIIO[Ilo0[var1]], 0, 0, IO1l.II(IIIO[Ilo0[var1]]), IO1l.III(IIIO[Ilo0[var1]]), 2, Ilo1[var1], Ilo_[var1], 3);
            }
         }
      }
   }

   private boolean IIoO() {
      if (!II.III1 && II.II == II()) {
         return true;
      } else if (!II.IIIl) {
         return true;
      } else if (Ilo_.II().I_10) {
         return true;
      } else {
         return I1OO.I_1o ? true : II.II != null || Ilo1.III != null || II.II.IOol || II.II.I_10;
      }
   }

   public static void IIl_(int var0, int var1) {
      if (II.IIl == 128 || II.IIlI <= 208) {
         var0 = 126;
         var1 = 160;
      }

      lI_ = var0;
      lI_I = var1;
      lI1o = IIOI - var0 / 2;
      lI10 = Iol0 - var1 / 2;
      if (II.IIIl) {
         if (II.IIlI <= 240) {
            lI10 -= 10;
         }

         if (II.IIIl && !II.III_ && II.II instanceof I1_I) {
            lI_ = 310;
            lI1o = I_0 / 2 - lI_ / 2;
         }
      }

      if (lI10 < -10) {
         lI10 = -10;
      }

      if (II.IIlI > 208 && lI10 < 0) {
         lI10 = 0;
      }

      if (II.IIlI == 208 && lI10 < 10) {
         lI10 = 10;
      }
   }

   public static void I0_O() {
      IOlO.IO11();
   }

   public static int II_() {
      int var0;
      if (Ilol.II().II == null) {
         var0 = -1;
      } else {
         var0 = IlOO[Ilol.II().II.l10l];
      }

      return var0;
   }

   public static byte IIII() {
      byte var0 = 0;
      if (Ilol.II().II == null) {
         var0 = -1;
      } else {
         int var1 = IlO_.length;
         if (Ilol.II().II.l10l <= var1 - 1) {
            var0 = (byte)IlO_[Ilol.II().II.l10l];
         }
      }

      return var0;
   }

   @Override
   public void II(String var1, String var2) {
      Ilo_.II().I_10 = false;
      if (var2.equals(IO11.IO1_)) {
         if (III.IIlI != Ilol.II().IOI_) {
            I_0_.II().III1(var1, III.IIlI);
         }
      } else if (!var1.equals("")) {
         if (var1.equals(IllI("茋菳菗莿莶葔葶萐", 33659))) {
            I_0_.II().Io_O();
            I_0_.II().Io_0();
            IOO = !IOO;
         }

         if (var1.equals(IllI("茒菹菖莶", 33659))) {
            I_Ol.I1l1 = !I_Ol.I1l1;
         }

         if (var1.equals(IllI("茙菳菞", 33659))) {
            I_Ol.III = !I_Ol.III;
         }

         I_0_.II().II_1(var1);
      }
   }

   @Override
   public void Illl() {
   }

   public void IIl_(I_Il var1) {
      I1OO.I__o();

      try {
         this.IlOI = new int[var1.II().readByte()];
         this.Il_1 = new int[this.IlOI.length];
         this.IlOl = new int[this.IlOI.length];
         this.Il_O = new int[this.IlOI.length];
         this.IlO1 = new int[this.IlOI.length];
         this.IIl1 = new String[this.IlOI.length];
         this.Il_0 = new int[this.IlOI.length];
         this.IIl_ = new String[this.IlOI.length];

         for (int var2 = 0; var2 < this.IlOI.length; var2++) {
            this.IlOI[var2] = var1.II().readByte();
            this.Il_1[var2] = var1.II().readByte();
            this.IlOl[var2] = var1.II().readByte();
            this.Il_O[var2] = var1.II().readByte();
            if (var1.II().readByte() == 1) {
               this.IIl1[var2] = var1.II().readUTF();
               this.IlO1[var2] = var1.II().readInt();
               this.IIl_[var2] = var1.II().readUTF();
               this.Il_0[var2] = var1.II().readInt();
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      II.II.IoII();
      II.II.I__0();
   }

   private void III(String var1, I1Il var2, I1Il var3) {
      this.II = new I__0();
      this.II.IIII(var1, var2, var3);
   }

   public void II(int var1, String var2, byte var3) {
      Ilol var4;
      if ((var4 = II(var1)) != null) {
         if (var3 == 3) {
            this.III(var2, new I1Il(IO11.I_lI, 2000, var4), new I1Il(IO11.I_I, 2009, var4));
         }

         if (var3 == 4) {
            this.III(var2, new I1Il(IO11.I_lI, 2005, var4), new I1Il(IO11.I_I, 2009, var4));
         }
      }
   }

   public void IIO0(int var1) {
      Ilol var2;
      if ((var2 = II(var1)) != null) {
         this.III(var2.IIO1 + IO11.I001, new I1Il(IO11.I_I_, 11114, var2), new I1Il(IO11.I_IO, 2009, var2));
      }
   }

   public static void II(int var0, byte var1) {
      if (IIOl.size() == 0) {
         I_0_.II().IIII((byte)2, var1);
         I_Ol.II__(IllI("茜菿菍莞莛葷葒葥", 33659));
      } else if (var0 == Ilol.II().IOI_) {
         I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓘蒣蒂蕫", 33659));
         Ilol.II();
         if (Ilol.II(var1)) {
            I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓅蒢蒚蕫", 33659));

            for (int var2 = 0; var2 < IIOl.size(); var2++) {
               I_1O var3;
               if ((var3 = (I_1O)IIOl.elementAt(var2)) != null && var3.IIO1 == var1) {
                  I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓒蒶蒃蕯蕊蕱蕖", 33659));
                  Ilol.II().IO0_ = var3.I_O0;
               }
            }

            return;
         }

         Ilol.II();
         if (!Ilol.II(var1)) {
            I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓗蒱蒃蕽蕈", 33659));
            I_0_.II().IIII((byte)2, var1);
            return;
         }
      } else {
         I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓟蒿蒛蔮蕀蔩", 33659));
         if (II(var0) != null) {
            II(var0);
            if (Ilol.II(var1)) {
               I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓅蒢蒚蕫", 33659));

               for (int var4 = 0; var4 < IIOl.size(); var4++) {
                  I_1O var5;
                  if ((var5 = (I_1O)IIOl.elementAt(var4)) != null && var5.IIO1 == var1) {
                     I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓒蒶蒃蕯蕊蕱蕖", 33659));
                     II(var0).IO0_ = var5.I_O0;
                  }
               }

               return;
            }

            II(var0);
            if (!Ilol.II(var1)) {
               I_Ol.II__(IllI("茖菣莙莻莑葺葔萳葉蒲蓗蒱蒃蕽蕈", 33659));
               I_0_.II().IIII((byte)2, var1);
            }
         }
      }
   }

   public void IIII(int var1, Object var2) {
      I_Ol.II__(IllI("茫菟菫莞莸葄葸葴萤蓛蓥蒘蓏蕇蕩蕬蔬藫藄薭薴虥虗虤虞蚢", 33659) + var1);
      switch (var1) {
         case 1:
            II.III_();
            return;
         case 2:
            II.II.IOol = false;
            return;
         case 2000:
            this.II = null;
            if ((Ilol)var2 == null) {
               I_0_.II().II((byte)1, (byte)3, -1);
               return;
            }

            I_0_.II().II((byte)1, (byte)3, ((Ilol)var2).IOI_);
            I_0_.II().IoO();
            return;
         case 2001:
            II.III_();
            return;
         case 2003:
            II.III_();
            I1OO.IIl1();
            I_0_.II().II((byte)0, (byte)3, Ilol.II().IIIl.IOI_);
            return;
         case 2004:
            II.III_();
            I_0_.II().II((byte)0, (byte)4, Ilol.II().IIIl.IOI_);
            return;
         case 2005:
            II.III_();
            this.II = null;
            if ((Ilol)var2 == null) {
               I_0_.II().II((byte)1, (byte)4, -1);
               return;
            }

            I_0_.II().II((byte)1, (byte)4, ((Ilol)var2).IOI_);
            return;
         case 2006:
            II.III_();
            I_0_.II().II((byte)2, (byte)4, Ilol.II().IIIl.IOI_);
            return;
         case 2007:
            II.III_();
         case 12006:
            GameMidlet.II.IIll();
            break;
         case 2009:
            this.II = null;
            return;
         case 8002:
            this.II(false, true);
            II.III1();
            II.IIIl();
            return;
         case 11000:
            II.II.IoI();
            II.II.I__0();
            return;
         case 11001:
            Ilol.II().IOo_();
            return;
         case 11002:
            II.II.I__o();
            return;
         case 11038:
            I_lO var7;
            (var7 = new I_lO("")).addElement(new I1Il(IO11.II0_[1], 110381));
            var7.addElement(new I1Il(IO11.II0_[2], 110382));
            var7.addElement(new I1Il(IO11.II0_[3], 110383));
            II.II.II(var7);
            return;
         case 11057:
            I1l1.II10.removeAllElements();
            I1l1.II1_.removeAllElements();
            I_11 var8;
            if ((var8 = (I_11)var2).lIo0 == 0) {
               I_0_.II().II((short)var8.II.lll0, (byte)II.II.llII);
               return;
            }

            if (II.II.llII == 0) {
               I_0_.II().IIo1(var8.lIo0);
               return;
            }
            break;
         case 11059:
            I_0o var9 = IIII[this.I0lo];
            this.III(var9, false);
            super.III0 = null;
            return;
         case 11067:
            if (IOlO.l1ol != 0) {
               I_0_.II().II0O(0);
               I1OO.IIl1();
               return;
            }

            II.IIII(IO11.I100, 0);
            return;
         case 11111:
            if (Ilol.II().IIIl == null) {
               return;
            }

            I1OO.IIl1();
            if (II.II.IIo.size() <= 0) {
               Ilol.II();
               this.IOoI();
            }

            II.II.III_(Ilol.II().IIIl);
            II.II.I__0();
            I_0_.II().II01(Ilol.II().IIIl.IOI_);
            I_0_.II().IlI0(Ilol.II().IIIl.IOI_);
            return;
         case 11112:
            Ilol var19 = (Ilol)var2;
            I_0_.II().III((byte)1, var19.IOI_);
            return;
         case 11113:
            Ilol var18;
            if ((var18 = (Ilol)var2) != null) {
               I_0_.II().II((byte)0, var18.IOI_, (byte)-1, -1);
               return;
            }
            break;
         case 11114:
            this.II = null;
            Ilol var6;
            if ((var6 = (Ilol)var2) == null) {
               return;
            }

            I_0_.II().II((byte)1, var6.IOI_, (byte)-1, -1);
            return;
         case 11115:
            if (Ilol.II().IIIl == null) {
               return;
            }

            I1OO.IIl1();
            I_0_.II().II(Ilol.II().IIIl.IOI_, (short)Ilol.II().IIIl.I10);
            return;
         case 11120:
            Object[] var10;
            I_0o var11 = (I_0o)(var10 = (Object[])var2)[0];
            var1 = Integer.parseInt((String)var10[1]);

            for (int var17 = 0; var17 < IIII.length; var17++) {
               if (IIII[var17] == var11) {
                  IIII[var17] = null;
               }
            }

            IIII[var1] = var11;
            IOo();
            return;
         case 11121:
            Object[] var12;
            I_0o var15 = (I_0o)(var12 = (Object[])var2)[0];
            int var13 = Integer.parseInt((String)var12[1]);

            for (int var5 = 0; var5 < III.length; var5++) {
               if (III[var5] == var15) {
                  III[var5] = null;
               }
            }

            III[var13] = var15;
            IO1_();
            return;
         case 12000:
            I_0_.II().II((byte)1, (byte)-1, (String)null);
            return;
         case 12001:
            II.III_();
            return;
         case 12002:
            II.III_();
            I1I var16 = (I1I)var2;
            I_0_.II().II((byte)1, -1, var16.II0I, var16.I_O0);
            this.II = null;
            return;
         case 12003:
            I1I var4 = (I1I)var2;
            II.III_();
            I_0_.II().II((byte)2, -1, var4.II0I, var4.I_O0);
            this.II = null;
            return;
         case 12004:
            I_0o var3 = (I_0o)var2;
            this.III(var3, true);
            Ilol.II();
            return;
         case 12005:
            if (II.II == null) {
               II.II = new I_01();
            }

            II.II.I0l_();
            II.III_();
            return;
         case 110001:
            II.II.IoI();
            II.II.I__0();
            return;
         case 110004:
            II.II.IOol = false;
            return;
         case 110382:
            I_0_.II().IoOl();
            return;
         case 110383:
            I_0_.II().IoO1();
            return;
         case 110391:
            I_0_.II().II((byte)0, Ilol.II().IIIl.IOI_, -1, -1);
            return;
         case 888351:
            I_0_.II().IIIo((byte)5);
            II.III_();
            return;
      }
   }

   public void IIIl(String var1, String var2) {
      var1 = var1;
      this.I1 = new int[var1.length()];
      this.I1I = new int[var1.length()];
      this.I1II = new int[var1.length()];
      this.I1Il = new int[var1.length()];
      this.I1I1 = new int[var1.length()];

      for (int var3 = 0; var3 < var1.length(); var3++) {
         this.I1[var3] = Short.parseShort(var1.substring(var3, var3 + 1));
         this.I1I[var3] = I_Ol.III_(0, 11);
         this.I1II[var3] = 1;
         this.I1I1[var3] = 0;
      }

      this.lI_0 = 100;
      this.lI_O = 0;
      this.II0l = var2;
      Ilo = IloI = IO10.IIII();
   }

   public void II_I(String var1) {
      if (!this.IOOl) {
         this.lIO = IO1I.III1.IIII(var1);
         this.lI_o = II.IIl;
         this.IOOl = true;
      }

      if (var1.startsWith(IllI("荚", 33659))) {
         var1 = var1.substring(1, var1.length());
         this.IOOI = true;
      }

      if (var1.startsWith(IllI("茹菕菪莋", 33659))) {
         try {
            if (IIol.III_ == null) {
               IIol.III_ = new Il_l.II();
            }

            IIol var2 = new IIol(var1);
            if (var2.II1 != null && var2.Il0O != -1) {
               IIol.III_.III(var2);

               while (IIol.III_.IIlO() > 4) {
                  IIol.III_.III(0);
               }
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

      IIIl.addElement(var1);
   }

   public void II_l(String var1) {
      this.IlIl = var1;
      this.IIl0 = IO1I.IIlI.II(this.IlIl, 500);
   }

   private static boolean II0_() {
      return IOlO.III() && II.II0I == 0;
   }

   private static void III(IO1l var0, int var1, int var2, int var3) {
      if (II != null && !I_1o && lIIl == 1 && !II.II.I_10 && II0_()) {
         if (var3 < IIl1.II0I + (IIll.II0I << 2)) {
            var3 = IIl1.II0I + (IIll.II0I << 2);
         }

         if (var1 > II.IIl - var3 / 2) {
            var1 = II.IIl - var3 / 2;
         }

         if (var1 < IO1l.II(Il_0) + var3 / 2 + 10) {
            var1 = IO1l.II(Il_0) + var3 / 2 + 10;
         }

         var2 = IIll.I_O0;
         int var4 = var2 + 0 + IO1l.III(Il_O) / 2 + 2;
         int var5 = IIl1.II0I;
         int var6 = var3 / 2 - var5 / 2;
         var3 = var1 - var3 / 2;
         int var7 = var1 + var5 / 2;
         int var8;
         int var9 = (var8 = var6 - IIll.II0I) / IIll.II0I;
         if (var8 % IIll.II0I > 0) {
            var9++;
         }

         for (int var10 = 0; var10 < var9; var10++) {
            if (var10 < var9 - 1) {
               IIll.II(1, var3 + IIll.II0I + var10 * IIll.II0I, 3, 0, 0, var0);
            } else {
               IIll.II(1, var3 + var8, 3, 0, 0, var0);
            }

            if (var10 < var9 - 1) {
               IIll.II(1, var7 + var10 * IIll.II0I, 3, 0, 0, var0);
            } else {
               IIll.II(1, var7 + var8 - IIll.II0I, 3, 0, 0, var0);
            }
         }

         IIll.II(0, var3, 3, 2, 0, var0);
         IIll.II(0, var7 + var8, 3, 0, 0, var0);
         if (II.I_Oo > 0) {
            byte var11 = 2;
            byte var12 = 3;
            if (II.IIO == 4) {
               var11 = 4;
               var12 = 5;
            }

            int var17;
            if ((var17 = II.I_Oo * var6 / II.I_O0) < 0) {
               var17 = 0;
            }

            if (var17 > var6) {
               var17 = var6;
            }

            var0.IIIO(var3 + var6 - var17, 3, var17, var2);

            for (int var18 = 0; var18 < var9; var18++) {
               if (var18 < var9 - 1) {
                  IIll.II(var12, var3 + IIll.II0I + var18 * IIll.II0I, 3, 0, 0, var0);
               } else {
                  IIll.II(var12, var3 + var8, 3, 0, 0, var0);
               }
            }

            IIll.II(var11, var3, 3, 2, 0, var0);
            II.II(var0);
         }

         if (II.I_0 > 0) {
            byte var21 = 2;
            byte var22 = 3;
            if (II.IIOI == 4) {
               var21 = 4;
               var22 = 5;
            }

            int var19;
            if ((var19 = II.I_0 * var6 / II.I_O0) < 0) {
               var19 = 0;
            }

            if (var19 > var6) {
               var19 = var6;
            }

            var0.IIIO(var7, 3, var19, var2);

            for (int var20 = 0; var20 < var9; var20++) {
               if (var20 < var9 - 1) {
                  IIll.II(var22, var7 + var20 * IIll.II0I, 3, 0, 0, var0);
               } else {
                  IIll.II(var22, var7 + var8 - IIll.II0I, 3, 0, 0, var0);
               }
            }

            IIll.II(var21, var7 + var8, 3, 0, 0, var0);
            II.II(var0);
         }

         IIl1.II(0, var1 - var5 / 2, 0, 0, 0, var0);
         String var13 = IO10.II(II.IlO0, II.II_l, true, false);
         IO1I.IIIl.II(var0, var13, var1 + 1, 0 + IIl1.I_O0 / 2 - IO1I.IIIO.IIOl() / 2, 2);
         I_1o.II(II.IIO, 1).III(var0, II.IlI1, var1 - 5, var4 + 5, 1, IO1I.III_);
         I_1o.II(II.IIOI, 1).III(var0, II.IlI_, var1 + 5, var4 + 5, 0, IO1I.III_);
         if (II.II0I != 0) {
            int var14 = 0 + var2 / 2 - 2;
            IO1I.II_I.II(var0, "" + II.I_Oo, var3 + var6 / 2, var14, 2);
            IO1I.II_I.II(var0, "" + II.I_0, var7 + var6 / 2, var14, 2);
         }

         var0.II(Il__, var1, 0 + IIl1.I_O0 + 2, 3);
         if (II.II0I == 0) {
            II(var0, II.IIOl, II.IIlI, var1 - 13, II.IIO1, var1 + 13, var4);
         }
      }
   }

   private static void II(IO1l var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Il_O != null) {
         int var7 = IO1l.III(Il_O) / 2;

         for (int var8 = 0; var8 < var1; var8++) {
            byte var9 = 0;
            if (var8 < var2) {
               var9 = 1;
            }

            var0.II(Il_O, 0, var9 * var7, IO1l.II(Il_O), var7, 0, var3 - var8 * (var7 + 1), var6, 3);
         }

         for (int var10 = 0; var10 < var1; var10++) {
            byte var11 = 0;
            if (var10 < var4) {
               var11 = 1;
            }

            var0.II(Il_O, 0, var11 * var7, IO1l.II(Il_O), var7, 0, var5 + var10 * (var7 + 1), var6, 3);
         }
      }
   }

   public static void II(int var0, int var1, int var2, int var3, int var4, int var5, int var6, short var7, I___[] var8) {
      II(new I111(var0, var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public static void II(int var0, int var1, int var2, Ilol var3, I___ var4, int var5, short var6, short var7) {
      II(new I111(var0, var1, var2, var3.IIII(), var4, var5, var6, var7));
   }

   private static void II(I111 var0) {
      if (var0.II0I == 0) {
         I11.II(var0);
      } else if (var0.II0I == 1) {
         I11.III(var0);
      } else if (var0.II0I == 2) {
         I11.IIII(var0);
      } else {
         I11.IIIl(var0);
      }
   }

   private static void II1O(IO1l var0) {
      var0.Illl(8421504);
      var0.III_(0, II.IIlI - 2, II.IIl, 2);
      int var1 = (int)(Ilol.II().Il1 * II.IIl / 10000L);
      var0.Illl(16777215);
      var0.III_(0, II.IIlI - 2, var1, 2);
      var0.Illl(0);
      var1 = II.IIl / 10;

      for (int var2 = 1; var2 < 10; var2++) {
         var0.III_(var2 * var1, II.IIlI - 2, 1, 2);
      }
   }

   static {
      new I_lO(IllI("茍菊菍莕莖葦", 33659));
      new I_lO(IllI("茍菉菜莬", 33659));
      new I_lO(IllI("茍菓菍莽莚葃葅萓萁蓳蓕蒵", 33659));
      if (II.IIIl) {
         IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虄蘶蘑蛭蛖蛮蚯蚐蝺", 33659));
         IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虄蘶蘑蛭蛖蛲蛱蚎蝳蝛", 33659));
         IIol = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虆蘬蘂蛶蚏蚰蚱蚙", 33659));
         IIo1 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虆蘬蘂蛶蚓蛮蚯蚐蝺", 33659));
         IIo0 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虃蘫蘀蛷蛒蛲蛱蚎蝳蝛", 33659));
         IlI = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虵蘡蘂蚲蚏蚰蚱蚙", 33659));
         IlII = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虵蘡蘂蚳蚏蚰蚱蚙", 33659));
         III = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虄蘪蘂蛮蛎蚧蛮蛐蝭蝒蜼", 33659));
         Illl = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虄蘪蘂蛮蛎蚧蛭蛐蝭蝒蜼", 33659));
         IlIl = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虵蘡蘂蚰蚏蚰蚱蚙", 33659));
         IlI1 = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虵蘡蘂蚱蚏蚰蚱蚙", 33659));
         IlI_ = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虃蘭蘑蛧蛃蚴蚱蛎蜳蝌蜵蜝", 33659));
         IlIO = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虃蘭蘑蛧蛃蚴蚱蛏蜳蝌蜵蜝", 33659));
      }

      IoO0 = I_O1.III(IllI("茚菴菘莴莘葱", 33659)) == 1 ? 1 : 0;
      II = new III();
      byte[] var0 = I_O1.II(IllI("茵菈菝莹莃葷董萱萁蓡蓘蒿蒁", 33659));
      byte[] var1 = I_O1.II(IllI("茵菈菔莹莇葀葐萦萀蓻蓞蒾", 33659));
      byte[] var2 = I_O1.II(IllI("茵菈菊莳莞葺葙萂萖蓠蓂蒹蒀蕠", 33659));
      byte[] var3 = I_O1.II(IllI("茵菈菐莬莒葻董萱萁蓡蓘蒿蒁", 33659));
      if (var0 != null) {
         II1o = var0[0];
      }

      if (var1 != null) {
         II_ = var1[0];
      }

      if (var2 != null) {
         II_I = var2[0];
      }

      if (var3 != null) {
         II_l = var3[0];
      }

      III = new I_0o[10];
      IIII = new I_0o[10];
      Il10 = IO10.IIII(IllI("荔菸菞菷莃葤葔萺萀蒼蓁蒾蒈", 33659));
      I0l_ = 0;
      Il1o = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虋蘱蘗蚬蛑蚮蚸", 33659));
      Il_ = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虋蘱蘗蛄蚏蚰蚱蚙", 33659));
      IO__ = true;
      IlOo = new int[]{1, -1, 1, -1};
      Il0 = new int[]{1, -1, -1, 1};
      IIO1 = new I_lO("");
      Il_l = IO10.IIII(IllI("荔菷菘莱莙葟葘萵萔蓷蒞蒽蒖蕚蕈蔴蔟藿藛薭藕虢虄蘶蘑蛭蛖蛳蛱蚎蝳蝛", 33659));
      Il01 = new int[5];
      Il0_ = new int[5];
      Il00 = new int[5];
      Il0o = new int[5];
      Ilo = new int[5];
      IIlO = new String[5];
      Il0O = new int[5];
      Ilol = new int[5];
      IloI = new int[8];

      for (int var4 = 0; var4 < 5; var4++) {
         Ilo[var4] = -1;
      }

      lI_ = 140;
      lI_I = 160;
      IO_o = false;
      IOO = false;
      IIIl = new Vector();
   }
}
