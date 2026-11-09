public enum dxl$c {
   hnO,
   hnP,
   hnQ,
   hnR,
   hnS,
   hnT,
   hnU,
   hnV,
   hnW;

   public boolean a(dxl$d var1) {
      switch (this) {
         case hnO:
         case hnP:
         case hnR:
         case hnS:
         case hnT:
         case hnW:
         case hnV:
            return true;
         case hnQ:
         case hnU:
            switch (var1) {
               case hnZ:
               case hnY:
                  return true;
               default:
                  return false;
            }
         default:
            return false;
      }
   }

   public String getName() {
      switch (this) {
         case hnP:
            return "Active Challenges";
         case hnR:
            return "Won Challenges";
         case hnS:
            return "Lost Challenges";
         case hnT:
            return "Drawn Challenges";
         case hnW:
            return "Aborted Challenges";
         case hnV:
            return "Clan Disbandings";
         case hnQ:
            return "Won City Challenges";
         case hnU:
            return "Peace Treaties Negotiated";
         default:
            return "All Status Challenges";
      }
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 > 0 && var0 < dxl$c.class.getEnumConstants().length;
   }

   public static dxl$c getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? dxl$c.class.getEnumConstants()[var0] : hnO;
   }
}
