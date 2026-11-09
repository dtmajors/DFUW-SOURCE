import dxl.1;

public enum dxl$l {
   hoV,
   hoW;

   private static final dxl$l[] hoX = dxl$l.class.getEnumConstants();

   public static final int getValueCount() {
      return hoX.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$l getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hoX[var0] : hoV;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hnz[this.ordinal()]) {
         case 1:
            return "Active";
         case 2:
            return "Solved";
         default:
            return "";
      }
   }
}
