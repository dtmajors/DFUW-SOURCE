class hbq$a implements lbn {
   public int iTt;
   private boolean mq;
   private hbk jDO;
   private String jDP;

   hbq$a(hbq var1, int var2, boolean var3, String var4) {
      this.jDQ = var1;
      this.mq = var3;
      this.jDP = var4;
      this.iTt = var2;
   }

   public void a(hbk var1) {
      this.jDO = var1;
   }

   @Override
   public final void W() {
      int var1 = this.jDO.caV();
      int var2 = this.jDO.caW();
      if (this.mq) {
         var1++;
      } else {
         var1--;
      }

      if (var1 < 0) {
         var1 = var2;
      } else if (var1 > var2) {
         var1 = 0;
      }

      this.jDO.LC(var1);
      this.jDO.lW(hbq.a(this.jDQ, this.jDO.caV(), this.jDO.caW()));
      efx var3 = (efx)hbq.a(this.jDQ).jWV.cdh.rng.ik(14341);
      var3.Ea(1050);
      cv var4 = new cv();
      var4.a(var1);
      var4.d(this.jDP);
      var3.b(new cv[]{var4});
      var3.on(lcr.qEp);
      hbq.a(this.jDQ).jWV.cdh.rnh.m(var3);
   }
}
