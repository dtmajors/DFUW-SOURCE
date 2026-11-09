public enum dcm$b {
   gdc,
   gdd;

   public static dcm$b getSkillControllerType(String var0) {
      if (var0 == null) {
         return null;
      }

      dcm$b[] var1 = values();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }
}
