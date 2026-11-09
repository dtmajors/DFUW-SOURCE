public enum cxd$e {
   fQJ,
   fQK,
   fQL,
   fQM,
   fQN,
   fQO,
   fQP,
   fQQ,
   fQR,
   fQS,
   fQT,
   fQU;

   public static cxd$e getDynamicAnimationType(String var0) {
      if (var0 == null) {
         lfn.b(5, "DynamicAnimationTypes", "getDynamicAnimationType() DynamicAnimationName is null.");
         return null;
      }

      cxd$e[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "DynamicAnimationTypes", "getDynamicAnimationType() DynamicAnimationName '" + var0 + "' is invalid.");
      return null;
   }
}
