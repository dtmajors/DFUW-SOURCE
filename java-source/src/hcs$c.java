import hfd.a;

class hcs$c implements lbn {
   public final a jIH;
   public final hqm jII;

   public hcs$c(hcs var1, hqm var2, a var3) {
      this.jIP = var1;
      this.jIH = var3;
      this.jII = var2;
   }

   @Override
   public void W() {
      int var1 = (int)this.jII.cqg().cpZ();
      hcs.a(this.jIP).put(this.jIH, var1);
      this.jIP.jIn.refresh();
   }
}
