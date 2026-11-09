class hec$15 implements lbt<lmv> {
   hec$15(hec var1) {
      this.kdd = var1;
   }

   @Override
   public final void a(boolean var1, lbi<lmv> var2) {
      assert var2 != null;
      assert var1 ? hec.u(this.kdd) == null : hec.u(this.kdd) == var2;
      if (var1) {
         hec.a(this.kdd, var2);
      } else {
         hec.a(this.kdd, (lbi)null);
      }

      this.kdd.cdh.rnh.m(fjf.a(this.kdd.cdh.rng, var1));
   }
}
