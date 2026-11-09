public enum ajb$c {
   bpu,
   bpv,
   bpw;

   public static ajb$c getLockConfigType(String var0) {
      if (var0 == null) {
         lfn.b(5, "LockConfigTypes", "getLockConfigType() LockConfigName is null.");
         return null;
      }

      ajb$c[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "LockConfigTypes", "getLockConfigType() LockConfigName '" + var0 + "' is invalid.");
      return null;
   }
}
