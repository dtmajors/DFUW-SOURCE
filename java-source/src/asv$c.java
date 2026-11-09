public enum asv$c {
   bXj,
   bXk,
   bXl,
   bXm,
   bXn;

   public static int getMaxPriorityValue() {
      return 48;
   }

   public int UR() {
      switch (this) {
         case bXm:
            return 2;
         case bXl:
            return 4;
         case bXn:
            return 8;
         case bXj:
            return 16;
         case bXk:
            return 48;
         default:
            return 0;
      }
   }
}
