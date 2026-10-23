package main;

import java.io.IOException;
import java.io.InputStream;

public final class I_0_ {
   I1_o II = I_0O.II();
   private static I_0_ II;
   public static long I1I;
   public static long I1I1;
   public static long I1;
   public static long IlO;
   public static boolean III1;

   public static I_0_ II() {
      if (II == null) {
         II = new I_0_();
      }

      return II;
   }

   public void IIO(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)18)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9) {
      I_Il var10 = null;

      try {
         (var10 = new I_Il((byte)42)).II().writeUTF(var1);
         var10.II().writeUTF(var2);
         var10.II().writeUTF(var3);
         var10.II().writeUTF(var4);
         var10.II().writeUTF(var5);
         var10.II().writeUTF(var6);
         var10.II().writeUTF(var7);
         var10.II().writeUTF(var8);
         var10.II().writeUTF(var9);
         this.II.IIlO(var10);
         return;
      } catch (Exception var15) {
         var15.printStackTrace();
      } finally {
         var10.I0Oo();
      }
   }

   public void II(byte var1, I_lO var2) {
      I_Ol.II__(Ilo("鸫鸈黫黇麭麍齧", 40520));
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-81)).II().writeByte(1);
         var3.II().writeByte(var2.size());

         for (int var4 = 0; var4 < var2.size(); var4++) {
            var3.II().writeByte(((I101)var2.elementAt(var4)).lIO_);
            I_Ol.II__(Ilo("鸯鸒黯麅麭麇鼢", 40520) + ((I101)var2.elementAt(var4)).lIO_);
         }

         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void II(byte var1, int var2, byte var3, int var4) {
      I_Ol.II__(Ilo("鸯鸎黧黊黤麇齫齂鼨齿鼟鿾鿈龲龕ꁷꀘꁪꁖ", 40520) + var1);
      I_Il var5 = null;

      try {
         (var5 = new I_Il((byte)-86)).II().writeByte(var1);
         if (var1 == 0 || var1 == 1) {
            var5.II().writeInt(var2);
         }

         if (var1 == 2) {
            I_Ol.II__(Ilo("鸯鸒黯麅麨麆齬鼁鼩鼱鼚鿥鿙鿻鿇", 40520) + var3 + Ilo("鹨鸉黳黈黹黃", 40520) + var4);
            var5.II().writeByte(var3);
            var5.II().writeInt(var4);
         }

         if (var1 == 4) {
            var5.II().writeByte(var3);
         }

         this.II.IIlO(var5);
         return;
      } catch (Exception var10) {
         var10.printStackTrace();
      } finally {
         var5.I0Oo();
      }
   }

   public void II(IOI0[] var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-125)).II().writeByte(var1.length);

         for (int var3 = 0; var3 < var1.length; var3++) {
            var2.II().writeUTF(var1[var3].IIl1());
         }

         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III(byte var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)112)).II().writeByte(0);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(char var1) {
      I_Ol.II__(Ilo("鸫鸆黶麅麧麋齣齓齠鼼齃龽", 40520) + var1);
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-85)).II().writeChar(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III(byte var1, int var2) {
      I_Ol.II__(Ilo("鸩鸃黢麅麢麑齫齄鼮鼻", 40520));
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-80)).II().writeByte(var1);
         if (var2 != -1) {
            var3.II().writeInt(var2);
         }

         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void II(int var1) {
      I_Ol.II__(Ilo("鸯鸂黲麅麪麄齭齂", 40520));
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-76)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II01(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-79)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(byte var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-62)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III1(byte var1) {
      I_Ol.II__(Ilo("鸛鸌黯黉麨黃齬齎鼴齿鼘鿲鿟龮龉ꀹꁋꀸꁖ", 40520) + var1);
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-45)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II0_(int var1) {
      I_Il var2 = null;

      try {
         I_Ol.II__(Ilo("鸋鸫黇黫黤麧齍齯鼁鼋鼻", 40520));
         (var2 = new I_Il((byte)-54)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(int var1, String var2, int var3) {
      I_Il var4 = null;

      try {
         I_Ol.II__(Ilo("鸋鸫黇黫黤麮齇齲鼓鼞鼹鿘", 40520));
         (var4 = new I_Il((byte)-51)).II().writeByte(var1);
         if (var1 == 0) {
            var4.II().writeUTF(var2);
         }

         if (var1 == 2) {
            var4.II().writeInt(var3);
         }

         this.II.IIlO(var4);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.I0Oo();
      }
   }

   public void II(byte var1, byte var2, byte var3, short var4) {
      if (Ilol.II().IOIl != 14) {
         I_Il var5 = null;

         try {
            (var5 = new I_Il((byte)-43)).II().writeByte(var1);
            var5.II().writeByte(var2);
            var5.II().writeByte(var3);
            if (var3 == -1) {
               var5.II().writeShort(var4);
            }

            this.II.IIlO(var5);
            return;
         } catch (Exception var10) {
            var10.printStackTrace();
         } finally {
            var5.I0Oo();
         }
      }
   }

   public void II(int var1, byte var2) {
      I_Ol.II__(Ilo("鸂鸨黏黫黤麠齎齠鼎齿", 40520) + var1);
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-49)).II().writeInt(var1);
         var3.II().writeByte(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IIOl(int var1) {
      I_Ol.II__(Ilo("鸅鸢黋黧麁麱鼢齢鼌鼞鼰龽", 40520) + var1);
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-50)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II10(String var1) {
      I_Ol.II__(Ilo("鸻鸂黨黁黤麰齇齠鼒鼜鼶龽鿿龗龻ꁗꀘ", 40520) + var1);
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-47)).II().writeUTF(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III(int var1, byte var2) {
      I_Ol.II__(Ilo("鸚鸢黋黪麐麦鼢齢鼌鼞鼰龽鿕龿鿚ꀤꀘ", 40520) + var1 + Ilo("鹨鸕黩黉麡點鼢", 40520) + var2);
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-56)).II().writeInt(var1);
         var3.II().writeByte(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IOlI() {
      I_Ol.II__(Ilo("鸄鸢黇黳麁黃齁齭鼁鼑", 40520));
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-55);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void II(byte var1, int var2, int var3, int var4) {
      I_Ol.II__(Ilo("鸡鸉黰黌麰麆鼢齀鼣鼫鼗鿲鿒鿻鿇ꀹ", 40520) + var1 + Ilo("鸤鸆黿黀麶麊齦鼜齠", 40520) + var2 + Ilo("鹨鸄黪黄麪麪齆鼜齠", 40520) + var3 + Ilo("鹨鸄黩黁麡點鼢", 40520) + var4);
      I_Il var5 = null;

      try {
         (var5 = new I_Il((byte)-57)).II().writeByte(var1);
         if (var1 == 0) {
            var5.II().writeInt(var2);
         }

         if (var1 == 1 || var1 == 2) {
            var5.II().writeInt(var3);
            var5.II().writeInt(var4);
         }

         this.II.IIlO(var5);
         return;
      } catch (Exception var10) {
         var10.printStackTrace();
      } finally {
         var5.I0Oo();
      }
   }

   public void II(byte var1, byte var2, String var3) {
      I_Il var4 = null;

      try {
         (var4 = new I_Il((byte)-46)).II().writeByte(var1);
         if (var1 == 2 || var1 == 4) {
            var4.II().writeByte(var2);
            var4.II().writeUTF(var3);
            I_Ol.II__(Ilo("鸛鸢黈黡黤麰齎齮鼇鼞鼰龠龜", 40520) + var3);
         }

         this.II.IIlO(var4);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.I0Oo();
      }
   }

   public void III(byte var1, byte var2) {
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-40)).II().writeByte(var1);
         var3.II().writeByte(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public static I_Il II(byte var0) throws IOException {
      I_Il var1;
      (var1 = new I_Il((byte)-29)).II().writeByte(var0);
      return var1;
   }

   private static I_Il III(byte var0) throws IOException {
      I_Il var1;
      (var1 = new I_Il((byte)-28)).II().writeByte(var0);
      return var1;
   }

   public void Io__() {
      if (I_O1.III(Ilo("鸫鸋黯黀麪麗齶齘鼰鼺", 40520)) != -1) {
         IO10.l_lI = I_O1.III(Ilo("鸫鸋黯黀麪麗齶齘鼰鼺", 40520));
      }

      try {
         I_Ol.II__(Ilo("鸻鸂黲黱麽麓齧", 40520));
         I_Il var1;
         (var1 = II((byte)2)).II().writeByte(IO10.l_lI);
         var1.II().writeByte(IO1l.l_I0);
         var1.II().writeBoolean(false);
         var1.II().writeInt(II.IIl);
         var1.II().writeInt(II.IIlI);
         var1.II().writeBoolean(IOI0.III_);
         var1.II().writeBoolean(II.IIIl);
         var1.II().writeUTF(System.getProperty(Ilo("鸥鸎黥黗麫麆齦齈鼴鼶鼑鿳龒龫龖ꁸꁌꀱꀙꃧꃙ", 40520)) + Ilo("鸴", 40520) + Ilo("鹹鹉麶麋黶", 40520));
         InputStream var2;
         if ((var2 = this.getClass().getResourceAsStream(Ilo("鸺鸂黵黹麭麍齤齎", 40520))) != null) {
            var2.read((byte[])null);
            var1.II().writeShort(((Object[])null).length);
            var1.II().write((byte[])null);
            I_Ol.II_l(Ilo("鸿鸕黯黑麡黃", 40520) + ((Object[])null).length + Ilo("鸴", 40520) + Ilo("鹹鹉麶麋黶", 40520));
         }

         this.II.IIlO(var1);
         var1.I0Oo();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public void Io_O() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-120);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
      } finally {
         I1I = IO10.IIII();
         var1.I0Oo();
      }
   }

   public void Io_0() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-121);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
      } finally {
         I1I1 = IO10.IIII();
         var1.I0Oo();
      }
   }

   public void II(String var1, String var2, String var3, byte var4) {
      I_Ol.II__(Ilo("鸄鸈黡黌麪黃", 40520) + var1 + Ilo("鹨", 40520) + var2 + Ilo("鹨", 40520) + var3);

      try {
         I_Il var5;
         (var5 = II((byte)0)).II().writeUTF(var1);
         var5.II().writeUTF(var2);
         var5.II().writeUTF(var3);
         var5.II().writeByte(var4);
         var5.II().writeByte(IO11.IllI);
         this.II.IIlO(var5);
         var5.I0Oo();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public void II(String var1, String var2, String var3, String var4) {
      I_Ol.II__(Ilo("鸚鸂黷黐麡麐齶鼁鼒鼺鼙鿴鿏龯龟ꁫꀘ", 40520) + var1 + Ilo("鹨", 40520) + var2 + Ilo("鹨", 40520) + var4);

      try {
         I_Il var5;
         (var5 = II((byte)1)).II().writeUTF(var1);
         var5.II().writeUTF(var2);
         if (var3 != null && !var3.equals("")) {
            var5.II().writeUTF(var3);
            var5.II().writeUTF(Ilo("鸩", 40520));
         }

         this.II.IIlO(var5);
         var5.I0Oo();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public void Io_o() {
      I_Il var1 = new I_Il((byte)-23);
      this.II.IIlO(var1);
      var1.I0Oo();
   }

   public void III_(byte var1) {
      I_Il var2 = new I_Il((byte)-34);

      try {
         var2.II().writeByte(var1);
         this.II.IIlO(var2);
         var2.I0Oo();
      } catch (Exception var4) {
      }
   }

   public void II0O(int var1) {
      I_Il var2 = new I_Il((byte)21);

      try {
         var2.II().writeByte(var1);
         this.II.IIlO(var2);
         var2.I0Oo();
      } catch (Exception var4) {
      }
   }

   public void II00(int var1) {
      I_Il var2 = new I_Il((byte)-78);

      try {
         var2.II().writeInt(var1);
         this.II.IIlO(var2);
         var2.I0Oo();
      } catch (Exception var4) {
      }
   }

   public void IoO() {
      int var1 = Ilol.II().I_o_ - Ilol.II().IO00;
      int var2 = Ilol.II().I_oO - Ilol.II().IO0o;
      if (!Ilol.I1Oo && (var1 != 0 || var2 != 0) && !I1I1.I___ && !Ilol.II().I11 && Ilol.II().I_oO > 0 && !Ilol.II().I_l_) {
         try {
            I_Il var3 = new I_Il((byte)-7);
            Ilol.II().IO00 = Ilol.II().I_o_;
            Ilol.II().IO0o = Ilol.II().I_oO;
            Ilol.II();
            Ilol.II();
            Ilol.II();
            Ilol.II();
            if (IOlO.IIIo(Ilol.II().I_o_ / IOlO.IlI0, Ilol.II().I_oO / IOlO.IlI0) == 0) {
               var3.II().writeByte(1);
               if (Ilol.II().I110) {
                  if (!Ilol.II().I1O) {
                     Ilol var4 = Ilol.II();
                     var4.IOl1 = var4.IOl1 - Ilol.II().I0_0 / 100 * (Ilol.II().IIlo == 1 ? 2 : 1);
                  }

                  if (Ilol.II().IOl1 < 0) {
                     Ilol.II().IOl1 = 0;
                  }

                  I1_I.II().IO_O = true;
                  I1_I.II().lI1 = 0;
               }
            } else {
               var3.II().writeByte(0);
            }

            var3.II().writeShort(Ilol.II().I_o_);
            if (var2 != 0) {
               var3.II().writeShort(Ilol.II().I_oO);
            }

            this.II.IIlO(var3);
            I1_I.I1Oo++;
            var3.I0Oo();
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }

   public void II(String var1, int var2, int var3) {
      I_Il var4 = new I_Il((byte)-28);

      try {
         var4.II().writeByte(2);
         var4.II().writeUTF(var1);
         var4.II().writeByte(var2);
         var4.II().writeByte(var3);
         I_Ol.II__(Ilo("鸦鸆黫黀黹黃", 40520) + var1 + Ilo("鹨鸀黣黋麠麆齰鼜齠", 40520) + var2 + Ilo("鹨鸏黧黌麶點", 40520) + var3);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      this.II.IIlO(var4);
   }

   public void II0o(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)11)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(byte var1, byte var2, short var3) {
      I_Il var4 = null;

      try {
         (var4 = new I_Il((byte)7)).II().writeByte(var1);
         var4.II().writeByte(var2);
         var4.II().writeShort(var3);
         this.II.IIlO(var4);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.I0Oo();
      }
   }

   public void II(byte var1, int var2, int var3) {
      I_Il var4 = null;

      try {
         (var4 = new I_Il((byte)6)).II().writeByte(var1);
         var4.II().writeShort(var2);
         this.II.IIlO(var4);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.I0Oo();
      }
   }

   public void IIo(int var1) {
      I_Ol.II__(Ilol.II().IIO1 + Ilo("鹨鸴黃黩麁麠齖鼁鼓鼔鼷鿑鿰鿻", 40520) + var1);
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)34)).II().writeShort(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIII(short var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-66)).II().writeShort(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IoOI() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)29);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void II(short var1, byte var2) {
      I_Ol.II__(Ilo("鸫鸈黨黃麭麑齯齄齠鼲鼛鿳鿉鿦", 40520) + var2 + Ilo("鹨鸉黶黆黹黃", 40520) + var1);
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)32)).II().writeShort(var1);
         var3.II().writeByte(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IIoI(int var1) {
      I_Ol.II__(Ilo("鸦鸗黥麅麭麇", 40520) + var1);
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)33)).II().writeShort(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIII(int var1, int var2, int var3) {
      I_Il var4 = null;

      try {
         (var4 = new I_Il((byte)22)).II().writeByte(var1);
         var4.II().writeByte(var2);
         var4.II().writeByte(var3);
         this.II.IIlO(var4);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.I0Oo();
      }
   }

   public void IIIl(short var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)27)).II().writeShort(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(short var1, String var2) {
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)88)).II().writeShort(var1);
         var3.II().writeUTF(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void II(I101[] var1) {
      II.II.IOlI();
      I_Il var2 = null;

      try {
         var2 = new I_Il((byte)13);

         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var1[var3] != null) {
               var2.II().writeByte(var1[var3].lIO_);
            }
         }

         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIol(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)37)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIIo() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)50);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void II(I_lO var1, I_lO var2, int var3) {
      try {
         I_Ol.II__(Ilo("鸛鸢黈黡黤麢齖齵鼁鼜鼪龽鿊龘龒ꁸꁊꁪꁖꂵ", 40520) + var2.size());
         I_Il var4 = null;
         if (var3 != 0) {
            if (var1.size() > 0 && var2.size() > 0) {
               if (var3 == 1) {
                  var4 = new I_Il((byte)-4);
               } else if (var3 == 2) {
                  var4 = new I_Il((byte)67);
               }

               var4.II().writeByte(var1.size());

               for (int var10 = 0; var10 < var1.size(); var10++) {
                  I_I_ var12 = (I_I_)var1.elementAt(var10);
                  var4.II().writeByte(var12.lll);
               }

               for (int var11 = 0; var11 < var2.size(); var11++) {
                  Ilol var13;
                  if ((var13 = (Ilol)var2.elementAt(var11)) != null) {
                     var4.II().writeInt(var13.IOI_);
                  } else {
                     var4.II().writeInt(-1);
                  }
               }
            } else if (var1.size() > 0) {
               I_Ol.II__(Ilo("鸘鸫黇黼麁麱鼢齠鼔鼋鼿鿞鿷鿻龴ꁉꁻ", 40520));
               var4 = new I_Il((byte)54);

               for (int var9 = 0; var9 < var1.size(); var9++) {
                  I_I_ var5;
                  if (!(var5 = (I_I_)var1.elementAt(var9)).I0I1) {
                     var4.II().writeByte(var5.lll);
                  } else {
                     var4.II().writeByte(-1);
                     var4.II().writeInt(var5.lll);
                  }
               }
            } else if (var2.size() > 0) {
               I_Ol.II__(Ilo("鸸鸋黧黜麡麑鼢齀鼴鼫鼟鿾鿗鿻龊ꁵꁙꀮꀓꃧꂔ", 40520));
               var4 = new I_Il((byte)-60);

               for (int var8 = 0; var8 < var2.size(); var8++) {
                  Ilol var6 = (Ilol)var2.elementAt(var8);
                  var4.II().writeInt(var6.IOI_);
               }
            }

            var4.II().writeByte((byte)Ilol.II().IOI1);
            if (var4 != null) {
               this.II.IIlO(var4);
            }
         }
      } catch (Exception var7) {
      }
   }

   public void IIo1(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-20)).II().writeShort(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IoOl() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-15);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IoO1() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-16);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void II_1(String var1) {
      I_Il var2 = null;

      try {
         I_Ol.II__(Ilo("鸛鸂黨黁黤麀齪齀鼴齿", 40520) + var1);
         (var2 = new I_Il((byte)44)).II().writeUTF(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void I0o_() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-87);
         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            this.II = I_0O.II();
         }

         this.II.IIlO(var1);
         this.II = I_0O.II();
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void I0oO() {
      I_Il var1 = null;

      try {
         var1 = III((byte)6);
         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            this.II = I_0O.II();
         }

         this.II.IIlO(var1);
         this.II = I_0O.II();
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void III0() {
      I_Il var1 = null;

      try {
         var1 = III((byte)7);
         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            this.II = I_0O.II();
         }

         this.II.IIlO(var1);
         this.II = I_0O.II();
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IoO_() {
      I_Il var1 = null;

      try {
         var1 = III((byte)8);
         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            this.II = I_0O.II();
         }

         this.II.IIlO(var1);
         this.II = I_0O.II();
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IoOO() {
      I_Il var1 = null;

      try {
         var1 = III((byte)13);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IIII(String var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)53)).II().writeUTF(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIo_(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)76)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIoO(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)77)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(byte var1, byte var2, int var3) {
      I_Ol.II__(Ilo("鸘鸫黇黼麁麱鼢齷鼓齿鼮鿑鿽龂龿ꁋ", 40520));
      I_Il var4 = null;

      try {
         (var4 = new I_Il((byte)-59)).II().writeByte(var1);
         var4.II().writeByte(var2);
         var4.II().writeInt(var3);
         this.II.IIlO(var4);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.I0Oo();
      }
   }

   public void IIo0(int var1) {
      I_Il var2 = null;

      try {
         (var2 = III((byte)10)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II_0(String var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)17)).II().writeUTF(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III1(String var1, int var2) {
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-72)).II().writeInt(var2);
         var3.II().writeUTF(var1);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void II_o(String var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-71)).II().writeUTF(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III_(String var1, String var2) {
      I_Il var3 = null;

      try {
         (var3 = III((byte)16)).II().writeUTF(var1);
         var3.II().writeUTF(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void III_(String var1, int var2) {
      I_Il var3 = null;

      try {
         (var3 = III((byte)18)).II().writeInt(var2);
         var3.II().writeUTF(var1);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IIoo(int var1) {
      II.II();
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-67)).II().writeInt(var1);
         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            this.II = I_0O.II();
         }

         this.II.IIlO(var2);
         this.II = I_0O.II();
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void Il(int var1) {
      I_Il var2 = null;

      try {
         (var2 = III((byte)37)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IlI(int var1) {
      I_Il var2 = null;

      try {
         (var2 = III((byte)41)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IlII(int var1) {
      I_Il var2 = null;

      try {
         (var2 = III((byte)39)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III1(short var1) {
      I_Ol.II__(Ilo("鸯鸂黲麅麭麎齣齆鼥齿鼗鿹龁鿻", 40520) + var1);
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-32)).II().writeShort(var1);
         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            this.II = I_0O.II();
         }

         this.II.IIlO(var2);
         this.II = I_0O.II();
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IoO0() {
      I_Ol.II__(Ilo("鸻鸂黨黁黤麎齣齑齠鼰鼘鿻鿐龲龔ꁼ", 40520));
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-33);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IoOo() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-38);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IlIl(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-38)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
      } finally {
         var2.I0Oo();
      }
   }

   public void Io0() {
      I_Ol.II__(Ilo("鸮鸎黨黌麷麋齎齎鼡鼻鼳鿼鿌", 40520));
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-39);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IIIO(byte var1) {
      I_Ol.II__(Ilo("鸺鸂黷黐麡麐齶鼁鼢鼾鼙龽鿕龶龛ꁾꁝ", 40520));
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-63)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIO(String var1) {
      I_Ol.II__(Ilo("鸄鸈黡黌麪黃鼰", 40520));
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-101)).II().writeUTF(var1);
         var2.II().writeByte(1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III0(byte var1) {
      I_Ol.II__(Ilo("鸺鸂黷黐麡麐齶鼁鼭鼾鼙鿴鿟鿻龎ꁫꁝꀲ", 40520));
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-34)).II().writeByte(2);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIlO(int var1, int var2) {
      I_Il var3 = null;

      try {
         boolean var4 = true;
         I_Il var5;
         (var5 = new I_Il((byte)-30)).II().writeByte(16);
         var3 = var5;
         var5.II().writeByte(var1);
         var5.II().writeShort(var2);
         I_Ol.II__(Ilo("鸯肊黯麅麰鿠齬齆齠鼫鼗腜鿑鿻龔ꄚꁖꀰꁖꃛꃡꂞꃏꄱ", 40520) + var2 + Ilo("鹨鸓黿黕麡點鼢", 40520) + var1);
         this.II.IIlO(var5);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void III(byte var1, I_lO var2) {
      I_Ol.II__(Ilo("鸺鸂黷黐麡麐齶鼁鼲鼺鼍鿲鿉龩龙ꁼꀘꀶꀕꃡꃝꂼꂜꄬꄐ", 40520) + var1);
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-74)).II().writeByte(var1);
         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            III1 = true;
            this.II = I_0O.II();
         }

         this.II.IIlO(var3);
         this.II = I_0O.II();
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IlI1(int var1) {
      I_Ol.II__(Ilo("鸺鸂黷黐麡麐齶鼁鼭鼾鼙鿴鿟鿻龎ꁫꁝꀲ", 40520));
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-91)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void Io0I() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-107);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void II(String var1, byte var2) {
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-96)).II().writeUTF(var1);
         var3.II().writeByte(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IlI_(int var1) {
      I_Ol.II__(Ilo("鸏鸲黏麅麐麫齃齢鼈齿鼺鿜鿩龚", 40520));
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-118)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIII(byte var1, int var2) {
      I_Ol.II__(Ilo("鸩鸃黢麅麢麑齫齄鼮鼻", 40520));
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-99)).II().writeByte(var1);
         if (var1 == 1 || var1 == 2) {
            var3.II().writeInt(var2);
         }

         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void II(byte var1, int var2, byte var3, int var4, int var5) {
      I_Il var6 = null;

      try {
         I_Ol.II__(Ilo("鸣鸎麦黂麱麊鼢齀鼣鼫鼗鿲鿒鿦鿚", 40520) + var1 + Ilo("鹨鸎黲黀麩黃齫齅齽齿", 40520) + var2);
         (var6 = new I_Il((byte)-100)).II().writeByte(var1);
         if (var1 == 0) {
            var6.II().writeShort(var2);
            var6.II().writeByte(var3);
            var6.II().writeInt(var4);
            var6.II().writeInt(var5);
            I_Ol.II__(Ilo("鸣鸎麦黂麱麊鼢齒鼯齿鼒鿨鿓龵龝ꀹ", 40520) + var5);
         }

         if (var1 == 1 || var1 == 2) {
            var6.II().writeShort(var2);
         }

         if (var1 == 3) {
            var6.II().writeShort(var2);
            var6.II().writeByte(var3);
            var6.II().writeInt(var4);
         }

         if (var1 == 4) {
            var6.II().writeByte(var3);
            var6.II().writeByte(var4);
            I_Ol.II__(Ilo("鸫鸒黴黗麐麂齠鼜齠", 40520) + var3 + Ilo("鹨鸗黧黂麡點鼢", 40520) + var4);
         }

         if (var1 == 5) {
            var6.II().writeShort(var2);
         }

         this.II.IIlO(var6);
         return;
      } catch (Exception var11) {
         var11.printStackTrace();
      } finally {
         var6.I0Oo();
      }
   }

   public void IIII(byte var1, byte var2) {
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-103)).II().writeByte(var1);
         I_Ol.II__(Ilo("鹥鹊麫麈黩黎鼯鼌齭齲齓龰鿏龾龈ꁯꁑꀴꀓꂸꂙꃳꃒ", 40520) + var1 + Ilo("鹨鹇麦", 40520) + var2);
         if (var1 != 0) {
            var3.II().writeByte(var2);
         }

         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IlIO(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-104)).II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIIo(byte var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-108)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void Io0l() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-105);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IIl(byte var1) {
      I_Il var2 = null;

      try {
         I_Ol.II__(Ilo("鸎鸲黈黶麍麬齌", 40520));
         (var2 = new I_Il((byte)125)).II().writeByte(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void III(I_lO var1) {
      I_Il var2 = null;

      try {
         I_Ol.II__(Ilo("鸁鸪黇黢麁黃齑齮鼕鼍鼽鿘龜龨龓ꁣꁝꁪꁖ", 40520) + var1.size());
         (var2 = new I_Il((byte)-111)).II().writeShort(var1.size());
         if (var1.size() > 0) {
            for (int var3 = 0; var3 < var1.size(); var3++) {
               I_Ol.II__(Ilo("鸯鸒黯麅麨麆齬鼁鼳鼫鼌龽", 40520) + ((I1Ol)var1.elementAt(var3)).IIoo);
               var2.II().writeUTF(((I1Ol)var1.elementAt(var3)).IIoo);
            }
         }

         if (I_0O.III().IlI_() && !I_0O.III().I0OI) {
            this.II = I_0O.III();
         } else {
            this.II = I_0O.II();
            III1 = true;
         }

         this.II.IIlO(var2);
         this.II = I_0O.II();
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(byte var1, int var2, byte[] var3) {
      I_Il var4 = null;

      try {
         I_Ol.II__(Ilo("鸛鸢黔黳麁麱鼢齥鼁鼋鼿", 40520));
         (var4 = new I_Il((byte)-110)).II().writeByte(1);
         var4.II().writeInt(var2);
         if (var3 != null) {
            var2 = var3.length;
            var4.II().writeShort(var2);
            var4.II().write(var3, 0, var2);
         }

         this.II.IIlO(var4);
         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.I0Oo();
      }
   }

   public void II(byte[] var1) {
      I_Il var2 = null;

      try {
         var2 = new I_Il((byte)-113);

         for (int var3 = 0; var3 < I1_I.IIII.length; var3++) {
            var2.II().writeByte(var1[var3]);
         }

         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void Io01() {
      I_Il var1 = null;

      try {
         var1 = new I_Il((byte)-114);
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.I0Oo();
      }
   }

   public void IlI0(int var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)-30)).II().writeByte(63);
         var2.II().writeInt(var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void II(int var1, short var2) {
      I_Il var3 = null;

      try {
         (var3 = new I_Il((byte)-30)).II().writeByte(64);
         var3.II().writeInt(var1);
         var3.II().writeShort(var2);
         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IIOI(String var1) {
      I_Il var2 = null;

      try {
         (var2 = new I_Il((byte)66)).II().writeUTF(var1);
         I_Ol.II__(Ilo("鹶鹙麸黂麡麗齅齄鼴鼖鼓鿺鿾龢龴ꁸꁕꀲꁖꂨꂔ", 40520) + var1);
         this.II.IIlO(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.I0Oo();
      }
   }

   public void IIIl(byte var1, byte var2) {
      I_Il var3 = new I_Il((byte)-127);

      try {
         var3.II().writeByte(var1);
         if (var2 > 0) {
            var3.II().writeByte(var2);
         }

         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void IIl(int var1, int var2) {
      I_Il var3 = new I_Il((byte)127);

      try {
         var3.II().writeByte(var1);
         if (var2 != -1) {
            var3.II().writeShort(var2);
         }

         this.II.IIlO(var3);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.I0Oo();
      }
   }

   public void I0__() {
      I_Il var1 = new I_Il((byte)69);

      try {
         this.II.IIlO(var1);
         return;
      } catch (Exception var6) {
      } finally {
         var1.I0Oo();
      }
   }

   public void II(byte var1, byte var2, short var3, short var4) {
      I_Il var5 = null;

      try {
         (var5 = new I_Il((byte)-45)).II().writeByte(20);
         var5.II().writeByte(var1);
         var5.II().writeShort(Ilol.II().I_o_);
         var5.II().writeShort(Ilol.II().I_oO);
         var5.II().writeByte(var2);
         var5.II().writeShort(var3);
         var5.II().writeShort(var4);
         this.II.IIlO(var5);
         return;
      } catch (Exception var10) {
      } finally {
         var5.I0Oo();
      }
   }
}
