package main;

public final class I11 extends I_lO {
   public static I11 II = new I11(IlIo("㺘㽼㽅", 16116));
   public static I11 III = new I11(IlIo("㺙㽺㽖", 16116));
   public static I11 IIII = new I11(IlIo("㺙㽺㽖㽣", 16116));
   public static I11 IIIl = new I11(IlIo("㺜㽺", 16116));

   private void III() {
      for (int var1 = this.size() - 1; var1 >= 0; var1--) {
         I111 var2;
         if ((var2 = (I111)this.elementAt(var1)) != null) {
            var2.IIl1();
            if (var2.I1l1) {
               this.removeElementAt(var1);
            }
         }
      }
   }

   public static void IIl1() {
      IIIl.III();
      III.III();
      IIII.III();
      II.III();
   }

   public void II(IO1l var1) {
      for (int var2 = 0; var2 < this.size(); var2++) {
         I111 var3;
         if ((var3 = (I111)this.elementAt(var2)) != null && !var3.I1l1) {
            ((I111)this.elementAt(var2)).II(var1);
         }
      }
   }

   private void IIII() {
      for (int var1 = this.size() - 1; var1 >= 0; var1--) {
         I111 var2;
         if ((var2 = (I111)this.elementAt(var1)) != null) {
            var2.I1l1 = true;
            this.removeElementAt(var1);
         }
      }
   }

   public static void IOlI() {
      IIIl.IIII();
      II.IIII();
      III.IIII();
      IIII.IIII();
   }

   public static void II(I111 var0) {
      IIIl.addElement(var0);
   }

   public static void III(I111 var0) {
      III.addElement(var0);
   }

   public static void IIII(I111 var0) {
      IIII.addElement(var0);
   }

   public static void IIIl(I111 var0) {
      II.addElement(var0);
   }

   private I11(String var1) {
      super(var1);
   }
}
