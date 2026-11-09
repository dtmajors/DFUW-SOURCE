public enum byw$d {
   ecF,
   ecG,
   ecH,
   ecI,
   ecJ,
   ecK,
   ecL,
   ecM,
   ecN,
   ecO,
   ecP,
   ecQ;

   public static byw$d getOperationType(String var0) {
      if (var0 == null) {
         lfn.b(5, "OperationTypes", "getOperationType() OperationName is null.");
         return null;
      }

      byw$d[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "OperationTypes", "getOperationType() OperationName '" + var0 + "' is invalid.");
      return null;
   }
}
