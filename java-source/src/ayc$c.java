public enum ayc$c {
   cwr,
   cws,
   cwt,
   cwu,
   cwv,
   cww,
   cwx,
   cwy,
   cwz,
   cwA,
   cwB,
   cwC,
   cwD,
   cwE,
   cwF,
   cwG,
   cwH,
   cwI,
   cwJ,
   cwK;

   private static final ayc$c[] cwL = ayc$c.class.getEnumConstants();

   public static final int getValueCount() {
      return cwL.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static int getValueByName(String var0) {
      for (ayc$c var4 : values()) {
         if (var4.name().equalsIgnoreCase(var0)) {
            return var4.ordinal();
         }
      }

      return -1;
   }

   public static ayc$c getValueByOrdinal(int var0) {
      for (ayc$c var4 : values()) {
         if (var4.ordinal() == var0) {
            return var4;
         }
      }

      return null;
   }

   public static String getNameByOrdinal(int var0) {
      for (ayc$c var4 : values()) {
         if (var4.ordinal() == var0) {
            return var4.name();
         }
      }

      return "Unknown";
   }
}
