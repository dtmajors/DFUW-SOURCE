public enum ls$a {
   avP,
   avQ,
   avR,
   avS,
   avT,
   avU,
   avV,
   avW;

   public static ls$a[] avX = ls$a.class.getEnumConstants();

   public static final int getValueCount() {
      return avX.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final ls$a getValueByOrdinal(int var0) {
      if (isValidOrdinal(var0)) {
         return avX[var0];
      }

      assert false : "Invalid Ordinal [" + var0 + "].Check Code";
      return null;
   }
}
