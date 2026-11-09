public enum dvq$a {
   hhk(0, false),
   hhl(0, false),
   hhm(6, false),
   hhn(6, false),
   hho(6, false),
   hhp(6, false),
   hhq(6, false),
   hhr(0, false),
   hhs(0, false),
   hht(6, true),
   hhu(0, false);

   private int hgg = -1;
   private boolean crF = false;

   public int getType() {
      return this.hgg;
   }

   public boolean bBK() {
      return this.crF;
   }

   dvq$a(int var3, boolean var4) {
      this.hgg = var3;
      this.crF = var4;
   }

   public static dvq$a getValueByName(String var0) {
      if (var0 == null) {
         return null;
      }

      for (dvq$a var4 : values()) {
         if (var4.name().compareToIgnoreCase(var0) == 0) {
            return var4;
         }
      }

      return null;
   }

   public static String getSQLFieldList(String var0) {
      boolean var1 = var0 != null;
      String var2 = var0 + ".";
      dvq$a[] var3 = values();
      String var4 = (var1 ? var2 : "") + var3[0].name();

      for (int var5 = 1; var5 < var3.length; var5++) {
         var4 = var4 + ", " + (var1 ? var2 : "") + var3[var5].name();
      }

      return var4;
   }
}
