import dxl.1;

public enum dxl$m {
   hoZ,
   hpa;

   private static final dxl$m[] hpb = dxl$m.class.getEnumConstants();

   public static final int getValueCount() {
      return hpb.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$m getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hpb[var0] : hoZ;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hnB[this.ordinal()]) {
         case 1:
            return "Our Standing";
         case 2:
            return "Their Standing";
         default:
            return "None";
      }
   }
}
