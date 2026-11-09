class hom$a {
   public hms kSF;
   private final lbn kOt;

   public hom$a(hom var1, hms var2) {
      this.kSG = var1;
      this.kOt = new hom$a$1(this);
      this.kSF = var2;
      this.mU(true);
   }

   public void destroy() {
      this.mU(false);
      this.kSG.x(this.kSF);
      this.kSF = null;
   }

   private void mU(boolean var1) {
      this.kSF.cql().a(var1, this.kOt);
   }
}
