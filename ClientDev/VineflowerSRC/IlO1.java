package main;

public class IlO1 {
   public int I_1O;
   public int I_10;
   public int I_1o;
   public String II_1;
   public int I__;
   public int I__I;
   public String II__;
   public String II_O;
   public boolean Il0O;
   public int I1;
   public int I1I;
   private boolean Il00;
   private long IlIl;
   private IO1 II;
   private boolean Il0o;
   private long IlI1;
   private boolean Ilo;
   private long IlI_;
   private int I__l;
   private int I__1 = 0;
   private long IlIO = 0L;
   private long IlI0 = 300L;
   private int I___ = 0;
   private long IlIo = 0L;
   private static final long Ill = 200L;
   private boolean IloI = false;

   public IlO1(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7, int var8) {
      this.I_1O = var1;
      this.I_10 = var2;
      this.I_1o = var3;
      this.I__ = var4;
      this.I__I = var5;
      this.Il0O = var6;
      this.I1 = var7;
      this.I1I = var8;
      this.Ilo = false;
      this.IlI_ = 0L;
      this.I__l = 0;
      this.II_1 = null;
      this.II__ = null;
      this.II_O = null;
      this.I___ = 0;
      this.IlIo = 0L;
      this.IloI = false;
   }

   public IlO1(int var1, int var2, String var3, String var4, String var5, boolean var6, int var7, int var8) {
      this.I_1O = var1;
      this.I_10 = var2;
      this.I_1o = -1;
      this.I__ = -1;
      this.I__I = -1;
      this.II_1 = var3;
      this.II__ = var4;
      this.II_O = var5;
      this.Il0O = var6;
      this.I1 = var7;
      this.I1I = var8;
      this.Ilo = false;
      this.IlI_ = 0L;
      this.I__l = 0;
      this.I___ = 0;
      this.IlIo = 0L;
      this.IloI = false;
   }

   public IlO1(int var1, int var2, String var3, boolean var4, int var5, int var6) {
      this(var1, var2, var3, null, null, var4, var5, var6);
   }

   public void I_ol() {
      if (!this.Il0O) {
         if (this.I_1o == -1 && this.I_10 == -1) {
            IO1 var3 = this.II();
            if (var3 != null) {
               this.II(var3);
            }
         } else {
            if (this.I_10 == -1 || this.I_1o == -1 && (this.II_1 == null || this.II_1.length() == 0)) {
               return;
            }

            if (!this.Il0o) {
               Il_1.II10(this.I_10);
               this.Il0o = true;
               this.IlI1 = System.currentTimeMillis();
               this.IloI = false;
               this.I___ = 0;
            } else {
               if (System.currentTimeMillis() - this.IlI1 < 50L) {
                  return;
               }

               if (!this.IloI) {
                  I_0_.II().IIoI(this.I_10);
                  this.IloI = true;
                  this.IlIo = System.currentTimeMillis();
                  return;
               }

               if (System.currentTimeMillis() - this.IlIo < 200L) {
                  return;
               }

               if (this.II_1 != null && this.II_1.length() > 0) {
                  this.I_o1();
               } else {
                  boolean var1 = Ilol.II().II.II01 > 30;
                  int var2 = this.I_1o;
                  if (IOlO.l1oI == 19 && this.I_1O == 68 && Ilol.II().II.II01 == 23) {
                     var2 = 0;
                  }

                  if (IOlO.l1oI == 19 && this.I_1O == 109 && !var1) {
                     var2 = 1;
                  }

                  I_0_.II().II((short)this.I_10, (byte)var2);
                  if (this.I__ != -1) {
                     I_0_.II().II((short)this.I_10, (byte)this.I__);
                     if (this.I__I != -1) {
                        I_0_.II().II((short)this.I_10, (byte)this.I__I);
                     }
                  }

                  this.Il0o = false;
                  this.IloI = false;
               }
            }
         }
      } else if (this.I1 != -1 && this.I1I != -1) {
         Ilol.II().II = new I_ll(this.I1, this.I1I);
      }
   }

   private void I_o1() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.IlIo >= 10000L) {
         I_0_.II().II((short)this.I_10, (byte)0);
         II.II.I0OO();
         Ilol.II = null;
         this.I_o_();
      } else {
         switch (this.I___) {
            case 0:
               if (this.III_(this.II_1)) {
                  this.I___++;
                  this.IlIo = var1;
                  if (this.II__ == null || this.II__.length() == 0) {
                     this.I_o_();
                  }
               }
               break;
            case 1:
               if (this.II__ == null || this.II__.length() <= 0) {
                  this.I_o_();
               } else if (this.III_(this.II__)) {
                  this.I___++;
                  this.IlIo = var1;
                  if (this.II_O == null || this.II_O.length() == 0) {
                     this.I_o_();
                  }
               }
               break;
            case 2:
               if (this.II_O != null && this.II_O.length() > 0) {
                  this.III_(this.II_O);
               }

               this.I_o_();
         }
      }
   }

   private boolean III_(String var1) {
      if (var1 != null && var1.length() != 0) {
         if (II.II != null && II.II.II0 != null) {
            String var2 = this.III1(this.III0(var1)).trim();

            for (int var3 = 0; var3 < II.II.II0.size(); var3++) {
               try {
                  I1Il var4 = (I1Il)II.II.II0.elementAt(var3);
                  if (var4 != null && var4.IIoO != null) {
                     String var5 = this.III1(this.III0(var4.IIoO)).trim();
                     if (var5.equals(var2) || var5.indexOf(var2) >= 0) {
                        I_0_.II().II((short)this.I_10, (byte)var3);
                        II.II.I0OO();
                        Ilol.II = null;
                        return true;
                     }
                  }
               } catch (Exception var6) {
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private String III1(String var1) {
      if (var1 == null) {
         return "";
      }

      char[] var2 = var1.toCharArray();

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var2[var3] >= 'A' && var2[var3] <= 'Z') {
            var2[var3] = (char)(var2[var3] + ' ');
         }
      }

      return new String(var2);
   }

   private String III0(String var1) {
      if (var1 == null) {
         return "";
      }

      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (var4 != '\r') {
            if (var4 == '\n') {
               var2.append(' ');
            } else {
               var2.append(var4);
            }
         }
      }

      return var2.toString();
   }

   private void I_o_() {
      this.I___ = 0;
      this.IlIo = 0L;
      this.Il0o = false;
      this.IloI = false;
   }

   public IO1 II() {
      for (int var1 = 0; var1 < IOlO.IlI_.size(); var1++) {
         IO1 var2 = (IO1)IOlO.IlI_.elementAt(var1);
         if (this.III_().equals(this.II(var2.III))) {
            return var2;
         }
      }

      return null;
   }

   public String III_() {
      return IOlO.II11[this.I_1O];
   }

   public String II(I__O var1) {
      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < var1.II_O.length; var3++) {
         var2.append(var1.II_O[var3]);
         var2.append(IIO0("ᛕ", 5877));
      }

      return var2.toString().trim();
   }

   public void II(IO1 var1) {
      if (!this.Il00) {
         this.Il00 = true;
         this.IlIl = System.currentTimeMillis();
         this.II = var1;
         this.Ilo = false;
         this.IlI_ = 0L;
         this.I__l = 0;
         this.I__1 = 0;
         this.IlIO = 0L;
      } else {
         if (System.currentTimeMillis() - this.IlIl < 50L || this.Ilo && System.currentTimeMillis() - this.IlI_ < 50L) {
            return;
         }

         if (IOlO.l1oI == 166 && this.I_1O == 155) {
            IlO0.IOI_();
            this.I_oO();
            return;
         }

         int var2 = var1.IIoI < 60 ? 15 : (var1.II0o <= IOlO.l100 - 60 ? (var1.II0o + var1.IIoI) / 2 : IOlO.l100 - 15);
         short var3 = var1.IIol;
         if (var2 == -1 || var3 == -1) {
            this.I_oO();
            return;
         }

         int var4 = Math.abs(Ilol.II().I_o_ - var2);
         int var5 = Math.abs(Ilol.II().I_oO - var3);
         boolean var6 = var1.IIoI >= 60 && var1.II0o <= IOlO.l100 - 60;
         int var7 = var2;
         short var8 = var3;
         int var9 = var6 ? var2 : var2 + (Ilol.II().I_o_ < var2 ? -20 : 20);
         short var10 = var3;
         Ilol.II().IOI1 = Ilol.II().I_o_ < var2 ? 1 : -1;
         if (var4 > 30 || var5 > 30) {
            this.IIIO(var9, var10);
         } else if (!var6) {
            if (Ilol.II().II == null && System.currentTimeMillis() - this.IlIO >= this.IlI0) {
               Ilol.II().II = new I_ll(var7 - (Ilol.II().I_o_ < var2 ? -15 : 15), var8);
               this.I__1++;
            }

            if (this.I__1 >= 5 && Ilol.II().II == null) {
               this.II(Ilol.II().IOI1, true);
               this.I__1 = 0;
               this.IlIO = System.currentTimeMillis();
            }

            if (Ilol.II().II == null) {
               this.IlIO = System.currentTimeMillis();
            }
         } else if (Ilol.II().II == null) {
            if (var1.I00_) {
               I_0_.II().IoO0();
            } else {
               I_0_.II().Io_o();
            }

            this.I_oO();
         }
      }
   }

   private void II(int var1, boolean var2) {
      if (var2) {
         if (!Ilol.II().I10l) {
            switch (var1) {
               case -1:
                  Ilol.II().IOI1 = -1;
                  I1_I.II().IIOO(-4);
                  break;
               case 0:
                  I1_I.II().IIOO(0);
                  break;
               case 1:
                  Ilol.II().IOI1 = 1;
                  I1_I.II().IIOO(4);
            }
         }
      } else {
         switch (var1) {
            case -1:
               if (Ilol.II().IOI1 == 1) {
                  Ilol.II().IOI1 = -1;
               }

               if (!Ilol.II().I10l) {
                  if (Ilol.II().I_o_ - Ilol.II().IO00 != 0) {
                     I_0_.II().IoO();
                  }

                  Ilol.II().IOIl = 2;
                  Ilol.II().I_o0 = -Ilol.II().IOIo;
               }

               Ilol.II().I_IO = false;
               break;
            case 1:
               if (Ilol.II().IOI1 == -1) {
                  Ilol.II().IOI1 = 1;
               }

               if (!Ilol.II().I10l) {
                  if (Ilol.II().I_o_ - Ilol.II().IO00 != 0) {
                     I_0_.II().IoO();
                  }

                  Ilol.II().IOIl = 2;
                  Ilol.II().I_o0 = Ilol.II().IOIo;
               }

               Ilol.II().I_IO = false;
         }
      }
   }

   private void IIIO(int var1, int var2) {
      Il_0.III1(var1, var2);
      this.Ilo = true;
      this.IlI_ = System.currentTimeMillis();
      this.IlIl = this.IlI_;
      this.I__l++;
   }

   private void I_oO() {
      this.Il00 = false;
      this.II = null;
      this.Ilo = false;
      this.IlI_ = 0L;
      this.I__l = 0;
      this.I___ = 0;
      this.IlIo = 0L;
      this.IloI = false;
   }
}
