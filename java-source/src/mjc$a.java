public enum mjc$a {
   Dzh,
   Dzi,
   Dzj,
   Dzk;

   private static final mjc$a[] Dzl = mjc$a.class.getEnumConstants();

   public static final int getValueCount() {
      return Dzl.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final mjc$a getValueByOrdinal(int var0) {
      if (isValidOrdinal(var0)) {
         return Dzl[var0];
      }

      assert false;
      return null;
   }
}
