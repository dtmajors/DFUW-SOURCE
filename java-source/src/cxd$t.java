public enum cxd$t {
   fSJ,
   fSK,
   fSL,
   fSM,
   fSN,
   fSO;

   public static cxd$t getTargetObjectType(String var0) {
      if (var0 == null) {
         lfn.b(5, "TargetObjectTypes", "getTargetObjectType() TargetObjectName is null.");
         return null;
      }

      cxd$t[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "TargetObjectTypes", "getTargetObjectType() TargetObjectName '" + var0 + "' is invalid.");
      return null;
   }
}
