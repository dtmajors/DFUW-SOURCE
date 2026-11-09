import java.util.Comparator;

class ihf$16 implements Comparator<igx> {
   ihf$16(ihf var1) {
      this.lVT = var1;
   }

   public int a(igx var1, igx var2) {
      int var3 = var1.cUF().cTv() - var2.cUF().cTv();
      return var3 != 0 ? var3 : var1.cUF().cTw() - var2.cUF().cTw();
   }
}
