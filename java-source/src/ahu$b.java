public enum ahu$b {
   blN,
   blO,
   blP,
   blQ,
   blR,
   blS,
   blT,
   blU,
   blV,
   blW,
   blX,
   blY,
   blZ,
   bma,
   bmb,
   bmc,
   bmd;

   public static ahu$b getEventPropertyType(String var0) {
      if (var0 != null && !var0.trim().equals("")) {
         ahu$b[] var1 = values();
         int var2 = 0;

         for (int var3 = var1.length; var2 < var3; var2++) {
            if (var1[var2].name().equalsIgnoreCase(var0)) {
               return var1[var2];
            }
         }

         lfn.b(5, "EventPropertyTypes", "getEventPropertyType() EventPropertyName '" + var0 + "' is invalid.");
         return null;
      } else {
         lfn.b(5, "EventPropertyTypes", "getEventPropertyType() EventPropertyName is invalid.");
         return null;
      }
   }
}
