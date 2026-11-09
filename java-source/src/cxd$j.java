public enum cxd$j {
   fRu,
   fRv,
   fRw,
   fRx,
   fRy,
   fRz,
   fRA,
   fRB;

   public static cxd$j getPerformingObjectType(String var0) {
      if (var0 == null) {
         lfn.b(5, "PerformingObjectTypes", "getPerformingObjectType() PerformingObjectName is null.");
         return null;
      }

      cxd$j[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "PerformingObjectTypes", "getPerformingObjectType() PerformingObjectName '" + var0 + "' is invalid.");
      return null;
   }
}
