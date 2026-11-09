public enum btz$b {
   dMG,
   dMH,
   dMI,
   dMJ,
   dMK;

   public static btz$b getTeamCommandType(int var0) {
      btz$b[] var1 = values();
      return var0 >= 0 && var0 < var1.length ? var1[var0] : null;
   }

   public static btz$b getTeamCommandType(String var0) {
      if (var0 == null) {
         return null;
      }

      btz$b[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }
}
