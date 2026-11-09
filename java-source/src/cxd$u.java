public enum cxd$u {
   fSQ,
   fSR,
   fSS;

   public static cxd$u getTimeStepListType(String var0) {
      if (var0 == null) {
         lfn.b(5, "TimeStepListTypes", "getTimeStepListType() TimeStepListName is null.");
         return null;
      }

      cxd$u[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "TimeStepListTypes", "getTimeStepListType() TimeStepListName '" + var0 + "' is invalid.");
      return null;
   }
}
