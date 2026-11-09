public enum dxl$g {
   hom,
   hon;

   private static final dxl$g[] hoo = dxl$g.class.getEnumConstants();

   public static final int getValueCount() {
      return hoo.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$g getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hoo[var0] : hom;
   }
}
