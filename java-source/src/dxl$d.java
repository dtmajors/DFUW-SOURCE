public enum dxl$d {
   hnY,
   hnZ,
   hoa;

   public String getName() {
      switch (this) {
         case hnZ:
            return "Attack Challenges";
         case hoa:
            return "Defence Challenges";
         default:
            return "All Challenges";
      }
   }

   public dxl$c[] bEh() {
      int var1 = 0;

      for (dxl$c var5 : dxl$c.class.getEnumConstants()) {
         if (var5.a(this)) {
            var1++;
         }
      }

      int var8 = 0;
      dxl$c[] var9 = new dxl$c[var1];

      for (dxl$c var7 : dxl$c.class.getEnumConstants()) {
         var9[var8++] = var7;
      }

      return var9;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 > 0 && var0 < dxl$d.class.getEnumConstants().length;
   }

   public static dxl$d getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? dxl$d.class.getEnumConstants()[var0] : hnY;
   }
}
