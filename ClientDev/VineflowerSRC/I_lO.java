package main;

import java.util.Vector;

public class I_lO extends Vector {
   private String IIoo;

   public I_lO(String var1) {
      this.IIoo = var1;
   }

   public I_lO() {
   }

   @Override
   public synchronized void removeAllElements() {
      super.removeAllElements();
   }

   @Override
   public synchronized boolean removeElement(Object var1) {
      return super.removeElement(var1);
   }

   @Override
   public synchronized void removeElementAt(int var1) {
      super.removeElementAt(var1);
   }

   @Override
   public synchronized void addElement(Object var1) {
      if (this.size() > 1000) {
         System.out.println(Il_0("軯軎躭躌轳轒輱輐迷迖辵辔遻遚逹逘郿郞邽邜邃酢酁鄠鄇釦釅醤醋鉪鉉鈨鈏鋮鋍銬銓鍲鍑錰錗鏶鏕鎴", 36499) + this.IIoo + Il_0("躳軜躤躝輲輎", 36499) + this.size());
      }

      super.addElement(var1);
   }

   @Override
   public synchronized void insertElementAt(Object var1, int var2) {
      if (this.size() > 1000) {
         System.out.println(Il_0("軯軎躭躌轳轒輱輐迷迖辵辔遻遚逹逘郿郞邽邜邃酢酁鄠鄇釦釅醤醋鉪鉉鈨鈏鋮鋍銬銓鍲鍑錰錗鏶鏕鎴", 36499) + this.IIoo + Il_0("躳軜躤躝輲輎", 36499) + this.size());
      }

      super.insertElementAt(var1, var2);
   }
}
