package main;

public final class I1 implements I1_1 {
   public int I1l;
   public int IoI_;
   public int IoIO;
   public String IIo1;
   public long IlO;
   public String[] IIIo;
   public byte II1_;
   public byte III;
   private int IIOo;
   public int IoI0;
   public int IoIo;
   public String[] IIl;
   public static I_lO II1 = new I_lO(IIoO("霢靓韟韔鞣鞜顯顊頩", 38740));

   public static void II(I1 var0, int var1, boolean var2) {
      for (int var3 = 0; var3 < II1.size(); var3++) {
         I1 var4;
         if ((var4 = (I1)II1.elementAt(var3)).I1l == var0.I1l) {
            II1.removeElement(var4);
            if (!var2) {
               II1.insertElementAt(var0, var3);
               return;
            }

            II1.insertElementAt(var0, 0);
            return;
         }

         if (var4.IoIo != 0 && var4.IoI0 == var4.IoIo) {
            II1.removeElement(var4);
         }
      }

      if (var1 == -1) {
         II1.addElement(var0);
      } else {
         II1.insertElementAt(var0, 0);
      }

      if (II1.size() > 20) {
         II1.removeElementAt(II1.size() - 1);
      }
   }

   public void III(IO1l var1, int var2, int var3) {
      IO1I var4 = IO1I.III_;
      if (this.III == 0) {
         var4 = IO1I.II;
      } else if (this.III == 1) {
         var4 = IO1I.III0;
      } else if (this.III == 2) {
         var4 = IO1I.IIIO;
      }

      if (this.IoI_ == 0) {
         var4.II(var1, this.IIo1, var2 + 3, var3 + 1, 0);
         if (this.II1_ == 0) {
            IO1I.IIlO.II(var1, this.IIIo[0] + (this.IIIo.length > 1 ? IIoO("靺靝鞼", 38740) : ""), var2 + 3, var3 + 11, 0);
         } else {
            IO1I.IIl0.II(var1, this.IIIo[0] + (this.IIIo.length > 1 ? IIoO("靺靝鞼", 38740) : ""), var2 + 3, var3 + 11, 0);
         }

         IO1I.IIlO.II(var1, I_1l.IIIO(this.IIOo) + IIoO("靴", 38740) + IO11.I0, var2 + II.II.llO0 - 3, var3 + 1, 1);
      }

      if (this.IoI_ == 1) {
         var4.II(var1, this.IIo1 + IIoO("靴靛", 38740) + this.IoI0 + IIoO("靻", 38740) + this.IoIo + IIoO("靽", 38740), var2 + 3, var3 + 1, 0);
         IO1I.IIlo.II(var1, IO11.IO_1 + IIoO("靴", 38740) + I_1l.IIIO(this.IIOo) + IIoO("靴", 38740) + IO11.I0, var2 + 3, var3 + 11, 0);
      }

      if (this.IoI_ == 2) {
         var4.II(var1, this.IIo1, var2 + 3, var3 + 1, 0);
         IO1I.IIlo.II(var1, IO11.IO0o, var2 + 3, var3 + 11, 0);
      }
   }

   @Override
   public void II(int var1, Object var2) {
   }

   public void IIl1() {
      if (this.IlO != 0L) {
         this.IIOo = (int)(System.currentTimeMillis() / 1000L - this.IlO);
      }
   }
}
