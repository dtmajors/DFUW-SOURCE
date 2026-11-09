public enum bwu$a {
   dWZ,
   dXa,
   dXb,
   dXc;

   public static bwu$a getNaturalMissileTypes(String var0) {
      if (var0 == null) {
         lfn.b(5, "NaturalMissileTypes", "getNaturalMissileTypes() NaturalMissileName is null.");
         return null;
      }

      bwu$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "NaturalMissileTypes", "getNaturalMissileTypes() NaturalMissileName '" + var0 + "' is invalid.");
      return null;
   }
}
