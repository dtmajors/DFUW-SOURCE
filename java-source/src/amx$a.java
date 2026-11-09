class amx$a {
   private final asa bBI;
   private final aso bBJ;

   public amx$a(amx var1, asa var2) {
      this.bBK = var1;
      this.bBI = var2;
      this.bBJ = new aso(1.0 / var2.SK());
   }

   public asa HS() {
      return this.bBI;
   }

   boolean HT() {
      return this.bBJ.ag(this.bBK.bBt);
   }
}
