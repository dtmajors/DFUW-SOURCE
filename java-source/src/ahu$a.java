public enum ahu$a {
   blK,
   blL;

   public static ahu$a getCompositeStateObjectType(int var0) {
      ahu$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "CompositeStateObjectTypes", "getCompositeStateObjectType() Ordinal is invalid.");
      return null;
   }
}
