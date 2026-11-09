public enum dcx$a {
   gdE,
   gdF,
   gdG,
   gdH;

   public static dcx$a getSkillTimerType(String var0) {
      if (var0 == null) {
         lfn.b(5, "SkillTimerTypes", "getSkillTimerType() SkillTimerName is null.");
         return null;
      }

      dcx$a[] var1 = values();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "SkillTimerTypes", "getSkillTimerType() SkillTimerName '" + var0 + "' is invalid.");
      return null;
   }
}
