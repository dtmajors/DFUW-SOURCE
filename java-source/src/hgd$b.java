class hgd$b implements lbn {
   private final int iTt;
   private hqi jDR;
   private hpe kmE;
   private hqz kmD;
   private boolean Changed;
   private final cak.c bpW;

   hgd$b(hgd var1, int var2, cak.c var3) {
      this.kmy = var1;
      this.Changed = false;
      this.iTt = var2;
      assert this.iTt != 0;
      this.bpW = var3;
   }

   @Override
   public final void W() {
      assert this.jDR != null;
      this.Changed = true;
      this.kmy.a(this.iTt, -1, this.jDR.cwr());
      hgd.b(this.kmy);
   }

   public boolean hasChanged() {
      return this.Changed;
   }

   public void reset() {
      cac var1 = (cac)hgd.d(this.kmy).get(this.bpW);
      if (var1 != null) {
         this.jDR.L(var1.dMT);
         var1.dMT = this.jDR.cwr();
         this.Changed = false;
         this.ciL();
      }
   }

   public void ciL() {
      if (hgd.d(this.kmy) != null) {
         cac var1 = (cac)hgd.d(this.kmy).get(this.bpW);
         float var2;
         if (var1 != null && this.jDR.cwr().X(var1.dMT)) {
            var2 = 0.0F;
            this.kmD.og(true);
         } else {
            var2 = 150.0F;
            this.kmD.og(false);
         }

         ljd var3 = new ljd(var2);
         this.kmE.mV(var3.esy());
      }
   }

   public void a(hqi var1) {
      this.jDR = var1;
   }
}
