class hng$1 implements lbn {
   hng$1(hng var1) {
      this.kOp = var1;
   }

   @Override
   public final void W() {
      assert hng.a(this.kOp).isStarted();
      assert hng.b(this.kOp) != null;
      double var1 = hng.a(this.kOp).esb();
      assert var1 >= 0.0 && var1 <= hng.c(this.kOp);
      double var3 = Math.cos(var1 / hng.d(this.kOp) * Math.PI);
      assert var3 >= -1.0 && var3 <= 1.0;
      var3 = (1.0 + var3) / 2.0;
      var3 = hng.e(this.kOp) + var3 * (hng.f(this.kOp) - hng.e(this.kOp));
      assert var3 >= hng.e(this.kOp) && var3 <= hng.f(this.kOp);
      lcq var5 = new lcq(1.0F, 1.0F, 1.0F, (float)var3, true);
      hng.b(this.kOp).J(var5);
   }
}
