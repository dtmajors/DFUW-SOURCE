class ild$8 extends lie {
   ild$8(ild var1, double var2, boolean var4, double var5) {
      super(var2, var4);
      this.mhb = var1;
      this.mhe = var5;
   }

   @Override
   public void dh(double var1) {
      ild.e(this.mhb).setText(lqm.sfi.bD(Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz)).exA());
   }
}
