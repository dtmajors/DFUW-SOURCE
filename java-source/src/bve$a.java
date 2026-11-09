public enum bve$a {
   dQt,
   dQu,
   dQv,
   dQw,
   dQx,
   dQy,
   dQz,
   dQA,
   dQB,
   dQC,
   dQD,
   dQE,
   dQF,
   dQG,
   dQH,
   dQI,
   dQJ,
   dQK;

   public static bve$a getMeshType(int var0) {
      bve$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "MeshTypes", "getMeshType() Ordinal is invalid.");
      return null;
   }

   public static bve$a getMeshType(String var0) {
      if (var0 == null) {
         lfn.b(5, "MeshTypes", "getMeshType() MeshName is null.");
         return null;
      }

      bve$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equals(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "MeshTypes", "getMeshType() MeshName '" + var0 + "' is invalid.");
      return null;
   }

   public static boolean isMeshObjectForCreature(bve$a var0) {
      switch (var0) {
         case dQy:
         case dQz:
         case dQA:
         case dQF:
         case dQK:
            return true;
         default:
            return false;
      }
   }
}
