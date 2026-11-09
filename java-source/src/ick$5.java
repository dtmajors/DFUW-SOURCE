class ick$5 extends icl {
   ick$5(ick var1) {
      this.lHq = var1;
   }

   @Override
   public void od(String var1) {
      super.od(var1);
      this.lHq.pB(var1);
   }

   @Override
   public void pI(String var1) {
      this.od(var1);
   }

   @Override
   public hyn dd(int var1, int var2) {
      hyn var3 = super.dd(var1, var2);
      return var3 != null ? var3 : iae.oJ(lvw.tbF.bD().exA());
   }

   @Override
   public void c(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.lHq.b(var1, var2, var3, var4, var5);
   }

   @Override
   public void C(String var1, int var2) {
      this.lHq.B(var1, var2);
   }

   @Override
   public void dA(int var1, int var2) {
      super.dA(var1, var2);
      this.djE().b("addBackspaceHandler", new Object[]{this.getId()});
   }
}
