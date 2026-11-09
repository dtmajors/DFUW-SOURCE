public enum dxl$e {
   hoc,
   hod,
   hoe;

   private static final dxl$e[] hof = dxl$e.class.getEnumConstants();

   public static final int getValueCount() {
      return hof.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$e getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hof[var0] : hoc;
   }
}
