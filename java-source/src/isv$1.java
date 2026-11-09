class isv$1 extends isy {
   isv$1(isv var1) {
      this.mxV = var1;
   }

   @Override
   public void od(String var1) {
      super.od(var1);
      isv.a(this.mxV);
      this.mxV.od(var1);
   }

   @Override
   public void pI(String var1) {
      super.pI(var1);
      isv.a(this.mxV);
      this.mxV.pI(var1);
   }

   @Override
   public void v(String var1, boolean var2) {
      super.v(var1, var2);
      this.mxV.v(var1, var2);
   }

   @Override
   public void dmh() {
      super.dmh();
      isv.a(this.mxV);
      this.mxV.dqd();
   }

   @Override
   public void cEj() {
      super.cEj();
      isv.a(this.mxV);
      this.mxV.dqe();
   }

   @Override
   public void rk(String var1) {
      super.rk(var1);
      isv.a(this.mxV);
      this.mxV.rk(var1);
   }

   @Override
   public void c(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      super.c(var1, var2, var3, var4, var5);
      this.mxV.c(var1, var2, var3, var4, var5);
   }

   @Override
   public void C(String var1, int var2) {
      super.C(var1, var2);
      this.mxV.C(var1, var2);
   }
}
