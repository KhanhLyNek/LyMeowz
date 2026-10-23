package main;

public class IIol {
   public String II1;
   public String II1I;
   public int Il0O;
   public long II0o;
   public static Il_l.II III_ = new Il_l.II();
   public static Il_l.II IIIO = new Il_l.II();
   public static boolean Il_I = true;

   public IIol(String var1) {
      try {
         if (Il_o.III1(var1) || Il_o.III1(var1.trim())) {
            throw new IllegalArgumentException(II1I("熍熅牭牟牪爄狭狔犵犄獣獆獢猂珡珱珐玲玈琻瑘琼瑘瓹瓃璹璘申畝産畐痪痃疽疘癲", 29134));
         }

         var1 = Il_o.II(var1, II1I("熌熢牟牸牪", 29134), "");
         var1 = Il_o.II(var1, II1I("燮熛泧牊牪爑狽氂犲狅獬獊涅猏玠珫洟玴珜", 29134), II1I("熲", 29134));
         var1 = Il_o.II(var1, II1I("燮熌牼牛爯爈狺犇犧犑猤", 29134), II1I("熲", 29134));
         String[] var2 = Il_o.II(var1, '|');
         if (var2.length < 2) {
            throw new IllegalArgumentException(II1I("熇熃牺牊爦爀独犇犥犍獥獗獢猇珯班珓玼玈琡琚", 29134) + var1);
         }

         this.II1 = var2[0].trim();
         this.II1I = var2[1].trim();
         if (Il_o.III1(this.II1) || Il_o.III1(this.II1I)) {
            throw new IllegalArgumentException(II1I("熌熂牿牘牪爇狩狊犣狅獫獑獢猌珡珯玞玳玝瑶瑟瑹琛瓶瓘璻璛畧甒申甕疯痋疠疜癿癓", 29134));
         }

         this.Il0O = this.II(this.II1I);
         this.II0o = System.currentTimeMillis();
      } catch (Exception var3) {
      }
   }

   public int II(String var1) {
      try {
         if (var1 == null || IOlO.II11 == null) {
            return -1;
         }

         for (int var2 = 0; var2 < IOlO.II11.length; var2++) {
            if (IOlO.II11[var2] != null && IOlO.II11[var2].equals(var1)) {
               return var2;
            }
         }
      } catch (Exception var3) {
      }

      return -1;
   }

   public static void IIIO(IO1l var0) {
      if (Il_I) {
         try {
            if (III_ != null) {
               byte var1 = 107;
               int var2 = II.IIl - 3;

               for (int var3 = 0; var3 < III_.IIlO(); var3++) {
                  IIol var4 = (IIol)III_.II(var3);
                  if (II.II(II.IIl - 21, var1, 17, 10)) {
                     var0.Illl(65280);
                     var0.III_(II.IIl - 21, var1, 17, 10);
                  }

                  var4.II(var0, var2, var1, 1);
                  var1 += 10;
               }
            }
         } catch (Exception var5) {
         }
      }
   }

   public static void I_Il() {
      if (Il_I) {
         Ilol var0 = Ilol.II();
         if (var0 == null) {
            return;
         }

         byte var1 = 107;

         for (int var2 = 0; var2 < III_.IIlO(); var2++) {
            if (II.II(II.IIl - 21, var1, 17, 10) && II.III0 && II.IIIo) {
               IIol var3 = (IIol)III_.II(var2);
               if (!IlO_.II_O()) {
                  IlO_.II_l(var3.Il0O);
               } else {
                  IlO_.I_o0();
               }

               Ilol.II().II = null;
               II.IIlI();
               return;
            }

            var1 += 10;
         }
      }
   }

   public void II(IO1l var1, int var2, int var3, int var4) {
      if (Il_I) {
         try {
            if (var1 == null) {
               return;
            }

            long var5 = (System.currentTimeMillis() - this.II0o) / 1000L;
            int var7 = (int)var5;
            IO1I var8 = IO1I.IIl_;
            if (IOlO.l1oI == this.Il0O) {
               var8 = IO1I.IIl0;
               if (I1_I.II_O != null) {
                  for (int var9 = 0; var9 < I1_I.II_O.size(); var9++) {
                     try {
                        Object var10 = I1_I.II_O.elementAt(var9);
                        if (var10 instanceof Ilol) {
                           Ilol var11 = (Ilol)var10;
                           if (var11.IIO1 != null && var11.IIO1.equals(this.II1)) {
                              var8 = IO1I.IIl0;
                              break;
                           }
                        }
                     } catch (Exception var12) {
                     }
                  }
               }
            }

            String var14;
            if (var7 < 60) {
               var14 = var7 + II1I("熽燍牗牬爥爴", 29134);
            } else {
               long var15 = var5 / 60L;
               var14 = var15 + II1I("熾熅爬牰爍爆狕", 29134);
            }

            StringBuilder var16 = new StringBuilder();
            var16.append(this.II1).append(II1I("燮燀爬", 29134)).append(this.II1I).append(II1I("燮燀爬", 29134)).append(var14);
            String var17 = var16.toString();
            if (var8 != null) {
               var8.II(var1, var17, var2, var3, var4, IO1I.IIlI);
            }
         } catch (Exception var13) {
         }
      }
   }

   public static boolean IIIl(String var0) {
      if (IIIO.IIlO() > 0 && var0 != null) {
         String var1 = var0.toLowerCase();

         for (int var2 = 0; var2 < IIIO.IIlO(); var2++) {
            String var3 = (String)IIIO.II(var2);
            if (!Il_o.III1(var3) && Il_o.II(var1, var3.toLowerCase())) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
