import dxl.1;

public enum dxl$k {
   hoN,
   hoO,
   hoP,
   hoQ,
   hoR,
   hoS;

   private static final dxl$k[] hoT = dxl$k.class.getEnumConstants();

   public static final int getValueCount() {
      return hoT.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$k getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hoT[var0] : hoN;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hnA[this.ordinal()]) {
         case 1:
            return "Allies";
         case 2:
            return "Enemy";
         case 3:
            return "Friend";
         case 4:
            return "Neutral";
         case 5:
            return "Peace Treaty";
         case 6:
            return "Wary";
         default:
            return "Error";
      }
   }
}
