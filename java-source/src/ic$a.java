class ic$a {
   public final ldv adA;
   public bvr aff;
   public double afg;

   public ic$a(ic var1, ldv var2) {
      this.afh = var1;
      this.aff = null;
      this.afg = 0.0;
      this.adA = var2;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SFSubscriberInfo: SubscriberGUID");
      var1.append(this.adA);
      return var1.toString();
   }
}
