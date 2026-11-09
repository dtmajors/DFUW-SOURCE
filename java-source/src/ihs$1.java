class ihs$1 extends iht {
   ihs$1(ihs var1) {
      this.lWV = var1;
   }

   @Override
   public void dH(int var1, int var2) {
      ihs.a(this.lWV, var1, var2);
   }

   @Override
   public void dI(int var1, int var2) {
      ihs.b(this.lWV, var1, var2);
   }

   @Override
   public void dJ(int var1, int var2) {
      ihs.c(this.lWV, var1, var2);
   }

   @Override
   public void a(ios var1) {
      ioc var2 = var1.eo(0, 0);
      this.lWV.m(new joa(var2.cf, var2.cg, var1.getWidth(), var1.getHeight()));
   }

   @Override
   public void qn(boolean var1) {
      this.lWV.qn(var1);
   }

   @Override
   public void cGR() {
      this.lWV.cGR();
   }

   @Override
   public ihv cXJ() {
      return this.lWV.cXJ();
   }

   @Override
   public ihu cYn() {
      return this.lWV.cXK();
   }

   @Override
   public ios cGS() {
      return this.lWV.cGs();
   }

   @Override
   public iox cGl() {
      return this.lWV.cGl();
   }

   @Override
   public ios cGk() {
      return this.lWV.cGk();
   }
}
