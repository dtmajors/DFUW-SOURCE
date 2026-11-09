class hbq$c implements lbn {
   private int iTt;
   private hqi jDR;

   hbq$c(hbq var1, int var2) {
      this.jDQ = var1;
      this.iTt = var2;
      assert this.iTt != 0;
   }

   @Override
   public final void W() {
      assert this.jDR != null;
      cv[] var1 = new cv[2];
      cv var2 = new cv();
      var2.a(ct.kv);
      var2.d(this.jDR.cwr());
      var1[0] = var2;
      cv var3 = new cv();
      var3.a(ct.ku);
      var3.d(this.jDR.cum());
      var1[1] = var3;
      efx var4 = (efx)((hbm)this.jDQ.kLu).jWV.cdh.rng.ik(14341);
      var4.Ea(this.iTt);
      var4.b(var1);
      var4.on(lcr.qEp);
      ((hbm)this.jDQ.kLu).jWV.cdh.rnh.m(var4);
   }

   public void a(hqi var1) {
      this.jDR = var1;
   }
}
