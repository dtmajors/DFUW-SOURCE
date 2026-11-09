public enum aud$a {
   cap,
   caq,
   car,
   cas,
   cat,
   cau,
   cav,
   caw,
   cax,
   cay,
   caz,
   caA,
   caB,
   caC,
   caD,
   caE,
   caF,
   caG,
   caH,
   caI,
   caJ,
   caK,
   caL;

   private static final aud$a[] caM = values();

   public static aud$a getValue(int var0) {
      return !isOrdinalValid(var0) ? null : caM[var0];
   }

   public static boolean isOrdinalValid(int var0) {
      return var0 >= 0 && var0 < caM.length;
   }

   public static aud$a parse(String var0) {
      if (var0 == null) {
         return null;
      }

      for (aud$a var4 : values()) {
         if (var4.name().toLowerCase().endsWith(var0.toLowerCase())) {
            return var4;
         }
      }

      return null;
   }
}
