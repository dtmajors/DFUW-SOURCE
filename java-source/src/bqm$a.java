public enum bqm$a {
   dDV,
   dDW,
   dDX,
   dDY,
   dDZ,
   dEa,
   dEb,
   dEc,
   dEd,
   dEe,
   dEf,
   dEg,
   dEh,
   dEi,
   dEj,
   dEk;

   public static bqm$a getActivatableAction(String var0) {
      if (var0 == null) {
         lfn.b(5, "ActivatableActions", "getActivatableAction() ActivatableActionName is null.");
         return null;
      }

      bqm$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "ActivatableActions", "getActivatableAction() ActivatableActionName '" + var0 + "' is invalid.");
      return null;
   }

   public static bqm$a getActivatableAction(int var0) {
      bqm$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "ActivatableActions", "getActivatableAction() Ordinal is invalid.");
      return null;
   }

   public static String[] getActivatableActionNames() {
      bqm$a[] var0 = values();
      String[] var1 = new String[var0.length];
      int var2 = 0;

      for (int var3 = var0.length; var2 < var3; var2++) {
         var1[var2] = var0[var2].name();
      }

      return var1;
   }
}
