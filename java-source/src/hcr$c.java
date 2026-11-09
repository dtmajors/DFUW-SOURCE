import hfd.a;

class hcr$c implements lbn {
   public final a jIH;

   public hcr$c(hcr var1, a var2) {
      this.jIG = var1;
      this.jIH = var2;
   }

   @Override
   public void W() {
      hqc var1 = (hqc)hcr.b(this.jIG).get(this.jIH);
      if (var1 != null) {
         int var2 = var1.jHT.csE();
         hcr.a(this.jIG).put(this.jIH, lea.rhD.get(var2).DisplayName);
         this.jIG.jIn.refresh();
      }
   }
}
