import java.util.Comparator;

class ihf$21 implements Comparator<igx> {
   ihf$21(ihf var1) {
      this.lVT = var1;
   }

   public int a(igx var1, igx var2) {
      int var3 = var2.cUF().cTv() - var1.cUF().cTv();
      return var3 != 0 ? var3 : var2.cUF().cTw() - var1.cUF().cTw();
   }
}
