public enum ajb$a {
   bos,
   bot,
   bou;

   public static ajb$a getCheckType(String var0) {
      if (var0 == null) {
         lfn.b(5, "CheckTypes", "getCheckType() CheckName is null.");
         return null;
      }

      ajb$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "CheckTypes", "getCheckType() CheckName '" + var0 + "' is invalid.");
      return null;
   }
}
