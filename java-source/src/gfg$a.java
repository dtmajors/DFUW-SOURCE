public enum gfg$a {
   jfS("SPAWNED"),
   jfT("TIMEDOUT"),
   jfU("ACQUIRED"),
   jfV("DIED"),
   jfW("LOGGEDOUT"),
   jfX("SAFEAREA"),
   jfY("PLACED"),
   jfZ("STEAL"),
   jga("SACRIFICE"),
   jgb("DESTROYED"),
   jgc("RESTORED"),
   jgd("DROPED");

   private final String DisplayName;
   private static final gfg$a[] jge = gfg$a.class.getEnumConstants();

   public static final int getValueCount() {
      return jge.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static gfg$a getValueByOrdinal(int var0) {
      for (gfg$a var4 : values()) {
         if (var4.ordinal() == var0) {
            return var4;
         }
      }

      return null;
   }

   gfg$a(String var3) {
      this.DisplayName = var3;
   }

   public String getDisplayName() {
      return this.DisplayName;
   }
}
