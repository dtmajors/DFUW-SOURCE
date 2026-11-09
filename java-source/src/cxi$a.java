public enum cxi$a {
   fWt,
   fWu,
   fWv,
   fWw,
   fWx;

   public static cxi$a getRadiusType(int var0) {
      cxi$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "RadiusTypes", "getRadiusType() Ordinal is invalid.");
      return null;
   }

   public static cxi$a getRadiusType(String var0) {
      if (var0 == null) {
         lfn.b(5, "RadiusTypes", "getRadiusType() RadiusName is null.");
         return null;
      }

      cxi$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "RadiusTypes", "getRadiusType() RadiusName '" + var0 + "' is invalid.");
      return null;
   }
}
