class iej$1 extends lie {
   iej$1(iej var1, double var2, boolean var4, double var5) {
      super(var2, var4);
      this.lNJ = var1;
      this.lNI = var5;
   }

   @Override
   public void dh(double var1) {
      double var3 = Math.max(this.lNI - this.getMessageDelegator().arc().rgz, 0.0);
      iej.a(this.lNJ).setText(lvm.sWE.bD(var3).exA());
   }
}
