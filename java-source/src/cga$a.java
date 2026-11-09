enum cga$a {
   ewz,
   ewA,
   ewB,
   ewC,
   ewD,
   ewE,
   ewF;

   private static final cga$a[] ewG = cga$a.class.getEnumConstants();

   public static final int getValueCount() {
      return ewG.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final cga$a getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? ewG[var0] : ewz;
   }
}
