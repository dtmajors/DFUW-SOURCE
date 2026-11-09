class jax$2 extends hvl {
   jax$2(jax var1, float var2, float var3, double var4) {
      super(var2, var3, var4);
      this.mMi = var1;
   }

   @Override
   public void hz(float var1) {
      jax.c(this.mMi).hz(var1);
   }
}
