public enum bqm$c {
   dEU,
   dEV,
   dEW;

   public static bqm$c getItemStateType(String var0) {
      if (var0 == null) {
         lfn.b(5, "ItemStateTypes", "getItemStateType() ItemStateName is null.");
         return null;
      }

      bqm$c[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "ItemStateTypes", "getItemStateType() ItemStateName '" + var0 + "' is invalid.");
      return null;
   }

   public static bqm$c getItemStateType(int var0) {
      bqm$c[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "ItemStateTypes", "getItemStateType() Ordinal is invalid.");
      return null;
   }
}
