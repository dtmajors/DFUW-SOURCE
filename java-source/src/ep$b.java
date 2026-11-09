public enum ep$b {
   Pj(lxz.tCf),
   Pk(lxz.tCh),
   Pl(lxz.tCg);

   private static final ep$b[] Pm = ep$b.class.getEnumConstants();
   private final lox Pn;

   public static final int getValueCount() {
      return Pm.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static ep$b getDefaultState() {
      return Pl;
   }

   public static ep$b getValueFromOrdinal(int var0) {
      return isValidOrdinal(var0) ? Pm[var0] : Pj;
   }

   ep$b(lox var3) {
      this.Pn = var3;
   }

   public lox fA() {
      return this.Pn;
   }
}
