class hfq$1 implements lbn {
   hfq$1(hfq var1) {
      this.kjW = var1;
   }

   @Override
   public final void W() {
      double var2 = hfq.a(this.kjW).esb();
      double var4 = var2 * 5.0;
      var4 = Math.sin(var4);
      var4 = Math.abs(var4);
      float var1 = (float)var4;
      var1 *= 1.5F;
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      assert var1 >= 0.0F && var1 <= 1.0F;
      hfq.b(this.kjW).H(new lcq(1.0F, 1.0F, 1.0F, var1));
   }
}
