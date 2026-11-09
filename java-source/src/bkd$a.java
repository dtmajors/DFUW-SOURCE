public enum bkd$a {
   dro,
   drp,
   drq,
   drr,
   drs,
   drt,
   dru,
   drv,
   drw,
   drx,
   dry,
   drz,
   drA,
   drB,
   drC,
   drD,
   drE,
   drF,
   drG,
   drH,
   drI,
   drJ,
   drK,
   drL,
   drM,
   drN,
   drO,
   drP,
   drQ,
   drR,
   drS,
   drT,
   drU,
   drV,
   drW,
   drX,
   drY,
   drZ,
   dsa,
   dsb,
   dsc,
   dsd,
   dse,
   dsf,
   dsg,
   dsh,
   dsi,
   dsj,
   dsk,
   dsl,
   dsm,
   dsn,
   dso,
   dsp,
   dsq,
   dsr,
   dss,
   dst,
   dsu,
   dsv,
   dsw;

   public static String[] getFunctionObjectNames() {
      bkd$a[] var0 = values();
      String[] var1 = new String[var0.length];
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         var1[var2] = var0[var2].name();
      }

      return var1;
   }

   public static bkd$a getFunctionObjectType(String var0) {
      if (var0 == null) {
         lfn.b(5, "FunctionObjectTypes", "getFunctionObjectType() FunctionObjectName is null.");
         return null;
      }

      bkd$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }

   public static boolean isSupportReservedGUIDAsSourceObjectGUID(bkd$a var0) {
      switch (var0) {
         case drp:
         case drr:
         case drs:
         case drE:
         case drF:
         case drH:
         case drI:
         case drJ:
         case drK:
         case drQ:
         case drY:
            return true;
         default:
            return false;
      }
   }
}
