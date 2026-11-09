class ild$9 extends lie {
   ild$9(ild var1, double var2, boolean var4, double var5, double var7, float var9) {
      super(var2, var4);
      this.mhb = var1;
      this.mhe = var5;
      this.mhf = var7;
      this.mhg = var9;
   }

   @Override
   public void dh(double var1) {
      double var3 = Math.max(0.0, this.mhe - this.MessageDelegator.arc().rgz);
      ild.a(this.mhb, 1, lqm.sdR.bD(var3).exA());
      double var5 = Math.max(0.0, this.mhf - this.MessageDelegator.arc().rgz);
      ild.a(this.mhb, 2, lqm.sdW.bD((int)(this.mhg * 100.0F), var5).exA());
   }
}
