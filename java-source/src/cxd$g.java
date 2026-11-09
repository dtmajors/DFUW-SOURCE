import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cxd$g {
   fRa,
   fRb,
   fRc,
   fRd,
   fRe,
   fRf,
   fRg,
   fRh,
   fRi;

   public static List<cxd$g> Values = Collections.unmodifiableList(Arrays.asList(cxd$g.class.getEnumConstants()));

   public static cxd$g getCategoryType(String var0) {
      if (var0 == null) {
         lfn.b(5, "MagicSkillCategoryTypes", "getCategoryType() CategoryName is null.");
         return null;
      }

      int var1 = 0;

      for (int var2 = Values.size(); var1 < var2; var1++) {
         if (Values.get(var1).name().equalsIgnoreCase(var0)) {
            return Values.get(var1);
         }
      }

      lfn.b(5, "MagicSkillCategoryTypes", "getCategoryType() CategoryName '" + var0 + "' is invalid.");
      return null;
   }
}
