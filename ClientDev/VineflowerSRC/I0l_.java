package main;

import javax.microedition.io.SocketConnection;

public final class I0l_ {
   public static final int ___0 = 14445;
   public static final boolean lIll = !I1o0("횧횁횓흭흘", 54977).equals(System.getProperty(I1o0("횯횒횐휰흒휺휝ퟶퟐힶ힒", 54977)));

   private I0l_() {
   }

   public static SocketConnection II() {
      I0l var0 = new I0l(1048576, I1o0("횵횏횬흻흏휪휞ퟨ", 54977));
      I0l var1 = new I0l(1048576, I1o0("횵횏횼흲흔휹휕ퟮ", 54977));
      Thread var2 = new Thread(new IOo_(var0.II(), var1.II()));
      var2.start();
      return new I0l1(var0, var1);
   }
}
