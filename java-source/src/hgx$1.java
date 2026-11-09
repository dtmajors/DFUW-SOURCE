class hgx$1 implements lbn {
   hgx$1(hgx var1) {
      this.kpw = var1;
   }

   @Override
   public final void W() {
      assert hgx.a(this.kpw);
      assert hgx.b(this.kpw).isStarted();
      double var1 = hgx.c(this.kpw);
      double var3 = hgx.b(this.kpw).esb();
      assert var3 >= 0.0 && var3 <= var1 : var3 + ", " + var1;
      double var5 = var3 / var1;
      assert var5 >= 0.0 && var5 <= 1.0 : var5;
      this.kpw.H(new lcq(1.0F, 1.0F, 1.0F, (float)var5));
   }
}
