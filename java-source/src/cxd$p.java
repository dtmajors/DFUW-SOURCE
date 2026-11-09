public enum cxd$p {
   fSb,
   fSc,
   fSd,
   fSe,
   fSf,
   fSg,
   fSh,
   fSi,
   fSj,
   fSk,
   fSl,
   fSm,
   fSn;

   public static cxd$p getSkillPartType(String var0) {
      if (var0 == null) {
         lfn.b(5, "SkillPartTypes", "getSkillPartType() SkillPartName is null.");
         return null;
      }

      cxd$p[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "SkillPartTypes", "getSkillPartType() SkillPartName '" + var0 + "' is invalid.");
      return null;
   }
}
