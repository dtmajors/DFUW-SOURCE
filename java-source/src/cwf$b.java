public enum cwf$b {
   fEy,
   fEz,
   fEA,
   fEB,
   fEC,
   fED,
   fEE,
   fEF,
   fEG,
   fEH;

   public static cwf$b getSessionType(int var0) {
      cwf$b[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "SessionTypes", "getSessionType() Ordinal is invalid.");
      return null;
   }
}
