public enum cxd$f {
   fQW,
   fQX,
   fQY;

   public static cxd$f getHitLocationType(int var0) {
      cxd$f[] var1 = cxd$f.class.getEnumConstants();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "HitLocationTypes", "getHitLocationType() Ordinal is invalid.");
      return null;
   }

   public static cxd$f getHitLocationTypeForHitLocation(int var0) {
      switch (var0) {
         case -1:
            return fQW;
         case 0:
            return fQX;
         case 1:
            return fQY;
         default:
            lfn.b(5, "HitLocationTypes", "getHitLocationTypeForHitLocation() Invalid hitlocation provided: " + var0);
            assert false;
            return fQW;
      }
   }
}
