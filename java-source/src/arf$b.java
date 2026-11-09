public enum arf$b {
   bOA,
   bOB;

   public static arf$b getType(String var0) {
      for (arf$b var4 : values()) {
         if (var4.name().equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }
}
