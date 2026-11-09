public enum cg$b {
   hc("none", 0, null),
   hd("japan", 1, lvq.sZw),
   he("korea", 2, lvq.sZx);

   private int hf;
   private String _name;
   private lox hg;
   private static final cg$b[] hh = cg$b.class.getEnumConstants();

   cg$b(String var3, int var4, lox var5) {
      this.hf = var4;
      this._name = var3;
      this.hg = var5;
   }

   public int aE() {
      return this.hf;
   }

   public String aF() {
      return this._name;
   }

   public lox aG() {
      return this.hg;
   }

   public static cg$b Find(String var0) {
      for (cg$b var4 : values()) {
         if (var4.aF().equals(var0)) {
            return var4;
         }
      }

      return hc;
   }

   public static cg$b Find(int var0) {
      for (cg$b var4 : values()) {
         if (var4.aE() == var0) {
            return var4;
         }
      }

      return hc;
   }

   public static final int getValueCount() {
      return hh.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final cg$b getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hh[var0] : hc;
   }

   public static final cg$b getValueByName(String var0) {
      if (var0 != null && !var0.trim().isEmpty()) {
         if (var0.toLowerCase().contains(hd._name.toLowerCase())) {
            return hd;
         } else {
            return var0.toLowerCase().contains(he._name.toLowerCase()) ? he : hc;
         }
      } else {
         return hc;
      }
   }
}
