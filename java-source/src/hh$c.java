enum hh$c {
   acm,
   acn,
   aco,
   acp,
   acq;

   private static final hh$c[] acr = hh$c.class.getEnumConstants();

   public static final int getValueCount() {
      return acr.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final hh$c getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? acr[var0] : acm;
   }
}
