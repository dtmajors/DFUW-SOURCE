class hvt$1 extends hvm {
   hvt$1(hvt var1, float var2, float var3, double var4, ipf var6) {
      super(var2, var3, var4);
      this.lgn = var1;
      this.lgm = var6;
   }

   @Override
   public void hz(float var1) {
      this.lgm.hz(var1);
   }

   @Override
   public void czS() {
      this.lgm.setVisible(false);
      this.lgm.hz(1.0F);
   }
}
