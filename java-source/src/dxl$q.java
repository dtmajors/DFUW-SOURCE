import dxl.1;

public enum dxl$q {
   hpw,
   hpx;

   private static final dxl$q[] hpy = dxl$q.class.getEnumConstants();

   public static final int getValueCount() {
      return hpy.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$q getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hpy[var0] : hpw;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String a(dxl$p var1) {
      switch (1.hnt[var1.ordinal()]) {
         case 1:
         case 2:
         case 3:
         case 4:
            return "";
         case 5:
            switch (1.hns[this.ordinal()]) {
               case 1:
                  return "Contributed";
               case 2:
                  return "Withdrawn";
               default:
                  return "";
            }
         case 6:
            switch (1.hns[this.ordinal()]) {
               case 1:
                  return "Wins";
               case 2:
                  return "Losses";
            }
      }

      return "";
   }
}
