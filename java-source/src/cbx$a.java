public enum cbx$a {
   ekH,
   ekI,
   ekJ,
   ekK,
   ekL,
   ekM,
   ekN,
   ekO,
   ekP,
   ekQ;

   public static cbx$a getAspect(int var0) {
      cbx$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "Aspects", "getAspect() Ordinal is invalid.");
      return null;
   }
}
