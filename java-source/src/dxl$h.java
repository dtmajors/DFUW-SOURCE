import dxl.1;

public enum dxl$h {
   hoq,
   hor;

   private static final dxl$h[] hos = dxl$h.class.getEnumConstants();

   public static final int getValueCount() {
      return hos.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$h getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hos[var0] : hoq;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hny[this.ordinal()]) {
         case 1:
            return "By Me";
         case 2:
            return "To Me";
         default:
            return "";
      }
   }
}
