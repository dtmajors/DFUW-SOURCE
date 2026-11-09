public enum ahu$c {
   bmf,
   bmg,
   bmh,
   bmi,
   bmj,
   bmk,
   bml,
   bmm,
   bmn,
   bmo,
   bmp,
   bmq,
   bmr,
   bms,
   bmt,
   bmu,
   bmv,
   bmw,
   bmx,
   bmy,
   bmz,
   bmA,
   bmB,
   bmC,
   bmD,
   bmE,
   bmF,
   bmG,
   bmH,
   bmI,
   bmJ,
   bmK,
   bmL,
   bmM,
   bmN,
   bmO,
   bmP;

   public static boolean containsNoFixedProperties(ahu$c var0) {
      switch (var0) {
         case bmh:
         case bmH:
            return true;
         default:
            return false;
      }
   }

   public static boolean containsNoProperties(ahu$c var0) {
      switch (var0) {
         case bmn:
         case bmp:
         case bmr:
            return true;
         default:
            return false;
      }
   }

   public static boolean containsRelatedObjects(ahu$c var0) {
      switch (var0) {
         case bmg:
         case bmu:
         case bmA:
         case bmI:
         case bmK:
         case bmL:
            return true;
         default:
            return false;
      }
   }

   public static ahu$c getStateObjectType(String var0) {
      if (var0 != null && !var0.trim().equals("")) {
         ahu$c[] var1 = values();
         int var2 = 0;

         for (int var3 = var1.length; var2 < var3; var2++) {
            if (var1[var2].name().equalsIgnoreCase(var0)) {
               return var1[var2];
            }
         }

         lfn.b(5, "StateObjectTypes", "getStateObjectType() StateObjectName '" + var0 + "' is invalid.");
         return null;
      } else {
         lfn.b(5, "StateObjectTypes", "getStateObjectType() StateObjectName is invalid.");
         return null;
      }
   }

   public static boolean skipRemoveWhenRemovingAOI(ahu$c var0) {
      switch (var0) {
         case bmA:
         case bmk:
            return true;
         default:
            return false;
      }
   }
}
