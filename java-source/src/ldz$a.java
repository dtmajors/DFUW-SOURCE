import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ldz$a {
   rgB,
   rgC,
   rgD,
   rgE;

   public static final List<ldz$a> Values = Collections.unmodifiableList(Arrays.asList(ldz$a.class.getEnumConstants()));

   public static int getOrdinal(ldz$a var0) {
      return Values.indexOf(var0);
   }

   public static ldz$a getValue(String var0) {
      for (ldz$a var2 : Values) {
         if (var2.name().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return null;
   }

   public static boolean[] getPeriodsAsBooleans() {
      boolean[] var0 = new boolean[Values.size()];
      Arrays.fill(var0, true);
      return var0;
   }
}
