import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cjq$a {
   eEe,
   eEf;

   public static final List<cjq$a> ListOfValue = Collections.unmodifiableList(Arrays.asList(cjq$a.class.getEnumConstants()));

   public static final int getValueCount() {
      return ListOfValue.size();
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final cjq$a getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? ListOfValue.get(var0) : null;
   }

   public static final cjq$a getValueByName(String var0) {
      for (cjq$a var2 : ListOfValue) {
         if (var2.toString().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return null;
   }
}
