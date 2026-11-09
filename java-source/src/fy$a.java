import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum fy$a {
   TO,
   TP,
   TQ,
   TR,
   TS,
   TT,
   TU,
   TV;

   public static final List<fy$a> Values = Collections.unmodifiableList(Arrays.asList(fy$a.class.getEnumConstants()));

   public static fy$a getValue(int var0) {
      return var0 >= 0 && var0 < Values.size() ? Values.get(var0) : null;
   }
}
