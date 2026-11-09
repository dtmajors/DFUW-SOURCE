public enum ldy$b {
   rfT("Magnitude", lya.tCz),
   rfU("Duration", lya.tCA),
   rfV("Mana", lya.tCB),
   rfW("Stamina", lya.tCC),
   rfX("Cooldown", lya.tCD),
   rfY("Cast", lya.tCE),
   rfZ("AOE", lya.tCF),
   rga("Speed", lya.tCG),
   rgb("Success", lya.tCH),
   rgc("Time", lya.tCI),
   rgd("Recipes", lya.tCJ),
   rge("NumberOfStacks", lya.tCK);

   public String Name;
   public lox DisplayName;

   ldy$b(String var3, lox var4) {
      this.Name = var3;
      this.DisplayName = var4;
   }

   public static ldy$b getByName(String var0) {
      for (ldy$b var4 : values()) {
         if (var4.Name.equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }
}
