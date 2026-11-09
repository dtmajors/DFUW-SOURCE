class ild$10 extends lie {
   ild$10(ild var1, double var2, boolean var4, double var5, float var7) {
      super(var2, var4);
      this.mhb = var1;
      this.mhf = var5;
      this.mhg = var7;
   }

   @Override
   public void dh(double var1) {
      double var3 = Math.max(0.0, this.mhf - this.MessageDelegator.arc().rgz);
      ild.a(this.mhb, 2, lqm.sdW.bD((int)(this.mhg * 100.0F), var3).exA());
   }
}
