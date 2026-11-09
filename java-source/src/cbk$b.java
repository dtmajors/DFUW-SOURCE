public enum cbk$b {
   ejB,
   ejC,
   ejD;

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < values().length;
   }

   public static cbk$b getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? values()[var0] : ejB;
   }

   public static cbk$b getValueByName(String var0) {
      if (var0 == null) {
         return ejB;
      }

      for (cbk$b var4 : values()) {
         if (var4.name().compareToIgnoreCase(var0) == 0) {
            return var4;
         }
      }

      return ejB;
   }
}
