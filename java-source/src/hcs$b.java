import hfd.a;

class hcs$b implements lbn {
   public final a jIH;

   public hcs$b(hcs var1, a var2) {
      this.jIP = var1;
      this.jIH = var2;
   }

   @Override
   public void W() {
      hqc var1 = (hqc)hcs.b(this.jIP).get(this.jIH);
      if (var1 != null) {
         int var2 = var1.jHT.csE();
         hfa var3 = hfa.VALUES[var2];
         hcs.a(this.jIP).put(this.jIH, var3);
         this.jIP.jIn.refresh();
      }
   }
}
