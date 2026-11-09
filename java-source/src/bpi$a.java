public enum bpi$a {
   dzr,
   dzs,
   dzt,
   dzu,
   dzv,
   dzw,
   dzx,
   dzy;

   public static bpi$a[] dzz = bpi$a.class.getEnumConstants();

   public static final int getValueCount() {
      return dzz.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final bpi$a getValueByOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount() ? dzz[var0] : null;
   }

   public String getName() {
      switch (this) {
         case dzr:
            return "None";
         case dzs:
            return "Target Reward";
         case dzt:
            return "Target Talk";
         case dzu:
            return "Target Delivery";
         case dzv:
            return "Target Kill";
         case dzw:
            return "Target Use Skill";
         case dzx:
            return "Target Gather";
         case dzy:
            return "Target Search";
         default:
            return "Unkown";
      }
   }

   public static int getOrdinalByName(String var0) {
      for (int var1 = 0; var1 < dzz.length; var1++) {
         if (dzz[var1].getName().equals(var0)) {
            return dzz[var1].ordinal();
         }
      }

      return -1;
   }

   public static bpi$a getTargetVendorMarkerTypeFromQuestType(dud var0) {
      switch (var0) {
         case hdO:
            return dzu;
         case hdR:
            return dzt;
         case hdP:
         case hdS:
         case hdQ:
         case hdN:
            return dzs;
         default:
            assert false : "QuestType :" + var0;
            return dzs;
      }
   }
}
