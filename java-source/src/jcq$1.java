class jcq$1 extends hvl {
   jcq$1(jcq var1, float var2, float var3, double var4) {
      super(var2, var3, var4);
      this.mRM = var1;
   }

   @Override
   public void hz(float var1) {
      jcq.a(this.mRM).hz(var1);
   }
}
