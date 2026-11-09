public class hqh$a extends hqz {
   private final hqh jCw;
   private int kYP = -1;

   public hqh$a(hnc var1, String var2, lgg var3, hpx$b var4, lhv var5, hqh var6) {
      super(var1, var2, var3, null, hpx$a.kXm, var4, var5);
      this.jCw = var6;
   }

   @Override
   protected void cbM() {
      super.cbM();
      this.cwq();
   }

   @Override
   protected void cbv() {
      super.cbv();
      this.kYP = -1;
      if (this.crd()) {
         this.crc();
      }
   }

   @Override
   protected void cbu() {
      super.cbu();
      if (this.kYP != -1 && this.kLu.csc()) {
         this.crC();
      }
   }

   @Override
   protected void cfS() {
      super.cfS();
      if (this.kYP != -1 && this.kLu.csc() && this.cqH()) {
         this.crC();
      }
   }

   private void crC() {
      int var1 = this.cwp() ? this.kYP : this.jCw.cwo();
      hqh.a(this.jCw, var1);
   }

   private final boolean cwp() {
      int var1 = this.cqu().X(this.cqE().cfx());
      return var1 > hqh.b(this.jCw).kYU.erS();
   }

   public void cwq() {
      assert this.kYP == -1;
      this.kYP = this.d(this.jCw.kYf);
      assert this.kYP != -1;
      this.crb();
   }
}
