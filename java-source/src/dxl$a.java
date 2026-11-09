public enum dxl$a {
   hnC,
   hnD;

   private static final dxl$a[] hnE = dxl$a.class.getEnumConstants();

   public static final int getValueCount() {
      return hnE.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$a getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hnE[var0] : hnC;
   }
}
