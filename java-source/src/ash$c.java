import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ash$c {
   bVi,
   bVj,
   bVk,
   bVl,
   bVm,
   bVn,
   bVo,
   bVp,
   bVq,
   bVr,
   bVs,
   bVt,
   bVu;

   public static final List<ash$c> Values = Collections.unmodifiableList(Arrays.asList(ash$c.class.getEnumConstants()));

   public static ash$c getType(String var0) {
      for (ash$c var2 : Values) {
         if (var2.name().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return null;
   }
}
