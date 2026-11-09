class agj$a {
   private static final int bhZ = -2;
   public final int aXP;
   public int aWg;

   public agj$a(agj var1, int var2) {
      this.bia = var1;
      this.aWg = -2;
      this.aXP = var2;
   }

   public void reset() {
      this.aWg = -2;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(" EventType='");
      var1.append(this.bia.eV(this.aXP));
      var1.append("' TimeSliceNumber=");
      var1.append(this.aWg);
      return var1.toString();
   }
}
