public enum cak$b {
   efB(cak$e.egT);

   private final cak$e efz;

   cak$b(cak$e var3) {
      this.efz = var3;
   }

   public static cak$b getDummyMeshPriorityLevel(String var0) {
      if (var0 == null) {
         lfn.b(5, "DummyMeshPriorityLevels", "getDummyMeshPriorityLevel() PriorityLevelName is null.");
         return null;
      }

      cak$b[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "DummyMeshPriorityLevels", "getDummyMeshPriorityLevel() PriorityLevelName '" + var0 + "' is invalid.");
      return null;
   }

   public static String[] getPriorityLevelNames() {
      cak$b[] var0 = values();
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
