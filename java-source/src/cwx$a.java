public enum cwx$a {
   fGr,
   fGs,
   fGt,
   fGu,
   fGv,
   fGw,
   fGx;

   public static cwx$a getSkillState(int var0) {
      cwx$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "SkillStates", "getSkillState() Ordinal is invalid.");
      return null;
   }
}
