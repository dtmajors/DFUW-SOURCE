public enum dxl$n {
   hpd,
   hpe,
   hpf;

   private static final dxl$n[] hpg = dxl$n.class.getEnumConstants();

   public static final int getValueCount() {
      return hpg.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$n getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hpg[var0] : hpf;
   }
}
