public enum ls$b {
   avZ,
   awa,
   awb,
   awc,
   awd,
   awe,
   awf,
   awg,
   awh,
   awi,
   awj,
   awk,
   awl;

   public static ls$b[] awm = ls$b.class.getEnumConstants();

   public static final int getValueCount() {
      return awm.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final ls$b getValueByOrdinal(int var0) {
      if (isValidOrdinal(var0)) {
         return awm[var0];
      }

      assert false : "Invalid Ordinal [" + var0 + "].Check Code";
      return null;
   }
}
