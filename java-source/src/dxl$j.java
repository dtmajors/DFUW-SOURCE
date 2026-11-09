import dxl.1;

public enum dxl$j {
   hoI,
   hoJ,
   hoK;

   private static final dxl$j[] hoL = dxl$j.class.getEnumConstants();

   public static final int getValueCount() {
      return hoL.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$j getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hoL[var0] : hoI;
   }

   public boolean isDefault() {
      return this == hoI;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hnq[this.ordinal()]) {
         case 1:
            return "24 hours";
         case 2:
            return "3 days";
         case 3:
            return "7 days";
         default:
            return "";
      }
   }
}
