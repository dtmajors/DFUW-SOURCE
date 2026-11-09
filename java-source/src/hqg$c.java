class hqg$c extends hqw {
   private final hqg kjs;
   private int kYC = -1;

   public hqg$c(hnc var1, String var2, lgg var3, lhf var4, hqw$a var5, hqg var6) {
      super(var1, var2, var3, var4, hpx$a.kXm, var5);
      this.kjs = var6;
   }

   public final boolean cwg() {
      return this.kYC != -1;
   }

   @Override
   protected void cbM() {
      super.cbM();
      this.kYC = this.d(hqg.b(this.kjs));
   }

   @Override
   protected void cbu() {
      if (this.kLu.csc() && this.crd()) {
         int var1 = this.kYC + this.kLu.cse().r(hqg.b(this.kjs));
         this.kjs.NQ(var1);
      } else {
         super.cbu();
      }
   }

   @Override
   protected void cbv() {
      super.cbv();
      this.kYC = -1;
      this.kjs.cwe();
   }
}
