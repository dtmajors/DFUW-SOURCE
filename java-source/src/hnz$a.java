import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum hnz$a {
   kQr(12),
   kQs(6),
   kQt(9),
   kQu(3),
   kQv(1),
   kQw(4),
   kQx(8),
   kQy(2);

   public static final List<hnz$a> ListOfValue = Collections.unmodifiableList(Arrays.asList(hnz$a.class.getEnumConstants()));
   private int kQz;

   hnz$a(int var3) {
      this.kQz = var3;
   }

   public boolean c(hnz$a var1) {
      return (this.kQz & var1.kQz) != 0;
   }

   public static hnz$a remove(hnz$a var0, hnz$a var1) {
      if (var0 == null) {
         return null;
      }

      if (var1 == null) {
         return var0;
      }

      int var2 = var0.kQz & var1.kQz;
      if (var2 == var0.kQz) {
         return var0;
      }

      for (hnz$a var4 : ListOfValue) {
         if (var4.kQz == var2) {
            return var4;
         }
      }

      return null;
   }
}
