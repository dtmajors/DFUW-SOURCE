class lel$1 implements lbn {
   lel$1(lel var1) {
      this.riY = var1;
   }

   @Override
   public final void W() {
      assert lel.a(this.riY).isStarted();
      double var1 = lel.a(this.riY).esb();
      double var3 = lel.a(this.riY).Bw();
      assert var1 >= 0.0 && var1 <= var3;
      double var5 = var3 == 0.0 ? 1.0 : var1 / var3;
      assert var5 >= 0.0 && var5 <= 1.0;
      lel.a(this.riY, lel.b(this.riY) + (lel.c(this.riY) - lel.b(this.riY)) * var5);
      lel.d(this.riY).enp();
   }
}
