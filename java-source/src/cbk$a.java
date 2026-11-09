public enum cbk$a {
   ejv(-1, -1),
   ejw(-1, 25),
   ejx(100, 1);

   private int ejy = -1;
   private int ejz = -1;

   public int aHD() {
      return this.ejy;
   }

   public int aHE() {
      return this.ejz;
   }

   public boolean oA(int var1) {
      return var1 != -1;
   }

   cbk$a(int var3, int var4) {
      this.ejy = var3;
      this.ejz = var4;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < values().length;
   }

   public static cbk$a getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? values()[var0] : ejv;
   }

   public static cbk$a getValueByName(String var0) {
      if (var0 == null) {
         return ejv;
      }

      for (cbk$a var4 : values()) {
         if (var4.name().compareToIgnoreCase(var0) == 0) {
            return var4;
         }
      }

      return ejv;
   }
}
