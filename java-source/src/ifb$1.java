import java.util.Comparator;

class ifb$1 implements Comparator<ifb$c> {
   ifb$1(ifb var1) {
      this.lQj = var1;
   }

   public int a(ifb$c var1, ifb$c var2) {
      float var3 = ifb.b(this.lQj, var1.lQt);
      float var4 = ifb.b(this.lQj, var2.lQt);
      if (var3 < var4) {
         return -1;
      }

      if (var3 > var4) {
         return 1;
      }

      String var5 = var1.lQt.awO().esy();
      String var6 = var2.lQt.awO().esy();
      return var5.compareToIgnoreCase(var6);
   }
}
