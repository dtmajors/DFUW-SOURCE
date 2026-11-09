public enum cst$b {
   fdB,
   fdC,
   fdD;

   public static cst$b[] fdE = cst$b.class.getEnumConstants();

   public static final int getValueCount() {
      return fdE.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final cst$b getValueByOrdinal(int var0) {
      return !isValidOrdinal(var0) ? fdD : fdE[var0];
   }
}
