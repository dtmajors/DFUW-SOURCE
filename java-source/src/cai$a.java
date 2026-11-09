public enum cai$a {
   eeL,
   eeM,
   eeN;

   public static cai$a getMeshItemType(String var0) {
      if (var0 == null) {
         return null;
      }

      cai$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }
}
