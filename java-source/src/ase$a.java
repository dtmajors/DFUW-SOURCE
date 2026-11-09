import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ase$a {
   bTJ,
   bTK,
   bTL;

   public static final List<ase$a> Values = Collections.unmodifiableList(Arrays.asList(ase$a.class.getEnumConstants()));

   public static ase$a getValue(String var0) {
      for (ase$a var2 : Values) {
         if (var2.toString().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return bTK;
   }
}
