public enum aud$b {
   caO,
   caP,
   caQ,
   caR,
   caS,
   caT,
   caU,
   caV,
   caW,
   caX,
   caY,
   caZ,
   cba,
   cbb,
   cbc,
   cbd,
   cbe,
   cbf,
   cbg,
   cbh,
   cbi,
   cbj,
   cbk,
   cbl,
   cbm,
   cbn,
   cbo,
   cbp,
   cbq,
   cbr,
   cbs,
   cbt,
   cbu,
   cbv,
   cbw,
   cbx,
   cby,
   cbz,
   cbA,
   cbB,
   cbC,
   cbD,
   cbE,
   cbF,
   cbG,
   cbH,
   cbI,
   cbJ,
   cbK,
   cbL,
   cbM,
   cbN,
   cbO,
   cbP,
   cbQ,
   cbR,
   cbS,
   cbT;

   private static final aud$b[] cbU = values();

   public static final int getValueCount() {
      return cbU.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static aud$b getValue(int var0) {
      return cbU[var0];
   }

   public static aud$b getValue(String var0) {
      assert var0 != null;

      for (int var1 = 0; var1 < cbU.length; var1++) {
         if (cbU[var1].name().equalsIgnoreCase(var0)) {
            return cbU[var1];
         }
      }

      return null;
   }
}
