public enum ajb$d {
   bpy,
   bpz,
   bpA;

   public static ajb$d getModificationType(String var0) {
      if (var0 == null) {
         lfn.b(5, "ModificationTypes", "getModificationType() ModificationName is null.");
         return null;
      }

      var0 = var0.replace(" ", "_");
      ajb$d[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "ModificationTypes", "getModificationType() ModificationName '" + var0 + "' is invalid.");
      return null;
   }
}
