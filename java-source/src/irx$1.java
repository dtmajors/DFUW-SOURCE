class irx$1 extends lie {
   irx$1(irx var1, double var2, boolean var4) {
      super(var2, var4);
      this.mwt = var1;
   }

   @Override
   public void dh(double var1) {
      this.stop();
      irx.b(this.mwt);
      irx.a(this.mwt, new irx$1$1(this, 0.25, true));
      irx.c(this.mwt).e(this.mwt.djE().getMessageDelegator());
   }
}
