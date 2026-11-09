public enum cxd$r {
   fSt,
   fSu,
   fSv,
   fSw;

   public static cxd$r getSynchronizedObjectType(String var0) {
      if (var0 == null) {
         lfn.b(5, "SynchronizedObjectTypes", "getSynchronizedObjectType() SynchronizedObjectName is null.");
         return null;
      }

      cxd$r[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "SynchronizedObjectTypes", "getSynchronizedObjectType() SynchronizedObjectName '" + var0 + "' is invalid.");
      return null;
   }
}
