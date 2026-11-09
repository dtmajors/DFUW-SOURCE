public enum dcm$a {
   gcX,
   gcY,
   gcZ,
   gda;

   public static dcm$a getControllerOperationType(String var0) {
      if (var0 == null) {
         return null;
      }

      dcm$a[] var1 = values();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }
}
