class ick$4 extends isy {
   ick$4(ick var1) {
      this.lHq = var1;
   }

   @Override
   public void m(int var1, int var2, int var3, int var4) {
      super.m(var1, var2, var3, var4);
      ick.b(this.lHq).pack();
   }

   @Override
   public void od(String var1) {
      super.od(var1);
      this.lHq.pC(var1);
   }

   @Override
   public void dA(int var1, int var2) {
      super.dA(var1, var2);
      this.djE().b("addFinalSpaceHandler", new Object[]{this.getId()});
   }

   @Override
   public void cEj() {
      super.cEj();
      this.dpv();
   }
}
