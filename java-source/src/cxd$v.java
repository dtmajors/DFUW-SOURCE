public enum cxd$v {
   fSU,
   fSV,
   fSW,
   fSX;

   public static cxd$v getVisibilityType(String var0) {
      if (var0 == null) {
         lfn.b(5, "VisibilityTypes", "getVisibilityType() VisibilityName is null.");
         return null;
      }

      cxd$v[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "VisibilityTypes", "getVisibilityType() VisibilityName '" + var0 + "' is invalid.");
      return null;
   }
}
