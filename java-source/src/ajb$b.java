public enum ajb$b {
   bow,
   box,
   boy,
   boz,
   boA,
   boB,
   boC,
   boD,
   boE,
   boF,
   boG,
   boH,
   boI,
   boJ,
   boK,
   boL,
   boM,
   boN,
   boO,
   boP,
   boQ,
   boR,
   boS,
   boT,
   boU,
   boV,
   boW,
   boX,
   boY,
   boZ,
   bpa,
   bpb,
   bpc,
   bpd,
   bpe,
   bpf,
   bpg,
   bph,
   bpi,
   bpj,
   bpk,
   bpl,
   bpm,
   bpn,
   bpo,
   bpp,
   bpq,
   bpr,
   bps;

   public static ajb$b getConstraintType(String var0) {
      if (var0 == null) {
         lfn.b(5, "ConstraintTypes", "getConstraintType() ConstraintName is null.");
         return null;
      }

      ajb$b[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "ConstraintTypes", "getConstraintType() ConstraintName '" + var0 + "' is invalid.");
      return null;
   }

   public static boolean isPreventPerformingStateCheck(ajb$b var0) {
      if (var0 == null) {
         lfn.b(5, "ConstraintTypes", "isPreventPerformingStateCheck() ConstraintType is null.");
         return true;
      }

      switch (var0) {
         case boS:
         case boX:
         case bpi:
         case bpj:
         case boK:
         case boJ:
         case bps:
            return false;
         default:
            return true;
      }
   }

   public static boolean isSupportInvertingCheck(ajb$b var0) {
      switch (var0) {
         case boW:
         case bpb:
         case boP:
            return true;
         default:
            return false;
      }
   }

   public static boolean isSupportPerformingCheck(ajb$b var0) {
      switch (var0) {
         case boF:
            return false;
         default:
            return true;
      }
   }
}
