import hfd.a;

class hct$b implements lbn {
   public final a jIH;

   public hct$b(hct var1, a var2) {
      this.jIT = var1;
      this.jIH = var2;
   }

   @Override
   public void W() {
      hqc var1 = (hqc)hct.b(this.jIT).get(this.jIH);
      if (var1 != null) {
         int var2 = var1.jHT.csE();
         hfa var3 = hfa.VALUES[var2];
         hct.a(this.jIT).put(this.jIH, var3);
         this.jIT.jIn.refresh();
      }
   }
}
