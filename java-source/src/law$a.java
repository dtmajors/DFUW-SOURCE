public enum law$a {
   quF,
   quG,
   quH,
   quI,
   quJ,
   quK,
   quL,
   quM,
   quN;

   public static law$a getOperationType(String var0) {
      law$a[] var1 = values();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }
}
