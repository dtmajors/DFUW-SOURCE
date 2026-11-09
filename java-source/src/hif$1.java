import java.util.Comparator;

final class hif$1 implements Comparator<hif$a> {
   public int a(hif$a var1, hif$a var2) {
      float var3 = var2.kve - var1.kve;
      if (var3 < 0.0F) {
         return -1;
      } else {
         return var3 > 0.0F ? 1 : 0;
      }
   }
}
