public enum cxd$l {
   fRN,
   fRO,
   fRP,
   fRQ,
   fRR;

   public static cxd$l getRelationType(String var0) {
      if (var0 == null) {
         lfn.b(5, "RelationTypes", "getRelationType() RelationName is null.");
         return null;
      }

      cxd$l[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "RelationTypes", "getRelationType() RelationName '" + var0 + "' is invalid.");
      return null;
   }

   public static boolean isImportantRelation(cxd$l var0) {
      switch (var0) {
         case fRN:
         case fRP:
            return true;
         default:
            return false;
      }
   }
}
