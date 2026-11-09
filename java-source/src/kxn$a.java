public enum kxn$a {
   qgM,
   qgN,
   qgO;

   public static kxn$a getAttributeConfigType(String var0) {
      if (var0 == null) {
         lfn.b(5, "AttributeConfigTypes", "getAttributeConfigType() AttributeConfigName is null.");
         return null;
      }

      kxn$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "AttributeConfigTypes", "getAttributeConfigType() AttributeConfigName '" + var0 + "' is invalid.");
      return null;
   }
}
