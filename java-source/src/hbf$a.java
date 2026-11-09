class hbf$a implements lbn {
   public int iTt;
   private boolean jAT;

   hbf$a(hbf var1, int var2, boolean var3) {
      this.jAU = var1;
      this.jAT = var3;
      this.iTt = var2;
   }

   @Override
   public final void W() {
      if (hbf.a(this.jAU) != null) {
         hbf.a(this.jAU).LB(this.iTt);
      } else {
         if (this.jAT) {
            hbf.b(this.jAU).og(true);
            hbf.c(this.jAU).og(true);
         }

         efx var1 = (efx)hbf.d(this.jAU).jWV.cdh.rng.ik(14341);
         var1.Ea(this.iTt);
         var1.on(lcr.qEp);
         hbf.d(this.jAU).jWV.cdh.rnh.m(var1);
      }
   }
}
