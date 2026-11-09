public enum hx$a {
   aeE,
   aeF,
   aeG,
   aeH,
   aeI,
   aeJ,
   aeK;

   public static hx$a[] aeL = hx$a.class.getEnumConstants();

   public static final int getValueCount() {
      return aeL.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final hx$a getValueByOrdinal(int var0) {
      return aeL[var0];
   }
}
