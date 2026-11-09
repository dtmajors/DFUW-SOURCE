import java.util.Comparator;

final class cwy$2 implements Comparator<cwz> {
   public int a(cwz var1, cwz var2) {
      if (var1.Ds() < var2.Ds()) {
         return -1;
      } else {
         return var1.Ds() > var2.Ds() ? 1 : var1.bfo().compareToIgnoreCase(var2.bfo());
      }
   }
}
