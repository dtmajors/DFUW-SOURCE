class jax$1 extends lie {
   jax$1(jax var1, double var2, boolean var4) {
      super(var2, var4);
      this.mMi = var1;
   }

   @Override
   public void dh(double var1) {
      this.mMi.djE();
      double var3 = ioa.cxP().cyZ().cAb();
      this.mMi.dw(var3);
      if (var3 / lea.epx().aQF() <= 0.4) {
         jax.a(this.mMi);
      } else {
         jax.b(this.mMi);
      }
   }
}
