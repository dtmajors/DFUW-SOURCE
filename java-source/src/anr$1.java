import java.util.Comparator;

final class anr$1 implements Comparator<cxc> {
   public int a(cxc var1, cxc var2) {
      float var3 = var1.Bt();
      float var4 = var2.Bt();
      if (var3 > var4) {
         return -1;
      } else {
         return var3 < var4 ? 1 : var1.f(var2);
      }
   }
}
