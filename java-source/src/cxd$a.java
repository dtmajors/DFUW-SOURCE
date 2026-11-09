public enum cxd$a {
   fQf,
   fQg;

   public static cxd$a getAnimationInfoType(String var0) {
      if (var0 == null) {
         lfn.b(5, "AnimationInfoTypes", "getAnimationInfoType() AnimationInfoName is null.");
         return null;
      }

      cxd$a[] var1 = cxd$a.class.getEnumConstants();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "AnimationInfoTypes", "getAnimationInfoType() AnimationInfoName '" + var0 + "' is invalid.");
      return null;
   }
}
