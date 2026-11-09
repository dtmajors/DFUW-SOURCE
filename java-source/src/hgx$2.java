class hgx$2 implements lbn {
   hgx$2(hgx var1) {
      this.kpw = var1;
   }

   @Override
   public final void W() {
      assert hgx.a(this.kpw);
      assert hgx.d(this.kpw).isStarted();
      double var1 = hgx.e(this.kpw);
      double var3 = hgx.d(this.kpw).esb();
      assert var3 >= 0.0 && var3 <= var1 : var3 + ", " + var1;
      double var5 = 1.0 - var3 / var1;
      assert var5 >= 0.0 && var5 <= 1.0 : var5;
      this.kpw.H(new lcq(1.0F, 1.0F, 1.0F, (float)var5));
   }
}
