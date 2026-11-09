public enum cxd$k {
   fRD,
   fRE,
   fRF,
   fRG,
   fRH,
   fRI,
   fRJ,
   fRK,
   fRL;

   public static boolean canExistOnlyOne(cxd$k var0) {
      if (var0 == null) {
         lfn.b(5, "ProgressTypes", "canExistOnlyOne() ProgressType is null.");
         return false;
      }

      switch (var0) {
         case fRD:
         case fRG:
         case fRH:
         case fRI:
         case fRL:
            return true;
         case fRJ:
            return false;
         default:
            lfn.b(5, "ProgressTypes", "canExistOnlyOne() Unhandled ProgressType provided: " + var0);
            return false;
      }
   }

   public static cxd$k getProgressType(String var0) {
      if (var0 == null) {
         lfn.b(5, "ProgressTypes", "getProgressType() ProgressName is null.");
         return null;
      }

      cxd$k[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "ProgressTypes", "getProgressType() ProgressName '" + var0 + "' is invalid.");
      return null;
   }

   public static cxd$k getProgressTypeFromMessage(int var0) {
      switch (var0) {
         case 0:
            return fRD;
         case 1:
         case 2:
         case 6:
         default:
            lfn.b(5, "ProgressTypes", "getProgressTypeFromMessage() Ordinal '" + var0 + "' is invalid.");
            return null;
         case 3:
            return fRG;
         case 4:
            return fRJ;
         case 5:
            return fRI;
         case 7:
            return fRL;
         case 8:
            return fRH;
      }
   }

   public static int getProgressTypeToMessage(cxd$k var0) {
      if (var0 == null) {
         lfn.b(5, "ProgressTypes", "getProgressTypeToMessage() ProgressType is null.");
         return -1;
      }

      switch (var0) {
         case fRD:
            return 0;
         case fRG:
            return 3;
         case fRH:
            return 8;
         case fRI:
            return 5;
         case fRL:
            return 7;
         case fRJ:
            return 4;
         case fRE:
            return 1;
         case fRF:
            return 2;
         case fRK:
            return 6;
         default:
            lfn.b(5, "ProgressTypes", "getProgressTypeToMessage() ProgressType '" + var0 + "' is invalid.");
            return -1;
      }
   }
}
