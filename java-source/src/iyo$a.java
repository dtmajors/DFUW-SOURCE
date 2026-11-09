class iyo$a extends hvl {
   public iyo$a(iyo var1) {
      super(1.0F, 0.25F, 0.5);
      this.mBP = var1;
   }

   @Override
   public void hz(float var1) {
      ((iop)this.mBP.dis()).diq().hz(var1);
      ((iop)this.mBP.dit()).diq().hz(var1);
      ((iop)this.mBP.diu()).diq().hz(var1);
      ((iop)this.mBP.div()).diq().hz(var1);
   }

   @Override
   public void aA(ldz var1) {
      ((iop)this.mBP.dis()).diq().hz(1.0F);
      ((iop)this.mBP.dit()).diq().hz(1.0F);
      ((iop)this.mBP.diu()).diq().hz(1.0F);
      ((iop)this.mBP.div()).diq().hz(1.0F);
   }
}
