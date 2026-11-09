public enum cox$a {
   eQX,
   eQY,
   eQZ,
   eRa,
   eRb,
   eRc;

   public String getName() {
      switch (this) {
         case eQX:
            return "Acid";
         case eQZ:
            return "Fireball";
         case eQY:
            return "Flamethrower";
         case eRa:
            return "Lightning";
         case eRb:
            return "Shrapnel";
         case eRc:
         default:
            return "";
      }
   }
}
