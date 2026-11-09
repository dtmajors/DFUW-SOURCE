public enum ft$a {
   Tk,
   Tl;

   public static final ft$a[] Tm = values();

   @Override
   public String toString() {
      switch (this) {
         case Tk:
            return "cfunc";
         case Tl:
            return "plog";
         default:
            return null;
      }
   }

   public static ft$a fromString(String var0) {
      for (int var1 = 0; var1 < Tm.length; var1++) {
         if (Tm[var1].toString().equals(var0)) {
            return values()[var1];
         }
      }

      return null;
   }
}
