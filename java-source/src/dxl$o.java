import dxl.1;

public enum dxl$o {
   hpi,
   hpj,
   hpk,
   hpl;

   private static final dxl$o[] hpm = dxl$o.class.getEnumConstants();

   public static final int getValueCount() {
      return hpm.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$o getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hpm[var0] : hpi;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hnr[this.ordinal()]) {
         case 1:
            return "All Time";
         case 2:
            return "Day";
         case 3:
            return "Month";
         case 4:
            return "Week";
         default:
            return "";
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String bEk() {
      switch (1.hnr[this.ordinal()]) {
         case 1:
            return "Last 3 Months";
         case 2:
            return "Day";
         case 3:
            return "Month";
         case 4:
            return "Week";
         default:
            return "";
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String bEl() {
      switch (1.hnr[this.ordinal()]) {
         case 1:
            return "All Time";
         case 2:
            return "Day";
         case 3:
            return "Month";
         case 4:
            return "Week";
         default:
            return "";
      }
   }
}
