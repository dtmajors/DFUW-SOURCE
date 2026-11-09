public enum cxd$s {
   fSy,
   fSz,
   fSA,
   fSB,
   fSC,
   fSD,
   fSE,
   fSF,
   fSG,
   fSH;

   public static cxd$s getTargetInfoType(String var0) {
      if (var0 == null) {
         lfn.b(5, "TargetInfoTypes", "getTargetInfoType() TargetInfoName is null.");
         return null;
      }

      cxd$s[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "TargetInfoTypes", "getTargetInfoType() TargetInfoName '" + var0 + "' is invalid.");
      return null;
   }
}
