public enum byw$c {
   ebR,
   ebS,
   ebT,
   ebU,
   ebV,
   ebW,
   ebX,
   ebY,
   ebZ,
   eca,
   ecb,
   ecc,
   ecd,
   ece,
   ecf,
   ecg,
   ech,
   eci,
   ecj,
   eck,
   ecl,
   ecm,
   ecn,
   eco,
   ecp,
   ecq,
   ecr,
   ecs,
   ect,
   ecu,
   ecv,
   ecw,
   ecx,
   ecy,
   ecz,
   ecA,
   ecB,
   ecC,
   ecD;

   public static byw$c getEventType(String var0) {
      if (var0 == null) {
         lfn.b(5, "EventTypes", "getEventType() EventName is null.");
         return null;
      }

      byw$c[] var1 = byw$c.class.getEnumConstants();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "EventTypes", "getEventType() EventName '" + var0 + "' is invalid.");
      return null;
   }
}
