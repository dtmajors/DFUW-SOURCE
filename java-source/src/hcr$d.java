import hfd.a;

class hcr$d implements lbn {
   public final a jIH;

   public hcr$d(hcr var1, a var2) {
      this.jIG = var1;
      this.jIH = var2;
   }

   @Override
   public void W() {
      hqc var1 = (hqc)hcr.b(this.jIG).get(this.jIH);
      if (var1 != null) {
         int var2 = var1.jHT.csE();
         hfd.b var3 = hfd.b.VALUES[var2];
         hcr.a(this.jIG).put(this.jIH, var3);
         this.jIG.jIn.refresh();
      }
   }
}
