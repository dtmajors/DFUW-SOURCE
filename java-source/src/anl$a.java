import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum anl$a {
   bGc,
   bGd,
   bGe,
   bGf,
   bGg;

   public static List<anl$a> Values = Collections.unmodifiableList(Arrays.asList(anl$a.class.getEnumConstants()));

   public String Lj() {
      return "%" + (getArrayPositionForParameter(this) + 1);
   }

   public static int getArrayPositionForParameter(anl$a var0) {
      switch (var0) {
         case bGc:
            return 0;
         case bGd:
            return 1;
         case bGe:
            return 2;
         case bGf:
            return 3;
         case bGg:
            return 4;
         default:
            return -1;
      }
   }
}
