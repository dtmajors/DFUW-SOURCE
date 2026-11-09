class hbm$a implements lbn {
   private int iTt;
   private hqh jCw;

   hbm$a(hbm var1, int var2) {
      this.jCv = var1;
      this.iTt = var2;
      assert this.iTt != 0;
   }

   @Override
   public final void W() {
      assert this.jCw != null;
      cv[] var1 = new cv[1];
      cv var2 = new cv();
      var2.a(ct.ku);
      var2.d((float)this.jCw.cum());
      var1[0] = var2;
      if (hbm.b(this.jCv)) {
      }

      efx var3 = (efx)this.jCv.jWV.cdh.rng.ik(14341);
      var3.Ea(this.iTt);
      var3.b(var1);
      var3.on(lcr.qEp);
      this.jCv.jWV.cdh.rnh.m(var3);
   }

   public void a(hqh var1) {
      this.jCw = var1;
   }
}
