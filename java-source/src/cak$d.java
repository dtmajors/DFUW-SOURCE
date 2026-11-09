public enum cak$d {
   egA(cak$e.egT),
   egB(cak$e.egU),
   egC(cak$e.egV),
   egD(cak$e.egX),
   egE(cak$e.egY),
   egF(cak$e.egT),
   egG(cak$e.egW),
   egH(cak$e.egX),
   egI(cak$e.egY),
   egJ(cak$e.egZ),
   egK(cak$e.egT),
   egL(cak$e.egW),
   egM(cak$e.egX),
   egN(cak$e.egZ),
   egO(cak$e.egT),
   egP(cak$e.egW),
   egQ(cak$e.egX),
   egR(cak$e.egZ);

   private final cak$e efz;

   cak$d(cak$e var3) {
      this.efz = var3;
   }

   public static cak$d getMaterialPriorityLevel(String var0) {
      if (var0 == null) {
         lfn.b(5, "MaterialPriorityLevels", "getMaterialPriorityLevel() PriorityLevelName is null.");
         return null;
      }

      cak$d[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "MaterialPriorityLevels", "getMaterialPriorityLevel() PriorityLevelName '" + var0 + "' is invalid.");
      return null;
   }

   public static String[] getPriorityLevelNames() {
      cak$d[] var0 = values();
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
