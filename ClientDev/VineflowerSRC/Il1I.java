package main;

public class Il1I extends IIII implements I1_1, I1__ {
   private static Il1I II;
   private Il_l.II IIlI = new Il_l.II();
   private Il1I.II II;
   public Il_l.II IIll = new Il_l.II();
   public Il_l.II IIl1 = new Il_l.II();
   private boolean Il0 = false;
   private String[] III1 = new String[]{II__("\ue50c\ue509שּׂ\ue5ef\ue59e\ue5b9\ue599\ue677\ue65b\ue620", 58690), II__("\ue525\ue508\ue562\ue5e6", 58690)};
   private static final long IIo0 = 100L;

   public static Il1I II() {
      if (II == null) {
         II = new Il1I();
      }

      return II;
   }

   public static Il1I III() {
      return II();
   }

   private Il1I() {
   }

   @Override
   protected void II1l() {
      this.IIOI();
      this.IIlo();
   }

   @Override
   protected void II11() {
      this.IIOl();
   }

   @Override
   protected void II1_() {
      if (II.IIIO % 5 == 0) {
         this.I_O0();
      }
   }

   @Override
   protected void II1O() {
   }

   @Override
   protected void II10() {
   }

   private void I_O0() {
      if (this.IIlI.IIlO() > 0) {
         for (int var1 = 0; var1 < this.IIlI.IIlO(); var1++) {
            Il1I.II var2 = (Il1I.II)this.IIlI.II(var1);
            if (IlOl.II(var2.IIoo, var2.I1l_ * 1000L)) {
               var2.IIoo = IlOl.IIII();
               I_0_.II().II((byte)0, (byte)1, (byte)-1, (short)var2.I1ll);
               break;
            }
         }
      }
   }

   @Override
   public void II(String var1, String var2) {
      String var3 = Ilo_.II().II.IIl1();
      if (!Il_o.III1(var3) && !Il_o.III1(var1)) {
         if (Ilo_.II().II00.equals(this.III1[0])) {
            this.IIl0(var3);
         }
      } else {
         this.Illl();
      }
   }

   @Override
   public void Illl() {
      Ilo_ var1 = Ilo_.II();
      var1.II00 = II__("\ue501\ue509\ue5e1\ue5eb", 58690);
      var1.II.II1o = II__("\ue521\ue509\ue5e1\ue5eb", 58690);
      var1.II.IIOl("");
      var1.I_10 = false;
      var1.II = I1_I.II();
      var1.III0 = null;
   }

   @Override
   public void II(int var1, Object var2) {
      switch (var1) {
         case 1:
            this.II((Il1I.II)var2);
            break;
         case 2:
            this.IIl1((Integer)var2);
         case 3:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         default:
            break;
         case 4:
            this.IIll.III(((I101)var2).IIIo());
            this.IIOl();
            break;
         case 5:
            this.IIl1.III(((I101)var2).IIIo());
            this.IIOl();
            break;
         case 6:
            this.II(this.IIll, ((I101)var2).IIIo());
            this.IIOl();
            break;
         case 7:
            this.II(this.IIl1, ((I101)var2).IIIo());
            this.IIOl();
            break;
         case 8:
            this.IIl_(0);
            this.II_I();
            break;
         case 9:
            this.IIl_(1);
            this.II_I();
            break;
         case 10:
            this.I_0I();
            break;
         case 11:
            this.I_0();
            this.II_I();
            break;
         case 20:
            IlI.III().I_11();
      }
   }

   private void II(Il_l.II var1, String var2) {
      for (int var3 = 0; var3 < var1.IIlO(); var3++) {
         String var4 = (String)var1.II(var3);
         if (var4.equals(var2)) {
            var1.III(var3);
            return;
         }
      }
   }

   private void IIl0(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         this.II.I1l_ = var2;
         this.IIIl(
            II__("\ue503\ue514\ue5f4\ue5f0\ue59e", 58690) + this.II.II_ + II__("\ue578\ue541", 58690) + var2 + II__("\ue562\ue506\ue5e9\ue57d\ue5c7", 58690)
         );
         this.IIlI.III(this.II);
      } catch (Exception var3) {
         this.IIIl(
            II__(
               "\ue506\ue504\ue5ec\ue5fe\ue5c7\ue5fd\ue5b7\ue673\ue6ce\ue637\ue61f\ue6b7\ue6fe\uf836\ue684\ue733\ue77e練\ue75c\ue7af\ue7f8\ue7b8\ue785\ue82b\ue866\ue8bb\ue806\ue8e0\ue886\ue88b\ue88c\uf7ae\ue952\ue961\ue92c\uf7de\ue9f7\ue99c",
               58690
            )
         );
      }

      this.I_Oo();
   }

   private void I_Oo() {
      Ilo_ var1 = Ilo_.II();
      var1.II00 = II__("\ue501\ue509\ue5e1\ue5eb", 58690);
      var1.II.II1o = II__("\ue521\ue509\ue5e1\ue5eb", 58690);
      var1.I_10 = false;
      var1.II = null;
   }

   public boolean IIIo(int var1) {
      for (int var2 = 0; var2 < this.IIlI.IIlO(); var2++) {
         Il1I.II var3 = (Il1I.II)this.IIlI.II(var2);
         if (var3.I1ll == var1) {
            return true;
         }
      }

      return false;
   }

   private void IIl1(int var1) {
      for (int var2 = 0; var2 < this.IIlI.IIlO(); var2++) {
         Il1I.II var3 = (Il1I.II)this.IIlI.II(var2);
         if (var3.I1ll == var1) {
            this.IIlI.III(var2);
            this.IIIl(II__("\ue452\ue582\ue5a0\ue5f1\ue5d9\ue46d\ue592\ue67c\ue61a\ue618\ue60d\ue6e3\ue6d9", 58690));
            break;
         }
      }
   }

   private void II(Il1I.II var1) {
      this.II = var1;
      Ilo_ var2 = Ilo_.II();
      var2.II00 = this.III1[0];
      var2.II.II1o = this.III1[1];
      II.II.I_10 = false;
      var2.II1o("");
      var2.II = this;
   }

   public void IIl_(int var1) {
      if (this.Il0) {
         this.IIIl(II__("\ue452\ue500\ue5ee\ue5f8\ue59e\ue590וֹ\ue678\ue61a\ue749\uf8ab\ue6b6", 58690));
      } else {
         IlO.II(new Il1l(this, var1));
      }
   }

   private void III(Il_l.II var1) {
      if (this.Il0) {
         this.IIIl(II__("\ue452\ue500\ue5ee\ue5f8\ue59e\ue590וֹ\ue678\ue61a\ue749\uf8ab\ue6b6", 58690));
      } else {
         this.Il0 = true;

         try {
            for (int var2 = Ilol.II().II.length - 1; var2 >= 0; var2--) {
               I101 var3 = Ilol.II().II[var2];
               if (var3 != null && this.II(var1, var3.IIIo())) {
                  I_0_.II().III((byte)4, (byte)var2);
                  IlO.IIIl(100L);
               }
            }

            this.IIIl(II__("\ue452\ue582\ue5a0\ue5f2\ufb09\ue5be\ue5dc\ue663\ue655\ue637\ue61f\ue6b6", 58690));
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         this.Il0 = false;
      }
   }

   private boolean II(Il_l.II var1, String var2) {
      for (int var3 = 0; var3 < var1.IIlO(); var3++) {
         String var4 = (String)var1.II(var3);
         if (var4.equals(var2)) {
            return true;
         }
      }

      return false;
   }

   private void I_0() {
      this.IIll.I_1O();
      this.IIl1.I_1O();
      this.IIOl();
      this.IIIl(II__("\ue452\ue582\ue5a0\ue5e7\ue54d\ue5bc\ue5dc\ue66f\ue655\ue6b9\ue616\ue6b7\ue6d4\uf80c\ue6d4\ue740\ue757\ue725", 58690));
   }

   public void II_I() {
      Il1_.II()
         .III()
         .II(II__("\ue50f\ue504\ue5ee\ue5ea\ue59e\ue58e\ue599\ue66f\ue61a\ue749\uf8ab", 58690))
         .II(II__("\ue50fﯖ\ue5e3\ue5bf\ue5ed\ue5b8\ue588\ue63b\ue60b", 58690), this.II(this.IIll), 8, null)
         .II(II__("\ue50fﯖ\ue5e3\ue5bf\ue5ed\ue5b8\ue588\ue63b\ue608", 58690), this.II(this.IIl1), 9, null)
         .II(II__("\ue51a\ue504\ue5ed\ue5bf\ue5ed\ue5b8\ue588\ue63b\ue72a\uf88a", 58690), "", 10, null)
         .II(II__("\ue51a\ue592\ue5e1\ue5bf\ue5ea\ue5b2\ue51c\ue675\ue61a\ue61b\uf8a1", 58690), "", 11, null)
         .II(II__("\ue513\ue514\ue5e1\ue5e6\ue59e\ue5b1ﭝ\ue672", 58690), "", 20, null)
         .II(this)
         .I__0();
   }

   private String II(Il_l.II var1) {
      return var1.IIlO() == 0
         ? II__("\ue56a\ue535\ue5f2פֿ\ue5d0\ue5ba\ue5d5", 58690)
         : II__("\ue56a", 58690) + var1.IIlO() + II__("\ue562\ue50c\ue573\ue5f1\ue597", 58690);
   }

   private void I_0I() {
      StringBuilder var1 = new StringBuilder();
      var1.append(II__("\ue57f\ue55c\ue5bd\ue5bf\ue5ed\ue598\ue5a8\ue63b\ue60b\ue679\ue645\ue6aa\ue68b\ue6df", 58690));
      if (this.IIll.IIlO() == 0) {
         var1.append(II__("\ue56a\ue535\ue5f2פֿ\ue5d0\ue5ba\ue5d5\ue611", 58690));
      } else {
         for (int var2 = 0; var2 < this.IIll.IIlO(); var2++) {
            String var3 = (String)this.IIll.II(var2);
            String[] var4 = Il_o.II(var3, '\n');
            String var5 = var4[0];
            var1.append(II__("\ue56f\ue541", 58690)).append(var5).append(II__("\ue548", 58690));
         }
      }

      var1.append(II__("\ue548\ue55c\ue5bd\ue5a2\ue59e\ue58e\ue5b9\ue64f\ue61a\ue66b\ue658\ue6aa\ue68b\ue6e8\ue6fe", 58690));
      if (this.IIl1.IIlO() == 0) {
         var1.append(II__("\ue56a\ue535\ue5f2פֿ\ue5d0\ue5ba\ue5d5", 58690));
      } else {
         for (int var6 = 0; var6 < this.IIl1.IIlO(); var6++) {
            String var7 = (String)this.IIl1.II(var6);
            String[] var8 = Il_o.II(var7, '\n');
            String var9 = var8[0];
            var1.append(II__("\ue56f\ue541", 58690)).append(var9);
            if (var6 < this.IIl1.IIlO() - 1) {
               var1.append(II__("\ue548", 58690));
            }
         }
      }

      II.II(var1.toString());
   }

   private void IIIl(String var1) {
      I1_I.II.IIII(var1, 0);
   }

   private void IIOI() {
      String var1 = IlIO.IIII(II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue60b", 58690), "");
      if (!Il_o.III1(var1)) {
         String[] var2 = Il_o.II(var1, '|');
         this.IIll.I_1O();

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (!Il_o.III1(var2[var3])) {
               this.IIll.III(var2[var3]);
            }
         }
      }

      String var5 = IlIO.IIII(II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue608", 58690), "");
      if (!Il_o.III1(var5)) {
         String[] var6 = Il_o.II(var5, '|');
         this.IIl1.I_1O();

         for (int var4 = 0; var4 < var6.length; var4++) {
            if (!Il_o.III1(var6[var4])) {
               this.IIl1.III(var6[var4]);
            }
         }
      }
   }

   private void IIOl() {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < this.IIll.IIlO(); var2++) {
         var1.append((String)this.IIll.II(var2));
         if (var2 < this.IIll.IIlO() - 1) {
            var1.append(II__("\ue53e", 58690));
         }
      }

      IlIO.IIII(II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue60b", 58690), var1.toString());
      StringBuilder var4 = new StringBuilder();

      for (int var3 = 0; var3 < this.IIl1.IIlO(); var3++) {
         var4.append((String)this.IIl1.II(var3));
         if (var3 < this.IIl1.IIlO() - 1) {
            var4.append(II__("\ue53e", 58690));
         }
      }

      IlIO.IIII(II__("\ue507\ue510\ue5f5\ue5f6\ue5ce\ue58e\ue599\ue66f\ue608", 58690), var4.toString());
   }

   public static class II {
      public int I1ll;
      public String II_;
      public int I1l1;
      public short III;
      public boolean Il0I;
      public boolean Il0l;
      public int I1l_;
      public long IIoo;

      public II() {
      }

      public II(int var1, String var2) {
         this.I1ll = var1;
         this.II_ = var2;
      }

      public II(int var1, short var2, boolean var3, boolean var4) {
         this.I1ll = var1;
         this.III = var2;
         this.Il0I = var3;
         this.Il0l = var4;
      }
   }
}
