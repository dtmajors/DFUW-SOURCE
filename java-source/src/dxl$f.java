import dxl.1;

public enum dxl$f {
   hoh,
   hoi,
   hoj;

   private static final dxl$f[] hok = dxl$f.class.getEnumConstants();

   public static final int getValueCount() {
      return hok.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$f getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hok[var0] : hoj;
   }

   public static final dxl$f getOppositeValueByOrdinal(int var0) {
      if (var0 >= 0 && var0 < getValueCount()) {
         dxl$f var1 = hok[var0];
         return var1 == hoi ? hoh : hoi;
      } else {
         return hoj;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hnx[this.ordinal()]) {
         case 1:
            return "Taken Over";
         case 2:
            return "Lost";
         case 3:
            return "All";
         default:
            return "";
      }
   }
}
