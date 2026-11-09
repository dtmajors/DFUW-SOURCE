public enum cvk$a {
   fzJ,
   fzK,
   fzL;

   public static int getModeType(cvk$a var0) {
      switch (var0) {
         case fzJ:
            return 3;
         default:
            return -1;
      }
   }

   public static cvk$a getSensorType(int var0) {
      return var0 >= 0 && var0 < values().length ? values()[var0] : null;
   }

   public static cvk$a getSensorType(String var0) {
      if (var0 == null) {
         return null;
      }

      cvk$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }
}
