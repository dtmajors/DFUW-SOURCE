import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cxd$h {
   fRk,
   fRl,
   fRm,
   fRn,
   fRo;

   public static List<cxd$h> Values = Collections.unmodifiableList(Arrays.asList(cxd$h.class.getEnumConstants()));

   public static cxd$h getModeType(String var0) {
      if (var0 == null) {
         lfn.b(5, "MagicSkillModeTypes", "getModeType() ModeName is null.");
         return null;
      }

      int var1 = 0;

      for (int var2 = Values.size(); var1 < var2; var1++) {
         if (Values.get(var1).name().equalsIgnoreCase(var0)) {
            return Values.get(var1);
         }
      }

      lfn.b(5, "MagicSkillModeTypes", "getModeType() ModeName '" + var0 + "' is invalid.");
      return null;
   }

   public static cxd$h getMagicSkillModeTypeFromSkillType(int var0) {
      lhg var1 = (lhg)cxd.Ht().acv(var0);
      if (var1 == null) {
         lfn.b(5, "MagicSkillModeTypes", "getMagicSkillModeTypeFromSkillType() Invalid skilltype provided: " + var0);
         return fRk;
      } else {
         return var1.erW();
      }
   }
}
