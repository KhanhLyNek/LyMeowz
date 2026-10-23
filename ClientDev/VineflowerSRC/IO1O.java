package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class IO1O {
   SocketConnection II;

   public IO1O(String var1, int var2) {
      try {
         if (I0l_.lIll) {
            this.II = I0l_.II();
         } else {
            this.II = (SocketConnection)Connector.open(I1lI("坙圦國埬埃垱埞堬堍", 22314) + var1 + I1lI("圐", 22314) + var2);
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public void IIl1() {
      try {
         this.II.close();
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   public final DataOutputStream III() {
      try {
         return this.II.openDataOutputStream();
      } catch (IOException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public final DataInputStream III() {
      try {
         return this.II.openDataInputStream();
      } catch (IOException var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
