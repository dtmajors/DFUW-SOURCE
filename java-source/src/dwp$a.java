enum dwp$a {
   hlM(0, false),
   hlN(6, false),
   hlO(0, false),
   hlP(0, false);

   private int hgg = -1;
   private boolean crF = false;

   public int getType() {
      return this.hgg;
   }

   public boolean bBK() {
      return this.crF;
   }

   dwp$a(int var3, boolean var4) {
      this.hgg = var3;
      this.crF = var4;
   }

   public static dwp$a getValueByName(String var0) {
      if (var0 == null) {
         return null;
      }

      for (dwp$a var4 : values()) {
         if (var4.name().compareToIgnoreCase(var0) == 0) {
            return var4;
         }
      }

      return null;
   }

   public static String getSQLFieldList(String var0) {
      boolean var1 = var0 != null;
      String var2 = var0 + ".";
      dwp$a[] var3 = values();
      String var4 = (var1 ? var2 : "") + var3[0].name();

      for (int var5 = 1; var5 < var3.length; var5++) {
         var4 = var4 + ", " + (var1 ? var2 : "") + var3[var5].name();
      }

      return var4;
   }
}
