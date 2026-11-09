class ijd$2 extends ipg<Float> {
   ijd$2(ijd var1, ipf var2, String var3, hsu var4, boolean var5) {
      super(var2, var3, var4, var5);
      this.mcG = var1;
   }

   public Float dW(int var1, int var2) {
      int var3 = this.mcG.dP(var1, var2);
      return (float)var3 / var2;
   }

   @Override
   public void dak() {
      ijd.b(this.mcG, (int)((Float)ijd.c(this.mcG).get() * hso.cxK().cyc().H + 0.5F));
      this.mcG.pack();
   }
}
