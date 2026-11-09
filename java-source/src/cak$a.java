public enum cak$a {
   efs(cak$e.egU),
   eft(cak$e.egX),
   efu(cak$e.egX),
   efv(cak$e.egY),
   efw(cak$e.egX),
   efx(cak$e.egZ),
   efy(cak$e.egX);

   private final cak$e efz;

   cak$a(cak$e var3) {
      this.efz = var3;
   }

   public static cak$a getAttachedMeshPriorityLevel(String var0) {
      if (var0 == null) {
         lfn.b(5, "AttachedMeshPriorityLevels", "getAttachedMeshPriorityLevel() PriorityLevelName is null.");
         return null;
      }

      cak$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "AttachedMeshPriorityLevels", "getAttachedMeshPriorityLevel() PriorityLevelName '" + var0 + "' is invalid.");
      return null;
   }

   public static String[] getPriorityLevelNames() {
      cak$a[] var0 = values();
      String[] var1 = new String[var0.length];
      int var2 = 0;

      for (int var3 = var0.length; var2 < var3; var2++) {
         var1[var2] = var0[var2].name();
      }

      return var1;
   }

   public int getValue() {
      return this.efz.getValue();
   }
}
