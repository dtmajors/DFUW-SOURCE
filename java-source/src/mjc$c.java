public enum mjc$c {
   Dzu,
   Dzv,
   Dzw,
   Dzx,
   Dzy,
   Dzz,
   DzA,
   DzB,
   DzC;

   private static final mjc$c[] DzD = mjc$c.class.getEnumConstants();

   public static final int getValueCount() {
      return DzD.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final mjc$c getValueByOrdinal(int var0) {
      if (isValidOrdinal(var0)) {
         return DzD[var0];
      }

      assert false;
      return null;
   }
}
