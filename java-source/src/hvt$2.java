class hvt$2 extends hvm {
   hvt$2(hvt var1, float var2, float var3, double var4, ipf var6) {
      super(var2, var3, var4);
      this.lgn = var1;
      this.lgo = var6;
   }

   @Override
   public void hz(float var1) {
      this.lgo.hz(var1);
   }
}
