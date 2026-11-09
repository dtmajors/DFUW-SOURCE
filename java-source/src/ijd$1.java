class ijd$1 extends ipg<Float> {
   ijd$1(ijd var1, ipf var2, String var3, hsu var4, boolean var5) {
      super(var2, var3, var4, var5);
      this.mcG = var1;
   }

   public Float dW(int var1, int var2) {
      int var3 = this.mcG.dO(var1, var2);
      return (float)var3 / var1;
   }

   @Override
   public void dak() {
      ijd.a(this.mcG, (int)((Float)ijd.b(this.mcG).get() * hso.cxK().cyc().W + 0.5F));
      this.mcG.pack();
   }
}
