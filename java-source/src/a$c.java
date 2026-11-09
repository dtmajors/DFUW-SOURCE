enum a$c {
   aL(5760),
   aM(1440),
   aN(720),
   aO(360),
   aP(144),
   aQ(24),
   aR(6);

   private final int aS;

   a$c(int var3) {
      this.aS = var3;
   }

   public int j() {
      return this.aS;
   }

   @Override
   public String toString() {
      return this.name().toLowerCase();
   }
}
