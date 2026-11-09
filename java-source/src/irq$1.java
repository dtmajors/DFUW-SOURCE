class irq$1 extends ion {
   irq$1(irq var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9) {
      super(var2, var3, var4, var5, var6, var7, var8, var9);
      this.mvf = var1;
   }

   @Override
   public void pn(boolean var1) {
      super.pn(var1);
      irq.a(this.mvf, this, var1);
   }

   @Override
   public boolean dK(int var1, int var2) {
      super.dK(var1, var2);
      irq.a(this.mvf, this);
      return true;
   }

   @Override
   public boolean dL(int var1, int var2) {
      super.dL(var1, var2);
      irq.b(this.mvf, this);
      return true;
   }
}
