public enum cxd$c {
   fQu,
   fQv,
   fQw,
   fQx,
   fQy,
   fQz,
   fQA,
   fQB;

   public static cxd$c getValueByOrdinal(int var0) {
      return var0 >= 0 && var0 < values().length ? values()[var0] : null;
   }

   public static boolean canExistOnlyOne(cxd$c var0) {
      if (var0 == null) {
         lfn.b(5, "BlockingTypes", "canExistOnlyOne() BlockingType is null.");
         return false;
      }

      switch (var0) {
         case fQu:
         case fQv:
         case fQw:
         case fQx:
         case fQy:
         case fQz:
            return true;
         case fQA:
         case fQB:
            return false;
         default:
            lfn.b(5, "BlockingTypes", "canExistOnlyOne() Unhandled BlockingType provided: " + var0);
            return false;
      }
   }

   public static cxd$c getBlockingType(String var0) {
      if (var0 == null) {
         lfn.b(5, "BlockingTypes", "getBlockingType() BlockingName is null.");
         return null;
      }

      cxd$c[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "BlockingTypes", "getBlockingType() BlockingName '" + var0 + "' is invalid.");
      return null;
   }
}
