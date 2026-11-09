import dxl.1;

public enum dxl$p {
   hpo,
   hpp,
   hpq,
   hpr,
   hps,
   hpt;

   private static final dxl$p[] hpu = dxl$p.class.getEnumConstants();

   public static final int getValueCount() {
      return hpu.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$p getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hpu[var0] : hpo;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final String getName() {
      switch (1.hnt[this.ordinal()]) {
         case 1:
            return "FortressName";
         case 2:
            return "StationName";
         case 3:
            return "VillageName";
         case 4:
            return "WarName";
         case 5:
            return "FullName";
         case 6:
            return "ChallengeName";
         default:
            return "";
      }
   }
}
