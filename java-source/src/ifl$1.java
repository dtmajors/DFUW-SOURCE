class ifl$1 extends lie {
   ifl$1(ifl var1, double var2, boolean var4) {
      super(var2, var4);
      this.lRq = var1;
   }

   @Override
   public void dh(double var1) {
      if (!(var1 < 1.0) && !this.lRq.cFq() && !hyn.cyJ().cHS().cFq()) {
         float var3 = this.lRq.getAlpha() - 0.02F;
         if (var3 > 0.5) {
            this.lRq.hz(var3);
         } else {
            this.stop();
            if (!ifl.a(this.lRq)) {
               this.lRq.setVisible(false);
            }
         }
      }
   }
}
