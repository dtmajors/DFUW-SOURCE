public enum dxl$b {
   hnG,
   hnH,
   hnI,
   hnJ,
   hnK,
   hnL;

   private static final dxl$b[] hnM = dxl$b.class.getEnumConstants();

   public String getName() {
      switch (this) {
         case hnG:
            return "Active";
         case hnH:
            return "Won";
         case hnI:
            return "Lost";
         case hnJ:
            return "Timed Out";
         case hnK:
            return "Peace Treaty";
         case hnL:
            return "All";
         default:
            return "All";
      }
   }

   public static final int getValueCount() {
      return hnM.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$b getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hnM[var0] : hnG;
   }
}
